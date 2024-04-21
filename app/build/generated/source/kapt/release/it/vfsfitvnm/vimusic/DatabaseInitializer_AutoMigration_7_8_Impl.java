package it.vfsfitvnm.vimusic;

import androidx.annotation.NonNull;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.lang.Override;
import java.lang.SuppressWarnings;

@SuppressWarnings({"unchecked", "deprecation"})
class DatabaseInitializer_AutoMigration_7_8_Impl extends Migration {
  private final AutoMigrationSpec callback = new DatabaseInitializer.From7To8Migration();

  public DatabaseInitializer_AutoMigration_7_8_Impl() {
    super(7, 8);
  }

  @Override
  public void migrate(@NonNull final SupportSQLiteDatabase database) {
    database.execSQL("DROP VIEW SortedSongInPlaylist");
    database.execSQL("CREATE TABLE IF NOT EXISTS `_new_Song` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `albumId` TEXT, `artistsText` TEXT, `durationText` TEXT NOT NULL, `thumbnailUrl` TEXT, `lyrics` TEXT, `likedAt` INTEGER, `totalPlayTimeMs` INTEGER NOT NULL, `loudnessDb` REAL, `contentLength` INTEGER, PRIMARY KEY(`id`))");
    database.execSQL("INSERT INTO `_new_Song` (`id`,`title`,`albumId`,`artistsText`,`durationText`,`thumbnailUrl`,`lyrics`,`likedAt`,`totalPlayTimeMs`,`loudnessDb`,`contentLength`) SELECT `id`,`title`,`albumInfoId`,`artistsText`,`durationText`,`thumbnailUrl`,`lyrics`,`likedAt`,`totalPlayTimeMs`,`loudnessDb`,`contentLength` FROM `Song`");
    database.execSQL("DROP TABLE `Song`");
    database.execSQL("ALTER TABLE `_new_Song` RENAME TO `Song`");
    database.execSQL("CREATE VIEW `SortedSongInPlaylist` AS SELECT * FROM SongInPlaylist ORDER BY position");
    callback.onPostMigrate(database);
  }
}

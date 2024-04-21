package it.vfsfitvnm.vimusic;

import androidx.annotation.NonNull;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.lang.Override;
import java.lang.SuppressWarnings;

@SuppressWarnings({"unchecked", "deprecation"})
class DatabaseInitializer_AutoMigration_20_21_Impl extends Migration {
  private final AutoMigrationSpec callback = new DatabaseInitializer.From20To21Migration();

  public DatabaseInitializer_AutoMigration_20_21_Impl() {
    super(20, 21);
  }

  @Override
  public void migrate(@NonNull final SupportSQLiteDatabase database) {
    database.execSQL("DROP VIEW SortedSongPlaylistMap");
    database.execSQL("CREATE TABLE IF NOT EXISTS `_new_Artist` (`id` TEXT NOT NULL, `name` TEXT, `thumbnailUrl` TEXT, `info` TEXT, `timestamp` INTEGER, `bookmarkedAt` INTEGER, PRIMARY KEY(`id`))");
    database.execSQL("INSERT INTO `_new_Artist` (`id`,`name`,`thumbnailUrl`,`info`,`timestamp`,`bookmarkedAt`) SELECT `id`,`name`,`thumbnailUrl`,`info`,`timestamp`,`bookmarkedAt` FROM `Artist`");
    database.execSQL("DROP TABLE `Artist`");
    database.execSQL("ALTER TABLE `_new_Artist` RENAME TO `Artist`");
    database.execSQL("CREATE VIEW `SortedSongPlaylistMap` AS SELECT * FROM SongPlaylistMap ORDER BY position");
    callback.onPostMigrate(database);
  }
}

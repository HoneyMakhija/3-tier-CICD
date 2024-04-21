package it.vfsfitvnm.vimusic;

import androidx.annotation.NonNull;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.lang.Override;
import java.lang.SuppressWarnings;

@SuppressWarnings({"unchecked", "deprecation"})
class DatabaseInitializer_AutoMigration_19_20_Impl extends Migration {
  public DatabaseInitializer_AutoMigration_19_20_Impl() {
    super(19, 20);
  }

  @Override
  public void migrate(@NonNull final SupportSQLiteDatabase database) {
    database.execSQL("DROP VIEW SortedSongPlaylistMap");
    database.execSQL("CREATE TABLE IF NOT EXISTS `_new_Song` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `artistsText` TEXT, `durationText` TEXT, `thumbnailUrl` TEXT, `lyrics` TEXT, `synchronizedLyrics` TEXT, `likedAt` INTEGER, `totalPlayTimeMs` INTEGER NOT NULL, PRIMARY KEY(`id`))");
    database.execSQL("INSERT INTO `_new_Song` (`id`,`title`,`artistsText`,`durationText`,`thumbnailUrl`,`lyrics`,`synchronizedLyrics`,`likedAt`,`totalPlayTimeMs`) SELECT `id`,`title`,`artistsText`,`durationText`,`thumbnailUrl`,`lyrics`,`synchronizedLyrics`,`likedAt`,`totalPlayTimeMs` FROM `Song`");
    database.execSQL("DROP TABLE `Song`");
    database.execSQL("ALTER TABLE `_new_Song` RENAME TO `Song`");
    database.execSQL("CREATE VIEW `SortedSongPlaylistMap` AS SELECT * FROM SongPlaylistMap ORDER BY position");
  }
}

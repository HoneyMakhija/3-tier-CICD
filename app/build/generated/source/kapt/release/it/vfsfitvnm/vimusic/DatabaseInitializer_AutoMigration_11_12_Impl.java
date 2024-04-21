package it.vfsfitvnm.vimusic;

import androidx.annotation.NonNull;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.lang.Override;
import java.lang.SuppressWarnings;

@SuppressWarnings({"unchecked", "deprecation"})
class DatabaseInitializer_AutoMigration_11_12_Impl extends Migration {
  private final AutoMigrationSpec callback = new DatabaseInitializer.From11To12Migration();

  public DatabaseInitializer_AutoMigration_11_12_Impl() {
    super(11, 12);
  }

  @Override
  public void migrate(@NonNull final SupportSQLiteDatabase database) {
    database.execSQL("DROP VIEW SortedSongInPlaylist");
    database.execSQL("CREATE TABLE IF NOT EXISTS `_new_SongPlaylistMap` (`songId` TEXT NOT NULL, `playlistId` INTEGER NOT NULL, `position` INTEGER NOT NULL, PRIMARY KEY(`songId`, `playlistId`), FOREIGN KEY(`songId`) REFERENCES `Song`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`playlistId`) REFERENCES `Playlist`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
    database.execSQL("INSERT INTO `_new_SongPlaylistMap` (`songId`,`playlistId`,`position`) SELECT `songId`,`playlistId`,`position` FROM `SongInPlaylist`");
    database.execSQL("DROP TABLE `SongInPlaylist`");
    database.execSQL("ALTER TABLE `_new_SongPlaylistMap` RENAME TO `SongPlaylistMap`");
    database.execSQL("CREATE INDEX IF NOT EXISTS `index_SongPlaylistMap_songId` ON `SongPlaylistMap` (`songId`)");
    database.execSQL("CREATE INDEX IF NOT EXISTS `index_SongPlaylistMap_playlistId` ON `SongPlaylistMap` (`playlistId`)");
    DBUtil.foreignKeyCheck(database, "SongPlaylistMap");
    database.execSQL("CREATE VIEW `SortedSongPlaylistMap` AS SELECT * FROM SongPlaylistMap ORDER BY position");
    callback.onPostMigrate(database);
  }
}

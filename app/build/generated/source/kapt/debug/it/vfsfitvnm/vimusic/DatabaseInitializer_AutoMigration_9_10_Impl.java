package it.vfsfitvnm.vimusic;

import androidx.annotation.NonNull;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.lang.Override;
import java.lang.SuppressWarnings;

@SuppressWarnings({"unchecked", "deprecation"})
class DatabaseInitializer_AutoMigration_9_10_Impl extends Migration {
  public DatabaseInitializer_AutoMigration_9_10_Impl() {
    super(9, 10);
  }

  @Override
  public void migrate(@NonNull final SupportSQLiteDatabase database) {
    database.execSQL("DROP VIEW SortedSongInPlaylist");
    database.execSQL("ALTER TABLE `Artist` ADD COLUMN `shuffleVideoId` TEXT DEFAULT NULL");
    database.execSQL("ALTER TABLE `Artist` ADD COLUMN `shufflePlaylistId` TEXT DEFAULT NULL");
    database.execSQL("ALTER TABLE `Artist` ADD COLUMN `radioVideoId` TEXT DEFAULT NULL");
    database.execSQL("ALTER TABLE `Artist` ADD COLUMN `radioPlaylistId` TEXT DEFAULT NULL");
    database.execSQL("CREATE TABLE IF NOT EXISTS `SongAlbumMap` (`songId` TEXT NOT NULL, `albumId` TEXT NOT NULL, `position` INTEGER, PRIMARY KEY(`songId`, `albumId`), FOREIGN KEY(`songId`) REFERENCES `Song`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`albumId`) REFERENCES `Album`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
    database.execSQL("CREATE INDEX IF NOT EXISTS `index_SongAlbumMap_songId` ON `SongAlbumMap` (`songId`)");
    database.execSQL("CREATE INDEX IF NOT EXISTS `index_SongAlbumMap_albumId` ON `SongAlbumMap` (`albumId`)");
    database.execSQL("CREATE TABLE IF NOT EXISTS `_new_Song` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `albumId` TEXT, `artistsText` TEXT, `durationText` TEXT NOT NULL, `thumbnailUrl` TEXT, `lyrics` TEXT, `likedAt` INTEGER, `totalPlayTimeMs` INTEGER NOT NULL, `loudnessDb` REAL, `contentLength` INTEGER, PRIMARY KEY(`id`), FOREIGN KEY(`albumId`) REFERENCES `Album`(`id`) ON UPDATE NO ACTION ON DELETE SET NULL )");
    database.execSQL("INSERT INTO `_new_Song` (`id`,`title`,`albumId`,`artistsText`,`durationText`,`thumbnailUrl`,`lyrics`,`likedAt`,`totalPlayTimeMs`,`loudnessDb`,`contentLength`) SELECT `id`,`title`,`albumId`,`artistsText`,`durationText`,`thumbnailUrl`,`lyrics`,`likedAt`,`totalPlayTimeMs`,`loudnessDb`,`contentLength` FROM `Song`");
    database.execSQL("DROP TABLE `Song`");
    database.execSQL("ALTER TABLE `_new_Song` RENAME TO `Song`");
    DBUtil.foreignKeyCheck(database, "Song");
    database.execSQL("CREATE TABLE IF NOT EXISTS `_new_Album` (`id` TEXT NOT NULL, `title` TEXT, `thumbnailUrl` TEXT, `year` TEXT, `authorsText` TEXT, `shareUrl` TEXT, PRIMARY KEY(`id`))");
    database.execSQL("INSERT INTO `_new_Album` (`id`,`title`,`thumbnailUrl`,`year`,`authorsText`) SELECT `id`,`title`,`thumbnailUrl`,`year`,`authorsText` FROM `Album`");
    database.execSQL("DROP TABLE `Album`");
    database.execSQL("ALTER TABLE `_new_Album` RENAME TO `Album`");
    database.execSQL("CREATE VIEW `SortedSongInPlaylist` AS SELECT * FROM SongInPlaylist ORDER BY position");
  }
}

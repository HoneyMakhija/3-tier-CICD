package it.vfsfitvnm.vimusic;

import androidx.annotation.NonNull;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.lang.Override;
import java.lang.SuppressWarnings;

@SuppressWarnings({"unchecked", "deprecation"})
class DatabaseInitializer_AutoMigration_6_7_Impl extends Migration {
  public DatabaseInitializer_AutoMigration_6_7_Impl() {
    super(6, 7);
  }

  @Override
  public void migrate(@NonNull final SupportSQLiteDatabase database) {
    database.execSQL("DROP VIEW SortedSongInPlaylist");
    database.execSQL("ALTER TABLE `Song` ADD COLUMN `artistsText` TEXT DEFAULT NULL");
    database.execSQL("CREATE TABLE IF NOT EXISTS `Album` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `thumbnailUrl` TEXT, `year` TEXT, `authorsText` TEXT, PRIMARY KEY(`id`))");
    database.execSQL("CREATE TABLE IF NOT EXISTS `Artist` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `thumbnailUrl` TEXT, `info` TEXT, PRIMARY KEY(`id`))");
    database.execSQL("CREATE TABLE IF NOT EXISTS `SongArtistMap` (`songId` TEXT NOT NULL, `artistId` TEXT NOT NULL, PRIMARY KEY(`songId`, `artistId`), FOREIGN KEY(`songId`) REFERENCES `Song`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`artistId`) REFERENCES `Artist`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
    database.execSQL("CREATE INDEX IF NOT EXISTS `index_SongArtistMap_songId` ON `SongArtistMap` (`songId`)");
    database.execSQL("CREATE INDEX IF NOT EXISTS `index_SongArtistMap_artistId` ON `SongArtistMap` (`artistId`)");
    database.execSQL("CREATE VIEW `SortedSongInPlaylist` AS SELECT * FROM SongInPlaylist ORDER BY position");
  }
}

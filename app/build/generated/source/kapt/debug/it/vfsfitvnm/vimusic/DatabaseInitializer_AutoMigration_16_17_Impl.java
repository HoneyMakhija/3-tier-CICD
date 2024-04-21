package it.vfsfitvnm.vimusic;

import androidx.annotation.NonNull;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.lang.Override;
import java.lang.SuppressWarnings;

@SuppressWarnings({"unchecked", "deprecation"})
class DatabaseInitializer_AutoMigration_16_17_Impl extends Migration {
  public DatabaseInitializer_AutoMigration_16_17_Impl() {
    super(16, 17);
  }

  @Override
  public void migrate(@NonNull final SupportSQLiteDatabase database) {
    database.execSQL("DROP VIEW SortedSongPlaylistMap");
    database.execSQL("ALTER TABLE `Playlist` ADD COLUMN `browseId` TEXT DEFAULT NULL");
    database.execSQL("CREATE VIEW `SortedSongPlaylistMap` AS SELECT * FROM SongPlaylistMap ORDER BY position");
  }
}

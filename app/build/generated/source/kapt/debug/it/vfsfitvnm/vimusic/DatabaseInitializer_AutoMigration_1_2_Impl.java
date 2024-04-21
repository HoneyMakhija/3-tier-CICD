package it.vfsfitvnm.vimusic;

import androidx.annotation.NonNull;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.lang.Override;
import java.lang.SuppressWarnings;

@SuppressWarnings({"unchecked", "deprecation"})
class DatabaseInitializer_AutoMigration_1_2_Impl extends Migration {
  public DatabaseInitializer_AutoMigration_1_2_Impl() {
    super(1, 2);
  }

  @Override
  public void migrate(@NonNull final SupportSQLiteDatabase database) {
    database.execSQL("DROP VIEW SortedSongInPlaylist");
    database.execSQL("CREATE TABLE IF NOT EXISTS `QueuedMediaItem` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mediaItem` BLOB NOT NULL, `position` INTEGER)");
    database.execSQL("CREATE VIEW `SortedSongInPlaylist` AS SELECT * FROM SongInPlaylist ORDER BY position");
  }
}

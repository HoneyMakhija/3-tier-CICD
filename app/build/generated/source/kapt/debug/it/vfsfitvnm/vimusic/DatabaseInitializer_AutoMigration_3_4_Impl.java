package it.vfsfitvnm.vimusic;

import androidx.annotation.NonNull;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.lang.Override;
import java.lang.SuppressWarnings;

@SuppressWarnings({"unchecked", "deprecation"})
class DatabaseInitializer_AutoMigration_3_4_Impl extends Migration {
  private final AutoMigrationSpec callback = new DatabaseInitializer.From3To4Migration();

  public DatabaseInitializer_AutoMigration_3_4_Impl() {
    super(3, 4);
  }

  @Override
  public void migrate(@NonNull final SupportSQLiteDatabase database) {
    database.execSQL("DROP VIEW SortedSongInPlaylist");
    database.execSQL("DROP TABLE `QueuedMediaItem`");
    database.execSQL("CREATE VIEW `SortedSongInPlaylist` AS SELECT * FROM SongInPlaylist ORDER BY position");
    callback.onPostMigrate(database);
  }
}

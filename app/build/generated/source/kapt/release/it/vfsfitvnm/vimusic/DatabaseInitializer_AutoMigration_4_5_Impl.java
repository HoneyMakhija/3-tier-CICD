package it.vfsfitvnm.vimusic;

import androidx.annotation.NonNull;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.lang.Override;
import java.lang.SuppressWarnings;

@SuppressWarnings({"unchecked", "deprecation"})
class DatabaseInitializer_AutoMigration_4_5_Impl extends Migration {
  public DatabaseInitializer_AutoMigration_4_5_Impl() {
    super(4, 5);
  }

  @Override
  public void migrate(@NonNull final SupportSQLiteDatabase database) {
    database.execSQL("DROP VIEW SortedSongInPlaylist");
    database.execSQL("ALTER TABLE `Song` ADD COLUMN `loudnessDb` REAL DEFAULT NULL");
    database.execSQL("ALTER TABLE `Song` ADD COLUMN `contentLength` INTEGER DEFAULT NULL");
    database.execSQL("CREATE VIEW `SortedSongInPlaylist` AS SELECT * FROM SongInPlaylist ORDER BY position");
  }
}

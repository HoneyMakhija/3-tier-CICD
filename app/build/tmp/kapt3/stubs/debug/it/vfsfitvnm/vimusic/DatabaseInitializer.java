package it.vfsfitvnm.vimusic;

import java.lang.System;

@androidx.room.TypeConverters(value = {it.vfsfitvnm.vimusic.Converters.class})
@androidx.room.Database(entities = {it.vfsfitvnm.vimusic.models.Song.class, it.vfsfitvnm.vimusic.models.SongPlaylistMap.class, it.vfsfitvnm.vimusic.models.Playlist.class, it.vfsfitvnm.vimusic.models.Artist.class, it.vfsfitvnm.vimusic.models.SongArtistMap.class, it.vfsfitvnm.vimusic.models.Album.class, it.vfsfitvnm.vimusic.models.SongAlbumMap.class, it.vfsfitvnm.vimusic.models.SearchQuery.class, it.vfsfitvnm.vimusic.models.QueuedMediaItem.class, it.vfsfitvnm.vimusic.models.Format.class, it.vfsfitvnm.vimusic.models.Event.class, it.vfsfitvnm.vimusic.models.Lyrics.class}, views = {it.vfsfitvnm.vimusic.models.SortedSongPlaylistMap.class}, version = 23, exportSchema = true, autoMigrations = {@androidx.room.AutoMigration(from = 1, to = 2), @androidx.room.AutoMigration(from = 2, to = 3), @androidx.room.AutoMigration(from = 3, to = 4, spec = it.vfsfitvnm.vimusic.DatabaseInitializer.From3To4Migration.class), @androidx.room.AutoMigration(from = 4, to = 5), @androidx.room.AutoMigration(from = 5, to = 6), @androidx.room.AutoMigration(from = 6, to = 7), @androidx.room.AutoMigration(from = 7, to = 8, spec = it.vfsfitvnm.vimusic.DatabaseInitializer.From7To8Migration.class), @androidx.room.AutoMigration(from = 9, to = 10), @androidx.room.AutoMigration(from = 11, to = 12, spec = it.vfsfitvnm.vimusic.DatabaseInitializer.From11To12Migration.class), @androidx.room.AutoMigration(from = 12, to = 13), @androidx.room.AutoMigration(from = 13, to = 14), @androidx.room.AutoMigration(from = 15, to = 16), @androidx.room.AutoMigration(from = 16, to = 17), @androidx.room.AutoMigration(from = 17, to = 18), @androidx.room.AutoMigration(from = 18, to = 19), @androidx.room.AutoMigration(from = 19, to = 20), @androidx.room.AutoMigration(from = 20, to = 21, spec = it.vfsfitvnm.vimusic.DatabaseInitializer.From20To21Migration.class), @androidx.room.AutoMigration(from = 21, to = 22, spec = it.vfsfitvnm.vimusic.DatabaseInitializer.From21To22Migration.class)})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\'\u0018\u0000 \u00072\u00020\u0001:\n\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lit/vfsfitvnm/vimusic/DatabaseInitializer;", "Landroidx/room/RoomDatabase;", "()V", "database", "Lit/vfsfitvnm/vimusic/Database;", "getDatabase", "()Lit/vfsfitvnm/vimusic/Database;", "Companion", "From10To11Migration", "From11To12Migration", "From14To15Migration", "From20To21Migration", "From21To22Migration", "From22To23Migration", "From3To4Migration", "From7To8Migration", "From8To9Migration", "app_debug"})
public abstract class DatabaseInitializer extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final it.vfsfitvnm.vimusic.DatabaseInitializer.Companion Companion = null;
    public static it.vfsfitvnm.vimusic.DatabaseInitializer Instance;
    
    protected DatabaseInitializer() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract it.vfsfitvnm.vimusic.Database getDatabase();
    
    @androidx.room.DeleteTable.Entries(value = {@androidx.room.DeleteTable(tableName = "QueuedMediaItem")})
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lit/vfsfitvnm/vimusic/DatabaseInitializer$From3To4Migration;", "Landroidx/room/migration/AutoMigrationSpec;", "()V", "app_debug"})
    public static final class From3To4Migration implements androidx.room.migration.AutoMigrationSpec {
        
        public From3To4Migration() {
            super();
        }
    }
    
    @androidx.room.RenameColumn.Entries(value = {@androidx.room.RenameColumn(toColumnName = "albumId", fromColumnName = "albumInfoId", tableName = "Song")})
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lit/vfsfitvnm/vimusic/DatabaseInitializer$From7To8Migration;", "Landroidx/room/migration/AutoMigrationSpec;", "()V", "app_debug"})
    public static final class From7To8Migration implements androidx.room.migration.AutoMigrationSpec {
        
        public From7To8Migration() {
            super();
        }
    }
    
    @androidx.room.RenameTable(fromTableName = "SortedSongInPlaylist", toTableName = "SortedSongPlaylistMap")
    @androidx.room.RenameTable(fromTableName = "SongInPlaylist", toTableName = "SongPlaylistMap")
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lit/vfsfitvnm/vimusic/DatabaseInitializer$From11To12Migration;", "Landroidx/room/migration/AutoMigrationSpec;", "()V", "app_debug"})
    public static final class From11To12Migration implements androidx.room.migration.AutoMigrationSpec {
        
        public From11To12Migration() {
            super();
        }
    }
    
    @androidx.room.DeleteColumn.Entries(value = {@androidx.room.DeleteColumn(columnName = "shuffleVideoId", tableName = "Artist"), @androidx.room.DeleteColumn(columnName = "shufflePlaylistId", tableName = "Artist"), @androidx.room.DeleteColumn(columnName = "radioVideoId", tableName = "Artist"), @androidx.room.DeleteColumn(columnName = "radioPlaylistId", tableName = "Artist")})
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lit/vfsfitvnm/vimusic/DatabaseInitializer$From20To21Migration;", "Landroidx/room/migration/AutoMigrationSpec;", "()V", "app_debug"})
    public static final class From20To21Migration implements androidx.room.migration.AutoMigrationSpec {
        
        public From20To21Migration() {
            super();
        }
    }
    
    @androidx.room.DeleteColumn.Entries(value = {@androidx.room.DeleteColumn(columnName = "info", tableName = "Artist")})
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lit/vfsfitvnm/vimusic/DatabaseInitializer$From21To22Migration;", "Landroidx/room/migration/AutoMigrationSpec;", "()V", "app_debug"})
    public static final class From21To22Migration implements androidx.room.migration.AutoMigrationSpec {
        
        public From21To22Migration() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lit/vfsfitvnm/vimusic/DatabaseInitializer$From8To9Migration;", "Landroidx/room/migration/Migration;", "()V", "migrate", "", "it", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "app_debug"})
    public static final class From8To9Migration extends androidx.room.migration.Migration {
        
        public From8To9Migration() {
            super(0, 0);
        }
        
        @java.lang.Override
        public void migrate(@org.jetbrains.annotations.NotNull
        androidx.sqlite.db.SupportSQLiteDatabase it) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lit/vfsfitvnm/vimusic/DatabaseInitializer$From10To11Migration;", "Landroidx/room/migration/Migration;", "()V", "migrate", "", "it", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "app_debug"})
    public static final class From10To11Migration extends androidx.room.migration.Migration {
        
        public From10To11Migration() {
            super(0, 0);
        }
        
        @java.lang.Override
        public void migrate(@org.jetbrains.annotations.NotNull
        androidx.sqlite.db.SupportSQLiteDatabase it) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lit/vfsfitvnm/vimusic/DatabaseInitializer$From14To15Migration;", "Landroidx/room/migration/Migration;", "()V", "migrate", "", "it", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "app_debug"})
    public static final class From14To15Migration extends androidx.room.migration.Migration {
        
        public From14To15Migration() {
            super(0, 0);
        }
        
        @java.lang.Override
        public void migrate(@org.jetbrains.annotations.NotNull
        androidx.sqlite.db.SupportSQLiteDatabase it) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lit/vfsfitvnm/vimusic/DatabaseInitializer$From22To23Migration;", "Landroidx/room/migration/Migration;", "()V", "migrate", "", "it", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "app_debug"})
    public static final class From22To23Migration extends androidx.room.migration.Migration {
        
        public From22To23Migration() {
            super(0, 0);
        }
        
        @java.lang.Override
        public void migrate(@org.jetbrains.annotations.NotNull
        androidx.sqlite.db.SupportSQLiteDatabase it) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\t\u001a\u00020\nH\u0086\u0002R\u00020\u000b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u00b1\u00140\u0001\u00a8\u0006\r"}, d2 = {"Lit/vfsfitvnm/vimusic/DatabaseInitializer$Companion;", "", "()V", "Instance", "Lit/vfsfitvnm/vimusic/DatabaseInitializer;", "getInstance", "()Lit/vfsfitvnm/vimusic/DatabaseInitializer;", "setInstance", "(Lit/vfsfitvnm/vimusic/DatabaseInitializer;)V", "invoke", "", "Landroid/content/Context;", "(Landroid/content/Context;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final it.vfsfitvnm.vimusic.DatabaseInitializer getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.DatabaseInitializer p0) {
        }
        
        public final void invoke(android.content.Context $this$invoke) {
        }
    }
}
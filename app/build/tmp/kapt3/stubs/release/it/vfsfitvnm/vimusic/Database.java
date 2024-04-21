package it.vfsfitvnm.vimusic;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00e2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u0000 ~2\u00020\u0001:\u0001~J\u0018\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00032\u0006\u0010\n\u001a\u00020\u0006H\'J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a2\u0006\u0002\u0010\rJ$\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0003H\'J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0003H\'J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0003H\'J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0003H\'J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0003H\'J\u0014\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0003H\'J\u0018\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u001c\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00032\u0006\u0010\u001c\u001a\u00020\u0006H\'J$\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\b0\u00032\u0006\u0010\u000f\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0014\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\b0\u0003H\'J\u0014\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\b0\u0003H\'J\u0014\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\b0\u0003H\'J\u0014\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\b0\u0003H\'J\b\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010&\u001a\u00020$H\'J\u0010\u0010\'\u001a\u00020$2\u0006\u0010(\u001a\u00020\u0006H\'J\u0010\u0010)\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020\fH\'J\b\u0010*\u001a\u00020$H\'J\b\u0010+\u001a\u00020$H\'J\u0010\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020.H\'J\u0010\u0010,\u001a\u00020$2\u0006\u0010/\u001a\u000200H\'J\u0010\u0010,\u001a\u00020$2\u0006\u00101\u001a\u000202H\'J\u000e\u00103\u001a\b\u0012\u0004\u0012\u0002040\u0003H\'J\u0014\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003H\'J\u0018\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070\u00032\u0006\u0010(\u001a\u00020\u0006H\'J\u0018\u00108\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u00109\u001a\u00020\fH\'J&\u0010:\u001a\u00020$2\u0006\u0010;\u001a\u00020<2\u0014\b\u0002\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0>H\u0017J\u0018\u0010:\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010?\u001a\u00020@H\'J\u0010\u0010:\u001a\u00020$2\u0006\u0010A\u001a\u00020BH\'J\u0010\u0010:\u001a\u00020$2\u0006\u00106\u001a\u000207H\'J\u0010\u0010:\u001a\u00020\f2\u0006\u0010-\u001a\u00020.H\'J\u0010\u0010:\u001a\u00020$2\u0006\u0010/\u001a\u000200H\'J\u0010\u0010:\u001a\u00020\f2\u0006\u0010C\u001a\u00020\tH\'J\u0010\u0010:\u001a\u00020\f2\u0006\u0010D\u001a\u00020EH\'J\u0010\u0010:\u001a\u00020\f2\u0006\u00101\u001a\u000202H\'J$\u0010:\u001a\u00020$2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\bH\'J\u0016\u0010:\u001a\u00020$2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\bH\'J\u0016\u0010I\u001a\u00020$2\f\u0010J\u001a\b\u0012\u0004\u0012\u0002020\bH\'J\u001f\u0010K\u001a\u0002042\u0006\u0010(\u001a\u00020\u00062\b\u0010L\u001a\u0004\u0018\u00010\fH\'\u00a2\u0006\u0002\u0010MJ\u0018\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00032\u0006\u0010(\u001a\u00020\u0006H\'J\u0018\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010O0\u00032\u0006\u0010(\u001a\u00020\u0006H\'J\u0018\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Q0\u00032\u0006\u0010(\u001a\u00020\u0006H\'J \u0010R\u001a\u00020$2\u0006\u0010S\u001a\u00020\f2\u0006\u0010T\u001a\u0002042\u0006\u0010U\u001a\u000204H\'J$\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0\b0\u00032\u0006\u0010\u000f\u001a\u00020X2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0014\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0\b0\u0003H\'J\u0014\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0\b0\u0003H\'J\u0014\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0\b0\u0003H\'J\u0014\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0\b0\u0003H\'J\u0014\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0\b0\u0003H\'J\u0014\u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0\b0\u0003H\'J\u001e\u0010_\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b0\u00032\u0006\u0010\u0005\u001a\u00020\fH\'J\u0018\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010a0\u00032\u0006\u0010\u0005\u001a\u00020\fH\'J\u001c\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\b0\u00032\u0006\u0010c\u001a\u00020\u0006H\'J\u000e\u0010d\u001a\b\u0012\u0004\u0012\u0002040\u0003H\'J\u000e\u0010e\u001a\b\u0012\u0004\u0012\u00020H0\bH\'J\u0010\u0010f\u001a\u0002042\u0006\u0010g\u001a\u00020hH\'J\u001c\u0010i\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00032\u0006\u0010c\u001a\u00020\u0006H\'J\u0018\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010j\u001a\u00020k2\u0006\u0010(\u001a\u00020\u0006H\'J\u0016\u0010l\u001a\b\u0012\u0004\u0012\u00020k0\b2\u0006\u0010(\u001a\u00020\u0006H\'J$\u0010m\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00032\u0006\u0010\u000f\u001a\u00020n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0014\u0010o\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003H\'J\u0014\u0010p\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003H\'J\u0014\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003H\'J\u0014\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003H\'J\u0014\u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003H\'J\u0014\u0010t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003H\'J\u0014\u0010u\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020v0\b0\u0003H\'J\u001a\u0010w\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00032\b\b\u0002\u0010x\u001a\u00020\fH\'J\u0010\u0010y\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020\u0004H\'J\u0010\u0010y\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u001aH\'J\u0010\u0010y\u001a\u00020$2\u0006\u0010-\u001a\u00020.H\'J\u0018\u0010z\u001a\u0002042\u0006\u0010(\u001a\u00020\u00062\u0006\u0010{\u001a\u00020\u0006H\'J\u001e\u0010|\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020\u00042\f\u0010}\u001a\b\u0012\u0004\u0012\u00020@0\bH\'J\u0010\u0010|\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u001aH\'J\u0010\u0010|\u001a\u00020$2\u0006\u0010P\u001a\u00020QH\'J\u0010\u0010|\u001a\u00020$2\u0006\u0010?\u001a\u00020@H\'\u00a8\u0006\u007f"}, d2 = {"Lit/vfsfitvnm/vimusic/Database;", "", "album", "Lkotlinx/coroutines/flow/Flow;", "Lit/vfsfitvnm/vimusic/models/Album;", "id", "", "albumSongs", "", "Lit/vfsfitvnm/vimusic/models/Song;", "albumId", "albumTimestamp", "", "(Ljava/lang/String;)Ljava/lang/Long;", "albums", "sortBy", "Lit/vfsfitvnm/vimusic/enums/AlbumSortBy;", "sortOrder", "Lit/vfsfitvnm/vimusic/enums/SortOrder;", "albumsByRowIdAsc", "albumsByRowIdDesc", "albumsByTitleAsc", "albumsByTitleDesc", "albumsByYearAsc", "albumsByYearDesc", "artist", "Lit/vfsfitvnm/vimusic/models/Artist;", "artistSongs", "artistId", "artists", "Lit/vfsfitvnm/vimusic/enums/ArtistSortBy;", "artistsByNameAsc", "artistsByNameDesc", "artistsByRowIdAsc", "artistsByRowIdDesc", "checkpoint", "", "clearAlbum", "clearEvents", "clearEventsFor", "songId", "clearPlaylist", "clearQueries", "clearQueue", "delete", "playlist", "Lit/vfsfitvnm/vimusic/models/Playlist;", "searchQuery", "Lit/vfsfitvnm/vimusic/models/SearchQuery;", "songPlaylistMap", "Lit/vfsfitvnm/vimusic/models/SongPlaylistMap;", "eventsCount", "", "favorites", "format", "Lit/vfsfitvnm/vimusic/models/Format;", "incrementTotalPlayTimeMs", "addition", "insert", "mediaItem", "Landroidx/media3/common/MediaItem;", "block", "Lkotlin/Function1;", "songAlbumMap", "Lit/vfsfitvnm/vimusic/models/SongAlbumMap;", "event", "Lit/vfsfitvnm/vimusic/models/Event;", "song", "songArtistMap", "Lit/vfsfitvnm/vimusic/models/SongArtistMap;", "songArtistMaps", "queuedMediaItems", "Lit/vfsfitvnm/vimusic/models/QueuedMediaItem;", "insertSongPlaylistMaps", "songPlaylistMaps", "like", "likedAt", "(Ljava/lang/String;Ljava/lang/Long;)I", "loudnessDb", "", "lyrics", "Lit/vfsfitvnm/vimusic/models/Lyrics;", "move", "playlistId", "fromPosition", "toPosition", "playlistPreviews", "Lit/vfsfitvnm/vimusic/models/PlaylistPreview;", "Lit/vfsfitvnm/vimusic/enums/PlaylistSortBy;", "playlistPreviewsByDateAddedAsc", "playlistPreviewsByDateAddedDesc", "playlistPreviewsByDateSongCountAsc", "playlistPreviewsByDateSongCountDesc", "playlistPreviewsByNameAsc", "playlistPreviewsByNameDesc", "playlistThumbnailUrls", "playlistWithSongs", "Lit/vfsfitvnm/vimusic/models/PlaylistWithSongs;", "queries", "query", "queriesCount", "queue", "raw", "supportSQLiteQuery", "Landroidx/sqlite/db/SupportSQLiteQuery;", "search", "songAlbumInfo", "Lit/vfsfitvnm/vimusic/models/Info;", "songArtistInfo", "songs", "Lit/vfsfitvnm/vimusic/enums/SongSortBy;", "songsByPlayTimeAsc", "songsByPlayTimeDesc", "songsByRowIdAsc", "songsByRowIdDesc", "songsByTitleAsc", "songsByTitleDesc", "songsWithContentLength", "Lit/vfsfitvnm/vimusic/models/SongWithContentLength;", "trending", "now", "update", "updateDurationText", "durationText", "upsert", "songAlbumMaps", "Companion", "app_release"})
public abstract interface Database {
    @org.jetbrains.annotations.NotNull
    public static final it.vfsfitvnm.vimusic.Database.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.RewriteQueriesToDropUnusedColumns
    @androidx.room.Query(value = "SELECT * FROM Song WHERE totalPlayTimeMs > 0 ORDER BY ROWID ASC")
    @androidx.room.Transaction
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Song>> songsByRowIdAsc();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.RewriteQueriesToDropUnusedColumns
    @androidx.room.Query(value = "SELECT * FROM Song WHERE totalPlayTimeMs > 0 ORDER BY ROWID DESC")
    @androidx.room.Transaction
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Song>> songsByRowIdDesc();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.RewriteQueriesToDropUnusedColumns
    @androidx.room.Query(value = "SELECT * FROM Song WHERE totalPlayTimeMs > 0 ORDER BY title ASC")
    @androidx.room.Transaction
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Song>> songsByTitleAsc();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.RewriteQueriesToDropUnusedColumns
    @androidx.room.Query(value = "SELECT * FROM Song WHERE totalPlayTimeMs > 0 ORDER BY title DESC")
    @androidx.room.Transaction
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Song>> songsByTitleDesc();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.RewriteQueriesToDropUnusedColumns
    @androidx.room.Query(value = "SELECT * FROM Song WHERE totalPlayTimeMs > 0 ORDER BY totalPlayTimeMs ASC")
    @androidx.room.Transaction
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Song>> songsByPlayTimeAsc();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.RewriteQueriesToDropUnusedColumns
    @androidx.room.Query(value = "SELECT * FROM Song WHERE totalPlayTimeMs > 0 ORDER BY totalPlayTimeMs DESC")
    @androidx.room.Transaction
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Song>> songsByPlayTimeDesc();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Song>> songs(@org.jetbrains.annotations.NotNull
    it.vfsfitvnm.vimusic.enums.SongSortBy sortBy, @org.jetbrains.annotations.NotNull
    it.vfsfitvnm.vimusic.enums.SortOrder sortOrder);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.RewriteQueriesToDropUnusedColumns
    @androidx.room.Query(value = "SELECT * FROM Song WHERE likedAt IS NOT NULL ORDER BY likedAt DESC")
    @androidx.room.Transaction
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Song>> favorites();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM QueuedMediaItem")
    public abstract java.util.List<it.vfsfitvnm.vimusic.models.QueuedMediaItem> queue();
    
    @androidx.room.Query(value = "DELETE FROM QueuedMediaItem")
    public abstract void clearQueue();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM SearchQuery WHERE query LIKE :query ORDER BY id DESC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.SearchQuery>> queries(@org.jetbrains.annotations.NotNull
    java.lang.String query);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT COUNT (*) FROM SearchQuery")
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Integer> queriesCount();
    
    @androidx.room.Query(value = "DELETE FROM SearchQuery")
    public abstract void clearQueries();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Song WHERE id = :id")
    public abstract kotlinx.coroutines.flow.Flow<it.vfsfitvnm.vimusic.models.Song> song(@org.jetbrains.annotations.NotNull
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT likedAt FROM Song WHERE id = :songId")
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Long> likedAt(@org.jetbrains.annotations.NotNull
    java.lang.String songId);
    
    @androidx.room.Query(value = "UPDATE Song SET likedAt = :likedAt WHERE id = :songId")
    public abstract int like(@org.jetbrains.annotations.NotNull
    java.lang.String songId, @org.jetbrains.annotations.Nullable
    java.lang.Long likedAt);
    
    @androidx.room.Query(value = "UPDATE Song SET durationText = :durationText WHERE id = :songId")
    public abstract int updateDurationText(@org.jetbrains.annotations.NotNull
    java.lang.String songId, @org.jetbrains.annotations.NotNull
    java.lang.String durationText);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Lyrics WHERE songId = :songId")
    public abstract kotlinx.coroutines.flow.Flow<it.vfsfitvnm.vimusic.models.Lyrics> lyrics(@org.jetbrains.annotations.NotNull
    java.lang.String songId);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Artist WHERE id = :id")
    public abstract kotlinx.coroutines.flow.Flow<it.vfsfitvnm.vimusic.models.Artist> artist(@org.jetbrains.annotations.NotNull
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Artist WHERE bookmarkedAt IS NOT NULL ORDER BY name DESC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Artist>> artistsByNameDesc();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Artist WHERE bookmarkedAt IS NOT NULL ORDER BY name ASC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Artist>> artistsByNameAsc();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Artist WHERE bookmarkedAt IS NOT NULL ORDER BY bookmarkedAt DESC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Artist>> artistsByRowIdDesc();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Artist WHERE bookmarkedAt IS NOT NULL ORDER BY bookmarkedAt ASC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Artist>> artistsByRowIdAsc();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Artist>> artists(@org.jetbrains.annotations.NotNull
    it.vfsfitvnm.vimusic.enums.ArtistSortBy sortBy, @org.jetbrains.annotations.NotNull
    it.vfsfitvnm.vimusic.enums.SortOrder sortOrder);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Album WHERE id = :id")
    public abstract kotlinx.coroutines.flow.Flow<it.vfsfitvnm.vimusic.models.Album> album(@org.jetbrains.annotations.NotNull
    java.lang.String id);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT timestamp FROM Album WHERE id = :id")
    public abstract java.lang.Long albumTimestamp(@org.jetbrains.annotations.NotNull
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.RewriteQueriesToDropUnusedColumns
    @androidx.room.Query(value = "SELECT * FROM Song JOIN SongAlbumMap ON Song.id = SongAlbumMap.songId WHERE SongAlbumMap.albumId = :albumId AND position IS NOT NULL ORDER BY position")
    @androidx.room.Transaction
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Song>> albumSongs(@org.jetbrains.annotations.NotNull
    java.lang.String albumId);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Album WHERE bookmarkedAt IS NOT NULL ORDER BY title ASC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Album>> albumsByTitleAsc();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Album WHERE bookmarkedAt IS NOT NULL ORDER BY year ASC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Album>> albumsByYearAsc();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Album WHERE bookmarkedAt IS NOT NULL ORDER BY bookmarkedAt ASC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Album>> albumsByRowIdAsc();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Album WHERE bookmarkedAt IS NOT NULL ORDER BY title DESC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Album>> albumsByTitleDesc();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Album WHERE bookmarkedAt IS NOT NULL ORDER BY year DESC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Album>> albumsByYearDesc();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Album WHERE bookmarkedAt IS NOT NULL ORDER BY bookmarkedAt DESC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Album>> albumsByRowIdDesc();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Album>> albums(@org.jetbrains.annotations.NotNull
    it.vfsfitvnm.vimusic.enums.AlbumSortBy sortBy, @org.jetbrains.annotations.NotNull
    it.vfsfitvnm.vimusic.enums.SortOrder sortOrder);
    
    @androidx.room.Query(value = "UPDATE Song SET totalPlayTimeMs = totalPlayTimeMs + :addition WHERE id = :id")
    public abstract void incrementTotalPlayTimeMs(@org.jetbrains.annotations.NotNull
    java.lang.String id, long addition);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Playlist WHERE id = :id")
    @androidx.room.Transaction
    public abstract kotlinx.coroutines.flow.Flow<it.vfsfitvnm.vimusic.models.PlaylistWithSongs> playlistWithSongs(long id);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT id, name, (SELECT COUNT(*) FROM SongPlaylistMap WHERE playlistId = id) as songCount FROM Playlist ORDER BY name ASC")
    @androidx.room.Transaction
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.PlaylistPreview>> playlistPreviewsByNameAsc();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT id, name, (SELECT COUNT(*) FROM SongPlaylistMap WHERE playlistId = id) as songCount FROM Playlist ORDER BY ROWID ASC")
    @androidx.room.Transaction
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.PlaylistPreview>> playlistPreviewsByDateAddedAsc();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT id, name, (SELECT COUNT(*) FROM SongPlaylistMap WHERE playlistId = id) as songCount FROM Playlist ORDER BY songCount ASC")
    @androidx.room.Transaction
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.PlaylistPreview>> playlistPreviewsByDateSongCountAsc();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT id, name, (SELECT COUNT(*) FROM SongPlaylistMap WHERE playlistId = id) as songCount FROM Playlist ORDER BY name DESC")
    @androidx.room.Transaction
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.PlaylistPreview>> playlistPreviewsByNameDesc();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT id, name, (SELECT COUNT(*) FROM SongPlaylistMap WHERE playlistId = id) as songCount FROM Playlist ORDER BY ROWID DESC")
    @androidx.room.Transaction
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.PlaylistPreview>> playlistPreviewsByDateAddedDesc();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT id, name, (SELECT COUNT(*) FROM SongPlaylistMap WHERE playlistId = id) as songCount FROM Playlist ORDER BY songCount DESC")
    @androidx.room.Transaction
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.PlaylistPreview>> playlistPreviewsByDateSongCountDesc();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.PlaylistPreview>> playlistPreviews(@org.jetbrains.annotations.NotNull
    it.vfsfitvnm.vimusic.enums.PlaylistSortBy sortBy, @org.jetbrains.annotations.NotNull
    it.vfsfitvnm.vimusic.enums.SortOrder sortOrder);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT thumbnailUrl FROM Song JOIN SongPlaylistMap ON id = songId WHERE playlistId = :id ORDER BY position LIMIT 4")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<java.lang.String>> playlistThumbnailUrls(long id);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.RewriteQueriesToDropUnusedColumns
    @androidx.room.Query(value = "SELECT * FROM Song JOIN SongArtistMap ON Song.id = SongArtistMap.songId WHERE SongArtistMap.artistId = :artistId AND totalPlayTimeMs > 0 ORDER BY Song.ROWID DESC")
    @androidx.room.Transaction
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Song>> artistSongs(@org.jetbrains.annotations.NotNull
    java.lang.String artistId);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Format WHERE songId = :songId")
    public abstract kotlinx.coroutines.flow.Flow<it.vfsfitvnm.vimusic.models.Format> format(@org.jetbrains.annotations.NotNull
    java.lang.String songId);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT Song.*, contentLength FROM Song JOIN Format ON id = songId WHERE contentLength IS NOT NULL AND totalPlayTimeMs > 0 ORDER BY Song.ROWID DESC")
    @androidx.room.Transaction
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.SongWithContentLength>> songsWithContentLength();
    
    @androidx.room.Query(value = "\n        UPDATE SongPlaylistMap SET position = \n          CASE \n            WHEN position < :fromPosition THEN position + 1\n            WHEN position > :fromPosition THEN position - 1\n            ELSE :toPosition\n          END \n        WHERE playlistId = :playlistId AND position BETWEEN MIN(:fromPosition,:toPosition) and MAX(:fromPosition,:toPosition)\n    ")
    public abstract void move(long playlistId, int fromPosition, int toPosition);
    
    @androidx.room.Query(value = "DELETE FROM SongPlaylistMap WHERE playlistId = :id")
    public abstract void clearPlaylist(long id);
    
    @androidx.room.Query(value = "DELETE FROM SongAlbumMap WHERE albumId = :id")
    public abstract void clearAlbum(@org.jetbrains.annotations.NotNull
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT loudnessDb FROM Format WHERE songId = :songId")
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Float> loudnessDb(@org.jetbrains.annotations.NotNull
    java.lang.String songId);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Song WHERE title LIKE :query OR artistsText LIKE :query")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Song>> search(@org.jetbrains.annotations.NotNull
    java.lang.String query);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT albumId AS id, NULL AS name FROM SongAlbumMap WHERE songId = :songId")
    public abstract it.vfsfitvnm.vimusic.models.Info songAlbumInfo(@org.jetbrains.annotations.NotNull
    java.lang.String songId);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT id, name FROM Artist LEFT JOIN SongArtistMap ON id = artistId WHERE songId = :songId")
    public abstract java.util.List<it.vfsfitvnm.vimusic.models.Info> songArtistInfo(@org.jetbrains.annotations.NotNull
    java.lang.String songId);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.RewriteQueriesToDropUnusedColumns
    @androidx.room.Query(value = "SELECT Song.* FROM Event JOIN Song ON Song.id = songId GROUP BY songId ORDER BY SUM(CAST(playTime AS REAL) / (((:now - timestamp) / 86400000) + 1)) DESC LIMIT 1")
    @androidx.room.Transaction
    public abstract kotlinx.coroutines.flow.Flow<it.vfsfitvnm.vimusic.models.Song> trending(long now);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT COUNT (*) FROM Event")
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Integer> eventsCount();
    
    @androidx.room.Query(value = "DELETE FROM Event")
    public abstract void clearEvents();
    
    @androidx.room.Query(value = "DELETE FROM Event WHERE songId = :songId")
    public abstract void clearEventsFor(@org.jetbrains.annotations.NotNull
    java.lang.String songId);
    
    @kotlin.jvm.Throws(exceptionClasses = {android.database.SQLException.class})
    @androidx.room.Insert(onConflict = 5)
    public abstract void insert(@org.jetbrains.annotations.NotNull
    it.vfsfitvnm.vimusic.models.Event event) throws android.database.SQLException;
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insert(@org.jetbrains.annotations.NotNull
    it.vfsfitvnm.vimusic.models.Format format);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insert(@org.jetbrains.annotations.NotNull
    it.vfsfitvnm.vimusic.models.SearchQuery searchQuery);
    
    @androidx.room.Insert(onConflict = 5)
    public abstract long insert(@org.jetbrains.annotations.NotNull
    it.vfsfitvnm.vimusic.models.Playlist playlist);
    
    @androidx.room.Insert(onConflict = 5)
    public abstract long insert(@org.jetbrains.annotations.NotNull
    it.vfsfitvnm.vimusic.models.SongPlaylistMap songPlaylistMap);
    
    @androidx.room.Insert(onConflict = 3)
    public abstract long insert(@org.jetbrains.annotations.NotNull
    it.vfsfitvnm.vimusic.models.SongArtistMap songArtistMap);
    
    @androidx.room.Insert(onConflict = 5)
    public abstract long insert(@org.jetbrains.annotations.NotNull
    it.vfsfitvnm.vimusic.models.Song song);
    
    @androidx.room.Insert(onConflict = 3)
    public abstract void insert(@org.jetbrains.annotations.NotNull
    java.util.List<it.vfsfitvnm.vimusic.models.QueuedMediaItem> queuedMediaItems);
    
    @androidx.room.Insert(onConflict = 5)
    public abstract void insertSongPlaylistMaps(@org.jetbrains.annotations.NotNull
    java.util.List<it.vfsfitvnm.vimusic.models.SongPlaylistMap> songPlaylistMaps);
    
    @androidx.room.Insert(onConflict = 5)
    public abstract void insert(@org.jetbrains.annotations.NotNull
    it.vfsfitvnm.vimusic.models.Album album, @org.jetbrains.annotations.NotNull
    it.vfsfitvnm.vimusic.models.SongAlbumMap songAlbumMap);
    
    @androidx.room.Insert(onConflict = 5)
    public abstract void insert(@org.jetbrains.annotations.NotNull
    java.util.List<it.vfsfitvnm.vimusic.models.Artist> artists, @org.jetbrains.annotations.NotNull
    java.util.List<it.vfsfitvnm.vimusic.models.SongArtistMap> songArtistMaps);
    
    @androidx.room.Transaction
    public abstract void insert(@org.jetbrains.annotations.NotNull
    androidx.media3.common.MediaItem mediaItem, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super it.vfsfitvnm.vimusic.models.Song, it.vfsfitvnm.vimusic.models.Song> block);
    
    @androidx.room.Update
    public abstract void update(@org.jetbrains.annotations.NotNull
    it.vfsfitvnm.vimusic.models.Artist artist);
    
    @androidx.room.Update
    public abstract void update(@org.jetbrains.annotations.NotNull
    it.vfsfitvnm.vimusic.models.Album album);
    
    @androidx.room.Update
    public abstract void update(@org.jetbrains.annotations.NotNull
    it.vfsfitvnm.vimusic.models.Playlist playlist);
    
    @androidx.room.Upsert
    public abstract void upsert(@org.jetbrains.annotations.NotNull
    it.vfsfitvnm.vimusic.models.Lyrics lyrics);
    
    @androidx.room.Upsert
    public abstract void upsert(@org.jetbrains.annotations.NotNull
    it.vfsfitvnm.vimusic.models.Album album, @org.jetbrains.annotations.NotNull
    java.util.List<it.vfsfitvnm.vimusic.models.SongAlbumMap> songAlbumMaps);
    
    @androidx.room.Upsert
    public abstract void upsert(@org.jetbrains.annotations.NotNull
    it.vfsfitvnm.vimusic.models.SongAlbumMap songAlbumMap);
    
    @androidx.room.Upsert
    public abstract void upsert(@org.jetbrains.annotations.NotNull
    it.vfsfitvnm.vimusic.models.Artist artist);
    
    @androidx.room.Delete
    public abstract void delete(@org.jetbrains.annotations.NotNull
    it.vfsfitvnm.vimusic.models.SearchQuery searchQuery);
    
    @androidx.room.Delete
    public abstract void delete(@org.jetbrains.annotations.NotNull
    it.vfsfitvnm.vimusic.models.Playlist playlist);
    
    @androidx.room.Delete
    public abstract void delete(@org.jetbrains.annotations.NotNull
    it.vfsfitvnm.vimusic.models.SongPlaylistMap songPlaylistMap);
    
    @androidx.room.RawQuery
    public abstract int raw(@org.jetbrains.annotations.NotNull
    androidx.sqlite.db.SupportSQLiteQuery supportSQLiteQuery);
    
    public abstract void checkpoint();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull
        public static kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Song>> songs(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.Database $this, @org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.enums.SongSortBy sortBy, @org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.enums.SortOrder sortOrder) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Artist>> artists(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.Database $this, @org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.enums.ArtistSortBy sortBy, @org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.enums.SortOrder sortOrder) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Album>> albums(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.Database $this, @org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.enums.AlbumSortBy sortBy, @org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.enums.SortOrder sortOrder) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.PlaylistPreview>> playlistPreviews(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.Database $this, @org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.enums.PlaylistSortBy sortBy, @org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.enums.SortOrder sortOrder) {
            return null;
        }
        
        @androidx.room.Transaction
        public static void insert(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.Database $this, @org.jetbrains.annotations.NotNull
        androidx.media3.common.MediaItem mediaItem, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super it.vfsfitvnm.vimusic.models.Song, it.vfsfitvnm.vimusic.models.Song> block) {
        }
        
        public static void checkpoint(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.Database $this) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00e4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0097\u0001J\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00042\u0006\u0010\u000b\u001a\u00020\u0007H\u0097\u0001J\u0018\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0097\u0001\u00a2\u0006\u0002\u0010\u000eJ%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0096\u0001J\u0015\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\u0004H\u0097\u0001J\u0015\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\u0004H\u0097\u0001J\u0015\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\u0004H\u0097\u0001J\u0015\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\u0004H\u0097\u0001J\u0015\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\u0004H\u0097\u0001J\u0015\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\u0004H\u0097\u0001J\u0019\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0097\u0001J\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00042\u0006\u0010\u001d\u001a\u00020\u0007H\u0097\u0001J%\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\t0\u00042\u0006\u0010\u0010\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0096\u0001J\u0015\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\t0\u0004H\u0097\u0001J\u0015\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\t0\u0004H\u0097\u0001J\u0015\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\t0\u0004H\u0097\u0001J\u0015\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\t0\u0004H\u0097\u0001J\t\u0010$\u001a\u00020%H\u0096\u0001J\u0011\u0010&\u001a\u00020%2\u0006\u0010\u0006\u001a\u00020\u0007H\u0097\u0001J\t\u0010\'\u001a\u00020%H\u0097\u0001J\u0011\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020\u0007H\u0097\u0001J\u0011\u0010*\u001a\u00020%2\u0006\u0010\u0006\u001a\u00020\rH\u0097\u0001J\t\u0010+\u001a\u00020%H\u0097\u0001J\t\u0010,\u001a\u00020%H\u0097\u0001J\u0011\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020/H\u0097\u0001J\u0011\u0010-\u001a\u00020%2\u0006\u00100\u001a\u000201H\u0097\u0001J\u0011\u0010-\u001a\u00020%2\u0006\u00102\u001a\u000203H\u0097\u0001J\u000f\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0004H\u0097\u0001J\u0015\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0004H\u0097\u0001J\u0019\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080\u00042\u0006\u0010)\u001a\u00020\u0007H\u0097\u0001J\u0019\u00109\u001a\u00020%2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\rH\u0097\u0001J\'\u0010;\u001a\u00020%2\u0006\u0010<\u001a\u00020=2\u0014\b\u0002\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0?H\u0097\u0001J\u0019\u0010;\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010@\u001a\u00020AH\u0097\u0001J\u0011\u0010;\u001a\u00020%2\u0006\u0010B\u001a\u00020CH\u0097\u0001J\u0011\u0010;\u001a\u00020%2\u0006\u00107\u001a\u000208H\u0097\u0001J\u0011\u0010;\u001a\u00020\r2\u0006\u0010.\u001a\u00020/H\u0097\u0001J\u0011\u0010;\u001a\u00020%2\u0006\u00100\u001a\u000201H\u0097\u0001J\u0011\u0010;\u001a\u00020\r2\u0006\u0010D\u001a\u00020\nH\u0097\u0001J\u0011\u0010;\u001a\u00020\r2\u0006\u0010E\u001a\u00020FH\u0097\u0001J\u0011\u0010;\u001a\u00020\r2\u0006\u00102\u001a\u000203H\u0097\u0001J%\u0010;\u001a\u00020%2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\t2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\tH\u0097\u0001J\u0017\u0010;\u001a\u00020%2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\tH\u0097\u0001J\u0017\u0010J\u001a\u00020%2\f\u0010K\u001a\b\u0012\u0004\u0012\u0002030\tH\u0097\u0001J \u0010L\u001a\u0002052\u0006\u0010)\u001a\u00020\u00072\b\u0010M\u001a\u0004\u0018\u00010\rH\u0097\u0001\u00a2\u0006\u0002\u0010NJ\u0019\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00042\u0006\u0010)\u001a\u00020\u0007H\u0097\u0001J\u0019\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010P0\u00042\u0006\u0010)\u001a\u00020\u0007H\u0097\u0001J\u0019\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010R0\u00042\u0006\u0010)\u001a\u00020\u0007H\u0097\u0001J!\u0010S\u001a\u00020%2\u0006\u0010T\u001a\u00020\r2\u0006\u0010U\u001a\u0002052\u0006\u0010V\u001a\u000205H\u0097\u0001J%\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020X0\t0\u00042\u0006\u0010\u0010\u001a\u00020Y2\u0006\u0010\u0012\u001a\u00020\u0013H\u0096\u0001J\u0015\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020X0\t0\u0004H\u0097\u0001J\u0015\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020X0\t0\u0004H\u0097\u0001J\u0015\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020X0\t0\u0004H\u0097\u0001J\u0015\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020X0\t0\u0004H\u0097\u0001J\u0015\u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020X0\t0\u0004H\u0097\u0001J\u0015\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020X0\t0\u0004H\u0097\u0001J\u001f\u0010`\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\t0\u00042\u0006\u0010\u0006\u001a\u00020\rH\u0097\u0001J\u0019\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010b0\u00042\u0006\u0010\u0006\u001a\u00020\rH\u0097\u0001J\u001d\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\t0\u00042\u0006\u0010d\u001a\u00020\u0007H\u0097\u0001J\u000f\u0010e\u001a\b\u0012\u0004\u0012\u0002050\u0004H\u0097\u0001J\u000f\u0010f\u001a\b\u0012\u0004\u0012\u00020I0\tH\u0097\u0001J\u0011\u0010g\u001a\u0002052\u0006\u0010h\u001a\u00020iH\u0097\u0001J\u001d\u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00042\u0006\u0010d\u001a\u00020\u0007H\u0097\u0001J\u0019\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0097\u0001J\u0011\u0010k\u001a\u00020l2\u0006\u0010)\u001a\u00020\u0007H\u0097\u0001J\u0017\u0010m\u001a\b\u0012\u0004\u0012\u00020l0\t2\u0006\u0010)\u001a\u00020\u0007H\u0097\u0001J%\u0010n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00042\u0006\u0010\u0010\u001a\u00020o2\u0006\u0010\u0012\u001a\u00020\u0013H\u0096\u0001J\u0015\u0010p\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0004H\u0097\u0001J\u0015\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0004H\u0097\u0001J\u0015\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0004H\u0097\u0001J\u0015\u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0004H\u0097\u0001J\u0015\u0010t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0004H\u0097\u0001J\u0015\u0010u\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0004H\u0097\u0001J\u0015\u0010v\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020w0\t0\u0004H\u0097\u0001J\u001b\u0010x\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00042\b\b\u0002\u0010y\u001a\u00020\rH\u0097\u0001J\u0011\u0010z\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u0005H\u0097\u0001J\u0011\u0010z\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u001bH\u0097\u0001J\u0011\u0010z\u001a\u00020%2\u0006\u0010.\u001a\u00020/H\u0097\u0001J\u0019\u0010{\u001a\u0002052\u0006\u0010)\u001a\u00020\u00072\u0006\u0010|\u001a\u00020\u0007H\u0097\u0001J\u001f\u0010}\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u00052\f\u0010~\u001a\b\u0012\u0004\u0012\u00020A0\tH\u0097\u0001J\u0011\u0010}\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u001bH\u0097\u0001J\u0011\u0010}\u001a\u00020%2\u0006\u0010Q\u001a\u00020RH\u0097\u0001J\u0011\u0010}\u001a\u00020%2\u0006\u0010@\u001a\u00020AH\u0097\u0001\u00a8\u0006\u007f"}, d2 = {"Lit/vfsfitvnm/vimusic/Database$Companion;", "Lit/vfsfitvnm/vimusic/Database;", "()V", "album", "Lkotlinx/coroutines/flow/Flow;", "Lit/vfsfitvnm/vimusic/models/Album;", "id", "", "albumSongs", "", "Lit/vfsfitvnm/vimusic/models/Song;", "albumId", "albumTimestamp", "", "(Ljava/lang/String;)Ljava/lang/Long;", "albums", "sortBy", "Lit/vfsfitvnm/vimusic/enums/AlbumSortBy;", "sortOrder", "Lit/vfsfitvnm/vimusic/enums/SortOrder;", "albumsByRowIdAsc", "albumsByRowIdDesc", "albumsByTitleAsc", "albumsByTitleDesc", "albumsByYearAsc", "albumsByYearDesc", "artist", "Lit/vfsfitvnm/vimusic/models/Artist;", "artistSongs", "artistId", "artists", "Lit/vfsfitvnm/vimusic/enums/ArtistSortBy;", "artistsByNameAsc", "artistsByNameDesc", "artistsByRowIdAsc", "artistsByRowIdDesc", "checkpoint", "", "clearAlbum", "clearEvents", "clearEventsFor", "songId", "clearPlaylist", "clearQueries", "clearQueue", "delete", "playlist", "Lit/vfsfitvnm/vimusic/models/Playlist;", "searchQuery", "Lit/vfsfitvnm/vimusic/models/SearchQuery;", "songPlaylistMap", "Lit/vfsfitvnm/vimusic/models/SongPlaylistMap;", "eventsCount", "", "favorites", "format", "Lit/vfsfitvnm/vimusic/models/Format;", "incrementTotalPlayTimeMs", "addition", "insert", "mediaItem", "Landroidx/media3/common/MediaItem;", "block", "Lkotlin/Function1;", "songAlbumMap", "Lit/vfsfitvnm/vimusic/models/SongAlbumMap;", "event", "Lit/vfsfitvnm/vimusic/models/Event;", "song", "songArtistMap", "Lit/vfsfitvnm/vimusic/models/SongArtistMap;", "songArtistMaps", "queuedMediaItems", "Lit/vfsfitvnm/vimusic/models/QueuedMediaItem;", "insertSongPlaylistMaps", "songPlaylistMaps", "like", "likedAt", "(Ljava/lang/String;Ljava/lang/Long;)I", "loudnessDb", "", "lyrics", "Lit/vfsfitvnm/vimusic/models/Lyrics;", "move", "playlistId", "fromPosition", "toPosition", "playlistPreviews", "Lit/vfsfitvnm/vimusic/models/PlaylistPreview;", "Lit/vfsfitvnm/vimusic/enums/PlaylistSortBy;", "playlistPreviewsByDateAddedAsc", "playlistPreviewsByDateAddedDesc", "playlistPreviewsByDateSongCountAsc", "playlistPreviewsByDateSongCountDesc", "playlistPreviewsByNameAsc", "playlistPreviewsByNameDesc", "playlistThumbnailUrls", "playlistWithSongs", "Lit/vfsfitvnm/vimusic/models/PlaylistWithSongs;", "queries", "query", "queriesCount", "queue", "raw", "supportSQLiteQuery", "Landroidx/sqlite/db/SupportSQLiteQuery;", "search", "songAlbumInfo", "Lit/vfsfitvnm/vimusic/models/Info;", "songArtistInfo", "songs", "Lit/vfsfitvnm/vimusic/enums/SongSortBy;", "songsByPlayTimeAsc", "songsByPlayTimeDesc", "songsByRowIdAsc", "songsByRowIdDesc", "songsByTitleAsc", "songsByTitleDesc", "songsWithContentLength", "Lit/vfsfitvnm/vimusic/models/SongWithContentLength;", "trending", "now", "update", "updateDurationText", "durationText", "upsert", "songAlbumMaps", "app_release"})
    public static final class Companion implements it.vfsfitvnm.vimusic.Database {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.RewriteQueriesToDropUnusedColumns
        @androidx.room.Query(value = "SELECT * FROM Song WHERE totalPlayTimeMs > 0 ORDER BY ROWID ASC")
        @androidx.room.Transaction
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Song>> songsByRowIdAsc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.RewriteQueriesToDropUnusedColumns
        @androidx.room.Query(value = "SELECT * FROM Song WHERE totalPlayTimeMs > 0 ORDER BY ROWID DESC")
        @androidx.room.Transaction
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Song>> songsByRowIdDesc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.RewriteQueriesToDropUnusedColumns
        @androidx.room.Query(value = "SELECT * FROM Song WHERE totalPlayTimeMs > 0 ORDER BY title ASC")
        @androidx.room.Transaction
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Song>> songsByTitleAsc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.RewriteQueriesToDropUnusedColumns
        @androidx.room.Query(value = "SELECT * FROM Song WHERE totalPlayTimeMs > 0 ORDER BY title DESC")
        @androidx.room.Transaction
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Song>> songsByTitleDesc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.RewriteQueriesToDropUnusedColumns
        @androidx.room.Query(value = "SELECT * FROM Song WHERE totalPlayTimeMs > 0 ORDER BY totalPlayTimeMs ASC")
        @androidx.room.Transaction
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Song>> songsByPlayTimeAsc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.RewriteQueriesToDropUnusedColumns
        @androidx.room.Query(value = "SELECT * FROM Song WHERE totalPlayTimeMs > 0 ORDER BY totalPlayTimeMs DESC")
        @androidx.room.Transaction
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Song>> songsByPlayTimeDesc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Song>> songs(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.enums.SongSortBy sortBy, @org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.enums.SortOrder sortOrder) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.RewriteQueriesToDropUnusedColumns
        @androidx.room.Query(value = "SELECT * FROM Song WHERE likedAt IS NOT NULL ORDER BY likedAt DESC")
        @androidx.room.Transaction
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Song>> favorites() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT * FROM QueuedMediaItem")
        @java.lang.Override
        public java.util.List<it.vfsfitvnm.vimusic.models.QueuedMediaItem> queue() {
            return null;
        }
        
        @androidx.room.Query(value = "DELETE FROM QueuedMediaItem")
        @java.lang.Override
        public void clearQueue() {
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT * FROM SearchQuery WHERE query LIKE :query ORDER BY id DESC")
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.SearchQuery>> queries(@org.jetbrains.annotations.NotNull
        java.lang.String query) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT COUNT (*) FROM SearchQuery")
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.lang.Integer> queriesCount() {
            return null;
        }
        
        @androidx.room.Query(value = "DELETE FROM SearchQuery")
        @java.lang.Override
        public void clearQueries() {
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT * FROM Song WHERE id = :id")
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<it.vfsfitvnm.vimusic.models.Song> song(@org.jetbrains.annotations.NotNull
        java.lang.String id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT likedAt FROM Song WHERE id = :songId")
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.lang.Long> likedAt(@org.jetbrains.annotations.NotNull
        java.lang.String songId) {
            return null;
        }
        
        @androidx.room.Query(value = "UPDATE Song SET likedAt = :likedAt WHERE id = :songId")
        @java.lang.Override
        public int like(@org.jetbrains.annotations.NotNull
        java.lang.String songId, @org.jetbrains.annotations.Nullable
        java.lang.Long likedAt) {
            return 0;
        }
        
        @androidx.room.Query(value = "UPDATE Song SET durationText = :durationText WHERE id = :songId")
        @java.lang.Override
        public int updateDurationText(@org.jetbrains.annotations.NotNull
        java.lang.String songId, @org.jetbrains.annotations.NotNull
        java.lang.String durationText) {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT * FROM Lyrics WHERE songId = :songId")
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<it.vfsfitvnm.vimusic.models.Lyrics> lyrics(@org.jetbrains.annotations.NotNull
        java.lang.String songId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT * FROM Artist WHERE id = :id")
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<it.vfsfitvnm.vimusic.models.Artist> artist(@org.jetbrains.annotations.NotNull
        java.lang.String id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT * FROM Artist WHERE bookmarkedAt IS NOT NULL ORDER BY name DESC")
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Artist>> artistsByNameDesc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT * FROM Artist WHERE bookmarkedAt IS NOT NULL ORDER BY name ASC")
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Artist>> artistsByNameAsc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT * FROM Artist WHERE bookmarkedAt IS NOT NULL ORDER BY bookmarkedAt DESC")
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Artist>> artistsByRowIdDesc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT * FROM Artist WHERE bookmarkedAt IS NOT NULL ORDER BY bookmarkedAt ASC")
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Artist>> artistsByRowIdAsc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Artist>> artists(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.enums.ArtistSortBy sortBy, @org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.enums.SortOrder sortOrder) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT * FROM Album WHERE id = :id")
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<it.vfsfitvnm.vimusic.models.Album> album(@org.jetbrains.annotations.NotNull
        java.lang.String id) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        @androidx.room.Query(value = "SELECT timestamp FROM Album WHERE id = :id")
        @java.lang.Override
        public java.lang.Long albumTimestamp(@org.jetbrains.annotations.NotNull
        java.lang.String id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.RewriteQueriesToDropUnusedColumns
        @androidx.room.Query(value = "SELECT * FROM Song JOIN SongAlbumMap ON Song.id = SongAlbumMap.songId WHERE SongAlbumMap.albumId = :albumId AND position IS NOT NULL ORDER BY position")
        @androidx.room.Transaction
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Song>> albumSongs(@org.jetbrains.annotations.NotNull
        java.lang.String albumId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT * FROM Album WHERE bookmarkedAt IS NOT NULL ORDER BY title ASC")
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Album>> albumsByTitleAsc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT * FROM Album WHERE bookmarkedAt IS NOT NULL ORDER BY year ASC")
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Album>> albumsByYearAsc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT * FROM Album WHERE bookmarkedAt IS NOT NULL ORDER BY bookmarkedAt ASC")
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Album>> albumsByRowIdAsc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT * FROM Album WHERE bookmarkedAt IS NOT NULL ORDER BY title DESC")
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Album>> albumsByTitleDesc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT * FROM Album WHERE bookmarkedAt IS NOT NULL ORDER BY year DESC")
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Album>> albumsByYearDesc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT * FROM Album WHERE bookmarkedAt IS NOT NULL ORDER BY bookmarkedAt DESC")
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Album>> albumsByRowIdDesc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Album>> albums(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.enums.AlbumSortBy sortBy, @org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.enums.SortOrder sortOrder) {
            return null;
        }
        
        @androidx.room.Query(value = "UPDATE Song SET totalPlayTimeMs = totalPlayTimeMs + :addition WHERE id = :id")
        @java.lang.Override
        public void incrementTotalPlayTimeMs(@org.jetbrains.annotations.NotNull
        java.lang.String id, long addition) {
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT * FROM Playlist WHERE id = :id")
        @androidx.room.Transaction
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<it.vfsfitvnm.vimusic.models.PlaylistWithSongs> playlistWithSongs(long id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT id, name, (SELECT COUNT(*) FROM SongPlaylistMap WHERE playlistId = id) as songCount FROM Playlist ORDER BY name ASC")
        @androidx.room.Transaction
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.PlaylistPreview>> playlistPreviewsByNameAsc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT id, name, (SELECT COUNT(*) FROM SongPlaylistMap WHERE playlistId = id) as songCount FROM Playlist ORDER BY ROWID ASC")
        @androidx.room.Transaction
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.PlaylistPreview>> playlistPreviewsByDateAddedAsc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT id, name, (SELECT COUNT(*) FROM SongPlaylistMap WHERE playlistId = id) as songCount FROM Playlist ORDER BY songCount ASC")
        @androidx.room.Transaction
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.PlaylistPreview>> playlistPreviewsByDateSongCountAsc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT id, name, (SELECT COUNT(*) FROM SongPlaylistMap WHERE playlistId = id) as songCount FROM Playlist ORDER BY name DESC")
        @androidx.room.Transaction
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.PlaylistPreview>> playlistPreviewsByNameDesc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT id, name, (SELECT COUNT(*) FROM SongPlaylistMap WHERE playlistId = id) as songCount FROM Playlist ORDER BY ROWID DESC")
        @androidx.room.Transaction
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.PlaylistPreview>> playlistPreviewsByDateAddedDesc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT id, name, (SELECT COUNT(*) FROM SongPlaylistMap WHERE playlistId = id) as songCount FROM Playlist ORDER BY songCount DESC")
        @androidx.room.Transaction
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.PlaylistPreview>> playlistPreviewsByDateSongCountDesc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.PlaylistPreview>> playlistPreviews(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.enums.PlaylistSortBy sortBy, @org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.enums.SortOrder sortOrder) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT thumbnailUrl FROM Song JOIN SongPlaylistMap ON id = songId WHERE playlistId = :id ORDER BY position LIMIT 4")
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<java.lang.String>> playlistThumbnailUrls(long id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.RewriteQueriesToDropUnusedColumns
        @androidx.room.Query(value = "SELECT * FROM Song JOIN SongArtistMap ON Song.id = SongArtistMap.songId WHERE SongArtistMap.artistId = :artistId AND totalPlayTimeMs > 0 ORDER BY Song.ROWID DESC")
        @androidx.room.Transaction
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Song>> artistSongs(@org.jetbrains.annotations.NotNull
        java.lang.String artistId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT * FROM Format WHERE songId = :songId")
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<it.vfsfitvnm.vimusic.models.Format> format(@org.jetbrains.annotations.NotNull
        java.lang.String songId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT Song.*, contentLength FROM Song JOIN Format ON id = songId WHERE contentLength IS NOT NULL AND totalPlayTimeMs > 0 ORDER BY Song.ROWID DESC")
        @androidx.room.Transaction
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.SongWithContentLength>> songsWithContentLength() {
            return null;
        }
        
        @androidx.room.Query(value = "\n        UPDATE SongPlaylistMap SET position = \n          CASE \n            WHEN position < :fromPosition THEN position + 1\n            WHEN position > :fromPosition THEN position - 1\n            ELSE :toPosition\n          END \n        WHERE playlistId = :playlistId AND position BETWEEN MIN(:fromPosition,:toPosition) and MAX(:fromPosition,:toPosition)\n    ")
        @java.lang.Override
        public void move(long playlistId, int fromPosition, int toPosition) {
        }
        
        @androidx.room.Query(value = "DELETE FROM SongPlaylistMap WHERE playlistId = :id")
        @java.lang.Override
        public void clearPlaylist(long id) {
        }
        
        @androidx.room.Query(value = "DELETE FROM SongAlbumMap WHERE albumId = :id")
        @java.lang.Override
        public void clearAlbum(@org.jetbrains.annotations.NotNull
        java.lang.String id) {
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT loudnessDb FROM Format WHERE songId = :songId")
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.lang.Float> loudnessDb(@org.jetbrains.annotations.NotNull
        java.lang.String songId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT * FROM Song WHERE title LIKE :query OR artistsText LIKE :query")
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.util.List<it.vfsfitvnm.vimusic.models.Song>> search(@org.jetbrains.annotations.NotNull
        java.lang.String query) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT albumId AS id, NULL AS name FROM SongAlbumMap WHERE songId = :songId")
        @java.lang.Override
        public it.vfsfitvnm.vimusic.models.Info songAlbumInfo(@org.jetbrains.annotations.NotNull
        java.lang.String songId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT id, name FROM Artist LEFT JOIN SongArtistMap ON id = artistId WHERE songId = :songId")
        @java.lang.Override
        public java.util.List<it.vfsfitvnm.vimusic.models.Info> songArtistInfo(@org.jetbrains.annotations.NotNull
        java.lang.String songId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.RewriteQueriesToDropUnusedColumns
        @androidx.room.Query(value = "SELECT Song.* FROM Event JOIN Song ON Song.id = songId GROUP BY songId ORDER BY SUM(CAST(playTime AS REAL) / (((:now - timestamp) / 86400000) + 1)) DESC LIMIT 1")
        @androidx.room.Transaction
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<it.vfsfitvnm.vimusic.models.Song> trending(long now) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @androidx.room.Query(value = "SELECT COUNT (*) FROM Event")
        @java.lang.Override
        public kotlinx.coroutines.flow.Flow<java.lang.Integer> eventsCount() {
            return null;
        }
        
        @androidx.room.Query(value = "DELETE FROM Event")
        @java.lang.Override
        public void clearEvents() {
        }
        
        @androidx.room.Query(value = "DELETE FROM Event WHERE songId = :songId")
        @java.lang.Override
        public void clearEventsFor(@org.jetbrains.annotations.NotNull
        java.lang.String songId) {
        }
        
        @kotlin.jvm.Throws(exceptionClasses = {android.database.SQLException.class})
        @androidx.room.Insert(onConflict = 5)
        @java.lang.Override
        public void insert(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.models.Event event) {
        }
        
        @androidx.room.Insert(onConflict = 1)
        @java.lang.Override
        public void insert(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.models.Format format) {
        }
        
        @androidx.room.Insert(onConflict = 1)
        @java.lang.Override
        public void insert(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.models.SearchQuery searchQuery) {
        }
        
        @androidx.room.Insert(onConflict = 5)
        @java.lang.Override
        public long insert(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.models.Playlist playlist) {
            return 0L;
        }
        
        @androidx.room.Insert(onConflict = 5)
        @java.lang.Override
        public long insert(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.models.SongPlaylistMap songPlaylistMap) {
            return 0L;
        }
        
        @androidx.room.Insert(onConflict = 3)
        @java.lang.Override
        public long insert(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.models.SongArtistMap songArtistMap) {
            return 0L;
        }
        
        @androidx.room.Insert(onConflict = 5)
        @java.lang.Override
        public long insert(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.models.Song song) {
            return 0L;
        }
        
        @androidx.room.Insert(onConflict = 3)
        @java.lang.Override
        public void insert(@org.jetbrains.annotations.NotNull
        java.util.List<it.vfsfitvnm.vimusic.models.QueuedMediaItem> queuedMediaItems) {
        }
        
        @androidx.room.Insert(onConflict = 5)
        @java.lang.Override
        public void insertSongPlaylistMaps(@org.jetbrains.annotations.NotNull
        java.util.List<it.vfsfitvnm.vimusic.models.SongPlaylistMap> songPlaylistMaps) {
        }
        
        @androidx.room.Insert(onConflict = 5)
        @java.lang.Override
        public void insert(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.models.Album album, @org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.models.SongAlbumMap songAlbumMap) {
        }
        
        @androidx.room.Insert(onConflict = 5)
        @java.lang.Override
        public void insert(@org.jetbrains.annotations.NotNull
        java.util.List<it.vfsfitvnm.vimusic.models.Artist> artists, @org.jetbrains.annotations.NotNull
        java.util.List<it.vfsfitvnm.vimusic.models.SongArtistMap> songArtistMaps) {
        }
        
        @androidx.room.Transaction
        @java.lang.Override
        public void insert(@org.jetbrains.annotations.NotNull
        androidx.media3.common.MediaItem mediaItem, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super it.vfsfitvnm.vimusic.models.Song, it.vfsfitvnm.vimusic.models.Song> block) {
        }
        
        @androidx.room.Update
        @java.lang.Override
        public void update(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.models.Artist artist) {
        }
        
        @androidx.room.Update
        @java.lang.Override
        public void update(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.models.Album album) {
        }
        
        @androidx.room.Update
        @java.lang.Override
        public void update(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.models.Playlist playlist) {
        }
        
        @androidx.room.Upsert
        @java.lang.Override
        public void upsert(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.models.Lyrics lyrics) {
        }
        
        @androidx.room.Upsert
        @java.lang.Override
        public void upsert(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.models.Album album, @org.jetbrains.annotations.NotNull
        java.util.List<it.vfsfitvnm.vimusic.models.SongAlbumMap> songAlbumMaps) {
        }
        
        @androidx.room.Upsert
        @java.lang.Override
        public void upsert(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.models.SongAlbumMap songAlbumMap) {
        }
        
        @androidx.room.Upsert
        @java.lang.Override
        public void upsert(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.models.Artist artist) {
        }
        
        @androidx.room.Delete
        @java.lang.Override
        public void delete(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.models.SearchQuery searchQuery) {
        }
        
        @androidx.room.Delete
        @java.lang.Override
        public void delete(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.models.Playlist playlist) {
        }
        
        @androidx.room.Delete
        @java.lang.Override
        public void delete(@org.jetbrains.annotations.NotNull
        it.vfsfitvnm.vimusic.models.SongPlaylistMap songPlaylistMap) {
        }
        
        @androidx.room.RawQuery
        @java.lang.Override
        public int raw(@org.jetbrains.annotations.NotNull
        androidx.sqlite.db.SupportSQLiteQuery supportSQLiteQuery) {
            return 0;
        }
        
        @java.lang.Override
        public void checkpoint() {
        }
    }
}
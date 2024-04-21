package it.vfsfitvnm.vimusic.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002:;B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010 \u001a\u00020!H\u0016J$\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J(\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020%2\u0016\u0010,\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050.0-R\u00020\u0001H\u0016J\u0018\u0010/\u001a\u00020!2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0016J\u0010\u00104\u001a\u00020!2\u0006\u00105\u001a\u000201H\u0016J\u001a\u00106\u001a\n 8*\u0004\u0018\u000107072\b\b\u0001\u00109\u001a\u00020\'H\u0002R\u0015\u0010\u0004\u001a\u00020\u00058\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0015\u0010\f\u001a\u00020\u00058\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0015\u0010\u0011\u001a\u00020\u00058\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0007R\u0015\u0010\u0013\u001a\u00020\u00058\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0007R\u0015\u0010\u0015\u001a\u00020\u00058\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0007R\u0015\u0010\u0017\u001a\u00020\u00058\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0007R\u0019\u0010\u0019\u001a\u00020\u0005*\u00020\u001a8\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0019\u001a\u00020\u0005*\u00020\u001d8\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001eR\u0019\u0010\u0019\u001a\u00020\u0005*\u00020\u00108\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001f\u00a8\u0006<"}, d2 = {"Lit/vfsfitvnm/vimusic/service/PlayerMediaBrowserService;", "Landroid/service/media/MediaBrowserService;", "Landroid/content/ServiceConnection;", "()V", "albumsBrowserMediaItem", "Landroid/media/browse/MediaBrowser$MediaItem;", "getAlbumsBrowserMediaItem", "()Landroid/media/browse/MediaBrowser$MediaItem;", "bound", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "favoritesBrowserMediaItem", "getFavoritesBrowserMediaItem", "lastSongs", "", "Lit/vfsfitvnm/vimusic/models/Song;", "offlineBrowserMediaItem", "getOfflineBrowserMediaItem", "playlistsBrowserMediaItem", "getPlaylistsBrowserMediaItem", "shuffleBrowserMediaItem", "getShuffleBrowserMediaItem", "songsBrowserMediaItem", "getSongsBrowserMediaItem", "asBrowserMediaItem", "Lit/vfsfitvnm/vimusic/models/Album;", "getAsBrowserMediaItem", "(Lit/vfsfitvnm/vimusic/models/Album;)Landroid/media/browse/MediaBrowser$MediaItem;", "Lit/vfsfitvnm/vimusic/models/PlaylistPreview;", "(Lit/vfsfitvnm/vimusic/models/PlaylistPreview;)Landroid/media/browse/MediaBrowser$MediaItem;", "(Lit/vfsfitvnm/vimusic/models/Song;)Landroid/media/browse/MediaBrowser$MediaItem;", "onDestroy", "", "onGetRoot", "Landroid/service/media/MediaBrowserService$BrowserRoot;", "clientPackageName", "", "clientUid", "", "rootHints", "Landroid/os/Bundle;", "onLoadChildren", "parentId", "result", "Landroid/service/media/MediaBrowserService$Result;", "", "onServiceConnected", "className", "Landroid/content/ComponentName;", "service", "Landroid/os/IBinder;", "onServiceDisconnected", "name", "uriFor", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "id", "MediaId", "SessionCallback", "app_release"})
public final class PlayerMediaBrowserService extends android.service.media.MediaBrowserService implements android.content.ServiceConnection {
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    private java.util.List<it.vfsfitvnm.vimusic.models.Song> lastSongs;
    private boolean bound = false;
    
    public PlayerMediaBrowserService() {
        super();
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    @java.lang.Override
    public void onServiceConnected(@org.jetbrains.annotations.NotNull
    android.content.ComponentName className, @org.jetbrains.annotations.NotNull
    android.os.IBinder service) {
    }
    
    @java.lang.Override
    public void onServiceDisconnected(@org.jetbrains.annotations.NotNull
    android.content.ComponentName name) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.service.media.MediaBrowserService.BrowserRoot onGetRoot(@org.jetbrains.annotations.NotNull
    java.lang.String clientPackageName, int clientUid, @org.jetbrains.annotations.Nullable
    android.os.Bundle rootHints) {
        return null;
    }
    
    @java.lang.Override
    public void onLoadChildren(@org.jetbrains.annotations.NotNull
    java.lang.String parentId, @org.jetbrains.annotations.NotNull
    android.service.media.MediaBrowserService.Result<java.util.List<android.media.browse.MediaBrowser.MediaItem>> result) {
    }
    
    private final android.net.Uri uriFor(@androidx.annotation.DrawableRes
    int id) {
        return null;
    }
    
    private final android.media.browse.MediaBrowser.MediaItem getShuffleBrowserMediaItem() {
        return null;
    }
    
    private final android.media.browse.MediaBrowser.MediaItem getSongsBrowserMediaItem() {
        return null;
    }
    
    private final android.media.browse.MediaBrowser.MediaItem getPlaylistsBrowserMediaItem() {
        return null;
    }
    
    private final android.media.browse.MediaBrowser.MediaItem getAlbumsBrowserMediaItem() {
        return null;
    }
    
    private final android.media.browse.MediaBrowser.MediaItem getFavoritesBrowserMediaItem() {
        return null;
    }
    
    private final android.media.browse.MediaBrowser.MediaItem getOfflineBrowserMediaItem() {
        return null;
    }
    
    private final android.media.browse.MediaBrowser.MediaItem getAsBrowserMediaItem(it.vfsfitvnm.vimusic.models.Song $this$asBrowserMediaItem) {
        return null;
    }
    
    private final android.media.browse.MediaBrowser.MediaItem getAsBrowserMediaItem(it.vfsfitvnm.vimusic.models.PlaylistPreview $this$asBrowserMediaItem) {
        return null;
    }
    
    private final android.media.browse.MediaBrowser.MediaItem getAsBrowserMediaItem(it.vfsfitvnm.vimusic.models.Album $this$asBrowserMediaItem) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u001c\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lit/vfsfitvnm/vimusic/service/PlayerMediaBrowserService$SessionCallback;", "Landroid/media/session/MediaSession$Callback;", "player", "Landroidx/media3/common/Player;", "cache", "Landroidx/media3/datasource/cache/Cache;", "(Lit/vfsfitvnm/vimusic/service/PlayerMediaBrowserService;Landroidx/media3/common/Player;Landroidx/media3/datasource/cache/Cache;)V", "onPause", "", "onPlay", "onPlayFromMediaId", "mediaId", "", "extras", "Landroid/os/Bundle;", "onSeekTo", "pos", "", "onSkipToNext", "onSkipToPrevious", "onSkipToQueueItem", "id", "app_release"})
    final class SessionCallback extends android.media.session.MediaSession.Callback {
        private final androidx.media3.common.Player player = null;
        private final androidx.media3.datasource.cache.Cache cache = null;
        
        public SessionCallback(@org.jetbrains.annotations.NotNull
        androidx.media3.common.Player player, @org.jetbrains.annotations.NotNull
        androidx.media3.datasource.cache.Cache cache) {
            super();
        }
        
        @java.lang.Override
        public void onPlay() {
        }
        
        @java.lang.Override
        public void onPause() {
        }
        
        @java.lang.Override
        public void onSkipToPrevious() {
        }
        
        @java.lang.Override
        public void onSkipToNext() {
        }
        
        @java.lang.Override
        public void onSeekTo(long pos) {
        }
        
        @java.lang.Override
        public void onSkipToQueueItem(long id) {
        }
        
        @java.lang.Override
        public void onPlayFromMediaId(@org.jetbrains.annotations.Nullable
        java.lang.String mediaId, @org.jetbrains.annotations.Nullable
        android.os.Bundle extras) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lit/vfsfitvnm/vimusic/service/PlayerMediaBrowserService$MediaId;", "", "()V", "albums", "", "favorites", "offline", "playlists", "root", "shuffle", "songs", "forAlbum", "id", "forPlaylist", "", "forSong", "app_release"})
    static final class MediaId {
        @org.jetbrains.annotations.NotNull
        public static final it.vfsfitvnm.vimusic.service.PlayerMediaBrowserService.MediaId INSTANCE = null;
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String root = "root";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String songs = "songs";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String playlists = "playlists";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String albums = "albums";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String favorites = "favorites";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String offline = "offline";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String shuffle = "shuffle";
        
        private MediaId() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String forSong(@org.jetbrains.annotations.NotNull
        java.lang.String id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String forPlaylist(long id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String forAlbum(@org.jetbrains.annotations.NotNull
        java.lang.String id) {
            return null;
        }
    }
}
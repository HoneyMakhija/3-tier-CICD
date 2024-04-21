package it.vfsfitvnm.vimusic.service;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 q2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0006opqrstB\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u000209H\u0002J\b\u0010;\u001a\u00020<H\u0002J\b\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u00020@H\u0002J\b\u0010A\u001a\u00020BH\u0002J\b\u0010C\u001a\u00020@H\u0002J\b\u0010D\u001a\u00020@H\u0002J\b\u0010E\u001a\u00020@H\u0002J\b\u0010F\u001a\u00020@H\u0002J\b\u0010G\u001a\u00020@H\u0003J\b\u0010H\u001a\u00020@H\u0002J\b\u0010I\u001a\u00020@H\u0002J\n\u0010J\u001a\u0004\u0018\u00010KH\u0014J\u0012\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\u0010\u0010P\u001a\u00020@2\u0006\u0010Q\u001a\u00020RH\u0016J\b\u0010S\u001a\u00020@H\u0016J\b\u0010T\u001a\u00020@H\u0016J\u0018\u0010U\u001a\u00020@2\u0006\u0010)\u001a\u0002052\u0006\u0010V\u001a\u00020WH\u0016J\u001a\u0010X\u001a\u00020@2\b\u0010Y\u001a\u0004\u0018\u00010Z2\u0006\u0010[\u001a\u00020$H\u0016J\u0018\u0010\\\u001a\u00020@2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020`H\u0016J\u0018\u0010a\u001a\u00020@2\u0006\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020eH\u0016J\u0012\u0010f\u001a\u00020@2\b\u0010g\u001a\u0004\u0018\u00010OH\u0016J\u0018\u0010h\u001a\u00020@2\u0006\u0010i\u001a\u00020j2\u0006\u0010[\u001a\u00020$H\u0016J\b\u0010k\u001a\u00020@H\u0002J\b\u0010l\u001a\u00020@H\u0002J\b\u0010m\u001a\u00020\u0013H\u0014J\u0010\u0010n\u001a\u00020@2\u0006\u0010i\u001a\u00020jH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00060\u000bR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013@VX\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020$8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010&R\u0010\u0010\'\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010-\u001a\n /*\u0004\u0018\u00010.0.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u00104\u001a\u00020$*\u0002058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b6\u00107\u00a8\u0006u"}, d2 = {"Lit/vfsfitvnm/vimusic/service/PlayerService;", "Lit/vfsfitvnm/vimusic/utils/InvincibleService;", "Landroidx/media3/common/Player$Listener;", "Landroidx/media3/exoplayer/analytics/PlaybackStatsListener$Callback;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "()V", "audioDeviceCallback", "Landroid/media/AudioDeviceCallback;", "audioManager", "Landroid/media/AudioManager;", "binder", "Lit/vfsfitvnm/vimusic/service/PlayerService$Binder;", "bitmapProvider", "Lit/vfsfitvnm/vimusic/service/BitmapProvider;", "cache", "Landroidx/media3/datasource/cache/SimpleCache;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<set-?>", "", "isInvincibilityEnabled", "()Z", "setInvincibilityEnabled", "(Z)V", "isNotificationStarted", "isPersistentQueueEnabled", "isShowingThumbnailInLockscreen", "loudnessEnhancer", "Landroid/media/audiofx/LoudnessEnhancer;", "mediaSession", "Landroid/media/session/MediaSession;", "metadataBuilder", "Landroid/media/MediaMetadata$Builder;", "notificationActionReceiver", "Lit/vfsfitvnm/vimusic/service/PlayerService$NotificationActionReceiver;", "notificationId", "", "getNotificationId", "()I", "notificationManager", "Landroid/app/NotificationManager;", "player", "Landroidx/media3/exoplayer/ExoPlayer;", "radio", "Lit/vfsfitvnm/vimusic/utils/YouTubeRadio;", "stateBuilder", "Landroid/media/session/PlaybackState$Builder;", "kotlin.jvm.PlatformType", "timerJob", "Lit/vfsfitvnm/vimusic/utils/TimerJob;", "volumeNormalizationJob", "Lkotlinx/coroutines/Job;", "androidPlaybackState", "Landroidx/media3/common/Player;", "getAndroidPlaybackState", "(Landroidx/media3/common/Player;)I", "createCacheDataSource", "Landroidx/media3/datasource/DataSource$Factory;", "createDataSourceFactory", "createExtractorsFactory", "Landroidx/media3/extractor/ExtractorsFactory;", "createMediaSourceFactory", "Landroidx/media3/exoplayer/source/MediaSource$Factory;", "createNotificationChannel", "", "createRendersFactory", "Landroidx/media3/exoplayer/RenderersFactory;", "maybeNormalizeVolume", "maybeProcessRadio", "maybeRecoverPlaybackError", "maybeRestorePlayerQueue", "maybeResumePlaybackWhenDeviceConnected", "maybeSavePlayerQueue", "maybeShowSongCoverInLockScreen", "notification", "Landroid/app/Notification;", "onBind", "Landroid/os/Binder;", "intent", "Landroid/content/Intent;", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "onDestroy", "onEvents", "events", "Landroidx/media3/common/Player$Events;", "onMediaItemTransition", "mediaItem", "Landroidx/media3/common/MediaItem;", "reason", "onPlaybackStatsReady", "eventTime", "Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;", "playbackStats", "Landroidx/media3/exoplayer/analytics/PlaybackStats;", "onSharedPreferenceChanged", "sharedPreferences", "Landroid/content/SharedPreferences;", "key", "", "onTaskRemoved", "rootIntent", "onTimelineChanged", "timeline", "Landroidx/media3/common/Timeline;", "sendCloseEqualizerIntent", "sendOpenEqualizerIntent", "shouldBeInvincible", "updateMediaSessionQueue", "Action", "Binder", "Companion", "NotificationActionReceiver", "NotificationDismissReceiver", "SessionCallback", "app_release"})
public final class PlayerService extends it.vfsfitvnm.vimusic.utils.InvincibleService implements androidx.media3.common.Player.Listener, androidx.media3.exoplayer.analytics.PlaybackStatsListener.Callback, android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    private android.media.session.MediaSession mediaSession;
    private androidx.media3.datasource.cache.SimpleCache cache;
    private androidx.media3.exoplayer.ExoPlayer player;
    private final android.media.session.PlaybackState.Builder stateBuilder = null;
    private final android.media.MediaMetadata.Builder metadataBuilder = null;
    private android.app.NotificationManager notificationManager;
    private it.vfsfitvnm.vimusic.utils.TimerJob timerJob;
    private it.vfsfitvnm.vimusic.utils.YouTubeRadio radio;
    private it.vfsfitvnm.vimusic.service.BitmapProvider bitmapProvider;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    private kotlinx.coroutines.Job volumeNormalizationJob;
    private boolean isPersistentQueueEnabled = false;
    private boolean isShowingThumbnailInLockscreen = true;
    private boolean isInvincibilityEnabled = false;
    private android.media.AudioManager audioManager;
    private android.media.AudioDeviceCallback audioDeviceCallback;
    private android.media.audiofx.LoudnessEnhancer loudnessEnhancer;
    private final it.vfsfitvnm.vimusic.service.PlayerService.Binder binder = null;
    private boolean isNotificationStarted = false;
    private it.vfsfitvnm.vimusic.service.PlayerService.NotificationActionReceiver notificationActionReceiver;
    @org.jetbrains.annotations.NotNull
    private static final it.vfsfitvnm.vimusic.service.PlayerService.Companion Companion = null;
    @java.lang.Deprecated
    public static final int NotificationId = 1001;
    @org.jetbrains.annotations.NotNull
    @java.lang.Deprecated
    public static final java.lang.String NotificationChannelId = "default_channel_id";
    @java.lang.Deprecated
    public static final int SleepTimerNotificationId = 1002;
    @org.jetbrains.annotations.NotNull
    @java.lang.Deprecated
    public static final java.lang.String SleepTimerNotificationChannelId = "sleep_timer_channel_id";
    
    public PlayerService() {
        super();
    }
    
    @java.lang.Override
    protected boolean isInvincibilityEnabled() {
        return false;
    }
    
    public void setInvincibilityEnabled(boolean p0) {
    }
    
    @java.lang.Override
    protected int getNotificationId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.os.Binder onBind(@org.jetbrains.annotations.Nullable
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @java.lang.Override
    public void onTaskRemoved(@org.jetbrains.annotations.Nullable
    android.content.Intent rootIntent) {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    @java.lang.Override
    protected boolean shouldBeInvincible() {
        return false;
    }
    
    @java.lang.Override
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull
    android.content.res.Configuration newConfig) {
    }
    
    @java.lang.Override
    public void onPlaybackStatsReady(@org.jetbrains.annotations.NotNull
    androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, @org.jetbrains.annotations.NotNull
    androidx.media3.exoplayer.analytics.PlaybackStats playbackStats) {
    }
    
    @java.lang.Override
    public void onMediaItemTransition(@org.jetbrains.annotations.Nullable
    androidx.media3.common.MediaItem mediaItem, int reason) {
    }
    
    @java.lang.Override
    public void onTimelineChanged(@org.jetbrains.annotations.NotNull
    androidx.media3.common.Timeline timeline, int reason) {
    }
    
    private final void updateMediaSessionQueue(androidx.media3.common.Timeline timeline) {
    }
    
    private final void maybeRecoverPlaybackError() {
    }
    
    private final void maybeProcessRadio() {
    }
    
    private final void maybeSavePlayerQueue() {
    }
    
    private final void maybeRestorePlayerQueue() {
    }
    
    private final void maybeNormalizeVolume() {
    }
    
    private final void maybeShowSongCoverInLockScreen() {
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    private final void maybeResumePlaybackWhenDeviceConnected() {
    }
    
    private final void sendOpenEqualizerIntent() {
    }
    
    private final void sendCloseEqualizerIntent() {
    }
    
    private final int getAndroidPlaybackState(androidx.media3.common.Player $this$androidPlaybackState) {
        return 0;
    }
    
    @java.lang.Override
    public void onEvents(@org.jetbrains.annotations.NotNull
    androidx.media3.common.Player player, @org.jetbrains.annotations.NotNull
    androidx.media3.common.Player.Events events) {
    }
    
    @java.lang.Override
    public void onSharedPreferenceChanged(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull
    java.lang.String key) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    protected android.app.Notification notification() {
        return null;
    }
    
    private final void createNotificationChannel() {
    }
    
    private final androidx.media3.datasource.DataSource.Factory createCacheDataSource() {
        return null;
    }
    
    private final androidx.media3.datasource.DataSource.Factory createDataSourceFactory() {
        return null;
    }
    
    private final androidx.media3.exoplayer.source.MediaSource.Factory createMediaSourceFactory() {
        return null;
    }
    
    private final androidx.media3.extractor.ExtractorsFactory createExtractorsFactory() {
        return null;
    }
    
    private final androidx.media3.exoplayer.RenderersFactory createRendersFactory() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"J\u001e\u0010#\u001a\u00020\u001f2\u0016\u0010$\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0004\u0012\u00020\u001f\u0018\u00010%J\u0010\u0010\'\u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"J\u001a\u0010(\u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010)\u001a\u00020\bH\u0002J\u000e\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001bJ\u0006\u0010,\u001a\u00020\u001fR\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u001a8F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006-"}, d2 = {"Lit/vfsfitvnm/vimusic/service/PlayerService$Binder;", "Landroid/os/Binder;", "(Lit/vfsfitvnm/vimusic/service/PlayerService;)V", "cache", "Landroidx/media3/datasource/cache/Cache;", "getCache", "()Landroidx/media3/datasource/cache/Cache;", "<set-?>", "", "isLoadingRadio", "()Z", "setLoadingRadio", "(Z)V", "isLoadingRadio$delegate", "Landroidx/compose/runtime/MutableState;", "mediaSession", "Landroid/media/session/MediaSession;", "getMediaSession", "()Landroid/media/session/MediaSession;", "player", "Landroidx/media3/exoplayer/ExoPlayer;", "getPlayer", "()Landroidx/media3/exoplayer/ExoPlayer;", "radioJob", "Lkotlinx/coroutines/Job;", "sleepTimerMillisLeft", "Lkotlinx/coroutines/flow/StateFlow;", "", "getSleepTimerMillisLeft", "()Lkotlinx/coroutines/flow/StateFlow;", "cancelSleepTimer", "", "playRadio", "endpoint", "Lit/vfsfitvnm/innertube/models/NavigationEndpoint$Endpoint$Watch;", "setBitmapListener", "listener", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "setupRadio", "startRadio", "justAdd", "startSleepTimer", "delayMillis", "stopRadio", "app_release"})
    public final class Binder extends android.os.Binder {
        private kotlinx.coroutines.Job radioJob;
        @org.jetbrains.annotations.NotNull
        private final androidx.compose.runtime.MutableState isLoadingRadio$delegate = null;
        
        public Binder() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.media3.exoplayer.ExoPlayer getPlayer() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.media3.datasource.cache.Cache getCache() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.media.session.MediaSession getMediaSession() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final kotlinx.coroutines.flow.StateFlow<java.lang.Long> getSleepTimerMillisLeft() {
            return null;
        }
        
        public final boolean isLoadingRadio() {
            return false;
        }
        
        private final void setLoadingRadio(boolean p0) {
        }
        
        public final void setBitmapListener(@org.jetbrains.annotations.Nullable
        kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> listener) {
        }
        
        public final void startSleepTimer(long delayMillis) {
        }
        
        public final void cancelSleepTimer() {
        }
        
        public final void setupRadio(@org.jetbrains.annotations.Nullable
        it.vfsfitvnm.innertube.models.NavigationEndpoint.Endpoint.Watch endpoint) {
        }
        
        public final void playRadio(@org.jetbrains.annotations.Nullable
        it.vfsfitvnm.innertube.models.NavigationEndpoint.Endpoint.Watch endpoint) {
        }
        
        private final void startRadio(it.vfsfitvnm.innertube.models.NavigationEndpoint.Endpoint.Watch endpoint, boolean justAdd) {
        }
        
        public final void stopRadio() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lit/vfsfitvnm/vimusic/service/PlayerService$SessionCallback;", "Landroid/media/session/MediaSession$Callback;", "player", "Landroidx/media3/common/Player;", "(Landroidx/media3/common/Player;)V", "onPause", "", "onPlay", "onRewind", "onSeekTo", "pos", "", "onSkipToNext", "onSkipToPrevious", "onSkipToQueueItem", "id", "onStop", "app_release"})
    static final class SessionCallback extends android.media.session.MediaSession.Callback {
        private final androidx.media3.common.Player player = null;
        
        public SessionCallback(@org.jetbrains.annotations.NotNull
        androidx.media3.common.Player player) {
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
        public void onStop() {
        }
        
        @java.lang.Override
        public void onRewind() {
        }
        
        @java.lang.Override
        public void onSkipToQueueItem(long id) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lit/vfsfitvnm/vimusic/service/PlayerService$NotificationActionReceiver;", "Landroid/content/BroadcastReceiver;", "player", "Landroidx/media3/common/Player;", "(Landroidx/media3/common/Player;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_release"})
    static final class NotificationActionReceiver extends android.content.BroadcastReceiver {
        private final androidx.media3.common.Player player = null;
        
        public NotificationActionReceiver(@org.jetbrains.annotations.NotNull
        androidx.media3.common.Player player) {
            super();
        }
        
        @java.lang.Override
        public void onReceive(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        android.content.Intent intent) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lit/vfsfitvnm/vimusic/service/PlayerService$NotificationDismissReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_release"})
    public static final class NotificationDismissReceiver extends android.content.BroadcastReceiver {
        
        public NotificationDismissReceiver() {
            super();
        }
        
        @java.lang.Override
        public void onReceive(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        android.content.Intent intent) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0083@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0006\u001a\u00020\u00078Fb\u00020\b\u00f8\u0001\u0001\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0088\u0001\u0002\u00f8\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u00b1\u00140\u0001\u00a8\u0006\u0014"}, d2 = {"Lit/vfsfitvnm/vimusic/service/PlayerService$Action;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "pendingIntent", "Landroid/app/PendingIntent;", "Landroid/content/Context;", "getPendingIntent-impl", "(Ljava/lang/String;Landroid/content/Context;)Landroid/app/PendingIntent;", "getValue", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_release"})
    @kotlin.jvm.JvmInline
    static final class Action {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String value = null;
        @org.jetbrains.annotations.NotNull
        public static final it.vfsfitvnm.vimusic.service.PlayerService.Action.Companion Companion = null;
        @org.jetbrains.annotations.NotNull
        private static final java.lang.String pause = null;
        @org.jetbrains.annotations.NotNull
        private static final java.lang.String play = null;
        @org.jetbrains.annotations.NotNull
        private static final java.lang.String next = null;
        @org.jetbrains.annotations.NotNull
        private static final java.lang.String previous = null;
        
        @java.lang.Override
        public boolean equals(java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getValue() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006\u000e"}, d2 = {"Lit/vfsfitvnm/vimusic/service/PlayerService$Action$Companion;", "", "()V", "next", "Lit/vfsfitvnm/vimusic/service/PlayerService$Action;", "getNext-QQcaX48", "()Ljava/lang/String;", "Ljava/lang/String;", "pause", "getPause-QQcaX48", "play", "getPlay-QQcaX48", "previous", "getPrevious-QQcaX48", "app_release"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lit/vfsfitvnm/vimusic/service/PlayerService$Companion;", "", "()V", "NotificationChannelId", "", "NotificationId", "", "SleepTimerNotificationChannelId", "SleepTimerNotificationId", "app_release"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
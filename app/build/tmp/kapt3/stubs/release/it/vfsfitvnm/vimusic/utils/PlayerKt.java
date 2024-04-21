package it.vfsfitvnm.vimusic.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0012\u0010\u0011\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0007\u001a\u0012\u0010\u0014\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0007\u001a\u0018\u0010\u0014\u001a\u00020\u0012*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u001a\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u0007*\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017\u001a\u0012\u0010\u0018\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0007\u001a \u0010\u0019\u001a\u00020\u0012*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u001a\u001a\u00020\u001b\u001a\u0018\u0010\u001c\u001a\u00020\u0012*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u001a\n\u0010\u001d\u001a\u00020\u0012*\u00020\u0002\u001a\n\u0010\u001e\u001a\u00020\u0012*\u00020\u0002\u001a\u0012\u0010\u001f\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0007\u001a\n\u0010 \u001a\u00020\u0012*\u00020\u0002\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0015\u0010\u000b\u001a\u00020\f*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\b8\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\n\u00a8\u0006!"}, d2 = {"currentWindow", "Landroidx/media3/common/Timeline$Window;", "Landroidx/media3/common/Player;", "getCurrentWindow", "(Landroidx/media3/common/Player;)Landroidx/media3/common/Timeline$Window;", "mediaItems", "", "Landroidx/media3/common/MediaItem;", "Landroidx/media3/common/Timeline;", "getMediaItems", "(Landroidx/media3/common/Timeline;)Ljava/util/List;", "shouldBePlaying", "", "getShouldBePlaying", "(Landroidx/media3/common/Player;)Z", "windows", "getWindows", "addNext", "", "mediaItem", "enqueue", "findNextMediaItemById", "mediaId", "", "forcePlay", "forcePlayAtIndex", "mediaItemIndex", "", "forcePlayFromBeginning", "forceSeekToNext", "forceSeekToPrevious", "seamlessPlay", "shuffleQueue", "app_release"})
public final class PlayerKt {
    
    @org.jetbrains.annotations.Nullable
    public static final androidx.media3.common.Timeline.Window getCurrentWindow(@org.jetbrains.annotations.NotNull
    androidx.media3.common.Player $this$currentWindow) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<androidx.media3.common.MediaItem> getMediaItems(@org.jetbrains.annotations.NotNull
    androidx.media3.common.Timeline $this$mediaItems) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<androidx.media3.common.Timeline.Window> getWindows(@org.jetbrains.annotations.NotNull
    androidx.media3.common.Timeline $this$windows) {
        return null;
    }
    
    public static final boolean getShouldBePlaying(@org.jetbrains.annotations.NotNull
    androidx.media3.common.Player $this$shouldBePlaying) {
        return false;
    }
    
    public static final void seamlessPlay(@org.jetbrains.annotations.NotNull
    androidx.media3.common.Player $this$seamlessPlay, @org.jetbrains.annotations.NotNull
    androidx.media3.common.MediaItem mediaItem) {
    }
    
    public static final void shuffleQueue(@org.jetbrains.annotations.NotNull
    androidx.media3.common.Player $this$shuffleQueue) {
    }
    
    public static final void forcePlay(@org.jetbrains.annotations.NotNull
    androidx.media3.common.Player $this$forcePlay, @org.jetbrains.annotations.NotNull
    androidx.media3.common.MediaItem mediaItem) {
    }
    
    public static final void forcePlayAtIndex(@org.jetbrains.annotations.NotNull
    androidx.media3.common.Player $this$forcePlayAtIndex, @org.jetbrains.annotations.NotNull
    java.util.List<androidx.media3.common.MediaItem> mediaItems, int mediaItemIndex) {
    }
    
    public static final void forcePlayFromBeginning(@org.jetbrains.annotations.NotNull
    androidx.media3.common.Player $this$forcePlayFromBeginning, @org.jetbrains.annotations.NotNull
    java.util.List<androidx.media3.common.MediaItem> mediaItems) {
    }
    
    public static final void forceSeekToPrevious(@org.jetbrains.annotations.NotNull
    androidx.media3.common.Player $this$forceSeekToPrevious) {
    }
    
    public static final void forceSeekToNext(@org.jetbrains.annotations.NotNull
    androidx.media3.common.Player $this$forceSeekToNext) {
    }
    
    public static final void addNext(@org.jetbrains.annotations.NotNull
    androidx.media3.common.Player $this$addNext, @org.jetbrains.annotations.NotNull
    androidx.media3.common.MediaItem mediaItem) {
    }
    
    public static final void enqueue(@org.jetbrains.annotations.NotNull
    androidx.media3.common.Player $this$enqueue, @org.jetbrains.annotations.NotNull
    androidx.media3.common.MediaItem mediaItem) {
    }
    
    public static final void enqueue(@org.jetbrains.annotations.NotNull
    androidx.media3.common.Player $this$enqueue, @org.jetbrains.annotations.NotNull
    java.util.List<androidx.media3.common.MediaItem> mediaItems) {
    }
    
    @org.jetbrains.annotations.Nullable
    public static final androidx.media3.common.MediaItem findNextMediaItemById(@org.jetbrains.annotations.NotNull
    androidx.media3.common.Player $this$findNextMediaItemById, @org.jetbrains.annotations.NotNull
    java.lang.String mediaId) {
        return null;
    }
}
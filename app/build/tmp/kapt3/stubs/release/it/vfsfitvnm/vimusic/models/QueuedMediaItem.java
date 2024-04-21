package it.vfsfitvnm.vimusic.models;

import java.lang.System;

@androidx.room.Entity
@androidx.compose.runtime.Immutable
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0011"}, d2 = {"Lit/vfsfitvnm/vimusic/models/QueuedMediaItem;", "", "id", "", "mediaItem", "Landroidx/media3/common/MediaItem;", "position", "(JLandroidx/media3/common/MediaItem;Ljava/lang/Long;)V", "getId", "()J", "getMediaItem", "()Landroidx/media3/common/MediaItem;", "getPosition", "()Ljava/lang/Long;", "setPosition", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "app_release"})
public final class QueuedMediaItem {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(typeAffinity = 5)
    private final androidx.media3.common.MediaItem mediaItem = null;
    @org.jetbrains.annotations.Nullable
    private java.lang.Long position;
    
    public QueuedMediaItem(long id, @org.jetbrains.annotations.NotNull
    androidx.media3.common.MediaItem mediaItem, @org.jetbrains.annotations.Nullable
    java.lang.Long position) {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.media3.common.MediaItem getMediaItem() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getPosition() {
        return null;
    }
    
    public final void setPosition(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
}
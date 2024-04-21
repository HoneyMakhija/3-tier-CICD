package it.vfsfitvnm.vimusic;

import java.lang.System;

@androidx.room.TypeConverters
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007\u00a8\u0006\t"}, d2 = {"Lit/vfsfitvnm/vimusic/Converters;", "", "()V", "mediaItemFromByteArray", "Landroidx/media3/common/MediaItem;", "value", "", "mediaItemToByteArray", "mediaItem", "app_debug"})
public final class Converters {
    @org.jetbrains.annotations.NotNull
    public static final it.vfsfitvnm.vimusic.Converters INSTANCE = null;
    
    private Converters() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final androidx.media3.common.MediaItem mediaItemFromByteArray(@org.jetbrains.annotations.Nullable
    byte[] value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final byte[] mediaItemToByteArray(@org.jetbrains.annotations.Nullable
    androidx.media3.common.MediaItem mediaItem) {
        return null;
    }
}
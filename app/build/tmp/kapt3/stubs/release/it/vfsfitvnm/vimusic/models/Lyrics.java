package it.vfsfitvnm.vimusic.models;

import java.lang.System;

@androidx.room.Entity(foreignKeys = {@androidx.room.ForeignKey(entity = it.vfsfitvnm.vimusic.models.Song.class, childColumns = {"songId"}, onDelete = 5, parentColumns = {"id"})})
@androidx.compose.runtime.Immutable
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lit/vfsfitvnm/vimusic/models/Lyrics;", "", "songId", "", "fixed", "synced", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFixed", "()Ljava/lang/String;", "getSongId", "getSynced", "app_release"})
public final class Lyrics {
    @org.jetbrains.annotations.NotNull
    @androidx.room.PrimaryKey
    private final java.lang.String songId = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String fixed = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String synced = null;
    
    public Lyrics(@org.jetbrains.annotations.NotNull
    java.lang.String songId, @org.jetbrains.annotations.Nullable
    java.lang.String fixed, @org.jetbrains.annotations.Nullable
    java.lang.String synced) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSongId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFixed() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSynced() {
        return null;
    }
}
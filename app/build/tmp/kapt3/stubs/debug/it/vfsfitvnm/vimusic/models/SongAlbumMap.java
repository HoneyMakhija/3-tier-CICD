package it.vfsfitvnm.vimusic.models;

import java.lang.System;

@androidx.room.Entity(primaryKeys = {"songId", "albumId"}, foreignKeys = {@androidx.room.ForeignKey(entity = it.vfsfitvnm.vimusic.models.Song.class, childColumns = {"songId"}, onDelete = 5, parentColumns = {"id"}), @androidx.room.ForeignKey(entity = it.vfsfitvnm.vimusic.models.Album.class, childColumns = {"albumId"}, onDelete = 5, parentColumns = {"id"})})
@androidx.compose.runtime.Immutable
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lit/vfsfitvnm/vimusic/models/SongAlbumMap;", "", "songId", "", "albumId", "position", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAlbumId", "()Ljava/lang/String;", "getPosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSongId", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lit/vfsfitvnm/vimusic/models/SongAlbumMap;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class SongAlbumMap {
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(index = true)
    private final java.lang.String songId = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(index = true)
    private final java.lang.String albumId = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer position = null;
    
    @org.jetbrains.annotations.NotNull
    public final it.vfsfitvnm.vimusic.models.SongAlbumMap copy(@org.jetbrains.annotations.NotNull
    java.lang.String songId, @org.jetbrains.annotations.NotNull
    java.lang.String albumId, @org.jetbrains.annotations.Nullable
    java.lang.Integer position) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public SongAlbumMap(@org.jetbrains.annotations.NotNull
    java.lang.String songId, @org.jetbrains.annotations.NotNull
    java.lang.String albumId, @org.jetbrains.annotations.Nullable
    java.lang.Integer position) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSongId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAlbumId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getPosition() {
        return null;
    }
}
package it.vfsfitvnm.vimusic.models;

import java.lang.System;

@androidx.room.Entity(foreignKeys = {@androidx.room.ForeignKey(entity = it.vfsfitvnm.vimusic.models.Song.class, childColumns = {"songId"}, onDelete = 5, parentColumns = {"id"})})
@androidx.compose.runtime.Immutable
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010 \u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010!\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\"\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J`\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00c6\u0001\u00a2\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020\u0005H\u00d6\u0001J\t\u0010)\u001a\u00020\u0003H\u00d6\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\n\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0015\u0010\u000fR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001a\u00a8\u0006*"}, d2 = {"Lit/vfsfitvnm/vimusic/models/Format;", "", "songId", "", "itag", "", "mimeType", "bitrate", "", "contentLength", "lastModified", "loudnessDb", "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;)V", "getBitrate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getContentLength", "getItag", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLastModified", "getLoudnessDb", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getMimeType", "()Ljava/lang/String;", "getSongId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;)Lit/vfsfitvnm/vimusic/models/Format;", "equals", "", "other", "hashCode", "toString", "app_release"})
public final class Format {
    @org.jetbrains.annotations.NotNull
    @androidx.room.PrimaryKey
    private final java.lang.String songId = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer itag = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String mimeType = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Long bitrate = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Long contentLength = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Long lastModified = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Float loudnessDb = null;
    
    @org.jetbrains.annotations.NotNull
    public final it.vfsfitvnm.vimusic.models.Format copy(@org.jetbrains.annotations.NotNull
    java.lang.String songId, @org.jetbrains.annotations.Nullable
    java.lang.Integer itag, @org.jetbrains.annotations.Nullable
    java.lang.String mimeType, @org.jetbrains.annotations.Nullable
    java.lang.Long bitrate, @org.jetbrains.annotations.Nullable
    java.lang.Long contentLength, @org.jetbrains.annotations.Nullable
    java.lang.Long lastModified, @org.jetbrains.annotations.Nullable
    java.lang.Float loudnessDb) {
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
    
    public Format(@org.jetbrains.annotations.NotNull
    java.lang.String songId, @org.jetbrains.annotations.Nullable
    java.lang.Integer itag, @org.jetbrains.annotations.Nullable
    java.lang.String mimeType, @org.jetbrains.annotations.Nullable
    java.lang.Long bitrate, @org.jetbrains.annotations.Nullable
    java.lang.Long contentLength, @org.jetbrains.annotations.Nullable
    java.lang.Long lastModified, @org.jetbrains.annotations.Nullable
    java.lang.Float loudnessDb) {
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
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getItag() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMimeType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getBitrate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getContentLength() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getLastModified() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float getLoudnessDb() {
        return null;
    }
}
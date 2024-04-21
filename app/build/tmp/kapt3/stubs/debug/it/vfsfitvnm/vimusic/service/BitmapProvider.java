package it.vfsfitvnm.vimusic.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0002B0\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00040\u0006\u00a2\u0006\u0002\u0010\u000bJ$\u0010$\u001a\u00020\u001e2\b\u0010%\u001a\u0004\u0018\u00010\u00192\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001e0\u0006J\u0006\u0010\'\u001a\u00020\u0007R\u0011\u0010\f\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cRD\u0010\u001f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00062\u0016\u0010\u001d\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0006@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a2\u0001\u00020\u0001\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u00b1\u00140\u0001\u00a8\u0006("}, d2 = {"Lit/vfsfitvnm/vimusic/service/BitmapProvider;", "Landroid/content/Context;", "", "bitmapSize", "", "colorProvider", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isSystemInDarkMode", "(ILkotlin/jvm/functions/Function1;)V", "bitmap", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "defaultBitmap", "lastBitmap", "getLastBitmap", "setLastBitmap", "(Landroid/graphics/Bitmap;)V", "lastEnqueued", "Lcoil/request/Disposable;", "lastIsSystemInDarkMode", "<set-?>", "Landroid/net/Uri;", "lastUri", "getLastUri", "()Landroid/net/Uri;", "value", "", "listener", "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", "load", "uri", "onDone", "setDefaultBitmap", "app_debug"})
public final class BitmapProvider {
    private final int bitmapSize = 0;
    private final kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Integer> colorProvider = null;
    @org.jetbrains.annotations.Nullable
    private android.net.Uri lastUri;
    @org.jetbrains.annotations.Nullable
    private android.graphics.Bitmap lastBitmap;
    private boolean lastIsSystemInDarkMode = false;
    private coil.request.Disposable lastEnqueued;
    private android.graphics.Bitmap defaultBitmap;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> listener;
    
    public BitmapProvider(int bitmapSize, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, java.lang.Integer> colorProvider) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.net.Uri getLastUri() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.Bitmap getLastBitmap() {
        return null;
    }
    
    public final void setLastBitmap(@org.jetbrains.annotations.Nullable
    android.graphics.Bitmap p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.Bitmap getBitmap() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<android.graphics.Bitmap, kotlin.Unit> getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> value) {
    }
    
    public final boolean setDefaultBitmap() {
        return false;
    }
    
    public final void load(@org.jetbrains.annotations.Nullable
    android.net.Uri uri, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> onDone) {
    }
}
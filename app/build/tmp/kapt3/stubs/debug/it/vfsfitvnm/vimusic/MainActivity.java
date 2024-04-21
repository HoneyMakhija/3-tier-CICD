package it.vfsfitvnm.vimusic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001aH\u0014J\u0012\u0010\u001e\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\u0016\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000fH\u0016J\b\u0010\"\u001a\u00020\u001aH\u0014J\b\u0010#\u001a\u00020\u001aH\u0014J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020&H\u0002R7\u0010\u0007\u001a\b\u0018\u00010\u0005R\u00020\u00062\f\u0010\u0004\u001a\b\u0018\u00010\u0005R\u00020\u00068B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR,\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000fj\u0002`\u0012X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lit/vfsfitvnm/vimusic/MainActivity;", "Landroidx/activity/ComponentActivity;", "Lit/vfsfitvnm/compose/persist/PersistMapOwner;", "()V", "<set-?>", "Lit/vfsfitvnm/vimusic/service/PlayerService$Binder;", "Lit/vfsfitvnm/vimusic/service/PlayerService;", "binder", "getBinder", "()Lit/vfsfitvnm/vimusic/service/PlayerService$Binder;", "setBinder", "(Lit/vfsfitvnm/vimusic/service/PlayerService$Binder;)V", "binder$delegate", "Landroidx/compose/runtime/MutableState;", "persistMap", "Ljava/util/HashMap;", "", "", "Lit/vfsfitvnm/compose/persist/PersistMap;", "getPersistMap", "()Ljava/util/HashMap;", "setPersistMap", "(Ljava/util/HashMap;)V", "serviceConnection", "Landroid/content/ServiceConnection;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onNewIntent", "intent", "Landroid/content/Intent;", "onRetainCustomNonConfigurationInstance", "onStart", "onStop", "setSystemBarAppearance", "isDark", "", "app_debug"})
public final class MainActivity extends androidx.activity.ComponentActivity implements it.vfsfitvnm.compose.persist.PersistMapOwner {
    private final android.content.ServiceConnection serviceConnection = null;
    private final androidx.compose.runtime.MutableState binder$delegate = null;
    public java.util.HashMap<java.lang.String, java.lang.Object> persistMap;
    
    public MainActivity() {
        super();
    }
    
    private final it.vfsfitvnm.vimusic.service.PlayerService.Binder getBinder() {
        return null;
    }
    
    private final void setBinder(it.vfsfitvnm.vimusic.service.PlayerService.Binder p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.HashMap<java.lang.String, java.lang.Object> getPersistMap() {
        return null;
    }
    
    public void setPersistMap(@org.jetbrains.annotations.NotNull
    java.util.HashMap<java.lang.String, java.lang.Object> p0) {
    }
    
    @java.lang.Override
    protected void onStart() {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.foundation.ExperimentalFoundationApi.class, androidx.compose.animation.ExperimentalAnimationApi.class})
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onNewIntent(@org.jetbrains.annotations.Nullable
    android.content.Intent intent) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.HashMap<java.lang.String, java.lang.Object> onRetainCustomNonConfigurationInstance() {
        return null;
    }
    
    @java.lang.Override
    protected void onStop() {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
    
    private final void setSystemBarAppearance(boolean isDark) {
    }
}
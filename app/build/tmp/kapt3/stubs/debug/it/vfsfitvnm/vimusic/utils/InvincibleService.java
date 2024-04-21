package it.vfsfitvnm.vimusic.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\'\u0018\u00002\u00020\u0001:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\nH\u0004J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H$J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\u0012\u0010\u001b\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010\u001c\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001d\u001a\u00020\nH$R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0018\u00010\bR\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0012\u0010\f\u001a\u00020\nX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u000bR\u0012\u0010\r\u001a\u00020\u000eX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lit/vfsfitvnm/vimusic/utils/InvincibleService;", "Landroid/app/Service;", "()V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "invincibility", "Lit/vfsfitvnm/vimusic/utils/InvincibleService$Invincibility;", "isAllowedToStartForegroundServices", "", "()Z", "isInvincibilityEnabled", "notificationId", "", "getNotificationId", "()I", "makeInvincible", "", "isInvincible", "notification", "Landroid/app/Notification;", "onBind", "Landroid/os/Binder;", "intent", "Landroid/content/Intent;", "onDestroy", "onRebind", "onUnbind", "shouldBeInvincible", "Invincibility", "app_debug"})
public abstract class InvincibleService extends android.app.Service {
    @org.jetbrains.annotations.NotNull
    private final android.os.Handler handler = null;
    private it.vfsfitvnm.vimusic.utils.InvincibleService.Invincibility invincibility;
    
    public InvincibleService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected final android.os.Handler getHandler() {
        return null;
    }
    
    protected abstract boolean isInvincibilityEnabled();
    
    protected abstract int getNotificationId();
    
    private final boolean isAllowedToStartForegroundServices() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.os.Binder onBind(@org.jetbrains.annotations.Nullable
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override
    public void onRebind(@org.jetbrains.annotations.Nullable
    android.content.Intent intent) {
    }
    
    @java.lang.Override
    public boolean onUnbind(@org.jetbrains.annotations.Nullable
    android.content.Intent intent) {
        return false;
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    protected final void makeInvincible(boolean isInvincible) {
    }
    
    protected abstract boolean shouldBeInvincible();
    
    @org.jetbrains.annotations.Nullable
    protected abstract android.app.Notification notification();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J\u0006\u0010\u000f\u001a\u00020\tJ\u0006\u0010\u0010\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lit/vfsfitvnm/vimusic/utils/InvincibleService$Invincibility;", "Landroid/content/BroadcastReceiver;", "Ljava/lang/Runnable;", "(Lit/vfsfitvnm/vimusic/utils/InvincibleService;)V", "intervalMs", "", "isStarted", "", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "run", "start", "stop", "app_debug"})
    final class Invincibility extends android.content.BroadcastReceiver implements java.lang.Runnable {
        private boolean isStarted = false;
        private final long intervalMs = 30000L;
        
        public Invincibility() {
            super();
        }
        
        @java.lang.Override
        public void onReceive(@org.jetbrains.annotations.Nullable
        android.content.Context context, @org.jetbrains.annotations.Nullable
        android.content.Intent intent) {
        }
        
        @kotlin.jvm.Synchronized
        public final synchronized void start() {
        }
        
        @kotlin.jvm.Synchronized
        public final synchronized void stop() {
        }
        
        @java.lang.Override
        public void run() {
        }
    }
}
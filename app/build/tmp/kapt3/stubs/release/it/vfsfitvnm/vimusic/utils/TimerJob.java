package it.vfsfitvnm.vimusic.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH&R\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lit/vfsfitvnm/vimusic/utils/TimerJob;", "", "millisLeft", "Lkotlinx/coroutines/flow/StateFlow;", "", "getMillisLeft", "()Lkotlinx/coroutines/flow/StateFlow;", "cancel", "", "app_release"})
public abstract interface TimerJob {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.StateFlow<java.lang.Long> getMillisLeft();
    
    public abstract void cancel();
}
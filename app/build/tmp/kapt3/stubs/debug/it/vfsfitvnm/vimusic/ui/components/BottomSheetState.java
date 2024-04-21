package it.vfsfitvnm.vimusic.ui.components;

import java.lang.System;

@androidx.compose.runtime.Stable
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BH\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0006\u0010\r\u001a\u00020\u0007\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\b\u0010*\u001a\u00020\fH\u0002J\u0017\u0010*\u001a\u00020\f2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070,\u00f8\u0001\u0000J\u0006\u0010-\u001a\u00020\fJ\u0006\u0010.\u001a\u00020\fJ\u0011\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020$H\u0096\u0001JD\u00101\u001a\u00020\f2\b\b\u0002\u00102\u001a\u0002032\'\u00104\u001a#\b\u0001\u0012\u0004\u0012\u000206\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f07\u0012\u0006\u0012\u0004\u0018\u00010805\u00a2\u0006\u0002\b9H\u0096A\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010:J\b\u0010;\u001a\u00020\fH\u0002J\u0017\u0010;\u001a\u00020\f2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070,\u00f8\u0001\u0000J\u0006\u0010<\u001a\u00020\fJ\u001e\u0010=\u001a\u00020\f2\u0006\u0010>\u001a\u00020$2\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010@J\u001b\u0010A\u001a\u00020\f2\u0006\u0010\'\u001a\u00020\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\bB\u0010CR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u00020\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u00078F\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00078F\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00178FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0016\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u00178FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001b\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u00178FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001d\u0010\u0018R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001f\u001a\u00020 8F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u001b\u0010#\u001a\u00020$8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\u001a\u001a\u0004\b%\u0010\u0010R$\u0010\'\u001a\u00020\u00078FX\u0086\u0084\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b(\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006D"}, d2 = {"Lit/vfsfitvnm/vimusic/ui/components/BottomSheetState;", "Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "animatable", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/animation/core/AnimationVector1D;", "onAnchorChanged", "Lkotlin/Function1;", "", "", "collapsedBound", "(Landroidx/compose/foundation/gestures/DraggableState;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/animation/core/Animatable;Lkotlin/jvm/functions/Function1;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCollapsedBound-D9Ej5fM", "()F", "F", "dismissedBound", "getDismissedBound-D9Ej5fM", "expandedBound", "getExpandedBound-D9Ej5fM", "isCollapsed", "", "()Z", "isCollapsed$delegate", "Landroidx/compose/runtime/State;", "isDismissed", "isDismissed$delegate", "isExpanded", "isExpanded$delegate", "preUpPostDownNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getPreUpPostDownNestedScrollConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "progress", "", "getProgress", "progress$delegate", "value", "getValue-D9Ej5fM", "value$delegate", "collapse", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "collapseSoft", "dismiss", "dispatchRawDelta", "delta", "drag", "dragPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/DragScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expand", "expandSoft", "performFling", "velocity", "onDismiss", "Lkotlin/Function0;", "snapTo", "snapTo-0680j_4", "(F)V", "app_debug"})
public final class BottomSheetState implements androidx.compose.foundation.gestures.DraggableState {
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    private final androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> animatable = null;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> onAnchorChanged = null;
    private final float collapsedBound = 0.0F;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State value$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State isDismissed$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State isCollapsed$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State isExpanded$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State progress$delegate = null;
    
    private BottomSheetState(androidx.compose.foundation.gestures.DraggableState draggableState, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> animatable, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onAnchorChanged, float collapsedBound) {
        super();
    }
    
    public final boolean isDismissed() {
        return false;
    }
    
    public final boolean isCollapsed() {
        return false;
    }
    
    public final boolean isExpanded() {
        return false;
    }
    
    public final float getProgress() {
        return 0.0F;
    }
    
    public final void collapse(@org.jetbrains.annotations.NotNull
    androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.unit.Dp> animationSpec) {
    }
    
    public final void expand(@org.jetbrains.annotations.NotNull
    androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.unit.Dp> animationSpec) {
    }
    
    private final void collapse() {
    }
    
    private final void expand() {
    }
    
    public final void collapseSoft() {
    }
    
    public final void expandSoft() {
    }
    
    public final void dismiss() {
    }
    
    public final void performFling(float velocity, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.ui.input.nestedscroll.NestedScrollConnection getPreUpPostDownNestedScrollConnection() {
        return null;
    }
    
    @java.lang.Override
    public void dispatchRawDelta(float delta) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object drag(@org.jetbrains.annotations.NotNull
    androidx.compose.foundation.MutatePriority dragPriority, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.DragScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
}
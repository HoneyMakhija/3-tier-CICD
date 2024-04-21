package it.vfsfitvnm.vimusic.ui.screens.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0002\u001a\u008a\u0001\u0010\u0000\u001a\u00020\u0001\"\u0010\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u00022\u0014\b\u0004\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0014\b\u0006\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00050\b2\u0015\b\n\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f\u00a2\u0006\u0002\b\u0010H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u001a\u001a\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a\u001a\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001aQ\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f\u00a2\u0006\u0002\b\u0010H\u0007\u001a\u001a\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a\u0012\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a\b\u0010\u0019\u001a\u00020\u0001H\u0007\u001aH\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\f2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u001a\u008c\u0001\u0010\u001d\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u00022\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u001f2\u0014\b\u0004\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0014\b\u0006\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00050\b2\u0015\b\n\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f\u00a2\u0006\u0002\b\u0010H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006!"}, d2 = {"EnumValueSelectorSettingsEntry", "", "T", "", "title", "", "selectedValue", "onValueSelected", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "isEnabled", "", "valueText", "trailingContent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/String;Ljava/lang/Enum;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "ImportantSettingsDescription", "text", "SettingsDescription", "SettingsEntry", "onClick", "SettingsEntryGroupText", "SettingsGroupSpacer", "SettingsScreen", "SwitchSettingEntry", "isChecked", "onCheckedChange", "ValueSelectorSettingsEntry", "values", "", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "app_release"})
public final class SettingsScreenKt {
    
    @androidx.compose.runtime.Composable
    @androidx.compose.animation.ExperimentalAnimationApi
    @androidx.compose.foundation.ExperimentalFoundationApi
    public static final void SettingsScreen() {
    }
    
    @androidx.compose.runtime.Composable
    public static final <T extends java.lang.Object>void ValueSelectorSettingsEntry(@org.jetbrains.annotations.NotNull
    java.lang.String title, T selectedValue, @org.jetbrains.annotations.NotNull
    java.util.List<? extends T> values, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onValueSelected, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, boolean isEnabled, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super T, java.lang.String> valueText, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> trailingContent) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void SwitchSettingEntry(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String text, boolean isChecked, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onCheckedChange, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, boolean isEnabled) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void SettingsEntry(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String text, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick, boolean isEnabled, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> trailingContent) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void SettingsDescription(@org.jetbrains.annotations.NotNull
    java.lang.String text, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ImportantSettingsDescription(@org.jetbrains.annotations.NotNull
    java.lang.String text, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void SettingsEntryGroupText(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void SettingsGroupSpacer(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
}
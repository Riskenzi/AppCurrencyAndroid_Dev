package com.allerates.appforyou.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u001a\u0006\u0010\b\u001a\u00020\t\u001a\u000e\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u001a\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\r\u001a\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r\u001a\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0011\u001a\u001a\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00012\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0016\u001a\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0001\u001a\u001a\u0010\u001e\u001a\n \u0007*\u0004\u0018\u00010\u00010\u0001*\u00020\u001f2\u0006\u0010 \u001a\u00020\u001c\u001a\u0016\u0010!\u001a\u00020\u0018*\u00020\u001a2\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u0016\u001a\u0012\u0010#\u001a\u00020\u0018*\u00020$2\u0006\u0010%\u001a\u00020\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006&"}, d2 = {"BASE_URL", "", "TAG", "getTAG", "()Ljava/lang/String;", "getCryptAPI", "Lcom/allerates/appforyou/api/ICrypt;", "kotlin.jvm.PlatformType", "getDefaultRetrofit", "Lretrofit2/Retrofit;", "getUserAPI", "Lcom/allerates/appforyou/api/IUser;", "isNotExistBadChars", "", "editText", "Landroid/support/design/widget/TextInputEditText;", "isMail", "Landroid/widget/EditText;", "isPhone", "isValidJson", "json", "className", "Ljava/lang/Class;", "showToast", "", "context", "Landroid/content/Context;", "id", "", "text", "format", "", "digits", "startActivity", "activity_name", "visible", "Landroid/view/View;", "isVisible", "app_debug"})
public final class ExtensionsKt {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "karman";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "http://www.look-studio.com/wp-json/";
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getTAG() {
        return null;
    }
    
    public static final void startActivity(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.Class<?> activity_name) {
    }
    
    public static final void showToast(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int id) {
    }
    
    public static final void showToast(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final retrofit2.Retrofit getDefaultRetrofit() {
        return null;
    }
    
    public static final com.allerates.appforyou.api.IUser getUserAPI() {
        return null;
    }
    
    public static final com.allerates.appforyou.api.ICrypt getCryptAPI() {
        return null;
    }
    
    public static final void visible(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver, boolean isVisible) {
    }
    
    public static final boolean isNotExistBadChars(@org.jetbrains.annotations.NotNull()
    android.support.design.widget.TextInputEditText editText, boolean isMail) {
        return false;
    }
    
    public static final boolean isNotExistBadChars(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText, boolean isMail) {
        return false;
    }
    
    public static final boolean isPhone(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText) {
        return false;
    }
    
    public static final boolean isValidJson(@org.jetbrains.annotations.NotNull()
    java.lang.String json, @org.jetbrains.annotations.NotNull()
    java.lang.Class<?> className) {
        return false;
    }
    
    public static final java.lang.String format(double $receiver, int digits) {
        return null;
    }
}
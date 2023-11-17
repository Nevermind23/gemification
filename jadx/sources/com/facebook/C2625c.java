package com.facebook;

/* renamed from: com.facebook.c */
public enum C2625c {
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    TEST_USER(true),
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true);
    

    /* renamed from: d */
    private final boolean f8220d;

    private C2625c(boolean z) {
        this.f8220d = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo8241a() {
        return this.f8220d;
    }
}

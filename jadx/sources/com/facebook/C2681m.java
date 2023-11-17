package com.facebook;

import android.content.Intent;
import p189o0.C7357a;
import p297w4.C8769a0;
import p297w4.C8775b0;

/* renamed from: com.facebook.m */
public final class C2681m {

    /* renamed from: d */
    private static volatile C2681m f8399d;

    /* renamed from: a */
    private final C7357a f8400a;

    /* renamed from: b */
    private final C2646l f8401b;

    /* renamed from: c */
    private Profile f8402c;

    C2681m(C7357a aVar, C2646l lVar) {
        C8775b0.m32716i(aVar, "localBroadcastManager");
        C8775b0.m32716i(lVar, "profileCache");
        this.f8400a = aVar;
        this.f8401b = lVar;
    }

    /* renamed from: b */
    static C2681m m10414b() {
        if (f8399d == null) {
            synchronized (C2681m.class) {
                if (f8399d == null) {
                    f8399d = new C2681m(C7357a.m28044b(C2626d.m10134e()), new C2646l());
                }
            }
        }
        return f8399d;
    }

    /* renamed from: d */
    private void m10415d(Profile profile, Profile profile2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile2);
        this.f8400a.mo21731d(intent);
    }

    /* renamed from: f */
    private void m10416f(Profile profile, boolean z) {
        Profile profile2 = this.f8402c;
        this.f8402c = profile;
        if (z) {
            if (profile != null) {
                this.f8401b.mo8292c(profile);
            } else {
                this.f8401b.mo8290a();
            }
        }
        if (!C8769a0.m32656b(profile2, profile)) {
            m10415d(profile2, profile);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Profile mo8452a() {
        return this.f8402c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo8453c() {
        Profile b = this.f8401b.mo8291b();
        if (b == null) {
            return false;
        }
        m10416f(b, false);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo8454e(Profile profile) {
        m10416f(profile, true);
    }
}

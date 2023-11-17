package com.bumptech.glide.manager;

import android.content.Context;
import com.bumptech.glide.manager.C2559c;

/* renamed from: com.bumptech.glide.manager.e */
final class C2562e implements C2559c {

    /* renamed from: d */
    private final Context f8019d;

    /* renamed from: e */
    final C2559c.C2560a f8020e;

    C2562e(Context context, C2559c.C2560a aVar) {
        this.f8019d = context.getApplicationContext();
        this.f8020e = aVar;
    }

    /* renamed from: c */
    private void m9861c() {
        C2583u.m9930a(this.f8019d).mo8096d(this.f8020e);
    }

    /* renamed from: e */
    private void m9862e() {
        C2583u.m9930a(this.f8019d).mo8097e(this.f8020e);
    }

    /* renamed from: f */
    public void mo7279f() {
        m9862e();
    }

    /* renamed from: o */
    public void mo7289o() {
        m9861c();
    }

    public void onDestroy() {
    }
}

package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p089g4.C6224l;

/* renamed from: com.bumptech.glide.manager.a */
class C2557a implements C2569l {

    /* renamed from: d */
    private final Set f8016d = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: e */
    private boolean f8017e;

    /* renamed from: f */
    private boolean f8018f;

    C2557a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8054a() {
        this.f8018f = true;
        for (C2570m onDestroy : C6224l.m24741j(this.f8016d)) {
            onDestroy.onDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8055b() {
        this.f8017e = true;
        for (C2570m o : C6224l.m24741j(this.f8016d)) {
            o.mo7289o();
        }
    }

    /* renamed from: c */
    public void mo8049c(C2570m mVar) {
        this.f8016d.remove(mVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo8056d() {
        this.f8017e = false;
        for (C2570m f : C6224l.m24741j(this.f8016d)) {
            f.mo7279f();
        }
    }

    /* renamed from: f */
    public void mo8050f(C2570m mVar) {
        this.f8016d.add(mVar);
        if (this.f8018f) {
            mVar.onDestroy();
        } else if (this.f8017e) {
            mVar.mo7289o();
        } else {
            mVar.mo7279f();
        }
    }
}

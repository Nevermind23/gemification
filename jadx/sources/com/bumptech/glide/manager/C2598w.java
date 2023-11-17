package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p050d4.C5825i;
import p089g4.C6224l;

/* renamed from: com.bumptech.glide.manager.w */
public final class C2598w implements C2570m {

    /* renamed from: d */
    private final Set f8082d = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c */
    public void mo8118c() {
        this.f8082d.clear();
    }

    /* renamed from: e */
    public List mo8119e() {
        return C6224l.m24741j(this.f8082d);
    }

    /* renamed from: f */
    public void mo7279f() {
        for (C5825i f : C6224l.m24741j(this.f8082d)) {
            f.mo7279f();
        }
    }

    /* renamed from: l */
    public void mo8120l(C5825i iVar) {
        this.f8082d.add(iVar);
    }

    /* renamed from: m */
    public void mo8121m(C5825i iVar) {
        this.f8082d.remove(iVar);
    }

    /* renamed from: o */
    public void mo7289o() {
        for (C5825i o : C6224l.m24741j(this.f8082d)) {
            o.mo7289o();
        }
    }

    public void onDestroy() {
        for (C5825i onDestroy : C6224l.m24741j(this.f8082d)) {
            onDestroy.onDestroy();
        }
    }
}

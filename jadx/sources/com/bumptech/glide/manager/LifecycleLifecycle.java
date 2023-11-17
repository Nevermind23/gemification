package com.bumptech.glide.manager;

import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1616p;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1646z;
import java.util.HashSet;
import java.util.Set;
import p089g4.C6224l;

final class LifecycleLifecycle implements C2569l, C1616p {

    /* renamed from: d */
    private final Set f8014d = new HashSet();

    /* renamed from: e */
    private final C1593j f8015e;

    LifecycleLifecycle(C1593j jVar) {
        this.f8015e = jVar;
        jVar.mo4906a(this);
    }

    /* renamed from: c */
    public void mo8049c(C2570m mVar) {
        this.f8014d.remove(mVar);
    }

    /* renamed from: f */
    public void mo8050f(C2570m mVar) {
        this.f8014d.add(mVar);
        if (this.f8015e.mo4907b() == C1593j.C1598b.DESTROYED) {
            mVar.onDestroy();
        } else if (this.f8015e.mo4907b().mo4914b(C1593j.C1598b.STARTED)) {
            mVar.mo7289o();
        } else {
            mVar.mo7279f();
        }
    }

    @C1646z(C1593j.C1594a.ON_DESTROY)
    public void onDestroy(C1619q qVar) {
        for (C2570m onDestroy : C6224l.m24741j(this.f8014d)) {
            onDestroy.onDestroy();
        }
        qVar.getLifecycle().mo4909d(this);
    }

    @C1646z(C1593j.C1594a.ON_START)
    public void onStart(C1619q qVar) {
        for (C2570m o : C6224l.m24741j(this.f8014d)) {
            o.mo7289o();
        }
    }

    @C1646z(C1593j.C1594a.ON_STOP)
    public void onStop(C1619q qVar) {
        for (C2570m f : C6224l.m24741j(this.f8014d)) {
            f.mo7279f();
        }
    }
}

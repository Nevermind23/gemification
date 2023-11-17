package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;
import p156l6.C6964r;

/* renamed from: com.google.android.gms.common.api.internal.h0 */
abstract class C3894h0 {

    /* renamed from: a */
    private final C6964r f12433a;

    protected C3894h0(C6964r rVar) {
        this.f12433a = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo12082a();

    /* renamed from: b */
    public final void mo12083b(C3900j0 j0Var) {
        Lock i;
        j0Var.f12455b.lock();
        try {
            if (j0Var.f12465l != this.f12433a) {
                i = j0Var.f12455b;
            } else {
                mo12082a();
                i = j0Var.f12455b;
            }
            i.unlock();
        } catch (Throwable th) {
            j0Var.f12455b.unlock();
            throw th;
        }
    }
}

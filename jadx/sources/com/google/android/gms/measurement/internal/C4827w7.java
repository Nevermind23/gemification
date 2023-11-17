package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p182n6.C7264i;
import p248s7.C8252f;

/* renamed from: com.google.android.gms.measurement.internal.w7 */
final class C4827w7 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ AtomicReference f14991d;

    /* renamed from: e */
    final /* synthetic */ String f14992e;

    /* renamed from: f */
    final /* synthetic */ String f14993f;

    /* renamed from: g */
    final /* synthetic */ zzq f14994g;

    /* renamed from: h */
    final /* synthetic */ C4641f8 f14995h;

    C4827w7(C4641f8 f8Var, AtomicReference atomicReference, String str, String str2, String str3, zzq zzq) {
        this.f14995h = f8Var;
        this.f14991d = atomicReference;
        this.f14992e = str2;
        this.f14993f = str3;
        this.f14994g = zzq;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f14991d) {
            try {
                C4641f8 f8Var = this.f14995h;
                C8252f H = f8Var.f14433d;
                if (H == null) {
                    f8Var.f14613a.mo14551d().mo14675r().mo14618d("(legacy) Failed to get conditional properties; not connected to service", (Object) null, this.f14992e, this.f14993f);
                    this.f14991d.set(Collections.emptyList());
                    this.f14991d.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    C7264i.m27902k(this.f14994g);
                    this.f14991d.set(H.mo14426W1(this.f14992e, this.f14993f, this.f14994g));
                } else {
                    this.f14991d.set(H.mo14421B1((String) null, this.f14992e, this.f14993f));
                }
                this.f14995h.m17687E();
                atomicReference = this.f14991d;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f14995h.f14613a.mo14551d().mo14675r().mo14618d("(legacy) Failed to get conditional properties; remote exception", (Object) null, this.f14992e, e);
                    this.f14991d.set(Collections.emptyList());
                    atomicReference = this.f14991d;
                } catch (Throwable th) {
                    this.f14991d.notify();
                    throw th;
                }
            }
        }
    }
}

package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p182n6.C7264i;
import p248s7.C8252f;

/* renamed from: com.google.android.gms.measurement.internal.y7 */
final class C4849y7 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ AtomicReference f15048d;

    /* renamed from: e */
    final /* synthetic */ String f15049e;

    /* renamed from: f */
    final /* synthetic */ String f15050f;

    /* renamed from: g */
    final /* synthetic */ zzq f15051g;

    /* renamed from: h */
    final /* synthetic */ boolean f15052h;

    /* renamed from: i */
    final /* synthetic */ C4641f8 f15053i;

    C4849y7(C4641f8 f8Var, AtomicReference atomicReference, String str, String str2, String str3, zzq zzq, boolean z) {
        this.f15053i = f8Var;
        this.f15048d = atomicReference;
        this.f15049e = str2;
        this.f15050f = str3;
        this.f15051g = zzq;
        this.f15052h = z;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f15048d) {
            try {
                C4641f8 f8Var = this.f15053i;
                C8252f H = f8Var.f14433d;
                if (H == null) {
                    f8Var.f14613a.mo14551d().mo14675r().mo14618d("(legacy) Failed to get user properties; not connected to service", (Object) null, this.f15049e, this.f15050f);
                    this.f15048d.set(Collections.emptyList());
                    this.f15048d.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    C7264i.m27902k(this.f15051g);
                    this.f15048d.set(H.mo14424I0(this.f15049e, this.f15050f, this.f15052h, this.f15051g));
                } else {
                    this.f15048d.set(H.mo14430o1((String) null, this.f15049e, this.f15050f, this.f15052h));
                }
                this.f15053i.m17687E();
                atomicReference = this.f15048d;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f15053i.f14613a.mo14551d().mo14675r().mo14618d("(legacy) Failed to get user properties; remote exception", (Object) null, this.f15049e, e);
                    this.f15048d.set(Collections.emptyList());
                    atomicReference = this.f15048d;
                } catch (Throwable th) {
                    this.f15048d.notify();
                    throw th;
                }
            }
        }
    }
}

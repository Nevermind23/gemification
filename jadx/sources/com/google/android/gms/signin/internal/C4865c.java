package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.C3966e;
import p066e7.C6037a;
import p066e7.C6039c;
import p287v7.C8711c;

/* renamed from: com.google.android.gms.signin.internal.c */
public final class C4865c extends C6037a {
    C4865c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: A2 */
    public final void mo15003A2(C3966e eVar, int i, boolean z) {
        Parcel k = mo19527k();
        C6039c.m24168d(k, eVar);
        k.writeInt(i);
        C6039c.m24166b(k, z);
        mo19528x(9, k);
    }

    /* renamed from: B2 */
    public final void mo15004B2(zai zai, C8711c cVar) {
        Parcel k = mo19527k();
        C6039c.m24167c(k, zai);
        C6039c.m24168d(k, cVar);
        mo19528x(12, k);
    }

    /* renamed from: T1 */
    public final void mo15005T1(int i) {
        Parcel k = mo19527k();
        k.writeInt(i);
        mo19528x(7, k);
    }
}

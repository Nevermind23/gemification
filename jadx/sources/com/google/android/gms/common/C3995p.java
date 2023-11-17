package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.p */
abstract class C3995p extends C3993n {

    /* renamed from: d */
    private static final WeakReference f12742d = new WeakReference((Object) null);

    /* renamed from: c */
    private WeakReference f12743c = f12742d;

    C3995p(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A2 */
    public abstract byte[] mo12321A2();

    /* access modifiers changed from: package-private */
    /* renamed from: T1 */
    public final byte[] mo12322T1() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f12743c.get();
            if (bArr == null) {
                bArr = mo12321A2();
                this.f12743c = new WeakReference(bArr);
            }
        }
        return bArr;
    }
}

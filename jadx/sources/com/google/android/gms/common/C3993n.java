package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p182n6.C7255e0;
import p182n6.C7264i;
import p182n6.C7288t0;
import p299w6.C8859b;
import p299w6.C8862d;

/* renamed from: com.google.android.gms.common.n */
abstract class C3993n extends C7288t0 {

    /* renamed from: b */
    private final int f12740b;

    protected C3993n(byte[] bArr) {
        boolean z;
        if (bArr.length == 25) {
            z = true;
        } else {
            z = false;
        }
        C7264i.m27892a(z);
        this.f12740b = Arrays.hashCode(bArr);
    }

    /* renamed from: y */
    protected static byte[] m15184y(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T1 */
    public abstract byte[] mo12322T1();

    /* renamed from: b */
    public final C8859b mo12323b() {
        return C8862d.m32984T1(mo12322T1());
    }

    public final boolean equals(Object obj) {
        C8859b b;
        if (obj != null && (obj instanceof C7255e0)) {
            try {
                C7255e0 e0Var = (C7255e0) obj;
                if (e0Var.mo12326s() != this.f12740b || (b = e0Var.mo12323b()) == null) {
                    return false;
                }
                return Arrays.equals(mo12322T1(), (byte[]) C8862d.m32985y(b));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f12740b;
    }

    /* renamed from: s */
    public final int mo12326s() {
        return this.f12740b;
    }
}

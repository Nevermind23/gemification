package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7288t0;
import p195o6.C7461a;
import p299w6.C8859b;
import p299w6.C8862d;

public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new C4010u();

    /* renamed from: d */
    private final String f12821d;

    /* renamed from: e */
    private final C3993n f12822e;

    /* renamed from: f */
    private final boolean f12823f;

    /* renamed from: g */
    private final boolean f12824g;

    zzs(String str, C3993n nVar, boolean z, boolean z2) {
        this.f12821d = str;
        this.f12822e = nVar;
        this.f12823f = z;
        this.f12824g = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 1, this.f12821d, false);
        C3993n nVar = this.f12822e;
        if (nVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            nVar = null;
        }
        C7461a.m28382n(parcel, 2, nVar, false);
        C7461a.m28372d(parcel, 3, this.f12823f);
        C7461a.m28372d(parcel, 4, this.f12824g);
        C7461a.m28370b(parcel, a);
    }

    zzs(String str, IBinder iBinder, boolean z, boolean z2) {
        byte[] bArr;
        this.f12821d = str;
        C3994o oVar = null;
        if (iBinder != null) {
            try {
                C8859b b = C7288t0.m27940x(iBinder).mo12323b();
                if (b == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) C8862d.m32985y(b);
                }
                if (bArr != null) {
                    oVar = new C3994o(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.f12822e = oVar;
        this.f12823f = z;
        this.f12824g = z2;
    }
}

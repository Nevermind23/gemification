package p209p7;

import android.os.Parcel;
import p131j7.C6746i;
import p131j7.C6747j;

/* renamed from: p7.f0 */
public abstract class C7740f0 extends C6746i implements C7742g0 {
    public C7740f0() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo20769k(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        C6747j.m26282b(parcel);
        mo21908c0(readInt);
        parcel2.writeNoException();
        return true;
    }
}

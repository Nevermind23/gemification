package p118i7;

import android.os.Parcel;
import com.google.android.gms.internal.location.zzaa;

/* renamed from: i7.d */
public abstract class C6592d extends C6602m implements C6594e {
    public C6592d() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo20589k(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo13985w2((zzaa) C6589b0.m25941a(parcel, zzaa.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo13984s();
        }
        return true;
    }
}

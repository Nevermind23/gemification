package p008a7;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: a7.d */
public final class C0065d extends C0062a implements C0067f {
    C0065d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    /* renamed from: Q */
    public final boolean mo119Q(boolean z) {
        Parcel k = mo117k();
        C0064c.m205a(k, true);
        Parcel x = mo118x(2, k);
        boolean b = C0064c.m206b(x);
        x.recycle();
        return b;
    }

    /* renamed from: s */
    public final String mo120s() {
        Parcel x = mo118x(1, mo117k());
        String readString = x.readString();
        x.recycle();
        return readString;
    }
}

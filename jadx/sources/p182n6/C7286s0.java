package p182n6;

import android.os.IBinder;
import android.os.Parcel;
import p092g7.C6250a;
import p299w6.C8859b;

/* renamed from: n6.s0 */
public final class C7286s0 extends C6250a implements C7255e0 {
    C7286s0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: b */
    public final C8859b mo12323b() {
        Parcel k = mo19863k(1, mo19864x());
        C8859b x = C8859b.C8860a.m32974x(k.readStrongBinder());
        k.recycle();
        return x;
    }

    /* renamed from: s */
    public final int mo12326s() {
        Parcel k = mo19863k(2, mo19864x());
        int readInt = k.readInt();
        k.recycle();
        return readInt;
    }
}

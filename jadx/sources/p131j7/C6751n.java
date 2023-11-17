package p131j7;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: j7.n */
public final class C6751n extends C6738a implements C6753p {
    C6751n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    /* renamed from: A1 */
    public final void mo20773A1(LatLng latLng) {
        Parcel x = mo20749x();
        C6747j.m26284d(x, latLng);
        mo20750y(3, x);
    }

    /* renamed from: Y1 */
    public final boolean mo20774Y1(C6753p pVar) {
        Parcel x = mo20749x();
        C6747j.m26285e(x, pVar);
        Parcel k = mo20748k(17, x);
        boolean f = C6747j.m26286f(k);
        k.recycle();
        return f;
    }

    /* renamed from: c */
    public final int mo20775c() {
        Parcel k = mo20748k(18, mo20749x());
        int readInt = k.readInt();
        k.recycle();
        return readInt;
    }

    /* renamed from: h2 */
    public final void mo20776h2(double d) {
        Parcel x = mo20749x();
        x.writeDouble(d);
        mo20750y(5, x);
    }
}

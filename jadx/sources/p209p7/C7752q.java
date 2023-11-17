package p209p7;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import p131j7.C6738a;
import p131j7.C6747j;
import p299w6.C8859b;

/* renamed from: p7.q */
public final class C7752q extends C6738a implements C7729a {
    C7752q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    /* renamed from: C1 */
    public final C8859b mo22476C1(LatLng latLng) {
        Parcel x = mo20749x();
        C6747j.m26284d(x, latLng);
        Parcel k = mo20748k(8, x);
        C8859b x2 = C8859b.C8860a.m32974x(k.readStrongBinder());
        k.recycle();
        return x2;
    }

    /* renamed from: V0 */
    public final C8859b mo22477V0(LatLng latLng, float f) {
        Parcel x = mo20749x();
        C6747j.m26284d(x, latLng);
        x.writeFloat(f);
        Parcel k = mo20748k(9, x);
        C8859b x2 = C8859b.C8860a.m32974x(k.readStrongBinder());
        k.recycle();
        return x2;
    }
}

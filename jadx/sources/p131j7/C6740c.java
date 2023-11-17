package p131j7;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: j7.c */
public final class C6740c extends C6738a implements C6742e {
    C6740c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate");
    }

    /* renamed from: d2 */
    public final boolean mo20765d2(C6742e eVar) {
        Parcel x = mo20749x();
        C6747j.m26285e(x, eVar);
        Parcel k = mo20748k(15, x);
        boolean f = C6747j.m26286f(k);
        k.recycle();
        return f;
    }

    /* renamed from: l */
    public final void mo20766l() {
        mo20750y(1, mo20749x());
    }

    /* renamed from: u */
    public final int mo20767u() {
        Parcel k = mo20748k(16, mo20749x());
        int readInt = k.readInt();
        k.recycle();
        return readInt;
    }
}

package p209p7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;
import p131j7.C6738a;
import p131j7.C6747j;
import p299w6.C8859b;

/* renamed from: p7.a0 */
public final class C7730a0 extends C6738a implements C7733c {
    C7730a0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapFragmentDelegate");
    }

    /* renamed from: G1 */
    public final void mo22478G1(C7747l lVar) {
        Parcel x = mo20749x();
        C6747j.m26285e(x, lVar);
        mo20750y(12, x);
    }

    /* renamed from: N */
    public final void mo22479N() {
        mo20750y(6, mo20749x());
    }

    /* renamed from: W */
    public final void mo22480W(C8859b bVar, GoogleMapOptions googleMapOptions, Bundle bundle) {
        Parcel x = mo20749x();
        C6747j.m26285e(x, bVar);
        C6747j.m26284d(x, googleMapOptions);
        C6747j.m26284d(x, bundle);
        mo20750y(2, x);
    }

    /* renamed from: b2 */
    public final C8859b mo22481b2(C8859b bVar, C8859b bVar2, Bundle bundle) {
        Parcel x = mo20749x();
        C6747j.m26285e(x, bVar);
        C6747j.m26285e(x, bVar2);
        C6747j.m26284d(x, bundle);
        Parcel k = mo20748k(4, x);
        C8859b x2 = C8859b.C8860a.m32974x(k.readStrongBinder());
        k.recycle();
        return x2;
    }

    /* renamed from: f */
    public final void mo22482f() {
        mo20750y(16, mo20749x());
    }

    /* renamed from: i */
    public final void mo22483i() {
        mo20750y(7, mo20749x());
    }

    /* renamed from: j */
    public final void mo22484j(Bundle bundle) {
        Parcel x = mo20749x();
        C6747j.m26284d(x, bundle);
        mo20750y(3, x);
    }

    /* renamed from: n */
    public final void mo22485n() {
        mo20750y(5, mo20749x());
    }

    /* renamed from: o */
    public final void mo22486o() {
        mo20750y(15, mo20749x());
    }

    public final void onDestroy() {
        mo20750y(8, mo20749x());
    }

    public final void onLowMemory() {
        mo20750y(9, mo20749x());
    }

    /* renamed from: p */
    public final void mo22489p(Bundle bundle) {
        Parcel x = mo20749x();
        C6747j.m26284d(x, bundle);
        Parcel k = mo20748k(10, x);
        if (k.readInt() != 0) {
            bundle.readFromParcel(k);
        }
        k.recycle();
    }
}

package p131j7;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import p299w6.C8859b;

/* renamed from: j7.q */
public final class C6754q extends C6738a implements C6739b {
    C6754q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    /* renamed from: K */
    public final void mo20751K(float f) {
        Parcel x = mo20749x();
        x.writeFloat(f);
        mo20750y(22, x);
    }

    /* renamed from: K1 */
    public final void mo20752K1(String str) {
        Parcel x = mo20749x();
        x.writeString(str);
        mo20750y(7, x);
    }

    /* renamed from: U0 */
    public final boolean mo20753U0(C6739b bVar) {
        Parcel x = mo20749x();
        C6747j.m26285e(x, bVar);
        Parcel k = mo20748k(16, x);
        boolean f = C6747j.m26286f(k);
        k.recycle();
        return f;
    }

    /* renamed from: X0 */
    public final void mo20754X0(LatLng latLng) {
        Parcel x = mo20749x();
        C6747j.m26284d(x, latLng);
        mo20750y(3, x);
    }

    /* renamed from: c */
    public final LatLng mo20755c() {
        Parcel k = mo20748k(4, mo20749x());
        LatLng latLng = (LatLng) C6747j.m26281a(k, LatLng.CREATOR);
        k.recycle();
        return latLng;
    }

    /* renamed from: e */
    public final String mo20756e() {
        Parcel k = mo20748k(8, mo20749x());
        String readString = k.readString();
        k.recycle();
        return readString;
    }

    /* renamed from: f2 */
    public final void mo20757f2(String str) {
        Parcel x = mo20749x();
        x.writeString(str);
        mo20750y(5, x);
    }

    /* renamed from: g */
    public final boolean mo20758g() {
        Parcel k = mo20748k(13, mo20749x());
        boolean f = C6747j.m26286f(k);
        k.recycle();
        return f;
    }

    /* renamed from: l0 */
    public final void mo20759l0(float f) {
        Parcel x = mo20749x();
        x.writeFloat(f);
        mo20750y(27, x);
    }

    /* renamed from: m */
    public final void mo20760m() {
        mo20750y(1, mo20749x());
    }

    /* renamed from: r */
    public final void mo20761r() {
        mo20750y(11, mo20749x());
    }

    /* renamed from: v */
    public final int mo20762v() {
        Parcel k = mo20748k(17, mo20749x());
        int readInt = k.readInt();
        k.recycle();
        return readInt;
    }

    /* renamed from: w */
    public final String mo20763w() {
        Parcel k = mo20748k(6, mo20749x());
        String readString = k.readString();
        k.recycle();
        return readString;
    }

    /* renamed from: z0 */
    public final void mo20764z0(C8859b bVar) {
        Parcel x = mo20749x();
        C6747j.m26285e(x, bVar);
        mo20750y(18, x);
    }
}

package p209p7;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import p131j7.C6738a;
import p131j7.C6739b;
import p131j7.C6741d;
import p131j7.C6742e;
import p131j7.C6747j;
import p131j7.C6752o;
import p131j7.C6753p;
import p131j7.C6755r;
import p299w6.C8859b;

/* renamed from: p7.x */
public final class C7759x extends C6738a implements C7731b {
    C7759x(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    /* renamed from: I1 */
    public final boolean mo22490I1(MapStyleOptions mapStyleOptions) {
        Parcel x = mo20749x();
        C6747j.m26284d(x, mapStyleOptions);
        Parcel k = mo20748k(91, x);
        boolean f = C6747j.m26286f(k);
        k.recycle();
        return f;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: K0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p209p7.C7735d mo22491K0() {
        /*
            r4 = this;
            r0 = 26
            android.os.Parcel r1 = r4.mo20749x()
            android.os.Parcel r0 = r4.mo20748k(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.maps.internal.IProjectionDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof p209p7.C7735d
            if (r3 == 0) goto L_0x0020
            r1 = r2
            p7.d r1 = (p209p7.C7735d) r1
            goto L_0x0026
        L_0x0020:
            p7.r r2 = new p7.r
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p209p7.C7759x.mo22491K0():p7.d");
    }

    /* renamed from: M */
    public final C6753p mo22492M(CircleOptions circleOptions) {
        Parcel x = mo20749x();
        C6747j.m26284d(x, circleOptions);
        Parcel k = mo20748k(35, x);
        C6753p x2 = C6752o.m26296x(k.readStrongBinder());
        k.recycle();
        return x2;
    }

    /* renamed from: M0 */
    public final void mo22493M0(C8859b bVar) {
        Parcel x = mo20749x();
        C6747j.m26285e(x, bVar);
        mo20750y(5, x);
    }

    /* renamed from: M1 */
    public final void mo22494M1(C8859b bVar) {
        Parcel x = mo20749x();
        C6747j.m26285e(x, bVar);
        mo20750y(4, x);
    }

    /* renamed from: O1 */
    public final void mo22495O1(C7745j jVar) {
        Parcel x = mo20749x();
        C6747j.m26285e(x, jVar);
        mo20750y(84, x);
    }

    /* renamed from: R */
    public final void mo22496R(C7738e0 e0Var) {
        Parcel x = mo20749x();
        C6747j.m26285e(x, e0Var);
        mo20750y(97, x);
    }

    /* renamed from: T0 */
    public final void mo22497T0(C7743h hVar) {
        Parcel x = mo20749x();
        C6747j.m26285e(x, hVar);
        mo20750y(32, x);
    }

    /* renamed from: V1 */
    public final void mo22498V1(C7734c0 c0Var) {
        Parcel x = mo20749x();
        C6747j.m26285e(x, c0Var);
        mo20750y(99, x);
    }

    /* renamed from: c1 */
    public final C6739b mo22499c1(MarkerOptions markerOptions) {
        Parcel x = mo20749x();
        C6747j.m26284d(x, markerOptions);
        Parcel k = mo20748k(11, x);
        C6739b x2 = C6755r.m26315x(k.readStrongBinder());
        k.recycle();
        return x2;
    }

    /* renamed from: d0 */
    public final CameraPosition mo22500d0() {
        Parcel k = mo20748k(1, mo20749x());
        CameraPosition cameraPosition = (CameraPosition) C6747j.m26281a(k, CameraPosition.CREATOR);
        k.recycle();
        return cameraPosition;
    }

    /* renamed from: g2 */
    public final void mo22501g2(C7751p pVar) {
        Parcel x = mo20749x();
        C6747j.m26285e(x, pVar);
        mo20750y(31, x);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: i2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p209p7.C7737e mo22502i2() {
        /*
            r4 = this;
            r0 = 25
            android.os.Parcel r1 = r4.mo20749x()
            android.os.Parcel r0 = r4.mo20748k(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof p209p7.C7737e
            if (r3 == 0) goto L_0x0020
            r1 = r2
            p7.e r1 = (p209p7.C7737e) r1
            goto L_0x0026
        L_0x0020:
            p7.s r2 = new p7.s
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p209p7.C7759x.mo22502i2():p7.e");
    }

    /* renamed from: k2 */
    public final void mo22503k2(C7749n nVar) {
        Parcel x = mo20749x();
        C6747j.m26285e(x, nVar);
        mo20750y(30, x);
    }

    /* renamed from: n1 */
    public final int mo22504n1() {
        Parcel k = mo20748k(15, mo20749x());
        int readInt = k.readInt();
        k.recycle();
        return readInt;
    }

    /* renamed from: s2 */
    public final C6742e mo22505s2(PolylineOptions polylineOptions) {
        Parcel x = mo20749x();
        C6747j.m26284d(x, polylineOptions);
        Parcel k = mo20748k(9, x);
        C6742e x2 = C6741d.m26275x(k.readStrongBinder());
        k.recycle();
        return x2;
    }

    /* renamed from: t0 */
    public final void mo22506t0(int i) {
        Parcel x = mo20749x();
        x.writeInt(i);
        mo20750y(16, x);
    }

    /* renamed from: x0 */
    public final void mo22507x0(C7742g0 g0Var) {
        Parcel x = mo20749x();
        C6747j.m26285e(x, g0Var);
        mo20750y(96, x);
    }

    /* renamed from: z */
    public final void mo22508z(C7761z zVar) {
        Parcel x = mo20749x();
        C6747j.m26285e(x, zVar);
        mo20750y(33, x);
    }

    /* renamed from: z1 */
    public final void mo22509z1(int i, int i2, int i3, int i4) {
        Parcel x = mo20749x();
        x.writeInt(i);
        x.writeInt(i2);
        x.writeInt(i3);
        x.writeInt(i4);
        mo20750y(39, x);
    }
}

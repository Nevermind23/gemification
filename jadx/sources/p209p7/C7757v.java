package p209p7;

import android.os.IBinder;
import android.os.Parcel;
import p131j7.C6738a;
import p131j7.C6747j;
import p131j7.C6749l;
import p131j7.C6750m;
import p299w6.C8859b;

/* renamed from: p7.v */
public final class C7757v extends C6738a implements C7758w {
    C7757v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    /* renamed from: A */
    public final void mo22514A(C8859b bVar, int i) {
        Parcel x = mo20749x();
        C6747j.m26285e(x, bVar);
        x.writeInt(i);
        mo20750y(6, x);
    }

    /* renamed from: b */
    public final int mo22515b() {
        Parcel k = mo20748k(9, mo20749x());
        int readInt = k.readInt();
        k.recycle();
        return readInt;
    }

    /* renamed from: d */
    public final C6750m mo22516d() {
        Parcel k = mo20748k(5, mo20749x());
        C6750m x = C6749l.m26289x(k.readStrongBinder());
        k.recycle();
        return x;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: h1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p209p7.C7733c mo22517h1(p299w6.C8859b r4) {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.mo20749x()
            p131j7.C6747j.m26285e(r0, r4)
            r4 = 2
            android.os.Parcel r4 = r3.mo20748k(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.maps.internal.IMapFragmentDelegate"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof p209p7.C7733c
            if (r2 == 0) goto L_0x0022
            r0 = r1
            p7.c r0 = (p209p7.C7733c) r0
            goto L_0x0028
        L_0x0022:
            p7.a0 r1 = new p7.a0
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p209p7.C7757v.mo22517h1(w6.b):p7.c");
    }

    /* renamed from: i0 */
    public final void mo22518i0(C8859b bVar, int i) {
        Parcel x = mo20749x();
        C6747j.m26285e(x, bVar);
        x.writeInt(i);
        mo20750y(10, x);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p209p7.C7729a mo22519t() {
        /*
            r4 = this;
            r0 = 4
            android.os.Parcel r1 = r4.mo20749x()
            android.os.Parcel r0 = r4.mo20748k(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof p209p7.C7729a
            if (r3 == 0) goto L_0x001f
            r1 = r2
            p7.a r1 = (p209p7.C7729a) r1
            goto L_0x0025
        L_0x001f:
            p7.q r2 = new p7.q
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p209p7.C7757v.mo22519t():p7.a");
    }
}

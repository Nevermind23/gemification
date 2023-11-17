package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import p092g7.C6250a;
import p092g7.C6252c;
import p299w6.C8859b;

/* renamed from: com.google.android.gms.dynamite.m */
public final class C4029m extends C6250a {
    C4029m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: A2 */
    public final int mo12403A2(C8859b bVar, String str, boolean z) {
        Parcel x = mo19864x();
        C6252c.m24823d(x, bVar);
        x.writeString(str);
        x.writeInt(z ? 1 : 0);
        Parcel k = mo19863k(5, x);
        int readInt = k.readInt();
        k.recycle();
        return readInt;
    }

    /* renamed from: B2 */
    public final C8859b mo12404B2(C8859b bVar, String str, int i) {
        Parcel x = mo19864x();
        C6252c.m24823d(x, bVar);
        x.writeString(str);
        x.writeInt(i);
        Parcel k = mo19863k(2, x);
        C8859b x2 = C8859b.C8860a.m32974x(k.readStrongBinder());
        k.recycle();
        return x2;
    }

    /* renamed from: C2 */
    public final C8859b mo12405C2(C8859b bVar, String str, int i, C8859b bVar2) {
        Parcel x = mo19864x();
        C6252c.m24823d(x, bVar);
        x.writeString(str);
        x.writeInt(i);
        C6252c.m24823d(x, bVar2);
        Parcel k = mo19863k(8, x);
        C8859b x2 = C8859b.C8860a.m32974x(k.readStrongBinder());
        k.recycle();
        return x2;
    }

    /* renamed from: D2 */
    public final C8859b mo12406D2(C8859b bVar, String str, int i) {
        Parcel x = mo19864x();
        C6252c.m24823d(x, bVar);
        x.writeString(str);
        x.writeInt(i);
        Parcel k = mo19863k(4, x);
        C8859b x2 = C8859b.C8860a.m32974x(k.readStrongBinder());
        k.recycle();
        return x2;
    }

    /* renamed from: E2 */
    public final C8859b mo12407E2(C8859b bVar, String str, boolean z, long j) {
        Parcel x = mo19864x();
        C6252c.m24823d(x, bVar);
        x.writeString(str);
        x.writeInt(z ? 1 : 0);
        x.writeLong(j);
        Parcel k = mo19863k(7, x);
        C8859b x2 = C8859b.C8860a.m32974x(k.readStrongBinder());
        k.recycle();
        return x2;
    }

    /* renamed from: T1 */
    public final int mo12408T1(C8859b bVar, String str, boolean z) {
        Parcel x = mo19864x();
        C6252c.m24823d(x, bVar);
        x.writeString(str);
        x.writeInt(z ? 1 : 0);
        Parcel k = mo19863k(3, x);
        int readInt = k.readInt();
        k.recycle();
        return readInt;
    }

    /* renamed from: y */
    public final int mo12409y() {
        Parcel k = mo19863k(6, mo19864x());
        int readInt = k.readInt();
        k.recycle();
        return readInt;
    }
}

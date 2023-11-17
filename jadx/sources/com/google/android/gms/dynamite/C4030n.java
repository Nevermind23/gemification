package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import p092g7.C6250a;
import p092g7.C6252c;
import p299w6.C8859b;

/* renamed from: com.google.android.gms.dynamite.n */
public final class C4030n extends C6250a {
    C4030n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: T1 */
    public final C8859b mo12410T1(C8859b bVar, String str, int i, C8859b bVar2) {
        Parcel x = mo19864x();
        C6252c.m24823d(x, bVar);
        x.writeString(str);
        x.writeInt(i);
        C6252c.m24823d(x, bVar2);
        Parcel k = mo19863k(3, x);
        C8859b x2 = C8859b.C8860a.m32974x(k.readStrongBinder());
        k.recycle();
        return x2;
    }

    /* renamed from: y */
    public final C8859b mo12411y(C8859b bVar, String str, int i, C8859b bVar2) {
        Parcel x = mo19864x();
        C6252c.m24823d(x, bVar);
        x.writeString(str);
        x.writeInt(i);
        C6252c.m24823d(x, bVar2);
        Parcel k = mo19863k(2, x);
        C8859b x2 = C8859b.C8860a.m32974x(k.readStrongBinder());
        k.recycle();
        return x2;
    }
}

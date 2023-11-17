package p209p7;

import android.os.Parcel;
import p131j7.C6739b;
import p131j7.C6746i;
import p131j7.C6747j;
import p131j7.C6755r;

/* renamed from: p7.o */
public abstract class C7750o extends C6746i implements C7751p {
    public C7750o() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo20769k(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            C6739b x = C6755r.m26315x(parcel.readStrongBinder());
            C6747j.m26282b(parcel);
            mo21902d1(x);
        } else if (i == 2) {
            C6739b x2 = C6755r.m26315x(parcel.readStrongBinder());
            C6747j.m26282b(parcel);
            mo21901a(x2);
        } else if (i != 3) {
            return false;
        } else {
            C6739b x3 = C6755r.m26315x(parcel.readStrongBinder());
            C6747j.m26282b(parcel);
            mo21903h(x3);
        }
        parcel2.writeNoException();
        return true;
    }
}

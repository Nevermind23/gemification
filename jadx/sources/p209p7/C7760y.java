package p209p7;

import android.os.Parcel;
import p131j7.C6739b;
import p131j7.C6746i;
import p131j7.C6747j;
import p131j7.C6755r;
import p299w6.C8859b;

/* renamed from: p7.y */
public abstract class C7760y extends C6746i implements C7761z {
    public C7760y() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo20769k(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            C6739b x = C6755r.m26315x(parcel.readStrongBinder());
            C6747j.m26282b(parcel);
            C8859b h = mo21907h(x);
            parcel2.writeNoException();
            C6747j.m26285e(parcel2, h);
        } else if (i != 2) {
            return false;
        } else {
            C6739b x2 = C6755r.m26315x(parcel.readStrongBinder());
            C6747j.m26282b(parcel);
            C8859b a = mo21906a(x2);
            parcel2.writeNoException();
            C6747j.m26285e(parcel2, a);
        }
        return true;
    }
}

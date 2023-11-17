package p209p7;

import android.os.Parcel;
import p131j7.C6739b;
import p131j7.C6746i;
import p131j7.C6747j;
import p131j7.C6755r;

/* renamed from: p7.m */
public abstract class C7748m extends C6746i implements C7749n {
    public C7748m() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo20769k(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        C6739b x = C6755r.m26315x(parcel.readStrongBinder());
        C6747j.m26282b(parcel);
        boolean a = mo21900a(x);
        parcel2.writeNoException();
        C6747j.m26283c(parcel2, a);
        return true;
    }
}

package p209p7;

import android.os.Parcel;
import p131j7.C6739b;
import p131j7.C6746i;
import p131j7.C6747j;
import p131j7.C6755r;

/* renamed from: p7.i */
public abstract class C7744i extends C6746i implements C7745j {
    public C7744i() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo20769k(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        C6739b x = C6755r.m26315x(parcel.readStrongBinder());
        C6747j.m26282b(parcel);
        mo21905a(x);
        parcel2.writeNoException();
        return true;
    }
}

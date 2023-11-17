package p182n6;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzk;
import p092g7.C6251b;
import p092g7.C6252c;

/* renamed from: n6.f0 */
public abstract class C7257f0 extends C6251b implements C7254e {
    public C7257f0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo19866k(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            C6252c.m24821b(parcel);
            mo12283s0(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C6252c.m24820a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            C6252c.m24821b(parcel);
            mo12282E1(parcel.readInt(), (Bundle) C6252c.m24820a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            C6252c.m24821b(parcel);
            mo12284v2(parcel.readInt(), parcel.readStrongBinder(), (zzk) C6252c.m24820a(parcel, zzk.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}

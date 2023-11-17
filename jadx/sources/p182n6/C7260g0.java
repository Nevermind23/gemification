package p182n6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import p092g7.C6250a;
import p092g7.C6252c;
import p299w6.C8859b;

/* renamed from: n6.g0 */
public final class C7260g0 extends C6250a implements C7265i0 {
    C7260g0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    /* renamed from: R1 */
    public final zzq mo21634R1(zzo zzo) {
        Parcel x = mo19864x();
        C6252c.m24822c(x, zzo);
        Parcel k = mo19863k(6, x);
        zzq zzq = (zzq) C6252c.m24820a(k, zzq.CREATOR);
        k.recycle();
        return zzq;
    }

    /* renamed from: Z1 */
    public final zzq mo21635Z1(zzo zzo) {
        Parcel x = mo19864x();
        C6252c.m24822c(x, zzo);
        Parcel k = mo19863k(8, x);
        zzq zzq = (zzq) C6252c.m24820a(k, zzq.CREATOR);
        k.recycle();
        return zzq;
    }

    /* renamed from: c */
    public final boolean mo21636c() {
        Parcel k = mo19863k(7, mo19864x());
        boolean e = C6252c.m24824e(k);
        k.recycle();
        return e;
    }

    /* renamed from: u1 */
    public final boolean mo21637u1(zzs zzs, C8859b bVar) {
        Parcel x = mo19864x();
        C6252c.m24822c(x, zzs);
        C6252c.m24823d(x, bVar);
        Parcel k = mo19863k(5, x);
        boolean e = C6252c.m24824e(k);
        k.recycle();
        return e;
    }
}

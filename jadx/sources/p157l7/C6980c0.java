package p157l7;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.ViewTokenRequest;

/* renamed from: l7.c0 */
public final class C6980c0 extends C6975a {
    C6980c0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tapandpay.internal.ITapAndPayService");
    }

    /* renamed from: A2 */
    public final void mo21115A2(C6984e0 e0Var) {
        Parcel k = mo21109k();
        C6978b0.m27006d(k, e0Var);
        mo21110x(30, k);
    }

    /* renamed from: B2 */
    public final void mo21116B2(C6984e0 e0Var) {
        Parcel k = mo21109k();
        C6978b0.m27006d(k, e0Var);
        mo21110x(74, k);
    }

    /* renamed from: C2 */
    public final void mo21117C2(PushTokenizeRequest pushTokenizeRequest, C6984e0 e0Var) {
        Parcel k = mo21109k();
        C6978b0.m27005c(k, pushTokenizeRequest);
        C6978b0.m27006d(k, e0Var);
        mo21110x(28, k);
    }

    /* renamed from: D2 */
    public final void mo21118D2(int i, String str, String str2, int i2, C6984e0 e0Var) {
        Parcel k = mo21109k();
        k.writeInt(i);
        k.writeString(str);
        k.writeString(str2);
        k.writeInt(i2);
        C6978b0.m27006d(k, e0Var);
        mo21110x(23, k);
    }

    /* renamed from: E2 */
    public final void mo21119E2(ViewTokenRequest viewTokenRequest, C6984e0 e0Var) {
        Parcel k = mo21109k();
        C6978b0.m27005c(k, viewTokenRequest);
        C6978b0.m27006d(k, e0Var);
        mo21110x(79, k);
    }

    /* renamed from: T1 */
    public final void mo21120T1(C6984e0 e0Var) {
        Parcel k = mo21109k();
        C6978b0.m27006d(k, e0Var);
        mo21110x(21, k);
    }

    /* renamed from: y */
    public final void mo21121y(C6984e0 e0Var) {
        Parcel k = mo21109k();
        C6978b0.m27006d(k, e0Var);
        mo21110x(29, k);
    }
}

package p091g6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p038c7.C2269a;
import p038c7.C2272d;

/* renamed from: g6.s */
public final class C6246s extends C2269a {
    C6246s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    /* renamed from: T1 */
    public final void mo19858T1(C6245r rVar, GoogleSignInOptions googleSignInOptions) {
        Parcel k = mo7316k();
        C2272d.m8736d(k, rVar);
        C2272d.m8735c(k, googleSignInOptions);
        mo7317x(102, k);
    }

    /* renamed from: y */
    public final void mo19859y(C6245r rVar, GoogleSignInOptions googleSignInOptions) {
        Parcel k = mo7316k();
        C2272d.m8736d(k, rVar);
        C2272d.m8735c(k, googleSignInOptions);
        mo7317x(103, k);
    }
}

package p091g6;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p038c7.C2270b;
import p038c7.C2272d;

/* renamed from: g6.q */
public abstract class C6244q extends C2270b implements C6245r {
    public C6244q() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo7319k(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 101:
                C2272d.m8734b(parcel);
                mo19847r0((GoogleSignInAccount) C2272d.m8733a(parcel, GoogleSignInAccount.CREATOR), (Status) C2272d.m8733a(parcel, Status.CREATOR));
                break;
            case 102:
                C2272d.m8734b(parcel);
                mo19846e2((Status) C2272d.m8733a(parcel, Status.CREATOR));
                break;
            case 103:
                C2272d.m8734b(parcel);
                mo19845U1((Status) C2272d.m8733a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

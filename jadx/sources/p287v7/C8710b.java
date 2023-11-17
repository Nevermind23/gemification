package p287v7;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.zaa;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zak;
import p066e7.C6038b;
import p066e7.C6039c;

/* renamed from: v7.b */
public abstract class C8710b extends C6038b implements C8711c {
    public C8710b() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: A2 */
    public final boolean mo19530A2(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 3:
                ConnectionResult connectionResult = (ConnectionResult) C6039c.m24165a(parcel, ConnectionResult.CREATOR);
                zaa zaa = (zaa) C6039c.m24165a(parcel, zaa.CREATOR);
                break;
            case 4:
                Status status = (Status) C6039c.m24165a(parcel, Status.CREATOR);
                break;
            case 6:
                Status status2 = (Status) C6039c.m24165a(parcel, Status.CREATOR);
                break;
            case 7:
                Status status3 = (Status) C6039c.m24165a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) C6039c.m24165a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                mo12151V((zak) C6039c.m24165a(parcel, zak.CREATOR));
                break;
            case 9:
                zag zag = (zag) C6039c.m24165a(parcel, zag.CREATOR);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

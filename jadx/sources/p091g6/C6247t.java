package p091g6;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.C3821a;
import com.google.android.gms.auth.api.signin.C3822b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p260t6.C8416r;

/* renamed from: g6.t */
public final class C6247t extends C6242o {

    /* renamed from: b */
    private final Context f19271b;

    public C6247t(Context context) {
        this.f19271b = context;
    }

    /* renamed from: x */
    private final void m24814x() {
        if (!C8416r.m31577a(this.f19271b, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            throw new SecurityException("Calling UID " + callingUid + " is not Google Play services.");
        }
    }

    /* renamed from: E */
    public final void mo19856E() {
        m24814x();
        C6241n.m24801a(this.f19271b).mo19854b();
    }

    /* renamed from: T */
    public final void mo19857T() {
        m24814x();
        C6229b b = C6229b.m24768b(this.f19271b);
        GoogleSignInAccount c = b.mo19839c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f12158o;
        if (c != null) {
            googleSignInOptions = b.mo19840d();
        }
        C3822b a = C3821a.m14419a(this.f19271b, googleSignInOptions);
        if (c != null) {
            a.mo11795A();
        } else {
            a.mo11796B();
        }
    }
}

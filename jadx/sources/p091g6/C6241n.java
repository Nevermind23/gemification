package p091g6;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: g6.n */
public final class C6241n {

    /* renamed from: d */
    private static C6241n f19267d;

    /* renamed from: a */
    final C6229b f19268a;

    /* renamed from: b */
    GoogleSignInAccount f19269b;

    /* renamed from: c */
    GoogleSignInOptions f19270c;

    private C6241n(Context context) {
        C6229b b = C6229b.m24768b(context);
        this.f19268a = b;
        this.f19269b = b.mo19839c();
        this.f19270c = b.mo19840d();
    }

    /* renamed from: a */
    public static synchronized C6241n m24801a(Context context) {
        C6241n d;
        synchronized (C6241n.class) {
            d = m24802d(context.getApplicationContext());
        }
        return d;
    }

    /* renamed from: d */
    private static synchronized C6241n m24802d(Context context) {
        synchronized (C6241n.class) {
            C6241n nVar = f19267d;
            if (nVar != null) {
                return nVar;
            }
            C6241n nVar2 = new C6241n(context);
            f19267d = nVar2;
            return nVar2;
        }
    }

    /* renamed from: b */
    public final synchronized void mo19854b() {
        this.f19268a.mo19838a();
        this.f19269b = null;
        this.f19270c = null;
    }

    /* renamed from: c */
    public final synchronized void mo19855c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f19268a.mo19842f(googleSignInAccount, googleSignInOptions);
        this.f19269b = googleSignInAccount;
        this.f19270c = googleSignInOptions;
    }
}

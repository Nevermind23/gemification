package p091g6;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.C3860c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3874c;
import p143k6.C6819b;
import p143k6.C6821c;
import p221q6.C7895a;

/* renamed from: g6.m */
public abstract class C6240m {

    /* renamed from: a */
    private static final C7895a f19266a = new C7895a("GoogleSignInCommon", new String[0]);

    /* renamed from: a */
    public static Intent m24797a(Context context, GoogleSignInOptions googleSignInOptions) {
        f19266a.mo22863a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    /* renamed from: b */
    public static C6819b m24798b(C3860c cVar, Context context, boolean z) {
        f19266a.mo22863a("Revoking access", new Object[0]);
        String e = C6229b.m24768b(context).mo19841e();
        m24800d(context);
        if (z) {
            return C6231d.m24780a(e);
        }
        return cVar.mo11954g(new C6238k(cVar));
    }

    /* renamed from: c */
    public static C6819b m24799c(C3860c cVar, Context context, boolean z) {
        f19266a.mo22863a("Signing out", new Object[0]);
        m24800d(context);
        if (z) {
            return C6821c.m26556b(Status.f12252j, cVar);
        }
        return cVar.mo11954g(new C6236i(cVar));
    }

    /* renamed from: d */
    private static void m24800d(Context context) {
        C6241n.m24801a(context).mo19854b();
        for (C3860c l : C3860c.m14546h()) {
            l.mo11958l();
        }
        C3874c.m14644a();
    }
}

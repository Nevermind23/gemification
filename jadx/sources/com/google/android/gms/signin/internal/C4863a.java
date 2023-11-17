package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.C3943d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3860c;
import com.google.android.gms.common.internal.C3958b;
import com.google.android.gms.common.internal.C3964c;
import com.google.android.gms.common.internal.C3966e;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;
import p091g6.C6229b;
import p182n6.C7249c;
import p182n6.C7264i;
import p274u7.C8645e;
import p287v7.C8711c;

/* renamed from: com.google.android.gms.signin.internal.a */
public class C4863a extends C3964c implements C8645e {

    /* renamed from: M */
    public static final /* synthetic */ int f15140M = 0;

    /* renamed from: I */
    private final boolean f15141I = true;

    /* renamed from: J */
    private final C7249c f15142J;

    /* renamed from: K */
    private final Bundle f15143K;

    /* renamed from: L */
    private final Integer f15144L;

    public C4863a(Context context, Looper looper, boolean z, C7249c cVar, Bundle bundle, C3860c.C3862b bVar, C3860c.C3863c cVar2) {
        super(context, looper, 44, cVar, bVar, cVar2);
        this.f15142J = cVar;
        this.f15143K = bundle;
        this.f15144L = cVar.mo21623i();
    }

    /* renamed from: r0 */
    public static Bundle m18469r0(C7249c cVar) {
        cVar.mo21622h();
        Integer i = cVar.mo21623i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", cVar.mo21615a());
        if (i != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", i.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final Bundle mo7048F() {
        if (!mo12219D().getPackageName().equals(this.f15142J.mo21620f())) {
            this.f15143K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f15142J.mo21620f());
        }
        return this.f15143K;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo7049J() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo7050K() {
        return "com.google.android.gms.signin.service.START";
    }

    /* renamed from: a */
    public final void mo14997a() {
        try {
            ((C4865c) mo12223I()).mo15005T1(((Integer) C7264i.m27902k(this.f15144L)).intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    /* renamed from: j */
    public final void mo14998j(C8711c cVar) {
        GoogleSignInAccount googleSignInAccount;
        C7264i.m27903l(cVar, "Expecting a valid ISignInCallbacks");
        try {
            Account c = this.f15142J.mo21617c();
            if ("<<default account>>".equals(c.name)) {
                googleSignInAccount = C6229b.m24768b(mo12219D()).mo19839c();
            } else {
                googleSignInAccount = null;
            }
            ((C4865c) mo12223I()).mo15004B2(new zai(1, new zat(c, ((Integer) C7264i.m27902k(this.f15144L)).intValue(), googleSignInAccount)), cVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                cVar.mo12151V(new zak(1, new ConnectionResult(8, (PendingIntent) null), (zav) null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* renamed from: k */
    public final boolean mo7052k() {
        return this.f15141I;
    }

    /* renamed from: l */
    public final void mo14999l() {
        mo12243h(new C3958b.C3962d());
    }

    /* renamed from: q */
    public final int mo7053q() {
        return C3943d.f12557a;
    }

    /* renamed from: s */
    public final void mo15000s(C3966e eVar, boolean z) {
        try {
            ((C4865c) mo12223I()).mo15003A2(eVar, ((Integer) C7264i.m27902k(this.f15144L)).intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* synthetic */ IInterface mo7054x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C4865c) {
            return (C4865c) queryLocalInterface;
        }
        return new C4865c(iBinder);
    }
}

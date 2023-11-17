package p091g6;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.C3943d;
import com.google.android.gms.common.api.C3860c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3964c;
import p038c7.C2271c;
import p182n6.C7249c;

/* renamed from: g6.g */
public final class C6234g extends C3964c {

    /* renamed from: I */
    private final GoogleSignInOptions f19263I;

    public C6234g(Context context, Looper looper, C7249c cVar, GoogleSignInOptions googleSignInOptions, C3860c.C3862b bVar, C3860c.C3863c cVar2) {
        super(context, looper, 91, cVar, bVar, cVar2);
        GoogleSignInOptions.C3820a aVar;
        if (googleSignInOptions != null) {
            aVar = new GoogleSignInOptions.C3820a(googleSignInOptions);
        } else {
            aVar = new GoogleSignInOptions.C3820a();
        }
        aVar.mo11791e(C2271c.m8732a());
        if (!cVar.mo21618d().isEmpty()) {
            for (Scope d : cVar.mo21618d()) {
                aVar.mo11790d(d, new Scope[0]);
            }
        }
        this.f19263I = aVar.mo11787a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo7049J() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo7050K() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    /* renamed from: d */
    public final boolean mo12239d() {
        return true;
    }

    /* renamed from: q */
    public final int mo7053q() {
        return C3943d.f12557a;
    }

    /* renamed from: r0 */
    public final GoogleSignInOptions mo19852r0() {
        return this.f19263I;
    }

    /* renamed from: u */
    public final Intent mo12251u() {
        return C6240m.m24797a(mo12219D(), this.f19263I);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* synthetic */ IInterface mo7054x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C6246s) {
            return (C6246s) queryLocalInterface;
        }
        return new C6246s(iBinder);
    }
}

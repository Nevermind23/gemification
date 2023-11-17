package p025b7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.C3943d;
import com.google.android.gms.common.internal.C3964c;
import p007a6.C0057b;
import p007a6.C0058c;
import p156l6.C6935d;
import p156l6.C6946i;
import p182n6.C7249c;

/* renamed from: b7.b */
public final class C2167b extends C3964c {

    /* renamed from: I */
    private final Bundle f6349I = new Bundle();

    public C2167b(Context context, Looper looper, C7249c cVar, C0058c cVar2, C6935d dVar, C6946i iVar) {
        super(context, looper, 16, cVar, dVar, iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final Bundle mo7048F() {
        return this.f6349I;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo7049J() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo7050K() {
        return "com.google.android.gms.auth.service.START";
    }

    /* renamed from: X */
    public final boolean mo7051X() {
        return true;
    }

    /* renamed from: k */
    public final boolean mo7052k() {
        C7249c o0 = mo12259o0();
        if (TextUtils.isEmpty(o0.mo21616b()) || o0.mo21619e(C0057b.f109a).isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public final int mo7053q() {
        return C3943d.f12557a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* synthetic */ IInterface mo7054x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof C2168c) {
            return (C2168c) queryLocalInterface;
        }
        return new C2168c(iBinder);
    }
}

package p038c7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C3860c;
import com.google.android.gms.common.internal.C3964c;
import p007a6.C0054a;
import p182n6.C7249c;

/* renamed from: c7.f */
public final class C2274f extends C3964c {

    /* renamed from: I */
    private final C0054a.C0055a f7080I;

    public C2274f(Context context, Looper looper, C7249c cVar, C0054a.C0055a aVar, C3860c.C3862b bVar, C3860c.C3863c cVar2) {
        super(context, looper, 68, cVar, bVar, cVar2);
        C0054a.C0055a.C0056a aVar2 = new C0054a.C0055a.C0056a(aVar == null ? C0054a.C0055a.f103g : aVar);
        aVar2.mo112a(C2271c.m8732a());
        this.f7080I = new C0054a.C0055a(aVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final Bundle mo7048F() {
        return this.f7080I.mo109a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo7049J() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo7050K() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    /* renamed from: q */
    public final int mo7053q() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* synthetic */ IInterface mo7054x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof C2276h) {
            return (C2276h) queryLocalInterface;
        }
        return new C2276h(iBinder);
    }
}

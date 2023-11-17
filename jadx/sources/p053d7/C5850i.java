package p053d7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C3943d;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.C3964c;
import p156l6.C6935d;
import p156l6.C6946i;
import p182n6.C7249c;

/* renamed from: d7.i */
public final class C5850i extends C3964c {
    public C5850i(Context context, Looper looper, C7249c cVar, C6935d dVar, C6946i iVar) {
        super(context, looper, 126, cVar, dVar, iVar);
    }

    /* renamed from: A */
    public final Feature[] mo12216A() {
        return C5844c.f18369e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo7049J() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo7050K() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    /* renamed from: X */
    public final boolean mo7051X() {
        return true;
    }

    /* renamed from: q */
    public final int mo7053q() {
        return C3943d.f12557a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* bridge */ /* synthetic */ IInterface mo7054x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        if (queryLocalInterface instanceof C5847f) {
            return (C5847f) queryLocalInterface;
        }
        return new C5847f(iBinder);
    }
}

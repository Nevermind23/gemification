package p157l7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.C3964c;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import p156l6.C6935d;
import p156l6.C6946i;
import p182n6.C7249c;
import p313x7.C8974c;

/* renamed from: l7.h */
public final class C6989h extends C3964c {
    public C6989h(Context context, Looper looper, C6935d dVar, C6946i iVar, C7249c cVar) {
        super(context, looper, 79, cVar, dVar, iVar);
    }

    /* renamed from: A */
    public final Feature[] mo12216A() {
        return C8974c.f25005x;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final Bundle mo7048F() {
        Bundle bundle = new Bundle();
        bundle.putString(C11772k.C11773a.f34186r, "18.2.0");
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo7049J() {
        return "com.google.android.gms.tapandpay.internal.ITapAndPayService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo7050K() {
        return "com.google.android.gms.tapandpay.service.BIND";
    }

    /* renamed from: X */
    public final boolean mo7051X() {
        return true;
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayService");
        if (queryLocalInterface instanceof C6980c0) {
            return (C6980c0) queryLocalInterface;
        }
        return new C6980c0(iBinder);
    }
}

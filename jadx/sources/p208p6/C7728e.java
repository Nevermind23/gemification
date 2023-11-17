package p208p6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.C3964c;
import p066e7.C6040d;
import p156l6.C6935d;
import p156l6.C6946i;
import p182n6.C7249c;
import p182n6.C7274n;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView;

/* renamed from: p6.e */
public final class C7728e extends C3964c {

    /* renamed from: I */
    private final C7274n f22448I;

    public C7728e(Context context, Looper looper, C7249c cVar, C7274n nVar, C6935d dVar, C6946i iVar) {
        super(context, looper, (int) SubsamplingScaleImageView.ORIENTATION_270, cVar, dVar, iVar);
        this.f22448I = nVar;
    }

    /* renamed from: A */
    public final Feature[] mo12216A() {
        return C6040d.f18824b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final Bundle mo7048F() {
        return this.f22448I.mo21644b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo7049J() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo7050K() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final boolean mo12226N() {
        return true;
    }

    /* renamed from: q */
    public final int mo7053q() {
        return 203400000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* synthetic */ IInterface mo7054x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof C7724a) {
            return (C7724a) queryLocalInterface;
        }
        return new C7724a(iBinder);
    }
}

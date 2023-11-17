package p248s7;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.measurement.internal.C4746p3;
import com.google.android.gms.measurement.internal.C4791t4;
import p182n6.C7264i;

/* renamed from: s7.k */
public final class C8257k {

    /* renamed from: a */
    private final C8256j f23457a;

    public C8257k(C8256j jVar) {
        C7264i.m27902k(jVar);
        this.f23457a = jVar;
    }

    /* renamed from: a */
    public final void mo23440a(Context context, Intent intent) {
        C4791t4 H = C4791t4.m18288H(context, (zzcl) null, (Long) null);
        C4746p3 d = H.mo14551d();
        if (intent == null) {
            d.mo14680w().mo14615a("Receiver called with null intent");
            return;
        }
        H.mo14549b();
        String action = intent.getAction();
        d.mo14679v().mo14616b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            d.mo14679v().mo14615a("Starting wakeful intent.");
            this.f23457a.mo14272a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            d.mo14680w().mo14615a("Install Referrer Broadcasts are deprecated");
        }
    }
}

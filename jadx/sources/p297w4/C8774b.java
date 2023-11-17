package p297w4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import p115i4.C6564m;
import p189o0.C7357a;
import p334z4.C9207a;

/* renamed from: w4.b */
public class C8774b extends BroadcastReceiver {

    /* renamed from: b */
    private static C8774b f24637b;

    /* renamed from: a */
    private Context f24638a;

    private C8774b(Context context) {
        this.f24638a = context.getApplicationContext();
    }

    /* renamed from: a */
    private void m32705a() {
        if (!C9207a.m34024c(this)) {
            try {
                C7357a.m28044b(this.f24638a).mo21732e(this);
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* renamed from: b */
    public static C8774b m32706b(Context context) {
        Class<C8774b> cls = C8774b.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            C8774b bVar = f24637b;
            if (bVar != null) {
                return bVar;
            }
            C8774b bVar2 = new C8774b(context);
            f24637b = bVar2;
            bVar2.m32707c();
            return f24637b;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    private void m32707c() {
        if (!C9207a.m34024c(this)) {
            try {
                C7357a.m28044b(this.f24638a).mo21730c(this, new IntentFilter("com.parse.bolts.measurement_event"));
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        if (!C9207a.m34024c(this)) {
            try {
                m32705a();
                super.finalize();
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (!C9207a.m34024c(this)) {
            try {
                C6564m mVar = new C6564m(context);
                String str = "bf_" + intent.getStringExtra("event_name");
                Bundle bundleExtra = intent.getBundleExtra("event_args");
                Bundle bundle = new Bundle();
                for (String next : bundleExtra.keySet()) {
                    bundle.putString(next.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", "").replaceAll("[ -]*$", ""), (String) bundleExtra.get(next));
                }
                mVar.mo20548g(str, bundle);
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }
}

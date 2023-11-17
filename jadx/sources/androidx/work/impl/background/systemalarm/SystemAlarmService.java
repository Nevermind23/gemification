package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.C1635t;
import androidx.work.C2073m;
import androidx.work.impl.background.systemalarm.C1979g;
import p203p1.C7662y;

public class SystemAlarmService extends C1635t implements C1979g.C1982c {

    /* renamed from: g */
    private static final String f5968g = C2073m.m8073i("SystemAlarmService");

    /* renamed from: e */
    private C1979g f5969e;

    /* renamed from: f */
    private boolean f5970f;

    /* renamed from: e */
    private void m7770e() {
        C1979g gVar = new C1979g(this);
        this.f5969e = gVar;
        gVar.mo6794l(this);
    }

    /* renamed from: b */
    public void mo6775b() {
        this.f5970f = true;
        C2073m.m8071e().mo6959a(f5968g, "All commands completed in dispatcher");
        C7662y.m29105a();
        stopSelf();
    }

    public void onCreate() {
        super.onCreate();
        m7770e();
        this.f5970f = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f5970f = true;
        this.f5969e.mo6793j();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f5970f) {
            C2073m.m8071e().mo6963f(f5968g, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.f5969e.mo6793j();
            m7770e();
            this.f5970f = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f5969e.mo6787a(intent, i2);
        return 3;
    }
}

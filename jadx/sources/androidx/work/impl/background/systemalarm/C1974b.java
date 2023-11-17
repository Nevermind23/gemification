package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.C2073m;
import androidx.work.impl.C2006e;
import androidx.work.impl.C2060v;
import androidx.work.impl.C2061w;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C1979g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p190o1.C7386m;
import p190o1.C7399v;

/* renamed from: androidx.work.impl.background.systemalarm.b */
public class C1974b implements C2006e {

    /* renamed from: h */
    private static final String f5972h = C2073m.m8073i("CommandHandler");

    /* renamed from: d */
    private final Context f5973d;

    /* renamed from: e */
    private final Map f5974e = new HashMap();

    /* renamed from: f */
    private final Object f5975f = new Object();

    /* renamed from: g */
    private final C2061w f5976g;

    C1974b(Context context, C2061w wVar) {
        this.f5973d = context;
        this.f5976g = wVar;
    }

    /* renamed from: a */
    static Intent m7777a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* renamed from: b */
    static Intent m7778b(Context context, C7386m mVar) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        return m7790q(intent, mVar);
    }

    /* renamed from: c */
    static Intent m7779c(Context context, C7386m mVar, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return m7790q(intent, mVar);
    }

    /* renamed from: e */
    static Intent m7780e(Context context, C7386m mVar) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        return m7790q(intent, mVar);
    }

    /* renamed from: f */
    static Intent m7781f(Context context, C7386m mVar) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        return m7790q(intent, mVar);
    }

    /* renamed from: g */
    private void m7782g(Intent intent, int i, C1979g gVar) {
        C2073m e = C2073m.m8071e();
        String str = f5972h;
        e.mo6959a(str, "Handling constraints changed " + intent);
        new C1975c(this.f5973d, i, gVar).mo6779a();
    }

    /* renamed from: h */
    private void m7783h(Intent intent, int i, C1979g gVar) {
        synchronized (this.f5975f) {
            C7386m p = m7789p(intent);
            C2073m e = C2073m.m8071e();
            String str = f5972h;
            e.mo6959a(str, "Handing delay met for " + p);
            if (!this.f5974e.containsKey(p)) {
                C1978f fVar = new C1978f(this.f5973d, i, gVar, this.f5976g.mo6915d(p));
                this.f5974e.put(p, fVar);
                fVar.mo6785g();
            } else {
                C2073m e2 = C2073m.m8071e();
                e2.mo6959a(str, "WorkSpec " + p + " is is already being handled for ACTION_DELAY_MET");
            }
        }
    }

    /* renamed from: i */
    private void m7784i(Intent intent, int i) {
        C7386m p = m7789p(intent);
        boolean z = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        C2073m e = C2073m.m8071e();
        String str = f5972h;
        e.mo6959a(str, "Handling onExecutionCompleted " + intent + ", " + i);
        mo6776d(p, z);
    }

    /* renamed from: j */
    private void m7785j(Intent intent, int i, C1979g gVar) {
        C2073m e = C2073m.m8071e();
        String str = f5972h;
        e.mo6959a(str, "Handling reschedule " + intent + ", " + i);
        gVar.mo6791g().mo6831w();
    }

    /* renamed from: k */
    private void m7786k(Intent intent, int i, C1979g gVar) {
        C7386m p = m7789p(intent);
        C2073m e = C2073m.m8071e();
        String str = f5972h;
        e.mo6959a(str, "Handling schedule work for " + p);
        WorkDatabase s = gVar.mo6791g().mo6828s();
        s.mo23807e();
        try {
            C7399v i2 = s.mo6751N().mo21808i(p.mo21770b());
            if (i2 == null) {
                C2073m e2 = C2073m.m8071e();
                e2.mo6966k(str, "Skipping scheduling " + p + " because it's no longer in the DB");
            } else if (i2.f21631b.mo6980b()) {
                C2073m e3 = C2073m.m8071e();
                e3.mo6966k(str, "Skipping scheduling " + p + "because it is finished.");
                s.mo23809i();
            } else {
                long c = i2.mo21785c();
                if (!i2.mo21790h()) {
                    C2073m e4 = C2073m.m8071e();
                    e4.mo6959a(str, "Setting up Alarms for " + p + "at " + c);
                    C1972a.m7774c(this.f5973d, s, p, c);
                } else {
                    C2073m e5 = C2073m.m8071e();
                    e5.mo6959a(str, "Opportunistically setting an alarm for " + p + "at " + c);
                    C1972a.m7774c(this.f5973d, s, p, c);
                    gVar.mo6790f().mo22737a().execute(new C1979g.C1981b(gVar, m7777a(this.f5973d), i));
                }
                s.mo23804F();
                s.mo23809i();
            }
        } finally {
            s.mo23809i();
        }
    }

    /* renamed from: l */
    private void m7787l(Intent intent, C1979g gVar) {
        List<C2060v> list;
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        if (extras.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i = extras.getInt("KEY_WORKSPEC_GENERATION");
            list = new ArrayList<>(1);
            C2060v b = this.f5976g.mo6913b(new C7386m(string, i));
            if (b != null) {
                list.add(b);
            }
        } else {
            list = this.f5976g.mo6914c(string);
        }
        for (C2060v vVar : list) {
            C2073m e = C2073m.m8071e();
            String str = f5972h;
            e.mo6959a(str, "Handing stopWork work for " + string);
            gVar.mo6791g().mo6814B(vVar);
            C1972a.m7772a(this.f5973d, gVar.mo6791g().mo6828s(), vVar.mo6911a());
            gVar.mo6776d(vVar.mo6911a(), false);
        }
    }

    /* renamed from: m */
    private static boolean m7788m(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    static C7386m m7789p(Intent intent) {
        return new C7386m(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    /* renamed from: q */
    private static Intent m7790q(Intent intent, C7386m mVar) {
        intent.putExtra("KEY_WORKSPEC_ID", mVar.mo21770b());
        intent.putExtra("KEY_WORKSPEC_GENERATION", mVar.mo21769a());
        return intent;
    }

    /* renamed from: d */
    public void mo6776d(C7386m mVar, boolean z) {
        synchronized (this.f5975f) {
            C1978f fVar = (C1978f) this.f5974e.remove(mVar);
            this.f5976g.mo6913b(mVar);
            if (fVar != null) {
                fVar.mo6786h(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo6777n() {
        boolean z;
        synchronized (this.f5975f) {
            if (!this.f5974e.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo6778o(Intent intent, int i, C1979g gVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m7782g(intent, i, gVar);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            m7785j(intent, i, gVar);
        } else if (!m7788m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            C2073m e = C2073m.m8071e();
            String str = f5972h;
            e.mo6961c(str, "Invalid request for " + action + " , requires " + "KEY_WORKSPEC_ID" + " .");
        } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            m7786k(intent, i, gVar);
        } else if ("ACTION_DELAY_MET".equals(action)) {
            m7783h(intent, i, gVar);
        } else if ("ACTION_STOP_WORK".equals(action)) {
            m7787l(intent, gVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            m7784i(intent, i);
        } else {
            C2073m e2 = C2073m.m8071e();
            String str2 = f5972h;
            e2.mo6966k(str2, "Ignoring intent " + intent);
        }
    }
}

package com.medallia.digital.mobilesdk;

import android.os.Handler;
import android.os.Looper;
import com.medallia.digital.mobilesdk.C11020n7;
import com.medallia.digital.mobilesdk.C11164w3;
import com.medallia.digital.mobilesdk.C11209y1;
import java.util.ArrayList;

/* renamed from: com.medallia.digital.mobilesdk.c7 */
class C10766c7 implements C11164w3.C11172h, C10769c8, C11020n7.C11023b<C11209y1.C11211b>, C11229y6 {

    /* renamed from: a */
    private final C10781d7 f30835a = new C10781d7();

    /* renamed from: b */
    protected C11020n7 f30836b = new C11020n7(500, this);

    /* renamed from: c */
    protected boolean f30837c;

    /* renamed from: d */
    protected boolean f30838d;

    /* renamed from: e */
    protected C10727a7 f30839e;

    /* renamed from: f */
    protected boolean f30840f;

    /* renamed from: g */
    protected boolean f30841g;

    /* renamed from: h */
    private final ArrayList<C11199x1> f30842h = new ArrayList<>();

    /* renamed from: i */
    private Long f30843i;

    /* renamed from: j */
    private final Handler f30844j = new Handler(Looper.getMainLooper());

    /* renamed from: k */
    private final C11033o4 f30845k = new C10767a();

    /* renamed from: com.medallia.digital.mobilesdk.c7$a */
    class C10767a extends C11033o4 {

        /* renamed from: com.medallia.digital.mobilesdk.c7$a$a */
        class C10768a extends C11033o4 {
            C10768a() {
            }

            /* renamed from: a */
            public void mo27617a() {
                C10766c7.this.mo28130a(C11209y1.C11211b.evaluationTimer);
            }
        }

        C10767a() {
        }

        /* renamed from: a */
        public void mo27617a() {
            C11004m7.m40304b().mo28763a().execute(new C10768a());
        }
    }

    protected C10766c7() {
    }

    /* renamed from: d */
    private void m39278d() {
        m39280f();
        m39279e();
    }

    /* renamed from: e */
    private void m39279e() {
        Long l = this.f30843i;
        if (l != null) {
            this.f30844j.postDelayed(this.f30845k, l.longValue());
        }
    }

    /* renamed from: f */
    private void m39280f() {
        C10735b4.m39109b("Evaluation timer stopped");
        this.f30844j.removeCallbacks(this.f30845k);
    }

    /* renamed from: a */
    public C11205x6 mo28127a() {
        return C11205x6.V2;
    }

    /* renamed from: b */
    public ArrayList<C11199x1> mo28136b() {
        return this.f30842h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo28235c(boolean z) {
        boolean z2 = this.f30837c;
        this.f30837c = z;
        if (!z2 || z) {
            mo28130a(C11209y1.C11211b.enableIntercept);
        } else {
            m39280f();
        }
    }

    public void clearAndDisconnect() {
    }

    public void onBackground() {
        m39280f();
    }

    public void onForeground() {
        if (this.f30843i != null) {
            this.f30843i = Long.valueOf((CollectorsInfrastructure.getInstance() == null || CollectorsInfrastructure.getInstance().getTimeInBackground() == null || this.f30843i.longValue() <= CollectorsInfrastructure.getInstance().getTimeInBackground().longValue()) ? 1000 : this.f30843i.longValue() - CollectorsInfrastructure.getInstance().getTimeInBackground().longValue());
        }
        m39278d();
    }

    /* renamed from: a */
    public void mo28128a(ConfigurationContract configurationContract) {
        AnalyticsBridge.getInstance().setTreResourceReady(true);
        AnalyticsBridge.getInstance().reportResourcesSizeEvent();
        if (configurationContract != null && configurationContract.getTargetEvaluatorContract() != null) {
            this.f30840f = false;
            if (!(configurationContract.getSdkConfiguration() == null || configurationContract.getSdkConfiguration().getMedalliaDigitalBrain() == null)) {
                this.f30841g = configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().isCanBlockAfterOneSuccess();
            }
            this.f30839e = configurationContract.getTargetEvaluatorContract();
            mo28130a(C11209y1.C11211b.updateConfiguration);
        }
    }

    /* renamed from: b */
    public void mo28132a(C11209y1.C11211b bVar) {
        if (this.f30838d) {
            C10735b4.m39113e("Evaluate can’t be trigger because of stop sdk");
        } else if (!this.f30837c) {
            C10735b4.m39109b("Intercept is not enabled, evaluate won't run");
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            C10735b4.m39109b("Start evaluation");
            EvaluationResult a = this.f30835a.mo28249a(this.f30839e);
            C10735b4.m39109b("End of evaluation: " + a.toJsonString());
            this.f30843i = a.getNextEvaluationTime();
            if (a.getEngagementId() != null) {
                this.f30840f = true;
                C10827g3.m39512d().mo28345b(a.getEngagementId(), a.getEngagementType(), System.currentTimeMillis());
            } else if (this.f30843i != null) {
                m39278d();
            }
            m39277a(a.getEngagementId(), a.toJsonString(), currentTimeMillis, bVar);
        }
    }

    /* renamed from: c */
    public boolean mo28140c() {
        return this.f30837c;
    }

    /* renamed from: a */
    public void mo28130a(C11209y1.C11211b bVar) {
        if (!this.f30837c) {
            C10735b4.m39109b("Intercept is not enabled, evaluate won't run");
        } else if (this.f30841g && this.f30840f) {
            C10735b4.m39109b("Skip evaluation intercept was already shown in session");
        } else if (this.f30839e == null) {
            C10735b4.m39111c("Target evaluator json is missing");
        } else {
            C11020n7 n7Var = this.f30836b;
            if (n7Var == null) {
                C10735b4.m39111c("Throttle is null");
            } else {
                n7Var.mo28841a(bVar);
            }
        }
    }

    /* renamed from: b */
    public void mo28138b(boolean z) {
        mo28235c(z);
    }

    /* renamed from: a */
    private void m39277a(String str, String str2, long j, C11209y1.C11211b bVar) {
        C11013n2 c = C11138v2.m40821f().mo29070c(str);
        AnalyticsBridge.getInstance().reportNativeTargetEvaluatorEvent(j, System.currentTimeMillis(), c != null ? str : null, c != null ? c.mo28796c() : null, str2, bVar.name());
    }

    /* renamed from: a */
    public void mo28133a(boolean z) {
        this.f30838d = z;
    }

    /* renamed from: a */
    public void mo28134a(boolean z, boolean z2) {
        this.f30837c = z;
        this.f30838d = z2;
    }
}

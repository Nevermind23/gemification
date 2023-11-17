package com.threatmetrix.TrustDefender;

import java.util.Timer;
import java.util.TimerTask;
import p585re.C17584a;
import p585re.C17591h;
import p585re.C17603t;

/* renamed from: com.threatmetrix.TrustDefender.d */
public class C11889d extends peppep {

    /* renamed from: C */
    private static final String f34804C = C11907h.m43615j(C11889d.class);

    /* renamed from: D */
    private static volatile C11889d f34805D = null;

    /* renamed from: A */
    private Timer f34806A;

    /* renamed from: B */
    private int f34807B;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public volatile boolean f34808z = true;

    /* renamed from: com.threatmetrix.TrustDefender.d$a */
    public class C11890a extends TimerTask {
        public C11890a() {
        }

        public void run() {
            synchronized (this) {
                if (!C11889d.this.f34808z) {
                    C11889d.this.f35090t = false;
                }
            }
        }
    }

    private C11889d() {
        super(new C11991t0(), new C12010y(), new C11881b1());
    }

    /* renamed from: G */
    private static synchronized C11889d m43564G() {
        synchronized (C11889d.class) {
            C11889d dVar = f34805D;
            if (dVar != null) {
                return dVar;
            }
            C11889d dVar2 = new C11889d();
            f34805D = dVar2;
            peppep.f35070y = new C11923l();
            return dVar2;
        }
    }

    /* renamed from: K */
    public static C11889d m43566K() {
        C11889d dVar = f34805D;
        return dVar != null ? dVar : m43564G();
    }

    /* renamed from: D */
    public /* bridge */ /* synthetic */ void mo31934D(C17584a aVar) {
        super.mo31934D(aVar);
    }

    /* renamed from: E */
    public /* bridge */ /* synthetic */ C11899f mo31935E(C11903g gVar, C11883c cVar) {
        return super.mo31935E(gVar, cVar);
    }

    /* renamed from: H */
    public void mo31936H() {
        synchronized (this) {
            this.f34808z = true;
            this.f35090t = true;
            Timer timer = this.f34806A;
            if (timer != null) {
                timer.cancel();
            }
            C11907h.m43607b(f34804C, "Screen is on profiling is unblocked.");
        }
    }

    /* renamed from: J */
    public void mo31937J() {
        this.f34808z = false;
        String str = f34804C;
        C11907h.m43607b(str, "Screen is off, any future profiling will be blocked after " + this.f34807B + " milliseconds.");
        Timer timer = this.f34806A;
        if (timer != null) {
            timer.cancel();
        }
        this.f34806A = new Timer();
        this.f34806A.schedule(new C11890a(), (long) this.f34807B);
    }

    /* renamed from: j */
    public void mo31938j(C17603t tVar) {
        if (this.f34807B > 0) {
            C17591h.m61175a(this, tVar);
        }
    }

    /* renamed from: q */
    public void mo31939q(C17584a aVar) {
        this.f34808z = true;
        this.f34807B = peppep.m43866l(aVar.mo45128m(), C17584a.f49136s, "screenOffTimeout");
        Timer timer = this.f34806A;
        if (timer != null) {
            timer.cancel();
        }
        peppep.m43873t(aVar.mo45129n(), 0, "LowPowerUpdateTime");
        peppep.m43873t(aVar.mo45123h(), 0, "HighPowerUpdateTime");
        peppep.m43866l(aVar.mo45118c(), 2, "location accuracy");
        peppep.f35070y.mo31968e(aVar.mo45130o().f49314a);
    }
}

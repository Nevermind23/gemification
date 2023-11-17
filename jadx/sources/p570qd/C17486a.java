package p570qd;

import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView;
import p458id.C15600b;
import p472jd.C15749f;

/* renamed from: qd.a */
public class C17486a {

    /* renamed from: e */
    private static final C15600b f48925e = C15600b.m56349a(C17486a.class.getSimpleName());

    /* renamed from: a */
    private C15749f f48926a;

    /* renamed from: b */
    int f48927b = 0;

    /* renamed from: c */
    int f48928c = 0;

    /* renamed from: d */
    int f48929d = 0;

    /* renamed from: qd.a$a */
    static /* synthetic */ class C17487a {

        /* renamed from: a */
        static final /* synthetic */ int[] f48930a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                qd.c[] r0 = p570qd.C17489c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f48930a = r0
                qd.c r1 = p570qd.C17489c.VIEW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f48930a     // Catch:{ NoSuchFieldError -> 0x001d }
                qd.c r1 = p570qd.C17489c.OUTPUT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f48930a     // Catch:{ NoSuchFieldError -> 0x0028 }
                qd.c r1 = p570qd.C17489c.SENSOR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p570qd.C17486a.C17487a.<clinit>():void");
        }
    }

    /* renamed from: a */
    private int m60986a(C17489c cVar, C17489c cVar2) {
        if (cVar == cVar2) {
            return 0;
        }
        C17489c cVar3 = C17489c.BASE;
        if (cVar2 == cVar3) {
            return m60989f(360 - m60986a(cVar2, cVar));
        }
        if (cVar != cVar3) {
            return m60989f(m60986a(cVar3, cVar2) - m60986a(cVar3, cVar));
        }
        int i = C17487a.f48930a[cVar2.ordinal()];
        if (i == 1) {
            return m60989f(360 - this.f48928c);
        }
        if (i == 2) {
            return m60989f(this.f48929d);
        }
        if (i == 3) {
            return m60989f(360 - this.f48927b);
        }
        throw new RuntimeException("Unknown reference: " + cVar2);
    }

    /* renamed from: d */
    private void m60987d() {
        f48925e.mo42878c("Angles changed:", "sensorOffset:", Integer.valueOf(this.f48927b), "displayOffset:", Integer.valueOf(this.f48928c), "deviceOrientation:", Integer.valueOf(this.f48929d));
    }

    /* renamed from: e */
    private void m60988e(int i) {
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            throw new IllegalStateException("This value is not sanitized: " + i);
        }
    }

    /* renamed from: f */
    private int m60989f(int i) {
        return (i + 360) % 360;
    }

    /* renamed from: b */
    public boolean mo45009b(C17489c cVar, C17489c cVar2) {
        return mo45010c(cVar, cVar2, C17488b.ABSOLUTE) % SubsamplingScaleImageView.ORIENTATION_180 != 0;
    }

    /* renamed from: c */
    public int mo45010c(C17489c cVar, C17489c cVar2, C17488b bVar) {
        int a = m60986a(cVar, cVar2);
        if (bVar == C17488b.RELATIVE_TO_SENSOR && this.f48926a == C15749f.FRONT) {
            return m60989f(360 - a);
        }
        return a;
    }

    /* renamed from: g */
    public void mo45011g(int i) {
        m60988e(i);
        this.f48929d = i;
        m60987d();
    }

    /* renamed from: h */
    public void mo45012h(int i) {
        m60988e(i);
        this.f48928c = i;
        m60987d();
    }

    /* renamed from: i */
    public void mo45013i(C15749f fVar, int i) {
        m60988e(i);
        this.f48926a = fVar;
        this.f48927b = i;
        if (fVar == C15749f.FRONT) {
            this.f48927b = m60989f(360 - i);
        }
        m60987d();
    }
}

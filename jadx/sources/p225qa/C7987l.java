package p225qa;

import com.google.protobuf.C5716s;

/* renamed from: qa.l */
public enum C7987l implements C5716s.C5717a {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);
    

    /* renamed from: g */
    private static final C5716s.C5718b f23037g = null;

    /* renamed from: d */
    private final int f23039d;

    /* renamed from: qa.l$a */
    class C7988a implements C5716s.C5718b {
        C7988a() {
        }
    }

    /* renamed from: qa.l$b */
    private static final class C7989b implements C5716s.C5719c {

        /* renamed from: a */
        static final C5716s.C5719c f23040a = null;

        static {
            f23040a = new C7989b();
        }

        private C7989b() {
        }
    }

    static {
        f23037g = new C7988a();
    }

    private C7987l(int i) {
        this.f23039d = i;
    }

    /* renamed from: a */
    public static C7987l m30322a(int i) {
        if (i == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    /* renamed from: b */
    public static C5716s.C5719c m30323b() {
        return C7989b.f23040a;
    }

    /* renamed from: i */
    public final int mo18790i() {
        return this.f23039d;
    }
}

package p225qa;

import com.google.protobuf.C5688i0;
import com.google.protobuf.C5708p0;
import com.google.protobuf.C5709q;
import com.google.protobuf.C5716s;
import com.google.protobuf.C5723t;

/* renamed from: qa.k */
public final class C7983k extends C5709q implements C5688i0 {
    /* access modifiers changed from: private */
    public static final C7983k DEFAULT_INSTANCE;
    private static volatile C5708p0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final C5723t sessionVerbosity_converter_ = new C7984a();
    private int bitField0_;
    private String sessionId_ = "";
    private C5716s.C5720d sessionVerbosity_ = C5709q.m22938x();

    /* renamed from: qa.k$a */
    class C7984a implements C5723t {
        C7984a() {
        }
    }

    /* renamed from: qa.k$b */
    static /* synthetic */ class C7985b {

        /* renamed from: a */
        static final /* synthetic */ int[] f23034a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.q$c[] r0 = com.google.protobuf.C5709q.C5712c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23034a = r0
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23034a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23034a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f23034a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f23034a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f23034a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f23034a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p225qa.C7983k.C7985b.<clinit>():void");
        }
    }

    /* renamed from: qa.k$c */
    public static final class C7986c extends C5709q.C5710a implements C5688i0 {
        /* synthetic */ C7986c(C7984a aVar) {
            this();
        }

        /* renamed from: A */
        public C7986c mo23112A(String str) {
            mo18771r();
            ((C7983k) this.f18051e).m30316a0(str);
            return this;
        }

        /* renamed from: z */
        public C7986c mo23113z(C7987l lVar) {
            mo18771r();
            ((C7983k) this.f18051e).m30313V(lVar);
            return this;
        }

        private C7986c() {
            super(C7983k.DEFAULT_INSTANCE);
        }
    }

    static {
        C7983k kVar = new C7983k();
        DEFAULT_INSTANCE = kVar;
        C5709q.m22936P(C7983k.class, kVar);
    }

    private C7983k() {
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public void m30313V(C7987l lVar) {
        lVar.getClass();
        m30314W();
        this.sessionVerbosity_.mo18784p(lVar.mo18790i());
    }

    /* renamed from: W */
    private void m30314W() {
        C5716s.C5720d dVar = this.sessionVerbosity_;
        if (!dVar.mo18543G0()) {
            this.sessionVerbosity_ = C5709q.m22933K(dVar);
        }
    }

    /* renamed from: Z */
    public static C7986c m30315Z() {
        return (C7986c) DEFAULT_INSTANCE.mo18762t();
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m30316a0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* renamed from: X */
    public C7987l mo23110X(int i) {
        C7987l a = C7987l.m30322a(this.sessionVerbosity_.getInt(i));
        if (a == null) {
            return C7987l.SESSION_VERBOSITY_NONE;
        }
        return a;
    }

    /* renamed from: Y */
    public int mo23111Y() {
        return this.sessionVerbosity_.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo18766w(C5709q.C5712c cVar, Object obj, Object obj2) {
        switch (C7985b.f23034a[cVar.ordinal()]) {
            case 1:
                return new C7983k();
            case 2:
                return new C7986c((C7984a) null);
            case 3:
                return C5709q.m22935N(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", C7987l.m30323b()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C5708p0 p0Var = PARSER;
                if (p0Var == null) {
                    synchronized (C7983k.class) {
                        p0Var = PARSER;
                        if (p0Var == null) {
                            p0Var = new C5709q.C5711b(DEFAULT_INSTANCE);
                            PARSER = p0Var;
                        }
                    }
                }
                return p0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package p225qa;

import com.google.protobuf.C5688i0;
import com.google.protobuf.C5708p0;
import com.google.protobuf.C5709q;
import com.google.protobuf.C5716s;

/* renamed from: qa.g */
public final class C7966g extends C5709q implements C5688i0 {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final C7966g DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile C5708p0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private C5716s.C5721e androidMemoryReadings_ = C5709q.m22939y();
    private int bitField0_;
    private C5716s.C5721e cpuMetricReadings_ = C5709q.m22939y();
    private C7963f gaugeMetadata_;
    private String sessionId_ = "";

    /* renamed from: qa.g$a */
    static /* synthetic */ class C7967a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23010a;

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
                f23010a = r0
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23010a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23010a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f23010a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f23010a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f23010a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f23010a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p225qa.C7966g.C7967a.<clinit>():void");
        }
    }

    /* renamed from: qa.g$b */
    public static final class C7968b extends C5709q.C5710a implements C5688i0 {
        /* synthetic */ C7968b(C7967a aVar) {
            this();
        }

        /* renamed from: A */
        public C7968b mo23058A(C7960e eVar) {
            mo18771r();
            ((C7966g) this.f18051e).m30186Y(eVar);
            return this;
        }

        /* renamed from: B */
        public C7968b mo23059B(C7963f fVar) {
            mo18771r();
            ((C7966g) this.f18051e).m30191i0(fVar);
            return this;
        }

        /* renamed from: C */
        public C7968b mo23060C(String str) {
            mo18771r();
            ((C7966g) this.f18051e).m30192j0(str);
            return this;
        }

        /* renamed from: z */
        public C7968b mo23061z(C7950b bVar) {
            mo18771r();
            ((C7966g) this.f18051e).m30185X(bVar);
            return this;
        }

        private C7968b() {
            super(C7966g.DEFAULT_INSTANCE);
        }
    }

    static {
        C7966g gVar = new C7966g();
        DEFAULT_INSTANCE = gVar;
        C5709q.m22936P(C7966g.class, gVar);
    }

    private C7966g() {
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m30185X(C7950b bVar) {
        bVar.getClass();
        m30187Z();
        this.androidMemoryReadings_.add(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m30186Y(C7960e eVar) {
        eVar.getClass();
        m30188a0();
        this.cpuMetricReadings_.add(eVar);
    }

    /* renamed from: Z */
    private void m30187Z() {
        C5716s.C5721e eVar = this.androidMemoryReadings_;
        if (!eVar.mo18543G0()) {
            this.androidMemoryReadings_ = C5709q.m22934L(eVar);
        }
    }

    /* renamed from: a0 */
    private void m30188a0() {
        C5716s.C5721e eVar = this.cpuMetricReadings_;
        if (!eVar.mo18543G0()) {
            this.cpuMetricReadings_ = C5709q.m22934L(eVar);
        }
    }

    /* renamed from: d0 */
    public static C7966g m30189d0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: h0 */
    public static C7968b m30190h0() {
        return (C7968b) DEFAULT_INSTANCE.mo18762t();
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m30191i0(C7963f fVar) {
        fVar.getClass();
        this.gaugeMetadata_ = fVar;
        this.bitField0_ |= 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public void m30192j0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* renamed from: b0 */
    public int mo23053b0() {
        return this.androidMemoryReadings_.size();
    }

    /* renamed from: c0 */
    public int mo23054c0() {
        return this.cpuMetricReadings_.size();
    }

    /* renamed from: e0 */
    public C7963f mo23055e0() {
        C7963f fVar = this.gaugeMetadata_;
        return fVar == null ? C7963f.m30170W() : fVar;
    }

    /* renamed from: f0 */
    public boolean mo23056f0() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: g0 */
    public boolean mo23057g0() {
        return (this.bitField0_ & 1) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo18766w(C5709q.C5712c cVar, Object obj, Object obj2) {
        switch (C7967a.f23010a[cVar.ordinal()]) {
            case 1:
                return new C7966g();
            case 2:
                return new C7968b((C7967a) null);
            case 3:
                return C5709q.m22935N(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", C7960e.class, "gaugeMetadata_", "androidMemoryReadings_", C7950b.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C5708p0 p0Var = PARSER;
                if (p0Var == null) {
                    synchronized (C7966g.class) {
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

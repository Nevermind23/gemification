package p225qa;

import com.google.protobuf.C5708p0;
import com.google.protobuf.C5709q;
import p225qa.C7953c;

/* renamed from: qa.i */
public final class C7979i extends C5709q implements C7982j {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final C7979i DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile C5708p0 PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private C7953c applicationInfo_;
    private int bitField0_;
    private C7966g gaugeMetric_;
    private C7969h networkRequestMetric_;
    private C7990m traceMetric_;
    private C7995n transportInfo_;

    /* renamed from: qa.i$a */
    static /* synthetic */ class C7980a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23033a;

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
                f23033a = r0
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23033a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23033a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f23033a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f23033a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f23033a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f23033a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p225qa.C7979i.C7980a.<clinit>():void");
        }
    }

    /* renamed from: qa.i$b */
    public static final class C7981b extends C5709q.C5710a implements C7982j {
        /* synthetic */ C7981b(C7980a aVar) {
            this();
        }

        /* renamed from: A */
        public C7981b mo23106A(C7966g gVar) {
            mo18771r();
            ((C7979i) this.f18051e).m30282b0(gVar);
            return this;
        }

        /* renamed from: B */
        public C7981b mo23107B(C7969h hVar) {
            mo18771r();
            ((C7979i) this.f18051e).m30283c0(hVar);
            return this;
        }

        /* renamed from: C */
        public C7981b mo23108C(C7990m mVar) {
            mo18771r();
            ((C7979i) this.f18051e).m30284d0(mVar);
            return this;
        }

        /* renamed from: a */
        public boolean mo23100a() {
            return ((C7979i) this.f18051e).mo23100a();
        }

        /* renamed from: b */
        public boolean mo23101b() {
            return ((C7979i) this.f18051e).mo23101b();
        }

        /* renamed from: c */
        public C7969h mo23102c() {
            return ((C7979i) this.f18051e).mo23102c();
        }

        /* renamed from: h */
        public boolean mo23103h() {
            return ((C7979i) this.f18051e).mo23103h();
        }

        /* renamed from: j */
        public C7990m mo23104j() {
            return ((C7979i) this.f18051e).mo23104j();
        }

        /* renamed from: k */
        public C7966g mo23105k() {
            return ((C7979i) this.f18051e).mo23105k();
        }

        /* renamed from: z */
        public C7981b mo23109z(C7953c.C7955b bVar) {
            mo18771r();
            ((C7979i) this.f18051e).m30281a0((C7953c) bVar.mo18768o());
            return this;
        }

        private C7981b() {
            super(C7979i.DEFAULT_INSTANCE);
        }
    }

    static {
        C7979i iVar = new C7979i();
        DEFAULT_INSTANCE = iVar;
        C5709q.m22936P(C7979i.class, iVar);
    }

    private C7979i() {
    }

    /* renamed from: Z */
    public static C7981b m30280Z() {
        return (C7981b) DEFAULT_INSTANCE.mo18762t();
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m30281a0(C7953c cVar) {
        cVar.getClass();
        this.applicationInfo_ = cVar;
        this.bitField0_ |= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m30282b0(C7966g gVar) {
        gVar.getClass();
        this.gaugeMetric_ = gVar;
        this.bitField0_ |= 8;
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m30283c0(C7969h hVar) {
        hVar.getClass();
        this.networkRequestMetric_ = hVar;
        this.bitField0_ |= 4;
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m30284d0(C7990m mVar) {
        mVar.getClass();
        this.traceMetric_ = mVar;
        this.bitField0_ |= 2;
    }

    /* renamed from: X */
    public C7953c mo23098X() {
        C7953c cVar = this.applicationInfo_;
        return cVar == null ? C7953c.m30132Z() : cVar;
    }

    /* renamed from: Y */
    public boolean mo23099Y() {
        return (this.bitField0_ & 1) != 0;
    }

    /* renamed from: a */
    public boolean mo23100a() {
        return (this.bitField0_ & 8) != 0;
    }

    /* renamed from: b */
    public boolean mo23101b() {
        return (this.bitField0_ & 4) != 0;
    }

    /* renamed from: c */
    public C7969h mo23102c() {
        C7969h hVar = this.networkRequestMetric_;
        return hVar == null ? C7969h.m30232k0() : hVar;
    }

    /* renamed from: h */
    public boolean mo23103h() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: j */
    public C7990m mo23104j() {
        C7990m mVar = this.traceMetric_;
        return mVar == null ? C7990m.m30344m0() : mVar;
    }

    /* renamed from: k */
    public C7966g mo23105k() {
        C7966g gVar = this.gaugeMetric_;
        return gVar == null ? C7966g.m30189d0() : gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo18766w(C5709q.C5712c cVar, Object obj, Object obj2) {
        switch (C7980a.f23033a[cVar.ordinal()]) {
            case 1:
                return new C7979i();
            case 2:
                return new C7981b((C7980a) null);
            case 3:
                return C5709q.m22935N(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C5708p0 p0Var = PARSER;
                if (p0Var == null) {
                    synchronized (C7979i.class) {
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

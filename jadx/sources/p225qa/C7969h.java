package p225qa;

import com.google.protobuf.C5627a;
import com.google.protobuf.C5629a0;
import com.google.protobuf.C5635b0;
import com.google.protobuf.C5679h1;
import com.google.protobuf.C5688i0;
import com.google.protobuf.C5708p0;
import com.google.protobuf.C5709q;
import com.google.protobuf.C5716s;
import com.salesforce.marketingcloud.C11398b;
import java.util.List;

/* renamed from: qa.h */
public final class C7969h extends C5709q implements C5688i0 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    /* access modifiers changed from: private */
    public static final C7969h DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile C5708p0 PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private C5635b0 customAttributes_ = C5635b0.m22451d();
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private C5716s.C5721e perfSessions_ = C5709q.m22939y();
    private long requestPayloadBytes_;
    private String responseContentType_ = "";
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private String url_ = "";

    /* renamed from: qa.h$a */
    static /* synthetic */ class C7970a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23011a;

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
                f23011a = r0
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23011a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23011a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f23011a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f23011a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f23011a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f23011a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p225qa.C7969h.C7970a.<clinit>():void");
        }
    }

    /* renamed from: qa.h$b */
    public static final class C7971b extends C5709q.C5710a implements C5688i0 {
        /* synthetic */ C7971b(C7970a aVar) {
            this();
        }

        /* renamed from: A */
        public C7971b mo23081A() {
            mo18771r();
            ((C7969h) this.f18051e).m30230h0();
            return this;
        }

        /* renamed from: B */
        public long mo23082B() {
            return ((C7969h) this.f18051e).mo23075u0();
        }

        /* renamed from: C */
        public boolean mo23083C() {
            return ((C7969h) this.f18051e).mo23077w0();
        }

        /* renamed from: D */
        public boolean mo23084D() {
            return ((C7969h) this.f18051e).mo23079y0();
        }

        /* renamed from: E */
        public boolean mo23085E() {
            return ((C7969h) this.f18051e).mo23064C0();
        }

        /* renamed from: F */
        public C7971b mo23086F(long j) {
            mo18771r();
            ((C7969h) this.f18051e).m30204F0(j);
            return this;
        }

        /* renamed from: G */
        public C7971b mo23087G(C7973d dVar) {
            mo18771r();
            ((C7969h) this.f18051e).m30205G0(dVar);
            return this;
        }

        /* renamed from: H */
        public C7971b mo23088H(int i) {
            mo18771r();
            ((C7969h) this.f18051e).m30206H0(i);
            return this;
        }

        /* renamed from: I */
        public C7971b mo23089I(C7976e eVar) {
            mo18771r();
            ((C7969h) this.f18051e).m30207I0(eVar);
            return this;
        }

        /* renamed from: J */
        public C7971b mo23090J(long j) {
            mo18771r();
            ((C7969h) this.f18051e).m30208J0(j);
            return this;
        }

        /* renamed from: K */
        public C7971b mo23091K(String str) {
            mo18771r();
            ((C7969h) this.f18051e).m30209K0(str);
            return this;
        }

        /* renamed from: L */
        public C7971b mo23092L(long j) {
            mo18771r();
            ((C7969h) this.f18051e).m30210L0(j);
            return this;
        }

        /* renamed from: M */
        public C7971b mo23093M(long j) {
            mo18771r();
            ((C7969h) this.f18051e).m30211M0(j);
            return this;
        }

        /* renamed from: N */
        public C7971b mo23094N(long j) {
            mo18771r();
            ((C7969h) this.f18051e).m30212N0(j);
            return this;
        }

        /* renamed from: O */
        public C7971b mo23095O(long j) {
            mo18771r();
            ((C7969h) this.f18051e).m30213O0(j);
            return this;
        }

        /* renamed from: P */
        public C7971b mo23096P(String str) {
            mo18771r();
            ((C7969h) this.f18051e).m30214P0(str);
            return this;
        }

        /* renamed from: z */
        public C7971b mo23097z(Iterable iterable) {
            mo18771r();
            ((C7969h) this.f18051e).m30229g0(iterable);
            return this;
        }

        private C7971b() {
            super(C7969h.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: qa.h$c */
    private static final class C7972c {

        /* renamed from: a */
        static final C5629a0 f23012a;

        static {
            C5679h1.C5681b bVar = C5679h1.C5681b.STRING;
            f23012a = C5629a0.m22439d(bVar, "", bVar, "");
        }
    }

    /* renamed from: qa.h$d */
    public enum C7973d implements C5716s.C5717a {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);
        

        /* renamed from: o */
        private static final C5716s.C5718b f23023o = null;

        /* renamed from: d */
        private final int f23025d;

        /* renamed from: qa.h$d$a */
        class C7974a implements C5716s.C5718b {
            C7974a() {
            }
        }

        /* renamed from: qa.h$d$b */
        private static final class C7975b implements C5716s.C5719c {

            /* renamed from: a */
            static final C5716s.C5719c f23026a = null;

            static {
                f23026a = new C7975b();
            }

            private C7975b() {
            }
        }

        static {
            f23023o = new C7974a();
        }

        private C7973d(int i) {
            this.f23025d = i;
        }

        /* renamed from: a */
        public static C7973d m30270a(int i) {
            switch (i) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        /* renamed from: b */
        public static C5716s.C5719c m30271b() {
            return C7975b.f23026a;
        }

        /* renamed from: i */
        public final int mo18790i() {
            return this.f23025d;
        }
    }

    /* renamed from: qa.h$e */
    public enum C7976e implements C5716s.C5717a {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);
        

        /* renamed from: g */
        private static final C5716s.C5718b f23029g = null;

        /* renamed from: d */
        private final int f23031d;

        /* renamed from: qa.h$e$a */
        class C7977a implements C5716s.C5718b {
            C7977a() {
            }
        }

        /* renamed from: qa.h$e$b */
        private static final class C7978b implements C5716s.C5719c {

            /* renamed from: a */
            static final C5716s.C5719c f23032a = null;

            static {
                f23032a = new C7978b();
            }

            private C7978b() {
            }
        }

        static {
            f23029g = new C7977a();
        }

        private C7976e(int i) {
            this.f23031d = i;
        }

        /* renamed from: a */
        public static C5716s.C5719c m30273a() {
            return C7978b.f23032a;
        }

        /* renamed from: i */
        public final int mo18790i() {
            return this.f23031d;
        }
    }

    static {
        C7969h hVar = new C7969h();
        DEFAULT_INSTANCE = hVar;
        C5709q.m22936P(C7969h.class, hVar);
    }

    private C7969h() {
    }

    /* renamed from: E0 */
    public static C7971b m30203E0() {
        return (C7971b) DEFAULT_INSTANCE.mo18762t();
    }

    /* access modifiers changed from: private */
    /* renamed from: F0 */
    public void m30204F0(long j) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: G0 */
    public void m30205G0(C7973d dVar) {
        this.httpMethod_ = dVar.mo18790i();
        this.bitField0_ |= 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: H0 */
    public void m30206H0(int i) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: I0 */
    public void m30207I0(C7976e eVar) {
        this.networkClientErrorReason_ = eVar.mo18790i();
        this.bitField0_ |= 16;
    }

    /* access modifiers changed from: private */
    /* renamed from: J0 */
    public void m30208J0(long j) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: K0 */
    public void m30209K0(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: L0 */
    public void m30210L0(long j) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: M0 */
    public void m30211M0(long j) {
        this.bitField0_ |= C11398b.f33139r;
        this.timeToRequestCompletedUs_ = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: N0 */
    public void m30212N0(long j) {
        this.bitField0_ |= C11398b.f33141t;
        this.timeToResponseCompletedUs_ = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: O0 */
    public void m30213O0(long j) {
        this.bitField0_ |= C11398b.f33140s;
        this.timeToResponseInitiatedUs_ = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: P0 */
    public void m30214P0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m30229g0(Iterable iterable) {
        m30231i0();
        C5627a.m22431i(iterable, this.perfSessions_);
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public void m30230h0() {
        this.bitField0_ &= -65;
        this.responseContentType_ = m30232k0().mo23071p0();
    }

    /* renamed from: i0 */
    private void m30231i0() {
        C5716s.C5721e eVar = this.perfSessions_;
        if (!eVar.mo18543G0()) {
            this.perfSessions_ = C5709q.m22934L(eVar);
        }
    }

    /* renamed from: k0 */
    public static C7969h m30232k0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: A0 */
    public boolean mo23062A0() {
        return (this.bitField0_ & 8) != 0;
    }

    /* renamed from: B0 */
    public boolean mo23063B0() {
        return (this.bitField0_ & C11398b.f33139r) != 0;
    }

    /* renamed from: C0 */
    public boolean mo23064C0() {
        return (this.bitField0_ & C11398b.f33141t) != 0;
    }

    /* renamed from: D0 */
    public boolean mo23065D0() {
        return (this.bitField0_ & C11398b.f33140s) != 0;
    }

    /* renamed from: j0 */
    public long mo23066j0() {
        return this.clientStartTimeUs_;
    }

    /* renamed from: l0 */
    public C7973d mo23067l0() {
        C7973d a = C7973d.m30270a(this.httpMethod_);
        if (a == null) {
            return C7973d.HTTP_METHOD_UNKNOWN;
        }
        return a;
    }

    /* renamed from: m0 */
    public int mo23068m0() {
        return this.httpResponseCode_;
    }

    /* renamed from: n0 */
    public List mo23069n0() {
        return this.perfSessions_;
    }

    /* renamed from: o0 */
    public long mo23070o0() {
        return this.requestPayloadBytes_;
    }

    /* renamed from: p0 */
    public String mo23071p0() {
        return this.responseContentType_;
    }

    /* renamed from: r0 */
    public long mo23072r0() {
        return this.responsePayloadBytes_;
    }

    /* renamed from: s0 */
    public long mo23073s0() {
        return this.timeToRequestCompletedUs_;
    }

    /* renamed from: t0 */
    public long mo23074t0() {
        return this.timeToResponseCompletedUs_;
    }

    /* renamed from: u0 */
    public long mo23075u0() {
        return this.timeToResponseInitiatedUs_;
    }

    /* renamed from: v0 */
    public String mo23076v0() {
        return this.url_;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo18766w(C5709q.C5712c cVar, Object obj, Object obj2) {
        switch (C7970a.f23011a[cVar.ordinal()]) {
            case 1:
                return new C7969h();
            case 2:
                return new C7971b((C7970a) null);
            case 3:
                return C5709q.m22935N(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", C7973d.m30271b(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", C7976e.m30273a(), "customAttributes_", C7972c.f23012a, "perfSessions_", C7983k.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C5708p0 p0Var = PARSER;
                if (p0Var == null) {
                    synchronized (C7969h.class) {
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

    /* renamed from: w0 */
    public boolean mo23077w0() {
        return (this.bitField0_ & 128) != 0;
    }

    /* renamed from: x0 */
    public boolean mo23078x0() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: y0 */
    public boolean mo23079y0() {
        return (this.bitField0_ & 32) != 0;
    }

    /* renamed from: z0 */
    public boolean mo23080z0() {
        return (this.bitField0_ & 4) != 0;
    }
}

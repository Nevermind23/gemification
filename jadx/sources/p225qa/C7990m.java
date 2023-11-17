package p225qa;

import com.google.protobuf.C5627a;
import com.google.protobuf.C5629a0;
import com.google.protobuf.C5635b0;
import com.google.protobuf.C5679h1;
import com.google.protobuf.C5688i0;
import com.google.protobuf.C5708p0;
import com.google.protobuf.C5709q;
import com.google.protobuf.C5716s;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: qa.m */
public final class C7990m extends C5709q implements C5688i0 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    /* access modifiers changed from: private */
    public static final C7990m DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile C5708p0 PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private C5635b0 counters_ = C5635b0.m22451d();
    private C5635b0 customAttributes_ = C5635b0.m22451d();
    private long durationUs_;
    private boolean isAuto_;
    private String name_ = "";
    private C5716s.C5721e perfSessions_ = C5709q.m22939y();
    private C5716s.C5721e subtraces_ = C5709q.m22939y();

    /* renamed from: qa.m$a */
    static /* synthetic */ class C7991a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23041a;

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
                f23041a = r0
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23041a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23041a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f23041a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f23041a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f23041a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f23041a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p225qa.C7990m.C7991a.<clinit>():void");
        }
    }

    /* renamed from: qa.m$b */
    public static final class C7992b extends C5709q.C5710a implements C5688i0 {
        /* synthetic */ C7992b(C7991a aVar) {
            this();
        }

        /* renamed from: A */
        public C7992b mo23123A(Iterable iterable) {
            mo18771r();
            ((C7990m) this.f18051e).m30339d0(iterable);
            return this;
        }

        /* renamed from: B */
        public C7992b mo23124B(C7983k kVar) {
            mo18771r();
            ((C7990m) this.f18051e).m30340e0(kVar);
            return this;
        }

        /* renamed from: C */
        public C7992b mo23125C(C7990m mVar) {
            mo18771r();
            ((C7990m) this.f18051e).m30341f0(mVar);
            return this;
        }

        /* renamed from: D */
        public C7992b mo23126D(Map map) {
            mo18771r();
            ((C7990m) this.f18051e).m30345o0().putAll(map);
            return this;
        }

        /* renamed from: E */
        public C7992b mo23127E(Map map) {
            mo18771r();
            ((C7990m) this.f18051e).m30346p0().putAll(map);
            return this;
        }

        /* renamed from: F */
        public C7992b mo23128F(String str, long j) {
            str.getClass();
            mo18771r();
            ((C7990m) this.f18051e).m30345o0().put(str, Long.valueOf(j));
            return this;
        }

        /* renamed from: G */
        public C7992b mo23129G(String str, String str2) {
            str.getClass();
            str2.getClass();
            mo18771r();
            ((C7990m) this.f18051e).m30346p0().put(str, str2);
            return this;
        }

        /* renamed from: H */
        public C7992b mo23130H(long j) {
            mo18771r();
            ((C7990m) this.f18051e).m30325A0(j);
            return this;
        }

        /* renamed from: I */
        public C7992b mo23131I(long j) {
            mo18771r();
            ((C7990m) this.f18051e).m30326B0(j);
            return this;
        }

        /* renamed from: J */
        public C7992b mo23132J(String str) {
            mo18771r();
            ((C7990m) this.f18051e).m30327C0(str);
            return this;
        }

        /* renamed from: z */
        public C7992b mo23133z(Iterable iterable) {
            mo18771r();
            ((C7990m) this.f18051e).m30338c0(iterable);
            return this;
        }

        private C7992b() {
            super(C7990m.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: qa.m$c */
    private static final class C7993c {

        /* renamed from: a */
        static final C5629a0 f23042a = C5629a0.m22439d(C5679h1.C5681b.STRING, "", C5679h1.C5681b.INT64, 0L);
    }

    /* renamed from: qa.m$d */
    private static final class C7994d {

        /* renamed from: a */
        static final C5629a0 f23043a;

        static {
            C5679h1.C5681b bVar = C5679h1.C5681b.STRING;
            f23043a = C5629a0.m22439d(bVar, "", bVar, "");
        }
    }

    static {
        C7990m mVar = new C7990m();
        DEFAULT_INSTANCE = mVar;
        C5709q.m22936P(C7990m.class, mVar);
    }

    private C7990m() {
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public void m30325A0(long j) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public void m30326B0(long j) {
        this.bitField0_ |= 8;
        this.durationUs_ = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public void m30327C0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m30338c0(Iterable iterable) {
        m30342h0();
        C5627a.m22431i(iterable, this.perfSessions_);
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m30339d0(Iterable iterable) {
        m30343i0();
        C5627a.m22431i(iterable, this.subtraces_);
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m30340e0(C7983k kVar) {
        kVar.getClass();
        m30342h0();
        this.perfSessions_.add(kVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public void m30341f0(C7990m mVar) {
        mVar.getClass();
        m30343i0();
        this.subtraces_.add(mVar);
    }

    /* renamed from: h0 */
    private void m30342h0() {
        C5716s.C5721e eVar = this.perfSessions_;
        if (!eVar.mo18543G0()) {
            this.perfSessions_ = C5709q.m22934L(eVar);
        }
    }

    /* renamed from: i0 */
    private void m30343i0() {
        C5716s.C5721e eVar = this.subtraces_;
        if (!eVar.mo18543G0()) {
            this.subtraces_ = C5709q.m22934L(eVar);
        }
    }

    /* renamed from: m0 */
    public static C7990m m30344m0() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public Map m30345o0() {
        return m30349x0();
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public Map m30346p0() {
        return m30350y0();
    }

    /* renamed from: v0 */
    private C5635b0 m30347v0() {
        return this.counters_;
    }

    /* renamed from: w0 */
    private C5635b0 m30348w0() {
        return this.customAttributes_;
    }

    /* renamed from: x0 */
    private C5635b0 m30349x0() {
        if (!this.counters_.mo18528l()) {
            this.counters_ = this.counters_.mo18531o();
        }
        return this.counters_;
    }

    /* renamed from: y0 */
    private C5635b0 m30350y0() {
        if (!this.customAttributes_.mo18528l()) {
            this.customAttributes_ = this.customAttributes_.mo18531o();
        }
        return this.customAttributes_;
    }

    /* renamed from: z0 */
    public static C7992b m30351z0() {
        return (C7992b) DEFAULT_INSTANCE.mo18762t();
    }

    /* renamed from: g0 */
    public boolean mo23114g0(String str) {
        str.getClass();
        return m30348w0().containsKey(str);
    }

    /* renamed from: j0 */
    public int mo23115j0() {
        return m30347v0().size();
    }

    /* renamed from: k0 */
    public Map mo23116k0() {
        return Collections.unmodifiableMap(m30347v0());
    }

    /* renamed from: l0 */
    public Map mo23117l0() {
        return Collections.unmodifiableMap(m30348w0());
    }

    /* renamed from: n0 */
    public long mo23118n0() {
        return this.durationUs_;
    }

    /* renamed from: r0 */
    public String mo23119r0() {
        return this.name_;
    }

    /* renamed from: s0 */
    public List mo23120s0() {
        return this.perfSessions_;
    }

    /* renamed from: t0 */
    public List mo23121t0() {
        return this.subtraces_;
    }

    /* renamed from: u0 */
    public boolean mo23122u0() {
        return (this.bitField0_ & 4) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo18766w(C5709q.C5712c cVar, Object obj, Object obj2) {
        switch (C7991a.f23041a[cVar.ordinal()]) {
            case 1:
                return new C7990m();
            case 2:
                return new C7992b((C7991a) null);
            case 3:
                return C5709q.m22935N(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", C7993c.f23042a, "subtraces_", C7990m.class, "customAttributes_", C7994d.f23043a, "perfSessions_", C7983k.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C5708p0 p0Var = PARSER;
                if (p0Var == null) {
                    synchronized (C7990m.class) {
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

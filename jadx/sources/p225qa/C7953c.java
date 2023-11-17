package p225qa;

import com.google.protobuf.C5629a0;
import com.google.protobuf.C5635b0;
import com.google.protobuf.C5679h1;
import com.google.protobuf.C5688i0;
import com.google.protobuf.C5708p0;
import com.google.protobuf.C5709q;
import java.util.Map;
import p225qa.C7947a;

/* renamed from: qa.c */
public final class C7953c extends C5709q implements C5688i0 {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    /* access modifiers changed from: private */
    public static final C7953c DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile C5708p0 PARSER;
    private C7947a androidAppInfo_;
    private String appInstanceId_ = "";
    private int applicationProcessState_;
    private int bitField0_;
    private C5635b0 customAttributes_ = C5635b0.m22451d();
    private String googleAppId_ = "";

    /* renamed from: qa.c$a */
    static /* synthetic */ class C7954a {

        /* renamed from: a */
        static final /* synthetic */ int[] f22998a;

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
                f22998a = r0
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22998a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f22998a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f22998a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f22998a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f22998a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f22998a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p225qa.C7953c.C7954a.<clinit>():void");
        }
    }

    /* renamed from: qa.c$b */
    public static final class C7955b extends C5709q.C5710a implements C5688i0 {
        /* synthetic */ C7955b(C7954a aVar) {
            this();
        }

        /* renamed from: A */
        public C7955b mo23040A(Map map) {
            mo18771r();
            ((C7953c) this.f18051e).m30133a0().putAll(map);
            return this;
        }

        /* renamed from: B */
        public C7955b mo23041B(C7947a.C7949b bVar) {
            mo18771r();
            ((C7953c) this.f18051e).m30136h0((C7947a) bVar.mo18768o());
            return this;
        }

        /* renamed from: C */
        public C7955b mo23042C(String str) {
            mo18771r();
            ((C7953c) this.f18051e).m30137i0(str);
            return this;
        }

        /* renamed from: D */
        public C7955b mo23043D(C7957d dVar) {
            mo18771r();
            ((C7953c) this.f18051e).m30138j0(dVar);
            return this;
        }

        /* renamed from: E */
        public C7955b mo23044E(String str) {
            mo18771r();
            ((C7953c) this.f18051e).m30139k0(str);
            return this;
        }

        /* renamed from: z */
        public boolean mo23045z() {
            return ((C7953c) this.f18051e).mo23037c0();
        }

        private C7955b() {
            super(C7953c.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: qa.c$c */
    private static final class C7956c {

        /* renamed from: a */
        static final C5629a0 f22999a;

        static {
            C5679h1.C5681b bVar = C5679h1.C5681b.STRING;
            f22999a = C5629a0.m22439d(bVar, "", bVar, "");
        }
    }

    static {
        C7953c cVar = new C7953c();
        DEFAULT_INSTANCE = cVar;
        C5709q.m22936P(C7953c.class, cVar);
    }

    private C7953c() {
    }

    /* renamed from: Z */
    public static C7953c m30132Z() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public Map m30133a0() {
        return m30134f0();
    }

    /* renamed from: f0 */
    private C5635b0 m30134f0() {
        if (!this.customAttributes_.mo18528l()) {
            this.customAttributes_ = this.customAttributes_.mo18531o();
        }
        return this.customAttributes_;
    }

    /* renamed from: g0 */
    public static C7955b m30135g0() {
        return (C7955b) DEFAULT_INSTANCE.mo18762t();
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public void m30136h0(C7947a aVar) {
        aVar.getClass();
        this.androidAppInfo_ = aVar;
        this.bitField0_ |= 4;
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m30137i0(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public void m30138j0(C7957d dVar) {
        this.applicationProcessState_ = dVar.mo18790i();
        this.bitField0_ |= 8;
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m30139k0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }

    /* renamed from: Y */
    public C7947a mo23035Y() {
        C7947a aVar = this.androidAppInfo_;
        return aVar == null ? C7947a.m30106W() : aVar;
    }

    /* renamed from: b0 */
    public boolean mo23036b0() {
        return (this.bitField0_ & 4) != 0;
    }

    /* renamed from: c0 */
    public boolean mo23037c0() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: d0 */
    public boolean mo23038d0() {
        return (this.bitField0_ & 8) != 0;
    }

    /* renamed from: e0 */
    public boolean mo23039e0() {
        return (this.bitField0_ & 1) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo18766w(C5709q.C5712c cVar, Object obj, Object obj2) {
        switch (C7954a.f22998a[cVar.ordinal()]) {
            case 1:
                return new C7953c();
            case 2:
                return new C7955b((C7954a) null);
            case 3:
                return C5709q.m22935N(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", C7957d.m30152a(), "customAttributes_", C7956c.f22999a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C5708p0 p0Var = PARSER;
                if (p0Var == null) {
                    synchronized (C7953c.class) {
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

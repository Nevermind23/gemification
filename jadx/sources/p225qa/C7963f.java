package p225qa;

import com.google.protobuf.C5688i0;
import com.google.protobuf.C5708p0;
import com.google.protobuf.C5709q;

/* renamed from: qa.f */
public final class C7963f extends C5709q implements C5688i0 {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    /* access modifiers changed from: private */
    public static final C7963f DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile C5708p0 PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    /* renamed from: qa.f$a */
    static /* synthetic */ class C7964a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23009a;

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
                f23009a = r0
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23009a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23009a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f23009a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f23009a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f23009a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f23009a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.q$c r1 = com.google.protobuf.C5709q.C5712c.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p225qa.C7963f.C7964a.<clinit>():void");
        }
    }

    /* renamed from: qa.f$b */
    public static final class C7965b extends C5709q.C5710a implements C5688i0 {
        /* synthetic */ C7965b(C7964a aVar) {
            this();
        }

        /* renamed from: A */
        public C7965b mo23050A(int i) {
            mo18771r();
            ((C7963f) this.f18051e).m30173a0(i);
            return this;
        }

        /* renamed from: B */
        public C7965b mo23051B(int i) {
            mo18771r();
            ((C7963f) this.f18051e).m30174b0(i);
            return this;
        }

        /* renamed from: z */
        public C7965b mo23052z(int i) {
            mo18771r();
            ((C7963f) this.f18051e).m30172Z(i);
            return this;
        }

        private C7965b() {
            super(C7963f.DEFAULT_INSTANCE);
        }
    }

    static {
        C7963f fVar = new C7963f();
        DEFAULT_INSTANCE = fVar;
        C5709q.m22936P(C7963f.class, fVar);
    }

    private C7963f() {
    }

    /* renamed from: W */
    public static C7963f m30170W() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Y */
    public static C7965b m30171Y() {
        return (C7965b) DEFAULT_INSTANCE.mo18762t();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m30172Z(int i) {
        this.bitField0_ |= 8;
        this.deviceRamSizeKb_ = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m30173a0(int i) {
        this.bitField0_ |= 16;
        this.maxAppJavaHeapMemoryKb_ = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m30174b0(int i) {
        this.bitField0_ |= 32;
        this.maxEncouragedAppJavaHeapMemoryKb_ = i;
    }

    /* renamed from: X */
    public boolean mo23049X() {
        return (this.bitField0_ & 16) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo18766w(C5709q.C5712c cVar, Object obj, Object obj2) {
        switch (C7964a.f23009a[cVar.ordinal()]) {
            case 1:
                return new C7963f();
            case 2:
                return new C7965b((C7964a) null);
            case 3:
                return C5709q.m22935N(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C5708p0 p0Var = PARSER;
                if (p0Var == null) {
                    synchronized (C7963f.class) {
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

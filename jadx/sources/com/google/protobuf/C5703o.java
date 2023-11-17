package com.google.protobuf;

import java.lang.reflect.Type;

/* renamed from: com.google.protobuf.o */
public enum C5703o {
    DOUBLE(0, r13, r14),
    FLOAT(1, r11, r15),
    INT64(2, r11, r12),
    UINT64(3, r11, r12),
    INT32(4, r11, r17),
    FIXED64(5, r11, r16),
    FIXED32(6, r11, r17),
    BOOL(7, r11, r18),
    STRING(8, r11, r19),
    MESSAGE(9, r11, r20),
    BYTES(10, r11, r21),
    UINT32(11, r11, r17),
    ENUM(12, r11, r22),
    SFIXED32(13, r11, r17),
    SFIXED64(14, r11, r16),
    SINT32(15, r11, r17),
    SINT64(16, r11, r16),
    GROUP(17, r11, r20),
    DOUBLE_LIST(18, r13, r12),
    FLOAT_LIST(19, r5, r15),
    INT64_LIST(20, r5, r6),
    UINT64_LIST(21, r5, r6),
    INT32_LIST(22, r5, r17),
    FIXED64_LIST(23, r5, r16),
    FIXED32_LIST(24, r5, r17),
    BOOL_LIST(25, r5, r18),
    STRING_LIST(26, r5, r19),
    MESSAGE_LIST(27, r5, r20),
    BYTES_LIST(28, r5, r21),
    UINT32_LIST(29, r5, r17),
    ENUM_LIST(30, r5, r22),
    SFIXED32_LIST(31, r5, r17),
    SFIXED64_LIST(32, r5, r16),
    SINT32_LIST(33, r5, r17),
    SINT64_LIST(34, r5, r16),
    DOUBLE_LIST_PACKED(35, r19, r12),
    FLOAT_LIST_PACKED(36, r5, r15),
    INT64_LIST_PACKED(37, r5, r6),
    UINT64_LIST_PACKED(38, r5, r6),
    INT32_LIST_PACKED(39, r5, r17),
    FIXED64_LIST_PACKED(40, r5, r16),
    FIXED32_LIST_PACKED(41, r5, r17),
    BOOL_LIST_PACKED(42, r5, r18),
    UINT32_LIST_PACKED(43, r5, r17),
    ENUM_LIST_PACKED(44, r5, r22),
    SFIXED32_LIST_PACKED(45, r5, r17),
    SFIXED64_LIST_PACKED(46, r5, r16),
    SINT32_LIST_PACKED(47, r5, r17),
    SINT64_LIST_PACKED(48, r5, r16),
    GROUP_LIST(49, r13, r20),
    MAP(50, C5705b.MAP, C5725u.VOID);
    

    /* renamed from: h0 */
    private static final C5703o[] f18013h0 = null;

    /* renamed from: i0 */
    private static final Type[] f18015i0 = null;

    /* renamed from: d */
    private final C5725u f18034d;

    /* renamed from: e */
    private final int f18035e;

    /* renamed from: f */
    private final C5705b f18036f;

    /* renamed from: g */
    private final Class f18037g;

    /* renamed from: h */
    private final boolean f18038h;

    /* renamed from: com.google.protobuf.o$a */
    static /* synthetic */ class C5704a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18039a = null;

        /* renamed from: b */
        static final /* synthetic */ int[] f18040b = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.google.protobuf.u[] r0 = com.google.protobuf.C5725u.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18040b = r0
                r1 = 1
                com.google.protobuf.u r2 = com.google.protobuf.C5725u.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f18040b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.u r3 = com.google.protobuf.C5725u.MESSAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f18040b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.u r4 = com.google.protobuf.C5725u.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.protobuf.o$b[] r3 = com.google.protobuf.C5703o.C5705b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f18039a = r3
                com.google.protobuf.o$b r4 = com.google.protobuf.C5703o.C5705b.MAP     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f18039a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.protobuf.o$b r3 = com.google.protobuf.C5703o.C5705b.VECTOR     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f18039a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.google.protobuf.o$b r1 = com.google.protobuf.C5703o.C5705b.SCALAR     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C5703o.C5704a.<clinit>():void");
        }
    }

    /* renamed from: com.google.protobuf.o$b */
    enum C5705b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        

        /* renamed from: d */
        private final boolean f18046d;

        private C5705b(boolean z) {
            this.f18046d = z;
        }
    }

    static {
        f18015i0 = new Type[0];
        C5703o[] values = values();
        f18013h0 = new C5703o[values.length];
        for (C5703o oVar : values) {
            f18013h0[oVar.f18035e] = oVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r1 = com.google.protobuf.C5703o.C5704a.f18040b[r5.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C5703o(int r3, com.google.protobuf.C5703o.C5705b r4, com.google.protobuf.C5725u r5) {
        /*
            r0 = this;
            r0.<init>(r1, r2)
            r0.f18035e = r3
            r0.f18036f = r4
            r0.f18034d = r5
            int[] r1 = com.google.protobuf.C5703o.C5704a.f18039a
            int r2 = r4.ordinal()
            r1 = r1[r2]
            r2 = 2
            r3 = 1
            if (r1 == r3) goto L_0x0022
            if (r1 == r2) goto L_0x001b
            r1 = 0
            r0.f18037g = r1
            goto L_0x0028
        L_0x001b:
            java.lang.Class r1 = r5.mo18799b()
            r0.f18037g = r1
            goto L_0x0028
        L_0x0022:
            java.lang.Class r1 = r5.mo18799b()
            r0.f18037g = r1
        L_0x0028:
            com.google.protobuf.o$b r1 = com.google.protobuf.C5703o.C5705b.SCALAR
            if (r4 != r1) goto L_0x003c
            int[] r1 = com.google.protobuf.C5703o.C5704a.f18040b
            int r4 = r5.ordinal()
            r1 = r1[r4]
            if (r1 == r3) goto L_0x003c
            if (r1 == r2) goto L_0x003c
            r2 = 3
            if (r1 == r2) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r3 = 0
        L_0x003d:
            r0.f18038h = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C5703o.<init>(java.lang.String, int, int, com.google.protobuf.o$b, com.google.protobuf.u):void");
    }

    /* renamed from: b */
    public int mo18743b() {
        return this.f18035e;
    }
}

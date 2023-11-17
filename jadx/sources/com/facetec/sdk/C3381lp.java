package com.facetec.sdk;

import com.facetec.sdk.C3358lk;
import java.io.Closeable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.facetec.sdk.lp */
final class C3381lp implements Closeable {

    /* renamed from: b */
    static final Logger f11135b = Logger.getLogger(C3388lr.class.getName());

    /* renamed from: a */
    final C3432mn f11136a;

    /* renamed from: c */
    private final C3382a f11137c;

    /* renamed from: d */
    final boolean f11138d;

    /* renamed from: e */
    private C3358lk.C3360d f11139e;

    /* renamed from: com.facetec.sdk.lp$b */
    interface C3383b {
        /* renamed from: a */
        void mo9736a(int i, C3435mq mqVar);

        /* renamed from: a */
        void mo9737a(boolean z, int i, C3432mn mnVar, int i2);

        /* renamed from: a */
        void mo9738a(boolean z, int i, List<C3362lm> list);

        /* renamed from: b */
        void mo9739b(int i, C3361ll llVar);

        /* renamed from: b */
        void mo9740b(int i, List<C3362lm> list);

        /* renamed from: b */
        void mo9741b(boolean z, int i, int i2);

        /* renamed from: d */
        void mo9742d(int i, long j);

        /* renamed from: e */
        void mo9743e(C3391lt ltVar);
    }

    C3381lp(C3432mn mnVar, boolean z) {
        this.f11136a = mnVar;
        this.f11138d = z;
        C3382a aVar = new C3382a(mnVar);
        this.f11137c = aVar;
        this.f11139e = new C3358lk.C3360d(aVar, (byte) 0);
    }

    /* renamed from: b */
    private List<C3362lm> m13474b(int i, short s, byte b, int i2) {
        C3382a aVar = this.f11137c;
        aVar.f11144e = i;
        aVar.f11143d = i;
        aVar.f11142c = s;
        aVar.f11140a = b;
        aVar.f11141b = i2;
        this.f11139e.mo9716d();
        return this.f11139e.mo9717e();
    }

    /* renamed from: d */
    private void m13476d() {
        this.f11136a.mo9879j();
        this.f11136a.mo9866f();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo9744c(boolean r11, com.facetec.sdk.C3381lp.C3383b r12) {
        /*
            r10 = this;
            r0 = 0
            com.facetec.sdk.mn r1 = r10.f11136a     // Catch:{ IOException -> 0x02b6 }
            r2 = 9
            r1.mo9863e(r2)     // Catch:{ IOException -> 0x02b6 }
            com.facetec.sdk.mn r1 = r10.f11136a
            int r1 = m13473b(r1)
            r2 = 1
            if (r1 < 0) goto L_0x02a7
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r1 > r3) goto L_0x02a7
            com.facetec.sdk.mn r4 = r10.f11136a
            byte r4 = r4.mo9866f()
            byte r4 = (byte) r4
            r5 = 4
            if (r11 == 0) goto L_0x0031
            if (r4 != r5) goto L_0x0022
            goto L_0x0031
        L_0x0022:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Byte r12 = java.lang.Byte.valueOf(r4)
            r11[r0] = r12
            java.lang.String r12 = "Expected a SETTINGS frame but was %s"
            java.io.IOException r11 = com.facetec.sdk.C3388lr.m13515a(r12, r11)
            throw r11
        L_0x0031:
            com.facetec.sdk.mn r11 = r10.f11136a
            byte r11 = r11.mo9866f()
            byte r11 = (byte) r11
            com.facetec.sdk.mn r6 = r10.f11136a
            int r6 = r6.mo9879j()
            r7 = 2147483647(0x7fffffff, float:NaN)
            r6 = r6 & r7
            java.util.logging.Logger r8 = f11135b
            java.util.logging.Level r9 = java.util.logging.Level.FINE
            boolean r9 = r8.isLoggable(r9)
            if (r9 == 0) goto L_0x0053
            java.lang.String r9 = com.facetec.sdk.C3388lr.m13516c(r2, r6, r1, r4, r11)
            r8.fine(r9)
        L_0x0053:
            r8 = 5
            r9 = 8
            switch(r4) {
                case 0: goto L_0x0265;
                case 1: goto L_0x0231;
                case 2: goto L_0x0210;
                case 3: goto L_0x01d4;
                case 4: goto L_0x0144;
                case 5: goto L_0x0116;
                case 6: goto L_0x00e5;
                case 7: goto L_0x0097;
                case 8: goto L_0x0061;
                default: goto L_0x0059;
            }
        L_0x0059:
            com.facetec.sdk.mn r11 = r10.f11136a
            long r0 = (long) r1
            r11.mo9880j(r0)
            goto L_0x02a6
        L_0x0061:
            if (r1 != r5) goto L_0x0088
            com.facetec.sdk.mn r11 = r10.f11136a
            int r11 = r11.mo9879j()
            long r3 = (long) r11
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r3 = r3 & r7
            r7 = 0
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0079
            r12.mo9742d(r6, r3)
            goto L_0x02a6
        L_0x0079:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Long r12 = java.lang.Long.valueOf(r3)
            r11[r0] = r12
            java.lang.String r12 = "windowSizeIncrement was 0"
            java.io.IOException r11 = com.facetec.sdk.C3388lr.m13515a(r12, r11)
            throw r11
        L_0x0088:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r0] = r12
            java.lang.String r12 = "TYPE_WINDOW_UPDATE length !=4: %s"
            java.io.IOException r11 = com.facetec.sdk.C3388lr.m13515a(r12, r11)
            throw r11
        L_0x0097:
            if (r1 < r9) goto L_0x00d6
            if (r6 != 0) goto L_0x00cd
            com.facetec.sdk.mn r11 = r10.f11136a
            int r11 = r11.mo9879j()
            com.facetec.sdk.mn r3 = r10.f11136a
            int r3 = r3.mo9879j()
            int r1 = r1 - r9
            com.facetec.sdk.ll r4 = com.facetec.sdk.C3361ll.m13419a(r3)
            if (r4 == 0) goto L_0x00be
            com.facetec.sdk.mq r0 = com.facetec.sdk.C3435mq.f11263a
            if (r1 <= 0) goto L_0x00b9
            com.facetec.sdk.mn r0 = r10.f11136a
            long r3 = (long) r1
            com.facetec.sdk.mq r0 = r0.mo9837a(r3)
        L_0x00b9:
            r12.mo9736a(r11, r0)
            goto L_0x02a6
        L_0x00be:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            r11[r0] = r12
            java.lang.String r12 = "TYPE_GOAWAY unexpected error code: %d"
            java.io.IOException r11 = com.facetec.sdk.C3388lr.m13515a(r12, r11)
            throw r11
        L_0x00cd:
            java.lang.String r11 = "TYPE_GOAWAY streamId != 0"
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.io.IOException r11 = com.facetec.sdk.C3388lr.m13515a(r11, r12)
            throw r11
        L_0x00d6:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r0] = r12
            java.lang.String r12 = "TYPE_GOAWAY length < 8: %s"
            java.io.IOException r11 = com.facetec.sdk.C3388lr.m13515a(r12, r11)
            throw r11
        L_0x00e5:
            if (r1 != r9) goto L_0x0107
            if (r6 != 0) goto L_0x00fe
            com.facetec.sdk.mn r1 = r10.f11136a
            int r1 = r1.mo9879j()
            com.facetec.sdk.mn r3 = r10.f11136a
            int r3 = r3.mo9879j()
            r11 = r11 & r2
            if (r11 == 0) goto L_0x00f9
            r0 = r2
        L_0x00f9:
            r12.mo9741b(r0, r1, r3)
            goto L_0x02a6
        L_0x00fe:
            java.lang.String r11 = "TYPE_PING streamId != 0"
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.io.IOException r11 = com.facetec.sdk.C3388lr.m13515a(r11, r12)
            throw r11
        L_0x0107:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r0] = r12
            java.lang.String r12 = "TYPE_PING length != 8: %s"
            java.io.IOException r11 = com.facetec.sdk.C3388lr.m13515a(r12, r11)
            throw r11
        L_0x0116:
            if (r6 == 0) goto L_0x013b
            r3 = r11 & 8
            if (r3 == 0) goto L_0x0125
            com.facetec.sdk.mn r0 = r10.f11136a
            byte r0 = r0.mo9866f()
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
        L_0x0125:
            com.facetec.sdk.mn r3 = r10.f11136a
            int r3 = r3.mo9879j()
            r3 = r3 & r7
            int r1 = r1 + -4
            int r1 = m13475d(r1, r11, r0)
            java.util.List r11 = r10.m13474b(r1, r0, r11, r6)
            r12.mo9740b((int) r3, (java.util.List<com.facetec.sdk.C3362lm>) r11)
            goto L_0x02a6
        L_0x013b:
            java.lang.String r11 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.io.IOException r11 = com.facetec.sdk.C3388lr.m13515a(r11, r12)
            throw r11
        L_0x0144:
            if (r6 != 0) goto L_0x01cb
            r11 = r11 & r2
            if (r11 == 0) goto L_0x0156
            if (r1 != 0) goto L_0x014d
            goto L_0x02a6
        L_0x014d:
            java.lang.String r11 = "FRAME_SIZE_ERROR ack frame should be empty!"
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.io.IOException r11 = com.facetec.sdk.C3388lr.m13515a(r11, r12)
            throw r11
        L_0x0156:
            int r11 = r1 % 6
            if (r11 != 0) goto L_0x01bc
            com.facetec.sdk.lt r11 = new com.facetec.sdk.lt
            r11.<init>()
            r4 = r0
        L_0x0160:
            if (r4 >= r1) goto L_0x01b7
            com.facetec.sdk.mn r6 = r10.f11136a
            short r6 = r6.mo9873h()
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            com.facetec.sdk.mn r7 = r10.f11136a
            int r7 = r7.mo9879j()
            r9 = 2
            if (r6 == r9) goto L_0x01a3
            r9 = 3
            if (r6 == r9) goto L_0x01a1
            if (r6 == r5) goto L_0x0194
            if (r6 == r8) goto L_0x017d
            goto L_0x01b1
        L_0x017d:
            if (r7 < r3) goto L_0x0185
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            if (r7 > r9) goto L_0x0185
            goto L_0x01b1
        L_0x0185:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            r11[r0] = r12
            java.lang.String r12 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"
            java.io.IOException r11 = com.facetec.sdk.C3388lr.m13515a(r12, r11)
            throw r11
        L_0x0194:
            if (r7 < 0) goto L_0x0198
            r6 = 7
            goto L_0x01b1
        L_0x0198:
            java.lang.String r11 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.io.IOException r11 = com.facetec.sdk.C3388lr.m13515a(r11, r12)
            throw r11
        L_0x01a1:
            r6 = r5
            goto L_0x01b1
        L_0x01a3:
            if (r7 == 0) goto L_0x01b1
            if (r7 != r2) goto L_0x01a8
            goto L_0x01b1
        L_0x01a8:
            java.lang.String r11 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.io.IOException r11 = com.facetec.sdk.C3388lr.m13515a(r11, r12)
            throw r11
        L_0x01b1:
            r11.mo9766d(r6, r7)
            int r4 = r4 + 6
            goto L_0x0160
        L_0x01b7:
            r12.mo9743e(r11)
            goto L_0x02a6
        L_0x01bc:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r0] = r12
            java.lang.String r12 = "TYPE_SETTINGS length %% 6 != 0: %s"
            java.io.IOException r11 = com.facetec.sdk.C3388lr.m13515a(r12, r11)
            throw r11
        L_0x01cb:
            java.lang.String r11 = "TYPE_SETTINGS streamId != 0"
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.io.IOException r11 = com.facetec.sdk.C3388lr.m13515a(r11, r12)
            throw r11
        L_0x01d4:
            if (r1 != r5) goto L_0x0201
            if (r6 == 0) goto L_0x01f8
            com.facetec.sdk.mn r11 = r10.f11136a
            int r11 = r11.mo9879j()
            com.facetec.sdk.ll r1 = com.facetec.sdk.C3361ll.m13419a(r11)
            if (r1 == 0) goto L_0x01e9
            r12.mo9739b((int) r6, (com.facetec.sdk.C3361ll) r1)
            goto L_0x02a6
        L_0x01e9:
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12[r0] = r11
            java.lang.String r11 = "TYPE_RST_STREAM unexpected error code: %d"
            java.io.IOException r11 = com.facetec.sdk.C3388lr.m13515a(r11, r12)
            throw r11
        L_0x01f8:
            java.lang.String r11 = "TYPE_RST_STREAM streamId == 0"
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.io.IOException r11 = com.facetec.sdk.C3388lr.m13515a(r11, r12)
            throw r11
        L_0x0201:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r0] = r12
            java.lang.String r12 = "TYPE_RST_STREAM length: %d != 4"
            java.io.IOException r11 = com.facetec.sdk.C3388lr.m13515a(r12, r11)
            throw r11
        L_0x0210:
            if (r1 != r8) goto L_0x0222
            if (r6 == 0) goto L_0x0219
            r10.m13476d()
            goto L_0x02a6
        L_0x0219:
            java.lang.String r11 = "TYPE_PRIORITY streamId == 0"
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.io.IOException r11 = com.facetec.sdk.C3388lr.m13515a(r11, r12)
            throw r11
        L_0x0222:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r0] = r12
            java.lang.String r12 = "TYPE_PRIORITY length: %d != 5"
            java.io.IOException r11 = com.facetec.sdk.C3388lr.m13515a(r12, r11)
            throw r11
        L_0x0231:
            if (r6 == 0) goto L_0x025c
            r3 = r11 & 1
            if (r3 == 0) goto L_0x0239
            r3 = r2
            goto L_0x023a
        L_0x0239:
            r3 = r0
        L_0x023a:
            r4 = r11 & 8
            if (r4 == 0) goto L_0x0247
            com.facetec.sdk.mn r0 = r10.f11136a
            byte r0 = r0.mo9866f()
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
        L_0x0247:
            r4 = r11 & 32
            if (r4 == 0) goto L_0x0250
            r10.m13476d()
            int r1 = r1 + -5
        L_0x0250:
            int r1 = m13475d(r1, r11, r0)
            java.util.List r11 = r10.m13474b(r1, r0, r11, r6)
            r12.mo9738a(r3, r6, r11)
            goto L_0x02a6
        L_0x025c:
            java.lang.String r11 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.io.IOException r11 = com.facetec.sdk.C3388lr.m13515a(r11, r12)
            throw r11
        L_0x0265:
            if (r6 == 0) goto L_0x029d
            r3 = r11 & 1
            if (r3 == 0) goto L_0x026d
            r3 = r2
            goto L_0x026e
        L_0x026d:
            r3 = r0
        L_0x026e:
            r4 = r11 & 32
            if (r4 == 0) goto L_0x0274
            r4 = r2
            goto L_0x0275
        L_0x0274:
            r4 = r0
        L_0x0275:
            if (r4 != 0) goto L_0x0294
            r4 = r11 & 8
            if (r4 == 0) goto L_0x0284
            com.facetec.sdk.mn r0 = r10.f11136a
            byte r0 = r0.mo9866f()
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
        L_0x0284:
            int r11 = m13475d(r1, r11, r0)
            com.facetec.sdk.mn r1 = r10.f11136a
            r12.mo9737a(r3, r6, r1, r11)
            com.facetec.sdk.mn r11 = r10.f11136a
            long r0 = (long) r0
            r11.mo9880j(r0)
            goto L_0x02a6
        L_0x0294:
            java.lang.String r11 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.io.IOException r11 = com.facetec.sdk.C3388lr.m13515a(r11, r12)
            throw r11
        L_0x029d:
            java.lang.String r11 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.io.IOException r11 = com.facetec.sdk.C3388lr.m13515a(r11, r12)
            throw r11
        L_0x02a6:
            return r2
        L_0x02a7:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r0] = r12
            java.lang.String r12 = "FRAME_SIZE_ERROR: %s"
            java.io.IOException r11 = com.facetec.sdk.C3388lr.m13515a(r12, r11)
            throw r11
        L_0x02b6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3381lp.mo9744c(boolean, com.facetec.sdk.lp$b):boolean");
    }

    public final void close() {
        this.f11136a.close();
    }

    /* renamed from: d */
    private static int m13475d(int i, byte b, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw C3388lr.m13515a("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    /* renamed from: b */
    static int m13473b(C3432mn mnVar) {
        return (mnVar.mo9866f() & 255) | ((mnVar.mo9866f() & 255) << 16) | ((mnVar.mo9866f() & 255) << 8);
    }

    /* renamed from: com.facetec.sdk.lp$a */
    static final class C3382a implements C3465nf {

        /* renamed from: a */
        byte f11140a;

        /* renamed from: b */
        int f11141b;

        /* renamed from: c */
        short f11142c;

        /* renamed from: d */
        int f11143d;

        /* renamed from: e */
        int f11144e;

        /* renamed from: h */
        private final C3432mn f11145h;

        C3382a(C3432mn mnVar) {
            this.f11145h = mnVar;
        }

        /* renamed from: c */
        public final long mo9643c(C3431mm mmVar, long j) {
            int i;
            int j2;
            do {
                int i2 = this.f11144e;
                if (i2 == 0) {
                    this.f11145h.mo9880j((long) this.f11142c);
                    this.f11142c = 0;
                    if ((this.f11140a & 4) != 0) {
                        return -1;
                    }
                    i = this.f11141b;
                    int b = C3381lp.m13473b(this.f11145h);
                    this.f11144e = b;
                    this.f11143d = b;
                    byte f = (byte) this.f11145h.mo9866f();
                    this.f11140a = (byte) this.f11145h.mo9866f();
                    Logger logger = C3381lp.f11135b;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(C3388lr.m13516c(true, this.f11141b, this.f11143d, f, this.f11140a));
                    }
                    j2 = this.f11145h.mo9879j() & Integer.MAX_VALUE;
                    this.f11141b = j2;
                    if (f != 9) {
                        throw C3388lr.m13515a("%s != TYPE_CONTINUATION", Byte.valueOf(f));
                    }
                } else {
                    long c = this.f11145h.mo9643c(mmVar, Math.min(j, (long) i2));
                    if (c == -1) {
                        return -1;
                    }
                    this.f11144e = (int) (((long) this.f11144e) - c);
                    return c;
                }
            } while (j2 == i);
            throw C3388lr.m13515a("TYPE_CONTINUATION streamId changed", new Object[0]);
        }

        public final void close() {
        }

        /* renamed from: c */
        public final C3463ne mo9644c() {
            return this.f11145h.mo9644c();
        }
    }
}

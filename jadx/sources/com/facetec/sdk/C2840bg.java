package com.facetec.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Looper;
import android.util.Base64;
import androidx.core.content.C0767a;
import com.facetec.sdk.C2802au;
import com.facetec.sdk.FaceTecSDK;
import com.salesforce.marketingcloud.messages.iam.C11651j;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facetec.sdk.bg */
final class C2840bg {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    public static final byte[] $$d = null;
    public static final int $$e = 0;

    /* renamed from: a */
    static String f9200a;

    /* renamed from: b */
    static String f9201b = null;

    /* renamed from: c */
    static int f9202c;

    /* renamed from: d */
    static FaceTecAuditTrailImagesToReturn f9203d = FaceTecAuditTrailImagesToReturn.ONE;

    /* renamed from: e */
    static FaceTecAuditTrailType f9204e = FaceTecAuditTrailType.HEIGHT_640;

    /* renamed from: f */
    private static String f9205f;

    /* renamed from: g */
    public static final byte[] f9206g = null;

    /* renamed from: h */
    public static final int f9207h = 0;

    /* renamed from: i */
    static JSONObject f9208i = null;

    /* renamed from: j */
    private static String f9209j;

    /* renamed from: k */
    private static C2842a f9210k = C2842a.NEVER_VALIDATED;

    /* renamed from: l */
    private static SharedPreferences f9211l;

    /* renamed from: m */
    private static String f9212m = null;

    /* renamed from: n */
    private static Boolean f9213n = null;

    /* renamed from: o */
    private static boolean f9214o = false;

    /* renamed from: p */
    private static int f9215p = 0;

    /* renamed from: r */
    private static int f9216r = 1;

    /* renamed from: s */
    private static char[] f9217s;

    /* renamed from: t */
    private static /* synthetic */ boolean f9218t = true;

    /* renamed from: com.facetec.sdk.bg$1 */
    static /* synthetic */ class C28411 {

        /* renamed from: e */
        static final /* synthetic */ int[] f9219e;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facetec.sdk.bg$a[] r0 = com.facetec.sdk.C2840bg.C2842a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9219e = r0
                com.facetec.sdk.bg$a r1 = com.facetec.sdk.C2840bg.C2842a.VALIDATED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9219e     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facetec.sdk.bg$a r1 = com.facetec.sdk.C2840bg.C2842a.REJECTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9219e     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facetec.sdk.bg$a r1 = com.facetec.sdk.C2840bg.C2842a.NETWORK_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9219e     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facetec.sdk.bg$a r1 = com.facetec.sdk.C2840bg.C2842a.VERSION_DEPRECATED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f9219e     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facetec.sdk.bg$a r1 = com.facetec.sdk.C2840bg.C2842a.NEVER_VALIDATED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2840bg.C28411.<clinit>():void");
        }
    }

    /* renamed from: com.facetec.sdk.bg$a */
    enum C2842a {
        NEVER_VALIDATED,
        VALIDATED,
        REJECTED,
        VERSION_DEPRECATED,
        NETWORK_ERROR
    }

    static {
        init$1();
        init$0();
        m11377g();
        m11378h();
    }

    C2840bg() {
    }

    /* renamed from: a */
    static boolean m11349a(Context context) {
        return C2863bw.m11685h(context);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v41, resolved type: com.facetec.sdk.cv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v56, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v57, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v58, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v75, resolved type: com.facetec.sdk.bg$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v76, resolved type: com.facetec.sdk.bg$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v81, resolved type: com.facetec.sdk.y5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: com.facetec.sdk.y5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v82, resolved type: com.facetec.sdk.y5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v83, resolved type: com.facetec.sdk.y5} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0246, code lost:
        r1.f9906h = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0249, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x025f, code lost:
        r1.mo9113c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x028c, code lost:
        r1.f9900b = r1;
        r1.mo9113c(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02dc, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @com.guardsquare.dexguard.annotation.VirtualizeCode
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m11354b(android.content.Context r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, com.facetec.sdk.FaceTecSDK.InitializeCallback r23) {
        /*
            com.facetec.sdk.dh r0 = new com.facetec.sdk.dh
            r1 = r0
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r1.<init>(r2, r3, r4, r5, r6)
            byte[] r1 = f9206g
            r2 = 46
            byte r2 = r1[r2]
            short r2 = (short) r2
            r3 = r2 & 73
            byte r3 = (byte) r3
            r4 = 0
            byte r5 = r1[r4]
            r6 = 1
            int r5 = r5 - r6
            short r5 = (short) r5
            java.lang.Object[] r7 = new java.lang.Object[r6]
            m11397u(r2, r3, r5, r7)
            r2 = r7[r4]
            java.lang.String r2 = (java.lang.String) r2
            r3 = 685(0x2ad, float:9.6E-43)
            short r3 = (short) r3
            r5 = 74
            byte r7 = (byte) r5
            r8 = r7 | 305(0x131, float:4.27E-43)
            short r8 = (short) r8
            java.lang.Object[] r9 = new java.lang.Object[r6]
            m11397u(r3, r7, r8, r9)
            r7 = r9[r4]
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x02df }
            r8[r4] = r7     // Catch:{ all -> 0x02df }
            r7 = 865(0x361, float:1.212E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x02df }
            r9 = 696(0x2b8, float:9.75E-43)
            byte r10 = r1[r9]     // Catch:{ all -> 0x02df }
            byte r10 = (byte) r10     // Catch:{ all -> 0x02df }
            r11 = r10 | 352(0x160, float:4.93E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x02df }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x02df }
            m11397u(r7, r10, r11, r12)     // Catch:{ all -> 0x02df }
            r10 = r12[r4]     // Catch:{ all -> 0x02df }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x02df }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x02df }
            r11 = 809(0x329, float:1.134E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x02df }
            r12 = 4
            byte r13 = r1[r12]     // Catch:{ all -> 0x02df }
            byte r13 = (byte) r13     // Catch:{ all -> 0x02df }
            r14 = r13 | 372(0x174, float:5.21E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x02df }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x02df }
            m11397u(r11, r13, r14, r15)     // Catch:{ all -> 0x02df }
            r11 = r15[r4]     // Catch:{ all -> 0x02df }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x02df }
            java.lang.Class[] r13 = new java.lang.Class[r6]     // Catch:{ all -> 0x02df }
            byte r1 = r1[r9]     // Catch:{ all -> 0x02df }
            byte r1 = (byte) r1     // Catch:{ all -> 0x02df }
            r14 = r1 | 352(0x160, float:4.93E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x02df }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x02df }
            m11397u(r7, r1, r14, r15)     // Catch:{ all -> 0x02df }
            r1 = r15[r4]     // Catch:{ all -> 0x02df }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x02df }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x02df }
            r13[r4] = r1     // Catch:{ all -> 0x02df }
            java.lang.reflect.Method r1 = r10.getMethod(r11, r13)     // Catch:{ all -> 0x02df }
            java.lang.Object r1 = r1.invoke(r2, r8)     // Catch:{ all -> 0x02df }
            java.lang.Object[] r1 = (java.lang.Object[]) r1     // Catch:{ all -> 0x02df }
            int r2 = r1.length
            int[] r2 = new int[r2]
            r8 = r4
        L_0x008f:
            int r10 = r1.length
            r11 = 6
            if (r8 >= r10) goto L_0x0135
            r10 = r1[r8]
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x012c }
            r13[r4] = r10     // Catch:{ all -> 0x012c }
            byte[] r10 = f9206g     // Catch:{ all -> 0x012c }
            byte r14 = r10[r9]     // Catch:{ all -> 0x012c }
            byte r14 = (byte) r14     // Catch:{ all -> 0x012c }
            r15 = 363(0x16b, float:5.09E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x012c }
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch:{ all -> 0x012c }
            m11397u(r3, r14, r15, r5)     // Catch:{ all -> 0x012c }
            r5 = r5[r4]     // Catch:{ all -> 0x012c }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x012c }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x012c }
            r14 = 280(0x118, float:3.92E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x012c }
            byte r11 = r10[r11]     // Catch:{ all -> 0x012c }
            byte r11 = (byte) r11     // Catch:{ all -> 0x012c }
            r12 = r11 | 373(0x175, float:5.23E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x012c }
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x012c }
            m11397u(r14, r11, r12, r9)     // Catch:{ all -> 0x012c }
            r9 = r9[r4]     // Catch:{ all -> 0x012c }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x012c }
            java.lang.Class[] r11 = new java.lang.Class[r6]     // Catch:{ all -> 0x012c }
            r12 = 696(0x2b8, float:9.75E-43)
            byte r14 = r10[r12]     // Catch:{ all -> 0x012c }
            byte r12 = (byte) r14     // Catch:{ all -> 0x012c }
            r14 = r12 | 352(0x160, float:4.93E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x012c }
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ all -> 0x012c }
            m11397u(r7, r12, r14, r4)     // Catch:{ all -> 0x012c }
            r12 = 0
            r4 = r4[r12]     // Catch:{ all -> 0x012c }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x012c }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x012c }
            r11[r12] = r4     // Catch:{ all -> 0x012c }
            java.lang.reflect.Method r4 = r5.getMethod(r9, r11)     // Catch:{ all -> 0x012c }
            r5 = 0
            java.lang.Object r4 = r4.invoke(r5, r13)     // Catch:{ all -> 0x012c }
            r9 = 696(0x2b8, float:9.75E-43)
            byte r11 = r10[r9]     // Catch:{ all -> 0x0123 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0123 }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x0123 }
            m11397u(r3, r11, r15, r12)     // Catch:{ all -> 0x0123 }
            r11 = 0
            r12 = r12[r11]     // Catch:{ all -> 0x0123 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0123 }
            java.lang.Class r11 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0123 }
            r12 = 286(0x11e, float:4.01E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0123 }
            r13 = 820(0x334, float:1.149E-42)
            byte r10 = r10[r13]     // Catch:{ all -> 0x0123 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0123 }
            r13 = 372(0x174, float:5.21E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0123 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0123 }
            m11397u(r12, r10, r13, r14)     // Catch:{ all -> 0x0123 }
            r12 = 0
            r10 = r14[r12]     // Catch:{ all -> 0x0123 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0123 }
            java.lang.reflect.Method r10 = r11.getMethod(r10, r5)     // Catch:{ all -> 0x0123 }
            java.lang.Object r4 = r10.invoke(r4, r5)     // Catch:{ all -> 0x0123 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0123 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0123 }
            r2[r8] = r4
            int r8 = r8 + 1
            r4 = r12
            r5 = 74
            r12 = 4
            goto L_0x008f
        L_0x0123:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x012b
            throw r1
        L_0x012b:
            throw r0
        L_0x012c:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0134
            throw r1
        L_0x0134:
            throw r0
        L_0x0135:
            r12 = r4
            r1 = r12
        L_0x0137:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r0.mo9113c(r1)
            r4 = 43
            r5 = 34
            r7 = 5
            r8 = 7
            r9 = 2
            r10 = 3
            switch(r1) {
                case -38: goto L_0x02d9;
                case -37: goto L_0x02cb;
                case -36: goto L_0x02c7;
                case -35: goto L_0x02b6;
                case -34: goto L_0x02b2;
                case -33: goto L_0x02ae;
                case -32: goto L_0x02a1;
                case -31: goto L_0x0293;
                case -30: goto L_0x028a;
                case -29: goto L_0x0287;
                case -28: goto L_0x0283;
                case -27: goto L_0x0278;
                case -26: goto L_0x026a;
                case -25: goto L_0x0267;
                case -24: goto L_0x0264;
                case -23: goto L_0x024c;
                case -22: goto L_0x0249;
                case -21: goto L_0x0236;
                case -20: goto L_0x01ff;
                case -19: goto L_0x01fb;
                case -18: goto L_0x01f7;
                case -17: goto L_0x01ec;
                case -16: goto L_0x01da;
                case -15: goto L_0x01c7;
                case -14: goto L_0x01b8;
                case -13: goto L_0x019e;
                case -12: goto L_0x019d;
                case -11: goto L_0x019a;
                case -10: goto L_0x0197;
                case -9: goto L_0x018d;
                case -8: goto L_0x018a;
                case -7: goto L_0x0169;
                case -6: goto L_0x0166;
                case -5: goto L_0x0163;
                case -4: goto L_0x0158;
                case -3: goto L_0x0154;
                case -2: goto L_0x0150;
                case -1: goto L_0x014d;
                default: goto L_0x014a;
            }
        L_0x014a:
            r1 = 4
            goto L_0x02dc
        L_0x014d:
            r1 = 48
            goto L_0x0137
        L_0x0150:
            com.facetec.sdk.bg$a r1 = f9210k
            goto L_0x0246
        L_0x0154:
            com.facetec.sdk.bg$a r1 = com.facetec.sdk.C2840bg.C2842a.VALIDATED
            goto L_0x0246
        L_0x0158:
            r1 = 9
            r0.mo9113c(r1)
            int r1 = r0.f9902d
            if (r1 != 0) goto L_0x02dc
            r1 = r7
            goto L_0x0137
        L_0x0163:
            r1 = 53
            goto L_0x0137
        L_0x0166:
            r1 = 11
            goto L_0x0137
        L_0x0169:
            r0.f9900b = r10
            r0.mo9113c(r9)
            r0.mo9113c(r10)
            java.lang.Object r1 = r0.f9904f
            android.content.Context r1 = (android.content.Context) r1
            r0.mo9113c(r10)
            java.lang.Object r4 = r0.f9904f
            com.facetec.sdk.FaceTecSDK$InitializeCallback r4 = (com.facetec.sdk.FaceTecSDK.InitializeCallback) r4
            r0.mo9113c(r8)
            int r5 = r0.f9902d
            if (r5 == 0) goto L_0x0185
            r5 = r6
            goto L_0x0186
        L_0x0185:
            r5 = r12
        L_0x0186:
            m11353b((android.content.Context) r1, (com.facetec.sdk.FaceTecSDK.InitializeCallback) r4, (boolean) r5)
            goto L_0x014a
        L_0x018a:
            r1 = 64
            goto L_0x0137
        L_0x018d:
            r0.mo9113c(r4)
            int r1 = r0.f9902d
            if (r1 != 0) goto L_0x02dc
            r1 = 14
            goto L_0x0137
        L_0x0197:
            r1 = 83
            goto L_0x0137
        L_0x019a:
            r1 = 81
            goto L_0x0137
        L_0x019d:
            return
        L_0x019e:
            r0.f9900b = r9
            r0.mo9113c(r9)
            r0.mo9113c(r10)
            java.lang.Object r1 = r0.f9904f
            android.content.Context r1 = (android.content.Context) r1
            r0.mo9113c(r8)
            int r4 = r0.f9902d
            if (r4 == 0) goto L_0x01b3
            r4 = r6
            goto L_0x01b4
        L_0x01b3:
            r4 = r12
        L_0x01b4:
            m11355b(r1, r4)
            goto L_0x014a
        L_0x01b8:
            r0.f9900b = r6
            r0.mo9113c(r9)
            r0.mo9113c(r10)
            java.lang.Object r1 = r0.f9904f
            java.lang.String r1 = (java.lang.String) r1
            f9201b = r1
            goto L_0x014a
        L_0x01c7:
            r0.f9900b = r6
            r0.mo9113c(r9)
            r0.mo9113c(r8)
            int r1 = r0.f9902d
            if (r1 == 0) goto L_0x01d5
            r1 = r6
            goto L_0x01d6
        L_0x01d5:
            r1 = r12
        L_0x01d6:
            f9214o = r1
            goto L_0x014a
        L_0x01da:
            r0.f9900b = r6
            r0.mo9113c(r9)
            r0.mo9113c(r10)
            java.lang.Object r1 = r0.f9904f
            android.content.Context r1 = (android.content.Context) r1
            boolean r1 = m11375f(r1)
            goto L_0x028c
        L_0x01ec:
            r0.mo9113c(r7)
            int r1 = r0.f9902d
            if (r1 != 0) goto L_0x02dc
            r1 = 30
            goto L_0x0137
        L_0x01f7:
            r1 = 78
            goto L_0x0137
        L_0x01fb:
            r1 = 76
            goto L_0x0137
        L_0x01ff:
            r0.f9900b = r7
            r0.mo9113c(r9)
            r0.mo9113c(r10)
            java.lang.Object r1 = r0.f9904f
            r14 = r1
            java.lang.String r14 = (java.lang.String) r14
            r0.mo9113c(r10)
            java.lang.Object r1 = r0.f9904f
            r15 = r1
            android.content.Context r15 = (android.content.Context) r15
            r0.mo9113c(r10)
            java.lang.Object r1 = r0.f9904f
            r16 = r1
            com.facetec.sdk.FaceTecSDK$InitializeCallback r16 = (com.facetec.sdk.FaceTecSDK.InitializeCallback) r16
            r0.mo9113c(r10)
            java.lang.Object r1 = r0.f9904f
            r17 = r1
            java.lang.String r17 = (java.lang.String) r17
            r0.mo9113c(r10)
            java.lang.Object r1 = r0.f9904f
            r18 = r1
            java.lang.String r18 = (java.lang.String) r18
            com.facetec.sdk.y5 r1 = new com.facetec.sdk.y5
            r13 = r1
            r13.<init>(r14, r15, r16, r17, r18)
            goto L_0x0246
        L_0x0236:
            r0.f9900b = r6
            r0.mo9113c(r9)
            r0.mo9113c(r10)
            java.lang.Object r1 = r0.f9904f
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            com.facetec.sdk.cv r1 = com.facetec.sdk.C2920cv.m12195c(r1)
        L_0x0246:
            r0.f9906h = r1
            goto L_0x025f
        L_0x0249:
            r1 = r4
            goto L_0x0137
        L_0x024c:
            r0.f9900b = r6
            r0.mo9113c(r9)
            r0.mo9113c(r10)
            java.lang.Object r1 = r0.f9904f
            android.content.Context r1 = (android.content.Context) r1
            com.facetec.sdk.z5 r4 = new com.facetec.sdk.z5
            r4.<init>(r1)
            r0.f9906h = r4
        L_0x025f:
            r0.mo9113c(r6)
            goto L_0x014a
        L_0x0264:
            r1 = r6
            goto L_0x0137
        L_0x0267:
            int r1 = f9216r
            goto L_0x028c
        L_0x026a:
            r0.f9900b = r6
            r0.mo9113c(r9)
            r0.mo9113c(r8)
            int r1 = r0.f9902d
            f9215p = r1
            goto L_0x014a
        L_0x0278:
            r0.mo9113c(r7)
            int r1 = r0.f9902d
            if (r1 != 0) goto L_0x02dc
            r1 = 62
            goto L_0x0137
        L_0x0283:
            r1 = 63
            goto L_0x0137
        L_0x0287:
            r1 = r11
            goto L_0x0137
        L_0x028a:
            int r1 = f9215p
        L_0x028c:
            r0.f9900b = r1
            r1 = 4
            r0.mo9113c(r1)
            goto L_0x02dc
        L_0x0293:
            r1 = 4
            r0.f9900b = r6
            r0.mo9113c(r9)
            r0.mo9113c(r8)
            int r4 = r0.f9902d
            f9216r = r4
            goto L_0x02dc
        L_0x02a1:
            r1 = 4
            r4 = 23
            r0.mo9113c(r4)
            int r4 = r0.f9902d
            if (r4 != 0) goto L_0x02dc
            r3 = 73
            goto L_0x02dc
        L_0x02ae:
            r1 = 74
            goto L_0x0137
        L_0x02b2:
            r1 = 4
            r3 = 51
            goto L_0x02dc
        L_0x02b6:
            r1 = 4
            r0.mo9113c(r5)
            int r3 = r0.f9902d
            r4 = 31
            if (r3 == 0) goto L_0x0249
            if (r3 == r6) goto L_0x02c3
            goto L_0x0249
        L_0x02c3:
            r3 = 38
            r4 = r3
            goto L_0x0249
        L_0x02c7:
            r1 = 4
            r3 = 75
            goto L_0x02dc
        L_0x02cb:
            r1 = 4
            r0.mo9113c(r5)
            int r3 = r0.f9902d
            if (r3 == 0) goto L_0x02d6
            r3 = 20
            goto L_0x02dc
        L_0x02d6:
            r3 = 15
            goto L_0x02dc
        L_0x02d9:
            r1 = 4
            r3 = 80
        L_0x02dc:
            r1 = r3
            goto L_0x0137
        L_0x02df:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x02e7
            throw r1
        L_0x02e7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2840bg.m11354b(android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.facetec.sdk.FaceTecSDK$InitializeCallback):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x019d, code lost:
        r0.f9900b = r1;
        r0.mo9113c(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01c5, code lost:
        r1 = r2;
     */
    @com.guardsquare.dexguard.annotation.VirtualizeCode
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11359c(android.content.Context r16, com.facetec.sdk.FaceTecSDK.InitializeCallback r17) {
        /*
            com.facetec.sdk.dh r0 = new com.facetec.sdk.dh
            r1 = r16
            r2 = r17
            r0.<init>(r1, r2)
            r1 = 701(0x2bd, float:9.82E-43)
            short r1 = (short) r1
            r2 = 73
            byte r2 = (byte) r2
            r3 = 277(0x115, float:3.88E-43)
            short r3 = (short) r3
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            m11397u(r1, r2, r3, r5)
            r1 = 0
            r2 = r5[r1]
            java.lang.String r2 = (java.lang.String) r2
            r3 = 685(0x2ad, float:9.6E-43)
            short r3 = (short) r3
            r5 = 74
            byte r5 = (byte) r5
            r6 = r5 | 305(0x131, float:4.27E-43)
            short r6 = (short) r6
            java.lang.Object[] r7 = new java.lang.Object[r4]
            m11397u(r3, r5, r6, r7)
            r5 = r7[r1]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x01c8 }
            r6[r1] = r5     // Catch:{ all -> 0x01c8 }
            r5 = 865(0x361, float:1.212E-42)
            short r5 = (short) r5     // Catch:{ all -> 0x01c8 }
            byte[] r7 = f9206g     // Catch:{ all -> 0x01c8 }
            r8 = 696(0x2b8, float:9.75E-43)
            byte r9 = r7[r8]     // Catch:{ all -> 0x01c8 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x01c8 }
            r10 = r9 | 352(0x160, float:4.93E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x01c8 }
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ all -> 0x01c8 }
            m11397u(r5, r9, r10, r11)     // Catch:{ all -> 0x01c8 }
            r9 = r11[r1]     // Catch:{ all -> 0x01c8 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x01c8 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x01c8 }
            r10 = 809(0x329, float:1.134E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x01c8 }
            r11 = 4
            byte r12 = r7[r11]     // Catch:{ all -> 0x01c8 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x01c8 }
            r13 = r12 | 372(0x174, float:5.21E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x01c8 }
            java.lang.Object[] r14 = new java.lang.Object[r4]     // Catch:{ all -> 0x01c8 }
            m11397u(r10, r12, r13, r14)     // Catch:{ all -> 0x01c8 }
            r10 = r14[r1]     // Catch:{ all -> 0x01c8 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x01c8 }
            java.lang.Class[] r12 = new java.lang.Class[r4]     // Catch:{ all -> 0x01c8 }
            byte r7 = r7[r8]     // Catch:{ all -> 0x01c8 }
            byte r7 = (byte) r7     // Catch:{ all -> 0x01c8 }
            r13 = r7 | 352(0x160, float:4.93E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x01c8 }
            java.lang.Object[] r14 = new java.lang.Object[r4]     // Catch:{ all -> 0x01c8 }
            m11397u(r5, r7, r13, r14)     // Catch:{ all -> 0x01c8 }
            r7 = r14[r1]     // Catch:{ all -> 0x01c8 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x01c8 }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x01c8 }
            r12[r1] = r7     // Catch:{ all -> 0x01c8 }
            java.lang.reflect.Method r7 = r9.getMethod(r10, r12)     // Catch:{ all -> 0x01c8 }
            java.lang.Object r2 = r7.invoke(r2, r6)     // Catch:{ all -> 0x01c8 }
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ all -> 0x01c8 }
            int r6 = r2.length
            int[] r6 = new int[r6]
            r7 = r1
        L_0x0085:
            int r9 = r2.length
            r10 = 6
            if (r7 >= r9) goto L_0x012a
            r9 = r2[r7]
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ all -> 0x0121 }
            r12[r1] = r9     // Catch:{ all -> 0x0121 }
            byte[] r9 = f9206g     // Catch:{ all -> 0x0121 }
            byte r13 = r9[r8]     // Catch:{ all -> 0x0121 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x0121 }
            r14 = 363(0x16b, float:5.09E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0121 }
            java.lang.Object[] r15 = new java.lang.Object[r4]     // Catch:{ all -> 0x0121 }
            m11397u(r3, r13, r14, r15)     // Catch:{ all -> 0x0121 }
            r13 = r15[r1]     // Catch:{ all -> 0x0121 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0121 }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x0121 }
            r15 = 280(0x118, float:3.92E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0121 }
            byte r10 = r9[r10]     // Catch:{ all -> 0x0121 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0121 }
            r11 = r10 | 373(0x175, float:5.23E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x0121 }
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x0121 }
            m11397u(r15, r10, r11, r8)     // Catch:{ all -> 0x0121 }
            r8 = r8[r1]     // Catch:{ all -> 0x0121 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0121 }
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ all -> 0x0121 }
            r11 = 696(0x2b8, float:9.75E-43)
            byte r15 = r9[r11]     // Catch:{ all -> 0x0121 }
            byte r11 = (byte) r15     // Catch:{ all -> 0x0121 }
            r15 = r11 | 352(0x160, float:4.93E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0121 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x0121 }
            m11397u(r5, r11, r15, r1)     // Catch:{ all -> 0x0121 }
            r11 = 0
            r1 = r1[r11]     // Catch:{ all -> 0x0121 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0121 }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0121 }
            r10[r11] = r1     // Catch:{ all -> 0x0121 }
            java.lang.reflect.Method r1 = r13.getMethod(r8, r10)     // Catch:{ all -> 0x0121 }
            r8 = 0
            java.lang.Object r1 = r1.invoke(r8, r12)     // Catch:{ all -> 0x0121 }
            r10 = 696(0x2b8, float:9.75E-43)
            byte r11 = r9[r10]     // Catch:{ all -> 0x0118 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0118 }
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ all -> 0x0118 }
            m11397u(r3, r11, r14, r12)     // Catch:{ all -> 0x0118 }
            r11 = 0
            r12 = r12[r11]     // Catch:{ all -> 0x0118 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0118 }
            java.lang.Class r11 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0118 }
            r12 = 286(0x11e, float:4.01E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0118 }
            r13 = 820(0x334, float:1.149E-42)
            byte r9 = r9[r13]     // Catch:{ all -> 0x0118 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x0118 }
            r13 = 372(0x174, float:5.21E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0118 }
            java.lang.Object[] r14 = new java.lang.Object[r4]     // Catch:{ all -> 0x0118 }
            m11397u(r12, r9, r13, r14)     // Catch:{ all -> 0x0118 }
            r9 = 0
            r12 = r14[r9]     // Catch:{ all -> 0x0118 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0118 }
            java.lang.reflect.Method r11 = r11.getMethod(r12, r8)     // Catch:{ all -> 0x0118 }
            java.lang.Object r1 = r11.invoke(r1, r8)     // Catch:{ all -> 0x0118 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0118 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0118 }
            r6[r7] = r1
            int r7 = r7 + 1
            r1 = r9
            r8 = r10
            r11 = 4
            goto L_0x0085
        L_0x0118:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0120
            throw r1
        L_0x0120:
            throw r0
        L_0x0121:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0129
            throw r1
        L_0x0129:
            throw r0
        L_0x012a:
            r9 = r1
        L_0x012b:
            int r2 = r1 + 1
            r1 = r6[r1]
            int r1 = r0.mo9113c(r1)
            r3 = 7
            r5 = 3
            r7 = 2
            switch(r1) {
                case -16: goto L_0x01c2;
                case -15: goto L_0x01be;
                case -14: goto L_0x01b2;
                case -13: goto L_0x01a4;
                case -12: goto L_0x019b;
                case -11: goto L_0x0199;
                case -10: goto L_0x0196;
                case -9: goto L_0x018a;
                case -8: goto L_0x017d;
                case -7: goto L_0x017a;
                case -6: goto L_0x0179;
                case -5: goto L_0x0176;
                case -4: goto L_0x0173;
                case -3: goto L_0x015c;
                case -2: goto L_0x013e;
                case -1: goto L_0x013c;
                default: goto L_0x0139;
            }
        L_0x0139:
            r1 = 4
            goto L_0x01c5
        L_0x013c:
            r1 = r10
            goto L_0x012b
        L_0x013e:
            r0.f9900b = r7
            r0.mo9113c(r7)
            r0.mo9113c(r5)
            java.lang.Object r1 = r0.f9904f
            android.content.Context r1 = (android.content.Context) r1
            r0.mo9113c(r5)
            java.lang.Object r3 = r0.f9904f
            com.facetec.sdk.FaceTecSDK$InitializeCallback r3 = (com.facetec.sdk.FaceTecSDK.InitializeCallback) r3
            com.facetec.sdk.d6 r5 = new com.facetec.sdk.d6
            r5.<init>(r1, r3)
            r0.f9906h = r5
            r0.mo9113c(r4)
            goto L_0x0139
        L_0x015c:
            r0.f9900b = r7
            r0.mo9113c(r7)
            r0.mo9113c(r5)
            java.lang.Object r1 = r0.f9904f
            android.content.Context r1 = (android.content.Context) r1
            r0.mo9113c(r5)
            java.lang.Object r3 = r0.f9904f
            com.facetec.sdk.au$e r3 = (com.facetec.sdk.C2802au.C2807e) r3
            m11360c((android.content.Context) r1, (com.facetec.sdk.C2802au.C2807e) r3)
            goto L_0x0139
        L_0x0173:
            r1 = 21
            goto L_0x012b
        L_0x0176:
            r1 = 11
            goto L_0x012b
        L_0x0179:
            return
        L_0x017a:
            int r1 = f9215p
            goto L_0x019d
        L_0x017d:
            r0.f9900b = r4
            r0.mo9113c(r7)
            r0.mo9113c(r3)
            int r1 = r0.f9902d
            f9216r = r1
            goto L_0x0139
        L_0x018a:
            r1 = 23
            r0.mo9113c(r1)
            int r1 = r0.f9902d
            if (r1 != 0) goto L_0x01c5
            r1 = 19
            goto L_0x012b
        L_0x0196:
            r1 = 20
            goto L_0x012b
        L_0x0199:
            r1 = r4
            goto L_0x012b
        L_0x019b:
            int r1 = f9216r
        L_0x019d:
            r0.f9900b = r1
            r1 = 4
            r0.mo9113c(r1)
            goto L_0x01c5
        L_0x01a4:
            r1 = 4
            r0.f9900b = r4
            r0.mo9113c(r7)
            r0.mo9113c(r3)
            int r3 = r0.f9902d
            f9215p = r3
            goto L_0x01c5
        L_0x01b2:
            r1 = 4
            r3 = 5
            r0.mo9113c(r3)
            int r3 = r0.f9902d
            if (r3 != 0) goto L_0x01c5
            r2 = 30
            goto L_0x01c5
        L_0x01be:
            r1 = 4
            r2 = 31
            goto L_0x01c5
        L_0x01c2:
            r1 = 4
            r2 = 9
        L_0x01c5:
            r1 = r2
            goto L_0x012b
        L_0x01c8:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x01d0
            throw r1
        L_0x01d0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2840bg.m11359c(android.content.Context, com.facetec.sdk.FaceTecSDK$InitializeCallback):void");
    }

    /* JADX WARNING: type inference failed for: r10v6 */
    /* JADX WARNING: type inference failed for: r10v22 */
    /* JADX WARNING: type inference failed for: r10v24 */
    /* JADX WARNING: type inference failed for: r10v25 */
    /* JADX WARNING: type inference failed for: r10v29 */
    /* JADX WARNING: type inference failed for: r10v31 */
    /* JADX WARNING: type inference failed for: r10v32 */
    /* JADX WARNING: type inference failed for: r10v36 */
    /* JADX WARNING: type inference failed for: r10v37 */
    /* JADX WARNING: type inference failed for: r10v38 */
    /* JADX WARNING: type inference failed for: r10v41 */
    /* JADX WARNING: type inference failed for: r10v42 */
    /* JADX WARNING: type inference failed for: r10v43 */
    /* JADX WARNING: type inference failed for: r10v44 */
    /* JADX WARNING: type inference failed for: r10v45 */
    /* JADX WARNING: type inference failed for: r10v46 */
    /* JADX WARNING: type inference failed for: r10v52 */
    /* JADX WARNING: type inference failed for: r10v60 */
    /* JADX WARNING: type inference failed for: r10v61 */
    /* JADX WARNING: type inference failed for: r10v62 */
    /* JADX WARNING: type inference failed for: r10v63 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        r1.mo9113c(r7);
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0384, code lost:
        r9 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0388, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0389, code lost:
        r14 = r7;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03ce, code lost:
        r9 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0478, code lost:
        if (r1.f9902d != 64) goto L_0x047a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x047a, code lost:
        r0 = 52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04ae, code lost:
        if (r1.f9902d != 38) goto L_0x047a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x015e, code lost:
        r1.mo9113c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01cf, code lost:
        r1.mo9113c(1);
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x021d, code lost:
        r0 = 11;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x04cb A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x04d4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x04e0 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ee A[Catch:{ all -> 0x01d4, all -> 0x03ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ef A[Catch:{ all -> 0x01d4, all -> 0x03ae }] */
    @com.guardsquare.dexguard.annotation.VirtualizeCode
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m11367d(android.content.Context r18, java.lang.String r19, java.lang.String r20, com.facetec.sdk.FaceTecSDK.InitializeCallback r21) {
        /*
            com.facetec.sdk.dh r1 = new com.facetec.sdk.dh
            r0 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r1.<init>(r0, r2, r3, r4)
            r0 = 293(0x125, float:4.1E-43)
            short r0 = (short) r0
            int r2 = r0 >>> 2
            byte r2 = (byte) r2
            byte[] r3 = f9206g
            r4 = 6
            byte r5 = r3[r4]
            short r5 = (short) r5
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            m11397u(r0, r2, r5, r7)
            r2 = 0
            r0 = r7[r2]
            java.lang.String r0 = (java.lang.String) r0
            r5 = 685(0x2ad, float:9.6E-43)
            short r5 = (short) r5
            r7 = 74
            byte r7 = (byte) r7
            r8 = r7 | 305(0x131, float:4.27E-43)
            short r8 = (short) r8
            java.lang.Object[] r9 = new java.lang.Object[r6]
            m11397u(r5, r7, r8, r9)
            r7 = r9[r2]
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x04e1 }
            r8[r2] = r7     // Catch:{ all -> 0x04e1 }
            r7 = 865(0x361, float:1.212E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x04e1 }
            r9 = 696(0x2b8, float:9.75E-43)
            byte r10 = r3[r9]     // Catch:{ all -> 0x04e1 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x04e1 }
            r11 = r10 | 352(0x160, float:4.93E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x04e1 }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x04e1 }
            m11397u(r7, r10, r11, r12)     // Catch:{ all -> 0x04e1 }
            r10 = r12[r2]     // Catch:{ all -> 0x04e1 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x04e1 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x04e1 }
            r11 = 809(0x329, float:1.134E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x04e1 }
            r12 = 4
            byte r13 = r3[r12]     // Catch:{ all -> 0x04e1 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x04e1 }
            r14 = r13 | 372(0x174, float:5.21E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x04e1 }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x04e1 }
            m11397u(r11, r13, r14, r15)     // Catch:{ all -> 0x04e1 }
            r11 = r15[r2]     // Catch:{ all -> 0x04e1 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x04e1 }
            java.lang.Class[] r13 = new java.lang.Class[r6]     // Catch:{ all -> 0x04e1 }
            byte r3 = r3[r9]     // Catch:{ all -> 0x04e1 }
            byte r3 = (byte) r3     // Catch:{ all -> 0x04e1 }
            r14 = r3 | 352(0x160, float:4.93E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x04e1 }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x04e1 }
            m11397u(r7, r3, r14, r15)     // Catch:{ all -> 0x04e1 }
            r3 = r15[r2]     // Catch:{ all -> 0x04e1 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x04e1 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x04e1 }
            r13[r2] = r3     // Catch:{ all -> 0x04e1 }
            java.lang.reflect.Method r3 = r10.getMethod(r11, r13)     // Catch:{ all -> 0x04e1 }
            java.lang.Object r0 = r3.invoke(r0, r8)     // Catch:{ all -> 0x04e1 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x04e1 }
            int r3 = r0.length
            int[] r3 = new int[r3]
            r8 = r2
        L_0x008a:
            int r10 = r0.length
            if (r8 >= r10) goto L_0x0131
            r10 = r0[r8]
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x0128 }
            r13[r2] = r10     // Catch:{ all -> 0x0128 }
            byte[] r10 = f9206g     // Catch:{ all -> 0x0128 }
            byte r14 = r10[r9]     // Catch:{ all -> 0x0128 }
            byte r14 = (byte) r14     // Catch:{ all -> 0x0128 }
            r15 = 363(0x16b, float:5.09E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0128 }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x0128 }
            m11397u(r5, r14, r15, r12)     // Catch:{ all -> 0x0128 }
            r12 = r12[r2]     // Catch:{ all -> 0x0128 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0128 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0128 }
            r14 = 280(0x118, float:3.92E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0128 }
            byte r11 = r10[r4]     // Catch:{ all -> 0x0128 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0128 }
            r4 = r11 | 373(0x175, float:5.23E-43)
            short r4 = (short) r4     // Catch:{ all -> 0x0128 }
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x0128 }
            m11397u(r14, r11, r4, r9)     // Catch:{ all -> 0x0128 }
            r4 = r9[r2]     // Catch:{ all -> 0x0128 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0128 }
            java.lang.Class[] r9 = new java.lang.Class[r6]     // Catch:{ all -> 0x0128 }
            r11 = 696(0x2b8, float:9.75E-43)
            byte r14 = r10[r11]     // Catch:{ all -> 0x0128 }
            byte r11 = (byte) r14     // Catch:{ all -> 0x0128 }
            r14 = r11 | 352(0x160, float:4.93E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0128 }
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ all -> 0x0128 }
            m11397u(r7, r11, r14, r2)     // Catch:{ all -> 0x0128 }
            r11 = 0
            r2 = r2[r11]     // Catch:{ all -> 0x0128 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0128 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0128 }
            r9[r11] = r2     // Catch:{ all -> 0x0128 }
            java.lang.reflect.Method r2 = r12.getMethod(r4, r9)     // Catch:{ all -> 0x0128 }
            r4 = 0
            java.lang.Object r2 = r2.invoke(r4, r13)     // Catch:{ all -> 0x0128 }
            r4 = 696(0x2b8, float:9.75E-43)
            byte r9 = r10[r4]     // Catch:{ all -> 0x011f }
            byte r4 = (byte) r9     // Catch:{ all -> 0x011f }
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x011f }
            m11397u(r5, r4, r15, r9)     // Catch:{ all -> 0x011f }
            r4 = 0
            r9 = r9[r4]     // Catch:{ all -> 0x011f }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x011f }
            java.lang.Class r4 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x011f }
            r9 = 286(0x11e, float:4.01E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x011f }
            r11 = 820(0x334, float:1.149E-42)
            byte r10 = r10[r11]     // Catch:{ all -> 0x011f }
            byte r10 = (byte) r10     // Catch:{ all -> 0x011f }
            r11 = 372(0x174, float:5.21E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x011f }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x011f }
            m11397u(r9, r10, r11, r12)     // Catch:{ all -> 0x011f }
            r9 = 0
            r10 = r12[r9]     // Catch:{ all -> 0x011f }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x011f }
            r9 = 0
            java.lang.reflect.Method r4 = r4.getMethod(r10, r9)     // Catch:{ all -> 0x011f }
            java.lang.Object r2 = r4.invoke(r2, r9)     // Catch:{ all -> 0x011f }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x011f }
            int r2 = r2.intValue()     // Catch:{ all -> 0x011f }
            r3[r8] = r2
            int r8 = r8 + 1
            r2 = 0
            r4 = 6
            r9 = 696(0x2b8, float:9.75E-43)
            r12 = 4
            goto L_0x008a
        L_0x011f:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0127
            throw r1
        L_0x0127:
            throw r0
        L_0x0128:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0130
            throw r1
        L_0x0130:
            throw r0
        L_0x0131:
            r0 = 0
        L_0x0132:
            int r2 = r0 + 1
            r4 = 95
            r5 = 81
            r0 = r3[r0]     // Catch:{ all -> 0x04c0 }
            int r0 = r1.mo9113c(r0)     // Catch:{ all -> 0x04c0 }
            r7 = 38
            r8 = 11
            r9 = 23
            r10 = 52
            r11 = 5
            r12 = 34
            r13 = 7
            r14 = 3
            r15 = 2
            switch(r0) {
                case -54: goto L_0x04b3;
                case -53: goto L_0x04a3;
                case -52: goto L_0x0499;
                case -51: goto L_0x0482;
                case -50: goto L_0x047d;
                case -49: goto L_0x046b;
                case -48: goto L_0x0461;
                case -47: goto L_0x0457;
                case -46: goto L_0x0442;
                case -45: goto L_0x0438;
                case -44: goto L_0x042e;
                case -43: goto L_0x041d;
                case -42: goto L_0x040d;
                case -41: goto L_0x0403;
                case -40: goto L_0x03f9;
                case -39: goto L_0x03e8;
                case -38: goto L_0x03d5;
                case -37: goto L_0x03c1;
                case -36: goto L_0x03bc;
                case -35: goto L_0x03b3;
                case -34: goto L_0x039e;
                case -33: goto L_0x038c;
                case -32: goto L_0x0377;
                case -31: goto L_0x036e;
                case -30: goto L_0x0369;
                case -29: goto L_0x034f;
                case -28: goto L_0x0346;
                case -27: goto L_0x032d;
                case -26: goto L_0x0305;
                case -25: goto L_0x0300;
                case -24: goto L_0x02f7;
                case -23: goto L_0x02e7;
                case -22: goto L_0x02cd;
                case -21: goto L_0x02b4;
                case -20: goto L_0x029f;
                case -19: goto L_0x029e;
                case -18: goto L_0x0276;
                case -17: goto L_0x0271;
                case -16: goto L_0x0268;
                case -15: goto L_0x0256;
                case -14: goto L_0x024b;
                case -13: goto L_0x0241;
                case -12: goto L_0x0220;
                case -11: goto L_0x021b;
                case -10: goto L_0x0206;
                case -9: goto L_0x01f0;
                case -8: goto L_0x0195;
                case -7: goto L_0x0192;
                case -6: goto L_0x018f;
                case -5: goto L_0x0186;
                case -4: goto L_0x0167;
                case -3: goto L_0x0162;
                case -2: goto L_0x015a;
                case -1: goto L_0x0157;
                default: goto L_0x014f;
            }     // Catch:{ all -> 0x04c0 }
        L_0x014f:
            r9 = 0
            r14 = 4
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            goto L_0x04bd
        L_0x0157:
            r0 = 47
            goto L_0x0132
        L_0x015a:
            java.lang.String r0 = com.facetec.sdk.C3555s.f11479e     // Catch:{ all -> 0x04c0 }
            r1.f9906h = r0     // Catch:{ all -> 0x04c0 }
        L_0x015e:
            r1.mo9113c(r6)     // Catch:{ all -> 0x04c0 }
            goto L_0x014f
        L_0x0162:
            java.lang.String r0 = ""
            r1.f9906h = r0     // Catch:{ all -> 0x04c0 }
            goto L_0x015e
        L_0x0167:
            r1.f9900b = r15     // Catch:{ all -> 0x04c0 }
            r1.mo9113c(r15)     // Catch:{ all -> 0x04c0 }
            r1.mo9113c(r14)     // Catch:{ all -> 0x04c0 }
            java.lang.Object r0 = r1.f9904f     // Catch:{ all -> 0x04c0 }
            r1.mo9113c(r14)     // Catch:{ all -> 0x04c0 }
            java.lang.Object r7 = r1.f9904f     // Catch:{ all -> 0x04c0 }
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x04c0 }
            r1.f9900b = r0     // Catch:{ all -> 0x04c0 }
            r7 = 4
            r1.mo9113c(r7)     // Catch:{ all -> 0x0181 }
            goto L_0x014f
        L_0x0181:
            r0 = move-exception
            r14 = r7
            r9 = 0
            goto L_0x04c3
        L_0x0186:
            r1.mo9113c(r11)     // Catch:{ all -> 0x04c0 }
            int r0 = r1.f9902d     // Catch:{ all -> 0x04c0 }
            if (r0 != 0) goto L_0x04bd
            r0 = 6
            goto L_0x0132
        L_0x018f:
            r0 = 98
            goto L_0x0132
        L_0x0192:
            r0 = 96
            goto L_0x0132
        L_0x0195:
            r0 = 672(0x2a0, float:9.42E-43)
            short r0 = (short) r0
            byte[] r7 = f9206g     // Catch:{ all -> 0x01e2 }
            r17 = 696(0x2b8, float:9.75E-43)
            byte r8 = r7[r17]     // Catch:{ all -> 0x01dd }
            byte r8 = (byte) r8     // Catch:{ all -> 0x01dd }
            r9 = r8 | 354(0x162, float:4.96E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x01dd }
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ all -> 0x01dd }
            m11397u(r0, r8, r9, r10)     // Catch:{ all -> 0x01dd }
            r8 = 0
            r0 = r10[r8]     // Catch:{ all -> 0x01d8 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01dd }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x01dd }
            r8 = 852(0x354, float:1.194E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x01dd }
            byte r7 = r7[r13]     // Catch:{ all -> 0x01dd }
            byte r7 = (byte) r7     // Catch:{ all -> 0x01dd }
            r9 = 370(0x172, float:5.18E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x01dd }
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ all -> 0x01dd }
            m11397u(r8, r7, r9, r10)     // Catch:{ all -> 0x01dd }
            r16 = 0
            r7 = r10[r16]     // Catch:{ all -> 0x01d6 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x01d6 }
            r10 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r7, r10)     // Catch:{ all -> 0x01d4 }
            java.lang.Object r0 = r0.invoke(r10, r10)     // Catch:{ all -> 0x01d4 }
            r1.f9906h = r0     // Catch:{ all -> 0x03ae }
        L_0x01cf:
            r1.mo9113c(r6)     // Catch:{ all -> 0x03ae }
            goto L_0x0384
        L_0x01d4:
            r0 = move-exception
            goto L_0x01e8
        L_0x01d6:
            r0 = move-exception
            goto L_0x01db
        L_0x01d8:
            r0 = move-exception
            r16 = r8
        L_0x01db:
            r10 = 0
            goto L_0x01e8
        L_0x01dd:
            r0 = move-exception
            r10 = 0
            r16 = 0
            goto L_0x01e8
        L_0x01e2:
            r0 = move-exception
            r10 = 0
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
        L_0x01e8:
            java.lang.Throwable r7 = r0.getCause()     // Catch:{ all -> 0x03ae }
            if (r7 == 0) goto L_0x01ef
            throw r7     // Catch:{ all -> 0x03ae }
        L_0x01ef:
            throw r0     // Catch:{ all -> 0x03ae }
        L_0x01f0:
            r10 = 0
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r1.f9900b = r6     // Catch:{ all -> 0x03ae }
            r1.mo9113c(r15)     // Catch:{ all -> 0x03ae }
            r1.mo9113c(r14)     // Catch:{ all -> 0x03ae }
            java.lang.Object r0 = r1.f9904f     // Catch:{ all -> 0x03ae }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x03ae }
            r1.f9906h = r0     // Catch:{ all -> 0x03ae }
            goto L_0x01cf
        L_0x0206:
            r10 = 0
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r1.f9900b = r6     // Catch:{ all -> 0x03ae }
            r1.mo9113c(r15)     // Catch:{ all -> 0x03ae }
            r1.mo9113c(r14)     // Catch:{ all -> 0x03ae }
            java.lang.Object r0 = r1.f9904f     // Catch:{ all -> 0x03ae }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x03ae }
            com.facetec.sdk.C3555s.f11479e = r0     // Catch:{ all -> 0x03ae }
            goto L_0x0384
        L_0x021b:
            r16 = 0
        L_0x021d:
            r0 = r8
            goto L_0x0132
        L_0x0220:
            r10 = 0
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r1.f9900b = r15     // Catch:{ all -> 0x03ae }
            r1.mo9113c(r15)     // Catch:{ all -> 0x03ae }
            r1.mo9113c(r14)     // Catch:{ all -> 0x03ae }
            java.lang.Object r0 = r1.f9904f     // Catch:{ all -> 0x03ae }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x03ae }
            r1.mo9113c(r13)     // Catch:{ all -> 0x03ae }
            int r7 = r1.f9902d     // Catch:{ all -> 0x03ae }
            if (r7 == 0) goto L_0x023a
            r11 = r6
            goto L_0x023c
        L_0x023a:
            r11 = r16
        L_0x023c:
            m11355b(r0, r11)     // Catch:{ all -> 0x03ae }
            goto L_0x0384
        L_0x0241:
            r10 = 0
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            com.facetec.sdk.bg$a r0 = f9210k     // Catch:{ all -> 0x03ae }
            r1.f9906h = r0     // Catch:{ all -> 0x03ae }
            goto L_0x01cf
        L_0x024b:
            r10 = 0
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            com.facetec.sdk.bg$a r0 = com.facetec.sdk.C2840bg.C2842a.VALIDATED     // Catch:{ all -> 0x03ae }
            r1.f9906h = r0     // Catch:{ all -> 0x03ae }
            goto L_0x01cf
        L_0x0256:
            r10 = 0
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r0 = 9
            r1.mo9113c(r0)     // Catch:{ all -> 0x03ae }
            int r0 = r1.f9902d     // Catch:{ all -> 0x03ae }
            if (r0 != 0) goto L_0x04bd
            r0 = 18
            goto L_0x0132
        L_0x0268:
            r10 = 0
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r0 = 19
            goto L_0x0132
        L_0x0271:
            r16 = 0
            r0 = r9
            goto L_0x0132
        L_0x0276:
            r10 = 0
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r1.f9900b = r14     // Catch:{ all -> 0x03ae }
            r1.mo9113c(r15)     // Catch:{ all -> 0x03ae }
            r1.mo9113c(r14)     // Catch:{ all -> 0x03ae }
            java.lang.Object r0 = r1.f9904f     // Catch:{ all -> 0x03ae }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x03ae }
            r1.mo9113c(r14)     // Catch:{ all -> 0x03ae }
            java.lang.Object r7 = r1.f9904f     // Catch:{ all -> 0x03ae }
            com.facetec.sdk.FaceTecSDK$InitializeCallback r7 = (com.facetec.sdk.FaceTecSDK.InitializeCallback) r7     // Catch:{ all -> 0x03ae }
            r1.mo9113c(r13)     // Catch:{ all -> 0x03ae }
            int r8 = r1.f9902d     // Catch:{ all -> 0x03ae }
            if (r8 == 0) goto L_0x0297
            r11 = r6
            goto L_0x0299
        L_0x0297:
            r11 = r16
        L_0x0299:
            m11353b((android.content.Context) r0, (com.facetec.sdk.FaceTecSDK.InitializeCallback) r7, (boolean) r11)     // Catch:{ all -> 0x03ae }
            goto L_0x0384
        L_0x029e:
            return
        L_0x029f:
            r10 = 0
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r1.f9900b = r6     // Catch:{ all -> 0x03ae }
            r1.mo9113c(r15)     // Catch:{ all -> 0x03ae }
            r1.mo9113c(r14)     // Catch:{ all -> 0x03ae }
            java.lang.Object r0 = r1.f9904f     // Catch:{ all -> 0x03ae }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x03ae }
            f9201b = r0     // Catch:{ all -> 0x03ae }
            goto L_0x0384
        L_0x02b4:
            r10 = 0
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r1.f9900b = r6     // Catch:{ all -> 0x03ae }
            r1.mo9113c(r15)     // Catch:{ all -> 0x03ae }
            r1.mo9113c(r13)     // Catch:{ all -> 0x03ae }
            int r0 = r1.f9902d     // Catch:{ all -> 0x03ae }
            if (r0 == 0) goto L_0x02c7
            r11 = r6
            goto L_0x02c9
        L_0x02c7:
            r11 = r16
        L_0x02c9:
            f9214o = r11     // Catch:{ all -> 0x03ae }
            goto L_0x0384
        L_0x02cd:
            r10 = 0
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r1.f9900b = r6     // Catch:{ all -> 0x03ae }
            r1.mo9113c(r15)     // Catch:{ all -> 0x03ae }
            r1.mo9113c(r14)     // Catch:{ all -> 0x03ae }
            java.lang.Object r0 = r1.f9904f     // Catch:{ all -> 0x03ae }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x03ae }
            boolean r0 = m11375f(r0)     // Catch:{ all -> 0x03ae }
            r1.f9900b = r0     // Catch:{ all -> 0x03ae }
            r7 = 4
            goto L_0x0381
        L_0x02e7:
            r10 = 0
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r1.mo9113c(r11)     // Catch:{ all -> 0x03ae }
            int r0 = r1.f9902d     // Catch:{ all -> 0x03ae }
            if (r0 != 0) goto L_0x04bd
            r0 = 31
            goto L_0x0132
        L_0x02f7:
            r10 = 0
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r0 = 32
            goto L_0x0132
        L_0x0300:
            r16 = 0
            r0 = r7
            goto L_0x0132
        L_0x0305:
            r10 = 0
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r1.f9900b = r14     // Catch:{ all -> 0x03ae }
            r1.mo9113c(r15)     // Catch:{ all -> 0x03ae }
            r1.mo9113c(r14)     // Catch:{ all -> 0x03ae }
            java.lang.Object r0 = r1.f9904f     // Catch:{ all -> 0x03ae }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x03ae }
            r1.mo9113c(r14)     // Catch:{ all -> 0x03ae }
            java.lang.Object r7 = r1.f9904f     // Catch:{ all -> 0x03ae }
            android.content.Context r7 = (android.content.Context) r7     // Catch:{ all -> 0x03ae }
            r1.mo9113c(r14)     // Catch:{ all -> 0x03ae }
            java.lang.Object r8 = r1.f9904f     // Catch:{ all -> 0x03ae }
            com.facetec.sdk.FaceTecSDK$InitializeCallback r8 = (com.facetec.sdk.FaceTecSDK.InitializeCallback) r8     // Catch:{ all -> 0x03ae }
            com.facetec.sdk.e6 r9 = new com.facetec.sdk.e6     // Catch:{ all -> 0x03ae }
            r9.<init>(r0, r7, r8)     // Catch:{ all -> 0x03ae }
            r1.f9906h = r9     // Catch:{ all -> 0x03ae }
            goto L_0x01cf
        L_0x032d:
            r10 = 0
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r1.f9900b = r6     // Catch:{ all -> 0x03ae }
            r1.mo9113c(r15)     // Catch:{ all -> 0x03ae }
            r1.mo9113c(r14)     // Catch:{ all -> 0x03ae }
            java.lang.Object r0 = r1.f9904f     // Catch:{ all -> 0x03ae }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x03ae }
            com.facetec.sdk.cv r0 = com.facetec.sdk.C2920cv.m12195c(r0)     // Catch:{ all -> 0x03ae }
            r1.f9906h = r0     // Catch:{ all -> 0x03ae }
            goto L_0x01cf
        L_0x0346:
            r10 = 0
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r0 = 42
            goto L_0x0132
        L_0x034f:
            r10 = 0
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r1.f9900b = r6     // Catch:{ all -> 0x03ae }
            r1.mo9113c(r15)     // Catch:{ all -> 0x03ae }
            r1.mo9113c(r14)     // Catch:{ all -> 0x03ae }
            java.lang.Object r0 = r1.f9904f     // Catch:{ all -> 0x03ae }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x03ae }
            com.facetec.sdk.f6 r7 = new com.facetec.sdk.f6     // Catch:{ all -> 0x03ae }
            r7.<init>(r0)     // Catch:{ all -> 0x03ae }
            r1.f9906h = r7     // Catch:{ all -> 0x03ae }
            goto L_0x01cf
        L_0x0369:
            r16 = 0
            r0 = r5
            goto L_0x0132
        L_0x036e:
            r10 = 0
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r0 = 61
            goto L_0x0132
        L_0x0377:
            r10 = 0
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            int r0 = f9215p     // Catch:{ all -> 0x03ae }
            r1.f9900b = r0     // Catch:{ all -> 0x03ae }
            r7 = 4
        L_0x0381:
            r1.mo9113c(r7)     // Catch:{ all -> 0x0388 }
        L_0x0384:
            r9 = r10
            r14 = 4
            goto L_0x04bd
        L_0x0388:
            r0 = move-exception
            r14 = r7
            goto L_0x0454
        L_0x038c:
            r10 = 0
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r1.f9900b = r6     // Catch:{ all -> 0x03ae }
            r1.mo9113c(r15)     // Catch:{ all -> 0x03ae }
            r1.mo9113c(r13)     // Catch:{ all -> 0x03ae }
            int r0 = r1.f9902d     // Catch:{ all -> 0x03ae }
            f9216r = r0     // Catch:{ all -> 0x03ae }
            goto L_0x0384
        L_0x039e:
            r10 = 0
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r1.mo9113c(r9)     // Catch:{ all -> 0x03ae }
            int r0 = r1.f9902d     // Catch:{ all -> 0x03ae }
            if (r0 != 0) goto L_0x04bd
            r0 = 59
            goto L_0x0132
        L_0x03ae:
            r0 = move-exception
            r9 = r10
            r14 = 4
            goto L_0x04c7
        L_0x03b3:
            r10 = 0
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r0 = 60
            goto L_0x0132
        L_0x03bc:
            r16 = 0
            r0 = r13
            goto L_0x0132
        L_0x03c1:
            r10 = 0
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            int r0 = f9216r     // Catch:{ all -> 0x03d1 }
            r1.f9900b = r0     // Catch:{ all -> 0x03d1 }
            r14 = 4
            r1.mo9113c(r14)     // Catch:{ all -> 0x0453 }
        L_0x03ce:
            r9 = r10
            goto L_0x04bd
        L_0x03d1:
            r0 = move-exception
            r14 = 4
            goto L_0x0454
        L_0x03d5:
            r10 = 0
            r14 = 4
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r1.f9900b = r6     // Catch:{ all -> 0x0453 }
            r1.mo9113c(r15)     // Catch:{ all -> 0x0453 }
            r1.mo9113c(r13)     // Catch:{ all -> 0x0453 }
            int r0 = r1.f9902d     // Catch:{ all -> 0x0453 }
            f9215p = r0     // Catch:{ all -> 0x0453 }
            goto L_0x03ce
        L_0x03e8:
            r10 = 0
            r14 = 4
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r1.mo9113c(r11)     // Catch:{ all -> 0x0453 }
            int r0 = r1.f9902d     // Catch:{ all -> 0x0453 }
            if (r0 != 0) goto L_0x04bd
            r0 = 71
            goto L_0x0132
        L_0x03f9:
            r10 = 0
            r14 = 4
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r0 = 103(0x67, float:1.44E-43)
            goto L_0x0132
        L_0x0403:
            r10 = 0
            r14 = 4
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r0 = 101(0x65, float:1.42E-43)
            goto L_0x0132
        L_0x040d:
            r10 = 0
            r14 = 4
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r0 = 28
            r1.mo9113c(r0)     // Catch:{ all -> 0x0453 }
            java.lang.Object r0 = r1.f9904f     // Catch:{ all -> 0x0453 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0453 }
            throw r0     // Catch:{ all -> 0x0453 }
        L_0x041d:
            r10 = 0
            r14 = 4
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r1.mo9113c(r11)     // Catch:{ all -> 0x0453 }
            int r0 = r1.f9902d     // Catch:{ all -> 0x0453 }
            if (r0 != 0) goto L_0x04bd
            r0 = 80
            goto L_0x0132
        L_0x042e:
            r10 = 0
            r14 = 4
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r0 = 108(0x6c, float:1.51E-43)
            goto L_0x0132
        L_0x0438:
            r10 = 0
            r14 = 4
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r0 = 106(0x6a, float:1.49E-43)
            goto L_0x0132
        L_0x0442:
            r10 = 0
            r14 = 4
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r1.mo9113c(r9)     // Catch:{ all -> 0x0453 }
            int r0 = r1.f9902d     // Catch:{ all -> 0x0453 }
            if (r0 != 0) goto L_0x04bd
            r0 = 89
            goto L_0x0132
        L_0x0453:
            r0 = move-exception
        L_0x0454:
            r9 = r10
            goto L_0x04c7
        L_0x0457:
            r10 = 0
            r14 = 4
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r0 = 91
            goto L_0x0132
        L_0x0461:
            r10 = 0
            r14 = 4
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r0 = 50
            goto L_0x0132
        L_0x046b:
            r9 = 0
            r14 = 4
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r1.mo9113c(r12)     // Catch:{ all -> 0x04b1 }
            int r0 = r1.f9902d     // Catch:{ all -> 0x04b1 }
            r2 = 64
            if (r0 == r2) goto L_0x021d
        L_0x047a:
            r0 = r10
            goto L_0x0132
        L_0x047d:
            r16 = 0
            r0 = r4
            goto L_0x0132
        L_0x0482:
            r9 = 0
            r14 = 4
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r1.mo9113c(r12)     // Catch:{ all -> 0x04b1 }
            int r0 = r1.f9902d     // Catch:{ all -> 0x04b1 }
            r2 = 73
            if (r0 == r12) goto L_0x04bd
            r4 = 49
            if (r0 == r4) goto L_0x0496
            goto L_0x04bd
        L_0x0496:
            r0 = r6
            goto L_0x0132
        L_0x0499:
            r9 = 0
            r14 = 4
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r0 = 100
            goto L_0x0132
        L_0x04a3:
            r9 = 0
            r14 = 4
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r1.mo9113c(r12)     // Catch:{ all -> 0x04b1 }
            int r0 = r1.f9902d     // Catch:{ all -> 0x04b1 }
            if (r0 == r7) goto L_0x021d
            goto L_0x047a
        L_0x04b1:
            r0 = move-exception
            goto L_0x04c7
        L_0x04b3:
            r9 = 0
            r14 = 4
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
            r0 = 105(0x69, float:1.47E-43)
            goto L_0x0132
        L_0x04bd:
            r0 = r2
            goto L_0x0132
        L_0x04c0:
            r0 = move-exception
            r9 = 0
            r14 = 4
        L_0x04c3:
            r16 = 0
            r17 = 696(0x2b8, float:9.75E-43)
        L_0x04c7:
            r7 = 76
            if (r2 < r7) goto L_0x04d0
            if (r2 > r5) goto L_0x04d0
            r2 = 72
            goto L_0x04d8
        L_0x04d0:
            r5 = 92
            if (r2 < r5) goto L_0x04e0
            if (r2 > r4) goto L_0x04e0
            r2 = 90
        L_0x04d8:
            r1.f9906h = r0
            r0 = 41
            r1.mo9113c(r0)
            goto L_0x04bd
        L_0x04e0:
            throw r0
        L_0x04e1:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x04e9
            throw r1
        L_0x04e9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2840bg.m11367d(android.content.Context, java.lang.String, java.lang.String, com.facetec.sdk.FaceTecSDK$InitializeCallback):void");
    }

    /* renamed from: e */
    static boolean m11373e() {
        return false;
    }

    /* renamed from: f */
    private static synchronized boolean m11375f(Context context) {
        boolean booleanValue;
        synchronized (C2840bg.class) {
            if (f9213n == null) {
                f9213n = Boolean.valueOf(m11374f() && m11386m(context) && !m11387n(context));
            }
            booleanValue = f9213n.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: g */
    static void m11377g() {
        byte[] bArr = new byte[1394];
        System.arraycopy("cgê\u0003ú\u0000\u0004ù\u0000\u0005ø\u0000\u0006÷\u0000\u0007ö\u0000\bõ\tõ\u0007ýù\u000bó\u0000\tô\u0000\nó\u0004\u0002÷\u0000\u000bò\u0000\u0003þû\u0000\u0003ÿú\tõ\u0007ýù\u0004\u0000ù\u0000\tô\u0000\u0003\u0000ù\u0007ÿ÷\u0000\u0003\u0001ø\u0007\u0000ö\u0000\u0003\u0002÷\u000bó\u0000\u0003\u0003ö\tõ\u0000\u0003\u0004õ\u0000\u0003\u0005ô\u0000\u0003\u0006ó\u0000\u0003\u0007ò\u0007\u0001õ\u0004ÿú\u0007\u0000ö\u0000\u0004ýû\u0000\u0004þú\u0004\u0003ö\u0000\u0004ÿù\tõ\u0007ýù\u0004\u0000ù\u0000\tô\u0000\u0004ÿù\tõ\u0000\u0004\u0000ø\u0000\u0004þú\u0004\u0003ö\u0000\u0003\u0000ù\u0004\u0005ô\u0004\u0006ó\u0000\u0004\u0001÷\u0004\u0007ò\u0000\u0003\u0000ù\u0000\u0004\u0002ö\u0007\u0002ô\u0005\u0003õ\u0007\u0003ó\u0005\u0004ô\u0000\u0004\u0003õ\u0005ÿù\u0000\u0004\u0004ô\u0000\u0004\u0005ó\u0000\u0004\u0006ò\u0000\u0004\u0006ò\u0000\u0005üû\u0007\u0004ò\u0005\u0003õ\u0007\u0003ó\u0005\u0004ô\u0000\u0005ýú\u0005ÿù\u0000\u0005þù\u0000\u0005ÿø\u0000\u0005\u0000÷\u0000\u0005\u0000÷\u0000\u0005\u0001ö\u000bó\u0000\u0005\u0002õ\u0004\u0000ù\u0000\u0005\u0002õ\u0000\u0005\u0003ô\u000bó\u0000\u0005\u0004ó\u0004\u0000ù\u0000\u0005\u0004ê\n\bïé\u0016\u0004\u0005á\n\n\bï\u0003ú\u0000\u0004ù\u0000\u0005ø\u0000\u0006÷\u0000\u0007ö\u0000\bõ\u0000\tô\u0000\nó\u0000\u000bò\u0000\u0003þû\u0000\u0003ÿú\tõ\u000bó\u0000\u0003\u0000ù\u0000\u0003\u0001ø\u0000\u0003\u0002÷\u0000\u0003\u0003ö\u0000\u0003\u0004õ\u0000\u0003\u0005ô\tõ\u0004þû\u0000\u0003\u0006ó\u0000\u0003\u0007ò\u0004ÿú\u0000\u0004ýû\u0004\u0000ù\u0000\u0004þú\tõ\u0000\u0004ÿù\u0000\u0004\u0000ø\u0000\u0004\u0001÷\u0000\u0004\u0002ö\u0004\u0001ø\u0004\u0002÷\u0000\u0004\u0003õ\u0000\u0004\u0004ô\u0004\u0003ö\u0000\u0004\u0005ó\tõ\u0004\u0004õ\u0000\u0003\u0006ó\u0000\u0004\u0005ó\tõ\u0000\u0004\u0006ò\u0000\u0004\u0004ô\u0004\u0003ö\u0000\u0005üû\u0004\u0005ô\u0004\u0006ó\u0000\u0005ýú\u0004\u0007ò\u0000\u0003\u0007ò\u0000\u0005þù\u0005ýû\u0005þú\u0000\u0005ÿø\u0005ÿù\u0000\u0005\u0000÷\u0000\u0005\u0001ö\u0000\u0005\u0002õ\u0000\u0005\u0002õ\u0000\u0005\u0003ô\u0005\u0001÷\u0005\u0002ö\u0005\u0003õ\u0005þú\u0000\u0005\u0004ó\u0004\u0005ô\u0005\u0004ô\u0000\u0005\u0005ò\u0000\u0006ûû\u0000\u0006üú\u0000\u0006ýù\u0000\u0004ù\u0000\u0005ø\u0000\u0006÷\u0005\u0006ò\u0004\u0003ö\u0000\u0006þø\u0000\u0006ÿ÷\u0000\u0006\u0000ö\u0000\u0005þù\u0006üû\u0006ýú\u0005\u0004ô\u0000\u0005ÿø\u0005ÿù\u0000\u0006\u0001õ\u0000\u0006\u0002ô\u0000\u0006\u0003ó\u0000\u0006ýù\u0004\u0007ò\u0006þù\u0006ÿø\u0000\u0003\u0007ò\u0000\u0006\u0004ò\u0006\u0001ö\u0000\u0007úû\u0006\u0002õ\u0000\u0007úû\u0000\u0007ûú\u0006\u0003ô\u0000\u0007üù\u0006\u0004ó\u0000\u0007üù\u0000\u0007ýø\u0006\u0005ò\u0000\u0007þ÷\u0007ûû\u0000\u0007þö\u0014êÌFþô\u0002Á&ÿóúö\u0014êÌ=ô\føÆ\u001a$\u0005ð\u0001ý\f\u0003ú\tõ\búû\u0000\u0004ù\u0000\u0005ø\u0000\u0006÷\bûú\u0004\u0003ö\u0000\u0007ö\u0004\u0007ò\u0000\bõ\u0000\tô\büù\u0007\u0003ó\u0005\u0004ô\u0000\nó\u0005ÿù\u0000\u000bò\u0000\u0003þû\u0000\u0003ÿú\u0000\u0003ÿú\u0000\u0003\u0000ù\u0007ûû\u0005\u0002ö\býø\u0000\u0003\u0001ø\u0004\u0005ô\u0005\u0004ô\u0000\u0003\u0002÷\u0000\u0003\u0003ö\u0000\u0003\u0004õ\u0000\u0003\u0004ð\u0006\u0013é\u0004\u0005üûü\n\fõ\rüùúÉ@\u0003º\u00132ó\u0002÷¿1î\f\u0000õ\u0005þö\u0014êÌ=ô\føÆ\u0013,ÿüøû\fî\fõ\nýçÿóúú\n\u0006ñö\u0014êÌ=ô\føÆ$ ýö\u0004ø\u0003ú\tõ\u0000\u0004ù\tõ\u0000\u0005ø\tõ\u0000\u0006÷\u0004\u0003ö\u0000\u0007ö\tý÷\u0000\bõ\u0000\tô\u0000\nó\tõ\u0000\u000bò\u0000\u0003þû\u0000\u0003ÿú\u0000\u0003\u0000ù\u0004\u0003ö\u0000\u0003\u0001ø\tÿõ\u0005\u0004ô\u0004\u0003ö\u0000\u0003\u0002÷\u0004\u0007ò\u0000\u0003\u0003ö\bûú\u0004\u0003ö\u0000\u0003\u0004õ\u0000\u0003\u0005ô\t\u0000ô\u0005\u0003õ\u0007\u0003ó\u0005\u0004ô\u0000\u0003\u0006ó\u0005ÿù\u0000\u0003\u0007ò\u0000\u0004ýû\u0000\u0004þú\u0000\u0004þú\u0000\u0004ÿù\büù\u0007\u0003ó\u0005\u0004ô\u0000\u0004\u0000ø\u0004\u0005ô\u0005\u0004ô\u0000\u0004\u0001÷\u0000\u0004\u0002ö\u0000\u0004\u0003õ\t\u0001ó\t\u0002ò\u0000\u0003\u0004õ\u0000\u0004\u0004ô\nøû\u0000\u0004\u0005ó\nùú\u0000\u0004\u0005ó\u0000\u0004\u0006ò\u000bó\u0000\u0005üû\u0004\u0000ù\u0000\u0005ü\u0003ú\tõ\u0000\u0004ù\u0004\u0003ö\tõ\u0000\u0005ø\bþ÷\u0007\u0000ö\u0000\u0006÷\u0000\u0007ö\u0000\bõ\u0000\tô\u0000\nó\u0000\u000bò\u0000\u0003þû\u0000\u0003ÿú\bÿö\b\u0000õ\u0000\u0003\u0000ù\u0000\u0003\u0001ø\b\u0001ô\u0004ÿú\u0000\u0003\u0002÷\tõ\u0004þû\u0000\u0003\u0003ö\u0000\u0003\u0004õ\u0000\u0003\u0005ô\u0000\u0003þû\b\u0002ó\u0000\u0003\u0003ö\u0000\u0003\u0006ó\u0004\u0005ô\u0004\u0005ô\u0005\u0004ô\u0004\u0003ö\u0000\u0003\u0007ò\u0004\u0007ò\u0000\u0003\u0004õ\u0000\u0004ýû\b\u0003ò\tùû\u0005\u0004ô\u0000\u0004þú\u0004\u0005ô\u0005\u0004ô\u0000\u0004ÿù\u0000\u0004\u0000ø\u0000\u0004\u0001÷\u0000\u0004\u0002ö\tõ\u0000\u0004ù\u0004\u0003ö\tõ\u0000\u0005ø\túú\u0004ÿú\u0007\u0000ö\u0000\u0006÷\u0000\u0007ö\tûù\u0000\u0004\u0003õ\u0004\u0003ö\u0000\u0004\u0004ô\u0000\tô\u0000\nó\u0000\u0004\u0005ó\tüø\u0005\u0002ö\u0005\u0003õ\u0005þú\u0000\u0004\u0006ò\u0005ÿù\u0000\u0005üû\u0000\u0005ýú\u0000\u0005þù\u0000\u0004\u0002ö\u0004\u0007ò\tûù\u0000\u0004\u0003õ\u0004\u0003ö\u0000\u0003\u0004õ\u0000\u0005ÿø\u0004\u0000ù\u0000\u0005\u0000÷\u000bó\u0000\u0005\u0000÷\u0000\u0005\u0001ö\u0004\u0000ù\u0000\u0005\u0002õ\u000bó\u0000\u0005\u0002".getBytes("ISO-8859-1"), 0, bArr, 0, 1394);
        f9206g = bArr;
        f9207h = 182;
    }

    /* renamed from: h */
    static void m11378h() {
        f9217s = new char[]{10654, 10582, 10580, 10578, 10573, 10577, 10583, 10676, 10671, 10572, 10669, 10685, 10583, 10567, 10570, 10577, 10580, 10661, 10662, 10576, 10580, 10582, 10725, 10671, 10681, 10684, 10628, 10628, 10683, 10675, 10670, 10679, 10681, 10679, 10682, 10678, 10676};
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m11381i() {
        C2802au.m10951a();
        C2888cg.m11894a();
    }

    static void init$0() {
        $$a = new byte[]{96, 119, -7, -22};
        $$b = 46;
    }

    static void init$1() {
        $$d = new byte[]{31, 117, 101, 85};
        $$e = 105;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static void m11384k(Context context) {
        SharedPreferences.Editor edit = m11376g(context).edit();
        edit.putInt(C2790am.f8902S, m11380i(context) + 1);
        edit.apply();
    }

    /* renamed from: l */
    private static String m11385l(Context context) {
        try {
            return C2844bi.m11416b(C2750a.m10690e(context), "gz9X05zb1cRaOLl8hkyP").substring(0, 16);
        } catch (Exception e) {
            C3330l.m13346d(e);
            return C11651j.f33767h;
        }
    }

    /* renamed from: m */
    private static boolean m11386m(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.camera.front") || Build.MODEL.equals("Lenovo YT3-850F")) {
            return true;
        }
        C2771ae.m10719g();
        return false;
    }

    /* renamed from: n */
    private static boolean m11387n(Context context) {
        if (context.getPackageManager().hasSystemFeature("org.chromium.arc") || context.getPackageManager().hasSystemFeature("org.chromium.arc.device_management")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x01e5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x01e6  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m11388o() {
        /*
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)     // Catch:{ Exception -> 0x023a }
            int r1 = 20121 - r1
            char r1 = (char) r1     // Catch:{ Exception -> 0x023a }
            int r2 = android.view.ViewConfiguration.getTapTimeout()     // Catch:{ Exception -> 0x023a }
            int r2 = r2 >> 16
            int r2 = r2 + 242
            int r3 = android.view.ViewConfiguration.getKeyRepeatTimeout()     // Catch:{ Exception -> 0x023a }
            int r3 = r3 >> 16
            int r3 = r3 + 24
            java.lang.Object r1 = com.facetec.sdk.C2854bp.m11559b(r1, r2, r3)     // Catch:{ Exception -> 0x023a }
            java.lang.Class r1 = (java.lang.Class) r1     // Catch:{ Exception -> 0x023a }
            byte r2 = (byte) r0     // Catch:{ Exception -> 0x023a }
            byte r3 = (byte) r2     // Catch:{ Exception -> 0x023a }
            int r4 = r3 + 1
            byte r4 = (byte) r4     // Catch:{ Exception -> 0x023a }
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x023a }
            m11398v(r2, r3, r4, r6)     // Catch:{ Exception -> 0x023a }
            r6 = r6[r0]     // Catch:{ Exception -> 0x023a }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x023a }
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch:{ Exception -> 0x023a }
            r6 = 0
            long r7 = r1.getLong(r6)     // Catch:{ Exception -> 0x023a }
            r9 = -1
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r9 = 12
            r10 = 15
            java.lang.String r12 = "\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000"
            r13 = 34
            java.lang.String r14 = "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000"
            java.lang.String r15 = ""
            r16 = 3
            r11 = 4
            r18 = 22
            r6 = 2
            if (r1 == 0) goto L_0x00c9
            r19 = 1930(0x78a, double:9.535E-321)
            long r7 = r7 + r19
            int[] r1 = new int[r11]     // Catch:{ Exception -> 0x023a }
            r1[r0] = r0     // Catch:{ Exception -> 0x023a }
            r1[r5] = r18     // Catch:{ Exception -> 0x023a }
            r1[r6] = r13     // Catch:{ Exception -> 0x023a }
            r1[r16] = r18     // Catch:{ Exception -> 0x023a }
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x023a }
            m11400w(r14, r1, r0, r13)     // Catch:{ Exception -> 0x023a }
            r1 = r13[r0]     // Catch:{ Exception -> 0x023a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x023a }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x023a }
            int[] r13 = new int[r11]     // Catch:{ Exception -> 0x023a }
            r13[r0] = r18     // Catch:{ Exception -> 0x023a }
            r13[r5] = r10     // Catch:{ Exception -> 0x023a }
            r13[r6] = r0     // Catch:{ Exception -> 0x023a }
            r13[r16] = r9     // Catch:{ Exception -> 0x023a }
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x023a }
            m11400w(r12, r13, r5, r9)     // Catch:{ Exception -> 0x023a }
            r9 = r9[r0]     // Catch:{ Exception -> 0x023a }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x023a }
            java.lang.Class[] r13 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x023a }
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r9, r13)     // Catch:{ Exception -> 0x023a }
            java.lang.Object[] r9 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x023a }
            r13 = 0
            java.lang.Object r1 = r1.invoke(r13, r9)     // Catch:{ Exception -> 0x023a }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x023a }
            long r21 = r1.longValue()     // Catch:{ Exception -> 0x023a }
            int r1 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r1 < 0) goto L_0x00c9
            int r1 = android.view.KeyEvent.getMaxKeyCode()
            int r1 = r1 >> 16
            int r1 = r1 + 20121
            char r1 = (char) r1
            int r4 = android.view.ViewConfiguration.getFadingEdgeLength()
            int r4 = r4 >> 16
            int r4 = 242 - r4
            int r7 = android.text.TextUtils.indexOf(r15, r15)
            int r7 = 24 - r7
            java.lang.Object r1 = com.facetec.sdk.C2854bp.m11559b(r1, r4, r7)
            java.lang.Class r1 = (java.lang.Class) r1
            int r4 = r3 + 2
            byte r4 = (byte) r4
            java.lang.Object[] r7 = new java.lang.Object[r5]
            m11398v(r2, r3, r4, r7)
            r2 = r7[r0]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.reflect.Field r1 = r1.getField(r2)
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            goto L_0x01d7
        L_0x00c9:
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ all -> 0x0231 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0231 }
            r1[r5] = r7     // Catch:{ all -> 0x0231 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0231 }
            r1[r0] = r7     // Catch:{ all -> 0x0231 }
            java.util.Map<java.lang.Integer, java.lang.Object> r7 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x0231 }
            r8 = 140061824(0x8592c80, float:6.535337E-34)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0231 }
            java.lang.Object r9 = r7.get(r9)     // Catch:{ all -> 0x0231 }
            if (r9 == 0) goto L_0x00e7
            goto L_0x0125
        L_0x00e7:
            int r9 = android.view.ViewConfiguration.getScrollBarFadeDuration()     // Catch:{ all -> 0x0231 }
            int r9 = r9 >> 16
            int r9 = 20121 - r9
            char r9 = (char) r9     // Catch:{ all -> 0x0231 }
            int r13 = android.graphics.Color.green(r0)     // Catch:{ all -> 0x0231 }
            int r13 = r13 + 242
            int r21 = android.os.Process.getThreadPriority(r0)     // Catch:{ all -> 0x0231 }
            int r21 = r21 + 20
            r17 = 6
            int r21 = r21 >> 6
            int r10 = 24 - r21
            java.lang.Object r9 = com.facetec.sdk.C2854bp.m11559b(r9, r13, r10)     // Catch:{ all -> 0x0231 }
            java.lang.Class r9 = (java.lang.Class) r9     // Catch:{ all -> 0x0231 }
            byte r10 = (byte) r3     // Catch:{ all -> 0x0231 }
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ all -> 0x0231 }
            m11398v(r2, r3, r10, r13)     // Catch:{ all -> 0x0231 }
            r10 = r13[r0]     // Catch:{ all -> 0x0231 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0231 }
            java.lang.Class[] r13 = new java.lang.Class[r6]     // Catch:{ all -> 0x0231 }
            java.lang.Class r21 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0231 }
            r13[r0] = r21     // Catch:{ all -> 0x0231 }
            r13[r5] = r21     // Catch:{ all -> 0x0231 }
            java.lang.reflect.Method r9 = r9.getMethod(r10, r13)     // Catch:{ all -> 0x0231 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0231 }
            r7.put(r8, r9)     // Catch:{ all -> 0x0231 }
        L_0x0125:
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9     // Catch:{ all -> 0x0231 }
            r7 = 0
            java.lang.Object r1 = r9.invoke(r7, r1)     // Catch:{ all -> 0x0231 }
            java.lang.Object[] r1 = (java.lang.Object[]) r1     // Catch:{ all -> 0x0231 }
            long r7 = android.os.SystemClock.uptimeMillis()
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            int r7 = 20122 - r7
            char r7 = (char) r7
            int r8 = android.text.TextUtils.indexOf(r15, r15, r0, r0)
            int r8 = r8 + 242
            int r9 = android.view.ViewConfiguration.getLongPressTimeout()
            int r9 = r9 >> 16
            int r9 = r9 + 24
            java.lang.Object r7 = com.facetec.sdk.C2854bp.m11559b(r7, r8, r9)
            java.lang.Class r7 = (java.lang.Class) r7
            int r8 = r3 + 2
            byte r8 = (byte) r8
            java.lang.Object[] r9 = new java.lang.Object[r5]
            m11398v(r2, r3, r8, r9)
            r8 = r9[r0]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r7 = r7.getField(r8)
            r8 = 0
            r7.set(r8, r1)
            int[] r7 = new int[r11]     // Catch:{ Exception -> 0x022b }
            r7[r0] = r0     // Catch:{ Exception -> 0x022b }
            r7[r5] = r18     // Catch:{ Exception -> 0x022b }
            r8 = 34
            r7[r6] = r8     // Catch:{ Exception -> 0x022b }
            r7[r16] = r18     // Catch:{ Exception -> 0x022b }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x022b }
            m11400w(r14, r7, r0, r8)     // Catch:{ Exception -> 0x022b }
            r7 = r8[r0]     // Catch:{ Exception -> 0x022b }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x022b }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ Exception -> 0x022b }
            int[] r8 = new int[r11]     // Catch:{ Exception -> 0x022b }
            r8[r0] = r18     // Catch:{ Exception -> 0x022b }
            r9 = 15
            r8[r5] = r9     // Catch:{ Exception -> 0x022b }
            r8[r6] = r0     // Catch:{ Exception -> 0x022b }
            r9 = 12
            r8[r16] = r9     // Catch:{ Exception -> 0x022b }
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x022b }
            m11400w(r12, r8, r5, r9)     // Catch:{ Exception -> 0x022b }
            r8 = r9[r0]     // Catch:{ Exception -> 0x022b }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x022b }
            java.lang.Class[] r9 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x022b }
            java.lang.reflect.Method r7 = r7.getDeclaredMethod(r8, r9)     // Catch:{ Exception -> 0x022b }
            java.lang.Object[] r8 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x022b }
            r9 = 0
            java.lang.Object r7 = r7.invoke(r9, r8)     // Catch:{ Exception -> 0x022b }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ Exception -> 0x022b }
            long r7 = r7.longValue()     // Catch:{ Exception -> 0x022b }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            int r8 = android.view.ViewConfiguration.getJumpTapTimeout()
            int r8 = r8 >> 16
            int r8 = 20121 - r8
            char r8 = (char) r8
            float r9 = android.media.AudioTrack.getMinVolume()
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            int r9 = 242 - r9
            int r10 = android.view.Gravity.getAbsoluteGravity(r0, r0)
            int r10 = r10 + 24
            java.lang.Object r8 = com.facetec.sdk.C2854bp.m11559b(r8, r9, r10)
            java.lang.Class r8 = (java.lang.Class) r8
            java.lang.Object[] r9 = new java.lang.Object[r5]
            m11398v(r2, r3, r4, r9)
            r2 = r9[r0]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.reflect.Field r2 = r8.getField(r2)
            r3 = 0
            r2.set(r3, r7)
        L_0x01d7:
            r2 = r1[r5]
            int[] r2 = (int[]) r2
            r2 = r2[r0]
            r3 = r1[r0]
            int[] r3 = (int[]) r3
            r0 = r3[r0]
            if (r0 != r2) goto L_0x01e6
            return
        L_0x01e6:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = r1[r6]
            java.lang.String r3 = (java.lang.String) r3
            r2.add(r3)
            r3 = r1[r16]
            java.lang.String r3 = (java.lang.String) r3
            r2.add(r3)
            r3 = r1[r11]
            java.lang.String r3 = (java.lang.String) r3
            r2.add(r3)
            r3 = 5
            r3 = r1[r3]
            java.lang.String r3 = (java.lang.String) r3
            r2.add(r3)
            r3 = 6
            r3 = r1[r3]
            java.lang.String r3 = (java.lang.String) r3
            r2.add(r3)
            r3 = 7
            r3 = r1[r3]
            java.lang.String r3 = (java.lang.String) r3
            r2.add(r3)
            r3 = 8
            r1 = r1[r3]
            java.lang.String r1 = (java.lang.String) r1
            r2.add(r1)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r0)
            throw r1
        L_0x022b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L_0x0231:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0239
            throw r1
        L_0x0239:
            throw r0
        L_0x023a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2840bg.m11388o():void");
    }

    /* renamed from: a */
    static void m11348a() {
        C2920cv.m12196e(new C2760a6());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m11352b(Context context, FaceTecSDK.InitializeCallback initializeCallback, C2802au.C2805a aVar) {
        boolean z;
        if (aVar == null) {
            f9210k = C2842a.NETWORK_ERROR;
        } else if (!aVar.f9019d) {
            f9210k = C2842a.REJECTED;
        } else if (!aVar.f9020e) {
            f9210k = C2842a.VALIDATED;
            z = true;
            m11353b(context, initializeCallback, z);
        } else {
            f9210k = C2842a.VERSION_DEPRECATED;
        }
        z = false;
        m11353b(context, initializeCallback, z);
    }

    /* JADX WARNING: type inference failed for: r9v11 */
    /* JADX WARNING: type inference failed for: r9v21 */
    /* JADX WARNING: type inference failed for: r9v27 */
    /* JADX WARNING: type inference failed for: r9v28 */
    /* JADX WARNING: type inference failed for: r9v32 */
    /* JADX WARNING: type inference failed for: r9v33 */
    /* JADX WARNING: type inference failed for: r9v34 */
    /* JADX WARNING: type inference failed for: r9v35 */
    /* JADX WARNING: type inference failed for: r9v36 */
    /* JADX WARNING: type inference failed for: r9v41 */
    /* JADX WARNING: type inference failed for: r9v56 */
    /* JADX WARNING: type inference failed for: r9v58 */
    /* JADX WARNING: type inference failed for: r9v59 */
    /* JADX WARNING: type inference failed for: r9v60 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x030c, code lost:
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        r3.mo9113c(r7);
        r9 = r9;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x030f, code lost:
        r10 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0388, code lost:
        r10 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x038b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03b2, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03b3, code lost:
        r10 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0172, code lost:
        r3.mo9113c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0274, code lost:
        r3.mo9113c(1);
        r9 = r9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x040a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0413 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x041f A[ADDED_TO_REGION, SYNTHETIC] */
    @com.guardsquare.dexguard.annotation.VirtualizeCode
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11361c(android.content.Context r18, java.lang.String r19, java.lang.String r20, com.facetec.sdk.FaceTecSDK.InitializeCallback r21) {
        /*
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r2 = ""
            com.facetec.sdk.dh r3 = new com.facetec.sdk.dh
            r0 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r3.<init>(r0, r4, r5, r6)
            r0 = 1087(0x43f, float:1.523E-42)
            short r0 = (short) r0
            r4 = 73
            byte r4 = (byte) r4
            int r5 = r4 + 4
            short r5 = (short) r5
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            m11397u(r0, r4, r5, r7)
            r4 = 0
            r0 = r7[r4]
            java.lang.String r0 = (java.lang.String) r0
            r5 = 685(0x2ad, float:9.6E-43)
            short r5 = (short) r5
            r7 = 74
            byte r7 = (byte) r7
            r8 = r7 | 305(0x131, float:4.27E-43)
            short r8 = (short) r8
            java.lang.Object[] r9 = new java.lang.Object[r6]
            m11397u(r5, r7, r8, r9)
            r7 = r9[r4]
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x0420 }
            r8[r4] = r7     // Catch:{ all -> 0x0420 }
            r7 = 865(0x361, float:1.212E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x0420 }
            byte[] r9 = f9206g     // Catch:{ all -> 0x0420 }
            r10 = 696(0x2b8, float:9.75E-43)
            byte r11 = r9[r10]     // Catch:{ all -> 0x0420 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0420 }
            r12 = r11 | 352(0x160, float:4.93E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0420 }
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x0420 }
            m11397u(r7, r11, r12, r13)     // Catch:{ all -> 0x0420 }
            r11 = r13[r4]     // Catch:{ all -> 0x0420 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0420 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0420 }
            r12 = 809(0x329, float:1.134E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0420 }
            r13 = 4
            byte r14 = r9[r13]     // Catch:{ all -> 0x0420 }
            byte r14 = (byte) r14     // Catch:{ all -> 0x0420 }
            r15 = r14 | 372(0x174, float:5.21E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0420 }
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x0420 }
            m11397u(r12, r14, r15, r13)     // Catch:{ all -> 0x0420 }
            r12 = r13[r4]     // Catch:{ all -> 0x0420 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0420 }
            java.lang.Class[] r13 = new java.lang.Class[r6]     // Catch:{ all -> 0x0420 }
            byte r9 = r9[r10]     // Catch:{ all -> 0x0420 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x0420 }
            r14 = r9 | 352(0x160, float:4.93E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0420 }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x0420 }
            m11397u(r7, r9, r14, r15)     // Catch:{ all -> 0x0420 }
            r9 = r15[r4]     // Catch:{ all -> 0x0420 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0420 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0420 }
            r13[r4] = r9     // Catch:{ all -> 0x0420 }
            java.lang.reflect.Method r9 = r11.getMethod(r12, r13)     // Catch:{ all -> 0x0420 }
            java.lang.Object r0 = r9.invoke(r0, r8)     // Catch:{ all -> 0x0420 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0420 }
            int r8 = r0.length
            int[] r8 = new int[r8]
            r9 = r4
        L_0x008d:
            int r11 = r0.length
            r12 = 363(0x16b, float:5.09E-43)
            if (r9 >= r11) goto L_0x013d
            r11 = r0[r9]
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0134 }
            r14[r4] = r11     // Catch:{ all -> 0x0134 }
            byte[] r11 = f9206g     // Catch:{ all -> 0x0134 }
            byte r15 = r11[r10]     // Catch:{ all -> 0x0134 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0134 }
            short r12 = (short) r12     // Catch:{ all -> 0x0134 }
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x0134 }
            m11397u(r5, r15, r12, r13)     // Catch:{ all -> 0x0134 }
            r13 = r13[r4]     // Catch:{ all -> 0x0134 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0134 }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x0134 }
            r15 = 280(0x118, float:3.92E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0134 }
            r16 = 6
            byte r10 = r11[r16]     // Catch:{ all -> 0x0134 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0134 }
            r4 = r10 | 373(0x175, float:5.23E-43)
            short r4 = (short) r4     // Catch:{ all -> 0x0134 }
            r16 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x0134 }
            m11397u(r15, r10, r4, r0)     // Catch:{ all -> 0x0134 }
            r4 = 0
            r0 = r0[r4]     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0134 }
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch:{ all -> 0x0134 }
            r10 = 696(0x2b8, float:9.75E-43)
            byte r15 = r11[r10]     // Catch:{ all -> 0x0134 }
            byte r10 = (byte) r15     // Catch:{ all -> 0x0134 }
            r15 = r10 | 352(0x160, float:4.93E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0134 }
            r17 = r1
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ all -> 0x0134 }
            m11397u(r7, r10, r15, r1)     // Catch:{ all -> 0x0134 }
            r10 = 0
            r1 = r1[r10]     // Catch:{ all -> 0x0134 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0134 }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0134 }
            r4[r10] = r1     // Catch:{ all -> 0x0134 }
            java.lang.reflect.Method r0 = r13.getMethod(r0, r4)     // Catch:{ all -> 0x0134 }
            r1 = 0
            java.lang.Object r0 = r0.invoke(r1, r14)     // Catch:{ all -> 0x0134 }
            r1 = 696(0x2b8, float:9.75E-43)
            byte r4 = r11[r1]     // Catch:{ all -> 0x012b }
            byte r1 = (byte) r4     // Catch:{ all -> 0x012b }
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ all -> 0x012b }
            m11397u(r5, r1, r12, r4)     // Catch:{ all -> 0x012b }
            r1 = 0
            r4 = r4[r1]     // Catch:{ all -> 0x012b }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x012b }
            java.lang.Class r1 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x012b }
            r4 = 286(0x11e, float:4.01E-43)
            short r4 = (short) r4     // Catch:{ all -> 0x012b }
            r10 = 820(0x334, float:1.149E-42)
            byte r10 = r11[r10]     // Catch:{ all -> 0x012b }
            byte r10 = (byte) r10     // Catch:{ all -> 0x012b }
            r11 = 372(0x174, float:5.21E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x012b }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x012b }
            m11397u(r4, r10, r11, r12)     // Catch:{ all -> 0x012b }
            r4 = 0
            r10 = r12[r4]     // Catch:{ all -> 0x012b }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x012b }
            r4 = 0
            java.lang.reflect.Method r1 = r1.getMethod(r10, r4)     // Catch:{ all -> 0x012b }
            java.lang.Object r0 = r1.invoke(r0, r4)     // Catch:{ all -> 0x012b }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x012b }
            int r0 = r0.intValue()     // Catch:{ all -> 0x012b }
            r8[r9] = r0
            int r9 = r9 + 1
            r0 = r16
            r1 = r17
            r4 = 0
            r10 = 696(0x2b8, float:9.75E-43)
            goto L_0x008d
        L_0x012b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0133
            throw r1
        L_0x0133:
            throw r0
        L_0x0134:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x013c
            throw r1
        L_0x013c:
            throw r0
        L_0x013d:
            r17 = r1
            r0 = 0
        L_0x0140:
            int r1 = r0 + 1
            r4 = 82
            r5 = 66
            r0 = r8[r0]     // Catch:{ all -> 0x0400 }
            int r0 = r3.mo9113c(r0)     // Catch:{ all -> 0x0400 }
            r7 = 9
            r9 = 34
            r10 = 7
            r11 = 2
            r13 = 3
            switch(r0) {
                case -36: goto L_0x03f4;
                case -35: goto L_0x03dd;
                case -34: goto L_0x03da;
                case -33: goto L_0x03c7;
                case -32: goto L_0x03be;
                case -31: goto L_0x03b5;
                case -30: goto L_0x03a0;
                case -29: goto L_0x038e;
                case -28: goto L_0x037c;
                case -27: goto L_0x0368;
                case -26: goto L_0x0352;
                case -25: goto L_0x0344;
                case -24: goto L_0x033c;
                case -23: goto L_0x0334;
                case -22: goto L_0x0324;
                case -21: goto L_0x0313;
                case -20: goto L_0x0303;
                case -19: goto L_0x02fb;
                case -18: goto L_0x02f8;
                case -17: goto L_0x02ee;
                case -16: goto L_0x02ed;
                case -15: goto L_0x02c8;
                case -14: goto L_0x02a3;
                case -13: goto L_0x0288;
                case -12: goto L_0x023b;
                case -11: goto L_0x0232;
                case -10: goto L_0x0222;
                case -9: goto L_0x021c;
                case -8: goto L_0x0218;
                case -7: goto L_0x0214;
                case -6: goto L_0x0209;
                case -5: goto L_0x0203;
                case -4: goto L_0x0189;
                case -3: goto L_0x0176;
                case -2: goto L_0x0160;
                case -1: goto L_0x015d;
                default: goto L_0x0156;
            }     // Catch:{ all -> 0x0400 }
        L_0x0156:
            r7 = 4
            r10 = 0
            r14 = 696(0x2b8, float:9.75E-43)
            r15 = 0
            goto L_0x03fd
        L_0x015d:
            r0 = 32
            goto L_0x0140
        L_0x0160:
            r3.f9900b = r6     // Catch:{ all -> 0x0400 }
            r3.mo9113c(r11)     // Catch:{ all -> 0x0400 }
            r3.mo9113c(r13)     // Catch:{ all -> 0x0400 }
            java.lang.Object r0 = r3.f9904f     // Catch:{ all -> 0x0400 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x0400 }
            java.lang.String r0 = m11351b((android.content.Context) r0)     // Catch:{ all -> 0x0400 }
            r3.f9906h = r0     // Catch:{ all -> 0x0400 }
        L_0x0172:
            r3.mo9113c(r6)     // Catch:{ all -> 0x0400 }
            goto L_0x0156
        L_0x0176:
            r3.f9900b = r6     // Catch:{ all -> 0x0400 }
            r3.mo9113c(r11)     // Catch:{ all -> 0x0400 }
            r3.mo9113c(r13)     // Catch:{ all -> 0x0400 }
            java.lang.Object r0 = r3.f9904f     // Catch:{ all -> 0x0400 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x0400 }
            java.lang.String r0 = m11382j(r0)     // Catch:{ all -> 0x0400 }
            r3.f9906h = r0     // Catch:{ all -> 0x0400 }
            goto L_0x0172
        L_0x0189:
            r3.f9900b = r13     // Catch:{ all -> 0x0400 }
            r3.mo9113c(r11)     // Catch:{ all -> 0x0400 }
            r3.mo9113c(r13)     // Catch:{ all -> 0x0400 }
            java.lang.Object r0 = r3.f9904f     // Catch:{ all -> 0x0400 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x0400 }
            r3.mo9113c(r13)     // Catch:{ all -> 0x0400 }
            java.lang.Object r7 = r3.f9904f     // Catch:{ all -> 0x0400 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0400 }
            r3.mo9113c(r13)     // Catch:{ all -> 0x0400 }
            java.lang.Object r9 = r3.f9904f     // Catch:{ all -> 0x0400 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0400 }
            java.lang.Object[] r10 = new java.lang.Object[r13]     // Catch:{ all -> 0x01fa }
            r10[r11] = r9     // Catch:{ all -> 0x01fa }
            r10[r6] = r7     // Catch:{ all -> 0x01fa }
            r7 = 0
            r10[r7] = r0     // Catch:{ all -> 0x01fa }
            java.util.Map<java.lang.Integer, java.lang.Object> r0 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x01fa }
            r7 = 124947904(0x7728dc0, float:1.8247713E-34)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x01fa }
            java.lang.Object r9 = r0.get(r9)     // Catch:{ all -> 0x01fa }
            if (r9 == 0) goto L_0x01bc
            goto L_0x01ef
        L_0x01bc:
            int r9 = android.view.MotionEvent.axisFromString(r2)     // Catch:{ all -> 0x01fa }
            int r9 = r9 + r6
            char r9 = (char) r9     // Catch:{ all -> 0x01fa }
            int r14 = android.view.ViewConfiguration.getMinimumFlingVelocity()     // Catch:{ all -> 0x01fa }
            int r14 = r14 >> 16
            int r14 = r14 + 52
            int r15 = android.view.KeyEvent.keyCodeFromString(r2)     // Catch:{ all -> 0x01fa }
            int r15 = r15 + 24
            java.lang.Object r9 = com.facetec.sdk.C2854bp.m11559b(r9, r14, r15)     // Catch:{ all -> 0x01fa }
            java.lang.Class r9 = (java.lang.Class) r9     // Catch:{ all -> 0x01fa }
            java.lang.String r14 = "c"
            java.lang.Class[] r13 = new java.lang.Class[r13]     // Catch:{ all -> 0x01fa }
            java.lang.Class<android.content.Context> r15 = android.content.Context.class
            r16 = 0
            r13[r16] = r15     // Catch:{ all -> 0x01fa }
            r13[r6] = r17     // Catch:{ all -> 0x01fa }
            r13[r11] = r17     // Catch:{ all -> 0x01fa }
            java.lang.reflect.Method r9 = r9.getDeclaredMethod(r14, r13)     // Catch:{ all -> 0x01fa }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x01fa }
            r0.put(r7, r9)     // Catch:{ all -> 0x01fa }
        L_0x01ef:
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9     // Catch:{ all -> 0x01fa }
            r7 = 0
            java.lang.Object r0 = r9.invoke(r7, r10)     // Catch:{ all -> 0x01fa }
            r3.f9906h = r0     // Catch:{ all -> 0x0400 }
            goto L_0x0172
        L_0x01fa:
            r0 = move-exception
            java.lang.Throwable r7 = r0.getCause()     // Catch:{ all -> 0x0400 }
            if (r7 == 0) goto L_0x0202
            throw r7     // Catch:{ all -> 0x0400 }
        L_0x0202:
            throw r0     // Catch:{ all -> 0x0400 }
        L_0x0203:
            com.facetec.sdk.bn$12727$d r0 = com.facetec.sdk.bn$12727$d.VALIDATED     // Catch:{ all -> 0x0400 }
            r3.f9906h = r0     // Catch:{ all -> 0x0400 }
            goto L_0x0172
        L_0x0209:
            r3.mo9113c(r7)     // Catch:{ all -> 0x0400 }
            int r0 = r3.f9902d     // Catch:{ all -> 0x0400 }
            if (r0 != 0) goto L_0x03fd
            r0 = 12
            goto L_0x0140
        L_0x0214:
            r0 = 13
            goto L_0x0140
        L_0x0218:
            r0 = 27
            goto L_0x0140
        L_0x021c:
            com.facetec.sdk.bg$a r0 = com.facetec.sdk.C2840bg.C2842a.VALIDATED     // Catch:{ all -> 0x0400 }
            r3.f9906h = r0     // Catch:{ all -> 0x0400 }
            goto L_0x0172
        L_0x0222:
            r3.f9900b = r6     // Catch:{ all -> 0x0400 }
            r3.mo9113c(r11)     // Catch:{ all -> 0x0400 }
            r3.mo9113c(r13)     // Catch:{ all -> 0x0400 }
            java.lang.Object r0 = r3.f9904f     // Catch:{ all -> 0x0400 }
            com.facetec.sdk.bg$a r0 = (com.facetec.sdk.C2840bg.C2842a) r0     // Catch:{ all -> 0x0400 }
            f9210k = r0     // Catch:{ all -> 0x0400 }
            goto L_0x0156
        L_0x0232:
            com.facetec.sdk.a$e r0 = new com.facetec.sdk.a$e     // Catch:{ all -> 0x0400 }
            r0.<init>()     // Catch:{ all -> 0x0400 }
            r3.f9906h = r0     // Catch:{ all -> 0x0400 }
            goto L_0x0172
        L_0x023b:
            r0 = 836(0x344, float:1.171E-42)
            short r0 = (short) r0
            byte[] r7 = f9206g     // Catch:{ all -> 0x0280 }
            r14 = 696(0x2b8, float:9.75E-43)
            byte r7 = r7[r14]     // Catch:{ all -> 0x027e }
            byte r7 = (byte) r7     // Catch:{ all -> 0x027e }
            short r9 = (short) r12     // Catch:{ all -> 0x027e }
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ all -> 0x027e }
            m11397u(r0, r7, r9, r10)     // Catch:{ all -> 0x027e }
            r7 = 0
            r0 = r10[r7]     // Catch:{ all -> 0x027b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x027e }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x027e }
            r7 = 861(0x35d, float:1.207E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x027e }
            int r9 = f9207h     // Catch:{ all -> 0x027e }
            r9 = r9 & 120(0x78, float:1.68E-43)
            byte r9 = (byte) r9     // Catch:{ all -> 0x027e }
            r10 = r9 | 327(0x147, float:4.58E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x027e }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x027e }
            m11397u(r7, r9, r10, r11)     // Catch:{ all -> 0x027e }
            r15 = 0
            r7 = r11[r15]     // Catch:{ all -> 0x0279 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0279 }
            java.lang.reflect.Field r0 = r0.getField(r7)     // Catch:{ all -> 0x0279 }
            r9 = 0
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x0377 }
            r3.f9906h = r0     // Catch:{ all -> 0x0377 }
        L_0x0274:
            r3.mo9113c(r6)     // Catch:{ all -> 0x0377 }
            goto L_0x030f
        L_0x0279:
            r0 = move-exception
            goto L_0x0284
        L_0x027b:
            r0 = move-exception
            r15 = r7
            goto L_0x0284
        L_0x027e:
            r0 = move-exception
            goto L_0x0283
        L_0x0280:
            r0 = move-exception
            r14 = 696(0x2b8, float:9.75E-43)
        L_0x0283:
            r15 = 0
        L_0x0284:
            r7 = 4
            r10 = 0
            goto L_0x0406
        L_0x0288:
            r9 = 0
            r14 = 696(0x2b8, float:9.75E-43)
            r15 = 0
            r3.f9900b = r11     // Catch:{ all -> 0x0377 }
            r3.mo9113c(r11)     // Catch:{ all -> 0x0377 }
            r3.mo9113c(r13)     // Catch:{ all -> 0x0377 }
            java.lang.Object r0 = r3.f9904f     // Catch:{ all -> 0x0377 }
            com.facetec.sdk.a$e r0 = (com.facetec.sdk.C2750a.C2752e) r0     // Catch:{ all -> 0x0377 }
            r3.mo9113c(r13)     // Catch:{ all -> 0x0377 }
            java.lang.Object r7 = r3.f9904f     // Catch:{ all -> 0x0377 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0377 }
            r0.f8718d = r7     // Catch:{ all -> 0x0377 }
            goto L_0x030f
        L_0x02a3:
            r9 = 0
            r14 = 696(0x2b8, float:9.75E-43)
            r15 = 0
            r3.f9900b = r13     // Catch:{ all -> 0x0377 }
            r3.mo9113c(r11)     // Catch:{ all -> 0x0377 }
            r3.mo9113c(r13)     // Catch:{ all -> 0x0377 }
            java.lang.Object r0 = r3.f9904f     // Catch:{ all -> 0x0377 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x0377 }
            r3.mo9113c(r10)     // Catch:{ all -> 0x0377 }
            int r7 = r3.f9902d     // Catch:{ all -> 0x0377 }
            if (r7 == 0) goto L_0x02bc
            r7 = r6
            goto L_0x02bd
        L_0x02bc:
            r7 = r15
        L_0x02bd:
            r3.mo9113c(r13)     // Catch:{ all -> 0x0377 }
            java.lang.Object r10 = r3.f9904f     // Catch:{ all -> 0x0377 }
            com.facetec.sdk.a$e r10 = (com.facetec.sdk.C2750a.C2752e) r10     // Catch:{ all -> 0x0377 }
            com.facetec.sdk.C2750a.m10682b(r0, r7, r10)     // Catch:{ all -> 0x0377 }
            goto L_0x030f
        L_0x02c8:
            r9 = 0
            r14 = 696(0x2b8, float:9.75E-43)
            r15 = 0
            r3.f9900b = r13     // Catch:{ all -> 0x0377 }
            r3.mo9113c(r11)     // Catch:{ all -> 0x0377 }
            r3.mo9113c(r13)     // Catch:{ all -> 0x0377 }
            java.lang.Object r0 = r3.f9904f     // Catch:{ all -> 0x0377 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x0377 }
            r3.mo9113c(r13)     // Catch:{ all -> 0x0377 }
            java.lang.Object r7 = r3.f9904f     // Catch:{ all -> 0x0377 }
            com.facetec.sdk.FaceTecSDK$InitializeCallback r7 = (com.facetec.sdk.FaceTecSDK.InitializeCallback) r7     // Catch:{ all -> 0x0377 }
            r3.mo9113c(r10)     // Catch:{ all -> 0x0377 }
            int r10 = r3.f9902d     // Catch:{ all -> 0x0377 }
            if (r10 == 0) goto L_0x02e8
            r10 = r6
            goto L_0x02e9
        L_0x02e8:
            r10 = r15
        L_0x02e9:
            m11353b((android.content.Context) r0, (com.facetec.sdk.FaceTecSDK.InitializeCallback) r7, (boolean) r10)     // Catch:{ all -> 0x0377 }
            goto L_0x030f
        L_0x02ed:
            return
        L_0x02ee:
            r9 = 0
            r14 = 696(0x2b8, float:9.75E-43)
            r15 = 0
            com.facetec.sdk.bg$a r0 = com.facetec.sdk.C2840bg.C2842a.REJECTED     // Catch:{ all -> 0x0377 }
            r3.f9906h = r0     // Catch:{ all -> 0x0377 }
            goto L_0x0274
        L_0x02f8:
            r0 = r5
            goto L_0x0140
        L_0x02fb:
            r9 = 0
            r14 = 696(0x2b8, float:9.75E-43)
            r15 = 0
            r0 = 39
            goto L_0x0140
        L_0x0303:
            r9 = 0
            r14 = 696(0x2b8, float:9.75E-43)
            r15 = 0
            int r0 = f9216r     // Catch:{ all -> 0x0377 }
            r3.f9900b = r0     // Catch:{ all -> 0x0377 }
            r7 = 4
        L_0x030c:
            r3.mo9113c(r7)     // Catch:{ all -> 0x03b2 }
        L_0x030f:
            r10 = r9
            r7 = 4
            goto L_0x03fd
        L_0x0313:
            r9 = 0
            r14 = 696(0x2b8, float:9.75E-43)
            r15 = 0
            r3.f9900b = r6     // Catch:{ all -> 0x0377 }
            r3.mo9113c(r11)     // Catch:{ all -> 0x0377 }
            r3.mo9113c(r10)     // Catch:{ all -> 0x0377 }
            int r0 = r3.f9902d     // Catch:{ all -> 0x0377 }
            f9215p = r0     // Catch:{ all -> 0x0377 }
            goto L_0x030f
        L_0x0324:
            r9 = 0
            r14 = 696(0x2b8, float:9.75E-43)
            r15 = 0
            r0 = 5
            r3.mo9113c(r0)     // Catch:{ all -> 0x0377 }
            int r0 = r3.f9902d     // Catch:{ all -> 0x0377 }
            if (r0 != 0) goto L_0x03fd
            r0 = 48
            goto L_0x0140
        L_0x0334:
            r9 = 0
            r14 = 696(0x2b8, float:9.75E-43)
            r15 = 0
            r0 = 85
            goto L_0x0140
        L_0x033c:
            r9 = 0
            r14 = 696(0x2b8, float:9.75E-43)
            r15 = 0
            r0 = 83
            goto L_0x0140
        L_0x0344:
            r9 = 0
            r14 = 696(0x2b8, float:9.75E-43)
            r15 = 0
            r0 = 28
            r3.mo9113c(r0)     // Catch:{ all -> 0x0377 }
            java.lang.Object r0 = r3.f9904f     // Catch:{ all -> 0x0377 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0377 }
            throw r0     // Catch:{ all -> 0x0377 }
        L_0x0352:
            r9 = 0
            r14 = 696(0x2b8, float:9.75E-43)
            r15 = 0
            r3.f9900b = r6     // Catch:{ all -> 0x0377 }
            r3.mo9113c(r11)     // Catch:{ all -> 0x0377 }
            r3.mo9113c(r13)     // Catch:{ all -> 0x0377 }
            java.lang.Object r0 = r3.f9904f     // Catch:{ all -> 0x0377 }
            int r0 = r0.hashCode()     // Catch:{ all -> 0x0377 }
            r3.f9900b = r0     // Catch:{ all -> 0x0377 }
            r7 = 4
            goto L_0x030c
        L_0x0368:
            r9 = 0
            r14 = 696(0x2b8, float:9.75E-43)
            r15 = 0
            r3.mo9113c(r7)     // Catch:{ all -> 0x0377 }
            int r0 = r3.f9902d     // Catch:{ all -> 0x0377 }
            if (r0 != 0) goto L_0x03fd
            r0 = 65
            goto L_0x0140
        L_0x0377:
            r0 = move-exception
            r10 = r9
            r7 = 4
            goto L_0x0406
        L_0x037c:
            r9 = 0
            r14 = 696(0x2b8, float:9.75E-43)
            r15 = 0
            int r0 = f9215p     // Catch:{ all -> 0x038b }
            r3.f9900b = r0     // Catch:{ all -> 0x038b }
            r7 = 4
            r3.mo9113c(r7)     // Catch:{ all -> 0x03b2 }
        L_0x0388:
            r10 = r9
            goto L_0x03fd
        L_0x038b:
            r0 = move-exception
            r7 = 4
            goto L_0x03b3
        L_0x038e:
            r7 = 4
            r9 = 0
            r14 = 696(0x2b8, float:9.75E-43)
            r15 = 0
            r3.f9900b = r6     // Catch:{ all -> 0x03b2 }
            r3.mo9113c(r11)     // Catch:{ all -> 0x03b2 }
            r3.mo9113c(r10)     // Catch:{ all -> 0x03b2 }
            int r0 = r3.f9902d     // Catch:{ all -> 0x03b2 }
            f9216r = r0     // Catch:{ all -> 0x03b2 }
            goto L_0x0388
        L_0x03a0:
            r7 = 4
            r9 = 0
            r14 = 696(0x2b8, float:9.75E-43)
            r15 = 0
            r0 = 23
            r3.mo9113c(r0)     // Catch:{ all -> 0x03b2 }
            int r0 = r3.f9902d     // Catch:{ all -> 0x03b2 }
            if (r0 != 0) goto L_0x03fd
            r0 = 75
            goto L_0x0140
        L_0x03b2:
            r0 = move-exception
        L_0x03b3:
            r10 = r9
            goto L_0x0406
        L_0x03b5:
            r7 = 4
            r9 = 0
            r14 = 696(0x2b8, float:9.75E-43)
            r15 = 0
            r0 = 90
            goto L_0x0140
        L_0x03be:
            r7 = 4
            r9 = 0
            r14 = 696(0x2b8, float:9.75E-43)
            r15 = 0
            r0 = 88
            goto L_0x0140
        L_0x03c7:
            r7 = 4
            r10 = 0
            r14 = 696(0x2b8, float:9.75E-43)
            r15 = 0
            r3.mo9113c(r9)     // Catch:{ all -> 0x03f2 }
            int r0 = r3.f9902d     // Catch:{ all -> 0x03f2 }
            if (r0 == 0) goto L_0x03d7
            r0 = 50
            goto L_0x0140
        L_0x03d7:
            r0 = r6
            goto L_0x0140
        L_0x03da:
            r0 = r4
            goto L_0x0140
        L_0x03dd:
            r7 = 4
            r10 = 0
            r14 = 696(0x2b8, float:9.75E-43)
            r15 = 0
            r3.mo9113c(r9)     // Catch:{ all -> 0x03f2 }
            int r0 = r3.f9902d     // Catch:{ all -> 0x03f2 }
            r1 = 37
            if (r0 == 0) goto L_0x03fd
            if (r0 == r6) goto L_0x03ee
            goto L_0x03fd
        L_0x03ee:
            r0 = 77
            goto L_0x0140
        L_0x03f2:
            r0 = move-exception
            goto L_0x0406
        L_0x03f4:
            r7 = 4
            r10 = 0
            r14 = 696(0x2b8, float:9.75E-43)
            r15 = 0
            r0 = 87
            goto L_0x0140
        L_0x03fd:
            r0 = r1
            goto L_0x0140
        L_0x0400:
            r0 = move-exception
            r7 = 4
            r10 = 0
            r14 = 696(0x2b8, float:9.75E-43)
            r15 = 0
        L_0x0406:
            r9 = 60
            if (r1 < r9) goto L_0x040f
            if (r1 > r5) goto L_0x040f
            r1 = 49
            goto L_0x0417
        L_0x040f:
            r5 = 78
            if (r1 < r5) goto L_0x041f
            if (r1 > r4) goto L_0x041f
            r1 = 76
        L_0x0417:
            r3.f9906h = r0
            r0 = 41
            r3.mo9113c(r0)
            goto L_0x03fd
        L_0x041f:
            throw r0
        L_0x0420:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0428
            throw r1
        L_0x0428:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2840bg.m11361c(android.content.Context, java.lang.String, java.lang.String, com.facetec.sdk.FaceTecSDK$InitializeCallback):void");
    }

    /* renamed from: d */
    static boolean m11368d() {
        return !f9214o;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m11371e(String str, Context context, FaceTecSDK.InitializeCallback initializeCallback) {
        if (!m11365c(str)) {
            m11353b(context, initializeCallback, false);
            return;
        }
        m11379h(context);
        m11359c(context, initializeCallback);
    }

    /* renamed from: g */
    static SharedPreferences m11376g(Context context) {
        if (f9211l == null) {
            if (f9218t || Looper.myLooper() != Looper.getMainLooper()) {
                f9211l = context.getSharedPreferences("zoom.sdk.settings", 0);
            } else {
                throw new AssertionError();
            }
        }
        return f9211l;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0201, code lost:
        r0.f9906h = r1;
        r0.mo9113c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0214, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0248, code lost:
        r0.f9900b = r1;
        r0.mo9113c(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02b1, code lost:
        r1 = r2;
     */
    @com.guardsquare.dexguard.annotation.VirtualizeCode
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11379h(android.content.Context r17) {
        /*
            com.facetec.sdk.dh r0 = new com.facetec.sdk.dh
            r1 = r17
            r0.<init>(r1)
            r1 = 880(0x370, float:1.233E-42)
            short r1 = (short) r1
            r2 = 73
            byte r2 = (byte) r2
            r3 = 172(0xac, float:2.41E-43)
            short r3 = (short) r3
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            m11397u(r1, r2, r3, r5)
            r1 = 0
            r2 = r5[r1]
            java.lang.String r2 = (java.lang.String) r2
            r3 = 685(0x2ad, float:9.6E-43)
            short r3 = (short) r3
            r5 = 74
            byte r5 = (byte) r5
            r6 = r5 | 305(0x131, float:4.27E-43)
            short r6 = (short) r6
            java.lang.Object[] r7 = new java.lang.Object[r4]
            m11397u(r3, r5, r6, r7)
            r5 = r7[r1]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x02b4 }
            r6[r1] = r5     // Catch:{ all -> 0x02b4 }
            r5 = 865(0x361, float:1.212E-42)
            short r5 = (short) r5     // Catch:{ all -> 0x02b4 }
            byte[] r7 = f9206g     // Catch:{ all -> 0x02b4 }
            r8 = 696(0x2b8, float:9.75E-43)
            byte r9 = r7[r8]     // Catch:{ all -> 0x02b4 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x02b4 }
            r10 = r9 | 352(0x160, float:4.93E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x02b4 }
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ all -> 0x02b4 }
            m11397u(r5, r9, r10, r11)     // Catch:{ all -> 0x02b4 }
            r9 = r11[r1]     // Catch:{ all -> 0x02b4 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x02b4 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x02b4 }
            r10 = 809(0x329, float:1.134E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x02b4 }
            r11 = 4
            byte r12 = r7[r11]     // Catch:{ all -> 0x02b4 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x02b4 }
            r13 = r12 | 372(0x174, float:5.21E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x02b4 }
            java.lang.Object[] r14 = new java.lang.Object[r4]     // Catch:{ all -> 0x02b4 }
            m11397u(r10, r12, r13, r14)     // Catch:{ all -> 0x02b4 }
            r10 = r14[r1]     // Catch:{ all -> 0x02b4 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x02b4 }
            java.lang.Class[] r12 = new java.lang.Class[r4]     // Catch:{ all -> 0x02b4 }
            byte r7 = r7[r8]     // Catch:{ all -> 0x02b4 }
            byte r7 = (byte) r7     // Catch:{ all -> 0x02b4 }
            r13 = r7 | 352(0x160, float:4.93E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x02b4 }
            java.lang.Object[] r14 = new java.lang.Object[r4]     // Catch:{ all -> 0x02b4 }
            m11397u(r5, r7, r13, r14)     // Catch:{ all -> 0x02b4 }
            r7 = r14[r1]     // Catch:{ all -> 0x02b4 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x02b4 }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x02b4 }
            r12[r1] = r7     // Catch:{ all -> 0x02b4 }
            java.lang.reflect.Method r7 = r9.getMethod(r10, r12)     // Catch:{ all -> 0x02b4 }
            java.lang.Object r2 = r7.invoke(r2, r6)     // Catch:{ all -> 0x02b4 }
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ all -> 0x02b4 }
            int r6 = r2.length
            int[] r6 = new int[r6]
            r7 = r1
        L_0x0083:
            int r9 = r2.length
            if (r7 >= r9) goto L_0x0129
            r9 = r2[r7]
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ all -> 0x0120 }
            r12[r1] = r9     // Catch:{ all -> 0x0120 }
            byte[] r9 = f9206g     // Catch:{ all -> 0x0120 }
            byte r13 = r9[r8]     // Catch:{ all -> 0x0120 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x0120 }
            r14 = 363(0x16b, float:5.09E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0120 }
            java.lang.Object[] r15 = new java.lang.Object[r4]     // Catch:{ all -> 0x0120 }
            m11397u(r3, r13, r14, r15)     // Catch:{ all -> 0x0120 }
            r13 = r15[r1]     // Catch:{ all -> 0x0120 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0120 }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x0120 }
            r15 = 280(0x118, float:3.92E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0120 }
            r16 = 6
            byte r11 = r9[r16]     // Catch:{ all -> 0x0120 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0120 }
            r10 = r11 | 373(0x175, float:5.23E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x0120 }
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x0120 }
            m11397u(r15, r11, r10, r8)     // Catch:{ all -> 0x0120 }
            r8 = r8[r1]     // Catch:{ all -> 0x0120 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0120 }
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ all -> 0x0120 }
            r11 = 696(0x2b8, float:9.75E-43)
            byte r15 = r9[r11]     // Catch:{ all -> 0x0120 }
            byte r11 = (byte) r15     // Catch:{ all -> 0x0120 }
            r15 = r11 | 352(0x160, float:4.93E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0120 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x0120 }
            m11397u(r5, r11, r15, r1)     // Catch:{ all -> 0x0120 }
            r11 = 0
            r1 = r1[r11]     // Catch:{ all -> 0x0120 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0120 }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0120 }
            r10[r11] = r1     // Catch:{ all -> 0x0120 }
            java.lang.reflect.Method r1 = r13.getMethod(r8, r10)     // Catch:{ all -> 0x0120 }
            r8 = 0
            java.lang.Object r1 = r1.invoke(r8, r12)     // Catch:{ all -> 0x0120 }
            r8 = 696(0x2b8, float:9.75E-43)
            byte r10 = r9[r8]     // Catch:{ all -> 0x0117 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0117 }
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ all -> 0x0117 }
            m11397u(r3, r10, r14, r11)     // Catch:{ all -> 0x0117 }
            r10 = 0
            r11 = r11[r10]     // Catch:{ all -> 0x0117 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0117 }
            java.lang.Class r10 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0117 }
            r11 = 286(0x11e, float:4.01E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x0117 }
            r12 = 820(0x334, float:1.149E-42)
            byte r9 = r9[r12]     // Catch:{ all -> 0x0117 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x0117 }
            r12 = 372(0x174, float:5.21E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0117 }
            java.lang.Object[] r13 = new java.lang.Object[r4]     // Catch:{ all -> 0x0117 }
            m11397u(r11, r9, r12, r13)     // Catch:{ all -> 0x0117 }
            r9 = 0
            r11 = r13[r9]     // Catch:{ all -> 0x0117 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0117 }
            r9 = 0
            java.lang.reflect.Method r10 = r10.getMethod(r11, r9)     // Catch:{ all -> 0x0117 }
            java.lang.Object r1 = r10.invoke(r1, r9)     // Catch:{ all -> 0x0117 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0117 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0117 }
            r6[r7] = r1
            int r7 = r7 + 1
            r1 = 0
            r11 = 4
            goto L_0x0083
        L_0x0117:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x011f
            throw r1
        L_0x011f:
            throw r0
        L_0x0120:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0128
            throw r1
        L_0x0128:
            throw r0
        L_0x0129:
            r1 = 0
        L_0x012a:
            int r2 = r1 + 1
            r1 = r6[r1]
            int r1 = r0.mo9113c(r1)
            r3 = 16
            r5 = 7
            r7 = 34
            r8 = 3
            r9 = 2
            switch(r1) {
                case -30: goto L_0x02ac;
                case -29: goto L_0x0297;
                case -28: goto L_0x0291;
                case -27: goto L_0x027a;
                case -26: goto L_0x0274;
                case -25: goto L_0x026e;
                case -24: goto L_0x025f;
                case -23: goto L_0x024f;
                case -22: goto L_0x0244;
                case -21: goto L_0x0241;
                case -20: goto L_0x023b;
                case -19: goto L_0x022d;
                case -18: goto L_0x021c;
                case -17: goto L_0x0217;
                case -16: goto L_0x0214;
                case -15: goto L_0x0213;
                case -14: goto L_0x020d;
                case -13: goto L_0x0207;
                case -12: goto L_0x01ef;
                case -11: goto L_0x01e7;
                case -10: goto L_0x01e1;
                case -9: goto L_0x01cf;
                case -8: goto L_0x01c9;
                case -7: goto L_0x01c3;
                case -6: goto L_0x01b4;
                case -5: goto L_0x017a;
                case -4: goto L_0x0164;
                case -3: goto L_0x0154;
                case -2: goto L_0x0144;
                case -1: goto L_0x0141;
                default: goto L_0x013c;
            }
        L_0x013c:
            r1 = 4
            r10 = 0
            r11 = 0
            goto L_0x02b1
        L_0x0141:
            r1 = 20
            goto L_0x012a
        L_0x0144:
            r0.f9900b = r4
            r0.mo9113c(r9)
            r0.mo9113c(r8)
            java.lang.Object r1 = r0.f9904f
            android.content.Context r1 = (android.content.Context) r1
            com.facetec.sdk.C2863bw.m11676b(r1)
            goto L_0x013c
        L_0x0154:
            r0.f9900b = r4
            r0.mo9113c(r9)
            r0.mo9113c(r8)
            java.lang.Object r1 = r0.f9904f
            android.content.Context r1 = (android.content.Context) r1
            com.facetec.sdk.C2795aq.m10867c(r1)
            goto L_0x013c
        L_0x0164:
            r0.f9900b = r4
            r0.mo9113c(r9)
            r0.mo9113c(r8)
            java.lang.Object r1 = r0.f9904f
            android.content.Context r1 = (android.content.Context) r1
            android.content.SharedPreferences r1 = m11376g(r1)
            r0.f9906h = r1
            r0.mo9113c(r4)
            goto L_0x013c
        L_0x017a:
            r1 = 813(0x32d, float:1.139E-42)
            short r1 = (short) r1
            byte[] r3 = f9206g
            r5 = 290(0x122, float:4.06E-43)
            byte r3 = r3[r5]
            int r3 = r3 - r4
            byte r3 = (byte) r3
            r5 = 356(0x164, float:4.99E-43)
            short r5 = (short) r5
            java.lang.Object[] r7 = new java.lang.Object[r4]
            m11397u(r1, r3, r5, r7)
            r1 = 0
            r3 = r7[r1]
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Class r1 = java.lang.Class.forName(r3)
            r3 = 803(0x323, float:1.125E-42)
            short r3 = (short) r3
            r5 = r3 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r7 = 373(0x175, float:5.23E-43)
            short r7 = (short) r7
            java.lang.Object[] r8 = new java.lang.Object[r4]
            m11397u(r3, r5, r7, r8)
            r10 = 0
            r3 = r8[r10]
            java.lang.String r3 = (java.lang.String) r3
            java.lang.reflect.Field r1 = r1.getField(r3)
            r11 = 0
            int r1 = r1.getInt(r11)
            goto L_0x0248
        L_0x01b4:
            r10 = 0
            r11 = 0
            r1 = 65
            r0.mo9113c(r1)
            int r1 = r0.f9902d
            if (r1 != 0) goto L_0x02b1
            r1 = 12
            goto L_0x012a
        L_0x01c3:
            r10 = 0
            r11 = 0
            r1 = 56
            goto L_0x012a
        L_0x01c9:
            r10 = 0
            r11 = 0
            r1 = 54
            goto L_0x012a
        L_0x01cf:
            r10 = 0
            r11 = 0
            r0.f9900b = r4
            r0.mo9113c(r9)
            r0.mo9113c(r8)
            java.lang.Object r1 = r0.f9904f
            android.content.Context r1 = (android.content.Context) r1
            com.facetec.sdk.C2959dp.m12507c((android.content.Context) r1)
            goto L_0x022a
        L_0x01e1:
            r10 = 0
            r11 = 0
            r1 = 40
            goto L_0x012a
        L_0x01e7:
            r10 = 0
            r11 = 0
            com.facetec.sdk.c6 r1 = new com.facetec.sdk.c6
            r1.<init>()
            goto L_0x0201
        L_0x01ef:
            r10 = 0
            r11 = 0
            r0.f9900b = r4
            r0.mo9113c(r9)
            r0.mo9113c(r8)
            java.lang.Object r1 = r0.f9904f
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            com.facetec.sdk.cv r1 = com.facetec.sdk.C2920cv.m12195c(r1)
        L_0x0201:
            r0.f9906h = r1
            r0.mo9113c(r4)
            goto L_0x022a
        L_0x0207:
            r10 = 0
            r11 = 0
            r1 = 24
            goto L_0x012a
        L_0x020d:
            r10 = 0
            r11 = 0
            r1 = 29
            goto L_0x012a
        L_0x0213:
            return
        L_0x0214:
            r1 = r3
            goto L_0x012a
        L_0x0217:
            r10 = 0
            r11 = 0
            int r1 = f9216r
            goto L_0x0248
        L_0x021c:
            r10 = 0
            r11 = 0
            r0.f9900b = r4
            r0.mo9113c(r9)
            r0.mo9113c(r5)
            int r1 = r0.f9902d
            f9215p = r1
        L_0x022a:
            r1 = 4
            goto L_0x02b1
        L_0x022d:
            r10 = 0
            r11 = 0
            r1 = 5
            r0.mo9113c(r1)
            int r1 = r0.f9902d
            if (r1 != 0) goto L_0x02b1
            r1 = 38
            goto L_0x012a
        L_0x023b:
            r10 = 0
            r11 = 0
            r1 = 39
            goto L_0x012a
        L_0x0241:
            r1 = r4
            goto L_0x012a
        L_0x0244:
            r10 = 0
            r11 = 0
            int r1 = f9215p
        L_0x0248:
            r0.f9900b = r1
            r1 = 4
            r0.mo9113c(r1)
            goto L_0x02b1
        L_0x024f:
            r1 = 4
            r10 = 0
            r11 = 0
            r0.f9900b = r4
            r0.mo9113c(r9)
            r0.mo9113c(r5)
            int r3 = r0.f9902d
            f9216r = r3
            goto L_0x02b1
        L_0x025f:
            r1 = 4
            r10 = 0
            r11 = 0
            r3 = 23
            r0.mo9113c(r3)
            int r3 = r0.f9902d
            if (r3 != 0) goto L_0x02b1
            r2 = 49
            goto L_0x02b1
        L_0x026e:
            r1 = 4
            r10 = 0
            r11 = 0
            r2 = 61
            goto L_0x02b1
        L_0x0274:
            r1 = 4
            r10 = 0
            r11 = 0
            r2 = 59
            goto L_0x02b1
        L_0x027a:
            r1 = 4
            r10 = 0
            r11 = 0
            r0.mo9113c(r7)
            int r2 = r0.f9902d
            r5 = 69
            r7 = 13
            if (r2 == r5) goto L_0x028e
            r5 = 80
            if (r2 == r5) goto L_0x028d
            goto L_0x028e
        L_0x028d:
            r7 = r3
        L_0x028e:
            r1 = r7
            goto L_0x012a
        L_0x0291:
            r1 = 4
            r10 = 0
            r11 = 0
            r2 = 53
            goto L_0x02b1
        L_0x0297:
            r1 = 4
            r10 = 0
            r11 = 0
            r0.mo9113c(r7)
            int r2 = r0.f9902d
            r3 = 50
            if (r2 == 0) goto L_0x0214
            if (r2 == r4) goto L_0x02a7
            goto L_0x0214
        L_0x02a7:
            r2 = 26
            r3 = r2
            goto L_0x0214
        L_0x02ac:
            r1 = 4
            r10 = 0
            r11 = 0
            r2 = 58
        L_0x02b1:
            r1 = r2
            goto L_0x012a
        L_0x02b4:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x02bc
            throw r1
        L_0x02bc:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2840bg.m11379h(android.content.Context):void");
    }

    /* renamed from: j */
    static synchronized String m11382j(Context context) {
        String str;
        synchronized (C2840bg.class) {
            if (f9209j == null && context != null) {
                f9209j = context.getPackageName();
            }
            str = f9209j;
        }
        return str;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ void m11389o(Context context) {
        if (m11375f(context)) {
            C2885cd.m11830d(context);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11397u(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r8 = 380 - r8
            byte[] r0 = f9206g
            int r7 = 118 - r7
            byte[] r1 = new byte[r8]
            int r8 = r8 + -1
            r2 = 0
            if (r0 != 0) goto L_0x0016
            r7 = r6
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L_0x0034
        L_0x0016:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x001a:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r1[r3] = r4
            if (r3 != r8) goto L_0x0029
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L_0x0029:
            byte r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r9
            r9 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L_0x0034:
            int r6 = r6 + r8
            int r6 = r6 + 1
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2840bg.m11397u(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11398v(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = 100 - r8
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r0 = $$a
            int r6 = r6 * 4
            int r6 = 1 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L_0x0016
            r8 = r7
            r4 = r8
            r3 = r2
            r7 = r6
            goto L_0x002c
        L_0x0016:
            r3 = r2
        L_0x0017:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L_0x0026
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L_0x0026:
            byte r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L_0x002c:
            int r4 = -r4
            int r6 = r6 + r4
            int r8 = r8 + 1
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2840bg.m11398v(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11400w(java.lang.String r22, int[] r23, boolean r24, java.lang.Object[] r25) {
        /*
            r0 = r22
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 == 0) goto L_0x000c
            java.lang.String r2 = "ISO-8859-1"
            byte[] r0 = r0.getBytes(r2)
        L_0x000c:
            byte[] r0 = (byte[]) r0
            com.facetec.sdk.gm r2 = new com.facetec.sdk.gm
            r2.<init>()
            r3 = 0
            r4 = r23[r3]
            r5 = 1
            r6 = r23[r5]
            r7 = 2
            r8 = r23[r7]
            r9 = 3
            r10 = r23[r9]
            char[] r11 = f9217s
            if (r11 == 0) goto L_0x00b6
            int r13 = r11.length
            char[] r14 = new char[r13]
            r15 = r3
        L_0x0027:
            if (r15 >= r13) goto L_0x00b2
            char r16 = r11[r15]
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x00a9 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x00a9 }
            r9[r3] = r16     // Catch:{ all -> 0x00a9 }
            java.util.Map<java.lang.Integer, java.lang.Object> r7 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x00a9 }
            r17 = 1019307753(0x3cc166e9, float:0.023608642)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x00a9 }
            java.lang.Object r12 = r7.get(r12)     // Catch:{ all -> 0x00a9 }
            if (r12 == 0) goto L_0x0049
            r21 = r8
            r18 = r11
            r20 = r13
            goto L_0x008c
        L_0x0049:
            int r12 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()     // Catch:{ all -> 0x00a9 }
            int r12 = r12 >> 24
            char r12 = (char) r12     // Catch:{ all -> 0x00a9 }
            long r18 = android.view.ViewConfiguration.getZoomControlsTimeout()     // Catch:{ all -> 0x00a9 }
            r20 = 0
            int r5 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            int r5 = 910 - r5
            int r18 = android.graphics.Color.argb(r3, r3, r3, r3)     // Catch:{ all -> 0x00a9 }
            int r3 = 24 - r18
            java.lang.Object r3 = com.facetec.sdk.C2854bp.m11559b(r12, r5, r3)     // Catch:{ all -> 0x00a9 }
            java.lang.Class r3 = (java.lang.Class) r3     // Catch:{ all -> 0x00a9 }
            r5 = 0
            byte r12 = (byte) r5     // Catch:{ all -> 0x00a9 }
            byte r5 = (byte) r12     // Catch:{ all -> 0x00a9 }
            r18 = r11
            byte r11 = (byte) r5     // Catch:{ all -> 0x00a9 }
            r21 = r8
            r20 = r13
            r13 = 1
            java.lang.Object[] r8 = new java.lang.Object[r13]     // Catch:{ all -> 0x00a9 }
            m11403x(r12, r5, r11, r8)     // Catch:{ all -> 0x00a9 }
            r5 = 0
            r8 = r8[r5]     // Catch:{ all -> 0x00a9 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x00a9 }
            java.lang.Class[] r11 = new java.lang.Class[r13]     // Catch:{ all -> 0x00a9 }
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00a9 }
            r11[r5] = r12     // Catch:{ all -> 0x00a9 }
            java.lang.reflect.Method r12 = r3.getMethod(r8, r11)     // Catch:{ all -> 0x00a9 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x00a9 }
            r7.put(r3, r12)     // Catch:{ all -> 0x00a9 }
        L_0x008c:
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12     // Catch:{ all -> 0x00a9 }
            r3 = 0
            java.lang.Object r5 = r12.invoke(r3, r9)     // Catch:{ all -> 0x00a9 }
            java.lang.Character r5 = (java.lang.Character) r5     // Catch:{ all -> 0x00a9 }
            char r3 = r5.charValue()     // Catch:{ all -> 0x00a9 }
            r14[r15] = r3
            int r15 = r15 + 1
            r11 = r18
            r13 = r20
            r8 = r21
            r3 = 0
            r5 = 1
            r7 = 2
            r9 = 3
            goto L_0x0027
        L_0x00a9:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x00b1
            throw r1
        L_0x00b1:
            throw r0
        L_0x00b2:
            r21 = r8
            r11 = r14
            goto L_0x00ba
        L_0x00b6:
            r21 = r8
            r18 = r11
        L_0x00ba:
            char[] r3 = new char[r6]
            r5 = 0
            java.lang.System.arraycopy(r11, r4, r3, r5, r6)
            if (r0 == 0) goto L_0x0255
            char[] r4 = new char[r6]
            r2.f10463e = r5
            r5 = 0
        L_0x00c7:
            int r7 = r2.f10463e
            if (r7 >= r6) goto L_0x0254
            byte r8 = r0[r7]
            java.lang.String r9 = ""
            r11 = 0
            r12 = 1
            if (r8 != r12) goto L_0x015b
            char r8 = r3[r7]
            r13 = 2
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ all -> 0x0152 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0152 }
            r14[r12] = r5     // Catch:{ all -> 0x0152 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0152 }
            r8 = 0
            r14[r8] = r5     // Catch:{ all -> 0x0152 }
            java.util.Map<java.lang.Integer, java.lang.Object> r5 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x0152 }
            r8 = 1898160495(0x7123a16f, float:8.102595E29)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0152 }
            java.lang.Object r12 = r5.get(r12)     // Catch:{ all -> 0x0152 }
            if (r12 == 0) goto L_0x00f5
            goto L_0x0141
        L_0x00f5:
            r12 = 48
            r13 = 0
            int r12 = android.text.TextUtils.indexOf(r9, r12, r13)     // Catch:{ all -> 0x0152 }
            r15 = 55625(0xd949, float:7.7947E-41)
            int r12 = r12 + r15
            char r12 = (char) r12     // Catch:{ all -> 0x0152 }
            int r9 = android.text.TextUtils.getTrimmedLength(r9)     // Catch:{ all -> 0x0152 }
            int r9 = 290 - r9
            float r15 = android.util.TypedValue.complexToFraction(r13, r11, r11)     // Catch:{ all -> 0x0152 }
            int r11 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            int r11 = r11 + 31
            java.lang.Object r9 = com.facetec.sdk.C2854bp.m11559b(r12, r9, r11)     // Catch:{ all -> 0x0152 }
            java.lang.Class r9 = (java.lang.Class) r9     // Catch:{ all -> 0x0152 }
            int r11 = $$e     // Catch:{ all -> 0x0152 }
            r11 = r11 & 7
            byte r11 = (byte) r11     // Catch:{ all -> 0x0152 }
            int r12 = r11 + -1
            byte r12 = (byte) r12     // Catch:{ all -> 0x0152 }
            byte r13 = (byte) r12     // Catch:{ all -> 0x0152 }
            r15 = 1
            java.lang.Object[] r8 = new java.lang.Object[r15]     // Catch:{ all -> 0x0152 }
            m11403x(r11, r12, r13, r8)     // Catch:{ all -> 0x0152 }
            r11 = 0
            r8 = r8[r11]     // Catch:{ all -> 0x0152 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0152 }
            r12 = 2
            java.lang.Class[] r13 = new java.lang.Class[r12]     // Catch:{ all -> 0x0152 }
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0152 }
            r13[r11] = r12     // Catch:{ all -> 0x0152 }
            r11 = 1
            r13[r11] = r12     // Catch:{ all -> 0x0152 }
            java.lang.reflect.Method r12 = r9.getMethod(r8, r13)     // Catch:{ all -> 0x0152 }
            r8 = 1898160495(0x7123a16f, float:8.102595E29)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0152 }
            r5.put(r8, r12)     // Catch:{ all -> 0x0152 }
        L_0x0141:
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12     // Catch:{ all -> 0x0152 }
            r5 = 0
            java.lang.Object r8 = r12.invoke(r5, r14)     // Catch:{ all -> 0x0152 }
            java.lang.Character r8 = (java.lang.Character) r8     // Catch:{ all -> 0x0152 }
            char r5 = r8.charValue()     // Catch:{ all -> 0x0152 }
            r4[r7] = r5
            goto L_0x01d4
        L_0x0152:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x015a
            throw r1
        L_0x015a:
            throw r0
        L_0x015b:
            char r8 = r3[r7]
            r12 = 2
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ all -> 0x024b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x024b }
            r12 = 1
            r13[r12] = r5     // Catch:{ all -> 0x024b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x024b }
            r8 = 0
            r13[r8] = r5     // Catch:{ all -> 0x024b }
            java.util.Map<java.lang.Integer, java.lang.Object> r5 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x024b }
            r8 = 766175324(0x2daae85c, float:1.942995E-11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x024b }
            java.lang.Object r12 = r5.get(r12)     // Catch:{ all -> 0x024b }
            if (r12 == 0) goto L_0x017e
            goto L_0x01c5
        L_0x017e:
            float r12 = android.media.AudioTrack.getMinVolume()     // Catch:{ all -> 0x024b }
            int r11 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            r12 = 43789(0xab0d, float:6.1361E-41)
            int r11 = r11 + r12
            char r11 = (char) r11     // Catch:{ all -> 0x024b }
            r12 = 0
            int r9 = android.text.TextUtils.getCapsMode(r9, r12, r12)     // Catch:{ all -> 0x024b }
            int r9 = r9 + 481
            int r14 = android.graphics.drawable.Drawable.resolveOpacity(r12, r12)     // Catch:{ all -> 0x024b }
            int r14 = r14 + 32
            java.lang.Object r9 = com.facetec.sdk.C2854bp.m11559b(r11, r9, r14)     // Catch:{ all -> 0x024b }
            java.lang.Class r9 = (java.lang.Class) r9     // Catch:{ all -> 0x024b }
            r11 = 3
            byte r12 = (byte) r11     // Catch:{ all -> 0x024b }
            int r14 = r12 + -3
            byte r14 = (byte) r14     // Catch:{ all -> 0x024b }
            byte r15 = (byte) r14     // Catch:{ all -> 0x024b }
            r11 = 1
            java.lang.Object[] r8 = new java.lang.Object[r11]     // Catch:{ all -> 0x024b }
            m11403x(r12, r14, r15, r8)     // Catch:{ all -> 0x024b }
            r11 = 0
            r8 = r8[r11]     // Catch:{ all -> 0x024b }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x024b }
            r12 = 2
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ all -> 0x024b }
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ all -> 0x024b }
            r14[r11] = r12     // Catch:{ all -> 0x024b }
            r11 = 1
            r14[r11] = r12     // Catch:{ all -> 0x024b }
            java.lang.reflect.Method r12 = r9.getMethod(r8, r14)     // Catch:{ all -> 0x024b }
            r8 = 766175324(0x2daae85c, float:1.942995E-11)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x024b }
            r5.put(r8, r12)     // Catch:{ all -> 0x024b }
        L_0x01c5:
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12     // Catch:{ all -> 0x024b }
            r5 = 0
            java.lang.Object r8 = r12.invoke(r5, r13)     // Catch:{ all -> 0x024b }
            java.lang.Character r8 = (java.lang.Character) r8     // Catch:{ all -> 0x024b }
            char r5 = r8.charValue()     // Catch:{ all -> 0x024b }
            r4[r7] = r5
        L_0x01d4:
            int r5 = r2.f10463e
            char r5 = r4[r5]
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x0242 }
            r7 = 1
            r8[r7] = r2     // Catch:{ all -> 0x0242 }
            r7 = 0
            r8[r7] = r2     // Catch:{ all -> 0x0242 }
            java.util.Map<java.lang.Integer, java.lang.Object> r7 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x0242 }
            r9 = -1824695553(0xffffffff933d5aff, float:-2.3900018E-27)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0242 }
            java.lang.Object r11 = r7.get(r11)     // Catch:{ all -> 0x0242 }
            if (r11 == 0) goto L_0x01f1
            goto L_0x023a
        L_0x01f1:
            int r11 = android.view.ViewConfiguration.getPressedStateDuration()     // Catch:{ all -> 0x0242 }
            int r11 = r11 >> 16
            r12 = 61925(0xf1e5, float:8.6775E-41)
            int r12 = r12 - r11
            char r11 = (char) r12     // Catch:{ all -> 0x0242 }
            r12 = 0
            int r13 = android.view.View.resolveSizeAndState(r12, r12, r12)     // Catch:{ all -> 0x0242 }
            int r13 = 758 - r13
            int r14 = android.os.Process.getThreadPriority(r12)     // Catch:{ all -> 0x0242 }
            int r14 = r14 + 20
            int r12 = r14 >> 6
            int r12 = 24 - r12
            java.lang.Object r11 = com.facetec.sdk.C2854bp.m11559b(r11, r13, r12)     // Catch:{ all -> 0x0242 }
            java.lang.Class r11 = (java.lang.Class) r11     // Catch:{ all -> 0x0242 }
            r12 = 2
            byte r13 = (byte) r12     // Catch:{ all -> 0x0242 }
            int r12 = r13 + -2
            byte r12 = (byte) r12     // Catch:{ all -> 0x0242 }
            byte r14 = (byte) r12     // Catch:{ all -> 0x0242 }
            r15 = 1
            java.lang.Object[] r9 = new java.lang.Object[r15]     // Catch:{ all -> 0x0242 }
            m11403x(r13, r12, r14, r9)     // Catch:{ all -> 0x0242 }
            r12 = 0
            r9 = r9[r12]     // Catch:{ all -> 0x0242 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0242 }
            r13 = 2
            java.lang.Class[] r14 = new java.lang.Class[r13]     // Catch:{ all -> 0x0242 }
            r14[r12] = r1     // Catch:{ all -> 0x0242 }
            r12 = 1
            r14[r12] = r1     // Catch:{ all -> 0x0242 }
            java.lang.reflect.Method r11 = r11.getMethod(r9, r14)     // Catch:{ all -> 0x0242 }
            r9 = -1824695553(0xffffffff933d5aff, float:-2.3900018E-27)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0242 }
            r7.put(r9, r11)     // Catch:{ all -> 0x0242 }
        L_0x023a:
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11     // Catch:{ all -> 0x0242 }
            r7 = 0
            r11.invoke(r7, r8)     // Catch:{ all -> 0x0242 }
            goto L_0x00c7
        L_0x0242:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x024a
            throw r1
        L_0x024a:
            throw r0
        L_0x024b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0253
            throw r1
        L_0x0253:
            throw r0
        L_0x0254:
            r3 = r4
        L_0x0255:
            if (r10 <= 0) goto L_0x0266
            char[] r0 = new char[r6]
            r1 = 0
            java.lang.System.arraycopy(r3, r1, r0, r1, r6)
            int r4 = r6 - r10
            java.lang.System.arraycopy(r0, r1, r3, r4, r10)
            java.lang.System.arraycopy(r0, r10, r3, r1, r4)
            goto L_0x0267
        L_0x0266:
            r1 = 0
        L_0x0267:
            if (r24 == 0) goto L_0x027d
            char[] r0 = new char[r6]
        L_0x026b:
            r2.f10463e = r1
            int r1 = r2.f10463e
            if (r1 >= r6) goto L_0x027c
            int r4 = r6 - r1
            r5 = 1
            int r4 = r4 - r5
            char r4 = r3[r4]
            r0[r1] = r4
            int r1 = r1 + 1
            goto L_0x026b
        L_0x027c:
            r3 = r0
        L_0x027d:
            if (r21 <= 0) goto L_0x0292
            r0 = 0
        L_0x0280:
            r2.f10463e = r0
            int r0 = r2.f10463e
            if (r0 >= r6) goto L_0x0292
            char r1 = r3[r0]
            r4 = 2
            r5 = r23[r4]
            int r1 = r1 - r5
            char r1 = (char) r1
            r3[r0] = r1
            int r0 = r0 + 1
            goto L_0x0280
        L_0x0292:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            r1 = 0
            r25[r1] = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2840bg.m11400w(java.lang.String, int[], boolean, java.lang.Object[]):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11403x(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r6 = r6 + 108
            byte[] r0 = $$d
            byte[] r1 = new byte[r8]
            int r8 = r8 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001a
            r6 = r7
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L_0x0038
        L_0x001a:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x001e:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L_0x002b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L_0x002b:
            int r6 = r6 + 1
            byte r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r9
            r9 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L_0x0038:
            int r7 = r7 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2840bg.m11403x(int, byte, short, java.lang.Object[]):void");
    }

    /* renamed from: c */
    private static synchronized void m11360c(Context context, C2802au.C2807e eVar) {
        synchronized (C2840bg.class) {
            m11351b(context);
            m11382j(context);
            C2802au.m10952a(context, eVar);
        }
    }

    /* renamed from: d */
    static FaceTecSDKStatus m11366d(Context context) {
        String str;
        if (!m11375f(context)) {
            return FaceTecSDKStatus.DEVICE_NOT_SUPPORTED;
        }
        if (f9201b != null && ((str = f9212m) == null || str.isEmpty())) {
            return FaceTecSDKStatus.ENCRYPTION_KEY_INVALID;
        }
        if (m11364c(context.getResources().getConfiguration())) {
            return FaceTecSDKStatus.DEVICE_IN_LANDSCAPE_MODE;
        }
        if (C2810ax.m10989b(context) == 9) {
            return FaceTecSDKStatus.DEVICE_IN_REVERSE_PORTRAIT_MODE;
        }
        int i = C28411.f9219e[f9210k.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return f9214o ? FaceTecSDKStatus.KEY_EXPIRED_OR_INVALID : FaceTecSDKStatus.INVALID_DEVICE_KEY_IDENTIFIER;
            }
            if (i == 3) {
                return FaceTecSDKStatus.NETWORK_ISSUES;
            }
            if (i == 4) {
                return FaceTecSDKStatus.VERSION_DEPRECATED;
            }
            if (i != 5) {
                return FaceTecSDKStatus.NEVER_INITIALIZED;
            }
            return FaceTecSDKStatus.NEVER_INITIALIZED;
        } else if (C2863bw.m11685h(context)) {
            return FaceTecSDKStatus.DEVICE_LOCKED_OUT;
        } else {
            return FaceTecSDKStatus.INITIALIZED;
        }
    }

    /* renamed from: i */
    static int m11380i(Context context) {
        return m11376g(context).getInt(C2790am.f8902S, 0);
    }

    /* renamed from: f */
    private static boolean m11374f() {
        return Build.CPU_ABI.toLowerCase().startsWith("arm");
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m11372e(String str, Context context, FaceTecSDK.InitializeCallback initializeCallback, String str2, String str3) {
        if (!m11365c(str)) {
            m11353b(context, initializeCallback, false);
            return;
        }
        m11379h(context);
        m11361c(context, str2, str3, initializeCallback);
    }

    /* renamed from: c */
    static Long m11358c(Context context) {
        long i = C2863bw.m11686i(context);
        if (i != 0) {
            return Long.valueOf(i);
        }
        return null;
    }

    /* renamed from: b */
    private static void m11353b(Context context, FaceTecSDK.InitializeCallback initializeCallback, boolean z) {
        if (initializeCallback != null) {
            C2920cv.m12195c(new C3654w5(z, context, initializeCallback));
        }
    }

    /* renamed from: c */
    static boolean m11363c() {
        return f9204e != FaceTecAuditTrailType.DISABLED;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m11357b(boolean z, Context context, FaceTecSDK.InitializeCallback initializeCallback) {
        if (z) {
            initializeCallback.onCompletion(C2885cd.m11830d(context));
        } else {
            initializeCallback.onCompletion(false);
        }
    }

    /* renamed from: c */
    static void m11362c(FaceTecAuditTrailType faceTecAuditTrailType) {
        if (faceTecAuditTrailType != f9204e) {
            f9204e = faceTecAuditTrailType;
            C2920cv.m12195c(new C2823b6());
        }
    }

    /* renamed from: e */
    static FaceTecSDK.CameraPermissionStatus m11369e(Context context) {
        if (C0767a.m2891a(context, "android.permission.CAMERA") != 0) {
            return FaceTecSDK.CameraPermissionStatus.NOT_YET_REQUESTED;
        }
        return FaceTecSDK.CameraPermissionStatus.GRANTED;
    }

    /* renamed from: b */
    static void m11355b(Context context, boolean z) {
        if (z) {
            C2920cv.m12196e(new C3155g6(context));
        }
        C2920cv.m12195c(new C3675x5(context));
    }

    /* renamed from: c */
    static boolean m11364c(Configuration configuration) {
        return configuration.orientation == 2;
    }

    /* renamed from: e */
    static String m11370e(String str) {
        String b = m11351b((Context) null);
        if (b == null) {
            b = "_";
        }
        if (f9209j == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("facetec|sdk|android|");
        sb.append(f9209j);
        sb.append("|");
        sb.append(f9201b);
        sb.append("|");
        sb.append(b);
        sb.append("|");
        sb.append(Build.MODEL);
        sb.append("|");
        sb.append(FaceTecSDK.version());
        sb.append("|");
        sb.append(Locale.getDefault());
        sb.append("|");
        sb.append(Locale.getDefault().getLanguage());
        sb.append("|");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: c */
    private static boolean m11365c(String str) {
        if (str != null) {
            try {
                RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str.replace("-----BEGIN PUBLIC KEY-----\n", "").replace("-----END PUBLIC KEY-----", ""), 0)));
                f9212m = str.trim();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    static synchronized String m11351b(Context context) {
        String str;
        synchronized (C2840bg.class) {
            if (f9205f == null && context != null) {
                f9205f = m11385l(context);
            }
            str = f9205f;
        }
        return str;
    }

    /* renamed from: b */
    static String m11350b() {
        return f9212m;
    }

    /* renamed from: b */
    static void m11356b(JSONObject jSONObject) {
        if (jSONObject.has("dGVULgo:UY%BjRq4N@@~4(9Bp1)GZ1+{")) {
            try {
                C2852bo.m11548e(jSONObject.getString("dGVULgo:UY%BjRq4N@@~4(9Bp1)GZ1+{"));
            } catch (JSONException unused) {
            }
        } else {
            f9208i = jSONObject;
        }
    }
}

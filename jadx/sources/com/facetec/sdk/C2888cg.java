package com.facetec.sdk;

import android.app.Activity;
import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facetec.sdk.C3555s;
import com.github.mikephil.charting.utils.Utils;
import com.guardsquare.dexguard.annotation.VirtualizeCode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;

/* renamed from: com.facetec.sdk.cg */
final class C2888cg {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    public static final byte[] $$d = null;
    public static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: E */
    private static char f9538E;

    /* renamed from: F */
    private static long f9539F;

    /* renamed from: G */
    private static /* synthetic */ boolean f9540G = true;

    /* renamed from: H */
    private static int f9541H;

    /* renamed from: J */
    private static boolean f9542J;

    /* renamed from: K */
    private static char[] f9543K;

    /* renamed from: L */
    private static int f9544L;

    /* renamed from: M */
    private static boolean f9545M;

    /* renamed from: N */
    private static char[] f9546N;

    /* renamed from: O */
    private static int f9547O;

    /* renamed from: S */
    private static int f9548S;

    /* renamed from: a */
    public static final int f9549a = 0;

    /* renamed from: b */
    static volatile String f9550b = "";

    /* renamed from: c */
    static volatile String f9551c = "";

    /* renamed from: d */
    public static final byte[] f9552d = null;

    /* renamed from: e */
    private static C2888cg f9553e = null;

    /* renamed from: A */
    private final Semaphore f9554A = new Semaphore(1);

    /* renamed from: B */
    private boolean f9555B = true;

    /* renamed from: C */
    private TimerTask f9556C = null;

    /* renamed from: D */
    private Date f9557D = null;

    /* renamed from: I */
    private boolean f9558I = false;

    /* renamed from: f */
    private final ArrayList<WeakReference<C2894e>> f9559f;

    /* renamed from: g */
    private final ExecutorService f9560g;

    /* renamed from: h */
    private final ArrayList<WeakReference<C2893d>> f9561h;

    /* renamed from: i */
    private final ExecutorService f9562i;

    /* renamed from: j */
    private final ArrayList<WeakReference<C2892c>> f9563j;

    /* renamed from: k */
    private C2887cf f9564k;

    /* renamed from: l */
    private final WeakReference<Activity> f9565l;

    /* renamed from: m */
    private C2886ce f9566m;

    /* renamed from: n */
    private C2884cc f9567n;

    /* renamed from: o */
    private C2865by f9568o;

    /* renamed from: p */
    private C2890a f9569p;

    /* renamed from: q */
    private C2896ci f9570q;

    /* renamed from: r */
    private C2895ch f9571r;

    /* renamed from: s */
    private C2899cl f9572s;

    /* renamed from: t */
    private C2897cj f9573t;

    /* renamed from: u */
    private final Timer f9574u = new Timer();

    /* renamed from: v */
    private final C3513q f9575v;

    /* renamed from: w */
    private final Object f9576w = new Object();

    /* renamed from: x */
    private int f9577x;

    /* renamed from: y */
    private C2891b f9578y = C2891b.NOT_STARTED;

    /* renamed from: z */
    private final C3604u f9579z;

    /* renamed from: com.facetec.sdk.cg$3 */
    static /* synthetic */ class C28893 {

        /* renamed from: b */
        static final /* synthetic */ int[] f9580b;

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
                com.facetec.sdk.cg$b[] r0 = com.facetec.sdk.C2888cg.C2891b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9580b = r0
                com.facetec.sdk.cg$b r1 = com.facetec.sdk.C2888cg.C2891b.NOT_STARTED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9580b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facetec.sdk.cg$b r1 = com.facetec.sdk.C2888cg.C2891b.FINISHED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9580b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facetec.sdk.cg$b r1 = com.facetec.sdk.C2888cg.C2891b.WAITING_TO_FINISH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9580b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facetec.sdk.cg$b r1 = com.facetec.sdk.C2888cg.C2891b.PRE_SESSION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f9580b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facetec.sdk.cg$b r1 = com.facetec.sdk.C2888cg.C2891b.PROCESSING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2888cg.C28893.<clinit>():void");
        }
    }

    /* renamed from: com.facetec.sdk.cg$a */
    static class C2890a {

        /* renamed from: a */
        final byte[] f9581a;

        /* renamed from: c */
        final int f9582c;

        /* renamed from: d */
        final int f9583d;

        C2890a(byte[] bArr, int i, int i2) {
            this.f9581a = bArr;
            this.f9583d = i;
            this.f9582c = i2;
        }
    }

    /* renamed from: com.facetec.sdk.cg$b */
    enum C2891b {
        NOT_STARTED,
        PRE_SESSION,
        PROCESSING,
        ID_SCAN,
        WAITING_TO_FINISH,
        FINISHED
    }

    @FunctionalInterface
    /* renamed from: com.facetec.sdk.cg$c */
    interface C2892c {
        void onPreSessionProgress(C2899cl clVar, C2896ci ciVar, C2895ch chVar, C2897cj cjVar);
    }

    /* renamed from: com.facetec.sdk.cg$d */
    interface C2893d {
        /* renamed from: b */
        void mo8859b();

        /* renamed from: b */
        void mo8860b(C2884cc ccVar, C2865by byVar);

        /* renamed from: c */
        void mo8861c();

        /* renamed from: d */
        void mo8862d();

        /* renamed from: e */
        void mo8863e();
    }

    @FunctionalInterface
    /* renamed from: com.facetec.sdk.cg$e */
    interface C2894e {
        void onIDScanProgress(C2887cf cfVar, C2886ce ceVar);
    }

    static {
        init$1();
        init$0();
        m11938q();
        f9548S = 0;
        f9547O = 1;
        m11941s();
        m11933n();
        int i = f9547O + 91;
        int i2 = i % 128;
        f9548S = i2;
        int i3 = i % 2;
        int i4 = i2 + 57;
        f9547O = i4 % 128;
        int i5 = i4 % 2;
        int i6 = f9548S + 3;
        f9547O = i6 % 128;
        int i7 = i6 % 2;
    }

    private C2888cg(Activity activity) {
        this.f9565l = new WeakReference<>(activity);
        this.f9562i = Executors.newSingleThreadExecutor();
        this.f9560g = Executors.newSingleThreadExecutor();
        this.f9563j = new ArrayList<>(2);
        this.f9561h = new ArrayList<>(2);
        this.f9559f = new ArrayList<>(2);
        this.f9575v = new C3513q(activity);
        this.f9579z = new C3604u(activity);
        f9550b = null;
        this.f9555B = C2750a.m10683b(activity);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if ((new java.util.Date().getTime() - r4.f9557D.getTime()) <= 615000) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        com.facetec.sdk.C3330l.m13346d(new java.lang.Throwable("Phoenix hang was detected"));
        mo9018d(false);
        r4.f9567n = com.facetec.sdk.C2884cc.f9511c;
        m11870C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r4.f9557D != null) goto L_0x0014;
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11868A() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f9576w
            monitor-enter(r0)
            com.facetec.sdk.cg$b r1 = r4.f9578y     // Catch:{ all -> 0x0043 }
            com.facetec.sdk.cg$b r2 = com.facetec.sdk.C2888cg.C2891b.FINISHED     // Catch:{ all -> 0x0043 }
            if (r1 == r2) goto L_0x0041
            com.facetec.sdk.cg$b r2 = com.facetec.sdk.C2888cg.C2891b.WAITING_TO_FINISH     // Catch:{ all -> 0x0043 }
            if (r1 != r2) goto L_0x000e
            goto L_0x0041
        L_0x000e:
            monitor-exit(r0)
            java.util.Date r0 = r4.f9557D
            if (r0 != 0) goto L_0x0014
            return
        L_0x0014:
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r0 = r0.getTime()
            java.util.Date r2 = r4.f9557D
            long r2 = r2.getTime()
            long r0 = r0 - r2
            r2 = 615000(0x96258, double:3.038504E-318)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0040
            java.lang.Throwable r0 = new java.lang.Throwable
            java.lang.String r1 = "Phoenix hang was detected"
            r0.<init>(r1)
            com.facetec.sdk.C3330l.m13346d(r0)
            r0 = 0
            r4.mo9018d((boolean) r0)
            com.facetec.sdk.cc r0 = com.facetec.sdk.C2884cc.PROCESSING_COMPLETE_TIMED_OUT
            r4.f9567n = r0
            r4.m11870C()
        L_0x0040:
            return
        L_0x0041:
            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            return
        L_0x0043:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2888cg.m11868A():void");
    }

    /* renamed from: B */
    private void m11869B() {
        JSONObject jSONObject;
        JSONObject c = this.f9579z.mo10066c().mo10005c();
        Object[] objArr = new Object[1];
        m11902ad(new int[]{7, 3, 0, 0}, "\u0000\u0000\u0001", false, objArr);
        String optString = c.optString(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        m11906ah((String) null, (int[]) null, 127 - (TypedValue.complexToFraction(0, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) > Utils.FLOAT_EPSILON ? 1 : (TypedValue.complexToFraction(0, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) == Utils.FLOAT_EPSILON ? 0 : -1)), "", objArr2);
        String optString2 = c.optString(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        m11902ad(new int[]{10, 2, 0, 2}, "\u0000\u0001", false, objArr3);
        String optString3 = c.optString(((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        m11906ah((String) null, (int[]) null, 126 - TextUtils.lastIndexOf("", '0', 0), "", objArr4);
        String optString4 = c.optString(((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        m11906ah((String) null, (int[]) null, TextUtils.getOffsetBefore("", 0) + C11051p3.f31760d, "", objArr5);
        String optString5 = c.optString(((String) objArr5[0]).intern());
        Object[] objArr6 = new Object[1];
        m11902ad(new int[]{12, 5, 133, 3}, "\u0000\u0000\u0000\u0001\u0000", false, objArr6);
        String optString6 = c.optString(((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        m11906ah((String) null, (int[]) null, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + C11051p3.f31760d, "", objArr7);
        String optString7 = c.optString(((String) objArr7[0]).intern());
        Object[] objArr8 = new Object[1];
        m11902ad(new int[]{17, 5, 0, 0}, "\u0000\u0000\u0001\u0000\u0000", false, objArr8);
        String optString8 = c.optString(((String) objArr8[0]).intern());
        Object[] objArr9 = new Object[1];
        m11906ah((String) null, (int[]) null, ExpandableListView.getPackedPositionType(0) + C11051p3.f31760d, "", objArr9);
        String optString9 = c.optString(((String) objArr9[0]).intern());
        Object[] objArr10 = new Object[1];
        m11902ad(new int[]{22, 5, 0, 0}, "\u0001\u0001\u0000\u0000\u0000", false, objArr10);
        String optString10 = c.optString(((String) objArr10[0]).intern());
        Object[] objArr11 = new Object[1];
        m11906ah((String) null, (int[]) null, (AudioTrack.getMaxVolume() > Utils.FLOAT_EPSILON ? 1 : (AudioTrack.getMaxVolume() == Utils.FLOAT_EPSILON ? 0 : -1)) + 126, "", objArr11);
        String optString11 = c.optString(((String) objArr11[0]).intern());
        Object[] objArr12 = new Object[1];
        m11902ad(new int[]{27, 5, 111, 5}, "\u0001\u0000\u0000\u0000\u0000", false, objArr12);
        String optString12 = c.optString(((String) objArr12[0]).intern());
        Object[] objArr13 = new Object[1];
        m11902ad(new int[]{32, 5, 73, 0}, "\u0001\u0000\u0000\u0000\u0001", false, objArr13);
        String optString13 = c.optString(((String) objArr13[0]).intern());
        JSONObject jSONObject2 = c;
        Object[] objArr14 = new Object[1];
        m11902ad(new int[]{7, 3, 0, 0}, "\u0000\u0000\u0001", false, objArr14);
        m11914c(((String) objArr14[0]).intern(), optString);
        Object[] objArr15 = new Object[1];
        m11902ad(new int[]{10, 2, 0, 2}, "\u0000\u0001", false, objArr15);
        m11914c(((String) objArr15[0]).intern(), optString3);
        Object[] objArr16 = new Object[1];
        m11906ah((String) null, (int[]) null, 126 - TextUtils.indexOf("", '0', 0, 0), "", objArr16);
        m11914c(((String) objArr16[0]).intern(), optString2);
        Object[] objArr17 = new Object[1];
        m11906ah((String) null, (int[]) null, View.getDefaultSize(0, 0) + C11051p3.f31760d, "", objArr17);
        m11914c(((String) objArr17[0]).intern(), optString4);
        Object[] objArr18 = new Object[1];
        m11906ah((String) null, (int[]) null, 127 - Gravity.getAbsoluteGravity(0, 0), "", objArr18);
        m11914c(((String) objArr18[0]).intern(), optString5);
        Object[] objArr19 = new Object[1];
        String str = "\u0000\u0000\u0000\u0001\u0000";
        m11902ad(new int[]{12, 5, 133, 3}, str, false, objArr19);
        m11914c(((String) objArr19[0]).intern(), optString6);
        Object[] objArr20 = new Object[1];
        String str2 = "";
        m11906ah((String) null, (int[]) null, (AudioTrack.getMinVolume() > Utils.FLOAT_EPSILON ? 1 : (AudioTrack.getMinVolume() == Utils.FLOAT_EPSILON ? 0 : -1)) + C11051p3.f31760d, str2, objArr20);
        m11914c(((String) objArr20[0]).intern(), optString7);
        Object[] objArr21 = new Object[1];
        String str3 = "\u0000\u0000\u0001\u0000\u0000";
        m11902ad(new int[]{17, 5, 0, 0}, str3, false, objArr21);
        m11914c(((String) objArr21[0]).intern(), optString8);
        Object[] objArr22 = new Object[1];
        m11906ah((String) null, (int[]) null, 127 - TextUtils.getOffsetAfter("", 0), "", objArr22);
        C2885cd.m11776I(((String) objArr22[0]).intern(), Integer.parseInt(optString9));
        Object[] objArr23 = new Object[1];
        m11902ad(new int[]{22, 5, 0, 0}, "\u0001\u0001\u0000\u0000\u0000", false, objArr23);
        C2885cd.m11776I(((String) objArr23[0]).intern(), Integer.parseInt(optString10));
        Object[] objArr24 = new Object[1];
        m11906ah((String) null, (int[]) null, (ViewConfiguration.getScrollFriction() > Utils.FLOAT_EPSILON ? 1 : (ViewConfiguration.getScrollFriction() == Utils.FLOAT_EPSILON ? 0 : -1)) + 126, "", objArr24);
        C2885cd.m11776I(((String) objArr24[0]).intern(), Integer.parseInt(optString11));
        Object[] objArr25 = new Object[1];
        m11902ad(new int[]{27, 5, 111, 5}, "\u0001\u0000\u0000\u0000\u0000", false, objArr25);
        C2885cd.m11776I(((String) objArr25[0]).intern(), Integer.parseInt(optString12));
        Object[] objArr26 = new Object[1];
        m11902ad(new int[]{32, 5, 73, 0}, "\u0001\u0000\u0000\u0000\u0001", false, objArr26);
        C2885cd.m11776I(((String) objArr26[0]).intern(), Integer.parseInt(optString13));
        try {
            Object[] objArr27 = new Object[1];
            m11902ad(new int[]{7, 3, 0, 0}, "\u0000\u0000\u0001", false, objArr27);
            jSONObject = jSONObject2;
            try {
                jSONObject.put(((String) objArr27[0]).intern(), new ArrayList().toString());
                Object[] objArr28 = new Object[1];
                m11902ad(new int[]{12, 5, 133, 3}, str, false, objArr28);
                jSONObject.put(((String) objArr28[0]).intern(), new ArrayList().toString());
                Object[] objArr29 = new Object[1];
                m11906ah((String) null, (int[]) null, 128 - (SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)), str2, objArr29);
                jSONObject.put(((String) objArr29[0]).intern(), new ArrayList().toString());
                Object[] objArr30 = new Object[1];
                m11902ad(new int[]{17, 5, 0, 0}, str3, false, objArr30);
                jSONObject.put(((String) objArr30[0]).intern(), new ArrayList().toString());
                int i = f9547O + 1;
                f9548S = i % 128;
                int i2 = i % 2;
            } catch (JSONException unused) {
            }
        } catch (JSONException unused2) {
            jSONObject = jSONObject2;
        }
        Object[] objArr31 = new Object[1];
        m11906ah((String) null, (int[]) null, TextUtils.lastIndexOf("", '0') + 128, "", objArr31);
        C2885cd.m11778K(((String) objArr31[0]).intern(), jSONObject.toString());
    }

    /* renamed from: C */
    private synchronized void m11870C() {
        boolean z;
        boolean z2 = true;
        int i = f9548S + 1;
        f9547O = i % 128;
        int i2 = i % 2;
        Activity activity = this.f9565l.get();
        if (activity != null) {
            C2884cc ccVar = this.f9567n;
            if (ccVar == C2884cc.PROCESSING_COMPLETE_STILL_COMPUTING) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i3 = f9547O + 107;
                f9548S = i3 % 128;
                if (i3 % 2 == 0) {
                    activity.runOnUiThread(new C3236jc(this));
                } else {
                    activity.runOnUiThread(new C3236jc(this));
                    throw null;
                }
            } else if (ccVar == C2884cc.PROCESSING_COMPLETE_TIMED_OUT) {
                activity.runOnUiThread(new C3484oc(this));
            } else if (ccVar == C2884cc.PROCESSING_COMPLETE_RETRY) {
                activity.runOnUiThread(new C3191hb(this));
            } else {
                if (ccVar != C2884cc.PROCESSING_COMPLETE_SUCCESS) {
                    z2 = false;
                }
                if (z2) {
                    activity.runOnUiThread(new C3213ib(this));
                } else {
                    activity.runOnUiThread(new C3483ob(this));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r0 == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        return;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m11871D() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = f9548S     // Catch:{ all -> 0x004d }
            int r0 = r0 + 117
            int r1 = r0 % 128
            f9547O = r1     // Catch:{ all -> 0x004d }
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x001f
            java.lang.ref.WeakReference<android.app.Activity> r0 = r4.f9565l     // Catch:{ all -> 0x004d }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x004d }
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x002e
            goto L_0x002c
        L_0x001f:
            java.lang.ref.WeakReference<android.app.Activity> r0 = r4.f9565l     // Catch:{ all -> 0x004d }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x004d }
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ all -> 0x004d }
            r3 = 80
            int r3 = r3 / r2
            if (r0 != 0) goto L_0x002e
        L_0x002c:
            monitor-exit(r4)
            return
        L_0x002e:
            com.facetec.sdk.ic r3 = new com.facetec.sdk.ic     // Catch:{ all -> 0x004d }
            r3.<init>(r4)     // Catch:{ all -> 0x004d }
            r0.runOnUiThread(r3)     // Catch:{ all -> 0x004d }
            int r0 = f9548S     // Catch:{ all -> 0x004d }
            int r0 = r0 + 17
            int r3 = r0 % 128
            f9547O = r3     // Catch:{ all -> 0x004d }
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0043
            r1 = r2
        L_0x0043:
            if (r1 == 0) goto L_0x0047
            monitor-exit(r4)
            return
        L_0x0047:
            r0 = 0
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004d }
        L_0x004b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2888cg.m11871D():void");
    }

    /* renamed from: E */
    private synchronized void m11872E() {
        char c;
        boolean z;
        int i = f9548S + 119;
        f9547O = i % 128;
        if (i % 2 == 0) {
            c = 21;
        } else {
            c = '.';
        }
        if (c != 21) {
            Iterator<C2893d> it = m11874G().iterator();
            while (true) {
                if (it.hasNext()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    int i2 = f9547O + 35;
                    f9548S = i2 % 128;
                    int i3 = i2 % 2;
                } else {
                    it.next().mo8861c();
                }
            }
        } else {
            m11874G().iterator();
            throw null;
        }
    }

    /* renamed from: F */
    private synchronized List<C2892c> m11873F() {
        ArrayList arrayList;
        boolean z;
        arrayList = new ArrayList(this.f9563j.size());
        Iterator<WeakReference<C2892c>> it = this.f9563j.iterator();
        while (it.hasNext()) {
            C2892c cVar = (C2892c) it.next().get();
            if (cVar != null) {
                int i = f9547O + 9;
                f9548S = i % 128;
                if (i % 2 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    arrayList.add(cVar);
                    int i2 = f9548S + 1;
                    f9547O = i2 % 128;
                    int i3 = i2 % 2;
                } else {
                    arrayList.add(cVar);
                    throw null;
                }
            }
            int i4 = f9548S + 5;
            f9547O = i4 % 128;
            if (i4 % 2 == 0) {
            }
        }
        return arrayList;
    }

    /* renamed from: G */
    private synchronized List<C2893d> m11874G() {
        ArrayList arrayList;
        boolean z;
        char c;
        arrayList = new ArrayList(this.f9561h.size());
        Iterator<WeakReference<C2893d>> it = this.f9561h.iterator();
        int i = f9547O + 119;
        f9548S = i % 128;
        int i2 = i % 2;
        while (true) {
            if (it.hasNext()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                C2893d dVar = (C2893d) it.next().get();
                if (dVar != null) {
                    c = 'Y';
                } else {
                    c = 21;
                }
                if (c != 21) {
                    arrayList.add(dVar);
                }
            } else {
                int i3 = f9547O + 53;
                f9548S = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        r0.next().mo8862d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        throw null;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m11875H() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = f9548S     // Catch:{ all -> 0x004c }
            int r0 = r0 + 121
            int r1 = r0 % 128
            f9547O = r1     // Catch:{ all -> 0x004c }
            r1 = 2
            int r0 = r0 % r1
            java.util.List r0 = r4.m11874G()     // Catch:{ all -> 0x004c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x004c }
        L_0x0013:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x001b
            r2 = r1
            goto L_0x001d
        L_0x001b:
            r2 = 51
        L_0x001d:
            if (r2 == r1) goto L_0x0021
            monitor-exit(r4)
            return
        L_0x0021:
            int r2 = f9547O     // Catch:{ all -> 0x004c }
            int r2 = r2 + 115
            int r3 = r2 % 128
            f9548S = r3     // Catch:{ all -> 0x004c }
            int r2 = r2 % 2
            r3 = 24
            if (r2 == 0) goto L_0x0032
            r2 = 76
            goto L_0x0033
        L_0x0032:
            r2 = r3
        L_0x0033:
            if (r2 != r3) goto L_0x003f
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x004c }
            com.facetec.sdk.cg$d r2 = (com.facetec.sdk.C2888cg.C2893d) r2     // Catch:{ all -> 0x004c }
            r2.mo8862d()     // Catch:{ all -> 0x004c }
            goto L_0x0013
        L_0x003f:
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x004c }
            com.facetec.sdk.cg$d r0 = (com.facetec.sdk.C2888cg.C2893d) r0     // Catch:{ all -> 0x004c }
            r0.mo8862d()     // Catch:{ all -> 0x004c }
            r0 = 0
            throw r0     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2888cg.m11875H():void");
    }

    /* renamed from: I */
    private synchronized List<C2894e> m11876I() {
        ArrayList arrayList;
        boolean z;
        char c;
        arrayList = new ArrayList(this.f9559f.size());
        Iterator<WeakReference<C2894e>> it = this.f9559f.iterator();
        while (it.hasNext()) {
            int i = f9548S + 75;
            f9547O = i % 128;
            if (i % 2 == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C2894e eVar = (C2894e) it.next().get();
                if (eVar != null) {
                    c = '!';
                } else {
                    c = '8';
                }
                if (c == '!') {
                    arrayList.add(eVar);
                    int i2 = f9548S + 71;
                    f9547O = i2 % 128;
                    int i3 = i2 % 2;
                }
            } else {
                C2894e eVar2 = (C2894e) it.next().get();
                throw null;
            }
        }
        return arrayList;
    }

    /* renamed from: J */
    private synchronized void m11877J() {
        boolean z;
        Iterator<C2894e> it = m11876I().iterator();
        while (true) {
            if (it.hasNext()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i = f9548S + 57;
                f9547O = i % 128;
                int i2 = i % 2;
                it.next().onIDScanProgress(this.f9564k, this.f9566m);
                int i3 = f9547O + 89;
                f9548S = i3 % 128;
                if (i3 % 2 != 0) {
                }
            }
        }
    }

    /* renamed from: K */
    private synchronized void m11878K() {
        boolean z;
        int i = f9547O + 115;
        f9548S = i % 128;
        int i2 = i % 2;
        Iterator<C2893d> it = m11874G().iterator();
        while (true) {
            if (it.hasNext()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i3 = f9548S + 95;
                f9547O = i3 % 128;
                int i4 = i3 % 2;
                it.next().mo8863e();
                int i5 = f9548S + 3;
                f9547O = i5 % 128;
                if (i5 % 2 == 0) {
                }
            }
        }
    }

    /* renamed from: L */
    private synchronized void m11879L() {
        boolean z;
        int i = f9548S + 107;
        f9547O = i % 128;
        int i2 = i % 2;
        Iterator<C2893d> it = m11874G().iterator();
        while (true) {
            if (it.hasNext()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i3 = f9548S + 37;
                f9547O = i3 % 128;
                int i4 = i3 % 2;
                it.next().mo8860b(this.f9567n, this.f9568o);
            }
        }
    }

    /* renamed from: M */
    private synchronized void m11880M() {
        boolean z;
        Iterator<C2892c> it = m11873F().iterator();
        while (true) {
            if (it.hasNext()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                break;
            }
            int i = f9548S + 9;
            f9547O = i % 128;
            int i2 = i % 2;
            it.next().onPreSessionProgress(this.f9572s, this.f9570q, this.f9571r, this.f9573t);
            int i3 = f9547O + 69;
            f9548S = i3 % 128;
            if (i3 % 2 != 0) {
            }
        }
        int i4 = f9547O + 13;
        f9548S = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: N */
    private synchronized void m11881N() {
        boolean z;
        Iterator<C2893d> it = m11874G().iterator();
        int i = f9548S + 55;
        f9547O = i % 128;
        int i2 = i % 2;
        while (true) {
            boolean z2 = true;
            if (it.hasNext()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i3 = f9547O + 103;
                f9548S = i3 % 128;
                if (i3 % 2 != 0) {
                    z2 = false;
                }
                if (z2) {
                    it.next().mo8859b();
                } else {
                    it.next().mo8859b();
                    int i4 = 68 / 0;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void m11882O() {
        int i = f9548S + 113;
        f9547O = i % 128;
        int i2 = i % 2;
        m11872E();
        int i3 = f9547O + 71;
        f9548S = i3 % 128;
        int i4 = i3 % 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m11883P() {
        int i = f9547O + 41;
        f9548S = i % 128;
        int i2 = i % 2;
        m11879L();
        int i3 = f9547O + 69;
        f9548S = i3 % 128;
        int i4 = i3 % 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m11884Q() {
        int i = f9547O + 29;
        f9548S = i % 128;
        int i2 = i % 2;
        m11881N();
        int i3 = f9548S + 13;
        f9547O = i3 % 128;
        int i4 = i3 % 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m11885R() {
        int i = f9548S + 97;
        f9547O = i % 128;
        boolean z = i % 2 != 0;
        m11878K();
        if (!z) {
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m11886S() {
        int i = f9548S + 15;
        f9547O = i % 128;
        boolean z = i % 2 == 0;
        m11875H();
        if (z) {
            int i2 = 55 / 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public static /* synthetic */ void m11887T() {
        int i = f9548S + 99;
        f9547O = i % 128;
        int i2 = i % 2;
        m11946x();
        int i3 = f9547O + 89;
        f9548S = i3 % 128;
        int i4 = i3 % 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ void m11888U() {
        int i = f9547O + 17;
        f9548S = i % 128;
        int i2 = i % 2;
        m11877J();
        int i3 = f9547O + 61;
        f9548S = i3 % 128;
        int i4 = i3 % 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public static /* synthetic */ void m11889V() {
        int i = f9547O + 41;
        f9548S = i % 128;
        char c = i % 2 != 0 ? '!' : '?';
        m11946x();
        if (c != '!') {
            int i2 = f9548S + 31;
            f9547O = i2 % 128;
            if (i2 % 2 == 0 ? true : true) {
                throw null;
            }
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public static /* synthetic */ void m11890W() {
        int i = f9548S + 91;
        f9547O = i % 128;
        char c = i % 2 == 0 ? '-' : 'N';
        m11946x();
        if (c != 'N') {
            int i2 = 64 / 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ void m11891X() {
        int i = f9547O + 89;
        f9548S = i % 128;
        int i2 = i % 2;
        m11880M();
        int i3 = f9548S + 87;
        f9547O = i3 % 128;
        int i4 = i3 % 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public static /* synthetic */ void m11892Y() {
        int i = f9548S + 55;
        f9547O = i % 128;
        int i2 = i % 2;
        m11936p();
        int i3 = f9548S + 91;
        f9547O = i3 % 128;
        int i4 = i3 % 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ void m11893Z() {
        int i = f9547O + 25;
        f9548S = i % 128;
        boolean z = i % 2 != 0;
        m11868A();
        if (!z) {
            int i2 = f9548S + 79;
            f9547O = i2 % 128;
            if ((i2 % 2 == 0 ? (char) 20 : 31) == 20) {
                throw null;
            }
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: aa */
    public /* synthetic */ void m11899aa() {
        int i = f9547O + 123;
        f9548S = i % 128;
        boolean z = i % 2 != 0;
        m11868A();
        if (!z) {
            int i2 = f9547O + 9;
            f9548S = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: ab */
    public static /* synthetic */ void m11900ab() {
        int i = f9547O + 17;
        f9548S = i % 128;
        char c = i % 2 != 0 ? (char) 26 : 9;
        m11946x();
        if (c == 9) {
            int i2 = f9548S + 3;
            f9547O = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: ac */
    public static /* synthetic */ void m11901ac() {
        int i = f9548S + 87;
        f9547O = i % 128;
        int i2 = i % 2;
        m11936p();
        char c = ']';
        int i3 = f9547O + 93;
        f9548S = i3 % 128;
        if (i3 % 2 == 0) {
            c = 20;
        }
        if (c != 20) {
            int i4 = 12 / 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.String} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: ad */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11902ad(int[] r22, java.lang.String r23, boolean r24, java.lang.Object[] r25) {
        /*
            r0 = r23
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            int r2 = $10
            int r2 = r2 + 111
            int r3 = r2 % 128
            $11 = r3
            r3 = 2
            int r2 = r2 % r3
            r2 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0014
            r5 = r4
            goto L_0x0015
        L_0x0014:
            r5 = r2
        L_0x0015:
            if (r5 == 0) goto L_0x0018
            goto L_0x001e
        L_0x0018:
            java.lang.String r5 = "ISO-8859-1"
            byte[] r0 = r0.getBytes(r5)
        L_0x001e:
            byte[] r0 = (byte[]) r0
            com.facetec.sdk.gm r5 = new com.facetec.sdk.gm
            r5.<init>()
            r6 = r22[r4]
            r7 = r22[r2]
            r8 = r22[r3]
            r9 = 3
            r9 = r22[r9]
            char[] r10 = f9546N
            r11 = 86
            if (r10 == 0) goto L_0x0037
            r13 = 31
            goto L_0x0038
        L_0x0037:
            r13 = r11
        L_0x0038:
            java.lang.String r14 = ""
            r15 = 9
            if (r13 == r11) goto L_0x0177
            int r11 = r10.length
            char[] r13 = new char[r11]
            r12 = r4
        L_0x0042:
            if (r12 >= r11) goto L_0x016f
            int r16 = $10
            int r4 = r16 + 9
            int r15 = r4 % 128
            $11 = r15
            int r4 = r4 % r3
            r15 = 1019307753(0x3cc166e9, float:0.023608642)
            if (r4 != 0) goto L_0x00dc
            char r4 = r10[r12]
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x00d3 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00d3 }
            r2 = 0
            r3[r2] = r4     // Catch:{ all -> 0x00d3 }
            java.util.Map<java.lang.Integer, java.lang.Object> r4 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x00d3 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x00d3 }
            java.lang.Object r2 = r4.get(r2)     // Catch:{ all -> 0x00d3 }
            if (r2 == 0) goto L_0x0072
            r21 = r1
            r19 = r8
            r20 = r9
            r18 = r11
            goto L_0x00bf
        L_0x0072:
            r2 = 0
            int r15 = android.graphics.Color.green(r2)     // Catch:{ all -> 0x00d3 }
            char r15 = (char) r15     // Catch:{ all -> 0x00d3 }
            r18 = r11
            r11 = 48
            int r11 = android.text.TextUtils.lastIndexOf(r14, r11, r2)     // Catch:{ all -> 0x00d3 }
            int r11 = r11 + 910
            int r2 = android.view.ViewConfiguration.getMinimumFlingVelocity()     // Catch:{ all -> 0x00d3 }
            int r2 = r2 >> 16
            int r2 = r2 + 24
            java.lang.Object r2 = com.facetec.sdk.C2854bp.m11559b(r15, r11, r2)     // Catch:{ all -> 0x00d3 }
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ all -> 0x00d3 }
            byte[] r11 = $$d     // Catch:{ all -> 0x00d3 }
            r15 = 1
            byte r11 = r11[r15]     // Catch:{ all -> 0x00d3 }
            int r11 = r11 - r15
            byte r11 = (byte) r11     // Catch:{ all -> 0x00d3 }
            r19 = r8
            r15 = 0
            byte r8 = (byte) r15     // Catch:{ all -> 0x00d3 }
            byte r15 = (byte) r8     // Catch:{ all -> 0x00d3 }
            r21 = r1
            r20 = r9
            r9 = 1
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x00d3 }
            m11907ai(r11, r8, r15, r1)     // Catch:{ all -> 0x00d3 }
            r8 = 0
            r1 = r1[r8]     // Catch:{ all -> 0x00d3 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00d3 }
            java.lang.Class[] r11 = new java.lang.Class[r9]     // Catch:{ all -> 0x00d3 }
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00d3 }
            r11[r8] = r9     // Catch:{ all -> 0x00d3 }
            java.lang.reflect.Method r2 = r2.getMethod(r1, r11)     // Catch:{ all -> 0x00d3 }
            r1 = 1019307753(0x3cc166e9, float:0.023608642)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x00d3 }
            r4.put(r1, r2)     // Catch:{ all -> 0x00d3 }
        L_0x00bf:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch:{ all -> 0x00d3 }
            r1 = 0
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch:{ all -> 0x00d3 }
            java.lang.Character r2 = (java.lang.Character) r2     // Catch:{ all -> 0x00d3 }
            char r1 = r2.charValue()     // Catch:{ all -> 0x00d3 }
            r13[r12] = r1
            int r1 = r12 >>> 0
            r12 = r1
            goto L_0x0157
        L_0x00d3:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x00db
            throw r1
        L_0x00db:
            throw r0
        L_0x00dc:
            r21 = r1
            r19 = r8
            r20 = r9
            r18 = r11
            char r1 = r10[r12]
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0166 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0166 }
            r2 = 0
            r3[r2] = r1     // Catch:{ all -> 0x0166 }
            java.util.Map<java.lang.Integer, java.lang.Object> r1 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x0166 }
            r2 = 1019307753(0x3cc166e9, float:0.023608642)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0166 }
            java.lang.Object r2 = r1.get(r4)     // Catch:{ all -> 0x0166 }
            if (r2 == 0) goto L_0x0100
            goto L_0x0146
        L_0x0100:
            int r2 = android.view.ViewConfiguration.getWindowTouchSlop()     // Catch:{ all -> 0x0166 }
            int r2 = r2 >> 8
            char r2 = (char) r2     // Catch:{ all -> 0x0166 }
            float r4 = android.view.ViewConfiguration.getScrollFriction()     // Catch:{ all -> 0x0166 }
            r8 = 0
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            int r4 = r4 + 908
            int r8 = android.view.ViewConfiguration.getPressedStateDuration()     // Catch:{ all -> 0x0166 }
            int r8 = r8 >> 16
            int r8 = 24 - r8
            java.lang.Object r2 = com.facetec.sdk.C2854bp.m11559b(r2, r4, r8)     // Catch:{ all -> 0x0166 }
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ all -> 0x0166 }
            byte[] r4 = $$d     // Catch:{ all -> 0x0166 }
            r8 = 1
            byte r4 = r4[r8]     // Catch:{ all -> 0x0166 }
            int r4 = r4 - r8
            byte r4 = (byte) r4     // Catch:{ all -> 0x0166 }
            r9 = 0
            byte r11 = (byte) r9     // Catch:{ all -> 0x0166 }
            byte r15 = (byte) r11     // Catch:{ all -> 0x0166 }
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x0166 }
            m11907ai(r4, r11, r15, r9)     // Catch:{ all -> 0x0166 }
            r4 = 0
            r9 = r9[r4]     // Catch:{ all -> 0x0166 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0166 }
            java.lang.Class[] r11 = new java.lang.Class[r8]     // Catch:{ all -> 0x0166 }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0166 }
            r11[r4] = r8     // Catch:{ all -> 0x0166 }
            java.lang.reflect.Method r2 = r2.getMethod(r9, r11)     // Catch:{ all -> 0x0166 }
            r4 = 1019307753(0x3cc166e9, float:0.023608642)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0166 }
            r1.put(r4, r2)     // Catch:{ all -> 0x0166 }
        L_0x0146:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch:{ all -> 0x0166 }
            r1 = 0
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch:{ all -> 0x0166 }
            java.lang.Character r2 = (java.lang.Character) r2     // Catch:{ all -> 0x0166 }
            char r1 = r2.charValue()     // Catch:{ all -> 0x0166 }
            r13[r12] = r1
            int r12 = r12 + 1
        L_0x0157:
            r11 = r18
            r8 = r19
            r9 = r20
            r1 = r21
            r2 = 1
            r3 = 2
            r4 = 0
            r15 = 9
            goto L_0x0042
        L_0x0166:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x016e
            throw r1
        L_0x016e:
            throw r0
        L_0x016f:
            r21 = r1
            r19 = r8
            r20 = r9
            r10 = r13
            goto L_0x017d
        L_0x0177:
            r21 = r1
            r19 = r8
            r20 = r9
        L_0x017d:
            char[] r1 = new char[r7]
            r2 = 0
            java.lang.System.arraycopy(r10, r6, r1, r2, r7)
            if (r0 == 0) goto L_0x03a3
            char[] r4 = new char[r7]
            r5.f10463e = r2
            r2 = 0
        L_0x018a:
            int r6 = r5.f10463e
            if (r6 >= r7) goto L_0x03a2
            byte r8 = r0[r6]
            r9 = 85
            r10 = 1
            if (r8 != r10) goto L_0x0197
            r8 = r9
            goto L_0x0199
        L_0x0197:
            r8 = 38
        L_0x0199:
            if (r8 == r9) goto L_0x0221
            char r8 = r1[r6]
            r9 = 2
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ all -> 0x0218 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0218 }
            r9 = 1
            r10[r9] = r2     // Catch:{ all -> 0x0218 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0218 }
            r8 = 0
            r10[r8] = r2     // Catch:{ all -> 0x0218 }
            java.util.Map<java.lang.Integer, java.lang.Object> r2 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x0218 }
            r9 = 766175324(0x2daae85c, float:1.942995E-11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0218 }
            java.lang.Object r11 = r2.get(r11)     // Catch:{ all -> 0x0218 }
            if (r11 == 0) goto L_0x01be
            goto L_0x0205
        L_0x01be:
            int r11 = android.view.View.resolveSize(r8, r8)     // Catch:{ all -> 0x0218 }
            r8 = 43789(0xab0d, float:6.1361E-41)
            int r8 = r8 - r11
            char r8 = (char) r8     // Catch:{ all -> 0x0218 }
            float r11 = android.media.AudioTrack.getMaxVolume()     // Catch:{ all -> 0x0218 }
            r12 = 0
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            int r11 = r11 + 480
            int r12 = android.view.KeyEvent.getModifierMetaStateMask()     // Catch:{ all -> 0x0218 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x0218 }
            int r12 = r12 + 33
            java.lang.Object r8 = com.facetec.sdk.C2854bp.m11559b(r8, r11, r12)     // Catch:{ all -> 0x0218 }
            java.lang.Class r8 = (java.lang.Class) r8     // Catch:{ all -> 0x0218 }
            r11 = 11
            byte r11 = (byte) r11     // Catch:{ all -> 0x0218 }
            r12 = 0
            byte r13 = (byte) r12     // Catch:{ all -> 0x0218 }
            byte r15 = (byte) r13     // Catch:{ all -> 0x0218 }
            r3 = 1
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x0218 }
            m11907ai(r11, r13, r15, r9)     // Catch:{ all -> 0x0218 }
            r3 = r9[r12]     // Catch:{ all -> 0x0218 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0218 }
            r9 = 2
            java.lang.Class[] r11 = new java.lang.Class[r9]     // Catch:{ all -> 0x0218 }
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0218 }
            r11[r12] = r9     // Catch:{ all -> 0x0218 }
            r12 = 1
            r11[r12] = r9     // Catch:{ all -> 0x0218 }
            java.lang.reflect.Method r11 = r8.getMethod(r3, r11)     // Catch:{ all -> 0x0218 }
            r3 = 766175324(0x2daae85c, float:1.942995E-11)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0218 }
            r2.put(r3, r11)     // Catch:{ all -> 0x0218 }
        L_0x0205:
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11     // Catch:{ all -> 0x0218 }
            r2 = 0
            java.lang.Object r3 = r11.invoke(r2, r10)     // Catch:{ all -> 0x0218 }
            java.lang.Character r3 = (java.lang.Character) r3     // Catch:{ all -> 0x0218 }
            char r2 = r3.charValue()     // Catch:{ all -> 0x0218 }
            r4[r6] = r2
            r17 = 31
            goto L_0x0322
        L_0x0218:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0220
            throw r1
        L_0x0220:
            throw r0
        L_0x0221:
            int r3 = $11
            int r3 = r3 + 115
            int r8 = r3 % 128
            $10 = r8
            r8 = 2
            int r3 = r3 % r8
            r9 = 13
            r10 = 55624(0xd948, float:7.7946E-41)
            r11 = 1898160495(0x7123a16f, float:8.102595E29)
            if (r3 == 0) goto L_0x02ae
            char r0 = r1[r6]
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x02a5 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x02a5 }
            r3 = 1
            r1[r3] = r2     // Catch:{ all -> 0x02a5 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02a5 }
            r2 = 0
            r1[r2] = r0     // Catch:{ all -> 0x02a5 }
            java.util.Map<java.lang.Integer, java.lang.Object> r0 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x02a5 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x02a5 }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x02a5 }
            if (r2 == 0) goto L_0x0254
            goto L_0x0295
        L_0x0254:
            int r2 = android.os.Process.myTid()     // Catch:{ all -> 0x02a5 }
            int r2 = r2 >> 22
            int r10 = r10 - r2
            char r2 = (char) r10     // Catch:{ all -> 0x02a5 }
            int r3 = android.view.ViewConfiguration.getLongPressTimeout()     // Catch:{ all -> 0x02a5 }
            int r3 = r3 >> 16
            int r3 = 290 - r3
            r5 = 0
            int r7 = android.text.TextUtils.getOffsetAfter(r14, r5)     // Catch:{ all -> 0x02a5 }
            r8 = 31
            int r12 = 31 - r7
            java.lang.Object r2 = com.facetec.sdk.C2854bp.m11559b(r2, r3, r12)     // Catch:{ all -> 0x02a5 }
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ all -> 0x02a5 }
            byte r3 = (byte) r9     // Catch:{ all -> 0x02a5 }
            byte r7 = (byte) r5     // Catch:{ all -> 0x02a5 }
            byte r8 = (byte) r7     // Catch:{ all -> 0x02a5 }
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ all -> 0x02a5 }
            m11907ai(r3, r7, r8, r10)     // Catch:{ all -> 0x02a5 }
            r3 = r10[r5]     // Catch:{ all -> 0x02a5 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x02a5 }
            r7 = 2
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ all -> 0x02a5 }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ all -> 0x02a5 }
            r7[r5] = r8     // Catch:{ all -> 0x02a5 }
            r5 = 1
            r7[r5] = r8     // Catch:{ all -> 0x02a5 }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r7)     // Catch:{ all -> 0x02a5 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x02a5 }
            r0.put(r3, r2)     // Catch:{ all -> 0x02a5 }
        L_0x0295:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch:{ all -> 0x02a5 }
            r0 = 0
            java.lang.Object r1 = r2.invoke(r0, r1)     // Catch:{ all -> 0x02a5 }
            java.lang.Character r1 = (java.lang.Character) r1     // Catch:{ all -> 0x02a5 }
            char r1 = r1.charValue()     // Catch:{ all -> 0x02a5 }
            r4[r6] = r1
            throw r0
        L_0x02a5:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x02ad
            throw r1
        L_0x02ad:
            throw r0
        L_0x02ae:
            char r3 = r1[r6]
            r8 = 2
            java.lang.Object[] r12 = new java.lang.Object[r8]     // Catch:{ all -> 0x0399 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0399 }
            r8 = 1
            r12[r8] = r2     // Catch:{ all -> 0x0399 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0399 }
            r3 = 0
            r12[r3] = r2     // Catch:{ all -> 0x0399 }
            java.util.Map<java.lang.Integer, java.lang.Object> r2 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x0399 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0399 }
            java.lang.Object r8 = r2.get(r8)     // Catch:{ all -> 0x0399 }
            if (r8 == 0) goto L_0x02d0
            r17 = 31
            goto L_0x0313
        L_0x02d0:
            int r8 = android.view.View.resolveSizeAndState(r3, r3, r3)     // Catch:{ all -> 0x0399 }
            int r8 = r8 + r10
            char r8 = (char) r8     // Catch:{ all -> 0x0399 }
            int r10 = android.os.Process.getThreadPriority(r3)     // Catch:{ all -> 0x0399 }
            int r10 = r10 + 20
            r13 = 6
            int r10 = r10 >> r13
            int r10 = r10 + 290
            int r15 = android.view.View.getDefaultSize(r3, r3)     // Catch:{ all -> 0x0399 }
            r17 = 31
            int r15 = 31 - r15
            java.lang.Object r8 = com.facetec.sdk.C2854bp.m11559b(r8, r10, r15)     // Catch:{ all -> 0x0399 }
            java.lang.Class r8 = (java.lang.Class) r8     // Catch:{ all -> 0x0399 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x0399 }
            byte r10 = (byte) r3     // Catch:{ all -> 0x0399 }
            byte r15 = (byte) r10     // Catch:{ all -> 0x0399 }
            r13 = 1
            java.lang.Object[] r11 = new java.lang.Object[r13]     // Catch:{ all -> 0x0399 }
            m11907ai(r9, r10, r15, r11)     // Catch:{ all -> 0x0399 }
            r9 = r11[r3]     // Catch:{ all -> 0x0399 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0399 }
            r10 = 2
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ all -> 0x0399 }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0399 }
            r11[r3] = r10     // Catch:{ all -> 0x0399 }
            r3 = 1
            r11[r3] = r10     // Catch:{ all -> 0x0399 }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r11)     // Catch:{ all -> 0x0399 }
            r3 = 1898160495(0x7123a16f, float:8.102595E29)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0399 }
            r2.put(r3, r8)     // Catch:{ all -> 0x0399 }
        L_0x0313:
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch:{ all -> 0x0399 }
            r2 = 0
            java.lang.Object r3 = r8.invoke(r2, r12)     // Catch:{ all -> 0x0399 }
            java.lang.Character r3 = (java.lang.Character) r3     // Catch:{ all -> 0x0399 }
            char r2 = r3.charValue()     // Catch:{ all -> 0x0399 }
            r4[r6] = r2
        L_0x0322:
            int r2 = r5.f10463e
            char r2 = r4[r2]
            r3 = 2
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0390 }
            r3 = 1
            r6[r3] = r5     // Catch:{ all -> 0x0390 }
            r3 = 0
            r6[r3] = r5     // Catch:{ all -> 0x0390 }
            java.util.Map<java.lang.Integer, java.lang.Object> r8 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x0390 }
            r9 = -1824695553(0xffffffff933d5aff, float:-2.3900018E-27)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0390 }
            java.lang.Object r10 = r8.get(r10)     // Catch:{ all -> 0x0390 }
            if (r10 == 0) goto L_0x033f
            goto L_0x0388
        L_0x033f:
            r10 = 0
            float r11 = android.util.TypedValue.complexToFraction(r3, r10, r10)     // Catch:{ all -> 0x0390 }
            int r11 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            r12 = 61925(0xf1e5, float:8.6775E-41)
            int r11 = r11 + r12
            char r11 = (char) r11     // Catch:{ all -> 0x0390 }
            float r12 = android.media.AudioTrack.getMinVolume()     // Catch:{ all -> 0x0390 }
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            int r12 = r12 + 758
            int r13 = android.graphics.Color.rgb(r3, r3, r3)     // Catch:{ all -> 0x0390 }
            r3 = -16777192(0xffffffffff000018, float:-1.7014167E38)
            int r3 = r3 - r13
            java.lang.Object r3 = com.facetec.sdk.C2854bp.m11559b(r11, r12, r3)     // Catch:{ all -> 0x0390 }
            java.lang.Class r3 = (java.lang.Class) r3     // Catch:{ all -> 0x0390 }
            int r11 = $$e     // Catch:{ all -> 0x0390 }
            r12 = 1
            int r11 = r11 >>> r12
            byte r11 = (byte) r11     // Catch:{ all -> 0x0390 }
            r13 = 0
            byte r15 = (byte) r13     // Catch:{ all -> 0x0390 }
            byte r10 = (byte) r15     // Catch:{ all -> 0x0390 }
            java.lang.Object[] r9 = new java.lang.Object[r12]     // Catch:{ all -> 0x0390 }
            m11907ai(r11, r15, r10, r9)     // Catch:{ all -> 0x0390 }
            r9 = r9[r13]     // Catch:{ all -> 0x0390 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0390 }
            r10 = 2
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ all -> 0x0390 }
            r11[r13] = r21     // Catch:{ all -> 0x0390 }
            r10 = 1
            r11[r10] = r21     // Catch:{ all -> 0x0390 }
            java.lang.reflect.Method r10 = r3.getMethod(r9, r11)     // Catch:{ all -> 0x0390 }
            r3 = -1824695553(0xffffffff933d5aff, float:-2.3900018E-27)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0390 }
            r8.put(r3, r10)     // Catch:{ all -> 0x0390 }
        L_0x0388:
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10     // Catch:{ all -> 0x0390 }
            r3 = 0
            r10.invoke(r3, r6)     // Catch:{ all -> 0x0390 }
            goto L_0x018a
        L_0x0390:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0398
            throw r1
        L_0x0398:
            throw r0
        L_0x0399:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x03a1
            throw r1
        L_0x03a1:
            throw r0
        L_0x03a2:
            r1 = r4
        L_0x03a3:
            if (r20 <= 0) goto L_0x03a7
            r0 = 1
            goto L_0x03a8
        L_0x03a7:
            r0 = 0
        L_0x03a8:
            r2 = 1
            if (r0 == r2) goto L_0x03ac
            goto L_0x03bc
        L_0x03ac:
            char[] r0 = new char[r7]
            r2 = 0
            java.lang.System.arraycopy(r1, r2, r0, r2, r7)
            int r3 = r7 - r20
            r4 = r20
            java.lang.System.arraycopy(r0, r2, r1, r3, r4)
            java.lang.System.arraycopy(r0, r4, r1, r2, r3)
        L_0x03bc:
            if (r24 == 0) goto L_0x03ee
            int r0 = $11
            int r0 = r0 + 83
            int r2 = r0 % 128
            $10 = r2
            r2 = 2
            int r0 = r0 % r2
            if (r0 == 0) goto L_0x03cf
            r0 = 9
            r3 = 9
            goto L_0x03d2
        L_0x03cf:
            r0 = 9
            r3 = 6
        L_0x03d2:
            if (r3 == r0) goto L_0x03da
            char[] r0 = new char[r7]
            r2 = 0
        L_0x03d7:
            r5.f10463e = r2
            goto L_0x03de
        L_0x03da:
            r2 = 0
            char[] r0 = new char[r7]
            goto L_0x03d7
        L_0x03de:
            int r2 = r5.f10463e
            if (r2 >= r7) goto L_0x03ed
            int r3 = r7 - r2
            r4 = 1
            int r3 = r3 - r4
            char r3 = r1[r3]
            r0[r2] = r3
            int r2 = r2 + 1
            goto L_0x03d7
        L_0x03ed:
            r1 = r0
        L_0x03ee:
            if (r19 <= 0) goto L_0x0404
            r0 = 0
            goto L_0x0401
        L_0x03f2:
            int r0 = r5.f10463e
            if (r0 >= r7) goto L_0x0404
            char r2 = r1[r0]
            r3 = 2
            r4 = r22[r3]
            int r2 = r2 - r4
            char r2 = (char) r2
            r1[r0] = r2
            int r0 = r0 + 1
        L_0x0401:
            r5.f10463e = r0
            goto L_0x03f2
        L_0x0404:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            r1 = 0
            r25[r1] = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2888cg.m11902ad(int[], java.lang.String, boolean, java.lang.Object[]):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: ae */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11903ae(short r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 4
            int r7 = 1 - r7
            int r8 = r8 + 98
            int r9 = r9 + 4
            byte[] r0 = $$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L_0x0016
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r7
            goto L_0x0034
        L_0x0016:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L_0x001a:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L_0x002b
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L_0x002b:
            byte r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L_0x0034:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2888cg.m11903ae(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARNING: type inference failed for: r26v0, types: [java.lang.String] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: af */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11904af(java.lang.String r22, char r23, int r24, java.lang.String r25, java.lang.String r26, java.lang.Object[] r27) {
        /*
            int r0 = $11
            int r1 = r0 + 109
            int r2 = r1 % 128
            $10 = r2
            r2 = 2
            int r1 = r1 % r2
            r1 = 0
            if (r26 == 0) goto L_0x002b
            int r0 = r0 + 87
            int r3 = r0 % 128
            $10 = r3
            int r0 = r0 % r2
            r3 = 91
            if (r0 == 0) goto L_0x001a
            r0 = r3
            goto L_0x001c
        L_0x001a:
            r0 = 26
        L_0x001c:
            if (r0 == r3) goto L_0x0023
            char[] r0 = r26.toCharArray()
            goto L_0x002d
        L_0x0023:
            char[] r0 = r26.toCharArray()
            r3 = 68
            int r3 = r3 / r1
            goto L_0x002d
        L_0x002b:
            r0 = r26
        L_0x002d:
            char[] r0 = (char[]) r0
            r3 = 1
            if (r25 == 0) goto L_0x004f
            int r4 = $10
            int r4 = r4 + 123
            int r5 = r4 % 128
            $11 = r5
            int r4 = r4 % r2
            if (r4 != 0) goto L_0x003f
            r4 = r3
            goto L_0x0040
        L_0x003f:
            r4 = r1
        L_0x0040:
            if (r4 == 0) goto L_0x004a
            char[] r4 = r25.toCharArray()
            r5 = 22
            int r5 = r5 / r1
            goto L_0x0051
        L_0x004a:
            char[] r4 = r25.toCharArray()
            goto L_0x0051
        L_0x004f:
            r4 = r25
        L_0x0051:
            char[] r4 = (char[]) r4
            if (r22 == 0) goto L_0x0057
            r5 = r3
            goto L_0x0058
        L_0x0057:
            r5 = r1
        L_0x0058:
            r6 = 0
            if (r5 == 0) goto L_0x006f
            int r5 = $10
            int r5 = r5 + 81
            int r7 = r5 % 128
            $11 = r7
            int r5 = r5 % r2
            if (r5 == 0) goto L_0x006b
            char[] r5 = r22.toCharArray()
            goto L_0x0071
        L_0x006b:
            r22.toCharArray()
            throw r6
        L_0x006f:
            r5 = r22
        L_0x0071:
            char[] r5 = (char[]) r5
            com.facetec.sdk.gd r7 = new com.facetec.sdk.gd
            r7.<init>()
            int r8 = r4.length
            char[] r9 = new char[r8]
            int r10 = r5.length
            char[] r11 = new char[r10]
            java.lang.System.arraycopy(r4, r1, r9, r1, r8)
            java.lang.System.arraycopy(r5, r1, r11, r1, r10)
            char r4 = r9[r1]
            r4 = r4 ^ r23
            char r4 = (char) r4
            r9[r1] = r4
            char r4 = r11[r2]
            r5 = r24
            char r5 = (char) r5
            int r4 = r4 + r5
            char r4 = (char) r4
            r11[r2] = r4
            int r4 = r0.length
            char[] r5 = new char[r4]
            r7.f10440d = r1
        L_0x0099:
            int r8 = r7.f10440d
            if (r8 >= r4) goto L_0x02a3
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ all -> 0x029a }
            r8[r1] = r7     // Catch:{ all -> 0x029a }
            java.util.Map<java.lang.Integer, java.lang.Object> r10 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x029a }
            r12 = 1680236112(0x64265e50, float:1.2275822E22)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x029a }
            java.lang.Object r13 = r10.get(r13)     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r14 = java.lang.Object.class
            java.lang.String r15 = ""
            if (r13 == 0) goto L_0x00b5
            goto L_0x00dd
        L_0x00b5:
            int r13 = android.text.TextUtils.indexOf(r15, r15, r1, r1)     // Catch:{ all -> 0x029a }
            char r13 = (char) r13     // Catch:{ all -> 0x029a }
            int r2 = android.graphics.Color.green(r1)     // Catch:{ all -> 0x029a }
            int r2 = 1717 - r2
            int r16 = android.text.TextUtils.getCapsMode(r15, r1, r1)     // Catch:{ all -> 0x029a }
            int r6 = 24 - r16
            java.lang.Object r2 = com.facetec.sdk.C2854bp.m11559b(r13, r2, r6)     // Catch:{ all -> 0x029a }
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ all -> 0x029a }
            java.lang.String r6 = "B"
            java.lang.Class[] r13 = new java.lang.Class[r3]     // Catch:{ all -> 0x029a }
            r13[r1] = r14     // Catch:{ all -> 0x029a }
            java.lang.reflect.Method r13 = r2.getMethod(r6, r13)     // Catch:{ all -> 0x029a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x029a }
            r10.put(r2, r13)     // Catch:{ all -> 0x029a }
        L_0x00dd:
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13     // Catch:{ all -> 0x029a }
            r2 = 0
            java.lang.Object r6 = r13.invoke(r2, r8)     // Catch:{ all -> 0x029a }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x029a }
            int r2 = r6.intValue()     // Catch:{ all -> 0x029a }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0291 }
            r6[r1] = r7     // Catch:{ all -> 0x0291 }
            r8 = 1100178161(0x419362f1, float:18.423311)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0291 }
            java.lang.Object r12 = r10.get(r12)     // Catch:{ all -> 0x0291 }
            r16 = 0
            if (r12 == 0) goto L_0x0100
            r19 = r4
            goto L_0x0143
        L_0x0100:
            r12 = 0
            float r13 = android.graphics.PointF.length(r12, r12)     // Catch:{ all -> 0x0291 }
            int r12 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            r13 = 46018(0xb3c2, float:6.4485E-41)
            int r13 = r13 - r12
            char r12 = (char) r13     // Catch:{ all -> 0x0291 }
            long r18 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0291 }
            int r13 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            int r13 = 1336 - r13
            int r18 = android.view.ViewConfiguration.getKeyRepeatDelay()     // Catch:{ all -> 0x0291 }
            int r18 = r18 >> 16
            int r8 = r18 + 24
            java.lang.Object r8 = com.facetec.sdk.C2854bp.m11559b(r12, r13, r8)     // Catch:{ all -> 0x0291 }
            java.lang.Class r8 = (java.lang.Class) r8     // Catch:{ all -> 0x0291 }
            byte r12 = (byte) r1     // Catch:{ all -> 0x0291 }
            byte r13 = (byte) r12     // Catch:{ all -> 0x0291 }
            byte r1 = (byte) r13     // Catch:{ all -> 0x0291 }
            r19 = r4
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0291 }
            m11907ai(r12, r13, r1, r4)     // Catch:{ all -> 0x0291 }
            r1 = 0
            r4 = r4[r1]     // Catch:{ all -> 0x0291 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0291 }
            java.lang.Class[] r12 = new java.lang.Class[r3]     // Catch:{ all -> 0x0291 }
            r12[r1] = r14     // Catch:{ all -> 0x0291 }
            java.lang.reflect.Method r12 = r8.getMethod(r4, r12)     // Catch:{ all -> 0x0291 }
            r1 = 1100178161(0x419362f1, float:18.423311)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0291 }
            r10.put(r1, r12)     // Catch:{ all -> 0x0291 }
        L_0x0143:
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12     // Catch:{ all -> 0x0291 }
            r1 = 0
            java.lang.Object r4 = r12.invoke(r1, r6)     // Catch:{ all -> 0x0291 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0291 }
            int r1 = r4.intValue()     // Catch:{ all -> 0x0291 }
            int r4 = r7.f10440d
            int r4 = r4 % 4
            char r4 = r9[r4]
            int r4 = r4 * 32718
            char r6 = r11[r2]
            r8 = 3
            java.lang.Object[] r12 = new java.lang.Object[r8]     // Catch:{ all -> 0x0288 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0288 }
            r13 = 2
            r12[r13] = r6     // Catch:{ all -> 0x0288 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0288 }
            r12[r3] = r4     // Catch:{ all -> 0x0288 }
            r4 = 0
            r12[r4] = r7     // Catch:{ all -> 0x0288 }
            r4 = -267703454(0xfffffffff00b2b62, float:-1.7228345E29)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0288 }
            java.lang.Object r6 = r10.get(r6)     // Catch:{ all -> 0x0288 }
            if (r6 == 0) goto L_0x017b
            goto L_0x01c4
        L_0x017b:
            r6 = 48
            r13 = 0
            int r6 = android.text.TextUtils.lastIndexOf(r15, r6, r13)     // Catch:{ all -> 0x0288 }
            r15 = 33443(0x82a3, float:4.6864E-41)
            int r6 = r6 + r15
            char r6 = (char) r6     // Catch:{ all -> 0x0288 }
            long r20 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x0288 }
            int r15 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            int r15 = 712 - r15
            int r18 = android.view.KeyEvent.getDeadChar(r13, r13)     // Catch:{ all -> 0x0288 }
            int r4 = r18 + 24
            java.lang.Object r4 = com.facetec.sdk.C2854bp.m11559b(r6, r15, r4)     // Catch:{ all -> 0x0288 }
            java.lang.Class r4 = (java.lang.Class) r4     // Catch:{ all -> 0x0288 }
            r6 = 55
            byte r6 = (byte) r6     // Catch:{ all -> 0x0288 }
            byte r15 = (byte) r13     // Catch:{ all -> 0x0288 }
            byte r8 = (byte) r15     // Catch:{ all -> 0x0288 }
            java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ all -> 0x0288 }
            m11907ai(r6, r15, r8, r13)     // Catch:{ all -> 0x0288 }
            r6 = 0
            r8 = r13[r6]     // Catch:{ all -> 0x0288 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0288 }
            r13 = 3
            java.lang.Class[] r13 = new java.lang.Class[r13]     // Catch:{ all -> 0x0288 }
            r13[r6] = r14     // Catch:{ all -> 0x0288 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0288 }
            r13[r3] = r6     // Catch:{ all -> 0x0288 }
            r14 = 2
            r13[r14] = r6     // Catch:{ all -> 0x0288 }
            java.lang.reflect.Method r6 = r4.getMethod(r8, r13)     // Catch:{ all -> 0x0288 }
            r4 = -267703454(0xfffffffff00b2b62, float:-1.7228345E29)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0288 }
            r10.put(r4, r6)     // Catch:{ all -> 0x0288 }
        L_0x01c4:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch:{ all -> 0x0288 }
            r4 = 0
            r6.invoke(r4, r12)     // Catch:{ all -> 0x0288 }
            char r4 = r9[r1]
            int r4 = r4 * 32718
            char r2 = r11[r2]
            r6 = 2
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x027f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x027f }
            r8[r3] = r2     // Catch:{ all -> 0x027f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x027f }
            r4 = 0
            r8[r4] = r2     // Catch:{ all -> 0x027f }
            r2 = 1232845262(0x497bb9ce, float:1031068.9)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x027f }
            java.lang.Object r4 = r10.get(r4)     // Catch:{ all -> 0x027f }
            if (r4 == 0) goto L_0x01ee
            goto L_0x0233
        L_0x01ee:
            long r12 = android.view.ViewConfiguration.getGlobalActionKeyTimeout()     // Catch:{ all -> 0x027f }
            int r4 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            int r4 = r4 + 8635
            char r4 = (char) r4     // Catch:{ all -> 0x027f }
            r6 = 0
            double r12 = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(r6)     // Catch:{ all -> 0x027f }
            r14 = 0
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            int r12 = 1312 - r12
            int r13 = android.graphics.Color.argb(r6, r6, r6, r6)     // Catch:{ all -> 0x027f }
            int r13 = r13 + 23
            java.lang.Object r4 = com.facetec.sdk.C2854bp.m11559b(r4, r12, r13)     // Catch:{ all -> 0x027f }
            java.lang.Class r4 = (java.lang.Class) r4     // Catch:{ all -> 0x027f }
            int r6 = $$e     // Catch:{ all -> 0x027f }
            r6 = r6 | 32
            byte r6 = (byte) r6     // Catch:{ all -> 0x027f }
            r12 = 0
            byte r13 = (byte) r12     // Catch:{ all -> 0x027f }
            byte r14 = (byte) r13     // Catch:{ all -> 0x027f }
            java.lang.Object[] r15 = new java.lang.Object[r3]     // Catch:{ all -> 0x027f }
            m11907ai(r6, r13, r14, r15)     // Catch:{ all -> 0x027f }
            r6 = r15[r12]     // Catch:{ all -> 0x027f }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x027f }
            r13 = 2
            java.lang.Class[] r14 = new java.lang.Class[r13]     // Catch:{ all -> 0x027f }
            java.lang.Class r13 = java.lang.Integer.TYPE     // Catch:{ all -> 0x027f }
            r14[r12] = r13     // Catch:{ all -> 0x027f }
            r14[r3] = r13     // Catch:{ all -> 0x027f }
            java.lang.reflect.Method r4 = r4.getMethod(r6, r14)     // Catch:{ all -> 0x027f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x027f }
            r10.put(r2, r4)     // Catch:{ all -> 0x027f }
        L_0x0233:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch:{ all -> 0x027f }
            r2 = 0
            java.lang.Object r4 = r4.invoke(r2, r8)     // Catch:{ all -> 0x027f }
            java.lang.Character r4 = (java.lang.Character) r4     // Catch:{ all -> 0x027f }
            char r4 = r4.charValue()     // Catch:{ all -> 0x027f }
            r11[r1] = r4
            char r4 = r7.f10439c
            r9[r1] = r4
            int r1 = r7.f10440d
            char r6 = r0[r1]
            r4 = r4 ^ r6
            long r12 = (long) r4
            long r14 = f9539F
            r16 = 6283595281808556976(0x5733d09dec8503b0, double:1.1913256772855765E112)
            long r14 = r14 ^ r16
            long r12 = r12 ^ r14
            int r4 = f9541H
            long r14 = (long) r4
            long r14 = r14 ^ r16
            int r4 = (int) r14
            long r14 = (long) r4
            long r12 = r12 ^ r14
            char r4 = f9538E
            long r14 = (long) r4
            long r14 = r14 ^ r16
            int r4 = (int) r14
            char r4 = (char) r4
            long r14 = (long) r4
            long r12 = r12 ^ r14
            int r4 = (int) r12
            char r4 = (char) r4
            r5[r1] = r4
            int r1 = r1 + r3
            r7.f10440d = r1
            int r1 = $10
            int r1 = r1 + 37
            int r4 = r1 % 128
            $11 = r4
            r4 = 2
            int r1 = r1 % r4
            r6 = r2
            r2 = r4
            r4 = r19
            r1 = 0
            goto L_0x0099
        L_0x027f:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0287
            throw r1
        L_0x0287:
            throw r0
        L_0x0288:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0290
            throw r1
        L_0x0290:
            throw r0
        L_0x0291:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0299
            throw r1
        L_0x0299:
            throw r0
        L_0x029a:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x02a2
            throw r1
        L_0x02a2:
            throw r0
        L_0x02a3:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5)
            r1 = 0
            r27[r1] = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2888cg.m11904af(java.lang.String, char, int, java.lang.String, java.lang.String, java.lang.Object[]):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: ag */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11905ag(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = 228 - r9
            int r8 = 443 - r8
            byte[] r0 = f9552d
            int r7 = 118 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L_0x0014
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            goto L_0x002f
        L_0x0014:
            r3 = r2
        L_0x0015:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L_0x0024
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L_0x0024:
            int r8 = r8 + 1
            byte r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L_0x002f:
            int r7 = r7 + r8
            r8 = r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2888cg.m11905ag(int, short, int, java.lang.Object[]):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0298, code lost:
        throw null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: ah */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11906ah(java.lang.String r18, int[] r19, int r20, java.lang.String r21, java.lang.Object[] r22) {
        /*
            r0 = r19
            r1 = r21
            java.lang.String r2 = ""
            int r3 = $11
            int r3 = r3 + 27
            int r4 = r3 % 128
            $10 = r4
            r4 = 2
            int r3 = r3 % r4
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x0016
            r3 = r6
            goto L_0x0017
        L_0x0016:
            r3 = r5
        L_0x0017:
            if (r3 == 0) goto L_0x0297
            if (r1 == 0) goto L_0x0021
            java.lang.String r3 = "ISO-8859-1"
            byte[] r1 = r1.getBytes(r3)
        L_0x0021:
            byte[] r1 = (byte[]) r1
            if (r18 == 0) goto L_0x002a
            char[] r3 = r18.toCharArray()
            goto L_0x002c
        L_0x002a:
            r3 = r18
        L_0x002c:
            char[] r3 = (char[]) r3
            com.facetec.sdk.gg r8 = new com.facetec.sdk.gg
            r8.<init>()
            char[] r9 = f9543K
            if (r9 == 0) goto L_0x00c6
            int r10 = r9.length
            char[] r11 = new char[r10]
            r12 = r6
        L_0x003b:
            r13 = 98
            if (r12 >= r10) goto L_0x0042
            r14 = 70
            goto L_0x0043
        L_0x0042:
            r14 = r13
        L_0x0043:
            if (r14 == r13) goto L_0x00c4
            char r13 = r9[r12]
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x00bb }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x00bb }
            r14[r6] = r13     // Catch:{ all -> 0x00bb }
            java.util.Map<java.lang.Integer, java.lang.Object> r13 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x00bb }
            r15 = -1321001135(0xffffffffb1431f51, float:-2.8394036E-9)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x00bb }
            java.lang.Object r4 = r13.get(r4)     // Catch:{ all -> 0x00bb }
            if (r4 == 0) goto L_0x0061
            r21 = r9
            goto L_0x00a5
        L_0x0061:
            int r4 = android.view.KeyEvent.normalizeMetaState(r6)     // Catch:{ all -> 0x00bb }
            char r4 = (char) r4     // Catch:{ all -> 0x00bb }
            float r16 = android.media.AudioTrack.getMinVolume()     // Catch:{ all -> 0x00bb }
            r17 = 0
            int r7 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            int r7 = r7 + 886
            int r16 = android.os.Process.getThreadPriority(r6)     // Catch:{ all -> 0x00bb }
            int r16 = r16 + 20
            int r16 = r16 >> 6
            int r15 = 23 - r16
            java.lang.Object r4 = com.facetec.sdk.C2854bp.m11559b(r4, r7, r15)     // Catch:{ all -> 0x00bb }
            java.lang.Class r4 = (java.lang.Class) r4     // Catch:{ all -> 0x00bb }
            int r7 = $$e     // Catch:{ all -> 0x00bb }
            byte r7 = (byte) r7     // Catch:{ all -> 0x00bb }
            byte r15 = (byte) r6     // Catch:{ all -> 0x00bb }
            byte r6 = (byte) r15     // Catch:{ all -> 0x00bb }
            r21 = r9
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x00bb }
            m11907ai(r7, r15, r6, r9)     // Catch:{ all -> 0x00bb }
            r6 = 0
            r7 = r9[r6]     // Catch:{ all -> 0x00bb }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x00bb }
            java.lang.Class[] r9 = new java.lang.Class[r5]     // Catch:{ all -> 0x00bb }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00bb }
            r9[r6] = r15     // Catch:{ all -> 0x00bb }
            java.lang.reflect.Method r4 = r4.getMethod(r7, r9)     // Catch:{ all -> 0x00bb }
            r6 = -1321001135(0xffffffffb1431f51, float:-2.8394036E-9)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00bb }
            r13.put(r6, r4)     // Catch:{ all -> 0x00bb }
        L_0x00a5:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch:{ all -> 0x00bb }
            r6 = 0
            java.lang.Object r4 = r4.invoke(r6, r14)     // Catch:{ all -> 0x00bb }
            java.lang.Character r4 = (java.lang.Character) r4     // Catch:{ all -> 0x00bb }
            char r4 = r4.charValue()     // Catch:{ all -> 0x00bb }
            r11[r12] = r4
            int r12 = r12 + 1
            r9 = r21
            r4 = 2
            r6 = 0
            goto L_0x003b
        L_0x00bb:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x00c3
            throw r1
        L_0x00c3:
            throw r0
        L_0x00c4:
            r9 = r11
            goto L_0x00c8
        L_0x00c6:
            r21 = r9
        L_0x00c8:
            int r4 = f9544L
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x028e }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x028e }
            r7 = 0
            r6[r7] = r4     // Catch:{ all -> 0x028e }
            java.util.Map<java.lang.Integer, java.lang.Object> r4 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x028e }
            r7 = 2101371298(0x7d4061a2, float:1.598242E37)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x028e }
            java.lang.Object r10 = r4.get(r10)     // Catch:{ all -> 0x028e }
            if (r10 == 0) goto L_0x00e3
            goto L_0x0121
        L_0x00e3:
            int r10 = android.view.ViewConfiguration.getKeyRepeatTimeout()     // Catch:{ all -> 0x028e }
            int r10 = r10 >> 16
            int r10 = r10 + 20121
            char r10 = (char) r10     // Catch:{ all -> 0x028e }
            r11 = 0
            int r12 = android.view.View.resolveSizeAndState(r11, r11, r11)     // Catch:{ all -> 0x028e }
            int r12 = r12 + 242
            int r11 = android.view.ViewConfiguration.getLongPressTimeout()     // Catch:{ all -> 0x028e }
            int r11 = r11 >> 16
            int r11 = r11 + 24
            java.lang.Object r10 = com.facetec.sdk.C2854bp.m11559b(r10, r12, r11)     // Catch:{ all -> 0x028e }
            java.lang.Class r10 = (java.lang.Class) r10     // Catch:{ all -> 0x028e }
            r11 = 19
            byte r11 = (byte) r11     // Catch:{ all -> 0x028e }
            r12 = 0
            byte r13 = (byte) r12     // Catch:{ all -> 0x028e }
            byte r14 = (byte) r13     // Catch:{ all -> 0x028e }
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ all -> 0x028e }
            m11907ai(r11, r13, r14, r15)     // Catch:{ all -> 0x028e }
            r11 = r15[r12]     // Catch:{ all -> 0x028e }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x028e }
            java.lang.Class[] r13 = new java.lang.Class[r5]     // Catch:{ all -> 0x028e }
            java.lang.Class r14 = java.lang.Integer.TYPE     // Catch:{ all -> 0x028e }
            r13[r12] = r14     // Catch:{ all -> 0x028e }
            java.lang.reflect.Method r10 = r10.getMethod(r11, r13)     // Catch:{ all -> 0x028e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x028e }
            r4.put(r7, r10)     // Catch:{ all -> 0x028e }
        L_0x0121:
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10     // Catch:{ all -> 0x028e }
            r4 = 0
            java.lang.Object r6 = r10.invoke(r4, r6)     // Catch:{ all -> 0x028e }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x028e }
            int r4 = r6.intValue()     // Catch:{ all -> 0x028e }
            boolean r6 = f9545M
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r10 = -1517498542(0xffffffffa58ccf52, float:-2.4426614E-16)
            if (r6 == 0) goto L_0x01c0
            int r0 = r1.length
            r8.f10445d = r0
            char[] r0 = new char[r0]
            r2 = 0
            r8.f10444a = r2
        L_0x013f:
            int r2 = r8.f10444a
            int r3 = r8.f10445d
            if (r2 >= r3) goto L_0x01b7
            int r3 = r3 + -1
            int r3 = r3 - r2
            byte r3 = r1[r3]
            int r3 = r3 + r20
            char r3 = r9[r3]
            int r3 = r3 - r4
            char r3 = (char) r3
            r0[r2] = r3
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x01ae }
            r3[r5] = r8     // Catch:{ all -> 0x01ae }
            r2 = 0
            r3[r2] = r8     // Catch:{ all -> 0x01ae }
            java.util.Map<java.lang.Integer, java.lang.Object> r2 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x01ae }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x01ae }
            java.lang.Object r6 = r2.get(r6)     // Catch:{ all -> 0x01ae }
            if (r6 == 0) goto L_0x0167
            goto L_0x01a7
        L_0x0167:
            long r11 = android.view.ViewConfiguration.getZoomControlsTimeout()     // Catch:{ all -> 0x01ae }
            r13 = 0
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            int r6 = 1 - r6
            char r6 = (char) r6     // Catch:{ all -> 0x01ae }
            r11 = 0
            int r12 = android.view.KeyEvent.getDeadChar(r11, r11)     // Catch:{ all -> 0x01ae }
            int r12 = 782 - r12
            int r13 = android.view.KeyEvent.getDeadChar(r11, r11)     // Catch:{ all -> 0x01ae }
            int r13 = 24 - r13
            java.lang.Object r6 = com.facetec.sdk.C2854bp.m11559b(r6, r12, r13)     // Catch:{ all -> 0x01ae }
            java.lang.Class r6 = (java.lang.Class) r6     // Catch:{ all -> 0x01ae }
            int r12 = $$e     // Catch:{ all -> 0x01ae }
            r12 = r12 & 119(0x77, float:1.67E-43)
            byte r12 = (byte) r12     // Catch:{ all -> 0x01ae }
            byte r13 = (byte) r11     // Catch:{ all -> 0x01ae }
            byte r14 = (byte) r13     // Catch:{ all -> 0x01ae }
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ all -> 0x01ae }
            m11907ai(r12, r13, r14, r15)     // Catch:{ all -> 0x01ae }
            r12 = r15[r11]     // Catch:{ all -> 0x01ae }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x01ae }
            r13 = 2
            java.lang.Class[] r14 = new java.lang.Class[r13]     // Catch:{ all -> 0x01ae }
            r14[r11] = r7     // Catch:{ all -> 0x01ae }
            r14[r5] = r7     // Catch:{ all -> 0x01ae }
            java.lang.reflect.Method r6 = r6.getMethod(r12, r14)     // Catch:{ all -> 0x01ae }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x01ae }
            r2.put(r11, r6)     // Catch:{ all -> 0x01ae }
        L_0x01a7:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch:{ all -> 0x01ae }
            r2 = 0
            r6.invoke(r2, r3)     // Catch:{ all -> 0x01ae }
            goto L_0x013f
        L_0x01ae:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x01b6
            throw r1
        L_0x01b6:
            throw r0
        L_0x01b7:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = 0
            r22[r0] = r1
            return
        L_0x01c0:
            boolean r1 = f9542J
            if (r1 == 0) goto L_0x0267
            int r0 = $11
            int r0 = r0 + 109
            int r1 = r0 % 128
            $10 = r1
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x01d2
            r0 = 0
            goto L_0x01d3
        L_0x01d2:
            r0 = r5
        L_0x01d3:
            if (r0 == r5) goto L_0x01dd
            int r0 = r3.length
            r8.f10445d = r0
            char[] r0 = new char[r0]
            r8.f10444a = r5
            goto L_0x01e5
        L_0x01dd:
            int r0 = r3.length
            r8.f10445d = r0
            char[] r0 = new char[r0]
            r1 = 0
            r8.f10444a = r1
        L_0x01e5:
            int r1 = r8.f10444a
            int r6 = r8.f10445d
            if (r1 >= r6) goto L_0x025e
            int r6 = r6 + -1
            int r6 = r6 - r1
            char r6 = r3[r6]
            int r6 = r6 - r20
            char r6 = r9[r6]
            int r6 = r6 - r4
            char r6 = (char) r6
            r0[r1] = r6
            r1 = 2
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0255 }
            r6[r5] = r8     // Catch:{ all -> 0x0255 }
            r1 = 0
            r6[r1] = r8     // Catch:{ all -> 0x0255 }
            java.util.Map<java.lang.Integer, java.lang.Object> r11 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x0255 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0255 }
            java.lang.Object r12 = r11.get(r12)     // Catch:{ all -> 0x0255 }
            if (r12 == 0) goto L_0x020f
            r1 = r12
            r12 = 2
            goto L_0x024e
        L_0x020f:
            int r12 = android.view.KeyEvent.normalizeMetaState(r1)     // Catch:{ all -> 0x0255 }
            char r12 = (char) r12     // Catch:{ all -> 0x0255 }
            int r13 = android.text.TextUtils.indexOf(r2, r2, r1)     // Catch:{ all -> 0x0255 }
            int r13 = r13 + 782
            r1 = 48
            char r1 = android.text.AndroidCharacter.getMirror(r1)     // Catch:{ all -> 0x0255 }
            int r1 = 72 - r1
            java.lang.Object r1 = com.facetec.sdk.C2854bp.m11559b(r12, r13, r1)     // Catch:{ all -> 0x0255 }
            java.lang.Class r1 = (java.lang.Class) r1     // Catch:{ all -> 0x0255 }
            int r12 = $$e     // Catch:{ all -> 0x0255 }
            r12 = r12 & 119(0x77, float:1.67E-43)
            byte r12 = (byte) r12     // Catch:{ all -> 0x0255 }
            r13 = 0
            byte r14 = (byte) r13     // Catch:{ all -> 0x0255 }
            byte r15 = (byte) r14     // Catch:{ all -> 0x0255 }
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x0255 }
            m11907ai(r12, r14, r15, r10)     // Catch:{ all -> 0x0255 }
            r10 = r10[r13]     // Catch:{ all -> 0x0255 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0255 }
            r12 = 2
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ all -> 0x0255 }
            r14[r13] = r7     // Catch:{ all -> 0x0255 }
            r14[r5] = r7     // Catch:{ all -> 0x0255 }
            java.lang.reflect.Method r1 = r1.getMethod(r10, r14)     // Catch:{ all -> 0x0255 }
            r10 = -1517498542(0xffffffffa58ccf52, float:-2.4426614E-16)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0255 }
            r11.put(r13, r1)     // Catch:{ all -> 0x0255 }
        L_0x024e:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch:{ all -> 0x0255 }
            r11 = 0
            r1.invoke(r11, r6)     // Catch:{ all -> 0x0255 }
            goto L_0x01e5
        L_0x0255:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x025d
            throw r1
        L_0x025d:
            throw r0
        L_0x025e:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r2 = 0
            r22[r2] = r1
            return
        L_0x0267:
            r2 = 0
            int r1 = r0.length
            r8.f10445d = r1
            char[] r1 = new char[r1]
        L_0x026d:
            r8.f10444a = r2
            int r2 = r8.f10444a
            int r3 = r8.f10445d
            if (r2 >= r3) goto L_0x0285
            int r3 = r3 + -1
            int r3 = r3 - r2
            r3 = r0[r3]
            int r3 = r3 - r20
            char r3 = r9[r3]
            int r3 = r3 - r4
            char r3 = (char) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L_0x026d
        L_0x0285:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            r1 = 0
            r22[r1] = r0
            return
        L_0x028e:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0296
            throw r1
        L_0x0296:
            throw r0
        L_0x0297:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2888cg.m11906ah(java.lang.String, int[], int, java.lang.String, java.lang.Object[]):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* renamed from: ai */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11907ai(byte r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r6 = r6 * 3
            int r6 = 3 - r6
            byte[] r0 = $$d
            int r5 = 122 - r5
            byte[] r1 = new byte[r7]
            r2 = -1
            int r7 = r7 + r2
            if (r0 != 0) goto L_0x0019
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r8
            r8 = r7
            r7 = r6
            goto L_0x0035
        L_0x0019:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r1[r2] = r3
            if (r2 != r7) goto L_0x0029
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L_0x0029:
            int r6 = r6 + 1
            byte r3 = r0[r6]
            r4 = r7
            r7 = r6
            r6 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r8
            r8 = r4
        L_0x0035:
            int r5 = r5 + r6
            r6 = r7
            r7 = r8
            r8 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2888cg.m11907ai(byte, int, short, java.lang.Object[]):void");
    }

    /* renamed from: d */
    static synchronized C2888cg m11917d(Activity activity) {
        synchronized (C2888cg.class) {
            int i = f9548S + 97;
            f9547O = i % 128;
            if ((i % 2 == 0 ? '>' : '^') == '^') {
                if (f9553e == null) {
                    f9553e = new C2888cg(activity);
                    boolean d = C2885cd.m11830d((Context) activity);
                    if ((!f9540G ? 'O' : '&') == 'O') {
                        if (!d) {
                            throw new AssertionError();
                        }
                    }
                }
                C2888cg cgVar = f9553e;
                int i2 = f9548S + 97;
                f9547O = i2 % 128;
                if (i2 % 2 != 0) {
                    return cgVar;
                }
                int i3 = 30 / 0;
                return cgVar;
            }
            throw null;
        }
    }

    /* renamed from: f */
    static void m11923f() {
        int i = f9547O + 31;
        f9548S = i % 128;
        int i2 = i % 2;
        f9551c = UUID.randomUUID().toString();
        int i3 = f9548S + 51;
        f9547O = i3 % 128;
        if (!(i3 % 2 != 0)) {
            int i4 = 72 / 0;
        }
    }

    static void init$0() {
        $$a = new byte[]{69, 58, 55, -60};
        $$b = 186;
    }

    static void init$1() {
        $$d = new byte[]{50, 15, -98, 104};
        $$e = 25;
    }

    /* renamed from: m */
    static boolean m11931m() {
        int i = f9548S + 49;
        f9547O = i % 128;
        int i2 = i % 2;
        boolean aa = C2885cd.m11797aa();
        int i3 = f9548S + 57;
        f9547O = i3 % 128;
        int i4 = i3 % 2;
        return aa;
    }

    /* renamed from: n */
    static void m11933n() {
        int i = f9547O;
        int i2 = i + 61;
        f9548S = i2 % 128;
        char c = i2 % 2 != 0 ? 'P' : 'J';
        boolean z = false;
        f9538E = 56375;
        f9539F = 6283595281808556976L;
        f9541H = -326827088;
        if (c == 'P') {
            int i3 = 29 / 0;
        }
        int i4 = i + 65;
        f9548S = i4 % 128;
        if (i4 % 2 != 0) {
            z = true;
        }
        if (z) {
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0243 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0244  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11936p() {
        /*
            int r0 = f9547O
            int r0 = r0 + 71
            int r1 = r0 % 128
            f9548S = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0010
            r0 = r2
            goto L_0x0011
        L_0x0010:
            r0 = r3
        L_0x0011:
            r4 = 0
            if (r0 == r2) goto L_0x029a
            int r0 = android.graphics.drawable.Drawable.resolveOpacity(r3, r3)     // Catch:{ Exception -> 0x02ce }
            int r0 = 20121 - r0
            char r0 = (char) r0     // Catch:{ Exception -> 0x02ce }
            int r5 = android.view.View.MeasureSpec.getSize(r3)     // Catch:{ Exception -> 0x02ce }
            int r5 = r5 + 242
            int r6 = android.view.ViewConfiguration.getTouchSlop()     // Catch:{ Exception -> 0x02ce }
            r7 = 8
            int r6 = r6 >> r7
            int r6 = r6 + 24
            java.lang.Object r0 = com.facetec.sdk.C2854bp.m11559b(r0, r5, r6)     // Catch:{ Exception -> 0x02ce }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ Exception -> 0x02ce }
            byte r5 = (byte) r3     // Catch:{ Exception -> 0x02ce }
            int r6 = r5 + 1
            byte r6 = (byte) r6     // Catch:{ Exception -> 0x02ce }
            int r8 = -r6
            byte r8 = (byte) r8     // Catch:{ Exception -> 0x02ce }
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x02ce }
            m11903ae(r5, r6, r8, r9)     // Catch:{ Exception -> 0x02ce }
            r5 = r9[r3]     // Catch:{ Exception -> 0x02ce }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x02ce }
            java.lang.reflect.Field r0 = r0.getField(r5)     // Catch:{ Exception -> 0x02ce }
            long r5 = r0.getLong(r4)     // Catch:{ Exception -> 0x02ce }
            r8 = -1
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            r8 = 23
            if (r0 == 0) goto L_0x0051
            r0 = r8
            goto L_0x0053
        L_0x0051:
            r0 = 77
        L_0x0053:
            r9 = -699924392(0xffffffffd6480058, float:-5.497595E13)
            r10 = 48
            java.lang.String r11 = ""
            r12 = 0
            if (r0 == r8) goto L_0x005f
            goto L_0x0102
        L_0x005f:
            r13 = 1892(0x764, double:9.35E-321)
            long r5 = r5 + r13
            java.lang.String r13 = "\u0000\u0000\u0000\u0000"
            float r0 = android.media.AudioTrack.getMaxVolume()     // Catch:{ Exception -> 0x02ce }
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            int r0 = 1 - r0
            char r14 = (char) r0     // Catch:{ Exception -> 0x02ce }
            int r0 = android.text.TextUtils.indexOf(r11, r10)     // Catch:{ Exception -> 0x02ce }
            int r15 = r0 + 1
            java.lang.String r16 = "??ѳ"
            java.lang.String r17 = "ﶫ夡춓錜⶚徝㯎࿧מ嫫椏㭕籶亜咨扭೒뵜ﴴꭄៅ"
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x02ce }
            r18 = r0
            m11904af(r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x02ce }
            r0 = r0[r3]     // Catch:{ Exception -> 0x02ce }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x02ce }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x02ce }
            java.lang.String r13 = "\u0000\u0000\u0000\u0000"
            int r8 = android.text.TextUtils.lastIndexOf(r11, r10, r3)     // Catch:{ Exception -> 0x02ce }
            r14 = 49540(0xc184, float:6.942E-41)
            int r8 = r8 + r14
            char r14 = (char) r8     // Catch:{ Exception -> 0x02ce }
            char r8 = android.text.AndroidCharacter.getMirror(r10)     // Catch:{ Exception -> 0x02ce }
            int r15 = r8 + r9
            java.lang.String r16 = "蠆䠀菖䛁"
            java.lang.String r17 = "隠祟♗䷔롏क츥⽺柟搽㩍㘤鱗ね"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x02ce }
            r18 = r8
            m11904af(r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x02ce }
            r8 = r8[r3]     // Catch:{ Exception -> 0x02ce }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x02ce }
            java.lang.Class[] r13 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x02ce }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r8, r13)     // Catch:{ Exception -> 0x02ce }
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x02ce }
            java.lang.Object r0 = r0.invoke(r4, r8)     // Catch:{ Exception -> 0x02ce }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x02ce }
            long r13 = r0.longValue()     // Catch:{ Exception -> 0x02ce }
            int r0 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            r5 = 85
            if (r0 < 0) goto L_0x00c1
            r0 = 53
            goto L_0x00c2
        L_0x00c1:
            r0 = r5
        L_0x00c2:
            if (r0 == r5) goto L_0x0102
            int r0 = f9547O
            int r0 = r0 + 63
            int r5 = r0 % 128
            f9548S = r5
            int r0 = r0 % r1
            float r0 = android.graphics.PointF.length(r12, r12)
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            int r0 = 20121 - r0
            char r0 = (char) r0
            int r5 = android.view.View.resolveSizeAndState(r3, r3, r3)
            int r5 = r5 + 242
            int r6 = android.view.View.resolveSizeAndState(r3, r3, r3)
            int r6 = 24 - r6
            java.lang.Object r0 = com.facetec.sdk.C2854bp.m11559b(r0, r5, r6)
            java.lang.Class r0 = (java.lang.Class) r0
            byte r5 = (byte) r3
            byte r6 = (byte) r5
            int r8 = r6 + -1
            byte r8 = (byte) r8
            java.lang.Object[] r9 = new java.lang.Object[r2]
            m11903ae(r5, r6, r8, r9)
            r5 = r9[r3]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.reflect.Field r0 = r0.getField(r5)
            java.lang.Object r0 = r0.get(r4)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L_0x0235
        L_0x0102:
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ all -> 0x0291 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0291 }
            r0[r2] = r5     // Catch:{ all -> 0x0291 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0291 }
            r0[r3] = r5     // Catch:{ all -> 0x0291 }
            java.util.Map<java.lang.Integer, java.lang.Object> r5 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x0291 }
            r6 = 140061824(0x8592c80, float:6.535337E-34)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0291 }
            java.lang.Object r8 = r5.get(r8)     // Catch:{ all -> 0x0291 }
            if (r8 == 0) goto L_0x0120
            goto L_0x015e
        L_0x0120:
            int r8 = android.graphics.Color.alpha(r3)     // Catch:{ all -> 0x0291 }
            int r8 = 20121 - r8
            char r8 = (char) r8     // Catch:{ all -> 0x0291 }
            int r13 = android.view.ViewConfiguration.getKeyRepeatDelay()     // Catch:{ all -> 0x0291 }
            int r13 = r13 >> 16
            int r13 = r13 + 242
            int r14 = android.text.TextUtils.indexOf(r11, r11, r3, r3)     // Catch:{ all -> 0x0291 }
            int r14 = r14 + 24
            java.lang.Object r8 = com.facetec.sdk.C2854bp.m11559b(r8, r13, r14)     // Catch:{ all -> 0x0291 }
            java.lang.Class r8 = (java.lang.Class) r8     // Catch:{ all -> 0x0291 }
            byte r13 = (byte) r3     // Catch:{ all -> 0x0291 }
            int r14 = r13 + 2
            byte r14 = (byte) r14     // Catch:{ all -> 0x0291 }
            int r15 = r14 + -3
            byte r15 = (byte) r15     // Catch:{ all -> 0x0291 }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0291 }
            m11903ae(r13, r14, r15, r7)     // Catch:{ all -> 0x0291 }
            r7 = r7[r3]     // Catch:{ all -> 0x0291 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0291 }
            java.lang.Class[] r13 = new java.lang.Class[r1]     // Catch:{ all -> 0x0291 }
            java.lang.Class r14 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0291 }
            r13[r3] = r14     // Catch:{ all -> 0x0291 }
            r13[r2] = r14     // Catch:{ all -> 0x0291 }
            java.lang.reflect.Method r8 = r8.getMethod(r7, r13)     // Catch:{ all -> 0x0291 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0291 }
            r5.put(r6, r8)     // Catch:{ all -> 0x0291 }
        L_0x015e:
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch:{ all -> 0x0291 }
            java.lang.Object r0 = r8.invoke(r4, r0)     // Catch:{ all -> 0x0291 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0291 }
            int r5 = android.view.ViewConfiguration.getJumpTapTimeout()
            int r5 = r5 >> 16
            int r5 = r5 + 20121
            char r5 = (char) r5
            int r6 = android.view.KeyEvent.normalizeMetaState(r3)
            int r6 = 242 - r6
            long r7 = android.os.SystemClock.elapsedRealtimeNanos()
            r13 = 0
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            int r7 = 25 - r7
            java.lang.Object r5 = com.facetec.sdk.C2854bp.m11559b(r5, r6, r7)
            java.lang.Class r5 = (java.lang.Class) r5
            byte r6 = (byte) r3
            byte r7 = (byte) r6
            int r8 = r7 + -1
            byte r8 = (byte) r8
            java.lang.Object[] r15 = new java.lang.Object[r2]
            m11903ae(r6, r7, r8, r15)
            r7 = r15[r3]
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r5 = r5.getField(r7)
            r5.set(r4, r0)
            java.lang.String r17 = "\u0000\u0000\u0000\u0000"
            long r7 = android.view.ViewConfiguration.getZoomControlsTimeout()     // Catch:{ Exception -> 0x028b }
            int r5 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            int r5 = r5 + -1
            char r5 = (char) r5     // Catch:{ Exception -> 0x028b }
            float r7 = android.graphics.PointF.length(r12, r12)     // Catch:{ Exception -> 0x028b }
            int r19 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            java.lang.String r20 = "??ѳ"
            java.lang.String r21 = "ﶫ夡춓錜⶚徝㯎࿧מ嫫椏㭕籶亜咨扭೒뵜ﴴꭄៅ"
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x028b }
            r18 = r5
            r22 = r7
            m11904af(r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x028b }
            r5 = r7[r3]     // Catch:{ Exception -> 0x028b }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x028b }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ Exception -> 0x028b }
            java.lang.String r17 = "\u0000\u0000\u0000\u0000"
            int r7 = android.view.ViewConfiguration.getKeyRepeatTimeout()     // Catch:{ Exception -> 0x028b }
            int r7 = r7 >> 16
            r8 = 49539(0xc183, float:6.9419E-41)
            int r8 = r8 - r7
            char r7 = (char) r8     // Catch:{ Exception -> 0x028b }
            char r8 = android.text.AndroidCharacter.getMirror(r10)     // Catch:{ Exception -> 0x028b }
            int r19 = r8 + r9
            java.lang.String r20 = "蠆䠀菖䛁"
            java.lang.String r21 = "隠祟♗䷔롏क츥⽺柟搽㩍㘤鱗ね"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x028b }
            r18 = r7
            r22 = r8
            m11904af(r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x028b }
            r7 = r8[r3]     // Catch:{ Exception -> 0x028b }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x028b }
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x028b }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r7, r8)     // Catch:{ Exception -> 0x028b }
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x028b }
            java.lang.Object r5 = r5.invoke(r4, r7)     // Catch:{ Exception -> 0x028b }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ Exception -> 0x028b }
            long r7 = r5.longValue()     // Catch:{ Exception -> 0x028b }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            int r7 = android.view.ViewConfiguration.getScrollBarSize()
            r8 = 8
            int r7 = r7 >> r8
            int r7 = r7 + 20121
            char r7 = (char) r7
            int r8 = android.view.KeyEvent.getModifierMetaStateMask()
            byte r8 = (byte) r8
            int r8 = 241 - r8
            int r9 = android.text.TextUtils.getOffsetBefore(r11, r3)
            int r9 = 24 - r9
            java.lang.Object r7 = com.facetec.sdk.C2854bp.m11559b(r7, r8, r9)
            java.lang.Class r7 = (java.lang.Class) r7
            int r8 = r6 + 1
            byte r8 = (byte) r8
            int r9 = -r8
            byte r9 = (byte) r9
            java.lang.Object[] r10 = new java.lang.Object[r2]
            m11903ae(r6, r8, r9, r10)
            r6 = r10[r3]
            java.lang.String r6 = (java.lang.String) r6
            java.lang.reflect.Field r6 = r7.getField(r6)
            r6.set(r4, r5)
            int r4 = f9547O
            int r4 = r4 + 45
            int r5 = r4 % 128
            f9548S = r5
            int r4 = r4 % r1
        L_0x0235:
            r2 = r0[r2]
            int[] r2 = (int[]) r2
            r2 = r2[r3]
            r4 = r0[r3]
            int[] r4 = (int[]) r4
            r3 = r4[r3]
            if (r3 != r2) goto L_0x0244
            return
        L_0x0244:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1 = r0[r1]
            java.lang.String r1 = (java.lang.String) r1
            r2.add(r1)
            r1 = 3
            r1 = r0[r1]
            java.lang.String r1 = (java.lang.String) r1
            r2.add(r1)
            r1 = 4
            r1 = r0[r1]
            java.lang.String r1 = (java.lang.String) r1
            r2.add(r1)
            r1 = 5
            r1 = r0[r1]
            java.lang.String r1 = (java.lang.String) r1
            r2.add(r1)
            r1 = 6
            r1 = r0[r1]
            java.lang.String r1 = (java.lang.String) r1
            r2.add(r1)
            r1 = 7
            r1 = r0[r1]
            java.lang.String r1 = (java.lang.String) r1
            r2.add(r1)
            r1 = 8
            r0 = r0[r1]
            java.lang.String r0 = (java.lang.String) r0
            r2.add(r0)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = java.lang.String.valueOf(r3)
            r0.<init>(r1)
            throw r0
        L_0x028b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L_0x0291:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0299
            throw r1
        L_0x0299:
            throw r0
        L_0x029a:
            int r0 = android.view.KeyEvent.normalizeMetaState(r3)     // Catch:{ Exception -> 0x02ce }
            int r0 = 20121 - r0
            char r0 = (char) r0     // Catch:{ Exception -> 0x02ce }
            int r1 = android.view.KeyEvent.getModifierMetaStateMask()     // Catch:{ Exception -> 0x02ce }
            byte r1 = (byte) r1     // Catch:{ Exception -> 0x02ce }
            int r1 = 241 - r1
            int r5 = android.graphics.drawable.Drawable.resolveOpacity(r3, r3)     // Catch:{ Exception -> 0x02ce }
            int r5 = 24 - r5
            java.lang.Object r0 = com.facetec.sdk.C2854bp.m11559b(r0, r1, r5)     // Catch:{ Exception -> 0x02ce }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ Exception -> 0x02ce }
            byte r1 = (byte) r3     // Catch:{ Exception -> 0x02ce }
            int r5 = r1 + 1
            byte r5 = (byte) r5     // Catch:{ Exception -> 0x02ce }
            int r6 = -r5
            byte r6 = (byte) r6     // Catch:{ Exception -> 0x02ce }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x02ce }
            m11903ae(r1, r5, r6, r2)     // Catch:{ Exception -> 0x02ce }
            r1 = r2[r3]     // Catch:{ Exception -> 0x02ce }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x02ce }
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch:{ Exception -> 0x02ce }
            r0.getLong(r4)     // Catch:{ Exception -> 0x02ce }
            throw r4     // Catch:{ all -> 0x02cb }
        L_0x02cb:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x02ce:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2888cg.m11936p():void");
    }

    /* renamed from: q */
    static void m11938q() {
        f9552d = new byte[]{107, -68, -36, Byte.MIN_VALUE, 4, -5, 8, -8, 1, 5, -6, 10, -10, 1, 6, -7, 1, 7, -8, 1, 8, -9, 1, 9, -10, 11, -11, 1, 10, -11, 10, -10, 1, 11, -12, 1, 12, -13, 5, -1, -4, 1, 4, -1, -4, 5, 0, -5, 1, 4, 0, -5, 1, 4, 1, -6, 1, 4, 2, -7, 1, 4, 3, -8, 5, 2, -7, 1, 4, 4, -9, 10, -10, 1, 4, 5, -10, 1, 4, 6, -11, 5, 4, -9, 1, 4, 7, -12, 1, 4, 8, -13, 5, 5, -10, 1, 5, -2, -4, 1, 5, -1, -5, 5, 2, -7, 1, 5, 0, -6, 5, 6, -11, 1, 4, 4, -9, 5, 7, -12, 5, 8, -13, 11, -11, 1, 5, 1, -7, 6, -2, -4, 1, 4, 4, -9, 1, 5, 2, -8, 6, -1, -5, 6, 0, -6, 6, 1, -7, 1, 5, 3, -9, 6, 2, -8, 5, 8, -13, 1, 5, 4, -10, 1, 5, 5, -11, 1, 5, 6, -12, 1, 5, 6, -12, 1, 5, 2, -8, 6, 4, -10, 6, 5, -11, 5, 8, -13, 1, 5, 3, -9, 6, 2, -8, 5, 8, -13, 1, 5, 7, -13, 1, 6, -3, -4, 1, 6, -2, -5, 1, 6, -2, -5, 1, 6, -1, -6, 5, 2, -7, 1, 6, 0, -7, 5, 6, -11, 1, 6, 0, -16, 5, -3, -1, 17, -9, -7, -36, 51, -46, 35, 15, -19, -1, -18, 15, 19, -15, -21, 11, 9, -16, -22, 23, 5, 6, -30, 11, 11, 9, -16, 9, -7, -4, 17, -9, 21, -21, -51, 71, -1, -11, 3, -62, 38, 21, 4, -8, 13, -9, 21, -21, -51, 62, -11, 13, -7, -57, 27, 37, 6, -15, 2, -2, 13, -15, 7, 20, -22, 5, 6, -9, 21, -21, -51, 71, -1, -11, 3, -62, 19, 33, 17, 1, -2, -17, 2, 17, -49, 44, -3, 0, -7, -2, 17, -11, 6, -1, -3, -4, -3, 11, -9, 21, -21, -51, 62, -11, 13, -7, -57, 23, 41, 7, -8, 13, -10, 14, -3, -6, -5, -54, 65, 4, -69, 20, 51, -12, 3, -8, -64, 50, -17, 13, 1, -10, 6, -1, -9, 21, -21, -51, 62, -11, 13, -7, -57, 37, 33, -2, -9, 5, -7, -9, 21, -21, -51, 71, -1, -11, 3, -62, 38, 21, 4, -8, 13, -30, 13, 18, -8, -9, 21, -21, -51, 71, -1, -11, 3, -62, 53, 12, -1, -11, 18, -3, 0, -13, 9, 6, -70, 23, 51, -19, -2, 18, -1, -5, 3, -31, 18, 13, 4, -13, -6, 2, -11, 13, -1, -16, 11, 8, -9, 3, -14, 5, 5, -13, 11};
        f9549a = 6;
    }

    /* renamed from: r */
    private boolean m11940r() {
        boolean z;
        synchronized (this.f9576w) {
            C2891b bVar = this.f9578y;
            if ((bVar == C2891b.PRE_SESSION || bVar == C2891b.PROCESSING || bVar == C2891b.ID_SCAN) && !this.f9558I) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: s */
    static void m11941s() {
        f9546N = new char[]{10733, 10681, 10675, 10671, 10676, 10678, 10680, 10726, 10676, 10685, 10731, 10683, 10664, 10549, 10513, 10508, 10537, 10729, 10670, 10672, 10682, 10645, 10734, 10684, 10682, 10682, 10679, 10674, 10559, 10499, 10504, 10593, 10629, 10597, 10601, 10606, 10567};
        f9545M = true;
        f9544L = -2032437281;
        f9543K = new char[]{30538, 30644, 30652, 30651, 30649, 30650, 30643, 30537, 30605, 30604, 30539};
        f9542J = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        return;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void m11942t() {
        /*
            java.lang.Class<com.facetec.sdk.cg> r0 = com.facetec.sdk.C2888cg.class
            monitor-enter(r0)
            int r1 = f9547O     // Catch:{ all -> 0x005c }
            int r1 = r1 + 29
            int r2 = r1 % 128
            f9548S = r2     // Catch:{ all -> 0x005c }
            int r1 = r1 % 2
            java.lang.String r1 = f9550b     // Catch:{ all -> 0x005c }
            r2 = 95
            if (r1 != 0) goto L_0x0016
            r1 = 62
            goto L_0x0017
        L_0x0016:
            r1 = r2
        L_0x0017:
            if (r1 == r2) goto L_0x0025
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x005c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x005c }
            f9550b = r1     // Catch:{ all -> 0x005c }
            monitor-exit(r0)
            return
        L_0x0025:
            java.lang.String r1 = f9550b     // Catch:{ all -> 0x005c }
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x005c }
            if (r1 != 0) goto L_0x005a
            int r1 = f9548S     // Catch:{ all -> 0x005c }
            int r1 = r1 + 23
            int r2 = r1 % 128
            f9547O = r2     // Catch:{ all -> 0x005c }
            int r1 = r1 % 2
            r2 = 1
            if (r1 != 0) goto L_0x003e
            r1 = 0
            goto L_0x003f
        L_0x003e:
            r1 = r2
        L_0x003f:
            if (r1 != r2) goto L_0x004c
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x005c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x005c }
            f9550b = r1     // Catch:{ all -> 0x005c }
            goto L_0x005a
        L_0x004c:
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x005c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x005c }
            f9550b = r1     // Catch:{ all -> 0x005c }
            r1 = 0
            throw r1     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005c }
        L_0x005a:
            monitor-exit(r0)
            return
        L_0x005c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2888cg.m11942t():void");
    }

    /* renamed from: u */
    private void m11943u() {
        int i = f9547O + 43;
        f9548S = i % 128;
        int i2 = i % 2;
        this.f9558I = false;
        this.f9554A.release();
        int i3 = f9548S + 37;
        f9547O = i3 % 128;
        int i4 = i3 % 2;
    }

    /* renamed from: v */
    private void m11944v() {
        char c;
        int i = f9547O + 81;
        f9548S = i % 128;
        int i2 = i % 2;
        mo9028l();
        mo9018d(true);
        try {
            ExecutorService executorService = this.f9562i;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            executorService.awaitTermination(2, timeUnit);
            this.f9560g.awaitTermination(2, timeUnit);
            int i3 = f9548S + 81;
            f9547O = i3 % 128;
            if (i3 % 2 == 0) {
                c = 'F';
            } else {
                c = 1;
            }
            if (c != 1) {
                throw null;
            }
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: w */
    private void m11945w() {
        boolean z;
        int i = f9547O + 87;
        f9548S = i % 128;
        if (i % 2 == 0) {
            boolean z2 = false;
            if (!C3555s.f11476b) {
                int i2 = f9547O + 27;
                f9548S = i2 % 128;
                if (i2 % 2 == 0) {
                    z2 = true;
                }
                if (!z2) {
                    throw null;
                }
                return;
            }
            C3401m mVar = ((C2831bd) this.f9565l.get()).f9161l;
            int i3 = C3555s.f11478d;
            if (i3 == 1) {
                int i4 = f9547O + 11;
                f9548S = i4 % 128;
                int i5 = i4 % 2;
                C2885cd.m11776I("waypoint", 1);
                mVar.mo9785a(this.f9565l.get(), C3555s.C3562d.WAYPOINT_UPLOAD);
            } else {
                if (i3 > 10) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    C2885cd.m11776I("waypoint", 2);
                    mVar.mo9785a(this.f9565l.get(), C3555s.C3562d.WAYPOINT_UPLOAD);
                    C3555s.f11476b = false;
                    int i6 = f9548S + 77;
                    f9547O = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            C3555s.f11478d++;
            return;
        }
        byte[] bArr = C3555s.$$a;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x022a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x022b  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11946x() {
        /*
            int r0 = f9548S
            int r1 = r0 + 19
            int r2 = r1 % 128
            f9547O = r2
            r2 = 2
            int r1 = r1 % r2
            int r0 = r0 + 115
            int r1 = r0 % 128
            f9547O = r1
            int r0 = r0 % r2
            int r0 = android.view.ViewConfiguration.getScrollBarFadeDuration()     // Catch:{ Exception -> 0x0282 }
            int r0 = r0 >> 16
            int r0 = 20121 - r0
            char r0 = (char) r0     // Catch:{ Exception -> 0x0282 }
            int r1 = android.view.ViewConfiguration.getJumpTapTimeout()     // Catch:{ Exception -> 0x0282 }
            int r1 = r1 >> 16
            int r1 = r1 + 242
            long r3 = android.view.ViewConfiguration.getGlobalActionKeyTimeout()     // Catch:{ Exception -> 0x0282 }
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            int r3 = 25 - r3
            java.lang.Object r0 = com.facetec.sdk.C2854bp.m11559b(r0, r1, r3)     // Catch:{ Exception -> 0x0282 }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ Exception -> 0x0282 }
            r1 = 0
            byte r3 = (byte) r1     // Catch:{ Exception -> 0x0282 }
            int r4 = r3 + 1
            byte r4 = (byte) r4     // Catch:{ Exception -> 0x0282 }
            int r7 = -r4
            byte r7 = (byte) r7     // Catch:{ Exception -> 0x0282 }
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0282 }
            m11903ae(r3, r4, r7, r9)     // Catch:{ Exception -> 0x0282 }
            r9 = r9[r1]     // Catch:{ Exception -> 0x0282 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0282 }
            java.lang.reflect.Field r0 = r0.getField(r9)     // Catch:{ Exception -> 0x0282 }
            r9 = 0
            long r10 = r0.getLong(r9)     // Catch:{ Exception -> 0x0282 }
            r12 = -1
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            r13 = 0
            r14 = -699924343(0xffffffffd6480089, float:-5.4976156E13)
            r15 = 49538(0xc182, float:6.9418E-41)
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x00f6
            r16 = 2034(0x7f2, double:1.005E-320)
            long r10 = r10 + r16
            java.lang.String r16 = "\u0000\u0000\u0000\u0000"
            int r0 = android.os.Process.myPid()     // Catch:{ Exception -> 0x0282 }
            int r0 = r0 >> 22
            char r0 = (char) r0     // Catch:{ Exception -> 0x0282 }
            int r18 = android.view.KeyEvent.normalizeMetaState(r1)     // Catch:{ Exception -> 0x0282 }
            java.lang.String r19 = "??ѳ"
            java.lang.String r20 = "ﶫ夡춓錜⶚徝㯎࿧מ嫫椏㭕籶亜咨扭೒뵜ﴴꭄៅ"
            java.lang.Object[] r12 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0282 }
            r17 = r0
            r21 = r12
            m11904af(r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x0282 }
            r0 = r12[r1]     // Catch:{ Exception -> 0x0282 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0282 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0282 }
            java.lang.String r16 = "\u0000\u0000\u0000\u0000"
            long r17 = android.os.Process.getElapsedCpuTime()     // Catch:{ Exception -> 0x0282 }
            int r12 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            int r12 = r12 + r15
            char r12 = (char) r12     // Catch:{ Exception -> 0x0282 }
            float r17 = android.view.ViewConfiguration.getScrollFriction()     // Catch:{ Exception -> 0x0282 }
            int r17 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            int r18 = r14 - r17
            java.lang.String r19 = "蠆䠀菖䛁"
            java.lang.String r20 = "隠祟♗䷔롏क츥⽺柟搽㩍㘤鱗ね"
            java.lang.Object[] r14 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0282 }
            r17 = r12
            r21 = r14
            m11904af(r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x0282 }
            r12 = r14[r1]     // Catch:{ Exception -> 0x0282 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0282 }
            java.lang.Class[] r14 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0282 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r12, r14)     // Catch:{ Exception -> 0x0282 }
            java.lang.Object[] r12 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0282 }
            java.lang.Object r0 = r0.invoke(r9, r12)     // Catch:{ Exception -> 0x0282 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x0282 }
            long r16 = r0.longValue()     // Catch:{ Exception -> 0x0282 }
            int r0 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x00bd
            r0 = 65
            goto L_0x00be
        L_0x00bd:
            r0 = r1
        L_0x00be:
            if (r0 == 0) goto L_0x00f6
            r0 = 48
            int r2 = android.text.TextUtils.indexOf(r2, r0, r1)
            int r2 = r2 + 20122
            char r2 = (char) r2
            char r0 = android.text.AndroidCharacter.getMirror(r0)
            int r0 = 290 - r0
            int r4 = android.view.ViewConfiguration.getScrollBarFadeDuration()
            int r4 = r4 >> 16
            int r4 = r4 + 24
            java.lang.Object r0 = com.facetec.sdk.C2854bp.m11559b(r2, r0, r4)
            java.lang.Class r0 = (java.lang.Class) r0
            byte r2 = (byte) r3
            int r4 = r2 + -1
            byte r4 = (byte) r4
            java.lang.Object[] r5 = new java.lang.Object[r8]
            m11903ae(r3, r2, r4, r5)
            r2 = r5[r1]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.reflect.Field r0 = r0.getField(r2)
            java.lang.Object r0 = r0.get(r9)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L_0x021c
        L_0x00f6:
            r0 = 2
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ all -> 0x0279 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0279 }
            r10[r8] = r0     // Catch:{ all -> 0x0279 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0279 }
            r10[r1] = r0     // Catch:{ all -> 0x0279 }
            java.util.Map<java.lang.Integer, java.lang.Object> r0 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x0279 }
            r11 = 140061824(0x8592c80, float:6.535337E-34)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0279 }
            java.lang.Object r12 = r0.get(r12)     // Catch:{ all -> 0x0279 }
            if (r12 == 0) goto L_0x0115
            goto L_0x0155
        L_0x0115:
            r12 = 48
            int r14 = android.text.TextUtils.indexOf(r2, r12, r1, r1)     // Catch:{ all -> 0x0279 }
            int r14 = r14 + 20122
            char r12 = (char) r14     // Catch:{ all -> 0x0279 }
            int r14 = android.view.View.resolveSizeAndState(r1, r1, r1)     // Catch:{ all -> 0x0279 }
            int r14 = r14 + 242
            float r16 = android.view.ViewConfiguration.getScrollFriction()     // Catch:{ all -> 0x0279 }
            int r13 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            int r13 = r13 + 23
            java.lang.Object r12 = com.facetec.sdk.C2854bp.m11559b(r12, r14, r13)     // Catch:{ all -> 0x0279 }
            java.lang.Class r12 = (java.lang.Class) r12     // Catch:{ all -> 0x0279 }
            int r13 = r3 + 2
            byte r13 = (byte) r13     // Catch:{ all -> 0x0279 }
            int r14 = r13 + -3
            byte r14 = (byte) r14     // Catch:{ all -> 0x0279 }
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x0279 }
            m11903ae(r3, r13, r14, r5)     // Catch:{ all -> 0x0279 }
            r5 = r5[r1]     // Catch:{ all -> 0x0279 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0279 }
            r6 = 2
            java.lang.Class[] r13 = new java.lang.Class[r6]     // Catch:{ all -> 0x0279 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0279 }
            r13[r1] = r6     // Catch:{ all -> 0x0279 }
            r13[r8] = r6     // Catch:{ all -> 0x0279 }
            java.lang.reflect.Method r12 = r12.getMethod(r5, r13)     // Catch:{ all -> 0x0279 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0279 }
            r0.put(r5, r12)     // Catch:{ all -> 0x0279 }
        L_0x0155:
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12     // Catch:{ all -> 0x0279 }
            java.lang.Object r0 = r12.invoke(r9, r10)     // Catch:{ all -> 0x0279 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0279 }
            int r5 = android.graphics.drawable.Drawable.resolveOpacity(r1, r1)
            int r5 = 20121 - r5
            char r5 = (char) r5
            int r6 = android.view.ViewConfiguration.getMaximumFlingVelocity()
            int r6 = r6 >> 16
            int r6 = 242 - r6
            int r10 = android.text.TextUtils.indexOf(r2, r2)
            int r10 = r10 + 24
            java.lang.Object r5 = com.facetec.sdk.C2854bp.m11559b(r5, r6, r10)
            java.lang.Class r5 = (java.lang.Class) r5
            byte r6 = (byte) r3
            int r10 = r6 + -1
            byte r10 = (byte) r10
            java.lang.Object[] r11 = new java.lang.Object[r8]
            m11903ae(r3, r6, r10, r11)
            r6 = r11[r1]
            java.lang.String r6 = (java.lang.String) r6
            java.lang.reflect.Field r5 = r5.getField(r6)
            r5.set(r9, r0)
            java.lang.String r22 = "\u0000\u0000\u0000\u0000"
            int r5 = android.view.View.MeasureSpec.getSize(r1)     // Catch:{ Exception -> 0x0273 }
            char r5 = (char) r5     // Catch:{ Exception -> 0x0273 }
            int r24 = android.view.KeyEvent.keyCodeFromString(r2)     // Catch:{ Exception -> 0x0273 }
            java.lang.String r25 = "??ѳ"
            java.lang.String r26 = "ﶫ夡춓錜⶚徝㯎࿧מ嫫椏㭕籶亜咨扭೒뵜ﴴꭄៅ"
            java.lang.Object[] r6 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0273 }
            r23 = r5
            r27 = r6
            m11904af(r22, r23, r24, r25, r26, r27)     // Catch:{ Exception -> 0x0273 }
            r5 = r6[r1]     // Catch:{ Exception -> 0x0273 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0273 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ Exception -> 0x0273 }
            java.lang.String r22 = "\u0000\u0000\u0000\u0000"
            r6 = 48
            int r10 = android.text.TextUtils.indexOf(r2, r6, r1)     // Catch:{ Exception -> 0x0273 }
            int r15 = r15 - r10
            char r6 = (char) r15     // Catch:{ Exception -> 0x0273 }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0273 }
            r12 = 0
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            r11 = -699924343(0xffffffffd6480089, float:-5.4976156E13)
            int r24 = r11 - r10
            java.lang.String r25 = "蠆䠀菖䛁"
            java.lang.String r26 = "隠祟♗䷔롏क츥⽺柟搽㩍㘤鱗ね"
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0273 }
            r23 = r6
            r27 = r10
            m11904af(r22, r23, r24, r25, r26, r27)     // Catch:{ Exception -> 0x0273 }
            r6 = r10[r1]     // Catch:{ Exception -> 0x0273 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0273 }
            java.lang.Class[] r10 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0273 }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r10)     // Catch:{ Exception -> 0x0273 }
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0273 }
            java.lang.Object r5 = r5.invoke(r9, r6)     // Catch:{ Exception -> 0x0273 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ Exception -> 0x0273 }
            long r5 = r5.longValue()     // Catch:{ Exception -> 0x0273 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 48
            int r2 = android.text.TextUtils.indexOf(r2, r6)
            int r2 = r2 + 20122
            char r2 = (char) r2
            int r6 = android.view.ViewConfiguration.getWindowTouchSlop()
            r10 = 8
            int r6 = r6 >> r10
            int r6 = 242 - r6
            long r10 = android.widget.ExpandableListView.getPackedPositionForGroup(r1)
            r12 = 0
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            int r10 = 24 - r10
            java.lang.Object r2 = com.facetec.sdk.C2854bp.m11559b(r2, r6, r10)
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.Object[] r6 = new java.lang.Object[r8]
            m11903ae(r3, r4, r7, r6)
            r3 = r6[r1]
            java.lang.String r3 = (java.lang.String) r3
            java.lang.reflect.Field r2 = r2.getField(r3)
            r2.set(r9, r5)
        L_0x021c:
            r2 = r0[r8]
            int[] r2 = (int[]) r2
            r2 = r2[r1]
            r3 = r0[r1]
            int[] r3 = (int[]) r3
            r1 = r3[r1]
            if (r1 != r2) goto L_0x022b
            return
        L_0x022b:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 2
            r3 = r0[r3]
            java.lang.String r3 = (java.lang.String) r3
            r2.add(r3)
            r3 = 3
            r3 = r0[r3]
            java.lang.String r3 = (java.lang.String) r3
            r2.add(r3)
            r3 = 4
            r3 = r0[r3]
            java.lang.String r3 = (java.lang.String) r3
            r2.add(r3)
            r3 = 5
            r3 = r0[r3]
            java.lang.String r3 = (java.lang.String) r3
            r2.add(r3)
            r3 = 6
            r3 = r0[r3]
            java.lang.String r3 = (java.lang.String) r3
            r2.add(r3)
            r3 = 7
            r3 = r0[r3]
            java.lang.String r3 = (java.lang.String) r3
            r2.add(r3)
            r3 = 8
            r0 = r0[r3]
            java.lang.String r0 = (java.lang.String) r0
            r2.add(r0)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
        L_0x0273:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L_0x0279:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0281
            throw r1
        L_0x0281:
            throw r0
        L_0x0282:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2888cg.m11946x():void");
    }

    /* renamed from: y */
    private void m11947y() {
        synchronized (this.f9574u) {
            this.f9557D = null;
            TimerTask timerTask = this.f9556C;
            if (timerTask != null) {
                timerTask.cancel();
                this.f9556C = null;
            }
        }
    }

    /* renamed from: z */
    private synchronized void m11948z() {
        int i = f9548S + 41;
        f9547O = i % 128;
        int i2 = i % 2;
        Activity activity = this.f9565l.get();
        if (activity == null) {
            int i3 = f9547O + 19;
            f9548S = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        activity.runOnUiThread(new C3525qb(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo9015c(boolean z) {
        int i = f9547O + 15;
        int i2 = i % 128;
        f9548S = i2;
        int i3 = i % 2;
        if ((this.f9579z != null ? '9' : 'P') == '9') {
            int i4 = i2 + 51;
            f9547O = i4 % 128;
            int i5 = i4 % 2;
            if (this.f9578y != C2891b.ID_SCAN) {
                mo9010b();
                this.f9579z.mo10063a(z);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [int, boolean] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x016d, code lost:
        r0.mo9112c(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0246, code lost:
        r0.mo9112c(8);
        r2 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x02e8, code lost:
        r2 = r5;
     */
    @com.guardsquare.dexguard.annotation.VirtualizeCode
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo9022e(android.content.Context r18, boolean r19) {
        /*
            r17 = this;
            r1 = r17
            monitor-enter(r17)
            com.facetec.sdk.dg r0 = new com.facetec.sdk.dg     // Catch:{ all -> 0x0386 }
            r2 = r18
            r3 = r19
            r0.<init>(r1, r2, r3)     // Catch:{ all -> 0x0386 }
            r2 = 73
            byte r2 = (byte) r2     // Catch:{ all -> 0x0386 }
            r3 = 440(0x1b8, float:6.17E-43)
            short r3 = (short) r3     // Catch:{ all -> 0x0386 }
            byte[] r4 = f9552d     // Catch:{ all -> 0x0386 }
            r5 = 46
            byte r6 = r4[r5]     // Catch:{ all -> 0x0386 }
            short r6 = (short) r6     // Catch:{ all -> 0x0386 }
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x0386 }
            m11905ag(r2, r3, r6, r8)     // Catch:{ all -> 0x0386 }
            r2 = 0
            r3 = r8[r2]     // Catch:{ all -> 0x0386 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0386 }
            r6 = 74
            byte r6 = (byte) r6     // Catch:{ all -> 0x0386 }
            r8 = 164(0xa4, float:2.3E-43)
            short r8 = (short) r8     // Catch:{ all -> 0x0386 }
            r9 = 227(0xe3, float:3.18E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x0386 }
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ all -> 0x0386 }
            m11905ag(r6, r8, r9, r10)     // Catch:{ all -> 0x0386 }
            r6 = r10[r2]     // Catch:{ all -> 0x0386 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0386 }
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ all -> 0x037d }
            r9[r2] = r6     // Catch:{ all -> 0x037d }
            r6 = 36
            byte r10 = r4[r6]     // Catch:{ all -> 0x037d }
            byte r10 = (byte) r10     // Catch:{ all -> 0x037d }
            r11 = 75
            short r11 = (short) r11     // Catch:{ all -> 0x037d }
            r12 = 212(0xd4, float:2.97E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x037d }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x037d }
            m11905ag(r10, r11, r12, r13)     // Catch:{ all -> 0x037d }
            r10 = r13[r2]     // Catch:{ all -> 0x037d }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x037d }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x037d }
            r13 = 62
            byte r14 = r4[r13]     // Catch:{ all -> 0x037d }
            byte r14 = (byte) r14     // Catch:{ all -> 0x037d }
            r15 = r14 | 112(0x70, float:1.57E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x037d }
            int r13 = f9549a     // Catch:{ all -> 0x037d }
            r13 = r13 | 217(0xd9, float:3.04E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x037d }
            java.lang.Object[] r5 = new java.lang.Object[r7]     // Catch:{ all -> 0x037d }
            m11905ag(r14, r15, r13, r5)     // Catch:{ all -> 0x037d }
            r5 = r5[r2]     // Catch:{ all -> 0x037d }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x037d }
            java.lang.Class[] r13 = new java.lang.Class[r7]     // Catch:{ all -> 0x037d }
            byte r4 = r4[r6]     // Catch:{ all -> 0x037d }
            byte r4 = (byte) r4     // Catch:{ all -> 0x037d }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x037d }
            m11905ag(r4, r11, r12, r14)     // Catch:{ all -> 0x037d }
            r4 = r14[r2]     // Catch:{ all -> 0x037d }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x037d }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x037d }
            r13[r2] = r4     // Catch:{ all -> 0x037d }
            java.lang.reflect.Method r4 = r10.getMethod(r5, r13)     // Catch:{ all -> 0x037d }
            java.lang.Object r3 = r4.invoke(r3, r9)     // Catch:{ all -> 0x037d }
            java.lang.Object[] r3 = (java.lang.Object[]) r3     // Catch:{ all -> 0x037d }
            int r4 = r3.length     // Catch:{ all -> 0x0386 }
            int[] r4 = new int[r4]     // Catch:{ all -> 0x0386 }
            r5 = r2
        L_0x008a:
            int r9 = r3.length     // Catch:{ all -> 0x0386 }
            if (r5 >= r9) goto L_0x0133
            r9 = r3[r5]     // Catch:{ all -> 0x0386 }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x012a }
            r13[r2] = r9     // Catch:{ all -> 0x012a }
            byte[] r9 = f9552d     // Catch:{ all -> 0x012a }
            byte r14 = r9[r6]     // Catch:{ all -> 0x012a }
            byte r14 = (byte) r14     // Catch:{ all -> 0x012a }
            r15 = 211(0xd3, float:2.96E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x012a }
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ all -> 0x012a }
            m11905ag(r14, r8, r15, r10)     // Catch:{ all -> 0x012a }
            r10 = r10[r2]     // Catch:{ all -> 0x012a }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x012a }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x012a }
            r14 = 46
            byte r6 = r9[r14]     // Catch:{ all -> 0x012a }
            byte r6 = (byte) r6     // Catch:{ all -> 0x012a }
            r14 = r6 | 195(0xc3, float:2.73E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x012a }
            r2 = 221(0xdd, float:3.1E-43)
            short r2 = (short) r2     // Catch:{ all -> 0x012a }
            r16 = r3
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x012a }
            m11905ag(r6, r14, r2, r3)     // Catch:{ all -> 0x012a }
            r2 = 0
            r3 = r3[r2]     // Catch:{ all -> 0x012a }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x012a }
            java.lang.Class[] r2 = new java.lang.Class[r7]     // Catch:{ all -> 0x012a }
            r6 = 36
            byte r14 = r9[r6]     // Catch:{ all -> 0x012a }
            byte r6 = (byte) r14     // Catch:{ all -> 0x012a }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x012a }
            m11905ag(r6, r11, r12, r14)     // Catch:{ all -> 0x012a }
            r6 = 0
            r14 = r14[r6]     // Catch:{ all -> 0x012a }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x012a }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x012a }
            r2[r6] = r14     // Catch:{ all -> 0x012a }
            java.lang.reflect.Method r2 = r10.getMethod(r3, r2)     // Catch:{ all -> 0x012a }
            r3 = 0
            java.lang.Object r2 = r2.invoke(r3, r13)     // Catch:{ all -> 0x012a }
            r3 = 36
            byte r6 = r9[r3]     // Catch:{ all -> 0x0121 }
            byte r3 = (byte) r6     // Catch:{ all -> 0x0121 }
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch:{ all -> 0x0121 }
            m11905ag(r3, r8, r15, r6)     // Catch:{ all -> 0x0121 }
            r3 = 0
            r6 = r6[r3]     // Catch:{ all -> 0x0121 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0121 }
            java.lang.Class r3 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x0121 }
            r6 = 279(0x117, float:3.91E-43)
            byte r6 = r9[r6]     // Catch:{ all -> 0x0121 }
            byte r6 = (byte) r6     // Catch:{ all -> 0x0121 }
            r9 = r6 | 176(0xb0, float:2.47E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x0121 }
            r10 = 220(0xdc, float:3.08E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x0121 }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x0121 }
            m11905ag(r6, r9, r10, r13)     // Catch:{ all -> 0x0121 }
            r6 = 0
            r9 = r13[r6]     // Catch:{ all -> 0x0121 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0121 }
            r6 = 0
            java.lang.reflect.Method r3 = r3.getMethod(r9, r6)     // Catch:{ all -> 0x0121 }
            java.lang.Object r2 = r3.invoke(r2, r6)     // Catch:{ all -> 0x0121 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0121 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0121 }
            r4[r5] = r2     // Catch:{ all -> 0x0386 }
            int r5 = r5 + 1
            r3 = r16
            r2 = 0
            r6 = 36
            goto L_0x008a
        L_0x0121:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()     // Catch:{ all -> 0x0386 }
            if (r2 == 0) goto L_0x0129
            throw r2     // Catch:{ all -> 0x0386 }
        L_0x0129:
            throw r0     // Catch:{ all -> 0x0386 }
        L_0x012a:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()     // Catch:{ all -> 0x0386 }
            if (r2 == 0) goto L_0x0132
            throw r2     // Catch:{ all -> 0x0386 }
        L_0x0132:
            throw r0     // Catch:{ all -> 0x0386 }
        L_0x0133:
            r2 = 0
        L_0x0134:
            int r3 = r2 + 1
            r2 = r4[r2]     // Catch:{ all -> 0x0386 }
            int r2 = r0.mo9112c(r2)     // Catch:{ all -> 0x0386 }
            r5 = 33
            r6 = 25
            r8 = 9
            r9 = 8
            r10 = 3
            r11 = 5
            r12 = 2
            switch(r2) {
                case -33: goto L_0x0372;
                case -32: goto L_0x035a;
                case -31: goto L_0x0357;
                case -30: goto L_0x0353;
                case -29: goto L_0x0343;
                case -28: goto L_0x033a;
                case -27: goto L_0x0331;
                case -26: goto L_0x0321;
                case -25: goto L_0x030e;
                case -24: goto L_0x02ff;
                case -23: goto L_0x02f5;
                case -22: goto L_0x02eb;
                case -21: goto L_0x02e8;
                case -20: goto L_0x02d1;
                case -19: goto L_0x02c6;
                case -18: goto L_0x02a8;
                case -17: goto L_0x028b;
                case -16: goto L_0x027c;
                case -15: goto L_0x0273;
                case -14: goto L_0x0269;
                case -13: goto L_0x025f;
                case -12: goto L_0x024c;
                case -11: goto L_0x022b;
                case -10: goto L_0x0211;
                case -9: goto L_0x01b8;
                case -8: goto L_0x01a7;
                case -7: goto L_0x01a2;
                case -6: goto L_0x018f;
                case -5: goto L_0x0187;
                case -4: goto L_0x0171;
                case -3: goto L_0x0169;
                case -2: goto L_0x0155;
                case -1: goto L_0x0152;
                default: goto L_0x014a;
            }     // Catch:{ all -> 0x0386 }
        L_0x014a:
            r2 = 0
            r13 = 36
            r14 = 46
            r15 = 0
            goto L_0x037a
        L_0x0152:
            r2 = 35
            goto L_0x0134
        L_0x0155:
            r0.f9882a = r12     // Catch:{ all -> 0x0386 }
            r0.mo9112c(r7)     // Catch:{ all -> 0x0386 }
            r0.mo9112c(r12)     // Catch:{ all -> 0x0386 }
            java.lang.Object r2 = r0.f9887f     // Catch:{ all -> 0x0386 }
            com.facetec.sdk.cg r2 = (com.facetec.sdk.C2888cg) r2     // Catch:{ all -> 0x0386 }
            r0.mo9112c(r10)     // Catch:{ all -> 0x0386 }
            int r5 = r0.f9886e     // Catch:{ all -> 0x0386 }
            r2.f9577x = r5     // Catch:{ all -> 0x0386 }
            goto L_0x014a
        L_0x0169:
            com.facetec.sdk.cl r2 = com.facetec.sdk.C2899cl.DETECTING_LIGHT_MODE     // Catch:{ all -> 0x0386 }
            r0.f9891j = r2     // Catch:{ all -> 0x0386 }
        L_0x016d:
            r0.mo9112c(r11)     // Catch:{ all -> 0x0386 }
            goto L_0x014a
        L_0x0171:
            r0.f9882a = r12     // Catch:{ all -> 0x0386 }
            r0.mo9112c(r7)     // Catch:{ all -> 0x0386 }
            r0.mo9112c(r12)     // Catch:{ all -> 0x0386 }
            java.lang.Object r2 = r0.f9887f     // Catch:{ all -> 0x0386 }
            com.facetec.sdk.cg r2 = (com.facetec.sdk.C2888cg) r2     // Catch:{ all -> 0x0386 }
            r0.mo9112c(r12)     // Catch:{ all -> 0x0386 }
            java.lang.Object r5 = r0.f9887f     // Catch:{ all -> 0x0386 }
            com.facetec.sdk.cl r5 = (com.facetec.sdk.C2899cl) r5     // Catch:{ all -> 0x0386 }
            r2.f9572s = r5     // Catch:{ all -> 0x0386 }
            goto L_0x014a
        L_0x0187:
            com.facetec.sdk.xb r2 = new com.facetec.sdk.xb     // Catch:{ all -> 0x0386 }
            r2.<init>()     // Catch:{ all -> 0x0386 }
            r0.f9891j = r2     // Catch:{ all -> 0x0386 }
            goto L_0x016d
        L_0x018f:
            r0.f9882a = r7     // Catch:{ all -> 0x0386 }
            r0.mo9112c(r7)     // Catch:{ all -> 0x0386 }
            r0.mo9112c(r12)     // Catch:{ all -> 0x0386 }
            java.lang.Object r2 = r0.f9887f     // Catch:{ all -> 0x0386 }
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch:{ all -> 0x0386 }
            com.facetec.sdk.cv r2 = com.facetec.sdk.C2920cv.m12195c(r2)     // Catch:{ all -> 0x0386 }
            r0.f9891j = r2     // Catch:{ all -> 0x0386 }
            goto L_0x016d
        L_0x01a2:
            int[] r2 = com.facetec.sdk.C2888cg.C28893.f9580b     // Catch:{ all -> 0x0386 }
            r0.f9891j = r2     // Catch:{ all -> 0x0386 }
            goto L_0x016d
        L_0x01a7:
            r0.f9882a = r7     // Catch:{ all -> 0x0386 }
            r0.mo9112c(r7)     // Catch:{ all -> 0x0386 }
            r0.mo9112c(r12)     // Catch:{ all -> 0x0386 }
            java.lang.Object r2 = r0.f9887f     // Catch:{ all -> 0x0386 }
            com.facetec.sdk.cg r2 = (com.facetec.sdk.C2888cg) r2     // Catch:{ all -> 0x0386 }
            com.facetec.sdk.cg$b r2 = r2.f9578y     // Catch:{ all -> 0x0386 }
            r0.f9891j = r2     // Catch:{ all -> 0x0386 }
            goto L_0x016d
        L_0x01b8:
            r0.f9882a = r7     // Catch:{ all -> 0x0386 }
            r0.mo9112c(r7)     // Catch:{ all -> 0x0386 }
            r0.mo9112c(r12)     // Catch:{ all -> 0x0386 }
            java.lang.Object r2 = r0.f9887f     // Catch:{ all -> 0x0386 }
            byte[] r5 = f9552d     // Catch:{ all -> 0x0208 }
            r13 = 36
            byte r6 = r5[r13]     // Catch:{ all -> 0x0208 }
            byte r6 = (byte) r6     // Catch:{ all -> 0x0208 }
            r8 = r6 | 99
            short r8 = (short) r8     // Catch:{ all -> 0x0208 }
            int r10 = f9549a     // Catch:{ all -> 0x0208 }
            r10 = r10 | 208(0xd0, float:2.91E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x0208 }
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ all -> 0x0208 }
            m11905ag(r6, r8, r10, r11)     // Catch:{ all -> 0x0208 }
            r6 = 0
            r8 = r11[r6]     // Catch:{ all -> 0x0208 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0208 }
            java.lang.Class r6 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0208 }
            r8 = 17
            byte r8 = r5[r8]     // Catch:{ all -> 0x0208 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x0208 }
            r14 = 46
            byte r5 = r5[r14]     // Catch:{ all -> 0x0208 }
            short r5 = (short) r5     // Catch:{ all -> 0x0208 }
            r10 = r5 | 221(0xdd, float:3.1E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x0208 }
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ all -> 0x0208 }
            m11905ag(r8, r5, r10, r11)     // Catch:{ all -> 0x0208 }
            r15 = 0
            r5 = r11[r15]     // Catch:{ all -> 0x0208 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0208 }
            r11 = 0
            java.lang.reflect.Method r5 = r6.getMethod(r5, r11)     // Catch:{ all -> 0x0208 }
            java.lang.Object r2 = r5.invoke(r2, r11)     // Catch:{ all -> 0x0208 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0208 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0208 }
            r0.f9882a = r2     // Catch:{ all -> 0x0386 }
            goto L_0x0246
        L_0x0208:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()     // Catch:{ all -> 0x0386 }
            if (r2 == 0) goto L_0x0210
            throw r2     // Catch:{ all -> 0x0386 }
        L_0x0210:
            throw r0     // Catch:{ all -> 0x0386 }
        L_0x0211:
            r11 = 0
            r13 = 36
            r14 = 46
            r15 = 0
            r0.mo9112c(r8)     // Catch:{ all -> 0x0386 }
            int r2 = r0.f9886e     // Catch:{ all -> 0x0386 }
            r3 = 15
            if (r2 == r7) goto L_0x037a
            if (r2 == r12) goto L_0x037a
            r3 = 31
            if (r2 == r10) goto L_0x037a
            r6 = 4
            if (r2 == r6) goto L_0x037a
            goto L_0x02e8
        L_0x022b:
            r11 = 0
            r13 = 36
            r14 = 46
            r15 = 0
            r0.f9882a = r7     // Catch:{ all -> 0x0386 }
            r0.mo9112c(r7)     // Catch:{ all -> 0x0386 }
            r0.mo9112c(r10)     // Catch:{ all -> 0x0386 }
            int r2 = r0.f9886e     // Catch:{ all -> 0x0386 }
            if (r2 == 0) goto L_0x023f
            r2 = r7
            goto L_0x0240
        L_0x023f:
            r2 = r15
        L_0x0240:
            boolean r2 = com.facetec.sdk.C2885cd.m11828c((boolean) r2)     // Catch:{ all -> 0x0386 }
            r0.f9882a = r2     // Catch:{ all -> 0x0386 }
        L_0x0246:
            r0.mo9112c(r9)     // Catch:{ all -> 0x0386 }
            r2 = r11
            goto L_0x037a
        L_0x024c:
            r11 = 0
            r13 = 36
            r14 = 46
            r15 = 0
            r2 = 12
            r0.mo9112c(r2)     // Catch:{ all -> 0x0386 }
            int r2 = r0.f9886e     // Catch:{ all -> 0x0386 }
            if (r2 != 0) goto L_0x037a
            r2 = 19
            goto L_0x0134
        L_0x025f:
            r11 = 0
            r13 = 36
            r14 = 46
            r15 = 0
            r2 = 66
            goto L_0x0134
        L_0x0269:
            r11 = 0
            r13 = 36
            r14 = 46
            r15 = 0
            r2 = 64
            goto L_0x0134
        L_0x0273:
            r2 = 14
            r0.mo9112c(r2)     // Catch:{ all -> 0x0386 }
            int r0 = r0.f9886e     // Catch:{ all -> 0x0386 }
            monitor-exit(r17)
            return r0
        L_0x027c:
            r2 = 0
            r13 = 36
            r14 = 46
            r15 = 0
            com.facetec.sdk.cg$b r5 = com.facetec.sdk.C2888cg.C2891b.PRE_SESSION     // Catch:{ all -> 0x0386 }
            r0.f9891j = r5     // Catch:{ all -> 0x0386 }
            r0.mo9112c(r11)     // Catch:{ all -> 0x0386 }
            goto L_0x037a
        L_0x028b:
            r2 = 0
            r13 = 36
            r14 = 46
            r15 = 0
            r0.f9882a = r12     // Catch:{ all -> 0x0386 }
            r0.mo9112c(r7)     // Catch:{ all -> 0x0386 }
            r0.mo9112c(r12)     // Catch:{ all -> 0x0386 }
            java.lang.Object r5 = r0.f9887f     // Catch:{ all -> 0x0386 }
            com.facetec.sdk.cg r5 = (com.facetec.sdk.C2888cg) r5     // Catch:{ all -> 0x0386 }
            r0.mo9112c(r12)     // Catch:{ all -> 0x0386 }
            java.lang.Object r6 = r0.f9887f     // Catch:{ all -> 0x0386 }
            com.facetec.sdk.cg$b r6 = (com.facetec.sdk.C2888cg.C2891b) r6     // Catch:{ all -> 0x0386 }
            r5.f9578y = r6     // Catch:{ all -> 0x0386 }
            goto L_0x037a
        L_0x02a8:
            r2 = 0
            r13 = 36
            r14 = 46
            r15 = 0
            r0.f9882a = r12     // Catch:{ all -> 0x0386 }
            r0.mo9112c(r7)     // Catch:{ all -> 0x0386 }
            r0.mo9112c(r12)     // Catch:{ all -> 0x0386 }
            java.lang.Object r5 = r0.f9887f     // Catch:{ all -> 0x0386 }
            com.facetec.sdk.cg r5 = (com.facetec.sdk.C2888cg) r5     // Catch:{ all -> 0x0386 }
            r0.mo9112c(r12)     // Catch:{ all -> 0x0386 }
            java.lang.Object r6 = r0.f9887f     // Catch:{ all -> 0x0386 }
            android.content.Context r6 = (android.content.Context) r6     // Catch:{ all -> 0x0386 }
            r5.m11920e((android.content.Context) r6)     // Catch:{ all -> 0x0386 }
            goto L_0x037a
        L_0x02c6:
            r2 = 0
            r13 = 36
            r14 = 46
            r15 = 0
            m11942t()     // Catch:{ all -> 0x0386 }
            goto L_0x037a
        L_0x02d1:
            r2 = 0
            r13 = 36
            r14 = 46
            r15 = 0
            r0.f9882a = r7     // Catch:{ all -> 0x0386 }
            r0.mo9112c(r7)     // Catch:{ all -> 0x0386 }
            r0.mo9112c(r12)     // Catch:{ all -> 0x0386 }
            java.lang.Object r5 = r0.f9887f     // Catch:{ all -> 0x0386 }
            android.content.Context r5 = (android.content.Context) r5     // Catch:{ all -> 0x0386 }
            m11895a((android.content.Context) r5)     // Catch:{ all -> 0x0386 }
            goto L_0x037a
        L_0x02e8:
            r2 = r5
            goto L_0x0134
        L_0x02eb:
            r2 = 0
            r13 = 36
            r14 = 46
            r15 = 0
            r3 = 39
            goto L_0x037a
        L_0x02f5:
            r2 = 0
            r13 = 36
            r14 = 46
            r15 = 0
            r3 = 52
            goto L_0x037a
        L_0x02ff:
            r2 = 0
            r13 = 36
            r14 = 46
            r15 = 0
            int r5 = f9547O     // Catch:{ all -> 0x0386 }
            r0.f9882a = r5     // Catch:{ all -> 0x0386 }
            r0.mo9112c(r9)     // Catch:{ all -> 0x0386 }
            goto L_0x037a
        L_0x030e:
            r2 = 0
            r13 = 36
            r14 = 46
            r15 = 0
            r0.f9882a = r7     // Catch:{ all -> 0x0386 }
            r0.mo9112c(r7)     // Catch:{ all -> 0x0386 }
            r0.mo9112c(r10)     // Catch:{ all -> 0x0386 }
            int r5 = r0.f9886e     // Catch:{ all -> 0x0386 }
            f9548S = r5     // Catch:{ all -> 0x0386 }
            goto L_0x037a
        L_0x0321:
            r2 = 0
            r13 = 36
            r14 = 46
            r15 = 0
            r0.mo9112c(r6)     // Catch:{ all -> 0x0386 }
            int r5 = r0.f9886e     // Catch:{ all -> 0x0386 }
            if (r5 != 0) goto L_0x037a
            r3 = 50
            goto L_0x037a
        L_0x0331:
            r2 = 0
            r13 = 36
            r14 = 46
            r15 = 0
            r3 = 51
            goto L_0x037a
        L_0x033a:
            r2 = 0
            r13 = 36
            r14 = 46
            r15 = 0
            r3 = 20
            goto L_0x037a
        L_0x0343:
            r2 = 0
            r13 = 36
            r14 = 46
            r15 = 0
            r0.mo9112c(r6)     // Catch:{ all -> 0x0386 }
            int r5 = r0.f9886e     // Catch:{ all -> 0x0386 }
            if (r5 != 0) goto L_0x037a
            r3 = 61
            goto L_0x037a
        L_0x0353:
            r2 = 62
            goto L_0x0134
        L_0x0357:
            r2 = r7
            goto L_0x0134
        L_0x035a:
            r2 = 0
            r13 = 36
            r14 = 46
            r15 = 0
            r0.mo9112c(r8)     // Catch:{ all -> 0x0386 }
            int r3 = r0.f9886e     // Catch:{ all -> 0x0386 }
            r5 = 22
            if (r3 == 0) goto L_0x02e8
            if (r3 == r7) goto L_0x036d
            goto L_0x02e8
        L_0x036d:
            r3 = 41
            r5 = r3
            goto L_0x02e8
        L_0x0372:
            r2 = 0
            r13 = 36
            r14 = 46
            r15 = 0
            r3 = 63
        L_0x037a:
            r2 = r3
            goto L_0x0134
        L_0x037d:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()     // Catch:{ all -> 0x0386 }
            if (r2 == 0) goto L_0x0385
            throw r2     // Catch:{ all -> 0x0386 }
        L_0x0385:
            throw r0     // Catch:{ all -> 0x0386 }
        L_0x0386:
            r0 = move-exception
            monitor-exit(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2888cg.mo9022e(android.content.Context, boolean):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C2890a mo9023g() {
        int i = f9547O + 95;
        f9548S = i % 128;
        if (i % 2 == 0) {
            return this.f9569p;
        }
        int i2 = 53 / 0;
        return this.f9569p;
    }

    /* access modifiers changed from: package-private */
    @VirtualizeCode
    /* renamed from: h */
    public final synchronized void mo9024h() {
        boolean z;
        C2920cv.m12195c(new C3616ub());
        synchronized (this.f9576w) {
            C2891b bVar = this.f9578y;
            if (!(bVar == C2891b.ID_SCAN || bVar == C2891b.PRE_SESSION || bVar == C2891b.PROCESSING)) {
                if (bVar != C2891b.WAITING_TO_FINISH) {
                    z = false;
                }
            }
            this.f9578y = C2891b.FINISHED;
            z = true;
        }
        if (z) {
            C2885cd.m11844j(false);
        }
    }

    /* access modifiers changed from: package-private */
    @VirtualizeCode
    /* renamed from: i */
    public final synchronized void mo9025i() {
        boolean z;
        C2920cv.m12195c(new C3504pb());
        synchronized (this.f9576w) {
            C2891b bVar = this.f9578y;
            if (!(bVar == C2891b.PRE_SESSION || bVar == C2891b.PROCESSING)) {
                if (bVar != C2891b.WAITING_TO_FINISH) {
                    z = false;
                }
            }
            this.f9578y = C2891b.FINISHED;
            z = true;
        }
        if (z) {
            C2885cd.m11840h(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final synchronized void mo9026j() {
        synchronized (this.f9576w) {
            C2891b bVar = this.f9578y;
            if (bVar == C2891b.PROCESSING || bVar == C2891b.WAITING_TO_FINISH) {
                this.f9578y = C2891b.FINISHED;
            }
        }
        C2920cv.m12195c(new C3660wb());
        m11947y();
        mo9010b();
        this.f9563j.clear();
        this.f9561h.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final C2895ch mo9027k() {
        int i = f9548S + 83;
        f9547O = i % 128;
        int i2 = i % 2;
        C2895ch l = C2885cd.m11846l();
        this.f9571r = l;
        int i3 = f9547O + 61;
        f9548S = i3 % 128;
        int i4 = i3 % 2;
        return l;
    }

    /* access modifiers changed from: package-private */
    @VirtualizeCode
    /* renamed from: l */
    public final void mo9028l() {
        Throwable cause;
        synchronized (this.f9576w) {
            C2891b bVar = this.f9578y;
            if (bVar == C2891b.PRE_SESSION || bVar == C2891b.PROCESSING || bVar == C2891b.ID_SCAN) {
                this.f9578y = C2891b.WAITING_TO_FINISH;
            }
        }
        m11947y();
        ArrayList<WeakReference<C2892c>> arrayList = this.f9563j;
        try {
            byte[] bArr = f9552d;
            byte b = (byte) bArr[36];
            short s = (short) BogInputLayout.INPUT_NORMAL_STATE;
            Object[] objArr = new Object[1];
            m11905ag(b, (short) (b | 130), s, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            int i = f9549a;
            Object[] objArr2 = new Object[1];
            m11905ag((byte) bArr[247], (short) (i | 176), (short) (i | 217), objArr2);
            cls.getMethod((String) objArr2[0], (Class[]) null).invoke(arrayList, (Object[]) null);
            ArrayList<WeakReference<C2893d>> arrayList2 = this.f9561h;
            try {
                byte b2 = (byte) bArr[36];
                Object[] objArr3 = new Object[1];
                m11905ag(b2, (short) (b2 | 130), s, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                m11905ag((byte) bArr[247], (short) (i | 176), (short) (i | 217), objArr4);
                cls2.getMethod((String) objArr4[0], (Class[]) null).invoke(arrayList2, (Object[]) null);
                ArrayList<WeakReference<C2894e>> arrayList3 = this.f9559f;
                try {
                    byte b3 = (byte) bArr[36];
                    Object[] objArr5 = new Object[1];
                    m11905ag(b3, (short) (b3 | 130), s, objArr5);
                    Class<?> cls3 = Class.forName((String) objArr5[0]);
                    Object[] objArr6 = new Object[1];
                    m11905ag((byte) bArr[247], (short) (i | 176), (short) (i | 217), objArr6);
                    cls3.getMethod((String) objArr6[0], (Class[]) null).invoke(arrayList3, (Object[]) null);
                    ExecutorService executorService = this.f9562i;
                    try {
                        Object[] objArr7 = new Object[1];
                        m11905ag((byte) bArr[36], (short) (bArr[343] + 1), (short) 192, objArr7);
                        Class<?> cls4 = Class.forName((String) objArr7[0]);
                        Object[] objArr8 = new Object[1];
                        m11905ag((byte) bArr[62], (short) bArr[17], (short) 220, objArr8);
                        cls4.getMethod((String) objArr8[0], (Class[]) null).invoke(executorService, (Object[]) null);
                    } catch (Throwable th) {
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } finally {
                    cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                }
            } finally {
                Throwable cause2 = th.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
            }
        } finally {
            Throwable cause3 = th.getCause();
            if (cause3 != null) {
                throw cause3;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final C2899cl mo9029o() {
        char c;
        int i = f9548S + 9;
        f9547O = i % 128;
        int i2 = i % 2;
        C2899cl h = C2885cd.m11839h();
        this.f9572s = h;
        int i3 = f9547O + 29;
        f9548S = i3 % 128;
        if (i3 % 2 != 0) {
            c = '_';
        } else {
            c = 'H';
        }
        if (c != '_') {
            return h;
        }
        throw null;
    }

    /* renamed from: a */
    static synchronized void m11894a() {
        synchronized (C2888cg.class) {
            int i = f9548S + 121;
            f9547O = i % 128;
            if (i % 2 == 0) {
                throw null;
            } else if (f9553e == null) {
                C2885cd.m11829d();
                int i2 = f9548S + 61;
                f9547O = i2 % 128;
                if (i2 % 2 == 0) {
                }
            }
        }
    }

    /* renamed from: e */
    static synchronized void m11919e() {
        synchronized (C2888cg.class) {
            int i = f9548S + 99;
            f9547O = i % 128;
            int i2 = i % 2;
            C2888cg cgVar = f9553e;
            if ((cgVar != null ? 16 : '1') == 16) {
                cgVar.m11944v();
                f9553e = null;
            }
            int i3 = f9547O + 7;
            f9548S = i3 % 128;
            if ((i3 % 2 != 0 ? '9' : '+') != '+') {
                throw null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo9010b() {
        int i = f9547O + 77;
        f9548S = i % 128;
        int i2 = i % 2;
        C3604u uVar = this.f9579z;
        if ((uVar != null ? 'E' : '.') == 'E' && uVar.mo10064a()) {
            this.f9579z.mo10065b();
            m11869B();
            int i3 = f9547O + 101;
            f9548S = i3 % 128;
            if (!(i3 % 2 == 0)) {
                throw null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo9012b(C2893d dVar) {
        this.f9561h.add(new WeakReference(dVar));
        int i = f9547O + 53;
        f9548S = i % 128;
        int i2 = i % 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo9021e(C2894e eVar) {
        this.f9559f.add(new WeakReference(eVar));
        int i = f9547O + 73;
        f9548S = i % 128;
        if (!(i % 2 == 0)) {
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo9008a(C2893d dVar) {
        int i = f9548S + 105;
        f9547O = i % 128;
        if (i % 2 != 0) {
            Iterator<WeakReference<C2893d>> it = this.f9561h.iterator();
            int i2 = f9548S + 25;
            f9547O = i2 % 128;
            int i3 = i2 % 2;
            while (true) {
                if ((it.hasNext() ? 'K' : 'J') != 'J') {
                    if ((it.next().get() == dVar ? '!' : 'V') == '!') {
                        int i4 = f9548S + 93;
                        f9547O = i4 % 128;
                        int i5 = i4 % 2;
                        it.remove();
                    }
                }
            }
        } else {
            this.f9561h.iterator();
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
        return;
     */
    @com.guardsquare.dexguard.annotation.VirtualizeCode
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo9011b(android.content.Context r13, boolean r14, java.lang.String r15) {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 0
            r12.f9577x = r0     // Catch:{ all -> 0x0104 }
            com.facetec.sdk.zb r1 = new com.facetec.sdk.zb     // Catch:{ all -> 0x0104 }
            r1.<init>()     // Catch:{ all -> 0x0104 }
            com.facetec.sdk.C2920cv.m12195c(r1)     // Catch:{ all -> 0x0104 }
            int[] r1 = com.facetec.sdk.C2888cg.C28893.f9580b     // Catch:{ all -> 0x0104 }
            com.facetec.sdk.cg$b r2 = r12.f9578y     // Catch:{ all -> 0x0104 }
            byte[] r3 = f9552d     // Catch:{ all -> 0x00fb }
            r4 = 36
            byte r5 = r3[r4]     // Catch:{ all -> 0x00fb }
            byte r5 = (byte) r5     // Catch:{ all -> 0x00fb }
            r6 = r5 | 99
            short r6 = (short) r6     // Catch:{ all -> 0x00fb }
            int r7 = f9549a     // Catch:{ all -> 0x00fb }
            r7 = r7 | 208(0xd0, float:2.91E-43)
            short r7 = (short) r7     // Catch:{ all -> 0x00fb }
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x00fb }
            m11905ag(r5, r6, r7, r9)     // Catch:{ all -> 0x00fb }
            r5 = r9[r0]     // Catch:{ all -> 0x00fb }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00fb }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x00fb }
            r6 = 17
            byte r6 = r3[r6]     // Catch:{ all -> 0x00fb }
            byte r6 = (byte) r6     // Catch:{ all -> 0x00fb }
            r7 = 46
            byte r7 = r3[r7]     // Catch:{ all -> 0x00fb }
            short r7 = (short) r7     // Catch:{ all -> 0x00fb }
            r9 = r7 | 221(0xdd, float:3.1E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x00fb }
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ all -> 0x00fb }
            m11905ag(r6, r7, r9, r10)     // Catch:{ all -> 0x00fb }
            r6 = r10[r0]     // Catch:{ all -> 0x00fb }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x00fb }
            r7 = 0
            java.lang.reflect.Method r5 = r5.getMethod(r6, r7)     // Catch:{ all -> 0x00fb }
            java.lang.Object r2 = r5.invoke(r2, r7)     // Catch:{ all -> 0x00fb }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x00fb }
            int r2 = r2.intValue()     // Catch:{ all -> 0x00fb }
            r1 = r1[r2]     // Catch:{ all -> 0x0104 }
            r2 = 3
            r5 = 2
            if (r1 == r8) goto L_0x0067
            if (r1 == r5) goto L_0x0067
            if (r1 == r2) goto L_0x0065
            r14 = 4
            if (r1 == r14) goto L_0x0065
            r14 = 5
            if (r1 == r14) goto L_0x0063
            goto L_0x0073
        L_0x0063:
            monitor-exit(r12)
            return
        L_0x0065:
            monitor-exit(r12)
            return
        L_0x0067:
            boolean r14 = com.facetec.sdk.C2885cd.m11837f(r14, r15)     // Catch:{ all -> 0x0104 }
            if (r14 != 0) goto L_0x006f
            monitor-exit(r12)
            return
        L_0x006f:
            com.facetec.sdk.cg$b r14 = com.facetec.sdk.C2888cg.C2891b.ID_SCAN     // Catch:{ all -> 0x0104 }
            r12.f9578y = r14     // Catch:{ all -> 0x0104 }
        L_0x0073:
            java.util.Timer r14 = r12.f9574u     // Catch:{ all -> 0x0104 }
            monitor-enter(r14)     // Catch:{ all -> 0x0104 }
            r12.m11947y()     // Catch:{ all -> 0x00f8 }
            com.facetec.sdk.da r15 = new com.facetec.sdk.da     // Catch:{ all -> 0x00f8 }
            com.facetec.sdk.hc r1 = new com.facetec.sdk.hc     // Catch:{ all -> 0x00f8 }
            r1.<init>(r12)     // Catch:{ all -> 0x00f8 }
            r15.<init>(r1)     // Catch:{ all -> 0x00f8 }
            r12.f9556C = r15     // Catch:{ all -> 0x00f8 }
            java.util.Timer r1 = r12.f9574u     // Catch:{ all -> 0x00f8 }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x00ef }
            r9 = 10000(0x2710, double:4.9407E-320)
            java.lang.Long r7 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x00ef }
            r6[r5] = r7     // Catch:{ all -> 0x00ef }
            r9 = 60
            java.lang.Long r7 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x00ef }
            r6[r8] = r7     // Catch:{ all -> 0x00ef }
            r6[r0] = r15     // Catch:{ all -> 0x00ef }
            byte r15 = r3[r4]     // Catch:{ all -> 0x00ef }
            byte r15 = (byte) r15     // Catch:{ all -> 0x00ef }
            r7 = 178(0xb2, float:2.5E-43)
            short r7 = (short) r7     // Catch:{ all -> 0x00ef }
            r9 = 213(0xd5, float:2.98E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x00ef }
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ all -> 0x00ef }
            m11905ag(r15, r7, r9, r10)     // Catch:{ all -> 0x00ef }
            r15 = r10[r0]     // Catch:{ all -> 0x00ef }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x00ef }
            java.lang.Class r15 = java.lang.Class.forName(r15)     // Catch:{ all -> 0x00ef }
            r7 = 62
            byte r7 = r3[r7]     // Catch:{ all -> 0x00ef }
            byte r7 = (byte) r7     // Catch:{ all -> 0x00ef }
            int r10 = r9 + -4
            short r10 = (short) r10     // Catch:{ all -> 0x00ef }
            java.lang.Object[] r11 = new java.lang.Object[r8]     // Catch:{ all -> 0x00ef }
            m11905ag(r7, r9, r10, r11)     // Catch:{ all -> 0x00ef }
            r7 = r11[r0]     // Catch:{ all -> 0x00ef }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x00ef }
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{ all -> 0x00ef }
            byte r3 = r3[r4]     // Catch:{ all -> 0x00ef }
            byte r3 = (byte) r3     // Catch:{ all -> 0x00ef }
            r4 = r3 | 48
            short r4 = (short) r4     // Catch:{ all -> 0x00ef }
            r9 = 209(0xd1, float:2.93E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x00ef }
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ all -> 0x00ef }
            m11905ag(r3, r4, r9, r10)     // Catch:{ all -> 0x00ef }
            r3 = r10[r0]     // Catch:{ all -> 0x00ef }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00ef }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x00ef }
            r2[r0] = r3     // Catch:{ all -> 0x00ef }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x00ef }
            r2[r8] = r0     // Catch:{ all -> 0x00ef }
            r2[r5] = r0     // Catch:{ all -> 0x00ef }
            java.lang.reflect.Method r15 = r15.getMethod(r7, r2)     // Catch:{ all -> 0x00ef }
            r15.invoke(r1, r6)     // Catch:{ all -> 0x00ef }
            monitor-exit(r14)     // Catch:{ all -> 0x00f8 }
            m11895a((android.content.Context) r13)     // Catch:{ all -> 0x0104 }
            monitor-exit(r12)
            return
        L_0x00ef:
            r13 = move-exception
            java.lang.Throwable r15 = r13.getCause()     // Catch:{ all -> 0x00f8 }
            if (r15 == 0) goto L_0x00f7
            throw r15     // Catch:{ all -> 0x00f8 }
        L_0x00f7:
            throw r13     // Catch:{ all -> 0x00f8 }
        L_0x00f8:
            r13 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x0104 }
            throw r13     // Catch:{ all -> 0x0104 }
        L_0x00fb:
            r13 = move-exception
            java.lang.Throwable r14 = r13.getCause()     // Catch:{ all -> 0x0104 }
            if (r14 == 0) goto L_0x0103
            throw r14     // Catch:{ all -> 0x0104 }
        L_0x0103:
            throw r13     // Catch:{ all -> 0x0104 }
        L_0x0104:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2888cg.mo9011b(android.content.Context, boolean, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo9013c() {
        int i = f9547O + 69;
        int i2 = i % 128;
        f9548S = i2;
        if (i % 2 == 0) {
            C3604u uVar = this.f9579z;
            if (uVar == null) {
                int i3 = i2 + 95;
                f9547O = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            uVar.mo10068d();
            return;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo9020e(C2892c cVar) {
        Iterator<WeakReference<C2892c>> it = this.f9563j.iterator();
        while (true) {
            char c = 0;
            if (it.hasNext()) {
                if (it.next().get() != cVar) {
                    c = 'J';
                }
                if (c == 0) {
                    int i = f9547O + 61;
                    f9548S = i % 128;
                    int i2 = i % 2;
                    it.remove();
                    int i3 = f9548S + 57;
                    f9547O = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo9016d() {
        int i = f9548S + 71;
        f9547O = i % 128;
        if ((i % 2 == 0 ? 'I' : ':') != ':') {
            int i2 = 50 / 0;
            if (!(this.f9579z != null)) {
                return;
            }
        } else {
            if (!(this.f9579z != null)) {
                return;
            }
        }
        if (this.f9578y != C2891b.ID_SCAN) {
            this.f9579z.mo10063a(false);
            int i3 = f9548S + 27;
            f9547O = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo9014c(C2892c cVar) {
        this.f9563j.add(new WeakReference(cVar));
        int i = f9548S + 95;
        f9547O = i % 128;
        if ((i % 2 == 0 ? 0 : 'E') == 0) {
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m11913c(Context context) {
        int i = f9547O + 123;
        f9548S = i % 128;
        int i2 = i % 2;
        if ((this.f9555B ? '?' : '_') != '_') {
            C3280k.m13162d(context);
            int i3 = f9548S + 75;
            f9547O = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo9017d(C2894e eVar) {
        Iterator<WeakReference<C2894e>> it = this.f9559f.iterator();
        while (true) {
            if ((it.hasNext() ? '-' : '_') != '-') {
                int i = f9547O + 123;
                f9548S = i % 128;
                int i2 = i % 2;
            } else {
                int i3 = f9547O + 1;
                f9548S = i3 % 128;
                int i4 = i3 % 2;
                if ((it.next().get() == eVar ? '[' : 8) != 8) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: e */
    private void m11920e(Context context) {
        int i = f9548S + 77;
        f9547O = i % 128;
        int i2 = i % 2;
        if ((C2862bv.m11671b(context) ? 'b' : '>') != '>') {
            C2885cd.m11763B();
        }
        if (this.f9555B) {
            int i3 = f9547O + 9;
            f9548S = i3 % 128;
            char c = i3 % 2 != 0 ? 'R' : 12;
            C2885cd.m11766D();
            if (c != 12) {
                int i4 = 67 / 0;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        com.facetec.sdk.C2885cd.m11852o(r4, r8.booleanValue(), r5, r6, r7);
        r3.f9564k = com.facetec.sdk.C2885cd.m11856s();
        r3.f9566m = com.facetec.sdk.C2885cd.m11861v();
        m11871D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000c, code lost:
        r0 = r3.f9577x + 1;
        r3.f9577x = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 >= 4) goto L_0x0016;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11915c(byte[] r4, int r5, int r6, int r7, java.lang.Boolean r8) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f9576w
            monitor-enter(r0)
            com.facetec.sdk.cg$b r1 = r3.f9578y     // Catch:{ all -> 0x002d }
            com.facetec.sdk.cg$b r2 = com.facetec.sdk.C2888cg.C2891b.ID_SCAN     // Catch:{ all -> 0x002d }
            if (r1 == r2) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x000b:
            monitor-exit(r0)
            int r0 = r3.f9577x
            int r0 = r0 + 1
            r3.f9577x = r0
            r1 = 4
            if (r0 >= r1) goto L_0x0016
            return
        L_0x0016:
            boolean r8 = r8.booleanValue()
            com.facetec.sdk.C2885cd.m11852o(r4, r8, r5, r6, r7)
            com.facetec.sdk.cf r4 = com.facetec.sdk.C2885cd.m11856s()
            r3.f9564k = r4
            com.facetec.sdk.ce r4 = com.facetec.sdk.C2885cd.m11861v()
            r3.f9566m = r4
            r3.m11871D()
            return
        L_0x002d:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2888cg.m11915c(byte[], int, int, int, java.lang.Boolean):void");
    }

    /* renamed from: a */
    private static void m11895a(Context context) {
        int i = f9547O + 5;
        f9548S = i % 128;
        int i2 = i % 2;
        C2885cd.m11781N(f9550b);
        C2885cd.m11783P(UUID.nameUUIDFromBytes(C2840bg.m11351b(context).getBytes()).toString());
        Object[] objArr = new Object[1];
        m11902ad(new int[]{0, 7, 0, 0}, "\u0000\u0001\u0000\u0001\u0000\u0000\u0001", true, objArr);
        C2885cd.m11782O(((String) objArr[0]).intern());
        C2885cd.m11785R(Build.MODEL);
        C2885cd.m11784Q(Build.VERSION.RELEASE);
        C2885cd.m11786S(context.getPackageName());
        Locale locale = Locale.getDefault();
        C2885cd.m11789V(locale.getLanguage());
        C2885cd.m11788U(locale.toString());
        C2885cd.m11787T("9.6.41");
        C2885cd.m11791X(C2795aq.m10866c());
        C2885cd.m11790W(C2795aq.m10861a(context));
        int i3 = f9548S + 99;
        f9547O = i3 % 128;
        int i4 = i3 % 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m11921e(byte[] bArr, int i, int i2, int i3, Boolean bool) {
        boolean z = true;
        int i4 = f9548S + 1;
        f9547O = i4 % 128;
        int i5 = i4 % 2;
        try {
            C2891b bVar = this.f9578y;
            if ((bVar == C2891b.PRE_SESSION ? 10 : '\'') != '\'') {
                int i6 = f9548S + 107;
                f9547O = i6 % 128;
                if (i6 % 2 == 0) {
                    z = false;
                }
                if (z) {
                    m11911b(bArr, i, i2, i3, bool);
                } else {
                    m11911b(bArr, i, i2, i3, bool);
                    throw null;
                }
            } else {
                if ((bVar == C2891b.ID_SCAN ? ':' : ',') != ':') {
                    m11897a(bArr, i, i2, i3, bool);
                } else {
                    int i7 = f9548S + 25;
                    f9547O = i7 % 128;
                    int i8 = i7 % 2;
                    m11915c(bArr, i, i2, i3, bool);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        } finally {
            m11943u();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo9018d(boolean z) {
        boolean z2;
        synchronized (this.f9576w) {
            C2891b bVar = this.f9578y;
            if (bVar != C2891b.PROCESSING) {
                if (bVar != C2891b.WAITING_TO_FINISH) {
                    z2 = false;
                }
            }
            this.f9578y = C2891b.FINISHED;
            z2 = true;
        }
        C2920cv.m12195c(new C3702yb());
        m11947y();
        mo9010b();
        if (z2) {
            C2885cd.m11796a(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m11910b(byte[] bArr) {
        int i = f9547O + 33;
        f9548S = i % 128;
        int i2 = i % 2;
        this.f9579z.mo10067c(bArr);
        int i3 = f9548S + 117;
        f9547O = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 71 / 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        r1.put("metadata", new org.json.JSONArray(r4));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x001a */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11914c(java.lang.String r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "metadata"
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x001a }
            r2.<init>(r4)     // Catch:{ JSONException -> 0x001a }
            r1.put(r0, r2)     // Catch:{ JSONException -> 0x001a }
            int r4 = f9548S
            int r4 = r4 + 125
            int r0 = r4 % 128
            f9547O = r0
            int r4 = r4 % 2
            goto L_0x0022
        L_0x001a:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x003d }
            r2.<init>(r4)     // Catch:{ JSONException -> 0x003d }
            r1.put(r0, r2)     // Catch:{ JSONException -> 0x003d }
        L_0x0022:
            java.lang.String r4 = r1.toString()
            com.facetec.sdk.C2885cd.m11779L(r3, r4)
            int r3 = f9548S
            int r3 = r3 + 39
            int r4 = r3 % 128
            f9547O = r4
            int r3 = r3 % 2
            if (r3 != 0) goto L_0x0037
            r3 = 0
            goto L_0x0038
        L_0x0037:
            r3 = 1
        L_0x0038:
            if (r3 == 0) goto L_0x003b
            return
        L_0x003b:
            r3 = 0
            throw r3
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2888cg.m11914c(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        m11945w();
        r4 = r13;
        com.facetec.sdk.C2885cd.m11842i(r1.f9555B, r4, java.lang.System.currentTimeMillis(), r17.booleanValue(), r14, r15, r16, true);
        r1.f9572s = com.facetec.sdk.C2885cd.m11839h();
        r1.f9570q = com.facetec.sdk.C2885cd.m11843j();
        r1.f9571r = com.facetec.sdk.C2885cd.m11846l();
        r1.f9573t = com.facetec.sdk.C2885cd.m11851o();
        m11948z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0048, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000d, code lost:
        r0 = r1.f9577x + 1;
        r1.f9577x = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        if (r0 >= 4) goto L_0x0017;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11911b(byte[] r13, int r14, int r15, int r16, java.lang.Boolean r17) {
        /*
            r12 = this;
            r1 = r12
            java.lang.Object r2 = r1.f9576w
            monitor-enter(r2)
            com.facetec.sdk.cg$b r0 = r1.f9578y     // Catch:{ all -> 0x0049 }
            com.facetec.sdk.cg$b r3 = com.facetec.sdk.C2888cg.C2891b.PRE_SESSION     // Catch:{ all -> 0x0049 }
            if (r0 == r3) goto L_0x000c
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            return
        L_0x000c:
            monitor-exit(r2)
            int r0 = r1.f9577x
            int r0 = r0 + 1
            r1.f9577x = r0
            r2 = 4
            if (r0 >= r2) goto L_0x0017
            return
        L_0x0017:
            r12.m11945w()
            long r5 = java.lang.System.currentTimeMillis()
            boolean r3 = r1.f9555B
            boolean r7 = r17.booleanValue()
            r11 = 1
            r4 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            com.facetec.sdk.C2885cd.m11842i(r3, r4, r5, r7, r8, r9, r10, r11)
            com.facetec.sdk.cl r0 = com.facetec.sdk.C2885cd.m11839h()
            r1.f9572s = r0
            com.facetec.sdk.ci r0 = com.facetec.sdk.C2885cd.m11843j()
            r1.f9570q = r0
            com.facetec.sdk.ch r0 = com.facetec.sdk.C2885cd.m11846l()
            r1.f9571r = r0
            com.facetec.sdk.cj r0 = com.facetec.sdk.C2885cd.m11851o()
            r1.f9573t = r0
            r12.m11948z()
            return
        L_0x0049:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2888cg.m11911b(byte[], int, int, int, java.lang.Boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo9019d(byte[] bArr, int i, int i2, int i3, Boolean bool) {
        this.f9569p = new C2890a(bArr, i, i2);
        if (this.f9557D == null) {
            this.f9557D = new Date();
        }
        if (this.f9578y != C2891b.ID_SCAN) {
            int i4 = f9547O + 93;
            f9548S = i4 % 128;
            int i5 = i4 % 2;
            if (this.f9579z.mo10069e()) {
                if ((bArr.length > 0 ? (char) 3 : 8) != 8) {
                    if ((i <= 25 ? 'A' : '5') == '5' || i2 > 25) {
                        this.f9560g.execute(new C3722za(this, C3711z.m13954e(bArr, i, i2)));
                    }
                }
            }
        }
        if (!m11940r()) {
            int i6 = f9547O + 73;
            f9548S = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        } else if (this.f9554A.tryAcquire()) {
            this.f9558I = true;
            try {
                this.f9562i.execute(new C3639vb(this, bArr, i, i2, i3, bool));
            } catch (RejectedExecutionException unused) {
                m11943u();
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    @com.guardsquare.dexguard.annotation.VirtualizeCode
    /* renamed from: a */
    final synchronized boolean mo9009a(android.content.Context r14, java.lang.String r15) {
        /*
            r13 = this;
            monitor-enter(r13)
            r0 = 0
            r13.f9577x = r0     // Catch:{ all -> 0x0177 }
            int[] r1 = com.facetec.sdk.C2888cg.C28893.f9580b     // Catch:{ all -> 0x0177 }
            com.facetec.sdk.cg$b r2 = r13.f9578y     // Catch:{ all -> 0x0177 }
            byte[] r3 = f9552d     // Catch:{ all -> 0x016e }
            r4 = 36
            byte r5 = r3[r4]     // Catch:{ all -> 0x016e }
            byte r5 = (byte) r5     // Catch:{ all -> 0x016e }
            r6 = r5 | 99
            short r6 = (short) r6     // Catch:{ all -> 0x016e }
            int r7 = f9549a     // Catch:{ all -> 0x016e }
            r7 = r7 | 208(0xd0, float:2.91E-43)
            short r7 = (short) r7     // Catch:{ all -> 0x016e }
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x016e }
            m11905ag(r5, r6, r7, r9)     // Catch:{ all -> 0x016e }
            r5 = r9[r0]     // Catch:{ all -> 0x016e }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x016e }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x016e }
            r6 = 17
            byte r6 = r3[r6]     // Catch:{ all -> 0x016e }
            byte r6 = (byte) r6     // Catch:{ all -> 0x016e }
            r7 = 46
            byte r7 = r3[r7]     // Catch:{ all -> 0x016e }
            short r7 = (short) r7     // Catch:{ all -> 0x016e }
            r9 = r7 | 221(0xdd, float:3.1E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x016e }
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ all -> 0x016e }
            m11905ag(r6, r7, r9, r10)     // Catch:{ all -> 0x016e }
            r6 = r10[r0]     // Catch:{ all -> 0x016e }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x016e }
            r7 = 0
            java.lang.reflect.Method r5 = r5.getMethod(r6, r7)     // Catch:{ all -> 0x016e }
            java.lang.Object r2 = r5.invoke(r2, r7)     // Catch:{ all -> 0x016e }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x016e }
            int r2 = r2.intValue()     // Catch:{ all -> 0x016e }
            r1 = r1[r2]     // Catch:{ all -> 0x0177 }
            r2 = 3
            r5 = 2
            if (r1 == r8) goto L_0x006e
            if (r1 == r5) goto L_0x006e
            if (r1 == r2) goto L_0x0059
            r6 = 4
            if (r1 == r6) goto L_0x006e
            goto L_0x00e6
        L_0x0059:
            boolean r1 = com.facetec.sdk.C2780ai.f8828e     // Catch:{ all -> 0x0177 }
            if (r1 == 0) goto L_0x0063
            com.facetec.sdk.C2885cd.m11796a((boolean) r8)     // Catch:{ all -> 0x0177 }
            com.facetec.sdk.C2885cd.m11831d((java.lang.String) r15)     // Catch:{ all -> 0x0177 }
        L_0x0063:
            com.facetec.sdk.C2885cd.m11832e()     // Catch:{ all -> 0x0177 }
            com.facetec.sdk.cg$b r15 = com.facetec.sdk.C2888cg.C2891b.PROCESSING     // Catch:{ all -> 0x0177 }
            r13.f9578y = r15     // Catch:{ all -> 0x0177 }
            m11942t()     // Catch:{ all -> 0x0177 }
            goto L_0x00e6
        L_0x006e:
            boolean r15 = com.facetec.sdk.C2885cd.m11831d((java.lang.String) r15)     // Catch:{ all -> 0x0177 }
            if (r15 != 0) goto L_0x0076
            monitor-exit(r13)
            return r0
        L_0x0076:
            com.facetec.sdk.cg$b r15 = com.facetec.sdk.C2888cg.C2891b.PROCESSING     // Catch:{ all -> 0x0177 }
            r13.f9578y = r15     // Catch:{ all -> 0x0177 }
            r13.m11920e((android.content.Context) r14)     // Catch:{ all -> 0x0177 }
            boolean r15 = r13.f9555B     // Catch:{ all -> 0x0177 }
            if (r15 == 0) goto L_0x0084
            com.facetec.sdk.C3280k.m13160b()     // Catch:{ all -> 0x0177 }
        L_0x0084:
            com.facetec.sdk.C3280k.m13161d()     // Catch:{ all -> 0x0177 }
            java.lang.String r15 = com.facetec.sdk.C2790am.f8902S     // Catch:{ all -> 0x0177 }
            int r1 = com.facetec.sdk.C2840bg.m11380i(r14)     // Catch:{ all -> 0x0177 }
            com.facetec.sdk.C2885cd.m11776I(r15, r1)     // Catch:{ all -> 0x0177 }
            java.lang.String r15 = com.facetec.sdk.C2790am.f8903W     // Catch:{ all -> 0x0177 }
            boolean r1 = com.facetec.sdk.C2827ba.f9071d     // Catch:{ all -> 0x0177 }
            com.facetec.sdk.C2885cd.m11777J(r15, r1)     // Catch:{ all -> 0x0177 }
            boolean r15 = com.facetec.sdk.C2827ba.f9071d     // Catch:{ all -> 0x0177 }
            java.lang.String r1 = com.facetec.sdk.C2790am.f8903W     // Catch:{ all -> 0x0177 }
            com.facetec.sdk.C2885cd.m11780M(r1, r15)     // Catch:{ all -> 0x0177 }
            com.facetec.sdk.rb r15 = new com.facetec.sdk.rb     // Catch:{ all -> 0x0177 }
            r15.<init>(r13, r14)     // Catch:{ all -> 0x0177 }
            com.facetec.sdk.C2920cv.m12195c(r15)     // Catch:{ all -> 0x0177 }
            r15 = 267(0x10b, float:3.74E-43)
            byte r15 = r3[r15]     // Catch:{ all -> 0x0177 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0177 }
            r1 = 98
            short r1 = (short) r1     // Catch:{ all -> 0x0177 }
            r6 = 204(0xcc, float:2.86E-43)
            short r6 = (short) r6     // Catch:{ all -> 0x0177 }
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x0177 }
            m11905ag(r15, r1, r6, r9)     // Catch:{ all -> 0x0177 }
            r15 = r9[r0]     // Catch:{ all -> 0x0177 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x0177 }
            java.lang.Class r15 = java.lang.Class.forName(r15)     // Catch:{ all -> 0x0177 }
            r1 = 241(0xf1, float:3.38E-43)
            byte r1 = r3[r1]     // Catch:{ all -> 0x0177 }
            byte r1 = (byte) r1     // Catch:{ all -> 0x0177 }
            r6 = 148(0x94, float:2.07E-43)
            short r6 = (short) r6     // Catch:{ all -> 0x0177 }
            r9 = r6 | 73
            short r9 = (short) r9     // Catch:{ all -> 0x0177 }
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ all -> 0x0177 }
            m11905ag(r1, r6, r9, r10)     // Catch:{ all -> 0x0177 }
            r1 = r10[r0]     // Catch:{ all -> 0x0177 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0177 }
            java.lang.reflect.Field r15 = r15.getField(r1)     // Catch:{ all -> 0x0177 }
            int r15 = r15.getInt(r7)     // Catch:{ all -> 0x0177 }
            r1 = 23
            if (r15 < r1) goto L_0x00e6
            com.facetec.sdk.sb r15 = new com.facetec.sdk.sb     // Catch:{ all -> 0x0177 }
            r15.<init>(r14)     // Catch:{ all -> 0x0177 }
            com.facetec.sdk.C2920cv.m12196e(r15)     // Catch:{ all -> 0x0177 }
        L_0x00e6:
            java.util.Timer r15 = r13.f9574u     // Catch:{ all -> 0x0177 }
            monitor-enter(r15)     // Catch:{ all -> 0x0177 }
            r13.m11947y()     // Catch:{ all -> 0x016b }
            com.facetec.sdk.da r1 = new com.facetec.sdk.da     // Catch:{ all -> 0x016b }
            com.facetec.sdk.tb r6 = new com.facetec.sdk.tb     // Catch:{ all -> 0x016b }
            r6.<init>(r13)     // Catch:{ all -> 0x016b }
            r1.<init>(r6)     // Catch:{ all -> 0x016b }
            r13.f9556C = r1     // Catch:{ all -> 0x016b }
            java.util.Timer r6 = r13.f9574u     // Catch:{ all -> 0x016b }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0162 }
            r9 = 10000(0x2710, double:4.9407E-320)
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0162 }
            r7[r5] = r9     // Catch:{ all -> 0x0162 }
            r9 = 60
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0162 }
            r7[r8] = r9     // Catch:{ all -> 0x0162 }
            r7[r0] = r1     // Catch:{ all -> 0x0162 }
            byte r1 = r3[r4]     // Catch:{ all -> 0x0162 }
            byte r1 = (byte) r1     // Catch:{ all -> 0x0162 }
            r9 = 178(0xb2, float:2.5E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x0162 }
            r10 = 213(0xd5, float:2.98E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x0162 }
            java.lang.Object[] r11 = new java.lang.Object[r8]     // Catch:{ all -> 0x0162 }
            m11905ag(r1, r9, r10, r11)     // Catch:{ all -> 0x0162 }
            r1 = r11[r0]     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0162 }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0162 }
            r9 = 62
            byte r9 = r3[r9]     // Catch:{ all -> 0x0162 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x0162 }
            int r11 = r10 + -4
            short r11 = (short) r11     // Catch:{ all -> 0x0162 }
            java.lang.Object[] r12 = new java.lang.Object[r8]     // Catch:{ all -> 0x0162 }
            m11905ag(r9, r10, r11, r12)     // Catch:{ all -> 0x0162 }
            r9 = r12[r0]     // Catch:{ all -> 0x0162 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0162 }
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{ all -> 0x0162 }
            byte r3 = r3[r4]     // Catch:{ all -> 0x0162 }
            byte r3 = (byte) r3     // Catch:{ all -> 0x0162 }
            r4 = r3 | 48
            short r4 = (short) r4     // Catch:{ all -> 0x0162 }
            r10 = 209(0xd1, float:2.93E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x0162 }
            java.lang.Object[] r11 = new java.lang.Object[r8]     // Catch:{ all -> 0x0162 }
            m11905ag(r3, r4, r10, r11)     // Catch:{ all -> 0x0162 }
            r3 = r11[r0]     // Catch:{ all -> 0x0162 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0162 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0162 }
            r2[r0] = r3     // Catch:{ all -> 0x0162 }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x0162 }
            r2[r8] = r0     // Catch:{ all -> 0x0162 }
            r2[r5] = r0     // Catch:{ all -> 0x0162 }
            java.lang.reflect.Method r0 = r1.getMethod(r9, r2)     // Catch:{ all -> 0x0162 }
            r0.invoke(r6, r7)     // Catch:{ all -> 0x0162 }
            monitor-exit(r15)     // Catch:{ all -> 0x016b }
            m11895a((android.content.Context) r14)     // Catch:{ all -> 0x0177 }
            monitor-exit(r13)
            return r8
        L_0x0162:
            r14 = move-exception
            java.lang.Throwable r0 = r14.getCause()     // Catch:{ all -> 0x016b }
            if (r0 == 0) goto L_0x016a
            throw r0     // Catch:{ all -> 0x016b }
        L_0x016a:
            throw r14     // Catch:{ all -> 0x016b }
        L_0x016b:
            r14 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x0177 }
            throw r14     // Catch:{ all -> 0x0177 }
        L_0x016e:
            r14 = move-exception
            java.lang.Throwable r15 = r14.getCause()     // Catch:{ all -> 0x0177 }
            if (r15 == 0) goto L_0x0176
            throw r15     // Catch:{ all -> 0x0177 }
        L_0x0176:
            throw r14     // Catch:{ all -> 0x0177 }
        L_0x0177:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2888cg.mo9009a(android.content.Context, java.lang.String):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m11908b(Context context) {
        C2809aw.m10980c("UMT");
        C2809aw.m10981d("UMT");
        C2809aw.m10980c("UDT");
        HashMap<String, UsbDevice> deviceList = ((UsbManager) context.getSystemService("usb")).getDeviceList();
        C2809aw.m10981d("UDT");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        Iterator<UsbDevice> it = deviceList.values().iterator();
        boolean z = false;
        while (true) {
            if ((it.hasNext() ? 'Y' : 'G') != 'G') {
                int i = f9548S + 81;
                f9547O = i % 128;
                int i2 = i % 2;
                UsbDevice next = it.next();
                if (next != null) {
                    int i3 = f9547O + 107;
                    f9548S = i3 % 128;
                    int i4 = i3 % 2;
                    String deviceName = next.getDeviceName();
                    String valueOf = String.valueOf(next.getDeviceClass());
                    String str = "FT_NULL";
                    String trim = next.getManufacturerName() != null ? next.getManufacturerName().trim() : str;
                    if (next.getProductName() != null) {
                        str = next.getProductName().trim();
                    }
                    sb.append(deviceName);
                    byte b = (byte) 74;
                    short s = (short) 164;
                    short s2 = (short) 227;
                    Object[] objArr = new Object[1];
                    m11905ag(b, s, s2, objArr);
                    sb.append((String) objArr[0]);
                    sb2.append(valueOf);
                    Object[] objArr2 = new Object[1];
                    m11905ag(b, s, s2, objArr2);
                    sb2.append((String) objArr2[0]);
                    sb3.append(trim);
                    Object[] objArr3 = new Object[1];
                    m11905ag(b, s, s2, objArr3);
                    sb3.append((String) objArr3[0]);
                    sb4.append(str);
                    Object[] objArr4 = new Object[1];
                    m11905ag(b, s, s2, objArr4);
                    sb4.append((String) objArr4[0]);
                    z = true;
                }
            } else {
                C2885cd.m11777J(C2790am.f8887D, z);
                C2885cd.m11768E(C2790am.f8929z, sb.toString());
                C2885cd.m11768E(C2790am.f8884A, sb2.toString());
                C2885cd.m11768E(C2790am.f8886C, sb3.toString());
                C2885cd.m11768E(C2790am.f8888E, sb4.toString());
                C2885cd.m11768E(C2790am.f8896M, String.valueOf(C2809aw.m10979b("UMT")));
                C2885cd.m11768E(C2790am.f8893J, String.valueOf(C2809aw.m10979b("UDT")));
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        r5 = r14;
        com.facetec.sdk.C2885cd.m11842i(r1.f9555B, r5, java.lang.System.currentTimeMillis(), r18.booleanValue(), r15, r16, r17, false);
        r1.f9567n = com.facetec.sdk.C2885cd.m11836f();
        r1.f9568o = com.facetec.sdk.C2885cd.m11858t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        if (r1.f9567n.mo9007e() == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        r1.f9578y = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        r0 = r1.f9567n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        if (r0 == com.facetec.sdk.C2884cc.f9511c) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (r0 == com.facetec.sdk.C2884cc.f9512d) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r0 != com.facetec.sdk.C2884cc.f9509a) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        r1.f9578y = r3;
        mo9010b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        m11870C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        r0 = r1.f9577x + 1;
        r1.f9577x = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r0 >= 4) goto L_0x001a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11897a(byte[] r14, int r15, int r16, int r17, java.lang.Boolean r18) {
        /*
            r13 = this;
            r1 = r13
            java.lang.Object r2 = r1.f9576w
            monitor-enter(r2)
            com.facetec.sdk.cg$b r0 = r1.f9578y     // Catch:{ all -> 0x005d }
            com.facetec.sdk.cg$b r3 = com.facetec.sdk.C2888cg.C2891b.FINISHED     // Catch:{ all -> 0x005d }
            if (r0 == r3) goto L_0x005b
            com.facetec.sdk.cg$b r3 = com.facetec.sdk.C2888cg.C2891b.WAITING_TO_FINISH     // Catch:{ all -> 0x005d }
            if (r0 != r3) goto L_0x000f
            goto L_0x005b
        L_0x000f:
            monitor-exit(r2)
            int r0 = r1.f9577x
            int r0 = r0 + 1
            r1.f9577x = r0
            r2 = 4
            if (r0 >= r2) goto L_0x001a
            return
        L_0x001a:
            long r6 = java.lang.System.currentTimeMillis()
            boolean r4 = r1.f9555B
            boolean r8 = r18.booleanValue()
            r12 = 0
            r5 = r14
            r9 = r15
            r10 = r16
            r11 = r17
            com.facetec.sdk.C2885cd.m11842i(r4, r5, r6, r8, r9, r10, r11, r12)
            com.facetec.sdk.cc r0 = com.facetec.sdk.C2885cd.m11836f()
            r1.f9567n = r0
            com.facetec.sdk.by r0 = com.facetec.sdk.C2885cd.m11858t()
            r1.f9568o = r0
            com.facetec.sdk.cc r0 = r1.f9567n
            boolean r0 = r0.mo9007e()
            if (r0 == 0) goto L_0x0044
            r1.f9578y = r3
        L_0x0044:
            com.facetec.sdk.cc r0 = r1.f9567n
            com.facetec.sdk.cc r2 = com.facetec.sdk.C2884cc.PROCESSING_COMPLETE_TIMED_OUT
            if (r0 == r2) goto L_0x0052
            com.facetec.sdk.cc r2 = com.facetec.sdk.C2884cc.PROCESSING_COMPLETE_RETRY
            if (r0 == r2) goto L_0x0052
            com.facetec.sdk.cc r2 = com.facetec.sdk.C2884cc.PROCESSING_COMPLETE_SUCCESS
            if (r0 != r2) goto L_0x0057
        L_0x0052:
            r1.f9578y = r3
            r13.mo9010b()
        L_0x0057:
            r13.m11870C()
            return
        L_0x005b:
            monitor-exit(r2)     // Catch:{ all -> 0x005d }
            return
        L_0x005d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2888cg.m11897a(byte[], int, int, int, java.lang.Boolean):void");
    }
}

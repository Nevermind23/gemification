package com.facetec.sdk;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.core.widget.C1314o;
import com.facetec.sdk.C2792ao;
import com.facetec.sdk.C2831bd;
import com.facetec.sdk.C2888cg;
import com.facetec.sdk.C2906co;
import com.facetec.sdk.C2949dl;
import com.facetec.sdk.FaceTecCancelButtonCustomization;
import com.facetec.sdk.FaceTecVocalGuidanceCustomization;
import com.github.mikephil.charting.utils.Utils;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;

/* renamed from: com.facetec.sdk.at */
public final class C2799at extends C2792ao {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    public static final byte[] $$d = null;
    public static final int $$e = 0;

    /* renamed from: E */
    private static byte[] f8962E;

    /* renamed from: I */
    private static long f8963I;

    /* renamed from: b */
    public static boolean f8964b = false;

    /* renamed from: e */
    public static final int f8965e = 0;

    /* renamed from: A */
    private Handler f8966A;

    /* renamed from: B */
    private final C2888cg.C2892c f8967B = new C3332l1(this);

    /* renamed from: C */
    private final Runnable f8968C = new C3282k1(this);

    /* renamed from: D */
    private boolean f8969D = false;

    /* renamed from: a */
    private LinearLayout f8970a;

    /* renamed from: c */
    public ImageView f8971c;

    /* renamed from: d */
    C2895ch f8972d;

    /* renamed from: f */
    private C2801d f8973f;

    /* renamed from: g */
    private View f8974g;

    /* renamed from: h */
    private C2916cu f8975h;

    /* renamed from: i */
    private boolean f8976i = false;

    /* renamed from: j */
    private TextView f8977j;

    /* renamed from: k */
    private FrameLayout f8978k;

    /* renamed from: l */
    private Handler f8979l;

    /* renamed from: m */
    private C2906co f8980m;

    /* renamed from: n */
    private Handler f8981n;

    /* renamed from: o */
    private TextView f8982o;

    /* renamed from: p */
    private boolean f8983p = false;

    /* renamed from: q */
    private boolean f8984q = false;

    /* renamed from: r */
    private boolean f8985r = false;

    /* renamed from: s */
    private boolean f8986s = false;

    /* renamed from: t */
    private Handler f8987t;

    /* renamed from: u */
    private C2884cc f8988u = null;

    /* renamed from: v */
    private final int f8989v = ((int) C2810ax.m10988b(12));

    /* renamed from: w */
    private boolean f8990w = false;

    /* renamed from: x */
    private Semaphore f8991x;

    /* renamed from: y */
    private boolean f8992y = false;

    /* renamed from: z */
    private boolean f8993z = false;

    /* renamed from: com.facetec.sdk.at$2 */
    static /* synthetic */ class C28002 {

        /* renamed from: b */
        static final /* synthetic */ int[] f8994b;

        /* renamed from: e */
        static final /* synthetic */ int[] f8995e;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|5|6|7|8|(2:9|10)|11|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0028 */
        static {
            /*
                com.facetec.sdk.FaceTecCancelButtonCustomization$ButtonLocation[] r0 = com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8994b = r0
                r1 = 1
                com.facetec.sdk.FaceTecCancelButtonCustomization$ButtonLocation r2 = com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.TOP_LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f8994b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facetec.sdk.FaceTecCancelButtonCustomization$ButtonLocation r3 = com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.TOP_RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f8994b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facetec.sdk.FaceTecCancelButtonCustomization$ButtonLocation r3 = com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r2 = f8994b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facetec.sdk.FaceTecCancelButtonCustomization$ButtonLocation r3 = com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.DISABLED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4 = 4
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.facetec.sdk.FaceTecSecurityWatermarkImage[] r2 = com.facetec.sdk.FaceTecSecurityWatermarkImage.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f8995e = r2
                com.facetec.sdk.FaceTecSecurityWatermarkImage r3 = com.facetec.sdk.FaceTecSecurityWatermarkImage.FACETEC_ZOOM     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f8995e     // Catch:{ NoSuchFieldError -> 0x004e }
                com.facetec.sdk.FaceTecSecurityWatermarkImage r2 = com.facetec.sdk.FaceTecSecurityWatermarkImage.FACETEC     // Catch:{ NoSuchFieldError -> 0x004e }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2799at.C28002.<clinit>():void");
        }
    }

    /* renamed from: com.facetec.sdk.at$d */
    protected class C2801d implements C2888cg.C2893d {
        protected C2801d() {
        }

        /* renamed from: b */
        public final void mo8860b(C2884cc ccVar, C2865by byVar) {
            C2799at.this.mo8851b(ccVar, byVar);
        }

        /* renamed from: c */
        public final void mo8861c() {
            C2799at.m10889c(C2799at.this);
            C2799at.this.mo8852c();
        }

        /* renamed from: d */
        public final void mo8862d() {
            C2799at.m10889c(C2799at.this);
            C2799at.this.mo8849a();
        }

        /* renamed from: e */
        public final void mo8863e() {
            C2799at.m10889c(C2799at.this);
            C2799at.this.mo8850b();
        }

        /* renamed from: b */
        public final void mo8859b() {
            C2799at.m10889c(C2799at.this);
            C2799at.this.mo8853d();
        }
    }

    static {
        init$1();
        init$0();
        m10907i();
        m10903g();
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m10880F(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 4
            int r7 = 1 - r7
            byte[] r0 = $$a
            int r8 = 100 - r8
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r1 = new byte[r7]
            int r7 = r7 + -1
            r2 = 0
            if (r0 != 0) goto L_0x0017
            r4 = r6
            r8 = r7
            r3 = r2
            goto L_0x002c
        L_0x0017:
            r3 = r2
        L_0x0018:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L_0x0025
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L_0x0025:
            int r3 = r3 + 1
            byte r4 = r0[r6]
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x002c:
            int r6 = r6 + 1
            int r7 = r7 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2799at.m10880F(int, int, byte, java.lang.Object[]):void");
    }

    /* renamed from: G */
    private static void m10881G(String str, int i, Object[] objArr) {
        Object obj;
        Class<Object> cls;
        Throwable cause;
        if (str != null) {
            obj = str.toCharArray();
        } else {
            obj = str;
        }
        char[] cArr = (char[]) obj;
        C3164gf gfVar = new C3164gf();
        gfVar.f10442c = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        gfVar.f10443d = 0;
        while (true) {
            int i2 = gfVar.f10443d;
            cls = Object.class;
            if (i2 >= cArr.length) {
                break;
            }
            char c = cArr[i2];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[2] = gfVar;
                objArr2[1] = gfVar;
                objArr2[0] = Integer.valueOf(c);
                Map<Integer, Object> map = C2854bp.f9335p;
                Object obj2 = map.get(-1948100533);
                if (obj2 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 1);
                    Object[] objArr3 = new Object[1];
                    m10883J(b, b2, (byte) (b2 - 1), objArr3);
                    obj2 = ((Class) C2854bp.m11559b((char) View.getDefaultSize(0, 0), TextUtils.getCapsMode("", 0, 0) + 1028, Color.red(0) + 31)).getMethod((String) objArr3[0], new Class[]{Integer.TYPE, cls, cls});
                    map.put(-1948100533, obj2);
                }
                jArr[i2] = ((Long) ((Method) obj2).invoke((Object) null, objArr2)).longValue() ^ (f8963I ^ 2872599468212764088L);
                try {
                    Object[] objArr4 = new Object[2];
                    objArr4[1] = gfVar;
                    objArr4[0] = gfVar;
                    Object obj3 = map.get(-1906003808);
                    if (obj3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) b3;
                        Object[] objArr5 = new Object[1];
                        m10883J(b3, b4, (byte) b4, objArr5);
                        obj3 = ((Class) C2854bp.m11559b((char) (PointF.length(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) > Utils.FLOAT_EPSILON ? 1 : (PointF.length(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) == Utils.FLOAT_EPSILON ? 0 : -1)), 1359 - (Process.myTid() >> 22), 23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod((String) objArr5[0], new Class[]{cls, cls});
                        map.put(-1906003808, obj3);
                    }
                    ((Method) obj3).invoke((Object) null, objArr4);
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
        }
        char[] cArr2 = new char[length];
        gfVar.f10443d = 0;
        while (true) {
            int i3 = gfVar.f10443d;
            if (i3 < cArr.length) {
                cArr2[i3] = (char) ((int) jArr[i3]);
                try {
                    Object[] objArr6 = new Object[2];
                    objArr6[1] = gfVar;
                    objArr6[0] = gfVar;
                    Map<Integer, Object> map2 = C2854bp.f9335p;
                    Object obj4 = map2.get(-1906003808);
                    if (obj4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) b5;
                        Object[] objArr7 = new Object[1];
                        m10883J(b5, b6, (byte) b6, objArr7);
                        obj4 = ((Class) C2854bp.m11559b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 1359 - (ViewConfiguration.getEdgeSlop() >> 16), 23 - (TypedValue.complexToFraction(0, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) > Utils.FLOAT_EPSILON ? 1 : (TypedValue.complexToFraction(0, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) == Utils.FLOAT_EPSILON ? 0 : -1)))).getMethod((String) objArr7[0], new Class[]{cls, cls});
                        map2.put(-1906003808, obj4);
                    }
                    ((Method) obj4).invoke((Object) null, objArr6);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            } else {
                objArr[0] = new String(cArr2);
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m10882H(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 4
            int r7 = 16 - r7
            byte[] r0 = f8962E
            int r9 = r9 + 4
            int r8 = 106 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L_0x0015
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            goto L_0x0033
        L_0x0015:
            r3 = r2
        L_0x0016:
            r6 = r9
            r9 = r8
            r8 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L_0x002a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L_0x002a:
            byte r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L_0x0033:
            int r10 = r10 - r8
            int r8 = r10 + 2
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2799at.m10882H(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m10883J(byte r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 3
            int r5 = 4 - r5
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r6 = r6 * 51
            int r6 = r6 + 68
            byte[] r0 = $$d
            byte[] r1 = new byte[r7]
            r2 = -1
            int r7 = r7 + r2
            if (r0 != 0) goto L_0x001b
            r6 = r5
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r8
            r8 = r7
            goto L_0x0037
        L_0x001b:
            r4 = r6
            r6 = r5
            r5 = r4
        L_0x001e:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r1[r2] = r3
            if (r2 != r7) goto L_0x002e
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L_0x002e:
            byte r3 = r0[r6]
            r4 = r8
            r8 = r7
            r7 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r4
        L_0x0037:
            int r7 = -r7
            int r5 = r5 + r7
            int r6 = r6 + 1
            r7 = r8
            r8 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2799at.m10883J(byte, byte, byte, java.lang.Object[]):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m10886a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f8971c.setAlpha(0.4f);
        } else if (motionEvent.getAction() == 3 || motionEvent.getX() < Utils.FLOAT_EPSILON || motionEvent.getX() > ((float) (this.f8971c.getWidth() + this.f8971c.getLeft() + 10)) || motionEvent.getY() < Utils.FLOAT_EPSILON || motionEvent.getY() > ((float) (this.f8971c.getHeight() + this.f8971c.getTop() + 10))) {
            this.f8971c.setAlpha(1.0f);
        } else if (motionEvent.getAction() == 1) {
            this.f8971c.setAlpha(1.0f);
            this.f8971c.setEnabled(false);
            if (m10901f() == null) {
                return false;
            }
            this.f8971c.performClick();
        }
        return true;
    }

    /* renamed from: d */
    private void m10892d(Context context) {
        C3555s.f11477c = C2790am.f8914k;
        this.f8976i = false;
        C2831bd bdVar = (C2831bd) getActivity();
        if (bdVar != null) {
            bdVar.f9166q = C2831bd.C2835e.FACESCAN_SESSION_STARTED;
        }
        this.f8979l.postDelayed(new C2792ao.C2793e(new C3515q1(this, context, bdVar)), 20);
        C3555s.m13902c(C2913cs.FACE_SCAN_UNZOOMED);
    }

    /* renamed from: e */
    static C2799at m10896e() {
        C2799at atVar = new C2799at();
        Bundle bundle = new Bundle();
        bundle.putString("reason", (String) null);
        atVar.setArguments(bundle);
        return atVar;
    }

    static void init$0() {
        $$a = new byte[]{119, 105, -54, -72};
        $$b = 122;
    }

    static void init$1() {
        $$d = new byte[]{33, 9, -75, 75};
        $$e = 226;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo8851b(C2884cc ccVar, C2865by byVar) {
        C2829bc f = m10901f();
        if (isAdded() && f != null) {
            if (this.f8975h.mo9064g() && byVar == C2865by.HOLD_STEADY && !this.f8969D) {
                this.f8977j.animate().alpha(1.0f).setDuration(500).setStartDelay(0).setListener((Animator.AnimatorListener) null).start();
                this.f8969D = true;
            }
            if (!this.f8985r && byVar != C2865by.FACE_NOT_FOUND) {
                this.f8985r = true;
                if (!this.f8983p) {
                    this.f8983p = true;
                    C2863bw.m11682e(f);
                }
                f.mo8917f();
            }
            if (isAdded() && !this.f8976i) {
                C2884cc ccVar2 = this.f8988u;
                if (ccVar2 != ccVar) {
                    if (ccVar2 != null) {
                        m10914l();
                    }
                    this.f8988u = ccVar;
                    this.f8992y = false;
                }
                if (ccVar == C2884cc.ZOOM_CLOSE) {
                    C3555s.f11477c = C2790am.f8917n;
                    if (!this.f8975h.mo9064g()) {
                        C2920cv.m12195c(new C2869c1(this));
                        C2916cu cuVar = this.f8975h;
                        cuVar.setOvalHasExpanded(true);
                        cuVar.mo9062e(cuVar.f9782l);
                        if (C2949dl.m12473a()) {
                            C2949dl.m12472a(getString(C2747R.string.FaceTec_accessibility_feedback_move_phone_closer));
                        }
                        if (FaceTecSDK.f8630e.vocalGuidanceCustomization.mode == FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE) {
                            C2949dl.m12483d(m10901f(), C2949dl.C2951d.FACE_CAPTURE_MOVE_CLOSER_AUTOMATIC);
                            Handler handler = new Handler();
                            this.f8966A = handler;
                            handler.postDelayed(this.f8968C, 4500);
                        }
                        if (FaceTecSDK.f8630e.f8608k.enablePulsatingText) {
                            Handler handler2 = new Handler();
                            this.f8987t = handler2;
                            handler2.postDelayed(new C2792ao.C2793e(new C3450n1(this)), 3000);
                        }
                        C3555s.m13902c(C2913cs.FACE_SCAN_ZOOMED);
                    }
                }
                m10899e(ccVar, byVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo8852c() {
        if (!this.f8993z) {
            this.f8993z = true;
            C2829bc f = m10901f();
            if (isAdded() && f != null) {
                m10891c(new C2792ao.C2793e(new C3150g1(this, f)), true);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8985r = false;
        this.f8983p = false;
        this.f8986s = false;
        this.f8991x = new Semaphore(1);
    }

    public final Animator onCreateAnimator(int i, boolean z, int i2) {
        if (!z) {
            return ObjectAnimator.ofFloat((Object) null, "alpha", new float[]{1.0f, Utils.FLOAT_EPSILON}).setDuration(400);
        }
        return super.onCreateAnimator(i, z, i2);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C2747R.layout.facetec_facescan_fragment, viewGroup, false);
    }

    public final void onPause() {
        Handler handler;
        super.onPause();
        Handler handler2 = this.f8979l;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages((Object) null);
        }
        Handler handler3 = this.f8981n;
        if (handler3 != null) {
            handler3.removeCallbacksAndMessages((Object) null);
        }
        Handler handler4 = this.f8987t;
        if (handler4 != null) {
            handler4.removeCallbacksAndMessages((Object) null);
        }
        C2906co coVar = this.f8980m;
        if (coVar != null && (handler = coVar.f9689i) != null) {
            handler.removeCallbacksAndMessages((Object) null);
            coVar.f9689i = null;
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        View view2 = view;
        super.onViewCreated(view, bundle);
        C2829bc f = m10901f();
        C2888cg j = m10910j();
        if (j != null) {
            C3555s.f11477c = C2790am.f8915l;
            C2801d dVar = new C2801d();
            this.f8973f = dVar;
            j.mo9012b((C2888cg.C2893d) dVar);
            C2899cl o = j.mo9029o();
            C2895ch k = j.mo9027k();
            C2899cl clVar = C2899cl.READY_TO_START_FACESCAN_SESSION;
            if (o != clVar) {
                j.mo9014c(this.f8967B);
            }
            this.f8970a = (LinearLayout) view2.findViewById(C2747R.C2749id.zoomLogoContainer);
            this.f8977j = (TextView) view2.findViewById(C2747R.C2749id.zoomLogoText);
            String packageName = f.getPackageName();
            ImageView imageView = (ImageView) view2.findViewById(C2747R.C2749id.securityWatermark);
            int i = C28002.f8995e[FaceTecSDK.f8630e.securityWatermarkImage.ordinal()];
            if (i == 1) {
                imageView.setImageDrawable(C0767a.m2895e(getActivity(), C2747R.C2748drawable.facetec_internal_zoom_watermark));
            } else if (i == 2) {
                imageView.setImageDrawable(C0767a.m2895e(getActivity(), C2747R.C2748drawable.facetec_internal_facetec_watermark));
            }
            float c = C2938dc.m12372c();
            imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, (int) (((float) Resources.getSystem().getDisplayMetrics().heightPixels) * C2938dc.m12404e() * 0.15f * c)));
            this.f8977j.setVisibility(0);
            this.f8977j.setTextSize(C2938dc.m12404e() * 8.0f * c);
            if (packageName.contains("com.facetec.zoomlogin")) {
                this.f8977j.setText("v9.6.41");
            } else {
                TextView textView = this.f8977j;
                if (Build.CPU_ABI.equals("arm64-v8a")) {
                    str = " 64-bit";
                } else {
                    str = "";
                }
                textView.setText("v9.6.41".concat(str));
            }
            this.f8970a.setPadding(0, 0, 0, 12);
            this.f8975h = (C2916cu) view2.findViewById(C2747R.C2749id.zoomOval);
            this.f8974g = view2.findViewById(C2747R.C2749id.instructionsBackground);
            this.f8971c = (ImageView) view2.findViewById(C2747R.C2749id.zoomBackButton);
            this.f8982o = (TextView) view2.findViewById(C2747R.C2749id.authReasonText);
            C2906co coVar = (C2906co) view2.findViewById(C2747R.C2749id.zoomProgressBar);
            this.f8980m = coVar;
            coVar.setVisibility(4);
            TextView textView2 = (TextView) coVar.findViewById(C2747R.C2749id.zoomFeedbackText);
            coVar.f9683c = textView2;
            textView2.setImportantForAccessibility(2);
            C1314o.m4567i(coVar.f9683c, 1);
            C1314o.m4566h(coVar.f9683c, 5, 50, 1, 2);
            C2865by byVar = C2865by.HOLD_STEADY;
            int b = C2906co.m12120b(byVar);
            if (o == clVar) {
                coVar.f9681a = byVar;
            } else {
                switch (C2906co.C29074.f9693a[k.ordinal()]) {
                    case 1:
                        coVar.f9685e = C2895ch.FRAME_YOUR_FACE;
                        break;
                    case 2:
                        coVar.f9685e = C2895ch.FRAME_YOUR_FACE;
                        break;
                    case 3:
                        coVar.f9685e = C2895ch.WEARING_SUNGLASSES;
                        break;
                    case 4:
                        coVar.f9685e = C2895ch.BAD_POSE;
                        break;
                    case 5:
                        coVar.f9685e = C2895ch.TOO_BRIGHT;
                        break;
                    case 6:
                        coVar.f9685e = C2895ch.TOO_DARK;
                        break;
                    case 7:
                        coVar.f9685e = C2895ch.MAKING_FACE;
                        break;
                    case 8:
                        coVar.f9685e = C2895ch.HOLD_STEADY_3;
                        break;
                    case 9:
                        coVar.f9685e = C2895ch.HOLD_STEADY_2;
                        break;
                    case 10:
                        coVar.f9685e = C2895ch.HOLD_STEADY_1;
                        break;
                    case 11:
                        coVar.f9685e = C2895ch.MOVE_CLOSER;
                        break;
                    case 12:
                        coVar.f9685e = C2895ch.MOVE_AWAY;
                        break;
                }
                b = C2906co.m12118a(coVar.f9685e);
            }
            C2949dl.m12470a(b);
            C2923cy.m12209e(coVar.f9683c, b);
            coVar.f9683c.setTypeface(FaceTecSDK.f8630e.f8608k.textFont);
            C2938dc.m12256a(coVar.f9683c);
            GradientDrawable x = C2938dc.m12461x(coVar.getContext());
            View findViewById = coVar.findViewById(C2747R.C2749id.zoomFeedbackContainer);
            coVar.f9682b = findViewById;
            findViewById.setBackground(x);
            coVar.setPadding(10, 10, 10, 15);
            coVar.f9682b.setElevation(C2810ax.m10988b(FaceTecSDK.f8630e.f8608k.elevation));
            coVar.f9682b.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            coVar.f9682b.setClipToOutline(false);
            coVar.f9682b.requestLayout();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(coVar.f9683c, View.ALPHA, new float[]{0.0f});
            coVar.f9690j = ofFloat;
            ofFloat.setDuration(400);
            coVar.f9690j.addListener(coVar.f9686f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(coVar.f9683c, View.ALPHA, new float[]{1.0f});
            coVar.f9688h = ofFloat2;
            ofFloat2.setDuration(400);
            float b2 = C2810ax.m10988b(C2938dc.m12427i().height) * C2938dc.m12404e();
            float b3 = C2810ax.m10988b(C2938dc.m12427i().width) * C2938dc.m12404e();
            coVar.f9683c.getLayoutParams().height = (int) b2;
            coVar.f9683c.getLayoutParams().width = (int) b3;
            int round = Math.round(C2810ax.m10988b(10) * C2938dc.m12404e() * C2938dc.m12372c());
            coVar.f9683c.setPadding(round, Math.round(((float) round) * 1.1f), round, round);
            coVar.f9683c.requestLayout();
            C2906co coVar2 = this.f8980m;
            if (coVar2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) coVar2.getLayoutParams();
                C2938dc.m12418g();
                layoutParams.addRule(13, -1);
                layoutParams.setMargins(0, 0, 0, 0);
                coVar2.requestLayout();
            }
            this.f8982o.setTypeface(C2839bf.f9198b);
            C2938dc.m12413e(this.f8982o);
            FrameLayout frameLayout = (FrameLayout) view2.findViewById(C2747R.C2749id.transitionView);
            this.f8978k = frameLayout;
            C2938dc.m12316b((View) frameLayout);
            this.f8979l = new Handler(Looper.getMainLooper());
            this.f8981n = new Handler();
            if (o == clVar) {
                m10892d((Context) f);
            }
            if (C2949dl.m12473a()) {
                ((FaceTecSessionActivity) f).setTitle(" ");
                this.f8975h.setImportantForAccessibility(1);
                this.f8975h.setContentDescription(f.getString(C2747R.string.FaceTec_accessibility_tap_guidance));
                this.f8975h.setOnTouchListener(new C3564s1(f));
            }
            this.f8971c.setEnabled(true);
            if (FaceTecSDK.f8630e.f8612o.f8592a != FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
                int aH = C2938dc.m12266aH();
                if (aH == 0) {
                    aH = C2747R.C2748drawable.facetec_cancel;
                    C2867c cVar = C2867c.CANCEL_BUTTON_RESOURCE_ID_ERROR;
                    StringBuilder sb = new StringBuilder("Activity State Info: ");
                    sb.append(C3555s.m13884a((Activity) f));
                    C3555s.m13898c((Context) f, cVar, sb.toString());
                }
                this.f8971c.setImageDrawable(C0767a.m2895e(f, aH));
            }
            int i2 = C28002.f8994b[FaceTecSDK.f8630e.f8612o.f8592a.ordinal()];
            if (i2 == 2) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f8971c.getLayoutParams();
                layoutParams2.removeRule(20);
                layoutParams2.addRule(21);
                this.f8971c.setLayoutParams(layoutParams2);
            } else if (i2 == 3) {
                this.f8971c.setVisibility(8);
            } else if (i2 == 4) {
                this.f8971c.setVisibility(8);
            }
            this.f8971c.getViewTreeObserver().addOnGlobalLayoutListener(new C3585t1(this));
            this.f8971c.setOnClickListener(new C3606u1(this, f));
            this.f8971c.setOnTouchListener(new C3629v1(this));
            C2829bc f2 = m10901f();
            if (f2 != null) {
                f2.runOnUiThread(new C3650w1(this));
            }
            this.f8984q = false;
            this.f8975h.setVisibility(0);
            this.f8975h.setAlpha(1.0f);
            this.f8978k.setAlpha(Utils.FLOAT_EPSILON);
            this.f8971c.setAlpha(Utils.FLOAT_EPSILON);
            new Handler().postDelayed(new C2792ao.C2793e(new C2927d1(this)), 0);
        }
    }

    /* renamed from: f */
    private C2829bc m10901f() {
        return (C2829bc) getActivity();
    }

    /* renamed from: g */
    static void m10903g() {
        f8963I = 7051454374180009276L;
    }

    /* renamed from: i */
    static void m10907i() {
        f8962E = new byte[]{3, 98, 49, 43, 7, 1, -7, -4, 13, -9, -3, 51, -23, -16, 13, 39, -42, 13, 1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -35, -36, 8, 1, 17, -6};
        f8965e = 72;
    }

    /* renamed from: j */
    private C2888cg m10910j() {
        C2829bc f = m10901f();
        if (f != null) {
            return f.f9082b;
        }
        return null;
    }

    /* renamed from: k */
    private void m10912k() {
        C2888cg j = m10910j();
        if (j != null) {
            j.mo9008a((C2888cg.C2893d) this.f8973f);
            this.f8973f = null;
        }
    }

    /* renamed from: l */
    private void m10914l() {
        if (!this.f8992y && this.f8985r) {
            this.f8975h.mo9061d();
            this.f8992y = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m10916m() {
        this.f8980m.mo9047c();
    }

    /* renamed from: n */
    private void m10918n() {
        if (this.f8975h.mo9064g()) {
            this.f8975h.mo9067j();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m10920o() {
        if (C2885cd.m11836f() == C2884cc.ZOOM_CLOSE) {
            C2949dl.m12483d(m10901f(), C2949dl.C2951d.FACE_CAPTURE_MOVE_CLOSER_DELAYED);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m10922p() {
        this.f8975h.setVisibility(0);
        this.f8980m.mo9046b();
        this.f8975h.animate().alpha(1.0f).setDuration(200).setListener((Animator.AnimatorListener) null).start();
        this.f8978k.animate().alpha(Utils.FLOAT_EPSILON).setDuration(300).setListener((Animator.AnimatorListener) null).start();
        if (FaceTecSDK.f8630e.f8612o.f8592a == FaceTecCancelButtonCustomization.ButtonLocation.TOP_LEFT || FaceTecSDK.f8630e.f8612o.f8592a == FaceTecCancelButtonCustomization.ButtonLocation.TOP_RIGHT) {
            this.f8971c.setVisibility(0);
            this.f8971c.animate().alpha(1.0f).setDuration(500).setStartDelay(50).setListener((Animator.AnimatorListener) null).start();
        }
        C2829bc f = m10901f();
        if (f != null) {
            f.f9084d.animate().alpha(Utils.FLOAT_EPSILON).setDuration(500).setStartDelay(0).setListener((Animator.AnimatorListener) null).start();
            this.f8979l.postDelayed(new C2792ao.C2793e(new C3181h1(this)), 500);
            this.f8979l.postDelayed(new C2792ao.C2793e(new C3203i1(this)), 1150);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m10924q() {
        this.f8991x.release();
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m10926r() {
        this.f8984q = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m10928s() {
        this.f8971c.setImageResource(C2938dc.m12266aH());
        this.f8975h.mo9063f();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x020f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0210  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m10930t() {
        /*
            r22 = this;
            java.lang.String r0 = ""
            r1 = 0
            r2 = 0
            float r3 = android.util.TypedValue.complexToFraction(r2, r1, r1)     // Catch:{ Exception -> 0x026f }
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            int r3 = r3 + 20121
            char r3 = (char) r3     // Catch:{ Exception -> 0x026f }
            r4 = 48
            int r5 = android.text.TextUtils.lastIndexOf(r0, r4)     // Catch:{ Exception -> 0x026f }
            int r5 = r5 + 243
            float r6 = android.media.AudioTrack.getMaxVolume()     // Catch:{ Exception -> 0x026f }
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            int r6 = r6 + 23
            java.lang.Object r3 = com.facetec.sdk.C2854bp.m11559b(r3, r5, r6)     // Catch:{ Exception -> 0x026f }
            java.lang.Class r3 = (java.lang.Class) r3     // Catch:{ Exception -> 0x026f }
            byte r5 = (byte) r2     // Catch:{ Exception -> 0x026f }
            byte r6 = (byte) r5     // Catch:{ Exception -> 0x026f }
            int r7 = r6 + 1
            byte r7 = (byte) r7     // Catch:{ Exception -> 0x026f }
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x026f }
            m10880F(r5, r6, r7, r9)     // Catch:{ Exception -> 0x026f }
            r9 = r9[r2]     // Catch:{ Exception -> 0x026f }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x026f }
            java.lang.reflect.Field r3 = r3.getField(r9)     // Catch:{ Exception -> 0x026f }
            r9 = 0
            long r10 = r3.getLong(r9)     // Catch:{ Exception -> 0x026f }
            r12 = -1
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            r14 = 33521(0x82f1, float:4.6973E-41)
            java.lang.String r15 = "裡ਙ贇'茳ٔ饆᱁齩ኜ閂⢫ꮡ⻔ꇏ"
            r16 = 56267(0xdbcb, float:7.8847E-41)
            java.lang.String r12 = "裥匡㽶ᮗ숚긢訧嚳㋔ᵄ葉앹ꆸ跪栄㑙Ⴜﲮ?ꌻ轈"
            r13 = 5
            r4 = 2
            if (r3 == 0) goto L_0x00bd
            r17 = 1899(0x76b, double:9.38E-321)
            long r10 = r10 + r17
            int r3 = android.view.ViewConfiguration.getJumpTapTimeout()     // Catch:{ Exception -> 0x026f }
            int r3 = r3 >> 16
            int r3 = r3 + r16
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x026f }
            m10881G(r12, r3, r1)     // Catch:{ Exception -> 0x026f }
            r1 = r1[r2]     // Catch:{ Exception -> 0x026f }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x026f }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x026f }
            int r3 = android.text.TextUtils.indexOf(r0, r0, r2)     // Catch:{ Exception -> 0x026f }
            int r3 = r3 + r14
            java.lang.Object[] r14 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x026f }
            m10881G(r15, r3, r14)     // Catch:{ Exception -> 0x026f }
            r3 = r14[r2]     // Catch:{ Exception -> 0x026f }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x026f }
            java.lang.Class[] r14 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x026f }
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r14)     // Catch:{ Exception -> 0x026f }
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x026f }
            java.lang.Object r1 = r1.invoke(r9, r3)     // Catch:{ Exception -> 0x026f }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x026f }
            long r19 = r1.longValue()     // Catch:{ Exception -> 0x026f }
            int r1 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r1 < 0) goto L_0x00bd
            int r1 = android.view.ViewConfiguration.getKeyRepeatDelay()
            int r1 = r1 >> 16
            int r1 = 20121 - r1
            char r1 = (char) r1
            int r3 = android.view.View.resolveSize(r2, r2)
            int r3 = r3 + 242
            int r0 = android.text.TextUtils.getCapsMode(r0, r2, r2)
            int r0 = r0 + 24
            java.lang.Object r0 = com.facetec.sdk.C2854bp.m11559b(r1, r3, r0)
            java.lang.Class r0 = (java.lang.Class) r0
            int r1 = r6 + 2
            byte r1 = (byte) r1
            java.lang.Object[] r3 = new java.lang.Object[r8]
            m10880F(r5, r6, r1, r3)
            r1 = r3[r2]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r0 = r0.getField(r1)
            java.lang.Object r0 = r0.get(r9)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L_0x0201
        L_0x00bd:
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0266 }
            r1[r2] = r22     // Catch:{ all -> 0x0266 }
            byte[] r3 = f8962E     // Catch:{ all -> 0x0266 }
            byte r3 = r3[r13]     // Catch:{ all -> 0x0266 }
            int r3 = r3 - r8
            byte r3 = (byte) r3     // Catch:{ all -> 0x0266 }
            byte r10 = (byte) r3     // Catch:{ all -> 0x0266 }
            r11 = r10 | 14
            byte r11 = (byte) r11     // Catch:{ all -> 0x0266 }
            java.lang.Object[] r14 = new java.lang.Object[r8]     // Catch:{ all -> 0x0266 }
            m10882H(r3, r10, r11, r14)     // Catch:{ all -> 0x0266 }
            r3 = r14[r2]     // Catch:{ all -> 0x0266 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0266 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0266 }
            byte[] r10 = f8962E     // Catch:{ all -> 0x0266 }
            byte r10 = r10[r13]     // Catch:{ all -> 0x0266 }
            int r11 = r10 + -1
            byte r11 = (byte) r11     // Catch:{ all -> 0x0266 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0266 }
            int r14 = -r10
            byte r14 = (byte) r14     // Catch:{ all -> 0x0266 }
            java.lang.Object[] r13 = new java.lang.Object[r8]     // Catch:{ all -> 0x0266 }
            m10882H(r11, r10, r14, r13)     // Catch:{ all -> 0x0266 }
            r10 = r13[r2]     // Catch:{ all -> 0x0266 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0266 }
            java.lang.Class[] r11 = new java.lang.Class[r8]     // Catch:{ all -> 0x0266 }
            java.lang.Class<java.lang.Object> r13 = java.lang.Object.class
            r11[r2] = r13     // Catch:{ all -> 0x0266 }
            java.lang.reflect.Method r3 = r3.getMethod(r10, r11)     // Catch:{ all -> 0x0266 }
            java.lang.Object r1 = r3.invoke(r9, r1)     // Catch:{ all -> 0x0266 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0266 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0266 }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ all -> 0x025d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x025d }
            r3[r8] = r10     // Catch:{ all -> 0x025d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x025d }
            r3[r2] = r1     // Catch:{ all -> 0x025d }
            java.util.Map<java.lang.Integer, java.lang.Object> r1 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x025d }
            r10 = 140061824(0x8592c80, float:6.535337E-34)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x025d }
            java.lang.Object r11 = r1.get(r11)     // Catch:{ all -> 0x025d }
            if (r11 == 0) goto L_0x011d
            goto L_0x015c
        L_0x011d:
            long r13 = android.view.ViewConfiguration.getZoomControlsTimeout()     // Catch:{ all -> 0x025d }
            r20 = 0
            int r11 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            int r11 = 20122 - r11
            char r11 = (char) r11     // Catch:{ all -> 0x025d }
            float r13 = android.util.TypedValue.complexToFloat(r2)     // Catch:{ all -> 0x025d }
            r14 = 0
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            int r13 = 242 - r13
            r14 = 48
            char r20 = android.text.AndroidCharacter.getMirror(r14)     // Catch:{ all -> 0x025d }
            int r14 = r20 + -24
            java.lang.Object r11 = com.facetec.sdk.C2854bp.m11559b(r11, r13, r14)     // Catch:{ all -> 0x025d }
            java.lang.Class r11 = (java.lang.Class) r11     // Catch:{ all -> 0x025d }
            byte r13 = (byte) r6     // Catch:{ all -> 0x025d }
            java.lang.Object[] r14 = new java.lang.Object[r8]     // Catch:{ all -> 0x025d }
            m10880F(r5, r6, r13, r14)     // Catch:{ all -> 0x025d }
            r13 = r14[r2]     // Catch:{ all -> 0x025d }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x025d }
            java.lang.Class[] r14 = new java.lang.Class[r4]     // Catch:{ all -> 0x025d }
            java.lang.Class r20 = java.lang.Integer.TYPE     // Catch:{ all -> 0x025d }
            r14[r2] = r20     // Catch:{ all -> 0x025d }
            r14[r8] = r20     // Catch:{ all -> 0x025d }
            java.lang.reflect.Method r11 = r11.getMethod(r13, r14)     // Catch:{ all -> 0x025d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x025d }
            r1.put(r10, r11)     // Catch:{ all -> 0x025d }
        L_0x015c:
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11     // Catch:{ all -> 0x025d }
            java.lang.Object r1 = r11.invoke(r9, r3)     // Catch:{ all -> 0x025d }
            java.lang.Object[] r1 = (java.lang.Object[]) r1     // Catch:{ all -> 0x025d }
            int r3 = android.view.View.resolveSize(r2, r2)
            int r3 = 20121 - r3
            char r3 = (char) r3
            int r10 = android.graphics.drawable.Drawable.resolveOpacity(r2, r2)
            int r10 = r10 + 242
            r11 = 0
            float r13 = android.graphics.PointF.length(r11, r11)
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            int r11 = r11 + 24
            java.lang.Object r3 = com.facetec.sdk.C2854bp.m11559b(r3, r10, r11)
            java.lang.Class r3 = (java.lang.Class) r3
            int r10 = r6 + 2
            byte r10 = (byte) r10
            java.lang.Object[] r11 = new java.lang.Object[r8]
            m10880F(r5, r6, r10, r11)
            r10 = r11[r2]
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r3 = r3.getField(r10)
            r3.set(r9, r1)
            int r3 = android.view.ViewConfiguration.getDoubleTapTimeout()     // Catch:{ Exception -> 0x0257 }
            int r3 = r3 >> 16
            int r3 = r3 + r16
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0257 }
            m10881G(r12, r3, r10)     // Catch:{ Exception -> 0x0257 }
            r3 = r10[r2]     // Catch:{ Exception -> 0x0257 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0257 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ Exception -> 0x0257 }
            int r10 = android.view.View.getDefaultSize(r2, r2)     // Catch:{ Exception -> 0x0257 }
            r11 = 33521(0x82f1, float:4.6973E-41)
            int r10 = r10 + r11
            java.lang.Object[] r11 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0257 }
            m10881G(r15, r10, r11)     // Catch:{ Exception -> 0x0257 }
            r10 = r11[r2]     // Catch:{ Exception -> 0x0257 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x0257 }
            java.lang.Class[] r11 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0257 }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r10, r11)     // Catch:{ Exception -> 0x0257 }
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0257 }
            java.lang.Object r3 = r3.invoke(r9, r10)     // Catch:{ Exception -> 0x0257 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ Exception -> 0x0257 }
            long r10 = r3.longValue()     // Catch:{ Exception -> 0x0257 }
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            r10 = -16757095(0xffffffffff004e99, float:-1.7054929E38)
            int r11 = android.graphics.Color.rgb(r2, r2, r2)
            int r10 = r10 - r11
            char r10 = (char) r10
            r11 = 48
            int r0 = android.text.TextUtils.lastIndexOf(r0, r11)
            int r0 = r0 + 243
            long r11 = android.os.SystemClock.currentThreadTimeMillis()
            r13 = -1
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            int r11 = r11 + 23
            java.lang.Object r0 = com.facetec.sdk.C2854bp.m11559b(r10, r0, r11)
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Object[] r10 = new java.lang.Object[r8]
            m10880F(r5, r6, r7, r10)
            r5 = r10[r2]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.reflect.Field r0 = r0.getField(r5)
            r0.set(r9, r3)
            r0 = r1
        L_0x0201:
            r1 = r0[r8]
            int[] r1 = (int[]) r1
            r1 = r1[r2]
            r3 = r0[r2]
            int[] r3 = (int[]) r3
            r2 = r3[r2]
            if (r2 != r1) goto L_0x0210
            return
        L_0x0210:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = r0[r4]
            java.lang.String r3 = (java.lang.String) r3
            r1.add(r3)
            r3 = 3
            r3 = r0[r3]
            java.lang.String r3 = (java.lang.String) r3
            r1.add(r3)
            r3 = 4
            r3 = r0[r3]
            java.lang.String r3 = (java.lang.String) r3
            r1.add(r3)
            r3 = 5
            r3 = r0[r3]
            java.lang.String r3 = (java.lang.String) r3
            r1.add(r3)
            r3 = 6
            r3 = r0[r3]
            java.lang.String r3 = (java.lang.String) r3
            r1.add(r3)
            r3 = 7
            r3 = r0[r3]
            java.lang.String r3 = (java.lang.String) r3
            r1.add(r3)
            r3 = 8
            r0 = r0[r3]
            java.lang.String r0 = (java.lang.String) r0
            r1.add(r0)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = java.lang.String.valueOf(r2)
            r0.<init>(r1)
            throw r0
        L_0x0257:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L_0x025d:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0265
            throw r1
        L_0x0265:
            throw r0
        L_0x0266:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x026e
            throw r1
        L_0x026e:
            throw r0
        L_0x026f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2799at.m10930t():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m10934w() {
        if (!this.f8990w) {
            this.f8990w = true;
            float c = C2938dc.m12372c();
            float e = C2938dc.m12404e();
            int d = C2938dc.m12393d();
            int b = (int) (C2810ax.m10988b(35) * e * c);
            float f = ((float) d) / 2.0f;
            int round = Math.round(f);
            int round2 = Math.round(f);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f8971c.getLayoutParams();
            layoutParams.setMargins(round, round, 0, 0);
            layoutParams.setMarginStart(round);
            layoutParams.setMarginEnd(round);
            this.f8971c.setLayoutParams(layoutParams);
            this.f8971c.setPadding(round2, round2, round2, round2);
            this.f8971c.getLayoutParams().height = b;
            this.f8971c.getLayoutParams().width = b;
            this.f8971c.requestLayout();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m10937y() {
        if (!this.f8976i) {
            this.f8970a.setAlpha(Utils.FLOAT_EPSILON);
            if (!C2827ba.f9071d) {
                this.f8970a.setVisibility(0);
            } else {
                this.f8970a.setVisibility(4);
            }
            this.f8977j.setAlpha(Utils.FLOAT_EPSILON);
            this.f8969D = false;
            this.f8975h.mo9060b(false);
            int h = this.f8975h.mo9065h() - (this.f8989v << 1);
            if ((((int) this.f8975h.f9773c.bottom) - this.f8970a.getHeight()) - (this.f8989v << 1) >= h && ((double) C2938dc.m12311b()) < 1.4d) {
                this.f8970a.setY((float) h);
            }
            this.f8970a.animate().alpha(1.0f).setDuration(500).setListener((Animator.AnimatorListener) null).start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m10909i(C2829bc bcVar) {
        this.f8979l.post(new C2792ao.C2793e(new C3404m1(bcVar)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo8854h() {
        Semaphore semaphore = this.f8991x;
        if (semaphore != null) {
            try {
                if (semaphore.tryAcquire(2000, TimeUnit.MILLISECONDS)) {
                    this.f8991x.release();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m10898e(C2829bc bcVar, View view) {
        if (this.f8985r) {
            C2785al.m10842e((Context) bcVar, C2794ap.FT_EVENT_FACESCAN_SESSION_FAIL);
        }
        bcVar.mo8926o();
    }

    /* renamed from: c */
    private void m10891c(Runnable runnable, boolean z) {
        m10914l();
        m10900e(z);
        runnable.run();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m10893d(Context context, C2831bd bdVar) {
        C2829bc f;
        C2888cg j = m10910j();
        if (j != null && !j.mo9009a(context, bdVar.f9157h) && (f = m10901f()) != null) {
            f.mo8916e(C2790am.f8920q);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m10897e(C2829bc bcVar) {
        this.f8979l.post(new C2792ao.C2793e(new C3225j1(bcVar)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m10899e(com.facetec.sdk.C2884cc r2, com.facetec.sdk.C2865by r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.facetec.sdk.cc r0 = com.facetec.sdk.C2884cc.ZOOM_FAR     // Catch:{ all -> 0x002c }
            if (r2 != r0) goto L_0x0008
            r1.m10918n()     // Catch:{ all -> 0x002c }
        L_0x0008:
            com.facetec.sdk.by r2 = com.facetec.sdk.C2865by.HOLD_STEADY     // Catch:{ all -> 0x002c }
            if (r3 != r2) goto L_0x0014
            com.facetec.sdk.cu r2 = r1.f8975h     // Catch:{ all -> 0x002c }
            r2.mo9061d()     // Catch:{ all -> 0x002c }
            r2 = 1
            r1.f8992y = r2     // Catch:{ all -> 0x002c }
        L_0x0014:
            com.facetec.sdk.co r2 = r1.f8980m     // Catch:{ all -> 0x002c }
            com.facetec.sdk.by r0 = r2.f9681a     // Catch:{ all -> 0x002c }
            if (r3 == r0) goto L_0x002a
            boolean r0 = r2.f9687g     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x001f
            goto L_0x002a
        L_0x001f:
            r2.f9681a = r3     // Catch:{ all -> 0x002c }
            int r3 = com.facetec.sdk.C2906co.m12120b((com.facetec.sdk.C2865by) r3)     // Catch:{ all -> 0x002c }
            r2.mo9048e(r3)     // Catch:{ all -> 0x002c }
            monitor-exit(r1)
            return
        L_0x002a:
            monitor-exit(r1)
            return
        L_0x002c:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2799at.m10899e(com.facetec.sdk.cc, com.facetec.sdk.by):void");
    }

    /* renamed from: c */
    static /* synthetic */ void m10889c(C2799at atVar) {
        C2949dl.m12478c();
        atVar.f8975h.setImportantForAccessibility(2);
        atVar.f8975h.setOnTouchListener((View.OnTouchListener) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8849a() {
        C2831bd bdVar = (C2831bd) getActivity();
        if (bdVar != null) {
            bdVar.mo8935D();
        }
        C2829bc f = m10901f();
        if (isAdded() && f != null) {
            m10912k();
            C2863bw.m11673a(f);
            if (this.f8985r) {
                C2785al.m10842e((Context) f, C2794ap.FT_EVENT_FACESCAN_SESSION_FAIL);
            }
            m10891c(new C2792ao.C2793e(new C3494p1(this, f)), false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ boolean m10895d(Context context, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            C2949dl.m12483d(context, C2949dl.C2951d.BLIND_USER_ASSIST_FACESCAN_FEEDBACK);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo8853d() {
        this.f8993z = false;
        C2831bd bdVar = (C2831bd) getActivity();
        if (bdVar != null) {
            bdVar.mo8935D();
        }
        C2829bc f = m10901f();
        if (f != null) {
            m10912k();
            if (this.f8983p) {
                C2863bw.m11678c(f);
                this.f8983p = false;
            }
            if (this.f8986s) {
                try {
                    this.f8986s = false;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            C2785al.m10842e((Context) f, C2794ap.FT_EVENT_FACESCAN_SESSION_SUCCESS);
            this.f8979l.post(new C3473o1(f));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m10884a(C2829bc bcVar) {
        this.f8979l.post(new C2792ao.C2793e(new C2987e1(bcVar)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m10885a(com.facetec.sdk.C2895ch r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.m10918n()     // Catch:{ all -> 0x0030 }
            com.facetec.sdk.co r0 = r2.f8980m     // Catch:{ all -> 0x0030 }
            com.facetec.sdk.ch r1 = r0.f9685e     // Catch:{ all -> 0x0030 }
            if (r3 == r1) goto L_0x002e
            boolean r1 = r0.f9687g     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x000f
            goto L_0x002e
        L_0x000f:
            r0.f9685e = r3     // Catch:{ all -> 0x0030 }
            int r3 = com.facetec.sdk.C2906co.m12118a((com.facetec.sdk.C2895ch) r3)     // Catch:{ all -> 0x0030 }
            boolean r1 = r0.f9687g     // Catch:{ all -> 0x0030 }
            if (r1 != 0) goto L_0x002c
            int r1 = r0.f9684d     // Catch:{ all -> 0x0030 }
            if (r3 == r1) goto L_0x002c
            r0.f9684d = r3     // Catch:{ all -> 0x0030 }
            r1 = 0
            r0.f9687g = r1     // Catch:{ all -> 0x0030 }
            com.facetec.sdk.C2949dl.m12470a((int) r3)     // Catch:{ all -> 0x0030 }
            android.widget.TextView r3 = r0.f9683c     // Catch:{ all -> 0x0030 }
            int r0 = r0.f9684d     // Catch:{ all -> 0x0030 }
            com.facetec.sdk.C2923cy.m12209e(r3, r0)     // Catch:{ all -> 0x0030 }
        L_0x002c:
            monitor-exit(r2)
            return
        L_0x002e:
            monitor-exit(r2)
            return
        L_0x0030:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2799at.m10885a(com.facetec.sdk.ch):void");
    }

    /* renamed from: e */
    private void m10900e(boolean z) {
        int i = z ? TextTypeView.SEPARATOR_FULL : BogInputLayout.INPUT_TYPE_TEXT_PASSWORD;
        C2916cu cuVar = this.f8975h;
        AnimatorSet animatorSet = cuVar.f9782l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = cuVar.f9779i;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = cuVar.f9784n;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        this.f8975h.mo9059b((Runnable) new C2792ao.C2793e(new C3536r1(this)), z);
        try {
            this.f8991x.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.f8971c.setVisibility(4);
        this.f8974g.setVisibility(4);
        this.f8982o.setVisibility(4);
        C2938dc.m12424h((View) this.f8978k);
        this.f8978k.animate().alpha(1.0f).setDuration((long) (i + 100)).setStartDelay(0).setListener((Animator.AnimatorListener) null).start();
        AnimatorSet duration = new AnimatorSet().setDuration((long) i);
        C2906co coVar = this.f8980m;
        duration.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f8970a, View.ALPHA, new float[]{0.0f}), ObjectAnimator.ofFloat(this.f8980m, View.ALPHA, new float[]{0.0f}), ObjectAnimator.ofFloat(this.f8971c, View.ALPHA, new float[]{0.0f}), ObjectAnimator.ofFloat(coVar, View.TRANSLATION_Y, new float[]{(float) ((-coVar.getHeight()) / 2)})});
        duration.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo8850b() {
        C2831bd bdVar = (C2831bd) getActivity();
        if (bdVar != null) {
            bdVar.mo8935D();
        }
        C2829bc f = m10901f();
        if (isAdded() && f != null) {
            m10912k();
            C2863bw.m11673a(f);
            if (this.f8985r) {
                C2785al.m10842e((Context) f, C2794ap.FT_EVENT_FACESCAN_SESSION_FAIL);
            }
            m10891c(new C2792ao.C2793e(new C3053f1(this, f)), false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m10888b(C2899cl clVar, C2896ci ciVar, C2895ch chVar, C2897cj cjVar) {
        if (clVar == C2899cl.TIMEOUT_GO_TO_RETRY) {
            C2888cg j = m10910j();
            if (j != null) {
                j.mo9025i();
                j.mo9020e(this.f8967B);
            }
            C2829bc f = m10901f();
            if (f != null) {
                f.mo8919h();
            }
        } else if (!this.f8984q || clVar == C2899cl.DETECTING_LIGHT_MODE) {
        } else {
            if (clVar != C2899cl.DETECTING_FACE_FEEDBACK) {
                C2888cg j2 = m10910j();
                if (j2 != null) {
                    j2.mo9025i();
                    j2.mo9020e(this.f8967B);
                }
                m10892d((Context) m10901f());
            } else if (isAdded() && !this.f8976i) {
                this.f8972d = chVar;
                m10885a(chVar);
            }
        }
    }
}

package com.facetec.sdk;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.C0767a;
import com.facetec.sdk.C2792ao;
import com.facetec.sdk.C2829bc;
import com.facetec.sdk.C2848bl;
import com.facetec.sdk.C2900cm;
import com.facetec.sdk.C2910cr;
import com.facetec.sdk.C2949dl;
import com.facetec.sdk.C2954dn;
import com.facetec.sdk.C3555s;
import com.facetec.sdk.FaceTecCancelButtonCustomization;
import com.facetec.sdk.FaceTecSDK;
import com.facetec.sdk.FaceTecVocalGuidanceCustomization;
import com.github.mikephil.charting.utils.Utils;
import com.guardsquare.dexguard.annotation.ObfuscateCodeMedium;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;

/* renamed from: com.facetec.sdk.bd */
abstract class C2831bd extends C2829bc implements C2910cr.C2912e {

    /* renamed from: aI */
    private static int f9090aI = 0;

    /* renamed from: aK */
    private static int f9091aK = 1;

    /* renamed from: A */
    private volatile byte[][] f9092A;

    /* renamed from: B */
    private volatile byte[] f9093B;

    /* renamed from: C */
    private boolean f9094C = false;

    /* renamed from: D */
    private boolean f9095D = false;

    /* renamed from: E */
    private boolean f9096E = false;

    /* renamed from: F */
    private boolean f9097F = false;

    /* renamed from: G */
    private boolean f9098G = false;

    /* renamed from: H */
    private boolean f9099H = false;

    /* renamed from: I */
    private boolean f9100I = false;

    /* renamed from: J */
    private boolean f9101J = false;

    /* renamed from: K */
    private boolean f9102K = false;

    /* renamed from: L */
    private boolean f9103L = false;

    /* renamed from: M */
    private boolean f9104M = false;

    /* renamed from: N */
    private boolean f9105N = false;

    /* renamed from: O */
    private boolean f9106O = false;

    /* renamed from: P */
    private boolean f9107P = false;

    /* renamed from: Q */
    private boolean f9108Q = false;

    /* renamed from: R */
    private boolean f9109R = false;

    /* renamed from: S */
    private C2780ai f9110S;

    /* renamed from: T */
    private String f9111T;

    /* renamed from: U */
    private boolean f9112U = false;

    /* renamed from: V */
    private C2858bt f9113V;

    /* renamed from: W */
    private C2954dn f9114W;

    /* renamed from: X */
    private boolean f9115X = false;

    /* renamed from: Y */
    private boolean f9116Y = false;

    /* renamed from: Z */
    private View f9117Z;

    /* renamed from: aA */
    private boolean f9118aA = false;

    /* renamed from: aB */
    private final Object f9119aB = new Object();

    /* renamed from: aC */
    private float f9120aC = Utils.FLOAT_EPSILON;

    /* renamed from: aD */
    private boolean f9121aD = false;

    /* renamed from: aE */
    private Integer f9122aE;

    /* renamed from: aF */
    private Integer f9123aF;

    /* renamed from: aG */
    private Integer f9124aG;

    /* renamed from: aH */
    private boolean f9125aH = false;

    /* renamed from: aJ */
    private boolean f9126aJ = false;

    /* renamed from: aL */
    private final C2954dn.C2956b f9127aL = new C2954dn.C2956b() {
        /* renamed from: a */
        public final void mo8956a(C2952dm dmVar, String str) {
            C2831bd.this.mo8942b(dmVar, str);
        }

        /* renamed from: b */
        public final void mo8957b() {
            C2831bd.this.mo8937F();
        }
    };

    /* renamed from: aa */
    private int f9128aa;

    /* renamed from: ab */
    private RelativeLayout f9129ab;

    /* renamed from: ac */
    private boolean f9130ac = false;

    /* renamed from: ad */
    private RelativeLayout f9131ad;

    /* renamed from: ae */
    private RelativeLayout f9132ae;

    /* renamed from: af */
    private RelativeLayout f9133af;

    /* renamed from: ag */
    private RelativeLayout f9134ag;

    /* renamed from: ah */
    private RelativeLayout f9135ah;

    /* renamed from: ai */
    private LinearLayout f9136ai;

    /* renamed from: aj */
    private RelativeLayout f9137aj;

    /* renamed from: ak */
    private View f9138ak;

    /* renamed from: al */
    private RelativeLayout f9139al;

    /* renamed from: am */
    private boolean f9140am = false;

    /* renamed from: an */
    private JSONObject f9141an = null;

    /* renamed from: ao */
    private int f9142ao = 0;

    /* renamed from: ap */
    private FaceTecIDScanResult f9143ap;

    /* renamed from: aq */
    private String f9144aq;

    /* renamed from: ar */
    private boolean f9145ar = false;

    /* renamed from: as */
    private boolean f9146as = false;

    /* renamed from: at */
    private int f9147at = 0;

    /* renamed from: au */
    private Timer f9148au;

    /* renamed from: av */
    private C2900cm.C2903b f9149av = C2900cm.C2903b.DEFAULT;

    /* renamed from: aw */
    private TimerTask f9150aw;

    /* renamed from: ax */
    private boolean f9151ax = false;

    /* renamed from: ay */
    private ImageView f9152ay;

    /* renamed from: az */
    private ValueAnimator f9153az;

    /* renamed from: e */
    private volatile C2799at f9154e;

    /* renamed from: f */
    boolean f9155f = false;

    /* renamed from: g */
    private volatile C2855bq f9156g;

    /* renamed from: h */
    String f9157h = "";

    /* renamed from: i */
    float f9158i;

    /* renamed from: j */
    boolean f9159j = false;

    /* renamed from: k */
    C2848bl f9160k;

    /* renamed from: l */
    C3401m f9161l;

    /* renamed from: m */
    float f9162m;

    /* renamed from: n */
    String f9163n;

    /* renamed from: o */
    ImageView f9164o;

    /* renamed from: p */
    Bitmap f9165p;

    /* renamed from: q */
    C2835e f9166q = C2835e.NOT_STARTED;

    /* renamed from: r */
    FaceTecIDScanNextStep f9167r = FaceTecIDScanNextStep.SELECTION_SCREEN;

    /* renamed from: s */
    protected boolean f9168s;

    /* renamed from: t */
    FaceTecSessionResult f9169t;

    /* renamed from: u */
    private volatile C2879cb f9170u;

    /* renamed from: v */
    private volatile C2900cm f9171v;

    /* renamed from: w */
    private volatile C2925d f9172w;

    /* renamed from: x */
    private volatile C2905cn f9173x;

    /* renamed from: y */
    View f9174y;

    /* renamed from: z */
    private volatile byte[][] f9175z;

    /* renamed from: com.facetec.sdk.bd$2 */
    static /* synthetic */ class C28322 {

        /* renamed from: d */
        static final /* synthetic */ int[] f9176d;

        /* renamed from: e */
        static final /* synthetic */ int[] f9177e;

        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|1|2|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0087 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0091 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x009b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00a5 */
        static {
            /*
                com.facetec.sdk.FaceTecSessionStatus[] r0 = com.facetec.sdk.FaceTecSessionStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9176d = r0
                r1 = 1
                com.facetec.sdk.FaceTecSessionStatus r2 = com.facetec.sdk.FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f9176d     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facetec.sdk.FaceTecSessionStatus r3 = com.facetec.sdk.FaceTecSessionStatus.TIMEOUT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f9176d     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facetec.sdk.FaceTecSessionStatus r4 = com.facetec.sdk.FaceTecSessionStatus.CONTEXT_SWITCH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f9176d     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facetec.sdk.FaceTecSessionStatus r5 = com.facetec.sdk.FaceTecSessionStatus.REVERSE_PORTRAIT_NOT_ALLOWED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f9176d     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facetec.sdk.FaceTecSessionStatus r6 = com.facetec.sdk.FaceTecSessionStatus.LANDSCAPE_MODE_NOT_ALLOWED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f9176d     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facetec.sdk.FaceTecSessionStatus r7 = com.facetec.sdk.FaceTecSessionStatus.NON_PRODUCTION_MODE_KEY_INVALID     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r6 = f9176d     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.facetec.sdk.FaceTecSessionStatus r7 = com.facetec.sdk.FaceTecSessionStatus.USER_CANCELLED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r8 = 7
                r6[r7] = r8     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r6 = f9176d     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.facetec.sdk.FaceTecSessionStatus r7 = com.facetec.sdk.FaceTecSessionStatus.CAMERA_PERMISSION_DENIED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8 = 8
                r6[r7] = r8     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r6 = f9176d     // Catch:{ NoSuchFieldError -> 0x006c }
                com.facetec.sdk.FaceTecSessionStatus r7 = com.facetec.sdk.FaceTecSessionStatus.SESSION_UNSUCCESSFUL     // Catch:{ NoSuchFieldError -> 0x006c }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r8 = 9
                r6[r7] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                com.facetec.sdk.FaceTecSDKStatus[] r6 = com.facetec.sdk.FaceTecSDKStatus.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                f9177e = r6
                com.facetec.sdk.FaceTecSDKStatus r7 = com.facetec.sdk.FaceTecSDKStatus.INVALID_DEVICE_KEY_IDENTIFIER     // Catch:{ NoSuchFieldError -> 0x007d }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r6[r7] = r1     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r1 = f9177e     // Catch:{ NoSuchFieldError -> 0x0087 }
                com.facetec.sdk.FaceTecSDKStatus r6 = com.facetec.sdk.FaceTecSDKStatus.NETWORK_ISSUES     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r1[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                int[] r0 = f9177e     // Catch:{ NoSuchFieldError -> 0x0091 }
                com.facetec.sdk.FaceTecSDKStatus r1 = com.facetec.sdk.FaceTecSDKStatus.DEVICE_LOCKED_OUT     // Catch:{ NoSuchFieldError -> 0x0091 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0091 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0091 }
            L_0x0091:
                int[] r0 = f9177e     // Catch:{ NoSuchFieldError -> 0x009b }
                com.facetec.sdk.FaceTecSDKStatus r1 = com.facetec.sdk.FaceTecSDKStatus.ENCRYPTION_KEY_INVALID     // Catch:{ NoSuchFieldError -> 0x009b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x009b }
            L_0x009b:
                int[] r0 = f9177e     // Catch:{ NoSuchFieldError -> 0x00a5 }
                com.facetec.sdk.FaceTecSDKStatus r1 = com.facetec.sdk.FaceTecSDKStatus.DEVICE_IN_LANDSCAPE_MODE     // Catch:{ NoSuchFieldError -> 0x00a5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a5 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x00a5 }
            L_0x00a5:
                int[] r0 = f9177e     // Catch:{ NoSuchFieldError -> 0x00af }
                com.facetec.sdk.FaceTecSDKStatus r1 = com.facetec.sdk.FaceTecSDKStatus.DEVICE_IN_REVERSE_PORTRAIT_MODE     // Catch:{ NoSuchFieldError -> 0x00af }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00af }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x00af }
            L_0x00af:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2831bd.C28322.<clinit>():void");
        }
    }

    @FunctionalInterface
    /* renamed from: com.facetec.sdk.bd$d */
    interface C2834d {
        byte[] getIdScanBytes(String str);
    }

    /* renamed from: com.facetec.sdk.bd$e */
    enum C2835e {
        NOT_STARTED,
        PRE_SESSION_STARTED,
        FACESCAN_SESSION_STARTED
    }

    C2831bd() {
    }

    /* renamed from: a */
    private void m11170a(int i) {
        C3555s.m13907d(this, new Throwable("FaceTec SDK has experienced an unexpected camera error."), C2867c.CAMERA_ERROR, "FaceScan: camera is null unexpectedly ".concat(String.valueOf(i)), true);
        mo8946d(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (FaceTecIDScanStatus) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: aA */
    public /* synthetic */ void m11178aA() {
        mo8946d(FaceTecSessionStatus.USER_CANCELLED_VIA_CLICKABLE_READY_SCREEN_SUBTEXT, (FaceTecIDScanStatus) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: aB */
    public /* synthetic */ void m11179aB() {
        mo8946d(this.f9169t.getStatus(), FaceTecIDScanStatus.USER_CANCELED);
    }

    /* access modifiers changed from: private */
    /* renamed from: aD */
    public /* synthetic */ void m11181aD() {
        getFragmentManager().beginTransaction().replace(this.f9128aa, this.f9171v, "Results").addToBackStack("zoom").commitAllowingStateLoss();
    }

    /* access modifiers changed from: private */
    /* renamed from: aE */
    public /* synthetic */ void m11182aE() {
        ImageView imageView = this.f9164o;
        if (imageView != null) {
            imageView.setEnabled(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aH */
    public /* synthetic */ void m11185aH() {
        if (mo8912c() == C2829bc.C2830b.GRANTED && !this.f9155f) {
            this.f9135ah.setVisibility(0);
            this.f9135ah.setAlpha(1.0f);
            if (this.f9126aJ) {
                C2780ai aiVar = this.f9110S;
                if (aiVar == null) {
                    m11170a(3);
                } else {
                    aiVar.mo8831e((Runnable) new C2758a4(this));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aI */
    public static /* synthetic */ void m11186aI() {
        C2885cd.m11794a();
        C2885cd.m11826c();
        C2885cd.m11867z(C2750a.m10686c());
        C2885cd.m11771G("fnkey_ZOOMSDK_LIGHTINGMODE", 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: aJ */
    public /* synthetic */ void m11187aJ() {
        if (!m11124G()) {
            this.f9117Z.animate().alpha(1.0f).setDuration(800).setListener((Animator.AnimatorListener) null).withEndAction(new C3477o5(this)).start();
            ImageView imageView = this.f9164o;
            if (imageView != null && !this.f9155f) {
                imageView.animate().alpha(1.0f).setDuration(800).setListener((Animator.AnimatorListener) null).start();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aK */
    public /* synthetic */ void m11188aK() {
        int aH;
        if (!(FaceTecSDK.f8630e.f8612o.f8592a != FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM || FaceTecSDK.f8630e.f8612o.f8593e == null || (aH = C2938dc.m12266aH()) == 0)) {
            this.f9164o.setImageDrawable(C0767a.m2895e(this, aH));
        }
        int aC = C2938dc.m12261aC();
        if (FaceTecSDK.f8630e.f8607j.showBrandingImage && aC != 0) {
            this.f9152ay.setImageDrawable(C0767a.m2895e(this, aC));
        }
        this.f9133af.setBackground(C2938dc.m12448q(this));
        Integer num = this.f9122aE;
        Integer valueOf = Integer.valueOf(C2938dc.m12408e((Context) this, C2938dc.m12232K()));
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{num, valueOf});
        ofObject.setDuration(1000);
        ofObject.addUpdateListener(new C3408m5(this));
        ofObject.start();
        Integer num2 = this.f9124aG;
        Integer valueOf2 = Integer.valueOf(C2938dc.m12408e((Context) this, C2938dc.m12238Q()));
        ValueAnimator ofObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{num2, valueOf2});
        ofObject2.setDuration(1000);
        ofObject2.addUpdateListener(new C3454n5(this));
        ofObject2.start();
        Integer num3 = this.f9123aF;
        Integer valueOf3 = Integer.valueOf(C2938dc.m12426i((Context) this));
        ValueAnimator ofObject3 = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{num3, valueOf3});
        ofObject3.setDuration(1000);
        ofObject3.addUpdateListener(new C3498p5(this, (GradientDrawable) this.f9129ab.getBackground(), (int) (C2810ax.m10988b(C2938dc.m12431j()) * C2938dc.m12404e())));
        ofObject3.start();
        if (this.f9156g != null) {
            this.f9156g.mo8880g();
        }
        if (this.f9173x != null) {
            this.f9173x.mo8880g();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aL */
    public /* synthetic */ void m11189aL() {
        this.f9133af.animate().alpha(Utils.FLOAT_EPSILON).setDuration(300).setListener((Animator.AnimatorListener) null).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: aM */
    public /* synthetic */ void m11190aM() {
        this.f9151ax = false;
        this.f9121aD = true;
        m11226b(m11154S(), 0.8f, 0);
        m11150Q();
    }

    /* access modifiers changed from: private */
    /* renamed from: aN */
    public /* synthetic */ void m11191aN() {
        ValueAnimator valueAnimator = this.f9153az;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f9153az.removeAllUpdateListeners();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aO */
    public /* synthetic */ void m11192aO() {
        this.f9160k.mo8968b();
    }

    /* access modifiers changed from: private */
    /* renamed from: aP */
    public /* synthetic */ void m11193aP() {
        this.f9151ax = false;
        this.f9121aD = true;
        m11226b(m11154S(), 0.5f, 0);
        m11150Q();
    }

    /* access modifiers changed from: private */
    /* renamed from: aQ */
    public /* synthetic */ void m11194aQ() {
        if (!isFinishing() && hasWindowFocus() && this.f9160k != null) {
            runOnUiThread(new C2820b3(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aR */
    public /* synthetic */ void m11195aR() {
        C2949dl.m12480c((Context) this);
    }

    /* access modifiers changed from: private */
    /* renamed from: aU */
    public /* synthetic */ void m11197aU() {
        m11134K();
        m11237c((int) BogInputLayout.INPUT_TYPE_TEXT_PASSWORD);
    }

    /* access modifiers changed from: private */
    /* renamed from: aV */
    public /* synthetic */ void m11198aV() {
        m11237c(0);
    }

    /* renamed from: aa */
    private void m11199aa() {
        this.f9161l.mo9788d((Context) this, C3555s.C3562d.USER_WAS_SUCCESSFUL, this.f9163n, this.f9155f);
        if (this.f9172w != null || this.f9171v == null) {
            mo8941b(this.f9143ap.getStatus());
        } else {
            m11173a((Runnable) new C2989e3(this));
        }
    }

    @ObfuscateCodeMedium
    /* renamed from: ab */
    private void m11200ab() {
        char c;
        int i = f9090aI;
        int i2 = (i ^ 117) + ((i & 117) << 1);
        f9091aK = i2 % 128;
        if (i2 % 2 == 0) {
            c = 11;
        } else {
            c = '.';
        }
        if (c != '.') {
            C2920cv.m12195c(new C3056f4(this)).mo9078d(new C3153g4(this));
            int i3 = 70 / 0;
            return;
        }
        C2920cv.m12195c(new C3056f4(this)).mo9078d(new C3153g4(this));
    }

    /* renamed from: ac */
    private void m11201ac() {
        View view;
        C2780ai aiVar = this.f9110S;
        if (aiVar != null) {
            view = aiVar.mo8813b();
        } else {
            view = null;
        }
        C2938dc.m12424h((View) this.f9133af);
        this.f9133af.animate().alpha(1.0f).setDuration(300).setListener((Animator.AnimatorListener) null).withEndAction(new C2873c5(this, view)).start();
        m11196aS();
    }

    /* renamed from: ad */
    private void m11202ad() {
        ImageView imageView = this.f9164o;
        if (imageView != null) {
            imageView.setEnabled(false);
            this.f9164o.animate().alpha(Utils.FLOAT_EPSILON).setDuration(300).setStartDelay(0).start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ae */
    public /* synthetic */ void m11203ae() {
        this.f9135ah.setVisibility(4);
        if (this.f9171v != null && this.f9160k != null) {
            this.f9171v.mo9035b(true, this.f9144aq, new C2931d5(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: af */
    public /* synthetic */ void m11204af() {
        m11234b(false, false);
    }

    /* renamed from: ag */
    private void m11205ag() {
        C2954dn dnVar = this.f9114W;
        if (dnVar != null) {
            if (!this.f9168s) {
                try {
                    dnVar.mo9119e();
                } catch (Exception unused) {
                }
            }
            this.f9114W = null;
        }
    }

    /* renamed from: ah */
    private void m11206ah() {
        this.f9140am = true;
        this.f9163n = UUID.randomUUID().toString();
        this.f9082b.mo9021e(this.f9160k.f9283i);
        getFragmentManager().beginTransaction().replace(this.f9128aa, this.f9160k, "IDScan").commitAllowingStateLoss();
    }

    /* access modifiers changed from: private */
    /* renamed from: ai */
    public /* synthetic */ void m11207ai() {
        getFragmentManager().beginTransaction().remove(this.f9171v).commitAllowingStateLoss();
        this.f9171v = null;
        C2900cm.C2903b bVar = C2900cm.C2903b.SKIPPED_NFC;
        this.f9149av = bVar;
        this.f9171v = C2900cm.m12011d(true, bVar);
        getFragmentManager().beginTransaction().add(this.f9128aa, this.f9171v, "Results").commitAllowingStateLoss();
        m11231b((C2834d) new C3567s4(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: aj */
    public /* synthetic */ void m11208aj() {
        this.f9171v.mo9034a((Runnable) new C3653w4(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: ak */
    public /* synthetic */ void m11209ak() {
        if (C2954dn.m12497d(this)) {
            m11234b(false, true);
            m11168Z();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: al */
    public /* synthetic */ void m11210al() {
        this.f9096E = true;
        if (this.f9143ap.getStatus() != null) {
            C3555s.m13898c((Context) this, C2867c.ID_SCAN_CALLBACK_CALLED, this.f9143ap.getStatus().toString());
        }
        FaceTecSessionActivity.f8642g.processIDScanWhileFaceTecSDKWaits(this.f9143ap, new C2845bj(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: am */
    public /* synthetic */ void m11211am() {
        this.f9164o.setEnabled(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: an */
    public /* synthetic */ void m11212an() {
        this.f9100I = false;
        FaceTecSessionStatus faceTecSessionStatus = FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY;
        FaceTecSessionResult faceTecSessionResult = new FaceTecSessionResult(faceTecSessionStatus, this.f9175z, this.f9092A, this.f9093B);
        faceTecSessionResult.mo8777b(C2888cg.f9550b);
        if (FaceTecSessionActivity.f8641e != null) {
            this.f9099H = true;
            this.f9169t = faceTecSessionResult;
            if (faceTecSessionResult.getStatus() != null) {
                C3555s.m13898c((Context) this, C2867c.FACESCAN_CALLBACK_CALLED, this.f9169t.getStatus().toString());
            }
            FaceTecSessionActivity.f8641e.processSessionWhileFaceTecSDKWaits(faceTecSessionResult, new C2815az(this));
            return;
        }
        mo8945d(faceTecSessionStatus);
    }

    /* access modifiers changed from: private */
    /* renamed from: ap */
    public /* synthetic */ void m11214ap() {
        FaceTecSessionActivity faceTecSessionActivity;
        this.f9102K = false;
        this.f9173x = (C2905cn) getFragmentManager().findFragmentByTag("RetryZoom");
        if (this.f9173x != null && this.f9173x.f9676m != null) {
            C2914ct ctVar = this.f9173x.f9676m;
            if (ctVar.f9756j == null && (faceTecSessionActivity = (FaceTecSessionActivity) ctVar.getActivity()) != null) {
                ctVar.f9756j = faceTecSessionActivity.f9165p;
                ctVar.f9749c.setAlpha(Utils.FLOAT_EPSILON);
                ctVar.mo9054c();
                ctVar.f9749c.animate().alpha(1.0f).setDuration(400).setListener((Animator.AnimatorListener) null);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aq */
    public /* synthetic */ void m11215aq() {
        if (!isFinishing() && hasWindowFocus() && this.f9171v != null) {
            m11137L();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ar */
    public /* synthetic */ void m11216ar() {
        try {
            this.f9093B = C2885cd.m11855r();
        } catch (Exception e) {
            C2810ax.m10991b(e.getMessage());
        }
        if (C2840bg.m11363c() && this.f9098G) {
            this.f9175z = C2885cd.m11860u();
            this.f9092A = C2885cd.m11865y();
            if (this.f9092A.length > 0) {
                this.f9165p = BitmapFactory.decodeByteArray(this.f9092A[0], 0, this.f9092A[0].length);
            }
        }
        this.f9161l.mo9786b();
        if (this.f9154e != null) {
            this.f9154e.mo8854h();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: as */
    public /* synthetic */ void m11217as() {
        if (this.f9171v != null) {
            this.f9171v.mo9035b(false, (String) null, new C3538r3(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: au */
    public /* synthetic */ void m11219au() {
        if (!isFinishing() && hasWindowFocus()) {
            m11180aC();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: av */
    public /* synthetic */ void m11220av() {
        mo8941b(this.f9143ap.getStatus());
    }

    /* access modifiers changed from: private */
    /* renamed from: ay */
    public /* synthetic */ void m11223ay() {
        this.f9135ah.setVisibility(0);
        this.f9135ah.setAlpha(1.0f);
    }

    /* access modifiers changed from: private */
    /* renamed from: az */
    public /* synthetic */ void m11224az() {
        m11232b(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m11229b(View view) {
        this.f9164o.setAlpha(1.0f);
        onBackPressed();
        this.f9164o.setEnabled(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0119, code lost:
        if (r9 == null) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x014f, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m11240c(com.facetec.sdk.FaceTecSessionStatus r8, com.facetec.sdk.FaceTecIDScanStatus r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.f9100I     // Catch:{ all -> 0x0150 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r7)
            return
        L_0x0007:
            com.facetec.sdk.c3 r0 = new com.facetec.sdk.c3     // Catch:{ all -> 0x0150 }
            r0.<init>(r7)     // Catch:{ all -> 0x0150 }
            com.facetec.sdk.C2920cv.m12195c(r0)     // Catch:{ all -> 0x0150 }
            com.facetec.sdk.C2949dl.m12481d()     // Catch:{ all -> 0x0150 }
            com.facetec.sdk.FaceTecFaceScanProcessor r0 = com.facetec.sdk.FaceTecSessionActivity.f8641e     // Catch:{ all -> 0x0150 }
            r1 = 1
            if (r0 == 0) goto L_0x004f
            boolean r0 = r7.f9099H     // Catch:{ all -> 0x0150 }
            if (r0 != 0) goto L_0x004f
            boolean r0 = r7.f9155f     // Catch:{ all -> 0x0150 }
            if (r0 != 0) goto L_0x004f
            com.facetec.sdk.FaceTecSessionResult r0 = new com.facetec.sdk.FaceTecSessionResult     // Catch:{ all -> 0x0150 }
            byte[][] r2 = r7.f9175z     // Catch:{ all -> 0x0150 }
            byte[][] r3 = r7.f9092A     // Catch:{ all -> 0x0150 }
            byte[] r4 = r7.f9093B     // Catch:{ all -> 0x0150 }
            r0.<init>(r8, r2, r3, r4)     // Catch:{ all -> 0x0150 }
            r7.f9169t = r0     // Catch:{ all -> 0x0150 }
            r7.f9099H = r1     // Catch:{ all -> 0x0150 }
            com.facetec.sdk.FaceTecSessionStatus r0 = r0.getStatus()     // Catch:{ all -> 0x0150 }
            if (r0 == 0) goto L_0x0043
            com.facetec.sdk.c r0 = com.facetec.sdk.C2867c.FACESCAN_CALLBACK_CALLED     // Catch:{ all -> 0x0150 }
            com.facetec.sdk.FaceTecSessionResult r2 = r7.f9169t     // Catch:{ all -> 0x0150 }
            com.facetec.sdk.FaceTecSessionStatus r2 = r2.getStatus()     // Catch:{ all -> 0x0150 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0150 }
            com.facetec.sdk.C3555s.m13898c((android.content.Context) r7, (com.facetec.sdk.C2867c) r0, (java.lang.String) r2)     // Catch:{ all -> 0x0150 }
        L_0x0043:
            com.facetec.sdk.FaceTecFaceScanProcessor r0 = com.facetec.sdk.FaceTecSessionActivity.f8641e     // Catch:{ all -> 0x0150 }
            com.facetec.sdk.FaceTecSessionResult r2 = r7.f9169t     // Catch:{ all -> 0x0150 }
            com.facetec.sdk.az r3 = new com.facetec.sdk.az     // Catch:{ all -> 0x0150 }
            r3.<init>(r7)     // Catch:{ all -> 0x0150 }
            r0.processSessionWhileFaceTecSDKWaits(r2, r3)     // Catch:{ all -> 0x0150 }
        L_0x004f:
            com.facetec.sdk.FaceTecIDScanProcessor r0 = com.facetec.sdk.FaceTecSessionActivity.f8642g     // Catch:{ all -> 0x0150 }
            if (r0 == 0) goto L_0x00a7
            boolean r0 = r7.f9096E     // Catch:{ all -> 0x0150 }
            if (r0 != 0) goto L_0x00a7
            com.facetec.sdk.FaceTecIDScanResult r0 = new com.facetec.sdk.FaceTecIDScanResult     // Catch:{ all -> 0x0150 }
            r0.<init>((com.facetec.sdk.FaceTecIDScanStatus) r9)     // Catch:{ all -> 0x0150 }
            r7.f9143ap = r0     // Catch:{ all -> 0x0150 }
            r7.f9096E = r1     // Catch:{ all -> 0x0150 }
            com.facetec.sdk.s$d r2 = com.facetec.sdk.C3555s.C3562d.USER_WAS_SUCCESSFUL     // Catch:{ all -> 0x0150 }
            com.facetec.sdk.FaceTecIDScanStatus r0 = r0.getStatus()     // Catch:{ all -> 0x0150 }
            com.facetec.sdk.FaceTecIDScanStatus r3 = com.facetec.sdk.FaceTecIDScanStatus.USER_CANCELED     // Catch:{ all -> 0x0150 }
            if (r0 != r3) goto L_0x006d
            com.facetec.sdk.s$d r2 = com.facetec.sdk.C3555s.C3562d.USER_CANCELLED     // Catch:{ all -> 0x0150 }
            goto L_0x0079
        L_0x006d:
            com.facetec.sdk.FaceTecIDScanResult r0 = r7.f9143ap     // Catch:{ all -> 0x0150 }
            com.facetec.sdk.FaceTecIDScanStatus r0 = r0.getStatus()     // Catch:{ all -> 0x0150 }
            com.facetec.sdk.FaceTecIDScanStatus r3 = com.facetec.sdk.FaceTecIDScanStatus.CONTEXT_SWITCH     // Catch:{ all -> 0x0150 }
            if (r0 != r3) goto L_0x0079
            com.facetec.sdk.s$d r2 = com.facetec.sdk.C3555s.C3562d.SESSION_CONTEXT_SWITCH     // Catch:{ all -> 0x0150 }
        L_0x0079:
            com.facetec.sdk.m r0 = r7.f9161l     // Catch:{ all -> 0x0150 }
            if (r0 == 0) goto L_0x0084
            java.lang.String r3 = r7.f9163n     // Catch:{ all -> 0x0150 }
            boolean r4 = r7.f9155f     // Catch:{ all -> 0x0150 }
            r0.mo9788d((android.content.Context) r7, (com.facetec.sdk.C3555s.C3562d) r2, (java.lang.String) r3, (boolean) r4)     // Catch:{ all -> 0x0150 }
        L_0x0084:
            com.facetec.sdk.FaceTecIDScanResult r0 = r7.f9143ap     // Catch:{ all -> 0x0150 }
            com.facetec.sdk.FaceTecIDScanStatus r0 = r0.getStatus()     // Catch:{ all -> 0x0150 }
            if (r0 == 0) goto L_0x009b
            com.facetec.sdk.c r0 = com.facetec.sdk.C2867c.ID_SCAN_CALLBACK_CALLED     // Catch:{ all -> 0x0150 }
            com.facetec.sdk.FaceTecIDScanResult r2 = r7.f9143ap     // Catch:{ all -> 0x0150 }
            com.facetec.sdk.FaceTecIDScanStatus r2 = r2.getStatus()     // Catch:{ all -> 0x0150 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0150 }
            com.facetec.sdk.C3555s.m13898c((android.content.Context) r7, (com.facetec.sdk.C2867c) r0, (java.lang.String) r2)     // Catch:{ all -> 0x0150 }
        L_0x009b:
            com.facetec.sdk.FaceTecIDScanProcessor r0 = com.facetec.sdk.FaceTecSessionActivity.f8642g     // Catch:{ all -> 0x0150 }
            com.facetec.sdk.FaceTecIDScanResult r2 = r7.f9143ap     // Catch:{ all -> 0x0150 }
            com.facetec.sdk.bj r3 = new com.facetec.sdk.bj     // Catch:{ all -> 0x0150 }
            r3.<init>(r7)     // Catch:{ all -> 0x0150 }
            r0.processIDScanWhileFaceTecSDKWaits(r2, r3)     // Catch:{ all -> 0x0150 }
        L_0x00a7:
            r7.f9094C = r1     // Catch:{ all -> 0x0150 }
            boolean r0 = r7.f9097F     // Catch:{ all -> 0x0150 }
            if (r0 != 0) goto L_0x014e
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x0150 }
            r0.<init>()     // Catch:{ all -> 0x0150 }
            r2 = 0
            r7.m11232b((boolean) r2)     // Catch:{ all -> 0x0103 }
            com.facetec.sdk.m r3 = r7.f9161l     // Catch:{ all -> 0x0103 }
            if (r3 == 0) goto L_0x00bd
            r3.mo9786b()     // Catch:{ all -> 0x0103 }
        L_0x00bd:
            com.facetec.sdk.C2795aq.m10864b(r8, r7)     // Catch:{ all -> 0x0103 }
            int[] r3 = com.facetec.sdk.C2831bd.C28322.f9176d     // Catch:{ all -> 0x0103 }
            int r4 = r8.ordinal()     // Catch:{ all -> 0x0103 }
            r3 = r3[r4]     // Catch:{ all -> 0x0103 }
            switch(r3) {
                case 1: goto L_0x00d8;
                case 2: goto L_0x00d2;
                case 3: goto L_0x00d2;
                case 4: goto L_0x00d2;
                case 5: goto L_0x00d2;
                case 6: goto L_0x00cb;
                case 7: goto L_0x00cc;
                case 8: goto L_0x00cc;
                case 9: goto L_0x00cc;
                default: goto L_0x00cb;
            }     // Catch:{ all -> 0x0103 }
        L_0x00cb:
            goto L_0x00dd
        L_0x00cc:
            com.facetec.sdk.ap r3 = com.facetec.sdk.C2794ap.FT_EVENT_VERIFY_SESSION_CANCEL     // Catch:{ all -> 0x0103 }
            com.facetec.sdk.C2785al.m10842e((android.content.Context) r7, (com.facetec.sdk.C2794ap) r3)     // Catch:{ all -> 0x0103 }
            goto L_0x00dd
        L_0x00d2:
            com.facetec.sdk.ap r3 = com.facetec.sdk.C2794ap.FT_EVENT_VERIFY_SESSION_FAIL     // Catch:{ all -> 0x0103 }
            com.facetec.sdk.C2785al.m10842e((android.content.Context) r7, (com.facetec.sdk.C2794ap) r3)     // Catch:{ all -> 0x0103 }
            goto L_0x00dd
        L_0x00d8:
            com.facetec.sdk.ap r3 = com.facetec.sdk.C2794ap.FT_EVENT_VERIFY_SESSION_SUCCESS     // Catch:{ all -> 0x0103 }
            com.facetec.sdk.C2785al.m10842e((android.content.Context) r7, (com.facetec.sdk.C2794ap) r3)     // Catch:{ all -> 0x0103 }
        L_0x00dd:
            com.facetec.sdk.FaceTecSessionResult r3 = new com.facetec.sdk.FaceTecSessionResult     // Catch:{ all -> 0x0103 }
            byte[][] r4 = r7.f9175z     // Catch:{ all -> 0x0103 }
            byte[][] r5 = r7.f9092A     // Catch:{ all -> 0x0103 }
            byte[] r6 = r7.f9093B     // Catch:{ all -> 0x0103 }
            r3.<init>(r8, r4, r5, r6)     // Catch:{ all -> 0x0103 }
            java.lang.String r4 = com.facetec.sdk.C2888cg.f9550b     // Catch:{ all -> 0x0103 }
            r3.mo8777b(r4)     // Catch:{ all -> 0x0103 }
            java.lang.String r4 = "facetecsdk.signup.sessionResult"
            r0.putExtra(r4, r3)     // Catch:{ all -> 0x0103 }
            com.facetec.sdk.FaceTecIDScanProcessor r4 = com.facetec.sdk.FaceTecSessionActivity.f8642g     // Catch:{ all -> 0x0103 }
            if (r4 == 0) goto L_0x0100
            r7.m11196aS()     // Catch:{ all -> 0x0103 }
            java.lang.String r4 = "facetecsdk.signup.idScanResult"
            com.facetec.sdk.FaceTecIDScanResult r5 = r7.f9143ap     // Catch:{ all -> 0x0103 }
            r0.putExtra(r4, r5)     // Catch:{ all -> 0x0103 }
        L_0x0100:
            r7.f9169t = r3     // Catch:{ all -> 0x0103 }
            goto L_0x0107
        L_0x0103:
            r3 = move-exception
            com.facetec.sdk.C3330l.m13346d(r3)     // Catch:{ all -> 0x0150 }
        L_0x0107:
            r3 = 0
            com.facetec.sdk.FaceTecSessionActivity.f8641e = r3     // Catch:{ all -> 0x0150 }
            com.facetec.sdk.FaceTecSessionActivity.f8642g = r3     // Catch:{ all -> 0x0150 }
            r3 = -1
            r7.setResult(r3, r0)     // Catch:{ all -> 0x0150 }
            r7.finish()     // Catch:{ all -> 0x0150 }
            r7.f9097F = r1     // Catch:{ all -> 0x0150 }
            boolean r0 = r7.f9112U     // Catch:{ Exception -> 0x011c }
            if (r0 == 0) goto L_0x0120
            if (r9 != 0) goto L_0x0120
            goto L_0x0121
        L_0x011c:
            r9 = move-exception
            com.facetec.sdk.C3330l.m13346d(r9)     // Catch:{ all -> 0x0150 }
        L_0x0120:
            r1 = r2
        L_0x0121:
            com.facetec.sdk.FaceTecSessionStatus r9 = com.facetec.sdk.FaceTecSessionStatus.SESSION_UNSUCCESSFUL     // Catch:{ all -> 0x0150 }
            if (r8 != r9) goto L_0x0136
            com.facetec.sdk.FaceTecCustomization r8 = com.facetec.sdk.FaceTecSDK.f8630e     // Catch:{ all -> 0x0150 }
            int r8 = r8.exitAnimationUnsuccessResourceID     // Catch:{ all -> 0x0150 }
            if (r8 != r3) goto L_0x0131
            if (r1 == 0) goto L_0x0130
            int r8 = com.facetec.sdk.C2747R.anim.facetec_fade_out     // Catch:{ all -> 0x0150 }
            goto L_0x0131
        L_0x0130:
            r8 = r2
        L_0x0131:
            r7.overridePendingTransition(r2, r8)     // Catch:{ all -> 0x0150 }
            monitor-exit(r7)
            return
        L_0x0136:
            com.facetec.sdk.FaceTecSessionStatus r9 = com.facetec.sdk.FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY     // Catch:{ all -> 0x0150 }
            if (r8 != r9) goto L_0x014b
            com.facetec.sdk.FaceTecCustomization r8 = com.facetec.sdk.FaceTecSDK.f8630e     // Catch:{ all -> 0x0150 }
            int r8 = r8.exitAnimationSuccessResourceID     // Catch:{ all -> 0x0150 }
            if (r8 != r3) goto L_0x0146
            if (r1 == 0) goto L_0x0145
            int r8 = com.facetec.sdk.C2747R.anim.facetec_fade_out     // Catch:{ all -> 0x0150 }
            goto L_0x0146
        L_0x0145:
            r8 = r2
        L_0x0146:
            r7.overridePendingTransition(r2, r8)     // Catch:{ all -> 0x0150 }
            monitor-exit(r7)
            return
        L_0x014b:
            r7.overridePendingTransition(r2, r2)     // Catch:{ all -> 0x0150 }
        L_0x014e:
            monitor-exit(r7)
            return
        L_0x0150:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2831bd.m11240c(com.facetec.sdk.FaceTecSessionStatus, com.facetec.sdk.FaceTecIDScanStatus):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m11248d(GradientDrawable gradientDrawable, int i, ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        this.f9123aF = num;
        gradientDrawable.setStroke(i, num.intValue());
        this.f9129ab.setBackground(gradientDrawable);
        this.f9131ad.setBackground(gradientDrawable);
        this.f9138ak.setBackground(gradientDrawable);
        this.f9129ab.invalidate();
        this.f9131ad.invalidate();
        this.f9138ak.invalidate();
    }

    /* renamed from: e */
    private void m11255e(FaceTecIDScanNextStep faceTecIDScanNextStep) {
        if (this.f9171v == null) {
            m11250d(faceTecIDScanNextStep, false);
            this.f9103L = false;
            return;
        }
        this.f9171v.mo8844e(new C3652w3(this, faceTecIDScanNextStep));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m11262g(FaceTecIDScanNextStep faceTecIDScanNextStep) {
        if (!isFinishing()) {
            m11250d(faceTecIDScanNextStep, false);
            this.f9103L = false;
            C2900cm cmVar = this.f9171v;
            cmVar.f9634c.animate().alpha(Utils.FLOAT_EPSILON).setDuration(500).setStartDelay(500).setListener((Animator.AnimatorListener) null).withEndAction(new C3497p4(this)).start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m11267i(FaceTecIDScanNextStep faceTecIDScanNextStep) {
        C2900cm cmVar = this.f9171v;
        C2900cm cmVar2 = this.f9171v;
        Objects.requireNonNull(cmVar2);
        cmVar.mo9040d((Runnable) new C2792ao.C2793e(new C3694y3(this, faceTecIDScanNextStep)));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ byte[] m11270j(String str) {
        return C2885cd.m11859t(str, this.f9163n, "");
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo8917f() {
        this.f9098G = true;
    }

    public Context getApplicationContext() {
        return super.getApplicationContext();
    }

    public Context getBaseContext() {
        return super.getBaseContext();
    }

    public Resources getResources() {
        return super.getResources();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo8919h() {
        C2949dl.m12481d();
        if (C2799at.f8964b) {
            this.f9161l.mo9785a(this, C3555s.C3562d.PRE_SESSION_PHASE_2_TIMEOUT);
        } else {
            this.f9161l.mo9785a(this, C3555s.C3562d.PRE_SESSION_PHASE_1_TIMEOUT);
        }
        this.f9175z = null;
        this.f9092A = null;
        this.f9093B = null;
        try {
            boolean z = C2885cd.m11865y().length != 0;
            m11258e(false);
            this.f9082b.mo9025i();
            this.f9173x = (C2905cn) getFragmentManager().findFragmentByTag("RetryZoom");
            this.f9156g = (C2855bq) getFragmentManager().findFragmentByTag("PreEnroll");
            if (this.f9173x != null) {
                if (this.f9173x.mo9045m()) {
                    if (!this.f9173x.mo9045m() || z) {
                        this.f9173x.mo8878e(false, 500, 0);
                        this.f9173x.f9035d.animate().alpha(1.0f).setDuration(500).setListener((Animator.AnimatorListener) null).start();
                    }
                }
                this.f9173x.mo8873b(this, true);
                return;
            } else if (this.f9156g != null) {
                if (!z) {
                    this.f9156g.mo8873b(this, true);
                    return;
                } else {
                    this.f9156g.mo8878e(false, 500, 0);
                    this.f9156g.f9035d.animate().alpha(1.0f).setDuration(500).setListener((Animator.AnimatorListener) null).start();
                }
            }
            m11228b(500);
        } catch (Throwable th) {
            C2867c cVar = C2867c.SEVERE_ERROR;
            StringBuilder sb = new StringBuilder();
            FaceTecSessionStatus faceTecSessionStatus = FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR;
            sb.append(faceTecSessionStatus);
            sb.append(": ");
            sb.append(th.getMessage());
            C3555s.m13907d(this, th, cVar, sb.toString(), true);
            m11256e(faceTecSessionStatus);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final synchronized void mo8922k() {
        C3555s.m13898c((Context) this, C2867c.NON_FATAL_ERROR, FaceTecSessionStatus.USER_CANCELLED.toString());
        C2888cg cgVar = this.f9082b;
        if (cgVar != null) {
            cgVar.mo9025i();
            this.f9082b.mo9018d(true);
            if (!this.f9082b.mo9022e(this, false)) {
                mo8916e(C2790am.f8921r);
            }
            this.f9173x.mo9044l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo8923l() {
        this.f9154e = C2799at.m10896e();
        this.f9098G = false;
        C2885cd.m11799ac(C2949dl.m12473a());
        C2799at.f8964b = true;
        m11162W();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final synchronized void mo8924m() {
        this.f9161l.mo9785a(this, C3555s.C3562d.USER_CANCELLED);
        C2867c cVar = C2867c.NON_FATAL_ERROR;
        FaceTecSessionStatus faceTecSessionStatus = FaceTecSessionStatus.USER_CANCELLED;
        C3555s.m13898c((Context) this, cVar, faceTecSessionStatus.toString());
        mo8946d(faceTecSessionStatus, (FaceTecIDScanStatus) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo8925n() {
        C2885cd.m11799ac(C2949dl.m12473a());
        C2799at.f8964b = true;
        m11162W();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final synchronized void mo8926o() {
        Handler handler = this.f9081a;
        if (handler != null) {
            handler.removeCallbacks((Runnable) null);
        }
        if (this.f9140am) {
            m11232b(false);
            if (this.f9155f) {
                mo8946d(FaceTecSessionStatus.USER_CANCELLED, FaceTecIDScanStatus.USER_CANCELED);
            } else if (this.f9098G) {
                this.f9161l.mo9785a(this, C3555s.C3562d.USER_CANCELLED);
                C2920cv.m12196e(new C3152g3(this));
            } else {
                mo8946d(this.f9169t.getStatus(), FaceTecIDScanStatus.USER_CANCELED);
            }
        } else {
            this.f9161l.mo9785a(this, C3555s.C3562d.USER_CANCELLED);
            m11258e(false);
            C2888cg cgVar = this.f9082b;
            if (cgVar == null) {
                C2867c cVar = C2867c.PHOENIX_HANDLER_UNEXPECTED_NULL;
                StringBuilder sb = new StringBuilder("Coming from onUserCancelled(). Activity State Info: ");
                sb.append(C3555s.m13884a((Activity) this));
                C3555s.m13898c((Context) this, cVar, sb.toString());
                return;
            }
            C2835e eVar = this.f9166q;
            if (eVar == C2835e.PRE_SESSION_STARTED) {
                cgVar.mo9025i();
            } else if (eVar == C2835e.FACESCAN_SESSION_STARTED) {
                cgVar.mo9018d(true);
            }
            this.f9082b.mo9015c(true);
            try {
                m11228b((int) TextTypeView.SEPARATOR_FULL);
            } catch (Throwable th) {
                C2867c cVar2 = C2867c.SEVERE_ERROR;
                StringBuilder sb2 = new StringBuilder("Unknown error: ");
                sb2.append(th.getMessage());
                C3555s.m13907d(this, th, cVar2, sb2.toString(), true);
                mo8946d(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (FaceTecIDScanStatus) null);
            }
        }
    }

    public synchronized void onBackPressed() {
        C2848bl blVar;
        if (!m11124G()) {
            if (m11149P()) {
                if (!this.f9109R) {
                    if (this.f9140am && (blVar = this.f9160k) != null) {
                        blVar.f9278d.mo9158c(false, true);
                        blVar.f9279e.mo9158c(false, true);
                        blVar.f9270a.mo9158c(false, true);
                        blVar.f9276b.mo9158c(false, true);
                        mo8941b(FaceTecIDScanStatus.USER_CANCELED);
                        return;
                    } else if (mo8911b()) {
                        mo8914d(false);
                        mo8945d(FaceTecSessionStatus.CAMERA_PERMISSION_DENIED);
                        return;
                    } else if (this.f9173x != null && getFragmentManager().findFragmentByTag("RetryZoom") != null) {
                        ((C2813ay) getFragmentManager().findFragmentByTag("RetryZoom")).mo8872b();
                        return;
                    } else if (!(this.f9156g == null || getFragmentManager().findFragmentByTag("PreEnroll") == null)) {
                        if (mo8912c() != C2829bc.C2830b.GRANTED) {
                            mo8931s();
                            return;
                        } else {
                            mo8929q();
                            return;
                        }
                    }
                }
                mo8926o();
            }
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"ClickableViewAccessibility"})
    public synchronized void onCreate(Bundle bundle) {
        boolean z;
        FaceTecSessionStatus faceTecSessionStatus;
        super.onCreate((Bundle) null);
        boolean z2 = false;
        if (bundle != null) {
            setResult(0);
            finish();
            return;
        }
        C2923cy.m12208e(this);
        C2938dc.m12359bn();
        boolean booleanExtra = getIntent().getBooleanExtra("facetec.idScanOnlyMode", false);
        this.f9155f = booleanExtra;
        if (FaceTecSessionActivity.f8641e != null || booleanExtra) {
            C3555s.m13898c((Context) this, C2867c.FULL_SESSION_START, (String) null);
            Window window = getWindow();
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            if (!FaceTecSDK.f8630e.f8602e) {
                getWindow().addFlags(8192);
            }
            int i = FaceTecCustomization.activityThemeId;
            if (i != 0) {
                setTheme(i);
            }
            String stringExtra = getIntent().getStringExtra("zoom.serverSessionToken");
            this.f9157h = stringExtra;
            if (stringExtra == null) {
                this.f9157h = "";
            }
            setContentView(C2747R.layout.facetec_main_activity);
            int i2 = C2747R.C2749id.signupContainer;
            this.f9128aa = i2;
            this.f9117Z = findViewById(C2747R.C2749id.mainLayout);
            this.f9138ak = findViewById(C2747R.C2749id.zoomFrameShadowView);
            this.f9129ab = (RelativeLayout) findViewById(C2747R.C2749id.outerContainer);
            this.f9135ah = (RelativeLayout) findViewById(C2747R.C2749id.faceScanCameraContainer);
            this.f9133af = (RelativeLayout) findViewById(C2747R.C2749id.faceScanCameraTransitionView);
            this.f9132ae = (RelativeLayout) findViewById(C2747R.C2749id.faceScanCameraLayout);
            this.f9134ag = (RelativeLayout) findViewById(i2);
            this.f9131ad = (RelativeLayout) findViewById(C2747R.C2749id.borderCover);
            this.f9137aj = (RelativeLayout) findViewById(C2747R.C2749id.subZoomFrame);
            this.f9136ai = (LinearLayout) findViewById(C2747R.C2749id.brandingLogoContainer);
            this.f9139al = (RelativeLayout) findViewById(C2747R.C2749id.faceScanSessionLayout);
            this.f9152ay = (ImageView) findViewById(C2747R.C2749id.brandingLogoBottom);
            this.f9174y = findViewById(C2747R.C2749id.overlayBackgroundView);
            setTitle(" ");
            try {
                FaceTecSDK.setCustomization(C2938dc.m12376c(FaceTecSDK.f8630e));
                FaceTecGuidanceCustomization faceTecGuidanceCustomization = FaceTecSDK.f8630e.f8606i;
                C2839bf.f9198b = faceTecGuidanceCustomization.subtextFont;
                Typeface typeface = faceTecGuidanceCustomization.buttonFont;
                C2839bf.f9199c = faceTecGuidanceCustomization.headerFont;
                RelativeLayout relativeLayout = (RelativeLayout) findViewById(C2747R.C2749id.backgroundCover);
                this.f9083c = relativeLayout;
                relativeLayout.setAlpha(Utils.FLOAT_EPSILON);
                int i3 = FaceTecSDK.f8630e.f8611n.backgroundColor;
                if (i3 == 0) {
                    this.f9083c.setBackgroundColor(getResources().getColor(C2747R.color.facetec_outline_shadow_dark));
                } else {
                    this.f9083c.setBackgroundColor(i3);
                }
                int i4 = C2747R.C2749id.backgroundColor;
                this.f9084d = findViewById(i4);
                C2938dc.m12316b(findViewById(i4));
                this.f9081a = new Handler();
                int aO = C2938dc.m12273aO();
                int aU = C2938dc.m12279aU();
                FaceTecCustomization faceTecCustomization = FaceTecSDK.f8630e;
                int i5 = faceTecCustomization.f8607j.brandingImage;
                if (i5 == 0) {
                    i5 = C2747R.C2748drawable.facetec_your_app_logo;
                }
                FaceTecCancelButtonCustomization faceTecCancelButtonCustomization = faceTecCustomization.f8612o;
                int i6 = faceTecCancelButtonCustomization.customImage;
                if (i6 == 0) {
                    i6 = C2747R.C2748drawable.facetec_cancel;
                }
                if (faceTecCancelButtonCustomization.f8592a == FaceTecCancelButtonCustomization.ButtonLocation.DISABLED || i6 != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (FaceTecSessionActivity.f8641e != null && (aU == 0 || i5 == 0)) {
                    z = true;
                }
                if (aO == 0) {
                    z = true;
                }
                if (z) {
                    mo8946d(FaceTecSessionStatus.MISSING_GUIDANCE_IMAGES, (FaceTecIDScanStatus) null);
                    return;
                }
                FaceTecCustomization faceTecCustomization2 = FaceTecSDK.f8630e;
                FaceTecGuidanceCustomization faceTecGuidanceCustomization2 = faceTecCustomization2.f8606i;
                faceTecGuidanceCustomization2.retryScreenIdealImage = aO;
                faceTecGuidanceCustomization2.cameraPermissionsScreenImage = aU;
                faceTecCustomization2.f8607j.brandingImage = i5;
                FaceTecCancelButtonCustomization faceTecCancelButtonCustomization2 = faceTecCustomization2.f8612o;
                faceTecCancelButtonCustomization2.customImage = i6;
                if (faceTecCancelButtonCustomization2.f8592a == FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM && FaceTecSDK.f8630e.f8612o.f8593e != null) {
                    ImageView imageView = (ImageView) findViewById(C2747R.C2749id.customLocationBackButton);
                    this.f9164o = imageView;
                    imageView.setAlpha(Utils.FLOAT_EPSILON);
                    this.f9164o.setVisibility(0);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams.setMarginStart((int) C2810ax.m10988b(FaceTecSDK.f8630e.f8612o.f8593e.left));
                    layoutParams.topMargin = (int) C2810ax.m10988b(FaceTecSDK.f8630e.f8612o.f8593e.top);
                    layoutParams.width = (int) C2810ax.m10988b(FaceTecSDK.f8630e.f8612o.f8593e.right);
                    layoutParams.height = (int) C2810ax.m10988b(FaceTecSDK.f8630e.f8612o.f8593e.bottom);
                    this.f9164o.setLayoutParams(layoutParams);
                    if (FaceTecSDK.f8630e.f8612o.customImage != 0) {
                        this.f9164o.setImageDrawable(C0767a.m2895e(this, C2938dc.m12266aH()));
                    }
                    this.f9164o.setOnClickListener(new C3183h3(this));
                    this.f9164o.setOnTouchListener(new C3205i3(this));
                }
                FaceTecSDKStatus d = C2840bg.m11366d(this);
                if (d != FaceTecSDKStatus.INITIALIZED) {
                    switch (C28322.f9177e[d.ordinal()]) {
                        case 1:
                            faceTecSessionStatus = FaceTecSessionStatus.NON_PRODUCTION_MODE_KEY_INVALID;
                            break;
                        case 2:
                            faceTecSessionStatus = FaceTecSessionStatus.NON_PRODUCTION_MODE_NETWORK_REQUIRED;
                            break;
                        case 3:
                            faceTecSessionStatus = FaceTecSessionStatus.LOCKED_OUT;
                            break;
                        case 4:
                            faceTecSessionStatus = FaceTecSessionStatus.ENCRYPTION_KEY_INVALID;
                            break;
                        case 5:
                            faceTecSessionStatus = FaceTecSessionStatus.LANDSCAPE_MODE_NOT_ALLOWED;
                            break;
                        case 6:
                            faceTecSessionStatus = FaceTecSessionStatus.REVERSE_PORTRAIT_NOT_ALLOWED;
                            break;
                        default:
                            faceTecSessionStatus = null;
                            break;
                    }
                    if (faceTecSessionStatus != null) {
                        C3555s.m13898c((Context) this, C2867c.NON_FATAL_ERROR, faceTecSessionStatus.toString());
                        mo8946d(faceTecSessionStatus, (FaceTecIDScanStatus) null);
                        return;
                    }
                    C2867c cVar = C2867c.SEVERE_ERROR;
                    StringBuilder sb = new StringBuilder("Couldn't start session with status: ");
                    sb.append(d.name());
                    C3555s.m13898c((Context) this, cVar, sb.toString());
                    mo8946d(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (FaceTecIDScanStatus) null);
                    return;
                }
                C2938dc.m12400d(this.f9174y);
                C2949dl.m12485e(this);
                this.f9082b = C2888cg.m11917d((Activity) this);
                C2920cv.m12195c(new C3227j3(this));
                this.f9161l = new C3401m();
                C2888cg.m11923f();
                C2885cd.m11765C(FaceTecSDK.f8630e.f8613p);
                C2885cd.m11835e(C2840bg.m11350b(), C2840bg.f9201b);
                this.f9082b.mo9016d();
                C2852bo.m11540c(this);
                C2780ai.f8828e = false;
                if (!C2827ba.f9071d) {
                    C2780ai.m10761b((Context) this);
                } else {
                    C2780ai.m10764c(this);
                }
                C2938dc.m12251a();
                C2785al.m10832b(this, C2794ap.FT_EVENT_VERIFY_SESSION_START, new C3284k3(this));
                C2920cv.m12196e(new C3406m3());
                int b = (int) (C2810ax.m10988b(C2938dc.m12431j()) * C2938dc.m12404e());
                C2938dc.m12421h();
                if (C2938dc.m12404e() < 1.0f) {
                    float d2 = C2780ai.m10765d();
                    int i7 = Resources.getSystem().getDisplayMetrics().widthPixels;
                    int i8 = (int) (((double) Resources.getSystem().getDisplayMetrics().widthPixels) * ((double) d2));
                    float e = C2938dc.m12404e();
                    float f = (float) i7;
                    this.f9158i = e * f;
                    this.f9162m = ((float) i8) * e;
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) this.f9158i, (int) this.f9162m);
                    float f2 = this.f9158i;
                    layoutParams2.setMargins(((int) (f - f2)) / 2, (b / 2) + 10, ((int) (f - f2)) / 2, 0);
                    this.f9129ab.setLayoutParams(layoutParams2);
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(((int) this.f9158i) + b, ((int) this.f9162m) + b);
                    float f3 = this.f9158i;
                    float f4 = (float) b;
                    layoutParams3.setMargins(((int) (f - (f3 + f4))) / 2, 10, ((int) (f - (f3 + f4))) / 2, 0);
                    this.f9131ad.setLayoutParams(layoutParams3);
                    ((View) this.f9138ak.getParent()).setLayoutParams(layoutParams3);
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams((int) this.f9158i, (int) this.f9162m);
                    layoutParams4.setMargins(0, 0, 0, 0);
                    this.f9132ae.setLayoutParams(layoutParams4);
                    RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams((int) this.f9158i, (int) this.f9162m);
                    layoutParams5.setMargins(0, 0, 0, 0);
                    this.f9134ag.setLayoutParams(layoutParams5);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    float b2 = C2810ax.m10988b(C2938dc.m12456v()) * e;
                    gradientDrawable.setCornerRadius(b2);
                    int e2 = C2938dc.m12408e((Context) this, FaceTecSDK.f8630e.f8611n.borderColor);
                    gradientDrawable.setStroke(b, e2);
                    this.f9129ab.setBackground(gradientDrawable);
                    this.f9131ad.setBackground(gradientDrawable);
                    this.f9129ab.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                    this.f9129ab.setClipToOutline(true);
                    if (FaceTecSDK.f8630e.f8611n.elevation > 0) {
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        gradientDrawable2.setCornerRadius(b2);
                        gradientDrawable2.setStroke(b, e2);
                        gradientDrawable2.setColor(C2938dc.m12408e((Context) this, C2938dc.m12232K()));
                        this.f9138ak.setBackground(gradientDrawable2);
                        this.f9138ak.setElevation(C2810ax.m10988b(FaceTecSDK.f8630e.f8611n.elevation));
                        this.f9138ak.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                        this.f9138ak.setClipToOutline(false);
                        this.f9138ak.requestLayout();
                    }
                }
                FaceTecOverlayCustomization faceTecOverlayCustomization = FaceTecSDK.f8630e.f8607j;
                int i9 = faceTecOverlayCustomization.brandingImage;
                if (i9 != 0 && faceTecOverlayCustomization.showBrandingImage) {
                    this.f9152ay.setImageDrawable(C0767a.m2895e(this, i9));
                    this.f9152ay.setVisibility(0);
                    float f5 = this.f9158i;
                    if (f5 > Utils.FLOAT_EPSILON) {
                        this.f9152ay.setMaxWidth((int) f5);
                    } else {
                        this.f9152ay.setMaxWidth(Resources.getSystem().getDisplayMetrics().widthPixels);
                    }
                    if ((getResources().getConfiguration().screenLayout & 15) >= 3) {
                        this.f9136ai.setWeightSum(1.0f);
                        this.f9152ay.setMaxHeight((int) C2810ax.m10988b(50));
                        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) this.f9152ay.getLayoutParams();
                        layoutParams6.topMargin = (int) C2810ax.m10988b(15);
                        layoutParams6.gravity = 48;
                        this.f9152ay.setLayoutParams(layoutParams6);
                        this.f9152ay.requestLayout();
                        this.f9136ai.requestLayout();
                    }
                }
                C2938dc.m12412e((View) this.f9133af);
                if (mo8912c() == C2829bc.C2830b.GRANTED) {
                    m11164X();
                }
                m11158U();
            } catch (C2778ah e3) {
                C2867c cVar2 = C2867c.CAMERA_ERROR;
                StringBuilder sb2 = new StringBuilder("FTCameraException: ");
                sb2.append(e3.getMessage());
                String obj = sb2.toString();
                if (!C2780ai.f8828e) {
                    z2 = true;
                }
                C3555s.m13907d(this, e3, cVar2, obj, z2);
                mo8946d(FaceTecSessionStatus.CAMERA_INITIALIZATION_ISSUE, (FaceTecIDScanStatus) null);
            } catch (C2798as e4) {
                C2867c cVar3 = C2867c.SEVERE_ERROR;
                StringBuilder sb3 = new StringBuilder("FTInternalException: ");
                sb3.append(e4.getMessage());
                String obj2 = sb3.toString();
                if (!C2780ai.f8828e) {
                    z2 = true;
                }
                C3555s.m13907d(this, e4, cVar3, obj2, z2);
                mo8946d(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (FaceTecIDScanStatus) null);
            } catch (Throwable th) {
                C2867c cVar4 = C2867c.SEVERE_ERROR;
                StringBuilder sb4 = new StringBuilder("Unknown error: ");
                sb4.append(th.getMessage());
                String obj3 = sb4.toString();
                if (!C2780ai.f8828e) {
                    z2 = true;
                }
                C3555s.m13907d(this, th, cVar4, obj3, z2);
                mo8946d(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (FaceTecIDScanStatus) null);
            }
        } else {
            C2797ar.m10878a("FaceTecSessionActivity must be launched with the constructor FaceTecSDK.createAndLaunchSession(...).");
            setResult(0);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C2949dl.m12475b();
        FaceTecSDK.f8628c = FaceTecSDK.C2744a.NORMAL;
        C2835e eVar = this.f9166q;
        if (eVar == C2835e.PRE_SESSION_STARTED) {
            C2885cd.m11840h(true);
        } else if (eVar == C2835e.FACESCAN_SESSION_STARTED) {
            C2885cd.m11796a(true);
        }
        this.f9166q = C2835e.NOT_STARTED;
        Handler handler = this.f9081a;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        if (!(this.f9153az == null || m11154S() == this.f9120aC)) {
            this.f9125aH = true;
            m11226b(m11154S(), this.f9120aC, 0);
            new Handler().postDelayed(new C3517q3(this), 800);
        }
        m11196aS();
        this.f9154e = null;
        C2949dl.m12481d();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C2954dn dnVar = this.f9114W;
        if (dnVar != null) {
            this.f9116Y = true;
            if (dnVar.mo9117c(intent, this.f9127aL)) {
                this.f9113V.mo8985d();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (mo8912c() == C2829bc.C2830b.GRANTED) {
            m11168Z();
            if (this.f9109R) {
                this.f9115X = true;
            } else if (!C2780ai.f8828e) {
                if (isFinishing()) {
                    C2920cv.m12195c(new C3184h4(this));
                } else if (!mo8911b()) {
                    mo8913d();
                }
                C2949dl.m12481d();
            }
        }
    }

    public synchronized void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        boolean z = false;
        mo8914d(false);
        if (i == 0) {
            try {
                SharedPreferences.Editor edit = C2840bg.m11376g(this).edit();
                edit.putBoolean("cameraPermissionsShown", true);
                edit.apply();
                if (iArr.length == 1 && iArr[0] == 0) {
                    m11164X();
                    if (!this.f9155f) {
                        runOnUiThread(new C3588t4(this));
                        C2780ai aiVar = this.f9110S;
                        if (aiVar == null) {
                            m11170a(4);
                            return;
                        }
                        this.f9126aJ = true;
                        aiVar.mo8831e((Runnable) new C3609u4(this));
                        this.f9110S.mo8817e();
                    }
                    this.f9156g.mo8979k();
                } else if (this.f9155f) {
                    C2867c cVar = C2867c.NON_FATAL_ERROR;
                    FaceTecIDScanStatus faceTecIDScanStatus = FaceTecIDScanStatus.CAMERA_PERMISSION_DENIED;
                    C3555s.m13898c((Context) this, cVar, faceTecIDScanStatus.toString());
                    m11239c(faceTecIDScanStatus);
                } else {
                    C2867c cVar2 = C2867c.NON_FATAL_ERROR;
                    FaceTecSessionStatus faceTecSessionStatus = FaceTecSessionStatus.CAMERA_PERMISSION_DENIED;
                    C3555s.m13898c((Context) this, cVar2, faceTecSessionStatus.toString());
                    mo8946d(faceTecSessionStatus, (FaceTecIDScanStatus) null);
                }
            } catch (Exception e) {
                C2867c cVar3 = C2867c.SEVERE_ERROR;
                StringBuilder sb = new StringBuilder("Camera Permission Request Error: ");
                sb.append(e.getMessage());
                String obj = sb.toString();
                if (!C2780ai.f8828e) {
                    z = true;
                }
                C3555s.m13907d(this, e, cVar3, obj, z);
                mo8946d(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (FaceTecIDScanStatus) null);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00aa, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onResume() {
        /*
            r5 = this;
            monitor-enter(r5)
            super.onResume()     // Catch:{ all -> 0x00d0 }
            com.facetec.sdk.bc$b r0 = r5.mo8912c()     // Catch:{ all -> 0x00d0 }
            com.facetec.sdk.bc$b r1 = com.facetec.sdk.C2829bc.C2830b.GRANTED     // Catch:{ all -> 0x00d0 }
            if (r0 == r1) goto L_0x000e
            monitor-exit(r5)
            return
        L_0x000e:
            r0 = 0
            r5.f9168s = r0     // Catch:{ all -> 0x00d0 }
            com.facetec.sdk.ai r1 = r5.f9110S     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x001e
            boolean r2 = r1 instanceof com.facetec.sdk.C2783aj     // Catch:{ all -> 0x00d0 }
            if (r2 == 0) goto L_0x001e
            com.facetec.sdk.aj r1 = (com.facetec.sdk.C2783aj) r1     // Catch:{ all -> 0x00d0 }
            r1.mo8833g()     // Catch:{ all -> 0x00d0 }
        L_0x001e:
            com.facetec.sdk.bl r1 = r5.f9160k     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x0033
            com.facetec.sdk.ai r1 = r1.mo8972e()     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x0033
            com.facetec.sdk.bl r1 = r5.f9160k     // Catch:{ all -> 0x00d0 }
            com.facetec.sdk.ai r1 = r1.mo8972e()     // Catch:{ all -> 0x00d0 }
            com.facetec.sdk.aj r1 = (com.facetec.sdk.C2783aj) r1     // Catch:{ all -> 0x00d0 }
            r1.mo8833g()     // Catch:{ all -> 0x00d0 }
        L_0x0033:
            boolean r1 = com.facetec.sdk.C2780ai.f8828e     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x0046
            boolean r1 = r5.f9109R     // Catch:{ all -> 0x00d0 }
            if (r1 != 0) goto L_0x0046
            com.facetec.sdk.bl r1 = r5.f9160k     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x0046
            boolean r2 = r1.f9281g     // Catch:{ all -> 0x00d0 }
            if (r2 != 0) goto L_0x0046
            r1.mo8967a()     // Catch:{ all -> 0x00d0 }
        L_0x0046:
            boolean r1 = r5.f9115X     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x0051
            r5.f9115X = r0     // Catch:{ all -> 0x00d0 }
            r5.mo8938H()     // Catch:{ all -> 0x00d0 }
            monitor-exit(r5)
            return
        L_0x0051:
            boolean r1 = r5.f9095D     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x00ce
            boolean r1 = r5.f9130ac     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x005b
            monitor-exit(r5)
            return
        L_0x005b:
            r5.f9095D = r0     // Catch:{ all -> 0x00d0 }
            boolean r1 = r5.f9140am     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x0072
            com.facetec.sdk.bl r1 = r5.f9160k     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x0072
            boolean r1 = r1.isAdded()     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x0072
            com.facetec.sdk.bl r0 = r5.f9160k     // Catch:{ all -> 0x00d0 }
            r0.m11465J()     // Catch:{ all -> 0x00d0 }
            monitor-exit(r5)
            return
        L_0x0072:
            com.facetec.sdk.cg r1 = com.facetec.sdk.C2888cg.m11917d((android.app.Activity) r5)     // Catch:{ all -> 0x00ab }
            r5.f9082b = r1     // Catch:{ all -> 0x00ab }
            boolean r1 = r5.f9103L     // Catch:{ all -> 0x00ab }
            if (r1 != 0) goto L_0x0084
            r5.m11156T()     // Catch:{ all -> 0x00ab }
            com.facetec.sdk.ai r1 = r5.f9110S     // Catch:{ all -> 0x00ab }
            r1.mo8817e()     // Catch:{ all -> 0x00ab }
        L_0x0084:
            boolean r1 = r5.m11124G()     // Catch:{ all -> 0x00ab }
            if (r1 != 0) goto L_0x00a9
            boolean r1 = r5.f9103L     // Catch:{ all -> 0x00ab }
            if (r1 == 0) goto L_0x0090
            monitor-exit(r5)
            return
        L_0x0090:
            boolean r1 = r5.f9101J     // Catch:{ all -> 0x00ab }
            if (r1 == 0) goto L_0x0096
            monitor-exit(r5)
            return
        L_0x0096:
            com.facetec.sdk.bl r1 = r5.f9160k     // Catch:{ all -> 0x00ab }
            if (r1 == 0) goto L_0x00a0
            boolean r1 = r5.f9145ar     // Catch:{ all -> 0x00ab }
            if (r1 == 0) goto L_0x00a0
            monitor-exit(r5)
            return
        L_0x00a0:
            boolean r1 = r5.f9104M     // Catch:{ all -> 0x00ab }
            if (r1 == 0) goto L_0x00a6
            monitor-exit(r5)
            return
        L_0x00a6:
            r5.m11180aC()     // Catch:{ all -> 0x00ab }
        L_0x00a9:
            monitor-exit(r5)
            return
        L_0x00ab:
            r1 = move-exception
            com.facetec.sdk.c r2 = com.facetec.sdk.C2867c.SEVERE_ERROR     // Catch:{ all -> 0x00d0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d0 }
            java.lang.String r4 = "Unknown error: "
            r3.<init>(r4)     // Catch:{ all -> 0x00d0 }
            java.lang.String r4 = r1.getMessage()     // Catch:{ all -> 0x00d0 }
            r3.append(r4)     // Catch:{ all -> 0x00d0 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00d0 }
            boolean r4 = com.facetec.sdk.C2780ai.f8828e     // Catch:{ all -> 0x00d0 }
            if (r4 != 0) goto L_0x00c5
            r0 = 1
        L_0x00c5:
            com.facetec.sdk.C3555s.m13907d(r5, r1, r2, r3, r0)     // Catch:{ all -> 0x00d0 }
            com.facetec.sdk.FaceTecSessionStatus r0 = com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR     // Catch:{ all -> 0x00d0 }
            r1 = 0
            r5.mo8946d((com.facetec.sdk.FaceTecSessionStatus) r0, (com.facetec.sdk.FaceTecIDScanStatus) r1)     // Catch:{ all -> 0x00d0 }
        L_0x00ce:
            monitor-exit(r5)
            return
        L_0x00d0:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2831bd.onResume():void");
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        if (mo8912c() == C2829bc.C2830b.GRANTED && !this.f9107P) {
            m11205ag();
            this.f9168s = true;
            if (!C2780ai.f8828e && !this.f9103L && !this.f9101J && !this.f9099H) {
                m11232b(true);
                C2949dl.m12481d();
                C2780ai aiVar = this.f9110S;
                if (aiVar == null || !(aiVar instanceof C2783aj)) {
                    m11196aS();
                }
            }
        }
    }

    public void onWindowFocusChanged(boolean z) {
        this.f9107P = z;
        if (mo8912c() == C2829bc.C2830b.GRANTED) {
            if (!z) {
                if (!mo8911b() && !isFinishing()) {
                    mo8913d();
                }
            } else if (!m11124G()) {
                synchronized (this) {
                    boolean z2 = this.f9103L;
                    if (z2 && !this.f9155f) {
                        m11255e(FaceTecIDScanNextStep.SELECTION_SCREEN);
                    } else if (z2 && this.f9155f && !this.f9140am) {
                        mo8953w();
                    } else if (this.f9101J) {
                        m11180aC();
                    } else if (this.f9160k != null && this.f9145ar) {
                        m11137L();
                    } else if (this.f9104M) {
                        m11221aw();
                    } else if (this.f9105N) {
                        m11218at();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final synchronized void mo8928p() {
        m11232b(false);
        C2867c cVar = C2867c.NON_FATAL_ERROR;
        FaceTecIDScanStatus faceTecIDScanStatus = FaceTecIDScanStatus.LANDSCAPE_MODE_NOT_ALLOWED;
        C3555s.m13898c((Context) this, cVar, faceTecIDScanStatus.toString());
        if (this.f9140am) {
            mo8946d(this.f9169t.getStatus(), faceTecIDScanStatus);
        } else {
            mo8946d(FaceTecSessionStatus.LANDSCAPE_MODE_NOT_ALLOWED, (FaceTecIDScanStatus) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo8929q() {
        m11258e(false);
        this.f9161l.mo9785a(this, C3555s.C3562d.USER_CANCELLED);
        C2867c cVar = C2867c.NON_FATAL_ERROR;
        FaceTecSessionStatus faceTecSessionStatus = FaceTecSessionStatus.USER_CANCELLED;
        C3555s.m13898c((Context) this, cVar, faceTecSessionStatus.toString());
        mo8946d(faceTecSessionStatus, (FaceTecIDScanStatus) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final synchronized void mo8930r() {
        if (this.f9140am) {
            mo8941b(FaceTecIDScanStatus.SUCCESS);
        } else {
            mo8945d(FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo8931s() {
        if (this.f9155f) {
            m11239c(FaceTecIDScanStatus.CAMERA_PERMISSION_DENIED);
        } else {
            mo8945d(FaceTecSessionStatus.CAMERA_PERMISSION_DENIED);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo8953w() {
        m11250d(this.f9167r, true);
        this.f9103L = true;
    }

    /* renamed from: x */
    public void mo8776x() {
        C3555s.m13898c((Context) this, C2867c.ADDITIONAL_REVIEW_BUTTON_PRESSED, (String) null);
        m11199aa();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        return true;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m11124G() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f9094C     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x000f
            boolean r0 = r1.isFinishing()     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x000c
            goto L_0x000f
        L_0x000c:
            monitor-exit(r1)
            r0 = 0
            return r0
        L_0x000f:
            monitor-exit(r1)
            r0 = 1
            return r0
        L_0x0012:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2831bd.m11124G():boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public void m11128I() {
        if (C2750a.m10683b(this)) {
            mo8945d(FaceTecSessionStatus.NON_PRODUCTION_MODE_NETWORK_REQUIRED);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void m11180aC() {
        C2949dl.m12481d();
        if (this.f9101J) {
            if (C2863bw.m11685h(this)) {
                m11256e(FaceTecSessionStatus.LOCKED_OUT);
            }
            C2863bw.m11682e(this);
        }
        if (this.f9173x == null || getFragmentManager().findFragmentByTag("RetryZoom") == null) {
            if (this.f9173x == null) {
                this.f9173x = C2905cn.m12097k();
            }
            if (this.f9101J) {
                getFragmentManager().beginTransaction().add(this.f9128aa, this.f9173x, "RetryZoom").commitAllowingStateLoss();
            } else {
                getFragmentManager().beginTransaction().replace(this.f9128aa, this.f9173x, "RetryZoom").commitAllowingStateLoss();
            }
        } else {
            this.f9173x.mo8873b(this, true);
        }
        this.f9101J = false;
        if (FaceTecSDK.f8630e.f8612o.f8592a == FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
            mo8940b((int) BogInputLayout.INPUT_TYPE_TEXT_PASSWORD, 0);
        }
        m11237c(1000);
    }

    /* renamed from: K */
    private void m11134K() {
        this.f9145ar = false;
        getFragmentManager().beginTransaction().replace(this.f9128aa, this.f9160k, "IDScan").commitAllowingStateLoss();
        this.f9082b.mo9021e(this.f9160k.f9283i);
        this.f9160k.mo8845e(new C3286k5(this), 100);
    }

    /* renamed from: L */
    private void m11137L() {
        if (this.f9171v != null) {
            this.f9171v.mo9040d((Runnable) new C3285k4(this));
        } else {
            m11134K();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void m11218at() {
        this.f9105N = false;
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        this.f9172w = new C2925d();
        beginTransaction.setCustomAnimations(C2747R.animator.facetec_no_delay_fade_in, 0).add(this.f9128aa, this.f9172w, "AdditionalReview").commitAllowingStateLoss();
        m11237c(1000);
        C3555s.m13902c(C2913cs.RESULT_ADDITIONAL_REVIEW);
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m11221aw() {
        this.f9104M = false;
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        this.f9170u = C2879cb.m11722e(this.f9141an);
        beginTransaction.setCustomAnimations(C2747R.animator.facetec_no_delay_fade_in, 0).add(this.f9128aa, this.f9170u, "OCRConfirmation").commitAllowingStateLoss();
        m11237c(1000);
        C3555s.m13902c(C2913cs.RESULT_OCR);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m11196aS() {
        C2780ai aiVar;
        synchronized (this.f9119aB) {
            aiVar = this.f9110S;
            this.f9110S = null;
        }
        if (aiVar != null) {
            aiVar.mo8811a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0097, code lost:
        r0 = r5.f9160k;
     */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m11149P() {
        /*
            r5 = this;
            com.facetec.sdk.cm r0 = r5.f9171v
            java.lang.String r1 = "Results"
            r2 = 0
            if (r0 == 0) goto L_0x0019
            android.app.FragmentManager r0 = r5.getFragmentManager()
            android.app.Fragment r0 = r0.findFragmentByTag(r1)
            if (r0 == 0) goto L_0x0019
            boolean r0 = r5.f9116Y
            if (r0 != 0) goto L_0x0019
            boolean r0 = r5.f9109R
            if (r0 == 0) goto L_0x0029
        L_0x0019:
            com.facetec.sdk.cb r0 = r5.f9170u
            if (r0 == 0) goto L_0x002a
            android.app.FragmentManager r0 = r5.getFragmentManager()
            java.lang.String r3 = "OCRConfirmation"
            android.app.Fragment r0 = r0.findFragmentByTag(r3)
            if (r0 == 0) goto L_0x002a
        L_0x0029:
            return r2
        L_0x002a:
            android.widget.ImageView r0 = r5.f9164o
            if (r0 == 0) goto L_0x0039
            com.facetec.sdk.FaceTecCustomization r3 = com.facetec.sdk.FaceTecSDK.f8630e
            com.facetec.sdk.FaceTecCancelButtonCustomization r3 = r3.f8612o
            com.facetec.sdk.FaceTecCancelButtonCustomization$ButtonLocation r3 = r3.f8592a
            com.facetec.sdk.FaceTecCancelButtonCustomization$ButtonLocation r4 = com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM
            if (r3 != r4) goto L_0x0039
            goto L_0x009f
        L_0x0039:
            com.facetec.sdk.cn r0 = r5.f9173x
            if (r0 == 0) goto L_0x004e
            android.app.FragmentManager r0 = r5.getFragmentManager()
            java.lang.String r3 = "RetryZoom"
            android.app.Fragment r0 = r0.findFragmentByTag(r3)
            if (r0 == 0) goto L_0x004e
            com.facetec.sdk.cn r0 = r5.f9173x
            android.widget.ImageView r0 = r0.f9033b
            goto L_0x009f
        L_0x004e:
            com.facetec.sdk.bq r0 = r5.f9156g
            if (r0 == 0) goto L_0x0063
            android.app.FragmentManager r0 = r5.getFragmentManager()
            java.lang.String r3 = "PreEnroll"
            android.app.Fragment r0 = r0.findFragmentByTag(r3)
            if (r0 == 0) goto L_0x0063
            com.facetec.sdk.bq r0 = r5.f9156g
            android.widget.ImageView r0 = r0.f9033b
            goto L_0x009f
        L_0x0063:
            com.facetec.sdk.cm r0 = r5.f9171v
            if (r0 == 0) goto L_0x007e
            android.app.FragmentManager r0 = r5.getFragmentManager()
            android.app.Fragment r0 = r0.findFragmentByTag(r1)
            if (r0 == 0) goto L_0x007e
            boolean r0 = r5.f9116Y
            if (r0 != 0) goto L_0x0079
            boolean r0 = r5.f9109R
            if (r0 == 0) goto L_0x007e
        L_0x0079:
            com.facetec.sdk.cm r0 = r5.f9171v
            android.widget.ImageView r0 = r0.f9641j
            goto L_0x009f
        L_0x007e:
            com.facetec.sdk.at r0 = r5.f9154e
            if (r0 == 0) goto L_0x0093
            android.app.FragmentManager r0 = r5.getFragmentManager()
            java.lang.String r1 = "Zoom"
            android.app.Fragment r0 = r0.findFragmentByTag(r1)
            if (r0 == 0) goto L_0x0093
            com.facetec.sdk.at r0 = r5.f9154e
            android.widget.ImageView r0 = r0.f8971c
            goto L_0x009f
        L_0x0093:
            boolean r0 = r5.f9140am
            if (r0 == 0) goto L_0x009e
            com.facetec.sdk.bl r0 = r5.f9160k
            if (r0 == 0) goto L_0x009e
            android.widget.ImageView r0 = r0.f9277c
            goto L_0x009f
        L_0x009e:
            r0 = 0
        L_0x009f:
            if (r0 != 0) goto L_0x00b9
            com.facetec.sdk.c r0 = com.facetec.sdk.C2867c.DEFINITELY_BUG_IF_SEEN
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected Scenario: isCancelButtonVisibleAndEnabled -> cancelButton == null "
            r1.<init>(r3)
            java.lang.String r3 = com.facetec.sdk.C3555s.m13884a((android.app.Activity) r5)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.facetec.sdk.C3555s.m13898c((android.content.Context) r5, (com.facetec.sdk.C2867c) r0, (java.lang.String) r1)
            return r2
        L_0x00b9:
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L_0x00d0
            float r1 = r0.getAlpha()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x00d0
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x00d0
            r0 = 1
            return r0
        L_0x00d0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2831bd.m11149P():boolean");
    }

    /* renamed from: Q */
    private void m11150Q() {
        if (this.f9124aG == null) {
            this.f9124aG = Integer.valueOf(C2938dc.m12408e((Context) this, FaceTecSDK.f8630e.f8607j.backgroundColor));
        }
        if (this.f9122aE == null) {
            this.f9122aE = Integer.valueOf(C2938dc.m12408e((Context) this, FaceTecSDK.f8630e.f8606i.backgroundColors));
        }
        if (this.f9123aF == null) {
            this.f9123aF = Integer.valueOf(C2938dc.m12408e((Context) this, FaceTecSDK.f8630e.f8611n.borderColor));
        }
        runOnUiThread(new C3453n4(this));
    }

    /* renamed from: R */
    private float m11152R() {
        return ((float) Settings.System.getInt(getContentResolver(), "screen_brightness")) / 255.0f;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:8|9|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return m11152R();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0027 */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private float m11154S() {
        /*
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            float r0 = r0.screenBrightness
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0033
            android.content.ContentResolver r0 = r2.getContentResolver()     // Catch:{ SettingNotFoundException -> 0x0031 }
            java.lang.String r1 = "screen_brightness_mode"
            int r0 = android.provider.Settings.System.getInt(r0, r1)     // Catch:{ SettingNotFoundException -> 0x0031 }
            r1 = 1
            if (r0 != r1) goto L_0x002c
            android.content.ContentResolver r0 = r2.getContentResolver()     // Catch:{ SettingNotFoundException -> 0x0027 }
            java.lang.String r1 = "screen_auto_brightness_adj"
            float r0 = android.provider.Settings.System.getFloat(r0, r1)     // Catch:{ SettingNotFoundException -> 0x0027 }
            goto L_0x0033
        L_0x0027:
            float r0 = r2.m11152R()     // Catch:{ SettingNotFoundException -> 0x0031 }
            goto L_0x0033
        L_0x002c:
            float r0 = r2.m11152R()     // Catch:{ SettingNotFoundException -> 0x0031 }
            goto L_0x0033
        L_0x0031:
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2831bd.m11154S():float");
    }

    /* renamed from: T */
    private synchronized void m11156T() {
        this.f9154e = C2799at.m10896e();
        if (this.f9110S == null) {
            C2780ai a = C2780ai.m10759a((ViewGroup) this.f9135ah, (Activity) this, false);
            this.f9110S = a;
            this.f9112U = a instanceof C2773ag;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:14|15|16|17|(1:19)|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0045 */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m11158U() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.facetec.sdk.bc$b r0 = r5.mo8912c()     // Catch:{ all -> 0x006d }
            com.facetec.sdk.C2885cd.m11822b()     // Catch:{ all -> 0x006d }
            float r1 = r5.m11154S()     // Catch:{ all -> 0x006d }
            r5.f9120aC = r1     // Catch:{ all -> 0x006d }
            r2 = 1060320052(0x3f333334, float:0.70000005)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 <= 0) goto L_0x001f
            r5.f9121aD = r4     // Catch:{ all -> 0x006d }
            r2 = 1058642330(0x3f19999a, float:0.6)
            r5.m11226b((float) r1, (float) r2, (int) r3)     // Catch:{ all -> 0x006d }
        L_0x001f:
            com.facetec.sdk.bc$b r1 = com.facetec.sdk.C2829bc.C2830b.GRANTED     // Catch:{ all -> 0x006d }
            if (r0 != r1) goto L_0x004a
            boolean r1 = r5.f9155f     // Catch:{ all -> 0x006d }
            if (r1 != 0) goto L_0x004a
            com.facetec.sdk.ai r1 = r5.f9110S     // Catch:{ all -> 0x006d }
            if (r1 != 0) goto L_0x0030
            r5.m11170a((int) r4)     // Catch:{ all -> 0x006d }
            monitor-exit(r5)
            return
        L_0x0030:
            r5.f9126aJ = r4     // Catch:{ all -> 0x006d }
            boolean r1 = r5.f9112U     // Catch:{ Exception -> 0x0045 }
            if (r1 == 0) goto L_0x0045
            android.widget.RelativeLayout r1 = r5.f9135ah     // Catch:{ Exception -> 0x0045 }
            r1.setVisibility(r3)     // Catch:{ Exception -> 0x0045 }
            com.facetec.sdk.ai r1 = r5.f9110S     // Catch:{ Exception -> 0x0045 }
            com.facetec.sdk.q4 r2 = new com.facetec.sdk.q4     // Catch:{ Exception -> 0x0045 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0045 }
            r1.mo8831e((java.lang.Runnable) r2)     // Catch:{ Exception -> 0x0045 }
        L_0x0045:
            com.facetec.sdk.ai r1 = r5.f9110S     // Catch:{ all -> 0x006d }
            r1.mo8817e()     // Catch:{ all -> 0x006d }
        L_0x004a:
            com.facetec.sdk.C3555s.f11476b = r4     // Catch:{ all -> 0x006d }
            com.facetec.sdk.C3555s.f11478d = r3     // Catch:{ all -> 0x006d }
            boolean r1 = r5.f9155f     // Catch:{ all -> 0x006d }
            com.facetec.sdk.bq r0 = com.facetec.sdk.C2855bq.m11578b(r0, r1)     // Catch:{ all -> 0x006d }
            r5.f9156g = r0     // Catch:{ all -> 0x006d }
            android.app.FragmentManager r0 = r5.getFragmentManager()     // Catch:{ all -> 0x006d }
            android.app.FragmentTransaction r0 = r0.beginTransaction()     // Catch:{ all -> 0x006d }
            int r1 = r5.f9128aa     // Catch:{ all -> 0x006d }
            com.facetec.sdk.bq r2 = r5.f9156g     // Catch:{ all -> 0x006d }
            java.lang.String r3 = "PreEnroll"
            android.app.FragmentTransaction r0 = r0.replace(r1, r2, r3)     // Catch:{ all -> 0x006d }
            r0.commitAllowingStateLoss()     // Catch:{ all -> 0x006d }
            monitor-exit(r5)
            return
        L_0x006d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2831bd.m11158U():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public void m11222ax() {
        if (this.f9126aJ) {
            this.f9126aJ = false;
            runOnUiThread(new C3185h5(this));
        }
    }

    /* renamed from: W */
    private synchronized void m11162W() {
        if (!m11124G()) {
            if (this.f9110S == null) {
                m11170a(2);
                return;
            }
            ImageView imageView = this.f9164o;
            if (imageView != null) {
                imageView.setEnabled(false);
                new Handler(Looper.getMainLooper()).postDelayed(new C3716z4(this), 800);
            }
            this.f9110S.mo8817e();
            if (FaceTecSDK.f8628c == FaceTecSDK.C2744a.LOW_LIGHT && !this.f9151ax) {
                this.f9151ax = true;
                this.f9121aD = false;
                this.f9125aH = false;
                m11226b(0.8f, 1.0f, 0);
            }
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            if (this.f9156g == null) {
                if (this.f9173x == null) {
                    beginTransaction.setCustomAnimations(C2747R.animator.facetec_no_delay_fade_in, 0).replace(this.f9128aa, this.f9154e, "Zoom").commitAllowingStateLoss();
                    C2949dl.m12471a((Context) this);
                }
            }
            beginTransaction.replace(this.f9128aa, this.f9154e, "Zoom").commitAllowingStateLoss();
            this.f9156g = null;
            this.f9173x = null;
            C2949dl.m12471a((Context) this);
        }
    }

    /* renamed from: X */
    private synchronized void m11164X() {
        if (FaceTecSessionActivity.f8641e != null) {
            m11156T();
            return;
        }
        boolean z = this.f9155f;
        if (z) {
            this.f9160k = C2848bl.m11477c(false, z);
            return;
        }
        C3555s.m13898c((Context) this, C2867c.UNEXPECTED_EARLY_EXIT_FACESCAN, "Error when setting up primary fragment");
        mo8946d(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, FaceTecIDScanStatus.UNSUCCESS);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m11213ao() {
        if (!isFinishing()) {
            getFragmentManager().beginTransaction().remove(this.f9171v).commitAllowingStateLoss();
            this.f9171v = null;
        }
    }

    /* renamed from: Z */
    private void m11168Z() {
        Timer timer = this.f9148au;
        if (timer != null) {
            timer.cancel();
            this.f9148au = null;
        }
        TimerTask timerTask = this.f9150aw;
        if (timerTask != null) {
            timerTask.cancel();
            this.f9150aw = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo8932A() {
        C3555s.m13898c((Context) this, C2867c.DEVELOPER_USED_ID_SCAN_CALLBACK, "cancel");
        mo8941b(this.f9143ap.getStatus());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo8933B() {
        m11232b(false);
        Handler handler = this.f9081a;
        if (handler != null) {
            handler.removeCallbacks((Runnable) null);
        }
        if (this.f9098G) {
            this.f9161l.mo9785a(this, C3555s.C3562d.USER_CANCELLED);
            C2920cv.m12196e(new C3407m4(this));
            return;
        }
        mo8946d(FaceTecSessionStatus.USER_CANCELLED_VIA_CLICKABLE_READY_SCREEN_SUBTEXT, (FaceTecIDScanStatus) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo8934C() {
        C3555s.m13898c((Context) this, C2867c.DEVELOPER_USED_FACESCAN_CALLBACK, "retry");
        this.f9094C = false;
        this.f9100I = false;
        this.f9099H = false;
        C2888cg cgVar = this.f9082b;
        if (cgVar != null) {
            cgVar.mo9018d(true);
            this.f9082b.mo9015c(false);
        }
        this.f9101J = true;
        runOnUiThread(new C3206i4(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final void mo8935D() {
        this.f9151ax = false;
        this.f9118aA = false;
        ValueAnimator valueAnimator = this.f9153az;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f9153az.removeAllUpdateListeners();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo8936E() {
        m11205ag();
        this.f9113V.mo8983b();
        this.f9106O = true;
        this.f9146as = true;
        this.f9171v.mo8845e(new C3566s3(this, C2938dc.m12397d(C2857bs.SKIPPED, this.f9130ac)), 800);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final void mo8937F() {
        this.f9116Y = false;
        m11205ag();
        m11243c(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final void mo8938H() {
        m11168Z();
        this.f9150aw = new C2936da(new C3207i5(this));
        Timer timer = new Timer();
        this.f9148au = timer;
        timer.scheduleAtFixedRate(this.f9150aw, 250, 500);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final synchronized void mo8920i() {
        this.f9161l.mo9785a(this, C3555s.C3562d.USER_FAILED);
        this.f9175z = null;
        this.f9092A = null;
        this.f9093B = null;
        try {
            m11258e(true);
            this.f9082b.mo9026j();
            this.f9082b.mo9015c(true);
            this.f9173x = C2905cn.m12097k();
            this.f9154e.mo8845e(new C3452n3(this), 400);
        } catch (Throwable th) {
            C2867c cVar = C2867c.SEVERE_ERROR;
            StringBuilder sb = new StringBuilder();
            FaceTecSessionStatus faceTecSessionStatus = FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR;
            sb.append(faceTecSessionStatus);
            sb.append(": ");
            sb.append(th.getMessage());
            C3555s.m13907d(this, th, cVar, sb.toString(), true);
            m11256e(faceTecSessionStatus);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo8921j() {
        C2949dl.m12481d();
        this.f9161l.mo9785a(this, C3555s.C3562d.SESSION_TIMEOUT);
        this.f9175z = null;
        this.f9092A = null;
        this.f9093B = null;
        try {
            m11258e(false);
            this.f9082b.mo9026j();
            this.f9082b.mo9015c(true);
            m11228b((int) TextTypeView.SEPARATOR_FULL);
        } catch (Throwable th) {
            C2867c cVar = C2867c.SEVERE_ERROR;
            StringBuilder sb = new StringBuilder();
            FaceTecSessionStatus faceTecSessionStatus = FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR;
            sb.append(faceTecSessionStatus);
            sb.append(": ");
            sb.append(th.getMessage());
            C3555s.m13907d(this, th, cVar, sb.toString(), true);
            m11256e(faceTecSessionStatus);
        }
    }

    /* renamed from: t */
    public synchronized void mo8775t() {
        this.f9160k.mo8969c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo8951u() {
        FaceTecSDK.C2744a aVar = FaceTecSDK.f8628c;
        FaceTecSDK.C2744a aVar2 = FaceTecSDK.C2744a.BRIGHT_LIGHT;
        if (aVar != aVar2) {
            FaceTecSDK.f8628c = aVar2;
            C2885cd.m11762A();
            runOnUiThread(new C3336l5(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo8952v() {
        C2848bl blVar;
        C2848bl blVar2;
        if (!isFinishing() && (blVar = this.f9160k) != null) {
            if (blVar.f9284j == C2848bl.C2850d.FRONT) {
                this.f9149av = C2900cm.C2903b.FRONT_SIDE;
            } else {
                this.f9149av = C2900cm.C2903b.BACK_SIDE;
            }
            if (!isFinishing() && (blVar2 = this.f9160k) != null) {
                this.f9082b.mo9017d(blVar2.f9283i);
                getFragmentManager().beginTransaction().remove(this.f9160k).commitAllowingStateLoss();
                this.f9160k = null;
            }
            this.f9171v = C2900cm.m12011d(true, this.f9149av);
            getFragmentManager().beginTransaction().add(this.f9128aa, this.f9171v, "Results").commitAllowingStateLoss();
            if (FaceTecSDK.f8630e.f8612o.f8592a == FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
                m11202ad();
            }
            m11231b((C2834d) new C2759a5(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo8954y() {
        FaceTecSDK.C2744a aVar = FaceTecSDK.f8628c;
        FaceTecSDK.C2744a aVar2 = FaceTecSDK.C2744a.LOW_LIGHT;
        if (aVar != aVar2) {
            FaceTecSDK.f8628c = aVar2;
            C2885cd.m11771G("fnkey_ZOOMSDK_LIGHTINGMODE", 0);
            C2885cd.m11762A();
            runOnUiThread(new C3539r4(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo8955z() {
        if (!this.f9108Q) {
            this.f9108Q = true;
            new Handler(Looper.getMainLooper()).postDelayed(new C3673x3(this), (long) (this.f9155f ? 50 : TextTypeView.SEPARATOR_FULL));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m11171a(ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        this.f9122aE = num;
        this.f9133af.setBackgroundColor(num.intValue());
        this.f9133af.invalidate();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ boolean m11235b(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f9164o.setAlpha(0.4f);
        } else if (motionEvent.getAction() == 3 || motionEvent.getX() < Utils.FLOAT_EPSILON || motionEvent.getX() > ((float) (this.f9164o.getWidth() + this.f9164o.getLeft() + 10)) || motionEvent.getY() < Utils.FLOAT_EPSILON || motionEvent.getY() > ((float) (this.f9164o.getHeight() + this.f9164o.getTop() + 10))) {
            this.f9164o.setAlpha(1.0f);
        } else if (motionEvent.getAction() == 1) {
            this.f9164o.performClick();
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m11253e(ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        this.f9124aG = num;
        this.f9174y.setBackgroundColor(num.intValue());
        this.f9174y.invalidate();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m11172a(C2905cn cnVar) {
        if (!isFinishing()) {
            getFragmentManager().beginTransaction().replace(this.f9128aa, cnVar, "RetryZoom").commitAllowingStateLoss();
            this.f9173x = cnVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized void mo8918g() {
        C2885cd.m11838g();
        if (FaceTecSessionActivity.f8641e != null) {
            this.f9171v = C2900cm.m12011d(false, this.f9149av);
            if (FaceTecSDK.f8630e.f8612o.f8592a == FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
                m11202ad();
            }
            this.f9154e.mo8845e(new C3476o4(this), 400);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo8915e() {
        C2795aq.m10869d(this);
        this.f9161l.mo9785a(this, C3555s.C3562d.USER_WAS_SUCCESSFUL);
        this.f9175z = null;
        this.f9092A = null;
        this.f9093B = null;
        try {
            C2863bw.m11679d((Context) this);
            this.f9094C = true;
            this.f9100I = true;
            if (FaceTecSDK.f8630e.vocalGuidanceCustomization.mode == FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE) {
                C2949dl.m12483d(this, C2949dl.C2951d.UPLOADING);
            }
            m11200ab();
        } catch (Throwable th) {
            C2867c cVar = C2867c.SEVERE_ERROR;
            StringBuilder sb = new StringBuilder();
            FaceTecSessionStatus faceTecSessionStatus = FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR;
            sb.append(faceTecSessionStatus);
            sb.append(": ");
            sb.append(th.getMessage());
            C3555s.m13907d(this, th, cVar, sb.toString(), true);
            m11256e(faceTecSessionStatus);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m11247d(ValueAnimator valueAnimator) {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.screenBrightness = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        getWindow().setAttributes(attributes);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8939a(FaceTecIDScanNextStep faceTecIDScanNextStep) {
        C3555s.m13898c((Context) this, C2867c.DEVELOPER_USED_FACESCAN_CALLBACK, "succeed");
        if (FaceTecSDK.f8630e.vocalGuidanceCustomization.mode == FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE) {
            C2949dl.m12483d(this, C2949dl.C2951d.SUCCESS);
        } else if (!C2949dl.f9968b) {
            SharedPreferences.Editor edit = C2949dl.f9969c.edit();
            edit.putBoolean("facetecMoveCloserSoundHasBeenPlayed", true);
            edit.apply();
        }
        if (FaceTecSessionActivity.f8642g != null) {
            this.f9103L = true;
        }
        runOnUiThread(new C2930d4(this, faceTecIDScanNextStep));
    }

    /* renamed from: b */
    private void m11226b(float f, float f2, int i) {
        int i2 = this.f9125aH ? 750 : 1500;
        ValueAnimator valueAnimator = this.f9153az;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f9153az.removeAllUpdateListeners();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        this.f9153az = ofFloat;
        ofFloat.setDuration((long) i2);
        this.f9153az.addUpdateListener(new C3587t3(this));
        this.f9153az.setInterpolator(new LinearInterpolator());
        this.f9153az.setStartDelay((long) i);
        this.f9153az.addListener(new C3608u3(this, f2, f));
        this.f9153az.start();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000d, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo8913d() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f9140am     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x000e
            com.facetec.sdk.bl r0 = r2.f9160k     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x000c
            r0.mo8974g()     // Catch:{ all -> 0x005e }
        L_0x000c:
            monitor-exit(r2)
            return
        L_0x000e:
            boolean r1 = r2.f9095D     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0014
            monitor-exit(r2)
            return
        L_0x0014:
            r1 = 1
            r2.f9095D = r1     // Catch:{ all -> 0x005e }
            boolean r1 = r2.f9094C     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x001d
            monitor-exit(r2)
            return
        L_0x001d:
            if (r0 != 0) goto L_0x0051
            boolean r0 = r2.f9155f     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0024
            goto L_0x0051
        L_0x0024:
            com.facetec.sdk.bc$b r0 = r2.mo8912c()     // Catch:{ all -> 0x005e }
            com.facetec.sdk.bc$b r1 = com.facetec.sdk.C2829bc.C2830b.GRANTED     // Catch:{ all -> 0x005e }
            if (r0 == r1) goto L_0x0033
            com.facetec.sdk.FaceTecSessionStatus r0 = com.facetec.sdk.FaceTecSessionStatus.CONTEXT_SWITCH     // Catch:{ all -> 0x005e }
            r1 = 0
            r2.mo8946d((com.facetec.sdk.FaceTecSessionStatus) r0, (com.facetec.sdk.FaceTecIDScanStatus) r1)     // Catch:{ all -> 0x005e }
            goto L_0x0044
        L_0x0033:
            boolean r0 = r2.m11124G()     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x0044
            com.facetec.sdk.m r0 = r2.f9161l     // Catch:{ all -> 0x005e }
            com.facetec.sdk.s$d r1 = com.facetec.sdk.C3555s.C3562d.SESSION_CONTEXT_SWITCH     // Catch:{ all -> 0x005e }
            r0.mo9785a(r2, r1)     // Catch:{ all -> 0x005e }
            r0 = 0
            r2.m11258e((boolean) r0)     // Catch:{ all -> 0x005e }
        L_0x0044:
            com.facetec.sdk.c r0 = com.facetec.sdk.C2867c.NON_FATAL_ERROR     // Catch:{ all -> 0x005e }
            com.facetec.sdk.FaceTecSessionStatus r1 = com.facetec.sdk.FaceTecSessionStatus.CONTEXT_SWITCH     // Catch:{ all -> 0x005e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x005e }
            com.facetec.sdk.C3555s.m13898c((android.content.Context) r2, (com.facetec.sdk.C2867c) r0, (java.lang.String) r1)     // Catch:{ all -> 0x005e }
            monitor-exit(r2)
            return
        L_0x0051:
            com.facetec.sdk.c r0 = com.facetec.sdk.C2867c.NON_FATAL_ERROR     // Catch:{ all -> 0x005e }
            com.facetec.sdk.FaceTecIDScanStatus r1 = com.facetec.sdk.FaceTecIDScanStatus.CONTEXT_SWITCH     // Catch:{ all -> 0x005e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x005e }
            com.facetec.sdk.C3555s.m13898c((android.content.Context) r2, (com.facetec.sdk.C2867c) r0, (java.lang.String) r1)     // Catch:{ all -> 0x005e }
            monitor-exit(r2)
            return
        L_0x005e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2831bd.mo8913d():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m11263g(boolean z) {
        if (C2840bg.m11363c()) {
            this.f9175z = C2885cd.m11860u();
            this.f9092A = C2885cd.m11865y();
            if (this.f9092A.length > 0) {
                this.f9165p = BitmapFactory.decodeByteArray(this.f9092A[0], 0, this.f9092A[0].length);
            }
        }
        if (z) {
            try {
                FaceTecSessionResult faceTecSessionResult = new FaceTecSessionResult(FaceTecSessionStatus.SESSION_UNSUCCESSFUL, this.f9175z, this.f9092A, C2885cd.m11855r());
                faceTecSessionResult.mo8777b(C2888cg.f9550b);
                this.f9161l.mo9787c((Context) this, faceTecSessionResult, C2840bg.f9201b);
            } catch (Exception unused) {
            }
        }
        this.f9161l.mo9786b();
        if (this.f9154e != null) {
            this.f9154e.mo8854h();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m11268i(String str) {
        if (this.f9171v != null) {
            this.f9171v.mo9041e(str);
        }
    }

    /* renamed from: a */
    private void m11173a(Runnable runnable) {
        C3555s.m13898c((Context) this, C2867c.DEVELOPER_USED_ID_SCAN_CALLBACK, "succeed");
        runOnUiThread(new C3631v3(this, runnable));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m11174a(String str) {
        this.f9171v.mo9039c(false, true, str, (Runnable) new C3229j5(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m11227b(float f, float f2, Animator animator) {
        if (this.f9121aD || this.f9125aH) {
            this.f9121aD = false;
            this.f9125aH = false;
        } else if (this.f9151ax && C2885cd.m11836f() == C2884cc.ZOOM_CLOSE && !this.f9118aA && f == 0.8f) {
            this.f9118aA = true;
            m11226b(0.5f, 0.8f, 1000);
        } else if (this.f9151ax) {
            m11226b(f, f2, 1000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m11175a(boolean z) {
        this.f9171v.mo9034a((Runnable) new C3568s5(this, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ byte[] m11176a(boolean z, String str) {
        return C2885cd.m11857s(str, this.f9163n, z, false);
    }

    /* renamed from: e */
    private synchronized void m11256e(FaceTecSessionStatus faceTecSessionStatus) {
        mo8946d(faceTecSessionStatus, (FaceTecIDScanStatus) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m11265h(boolean z) {
        getFragmentManager().beginTransaction().remove(this.f9171v).commitAllowingStateLoss();
        this.f9171v = null;
        C2900cm.C2903b bVar = C2900cm.C2903b.NFC;
        this.f9149av = bVar;
        this.f9171v = C2900cm.m12011d(true, bVar);
        getFragmentManager().beginTransaction().add(this.f9128aa, this.f9171v, "Results").commitAllowingStateLoss();
        m11231b((C2834d) new C3335l4(this, z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo8916e(int i) {
        C2867c cVar = C2867c.SEVERE_ERROR;
        StringBuilder sb = new StringBuilder();
        FaceTecSessionStatus faceTecSessionStatus = FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR;
        sb.append(faceTecSessionStatus);
        sb.append(": ");
        sb.append(i);
        C3555s.m13907d(this, (Throwable) null, cVar, sb.toString(), !C2780ai.f8828e);
        mo8946d(faceTecSessionStatus, (FaceTecIDScanStatus) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m11254e(View view) {
        if (view != null) {
            view.setVisibility(4);
        }
        this.f9132ae.setVisibility(4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo8941b(FaceTecIDScanStatus faceTecIDScanStatus) {
        m11240c(FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY, faceTecIDScanStatus);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo8948e(String str) {
        runOnUiThread(new C3632v4(this, str));
    }

    /* renamed from: b */
    private void m11228b(int i) {
        if (!isFinishing()) {
            this.f9081a.postDelayed(new C2990e4(this, C2905cn.m12097k()), (long) i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo8945d(FaceTecSessionStatus faceTecSessionStatus) {
        m11240c(faceTecSessionStatus, (FaceTecIDScanStatus) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo8947e(float f) {
        runOnUiThread(new C3334l3(this, f));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo8946d(FaceTecSessionStatus faceTecSessionStatus, FaceTecIDScanStatus faceTecIDScanStatus) {
        this.f9100I = false;
        C2888cg cgVar = this.f9082b;
        if (cgVar != null) {
            cgVar.mo9010b();
        }
        if (m11124G() && faceTecIDScanStatus != FaceTecIDScanStatus.SKIPPED) {
            this.f9099H = false;
        } else if (this.f9140am) {
            mo8941b(faceTecIDScanStatus);
        } else {
            this.f9094C = true;
            this.f9100I = false;
            if (faceTecIDScanStatus == FaceTecIDScanStatus.SKIPPED) {
                m11240c(faceTecSessionStatus, faceTecIDScanStatus);
            } else {
                mo8945d(faceTecSessionStatus);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo8949e(String str, FaceTecIDScanNextStep faceTecIDScanNextStep) {
        try {
            if (new JSONObject(C2885cd.m11792Y(str, false)).optBoolean("success", false)) {
                mo8939a(faceTecIDScanNextStep);
                return true;
            }
            mo8934C();
            return false;
        } catch (JSONException unused) {
            mo8934C();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo8910b(String str) {
        if (this.f9140am) {
            C3555s.m13898c((Context) this, C2867c.UNEXPECTED_EARLY_EXIT_IDSCAN, "IDScan Camera Error: ".concat(String.valueOf(str)));
            mo8941b(FaceTecIDScanStatus.CAMERA_ERROR);
            return;
        }
        C3555s.m13898c((Context) this, C2867c.UNEXPECTED_EARLY_EXIT_FACESCAN, "FaceScan Camera Error: ".concat(String.valueOf(str)));
        mo8946d(FaceTecSessionStatus.CAMERA_INITIALIZATION_ISSUE, (FaceTecIDScanStatus) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m11257e(Runnable runnable) {
        if (!isFinishing() && hasWindowFocus() && runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: b */
    private void m11232b(boolean z) {
        boolean z2;
        synchronized (this) {
            C2888cg cgVar = this.f9082b;
            if (cgVar != null) {
                cgVar.mo9028l();
                if (z) {
                    C2888cg.m11919e();
                    this.f9082b = null;
                } else {
                    z2 = true;
                }
            }
            z2 = false;
        }
        if (z2) {
            Thread thread = new Thread(new C3519q5(this));
            thread.setPriority(10);
            thread.start();
        }
    }

    @ObfuscateCodeMedium
    /* renamed from: e */
    private void m11258e(boolean z) {
        int i = f9090aI;
        int i2 = (i ^ 39) + ((i & 39) << 1);
        f9091aK = i2 % 128;
        if (!(i2 % 2 != 0)) {
            int i3 = 70 / 0;
            if (this.f9102K) {
                return;
            }
        } else if (this.f9102K) {
            return;
        }
        this.f9102K = true;
        C2949dl.m12481d();
        C2920cv.m12195c(new C2821b4(this, z)).mo9078d(new C2872c4(this));
        int i4 = f9091aK;
        int i5 = (i4 ^ 21) + ((i4 & 21) << 1);
        f9090aI = i5 % 128;
        if ((i5 % 2 != 0 ? 5 : 'R') == 5) {
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m11259e(boolean z, String str) {
        this.f9171v.mo9039c(z, z, str, (Runnable) new C3228j4(this, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m11249d(FaceTecIDScanNextStep faceTecIDScanNextStep) {
        if (this.f9171v != null) {
            this.f9171v.mo9035b(true, FaceTecCustomization.overrideResultScreenSuccessMessage, new C3475o3(this, faceTecIDScanNextStep));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0035, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m11238c(com.facetec.sdk.FaceTecIDScanNextStep r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.facetec.sdk.FaceTecIDScanProcessor r0 = com.facetec.sdk.FaceTecSessionActivity.f8642g     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0010
            com.facetec.sdk.FaceTecSessionResult r2 = r1.f9169t     // Catch:{ all -> 0x0036 }
            com.facetec.sdk.FaceTecSessionStatus r2 = r2.getStatus()     // Catch:{ all -> 0x0036 }
            r1.mo8945d((com.facetec.sdk.FaceTecSessionStatus) r2)     // Catch:{ all -> 0x0036 }
            monitor-exit(r1)
            return
        L_0x0010:
            com.facetec.sdk.FaceTecIDScanNextStep r0 = com.facetec.sdk.FaceTecIDScanNextStep.SKIP     // Catch:{ all -> 0x0036 }
            if (r2 != r0) goto L_0x0021
            com.facetec.sdk.FaceTecSessionResult r2 = r1.f9169t     // Catch:{ all -> 0x0036 }
            com.facetec.sdk.FaceTecSessionStatus r2 = r2.getStatus()     // Catch:{ all -> 0x0036 }
            com.facetec.sdk.FaceTecIDScanStatus r0 = com.facetec.sdk.FaceTecIDScanStatus.SKIPPED     // Catch:{ all -> 0x0036 }
            r1.mo8946d((com.facetec.sdk.FaceTecSessionStatus) r2, (com.facetec.sdk.FaceTecIDScanStatus) r0)     // Catch:{ all -> 0x0036 }
            monitor-exit(r1)
            return
        L_0x0021:
            r0 = 0
            r1.f9094C = r0     // Catch:{ all -> 0x0036 }
            com.facetec.sdk.cg r0 = r1.f9082b     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0034
            boolean r0 = r1.hasWindowFocus()     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x002f
            goto L_0x0034
        L_0x002f:
            r1.m11255e((com.facetec.sdk.FaceTecIDScanNextStep) r2)     // Catch:{ all -> 0x0036 }
            monitor-exit(r1)
            return
        L_0x0034:
            monitor-exit(r1)
            return
        L_0x0036:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2831bd.m11238c(com.facetec.sdk.FaceTecIDScanNextStep):void");
    }

    /* renamed from: d */
    private void m11250d(FaceTecIDScanNextStep faceTecIDScanNextStep, boolean z) {
        C2888cg cgVar = this.f9082b;
        if (cgVar != null) {
            cgVar.mo9013c();
            m11201ac();
            if (this.f9154e != null) {
                if (getFragmentManager().findFragmentByTag("Zoom") != null) {
                    getFragmentManager().beginTransaction().remove(this.f9154e).commitAllowingStateLoss();
                }
                this.f9154e = null;
            }
            if (this.f9160k == null) {
                this.f9160k = C2848bl.m11477c(false, this.f9155f);
            }
            if (!this.f9155f) {
                this.f9169t = new FaceTecSessionResult(this.f9169t.getStatus(), this.f9175z, this.f9092A, this.f9093B);
                if (this.f9166q == C2835e.FACESCAN_SESSION_STARTED) {
                    this.f9082b.mo9018d(true);
                }
            }
            this.f9167r = faceTecIDScanNextStep;
            this.f9160k.mo8973e(z);
            this.f9160k.mo8970c(this.f9159j);
            m11206ah();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m11225b(float f) {
        if (this.f9171v != null) {
            this.f9171v.mo9037c(f);
        }
    }

    /* renamed from: b */
    private void m11233b(boolean z, C2851bm bmVar, String str) {
        C3555s.m13898c((Context) this, C2867c.DEVELOPER_USED_ID_SCAN_CALLBACK, "retry");
        this.f9145ar = true;
        this.f9096E = false;
        C2848bl blVar = this.f9160k;
        blVar.f9280f = !z;
        blVar.f9282h = bmVar;
        runOnUiThread(new C3540r5(this, z, str));
    }

    /* renamed from: c */
    private synchronized void m11239c(FaceTecIDScanStatus faceTecIDScanStatus) {
        this.f9094C = true;
        this.f9100I = false;
        C2888cg cgVar = this.f9082b;
        if (cgVar != null) {
            cgVar.mo9010b();
        }
        mo8941b(faceTecIDScanStatus);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ byte[] m11251d(String str) {
        return C2885cd.m11857s(str, this.f9163n, false, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo8943b(JSONObject jSONObject) {
        m11237c(0);
        C2900cm.C2903b bVar = C2900cm.C2903b.USER_CONFIRMED_INFO;
        this.f9149av = bVar;
        this.f9171v = C2900cm.m12011d(true, bVar);
        getFragmentManager().beginTransaction().setCustomAnimations(C2747R.animator.facetec_no_delay_fade_in, 0).add(this.f9128aa, this.f9171v, "Results").commitAllowingStateLoss();
        m11231b((C2834d) new C3496p3(this, jSONObject));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo8944c(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        try {
            JSONObject jSONObject = new JSONObject(C2885cd.m11792Y(str, true));
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                mo8932A();
                return false;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("flags");
            if (optJSONObject2 == null) {
                mo8932A();
                return false;
            }
            int optInt = optJSONObject2.optInt("nextStep");
            boolean optBoolean = optJSONObject2.optBoolean("isPassport", false);
            boolean optBoolean2 = jSONObject.optBoolean("success");
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("resultsFlags");
            if (optJSONObject3 != null) {
                z6 = optJSONObject3.optBoolean("matchedHighlyEnough");
                z5 = optJSONObject3.optBoolean("wasFullID");
                z4 = optJSONObject3.optBoolean("idTypeNotSupported");
                z3 = optJSONObject3.optBoolean("overzoomedDocument");
                z2 = optJSONObject3.optBoolean("retryDueToBarcode");
                z = optJSONObject3.optBoolean("wasLikelyRealID");
                z7 = !FaceTecSDK.f8630e.f8605h.disableAdditionalReviewScreen ? optJSONObject3.optBoolean("additionalReviewRequired") : false;
            } else {
                z7 = false;
                z6 = false;
                z5 = false;
                z4 = false;
                z3 = false;
                z2 = false;
                z = false;
            }
            int i = this.f9142ao;
            String str2 = "isPassport";
            boolean z8 = i == 1 || i == 2;
            this.f9142ao = optInt;
            this.f9160k = C2848bl.m11477c(z3, this.f9155f);
            C2908cp cpVar = C2908cp.UNKNOWN;
            if (!optBoolean2) {
                if (z4) {
                    cpVar = C2908cp.IDSCAN_RETRY_ID_TYPE_NOT_SUPPORTED;
                } else if (!z5) {
                    cpVar = C2908cp.IDSCAN_RETRY_ID_NOT_FULLY_VISIBLE;
                } else if (!z6 && z) {
                    cpVar = C2908cp.IDSCAN_RETRY_FACE_DID_NOT_MATCH;
                } else if (z2) {
                    cpVar = C2908cp.IDSCAN_RETRY_BARCODE_NOT_READ;
                } else {
                    cpVar = C2908cp.IDSCAN_RETRY_OCR_RESULTS_NOT_GOOD_ENOUGH;
                }
            } else if (optInt == 1) {
                cpVar = C2908cp.IDSCAN_SUCCESS_FRONT_SIDE_BACK_NEXT;
            } else if (optInt == 3) {
                if (this.f9109R) {
                    if (this.f9146as) {
                        cpVar = C2908cp.IDSCAN_SKIP_OR_ERROR_NFC;
                    } else {
                        cpVar = C2908cp.IDSCAN_SUCCESS_NFC;
                    }
                } else if (z8) {
                    cpVar = C2908cp.IDSCAN_SUCCESS_BACK_SIDE;
                } else if (optBoolean) {
                    cpVar = C2908cp.IDSCAN_SUCCESS_PASSPORT;
                } else {
                    cpVar = C2908cp.IDSCAN_SUCCESS_FRONT_SIDE;
                }
            } else if (optInt == 4) {
                if (z7) {
                    cpVar = C2908cp.IDSCAN_SUCCESS_ADDITIONAL_REVIEW;
                } else {
                    cpVar = C2908cp.IDSCAN_SUCCESS_USER_CONFIRMATION;
                }
            } else if (optInt == 5) {
                if (z8) {
                    cpVar = C2908cp.IDSCAN_SUCCESS_BACK_SIDE_NFC_NEXT;
                } else if (optBoolean) {
                    cpVar = C2908cp.IDSCAN_SUCCESS_PASSPORT_NFC_NEXT;
                } else {
                    cpVar = C2908cp.IDSCAN_SUCCESS_FRONT_SIDE_NFC_NEXT;
                }
            }
            if (optInt == 3 && this.f9109R) {
                if (this.f9146as) {
                    cpVar = C2908cp.IDSCAN_SKIP_OR_ERROR_NFC;
                } else {
                    cpVar = C2908cp.IDSCAN_SUCCESS_NFC;
                }
            }
            String e = C2938dc.m12409e(cpVar);
            this.f9144aq = e;
            if (optInt == 4) {
                if (z7) {
                    this.f9105N = true;
                    m11173a((Runnable) new C2991e5(this));
                } else {
                    m11199aa();
                }
                return true;
            } else if (optInt == 0) {
                this.f9160k.f9284j = C2848bl.C2850d.FRONT;
                m11233b(false, C2851bm.FRONT, e);
                return false;
            } else {
                if (optInt == 1) {
                    this.f9160k.f9284j = C2848bl.C2850d.BACK;
                    m11233b(true, C2851bm.BACK, e);
                } else if (optInt == 2) {
                    this.f9160k.f9284j = C2848bl.C2850d.BACK;
                    m11233b(false, C2851bm.BACK, e);
                    return false;
                } else if (optInt == 3) {
                    C2888cg cgVar = this.f9082b;
                    if (cgVar != null) {
                        cgVar.mo9024h();
                        this.f9141an = optJSONObject;
                        this.f9104M = true;
                        m11173a((Runnable) new C3057f5(this));
                    } else {
                        C2867c cVar = C2867c.UNEXPECTED_NULL;
                        StringBuilder sb = new StringBuilder("phoenixHandler is null inside onIDScanResultNextStep(). Session is finished: ");
                        sb.append(isFinishing());
                        C3555s.m13898c((Context) this, cVar, sb.toString());
                    }
                } else if (optInt == 5) {
                    if (optJSONObject2.optBoolean("hasNFC") && !optJSONObject2.optBoolean(str2)) {
                        this.f9130ac = true;
                    }
                    this.f9111T = optJSONObject.optString("mrzKey");
                    this.f9147at = 0;
                    m11196aS();
                    this.f9109R = true;
                    runOnUiThread(new C3154g5(this));
                    C3555s.m13902c(C2913cs.NFC_START);
                    return false;
                } else {
                    mo8932A();
                    return false;
                }
                return false;
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
            mo8941b((FaceTecIDScanStatus) null);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo8940b(int i, int i2) {
        ImageView imageView = this.f9164o;
        if (imageView != null) {
            imageView.animate().alpha(1.0f).setDuration((long) i).setStartDelay((long) i2).withEndAction(new C2822b5(this)).start();
        }
    }

    /* renamed from: b */
    private void m11231b(C2834d dVar) {
        String obj = UUID.randomUUID().toString();
        this.f9143ap = new FaceTecIDScanResult(FaceTecIDScanStatus.SUCCESS);
        C2920cv.m12195c(new C3674x4(this, obj, dVar)).mo9078d(new C3695y4(this));
    }

    /* renamed from: b */
    private void m11234b(boolean z, boolean z2) {
        if (!this.f9106O && !this.f9116Y) {
            if (this.f9113V == null) {
                this.f9113V = new C2858bt(this.f9171v, this.f9130ac);
            }
            if (this.f9114W == null) {
                this.f9114W = C2954dn.m12498e(this);
            }
            C2954dn dnVar = this.f9114W;
            if (dnVar == null) {
                m11243c(false);
            } else if (!this.f9168s) {
                try {
                    if (!dnVar.mo9118c(getClass(), this.f9111T)) {
                        C3555s.m13893b(this, C2952dm.Unknown, "did not start");
                        mo8936E();
                    } else if (!z) {
                        this.f9113V.mo8984c(z2);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    C3555s.m13893b(this, C2952dm.Unknown, e.getMessage());
                    mo8936E();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo8942b(C2952dm dmVar, String str) {
        this.f9116Y = false;
        m11205ag();
        C3555s.m13893b(this, dmVar, str);
        if (dmVar == C2952dm.ConnectionError) {
            this.f9147at++;
            if (this.f9171v == null || this.f9147at <= 5) {
                m11234b(true, false);
                this.f9113V.mo8982a();
                return;
            }
            m11243c(false);
            return;
        }
        m11243c(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m11241c(Runnable runnable) {
        if (this.f9171v != null) {
            this.f9171v.mo9035b(true, this.f9144aq, new C3055f3(this, runnable));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m11244c(boolean z, String str) {
        if (this.f9171v != null) {
            this.f9171v.mo9035b(z, str, new C2757a3(this));
        }
    }

    /* renamed from: c */
    private void m11237c(int i) {
        if (this.f9171v != null && !isFinishing()) {
            if (i == 0) {
                m11213ao();
            } else {
                this.f9171v.mo8843b(new C3715z3(this), (long) i);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ byte[] m11245c(JSONObject jSONObject, String str) {
        return C2885cd.m11859t(str, this.f9163n, jSONObject.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m11242c(String str, C2834d dVar) {
        this.f9143ap.f8623d = str;
        byte[][] x = C2885cd.m11864x();
        byte[][] w = C2885cd.m11863w();
        FaceTecIDScanResult faceTecIDScanResult = this.f9143ap;
        if (x != null) {
            for (byte[] encodeToString : x) {
                faceTecIDScanResult.f8620a.add(Base64.encodeToString(encodeToString, 2));
            }
        }
        FaceTecIDScanResult faceTecIDScanResult2 = this.f9143ap;
        if (w != null) {
            for (byte[] encodeToString2 : w) {
                faceTecIDScanResult2.f8621b.add(Base64.encodeToString(encodeToString2, 2));
            }
        }
        this.f9143ap.f8622c = dVar.getIdScanBytes(str);
    }

    /* renamed from: c */
    private void m11243c(boolean z) {
        String str;
        this.f9113V.mo8983b();
        this.f9106O = true;
        if (z) {
            str = C2938dc.m12397d(C2857bs.FINISHED_WITH_SUCCESS, this.f9130ac);
        } else {
            str = C2938dc.m12397d(C2857bs.FINISHED_WITH_ERROR, this.f9130ac);
        }
        this.f9171v.mo8845e(new C2929d3(this, z, str), 800);
    }
}

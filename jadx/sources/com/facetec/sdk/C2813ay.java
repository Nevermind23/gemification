package com.facetec.sdk;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facetec.sdk.C2792ao;
import com.facetec.sdk.C2829bc;
import com.facetec.sdk.C2831bd;
import com.facetec.sdk.C2860bu;
import com.facetec.sdk.C2888cg;
import com.facetec.sdk.FaceTecCancelButtonCustomization;
import com.facetec.sdk.FaceTecSDK;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: com.facetec.sdk.ay */
abstract class C2813ay extends C2792ao {

    /* renamed from: A */
    private Runnable f9027A;

    /* renamed from: B */
    private C2860bu f9028B;

    /* renamed from: C */
    private C2792ao.C2793e f9029C = null;

    /* renamed from: D */
    private Handler f9030D = new Handler(Looper.getMainLooper());

    /* renamed from: I */
    private final C2860bu.C2861e f9031I = new C2870c2(this);

    /* renamed from: a */
    protected C2828bb f9032a;

    /* renamed from: b */
    protected ImageView f9033b;

    /* renamed from: c */
    protected C2983e f9034c;

    /* renamed from: d */
    protected RelativeLayout f9035d;

    /* renamed from: e */
    protected ImageView f9036e;

    /* renamed from: f */
    protected boolean f9037f = false;

    /* renamed from: g */
    protected Animator f9038g;

    /* renamed from: h */
    protected View f9039h;

    /* renamed from: i */
    protected boolean f9040i = false;

    /* renamed from: j */
    protected ViewGroup f9041j;

    /* renamed from: k */
    private TextView f9042k;

    /* renamed from: l */
    private TextView f9043l;

    /* renamed from: m */
    private TextView f9044m;

    /* renamed from: n */
    private ImageView f9045n;

    /* renamed from: o */
    protected boolean f9046o = false;

    /* renamed from: p */
    private TextView f9047p;

    /* renamed from: q */
    private TextView f9048q;

    /* renamed from: r */
    private View f9049r;

    /* renamed from: s */
    private ViewGroup f9050s;

    /* renamed from: t */
    private TextView f9051t;

    /* renamed from: u */
    private AnimatorSet f9052u;

    /* renamed from: v */
    private boolean f9053v = false;

    /* renamed from: w */
    private boolean f9054w = false;

    /* renamed from: x */
    private Handler f9055x;

    /* renamed from: y */
    private Animator f9056y;

    /* renamed from: z */
    private C2888cg.C2892c f9057z;

    /* renamed from: com.facetec.sdk.ay$1 */
    static /* synthetic */ class C28141 {

        /* renamed from: a */
        static final /* synthetic */ int[] f9058a;

        /* renamed from: d */
        static final /* synthetic */ int[] f9059d;

        /* renamed from: e */
        static final /* synthetic */ int[] f9060e;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|20|21|23|24|(3:25|26|28)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0069 */
        static {
            /*
                com.facetec.sdk.FaceTecCancelButtonCustomization$ButtonLocation[] r0 = com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9060e = r0
                r1 = 1
                com.facetec.sdk.FaceTecCancelButtonCustomization$ButtonLocation r2 = com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.TOP_LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f9060e     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facetec.sdk.FaceTecCancelButtonCustomization$ButtonLocation r3 = com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.TOP_RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f9060e     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facetec.sdk.FaceTecCancelButtonCustomization$ButtonLocation r4 = com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f9060e     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facetec.sdk.FaceTecCancelButtonCustomization$ButtonLocation r4 = com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.DISABLED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.facetec.sdk.ci[] r3 = com.facetec.sdk.C2896ci.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f9059d = r3
                com.facetec.sdk.ci r4 = com.facetec.sdk.C2896ci.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r3 = f9059d     // Catch:{ NoSuchFieldError -> 0x004e }
                com.facetec.sdk.ci r4 = com.facetec.sdk.C2896ci.DARK_AS_POSSIBLE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = f9059d     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.facetec.sdk.ci r4 = com.facetec.sdk.C2896ci.BRIGHT_AS_POSSIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                com.facetec.sdk.cj[] r2 = com.facetec.sdk.C2897cj.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f9058a = r2
                com.facetec.sdk.cj r3 = com.facetec.sdk.C2897cj.ENABLE     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r1 = f9058a     // Catch:{ NoSuchFieldError -> 0x0073 }
                com.facetec.sdk.cj r2 = com.facetec.sdk.C2897cj.DISABLE     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2813ay.C28141.<clinit>():void");
        }
    }

    protected C2813ay() {
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void m11004C() {
        C2831bd j = mo8883j();
        if (j != null) {
            j.mo8954y();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11005a(C2899cl clVar, C2896ci ciVar, C2895ch chVar, C2897cj cjVar) {
        C2831bd j;
        if (this.f9053v || (j = mo8883j()) == null) {
            return;
        }
        if (clVar == C2899cl.TIMEOUT_GO_TO_RETRY) {
            if (j.f9082b == null || !C2888cg.m11931m() || !mo8879f()) {
                m11012e(cjVar);
                mo8979k();
                j.mo8919h();
                return;
            }
            mo8979k();
            mo9044l().run();
        } else if (clVar == C2899cl.DETECTING_LIGHT_MODE) {
            m11012e(cjVar);
            int i = C28141.f9059d[ciVar.ordinal()];
            if (i == 2) {
                j.mo8951u();
            } else if (i == 3) {
                j.mo8954y();
            }
            if (cjVar == C2897cj.ENABLE) {
                boolean f = mo8879f();
                boolean z = this.f9040i;
                boolean isEnabled = this.f9034c.isEnabled();
                boolean z2 = this.f9029C != null;
                if (f && z && isEnabled && !z2) {
                    m11030r();
                    C2792ao.C2793e l = mo9044l();
                    this.f9029C = l;
                    this.f9030D.postDelayed(l, 2000);
                    return;
                }
                return;
            }
            m11030r();
        } else {
            mo8979k();
        }
    }

    /* renamed from: q */
    private void m11029q() {
        if (mo8883j() != null) {
            C2920cv.m12195c(new C3283k2(this));
        }
    }

    /* renamed from: r */
    private void m11030r() {
        this.f9030D.removeCallbacksAndMessages((Object) null);
        this.f9029C = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m11031s() {
        if (getActivity() != null) {
            mo8877e(true);
            this.f9033b.setEnabled(true);
            this.f9034c.setEnabled(true);
            mo8876e();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m11033u() {
        this.f9053v = true;
        this.f9033b.setEnabled(false);
        mo8877e(false);
        this.f9034c.mo9158c(false, true);
        this.f9038g = ObjectAnimator.ofFloat((Object) null, "alpha", new float[]{1.0f, Utils.FLOAT_EPSILON}).setDuration(1000);
        mo8884n();
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m11034v() {
        C2888cg m = mo9045m();
        C2860bu buVar = this.f9028B;
        if (buVar != null && m != null) {
            buVar.mo8987d(this.f9031I, m);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m11035w() {
        C2860bu buVar;
        C2831bd j = mo8883j();
        if (j == null) {
            buVar = null;
        } else {
            buVar = new C2860bu(j);
        }
        this.f9028B = buVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m11036x() {
        boolean z;
        m11030r();
        if (mo8883j() != null && !mo8883j().f9168s) {
            boolean f = mo8879f();
            if (this.f9040i || C2949dl.m12473a()) {
                z = true;
            } else {
                z = false;
            }
            boolean isEnabled = this.f9034c.isEnabled();
            if (f && z && isEnabled) {
                m11033u();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m11037y() {
        C2983e eVar = this.f9034c;
        if (eVar != null && !eVar.f10097d && !this.f9053v && eVar.isEnabled()) {
            this.f9034c.mo9158c(true, false);
        }
        this.f9055x.postDelayed(this.f9027A, 5000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8870a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo8872b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo8873b(Context context, boolean z) {
        C2831bd j = mo8883j();
        if (j != null) {
            j.f9166q = C2831bd.C2835e.PRE_SESSION_STARTED;
        }
        mo8845e(new C3182h2(this, context, z), 20);
        m11027p();
        if (FaceTecSDK.f8628c == FaceTecSDK.C2744a.NORMAL) {
            if (mo9045m() != null) {
                m11029q();
            }
            mo8845e(new C3204i2(this), 185);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo8874c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo8875d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo8876e();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo8877e(boolean z) {
        ImageView imageView = this.f9036e;
        if (imageView != null) {
            imageView.setEnabled(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo8879f();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        Animator animator;
        Animator animator2;
        if (z && (animator2 = this.f9056y) != null) {
            return animator2;
        }
        if (z || (animator = this.f9038g) == null) {
            return super.onCreateAnimator(i, z, i2);
        }
        return animator;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2747R.layout.facetec_guidance_fragment, viewGroup, false);
        this.f9049r = inflate;
        return inflate;
    }

    public void onPause() {
        Runnable runnable;
        super.onPause();
        this.f9049r.removeCallbacks((Runnable) null);
        AnimatorSet animatorSet = this.f9052u;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        Handler handler = this.f9055x;
        if (handler != null && (runnable = this.f9027A) != null) {
            handler.removeCallbacks(runnable);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C2799at.f8964b = false;
        this.f9039h = view.findViewById(C2747R.C2749id.centerContentView);
        this.f9032a = (C2828bb) view.findViewById(C2747R.C2749id.zoomDialogBackground);
        this.f9050s = (ViewGroup) view.findViewById(C2747R.C2749id.bottomLayout);
        this.f9041j = (ViewGroup) view.findViewById(C2747R.C2749id.zoomDialogForeground);
        this.f9033b = (ImageView) view.findViewById(C2747R.C2749id.backButton);
        this.f9044m = (TextView) view.findViewById(C2747R.C2749id.zoomDialogIconSubtext);
        this.f9045n = (ImageView) view.findViewById(C2747R.C2749id.iconImageView);
        this.f9042k = (TextView) view.findViewById(C2747R.C2749id.zoomDialogHeader);
        this.f9043l = (TextView) view.findViewById(C2747R.C2749id.messageView1);
        this.f9048q = (TextView) view.findViewById(C2747R.C2749id.messageView2);
        this.f9047p = (TextView) view.findViewById(C2747R.C2749id.zoomDialogText3);
        this.f9051t = (TextView) view.findViewById(C2747R.C2749id.zoomDialogText4);
        this.f9034c = (C2983e) view.findViewById(C2747R.C2749id.zoomDialogActionButton);
        this.f9035d = (RelativeLayout) view.findViewById(C2747R.C2749id.guidanceTransitionView);
        C2831bd j = mo8883j();
        if (mo9045m() != null && j != null && j.mo8912c() == C2829bc.C2830b.GRANTED && !this.f9037f) {
            mo8873b(j, this.f9046o);
        }
        this.f9036e = j.f9164o;
        this.f9033b.setImportantForAccessibility(2);
        this.f9034c.setImportantForAccessibility(2);
        mo8885o();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m11006c(float f) {
        if (!this.f9054w) {
            this.f9054w = true;
            int b = (int) (C2810ax.m10988b(35) * f);
            int d = C2938dc.m12393d();
            float f2 = ((float) d) / 2.0f;
            int round = Math.round(f2);
            int round2 = Math.round(f2);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9050s.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, d);
            this.f9050s.setLayoutParams(layoutParams);
            this.f9034c.setLayoutParams(new LinearLayout.LayoutParams((int) ((((float) Resources.getSystem().getDisplayMetrics().widthPixels) * C2938dc.m12404e()) - ((float) (d << 1))), (int) (C2810ax.m10988b(50) * f)));
            this.f9034c.requestLayout();
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f9033b.getLayoutParams();
            layoutParams2.setMargins(round, round, 0, 0);
            layoutParams2.setMarginStart(round);
            layoutParams2.setMarginEnd(round);
            this.f9033b.setLayoutParams(layoutParams2);
            this.f9033b.setPadding(round2, round2, round2, round2);
            this.f9033b.getLayoutParams().height = b;
            this.f9033b.getLayoutParams().width = b;
            this.f9033b.requestLayout();
            this.f9039h.animate().alpha(1.0f).setDuration(300).setListener((Animator.AnimatorListener) null).start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m11009d(Context context, boolean z) {
        C2888cg m = mo9045m();
        if (m != null) {
            C3226j2 j2Var = new C3226j2(this);
            this.f9057z = j2Var;
            m.mo9014c((C2888cg.C2892c) j2Var);
            if (!m.mo9022e(context, z) && mo8883j() != null) {
                mo8883j().mo8916e(C2790am.f8922s);
            }
        }
    }

    /* renamed from: k */
    private void mo8979k() {
        C2860bu buVar = this.f9028B;
        if (buVar != null) {
            buVar.mo8986b();
            this.f9028B = null;
        }
        C2888cg m = mo9045m();
        if (m != null) {
            m.mo9020e(this.f9057z);
            this.f9057z = null;
        }
    }

    /* renamed from: l */
    private C2792ao.C2793e mo9044l() {
        return new C2792ao.C2793e(new C2756a2(this));
    }

    /* renamed from: m */
    private C2888cg mo9045m() {
        C2831bd j = mo8883j();
        if (j != null) {
            return j.f9082b;
        }
        return null;
    }

    /* renamed from: p */
    private void m11027p() {
        this.f9055x = new Handler();
        C3333l2 l2Var = new C3333l2(this);
        this.f9027A = l2Var;
        this.f9055x.post(l2Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo8880g() {
        if (FaceTecSDK.f8630e.f8612o.f8592a != FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
            ImageView imageView = this.f9033b;
            if (imageView == null) {
                C3555s.m13898c((Context) mo8883j(), C2867c.NON_FATAL_ERROR, "backButton is null unexpectedly.");
            } else {
                imageView.setImageResource(C2938dc.m12266aH());
            }
        }
        this.f9034c.mo9159e();
        mo8874c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo8881h() {
        this.f9053v = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C2829bc mo8882i() {
        return (C2829bc) getActivity();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final C2831bd mo8883j() {
        return (C2831bd) getActivity();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo8884n() {
        mo8875d();
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: o */
    public void mo8885o() {
        this.f9033b.setEnabled(false);
        mo8877e(false);
        if (FaceTecSDK.f8630e.f8612o.f8592a != FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
            this.f9033b.setImageResource(C2938dc.m12266aH());
        }
        int i = C28141.f9060e[FaceTecSDK.f8630e.f8612o.f8592a.ordinal()];
        if (i == 2) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9033b.getLayoutParams();
            layoutParams.removeRule(20);
            layoutParams.addRule(21);
            this.f9033b.setLayoutParams(layoutParams);
        } else if (i == 3 || i == 4) {
            this.f9033b.setVisibility(8);
        }
        float c = C2938dc.m12372c() * C2938dc.m12404e();
        C2938dc.m12412e((View) this.f9035d);
        this.f9044m.setTypeface(C2839bf.f9198b);
        float f = 20.0f * c;
        this.f9044m.setTextSize(2, f);
        C2938dc.m12413e(this.f9044m);
        this.f9044m.setLineSpacing(Utils.FLOAT_EPSILON, 1.1f);
        this.f9042k.setTypeface(C2839bf.f9199c);
        C2938dc.m12413e(this.f9042k);
        this.f9042k.setTypeface(C2839bf.f9199c);
        this.f9042k.setTextSize(2, 28.0f * c);
        this.f9042k.setLineSpacing(Utils.FLOAT_EPSILON, 1.1f);
        this.f9043l.setTypeface(C2839bf.f9198b);
        this.f9048q.setTypeface(C2839bf.f9198b);
        this.f9047p.setTypeface(C2839bf.f9198b);
        this.f9051t.setTypeface(C2839bf.f9198b);
        this.f9043l.setTextSize(2, f);
        this.f9048q.setTextSize(2, f);
        this.f9047p.setTextSize(2, f);
        this.f9051t.setTextSize(2, f);
        this.f9043l.setLineSpacing(Utils.FLOAT_EPSILON, 1.1f);
        this.f9048q.setLineSpacing(Utils.FLOAT_EPSILON, 1.1f);
        this.f9047p.setLineSpacing(Utils.FLOAT_EPSILON, 1.1f);
        this.f9051t.setLineSpacing(Utils.FLOAT_EPSILON, 1.1f);
        C2938dc.m12413e(this.f9043l);
        C2938dc.m12413e(this.f9048q);
        C2938dc.m12413e(this.f9047p);
        C2938dc.m12413e(this.f9051t);
        this.f9034c.setEnabled(false);
        this.f9034c.mo9156b();
        this.f9034c.setAlpha(Utils.FLOAT_EPSILON);
        this.f9039h.setAlpha(Utils.FLOAT_EPSILON);
        mo8878e(false, 0, 0);
        this.f9034c.getViewTreeObserver().addOnGlobalLayoutListener(new C3713z1(this, c));
        C2810ax.m10997d(getActivity());
        this.f9033b.setOnClickListener(new C2928d2(this));
        this.f9033b.setOnTouchListener(new C2988e2(this));
        this.f9034c.mo9155a(new C2792ao.C2793e(new C3054f2(this)));
        this.f9049r.post(new C2792ao.C2793e(new C3151g2(this)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo8878e(boolean z, int i, int i2) {
        ImageView imageView = this.f9036e;
        if (imageView == null) {
            imageView = this.f9033b;
        }
        float f = z ? 1.0f : Utils.FLOAT_EPSILON;
        if (i == 0 && i2 == 0) {
            imageView.setAlpha(f);
        } else {
            imageView.animate().alpha(f).setDuration((long) i).setStartDelay((long) i2).setListener((Animator.AnimatorListener) null).start();
        }
    }

    /* renamed from: e */
    private void m11012e(C2897cj cjVar) {
        if (mo8879f()) {
            if (!C2949dl.m12473a()) {
                int i = C28141.f9058a[cjVar.ordinal()];
                if (i != 1) {
                    if (i == 2 && this.f9034c.isEnabled() && !this.f9040i) {
                        this.f9034c.mo9158c(false, true);
                    }
                } else if (!this.f9034c.isEnabled()) {
                    this.f9034c.mo9158c(true, true);
                }
            } else if (!this.f9034c.isEnabled()) {
                this.f9034c.mo9158c(true, true);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ boolean m11011d(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f9033b.setAlpha(0.4f);
        } else if (motionEvent.getAction() == 3 || motionEvent.getX() < Utils.FLOAT_EPSILON || motionEvent.getX() > ((float) (this.f9033b.getWidth() + this.f9033b.getLeft() + 10)) || motionEvent.getY() < Utils.FLOAT_EPSILON || motionEvent.getY() > ((float) (this.f9033b.getHeight() + this.f9033b.getTop() + 10))) {
            this.f9033b.setAlpha(1.0f);
        } else if (motionEvent.getAction() == 1) {
            this.f9033b.performClick();
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m11007c(View view) {
        this.f9033b.setAlpha(1.0f);
        this.f9033b.setEnabled(false);
        mo8877e(false);
        this.f9034c.mo9158c(false, true);
        mo8870a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8871a(Runnable runnable, int i) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f9052u = animatorSet;
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f9041j, View.ALPHA, new float[]{1.0f, Utils.FLOAT_EPSILON})});
        this.f9052u.setDuration((long) i);
        this.f9052u.addListener(new C2819b2(runnable));
        this.f9052u.start();
    }
}

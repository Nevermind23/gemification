package com.facetec.sdk;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.facetec.sdk.C2792ao;
import com.facetec.sdk.FaceTecCancelButtonCustomization;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: com.facetec.sdk.cm */
public final class C2900cm extends C2792ao {

    /* renamed from: A */
    private boolean f9625A = false;

    /* renamed from: B */
    private long f9626B = -1;

    /* renamed from: C */
    private C2903b f9627C = C2903b.DEFAULT;

    /* renamed from: D */
    private final Handler f9628D = new Handler(Looper.getMainLooper());

    /* renamed from: G */
    private AnimatedVectorDrawableCompat f9629G;

    /* renamed from: H */
    private Animatable2Compat$AnimationCallback f9630H;

    /* renamed from: I */
    private final C2792ao.C2793e f9631I = new C2792ao.C2793e(new C3597td(this));

    /* renamed from: a */
    RelativeLayout f9632a;

    /* renamed from: b */
    RelativeLayout f9633b;

    /* renamed from: c */
    View f9634c;

    /* renamed from: d */
    ImageView f9635d;

    /* renamed from: e */
    TextView f9636e;

    /* renamed from: f */
    private TextView f9637f;

    /* renamed from: g */
    protected AnimatedVectorDrawableCompat f9638g;

    /* renamed from: h */
    C2983e f9639h;

    /* renamed from: i */
    private ImageView f9640i;

    /* renamed from: j */
    ImageView f9641j;

    /* renamed from: k */
    private RelativeLayout f9642k;

    /* renamed from: l */
    private ProgressBar f9643l;

    /* renamed from: m */
    private ImageView f9644m;

    /* renamed from: n */
    private TextView f9645n;

    /* renamed from: o */
    private ImageView f9646o;

    /* renamed from: p */
    private LinearLayout f9647p;

    /* renamed from: q */
    private ObjectAnimator f9648q;

    /* renamed from: r */
    private ImageView f9649r;

    /* renamed from: s */
    private RelativeLayout f9650s;

    /* renamed from: t */
    private TextView f9651t;

    /* renamed from: u */
    private Handler f9652u;

    /* renamed from: v */
    private boolean f9653v = false;

    /* renamed from: w */
    private boolean f9654w = false;

    /* renamed from: x */
    private boolean f9655x = false;

    /* renamed from: y */
    private boolean f9656y = false;

    /* renamed from: z */
    private C2904e f9657z = C2904e.UPLOAD_STARTED;

    /* renamed from: com.facetec.sdk.cm$4 */
    static /* synthetic */ class C29024 {

        /* renamed from: a */
        static final /* synthetic */ int[] f9659a;

        /* renamed from: b */
        static final /* synthetic */ int[] f9660b;

        /* renamed from: d */
        static final /* synthetic */ int[] f9661d;

        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0089 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0093 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x009d */
        static {
            /*
                com.facetec.sdk.cm$b[] r0 = com.facetec.sdk.C2900cm.C2903b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9661d = r0
                r1 = 1
                com.facetec.sdk.cm$b r2 = com.facetec.sdk.C2900cm.C2903b.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f9661d     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facetec.sdk.cm$b r3 = com.facetec.sdk.C2900cm.C2903b.FRONT_SIDE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f9661d     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facetec.sdk.cm$b r4 = com.facetec.sdk.C2900cm.C2903b.BACK_SIDE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f9661d     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facetec.sdk.cm$b r5 = com.facetec.sdk.C2900cm.C2903b.USER_CONFIRMED_INFO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r4 = f9661d     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facetec.sdk.cm$b r5 = com.facetec.sdk.C2900cm.C2903b.NFC     // Catch:{ NoSuchFieldError -> 0x003e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r6 = 5
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r4 = f9661d     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facetec.sdk.cm$b r5 = com.facetec.sdk.C2900cm.C2903b.SKIPPED_NFC     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6 = 6
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                com.facetec.sdk.cm$e[] r4 = com.facetec.sdk.C2900cm.C2904e.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f9660b = r4
                com.facetec.sdk.cm$e r5 = com.facetec.sdk.C2900cm.C2904e.UPLOAD_STARTED     // Catch:{ NoSuchFieldError -> 0x005a }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r4 = f9660b     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.facetec.sdk.cm$e r5 = com.facetec.sdk.C2900cm.C2904e.STILL_UPLOADING     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r4 = f9660b     // Catch:{ NoSuchFieldError -> 0x006e }
                com.facetec.sdk.cm$e r5 = com.facetec.sdk.C2900cm.C2904e.UPLOAD_COMPLETE_AWAITING_RESPONSE     // Catch:{ NoSuchFieldError -> 0x006e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r4 = f9660b     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.facetec.sdk.cm$e r5 = com.facetec.sdk.C2900cm.C2904e.UPLOAD_COMPLETE_AWAITING_PROCESSING     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                com.facetec.sdk.FaceTecCancelButtonCustomization$ButtonLocation[] r4 = com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f9659a = r4
                com.facetec.sdk.FaceTecCancelButtonCustomization$ButtonLocation r5 = com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.TOP_LEFT     // Catch:{ NoSuchFieldError -> 0x0089 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0089 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0089 }
            L_0x0089:
                int[] r1 = f9659a     // Catch:{ NoSuchFieldError -> 0x0093 }
                com.facetec.sdk.FaceTecCancelButtonCustomization$ButtonLocation r4 = com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.TOP_RIGHT     // Catch:{ NoSuchFieldError -> 0x0093 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0093 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0093 }
            L_0x0093:
                int[] r0 = f9659a     // Catch:{ NoSuchFieldError -> 0x009d }
                com.facetec.sdk.FaceTecCancelButtonCustomization$ButtonLocation r1 = com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM     // Catch:{ NoSuchFieldError -> 0x009d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009d }
            L_0x009d:
                int[] r0 = f9659a     // Catch:{ NoSuchFieldError -> 0x00a7 }
                com.facetec.sdk.FaceTecCancelButtonCustomization$ButtonLocation r1 = com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.DISABLED     // Catch:{ NoSuchFieldError -> 0x00a7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a7 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00a7 }
            L_0x00a7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2900cm.C29024.<clinit>():void");
        }
    }

    /* renamed from: com.facetec.sdk.cm$b */
    enum C2903b {
        DEFAULT,
        FRONT_SIDE,
        BACK_SIDE,
        USER_CONFIRMED_INFO,
        NFC,
        SKIPPED_NFC
    }

    /* renamed from: com.facetec.sdk.cm$e */
    enum C2904e {
        UPLOAD_STARTED,
        STILL_UPLOADING,
        UPLOAD_COMPLETE_AWAITING_RESPONSE,
        UPLOAD_COMPLETE_AWAITING_PROCESSING
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m11993a(C2792ao.C2793e eVar) {
        ObjectAnimator objectAnimator = this.f9648q;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.f9648q = null;
        }
        ProgressBar progressBar = this.f9643l;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, "progress", new int[]{progressBar.getProgress(), this.f9643l.getMax()});
        ofInt.setDuration(500);
        ofInt.addListener(new C3194he(eVar));
        ofInt.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m11998b(View view) {
        ((FaceTecSessionActivity) getActivity()).mo8926o();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m12016e(View view) {
        this.f9647p.setEnabled(false);
        this.f9647p.setClickable(false);
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://dev.facetec.com/removing-development-mode-watermark")));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Handler handler = new Handler();
        this.f9652u = handler;
        handler.postDelayed(this.f9631I, 600000);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C2747R.layout.facetec_results_fragment, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        super.onViewCreated(view, bundle);
        this.f9654w = getArguments().getBoolean("isIDScan");
        this.f9627C = (C2903b) getArguments().get("uploadType");
        this.f9657z = C2904e.UPLOAD_STARTED;
        this.f9640i = (ImageView) view2.findViewById(C2747R.C2749id.activityIndicatorImageView);
        this.f9643l = (ProgressBar) view2.findViewById(C2747R.C2749id.uploadProgressBar);
        this.f9637f = (TextView) view2.findViewById(C2747R.C2749id.progressTextView);
        this.f9645n = (TextView) view2.findViewById(C2747R.C2749id.resultTextView);
        this.f9634c = view2.findViewById(C2747R.C2749id.zoomResultBackground);
        this.f9650s = (RelativeLayout) view2.findViewById(C2747R.C2749id.progressBarLayout);
        this.f9633b = (RelativeLayout) view2.findViewById(C2747R.C2749id.zoomResultLayout);
        this.f9642k = (RelativeLayout) view2.findViewById(C2747R.C2749id.zoomResultContainer);
        this.f9646o = (ImageView) view2.findViewById(C2747R.C2749id.resultAnimationBackground);
        this.f9644m = (ImageView) view2.findViewById(C2747R.C2749id.resultAnimationForeground);
        this.f9647p = (LinearLayout) view2.findViewById(C2747R.C2749id.devModeTagLayout);
        this.f9651t = (TextView) view2.findViewById(C2747R.C2749id.devModeTagTextView);
        this.f9649r = (ImageView) view2.findViewById(C2747R.C2749id.devModeTagImageView);
        this.f9635d = (ImageView) view2.findViewById(C2747R.C2749id.nfcIcon);
        this.f9636e = (TextView) view2.findViewById(C2747R.C2749id.nfcStatus);
        this.f9632a = (RelativeLayout) view2.findViewById(C2747R.C2749id.nfcLayout);
        ImageView imageView = (ImageView) view2.findViewById(C2747R.C2749id.nfcBackButton);
        this.f9641j = imageView;
        boolean z = true;
        imageView.setEnabled(true);
        if (FaceTecSDK.f8630e.f8612o.f8592a != FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
            this.f9641j.setImageDrawable(C0767a.m2895e(getActivity(), C2938dc.m12266aH()));
        }
        int i = C29024.f9659a[FaceTecSDK.f8630e.f8612o.f8592a.ordinal()];
        if (i == 2) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9641j.getLayoutParams();
            layoutParams.removeRule(20);
            layoutParams.addRule(21);
            this.f9641j.setLayoutParams(layoutParams);
        } else if (i == 3 || i == 4) {
            this.f9641j.setVisibility(8);
        }
        this.f9641j.getViewTreeObserver().addOnGlobalLayoutListener(new C3642ve(this));
        this.f9641j.setOnClickListener(new C3526qc(this));
        this.f9641j.setOnTouchListener(new C3547rc(this));
        if (C2750a.m10683b(getActivity()) && FaceTecSDK.f8630e.f8600c && !getActivity().getPackageName().contains("com.facetec.zoomlogin") && !getActivity().getPackageName().contains("om.facetec.photoidmatchtester")) {
            float c = C2938dc.m12372c() * C2938dc.m12404e();
            this.f9651t.setTypeface(FaceTecSDK.f8630e.f8603f.messageFont);
            this.f9651t.setTextSize(2, 14.0f * c);
            C2938dc.m12317b(this.f9651t);
            this.f9649r.setColorFilter(C2938dc.m12231J(), PorterDuff.Mode.SRC_IN);
            this.f9649r.getLayoutParams().height = (int) (C2810ax.m10988b(18) * c);
            this.f9649r.getLayoutParams().width = (int) (C2810ax.m10988b(18) * c);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f9647p.getLayoutParams();
            layoutParams2.bottomMargin = C2938dc.m12393d();
            layoutParams2.height = (int) (C2810ax.m10988b(26) * c);
            this.f9647p.setLayoutParams(layoutParams2);
            this.f9647p.requestLayout();
            this.f9647p.setOnClickListener(new C3575sc(this));
            this.f9647p.setOnTouchListener(new C3596tc(this));
            this.f9647p.setVisibility(0);
        }
        C2938dc.m12424h(this.f9634c);
        if (!this.f9654w) {
            this.f9634c.getBackground().setAlpha(C2938dc.m12277aS());
        }
        float c2 = C2938dc.m12372c() * C2938dc.m12404e();
        float bj = C2938dc.m12355bj();
        int d = C2938dc.m12393d();
        int round = Math.round(C2810ax.m10988b(80) * bj * c2);
        int round2 = Math.round(C2810ax.m10988b(130) * c2);
        int round3 = Math.round(C2810ax.m10988b(-55) * c2);
        int round4 = Math.round(C2810ax.m10988b(6) * c2);
        int round5 = Math.round(C2810ax.m10988b(50) * c2);
        C2983e eVar = (C2983e) view2.findViewById(C2747R.C2749id.nfcSkipButton);
        this.f9639h = eVar;
        eVar.mo9154a();
        this.f9639h.setText(C2923cy.m12206b(C2747R.string.FaceTec_action_skip_nfc));
        this.f9639h.setEnabled(false);
        this.f9639h.mo9155a(new C2792ao.C2793e(new C3617uc(this)));
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f9639h.getLayoutParams();
        layoutParams3.height = round5;
        layoutParams3.setMargins(d, 0, d, d);
        this.f9639h.setLayoutParams(layoutParams3);
        this.f9642k.setTranslationY((float) round3);
        FrameLayout frameLayout = (FrameLayout) view2.findViewById(C2747R.C2749id.resultFrame);
        frameLayout.getLayoutParams().height = round;
        frameLayout.getLayoutParams().width = round;
        this.f9646o.setColorFilter(C2938dc.m12442n(getActivity()), PorterDuff.Mode.SRC_IN);
        this.f9644m.setColorFilter(C2938dc.m12437l((Context) getActivity()), PorterDuff.Mode.SRC_IN);
        this.f9635d.getLayoutParams().height = round2;
        LayerDrawable layerDrawable = (LayerDrawable) getResources().getDrawable(C2747R.C2748drawable.facetec_progress_bar);
        layerDrawable.mutate();
        Drawable drawable = layerDrawable.getDrawable(0);
        LayerDrawable layerDrawable2 = (LayerDrawable) ((ScaleDrawable) layerDrawable.getDrawable(1)).getDrawable();
        Drawable findDrawableByLayerId = layerDrawable2.findDrawableByLayerId(C2747R.C2749id.progressFill);
        Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(C2747R.C2749id.progressGlow);
        float f = ((float) round4) / 2.0f;
        ((GradientDrawable) drawable).setCornerRadius(f);
        ((GradientDrawable) findDrawableByLayerId).setCornerRadius(f);
        ((GradientDrawable) findDrawableByLayerId2).setCornerRadius(f);
        C2938dc.m12381c(this.f9643l, drawable);
        C2938dc.m12382c(this.f9643l, findDrawableByLayerId, findDrawableByLayerId2);
        this.f9643l.setProgressDrawable(layerDrawable);
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f9643l.getLayoutParams();
        layoutParams4.height = round4;
        layoutParams4.topMargin = d;
        this.f9643l.setLayoutParams(layoutParams4);
        this.f9643l.setVisibility(0);
        C2938dc.m12317b(this.f9637f);
        C2938dc.m12317b(this.f9645n);
        C2938dc.m12317b(this.f9636e);
        this.f9637f.setTypeface(FaceTecSDK.f8630e.f8603f.messageFont);
        this.f9645n.setTypeface(FaceTecSDK.f8630e.f8603f.messageFont);
        this.f9636e.setTypeface(FaceTecSDK.f8630e.f8603f.messageFont);
        if (this.f9654w) {
            TextView textView = this.f9637f;
            int i2 = C2747R.string.FaceTec_result_idscan_upload_message;
            C2923cy.m12209e(textView, i2);
            if (this.f9627C == C2903b.NFC) {
                C2923cy.m12209e(this.f9637f, C2747R.string.FaceTec_result_nfc_upload_message);
            } else {
                C2923cy.m12209e(this.f9637f, i2);
            }
        } else {
            C2923cy.m12209e(this.f9637f, C2747R.string.FaceTec_result_facescan_upload_message);
            this.f9637f.setImportantForAccessibility(1);
            TextView textView2 = this.f9637f;
            textView2.setContentDescription(textView2.getText().toString());
            this.f9637f.performAccessibilityAction(64, (Bundle) null);
            this.f9637f.sendAccessibilityEvent(8);
        }
        float f2 = c2 * 24.0f;
        this.f9637f.setTextSize(2, f2);
        this.f9636e.setTextSize(2, f2);
        this.f9645n.setTextSize(2, f2);
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) this.f9637f.getLayoutParams();
        layoutParams5.topMargin = d;
        layoutParams5.leftMargin = d;
        layoutParams5.rightMargin = d;
        this.f9637f.setLayoutParams(layoutParams5);
        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) this.f9645n.getLayoutParams();
        layoutParams6.topMargin = d;
        layoutParams6.leftMargin = d;
        layoutParams6.rightMargin = d;
        this.f9645n.setLayoutParams(layoutParams6);
        RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) this.f9636e.getLayoutParams();
        layoutParams7.topMargin = d;
        layoutParams7.leftMargin = d;
        layoutParams7.rightMargin = d;
        this.f9636e.setLayoutParams(layoutParams7);
        ViewGroup.LayoutParams layoutParams8 = this.f9640i.getLayoutParams();
        layoutParams8.height = round;
        layoutParams8.width = round;
        this.f9640i.setLayoutParams(layoutParams8);
        int aQ = C2938dc.m12275aQ();
        int be = C2938dc.m12350be();
        if (be != 0) {
            this.f9638g = C2810ax.m10990b(getActivity(), be);
        }
        if (this.f9638g != null) {
            mo8844e(new C3640vc(this));
            this.f9640i.setVisibility(0);
        } else if (aQ != 0) {
            this.f9640i.setImageResource(aQ);
            this.f9640i.clearAnimation();
            this.f9640i.setVisibility(0);
            RotateAnimation rotateAnimation = new RotateAnimation(Utils.FLOAT_EPSILON, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            rotateAnimation.setDuration((long) FaceTecSDK.f8630e.f8603f.customActivityIndicatorRotationInterval);
            rotateAnimation.setRepeatCount(-1);
            this.f9640i.startAnimation(rotateAnimation);
        } else {
            mo8844e(new C3661wc(this));
        }
        if (!this.f9654w || FaceTecCustomization.f8596q == null) {
            z = false;
        }
        this.f9655x = z;
        if (z) {
            this.f9628D.post(new C2792ao.C2793e(new C3682xc(this)));
        }
        if (FaceTecSDK.f8630e.f8603f.showUploadProgressBar) {
            this.f9643l.setVisibility(0);
            mo8844e(new C3703yc(this));
        } else {
            this.f9643l.setVisibility(4);
        }
        mo8844e(new C3663we(this));
        C3555s.m13902c(C2913cs.RESULT_UPLOAD);
    }

    /* renamed from: d */
    static C2900cm m12011d(boolean z, C2903b bVar) {
        C2900cm cmVar = new C2900cm();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isIDScan", z);
        bundle.putSerializable("uploadType", bVar);
        cmVar.setArguments(bundle);
        return cmVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m12021f() {
        if (this.f9628D != null && !this.f9625A) {
            m12002b(true);
            if (this.f9643l != null && FaceTecSDK.f8630e.f8603f.showUploadProgressBar) {
                mo8844e(new C3577se(this, (C2792ao.C2793e) null));
            }
            this.f9628D.postDelayed(new C2792ao.C2793e(new C3598te(this)), 3000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m12023g() {
        if (!this.f9625A) {
            this.f9628D.removeCallbacksAndMessages((Object) null);
            this.f9628D.postDelayed(new C2792ao.C2793e(new C3193hd(this)), 500);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m12026h() {
        this.f9628D.removeCallbacksAndMessages((Object) null);
        if (!this.f9625A) {
            this.f9657z = C2904e.UPLOAD_COMPLETE_AWAITING_PROCESSING;
            m12002b(true);
            this.f9628D.postDelayed(new C2792ao.C2793e(new C3507pe(this)), 1000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m12028i() {
        this.f9657z = C2904e.UPLOAD_COMPLETE_AWAITING_RESPONSE;
        m12004c(new C2792ao.C2793e(new C3576sd(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m12032j(Runnable runnable) {
        this.f9647p.animate().alpha(Utils.FLOAT_EPSILON).setDuration(800).setStartDelay(0).setInterpolator(new DecelerateInterpolator()).setListener((Animator.AnimatorListener) null).start();
        RelativeLayout relativeLayout = this.f9642k;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, "alpha", new float[]{relativeLayout.getAlpha(), 0.0f});
        ofFloat.setDuration(800);
        ofFloat.addListener(new C3662wd(this, runnable));
        ofFloat.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m12033k() {
        if (!this.f9653v) {
            this.f9653v = true;
            float c = C2938dc.m12372c();
            float e = C2938dc.m12404e();
            int d = C2938dc.m12393d();
            int b = (int) (C2810ax.m10988b(35) * e * c);
            float f = ((float) d) / 2.0f;
            int round = Math.round(f);
            int round2 = Math.round(f);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9641j.getLayoutParams();
            layoutParams.setMargins(round, round, 0, 0);
            layoutParams.setMarginStart(round);
            layoutParams.setMarginEnd(round);
            this.f9641j.setLayoutParams(layoutParams);
            this.f9641j.setPadding(round2, round2, round2, round2);
            this.f9641j.getLayoutParams().height = b;
            this.f9641j.getLayoutParams().width = b;
            this.f9641j.requestLayout();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m12035l() {
        this.f9637f.setText(m11996b(this.f9657z, this.f9627C));
        this.f9637f.animate().alpha(1.0f).setDuration(500).setListener((Animator.AnimatorListener) null).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m12037m() {
        ProgressBar progressBar = this.f9643l;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, "progress", new int[]{progressBar.getProgress(), 3000});
        this.f9648q = ofInt;
        ofInt.setDuration(3000);
        this.f9648q.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m12039n() {
        this.f9642k.animate().alpha(1.0f).setDuration(800).setStartDelay(0).setInterpolator(new DecelerateInterpolator()).setListener((Animator.AnimatorListener) null).start();
        this.f9647p.animate().alpha(1.0f).setDuration(800).setStartDelay(0).setInterpolator(new DecelerateInterpolator()).setListener((Animator.AnimatorListener) null).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m12041o() {
        if (!this.f9625A) {
            this.f9628D.removeCallbacksAndMessages((Object) null);
            m11999b(new C2792ao.C2793e(new C3528qe(this)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m12044q() {
        FaceTecSessionActivity faceTecSessionActivity = (FaceTecSessionActivity) getActivity();
        if (faceTecSessionActivity != null) {
            faceTecSessionActivity.mo8936E();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m12046r() {
        if (!this.f9625A) {
            this.f9628D.removeCallbacksAndMessages((Object) null);
            this.f9657z = C2904e.UPLOAD_STARTED;
            m12002b(false);
            this.f9628D.postDelayed(new C2792ao.C2793e(new C3725zd(this)), this.f9654w ? 8000 : 6000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m12048s() {
        C2829bc bcVar = (C2829bc) getActivity();
        if (bcVar != null) {
            bcVar.mo8930r();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final RelativeLayout mo9036c() {
        return this.f9650s;
    }

    /* renamed from: b */
    private void m12002b(boolean z) {
        this.f9628D.removeCallbacksAndMessages((Object) null);
        m12004c(new C2792ao.C2793e(new C3704yd(this, z)));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ boolean m12009c(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f9641j.setAlpha(0.4f);
        } else if (motionEvent.getAction() == 3 || motionEvent.getX() < Utils.FLOAT_EPSILON || motionEvent.getX() > ((float) (this.f9641j.getWidth() + this.f9641j.getLeft() + 10)) || motionEvent.getY() < Utils.FLOAT_EPSILON || motionEvent.getY() > ((float) (this.f9641j.getHeight() + this.f9641j.getTop() + 10))) {
            this.f9641j.setAlpha(1.0f);
        } else if (motionEvent.getAction() == 1) {
            this.f9641j.setAlpha(1.0f);
            this.f9641j.performClick();
        }
        return true;
    }

    /* renamed from: b */
    private String m11996b(C2904e eVar, C2903b bVar) {
        if (!this.f9654w) {
            return C2923cy.m12206b(C2747R.string.FaceTec_result_facescan_upload_message);
        }
        if (FaceTecCustomization.f8596q == null) {
            return C2923cy.m12206b(C2747R.string.FaceTec_result_idscan_upload_message);
        }
        C2941dd ddVar = C2941dd.UNKNOWN;
        int i = C29024.f9661d[bVar.ordinal()];
        if (i == 2) {
            int i2 = C29024.f9660b[eVar.ordinal()];
            if (i2 == 1) {
                ddVar = C2941dd.IDSCAN_FRONT_SIDE_UPLOAD_STARTED;
            } else if (i2 == 2) {
                ddVar = C2941dd.IDSCAN_FRONT_SIDE_STILL_UPLOADING;
            } else if (i2 == 3) {
                ddVar = C2941dd.IDSCAN_FRONT_SIDE_UPLOAD_COMPLETE_AWAITING_RESPONSE;
            } else if (i2 == 4) {
                ddVar = C2941dd.IDSCAN_FRONT_SIDE_UPLOAD_COMPLETE_AWAITING_PROCESSING;
            }
        } else if (i == 3) {
            int i3 = C29024.f9660b[eVar.ordinal()];
            if (i3 == 1) {
                ddVar = C2941dd.IDSCAN_BACK_SIDE_UPLOAD_STARTED;
            } else if (i3 == 2) {
                ddVar = C2941dd.IDSCAN_BACK_SIDE_STILL_UPLOADING;
            } else if (i3 == 3) {
                ddVar = C2941dd.IDSCAN_BACK_SIDE_UPLOAD_COMPLETE_AWAITING_RESPONSE;
            } else if (i3 == 4) {
                ddVar = C2941dd.IDSCAN_BACK_SIDE_UPLOAD_COMPLETE_AWAITING_PROCESSING;
            }
        } else if (i == 4) {
            int i4 = C29024.f9660b[eVar.ordinal()];
            if (i4 == 1) {
                ddVar = C2941dd.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_STARTED;
            } else if (i4 == 2) {
                ddVar = C2941dd.IDSCAN_USER_CONFIRMED_INFO_STILL_UPLOADING;
            } else if (i4 == 3) {
                ddVar = C2941dd.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_COMPLETE_AWAITING_RESPONSE;
            } else if (i4 == 4) {
                ddVar = C2941dd.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_COMPLETE_AWAITING_PROCESSING;
            }
        } else if (i == 5) {
            int i5 = C29024.f9660b[eVar.ordinal()];
            if (i5 == 1) {
                ddVar = C2941dd.NFC_UPLOAD_STARTED;
            } else if (i5 == 2) {
                ddVar = C2941dd.NFC_STILL_UPLOADING;
            } else if (i5 == 3) {
                ddVar = C2941dd.NFC_UPLOAD_COMPLETE_AWAITING_RESPONSE;
            } else if (i5 == 4) {
                ddVar = C2941dd.NFC_UPLOAD_COMPLETE_AWAITING_PROCESSING;
            }
        } else if (i == 6) {
            int i6 = C29024.f9660b[eVar.ordinal()];
            if (i6 == 1) {
                ddVar = C2941dd.SKIPPED_NFC_UPLOAD_STARTED;
            } else if (i6 == 2) {
                ddVar = C2941dd.SKIPPED_NFC_STILL_UPLOADING;
            } else if (i6 == 3) {
                ddVar = C2941dd.SKIPPED_NFC_UPLOAD_COMPLETE_AWAITING_RESPONSE;
            } else if (i6 == 4) {
                ddVar = C2941dd.SKIPPED_NFC_UPLOAD_COMPLETE_AWAITING_PROCESSING;
            }
        }
        String c = C2938dc.m12377c(ddVar);
        if (c != null) {
            return c;
        }
        if (eVar == C2904e.UPLOAD_COMPLETE_AWAITING_PROCESSING) {
            return m11996b(C2904e.UPLOAD_COMPLETE_AWAITING_RESPONSE, bVar);
        }
        if (eVar == C2904e.UPLOAD_COMPLETE_AWAITING_RESPONSE || eVar == C2904e.STILL_UPLOADING) {
            return m11996b(C2904e.UPLOAD_STARTED, bVar);
        }
        if (!this.f9654w) {
            return C2923cy.m12206b(C2747R.string.FaceTec_result_facescan_upload_message);
        }
        if (bVar == C2903b.NFC) {
            return C2923cy.m12206b(C2747R.string.FaceTec_result_nfc_upload_message);
        }
        return C2923cy.m12206b(C2747R.string.FaceTec_result_idscan_upload_message);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ boolean m12020e(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f9647p.setAlpha(0.4f);
        } else if (motionEvent.getAction() == 3 || motionEvent.getX() < Utils.FLOAT_EPSILON || motionEvent.getX() > ((float) (this.f9647p.getWidth() + this.f9647p.getLeft() + 10)) || motionEvent.getY() < Utils.FLOAT_EPSILON || motionEvent.getY() > ((float) (this.f9647p.getHeight() + 10))) {
            this.f9647p.setAlpha(1.0f);
        } else if (motionEvent.getAction() == 1) {
            this.f9647p.performClick();
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m12025g(Runnable runnable) {
        RelativeLayout relativeLayout = this.f9642k;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: d */
    private long m12010d() {
        if (this.f9626B != -1) {
            long nanoTime = (System.nanoTime() / 1000000) - this.f9626B;
            if (nanoTime < 1000) {
                return 1000 - nanoTime;
            }
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m12030j() {
        if (!this.f9625A) {
            this.f9628D.removeCallbacksAndMessages((Object) null);
            this.f9657z = C2904e.STILL_UPLOADING;
            m12002b(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m11994a(C2792ao.C2793e eVar, Animator animator) {
        if (eVar != null) {
            eVar.run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m11992a() {
        this.f9640i.setImageDrawable(this.f9638g);
        C29011 r0 = new Animatable2Compat$AnimationCallback() {
            public final void onAnimationEnd(Drawable drawable) {
                C2900cm.this.mo8844e(new C3684xe(this));
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m12065a() {
                AnimatedVectorDrawableCompat animatedVectorDrawableCompat = C2900cm.this.f9638g;
                if (animatedVectorDrawableCompat != null) {
                    animatedVectorDrawableCompat.start();
                }
            }
        };
        this.f9630H = r0;
        this.f9638g.mo6269d(r0);
        this.f9638g.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m12014d(boolean z) {
        if (this.f9637f != null) {
            String b = m11996b(this.f9657z, this.f9627C);
            if (!b.equals(this.f9637f.getText().toString())) {
                if (!z) {
                    this.f9637f.setText(b);
                    this.f9626B = System.nanoTime() / 1000000;
                    return;
                }
                this.f9626B = (System.nanoTime() / 1000000) + 1000;
                this.f9637f.animate().alpha(Utils.FLOAT_EPSILON).setDuration(500).setListener((Animator.AnimatorListener) null).withEndAction(new C2792ao.C2793e(new C3485od(this))).start();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m12006c(String str) {
        if (!this.f9625A) {
            ProgressBar progressBar = this.f9643l;
            if (progressBar == null || ((double) (((float) progressBar.getProgress()) / ((float) this.f9643l.getMax()))) < 0.9d) {
                this.f9637f.setText(str);
                this.f9626B = System.nanoTime() / 1000000;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo9041e(String str) {
        if (this.f9637f != null && !this.f9655x) {
            m12004c(new C2792ao.C2793e(new C3618ud(this, str)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m11995a(Runnable runnable, Animator animator) {
        mo8844e(new C3506pd(this, runnable));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m12019e(boolean z, Runnable runnable, boolean z2) {
        if (z) {
            m12018e(true, new C2792ao.C2793e(runnable));
        } else if (z2) {
            C2792ao.C2793e eVar = new C2792ao.C2793e(runnable);
            if (getActivity() != null) {
                int aW = C2938dc.m12281aW();
                int bf = C2938dc.m12351bf();
                if (bf == 0) {
                    bf = C2747R.C2748drawable.facetec_internal_warning;
                }
                mo8844e(new C3641vd(this, aW != 0, aW, bf, eVar));
            }
        } else if (this.f9654w) {
            m12018e(false, new C2792ao.C2793e(runnable));
        } else {
            mo9040d((Runnable) new C2792ao.C2793e(runnable));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9034a(Runnable runnable) {
        this.f9633b.animate().alpha(Utils.FLOAT_EPSILON).setDuration(800).setStartDelay(0).setListener((Animator.AnimatorListener) null).withEndAction(new C2792ao.C2793e(runnable)).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo9037c(float f) {
        ProgressBar progressBar = this.f9643l;
        if (progressBar != null) {
            float progress = ((float) progressBar.getProgress()) / ((float) this.f9643l.getMax());
            if (f <= 1.0f && progress < f) {
                if (f == 1.0f && !this.f9656y) {
                    this.f9656y = true;
                    if (this.f9655x) {
                        this.f9628D.post(new C2792ao.C2793e(new C3548rd(this)));
                    }
                }
                float f2 = (f * 10000.0f) - 1000.0f;
                if (f2 > ((float) this.f9643l.getProgress())) {
                    ObjectAnimator objectAnimator = this.f9648q;
                    if (objectAnimator != null) {
                        objectAnimator.end();
                        this.f9648q = null;
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        this.f9643l.setProgress(Math.round(f2), true);
                    } else {
                        this.f9643l.setProgress(Math.round(f2));
                    }
                }
                this.f9652u.removeCallbacks(this.f9631I);
                this.f9652u.postDelayed(this.f9631I, 600000);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m12012d(C2792ao.C2793e eVar) {
        this.f9643l.animate().alpha(Utils.FLOAT_EPSILON).setDuration(500).setListener((Animator.AnimatorListener) null).withEndAction(eVar).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo9040d(Runnable runnable) {
        if (getActivity() != null) {
            mo8844e(new C3724zc(this, runnable));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m12017e(C2792ao.C2793e eVar, Animator animator) {
        this.f9645n.animate().alpha(1.0f).setDuration(1500).setStartDelay(0).setListener((Animator.AnimatorListener) null).start();
        C2792ao.m10856a(eVar, 2500);
    }

    /* renamed from: e */
    private void m12018e(boolean z, C2792ao.C2793e eVar) {
        if (getActivity() != null) {
            int aM = z ? C2938dc.m12271aM() : C2938dc.m12272aN();
            boolean z2 = aM != 0;
            int bd = z ? C2938dc.m12349bd() : C2938dc.m12353bh();
            boolean z3 = bd != 0;
            int bg = z ? C2938dc.m12352bg() : C2938dc.m12356bk();
            if (z2 || z3) {
                this.f9646o.setImageDrawable((Drawable) null);
                this.f9646o.clearColorFilter();
                this.f9646o.invalidate();
            }
            mo8844e(new C3619ue(this, z3, bd, z2, aM, z, false, bg, eVar));
        }
    }

    /* renamed from: c */
    private void m12004c(C2792ao.C2793e eVar) {
        this.f9628D.postDelayed(eVar, m12010d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo9039c(boolean z, boolean z2, String str, Runnable runnable) {
        if (getActivity() != null) {
            this.f9652u.removeCallbacks(this.f9631I);
            this.f9628D.removeCallbacksAndMessages((Object) null);
            if (!this.f9654w) {
                if (str == null) {
                    str = C2923cy.m12206b(C2747R.string.FaceTec_result_success_message);
                }
                this.f9645n.setText(str);
                if (z) {
                    this.f9637f.setContentDescription(str);
                }
            } else if (z) {
                if (str == null) {
                    str = C2923cy.m12206b(C2747R.string.FaceTec_result_success_message);
                }
                this.f9645n.setText(str);
            } else {
                if (str == null) {
                    str = C2923cy.m12206b(C2747R.string.FaceTec_result_idscan_unsuccess_message);
                }
                this.f9645n.setText(str);
            }
            this.f9625A = true;
            m12004c(new C2792ao.C2793e(new C3549re(this, z, runnable, z2)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m12015e() {
        this.f9628D.removeCallbacksAndMessages((Object) null);
        this.f9625A = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m12008c(boolean z, Runnable runnable, boolean z2) {
        m11999b(new C2792ao.C2793e(new C3216ie(this, z, runnable, z2)));
    }

    /* renamed from: b */
    private void m11999b(C2792ao.C2793e eVar) {
        ProgressBar progressBar = this.f9643l;
        if (progressBar == null || progressBar.getProgress() == this.f9643l.getMax() || !FaceTecSDK.f8630e.f8603f.showUploadProgressBar) {
            eVar.run();
        } else {
            mo8844e(new C3215id(this, eVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m12007c(boolean z, int i, int i2, C2792ao.C2793e eVar) {
        this.f9633b.setVisibility(0);
        this.f9646o.setImageDrawable((Drawable) null);
        this.f9646o.clearColorFilter();
        this.f9646o.invalidate();
        this.f9644m.clearColorFilter();
        this.f9644m.invalidate();
        if (z) {
            this.f9644m.setImageDrawable(C2810ax.m10990b(getActivity(), i));
            ((AnimatedVectorDrawableCompat) this.f9644m.getDrawable()).start();
        } else {
            this.f9644m.setImageDrawable(C0767a.m2895e(getActivity(), i2));
        }
        RelativeLayout relativeLayout = this.f9650s;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, "alpha", new float[]{relativeLayout.getAlpha(), 0.0f});
        RelativeLayout relativeLayout2 = this.f9633b;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(relativeLayout2, "alpha", new float[]{relativeLayout2.getAlpha(), 1.0f});
        ofFloat2.setDuration(800);
        ofFloat.setDuration(800);
        ofFloat.addListener(new C3527qd(this, eVar));
        ofFloat2.start();
        ofFloat.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo9035b(boolean z, String str, Runnable runnable) {
        mo9039c(z, false, str, runnable);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m11997b() {
        this.f9629G = C2810ax.m10990b(getActivity(), C2747R.C2748drawable.facetec_animated_activity_indicator_vector_drawable);
        this.f9640i.setColorFilter(C2938dc.m12237P(), PorterDuff.Mode.SRC_IN);
        this.f9640i.setImageDrawable(this.f9629G);
        this.f9629G.start();
        this.f9640i.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m12003b(boolean z, int i, boolean z2, int i2, boolean z3, boolean z4, int i3, C2792ao.C2793e eVar) {
        Activity activity;
        this.f9633b.setVisibility(0);
        if (z) {
            this.f9644m.clearColorFilter();
            this.f9644m.invalidate();
            activity = getActivity();
        } else {
            if (z2) {
                this.f9646o.setImageResource(i2);
                this.f9646o.animate().alpha(Utils.FLOAT_EPSILON).scaleX(1.0f).scaleY(1.0f).setDuration(0).setStartDelay(0).setListener((Animator.AnimatorListener) null).start();
                this.f9646o.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(1000).setStartDelay(0).setInterpolator(new DecelerateInterpolator()).setListener((Animator.AnimatorListener) null).start();
            } else {
                this.f9646o.setImageDrawable(C2810ax.m10990b(getActivity(), C2747R.C2748drawable.facetec_animated_result_background));
                ((AnimatedVectorDrawableCompat) this.f9646o.getDrawable()).start();
            }
            activity = getActivity();
            i = z3 ? C2747R.C2748drawable.facetec_animated_success_foreground : C2747R.C2748drawable.facetec_animated_unsuccess_foreground;
        }
        this.f9644m.setImageDrawable(C2810ax.m10990b(activity, i));
        ((AnimatedVectorDrawableCompat) this.f9644m.getDrawable()).start();
        RelativeLayout relativeLayout = this.f9650s;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, "alpha", new float[]{relativeLayout.getAlpha(), 0.0f});
        RelativeLayout relativeLayout2 = this.f9633b;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(relativeLayout2, "alpha", new float[]{relativeLayout2.getAlpha(), 1.0f});
        ofFloat2.setDuration(800);
        ofFloat.setDuration(800);
        ofFloat.addListener(new C3683xd(this, eVar));
        ofFloat2.start();
        ofFloat.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo9038c(Runnable runnable) {
        this.f9647p.animate().alpha(Utils.FLOAT_EPSILON).setDuration(800).setListener((Animator.AnimatorListener) null).start();
        this.f9633b.animate().alpha(Utils.FLOAT_EPSILON).setDuration(800).setListener((Animator.AnimatorListener) null).start();
        this.f9637f.animate().alpha(Utils.FLOAT_EPSILON).setDuration(800).setListener((Animator.AnimatorListener) null).start();
        this.f9640i.animate().alpha(Utils.FLOAT_EPSILON).setDuration(800).setListener((Animator.AnimatorListener) null).withEndAction(new C2792ao.C2793e(new C3486oe(this, runnable))).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m12000b(C2792ao.C2793e eVar, Animator animator) {
        Animatable2Compat$AnimationCallback animatable2Compat$AnimationCallback;
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = this.f9638g;
        if (!(animatedVectorDrawableCompat == null || (animatable2Compat$AnimationCallback = this.f9630H) == null)) {
            animatedVectorDrawableCompat.mo6284h(animatable2Compat$AnimationCallback);
            this.f9638g.stop();
            this.f9638g = null;
            this.f9630H = null;
        }
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat2 = this.f9629G;
        if (animatedVectorDrawableCompat2 != null) {
            animatedVectorDrawableCompat2.stop();
            this.f9629G = null;
        }
        this.f9645n.animate().alpha(1.0f).setDuration(1500).setStartDelay(0).setListener((Animator.AnimatorListener) null).start();
        C2792ao.m10856a(eVar, 2500);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m12001b(Runnable runnable) {
        this.f9647p.setVisibility(8);
        this.f9633b.setVisibility(8);
        this.f9637f.setVisibility(8);
        this.f9640i.setVisibility(4);
        this.f9632a.setAlpha(Utils.FLOAT_EPSILON);
        this.f9650s.setAlpha(Utils.FLOAT_EPSILON);
        this.f9650s.setVisibility(0);
        this.f9632a.setVisibility(0);
        this.f9639h.setVisibility(0);
        runnable.run();
    }
}

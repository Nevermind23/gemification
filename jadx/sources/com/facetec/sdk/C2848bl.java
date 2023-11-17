package com.facetec.sdk;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0767a;
import com.facetec.sdk.C2792ao;
import com.facetec.sdk.C2846bk;
import com.facetec.sdk.C2888cg;
import com.facetec.sdk.C2910cr;
import com.facetec.sdk.FaceTecCancelButtonCustomization;
import com.github.mikephil.charting.utils.Utils;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.facetec.sdk.bl */
public final class C2848bl extends C2792ao {

    /* renamed from: A */
    private LinearLayout f9244A;

    /* renamed from: B */
    private RelativeLayout f9245B;

    /* renamed from: C */
    private LinearLayout f9246C;

    /* renamed from: D */
    private LinearLayout f9247D;

    /* renamed from: E */
    private RelativeLayout f9248E;

    /* renamed from: F */
    private View f9249F;

    /* renamed from: G */
    private ImageView f9250G;

    /* renamed from: H */
    private RelativeLayout f9251H;

    /* renamed from: I */
    private RelativeLayout f9252I;

    /* renamed from: J */
    private RelativeLayout f9253J;

    /* renamed from: K */
    private RelativeLayout f9254K;

    /* renamed from: L */
    private LinearLayout f9255L;

    /* renamed from: M */
    private ImageView f9256M;

    /* renamed from: N */
    private RelativeLayout f9257N;

    /* renamed from: O */
    private boolean f9258O = false;

    /* renamed from: P */
    private RelativeLayout f9259P;

    /* renamed from: Q */
    private boolean f9260Q = false;

    /* renamed from: R */
    private boolean f9261R = false;

    /* renamed from: S */
    private boolean f9262S = false;

    /* renamed from: T */
    private boolean f9263T = false;

    /* renamed from: U */
    private C2831bd f9264U;

    /* renamed from: V */
    private Handler f9265V;

    /* renamed from: W */
    private boolean f9266W = false;

    /* renamed from: X */
    private C2783aj f9267X;

    /* renamed from: Y */
    private Timer f9268Y;

    /* renamed from: Z */
    private boolean f9269Z;

    /* renamed from: a */
    C2983e f9270a;

    /* renamed from: aa */
    private C2910cr f9271aa;

    /* renamed from: ab */
    private FrameLayout f9272ab;

    /* renamed from: ac */
    private Handler f9273ac;

    /* renamed from: af */
    private TimerTask f9274af = new C2936da(new C3499p6(this));

    /* renamed from: ag */
    private boolean f9275ag;

    /* renamed from: b */
    C2983e f9276b;

    /* renamed from: c */
    ImageView f9277c;

    /* renamed from: d */
    C2983e f9278d;

    /* renamed from: e */
    C2983e f9279e;

    /* renamed from: f */
    boolean f9280f = false;

    /* renamed from: g */
    boolean f9281g = false;

    /* renamed from: h */
    C2851bm f9282h;

    /* renamed from: i */
    final C2888cg.C2894e f9283i = new C2761a7(this);

    /* renamed from: j */
    C2850d f9284j = C2850d.FRONT;

    /* renamed from: k */
    private C2836be f9285k;

    /* renamed from: l */
    private RelativeLayout f9286l;

    /* renamed from: m */
    private C2846bk f9287m;

    /* renamed from: n */
    private RelativeLayout f9288n;

    /* renamed from: o */
    private RelativeLayout f9289o;

    /* renamed from: p */
    private RelativeLayout f9290p;

    /* renamed from: q */
    private TextView f9291q;

    /* renamed from: r */
    private TextView f9292r;

    /* renamed from: s */
    private TextView f9293s;

    /* renamed from: t */
    private RelativeLayout f9294t;

    /* renamed from: u */
    private ImageView f9295u;

    /* renamed from: v */
    private TextView f9296v;

    /* renamed from: w */
    private ImageView f9297w;

    /* renamed from: x */
    private LinearLayout f9298x;

    /* renamed from: y */
    private ImageView f9299y;

    /* renamed from: z */
    private RelativeLayout f9300z;

    /* renamed from: com.facetec.sdk.bl$4 */
    static /* synthetic */ class C28494 {

        /* renamed from: a */
        static final /* synthetic */ int[] f9301a;

        /* renamed from: b */
        static final /* synthetic */ int[] f9302b;

        /* renamed from: d */
        static final /* synthetic */ int[] f9303d;

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0068 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0072 */
        static {
            /*
                com.facetec.sdk.cf[] r0 = com.facetec.sdk.C2887cf.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9301a = r0
                r1 = 1
                com.facetec.sdk.cf r2 = com.facetec.sdk.C2887cf.KEEP_SCANNING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f9301a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facetec.sdk.cf r3 = com.facetec.sdk.C2887cf.END_SCAN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f9301a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facetec.sdk.cf r4 = com.facetec.sdk.C2887cf.PRESENT_USER_HELP_BUTTON     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.facetec.sdk.ce[] r3 = com.facetec.sdk.C2886ce.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f9302b = r3
                com.facetec.sdk.ce r4 = com.facetec.sdk.C2886ce.ID_IMAGE_HOLD_STEADY     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r3 = f9302b     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.facetec.sdk.ce r4 = com.facetec.sdk.C2886ce.ID_IMAGE_FACE_NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f9302b     // Catch:{ NoSuchFieldError -> 0x004d }
                com.facetec.sdk.ce r4 = com.facetec.sdk.C2886ce.ID_IMAGE_BLURRY     // Catch:{ NoSuchFieldError -> 0x004d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                com.facetec.sdk.FaceTecCancelButtonCustomization$ButtonLocation[] r3 = com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f9303d = r3
                com.facetec.sdk.FaceTecCancelButtonCustomization$ButtonLocation r4 = com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.TOP_LEFT     // Catch:{ NoSuchFieldError -> 0x005e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r1 = f9303d     // Catch:{ NoSuchFieldError -> 0x0068 }
                com.facetec.sdk.FaceTecCancelButtonCustomization$ButtonLocation r3 = com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.TOP_RIGHT     // Catch:{ NoSuchFieldError -> 0x0068 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0068 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0068 }
            L_0x0068:
                int[] r0 = f9303d     // Catch:{ NoSuchFieldError -> 0x0072 }
                com.facetec.sdk.FaceTecCancelButtonCustomization$ButtonLocation r1 = com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM     // Catch:{ NoSuchFieldError -> 0x0072 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0072 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0072 }
            L_0x0072:
                int[] r0 = f9303d     // Catch:{ NoSuchFieldError -> 0x007d }
                com.facetec.sdk.FaceTecCancelButtonCustomization$ButtonLocation r1 = com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.DISABLED     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2848bl.C28494.<clinit>():void");
        }
    }

    /* renamed from: com.facetec.sdk.bl$d */
    enum C2850d {
        FRONT,
        BACK
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void m11470N() {
        C2831bd bdVar = this.f9264U;
        if (bdVar != null) {
            bdVar.mo8955z();
        }
        if (this.f9269Z) {
            int i = 1;
            boolean z = !this.f9263T;
            C2910cr crVar = new C2910cr();
            this.f9271aa = crVar;
            crVar.f9722d = (C2910cr.C2912e) getActivity();
            getChildFragmentManager().beginTransaction().replace(C2747R.C2749id.securingCameraFragmentContainer, this.f9271aa).addToBackStack((String) null).commitAllowingStateLoss();
            int i2 = 0;
            this.f9272ab.setVisibility(0);
            if (z) {
                i2 = 800;
            } else {
                i = 500;
            }
            this.f9272ab.animate().alpha(1.0f).setDuration((long) i).setStartDelay(0).setListener((Animator.AnimatorListener) null).withEndAction(new C2792ao.C2793e(new C3059f7(this, i2)));
            return;
        }
        m11485f();
    }

    /* renamed from: a */
    private void m11472a(boolean z) {
        this.f9258O = !z;
        C2923cy.m12209e(this.f9293s, C2747R.string.FaceTec_idscan_review_id_front_instruction_message);
        if (getActivity() != null) {
            getActivity().runOnUiThread(new C3520q6(this, z));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ boolean m11476b(View view, MotionEvent motionEvent) {
        if (this.f9258O && motionEvent.getAction() == 0 && this.f9287m.mo8964e().contains(motionEvent.getX(), motionEvent.getY())) {
            try {
                if (this.f9267X != null) {
                    m11501m();
                    this.f9275ag = true;
                    this.f9267X.mo8815d((ViewGroup) this.f9251H);
                    this.f9285k.mo8958c(motionEvent.getX(), motionEvent.getY());
                }
            } catch (Exception unused) {
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo8973e(boolean z) {
        this.f9269Z = z;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f9264U = (C2831bd) activity;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C2747R.layout.facetec_idscan_fragment, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        mo8974g();
        m11501m();
        m11507p();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        View view2 = view;
        super.onViewCreated(view, bundle);
        this.f9273ac = new Handler();
        this.f9286l = (RelativeLayout) view2.findViewById(C2747R.C2749id.idTypeLayout);
        this.f9290p = (RelativeLayout) view2.findViewById(C2747R.C2749id.cameraLayout);
        this.f9287m = (C2846bk) view2.findViewById(C2747R.C2749id.idCaptureFrameView);
        this.f9293s = (TextView) view2.findViewById(C2747R.C2749id.reviewInstructionsText);
        this.f9292r = (TextView) view2.findViewById(C2747R.C2749id.captureInstructionsText);
        this.f9291q = (TextView) view2.findViewById(C2747R.C2749id.tapToFocusMessageText);
        this.f9299y = (ImageView) view2.findViewById(C2747R.C2749id.reviewImageView);
        this.f9276b = (C2983e) view2.findViewById(C2747R.C2749id.takePictureButton);
        this.f9270a = (C2983e) view2.findViewById(C2747R.C2749id.retakePictureButton);
        this.f9279e = (C2983e) view2.findViewById(C2747R.C2749id.acceptPictureButton);
        this.f9245B = (RelativeLayout) view2.findViewById(C2747R.C2749id.shutterEffectContainer);
        this.f9246C = (LinearLayout) view2.findViewById(C2747R.C2749id.reviewButtonsContainer);
        this.f9250G = (ImageView) view2.findViewById(C2747R.C2749id.flashButton);
        this.f9288n = (RelativeLayout) view2.findViewById(C2747R.C2749id.parentLayout);
        this.f9251H = (RelativeLayout) view2.findViewById(C2747R.C2749id.cameraContainer);
        this.f9289o = (RelativeLayout) view2.findViewById(C2747R.C2749id.parentInterfaceLayout);
        this.f9277c = (ImageView) view2.findViewById(C2747R.C2749id.cancelButton);
        this.f9278d = (C2983e) view2.findViewById(C2747R.C2749id.continueButton);
        this.f9296v = (TextView) view2.findViewById(C2747R.C2749id.selectionHeader);
        this.f9297w = (ImageView) view2.findViewById(C2747R.C2749id.selectionBrandingImage);
        this.f9255L = (LinearLayout) view2.findViewById(C2747R.C2749id.selectionButtonLayout);
        this.f9253J = (RelativeLayout) view2.findViewById(C2747R.C2749id.interfaceButtonLayout);
        this.f9257N = (RelativeLayout) view2.findViewById(C2747R.C2749id.idTypeLayoutBackground);
        this.f9254K = (RelativeLayout) view2.findViewById(C2747R.C2749id.idTypeLayoutContent);
        this.f9298x = (LinearLayout) view2.findViewById(C2747R.C2749id.selectionBrandingImageLayout);
        this.f9294t = (RelativeLayout) view2.findViewById(C2747R.C2749id.cameraTransitionView);
        this.f9244A = (LinearLayout) view2.findViewById(C2747R.C2749id.selectionDocumentImageLayout);
        this.f9295u = (ImageView) view2.findViewById(C2747R.C2749id.selectionDocumentImage);
        this.f9300z = (RelativeLayout) view2.findViewById(C2747R.C2749id.instructionsContainer);
        this.f9247D = (LinearLayout) view2.findViewById(C2747R.C2749id.selectionMainLayout);
        this.f9285k = (C2836be) view2.findViewById(C2747R.C2749id.focusAnimationView);
        this.f9249F = view2.findViewById(C2747R.C2749id.reviewButtonSeparator);
        this.f9248E = (RelativeLayout) view2.findViewById(C2747R.C2749id.focusMessageContainer);
        this.f9252I = (RelativeLayout) view2.findViewById(C2747R.C2749id.croppedFrame);
        this.f9272ab = (FrameLayout) view2.findViewById(C2747R.C2749id.securingCameraFragmentContainer);
        this.f9256M = (ImageView) view2.findViewById(C2747R.C2749id.mainBrandingImageView);
        this.f9259P = (RelativeLayout) view2.findViewById(C2747R.C2749id.mainTransitionView);
        FaceTecIDScanCustomization faceTecIDScanCustomization = FaceTecSDK.f8630e.f8605h;
        int i5 = faceTecIDScanCustomization.selectionScreenBrandingImage;
        if (i5 == 0) {
            i5 = C2747R.C2748drawable.facetec_branding_logo_id_check;
        }
        int i6 = faceTecIDScanCustomization.selectionScreenDocumentImage;
        if (i6 == 0) {
            i6 = C2747R.C2748drawable.facetec_document;
        }
        int i7 = faceTecIDScanCustomization.activeTorchButtonImage;
        if (i7 == 0) {
            i7 = C2747R.C2748drawable.facetec_active_torch;
        }
        int i8 = faceTecIDScanCustomization.inactiveTorchButtonImage;
        if (i8 == 0) {
            i8 = C2747R.C2748drawable.facetec_inactive_torch;
        }
        faceTecIDScanCustomization.selectionScreenDocumentImage = i6;
        faceTecIDScanCustomization.selectionScreenBrandingImage = i5;
        faceTecIDScanCustomization.activeTorchButtonImage = i7;
        faceTecIDScanCustomization.inactiveTorchButtonImage = i8;
        boolean z3 = getArguments().getBoolean("overzoomedDocument");
        this.f9266W = getArguments().getBoolean("isStandaloneIDScan");
        C2938dc.m12424h((View) this.f9288n);
        C2938dc.m12424h((View) this.f9259P);
        this.f9296v.setTypeface(FaceTecSDK.f8630e.f8605h.headerFont);
        this.f9293s.setTypeface(FaceTecSDK.f8630e.f8605h.subtextFont);
        this.f9292r.setTypeface(FaceTecSDK.f8630e.f8605h.subtextFont);
        this.f9291q.setTypeface(FaceTecSDK.f8630e.f8605h.captureScreenFocusMessageFont);
        this.f9296v.setLineSpacing(Utils.FLOAT_EPSILON, 1.1f);
        C2923cy.m12209e(this.f9296v, C2747R.string.FaceTec_idscan_type_selection_header);
        C2923cy.m12209e(this.f9278d, C2747R.string.FaceTec_action_continue);
        float c = C2938dc.m12372c() * C2938dc.m12404e();
        this.f9256M.getLayoutParams().height = Math.round(C2810ax.m10988b(18) * c);
        ((RelativeLayout.LayoutParams) this.f9256M.getLayoutParams()).topMargin = C2938dc.m12393d();
        Drawable e = C0767a.m2895e(this.f9264U, C2938dc.m12395d((Context) getActivity()));
        Drawable e2 = C0767a.m2895e(this.f9264U, C2938dc.m12407e((Context) getActivity()));
        if (this.f9266W) {
            this.f9256M.setImageDrawable(e);
            this.f9256M.setVisibility(0);
        } else if (FaceTecSDK.f8630e.f8605h.showFaceMatchToIDBrandingImage) {
            this.f9256M.setImageDrawable(e2);
            this.f9256M.setVisibility(0);
        } else {
            this.f9256M.setVisibility(8);
        }
        int round = Math.round(C2810ax.m10988b(78) * c);
        int aD = C2938dc.m12262aD();
        if (!FaceTecSDK.f8630e.f8605h.showSelectionScreenBrandingImage || aD == 0) {
            this.f9297w.setVisibility(8);
            round = 0;
            z = false;
            i = 0;
        } else {
            if (C2938dc.m12354bi()) {
                i = Math.round((C2810ax.m10988b(35) * c) + (((float) C2938dc.m12393d()) / 2.0f));
            } else {
                i = 0;
            }
            this.f9297w.setImageDrawable(C0767a.m2895e(this.f9264U, aD));
            this.f9297w.setVisibility(0);
            z = true;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f9298x.getLayoutParams();
        layoutParams.height = round;
        layoutParams.topMargin = i;
        this.f9298x.setLayoutParams(layoutParams);
        int aE = C2938dc.m12263aE();
        if (z || !FaceTecSDK.f8630e.f8605h.showSelectionScreenDocumentImage || aE == 0) {
            this.f9295u.setVisibility(8);
            i3 = 0;
            i2 = 0;
            z2 = false;
        } else {
            i3 = Math.round(C2810ax.m10988b(78) * c);
            i2 = Math.round((float) C2938dc.m12393d());
            this.f9295u.setImageDrawable(C0767a.m2895e(this.f9264U, aE));
            this.f9295u.setVisibility(0);
            z2 = true;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f9244A.getLayoutParams();
        layoutParams2.height = i3;
        if (z2) {
            i4 = i2;
        } else {
            i4 = 0;
        }
        layoutParams2.topMargin = i4;
        layoutParams2.bottomMargin = i2;
        this.f9244A.setLayoutParams(layoutParams2);
        Drawable e3 = C0767a.m2895e(this.f9264U, C2747R.C2748drawable.facetec_idscan_capture_instructions_background);
        C2938dc.m12315b(this.f9264U, this.f9292r, e3, C2938dc.m12260aB());
        C2938dc.m12399d(this.f9264U, this.f9292r, e3, C2938dc.m12408e((Context) this.f9264U, C2938dc.m12308ax()), (int) (C2810ax.m10988b(C2938dc.m12449r()) * C2938dc.m12404e()), (double) ((int) (C2810ax.m10988b(C2938dc.m12224C()) * C2938dc.m12404e())));
        this.f9292r.setBackground(e3);
        Drawable e4 = C0767a.m2895e(this.f9264U, C2747R.C2748drawable.facetec_idscan_review_instructions_background);
        C2938dc.m12315b(this.f9264U, this.f9293s, e4, C2938dc.m12259aA());
        C2938dc.m12399d(this.f9264U, this.f9293s, e4, C2938dc.m12408e((Context) this.f9264U, C2938dc.m12310az()), (int) (C2810ax.m10988b(C2938dc.m12453t()) * C2938dc.m12404e()), (double) ((int) (C2810ax.m10988b(C2938dc.m12223B()) * C2938dc.m12404e())));
        this.f9293s.setBackground(e4);
        C2938dc.m12383c(this.f9296v);
        C2938dc.m12425h(this.f9292r);
        C2938dc.m12402d(this.f9293s);
        C2938dc.m12430i(this.f9291q);
        C2923cy.m12209e(this.f9291q, C2747R.string.FaceTec_idscan_capture_tap_to_focus_message);
        C2938dc.m12429i((View) this.f9257N);
        this.f9294t.setBackgroundColor(C2938dc.m12313b((Context) this.f9264U));
        this.f9276b.mo9154a();
        this.f9270a.mo9154a();
        this.f9279e.mo9154a();
        this.f9278d.mo9154a();
        C2923cy.m12209e(this.f9276b, C2747R.string.FaceTec_action_take_photo);
        C2923cy.m12209e(this.f9270a, C2747R.string.FaceTec_action_retake_photo);
        C2923cy.m12209e(this.f9279e, C2747R.string.FaceTec_action_accept_photo);
        if (C2938dc.m12354bi()) {
            this.f9277c.setImageDrawable(C0767a.m2895e(this.f9264U, C2938dc.m12266aH()));
            this.f9277c.setOnClickListener(new C3655w6(this));
            this.f9277c.setOnTouchListener(new C3676x6(this));
        }
        int i9 = C28494.f9303d[FaceTecSDK.f8630e.f8612o.f8592a.ordinal()];
        if (i9 == 2) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f9277c.getLayoutParams();
            layoutParams3.removeRule(20);
            layoutParams3.addRule(21);
            this.f9277c.setLayoutParams(layoutParams3);
        } else if (i9 == 3 || i9 == 4) {
            this.f9277c.setVisibility(8);
        }
        this.f9277c.getViewTreeObserver().addOnGlobalLayoutListener(new C3697y6(this));
        m11505o();
        if (!this.f9269Z) {
            m11465J();
            this.f9259P.setAlpha(1.0f);
            this.f9259P.setVisibility(0);
        }
        if (z3) {
            C2846bk bkVar = this.f9287m;
            bkVar.f9231d = C2846bk.C2847b.SMALL_FOR_OVERZOOMED;
            bkVar.m11427c();
            bkVar.f9230c.setStrokeWidth((float) Math.round((float) bkVar.f9228a));
            bkVar.f9229b = Math.round(C2810ax.m10988b(C2938dc.m12228G()) * C2938dc.m12404e());
            bkVar.f9236i = bkVar.f9232e;
            bkVar.mo8961b(true);
            bkVar.mo8960a();
        }
        Handler handler = new Handler(Looper.getMainLooper());
        this.f9265V = handler;
        handler.postDelayed(new C3718z6(this), 600000);
        mo8844e(new C2824b7(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m11449B() {
        this.f9250G.setImageResource(C2938dc.m12265aG());
        this.f9289o.setVisibility(0);
        this.f9292r.setVisibility(0);
        int d = C2938dc.m12393d();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9300z.getLayoutParams();
        float f = (float) d;
        layoutParams.topMargin = (int) ((this.f9287m.mo8964e().top - ((float) this.f9300z.getHeight())) - f);
        this.f9300z.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f9248E.getLayoutParams();
        layoutParams2.topMargin = (int) (this.f9287m.mo8964e().bottom + f);
        this.f9248E.setLayoutParams(layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f9252I.getLayoutParams();
        layoutParams3.height = (int) (((double) this.f9252I.getWidth()) / 1.59d);
        this.f9252I.setLayoutParams(layoutParams3);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void m11451C() {
        C2783aj ajVar = this.f9267X;
        if (ajVar != null) {
            ajVar.mo8831e((Runnable) new C3500p7(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m11453D() {
        this.f9264U.mo8952v();
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m11455E() {
        this.f9276b.mo9158c(true, true);
        this.f9250G.setEnabled(true);
        this.f9277c.setEnabled(true);
        this.f9281g = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m11457F() {
        this.f9272ab.setVisibility(8);
        getFragmentManager().beginTransaction().remove(this.f9271aa).commitAllowingStateLoss();
        this.f9271aa = null;
        m11485f();
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m11459G() {
        RelativeLayout relativeLayout = this.f9294t;
        if (relativeLayout != null) {
            relativeLayout.animate().alpha(Utils.FLOAT_EPSILON).setDuration(300).setInterpolator(new DecelerateInterpolator()).setListener((Animator.AnimatorListener) null).start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m11461H() {
        C2910cr crVar = this.f9271aa;
        if (crVar != null) {
            crVar.f9721c = true;
            crVar.mo9049e();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m11463I() {
        m11482d(false);
    }

    /* renamed from: c */
    static C2848bl m11477c(boolean z, boolean z2) {
        C2848bl blVar = new C2848bl();
        Bundle bundle = new Bundle();
        bundle.putBoolean("overzoomedDocument", z);
        bundle.putBoolean("isStandaloneIDScan", z2);
        blVar.setArguments(bundle);
        return blVar;
    }

    /* renamed from: f */
    private void m11485f() {
        boolean z = this.f9264U.f9167r == FaceTecIDScanNextStep.SELECTION_SCREEN && this.f9284j != C2850d.BACK && this.f9282h == null;
        if (getActivity() != null) {
            getActivity().runOnUiThread(new C3590t6(this, z));
        }
        C3555s.m13902c(C2913cs.ID_SCAN_START);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m11467K() {
        C2783aj ajVar = this.f9267X;
        if (ajVar != null) {
            ajVar.mo8812a(false, (ViewGroup) this.f9251H);
        }
    }

    /* renamed from: i */
    private void m11492i() {
        this.f9276b.mo9155a(new C3338l7(this));
        this.f9270a.mo9155a(new C3542r7(this));
        this.f9279e.mo9155a(new C3570s7(this));
        this.f9278d.mo9155a(new C3591t7(this));
        this.f9250G.setOnClickListener(new C3612u7(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m11496j(boolean z) {
        m11472a(false);
        int i = this.f9269Z ? 0 : 500;
        this.f9290p.setVisibility(0);
        this.f9286l.setVisibility(0);
        float b = C2810ax.m10988b(20) * C2938dc.m12372c() * C2938dc.m12404e();
        if (z) {
            this.f9247D.setTranslationY(-b);
            this.f9255L.setTranslationY(b);
            long j = (long) i;
            this.f9247D.animate().alpha(1.0f).translationY(Utils.FLOAT_EPSILON).setDuration(500).setStartDelay(j).setInterpolator(new DecelerateInterpolator()).setListener((Animator.AnimatorListener) null).start();
            this.f9255L.animate().alpha(1.0f).translationY(Utils.FLOAT_EPSILON).setDuration(500).setStartDelay(j).setInterpolator(new DecelerateInterpolator()).setListener((Animator.AnimatorListener) null).start();
        }
        m11492i();
        if (FaceTecSDK.f8630e.f8612o.f8592a == FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
            this.f9264U.mo8940b(500, i);
        } else if (FaceTecSDK.f8630e.f8612o.f8592a != FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
            this.f9277c.animate().alpha(1.0f).setDuration(500).setStartDelay((long) i).setInterpolator(new DecelerateInterpolator()).setListener((Animator.AnimatorListener) null).start();
        }
        this.f9259P.animate().alpha(Utils.FLOAT_EPSILON).setDuration(500).setStartDelay((long) i).setInterpolator(new DecelerateInterpolator()).setListener((Animator.AnimatorListener) null).start();
    }

    /* renamed from: k */
    private void m11497k() {
        m11501m();
        this.f9274af = new C2936da(new C3479o7(this));
        Timer timer = new Timer();
        this.f9268Y = timer;
        timer.scheduleAtFixedRate(this.f9274af, 6000, 6000);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m11499l() {
        if (this.f9267X == null) {
            m11474b(8);
            return;
        }
        this.f9279e.mo9158c(false, true);
        this.f9270a.mo9158c(false, true);
        this.f9277c.setEnabled(false);
        this.f9261R = false;
        this.f9250G.setImageResource(C2938dc.m12265aG());
        this.f9250G.setEnabled(false);
        m11507p();
        this.f9270a.mo9158c(false, true);
        this.f9279e.mo9158c(false, true);
        this.f9276b.mo9158c(false, true);
        if (getActivity() != null) {
            getActivity().runOnUiThread(new C3156g7(this));
        }
        this.f9287m.mo8962c(new C3187h7(this));
        C2920cv.m12196e(new C3209i7(this));
    }

    /* renamed from: m */
    private void m11501m() {
        Timer timer = this.f9268Y;
        if (timer != null) {
            timer.cancel();
            this.f9268Y = null;
        }
        TimerTask timerTask = this.f9274af;
        if (timerTask != null) {
            timerTask.cancel();
            this.f9274af = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m11503n() {
        C2888cg cgVar = this.f9264U.f9082b;
        if (cgVar != null) {
            this.f9278d.mo9158c(false, true);
            C2923cy.m12209e(this.f9292r, C2747R.string.FaceTec_idscan_capture_id_front_instruction_message);
            m11494j();
            m11509q();
            m11497k();
            this.f9281g = true;
            boolean a = C2954dn.m12491a(this.f9264U);
            C2829bc bcVar = (C2829bc) getActivity();
            try {
                cgVar.mo9011b(bcVar, a, ((C2831bd) getActivity()).f9157h);
                getActivity().runOnUiThread(new C2993e7(this));
            } catch (NullPointerException unused) {
                C2867c cVar = C2867c.PHOENIX_HANDLER_UNEXPECTED_NULL;
                StringBuilder sb = new StringBuilder("phoenixHandler is null unexpectedly. Check Activity State Info to see if session has finished");
                sb.append(C3555s.m13884a((Activity) bcVar));
                C3555s.m13898c((Context) bcVar, cVar, sb.toString());
            }
        }
    }

    /* renamed from: o */
    private void m11505o() {
        int round = Math.round((C2810ax.m10988b(C2938dc.m12456v()) * C2938dc.m12404e()) / 2.0f);
        this.f9290p.setPadding(round, round, round, round);
        this.f9299y.setPadding(round, round, round, round);
    }

    /* renamed from: p */
    private void m11507p() {
        Handler handler = this.f9265V;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f9265V = null;
        }
    }

    /* renamed from: q */
    private void m11509q() {
        m11507p();
        Handler handler = new Handler();
        this.f9265V = handler;
        handler.postDelayed(new C3456n7(this), 600000);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m11515t() {
        this.f9264U.mo8941b(FaceTecIDScanStatus.TIMED_OUT);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m11513s() {
        this.f9279e.mo9158c(true, true);
        this.f9270a.mo9158c(true, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m11517u() {
        String str;
        C2831bd bdVar = this.f9264U;
        if (bdVar.f9155f) {
            str = bdVar.f9163n;
        } else {
            str = C2888cg.f9550b;
        }
        C3555s.m13897c(getActivity(), this.f9267X.f8844h, false, this.f9284j, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m11519v() {
        if (!this.f9262S) {
            this.f9262S = true;
            float c = C2938dc.m12372c();
            float e = C2938dc.m12404e();
            int b = (int) (C2810ax.m10988b(35) * c * e);
            int b2 = (int) (C2810ax.m10988b(50) * c * e);
            int d = C2938dc.m12393d();
            float f = (float) d;
            float f2 = f / 2.0f;
            int round = Math.round(f2);
            int round2 = Math.round(f2);
            int i = (int) (20.0f * c * e);
            int f3 = C2938dc.m12415f();
            int i2 = (int) (c * 16.0f * e);
            int round3 = Math.round(f2);
            m11505o();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9255L.getLayoutParams();
            layoutParams.setMargins(d, 0, d, d);
            this.f9255L.setLayoutParams(layoutParams);
            this.f9255L.requestLayout();
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f9253J.getLayoutParams();
            layoutParams2.setMargins(d, 0, d, d);
            layoutParams2.height = b2;
            this.f9253J.setLayoutParams(layoutParams2);
            this.f9253J.requestLayout();
            this.f9278d.setLayoutParams(new LinearLayout.LayoutParams(-1, b2));
            this.f9278d.requestLayout();
            new LinearLayout.LayoutParams(-1, b2).setMargins(0, 0, 0, d);
            float e2 = (((float) Resources.getSystem().getDisplayMetrics().widthPixels) * C2938dc.m12404e()) - ((float) (d << 1));
            int i3 = (int) e2;
            this.f9255L.getLayoutParams().width = i3;
            this.f9255L.requestLayout();
            this.f9276b.getLayoutParams().width = i3;
            this.f9276b.requestLayout();
            float min = Math.min(Math.max((float) b2, e2 / 2.0f), (e2 - f) / 2.0f);
            this.f9249F.getLayoutParams().width = (int) ((((float) this.f9288n.getWidth()) - (min * 2.0f)) / 3.0f);
            int i4 = (int) min;
            this.f9279e.getLayoutParams().width = i4;
            this.f9270a.getLayoutParams().width = i4;
            ((LinearLayout.LayoutParams) this.f9279e.getLayoutParams()).weight = Utils.FLOAT_EPSILON;
            ((LinearLayout.LayoutParams) this.f9270a.getLayoutParams()).weight = Utils.FLOAT_EPSILON;
            this.f9279e.requestLayout();
            this.f9270a.requestLayout();
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f9277c.getLayoutParams();
            layoutParams3.setMargins(round, round, 0, round);
            layoutParams3.setMarginStart(round);
            layoutParams3.setMarginEnd(round);
            this.f9277c.setLayoutParams(layoutParams3);
            this.f9277c.setPadding(round, round, round, round);
            this.f9277c.getLayoutParams().height = b;
            this.f9277c.getLayoutParams().width = b;
            this.f9277c.requestLayout();
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f9250G.getLayoutParams();
            layoutParams4.width = -2;
            layoutParams4.height = -2;
            layoutParams4.setMargins(0, round, round, round);
            layoutParams4.setMarginStart(round);
            layoutParams4.setMarginEnd(round);
            this.f9250G.setLayoutParams(layoutParams4);
            this.f9250G.setPadding(round2, round2, round2, round2);
            this.f9250G.getLayoutParams().height = b;
            this.f9250G.getLayoutParams().width = b;
            this.f9250G.requestLayout();
            if (FaceTecSDK.f8630e.f8612o.f8592a == FaceTecCancelButtonCustomization.ButtonLocation.TOP_RIGHT) {
                ((RelativeLayout.LayoutParams) this.f9250G.getLayoutParams()).addRule(20);
            } else {
                ((RelativeLayout.LayoutParams) this.f9250G.getLayoutParams()).addRule(21);
            }
            float f4 = (float) i;
            this.f9278d.setTextSize(2, f4);
            this.f9279e.setTextSize(2, f4);
            this.f9270a.setTextSize(2, f4);
            this.f9276b.setTextSize(2, f4);
            this.f9296v.setTextSize(2, (float) f3);
            this.f9292r.setTextSize(2, f4);
            this.f9293s.setTextSize(2, f4);
            this.f9292r.setPadding(round3, round3, round3, round3);
            this.f9293s.setPadding(round3, round3, round3, round3);
            this.f9291q.setTextSize(2, (float) i2);
            int d2 = C2938dc.m12393d();
            LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) this.f9296v.getLayoutParams();
            layoutParams5.setMarginStart(d2);
            layoutParams5.setMarginEnd(d2);
            this.f9296v.setLayoutParams(layoutParams5);
            this.f9296v.requestLayout();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m11521w() {
        this.f9286l.animate().alpha(Utils.FLOAT_EPSILON).setDuration(300).setListener((Animator.AnimatorListener) null).withEndAction(new C3677x7(this)).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m11523x() {
        float b = C2810ax.m10988b(20) * C2938dc.m12372c() * C2938dc.m12404e();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f9253J, View.TRANSLATION_Y, new float[]{b}), ObjectAnimator.ofFloat(this.f9300z, View.TRANSLATION_Y, new float[]{-b})});
        animatorSet.setDuration(500);
        animatorSet.start();
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f9253J, View.ALPHA, new float[]{0.0f}), ObjectAnimator.ofFloat(this.f9300z, View.ALPHA, new float[]{0.0f}), ObjectAnimator.ofFloat(this.f9291q, View.ALPHA, new float[]{0.0f}), ObjectAnimator.ofFloat(this.f9250G, View.ALPHA, new float[]{0.0f}), ObjectAnimator.ofFloat(this.f9277c, View.ALPHA, new float[]{0.0f}), ObjectAnimator.ofFloat(this.f9256M, View.ALPHA, new float[]{0.0f}), ObjectAnimator.ofFloat(this.f9259P, View.ALPHA, new float[]{0.0f})});
        animatorSet2.setDuration(500);
        animatorSet2.start();
        ImageView imageView = this.f9264U.f9164o;
        if (imageView != null) {
            imageView.animate().alpha(Utils.FLOAT_EPSILON).setDuration(500).start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m11525y() {
        this.f9286l.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m11527z() {
        if (this.f9282h == C2851bm.BACK) {
            this.f9284j = C2850d.BACK;
            C2923cy.m12209e(this.f9292r, C2747R.string.FaceTec_idscan_capture_id_back_instruction_message);
        } else {
            this.f9284j = C2850d.FRONT;
            C2923cy.m12209e(this.f9292r, C2747R.string.FaceTec_idscan_capture_id_front_instruction_message);
        }
        this.f9294t.setAlpha(1.0f);
        this.f9254K.setVisibility(8);
        this.f9286l.setVisibility(4);
        this.f9290p.setVisibility(0);
        this.f9289o.setVisibility(0);
        m11472a(false);
        C2783aj ajVar = this.f9267X;
        if (ajVar == null) {
            m11474b(3);
            return;
        }
        ajVar.mo8817e();
        m11497k();
        C2885cd.m11849m(this.f9280f, false);
        this.f9273ac.postDelayed(new C3231j7(this), 800);
        m11494j();
        m11492i();
        this.f9259P.animate().alpha(Utils.FLOAT_EPSILON).setDuration(500).setStartDelay(0).setInterpolator(new DecelerateInterpolator()).setListener((Animator.AnimatorListener) null).withEndAction(new C3288k7(this)).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m11465J() {
        try {
            this.f9267X = (C2783aj) C2780ai.m10759a((ViewGroup) this.f9251H, (Activity) this.f9264U, true);
        } catch (C2778ah e) {
            C3330l.m13346d(e);
            C2831bd bdVar = this.f9264U;
            C2867c cVar = C2867c.CAMERA_ERROR;
            StringBuilder sb = new StringBuilder("IDScanCameraSetupError with message: ");
            sb.append(e.getMessage());
            C3555s.m13907d(bdVar, e, cVar, sb.toString(), false);
            C2831bd bdVar2 = this.f9264U;
            bdVar2.mo8946d(bdVar2.f9169t.getStatus(), FaceTecIDScanStatus.CAMERA_ERROR);
        }
        this.f9267X.mo8831e((Runnable) new C2792ao.C2793e(new C3635v7(this)));
        this.f9251H.setOnTouchListener(new C3656w7(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C2780ai mo8972e() {
        return this.f9267X;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo8974g() {
        C2783aj ajVar = this.f9267X;
        if (ajVar != null) {
            ajVar.mo8816d(false);
            ImageView imageView = this.f9250G;
            if (imageView != null) {
                imageView.setImageResource(C2938dc.m12265aG());
            }
        }
        this.f9261R = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m11483e(View view) {
        view.setEnabled(true);
        this.f9276b.mo9158c(true, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m11491h(boolean z) {
        int i;
        int i2 = 0;
        if (z) {
            i = 4;
        } else {
            this.f9291q.animate().alpha(1.0f).setDuration(100);
            this.f9256M.animate().alpha(1.0f).setDuration(100);
            i = 0;
            i2 = 4;
        }
        this.f9246C.setVisibility(i2);
        this.f9299y.setVisibility(i2);
        this.f9293s.setVisibility(i2);
        this.f9250G.setVisibility(i);
        if (this.f9280f) {
            this.f9276b.setVisibility(i);
        } else {
            this.f9276b.setVisibility(4);
        }
        this.f9292r.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m11484e(C2887cf cfVar, C2886ce ceVar) {
        int i = C28494.f9301a[cfVar.ordinal()];
        if (i == 1) {
            this.f9260Q = false;
            if (C28494.f9302b[ceVar.ordinal()] == 3 && this.f9275ag) {
                this.f9267X.mo8812a(true, (ViewGroup) this.f9251H);
            }
        } else if (i != 2) {
            if (i == 3 && this.f9281g && this.f9276b.getVisibility() != 0) {
                this.f9280f = true;
                this.f9276b.setAlpha(Utils.FLOAT_EPSILON);
                this.f9276b.setVisibility(0);
                this.f9276b.animate().alpha(1.0f).setDuration(200).setListener((Animator.AnimatorListener) null).start();
            }
        } else if (!this.f9260Q) {
            this.f9260Q = true;
            m11482d(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8967a() {
        if (this.f9267X == null) {
            m11474b(7);
            return;
        }
        C2885cd.m11849m(true, true);
        this.f9281g = true;
        m11497k();
        this.f9267X.mo8817e();
        if (this.f9261R) {
            this.f9267X.mo8816d(true);
        }
        m11509q();
        m11472a(false);
        this.f9270a.mo9158c(false, true);
        this.f9279e.mo9158c(false, true);
        this.f9276b.mo9158c(true, true);
        this.f9276b.setVisibility(0);
        C2850d dVar = this.f9284j;
        if (dVar == C2850d.FRONT) {
            C2923cy.m12209e(this.f9292r, C2747R.string.FaceTec_idscan_capture_id_front_instruction_message);
        } else if (dVar == C2850d.BACK) {
            C2923cy.m12209e(this.f9292r, C2747R.string.FaceTec_idscan_capture_id_back_instruction_message);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m11478c(int i) {
        long j = (long) i;
        mo8845e(new C3521q7(this), j);
        C2910cr crVar = this.f9271aa;
        Handler handler = crVar.f9720b;
        if (handler != null) {
            handler.removeCallbacks(crVar.f9719a);
        }
        Handler handler2 = new Handler();
        crVar.f9720b = handler2;
        handler2.postDelayed(crVar.f9719a, j + 1000);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m11488g(boolean z) {
        this.f9245B.setVisibility(4);
        if (!z) {
            this.f9291q.animate().alpha(Utils.FLOAT_EPSILON).setDuration(100);
            this.f9256M.animate().alpha(Utils.FLOAT_EPSILON).setDuration(100);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo8968b() {
        C2983e eVar = this.f9276b;
        if (eVar != null) {
            eVar.setEnabled(false);
        }
        m11509q();
        mo8843b(new C3410m7(this), 100);
    }

    /* renamed from: d */
    private void m11482d(boolean z) {
        if (this.f9267X.mo8834i()) {
            m11501m();
            m11509q();
            this.f9281g = false;
            if (getActivity() != null) {
                getActivity().runOnUiThread(new C3611u6(this, z));
                C2783aj ajVar = this.f9267X;
                if (ajVar == null) {
                    m11474b(9);
                    return;
                }
                if (this.f9261R) {
                    ajVar.mo8816d(false);
                }
                if (!z) {
                    this.f9267X.mo8814b(true);
                    C2885cd.m11845k();
                }
                this.f9258O = false;
                if (z) {
                    m11499l();
                    return;
                }
                m11472a(true);
                if (getActivity() != null) {
                    getActivity().runOnUiThread(new C3634v6(this));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m11475b(boolean z) {
        this.f9279e.mo9158c(false, true);
        this.f9270a.mo9158c(false, true);
        this.f9276b.mo9158c(false, true);
        this.f9276b.setVisibility(4);
        this.f9245B.setVisibility(0);
        this.f9273ac.postDelayed(new C3569s6(this, z), 100);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo8970c(boolean z) {
        this.f9263T = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo8969c() {
        this.f9272ab.animate().alpha(Utils.FLOAT_EPSILON).setDuration(500).withEndAction(new C2792ao.C2793e(new C2933d7(this))).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m11479c(View view) {
        if (this.f9267X == null) {
            m11474b(6);
            return;
        }
        view.setEnabled(false);
        this.f9276b.mo9158c(false, true);
        view.postDelayed(new C3541r6(this, view), 1000);
        boolean z = !this.f9261R;
        this.f9261R = z;
        if (z) {
            this.f9250G.setImageResource(C2938dc.m12264aF());
        } else {
            this.f9250G.setImageResource(C2938dc.m12265aG());
        }
        this.f9267X.mo8816d(this.f9261R);
    }

    /* renamed from: b */
    private void m11474b(int i) {
        C3330l.m13346d(new Throwable("FaceTec SDK has experienced an unexpected camera error."));
        C2831bd bdVar = this.f9264U;
        if (bdVar != null) {
            FaceTecSessionResult faceTecSessionResult = bdVar.f9169t;
            if (faceTecSessionResult != null) {
                bdVar.mo8946d(faceTecSessionResult.getStatus(), FaceTecIDScanStatus.CAMERA_ERROR);
                C3555s.m13898c((Context) this.f9264U, C2867c.CAMERA_ERROR, "IDScan: zoomCamera is null unexpectedly ".concat(String.valueOf(i)));
                return;
            }
            bdVar.mo8946d(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, FaceTecIDScanStatus.CAMERA_ERROR);
            C2831bd bdVar2 = this.f9264U;
            C2867c cVar = C2867c.SESSION_RESULT_UNEXPECTED_NULL;
            StringBuilder sb = new StringBuilder("latestSessionResult is null unexpectedly. Check Activity State Info to see if session has finished");
            sb.append(C3555s.m13884a((Activity) this.f9264U));
            C3555s.m13898c((Context) bdVar2, cVar, sb.toString());
        }
    }

    /* renamed from: j */
    private void m11494j() {
        if (getActivity() != null) {
            getActivity().runOnUiThread(new C2875c7(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m11471a(View view) {
        this.f9277c.setEnabled(false);
        this.f9279e.mo9158c(false, true);
        this.f9270a.mo9158c(false, true);
        this.f9276b.mo9158c(false, true);
        this.f9264U.mo8941b(FaceTecIDScanStatus.USER_CANCELED);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m11473a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f9277c.setAlpha(0.4f);
        } else if (motionEvent.getAction() == 3 || motionEvent.getX() < Utils.FLOAT_EPSILON || motionEvent.getX() > ((float) (this.f9277c.getWidth() + this.f9277c.getLeft() + 10)) || motionEvent.getY() < Utils.FLOAT_EPSILON || motionEvent.getY() > ((float) (this.f9277c.getHeight() + this.f9277c.getTop() + 10))) {
            this.f9277c.setAlpha(1.0f);
        } else if (motionEvent.getAction() == 1) {
            this.f9277c.performClick();
        }
        return true;
    }
}

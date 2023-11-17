package com.facetec.sdk;

import android.animation.Animator;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facetec.sdk.C2792ao;
import com.facetec.sdk.C2949dl;
import com.facetec.sdk.FaceTecVocalGuidanceCustomization;
import com.facetec.sdk.GuidanceCenterContentFragment;
import com.github.mikephil.charting.utils.Utils;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;

/* renamed from: com.facetec.sdk.cn */
public final class C2905cn extends C2813ay {

    /* renamed from: k */
    static boolean f9674k = false;

    /* renamed from: l */
    private Handler f9675l;

    /* renamed from: m */
    C2914ct f9676m;

    /* renamed from: n */
    int f9677n = 0;

    /* renamed from: p */
    private int f9678p = 500;

    /* renamed from: q */
    private int f9679q = BogInputLayout.INPUT_TYPE_TEXT_PASSWORD;

    /* renamed from: r */
    private GuidanceCenterContentFragment f9680r;

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void m12071C() {
        this.f9676m.mo9052a().setImportantForAccessibility(1);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f9676m.mo9052a().setAccessibilityHeading(true);
        }
        this.f9034c.setImportantForAccessibility(1);
        this.f9033b.setImportantForAccessibility(1);
        if (i >= 28) {
            this.f9676m.mo9052a().setScreenReaderFocusable(true);
        }
        this.f9034c.setAccessibilityTraversalBefore(this.f9033b.getId());
        this.f9676m.mo9052a().sendAccessibilityEvent(8);
        this.f9034c.setAlpha(Utils.FLOAT_EPSILON);
        this.f9034c.setVisibility(0);
        this.f9034c.animate().alpha(1.0f).setDuration(500).setStartDelay(300).setListener((Animator.AnimatorListener) null).withEndAction(new C2792ao.C2793e(new C3196hg(this))).start();
        mo8878e(true, 500, BogInputLayout.INPUT_TYPE_TEXT_PASSWORD);
    }

    /* renamed from: k */
    static C2905cn m12097k() {
        C2905cn cnVar = new C2905cn();
        cnVar.setArguments(new Bundle());
        f9674k = false;
        cnVar.f9046o = true;
        return cnVar;
    }

    /* renamed from: p */
    private void m12098p() {
        Handler handler = this.f9675l;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f9675l = null;
        }
    }

    /* renamed from: q */
    private void m12099q() {
        this.f9034c.setAccessibilityTraversalBefore(this.f9033b.getId());
        if (C2949dl.m12473a()) {
            this.f9034c.mo9158c(true, false);
        } else {
            m12101s();
        }
        mo8878e(false, 500, 0);
        this.f9034c.animate().alpha(Utils.FLOAT_EPSILON).setDuration(500).setStartDelay(0).setListener((Animator.AnimatorListener) null).start();
        mo8843b(new C3620uf(this), 800);
        C3555s.f11477c = C2790am.f8913j;
        m12096e(this.f9680r);
        mo8845e(new C3643vf(this), 1000);
        this.f9032a.mo8903b();
        C3555s.m13898c((Context) mo8882i(), C2867c.GET_READY_IM_READY_SHOWN_AND_READY_RETRY, (String) null);
        C3555s.m13902c(C2913cs.RETRY_GET_READY);
    }

    /* renamed from: r */
    private void m12100r() {
        C2921cw cwVar;
        C2914ct ctVar = this.f9676m;
        if (ctVar != null && (cwVar = ctVar.f9754h) != null) {
            cwVar.mo9081b();
        }
    }

    /* renamed from: s */
    private void m12101s() {
        new Handler().postDelayed(new C2792ao.C2793e(new C3466ng(this)), 4500);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m12072D() {
        this.f9034c.setImportantForAccessibility(1);
        this.f9033b.setImportantForAccessibility(1);
        this.f9034c.setAccessibilityTraversalAfter(this.f9033b.getId());
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m12103u() {
        C2829bc i = mo8882i();
        if (i != null) {
            i.mo8922k();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m12104v() {
        C2914ct ctVar = this.f9676m;
        if (ctVar != null) {
            ctVar.mo9055d();
            return;
        }
        GuidanceCenterContentFragment guidanceCenterContentFragment = this.f9680r;
        if (guidanceCenterContentFragment != null) {
            guidanceCenterContentFragment.mo8790b(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m12105w() {
        mo8881h();
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m12106x() {
        C2829bc i = mo8882i();
        if (i != null) {
            i.mo8923l();
            C3555s.m13898c((Context) i, C2867c.GET_READY_IM_READY_PRESSED_RETY, (String) null);
        }
        mo8881h();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m12107y() {
        this.f9040i = true;
        if (!this.f9034c.isEnabled()) {
            this.f9034c.mo9158c(true, true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8870a() {
        if (this.f9677n == 0) {
            m12099q();
            C2885cd.m11798ab();
            this.f9677n++;
            return;
        }
        C2829bc i = mo8882i();
        if (i != null) {
            i.mo8924m();
        }
        m12098p();
        m12100r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo8872b() {
        ImageView imageView = this.f9036e;
        if (imageView == null) {
            imageView = this.f9033b;
        }
        if (imageView != null && imageView.isEnabled() && !f9674k) {
            mo8870a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo8874c() {
        mo8844e(new C3578sf(this));
        this.f9032a.mo8905e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo8875d() {
        m12100r();
        if (this.f9677n == 0) {
            m12099q();
            C2885cd.m11798ab();
            if (FaceTecSDK.f8630e.vocalGuidanceCustomization.mode == FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE) {
                C2949dl.m12483d(mo8882i(), C2949dl.C2951d.GET_READY_FRAME_YOUR_FACE_AUTOMATIC);
            }
            mo8843b(new C3217if(this), 1300);
        } else {
            f9674k = true;
            m12098p();
            mo8871a(new C2792ao.C2793e(new C3487of(this)), 1000);
        }
        this.f9677n++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo8876e() {
        C2829bc i = mo8882i();
        if (i != null && FaceTecSDK.f8630e.vocalGuidanceCustomization.mode == FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE) {
            C2949dl.m12483d(i, C2949dl.C2951d.RETRY);
        }
        C2914ct ctVar = this.f9676m;
        if (ctVar != null) {
            ctVar.f9751e.setAlpha(Utils.FLOAT_EPSILON);
            ctVar.f9747a.setAlpha(Utils.FLOAT_EPSILON);
            ctVar.f9750d.setAlpha(Utils.FLOAT_EPSILON);
            ctVar.f9748b.setAlpha(Utils.FLOAT_EPSILON);
            ctVar.f9753g.setAlpha(Utils.FLOAT_EPSILON);
            ctVar.f9755i.setAlpha(Utils.FLOAT_EPSILON);
            this.f9034c.setVisibility(4);
            this.f9034c.setAlpha(Utils.FLOAT_EPSILON);
        }
        this.f9039h.setVisibility(8);
        this.f9034c.setEnabled(false);
        this.f9033b.setEnabled(false);
        mo8877e(false);
        this.f9032a.mo8906e(C2938dc.m12277aS(), 0, 0);
        if (this.f9675l == null) {
            Handler handler = new Handler();
            this.f9675l = handler;
            handler.postDelayed(new C2792ao.C2793e(new C3529qf(this)), 600000);
        }
        mo8844e(new C3550rf(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo8879f() {
        return this.f9677n == 1;
    }

    /* renamed from: l */
    public final void mo9044l() {
        if (this.f9675l == null) {
            this.f9675l = new Handler();
        }
        this.f9675l.postDelayed(new C2792ao.C2793e(new C3599tf(this)), 600000);
    }

    /* renamed from: m */
    public final boolean mo9045m() {
        return this.f9677n == 1;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Handler handler = new Handler();
        this.f9675l = handler;
        handler.postDelayed(new C2792ao.C2793e(new C3218ig(this)), 600000);
        if (C2885cd.m11865y().length != 0) {
            C3555s.f11477c = C2790am.f8918o;
            this.f9676m = new C2914ct();
            getFragmentManager().beginTransaction().setCustomAnimations(C2747R.animator.facetec_no_delay_fade_in, 0).add(C2747R.C2749id.centerContentFrameLayout, this.f9676m).commitAllowingStateLoss();
            C3555s.m13902c(C2913cs.RETRY_SIDE_BY_SIDE);
            return;
        }
        C3555s.f11477c = C2790am.f8913j;
        this.f9677n = 1;
        C3555s.m13902c(C2913cs.RETRY_GET_READY);
    }

    public final /* bridge */ /* synthetic */ Animator onCreateAnimator(int i, boolean z, int i2) {
        return super.onCreateAnimator(i, z, i2);
    }

    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public final void onPause() {
        super.onPause();
        m12098p();
        m12100r();
    }

    public final /* bridge */ /* synthetic */ void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m12067A() {
        this.f9033b.setEnabled(true);
        mo8877e(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m12069B() {
        C2831bd j = mo8883j();
        if (j != null) {
            j.mo8955z();
        }
        this.f9680r = GuidanceCenterContentFragment.m10664e(C2747R.string.FaceTec_instructions_header_ready_1, C2747R.string.FaceTec_instructions_message_ready_2, GuidanceCenterContentFragment.ScreenType.READY_OVAL, this.f9032a.mo9066i().top, this.f9032a.mo9066i().bottom, this.f9034c.getId());
        if (this.f9677n == 1) {
            getFragmentManager().beginTransaction().setCustomAnimations(C2747R.animator.facetec_no_delay_fade_in, 0).replace(C2747R.C2749id.centerContentFrameLayout, this.f9680r).commitAllowingStateLoss();
            C2923cy.m12209e(this.f9034c, C2747R.string.FaceTec_action_im_ready);
            this.f9032a.f9072d.setAlpha(C11051p3.f31759c);
            this.f9032a.mo8902a();
            mo8845e(new C3685xf(this), 500);
            this.f9034c.setAlpha(Utils.FLOAT_EPSILON);
            this.f9034c.setVisibility(0);
            this.f9034c.animate().alpha(1.0f).setDuration(500).setStartDelay(300).setListener((Animator.AnimatorListener) null).withEndAction(new C2792ao.C2793e(new C3706yf(this))).start();
            mo8878e(true, 500, BogInputLayout.INPUT_TYPE_TEXT_PASSWORD);
            if (C2949dl.m12473a()) {
                this.f9034c.setEnabled(true);
            } else {
                m12101s();
            }
        } else if (this.f9676m != null) {
            C2923cy.m12209e(this.f9034c, C2747R.string.FaceTec_action_try_again);
            this.f9676m.mo9053b(new C2792ao.C2793e(new C3727zf(this)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m12074E() {
        C2921cw cwVar = this.f9676m.f9754h;
        if (cwVar.f9806c.length != 0) {
            cwVar.f9807d = 0;
            cwVar.f9808e = true;
            cwVar.m12198a();
            cwVar.m12202j();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m12076F() {
        mo8843b(new C3508pf(this), 300);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m12078G() {
        if (C2938dc.m12274aP().length != 0) {
            mo8843b(new C3488og(this), 10);
        }
        mo8843b(new C3195hf(this), 300);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m12080H() {
        if (mo8883j() != null) {
            this.f9034c.mo9158c(true, true);
            this.f9033b.setEnabled(true);
            mo8877e(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m12082I() {
        if (mo8883j() != null) {
            m12072D();
            this.f9033b.setEnabled(true);
            mo8877e(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m12085K() {
        C2829bc i = mo8882i();
        if (i != null) {
            i.mo8922k();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void m12087L() {
        this.f9032a.mo8904c();
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void m12090N() {
        C2829bc i = mo8882i();
        if (i != null) {
            i.mo8922k();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m12108z() {
        C2923cy.m12209e(this.f9034c, C2747R.string.FaceTec_action_im_ready);
        this.f9034c.animate().alpha(1.0f).setDuration(500).setStartDelay(0).setListener((Animator.AnimatorListener) null).start();
        mo8878e(true, 500, 0);
        mo8843b(new C3664wf(this), 500);
    }

    /* renamed from: e */
    private void m12096e(GuidanceCenterContentFragment guidanceCenterContentFragment) {
        getFragmentManager().beginTransaction().setCustomAnimations(C2747R.anim.facetec_slide_in_left, C2747R.anim.facetec_slide_out_left).replace(C2747R.C2749id.centerContentFrameLayout, guidanceCenterContentFragment, "centerContentFrameLayout").commitAllowingStateLoss();
    }
}

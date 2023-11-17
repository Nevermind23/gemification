package com.facetec.sdk;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.C0767a;
import com.facetec.sdk.C2792ao;
import com.facetec.sdk.C2829bc;
import com.facetec.sdk.C2949dl;
import com.facetec.sdk.FaceTecVocalGuidanceCustomization;
import com.facetec.sdk.GuidanceCenterContentFragment;
import com.github.mikephil.charting.utils.Utils;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;

/* renamed from: com.facetec.sdk.bq */
public final class C2855bq extends C2813ay {

    /* renamed from: l */
    static boolean f9342l = false;

    /* renamed from: k */
    private int f9343k = 0;

    /* renamed from: m */
    private C2829bc.C2830b f9344m;

    /* renamed from: n */
    private Handler f9345n;

    /* renamed from: p */
    private final Runnable f9346p = new C2934d8(this);

    /* renamed from: q */
    private GuidanceCenterContentFragment f9347q;

    /* renamed from: r */
    private Handler f9348r;

    /* renamed from: s */
    private GuidanceCenterContentFragment f9349s;

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m11562A() {
        this.f9034c.mo9158c(false, true);
        this.f9033b.setEnabled(false);
        mo8877e(false);
        C2829bc i = mo8882i();
        if (i == null) {
            return;
        }
        if (m11586p()) {
            i.mo8931s();
        } else {
            i.mo8921j();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m11563B() {
        C2831bd j = mo8883j();
        if (j != null) {
            if (m11586p()) {
                this.f9034c.setImportantForAccessibility(1);
                this.f9033b.setImportantForAccessibility(1);
                getActivity();
                if (C2938dc.m12279aU() != 0) {
                    ImageView imageView = this.f9347q.f8654c;
                    Activity activity = getActivity();
                    getActivity();
                    imageView.setImageDrawable(C0767a.m2895e(activity, C2938dc.m12279aU()));
                    this.f9347q.f8654c.setVisibility(0);
                } else {
                    this.f9347q.f8654c.setVisibility(8);
                }
                this.f9347q.f8655d.setVisibility(0);
                C2923cy.m12209e(this.f9347q.f8656e, C2747R.string.FaceTec_camera_permission_header);
                GuidanceCenterContentFragment guidanceCenterContentFragment = this.f9347q;
                int i = C2747R.string.FaceTec_camera_permission_message_enroll;
                String[] split = C2923cy.m12206b(i).split("\n\n");
                if (split.length == 2) {
                    guidanceCenterContentFragment.f8653b.setText(split[0]);
                    guidanceCenterContentFragment.f8652a.setText(split[1]);
                    guidanceCenterContentFragment.f8652a.setVisibility(0);
                } else {
                    C2923cy.m12209e(guidanceCenterContentFragment.f8653b, i);
                    guidanceCenterContentFragment.f8652a.setVisibility(8);
                }
                if (this.f9344m == C2829bc.C2830b.NOT_GRANTED) {
                    C2923cy.m12209e(this.f9034c, C2747R.string.FaceTec_camera_permission_enable_camera);
                } else {
                    C2923cy.m12209e(this.f9034c, C2747R.string.FaceTec_camera_permission_launch_settings);
                }
                this.f9347q.f8656e.setVisibility(0);
                this.f9347q.f8653b.setVisibility(0);
                this.f9034c.animate().alpha(1.0f).setDuration(500).setListener((Animator.AnimatorListener) null).start();
                mo8878e(true, 500, 0);
                this.f9034c.setEnabled(true);
                C2831bd j2 = mo8883j();
                if (j2 != null) {
                    j2.f9159j = true;
                }
                C3555s.m13902c(C2913cs.CAMERA_PERMISSION);
                j.mo8955z();
            } else if (this.f9037f) {
                m11590t();
                m11585m();
                mo8871a(new C3232j8(), BogInputLayout.INPUT_TYPE_TEXT_PASSWORD);
                j.mo8953w();
                return;
            } else {
                this.f9349s = GuidanceCenterContentFragment.m10664e(C2747R.string.FaceTec_instructions_header_ready_1, C2747R.string.FaceTec_instructions_message_ready_2, GuidanceCenterContentFragment.ScreenType.READY_OVAL, this.f9032a.mo9066i().top, this.f9032a.mo9066i().bottom, 0);
                this.f9034c.animate().alpha(1.0f).setDuration(500).setListener((Animator.AnimatorListener) null).start();
                mo8878e(true, 500, 0);
                this.f9034c.setEnabled(false);
                m11583e(this.f9349s);
                this.f9032a.f9072d.setAlpha(C11051p3.f31759c);
                this.f9032a.mo8902a();
                mo8845e(new C3289k8(this), 1000);
                this.f9343k = 2;
                m11579b(false);
                j.mo8955z();
            }
            this.f9041j.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f9041j, View.ALPHA, new float[]{Utils.FLOAT_EPSILON, 1.0f});
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(500);
            animatorSet.play(ofFloat);
            animatorSet.start();
            C3555s.m13902c(C2913cs.INITIAL_FACE_SCAN_GET_READY);
            C3555s.m13898c((Context) mo8882i(), C2867c.GET_READY_IM_READY_SHOWN_AND_READY, (String) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m11564D() {
        C2828bb bbVar = this.f9032a;
        if (bbVar != null) {
            bbVar.mo8904c();
            m11584l();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m11584l() {
        C2983e eVar = this.f9034c;
        if (eVar != null && this.f9033b != null) {
            eVar.setImportantForAccessibility(1);
            this.f9033b.setImportantForAccessibility(1);
            this.f9034c.setAccessibilityTraversalBefore(this.f9033b.getId());
        }
    }

    /* renamed from: m */
    private void m11585m() {
        Handler handler = this.f9348r;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f9348r = null;
        }
    }

    /* renamed from: p */
    private boolean m11586p() {
        return this.f9344m != C2829bc.C2830b.GRANTED;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static /* synthetic */ void m11587q() {
    }

    /* renamed from: r */
    private void m11588r() {
        if (this.f9345n == null) {
            this.f9345n = new Handler();
        }
        this.f9345n.postDelayed(new C2792ao.C2793e(new C3188h8(this)), 600000);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m11589s() {
        this.f9032a.mo8905e();
        GuidanceCenterContentFragment guidanceCenterContentFragment = this.f9349s;
        if (guidanceCenterContentFragment != null) {
            guidanceCenterContentFragment.mo8790b(true);
        }
    }

    /* renamed from: t */
    private void m11590t() {
        Handler handler = this.f9345n;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f9345n = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m11591u() {
        if (this.f9349s != null && isAdded()) {
            m11583e(this.f9349s);
            this.f9032a.mo8902a();
            C2923cy.m12209e(this.f9034c, C2747R.string.FaceTec_action_im_ready);
            this.f9035d.animate().alpha(Utils.FLOAT_EPSILON).setDuration(500).setListener(new C2816b() {
                public /* synthetic */ void onAnimationCancel(Animator animator) {
                    C3405m2.m13567a(this, animator);
                }

                public final void onAnimationEnd(Animator animator) {
                    C2855bq.this.m11584l();
                }

                public /* synthetic */ void onAnimationRepeat(Animator animator) {
                    C3405m2.m13568b(this, animator);
                }

                public /* synthetic */ void onAnimationStart(Animator animator) {
                    C3405m2.m13569c(this, animator);
                }
            }).start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m11592v() {
        C2829bc i = mo8882i();
        if (i != null) {
            i.mo8925n();
            C3555s.m13898c((Context) i, C2867c.GET_READY_IM_READY_PRESSED, (String) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m11593w() {
        this.f9040i = true;
        if (!this.f9034c.isEnabled()) {
            this.f9034c.mo9158c(true, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m11594x() {
        this.f9033b.setEnabled(true);
        mo8877e(true);
        this.f9034c.mo9158c(true, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m11595y() {
        C2923cy.m12209e(this.f9034c, C2747R.string.FaceTec_action_im_ready);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m11596z() {
        C2949dl.m12483d(mo8882i(), C2949dl.C2951d.GET_READY_PRESS_BUTTON_DELAYED);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8870a() {
        m11590t();
        m11585m();
        this.f9038g = null;
        C2829bc i = mo8882i();
        if (i != null) {
            if (m11586p()) {
                i.mo8931s();
            } else {
                i.mo8929q();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo8872b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo8875d() {
        boolean z;
        this.f9033b.setImportantForAccessibility(2);
        if (this.f9349s != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && isAdded()) {
            GuidanceCenterContentFragment guidanceCenterContentFragment = this.f9349s;
            LinearLayout linearLayout = guidanceCenterContentFragment.f8659h;
            if (linearLayout != null) {
                linearLayout.setImportantForAccessibility(2);
            }
            RelativeLayout relativeLayout = guidanceCenterContentFragment.f8661j;
            if (relativeLayout != null) {
                relativeLayout.setImportantForAccessibility(2);
            }
        }
        C2829bc i = mo8882i();
        if (i != null) {
            if (m11586p()) {
                i.mo8909a();
            } else {
                this.f9034c.mo9158c(false, true);
                this.f9034c.setVisibility(4);
                f9342l = true;
                m11590t();
                m11585m();
                mo8871a(new C2792ao.C2793e(new C3157g8(this)), BogInputLayout.INPUT_TYPE_TEXT_PASSWORD);
            }
            mo8881h();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo8876e() {
        C3555s.f11477c = C2790am.f8913j;
        this.f9039h.setVisibility(8);
        m11583e(this.f9347q);
        if (this.f9345n == null) {
            this.f9345n = new Handler();
        }
        this.f9345n.post(new C2792ao.C2793e(new C2762a8(this)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo8879f() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo8979k() {
        m11588r();
        this.f9344m = C2829bc.C2830b.GRANTED;
        C2831bd j = mo8883j();
        if (j == null || !this.f9037f) {
            this.f9349s = GuidanceCenterContentFragment.m10664e(C2747R.string.FaceTec_instructions_header_ready_1, C2747R.string.FaceTec_instructions_message_ready_2, GuidanceCenterContentFragment.ScreenType.READY_OVAL, this.f9032a.mo9066i().top, this.f9032a.mo9066i().bottom, 0);
            mo8873b(getActivity(), false);
            C2938dc.m12401d((Button) this.f9034c, FaceTecSDK.f8630e.f8606i.buttonTextNormalColor);
            this.f9343k = 2;
            m11579b(true);
            return;
        }
        mo8844e(new C3411m8(this, new C2792ao.C2793e(new C3339l8(j))));
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo8884n() {
        C2829bc i = mo8882i();
        if (i != null) {
            if (!m11586p()) {
                if (this.f9343k < 2) {
                    Handler handler = new Handler();
                    int i2 = this.f9343k;
                    if (i2 == 0) {
                        this.f9343k = i2 + 1;
                    }
                    if (this.f9343k == 1) {
                        getFragmentManager().beginTransaction().setCustomAnimations(C2747R.anim.facetec_slide_in_left, C2747R.anim.facetec_slide_out_left).replace(C2747R.C2749id.centerContentFrameLayout, this.f9349s, "centerContentFrameLayout").commitAllowingStateLoss();
                        this.f9032a.mo8903b();
                        handler.postDelayed(new C2792ao.C2793e(new C2994e8(this)), 900);
                    }
                    handler.postDelayed(new C2792ao.C2793e(new C3060f8(this)), 900);
                } else {
                    super.mo8884n();
                }
                this.f9343k++;
            } else if (this.f9344m == C2829bc.C2830b.NOT_GRANTED) {
                m11590t();
                i.mo8909a();
            } else {
                Intent intent = new Intent();
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", i.getPackageName(), (String) null));
                i.startActivity(intent);
                i.mo8931s();
            }
            mo8881h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo8885o() {
        super.mo8885o();
        this.f9041j.setVisibility(4);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9344m = C2829bc.C2830b.values()[getArguments().getInt("PERMISSION_STATUS")];
        this.f9037f = getArguments().getBoolean("IDSCAN_ONLY_MODE");
        m11588r();
        GuidanceCenterContentFragment guidanceCenterContentFragment = new GuidanceCenterContentFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("screenType", GuidanceCenterContentFragment.ScreenType.GENERIC);
        guidanceCenterContentFragment.setArguments(bundle2);
        this.f9347q = guidanceCenterContentFragment;
        int i = C2747R.string.FaceTec_instructions_header_ready_1;
        int i2 = C2747R.string.FaceTec_instructions_message_ready_2;
        GuidanceCenterContentFragment.ScreenType screenType = GuidanceCenterContentFragment.ScreenType.READY_OVAL;
        GuidanceCenterContentFragment guidanceCenterContentFragment2 = new GuidanceCenterContentFragment();
        Bundle bundle3 = new Bundle();
        bundle3.putInt("header", i);
        bundle3.putInt("message", i2);
        bundle3.putSerializable("screenType", screenType);
        guidanceCenterContentFragment2.setArguments(bundle3);
        this.f9349s = guidanceCenterContentFragment2;
    }

    public final /* bridge */ /* synthetic */ Animator onCreateAnimator(int i, boolean z, int i2) {
        return super.onCreateAnimator(i, z, i2);
    }

    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f9347q = null;
        this.f9349s = null;
    }

    public final void onPause() {
        super.onPause();
        m11590t();
        m11585m();
    }

    public final /* bridge */ /* synthetic */ void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    /* renamed from: b */
    static C2855bq m11578b(C2829bc.C2830b bVar, boolean z) {
        C2855bq bqVar = new C2855bq();
        Bundle bundle = new Bundle();
        bundle.putInt("PERMISSION_STATUS", bVar.ordinal());
        bundle.putBoolean("IDSCAN_ONLY_MODE", z);
        bqVar.setArguments(bundle);
        f9342l = false;
        return bqVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m11582c(Runnable runnable) {
        mo8871a(runnable, 500);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo8874c() {
        new Handler().post(new C2792ao.C2793e(new C3210i8(this)));
    }

    /* renamed from: e */
    private void m11583e(GuidanceCenterContentFragment guidanceCenterContentFragment) {
        getFragmentManager().beginTransaction().setCustomAnimations(C2747R.animator.facetec_no_delay_fade_in, 0).replace(C2747R.C2749id.centerContentFrameLayout, guidanceCenterContentFragment).commitAllowingStateLoss();
    }

    /* renamed from: b */
    private void m11579b(boolean z) {
        this.f9032a.mo8906e(C2938dc.m12277aS(), 1000, 500);
        if (z) {
            this.f9035d.animate().alpha(1.0f).setDuration(500).setListener((Animator.AnimatorListener) null).withEndAction(new C2792ao.C2793e(new C2825b8(this))).start();
            this.f9343k++;
        } else {
            C2923cy.m12209e(this.f9034c, C2747R.string.FaceTec_action_im_ready);
        }
        this.f9033b.setEnabled(true);
        mo8877e(true);
        if (C2949dl.m12473a()) {
            this.f9034c.mo9158c(true, false);
        } else {
            this.f9034c.mo9158c(false, true);
            new Handler().postDelayed(new C2792ao.C2793e(new C2876c8(this)), 4500);
        }
        if (FaceTecSDK.f8630e.vocalGuidanceCustomization.mode == FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE) {
            C2949dl.m12483d(mo8882i(), C2949dl.C2951d.GET_READY_FRAME_YOUR_FACE_AUTOMATIC);
            Handler handler = new Handler();
            this.f9348r = handler;
            handler.postDelayed(this.f9346p, 4500);
        }
    }
}

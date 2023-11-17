package com.facetec.sdk;

import android.animation.Animator;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.facetec.sdk.C2792ao;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: com.facetec.sdk.cr */
public final class C2910cr extends C2792ao {

    /* renamed from: a */
    final C2792ao.C2793e f9719a = new C2792ao.C2793e(new C3665wg(this));

    /* renamed from: b */
    Handler f9720b;

    /* renamed from: c */
    boolean f9721c = false;

    /* renamed from: d */
    C2912e f9722d;

    /* renamed from: e */
    private RelativeLayout f9723e;

    /* renamed from: f */
    private RelativeLayout f9724f;

    /* renamed from: g */
    private View f9725g;

    /* renamed from: h */
    private TextView f9726h;

    /* renamed from: i */
    private ImageView f9727i;

    /* renamed from: j */
    private ImageView f9728j;

    /* renamed from: k */
    private Drawable f9729k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public AnimatedVectorDrawableCompat f9730l;

    /* renamed from: m */
    private boolean f9731m = false;

    /* renamed from: o */
    private Animatable2Compat$AnimationCallback f9732o;

    /* renamed from: com.facetec.sdk.cr$e */
    public interface C2912e {
        /* renamed from: t */
        void mo8775t();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m12131a() {
        this.f9728j.setImageDrawable(this.f9730l);
        C29114 r0 = new Animatable2Compat$AnimationCallback() {
            public final void onAnimationEnd(Drawable drawable) {
                C2910cr.this.mo8844e(new C3728zg(this));
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m12145a() {
                if (C2910cr.this.f9730l != null) {
                    C2910cr.this.f9730l.start();
                }
            }
        };
        this.f9732o = r0;
        this.f9730l.mo6269d(r0);
        this.f9730l.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo9049e() {
        if (this.f9721c && this.f9731m) {
            mo8844e(new C3621ug(this, new C2792ao.C2793e(new C3600tg(this))));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C2747R.layout.facetec_securing_camera_fragment, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f9723e = (RelativeLayout) view.findViewById(C2747R.C2749id.mainLayout);
        this.f9724f = (RelativeLayout) view.findViewById(C2747R.C2749id.mainContainer);
        this.f9725g = view.findViewById(C2747R.C2749id.mainBackgroundView);
        this.f9726h = (TextView) view.findViewById(C2747R.C2749id.messageTextView);
        this.f9727i = (ImageView) view.findViewById(C2747R.C2749id.animationBackgroundImageView);
        this.f9728j = (ImageView) view.findViewById(C2747R.C2749id.animationForegroundImageView);
        C2938dc.m12424h(this.f9725g);
        this.f9725g.getBackground().setAlpha(C2938dc.m12277aS());
        float c = C2938dc.m12372c() * C2938dc.m12404e();
        float bj = C2938dc.m12355bj();
        int d = C2938dc.m12393d();
        int round = Math.round(C2810ax.m10988b(40) * bj * c);
        this.f9724f.setTranslationY((float) Math.round(C2810ax.m10988b(-55) * c));
        FrameLayout frameLayout = (FrameLayout) view.findViewById(C2747R.C2749id.animationFrameLayout);
        frameLayout.getLayoutParams().height = round;
        frameLayout.getLayoutParams().width = round;
        int aK = C2938dc.m12269aK();
        int aL = C2938dc.m12270aL();
        if (aL != 0) {
            this.f9730l = C2810ax.m10990b(getActivity(), aL);
        }
        if (aK != 0) {
            this.f9729k = C0767a.m2895e(getActivity(), aK);
        }
        if (this.f9730l != null) {
            this.f9727i.setVisibility(8);
            mo8844e(new C3644vg(this));
        } else if (this.f9729k != null) {
            this.f9727i.setVisibility(8);
            this.f9728j.setImageDrawable(this.f9729k);
            RotateAnimation rotateAnimation = new RotateAnimation(Utils.FLOAT_EPSILON, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            rotateAnimation.setDuration((long) FaceTecSDK.f8630e.f8609l.customAnimationImageRotationInterval);
            rotateAnimation.setRepeatCount(-1);
            this.f9728j.startAnimation(rotateAnimation);
        } else {
            this.f9727i.setColorFilter(C2938dc.m12446p(getActivity()), PorterDuff.Mode.SRC_IN);
            this.f9728j.setColorFilter(C2938dc.m12450r(getActivity()), PorterDuff.Mode.SRC_IN);
            RotateAnimation rotateAnimation2 = new RotateAnimation(Utils.FLOAT_EPSILON, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation2.setDuration(1000);
            rotateAnimation2.setInterpolator(new LinearInterpolator());
            rotateAnimation2.setRepeatCount(-1);
            this.f9728j.startAnimation(rotateAnimation2);
        }
        C2938dc.m12257a(this.f9726h, C2938dc.m12450r(getActivity()));
        this.f9726h.setTypeface(FaceTecSDK.f8630e.f8609l.messageFont);
        C2923cy.m12209e(this.f9726h, C2747R.string.FaceTec_initializing_camera);
        this.f9726h.setTextSize(2, c * 16.0f);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f9726h.getLayoutParams();
        layoutParams.topMargin = d;
        layoutParams.leftMargin = d;
        layoutParams.rightMargin = d;
        this.f9726h.setLayoutParams(layoutParams);
        C3555s.m13902c(C2913cs.SECURING_CAMERA);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m12133b() {
        C2912e eVar = this.f9722d;
        if (eVar != null) {
            eVar.mo8775t();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m12135c(C2792ao.C2793e eVar) {
        RelativeLayout relativeLayout = this.f9724f;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        if (eVar != null) {
            eVar.run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m12137d(C2792ao.C2793e eVar) {
        this.f9724f.animate().alpha(Utils.FLOAT_EPSILON).setDuration(500).setStartDelay(0).setListener((Animator.AnimatorListener) null).withEndAction(new C2792ao.C2793e(new C3686xg(this, eVar))).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m12139e(C2792ao.C2793e eVar) {
        mo8844e(new C3707yg(this, eVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m12134c() {
        this.f9731m = true;
        mo9049e();
    }
}

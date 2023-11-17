package com.facetec.sdk;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.facetec.sdk.C2792ao;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: com.facetec.sdk.d */
public final class C2925d extends C2792ao {

    /* renamed from: a */
    private View f9815a;

    /* renamed from: b */
    private View f9816b;

    /* renamed from: c */
    private View f9817c;

    /* renamed from: d */
    private FrameLayout f9818d;

    /* renamed from: e */
    private ImageView f9819e;

    /* renamed from: f */
    private TextView f9820f;

    /* renamed from: j */
    private boolean f9821j = false;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m12211a() {
        if (this.f9821j) {
            ((AnimatedVectorDrawableCompat) this.f9819e.getDrawable()).start();
        }
        this.f9815a.animate().alpha(1.0f).setDuration(500).setListener((Animator.AnimatorListener) null).withEndAction(new C2792ao.C2793e(new C3198hi(this))).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m12212b() {
        mo8845e(new C3490oi(this), 1000);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m12217e() {
        this.f9815a.animate().alpha(Utils.FLOAT_EPSILON).setDuration(500).setListener((Animator.AnimatorListener) null).withEndAction(new C2792ao.C2793e(new C3511pi(this))).start();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2747R.layout.facetec_additional_review_fragment, viewGroup, false);
        this.f9817c = inflate;
        return inflate;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Activity activity = getActivity();
        this.f9816b = view.findViewById(C2747R.C2749id.backgroundView);
        this.f9815a = view.findViewById(C2747R.C2749id.contentLayout);
        this.f9818d = (FrameLayout) view.findViewById(C2747R.C2749id.iconFrameLayout);
        this.f9819e = (ImageView) view.findViewById(C2747R.C2749id.iconImageView);
        this.f9820f = (TextView) view.findViewById(C2747R.C2749id.messageTextView);
        float c = C2938dc.m12372c() * C2938dc.m12404e();
        int d = C2938dc.m12393d();
        int round = Math.round(C2810ax.m10988b(80) * C2938dc.m12355bj() * c);
        int round2 = Math.round(C2810ax.m10988b(-55) * c);
        int round3 = Math.round(c * 24.0f);
        Typeface typeface = FaceTecSDK.f8630e.f8603f.messageFont;
        int e = C2938dc.m12408e((Context) activity, C2938dc.m12234M());
        getActivity();
        int aV = C2938dc.m12280aV();
        int aR = C2938dc.m12276aR();
        int aT = C2938dc.m12278aT();
        if (aR != 0) {
            this.f9819e.setImageDrawable(C2810ax.m10990b(getActivity(), aR));
            this.f9821j = true;
        } else if (aT != 0) {
            this.f9819e.setImageDrawable(C0767a.m2895e(activity, aT));
        } else if (aV != 0) {
            this.f9819e.setImageDrawable(C0767a.m2895e(activity, aV));
        } else {
            this.f9819e.setVisibility(8);
        }
        this.f9815a.setTranslationY((float) round2);
        this.f9818d.getLayoutParams().height = round;
        this.f9818d.getLayoutParams().width = round;
        ((RelativeLayout.LayoutParams) this.f9818d.getLayoutParams()).setMargins(0, d, 0, 0);
        C2923cy.m12209e(this.f9820f, C2747R.string.FaceTec_idscan_additional_review_message);
        this.f9820f.setTextColor(e);
        this.f9820f.setTypeface(typeface);
        this.f9820f.setTextSize((float) round3);
        ((RelativeLayout.LayoutParams) this.f9820f.getLayoutParams()).setMargins(0, d, 0, d);
        C2938dc.m12254a(this.f9816b);
        this.f9816b.getBackground().setAlpha(C2938dc.m12277aS());
        mo8844e(new C3220ii(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m12213c() {
        mo8845e(new C3468ni(this), 1500);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m12215d() {
        C2831bd bdVar = (C2831bd) getActivity();
        if (bdVar != null) {
            bdVar.mo8776x();
        }
    }
}

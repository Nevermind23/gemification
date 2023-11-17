package com.facetec.sdk;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facetec.sdk.C2792ao;
import com.facetec.sdk.C2810ax;
import com.github.mikephil.charting.utils.Utils;

public final class GuidanceCenterContentFragment extends C2792ao {

    /* renamed from: a */
    TextView f8652a;

    /* renamed from: b */
    TextView f8653b;

    /* renamed from: c */
    ImageView f8654c;

    /* renamed from: d */
    LinearLayout f8655d;

    /* renamed from: e */
    TextView f8656e;

    /* renamed from: f */
    private TextView f8657f;

    /* renamed from: g */
    private TextView f8658g;

    /* renamed from: h */
    LinearLayout f8659h;

    /* renamed from: i */
    private TextView f8660i;

    /* renamed from: j */
    RelativeLayout f8661j;

    /* renamed from: k */
    private TextView f8662k;

    /* renamed from: l */
    private RelativeLayout f8663l;

    /* renamed from: m */
    private RelativeLayout f8664m;

    /* renamed from: n */
    private TextView f8665n;

    /* renamed from: o */
    private C3223j f8666o;

    /* renamed from: p */
    private GradientDrawable f8667p;

    /* renamed from: q */
    private GradientDrawable f8668q;

    /* renamed from: r */
    private boolean f8669r = false;

    /* renamed from: s */
    private View f8670s;

    protected enum ScreenType {
        GENERIC,
        READY_OVAL
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m10657b() {
        boolean z;
        boolean z2;
        int i;
        int i2;
        float c = C2938dc.m12372c();
        int round = Math.round(((float) C2938dc.m12393d()) * C2938dc.m12404e());
        int round2 = Math.round(C2810ax.m10988b(35) * C2938dc.m12404e() * c);
        int round3 = Math.round(C2810ax.m10988b(5) * C2938dc.m12404e() * c);
        float f = getArguments().getFloat("bottomOval");
        float f2 = getArguments().getFloat("topOval") - ((float) (round << 1));
        int i3 = round3 << 1;
        float f3 = (float) i3;
        float f4 = f2 - f3;
        float measuredHeight = (((float) this.f8670s.getMeasuredHeight()) - f) - f3;
        int measuredHeight2 = this.f8659h.getMeasuredHeight() - i3;
        int floor = (int) Math.floor((double) f4);
        if (f4 < ((float) measuredHeight2)) {
            floor = measuredHeight2 + (round3 << 2);
            z = true;
        } else {
            z = false;
        }
        int measuredHeight3 = this.f8666o.getMeasuredHeight() - i3;
        int floor2 = (int) Math.floor((double) measuredHeight);
        if (measuredHeight < ((float) measuredHeight3)) {
            floor2 = measuredHeight3 + (round3 << 2);
            z2 = true;
        } else {
            z2 = false;
        }
        int i4 = (!z || !C2938dc.m12354bi()) ? 0 : round2;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, floor);
        layoutParams.setMargins(i4, 0, i4, 0);
        layoutParams.addRule(10);
        this.f8663l.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, floor2);
        layoutParams2.setMargins(0, 0, 0, round3);
        layoutParams2.addRule(12);
        this.f8661j.setLayoutParams(layoutParams2);
        if (z) {
            this.f8659h.setPadding(round3, round3, round3, round3);
            this.f8659h.setBackground(this.f8667p);
            this.f8659h.invalidate();
        }
        if (z2) {
            this.f8666o.setPadding(round3, round3, round3, round3);
            this.f8666o.setBackground(this.f8668q);
            this.f8666o.invalidate();
        }
        if (FaceTecSDK.f8630e.f8601d) {
            this.f8666o.setOnClickRunnable(new C3202i0(this));
        }
        int floor3 = (int) Math.floor((((double) floor) / 2.0d) / 1.3d);
        int floor4 = (int) Math.floor((((double) floor2) / 2.0d) / 1.3d);
        int width = this.f8663l.getWidth();
        int width2 = this.f8661j.getWidth();
        if (z) {
            floor3 = (int) Math.floor(((double) (floor - i3)) / 2.0d);
            i = width - i3;
            i2 = i;
        } else {
            if (!C2938dc.m12354bi()) {
                round2 = 0;
            }
            int i5 = width;
            i = width - (round2 << 1);
            i2 = i5;
        }
        if (z2) {
            floor4 = (int) Math.floor(((double) (floor2 - i3)) / 2.0d);
            width2 = this.f8661j.getWidth() - i3;
        }
        C2810ax.C2812a aVar = new C2810ax.C2812a(i, floor3);
        C2810ax.C2812a aVar2 = new C2810ax.C2812a(i2, floor3);
        C2810ax.C2812a aVar3 = new C2810ax.C2812a(width2, floor4);
        int round4 = Math.round(C2810ax.m10998e(8));
        int round5 = Math.round(C2810ax.m10998e(40));
        int round6 = Math.round(C2810ax.m10998e(5));
        int round7 = Math.round(C2810ax.m10998e(36));
        int a = C2810ax.m10983a(this.f8657f, aVar, round4, round5);
        int a2 = C2810ax.m10983a(this.f8660i, aVar2, round4, round5);
        int a3 = C2810ax.m10983a(this.f8665n, aVar3, round6, round7);
        int a4 = C2810ax.m10983a(this.f8662k, aVar3, round6, round7);
        int min = Math.min(a, a2);
        int round8 = (int) Math.round(((double) min) * 0.85d);
        if (a3 >= round8) {
            a3 = round8;
        }
        if (a4 >= a3) {
            a4 = a3;
        }
        float f5 = (float) min;
        this.f8657f.setTextSize(0, f5);
        this.f8660i.setTextSize(0, f5);
        float f6 = (float) a4;
        this.f8665n.setTextSize(0, f6);
        this.f8662k.setTextSize(0, f6);
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.f8657f.getText()));
        sb.append(this.f8660i.getText());
        this.f8659h.setContentDescription(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m10665e() {
        C2831bd bdVar = (C2831bd) getActivity();
        if (bdVar != null) {
            bdVar.mo8933B();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2747R.layout.facetec_guidance_center_content_fragment, viewGroup, false);
        this.f8670s = inflate;
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        getArguments().getInt("retryActionButtonId");
        this.f8661j.setImportantForAccessibility(1);
        RelativeLayout relativeLayout = this.f8661j;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8665n.getText());
        sb.append(" ");
        sb.append(this.f8662k.getText());
        relativeLayout.setContentDescription(sb.toString());
        this.f8659h.setImportantForAccessibility(1);
        if (Build.VERSION.SDK_INT >= 28) {
            this.f8659h.setScreenReaderFocusable(true);
            this.f8661j.setScreenReaderFocusable(true);
        }
        this.f8661j.setAccessibilityTraversalAfter(this.f8659h.getId());
        this.f8659h.sendAccessibilityEvent(8);
        this.f8659h.performAccessibilityAction(64, (Bundle) null);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f8655d = (LinearLayout) view.findViewById(C2747R.C2749id.iconLayout);
        this.f8654c = (ImageView) view.findViewById(C2747R.C2749id.iconImageView);
        TextView textView = (TextView) view.findViewById(C2747R.C2749id.genericHeaderView);
        this.f8656e = textView;
        C2938dc.m12413e(textView);
        this.f8656e.setTypeface(C2839bf.f9199c);
        this.f8656e.setLineSpacing(Utils.FLOAT_EPSILON, 1.1f);
        TextView textView2 = (TextView) view.findViewById(C2747R.C2749id.feedbackIconsHeader);
        this.f8658g = textView2;
        C2938dc.m12413e(textView2);
        this.f8658g.setTypeface(C2839bf.f9199c);
        this.f8658g.setLineSpacing(Utils.FLOAT_EPSILON, 1.1f);
        this.f8653b = (TextView) view.findViewById(C2747R.C2749id.messageView1);
        this.f8652a = (TextView) view.findViewById(C2747R.C2749id.messageView2);
        this.f8653b.setTypeface(C2839bf.f9198b);
        this.f8652a.setTypeface(C2839bf.f9198b);
        C2938dc.m12413e(this.f8653b);
        C2938dc.m12413e(this.f8652a);
        this.f8653b.setLineSpacing(Utils.FLOAT_EPSILON, 1.1f);
        this.f8652a.setLineSpacing(Utils.FLOAT_EPSILON, 1.1f);
        this.f8664m = (RelativeLayout) view.findViewById(C2747R.C2749id.readyScreenContent);
        this.f8657f = (TextView) view.findViewById(C2747R.C2749id.readyScreenHeader1);
        this.f8660i = (TextView) view.findViewById(C2747R.C2749id.readyScreenHeader2);
        this.f8665n = (TextView) view.findViewById(C2747R.C2749id.readyScreenSubtext1);
        this.f8662k = (TextView) view.findViewById(C2747R.C2749id.readyScreenSubtext2);
        this.f8663l = (RelativeLayout) view.findViewById(C2747R.C2749id.readyScreenHeaderOuterContainer);
        this.f8661j = (RelativeLayout) view.findViewById(C2747R.C2749id.readyScreenSubtextOuterContainer);
        this.f8659h = (LinearLayout) view.findViewById(C2747R.C2749id.readyScreenHeaderInnerContainer);
        this.f8666o = (C3223j) view.findViewById(C2747R.C2749id.readyScreenSubtextInnerContainer);
        this.f8659h.setImportantForAccessibility(1);
        if (Build.VERSION.SDK_INT >= 28) {
            this.f8659h.setAccessibilityHeading(true);
        }
        this.f8661j.setImportantForAccessibility(1);
        this.f8663l.setImportantForAccessibility(2);
        this.f8657f.setImportantForAccessibility(2);
        this.f8660i.setImportantForAccessibility(2);
        this.f8665n.setImportantForAccessibility(2);
        this.f8662k.setImportantForAccessibility(2);
        this.f8657f.setTypeface(C2938dc.m12229H());
        this.f8660i.setTypeface(C2938dc.m12229H());
        this.f8665n.setTypeface(C2938dc.m12230I());
        this.f8662k.setTypeface(C2938dc.m12230I());
        this.f8657f.setTextColor(C2938dc.m12422h((Context) getActivity()));
        this.f8660i.setTextColor(C2938dc.m12422h((Context) getActivity()));
        this.f8665n.setTextColor(C2938dc.m12419g((Context) getActivity()));
        this.f8662k.setTextColor(C2938dc.m12419g((Context) getActivity()));
        this.f8657f.setLineSpacing(Utils.FLOAT_EPSILON, 1.1f);
        this.f8660i.setLineSpacing(Utils.FLOAT_EPSILON, 1.1f);
        this.f8665n.setLineSpacing(Utils.FLOAT_EPSILON, 1.1f);
        this.f8662k.setLineSpacing(Utils.FLOAT_EPSILON, 1.1f);
        float c = C2938dc.m12372c() * C2938dc.m12404e();
        float f = 28.0f * c;
        this.f8657f.setTextSize(2, f);
        this.f8660i.setTextSize(2, f);
        float f2 = 20.0f * c;
        this.f8665n.setTextSize(2, f2);
        this.f8662k.setTextSize(2, f2);
        this.f8656e.setTextSize(2, f);
        this.f8658g.setTextSize(2, f);
        this.f8653b.setTextSize(2, f2);
        int d = C2938dc.m12393d();
        view.setPadding(d, d, d, 0);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f8663l.getLayoutParams();
        layoutParams.setMarginStart(d);
        layoutParams.setMarginEnd(d);
        this.f8663l.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f8661j.getLayoutParams();
        layoutParams2.setMarginStart(d);
        layoutParams2.setMarginEnd(d);
        this.f8661j.setLayoutParams(layoutParams2);
        ScreenType screenType = (ScreenType) getArguments().get("screenType");
        int i = getArguments().getInt("header");
        ScreenType screenType2 = ScreenType.GENERIC;
        if (screenType == screenType2) {
            C2923cy.m12209e(this.f8656e, i);
        } else {
            C2923cy.m12209e(this.f8658g, i);
        }
        if (screenType == screenType2) {
            C2923cy.m12209e(this.f8653b, getArguments().getInt("message"));
        } else if (screenType == ScreenType.READY_OVAL) {
            this.f8664m.setVisibility(0);
            C2938dc.m12318b(this.f8657f, C2938dc.m12410e(true));
            C2938dc.m12318b(this.f8660i, C2938dc.m12398d(true));
            C2938dc.m12318b(this.f8665n, C2938dc.m12314b(true));
            C2938dc.m12318b(this.f8662k, C2938dc.m12378c(true));
            Resources resources = getResources();
            GradientDrawable gradientDrawable = (GradientDrawable) resources.getDrawable(C2747R.C2748drawable.facetec_ready_header_background).mutate();
            this.f8667p = gradientDrawable;
            gradientDrawable.setCornerRadius(C2810ax.m10988b(C2938dc.m12458w()) * C2938dc.m12404e());
            C2938dc.m12252a(getActivity(), this.f8667p, C2938dc.m12236O());
            GradientDrawable gradientDrawable2 = (GradientDrawable) resources.getDrawable(C2747R.C2748drawable.facetec_ready_subtext_background).mutate();
            this.f8668q = gradientDrawable2;
            gradientDrawable2.setCornerRadius(C2810ax.m10988b(C2938dc.m12458w()) * C2938dc.m12404e());
            C2938dc.m12252a(getActivity(), this.f8668q, C2938dc.m12236O());
            this.f8663l.getViewTreeObserver().addOnGlobalLayoutListener(new C3180h0(this));
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f8655d.getLayoutParams();
        layoutParams3.height = Math.round(C2810ax.m10988b(78) * c);
        layoutParams3.bottomMargin = d;
        this.f8655d.setLayoutParams(layoutParams3);
        ((LinearLayout.LayoutParams) this.f8656e.getLayoutParams()).bottomMargin = d;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m10659c(ValueAnimator valueAnimator) {
        TextView textView;
        if (isAdded() && (textView = this.f8665n) != null && this.f8662k != null) {
            textView.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            this.f8662k.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m10661d() {
        if (!this.f8669r) {
            this.f8669r = true;
            this.f8663l.post(new C2792ao.C2793e(new C2926d0(this)));
        }
    }

    /* renamed from: e */
    static GuidanceCenterContentFragment m10664e(int i, int i2, ScreenType screenType, float f, float f2, int i3) {
        GuidanceCenterContentFragment guidanceCenterContentFragment = new GuidanceCenterContentFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("header", i);
        bundle.putInt("message", i2);
        bundle.putSerializable("screenType", screenType);
        bundle.putFloat("topOval", f);
        bundle.putFloat("bottomOval", f2);
        bundle.putInt("retryActionButtonId", i3);
        guidanceCenterContentFragment.setArguments(bundle);
        return guidanceCenterContentFragment;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m10662d(ValueAnimator valueAnimator) {
        TextView textView;
        if (isAdded() && (textView = this.f8657f) != null && this.f8660i != null) {
            textView.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            this.f8660i.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo8790b(boolean z) {
        TextView textView = this.f8657f;
        if (textView != null && this.f8660i != null && this.f8665n != null && this.f8662k != null) {
            Integer valueOf = Integer.valueOf(textView.getCurrentTextColor());
            Integer valueOf2 = Integer.valueOf(C2938dc.m12422h((Context) getActivity()));
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{valueOf, valueOf2});
            ofObject.setDuration(1000);
            ofObject.addUpdateListener(new C2986e0(this));
            ofObject.start();
            Integer valueOf3 = Integer.valueOf(this.f8657f.getCurrentTextColor());
            Integer valueOf4 = Integer.valueOf(C2938dc.m12419g((Context) getActivity()));
            ValueAnimator ofObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{valueOf3, valueOf4});
            ofObject2.setDuration(1000);
            ofObject2.addUpdateListener(new C3052f0(this));
            ofObject2.start();
            if (!z) {
                return;
            }
            if (this.f8659h.getBackground() != null || this.f8666o.getBackground() != null) {
                Integer valueOf5 = Integer.valueOf(C2938dc.m12408e((Context) getActivity(), FaceTecSDK.f8630e.f8606i.readyScreenTextBackgroundColor));
                Integer valueOf6 = Integer.valueOf(C2938dc.m12408e((Context) getActivity(), C2938dc.m12236O()));
                ValueAnimator ofObject3 = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{valueOf5, valueOf6});
                ofObject3.setDuration(1000);
                ofObject3.addUpdateListener(new C3149g0(this));
                ofObject3.start();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m10658b(ValueAnimator valueAnimator) {
        if (isAdded()) {
            LinearLayout linearLayout = this.f8659h;
            if (!(linearLayout == null || linearLayout.getBackground() == null)) {
                C2938dc.m12252a(getActivity(), this.f8667p, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                this.f8659h.setBackground(this.f8667p);
            }
            C3223j jVar = this.f8666o;
            if (jVar != null && jVar.getBackground() != null) {
                C2938dc.m12252a(getActivity(), this.f8668q, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                this.f8666o.setBackground(this.f8668q);
            }
        }
    }
}

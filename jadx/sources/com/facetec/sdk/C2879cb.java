package com.facetec.sdk;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.facetec.sdk.C2792ao;
import com.github.mikephil.charting.utils.Utils;
import org.json.JSONException;
import org.json.JSONObject;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;

/* renamed from: com.facetec.sdk.cb */
public final class C2879cb extends C2792ao {

    /* renamed from: A */
    private TextView f9463A;

    /* renamed from: B */
    private Animatable2Compat$AnimationCallback f9464B;

    /* renamed from: C */
    private RelativeLayout f9465C;

    /* renamed from: D */
    private LinearLayout f9466D;

    /* renamed from: E */
    private boolean f9467E = false;

    /* renamed from: F */
    private boolean f9468F = true;

    /* renamed from: G */
    private boolean f9469G = false;

    /* renamed from: H */
    private EditText f9470H;

    /* renamed from: I */
    private float f9471I = C2938dc.m12372c();

    /* renamed from: a */
    protected RelativeLayout f9472a;

    /* renamed from: b */
    protected ScrollView f9473b;

    /* renamed from: c */
    protected LinearLayout f9474c;

    /* renamed from: d */
    JSONObject f9475d;

    /* renamed from: e */
    protected C2983e f9476e;

    /* renamed from: f */
    protected ImageView f9477f;

    /* renamed from: g */
    protected LinearLayout f9478g;

    /* renamed from: h */
    AnimatedVectorDrawableCompat f9479h;

    /* renamed from: i */
    protected TextView f9480i;

    /* renamed from: j */
    AnimatedVectorDrawableCompat f9481j;

    /* renamed from: k */
    protected int f9482k;

    /* renamed from: l */
    protected Drawable f9483l;

    /* renamed from: m */
    protected boolean f9484m = false;

    /* renamed from: n */
    protected boolean f9485n = true;

    /* renamed from: o */
    protected int f9486o;

    /* renamed from: p */
    final float f9487p;

    /* renamed from: q */
    final int f9488q;

    /* renamed from: r */
    protected boolean f9489r = true;

    /* renamed from: s */
    private int f9490s = 500;

    /* renamed from: t */
    final float f9491t;

    /* renamed from: u */
    private int f9492u = BogInputLayout.INPUT_NORMAL_STATE;

    /* renamed from: v */
    private View f9493v;

    /* renamed from: w */
    private int f9494w = 2000;

    /* renamed from: x */
    private int f9495x = BogInputLayout.INPUT_TYPE_TEXT_PASSWORD;

    /* renamed from: y */
    private View f9496y;

    /* renamed from: z */
    private View f9497z;

    public C2879cb() {
        float e = C2938dc.m12404e();
        this.f9487p = e;
        this.f9491t = this.f9471I * e;
        this.f9488q = C2938dc.m12393d();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m11705a() {
        if (this.f9484m) {
            mo8844e(new C3234ja(this));
        }
    }

    /* renamed from: e */
    static C2879cb m11722e(JSONObject jSONObject) {
        C2879cb cbVar = new C2879cb();
        Bundle bundle = new Bundle();
        bundle.putString("ocrDataJSONString", jSONObject.toString());
        cbVar.setArguments(bundle);
        return cbVar;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2747R.layout.facetec_ocr_confirmation_fragment, viewGroup, false);
        this.f9496y = inflate;
        return inflate;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        int i;
        String string;
        super.onViewCreated(view, bundle);
        Activity activity = getActivity();
        try {
            if (!(getArguments() == null || (string = getArguments().getString("ocrDataJSONString")) == null)) {
                this.f9475d = new JSONObject(string);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.f9493v = view.findViewById(C2747R.C2749id.backgroundView);
        this.f9476e = (C2983e) view.findViewById(C2747R.C2749id.confirmButton);
        this.f9473b = (ScrollView) view.findViewById(C2747R.C2749id.mainContentScrollView);
        this.f9474c = (LinearLayout) view.findViewById(C2747R.C2749id.scrollableContentLayout);
        this.f9466D = (LinearLayout) view.findViewById(C2747R.C2749id.dynamicContentLayout);
        this.f9463A = (TextView) view.findViewById(C2747R.C2749id.mainHeaderTextView);
        this.f9497z = view.findViewById(C2747R.C2749id.mainHeaderDividerLineView);
        this.f9472a = (RelativeLayout) view.findViewById(C2747R.C2749id.scrollDownIndicatorLayout);
        this.f9478g = (LinearLayout) view.findViewById(C2747R.C2749id.scrollDownIndicatorContentLayout);
        this.f9480i = (TextView) view.findViewById(C2747R.C2749id.scrollDownIndicatorTextView);
        this.f9477f = (ImageView) view.findViewById(C2747R.C2749id.scrollDownIndicatorImageView);
        this.f9465C = (RelativeLayout) view.findViewById(C2747R.C2749id.outsetActionButtonLayout);
        FaceTecOCRConfirmationCustomization faceTecOCRConfirmationCustomization = FaceTecSDK.f8630e.f8604g;
        this.f9485n = faceTecOCRConfirmationCustomization.enableFixedConfirmButton;
        this.f9468F = faceTecOCRConfirmationCustomization.enableScrollIndicatorTextAnimation;
        this.f9489r = faceTecOCRConfirmationCustomization.enableScrollIndicator;
        if (faceTecOCRConfirmationCustomization.customScrollIndicatorAnimation == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f9467E = z;
        this.f9486o = C2938dc.m12408e((Context) getActivity(), C2938dc.m12307aw());
        this.f9482k = C2938dc.m12408e((Context) getActivity(), C2938dc.m12304at());
        int round = Math.round(this.f9491t * 20.0f);
        Typeface typeface = FaceTecSDK.f8630e.f8604g.mainHeaderFont;
        int e2 = C2938dc.m12408e((Context) activity, C2938dc.m12302ar());
        int round2 = Math.round(C2810ax.m10988b(C2938dc.m12439m()));
        if (round2 == 0) {
            i = 0;
        } else {
            i = 1;
        }
        int max = Math.max(i, Math.round(((float) round2) * this.f9487p));
        int e3 = C2938dc.m12408e((Context) activity, C2938dc.m12297am());
        C2923cy.m12209e(this.f9463A, C2747R.string.FaceTec_idscan_ocr_confirmation_main_header);
        this.f9463A.setTextColor(e2);
        this.f9463A.setTypeface(typeface);
        this.f9463A.setTextSize((float) round);
        ((LinearLayout.LayoutParams) this.f9463A.getLayoutParams()).setMargins(0, 0, 0, this.f9488q);
        this.f9497z.getLayoutParams().height = max;
        int i2 = this.f9488q;
        ((LinearLayout.LayoutParams) this.f9497z.getLayoutParams()).setMargins(i2, 0, i2, 0);
        this.f9497z.setBackgroundColor(e3);
        int round3 = Math.round(C2810ax.m10988b(50) * this.f9491t);
        this.f9476e.getLayoutParams().height = round3;
        if (this.f9485n) {
            this.f9474c.removeView(this.f9476e);
            this.f9465C.addView(this.f9476e);
            this.f9465C.setVisibility(0);
            int i3 = this.f9488q;
            ((RelativeLayout.LayoutParams) this.f9476e.getLayoutParams()).setMargins(i3, 0, i3, i3);
        } else {
            int i4 = this.f9488q;
            ((LinearLayout.LayoutParams) this.f9476e.getLayoutParams()).setMargins(i4, i4 << 1, i4, 0);
        }
        C2923cy.m12209e(this.f9476e, C2747R.string.FaceTec_action_confirm);
        this.f9476e.setEnabled(true);
        this.f9476e.mo9157c();
        this.f9476e.mo9155a(new C2792ao.C2793e(new C3545ra(this)));
        if (this.f9485n) {
            int i5 = this.f9488q;
            ((RelativeLayout.LayoutParams) this.f9473b.getLayoutParams()).setMargins(0, i5, 0, (i5 << 1) + round3);
        } else {
            int i6 = this.f9488q;
            ((RelativeLayout.LayoutParams) this.f9473b.getLayoutParams()).setMargins(0, i6, 0, i6);
        }
        C2938dc.m12380c(this.f9493v);
        this.f9493v.getBackground().setAlpha(C2938dc.m12277aS());
        Drawable e4 = C0767a.m2895e(activity, C2747R.C2748drawable.facetec_scrollbar_vertical_track);
        Drawable e5 = C0767a.m2895e(activity, C2747R.C2748drawable.facetec_scrollbar_vertical_thumb);
        int b = C2938dc.m12312b(e2, 128);
        int round4 = Math.round(C2810ax.m10988b(10) * this.f9491t);
        int round5 = Math.round(C2810ax.m10988b(5) * this.f9491t);
        if (e4 != null) {
            GradientDrawable gradientDrawable = (GradientDrawable) e4;
            gradientDrawable.setColor(0);
            gradientDrawable.setCornerRadius((float) round5);
        }
        if (e5 != null) {
            GradientDrawable gradientDrawable2 = (GradientDrawable) e5;
            gradientDrawable2.setColor(b);
            gradientDrawable2.setCornerRadius((float) round5);
        }
        this.f9474c.setScrollBarSize(round4);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f9474c.setVerticalScrollbarTrackDrawable(e4);
            this.f9474c.setVerticalScrollbarThumbDrawable(e5);
        }
        this.f9474c.setOnTouchListener(new C3502p9(this));
        mo8844e(new C3523q9(this, getActivity(), this.f9475d));
        mo8844e(new C3544r9(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m11706a(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f9486o = intValue;
        this.f9480i.setTextColor(intValue);
        this.f9480i.postInvalidate();
        if (this.f9467E) {
            this.f9477f.setColorFilter(this.f9486o, PorterDuff.Mode.SRC_IN);
            this.f9477f.postInvalidate();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v13, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v15, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v16, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v17, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v18, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v19, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v20, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r21v21 */
    /* JADX WARNING: type inference failed for: r21v22 */
    /* JADX WARNING: type inference failed for: r21v23 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0402 A[LOOP:2: B:100:0x03fc->B:102:0x0402, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0435 A[LOOP:3: B:104:0x042f->B:106:0x0435, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m11715c(android.content.Context r41, org.json.JSONObject r42) {
        /*
            r40 = this;
            r9 = r40
            r10 = r41
            java.lang.String r0 = "uiFieldDescriptionText"
            java.lang.String r11 = "fieldFriendlyName"
            java.lang.String r12 = "groupFriendlyName"
            r1 = 30
            float r1 = com.facetec.sdk.C2810ax.m10988b((int) r1)
            float r2 = r9.f9491t
            float r1 = r1 * r2
            int r13 = java.lang.Math.round(r1)
            r1 = 100
            float r1 = com.facetec.sdk.C2810ax.m10988b((int) r1)
            float r2 = r9.f9491t
            float r1 = r1 * r2
            int r14 = java.lang.Math.round(r1)
            r1 = 1098907648(0x41800000, float:16.0)
            float r2 = r9.f9491t
            float r2 = r2 * r1
            int r15 = java.lang.Math.round(r2)
            r1 = 1094713344(0x41400000, float:12.0)
            float r2 = r9.f9491t
            float r2 = r2 * r1
            int r8 = java.lang.Math.round(r2)
            com.facetec.sdk.FaceTecCustomization r1 = com.facetec.sdk.FaceTecSDK.f8630e
            com.facetec.sdk.FaceTecOCRConfirmationCustomization r1 = r1.f8604g
            android.graphics.Typeface r7 = r1.sectionHeaderFont
            int r1 = com.facetec.sdk.C2938dc.m12301aq()
            int r6 = com.facetec.sdk.C2938dc.m12408e((android.content.Context) r10, (int) r1)
            com.facetec.sdk.FaceTecCustomization r1 = com.facetec.sdk.FaceTecSDK.f8630e
            com.facetec.sdk.FaceTecOCRConfirmationCustomization r1 = r1.f8604g
            android.graphics.Typeface r5 = r1.fieldLabelFont
            int r1 = com.facetec.sdk.C2938dc.m12298an()
            int r4 = com.facetec.sdk.C2938dc.m12408e((android.content.Context) r10, (int) r1)
            com.facetec.sdk.FaceTecCustomization r1 = com.facetec.sdk.FaceTecSDK.f8630e
            com.facetec.sdk.FaceTecOCRConfirmationCustomization r1 = r1.f8604g
            android.graphics.Typeface r3 = r1.inputFieldFont
            int r1 = com.facetec.sdk.C2938dc.m12299ao()
            int r2 = com.facetec.sdk.C2938dc.m12408e((android.content.Context) r10, (int) r1)
            int r1 = com.facetec.sdk.C2938dc.m12373c((android.content.Context) r41)
            int r1 = com.facetec.sdk.C2938dc.m12408e((android.content.Context) r10, (int) r1)
            int r16 = com.facetec.sdk.C2938dc.m12445p()
            float r16 = com.facetec.sdk.C2810ax.m10988b((int) r16)
            r17 = r3
            int r3 = java.lang.Math.round(r16)
            r16 = r1
            if (r3 != 0) goto L_0x007c
            r1 = 0
            goto L_0x007d
        L_0x007c:
            r1 = 1
        L_0x007d:
            float r3 = (float) r3
            r20 = r2
            float r2 = r9.f9487p
            float r3 = r3 * r2
            int r2 = java.lang.Math.round(r3)
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = com.facetec.sdk.C2938dc.m12226E()
            float r2 = com.facetec.sdk.C2810ax.m10988b((int) r2)
            int r2 = java.lang.Math.round(r2)
            if (r2 != 0) goto L_0x009b
            r3 = 0
            goto L_0x009c
        L_0x009b:
            r3 = 1
        L_0x009c:
            float r2 = (float) r2
            r21 = r13
            float r13 = r9.f9487p
            float r2 = r2 * r13
            int r2 = java.lang.Math.round(r2)
            int r2 = java.lang.Math.max(r3, r2)
            int r3 = com.facetec.sdk.C2938dc.m12303as()
            int r3 = com.facetec.sdk.C2938dc.m12408e((android.content.Context) r10, (int) r3)
            int r13 = com.facetec.sdk.C2938dc.m12300ap()
            int r13 = com.facetec.sdk.C2938dc.m12408e((android.content.Context) r10, (int) r13)
            r22 = r5
            int r5 = com.facetec.sdk.C2747R.C2748drawable.facetec_ocr_input_background
            android.graphics.drawable.Drawable r5 = androidx.core.content.C0767a.m2895e(r10, r5)
            android.graphics.drawable.LayerDrawable r5 = (android.graphics.drawable.LayerDrawable) r5
            r29 = r4
            if (r5 == 0) goto L_0x00f6
            int r4 = com.facetec.sdk.C2747R.C2749id.gradientDrawable
            android.graphics.drawable.Drawable r4 = r5.findDrawableByLayerId(r4)
            android.graphics.drawable.GradientDrawable r4 = (android.graphics.drawable.GradientDrawable) r4
            r4.setStroke(r1, r3)
            float r2 = (float) r2
            r4.setCornerRadius(r2)
            r4.setColor(r13)
            com.facetec.sdk.FaceTecCustomization r2 = com.facetec.sdk.FaceTecSDK.f8630e
            com.facetec.sdk.FaceTecOCRConfirmationCustomization r2 = r2.f8604g
            boolean r2 = r2.showInputFieldBottomBorderOnly
            if (r2 == 0) goto L_0x00f6
            r24 = 0
            int r1 = -r1
            r28 = 0
            r23 = r5
            r25 = r1
            r26 = r1
            r27 = r1
            r23.setLayerInset(r24, r25, r26, r27, r28)
            r1 = 0
            r4.setCornerRadius(r1)
        L_0x00f6:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.lang.String r1 = "groups"
            r2 = r42
            org.json.JSONArray r4 = r2.optJSONArray(r1)     // Catch:{ JSONException -> 0x03da }
            if (r4 != 0) goto L_0x0106
            return
        L_0x0106:
            r3 = 0
        L_0x0107:
            int r1 = r4.length()     // Catch:{ JSONException -> 0x03da }
            if (r3 >= r1) goto L_0x03d3
            org.json.JSONObject r1 = r4.optJSONObject(r3)     // Catch:{ JSONException -> 0x03da }
            if (r1 != 0) goto L_0x0114
            return
        L_0x0114:
            java.lang.String r2 = "fields"
            org.json.JSONArray r2 = r1.optJSONArray(r2)     // Catch:{ JSONException -> 0x03da }
            if (r2 != 0) goto L_0x011d
            return
        L_0x011d:
            int r23 = r2.length()     // Catch:{ JSONException -> 0x03da }
            if (r23 <= 0) goto L_0x038d
            r23 = r3
            java.lang.String r3 = "groupKey"
            java.lang.String r3 = r1.optString(r3)     // Catch:{ JSONException -> 0x03da }
            java.lang.String r1 = r1.optString(r12)     // Catch:{ JSONException -> 0x03da }
            r42 = r4
            r4 = 0
            java.lang.String r1 = r9.m11712c(r3, r4, r12, r1)     // Catch:{ JSONException -> 0x03da }
            android.widget.TextView r4 = new android.widget.TextView     // Catch:{ JSONException -> 0x03da }
            r4.<init>(r10)     // Catch:{ JSONException -> 0x03da }
            r24 = r12
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams     // Catch:{ JSONException -> 0x03da }
            r25 = r5
            r5 = -2
            r12.<init>(r5, r5)     // Catch:{ JSONException -> 0x03da }
            int r5 = r9.f9488q     // Catch:{ JSONException -> 0x03da }
            r27 = r13
            float r13 = (float) r5
            r28 = 1073741824(0x40000000, float:2.0)
            float r13 = r13 / r28
            int r13 = java.lang.Math.round(r13)     // Catch:{ JSONException -> 0x0387 }
            r12.setMargins(r5, r5, r5, r13)     // Catch:{ JSONException -> 0x0387 }
            r5 = 17
            r12.gravity = r5     // Catch:{ JSONException -> 0x0387 }
            r4.setLayoutParams(r12)     // Catch:{ JSONException -> 0x0387 }
            float r5 = (float) r15     // Catch:{ JSONException -> 0x0387 }
            r4.setTextSize(r5)     // Catch:{ JSONException -> 0x0387 }
            r4.setText(r1)     // Catch:{ JSONException -> 0x0387 }
            r4.setTextColor(r6)     // Catch:{ JSONException -> 0x0387 }
            r4.setTypeface(r7)     // Catch:{ JSONException -> 0x0387 }
            android.widget.LinearLayout r1 = r9.f9466D     // Catch:{ JSONException -> 0x0387 }
            r1.addView(r4)     // Catch:{ JSONException -> 0x0387 }
            r12 = 0
            r13 = 0
        L_0x0170:
            int r1 = r2.length()     // Catch:{ JSONException -> 0x0387 }
            if (r12 >= r1) goto L_0x035b
            org.json.JSONObject r1 = r2.getJSONObject(r12)     // Catch:{ JSONException -> 0x0387 }
            java.lang.String r5 = "fieldKey"
            java.lang.String r5 = r1.optString(r5)     // Catch:{ JSONException -> 0x0387 }
            r28 = r2
            java.lang.String r2 = r1.optString(r11)     // Catch:{ JSONException -> 0x0387 }
            java.lang.String r2 = r9.m11712c(r3, r5, r11, r2)     // Catch:{ JSONException -> 0x0387 }
            r30 = r4
            java.lang.String r4 = r1.optString(r0)     // Catch:{ JSONException -> 0x0387 }
            java.lang.String r4 = r9.m11712c(r3, r5, r0, r4)     // Catch:{ JSONException -> 0x0387 }
            java.lang.String r5 = "scannedValue"
            java.lang.String r5 = r1.optString(r5)     // Catch:{ JSONException -> 0x0387 }
            android.content.res.Resources r31 = r40.getResources()     // Catch:{ JSONException -> 0x0387 }
            r32 = r0
            android.content.res.Configuration r0 = r31.getConfiguration()     // Catch:{ JSONException -> 0x0387 }
            java.util.Locale r0 = r0.locale     // Catch:{ JSONException -> 0x0387 }
            java.lang.String r0 = r5.toUpperCase(r0)     // Catch:{ JSONException -> 0x0387 }
            java.lang.String r5 = "uiEditable"
            boolean r1 = r1.optBoolean(r5)     // Catch:{ JSONException -> 0x0387 }
            if (r1 == 0) goto L_0x0310
            android.widget.LinearLayout r5 = new android.widget.LinearLayout     // Catch:{ JSONException -> 0x0387 }
            r5.<init>(r10)     // Catch:{ JSONException -> 0x0387 }
            r1 = 0
            r5.setOrientation(r1)     // Catch:{ JSONException -> 0x0307 }
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams     // Catch:{ JSONException -> 0x0387 }
            r31 = r3
            r3 = -1
            r33 = r6
            r6 = -2
            r1.<init>(r3, r6)     // Catch:{ JSONException -> 0x0387 }
            int r6 = r9.f9488q     // Catch:{ JSONException -> 0x0387 }
            int r3 = r6 / 4
            r35 = r7
            int r7 = r6 / 4
            r1.setMargins(r6, r3, r6, r7)     // Catch:{ JSONException -> 0x0387 }
            r5.setLayoutParams(r1)     // Catch:{ JSONException -> 0x0387 }
            android.widget.TextView r1 = new android.widget.TextView     // Catch:{ JSONException -> 0x0387 }
            r1.<init>(r10)     // Catch:{ JSONException -> 0x0387 }
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams     // Catch:{ JSONException -> 0x0387 }
            r6 = -2
            r3.<init>(r14, r6)     // Catch:{ JSONException -> 0x0387 }
            r7 = 0
            r3.setMargins(r7, r7, r7, r7)     // Catch:{ JSONException -> 0x0303 }
            int r7 = r9.f9488q     // Catch:{ JSONException -> 0x0387 }
            int r7 = r7 / 2
            r3.setMarginEnd(r7)     // Catch:{ JSONException -> 0x0387 }
            r1.setLayoutParams(r3)     // Catch:{ JSONException -> 0x0387 }
            float r3 = (float) r8     // Catch:{ JSONException -> 0x0387 }
            r1.setTextSize(r3)     // Catch:{ JSONException -> 0x0387 }
            r1.setText(r2)     // Catch:{ JSONException -> 0x0387 }
            r7 = r29
            r1.setTextColor(r7)     // Catch:{ JSONException -> 0x0387 }
            r2 = r22
            r1.setTypeface(r2)     // Catch:{ JSONException -> 0x0387 }
            r6 = 1
            r1.setMaxLines(r6)     // Catch:{ JSONException -> 0x0387 }
            r1.setSingleLine(r6)     // Catch:{ JSONException -> 0x0387 }
            android.text.TextUtils$TruncateAt r6 = android.text.TextUtils.TruncateAt.END     // Catch:{ JSONException -> 0x0387 }
            r1.setEllipsize(r6)     // Catch:{ JSONException -> 0x0387 }
            r6 = 5
            r1.setTextDirection(r6)     // Catch:{ JSONException -> 0x0387 }
            r6 = r27
            r6.add(r1)     // Catch:{ JSONException -> 0x02fc }
            r5.addView(r1)     // Catch:{ JSONException -> 0x02fc }
            android.widget.EditText r1 = new android.widget.EditText     // Catch:{ JSONException -> 0x02fc }
            r1.<init>(r10)     // Catch:{ JSONException -> 0x02fc }
            r27 = r2
            int r2 = r9.f9488q     // Catch:{ JSONException -> 0x02fc }
            int r2 = r2 / 4
            r29 = r5
            int r5 = r2 << 1
            r1.setPadding(r2, r5, r2, r5)     // Catch:{ JSONException -> 0x02fc }
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams     // Catch:{ JSONException -> 0x02fc }
            r5 = r21
            r21 = r6
            r6 = -1
            r2.<init>(r6, r5)     // Catch:{ JSONException -> 0x02fa }
            r6 = 0
            r2.setMargins(r6, r6, r6, r6)     // Catch:{ JSONException -> 0x02f3 }
            r1.setLayoutParams(r2)     // Catch:{ JSONException -> 0x02fa }
            r2 = r20
            r1.setTextColor(r2)     // Catch:{ JSONException -> 0x02fa }
            r1.setTextSize(r3)     // Catch:{ JSONException -> 0x02fa }
            r3 = r16
            r1.setHintTextColor(r3)     // Catch:{ JSONException -> 0x02fa }
            r1.setText(r0)     // Catch:{ JSONException -> 0x02fa }
            r1.setHint(r4)     // Catch:{ JSONException -> 0x02fa }
            r0 = r17
            r1.setTypeface(r0)     // Catch:{ JSONException -> 0x02fa }
            r6 = r25
            r1.setBackground(r6)     // Catch:{ JSONException -> 0x02fa }
            r4 = 5
            r1.setTextDirection(r4)     // Catch:{ JSONException -> 0x02fa }
            android.text.InputFilter[] r4 = r1.getFilters()     // Catch:{ JSONException -> 0x02fa }
            r17 = r0
            int r0 = r4.length     // Catch:{ JSONException -> 0x02fa }
            r16 = 1
            int r0 = r0 + 1
            android.text.InputFilter[] r0 = new android.text.InputFilter[r0]     // Catch:{ JSONException -> 0x02fa }
            r20 = r2
            int r2 = r4.length     // Catch:{ JSONException -> 0x02fa }
            r18 = r3
            r3 = 0
            java.lang.System.arraycopy(r4, r3, r0, r3, r2)     // Catch:{ JSONException -> 0x02ef }
            int r2 = r4.length     // Catch:{ JSONException -> 0x02ef }
            android.text.InputFilter$AllCaps r4 = new android.text.InputFilter$AllCaps     // Catch:{ JSONException -> 0x02ef }
            r4.<init>()     // Catch:{ JSONException -> 0x02ef }
            r0[r2] = r4     // Catch:{ JSONException -> 0x02ef }
            r1.setFilters(r0)     // Catch:{ JSONException -> 0x02ef }
            r0 = 4096(0x1000, float:5.74E-42)
            r1.setInputType(r0)     // Catch:{ JSONException -> 0x02ef }
            r0 = 6
            r1.setImeOptions(r0)     // Catch:{ JSONException -> 0x02ef }
            com.facetec.sdk.FaceTecCustomization r0 = com.facetec.sdk.FaceTecSDK.f8630e     // Catch:{ JSONException -> 0x02ef }
            com.facetec.sdk.FaceTecOCRConfirmationCustomization r0 = r0.f8604g     // Catch:{ JSONException -> 0x02ef }
            android.graphics.Typeface r4 = r0.inputFieldFont     // Catch:{ JSONException -> 0x02ef }
            android.graphics.Typeface r0 = r0.inputFieldPlaceholderFont     // Catch:{ JSONException -> 0x02ef }
            if (r4 == r0) goto L_0x0291
            r19 = r16
            goto L_0x0293
        L_0x0291:
            r19 = r3
        L_0x0293:
            com.facetec.sdk.cb$4 r2 = new com.facetec.sdk.cb$4     // Catch:{ JSONException -> 0x02ef }
            r22 = r16
            r16 = r3
            r3 = r1
            r1 = r2
            r25 = r20
            r20 = r27
            r27 = r28
            r28 = r11
            r11 = r2
            r2 = r40
            r34 = r3
            r3 = r19
            r36 = r4
            r19 = r7
            r7 = r30
            r30 = r42
            r4 = r34
            r26 = r20
            r37 = -2
            r20 = r5
            r39 = r29
            r29 = r6
            r6 = r39
            r5 = r0
            r0 = r6
            r6 = r36
            r36 = r14
            r14 = r7
            r7 = r23
            r38 = r8
            r8 = r12
            r1.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ JSONException -> 0x0384 }
            r1 = r34
            r1.addTextChangedListener(r11)     // Catch:{ JSONException -> 0x0384 }
            com.facetec.sdk.t9 r2 = new com.facetec.sdk.t9     // Catch:{ JSONException -> 0x0384 }
            r2.<init>(r9, r1)     // Catch:{ JSONException -> 0x0384 }
            r1.setOnFocusChangeListener(r2)     // Catch:{ JSONException -> 0x0384 }
            com.facetec.sdk.u9 r2 = new com.facetec.sdk.u9     // Catch:{ JSONException -> 0x0384 }
            r2.<init>(r9, r1)     // Catch:{ JSONException -> 0x0384 }
            r1.setOnEditorActionListener(r2)     // Catch:{ JSONException -> 0x0384 }
            r0.addView(r1)     // Catch:{ JSONException -> 0x0384 }
            android.widget.LinearLayout r1 = r9.f9466D     // Catch:{ JSONException -> 0x0384 }
            r1.addView(r0)     // Catch:{ JSONException -> 0x0384 }
            int r13 = r13 + 1
            goto L_0x0336
        L_0x02ef:
            r0 = move-exception
            r16 = r3
            goto L_0x02f6
        L_0x02f3:
            r0 = move-exception
            r16 = r6
        L_0x02f6:
            r38 = r8
            goto L_0x03e1
        L_0x02fa:
            r0 = move-exception
            goto L_0x02ff
        L_0x02fc:
            r0 = move-exception
            r21 = r6
        L_0x02ff:
            r38 = r8
            goto L_0x03df
        L_0x0303:
            r0 = move-exception
            r16 = r7
            goto L_0x030a
        L_0x0307:
            r0 = move-exception
            r16 = r1
        L_0x030a:
            r38 = r8
            r21 = r27
            goto L_0x03e1
        L_0x0310:
            r31 = r3
            r33 = r6
            r35 = r7
            r38 = r8
            r36 = r14
            r18 = r16
            r26 = r22
            r19 = r29
            r14 = r30
            r16 = 0
            r22 = 1
            r37 = -2
            r30 = r42
            r29 = r25
            r25 = r20
            r20 = r21
            r21 = r27
            r27 = r28
            r28 = r11
        L_0x0336:
            int r12 = r12 + 1
            r4 = r14
            r16 = r18
            r22 = r26
            r2 = r27
            r11 = r28
            r42 = r30
            r3 = r31
            r0 = r32
            r6 = r33
            r7 = r35
            r14 = r36
            r8 = r38
            r27 = r21
            r21 = r20
            r20 = r25
            r25 = r29
            r29 = r19
            goto L_0x0170
        L_0x035b:
            r30 = r42
            r32 = r0
            r33 = r6
            r35 = r7
            r38 = r8
            r28 = r11
            r36 = r14
            r18 = r16
            r26 = r22
            r19 = r29
            r16 = 0
            r22 = 1
            r14 = r4
            r29 = r25
            r25 = r20
            r20 = r21
            r21 = r27
            if (r13 != 0) goto L_0x03b1
            android.widget.LinearLayout r0 = r9.f9466D     // Catch:{ JSONException -> 0x0384 }
            r0.removeView(r14)     // Catch:{ JSONException -> 0x0384 }
            goto L_0x03b1
        L_0x0384:
            r0 = move-exception
            goto L_0x03e1
        L_0x0387:
            r0 = move-exception
            r38 = r8
            r21 = r27
            goto L_0x03df
        L_0x038d:
            r32 = r0
            r23 = r3
            r30 = r4
            r33 = r6
            r35 = r7
            r38 = r8
            r28 = r11
            r24 = r12
            r36 = r14
            r18 = r16
            r25 = r20
            r20 = r21
            r26 = r22
            r19 = r29
            r16 = 0
            r22 = 1
            r29 = r5
            r21 = r13
        L_0x03b1:
            int r3 = r23 + 1
            r16 = r18
            r13 = r21
            r12 = r24
            r22 = r26
            r11 = r28
            r5 = r29
            r4 = r30
            r0 = r32
            r6 = r33
            r7 = r35
            r14 = r36
            r8 = r38
            r29 = r19
            r21 = r20
            r20 = r25
            goto L_0x0107
        L_0x03d3:
            r38 = r8
            r21 = r13
            r16 = 0
            goto L_0x03e4
        L_0x03da:
            r0 = move-exception
            r38 = r8
            r21 = r13
        L_0x03df:
            r16 = 0
        L_0x03e1:
            r0.printStackTrace()
        L_0x03e4:
            float r0 = com.facetec.sdk.C2810ax.m10998e((int) r38)
            int r0 = java.lang.Math.round(r0)
            r1 = 120(0x78, float:1.68E-43)
            float r1 = com.facetec.sdk.C2810ax.m10988b((int) r1)
            float r2 = r9.f9491t
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            r2 = r16
            r3 = r2
        L_0x03fc:
            int r4 = r21.size()
            if (r2 >= r4) goto L_0x0427
            r4 = r21
            java.lang.Object r5 = r4.get(r2)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.CharSequence r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            com.facetec.sdk.FaceTecCustomization r6 = com.facetec.sdk.FaceTecSDK.f8630e
            com.facetec.sdk.FaceTecOCRConfirmationCustomization r6 = r6.f8604g
            android.graphics.Typeface r6 = r6.fieldLabelFont
            com.facetec.sdk.ax$a r5 = com.facetec.sdk.C2810ax.m10984a(r5, r0, r6)
            int r5 = r5.mo8869d()
            int r3 = java.lang.Math.max(r3, r5)
            int r2 = r2 + 1
            goto L_0x03fc
        L_0x0427:
            r4 = r21
            int r0 = java.lang.Math.min(r1, r3)
            r1 = r16
        L_0x042f:
            int r2 = r4.size()
            if (r1 >= r2) goto L_0x0444
            java.lang.Object r2 = r4.get(r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            r2.width = r0
            int r1 = r1 + 1
            goto L_0x042f
        L_0x0444:
            android.widget.ScrollView r0 = r9.f9473b
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            boolean r1 = r0.isAlive()
            if (r1 == 0) goto L_0x0458
            com.facetec.sdk.cb$5 r1 = new com.facetec.sdk.cb$5
            r1.<init>(r10)
            r0.addOnGlobalLayoutListener(r1)
        L_0x0458:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2879cb.m11715c(android.content.Context, org.json.JSONObject):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m11719d() {
        this.f9480i.animate().alpha(1.0f).setStartDelay(0).setDuration(300).setListener((Animator.AnimatorListener) null).withEndAction(new C3212ia(this)).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m11726f() {
        if (!this.f9484m) {
            this.f9484m = true;
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = this.f9479h;
            if (animatedVectorDrawableCompat != null) {
                animatedVectorDrawableCompat.start();
            } else {
                AnimatedVectorDrawableCompat animatedVectorDrawableCompat2 = this.f9481j;
                if (animatedVectorDrawableCompat2 != null) {
                    animatedVectorDrawableCompat2.start();
                }
            }
            if (this.f9468F) {
                m11705a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m11728g() {
        if (this.f9472a.getVisibility() == 0) {
            this.f9472a.animate().alpha(1.0f).setDuration(500).setListener((Animator.AnimatorListener) null).withEndAction(new C3572s9(this)).start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m11730h() {
        this.f9477f.setImageDrawable(this.f9479h);
        C28801 r0 = new Animatable2Compat$AnimationCallback() {
            public final void onAnimationEnd(Drawable drawable) {
                C2879cb.this.mo8844e(new C3573sa(this));
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m11749a() {
                AnimatedVectorDrawableCompat animatedVectorDrawableCompat = C2879cb.this.f9479h;
                if (animatedVectorDrawableCompat != null) {
                    animatedVectorDrawableCompat.start();
                }
            }
        };
        this.f9464B = r0;
        this.f9479h.mo6269d(r0);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m11732i() {
        this.f9465C.animate().alpha(1.0f).setDuration(500).setStartDelay(1000).setListener((Animator.AnimatorListener) null).start();
        this.f9476e.animate().alpha(1.0f).setDuration(500).setStartDelay(1000).setListener((Animator.AnimatorListener) null).start();
        this.f9473b.animate().alpha(1.0f).setDuration(500).setStartDelay(1000).setListener((Animator.AnimatorListener) null).withEndAction(new C3524qa(this)).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m11734j() {
        this.f9481j = C2810ax.m10990b(getActivity(), C2747R.C2748drawable.facetec_animated_double_down_chevron);
        this.f9477f.setColorFilter(C2938dc.m12307aw(), PorterDuff.Mode.SRC_IN);
        this.f9477f.setImageDrawable(this.f9481j);
        C28812 r0 = new Animatable2Compat$AnimationCallback() {
            /* access modifiers changed from: private */
            /* renamed from: c */
            public /* synthetic */ void m11752c() {
                AnimatedVectorDrawableCompat animatedVectorDrawableCompat = C2879cb.this.f9481j;
                if (animatedVectorDrawableCompat != null) {
                    animatedVectorDrawableCompat.start();
                }
            }

            public final void onAnimationEnd(Drawable drawable) {
                C2879cb.this.mo8844e(new C3594ta(this));
            }
        };
        this.f9464B = r0;
        this.f9481j.mo6269d(r0);
        this.f9477f.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m11737l() {
        C2831bd bdVar = (C2831bd) getActivity();
        if (bdVar != null) {
            bdVar.mo8943b(this.f9475d);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m11740n() {
        this.f9476e.mo9158c(false, true);
        mo8844e(new C3700y9(this, new C2792ao.C2793e(new C3679x9(this))));
    }

    /* renamed from: d */
    static /* synthetic */ void m11720d(C2879cb cbVar) {
        cbVar.f9484m = false;
        cbVar.f9472a.animate().alpha(Utils.FLOAT_EPSILON).setDuration(300).setListener((Animator.AnimatorListener) null).withEndAction(new C3721z9(cbVar)).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ boolean m11725e(View view, MotionEvent motionEvent) {
        EditText editText;
        if (motionEvent.getAction() == 0 && (editText = this.f9470H) != null && editText.isFocused()) {
            Rect rect = new Rect();
            this.f9470H.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                this.f9470H.clearFocus();
                m11716c(view);
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m11709a(String str) {
        if (!this.f9469G) {
            C2797ar.m10878a(str);
        }
    }

    /* renamed from: a */
    private static String m11704a(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m11707a(EditText editText, View view, boolean z) {
        if (editText != null) {
            if (z) {
                this.f9470H = editText;
                editText.setCursorVisible(true);
                return;
            }
            this.f9470H = null;
            editText.setCursorVisible(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m11724e(C2792ao.C2793e eVar) {
        this.f9465C.animate().alpha(Utils.FLOAT_EPSILON).setDuration(500).setListener((Animator.AnimatorListener) null).start();
        this.f9476e.animate().alpha(Utils.FLOAT_EPSILON).setDuration(500).setListener((Animator.AnimatorListener) null).start();
        this.f9473b.animate().alpha(Utils.FLOAT_EPSILON).setDuration(500).setListener((Animator.AnimatorListener) null).withEndAction(eVar).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m11710a(EditText editText, TextView textView, int i, KeyEvent keyEvent) {
        if (editText == null) {
            return false;
        }
        editText.setCursorVisible(false);
        if (keyEvent != null && keyEvent.getKeyCode() == 66) {
            m11716c((View) textView);
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m11723e() {
        Animatable2Compat$AnimationCallback animatable2Compat$AnimationCallback;
        Animatable2Compat$AnimationCallback animatable2Compat$AnimationCallback2;
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = this.f9479h;
        if (!(animatedVectorDrawableCompat == null || (animatable2Compat$AnimationCallback2 = this.f9464B) == null)) {
            animatedVectorDrawableCompat.mo6284h(animatable2Compat$AnimationCallback2);
            this.f9479h.stop();
            this.f9479h = null;
            this.f9464B = null;
        }
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat2 = this.f9481j;
        if (!(animatedVectorDrawableCompat2 == null || (animatable2Compat$AnimationCallback = this.f9464B) == null)) {
            animatedVectorDrawableCompat2.mo6284h(animatable2Compat$AnimationCallback);
            this.f9481j.stop();
            this.f9481j = null;
            this.f9464B = null;
        }
        this.f9472a.setVisibility(8);
    }

    /* renamed from: a */
    static /* synthetic */ void m11708a(C2879cb cbVar, Context context) {
        int aJ = C2938dc.m12268aJ();
        int aI = C2938dc.m12267aI();
        if (aJ != 0) {
            cbVar.f9479h = C2810ax.m10990b(cbVar.getActivity(), aJ);
        }
        if (cbVar.f9479h != null) {
            cbVar.mo8844e(new C3482oa(cbVar));
            cbVar.f9477f.setVisibility(0);
        } else if (aI != 0) {
            cbVar.f9477f.setImageResource(aI);
            cbVar.f9477f.clearAnimation();
            cbVar.f9477f.setVisibility(0);
        } else {
            cbVar.mo8844e(new C3503pa(cbVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m11713c() {
        this.f9480i.animate().alpha(Utils.FLOAT_EPSILON).setStartDelay(2000).setDuration(300).setListener((Animator.AnimatorListener) null).withEndAction(new C3190ha(this)).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m11714c(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f9482k = intValue;
        ((GradientDrawable) this.f9483l).setColor(intValue);
        this.f9472a.setBackground(this.f9483l);
        this.f9472a.postInvalidate();
    }

    /* JADX WARNING: Removed duplicated region for block: B:86:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m11712c(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r3 = r19
            r0 = r20
            r4 = r21
            org.json.JSONObject r5 = com.facetec.sdk.C2840bg.f9208i
            r6 = 0
            if (r5 == 0) goto L_0x01ce
            java.lang.String r7 = "groups"
            org.json.JSONArray r5 = r5.optJSONArray(r7)     // Catch:{ JSONException -> 0x01c5 }
            java.lang.String r7 = "\" key-value pair in the group object with a \"groupKey\" value of \""
            java.lang.String r8 = "\" key-value pair in the field object with a \"fieldKey\" value of \""
            java.lang.String r9 = "\" for this OCR string. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK."
            java.lang.String r10 = "OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is missing a valid \""
            if (r5 != 0) goto L_0x0026
            java.lang.String r5 = "OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is missing \"groups\" key. Falling back to use internal default values for all OCR strings. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK."
            r1.m11709a((java.lang.String) r5)     // Catch:{ JSONException -> 0x01c5 }
            goto L_0x0172
        L_0x0026:
            int r11 = r5.length()     // Catch:{ JSONException -> 0x01c5 }
            if (r11 != 0) goto L_0x0033
            java.lang.String r5 = "OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON has an empty array for the value of the \"groups\" key. Falling back to use internal default values for all OCR strings. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK."
            r1.m11709a((java.lang.String) r5)     // Catch:{ JSONException -> 0x01c5 }
            goto L_0x0172
        L_0x0033:
            r12 = 0
        L_0x0034:
            int r13 = r5.length()     // Catch:{ JSONException -> 0x01c5 }
            if (r12 >= r13) goto L_0x0172
            org.json.JSONObject r13 = r5.getJSONObject(r12)     // Catch:{ JSONException -> 0x01c5 }
            java.lang.String r14 = "groupKey"
            java.lang.String r14 = m11704a((org.json.JSONObject) r13, (java.lang.String) r14)     // Catch:{ JSONException -> 0x01c5 }
            if (r14 == 0) goto L_0x0165
            boolean r15 = r14.isEmpty()     // Catch:{ JSONException -> 0x01c5 }
            if (r15 == 0) goto L_0x004e
            goto L_0x0165
        L_0x004e:
            boolean r14 = r14.equals(r2)     // Catch:{ JSONException -> 0x01c5 }
            if (r14 == 0) goto L_0x0162
            if (r3 != 0) goto L_0x0086
            java.lang.String r6 = m11704a((org.json.JSONObject) r13, (java.lang.String) r0)     // Catch:{ JSONException -> 0x01c5 }
            if (r6 != 0) goto L_0x0082
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x007e }
            r6.<init>(r10)     // Catch:{ JSONException -> 0x007e }
            r6.append(r0)     // Catch:{ JSONException -> 0x007e }
            r6.append(r7)     // Catch:{ JSONException -> 0x007e }
            r6.append(r2)     // Catch:{ JSONException -> 0x007e }
            java.lang.String r14 = "\". Falling back to use \"groupKey\" value of \""
            r6.append(r14)     // Catch:{ JSONException -> 0x007e }
            r6.append(r2)     // Catch:{ JSONException -> 0x007e }
            r6.append(r9)     // Catch:{ JSONException -> 0x007e }
            java.lang.String r6 = r6.toString()     // Catch:{ JSONException -> 0x007e }
            com.facetec.sdk.C2797ar.m10878a(r6)     // Catch:{ JSONException -> 0x007e }
            r6 = r2
            goto L_0x0082
        L_0x007e:
            r0 = move-exception
            r6 = r2
            goto L_0x01c6
        L_0x0082:
            boolean r14 = r1.f9469G     // Catch:{ JSONException -> 0x01c5 }
            if (r14 != 0) goto L_0x0172
        L_0x0086:
            java.lang.String r14 = "fields"
            org.json.JSONArray r13 = r13.optJSONArray(r14)     // Catch:{ JSONException -> 0x01c5 }
            java.lang.String r14 = "\". Falling back to use internal default values for all OCR strings in this group's fields. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK."
            if (r13 != 0) goto L_0x00a6
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x01c5 }
            java.lang.String r15 = "OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is missing a valid \"fields\" key-value pair in the group object with a \"groupKey\" value of \""
            r13.<init>(r15)     // Catch:{ JSONException -> 0x01c5 }
            r13.append(r2)     // Catch:{ JSONException -> 0x01c5 }
            r13.append(r14)     // Catch:{ JSONException -> 0x01c5 }
            java.lang.String r13 = r13.toString()     // Catch:{ JSONException -> 0x01c5 }
            r1.m11709a((java.lang.String) r13)     // Catch:{ JSONException -> 0x01c5 }
            goto L_0x0162
        L_0x00a6:
            int r15 = r13.length()     // Catch:{ JSONException -> 0x01c5 }
            if (r15 != 0) goto L_0x00c2
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x01c5 }
            java.lang.String r15 = "OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON has an empty array for the value of the \"fields\" key in the group object with a \"groupKey\" value of \""
            r13.<init>(r15)     // Catch:{ JSONException -> 0x01c5 }
            r13.append(r2)     // Catch:{ JSONException -> 0x01c5 }
            r13.append(r14)     // Catch:{ JSONException -> 0x01c5 }
            java.lang.String r13 = r13.toString()     // Catch:{ JSONException -> 0x01c5 }
            r1.m11709a((java.lang.String) r13)     // Catch:{ JSONException -> 0x01c5 }
            goto L_0x0162
        L_0x00c2:
            r14 = 0
        L_0x00c3:
            int r15 = r13.length()     // Catch:{ JSONException -> 0x01c5 }
            if (r14 >= r15) goto L_0x0162
            org.json.JSONObject r15 = r13.getJSONObject(r14)     // Catch:{ JSONException -> 0x01c5 }
            java.lang.String r11 = "fieldKey"
            java.lang.String r11 = m11704a((org.json.JSONObject) r15, (java.lang.String) r11)     // Catch:{ JSONException -> 0x01c5 }
            if (r11 == 0) goto L_0x0155
            boolean r16 = r11.isEmpty()     // Catch:{ JSONException -> 0x01c5 }
            if (r16 == 0) goto L_0x00dd
            goto L_0x0155
        L_0x00dd:
            boolean r11 = r11.equals(r3)     // Catch:{ JSONException -> 0x01c5 }
            if (r11 == 0) goto L_0x0152
            java.lang.String r6 = m11704a((org.json.JSONObject) r15, (java.lang.String) r0)     // Catch:{ JSONException -> 0x01c5 }
            if (r6 != 0) goto L_0x0122
            java.lang.String r11 = "uiFieldDescriptionText"
            boolean r11 = r0.equals(r11)     // Catch:{ JSONException -> 0x01c5 }
            if (r11 == 0) goto L_0x0122
            java.lang.String r11 = "fieldFriendlyName"
            java.lang.String r6 = m11704a((org.json.JSONObject) r15, (java.lang.String) r11)     // Catch:{ JSONException -> 0x01c5 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x01c5 }
            r15.<init>(r10)     // Catch:{ JSONException -> 0x01c5 }
            r15.append(r0)     // Catch:{ JSONException -> 0x01c5 }
            r15.append(r8)     // Catch:{ JSONException -> 0x01c5 }
            r15.append(r3)     // Catch:{ JSONException -> 0x01c5 }
            r16 = r5
            java.lang.String r5 = "\". Falling back to use \""
            r15.append(r5)     // Catch:{ JSONException -> 0x01c5 }
            r15.append(r11)     // Catch:{ JSONException -> 0x01c5 }
            java.lang.String r5 = "\" value of \""
            r15.append(r5)     // Catch:{ JSONException -> 0x01c5 }
            r15.append(r6)     // Catch:{ JSONException -> 0x01c5 }
            r15.append(r9)     // Catch:{ JSONException -> 0x01c5 }
            java.lang.String r5 = r15.toString()     // Catch:{ JSONException -> 0x01c5 }
            com.facetec.sdk.C2797ar.m10878a(r5)     // Catch:{ JSONException -> 0x01c5 }
            goto L_0x0125
        L_0x0122:
            r16 = r5
            r11 = r0
        L_0x0125:
            if (r6 != 0) goto L_0x014d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0149 }
            r5.<init>(r10)     // Catch:{ JSONException -> 0x0149 }
            r5.append(r11)     // Catch:{ JSONException -> 0x0149 }
            r5.append(r8)     // Catch:{ JSONException -> 0x0149 }
            r5.append(r3)     // Catch:{ JSONException -> 0x0149 }
            java.lang.String r6 = "\". Falling back to use \"fieldKey\" value of \""
            r5.append(r6)     // Catch:{ JSONException -> 0x0149 }
            r5.append(r3)     // Catch:{ JSONException -> 0x0149 }
            r5.append(r9)     // Catch:{ JSONException -> 0x0149 }
            java.lang.String r5 = r5.toString()     // Catch:{ JSONException -> 0x0149 }
            com.facetec.sdk.C2797ar.m10878a(r5)     // Catch:{ JSONException -> 0x0149 }
            r6 = r3
            goto L_0x014d
        L_0x0149:
            r0 = move-exception
            r6 = r3
            goto L_0x01c6
        L_0x014d:
            boolean r5 = r1.f9469G     // Catch:{ JSONException -> 0x01c5 }
            if (r5 != 0) goto L_0x016c
            goto L_0x015c
        L_0x0152:
            r16 = r5
            goto L_0x015c
        L_0x0155:
            r16 = r5
            java.lang.String r5 = "OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is missing a valid \"fieldKey\" key-value pair from an object in the \"fields\" array. Falling back to use internal default value for this OCR string. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK."
            r1.m11709a((java.lang.String) r5)     // Catch:{ JSONException -> 0x01c5 }
        L_0x015c:
            int r14 = r14 + 1
            r5 = r16
            goto L_0x00c3
        L_0x0162:
            r16 = r5
            goto L_0x016c
        L_0x0165:
            r16 = r5
            java.lang.String r5 = "OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is missing a valid \"groupKey\" key-value pair from an object in the \"groups\" array. Falling back to use internal default value for this OCR string. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK."
            r1.m11709a((java.lang.String) r5)     // Catch:{ JSONException -> 0x01c5 }
        L_0x016c:
            int r12 = r12 + 1
            r5 = r16
            goto L_0x0034
        L_0x0172:
            if (r6 != 0) goto L_0x01bd
            java.lang.String r5 = "\". Falling back to use internal default value of \""
            if (r3 != 0) goto L_0x0197
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x01c5 }
            r3.<init>(r10)     // Catch:{ JSONException -> 0x01c5 }
            r3.append(r0)     // Catch:{ JSONException -> 0x01c5 }
            r3.append(r7)     // Catch:{ JSONException -> 0x01c5 }
            r3.append(r2)     // Catch:{ JSONException -> 0x01c5 }
            r3.append(r5)     // Catch:{ JSONException -> 0x01c5 }
            r3.append(r4)     // Catch:{ JSONException -> 0x01c5 }
            r3.append(r9)     // Catch:{ JSONException -> 0x01c5 }
            java.lang.String r0 = r3.toString()     // Catch:{ JSONException -> 0x01c5 }
            com.facetec.sdk.C2797ar.m10878a(r0)     // Catch:{ JSONException -> 0x01c5 }
            goto L_0x01bd
        L_0x0197:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x01c5 }
            r7.<init>(r10)     // Catch:{ JSONException -> 0x01c5 }
            r7.append(r0)     // Catch:{ JSONException -> 0x01c5 }
            r7.append(r8)     // Catch:{ JSONException -> 0x01c5 }
            r7.append(r3)     // Catch:{ JSONException -> 0x01c5 }
            java.lang.String r0 = "\" within the \"fields\" array of the group object with a \"groupKey\" value of \""
            r7.append(r0)     // Catch:{ JSONException -> 0x01c5 }
            r7.append(r2)     // Catch:{ JSONException -> 0x01c5 }
            r7.append(r5)     // Catch:{ JSONException -> 0x01c5 }
            r7.append(r4)     // Catch:{ JSONException -> 0x01c5 }
            r7.append(r9)     // Catch:{ JSONException -> 0x01c5 }
            java.lang.String r0 = r7.toString()     // Catch:{ JSONException -> 0x01c5 }
            com.facetec.sdk.C2797ar.m10878a(r0)     // Catch:{ JSONException -> 0x01c5 }
        L_0x01bd:
            boolean r0 = r1.f9469G     // Catch:{ JSONException -> 0x01c5 }
            if (r0 != 0) goto L_0x01ce
            r0 = 1
            r1.f9469G = r0     // Catch:{ JSONException -> 0x01c5 }
            goto L_0x01ce
        L_0x01c5:
            r0 = move-exception
        L_0x01c6:
            r0.printStackTrace()
            java.lang.String r0 = "OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is in an invalid format. Falling back to use internal default values for all OCR strings. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK."
            r1.m11709a((java.lang.String) r0)
        L_0x01ce:
            if (r6 != 0) goto L_0x01d1
            goto L_0x01d2
        L_0x01d1:
            r4 = r6
        L_0x01d2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2879cb.m11712c(java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    private void m11716c(View view) {
        ((InputMethodManager) getActivity().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* renamed from: c */
    static /* synthetic */ void m11718c(C2879cb cbVar, boolean z) {
        Activity activity;
        int i;
        int i2 = cbVar.f9482k;
        int e = C2938dc.m12408e((Context) cbVar.getActivity(), z ? C2938dc.m12306av() : C2938dc.m12304at());
        int i3 = cbVar.f9486o;
        if (z) {
            activity = cbVar.getActivity();
            i = C2938dc.m12309ay();
        } else {
            activity = cbVar.getActivity();
            i = C2938dc.m12307aw();
        }
        int e2 = C2938dc.m12408e((Context) activity, i);
        if (i2 != e) {
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i2), Integer.valueOf(e)});
            ofObject.setDuration(200);
            ofObject.addUpdateListener(new C3637v9(cbVar));
            ofObject.start();
        }
        if (i3 != e2) {
            ValueAnimator ofObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i3), Integer.valueOf(e2)});
            ofObject2.setDuration(200);
            ofObject2.addUpdateListener(new C3658w9(cbVar));
            ofObject2.start();
        }
    }
}

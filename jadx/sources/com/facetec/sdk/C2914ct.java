package com.facetec.sdk;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.drawable.C0850l;
import androidx.core.graphics.drawable.C0851m;
import com.facetec.sdk.C2792ao;
import com.facetec.sdk.C2810ax;
import com.github.mikephil.charting.utils.Utils;
import java.util.Locale;
import org.json.JSONObject;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;

/* renamed from: com.facetec.sdk.ct */
public final class C2914ct extends C2792ao {

    /* renamed from: a */
    TextView f9747a;

    /* renamed from: b */
    LinearLayout f9748b;

    /* renamed from: c */
    ImageView f9749c;

    /* renamed from: d */
    LinearLayout f9750d;

    /* renamed from: e */
    TextView f9751e;

    /* renamed from: f */
    private ImageView f9752f;

    /* renamed from: g */
    TextView f9753g;

    /* renamed from: h */
    C2921cw f9754h;

    /* renamed from: i */
    TextView f9755i;

    /* renamed from: j */
    Bitmap f9756j;

    /* renamed from: k */
    private ImageView f9757k;

    /* renamed from: l */
    private LinearLayout f9758l;

    /* renamed from: m */
    private ImageView f9759m;

    /* renamed from: n */
    private LinearLayout f9760n;

    /* renamed from: o */
    private ImageView f9761o;

    /* renamed from: p */
    private TextView f9762p;

    /* renamed from: q */
    private LinearLayout f9763q;

    /* renamed from: r */
    private TextView f9764r;

    /* renamed from: s */
    private TextView f9765s;

    /* renamed from: t */
    private C0850l f9766t;

    /* renamed from: v */
    private boolean f9767v = false;

    /* renamed from: w */
    private GradientDrawable f9768w;

    /* renamed from: com.facetec.sdk.ct$1 */
    static /* synthetic */ class C29151 {

        /* renamed from: c */
        static final /* synthetic */ int[] f9769c;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.facetec.sdk.cq[] r0 = com.facetec.sdk.C2909cq.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9769c = r0
                com.facetec.sdk.cq r1 = com.facetec.sdk.C2909cq.LIGHTING_AND_NEUTRAL_EXPRESSION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9769c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facetec.sdk.cq r1 = com.facetec.sdk.C2909cq.LIGHTING_ONLY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9769c     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facetec.sdk.cq r1 = com.facetec.sdk.C2909cq.NEUTRAL_EXPRESSION_ONLY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9769c     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facetec.sdk.cq r1 = com.facetec.sdk.C2909cq.BLURRY_ONLY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2914ct.C29151.<clinit>():void");
        }
    }

    /* renamed from: b */
    private void m12150b() {
        float f;
        float f2;
        float e = C2938dc.m12404e() * C2938dc.m12372c();
        int round = Math.round(((float) C2938dc.m12393d()) * C2938dc.m12404e());
        int measuredHeight = this.f9758l.getMeasuredHeight();
        if (Locale.getDefault().getLanguage().equals("ar")) {
            f2 = 0.08f;
            f = 0.09f;
        } else {
            f2 = 0.06f;
            f = 0.07f;
        }
        float f3 = (float) measuredHeight;
        int round2 = Math.round(f2 * f3);
        if (((double) C2938dc.m12311b()) < 1.4d && Resources.getSystem().getDisplayMetrics().heightPixels < 900) {
            round2 = Math.round(f3 * f);
        }
        int round3 = (int) Math.round(((double) round2) * 0.85d);
        int round4 = (int) Math.round(((double) round3) * 0.85d);
        int height = this.f9757k.getHeight() + round4 + ((LinearLayout.LayoutParams) this.f9765s.getLayoutParams()).topMargin;
        this.f9760n.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f9763q.getLayoutParams();
        layoutParams.height = height;
        layoutParams.weight = Utils.FLOAT_EPSILON;
        this.f9763q.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f9751e.getLayoutParams();
        layoutParams2.height = round2;
        layoutParams2.weight = Utils.FLOAT_EPSILON;
        this.f9751e.setLayoutParams(layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f9747a.getLayoutParams();
        layoutParams3.height = round3;
        layoutParams3.weight = Utils.FLOAT_EPSILON;
        this.f9747a.setLayoutParams(layoutParams3);
        this.f9753g.setLayoutParams(layoutParams3);
        this.f9755i.setLayoutParams(layoutParams3);
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f9765s.getLayoutParams();
        layoutParams4.height = round4;
        this.f9765s.setLayoutParams(layoutParams4);
        this.f9762p.setLayoutParams(layoutParams4);
        int width = this.f9751e.getWidth();
        if (C2938dc.m12354bi()) {
            int round5 = Math.round(C2810ax.m10988b(35) * e);
            int[] iArr = new int[2];
            this.f9764r.getLocationInWindow(iArr);
            int round6 = (int) (((long) (iArr[1] + round5)) - Math.round(((double) round) / 2.0d));
            int[] iArr2 = new int[2];
            this.f9751e.getLocationInWindow(iArr2);
            if (iArr2[1] < round6) {
                width -= round5 << 1;
            }
        }
        C2810ax.C2812a aVar = new C2810ax.C2812a(width, round2);
        C2810ax.C2812a aVar2 = new C2810ax.C2812a(this.f9747a.getWidth(), round3);
        C2810ax.C2812a aVar3 = new C2810ax.C2812a(this.f9753g.getWidth(), round3);
        C2810ax.C2812a aVar4 = new C2810ax.C2812a(this.f9755i.getWidth(), round3);
        C2810ax.C2812a aVar5 = new C2810ax.C2812a(this.f9765s.getWidth(), round4);
        C2810ax.C2812a aVar6 = new C2810ax.C2812a(this.f9762p.getWidth(), round4);
        int round7 = Math.round(C2810ax.m10998e(8));
        int round8 = Math.round(C2810ax.m10998e(40));
        int round9 = Math.round(C2810ax.m10998e(5));
        int round10 = Math.round(C2810ax.m10998e(36));
        int a = C2810ax.m10983a(this.f9751e, aVar, round7, round8);
        int a2 = C2810ax.m10983a(this.f9747a, aVar2, round9, round10);
        int a3 = C2810ax.m10983a(this.f9753g, aVar3, round9, round10);
        int a4 = C2810ax.m10983a(this.f9755i, aVar4, round9, round10);
        int a5 = C2810ax.m10983a(this.f9765s, aVar5, round9, round10);
        int a6 = C2810ax.m10983a(this.f9762p, aVar6, round9, round10);
        int round11 = (int) Math.round(((double) a) * 0.85d);
        if (a2 >= round11) {
            a2 = round11;
        }
        if (this.f9753g.getText().toString().isEmpty() || a3 >= a2) {
            a3 = a2;
        }
        if (this.f9755i.getText().toString().isEmpty() || a4 >= a3) {
            a4 = a3;
        }
        int round12 = (int) Math.round(((double) a4) * 0.85d);
        if (a5 >= a4) {
            a5 = round12;
        }
        if (a6 >= a4) {
            a6 = a5;
        }
        this.f9751e.setTextSize(0, (float) a);
        float f4 = (float) a4;
        this.f9747a.setTextSize(0, f4);
        this.f9753g.setTextSize(0, f4);
        this.f9755i.setTextSize(0, f4);
        float f5 = (float) a6;
        this.f9765s.setTextSize(0, f5);
        this.f9762p.setTextSize(0, f5);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m12157e() {
        m12150b();
        this.f9751e.getViewTreeObserver().addOnGlobalLayoutListener(new C3531qh(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final TextView mo9052a() {
        return this.f9751e;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C2747R.layout.facetec_retry_screen_center_content_fragment, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        mo8845e(new C3197hh(this), 100);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        this.f9758l = (LinearLayout) view.findViewById(C2747R.C2749id.contentLayout);
        this.f9751e = (TextView) view.findViewById(C2747R.C2749id.headerTextView);
        this.f9747a = (TextView) view.findViewById(C2747R.C2749id.messageTextView);
        this.f9753g = (TextView) view.findViewById(C2747R.C2749id.instructionMessage1TextView);
        this.f9755i = (TextView) view.findViewById(C2747R.C2749id.instructionMessage2TextView);
        this.f9762p = (TextView) view.findViewById(C2747R.C2749id.yourZoomSubimageTextView);
        this.f9765s = (TextView) view.findViewById(C2747R.C2749id.idealZoomSubimageTextView);
        this.f9749c = (ImageView) view.findViewById(C2747R.C2749id.yourZoomImage);
        this.f9757k = (ImageView) view.findViewById(C2747R.C2749id.idealZoomImage);
        this.f9761o = (ImageView) view.findViewById(C2747R.C2749id.idealZoomImageBorder);
        this.f9752f = (ImageView) view.findViewById(C2747R.C2749id.yourZoomImageBorder);
        this.f9759m = (ImageView) view.findViewById(C2747R.C2749id.idealOval);
        this.f9754h = (C2921cw) view.findViewById(C2747R.C2749id.idealImageSlideshowView);
        this.f9764r = (TextView) view.findViewById(C2747R.C2749id.cancelButtonSpacer);
        this.f9748b = (LinearLayout) view.findViewById(C2747R.C2749id.idealZoomLayout);
        this.f9750d = (LinearLayout) view.findViewById(C2747R.C2749id.yourZoomLayout);
        this.f9763q = (LinearLayout) view.findViewById(C2747R.C2749id.sideBySideLayout);
        this.f9760n = (LinearLayout) view.findViewById(C2747R.C2749id.headerAndSubheaderLayout);
        this.f9747a.setImportantForAccessibility(1);
        this.f9753g.setImportantForAccessibility(1);
        this.f9755i.setImportantForAccessibility(1);
        this.f9747a.setAccessibilityTraversalAfter(this.f9751e.getId());
        this.f9753g.setAccessibilityTraversalAfter(this.f9747a.getId());
        this.f9755i.setAccessibilityTraversalAfter(this.f9753g.getId());
        if (C2938dc.m12274aP().length != 0) {
            this.f9757k.setVisibility(4);
        }
        C2938dc.m12318b(this.f9751e, C2938dc.m12250a(true));
        C2938dc.m12318b(this.f9747a, C2938dc.m12428i(true));
        String h = C2938dc.m12423h(true);
        String g = C2938dc.m12420g(true);
        int i2 = C29151.f9769c[C2885cd.m11848m().ordinal()];
        if (i2 != 2) {
            if (i2 == 3) {
                this.f9755i.setVisibility(8);
            } else if (i2 == 4) {
                h = C2938dc.m12433j(true);
                this.f9755i.setVisibility(8);
            }
            g = "";
        } else {
            this.f9753g.setVisibility(8);
            h = "";
        }
        this.f9753g.setText(h);
        this.f9755i.setText(g);
        this.f9762p.setText(C2938dc.m12438l(true));
        this.f9765s.setText(C2938dc.m12417f(true));
        this.f9762p.setImportantForAccessibility(2);
        this.f9765s.setImportantForAccessibility(2);
        this.f9750d.setImportantForAccessibility(1);
        this.f9750d.setContentDescription(this.f9762p.getText());
        this.f9748b.setImportantForAccessibility(1);
        this.f9748b.setContentDescription(this.f9765s.getText());
        this.f9751e.setTypeface(C2938dc.m12233L());
        this.f9747a.setTypeface(C2938dc.m12230I());
        this.f9753g.setTypeface(C2938dc.m12235N());
        this.f9755i.setTypeface(C2938dc.m12235N());
        this.f9762p.setTypeface(C2938dc.m12235N());
        this.f9765s.setTypeface(C2938dc.m12235N());
        this.f9751e.setLineSpacing(Utils.FLOAT_EPSILON, 1.1f);
        this.f9747a.setLineSpacing(Utils.FLOAT_EPSILON, 1.1f);
        this.f9753g.setLineSpacing(Utils.FLOAT_EPSILON, 1.1f);
        this.f9755i.setLineSpacing(Utils.FLOAT_EPSILON, 1.1f);
        this.f9751e.setTextColor(C2938dc.m12432j((Context) getActivity()));
        this.f9747a.setTextColor(C2938dc.m12416f((Context) getActivity()));
        this.f9753g.setTextColor(C2938dc.m12416f((Context) getActivity()));
        this.f9755i.setTextColor(C2938dc.m12416f((Context) getActivity()));
        this.f9762p.setTextColor(C2938dc.m12416f((Context) getActivity()));
        this.f9765s.setTextColor(C2938dc.m12416f((Context) getActivity()));
        float c = C2938dc.m12372c() * C2938dc.m12404e();
        float f = 28.0f * c;
        float f2 = c * 20.0f;
        this.f9751e.setTextSize(2, f);
        this.f9747a.setTextSize(2, f2);
        this.f9753g.setTextSize(2, f2);
        this.f9755i.setTextSize(2, f2);
        this.f9762p.setTextSize(2, f2);
        this.f9765s.setTextSize(2, f2);
        this.f9756j = null;
        this.f9766t = null;
        FaceTecSessionActivity faceTecSessionActivity = (FaceTecSessionActivity) getActivity();
        if (faceTecSessionActivity != null) {
            Bitmap bitmap = faceTecSessionActivity.f9165p;
            if (bitmap != null) {
                this.f9756j = bitmap;
            }
            Resources resources = getResources();
            getActivity();
            Bitmap decodeResource = BitmapFactory.decodeResource(resources, C2938dc.m12273aO());
            mo9054c();
            this.f9757k.setImageDrawable(C0851m.m3189a(resources, decodeResource));
            GradientDrawable gradientDrawable = new GradientDrawable();
            this.f9768w = gradientDrawable;
            gradientDrawable.setCornerRadius(C2810ax.m10988b((int) (((float) C2938dc.m12463z()) * C2938dc.m12404e())));
            GradientDrawable gradientDrawable2 = this.f9768w;
            if (C2938dc.m12436l() == 0) {
                i = 0;
            } else {
                i = 1;
            }
            gradientDrawable2.setStroke((int) C2810ax.m10988b(Math.max(i, (int) (((float) C2938dc.m12436l()) * C2938dc.m12404e()))), C2938dc.m12452s(getActivity()));
            this.f9768w.setColor(0);
            C0850l a = C0851m.m3189a(resources, decodeResource);
            a.setAlpha(0);
            this.f9761o.setImageDrawable(a);
            this.f9761o.setBackground(this.f9768w);
            this.f9752f.setImageDrawable(a);
            this.f9752f.setBackground(this.f9768w);
            this.f9749c.setBackground(this.f9768w);
            this.f9757k.setBackground(this.f9768w);
            this.f9749c.setClipToOutline(true);
            this.f9757k.setClipToOutline(true);
            this.f9749c.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            this.f9757k.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            this.f9759m.setColorFilter(C2938dc.m12454t(getActivity()), PorterDuff.Mode.SRC_IN);
            float c2 = C2938dc.m12372c() * C2938dc.m12404e();
            int d = C2938dc.m12393d();
            float f3 = (float) d;
            int round = Math.round(f3 / 2.0f);
            int round2 = (int) Math.round(((double) faceTecSessionActivity.f9162m) * 0.45d);
            Bitmap bitmap2 = this.f9756j;
            if (bitmap2 != null) {
                float height = ((float) bitmap2.getHeight()) / ((float) this.f9756j.getWidth());
                if (C2938dc.m12311b() >= height) {
                    round2 = Math.round((((float) Math.round(((float) Math.round(faceTecSessionActivity.f9158i)) - (f3 * 3.0f))) / 2.0f) * height);
                }
            }
            ((LinearLayout.LayoutParams) this.f9751e.getLayoutParams()).bottomMargin = Math.round(C2810ax.m10988b(5) * c2);
            int round3 = Math.round(C2810ax.m10988b(5) * c2);
            ((LinearLayout.LayoutParams) this.f9765s.getLayoutParams()).topMargin = round3;
            ((LinearLayout.LayoutParams) this.f9762p.getLayoutParams()).topMargin = round3;
            ((LinearLayout.LayoutParams) this.f9763q.getLayoutParams()).topMargin = Math.round(C2810ax.m10988b(5) * c2);
            ((FrameLayout) view.findViewById(C2747R.C2749id.idealZoomImageContainer)).getLayoutParams().height = round2;
            ((FrameLayout) view.findViewById(C2747R.C2749id.yourZoomImageContainer)).getLayoutParams().height = round2;
            ((LinearLayout.LayoutParams) this.f9750d.getLayoutParams()).setMarginEnd(round);
            ((LinearLayout.LayoutParams) this.f9748b.getLayoutParams()).setMarginStart(round);
            view.setPadding(d, d, d, 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m12149a(ValueAnimator valueAnimator) {
        if (isAdded()) {
            this.f9747a.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            this.f9753g.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            this.f9755i.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            this.f9765s.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            this.f9762p.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m12163i() {
        if (!this.f9767v) {
            this.f9767v = true;
            m12150b();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00b7, code lost:
        r0 = getResources();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9054c() {
        /*
            r6 = this;
            android.graphics.Bitmap r0 = r6.f9756j
            if (r0 == 0) goto L_0x00af
            int r0 = r0.getHeight()
            float r0 = (float) r0
            android.graphics.Bitmap r1 = r6.f9756j
            int r1 = r1.getWidth()
            float r1 = (float) r1
            float r0 = r0 / r1
            r1 = 1071862776(0x3fe353f8, float:1.776)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 0
            if (r2 > 0) goto L_0x0048
            android.graphics.Bitmap r0 = r6.f9756j
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r0 = r0 / r1
            android.graphics.Bitmap r1 = r6.f9756j
            int r1 = r1.getWidth()
            float r1 = (float) r1
            float r1 = r1 - r0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0077
            android.graphics.Bitmap r1 = r6.f9756j
            int r2 = r1.getWidth()
            float r2 = (float) r2
            float r2 = r2 - r0
            float r2 = r2 / r4
            int r2 = (int) r2
            int r0 = (int) r0
            android.graphics.Bitmap r4 = r6.f9756j
            int r4 = r4.getHeight()
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r1, r2, r3, r0, r4)
            r6.f9756j = r0
            goto L_0x0077
        L_0x0048:
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0077
            android.graphics.Bitmap r0 = r6.f9756j
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r0 = r0 * r1
            android.graphics.Bitmap r1 = r6.f9756j
            int r1 = r1.getHeight()
            float r1 = (float) r1
            float r1 = r1 - r0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0077
            android.graphics.Bitmap r1 = r6.f9756j
            int r2 = r1.getHeight()
            float r2 = (float) r2
            float r2 = r2 - r0
            float r2 = r2 / r4
            int r2 = (int) r2
            android.graphics.Bitmap r4 = r6.f9756j
            int r4 = r4.getWidth()
            int r0 = (int) r0
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r1, r3, r2, r4, r0)
            r6.f9756j = r0
        L_0x0077:
            android.graphics.Bitmap r0 = r6.f9756j
            int r0 = r0.getWidth()
            double r0 = (double) r0
            r2 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            double r0 = r0 * r2
            int r0 = (int) r0
            android.graphics.Bitmap r1 = r6.f9756j
            int r1 = r1.getHeight()
            double r4 = (double) r1
            double r4 = r4 * r2
            int r1 = (int) r4
            android.graphics.Bitmap r2 = r6.f9756j
            int r3 = r2.getWidth()
            int r3 = r3 - r0
            int r3 = r3 / 2
            android.graphics.Bitmap r4 = r6.f9756j
            int r4 = r4.getHeight()
            int r4 = r4 - r1
            int r4 = r4 / 2
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r3, r4, r0, r1)
            r6.f9756j = r0
            android.content.res.Resources r0 = r6.getResources()
            android.graphics.Bitmap r1 = r6.f9756j
            androidx.core.graphics.drawable.l r0 = androidx.core.graphics.drawable.C0851m.m3189a(r0, r1)
            r6.f9766t = r0
        L_0x00af:
            com.facetec.sdk.de r0 = com.facetec.sdk.C2942de.YOUR_ZOOM_IMAGE_OVERRIDE
            boolean r0 = m12159e((com.facetec.sdk.C2942de) r0)
            if (r0 == 0) goto L_0x00d9
            android.content.res.Resources r0 = r6.getResources()
            android.app.Activity r1 = r6.getActivity()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r2 = "zoom_your_zoom_image_override"
            java.lang.String r3 = "drawable"
            int r1 = r0.getIdentifier(r2, r3, r1)
            if (r1 == 0) goto L_0x00d9
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeResource(r0, r1)
            r6.f9756j = r1
            androidx.core.graphics.drawable.l r0 = androidx.core.graphics.drawable.C0851m.m3189a(r0, r1)
            r6.f9766t = r0
        L_0x00d9:
            boolean r0 = com.facetec.sdk.C2827ba.f9071d
            if (r0 != 0) goto L_0x00e4
            android.widget.ImageView r0 = r6.f9749c
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.setScaleX(r1)
        L_0x00e4:
            android.widget.ImageView r0 = r6.f9749c
            androidx.core.graphics.drawable.l r1 = r6.f9766t
            r0.setImageDrawable(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2914ct.mo9054c():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo9055d() {
        Integer valueOf = Integer.valueOf(this.f9751e.getCurrentTextColor());
        Integer valueOf2 = Integer.valueOf(C2938dc.m12432j((Context) getActivity()));
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{valueOf, valueOf2});
        ofObject.setDuration(1000);
        ofObject.addUpdateListener(new C3219ih(this));
        ofObject.start();
        Integer valueOf3 = Integer.valueOf(this.f9747a.getCurrentTextColor());
        Integer valueOf4 = Integer.valueOf(C2938dc.m12416f((Context) getActivity()));
        ValueAnimator ofObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{valueOf3, valueOf4});
        ofObject2.setDuration(1000);
        ofObject2.addUpdateListener(new C3467nh(this));
        ofObject2.start();
        Integer valueOf5 = Integer.valueOf(C2938dc.m12408e((Context) getActivity(), FaceTecSDK.f8630e.f8606i.retryScreenImageBorderColor));
        Integer valueOf6 = Integer.valueOf(C2938dc.m12452s(getActivity()));
        ValueAnimator ofObject3 = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{valueOf5, valueOf6});
        ofObject3.setDuration(1000);
        ofObject3.addUpdateListener(new C3489oh(this));
        ofObject3.start();
        Integer valueOf7 = Integer.valueOf(C2938dc.m12408e((Context) getActivity(), FaceTecSDK.f8630e.f8606i.retryScreenOvalStrokeColor));
        Integer valueOf8 = Integer.valueOf(C2938dc.m12454t(getActivity()));
        ValueAnimator ofObject4 = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{valueOf7, valueOf8});
        ofObject4.setDuration(1000);
        ofObject4.addUpdateListener(new C3510ph(this));
        ofObject4.start();
    }

    /* renamed from: e */
    private static boolean m12159e(C2942de deVar) {
        int i = 0;
        while (i < C2937db.f9837d.length()) {
            try {
                JSONObject jSONObject = C2937db.f9837d.getJSONObject(i);
                String string = jSONObject.getString("overrideKey");
                C2942de deVar2 = (C2942de) jSONObject.get("type");
                if (FaceTecSDK.f8630e.f8613p.get(string) != null && FaceTecSDK.f8630e.f8613p.get(string).equals(jSONObject.getString("overrideValue")) && deVar2 == deVar) {
                    return true;
                }
                i++;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m12148a(int i, int i2, Runnable runnable) {
        this.f9748b.animate().alpha(1.0f).setDuration((long) i).setStartDelay((long) i2).setListener((Animator.AnimatorListener) null).withEndAction(new C2792ao.C2793e(new C3601th(this, i, i2, runnable))).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m12158e(ValueAnimator valueAnimator) {
        if (isAdded()) {
            this.f9768w.setStroke(C2938dc.m12436l(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
            this.f9752f.setBackground(this.f9768w);
            this.f9761o.setBackground(this.f9768w);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m12152c(ValueAnimator valueAnimator) {
        if (isAdded()) {
            this.f9751e.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m12151c(int i, int i2, Runnable runnable) {
        this.f9750d.animate().alpha(1.0f).setDuration((long) i).setStartDelay((long) i2).setListener((Animator.AnimatorListener) null).withEndAction(new C2792ao.C2793e(new C3580sh(this, i, i2, runnable))).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m12155d(ValueAnimator valueAnimator) {
        if (isAdded()) {
            this.f9759m.setColorFilter(((Integer) valueAnimator.getAnimatedValue()).intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m12154d(int i, int i2, Runnable runnable) {
        long j = (long) i;
        long j2 = (long) i2;
        this.f9755i.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).setListener((Animator.AnimatorListener) null).start();
        this.f9753g.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).setListener((Animator.AnimatorListener) null).withEndAction(new C2792ao.C2793e(runnable));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo9053b(Runnable runnable) {
        if (C2949dl.m12473a()) {
            this.f9747a.setAlpha(1.0f);
            this.f9751e.setAlpha(1.0f);
            this.f9750d.setAlpha(1.0f);
            this.f9748b.setAlpha(1.0f);
            this.f9755i.setAlpha(1.0f);
            this.f9753g.setAlpha(1.0f);
            new C2792ao.C2793e(runnable).run();
            return;
        }
        this.f9747a.animate().alpha(1.0f).setDuration(500).setListener((Animator.AnimatorListener) null).start();
        this.f9751e.animate().alpha(1.0f).setDuration(500).setListener((Animator.AnimatorListener) null).withEndAction(new C2792ao.C2793e(new C3552rh(this, 500, BogInputLayout.INPUT_TYPE_TEXT_PASSWORD, runnable))).start();
    }
}

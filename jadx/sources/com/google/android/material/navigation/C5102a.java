package com.google.android.material.navigation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0301i;
import androidx.appcompat.view.menu.C0315n;
import androidx.appcompat.widget.C0512x1;
import androidx.core.content.C0767a;
import androidx.core.graphics.drawable.C0836a;
import androidx.core.view.C1166h1;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.C1314o;
import com.facetec.sdk.FaceTecSDK;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.badge.C4933a;
import com.google.android.material.badge.C4935b;
import p009a8.C0072b;
import p009a8.C0074d;
import p009a8.C0075e;
import p009a8.C0076f;
import p009a8.C0077g;
import p009a8.C0080j;
import p026b8.C2170a;
import p145k8.C6835a;
import p184n8.C7343c;
import p197o8.C7492b;

/* renamed from: com.google.android.material.navigation.a */
public abstract class C5102a extends FrameLayout implements C0315n.C0316a {

    /* renamed from: H */
    private static final int[] f16277H = {16842912};

    /* renamed from: I */
    private static final C5106d f16278I = new C5106d((C5103a) null);

    /* renamed from: J */
    private static final C5106d f16279J = new C5107e((C5103a) null);

    /* renamed from: A */
    private float f16280A = Utils.FLOAT_EPSILON;

    /* renamed from: B */
    private boolean f16281B = false;

    /* renamed from: C */
    private int f16282C = 0;

    /* renamed from: D */
    private int f16283D = 0;

    /* renamed from: E */
    private boolean f16284E = false;

    /* renamed from: F */
    private int f16285F = 0;

    /* renamed from: G */
    private C4933a f16286G;

    /* renamed from: d */
    private boolean f16287d = false;

    /* renamed from: e */
    private ColorStateList f16288e;

    /* renamed from: f */
    Drawable f16289f;

    /* renamed from: g */
    private int f16290g;

    /* renamed from: h */
    private int f16291h;

    /* renamed from: i */
    private float f16292i;

    /* renamed from: j */
    private float f16293j;

    /* renamed from: k */
    private float f16294k;

    /* renamed from: l */
    private int f16295l;

    /* renamed from: m */
    private boolean f16296m;

    /* renamed from: n */
    private final FrameLayout f16297n;

    /* renamed from: o */
    private final View f16298o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final ImageView f16299p;

    /* renamed from: q */
    private final ViewGroup f16300q;

    /* renamed from: r */
    private final TextView f16301r;

    /* renamed from: s */
    private final TextView f16302s;

    /* renamed from: t */
    private int f16303t = -1;

    /* renamed from: u */
    private C0301i f16304u;

    /* renamed from: v */
    private ColorStateList f16305v;

    /* renamed from: w */
    private Drawable f16306w;

    /* renamed from: x */
    private Drawable f16307x;

    /* renamed from: y */
    private ValueAnimator f16308y;

    /* renamed from: z */
    private C5106d f16309z = f16278I;

    /* renamed from: com.google.android.material.navigation.a$a */
    class C5103a implements View.OnLayoutChangeListener {
        C5103a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (C5102a.this.f16299p.getVisibility() == 0) {
                C5102a aVar = C5102a.this;
                aVar.m19962w(aVar.f16299p);
            }
        }
    }

    /* renamed from: com.google.android.material.navigation.a$b */
    class C5104b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ int f16311d;

        C5104b(int i) {
            this.f16311d = i;
        }

        public void run() {
            C5102a.this.m19963x(this.f16311d);
        }
    }

    /* renamed from: com.google.android.material.navigation.a$c */
    class C5105c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        final /* synthetic */ float f16313d;

        C5105c(float f) {
            this.f16313d = f;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C5102a.this.m19956q(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f16313d);
        }
    }

    /* renamed from: com.google.android.material.navigation.a$d */
    private static class C5106d {
        private C5106d() {
        }

        /* synthetic */ C5106d(C5103a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo16647a(float f, float f2) {
            int i = (f2 > Utils.FLOAT_EPSILON ? 1 : (f2 == Utils.FLOAT_EPSILON ? 0 : -1));
            return C2170a.m8291b(Utils.FLOAT_EPSILON, 1.0f, i == 0 ? 0.8f : 0.0f, i == 0 ? 1.0f : 0.2f, f);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public float mo16648b(float f, float f2) {
            return C2170a.m8290a(0.4f, 1.0f, f);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public float mo16649c(float f, float f2) {
            return 1.0f;
        }

        /* renamed from: d */
        public void mo16650d(float f, float f2, View view) {
            view.setScaleX(mo16648b(f, f2));
            view.setScaleY(mo16649c(f, f2));
            view.setAlpha(mo16647a(f, f2));
        }
    }

    /* renamed from: com.google.android.material.navigation.a$e */
    private static class C5107e extends C5106d {
        private C5107e() {
            super((C5103a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public float mo16649c(float f, float f2) {
            return mo16648b(f, f2);
        }

        /* synthetic */ C5107e(C5103a aVar) {
            this();
        }
    }

    public C5102a(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(getItemLayoutResId(), this, true);
        this.f16297n = (FrameLayout) findViewById(C0076f.navigation_bar_item_icon_container);
        this.f16298o = findViewById(C0076f.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(C0076f.navigation_bar_item_icon_view);
        this.f16299p = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(C0076f.navigation_bar_item_labels_group);
        this.f16300q = viewGroup;
        TextView textView = (TextView) findViewById(C0076f.navigation_bar_item_small_label_view);
        this.f16301r = textView;
        TextView textView2 = (TextView) findViewById(C0076f.navigation_bar_item_large_label_view);
        this.f16302s = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f16290g = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f16291h = viewGroup.getPaddingBottom();
        ViewCompat.m3544C0(textView, 2);
        ViewCompat.m3544C0(textView2, 2);
        setFocusable(true);
        m19948g(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new C5103a());
        }
    }

    /* renamed from: g */
    private void m19948g(float f, float f2) {
        this.f16292i = f - f2;
        this.f16293j = (f2 * 1.0f) / f;
        this.f16294k = (f * 1.0f) / f2;
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f16297n;
        return frameLayout != null ? frameLayout : this.f16299p;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof C5102a) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        int i;
        C4933a aVar = this.f16286G;
        if (aVar != null) {
            i = aVar.getMinimumHeight() / 2;
        } else {
            i = 0;
        }
        return Math.max(i, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + this.f16299p.getMeasuredWidth() + i;
    }

    private int getSuggestedIconWidth() {
        int i;
        C4933a aVar = this.f16286G;
        if (aVar == null) {
            i = 0;
        } else {
            i = aVar.getMinimumWidth() - this.f16286G.mo15525j();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(i, layoutParams.leftMargin) + this.f16299p.getMeasuredWidth() + Math.max(i, layoutParams.rightMargin);
    }

    /* renamed from: i */
    private static Drawable m19949i(ColorStateList colorStateList) {
        return new RippleDrawable(C7492b.m28454a(colorStateList), (Drawable) null, (Drawable) null);
    }

    /* renamed from: j */
    private FrameLayout m19950j(View view) {
        ImageView imageView = this.f16299p;
        if (view != imageView || !C4935b.f15557a) {
            return null;
        }
        return (FrameLayout) imageView.getParent();
    }

    /* renamed from: k */
    private boolean m19951k() {
        return this.f16286G != null;
    }

    /* renamed from: l */
    private boolean m19952l() {
        return this.f16284E && this.f16295l == 2;
    }

    /* renamed from: m */
    private void m19953m(float f) {
        if (!this.f16281B || !this.f16287d || !ViewCompat.m3578U(this)) {
            m19956q(f, f);
            return;
        }
        ValueAnimator valueAnimator = this.f16308y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f16308y = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f16280A, f});
        this.f16308y = ofFloat;
        ofFloat.addUpdateListener(new C5105c(f));
        this.f16308y.setInterpolator(C6835a.m26566g(getContext(), C0072b.motionEasingEmphasizedInterpolator, C2170a.f6351b));
        this.f16308y.setDuration((long) C6835a.m26565f(getContext(), C0072b.motionDurationLong2, getResources().getInteger(C0077g.material_motion_duration_long_1)));
        this.f16308y.start();
    }

    /* renamed from: n */
    private void m19954n() {
        C0301i iVar = this.f16304u;
        if (iVar != null) {
            setChecked(iVar.isChecked());
        }
    }

    /* renamed from: o */
    private void m19955o() {
        Drawable drawable = this.f16289f;
        RippleDrawable rippleDrawable = null;
        boolean z = true;
        if (this.f16288e != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f16281B && getActiveIndicatorDrawable() != null && this.f16297n != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(C7492b.m28457d(this.f16288e), (Drawable) null, activeIndicatorDrawable);
                z = false;
            } else if (drawable == null) {
                drawable = m19949i(this.f16288e);
            }
        }
        FrameLayout frameLayout = this.f16297n;
        if (frameLayout != null) {
            ViewCompat.m3627v0(frameLayout, rippleDrawable);
        }
        ViewCompat.m3627v0(this, drawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m19956q(float f, float f2) {
        View view = this.f16298o;
        if (view != null) {
            this.f16309z.mo16650d(f, f2, view);
        }
        this.f16280A = f;
    }

    /* renamed from: r */
    private static void m19957r(TextView textView, int i) {
        C1314o.m4575q(textView, i);
        int h = C7343c.m28010h(textView.getContext(), i, 0);
        if (h != 0) {
            textView.setTextSize(0, (float) h);
        }
    }

    /* renamed from: s */
    private static void m19958s(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    /* renamed from: t */
    private static void m19959t(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: u */
    private void m19960u(View view) {
        if (m19951k() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            C4935b.m18851a(this.f16286G, view, m19950j(view));
        }
    }

    /* renamed from: v */
    private void m19961v(View view) {
        if (m19951k()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C4935b.m18854d(this.f16286G, view);
            }
            this.f16286G = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m19962w(View view) {
        if (m19951k()) {
            C4935b.m18855e(this.f16286G, view, m19950j(view));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m19963x(int i) {
        int i2;
        if (this.f16298o != null) {
            int min = Math.min(this.f16282C, i - (this.f16285F * 2));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f16298o.getLayoutParams();
            if (m19952l()) {
                i2 = min;
            } else {
                i2 = this.f16283D;
            }
            layoutParams.height = i2;
            layoutParams.width = min;
            this.f16298o.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: y */
    private void m19964y() {
        if (m19952l()) {
            this.f16309z = f16279J;
        } else {
            this.f16309z = f16278I;
        }
    }

    /* renamed from: z */
    private static void m19965z(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    /* renamed from: c */
    public void mo805c(C0301i iVar, int i) {
        CharSequence charSequence;
        int i2;
        this.f16304u = iVar;
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setIcon(iVar.getIcon());
        setTitle(iVar.getTitle());
        setId(iVar.getItemId());
        if (!TextUtils.isEmpty(iVar.getContentDescription())) {
            setContentDescription(iVar.getContentDescription());
        }
        if (!TextUtils.isEmpty(iVar.getTooltipText())) {
            charSequence = iVar.getTooltipText();
        } else {
            charSequence = iVar.getTitle();
        }
        if (Build.VERSION.SDK_INT > 23) {
            C0512x1.m2056a(this, charSequence);
        }
        if (iVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        this.f16287d = true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f16297n;
        if (frameLayout != null && this.f16281B) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public boolean mo806e() {
        return false;
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.f16298o;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public C4933a getBadge() {
        return this.f16286G;
    }

    /* access modifiers changed from: protected */
    public int getItemBackgroundResId() {
        return C0075e.mtrl_navigation_bar_item_background;
    }

    public C0301i getItemData() {
        return this.f16304u;
    }

    /* access modifiers changed from: protected */
    public int getItemDefaultMarginResId() {
        return C0074d.mtrl_navigation_bar_item_default_margin;
    }

    /* access modifiers changed from: protected */
    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f16303t;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f16300q.getLayoutParams();
        return getSuggestedIconHeight() + layoutParams.topMargin + this.f16300q.getMeasuredHeight() + layoutParams.bottomMargin;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f16300q.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams.leftMargin + this.f16300q.getMeasuredWidth() + layoutParams.rightMargin);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo16614h() {
        mo16618p();
        this.f16304u = null;
        this.f16280A = Utils.FLOAT_EPSILON;
        this.f16287d = false;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0301i iVar = this.f16304u;
        if (iVar != null && iVar.isCheckable() && this.f16304u.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f16277H);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C4933a aVar = this.f16286G;
        if (aVar != null && aVar.isVisible()) {
            CharSequence title = this.f16304u.getTitle();
            if (!TextUtils.isEmpty(this.f16304u.getContentDescription())) {
                title = this.f16304u.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(title + ", " + this.f16286G.mo15522h());
        }
        AccessibilityNodeInfoCompat A0 = AccessibilityNodeInfoCompat.m3965A0(accessibilityNodeInfo);
        A0.mo3597b0(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.m4049a(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            A0.mo3593Z(false);
            A0.mo3586Q(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3746i);
        }
        A0.mo3623q0(getResources().getString(C0080j.f335h));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new C5104b(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo16618p() {
        m19961v(this.f16299p);
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f16298o;
        if (view != null) {
            view.setBackgroundDrawable(drawable);
            m19955o();
        }
    }

    public void setActiveIndicatorEnabled(boolean z) {
        int i;
        this.f16281B = z;
        m19955o();
        View view = this.f16298o;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.f16283D = i;
        m19963x(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.f16285F = i;
        m19963x(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.f16284E = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.f16282C = i;
        m19963x(getWidth());
    }

    /* access modifiers changed from: package-private */
    public void setBadge(C4933a aVar) {
        if (this.f16286G != aVar) {
            if (m19951k() && this.f16299p != null) {
                Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
                m19961v(this.f16299p);
            }
            this.f16286G = aVar;
            ImageView imageView = this.f16299p;
            if (imageView != null) {
                m19960u(imageView);
            }
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        float f;
        TextView textView = this.f16302s;
        textView.setPivotX((float) (textView.getWidth() / 2));
        TextView textView2 = this.f16302s;
        textView2.setPivotY((float) textView2.getBaseline());
        TextView textView3 = this.f16301r;
        textView3.setPivotX((float) (textView3.getWidth() / 2));
        TextView textView4 = this.f16301r;
        textView4.setPivotY((float) textView4.getBaseline());
        if (z) {
            f = 1.0f;
        } else {
            f = Utils.FLOAT_EPSILON;
        }
        m19953m(f);
        int i = this.f16295l;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    m19959t(getIconOrContainer(), this.f16290g, 49);
                    m19965z(this.f16300q, this.f16291h);
                    this.f16302s.setVisibility(0);
                } else {
                    m19959t(getIconOrContainer(), this.f16290g, 17);
                    m19965z(this.f16300q, 0);
                    this.f16302s.setVisibility(4);
                }
                this.f16301r.setVisibility(4);
            } else if (i == 1) {
                m19965z(this.f16300q, this.f16291h);
                if (z) {
                    m19959t(getIconOrContainer(), (int) (((float) this.f16290g) + this.f16292i), 49);
                    m19958s(this.f16302s, 1.0f, 1.0f, 0);
                    TextView textView5 = this.f16301r;
                    float f2 = this.f16293j;
                    m19958s(textView5, f2, f2, 4);
                } else {
                    m19959t(getIconOrContainer(), this.f16290g, 49);
                    TextView textView6 = this.f16302s;
                    float f3 = this.f16294k;
                    m19958s(textView6, f3, f3, 4);
                    m19958s(this.f16301r, 1.0f, 1.0f, 0);
                }
            } else if (i == 2) {
                m19959t(getIconOrContainer(), this.f16290g, 17);
                this.f16302s.setVisibility(8);
                this.f16301r.setVisibility(8);
            }
        } else if (this.f16296m) {
            if (z) {
                m19959t(getIconOrContainer(), this.f16290g, 49);
                m19965z(this.f16300q, this.f16291h);
                this.f16302s.setVisibility(0);
            } else {
                m19959t(getIconOrContainer(), this.f16290g, 17);
                m19965z(this.f16300q, 0);
                this.f16302s.setVisibility(4);
            }
            this.f16301r.setVisibility(4);
        } else {
            m19965z(this.f16300q, this.f16291h);
            if (z) {
                m19959t(getIconOrContainer(), (int) (((float) this.f16290g) + this.f16292i), 49);
                m19958s(this.f16302s, 1.0f, 1.0f, 0);
                TextView textView7 = this.f16301r;
                float f4 = this.f16293j;
                m19958s(textView7, f4, f4, 4);
            } else {
                m19959t(getIconOrContainer(), this.f16290g, 49);
                TextView textView8 = this.f16302s;
                float f5 = this.f16294k;
                m19958s(textView8, f5, f5, 4);
                m19958s(this.f16301r, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f16301r.setEnabled(z);
        this.f16302s.setEnabled(z);
        this.f16299p.setEnabled(z);
        if (z) {
            ViewCompat.m3554H0(this, C1166h1.m4234b(getContext(), FaceTecSDK.REQUEST_CODE_SESSION));
        } else {
            ViewCompat.m3554H0(this, (C1166h1) null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable != this.f16306w) {
            this.f16306w = drawable;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0836a.m3156r(drawable).mutate();
                this.f16307x = drawable;
                ColorStateList colorStateList = this.f16305v;
                if (colorStateList != null) {
                    C0836a.m3153o(drawable, colorStateList);
                }
            }
            this.f16299p.setImageDrawable(drawable);
        }
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f16299p.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f16299p.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f16305v = colorStateList;
        if (this.f16304u != null && (drawable = this.f16307x) != null) {
            C0836a.m3153o(drawable, colorStateList);
            this.f16307x.invalidateSelf();
        }
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : C0767a.m2895e(getContext(), i));
    }

    public void setItemPaddingBottom(int i) {
        if (this.f16291h != i) {
            this.f16291h = i;
            m19954n();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.f16290g != i) {
            this.f16290g = i;
            m19954n();
        }
    }

    public void setItemPosition(int i) {
        this.f16303t = i;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f16288e = colorStateList;
        m19955o();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f16295l != i) {
            this.f16295l = i;
            m19964y();
            m19963x(getWidth());
            m19954n();
        }
    }

    public void setShifting(boolean z) {
        if (this.f16296m != z) {
            this.f16296m = z;
            m19954n();
        }
    }

    public void setTextAppearanceActive(int i) {
        m19957r(this.f16302s, i);
        m19948g(this.f16301r.getTextSize(), this.f16302s.getTextSize());
    }

    public void setTextAppearanceInactive(int i) {
        m19957r(this.f16301r, i);
        m19948g(this.f16301r.getTextSize(), this.f16302s.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f16301r.setTextColor(colorStateList);
            this.f16302s.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f16301r.setText(charSequence);
        this.f16302s.setText(charSequence);
        C0301i iVar = this.f16304u;
        if (iVar == null || TextUtils.isEmpty(iVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        C0301i iVar2 = this.f16304u;
        if (iVar2 != null && !TextUtils.isEmpty(iVar2.getTooltipText())) {
            charSequence = this.f16304u.getTooltipText();
        }
        if (Build.VERSION.SDK_INT > 23) {
            C0512x1.m2056a(this, charSequence);
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f16289f = drawable;
        m19955o();
    }
}

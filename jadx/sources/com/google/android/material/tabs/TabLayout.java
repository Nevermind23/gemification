package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0512x1;
import androidx.core.graphics.drawable.C0836a;
import androidx.core.util.C1005e;
import androidx.core.util.C1007g;
import androidx.core.view.C1058a0;
import androidx.core.view.C1166h1;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.C1314o;
import androidx.viewpager.widget.C1907a;
import androidx.viewpager.widget.ViewPager;
import com.facetec.sdk.FaceTecSDK;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.badge.C4933a;
import com.google.android.material.badge.C4935b;
import com.google.android.material.internal.C5089m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p009a8.C0072b;
import p009a8.C0078h;
import p009a8.C0080j;
import p009a8.C0081k;
import p026b8.C2170a;
import p045d.C5769a;
import p106h8.C6477a;
import p223q8.C7926h;

@ViewPager.C1897e
public class TabLayout extends HorizontalScrollView {
    private static final int ANIMATION_DURATION = 300;
    static final int DEFAULT_GAP_TEXT_ICON = 8;
    private static final int DEFAULT_HEIGHT = 48;
    private static final int DEFAULT_HEIGHT_WITH_TEXT_ICON = 72;
    private static final int DEF_STYLE_RES = C0081k.f365m;
    static final int FIXED_WRAP_GUTTER_MIN = 16;
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    public static final int GRAVITY_START = 2;
    public static final int INDICATOR_ANIMATION_MODE_ELASTIC = 1;
    public static final int INDICATOR_ANIMATION_MODE_FADE = 2;
    public static final int INDICATOR_ANIMATION_MODE_LINEAR = 0;
    public static final int INDICATOR_GRAVITY_BOTTOM = 0;
    public static final int INDICATOR_GRAVITY_CENTER = 1;
    public static final int INDICATOR_GRAVITY_STRETCH = 3;
    public static final int INDICATOR_GRAVITY_TOP = 2;
    private static final int INVALID_WIDTH = -1;
    private static final String LOG_TAG = "TabLayout";
    public static final int MODE_AUTO = 2;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    private static final int SELECTED_INDICATOR_HEIGHT_DEFAULT = -1;
    public static final int TAB_LABEL_VISIBILITY_LABELED = 1;
    public static final int TAB_LABEL_VISIBILITY_UNLABELED = 0;
    private static final int TAB_MIN_WIDTH_MARGIN = 56;
    private static final C1005e tabPool = new C1007g(16);
    private C5147b adapterChangeListener;
    private int contentInsetStart;
    private C5148c currentVpSelectedListener;
    boolean inlineLabel;
    int mode;
    private C5154h pageChangeListener;
    private C1907a pagerAdapter;
    private DataSetObserver pagerAdapterObserver;
    private final int requestedTabMaxWidth;
    private final int requestedTabMinWidth;
    private ValueAnimator scrollAnimator;
    private final int scrollableTabMinWidth;
    private C5148c selectedListener;
    private final ArrayList<C5148c> selectedListeners;
    private C5153g selectedTab;
    private boolean setupViewPagerImplicitly;
    final C5151f slidingTabIndicator;
    final int tabBackgroundResId;
    int tabGravity;
    ColorStateList tabIconTint;
    PorterDuff.Mode tabIconTintMode;
    int tabIndicatorAnimationDuration;
    int tabIndicatorAnimationMode;
    boolean tabIndicatorFullWidth;
    int tabIndicatorGravity;
    int tabIndicatorHeight;
    /* access modifiers changed from: private */
    public C5160c tabIndicatorInterpolator;
    int tabMaxWidth;
    int tabPaddingBottom;
    int tabPaddingEnd;
    int tabPaddingStart;
    int tabPaddingTop;
    ColorStateList tabRippleColorStateList;
    Drawable tabSelectedIndicator;
    private int tabSelectedIndicatorColor;
    int tabTextAppearance;
    ColorStateList tabTextColors;
    float tabTextMultiLineSize;
    float tabTextSize;
    private final C1005e tabViewPool;
    private final ArrayList<C5153g> tabs;
    boolean unboundedRipple;
    ViewPager viewPager;

    /* renamed from: com.google.android.material.tabs.TabLayout$a */
    class C5146a implements ValueAnimator.AnimatorUpdateListener {
        C5146a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$b */
    private class C5147b implements ViewPager.C1901i {

        /* renamed from: a */
        private boolean f16462a;

        C5147b() {
        }

        /* renamed from: a */
        public void mo6547a(ViewPager viewPager, C1907a aVar, C1907a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.viewPager == viewPager) {
                tabLayout.setPagerAdapter(aVar2, this.f16462a);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo16941b(boolean z) {
            this.f16462a = z;
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$c */
    public interface C5148c {
        /* renamed from: a */
        void mo16942a(C5153g gVar);

        /* renamed from: b */
        void mo16943b(C5153g gVar);

        /* renamed from: c */
        void mo16944c(C5153g gVar);
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$d */
    public interface C5149d extends C5148c {
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$e */
    private class C5150e extends DataSetObserver {
        C5150e() {
        }

        public void onChanged() {
            TabLayout.this.populateFromPagerAdapter();
        }

        public void onInvalidated() {
            TabLayout.this.populateFromPagerAdapter();
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$f */
    class C5151f extends LinearLayout {

        /* renamed from: d */
        ValueAnimator f16465d;

        /* renamed from: e */
        private int f16466e = -1;

        /* renamed from: com.google.android.material.tabs.TabLayout$f$a */
        class C5152a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: d */
            final /* synthetic */ View f16468d;

            /* renamed from: e */
            final /* synthetic */ View f16469e;

            C5152a(View view, View view2) {
                this.f16468d = view;
                this.f16469e = view2;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C5151f.this.m20170h(this.f16468d, this.f16469e, valueAnimator.getAnimatedFraction());
            }
        }

        C5151f(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public void m20169e() {
            View childAt = getChildAt(TabLayout.this.getSelectedTabPosition());
            C5160c access$1300 = TabLayout.this.tabIndicatorInterpolator;
            TabLayout tabLayout = TabLayout.this;
            access$1300.mo16989c(tabLayout, childAt, tabLayout.tabSelectedIndicator);
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public void m20170h(View view, View view2, float f) {
            boolean z;
            if (view == null || view.getWidth() <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C5160c access$1300 = TabLayout.this.tabIndicatorInterpolator;
                TabLayout tabLayout = TabLayout.this;
                access$1300.mo16988d(tabLayout, view, view2, f, tabLayout.tabSelectedIndicator);
            } else {
                Drawable drawable = TabLayout.this.tabSelectedIndicator;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.tabSelectedIndicator.getBounds().bottom);
            }
            ViewCompat.m3601i0(this);
        }

        /* renamed from: i */
        private void m20171i(boolean z, int i, int i2) {
            View childAt = getChildAt(TabLayout.this.getSelectedTabPosition());
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                m20169e();
                return;
            }
            C5152a aVar = new C5152a(childAt, childAt2);
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f16465d = valueAnimator;
                valueAnimator.setInterpolator(C2170a.f6351b);
                valueAnimator.setDuration((long) i2);
                valueAnimator.setFloatValues(new float[]{Utils.FLOAT_EPSILON, 1.0f});
                valueAnimator.addUpdateListener(aVar);
                valueAnimator.start();
                return;
            }
            this.f16465d.removeAllUpdateListeners();
            this.f16465d.addUpdateListener(aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo16947c(int i, int i2) {
            ValueAnimator valueAnimator = this.f16465d;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f16465d.cancel();
            }
            m20171i(true, i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo16948d() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        public void draw(Canvas canvas) {
            int i;
            int height = TabLayout.this.tabSelectedIndicator.getBounds().height();
            if (height < 0) {
                height = TabLayout.this.tabSelectedIndicator.getIntrinsicHeight();
            }
            int i2 = TabLayout.this.tabIndicatorGravity;
            if (i2 == 0) {
                i = getHeight() - height;
                height = getHeight();
            } else if (i2 != 1) {
                i = 0;
                if (i2 != 2) {
                    if (i2 != 3) {
                        height = 0;
                    } else {
                        height = getHeight();
                    }
                }
            } else {
                i = (getHeight() - height) / 2;
                height = (getHeight() + height) / 2;
            }
            if (TabLayout.this.tabSelectedIndicator.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.tabSelectedIndicator.getBounds();
                TabLayout.this.tabSelectedIndicator.setBounds(bounds.left, i, bounds.right, height);
                TabLayout.this.tabSelectedIndicator.draw(canvas);
            }
            super.draw(canvas);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo16950f(int i, float f) {
            ValueAnimator valueAnimator = this.f16465d;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f16465d.cancel();
            }
            m20170h(getChildAt(i), getChildAt(i + 1), f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo16951g(int i) {
            Rect bounds = TabLayout.this.tabSelectedIndicator.getBounds();
            TabLayout.this.tabSelectedIndicator.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f16465d;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m20169e();
            } else {
                m20171i(false, TabLayout.this.getSelectedTabPosition(), -1);
            }
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z = true;
                if (tabLayout.tabGravity == 1 || tabLayout.mode == 2) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (((int) C5089m.m19901b(getContext(), 16)) * 2)) {
                            boolean z2 = false;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                                if (layoutParams.width != i3 || layoutParams.weight != Utils.FLOAT_EPSILON) {
                                    layoutParams.width = i3;
                                    layoutParams.weight = Utils.FLOAT_EPSILON;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.tabGravity = 0;
                            tabLayout2.updateTabViews(false);
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$g */
    public static class C5153g {

        /* renamed from: a */
        private Object f16471a;

        /* renamed from: b */
        private Drawable f16472b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public CharSequence f16473c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public CharSequence f16474d;

        /* renamed from: e */
        private int f16475e = -1;

        /* renamed from: f */
        private View f16476f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f16477g = 1;

        /* renamed from: h */
        public TabLayout f16478h;

        /* renamed from: i */
        public C5155i f16479i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f16480j = -1;

        /* renamed from: e */
        public View mo16956e() {
            return this.f16476f;
        }

        /* renamed from: f */
        public Drawable mo16957f() {
            return this.f16472b;
        }

        /* renamed from: g */
        public int mo16958g() {
            return this.f16475e;
        }

        /* renamed from: h */
        public int mo16959h() {
            return this.f16477g;
        }

        /* renamed from: i */
        public Object mo16960i() {
            return this.f16471a;
        }

        /* renamed from: j */
        public CharSequence mo16961j() {
            return this.f16473c;
        }

        /* renamed from: k */
        public boolean mo16962k() {
            TabLayout tabLayout = this.f16478h;
            if (tabLayout != null) {
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition == -1 || selectedTabPosition != this.f16475e) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo16963l() {
            this.f16478h = null;
            this.f16479i = null;
            this.f16471a = null;
            this.f16472b = null;
            this.f16480j = -1;
            this.f16473c = null;
            this.f16474d = null;
            this.f16475e = -1;
            this.f16476f = null;
        }

        /* renamed from: m */
        public void mo16964m() {
            TabLayout tabLayout = this.f16478h;
            if (tabLayout != null) {
                tabLayout.selectTab(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: n */
        public C5153g mo16965n(CharSequence charSequence) {
            this.f16474d = charSequence;
            mo16973v();
            return this;
        }

        /* renamed from: o */
        public C5153g mo16966o(int i) {
            return mo16967p(LayoutInflater.from(this.f16479i.getContext()).inflate(i, this.f16479i, false));
        }

        /* renamed from: p */
        public C5153g mo16967p(View view) {
            this.f16476f = view;
            mo16973v();
            return this;
        }

        /* renamed from: q */
        public C5153g mo16968q(Drawable drawable) {
            this.f16472b = drawable;
            TabLayout tabLayout = this.f16478h;
            if (tabLayout.tabGravity == 1 || tabLayout.mode == 2) {
                tabLayout.updateTabViews(true);
            }
            mo16973v();
            if (C4935b.f15557a && this.f16479i.m20213l() && this.f16479i.f16488h.isVisible()) {
                this.f16479i.invalidate();
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo16969r(int i) {
            this.f16475e = i;
        }

        /* renamed from: s */
        public C5153g mo16970s(Object obj) {
            this.f16471a = obj;
            return this;
        }

        /* renamed from: t */
        public C5153g mo16971t(int i) {
            TabLayout tabLayout = this.f16478h;
            if (tabLayout != null) {
                return mo16972u(tabLayout.getResources().getText(i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: u */
        public C5153g mo16972u(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f16474d) && !TextUtils.isEmpty(charSequence)) {
                this.f16479i.setContentDescription(charSequence);
            }
            this.f16473c = charSequence;
            mo16973v();
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo16973v() {
            C5155i iVar = this.f16479i;
            if (iVar != null) {
                iVar.mo16985t();
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$h */
    public static class C5154h implements ViewPager.C1902j {

        /* renamed from: d */
        private final WeakReference f16481d;

        /* renamed from: e */
        private int f16482e;

        /* renamed from: f */
        private int f16483f;

        public C5154h(TabLayout tabLayout) {
            this.f16481d = new WeakReference(tabLayout);
        }

        /* renamed from: L */
        public void mo6548L(int i, float f, int i2) {
            boolean z;
            TabLayout tabLayout = (TabLayout) this.f16481d.get();
            if (tabLayout != null) {
                int i3 = this.f16483f;
                boolean z2 = false;
                if (i3 != 2 || this.f16482e == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(i3 == 2 && this.f16482e == 0)) {
                    z2 = true;
                }
                tabLayout.setScrollPosition(i, f, z, z2);
            }
        }

        /* renamed from: Q */
        public void mo6549Q(int i) {
            boolean z;
            TabLayout tabLayout = (TabLayout) this.f16481d.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f16483f;
                if (i2 == 0 || (i2 == 2 && this.f16482e == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                tabLayout.selectTab(tabLayout.getTabAt(i), z);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16974a() {
            this.f16483f = 0;
            this.f16482e = 0;
        }

        /* renamed from: l0 */
        public void mo6550l0(int i) {
            this.f16482e = this.f16483f;
            this.f16483f = i;
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$i */
    public final class C5155i extends LinearLayout {

        /* renamed from: d */
        private C5153g f16484d;

        /* renamed from: e */
        private TextView f16485e;

        /* renamed from: f */
        private ImageView f16486f;

        /* renamed from: g */
        private View f16487g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C4933a f16488h;

        /* renamed from: i */
        private View f16489i;

        /* renamed from: j */
        private TextView f16490j;

        /* renamed from: k */
        private ImageView f16491k;

        /* renamed from: l */
        private Drawable f16492l;

        /* renamed from: m */
        private int f16493m = 2;

        /* renamed from: com.google.android.material.tabs.TabLayout$i$a */
        class C5156a implements View.OnLayoutChangeListener {

            /* renamed from: d */
            final /* synthetic */ View f16495d;

            C5156a(View view) {
                this.f16495d = view;
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.f16495d.getVisibility() == 0) {
                    C5155i.this.m20219s(this.f16495d);
                }
            }
        }

        public C5155i(Context context) {
            super(context);
            m20220u(context);
            ViewCompat.m3552G0(this, TabLayout.this.tabPaddingStart, TabLayout.this.tabPaddingTop, TabLayout.this.tabPaddingEnd, TabLayout.this.tabPaddingBottom);
            setGravity(17);
            setOrientation(TabLayout.this.inlineLabel ^ true ? 1 : 0);
            setClickable(true);
            ViewCompat.m3554H0(this, C1166h1.m4234b(getContext(), FaceTecSDK.REQUEST_CODE_SESSION));
        }

        /* renamed from: f */
        private void m20207f(View view) {
            if (view != null) {
                view.addOnLayoutChangeListener(new C5156a(view));
            }
        }

        /* renamed from: g */
        private float m20208g(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        private C4933a getBadge() {
            return this.f16488h;
        }

        private C4933a getOrCreateBadge() {
            if (this.f16488h == null) {
                this.f16488h = C4933a.m18819d(getContext());
            }
            m20218r();
            C4933a aVar = this.f16488h;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* renamed from: h */
        private void m20209h(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        /* renamed from: i */
        private FrameLayout m20210i() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public void m20211j(Canvas canvas) {
            Drawable drawable = this.f16492l;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f16492l.draw(canvas);
            }
        }

        /* renamed from: k */
        private FrameLayout m20212k(View view) {
            if ((view == this.f16486f || view == this.f16485e) && C4935b.f15557a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public boolean m20213l() {
            return this.f16488h != null;
        }

        /* renamed from: m */
        private void m20214m() {
            ViewGroup viewGroup;
            if (C4935b.f15557a) {
                viewGroup = m20210i();
                addView(viewGroup, 0);
            } else {
                viewGroup = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(C0078h.f293c, viewGroup, false);
            this.f16486f = imageView;
            viewGroup.addView(imageView, 0);
        }

        /* renamed from: n */
        private void m20215n() {
            ViewGroup viewGroup;
            if (C4935b.f15557a) {
                viewGroup = m20210i();
                addView(viewGroup);
            } else {
                viewGroup = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C0078h.f294d, viewGroup, false);
            this.f16485e = textView;
            viewGroup.addView(textView);
        }

        /* renamed from: p */
        private void m20216p(View view) {
            if (m20213l() && view != null) {
                m20209h(false);
                C4935b.m18851a(this.f16488h, view, m20212k(view));
                this.f16487g = view;
            }
        }

        /* renamed from: q */
        private void m20217q() {
            if (m20213l()) {
                m20209h(true);
                View view = this.f16487g;
                if (view != null) {
                    C4935b.m18854d(this.f16488h, view);
                    this.f16487g = null;
                }
            }
        }

        /* renamed from: r */
        private void m20218r() {
            C5153g gVar;
            C5153g gVar2;
            if (m20213l()) {
                if (this.f16489i != null) {
                    m20217q();
                } else if (this.f16486f != null && (gVar2 = this.f16484d) != null && gVar2.mo16957f() != null) {
                    View view = this.f16487g;
                    ImageView imageView = this.f16486f;
                    if (view != imageView) {
                        m20217q();
                        m20216p(this.f16486f);
                        return;
                    }
                    m20219s(imageView);
                } else if (this.f16485e == null || (gVar = this.f16484d) == null || gVar.mo16959h() != 1) {
                    m20217q();
                } else {
                    View view2 = this.f16487g;
                    TextView textView = this.f16485e;
                    if (view2 != textView) {
                        m20217q();
                        m20216p(this.f16485e);
                        return;
                    }
                    m20219s(textView);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public void m20219s(View view) {
            if (m20213l() && view == this.f16487g) {
                C4935b.m18855e(this.f16488h, view, m20212k(view));
            }
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        /* access modifiers changed from: private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: u */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m20220u(android.content.Context r6) {
            /*
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = r0.tabBackgroundResId
                r1 = 0
                if (r0 == 0) goto L_0x001f
                android.graphics.drawable.Drawable r6 = p045d.C5769a.m23210b(r6, r0)
                r5.f16492l = r6
                if (r6 == 0) goto L_0x0021
                boolean r6 = r6.isStateful()
                if (r6 == 0) goto L_0x0021
                android.graphics.drawable.Drawable r6 = r5.f16492l
                int[] r0 = r5.getDrawableState()
                r6.setState(r0)
                goto L_0x0021
            L_0x001f:
                r5.f16492l = r1
            L_0x0021:
                android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
                r6.<init>()
                r0 = 0
                r6.setColor(r0)
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r0 = r0.tabRippleColorStateList
                if (r0 == 0) goto L_0x0058
                android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
                r0.<init>()
                r2 = 925353388(0x3727c5ac, float:1.0E-5)
                r0.setCornerRadius(r2)
                r2 = -1
                r0.setColor(r2)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.tabRippleColorStateList
                android.content.res.ColorStateList r2 = p197o8.C7492b.m28454a(r2)
                android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.unboundedRipple
                if (r4 == 0) goto L_0x0050
                r6 = r1
            L_0x0050:
                if (r4 == 0) goto L_0x0053
                goto L_0x0054
            L_0x0053:
                r1 = r0
            L_0x0054:
                r3.<init>(r2, r6, r1)
                r6 = r3
            L_0x0058:
                androidx.core.view.ViewCompat.m3627v0(r5, r6)
                com.google.android.material.tabs.TabLayout r6 = com.google.android.material.tabs.TabLayout.this
                r6.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.C5155i.m20220u(android.content.Context):void");
        }

        /* renamed from: w */
        private void m20221w(TextView textView, ImageView imageView) {
            Drawable drawable;
            CharSequence charSequence;
            int i;
            C5153g gVar = this.f16484d;
            CharSequence charSequence2 = null;
            if (gVar == null || gVar.mo16957f() == null) {
                drawable = null;
            } else {
                drawable = C0836a.m3156r(this.f16484d.mo16957f()).mutate();
            }
            if (drawable != null) {
                C0836a.m3153o(drawable, TabLayout.this.tabIconTint);
                PorterDuff.Mode mode = TabLayout.this.tabIconTintMode;
                if (mode != null) {
                    C0836a.m3154p(drawable, mode);
                }
            }
            C5153g gVar2 = this.f16484d;
            if (gVar2 != null) {
                charSequence = gVar2.mo16961j();
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z) {
                    textView.setText(charSequence);
                    if (this.f16484d.f16477g == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (!z || imageView.getVisibility() != 0) {
                    i = 0;
                } else {
                    i = (int) C5089m.m19901b(getContext(), 8);
                }
                if (TabLayout.this.inlineLabel) {
                    if (i != C1058a0.m3950a(marginLayoutParams)) {
                        C1058a0.m3952c(marginLayoutParams, i);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    C1058a0.m3952c(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            C5153g gVar3 = this.f16484d;
            if (gVar3 != null) {
                charSequence2 = gVar3.f16474d;
            }
            if (Build.VERSION.SDK_INT > 23) {
                if (!z) {
                    charSequence = charSequence2;
                }
                C0512x1.m2056a(this, charSequence);
            }
        }

        /* access modifiers changed from: protected */
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f16492l;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.f16492l.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* access modifiers changed from: package-private */
        public int getContentHeight() {
            View[] viewArr = {this.f16485e, this.f16486f, this.f16489i};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    if (z) {
                        i2 = Math.min(i2, view.getTop());
                    } else {
                        i2 = view.getTop();
                    }
                    if (z) {
                        i = Math.max(i, view.getBottom());
                    } else {
                        i = view.getBottom();
                    }
                    z = true;
                }
            }
            return i - i2;
        }

        /* access modifiers changed from: package-private */
        public int getContentWidth() {
            View[] viewArr = {this.f16485e, this.f16486f, this.f16489i};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    if (z) {
                        i2 = Math.min(i2, view.getLeft());
                    } else {
                        i2 = view.getLeft();
                    }
                    if (z) {
                        i = Math.max(i, view.getRight());
                    } else {
                        i = view.getRight();
                    }
                    z = true;
                }
            }
            return i - i2;
        }

        public C5153g getTab() {
            return this.f16484d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo16979o() {
            setTab((C5153g) null);
            setSelected(false);
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            C4933a aVar = this.f16488h;
            if (aVar != null && aVar.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(contentDescription + ", " + this.f16488h.mo15522h());
            }
            AccessibilityNodeInfoCompat A0 = AccessibilityNodeInfoCompat.m3965A0(accessibilityNodeInfo);
            A0.mo3597b0(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.m4049a(0, 1, this.f16484d.mo16958g(), 1, false, isSelected()));
            if (isSelected()) {
                A0.mo3593Z(false);
                A0.mo3586Q(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3746i);
            }
            A0.mo3623q0(getResources().getString(C0080j.f335h));
        }

        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.tabMaxWidth, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f16485e != null) {
                float f = TabLayout.this.tabTextSize;
                int i3 = this.f16493m;
                ImageView imageView = this.f16486f;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f16485e;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.tabTextMultiLineSize;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f16485e.getTextSize();
                int lineCount = this.f16485e.getLineCount();
                int d = C1314o.m4562d(this.f16485e);
                int i4 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i4 != 0 || (d >= 0 && i3 != d)) {
                    if (TabLayout.this.mode == 1 && i4 > 0 && lineCount == 1 && ((layout = this.f16485e.getLayout()) == null || m20208g(layout, 0, f) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                        z = false;
                    }
                    if (z) {
                        this.f16485e.setTextSize(0, f);
                        this.f16485e.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f16484d == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f16484d.mo16964m();
            return true;
        }

        public void setSelected(boolean z) {
            if (isSelected() != z) {
            }
            super.setSelected(z);
            TextView textView = this.f16485e;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f16486f;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f16489i;
            if (view != null) {
                view.setSelected(z);
            }
        }

        /* access modifiers changed from: package-private */
        public void setTab(C5153g gVar) {
            if (gVar != this.f16484d) {
                this.f16484d = gVar;
                mo16985t();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public final void mo16985t() {
            View view;
            boolean z;
            C5153g gVar = this.f16484d;
            if (gVar != null) {
                view = gVar.mo16956e();
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f16489i = view;
                TextView textView = this.f16485e;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f16486f;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f16486f.setImageDrawable((Drawable) null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.f16490j = textView2;
                if (textView2 != null) {
                    this.f16493m = C1314o.m4562d(textView2);
                }
                this.f16491k = (ImageView) view.findViewById(16908294);
            } else {
                View view2 = this.f16489i;
                if (view2 != null) {
                    removeView(view2);
                    this.f16489i = null;
                }
                this.f16490j = null;
                this.f16491k = null;
            }
            if (this.f16489i == null) {
                if (this.f16486f == null) {
                    m20214m();
                }
                if (this.f16485e == null) {
                    m20215n();
                    this.f16493m = C1314o.m4562d(this.f16485e);
                }
                C1314o.m4575q(this.f16485e, TabLayout.this.tabTextAppearance);
                ColorStateList colorStateList = TabLayout.this.tabTextColors;
                if (colorStateList != null) {
                    this.f16485e.setTextColor(colorStateList);
                }
                m20221w(this.f16485e, this.f16486f);
                m20218r();
                m20207f(this.f16486f);
                m20207f(this.f16485e);
            } else {
                TextView textView3 = this.f16490j;
                if (!(textView3 == null && this.f16491k == null)) {
                    m20221w(textView3, this.f16491k);
                }
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.f16474d)) {
                setContentDescription(gVar.f16474d);
            }
            if (gVar == null || !gVar.mo16962k()) {
                z = false;
            } else {
                z = true;
            }
            setSelected(z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public final void mo16986v() {
            setOrientation(TabLayout.this.inlineLabel ^ true ? 1 : 0);
            TextView textView = this.f16490j;
            if (textView == null && this.f16491k == null) {
                m20221w(this.f16485e, this.f16486f);
            } else {
                m20221w(textView, this.f16491k);
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$j */
    public static class C5157j implements C5149d {

        /* renamed from: a */
        private final ViewPager f16497a;

        public C5157j(ViewPager viewPager) {
            this.f16497a = viewPager;
        }

        /* renamed from: a */
        public void mo16942a(C5153g gVar) {
            this.f16497a.setCurrentItem(gVar.mo16958g());
        }

        /* renamed from: b */
        public void mo16943b(C5153g gVar) {
        }

        /* renamed from: c */
        public void mo16944c(C5153g gVar) {
        }
    }

    public TabLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m20142a(TabItem tabItem) {
        C5153g newTab = newTab();
        CharSequence charSequence = tabItem.f16458d;
        if (charSequence != null) {
            newTab.mo16972u(charSequence);
        }
        Drawable drawable = tabItem.f16459e;
        if (drawable != null) {
            newTab.mo16968q(drawable);
        }
        int i = tabItem.f16460f;
        if (i != 0) {
            newTab.mo16966o(i);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            newTab.mo16965n(tabItem.getContentDescription());
        }
        addTab(newTab);
    }

    /* renamed from: b */
    private void m20143b(C5153g gVar) {
        C5155i iVar = gVar.f16479i;
        iVar.setSelected(false);
        iVar.setActivated(false);
        this.slidingTabIndicator.addView(iVar, gVar.mo16958g(), m20151j());
    }

    /* renamed from: c */
    private void m20144c(View view) {
        if (view instanceof TabItem) {
            m20142a((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: d */
    private void m20145d(int i) {
        if (i != -1) {
            if (getWindowToken() == null || !ViewCompat.m3579V(this) || this.slidingTabIndicator.mo16948d()) {
                setScrollPosition(i, Utils.FLOAT_EPSILON, true);
                return;
            }
            int scrollX = getScrollX();
            int g = m20148g(i, Utils.FLOAT_EPSILON);
            if (scrollX != g) {
                m20156o();
                this.scrollAnimator.setIntValues(new int[]{scrollX, g});
                this.scrollAnimator.start();
            }
            this.slidingTabIndicator.mo16947c(i, this.tabIndicatorAnimationDuration);
        }
    }

    /* renamed from: e */
    private void m20146e(int i) {
        if (i == 0) {
            Log.w(LOG_TAG, "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i == 1) {
            this.slidingTabIndicator.setGravity(1);
            return;
        } else if (i != 2) {
            return;
        }
        this.slidingTabIndicator.setGravity(8388611);
    }

    /* renamed from: f */
    private void m20147f() {
        int i;
        int i2 = this.mode;
        if (i2 == 0 || i2 == 2) {
            i = Math.max(0, this.contentInsetStart - this.tabPaddingStart);
        } else {
            i = 0;
        }
        ViewCompat.m3552G0(this.slidingTabIndicator, i, 0, 0, 0);
        int i3 = this.mode;
        if (i3 == 0) {
            m20146e(this.tabGravity);
        } else if (i3 == 1 || i3 == 2) {
            if (this.tabGravity == 2) {
                Log.w(LOG_TAG, "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.slidingTabIndicator.setGravity(1);
        }
        updateTabViews(true);
    }

    /* renamed from: g */
    private int m20148g(int i, float f) {
        View childAt;
        View view;
        int i2 = this.mode;
        int i3 = 0;
        if ((i2 != 0 && i2 != 2) || (childAt = this.slidingTabIndicator.getChildAt(i)) == null) {
            return 0;
        }
        int i4 = i + 1;
        if (i4 < this.slidingTabIndicator.getChildCount()) {
            view = this.slidingTabIndicator.getChildAt(i4);
        } else {
            view = null;
        }
        int width = childAt.getWidth();
        if (view != null) {
            i3 = view.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) (((float) (width + i3)) * 0.5f * f);
        if (ViewCompat.m3541B(this) == 0) {
            return left + i5;
        }
        return left - i5;
    }

    private int getDefaultHeight() {
        int size = this.tabs.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                C5153g gVar = this.tabs.get(i);
                if (gVar != null && gVar.mo16957f() != null && !TextUtils.isEmpty(gVar.mo16961j())) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        if (!z || this.inlineLabel) {
            return 48;
        }
        return 72;
    }

    private int getTabMinWidth() {
        int i = this.requestedTabMinWidth;
        if (i != -1) {
            return i;
        }
        int i2 = this.mode;
        if (i2 == 0 || i2 == 2) {
            return this.scrollableTabMinWidth;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.slidingTabIndicator.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: h */
    private void m20149h(C5153g gVar, int i) {
        gVar.mo16969r(i);
        this.tabs.add(i, gVar);
        int size = this.tabs.size();
        while (true) {
            i++;
            if (i < size) {
                this.tabs.get(i).mo16969r(i);
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    private static ColorStateList m20150i(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    /* renamed from: j */
    private LinearLayout.LayoutParams m20151j() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m20161t(layoutParams);
        return layoutParams;
    }

    /* renamed from: k */
    private C5155i m20152k(C5153g gVar) {
        C5155i iVar;
        C1005e eVar = this.tabViewPool;
        if (eVar != null) {
            iVar = (C5155i) eVar.mo3440b();
        } else {
            iVar = null;
        }
        if (iVar == null) {
            iVar = new C5155i(getContext());
        }
        iVar.setTab(gVar);
        iVar.setFocusable(true);
        iVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.f16474d)) {
            iVar.setContentDescription(gVar.f16473c);
        } else {
            iVar.setContentDescription(gVar.f16474d);
        }
        return iVar;
    }

    /* renamed from: l */
    private void m20153l(C5153g gVar) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).mo16944c(gVar);
        }
    }

    /* renamed from: m */
    private void m20154m(C5153g gVar) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).mo16942a(gVar);
        }
    }

    /* renamed from: n */
    private void m20155n(C5153g gVar) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).mo16943b(gVar);
        }
    }

    /* renamed from: o */
    private void m20156o() {
        if (this.scrollAnimator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.scrollAnimator = valueAnimator;
            valueAnimator.setInterpolator(C2170a.f6351b);
            this.scrollAnimator.setDuration((long) this.tabIndicatorAnimationDuration);
            this.scrollAnimator.addUpdateListener(new C5146a());
        }
    }

    /* renamed from: p */
    private boolean m20157p() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    /* renamed from: q */
    private void m20158q(int i) {
        C5155i iVar = (C5155i) this.slidingTabIndicator.getChildAt(i);
        this.slidingTabIndicator.removeViewAt(i);
        if (iVar != null) {
            iVar.mo16979o();
            this.tabViewPool.mo3439a(iVar);
        }
        requestLayout();
    }

    /* renamed from: r */
    private void m20159r(ViewPager viewPager2, boolean z, boolean z2) {
        ViewPager viewPager3 = this.viewPager;
        if (viewPager3 != null) {
            C5154h hVar = this.pageChangeListener;
            if (hVar != null) {
                viewPager3.removeOnPageChangeListener(hVar);
            }
            C5147b bVar = this.adapterChangeListener;
            if (bVar != null) {
                this.viewPager.removeOnAdapterChangeListener(bVar);
            }
        }
        C5148c cVar = this.currentVpSelectedListener;
        if (cVar != null) {
            removeOnTabSelectedListener(cVar);
            this.currentVpSelectedListener = null;
        }
        if (viewPager2 != null) {
            this.viewPager = viewPager2;
            if (this.pageChangeListener == null) {
                this.pageChangeListener = new C5154h(this);
            }
            this.pageChangeListener.mo16974a();
            viewPager2.addOnPageChangeListener(this.pageChangeListener);
            C5157j jVar = new C5157j(viewPager2);
            this.currentVpSelectedListener = jVar;
            addOnTabSelectedListener((C5148c) jVar);
            C1907a adapter = viewPager2.getAdapter();
            if (adapter != null) {
                setPagerAdapter(adapter, z);
            }
            if (this.adapterChangeListener == null) {
                this.adapterChangeListener = new C5147b();
            }
            this.adapterChangeListener.mo16941b(z);
            viewPager2.addOnAdapterChangeListener(this.adapterChangeListener);
            setScrollPosition(viewPager2.getCurrentItem(), Utils.FLOAT_EPSILON, true);
        } else {
            this.viewPager = null;
            setPagerAdapter((C1907a) null, false);
        }
        this.setupViewPagerImplicitly = z2;
    }

    /* renamed from: s */
    private void m20160s() {
        int size = this.tabs.size();
        for (int i = 0; i < size; i++) {
            this.tabs.get(i).mo16973v();
        }
    }

    private void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.slidingTabIndicator.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.slidingTabIndicator.getChildAt(i2);
                boolean z2 = true;
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
                if (i2 != i) {
                    z2 = false;
                }
                childAt.setActivated(z2);
            }
        }
    }

    /* renamed from: t */
    private void m20161t(LinearLayout.LayoutParams layoutParams) {
        if (this.mode == 1 && this.tabGravity == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = Utils.FLOAT_EPSILON;
    }

    public void addOnTabSelectedListener(C5149d dVar) {
        addOnTabSelectedListener((C5148c) dVar);
    }

    public void addTab(C5153g gVar) {
        addTab(gVar, this.tabs.isEmpty());
    }

    public void addView(View view) {
        m20144c(view);
    }

    public void clearOnTabSelectedListeners() {
        this.selectedListeners.clear();
    }

    /* access modifiers changed from: protected */
    public C5153g createTabFromPool() {
        C5153g gVar = (C5153g) tabPool.mo3440b();
        if (gVar == null) {
            return new C5153g();
        }
        return gVar;
    }

    public int getSelectedTabPosition() {
        C5153g gVar = this.selectedTab;
        if (gVar != null) {
            return gVar.mo16958g();
        }
        return -1;
    }

    public C5153g getTabAt(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.tabs.get(i);
    }

    public int getTabCount() {
        return this.tabs.size();
    }

    public int getTabGravity() {
        return this.tabGravity;
    }

    public ColorStateList getTabIconTint() {
        return this.tabIconTint;
    }

    public int getTabIndicatorAnimationMode() {
        return this.tabIndicatorAnimationMode;
    }

    public int getTabIndicatorGravity() {
        return this.tabIndicatorGravity;
    }

    /* access modifiers changed from: package-private */
    public int getTabMaxWidth() {
        return this.tabMaxWidth;
    }

    public int getTabMode() {
        return this.mode;
    }

    public ColorStateList getTabRippleColor() {
        return this.tabRippleColorStateList;
    }

    public Drawable getTabSelectedIndicator() {
        return this.tabSelectedIndicator;
    }

    public ColorStateList getTabTextColors() {
        return this.tabTextColors;
    }

    public boolean hasUnboundedRipple() {
        return this.unboundedRipple;
    }

    public boolean isInlineLabel() {
        return this.inlineLabel;
    }

    public boolean isTabIndicatorFullWidth() {
        return this.tabIndicatorFullWidth;
    }

    public C5153g newTab() {
        C5153g createTabFromPool = createTabFromPool();
        createTabFromPool.f16478h = this;
        createTabFromPool.f16479i = m20152k(createTabFromPool);
        if (createTabFromPool.f16480j != -1) {
            createTabFromPool.f16479i.setId(createTabFromPool.f16480j);
        }
        return createTabFromPool;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C7926h.m29970e(this);
        if (this.viewPager == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m20159r((ViewPager) parent, true, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.setupViewPagerImplicitly) {
            setupWithViewPager((ViewPager) null);
            this.setupViewPagerImplicitly = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
            View childAt = this.slidingTabIndicator.getChildAt(i);
            if (childAt instanceof C5155i) {
                ((C5155i) childAt).m20211j(canvas);
            }
        }
        super.onDraw(canvas);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.m3965A0(accessibilityNodeInfo).mo3595a0(AccessibilityNodeInfoCompat.CollectionInfoCompat.m4048a(1, getTabCount(), false, 1));
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return m20157p() && super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r0 != 2) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.C5089m.m19901b(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x002e
            if (r1 == 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x0041
        L_0x002e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L_0x0041
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L_0x0041
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L_0x0041:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L_0x005f
            int r1 = r6.requestedTabMaxWidth
            if (r1 <= 0) goto L_0x0050
            goto L_0x005d
        L_0x0050:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.C5089m.m19901b(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L_0x005d:
            r6.tabMaxWidth = r1
        L_0x005f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto L_0x00ad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.mode
            if (r0 == 0) goto L_0x0082
            if (r0 == r5) goto L_0x0076
            r1 = 2
            if (r0 == r1) goto L_0x0082
            goto L_0x008d
        L_0x0076:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L_0x008d
        L_0x0080:
            r4 = r5
            goto L_0x008d
        L_0x0082:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L_0x008d
            goto L_0x0080
        L_0x008d:
            if (r4 == 0) goto L_0x00ad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || m20157p()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void populateFromPagerAdapter() {
        int currentItem;
        removeAllTabs();
        C1907a aVar = this.pagerAdapter;
        if (aVar != null) {
            int d = aVar.mo6557d();
            for (int i = 0; i < d; i++) {
                addTab(newTab().mo16972u(this.pagerAdapter.mo6559f(i)), false);
            }
            ViewPager viewPager2 = this.viewPager;
            if (viewPager2 != null && d > 0 && (currentItem = viewPager2.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                selectTab(getTabAt(currentItem));
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean releaseFromTabPool(C5153g gVar) {
        return tabPool.mo3439a(gVar);
    }

    public void removeAllTabs() {
        for (int childCount = this.slidingTabIndicator.getChildCount() - 1; childCount >= 0; childCount--) {
            m20158q(childCount);
        }
        Iterator<C5153g> it = this.tabs.iterator();
        while (it.hasNext()) {
            C5153g next = it.next();
            it.remove();
            next.mo16963l();
            releaseFromTabPool(next);
        }
        this.selectedTab = null;
    }

    public void removeOnTabSelectedListener(C5149d dVar) {
        removeOnTabSelectedListener((C5148c) dVar);
    }

    public void removeTab(C5153g gVar) {
        if (gVar.f16478h == this) {
            removeTabAt(gVar.mo16958g());
            return;
        }
        throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
    }

    public void removeTabAt(int i) {
        int i2;
        C5153g gVar;
        C5153g gVar2 = this.selectedTab;
        if (gVar2 != null) {
            i2 = gVar2.mo16958g();
        } else {
            i2 = 0;
        }
        m20158q(i);
        C5153g remove = this.tabs.remove(i);
        if (remove != null) {
            remove.mo16963l();
            releaseFromTabPool(remove);
        }
        int size = this.tabs.size();
        for (int i3 = i; i3 < size; i3++) {
            this.tabs.get(i3).mo16969r(i3);
        }
        if (i2 == i) {
            if (this.tabs.isEmpty()) {
                gVar = null;
            } else {
                gVar = this.tabs.get(Math.max(0, i - 1));
            }
            selectTab(gVar);
        }
    }

    public void selectTab(C5153g gVar) {
        selectTab(gVar, true);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C7926h.m29969d(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.inlineLabel != z) {
            this.inlineLabel = z;
            for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
                View childAt = this.slidingTabIndicator.getChildAt(i);
                if (childAt instanceof C5155i) {
                    ((C5155i) childAt).mo16986v();
                }
            }
            m20147f();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(C5149d dVar) {
        setOnTabSelectedListener((C5148c) dVar);
    }

    /* access modifiers changed from: package-private */
    public void setPagerAdapter(C1907a aVar, boolean z) {
        DataSetObserver dataSetObserver;
        C1907a aVar2 = this.pagerAdapter;
        if (!(aVar2 == null || (dataSetObserver = this.pagerAdapterObserver) == null)) {
            aVar2.mo6566s(dataSetObserver);
        }
        this.pagerAdapter = aVar;
        if (z && aVar != null) {
            if (this.pagerAdapterObserver == null) {
                this.pagerAdapterObserver = new C5150e();
            }
            aVar.mo6562k(this.pagerAdapterObserver);
        }
        populateFromPagerAdapter();
    }

    /* access modifiers changed from: package-private */
    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m20156o();
        this.scrollAnimator.addListener(animatorListener);
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = C0836a.m3156r(drawable).mutate();
        this.tabSelectedIndicator = mutate;
        C6477a.m25602f(mutate, this.tabSelectedIndicatorColor);
        int i = this.tabIndicatorHeight;
        if (i == -1) {
            i = this.tabSelectedIndicator.getIntrinsicHeight();
        }
        this.slidingTabIndicator.mo16951g(i);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.tabSelectedIndicatorColor = i;
        C6477a.m25602f(this.tabSelectedIndicator, i);
        updateTabViews(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.tabIndicatorGravity != i) {
            this.tabIndicatorGravity = i;
            ViewCompat.m3601i0(this.slidingTabIndicator);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.tabIndicatorHeight = i;
        this.slidingTabIndicator.mo16951g(i);
    }

    public void setTabGravity(int i) {
        if (this.tabGravity != i) {
            this.tabGravity = i;
            m20147f();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.tabIconTint != colorStateList) {
            this.tabIconTint = colorStateList;
            m20160s();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C5769a.m23209a(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.tabIndicatorAnimationMode = i;
        if (i == 0) {
            this.tabIndicatorInterpolator = new C5160c();
        } else if (i == 1) {
            this.tabIndicatorInterpolator = new C5158a();
        } else if (i == 2) {
            this.tabIndicatorInterpolator = new C5159b();
        } else {
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.tabIndicatorFullWidth = z;
        this.slidingTabIndicator.m20169e();
        ViewCompat.m3601i0(this.slidingTabIndicator);
    }

    public void setTabMode(int i) {
        if (i != this.mode) {
            this.mode = i;
            m20147f();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.tabRippleColorStateList != colorStateList) {
            this.tabRippleColorStateList = colorStateList;
            for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
                View childAt = this.slidingTabIndicator.getChildAt(i);
                if (childAt instanceof C5155i) {
                    ((C5155i) childAt).m20220u(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C5769a.m23209a(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.tabTextColors != colorStateList) {
            this.tabTextColors = colorStateList;
            m20160s();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(C1907a aVar) {
        setPagerAdapter(aVar, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.unboundedRipple != z) {
            this.unboundedRipple = z;
            for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
                View childAt = this.slidingTabIndicator.getChildAt(i);
                if (childAt instanceof C5155i) {
                    ((C5155i) childAt).m20220u(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager2) {
        setupWithViewPager(viewPager2, true);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* access modifiers changed from: package-private */
    public void updateTabViews(boolean z) {
        for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
            View childAt = this.slidingTabIndicator.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m20161t((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0072b.f138X);
    }

    @Deprecated
    public void addOnTabSelectedListener(C5148c cVar) {
        if (!this.selectedListeners.contains(cVar)) {
            this.selectedListeners.add(cVar);
        }
    }

    public void addTab(C5153g gVar, int i) {
        addTab(gVar, i, this.tabs.isEmpty());
    }

    public void addView(View view, int i) {
        m20144c(view);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void removeOnTabSelectedListener(C5148c cVar) {
        this.selectedListeners.remove(cVar);
    }

    public void selectTab(C5153g gVar, boolean z) {
        C5153g gVar2 = this.selectedTab;
        if (gVar2 != gVar) {
            int g = gVar != null ? gVar.mo16958g() : -1;
            if (z) {
                if ((gVar2 == null || gVar2.mo16958g() == -1) && g != -1) {
                    setScrollPosition(g, Utils.FLOAT_EPSILON, true);
                } else {
                    m20145d(g);
                }
                if (g != -1) {
                    setSelectedTabView(g);
                }
            }
            this.selectedTab = gVar;
            if (gVar2 != null) {
                m20155n(gVar2);
            }
            if (gVar != null) {
                m20154m(gVar);
            }
        } else if (gVar2 != null) {
            m20153l(gVar);
            m20145d(gVar.mo16958g());
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(C5148c cVar) {
        C5148c cVar2 = this.selectedListener;
        if (cVar2 != null) {
            removeOnTabSelectedListener(cVar2);
        }
        this.selectedListener = cVar;
        if (cVar != null) {
            addOnTabSelectedListener(cVar);
        }
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        int i2;
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.slidingTabIndicator.getChildCount()) {
            if (z2) {
                this.slidingTabIndicator.mo16950f(i, f);
            }
            ValueAnimator valueAnimator = this.scrollAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.scrollAnimator.cancel();
            }
            if (i < 0) {
                i2 = 0;
            } else {
                i2 = m20148g(i, f);
            }
            scrollTo(i2, 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    public void setupWithViewPager(ViewPager viewPager2, boolean z) {
        m20159r(viewPager2, z, false);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TabLayout(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            int r4 = DEF_STYLE_RES
            android.content.Context r12 = p249s8.C8273a.m31120c(r12, r13, r14, r4)
            r11.<init>(r12, r13, r14)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r11.tabs = r12
            r12 = 0
            r11.tabSelectedIndicatorColor = r12
            r0 = 2147483647(0x7fffffff, float:NaN)
            r11.tabMaxWidth = r0
            r6 = -1
            r11.tabIndicatorHeight = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.selectedListeners = r0
            androidx.core.util.f r0 = new androidx.core.util.f
            r1 = 12
            r0.<init>(r1)
            r11.tabViewPool = r0
            android.content.Context r7 = r11.getContext()
            r11.setHorizontalScrollBarEnabled(r12)
            com.google.android.material.tabs.TabLayout$f r8 = new com.google.android.material.tabs.TabLayout$f
            r8.<init>(r7)
            r11.slidingTabIndicator = r8
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r6)
            super.addView(r8, r12, r0)
            int[] r2 = p009a8.C0082l.f396B6
            r9 = 1
            int[] r5 = new int[r9]
            int r10 = p009a8.C0082l.f630Z6
            r5[r12] = r10
            r0 = r7
            r1 = r13
            r3 = r14
            android.content.res.TypedArray r13 = com.google.android.material.internal.C5088l.m19898i(r0, r1, r2, r3, r4, r5)
            android.graphics.drawable.Drawable r14 = r11.getBackground()
            boolean r14 = r14 instanceof android.graphics.drawable.ColorDrawable
            if (r14 == 0) goto L_0x007d
            android.graphics.drawable.Drawable r14 = r11.getBackground()
            android.graphics.drawable.ColorDrawable r14 = (android.graphics.drawable.ColorDrawable) r14
            q8.g r0 = new q8.g
            r0.<init>()
            int r14 = r14.getColor()
            android.content.res.ColorStateList r14 = android.content.res.ColorStateList.valueOf(r14)
            r0.mo22941X(r14)
            r0.mo22934M(r7)
            float r14 = androidx.core.view.ViewCompat.m3628w(r11)
            r0.mo22940W(r14)
            androidx.core.view.ViewCompat.m3627v0(r11, r0)
        L_0x007d:
            int r14 = p009a8.C0082l.f456H6
            android.graphics.drawable.Drawable r14 = p184n8.C7343c.m28007e(r7, r13, r14)
            r11.setSelectedTabIndicator((android.graphics.drawable.Drawable) r14)
            int r14 = p009a8.C0082l.f486K6
            int r14 = r13.getColor(r14, r12)
            r11.setSelectedTabIndicatorColor(r14)
            int r14 = p009a8.C0082l.f516N6
            int r14 = r13.getDimensionPixelSize(r14, r6)
            r8.mo16951g(r14)
            int r14 = p009a8.C0082l.f506M6
            int r14 = r13.getInt(r14, r12)
            r11.setSelectedTabIndicatorGravity(r14)
            int r14 = p009a8.C0082l.f476J6
            int r14 = r13.getInt(r14, r12)
            r11.setTabIndicatorAnimationMode(r14)
            int r14 = p009a8.C0082l.f496L6
            boolean r14 = r13.getBoolean(r14, r9)
            r11.setTabIndicatorFullWidth(r14)
            int r14 = p009a8.C0082l.f566S6
            int r14 = r13.getDimensionPixelSize(r14, r12)
            r11.tabPaddingBottom = r14
            r11.tabPaddingEnd = r14
            r11.tabPaddingTop = r14
            r11.tabPaddingStart = r14
            int r0 = p009a8.C0082l.f594V6
            int r14 = r13.getDimensionPixelSize(r0, r14)
            r11.tabPaddingStart = r14
            int r14 = p009a8.C0082l.f603W6
            int r0 = r11.tabPaddingTop
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.tabPaddingTop = r14
            int r14 = p009a8.C0082l.f585U6
            int r0 = r11.tabPaddingEnd
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.tabPaddingEnd = r14
            int r14 = p009a8.C0082l.f576T6
            int r0 = r11.tabPaddingBottom
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.tabPaddingBottom = r14
            int r14 = p009a8.C0081k.f357e
            int r14 = r13.getResourceId(r10, r14)
            r11.tabTextAppearance = r14
            int[] r0 = p030c.C2219j.f6754a3
            android.content.res.TypedArray r14 = r7.obtainStyledAttributes(r14, r0)
            int r0 = p030c.C2219j.f6759b3     // Catch:{ all -> 0x01b2 }
            int r0 = r14.getDimensionPixelSize(r0, r12)     // Catch:{ all -> 0x01b2 }
            float r0 = (float) r0     // Catch:{ all -> 0x01b2 }
            r11.tabTextSize = r0     // Catch:{ all -> 0x01b2 }
            int r0 = p030c.C2219j.f6774e3     // Catch:{ all -> 0x01b2 }
            android.content.res.ColorStateList r0 = p184n8.C7343c.m28003a(r7, r14, r0)     // Catch:{ all -> 0x01b2 }
            r11.tabTextColors = r0     // Catch:{ all -> 0x01b2 }
            r14.recycle()
            int r14 = p009a8.C0082l.f640a7
            boolean r0 = r13.hasValue(r14)
            if (r0 == 0) goto L_0x0117
            android.content.res.ColorStateList r14 = p184n8.C7343c.m28003a(r7, r13, r14)
            r11.tabTextColors = r14
        L_0x0117:
            int r14 = p009a8.C0082l.f621Y6
            boolean r0 = r13.hasValue(r14)
            if (r0 == 0) goto L_0x012f
            int r14 = r13.getColor(r14, r12)
            android.content.res.ColorStateList r0 = r11.tabTextColors
            int r0 = r0.getDefaultColor()
            android.content.res.ColorStateList r14 = m20150i(r0, r14)
            r11.tabTextColors = r14
        L_0x012f:
            int r14 = p009a8.C0082l.f436F6
            android.content.res.ColorStateList r14 = p184n8.C7343c.m28003a(r7, r13, r14)
            r11.tabIconTint = r14
            int r14 = p009a8.C0082l.f446G6
            int r14 = r13.getInt(r14, r6)
            r0 = 0
            android.graphics.PorterDuff$Mode r14 = com.google.android.material.internal.C5089m.m19906g(r14, r0)
            r11.tabIconTintMode = r14
            int r14 = p009a8.C0082l.f612X6
            android.content.res.ColorStateList r14 = p184n8.C7343c.m28003a(r7, r13, r14)
            r11.tabRippleColorStateList = r14
            int r14 = p009a8.C0082l.f466I6
            r0 = 300(0x12c, float:4.2E-43)
            int r14 = r13.getInt(r14, r0)
            r11.tabIndicatorAnimationDuration = r14
            int r14 = p009a8.C0082l.f546Q6
            int r14 = r13.getDimensionPixelSize(r14, r6)
            r11.requestedTabMinWidth = r14
            int r14 = p009a8.C0082l.f536P6
            int r14 = r13.getDimensionPixelSize(r14, r6)
            r11.requestedTabMaxWidth = r14
            int r14 = p009a8.C0082l.f406C6
            int r14 = r13.getResourceId(r14, r12)
            r11.tabBackgroundResId = r14
            int r14 = p009a8.C0082l.f416D6
            int r14 = r13.getDimensionPixelSize(r14, r12)
            r11.contentInsetStart = r14
            int r14 = p009a8.C0082l.f556R6
            int r14 = r13.getInt(r14, r9)
            r11.mode = r14
            int r14 = p009a8.C0082l.f426E6
            int r14 = r13.getInt(r14, r12)
            r11.tabGravity = r14
            int r14 = p009a8.C0082l.f526O6
            boolean r14 = r13.getBoolean(r14, r12)
            r11.inlineLabel = r14
            int r14 = p009a8.C0082l.f650b7
            boolean r12 = r13.getBoolean(r14, r12)
            r11.unboundedRipple = r12
            r13.recycle()
            android.content.res.Resources r12 = r11.getResources()
            int r13 = p009a8.C0074d.f218m
            int r13 = r12.getDimensionPixelSize(r13)
            float r13 = (float) r13
            r11.tabTextMultiLineSize = r13
            int r13 = p009a8.C0074d.f216l
            int r12 = r12.getDimensionPixelSize(r13)
            r11.scrollableTabMinWidth = r12
            r11.m20147f()
            return
        L_0x01b2:
            r12 = move-exception
            r14.recycle()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void addTab(C5153g gVar, boolean z) {
        addTab(gVar, this.tabs.size(), z);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m20144c(view);
    }

    public void addTab(C5153g gVar, int i, boolean z) {
        if (gVar.f16478h == this) {
            m20149h(gVar, i);
            m20143b(gVar);
            if (z) {
                gVar.mo16964m();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m20144c(view);
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(m20150i(i, i2));
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(C5769a.m23210b(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}

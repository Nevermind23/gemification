package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.C0313m;
import androidx.core.graphics.C0829d;
import androidx.core.view.C1268x0;
import androidx.core.view.C1274y0;
import androidx.core.view.C1279z0;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.C11398b;
import p030c.C2210a;
import p030c.C2215f;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements C0465m0, C1268x0, C1274y0 {

    /* renamed from: I */
    static final int[] f1724I = {C2210a.f6446b, 16842841};

    /* renamed from: A */
    private WindowInsetsCompat f1725A;

    /* renamed from: B */
    private C0328d f1726B;

    /* renamed from: C */
    private OverScroller f1727C;

    /* renamed from: D */
    ViewPropertyAnimator f1728D;

    /* renamed from: E */
    final AnimatorListenerAdapter f1729E;

    /* renamed from: F */
    private final Runnable f1730F;

    /* renamed from: G */
    private final Runnable f1731G;

    /* renamed from: H */
    private final C1279z0 f1732H;

    /* renamed from: d */
    private int f1733d;

    /* renamed from: e */
    private int f1734e = 0;

    /* renamed from: f */
    private ContentFrameLayout f1735f;

    /* renamed from: g */
    ActionBarContainer f1736g;

    /* renamed from: h */
    private C0469n0 f1737h;

    /* renamed from: i */
    private Drawable f1738i;

    /* renamed from: j */
    private boolean f1739j;

    /* renamed from: k */
    private boolean f1740k;

    /* renamed from: l */
    private boolean f1741l;

    /* renamed from: m */
    private boolean f1742m;

    /* renamed from: n */
    boolean f1743n;

    /* renamed from: o */
    private int f1744o;

    /* renamed from: p */
    private int f1745p;

    /* renamed from: q */
    private final Rect f1746q = new Rect();

    /* renamed from: r */
    private final Rect f1747r = new Rect();

    /* renamed from: s */
    private final Rect f1748s = new Rect();

    /* renamed from: t */
    private final Rect f1749t = new Rect();

    /* renamed from: u */
    private final Rect f1750u = new Rect();

    /* renamed from: v */
    private final Rect f1751v = new Rect();

    /* renamed from: w */
    private final Rect f1752w = new Rect();

    /* renamed from: x */
    private WindowInsetsCompat f1753x;

    /* renamed from: y */
    private WindowInsetsCompat f1754y;

    /* renamed from: z */
    private WindowInsetsCompat f1755z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    class C0325a extends AnimatorListenerAdapter {
        C0325a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1728D = null;
            actionBarOverlayLayout.f1743n = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1728D = null;
            actionBarOverlayLayout.f1743n = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    class C0326b implements Runnable {
        C0326b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo1292o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1728D = actionBarOverlayLayout.f1736g.animate().translationY(Utils.FLOAT_EPSILON).setListener(ActionBarOverlayLayout.this.f1729E);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    class C0327c implements Runnable {
        C0327c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo1292o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1728D = actionBarOverlayLayout.f1736g.animate().translationY((float) (-ActionBarOverlayLayout.this.f1736g.getHeight())).setListener(ActionBarOverlayLayout.this.f1729E);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface C0328d {
        /* renamed from: a */
        void mo677a();

        /* renamed from: b */
        void mo678b(int i);

        /* renamed from: c */
        void mo679c();

        /* renamed from: d */
        void mo680d(boolean z);

        /* renamed from: e */
        void mo681e();

        /* renamed from: f */
        void mo682f();
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0329e extends ViewGroup.MarginLayoutParams {
        public C0329e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0329e(int i, int i2) {
            super(i, i2);
        }

        public C0329e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.f3676b;
        this.f1753x = windowInsetsCompat;
        this.f1754y = windowInsetsCompat;
        this.f1755z = windowInsetsCompat;
        this.f1725A = windowInsetsCompat;
        this.f1729E = new C0325a();
        this.f1730F = new C0326b();
        this.f1731G = new C0327c();
        m1267p(context);
        this.f1732H = new C1279z0(this);
    }

    /* renamed from: b */
    private void m1264b() {
        mo1292o();
        this.f1731G.run();
    }

    /* renamed from: k */
    private boolean m1265k(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        C0329e eVar = (C0329e) view.getLayoutParams();
        if (!z || eVar.leftMargin == (i4 = rect.left)) {
            z5 = false;
        } else {
            eVar.leftMargin = i4;
            z5 = true;
        }
        if (z2 && eVar.topMargin != (i3 = rect.top)) {
            eVar.topMargin = i3;
            z5 = true;
        }
        if (z4 && eVar.rightMargin != (i2 = rect.right)) {
            eVar.rightMargin = i2;
            z5 = true;
        }
        if (!z3 || eVar.bottomMargin == (i = rect.bottom)) {
            return z5;
        }
        eVar.bottomMargin = i;
        return true;
    }

    /* renamed from: n */
    private C0469n0 m1266n(View view) {
        if (view instanceof C0469n0) {
            return (C0469n0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: p */
    private void m1267p(Context context) {
        boolean z;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1724I);
        boolean z2 = false;
        this.f1733d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1738i = drawable;
        if (drawable == null) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.f1739j = z2;
        this.f1727C = new OverScroller(context);
    }

    /* renamed from: r */
    private void m1268r() {
        mo1292o();
        postDelayed(this.f1731G, 600);
    }

    /* renamed from: s */
    private void m1269s() {
        mo1292o();
        postDelayed(this.f1730F, 600);
    }

    /* renamed from: u */
    private void m1270u() {
        mo1292o();
        this.f1730F.run();
    }

    /* renamed from: v */
    private boolean m1271v(float f) {
        this.f1727C.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1727C.getFinalY() > this.f1736g.getHeight()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo1272a() {
        mo1327t();
        return this.f1737h.mo2233a();
    }

    /* renamed from: c */
    public boolean mo1273c() {
        mo1327t();
        return this.f1737h.mo2235c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0329e;
    }

    /* renamed from: d */
    public boolean mo1275d() {
        mo1327t();
        return this.f1737h.mo2237d();
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1738i != null && !this.f1739j) {
            if (this.f1736g.getVisibility() == 0) {
                i = (int) (((float) this.f1736g.getBottom()) + this.f1736g.getTranslationY() + 0.5f);
            } else {
                i = 0;
            }
            this.f1738i.setBounds(0, i, getWidth(), this.f1738i.getIntrinsicHeight() + i);
            this.f1738i.draw(canvas);
        }
    }

    /* renamed from: e */
    public void mo1277e(Menu menu, C0313m.C0314a aVar) {
        mo1327t();
        this.f1737h.mo2238e(menu, aVar);
    }

    /* renamed from: f */
    public boolean mo1278f() {
        mo1327t();
        return this.f1737h.mo2239f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    /* renamed from: g */
    public void mo1280g() {
        mo1327t();
        this.f1737h.mo2240g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1736g;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f1732H.mo3748a();
    }

    public CharSequence getTitle() {
        mo1327t();
        return this.f1737h.getTitle();
    }

    /* renamed from: h */
    public boolean mo1287h() {
        mo1327t();
        return this.f1737h.mo2242h();
    }

    /* renamed from: i */
    public void mo1288i(int i) {
        mo1327t();
        if (i == 2) {
            this.f1737h.mo2252r();
        } else if (i == 5) {
            this.f1737h.mo2266z();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    /* renamed from: j */
    public void mo1289j() {
        mo1327t();
        this.f1737h.mo2260t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C0329e generateDefaultLayoutParams() {
        return new C0329e(-1, -1);
    }

    /* renamed from: m */
    public C0329e generateLayoutParams(AttributeSet attributeSet) {
        return new C0329e(getContext(), attributeSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo1292o() {
        removeCallbacks(this.f1730F);
        removeCallbacks(this.f1731G);
        ViewPropertyAnimator viewPropertyAnimator = this.f1728D;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        mo1327t();
        WindowInsetsCompat x = WindowInsetsCompat.m3813x(windowInsets, this);
        boolean k = m1265k(this.f1736g, new Rect(x.mo3494j(), x.mo3496l(), x.mo3495k(), x.mo3493i()), true, true, false, true);
        ViewCompat.m3594f(this, x, this.f1746q);
        Rect rect = this.f1746q;
        WindowInsetsCompat n = x.mo3498n(rect.left, rect.top, rect.right, rect.bottom);
        this.f1753x = n;
        boolean z = true;
        if (!this.f1754y.equals(n)) {
            this.f1754y = this.f1753x;
            k = true;
        }
        if (!this.f1747r.equals(this.f1746q)) {
            this.f1747r.set(this.f1746q);
        } else {
            z = k;
        }
        if (z) {
            requestLayout();
        }
        return x.mo3483a().mo3485c().mo3484b().mo3505v();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1267p(getContext());
        ViewCompat.m3613o0(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1292o();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0329e eVar = (C0329e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = eVar.leftMargin + paddingLeft;
                int i7 = eVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        mo1327t();
        measureChildWithMargins(this.f1736g, i, 0, i2, 0);
        C0329e eVar = (C0329e) this.f1736g.getLayoutParams();
        int max = Math.max(0, this.f1736g.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f1736g.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1736g.getMeasuredState());
        if ((ViewCompat.m3565N(this) & C11398b.f33139r) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i3 = this.f1733d;
            if (this.f1741l && this.f1736g.getTabContainer() != null) {
                i3 += this.f1733d;
            }
        } else {
            i3 = this.f1736g.getVisibility() != 8 ? this.f1736g.getMeasuredHeight() : 0;
        }
        this.f1748s.set(this.f1746q);
        WindowInsetsCompat windowInsetsCompat = this.f1753x;
        this.f1755z = windowInsetsCompat;
        if (this.f1740k || z) {
            this.f1755z = new WindowInsetsCompat.C1037b(this.f1755z).mo3508c(C0829d.m3106b(windowInsetsCompat.mo3494j(), this.f1755z.mo3496l() + i3, this.f1755z.mo3495k(), this.f1755z.mo3493i() + 0)).mo3506a();
        } else {
            Rect rect = this.f1748s;
            rect.top += i3;
            rect.bottom += 0;
            this.f1755z = windowInsetsCompat.mo3498n(0, i3, 0, 0);
        }
        m1265k(this.f1735f, this.f1748s, true, true, true, true);
        if (!this.f1725A.equals(this.f1755z)) {
            WindowInsetsCompat windowInsetsCompat2 = this.f1755z;
            this.f1725A = windowInsetsCompat2;
            ViewCompat.m3596g(this.f1735f, windowInsetsCompat2);
        }
        measureChildWithMargins(this.f1735f, i, 0, i2, 0);
        C0329e eVar2 = (C0329e) this.f1735f.getLayoutParams();
        int max3 = Math.max(max, this.f1735f.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f1735f.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1735f.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f1742m || !z) {
            return false;
        }
        if (m1271v(f2)) {
            m1264b();
        } else {
            m1270u();
        }
        this.f1743n = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }

    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        super.onWindowSystemUiVisibilityChanged(i);
        mo1327t();
        int i2 = this.f1745p ^ i;
        this.f1745p = i;
        boolean z2 = false;
        if ((i & 4) == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & C11398b.f33139r) != 0) {
            z2 = true;
        }
        C0328d dVar = this.f1726B;
        if (dVar != null) {
            dVar.mo680d(!z2);
            if (z || !z2) {
                this.f1726B.mo677a();
            } else {
                this.f1726B.mo681e();
            }
        }
        if ((i2 & C11398b.f33139r) != 0 && this.f1726B != null) {
            ViewCompat.m3613o0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1734e = i;
        C0328d dVar = this.f1726B;
        if (dVar != null) {
            dVar.mo678b(i);
        }
    }

    /* renamed from: q */
    public boolean mo1313q() {
        return this.f1740k;
    }

    public void setActionBarHideOffset(int i) {
        mo1292o();
        this.f1736g.setTranslationY((float) (-Math.max(0, Math.min(i, this.f1736g.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0328d dVar) {
        this.f1726B = dVar;
        if (getWindowToken() != null) {
            this.f1726B.mo678b(this.f1734e);
            int i = this.f1745p;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                ViewCompat.m3613o0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f1741l = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f1742m) {
            this.f1742m = z;
            if (!z) {
                mo1292o();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo1327t();
        this.f1737h.setIcon(i);
    }

    public void setLogo(int i) {
        mo1327t();
        this.f1737h.mo2262v(i);
    }

    public void setOverlayMode(boolean z) {
        boolean z2;
        this.f1740k = z;
        if (!z || getContext().getApplicationInfo().targetSdkVersion >= 19) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f1739j = z2;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        mo1327t();
        this.f1737h.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo1327t();
        this.f1737h.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo1327t() {
        if (this.f1735f == null) {
            this.f1735f = (ContentFrameLayout) findViewById(C2215f.f6555b);
            this.f1736g = (ActionBarContainer) findViewById(C2215f.f6556c);
            this.f1737h = m1266n(findViewById(C2215f.f6554a));
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0329e(layoutParams);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1732H.mo3749b(view, view2, i);
        this.f1744o = getActionBarHideOffset();
        mo1292o();
        C0328d dVar = this.f1726B;
        if (dVar != null) {
            dVar.mo682f();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1736g.getVisibility() != 0) {
            return false;
        }
        return this.f1742m;
    }

    public void onStopNestedScroll(View view) {
        if (this.f1742m && !this.f1743n) {
            if (this.f1744o <= this.f1736g.getHeight()) {
                m1269s();
            } else {
                m1268r();
            }
        }
        C0328d dVar = this.f1726B;
        if (dVar != null) {
            dVar.mo679c();
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f1744o + i2;
        this.f1744o = i5;
        setActionBarHideOffset(i5);
    }

    public void setIcon(Drawable drawable) {
        mo1327t();
        this.f1737h.setIcon(drawable);
    }
}

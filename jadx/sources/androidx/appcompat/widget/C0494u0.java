package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.graphics.drawable.C0836a;
import androidx.core.p016os.C0904b;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.widget.C1307k;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p030c.C2210a;
import p058e.C5876c;

/* renamed from: androidx.appcompat.widget.u0 */
class C0494u0 extends ListView {

    /* renamed from: d */
    private final Rect f2223d = new Rect();

    /* renamed from: e */
    private int f2224e = 0;

    /* renamed from: f */
    private int f2225f = 0;

    /* renamed from: g */
    private int f2226g = 0;

    /* renamed from: h */
    private int f2227h = 0;

    /* renamed from: i */
    private int f2228i;

    /* renamed from: j */
    private C0498d f2229j;

    /* renamed from: k */
    private boolean f2230k;

    /* renamed from: l */
    private boolean f2231l;

    /* renamed from: m */
    private boolean f2232m;

    /* renamed from: n */
    private ViewPropertyAnimatorCompat f2233n;

    /* renamed from: o */
    private C1307k f2234o;

    /* renamed from: p */
    C0500f f2235p;

    /* renamed from: androidx.appcompat.widget.u0$a */
    static class C0495a {
        /* renamed from: a */
        static void m1995a(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    /* renamed from: androidx.appcompat.widget.u0$b */
    static class C0496b {

        /* renamed from: a */
        private static Method f2236a;

        /* renamed from: b */
        private static Method f2237b;

        /* renamed from: c */
        private static Method f2238c;

        /* renamed from: d */
        private static boolean f2239d = true;

        static {
            Class<AdapterView> cls = AdapterView.class;
            Class<AbsListView> cls2 = AbsListView.class;
            try {
                Class cls3 = Integer.TYPE;
                Class cls4 = Float.TYPE;
                Method declaredMethod = cls2.getDeclaredMethod("positionSelector", new Class[]{cls3, View.class, Boolean.TYPE, cls4, cls4});
                f2236a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = cls.getDeclaredMethod("setSelectedPositionInt", new Class[]{cls3});
                f2237b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = cls.getDeclaredMethod("setNextSelectedPositionInt", new Class[]{cls3});
                f2238c = declaredMethod3;
                declaredMethod3.setAccessible(true);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: a */
        static boolean m1996a() {
            return f2239d;
        }

        /* renamed from: b */
        static void m1997b(C0494u0 u0Var, int i, View view) {
            try {
                f2236a.invoke(u0Var, new Object[]{Integer.valueOf(i), view, Boolean.FALSE, -1, -1});
                f2237b.invoke(u0Var, new Object[]{Integer.valueOf(i)});
                f2238c.invoke(u0Var, new Object[]{Integer.valueOf(i)});
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.u0$c */
    static class C0497c {
        /* renamed from: a */
        static boolean m1998a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        /* renamed from: b */
        static void m1999b(AbsListView absListView, boolean z) {
            absListView.setSelectedChildViewEnabled(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.u0$d */
    private static class C0498d extends C5876c {

        /* renamed from: e */
        private boolean f2240e = true;

        C0498d(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2341b(boolean z) {
            this.f2240e = z;
        }

        public void draw(Canvas canvas) {
            if (this.f2240e) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f2240e) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f2240e) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f2240e) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f2240e) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.u0$e */
    static class C0499e {

        /* renamed from: a */
        private static final Field f2241a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            f2241a = field;
        }

        /* renamed from: a */
        static boolean m2001a(AbsListView absListView) {
            Field field = f2241a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: b */
        static void m2002b(AbsListView absListView, boolean z) {
            Field field = f2241a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.u0$f */
    private class C0500f implements Runnable {
        C0500f() {
        }

        /* renamed from: a */
        public void mo2347a() {
            C0494u0 u0Var = C0494u0.this;
            u0Var.f2235p = null;
            u0Var.removeCallbacks(this);
        }

        /* renamed from: b */
        public void mo2348b() {
            C0494u0.this.post(this);
        }

        public void run() {
            C0494u0 u0Var = C0494u0.this;
            u0Var.f2235p = null;
            u0Var.drawableStateChanged();
        }
    }

    C0494u0(Context context, boolean z) {
        super(context, (AttributeSet) null, C2210a.f6470z);
        this.f2231l = z;
        setCacheColorHint(0);
    }

    /* renamed from: a */
    private void m1981a() {
        this.f2232m = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f2228i - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f2233n;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.mo3470c();
            this.f2233n = null;
        }
    }

    /* renamed from: b */
    private void m1982b(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: c */
    private void m1983c(Canvas canvas) {
        Drawable selector;
        if (!this.f2223d.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f2223d);
            selector.draw(canvas);
        }
    }

    /* renamed from: f */
    private void m1984f(int i, View view) {
        Rect rect = this.f2223d;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f2224e;
        rect.top -= this.f2225f;
        rect.right += this.f2226g;
        rect.bottom += this.f2227h;
        boolean k = m1989k();
        if (view.isEnabled() != k) {
            m1990l(!k);
            if (i != -1) {
                refreshDrawableState();
            }
        }
    }

    /* renamed from: g */
    private void m1985g(int i, View view) {
        boolean z;
        Drawable selector = getSelector();
        boolean z2 = true;
        if (selector == null || i == -1) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            selector.setVisible(false, false);
        }
        m1984f(i, view);
        if (z) {
            Rect rect = this.f2223d;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z2 = false;
            }
            selector.setVisible(z2, false);
            C0836a.m3149k(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: h */
    private void m1986h(int i, View view, float f, float f2) {
        m1985g(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C0836a.m3149k(selector, f, f2);
        }
    }

    /* renamed from: i */
    private void m1987i(View view, int i, float f, float f2) {
        View childAt;
        this.f2232m = true;
        C0495a.m1995a(this, f, f2);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f2228i;
        if (!(i2 == -1 || (childAt = getChildAt(i2 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f2228i = i;
        C0495a.m1995a(view, f - ((float) view.getLeft()), f2 - ((float) view.getTop()));
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m1986h(i, view, f, f2);
        m1988j(false);
        refreshDrawableState();
    }

    /* renamed from: j */
    private void m1988j(boolean z) {
        C0498d dVar = this.f2229j;
        if (dVar != null) {
            dVar.mo2341b(z);
        }
    }

    /* renamed from: k */
    private boolean m1989k() {
        if (C0904b.m3331c()) {
            return C0497c.m1998a(this);
        }
        return C0499e.m2001a(this);
    }

    /* renamed from: l */
    private void m1990l(boolean z) {
        if (C0904b.m3331c()) {
            C0497c.m1999b(this, z);
        } else {
            C0499e.m2002b(this, z);
        }
    }

    /* renamed from: m */
    private boolean m1991m() {
        return this.f2232m;
    }

    /* renamed from: n */
    private void m1992n() {
        Drawable selector = getSelector();
        if (selector != null && m1991m() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* renamed from: d */
    public int mo2055d(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i7 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i8 = 0;
        int i9 = 0;
        int i12 = 0;
        View view = null;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i13 = layoutParams.height;
            if (i13 > 0) {
                i6 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
            } else {
                i6 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i6);
            view.forceLayout();
            if (i8 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 < i4) {
                if (i5 >= 0 && i8 >= i5) {
                    i12 = i7;
                }
                i8++;
            } else if (i5 < 0 || i8 <= i5 || i12 <= 0 || i7 == i4) {
                return i4;
            } else {
                return i12;
            }
        }
        return i7;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m1983c(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f2235p == null) {
            super.drawableStateChanged();
            m1988j(true);
            m1992n();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2056e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r3 = r1
            r9 = r2
            goto L_0x0046
        L_0x0011:
            r9 = r2
            r3 = r9
            goto L_0x0046
        L_0x0014:
            r3 = r1
            goto L_0x0017
        L_0x0016:
            r3 = r2
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = r1
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m1987i(r3, r5, r4, r9)
            if (r0 != r1) goto L_0x000e
            r7.m1982b(r3, r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.m1981a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            androidx.core.widget.k r9 = r7.f2234o
            if (r9 != 0) goto L_0x005a
            androidx.core.widget.k r9 = new androidx.core.widget.k
            r9.<init>(r7)
            r7.f2234o = r9
        L_0x005a:
            androidx.core.widget.k r9 = r7.f2234o
            r9.mo3845m(r1)
            androidx.core.widget.k r9 = r7.f2234o
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            androidx.core.widget.k r8 = r7.f2234o
            if (r8 == 0) goto L_0x006c
            r8.mo3845m(r2)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0494u0.mo2056e(android.view.MotionEvent, int):boolean");
    }

    public boolean hasFocus() {
        return this.f2231l || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f2231l || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f2231l || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f2231l && this.f2230k) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f2235p = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f2235p == null) {
            C0500f fVar = new C0500f();
            this.f2235p = fVar;
            fVar.mo2348b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !C0496b.m1996a()) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        C0496b.m1997b(this, pointToPosition, childAt);
                    }
                }
                m1992n();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2228i = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C0500f fVar = this.f2235p;
        if (fVar != null) {
            fVar.mo2347a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f2230k = z;
    }

    public void setSelector(Drawable drawable) {
        C0498d dVar;
        if (drawable != null) {
            dVar = new C0498d(drawable);
        } else {
            dVar = null;
        }
        this.f2229j = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f2224e = rect.left;
        this.f2225f = rect.top;
        this.f2226g = rect.right;
        this.f2227h = rect.bottom;
    }
}

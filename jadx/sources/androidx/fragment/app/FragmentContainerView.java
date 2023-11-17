package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p085g0.C6200c;

public final class FragmentContainerView extends FrameLayout {

    /* renamed from: d */
    private final List f4168d;

    /* renamed from: e */
    private final List f4169e;

    /* renamed from: f */
    private View.OnApplyWindowInsetsListener f4170f;

    /* renamed from: g */
    private boolean f4171g;

    /* renamed from: androidx.fragment.app.FragmentContainerView$a */
    public static final class C1441a {

        /* renamed from: a */
        public static final C1441a f4172a = new C1441a();

        private C1441a() {
        }

        /* renamed from: a */
        public final WindowInsets mo4349a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
            C41536l.m120489i(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            C41536l.m120489i(view, "v");
            C41536l.m120489i(windowInsets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            C41536l.m120488h(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: a */
    private final void m4948a(View view) {
        if (this.f4169e.contains(view)) {
            this.f4168d.add(view);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C41536l.m120489i(view, "child");
        if (FragmentManager.m4950G0(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsetsCompat windowInsetsCompat;
        C41536l.m120489i(windowInsets, "insets");
        WindowInsetsCompat w = WindowInsetsCompat.m3812w(windowInsets);
        C41536l.m120488h(w, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f4170f;
        if (onApplyWindowInsetsListener != null) {
            C1441a aVar = C1441a.f4172a;
            C41536l.m120486f(onApplyWindowInsetsListener);
            windowInsetsCompat = WindowInsetsCompat.m3812w(aVar.mo4349a(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            windowInsetsCompat = ViewCompat.m3591d0(this, w);
        }
        C41536l.m120488h(windowInsetsCompat, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!windowInsetsCompat.mo3499p()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewCompat.m3596g(getChildAt(i), windowInsetsCompat);
            }
        }
        return windowInsets;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        C41536l.m120489i(canvas, "canvas");
        if (this.f4171g) {
            for (View drawChild : this.f4168d) {
                super.drawChild(canvas, drawChild, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C41536l.m120489i(canvas, "canvas");
        C41536l.m120489i(view, "child");
        if (!this.f4171g || !(!this.f4168d.isEmpty()) || !this.f4168d.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public void endViewTransition(View view) {
        C41536l.m120489i(view, "view");
        this.f4169e.remove(view);
        if (this.f4168d.remove(view)) {
            this.f4171g = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return FragmentManager.m4980m0(this).mo4415j0(getId());
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        C41536l.m120489i(windowInsets, "insets");
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                C41536l.m120488h(childAt, "view");
                m4948a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    public void removeView(View view) {
        C41536l.m120489i(view, "view");
        m4948a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i) {
        View childAt = getChildAt(i);
        C41536l.m120488h(childAt, "view");
        m4948a(childAt);
        super.removeViewAt(i);
    }

    public void removeViewInLayout(View view) {
        C41536l.m120489i(view, "view");
        m4948a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C41536l.m120488h(childAt, "view");
            m4948a(childAt);
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C41536l.m120488h(childAt, "view");
            m4948a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.f4171g = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        C41536l.m120489i(onApplyWindowInsetsListener, "listener");
        this.f4170f = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        C41536l.m120489i(view, "view");
        if (view.getParent() == this) {
            this.f4169e.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        C41536l.m120489i(context, "context");
        this.f4168d = new ArrayList();
        this.f4169e = new ArrayList();
        this.f4171g = true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        C41536l.m120489i(context, "context");
        this.f4168d = new ArrayList();
        this.f4169e = new ArrayList();
        this.f4171g = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = C6200c.f19211e;
            C41536l.m120488h(iArr, "FragmentContainerView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(C6200c.f19212f);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        String str;
        C41536l.m120489i(context, "context");
        C41536l.m120489i(attributeSet, "attrs");
        C41536l.m120489i(fragmentManager, "fm");
        this.f4168d = new ArrayList();
        this.f4169e = new ArrayList();
        this.f4171g = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = C6200c.f19211e;
        C41536l.m120488h(iArr, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(C6200c.f19212f) : classAttribute;
        String string = obtainStyledAttributes.getString(C6200c.f19213g);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment j0 = fragmentManager.mo4415j0(id);
        if (classAttribute != null && j0 == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a = fragmentManager.mo4441w0().mo4458a(context.getClassLoader(), classAttribute);
            C41536l.m120488h(a, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a.onInflate(context, attributeSet, (Bundle) null);
            fragmentManager.mo4428p().mo4643x(true).mo4633d(this, a, string).mo4518l();
        }
        fragmentManager.mo4406e1(this);
    }
}

package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.C1055a;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.salesforce.marketingcloud.C11398b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p266u.C8435c;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class ViewCompat {

    /* renamed from: a */
    private static final AtomicInteger f3649a = new AtomicInteger(1);

    /* renamed from: b */
    private static WeakHashMap f3650b = null;

    /* renamed from: c */
    private static Field f3651c;

    /* renamed from: d */
    private static boolean f3652d = false;

    /* renamed from: e */
    private static final int[] f3653e = {C8435c.f23922b, C8435c.f23923c, C8435c.f23934n, C8435c.f23945y, C8435c.f23903B, C8435c.f23904C, C8435c.f23905D, C8435c.f23906E, C8435c.f23907F, C8435c.f23908G, C8435c.f23924d, C8435c.f23925e, C8435c.f23926f, C8435c.f23927g, C8435c.f23928h, C8435c.f23929i, C8435c.f23930j, C8435c.f23931k, C8435c.f23932l, C8435c.f23933m, C8435c.f23935o, C8435c.f23936p, C8435c.f23937q, C8435c.f23938r, C8435c.f23939s, C8435c.f23940t, C8435c.f23941u, C8435c.f23942v, C8435c.f23943w, C8435c.f23944x, C8435c.f23946z, C8435c.f23902A};

    /* renamed from: f */
    private static final C1123c1 f3654f = new C1186k1();

    /* renamed from: g */
    private static final C1014e f3655g = new C1014e();

    public interface OnUnhandledKeyEventListenerCompat {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* renamed from: androidx.core.view.ViewCompat$a */
    class C1010a extends C1015f {
        C1010a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean mo3442d(View view) {
            return Boolean.valueOf(C1027q.m3771d(view));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo3443e(View view, Boolean bool) {
            C1027q.m3776i(view, bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo3444h(Boolean bool, Boolean bool2) {
            return !mo3462a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$b */
    class C1011b extends C1015f {
        C1011b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence mo3442d(View view) {
            return C1027q.m3769b(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo3443e(View view, CharSequence charSequence) {
            C1027q.m3775h(view, charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo3444h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$c */
    class C1012c extends C1015f {
        C1012c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence mo3442d(View view) {
            return C1029s.m3781a(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo3443e(View view, CharSequence charSequence) {
            C1029s.m3782b(view, charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo3444h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$d */
    class C1013d extends C1015f {
        C1013d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean mo3442d(View view) {
            return Boolean.valueOf(C1027q.m3770c(view));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo3443e(View view, Boolean bool) {
            C1027q.m3774g(view, bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo3444h(Boolean bool, Boolean bool2) {
            return !mo3462a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$e */
    static class C1014e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: d */
        private final WeakHashMap f3656d = new WeakHashMap();

        C1014e() {
        }

        /* renamed from: b */
        private void m3660b(View view, boolean z) {
            boolean z2;
            int i;
            if (!view.isShown() || view.getWindowVisibility() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z != z2) {
                if (z2) {
                    i = 16;
                } else {
                    i = 32;
                }
                ViewCompat.m3585a0(view, i);
                this.f3656d.put(view, Boolean.valueOf(z2));
            }
        }

        /* renamed from: c */
        private void m3661c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        /* renamed from: e */
        private void m3662e(View view) {
            C1017h.m3688o(view.getViewTreeObserver(), this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3457a(View view) {
            boolean z;
            WeakHashMap weakHashMap = this.f3656d;
            if (!view.isShown() || view.getWindowVisibility() != 0) {
                z = false;
            } else {
                z = true;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(this);
            if (C1020k.m3708b(view)) {
                m3661c(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3458d(View view) {
            this.f3656d.remove(view);
            view.removeOnAttachStateChangeListener(this);
            m3662e(view);
        }

        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry entry : this.f3656d.entrySet()) {
                    m3660b((View) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            m3661c(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$f */
    static abstract class C1015f {

        /* renamed from: a */
        private final int f3657a;

        /* renamed from: b */
        private final Class f3658b;

        /* renamed from: c */
        private final int f3659c;

        /* renamed from: d */
        private final int f3660d;

        C1015f(int i, Class cls, int i2) {
            this(i, cls, 0, i2);
        }

        /* renamed from: b */
        private boolean m3665b() {
            return true;
        }

        /* renamed from: c */
        private boolean m3666c() {
            return Build.VERSION.SDK_INT >= this.f3659c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3462a(Boolean bool, Boolean bool2) {
            boolean z;
            boolean z2;
            if (bool == null || !bool.booleanValue()) {
                z = false;
            } else {
                z = true;
            }
            if (bool2 == null || !bool2.booleanValue()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z == z2) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract Object mo3442d(View view);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract void mo3443e(View view, Object obj);

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Object mo3463f(View view) {
            if (m3666c()) {
                return mo3442d(view);
            }
            if (!m3665b()) {
                return null;
            }
            Object tag = view.getTag(this.f3657a);
            if (this.f3658b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo3464g(View view, Object obj) {
            if (m3666c()) {
                mo3443e(view, obj);
            } else if (m3665b() && mo3444h(mo3463f(view), obj)) {
                ViewCompat.m3602j(view);
                view.setTag(this.f3657a, obj);
                ViewCompat.m3585a0(view, this.f3660d);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public abstract boolean mo3444h(Object obj, Object obj2);

        C1015f(int i, Class cls, int i2, int i3) {
            this.f3657a = i;
            this.f3658b = cls;
            this.f3660d = i2;
            this.f3659c = i3;
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$g */
    static class C1016g {
        /* renamed from: a */
        static boolean m3673a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$h */
    static class C1017h {
        /* renamed from: a */
        static AccessibilityNodeProvider m3674a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        /* renamed from: b */
        static boolean m3675b(View view) {
            return view.getFitsSystemWindows();
        }

        /* renamed from: c */
        static int m3676c(View view) {
            return view.getImportantForAccessibility();
        }

        /* renamed from: d */
        static int m3677d(View view) {
            return view.getMinimumHeight();
        }

        /* renamed from: e */
        static int m3678e(View view) {
            return view.getMinimumWidth();
        }

        /* renamed from: f */
        static ViewParent m3679f(View view) {
            return view.getParentForAccessibility();
        }

        /* renamed from: g */
        static int m3680g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        /* renamed from: h */
        static boolean m3681h(View view) {
            return view.hasOverlappingRendering();
        }

        /* renamed from: i */
        static boolean m3682i(View view) {
            return view.hasTransientState();
        }

        /* renamed from: j */
        static boolean m3683j(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        /* renamed from: k */
        static void m3684k(View view) {
            view.postInvalidateOnAnimation();
        }

        /* renamed from: l */
        static void m3685l(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        /* renamed from: m */
        static void m3686m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        /* renamed from: n */
        static void m3687n(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        /* renamed from: o */
        static void m3688o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        /* renamed from: p */
        static void m3689p(View view) {
            view.requestFitSystemWindows();
        }

        /* renamed from: q */
        static void m3690q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        /* renamed from: r */
        static void m3691r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        /* renamed from: s */
        static void m3692s(View view, int i) {
            view.setImportantForAccessibility(i);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$i */
    static class C1018i {
        /* renamed from: a */
        static int m3693a() {
            return View.generateViewId();
        }

        /* renamed from: b */
        static Display m3694b(View view) {
            return view.getDisplay();
        }

        /* renamed from: c */
        static int m3695c(View view) {
            return view.getLabelFor();
        }

        /* renamed from: d */
        static int m3696d(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: e */
        static int m3697e(View view) {
            return view.getPaddingEnd();
        }

        /* renamed from: f */
        static int m3698f(View view) {
            return view.getPaddingStart();
        }

        /* renamed from: g */
        static boolean m3699g(View view) {
            return view.isPaddingRelative();
        }

        /* renamed from: h */
        static void m3700h(View view, int i) {
            view.setLabelFor(i);
        }

        /* renamed from: i */
        static void m3701i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        /* renamed from: j */
        static void m3702j(View view, int i) {
            view.setLayoutDirection(i);
        }

        /* renamed from: k */
        static void m3703k(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$j */
    static class C1019j {
        /* renamed from: a */
        static Rect m3704a(View view) {
            return view.getClipBounds();
        }

        /* renamed from: b */
        static boolean m3705b(View view) {
            return view.isInLayout();
        }

        /* renamed from: c */
        static void m3706c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$k */
    static class C1020k {
        /* renamed from: a */
        static int m3707a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        /* renamed from: b */
        static boolean m3708b(View view) {
            return view.isAttachedToWindow();
        }

        /* renamed from: c */
        static boolean m3709c(View view) {
            return view.isLaidOut();
        }

        /* renamed from: d */
        static boolean m3710d(View view) {
            return view.isLayoutDirectionResolved();
        }

        /* renamed from: e */
        static void m3711e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }

        /* renamed from: f */
        static void m3712f(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        /* renamed from: g */
        static void m3713g(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$l */
    static class C1021l {
        /* renamed from: a */
        static WindowInsets m3714a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        /* renamed from: b */
        static WindowInsets m3715b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: c */
        static void m3716c(View view) {
            view.requestApplyInsets();
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$m */
    private static class C1022m {

        /* renamed from: androidx.core.view.ViewCompat$m$a */
        class C1023a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            WindowInsetsCompat f3661a = null;

            /* renamed from: b */
            final /* synthetic */ View f3662b;

            /* renamed from: c */
            final /* synthetic */ C1060a1 f3663c;

            C1023a(View view, C1060a1 a1Var) {
                this.f3662b = view;
                this.f3663c = a1Var;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsetsCompat x = WindowInsetsCompat.m3813x(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    C1022m.m3717a(windowInsets, this.f3662b);
                    if (x.equals(this.f3661a)) {
                        return this.f3663c.onApplyWindowInsets(view, x).mo3505v();
                    }
                }
                this.f3661a = x;
                WindowInsetsCompat onApplyWindowInsets = this.f3663c.onApplyWindowInsets(view, x);
                if (i >= 30) {
                    return onApplyWindowInsets.mo3505v();
                }
                ViewCompat.m3613o0(view);
                return onApplyWindowInsets.mo3505v();
            }
        }

        /* renamed from: a */
        static void m3717a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C8435c.f23920S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        static WindowInsetsCompat m3718b(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
            WindowInsets v = windowInsetsCompat.mo3505v();
            if (v != null) {
                return WindowInsetsCompat.m3813x(view.computeSystemWindowInsets(v, rect), view);
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        /* renamed from: c */
        static boolean m3719c(View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        /* renamed from: d */
        static boolean m3720d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        /* renamed from: e */
        static boolean m3721e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        /* renamed from: f */
        static boolean m3722f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        /* renamed from: g */
        static ColorStateList m3723g(View view) {
            return view.getBackgroundTintList();
        }

        /* renamed from: h */
        static PorterDuff.Mode m3724h(View view) {
            return view.getBackgroundTintMode();
        }

        /* renamed from: i */
        static float m3725i(View view) {
            return view.getElevation();
        }

        /* renamed from: j */
        public static WindowInsetsCompat m3726j(View view) {
            return WindowInsetsCompat.C1036a.m3835a(view);
        }

        /* renamed from: k */
        static String m3727k(View view) {
            return view.getTransitionName();
        }

        /* renamed from: l */
        static float m3728l(View view) {
            return view.getTranslationZ();
        }

        /* renamed from: m */
        static float m3729m(View view) {
            return view.getZ();
        }

        /* renamed from: n */
        static boolean m3730n(View view) {
            return view.hasNestedScrollingParent();
        }

        /* renamed from: o */
        static boolean m3731o(View view) {
            return view.isImportantForAccessibility();
        }

        /* renamed from: p */
        static boolean m3732p(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* renamed from: q */
        static void m3733q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        /* renamed from: r */
        static void m3734r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        /* renamed from: s */
        static void m3735s(View view, float f) {
            view.setElevation(f);
        }

        /* renamed from: t */
        static void m3736t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        /* renamed from: u */
        static void m3737u(View view, C1060a1 a1Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C8435c.f23913L, a1Var);
            }
            if (a1Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C8435c.f23920S));
            } else {
                view.setOnApplyWindowInsetsListener(new C1023a(view, a1Var));
            }
        }

        /* renamed from: v */
        static void m3738v(View view, String str) {
            view.setTransitionName(str);
        }

        /* renamed from: w */
        static void m3739w(View view, float f) {
            view.setTranslationZ(f);
        }

        /* renamed from: x */
        static void m3740x(View view, float f) {
            view.setZ(f);
        }

        /* renamed from: y */
        static boolean m3741y(View view, int i) {
            return view.startNestedScroll(i);
        }

        /* renamed from: z */
        static void m3742z(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$n */
    private static class C1024n {
        /* renamed from: a */
        public static WindowInsetsCompat m3743a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat w = WindowInsetsCompat.m3812w(rootWindowInsets);
            w.mo3503t(w);
            w.mo3486d(view.getRootView());
            return w;
        }

        /* renamed from: b */
        static int m3744b(View view) {
            return view.getScrollIndicators();
        }

        /* renamed from: c */
        static void m3745c(View view, int i) {
            view.setScrollIndicators(i);
        }

        /* renamed from: d */
        static void m3746d(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$o */
    static class C1025o {
        /* renamed from: a */
        static void m3747a(View view) {
            view.cancelDragAndDrop();
        }

        /* renamed from: b */
        static void m3748b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        /* renamed from: c */
        static void m3749c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        /* renamed from: d */
        static void m3750d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        /* renamed from: e */
        static boolean m3751e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }

        /* renamed from: f */
        static void m3752f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$p */
    static class C1026p {
        /* renamed from: a */
        static void m3753a(View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        /* renamed from: b */
        static int m3754b(View view) {
            return view.getImportantForAutofill();
        }

        /* renamed from: c */
        static int m3755c(View view) {
            return view.getNextClusterForwardId();
        }

        /* renamed from: d */
        static boolean m3756d(View view) {
            return view.hasExplicitFocusable();
        }

        /* renamed from: e */
        static boolean m3757e(View view) {
            return view.isFocusedByDefault();
        }

        /* renamed from: f */
        static boolean m3758f(View view) {
            return view.isImportantForAutofill();
        }

        /* renamed from: g */
        static boolean m3759g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        /* renamed from: h */
        static View m3760h(View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        /* renamed from: i */
        static boolean m3761i(View view) {
            return view.restoreDefaultFocus();
        }

        /* renamed from: j */
        static void m3762j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        /* renamed from: k */
        static void m3763k(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        /* renamed from: l */
        static void m3764l(View view, int i) {
            view.setImportantForAutofill(i);
        }

        /* renamed from: m */
        static void m3765m(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        /* renamed from: n */
        static void m3766n(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        /* renamed from: o */
        static void m3767o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$q */
    static class C1027q {
        /* renamed from: a */
        static void m3768a(View view, OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
            int i = C8435c.f23919R;
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) view.getTag(i);
            if (simpleArrayMap == null) {
                simpleArrayMap = new SimpleArrayMap();
                view.setTag(i, simpleArrayMap);
            }
            Objects.requireNonNull(onUnhandledKeyEventListenerCompat);
            C1219p2 p2Var = new C1219p2(onUnhandledKeyEventListenerCompat);
            simpleArrayMap.put(onUnhandledKeyEventListenerCompat, p2Var);
            view.addOnUnhandledKeyEventListener(p2Var);
        }

        /* renamed from: b */
        static CharSequence m3769b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* renamed from: c */
        static boolean m3770c(View view) {
            return view.isAccessibilityHeading();
        }

        /* renamed from: d */
        static boolean m3771d(View view) {
            return view.isScreenReaderFocusable();
        }

        /* renamed from: e */
        static void m3772e(View view, OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
            View.OnUnhandledKeyEventListener a;
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) view.getTag(C8435c.f23919R);
            if (simpleArrayMap != null && (a = C1193l2.m4278a(simpleArrayMap.get(onUnhandledKeyEventListenerCompat))) != null) {
                view.removeOnUnhandledKeyEventListener(a);
            }
        }

        /* renamed from: f */
        static <T> T m3773f(View view, int i) {
            return view.requireViewById(i);
        }

        /* renamed from: g */
        static void m3774g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        /* renamed from: h */
        static void m3775h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* renamed from: i */
        static void m3776i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$r */
    private static class C1028r {
        /* renamed from: a */
        static View.AccessibilityDelegate m3777a(View view) {
            return view.getAccessibilityDelegate();
        }

        /* renamed from: b */
        static List<Rect> m3778b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        /* renamed from: c */
        static void m3779c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        /* renamed from: d */
        static void m3780d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$s */
    private static class C1029s {
        /* renamed from: a */
        static CharSequence m3781a(View view) {
            return view.getStateDescription();
        }

        /* renamed from: b */
        static void m3782b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$t */
    private static final class C1030t {
        /* renamed from: a */
        public static String[] m3783a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        /* renamed from: b */
        public static C1127d m3784b(View view, C1127d dVar) {
            ContentInfo f = dVar.mo3678f();
            ContentInfo a = view.performReceiveContent(f);
            if (a == null) {
                return null;
            }
            if (a == f) {
                return dVar;
            }
            return C1127d.m4153g(a);
        }

        /* renamed from: c */
        public static void m3785c(View view, String[] strArr, C1115b1 b1Var) {
            if (b1Var == null) {
                view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
            } else {
                view.setOnReceiveContentListener(strArr, new C1031u(b1Var));
            }
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$u */
    private static final class C1031u implements OnReceiveContentListener {

        /* renamed from: a */
        private final C1115b1 f3664a;

        C1031u(C1115b1 b1Var) {
            this.f3664a = b1Var;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C1127d g = C1127d.m4153g(contentInfo);
            C1127d a = this.f3664a.mo3674a(view, g);
            if (a == null) {
                return null;
            }
            if (a == g) {
                return contentInfo;
            }
            return a.mo3678f();
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$v */
    static class C1032v {

        /* renamed from: d */
        private static final ArrayList f3665d = new ArrayList();

        /* renamed from: a */
        private WeakHashMap f3666a = null;

        /* renamed from: b */
        private SparseArray f3667b = null;

        /* renamed from: c */
        private WeakReference f3668c = null;

        C1032v() {
        }

        /* renamed from: a */
        static C1032v m3786a(View view) {
            int i = C8435c.f23918Q;
            C1032v vVar = (C1032v) view.getTag(i);
            if (vVar != null) {
                return vVar;
            }
            C1032v vVar2 = new C1032v();
            view.setTag(i, vVar2);
            return vVar2;
        }

        /* renamed from: c */
        private View m3787c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f3666a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c = m3787c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c != null) {
                            return c;
                        }
                    }
                }
                if (m3789e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        private SparseArray m3788d() {
            if (this.f3667b == null) {
                this.f3667b = new SparseArray();
            }
            return this.f3667b;
        }

        /* renamed from: e */
        private boolean m3789e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C8435c.f23919R);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((OnUnhandledKeyEventListenerCompat) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private void m3790g() {
            WeakHashMap weakHashMap = this.f3666a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f3665d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f3666a == null) {
                        this.f3666a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f3665d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f3666a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f3666a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo3467b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m3790g();
            }
            View c = m3787c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m3788d().put(keyCode, new WeakReference(c));
                }
            }
            if (c != null) {
                return true;
            }
            return false;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.ref.WeakReference} */
        /* access modifiers changed from: package-private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo3468f(android.view.KeyEvent r6) {
            /*
                r5 = this;
                java.lang.ref.WeakReference r0 = r5.f3668c
                r1 = 0
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.get()
                if (r0 != r6) goto L_0x000c
                return r1
            L_0x000c:
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r6)
                r5.f3668c = r0
                android.util.SparseArray r0 = r5.m3788d()
                int r2 = r6.getAction()
                r3 = 1
                if (r2 != r3) goto L_0x0032
                int r2 = r6.getKeyCode()
                int r2 = r0.indexOfKey(r2)
                if (r2 < 0) goto L_0x0032
                java.lang.Object r4 = r0.valueAt(r2)
                java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
                r0.removeAt(r2)
                goto L_0x0033
            L_0x0032:
                r4 = 0
            L_0x0033:
                if (r4 != 0) goto L_0x0040
                int r2 = r6.getKeyCode()
                java.lang.Object r0 = r0.get(r2)
                r4 = r0
                java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            L_0x0040:
                if (r4 == 0) goto L_0x0054
                java.lang.Object r0 = r4.get()
                android.view.View r0 = (android.view.View) r0
                if (r0 == 0) goto L_0x0053
                boolean r1 = androidx.core.view.ViewCompat.m3578U(r0)
                if (r1 == 0) goto L_0x0053
                r5.m3789e(r0, r6)
            L_0x0053:
                return r3
            L_0x0054:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.ViewCompat.C1032v.mo3468f(android.view.KeyEvent):boolean");
        }
    }

    @Deprecated
    protected ViewCompat() {
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: A */
    public static int m3539A(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C1026p.m3754b(view);
        }
        return 0;
    }

    @Deprecated
    /* renamed from: A0 */
    public static void m3540A0(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: B */
    public static int m3541B(View view) {
        return C1018i.m3696d(view);
    }

    /* renamed from: B0 */
    public static void m3542B0(View view, boolean z) {
        C1017h.m3691r(view, z);
    }

    /* renamed from: C */
    public static int m3543C(View view) {
        return C1017h.m3677d(view);
    }

    /* renamed from: C0 */
    public static void m3544C0(View view, int i) {
        C1017h.m3692s(view, i);
    }

    /* renamed from: D */
    public static int m3545D(View view) {
        return C1017h.m3678e(view);
    }

    /* renamed from: D0 */
    public static void m3546D0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            C1026p.m3764l(view, i);
        }
    }

    /* renamed from: E */
    public static String[] m3547E(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C1030t.m3783a(view);
        }
        return (String[]) view.getTag(C8435c.f23915N);
    }

    /* renamed from: E0 */
    public static void m3548E0(View view, int i) {
        C1018i.m3700h(view, i);
    }

    /* renamed from: F */
    public static int m3549F(View view) {
        return C1018i.m3697e(view);
    }

    /* renamed from: F0 */
    public static void m3550F0(View view, C1060a1 a1Var) {
        C1022m.m3737u(view, a1Var);
    }

    /* renamed from: G */
    public static int m3551G(View view) {
        return C1018i.m3698f(view);
    }

    /* renamed from: G0 */
    public static void m3552G0(View view, int i, int i2, int i3, int i4) {
        C1018i.m3703k(view, i, i2, i3, i4);
    }

    /* renamed from: H */
    public static WindowInsetsCompat m3553H(View view) {
        return C1024n.m3743a(view);
    }

    /* renamed from: H0 */
    public static void m3554H0(View view, C1166h1 h1Var) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 24) {
            if (h1Var != null) {
                obj = h1Var.mo3716a();
            } else {
                obj = null;
            }
            C1025o.m3750d(view, C1180j1.m4263a(obj));
        }
    }

    /* renamed from: I */
    public static CharSequence m3555I(View view) {
        return (CharSequence) m3574R0().mo3463f(view);
    }

    /* renamed from: I0 */
    public static void m3556I0(View view, boolean z) {
        m3617q0().mo3464g(view, Boolean.valueOf(z));
    }

    /* renamed from: J */
    public static String m3557J(View view) {
        return C1022m.m3727k(view);
    }

    /* renamed from: J0 */
    public static void m3558J0(View view, int i, int i2) {
        C1024n.m3746d(view, i, i2);
    }

    @Deprecated
    /* renamed from: K */
    public static float m3559K(View view) {
        return view.getTranslationX();
    }

    /* renamed from: K0 */
    public static void m3560K0(View view, CharSequence charSequence) {
        m3574R0().mo3464g(view, charSequence);
    }

    @Deprecated
    /* renamed from: L */
    public static float m3561L(View view) {
        return view.getTranslationY();
    }

    /* renamed from: L0 */
    public static void m3562L0(View view, String str) {
        C1022m.m3738v(view, str);
    }

    /* renamed from: M */
    public static float m3563M(View view) {
        return C1022m.m3728l(view);
    }

    @Deprecated
    /* renamed from: M0 */
    public static void m3564M0(View view, float f) {
        view.setTranslationX(f);
    }

    @Deprecated
    /* renamed from: N */
    public static int m3565N(View view) {
        return C1017h.m3680g(view);
    }

    @Deprecated
    /* renamed from: N0 */
    public static void m3566N0(View view, float f) {
        view.setTranslationY(f);
    }

    /* renamed from: O */
    public static float m3567O(View view) {
        return C1022m.m3729m(view);
    }

    /* renamed from: O0 */
    public static void m3568O0(View view, float f) {
        C1022m.m3739w(view, f);
    }

    /* renamed from: P */
    public static boolean m3569P(View view) {
        return m3608m(view) != null;
    }

    /* renamed from: P0 */
    private static void m3570P0(View view) {
        if (m3634z(view) == 0) {
            m3544C0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m3634z((View) parent) == 4) {
                m3544C0(view, 2);
                return;
            }
        }
    }

    /* renamed from: Q */
    public static boolean m3571Q(View view) {
        return C1016g.m3673a(view);
    }

    /* renamed from: Q0 */
    public static void m3572Q0(View view, float f) {
        C1022m.m3740x(view, f);
    }

    /* renamed from: R */
    public static boolean m3573R(View view) {
        return C1017h.m3681h(view);
    }

    /* renamed from: R0 */
    private static C1015f m3574R0() {
        return new C1012c(C8435c.f23917P, CharSequence.class, 64, 30);
    }

    /* renamed from: S */
    public static boolean m3575S(View view) {
        return C1017h.m3682i(view);
    }

    /* renamed from: S0 */
    public static void m3576S0(View view) {
        C1022m.m3742z(view);
    }

    /* renamed from: T */
    public static boolean m3577T(View view) {
        Boolean bool = (Boolean) m3586b().mo3463f(view);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: U */
    public static boolean m3578U(View view) {
        return C1020k.m3708b(view);
    }

    /* renamed from: V */
    public static boolean m3579V(View view) {
        return C1020k.m3709c(view);
    }

    /* renamed from: W */
    public static boolean m3580W(View view) {
        return C1022m.m3732p(view);
    }

    /* renamed from: X */
    public static boolean m3581X(View view) {
        return C1018i.m3699g(view);
    }

    /* renamed from: Y */
    public static boolean m3582Y(View view) {
        Boolean bool = (Boolean) m3617q0().mo3463f(view);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public static /* synthetic */ C1127d m3583Z(C1127d dVar) {
        return dVar;
    }

    /* renamed from: a0 */
    static void m3585a0(View view, int i) {
        boolean z;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (m3614p(view) == null || !view.isShown() || view.getWindowVisibility() != 0) {
                z = false;
            } else {
                z = true;
            }
            int i2 = 32;
            if (m3612o(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i2 = C11398b.f33142u;
                }
                obtain.setEventType(i2);
                C1020k.m3713g(obtain, i);
                if (z) {
                    obtain.getText().add(m3614p(view));
                    m3570P0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                C1020k.m3713g(obtain2, i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m3614p(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    C1020k.m3711e(view.getParent(), view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    /* renamed from: b */
    private static C1015f m3586b() {
        return new C1013d(C8435c.f23911J, Boolean.class, 28);
    }

    /* renamed from: b0 */
    public static void m3587b0(View view, int i) {
        view.offsetLeftAndRight(i);
    }

    /* renamed from: c */
    public static int m3588c(View view, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
        int r = m3618r(view, charSequence);
        if (r != -1) {
            m3590d(view, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(r, charSequence, accessibilityViewCommand));
        }
        return r;
    }

    /* renamed from: c0 */
    public static void m3589c0(View view, int i) {
        view.offsetTopAndBottom(i);
    }

    /* renamed from: d */
    private static void m3590d(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat) {
        m3602j(view);
        m3609m0(accessibilityActionCompat.mo3640b(), view);
        m3616q(view).add(accessibilityActionCompat);
        m3585a0(view, 0);
    }

    /* renamed from: d0 */
    public static WindowInsetsCompat m3591d0(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets v = windowInsetsCompat.mo3505v();
        if (v != null) {
            WindowInsets b = C1021l.m3715b(view, v);
            if (!b.equals(v)) {
                return WindowInsetsCompat.m3813x(b, view);
            }
        }
        return windowInsetsCompat;
    }

    /* renamed from: e */
    public static ViewPropertyAnimatorCompat m3592e(View view) {
        if (f3650b == null) {
            f3650b = new WeakHashMap();
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = (ViewPropertyAnimatorCompat) f3650b.get(view);
        if (viewPropertyAnimatorCompat != null) {
            return viewPropertyAnimatorCompat;
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = new ViewPropertyAnimatorCompat(view);
        f3650b.put(view, viewPropertyAnimatorCompat2);
        return viewPropertyAnimatorCompat2;
    }

    /* renamed from: e0 */
    public static void m3593e0(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat.mo3638z0());
    }

    /* renamed from: f */
    public static WindowInsetsCompat m3594f(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
        return C1022m.m3718b(view, windowInsetsCompat, rect);
    }

    /* renamed from: f0 */
    private static C1015f m3595f0() {
        return new C1011b(C8435c.f23912K, CharSequence.class, 8, 28);
    }

    /* renamed from: g */
    public static WindowInsetsCompat m3596g(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets v = windowInsetsCompat.mo3505v();
        if (v != null) {
            WindowInsets a = C1021l.m3714a(view, v);
            if (!a.equals(v)) {
                return WindowInsetsCompat.m3813x(a, view);
            }
        }
        return windowInsetsCompat;
    }

    /* renamed from: g0 */
    public static boolean m3597g0(View view, int i, Bundle bundle) {
        return C1017h.m3683j(view, i, bundle);
    }

    /* renamed from: h */
    static boolean m3598h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C1032v.m3786a(view).mo3467b(view, keyEvent);
    }

    /* renamed from: h0 */
    public static C1127d m3599h0(View view, C1127d dVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + dVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C1030t.m3784b(view, dVar);
        }
        C1115b1 b1Var = (C1115b1) view.getTag(C8435c.f23914M);
        if (b1Var == null) {
            return m3630x(view).onReceiveContent(dVar);
        }
        C1127d a = b1Var.mo3674a(view, dVar);
        if (a == null) {
            return null;
        }
        return m3630x(view).onReceiveContent(a);
    }

    /* renamed from: i */
    static boolean m3600i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C1032v.m3786a(view).mo3468f(keyEvent);
    }

    /* renamed from: i0 */
    public static void m3601i0(View view) {
        C1017h.m3684k(view);
    }

    /* renamed from: j */
    static void m3602j(View view) {
        C1055a l = m3606l(view);
        if (l == null) {
            l = new C1055a();
        }
        m3619r0(view, l);
    }

    /* renamed from: j0 */
    public static void m3603j0(View view, Runnable runnable) {
        C1017h.m3686m(view, runnable);
    }

    /* renamed from: k */
    public static int m3604k() {
        return C1018i.m3693a();
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: k0 */
    public static void m3605k0(View view, Runnable runnable, long j) {
        C1017h.m3687n(view, runnable, j);
    }

    /* renamed from: l */
    public static C1055a m3606l(View view) {
        View.AccessibilityDelegate m = m3608m(view);
        if (m == null) {
            return null;
        }
        if (m instanceof C1055a.C1056a) {
            return ((C1055a.C1056a) m).f3716a;
        }
        return new C1055a(m);
    }

    /* renamed from: l0 */
    public static void m3607l0(View view, int i) {
        m3609m0(i, view);
        m3585a0(view, 0);
    }

    /* renamed from: m */
    private static View.AccessibilityDelegate m3608m(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C1028r.m3777a(view);
        }
        return m3610n(view);
    }

    /* renamed from: m0 */
    private static void m3609m0(int i, View view) {
        List q = m3616q(view);
        for (int i2 = 0; i2 < q.size(); i2++) {
            if (((AccessibilityNodeInfoCompat.AccessibilityActionCompat) q.get(i2)).mo3640b() == i) {
                q.remove(i2);
                return;
            }
        }
    }

    /* renamed from: n */
    private static View.AccessibilityDelegate m3610n(View view) {
        if (f3652d) {
            return null;
        }
        if (f3651c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3651c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3652d = true;
                return null;
            }
        }
        try {
            Object obj = f3651c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f3652d = true;
            return null;
        }
    }

    /* renamed from: n0 */
    public static void m3611n0(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
        if (accessibilityViewCommand == null && charSequence == null) {
            m3607l0(view, accessibilityActionCompat.mo3640b());
        } else {
            m3590d(view, accessibilityActionCompat.mo3639a(charSequence, accessibilityViewCommand));
        }
    }

    /* renamed from: o */
    public static int m3612o(View view) {
        return C1020k.m3707a(view);
    }

    /* renamed from: o0 */
    public static void m3613o0(View view) {
        C1021l.m3716c(view);
    }

    /* renamed from: p */
    public static CharSequence m3614p(View view) {
        return (CharSequence) m3595f0().mo3463f(view);
    }

    /* renamed from: p0 */
    public static void m3615p0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1028r.m3779c(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: q */
    private static List m3616q(View view) {
        int i = C8435c.f23909H;
        ArrayList arrayList = (ArrayList) view.getTag(i);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i, arrayList2);
        return arrayList2;
    }

    /* renamed from: q0 */
    private static C1015f m3617q0() {
        return new C1010a(C8435c.f23916O, Boolean.class, 28);
    }

    /* renamed from: r */
    private static int m3618r(View view, CharSequence charSequence) {
        boolean z;
        List q = m3616q(view);
        for (int i = 0; i < q.size(); i++) {
            if (TextUtils.equals(charSequence, ((AccessibilityNodeInfoCompat.AccessibilityActionCompat) q.get(i)).mo3641c())) {
                return ((AccessibilityNodeInfoCompat.AccessibilityActionCompat) q.get(i)).mo3640b();
            }
        }
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[] iArr = f3653e;
            if (i3 >= iArr.length || i2 != -1) {
                return i2;
            }
            int i4 = iArr[i3];
            boolean z2 = true;
            for (int i5 = 0; i5 < q.size(); i5++) {
                if (((AccessibilityNodeInfoCompat.AccessibilityActionCompat) q.get(i5)).mo3640b() != i4) {
                    z = true;
                } else {
                    z = false;
                }
                z2 &= z;
            }
            if (z2) {
                i2 = i4;
            }
            i3++;
        }
        return i2;
    }

    /* renamed from: r0 */
    public static void m3619r0(View view, C1055a aVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (aVar == null && (m3608m(view) instanceof C1055a.C1056a)) {
            aVar = new C1055a();
        }
        if (aVar == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = aVar.getBridge();
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    /* renamed from: s */
    public static ColorStateList m3620s(View view) {
        return C1022m.m3723g(view);
    }

    /* renamed from: s0 */
    public static void m3621s0(View view, boolean z) {
        m3586b().mo3464g(view, Boolean.valueOf(z));
    }

    /* renamed from: t */
    public static PorterDuff.Mode m3622t(View view) {
        return C1022m.m3724h(view);
    }

    /* renamed from: t0 */
    public static void m3623t0(View view, int i) {
        C1020k.m3712f(view, i);
    }

    /* renamed from: u */
    public static Rect m3624u(View view) {
        return C1019j.m3704a(view);
    }

    /* renamed from: u0 */
    public static void m3625u0(View view, CharSequence charSequence) {
        m3595f0().mo3464g(view, charSequence);
        if (charSequence != null) {
            f3655g.mo3457a(view);
        } else {
            f3655g.mo3458d(view);
        }
    }

    /* renamed from: v */
    public static Display m3626v(View view) {
        return C1018i.m3694b(view);
    }

    /* renamed from: v0 */
    public static void m3627v0(View view, Drawable drawable) {
        C1017h.m3690q(view, drawable);
    }

    /* renamed from: w */
    public static float m3628w(View view) {
        return C1022m.m3725i(view);
    }

    /* renamed from: w0 */
    public static void m3629w0(View view, ColorStateList colorStateList) {
        C1022m.m3733q(view, colorStateList);
    }

    /* renamed from: x */
    private static C1123c1 m3630x(View view) {
        if (view instanceof C1123c1) {
            return (C1123c1) view;
        }
        return f3654f;
    }

    /* renamed from: x0 */
    public static void m3631x0(View view, PorterDuff.Mode mode) {
        C1022m.m3734r(view, mode);
    }

    /* renamed from: y */
    public static boolean m3632y(View view) {
        return C1017h.m3675b(view);
    }

    /* renamed from: y0 */
    public static void m3633y0(View view, Rect rect) {
        C1019j.m3706c(view, rect);
    }

    /* renamed from: z */
    public static int m3634z(View view) {
        return C1017h.m3676c(view);
    }

    /* renamed from: z0 */
    public static void m3635z0(View view, float f) {
        C1022m.m3735s(view, f);
    }
}

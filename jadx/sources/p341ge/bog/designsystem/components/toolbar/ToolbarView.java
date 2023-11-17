package p341ge.bog.designsystem.components.toolbar;

import af1.C40303i;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.IntEvaluator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1111b;
import androidx.core.view.C1235s0;
import androidx.core.widget.C1314o;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import he1.C41224m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p045d.C5769a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p352ak.C9978n6;
import p601sg.C17777b;
import p601sg.C17786k;
import p601sg.C17787l;
import p642vh.C18333a;
import p642vh.C18355e0;
import p642vh.C18365j0;
import p642vh.C18367k0;
import p642vh.C18368l;
import p642vh.C18375n;
import p657wj.C18597a;
import p657wj.C18599c;
import p657wj.C18600d;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.toolbar.ToolbarView */
public final class ToolbarView extends Toolbar implements CoordinatorLayout.C0643b {

    /* renamed from: B0 */
    public static final C13571c f40532B0 = new C13571c((DefaultConstructorMarker) null);

    /* renamed from: C0 */
    static final /* synthetic */ C40303i[] f40533C0;

    /* renamed from: D0 */
    private static final int f40534D0 = C18368l.m62762k(1);

    /* renamed from: A0 */
    private final C18375n f40535A0;

    /* renamed from: a0 */
    private final C9978n6 f40536a0;

    /* renamed from: b0 */
    private final C18365j0 f40537b0;

    /* renamed from: c0 */
    private final C18365j0 f40538c0;

    /* renamed from: d0 */
    private final C18355e0 f40539d0;

    /* renamed from: e0 */
    private final C41555e f40540e0;

    /* renamed from: f0 */
    private Toolbar.C0390h f40541f0;

    /* renamed from: g0 */
    private final C13563b f40542g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public final boolean f40543h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public final boolean f40544i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public final boolean f40545j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public int f40546k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public int f40547l0;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public int f40548m0;

    /* renamed from: n0 */
    private int f40549n0;

    /* renamed from: o0 */
    private final Drawable f40550o0;

    /* renamed from: p0 */
    private final boolean f40551p0;

    /* renamed from: q0 */
    private final ArrayList f40552q0;

    /* renamed from: r0 */
    private final ArrayList f40553r0;

    /* renamed from: s0 */
    private int f40554s0;

    /* renamed from: t0 */
    private ColorStateList f40555t0;

    /* renamed from: u0 */
    private CharSequence f40556u0;

    /* renamed from: v0 */
    private Drawable f40557v0;

    /* renamed from: w0 */
    private boolean f40558w0;

    /* renamed from: x0 */
    private final C18367k0 f40559x0;

    /* renamed from: y0 */
    private View.OnClickListener f40560y0;

    /* renamed from: z0 */
    private View.OnClickListener f40561z0;

    /* renamed from: ge.bog.designsystem.components.toolbar.ToolbarView$a */
    private enum C13562a {
        FILL,
        UNFILL
    }

    /* renamed from: ge.bog.designsystem.components.toolbar.ToolbarView$b */
    private final class C13563b extends CoordinatorLayout.C0644c {

        /* renamed from: h */
        static final /* synthetic */ C40303i[] f40565h;

        /* renamed from: a */
        private Animator f40566a;

        /* renamed from: b */
        private final C41555e f40567b;

        /* renamed from: c */
        private final C41555e f40568c;

        /* renamed from: d */
        private final C18333a f40569d;

        /* renamed from: e */
        private final C18333a f40570e;

        /* renamed from: f */
        private final IntEvaluator f40571f;

        /* renamed from: ge.bog.designsystem.components.toolbar.ToolbarView$b$a */
        public /* synthetic */ class C13564a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f40573a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    ge.bog.designsystem.components.toolbar.ToolbarView$a[] r0 = p341ge.bog.designsystem.components.toolbar.ToolbarView.C13562a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    ge.bog.designsystem.components.toolbar.ToolbarView$a r1 = p341ge.bog.designsystem.components.toolbar.ToolbarView.C13562a.FILL     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    ge.bog.designsystem.components.toolbar.ToolbarView$a r1 = p341ge.bog.designsystem.components.toolbar.ToolbarView.C13562a.UNFILL     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f40573a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.toolbar.ToolbarView.C13563b.C13564a.<clinit>():void");
            }
        }

        /* renamed from: ge.bog.designsystem.components.toolbar.ToolbarView$b$b */
        public static final class C13565b extends IntEvaluator {

            /* renamed from: a */
            final /* synthetic */ ToolbarView f40574a;

            C13565b(ToolbarView toolbarView) {
                this.f40574a = toolbarView;
            }

            /* renamed from: a */
            public Integer mo37125a(float f, int i, int i2) {
                Integer evaluate = super.evaluate(f, Integer.valueOf(i), Integer.valueOf(i2));
                ToolbarView toolbarView = this.f40574a;
                C41536l.m120488h(evaluate, "alpha");
                toolbarView.setFillAlpha(evaluate.intValue());
                return evaluate;
            }

            public /* bridge */ /* synthetic */ Integer evaluate(float f, Integer num, Integer num2) {
                return mo37125a(f, num.intValue(), num2.intValue());
            }

            public /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
                return mo37125a(f, ((Number) obj).intValue(), ((Number) obj2).intValue());
            }
        }

        /* renamed from: ge.bog.designsystem.components.toolbar.ToolbarView$b$c */
        public static final class C13566c extends AnimatorListenerAdapter {

            /* renamed from: d */
            final /* synthetic */ C13563b f40575d;

            /* renamed from: e */
            final /* synthetic */ C13562a f40576e;

            /* renamed from: f */
            final /* synthetic */ C13562a f40577f;

            /* renamed from: g */
            final /* synthetic */ ToolbarView f40578g;

            /* renamed from: h */
            final /* synthetic */ int f40579h;

            /* renamed from: i */
            final /* synthetic */ int f40580i;

            /* renamed from: j */
            final /* synthetic */ int f40581j;

            C13566c(C13563b bVar, C13562a aVar, C13562a aVar2, ToolbarView toolbarView, int i, int i2, int i3) {
                this.f40575d = bVar;
                this.f40576e = aVar;
                this.f40577f = aVar2;
                this.f40578g = toolbarView;
                this.f40579h = i;
                this.f40580i = i2;
                this.f40581j = i3;
            }

            public void onAnimationCancel(Animator animator) {
                this.f40578g.setFillColor(this.f40579h);
                this.f40578g.setFillAlpha(this.f40580i);
                if (this.f40578g.f40544i0) {
                    this.f40578g.setControlsFillColor(this.f40581j);
                }
            }

            public void onAnimationEnd(Animator animator) {
                C41536l.m120489i(animator, "animator");
                this.f40578g.setFillColor(this.f40579h);
                this.f40578g.setFillAlpha(this.f40580i);
                if (this.f40578g.f40544i0) {
                    this.f40578g.setControlsFillColor(this.f40581j);
                }
            }

            public void onAnimationStart(Animator animator) {
                this.f40575d.mo37123K(this.f40576e);
                this.f40575d.mo37124L(this.f40577f);
            }
        }

        /* renamed from: ge.bog.designsystem.components.toolbar.ToolbarView$b$d */
        public static final class C13567d extends C18333a {

            /* renamed from: a */
            final /* synthetic */ ToolbarView f40582a;

            C13567d(ToolbarView toolbarView) {
                this.f40582a = toolbarView;
            }

            public Object evaluate(float f, Object obj, Object obj2) {
                C41536l.m120489i(obj, "startValue");
                C41536l.m120489i(obj2, "endValue");
                Object evaluate = super.evaluate(f, obj, obj2);
                C41536l.m120487g(evaluate, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) evaluate).intValue();
                this.f40582a.setFillColor(intValue);
                return Integer.valueOf(intValue);
            }
        }

        /* renamed from: ge.bog.designsystem.components.toolbar.ToolbarView$b$e */
        public static final class C13568e extends C18333a {

            /* renamed from: a */
            final /* synthetic */ ToolbarView f40583a;

            C13568e(ToolbarView toolbarView) {
                this.f40583a = toolbarView;
            }

            public Object evaluate(float f, Object obj, Object obj2) {
                C41536l.m120489i(obj, "startValue");
                C41536l.m120489i(obj2, "endValue");
                Object evaluate = super.evaluate(f, obj, obj2);
                C41536l.m120487g(evaluate, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) evaluate).intValue();
                this.f40583a.setControlsFillColor(intValue);
                return Integer.valueOf(intValue);
            }
        }

        /* renamed from: ge.bog.designsystem.components.toolbar.ToolbarView$b$f */
        public static final class C13569f extends C41553c {

            /* renamed from: a */
            final /* synthetic */ ToolbarView f40584a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13569f(Object obj, ToolbarView toolbarView) {
                super(obj);
                this.f40584a = toolbarView;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                C41536l.m120489i(iVar, "property");
                C13562a aVar = (C13562a) obj2;
                C13562a aVar2 = (C13562a) obj;
                C13572d unused = this.f40584a.getClass();
            }
        }

        /* renamed from: ge.bog.designsystem.components.toolbar.ToolbarView$b$g */
        public static final class C13570g extends C41553c {

            /* renamed from: a */
            final /* synthetic */ ToolbarView f40585a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13570g(Object obj, ToolbarView toolbarView) {
                super(obj);
                this.f40585a = toolbarView;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                C41536l.m120489i(iVar, "property");
                C13562a aVar = (C13562a) obj2;
                C13562a aVar2 = (C13562a) obj;
                C13572d unused = this.f40585a.getClass();
            }
        }

        static {
            Class<C13563b> cls = C13563b.class;
            f40565h = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "lastAnimState", "getLastAnimState()Lge/bog/designsystem/components/toolbar/ToolbarView$AnimState;", 0)), C41520a0.m120439e(new C41539o(cls, "lastControlsAnimState", "getLastControlsAnimState()Lge/bog/designsystem/components/toolbar/ToolbarView$AnimState;", 0))};
        }

        public C13563b() {
            C41551a aVar = C41551a.f97718a;
            C13562a aVar2 = C13562a.UNFILL;
            this.f40567b = new C13569f(aVar2, ToolbarView.this);
            this.f40568c = new C13570g(aVar2, ToolbarView.this);
            this.f40569d = new C13567d(ToolbarView.this);
            this.f40570e = new C13568e(ToolbarView.this);
            this.f40571f = new C13565b(ToolbarView.this);
        }

        /* renamed from: F */
        public static /* synthetic */ void m50870F(C13563b bVar, boolean z, boolean z2, int i, Object obj) {
            if ((i & 2) != 0) {
                z2 = z;
            }
            bVar.mo37120E(z, z2);
        }

        /* renamed from: G */
        private final void m50871G(C13562a aVar, C13562a aVar2) {
            Integer[] numArr;
            Integer[] numArr2;
            Object[] objArr;
            Animator animator = this.f40566a;
            if (animator != null) {
                animator.cancel();
            }
            int[] iArr = C13564a.f40573a;
            int i = iArr[aVar.ordinal()];
            if (i == 1) {
                numArr = new Integer[]{Integer.valueOf(ToolbarView.this.f40547l0), Integer.valueOf(ToolbarView.this.f40546k0), 0, Integer.valueOf(C11051p3.f31759c)};
            } else if (i == 2) {
                numArr = new Integer[]{Integer.valueOf(ToolbarView.this.f40546k0), Integer.valueOf(ToolbarView.this.f40547l0), Integer.valueOf(C11051p3.f31759c), 0};
            } else {
                throw new NoWhenBranchMatchedException();
            }
            int intValue = numArr[0].intValue();
            int intValue2 = numArr[1].intValue();
            int intValue3 = numArr[2].intValue();
            int intValue4 = numArr[3].intValue();
            int i2 = iArr[aVar2.ordinal()];
            if (i2 == 1) {
                numArr2 = new Integer[]{Integer.valueOf(ToolbarView.this.getControlsUnfillColor()), Integer.valueOf(ToolbarView.this.f40548m0)};
            } else if (i2 == 2) {
                numArr2 = new Integer[]{Integer.valueOf(ToolbarView.this.f40548m0), Integer.valueOf(ToolbarView.this.getControlsUnfillColor())};
            } else {
                throw new NoWhenBranchMatchedException();
            }
            int intValue5 = numArr2[0].intValue();
            int intValue6 = numArr2[1].intValue();
            if (aVar == mo37121I()) {
                objArr = new ValueAnimator[0];
            } else {
                objArr = new ValueAnimator[]{ValueAnimator.ofObject(this.f40569d, new Object[]{Integer.valueOf(intValue), Integer.valueOf(intValue2)}), ValueAnimator.ofObject(this.f40571f, new Object[]{Integer.valueOf(intValue3), Integer.valueOf(intValue4)})};
            }
            if (!ToolbarView.this.f40544i0) {
                C13562a aVar3 = aVar2;
            } else if (aVar2 != mo37122J()) {
                objArr = C41331l.m119770n(objArr, new ValueAnimator[]{ValueAnimator.ofObject(this.f40570e, new Object[]{Integer.valueOf(intValue5), Integer.valueOf(intValue6)})});
            }
            AnimatorSet animatorSet = new AnimatorSet();
            ToolbarView toolbarView = ToolbarView.this;
            animatorSet.playTogether((Animator[]) Arrays.copyOf(objArr, objArr.length));
            animatorSet.setInterpolator((TimeInterpolator) null);
            animatorSet.setDuration(250);
            animatorSet.addListener(new C13566c(this, aVar, aVar2, toolbarView, intValue2, intValue4, intValue6));
            animatorSet.start();
            this.f40566a = animatorSet;
        }

        /* renamed from: H */
        private final View m50872H(View view) {
            if (!(view instanceof SwipeRefreshLayout)) {
                return view;
            }
            View childAt = ((SwipeRefreshLayout) view).getChildAt(0);
            C41536l.m120488h(childAt, "scrollableView.getChildAt(0)");
            return childAt;
        }

        /* renamed from: A */
        public boolean mo3031A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            C41536l.m120489i(coordinatorLayout, "coordinatorLayout");
            C41536l.m120489i(view, "child");
            C41536l.m120489i(view2, "directTargetChild");
            C41536l.m120489i(view3, "target");
            if (!ToolbarView.this.f40543h0 || !ToolbarView.this.f40545j0 || (i & 2) == 0) {
                return false;
            }
            return true;
        }

        /* renamed from: E */
        public final void mo37120E(boolean z, boolean z2) {
            C13562a aVar;
            C13562a aVar2;
            if (z) {
                aVar = C13562a.FILL;
            } else {
                aVar = C13562a.UNFILL;
            }
            if (z2) {
                aVar2 = C13562a.FILL;
            } else {
                aVar2 = C13562a.UNFILL;
            }
            C41224m mVar = new C41224m(aVar, aVar2);
            C13562a aVar3 = (C13562a) mVar.mo95675a();
            C13562a aVar4 = (C13562a) mVar.mo95676b();
            if (aVar3 != mo37121I() || aVar4 != mo37122J()) {
                m50871G(aVar3, aVar4);
            }
        }

        /* renamed from: I */
        public final C13562a mo37121I() {
            return (C13562a) this.f40567b.getValue(this, f40565h[0]);
        }

        /* renamed from: J */
        public final C13562a mo37122J() {
            return (C13562a) this.f40568c.getValue(this, f40565h[1]);
        }

        /* renamed from: K */
        public final void mo37123K(C13562a aVar) {
            C41536l.m120489i(aVar, "<set-?>");
            this.f40567b.setValue(this, f40565h[0], aVar);
        }

        /* renamed from: L */
        public final void mo37124L(C13562a aVar) {
            C41536l.m120489i(aVar, "<set-?>");
            this.f40568c.setValue(this, f40565h[1], aVar);
        }

        /* renamed from: t */
        public void mo3054t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            C41536l.m120489i(coordinatorLayout, "coordinatorLayout");
            C41536l.m120489i(view, "child");
            C41536l.m120489i(view2, "target");
            C41536l.m120489i(iArr, "consumed");
            m50870F(this, m50872H(view2).canScrollVertically(-1), false, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.designsystem.components.toolbar.ToolbarView$c */
    public static final class C13571c {
        private C13571c() {
        }

        public /* synthetic */ C13571c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.designsystem.components.toolbar.ToolbarView$d */
    public interface C13572d {
    }

    /* renamed from: ge.bog.designsystem.components.toolbar.ToolbarView$e */
    public static final class C13573e extends C41553c {

        /* renamed from: a */
        final /* synthetic */ ToolbarView f40586a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13573e(Object obj, ToolbarView toolbarView) {
            super(obj);
            this.f40586a = toolbarView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            ((Boolean) obj).booleanValue();
            this.f40586a.m50858j0(booleanValue);
        }
    }

    static {
        Class<ToolbarView> cls = ToolbarView.class;
        f40533C0 = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "navigationEnabled", "getNavigationEnabled()Z", 0)), C41520a0.m120439e(new C41539o(cls, "hasToolbarIcon", "getHasToolbarIcon()Z", 0)), C41520a0.m120439e(new C41539o(cls, "secondaryTitle", "getSecondaryTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "hasSecondaryTitle", "getHasSecondaryTitle()Z", 0)), C41520a0.m120439e(new C41539o(cls, "appBarLayout", "getAppBarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0)), C41520a0.m120439e(new C41539o(cls, "toolbarIcon", "getToolbarIcon()Lge/bog/designsystem/components/common/Image;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ToolbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public static final void m50844U(ToolbarView toolbarView, View view) {
        C41536l.m120489i(toolbarView, "this$0");
        View.OnClickListener onClickListener = toolbarView.f40560y0;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public static final void m50845V(ToolbarView toolbarView, View view) {
        C41536l.m120489i(toolbarView, "this$0");
        View.OnClickListener onClickListener = toolbarView.f40561z0;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    private final AppBarLayout getAppBarLayout() {
        return (AppBarLayout) this.f40559x0.mo46152a(this, f40533C0[4]);
    }

    /* renamed from: i0 */
    public static /* synthetic */ void m50857i0(ToolbarView toolbarView, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = z;
        }
        toolbarView.mo37106h0(z, z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public final void m50858j0(boolean z) {
        if (z) {
            C1314o.m4575q(this.f40536a0.f27323f, C17786k.TextTitle2);
            this.f40536a0.f27324g.setVisibility(0);
            return;
        }
        C1314o.m4575q(this.f40536a0.f27323f, C17786k.f49827W0);
        this.f40536a0.f27324g.setVisibility(8);
    }

    /* renamed from: k0 */
    private final void m50859k0() {
        View view;
        ViewParent parent = getParent();
        if (parent instanceof View) {
            view = (View) parent;
        } else {
            view = null;
        }
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0647f) {
                ((CoordinatorLayout.C0647f) layoutParams).mo3077o(getBehavior());
            }
            setAppBarLayout(appBarLayout);
        }
    }

    /* renamed from: l0 */
    private final void m50860l0() {
        if (this.f40543h0) {
            setFillColor(this.f40547l0);
            if (this.f40544i0) {
                setControlsFillColor(this.f40549n0);
            }
            setFillAlpha(0);
            return;
        }
        setFillColor(this.f40546k0);
        setFillAlpha(C11051p3.f31759c);
    }

    /* renamed from: o0 */
    private final void m50861o0() {
        this.f40552q0.clear();
        Menu menu = getMenu();
        C41536l.m120488h(menu, "menu");
        int size = menu.size();
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                MenuItem item = menu.getItem(i);
                C41536l.m120488h(item, "getItem(index)");
                View actionView = item.getActionView();
                if (actionView instanceof BadgeRelativeLayout) {
                    this.f40552q0.add(new WeakReference(actionView));
                }
                C1111b a = C1235s0.m4319a(item);
                if (a instanceof C18597a) {
                    C18597a aVar = (C18597a) a;
                    aVar.mo46445n(this.f40541f0);
                    if (this.f40544i0) {
                        aVar.mo37098k(actionView, ColorStateList.valueOf(this.f40549n0));
                    } else {
                        ColorStateList colorStateList = this.f40555t0;
                        if (colorStateList != null) {
                            aVar.mo37098k(actionView, colorStateList);
                        }
                    }
                }
                if (i2 < size) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: p0 */
    private final void m50862p0() {
        if (this.f40544i0) {
            this.f40536a0.f27322e.setButtonIconTint(ColorStateList.valueOf(this.f40549n0));
            return;
        }
        ColorStateList colorStateList = this.f40555t0;
        if (colorStateList != null) {
            this.f40536a0.f27322e.setButtonIconTint(colorStateList);
        }
    }

    private final void setAppBarLayout(AppBarLayout appBarLayout) {
        this.f40559x0.mo46153b(this, f40533C0[4], appBarLayout);
    }

    /* access modifiers changed from: private */
    public final void setControlsFillColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C41536l.m120488h(valueOf, "valueOf(color)");
        this.f40536a0.f27323f.setTextColor(i);
        this.f40536a0.f27324g.setTextColor(i);
        this.f40536a0.f27322e.setButtonIconTint(valueOf);
        Menu menu = getMenu();
        C41536l.m120488h(menu, "menu");
        int size = menu.size();
        if (size > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                MenuItem item = menu.getItem(i2);
                C41536l.m120488h(item, "getItem(index)");
                View actionView = item.getActionView();
                C1111b a = C1235s0.m4319a(item);
                if (a instanceof C18597a) {
                    ((C18597a) a).mo37098k(actionView, valueOf);
                }
                if (i3 < size) {
                    i2 = i3;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void setFillAlpha(int i) {
        if (this.f40551p0) {
            this.f40550o0.setAlpha(i);
        }
    }

    /* access modifiers changed from: private */
    public final void setFillColor(int i) {
        NotificationBadgeView notificationBadgeView;
        AppBarLayout appBarLayout = getAppBarLayout();
        if (appBarLayout != null) {
            appBarLayout.setBackgroundColor(i);
        } else {
            setBackgroundColor(i);
        }
        for (WeakReference weakReference : this.f40552q0) {
            BadgeRelativeLayout badgeRelativeLayout = (BadgeRelativeLayout) weakReference.get();
            if (badgeRelativeLayout != null) {
                notificationBadgeView = badgeRelativeLayout.getBadgeView();
            } else {
                notificationBadgeView = null;
            }
            if (notificationBadgeView != null) {
                notificationBadgeView.setBorderColor(Integer.valueOf(i));
            }
        }
        for (WeakReference weakReference2 : this.f40553r0) {
            View view = (View) weakReference2.get();
            if (view != null) {
                view.setBackgroundColor(i);
            }
        }
    }

    /* renamed from: M */
    public void mo1797M(Context context, int i) {
        C41536l.m120489i(context, "context");
    }

    /* renamed from: N */
    public void mo1798N(Context context, int i) {
        C41536l.m120489i(context, "context");
        if (i != 0) {
            C1314o.m4575q(this.f40536a0.f27323f, i);
        }
    }

    public void draw(Canvas canvas) {
        C41536l.m120489i(canvas, "canvas");
        super.draw(canvas);
        if (this.f40551p0) {
            int width = getWidth();
            int height = getHeight();
            Drawable drawable = this.f40550o0;
            drawable.setBounds(0, height - f40534D0, width, height);
            drawable.draw(canvas);
        }
    }

    public CoordinatorLayout.C0644c getBehavior() {
        return this.f40542g0;
    }

    public final int getControlsUnfillColor() {
        return this.f40549n0;
    }

    public final boolean getHasSecondaryTitle() {
        return ((Boolean) this.f40540e0.getValue(this, f40533C0[3])).booleanValue();
    }

    public final boolean getHasToolbarIcon() {
        return this.f40538c0.getValue(this, f40533C0[1]).booleanValue();
    }

    public final boolean getNavigationEnabled() {
        return this.f40537b0.getValue(this, f40533C0[0]).booleanValue();
    }

    public Drawable getNavigationIcon() {
        return this.f40536a0.f27322e.getButtonIcon();
    }

    public final CharSequence getSecondaryTitle() {
        return this.f40539d0.getValue(this, f40533C0[2]);
    }

    public CharSequence getTitle() {
        if (this.f40558w0) {
            return this.f40536a0.f27323f.getText();
        }
        return this.f40556u0;
    }

    public final Image getToolbarIcon() {
        return this.f40535A0.getValue(this, f40533C0[5]);
    }

    /* renamed from: h0 */
    public final void mo37106h0(boolean z, boolean z2) {
        this.f40542g0.mo37120E(z, z2);
    }

    /* renamed from: m0 */
    public final boolean mo37107m0() {
        C13562a I = this.f40542g0.mo37121I();
        C13562a aVar = C13562a.FILL;
        if (I == aVar && this.f40542g0.mo37122J() == aVar) {
            return true;
        }
        return false;
    }

    /* renamed from: n0 */
    public final void mo37108n0(int i, Menu menu, MenuInflater menuInflater) {
        C41536l.m120489i(menu, "menu");
        C41536l.m120489i(menuInflater, "inflater");
        menuInflater.inflate(i, menu);
        m50861o0();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m50859k0();
        m50860l0();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAppBarLayout((AppBarLayout) null);
    }

    public final void setControlsUnfillColor(int i) {
        this.f40549n0 = i;
        if (isAttachedToWindow() && !mo37107m0()) {
            m50860l0();
        }
    }

    public final void setFillViews(List<? extends View> list) {
        C41536l.m120489i(list, "views");
        this.f40553r0.clear();
        ArrayList arrayList = this.f40553r0;
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(list, 10));
        for (View weakReference : list) {
            arrayList2.add(new WeakReference(weakReference));
        }
        arrayList.addAll(arrayList2);
    }

    public final void setHasSecondaryTitle(boolean z) {
        this.f40540e0.setValue(this, f40533C0[3], Boolean.valueOf(z));
    }

    public final void setHasToolbarIcon(boolean z) {
        this.f40538c0.mo46151c(this, f40533C0[1], z);
    }

    public final void setNavigationEnabled(boolean z) {
        this.f40537b0.mo46151c(this, f40533C0[0], z);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C5769a.m23210b(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        this.f40536a0.f27322e.setOnClickListener(onClickListener);
    }

    public final void setOnFillStateChangeListener(C13572d dVar) {
        C41536l.m120489i(dVar, "listener");
    }

    public final void setOnImageClickedListener(View.OnClickListener onClickListener) {
        C41536l.m120489i(onClickListener, "listener");
        this.f40561z0 = onClickListener;
    }

    public void setOnMenuItemClickListener(Toolbar.C0390h hVar) {
        C41536l.m120489i(hVar, "listener");
        super.setOnMenuItemClickListener(hVar);
        this.f40541f0 = hVar;
        m50861o0();
    }

    public final void setOnTextClickedListener(View.OnClickListener onClickListener) {
        C41536l.m120489i(onClickListener, "listener");
        this.f40560y0 = onClickListener;
    }

    public final void setSecondaryTitle(CharSequence charSequence) {
        this.f40539d0.setValue(this, f40533C0[2], charSequence);
    }

    public void setSubtitle(int i) {
    }

    public void setSubtitleTextColor(int i) {
    }

    public void setTitle(CharSequence charSequence) {
        if (this.f40558w0) {
            this.f40536a0.f27323f.setText(charSequence);
        } else {
            this.f40556u0 = charSequence;
        }
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        C41536l.m120489i(colorStateList, "color");
    }

    public final void setToolbarIcon(Image image) {
        this.f40535A0.setValue(this, f40533C0[5], image);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        C41536l.m120489i(drawable, "who");
        if (super.verifyDrawable(drawable) || drawable == this.f40550o0) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public void mo1887x(int i) {
        super.mo1887x(i);
        m50861o0();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ToolbarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public void setNavigationIcon(Drawable drawable) {
        if (this.f40558w0) {
            this.f40536a0.f27322e.setButtonIcon(drawable);
        } else {
            this.f40557v0 = drawable;
        }
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        C41536l.m120489i(colorStateList, "color");
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToolbarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9978n6 c = C9978n6.m36598c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(\n        LayoutI…from(context), this\n    )");
        this.f40536a0 = c;
        Button button = c.f27322e;
        C41536l.m120488h(button, "binding.navigationButton");
        this.f40537b0 = new C18365j0(button, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        LayerView layerView = c.f27327j;
        C41536l.m120488h(layerView, "binding.toolbarIconLayer");
        this.f40538c0 = new C18365j0(layerView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView = c.f27324g;
        C41536l.m120488h(appCompatTextView, "binding.secondaryTitle");
        this.f40539d0 = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        C41551a aVar = C41551a.f97718a;
        this.f40540e0 = new C13573e(Boolean.FALSE, this);
        this.f40542g0 = new C13563b();
        this.f40552q0 = new ArrayList();
        this.f40553r0 = new ArrayList();
        this.f40559x0 = new C18367k0();
        AppCompatImageView appCompatImageView = c.f27326i;
        C41536l.m120488h(appCompatImageView, "binding.toolbarIcon");
        this.f40535A0 = new C18375n(appCompatImageView);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C17787l.f50579vd, 0, 0);
        try {
            this.f40551p0 = obtainStyledAttributes.getBoolean(C17787l.f49854Ad, true);
            setNavigationEnabled(obtainStyledAttributes.getBoolean(C17787l.f49929Fd, false));
            boolean z = obtainStyledAttributes.getBoolean(C17787l.f49869Bd, false);
            this.f40543h0 = z;
            this.f40544i0 = z && obtainStyledAttributes.getBoolean(C17787l.f50609xd, false);
            this.f40545j0 = obtainStyledAttributes.getBoolean(C17787l.f49944Gd, true);
            this.f40546k0 = obtainStyledAttributes.getColor(C17787l.f49884Cd, 0);
            this.f40547l0 = obtainStyledAttributes.getColor(C17787l.f50004Kd, 0);
            this.f40548m0 = obtainStyledAttributes.getColor(C17787l.f50624yd, 0);
            setControlsUnfillColor(obtainStyledAttributes.getColor(C17787l.f50639zd, 0));
            this.f40554s0 = obtainStyledAttributes.getResourceId(C17787l.f49974Id, 0);
            int resourceId = obtainStyledAttributes.getResourceId(C17787l.f50594wd, 0);
            if (resourceId != 0) {
                this.f40555t0 = C5769a.m23209a(context2, resourceId);
            }
            setHasToolbarIcon(obtainStyledAttributes.getBoolean(C17787l.f49914Ed, false));
            if (getHasToolbarIcon()) {
                setToolbarIcon(new Image.Resource(obtainStyledAttributes.getResourceId(C17787l.f49989Jd, 0), (Boolean) null, 2, (DefaultConstructorMarker) null));
            }
            setHasSecondaryTitle(obtainStyledAttributes.getBoolean(C17787l.f49899Dd, false));
            setSecondaryTitle(obtainStyledAttributes.getText(C17787l.f49959Hd));
            obtainStyledAttributes.recycle();
            ColorDrawable colorDrawable = new ColorDrawable(C18368l.m62755d(context2, C17777b.f49600q));
            this.f40550o0 = colorDrawable;
            colorDrawable.setCallback(this);
            super.setTitle((CharSequence) null);
            super.setNavigationIcon((Drawable) null);
            CharSequence charSequence = this.f40556u0;
            Drawable drawable = this.f40557v0;
            this.f40556u0 = null;
            this.f40557v0 = null;
            this.f40558w0 = true;
            setTitle(charSequence);
            mo1798N(context2, this.f40554s0);
            if (drawable != null) {
                setNavigationIcon(drawable);
            }
            c.f27325h.setOnClickListener(new C18599c(this));
            c.f27326i.setOnClickListener(new C18600d(this));
            m50862p0();
            setWillNotDraw(false);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}

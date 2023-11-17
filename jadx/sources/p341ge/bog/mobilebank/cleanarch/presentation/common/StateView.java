package p341ge.bog.mobilebank.cleanarch.presentation.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import g91.C32300e0;
import g91.C32343x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p366bk.C10313b;
import p366bk.C10330s;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.StateView */
public final class StateView extends FrameLayout {

    /* renamed from: d */
    private View f57384d;

    /* renamed from: e */
    private View f57385e;

    /* renamed from: f */
    private View f57386f;

    /* renamed from: g */
    private View f57387g;

    /* renamed from: h */
    private final int f57388h;

    /* renamed from: i */
    private final int f57389i;

    /* renamed from: j */
    private final int f57390j;

    /* renamed from: k */
    private final int f57391k;

    /* renamed from: l */
    private boolean f57392l;

    /* renamed from: m */
    private final boolean f57393m;

    /* renamed from: n */
    private final Animation f57394n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C41536l.m120489i(context, "context");
        this.f57394n = AnimationUtils.loadAnimation(context, C10313b.infinite_alpha);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10330s.f29500z7);
        C41536l.m120488h(obtainStyledAttributes, "context.obtainStyledAttr…s, R.styleable.StateView)");
        this.f57388h = obtainStyledAttributes.getResourceId(C10330s.f29006C7, 0);
        this.f57389i = obtainStyledAttributes.getResourceId(C10330s.f29046G7, 0);
        this.f57390j = obtainStyledAttributes.getResourceId(C10330s.f29026E7, 0);
        this.f57391k = obtainStyledAttributes.getResourceId(C10330s.f29066I7, 0);
        this.f57393m = obtainStyledAttributes.getBoolean(C10330s.f28986A7, false);
        this.f57384d = m69402a(obtainStyledAttributes, C10330s.f28996B7, 0);
        TypedArray typedArray = obtainStyledAttributes;
        this.f57385e = m69403b(this, typedArray, C10330s.f29036F7, 0, 4, (Object) null);
        this.f57386f = m69403b(this, typedArray, C10330s.f29016D7, 0, 4, (Object) null);
        this.f57387g = m69403b(this, typedArray, C10330s.f29056H7, 0, 4, (Object) null);
        this.f57392l = obtainStyledAttributes.getBoolean(C10330s.f29076J7, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private final View m69402a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        View o0 = C32343x.m95473o0(this, resourceId, false, 2, (Object) null);
        o0.setVisibility(i2);
        addView(o0);
        return o0;
    }

    /* renamed from: b */
    static /* synthetic */ View m69403b(StateView stateView, TypedArray typedArray, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 8;
        }
        return stateView.m69402a(typedArray, i, i2);
    }

    /* renamed from: g */
    private final void m69404g(View... viewArr) {
        int i;
        List t = C41333m.m119795t(viewArr);
        boolean z = true;
        if (!(!t.isEmpty())) {
            t = null;
        }
        if (t != null) {
            C32300e0 e0Var = C32300e0.f79712a;
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C41536l.m120488h(childAt, "getChildAt(i)");
                if (t.contains(childAt)) {
                    i = 0;
                } else {
                    i = 8;
                }
                childAt.setVisibility(i);
            }
            if (this.f57393m) {
                View view = this.f57385e;
                if (view == null || view.getVisibility() != 0) {
                    z = false;
                }
                if (z) {
                    View view2 = this.f57385e;
                    if (view2 != null) {
                        view2.startAnimation(this.f57394n);
                        return;
                    }
                    return;
                }
                View view3 = this.f57385e;
                if (view3 != null) {
                    view3.clearAnimation();
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo53595c() {
        m69404g(this.f57384d);
    }

    /* renamed from: d */
    public final void mo53596d() {
        m69404g(this.f57386f);
    }

    /* renamed from: e */
    public final void mo53597e() {
        View[] viewArr = new View[2];
        viewArr[0] = this.f57385e;
        View view = this.f57384d;
        if (!this.f57392l) {
            view = null;
        }
        viewArr[1] = view;
        m69404g(viewArr);
    }

    /* renamed from: f */
    public final void mo53598f() {
        m69404g(this.f57387g);
    }

    public final View getContentView() {
        return this.f57384d;
    }

    public final View getErrorView() {
        return this.f57386f;
    }

    public final View getLoadingView() {
        return this.f57385e;
    }

    public final View getNoDataView() {
        return this.f57387g;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        if (this.f57384d == null) {
            this.f57384d = findViewById(this.f57388h);
        }
        if (this.f57385e == null) {
            this.f57385e = findViewById(this.f57389i);
        }
        if (this.f57386f == null) {
            this.f57386f = findViewById(this.f57390j);
        }
        if (this.f57387g == null) {
            this.f57387g = findViewById(this.f57391k);
        }
        mo53595c();
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        View view2;
        C41536l.m120489i(view, "changedView");
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            View view3 = this.f57385e;
            if (view3 != null) {
                view3.clearAnimation();
                return;
            }
            return;
        }
        View view4 = this.f57385e;
        boolean z = false;
        if (view4 != null && view4.getVisibility() == 0) {
            z = true;
        }
        if (z && this.f57393m && (view2 = this.f57385e) != null) {
            view2.startAnimation(this.f57394n);
        }
    }
}

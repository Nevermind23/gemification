package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.p013v4.media.session.C0125b;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.C5074b;
import com.google.android.material.internal.C5095n;
import java.util.List;
import p009a8.C0082l;
import p132j8.C6756a;
import p223q8.C7945n;

public abstract class FloatingActionButton extends C5095n implements C6756a, C7945n, CoordinatorLayout.C0643b {

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        /* renamed from: E */
        public /* bridge */ /* synthetic */ boolean mo16374E(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.mo16374E(coordinatorLayout, floatingActionButton, rect);
        }

        /* renamed from: H */
        public /* bridge */ /* synthetic */ boolean mo16375H(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.mo16375H(coordinatorLayout, floatingActionButton, view);
        }

        /* renamed from: I */
        public /* bridge */ /* synthetic */ boolean mo16376I(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.mo16376I(coordinatorLayout, floatingActionButton, i);
        }

        /* renamed from: g */
        public /* bridge */ /* synthetic */ void mo3041g(CoordinatorLayout.C0647f fVar) {
            super.mo3041g(fVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.C0644c {

        /* renamed from: a */
        private Rect f16119a;

        /* renamed from: b */
        private boolean f16120b;

        public BaseBehavior() {
            this.f16120b = true;
        }

        /* renamed from: F */
        private static boolean m19701F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0647f) {
                return ((CoordinatorLayout.C0647f) layoutParams).mo3069f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: G */
        private void m19702G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            throw null;
        }

        /* renamed from: J */
        private boolean m19703J(View view, FloatingActionButton floatingActionButton) {
            throw null;
        }

        /* renamed from: K */
        private boolean m19704K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m19703J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f16119a == null) {
                this.f16119a = new Rect();
            }
            Rect rect = this.f16119a;
            C5074b.m19850a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                throw null;
            }
            throw null;
        }

        /* renamed from: L */
        private boolean m19705L(View view, FloatingActionButton floatingActionButton) {
            if (!m19703J(view, floatingActionButton)) {
                return false;
            }
            throw null;
        }

        /* renamed from: E */
        public boolean mo16374E(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            throw null;
        }

        /* renamed from: H */
        public boolean mo16375H(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m19704K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!m19701F(view)) {
                return false;
            } else {
                m19705L(view, floatingActionButton);
                return false;
            }
        }

        /* renamed from: I */
        public boolean mo16376I(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List l = coordinatorLayout.mo2992l(floatingActionButton);
            int size = l.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) l.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m19701F(view) && m19705L(view, floatingActionButton)) {
                        break;
                    }
                } else if (m19704K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo2968C(floatingActionButton, i);
            m19702G(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ boolean mo3036b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            C0125b.m366a(view);
            return mo16374E(coordinatorLayout, (FloatingActionButton) null, rect);
        }

        /* renamed from: g */
        public void mo3041g(CoordinatorLayout.C0647f fVar) {
            if (fVar.f3222h == 0) {
                fVar.f3222h = 80;
            }
        }

        /* renamed from: h */
        public /* bridge */ /* synthetic */ boolean mo3042h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            C0125b.m366a(view);
            return mo16375H(coordinatorLayout, (FloatingActionButton) null, view2);
        }

        /* renamed from: l */
        public /* bridge */ /* synthetic */ boolean mo3046l(CoordinatorLayout coordinatorLayout, View view, int i) {
            C0125b.m366a(view);
            return mo16376I(coordinatorLayout, (FloatingActionButton) null, i);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0082l.f412D2);
            this.f16120b = obtainStyledAttributes.getBoolean(C0082l.f422E2, true);
            obtainStyledAttributes.recycle();
        }
    }
}

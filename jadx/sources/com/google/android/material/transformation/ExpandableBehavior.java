package com.google.android.material.transformation;

import android.content.Context;
import android.support.p013v4.media.session.C0125b;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import java.util.List;
import p132j8.C6756a;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.C0644c {

    /* renamed from: a */
    private int f16774a = 0;

    public ExpandableBehavior() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public C6756a mo17393E(CoordinatorLayout coordinatorLayout, View view) {
        List l = coordinatorLayout.mo2992l(view);
        int size = l.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) l.get(i);
            if (mo3039e(coordinatorLayout, view, view2)) {
                C0125b.m366a(view2);
                return null;
            }
        }
        return null;
    }

    /* renamed from: e */
    public abstract boolean mo3039e(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* renamed from: h */
    public boolean mo3042h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        C0125b.m366a(view2);
        throw null;
    }

    /* renamed from: l */
    public boolean mo3046l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (ViewCompat.m3579V(view)) {
            return false;
        }
        mo17393E(coordinatorLayout, view);
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

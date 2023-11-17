package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: com.google.android.material.appbar.g */
abstract class C4929g extends CoordinatorLayout.C0644c {

    /* renamed from: a */
    private C4930h f15505a;

    /* renamed from: b */
    private int f15506b = 0;

    /* renamed from: c */
    private int f15507c = 0;

    public C4929g() {
    }

    /* renamed from: E */
    public int mo15362E() {
        C4930h hVar = this.f15505a;
        if (hVar != null) {
            return hVar.mo15470c();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo15462F(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.mo2968C(view, i);
    }

    /* renamed from: G */
    public boolean mo15363G(int i) {
        C4930h hVar = this.f15505a;
        if (hVar != null) {
            return hVar.mo15473f(i);
        }
        this.f15506b = i;
        return false;
    }

    /* renamed from: l */
    public boolean mo3046l(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo15462F(coordinatorLayout, view, i);
        if (this.f15505a == null) {
            this.f15505a = new C4930h(view);
        }
        this.f15505a.mo15471d();
        this.f15505a.mo15468a();
        int i2 = this.f15506b;
        if (i2 != 0) {
            this.f15505a.mo15473f(i2);
            this.f15506b = 0;
        }
        int i3 = this.f15507c;
        if (i3 == 0) {
            return true;
        }
        this.f15505a.mo15472e(i3);
        this.f15507c = 0;
        return true;
    }

    public C4929g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.l */
class C1816l {

    /* renamed from: a */
    boolean f5461a = true;

    /* renamed from: b */
    int f5462b;

    /* renamed from: c */
    int f5463c;

    /* renamed from: d */
    int f5464d;

    /* renamed from: e */
    int f5465e;

    /* renamed from: f */
    int f5466f = 0;

    /* renamed from: g */
    int f5467g = 0;

    /* renamed from: h */
    boolean f5468h;

    /* renamed from: i */
    boolean f5469i;

    C1816l() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo6011a(RecyclerView.C1726b0 b0Var) {
        int i = this.f5463c;
        return i >= 0 && i < b0Var.mo5461b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo6012b(RecyclerView.C1759w wVar) {
        View p = wVar.mo5784p(this.f5463c);
        this.f5463c += this.f5464d;
        return p;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f5462b + ", mCurrentPosition=" + this.f5463c + ", mItemDirection=" + this.f5464d + ", mLayoutDirection=" + this.f5465e + ", mStartLine=" + this.f5466f + ", mEndLine=" + this.f5467g + '}';
    }
}

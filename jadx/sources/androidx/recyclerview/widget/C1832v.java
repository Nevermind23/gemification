package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.v */
public abstract class C1832v extends RecyclerView.C1742m {

    /* renamed from: g */
    boolean f5494g = true;

    /* renamed from: A */
    public final void mo6056A(RecyclerView.C1734f0 f0Var) {
        mo6064I(f0Var);
        mo5596h(f0Var);
    }

    /* renamed from: B */
    public final void mo6057B(RecyclerView.C1734f0 f0Var) {
        mo6065J(f0Var);
    }

    /* renamed from: C */
    public final void mo6058C(RecyclerView.C1734f0 f0Var, boolean z) {
        mo6066K(f0Var, z);
        mo5596h(f0Var);
    }

    /* renamed from: D */
    public final void mo6059D(RecyclerView.C1734f0 f0Var, boolean z) {
        mo6067L(f0Var, z);
    }

    /* renamed from: E */
    public final void mo6060E(RecyclerView.C1734f0 f0Var) {
        mo6068M(f0Var);
        mo5596h(f0Var);
    }

    /* renamed from: F */
    public final void mo6061F(RecyclerView.C1734f0 f0Var) {
        mo6069N(f0Var);
    }

    /* renamed from: G */
    public final void mo6062G(RecyclerView.C1734f0 f0Var) {
        mo6070O(f0Var);
        mo5596h(f0Var);
    }

    /* renamed from: H */
    public final void mo6063H(RecyclerView.C1734f0 f0Var) {
        mo6071P(f0Var);
    }

    /* renamed from: I */
    public void mo6064I(RecyclerView.C1734f0 f0Var) {
    }

    /* renamed from: J */
    public void mo6065J(RecyclerView.C1734f0 f0Var) {
    }

    /* renamed from: K */
    public void mo6066K(RecyclerView.C1734f0 f0Var, boolean z) {
    }

    /* renamed from: L */
    public void mo6067L(RecyclerView.C1734f0 f0Var, boolean z) {
    }

    /* renamed from: M */
    public void mo6068M(RecyclerView.C1734f0 f0Var) {
    }

    /* renamed from: N */
    public void mo6069N(RecyclerView.C1734f0 f0Var) {
    }

    /* renamed from: O */
    public void mo6070O(RecyclerView.C1734f0 f0Var) {
    }

    /* renamed from: P */
    public void mo6071P(RecyclerView.C1734f0 f0Var) {
    }

    /* renamed from: Q */
    public void mo6072Q(boolean z) {
        this.f5494g = z;
    }

    /* renamed from: a */
    public boolean mo5590a(RecyclerView.C1734f0 f0Var, RecyclerView.C1742m.C1744b bVar, RecyclerView.C1742m.C1744b bVar2) {
        int i;
        int i2;
        if (bVar == null || ((i = bVar.f5177a) == (i2 = bVar2.f5177a) && bVar.f5178b == bVar2.f5178b)) {
            return mo5947w(f0Var);
        }
        return mo5949y(f0Var, i, bVar.f5178b, i2, bVar2.f5178b);
    }

    /* renamed from: b */
    public boolean mo5591b(RecyclerView.C1734f0 f0Var, RecyclerView.C1734f0 f0Var2, RecyclerView.C1742m.C1744b bVar, RecyclerView.C1742m.C1744b bVar2) {
        int i;
        int i2;
        int i3 = bVar.f5177a;
        int i4 = bVar.f5178b;
        if (f0Var2.shouldIgnore()) {
            int i5 = bVar.f5177a;
            i = bVar.f5178b;
            i2 = i5;
        } else {
            i2 = bVar2.f5177a;
            i = bVar2.f5178b;
        }
        return mo5948x(f0Var, f0Var2, i3, i4, i2, i);
    }

    /* renamed from: c */
    public boolean mo5592c(RecyclerView.C1734f0 f0Var, RecyclerView.C1742m.C1744b bVar, RecyclerView.C1742m.C1744b bVar2) {
        int i;
        int i2;
        int i3 = bVar.f5177a;
        int i4 = bVar.f5178b;
        View view = f0Var.itemView;
        if (bVar2 == null) {
            i = view.getLeft();
        } else {
            i = bVar2.f5177a;
        }
        int i5 = i;
        if (bVar2 == null) {
            i2 = view.getTop();
        } else {
            i2 = bVar2.f5178b;
        }
        int i6 = i2;
        if (f0Var.isRemoved() || (i3 == i5 && i4 == i6)) {
            return mo5950z(f0Var);
        }
        view.layout(i5, i6, view.getWidth() + i5, view.getHeight() + i6);
        return mo5949y(f0Var, i3, i4, i5, i6);
    }

    /* renamed from: d */
    public boolean mo5593d(RecyclerView.C1734f0 f0Var, RecyclerView.C1742m.C1744b bVar, RecyclerView.C1742m.C1744b bVar2) {
        int i = bVar.f5177a;
        int i2 = bVar2.f5177a;
        if (i == i2 && bVar.f5178b == bVar2.f5178b) {
            mo6060E(f0Var);
            return false;
        }
        return mo5949y(f0Var, i, bVar.f5178b, i2, bVar2.f5178b);
    }

    /* renamed from: f */
    public boolean mo5594f(RecyclerView.C1734f0 f0Var) {
        return !this.f5494g || f0Var.isInvalid();
    }

    /* renamed from: w */
    public abstract boolean mo5947w(RecyclerView.C1734f0 f0Var);

    /* renamed from: x */
    public abstract boolean mo5948x(RecyclerView.C1734f0 f0Var, RecyclerView.C1734f0 f0Var2, int i, int i2, int i3, int i4);

    /* renamed from: y */
    public abstract boolean mo5949y(RecyclerView.C1734f0 f0Var, int i, int i2, int i3, int i4);

    /* renamed from: z */
    public abstract boolean mo5950z(RecyclerView.C1734f0 f0Var);
}

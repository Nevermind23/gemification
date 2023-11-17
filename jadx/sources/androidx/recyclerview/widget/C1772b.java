package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.b */
public final class C1772b implements C1821p {

    /* renamed from: a */
    private final RecyclerView.C1736h f5294a;

    public C1772b(RecyclerView.C1736h hVar) {
        this.f5294a = hVar;
    }

    /* renamed from: a */
    public void mo5893a(int i, int i2) {
        this.f5294a.notifyItemRangeInserted(i, i2);
    }

    /* renamed from: b */
    public void mo5894b(int i, int i2) {
        this.f5294a.notifyItemRangeRemoved(i, i2);
    }

    /* renamed from: c */
    public void mo5895c(int i, int i2, Object obj) {
        this.f5294a.notifyItemRangeChanged(i, i2, obj);
    }

    /* renamed from: d */
    public void mo5896d(int i, int i2) {
        this.f5294a.notifyItemMoved(i, i2);
    }
}

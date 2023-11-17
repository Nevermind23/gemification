package u81;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: u81.b */
public abstract class C39044b extends RecyclerView.C1756u {
    /* renamed from: e */
    public void mo5740e(RecyclerView recyclerView, int i, int i2) {
        super.mo5740e(recyclerView, i, i2);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int V = linearLayoutManager.mo5660V();
        int k0 = linearLayoutManager.mo5686k0();
        int n2 = linearLayoutManager.mo5219n2();
        if (!mo92734g() && !mo92733f() && V + n2 >= k0 && n2 >= 0) {
            mo92735h();
        }
    }

    /* renamed from: f */
    public abstract boolean mo92733f();

    /* renamed from: g */
    public abstract boolean mo92734g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo92735h();
}

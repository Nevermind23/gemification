package x00;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: x00.e */
public abstract class C29614e extends RecyclerView.C1756u {
    /* renamed from: e */
    public void mo5740e(RecyclerView recyclerView, int i, int i2) {
        super.mo5740e(recyclerView, i, i2);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int V = linearLayoutManager.mo5660V();
        int k0 = linearLayoutManager.mo5686k0();
        int n2 = linearLayoutManager.mo5219n2();
        int i3 = (V + n2) - 1;
        if (!mo69510f() && !mo69511g() && n2 >= 0 && i3 >= k0 - 10) {
            mo69512h();
        }
    }

    /* renamed from: f */
    public abstract boolean mo69510f();

    /* renamed from: g */
    public abstract boolean mo69511g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo69512h();
}

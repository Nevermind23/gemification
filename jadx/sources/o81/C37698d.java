package o81;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o81.d */
public abstract class C37698d extends RecyclerView.C1756u {

    /* renamed from: a */
    private RecyclerView f90567a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f90568b;

    /* renamed from: o81.d$a */
    class C37699a implements Runnable {
        C37699a() {
        }

        public void run() {
            C37698d.this.f90568b = true;
            C37698d.this.mo90888k();
        }
    }

    /* renamed from: j */
    private void m110801j() {
        RecyclerView recyclerView = this.f90567a;
        if (recyclerView != null) {
            mo5740e(recyclerView, 0, 0);
        }
    }

    /* renamed from: e */
    public void mo5740e(RecyclerView recyclerView, int i, int i2) {
        super.mo5740e(recyclerView, i, i2);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        C37694b bVar = (C37694b) recyclerView.getAdapter();
        if (bVar != null) {
            int q2 = linearLayoutManager.mo5223q2();
            if (!this.f90568b && q2 != -1 && bVar.getItemCount() > 0 && bVar.getItemViewType(q2) == -2) {
                recyclerView.post(new C37699a());
            }
        }
    }

    /* renamed from: g */
    public void mo90890g(RecyclerView recyclerView) {
        if (recyclerView != null) {
            this.f90567a = recyclerView;
            recyclerView.mo5363n(this);
            m110801j();
        }
    }

    /* renamed from: h */
    public void mo90891h(RecyclerView recyclerView) {
        if (recyclerView != null) {
            recyclerView.mo5367o1(this);
        }
        this.f90567a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo90892i(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f90567a;
        return recyclerView2 != null && recyclerView2 == recyclerView;
    }

    /* renamed from: k */
    public abstract void mo90888k();

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo90893l(boolean z) {
        this.f90568b = z;
        m110801j();
    }
}

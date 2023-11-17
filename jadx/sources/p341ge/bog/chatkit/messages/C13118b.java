package p341ge.bog.chatkit.messages;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* renamed from: ge.bog.chatkit.messages.b */
class C13118b extends RecyclerView.C1756u {

    /* renamed from: a */
    private C13119a f38605a;

    /* renamed from: b */
    private int f38606b = 0;

    /* renamed from: c */
    private int f38607c = 0;

    /* renamed from: d */
    private boolean f38608d = true;

    /* renamed from: e */
    private RecyclerView.C1747p f38609e;

    /* renamed from: ge.bog.chatkit.messages.b$a */
    interface C13119a {
        int getMessagesCount();

        void onLoadMore(int i, int i2);
    }

    C13118b(LinearLayoutManager linearLayoutManager, C13119a aVar) {
        this.f38609e = linearLayoutManager;
        this.f38605a = aVar;
    }

    /* renamed from: f */
    private int m49399f(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i2 == 0) {
                i = iArr[i2];
            } else {
                int i3 = iArr[i2];
                if (i3 > i) {
                    i = i3;
                }
            }
        }
        return i;
    }

    /* renamed from: e */
    public void mo5740e(RecyclerView recyclerView, int i, int i2) {
        int i3;
        if (this.f38605a != null) {
            int k0 = this.f38609e.mo5686k0();
            RecyclerView.C1747p pVar = this.f38609e;
            if (pVar instanceof StaggeredGridLayoutManager) {
                i3 = m49399f(((StaggeredGridLayoutManager) pVar).mo5810v2((int[]) null));
            } else if (pVar instanceof LinearLayoutManager) {
                i3 = ((LinearLayoutManager) pVar).mo5223q2();
            } else if (pVar instanceof GridLayoutManager) {
                i3 = ((GridLayoutManager) pVar).mo5223q2();
            } else {
                i3 = 0;
            }
            if (k0 < this.f38607c) {
                this.f38606b = 0;
                this.f38607c = k0;
                if (k0 == 0) {
                    this.f38608d = true;
                }
            }
            if (this.f38608d && k0 > this.f38607c) {
                this.f38608d = false;
                this.f38607c = k0;
            }
            if (!this.f38608d && i3 + 5 > k0) {
                this.f38606b++;
                C13119a aVar = this.f38605a;
                aVar.onLoadMore(aVar.getMessagesCount(), k0);
                this.f38608d = true;
            }
        }
    }
}

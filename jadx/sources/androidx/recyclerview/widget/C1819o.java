package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1773c;
import androidx.recyclerview.widget.C1775d;
import androidx.recyclerview.widget.C1796h;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.o */
public abstract class C1819o extends RecyclerView.C1736h {

    /* renamed from: d */
    final C1775d f5480d;

    /* renamed from: e */
    private final C1775d.C1779b f5481e;

    /* renamed from: androidx.recyclerview.widget.o$a */
    class C1820a implements C1775d.C1779b {
        C1820a() {
        }

        /* renamed from: a */
        public void mo5913a(List list, List list2) {
            C1819o.this.mo6028h(list, list2);
        }
    }

    protected C1819o(C1796h.C1802f fVar) {
        C1820a aVar = new C1820a();
        this.f5481e = aVar;
        C1775d dVar = new C1775d((C1821p) new C1772b(this), new C1773c.C1774a(fVar).mo5900a());
        this.f5480d = dVar;
        dVar.mo5901a(aVar);
    }

    /* renamed from: f */
    public List mo6026f() {
        return this.f5480d.mo5902b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public Object mo6027g(int i) {
        return this.f5480d.mo5902b().get(i);
    }

    public int getItemCount() {
        return this.f5480d.mo5902b().size();
    }

    /* renamed from: h */
    public void mo6028h(List list, List list2) {
    }

    /* renamed from: i */
    public void mo6029i(List list) {
        this.f5480d.mo5904e(list);
    }

    /* renamed from: j */
    public void mo6030j(List list, Runnable runnable) {
        this.f5480d.mo5905f(list, runnable);
    }
}

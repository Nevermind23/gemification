package ls0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import p341ge.bog.designsystem.components.accountselector.AccountSelectorItemView;
import p668xg.C18761c;
import pr0.C37974y;
import z11.C40140b;

/* renamed from: ls0.f */
public final class C37148f extends C1819o {

    /* renamed from: f */
    private final Long f89478f;

    /* renamed from: g */
    private final C37149a f89479g;

    /* renamed from: ls0.f$a */
    public interface C37149a {
        /* renamed from: a */
        void mo90117a(C40140b bVar);
    }

    /* renamed from: ls0.f$b */
    public final class C37150b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C37974y f89480d;

        /* renamed from: e */
        final /* synthetic */ C37148f f89481e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37150b(C37148f fVar, C37974y yVar) {
            super(yVar.mo3946b());
            C41536l.m120489i(yVar, "binding");
            this.f89481e = fVar;
            this.f89480d = yVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m109808j(C37148f fVar, C40140b bVar, int i, C18761c cVar) {
            C41536l.m120489i(fVar, "this$0");
            C41536l.m120489i(bVar, "$account");
            C41536l.m120489i(cVar, "<anonymous parameter 1>");
            fVar.mo90124k().mo90117a(bVar);
        }

        /* renamed from: i */
        public final void mo90128i(C40140b bVar) {
            boolean z;
            C41536l.m120489i(bVar, "account");
            AccountSelectorItemView c = this.f89480d.mo3946b();
            C37148f fVar = this.f89481e;
            c.setData(bVar.mo94069a());
            long b = bVar.mo94070b();
            Long l = fVar.mo90125l();
            if (l != null && b == l.longValue()) {
                z = true;
            } else {
                z = false;
            }
            c.setActivated(z);
            c.setOnCurrencyItemSelectedListener(new C37151g(fVar, bVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37148f(Long l, C37149a aVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(aVar, "itemClickListener");
        this.f89478f = l;
        this.f89479g = aVar;
    }

    /* renamed from: k */
    public final C37149a mo90124k() {
        return this.f89479g;
    }

    /* renamed from: l */
    public final Long mo90125l() {
        return this.f89478f;
    }

    /* renamed from: m */
    public void onBindViewHolder(C37150b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        bVar.mo90128i((C40140b) g);
    }

    /* renamed from: n */
    public C37150b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C37974y d = C37974y.m111642d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C37150b(this, d);
    }
}

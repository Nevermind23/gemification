package y11;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import b31.C31126o;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import p341ge.bog.designsystem.components.accountselector.AccountSelectorItemView;
import p668xg.C18761c;
import z11.C40140b;

/* renamed from: y11.m */
public final class C40012m extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Long f95003f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C40013a f95004g;

    /* renamed from: y11.m$a */
    public interface C40013a {
        /* renamed from: a */
        void mo93824a(long j);
    }

    /* renamed from: y11.m$b */
    public final class C40014b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C31126o f95005d;

        /* renamed from: e */
        final /* synthetic */ C40012m f95006e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40014b(C40012m mVar, C31126o oVar) {
            super(oVar.mo3946b());
            C41536l.m120489i(oVar, "binding");
            this.f95006e = mVar;
            this.f95005d = oVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m115953j(C40012m mVar, C40140b bVar, int i, C18761c cVar) {
            C41536l.m120489i(mVar, "this$0");
            C41536l.m120489i(bVar, "$account");
            C41536l.m120489i(cVar, "<anonymous parameter 1>");
            C40013a k = mVar.f95004g;
            if (k != null) {
                k.mo93824a(bVar.mo94070b());
            }
        }

        /* renamed from: i */
        public final void mo93836i(C40140b bVar) {
            boolean z;
            C41536l.m120489i(bVar, "account");
            AccountSelectorItemView c = this.f95005d.mo3946b();
            C40012m mVar = this.f95006e;
            c.setData(bVar.mo94069a());
            long b = bVar.mo94070b();
            Long l = mVar.f95003f;
            if (l != null && b == l.longValue()) {
                z = true;
            } else {
                z = false;
            }
            c.setActivated(z);
            c.setOnCurrencyItemSelectedListener(new C40015n(mVar, bVar));
        }
    }

    public C40012m() {
        super(C37599g.f90345a.mo90787d());
    }

    /* renamed from: m */
    public void onBindViewHolder(C40014b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        bVar.mo93836i((C40140b) g);
    }

    /* renamed from: n */
    public C40014b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C31126o d = C31126o.m92624d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C40014b(this, d);
    }

    /* renamed from: o */
    public final void mo93834o(long j) {
        this.f95003f = Long.valueOf(j);
        notifyDataSetChanged();
    }

    /* renamed from: p */
    public final void mo93835p(C40013a aVar) {
        this.f95004g = aVar;
    }
}

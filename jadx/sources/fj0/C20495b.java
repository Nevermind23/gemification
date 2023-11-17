package fj0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.accountselector.AccountSelectorItemView;
import p615tg.C17963d;
import p668xg.C18761c;
import th0.C28438z;
import ue1.C43075l;
import z11.C40140b;

/* renamed from: fj0.b */
public final class C20495b extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Long f55499f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C43075l f55500g;

    /* renamed from: fj0.b$a */
    public final class C20496a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C28438z f55501d;

        /* renamed from: e */
        final /* synthetic */ C20495b f55502e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20496a(C20495b bVar, C28438z zVar) {
            super(zVar.mo3946b());
            C41536l.m120489i(zVar, "binding");
            this.f55502e = bVar;
            this.f55501d = zVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m66717j(C20495b bVar, C40140b bVar2, int i, C18761c cVar) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(bVar2, "$account");
            C41536l.m120489i(cVar, "<anonymous parameter 1>");
            bVar.f55500g.invoke(bVar2);
        }

        /* renamed from: i */
        public final void mo49038i(C40140b bVar) {
            boolean z;
            C41536l.m120489i(bVar, "account");
            AccountSelectorItemView c = this.f55501d.mo3946b();
            C20495b bVar2 = this.f55502e;
            c.setData(bVar.mo94069a());
            long b = bVar.mo94070b();
            Long l = bVar2.f55499f;
            if (l != null && b == l.longValue()) {
                z = true;
            } else {
                z = false;
            }
            c.setActivated(z);
            c.setOnCurrencyItemSelectedListener(new C20494a(bVar2, bVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20495b(Long l, C43075l lVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(lVar, "onAccountSelected");
        this.f55499f = l;
        this.f55500g = lVar;
    }

    /* renamed from: m */
    public void onBindViewHolder(C20496a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo49038i((C40140b) g);
    }

    /* renamed from: n */
    public C20496a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C28438z d = C28438z.m87275d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C20496a(this, d);
    }
}

package jm0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.accountselector.AccountSelectorItemView;
import p615tg.C17963d;
import p668xg.C18761c;
import ue1.C43075l;
import z11.C40140b;
import z71.C40185l;

/* renamed from: jm0.b */
public final class C25478b extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Long f65141f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C43075l f65142g;

    /* renamed from: jm0.b$a */
    public final class C25479a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C40185l f65143d;

        /* renamed from: e */
        final /* synthetic */ C25478b f65144e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25479a(C25478b bVar, C40185l lVar) {
            super(lVar.mo3946b());
            C41536l.m120489i(lVar, "binding");
            this.f65144e = bVar;
            this.f65143d = lVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m80653j(C25478b bVar, C40140b bVar2, int i, C18761c cVar) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(bVar2, "$account");
            C41536l.m120489i(cVar, "<anonymous parameter 1>");
            bVar.f65142g.invoke(bVar2);
        }

        /* renamed from: i */
        public final void mo64042i(C40140b bVar) {
            boolean z;
            C41536l.m120489i(bVar, "account");
            AccountSelectorItemView c = this.f65143d.mo3946b();
            C25478b bVar2 = this.f65144e;
            c.setData(bVar.mo94069a());
            long b = bVar.mo94070b();
            Long l = bVar2.f65141f;
            if (l != null && b == l.longValue()) {
                z = true;
            } else {
                z = false;
            }
            c.setActivated(z);
            c.setOnCurrencyItemSelectedListener(new C25477a(bVar2, bVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25478b(Long l, C43075l lVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(lVar, "onAccountSelected");
        this.f65141f = l;
        this.f65142g = lVar;
    }

    /* renamed from: m */
    public void onBindViewHolder(C25479a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo64042i((C40140b) g);
    }

    /* renamed from: n */
    public C25479a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C40185l d = C40185l.m116448d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C25479a(this, d);
    }
}

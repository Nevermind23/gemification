package kz0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import iy0.C36589d1;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;

/* renamed from: kz0.b */
public final class C37023b extends RecyclerView.C1736h {

    /* renamed from: d */
    private final List f89166d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C37038f f89167e;

    /* renamed from: kz0.b$a */
    public final class C37024a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36589d1 f89168d;

        /* renamed from: e */
        final /* synthetic */ C37023b f89169e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37024a(C37023b bVar, C36589d1 d1Var) {
            super(d1Var.mo3946b());
            C41536l.m120489i(d1Var, "binding");
            this.f89169e = bVar;
            this.f89168d = d1Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m109536j(C37023b bVar, CreditCardView.C13270b bVar2, View view) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(bVar2, "$data");
            bVar.f89167e.mo89956uf(bVar2.mo35446g());
        }

        /* renamed from: i */
        public final void mo89948i(CreditCardView.C13270b bVar) {
            C41536l.m120489i(bVar, "data");
            this.f89168d.f88176e.setCreditCard(bVar);
            this.f89168d.f88176e.setOnClickListener(new C37022a(this.f89169e, bVar));
        }
    }

    public C37023b(List list, C37038f fVar) {
        C41536l.m120489i(list, "creditCards");
        C41536l.m120489i(fVar, "viewModel");
        this.f89166d = list;
        this.f89167e = fVar;
    }

    /* renamed from: g */
    public void onBindViewHolder(C37024a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        aVar.mo89948i((CreditCardView.C13270b) this.f89166d.get(i));
    }

    public int getItemCount() {
        return this.f89166d.size();
    }

    /* renamed from: h */
    public C37024a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C36589d1 d = C36589d1.m108483d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(inflater, parent, false)");
        return new C37024a(this, d);
    }
}

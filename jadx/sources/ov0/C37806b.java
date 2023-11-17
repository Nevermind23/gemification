package ov0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import bv0.C31203c;
import bv0.C31205e;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import ev0.C31824e0;
import ev0.C31831l;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import ov0.C37810d;
import ue1.C43075l;

/* renamed from: ov0.b */
public final class C37806b extends RecyclerView.C1736h {

    /* renamed from: d */
    private List f90746d = C41341q.m119907j();

    /* renamed from: e */
    private C43075l f90747e;

    /* renamed from: ov0.b$a */
    public final class C37807a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C31831l f90748d;

        /* renamed from: e */
        final /* synthetic */ C37806b f90749e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37807a(C37806b bVar, C31831l lVar) {
            super(lVar.mo3946b());
            C41536l.m120489i(lVar, "binding");
            this.f90749e = bVar;
            this.f90748d = lVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m111092j(C37806b bVar, C37810d.C37811a aVar, View view) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(aVar, "$item");
            C43075l f = bVar.mo91053f();
            if (f != null) {
                f.invoke(aVar.mo91061d());
            }
        }

        /* renamed from: i */
        public final void mo91056i(C37810d.C37811a aVar) {
            C41536l.m120489i(aVar, "item");
            this.f90748d.mo3946b().setTitle(aVar.mo91062e());
            this.f90748d.mo3946b().setAmountBadges(aVar.mo91060c());
            if (aVar.mo91058a() != null) {
                this.f90748d.mo3946b().mo34642b(new BigDecimal(String.valueOf(aVar.mo91058a().doubleValue())), aVar.mo91059b());
            }
            this.f90748d.mo3946b().setOnClickListener(new C37805a(this.f90749e, aVar));
        }
    }

    /* renamed from: ov0.b$b */
    public static final class C37808b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C31824e0 f90750d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37808b(C31824e0 e0Var) {
            super(e0Var.mo3946b());
            C41536l.m120489i(e0Var, "binding");
            this.f90750d = e0Var;
        }

        /* renamed from: h */
        public final void mo91057h(C37810d.C37812b bVar) {
            int i;
            C41536l.m120489i(bVar, "item");
            this.f90750d.f78482e.setText(bVar.mo91064b());
            ImageView imageView = this.f90750d.f78483f;
            Integer a = bVar.mo91063a();
            if (a != null) {
                i = a.intValue();
            } else {
                i = C31203c.f77509h;
            }
            imageView.setImageResource(i);
        }
    }

    /* renamed from: f */
    public final C43075l mo91053f() {
        return this.f90747e;
    }

    /* renamed from: g */
    public final void mo91054g(C43075l lVar) {
        this.f90747e = lVar;
    }

    public int getItemCount() {
        return this.f90746d.size();
    }

    public int getItemViewType(int i) {
        C37810d dVar = (C37810d) this.f90746d.get(i);
        if (dVar instanceof C37810d.C37812b) {
            return C31205e.item_total_amount;
        }
        if (dVar instanceof C37810d.C37811a) {
            return C31205e.item_account_card;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: h */
    public final void mo91055h(List list) {
        C41536l.m120489i(list, C11755a.C11756a.f34100b);
        this.f90746d = list;
        notifyDataSetChanged();
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        C37810d dVar = (C37810d) this.f90746d.get(i);
        if (dVar instanceof C37810d.C37812b) {
            ((C37808b) f0Var).mo91057h((C37810d.C37812b) dVar);
        } else if (dVar instanceof C37810d.C37811a) {
            ((C37807a) f0Var).mo91056i((C37810d.C37811a) dVar);
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C31205e.item_total_amount) {
            C31824e0 d = C31824e0.m94085d(from, viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …lse\n                    )");
            return new C37808b(d);
        } else if (i == C31205e.item_account_card) {
            C31831l d2 = C31831l.m94114d(from, viewGroup, false);
            C41536l.m120488h(d2, "inflate(\n               …lse\n                    )");
            return new C37807a(this, d2);
        } else {
            throw new UnsupportedOperationException("Unknown view type");
        }
    }
}

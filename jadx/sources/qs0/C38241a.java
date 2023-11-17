package qs0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import p341ge.bog.mobilebank.loans.presentation.repayment.model.RepaymentDetailsUiModel;
import pr0.C37945b0;

/* renamed from: qs0.a */
public final class C38241a extends C1819o {

    /* renamed from: qs0.a$a */
    public static final class C38242a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C37945b0 f91730d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38242a(C37945b0 b0Var) {
            super(b0Var.mo3946b());
            C41536l.m120489i(b0Var, "binding");
            this.f91730d = b0Var;
        }

        /* renamed from: h */
        public final void mo91774h(RepaymentDetailsUiModel repaymentDetailsUiModel) {
            C41536l.m120489i(repaymentDetailsUiModel, "item");
            C37945b0 b0Var = this.f91730d;
            b0Var.f91093e.setTitle(C32343x.m95388F(repaymentDetailsUiModel.mo74460b(), new Object[0]));
            b0Var.f91093e.setText(C32343x.m95388F(repaymentDetailsUiModel.mo74459a(), new Object[0]));
        }
    }

    public C38241a() {
        super(C37599g.f90345a.mo90787d());
    }

    /* renamed from: k */
    public void onBindViewHolder(C38242a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo91774h((RepaymentDetailsUiModel) g);
    }

    /* renamed from: l */
    public C38242a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C37945b0 d = C37945b0.m111524d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…          false\n        )");
        return new C38242a(d);
    }
}

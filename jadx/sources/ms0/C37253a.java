package ms0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import lr0.C37127b;
import o31.C37599g;
import p341ge.bog.mobilebank.loans.presentation.repayment.model.RepaymentDetailsUiModel;
import pr0.C37943a0;
import pr0.C37975z;

/* renamed from: ms0.a */
public final class C37253a extends C1819o {

    /* renamed from: ms0.a$a */
    public static final class C37254a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C37975z f89687d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37254a(C37975z zVar) {
            super(zVar.mo3946b());
            C41536l.m120489i(zVar, "binding");
            this.f89687d = zVar;
        }

        /* renamed from: h */
        public final void mo90342h(RepaymentDetailsUiModel repaymentDetailsUiModel) {
            C41536l.m120489i(repaymentDetailsUiModel, "item");
            C37975z zVar = this.f89687d;
            zVar.f91282f.setText(C32343x.m95388F(repaymentDetailsUiModel.mo74460b(), new Object[0]));
            zVar.f91281e.setText(repaymentDetailsUiModel.mo74459a());
            if (repaymentDetailsUiModel.mo74461d()) {
                TextView textView = zVar.f91282f;
                Context context = zVar.mo3946b().getContext();
                int i = C37127b.f89405d;
                textView.setTextColor(C0767a.m2893c(context, i));
                zVar.f91281e.setTextColor(C0767a.m2893c(zVar.mo3946b().getContext(), i));
                return;
            }
            zVar.f91282f.setTextColor(C0767a.m2893c(zVar.mo3946b().getContext(), C37127b.f89404c));
            zVar.f91281e.setTextColor(C0767a.m2893c(zVar.mo3946b().getContext(), C37127b.f89403b));
        }
    }

    /* renamed from: ms0.a$b */
    public static final class C37255b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C37943a0 f89688d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37255b(C37943a0 a0Var) {
            super(a0Var.mo3946b());
            C41536l.m120489i(a0Var, "binding");
            this.f89688d = a0Var;
        }

        /* renamed from: h */
        public final void mo90343h(RepaymentDetailsUiModel repaymentDetailsUiModel) {
            C41536l.m120489i(repaymentDetailsUiModel, "item");
            C37943a0 a0Var = this.f89688d;
            a0Var.f91088f.setText(C32343x.m95388F(repaymentDetailsUiModel.mo74460b(), new Object[0]));
            a0Var.f91087e.setText(repaymentDetailsUiModel.mo74459a());
        }
    }

    /* renamed from: ms0.a$c */
    private enum C37256c {
        HEADER,
        DETAILS
    }

    public C37253a() {
        super(C37599g.f90345a.mo90787d());
    }

    public int getItemViewType(int i) {
        return (i == 0 ? C37256c.HEADER : C37256c.DETAILS).ordinal();
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        if (f0Var instanceof C37255b) {
            Object g = mo6027g(i);
            C41536l.m120488h(g, "getItem(position)");
            ((C37255b) f0Var).mo90343h((RepaymentDetailsUiModel) g);
        } else if (f0Var instanceof C37254a) {
            Object g2 = mo6027g(i);
            C41536l.m120488h(g2, "getItem(position)");
            ((C37254a) f0Var).mo90342h((RepaymentDetailsUiModel) g2);
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == C37256c.HEADER.ordinal()) {
            C37943a0 d = C37943a0.m111516d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …  false\n                )");
            return new C37255b(d);
        }
        C37975z d2 = C37975z.m111646d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d2, "inflate(\n               …  false\n                )");
        return new C37254a(d2);
    }
}

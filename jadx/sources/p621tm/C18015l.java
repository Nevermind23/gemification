package p621tm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32300e0;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardPayrollInfoUiModel;
import p411em.C12487d;
import p481jm.C16221c0;
import p615tg.C17963d;

/* renamed from: tm.l */
public final class C18015l extends C1819o {

    /* renamed from: f */
    private final C18016a f51234f;

    /* renamed from: tm.l$a */
    public interface C18016a {
        /* renamed from: a */
        void mo39061a(DebitCardPayrollInfoUiModel debitCardPayrollInfoUiModel);
    }

    /* renamed from: tm.l$b */
    public static final class C18017b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C16221c0 f51235d;

        /* renamed from: e */
        private final C18016a f51236e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18017b(C16221c0 c0Var, C18016a aVar) {
            super(c0Var.mo3946b());
            C41536l.m120489i(c0Var, "binding");
            C41536l.m120489i(aVar, "onClick");
            this.f51235d = c0Var;
            this.f51236e = aVar;
            c0Var.f45783e.setImageResource(C12487d.icons_24_general_user_business_fill);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m62008j(C18017b bVar, DebitCardPayrollInfoUiModel debitCardPayrollInfoUiModel, View view) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(debitCardPayrollInfoUiModel, "$item");
            bVar.f51236e.mo39061a(debitCardPayrollInfoUiModel);
        }

        /* renamed from: i */
        public final void mo45708i(DebitCardPayrollInfoUiModel debitCardPayrollInfoUiModel) {
            C41536l.m120489i(debitCardPayrollInfoUiModel, "item");
            this.f51235d.f45784f.setText(C32300e0.f79712a.mo72819e(debitCardPayrollInfoUiModel.mo39551e(), debitCardPayrollInfoUiModel.mo39549d()));
            this.f51235d.mo3946b().setOnClickListener(new C18018m(this, debitCardPayrollInfoUiModel));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18015l(C18016a aVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(aVar, "onClick");
        this.f51234f = aVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C18017b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        DebitCardPayrollInfoUiModel debitCardPayrollInfoUiModel = (DebitCardPayrollInfoUiModel) mo6027g(i);
        if (debitCardPayrollInfoUiModel != null) {
            bVar.mo45708i(debitCardPayrollInfoUiModel);
        }
    }

    /* renamed from: l */
    public C18017b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C16221c0 d = C16221c0.m57813d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C18017b(d, this.f51234f);
    }
}

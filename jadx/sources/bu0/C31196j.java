package bu0;

import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import fu0.C32010a;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import p341ge.bog.mobilebank.loyaltyprogress.presentation.model.statusbenefits.BenefitUiModel;
import vt0.C39468e;

/* renamed from: bu0.j */
public final class C31196j extends C1819o {

    /* renamed from: bu0.j$a */
    public final class C31197a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C39468e f77493d;

        /* renamed from: e */
        final /* synthetic */ C31196j f77494e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31197a(C31196j jVar, C39468e eVar) {
            super(eVar.mo3946b());
            C41536l.m120489i(eVar, "binding");
            this.f77494e = jVar;
            this.f77493d = eVar;
        }

        /* renamed from: h */
        public final void mo71424h(BenefitUiModel benefitUiModel) {
            C41536l.m120489i(benefitUiModel, "benefitUiModel");
            C32010a b = benefitUiModel.mo75431b();
            if (b != null) {
                C39468e eVar = this.f77493d;
                eVar.f93896e.setBackground(new ColorDrawable(C0767a.m2893c(eVar.mo3946b().getContext(), b.mo72503b())));
                this.f77493d.f93897f.setImageResource(b.mo72505e());
                C39468e eVar2 = this.f77493d;
                eVar2.f93897f.setColorFilter(C0767a.m2893c(eVar2.mo3946b().getContext(), b.mo72504c()));
            }
            this.f77493d.f93898g.setTitle(benefitUiModel.mo75430a());
            this.f77493d.f93898g.setText(benefitUiModel.mo75432d());
        }
    }

    public C31196j() {
        super(C37599g.f90345a.mo90787d());
    }

    /* renamed from: k */
    public void onBindViewHolder(C31197a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo71424h((BenefitUiModel) g);
    }

    /* renamed from: l */
    public C31197a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C39468e d = C39468e.m114729d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C31197a(this, d);
    }
}

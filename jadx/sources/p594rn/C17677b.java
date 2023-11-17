package p594rn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardBenefitUiModel;
import p426fn.C12928b;
import p481jm.C16243v;
import p615tg.C17963d;

/* renamed from: rn.b */
public final class C17677b extends C1819o {

    /* renamed from: f */
    private final C17679c f49395f;

    /* renamed from: rn.b$a */
    public static final class C17678a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C16243v f49396d;

        /* renamed from: e */
        private final C17679c f49397e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17678a(C16243v vVar, C17679c cVar) {
            super(vVar.mo3946b());
            C41536l.m120489i(vVar, "binding");
            C41536l.m120489i(cVar, "onBenefitClicked");
            this.f49396d = vVar;
            this.f49397e = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m61330j(C17678a aVar, CardBenefitUiModel cardBenefitUiModel, View view) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(cardBenefitUiModel, "$item");
            aVar.f49397e.mo45091a(cardBenefitUiModel);
        }

        /* renamed from: i */
        public final void mo45239i(CardBenefitUiModel cardBenefitUiModel) {
            C41536l.m120489i(cardBenefitUiModel, "item");
            C16243v vVar = this.f49396d;
            vVar.mo3946b().setOnClickListener(new C17676a(this, cardBenefitUiModel));
            String a = cardBenefitUiModel.mo39378a();
            if (C41536l.m120484d(a, "TRAVEL_ADVANTAGES")) {
                vVar.f45995e.setText(C32343x.m95388F("cards.detalis.advantages.actionsheet.travel", new Object[0]));
                vVar.f45998h.setImageResource(C12928b.f38171j);
            } else if (C41536l.m120484d(a, "SHOPPING_ADVANTAGES")) {
                vVar.f45995e.setText(C32343x.m95388F("cards.detalis.advantages.actionsheet.shopping", new Object[0]));
                vVar.f45998h.setImageResource(C12928b.f38170i);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17677b(C17679c cVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(cVar, "onBenefitClicked");
        this.f49395f = cVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C17678a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo45239i((CardBenefitUiModel) g);
    }

    /* renamed from: l */
    public C17678a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C16243v d = C16243v.m57908d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C17678a(d, this.f49395f);
    }
}

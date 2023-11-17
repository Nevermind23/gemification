package p01;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32314k;
import i01.C36336d;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37599g;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.model.CardUiModel;
import p669xh.C18763a;

/* renamed from: p01.j */
public final class C37888j extends C1819o {

    /* renamed from: f */
    private final C37890b f90954f;

    /* renamed from: p01.j$a */
    public static final class C37889a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36336d f90955d;

        /* renamed from: e */
        private final C37890b f90956e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37889a(C36336d dVar, C37890b bVar) {
            super(dVar.mo3946b());
            C41536l.m120489i(dVar, "binding");
            C41536l.m120489i(bVar, "listener");
            this.f90955d = dVar;
            this.f90956e = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m111372j(C37889a aVar, CardUiModel cardUiModel, View view) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(cardUiModel, "$data");
            aVar.f90956e.mo91225a(cardUiModel);
        }

        /* renamed from: i */
        public final void mo91237i(CardUiModel cardUiModel) {
            CreditCardView.C13273e eVar;
            CardUiModel cardUiModel2 = cardUiModel;
            C41536l.m120489i(cardUiModel2, "data");
            CreditCardView creditCardView = this.f90955d.f87697e;
            String h = cardUiModel.mo82989h();
            String l = cardUiModel.mo82994l();
            if (l == null) {
                l = "";
            }
            String str = l;
            String j = cardUiModel.mo82992j();
            C18763a f = cardUiModel.mo82987f();
            String a = cardUiModel.mo82985e().mo82971a();
            boolean r = cardUiModel.mo82998r();
            if (cardUiModel.mo82985e().mo82972b()) {
                eVar = CreditCardView.C13273e.BLACK;
            } else {
                eVar = CreditCardView.C13273e.WHITE;
            }
            String bigDecimal = cardUiModel.mo82991i().mo82943a().toString();
            String a2 = C32314k.m95245a(cardUiModel.mo82991i().mo82944b());
            C41536l.m120488h(bigDecimal, "toString()");
            C41536l.m120488h(a2, "getCurrencySym(data.currentAmount.ccy)");
            CreditCardView.C13270b bVar = r3;
            CreditCardView.C13270b bVar2 = new CreditCardView.C13270b(h, str, bigDecimal, a2, j, f, 0, a, r, false, eVar, (String) null, 2112, (DefaultConstructorMarker) null);
            creditCardView.setCreditCard(bVar);
            this.itemView.setOnClickListener(new C37887i(this, cardUiModel2));
        }
    }

    /* renamed from: p01.j$b */
    public interface C37890b {
        /* renamed from: a */
        void mo91225a(CardUiModel cardUiModel);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37888j(C37890b bVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(bVar, "onCardClickListener");
        this.f90954f = bVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C37889a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object obj = mo6026f().get(i);
        C41536l.m120488h(obj, "currentList[position]");
        aVar.mo91237i((CardUiModel) obj);
    }

    /* renamed from: l */
    public C37889a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C36336d d = C36336d.m107836d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(inflater, parent, false)");
        return new C37889a(d, this.f90954f);
    }
}

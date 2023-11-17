package dz0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import hy0.C36272f;
import iy0.C36592e1;
import iy0.C36595f1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.creditcardwidget.CreditCardWidgetBannerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.products.presentation.cardinsurance.model.CardInsuranceStatusAdapterItem;
import p341ge.bog.mobilebank.products.presentation.cardinsurance.model.CardInsuranceStatusUiModel;
import p341ge.bog.mobilebank.products.presentation.cardinsurance.model.OverallCardInsuranceStatusHeader;
import p341ge.bog.mobilebank.shared.helper.C34645a;
import p615tg.C17963d;
import p642vh.C18358g;
import p683yh.C18917a;
import ue1.C43075l;

/* renamed from: dz0.d */
public final class C31632d extends C1819o {

    /* renamed from: f */
    private final C43075l f78203f;

    /* renamed from: dz0.d$a */
    private static final class C31633a extends C31635c {

        /* renamed from: d */
        private final C36592e1 f78204d;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C31633a(iy0.C36592e1 r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                ge.bog.designsystem.components.pagedescription.PageDescriptionView r0 = r3.mo3946b()
                java.lang.String r1 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                r1 = 0
                r2.<init>(r0, r1)
                r2.f78204d = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: dz0.C31632d.C31633a.<init>(iy0.e1):void");
        }

        /* renamed from: i */
        public void mo72072h(OverallCardInsuranceStatusHeader overallCardInsuranceStatusHeader) {
            C41536l.m120489i(overallCardInsuranceStatusHeader, "item");
            PageDescriptionView c = this.f78204d.mo3946b();
            c.setTitle(C32343x.m95388F(overallCardInsuranceStatusHeader.mo82071b(), new Object[0]));
            c.setText(C32343x.m95388F("card.insurance.main.page.description", new Object[0]));
            c.setDrawableTint(C18358g.m62729c(overallCardInsuranceStatusHeader.mo82070a().mo72330b()));
        }
    }

    /* renamed from: dz0.d$b */
    private static final class C31634b extends C31635c {

        /* renamed from: d */
        private final C36595f1 f78205d;

        /* renamed from: e */
        private final C43075l f78206e;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C31634b(iy0.C36595f1 r3, ue1.C43075l r4) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                ge.bog.designsystem.components.creditcardwidget.CreditCardWidgetBannerView r0 = r3.mo3946b()
                java.lang.String r1 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                r1 = 0
                r2.<init>(r0, r1)
                r2.f78205d = r3
                r2.f78206e = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: dz0.C31632d.C31634b.<init>(iy0.f1, ue1.l):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m93769k(C43075l lVar, CardInsuranceStatusUiModel cardInsuranceStatusUiModel, View view) {
            C41536l.m120489i(lVar, "$it");
            C41536l.m120489i(cardInsuranceStatusUiModel, "$this_with");
            lVar.invoke(Long.valueOf(cardInsuranceStatusUiModel.mo82055a()));
        }

        /* renamed from: j */
        public void mo72072h(CardInsuranceStatusUiModel cardInsuranceStatusUiModel) {
            CardInsuranceStatusUiModel cardInsuranceStatusUiModel2 = cardInsuranceStatusUiModel;
            C41536l.m120489i(cardInsuranceStatusUiModel2, "item");
            CreditCardWidgetBannerView c = this.f78205d.mo3946b();
            C18917a aVar = r3;
            C18917a aVar2 = new C18917a(cardInsuranceStatusUiModel.mo82055a(), cardInsuranceStatusUiModel.mo82056b(), C34645a.m101746a(cardInsuranceStatusUiModel.mo82061f()), "", false, (String) null, false, false, false, cardInsuranceStatusUiModel.mo82059e(), C32343x.m95388F(cardInsuranceStatusUiModel.mo82062g().mo72343g(), new Object[0]), Integer.valueOf(C0767a.m2893c(this.f78205d.mo3946b().getContext(), cardInsuranceStatusUiModel.mo82062g().mo72342f())), 448, (DefaultConstructorMarker) null);
            c.setInfoData(aVar);
            C43075l lVar = this.f78206e;
            if (lVar != null) {
                this.f78205d.mo3946b().setOnClickListener(new C31636e(lVar, cardInsuranceStatusUiModel2));
            }
        }
    }

    /* renamed from: dz0.d$c */
    public static abstract class C31635c extends RecyclerView.C1734f0 {
        public /* synthetic */ C31635c(View view, DefaultConstructorMarker defaultConstructorMarker) {
            this(view);
        }

        /* renamed from: h */
        public abstract void mo72072h(CardInsuranceStatusAdapterItem cardInsuranceStatusAdapterItem);

        private C31635c(View view) {
            super(view);
        }
    }

    public C31632d(C43075l lVar) {
        super(C17963d.f51158a.mo45633d());
        this.f78203f = lVar;
    }

    public int getItemViewType(int i) {
        CardInsuranceStatusAdapterItem cardInsuranceStatusAdapterItem = (CardInsuranceStatusAdapterItem) mo6027g(i);
        if (cardInsuranceStatusAdapterItem instanceof OverallCardInsuranceStatusHeader) {
            return C36272f.item_card_insurance_overall_header;
        }
        if (cardInsuranceStatusAdapterItem instanceof CardInsuranceStatusUiModel) {
            return C36272f.item_card_insurance_status;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: k */
    public void onBindViewHolder(C31635c cVar, int i) {
        C41536l.m120489i(cVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        cVar.mo72072h((CardInsuranceStatusAdapterItem) g);
    }

    /* renamed from: l */
    public C31635c onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == C36272f.item_card_insurance_overall_header) {
            C36592e1 d = C36592e1.m108495d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …, false\n                )");
            return new C31633a(d);
        }
        C36595f1 d2 = C36595f1.m108507d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d2, "inflate(\n               …, false\n                )");
        return new C31634b(d2, this.f78203f);
    }
}

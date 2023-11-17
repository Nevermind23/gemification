package y10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32303f;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditOfferRefinanceUiModel;
import p341ge.bog.mobilebank.p975ui.views.widgets.CustomViewWithCheckbox;
import p366bk.C10322k;
import p366bk.C10324m;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: y10.a */
public final class C29885a extends RecyclerView.C1736h {

    /* renamed from: f */
    public static final C29886a f75610f = new C29886a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C43079p f75611d;

    /* renamed from: e */
    private List f75612e = C41341q.m119907j();

    /* renamed from: y10.a$a */
    public static final class C29886a {
        private C29886a() {
        }

        public /* synthetic */ C29886a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: y10.a$b */
    public final class C29887b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final CustomViewWithCheckbox f75613d;

        /* renamed from: e */
        final /* synthetic */ C29885a f75614e;

        /* renamed from: y10.a$b$a */
        static final class C29888a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C29885a f75615d;

            /* renamed from: e */
            final /* synthetic */ C29887b f75616e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C29888a(C29885a aVar, C29887b bVar) {
                super(1);
                this.f75615d = aVar;
                this.f75616e = bVar;
            }

            /* renamed from: a */
            public final Boolean mo70163a(boolean z) {
                C43079p f = this.f75615d.mo70157f();
                return Boolean.valueOf(f != null ? ((Boolean) f.invoke(Integer.valueOf(this.f75616e.getAdapterPosition()), Boolean.valueOf(z))).booleanValue() : true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return mo70163a(((Boolean) obj).booleanValue());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29887b(C29885a aVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f75614e = aVar;
            View findViewById = view.findViewById(C10322k.refinance_info);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.refinance_info)");
            CustomViewWithCheckbox customViewWithCheckbox = (CustomViewWithCheckbox) findViewById;
            this.f75613d = customViewWithCheckbox;
            customViewWithCheckbox.setOnCheckedListener(new C29888a(aVar, this));
        }

        /* renamed from: h */
        public final void mo70162h(CreditOfferRefinanceUiModel creditOfferRefinanceUiModel) {
            int i;
            C41536l.m120489i(creditOfferRefinanceUiModel, "refinanceItem");
            C29885a aVar = this.f75614e;
            this.f75613d.setTitleText(creditOfferRefinanceUiModel.mo54089p());
            CustomViewWithCheckbox customViewWithCheckbox = this.f75613d;
            String k = C32303f.m95200k(Double.parseDouble(creditOfferRefinanceUiModel.mo54080f()), creditOfferRefinanceUiModel.mo54081g());
            C41536l.m120488h(k, "getFormattedAmount(produ…t.toDouble(), productCcy)");
            customViewWithCheckbox.setAmountText(k);
            CustomViewWithCheckbox customViewWithCheckbox2 = this.f75613d;
            String j = creditOfferRefinanceUiModel.mo54085j();
            if (j == null) {
                j = "BOG";
            }
            customViewWithCheckbox2.setSubTitleText(j);
            this.f75613d.setChecked(creditOfferRefinanceUiModel.mo54096v());
            this.f75613d.setActive(!creditOfferRefinanceUiModel.mo54099x());
            View view = this.f75613d.getBinding().f68835e;
            if (getAdapterPosition() == aVar.getItemCount() - 1) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: f */
    public final C43079p mo70157f() {
        return this.f75611d;
    }

    /* renamed from: g */
    public void onBindViewHolder(C29887b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        bVar.mo70162h((CreditOfferRefinanceUiModel) this.f75612e.get(i));
    }

    public int getItemCount() {
        return this.f75612e.size();
    }

    /* renamed from: h */
    public C29887b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.item_refinance_info, viewGroup, false);
        C41536l.m120488h(inflate, "view");
        return new C29887b(this, inflate);
    }

    /* renamed from: i */
    public final void mo70160i(List list) {
        C41536l.m120489i(list, "refinanceInfo");
        this.f75612e = list;
        notifyDataSetChanged();
    }

    /* renamed from: j */
    public final void mo70161j(C43079p pVar) {
        this.f75611d = pVar;
    }
}

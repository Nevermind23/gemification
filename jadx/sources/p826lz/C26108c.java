package p826lz;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.currencybadge.CurrencyBadgeView;
import p341ge.bog.designsystem.components.currencycardextended.CurrencyCardExtendedView;
import p341ge.bog.mobilebank.model.CcyRate;
import p366bk.C10324m;
import p90.C27310g6;
import r90.C27950a;

/* renamed from: lz.c */
public final class C26108c extends RecyclerView.C1736h {

    /* renamed from: d */
    private ArrayList f66224d = new ArrayList();

    /* renamed from: lz.c$a */
    public static final class C26109a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final View f66225d;

        /* renamed from: e */
        private final C27310g6 f66226e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26109a(View view) {
            super(view);
            C41536l.m120489i(view, "view");
            this.f66225d = view;
            C27310g6 a = C27310g6.m84549a(view);
            C41536l.m120488h(a, "bind(view)");
            this.f66226e = a;
        }

        /* renamed from: h */
        public final void mo65026h(CcyRate ccyRate) {
            C41536l.m120489i(ccyRate, "data");
            this.f66226e.f68825e.setAdditionalRate(ccyRate.getMidBuyRate().floatValue());
            this.f66226e.f68825e.setRate(ccyRate.getCurrentRate().floatValue());
            this.f66226e.f68825e.setBuyRate(ccyRate.getDgtlBuyRate().floatValue());
            this.f66226e.f68825e.setSellRate(ccyRate.getDgtlSellRate().floatValue());
            CurrencyCardExtendedView currencyCardExtendedView = this.f66226e.f68825e;
            int rateWeight = ccyRate.getRateWeight();
            String c = C27950a.m86286c(ccyRate.getDictionaryKey(), false);
            currencyCardExtendedView.setCurrencyName(rateWeight + " " + c);
            CurrencyBadgeView currencyBadge = this.f66226e.f68825e.getCurrencyBadge();
            float floatValue = ccyRate.getDifference().floatValue();
            CurrencyBadgeView.C13285b bVar = CurrencyBadgeView.C13285b.REGULAR;
            String ccy = ccyRate.getCcy();
            C41536l.m120488h(ccy, "data.ccy");
            currencyBadge.setBadge(new CurrencyBadgeView.C13284a(floatValue, bVar, ccy));
            this.f66226e.f68825e.getRateChangeBadge().setRateChange(ccyRate.getDifference().floatValue());
        }
    }

    /* renamed from: f */
    public void onBindViewHolder(C26109a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object obj = this.f66224d.get(i);
        C41536l.m120488h(obj, "data[position]");
        aVar.mo65026h((CcyRate) obj);
    }

    /* renamed from: g */
    public C26109a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.item_remmitance_rate, viewGroup, false);
        C41536l.m120488h(inflate, "v");
        return new C26109a(inflate);
    }

    public int getItemCount() {
        return this.f66224d.size();
    }

    /* renamed from: h */
    public final void mo65025h(ArrayList arrayList) {
        C41536l.m120489i(arrayList, "data");
        this.f66224d = arrayList;
        notifyDataSetChanged();
    }
}

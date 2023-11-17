package j30;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32314k;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import l81.C37107d;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p341ge.bog.mobilebank.cleanarch.presentation.offer.model.CreditOfferLimitUiModel;
import p366bk.C10320i;
import p366bk.C10324m;
import p90.C27432t7;

/* renamed from: j30.b */
public final class C25319b extends RecyclerView.C1736h {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C25321b f64981d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List f64982e = C41341q.m119907j();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public OfferInfo f64983f;

    /* renamed from: j30.b$a */
    public final class C25320a extends C37107d {

        /* renamed from: f */
        private final C27432t7 f64984f;

        /* renamed from: g */
        private final DecimalFormat f64985g = new DecimalFormat("###,##0.00", new DecimalFormatSymbols(Locale.US));

        /* renamed from: h */
        final /* synthetic */ C25319b f64986h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25320a(C25319b bVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f64986h = bVar;
            C27432t7 a = C27432t7.m85036a(view);
            C41536l.m120488h(a, "bind(itemView)");
            this.f64984f = a;
            view.setOnClickListener(new C25318a(bVar, this));
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m80482j(C25319b bVar, C25320a aVar, View view) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(aVar, "this$1");
            CreditOfferLimitUiModel creditOfferLimitUiModel = (CreditOfferLimitUiModel) bVar.f64982e.get(aVar.getAdapterPosition());
            C25321b g = bVar.f64981d;
            if (g != null) {
                OfferInfo h = bVar.f64983f;
                if (h == null) {
                    C41536l.m120506z("offerInfo");
                    h = null;
                }
                g.mo63627a(creditOfferLimitUiModel, h.getOfferNo());
            }
        }

        /* renamed from: k */
        public final void mo63888k(CreditOfferLimitUiModel creditOfferLimitUiModel) {
            C41536l.m120489i(creditOfferLimitUiModel, "offerLimit");
            this.f64984f.f69857h.setImageResource(C10320i.ic_offer_credit_card);
            this.f64984f.f69861l.setText(creditOfferLimitUiModel.mo54634f());
            AppCompatTextView appCompatTextView = this.f64984f.f69856g;
            C41524c0 c0Var = C41524c0.f97701a;
            String format = String.format("%s %s", Arrays.copyOf(new Object[]{this.f64985g.format(new BigDecimal(creditOfferLimitUiModel.mo54629b())), C32314k.m95245a(creditOfferLimitUiModel.mo54628a())}, 2));
            C41536l.m120488h(format, "format(format, *args)");
            appCompatTextView.setText(format);
            AppCompatTextView appCompatTextView2 = this.f64984f.f69854e;
            OfferInfo h = this.f64986h.f64983f;
            if (h == null) {
                C41536l.m120506z("offerInfo");
                h = null;
            }
            String effectiveInterestRate = h.getEffectiveInterestRate();
            appCompatTextView2.setText(effectiveInterestRate + "%");
        }
    }

    /* renamed from: j30.b$b */
    public interface C25321b {
        /* renamed from: a */
        void mo63627a(CreditOfferLimitUiModel creditOfferLimitUiModel, String str);
    }

    public int getItemCount() {
        return this.f64982e.size();
    }

    /* renamed from: i */
    public void onBindViewHolder(C25320a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        aVar.mo63888k((CreditOfferLimitUiModel) this.f64982e.get(i));
    }

    /* renamed from: j */
    public C25320a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.offer_list_item, viewGroup, false);
        C41536l.m120488h(inflate, "v");
        return new C25320a(this, inflate);
    }

    /* renamed from: k */
    public final void mo63886k(OfferInfo offerInfo, List list) {
        C41536l.m120489i(offerInfo, "offerInfo");
        C41536l.m120489i(list, "creditOffers");
        this.f64983f = offerInfo;
        this.f64982e = list;
        notifyDataSetChanged();
    }

    /* renamed from: l */
    public final void mo63887l(C25321b bVar) {
        C41536l.m120489i(bVar, "listener");
        this.f64981d = bVar;
    }
}

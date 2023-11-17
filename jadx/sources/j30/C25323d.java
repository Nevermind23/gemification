package j30;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32303f;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import l81.C37107d;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p341ge.bog.mobilebank.cleanarch.presentation.offer.model.LoanOfferLimitUiModel;
import p366bk.C10320i;
import p366bk.C10324m;
import p90.C27432t7;

/* renamed from: j30.d */
public final class C25323d extends RecyclerView.C1736h {

    /* renamed from: d */
    private OfferInfo f64989d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ArrayList f64990e = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C25325b f64991f;

    /* renamed from: j30.d$a */
    public final class C25324a extends C37107d {

        /* renamed from: f */
        private final C27432t7 f64992f;

        /* renamed from: g */
        final /* synthetic */ C25323d f64993g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25324a(C25323d dVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f64993g = dVar;
            C27432t7 a = C27432t7.m85036a(view);
            C41536l.m120488h(a, "bind(itemView)");
            this.f64992f = a;
            view.setOnClickListener(new C25322c(dVar, this));
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m80492j(C25323d dVar, C25324a aVar, View view) {
            C41536l.m120489i(dVar, "this$0");
            C41536l.m120489i(aVar, "this$1");
            C25325b f = dVar.f64991f;
            if (f != null) {
                Object obj = dVar.f64990e.get(aVar.getAdapterPosition());
                C41536l.m120488h(obj, "loanOffers[adapterPosition]");
                f.mo54602a((LoanOfferLimitUiModel) obj);
            }
        }

        /* renamed from: k */
        public final void mo63894k(LoanOfferLimitUiModel loanOfferLimitUiModel, String str) {
            C41536l.m120489i(loanOfferLimitUiModel, "loan");
            C41536l.m120489i(str, "effectiveRateAmount");
            this.f64992f.f69857h.setImageResource(C10320i.ic_sms_loan_offer);
            this.f64992f.f69861l.setText(loanOfferLimitUiModel.mo54649g());
            this.f64992f.f69856g.setText(C32303f.m95203n(loanOfferLimitUiModel.mo54643b(), loanOfferLimitUiModel.mo54644d()));
            AppCompatTextView appCompatTextView = this.f64992f.f69854e;
            appCompatTextView.setText(str + "%");
        }
    }

    /* renamed from: j30.d$b */
    public interface C25325b {
        /* renamed from: a */
        void mo54602a(LoanOfferLimitUiModel loanOfferLimitUiModel);
    }

    public int getItemCount() {
        return this.f64990e.size();
    }

    /* renamed from: h */
    public final void mo63890h(OfferInfo offerInfo, ArrayList arrayList) {
        C41536l.m120489i(offerInfo, "offer");
        C41536l.m120489i(arrayList, "loanOffers");
        this.f64989d = offerInfo;
        this.f64990e = arrayList;
        notifyDataSetChanged();
    }

    /* renamed from: i */
    public void onBindViewHolder(C25324a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object obj = this.f64990e.get(i);
        C41536l.m120488h(obj, "loanOffers[position]");
        LoanOfferLimitUiModel loanOfferLimitUiModel = (LoanOfferLimitUiModel) obj;
        OfferInfo offerInfo = this.f64989d;
        if (offerInfo == null) {
            C41536l.m120506z("offer");
            offerInfo = null;
        }
        aVar.mo63894k(loanOfferLimitUiModel, offerInfo.getEffectiveInterestRate());
    }

    /* renamed from: j */
    public C25324a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.offer_list_item, viewGroup, false);
        C41536l.m120488h(inflate, "v");
        return new C25324a(this, inflate);
    }

    /* renamed from: k */
    public final void mo63893k(C25325b bVar) {
        C41536l.m120489i(bVar, "listener");
        this.f64991f = bVar;
    }
}

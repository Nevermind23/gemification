package p341ge.bog.mobilebank.cleanarch.presentation.offer.activity;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import he1.C41212c;
import he1.C41217g;
import iu0.C36546y;
import j30.C25323d;
import java.util.ArrayList;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p341ge.bog.mobilebank.cleanarch.presentation.offer.model.LoanOfferLimitUiModel;
import p341ge.bog.mobilebank.p975ui.activities.offers.ExpressLoanDetailsActivity;
import p366bk.C10322k;
import p366bk.C10324m;
import p380ck.C10463g;
import p852ov.C27088c;
import p90.C27470y0;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.LoanOfferListActivity */
public final class LoanOfferListActivity extends C30772sa {

    /* renamed from: J */
    public static final C21959a f58461J = new C21959a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C25323d f58462F = new C25323d();

    /* renamed from: G */
    private final C41217g f58463G = C41219i.m119470b(new C21961c(this));

    /* renamed from: H */
    private final C41217g f58464H = C41219i.m119470b(new C21960b(this));

    /* renamed from: I */
    private C27470y0 f58465I;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.LoanOfferListActivity$a */
    public static final class C21959a {
        private C21959a() {
        }

        public /* synthetic */ C21959a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo54599a(Context context, OfferInfo offerInfo, ArrayList arrayList) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(offerInfo, "offer");
            C41536l.m120489i(arrayList, "loanOffers");
            Intent intent = new Intent(context, LoanOfferListActivity.class);
            intent.putExtra("OFFER_INFO", offerInfo);
            intent.putParcelableArrayListExtra("LOAN_OFFERS", arrayList);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.LoanOfferListActivity$b */
    static final class C21960b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LoanOfferListActivity f58466d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21960b(LoanOfferListActivity loanOfferListActivity) {
            super(0);
            this.f58466d = loanOfferListActivity;
        }

        /* renamed from: b */
        public final ArrayList invoke() {
            ArrayList parcelableArrayListExtra = this.f58466d.getIntent().getParcelableArrayListExtra("LOAN_OFFERS");
            C41536l.m120486f(parcelableArrayListExtra);
            return parcelableArrayListExtra;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.LoanOfferListActivity$c */
    static final class C21961c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LoanOfferListActivity f58467d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21961c(LoanOfferListActivity loanOfferListActivity) {
            super(0);
            this.f58467d = loanOfferListActivity;
        }

        /* renamed from: b */
        public final OfferInfo invoke() {
            Parcelable parcelableExtra = this.f58467d.getIntent().getParcelableExtra("OFFER_INFO");
            C41536l.m120486f(parcelableExtra);
            return (OfferInfo) parcelableExtra;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.LoanOfferListActivity$d */
    /* synthetic */ class C21962d implements C25323d.C25325b, C41532h {
        C21962d() {
        }

        /* renamed from: a */
        public final void mo54602a(LoanOfferLimitUiModel loanOfferLimitUiModel) {
            C41536l.m120489i(loanOfferLimitUiModel, "p0");
            LoanOfferListActivity.this.m71096H2(loanOfferLimitUiModel);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C25323d.C25325b) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return new C41535k(1, LoanOfferListActivity.this, LoanOfferListActivity.class, "onLoanClick", "onLoanClick(Lge/bog/mobilebank/cleanarch/presentation/offer/model/LoanOfferLimitUiModel;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: F2 */
    private final ArrayList m71094F2() {
        Object value = this.f58464H.getValue();
        C41536l.m120488h(value, "<get-loanOffers>(...)");
        return (ArrayList) value;
    }

    /* renamed from: G2 */
    private final OfferInfo m71095G2() {
        return (OfferInfo) this.f58463G.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public final void m71096H2(LoanOfferLimitUiModel loanOfferLimitUiModel) {
        C10463g F = C36546y.m108282F();
        OfferProductCode f = loanOfferLimitUiModel.mo54648f();
        C27088c e = loanOfferLimitUiModel.mo54646e();
        F.mo27152s("offers", f + "_" + e, "choose_offer_subtype");
        if (C41536l.m120484d(m71095G2().getProductCode(), OfferProductCode.C21012EL.f56473f)) {
            ExpressLoanDetailsActivity.f85735W.mo86474a(this, m71095G2().getOfferNo(), loanOfferLimitUiModel.mo54646e().mo66359b(), m71095G2().getProductCode().mo51954a(), loanOfferLimitUiModel.mo54649g());
        } else {
            ConsumerLoanDetailsActivity.C20880b.m67696b(ConsumerLoanDetailsActivity.f56186o0, this, m71095G2().getOfferNo(), loanOfferLimitUiModel.mo54646e(), m71095G2().getProductCode(), loanOfferLimitUiModel.mo54649g(), (String) null, 32, (Object) null);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_offer_list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        C27470y0 a = C27470y0.m85185a(findViewById(C10322k.f28864lt));
        C41536l.m120488h(a, "bind(findViewById(R.id.root))");
        this.f58465I = a;
        C27470y0 y0Var = null;
        if (a == null) {
            C41536l.m120506z("binding");
            a = null;
        }
        a.f70247f.setText(m71095G2().getProductName());
        C27470y0 y0Var2 = this.f58465I;
        if (y0Var2 == null) {
            C41536l.m120506z("binding");
            y0Var2 = null;
        }
        y0Var2.f70248g.setLayoutManager(new LinearLayoutManager(this));
        C27470y0 y0Var3 = this.f58465I;
        if (y0Var3 == null) {
            C41536l.m120506z("binding");
        } else {
            y0Var = y0Var3;
        }
        y0Var.f70248g.setAdapter(this.f58462F);
        this.f58462F.mo63893k(new C21962d());
        this.f58462F.mo63890h(m71095G2(), m71094F2());
    }
}

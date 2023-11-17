package p341ge.bog.mobilebank.cleanarch.presentation.offer.activity;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import he1.C41217g;
import i30.C25112a;
import iu0.C36546y;
import j30.C25319b;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.offer.model.CreditOfferLimitUiModel;
import p366bk.C10324m;
import p366bk.C10328q;
import p380ck.C10463g;
import p90.C27470y0;
import p913uu.C28942h;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.CreditOfferListActivity */
public final class CreditOfferListActivity extends C30772sa {

    /* renamed from: J */
    public static final C21954a f58451J = new C21954a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private C25319b f58452F = new C25319b();

    /* renamed from: G */
    private final C41217g f58453G = C41219i.m119470b(new C21958e(this));

    /* renamed from: H */
    private final C41217g f58454H = C41219i.m119470b(new C21957d(this));

    /* renamed from: I */
    private final C41217g f58455I = C41219i.m119470b(new C21956c(this));

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.CreditOfferListActivity$a */
    public static final class C21954a {
        private C21954a() {
        }

        public /* synthetic */ C21954a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final boolean m71087a(OfferInfo offerInfo) {
            return offerInfo != null && (C41536l.m120484d(offerInfo.getProductCode(), OfferProductCode.C21000AC.f56467f) || C41536l.m120484d(offerInfo.getProductCode(), OfferProductCode.C21010EC.f56472f));
        }

        /* renamed from: b */
        public final void mo54595b(Context context, OfferInfo offerInfo, ArrayList arrayList) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(offerInfo, "offerInfo");
            C41536l.m120489i(arrayList, "creditOffers");
            if (m71087a(offerInfo)) {
                Intent intent = new Intent(context, CreditOfferListActivity.class);
                intent.putExtra("OFFER_INFO", offerInfo);
                intent.putParcelableArrayListExtra("CREDIT_OFFERS", arrayList);
                context.startActivity(intent);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.CreditOfferListActivity$b */
    public final class C21955b extends RecyclerView.C1746o {

        /* renamed from: a */
        private final int f58456a = C32343x.m95394I(4);

        public C21955b() {
        }

        /* renamed from: e */
        public void mo5615e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
            C41536l.m120489i(rect, "outRect");
            C41536l.m120489i(view, "view");
            C41536l.m120489i(recyclerView, "parent");
            C41536l.m120489i(b0Var, "state");
            super.mo5615e(rect, view, recyclerView, b0Var);
            int i = this.f58456a;
            rect.top = i;
            rect.bottom = i;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.CreditOfferListActivity$c */
    static final class C21956c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CreditOfferListActivity f58458d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21956c(CreditOfferListActivity creditOfferListActivity) {
            super(0);
            this.f58458d = creditOfferListActivity;
        }

        /* renamed from: b */
        public final C27470y0 invoke() {
            return C27470y0.m85186d(this.f58458d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.CreditOfferListActivity$d */
    static final class C21957d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CreditOfferListActivity f58459d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21957d(CreditOfferListActivity creditOfferListActivity) {
            super(0);
            this.f58459d = creditOfferListActivity;
        }

        /* renamed from: b */
        public final ArrayList invoke() {
            ArrayList parcelableArrayListExtra = this.f58459d.getIntent().getParcelableArrayListExtra("CREDIT_OFFERS");
            C41536l.m120486f(parcelableArrayListExtra);
            return parcelableArrayListExtra;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.CreditOfferListActivity$e */
    static final class C21958e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CreditOfferListActivity f58460d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21958e(CreditOfferListActivity creditOfferListActivity) {
            super(0);
            this.f58460d = creditOfferListActivity;
        }

        /* renamed from: b */
        public final OfferInfo invoke() {
            return (OfferInfo) this.f58460d.getIntent().getParcelableExtra("OFFER_INFO");
        }
    }

    /* renamed from: F2 */
    private final C27470y0 m71079F2() {
        return (C27470y0) this.f58455I.getValue();
    }

    /* renamed from: G2 */
    private final ArrayList m71080G2() {
        Object value = this.f58454H.getValue();
        C41536l.m120488h(value, "<get-creditOffers>(...)");
        return (ArrayList) value;
    }

    /* renamed from: H2 */
    private final OfferInfo m71081H2() {
        return (OfferInfo) this.f58453G.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public static final void m71082I2(CreditOfferListActivity creditOfferListActivity, CreditOfferLimitUiModel creditOfferLimitUiModel, String str) {
        C41536l.m120489i(creditOfferListActivity, "this$0");
        C41536l.m120489i(creditOfferLimitUiModel, "card");
        C41536l.m120489i(str, "offerNo");
        creditOfferListActivity.m71083J2(creditOfferLimitUiModel);
        CreditOfferApplicationActivity.f57807L.mo54011a(creditOfferListActivity, creditOfferLimitUiModel, str);
        creditOfferListActivity.finish();
    }

    /* renamed from: J2 */
    private final void m71083J2(CreditOfferLimitUiModel creditOfferLimitUiModel) {
        C10463g F = C36546y.m108282F();
        OfferProductCode d = creditOfferLimitUiModel.mo54630d();
        C28942h e = creditOfferLimitUiModel.mo54632e();
        F.mo27152s("offers", d + "_" + e, "choose_offer_subtype");
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_offer_list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo70996D2(bundle, m71079F2());
        m71079F2().f70248g.setLayoutManager(new LinearLayoutManager(this));
        m71079F2().f70248g.mo5351j(new C21955b());
        m71079F2().f70248g.setAdapter(this.f58452F);
        this.f58452F.mo63887l(new C25112a(this));
        C25319b bVar = this.f58452F;
        OfferInfo H2 = m71081H2();
        C41536l.m120486f(H2);
        bVar.mo63886k(H2, m71080G2());
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.f28952b5);
        C41536l.m120488h(string, "getString(R.string.header_text_credit_cards)");
        return string;
    }
}

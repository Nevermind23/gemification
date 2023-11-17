package f00;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import com.bumptech.glide.C2396k;
import g00.C20588a;
import g91.C32289b0;
import g91.C32319m;
import g91.C32335t0;
import g91.C32343x;
import h00.C24842a;
import h00.C24844b;
import h00.C24846c;
import h91.C36162a;
import i10.C25100c;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k81.C36917q;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l81.C37107d;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p341ge.bog.mobilebank.cleanarch.application.presentation.activity.ApplicationDetailsActivity;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.ApplicationsHistoryActivity;
import p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.model.CreditAppLoanDetails;
import p341ge.bog.mobilebank.cleanarch.presentation.productconfirmation.activity.ProductConfirmationActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.productconfirmation.model.PendingProductConfirmationData;
import p341ge.bog.mobilebank.model.Application;
import p341ge.bog.mobilebank.model.CardApplicationDetails;
import p341ge.bog.mobilebank.model.deposits.DepositAppDetails;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p380ck.C10463g;
import p380ck.C10464h;
import p642vh.C18358g;
import p709au.C19277a;
import p90.C27336j2;
import x00.C29615f;

/* renamed from: f00.g */
public final class C20317g extends C29615f {

    /* renamed from: m */
    public static final C20320c f55246m = new C20320c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public List f55247f = C41341q.m119907j();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public List f55248g = C41341q.m119907j();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public List f55249h = C41341q.m119907j();

    /* renamed from: i */
    private List f55250i = C41341q.m119907j();

    /* renamed from: j */
    private List f55251j = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C20323f f55252k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C20324g f55253l;

    /* renamed from: f00.g$a */
    public final class C20318a extends C37107d {

        /* renamed from: f */
        private final C27336j2 f55254f;

        /* renamed from: g */
        final /* synthetic */ C20317g f55255g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20318a(C20317g gVar, C27336j2 j2Var) {
            super(j2Var.mo3946b());
            C41536l.m120489i(j2Var, "binding");
            this.f55255g = gVar;
            this.f55254f = j2Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public static final void m66378n(C20317g gVar, C20318a aVar, Application application, View view) {
            C41536l.m120489i(gVar, "this$0");
            C41536l.m120489i(aVar, "this$1");
            C41536l.m120489i(application, "$app");
            aVar.m66382r(((Application) gVar.f55247f.get(gVar.mo69515m(aVar.getAdapterPosition()))).getAppType());
            C20323f H = gVar.f55252k;
            if (H != null) {
                H.mo48804a(application);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public static final void m66379o(C20317g gVar, C20318a aVar, Application application, View view) {
            C41536l.m120489i(gVar, "this$0");
            C41536l.m120489i(aVar, "this$1");
            C41536l.m120489i(application, "$app");
            aVar.m66382r(((Application) gVar.f55247f.get(gVar.mo69515m(aVar.getAdapterPosition()))).getAppType());
            C20323f H = gVar.f55252k;
            if (H != null) {
                H.mo48804a(application);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public static final void m66380p(C20317g gVar, C20318a aVar, View view) {
            C41536l.m120489i(gVar, "this$0");
            C41536l.m120489i(aVar, "this$1");
            Application application = (Application) gVar.f55247f.get(gVar.mo69515m(aVar.getAdapterPosition()));
            aVar.m66382r(application.getAppType());
            ApplicationDetailsActivity.C20801a aVar2 = ApplicationDetailsActivity.f56053J;
            View view2 = aVar.f89287d;
            C41536l.m120488h(view2, "itemView");
            Activity a = C25100c.m80062a(view2);
            C41536l.m120486f(a);
            aVar2.mo49468a(a, application);
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public static final void m66381q(C20317g gVar, C20318a aVar, View view) {
            C41536l.m120489i(gVar, "this$0");
            C41536l.m120489i(aVar, "this$1");
            Application application = (Application) gVar.f55247f.get(gVar.mo69515m(aVar.getAdapterPosition()));
            aVar.m66382r(application.getAppType());
            ApplicationDetailsActivity.C20801a aVar2 = ApplicationDetailsActivity.f56053J;
            View view2 = aVar.f89287d;
            C41536l.m120488h(view2, "itemView");
            Activity a = C25100c.m80062a(view2);
            C41536l.m120486f(a);
            aVar2.mo49468a(a, application);
        }

        /* renamed from: r */
        private final void m66382r(String str) {
            String str2;
            if (C41536l.m120484d(str, C24842a.DEBIT_CARD.mo63277b())) {
                str2 = "DEBIT_CARD";
            } else {
                str2 = "DEPOSIT";
            }
            C36546y.m108282F().mo27152s("applications", str2, "open_current_application");
        }

        /* renamed from: m */
        public final void mo48800m(Application application) {
            String str;
            String e;
            String str2;
            String d;
            CreditAppLoanDetails loanDetails;
            BigDecimal a;
            String P;
            String e2;
            String str3;
            String str4;
            Long maturityDate;
            BigDecimal agreeAmount;
            List<DepositAppDetails.ContractDetail> list;
            DepositAppDetails.ContractDetail contractDetail;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String d2;
            String str12;
            String str13;
            String str14;
            Application application2 = application;
            C41536l.m120489i(application2, "app");
            Context context = this.f89287d.getContext();
            AppCompatTextView appCompatTextView = this.f55254f.f69052p;
            C41536l.m120488h(appCompatTextView, "binding.rightInfoBlockValueText");
            C32343x.m95447f1(appCompatTextView);
            AppCompatTextView appCompatTextView2 = this.f55254f.f69051o;
            C41536l.m120488h(appCompatTextView2, "binding.rightInfoBlockHeaderText");
            C32343x.m95447f1(appCompatTextView2);
            TextView textView = this.f55254f.f69042f;
            C41536l.m120488h(textView, "binding.applicationInfo");
            C32343x.m95455i0(textView);
            ImageView imageView = this.f55254f.f69041e;
            String str15 = null;
            imageView.setBackground((Drawable) null);
            imageView.clearColorFilter();
            imageView.setPadding(0, 0, 0, 0);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            C41536l.m120487g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = -2;
            marginLayoutParams.height = -2;
            String appType = application.getAppType();
            if (C41536l.m120484d(appType, C24842a.DEBIT_CARD.mo63277b())) {
                CardApplicationDetails cardDetails = application.getCardDetails();
                if (cardDetails != null) {
                    str6 = cardDetails.cardClass;
                } else {
                    str6 = null;
                }
                if (cardDetails != null) {
                    str7 = cardDetails.cardType;
                } else {
                    str7 = null;
                }
                String str16 = str6 + str7;
                if (cardDetails != null) {
                    str8 = cardDetails.subProductCode;
                } else {
                    str8 = null;
                }
                if (str8 != null) {
                    str16 = str8;
                }
                this.f55254f.f69041e.setImageResource(C19277a.m64732b(str16, 0, 2, (Object) null));
                AppCompatTextView appCompatTextView3 = this.f55254f.f69044h;
                if (cardDetails == null || (str14 = cardDetails.subProductDictionaryKey) == null) {
                    str9 = null;
                } else {
                    str9 = C32343x.m95388F(str14, new Object[0]);
                }
                appCompatTextView3.setText(str9);
                TextBadgeView textBadgeView = this.f55254f.f69043g;
                if (cardDetails == null || (str13 = cardDetails.cardStatusKey) == null || (str10 = C32343x.m95388F(str13, new Object[0])) == null) {
                    if (cardDetails == null || (str12 = cardDetails.statusDescKey) == null) {
                        str10 = null;
                    } else {
                        str10 = C32343x.m95388F(str12, new Object[0]);
                    }
                }
                textBadgeView.setBadgeText(str10);
                this.f55254f.f69043g.setBackgroundTintColor(C18358g.m62729c(C24844b.m79503a(application)));
                this.f55254f.f69049m.setText(context.getString(C10328q.validity_period));
                AppCompatTextView appCompatTextView4 = this.f55254f.f69050n;
                Long expDate = application.getExpDate();
                if (expDate != null && (d2 = C32319m.m95297d(expDate.longValue(), "dd.MM.yyyy")) != null) {
                    str15 = d2;
                } else if (!(cardDetails == null || (str11 = cardDetails.dictionaryKey) == null)) {
                    str15 = C32343x.m95388F(str11, new Object[0]);
                }
                appCompatTextView4.setText(str15);
                AppCompatTextView appCompatTextView5 = this.f55254f.f69051o;
                C41536l.m120488h(appCompatTextView5, "binding.rightInfoBlockHeaderText");
                C32343x.m95455i0(appCompatTextView5);
                AppCompatTextView appCompatTextView6 = this.f55254f.f69052p;
                C41536l.m120488h(appCompatTextView6, "binding.rightInfoBlockValueText");
                C32343x.m95455i0(appCompatTextView6);
                this.f89287d.setOnClickListener(new C20313c(this.f55255g, this));
            } else if (C41536l.m120484d(appType, C24842a.DEPOSIT.mo63277b())) {
                DepositAppDetails depositDetails = application.getDepositDetails();
                this.f55254f.f69041e.setImageResource(C36162a.m107561b(application.getProdType()));
                this.f55254f.f69044h.setText(C32343x.m95388F(application.getDictionaryKey(), new Object[0]));
                TextBadgeView textBadgeView2 = this.f55254f.f69043g;
                if (depositDetails == null || (list = depositDetails.contractDetails) == null || (contractDetail = (DepositAppDetails.ContractDetail) C41358y.m120007W(list)) == null || (str5 = contractDetail.statusKey) == null) {
                    str3 = null;
                } else {
                    str3 = C32343x.m95388F(str5, new Object[0]);
                }
                textBadgeView2.setBadgeText(str3);
                this.f55254f.f69043g.setBackgroundTintColor(C18358g.m62729c(C24844b.m79503a(application)));
                this.f55254f.f69051o.setText(context.getString(C10328q.deposit_amount));
                AppCompatTextView appCompatTextView7 = this.f55254f.f69052p;
                if (depositDetails == null || (agreeAmount = depositDetails.getAgreeAmount()) == null) {
                    str4 = null;
                } else {
                    String ccy = depositDetails.getCcy();
                    if (ccy == null) {
                        ccy = "GEL";
                    }
                    str4 = C32343x.m95408P(agreeAmount, ccy);
                }
                appCompatTextView7.setText(str4);
                this.f55254f.f69049m.setText(context.getString(C10328q.maturity_date));
                AppCompatTextView appCompatTextView8 = this.f55254f.f69050n;
                if (!(depositDetails == null || (maturityDate = depositDetails.getMaturityDate()) == null)) {
                    str15 = C32319m.m95297d(maturityDate.longValue(), "dd.MM.yyyy");
                }
                appCompatTextView8.setText(str15);
                this.f89287d.setOnClickListener(new C20314d(this.f55255g, this));
            } else {
                String str17 = "";
                if (C41536l.m120484d(appType, C24842a.CREDIT_APPLICATION.mo63277b())) {
                    ImageView imageView2 = this.f55254f.f69041e;
                    imageView2.setBackgroundResource(C10320i.bg_offer_banner_icon);
                    imageView2.setColorFilter(C32335t0.m95357b());
                    imageView2.setPadding(C32343x.m95394I(22), C32343x.m95394I(22), C32343x.m95394I(22), C32343x.m95394I(22));
                    ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
                    C41536l.m120487g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.width = C32343x.m95394I(74);
                    marginLayoutParams2.height = C32343x.m95394I(74);
                    this.f55254f.f69041e.setImageResource(C10320i.ic_sms_loan_offer);
                    this.f55254f.f69044h.setText(C32343x.m95388F(application.getDictionaryKey(), new Object[0]));
                    this.f55254f.f69043g.setBackgroundTintColor(C18358g.m62729c(C24844b.m79503a(application)));
                    TextBadgeView textBadgeView3 = this.f55254f.f69043g;
                    CreditAppLoanDetails loanDetails2 = application.getLoanDetails();
                    if (loanDetails2 == null || (e2 = loanDetails2.mo53434e()) == null || (str2 = C32343x.m95388F(e2, new Object[0])) == null) {
                        str2 = str17;
                    }
                    textBadgeView3.setBadgeText(str2);
                    this.f55254f.f69049m.setText(C32343x.m95452h0(C10328q.application_date, new Object[0]));
                    this.f55254f.f69050n.setText(C32319m.m95297d(application.getCreateDate(), "dd.MM.yyyy"));
                    this.f55254f.f69051o.setText(context.getString(C10328q.common_text_amount));
                    AppCompatTextView appCompatTextView9 = this.f55254f.f69052p;
                    CreditAppLoanDetails loanDetails3 = application.getLoanDetails();
                    if (!(loanDetails3 == null || (d = loanDetails3.mo53432d()) == null || (loanDetails = application.getLoanDetails()) == null || (a = loanDetails.mo53430a()) == null || (P = C32343x.m95408P(a, d)) == null)) {
                        str17 = P;
                    }
                    appCompatTextView9.setText(str17);
                    this.f55254f.f69042f.setText(C32343x.m95388F("applications.credit.application.details.condition.text", new Object[0]));
                    TextView textView2 = this.f55254f.f69042f;
                    C41536l.m120488h(textView2, "binding.applicationInfo");
                    C32343x.m95483r1(textView2, C41536l.m120484d(application.getStatus(), C24846c.C.mo63280b()), false, 2, (Object) null);
                    this.f89287d.setOnClickListener(new C20315e(this.f55255g, this, application2));
                } else if (C41536l.m120484d(appType, C24842a.CREDIT_LIMIT_APP.mo63277b())) {
                    ImageView imageView3 = this.f55254f.f69041e;
                    imageView3.setBackgroundResource(C10320i.bg_offer_banner_icon);
                    imageView3.setColorFilter(C32335t0.m95357b());
                    imageView3.setPadding(C32343x.m95394I(22), C32343x.m95394I(22), C32343x.m95394I(22), C32343x.m95394I(22));
                    ViewGroup.LayoutParams layoutParams3 = imageView3.getLayoutParams();
                    C41536l.m120487g(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams3.width = C32343x.m95394I(74);
                    marginLayoutParams3.height = C32343x.m95394I(74);
                    this.f55254f.f69041e.setImageResource(C10320i.ic_sms_loan_offer);
                    this.f55254f.f69044h.setText(C32343x.m95388F(application.getDictionaryKey(), new Object[0]));
                    this.f55254f.f69043g.setBackgroundTintColor(C18358g.m62729c(C24844b.m79503a(application)));
                    TextBadgeView textBadgeView4 = this.f55254f.f69043g;
                    CreditAppLoanDetails loanDetails4 = application.getLoanDetails();
                    if (loanDetails4 == null || (e = loanDetails4.mo53434e()) == null || (str = C32343x.m95388F(e, new Object[0])) == null) {
                        str = str17;
                    }
                    textBadgeView4.setBadgeText(str);
                    this.f55254f.f69049m.setText(C32343x.m95452h0(C10328q.application_date, new Object[0]));
                    this.f55254f.f69050n.setText(C32319m.m95297d(application.getCreateDate(), "dd.MM.yyyy"));
                    this.f55254f.f69051o.setText(str17);
                    this.f55254f.f69052p.setText(str17);
                    this.f55254f.f69042f.setText(C32343x.m95388F("applications.credit.application.details.condition.text", new Object[0]));
                    TextView textView3 = this.f55254f.f69042f;
                    C41536l.m120488h(textView3, "binding.applicationInfo");
                    C32343x.m95483r1(textView3, C41536l.m120484d(application.getStatus(), C24846c.C.mo63280b()), false, 2, (Object) null);
                    this.f89287d.setOnClickListener(new C20316f(this.f55255g, this, application2));
                }
            }
        }
    }

    /* renamed from: f00.g$b */
    public final class C20319b extends C37107d {

        /* renamed from: f */
        private final CardView f55256f;

        /* renamed from: g */
        final /* synthetic */ C20317g f55257g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20319b(C20317g gVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f55257g = gVar;
            View findViewById = view.findViewById(C10322k.banner_container);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.banner_container)");
            this.f55256f = (CardView) findViewById;
        }

        /* renamed from: i */
        public final void mo48801i(C36917q qVar) {
            C41536l.m120489i(qVar, "banner");
            this.f55256f.addView(qVar.mo89824a(this.f89287d.getContext(), (ViewGroup) null));
        }
    }

    /* renamed from: f00.g$c */
    public static final class C20320c {
        private C20320c() {
        }

        public /* synthetic */ C20320c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: f00.g$d */
    public final class C20321d extends C37107d {

        /* renamed from: f */
        private final TextView f55258f;

        /* renamed from: g */
        private final TextView f55259g;

        /* renamed from: h */
        final /* synthetic */ C20317g f55260h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20321d(C20317g gVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f55260h = gVar;
            View findViewById = view.findViewById(C10322k.history_text);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.history_text)");
            TextView textView = (TextView) findViewById;
            this.f55258f = textView;
            View findViewById2 = view.findViewById(C10322k.header_title_text);
            C41536l.m120488h(findViewById2, "itemView.findViewById(R.id.header_title_text)");
            this.f55259g = (TextView) findViewById2;
            textView.setOnClickListener(new C20326h(this, view, gVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m66386j(C20321d dVar, View view, C20317g gVar, View view2) {
            C41536l.m120489i(dVar, "this$0");
            C41536l.m120489i(view, "$itemView");
            C41536l.m120489i(gVar, "this$1");
            dVar.m66387l();
            ApplicationsHistoryActivity.C21366a aVar = ApplicationsHistoryActivity.f57198I;
            Context context = view.getContext();
            C41536l.m120488h(context, "itemView.context");
            aVar.mo53393a(context, gVar.f55248g);
        }

        /* renamed from: l */
        private final void m66387l() {
            C36546y.m108282F().mo27152s("applications", "from_filled_offers", "open_application_history");
        }

        /* renamed from: k */
        public final void mo48802k() {
            Context context = this.f89287d.getContext();
            int itemViewType = this.f55260h.getItemViewType(getAdapterPosition());
            if (itemViewType == 0) {
                this.f55259g.setText(context.getString(C10328q.applications));
                this.f55258f.setText("");
                if (!this.f55260h.f55248g.isEmpty()) {
                    this.f55258f.setText(context.getString(C10328q.application_history));
                }
            } else if (itemViewType == 1) {
                this.f55259g.setText(context.getString(C10328q.offers));
                this.f55258f.setText("");
                if ((!this.f55260h.f55248g.isEmpty()) && !this.f55260h.mo69514i(0)) {
                    this.f55258f.setText(context.getString(C10328q.application_history));
                }
            } else if (itemViewType == 2) {
                this.f55259g.setText(C32343x.m95420V("offers.and.applications.product.confitmation.label", context.getString(C10328q.pending_offers_header), new Object[0]));
                this.f55258f.setText("");
                if ((!this.f55260h.f55248g.isEmpty()) && !this.f55260h.mo69514i(0) && !this.f55260h.mo69514i(1)) {
                    this.f55258f.setText(context.getString(C10328q.application_history));
                }
            }
        }
    }

    /* renamed from: f00.g$e */
    public final class C20322e extends C37107d {

        /* renamed from: f */
        private final LinearLayout f55261f;

        /* renamed from: g */
        private final TextView f55262g;

        /* renamed from: h */
        private final TextView f55263h;

        /* renamed from: i */
        private final TextView f55264i;

        /* renamed from: j */
        private final ImageView f55265j;

        /* renamed from: k */
        private final TextView f55266k;

        /* renamed from: l */
        private final TextView f55267l;

        /* renamed from: m */
        private final ImageView f55268m;

        /* renamed from: n */
        final /* synthetic */ C20317g f55269n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20322e(C20317g gVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f55269n = gVar;
            View findViewById = view.findViewById(C10322k.oval_container);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.oval_container)");
            LinearLayout linearLayout = (LinearLayout) findViewById;
            this.f55261f = linearLayout;
            View findViewById2 = view.findViewById(C10322k.product_name);
            C41536l.m120488h(findViewById2, "itemView.findViewById(R.id.product_name)");
            this.f55262g = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C10322k.offer_description);
            C41536l.m120488h(findViewById3, "itemView.findViewById(R.id.offer_description)");
            this.f55263h = (TextView) findViewById3;
            View findViewById4 = view.findViewById(C10322k.effective_rate);
            C41536l.m120488h(findViewById4, "itemView.findViewById(R.id.effective_rate)");
            this.f55264i = (TextView) findViewById4;
            View findViewById5 = view.findViewById(C10322k.offer_icon);
            C41536l.m120488h(findViewById5, "itemView.findViewById(R.id.offer_icon)");
            this.f55265j = (ImageView) findViewById5;
            View findViewById6 = view.findViewById(C10322k.percent_pre_text);
            C41536l.m120488h(findViewById6, "itemView.findViewById(R.id.percent_pre_text)");
            this.f55266k = (TextView) findViewById6;
            View findViewById7 = view.findViewById(C10322k.text_from);
            C41536l.m120488h(findViewById7, "itemView.findViewById(R.id.text_from)");
            this.f55267l = (TextView) findViewById7;
            View findViewById8 = view.findViewById(C10322k.offer_icon_bnpl);
            C41536l.m120488h(findViewById8, "itemView.findViewById(R.id.offer_icon_bnpl)");
            this.f55268m = (ImageView) findViewById8;
            C32343x.m95447f1(linearLayout);
            view.setOnClickListener(new C20327i(gVar, this));
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m66390j(C20317g gVar, C20322e eVar, View view) {
            C41536l.m120489i(gVar, "this$0");
            C41536l.m120489i(eVar, "this$1");
            OfferInfo offerInfo = (OfferInfo) gVar.f55249h.get(gVar.mo69515m(eVar.getAdapterPosition()));
            eVar.m66391l(offerInfo);
            C20324g I = gVar.f55253l;
            if (I != null) {
                I.mo48805r2(offerInfo);
            }
        }

        /* renamed from: l */
        private final void m66391l(OfferInfo offerInfo) {
            if (offerInfo.getOfferScheme() == OfferInfo.C20999b.BNPL) {
                C36546y.m108282F().mo27152s("offer_banners", "BNPL", "banner_click");
                C36546y.m108282F().mo27137H("BNPL_offer_banners_click", "", "", (Bundle) null, C10464h.C10465a.FACEBOOK);
                return;
            }
            C10463g F = C36546y.m108282F();
            String a = offerInfo.getProductCode().mo51954a();
            String operType = offerInfo.getOperType();
            F.mo27152s("offers", a + "_" + operType, "open_offer_banner_from_offers");
        }

        /* renamed from: k */
        public final void mo48803k(OfferInfo offerInfo) {
            int i;
            boolean z;
            boolean z2;
            C41536l.m120489i(offerInfo, "offer");
            View view = this.f89287d;
            this.f55262g.setText(offerInfo.getProductName());
            this.f55263h.setText(offerInfo.getOfferText());
            TextView textView = this.f55264i;
            C41524c0 c0Var = C41524c0.f97701a;
            boolean z3 = true;
            String format = String.format("%s%s", Arrays.copyOf(new Object[]{offerInfo.getEffectiveInterestRate(), "%"}, 2));
            C41536l.m120488h(format, "format(format, *args)");
            textView.setText(format);
            ImageView imageView = this.f55265j;
            Integer a = C10137b.m37077a(offerInfo.getProductCode(), offerInfo.getHasPromotion());
            if (a != null) {
                i = a.intValue();
            } else {
                i = 0;
            }
            imageView.setImageResource(i);
            TextView textView2 = this.f55267l;
            OfferInfo.C20999b offerScheme = offerInfo.getOfferScheme();
            OfferInfo.C20999b bVar = OfferInfo.C20999b.BNPL;
            if (offerScheme != bVar) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(textView2, z, false, 2, (Object) null);
            ImageView imageView2 = this.f55265j;
            if (offerInfo.getOfferScheme() != bVar) {
                z2 = true;
            } else {
                z2 = false;
            }
            C32343x.m95483r1(imageView2, z2, false, 2, (Object) null);
            ImageView imageView3 = this.f55268m;
            if (offerInfo.getOfferScheme() != bVar) {
                z3 = false;
            }
            C32343x.m95483r1(imageView3, z3, false, 2, (Object) null);
            if (offerInfo.getOfferScheme() == bVar) {
                this.f55266k.setText(view.getContext().getString(C10328q.offer_banner_effective_rate_bnpl));
            }
        }
    }

    /* renamed from: f00.g$f */
    public interface C20323f {
        /* renamed from: a */
        void mo48804a(Application application);
    }

    /* renamed from: f00.g$g */
    public interface C20324g {
        /* renamed from: r2 */
        void mo48805r2(OfferInfo offerInfo);
    }

    /* renamed from: f00.g$h */
    public final class C20325h extends C37107d {

        /* renamed from: f */
        private final TextView f55270f;

        /* renamed from: g */
        private final ImageView f55271g;

        /* renamed from: h */
        private final BogButton f55272h;

        /* renamed from: i */
        final /* synthetic */ C20317g f55273i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20325h(C20317g gVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f55273i = gVar;
            View findViewById = view.findViewById(C10322k.pending_product_confirmation_item_title_text);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.…irmation_item_title_text)");
            this.f55270f = (TextView) findViewById;
            View findViewById2 = view.findViewById(C10322k.pending_product_item_icon);
            C41536l.m120488h(findViewById2, "itemView.findViewById(R.…ending_product_item_icon)");
            this.f55271g = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(C10322k.pending_product_item_see_more_btn);
            C41536l.m120488h(findViewById3, "itemView.findViewById(R.…roduct_item_see_more_btn)");
            this.f55272h = (BogButton) findViewById3;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m66396k(C20325h hVar, PendingProductConfirmationData pendingProductConfirmationData, View view) {
            C41536l.m120489i(hVar, "this$0");
            C41536l.m120489i(pendingProductConfirmationData, "$pData");
            ProductConfirmationActivity.C22264a aVar = ProductConfirmationActivity.f59088J;
            View view2 = hVar.f89287d;
            C41536l.m120488h(view2, "itemView");
            Activity a = C25100c.m80062a(view2);
            C41536l.m120486f(a);
            aVar.mo55144a(a, pendingProductConfirmationData);
        }

        /* renamed from: j */
        public final void mo48806j(PendingProductConfirmationData pendingProductConfirmationData) {
            C41536l.m120489i(pendingProductConfirmationData, "pData");
            this.f55270f.setText(pendingProductConfirmationData.mo55154b());
            C20328j jVar = new C20328j(this, pendingProductConfirmationData);
            this.f89287d.setOnClickListener(jVar);
            this.f55272h.setOnClickListener(jVar);
            this.f55272h.setText(C32343x.m95420V("banner.product.activation.button.label", C32343x.m95452h0(C10328q.pending_offers_see_more, new Object[0]), new Object[0]));
            C2396k u = C2379b.m9211u(this.f55271g);
            String a = pendingProductConfirmationData.mo55153a();
            if (a != null) {
                ((C2394j) u.mo7757y(C32289b0.m95093e(a)).mo7232j(C10320i.ic_product_confirmation_default)).mo7718L0(this.f55271g);
            }
        }
    }

    /* renamed from: J */
    public final void mo48796J(C36917q qVar) {
        C41536l.m120489i(qVar, "banner");
        this.f55251j.remove(qVar);
        C29615f.m89897A(this, 6, this.f55251j.isEmpty() ^ true ? 1 : 0, false, 4, (Object) null);
    }

    /* renamed from: K */
    public final void mo48797K(C20588a aVar) {
        C41536l.m120489i(aVar, "data");
        this.f55247f = aVar.mo49129e();
        this.f55248g = aVar.mo49125a();
        this.f55249h = aVar.mo49128d();
        this.f55250i = aVar.mo49131f();
        this.f55251j = aVar.mo49126b();
        C29615f.m89897A(this, 0, this.f55247f.isEmpty() ^ true ? 1 : 0, false, 4, (Object) null);
        C29615f.m89897A(this, 3, this.f55247f.size(), false, 4, (Object) null);
        C29615f.m89897A(this, 1, this.f55249h.isEmpty() ^ true ? 1 : 0, false, 4, (Object) null);
        C29615f.m89897A(this, 4, this.f55249h.size(), false, 4, (Object) null);
        C29615f.m89897A(this, 2, this.f55250i.isEmpty() ^ true ? 1 : 0, false, 4, (Object) null);
        C29615f.m89897A(this, 5, this.f55250i.size(), false, 4, (Object) null);
        C29615f.m89897A(this, 6, this.f55251j.isEmpty() ^ true ? 1 : 0, false, 4, (Object) null);
    }

    /* renamed from: L */
    public final void mo48798L(C20323f fVar) {
        C41536l.m120489i(fVar, "listener");
        this.f55252k = fVar;
    }

    /* renamed from: M */
    public final void mo48799M(C20324g gVar) {
        C41536l.m120489i(gVar, "listener");
        this.f55253l = gVar;
    }

    /* renamed from: l */
    public List mo48134l() {
        return C41341q.m119910m(new C29615f.C29617b(0, 0, 2, (DefaultConstructorMarker) null), new C29615f.C29617b(3, 0, 2, (DefaultConstructorMarker) null), new C29615f.C29617b(1, 0, 2, (DefaultConstructorMarker) null), new C29615f.C29617b(4, 0, 2, (DefaultConstructorMarker) null), new C29615f.C29617b(6, 0, 2, (DefaultConstructorMarker) null), new C29615f.C29617b(2, 0, 2, (DefaultConstructorMarker) null), new C29615f.C29617b(5, 0, 2, (DefaultConstructorMarker) null));
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        switch (i) {
            case 0:
            case 1:
            case 2:
                return new C20321d(this, C32343x.m95470n0(C10324m.applications_recycler_header_item, viewGroup, false, 2, (Object) null));
            case 3:
                C27336j2 d = C27336j2.m84654d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d, "inflate(\n               …lse\n                    )");
                return new C20318a(this, d);
            case 4:
                return new C20322e(this, C32343x.m95470n0(C10324m.offer_list_item, viewGroup, false, 2, (Object) null));
            case 5:
                return new C20325h(this, C32343x.m95470n0(C10324m.pending_product_confirmation_list_item, viewGroup, false, 2, (Object) null));
            case 6:
                return new C20319b(this, C32343x.m95470n0(C10324m.banner_list_item, viewGroup, false, 2, (Object) null));
            default:
                throw new IllegalStateException("Illegal ViewType");
        }
    }

    /* renamed from: p */
    public void mo48135p(RecyclerView.C1734f0 f0Var, int i, int i2) {
        C41536l.m120489i(f0Var, "holder");
        if (f0Var instanceof C20321d) {
            ((C20321d) f0Var).mo48802k();
        } else if (f0Var instanceof C20318a) {
            ((C20318a) f0Var).mo48800m((Application) this.f55247f.get(i2));
        } else if (f0Var instanceof C20322e) {
            ((C20322e) f0Var).mo48803k((OfferInfo) this.f55249h.get(i2));
        } else if (f0Var instanceof C20325h) {
            ((C20325h) f0Var).mo48806j((PendingProductConfirmationData) this.f55250i.get(i2));
        } else if (f0Var instanceof C20319b) {
            ((C20319b) f0Var).mo48801i((C36917q) this.f55251j.get(i2));
        }
    }
}

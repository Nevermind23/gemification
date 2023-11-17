package p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.C0209a;
import androidx.core.content.C0767a;
import androidx.core.content.res.C0808h;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import d81.C31549a;
import e91.C31696a;
import g81.C32184h0;
import g91.C32297d;
import g91.C32300e0;
import g91.C32303f;
import g91.C32306g0;
import g91.C32307h;
import g91.C32343x;
import hc1.C41143c;
import hc1.C41185v;
import hd1.C41205b;
import he1.C41217g;
import he1.C41238w;
import ie1.C41330k0;
import iu0.C36546y;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41550z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ld0.C25950a;
import m41.C37223a;
import m41.C37224b;
import o00.C26656a;
import p00.C27113k;
import p060e1.C5893c;
import p060e1.C5958l0;
import p060e1.C5968n0;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.actionsheet.additionalactions.model.AdditionalAction;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.C20932b;
import p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanActivationResultActivity;
import p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.InsuranceProviderUiModel;
import p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.ProviderInfoUiModel;
import p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.StatusEntity;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p341ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.model.offers.LimitLoanDecisionDetails;
import p341ge.bog.mobilebank.model.offers.LimitLoanRefinanceInfo;
import p341ge.bog.mobilebank.model.offers.LoanOfferCard;
import p341ge.bog.mobilebank.model.offers.Summary;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.fragments.importantterm.LoanImportantTermFragment;
import p341ge.bog.mobilebank.p975ui.model.offer.ConsumerLoanActivationResult;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.CustomViewWithCheckbox;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.offers.OffersWizardPlugin;
import p341ge.bog.mobilebank.p975ui.wizard.model.C35893a;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p341ge.bog.mobilebank.rest.BankApi;
import p363bh.C10277c;
import p366bk.C10316e;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p380ck.C10463g;
import p380ck.C10464h;
import p420fh.C12902d;
import p420fh.C12910e;
import p519mi.C16686a;
import p601sg.C17780e;
import p601sg.C17781f;
import p642vh.C18368l;
import p710av.C19278a;
import p828mr.C26257a;
import p828mr.C26261e;
import p828mr.C26266i;
import p848or.C27062d;
import p848or.C27063e;
import p848or.C27064f;
import p848or.C27065g;
import p848or.C27066h;
import p848or.C27067i;
import p848or.C27068j;
import p848or.C27069k;
import p848or.C27070l;
import p848or.C27071m;
import p848or.C27072n;
import p848or.C27073o;
import p852ov.C27088c;
import p858pr.C27608d;
import p858pr.C27612f;
import p868qr.C27858c;
import p868qr.C27859d;
import p868qr.C27860e;
import p888sr.C28255a;
import p888sr.C28256b;
import p888sr.C28258d;
import p90.C27442v;
import r90.C27950a;
import s81.C38458a;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import ue1.C43080q;
import z10.C30138e;
import ze1.C43420e;

/* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity */
public final class ConsumerLoanDetailsActivity extends C30772sa implements C38458a, C26656a, C41185v.C41186a {

    /* renamed from: o0 */
    public static final C20880b f56186o0 = new C20880b((DefaultConstructorMarker) null);

    /* renamed from: F */
    private String f56187F;

    /* renamed from: G */
    private String f56188G;

    /* renamed from: H */
    private final C41217g f56189H = C41219i.m119470b(new C20899k0(this));

    /* renamed from: I */
    private C20884d f56190I;

    /* renamed from: J */
    private boolean f56191J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public C43064a f56192K = C20909o0.f56244d;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public LimitLoanDecisionDetails f56193L;

    /* renamed from: M */
    private List f56194M;

    /* renamed from: N */
    private boolean f56195N;

    /* renamed from: O */
    private boolean f56196O;

    /* renamed from: P */
    private boolean f56197P;

    /* renamed from: Q */
    private boolean f56198Q;

    /* renamed from: R */
    private boolean f56199R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public C28256b f56200S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public List f56201T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public BigDecimal f56202U;

    /* renamed from: V */
    private int f56203V = -1;

    /* renamed from: W */
    private int f56204W = -1;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public int f56205X = -1;

    /* renamed from: Y */
    private List f56206Y;

    /* renamed from: Z */
    private List f56207Z;

    /* renamed from: a0 */
    private boolean f56208a0;

    /* renamed from: b0 */
    private boolean f56209b0;

    /* renamed from: c0 */
    private boolean f56210c0 = true;

    /* renamed from: d0 */
    private Boolean f56211d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public Boolean f56212e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public InsuranceProviderUiModel f56213f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public String f56214g0;

    /* renamed from: h0 */
    private OfferProductCode f56215h0;

    /* renamed from: i0 */
    private C27088c f56216i0;

    /* renamed from: j0 */
    private List f56217j0;

    /* renamed from: k0 */
    private final C41217g f56218k0 = new C1617p0(C41520a0.m120436b(ConsumerLoanDetailsViewModel.class), new C20927x0(this), new C20925w0(this), new C20929y0((C43064a) null, this));

    /* renamed from: l0 */
    private LoanImportantTermFragment f56219l0;

    /* renamed from: m0 */
    private C20878a f56220m0 = C20878a.GET_DECISION;

    /* renamed from: n0 */
    private final C41217g f56221n0 = C41219i.m119470b(new C20917s0(this));

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$a */
    public enum C20878a {
        CHECK_DECISION,
        GET_DECISION
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$a0 */
    /* synthetic */ class C20879a0 extends C41535k implements C43075l {
        C20879a0(Object obj) {
            super(1, obj, ConsumerLoanDetailsActivity.class, "onCheckLoanDecision", "onCheckLoanDecision(Lge/bog/mobilebank/cleanarch/consumerloandetails/domain/model/LoanDecisionOptions;)V", 0);
        }

        /* renamed from: b */
        public final void mo49768b(C26261e eVar) {
            C41536l.m120489i(eVar, "p0");
            ((ConsumerLoanDetailsActivity) this.receiver).m67630Y3(eVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49768b((C26261e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$b */
    public static final class C20880b {
        private C20880b() {
        }

        public /* synthetic */ C20880b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m67696b(C20880b bVar, Context context, String str, C27088c cVar, OfferProductCode offerProductCode, String str2, String str3, int i, Object obj) {
            if ((i & 32) != 0) {
                str3 = null;
            }
            bVar.mo49769a(context, str, cVar, offerProductCode, str2, str3);
        }

        /* renamed from: a */
        public final void mo49769a(Context context, String str, C27088c cVar, OfferProductCode offerProductCode, String str2, String str3) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(str, "offerNo");
            C41536l.m120489i(cVar, "operationType");
            C41536l.m120489i(offerProductCode, "productCode");
            Intent intent = new Intent(context, ConsumerLoanDetailsActivity.class);
            intent.putExtra("OFFER_ID", str);
            intent.putExtra("OPERATION_TYPE", cVar);
            intent.putExtra("PRODUCT_CODE", offerProductCode);
            intent.putExtra("HEADER_TEXT", str2);
            intent.putExtra("REQUESTED_AMOUNT", str3);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$b0 */
    static final class C20881b0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsActivity f56225d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20881b0(ConsumerLoanDetailsActivity consumerLoanDetailsActivity) {
            super(1);
            this.f56225d = consumerLoanDetailsActivity;
        }

        /* renamed from: a */
        public final void mo49770a(C37223a aVar) {
            if (!aVar.mo90297b()) {
                this.f56225d.getSupportFragmentManager().mo4409g1();
                this.f56225d.f56192K.invoke();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49770a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$c */
    private enum C20882c {
        YES,
        NO
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$c0 */
    /* synthetic */ class C20883c0 extends C41535k implements C43075l {
        C20883c0(Object obj) {
            super(1, obj, ConsumerLoanDetailsActivity.class, "onPreContractResponse", "onPreContractResponse(Lge/bog/mobilebank/domain/precontract/model/PreContract;)V", 0);
        }

        /* renamed from: b */
        public final void mo49771b(C25950a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((ConsumerLoanDetailsActivity) this.receiver).m67654k4(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49771b((C25950a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$d */
    private interface C20884d {
        /* renamed from: a */
        void mo49772a(C20882c cVar);
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$d0 */
    /* synthetic */ class C20885d0 extends C41535k implements C43075l {
        C20885d0(Object obj) {
            super(1, obj, ConsumerLoanDetailsActivity.class, "onValueUpdated", "onValueUpdated(Lge/bog/mobilebank/shared2/livedata/Event;)V", 0);
        }

        /* renamed from: b */
        public final void mo49773b(C37223a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((ConsumerLoanDetailsActivity) this.receiver).m67659m4(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49773b((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$e */
    public /* synthetic */ class C20886e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f56229a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f56230b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|5|6|(2:7|8)|9|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
        static {
            /*
                ov.c[] r0 = p852ov.C27088c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                ov.c r2 = p852ov.C27088c.BOG_AND_OTHER_BANK_REFINANCING_LOAN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                ov.c r3 = p852ov.C27088c.BOG_REFINANCING_LOAN     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ov.c r3 = p852ov.C27088c.PARALLEL_LOAN     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r4 = 3
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f56229a = r0
                ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$c[] r0 = p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel.C20945c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$c r3 = p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel.C20945c.NETWORK     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$c r1 = p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel.C20945c.NO_CREDIT_INFO     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f56230b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity.C20886e.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$e0 */
    /* synthetic */ class C20887e0 extends C41535k implements C43075l {
        C20887e0(Object obj) {
            super(1, obj, ConsumerLoanDetailsActivity.class, "setInputValues", "setInputValues(Lge/bog/mobilebank/cleanarch/consumerloandetails/presentation/model/LoanDecisionInputData;)V", 0);
        }

        /* renamed from: b */
        public final void mo49774b(C28258d dVar) {
            C41536l.m120489i(dVar, "p0");
            ((ConsumerLoanDetailsActivity) this.receiver).m67667q4(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49774b((C28258d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$f */
    /* synthetic */ class C20888f extends C41535k implements C43075l {
        C20888f(Object obj) {
            super(1, obj, ConsumerLoanDetailsActivity.class, "onGetLimitLoanDecision", "onGetLimitLoanDecision(Lge/bog/mobilebank/cleanarch/consumerloandetails/presentation/model/LimitLoanDecisionUiData;)V", 0);
        }

        /* renamed from: b */
        public final void mo49775b(C28255a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((ConsumerLoanDetailsActivity) this.receiver).m67640d4(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49775b((C28255a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$f0 */
    /* synthetic */ class C20889f0 extends C41535k implements C43064a {
        C20889f0(Object obj) {
            super(0, obj, C20932b.class, "isSet", "isSet(I)Z", 1);
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(C20932b.m67744b(((Number) this.receiver).intValue()));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$g */
    /* synthetic */ class C20890g extends C41535k implements C43075l {
        C20890g(Object obj) {
            super(1, obj, ConsumerLoanDetailsActivity.class, "onRetry", "onRetry(Lge/bog/mobilebank/shared2/livedata/Event;)V", 0);
        }

        /* renamed from: b */
        public final void mo49777b(C37223a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((ConsumerLoanDetailsActivity) this.receiver).m67657l4(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49777b((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$g0 */
    /* synthetic */ class C20891g0 extends C41535k implements C43064a {
        C20891g0(Object obj) {
            super(0, obj, C20932b.class, "isSet", "isSet(I)Z", 1);
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(C20932b.m67744b(((Number) this.receiver).intValue()));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$h */
    static final class C20892h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsActivity f56231d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20892h(ConsumerLoanDetailsActivity consumerLoanDetailsActivity) {
            super(1);
            this.f56231d = consumerLoanDetailsActivity;
        }

        /* renamed from: a */
        public final void mo49779a(C37223a aVar) {
            if (!aVar.mo90297b()) {
                this.f56231d.m67584G4();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49779a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$h0 */
    /* synthetic */ class C20893h0 extends C41535k implements C43064a {
        C20893h0(Object obj) {
            super(0, obj, C20932b.class, "isSet", "isSet(I)Z", 1);
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(C20932b.m67744b(((Number) this.receiver).intValue()));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$i */
    /* synthetic */ class C20894i extends C41535k implements C43075l {
        C20894i(Object obj) {
            super(1, obj, ConsumerLoanDetailsActivity.class, "handlePreContractResult", "handlePreContractResult(Lge/bog/mobilebank/shared2/livedata/Event;)V", 0);
        }

        /* renamed from: b */
        public final void mo49781b(C37223a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((ConsumerLoanDetailsActivity) this.receiver).m67613Q3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49781b((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$i0 */
    static final class C20895i0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsActivity f56232d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20895i0(ConsumerLoanDetailsActivity consumerLoanDetailsActivity) {
            super(0);
            this.f56232d = consumerLoanDetailsActivity;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f56232d.f56212e0 != null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$j */
    static final class C20896j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsActivity f56233d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20896j(ConsumerLoanDetailsActivity consumerLoanDetailsActivity) {
            super(1);
            this.f56233d = consumerLoanDetailsActivity;
        }

        /* renamed from: a */
        public final void mo49783a(C37223a aVar) {
            if (C41536l.m120484d(aVar.mo90296a(), Boolean.TRUE)) {
                C41185v.C41187b bVar = C41185v.f97155C;
                ConsumerLoanDetailsViewModel f3 = this.f56233d.m67607O3();
                ConsumerLoanDetailsViewModel f32 = this.f56233d.m67607O3();
                String c3 = this.f56233d.f56214g0;
                List list = null;
                if (c3 == null) {
                    C41536l.m120506z("offerNo");
                    c3 = null;
                }
                List V2 = this.f56233d.f56201T;
                if (V2 == null) {
                    C41536l.m120506z("cards");
                } else {
                    list = V2;
                }
                String pan2 = ((LoanOfferCard) list.get(this.f56233d.f56205X)).getPan2();
                C41536l.m120488h(pan2, "cards[selectedCardIndex].pan2");
                C41185v e = C41185v.C41187b.m119423e(bVar, BankApi.OFFERS_PROCESS_LOAN_REGISTRATION, f3.mo49901ux(f32.mo49863Cx(c3, pan2, (String) null, (String) null, (String) null)), (C41143c) null, 4, (Object) null);
                FragmentManager supportFragmentManager = this.f56233d.getSupportFragmentManager();
                C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
                e.mo4576A1(supportFragmentManager, "ConsumerLoanDetails.SCA");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49783a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$j0 */
    static final class C20897j0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsActivity f56234d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20897j0(ConsumerLoanDetailsActivity consumerLoanDetailsActivity) {
            super(0);
            this.f56234d = consumerLoanDetailsActivity;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f56234d.f56213f0 != null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$k */
    /* synthetic */ class C20898k extends C41535k implements C43075l {
        C20898k(Object obj) {
            super(1, obj, ConsumerLoanDetailsActivity.class, "handleOtp", "handleOtp(Lge/bog/mobilebank/shared2/livedata/Event;)V", 0);
        }

        /* renamed from: b */
        public final void mo49785b(C37223a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((ConsumerLoanDetailsActivity) this.receiver).m67610P3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49785b((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$k0 */
    static final class C20899k0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsActivity f56235d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20899k0(ConsumerLoanDetailsActivity consumerLoanDetailsActivity) {
            super(0);
            this.f56235d = consumerLoanDetailsActivity;
        }

        /* renamed from: b */
        public final C27442v invoke() {
            return C27442v.m85076a(this.f56235d.findViewById(C10322k.consumer_loan_root));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$l */
    static final class C20900l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsActivity f56236d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20900l(ConsumerLoanDetailsActivity consumerLoanDetailsActivity) {
            super(1);
            this.f56236d = consumerLoanDetailsActivity;
        }

        /* renamed from: a */
        public final void mo49787a(boolean z) {
            this.f56236d.m67652j4();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49787a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$l0 */
    static final class C20901l0 extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsActivity f56237d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20901l0(ConsumerLoanDetailsActivity consumerLoanDetailsActivity) {
            super(2);
            this.f56237d = consumerLoanDetailsActivity;
        }

        /* renamed from: a */
        public final View mo49788a(int i, ViewGroup viewGroup) {
            C41536l.m120489i(viewGroup, "parent");
            if (i != 1) {
                return this.f56237d.m67595K3(C10316e.f28610m, true);
            }
            View inflate = LayoutInflater.from(this.f56237d).inflate(C10324m.item_refinance_info, viewGroup, false);
            C41536l.m120488h(inflate, "{\n                    La… false)\n                }");
            return inflate;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo49788a(((Number) obj).intValue(), (ViewGroup) obj2);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$m */
    /* synthetic */ class C20902m extends C41535k implements C43075l {
        C20902m(Object obj) {
            super(1, obj, ConsumerLoanDetailsActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo49789b(boolean z) {
            ((ConsumerLoanDetailsActivity) this.receiver).m67646g4(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49789b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$m0 */
    static final class C20903m0 extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C20903m0 f56238d = new C20903m0();

        C20903m0() {
            super(2);
        }

        /* renamed from: a */
        public final Integer mo49790a(int i, C27860e eVar) {
            return Integer.valueOf(eVar instanceof C27858c ? 1 : 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo49790a(((Number) obj).intValue(), (C27860e) obj2);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$n */
    /* synthetic */ class C20904n extends C41535k implements C43075l {
        C20904n(Object obj) {
            super(1, obj, ConsumerLoanDetailsActivity.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo49791b(C21503d.C21504a aVar) {
            ((ConsumerLoanDetailsActivity) this.receiver).mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49791b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$n0 */
    static final class C20905n0 extends C41537m implements C43080q {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsActivity f56239d;

        /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$n0$a */
        static final class C20906a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ LimitLoanRefinanceInfo f56240d;

            /* renamed from: e */
            final /* synthetic */ int f56241e;

            /* renamed from: f */
            final /* synthetic */ ConsumerLoanDetailsActivity f56242f;

            /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$n0$a$a */
            static final class C20907a extends C41537m implements C43075l {

                /* renamed from: d */
                public static final C20907a f56243d = new C20907a();

                C20907a() {
                    super(1);
                }

                /* renamed from: a */
                public final Boolean invoke(C27860e eVar) {
                    return Boolean.valueOf((eVar instanceof C27858c) && C41536l.m120484d(((C27858c) eVar).mo67374a().getProductSource(), "BOG"));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20906a(LimitLoanRefinanceInfo limitLoanRefinanceInfo, int i, ConsumerLoanDetailsActivity consumerLoanDetailsActivity) {
                super(1);
                this.f56240d = limitLoanRefinanceInfo;
                this.f56241e = i;
                this.f56242f = consumerLoanDetailsActivity;
            }

            /* renamed from: a */
            public final Boolean mo49793a(boolean z) {
                int i;
                int i2;
                if (C41536l.m120484d(this.f56240d.getProductSource(), "BOG")) {
                    i2 = this.f56241e;
                } else if (this.f56242f.m67604N3().mo72708i(C20907a.f56243d)) {
                    i = this.f56241e - 2;
                    return Boolean.valueOf(this.f56242f.m67607O3().mo49868Nw(i, z));
                } else {
                    i2 = this.f56241e;
                }
                i = i2 - 1;
                return Boolean.valueOf(this.f56242f.m67607O3().mo49868Nw(i, z));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return mo49793a(((Boolean) obj).booleanValue());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20905n0(ConsumerLoanDetailsActivity consumerLoanDetailsActivity) {
            super(3);
            this.f56239d = consumerLoanDetailsActivity;
        }

        /* renamed from: a */
        public final void mo49792a(C27860e eVar, int i, View view) {
            C41536l.m120489i(view, "view");
            if (eVar instanceof C27858c) {
                CustomViewWithCheckbox customViewWithCheckbox = (CustomViewWithCheckbox) view.findViewById(C10322k.refinance_info);
                boolean z = true;
                if (i == this.f56239d.m67604N3().getItemCount() - 1 || this.f56239d.m67604N3().getItemViewType(i + 1) == 0) {
                    z = false;
                }
                customViewWithCheckbox.setDividerVisibility(z);
                LimitLoanRefinanceInfo a = ((C27858c) eVar).mo67374a();
                ConsumerLoanDetailsActivity consumerLoanDetailsActivity = this.f56239d;
                customViewWithCheckbox.setOnCheckedListener((C43075l) null);
                customViewWithCheckbox.setTitleText(a.getProductName());
                String k = C32303f.m95200k(a.getProductAmount(), a.getProductCcy());
                C41536l.m120488h(k, "getFormattedAmount(produ…t.toDouble(), productCcy)");
                customViewWithCheckbox.setAmountText(k);
                String productCreditorName = a.getProductCreditorName();
                if (productCreditorName == null) {
                    productCreditorName = "bog";
                }
                customViewWithCheckbox.setSubTitleText(productCreditorName);
                customViewWithCheckbox.setChecked(a.isSelected());
                customViewWithCheckbox.setOnCheckedListener(new C20906a(a, i, consumerLoanDetailsActivity));
            } else if (eVar instanceof C27859d) {
                ((BogTextView) view).setText(((C27859d) eVar).mo67378a());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo49792a((C27860e) obj, ((Number) obj2).intValue(), (View) obj3);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$o */
    /* synthetic */ class C20908o extends C41535k implements C43075l {
        C20908o(Object obj) {
            super(1, obj, ConsumerLoanDetailsActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo49795b(boolean z) {
            ((ConsumerLoanDetailsActivity) this.receiver).m67646g4(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49795b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$o0 */
    static final class C20909o0 extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C20909o0 f56244d = new C20909o0();

        C20909o0() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$p */
    static final class C20910p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsActivity f56245d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20910p(ConsumerLoanDetailsActivity consumerLoanDetailsActivity) {
            super(1);
            this.f56245d = consumerLoanDetailsActivity;
        }

        /* renamed from: a */
        public final void mo49796a(List list) {
            C32184h0 d3 = this.f56245d.m67604N3();
            C41536l.m120488h(list, "list");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next : list) {
                String productSource = ((LimitLoanRefinanceInfo) next).getProductSource();
                Object obj = linkedHashMap.get(productSource);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(productSource, obj);
                }
                ((List) obj).add(next);
            }
            ConsumerLoanDetailsActivity consumerLoanDetailsActivity = this.f56245d;
            ArrayList arrayList = new ArrayList();
            if (linkedHashMap.containsKey("BOG")) {
                String string = consumerLoanDetailsActivity.getString(C10328q.liabilities_in_bog);
                C41536l.m120488h(string, "getString(R.string.liabilities_in_bog)");
                arrayList.add(new C27859d(string));
                Object obj2 = linkedHashMap.get("BOG");
                C41536l.m120486f(obj2);
                Iterable<LimitLoanRefinanceInfo> iterable = (Iterable) obj2;
                ArrayList arrayList2 = new ArrayList(C41343r.m119925u(iterable, 10));
                for (LimitLoanRefinanceInfo cVar : iterable) {
                    arrayList2.add(new C27858c(cVar));
                }
                arrayList.addAll(arrayList2);
            }
            if (linkedHashMap.containsKey("CRI")) {
                String string2 = consumerLoanDetailsActivity.getString(C10328q.liabilities_in_other_banks);
                C41536l.m120488h(string2, "getString(R.string.liabilities_in_other_banks)");
                arrayList.add(new C27859d(string2));
                Object obj3 = linkedHashMap.get("CRI");
                C41536l.m120486f(obj3);
                Iterable<LimitLoanRefinanceInfo> iterable2 = (Iterable) obj3;
                ArrayList arrayList3 = new ArrayList(C41343r.m119925u(iterable2, 10));
                for (LimitLoanRefinanceInfo cVar2 : iterable2) {
                    arrayList3.add(new C27858c(cVar2));
                }
                arrayList.addAll(arrayList3);
            }
            d3.mo72712n(arrayList);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49796a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$p0 */
    /* synthetic */ class C20911p0 extends C41535k implements C43075l {
        C20911p0(Object obj) {
            super(1, obj, ConsumerLoanDetailsActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo49797b(boolean z) {
            ((ConsumerLoanDetailsActivity) this.receiver).m67646g4(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49797b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$q */
    /* synthetic */ class C20912q extends C41535k implements C43075l {
        C20912q(Object obj) {
            super(1, obj, ConsumerLoanDetailsActivity.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo49798b(C21503d.C21504a aVar) {
            ((ConsumerLoanDetailsActivity) this.receiver).mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49798b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$q0 */
    /* synthetic */ class C20913q0 extends C41535k implements C43075l {
        C20913q0(Object obj) {
            super(1, obj, ConsumerLoanDetailsActivity.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo49799b(C21503d.C21504a aVar) {
            ((ConsumerLoanDetailsActivity) this.receiver).mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49799b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$r */
    static final class C20914r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsActivity f56246d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20914r(ConsumerLoanDetailsActivity consumerLoanDetailsActivity) {
            super(1);
            this.f56246d = consumerLoanDetailsActivity;
        }

        /* renamed from: a */
        public final void mo49800a(C19278a aVar) {
            C41536l.m120489i(aVar, "it");
            C27113k c = C27113k.C27114a.m84066c(C27113k.f68083P, aVar.mo47499a(), false, (String) null, (ArrayList) null, (Summary) null, (String) null, 62, (Object) null);
            FragmentManager supportFragmentManager = this.f56246d.getSupportFragmentManager();
            C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
            c.mo4576A1(supportFragmentManager, "PreContractDialogFragment");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49800a((C19278a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$r0 */
    static final class C20915r0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C25950a f56247d;

        /* renamed from: e */
        final /* synthetic */ ConsumerLoanDetailsActivity f56248e;

        /* renamed from: f */
        final /* synthetic */ C41550z f56249f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20915r0(C25950a aVar, ConsumerLoanDetailsActivity consumerLoanDetailsActivity, C41550z zVar) {
            super(0);
            this.f56247d = aVar;
            this.f56248e = consumerLoanDetailsActivity;
            this.f56249f = zVar;
        }

        public final void invoke() {
            C27113k.C27114a aVar = C27113k.f68083P;
            String a = this.f56247d.mo64864a();
            String string = this.f56248e.getString(C10328q.precontract_activate_loan);
            List list = (List) this.f56249f.f97717d;
            if (list == null) {
                list = C41341q.m119907j();
            }
            ArrayList arrayList = new ArrayList(list);
            C28256b a3 = this.f56248e.f56200S;
            if (a3 == null) {
                C41536l.m120506z("limitLoanDecision");
                a3 = null;
            }
            Summary h = a3.mo67826h();
            String string2 = this.f56248e.getString(C10328q.f28957f5);
            C41536l.m120488h(string2, "getString(R.string.header_text_loans)");
            C27113k b = aVar.mo66416b(a, true, string, arrayList, h, string2);
            FragmentManager supportFragmentManager = this.f56248e.getSupportFragmentManager();
            C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
            b.mo4576A1(supportFragmentManager, "PreContractDialogFragment");
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$s */
    static final class C20916s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsActivity f56250d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20916s(ConsumerLoanDetailsActivity consumerLoanDetailsActivity) {
            super(1);
            this.f56250d = consumerLoanDetailsActivity;
        }

        /* renamed from: a */
        public final void mo49801a(C37223a aVar) {
            HashMap hashMap = (HashMap) aVar.mo90296a();
            if (hashMap != null) {
                ConsumerLoanDetailsActivity consumerLoanDetailsActivity = this.f56250d;
                C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, "CLIENTS_CONFIRMATION_ON_CREDIT_INFO", hashMap, (C41143c) null, 4, (Object) null);
                FragmentManager supportFragmentManager = consumerLoanDetailsActivity.getSupportFragmentManager();
                C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
                e.mo4576A1(supportFragmentManager, "ConsumerLoanDetails.SCA");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49801a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$s0 */
    /* synthetic */ class C20917s0 extends C41535k implements C43064a {
        C20917s0(Object obj) {
            super(0, obj, ConsumerLoanDetailsActivity.class, "createRefinanceAdapter", "createRefinanceAdapter()Lge/bog/mobilebank/ui/adapters/SimpleListAdapter;", 0);
        }

        /* renamed from: b */
        public final C32184h0 invoke() {
            return ((ConsumerLoanDetailsActivity) this.receiver).m67583G3();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$t */
    /* synthetic */ class C20918t extends C41535k implements C43075l {
        C20918t(Object obj) {
            super(1, obj, ConsumerLoanDetailsActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo49803b(boolean z) {
            ((ConsumerLoanDetailsActivity) this.receiver).m67646g4(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49803b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$t0 */
    static final class C20919t0 extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsActivity f56251d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20919t0(ConsumerLoanDetailsActivity consumerLoanDetailsActivity) {
            super(2);
            this.f56251d = consumerLoanDetailsActivity;
        }

        /* renamed from: a */
        public final void mo49804a(String str, Bundle bundle) {
            C41536l.m120489i(str, "<anonymous parameter 0>");
            C41536l.m120489i(bundle, "bundle");
            InsuranceProviderUiModel insuranceProviderUiModel = (InsuranceProviderUiModel) bundle.getParcelable("InsuranceProviderActionSheet.CHOSEN_PROVIDER_RESULT");
            if (insuranceProviderUiModel != null) {
                this.f56251d.m67607O3().mo49879ay(insuranceProviderUiModel);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo49804a((String) obj, (Bundle) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$u */
    /* synthetic */ class C20920u extends C41535k implements C43075l {
        C20920u(Object obj) {
            super(1, obj, ConsumerLoanDetailsActivity.class, "onCreditInfoConfirmed", "onCreditInfoConfirmed(Lge/bog/mobilebank/cleanarch/data/common/entity/StatusEntity;)V", 0);
        }

        /* renamed from: b */
        public final void mo49805b(StatusEntity statusEntity) {
            C41536l.m120489i(statusEntity, "p0");
            ((ConsumerLoanDetailsActivity) this.receiver).m67636b4(statusEntity);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49805b((StatusEntity) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$u0 */
    static final class C20921u0 extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsActivity f56252d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20921u0(ConsumerLoanDetailsActivity consumerLoanDetailsActivity) {
            super(2);
            this.f56252d = consumerLoanDetailsActivity;
        }

        /* renamed from: a */
        public final void mo49806a(String str, Bundle bundle) {
            C41536l.m120489i(str, "<anonymous parameter 0>");
            C41536l.m120489i(bundle, "bundle");
            String string = bundle.getString("LoanDecisionChangeAmountActionSheet.CHOSEN_PROVIDER");
            if (string != null) {
                TextTypeView textTypeView = this.f56252d.m67589I3().f70031u;
                BigDecimal bigDecimal = new BigDecimal(string);
                LimitLoanDecisionDetails b3 = this.f56252d.f56193L;
                if (b3 == null) {
                    C41536l.m120506z("offerDetails");
                    b3 = null;
                }
                textTypeView.setValueText(C32303f.m95203n(bigDecimal, b3.loanCcy));
                this.f56252d.f56202U = new BigDecimal(string);
                this.f56252d.m67572C3(true);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo49806a((String) obj, (Bundle) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$v */
    /* synthetic */ class C20922v extends C41535k implements C43075l {
        C20922v(Object obj) {
            super(1, obj, ConsumerLoanDetailsActivity.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo49807b(C21503d.C21504a aVar) {
            ((ConsumerLoanDetailsActivity) this.receiver).mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49807b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$v0 */
    static final class C20923v0 extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsActivity f56253d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20923v0(ConsumerLoanDetailsActivity consumerLoanDetailsActivity) {
            super(2);
            this.f56253d = consumerLoanDetailsActivity;
        }

        /* renamed from: a */
        public final void mo49808a(String str, Bundle bundle) {
            C41536l.m120489i(str, "<anonymous parameter 0>");
            C41536l.m120489i(bundle, "b");
            Enum enumR = (Enum) bundle.getSerializable("AdditionalActionsActionSheet.RESULT_KEY");
            if (enumR != null) {
                this.f56253d.m67628X3(enumR);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo49808a((String) obj, (Bundle) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$w */
    static final class C20924w extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsActivity f56254d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20924w(ConsumerLoanDetailsActivity consumerLoanDetailsActivity) {
            super(1);
            this.f56254d = consumerLoanDetailsActivity;
        }

        /* renamed from: a */
        public final void mo49809a(boolean z) {
            if (z) {
                this.f56254d.m67646g4(z);
            } else {
                this.f56254d.m67624V3();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49809a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$w0 */
    public static final class C20925w0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f56255d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20925w0(ComponentActivity componentActivity) {
            super(0);
            this.f56255d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f56255d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$x */
    /* synthetic */ class C20926x extends C41535k implements C43075l {
        C20926x(Object obj) {
            super(1, obj, ConsumerLoanDetailsActivity.class, "adjustWarningText", "adjustWarningText(Lge/bog/mobilebank/cleanarch/presentation/creditapplication/model/WarningTextOptions;)V", 0);
        }

        /* renamed from: b */
        public final void mo49810b(C30138e eVar) {
            C41536l.m120489i(eVar, "p0");
            ((ConsumerLoanDetailsActivity) this.receiver).m67570B3(eVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49810b((C30138e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$x0 */
    public static final class C20927x0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f56256d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20927x0(ComponentActivity componentActivity) {
            super(0);
            this.f56256d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f56256d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$y */
    /* synthetic */ class C20928y extends C41535k implements C43075l {
        C20928y(Object obj) {
            super(1, obj, ConsumerLoanDetailsActivity.class, "onLoading", "onLoading(Lge/bog/mobilebank/shared2/livedata/Event;)V", 0);
        }

        /* renamed from: b */
        public final void mo49811b(C37223a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((ConsumerLoanDetailsActivity) this.receiver).m67644f4(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49811b((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$y0 */
    public static final class C20929y0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f56257d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f56258e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20929y0(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f56257d = aVar;
            this.f56258e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f56257d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f56258e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity$z */
    static final class C20930z extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsActivity f56259d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20930z(ConsumerLoanDetailsActivity consumerLoanDetailsActivity) {
            super(1);
            this.f56259d = consumerLoanDetailsActivity;
        }

        /* renamed from: a */
        public final void mo49812a(C37223a aVar) {
            String str = (String) aVar.mo90296a();
            if (str != null) {
                if (!C40439w.m117118v(str)) {
                    C32297d.m95154b(this.f56259d, str);
                } else {
                    C32297d.m95153a(this.f56259d);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49812a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: A3 */
    private final void m67568A3() {
        int i = C10318g.bog_input_layout_hint_color;
        C27442v I3 = m67589I3();
        TextTypeView textTypeView = I3.f70033w;
        C41536l.m120488h(textTypeView, "loanCard");
        m67684z3(textTypeView, new C20889f0(Integer.valueOf(this.f56205X)), i);
        TextTypeView textTypeView2 = I3.f69996H;
        C41536l.m120488h(textTypeView2, "paymentDate");
        m67684z3(textTypeView2, new C20891g0(Integer.valueOf(this.f56204W)), i);
        TextTypeView textTypeView3 = I3.f69993E;
        C41536l.m120488h(textTypeView3, "loanTerm");
        m67684z3(textTypeView3, new C20893h0(Integer.valueOf(this.f56203V)), i);
        TextTypeView textTypeView4 = I3.f70035y;
        C41536l.m120488h(textTypeView4, "loanInsurance");
        m67684z3(textTypeView4, new C20895i0(this), i);
        TextTypeView textTypeView5 = I3.f69989A;
        C41536l.m120488h(textTypeView5, "loanInsuranceProvider");
        m67684z3(textTypeView5, new C20897j0(this), i);
    }

    /* renamed from: A4 */
    private final void m67569A4() {
        m67589I3().f70036z.setText(C32343x.m95388F("offers.loan.details.insurance.block.header", new Object[0]));
        m67589I3().f70035y.setTitleText(C32343x.m95388F("offers.loan.details.insurance.block.field.label.payment.insurance", new Object[0]));
        m67589I3().f69989A.setTitleText(C32343x.m95388F("offers.loan.details.insurance.block.field.label.insurance.provider", new Object[0]));
        m67589I3().f70029s.setText(C32343x.m95388F("offers.loan.details.life.insurance.fee.label", new Object[0]));
        m67589I3().f70018h.setText(C32343x.m95388F("offers.loan.details.payment.insurance.fee.label", new Object[0]));
        m67589I3().f70001M.setButtonText(C32343x.m95388F("offers.loan.details.reset.button", new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public final void m67570B3(C30138e eVar) {
        int i;
        if (eVar.mo70480a()) {
            C5968n0 L0 = new C5893c().mo19350p0(150);
            C41536l.m120488h(L0, "AutoTransition().setDuration(150)");
            C5958l0.m23911b(m67589I3().f70020j, L0);
        }
        List<View> m = C41341q.m119910m(m67589I3().f70012X, m67589I3().f70011W);
        ArrayList arrayList = new ArrayList(C41343r.m119925u(m, 10));
        for (View view : m) {
            if (eVar.mo70481b()) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            arrayList.add(C41238w.f97225a);
        }
    }

    /* renamed from: B4 */
    private final void m67571B4() {
        BigDecimal bigDecimal;
        boolean z;
        m67575D4();
        C27088c cVar = this.f56216i0;
        LimitLoanDecisionDetails limitLoanDecisionDetails = null;
        if (cVar == null) {
            C41536l.m120506z("operationType");
            cVar = null;
        }
        if (cVar != C27088c.PARALLEL_LOAN) {
            m67589I3().f70026p.setTitleText(getString(C10328q.amount_after_repayment_and_commission));
        }
        m67589I3().f70015e.disable(false);
        m67589I3().f70026p.disable(false);
        boolean z2 = true;
        if (this.f56196O && !this.f56195N) {
            m67589I3().f70031u.disable(false);
            m67589I3().f69993E.disable(false);
            TextTypeView textTypeView = m67589I3().f69996H;
            OfferProductCode offerProductCode = this.f56215h0;
            if (offerProductCode == null) {
                C41536l.m120506z("productCode");
                offerProductCode = null;
            }
            if (!C41536l.m120484d(offerProductCode, OfferProductCode.C21002BA.f56468f)) {
                OfferProductCode offerProductCode2 = this.f56215h0;
                if (offerProductCode2 == null) {
                    C41536l.m120506z("productCode");
                    offerProductCode2 = null;
                }
                if (!C41536l.m120484d(offerProductCode2, OfferProductCode.C21004BE.f56469f)) {
                    z = false;
                    textTypeView.disable(z);
                }
            }
            z = true;
            textTypeView.disable(z);
        } else if (this.f56197P) {
            m67589I3().f70031u.disable(false);
        }
        m67589I3().f70015e.setValueTextIgnoringEmpty("");
        m67589I3().f70026p.setValueTextIgnoringEmpty("");
        m67578E4();
        int i = this.f56203V;
        int i2 = this.f56204W;
        int i3 = this.f56205X;
        BigDecimal bigDecimal2 = this.f56202U;
        if (bigDecimal2 == null) {
            C41536l.m120506z("amountValue");
            bigDecimal = null;
        } else {
            bigDecimal = bigDecimal2;
        }
        LimitLoanDecisionDetails limitLoanDecisionDetails2 = this.f56193L;
        if (limitLoanDecisionDetails2 == null) {
            C41536l.m120506z("offerDetails");
            limitLoanDecisionDetails2 = null;
        }
        if (limitLoanDecisionDetails2.insLifeAmount.compareTo(BigDecimal.ZERO) <= 0) {
            z2 = false;
        }
        m67667q4(new C28258d(i, i2, i3, bigDecimal, (InsuranceProviderUiModel) null, Boolean.valueOf(z2), (Boolean) null));
        LimitLoanDecisionDetails limitLoanDecisionDetails3 = this.f56193L;
        if (limitLoanDecisionDetails3 == null) {
            C41536l.m120506z("offerDetails");
        } else {
            limitLoanDecisionDetails = limitLoanDecisionDetails3;
        }
        String str = limitLoanDecisionDetails.accessType;
        C41536l.m120486f(str);
        LinearLayout linearLayout = m67589I3().f70020j;
        C41536l.m120488h(linearLayout, "binding.detailsLayout");
        Button button = m67589I3().f69995G;
        C41536l.m120488h(button, "binding.nextButton");
        C32300e0.m95171i(this, str, linearLayout, button);
        m67589I3().f69995G.setButtonText(C32343x.m95452h0(C10328q.recalculate, new Object[0]));
        m67669r4();
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public final void m67572C3(boolean z) {
        String str;
        BigDecimal bigDecimal;
        if ((!z || m67589I3().f69995G.isEnabled()) && C20932b.m67744b(this.f56205X)) {
            List list = this.f56201T;
            if (list == null) {
                C41536l.m120506z("cards");
                list = null;
            }
            LoanOfferCard loanOfferCard = (LoanOfferCard) list.get(this.f56205X);
            if (z) {
                if (this.f56210c0) {
                    C32343x.m95393H0(this, "applications_cl", "calculate", "on_cl_calculate_button_click", C10464h.C10465a.FIREBASE, (Bundle) null, 16, (Object) null);
                } else {
                    C32343x.m95393H0(this, "applications_cl", "cl_continue_activation", "on_cl_continue_button_click", C10464h.C10465a.FIREBASE, (Bundle) null, 16, (Object) null);
                }
            }
            ConsumerLoanDetailsViewModel O3 = m67607O3();
            if (this.f56198Q) {
                str = "";
            } else {
                List list2 = this.f56207Z;
                if (list2 == null) {
                    C41536l.m120506z("datesToSelect");
                    list2 = null;
                }
                str = (String) list2.get(this.f56204W);
            }
            String str2 = str;
            List list3 = this.f56206Y;
            if (list3 == null) {
                C41536l.m120506z("termsToSelect");
                list3 = null;
            }
            String str3 = (String) list3.get(this.f56203V);
            BigDecimal bigDecimal2 = this.f56202U;
            if (bigDecimal2 == null) {
                C41536l.m120506z("amountValue");
                bigDecimal = null;
            } else {
                bigDecimal = bigDecimal2;
            }
            O3.mo49867Jx(new C26257a(loanOfferCard, str2, "", str3, bigDecimal, z, (List) null, this.f56210c0, (InsuranceProviderUiModel) null, 320, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: C4 */
    private final void m67573C4() {
        m67589I3().f70004P.setLayoutManager(new LinearLayoutManager(this));
        m67589I3().f70004P.setAdapter(m67604N3());
    }

    /* renamed from: D3 */
    private final void m67574D3() {
        for (TextTypeView valueTextIgnoringEmpty : C41341q.m119910m(m67589I3().f69999K, m67589I3().f70015e, m67589I3().f70026p)) {
            valueTextIgnoringEmpty.setValueTextIgnoringEmpty("");
        }
    }

    /* renamed from: D4 */
    private final void m67575D4() {
        int i;
        C27088c cVar = this.f56216i0;
        C27088c cVar2 = null;
        if (cVar == null) {
            C41536l.m120506z("operationType");
            cVar = null;
        }
        int i2 = C20886e.f56229a[cVar.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            m67589I3().f69999K.setVisibility(0);
            m67589I3().f69999K.getBogInputLayout().setValueTextColor(C0767a.m2893c(this, C10318g.disabled_color));
            m67589I3().f69999K.setValueTextIgnoringEmpty("");
            ConsumerLoanDetailsViewModel O3 = m67607O3();
            C27088c cVar3 = this.f56216i0;
            if (cVar3 == null) {
                C41536l.m120506z("operationType");
            } else {
                cVar2 = cVar3;
            }
            List list = this.f56194M;
            if (list == null) {
                list = C41341q.m119907j();
            }
            O3.mo49873Ww(cVar2, list);
            if (m67604N3().mo72709j()) {
                i = 0;
            } else {
                i = 8;
            }
            for (View visibility : C41341q.m119910m(m67589I3().f70000L, m67589I3().f70008T)) {
                visibility.setVisibility(i);
            }
        }
    }

    /* renamed from: E3 */
    private final ArrayList m67577E3() {
        ArrayList arrayList = new ArrayList();
        List<LoanOfferCard> list = null;
        if (m67589I3().f70031u.isEditable()) {
            WizardObject wizardObject = new WizardObject();
            wizardObject.setInputTitle(getString(C10328q.loan_amount));
            wizardObject.setId("LOAN_AMOUNT_WIZARD_FIELD_ID");
            wizardObject.setInputStyle(1);
            wizardObject.setInputType(BogInputLayout.INPUT_TYPE_NUM_DIGIT);
            BigDecimal bigDecimal = this.f56202U;
            if (bigDecimal == null) {
                C41536l.m120506z("amountValue");
                bigDecimal = null;
            }
            wizardObject.setValue(bigDecimal.toString());
            LimitLoanDecisionDetails limitLoanDecisionDetails = this.f56193L;
            if (limitLoanDecisionDetails == null) {
                C41536l.m120506z("offerDetails");
                limitLoanDecisionDetails = null;
            }
            wizardObject.setNonSelectableString(C32303f.m95198i(limitLoanDecisionDetails.loanCcy, true));
            arrayList.add(wizardObject);
        }
        if (m67589I3().f69993E.isEditable()) {
            WizardObject wizardObject2 = new WizardObject();
            wizardObject2.setId("LOAN_TERM_WIZARD_FIELD_ID");
            wizardObject2.setInputTitle(getString(C10328q.loan_term_month));
            wizardObject2.setInputStyle(0);
            wizardObject2.setValue(String.valueOf(this.f56203V));
            List list2 = this.f56206Y;
            if (list2 == null) {
                C41536l.m120506z("termsToSelect");
                list2 = null;
            }
            wizardObject2.setSelectorOptionPreviews(list2);
            arrayList.add(wizardObject2);
        }
        if (m67589I3().f69996H.isEditable()) {
            WizardObject wizardObject3 = new WizardObject();
            wizardObject3.setId("LOAN_PAYMENT_DATE_WIZARD_FIELD_ID");
            wizardObject3.setInputTitle(getString(C10328q.select_payment_date));
            wizardObject3.setInputStyle(0);
            wizardObject3.setValue(String.valueOf(this.f56204W));
            List list3 = this.f56207Z;
            if (list3 == null) {
                C41536l.m120506z("datesToSelect");
                list3 = null;
            }
            wizardObject3.setSelectorOptionPreviews(list3);
            arrayList.add(wizardObject3);
        }
        if (m67589I3().f70033w.isEditable()) {
            WizardObject wizardObject4 = new WizardObject();
            wizardObject4.setId("LOAN_CARD_WIZARD_FIELD_ID");
            wizardObject4.setInputTitle(getString(C10328q.where_do_you_want_to_activate_loan));
            wizardObject4.setInputStyle(4);
            wizardObject4.setValue(String.valueOf(this.f56205X));
            List list4 = this.f56201T;
            if (list4 == null) {
                C41536l.m120506z("cards");
            } else {
                list = list4;
            }
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(list, 10));
            for (LoanOfferCard a : list) {
                arrayList2.add(C31696a.m93838a(a));
            }
            wizardObject4.setCustomSelectorValues(new ArrayList(arrayList2));
            arrayList.add(wizardObject4);
        }
        return arrayList;
    }

    /* renamed from: E4 */
    private final void m67578E4() {
        List list = this.f56217j0;
        if (list == null) {
            C41536l.m120506z("wizardFields");
            list = null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((TextTypeView) next).isEditable()) {
                arrayList.add(next);
            }
        }
        int i = 0;
        for (Object next2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                C41341q.m119917t();
            }
            TextTypeView textTypeView = (TextTypeView) next2;
            textTypeView.setOnClickListener(new C27064f(this));
            textTypeView.getViewSelector().setTag(Integer.valueOf(i));
            i = i2;
        }
    }

    /* renamed from: F3 */
    private final void m67580F3(LimitLoanDecisionDetails limitLoanDecisionDetails, LimitLoanDecisionDetails limitLoanDecisionDetails2) {
        limitLoanDecisionDetails2.keepAmount = limitLoanDecisionDetails.keepAmount;
        limitLoanDecisionDetails2.comisAmount = limitLoanDecisionDetails.comisAmount;
        limitLoanDecisionDetails2.rfncAmount = limitLoanDecisionDetails.rfncAmount;
        limitLoanDecisionDetails2.drawAmount = limitLoanDecisionDetails.drawAmount;
        limitLoanDecisionDetails2.drawAmount2 = limitLoanDecisionDetails.drawAmount2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.ProviderInfoUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.ProviderInfoUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.ProviderInfoUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.ProviderInfoUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.ProviderInfoUiModel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: F4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m67581F4(p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.InsuranceProviderUiModel r6, java.lang.Boolean r7, java.lang.Boolean r8) {
        /*
            r5 = this;
            p90.v r0 = r5.m67589I3()
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r0 = r0.f69989A
            if (r6 == 0) goto L_0x000e
            java.lang.String r1 = r6.mo49829e()
            if (r1 != 0) goto L_0x0010
        L_0x000e:
            java.lang.String r1 = ""
        L_0x0010:
            r0.setValueTextIgnoringEmpty(r1)
            r0 = 0
            if (r6 == 0) goto L_0x0046
            sr.b r1 = r5.f56200S
            if (r1 != 0) goto L_0x0020
            java.lang.String r1 = "limitLoanDecision"
            kotlin.jvm.internal.C41536l.m120506z(r1)
            r1 = r0
        L_0x0020:
            java.util.List r1 = r1.mo67821d()
            java.util.Iterator r1 = r1.iterator()
        L_0x0028:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0044
            java.lang.Object r2 = r1.next()
            r3 = r2
            ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.ProviderInfoUiModel r3 = (p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.ProviderInfoUiModel) r3
            java.lang.String r3 = r3.mo49845d()
            java.lang.String r4 = r6.mo49826b()
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r3, r4)
            if (r3 == 0) goto L_0x0028
            r0 = r2
        L_0x0044:
            ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.ProviderInfoUiModel r0 = (p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.ProviderInfoUiModel) r0
        L_0x0046:
            r5.m67685z4(r0, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity.m67581F4(ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.InsuranceProviderUiModel, java.lang.Boolean, java.lang.Boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public final C32184h0 m67583G3() {
        return new C32184h0(C41341q.m119907j(), new C20901l0(this), C20903m0.f56238d, (Integer) null, new C20905n0(this), (C43080q) null, 40, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: G4 */
    public final void m67584G4() {
        C35388f2.m105072l2(this, getString(C10328q.loan_error_declined_title), C27950a.m86287d("text.offers.pop.up.return.to.initial.parameters", false, 2, (Object) null), getString(C10328q.loan_error_declined_button_accept), getString(C10328q.loan_error_declined_button_continue), new C27071m(this), (View.OnClickListener) null, false, true, (String) null, (View.OnClickListener) null, 768, (Object) null);
    }

    /* renamed from: H3 */
    private final void m67586H3() {
        C41185v vVar = (C41185v) getSupportFragmentManager().mo4418k0("ConsumerLoanDetails.SCA");
        if (vVar != null) {
            vVar.mo4577k1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H4 */
    public static final void m67587H4(ConsumerLoanDetailsActivity consumerLoanDetailsActivity, View view) {
        C41536l.m120489i(consumerLoanDetailsActivity, "this$0");
        C28256b bVar = null;
        ConsumerLoanDetailsViewModel.m67807Yx(consumerLoanDetailsActivity.m67607O3(), false, 1, (Object) null);
        ConsumerLoanDetailsViewModel O3 = consumerLoanDetailsActivity.m67607O3();
        C27088c cVar = consumerLoanDetailsActivity.f56216i0;
        if (cVar == null) {
            C41536l.m120506z("operationType");
            cVar = null;
        }
        C28256b bVar2 = consumerLoanDetailsActivity.f56200S;
        if (bVar2 == null) {
            C41536l.m120506z("limitLoanDecision");
        } else {
            bVar = bVar2;
        }
        O3.mo49873Ww(cVar, bVar.mo67822e());
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public final C27442v m67589I3() {
        return (C27442v) this.f56189H.getValue();
    }

    /* renamed from: I4 */
    private final void m67590I4() {
        C35388f2.m105072l2(this, C32343x.m95388F("offers.CRI.confirmation.needed.dialog.window.header", new Object[0]), C32343x.m95388F("offers.CRI.confirmation.needed.dialog.window.main.text", new Object[0]), C32343x.m95388F("offers.CRI.confirmation.needed.dialog.window.button.confirm", new Object[0]), C32343x.m95388F("offers.CRI.confirmation.needed.dialog.window.button.cancel", new Object[0]), new C27073o(this), new C27063e(this), false, false, (String) null, (View.OnClickListener) null, 896, (Object) null);
    }

    /* renamed from: J3 */
    private final int m67592J3(C43064a aVar, int i) {
        if (((Boolean) aVar.invoke()).booleanValue()) {
            return C0767a.m2893c(this, i);
        }
        return C18368l.m62755d(this, C10316e.f28612q);
    }

    /* access modifiers changed from: private */
    /* renamed from: J4 */
    public static final void m67593J4(ConsumerLoanDetailsActivity consumerLoanDetailsActivity, View view) {
        C41536l.m120489i(consumerLoanDetailsActivity, "this$0");
        consumerLoanDetailsActivity.m67607O3().mo49872Uw();
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public final BogTextView m67595K3(int i, boolean z) {
        BogTextView bogTextView = new BogTextView(this);
        bogTextView.setTextColor(C18368l.m62755d(this, i));
        bogTextView.setTextSize(2, 13.0f);
        bogTextView.setTypeface(C0808h.m3033h(this, C17781f.f49672a));
        if (z) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, C32343x.m95394I(11), 0, 0);
            bogTextView.setLayoutParams(layoutParams);
        }
        return bogTextView;
    }

    /* access modifiers changed from: private */
    /* renamed from: K4 */
    public static final void m67596K4(ConsumerLoanDetailsActivity consumerLoanDetailsActivity, View view) {
        C41536l.m120489i(consumerLoanDetailsActivity, "this$0");
        consumerLoanDetailsActivity.finish();
    }

    /* renamed from: L3 */
    private final C27113k m67598L3() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        return C32343x.m95443e0(supportFragmentManager, (String) null, 1, (Object) null);
    }

    /* renamed from: L4 */
    private final void m67599L4(String str, Boolean bool, String str2, String str3, String str4, C20884d dVar) {
        Integer num;
        Boolean bool2 = bool;
        this.f56190I = dVar;
        C10277c.C10278a aVar = C10277c.f28509D;
        AdditionalAction[] additionalActionArr = new AdditionalAction[2];
        C20882c cVar = C20882c.YES;
        Integer num2 = null;
        if (C41536l.m120484d(bool2, Boolean.TRUE)) {
            num = Integer.valueOf(C17780e.f49647B);
        } else {
            num = null;
        }
        additionalActionArr[0] = new AdditionalAction(str2, cVar, 0, num, (Integer) null, 20, (DefaultConstructorMarker) null);
        C20882c cVar2 = C20882c.NO;
        if (C41536l.m120484d(bool2, Boolean.FALSE)) {
            num2 = Integer.valueOf(C17780e.f49647B);
        }
        additionalActionArr[1] = new AdditionalAction(str3, cVar2, 0, num2, (Integer) null, 20, (DefaultConstructorMarker) null);
        C10277c.C10278a.m37472b(aVar, str, C41341q.m119910m(additionalActionArr), str4, (C16686a) null, 8, (Object) null).mo4576A1(getSupportFragmentManager(), "Additional_action");
    }

    /* renamed from: M3 */
    private final void m67601M3(LoanOfferCard loanOfferCard) {
        String str;
        double d;
        double d2;
        ConsumerLoanDetailsViewModel O3 = m67607O3();
        LimitLoanDecisionDetails limitLoanDecisionDetails = this.f56193L;
        if (limitLoanDecisionDetails == null) {
            C41536l.m120506z("offerDetails");
            limitLoanDecisionDetails = null;
        }
        String valueOf = String.valueOf(limitLoanDecisionDetails.decisionNo);
        LimitLoanDecisionDetails limitLoanDecisionDetails2 = this.f56193L;
        if (limitLoanDecisionDetails2 == null) {
            C41536l.m120506z("offerDetails");
            limitLoanDecisionDetails2 = null;
        }
        String str2 = limitLoanDecisionDetails2.decisionScheme;
        C41536l.m120486f(str2);
        String pan2 = loanOfferCard.getPan2();
        C41536l.m120488h(pan2, "card.pan2");
        LimitLoanDecisionDetails limitLoanDecisionDetails3 = this.f56193L;
        if (limitLoanDecisionDetails3 == null) {
            C41536l.m120506z("offerDetails");
            limitLoanDecisionDetails3 = null;
        }
        String str3 = limitLoanDecisionDetails3.operationType;
        C41536l.m120486f(str3);
        LimitLoanDecisionDetails limitLoanDecisionDetails4 = this.f56193L;
        if (limitLoanDecisionDetails4 == null) {
            C41536l.m120506z("offerDetails");
            limitLoanDecisionDetails4 = null;
        }
        String str4 = limitLoanDecisionDetails4.loanCcy;
        C41536l.m120486f(str4);
        List list = this.f56206Y;
        if (list == null) {
            C41536l.m120506z("termsToSelect");
            list = null;
        }
        String str5 = (String) list.get(this.f56203V);
        if (this.f56198Q) {
            str = "";
        } else {
            List list2 = this.f56207Z;
            if (list2 == null) {
                C41536l.m120506z("datesToSelect");
                list2 = null;
            }
            str = (String) list2.get(this.f56204W);
        }
        BigDecimal bigDecimal = this.f56202U;
        if (bigDecimal == null) {
            C41536l.m120506z("amountValue");
            bigDecimal = null;
        }
        OfferProductCode offerProductCode = this.f56215h0;
        if (offerProductCode == null) {
            C41536l.m120506z("productCode");
            offerProductCode = null;
        }
        String a = offerProductCode.mo51954a();
        LimitLoanDecisionDetails limitLoanDecisionDetails5 = this.f56193L;
        if (limitLoanDecisionDetails5 == null) {
            C41536l.m120506z("offerDetails");
            limitLoanDecisionDetails5 = null;
        }
        int i = limitLoanDecisionDetails5.conditionDays;
        LimitLoanDecisionDetails limitLoanDecisionDetails6 = this.f56193L;
        if (limitLoanDecisionDetails6 == null) {
            C41536l.m120506z("offerDetails");
            limitLoanDecisionDetails6 = null;
        }
        BigDecimal bigDecimal2 = limitLoanDecisionDetails6.drawAmount;
        if (bigDecimal2 != null) {
            d = bigDecimal2.doubleValue();
        } else {
            d = 0.0d;
        }
        LimitLoanDecisionDetails limitLoanDecisionDetails7 = this.f56193L;
        if (limitLoanDecisionDetails7 == null) {
            C41536l.m120506z("offerDetails");
            limitLoanDecisionDetails7 = null;
        }
        BigDecimal bigDecimal3 = limitLoanDecisionDetails7.drawAmount2;
        if (bigDecimal3 != null) {
            d2 = bigDecimal3.doubleValue();
        } else {
            d2 = 0.0d;
        }
        O3.mo49904xx("123123", valueOf, str2, pan2, str3, str4, str5, str, bigDecimal, "LND_OFFER_CONSUMER", a, i, d, d2);
    }

    /* renamed from: M4 */
    private final void m67602M4() {
        C27608d.C27609a aVar = C27608d.f70544E;
        C28256b bVar = this.f56200S;
        if (bVar == null) {
            C41536l.m120506z("limitLoanDecision");
            bVar = null;
        }
        List<ProviderInfoUiModel> d = bVar.mo67821d();
        ConsumerLoanDetailsViewModel O3 = m67607O3();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(d, 10));
        for (ProviderInfoUiModel jy : d) {
            arrayList.add(O3.mo49890jy(jy));
        }
        aVar.mo66980a(arrayList).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public final C32184h0 m67604N3() {
        return (C32184h0) this.f56221n0.getValue();
    }

    /* renamed from: N4 */
    private final void m67605N4() {
        m67589I3().f70003O.setVisibility(8);
        m67589I3().f69997I.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: O3 */
    public final ConsumerLoanDetailsViewModel m67607O3() {
        return (ConsumerLoanDetailsViewModel) this.f56218k0.getValue();
    }

    /* renamed from: O4 */
    private final void m67608O4(String str) {
        BogTextView bogTextView = (BogTextView) findViewById(C10322k.horizontal_error_description_text);
        if (bogTextView != null) {
            bogTextView.setText(str);
        }
        m67589I3().f69997I.setVisibility(8);
        m67589I3().f70003O.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: P3 */
    public final void m67610P3(C37223a aVar) {
        C31549a aVar2 = (C31549a) aVar.mo90296a();
        if (aVar2 != null) {
            if (aVar2.mo71952a() == ConsumerLoanDetailsViewModel.C20943b.REGISTRATION) {
                m67663o4(aVar2);
            } else {
                ConsumerLoanDetailsViewModel.m67812dy(m67607O3(), (String) null, (String) null, (String) null, 7, (Object) null);
            }
        }
    }

    /* renamed from: P4 */
    static /* synthetic */ void m67611P4(ConsumerLoanDetailsActivity consumerLoanDetailsActivity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = C32343x.m95452h0(C10328q.common_text_data_wont_load_retry, new Object[0]);
        }
        consumerLoanDetailsActivity.m67608O4(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q3 */
    public final void m67613Q3(C37223a aVar) {
        ConsumerLoanDetailsViewModel.C20943b bVar = (ConsumerLoanDetailsViewModel.C20943b) aVar.mo90296a();
        if (bVar != null) {
            if (bVar == ConsumerLoanDetailsViewModel.C20943b.REGISTRATION) {
                m67663o4(new C31549a((String) null, (String) null, (String) null, bVar));
            } else {
                m67607O3().mo49871Tw();
            }
        }
    }

    /* renamed from: Q4 */
    private final void m67614Q4() {
        TextTypeView textTypeView = m67589I3().f69999K;
        LimitLoanDecisionDetails limitLoanDecisionDetails = this.f56193L;
        LimitLoanDecisionDetails limitLoanDecisionDetails2 = null;
        if (limitLoanDecisionDetails == null) {
            C41536l.m120506z("offerDetails");
            limitLoanDecisionDetails = null;
        }
        BigDecimal bigDecimal = limitLoanDecisionDetails.rfncAmount;
        LimitLoanDecisionDetails limitLoanDecisionDetails3 = this.f56193L;
        if (limitLoanDecisionDetails3 == null) {
            C41536l.m120506z("offerDetails");
            limitLoanDecisionDetails3 = null;
        }
        textTypeView.setValueText(C32303f.m95203n(bigDecimal, limitLoanDecisionDetails3.loanCcy));
        TextTypeView textTypeView2 = m67589I3().f70015e;
        LimitLoanDecisionDetails limitLoanDecisionDetails4 = this.f56193L;
        if (limitLoanDecisionDetails4 == null) {
            C41536l.m120506z("offerDetails");
            limitLoanDecisionDetails4 = null;
        }
        BigDecimal bigDecimal2 = limitLoanDecisionDetails4.comisAmount;
        LimitLoanDecisionDetails limitLoanDecisionDetails5 = this.f56193L;
        if (limitLoanDecisionDetails5 == null) {
            C41536l.m120506z("offerDetails");
            limitLoanDecisionDetails5 = null;
        }
        textTypeView2.setValueText(C32303f.m95203n(bigDecimal2, limitLoanDecisionDetails5.loanCcy));
        TextTypeView textTypeView3 = m67589I3().f70026p;
        LimitLoanDecisionDetails limitLoanDecisionDetails6 = this.f56193L;
        if (limitLoanDecisionDetails6 == null) {
            C41536l.m120506z("offerDetails");
            limitLoanDecisionDetails6 = null;
        }
        BigDecimal bigDecimal3 = limitLoanDecisionDetails6.keepAmount;
        LimitLoanDecisionDetails limitLoanDecisionDetails7 = this.f56193L;
        if (limitLoanDecisionDetails7 == null) {
            C41536l.m120506z("offerDetails");
        } else {
            limitLoanDecisionDetails2 = limitLoanDecisionDetails7;
        }
        textTypeView3.setValueText(C32303f.m95203n(bigDecimal3, limitLoanDecisionDetails2.loanCcy));
    }

    /* renamed from: R3 */
    private final void m67616R3() {
        m67589I3().f69997I.setVisibility(8);
    }

    /* renamed from: S3 */
    private final void m67618S3() {
        m67589I3().f70003O.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (kotlin.jvm.internal.C41536l.m120484d(r8, r1) == false) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008e  */
    /* renamed from: T3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m67620T3(java.lang.Boolean r7, java.lang.Boolean r8, p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.InsuranceProviderUiModel r9) {
        /*
            r6 = this;
            p90.v r0 = r6.m67589I3()
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r0 = r0.f69989A
            java.lang.String r1 = "binding.loanInsuranceProvider"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            sr.b r1 = r6.f56200S
            r2 = 0
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = "limitLoanDecision"
            kotlin.jvm.internal.C41536l.m120506z(r1)
            r1 = r2
        L_0x0016:
            java.util.List r1 = r1.mo67821d()
            boolean r1 = r1.isEmpty()
            r3 = 1
            r1 = r1 ^ r3
            r4 = 0
            if (r1 == 0) goto L_0x0032
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r7, r1)
            if (r5 != 0) goto L_0x0033
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r8, r1)
            if (r1 == 0) goto L_0x0032
            goto L_0x0033
        L_0x0032:
            r3 = r4
        L_0x0033:
            r1 = 2
            g91.C32343x.m95483r1(r0, r3, r4, r1, r2)
            p90.v r0 = r6.m67589I3()
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r0 = r0.f70035y
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r8, r1)
            if (r1 == 0) goto L_0x004e
            java.lang.String r1 = "offers.loan.details.insurance.block.field.label.payment.insurance.Y"
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r1 = g91.C32343x.m95388F(r1, r3)
            goto L_0x0063
        L_0x004e:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r8, r1)
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = "offers.loan.details.insurance.block.field.label.payment.insurance.N"
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r1 = g91.C32343x.m95388F(r1, r3)
            goto L_0x0063
        L_0x005f:
            if (r8 != 0) goto L_0x009d
            java.lang.String r1 = ""
        L_0x0063:
            r0.setValueTextIgnoringEmpty(r1)
            p90.v r0 = r6.m67589I3()
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r0.f70027q
            ge.bog.mobilebank.model.offers.LimitLoanDecisionDetails r1 = r6.f56193L
            if (r1 != 0) goto L_0x0076
            java.lang.String r1 = "offerDetails"
            kotlin.jvm.internal.C41536l.m120506z(r1)
            goto L_0x0077
        L_0x0076:
            r2 = r1
        L_0x0077:
            java.lang.String r1 = r2.insIncFlag
            hd0.b r2 = hd0.C24978b.NO
            java.lang.String r2 = r2.mo63391e()
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r1, r2)
            if (r1 == 0) goto L_0x008e
            java.lang.String r1 = "offers.loan.details.info.message.ins.life"
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r1 = g91.C32343x.m95388F(r1, r2)
            goto L_0x0096
        L_0x008e:
            java.lang.String r1 = "offers.loan.details.info.message.ins.life.and.income"
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r1 = g91.C32343x.m95388F(r1, r2)
        L_0x0096:
            r0.setText(r1)
            r6.m67581F4(r9, r7, r8)
            return
        L_0x009d:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity.m67620T3(java.lang.Boolean, java.lang.Boolean, ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.InsuranceProviderUiModel):void");
    }

    /* renamed from: U3 */
    private final boolean m67622U3(C28258d dVar) {
        boolean z;
        boolean z2;
        boolean z3;
        LimitLoanDecisionDetails limitLoanDecisionDetails = this.f56193L;
        C28256b bVar = null;
        if (limitLoanDecisionDetails == null) {
            C41536l.m120506z("offerDetails");
            limitLoanDecisionDetails = null;
        }
        if (limitLoanDecisionDetails.insLifeAmount.compareTo(BigDecimal.ZERO) <= 0 || dVar.mo67836f() != null) {
            z = true;
        } else {
            z = false;
        }
        LimitLoanDecisionDetails limitLoanDecisionDetails2 = this.f56193L;
        if (limitLoanDecisionDetails2 == null) {
            C41536l.m120506z("offerDetails");
            limitLoanDecisionDetails2 = null;
        }
        if (!limitLoanDecisionDetails2.isInsuranceAvailable() || dVar.mo67834e() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C28256b bVar2 = this.f56200S;
        if (bVar2 == null) {
            C41536l.m120506z("limitLoanDecision");
        } else {
            bVar = bVar2;
        }
        if (!bVar.mo67821d().isEmpty()) {
            Boolean f = dVar.mo67836f();
            Boolean bool = Boolean.TRUE;
            if ((C41536l.m120484d(f, bool) || C41536l.m120484d(dVar.mo67834e(), bool)) && dVar.mo67833d() == null) {
                z3 = false;
                if (z || !z2 || !z3) {
                    return false;
                }
                return true;
            }
        }
        z3 = true;
        return z ? false : false;
    }

    /* access modifiers changed from: private */
    /* renamed from: V3 */
    public final void m67624V3() {
        if (!this.f56208a0) {
            ConsumerLoanDetailsViewModel O3 = m67607O3();
            String str = this.f56214g0;
            C27088c cVar = null;
            if (str == null) {
                C41536l.m120506z("offerNo");
                str = null;
            }
            C27088c cVar2 = this.f56216i0;
            if (cVar2 == null) {
                C41536l.m120506z("operationType");
            } else {
                cVar = cVar2;
            }
            O3.mo49870Qx(str, cVar.mo66359b());
        } else if (this.f56209b0 && this.f56210c0) {
            m67572C3(false);
        }
    }

    /* renamed from: W3 */
    private final void m67626W3(LiveData liveData, C43075l lVar) {
        C21484c.m69411c(liveData, this, lVar, new C20911p0(this), new C20913q0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: X3 */
    public final void m67628X3(Enum enumR) {
        C20884d dVar;
        if ((enumR instanceof C20882c) && (dVar = this.f56190I) != null) {
            dVar.mo49772a((C20882c) enumR);
        }
        C10277c cVar = (C10277c) getSupportFragmentManager().mo4418k0("Additional_action");
        if (cVar != null) {
            cVar.mo4577k1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y3 */
    public final void m67630Y3(C26261e eVar) {
        Object obj;
        C28256b c = eVar.mo65389c();
        InsuranceProviderUiModel insuranceProviderUiModel = null;
        if (eVar.mo65389c().mo67824f() != -202) {
            this.f56210c0 = false;
            this.f56220m0 = C20878a.CHECK_DECISION;
            this.f56191J = true;
            this.f56200S = eVar.mo65389c();
            LimitLoanDecisionDetails a = c.mo67818a();
            LimitLoanDecisionDetails limitLoanDecisionDetails = this.f56193L;
            if (limitLoanDecisionDetails == null) {
                C41536l.m120506z("offerDetails");
                limitLoanDecisionDetails = null;
            }
            m67580F3(a, limitLoanDecisionDetails);
            m67589I3().f70015e.setValueText(C32303f.m95203n(c.mo67818a().comisAmount, c.mo67818a().loanCcy));
            m67589I3().f70026p.setValueText(C32303f.m95203n(c.mo67818a().keepAmount, c.mo67818a().loanCcy));
            List m = C41341q.m119910m(C27088c.BOG_AND_OTHER_BANK_REFINANCING_LOAN, C27088c.BOG_REFINANCING_LOAN);
            C27088c cVar = this.f56216i0;
            if (cVar == null) {
                C41536l.m120506z("operationType");
                cVar = null;
            }
            if (m.contains(cVar)) {
                m67589I3().f69999K.setValueText(C32303f.m95203n(c.mo67818a().rfncAmount, c.mo67818a().loanCcy));
                ConsumerLoanDetailsViewModel O3 = m67607O3();
                C27088c cVar2 = this.f56216i0;
                if (cVar2 == null) {
                    C41536l.m120506z("operationType");
                    cVar2 = null;
                }
                O3.mo49873Ww(cVar2, eVar.mo65389c().mo67822e());
            }
            InsuranceProviderUiModel insuranceProviderUiModel2 = this.f56213f0;
            if (insuranceProviderUiModel2 != null) {
                Iterator it = c.mo67821d().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C41536l.m120484d(((ProviderInfoUiModel) obj).mo49845d(), insuranceProviderUiModel2.mo49826b())) {
                        break;
                    }
                }
                ProviderInfoUiModel providerInfoUiModel = (ProviderInfoUiModel) obj;
                if (providerInfoUiModel != null) {
                    insuranceProviderUiModel = m67607O3().mo49890jy(providerInfoUiModel);
                }
            }
            this.f56213f0 = insuranceProviderUiModel;
            if (insuranceProviderUiModel != null) {
                m67581F4(insuranceProviderUiModel, this.f56211d0, this.f56212e0);
            }
            m67589I3().f69995G.setButtonText(C32343x.m95452h0(C10328q.button_text_continue, new Object[0]));
            if (eVar.mo65388b()) {
                m67601M3(eVar.mo65387a());
            }
        } else if (c.mo67818a().minLoanAmount == null || c.mo67818a().maxLoanAmount == null) {
            String string = getString(C10328q.f28940T1);
            C41536l.m120488h(string, "getString(R.string.common_text_error_loading_data)");
            C12910e.m48790h(this, string, (C12902d.C12905b) null, false, 6, (Object) null);
        } else {
            C27612f.C27613a aVar = C27612f.f70550J;
            String bigDecimal = c.mo67818a().minLoanAmount.toString();
            C41536l.m120488h(bigDecimal, "details.minLoanAmount.toString()");
            String bigDecimal2 = c.mo67818a().maxLoanAmount.toString();
            C41536l.m120488h(bigDecimal2, "details.maxLoanAmount.toString()");
            aVar.mo66983a(bigDecimal, bigDecimal2).mo4576A1(getSupportFragmentManager(), (String) null);
        }
    }

    /* renamed from: Z3 */
    private final void m67632Z3(LoanOfferCard loanOfferCard) {
        OfferProductCode offerProductCode;
        String str;
        LimitLoanDecisionDetails limitLoanDecisionDetails = this.f56193L;
        C27088c cVar = null;
        if (limitLoanDecisionDetails == null) {
            C41536l.m120506z("offerDetails");
            limitLoanDecisionDetails = null;
        }
        if (C41536l.m120484d(limitLoanDecisionDetails.operationType, "P")) {
            C28256b bVar = this.f56200S;
            if (bVar == null) {
                C41536l.m120506z("limitLoanDecision");
                bVar = null;
            }
            bVar.mo67818a().rfncAmount = null;
            C28256b bVar2 = this.f56200S;
            if (bVar2 == null) {
                C41536l.m120506z("limitLoanDecision");
                bVar2 = null;
            }
            bVar2.mo67818a().keepAmount = null;
        }
        ConsumerLoanActivationResult.C35694a aVar = ConsumerLoanActivationResult.f86289r;
        C28256b bVar3 = this.f56200S;
        if (bVar3 == null) {
            C41536l.m120506z("limitLoanDecision");
            bVar3 = null;
        }
        LimitLoanDecisionDetails a = bVar3.mo67818a();
        OfferProductCode offerProductCode2 = this.f56215h0;
        if (offerProductCode2 == null) {
            C41536l.m120506z("productCode");
            offerProductCode = null;
        } else {
            offerProductCode = offerProductCode2;
        }
        Boolean bool = this.f56211d0;
        Boolean bool2 = this.f56212e0;
        InsuranceProviderUiModel insuranceProviderUiModel = this.f56213f0;
        if (insuranceProviderUiModel != null) {
            str = insuranceProviderUiModel.mo49829e();
        } else {
            str = null;
        }
        ConsumerLoanActivationResult a2 = aVar.mo86846a(a, loanOfferCard, offerProductCode, bool, bool2, str);
        OfferProductCode offerProductCode3 = this.f56215h0;
        if (offerProductCode3 == null) {
            C41536l.m120506z("productCode");
            offerProductCode3 = null;
        }
        C32306g0.m95221b("consumer_loan_activated", offerProductCode3.mo51954a());
        ConsumerLoanActivationResultActivity.C20875a.m67564b(ConsumerLoanActivationResultActivity.f56181I, this, a2, false, 4, (Object) null);
        C36546y.m108282F().mo27137H("activate_consumer_loan_offer", "", "", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
        C10463g F = C36546y.m108282F();
        OfferProductCode offerProductCode4 = this.f56215h0;
        if (offerProductCode4 == null) {
            C41536l.m120506z("productCode");
            offerProductCode4 = null;
        }
        C27088c cVar2 = this.f56216i0;
        if (cVar2 == null) {
            C41536l.m120506z("operationType");
        } else {
            cVar = cVar2;
        }
        F.mo27152s("offers", offerProductCode4 + "_" + cVar, "activate_offer");
        C36546y.m108282F().mo27149p("activate_consumer_loan_offer");
    }

    /* access modifiers changed from: private */
    /* renamed from: a4 */
    public static final void m67634a4(ConsumerLoanDetailsActivity consumerLoanDetailsActivity, View view) {
        C41536l.m120489i(consumerLoanDetailsActivity, "this$0");
        consumerLoanDetailsActivity.m67602M4();
    }

    /* access modifiers changed from: private */
    /* renamed from: b4 */
    public final void m67636b4(StatusEntity statusEntity) {
        C32297d.m95160h(this, C32343x.m95388F("credit.info.check.permission.enabled", new Object[0]));
        ConsumerLoanDetailsViewModel O3 = m67607O3();
        String str = this.f56214g0;
        C27088c cVar = null;
        if (str == null) {
            C41536l.m120506z("offerNo");
            str = null;
        }
        C27088c cVar2 = this.f56216i0;
        if (cVar2 == null) {
            C41536l.m120506z("operationType");
        } else {
            cVar = cVar2;
        }
        O3.mo49870Qx(str, cVar.mo66359b());
    }

    /* renamed from: c4 */
    private final void m67638c4() {
        boolean z;
        String str;
        LimitLoanDecisionDetails limitLoanDecisionDetails = this.f56193L;
        C27088c cVar = null;
        if (limitLoanDecisionDetails == null) {
            C41536l.m120506z("offerDetails");
            limitLoanDecisionDetails = null;
        }
        BigDecimal bigDecimal = limitLoanDecisionDetails.loanAmount;
        if (bigDecimal == null) {
            bigDecimal = BigDecimal.ZERO;
            C41536l.m120488h(bigDecimal, "ZERO");
        }
        this.f56202U = bigDecimal;
        LimitLoanDecisionDetails limitLoanDecisionDetails2 = this.f56193L;
        if (limitLoanDecisionDetails2 == null) {
            C41536l.m120506z("offerDetails");
            limitLoanDecisionDetails2 = null;
        }
        int intValue = limitLoanDecisionDetails2.minTerm.intValue();
        LimitLoanDecisionDetails limitLoanDecisionDetails3 = this.f56193L;
        if (limitLoanDecisionDetails3 == null) {
            C41536l.m120506z("offerDetails");
            limitLoanDecisionDetails3 = null;
        }
        C43420e eVar = new C43420e(intValue, limitLoanDecisionDetails3.loanTerm);
        ArrayList arrayList = new ArrayList(C41343r.m119925u(eVar, 10));
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((C41330k0) it).nextInt()));
        }
        this.f56206Y = arrayList;
        this.f56203V = arrayList.size() - 1;
        String str2 = this.f56188G;
        int i = 0;
        if (str2 != null) {
            C27442v I3 = m67589I3();
            LinearLayout linearLayout = I3.f70006R;
            C41536l.m120488h(linearLayout, "successView");
            C32343x.m95447f1(linearLayout);
            LinearLayout linearLayout2 = I3.f70021k;
            C41536l.m120488h(linearLayout2, "detailsView");
            C32343x.m95455i0(linearLayout2);
            I3.f70002N.setText(C32343x.m95388F("loan.offer.details.page.congrats", new Object[0]));
            TextView textView = I3.f70032v;
            LimitLoanDecisionDetails limitLoanDecisionDetails4 = this.f56193L;
            if (limitLoanDecisionDetails4 == null) {
                C41536l.m120506z("offerDetails");
                limitLoanDecisionDetails4 = null;
            }
            BigDecimal bigDecimal2 = limitLoanDecisionDetails4.loanAmount;
            if (bigDecimal2 != null) {
                C41536l.m120488h(bigDecimal2, "loanAmount");
                LimitLoanDecisionDetails limitLoanDecisionDetails5 = this.f56193L;
                if (limitLoanDecisionDetails5 == null) {
                    C41536l.m120506z("offerDetails");
                    limitLoanDecisionDetails5 = null;
                }
                String str3 = limitLoanDecisionDetails5.loanCcy;
                C41536l.m120488h(str3, "offerDetails.loanCcy");
                str = C32343x.m95408P(bigDecimal2, str3);
            } else {
                str = null;
            }
            textView.setText(str);
            I3.f69991C.setText(C32343x.m95388F("loan.offer.details.page.approved.amount", new Object[0]));
            TextView textView2 = I3.f69990B;
            BigDecimal bigDecimal3 = new BigDecimal(str2);
            LimitLoanDecisionDetails limitLoanDecisionDetails6 = this.f56193L;
            if (limitLoanDecisionDetails6 == null) {
                C41536l.m120506z("offerDetails");
                limitLoanDecisionDetails6 = null;
            }
            String str4 = limitLoanDecisionDetails6.loanCcy;
            C41536l.m120488h(str4, "offerDetails.loanCcy");
            textView2.setText(C32343x.m95408P(bigDecimal3, str4));
        }
        C43420e eVar2 = new C43420e(1, 26);
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(eVar2, 10));
        Iterator it2 = eVar2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(String.valueOf(((C41330k0) it2).nextInt()));
        }
        this.f56207Z = arrayList2;
        LimitLoanDecisionDetails limitLoanDecisionDetails7 = this.f56193L;
        if (limitLoanDecisionDetails7 == null) {
            C41536l.m120506z("offerDetails");
            limitLoanDecisionDetails7 = null;
        }
        Integer num = limitLoanDecisionDetails7.payDay;
        if (num != null) {
            int intValue2 = num.intValue();
            if (1 > intValue2 || intValue2 >= 27) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i = intValue2 - 1;
            }
            this.f56204W = i;
        }
        C27088c cVar2 = this.f56216i0;
        if (cVar2 == null) {
            C41536l.m120506z("operationType");
        } else {
            cVar = cVar2;
        }
        if (cVar == C27088c.BOG_AND_OTHER_BANK_REFINANCING_LOAN) {
            this.f56205X = -1;
        }
        m67571B4();
    }

    /* access modifiers changed from: private */
    /* renamed from: d4 */
    public final void m67640d4(C28255a aVar) {
        C28256b b = aVar.mo67814b();
        this.f56191J = false;
        this.f56200S = b;
        this.f56208a0 = true;
        this.f56193L = b.mo67818a();
        this.f56194M = b.mo67822e();
        this.f56195N = b.mo67829j();
        this.f56196O = b.mo67828i();
        this.f56197P = b.mo67819b();
        this.f56198Q = b.mo67820c();
        ConsumerLoanDetailsViewModel O3 = m67607O3();
        LimitLoanDecisionDetails limitLoanDecisionDetails = this.f56193L;
        if (limitLoanDecisionDetails == null) {
            C41536l.m120506z("offerDetails");
            limitLoanDecisionDetails = null;
        }
        O3.mo49885gy(limitLoanDecisionDetails);
        this.f56220m0 = C20878a.GET_DECISION;
        this.f56209b0 = true;
        this.f56201T = aVar.mo67813a();
        m67638c4();
    }

    /* renamed from: e4 */
    private final void m67642e4() {
    }

    /* access modifiers changed from: private */
    /* renamed from: f4 */
    public final void m67644f4(C37223a aVar) {
        Boolean bool = (Boolean) aVar.mo90296a();
        if (bool != null) {
            m67646g4(bool.booleanValue());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g4 */
    public final void m67646g4(boolean z) {
        m67683y4(z);
        if (z) {
            m67605N4();
        } else {
            m67616R3();
        }
    }

    /* renamed from: h4 */
    private final void m67648h4() {
        m67599L4(C32343x.m95388F("offers.loan.details.insurance.block.field.label.payment.insurance", new Object[0]), this.f56212e0, C32343x.m95388F("offers.loan.details.insurance.block.field.label.payment.insurance.Y", new Object[0]), C32343x.m95388F("offers.loan.details.insurance.block.field.label.payment.insurance.N", new Object[0]), C32343x.m95420V("offers.loan.details.payment.insurance.action.sheet.info", C32343x.m95452h0(C10328q.payment_protection_insurance_description, new Object[0]), new Object[0]), new C20931a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: i4 */
    public static final void m67650i4(ConsumerLoanDetailsActivity consumerLoanDetailsActivity, C20882c cVar) {
        boolean z;
        C41536l.m120489i(consumerLoanDetailsActivity, "this$0");
        C41536l.m120489i(cVar, "it");
        ConsumerLoanDetailsViewModel O3 = consumerLoanDetailsActivity.m67607O3();
        if (cVar == C20882c.YES) {
            z = true;
        } else {
            z = false;
        }
        O3.mo49877Zx(z);
        consumerLoanDetailsActivity.m67602M4();
    }

    /* access modifiers changed from: private */
    /* renamed from: j4 */
    public final void m67652j4() {
        List list = this.f56201T;
        if (list == null) {
            C41536l.m120506z("cards");
            list = null;
        }
        m67632Z3((LoanOfferCard) list.get(this.f56205X));
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: k4 */
    public final void m67654k4(C25950a aVar) {
        C10463g F = C36546y.m108282F();
        OfferProductCode offerProductCode = this.f56215h0;
        C28256b bVar = null;
        if (offerProductCode == null) {
            C41536l.m120506z("productCode");
            offerProductCode = null;
        }
        C27088c cVar = this.f56216i0;
        if (cVar == null) {
            C41536l.m120506z("operationType");
            cVar = null;
        }
        F.mo27152s("offers", offerProductCode + "_" + cVar, "open_offer_precontract");
        C41550z zVar = new C41550z();
        if (this.f56198Q) {
            C28256b bVar2 = this.f56200S;
            if (bVar2 == null) {
                C41536l.m120506z("limitLoanDecision");
                bVar2 = null;
            }
            zVar.f97717d = bVar2.mo67825g();
        }
        this.f56192K = new C20915r0(aVar, this, zVar);
        C28256b bVar3 = this.f56200S;
        if (bVar3 == null) {
            C41536l.m120506z("limitLoanDecision");
            bVar3 = null;
        }
        BigDecimal bigDecimal = bVar3.mo67818a().drawAmount;
        C41536l.m120486f(bigDecimal);
        C28256b bVar4 = this.f56200S;
        if (bVar4 == null) {
            C41536l.m120506z("limitLoanDecision");
            bVar4 = null;
        }
        BigDecimal bigDecimal2 = bVar4.mo67818a().loanAmount;
        C41536l.m120486f(bigDecimal2);
        if (bigDecimal.compareTo(bigDecimal2) < 0) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
            LoanImportantTermFragment loanImportantTermFragment = this.f56219l0;
            int i = C10322k.fragmentContainer;
            C28256b bVar5 = this.f56200S;
            if (bVar5 == null) {
                C41536l.m120506z("limitLoanDecision");
                bVar5 = null;
            }
            String str = bVar5.mo67818a().loanCcy;
            C41536l.m120486f(str);
            C28256b bVar6 = this.f56200S;
            if (bVar6 == null) {
                C41536l.m120506z("limitLoanDecision");
                bVar6 = null;
            }
            BigDecimal bigDecimal3 = bVar6.mo67818a().loanAmount;
            C41536l.m120486f(bigDecimal3);
            double doubleValue = bigDecimal3.doubleValue();
            C28256b bVar7 = this.f56200S;
            if (bVar7 == null) {
                C41536l.m120506z("limitLoanDecision");
                bVar7 = null;
            }
            BigDecimal bigDecimal4 = bVar7.mo67818a().drawAmount;
            C41536l.m120486f(bigDecimal4);
            double doubleValue2 = bigDecimal4.doubleValue();
            C28256b bVar8 = this.f56200S;
            if (bVar8 == null) {
                C41536l.m120506z("limitLoanDecision");
            } else {
                bVar = bVar8;
            }
            BigDecimal bigDecimal5 = bVar.mo67818a().drawAmount2;
            C41536l.m120486f(bigDecimal5);
            this.f56219l0 = C20932b.m67745c(supportFragmentManager, loanImportantTermFragment, i, str, doubleValue, doubleValue2, bigDecimal5.doubleValue());
            return;
        }
        this.f56192K.invoke();
    }

    /* renamed from: l1 */
    private final void m67655l1() {
        ConsumerLoanDetailsViewModel O3 = m67607O3();
        O3.mo49887ix().mo4819k(this, new C20932b.C20933a(new C20910p(this)));
        C37224b.m109963b(O3.mo49897qx(), this, new C20924w(this));
        O3.mo49900tx().mo4819k(this, new C20932b.C20933a(new C20926x(this)));
        O3.mo49893mx().mo4819k(this, new C20932b.C20933a(new C20928y(this)));
        O3.mo49886hx().mo4819k(this, new C20932b.C20933a(new C20930z(this)));
        m67626W3(O3.mo49882fx(), new C20879a0(this));
        O3.mo49891kx().mo4819k(this, new C20932b.C20933a(new C20881b0(this)));
        m67626W3(O3.mo49896px(), new C20883c0(this));
        O3.mo49899sx().mo4819k(this, new C20932b.C20933a(new C20885d0(this)));
        m67626W3(O3.mo49889jx(), new C20888f(this));
        O3.mo49898rx().mo4819k(this, new C20932b.C20933a(new C20890g(this)));
        O3.mo49884gx().mo4819k(this, new C20932b.C20933a(new C20892h(this)));
        O3.mo49895ox().mo4819k(this, new C20932b.C20933a(new C20894i(this)));
        O3.mo49902vx().mo4819k(this, new C20932b.C20933a(new C20896j(this)));
        O3.mo49903wx().mo4819k(this, new C20932b.C20933a(new C20898k(this)));
        C21484c.m69411c(O3.mo49894nx(), this, new C20900l(this), new C20902m(this), new C20904n(this));
        C21484c.m69411c(O3.mo49876Zw(), this, new C20914r(this), new C20908o(this), new C20912q(this));
        O3.mo49875Yw().mo4819k(this, new C20932b.C20933a(new C20916s(this)));
        C21484c.m69411c(O3.mo49878ax(), this, new C20920u(this), new C20918t(this), new C20922v(this));
        C41205b F0 = m67607O3().mo49892lx().mo94981F0(new C27065g(new C20887e0(this)));
        C41536l.m120488h(F0, "viewModel.onInputValueUp…ibe(this::setInputValues)");
        mo86438k1(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: l4 */
    public final void m67657l4(C37223a aVar) {
        ConsumerLoanDetailsViewModel.C20945c cVar = (ConsumerLoanDetailsViewModel.C20945c) aVar.mo90296a();
        if (cVar != null) {
            int i = C20886e.f56230b[cVar.ordinal()];
            if (i == 1) {
                m67611P4(this, (String) null, 1, (Object) null);
            } else if (i != 2) {
                m67618S3();
            } else {
                m67608O4(C32343x.m95420V("offers.shadow.limit.CRI.permission.is.disabled", C32343x.m95452h0(C10328q.loan_error_no_credit_info, new Object[0]), new Object[0]));
                m67590I4();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m4 */
    public final void m67659m4(C37223a aVar) {
        boolean z;
        int i;
        ConsumerLoanDetailsViewModel.C20949e eVar = (ConsumerLoanDetailsViewModel.C20949e) aVar.mo90296a();
        if (eVar != null) {
            boolean z2 = true;
            if (eVar.mo49908a() != ConsumerLoanDetailsViewModel.C20947d.NONE) {
                z = true;
            } else {
                z = false;
            }
            if (!z && this.f56220m0 != C20878a.GET_DECISION) {
                z2 = false;
            }
            this.f56210c0 = z2;
            Button button = m67589I3().f69995G;
            if (this.f56210c0) {
                i = C10328q.recalculate;
            } else {
                i = C10328q.button_text_continue;
            }
            button.setButtonText(C32343x.m95452h0(i, new Object[0]));
            if (z) {
                m67574D3();
            } else if (this.f56191J) {
                m67614Q4();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n4 */
    public final void m67661n4(View view) {
        int i;
        if (this.f56209b0) {
            if (view.getTag() != null) {
                Object tag = view.getTag();
                C41536l.m120487g(tag, "null cannot be cast to non-null type kotlin.Int");
                i = ((Integer) tag).intValue();
            } else {
                i = -1;
            }
            if (C20932b.m67744b(i)) {
                C35893a.m106783a(this).mo88137d(AdvancedWizardActivity.class).mo88140g(m67577E3()).mo88136c(view).mo88141h(i).mo88139f(new OffersWizardPlugin()).mo88142i();
            }
        }
    }

    /* renamed from: o4 */
    private final void m67663o4(C31549a aVar) {
        String str;
        LimitLoanDecisionDetails limitLoanDecisionDetails = this.f56193L;
        List list = null;
        if (limitLoanDecisionDetails == null) {
            C41536l.m120506z("offerDetails");
            limitLoanDecisionDetails = null;
        }
        ConsumerLoanDetailsViewModel O3 = m67607O3();
        String str2 = this.f56214g0;
        if (str2 == null) {
            C41536l.m120506z("offerNo");
            str = null;
        } else {
            str = str2;
        }
        String valueOf = String.valueOf(limitLoanDecisionDetails.decisionNo);
        String str3 = limitLoanDecisionDetails.decisionScheme;
        C41536l.m120486f(str3);
        List list2 = this.f56201T;
        if (list2 == null) {
            C41536l.m120506z("cards");
            list2 = null;
        }
        String pan2 = ((LoanOfferCard) list2.get(this.f56205X)).getPan2();
        C41536l.m120488h(pan2, "cards[selectedCardIndex].pan2");
        ConsumerLoanDetailsViewModel O32 = m67607O3();
        String str4 = this.f56214g0;
        if (str4 == null) {
            C41536l.m120506z("offerNo");
            str4 = null;
        }
        List list3 = this.f56201T;
        if (list3 == null) {
            C41536l.m120506z("cards");
        } else {
            list = list3;
        }
        String pan22 = ((LoanOfferCard) list.get(this.f56205X)).getPan2();
        C41536l.m120488h(pan22, "cards[selectedCardIndex].pan2");
        O3.mo49869Px(new C26266i("123123", str, valueOf, str3, pan2, O32.mo49863Cx(str4, pan22, aVar.mo71953b(), aVar.mo71954c(), aVar.mo71955d())));
    }

    /* renamed from: p4 */
    private final void m67665p4(C28258d dVar) {
        boolean z;
        Button button = m67589I3().f69995G;
        BigDecimal bigDecimal = this.f56202U;
        if (bigDecimal == null) {
            C41536l.m120506z("amountValue");
            bigDecimal = null;
        }
        if (bigDecimal.compareTo(BigDecimal.ZERO) <= 0 || !C20932b.m67744b(this.f56203V) || ((m67589I3().f69996H.isEditable() && !C20932b.m67744b(this.f56204W)) || !C20932b.m67744b(this.f56205X) || !m67622U3(dVar))) {
            z = false;
        } else {
            z = true;
        }
        button.setEnabled(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: q4 */
    public final void m67667q4(C28258d dVar) {
        String fileUrl;
        this.f56203V = dVar.mo67840i();
        this.f56204W = dVar.mo67838h();
        this.f56205X = dVar.mo67837g();
        this.f56202U = dVar.mo67832c();
        this.f56212e0 = dVar.mo67834e();
        this.f56211d0 = dVar.mo67836f();
        this.f56213f0 = dVar.mo67833d();
        TextTypeView textTypeView = m67589I3().f70031u;
        BigDecimal bigDecimal = this.f56202U;
        C41238w wVar = null;
        if (bigDecimal == null) {
            C41536l.m120506z("amountValue");
            bigDecimal = null;
        }
        LimitLoanDecisionDetails limitLoanDecisionDetails = this.f56193L;
        if (limitLoanDecisionDetails == null) {
            C41536l.m120506z("offerDetails");
            limitLoanDecisionDetails = null;
        }
        textTypeView.setValueText(C32303f.m95203n(bigDecimal, limitLoanDecisionDetails.loanCcy));
        if (C20932b.m67744b(this.f56203V)) {
            TextTypeView textTypeView2 = m67589I3().f69993E;
            List list = this.f56206Y;
            if (list == null) {
                C41536l.m120506z("termsToSelect");
                list = null;
            }
            textTypeView2.setValueText(list.get(this.f56203V) + " " + getString(C10328q.f28967t7));
        }
        if (C20932b.m67744b(this.f56204W)) {
            TextTypeView textTypeView3 = m67589I3().f69996H;
            List list2 = this.f56207Z;
            if (list2 == null) {
                C41536l.m120506z("datesToSelect");
                list2 = null;
            }
            textTypeView3.setValueText((String) list2.get(this.f56204W));
        }
        if (!C20932b.m67744b(this.f56205X)) {
            this.f56205X = -1;
        }
        if (C20932b.m67744b(this.f56205X)) {
            List list3 = this.f56201T;
            if (list3 == null) {
                C41536l.m120506z("cards");
                list3 = null;
            }
            LoanOfferCard loanOfferCard = (LoanOfferCard) list3.get(this.f56205X);
            CardExternalFile cardExternalFile = loanOfferCard.getCardExternalFile();
            if (!(cardExternalFile == null || (fileUrl = cardExternalFile.getFileUrl()) == null)) {
                m67589I3().f70033w.fetchLeftImageWithGlide(fileUrl);
                wVar = C41238w.f97225a;
            }
            if (wVar == null) {
                m67589I3().f70033w.setLeftDrawable(C32307h.m95224a(loanOfferCard.getSubProductCode()));
            }
            m67589I3().f70033w.setValueText(C32307h.m95232i(loanOfferCard.getLastFour()));
        } else {
            m67589I3().f70033w.removeLeftDrawable();
            m67589I3().f70033w.setValueTextIgnoringEmpty("");
        }
        m67620T3(dVar.mo67836f(), dVar.mo67834e(), dVar.mo67833d());
        m67665p4(dVar);
        m67568A3();
    }

    /* renamed from: r4 */
    private final void m67669r4() {
        boolean z;
        boolean z2;
        C28256b bVar = this.f56200S;
        if (bVar == null) {
            C41536l.m120506z("limitLoanDecision");
            bVar = null;
        }
        BigDecimal bigDecimal = bVar.mo67818a().insLifeAmount;
        if (bigDecimal == null) {
            bigDecimal = BigDecimal.ZERO;
        }
        if (bigDecimal.compareTo(BigDecimal.ZERO) > 0) {
            z = true;
        } else {
            z = false;
        }
        LimitLoanDecisionDetails limitLoanDecisionDetails = this.f56193L;
        if (limitLoanDecisionDetails == null) {
            C41536l.m120506z("offerDetails");
            limitLoanDecisionDetails = null;
        }
        boolean z3 = !C41536l.m120484d(limitLoanDecisionDetails.insIncFlag, "N");
        BogTextView bogTextView = m67589I3().f70027q;
        C41536l.m120488h(bogTextView, "binding.lifeInsurance");
        C32343x.m95483r1(bogTextView, z, false, 2, (Object) null);
        TextTypeView textTypeView = m67589I3().f70035y;
        C41536l.m120488h(textTypeView, "binding.loanInsurance");
        C32343x.m95483r1(textTypeView, z3, false, 2, (Object) null);
        LimitLoanDecisionDetails limitLoanDecisionDetails2 = this.f56193L;
        if (limitLoanDecisionDetails2 == null) {
            C41536l.m120506z("offerDetails");
            limitLoanDecisionDetails2 = null;
        }
        String str = limitLoanDecisionDetails2.insIncFlag;
        if (C41536l.m120484d(str, "Y")) {
            m67589I3().f70035y.disable(false);
            m67607O3().mo49877Zx(true);
        } else if (C41536l.m120484d(str, "X")) {
            m67589I3().f70035y.enable(true);
        }
        for (View view : C41341q.m119910m(m67589I3().f70036z, m67589I3().f70024n)) {
            C41536l.m120488h(view, "it");
            if (z || z3) {
                z2 = true;
            } else {
                z2 = false;
            }
            C32343x.m95483r1(view, z2, false, 2, (Object) null);
        }
        m67589I3().f70027q.setEnabled(false);
    }

    /* renamed from: s4 */
    private final void m67671s4() {
        m67589I3().f70023m.f68328f.mo3946b().setOnClickListener(new C27066h(this));
        m67589I3().f69995G.setOnClickListener(new C27067i(this));
        m67678w3("InsuranceProviderActionSheet.CHOSEN_PROVIDER", new C20919t0(this));
        m67678w3("LoanDecisionChangeAmountActionSheet.CHOSEN_PROVIDER", new C20921u0(this));
        m67678w3("AdditionalActionsActionSheet.REQUEST_TAG", new C20923v0(this));
        m67589I3().f70027q.setOnClickListener(new C27068j(this));
        m67589I3().f70035y.setOnClickListener(new C27069k(this));
        m67589I3().f70001M.setOnClickListener(new C27070l(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: t4 */
    public static final void m67673t4(ConsumerLoanDetailsActivity consumerLoanDetailsActivity, View view) {
        C41536l.m120489i(consumerLoanDetailsActivity, "this$0");
        consumerLoanDetailsActivity.m67624V3();
    }

    /* access modifiers changed from: private */
    /* renamed from: u4 */
    public static final void m67675u4(ConsumerLoanDetailsActivity consumerLoanDetailsActivity, View view) {
        C41536l.m120489i(consumerLoanDetailsActivity, "this$0");
        consumerLoanDetailsActivity.m67572C3(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: v4 */
    public static final void m67677v4(ConsumerLoanDetailsActivity consumerLoanDetailsActivity, View view) {
        C41536l.m120489i(consumerLoanDetailsActivity, "this$0");
        consumerLoanDetailsActivity.m67642e4();
    }

    /* renamed from: w3 */
    private final void m67678w3(String str, C43079p pVar) {
        getSupportFragmentManager().mo4367F1(str, this, new C27072n(pVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: w4 */
    public static final void m67679w4(ConsumerLoanDetailsActivity consumerLoanDetailsActivity, View view) {
        C41536l.m120489i(consumerLoanDetailsActivity, "this$0");
        consumerLoanDetailsActivity.m67648h4();
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public static final void m67680x3(C43079p pVar, String str, Bundle bundle) {
        C41536l.m120489i(pVar, "$tmp0");
        C41536l.m120489i(str, "p0");
        C41536l.m120489i(bundle, "p1");
        pVar.invoke(str, bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: x4 */
    public static final void m67681x4(ConsumerLoanDetailsActivity consumerLoanDetailsActivity, View view) {
        C41536l.m120489i(consumerLoanDetailsActivity, "this$0");
        consumerLoanDetailsActivity.m67607O3().mo49874Xx(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public static final void m67682y3(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: y4 */
    private final void m67683y4(boolean z) {
        C27113k L3 = m67598L3();
        if (L3 != null) {
            L3.mo66414v2(z);
        }
    }

    /* renamed from: z3 */
    private final void m67684z3(TextTypeView textTypeView, C43064a aVar, int i) {
        textTypeView.setLayoutColor(m67592J3(aVar, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (r9 != null) goto L_0x0057;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* renamed from: z4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m67685z4(p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.ProviderInfoUiModel r7, java.lang.Boolean r8, java.lang.Boolean r9) {
        /*
            r6 = this;
            p90.v r0 = r6.m67589I3()
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.f69998J
            java.lang.String r1 = "binding.providerInfoContainer"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L_0x0011
            r3 = r1
            goto L_0x0012
        L_0x0011:
            r3 = r2
        L_0x0012:
            r4 = 2
            r5 = 0
            g91.C32343x.m95483r1(r0, r3, r2, r4, r5)
            p90.v r0 = r6.m67589I3()
            androidx.constraintlayout.widget.Group r0 = r0.f70028r
            java.lang.String r3 = "binding.lifeInsuranceGroup"
            kotlin.jvm.internal.C41536l.m120488h(r0, r3)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r8 = kotlin.jvm.internal.C41536l.m120484d(r8, r3)
            if (r8 == 0) goto L_0x0036
            if (r7 == 0) goto L_0x0031
            ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.InsuranceInfoUiModel r8 = r7.mo49844b()
            goto L_0x0032
        L_0x0031:
            r8 = r5
        L_0x0032:
            if (r8 == 0) goto L_0x0036
            r8 = r1
            goto L_0x0037
        L_0x0036:
            r8 = r2
        L_0x0037:
            g91.C32343x.m95483r1(r0, r8, r2, r4, r5)
            p90.v r8 = r6.m67589I3()
            androidx.constraintlayout.widget.Group r8 = r8.f70017g
            java.lang.String r0 = "binding.creditInsuranceGroup"
            kotlin.jvm.internal.C41536l.m120488h(r8, r0)
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r9, r3)
            if (r9 == 0) goto L_0x0056
            if (r7 == 0) goto L_0x0052
            ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.InsuranceInfoUiModel r9 = r7.mo49843a()
            goto L_0x0053
        L_0x0052:
            r9 = r5
        L_0x0053:
            if (r9 == 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r1 = r2
        L_0x0057:
            g91.C32343x.m95483r1(r8, r1, r2, r4, r5)
            p90.v r8 = r6.m67589I3()
            androidx.appcompat.widget.AppCompatTextView r8 = r8.f70030t
            java.lang.String r9 = ""
            if (r7 == 0) goto L_0x0071
            ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.InsuranceInfoUiModel r0 = r7.mo49844b()
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = r0.mo49815a()
            if (r0 == 0) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r0 = r9
        L_0x0072:
            r8.setText(r0)
            p90.v r8 = r6.m67589I3()
            androidx.appcompat.widget.AppCompatTextView r8 = r8.f70019i
            if (r7 == 0) goto L_0x008a
            ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.InsuranceInfoUiModel r7 = r7.mo49843a()
            if (r7 == 0) goto L_0x008a
            java.lang.String r7 = r7.mo49815a()
            if (r7 == 0) goto L_0x008a
            r9 = r7
        L_0x008a:
            r8.setText(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity.m67685z4(ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.ProviderInfoUiModel, java.lang.Boolean, java.lang.Boolean):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_consumer_loan_details;
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        m67607O3().mo49864Dx(str, str2, str3);
        m67586H3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        C32343x.m95388F("offers.loan.details.insurance.action.sheet.link", new Object[0]);
        C36546y.m108282F().mo27138I("loan_offer_details");
        String stringExtra = getIntent().getStringExtra("OFFER_ID");
        if (stringExtra == null) {
            finish();
            return;
        }
        this.f56214g0 = stringExtra;
        m67589I3().f70033w.getBogInputLayout().setLeftImageViewMargin(C10319h.loan_offer_card_view_right_margin);
        OfferProductCode offerProductCode = (OfferProductCode) getIntent().getParcelableExtra("PRODUCT_CODE");
        String str = "";
        if (offerProductCode == null) {
            offerProductCode = new OfferProductCode.Unknown(str);
        }
        this.f56215h0 = offerProductCode;
        Serializable serializableExtra = getIntent().getSerializableExtra("OPERATION_TYPE");
        C41536l.m120487g(serializableExtra, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.domain.offer.model.LoanOperationType");
        this.f56216i0 = (C27088c) serializableExtra;
        List m = C41341q.m119910m(OfferProductCode.C21002BA.f56468f, OfferProductCode.C21004BE.f56469f);
        OfferProductCode offerProductCode2 = this.f56215h0;
        if (offerProductCode2 == null) {
            C41536l.m120506z("productCode");
            offerProductCode2 = null;
        }
        this.f56199R = m.contains(offerProductCode2);
        LinearLayout linearLayout = m67589I3().f70020j;
        C41536l.m120488h(linearLayout, "binding.detailsLayout");
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            C41536l.m120488h(childAt, "getChildAt(index)");
            if (childAt instanceof TextTypeView) {
                ((TextTypeView) childAt).setDefaultUnderLineColor();
            }
        }
        TextTypeView textTypeView = m67589I3().f70031u;
        C41536l.m120488h(textTypeView, "binding.loanAmount");
        TextTypeView textTypeView2 = m67589I3().f69993E;
        C41536l.m120488h(textTypeView2, "binding.loanTerm");
        TextTypeView textTypeView3 = m67589I3().f69996H;
        C41536l.m120488h(textTypeView3, "binding.paymentDate");
        TextTypeView textTypeView4 = m67589I3().f70033w;
        C41536l.m120488h(textTypeView4, "binding.loanCard");
        this.f56217j0 = C41341q.m119910m(textTypeView, textTypeView2, textTypeView3, textTypeView4);
        C27062d dVar = new C27062d(this);
        m67589I3().f69989A.setOnClickListener(dVar);
        m67589I3().f69998J.setOnClickListener(dVar);
        List<TextTypeView> list = this.f56217j0;
        if (list == null) {
            C41536l.m120506z("wizardFields");
            list = null;
        }
        for (TextTypeView editable : list) {
            editable.setEditable(true);
        }
        m67671s4();
        String stringExtra2 = getIntent().getStringExtra("HEADER_TEXT");
        if (stringExtra2 != null) {
            str = stringExtra2;
        }
        this.f56187F = str;
        this.f56188G = getIntent().getStringExtra("REQUESTED_AMOUNT");
        C0209a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            String str2 = this.f56187F;
            if (str2 == null) {
                C41536l.m120506z("loanHeaderText");
                str2 = null;
            }
            supportActionBar.mo550A(str2);
        }
        BogTextView bogTextView = m67589I3().f69994F;
        String str3 = this.f56187F;
        if (str3 == null) {
            C41536l.m120506z("loanHeaderText");
            str3 = null;
        }
        bogTextView.setText(str3);
        m67607O3().mo49888iy();
        m67573C4();
        m67655l1();
        m67589I3().f70009U.setText(C27950a.m86287d("text.loan.offer.other.bank.ref.condition", false, 2, (Object) null));
        m67569A4();
        C36546y.m108282F().mo27137H("applications_cl", "open_cl_offer", "", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
        m67589I3().f70031u.setTitleText(C32343x.m95388F("offers.loan.details.enter.loan.amount", new Object[0]));
        m67589I3().f69993E.setTitleText(C32343x.m95388F("offers.loan.details.enter.loan.term", new Object[0]));
        m67589I3().f69996H.setTitleText(C32343x.m95388F("offers.loan.details.choose.payment.day", new Object[0]));
        m67589I3().f70033w.setTitleText(C32343x.m95388F("offers.loan.details.select.card", new Object[0]));
        m67589I3().f70008T.setText(C32343x.m95388F("offers.loan.details.select.liabilities.to.refinance", new Object[0]));
        C36546y.m108282F().mo27148o("open_consumer_loan_offer");
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C27113k L3 = m67598L3();
        if (L3 != null) {
            L3.mo66413u2(str);
        }
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        m67683y4(z);
    }

    /* renamed from: m */
    public void mo39137m() {
        m67607O3().mo49866Hx();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m67607O3().mo49865Gx(i, i2, intent);
    }

    /* renamed from: u */
    public void mo49767u(boolean z) {
        m67607O3().mo49883fy(z);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String str = this.f56187F;
        if (str != null) {
            if (str != null) {
                return str;
            }
            C41536l.m120506z("loanHeaderText");
        }
        return null;
    }
}

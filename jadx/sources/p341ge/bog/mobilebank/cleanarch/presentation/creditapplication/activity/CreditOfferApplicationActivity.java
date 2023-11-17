package p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1493e0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.LinearLayoutManager;
import g91.C32303f;
import g91.C32307h;
import g91.C32343x;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C41519a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l81.C37113i;
import m41.C37223a;
import m41.C37224b;
import o00.C26656a;
import p00.C27113k;
import p060e1.C5893c;
import p060e1.C5917g0;
import p060e1.C5958l0;
import p093g8.C6256b;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditCardOfferDetailsUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditOfferDecisionUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditOfferRefinanceUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditOfferUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditResultData;
import p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.viewmodel.CreditApplicationViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.offer.model.CreditOfferLimitUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel;
import p341ge.bog.mobilebank.model.offers.Summary;
import p341ge.bog.mobilebank.p975ui.activities.MapActivity;
import p341ge.bog.mobilebank.p975ui.fragments.importantterm.LoanImportantTermFragment;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.offers.CreditCardOfferWizardPlugin;
import p341ge.bog.mobilebank.p975ui.wizard.model.C35893a;
import p341ge.bog.mobilebank.rest.BankApi;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p366bk.C10329r;
import p420fh.C12902d;
import p420fh.C12910e;
import p90.C27367m5;
import p90.C27478z;
import p913uu.C28942h;
import s81.C38458a;
import s81.C38461d;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import x10.C29618a;
import x10.C29619b;
import x10.C29620c;
import x10.C29621d;
import x10.C29622e;
import x10.C29623f;
import x10.C29624g;
import y10.C29885a;
import z10.C30132a;
import z10.C30135b;
import z10.C30136c;
import z10.C30137d;
import z10.C30138e;
import z10.C30139f;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity */
public final class CreditOfferApplicationActivity extends C21683a implements C38458a, C26656a, C41185v.C41186a {

    /* renamed from: L */
    public static final C21651a f57807L = new C21651a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private final C41217g f57808G = C41219i.m119470b(new C21653b(this));

    /* renamed from: H */
    private final C41217g f57809H = new C1617p0(C41520a0.m120436b(CreditApplicationViewModel.class), new C21658d0(this), new C21656c0(this), new C21660e0((C43064a) null, this));

    /* renamed from: I */
    private final C29885a f57810I = new C29885a();

    /* renamed from: J */
    private Fragment f57811J;

    /* renamed from: K */
    private final C41217g f57812K = C41219i.m119470b(new C21655c(this));

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$a */
    public static final class C21651a {
        private C21651a() {
        }

        public /* synthetic */ C21651a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo54011a(Context context, CreditOfferLimitUiModel creditOfferLimitUiModel, String str) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(creditOfferLimitUiModel, "limit");
            C41536l.m120489i(str, "offerNo");
            if (!TextUtils.isEmpty(str) && C41333m.m119794s(C28942h.values(), creditOfferLimitUiModel.mo54632e())) {
                Intent intent = new Intent(context, CreditOfferApplicationActivity.class);
                intent.putExtra("CREDIT_CARD_LIMIT", creditOfferLimitUiModel);
                intent.putExtra("OFFER_NO", str);
                context.startActivity(intent);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$a0 */
    static final class C21652a0 implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f57813a;

        C21652a0(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f57813a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f57813a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f57813a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$b */
    static final class C21653b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CreditOfferApplicationActivity f57814d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21653b(CreditOfferApplicationActivity creditOfferApplicationActivity) {
            super(0);
            this.f57814d = creditOfferApplicationActivity;
        }

        /* renamed from: b */
        public final C27478z invoke() {
            return C27478z.m85219d(this.f57814d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$b0 */
    static final class C21654b0 extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ CreditOfferApplicationActivity f57815d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21654b0(CreditOfferApplicationActivity creditOfferApplicationActivity) {
            super(2);
            this.f57815d = creditOfferApplicationActivity;
        }

        /* renamed from: a */
        public final Boolean mo54015a(int i, boolean z) {
            return Boolean.valueOf(this.f57815d.m70066f3().mo54137Lx(i, z));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo54015a(((Number) obj).intValue(), ((Boolean) obj2).booleanValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$c */
    static final class C21655c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CreditOfferApplicationActivity f57816d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21655c(CreditOfferApplicationActivity creditOfferApplicationActivity) {
            super(0);
            this.f57816d = creditOfferApplicationActivity;
        }

        /* renamed from: b */
        public final CreditOfferLimitUiModel invoke() {
            Parcelable parcelableExtra = this.f57816d.getIntent().getParcelableExtra("CREDIT_CARD_LIMIT");
            C41536l.m120486f(parcelableExtra);
            return (CreditOfferLimitUiModel) parcelableExtra;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$c0 */
    public static final class C21656c0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f57817d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21656c0(ComponentActivity componentActivity) {
            super(0);
            this.f57817d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f57817d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$d */
    /* synthetic */ class C21657d extends C41535k implements C43075l {
        C21657d(Object obj) {
            super(1, obj, CreditOfferApplicationActivity.class, "showConfirmationScreen", "showConfirmationScreen(Lge/bog/mobilebank/cleanarch/presentation/creditapplication/model/CreditOfferDecisionUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo54017b(CreditOfferDecisionUiModel creditOfferDecisionUiModel) {
            C41536l.m120489i(creditOfferDecisionUiModel, "p0");
            ((CreditOfferApplicationActivity) this.receiver).m70080t3(creditOfferDecisionUiModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54017b((CreditOfferDecisionUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$d0 */
    public static final class C21658d0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f57818d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21658d0(ComponentActivity componentActivity) {
            super(0);
            this.f57818d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f57818d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$e */
    static final class C21659e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditOfferApplicationActivity f57819d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21659e(CreditOfferApplicationActivity creditOfferApplicationActivity) {
            super(1);
            this.f57819d = creditOfferApplicationActivity;
        }

        /* renamed from: a */
        public final void mo54018a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f57819d.m70081u3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54018a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$e0 */
    public static final class C21660e0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f57820d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f57821e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21660e0(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f57820d = aVar;
            this.f57821e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f57820d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f57821e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$f */
    /* synthetic */ class C21661f extends C41535k implements C43075l {
        C21661f(Object obj) {
            super(1, obj, CreditOfferApplicationActivity.class, "openSuccessScreen", "openSuccessScreen(Lge/bog/mobilebank/cleanarch/presentation/creditapplication/model/CreditApplicationFormData;)V", 0);
        }

        /* renamed from: b */
        public final void mo54019b(C30135b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((CreditOfferApplicationActivity) this.receiver).m70071k3(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54019b((C30135b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$g */
    /* synthetic */ class C21662g extends C41535k implements C43075l {
        C21662g(Object obj) {
            super(1, obj, CreditOfferApplicationActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo54020b(boolean z) {
            ((CreditOfferApplicationActivity) this.receiver).m70069i3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54020b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$h */
    static final class C21663h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditOfferApplicationActivity f57822d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21663h(CreditOfferApplicationActivity creditOfferApplicationActivity) {
            super(1);
            this.f57822d = creditOfferApplicationActivity;
        }

        /* renamed from: a */
        public final void mo54021a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f57822d.mo52674G1(aVar);
            this.f57822d.m70061a3().f70318v.setVisibility(0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54021a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$i */
    /* synthetic */ class C21664i extends C41535k implements C43075l {
        C21664i(Object obj) {
            super(1, obj, CreditOfferApplicationActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo54022b(boolean z) {
            ((CreditOfferApplicationActivity) this.receiver).m70069i3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54022b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$j */
    /* synthetic */ class C21665j extends C41535k implements C43075l {
        C21665j(Object obj) {
            super(1, obj, CreditOfferApplicationActivity.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo54023b(C21503d.C21504a aVar) {
            ((CreditOfferApplicationActivity) this.receiver).mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54023b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$k */
    /* synthetic */ class C21666k extends C41535k implements C43075l {
        C21666k(Object obj) {
            super(1, obj, CreditOfferApplicationActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo54024b(boolean z) {
            ((CreditOfferApplicationActivity) this.receiver).m70069i3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54024b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$l */
    /* synthetic */ class C21667l extends C41535k implements C43075l {
        C21667l(Object obj) {
            super(1, obj, CreditOfferApplicationActivity.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo54025b(C21503d.C21504a aVar) {
            ((CreditOfferApplicationActivity) this.receiver).mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54025b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$m */
    /* synthetic */ class C21668m extends C41535k implements C43075l {
        C21668m(Object obj) {
            super(1, obj, CreditOfferApplicationActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo54026b(boolean z) {
            ((CreditOfferApplicationActivity) this.receiver).m70069i3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54026b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$n */
    static final class C21669n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditOfferApplicationActivity f57823d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21669n(CreditOfferApplicationActivity creditOfferApplicationActivity) {
            super(1);
            this.f57823d = creditOfferApplicationActivity;
        }

        /* renamed from: a */
        public final void mo54027a(C37223a aVar) {
            int i;
            Boolean bool = (Boolean) aVar.mo90296a();
            if (bool != null) {
                CreditOfferApplicationActivity creditOfferApplicationActivity = this.f57823d;
                boolean booleanValue = bool.booleanValue();
                TextTypeView textTypeView = creditOfferApplicationActivity.m70061a3().f70320x;
                if (booleanValue) {
                    i = 0;
                } else {
                    i = 8;
                }
                textTypeView.setVisibility(i);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54027a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$o */
    static final class C21670o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditOfferApplicationActivity f57824d;

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$o$a */
        public /* synthetic */ class C21671a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f57825a;

            /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            static {
                /*
                    z10.a$a[] r0 = z10.C30132a.C30133a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    z10.a$a r1 = z10.C30132a.C30133a.UNDECLARED     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    z10.a$a r1 = z10.C30132a.C30133a.FULL     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    z10.a$a r1 = z10.C30132a.C30133a.CALCULATION     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    z10.a$a r1 = z10.C30132a.C30133a.READ_ONLY     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    f57825a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity.C21670o.C21671a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21670o(CreditOfferApplicationActivity creditOfferApplicationActivity) {
            super(1);
            this.f57824d = creditOfferApplicationActivity;
        }

        /* renamed from: a */
        public final void mo54028a(C37223a aVar) {
            C30132a.C30133a aVar2 = (C30132a.C30133a) aVar.mo90296a();
            if (aVar2 != null) {
                CreditOfferApplicationActivity creditOfferApplicationActivity = this.f57824d;
                int i = C21671a.f57825a[aVar2.ordinal()];
                if (i == 1) {
                    creditOfferApplicationActivity.m70061a3().f70314r.setVisibility(8);
                } else if (i == 2) {
                    creditOfferApplicationActivity.m70061a3().f70322z.setVisibility(8);
                    creditOfferApplicationActivity.m70061a3().f70314r.setVisibility(0);
                    creditOfferApplicationActivity.m70061a3().f70314r.getButton().setButtonText(creditOfferApplicationActivity.getString(C10328q.loan_offer_continue_btn_text));
                } else if (i == 3) {
                    creditOfferApplicationActivity.m70061a3().f70322z.setVisibility(8);
                    creditOfferApplicationActivity.m70061a3().f70314r.setVisibility(0);
                    creditOfferApplicationActivity.m70061a3().f70314r.getButton().setButtonText(creditOfferApplicationActivity.getString(C10328q.recalculate));
                } else if (i == 4) {
                    creditOfferApplicationActivity.m70060Z2();
                    creditOfferApplicationActivity.m70061a3().f70314r.setVisibility(8);
                    creditOfferApplicationActivity.m70061a3().f70322z.setVisibility(0);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54028a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$p */
    /* synthetic */ class C21672p extends C41535k implements C43075l {
        C21672p(Object obj) {
            super(1, obj, CreditOfferApplicationActivity.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo54029b(C21503d.C21504a aVar) {
            ((CreditOfferApplicationActivity) this.receiver).mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54029b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$q */
    static final class C21673q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditOfferApplicationActivity f57826d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21673q(CreditOfferApplicationActivity creditOfferApplicationActivity) {
            super(1);
            this.f57826d = creditOfferApplicationActivity;
        }

        /* renamed from: a */
        public final void mo54030a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C41185v O2 = this.f57826d.m70065e3();
            if (O2 != null) {
                O2.mo4577k1();
            }
            C27113k N2 = this.f57826d.m70064d3();
            if (N2 != null) {
                N2.mo4577k1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54030a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$r */
    static final class C21674r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditOfferApplicationActivity f57827d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21674r(CreditOfferApplicationActivity creditOfferApplicationActivity) {
            super(1);
            this.f57827d = creditOfferApplicationActivity;
        }

        /* renamed from: a */
        public final void mo54031a(boolean z) {
            C41185v O2 = this.f57827d.m70065e3();
            if (O2 != null) {
                O2.mo95635L2(z);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54031a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$s */
    static final class C21675s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditOfferApplicationActivity f57828d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21675s(CreditOfferApplicationActivity creditOfferApplicationActivity) {
            super(1);
            this.f57828d = creditOfferApplicationActivity;
        }

        /* renamed from: a */
        public final void mo54032a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            if (aVar.mo53708h()) {
                C41185v O2 = this.f57828d.m70065e3();
                if (O2 != null) {
                    O2.mo95634K2(C32343x.m95388F(aVar.mo53705e(), new Object[0]));
                    return;
                }
                return;
            }
            C41185v O22 = this.f57828d.m70065e3();
            if (O22 != null) {
                O22.mo4577k1();
            }
            C27113k N2 = this.f57828d.m70064d3();
            if (N2 != null) {
                N2.mo4577k1();
            }
            this.f57828d.mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54032a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$t */
    /* synthetic */ class C21676t extends C41535k implements C43075l {
        C21676t(Object obj) {
            super(1, obj, CreditOfferApplicationActivity.class, "setupForm", "setupForm(Lge/bog/mobilebank/cleanarch/presentation/creditapplication/model/CreditApplicationFormData;)V", 0);
        }

        /* renamed from: b */
        public final void mo54033b(C30135b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((CreditOfferApplicationActivity) this.receiver).m70073m3(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54033b((C30135b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$u */
    /* synthetic */ class C21677u extends C41535k implements C43075l {
        C21677u(Object obj) {
            super(1, obj, CreditOfferApplicationActivity.class, "showWizard", "showWizard(Lge/bog/mobilebank/cleanarch/presentation/creditapplication/model/WizardOptions;)V", 0);
        }

        /* renamed from: b */
        public final void mo54034b(C30139f fVar) {
            C41536l.m120489i(fVar, "p0");
            ((CreditOfferApplicationActivity) this.receiver).m70085y3(fVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54034b((C30139f) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$v */
    /* synthetic */ class C21678v extends C41535k implements C43075l {
        C21678v(Object obj) {
            super(1, obj, CreditOfferApplicationActivity.class, "initForm", "initForm(Lge/bog/mobilebank/cleanarch/presentation/creditapplication/model/CreditApplication;)V", 0);
        }

        /* renamed from: b */
        public final void mo54035b(C30132a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((CreditOfferApplicationActivity) this.receiver).m70067g3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54035b((C30132a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$w */
    /* synthetic */ class C21679w extends C41535k implements C43075l {
        C21679w(Object obj) {
            super(1, obj, CreditOfferApplicationActivity.class, "showRefinanceWarning", "showRefinanceWarning(Lge/bog/mobilebank/cleanarch/presentation/creditapplication/model/WarningTextOptions;)V", 0);
        }

        /* renamed from: b */
        public final void mo54036b(C30138e eVar) {
            C41536l.m120489i(eVar, "p0");
            ((CreditOfferApplicationActivity) this.receiver).m70084x3(eVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54036b((C30138e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$x */
    /* synthetic */ class C21680x extends C41519a implements C43075l {
        C21680x(Object obj) {
            super(1, obj, C12910e.class, "showNegativeFeedBack", "showNegativeFeedBack(Landroid/app/Activity;Ljava/lang/String;Lge/bog/designsystem/components/bannerfeedback/FeedbackManager$Duration;Z)V", 1);
        }

        /* renamed from: b */
        public final void mo54037b(String str) {
            C41536l.m120489i(str, "p0");
            C12910e.m48790h((CreditOfferApplicationActivity) this.f97690d, str, (C12902d.C12905b) null, false, 6, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54037b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$y */
    static final class C21681y extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditOfferApplicationActivity f57829d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21681y(CreditOfferApplicationActivity creditOfferApplicationActivity) {
            super(1);
            this.f57829d = creditOfferApplicationActivity;
        }

        /* renamed from: a */
        public final void mo54038a(boolean z) {
            if (z) {
                this.f57829d.m70061a3().f70314r.getButton().setButtonText(this.f57829d.getString(C10328q.recalculate));
            } else {
                this.f57829d.m70061a3().f70314r.getButton().setButtonText(this.f57829d.getString(C10328q.loan_offer_continue_btn_text));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54038a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity$z */
    /* synthetic */ class C21682z extends C41535k implements C43075l {
        C21682z(Object obj) {
            super(1, obj, CreditOfferApplicationActivity.class, "openPreContract", "openPreContract(Lge/bog/mobilebank/cleanarch/presentation/creditapplication/model/CreditPreContract;)V", 0);
        }

        /* renamed from: b */
        public final void mo54039b(C30137d dVar) {
            C41536l.m120489i(dVar, "p0");
            ((CreditOfferApplicationActivity) this.receiver).m70070j3(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54039b((C30137d) obj);
            return C41238w.f97225a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public final void m70060Z2() {
        LinearLayout linearLayout = m70061a3().f70309m;
        C41536l.m120488h(linearLayout, "binding.detailsContainer");
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            C41536l.m120488h(childAt, "getChildAt(index)");
            if (childAt instanceof TextTypeView) {
                childAt.setOnClickListener((View.OnClickListener) null);
                ((TextTypeView) childAt).disable(false);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public final C27478z m70061a3() {
        return (C27478z) this.f57808G.getValue();
    }

    /* renamed from: b3 */
    private final CreditOfferLimitUiModel m70062b3() {
        return (CreditOfferLimitUiModel) this.f57812K.getValue();
    }

    /* renamed from: c3 */
    private final String m70063c3(CreditOfferUiModel creditOfferUiModel) {
        OfferProductCode d = m70062b3().mo54630d();
        if (C41536l.m120484d(d, OfferProductCode.C21010EC.f56472f)) {
            String string = getString(C10328q.offer_details_card_limit);
            C41536l.m120488h(string, "{\n                getStr…card_limit)\n            }");
            return string;
        } else if (C41536l.m120484d(d, OfferProductCode.C21017LC.f56476f)) {
            String string2 = getString(C10328q.credit_line_amount);
            C41536l.m120488h(string2, "{\n                getStr…ine_amount)\n            }");
            return string2;
        } else {
            String string3 = getString(C10328q.offer_details_credit_card_limit_range, new Object[]{creditOfferUiModel.mo54107d(), creditOfferUiModel.mo54106b()});
            C41536l.m120488h(string3, "{\n                getStr…          )\n            }");
            return string3;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public final C27113k m70064d3() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        return C32343x.m95443e0(supportFragmentManager, (String) null, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public final C41185v m70065e3() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        return C32343x.m95449g0(supportFragmentManager, (String) null, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public final CreditApplicationViewModel m70066f3() {
        return (CreditApplicationViewModel) this.f57809H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public final void m70067g3(C30132a aVar) {
        CreditOfferDecisionUiModel f = aVar.mo70440f();
        if (f != null) {
            CreditOfferUiModel d = f.mo54062d();
            m70072l3(f, aVar.mo70437d());
            m70061a3().f70307k.setTitleText(m70063c3(d));
            m70061a3().f70307k.setValueTextIgnoringEmpty(C32303f.m95203n(d.mo54106b(), d.mo54105a()));
            if (C41341q.m119910m(C28942h.INCREASE_CREDIT_CARD_LIMIT, C28942h.INCREASE_CREDIT_CARD_LIMIT_WITH_REFINANCE).contains(m70062b3().mo54632e())) {
                TextTypeView textTypeView = m70061a3().f70308l;
                textTypeView.setValueTextIgnoringEmpty(C32303f.m95203n(d.mo54107d(), d.mo54105a()));
                textTypeView.setVisibility(0);
                textTypeView.disable(false);
            }
        }
    }

    /* renamed from: h3 */
    private final void m70068h3() {
        m70066f3().mo54152jx().mo4819k(this, new C21652a0(new C21669n(this)));
        m70066f3().mo54145Ww().mo4819k(this, new C21652a0(new C21670o(this)));
        C37224b.m109963b(m70066f3().mo54143Uw(), this, new C21676t(this));
        C37224b.m109963b(m70066f3().mo54163zx(), this, new C21677u(this));
        C37224b.m109963b(m70066f3().mo54144Vw(), this, new C21678v(this));
        C37224b.m109963b(m70066f3().mo54158vx(), this, new C21679w(this));
        C37224b.m109963b(m70066f3().mo54160x0(), this, new C21680x(this));
        C37224b.m109963b(m70066f3().mo54146Xw(), this, new C21681y(this));
        C37224b.m109963b(m70066f3().mo54162yx(), this, new C21682z(this));
        C37224b.m109963b(m70066f3().mo54161xx(), this, new C21657d(this));
        C37224b.m109963b(m70066f3().mo54155mx(), this, new C21659e(this));
        C37224b.m109963b(m70066f3().mo54156nx(), this, new C21661f(this));
        C21484c.m69412d(m70066f3().mo54150bx(), this, (C43075l) null, new C21662g(this), new C21663h(this), 2, (Object) null);
        C21484c.m69412d(m70066f3().mo54147Yw(), this, (C43075l) null, new C21664i(this), new C21665j(this), 2, (Object) null);
        C21484c.m69412d(m70066f3().mo54154lx(), this, (C43075l) null, new C21666k(this), new C21667l(this), 2, (Object) null);
        C21484c.m69412d(m70066f3().mo54142U1(), this, (C43075l) null, new C21668m(this), new C21672p(this), 2, (Object) null);
        C21484c.m69411c(m70066f3().mo54159wx(), this, new C21673q(this), new C21674r(this), new C21675s(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public final void m70069i3(boolean z) {
        if (z) {
            mo86441o2();
        } else {
            mo86425J1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public final void m70070j3(C30137d dVar) {
        C27113k c = C27113k.C27114a.m84066c(C27113k.f68083P, dVar.mo70475a().mo64864a(), true, dVar.mo70476b(), (ArrayList) null, (Summary) null, (String) null, 56, (Object) null);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        c.mo4576A1(supportFragmentManager, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public final void m70071k3(C30135b bVar) {
        CreditResultData creditResultData;
        ArrayList arrayList;
        String str;
        CreditOfferDecisionUiModel f = bVar.mo70451b().mo70440f();
        C41536l.m120486f(f);
        CreditCardOfferDetailsUiModel e = f.mo54064e();
        if (C41536l.m120484d(m70062b3().mo54630d(), OfferProductCode.C21017LC.f56476f)) {
            OfferProductCode d = m70062b3().mo54630d();
            BigDecimal c = bVar.mo70452c();
            C41536l.m120486f(c);
            String bigDecimal = c.toString();
            C41536l.m120488h(bigDecimal, "formData.creditLimit!!.toString()");
            creditResultData = new CreditResultData(d, (String) null, bigDecimal, e.mo54043e(), (String) null, (List) null, (String) null, m70062b3().mo54632e(), 114, (DefaultConstructorMarker) null);
        } else {
            OfferProductCode d2 = m70062b3().mo54630d();
            String h = e.mo54047h();
            BigDecimal c2 = bVar.mo70452c();
            C41536l.m120486f(c2);
            String bigDecimal2 = c2.toString();
            C41536l.m120488h(bigDecimal2, "formData.creditLimit!!.toString()");
            String e2 = e.mo54043e();
            String g = e.mo54046g();
            List e3 = bVar.mo70454e();
            if (e3 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object next : e3) {
                    if (((CreditOfferRefinanceUiModel) next).mo54096v()) {
                        arrayList2.add(next);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            ServiceCenterUiModel g2 = bVar.mo70457g();
            if (g2 != null) {
                str = g2.mo55424d();
            } else {
                str = null;
            }
            creditResultData = new CreditResultData(d2, h, bigDecimal2, e2, g, arrayList, str, m70062b3().mo54632e());
        }
        CreditApplicationResultActivity.f57802H.mo54009a(this, creditResultData);
        finish();
    }

    /* renamed from: l3 */
    private final void m70072l3(CreditOfferDecisionUiModel creditOfferDecisionUiModel, List list) {
        int i;
        boolean z;
        if (C41536l.m120484d(m70062b3().mo54630d(), OfferProductCode.C21017LC.f56476f)) {
            i = C10320i.ic_sms_loan_offer;
        } else {
            i = C32307h.m95234k(creditOfferDecisionUiModel.mo54064e().mo54046g());
        }
        m70061a3().f70306j.setText(C32343x.m95388F(creditOfferDecisionUiModel.mo54064e().mo54047h(), new Object[0]));
        m70061a3().f70305i.setImageResource(i);
        C30136c cVar = (C30136c) C41358y.m120009Y(list);
        if (cVar != null) {
            m70061a3().f70302f.setText(C32343x.m95388F(cVar.mo70471b(), new Object[0]));
            m70061a3().f70301e.setText(C32343x.m95388F(cVar.mo70470a(), new Object[0]));
        }
        if (list.size() > 1) {
            m70061a3().f70303g.removeAllViews();
            for (C30136c cVar2 : C41358y.m120002R(list, 1)) {
                C27367m5 d = C27367m5.m84778d(getLayoutInflater(), m70061a3().f70303g, true);
                d.f69305f.setText(C32343x.m95388F(cVar2.mo70471b(), new Object[0]));
                d.f69304e.setText(C32343x.m95388F(cVar2.mo70470a(), new Object[0]));
                View view = d.f69306g;
                C41536l.m120488h(view, "divider");
                if (list.indexOf(cVar2) != list.size() - 1) {
                    z = true;
                } else {
                    z = false;
                }
                C32343x.m95483r1(view, z, false, 2, (Object) null);
            }
            return;
        }
        View view2 = m70061a3().f70313q;
        C41536l.m120488h(view2, "binding.headerDivider");
        C32343x.m95455i0(view2);
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public final void m70073m3(C30135b bVar) {
        String str;
        boolean z;
        String str2;
        String str3;
        CreditOfferDecisionUiModel f = bVar.mo70451b().mo70440f();
        C41536l.m120486f(f);
        CreditOfferUiModel d = f.mo54062d();
        boolean i = bVar.mo70460i();
        TextTypeView textTypeView = m70061a3().f70307k;
        BigDecimal c = bVar.mo70452c();
        String str4 = null;
        if (c != null) {
            str = C32303f.m95203n(c, d.mo54105a());
        } else {
            str = null;
        }
        textTypeView.setValueTextIgnoringEmpty(str);
        List e = bVar.mo70454e();
        if (e == null || e.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C29885a aVar = this.f57810I;
            List e2 = bVar.mo70454e();
            C41536l.m120486f(e2);
            aVar.mo70160i(e2);
            if (m70061a3().f70316t.getVisibility() == 8) {
                m70061a3().f70316t.setVisibility(0);
            }
        }
        if (bVar.mo70450a() == null || bVar.mo70456f() == null || bVar.mo70457g() == null) {
            m70061a3().f70320x.setValueTextIgnoringEmpty("");
        } else {
            TextTypeView textTypeView2 = m70061a3().f70320x;
            C41524c0 c0Var = C41524c0.f97701a;
            Object[] objArr = new Object[3];
            ServiceCenterUiModel a = bVar.mo70450a();
            if (a != null) {
                str2 = a.mo55424d();
            } else {
                str2 = null;
            }
            objArr[0] = str2;
            ServiceCenterUiModel f2 = bVar.mo70456f();
            if (f2 != null) {
                str3 = f2.mo55424d();
            } else {
                str3 = null;
            }
            objArr[1] = str3;
            ServiceCenterUiModel g = bVar.mo70457g();
            if (g != null) {
                str4 = g.mo55424d();
            }
            objArr[2] = str4;
            String format = String.format("%s, %s, %s", Arrays.copyOf(objArr, 3));
            C41536l.m120488h(format, "format(format, *args)");
            textTypeView2.setValueTextIgnoringEmpty(format);
        }
        m70061a3().f70314r.getButton().setEnabled(i);
    }

    /* renamed from: n3 */
    private final void m70074n3() {
        m70061a3().f70298E.setText(C32343x.m95388F("text.loan.offer.other.bank.ref.condition", new Object[0]));
        m70061a3().f70317u.setLayoutManager(new LinearLayoutManager(this));
        m70061a3().f70317u.mo5351j(new C37113i(C0767a.m2895e(this, C10320i.divider)));
        m70061a3().f70317u.setAdapter(this.f57810I);
        this.f57810I.mo70161j(new C21654b0(this));
        m70061a3().f70307k.setOnClickListener(new C29620c(this));
        m70061a3().f70320x.setOnClickListener(new C29621d(this));
        m70061a3().f70321y.setOnClickListener(new C29622e(this));
        m70061a3().f70310n.f68328f.mo3946b().setOnClickListener(new C29623f(this));
        m70061a3().f70314r.getButton().setOnClickListener(new C29624g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public static final void m70075o3(CreditOfferApplicationActivity creditOfferApplicationActivity, View view) {
        C41536l.m120489i(creditOfferApplicationActivity, "this$0");
        CreditApplicationViewModel f3 = creditOfferApplicationActivity.m70066f3();
        C41536l.m120488h(view, "it");
        f3.mo54140Ox(0, view);
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public static final void m70076p3(CreditOfferApplicationActivity creditOfferApplicationActivity, View view) {
        C41536l.m120489i(creditOfferApplicationActivity, "this$0");
        CreditApplicationViewModel f3 = creditOfferApplicationActivity.m70066f3();
        C41536l.m120488h(view, "it");
        f3.mo54140Ox(1, view);
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public static final void m70077q3(CreditOfferApplicationActivity creditOfferApplicationActivity, View view) {
        C41536l.m120489i(creditOfferApplicationActivity, "this$0");
        Intent intent = new Intent(creditOfferApplicationActivity, MapActivity.class);
        intent.putExtra("MAP_FILTER_KEY", 1);
        creditOfferApplicationActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public static final void m70078r3(CreditOfferApplicationActivity creditOfferApplicationActivity, View view) {
        C41536l.m120489i(creditOfferApplicationActivity, "this$0");
        creditOfferApplicationActivity.m70061a3().f70318v.setVisibility(8);
        creditOfferApplicationActivity.m70066f3().mo54151ix();
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public static final void m70079s3(CreditOfferApplicationActivity creditOfferApplicationActivity, View view) {
        C41536l.m120489i(creditOfferApplicationActivity, "this$0");
        creditOfferApplicationActivity.m70066f3().mo54153k0();
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public final void m70080t3(CreditOfferDecisionUiModel creditOfferDecisionUiModel) {
        String str;
        String P;
        String e = creditOfferDecisionUiModel.mo54064e().mo54043e();
        String P2 = C32343x.m95408P(creditOfferDecisionUiModel.mo54064e().mo54045f(), e);
        BigDecimal k = creditOfferDecisionUiModel.mo54064e().mo54051k();
        String str2 = "";
        if (k == null || (str = C32343x.m95408P(k, e)) == null) {
            str = str2;
        }
        BigDecimal l = creditOfferDecisionUiModel.mo54064e().mo54052l();
        if (!(l == null || (P = C32343x.m95408P(l, e)) == null)) {
            str2 = P;
        }
        this.f57811J = LoanImportantTermFragment.f86123f.mo86704a(new LoanImportantTermFragment.AmountTextData(P2, str, str2, C38461d.CREDIT_CARD));
        C1493e0 p = getSupportFragmentManager().mo4428p();
        int i = C10322k.pre_contract_warning_container;
        Fragment fragment = this.f57811J;
        C41536l.m120486f(fragment);
        p.mo4639r(i, fragment);
        Fragment fragment2 = this.f57811J;
        C41536l.m120486f(fragment2);
        fragment2.setEnterTransition(new C5917g0(80));
        Fragment fragment3 = this.f57811J;
        C41536l.m120486f(fragment3);
        fragment3.setExitTransition(new C5917g0(80));
        p.mo4636g((String) null);
        p.mo4515i();
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public final void m70081u3() {
        new C6256b(this, C10329r.MaterialDialogStyle).setMessage(C32343x.m95388F("text.offers.pop.up.return.to.initial.parameters", new Object[0])).setPositiveButton(getString(C10328q.f28966r2), new C29618a(this)).setNegativeButton(getString(C10328q.f28951b2), new C29619b()).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public static final void m70082v3(CreditOfferApplicationActivity creditOfferApplicationActivity, DialogInterface dialogInterface, int i) {
        C41536l.m120489i(creditOfferApplicationActivity, "this$0");
        creditOfferApplicationActivity.m70066f3().mo54138Mx();
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public static final void m70083w3(DialogInterface dialogInterface, int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public final void m70084x3(C30138e eVar) {
        int i;
        C5893c cVar = new C5893c();
        cVar.mo19357u(m70061a3().f70317u, true);
        cVar.mo19350p0(150);
        C5958l0.m23911b(m70061a3().f70319w, cVar);
        LinearLayout linearLayout = m70061a3().f70296C;
        if (eVar.mo70481b()) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public final void m70085y3(C30139f fVar) {
        C35893a.m106783a(this).mo88140g(fVar.mo70488d()).mo88137d(AdvancedWizardActivity.class).mo88139f(new CreditCardOfferWizardPlugin(fVar.mo70485a(), 0, 0)).mo88141h(fVar.mo70486b()).mo88136c(fVar.mo70487c()).mo88142i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_credit_offer_application;
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        m70066f3().mo54149bv(str, str2, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo70996D2(bundle, m70061a3());
        m70068h3();
        CreditApplicationViewModel f3 = m70066f3();
        CreditOfferLimitUiModel b3 = m70062b3();
        String stringExtra = getIntent().getStringExtra("OFFER_NO");
        C41536l.m120486f(stringExtra);
        f3.mo54135Fx(b3, stringExtra);
        m70074n3();
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C27113k d3 = m70064d3();
        if (d3 != null) {
            d3.mo66413u2(str);
        }
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        C27113k d3 = m70064d3();
        if (d3 != null) {
            d3.mo66414v2(z);
        }
    }

    /* renamed from: m */
    public void mo39137m() {
        C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, BankApi.OFFERS_PROCESS_CARD_REGISTRATION, m70066f3().mo54157ox(CreditApplicationViewModel.m70227ax(m70066f3(), (String) null, (String) null, (String) null, 7, (Object) null)), (C41143c) null, 4, (Object) null);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        e.mo4576A1(supportFragmentManager, (String) null);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m70066f3().mo54136Hx(i, i2, intent);
    }

    /* renamed from: u */
    public void mo49767u(boolean z) {
        Fragment fragment = this.f57811J;
        if (fragment != null) {
            getSupportFragmentManager().mo4428p().mo4522q(fragment).mo4515i();
        }
        if (z) {
            m70066f3().mo54139Nx();
        }
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String str;
        String str2;
        if (C41536l.m120484d(m70062b3().mo54630d(), OfferProductCode.C21017LC.f56476f)) {
            str2 = getString(C10328q.credit_line);
            str = "getString(R.string.credit_line)";
        } else {
            str2 = getString(C10328q.f28952b5);
            str = "getString(\n            R…xt_credit_cards\n        )";
        }
        C41536l.m120488h(str2, str);
        return str2;
    }
}

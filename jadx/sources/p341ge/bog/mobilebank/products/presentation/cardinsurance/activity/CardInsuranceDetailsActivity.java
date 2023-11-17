package p341ge.bog.mobilebank.products.presentation.cardinsurance.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.C0767a;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import bz0.C31226f;
import cz0.C31501a;
import cz0.C31502b;
import cz0.C31503c;
import cz0.C31504d;
import cz0.C31505e;
import cz0.C31506f;
import cz0.C31507g;
import dz0.C31627a;
import ez0.C31898d;
import ez0.C31900e;
import ez0.C31901f;
import g91.C32343x;
import gz0.C36091a;
import gz0.C36093b;
import gz0.C36096c;
import gz0.C36102i;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41212c;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import iy0.C36599h;
import java.util.List;
import kotlin.jvm.internal.C41519a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37613p;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.creditcardwidget.CreditCardWidgetBannerView;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.products.data.model.cardinsurance.RemoveCardInsuranceParams;
import p341ge.bog.mobilebank.products.presentation.cardinsurance.model.CardInsuranceStatusUiModel;
import p341ge.bog.mobilebank.shared.helper.C34645a;
import p642vh.C18358g;
import p683yh.C18917a;
import qt0.C38246b;
import ue1.C43064a;
import ue1.C43075l;
import z31.C40143a;

/* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity */
public final class CardInsuranceDetailsActivity extends C33880a implements C41185v.C41186a {

    /* renamed from: K */
    public static final C33840a f82437K = new C33840a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C36091a f82438G;

    /* renamed from: H */
    private final C41217g f82439H = new C1617p0(C41520a0.m120436b(C36102i.class), new C33862u(this), new C33864w(this), new C33863v((C43064a) null, this));

    /* renamed from: I */
    private final C41217g f82440I = C41219i.m119470b(new C33850i(this));

    /* renamed from: J */
    private final C41217g f82441J = C41219i.m119470b(C33851j.f82447d);

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity$a */
    public static final class C33840a {
        private C33840a() {
        }

        public /* synthetic */ C33840a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo82019a(long j, Context context) {
            C41536l.m120489i(context, "context");
            context.startActivity(C37613p.m110614a(new Intent(context, CardInsuranceDetailsActivity.class), C41233s.m119492a("ARG_CARD_ID", Long.valueOf(j))));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity$b */
    /* synthetic */ class C33841b extends C41535k implements C43075l {
        C33841b(Object obj) {
            super(1, obj, CardInsuranceDetailsActivity.class, "onCardDetailsResult", "onCardDetailsResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo82020b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((CardInsuranceDetailsActivity) this.receiver).m99570l3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82020b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity$c */
    /* synthetic */ class C33842c extends C41535k implements C43075l {
        C33842c(Object obj) {
            super(1, obj, CardInsuranceDetailsActivity.class, "onInsuranceDetailsResult", "onInsuranceDetailsResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo82021b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((CardInsuranceDetailsActivity) this.receiver).m99571m3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82021b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity$d */
    static final class C33843d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardInsuranceDetailsActivity f82442d;

        /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity$d$a */
        /* synthetic */ class C33844a extends C41535k implements C43064a {
            C33844a(Object obj) {
                super(0, obj, C36093b.class, "requestOpenSelectInsuranceActionSheet", "requestOpenSelectInsuranceActionSheet()V", 0);
            }

            /* renamed from: b */
            public final void mo82023b() {
                ((C36093b) this.receiver).mo88854wo();
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                mo82023b();
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33843d(CardInsuranceDetailsActivity cardInsuranceDetailsActivity) {
            super(1);
            this.f82442d = cardInsuranceDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82022a(C31900e eVar) {
            C41536l.m120489i(eVar, "it");
            this.f82442d.m99573o3(eVar, new C33844a(this.f82442d.m99566i3().mo88862qw()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82022a((C31900e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity$e */
    static final class C33845e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardInsuranceDetailsActivity f82443d;

        /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity$e$a */
        /* synthetic */ class C33846a extends C41519a implements C43064a {
            C33846a(Object obj) {
                super(0, obj, C36093b.class, "cancelInsurance", "cancelInsurance(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
            }

            /* renamed from: b */
            public final void mo82025b() {
                C36093b.C36094a.m107390a((C36093b) this.f97690d, (String) null, (String) null, (String) null, 7, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                mo82025b();
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33845e(CardInsuranceDetailsActivity cardInsuranceDetailsActivity) {
            super(1);
            this.f82443d = cardInsuranceDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82024a(C31900e eVar) {
            C41536l.m120489i(eVar, "it");
            CardInsuranceDetailsActivity cardInsuranceDetailsActivity = this.f82443d;
            cardInsuranceDetailsActivity.m99573o3(eVar, new C33846a(cardInsuranceDetailsActivity.m99566i3().mo88862qw()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82024a((C31900e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity$f */
    static final class C33847f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardInsuranceDetailsActivity f82444d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33847f(CardInsuranceDetailsActivity cardInsuranceDetailsActivity) {
            super(1);
            this.f82444d = cardInsuranceDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82026a(RemoveCardInsuranceParams removeCardInsuranceParams) {
            C41536l.m120489i(removeCardInsuranceParams, "it");
            C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, removeCardInsuranceParams.getOtpServiceId(), this.f82444d.m99566i3().mo88863rw(removeCardInsuranceParams), (C41143c) null, 4, (Object) null);
            FragmentManager supportFragmentManager = this.f82444d.getSupportFragmentManager();
            C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
            e.mo4576A1(supportFragmentManager, "SCA_TAG_CANCEL_INSURANCE");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82026a((RemoveCardInsuranceParams) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity$g */
    /* synthetic */ class C33848g extends C41535k implements C43075l {
        C33848g(Object obj) {
            super(1, obj, CardInsuranceDetailsActivity.class, "onCancelInsuranceResult", "onCancelInsuranceResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo82027b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((CardInsuranceDetailsActivity) this.receiver).m99567j3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82027b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity$h */
    static final class C33849h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardInsuranceDetailsActivity f82445d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33849h(CardInsuranceDetailsActivity cardInsuranceDetailsActivity) {
            super(1);
            this.f82445d = cardInsuranceDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82028a(long j) {
            C31226f.C31227a.m92832b(C31226f.f77593O, Long.valueOf(j), (List) null, (DebitCardInsuranceTypeUiModel) null, 6, (Object) null).mo4576A1(this.f82445d.getSupportFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82028a(((Number) obj).longValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity$i */
    static final class C33850i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CardInsuranceDetailsActivity f82446d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33850i(CardInsuranceDetailsActivity cardInsuranceDetailsActivity) {
            super(0);
            this.f82446d = cardInsuranceDetailsActivity;
        }

        /* renamed from: b */
        public final C36599h invoke() {
            return C36599h.m108524d(this.f82446d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity$j */
    static final class C33851j extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C33851j f82447d = new C33851j();

        C33851j() {
            super(0);
        }

        /* renamed from: b */
        public final C31627a invoke() {
            return new C31627a();
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity$k */
    static final class C33852k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardInsuranceDetailsActivity f82448d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33852k(CardInsuranceDetailsActivity cardInsuranceDetailsActivity) {
            super(1);
            this.f82448d = cardInsuranceDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82031a(C41238w wVar) {
            CardInsuranceDetailsActivity.m99568k3(this.f82448d, true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82031a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity$l */
    static final class C33853l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardInsuranceDetailsActivity f82449d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33853l(CardInsuranceDetailsActivity cardInsuranceDetailsActivity) {
            super(1);
            this.f82449d = cardInsuranceDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82032a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            CardInsuranceDetailsActivity.m99568k3(this.f82449d, false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82032a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity$m */
    static final class C33854m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardInsuranceDetailsActivity f82450d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33854m(CardInsuranceDetailsActivity cardInsuranceDetailsActivity) {
            super(1);
            this.f82450d = cardInsuranceDetailsActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            CardInsuranceDetailsActivity.m99568k3(this.f82450d, false);
            this.f82450d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity$n */
    static final class C33855n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardInsuranceDetailsActivity f82451d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33855n(CardInsuranceDetailsActivity cardInsuranceDetailsActivity) {
            super(1);
            this.f82451d = cardInsuranceDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82034a(CardInsuranceStatusUiModel cardInsuranceStatusUiModel) {
            this.f82451d.m99576r3(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82034a((CardInsuranceStatusUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity$o */
    static final class C33856o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardInsuranceDetailsActivity f82452d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33856o(CardInsuranceDetailsActivity cardInsuranceDetailsActivity) {
            super(1);
            this.f82452d = cardInsuranceDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82035a(CardInsuranceStatusUiModel cardInsuranceStatusUiModel) {
            boolean z;
            C41536l.m120489i(cardInsuranceStatusUiModel, "it");
            this.f82452d.m99576r3(false);
            this.f82452d.m99564g3().f88222D.setRefreshing(false);
            Group group = this.f82452d.m99564g3().f88230i;
            C41536l.m120488h(group, "binding.commonDetails");
            C32343x.m95447f1(group);
            this.f82452d.m99562d3(cardInsuranceStatusUiModel);
            this.f82452d.m99563e3(cardInsuranceStatusUiModel);
            Group group2 = this.f82452d.m99564g3().f88243v;
            C41536l.m120488h(group2, "binding.insuranceEnabledDetails");
            if (cardInsuranceStatusUiModel.mo82062g() == C31901f.INSURED) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(group2, z, false, 2, (Object) null);
            this.f82452d.m99564g3().f88228g.setButtonText(C32343x.m95388F(cardInsuranceStatusUiModel.mo82062g().mo72341e(), new Object[0]));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82035a((CardInsuranceStatusUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity$p */
    static final class C33857p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardInsuranceDetailsActivity f82453d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33857p(CardInsuranceDetailsActivity cardInsuranceDetailsActivity) {
            super(1);
            this.f82453d = cardInsuranceDetailsActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f82453d.m99576r3(false);
            this.f82453d.m99564g3().f88222D.setRefreshing(false);
            ConstraintLayout constraintLayout = this.f82453d.m99564g3().f88234m;
            C41536l.m120488h(constraintLayout, "binding.errorContainer");
            C32343x.m95447f1(constraintLayout);
            this.f82453d.m99564g3().f88235n.setText(C32343x.m95431a0(th, (String) null, 1, (Object) null));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity$q */
    static final class C33858q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardInsuranceDetailsActivity f82454d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33858q(CardInsuranceDetailsActivity cardInsuranceDetailsActivity) {
            super(1);
            this.f82454d = cardInsuranceDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82037a(C40143a aVar) {
            CardInsuranceDetailsActivity.m99572n3(this.f82454d, true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82037a((C40143a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity$r */
    static final class C33859r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardInsuranceDetailsActivity f82455d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33859r(CardInsuranceDetailsActivity cardInsuranceDetailsActivity) {
            super(1);
            this.f82455d = cardInsuranceDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82038a(C40143a aVar) {
            C41536l.m120489i(aVar, "it");
            CardInsuranceDetailsActivity.m99572n3(this.f82455d, false);
            this.f82455d.m99578t3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82038a((C40143a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity$s */
    static final class C33860s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardInsuranceDetailsActivity f82456d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33860s(CardInsuranceDetailsActivity cardInsuranceDetailsActivity) {
            super(1);
            this.f82456d = cardInsuranceDetailsActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            LoadingView loadingView = this.f82456d.m99564g3().f88242u;
            C41536l.m120488h(loadingView, "binding.insuranceDetailsLoader");
            C32343x.m95455i0(loadingView);
            this.f82456d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity$t */
    static final class C33861t implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f82457a;

        C33861t(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f82457a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f82457a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f82457a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity$u */
    public static final class C33862u extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f82458d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33862u(ComponentActivity componentActivity) {
            super(0);
            this.f82458d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f82458d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity$v */
    public static final class C33863v extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f82459d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f82460e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33863v(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f82459d = aVar;
            this.f82460e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f82459d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f82460e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity$w */
    static final class C33864w extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CardInsuranceDetailsActivity f82461d;

        /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity$w$a */
        static final class C33865a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ CardInsuranceDetailsActivity f82462d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33865a(CardInsuranceDetailsActivity cardInsuranceDetailsActivity) {
                super(0);
                this.f82462d = cardInsuranceDetailsActivity;
            }

            /* renamed from: b */
            public final C36102i invoke() {
                return this.f82462d.mo82018f3().mo32541a(this.f82462d.getIntent().getLongExtra("ARG_CARD_ID", -1));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33864w(CardInsuranceDetailsActivity cardInsuranceDetailsActivity) {
            super(0);
            this.f82461d = cardInsuranceDetailsActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C38246b.f91733a.mo91781a(new C33865a(this.f82461d));
        }
    }

    /* renamed from: X2 */
    private final void m99556X2() {
        m99564g3().f88222D.setOnRefreshListener(new C31503c(this));
        m99564g3().f88221C.setOnClickListener(new C31504d(this));
        m99564g3().f88228g.setOnClickListener(new C31505e(this));
        m99564g3().f88226e.setOnClickListener(new C31506f(this));
        getSupportFragmentManager().mo4367F1("REQUEST_KEY_INSURANCE_CHANGED", this, new C31507g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public static final void m99557Y2(CardInsuranceDetailsActivity cardInsuranceDetailsActivity) {
        C41536l.m120489i(cardInsuranceDetailsActivity, "this$0");
        C21481a.onRefresh$default(cardInsuranceDetailsActivity.m99566i3(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public static final void m99558Z2(CardInsuranceDetailsActivity cardInsuranceDetailsActivity, View view) {
        C41536l.m120489i(cardInsuranceDetailsActivity, "this$0");
        cardInsuranceDetailsActivity.m99566i3().onRefresh(153);
        ConstraintLayout constraintLayout = cardInsuranceDetailsActivity.m99564g3().f88234m;
        C41536l.m120488h(constraintLayout, "binding.errorContainer");
        C32343x.m95455i0(constraintLayout);
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public static final void m99559a3(CardInsuranceDetailsActivity cardInsuranceDetailsActivity, View view) {
        C41536l.m120489i(cardInsuranceDetailsActivity, "this$0");
        cardInsuranceDetailsActivity.m99566i3().mo88862qw().mo88851Lf();
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public static final void m99560b3(CardInsuranceDetailsActivity cardInsuranceDetailsActivity, View view) {
        C41536l.m120489i(cardInsuranceDetailsActivity, "this$0");
        cardInsuranceDetailsActivity.m99566i3().mo88862qw().mo88852Vb();
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public static final void m99561c3(CardInsuranceDetailsActivity cardInsuranceDetailsActivity, String str, Bundle bundle) {
        C41536l.m120489i(cardInsuranceDetailsActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        if (bundle.getBoolean("RESULT_KEY_INSURANCE_CHANGED", false)) {
            cardInsuranceDetailsActivity.m99566i3().onRefresh(6);
            cardInsuranceDetailsActivity.m99566i3().mo88862qw().mo88853qt();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public final void m99562d3(CardInsuranceStatusUiModel cardInsuranceStatusUiModel) {
        CreditCardWidgetBannerView creditCardWidgetBannerView = m99564g3().f88227f;
        C18917a aVar = r1;
        C18917a aVar2 = new C18917a(cardInsuranceStatusUiModel.mo82055a(), cardInsuranceStatusUiModel.mo82056b(), C34645a.m101746a(cardInsuranceStatusUiModel.mo82061f()), "", false, (String) null, false, false, false, cardInsuranceStatusUiModel.mo82059e(), C32343x.m95388F(cardInsuranceStatusUiModel.mo82062g().mo72343g(), new Object[0]), Integer.valueOf(C0767a.m2893c(m99564g3().mo3946b().getContext(), cardInsuranceStatusUiModel.mo82062g().mo72342f())), 448, (DefaultConstructorMarker) null);
        creditCardWidgetBannerView.setInfoData(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public final void m99563e3(CardInsuranceStatusUiModel cardInsuranceStatusUiModel) {
        C31898d dVar;
        if (cardInsuranceStatusUiModel.mo82062g() == C31901f.INSURED) {
            dVar = C31898d.ON;
        } else {
            dVar = C31898d.OFF;
        }
        m99564g3().f88240s.setDrawableTint(C18358g.m62729c(dVar.mo72330b()));
        m99564g3().f88240s.setTitle(C32343x.m95388F(cardInsuranceStatusUiModel.mo82062g().mo72340c(), new Object[0]));
        m99564g3().f88240s.setText(C32343x.m95388F(cardInsuranceStatusUiModel.mo82062g().mo72339b(), new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public final C36599h m99564g3() {
        return (C36599h) this.f82440I.getValue();
    }

    /* renamed from: h3 */
    private final C31627a m99565h3() {
        return (C31627a) this.f82441J.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public final C36102i m99566i3() {
        return (C36102i) this.f82439H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public final void m99567j3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C33852k(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C33853l(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C33854m(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public static final void m99568k3(CardInsuranceDetailsActivity cardInsuranceDetailsActivity, boolean z) {
        cardInsuranceDetailsActivity.m99564g3().f88226e.setLoading(z);
        cardInsuranceDetailsActivity.m99564g3().f88228g.setEnabled(!z);
    }

    /* renamed from: l1 */
    private final void m99569l1() {
        C36096c sw = m99566i3().mo88864sw();
        sw.mo88858Vd().mo4819k(this, new C33861t(new C33841b(this)));
        sw.mo88859dl().mo4819k(this, new C33861t(new C33842c(this)));
        C37224b.m109963b(sw.mo88861st(), this, new C33843d(this));
        C37224b.m109963b(sw.mo88855E3(), this, new C33845e(this));
        C37224b.m109963b(sw.mo88857Lc(), this, new C33847f(this));
        sw.mo88856G5().mo4819k(this, new C33861t(new C33848g(this)));
        C37224b.m109963b(sw.mo88860sp(), this, new C33849h(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public final void m99570l3(C31128a aVar) {
        C31132b.m92645g(aVar, new int[]{1, 6}, new C33855n(this));
        C31132b.m92648j(aVar, (int[]) null, new C33856o(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C33857p(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public final void m99571m3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C33858q(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C33859r(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C33860s(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public static final void m99572n3(CardInsuranceDetailsActivity cardInsuranceDetailsActivity, boolean z) {
        LoadingView loadingView = cardInsuranceDetailsActivity.m99564g3().f88242u;
        C41536l.m120488h(loadingView, "binding.insuranceDetailsLoader");
        C32343x.m95483r1(loadingView, z, false, 2, (Object) null);
        LayerView layerView = cardInsuranceDetailsActivity.m99564g3().f88241t;
        C41536l.m120488h(layerView, "binding.insuranceDetailsContainer");
        C32343x.m95483r1(layerView, !z, false, 2, (Object) null);
        Button button = cardInsuranceDetailsActivity.m99564g3().f88226e;
        C41536l.m120488h(button, "binding.cancelInsuranceButton");
        C32343x.m95483r1(button, !z, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public final void m99573o3(C31900e eVar, C43064a aVar) {
        C13310d dVar = new C13310d();
        dVar.mo35647a2(C13310d.C13312b.TITLE_CLOSE_TWO_BUTTON);
        dVar.mo35648c2(eVar.mo72335d());
        dVar.mo35639Q1(eVar.mo72334c());
        dVar.mo35646Z1(eVar.mo72333b());
        dVar.mo35642U1(eVar.mo72332a());
        dVar.mo35645Y1(new C31501a(dVar));
        dVar.mo35641T1(new C31502b(aVar, dVar));
        dVar.mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public static final void m99574p3(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$this_with");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public static final void m99575q3(C43064a aVar, C13310d dVar, Button button) {
        C41536l.m120489i(aVar, "$callback");
        C41536l.m120489i(dVar, "$this_with");
        C41536l.m120489i(button, "it");
        aVar.invoke();
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public final void m99576r3(boolean z) {
        Group group = m99564g3().f88247z;
        C41536l.m120488h(group, "binding.loaders");
        C32343x.m95483r1(group, z, false, 2, (Object) null);
        if (z) {
            Group group2 = m99564g3().f88230i;
            C41536l.m120488h(group2, "binding.commonDetails");
            C32343x.m95455i0(group2);
            Group group3 = m99564g3().f88243v;
            C41536l.m120488h(group3, "binding.insuranceEnabledDetails");
            C32343x.m95455i0(group3);
        }
    }

    /* renamed from: s3 */
    private final void m99577s3() {
        m99564g3().f88226e.setButtonText(C32343x.m95388F("card.insurance.insured.page.button.deactivate", new Object[0]));
        m99564g3().f88244w.setAdapter(m99565h3());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0080  */
    /* renamed from: t3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m99578t3(z31.C40143a r8) {
        /*
            r7 = this;
            iy0.h r0 = r7.m99564g3()
            ge.bog.designsystem.components.list.SingleLineTextItem r0 = r0.f88246y
            i31.c r1 = r8.mo94077d()
            java.lang.String r1 = r1.mo89072c()
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r1 = g91.C32343x.m95388F(r1, r3)
            r0.setText(r1)
            iy0.h r0 = r7.m99564g3()
            androidx.constraintlayout.widget.Group r0 = r0.f88243v
            java.lang.String r1 = "binding.insuranceEnabledDetails"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            g91.C32343x.m95447f1(r0)
            iy0.h r0 = r7.m99564g3()
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f88239r
            i31.a r1 = r8.mo94075b()
            r3 = 0
            if (r1 == 0) goto L_0x0055
            i31.a r1 = r8.mo94075b()
            kotlin.jvm.internal.C41536l.m120486f(r1)
            double r5 = r1.mo89058a()
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0055
            i31.a r1 = r8.mo94075b()
            kotlin.jvm.internal.C41536l.m120486f(r1)
            double r5 = r1.mo89058a()
            java.lang.String r1 = "GEL"
            java.lang.String r1 = g91.C32303f.m95200k(r5, r1)
            goto L_0x005d
        L_0x0055:
            java.lang.String r1 = "text.insurence.fee.free"
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r1 = g91.C32343x.m95388F(r1, r5)
        L_0x005d:
            r0.setText(r1)
            iy0.h r0 = r7.m99564g3()
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f88245x
            java.lang.String r1 = "card.insurance.price.annualy"
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r1 = g91.C32343x.m95388F(r1, r5)
            r0.setText(r1)
            pw.n r0 = r8.mo94076c()
            kotlin.jvm.internal.C41536l.m120486f(r0)
            java.lang.Long r0 = r0.mo67161p()
            java.lang.String r1 = "binding.nextPayments"
            if (r0 == 0) goto L_0x00ea
            i31.a r0 = r8.mo94075b()
            kotlin.jvm.internal.C41536l.m120486f(r0)
            double r5 = r0.mo89058a()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ea
            pw.n r0 = r8.mo94076c()
            kotlin.jvm.internal.C41536l.m120486f(r0)
            java.lang.Long r0 = r0.mo67161p()
            if (r0 == 0) goto L_0x00da
            long r3 = r0.longValue()
            iy0.h r0 = r7.m99564g3()
            androidx.constraintlayout.widget.Group r0 = r0.f88220B
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            g91.C32343x.m95447f1(r0)
            iy0.h r0 = r7.m99564g3()
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f88219A
            java.lang.String r5 = "card.insurance.next.charge.date"
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r5 = g91.C32343x.m95388F(r5, r6)
            java.lang.String r6 = "dd.MM.yyyy"
            java.lang.String r3 = g91.C32319m.m95297d(r3, r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            java.lang.String r5 = " "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.setText(r3)
            he1.w r0 = he1.C41238w.f97225a
            goto L_0x00db
        L_0x00da:
            r0 = 0
        L_0x00db:
            if (r0 != 0) goto L_0x00f6
            iy0.h r0 = r7.m99564g3()
            androidx.constraintlayout.widget.Group r0 = r0.f88220B
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            g91.C32343x.m95455i0(r0)
            goto L_0x00f6
        L_0x00ea:
            iy0.h r0 = r7.m99564g3()
            androidx.constraintlayout.widget.Group r0 = r0.f88220B
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            g91.C32343x.m95455i0(r0)
        L_0x00f6:
            i31.c r8 = r8.mo94077d()
            dz0.a r0 = r7.m99565h3()
            r1 = 2
            ez0.c[] r1 = new ez0.C31897c[r1]
            ez0.c r3 = new ez0.c
            java.lang.String r4 = "card.insurance.limit.pos.description"
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r4 = g91.C32343x.m95388F(r4, r5)
            java.lang.String r5 = r8.mo89076f()
            r3.<init>(r4, r5)
            r1[r2] = r3
            ez0.c r3 = new ez0.c
            java.lang.String r4 = "card.insurance.limit.online.payments.description"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r2 = g91.C32343x.m95388F(r4, r2)
            java.lang.String r8 = r8.mo89074e()
            r3.<init>(r2, r8)
            r8 = 1
            r1[r8] = r3
            java.util.List r8 = ie1.C41341q.m119910m(r1)
            r0.mo6029i(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity.m99578t3(z31.a):void");
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        if (C41536l.m120484d(str4, "SCA_TAG_CANCEL_INSURANCE")) {
            m99566i3().mo88862qw().mo88850Iv(str, str2, str3);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
            C41185v f0 = C32343x.m95446f0(supportFragmentManager, "SCA_TAG_CANCEL_INSURANCE");
            if (f0 != null) {
                f0.mo4577k1();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m99564g3().mo3946b());
        super.mo37451O1(bundle);
        m99577s3();
        m99569l1();
        m99556X2();
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        if (C41536l.m120484d(str2, "SCA_TAG_CANCEL_INSURANCE")) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
            C41185v f0 = C32343x.m95446f0(supportFragmentManager, "SCA_TAG_CANCEL_INSURANCE");
            if (f0 != null) {
                f0.mo4577k1();
            }
        }
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
    }

    /* renamed from: f3 */
    public final C36091a mo82018f3() {
        C36091a aVar = this.f82438G;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("assistedFactory");
        return null;
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("card.insurance.main.page.header", new Object[0]);
    }
}

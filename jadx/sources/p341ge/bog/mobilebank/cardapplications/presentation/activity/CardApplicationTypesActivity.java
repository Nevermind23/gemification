package p341ge.bog.mobilebank.cardapplications.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0173b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import b41.C31128a;
import b41.C31132b;
import g91.C32300e0;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C41519a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import o31.C37588a0;
import o31.C37613p;
import p017b.C2106d;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.cardapplications.presentation.actionsheet.C13955d;
import p341ge.bog.mobilebank.cardapplications.presentation.actionsheet.C13964j;
import p341ge.bog.mobilebank.cardapplications.presentation.actionsheet.C13970l;
import p341ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity;
import p341ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity;
import p341ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantCardStatusActivity;
import p341ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.OrderInstantCardActivity;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeDetailsUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardClientCountryInfoUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardRenewalListItem;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardPayrollInfoUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.ScoolCardOwnerUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p380ck.C10464h;
import p398dn.C12330d;
import p412en.C12531g0;
import p412en.C12536h0;
import p412en.C12542i0;
import p412en.C12616r0;
import p481jm.C16228g;
import p593rm.C17645a;
import p593rm.C17647b;
import p593rm.C17649c;
import p593rm.C17651d;
import p593rm.C17653e;
import p621tm.C17997e;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardApplicationTypesActivity */
public final class CardApplicationTypesActivity extends C14082a {

    /* renamed from: L */
    public static final C13975a f41365L = new C13975a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C12531g0 f41366G;

    /* renamed from: H */
    private final C41217g f41367H = C41219i.m119470b(new C13977c(this));

    /* renamed from: I */
    private final C41217g f41368I = new C1617p0(C41520a0.m120436b(C12616r0.class), new C13994r(this), new C13996t(this), new C13995s((C43064a) null, this));

    /* renamed from: J */
    private final C41217g f41369J = C41219i.m119470b(new C13978d(this));
    /* access modifiers changed from: private */

    /* renamed from: K */
    public final C0173b f41370K;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardApplicationTypesActivity$a */
    public static final class C13975a {
        private C13975a() {
        }

        public /* synthetic */ C13975a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo39069a(Context context, String str, String str2, boolean z) {
            C41536l.m120489i(context, "context");
            context.startActivity(C37613p.m110614a(new Intent(context, CardApplicationTypesActivity.class), C41233s.m119492a("ARG_APP_TYPE", str), C41233s.m119492a("ARG_CARD_SUB_PRODUCT_CODE", str2), C41233s.m119492a("ARG_IS_DEFAULT_CARD_DIGITAL", Boolean.valueOf(z))));
        }

        /* renamed from: b */
        public final void mo39070b(Context context, Long l) {
            C41536l.m120489i(context, "context");
            context.startActivity(C37613p.m110614a(new Intent(context, CardApplicationTypesActivity.class), C41233s.m119492a("ARG_RECOVER_CARD_ID", l)));
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardApplicationTypesActivity$b */
    public /* synthetic */ class C13976b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41371a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                nm.i[] r0 = p537nm.C17088i.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                nm.i r1 = p537nm.C17088i.CANT_ACTIVATE_YET     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                nm.i r1 = p537nm.C17088i.CAN_ACTIVATE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                nm.i r1 = p537nm.C17088i.NOT_REQUESTED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f41371a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cardapplications.presentation.activity.CardApplicationTypesActivity.C13976b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardApplicationTypesActivity$c */
    static final class C13977c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CardApplicationTypesActivity f41372d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13977c(CardApplicationTypesActivity cardApplicationTypesActivity) {
            super(0);
            this.f41372d = cardApplicationTypesActivity;
        }

        /* renamed from: b */
        public final C16228g invoke() {
            return C16228g.m57840d(this.f41372d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardApplicationTypesActivity$d */
    static final class C13978d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CardApplicationTypesActivity f41373d;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardApplicationTypesActivity$d$a */
        /* synthetic */ class C13979a extends C41519a implements C43075l {
            C13979a(Object obj) {
                super(1, obj, C12536h0.class, "onCardAppTypeClick", "onCardAppTypeClick(Lge/bog/mobilebank/cardapplications/presentation/model/CardApplicationTypeDetailsUiModel;Ljava/lang/String;)V", 0);
            }

            /* renamed from: b */
            public final void mo39073b(CardApplicationTypeDetailsUiModel cardApplicationTypeDetailsUiModel) {
                C41536l.m120489i(cardApplicationTypeDetailsUiModel, "p0");
                C12536h0.C12537a.m47635a((C12536h0) this.f97690d, cardApplicationTypeDetailsUiModel, (String) null, 2, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo39073b((CardApplicationTypeDetailsUiModel) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13978d(CardApplicationTypesActivity cardApplicationTypesActivity) {
            super(0);
            this.f41373d = cardApplicationTypesActivity;
        }

        /* renamed from: b */
        public final C17997e invoke() {
            return new C17997e(new C13979a(this.f41373d.m51988Z2().mo33295Jw()));
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardApplicationTypesActivity$e */
    static final class C13980e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardApplicationTypesActivity f41374d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13980e(CardApplicationTypesActivity cardApplicationTypesActivity) {
            super(1);
            this.f41374d = cardApplicationTypesActivity;
        }

        /* renamed from: a */
        public final void mo39074a(C31128a aVar) {
            CardApplicationTypesActivity cardApplicationTypesActivity = this.f41374d;
            C41536l.m120488h(aVar, "result");
            cardApplicationTypesActivity.m51991c3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39074a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardApplicationTypesActivity$f */
    static final class C13981f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardApplicationTypesActivity f41375d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13981f(CardApplicationTypesActivity cardApplicationTypesActivity) {
            super(1);
            this.f41375d = cardApplicationTypesActivity;
        }

        /* renamed from: a */
        public final void mo39075a(CardApplicationTypeData cardApplicationTypeData) {
            C41536l.m120489i(cardApplicationTypeData, "it");
            CardOrderListActivity.C13998a aVar = CardOrderListActivity.f41389O;
            CardApplicationTypesActivity cardApplicationTypesActivity = this.f41375d;
            CardOrderListActivity.C13998a.m52073b(aVar, cardApplicationTypesActivity, cardApplicationTypeData, cardApplicationTypesActivity.f41370K, (List) null, this.f41375d.getIntent().getBooleanExtra("ARG_IS_DEFAULT_CARD_DIGITAL", false), false, 8, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39075a((CardApplicationTypeData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardApplicationTypesActivity$g */
    /* synthetic */ class C13982g extends C41535k implements C43075l {
        C13982g(Object obj) {
            super(1, obj, CardApplicationTypesActivity.class, "openInstantCardScreen", "openInstantCardScreen(Lge/bog/mobilebank/cardapplications/presentation/model/CardClientCountryInfoUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo39076b(CardClientCountryInfoUiModel cardClientCountryInfoUiModel) {
            C41536l.m120489i(cardClientCountryInfoUiModel, "p0");
            ((CardApplicationTypesActivity) this.receiver).m51994f3(cardClientCountryInfoUiModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39076b((CardClientCountryInfoUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardApplicationTypesActivity$h */
    static final class C13983h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardApplicationTypesActivity f41376d;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardApplicationTypesActivity$h$a */
        /* synthetic */ class C13984a extends C41535k implements C43075l {
            C13984a(Object obj) {
                super(1, obj, CardApplicationTypesActivity.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
            }

            /* renamed from: b */
            public final void mo39078b(Throwable th) {
                ((CardApplicationTypesActivity) this.receiver).mo74709H1(th);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo39078b((Throwable) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13983h(CardApplicationTypesActivity cardApplicationTypesActivity) {
            super(1);
            this.f41376d = cardApplicationTypesActivity;
        }

        /* renamed from: a */
        public final void mo39077a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92643e(aVar, (int[]) null, new C13984a(this.f41376d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39077a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardApplicationTypesActivity$i */
    /* synthetic */ class C13985i extends C41535k implements C43075l {
        C13985i(Object obj) {
            super(1, obj, CardApplicationTypesActivity.class, "openActionSheetForScoolCard", "openActionSheetForScoolCard(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo39079b(List list) {
            C41536l.m120489i(list, "p0");
            ((CardApplicationTypesActivity) this.receiver).m51993e3(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39079b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardApplicationTypesActivity$j */
    /* synthetic */ class C13986j extends C41535k implements C43075l {
        C13986j(Object obj) {
            super(1, obj, CardApplicationTypesActivity.class, "openActionSheetForPayroll", "openActionSheetForPayroll(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo39080b(List list) {
            C41536l.m120489i(list, "p0");
            ((CardApplicationTypesActivity) this.receiver).m51992d3(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39080b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardApplicationTypesActivity$k */
    /* synthetic */ class C13987k extends C41535k implements C43075l {
        C13987k(Object obj) {
            super(1, obj, CardApplicationTypesActivity.class, "showRenewalActionSheet", "showRenewalActionSheet(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo39081b(List list) {
            C41536l.m120489i(list, "p0");
            ((CardApplicationTypesActivity) this.receiver).m51998j3(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39081b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardApplicationTypesActivity$l */
    static final class C13988l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardApplicationTypesActivity f41377d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13988l(CardApplicationTypesActivity cardApplicationTypesActivity) {
            super(1);
            this.f41377d = cardApplicationTypesActivity;
        }

        /* renamed from: a */
        public final void mo39082a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f41377d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39082a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardApplicationTypesActivity$m */
    static final class C13989m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43075l f41378d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13989m(C43075l lVar) {
            super(1);
            this.f41378d = lVar;
        }

        /* renamed from: a */
        public final void mo39083a(C37223a aVar) {
            Object a = aVar.mo90296a();
            if (a != null) {
                this.f41378d.invoke(a);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39083a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardApplicationTypesActivity$n */
    static final class C13990n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardApplicationTypesActivity f41379d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13990n(CardApplicationTypesActivity cardApplicationTypesActivity) {
            super(1);
            this.f41379d = cardApplicationTypesActivity;
        }

        /* renamed from: a */
        public final void mo39084a(List list) {
            LoadingView loadingView = this.f41379d.m51986W2().f45834g;
            C41536l.m120488h(loadingView, "binding.cardsListLoader");
            C32343x.m95447f1(loadingView);
            RecyclerView recyclerView = this.f41379d.m51986W2().f45833f;
            C41536l.m120488h(recyclerView, "binding.cardsList");
            C32343x.m95455i0(recyclerView);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39084a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardApplicationTypesActivity$o */
    static final class C13991o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardApplicationTypesActivity f41380d;

        /* renamed from: e */
        final /* synthetic */ C31128a f41381e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13991o(CardApplicationTypesActivity cardApplicationTypesActivity, C31128a aVar) {
            super(1);
            this.f41380d = cardApplicationTypesActivity;
            this.f41381e = aVar;
        }

        /* renamed from: a */
        public final void mo39085a(List list) {
            C41536l.m120489i(list, "it");
            LoadingView loadingView = this.f41380d.m51986W2().f45834g;
            C41536l.m120488h(loadingView, "binding.cardsListLoader");
            C32343x.m95455i0(loadingView);
            RecyclerView recyclerView = this.f41380d.m51986W2().f45833f;
            C41536l.m120488h(recyclerView, "binding.cardsList");
            C32343x.m95447f1(recyclerView);
            this.f41380d.m51987X2().mo6029i((List) this.f41381e.mo71340a());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39085a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardApplicationTypesActivity$p */
    static final class C13992p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardApplicationTypesActivity f41382d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13992p(CardApplicationTypesActivity cardApplicationTypesActivity) {
            super(1);
            this.f41382d = cardApplicationTypesActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            LoadingView loadingView = this.f41382d.m51986W2().f45834g;
            C41536l.m120488h(loadingView, "binding.cardsListLoader");
            C32343x.m95455i0(loadingView);
            RecyclerView recyclerView = this.f41382d.m51986W2().f45833f;
            C41536l.m120488h(recyclerView, "binding.cardsList");
            C32343x.m95455i0(recyclerView);
            ConstraintLayout constraintLayout = this.f41382d.m51986W2().f45835h;
            C41536l.m120488h(constraintLayout, "binding.errorContainer");
            C32343x.m95447f1(constraintLayout);
            this.f41382d.m51986W2().f45836i.setText(C32343x.m95431a0(th, (String) null, 1, (Object) null));
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardApplicationTypesActivity$q */
    static final class C13993q implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f41383a;

        C13993q(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f41383a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f41383a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f41383a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardApplicationTypesActivity$r */
    public static final class C13994r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f41384d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13994r(ComponentActivity componentActivity) {
            super(0);
            this.f41384d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f41384d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardApplicationTypesActivity$s */
    public static final class C13995s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f41385d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f41386e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13995s(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f41385d = aVar;
            this.f41386e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f41385d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f41386e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardApplicationTypesActivity$t */
    static final class C13996t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CardApplicationTypesActivity f41387d;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.CardApplicationTypesActivity$t$a */
        static final class C13997a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ CardApplicationTypesActivity f41388d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13997a(CardApplicationTypesActivity cardApplicationTypesActivity) {
                super(0);
                this.f41388d = cardApplicationTypesActivity;
            }

            /* renamed from: b */
            public final C12616r0 invoke() {
                Long l;
                String str;
                boolean z;
                C12531g0 Y2 = this.f41388d.mo39068Y2();
                Intent intent = this.f41388d.getIntent();
                String str2 = null;
                if (intent != null) {
                    long longExtra = intent.getLongExtra("ARG_RECOVER_CARD_ID", -1);
                    C12330d dVar = C12330d.f36975a;
                    Long valueOf = Long.valueOf(longExtra);
                    if (longExtra == -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    l = (Long) dVar.mo32928h(valueOf, z);
                } else {
                    l = null;
                }
                Intent intent2 = this.f41388d.getIntent();
                if (intent2 != null) {
                    str = intent2.getStringExtra("ARG_APP_TYPE");
                } else {
                    str = null;
                }
                Intent intent3 = this.f41388d.getIntent();
                if (intent3 != null) {
                    str2 = intent3.getStringExtra("ARG_CARD_SUB_PRODUCT_CODE");
                }
                return Y2.mo32559a(l, str, str2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13996t(CardApplicationTypesActivity cardApplicationTypesActivity) {
            super(0);
            this.f41387d = cardApplicationTypesActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C13997a(this.f41387d));
        }
    }

    public CardApplicationTypesActivity() {
        C0173b registerForActivityResult = registerForActivityResult(new C2106d(), new C17645a(this));
        C41536l.m120488h(registerForActivityResult, "registerForActivityResul…       finish()\n        }");
        this.f41370K = registerForActivityResult;
    }

    /* renamed from: S2 */
    private final void m51982S2() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.mo4367F1("REQUEST_KEY_SCHOOL_CARD_OWNER", this, new C17647b(this));
        supportFragmentManager.mo4367F1("REQUEST_KEY_SELECTED_ORG", this, new C17649c(this));
        supportFragmentManager.mo4367F1("REQUEST_KEY_CARD_RENEWAL", this, new C17651d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public static final void m51983T2(CardApplicationTypesActivity cardApplicationTypesActivity, String str, Bundle bundle) {
        C41536l.m120489i(cardApplicationTypesActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        ScoolCardOwnerUiModel scoolCardOwnerUiModel = (ScoolCardOwnerUiModel) bundle.getParcelable("RESULT_KEY_SCHOOL_CARD_OWNER");
        if (scoolCardOwnerUiModel != null) {
            cardApplicationTypesActivity.m51988Z2().mo33295Jw().mo33165Jv(scoolCardOwnerUiModel);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public static final void m51984U2(CardApplicationTypesActivity cardApplicationTypesActivity, String str, Bundle bundle) {
        C41536l.m120489i(cardApplicationTypesActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        DebitCardPayrollInfoUiModel debitCardPayrollInfoUiModel = (DebitCardPayrollInfoUiModel) bundle.getParcelable("RESULT_KEY_SELECTED_ORG");
        if (debitCardPayrollInfoUiModel != null) {
            cardApplicationTypesActivity.m51988Z2().mo33295Jw().mo33166lj(debitCardPayrollInfoUiModel);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public static final void m51985V2(CardApplicationTypesActivity cardApplicationTypesActivity, String str, Bundle bundle) {
        C41536l.m120489i(cardApplicationTypesActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        CardRenewalListItem.CardRenewalCardItem cardRenewalCardItem = (CardRenewalListItem.CardRenewalCardItem) bundle.getParcelable("RESULT_KEY_RENEWAL_SELECTED_CARD");
        if (cardRenewalCardItem != null) {
            cardApplicationTypesActivity.m51988Z2().mo33295Jw().mo33167pd(cardRenewalCardItem);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public final C16228g m51986W2() {
        return (C16228g) this.f41367H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public final C17997e m51987X2() {
        return (C17997e) this.f41369J.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public final C12616r0 m51988Z2() {
        return (C12616r0) this.f41368I.getValue();
    }

    /* renamed from: a3 */
    private final void m51989a3() {
        C12542i0 Kw = m51988Z2().mo33296Kw();
        Kw.mo33173dn().mo4819k(this, new C13993q(new C13980e(this)));
        m51990b3(Kw.mo33172Se(), new C13981f(this));
        m51990b3(Kw.mo33176zs(), new C13982g(this));
        Kw.mo33174i().mo4819k(this, new C13993q(new C13983h(this)));
        m51990b3(Kw.mo33171R4(), new C13985i(this));
        m51990b3(Kw.mo33175lh(), new C13986j(this));
        m51990b3(Kw.mo33170Qc(), new C13987k(this));
        m51990b3(Kw.mo33169F(), new C13988l(this));
    }

    /* renamed from: b3 */
    private final void m51990b3(LiveData liveData, C43075l lVar) {
        liveData.mo4819k(this, new C13993q(new C13989m(lVar)));
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public final void m51991c3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C13990n(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C13991o(this, aVar), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C13992p(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public final void m51992d3(List list) {
        C13964j.f41353J.mo39059a(list).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public final void m51993e3(List list) {
        C13970l.f41359K.mo39065a(list).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public final void m51994f3(CardClientCountryInfoUiModel cardClientCountryInfoUiModel) {
        int i = C13976b.f41371a[cardClientCountryInfoUiModel.mo39389a().ordinal()];
        if (i == 1) {
            InstantCardStatusActivity.f41528H.mo39211a(this, C32300e0.f79712a.mo72819e(cardClientCountryInfoUiModel.mo39391d(), cardClientCountryInfoUiModel.mo39390b()));
        } else if (i == 2) {
            ActivateInstantCardActivity.f41492L.mo39173a(this, this.f41370K);
            String lowerCase = C10464h.C10466b.PRODUCT.name().toLowerCase(Locale.ROOT);
            C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            C32343x.m95393H0(this, "Instant_Delivery", lowerCase, "open_activate", C10464h.C10465a.FIREBASE, (Bundle) null, 16, (Object) null);
        } else if (i == 3) {
            OrderInstantCardActivity.f41561I.mo39242a(this, this.f41370K);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public static final void m51995g3(CardApplicationTypesActivity cardApplicationTypesActivity, ActivityResult activityResult) {
        C41536l.m120489i(cardApplicationTypesActivity, "this$0");
        if (activityResult.mo371b() == 3) {
            cardApplicationTypesActivity.finish();
        }
    }

    /* renamed from: h3 */
    private final void m51996h3() {
        m51986W2().f45840m.setOnClickListener(new C17653e(this));
        m51986W2().f45832e.setTitle(C32343x.m95388F("text.card.applications.list.title", new Object[0]));
        m51986W2().f45833f.setItemAnimator((RecyclerView.C1742m) null);
        m51986W2().f45833f.setAdapter(m51987X2());
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public static final void m51997i3(CardApplicationTypesActivity cardApplicationTypesActivity, View view) {
        C41536l.m120489i(cardApplicationTypesActivity, "this$0");
        C21481a.onRefresh$default(cardApplicationTypesActivity.m51988Z2(), 0, 1, (Object) null);
        ConstraintLayout constraintLayout = cardApplicationTypesActivity.m51986W2().f45835h;
        C41536l.m120488h(constraintLayout, "binding.errorContainer");
        C32343x.m95455i0(constraintLayout);
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public final void m51998j3(List list) {
        C13955d.f41339J.mo39053a(list).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m51986W2().mo3946b());
        super.mo37451O1(bundle);
        m51996h3();
        m51982S2();
        m51989a3();
    }

    /* renamed from: Y2 */
    public final C12531g0 mo39068Y2() {
        C12531g0 g0Var = this.f41366G;
        if (g0Var != null) {
            return g0Var;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("text.card.applications.card.application.header", new Object[0]);
    }
}

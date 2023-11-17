package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import ba1.C10220y;
import ct0.C31414f;
import dt0.C31589e;
import dt0.C31590f;
import dt0.C31591g;
import dt0.C31592h;
import dt0.C31593i;
import dt0.C31594j;
import dt0.C31595k;
import g91.C32303f;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lt0.C37152a;
import lt0.C37153b;
import m41.C37223a;
import m41.C37224b;
import o00.C26656a;
import o00.C26657b;
import o31.C37588a0;
import ot0.C37770o;
import ot0.C37772p;
import ot0.C37775q;
import ot0.C37783u;
import p00.C27113k;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxDataUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxTariffUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankAccountUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.CreateCasViewModel$CreateCasParams;
import p341ge.bog.mobilebank.model.offers.Summary;
import p341ge.bog.mobilebank.shared2.network.ApiError;
import p629uh.C18167d;
import p745er.C20288a;
import q31.C38125h;
import rs0.C38338e;
import ue1.C43064a;
import ue1.C43075l;
import vs0.C39442a;
import yd0.C30003b;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity */
public final class CreateCasActivity extends C32899b implements C26656a, C26657b {

    /* renamed from: K */
    public static final C32819a f80671K = new C32819a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private final C41217g f80672G = C41219i.m119470b(new C32832j(this));

    /* renamed from: H */
    public C37770o f80673H;

    /* renamed from: I */
    private final C41217g f80674I = new C1617p0(C41520a0.m120436b(C37783u.class), new C32842t(this), new C32844v(this), new C32843u((C43064a) null, this));

    /* renamed from: J */
    private final C41217g f80675J = C41219i.m119470b(new C32833k(this));

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity$a */
    public static final class C32819a {
        private C32819a() {
        }

        public /* synthetic */ C32819a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo74711a(Context context, long j) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, CreateCasActivity.class);
            intent.putExtra("EXTRA_CAS_PARAMS", new CreateCasViewModel$CreateCasParams(j));
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity$b */
    /* synthetic */ class C32820b extends C41535k implements C43075l {
        C32820b(Object obj) {
            super(1, obj, CreateCasActivity.class, "onMoneyBoxResult", "onMoneyBoxResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo74712b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((CreateCasActivity) this.receiver).m96946l3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74712b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity$c */
    /* synthetic */ class C32821c extends C41535k implements C43075l {
        C32821c(Object obj) {
            super(1, obj, CreateCasActivity.class, "onAccountSelected", "onAccountSelected(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo74713b(List list) {
            C41536l.m120489i(list, "p0");
            ((CreateCasActivity) this.receiver).m96943j3(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74713b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity$d */
    /* synthetic */ class C32822d extends C41535k implements C43075l {
        C32822d(Object obj) {
            super(1, obj, CreateCasActivity.class, "onInputUpdate", "onInputUpdate(Lge/bog/mobilebank/loyaltyandbonusprograms/presentation/model/moneybox/MoneyBoxInput;)V", 0);
        }

        /* renamed from: b */
        public final void mo74714b(C37153b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((CreateCasActivity) this.receiver).m96944k3(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74714b((C37153b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity$e */
    /* synthetic */ class C32823e extends C41535k implements C43075l {
        C32823e(Object obj) {
            super(1, obj, CreateCasActivity.class, "refreshHeaderText", "refreshHeaderText(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo74715b(String str) {
            ((CreateCasActivity) this.receiver).mo86429X1(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74715b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity$f */
    /* synthetic */ class C32824f extends C41535k implements C43075l {
        C32824f(Object obj) {
            super(1, obj, Button.class, "setEnabled", "setEnabled(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo74716b(boolean z) {
            ((Button) this.receiver).setEnabled(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74716b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity$g */
    static final class C32825g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreateCasActivity f80676d;

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity$g$a */
        /* synthetic */ class C32826a extends C41535k implements C43075l {
            C32826a(Object obj) {
                super(1, obj, CreateCasActivity.class, "showPopup", "showPopup(Lge/bog/mobilebank/endyearcampaign2022/domain/model/EndYearCampaignInfo;)V", 0);
            }

            /* renamed from: b */
            public final void mo74718b(C30003b bVar) {
                C41536l.m120489i(bVar, "p0");
                ((CreateCasActivity) this.receiver).m96952r3(bVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo74718b((C30003b) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32825g(CreateCasActivity createCasActivity) {
            super(1);
            this.f80676d = createCasActivity;
        }

        /* renamed from: a */
        public final void mo74717a(C31128a aVar) {
            CreateCasActivity createCasActivity = this.f80676d;
            C41536l.m120488h(aVar, "it");
            createCasActivity.m96942i3(aVar, new C32826a(this.f80676d));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74717a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity$h */
    static final class C32827h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreateCasActivity f80677d;

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity$h$a */
        static final class C32828a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ CreateCasActivity f80678d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32828a(CreateCasActivity createCasActivity) {
                super(1);
                this.f80678d = createCasActivity;
            }

            /* renamed from: a */
            public final void mo74720a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                this.f80678d.m96950p3(false);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo74720a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity$h$b */
        static final class C32829b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ CreateCasActivity f80679d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32829b(CreateCasActivity createCasActivity) {
                super(1);
                this.f80679d = createCasActivity;
            }

            /* renamed from: a */
            public final void mo74721a(C41238w wVar) {
                this.f80679d.m96950p3(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo74721a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity$h$c */
        /* synthetic */ class C32830c extends C41535k implements C43075l {
            C32830c(Object obj) {
                super(1, obj, CreateCasActivity.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
            }

            /* renamed from: b */
            public final void mo74722b(Throwable th) {
                ((CreateCasActivity) this.receiver).mo74709H1(th);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo74722b((Throwable) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32827h(CreateCasActivity createCasActivity) {
            super(1);
            this.f80677d = createCasActivity;
        }

        /* renamed from: a */
        public final void mo74719a(C31128a aVar) {
            CreateCasActivity createCasActivity = this.f80677d;
            C41536l.m120488h(aVar, "invoke$lambda$0");
            C31132b.m92648j(aVar, (int[]) null, new C32828a(createCasActivity), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C32829b(createCasActivity), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C32830c(createCasActivity), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74719a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity$i */
    static final class C32831i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreateCasActivity f80680d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32831i(CreateCasActivity createCasActivity) {
            super(1);
            this.f80680d = createCasActivity;
        }

        /* renamed from: a */
        public final void mo74723a(C37223a aVar) {
            String str = (String) aVar.mo90296a();
            if (str != null) {
                this.f80680d.m96947m3(str);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74723a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity$j */
    static final class C32832j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CreateCasActivity f80681d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32832j(CreateCasActivity createCasActivity) {
            super(0);
            this.f80681d = createCasActivity;
        }

        /* renamed from: b */
        public final C39442a invoke() {
            return C39442a.m114617d(this.f80681d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity$k */
    static final class C32833k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CreateCasActivity f80682d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32833k(CreateCasActivity createCasActivity) {
            super(0);
            this.f80682d = createCasActivity;
        }

        /* renamed from: b */
        public final CreateCasViewModel$CreateCasParams invoke() {
            CreateCasViewModel$CreateCasParams createCasViewModel$CreateCasParams = (CreateCasViewModel$CreateCasParams) this.f80682d.getIntent().getParcelableExtra("EXTRA_CAS_PARAMS");
            return createCasViewModel$CreateCasParams == null ? new CreateCasViewModel$CreateCasParams(-1) : createCasViewModel$CreateCasParams;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity$l */
    static final class C32834l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreateCasActivity f80683d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32834l(CreateCasActivity createCasActivity) {
            super(1);
            this.f80683d = createCasActivity;
        }

        /* renamed from: a */
        public final void mo74726a(Object obj) {
            this.f80683d.m96950p3(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74726a(obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity$m */
    /* synthetic */ class C32835m extends C41535k implements C43075l {
        C32835m(Object obj) {
            super(1, obj, CreateCasActivity.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
        }

        /* renamed from: b */
        public final void mo74727b(Throwable th) {
            ((CreateCasActivity) this.receiver).mo74709H1(th);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74727b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity$n */
    static final class C32836n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreateCasActivity f80684d;

        /* renamed from: e */
        final /* synthetic */ C43075l f80685e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32836n(CreateCasActivity createCasActivity, C43075l lVar) {
            super(1);
            this.f80684d = createCasActivity;
            this.f80685e = lVar;
        }

        /* renamed from: a */
        public final void mo74728a(Object obj) {
            this.f80684d.m96950p3(false);
            C43075l lVar = this.f80685e;
            if (lVar != null) {
                lVar.invoke(obj);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74728a(obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity$o */
    static final class C32837o extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C32837o f80686d = new C32837o();

        C32837o() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(CasAccountUiModel casAccountUiModel) {
            C41536l.m120489i(casAccountUiModel, "it");
            String b = casAccountUiModel.mo75003b();
            double f = casAccountUiModel.mo75007f();
            String g = casAccountUiModel.mo75008g();
            if (g == null) {
                g = "GEL";
            }
            String k = C32303f.m95200k(f, g);
            return b + " (" + k + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity$p */
    static final class C32838p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreateCasActivity f80687d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32838p(CreateCasActivity createCasActivity) {
            super(1);
            this.f80687d = createCasActivity;
        }

        /* renamed from: a */
        public final void mo74730a(MoneyBoxDataUiModel moneyBoxDataUiModel) {
            this.f80687d.m96939e3().f93673o.mo53597e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74730a((MoneyBoxDataUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity$q */
    static final class C32839q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreateCasActivity f80688d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32839q(CreateCasActivity createCasActivity) {
            super(1);
            this.f80688d = createCasActivity;
        }

        /* renamed from: a */
        public final void mo74731a(MoneyBoxDataUiModel moneyBoxDataUiModel) {
            C41536l.m120489i(moneyBoxDataUiModel, "it");
            this.f80688d.m96939e3().f93673o.mo53595c();
            this.f80688d.m96948n3(moneyBoxDataUiModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74731a((MoneyBoxDataUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity$r */
    static final class C32840r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreateCasActivity f80689d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32840r(CreateCasActivity createCasActivity) {
            super(1);
            this.f80689d = createCasActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            String str;
            C41536l.m120489i(th, "err");
            this.f80689d.m96939e3().f93676r.getButton().setEnabled(false);
            this.f80689d.m96939e3().f93673o.mo53596d();
            PageState pageState = this.f80689d.m96939e3().f93678t;
            if (th instanceof ApiError) {
                str = C32343x.m95420V(((ApiError) th).mo84685a().getKey(), C32343x.m95452h0(C10220y.f28366O0, new Object[0]), new Object[0]);
            } else {
                str = th.getMessage();
                if (str == null) {
                    str = C32343x.m95452h0(C10220y.f28366O0, new Object[0]);
                }
            }
            pageState.setTitleText(str);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity$s */
    static final class C32841s implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f80690a;

        C32841s(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f80690a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f80690a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f80690a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity$t */
    public static final class C32842t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f80691d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32842t(ComponentActivity componentActivity) {
            super(0);
            this.f80691d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f80691d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity$u */
    public static final class C32843u extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f80692d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f80693e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32843u(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f80692d = aVar;
            this.f80693e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f80692d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f80693e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity$v */
    static final class C32844v extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CreateCasActivity f80694d;

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity$v$a */
        static final class C32845a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ CreateCasActivity f80695d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32845a(CreateCasActivity createCasActivity) {
                super(0);
                this.f80695d = createCasActivity;
            }

            /* renamed from: b */
            public final C37783u invoke() {
                return this.f80695d.mo74710g3().mo32531a(this.f80695d.m96940f3().mo75215a());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32844v(CreateCasActivity createCasActivity) {
            super(0);
            this.f80694d = createCasActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C32845a(this.f80694d));
        }
    }

    /* renamed from: V2 */
    private final void m96930V2(ChipGroup chipGroup, int i, boolean z) {
        boolean z2 = false;
        if (i >= 0 && i < chipGroup.getChipCount()) {
            z2 = true;
        }
        if (z2) {
            chipGroup.mo35182m(i, z);
        }
    }

    /* renamed from: W2 */
    private final void m96931W2() {
        getSupportFragmentManager().mo4367F1("REQUEST_KEY_END_YEAR_CAMPAIGN_POPUP", this, new C31590f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public static final void m96932X2(CreateCasActivity createCasActivity, String str, Bundle bundle) {
        C41536l.m120489i(createCasActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        if (bundle.getBoolean("RESULT_KEY_END_YEAR_CAMPAIGN_POPUP_CLOSED", true)) {
            createCasActivity.finish();
        }
    }

    /* renamed from: Y2 */
    private final void m96933Y2() {
        C39442a e3 = m96939e3();
        e3.f93665g.setOnChipActivatedChangedListener(new C31591g(this));
        m96939e3().f93664f.setOnClickListener(new C31592h(this));
        e3.f93676r.getButton().setOnClickListener(new C31593i(this));
        e3.f93675q.setOnClickListener(new C31594j(this));
        getSupportFragmentManager().mo4367F1("REQUEST_KEY_PIGGY_BANK_ACCOUNTS", this, new C31595k(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public static final void m96934Z2(CreateCasActivity createCasActivity, Chip chip, int i) {
        C41536l.m120489i(createCasActivity, "this$0");
        C41536l.m120489i(chip, "<anonymous parameter 0>");
        createCasActivity.m96941h3().mo91039xw().mo91028V(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public static final void m96935a3(CreateCasActivity createCasActivity, View view) {
        C41536l.m120489i(createCasActivity, "this$0");
        createCasActivity.m96941h3().mo91039xw().mo91030r8();
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public static final void m96936b3(CreateCasActivity createCasActivity, View view) {
        C41536l.m120489i(createCasActivity, "this$0");
        C37772p.C37773a.m111000a(createCasActivity.m96941h3().mo91039xw(), false, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public static final void m96937c3(CreateCasActivity createCasActivity, View view) {
        C41536l.m120489i(createCasActivity, "this$0");
        createCasActivity.m96941h3().onRefresh(6);
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public static final void m96938d3(CreateCasActivity createCasActivity, String str, Bundle bundle) {
        C41536l.m120489i(createCasActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        Iterable<PiggyBankAccountUiModel> parcelableArrayList = bundle.getParcelableArrayList("RESULT_KEY_PIGGY_BANK_SELECTED_ACCOUNTS");
        if (parcelableArrayList == null) {
            parcelableArrayList = C41341q.m119907j();
        }
        C37772p xw = createCasActivity.m96941h3().mo91039xw();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(parcelableArrayList, 10));
        for (PiggyBankAccountUiModel a : parcelableArrayList) {
            arrayList.add(a.mo75157a());
        }
        xw.mo91027Nc(arrayList);
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public final C39442a m96939e3() {
        return (C39442a) this.f80672G.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public final CreateCasViewModel$CreateCasParams m96940f3() {
        return (CreateCasViewModel$CreateCasParams) this.f80675J.getValue();
    }

    /* renamed from: h3 */
    private final C37783u m96941h3() {
        return (C37783u) this.f80674I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public final void m96942i3(C31128a aVar, C43075l lVar) {
        C31132b.m92646h(aVar, (int[]) null, new C32834l(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C32835m(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C32836n(this, lVar), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public final void m96943j3(List list) {
        C31414f.C31415a.m93354b(C31414f.f77961P, list, (String) null, (String) null, (String) null, 14, (Object) null).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public final void m96944k3(C37153b bVar) {
        C37152a d = bVar.mo90136d();
        if (d != null) {
            int b = d.mo90130b();
            ChipGroup chipGroup = m96939e3().f93665g;
            C41536l.m120488h(chipGroup, "binding.amountChipGroup");
            m96930V2(chipGroup, b, false);
        }
        m96939e3().f93664f.setInputText(C41358y.m120017g0(bVar.mo90135c(), ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C32837o.f80686d, 30, (Object) null));
    }

    /* renamed from: l1 */
    private final void m96945l1() {
        C37775q yw = m96941h3().mo91040yw();
        yw.mo91034ak().mo4819k(this, new C32841s(new C32820b(this)));
        C37224b.m109963b(yw.mo91033Wm(), this, new C32821c(this));
        yw.mo91035e4().mo4819k(this, new C32841s(new C32822d(this)));
        yw.mo91032W5().mo4819k(this, new C32841s(new C32823e(this)));
        yw.mo91038xe().mo4819k(this, new C32841s(new C32824f(m96939e3().f93676r.getButton())));
        yw.mo91037to().mo4819k(this, new C32841s(new C32825g(this)));
        yw.mo91031U1().mo4819k(this, new C32841s(new C32827h(this)));
        yw.mo91036k().mo4819k(this, new C32841s(new C32831i(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public final void m96946l3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C32838p(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C32839q(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C32840r(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public final void m96947m3(String str) {
        C27113k c = C27113k.C27114a.m84066c(C27113k.f68083P, str, false, (String) null, (ArrayList) null, (Summary) null, C32343x.m95388F("cas.service.open.title", new Object[0]), 30, (Object) null);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        c.mo4576A1(supportFragmentManager, "PreContractDialogFragment");
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public final void m96948n3(MoneyBoxDataUiModel moneyBoxDataUiModel) {
        m96939e3().f93665g.mo35190t();
        List<MoneyBoxTariffUiModel> g = moneyBoxDataUiModel.mo75101g();
        ArrayList<Chip> arrayList = new ArrayList<>(C41343r.m119925u(g, 10));
        for (MoneyBoxTariffUiModel moneyBoxTariffUiModel : g) {
            Chip chip = new Chip(this, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            double e = moneyBoxTariffUiModel.mo75113e();
            String a = moneyBoxTariffUiModel.mo75109a();
            if (a == null) {
                a = "GEL";
            }
            chip.setChipTitle(C32303f.m95200k(e, a));
            chip.setChipType(C18167d.CHOICE_CHIP);
            arrayList.add(chip);
        }
        for (Chip eVar : arrayList) {
            m96939e3().f93665g.post(new C31589e(this, eVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public static final void m96949o3(CreateCasActivity createCasActivity, Chip chip) {
        C41536l.m120489i(createCasActivity, "this$0");
        C41536l.m120489i(chip, "$it");
        createCasActivity.m96939e3().f93665g.mo35183o(chip);
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public final void m96950p3(boolean z) {
        View view = m96939e3().f93671m;
        C41536l.m120488h(view, "binding.loadingWall");
        C32343x.m95483r1(view, z, false, 2, (Object) null);
        m96939e3().f93676r.getButton().setLoading(z);
        m96939e3().f93676r.getButton().setEnabled(!z);
    }

    /* renamed from: q3 */
    private final void m96951q3() {
        m96939e3().f93674p.setTitle(C32343x.m95388F("cas.service.open.header.dep", new Object[0]));
        m96939e3().f93674p.setText(C32343x.m95388F("cas.service.open.descriprion.dep", new Object[0]));
        m96939e3().f93666h.setText(C32343x.m95388F("cas.service.open.choose.amount", new Object[0]));
        m96939e3().f93663e.setText(C32343x.m95388F("cas.service.open.choose.accounts.title", new Object[0]));
        m96939e3().f93664f.setHintText((CharSequence) C32343x.m95388F("cas.service.open.choose.accounts", new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public final void m96952r3(C30003b bVar) {
        if (bVar.mo70300c()) {
            C38125h.m112238c(this).mo91620o(bVar).mo4576A1(getSupportFragmentManager(), (String) null);
        } else {
            finish();
        }
    }

    /* renamed from: C */
    public void mo39136C() {
    }

    /* renamed from: H1 */
    public void mo74709H1(Throwable th) {
        super.mo74709H1(th);
        m96950p3(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m96939e3().mo3946b());
        super.mo37451O1(bundle);
        m96951q3();
        m96945l1();
        m96933Y2();
        m96931W2();
    }

    /* renamed from: g3 */
    public final C37770o mo74710g3() {
        C37770o oVar = this.f80673H;
        if (oVar != null) {
            return oVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* renamed from: m */
    public void mo39137m() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        C27113k c = C20288a.m66328c(supportFragmentManager, (String) null, 2, (Object) null);
        if (c != null) {
            c.mo4577k1();
        }
        m96941h3().mo91039xw().mo91029c8(true);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95452h0(C38338e.header_text_create_money_box, new Object[0]);
    }
}

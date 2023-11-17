package p341ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import g91.C32343x;
import h10.C24850a;
import he1.C41217g;
import he1.C41238w;
import iu0.C36546y;
import java.util.ArrayList;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o00.C26656a;
import p00.C27113k;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.viewmodel.MyCreditInfoDescriptionViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.productdescription.presentation.activity.ProductDescriptionActivity;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.offers.Summary;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p366bk.C10328q;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.activity.MyCreditInfoDescriptionActivity */
public final class MyCreditInfoDescriptionActivity extends C21349a implements C26656a {

    /* renamed from: L */
    public static final C21336a f57161L = new C21336a((DefaultConstructorMarker) null);

    /* renamed from: J */
    private final C41217g f57162J = new C1617p0(C41520a0.m120436b(MyCreditInfoDescriptionViewModel.class), new C21345j(this), new C21344i(this), new C21346k((C43064a) null, this));

    /* renamed from: K */
    public Client f57163K;

    /* renamed from: ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.activity.MyCreditInfoDescriptionActivity$a */
    public static final class C21336a {
        private C21336a() {
        }

        public /* synthetic */ C21336a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo53351a(C35388f2 f2Var) {
            C41536l.m120489i(f2Var, "activity");
            f2Var.startActivity(new Intent(f2Var, MyCreditInfoDescriptionActivity.class));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.activity.MyCreditInfoDescriptionActivity$b */
    /* synthetic */ class C21337b extends C41535k implements C43075l {
        C21337b(Object obj) {
            super(1, obj, MyCreditInfoDescriptionActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo53352b(boolean z) {
            ((MyCreditInfoDescriptionActivity) this.receiver).mo55531T2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53352b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.activity.MyCreditInfoDescriptionActivity$c */
    /* synthetic */ class C21338c extends C41535k implements C43075l {
        C21338c(Object obj) {
            super(1, obj, MyCreditInfoDescriptionActivity.class, "onPreContractLoaded", "onPreContractLoaded(Lge/bog/mobilebank/cleanarch/presentation/common/model/ContractUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo53353b(C24850a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((MyCreditInfoDescriptionActivity) this.receiver).m69002e3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53353b((C24850a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.activity.MyCreditInfoDescriptionActivity$d */
    /* synthetic */ class C21339d extends C41535k implements C43075l {
        C21339d(Object obj) {
            super(1, obj, MyCreditInfoDescriptionActivity.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo53354b(C21503d.C21504a aVar) {
            ((MyCreditInfoDescriptionActivity) this.receiver).mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53354b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.activity.MyCreditInfoDescriptionActivity$e */
    /* synthetic */ class C21340e extends C41535k implements C43075l {
        C21340e(Object obj) {
            super(1, obj, MyCreditInfoDescriptionActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo53355b(boolean z) {
            ((MyCreditInfoDescriptionActivity) this.receiver).mo55531T2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53355b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.activity.MyCreditInfoDescriptionActivity$f */
    /* synthetic */ class C21341f extends C41535k implements C43075l {
        C21341f(Object obj) {
            super(1, obj, MyCreditInfoDescriptionActivity.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo53356b(C21503d.C21504a aVar) {
            ((MyCreditInfoDescriptionActivity) this.receiver).mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53356b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.activity.MyCreditInfoDescriptionActivity$g */
    static final class C21342g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MyCreditInfoDescriptionActivity f57164d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21342g(MyCreditInfoDescriptionActivity myCreditInfoDescriptionActivity) {
            super(1);
            this.f57164d = myCreditInfoDescriptionActivity;
        }

        /* renamed from: a */
        public final void mo53357a(String str) {
            C41536l.m120489i(str, "phoneNumber");
            this.f57164d.m69001d3(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53357a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.activity.MyCreditInfoDescriptionActivity$h */
    static final class C21343h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MyCreditInfoDescriptionActivity f57165d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21343h(MyCreditInfoDescriptionActivity myCreditInfoDescriptionActivity) {
            super(1);
            this.f57165d = myCreditInfoDescriptionActivity;
        }

        /* renamed from: a */
        public final void mo53358a(View view) {
            C41536l.m120489i(view, "it");
            this.f57165d.m68998a3().mo53360Mn();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53358a((View) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.activity.MyCreditInfoDescriptionActivity$i */
    public static final class C21344i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f57166d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21344i(ComponentActivity componentActivity) {
            super(0);
            this.f57166d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f57166d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.activity.MyCreditInfoDescriptionActivity$j */
    public static final class C21345j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f57167d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21345j(ComponentActivity componentActivity) {
            super(0);
            this.f57167d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f57167d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.activity.MyCreditInfoDescriptionActivity$k */
    public static final class C21346k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f57168d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f57169e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21346k(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f57168d = aVar;
            this.f57169e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f57168d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f57169e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public final MyCreditInfoDescriptionViewModel m68998a3() {
        return (MyCreditInfoDescriptionViewModel) this.f57162J.getValue();
    }

    /* renamed from: b3 */
    private final C27113k m68999b3() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        return C32343x.m95443e0(supportFragmentManager, (String) null, 1, (Object) null);
    }

    /* renamed from: c3 */
    private final void m69000c3() {
        MyCreditInfoDescriptionViewModel a3 = m68998a3();
        C21484c.m69411c(a3.mo53361Q1(), this, new C21338c(this), new C21337b(this), new C21339d(this));
        C21484c.m69411c(a3.mo53363iw(), this, new C21342g(this), new C21340e(this), new C21341f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public final void m69001d3(String str) {
        MyCreditInfoRegisterResultActivity.f57170G.mo53359a(this, str);
        setResult(-1);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public final void m69002e3(C24850a aVar) {
        C27113k c = C27113k.C27114a.m84066c(C27113k.f68083P, aVar.mo63293a(), false, getString(C10328q.my_credit_info_pre_contract_button), (ArrayList) null, (Summary) null, (String) null, 58, (Object) null);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        c.mo4576A1(supportFragmentManager, (String) null);
    }

    /* renamed from: K2 */
    public String mo49588K2() {
        return "OFFERS_MY_CREDIT_INFO_REG";
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        m69000c3();
        ProductDescriptionActivity.m72913P2(this, (String) null, new C21343h(this), 1, (Object) null);
    }

    /* renamed from: Z2 */
    public final Client mo53350Z2() {
        Client client = this.f57163K;
        if (client != null) {
            return client;
        }
        C41536l.m120506z("client");
        return null;
    }

    /* renamed from: m */
    public void mo39137m() {
        C27113k b3 = m68999b3();
        if (b3 != null) {
            b3.mo4577k1();
        }
        m68998a3().mo53362hw(mo53350Z2().getLoginInfo().mo90306c(), "");
        C36546y.m108282F().mo27152s("my_credit_info", "", "my_credit_info_confirm_registration");
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.header_text_my_credit_info);
        C41536l.m120488h(string, "getString(R.string.header_text_my_credit_info)");
        return string;
    }
}

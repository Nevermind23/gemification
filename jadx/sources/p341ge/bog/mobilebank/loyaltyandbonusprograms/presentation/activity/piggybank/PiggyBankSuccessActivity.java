package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.core.content.C0767a;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.RecyclerView;
import b41.C31128a;
import b41.C31132b;
import ft0.C32009e;
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
import m41.C37224b;
import ot0.C37741f0;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankResult;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PiggyBankSuccessViewModel$ViewModel;
import p380ck.C10464h;
import q31.C38122f;
import q31.C38125h;
import rs0.C38335b;
import ue1.C43064a;
import ue1.C43075l;
import v31.C39198a;
import vs0.C39446e;
import yd0.C30003b;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankSuccessActivity */
public final class PiggyBankSuccessActivity extends C30772sa {

    /* renamed from: J */
    public static final C32976a f80847J = new C32976a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f80848F = new C1617p0(C41520a0.m120436b(PiggyBankSuccessViewModel$ViewModel.class), new C32987l(this), new C32986k(this), new C32988m((C43064a) null, this));

    /* renamed from: G */
    private final C41217g f80849G = C41219i.m119470b(new C32980e(this));

    /* renamed from: H */
    private final C41217g f80850H = C41219i.m119470b(C32977b.f80852d);

    /* renamed from: I */
    private final C41217g f80851I = C41219i.m119470b(new C32984i(this));

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankSuccessActivity$a */
    public static final class C32976a {
        private C32976a() {
        }

        public /* synthetic */ C32976a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo74860a(Context context, PiggyBankResult piggyBankResult) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(piggyBankResult, "piggyBankResult");
            Intent intent = new Intent(context, PiggyBankSuccessActivity.class);
            intent.putExtra("EXTRA_PIGGY_BANK_RESULT", piggyBankResult);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankSuccessActivity$b */
    static final class C32977b extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C32977b f80852d = new C32977b();

        C32977b() {
            super(0);
        }

        /* renamed from: b */
        public final C39198a invoke() {
            return new C39198a();
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankSuccessActivity$c */
    /* synthetic */ class C32978c extends C41535k implements C43075l {
        C32978c(Object obj) {
            super(1, obj, PiggyBankSuccessActivity.class, "onEndYearCampaignResult", "onEndYearCampaignResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo74862b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((PiggyBankSuccessActivity) this.receiver).m97280L2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74862b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankSuccessActivity$d */
    static final class C32979d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PiggyBankSuccessActivity f80853d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32979d(PiggyBankSuccessActivity piggyBankSuccessActivity) {
            super(1);
            this.f80853d = piggyBankSuccessActivity;
        }

        /* renamed from: a */
        public final void mo74863a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C38122f.C38123a.m112215k(C38125h.m112238c(this.f80853d), this.f80853d, (String) null, (Bundle) null, 6, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74863a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankSuccessActivity$e */
    static final class C32980e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PiggyBankSuccessActivity f80854d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32980e(PiggyBankSuccessActivity piggyBankSuccessActivity) {
            super(0);
            this.f80854d = piggyBankSuccessActivity;
        }

        /* renamed from: b */
        public final C39446e invoke() {
            return C39446e.m114637d(this.f80854d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankSuccessActivity$f */
    static final class C32981f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PiggyBankSuccessActivity f80855d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32981f(PiggyBankSuccessActivity piggyBankSuccessActivity) {
            super(1);
            this.f80855d = piggyBankSuccessActivity;
        }

        /* renamed from: a */
        public final void mo74865a(C30003b bVar) {
            PiggyBankSuccessActivity.m97281M2(this.f80855d, true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74865a((C30003b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankSuccessActivity$g */
    static final class C32982g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PiggyBankSuccessActivity f80856d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32982g(PiggyBankSuccessActivity piggyBankSuccessActivity) {
            super(1);
            this.f80856d = piggyBankSuccessActivity;
        }

        /* renamed from: a */
        public final void mo74866a(C30003b bVar) {
            C41536l.m120489i(bVar, "it");
            PiggyBankSuccessActivity.m97281M2(this.f80856d, false);
            if (bVar.mo70300c()) {
                C38125h.m112238c(this.f80856d).mo91620o(bVar).mo4576A1(this.f80856d.getSupportFragmentManager(), (String) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74866a((C30003b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankSuccessActivity$h */
    static final class C32983h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PiggyBankSuccessActivity f80857d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32983h(PiggyBankSuccessActivity piggyBankSuccessActivity) {
            super(1);
            this.f80857d = piggyBankSuccessActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            PiggyBankSuccessActivity.m97281M2(this.f80857d, false);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankSuccessActivity$i */
    static final class C32984i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PiggyBankSuccessActivity f80858d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32984i(PiggyBankSuccessActivity piggyBankSuccessActivity) {
            super(0);
            this.f80858d = piggyBankSuccessActivity;
        }

        /* renamed from: b */
        public final PiggyBankResult invoke() {
            return (PiggyBankResult) this.f80858d.getIntent().getParcelableExtra("EXTRA_PIGGY_BANK_RESULT");
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankSuccessActivity$j */
    static final class C32985j implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f80859a;

        C32985j(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f80859a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f80859a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f80859a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankSuccessActivity$k */
    public static final class C32986k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f80860d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32986k(ComponentActivity componentActivity) {
            super(0);
            this.f80860d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f80860d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankSuccessActivity$l */
    public static final class C32987l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f80861d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32987l(ComponentActivity componentActivity) {
            super(0);
            this.f80861d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f80861d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankSuccessActivity$m */
    public static final class C32988m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f80862d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f80863e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32988m(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f80862d = aVar;
            this.f80863e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f80862d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f80863e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: H2 */
    private final C39198a m97276H2() {
        return (C39198a) this.f80850H.getValue();
    }

    /* renamed from: I2 */
    private final C39446e m97277I2() {
        return (C39446e) this.f80849G.getValue();
    }

    /* renamed from: J2 */
    private final PiggyBankResult m97278J2() {
        return (PiggyBankResult) this.f80851I.getValue();
    }

    /* renamed from: K2 */
    private final PiggyBankSuccessViewModel$ViewModel m97279K2() {
        return (PiggyBankSuccessViewModel$ViewModel) this.f80848F.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public final void m97280L2(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C32981f(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C32982g(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C32983h(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public static final void m97281M2(PiggyBankSuccessActivity piggyBankSuccessActivity, boolean z) {
        piggyBankSuccessActivity.m97277I2().f93733j.setLoading(z);
    }

    /* renamed from: N2 */
    private final RecyclerView m97282N2() {
        RecyclerView recyclerView = m97277I2().f93729f;
        recyclerView.setAdapter(m97276H2());
        recyclerView.mo5351j(new C13364a(C0767a.m2895e(recyclerView.getContext(), C38335b.f91850e), true, false));
        C41536l.m120488h(recyclerView, "binding.accountsRecycler…n(dividerDecorator)\n    }");
        return recyclerView;
    }

    /* renamed from: O2 */
    private final void m97283O2(PiggyBankResult piggyBankResult) {
        C39446e I2 = m97277I2();
        I2.f93734k.setTitleText(C32343x.m95388F("cas.service.open.success.message", new Object[0]));
        I2.f93732i.setTitle(C32343x.m95388F("cas.service.open.success.details", new Object[0]));
        I2.f93733j.setButtonText(C32343x.m95388F("cas.service.open.success.redirection", new Object[0]));
        I2.f93730g.setTitle(C32343x.m95388F("cas.service.open.success.amount", new Object[0]));
        TwoLineTextItem twoLineTextItem = I2.f93730g;
        double e = piggyBankResult.mo75194b().mo75113e();
        String a = piggyBankResult.mo75194b().mo75109a();
        if (a == null) {
            a = "GEL";
        }
        twoLineTextItem.setText(C32303f.m95200k(e, a));
        I2.f93728e.setTitle(C32343x.m95388F("cas.service.open.success.linked.accounts", new Object[0]));
        m97282N2();
        C39198a H2 = m97276H2();
        List<CasAccountUiModel> a2 = piggyBankResult.mo75193a();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(a2, 10));
        for (CasAccountUiModel b : a2) {
            arrayList.add(b.mo75003b());
        }
        H2.mo6029i(arrayList);
        I2.f93733j.setOnClickListener(new C32009e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public static final void m97284P2(PiggyBankSuccessActivity piggyBankSuccessActivity, View view) {
        C41536l.m120489i(piggyBankSuccessActivity, "this$0");
        piggyBankSuccessActivity.m97279K2().mo75255gw().mo75253Tn();
    }

    /* renamed from: l1 */
    private final void m97285l1() {
        C37741f0 hw = m97279K2().mo75256hw();
        hw.mo75254Xe().mo4819k(this, new C32985j(new C32978c(this)));
        C37224b.m109963b(hw.mo75257ps(), this, new C32979d(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m97277I2().mo3946b());
        super.mo37451O1(bundle);
        C32343x.m95393H0(this, "piggy_bank", (String) null, "conversion_piggy_bank_create", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
        PiggyBankResult J2 = m97278J2();
        if (J2 == null) {
            finish();
            return;
        }
        m97283O2(J2);
        m97285l1();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("cas.service.open.title", new Object[0]);
    }
}

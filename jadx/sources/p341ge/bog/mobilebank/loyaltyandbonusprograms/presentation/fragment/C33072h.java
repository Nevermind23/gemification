package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import ct0.C31414f;
import g91.C32303f;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import ht0.C36204j;
import ht0.C36205k;
import ht0.C36206l;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import mt0.C37262f;
import ot0.C37799x;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankSuccessActivity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxTariffUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankResourcesUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankResult;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.CreatePiggyBankViewModel$ViewModel;
import p380ck.C10464h;
import ue1.C43064a;
import ue1.C43075l;
import vs0.C39452k;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.h */
public final class C33072h extends C33068d {

    /* renamed from: i */
    public static final C33073a f80979i = new C33073a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C39452k f80980g;

    /* renamed from: h */
    private final C41217g f80981h = C1514j0.m5374c(this, C41520a0.m120436b(CreatePiggyBankViewModel$ViewModel.class), new C33081h(this), new C33082i((C43064a) null, this), new C33083j(this));

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.h$a */
    public static final class C33073a {
        private C33073a() {
        }

        public /* synthetic */ C33073a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C33072h mo74959a() {
            return new C33072h();
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.h$b */
    static final class C33074b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33072h f80982d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33074b(C33072h hVar) {
            super(1);
            this.f80982d = hVar;
        }

        /* renamed from: a */
        public final void mo74960a(C31128a aVar) {
            if (aVar instanceof C31128a.C31131c) {
                this.f80982d.m97475u1(((PiggyBankResourcesUiModel) ((C31128a.C31131c) aVar).mo71340a()).mo75183b());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74960a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.h$c */
    /* synthetic */ class C33075c extends C41535k implements C43075l {
        C33075c(Object obj) {
            super(1, obj, C33072h.class, "onPiggyBankInputUpdate", "onPiggyBankInputUpdate(Lge/bog/mobilebank/loyaltyandbonusprograms/presentation/model/piggybank/PiggyBankInput;)V", 0);
        }

        /* renamed from: b */
        public final void mo74961b(C37262f fVar) {
            C41536l.m120489i(fVar, "p0");
            ((C33072h) this.receiver).m97478y1(fVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74961b((C37262f) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.h$d */
    static final class C33076d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33072h f80983d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33076d(C33072h hVar) {
            super(1);
            this.f80983d = hVar;
        }

        /* renamed from: a */
        public final void mo74962a(C37223a aVar) {
            List list = (List) aVar.mo90296a();
            if (list != null) {
                this.f80983d.m97462B1(list);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74962a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.h$e */
    static final class C33077e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33072h f80984d;

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.h$e$a */
        /* synthetic */ class C33078a extends C41535k implements C43075l {
            C33078a(Object obj) {
                super(1, obj, C33072h.class, "openSuccessPage", "openSuccessPage(Lge/bog/mobilebank/loyaltyandbonusprograms/presentation/model/piggybank/PiggyBankResult;)V", 0);
            }

            /* renamed from: b */
            public final void mo74964b(PiggyBankResult piggyBankResult) {
                C41536l.m120489i(piggyBankResult, "p0");
                ((C33072h) this.receiver).m97479z1(piggyBankResult);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo74964b((PiggyBankResult) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33077e(C33072h hVar) {
            super(1);
            this.f80984d = hVar;
        }

        /* renamed from: a */
        public final void mo74963a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C33078a(this.f80984d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74963a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.h$f */
    static final class C33079f extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C33079f f80985d = new C33079f();

        C33079f() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(CasAccountUiModel casAccountUiModel) {
            C41536l.m120489i(casAccountUiModel, "it");
            return casAccountUiModel.mo75003b();
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.h$g */
    static final class C33080g implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f80986a;

        C33080g(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f80986a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f80986a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f80986a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.h$h */
    public static final class C33081h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f80987d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33081h(Fragment fragment) {
            super(0);
            this.f80987d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f80987d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.h$i */
    public static final class C33082i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f80988d;

        /* renamed from: e */
        final /* synthetic */ Fragment f80989e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33082i(C43064a aVar, Fragment fragment) {
            super(0);
            this.f80988d = aVar;
            this.f80989e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f80988d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f80989e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.h$j */
    public static final class C33083j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f80990d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33083j(Fragment fragment) {
            super(0);
            this.f80990d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f80990d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: A1 */
    private final void m97461A1() {
        m97476v1().f93800j.setText(C32343x.m95388F("cas.service.open.choose.amount", new Object[0]));
        m97476v1().f93799i.setText(C32343x.m95388F("cas.service.open.choose.accounts.title", new Object[0]));
        m97476v1().f93795e.setHintText((CharSequence) C32343x.m95388F("cas.service.open.choose.accounts", new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public final void m97462B1(List list) {
        C31414f.C31415a.m93354b(C31414f.f77961P, list, (String) null, (String) null, (String) null, 14, (Object) null).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* renamed from: p1 */
    private final void m97470p1() {
        m97476v1().f93796f.setOnChipActivatedChangedListener(new C36204j(this));
        m97476v1().f93795e.setOnClickListener(new C36205k(this));
        getChildFragmentManager().mo4367F1("REQUEST_KEY_PIGGY_BANK_ACCOUNTS", getViewLifecycleOwner(), new C36206l(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public static final void m97471q1(C33072h hVar, Chip chip, int i) {
        C41536l.m120489i(hVar, "this$0");
        C41536l.m120489i(chip, "<anonymous parameter 0>");
        hVar.m97477x1().mo75225Cw().mo75233V(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m97472r1(C33072h hVar, View view) {
        C41536l.m120489i(hVar, "this$0");
        hVar.m97477x1().mo75225Cw().mo75228H0();
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m97473s1(C33072h hVar, String str, Bundle bundle) {
        C41536l.m120489i(hVar, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        List parcelableArrayList = bundle.getParcelableArrayList("RESULT_KEY_PIGGY_BANK_SELECTED_ACCOUNTS");
        if (parcelableArrayList == null) {
            parcelableArrayList = C41341q.m119907j();
        }
        hVar.m97477x1().mo75225Cw().mo75235iv(parcelableArrayList);
    }

    /* renamed from: t1 */
    private final void m97474t1() {
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37799x Dw = m97477x1().mo75226Dw();
        Dw.mo75239vs().mo4819k(viewLifecycleOwner, new C33080g(new C33074b(this)));
        Dw.mo75229Mg().mo4819k(viewLifecycleOwner, new C33080g(new C33075c(this)));
        Dw.mo75236pi().mo4819k(viewLifecycleOwner, new C33080g(new C33076d(this)));
        Dw.mo75230Pk().mo4819k(viewLifecycleOwner, new C33080g(new C33077e(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public final void m97475u1(List list) {
        m97476v1().f93796f.mo35190t();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MoneyBoxTariffUiModel moneyBoxTariffUiModel = (MoneyBoxTariffUiModel) it.next();
            ChipGroup chipGroup = m97476v1().f93796f;
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            Chip chip = new Chip(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            double e = moneyBoxTariffUiModel.mo75113e();
            String a = moneyBoxTariffUiModel.mo75109a();
            if (a == null) {
                a = "GEL";
            }
            chip.setChipTitle(C32303f.m95200k(e, a));
            chipGroup.mo35183o(chip);
        }
    }

    /* renamed from: v1 */
    private final C39452k m97476v1() {
        C39452k kVar = this.f80980g;
        C41536l.m120486f(kVar);
        return kVar;
    }

    /* renamed from: x1 */
    private final CreatePiggyBankViewModel$ViewModel m97477x1() {
        return (CreatePiggyBankViewModel$ViewModel) this.f80981h.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public final void m97478y1(C37262f fVar) {
        if (fVar.mo90369e() != -1) {
            m97476v1().f93796f.mo35182m(fVar.mo90369e(), false);
        }
        m97476v1().f93795e.setInputText(C41358y.m120017g0(fVar.mo90367c(), ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C33079f.f80985d, 30, (Object) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public final void m97479z1(PiggyBankResult piggyBankResult) {
        PiggyBankSuccessActivity.C32976a aVar = PiggyBankSuccessActivity.f80847J;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        aVar.mo74860a(requireContext, piggyBankResult);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f80980g = C39452k.m114664d(layoutInflater, viewGroup, false);
        C32343x.m95395I0(this, "piggy_bank", (String) null, "piggy_bank_select_amount_and_account", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
        m97461A1();
        m97474t1();
        m97470p1();
        ScrollView c = m97476v1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f80980g = null;
    }
}

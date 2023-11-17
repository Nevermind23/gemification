package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.C0767a;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.C1796h;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import b41.C31128a;
import b41.C31132b;
import ct0.C31414f;
import g91.C32303f;
import g91.C32335t0;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import ht0.C36208n;
import ht0.C36209o;
import ht0.C36210p;
import ht0.C36211q;
import ht0.C36212r;
import ht0.C36213s;
import ht0.C36214t;
import ht0.C36215u;
import ht0.C36216v;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import mt0.C37257a;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.toggle.ToggleView;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ChipGroupSelectorActionSheet;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.CasDetailsUiModel;
import p615tg.C17963d;
import pt0.C37986h;
import pt0.C37996r;
import rs0.C38334a;
import rs0.C38335b;
import ue1.C43064a;
import ue1.C43075l;
import vs0.C39453l;
import vs0.C39457p;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.PiggyBankDetailsFragment */
public final class PiggyBankDetailsFragment extends C33069e {

    /* renamed from: j */
    public static final C33005a f80881j = new C33005a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C39453l f80882g;

    /* renamed from: h */
    private final C41217g f80883h = C1514j0.m5374c(this, C41520a0.m120436b(C37996r.class), new C33020n(this), new C33021o((C43064a) null, this), new C33022p(this));

    /* renamed from: i */
    private final C41217g f80884i = m97353O1();

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.PiggyBankDetailsFragment$a */
    public static final class C33005a {
        private C33005a() {
        }

        public /* synthetic */ C33005a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.PiggyBankDetailsFragment$b */
    private static final class C33006b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C39457p f80885d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33006b(C39457p pVar) {
            super(pVar.mo3946b());
            C41536l.m120489i(pVar, "binding");
            this.f80885d = pVar;
        }

        /* renamed from: h */
        public final void mo74882h(CasAccountUiModel casAccountUiModel) {
            C41536l.m120489i(casAccountUiModel, "account");
            this.f80885d.f93835e.setText(casAccountUiModel.mo75003b());
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.PiggyBankDetailsFragment$c */
    static final class C33007c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PiggyBankDetailsFragment f80886d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33007c(PiggyBankDetailsFragment piggyBankDetailsFragment) {
            super(1);
            this.f80886d = piggyBankDetailsFragment;
        }

        /* renamed from: a */
        public final void mo74883a(Bundle bundle) {
            C41536l.m120489i(bundle, "it");
            if (bundle.getBoolean("RESULT_KEY_CLOSE_PIGGY_BANK_FINISH_ACTIVITY", false)) {
                this.f80886d.requireActivity().finish();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74883a((Bundle) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.PiggyBankDetailsFragment$d */
    static final class C33008d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PiggyBankDetailsFragment f80887d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33008d(PiggyBankDetailsFragment piggyBankDetailsFragment) {
            super(1);
            this.f80887d = piggyBankDetailsFragment;
        }

        /* renamed from: a */
        public final void mo74884a(Bundle bundle) {
            ClosePiggyBankActionSheet.C32778a aVar;
            C41536l.m120489i(bundle, "it");
            Serializable serializable = bundle.getSerializable("RESULT_KEY_CLOSE_PIGGY_BANK_ACTION");
            if (serializable instanceof ClosePiggyBankActionSheet.C32778a) {
                aVar = (ClosePiggyBankActionSheet.C32778a) serializable;
            } else {
                aVar = null;
            }
            if (aVar == ClosePiggyBankActionSheet.C32778a.PAUSE) {
                this.f80887d.m97349K1().mo91368Hw().mo91349ma();
            } else if (aVar == ClosePiggyBankActionSheet.C32778a.CHANGE_AMOUNT) {
                this.f80887d.m97349K1().mo91368Hw().mo91347b1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74884a((Bundle) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.PiggyBankDetailsFragment$e */
    static final class C33009e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PiggyBankDetailsFragment f80888d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33009e(PiggyBankDetailsFragment piggyBankDetailsFragment) {
            super(1);
            this.f80888d = piggyBankDetailsFragment;
        }

        /* renamed from: a */
        public final void mo74885a(Bundle bundle) {
            C41536l.m120489i(bundle, "it");
            long j = bundle.getLong("RESULT_KEY_CLOSE_PIGGY_BANK_CHOSEN_ACCOUNT_KEY", -1);
            if (j != -1) {
                this.f80888d.m97349K1().mo91350of(Long.valueOf(j));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74885a((Bundle) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.PiggyBankDetailsFragment$f */
    static final class C33010f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PiggyBankDetailsFragment f80889d;

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.PiggyBankDetailsFragment$f$a */
        /* synthetic */ class C33011a extends C41535k implements C43075l {
            C33011a(Object obj) {
                super(1, obj, PiggyBankDetailsFragment.class, "onPiggyBankDetails", "onPiggyBankDetails(Lge/bog/mobilebank/loyaltyandbonusprograms/presentation/model/piggybank/CasPagerDetailsUiModel;)V", 0);
            }

            /* renamed from: b */
            public final void mo74887b(C37257a aVar) {
                C41536l.m120489i(aVar, "p0");
                ((PiggyBankDetailsFragment) this.receiver).m97351M1(aVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo74887b((C37257a) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33010f(PiggyBankDetailsFragment piggyBankDetailsFragment) {
            super(1);
            this.f80889d = piggyBankDetailsFragment;
        }

        /* renamed from: a */
        public final void mo74886a(C31128a aVar) {
            C41536l.m120488h(aVar, "it");
            C31132b.m92648j(aVar, (int[]) null, new C33011a(this.f80889d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74886a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.PiggyBankDetailsFragment$g */
    static final class C33012g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PiggyBankDetailsFragment f80890d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33012g(PiggyBankDetailsFragment piggyBankDetailsFragment) {
            super(1);
            this.f80890d = piggyBankDetailsFragment;
        }

        /* renamed from: a */
        public final void mo74888a(List list) {
            C41536l.m120489i(list, "ls");
            this.f80890d.m97352N1("REQUEST_KEY_SELECT_AMOUNT", new ChipGroupSelectorActionSheet.ActionSheetData(list, C32343x.m95388F("cas.details.change.amount.actionsheet.title", new Object[0]), C32343x.m95388F("cas.details.change.amount.actionsheet.message", new Object[0]), C32343x.m95388F("cas.details.change.amount.actionsheet.button", new Object[0])));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74888a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.PiggyBankDetailsFragment$h */
    static final class C33013h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PiggyBankDetailsFragment f80891d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33013h(PiggyBankDetailsFragment piggyBankDetailsFragment) {
            super(1);
            this.f80891d = piggyBankDetailsFragment;
        }

        /* renamed from: a */
        public final void mo74889a(List list) {
            C41536l.m120489i(list, "ls");
            this.f80891d.m97352N1("REQUEST_KEY_SELECT_PAUSE_DURATION", new ChipGroupSelectorActionSheet.ActionSheetData(list, C32343x.m95388F("cas.details.pause.actionsheet.title", new Object[0]), C32343x.m95388F("cas.details.pause.actionsheet.message", new Object[0]), C32343x.m95388F("cas.details.pause.actionsheet.button", new Object[0])));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74889a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.PiggyBankDetailsFragment$i */
    static final class C33014i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PiggyBankDetailsFragment f80892d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33014i(PiggyBankDetailsFragment piggyBankDetailsFragment) {
            super(1);
            this.f80892d = piggyBankDetailsFragment;
        }

        /* renamed from: a */
        public final void mo74890a(List list) {
            C41536l.m120489i(list, "it");
            C31414f.f77961P.mo71776a(list, C32343x.m95388F("cas.details.change.accounts.actionsheet.message", new Object[0]), C32343x.m95388F("cas.details.change.accounts.actionsheet.title", new Object[0]), C32343x.m95388F("cas.details.change.accounts.actionsheet.button", new Object[0])).mo4576A1(this.f80892d.getChildFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74890a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.PiggyBankDetailsFragment$j */
    static final class C33015j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PiggyBankDetailsFragment f80893d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33015j(PiggyBankDetailsFragment piggyBankDetailsFragment) {
            super(1);
            this.f80893d = piggyBankDetailsFragment;
        }

        /* renamed from: a */
        public final void mo74891a(ClosePiggyBankActionSheet.ClosePiggyBankResources closePiggyBankResources) {
            C41536l.m120489i(closePiggyBankResources, "it");
            ClosePiggyBankActionSheet.f80614O.mo74675a(closePiggyBankResources).mo4576A1(this.f80893d.getChildFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74891a((ClosePiggyBankActionSheet.ClosePiggyBankResources) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.PiggyBankDetailsFragment$k */
    static final class C33016k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43075l f80894d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33016k(C43075l lVar) {
            super(1);
            this.f80894d = lVar;
        }

        /* renamed from: a */
        public final void mo74892a(C37223a aVar) {
            Object a = aVar.mo90296a();
            if (a != null) {
                this.f80894d.invoke(a);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74892a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.PiggyBankDetailsFragment$l */
    static final class C33017l extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C33017l f80895d = new C33017l();

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.PiggyBankDetailsFragment$l$a */
        public static final class C33018a extends C1819o {
            C33018a(C1796h.C1802f fVar) {
                super(fVar);
            }

            /* renamed from: k */
            public void onBindViewHolder(C33006b bVar, int i) {
                C41536l.m120489i(bVar, "holder");
                Object g = mo6027g(i);
                C41536l.m120488h(g, "getItem(position)");
                bVar.mo74882h((CasAccountUiModel) g);
            }

            /* renamed from: l */
            public C33006b onCreateViewHolder(ViewGroup viewGroup, int i) {
                C41536l.m120489i(viewGroup, "parent");
                C39457p d = C39457p.m114684d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d, "inflate(\n               …lse\n                    )");
                return new C33006b(d);
            }
        }

        C33017l() {
            super(0);
        }

        /* renamed from: b */
        public final C33018a invoke() {
            return new C33018a(C17963d.f51158a.mo45633d());
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.PiggyBankDetailsFragment$m */
    static final class C33019m implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f80896a;

        C33019m(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f80896a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f80896a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f80896a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.PiggyBankDetailsFragment$n */
    public static final class C33020n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f80897d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33020n(Fragment fragment) {
            super(0);
            this.f80897d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f80897d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.PiggyBankDetailsFragment$o */
    public static final class C33021o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f80898d;

        /* renamed from: e */
        final /* synthetic */ Fragment f80899e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33021o(C43064a aVar, Fragment fragment) {
            super(0);
            this.f80898d = aVar;
            this.f80899e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f80898d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f80899e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.PiggyBankDetailsFragment$p */
    public static final class C33022p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f80900d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33022p(Fragment fragment) {
            super(0);
            this.f80900d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f80900d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m97339A1(PiggyBankDetailsFragment piggyBankDetailsFragment, String str, Bundle bundle) {
        C41536l.m120489i(piggyBankDetailsFragment, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("RESULT_KEY_PIGGY_BANK_SELECTED_ACCOUNTS");
        if (parcelableArrayList != null) {
            piggyBankDetailsFragment.m97349K1().mo91368Hw().mo91343I0(parcelableArrayList);
        }
    }

    /* renamed from: B1 */
    private final void m97340B1() {
        m97348J1().f93816r.setOnClickListener(new C36208n(this));
        m97348J1().f93812n.setOnClickListener(new C36209o(this));
        m97348J1().f93809k.setOnClickListener(new C36210p(this));
        m97348J1().f93807i.setOnClickListener(new C36211q(this));
        m97348J1().f93819u.setOnClickListener(new C36212r(this));
        m97371x1();
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public static final void m97341C1(PiggyBankDetailsFragment piggyBankDetailsFragment, View view) {
        C41536l.m120489i(piggyBankDetailsFragment, "this$0");
        ToggleView toggleView = piggyBankDetailsFragment.m97348J1().f93816r;
        C41536l.m120488h(toggleView, "binding.piggyBankActiveStateToggle");
        C32343x.m95486s1(toggleView);
        piggyBankDetailsFragment.m97349K1().mo91368Hw().mo91349ma();
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public static final void m97342D1(PiggyBankDetailsFragment piggyBankDetailsFragment, View view) {
        C41536l.m120489i(piggyBankDetailsFragment, "this$0");
        piggyBankDetailsFragment.m97349K1().mo91368Hw().mo91351us();
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public static final void m97343E1(PiggyBankDetailsFragment piggyBankDetailsFragment, View view) {
        C41536l.m120489i(piggyBankDetailsFragment, "this$0");
        piggyBankDetailsFragment.m97349K1().mo91368Hw().mo91344L2();
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m97344F1(PiggyBankDetailsFragment piggyBankDetailsFragment, View view) {
        C41536l.m120489i(piggyBankDetailsFragment, "this$0");
        piggyBankDetailsFragment.m97349K1().mo91368Hw().mo91346Zp();
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public static final void m97345G1(PiggyBankDetailsFragment piggyBankDetailsFragment, View view) {
        C41536l.m120489i(piggyBankDetailsFragment, "this$0");
        piggyBankDetailsFragment.m97349K1().mo91368Hw().mo91347b1();
    }

    /* renamed from: H1 */
    private final void m97346H1() {
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37986h Iw = m97349K1().mo91369Iw();
        Iw.mo91359Ur().mo4819k(viewLifecycleOwner, new C33019m(new C33010f(this)));
        m97350L1(Iw.mo91361tq(), new C33012g(this));
        m97350L1(Iw.mo91353Gq(), new C33013h(this));
        m97350L1(Iw.mo91357P7(), new C33014i(this));
        m97350L1(Iw.mo91358Q3(), new C33015j(this));
    }

    /* renamed from: I1 */
    private final C1819o m97347I1() {
        return (C1819o) this.f80884i.getValue();
    }

    /* renamed from: J1 */
    private final C39453l m97348J1() {
        C39453l lVar = this.f80882g;
        C41536l.m120486f(lVar);
        return lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public final C37996r m97349K1() {
        return (C37996r) this.f80883h.getValue();
    }

    /* renamed from: L1 */
    private final void m97350L1(LiveData liveData, C43075l lVar) {
        liveData.mo4819k(getViewLifecycleOwner(), new C33019m(new C33016k(lVar)));
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public final void m97351M1(C37257a aVar) {
        CasDetailsUiModel a = aVar.mo90344a();
        m97354P1(a.mo75137p(), String.valueOf(a.mo75130h()));
        m97348J1().f93818t.setText(C32303f.m95200k(a.mo75135l(), a.mo75133j()));
        m97348J1().f93813o.setText(a.mo75132i().mo75084b());
        m97347I1().mo6029i(a.mo75122a());
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public final void m97352N1(String str, ChipGroupSelectorActionSheet.ActionSheetData actionSheetData) {
        ChipGroupSelectorActionSheet.f80607J.mo74663a(actionSheetData, str).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* renamed from: O1 */
    private final C41217g m97353O1() {
        return C41219i.m119470b(C33017l.f80895d);
    }

    /* renamed from: P1 */
    private final void m97354P1(boolean z, String str) {
        String str2;
        int i;
        View view = m97348J1().f93805g;
        C41536l.m120488h(view, "binding.activeStateDivider");
        C32343x.m95483r1(view, z, false, 2, (Object) null);
        InlineFeedback inlineFeedback = m97348J1().f93806h;
        C41536l.m120488h(inlineFeedback, "binding.activeStateFeedback");
        C32343x.m95483r1(inlineFeedback, !z, false, 2, (Object) null);
        TwoLineTextItem twoLineTextItem = m97348J1().f93815q;
        if (z) {
            str2 = "cas.details.active";
        } else {
            str2 = "cas.details.paused";
        }
        twoLineTextItem.setText(C32343x.m95388F(str2, new Object[0]));
        m97348J1().f93816r.setChecked(z);
        AppCompatImageView appCompatImageView = m97348J1().f93814p;
        if (z) {
            i = C32335t0.m95357b();
        } else {
            i = getResources().getColor(C38334a.f91848c);
        }
        appCompatImageView.setImageTintList(ColorStateList.valueOf(i));
        m97348J1().f93806h.setTitleText(C32343x.m95388F("cas.details.paused.message", str));
    }

    /* renamed from: Q1 */
    private final void m97355Q1() {
        m97348J1().f93817s.setTitle(C32343x.m95388F("cas.details.control.cas", new Object[0]));
        m97348J1().f93815q.setTitle(C32343x.m95388F("cas.details.cas", new Object[0]));
        m97348J1().f93806h.setCaptionText(C32343x.m95388F("cas.details.paused.caption", new Object[0]));
        m97348J1().f93818t.setTitle(C32343x.m95388F("cas.details.cas.amount", new Object[0]));
        m97348J1().f93813o.setTitle(C32343x.m95388F("cas.details.cas.account", new Object[0]));
        m97348J1().f93810l.setTitle(C32343x.m95388F("cas.details.cas.linked.accounts", new Object[0]));
        m97348J1().f93810l.setText(C32343x.m95388F("cas.details.cas.linked.accounts.desc", new Object[0]));
        m97348J1().f93808j.setText(C32343x.m95388F("cas.details.deactivate", new Object[0]));
    }

    /* renamed from: R1 */
    private final void m97356R1() {
        m97355Q1();
        C13364a aVar = new C13364a(C0767a.m2895e(requireContext(), C38335b.f91850e), true, false);
        m97348J1().f93803e.setLayoutManager(new PiggyBankDetailsFragment$setupViews$1(getContext()));
        m97348J1().f93803e.mo5351j(aVar);
        m97348J1().f93803e.setAdapter(m97347I1());
    }

    /* renamed from: u1 */
    private final void m97369u1(String str, C43075l lVar) {
        getChildFragmentManager().mo4367F1(str, getViewLifecycleOwner(), new C36216v(lVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public static final void m97370v1(C43075l lVar, String str, Bundle bundle) {
        C41536l.m120489i(lVar, "$action");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        lVar.invoke(bundle);
    }

    /* renamed from: x1 */
    private final void m97371x1() {
        getChildFragmentManager().mo4367F1("REQUEST_KEY_SELECT_AMOUNT", getViewLifecycleOwner(), new C36213s(this));
        getChildFragmentManager().mo4367F1("REQUEST_KEY_SELECT_PAUSE_DURATION", getViewLifecycleOwner(), new C36214t(this));
        getChildFragmentManager().mo4367F1("REQUEST_KEY_PIGGY_BANK_ACCOUNTS", getViewLifecycleOwner(), new C36215u(this));
        m97369u1("REQUEST_KEY_CLOSE_PIGGY_BANK_ACTION_SHEET", new C33007c(this));
        m97369u1("REQUEST_KEY_CLOSE_PIGGY_BANK_ACTION_SHEET_ACTION", new C33008d(this));
        m97369u1("REQUEST_KEY_CLOSE_PIGGY_BANK_ACTION_SHEET_CHOOSE_ACCOUNT", new C33009e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m97372y1(PiggyBankDetailsFragment piggyBankDetailsFragment, String str, Bundle bundle) {
        C41536l.m120489i(piggyBankDetailsFragment, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        piggyBankDetailsFragment.m97349K1().mo91368Hw().mo91345W(bundle.getInt("RESULT_KEY_SELECTED_CHIP", -1));
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m97373z1(PiggyBankDetailsFragment piggyBankDetailsFragment, String str, Bundle bundle) {
        C41536l.m120489i(piggyBankDetailsFragment, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        piggyBankDetailsFragment.m97349K1().mo91368Hw().mo91348b8(bundle.getInt("RESULT_KEY_SELECTED_CHIP", -1));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f80882g = C39453l.m114668d(layoutInflater, viewGroup, false);
        m97356R1();
        m97346H1();
        m97340B1();
        NestedScrollView c = m97348J1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f80882g = null;
    }
}

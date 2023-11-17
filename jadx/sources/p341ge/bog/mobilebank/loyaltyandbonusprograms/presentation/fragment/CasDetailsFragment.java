package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
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
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import ht0.C36195a;
import ht0.C36196b;
import ht0.C36197c;
import ht0.C36198d;
import ht0.C36199e;
import ht0.C36200f;
import ht0.C36201g;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import ot0.C37736d;
import ot0.C37748j;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ChipGroupSelectorActionSheet;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.CasDetailsUiModel;
import p615tg.C17963d;
import rs0.C38335b;
import ue1.C43064a;
import ue1.C43075l;
import vs0.C39453l;
import vs0.C39457p;
import x00.C29606a;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.CasDetailsFragment */
public final class CasDetailsFragment extends C33031b {

    /* renamed from: j */
    public static final C32991a f80866j = new C32991a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C39453l f80867g;

    /* renamed from: h */
    private final C41217g f80868h = C1514j0.m5374c(this, C41520a0.m120436b(C37748j.class), new C33002j(this), new C33003k((C43064a) null, this), new C33004l(this));

    /* renamed from: i */
    private final C41217g f80869i = m97308J1();

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.CasDetailsFragment$a */
    public static final class C32991a {
        private C32991a() {
        }

        public /* synthetic */ C32991a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.CasDetailsFragment$b */
    private static final class C32992b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C39457p f80870d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32992b(C39457p pVar) {
            super(pVar.mo3946b());
            C41536l.m120489i(pVar, "binding");
            this.f80870d = pVar;
        }

        /* renamed from: h */
        public final void mo74871h(CasAccountUiModel casAccountUiModel) {
            C41536l.m120489i(casAccountUiModel, "account");
            this.f80870d.f93835e.setText(casAccountUiModel.mo75003b());
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.CasDetailsFragment$c */
    static final class C32993c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CasDetailsFragment f80871d;

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.CasDetailsFragment$c$a */
        /* synthetic */ class C32994a extends C41535k implements C43075l {
            C32994a(Object obj) {
                super(1, obj, CasDetailsFragment.class, "onPiggyBankDetails", "onPiggyBankDetails(Lge/bog/mobilebank/loyaltyandbonusprograms/presentation/model/piggybank/CasDetailsUiModel;)V", 0);
            }

            /* renamed from: b */
            public final void mo74873b(CasDetailsUiModel casDetailsUiModel) {
                C41536l.m120489i(casDetailsUiModel, "p0");
                ((CasDetailsFragment) this.receiver).m97303E1(casDetailsUiModel);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo74873b((CasDetailsUiModel) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32993c(CasDetailsFragment casDetailsFragment) {
            super(1);
            this.f80871d = casDetailsFragment;
        }

        /* renamed from: a */
        public final void mo74872a(C31128a aVar) {
            C41536l.m120488h(aVar, "it");
            C31132b.m92648j(aVar, (int[]) null, new C32994a(this.f80871d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74872a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.CasDetailsFragment$d */
    static final class C32995d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CasDetailsFragment f80872d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32995d(CasDetailsFragment casDetailsFragment) {
            super(1);
            this.f80872d = casDetailsFragment;
        }

        /* renamed from: a */
        public final void mo74874a(List list) {
            C41536l.m120489i(list, "ls");
            this.f80872d.m97304F1("REQUEST_KEY_SELECT_AMOUNT", new ChipGroupSelectorActionSheet.ActionSheetData(list, C32343x.m95388F("cas.details.change.amount.actionsheet.title", new Object[0]), C32343x.m95388F("cas.details.change.amount.actionsheet.message", new Object[0]), C32343x.m95388F("cas.details.change.amount.actionsheet.button", new Object[0])));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74874a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.CasDetailsFragment$e */
    static final class C32996e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CasDetailsFragment f80873d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32996e(CasDetailsFragment casDetailsFragment) {
            super(1);
            this.f80873d = casDetailsFragment;
        }

        /* renamed from: a */
        public final void mo74875a(List list) {
            C41536l.m120489i(list, "it");
            C31414f.f77961P.mo71776a(list, C32343x.m95388F("cas.details.change.accounts.actionsheet.message", new Object[0]), C32343x.m95388F("cas.details.change.accounts.actionsheet.title", new Object[0]), C32343x.m95388F("cas.details.change.accounts.actionsheet.button", new Object[0])).mo4576A1(this.f80873d.getChildFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74875a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.CasDetailsFragment$f */
    static final class C32997f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43075l f80874d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32997f(C43075l lVar) {
            super(1);
            this.f80874d = lVar;
        }

        /* renamed from: a */
        public final void mo74876a(C37223a aVar) {
            Object a = aVar.mo90296a();
            if (a != null) {
                this.f80874d.invoke(a);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74876a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.CasDetailsFragment$g */
    static final class C32998g extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C32998g f80875d = new C32998g();

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.CasDetailsFragment$g$a */
        public static final class C32999a extends C1819o {
            C32999a(C1796h.C1802f fVar) {
                super(fVar);
            }

            /* renamed from: k */
            public void onBindViewHolder(C32992b bVar, int i) {
                C41536l.m120489i(bVar, "holder");
                Object g = mo6027g(i);
                C41536l.m120488h(g, "getItem(position)");
                bVar.mo74871h((CasAccountUiModel) g);
            }

            /* renamed from: l */
            public C32992b onCreateViewHolder(ViewGroup viewGroup, int i) {
                C41536l.m120489i(viewGroup, "parent");
                C39457p d = C39457p.m114684d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d, "inflate(\n               …lse\n                    )");
                return new C32992b(d);
            }
        }

        C32998g() {
            super(0);
        }

        /* renamed from: b */
        public final C32999a invoke() {
            return new C32999a(C17963d.f51158a.mo45633d());
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.CasDetailsFragment$h */
    static final class C33000h implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f80876a;

        C33000h(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f80876a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f80876a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f80876a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.CasDetailsFragment$i */
    public static final class C33001i extends C29606a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33001i(Context context, int i) {
            super(context, i);
            C41536l.m120488h(context, "requireContext()");
        }

        /* renamed from: j */
        public boolean mo39050j(View view, RecyclerView recyclerView) {
            C41536l.m120489i(view, "view");
            C41536l.m120489i(recyclerView, "parent");
            int k0 = recyclerView.mo5355k0(view);
            RecyclerView.C1736h adapter = recyclerView.getAdapter();
            if (k0 == -1 || adapter == null || k0 == adapter.getItemCount() - 1) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.CasDetailsFragment$j */
    public static final class C33002j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f80877d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33002j(Fragment fragment) {
            super(0);
            this.f80877d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f80877d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.CasDetailsFragment$k */
    public static final class C33003k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f80878d;

        /* renamed from: e */
        final /* synthetic */ Fragment f80879e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33003k(C43064a aVar, Fragment fragment) {
            super(0);
            this.f80878d = aVar;
            this.f80879e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f80878d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f80879e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.CasDetailsFragment$l */
    public static final class C33004l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f80880d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33004l(Fragment fragment) {
            super(0);
            this.f80880d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f80880d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: A1 */
    private final C1819o m97299A1() {
        return (C1819o) this.f80869i.getValue();
    }

    /* renamed from: B1 */
    private final C39453l m97300B1() {
        C39453l lVar = this.f80867g;
        C41536l.m120486f(lVar);
        return lVar;
    }

    /* renamed from: C1 */
    private final C37748j m97301C1() {
        return (C37748j) this.f80868h.getValue();
    }

    /* renamed from: D1 */
    private final void m97302D1(LiveData liveData, C43075l lVar) {
        liveData.mo4819k(getViewLifecycleOwner(), new C33000h(new C32997f(lVar)));
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public final void m97303E1(CasDetailsUiModel casDetailsUiModel) {
        m97300B1().f93818t.setText(C32303f.m95200k(casDetailsUiModel.mo75135l(), casDetailsUiModel.mo75133j()));
        TwoLineTextItem twoLineTextItem = m97300B1().f93813o;
        String g = casDetailsUiModel.mo75129g();
        if (g == null) {
            String d = casDetailsUiModel.mo75124d();
            if (d != null) {
                g = C32343x.m95388F(d, new Object[0]);
            } else {
                g = null;
            }
            if (g == null) {
                g = casDetailsUiModel.mo75132i().mo75084b();
            }
        }
        twoLineTextItem.setText(g);
        m97299A1().mo6029i(casDetailsUiModel.mo75122a());
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public final void m97304F1(String str, ChipGroupSelectorActionSheet.ActionSheetData actionSheetData) {
        ChipGroupSelectorActionSheet.f80607J.mo74663a(actionSheetData, str).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* renamed from: G1 */
    private final void m97305G1() {
        C13310d dVar = new C13310d();
        dVar.mo35648c2(C32343x.m95388F("cas.deactivate.actionsheet.title", new Object[0]));
        dVar.mo35647a2(C13310d.C13312b.TITLE_TWO_BUTTON);
        dVar.mo35639Q1(C32343x.m95388F("cas.deactivate.info.text", new Object[0]));
        dVar.mo35646Z1(C32343x.m95388F("cas.deactivate.yes", new Object[0]));
        dVar.mo35642U1(C32343x.m95388F("cas.deactivate.no", new Object[0]));
        dVar.mo35645Y1(new C36198d(dVar, this));
        dVar.mo35641T1(new C36199e(dVar));
        dVar.mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public static final void m97306H1(C13310d dVar, CasDetailsFragment casDetailsFragment, Button button) {
        C41536l.m120489i(dVar, "$this_with");
        C41536l.m120489i(casDetailsFragment, "this$0");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
        casDetailsFragment.m97301C1().mo91005Aw().mo90998Yl();
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public static final void m97307I1(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$this_with");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    /* renamed from: J1 */
    private final C41217g m97308J1() {
        return C41219i.m119470b(C32998g.f80875d);
    }

    /* renamed from: K1 */
    private final void m97309K1() {
        m97300B1().f93817s.setTitle(C32343x.m95388F("cas.details.control.cas", new Object[0]));
        m97300B1().f93818t.setTitle(C32343x.m95388F("cas.details.cas.amount", new Object[0]));
        m97300B1().f93813o.setTitle(C32343x.m95388F("cas.deposit.account.label", new Object[0]));
        m97300B1().f93810l.setTitle(C32343x.m95388F("cas.details.cas.linked.accounts", new Object[0]));
        m97300B1().f93810l.setText(C32343x.m95388F("cas.details.cas.linked.accounts.desc", new Object[0]));
        m97300B1().f93808j.setText(C32343x.m95388F("cas.details.deactivate", new Object[0]));
    }

    /* renamed from: L1 */
    private final void m97310L1() {
        m97309K1();
        for (View view : C41341q.m119910m(m97300B1().f93804f, m97300B1().f93805g, m97300B1().f93806h)) {
            C41536l.m120488h(view, "it");
            C32343x.m95483r1(view, false, false, 2, (Object) null);
        }
        C33001i iVar = new C33001i(requireContext(), C38335b.f91850e);
        m97300B1().f93803e.setLayoutManager(new CasDetailsFragment$setupViews$2(getContext()));
        m97300B1().f93803e.mo5351j(iVar);
        m97300B1().f93803e.setAdapter(m97299A1());
        AppCompatImageView appCompatImageView = m97300B1().f93811m;
        C41536l.m120488h(appCompatImageView, "binding.piggyBankAccountChevron");
        C32343x.m95483r1(appCompatImageView, false, false, 2, (Object) null);
    }

    /* renamed from: r1 */
    private final void m97320r1() {
        getChildFragmentManager().mo4367F1("REQUEST_KEY_SELECT_AMOUNT", getViewLifecycleOwner(), new C36200f(this));
        getChildFragmentManager().mo4367F1("REQUEST_KEY_PIGGY_BANK_ACCOUNTS", getViewLifecycleOwner(), new C36201g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m97321s1(CasDetailsFragment casDetailsFragment, String str, Bundle bundle) {
        C41536l.m120489i(casDetailsFragment, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        casDetailsFragment.m97301C1().mo91005Aw().mo90997W(bundle.getInt("RESULT_KEY_SELECTED_CHIP", -1));
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public static final void m97322t1(CasDetailsFragment casDetailsFragment, String str, Bundle bundle) {
        C41536l.m120489i(casDetailsFragment, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        List parcelableArrayList = bundle.getParcelableArrayList("RESULT_KEY_PIGGY_BANK_SELECTED_ACCOUNTS");
        if (parcelableArrayList == null) {
            parcelableArrayList = C41341q.m119907j();
        }
        casDetailsFragment.m97301C1().mo91005Aw().mo90995I0(parcelableArrayList);
    }

    /* renamed from: u1 */
    private final void m97323u1() {
        m97300B1().f93809k.setOnClickListener(new C36195a(this));
        m97300B1().f93807i.setOnClickListener(new C36196b(this));
        m97300B1().f93819u.setOnClickListener(new C36197c(this));
        m97320r1();
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public static final void m97324v1(CasDetailsFragment casDetailsFragment, View view) {
        C41536l.m120489i(casDetailsFragment, "this$0");
        casDetailsFragment.m97301C1().mo91005Aw().mo90996L2();
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m97325x1(CasDetailsFragment casDetailsFragment, View view) {
        C41536l.m120489i(casDetailsFragment, "this$0");
        casDetailsFragment.m97305G1();
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m97326y1(CasDetailsFragment casDetailsFragment, View view) {
        C41536l.m120489i(casDetailsFragment, "this$0");
        casDetailsFragment.m97301C1().mo91005Aw().mo90999b1();
    }

    /* renamed from: z1 */
    private final void m97327z1() {
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37736d Bw = m97301C1().mo91006Bw();
        Bw.mo91004ze().mo4819k(viewLifecycleOwner, new C33000h(new C32993c(this)));
        m97302D1(Bw.mo91000cu(), new C32995d(this));
        m97302D1(Bw.mo91003p4(), new C32996e(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f80867g = C39453l.m114668d(layoutInflater, viewGroup, false);
        m97310L1();
        m97327z1();
        m97323u1();
        NestedScrollView c = m97300B1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f80867g = null;
    }
}

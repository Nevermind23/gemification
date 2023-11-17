package p341ge.bog.mobilebank.transportcard.presentation.transportcardsuccess;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.activity.C0152h;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import c71.C31282b;
import c71.C31283c;
import c71.C31284d;
import c71.C31287g;
import g71.C32117j;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import j71.C36754g;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.header.statementheader.StatementHeaderView;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p341ge.bog.mobilebank.p975ui.activities.MainActivity;
import p341ge.bog.mobilebank.transportcard.presentation.TransportCardActivity;
import ue1.C43064a;
import ue1.C43075l;
import x71.C39826c;

/* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardsuccess.SuccessTransportCardFragment */
public final class SuccessTransportCardFragment extends C35157a {

    /* renamed from: i */
    public static final C35143a f84706i = new C35143a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C32117j f84707g;

    /* renamed from: h */
    private final C41217g f84708h;

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardsuccess.SuccessTransportCardFragment$a */
    public static final class C35143a {
        private C35143a() {
        }

        public /* synthetic */ C35143a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardsuccess.SuccessTransportCardFragment$b */
    static final class C35144b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SuccessTransportCardFragment f84709d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35144b(SuccessTransportCardFragment successTransportCardFragment) {
            super(1);
            this.f84709d = successTransportCardFragment;
        }

        /* JADX WARNING: type inference failed for: r4v3, types: [ge.bog.designsystem.components.pagestate.PageStateType] */
        /* JADX WARNING: type inference failed for: r14v1, types: [ge.bog.designsystem.components.pagestate.PageStateType$Warning] */
        /* JADX WARNING: type inference failed for: r7v5, types: [ge.bog.designsystem.components.pagestate.PageStateType$Success] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo86041a(j71.C36754g r22) {
            /*
                r21 = this;
                r0 = r21
                ge.bog.mobilebank.transportcard.presentation.transportcardsuccess.SuccessTransportCardFragment r1 = r0.f84709d
                g71.j r1 = r1.m103248l1()
                ge.bog.mobilebank.transportcard.presentation.transportcardsuccess.SuccessTransportCardFragment r2 = r0.f84709d
                ge.bog.designsystem.components.header.statementheader.StatementHeaderView r3 = r1.f79018i
                ge.bog.designsystem.components.pagestate.PageState r3 = r3.getStatementHeaderPageState()
                java.lang.String r4 = r22.mo89630h()
                r5 = 0
                java.lang.Object[] r6 = new java.lang.Object[r5]
                java.lang.String r4 = g91.C32343x.m95388F(r4, r6)
                r3.setTitleText(r4)
                ge.bog.designsystem.components.header.statementheader.StatementHeaderView r3 = r1.f79018i
                ge.bog.designsystem.components.pagestate.PageState r3 = r3.getStatementHeaderPageState()
                j71.i r4 = r22.mo89629g()
                j71.i r6 = j71.C36756i.A
                if (r4 != r6) goto L_0x003a
                ge.bog.designsystem.components.pagestate.PageStateType$Success r4 = new ge.bog.designsystem.components.pagestate.PageStateType$Success
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 15
                r13 = 0
                r7 = r4
                r7.<init>(r8, r9, r10, r11, r12, r13)
                goto L_0x004b
            L_0x003a:
                ge.bog.designsystem.components.pagestate.PageStateType$Warning r4 = new ge.bog.designsystem.components.pagestate.PageStateType$Warning
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 15
                r20 = 0
                r14 = r4
                r14.<init>(r15, r16, r17, r18, r19, r20)
            L_0x004b:
                r3.setPageStateType(r4)
                ge.bog.designsystem.components.list.TwoLineTextItem r3 = r1.f79017h
                java.lang.String r4 = r22.mo89625d()
                java.lang.Object[] r6 = new java.lang.Object[r5]
                java.lang.String r4 = g91.C32343x.m95388F(r4, r6)
                r3.setText(r4)
                ge.bog.designsystem.components.list.TwoLineTextItem r3 = r1.f79021l
                int r4 = r22.mo89626e()
                double r6 = (double) r4
                java.lang.String r8 = "GEL"
                r9 = 0
                r10 = 2
                r11 = 0
                java.lang.String r4 = g91.C32343x.m95410Q(r6, r8, r9, r10, r11)
                r3.setText(r4)
                boolean r3 = r22.mo89632i()
                if (r3 == 0) goto L_0x008b
                ge.bog.designsystem.components.list.TwoLineTextItem r3 = r1.f79020k
                int r4 = c71.C31287g.tc_plastic_card
                java.lang.String r4 = r2.getString(r4)
                r3.setText(r4)
                android.widget.TextView r3 = r1.f79019j
                java.lang.String r4 = r22.mo89622a()
                r3.setText(r4)
                goto L_0x00ae
            L_0x008b:
                ge.bog.designsystem.components.list.TwoLineTextItem r3 = r1.f79020k
                java.lang.String r4 = r22.mo89622a()
                r3.setText(r4)
                android.widget.TextView r3 = r1.f79019j
                java.lang.String r4 = r22.mo89624c()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "****"
                r6.append(r7)
                r6.append(r4)
                java.lang.String r4 = r6.toString()
                r3.setText(r4)
            L_0x00ae:
                ge.bog.designsystem.components.list.TwoLineTextItem r3 = r1.f79014e
                kotlin.jvm.internal.c0 r4 = kotlin.jvm.internal.C41524c0.f97701a
                android.content.Context r4 = r2.requireContext()
                int r6 = c71.C31287g.tc_active_pass_start_date_formatted
                java.lang.String r4 = r4.getString(r6)
                java.lang.String r6 = "requireContext().getStri…ass_start_date_formatted)"
                kotlin.jvm.internal.C41536l.m120488h(r4, r6)
                r6 = 1
                java.lang.Object[] r7 = new java.lang.Object[r6]
                java.text.SimpleDateFormat r8 = new java.text.SimpleDateFormat
                java.lang.String r9 = "dd.MM.yyyy hh:mm"
                r8.<init>(r9)
                long r10 = r22.mo89628f()
                java.lang.Long r10 = java.lang.Long.valueOf(r10)
                java.lang.String r8 = r8.format(r10)
                r7[r5] = r8
                java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r6)
                java.lang.String r4 = java.lang.String.format(r4, r7)
                java.lang.String r7 = "format(format, *args)"
                kotlin.jvm.internal.C41536l.m120488h(r4, r7)
                r3.setText(r4)
                android.content.Context r2 = r2.requireContext()
                int r3 = c71.C31287g.tc_active_pass_end_date_formatted
                java.lang.String r2 = r2.getString(r3)
                java.lang.String r3 = "requireContext().getStri…_pass_end_date_formatted)"
                kotlin.jvm.internal.C41536l.m120488h(r2, r3)
                ge.bog.designsystem.components.list.TwoLineTextItem r1 = r1.f79016g
                int r3 = r2.length()
                if (r3 <= 0) goto L_0x0102
                r3 = r6
                goto L_0x0103
            L_0x0102:
                r3 = r5
            L_0x0103:
                if (r3 == 0) goto L_0x0138
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r2.charAt(r5)
                char r4 = r2.charAt(r5)
                java.lang.String r4 = java.lang.String.valueOf(r4)
                java.lang.String r8 = "null cannot be cast to non-null type java.lang.String"
                kotlin.jvm.internal.C41536l.m120487g(r4, r8)
                java.util.Locale r8 = java.util.Locale.ROOT
                java.lang.String r4 = r4.toUpperCase(r8)
                java.lang.String r8 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
                kotlin.jvm.internal.C41536l.m120488h(r4, r8)
                r3.append(r4)
                java.lang.String r2 = r2.substring(r6)
                java.lang.String r4 = "this as java.lang.String).substring(startIndex)"
                kotlin.jvm.internal.C41536l.m120488h(r2, r4)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
            L_0x0138:
                java.lang.Object[] r3 = new java.lang.Object[r6]
                java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
                r4.<init>(r9)
                long r8 = r22.mo89623b()
                java.lang.Long r8 = java.lang.Long.valueOf(r8)
                java.lang.String r4 = r4.format(r8)
                r3[r5] = r4
                java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r6)
                java.lang.String r2 = java.lang.String.format(r2, r3)
                kotlin.jvm.internal.C41536l.m120488h(r2, r7)
                r1.setText(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.transportcard.presentation.transportcardsuccess.SuccessTransportCardFragment.C35144b.mo86041a(j71.g):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86041a((C36754g) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardsuccess.SuccessTransportCardFragment$c */
    static final class C35145c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SuccessTransportCardFragment f84710d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35145c(SuccessTransportCardFragment successTransportCardFragment) {
            super(0);
            this.f84710d = successTransportCardFragment;
        }

        public final void invoke() {
            this.f84710d.m103249m1().mo86048Tn();
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardsuccess.SuccessTransportCardFragment$d */
    static final class C35146d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SuccessTransportCardFragment f84711d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35146d(SuccessTransportCardFragment successTransportCardFragment) {
            super(0);
            this.f84711d = successTransportCardFragment;
        }

        public final void invoke() {
            this.f84711d.m103249m1().mo86054iw();
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardsuccess.SuccessTransportCardFragment$e */
    static final class C35147e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f84712a;

        C35147e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f84712a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f84712a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f84712a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardsuccess.SuccessTransportCardFragment$f */
    static final class C35148f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SuccessTransportCardFragment f84713d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35148f(SuccessTransportCardFragment successTransportCardFragment) {
            super(1);
            this.f84713d = successTransportCardFragment;
        }

        /* renamed from: a */
        public final void mo86044a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f84713d.m103251o1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86044a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardsuccess.SuccessTransportCardFragment$g */
    static final class C35149g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SuccessTransportCardFragment f84714d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35149g(SuccessTransportCardFragment successTransportCardFragment) {
            super(1);
            this.f84714d = successTransportCardFragment;
        }

        /* renamed from: a */
        public final void mo86045a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C8034d.m30522a(this.f84714d).mo22117L(C31284d.action_successTransportCardFragment_to_TransportCardInfoFragment);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86045a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardsuccess.SuccessTransportCardFragment$h */
    public static final class C35150h extends C0152h {

        /* renamed from: d */
        final /* synthetic */ SuccessTransportCardFragment f84715d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35150h(SuccessTransportCardFragment successTransportCardFragment) {
            super(true);
            this.f84715d = successTransportCardFragment;
        }

        /* renamed from: b */
        public void mo361b() {
            this.f84715d.m103249m1().mo86048Tn();
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardsuccess.SuccessTransportCardFragment$i */
    public static final class C35151i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f84716d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35151i(Fragment fragment) {
            super(0);
            this.f84716d = fragment;
        }

        public final Fragment invoke() {
            return this.f84716d;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardsuccess.SuccessTransportCardFragment$j */
    public static final class C35152j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f84717d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35152j(C43064a aVar) {
            super(0);
            this.f84717d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f84717d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardsuccess.SuccessTransportCardFragment$k */
    public static final class C35153k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f84718d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35153k(C41217g gVar) {
            super(0);
            this.f84718d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f84718d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardsuccess.SuccessTransportCardFragment$l */
    public static final class C35154l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f84719d;

        /* renamed from: e */
        final /* synthetic */ C41217g f84720e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35154l(C43064a aVar, C41217g gVar) {
            super(0);
            this.f84719d = aVar;
            this.f84720e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f84719d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f84720e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardsuccess.SuccessTransportCardFragment$m */
    public static final class C35155m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f84721d;

        /* renamed from: e */
        final /* synthetic */ C41217g f84722e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35155m(Fragment fragment, C41217g gVar) {
            super(0);
            this.f84721d = fragment;
            this.f84722e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f84722e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f84721d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public SuccessTransportCardFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C35152j(new C35151i(this)));
        this.f84708h = C1514j0.m5374c(this, C41520a0.m120436b(SuccessTransportCardViewModel$ViewModel.class), new C35153k(a), new C35154l((C43064a) null, a), new C35155m(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public final C32117j m103248l1() {
        C32117j jVar = this.f84707g;
        C41536l.m120486f(jVar);
        return jVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public final SuccessTransportCardViewModel$ViewModel m103249m1() {
        return (SuccessTransportCardViewModel$ViewModel) this.f84708h.getValue();
    }

    /* renamed from: n1 */
    private final void m103250n1() {
        m103249m1().mo86051fw().mo86046Rs().mo4819k(getViewLifecycleOwner(), new C35147e(new C35144b(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public final void m103251o1() {
        Intent flags = new Intent(requireContext(), MainActivity.class).setFlags(872415232);
        C41536l.m120488h(flags, "Intent(requireContext(),…_SINGLE_TOP\n            )");
        startActivity(flags);
        requireActivity().finish();
    }

    /* renamed from: p1 */
    private final void m103252p1() {
        C39826c fw = m103249m1().mo86051fw();
        LiveData dc = fw.mo86049dc();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(dc, viewLifecycleOwner, new C35148f(this));
        LiveData T8 = fw.mo86047T8();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(T8, viewLifecycleOwner2, new C35149g(this));
    }

    /* renamed from: q1 */
    private final void m103253q1() {
        requireActivity().getOnBackPressedDispatcher().mo342c(getViewLifecycleOwner(), new C35150h(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C1505h requireActivity = requireActivity();
        C41536l.m120487g(requireActivity, "null cannot be cast to non-null type ge.bog.mobilebank.transportcard.presentation.TransportCardActivity");
        TransportCardActivity transportCardActivity = (TransportCardActivity) requireActivity;
        ToolbarView toolbarView = transportCardActivity.f85671t;
        if (toolbarView != null) {
            toolbarView.setNavigationEnabled(false);
        }
        transportCardActivity.mo85812I2(C31282b.f77692b);
        this.f84707g = C32117j.m94602d(layoutInflater, viewGroup, false);
        ScrollView c = m103248l1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        C1505h requireActivity = requireActivity();
        C41536l.m120487g(requireActivity, "null cannot be cast to non-null type ge.bog.mobilebank.transportcard.presentation.TransportCardActivity");
        ((TransportCardActivity) requireActivity).mo85812I2(C31282b.f77691a);
        this.f84707g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m103250n1();
        m103253q1();
        m103252p1();
        StatementHeaderView statementHeaderView = m103248l1().f79018i;
        statementHeaderView.setStatementHeaderPageStateVisibility(true);
        C41536l.m120488h(statementHeaderView, "onViewCreated$lambda$1");
        int i = C31283c.f77694f;
        String string = getString(C31287g.tc_back_to_home_page);
        C41536l.m120488h(string, "getString(R.string.tc_back_to_home_page)");
        StatementHeaderView.m50190c(statementHeaderView, i, string, (Integer) null, new C35145c(this), 4, (Object) null);
        statementHeaderView.mo35784d(getString(C31287g.tc_see_travel_card), new C35146d(this));
    }
}

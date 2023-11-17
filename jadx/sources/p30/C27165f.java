package p30;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import g91.C32297d;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import iu0.C36546y;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.MoneyRequestBottomSheetViewModel;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p366bk.C10328q;
import p90.C27455w3;
import r30.C27896c;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: p30.f */
public final class C27165f extends C27160a {

    /* renamed from: N */
    public static final C27166a f68169N = new C27166a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C27455w3 f68170K;

    /* renamed from: L */
    private final C41217g f68171L;

    /* renamed from: M */
    private final C41217g f68172M = C41219i.m119470b(new C27176k(this));

    /* renamed from: p30.f$a */
    public static final class C27166a {
        private C27166a() {
        }

        public /* synthetic */ C27166a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C27165f m84164b(C27166a aVar, long j, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return aVar.mo66469a(j, z);
        }

        /* renamed from: a */
        public final C27165f mo66469a(long j, boolean z) {
            C27165f fVar = new C27165f();
            Bundle bundle = new Bundle();
            bundle.putLong("REQUEST_ID_PARAM", j);
            bundle.putBoolean("STARTED_FROM_PUSH_PARAM", z);
            fVar.setArguments(bundle);
            return fVar;
        }
    }

    /* renamed from: p30.f$b */
    static final class C27167b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27165f f68173d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27167b(C27165f fVar) {
            super(1);
            this.f68173d = fVar;
        }

        /* renamed from: a */
        public final void mo66470a(C27896c cVar) {
            boolean z;
            ((C2394j) ((C2394j) ((C2394j) C2379b.m9212v(this.f68173d).mo7757y(cVar.mo67456f()).mo7232j(cVar.mo67452c())).mo7220c0(cVar.mo67452c())).mo7222d()).mo7718L0(this.f68173d.m84156k2().f70163f);
            this.f68173d.m84156k2().f70167j.setText(cVar.mo67453d());
            TextView textView = this.f68173d.m84156k2().f70165h;
            C41536l.m120488h(textView, "binding.requestNicknameText");
            String e = cVar.mo67454e();
            if (e == null || e.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(textView, !z, false, 2, (Object) null);
            this.f68173d.m84156k2().f70165h.setText(cVar.mo67454e());
            this.f68173d.m84156k2().f70166i.setText(C32343x.m95410Q(cVar.mo67450a(), "₾", false, 2, (Object) null));
            this.f68173d.m84156k2().f70164g.setText(cVar.mo67451b());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66470a((C27896c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p30.f$c */
    static final class C27168c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27165f f68174d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27168c(C27165f fVar) {
            super(1);
            this.f68174d = fVar;
        }

        /* renamed from: a */
        public final void mo66471a(C37223a aVar) {
            MoneyRequestBottomSheetViewModel.C22021a aVar2;
            if (aVar != null && (aVar2 = (MoneyRequestBottomSheetViewModel.C22021a) aVar.mo90296a()) != null) {
                C27165f fVar = this.f68174d;
                C36546y.m108282F().mo27152s("money_request", aVar2.mo54724e().name(), "money_request_receiver_send_click");
                Intent build = TransferForm.startWith((Fragment) fVar, "TRANSFER", TransferForm.OPERATION_VIEW).setMoneyRequestId(aVar2.mo54723d()).setTransferForm(aVar2.mo54726f()).setAmount(aVar2.mo54721b()).setNomination(aVar2.mo54722c()).setDestinationAcctNo(aVar2.mo54720a()).setOpenWizard(true).build();
                if (fVar.m84157l2()) {
                    build.putExtra("action_value", 2);
                } else {
                    build.putExtra("action_value", 1);
                }
                build.putExtra("event_label_2", aVar2.mo54724e().name());
                fVar.startActivity(build);
                fVar.mo4577k1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66471a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p30.f$d */
    static final class C27169d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27165f f68175d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27169d(C27165f fVar) {
            super(1);
            this.f68175d = fVar;
        }

        /* renamed from: a */
        public final void mo66472a(C37223a aVar) {
            C21503d dVar;
            C35388f2 f2Var;
            if (aVar != null && (dVar = (C21503d) aVar.mo90296a()) != null) {
                C27165f fVar = this.f68175d;
                if (dVar instanceof C21503d.C21506c) {
                    C32297d.m95160h(fVar.requireActivity(), fVar.getString(C10328q.f28956f2));
                    fVar.mo4577k1();
                } else if (dVar instanceof C21503d.C21504a) {
                    C1505h requireActivity = fVar.requireActivity();
                    if (requireActivity instanceof C35388f2) {
                        f2Var = (C35388f2) requireActivity;
                    } else {
                        f2Var = null;
                    }
                    if (f2Var != null) {
                        f2Var.mo52674G1((C21503d.C21504a) dVar);
                    }
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66472a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p30.f$e */
    static final class C27170e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f68176a;

        C27170e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f68176a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f68176a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f68176a.invoke(obj);
        }
    }

    /* renamed from: p30.f$f */
    public static final class C27171f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f68177d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27171f(Fragment fragment) {
            super(0);
            this.f68177d = fragment;
        }

        public final Fragment invoke() {
            return this.f68177d;
        }
    }

    /* renamed from: p30.f$g */
    public static final class C27172g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f68178d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27172g(C43064a aVar) {
            super(0);
            this.f68178d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f68178d.invoke();
        }
    }

    /* renamed from: p30.f$h */
    public static final class C27173h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f68179d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27173h(C41217g gVar) {
            super(0);
            this.f68179d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f68179d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: p30.f$i */
    public static final class C27174i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f68180d;

        /* renamed from: e */
        final /* synthetic */ C41217g f68181e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27174i(C43064a aVar, C41217g gVar) {
            super(0);
            this.f68180d = aVar;
            this.f68181e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f68180d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f68181e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: p30.f$j */
    public static final class C27175j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f68182d;

        /* renamed from: e */
        final /* synthetic */ C41217g f68183e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27175j(Fragment fragment, C41217g gVar) {
            super(0);
            this.f68182d = fragment;
            this.f68183e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f68183e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f68182d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    /* renamed from: p30.f$k */
    static final class C27176k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C27165f f68184d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27176k(C27165f fVar) {
            super(0);
            this.f68184d = fVar;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            Bundle arguments = this.f68184d.getArguments();
            boolean z = false;
            if (arguments != null) {
                z = arguments.getBoolean("STARTED_FROM_PUSH_PARAM", false);
            }
            return Boolean.valueOf(z);
        }
    }

    public C27165f() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C27172g(new C27171f(this)));
        this.f68171L = C1514j0.m5374c(this, C41520a0.m120436b(MoneyRequestBottomSheetViewModel.class), new C27173h(a), new C27174i((C43064a) null, a), new C27175j(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public final C27455w3 m84156k2() {
        C27455w3 w3Var = this.f68170K;
        C41536l.m120486f(w3Var);
        return w3Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public final boolean m84157l2() {
        return ((Boolean) this.f68172M.getValue()).booleanValue();
    }

    /* renamed from: m2 */
    private final MoneyRequestBottomSheetViewModel m84158m2() {
        return (MoneyRequestBottomSheetViewModel) this.f68171L.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public static final void m84159n2(C27165f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        fVar.m84158m2().mo54718sw();
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m84160o2(C27165f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        Context requireContext = fVar.requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C13310d dVar = new C13310d();
        dVar.mo35648c2(requireContext.getString(C10328q.money_request_bottom_sheet_dialog_title_decline_request));
        dVar.mo35647a2(C13310d.C13312b.TITLE_TWO_BUTTON);
        dVar.mo35639Q1(requireContext.getString(C10328q.money_request_bottom_sheet_msg_info_decline_request));
        dVar.mo35646Z1(requireContext.getString(C10328q.f28966r2));
        dVar.mo35645Y1(new C27163d(fVar, dVar));
        dVar.mo35642U1(requireContext.getString(C10328q.f28951b2));
        dVar.mo35641T1(new C27164e(dVar));
        dVar.mo4576A1(fVar.getChildFragmentManager(), "DECLINE_MONEY_REQUEST_DIALOG");
    }

    private final void observeData() {
        m84158m2().mo54716ow().mo4819k(getViewLifecycleOwner(), new C27170e(new C27167b(this)));
        m84158m2().mo54715nw().mo4819k(getViewLifecycleOwner(), new C27170e(new C27168c(this)));
        m84158m2().mo54714mw().mo4819k(getViewLifecycleOwner(), new C27170e(new C27169d(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public static final void m84161p2(C27165f fVar, C13310d dVar, Button button) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120489i(dVar, "$this_apply");
        C41536l.m120489i(button, "it");
        fVar.m84158m2().mo54713jw();
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public static final void m84162q2(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$this_apply");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f68170K = C27455w3.m85128d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f68170K = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26370a2(C32343x.m95388F("page.money.request.title", new Object[0]));
        MoneyRequestBottomSheetViewModel m2 = m84158m2();
        Bundle arguments = getArguments();
        long j = -1;
        if (arguments != null) {
            j = arguments.getLong("REQUEST_ID_PARAM", -1);
        }
        m2.mo54719tw(j);
        m84156k2().f70170m.setOnClickListener(new C27161b(this));
        m84156k2().f70162e.setOnClickListener(new C27162c(this));
        observeData();
    }
}

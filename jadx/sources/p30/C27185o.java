package p30;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C1483c;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32297d;
import g91.C32303f;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import n30.C26361a;
import n30.C26365e;
import o30.C26720h;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21507e;
import p341ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.contacts.edit.activity.EditContactActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.MoneyRequestDetailsActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.PaymentsFragmentViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity.ContactsActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesAndProvidersActivity;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.activities.CarTemplateGroupActivity;
import p341ge.bog.mobilebank.p975ui.activities.HouseTemplateGroupActivity;
import p341ge.bog.mobilebank.p975ui.activities.PaymentsTemplateListActivity;
import p341ge.bog.mobilebank.p975ui.activities.ProviderListActivity;
import p341ge.bog.mobilebank.p975ui.components.BogSwipeRefreshLayout;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p341ge.bog.mobilebank.payment.activities.PaymentFormActivity;
import p341ge.bog.mobilebank.payment.activities.TemplateFormActivity;
import p341ge.bog.mobilebank.payment.model.C33624a;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.shared.OtherTransferTypeState;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p891su.C28269e;
import q31.C38122f;
import q31.C38125h;
import r30.C27895b;
import r30.C27899f;
import r30.C27909i;
import ue1.C43064a;
import ue1.C43075l;
import x50.C29649b;

/* renamed from: p30.o */
public final class C27185o extends C35651n1 implements C21507e, C29649b.C29651b {

    /* renamed from: i */
    public static final C27186a f68193i = new C27186a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C41217g f68194d = C41219i.m119470b(new C27205j0(this));

    /* renamed from: e */
    private final C41217g f68195e = C41219i.m119470b(new C27221r0(this));

    /* renamed from: f */
    private final C41217g f68196f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C26365e f68197g;

    /* renamed from: h */
    private final C41217g f68198h;

    /* renamed from: p30.o$a */
    public static final class C27186a {
        private C27186a() {
        }

        public /* synthetic */ C27186a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ C27185o m84224c(C27186a aVar, boolean z, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return aVar.mo66480b(z, j);
        }

        /* renamed from: a */
        public final C27185o mo66479a(boolean z) {
            return m84224c(this, z, 0, 2, (Object) null);
        }

        /* renamed from: b */
        public final C27185o mo66480b(boolean z, long j) {
            C27185o oVar = new C27185o();
            oVar.setViewPagerFragment(z);
            Bundle bundle = new Bundle();
            bundle.putLong("SOURCE_ACCOUNT_KEY_PARAM", j);
            oVar.setArguments(bundle);
            return oVar;
        }
    }

    /* renamed from: p30.o$a0 */
    static final class C27187a0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27185o f68199d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27187a0(C27185o oVar) {
            super(1);
            this.f68199d = oVar;
        }

        /* renamed from: a */
        public final void mo66481a(C27909i iVar) {
            C26365e r1 = this.f68199d.f68197g;
            if (r1 == null) {
                C41536l.m120506z("adapter");
                r1 = null;
            }
            C41536l.m120488h(iVar, "it");
            r1.mo65575z(iVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66481a((C27909i) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p30.o$b */
    static final class C27188b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27185o f68200d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27188b(C27185o oVar) {
            super(1);
            this.f68200d = oVar;
        }

        /* renamed from: a */
        public final void mo66482a(C27895b bVar) {
            C41536l.m120489i(bVar, "contact");
            C36546y.m108282F().mo27152s("contacts", "", "contact_click");
            ContactDetailsActivity.C21547a aVar = ContactDetailsActivity.f57629O;
            Context requireContext = this.f68200d.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            aVar.mo53869b(requireContext, bVar.mo67439g(), this.f68200d.m84182H1());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66482a((C27895b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p30.o$b0 */
    static final class C27189b0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27185o f68201d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27189b0(C27185o oVar) {
            super(1);
            this.f68201d = oVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            if (this.f68201d.m84183I1().mo6147i()) {
                BogSwipeRefreshLayout t1 = this.f68201d.m84183I1();
                C41536l.m120488h(bool, "isRefreshing");
                t1.setRefreshing(bool.booleanValue());
            }
        }
    }

    /* renamed from: p30.o$c */
    static final class C27190c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27185o f68202d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27190c(C27185o oVar) {
            super(1);
            this.f68202d = oVar;
        }

        /* renamed from: a */
        public final void mo66484a(C27895b bVar) {
            C41536l.m120489i(bVar, "contact");
            EditContactActivity.C21608a aVar = EditContactActivity.f57737J;
            Context requireContext = this.f68202d.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            aVar.mo53954a(requireContext, bVar.mo67439g());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66484a((C27895b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p30.o$c0 */
    static final class C27191c0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27185o f68203d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27191c0(C27185o oVar) {
            super(1);
            this.f68203d = oVar;
        }

        /* renamed from: a */
        public final void mo66485a(List list) {
            C26365e eVar = null;
            if (list.isEmpty()) {
                C26365e r1 = this.f68203d.f68197g;
                if (r1 == null) {
                    C41536l.m120506z("adapter");
                } else {
                    eVar = r1;
                }
                eVar.mo65574y();
                return;
            }
            C26365e r12 = this.f68203d.f68197g;
            if (r12 == null) {
                C41536l.m120506z("adapter");
            } else {
                eVar = r12;
            }
            C41536l.m120488h(list, "it");
            eVar.mo65569t(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66485a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p30.o$d */
    static final class C27192d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27185o f68204d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27192d(C27185o oVar) {
            super(1);
            this.f68204d = oVar;
        }

        /* renamed from: a */
        public final void mo66486a(C27895b bVar) {
            C41536l.m120489i(bVar, "contact");
            this.f68204d.m84176B1(bVar.mo67439g());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66486a((C27895b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p30.o$d0 */
    static final class C27193d0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27185o f68205d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27193d0(C27185o oVar) {
            super(1);
            this.f68205d = oVar;
        }

        /* renamed from: a */
        public final void mo66487a(C37223a aVar) {
            Long l = (Long) aVar.mo90296a();
            if (l != null) {
                this.f68205d.m84199Z1(l.longValue());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66487a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p30.o$e */
    static final class C27194e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27185o f68206d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27194e(C27185o oVar) {
            super(1);
            this.f68206d = oVar;
        }

        /* renamed from: a */
        public final void mo66488a(C27895b bVar) {
            String str;
            C41536l.m120489i(bVar, "it");
            C36546y.m108282F().mo27152s("contacts", "", "contact_transfer_click");
            TransferForm.C34932I contactId = TransferForm.startWith((Fragment) this.f68206d, "TRANSFER", TransferForm.OPERATION_VIEW).setContactId(bVar.mo67439g());
            if (bVar.mo67438f() == C28269e.BUDGET) {
                str = TransferForm.TRANSFER_FORM_BUDGET;
            } else {
                str = TransferForm.TRANSFER_FORM_OTHER;
            }
            contactId.setTransferForm(str).setSrcAcctKey(this.f68206d.m84182H1()).start();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66488a((C27895b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p30.o$e0 */
    static final class C27195e0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27185o f68207d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27195e0(C27185o oVar) {
            super(1);
            this.f68207d = oVar;
        }

        /* renamed from: a */
        public final void mo66489a(C37223a aVar) {
            String str = (String) aVar.mo90296a();
            if (str != null) {
                C33624a.m98714b(this.f68207d).mo79806f(PaymentFormActivity.class).mo79819s(str).mo79825y();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66489a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p30.o$f */
    static final class C27196f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27185o f68208d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27196f(C27185o oVar) {
            super(1);
            this.f68208d = oVar;
        }

        /* renamed from: a */
        public final void mo66490a(C27899f fVar) {
            C41536l.m120489i(fVar, "it");
            if (fVar.mo67472p()) {
                C36546y.m108282F().mo27152s("money_request", fVar.mo67471o().name(), "mrs_open_request_details");
                MoneyRequestDetailsActivity.C21829a aVar = MoneyRequestDetailsActivity.f58221M;
                Context requireContext = this.f68208d.requireContext();
                C41536l.m120488h(requireContext, "requireContext()");
                aVar.mo54420a(requireContext, fVar.mo67467k());
                return;
            }
            C36546y.m108282F().mo27152s("money_request", fVar.mo67471o().name(), "money_request_receiver_operation_module_click");
            C27185o.m84198Y1(this.f68208d, fVar.mo67467k(), false, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66490a((C27899f) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p30.o$f0 */
    static final class C27197f0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27185o f68209d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27197f0(C27185o oVar) {
            super(1);
            this.f68209d = oVar;
        }

        /* renamed from: a */
        public final void mo66491a(C37223a aVar) {
            Long l = (Long) aVar.mo90296a();
            if (l != null) {
                C27185o oVar = this.f68209d;
                C33624a.m98714b(oVar).mo79806f(TemplateFormActivity.class).mo79821u(l.longValue()).mo79825y();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66491a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p30.o$g */
    static final class C27198g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C27185o f68210d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27198g(C27185o oVar) {
            super(0);
            this.f68210d = oVar;
        }

        public final void invoke() {
            ContactsActivity.C22407a aVar = ContactsActivity.f59333O;
            Context requireContext = this.f68210d.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            ContactsActivity.C22407a.m72695b(aVar, requireContext, false, 2, (Object) null);
            C36546y.m108282F().mo27152s("contacts", "", "contact_show_all_click");
        }
    }

    /* renamed from: p30.o$g0 */
    static final class C27199g0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27185o f68211d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27199g0(C27185o oVar) {
            super(1);
            this.f68211d = oVar;
        }

        /* renamed from: a */
        public final void mo66492a(C37223a aVar) {
            C1505h requireActivity = this.f68211d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            C38122f c = C38125h.m112238c(requireActivity);
            Context requireContext = this.f68211d.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            C38122f.C38123a.m112203D(c, requireContext, (String) null, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66492a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p30.o$h */
    /* synthetic */ class C27200h extends C41535k implements C43064a {
        C27200h(Object obj) {
            super(0, obj, C27185o.class, "showCreateTemplateDialog", "showCreateTemplateDialog()V", 0);
        }

        /* renamed from: b */
        public final void mo66493b() {
            ((C27185o) this.receiver).m84195U1();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo66493b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: p30.o$h0 */
    static final class C27201h0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27185o f68212d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27201h0(C27185o oVar) {
            super(1);
            this.f68212d = oVar;
        }

        /* renamed from: a */
        public final void mo66494a(C37223a aVar) {
            Long l = (Long) aVar.mo90296a();
            if (l != null) {
                this.f68212d.m84200b2(30, l.longValue());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66494a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p30.o$i */
    static final class C27202i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27185o f68213d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27202i(C27185o oVar) {
            super(1);
            this.f68213d = oVar;
        }

        /* renamed from: a */
        public final void mo66495a(C26720h hVar) {
            C41536l.m120489i(hVar, "it");
            if (C41536l.m120484d(hVar.mo65922a(), "TOTAL_DEBT_ITEM_ID")) {
                C27185o.m84201c2(this.f68213d, 40, 0, 2, (Object) null);
            } else {
                this.f68213d.m84184J1().mo54749dx(hVar.mo65922a());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66495a((C26720h) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p30.o$i0 */
    static final class C27203i0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27185o f68214d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27203i0(C27185o oVar) {
            super(1);
            this.f68214d = oVar;
        }

        /* renamed from: a */
        public final void mo66496a(C37223a aVar) {
            Long l = (Long) aVar.mo90296a();
            if (l != null) {
                this.f68214d.m84200b2(20, l.longValue());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66496a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p30.o$j */
    static final class C27204j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27185o f68215d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27204j(C27185o oVar) {
            super(1);
            this.f68215d = oVar;
        }

        /* renamed from: a */
        public final void mo66497a(C26720h hVar) {
            C41536l.m120489i(hVar, "it");
            this.f68215d.m84184J1().mo54748cx(hVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66497a((C26720h) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p30.o$j0 */
    static final class C27205j0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C27185o f68216d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27205j0(C27185o oVar) {
            super(0);
            this.f68216d = oVar;
        }

        /* renamed from: b */
        public final RecyclerView invoke() {
            return (RecyclerView) this.f68216d.findView(C10322k.payments_recycler);
        }
    }

    /* renamed from: p30.o$k */
    static final class C27206k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C27185o f68217d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27206k(C27185o oVar) {
            super(0);
            this.f68217d = oVar;
        }

        public final void invoke() {
            C27185o.m84201c2(this.f68217d, 10, 0, 2, (Object) null);
        }
    }

    /* renamed from: p30.o$k0 */
    static final class C27207k0 implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f68218a;

        C27207k0(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f68218a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f68218a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f68218a.invoke(obj);
        }
    }

    /* renamed from: p30.o$l */
    static final class C27208l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C27185o f68219d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27208l(C27185o oVar) {
            super(0);
            this.f68219d = oVar;
        }

        public final void invoke() {
            C27185o.m84194T1(this.f68219d, "PROVIDER_LIST_IS_SHOW_ALL_LIST", (String) null, (String) null, 6, (Object) null);
        }
    }

    /* renamed from: p30.o$l0 */
    static final class C27209l0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C27185o f68220d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27209l0(C27185o oVar) {
            super(0);
            this.f68220d = oVar;
        }

        /* renamed from: b */
        public final Long invoke() {
            Bundle arguments = this.f68220d.getArguments();
            long j = -1;
            if (arguments != null) {
                j = arguments.getLong("SOURCE_ACCOUNT_KEY_PARAM", -1);
            }
            return Long.valueOf(j);
        }
    }

    /* renamed from: p30.o$m */
    static final class C27210m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C27185o f68221d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27210m(C27185o oVar) {
            super(0);
            this.f68221d = oVar;
        }

        public final void invoke() {
            C36546y.m108282F().mo27152s("transfers", "", "click_login_button");
            C32303f.m95188H(this.f68221d.requireActivity());
        }
    }

    /* renamed from: p30.o$m0 */
    public static final class C27211m0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f68222d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27211m0(Fragment fragment) {
            super(0);
            this.f68222d = fragment;
        }

        public final Fragment invoke() {
            return this.f68222d;
        }
    }

    /* renamed from: p30.o$n */
    static final class C27212n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C27185o f68223d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27212n(C27185o oVar) {
            super(0);
            this.f68223d = oVar;
        }

        public final void invoke() {
            this.f68223d.m84192R1();
        }
    }

    /* renamed from: p30.o$n0 */
    public static final class C27213n0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f68224d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27213n0(C43064a aVar) {
            super(0);
            this.f68224d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f68224d.invoke();
        }
    }

    /* renamed from: p30.o$o */
    static final class C27214o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C27185o f68225d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27214o(C27185o oVar) {
            super(0);
            this.f68225d = oVar;
        }

        public final void invoke() {
            this.f68225d.m84184J1().mo54751ix();
        }
    }

    /* renamed from: p30.o$o0 */
    public static final class C27215o0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f68226d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27215o0(C41217g gVar) {
            super(0);
            this.f68226d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f68226d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: p30.o$p */
    static final class C27216p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C27185o f68227d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27216p(C27185o oVar) {
            super(0);
            this.f68227d = oVar;
        }

        public final void invoke() {
            PaymentsFragmentViewModel.m71321Yw(this.f68227d.m84184J1(), false, 1, (Object) null);
        }
    }

    /* renamed from: p30.o$p0 */
    public static final class C27217p0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f68228d;

        /* renamed from: e */
        final /* synthetic */ C41217g f68229e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27217p0(C43064a aVar, C41217g gVar) {
            super(0);
            this.f68228d = aVar;
            this.f68229e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f68228d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f68229e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: p30.o$q */
    static final class C27218q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27185o f68230d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27218q(C27185o oVar) {
            super(1);
            this.f68230d = oVar;
        }

        /* renamed from: a */
        public final void mo66502a(List list) {
            C41536l.m120489i(list, "it");
            C26365e r1 = this.f68230d.f68197g;
            if (r1 == null) {
                C41536l.m120506z("adapter");
                r1 = null;
            }
            r1.mo65570u(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66502a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p30.o$q0 */
    public static final class C27219q0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f68231d;

        /* renamed from: e */
        final /* synthetic */ C41217g f68232e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27219q0(Fragment fragment, C41217g gVar) {
            super(0);
            this.f68231d = fragment;
            this.f68232e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f68232e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f68231d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    /* renamed from: p30.o$r */
    static final class C27220r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27185o f68233d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27220r(C27185o oVar) {
            super(1);
            this.f68233d = oVar;
        }

        /* renamed from: a */
        public final void mo66503a(boolean z) {
            if (z) {
                C26365e r1 = this.f68233d.f68197g;
                if (r1 == null) {
                    C41536l.m120506z("adapter");
                    r1 = null;
                }
                r1.mo65571v();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66503a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: p30.o$r0 */
    static final class C27221r0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C27185o f68234d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27221r0(C27185o oVar) {
            super(0);
            this.f68234d = oVar;
        }

        /* renamed from: b */
        public final BogSwipeRefreshLayout invoke() {
            return (BogSwipeRefreshLayout) this.f68234d.findView(C10322k.f28739Gw);
        }
    }

    /* renamed from: p30.o$s */
    static final class C27222s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27185o f68235d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27222s(C27185o oVar) {
            super(1);
            this.f68235d = oVar;
        }

        /* renamed from: a */
        public final void mo66505a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            C26365e r1 = this.f68235d.f68197g;
            if (r1 == null) {
                C41536l.m120506z("adapter");
                r1 = null;
            }
            r1.mo65572w();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66505a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p30.o$t */
    static final class C27223t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27185o f68236d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27223t(C27185o oVar) {
            super(1);
            this.f68236d = oVar;
        }

        /* renamed from: a */
        public final void mo66506a(C37223a aVar) {
            String str;
            C21503d dVar = (C21503d) aVar.mo90296a();
            if (dVar != null) {
                C27185o oVar = this.f68236d;
                if (dVar instanceof C21503d.C21504a) {
                    oVar.handleError((C21503d.C21504a) dVar);
                } else if (dVar instanceof C21503d.C21506c) {
                    C1505h activity = oVar.getActivity();
                    Context context = oVar.getContext();
                    if (context != null) {
                        str = context.getString(C10328q.contact_delete_success);
                    } else {
                        str = null;
                    }
                    C32297d.m95160h(activity, str);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66506a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p30.o$u */
    static final class C27224u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27185o f68237d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27224u(C27185o oVar) {
            super(1);
            this.f68237d = oVar;
        }

        /* renamed from: a */
        public final void mo66507a(C37223a aVar) {
            if (((C41238w) aVar.mo90296a()) != null) {
                C32303f.m95188H(this.f68237d.requireActivity());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66507a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p30.o$v */
    static final class C27225v extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27185o f68238d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27225v(C27185o oVar) {
            super(1);
            this.f68238d = oVar;
        }

        /* renamed from: a */
        public final void mo66508a(C37223a aVar) {
            C26720h hVar = (C26720h) aVar.mo90296a();
            if (hVar != null) {
                this.f68238d.m84191Q1(hVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66508a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p30.o$w */
    static final class C27226w extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27185o f68239d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27226w(C27185o oVar) {
            super(1);
            this.f68239d = oVar;
        }

        /* renamed from: a */
        public final void mo66509a(C27895b bVar) {
            C26365e r1 = this.f68239d.f68197g;
            if (r1 == null) {
                C41536l.m120506z("adapter");
                r1 = null;
            }
            C41536l.m120488h(bVar, "it");
            r1.mo65564B(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66509a((C27895b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p30.o$x */
    static final class C27227x extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27185o f68240d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27227x(C27185o oVar) {
            super(1);
            this.f68240d = oVar;
        }

        /* renamed from: a */
        public final void mo66510a(C27895b bVar) {
            C26365e r1 = this.f68240d.f68197g;
            if (r1 == null) {
                C41536l.m120506z("adapter");
                r1 = null;
            }
            C41536l.m120488h(bVar, "it");
            r1.mo65565m(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66510a((C27895b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p30.o$y */
    static final class C27228y extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27185o f68241d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27228y(C27185o oVar) {
            super(1);
            this.f68241d = oVar;
        }

        /* renamed from: a */
        public final void mo66511a(List list) {
            C26365e r1 = this.f68241d.f68197g;
            if (r1 == null) {
                C41536l.m120506z("adapter");
                r1 = null;
            }
            C41536l.m120488h(list, "it");
            r1.mo65573x(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66511a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p30.o$z */
    static final class C27229z extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27185o f68242d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27229z(C27185o oVar) {
            super(1);
            this.f68242d = oVar;
        }

        /* renamed from: a */
        public final void mo66512a(C37223a aVar) {
            Boolean bool = (Boolean) aVar.mo90296a();
            if (bool != null) {
                C27185o oVar = this.f68242d;
                if (bool.booleanValue()) {
                    C29649b.C29650a.m89985b(C29649b.f74819G, 0, 0, 0, 7, (Object) null).mo4576A1(oVar.getChildFragmentManager(), (String) null);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66512a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    public C27185o() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C27213n0(new C27211m0(this)));
        this.f68196f = C1514j0.m5374c(this, C41520a0.m120436b(PaymentsFragmentViewModel.class), new C27215o0(a), new C27217p0((C43064a) null, a), new C27219q0(this, a));
        this.f68198h = C41219i.m119470b(new C27209l0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public final void m84176B1(long j) {
        C13310d dVar = new C13310d();
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "this@PaymentsFragment2.requireContext()");
        dVar.mo35648c2(requireContext.getString(C10328q.contact_delete_title));
        dVar.mo35647a2(C13310d.C13312b.TITLE_TWO_BUTTON);
        dVar.mo35639Q1(requireContext.getString(C10328q.contact_delete_alert_msg));
        dVar.mo35646Z1(requireContext.getString(C10328q.f28966r2));
        dVar.mo35645Y1(new C27183m(this, j, dVar));
        dVar.mo35642U1(requireContext.getString(C10328q.f28951b2));
        dVar.mo35641T1(new C27184n(dVar));
        dVar.mo4576A1(getChildFragmentManager(), "Alert");
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public static final void m84177C1(C27185o oVar, long j, C13310d dVar, Button button) {
        C41536l.m120489i(oVar, "this$0");
        C41536l.m120489i(dVar, "$this_with");
        C41536l.m120489i(button, "it");
        oVar.m84184J1().mo54752jx(j);
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public static final void m84178D1(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$this_with");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    /* renamed from: E1 */
    private final C26365e m84179E1() {
        return new C26365e(new C27202i(this), new C27204j(this), new C27200h(this), new C27206k(this), new C27208l(this), new C27210m(this), new C27212n(this), new C27214o(this), new C27216p(this), new C27188b(this), new C27190c(this), new C27192d(this), new C27194e(this), new C27196f(this), new C27198g(this));
    }

    /* renamed from: F1 */
    private final void m84180F1(int i) {
        if (i == 0) {
            C36546y.m108282F().mo27152s("payments", "payment", "select_template_type");
            Intent intent = new Intent(getContext(), ProviderListActivity.class);
            intent.putExtra("CREATE_NEW_TEMPLATE", true);
            startActivity(intent);
        } else if (i == 1) {
            C36546y.m108282F().mo27152s("payments", "group_car", "select_template_type");
            Intent intent2 = new Intent(getContext(), CarTemplateGroupActivity.class);
            intent2.putExtra("NEW_TEMPLATE", true);
            startActivity(intent2);
        } else if (i == 2) {
            C36546y.m108282F().mo27152s("payments", "group_house", "select_template_type");
            Intent intent3 = new Intent(getContext(), HouseTemplateGroupActivity.class);
            intent3.putExtra("NEW_TEMPLATE", true);
            startActivity(intent3);
        }
    }

    /* renamed from: G1 */
    private final RecyclerView m84181G1() {
        Object value = this.f68194d.getValue();
        C41536l.m120488h(value, "<get-recyclerView>(...)");
        return (RecyclerView) value;
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public final long m84182H1() {
        return ((Number) this.f68198h.getValue()).longValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public final BogSwipeRefreshLayout m84183I1() {
        Object value = this.f68195e.getValue();
        C41536l.m120488h(value, "<get-swipeRefresh>(...)");
        return (BogSwipeRefreshLayout) value;
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public final PaymentsFragmentViewModel m84184J1() {
        return (PaymentsFragmentViewModel) this.f68196f.getValue();
    }

    /* renamed from: K1 */
    private final boolean m84185K1() {
        FragmentManager supportFragmentManager;
        List<Fragment> y0;
        C1505h activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || (y0 = supportFragmentManager.mo4446y0()) == null) {
            return true;
        }
        if (!y0.isEmpty()) {
            for (Fragment fragment : y0) {
                if (fragment instanceof C1483c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: L1 */
    public static final C27185o m84186L1(boolean z) {
        return f68193i.mo66479a(z);
    }

    /* renamed from: M1 */
    private final void m84187M1() {
        PaymentsFragmentViewModel J1 = m84184J1();
        if (this.mClient.isAuthorized()) {
            J1.mo54745Vw().mo4819k(getViewLifecycleOwner(), new C27207k0(new C27187a0(this)));
        }
        J1.mo54746Ww().mo4819k(getViewLifecycleOwner(), new C27207k0(new C27189b0(this)));
        J1.mo54731Fw().mo4819k(getViewLifecycleOwner(), new C27207k0(new C27191c0(this)));
        J1.mo54740Qw().mo4819k(getViewLifecycleOwner(), new C27207k0(new C27193d0(this)));
        J1.mo54741Rw().mo4819k(getViewLifecycleOwner(), new C27207k0(new C27195e0(this)));
        J1.mo54743Tw().mo4819k(getViewLifecycleOwner(), new C27207k0(new C27197f0(this)));
        J1.mo54744Uw().mo4819k(getViewLifecycleOwner(), new C27207k0(new C27199g0(this)));
        J1.mo54738Ow().mo4819k(getViewLifecycleOwner(), new C27207k0(new C27201h0(this)));
        J1.mo54739Pw().mo4819k(getViewLifecycleOwner(), new C27207k0(new C27203i0(this)));
        LiveData Iw = J1.mo54734Iw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C21484c.m69411c(Iw, viewLifecycleOwner, new C27218q(this), new C27220r(this), new C27222s(this));
        J1.mo54735Jw().mo4819k(getViewLifecycleOwner(), new C27207k0(new C27223t(this)));
        J1.mo54736Kw().mo4819k(getViewLifecycleOwner(), new C27207k0(new C27224u(this)));
        J1.mo54756pg().mo4819k(getViewLifecycleOwner(), new C27207k0(new C27225v(this)));
        addDisposable(J1.mo54733Hw().mo94981F0(new C27179i(new C27226w(this))));
        addDisposable(J1.mo54732Gw().mo94981F0(new C27180j(new C27227x(this))));
        J1.mo54737Nw().mo4819k(getViewLifecycleOwner(), new C27207k0(new C27228y(this)));
        J1.mo54742Sw().mo4819k(getViewLifecycleOwner(), new C27207k0(new C27229z(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public static final void m84188N1(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public static final void m84189O1(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public static final void m84190P1(C27185o oVar) {
        C41536l.m120489i(oVar, "this$0");
        oVar.m84184J1().mo54750ex();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0083, code lost:
        if (r0.equals("PAYMENT_WITHIN_BANK") == false) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0086, code lost:
        m84192R1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d7, code lost:
        if (kotlin.jvm.internal.C41536l.m120484d("PAYMENT_CONVERSION", r13.mo65922a()) == false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d9, code lost:
        r0 = "conversion";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e6, code lost:
        if (kotlin.jvm.internal.C41536l.m120484d("PAYMENT_WITHIN_BUDGET", r13.mo65922a()) == false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e8, code lost:
        r0 = "treasury";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00eb, code lost:
        r0 = "own_account";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ed, code lost:
        iu0.C36546y.m108282F().mo27152s("transfers", r0, "select_transfer_type");
        p341ge.bog.mobilebank.transfers.model.TransferForm.startWith((androidx.fragment.app.Fragment) r12, "TRANSFER", p341ge.bog.mobilebank.transfers.model.TransferForm.OPERATION_VIEW).setTransferForm(p341ge.bog.mobilebank.transfers.model.TransferForm.getTransferFormByDocType(r13.mo65922a())).setSrcAcctKey(m84182H1()).start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0045, code lost:
        if (r0.equals("PAYMENT_WITHIN_GEORGIA") != false) goto L_0x0086;
     */
    /* renamed from: Q1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m84191Q1(o30.C26720h r13) {
        /*
            r12 = this;
            java.lang.String r0 = r13.mo65922a()
            int r1 = r0.hashCode()
            java.lang.String r2 = "select_transfer_type"
            java.lang.String r3 = ""
            java.lang.String r4 = "transfers"
            switch(r1) {
                case -1814683163: goto L_0x00a8;
                case -564430373: goto L_0x008b;
                case -93971273: goto L_0x007d;
                case 556886292: goto L_0x0048;
                case 1078753379: goto L_0x003f;
                case 1592466108: goto L_0x0013;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x00cd
        L_0x0013:
            java.lang.String r1 = "PAYMENTS_AND_TRANSFERS_MONEY_REQUEST_CATEGORY_ID"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001d
            goto L_0x00cd
        L_0x001d:
            ck.g r0 = iu0.C36546y.m108282F()
            java.lang.String r1 = "money_request"
            java.lang.String r2 = "money_request_open_operation_module_click"
            r0.mo27152s(r1, r3, r2)
            ck.g r6 = iu0.C36546y.m108282F()
            java.lang.String r7 = "money_request"
            java.lang.String r8 = "money_request_open_operation_module_click"
            java.lang.String r9 = ""
            r10 = 0
            ck.h$a r11 = p380ck.C10464h.C10465a.FACEBOOK
            r6.mo27137H(r7, r8, r9, r10, r11)
            java.lang.Class<ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.SelectBillSplitMoneyRequestActivity> r0 = p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.SelectBillSplitMoneyRequestActivity.class
            r12.startActivity(r0)
            goto L_0x0113
        L_0x003f:
            java.lang.String r1 = "PAYMENT_WITHIN_GEORGIA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00cd
            goto L_0x0086
        L_0x0048:
            java.lang.String r1 = "PAYMENTS_AND_TRANSFERS_RECEIVE_MONEY_TRANSFER_CATEGORY_ID"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0052
            goto L_0x00cd
        L_0x0052:
            ck.g r0 = iu0.C36546y.m108282F()
            java.lang.String r1 = "receive_money_transfer"
            r0.mo27152s(r4, r1, r2)
            ck.g r6 = iu0.C36546y.m108282F()
            java.lang.String r7 = "remittance"
            java.lang.String r8 = "remittance_open_module_operation"
            r9 = 0
            r10 = 0
            ck.h$a r11 = p380ck.C10464h.C10465a.FACEBOOKANDFIREBASE
            r6.mo27137H(r7, r8, r9, r10, r11)
            androidx.fragment.app.h r1 = r12.getActivity()
            if (r1 == 0) goto L_0x0113
            q31.f r0 = q31.C38125h.m112238c(r1)
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            q31.C38122f.C38123a.m112202C(r0, r1, r2, r3, r4, r5)
            goto L_0x0113
        L_0x007d:
            java.lang.String r1 = "PAYMENT_WITHIN_BANK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0086
            goto L_0x00cd
        L_0x0086:
            r12.m84192R1()
            goto L_0x0113
        L_0x008b:
            java.lang.String r1 = "PAYMENTS_AND_TRANSFERS_PAYMENTS_CATEGORY_ID"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0094
            goto L_0x00cd
        L_0x0094:
            ck.g r0 = iu0.C36546y.m108282F()
            java.lang.String r1 = "click_payment_button"
            r0.mo27152s(r4, r3, r1)
            java.lang.String r1 = "PROVIDER_LIST_IS_SHOW_ALL_LIST"
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r12
            m84194T1(r0, r1, r2, r3, r4, r5)
            goto L_0x0113
        L_0x00a8:
            java.lang.String r1 = "TOP_UP"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b1
            goto L_0x00cd
        L_0x00b1:
            androidx.fragment.app.h r0 = r12.getActivity()
            if (r0 == 0) goto L_0x0113
            java.lang.String r1 = "P2P_Top_up"
            java.lang.String r2 = "p2p_top_up_click"
            g91.C32343x.m95499y0(r12, r1, r3, r2)
            q31.f r1 = q31.C38125h.m112238c(r0)
            ge.bog.mobilebank.shared.P2PFlowType$P2PTopUp r2 = new ge.bog.mobilebank.shared.P2PFlowType$P2PTopUp
            r3 = 1
            r4 = 0
            r2.<init>(r4, r3, r4)
            r1.mo91605g0(r0, r2)
            goto L_0x0113
        L_0x00cd:
            java.lang.String r0 = "PAYMENT_CONVERSION"
            java.lang.String r1 = r13.mo65922a()
            boolean r0 = kotlin.jvm.internal.C41536l.m120484d(r0, r1)
            if (r0 == 0) goto L_0x00dc
            java.lang.String r0 = "conversion"
            goto L_0x00ed
        L_0x00dc:
            java.lang.String r0 = "PAYMENT_WITHIN_BUDGET"
            java.lang.String r1 = r13.mo65922a()
            boolean r0 = kotlin.jvm.internal.C41536l.m120484d(r0, r1)
            if (r0 == 0) goto L_0x00eb
            java.lang.String r0 = "treasury"
            goto L_0x00ed
        L_0x00eb:
            java.lang.String r0 = "own_account"
        L_0x00ed:
            ck.g r1 = iu0.C36546y.m108282F()
            r1.mo27152s(r4, r0, r2)
            java.lang.String r0 = "TRANSFER"
            java.lang.String r1 = "VIEW"
            ge.bog.mobilebank.transfers.model.TransferForm$I r0 = p341ge.bog.mobilebank.transfers.model.TransferForm.startWith((androidx.fragment.app.Fragment) r12, (java.lang.String) r0, (java.lang.String) r1)
            java.lang.String r1 = r13.mo65922a()
            java.lang.String r1 = p341ge.bog.mobilebank.transfers.model.TransferForm.getTransferFormByDocType(r1)
            ge.bog.mobilebank.transfers.model.TransferForm$I r0 = r0.setTransferForm(r1)
            long r1 = r12.m84182H1()
            ge.bog.mobilebank.transfers.model.TransferForm$I r0 = r0.setSrcAcctKey(r1)
            r0.start()
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p30.C27185o.m84191Q1(o30.h):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: R1 */
    public final void m84192R1() {
        C32343x.m95499y0(this, "transfers", "", "click_other_transfer");
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C38122f c = C38125h.m112238c(requireActivity);
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        c.mo91632u(requireContext, new OtherTransferTypeState(m84182H1(), false, true));
    }

    /* renamed from: S1 */
    private final void m84193S1(String str, String str2, String str3) {
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C38122f c = C38125h.m112238c(requireActivity);
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C38122f.C38123a.m112201B(c, requireContext, "transaction_tab", (String) null, false, 12, (Object) null);
    }

    /* renamed from: T1 */
    static /* synthetic */ void m84194T1(C27185o oVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        oVar.m84193S1(str, str2, str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public final void m84195U1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, getString(C10328q.templates_list_create_template_payment));
        arrayList.add(1, getString(C10328q.templates_list_create_template_car));
        arrayList.add(2, getString(C10328q.templates_list_create_template_house));
        C1505h requireActivity = requireActivity();
        C41536l.m120487g(requireActivity, "null cannot be cast to non-null type ge.bog.mobilebank.ui.activities.RootActivity");
        ((C35388f2) requireActivity).mo86445u2(arrayList, new C27181k(this), new C27182l());
        C36546y.m108282F().mo27152s("payments", "create_template", "click");
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public static final void m84196V1(C27185o oVar, int i) {
        C41536l.m120489i(oVar, "this$0");
        oVar.m84180F1(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public static final void m84197W1(View view) {
        C36546y.m108282F().mo27152s("payments", "create_template_dialog", "cancel");
    }

    /* renamed from: Y1 */
    public static /* synthetic */ void m84198Y1(C27185o oVar, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        oVar.mo66477X1(j, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public final void m84199Z1(long j) {
        Intent intent = new Intent(getContext(), ProviderListActivity.class);
        intent.putExtra("PAYMENT_CONFIGURATION_KEY", j);
        intent.putExtra("PRODUCT_TYPE_KEY", -1);
        intent.putExtra("PRODUCT_ACCT_KEY", m84182H1());
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public final void m84200b2(int i, long j) {
        if (i == 10) {
            startActivity(new Intent(getContext(), TemplatesAndProvidersActivity.class));
            return;
        }
        Intent intent = new Intent(getContext(), PaymentsTemplateListActivity.class);
        intent.putExtra("PAYMENT_TEMPLATE_LIST_TYPE_KEY", i);
        intent.putExtra("PAYMENT_TEMPLATE_LIST_GROUP_KEY", j);
        intent.putExtra("PRODUCT_TYPE_KEY", -1);
        intent.putExtra("PRODUCT_ACCT_KEY", -1);
        startActivity(intent);
    }

    /* renamed from: c2 */
    static /* synthetic */ void m84201c2(C27185o oVar, int i, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = -1;
        }
        oVar.m84200b2(i, j);
    }

    /* renamed from: X1 */
    public final void mo66477X1(long j, boolean z) {
        C27165f.f68169N.mo66469a(j, z).mo4576A1(getChildFragmentManager(), "MONEY_REQUEST_BOTTOM_SHEET");
    }

    /* renamed from: a2 */
    public final void mo66478a2() {
        if (!m84185K1()) {
            m84184J1().mo54757px();
        }
    }

    /* renamed from: b3 */
    public void mo41971b3() {
        C26365e eVar = null;
        PaymentsFragmentViewModel.m71321Yw(m84184J1(), false, 1, (Object) null);
        if (!PreferencesApiManager.getInstance().isContactSwiped()) {
            C26365e eVar2 = this.f68197g;
            if (eVar2 == null) {
                C41536l.m120506z("adapter");
                eVar2 = null;
            }
            int n = eVar2.mo65566n();
            if (n != -1) {
                m84181G1().mo5425x1(n);
            }
            C26365e eVar3 = this.f68197g;
            if (eVar3 == null) {
                C41536l.m120506z("adapter");
            } else {
                eVar = eVar3;
            }
            eVar.mo65563A();
        }
    }

    /* renamed from: d3 */
    public void mo41972d3() {
    }

    public String getHeaderText() {
        String string = getString(C10328q.navigation_payments_header_text);
        C41536l.m120488h(string, "getString(R.string.navig…ion_payments_header_text)");
        return string;
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.framgment_payments2;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        m84181G1().setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        this.f68197g = m84179E1();
        RecyclerView G1 = m84181G1();
        C26365e eVar = this.f68197g;
        if (eVar == null) {
            C41536l.m120506z("adapter");
            eVar = null;
        }
        G1.setAdapter(eVar);
        RecyclerView G12 = m84181G1();
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        G12.mo5351j(new C26361a(requireContext));
        m84183I1().setOnRefreshListener(new C27178h(this));
        m84187M1();
    }

    /* renamed from: t0 */
    public void mo53866t0() {
        ContactsActivity.C22407a aVar = ContactsActivity.f59333O;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        aVar.mo55380a(requireContext, true);
    }
}

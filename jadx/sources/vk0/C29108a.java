package vk0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.hubmenu.presentation.actionsheet.C24436a;
import p341ge.bog.mobilebank.hubmenu.presentation.actionsheet.TransfersActionSheetViewModel$ViewModel;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p341ge.bog.mobilebank.shared.OtherTransferTypeState;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p366bk.C10328q;
import p642vh.C18368l;
import q31.C38122f;
import q31.C38125h;
import sk0.C28238a;
import ue1.C43064a;
import ue1.C43075l;
import wk0.C29452b;
import xk0.C29816a;

/* renamed from: vk0.a */
public final class C29108a extends C24436a implements C29452b.C29453a {

    /* renamed from: N */
    public static final C29109a f74128N = new C29109a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C28238a f74129K;

    /* renamed from: L */
    private final C41217g f74130L;

    /* renamed from: M */
    private int f74131M = C18368l.m62762k(TextTypeView.SEPARATOR_FULL);

    /* renamed from: vk0.a$a */
    public static final class C29109a {
        private C29109a() {
        }

        public /* synthetic */ C29109a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C29108a mo68976a() {
            return new C29108a();
        }
    }

    /* renamed from: vk0.a$b */
    static final class C29110b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29108a f74132d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29110b(C29108a aVar) {
            super(1);
            this.f74132d = aVar;
        }

        /* renamed from: a */
        public final void mo68977a(List list) {
            C29108a aVar = this.f74132d;
            C41536l.m120488h(list, "transferTypes");
            aVar.m89021m2(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68977a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: vk0.a$c */
    static final class C29111c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29108a f74133d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29111c(C29108a aVar) {
            super(1);
            this.f74133d = aVar;
        }

        /* renamed from: a */
        public final void mo68978a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f74133d.m89020l2("PAYMENT_OWN_ACCOUNTS");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68978a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: vk0.a$d */
    static final class C29112d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29108a f74134d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29112d(C29108a aVar) {
            super(1);
            this.f74134d = aVar;
        }

        /* renamed from: a */
        public final void mo68979a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f74134d.m89020l2("PAYMENT_CONVERSION");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68979a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: vk0.a$e */
    static final class C29113e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29108a f74135d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29113e(C29108a aVar) {
            super(1);
            this.f74135d = aVar;
        }

        /* renamed from: a */
        public final void mo68980a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f74135d.m89019k2();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68980a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: vk0.a$f */
    static final class C29114f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29108a f74136d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29114f(C29108a aVar) {
            super(1);
            this.f74136d = aVar;
        }

        /* renamed from: a */
        public final void mo68981a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f74136d.m89020l2("PAYMENT_WITHIN_BUDGET");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68981a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: vk0.a$g */
    static final class C29115g implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f74137a;

        C29115g(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f74137a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f74137a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f74137a.invoke(obj);
        }
    }

    /* renamed from: vk0.a$h */
    public static final class C29116h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f74138d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29116h(Fragment fragment) {
            super(0);
            this.f74138d = fragment;
        }

        public final Fragment invoke() {
            return this.f74138d;
        }
    }

    /* renamed from: vk0.a$i */
    public static final class C29117i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f74139d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29117i(C43064a aVar) {
            super(0);
            this.f74139d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f74139d.invoke();
        }
    }

    /* renamed from: vk0.a$j */
    public static final class C29118j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f74140d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29118j(C41217g gVar) {
            super(0);
            this.f74140d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f74140d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: vk0.a$k */
    public static final class C29119k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f74141d;

        /* renamed from: e */
        final /* synthetic */ C41217g f74142e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29119k(C43064a aVar, C41217g gVar) {
            super(0);
            this.f74141d = aVar;
            this.f74142e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f74141d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f74142e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: vk0.a$l */
    public static final class C29120l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f74143d;

        /* renamed from: e */
        final /* synthetic */ C41217g f74144e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29120l(Fragment fragment, C41217g gVar) {
            super(0);
            this.f74143d = fragment;
            this.f74144e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f74144e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f74143d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C29108a() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C29117i(new C29116h(this)));
        this.f74130L = C1514j0.m5374c(this, C41520a0.m120436b(TransfersActionSheetViewModel$ViewModel.class), new C29118j(a), new C29119k((C43064a) null, a), new C29120l(this, a));
    }

    /* renamed from: h2 */
    private final C28238a m89016h2() {
        C28238a aVar = this.f74129K;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* renamed from: i2 */
    private final C38122f m89017i2() {
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        return C38125h.m112238c(requireContext);
    }

    /* renamed from: j2 */
    private final TransfersActionSheetViewModel$ViewModel m89018j2() {
        return (TransfersActionSheetViewModel$ViewModel) this.f74130L.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public final void m89019k2() {
        C32343x.m95499y0(this, "hub", "other_transfer", "click");
        C38122f i2 = m89017i2();
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        i2.mo91632u(requireContext, new OtherTransferTypeState(-1, false, true));
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public final void m89020l2(String str) {
        C32343x.m95499y0(this, "hub", "transfer", "click");
        TransferForm.startWith(requireContext(), "TRANSFER", TransferForm.OPERATION_VIEW).setTransferForm(TransferForm.getTransferFormByDocType(str)).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public final void m89021m2(List list) {
        C28238a h2 = m89016h2();
        LoadingView loadingView = h2.f71602g;
        C41536l.m120488h(loadingView, "skeletonLoading");
        C32343x.m95483r1(loadingView, false, false, 2, (Object) null);
        RecyclerView recyclerView = h2.f71601f;
        C29452b bVar = new C29452b(this);
        bVar.mo6029i(list);
        recyclerView.setAdapter(bVar);
    }

    private final void observeData() {
        C29122c iw = m89018j2().mo62205iw();
        iw.mo62200ek().mo4819k(this, new C29115g(new C29110b(this)));
        LiveData Xp = iw.mo62198Xp();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(Xp, viewLifecycleOwner, new C29111c(this));
        LiveData xd = iw.mo62206xd();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(xd, viewLifecycleOwner2, new C29112d(this));
        LiveData Jr = iw.mo62196Jr();
        C1619q viewLifecycleOwner3 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner3, "viewLifecycleOwner");
        C37224b.m109963b(Jr, viewLifecycleOwner3, new C29113e(this));
        LiveData Aa = iw.mo62195Aa();
        C1619q viewLifecycleOwner4 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner4, "viewLifecycleOwner");
        C37224b.m109963b(Aa, viewLifecycleOwner4, new C29114f(this));
    }

    /* renamed from: P1 */
    public int mo26363P1() {
        return this.f74131M;
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f74129K = C28238a.m86775d(layoutInflater, viewGroup, true);
        mo26370a2(getString(C10328q.header_text_transfer));
        observeData();
    }

    /* renamed from: Y0 */
    public void mo68975Y0(C29816a aVar) {
        C41536l.m120489i(aVar, "productType");
        m89018j2().mo62199dw().mo62197Vq(aVar);
    }
}

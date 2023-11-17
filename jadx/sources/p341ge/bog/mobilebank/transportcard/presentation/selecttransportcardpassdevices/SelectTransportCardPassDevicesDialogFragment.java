package p341ge.bog.mobilebank.transportcard.presentation.selecttransportcardpassdevices;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import g71.C32112e;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p163m0.C7047a;
import r71.C38295a;
import r71.C38296b;
import s71.C38456b;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcardpassdevices.SelectTransportCardPassDevicesDialogFragment */
public final class SelectTransportCardPassDevicesDialogFragment extends C38295a {

    /* renamed from: G */
    private C32112e f84600G;

    /* renamed from: H */
    private final C41217g f84601H = C41219i.m119470b(C35082i.f84613d);

    /* renamed from: I */
    private final C41217g f84602I;

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcardpassdevices.SelectTransportCardPassDevicesDialogFragment$a */
    static final class C35074a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SelectTransportCardPassDevicesDialogFragment f84603d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35074a(SelectTransportCardPassDevicesDialogFragment selectTransportCardPassDevicesDialogFragment) {
            super(1);
            this.f84603d = selectTransportCardPassDevicesDialogFragment;
        }

        /* renamed from: a */
        public final void mo85952a(C38296b bVar) {
            this.f84603d.m103093g2().mo6029i(bVar.mo91853a());
            Integer b = bVar.mo91854b();
            if (b != null) {
                SelectTransportCardPassDevicesDialogFragment selectTransportCardPassDevicesDialogFragment = this.f84603d;
                selectTransportCardPassDevicesDialogFragment.m103093g2().mo92016p(b.intValue());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85952a((C38296b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcardpassdevices.SelectTransportCardPassDevicesDialogFragment$b */
    static final class C35075b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SelectTransportCardPassDevicesDialogFragment f84604d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35075b(SelectTransportCardPassDevicesDialogFragment selectTransportCardPassDevicesDialogFragment) {
            super(1);
            this.f84604d = selectTransportCardPassDevicesDialogFragment;
        }

        /* renamed from: a */
        public final void mo85953a(int i) {
            this.f84604d.m103094h2().mo85960lw().mo85957Ji(i);
            this.f84604d.mo4577k1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85953a(((Number) obj).intValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcardpassdevices.SelectTransportCardPassDevicesDialogFragment$c */
    static final class C35076c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f84605a;

        C35076c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f84605a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f84605a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f84605a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcardpassdevices.SelectTransportCardPassDevicesDialogFragment$d */
    public static final class C35077d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f84606d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35077d(Fragment fragment) {
            super(0);
            this.f84606d = fragment;
        }

        public final Fragment invoke() {
            return this.f84606d;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcardpassdevices.SelectTransportCardPassDevicesDialogFragment$e */
    public static final class C35078e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f84607d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35078e(C43064a aVar) {
            super(0);
            this.f84607d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f84607d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcardpassdevices.SelectTransportCardPassDevicesDialogFragment$f */
    public static final class C35079f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f84608d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35079f(C41217g gVar) {
            super(0);
            this.f84608d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f84608d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcardpassdevices.SelectTransportCardPassDevicesDialogFragment$g */
    public static final class C35080g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f84609d;

        /* renamed from: e */
        final /* synthetic */ C41217g f84610e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35080g(C43064a aVar, C41217g gVar) {
            super(0);
            this.f84609d = aVar;
            this.f84610e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f84609d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f84610e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcardpassdevices.SelectTransportCardPassDevicesDialogFragment$h */
    public static final class C35081h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f84611d;

        /* renamed from: e */
        final /* synthetic */ C41217g f84612e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35081h(Fragment fragment, C41217g gVar) {
            super(0);
            this.f84611d = fragment;
            this.f84612e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f84612e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f84611d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcardpassdevices.SelectTransportCardPassDevicesDialogFragment$i */
    static final class C35082i extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C35082i f84613d = new C35082i();

        C35082i() {
            super(0);
        }

        /* renamed from: b */
        public final C38456b invoke() {
            return new C38456b();
        }
    }

    public SelectTransportCardPassDevicesDialogFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C35078e(new C35077d(this)));
        this.f84602I = C1514j0.m5374c(this, C41520a0.m120436b(SelectTransportCardPassDevicesViewModel$ViewModel.class), new C35079f(a), new C35080g((C43064a) null, a), new C35081h(this, a));
    }

    /* renamed from: f2 */
    private final C32112e m103092f2() {
        C32112e eVar = this.f84600G;
        C41536l.m120486f(eVar);
        return eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public final C38456b m103093g2() {
        return (C38456b) this.f84601H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public final SelectTransportCardPassDevicesViewModel$ViewModel m103094h2() {
        return (SelectTransportCardPassDevicesViewModel$ViewModel) this.f84602I.getValue();
    }

    private final void observeData() {
        m103094h2().mo85961mw().mo85959a().mo4819k(getViewLifecycleOwner(), new C35076c(new C35074a(this)));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f84600G = C32112e.m94582d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f84600G = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26370a2(C32343x.m95388F("tcc.permit.usage.method.action.sheet.title", new Object[0]));
        m103092f2().f78975e.setText(C32343x.m95388F("tcc.permit.usage.method.action.sheet.warning.text", new Object[0]));
        m103092f2().f78976f.setAdapter(m103093g2());
        m103093g2().mo92015o(new C35075b(this));
        observeData();
    }
}

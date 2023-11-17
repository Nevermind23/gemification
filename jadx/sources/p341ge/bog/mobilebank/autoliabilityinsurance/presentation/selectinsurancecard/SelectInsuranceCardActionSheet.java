package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.selectinsurancecard;

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
import p163m0.C7047a;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p396dl.C12315a;
import p410el.C12482b;
import p493kk.C16450d;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.selectinsurancecard.SelectInsuranceCardActionSheet */
public final class SelectInsuranceCardActionSheet extends C12315a {

    /* renamed from: G */
    private C16450d f40950G;

    /* renamed from: H */
    private final C41217g f40951H;

    /* renamed from: I */
    private final C41217g f40952I = C41219i.m119470b(new C13734a(this));

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.selectinsurancecard.SelectInsuranceCardActionSheet$a */
    static final class C13734a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SelectInsuranceCardActionSheet f40953d;

        /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.selectinsurancecard.SelectInsuranceCardActionSheet$a$a */
        static final class C13735a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ SelectInsuranceCardActionSheet f40954d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13735a(SelectInsuranceCardActionSheet selectInsuranceCardActionSheet) {
                super(1);
                this.f40954d = selectInsuranceCardActionSheet;
            }

            /* renamed from: a */
            public final void mo37637a(int i) {
                this.f40954d.m51346h2().mo37641hw().mo32907j1(i);
                this.f40954d.mo4577k1();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo37637a(((Number) obj).intValue());
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13734a(SelectInsuranceCardActionSheet selectInsuranceCardActionSheet) {
            super(0);
            this.f40953d = selectInsuranceCardActionSheet;
        }

        /* renamed from: b */
        public final C12482b invoke() {
            return new C12482b(new C13735a(this.f40953d));
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.selectinsurancecard.SelectInsuranceCardActionSheet$b */
    static final class C13736b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SelectInsuranceCardActionSheet f40955d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13736b(SelectInsuranceCardActionSheet selectInsuranceCardActionSheet) {
            super(1);
            this.f40955d = selectInsuranceCardActionSheet;
        }

        /* renamed from: a */
        public final void mo37638a(List list) {
            this.f40955d.m51345g2().mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37638a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.selectinsurancecard.SelectInsuranceCardActionSheet$c */
    static final class C13737c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f40956a;

        C13737c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f40956a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f40956a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f40956a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.selectinsurancecard.SelectInsuranceCardActionSheet$d */
    public static final class C13738d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f40957d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13738d(Fragment fragment) {
            super(0);
            this.f40957d = fragment;
        }

        public final Fragment invoke() {
            return this.f40957d;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.selectinsurancecard.SelectInsuranceCardActionSheet$e */
    public static final class C13739e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f40958d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13739e(C43064a aVar) {
            super(0);
            this.f40958d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f40958d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.selectinsurancecard.SelectInsuranceCardActionSheet$f */
    public static final class C13740f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f40959d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13740f(C41217g gVar) {
            super(0);
            this.f40959d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f40959d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.selectinsurancecard.SelectInsuranceCardActionSheet$g */
    public static final class C13741g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f40960d;

        /* renamed from: e */
        final /* synthetic */ C41217g f40961e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13741g(C43064a aVar, C41217g gVar) {
            super(0);
            this.f40960d = aVar;
            this.f40961e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f40960d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f40961e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.selectinsurancecard.SelectInsuranceCardActionSheet$h */
    public static final class C13742h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f40962d;

        /* renamed from: e */
        final /* synthetic */ C41217g f40963e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13742h(Fragment fragment, C41217g gVar) {
            super(0);
            this.f40962d = fragment;
            this.f40963e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f40963e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f40962d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public SelectInsuranceCardActionSheet() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C13739e(new C13738d(this)));
        this.f40951H = C1514j0.m5374c(this, C41520a0.m120436b(SelectInsuranceCardViewModel$ViewModel.class), new C13740f(a), new C13741g((C43064a) null, a), new C13742h(this, a));
    }

    /* renamed from: f2 */
    private final C16450d m51344f2() {
        C16450d dVar = this.f40950G;
        C41536l.m120486f(dVar);
        return dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public final C12482b m51345g2() {
        return (C12482b) this.f40952I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public final SelectInsuranceCardViewModel$ViewModel m51346h2() {
        return (SelectInsuranceCardViewModel$ViewModel) this.f40951H.getValue();
    }

    private final void observeData() {
        m51346h2().mo37643jw().mo32908oq().mo4819k(getViewLifecycleOwner(), new C13737c(new C13736b(this)));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f40950G = C16450d.m58604d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f40950G = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26372b2(ActionSheetTitle.C13155a.BASIC);
        mo26370a2(C32343x.m95388F("rbc.insurance.dd.select.card", new Object[0]));
        m51344f2().f46467e.setAdapter(m51345g2());
        observeData();
    }
}

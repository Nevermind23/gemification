package p341ge.bog.mobilebank.transportcard.presentation.passmigrate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import b41.C31128a;
import b41.C31132b;
import c71.C31287g;
import g71.C32108a;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import m41.C37224b;
import o71.C37662a;
import o71.C37678q;
import p163m0.C7047a;
import p420fh.C12902d;
import p420fh.C12910e;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.PassMigrateActionSheet */
public final class PassMigrateActionSheet extends C37662a {

    /* renamed from: G */
    private C32108a f84477G;

    /* renamed from: H */
    private final C41217g f84478H;

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.PassMigrateActionSheet$a */
    static final class C35004a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PassMigrateActionSheet f84479d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35004a(PassMigrateActionSheet passMigrateActionSheet) {
            super(1);
            this.f84479d = passMigrateActionSheet;
        }

        /* renamed from: a */
        public final void mo85839a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f84479d.mo26370a2(C32343x.m95388F("tcc.permit.details.page.choose.card", new Object[0]));
            this.f84479d.m102906g2(new C35025d());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85839a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.PassMigrateActionSheet$b */
    static final class C35005b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PassMigrateActionSheet f84480d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35005b(PassMigrateActionSheet passMigrateActionSheet) {
            super(1);
            this.f84480d = passMigrateActionSheet;
        }

        /* renamed from: a */
        public final void mo85840a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f84480d.mo26370a2(C32343x.m95388F("tcc.management.page.change.card", new Object[0]));
            this.f84480d.m102906g2(new C37678q());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85840a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.PassMigrateActionSheet$c */
    static final class C35006c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PassMigrateActionSheet f84481d;

        /* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.PassMigrateActionSheet$c$a */
        static final class C35007a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ PassMigrateActionSheet f84482d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35007a(PassMigrateActionSheet passMigrateActionSheet) {
                super(1);
                this.f84482d = passMigrateActionSheet;
            }

            /* renamed from: a */
            public final void mo85842a(Object obj) {
                C41536l.m120489i(obj, "it");
                C1505h requireActivity = this.f84482d.requireActivity();
                C41536l.m120488h(requireActivity, "requireActivity()");
                String string = this.f84482d.getString(C31287g.tc_information_been_updated);
                C41536l.m120488h(string, "getString(R.string.tc_information_been_updated)");
                C12910e.m48797o(requireActivity, string, (C12902d.C12905b) null, false, 6, (Object) null);
                this.f84482d.mo4577k1();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo85842a(obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.PassMigrateActionSheet$c$b */
        static final class C35008b extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ PassMigrateActionSheet f84483d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35008b(PassMigrateActionSheet passMigrateActionSheet) {
                super(2);
                this.f84483d = passMigrateActionSheet;
            }

            /* renamed from: a */
            public final void mo85843a(Throwable th, Object obj) {
                C41536l.m120489i(th, "error");
                C1505h requireActivity = this.f84483d.requireActivity();
                C41536l.m120488h(requireActivity, "requireActivity()");
                C12910e.m48790h(requireActivity, String.valueOf(C32343x.m95431a0(th, (String) null, 1, (Object) null)), (C12902d.C12905b) null, false, 6, (Object) null);
                this.f84483d.mo4577k1();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo85843a((Throwable) obj, obj2);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35006c(PassMigrateActionSheet passMigrateActionSheet) {
            super(1);
            this.f84481d = passMigrateActionSheet;
        }

        /* renamed from: a */
        public final void mo85841a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C35007a(this.f84481d), 1, (Object) null);
            C31132b.m92644f(aVar, (int[]) null, new C35008b(this.f84481d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85841a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.PassMigrateActionSheet$d */
    static final class C35009d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f84484a;

        C35009d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f84484a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f84484a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f84484a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.PassMigrateActionSheet$e */
    public static final class C35010e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f84485d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35010e(Fragment fragment) {
            super(0);
            this.f84485d = fragment;
        }

        public final Fragment invoke() {
            return this.f84485d;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.PassMigrateActionSheet$f */
    public static final class C35011f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f84486d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35011f(C43064a aVar) {
            super(0);
            this.f84486d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f84486d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.PassMigrateActionSheet$g */
    public static final class C35012g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f84487d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35012g(C41217g gVar) {
            super(0);
            this.f84487d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f84487d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.PassMigrateActionSheet$h */
    public static final class C35013h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f84488d;

        /* renamed from: e */
        final /* synthetic */ C41217g f84489e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35013h(C43064a aVar, C41217g gVar) {
            super(0);
            this.f84488d = aVar;
            this.f84489e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f84488d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f84489e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.PassMigrateActionSheet$i */
    public static final class C35014i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f84490d;

        /* renamed from: e */
        final /* synthetic */ C41217g f84491e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35014i(Fragment fragment, C41217g gVar) {
            super(0);
            this.f84490d = fragment;
            this.f84491e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f84491e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f84490d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public PassMigrateActionSheet() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C35011f(new C35010e(this)));
        this.f84478H = C1514j0.m5374c(this, C41520a0.m120436b(PassMigrateViewModel$ViewModel.class), new C35012g(a), new C35013h((C43064a) null, a), new C35014i(this, a));
    }

    /* renamed from: e2 */
    private final C32108a m102904e2() {
        C32108a aVar = this.f84477G;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* renamed from: f2 */
    private final PassMigrateViewModel$ViewModel m102905f2() {
        return (PassMigrateViewModel$ViewModel) this.f84478H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public final void m102906g2(Fragment fragment) {
        getChildFragmentManager().mo4428p().mo4639r(m102904e2().f78964e.getId(), fragment).mo4515i();
    }

    private final void observeData() {
        LiveData wt = m102905f2().mo85861vw().mo85862wt();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(wt, viewLifecycleOwner, new C35004a(this));
        LiveData yu = m102905f2().mo85861vw().mo85865yu();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(yu, viewLifecycleOwner2, new C35005b(this));
        m102905f2().mo85861vw().mo85850Za().mo4819k(getViewLifecycleOwner(), new C35009d(new C35006c(this)));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f84477G = C32108a.m94565d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f84477G = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        observeData();
    }
}

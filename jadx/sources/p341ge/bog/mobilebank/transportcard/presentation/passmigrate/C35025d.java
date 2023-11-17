package p341ge.bog.mobilebank.transportcard.presentation.passmigrate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import g71.C32115h;
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
import o71.C37674m;
import p163m0.C7047a;
import p71.C37925b;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.d */
public final class C35025d extends C35022a {

    /* renamed from: g */
    private C32115h f84519g;

    /* renamed from: h */
    private final C41217g f84520h;

    /* renamed from: i */
    private final C41217g f84521i = C41219i.m119470b(new C35026a(this));

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.d$a */
    static final class C35026a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C35025d f84522d;

        /* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.d$a$a */
        static final class C35027a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C35025d f84523d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35027a(C35025d dVar) {
                super(1);
                this.f84523d = dVar;
            }

            /* renamed from: a */
            public final void mo85874a(int i) {
                this.f84523d.m102963n1().mo85857rw().mo85849Z2(i);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo85874a(((Number) obj).intValue());
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35026a(C35025d dVar) {
            super(0);
            this.f84522d = dVar;
        }

        /* renamed from: b */
        public final C37925b invoke() {
            return new C37925b(new C35027a(this.f84522d));
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.d$b */
    static final class C35028b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C35025d f84524d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35028b(C35025d dVar) {
            super(1);
            this.f84524d = dVar;
        }

        /* renamed from: a */
        public final void mo85875a(List list) {
            this.f84524d.m102962m1().mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85875a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.d$c */
    static final class C35029c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f84525a;

        C35029c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f84525a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f84525a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f84525a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.d$d */
    public static final class C35030d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f84526d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35030d(C43064a aVar) {
            super(0);
            this.f84526d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f84526d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.d$e */
    public static final class C35031e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f84527d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35031e(C41217g gVar) {
            super(0);
            this.f84527d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f84527d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.d$f */
    public static final class C35032f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f84528d;

        /* renamed from: e */
        final /* synthetic */ C41217g f84529e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35032f(C43064a aVar, C41217g gVar) {
            super(0);
            this.f84528d = aVar;
            this.f84529e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f84528d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f84529e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.d$g */
    public static final class C35033g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f84530d;

        /* renamed from: e */
        final /* synthetic */ C41217g f84531e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35033g(Fragment fragment, C41217g gVar) {
            super(0);
            this.f84530d = fragment;
            this.f84531e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f84531e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f84530d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.d$h */
    static final class C35034h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C35025d f84532d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35034h(C35025d dVar) {
            super(0);
            this.f84532d = dVar;
        }

        public final C1638u0 invoke() {
            Fragment requireParentFragment = this.f84532d.requireParentFragment();
            C41536l.m120488h(requireParentFragment, "requireParentFragment()");
            return requireParentFragment;
        }
    }

    public C35025d() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C35030d(new C35034h(this)));
        this.f84520h = C1514j0.m5374c(this, C41520a0.m120436b(PassMigrateViewModel$ViewModel.class), new C35031e(a), new C35032f((C43064a) null, a), new C35033g(this, a));
    }

    /* renamed from: l1 */
    private final C32115h m102961l1() {
        C32115h hVar = this.f84519g;
        C41536l.m120486f(hVar);
        return hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public final C37925b m102962m1() {
        return (C37925b) this.f84521i.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public final PassMigrateViewModel$ViewModel m102963n1() {
        return (PassMigrateViewModel$ViewModel) this.f84520h.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public static final void m102964o1(C35025d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.m102963n1().mo85857rw().mo85851a4();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f84519g = C32115h.m94594d(layoutInflater, viewGroup, false);
        LinearLayout c = m102961l1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f84519g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m102961l1().f79006f.setText(C32343x.m95388F("tcc.permit.details.page.choose.card.not.chosen", new Object[0]));
        m102961l1().f79005e.setAdapter(m102962m1());
        m102961l1().f79007g.setOnClickListener(new C37674m(this));
        m102963n1().mo85861vw().mo85854gk().mo4819k(getViewLifecycleOwner(), new C35029c(new C35028b(this)));
    }
}

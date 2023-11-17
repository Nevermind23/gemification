package o71;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.activity.C0152h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import g71.C32116i;
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
import p341ge.bog.mobilebank.transportcard.presentation.passmigrate.PassMigrateViewModel$ViewModel;
import p71.C37927d;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: o71.q */
public final class C37678q extends Fragment {

    /* renamed from: d */
    private C32116i f90533d;

    /* renamed from: e */
    private final C41217g f90534e;

    /* renamed from: f */
    private final C41217g f90535f = C41219i.m119470b(new C37684d(this));

    /* renamed from: g */
    private final C37683c f90536g = new C37683c(this);

    /* renamed from: o71.q$a */
    static final class C37679a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37678q f90537d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37679a(C37678q qVar) {
            super(1);
            this.f90537d = qVar;
        }

        /* renamed from: a */
        public final void mo90857a(C37692r rVar) {
            this.f90537d.m110753m1().f79012h.setCreditCard(rVar.mo90866b());
            this.f90537d.m110754n1().mo6029i(rVar.mo90865a());
            if (!rVar.mo90865a().isEmpty()) {
                this.f90537d.m110754n1().mo91285o(0);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo90857a((C37692r) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: o71.q$b */
    static final class C37680b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37678q f90538d;

        /* renamed from: o71.q$b$a */
        static final class C37681a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C37678q f90539d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C37681a(C37678q qVar) {
                super(1);
                this.f90539d = qVar;
            }

            /* renamed from: a */
            public final void mo90859a(Object obj) {
                this.f90539d.m110753m1().f79011g.getButton().setLoading(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo90859a(obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: o71.q$b$b */
        static final class C37682b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C37678q f90540d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C37682b(C37678q qVar) {
                super(1);
                this.f90540d = qVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f90540d.m110753m1().f79011g.getButton().setLoading(false);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37680b(C37678q qVar) {
            super(1);
            this.f90538d = qVar;
        }

        /* renamed from: a */
        public final void mo90858a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92646h(aVar, (int[]) null, new C37681a(this.f90538d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C37682b(this.f90538d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo90858a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: o71.q$c */
    public static final class C37683c extends C0152h {

        /* renamed from: d */
        final /* synthetic */ C37678q f90541d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37683c(C37678q qVar) {
            super(true);
            this.f90541d = qVar;
        }

        /* renamed from: b */
        public void mo361b() {
            this.f90541d.m110755o1().mo85857rw().mo85852fh();
        }
    }

    /* renamed from: o71.q$d */
    static final class C37684d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C37678q f90542d;

        /* renamed from: o71.q$d$a */
        static final class C37685a extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C37678q f90543d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C37685a(C37678q qVar) {
                super(2);
                this.f90543d = qVar;
            }

            /* renamed from: a */
            public final void mo90862a(String str, String str2) {
                C41536l.m120489i(str, "deviceId");
                C41536l.m120489i(str2, "deviceType");
                this.f90543d.m110755o1().mo85857rw().mo85856ns(str, str2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo90862a((String) obj, (String) obj2);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37684d(C37678q qVar) {
            super(0);
            this.f90542d = qVar;
        }

        /* renamed from: b */
        public final C37927d invoke() {
            return new C37927d(new C37685a(this.f90542d));
        }
    }

    /* renamed from: o71.q$e */
    static final class C37686e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f90544a;

        C37686e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f90544a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f90544a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f90544a.invoke(obj);
        }
    }

    /* renamed from: o71.q$f */
    public static final class C37687f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f90545d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37687f(C43064a aVar) {
            super(0);
            this.f90545d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f90545d.invoke();
        }
    }

    /* renamed from: o71.q$g */
    public static final class C37688g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f90546d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37688g(C41217g gVar) {
            super(0);
            this.f90546d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f90546d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: o71.q$h */
    public static final class C37689h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f90547d;

        /* renamed from: e */
        final /* synthetic */ C41217g f90548e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37689h(C43064a aVar, C41217g gVar) {
            super(0);
            this.f90547d = aVar;
            this.f90548e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f90547d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f90548e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: o71.q$i */
    public static final class C37690i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f90549d;

        /* renamed from: e */
        final /* synthetic */ C41217g f90550e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37690i(Fragment fragment, C41217g gVar) {
            super(0);
            this.f90549d = fragment;
            this.f90550e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f90550e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f90549d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    /* renamed from: o71.q$j */
    static final class C37691j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C37678q f90551d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37691j(C37678q qVar) {
            super(0);
            this.f90551d = qVar;
        }

        public final C1638u0 invoke() {
            Fragment requireParentFragment = this.f90551d.requireParentFragment();
            C41536l.m120488h(requireParentFragment, "requireParentFragment()");
            return requireParentFragment;
        }
    }

    public C37678q() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C37687f(new C37691j(this)));
        this.f90534e = C1514j0.m5374c(this, C41520a0.m120436b(PassMigrateViewModel$ViewModel.class), new C37688g(a), new C37689h((C43064a) null, a), new C37690i(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public final C32116i m110753m1() {
        C32116i iVar = this.f90533d;
        C41536l.m120486f(iVar);
        return iVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public final C37927d m110754n1() {
        return (C37927d) this.f90535f.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public final PassMigrateViewModel$ViewModel m110755o1() {
        return (PassMigrateViewModel$ViewModel) this.f90534e.getValue();
    }

    private final void observeData() {
        m110755o1().mo85861vw().mo85846Nj().mo4819k(getViewLifecycleOwner(), new C37686e(new C37679a(this)));
        m110755o1().mo85861vw().mo85850Za().mo4819k(getViewLifecycleOwner(), new C37686e(new C37680b(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public static final void m110756p1(C37678q qVar, View view) {
        C41536l.m120489i(qVar, "this$0");
        qVar.m110755o1().mo85857rw().mo85848X2();
    }

    /* renamed from: q1 */
    private final void m110757q1() {
        View view = getView();
        if (view != null) {
            view.setFocusableInTouchMode(true);
        }
        View view2 = getView();
        if (view2 != null) {
            view2.requestFocus();
        }
        View view3 = getView();
        if (view3 != null) {
            view3.setOnKeyListener(new C37677p(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public static final boolean m110758r1(C37678q qVar, View view, int i, KeyEvent keyEvent) {
        C41536l.m120489i(qVar, "this$0");
        if (i != 4) {
            return false;
        }
        qVar.m110755o1().mo85857rw().mo85852fh();
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requireActivity().getOnBackPressedDispatcher().mo341b(this.f90536g);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f90533d = C32116i.m94598d(layoutInflater, viewGroup, false);
        LinearLayout c = m110753m1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f90536g.mo363d();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f90533d = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m110757q1();
        m110753m1().f79009e.setText(C32343x.m95388F("tcc.permit.usage.method.action.sheet.warning.text", new Object[0]));
        m110753m1().f79011g.setOnClickListener(new C37676o(this));
        m110753m1().f79010f.setAdapter(m110754n1());
        observeData();
    }
}

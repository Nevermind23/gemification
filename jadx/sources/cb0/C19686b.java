package cb0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.cardview.widget.CardView;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import bb0.C19363b;
import db0.C19956a;
import g91.C32343x;
import ha0.C24937n;
import he1.C41212c;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p163m0.C7047a;
import p341ge.bog.mobilebank.depositapplication.presentation.depositadvisor.viewmodel.DepositAdvisorViewModel$ViewModel;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import ue1.C43064a;
import ue1.C43075l;
import za0.C30271b;

/* renamed from: cb0.b */
public final class C19686b extends C35651n1 {

    /* renamed from: g */
    public static final C19687a f54023g = new C19687a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C24937n f54024d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C19363b f54025e;

    /* renamed from: f */
    private final C41217g f54026f = C1514j0.m5374c(this, C41520a0.m120436b(DepositAdvisorViewModel$ViewModel.class), new C19690d(this), new C19691e((C43064a) null, this), new C19692f(this));

    /* renamed from: cb0.b$a */
    public static final class C19687a {
        private C19687a() {
        }

        public /* synthetic */ C19687a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C19686b mo47886a(C19956a aVar) {
            C41536l.m120489i(aVar, "pageType");
            C19686b bVar = new C19686b();
            bVar.setArguments(C0908e.m3336b(C41233s.m119492a("ARGS_PAGE_TYPE", aVar)));
            return bVar;
        }
    }

    /* renamed from: cb0.b$b */
    static final class C19688b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19686b f54027d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19688b(C19686b bVar) {
            super(1);
            this.f54027d = bVar;
        }

        /* renamed from: a */
        public final void mo47887a(C37223a aVar) {
            C31128a aVar2 = (C31128a) aVar.mo90296a();
            if (aVar2 != null) {
                C19686b bVar = this.f54027d;
                if (aVar2 instanceof C31128a.C31130b) {
                    bVar.m65356o1(true);
                } else if (aVar2 instanceof C31128a.C31131c) {
                    bVar.m65356o1(false);
                    C30271b bVar2 = (C30271b) ((C31128a.C31131c) aVar2).mo71340a();
                    bVar.m65354m1().f64224e.setDrawableSrc(Integer.valueOf(bVar2.mo70592a()));
                    bVar.m65354m1().f64224e.setTitle(bVar2.mo70593b());
                    C19363b j1 = bVar.f54025e;
                    if (j1 == null) {
                        C41536l.m120506z("adapter");
                        j1 = null;
                    }
                    j1.mo6029i(bVar2.mo70594c());
                    bVar.m65354m1().f64226g.scheduleLayoutAnimation();
                } else if (aVar2 instanceof C31128a.C31129a) {
                    bVar.m65356o1(false);
                    CardView cardView = bVar.m65354m1().f64228i;
                    C41536l.m120488h(cardView, "binding.retryButtonContainer");
                    C32343x.m95447f1(cardView);
                    bVar.handleError(((C31128a.C31129a) aVar2).mo71342c());
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47887a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: cb0.b$c */
    static final class C19689c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f54028a;

        C19689c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f54028a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f54028a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f54028a.invoke(obj);
        }
    }

    /* renamed from: cb0.b$d */
    public static final class C19690d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f54029d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19690d(Fragment fragment) {
            super(0);
            this.f54029d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f54029d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: cb0.b$e */
    public static final class C19691e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f54030d;

        /* renamed from: e */
        final /* synthetic */ Fragment f54031e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19691e(C43064a aVar, Fragment fragment) {
            super(0);
            this.f54030d = aVar;
            this.f54031e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f54030d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f54031e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: cb0.b$f */
    public static final class C19692f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f54032d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19692f(Fragment fragment) {
            super(0);
            this.f54032d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f54032d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public final C24937n m65354m1() {
        C24937n nVar = this.f54024d;
        C41536l.m120486f(nVar);
        return nVar;
    }

    /* renamed from: n1 */
    private final DepositAdvisorViewModel$ViewModel m65355n1() {
        return (DepositAdvisorViewModel$ViewModel) this.f54026f.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public final void m65356o1(boolean z) {
        FrameLayout frameLayout = m65354m1().f64225f;
        C41536l.m120488h(frameLayout, "binding.progressBar");
        C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
    }

    private final void observeData() {
        m65355n1().mo57073Bw().mo57077hs().mo4819k(getViewLifecycleOwner(), new C19689c(new C19688b(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public static final void m65357p1(C19686b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        bVar.m65355n1().onRefresh(6);
        CardView cardView = bVar.m65354m1().f64228i;
        C41536l.m120488h(cardView, "binding.retryButtonContainer");
        C32343x.m95455i0(cardView);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f54024d = C24937n.m79733d(getLayoutInflater(), viewGroup, false);
        ScrollView c = m65354m1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f54024d = null;
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [java.io.Serializable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r2, android.os.Bundle r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C41536l.m120489i(r2, r0)
            super.onViewCreated(r2, r3)
            bb0.b r2 = new bb0.b
            ge.bog.mobilebank.depositapplication.presentation.depositadvisor.viewmodel.DepositAdvisorViewModel$ViewModel r3 = r1.m65355n1()
            db0.e r3 = r3.mo57079yw()
            r2.<init>(r3)
            r1.f54025e = r2
            ha0.n r2 = r1.m65354m1()
            androidx.recyclerview.widget.RecyclerView r2 = r2.f64226g
            bb0.b r3 = r1.f54025e
            r0 = 0
            if (r3 != 0) goto L_0x0028
            java.lang.String r3 = "adapter"
            kotlin.jvm.internal.C41536l.m120506z(r3)
            r3 = r0
        L_0x0028:
            r2.setAdapter(r3)
            r1.observeData()
            android.os.Bundle r2 = r1.requireArguments()
            java.lang.String r3 = "ARGS_PAGE_TYPE"
            java.io.Serializable r2 = r2.getSerializable(r3)
            boolean r3 = r2 instanceof db0.C19956a
            if (r3 == 0) goto L_0x003f
            r0 = r2
            db0.a r0 = (db0.C19956a) r0
        L_0x003f:
            if (r0 != 0) goto L_0x0049
            androidx.fragment.app.h r2 = r1.requireActivity()
            r2.finish()
            return
        L_0x0049:
            ge.bog.mobilebank.depositapplication.presentation.depositadvisor.viewmodel.DepositAdvisorViewModel$ViewModel r2 = r1.m65355n1()
            db0.e r2 = r2.mo57079yw()
            r2.mo48336vq(r0)
            ha0.n r2 = r1.m65354m1()
            p90.z7 r2 = r2.f64227h
            android.widget.LinearLayout r2 = r2.mo3946b()
            cb0.a r3 = new cb0.a
            r3.<init>(r1)
            r2.setOnClickListener(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cb0.C19686b.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}

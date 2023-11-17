package p341ge.bog.mobilebank.statements.presentation.statementsfilter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o51.C37645b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.mobilebank.statements.presentation.statementsfilter.C34771d;
import p366bk.C10320i;
import p366bk.C10328q;
import q51.C38131b;
import q51.C38132c;
import ue1.C43064a;
import ue1.C43075l;
import v51.C39202a0;
import v51.C39209e;
import v51.C39211f;
import v51.C39213g;

/* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.c */
public final class C34761c extends C39209e {

    /* renamed from: I */
    public static final C34762a f84002I = new C34762a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private C37645b f84003G;

    /* renamed from: H */
    private final C41217g f84004H = C1514j0.m5374c(this, C41520a0.m120436b(StatementsFilterViewModel$ViewModel.class), new C34768g(this), new C34769h((C43064a) null, this), new C34770i(this));

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.c$a */
    public static final class C34762a {
        private C34762a() {
        }

        public /* synthetic */ C34762a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C34761c mo84903a(boolean z) {
            C34761c cVar = new C34761c();
            int i = 1;
            C41224m[] mVarArr = new C41224m[1];
            if (!z) {
                i = 2;
            }
            mVarArr[0] = C41233s.m119492a("SELECTOR_TYPE", Integer.valueOf(i));
            cVar.setArguments(C0908e.m3336b(mVarArr));
            return cVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.c$b */
    static final class C34763b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ List f84005d;

        /* renamed from: e */
        final /* synthetic */ C34761c f84006e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34763b(List list, C34761c cVar) {
            super(1);
            this.f84005d = list;
            this.f84006e = cVar;
        }

        /* renamed from: a */
        public final void mo84904a(List list) {
            List list2 = this.f84005d;
            C41536l.m120488h(list, "lst");
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C34771d.C34776e.C34777a((C38131b) it.next()));
            }
            list2.addAll(arrayList);
            this.f84006e.m102164o2(this.f84005d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84904a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.c$c */
    static final class C34764c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ List f84007d;

        /* renamed from: e */
        final /* synthetic */ C34761c f84008e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34764c(List list, C34761c cVar) {
            super(1);
            this.f84007d = list;
            this.f84008e = cVar;
        }

        /* renamed from: a */
        public final void mo84905a(List list) {
            List list2 = this.f84007d;
            C41536l.m120488h(list, "lst");
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C34771d.C34776e.C34778b((C38132c) it.next()));
            }
            list2.addAll(arrayList);
            this.f84008e.m102164o2(this.f84007d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84905a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.c$d */
    static final class C34765d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f84009a;

        C34765d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f84009a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f84009a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f84009a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.c$e */
    static final class C34766e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34761c f84010d;

        /* renamed from: e */
        final /* synthetic */ List f84011e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34766e(C34761c cVar, List list) {
            super(1);
            this.f84010d = cVar;
            this.f84011e = list;
        }

        /* renamed from: a */
        public final void mo84908a(HashSet hashSet) {
            RecyclerView recyclerView = this.f84010d.m102162m2().f90420h;
            C41536l.m120488h(hashSet, "accs");
            ArrayList arrayList = new ArrayList(C41343r.m119925u(hashSet, 10));
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((Number) ((C41224m) it.next()).mo95678e()).longValue()));
            }
            recyclerView.setAdapter(new C34771d(C41358y.m120034x0(arrayList), new HashSet()));
            C34771d f2 = this.f84010d.m102161l2();
            if (f2 != null) {
                f2.mo6029i(this.f84011e);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84908a((HashSet) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.c$f */
    static final class C34767f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34761c f84012d;

        /* renamed from: e */
        final /* synthetic */ List f84013e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34767f(C34761c cVar, List list) {
            super(1);
            this.f84012d = cVar;
            this.f84013e = list;
        }

        /* renamed from: a */
        public final void mo84909a(HashSet hashSet) {
            RecyclerView recyclerView = this.f84012d.m102162m2().f90420h;
            HashSet hashSet2 = new HashSet();
            C41536l.m120488h(hashSet, "cards");
            ArrayList arrayList = new ArrayList(C41343r.m119925u(hashSet, 10));
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((Number) ((C41224m) it.next()).mo95678e()).longValue()));
            }
            recyclerView.setAdapter(new C34771d(hashSet2, C41358y.m120034x0(arrayList)));
            C34771d f2 = this.f84012d.m102161l2();
            if (f2 != null) {
                f2.mo6029i(this.f84013e);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84909a((HashSet) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.c$g */
    public static final class C34768g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f84014d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34768g(Fragment fragment) {
            super(0);
            this.f84014d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f84014d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.c$h */
    public static final class C34769h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f84015d;

        /* renamed from: e */
        final /* synthetic */ Fragment f84016e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34769h(C43064a aVar, Fragment fragment) {
            super(0);
            this.f84015d = aVar;
            this.f84016e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f84015d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f84016e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.c$i */
    public static final class C34770i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f84017d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34770i(Fragment fragment) {
            super(0);
            this.f84017d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f84017d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: i2 */
    private final void m102158i2() {
        m102162m2().f90417e.setOnClickListener(new C39211f(this));
        m102162m2().f90418f.setOnClickListener(new C39213g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public static final void m102159j2(C34761c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        C34771d l2 = cVar.m102161l2();
        if (l2 != null) {
            l2.mo84910k();
        }
        int i = cVar.requireArguments().getInt("SELECTOR_TYPE", 1);
        if (i == 1) {
            cVar.m102163n2().mo84874uw().mo84858Tf(new HashSet());
        } else if (i == 2) {
            cVar.m102163n2().mo84874uw().mo84868qc(new HashSet());
        }
        cVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m102160k2(C34761c cVar, View view) {
        HashSet hashSet;
        HashSet hashSet2;
        C41536l.m120489i(cVar, "this$0");
        int i = cVar.requireArguments().getInt("SELECTOR_TYPE", 1);
        if (i == 1) {
            C39202a0 uw = cVar.m102163n2().mo84874uw();
            C34771d l2 = cVar.m102161l2();
            if (l2 == null || (hashSet = l2.mo84911l()) == null) {
                hashSet = new HashSet();
            }
            uw.mo84858Tf(hashSet);
        } else if (i == 2) {
            C39202a0 uw2 = cVar.m102163n2().mo84874uw();
            C34771d l22 = cVar.m102161l2();
            if (l22 == null || (hashSet2 = l22.mo84912m()) == null) {
                hashSet2 = new HashSet();
            }
            uw2.mo84868qc(hashSet2);
        }
        cVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public final C34771d m102161l2() {
        RecyclerView.C1736h adapter = m102162m2().f90420h.getAdapter();
        C41536l.m120487g(adapter, "null cannot be cast to non-null type ge.bog.mobilebank.statements.presentation.statementsfilter.SelectAccountOrCardListAdapter");
        return (C34771d) adapter;
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public final C37645b m102162m2() {
        C37645b bVar = this.f84003G;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* renamed from: n2 */
    private final StatementsFilterViewModel$ViewModel m102163n2() {
        return (StatementsFilterViewModel$ViewModel) this.f84004H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public final void m102164o2(List list) {
        int i = requireArguments().getInt("SELECTOR_TYPE", 1);
        if (i == 1) {
            m102163n2().mo84879zw().mo84866po().mo4819k(this, new C34765d(new C34766e(this, list)));
        } else if (i == 2) {
            m102163n2().mo84879zw().mo84861Xg().mo4819k(this, new C34765d(new C34767f(this, list)));
        }
    }

    private final void observeData() {
        ArrayList arrayList = new ArrayList();
        int i = requireArguments().getInt("SELECTOR_TYPE", 1);
        if (i == 1) {
            mo26370a2(getString(C10328q.statement_chooser_default_account));
            m102163n2().mo84879zw().mo84857J().mo4819k(this, new C34765d(new C34763b(arrayList, this)));
        } else if (i == 2) {
            mo26370a2(getString(C10328q.statement_chooser_default_card));
            m102163n2().mo84879zw().mo84856Im().mo4819k(this, new C34765d(new C34764c(arrayList, this)));
        }
    }

    /* renamed from: p2 */
    private final void m102165p2() {
        m102162m2().f90420h.setLayoutManager(new LinearLayoutManager(getContext()));
        m102162m2().f90420h.mo5351j(new C13364a(C0767a.m2895e(requireContext(), C10320i.f28693kb)));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f84003G = C37645b.m110673d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f84003G = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m102165p2();
        m102158i2();
        observeData();
    }
}

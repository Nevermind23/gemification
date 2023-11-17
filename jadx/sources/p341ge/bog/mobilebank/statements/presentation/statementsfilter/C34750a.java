package p341ge.bog.mobilebank.statements.presentation.statementsfilter;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.C1806i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c50.C19490q;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
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
import n51.C37355a;
import n51.C37358d;
import o51.C37647d;
import p045d.C5769a;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.viewmodel.TransactionCategoriesViewModel;
import ue1.C43064a;
import ue1.C43075l;
import v51.C39201a;
import v51.C39202a0;
import v51.C39203b;
import v51.C39207d;

/* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.a */
public final class C34750a extends C39207d {

    /* renamed from: I */
    public static final C34751a f83989I = new C34751a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private C37647d f83990G;

    /* renamed from: H */
    private final C41217g f83991H = C1514j0.m5374c(this, C41520a0.m120436b(StatementsFilterViewModel$ViewModel.class), new C34756f(this), new C34757g((C43064a) null, this), new C34758h(this));

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.a$a */
    public static final class C34751a {
        private C34751a() {
        }

        public /* synthetic */ C34751a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C34750a mo84897a() {
            return new C34750a();
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.a$b */
    static final class C34752b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34750a f83992d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34752b(C34750a aVar) {
            super(1);
            this.f83992d = aVar;
        }

        /* renamed from: a */
        public final void mo84898a(List list) {
            C34750a aVar = this.f83992d;
            C41536l.m120488h(list, "transactionCategories");
            aVar.m102144m2(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84898a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.a$c */
    static final class C34753c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34750a f83993d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34753c(C34750a aVar) {
            super(1);
            this.f83993d = aVar;
        }

        /* renamed from: a */
        public final void mo84899a(HashSet hashSet) {
            HashSet u;
            C19490q f2 = this.f83993d.m102139h2();
            if (f2 != null && (u = f2.mo47727u()) != null) {
                C41536l.m120488h(hashSet, "categoriesList");
                ArrayList arrayList = new ArrayList(C41343r.m119925u(hashSet, 10));
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) ((C41224m) it.next()).mo95678e()).longValue()));
                }
                u.addAll(C41358y.m120034x0(arrayList));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84899a((HashSet) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.a$d */
    static final class C34754d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f83994a;

        C34754d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f83994a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f83994a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f83994a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.a$e */
    static final class C34755e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19490q f83995d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34755e(C19490q qVar) {
            super(1);
            this.f83995d = qVar;
        }

        /* renamed from: a */
        public final void mo84902a(String str) {
            C41536l.m120489i(str, "changed");
            this.f83995d.mo47726t(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84902a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.a$f */
    public static final class C34756f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f83996d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34756f(Fragment fragment) {
            super(0);
            this.f83996d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f83996d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.a$g */
    public static final class C34757g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f83997d;

        /* renamed from: e */
        final /* synthetic */ Fragment f83998e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34757g(C43064a aVar, Fragment fragment) {
            super(0);
            this.f83997d = aVar;
            this.f83998e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f83997d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f83998e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.a$h */
    public static final class C34758h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f83999d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34758h(Fragment fragment) {
            super(0);
            this.f83999d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f83999d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public final C19490q m102139h2() {
        RecyclerView.C1736h adapter = m102140i2().f90440h.getAdapter();
        if (adapter instanceof C19490q) {
            return (C19490q) adapter;
        }
        return null;
    }

    /* renamed from: i2 */
    private final C37647d m102140i2() {
        C37647d dVar = this.f83990G;
        C41536l.m120486f(dVar);
        return dVar;
    }

    /* renamed from: j2 */
    private final StatementsFilterViewModel$ViewModel m102141j2() {
        return (StatementsFilterViewModel$ViewModel) this.f83991H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m102142k2(C34750a aVar, View view) {
        HashSet u;
        C41536l.m120489i(aVar, "this$0");
        C19490q h2 = aVar.m102139h2();
        if (!(h2 == null || (u = h2.mo47727u()) == null)) {
            u.clear();
        }
        RecyclerView.C1736h adapter = aVar.m102140i2().f90440h.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        aVar.m102141j2().mo84874uw().mo84855Gl(new HashSet());
        aVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final void m102143l2(C34750a aVar, View view) {
        HashSet hashSet;
        C41536l.m120489i(aVar, "this$0");
        C39202a0 uw = aVar.m102141j2().mo84874uw();
        C19490q h2 = aVar.m102139h2();
        if (h2 == null || (hashSet = h2.mo47727u()) == null) {
            hashSet = new HashSet();
        }
        uw.mo84855Gl(hashSet);
        aVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public final void m102144m2(List list) {
        RecyclerView recyclerView = m102140i2().f90440h;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        Drawable b = C5769a.m23210b(recyclerView.getContext(), C37355a.f89809b);
        if (b != null) {
            C41536l.m120488h(b, "requireNotNull(\n        …ivider_1dp)\n            )");
            C1806i iVar = new C1806i(recyclerView.getContext(), 1);
            iVar.mo5985l(b);
            recyclerView.mo5351j(iVar);
            C19490q qVar = new C19490q(false, Boolean.FALSE, (TransactionCategoriesViewModel) null);
            qVar.mo47722C(list);
            recyclerView.setAdapter(qVar);
            m102140i2().f90441i.setOnTextChangeListener(new C34755e(qVar));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f83990G = C37647d.m110681d(layoutInflater, viewGroup, true);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26370a2(getString(C37358d.statements_categories_action_sheet_title));
        m102140i2().f90437e.setOnClickListener(new C39201a(this));
        m102140i2().f90438f.setOnClickListener(new C39203b(this));
        m102141j2().mo84879zw().mo84851C1().mo4819k(this, new C34754d(new C34752b(this)));
        m102141j2().mo84879zw().mo84864hu().mo4819k(this, new C34754d(new C34753c(this)));
    }
}

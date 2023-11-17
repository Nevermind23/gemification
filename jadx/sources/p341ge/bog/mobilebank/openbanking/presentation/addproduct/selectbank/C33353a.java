package p341ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank;

import android.graphics.drawable.Drawable;
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
import androidx.recyclerview.widget.C1806i;
import androidx.recyclerview.widget.RecyclerView;
import b41.C31128a;
import bv0.C31203c;
import ev0.C31828i;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import iu0.C36546y;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import lv0.C37158b;
import lv0.C37160c;
import lv0.C37167j;
import p045d.C5769a;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.openbanking.presentation.BankUiModel;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.a */
public final class C33353a extends C33372c {

    /* renamed from: g */
    private C31828i f81499g;

    /* renamed from: h */
    private final C41217g f81500h;

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.a$a */
    static final class C33354a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33353a f81501d;

        /* renamed from: e */
        final /* synthetic */ C37158b f81502e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33354a(C33353a aVar, C37158b bVar) {
            super(1);
            this.f81501d = aVar;
            this.f81502e = bVar;
        }

        /* renamed from: a */
        public final void mo79188a(C31128a aVar) {
            if (aVar instanceof C31128a.C31131c) {
                this.f81501d.m98070l1().mo3946b().mo53595c();
                this.f81502e.mo90151j((List) ((C31128a.C31131c) aVar).mo71340a());
            } else if (aVar instanceof C31128a.C31129a) {
                this.f81501d.m98070l1().mo3946b().mo53596d();
            } else if (aVar instanceof C31128a.C31130b) {
                this.f81501d.m98070l1().mo3946b().mo53597e();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79188a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.a$b */
    static final class C33355b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33353a f81503d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33355b(C33353a aVar) {
            super(1);
            this.f81503d = aVar;
        }

        /* renamed from: a */
        public final void mo79189a(C37167j jVar) {
            C41536l.m120489i(jVar, "it");
            this.f81503d.m98071m1().mo79178hw().mo79174Qs(new BankUiModel(jVar.mo90160b(), jVar.mo90162d(), jVar.mo90159a(), jVar.mo90163e()));
            C36546y.m108282F().mo27152s("open_banking", jVar.mo90159a(), "click_bank");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79189a((C37167j) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.a$c */
    static final class C33356c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f81504a;

        C33356c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f81504a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f81504a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f81504a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.a$d */
    public static final class C33357d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f81505d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33357d(C43064a aVar) {
            super(0);
            this.f81505d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f81505d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.a$e */
    public static final class C33358e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f81506d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33358e(C41217g gVar) {
            super(0);
            this.f81506d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f81506d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.a$f */
    public static final class C33359f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f81507d;

        /* renamed from: e */
        final /* synthetic */ C41217g f81508e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33359f(C43064a aVar, C41217g gVar) {
            super(0);
            this.f81507d = aVar;
            this.f81508e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f81507d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f81508e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.a$g */
    public static final class C33360g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f81509d;

        /* renamed from: e */
        final /* synthetic */ C41217g f81510e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33360g(Fragment fragment, C41217g gVar) {
            super(0);
            this.f81509d = fragment;
            this.f81510e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f81510e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f81509d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.a$h */
    static final class C33361h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C33353a f81511d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33361h(C33353a aVar) {
            super(0);
            this.f81511d = aVar;
        }

        public final C1638u0 invoke() {
            Fragment requireParentFragment = this.f81511d.requireParentFragment();
            C41536l.m120488h(requireParentFragment, "requireParentFragment()");
            return requireParentFragment;
        }
    }

    public C33353a() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C33357d(new C33361h(this)));
        this.f81500h = C1514j0.m5374c(this, C41520a0.m120436b(SelectBankViewModel$ViewModel.class), new C33358e(a), new C33359f((C43064a) null, a), new C33360g(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public final C31828i m98070l1() {
        C31828i iVar = this.f81499g;
        C41536l.m120486f(iVar);
        return iVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public final SelectBankViewModel$ViewModel m98071m1() {
        return (SelectBankViewModel$ViewModel) this.f81500h.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public static final void m98072n1(C33353a aVar, View view) {
        C41536l.m120489i(aVar, "this$0");
        aVar.m98071m1().onRefresh(6);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f81499g = C31828i.m94102d(layoutInflater, viewGroup, false);
        StateView c = m98070l1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f81499g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m98071m1().mo79178hw().mo79185uc();
        C37158b bVar = new C37158b();
        bVar.mo90152k(new C33355b(this));
        m98070l1().f78506e.setAdapter(bVar);
        RecyclerView recyclerView = m98070l1().f78506e;
        C1806i iVar = new C1806i(getContext(), 1);
        Drawable b = C5769a.m23210b(requireContext(), C31203c.f77508g);
        C41536l.m120486f(b);
        iVar.mo5985l(b);
        recyclerView.mo5351j(iVar);
        m98070l1().f78508g.setOnClickListener(new C37160c(this));
        m98071m1().mo79182lw().mo79183oo().mo4819k(getViewLifecycleOwner(), new C33356c(new C33354a(this, bVar)));
    }
}

package p580qn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.LiveData;
import g91.C32303f;
import g91.C32343x;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardBenefitUiModel;
import p341ge.bog.mobilebank.cardproducts.presentation.carddetail.actionsheet.CardBenefitsViewModel$ViewModel;
import p349ah.C9860d;
import p426fn.C12928b;
import p482jn.C16248a;
import p594rn.C17677b;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: qn.a */
public final class C17540a extends C9860d {

    /* renamed from: F */
    public static final C17541a f49092F = new C17541a((DefaultConstructorMarker) null);

    /* renamed from: B */
    private C16248a f49093B;

    /* renamed from: C */
    private final C41217g f49094C;

    /* renamed from: D */
    private final C41217g f49095D = C41219i.m119470b(new C17542b(this));

    /* renamed from: E */
    private final C41217g f49096E = C41219i.m119470b(new C17543c(this));

    /* renamed from: qn.a$a */
    public static final class C17541a {
        private C17541a() {
        }

        public /* synthetic */ C17541a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C17540a mo45087a(List list) {
            C41536l.m120489i(list, "benefits");
            C17540a aVar = new C17540a();
            aVar.setArguments(C0908e.m3336b(C41233s.m119492a("ARG_BENEFITS", list)));
            return aVar;
        }
    }

    /* renamed from: qn.a$b */
    static final class C17542b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C17540a f49097d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17542b(C17540a aVar) {
            super(0);
            this.f49097d = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m61104c(C17540a aVar, CardBenefitUiModel cardBenefitUiModel) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(cardBenefitUiModel, "benefit");
            aVar.m61097h2().mo40111dw().mo40113sl(cardBenefitUiModel);
        }

        /* renamed from: b */
        public final C17677b invoke() {
            return new C17677b(new C17550b(this.f49097d));
        }
    }

    /* renamed from: qn.a$c */
    static final class C17543c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C17540a f49098d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17543c(C17540a aVar) {
            super(0);
            this.f49098d = aVar;
        }

        /* renamed from: b */
        public final C13364a invoke() {
            return new C13364a(C0767a.m2895e(this.f49098d.requireContext(), C12928b.f38172m));
        }
    }

    /* renamed from: qn.a$d */
    static final class C17544d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C17540a f49099d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17544d(C17540a aVar) {
            super(1);
            this.f49099d = aVar;
        }

        /* renamed from: a */
        public final void mo45090a(CardBenefitUiModel cardBenefitUiModel) {
            C41536l.m120489i(cardBenefitUiModel, "benefit");
            C32303f.m95184D(cardBenefitUiModel.mo39379b(), this.f49099d.requireContext());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45090a((CardBenefitUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: qn.a$e */
    public static final class C17545e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f49100d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17545e(Fragment fragment) {
            super(0);
            this.f49100d = fragment;
        }

        public final Fragment invoke() {
            return this.f49100d;
        }
    }

    /* renamed from: qn.a$f */
    public static final class C17546f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f49101d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17546f(C43064a aVar) {
            super(0);
            this.f49101d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f49101d.invoke();
        }
    }

    /* renamed from: qn.a$g */
    public static final class C17547g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f49102d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17547g(C41217g gVar) {
            super(0);
            this.f49102d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f49102d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: qn.a$h */
    public static final class C17548h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f49103d;

        /* renamed from: e */
        final /* synthetic */ C41217g f49104e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17548h(C43064a aVar, C41217g gVar) {
            super(0);
            this.f49103d = aVar;
            this.f49104e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f49103d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f49104e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: qn.a$i */
    public static final class C17549i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f49105d;

        /* renamed from: e */
        final /* synthetic */ C41217g f49106e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17549i(Fragment fragment, C41217g gVar) {
            super(0);
            this.f49105d = fragment;
            this.f49106e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f49106e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f49105d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C17540a() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C17546f(new C17545e(this)));
        this.f49094C = C1514j0.m5374c(this, C41520a0.m120436b(CardBenefitsViewModel$ViewModel.class), new C17547g(a), new C17548h((C43064a) null, a), new C17549i(this, a));
    }

    /* renamed from: e2 */
    private final C17677b m61094e2() {
        return (C17677b) this.f49095D.getValue();
    }

    /* renamed from: f2 */
    private final C16248a m61095f2() {
        C16248a aVar = this.f49093B;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* renamed from: g2 */
    private final C13364a m61096g2() {
        return (C13364a) this.f49096E.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public final CardBenefitsViewModel$ViewModel m61097h2() {
        return (CardBenefitsViewModel$ViewModel) this.f49094C.getValue();
    }

    /* renamed from: i2 */
    private final void m61098i2() {
        LiveData St = m61097h2().mo40112ew().mo40110St();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(St, viewLifecycleOwner, new C17544d(this));
    }

    /* renamed from: j2 */
    private final void m61099j2() {
        List list;
        C16248a f2 = m61095f2();
        mo26370a2(C32343x.m95388F("cards.detalis.advantages.actionsheet.title", new Object[0]));
        f2.f46018e.setAdapter(m61094e2());
        f2.f46018e.mo5351j(m61096g2());
        Bundle arguments = getArguments();
        if (arguments != null) {
            list = arguments.getParcelableArrayList("ARG_BENEFITS");
        } else {
            list = null;
        }
        if (list == null) {
            list = C41341q.m119907j();
        }
        m61100k2(list);
    }

    /* renamed from: k2 */
    private final void m61100k2(List list) {
        m61094e2().mo6029i(list);
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f49093B = C16248a.m57927d(layoutInflater, viewGroup, true);
        m61099j2();
        m61098i2();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f49093B = null;
    }
}

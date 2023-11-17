package p341ge.bog.mobilebank.payments.presentation.categories;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0152h;
import androidx.activity.C0160p;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.C1645y;
import cx0.C31456c;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import java.util.List;
import jx0.C36821g;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import m41.C37223a;
import ox0.C37833c;
import p341ge.bog.designsystem.components.search.SearchView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.payments.presentation.categories.C33649b;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import px0.C38026a;
import px0.C38027b;
import px0.C38035e;
import sx0.C38566a;
import u61.C39033a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.payments.presentation.categories.a */
public abstract class C33635a extends C33666e {

    /* renamed from: g */
    private C36821g f82022g;

    /* renamed from: h */
    private final C41217g f82023h = C41219i.m119470b(new C33636a(this));

    /* renamed from: ge.bog.mobilebank.payments.presentation.categories.a$a */
    static final class C33636a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C33635a f82024d;

        /* renamed from: ge.bog.mobilebank.payments.presentation.categories.a$a$a */
        /* synthetic */ class C33637a implements C38566a.C38567a, C41532h {

            /* renamed from: a */
            final /* synthetic */ C33635a f82025a;

            C33637a(C33635a aVar) {
                this.f82025a = aVar;
            }

            /* renamed from: a */
            public final void mo80208a(C31456c cVar) {
                C41536l.m120489i(cVar, "p0");
                this.f82025a.m98781C1(cVar);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C38566a.C38567a) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f82025a, C33635a.class, "onNodePressed", "onNodePressed(Lge/bog/mobilebank/paymentconfiguration/domain/model/PaymentConfigTreeNode;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* renamed from: ge.bog.mobilebank.payments.presentation.categories.a$a$b */
        /* synthetic */ class C33638b implements C38566a.C38568b, C41532h {

            /* renamed from: a */
            final /* synthetic */ C33635a f82026a;

            C33638b(C33635a aVar) {
                this.f82026a = aVar;
            }

            /* renamed from: a */
            public final void mo80211a(C39033a aVar) {
                C41536l.m120489i(aVar, "p0");
                this.f82026a.m98783E1(aVar);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C38566a.C38568b) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f82026a, C33635a.class, "onTemplatePressed", "onTemplatePressed(Lge/bog/mobilebank/templates/domain/models/Template;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33636a(C33635a aVar) {
            super(0);
            this.f82024d = aVar;
        }

        /* renamed from: b */
        public final C38566a invoke() {
            return new C38566a(new C33637a(this.f82024d), new C33638b(this.f82024d));
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.categories.a$b */
    /* synthetic */ class C33639b extends C41535k implements C43075l {
        C33639b(Object obj) {
            super(1, obj, C33635a.class, "handleNavigationEvent", "handleNavigationEvent(Lge/bog/mobilebank/shared2/livedata/Event;)V", 0);
        }

        /* renamed from: b */
        public final void mo80214b(C37223a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C33635a) this.receiver).m98801y1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80214b((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.categories.a$c */
    /* synthetic */ class C33640c extends C41535k implements C43075l {
        C33640c(Object obj) {
            super(1, obj, C33635a.class, "handleErrorEvent", "handleErrorEvent(Lge/bog/mobilebank/shared2/livedata/Event;)V", 0);
        }

        /* renamed from: b */
        public final void mo80215b(C37223a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C33635a) this.receiver).m98800x1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80215b((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.categories.a$d */
    /* synthetic */ class C33641d extends C41535k implements C43075l {
        C33641d(Object obj) {
            super(1, obj, C33635a.class, "applyState", "applyState(Lge/bog/mobilebank/payments/presentation/categories/CategoriesUiState;)V", 0);
        }

        /* renamed from: b */
        public final void mo80216b(C38035e eVar) {
            C41536l.m120489i(eVar, "p0");
            ((C33635a) this.receiver).m98795q1(eVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80216b((C38035e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.categories.a$e */
    static final class C33642e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f82027a;

        C33642e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f82027a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f82027a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f82027a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.categories.a$f */
    static final class C33643f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33635a f82028d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33643f(C33635a aVar) {
            super(1);
            this.f82028d = aVar;
        }

        /* renamed from: a */
        public final void mo80219a(C0152h hVar) {
            C41536l.m120489i(hVar, "$this$addCallback");
            this.f82028d.mo80205v1().mo80230Sw();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80219a((C0152h) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.categories.a$g */
    /* synthetic */ class C33644g extends C41535k implements C43075l {
        C33644g(Object obj) {
            super(1, obj, C33635a.class, "onSearchChanged", "onSearchChanged(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo80220b(String str) {
            C41536l.m120489i(str, "p0");
            ((C33635a) this.receiver).m98782D1(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80220b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.categories.a$h */
    static final class C33645h extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C33645h f82029d = new C33645h();

        C33645h() {
            super(1);
        }

        /* renamed from: a */
        public final void mo80221a(String str) {
            C41536l.m120489i(str, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80221a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.categories.a$i */
    /* synthetic */ class C33646i extends C41535k implements C43075l {
        C33646i(Object obj) {
            super(1, obj, C33635a.class, "onSearchChanged", "onSearchChanged(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo80222b(String str) {
            C41536l.m120489i(str, "p0");
            ((C33635a) this.receiver).m98782D1(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80222b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.categories.a$j */
    static final class C33647j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33635a f82030d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33647j(C33635a aVar) {
            super(1);
            this.f82030d = aVar;
        }

        /* renamed from: a */
        public final void mo80223a(boolean z) {
            if (z) {
                this.f82030d.mo80205v1().mo80228Pw("payment_tree", "search", "click");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80223a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.categories.a$k */
    static final class C33648k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C33635a f82031d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33648k(C33635a aVar) {
            super(0);
            this.f82031d = aVar;
        }

        public final void invoke() {
            this.f82031d.mo80205v1().mo80228Pw("payment_tree", "cancel_search", "click");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public final void m98781C1(C31456c cVar) {
        mo80205v1().mo80231Uw(cVar, m98799u1().f88858g.computeVerticalScrollOffset());
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public final void m98782D1(String str) {
        mo80205v1().mo80233Ww(str, m98799u1().f88858g.computeVerticalScrollOffset());
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public final void m98783E1(C39033a aVar) {
        C33653c v1 = mo80205v1();
        String e = aVar.mo92701e();
        if (e == null) {
            e = "";
        }
        v1.mo80229Qw(e);
        mo80203A1(aVar);
    }

    /* renamed from: F1 */
    private final void m98784F1() {
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        C41536l.m120488h(onBackPressedDispatcher, "requireActivity().onBackPressedDispatcher");
        C0160p.m420b(onBackPressedDispatcher, getViewLifecycleOwner(), false, new C33643f(this), 2, (Object) null);
        m98799u1().f88858g.setAdapter(m98798t1());
        m98799u1().f88860i.mo53597e();
        m98799u1().f88859h.setHint(C34646b.m101752f(C37833c.f90838a.mo91143e(), (Context) null, 1, (Object) null));
        m98799u1().f88859h.setOnTextChangeListener(new C33644g(this));
    }

    /* renamed from: G1 */
    private final void m98785G1() {
        m98799u1().f88860i.mo53595c();
    }

    /* renamed from: H1 */
    private final void m98786H1(String str) {
        SearchView searchView = m98799u1().f88859h;
        searchView.setOnTextChangeListener(C33645h.f82029d);
        searchView.setInputText(str);
        searchView.setOnTextChangeListener(new C33646i(this));
        searchView.setOnFocusChangeListener(new C33647j(this));
        searchView.setCancelButtonListener(new C33648k(this));
    }

    private final void observeData() {
        C33653c v1 = mo80205v1();
        v1.mo80235me().mo4819k(getViewLifecycleOwner(), new C33642e(new C33639b(this)));
        v1.mo80236o3().mo4819k(getViewLifecycleOwner(), new C33642e(new C33640c(this)));
        v1.getState().mo4819k(getViewLifecycleOwner(), new C33642e(new C33641d(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public final void m98795q1(C38035e eVar) {
        boolean z;
        m98786H1(eVar.mo91411d());
        C38566a t1 = m98798t1();
        if (eVar.mo91411d().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        t1.mo92164k((List) null, z, new C38026a(this, eVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m98796r1(C33635a aVar, C38035e eVar) {
        boolean z;
        C41536l.m120489i(aVar, "this$0");
        C41536l.m120489i(eVar, "$state");
        C38566a t1 = aVar.m98798t1();
        List B0 = C41358y.m119991B0(eVar.mo91408a());
        if (eVar.mo91411d().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        t1.mo92164k(B0, z, new C38027b(aVar, eVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m98797s1(C33635a aVar, C38035e eVar) {
        String string;
        C41536l.m120489i(aVar, "this$0");
        C41536l.m120489i(eVar, "$state");
        aVar.m98799u1().f88858g.scrollBy(0, eVar.mo91410c());
        Bundle arguments = aVar.getArguments();
        C41238w wVar = null;
        if (!(arguments == null || (string = arguments.getString("CAT_ID")) == null)) {
            Bundle arguments2 = aVar.getArguments();
            if (arguments2 != null) {
                arguments2.clear();
            }
            aVar.mo80205v1().mo80232Vw((C31456c) null, string);
            wVar = C41238w.f97225a;
        }
        if (wVar == null) {
            aVar.m98785G1();
        }
    }

    /* renamed from: t1 */
    private final C38566a m98798t1() {
        return (C38566a) this.f82023h.getValue();
    }

    /* renamed from: u1 */
    private final C36821g m98799u1() {
        C36821g gVar = this.f82022g;
        C41536l.m120486f(gVar);
        return gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public final void m98800x1(C37223a aVar) {
        Throwable th = (Throwable) aVar.mo90296a();
        if (th != null) {
            handleError(th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public final void m98801y1(C37223a aVar) {
        C33649b bVar = (C33649b) aVar.mo90296a();
        if (bVar != null) {
            m98785G1();
            if (bVar instanceof C33649b.C33650a) {
                requireActivity().finish();
            } else if (bVar instanceof C33649b.C33651b) {
                mo80206z1(((C33649b.C33651b) bVar).mo80224a());
            } else if (bVar instanceof C33649b.C33652c) {
                mo80204B1();
            }
        }
    }

    /* renamed from: A1 */
    public abstract void mo80203A1(C39033a aVar);

    /* renamed from: B1 */
    public abstract void mo80204B1();

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f82022g = C36821g.m109098d(layoutInflater, viewGroup, false);
        StateView c = m98799u1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f82022g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m98784F1();
        observeData();
    }

    /* renamed from: v1 */
    public abstract C33653c mo80205v1();

    /* renamed from: z1 */
    public abstract void mo80206z1(C31456c cVar);
}

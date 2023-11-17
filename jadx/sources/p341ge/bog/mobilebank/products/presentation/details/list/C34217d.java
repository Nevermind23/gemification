package p341ge.bog.mobilebank.products.presentation.details.list;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.RecyclerView;
import b41.C31128a;
import b41.C31132b;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import hy0.C36269c;
import iy0.C36632s;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import pz0.C38072v;
import sz0.C38617e;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.products.presentation.details.list.d */
public final class C34217d extends C34214b {

    /* renamed from: k */
    public static final C34218a f83070k = new C34218a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C36632s f83071g;

    /* renamed from: h */
    private final C41217g f83072h = C1514j0.m5374c(this, C41520a0.m120436b(C38072v.class), new C34229j(this), new C34230k((C43064a) null, this), new C34231l(this));

    /* renamed from: i */
    private final C41217g f83073i = C41219i.m119470b(new C34219b(this));

    /* renamed from: j */
    private final C41217g f83074j = C41219i.m119470b(new C34223d(this));

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.d$a */
    public static final class C34218a {
        private C34218a() {
        }

        public /* synthetic */ C34218a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C34217d mo82581a(C38617e eVar) {
            C41536l.m120489i(eVar, "type");
            C34217d dVar = new C34217d();
            dVar.setArguments(C0908e.m3336b(C41233s.m119492a("ARG_LIST_TYPE", eVar)));
            return dVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.d$b */
    static final class C34219b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C34217d f83075d;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.list.d$b$a */
        /* synthetic */ class C34220a extends C41535k implements C43079p {
            C34220a(Object obj) {
                super(2, obj, C38072v.class, "onProductItemClicked", "onProductItemClicked(JI)V", 0);
            }

            /* renamed from: b */
            public final void mo82583b(long j, int i) {
                ((C38072v) this.receiver).mo91487Iw(j, i);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo82583b(((Number) obj).longValue(), ((Number) obj2).intValue());
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.list.d$b$b */
        /* synthetic */ class C34221b extends C41535k implements C43064a {
            C34221b(Object obj) {
                super(0, obj, C38072v.class, "onNewProductClicked", "onNewProductClicked()V", 0);
            }

            /* renamed from: b */
            public final void mo82584b() {
                ((C38072v) this.receiver).mo91486Hw();
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                mo82584b();
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34219b(C34217d dVar) {
            super(0);
            this.f83075d = dVar;
        }

        /* renamed from: b */
        public final C34232e invoke() {
            return new C34232e(new C34220a(this.f83075d.m100662s1()), new C34221b(this.f83075d.m100662s1()));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.d$c */
    /* synthetic */ class C34222c extends C41535k implements C43075l {
        C34222c(Object obj) {
            super(1, obj, C34217d.class, "onListResult", "onListResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo82585b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C34217d) this.receiver).m100663t1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82585b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.d$d */
    static final class C34223d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C34217d f83076d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34223d(C34217d dVar) {
            super(0);
            this.f83076d = dVar;
        }

        /* renamed from: b */
        public final C38617e invoke() {
            Bundle arguments = this.f83076d.getArguments();
            C38617e eVar = null;
            Object serializable = arguments != null ? arguments.getSerializable("ARG_LIST_TYPE") : null;
            if (serializable instanceof C38617e) {
                eVar = (C38617e) serializable;
            }
            return eVar == null ? C38617e.MY_LOANS : eVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.d$e */
    static final class C34224e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34217d f83077d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34224e(C34217d dVar) {
            super(1);
            this.f83077d = dVar;
        }

        /* renamed from: a */
        public final void mo82587a(List list) {
            C34217d.m100664u1(this.f83077d, true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82587a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.d$f */
    static final class C34225f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34217d f83078d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34225f(C34217d dVar) {
            super(1);
            this.f83078d = dVar;
        }

        /* renamed from: a */
        public final void mo82588a(List list) {
            C41536l.m120489i(list, "it");
            C34217d.m100664u1(this.f83078d, false);
            this.f83078d.m100659p1().mo82592j(this.f83078d.m100658o1(list));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82588a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.d$g */
    static final class C34226g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34217d f83079d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34226g(C34217d dVar) {
            super(1);
            this.f83079d = dVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C34217d.m100664u1(this.f83079d, false);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.d$h */
    static final class C34227h implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f83080a;

        C34227h(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f83080a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f83080a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f83080a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.d$i */
    public static final class C34228i extends RecyclerView.C1746o {

        /* renamed from: a */
        final /* synthetic */ C34217d f83081a;

        C34228i(C34217d dVar) {
            this.f83081a = dVar;
        }

        /* renamed from: e */
        public void mo5615e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
            C41536l.m120489i(rect, "outRect");
            C41536l.m120489i(view, "view");
            C41536l.m120489i(recyclerView, "parent");
            C41536l.m120489i(b0Var, "state");
            super.mo5615e(rect, view, recyclerView, b0Var);
            Resources resources = this.f83081a.getResources();
            int i = C36269c.f87461b;
            rect.top = resources.getDimensionPixelSize(i);
            rect.bottom = this.f83081a.getResources().getDimensionPixelSize(i);
            Resources resources2 = this.f83081a.getResources();
            int i2 = C36269c.f87460a;
            rect.right = resources2.getDimensionPixelSize(i2);
            rect.left = this.f83081a.getResources().getDimensionPixelSize(i2);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.d$j */
    public static final class C34229j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f83082d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34229j(Fragment fragment) {
            super(0);
            this.f83082d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f83082d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.d$k */
    public static final class C34230k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f83083d;

        /* renamed from: e */
        final /* synthetic */ Fragment f83084e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34230k(C43064a aVar, Fragment fragment) {
            super(0);
            this.f83083d = aVar;
            this.f83084e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f83083d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f83084e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.d$l */
    public static final class C34231l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f83085d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34231l(Fragment fragment) {
            super(0);
            this.f83085d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f83085d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: n1 */
    private final void m100657n1() {
        m100662s1().mo91482Cw().mo91475f2().mo4819k(getViewLifecycleOwner(), new C34227h(new C34222c(this)));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
        if ((((p341ge.bog.designsystem.components.productcards.LoanCardView.C13467c) r3.mo82604a()).mo36550g() instanceof p341ge.bog.designsystem.components.productcards.LoanCardView.C13465a) != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        if ((((p341ge.bog.designsystem.components.productcards.LoanCardView.C13467c) r3.mo82604a()).mo36550g() instanceof p341ge.bog.designsystem.components.productcards.LoanCardView.C13465a) == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        if ((r2 instanceof p341ge.bog.mobilebank.products.presentation.details.list.C34242f.C34244b) == false) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0009 A[SYNTHETIC] */
    /* renamed from: o1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List m100658o1(java.util.List r8) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0009:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0073
            java.lang.Object r1 = r8.next()
            r2 = r1
            ge.bog.mobilebank.products.presentation.details.list.f r2 = (p341ge.bog.mobilebank.products.presentation.details.list.C34242f) r2
            boolean r3 = r2 instanceof p341ge.bog.mobilebank.products.presentation.details.list.C34242f.C34245c
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0054
            r3 = r2
            ge.bog.mobilebank.products.presentation.details.list.f$c r3 = (p341ge.bog.mobilebank.products.presentation.details.list.C34242f.C34245c) r3
            java.lang.Object r6 = r3.mo82604a()
            boolean r6 = r6 instanceof p341ge.bog.designsystem.components.productcards.LoanCardView.C13467c
            if (r6 == 0) goto L_0x0054
            sz0.e r2 = r7.m100661r1()
            sz0.e r6 = sz0.C38617e.COSIGNER
            if (r2 != r6) goto L_0x003d
            java.lang.Object r2 = r3.mo82604a()
            ge.bog.designsystem.components.productcards.LoanCardView$c r2 = (p341ge.bog.designsystem.components.productcards.LoanCardView.C13467c) r2
            ge.bog.designsystem.components.productcards.LoanCardView$d r2 = r2.mo36550g()
            boolean r2 = r2 instanceof p341ge.bog.designsystem.components.productcards.LoanCardView.C13465a
            if (r2 != 0) goto L_0x006c
        L_0x003d:
            sz0.e r2 = r7.m100661r1()
            sz0.e r6 = sz0.C38617e.MY_LOANS
            if (r2 != r6) goto L_0x006d
            java.lang.Object r2 = r3.mo82604a()
            ge.bog.designsystem.components.productcards.LoanCardView$c r2 = (p341ge.bog.designsystem.components.productcards.LoanCardView.C13467c) r2
            ge.bog.designsystem.components.productcards.LoanCardView$d r2 = r2.mo36550g()
            boolean r2 = r2 instanceof p341ge.bog.designsystem.components.productcards.LoanCardView.C13465a
            if (r2 != 0) goto L_0x006d
            goto L_0x006c
        L_0x0054:
            sz0.e r3 = r7.m100661r1()
            sz0.e r6 = sz0.C38617e.MY_LOANS
            if (r3 != r6) goto L_0x0061
            boolean r2 = r2 instanceof p341ge.bog.mobilebank.products.presentation.details.list.C34242f.C34244b
            if (r2 != 0) goto L_0x006d
            goto L_0x006c
        L_0x0061:
            sz0.e r3 = r7.m100661r1()
            sz0.e r4 = sz0.C38617e.COSIGNER
            if (r3 != r4) goto L_0x006c
            boolean r4 = r2 instanceof p341ge.bog.mobilebank.products.presentation.details.list.C34242f.C34244b
            goto L_0x006d
        L_0x006c:
            r4 = r5
        L_0x006d:
            if (r4 == 0) goto L_0x0009
            r0.add(r1)
            goto L_0x0009
        L_0x0073:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.details.list.C34217d.m100658o1(java.util.List):java.util.List");
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public final C34232e m100659p1() {
        return (C34232e) this.f83073i.getValue();
    }

    /* renamed from: q1 */
    private final C36632s m100660q1() {
        C36632s sVar = this.f83071g;
        C41536l.m120486f(sVar);
        return sVar;
    }

    /* renamed from: r1 */
    private final C38617e m100661r1() {
        return (C38617e) this.f83074j.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public final C38072v m100662s1() {
        return (C38072v) this.f83072h.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public final void m100663t1(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C34224e(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C34225f(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C34226g(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m100664u1(C34217d dVar, boolean z) {
        RecyclerView recyclerView = dVar.m100660q1().f88414e;
        C41536l.m120488h(recyclerView, "binding.loansRecycler");
        C32343x.m95483r1(recyclerView, !z, false, 2, (Object) null);
    }

    /* renamed from: v1 */
    private final void m100665v1() {
        m100660q1().f88414e.setAdapter(m100659p1());
        m100660q1().f88414e.mo5351j(new C34228i(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f83071g = C36632s.m108664d(layoutInflater, viewGroup, false);
        RecyclerView c = m100660q1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m100665v1();
        m100657n1();
    }
}

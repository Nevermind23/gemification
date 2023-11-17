package p341ge.bog.mobilebank.p975ui.fragments;

import g91.C32343x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10324m;
import p366bk.C10328q;

/* renamed from: ge.bog.mobilebank.ui.fragments.k0 */
public final class C35635k0 extends C35651n1 {

    /* renamed from: d */
    public static final C35636a f86173d = new C35636a((DefaultConstructorMarker) null);

    /* renamed from: ge.bog.mobilebank.ui.fragments.k0$a */
    public static final class C35636a {
        private C35636a() {
        }

        public /* synthetic */ C35636a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ C35635k0 m105843c(C35636a aVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return aVar.mo86722b(z);
        }

        /* renamed from: a */
        public final C35635k0 mo86721a() {
            return m105843c(this, false, 1, (Object) null);
        }

        /* renamed from: b */
        public final C35635k0 mo86722b(boolean z) {
            C35635k0 k0Var = new C35635k0();
            k0Var.setViewPagerFragment(z);
            return k0Var;
        }
    }

    public C35635k0() {
        super(C10324m.fragment_unauthorized_payments_dummy);
    }

    /* renamed from: i1 */
    public static final C35635k0 m105841i1() {
        return f86173d.mo86721a();
    }

    /* renamed from: j1 */
    public static final C35635k0 m105842j1(boolean z) {
        return f86173d.mo86722b(z);
    }

    public String getHeaderText() {
        return C32343x.m95452h0(C10328q.header_text_statement, new Object[0]);
    }
}

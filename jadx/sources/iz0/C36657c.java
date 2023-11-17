package iz0;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import com.google.android.material.bottomsheet.C4956a;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import iy0.C36587d;
import iz0.C36679l;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import o31.C37588a0;
import p163m0.C7047a;
import ue1.C43064a;
import ue1.C43075l;
import xy0.C39945i;

/* renamed from: iz0.c */
public final class C36657c extends C36689n {

    /* renamed from: Q */
    public static final C36658a f88477Q = new C36658a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C36587d f88478K;

    /* renamed from: L */
    public C36679l.C36683c f88479L;

    /* renamed from: M */
    private final C41217g f88480M;

    /* renamed from: N */
    private final C41217g f88481N = C41219i.m119470b(new C36662e(this));

    /* renamed from: O */
    private final C41217g f88482O = C41219i.m119470b(new C36663f(this));

    /* renamed from: P */
    private String f88483P = C32343x.m95388F("texts.child.mbank.parent.permission.header", new Object[0]);

    /* renamed from: iz0.c$a */
    public static final class C36658a {
        private C36658a() {
        }

        public /* synthetic */ C36658a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C36657c mo89486a(String str, String str2, long j) {
            C41536l.m120489i(str, "requestCode");
            C41536l.m120489i(str2, "resultCode");
            C36657c cVar = new C36657c();
            Bundle bundle = new Bundle();
            bundle.putString("REQUEST_KEY", str);
            bundle.putString("RESULT_KEY", str2);
            bundle.putLong("CHILD_CLIENT_KEY", j);
            cVar.setArguments(bundle);
            return cVar;
        }
    }

    /* renamed from: iz0.c$b */
    static final class C36659b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36657c f88484d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36659b(C36657c cVar) {
            super(1);
            this.f88484d = cVar;
        }

        /* renamed from: a */
        public final void mo89487a(C31128a aVar) {
            if (aVar instanceof C31128a.C31130b) {
                this.f88484d.m108764p2(true);
            } else if (aVar instanceof C31128a.C31131c) {
                this.f88484d.m108764p2(false);
                this.f88484d.m108760k2().f88167f.setText(((C39945i) ((C31128a.C31131c) aVar).mo71340a()).mo93719a());
                this.f88484d.m108760k2().f88166e.setEnabled(true);
            } else if (aVar instanceof C31128a.C31129a) {
                this.f88484d.handleError(((C31128a.C31129a) aVar).mo71342c());
                CardView cardView = this.f88484d.m108760k2().f88171j;
                C41536l.m120488h(cardView, "binding.retryButtonContainer");
                C32343x.m95447f1(cardView);
                this.f88484d.m108764p2(false);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89487a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: iz0.c$c */
    static final class C36660c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36657c f88485d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36660c(C36657c cVar) {
            super(1);
            this.f88485d = cVar;
        }

        /* renamed from: a */
        public final void mo89488a(C31128a aVar) {
            if (aVar instanceof C31128a.C31129a) {
                this.f88485d.m108764p2(false);
                this.f88485d.handleError(((C31128a.C31129a) aVar).mo71342c());
            } else if (aVar instanceof C31128a.C31130b) {
                this.f88485d.m108764p2(true);
            } else if (aVar instanceof C31128a.C31131c) {
                this.f88485d.m108764p2(false);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89488a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: iz0.c$d */
    static final class C36661d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36657c f88486d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36661d(C36657c cVar) {
            super(1);
            this.f88486d = cVar;
        }

        /* renamed from: a */
        public final void mo89489a(C37223a aVar) {
            if (((C41238w) aVar.mo90296a()) != null) {
                this.f88486d.m108759j2();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89489a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: iz0.c$e */
    static final class C36662e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36657c f88487d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36662e(C36657c cVar) {
            super(0);
            this.f88487d = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r0.getString("REQUEST_KEY");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke() {
            /*
                r2 = this;
                iz0.c r0 = r2.f88487d
                android.os.Bundle r0 = r0.getArguments()
                if (r0 == 0) goto L_0x0010
                java.lang.String r1 = "REQUEST_KEY"
                java.lang.String r0 = r0.getString(r1)
                if (r0 != 0) goto L_0x0012
            L_0x0010:
                java.lang.String r0 = ""
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: iz0.C36657c.C36662e.invoke():java.lang.String");
        }
    }

    /* renamed from: iz0.c$f */
    static final class C36663f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36657c f88488d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36663f(C36657c cVar) {
            super(0);
            this.f88488d = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r0.getString("RESULT_KEY");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke() {
            /*
                r2 = this;
                iz0.c r0 = r2.f88488d
                android.os.Bundle r0 = r0.getArguments()
                if (r0 == 0) goto L_0x0010
                java.lang.String r1 = "RESULT_KEY"
                java.lang.String r0 = r0.getString(r1)
                if (r0 != 0) goto L_0x0012
            L_0x0010:
                java.lang.String r0 = ""
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: iz0.C36657c.C36663f.invoke():java.lang.String");
        }
    }

    /* renamed from: iz0.c$g */
    static final class C36664g implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f88489a;

        C36664g(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f88489a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f88489a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f88489a.invoke(obj);
        }
    }

    /* renamed from: iz0.c$h */
    public static final class C36665h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f88490d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36665h(Fragment fragment) {
            super(0);
            this.f88490d = fragment;
        }

        public final Fragment invoke() {
            return this.f88490d;
        }
    }

    /* renamed from: iz0.c$i */
    public static final class C36666i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f88491d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36666i(C43064a aVar) {
            super(0);
            this.f88491d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f88491d.invoke();
        }
    }

    /* renamed from: iz0.c$j */
    public static final class C36667j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f88492d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36667j(C41217g gVar) {
            super(0);
            this.f88492d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f88492d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: iz0.c$k */
    public static final class C36668k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f88493d;

        /* renamed from: e */
        final /* synthetic */ C41217g f88494e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36668k(C43064a aVar, C41217g gVar) {
            super(0);
            this.f88493d = aVar;
            this.f88494e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f88493d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f88494e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: iz0.c$l */
    static final class C36669l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36657c f88495d;

        /* renamed from: iz0.c$l$a */
        static final class C36670a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C36657c f88496d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C36670a(C36657c cVar) {
                super(0);
                this.f88496d = cVar;
            }

            /* renamed from: b */
            public final C36679l invoke() {
                long j;
                C36679l.C36683c l2 = this.f88496d.mo89485l2();
                Bundle arguments = this.f88496d.getArguments();
                if (arguments != null) {
                    j = arguments.getLong("CHILD_CLIENT_KEY");
                } else {
                    j = -1;
                }
                return l2.mo32786a(j);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36669l(C36657c cVar) {
            super(0);
            this.f88495d = cVar;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C36670a(this.f88495d));
        }
    }

    public C36657c() {
        C36669l lVar = new C36669l(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C36666i(new C36665h(this)));
        this.f88480M = C1514j0.m5374c(this, C41520a0.m120436b(C36679l.class), new C36667j(a), new C36668k((C43064a) null, a), lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public final void m108759j2() {
        C1533o.m5445b(this, m108761m2(), C0908e.m3336b(C41233s.m119492a(m108762n2(), Boolean.TRUE)));
        mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public final C36587d m108760k2() {
        C36587d dVar = this.f88478K;
        C41536l.m120486f(dVar);
        return dVar;
    }

    /* renamed from: m2 */
    private final String m108761m2() {
        return (String) this.f88481N.getValue();
    }

    /* renamed from: n2 */
    private final String m108762n2() {
        return (String) this.f88482O.getValue();
    }

    /* renamed from: o2 */
    private final C36679l m108763o2() {
        return (C36679l) this.f88480M.getValue();
    }

    private final void observeData() {
        m108763o2().mo89499rw().mo89494Q1().mo4819k(getViewLifecycleOwner(), new C36664g(new C36659b(this)));
        m108763o2().mo89499rw().mo89493C6().mo4819k(getViewLifecycleOwner(), new C36664g(new C36660c(this)));
        m108763o2().mo89499rw().mo89495mr().mo4819k(getViewLifecycleOwner(), new C36664g(new C36661d(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public final void m108764p2(boolean z) {
        m108760k2().f88169h.setVisibility(z ? 0 : 8);
    }

    /* renamed from: q2 */
    private final void m108765q2() {
        m108760k2().f88166e.setButtonText(C32343x.m95388F("texts.child.mbank.parent.permission.button.label", new Object[0]));
        m108760k2().f88166e.setEnabled(false);
        m108760k2().f88166e.setOnClickListener(new C36655a(this));
        m108760k2().f88170i.mo3946b().setOnClickListener(new C36656b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public static final void m108766r2(C36657c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        cVar.m108763o2().mo89500s2();
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public static final void m108767s2(C36657c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        CardView cardView = cVar.m108760k2().f88171j;
        C41536l.m120488h(cardView, "binding.retryButtonContainer");
        C32343x.m95455i0(cardView);
        cVar.m108763o2().onRefresh(6);
    }

    /* renamed from: Q1 */
    public String mo26364Q1() {
        return this.f88483P;
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f88478K = C36587d.m108475d(layoutInflater, viewGroup, true);
        m108765q2();
        observeData();
    }

    /* renamed from: l2 */
    public final C36679l.C36683c mo89485l2() {
        C36679l.C36683c cVar = this.f88479L;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f88478K = null;
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        Dialog q1 = super.mo710q1(bundle);
        C41536l.m120487g(q1, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        C4956a aVar = (C4956a) q1;
        aVar.mo15614n().mo15596w0(false);
        return aVar;
    }
}

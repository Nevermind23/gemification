package p371bp;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import b41.C31128a;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.mobilebank.categorypackages.presentation.application.terms.C14570a;
import p356ao.C10112d;
import p371bp.C10371l;
import p413eo.C12729b;
import p610sp.C17913e;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: bp.c */
public final class C10349c extends C14570a {

    /* renamed from: O */
    public static final C10350a f29526O = new C10350a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C12729b f29527K;

    /* renamed from: L */
    public C10371l.C10375c f29528L;

    /* renamed from: M */
    private final C41217g f29529M;

    /* renamed from: N */
    private final C41217g f29530N = C41219i.m119470b(C10351b.f29531d);

    /* renamed from: bp.c$a */
    public static final class C10350a {
        private C10350a() {
        }

        public /* synthetic */ C10350a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C10349c mo26981a(String str) {
            C41536l.m120489i(str, "packageName");
            C10349c cVar = new C10349c();
            cVar.setArguments(C0908e.m3336b(C41233s.m119492a("EXTRA_PACKAGE_NAME", str)));
            return cVar;
        }
    }

    /* renamed from: bp.c$b */
    static final class C10351b extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C10351b f29531d = new C10351b();

        C10351b() {
            super(0);
        }

        /* renamed from: b */
        public final C10363f invoke() {
            return new C10363f();
        }
    }

    /* renamed from: bp.c$c */
    /* synthetic */ class C10352c extends C41535k implements C43075l {
        C10352c(Object obj) {
            super(1, obj, C10349c.class, "onSoloCriteriaResult", "onSoloCriteriaResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo26983b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C10349c) this.receiver).m37666n2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo26983b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: bp.c$d */
    static final class C10353d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C10349c f29532d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10353d(C10349c cVar) {
            super(1);
            this.f29532d = cVar;
        }

        /* renamed from: a */
        public final void mo26984a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f29532d.m37667o2();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo26984a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: bp.c$e */
    static final class C10354e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f29533a;

        C10354e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f29533a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f29533a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f29533a.invoke(obj);
        }
    }

    /* renamed from: bp.c$f */
    public static final class C10355f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f29534d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10355f(Fragment fragment) {
            super(0);
            this.f29534d = fragment;
        }

        public final Fragment invoke() {
            return this.f29534d;
        }
    }

    /* renamed from: bp.c$g */
    public static final class C10356g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f29535d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10356g(C43064a aVar) {
            super(0);
            this.f29535d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f29535d.invoke();
        }
    }

    /* renamed from: bp.c$h */
    public static final class C10357h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f29536d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10357h(C41217g gVar) {
            super(0);
            this.f29536d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f29536d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: bp.c$i */
    public static final class C10358i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f29537d;

        /* renamed from: e */
        final /* synthetic */ C41217g f29538e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10358i(C43064a aVar, C41217g gVar) {
            super(0);
            this.f29537d = aVar;
            this.f29538e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f29537d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f29538e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: bp.c$j */
    static final class C10359j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C10349c f29539d;

        /* renamed from: bp.c$j$a */
        static final class C10360a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C10349c f29540d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10360a(C10349c cVar) {
                super(0);
                this.f29540d = cVar;
            }

            /* renamed from: b */
            public final C10371l invoke() {
                C10371l.C10375c j2 = this.f29540d.mo26980j2();
                String string = this.f29540d.requireArguments().getString("EXTRA_PACKAGE_NAME", "");
                C41536l.m120488h(string, "requireArguments().getSt…g(EXTRA_PACKAGE_NAME, \"\")");
                return j2.mo27000a(string);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10359j(C10349c cVar) {
            super(0);
            this.f29539d = cVar;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C10360a(this.f29539d));
        }
    }

    public C10349c() {
        C10359j jVar = new C10359j(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C10356g(new C10355f(this)));
        this.f29529M = C1514j0.m5374c(this, C41520a0.m120436b(C10371l.class), new C10357h(a), new C10358i((C43064a) null, a), jVar);
    }

    /* renamed from: h2 */
    private final C10363f m37661h2() {
        return (C10363f) this.f29530N.getValue();
    }

    /* renamed from: i2 */
    private final C12729b m37662i2() {
        C12729b bVar = this.f29527K;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* renamed from: k2 */
    private final C10371l m37663k2() {
        return (C10371l) this.f29529M.getValue();
    }

    /* renamed from: l2 */
    private final void m37664l2() {
        C12729b i2 = m37662i2();
        i2.f37669g.setText(C32343x.m95388F("packages.application.terms.solo.Asheet.explanatory.text", new Object[0]));
        Button button = i2.f37667e;
        button.setButtonText(C32343x.m95388F("packages.application.terms.solo.Asheet.button.label", new Object[0]));
        button.setOnClickListener(new C10348b(this));
        i2.f37673k.setAdapter(m37661h2());
        i2.f37673k.mo5351j(new C13364a(C0767a.m2895e(i2.mo3946b().getContext(), C10112d.f27918l)));
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public static final void m37665m2(C10349c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        cVar.m37663k2().mo26995lw().mo26992S0();
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public final void m37666n2(C31128a aVar) {
        if (aVar instanceof C31128a.C31130b) {
            m37662i2().f37672j.mo53597e();
        } else if (aVar instanceof C31128a.C31131c) {
            m37662i2().f37672j.mo53595c();
            m37661h2().mo6029i((List) ((C31128a.C31131c) aVar).mo71340a());
        } else if (aVar instanceof C31128a.C31129a) {
            handleError(((C31128a.C31129a) aVar).mo71342c());
            mo4577k1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public final void m37667o2() {
        C1533o.m5445b(this, "ApplicationTermsActionSheet.REQUEST_KEY", C0908e.m3336b(C41233s.m119492a("ApplicationTermsActionSheet.REQUEST_KEY", Boolean.TRUE)));
    }

    private final void observeData() {
        C10367h mw = m37663k2().mo26996mw();
        mw.mo26993ln().mo4819k(getViewLifecycleOwner(), new C10354e(new C10352c(this)));
        LiveData qa = mw.mo26994qa();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(qa, viewLifecycleOwner, new C10353d(this));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f29527K = C12729b.m48310d(layoutInflater, viewGroup, true);
    }

    /* renamed from: j2 */
    public final C10371l.C10375c mo26980j2() {
        C10371l.C10375c cVar = this.f29528L;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C17913e.m61728j(this, false);
    }

    public void onDestroyView() {
        super.onDestroyView();
        m37662i2().f37673k.setAdapter((RecyclerView.C1736h) null);
        this.f29527K = null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C41536l.m120489i(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        C1533o.m5445b(this, "ApplicationTermsActionSheet.REQUEST_KEY", C0908e.m3336b(C41233s.m119492a("ApplicationTermsActionSheet.REQUEST_KEY", Boolean.FALSE)));
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26370a2(C32343x.m95388F("packages.application.terms.solo.Asheet.header", new Object[0]));
        m37664l2();
        observeData();
    }
}

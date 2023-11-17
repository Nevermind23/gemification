package tz0;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import hy0.C36274h;
import iy0.C36584c;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import o31.C37588a0;
import p163m0.C7047a;
import p189o0.C7357a;
import p420fh.C12902d;
import p434gh.C15278a;
import tz0.C38923d0;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: tz0.a */
public final class C38903a extends C38957i0 {

    /* renamed from: K */
    public static final C38904a f92981K = new C38904a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final C43075l f92982G;

    /* renamed from: H */
    private C36584c f92983H;

    /* renamed from: I */
    public C38923d0.C38931h f92984I;

    /* renamed from: J */
    private final C41217g f92985J;

    /* renamed from: tz0.a$a */
    public static final class C38904a {
        private C38904a() {
        }

        public /* synthetic */ C38904a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C38903a mo92600a(long j, long j2) {
            C38903a aVar = new C38903a((C43075l) null, 1, (DefaultConstructorMarker) null);
            Bundle bundle = new Bundle();
            bundle.putLong("PRODUCT_ARG", j);
            bundle.putLong("CARD_ARG", j2);
            aVar.setArguments(bundle);
            return aVar;
        }

        /* renamed from: b */
        public final C38903a mo92601b(long j, C43075l lVar) {
            C41536l.m120489i(lVar, "onHideClicked");
            C38903a aVar = new C38903a(lVar);
            aVar.setArguments(C0908e.m3336b(C41233s.m119492a("PRODUCT_ARG", Long.valueOf(j))));
            return aVar;
        }
    }

    /* renamed from: tz0.a$b */
    static final class C38905b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38903a f92986d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38905b(C38903a aVar) {
            super(1);
            this.f92986d = aVar;
        }

        /* renamed from: a */
        public final void mo92602a(C37223a aVar) {
            if (((C41238w) aVar.mo90296a()) != null) {
                this.f92986d.m113734n2();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92602a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: tz0.a$c */
    static final class C38906c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38903a f92987d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38906c(C38903a aVar) {
            super(1);
            this.f92987d = aVar;
        }

        /* renamed from: a */
        public final void mo92603a(C37223a aVar) {
            if (((C41238w) aVar.mo90296a()) != null) {
                C38903a aVar2 = this.f92987d;
                aVar2.m113729h2();
                aVar2.mo4577k1();
                C43075l e2 = aVar2.f92982G;
                if (e2 != null) {
                    e2.invoke(C41238w.f97225a);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92603a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: tz0.a$d */
    static final class C38907d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38903a f92988d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38907d(C38903a aVar) {
            super(1);
            this.f92988d = aVar;
        }

        /* renamed from: a */
        public final void mo92604a(C37223a aVar) {
            C31128a aVar2 = (C31128a) aVar.mo90296a();
            if (aVar2 != null) {
                C38903a aVar3 = this.f92988d;
                if (aVar2 instanceof C31128a.C31131c) {
                    aVar3.m113729h2();
                }
                aVar3.m113735o2(aVar2);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92604a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: tz0.a$e */
    static final class C38908e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f92989a;

        C38908e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f92989a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f92989a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f92989a.invoke(obj);
        }
    }

    /* renamed from: tz0.a$f */
    static final class C38909f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38903a f92990d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38909f(C38903a aVar) {
            super(1);
            this.f92990d = aVar;
        }

        /* renamed from: a */
        public final void mo92607a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C12902d.C12903a aVar = C12902d.f38098b;
            C1505h requireActivity = this.f92990d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            C12902d e = C12902d.C12903a.m48771e(aVar, requireActivity, false, 2, (Object) null);
            String string = this.f92990d.getString(C36274h.f87577q);
            C41536l.m120488h(string, "getString(R.string.commo…_operations_successfully)");
            e.mo33652k(string, C15278a.POSITIVE, (C12902d.C12905b) null);
            this.f92990d.mo4577k1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92607a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: tz0.a$g */
    static final class C38910g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38903a f92991d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38910g(C38903a aVar) {
            super(1);
            this.f92991d = aVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C12902d.C12903a aVar = C12902d.f38098b;
            C1505h requireActivity = this.f92991d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            C12902d e = C12902d.C12903a.m48771e(aVar, requireActivity, false, 2, (Object) null);
            String string = this.f92991d.getString(C36274h.f87576p);
            C41536l.m120488h(string, "getString(R.string.common_text_operation_error)");
            e.mo33652k(string, C15278a.NEGATIVE, (C12902d.C12905b) null);
        }
    }

    /* renamed from: tz0.a$h */
    public static final class C38911h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f92992d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38911h(Fragment fragment) {
            super(0);
            this.f92992d = fragment;
        }

        public final Fragment invoke() {
            return this.f92992d;
        }
    }

    /* renamed from: tz0.a$i */
    public static final class C38912i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f92993d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38912i(C43064a aVar) {
            super(0);
            this.f92993d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f92993d.invoke();
        }
    }

    /* renamed from: tz0.a$j */
    public static final class C38913j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f92994d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38913j(C41217g gVar) {
            super(0);
            this.f92994d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f92994d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: tz0.a$k */
    public static final class C38914k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f92995d;

        /* renamed from: e */
        final /* synthetic */ C41217g f92996e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38914k(C43064a aVar, C41217g gVar) {
            super(0);
            this.f92995d = aVar;
            this.f92996e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f92995d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f92996e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: tz0.a$l */
    static final class C38915l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C38903a f92997d;

        /* renamed from: tz0.a$l$a */
        static final class C38916a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C38903a f92998d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38916a(C38903a aVar) {
                super(0);
                this.f92998d = aVar;
            }

            /* renamed from: b */
            public final C38923d0 invoke() {
                long j;
                C38923d0.C38931h k2 = this.f92998d.mo92599k2();
                Bundle arguments = this.f92998d.getArguments();
                long j2 = -1;
                if (arguments != null) {
                    j = arguments.getLong("PRODUCT_ARG", -1);
                } else {
                    j = -1;
                }
                Bundle arguments2 = this.f92998d.getArguments();
                if (arguments2 != null) {
                    j2 = arguments2.getLong("CARD_ARG", -1);
                }
                return k2.mo32797a(j, j2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38915l(C38903a aVar) {
            super(0);
            this.f92997d = aVar;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C38916a(this.f92997d));
        }
    }

    public C38903a() {
        this((C43075l) null, 1, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public final void m113729h2() {
        C7357a.m28044b(requireContext()).mo21731d(new Intent("ge.bog.mobilebank.products.presentation.products.refresh_products"));
    }

    /* renamed from: i2 */
    private final C36584c m113730i2() {
        C36584c cVar = this.f92983H;
        C41536l.m120486f(cVar);
        return cVar;
    }

    /* renamed from: j2 */
    private final C38923d0 m113731j2() {
        return (C38923d0) this.f92985J.getValue();
    }

    /* renamed from: l2 */
    private final void m113732l2(Fragment fragment) {
        getChildFragmentManager().mo4428p().mo4639r(m113730i2().f88159e.getId(), fragment).mo4515i();
    }

    /* renamed from: m2 */
    private final void m113733m2() {
        mo26370a2(getString(C36274h.additional_functions_label));
        m113732l2(C38960k.f93075i.mo92664a());
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public final void m113734n2() {
        mo26370a2(getString(C36274h.more_label_rename));
        m113732l2(C38977m0.f93095i.mo92673a());
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public final void m113735o2(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C38909f(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C38910g(this), 1, (Object) null);
    }

    private final void observeData() {
        m113731j2().mo92623Uw().mo92633wi().mo4819k(getViewLifecycleOwner(), new C38908e(new C38905b(this)));
        m113731j2().mo92623Uw().mo92611Er().mo4819k(getViewLifecycleOwner(), new C38908e(new C38906c(this)));
        m113731j2().mo92623Uw().mo92630cp().mo4819k(getViewLifecycleOwner(), new C38908e(new C38907d(this)));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f92983H = C36584c.m108462d(layoutInflater, viewGroup, true);
        m113733m2();
    }

    /* renamed from: k2 */
    public final C38923d0.C38931h mo92599k2() {
        C38923d0.C38931h hVar = this.f92984I;
        if (hVar != null) {
            return hVar;
        }
        C41536l.m120506z("viewModelAssistedFactory");
        return null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f92983H = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        observeData();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38903a(C43075l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : lVar);
    }

    public C38903a(C43075l lVar) {
        this.f92982G = lVar;
        C38915l lVar2 = new C38915l(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C38912i(new C38911h(this)));
        this.f92985J = C1514j0.m5374c(this, C41520a0.m120436b(C38923d0.class), new C38913j(a), new C38914k((C43064a) null, a), lVar2);
    }
}

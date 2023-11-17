package p341ge.bog.mobilebank.kyc.presentation.selectcity;

import an0.C10105a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import en0.C12715a;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import java.util.List;
import jn0.C16254a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.list.C13364a;
import p642vh.C18368l;
import pn0.C17429a;
import pn0.C17432d;
import pn0.C17444p;
import pn0.C17454q;
import rn0.C17682c;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.kyc.presentation.selectcity.CitySelectorActionSheet */
public final class CitySelectorActionSheet extends C17454q {

    /* renamed from: J */
    public static final C14907a f43044J = new C14907a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private C12715a f43045G;

    /* renamed from: H */
    public C17432d f43046H;

    /* renamed from: I */
    private final C41217g f43047I;

    /* renamed from: ge.bog.mobilebank.kyc.presentation.selectcity.CitySelectorActionSheet$a */
    public static final class C14907a {
        private C14907a() {
        }

        public /* synthetic */ C14907a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Bundle mo41564a(C16254a aVar) {
            C41536l.m120489i(aVar, "addressType");
            return C0908e.m3336b(C41233s.m119492a("ADDRESS_TYPE", aVar));
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.selectcity.CitySelectorActionSheet$b */
    static final class C14908b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C17682c f43048d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14908b(C17682c cVar) {
            super(1);
            this.f43048d = cVar;
        }

        /* renamed from: a */
        public final void mo41565a(String str) {
            C41536l.m120489i(str, "changed");
            this.f43048d.mo45246g(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41565a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.selectcity.CitySelectorActionSheet$c */
    static final class C14909c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CitySelectorActionSheet f43049d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14909c(CitySelectorActionSheet citySelectorActionSheet) {
            super(1);
            this.f43049d = citySelectorActionSheet;
        }

        /* renamed from: a */
        public final void mo41566a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f43049d.mo4577k1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41566a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.selectcity.CitySelectorActionSheet$d */
    static final class C14910d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CitySelectorActionSheet f43050d;

        /* renamed from: e */
        final /* synthetic */ C17682c f43051e;

        /* renamed from: ge.bog.mobilebank.kyc.presentation.selectcity.CitySelectorActionSheet$d$a */
        static final class C14911a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ CitySelectorActionSheet f43052d;

            /* renamed from: e */
            final /* synthetic */ C17682c f43053e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14911a(CitySelectorActionSheet citySelectorActionSheet, C17682c cVar) {
                super(1);
                this.f43052d = citySelectorActionSheet;
                this.f43053e = cVar;
            }

            /* renamed from: a */
            public final void mo41568a(C41224m mVar) {
                C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
                this.f43052d.m54711g2().mo3946b().mo53595c();
                this.f43053e.mo45251o((List) mVar.mo95675a(), (String) mVar.mo95676b());
                this.f43052d.m54711g2().f37603g.mo5425x1(this.f43053e.mo45247i());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo41568a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.kyc.presentation.selectcity.CitySelectorActionSheet$d$b */
        static final class C14912b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ CitySelectorActionSheet f43054d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14912b(CitySelectorActionSheet citySelectorActionSheet) {
                super(1);
                this.f43054d = citySelectorActionSheet;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f43054d.m54711g2().mo3946b().mo53596d();
            }
        }

        /* renamed from: ge.bog.mobilebank.kyc.presentation.selectcity.CitySelectorActionSheet$d$c */
        static final class C14913c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ CitySelectorActionSheet f43055d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14913c(CitySelectorActionSheet citySelectorActionSheet) {
                super(1);
                this.f43055d = citySelectorActionSheet;
            }

            /* renamed from: a */
            public final void mo41570a(C41224m mVar) {
                this.f43055d.m54711g2().mo3946b().mo53597e();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo41570a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14910d(CitySelectorActionSheet citySelectorActionSheet, C17682c cVar) {
            super(1);
            this.f43050d = citySelectorActionSheet;
            this.f43051e = cVar;
        }

        /* renamed from: a */
        public final void mo41567a(C31128a aVar) {
            C41536l.m120488h(aVar, "it");
            C31132b.m92648j(aVar, (int[]) null, new C14911a(this.f43050d, this.f43051e), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C14912b(this.f43050d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C14913c(this.f43050d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41567a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.selectcity.CitySelectorActionSheet$e */
    static final class C14914e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CitySelectorActionSheet f43056d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14914e(CitySelectorActionSheet citySelectorActionSheet) {
            super(1);
            this.f43056d = citySelectorActionSheet;
        }

        /* renamed from: a */
        public final void mo41571a(String str) {
            C41536l.m120489i(str, "it");
            this.f43056d.m54712h2().mo44934ww().mo44931C(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41571a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.selectcity.CitySelectorActionSheet$f */
    static final class C14915f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f43057a;

        C14915f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f43057a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f43057a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f43057a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.selectcity.CitySelectorActionSheet$g */
    public static final class C14916g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f43058d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14916g(Fragment fragment) {
            super(0);
            this.f43058d = fragment;
        }

        public final Fragment invoke() {
            return this.f43058d;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.selectcity.CitySelectorActionSheet$h */
    public static final class C14917h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f43059d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14917h(C43064a aVar) {
            super(0);
            this.f43059d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f43059d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.selectcity.CitySelectorActionSheet$i */
    public static final class C14918i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f43060d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14918i(C41217g gVar) {
            super(0);
            this.f43060d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f43060d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.selectcity.CitySelectorActionSheet$j */
    public static final class C14919j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f43061d;

        /* renamed from: e */
        final /* synthetic */ C41217g f43062e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14919j(C43064a aVar, C41217g gVar) {
            super(0);
            this.f43061d = aVar;
            this.f43062e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f43061d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f43062e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.selectcity.CitySelectorActionSheet$k */
    static final class C14920k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CitySelectorActionSheet f43063d;

        /* renamed from: ge.bog.mobilebank.kyc.presentation.selectcity.CitySelectorActionSheet$k$a */
        static final class C14921a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ CitySelectorActionSheet f43064d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14921a(CitySelectorActionSheet citySelectorActionSheet) {
                super(0);
                this.f43064d = citySelectorActionSheet;
            }

            /* renamed from: b */
            public final C17444p invoke() {
                Object obj;
                C17432d i2 = this.f43064d.mo41563i2();
                Bundle arguments = this.f43064d.getArguments();
                if (arguments != null) {
                    obj = arguments.get("ADDRESS_TYPE");
                } else {
                    obj = null;
                }
                C41536l.m120487g(obj, "null cannot be cast to non-null type ge.bog.mobilebank.kyc.presentation.AddressType");
                return i2.mo32796a((C16254a) obj);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14920k(CitySelectorActionSheet citySelectorActionSheet) {
            super(0);
            this.f43063d = citySelectorActionSheet;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C14921a(this.f43063d));
        }
    }

    public CitySelectorActionSheet() {
        C14920k kVar = new C14920k(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C14917h(new C14916g(this)));
        this.f43047I = C1514j0.m5374c(this, C41520a0.m120436b(C17444p.class), new C14918i(a), new C14919j((C43064a) null, a), kVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public final C12715a m54711g2() {
        C12715a aVar = this.f43045G;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public final C17444p m54712h2() {
        return (C17444p) this.f43047I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public static final void m54713j2(CitySelectorActionSheet citySelectorActionSheet, View view) {
        C41536l.m120489i(citySelectorActionSheet, "this$0");
        citySelectorActionSheet.m54712h2().onRefresh(6);
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f43045G = C12715a.m48254d(layoutInflater, viewGroup, true);
        mo26369Z1(C18368l.m62762k(500));
        mo26370a2(C32343x.m95388F("rbc.kyc.survey.select.city", new Object[0]));
        C17682c cVar = new C17682c();
        cVar.mo45250n(new C14914e(this));
        m54711g2().f37603g.setAdapter(cVar);
        m54711g2().f37603g.mo5351j(new C13364a(requireContext().getDrawable(C10105a.f27870a), true, false));
        m54711g2().f37605i.setOnTextChangeListener(new C14908b(cVar));
        m54711g2().f37604h.setOnClickListener(new C17429a(this));
        LiveData p = m54712h2().mo44935xw().mo44933p();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(p, viewLifecycleOwner, new C14909c(this));
        m54712h2().mo44935xw().mo44932b().mo4819k(getViewLifecycleOwner(), new C14915f(new C14910d(this, cVar)));
    }

    /* renamed from: i2 */
    public final C17432d mo41563i2() {
        C17432d dVar = this.f43046H;
        if (dVar != null) {
            return dVar;
        }
        C41536l.m120506z("viewModelAssistedFactory");
        return null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f43045G = null;
    }
}

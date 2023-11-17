package p341ge.bog.mobilebank.kyc.presentation.selectcountry;

import an0.C10105a;
import android.os.Bundle;
import android.view.LayoutInflater;
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
import en0.C12716b;
import g91.C32286a1;
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
import p163m0.C7047a;
import p341ge.bog.designsystem.components.list.C13364a;
import p642vh.C18368l;
import qn0.C17557c;
import qn0.C17565k;
import qn0.C17571l;
import rn0.C17682c;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.kyc.presentation.selectcountry.CountrySelectorActionSheet */
public final class CountrySelectorActionSheet extends C17571l {

    /* renamed from: J */
    public static final C14922a f43065J = new C14922a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private C12716b f43066G;

    /* renamed from: H */
    public C17557c f43067H;

    /* renamed from: I */
    private final C41217g f43068I;

    /* renamed from: ge.bog.mobilebank.kyc.presentation.selectcountry.CountrySelectorActionSheet$a */
    public static final class C14922a {
        private C14922a() {
        }

        public /* synthetic */ C14922a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Bundle mo41576a(C16254a aVar) {
            C41536l.m120489i(aVar, "addressType");
            return C0908e.m3336b(C41233s.m119492a("ADDRESS_TYPE", aVar));
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.selectcountry.CountrySelectorActionSheet$b */
    static final class C14923b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C17682c f43069d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14923b(C17682c cVar) {
            super(1);
            this.f43069d = cVar;
        }

        /* renamed from: a */
        public final void mo41577a(String str) {
            C41536l.m120489i(str, "changed");
            this.f43069d.mo45246g(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41577a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.selectcountry.CountrySelectorActionSheet$c */
    static final class C14924c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CountrySelectorActionSheet f43070d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14924c(CountrySelectorActionSheet countrySelectorActionSheet) {
            super(1);
            this.f43070d = countrySelectorActionSheet;
        }

        /* renamed from: a */
        public final void mo41578a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f43070d.mo4577k1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41578a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.selectcountry.CountrySelectorActionSheet$d */
    static final class C14925d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C17682c f43071d;

        /* renamed from: e */
        final /* synthetic */ CountrySelectorActionSheet f43072e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14925d(C17682c cVar, CountrySelectorActionSheet countrySelectorActionSheet) {
            super(1);
            this.f43071d = cVar;
            this.f43072e = countrySelectorActionSheet;
        }

        /* renamed from: a */
        public final void mo41579a(C41224m mVar) {
            this.f43071d.mo45251o((List) mVar.mo95675a(), (String) mVar.mo95676b());
            this.f43072e.m54726f2().f37608e.mo5425x1(this.f43071d.mo45247i());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41579a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.selectcountry.CountrySelectorActionSheet$e */
    static final class C14926e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CountrySelectorActionSheet f43073d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14926e(CountrySelectorActionSheet countrySelectorActionSheet) {
            super(1);
            this.f43073d = countrySelectorActionSheet;
        }

        /* renamed from: a */
        public final void mo41580a(String str) {
            C41536l.m120489i(str, "it");
            this.f43073d.m54727g2().mo45095pw().mo45092C(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41580a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.selectcountry.CountrySelectorActionSheet$f */
    static final class C14927f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f43074a;

        C14927f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f43074a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f43074a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f43074a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.selectcountry.CountrySelectorActionSheet$g */
    public static final class C14928g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f43075d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14928g(Fragment fragment) {
            super(0);
            this.f43075d = fragment;
        }

        public final Fragment invoke() {
            return this.f43075d;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.selectcountry.CountrySelectorActionSheet$h */
    public static final class C14929h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f43076d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14929h(C43064a aVar) {
            super(0);
            this.f43076d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f43076d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.selectcountry.CountrySelectorActionSheet$i */
    public static final class C14930i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f43077d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14930i(C41217g gVar) {
            super(0);
            this.f43077d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f43077d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.selectcountry.CountrySelectorActionSheet$j */
    public static final class C14931j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f43078d;

        /* renamed from: e */
        final /* synthetic */ C41217g f43079e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14931j(C43064a aVar, C41217g gVar) {
            super(0);
            this.f43078d = aVar;
            this.f43079e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f43078d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f43079e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.selectcountry.CountrySelectorActionSheet$k */
    static final class C14932k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CountrySelectorActionSheet f43080d;

        /* renamed from: ge.bog.mobilebank.kyc.presentation.selectcountry.CountrySelectorActionSheet$k$a */
        static final class C14933a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ CountrySelectorActionSheet f43081d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14933a(CountrySelectorActionSheet countrySelectorActionSheet) {
                super(0);
                this.f43081d = countrySelectorActionSheet;
            }

            /* renamed from: b */
            public final C17565k invoke() {
                Object obj;
                C17557c h2 = this.f43081d.mo41575h2();
                Bundle arguments = this.f43081d.getArguments();
                if (arguments != null) {
                    obj = arguments.get("ADDRESS_TYPE");
                } else {
                    obj = null;
                }
                C41536l.m120487g(obj, "null cannot be cast to non-null type ge.bog.mobilebank.kyc.presentation.AddressType");
                return h2.mo32799a((C16254a) obj);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14932k(CountrySelectorActionSheet countrySelectorActionSheet) {
            super(0);
            this.f43080d = countrySelectorActionSheet;
        }

        public final C1620q0.C1624b invoke() {
            return C32286a1.f79687a.mo72809a(new C14933a(this.f43080d));
        }
    }

    public CountrySelectorActionSheet() {
        C14932k kVar = new C14932k(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C14929h(new C14928g(this)));
        this.f43068I = C1514j0.m5374c(this, C41520a0.m120436b(C17565k.class), new C14930i(a), new C14931j((C43064a) null, a), kVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public final C12716b m54726f2() {
        C12716b bVar = this.f43066G;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public final C17565k m54727g2() {
        return (C17565k) this.f43068I.getValue();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f43066G = C12716b.m48258d(layoutInflater, viewGroup, true);
        mo26369Z1(C18368l.m62762k(500));
        mo26370a2(C32343x.m95388F("rbc.kyc.survey.select.country", new Object[0]));
        C17682c cVar = new C17682c();
        cVar.mo45250n(new C14926e(this));
        m54726f2().f37608e.setAdapter(cVar);
        m54726f2().f37608e.mo5351j(new C13364a(requireContext().getDrawable(C10105a.f27870a), true, false));
        m54726f2().f37609f.setOnTextChangeListener(new C14923b(cVar));
        LiveData p = m54727g2().mo45096qw().mo45094p();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(p, viewLifecycleOwner, new C14924c(this));
        m54727g2().mo45096qw().mo45093b().mo4819k(getViewLifecycleOwner(), new C14927f(new C14925d(cVar, this)));
    }

    /* renamed from: h2 */
    public final C17557c mo41575h2() {
        C17557c cVar = this.f43067H;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("viewModelAssistedFactory");
        return null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f43066G = null;
    }
}

package p341ge.bog.mobilebank.products.presentation.details.list;

import af1.C40303i;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import b00.C19305k;
import b41.C31128a;
import b41.C31132b;
import c01.C31251a;
import com.google.android.material.tabs.C5161d;
import com.google.android.material.tabs.TabLayout;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import hy0.C36274h;
import iu0.C36546y;
import iy0.C36608k;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.tabs.TabsView;
import pz0.C38051a;
import pz0.C38066p;
import pz0.C38068r;
import pz0.C38072v;
import q31.C38125h;
import q70.C27685a;
import qt0.C38246b;
import sz0.C38607a;
import sz0.C38617e;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.products.presentation.details.list.LoanListActivity */
public final class LoanListActivity extends C34212a {

    /* renamed from: K */
    public static final C34169b f83008K = new C34169b((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C38066p f83009G;

    /* renamed from: H */
    private final C41217g f83010H = C41219i.m119470b(new C34176i(this));

    /* renamed from: I */
    private final C41217g f83011I = new C1617p0(C41520a0.m120436b(C38072v.class), new C34184q(this), new C34186s(this), new C34185r((C43064a) null, this));

    /* renamed from: J */
    private final C41217g f83012J = C41219i.m119470b(new C34170c(this));

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.LoanListActivity$a */
    private static final class C34166a extends FragmentStateAdapter {

        /* renamed from: n */
        static final /* synthetic */ C40303i[] f83013n = {C41520a0.m120439e(new C41539o(C34166a.class, "listState", "getListState()Lge/bog/mobilebank/products/presentation/products/model/LoanSummaryState;", 0))};
        /* access modifiers changed from: private */

        /* renamed from: l */
        public C38617e f83014l = C38617e.MY_LOANS;

        /* renamed from: m */
        private final C41555e f83015m;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.list.LoanListActivity$a$a */
        public /* synthetic */ class C34167a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f83016a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    c01.a[] r0 = c01.C31251a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    c01.a r1 = c01.C31251a.JUST_MY_LOANS     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    c01.a r1 = c01.C31251a.COSIGNER_ONLY     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f83016a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.details.list.LoanListActivity.C34166a.C34167a.<clinit>():void");
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.list.LoanListActivity$a$b */
        public static final class C34168b extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C34166a f83017a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C34168b(Object obj, C34166a aVar) {
                super(obj);
                this.f83017a = aVar;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                C38617e eVar;
                C41536l.m120489i(iVar, "property");
                C31251a aVar = (C31251a) obj2;
                C31251a aVar2 = (C31251a) obj;
                C34166a aVar3 = this.f83017a;
                if (aVar3.mo82541A() == C31251a.COSIGNER_ONLY) {
                    eVar = C38617e.COSIGNER;
                } else {
                    eVar = C38617e.MY_LOANS;
                }
                aVar3.f83014l = eVar;
                if (this.f83017a.mo82541A() == C31251a.MY_AND_COSIGNER) {
                    this.f83017a.notifyDataSetChanged();
                } else {
                    this.f83017a.notifyItemChanged(0);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34166a(C1505h hVar) {
            super(hVar);
            C41536l.m120489i(hVar, "parent");
            C41551a aVar = C41551a.f97718a;
            this.f83015m = new C34168b(C31251a.JUST_MY_LOANS, this);
        }

        /* renamed from: A */
        public final C31251a mo82541A() {
            return (C31251a) this.f83015m.getValue(this, f83013n[0]);
        }

        /* renamed from: B */
        public final void mo82542B(C31251a aVar) {
            C41536l.m120489i(aVar, "<set-?>");
            this.f83015m.setValue(this, f83013n[0], aVar);
        }

        public int getItemCount() {
            int i = C34167a.f83016a[mo82541A().ordinal()];
            return (i == 1 || i == 2) ? 1 : 2;
        }

        public long getItemId(int i) {
            int i2;
            if (mo82541A() == C31251a.MY_AND_COSIGNER) {
                i2 = C38617e.values()[i].ordinal();
            } else {
                i2 = this.f83014l.ordinal();
            }
            return (long) i2;
        }

        /* renamed from: h */
        public Fragment mo6571h(int i) {
            int i2 = C34167a.f83016a[mo82541A().ordinal()];
            if (i2 != 1 && i2 != 2) {
                C38617e eVar = C38617e.MY_LOANS;
                if (i == eVar.mo92266b()) {
                    return C34217d.f83070k.mo82581a(eVar);
                }
                C38617e eVar2 = C38617e.COSIGNER;
                if (i == eVar2.mo92266b()) {
                    return C34217d.f83070k.mo82581a(eVar2);
                }
                throw new IllegalStateException("Invalid fragment position".toString());
            } else if (i == 0) {
                return C34217d.f83070k.mo82581a(this.f83014l);
            } else {
                throw new IllegalStateException("Invalid fragment position".toString());
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.LoanListActivity$b */
    public static final class C34169b {
        private C34169b() {
        }

        public /* synthetic */ C34169b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo82543a(Context context) {
            C41536l.m120489i(context, "context");
            context.startActivity(new Intent(context, LoanListActivity.class));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.LoanListActivity$c */
    static final class C34170c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LoanListActivity f83018d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34170c(LoanListActivity loanListActivity) {
            super(0);
            this.f83018d = loanListActivity;
        }

        /* renamed from: b */
        public final C34166a invoke() {
            return new C34166a(this.f83018d);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.LoanListActivity$d */
    /* synthetic */ class C34171d extends C41535k implements C43075l {
        C34171d(Object obj) {
            super(1, obj, LoanListActivity.class, "onLoanSummaryStateChange", "onLoanSummaryStateChange(Lge/bog/mobilebank/products/presentation/products/model/LoanSummaryState;)V", 0);
        }

        /* renamed from: b */
        public final void mo82545b(C31251a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((LoanListActivity) this.receiver).m100576R2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82545b((C31251a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.LoanListActivity$e */
    static final class C34172e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LoanListActivity f83019d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34172e(LoanListActivity loanListActivity) {
            super(1);
            this.f83019d = loanListActivity;
        }

        /* renamed from: a */
        public final void mo82546a(C31128a aVar) {
            LoanListActivity loanListActivity = this.f83019d;
            C41536l.m120488h(aVar, "result");
            loanListActivity.m100579U2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82546a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.LoanListActivity$f */
    /* synthetic */ class C34173f extends C41535k implements C43075l {
        C34173f(Object obj) {
            super(1, obj, LoanListActivity.class, "openProductDetails", "openProductDetails(Lge/bog/mobilebank/products/presentation/details/models/ClickedProductItemData;)V", 0);
        }

        /* renamed from: b */
        public final void mo82547b(C38607a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((LoanListActivity) this.receiver).m100581W2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82547b((C38607a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.LoanListActivity$g */
    static final class C34174g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LoanListActivity f83020d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34174g(LoanListActivity loanListActivity) {
            super(1);
            this.f83020d = loanListActivity;
        }

        /* renamed from: a */
        public final void mo82548a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f83020d.m100575Q2().mo91468Y6();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82548a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.LoanListActivity$h */
    static final class C34175h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LoanListActivity f83021d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34175h(LoanListActivity loanListActivity) {
            super(1);
            this.f83021d = loanListActivity;
        }

        /* renamed from: a */
        public final void mo82549a(C31128a aVar) {
            LoanListActivity loanListActivity = this.f83021d;
            C41536l.m120488h(aVar, "result");
            loanListActivity.m100577S2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82549a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.LoanListActivity$i */
    static final class C34176i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LoanListActivity f83022d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34176i(LoanListActivity loanListActivity) {
            super(0);
            this.f83022d = loanListActivity;
        }

        /* renamed from: b */
        public final C36608k invoke() {
            return C36608k.m108563d(this.f83022d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.LoanListActivity$j */
    static final class C34177j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LoanListActivity f83023d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34177j(LoanListActivity loanListActivity) {
            super(1);
            this.f83023d = loanListActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            FrameLayout frameLayout = this.f83023d.m100574O2().f88300h;
            C41536l.m120488h(frameLayout, "binding.progressBar");
            C32343x.m95447f1(frameLayout);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.LoanListActivity$k */
    static final class C34178k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LoanListActivity f83024d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34178k(LoanListActivity loanListActivity) {
            super(1);
            this.f83024d = loanListActivity;
        }

        /* renamed from: a */
        public final void mo82552a(boolean z) {
            this.f83024d.m100578T2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82552a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.LoanListActivity$l */
    static final class C34179l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LoanListActivity f83025d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34179l(LoanListActivity loanListActivity) {
            super(1);
            this.f83025d = loanListActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            FrameLayout frameLayout = this.f83025d.m100574O2().f88300h;
            C41536l.m120488h(frameLayout, "binding.progressBar");
            C32343x.m95455i0(frameLayout);
            this.f83025d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.LoanListActivity$m */
    static final class C34180m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LoanListActivity f83026d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34180m(LoanListActivity loanListActivity) {
            super(1);
            this.f83026d = loanListActivity;
        }

        /* renamed from: a */
        public final void mo82554a(List list) {
            LoanListActivity.m100580V2(this.f83026d, true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82554a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.LoanListActivity$n */
    static final class C34181n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LoanListActivity f83027d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34181n(LoanListActivity loanListActivity) {
            super(1);
            this.f83027d = loanListActivity;
        }

        /* renamed from: a */
        public final void mo82555a(List list) {
            C41536l.m120489i(list, "it");
            LoanListActivity.m100580V2(this.f83027d, false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82555a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.LoanListActivity$o */
    static final class C34182o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LoanListActivity f83028d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34182o(LoanListActivity loanListActivity) {
            super(1);
            this.f83028d = loanListActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            LoanListActivity.m100580V2(this.f83028d, false);
            this.f83028d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.LoanListActivity$p */
    static final class C34183p implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f83029a;

        C34183p(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f83029a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f83029a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f83029a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.LoanListActivity$q */
    public static final class C34184q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f83030d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34184q(ComponentActivity componentActivity) {
            super(0);
            this.f83030d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f83030d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.LoanListActivity$r */
    public static final class C34185r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f83031d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f83032e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34185r(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f83031d = aVar;
            this.f83032e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f83031d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f83032e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.LoanListActivity$s */
    static final class C34186s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LoanListActivity f83033d;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.list.LoanListActivity$s$a */
        static final class C34187a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ LoanListActivity f83034d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34187a(LoanListActivity loanListActivity) {
                super(0);
                this.f83034d = loanListActivity;
            }

            /* renamed from: b */
            public final C38072v invoke() {
                return this.f83034d.mo82540P2().mo32549a(C27685a.ACC_TYPE_LOAN);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34186s(LoanListActivity loanListActivity) {
            super(0);
            this.f83033d = loanListActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C38246b.f91733a.mo91781a(new C34187a(this.f83033d));
        }
    }

    /* renamed from: N2 */
    private final C34166a m100573N2() {
        return (C34166a) this.f83012J.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public final C36608k m100574O2() {
        return (C36608k) this.f83010H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public final C38072v m100575Q2() {
        return (C38072v) this.f83011I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public final void m100576R2(C31251a aVar) {
        boolean z;
        TabsView tabsView = m100574O2().f88298f;
        C41536l.m120488h(tabsView, "binding.loanTypeTabs");
        if (aVar == C31251a.MY_AND_COSIGNER) {
            z = true;
        } else {
            z = false;
        }
        C32343x.m95483r1(tabsView, z, false, 2, (Object) null);
        m100573N2().mo82542B(aVar);
        m100574O2().f88297e.setCurrentItem(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public final void m100577S2(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C34177j(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C34178k(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C34179l(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public final void m100578T2(boolean z) {
        if (z) {
            C36546y.m108282F().mo27152s("Products_Page", (String) null, "Request_new_loan_BTN_click");
            C38125h.m112238c(this).mo91590a(this);
        } else {
            C19305k.f53530L.mo47528a().mo4576A1(getSupportFragmentManager(), (String) null);
        }
        FrameLayout frameLayout = m100574O2().f88300h;
        C41536l.m120488h(frameLayout, "binding.progressBar");
        C32343x.m95455i0(frameLayout);
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public final void m100579U2(C31128a aVar) {
        C31132b.m92645g(aVar, new int[]{1}, new C34180m(this));
        C31132b.m92648j(aVar, (int[]) null, new C34181n(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C34182o(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public static final void m100580V2(LoanListActivity loanListActivity, boolean z) {
        LoadingView loadingView = loanListActivity.m100574O2().f88299g;
        C41536l.m120488h(loadingView, "binding.loansLoader");
        C32343x.m95483r1(loadingView, z, false, 2, (Object) null);
        if (!z) {
            NestedScrollView nestedScrollView = loanListActivity.m100574O2().f88302j;
            C41536l.m120488h(nestedScrollView, "binding.viewpagerContainer");
            C32343x.m95447f1(nestedScrollView);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public final void m100581W2(C38607a aVar) {
        C38125h.m112238c(this).mo91639x0(this, Long.valueOf(aVar.mo92229a()), Integer.valueOf(aVar.mo92230b()));
    }

    /* renamed from: X2 */
    private final void m100582X2() {
        m100574O2().f88297e.setAdapter(m100573N2());
        new C5161d(m100574O2().f88298f, m100574O2().f88297e, new C38051a(this)).mo16990a();
        m100574O2().f88297e.setCurrentItem(C38617e.MY_LOANS.mo92266b());
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public static final void m100583Y2(LoanListActivity loanListActivity, TabLayout.C5153g gVar, int i) {
        C41536l.m120489i(loanListActivity, "this$0");
        C41536l.m120489i(gVar, "<anonymous parameter 0>");
        loanListActivity.m100574O2().f88297e.setCurrentItem(i);
    }

    /* renamed from: l1 */
    private final void m100584l1() {
        C38068r Cw = m100575Q2().mo91482Cw();
        C37224b.m109963b(Cw.mo91474c4(), this, new C34171d(this));
        Cw.mo91475f2().mo4819k(this, new C34183p(new C34172e(this)));
        C37224b.m109963b(Cw.mo91470L7(), this, new C34173f(this));
        C37224b.m109963b(Cw.mo91473Ua(), this, new C34174g(this));
        Cw.mo91472Tp().mo4819k(this, new C34183p(new C34175h(this)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m100574O2().mo3946b());
        super.mo37451O1(bundle);
        m100582X2();
        m100584l1();
    }

    /* renamed from: P2 */
    public final C38066p mo82540P2() {
        C38066p pVar = this.f83009G;
        if (pVar != null) {
            return pVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95452h0(C36274h.f87583z, new Object[0]);
    }
}

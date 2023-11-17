package p341ge.bog.mobilebank.openbanking.presentation.addproduct.accounts;

import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import bv0.C31203c;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40765a;
import g91.C32299e;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import hv0.C36231e;
import iv0.C36554f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jv0.C36794c;
import jv0.C36795d;
import jv0.C36796e;
import jv0.C36797f;
import jv0.C36798g;
import jv0.C36799h;
import jv0.C36800i;
import jv0.C36801j;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.openbanking.presentation.BankUiModel;
import p341ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.C33326b;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.OpenBankAccountsViewModel$ViewModel */
public final class OpenBankAccountsViewModel$ViewModel extends C21481a implements C36794c, C36795d {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C36231e f81431d;

    /* renamed from: e */
    private final C36794c f81432e = this;

    /* renamed from: f */
    private final C36795d f81433f = this;

    /* renamed from: g */
    private final C40765a f81434g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1644x f81435h;

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.OpenBankAccountsViewModel$ViewModel$a */
    static final class C33314a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C33314a f81436d = new C33314a();

        C33314a() {
            super(1);
        }

        /* renamed from: a */
        public final C41224m invoke(String str) {
            C41536l.m120489i(str, "it");
            return new C41224m(str, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.OpenBankAccountsViewModel$ViewModel$b */
    static final class C33315b extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C33315b f81437d = new C33315b();

        C33315b() {
            super(2);
        }

        /* renamed from: a */
        public final C41224m mo79126a(int i, String str) {
            C41536l.m120489i(str, "consentId");
            return new C41224m(str, Integer.valueOf(i));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo79126a(((Number) obj).intValue(), (String) obj2);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.OpenBankAccountsViewModel$ViewModel$c */
    static final class C33316c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OpenBankAccountsViewModel$ViewModel f81438d;

        /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.OpenBankAccountsViewModel$ViewModel$c$a */
        static final class C33317a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C33317a f81439d = new C33317a();

            C33317a() {
                super(1);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "accounts");
                ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C36554f fVar = (C36554f) it.next();
                    String d = fVar.mo89358d();
                    Double a = fVar.mo89355a();
                    arrayList.add(new C33326b.C33327a(d, a != null ? C32343x.m95410Q(a.doubleValue(), fVar.mo89357c(), false, 2, (Object) null) : null));
                }
                return arrayList;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33316c(OpenBankAccountsViewModel$ViewModel openBankAccountsViewModel$ViewModel) {
            super(1);
            this.f81438d = openBankAccountsViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            String str = (String) mVar.mo95675a();
            int intValue = ((Number) mVar.mo95676b()).intValue();
            C36231e ow = this.f81438d.f81431d;
            C41536l.m120488h(str, "consentId");
            C40749p k0 = ow.mo88973c(str).mo95075O().mo95026k0(new C33333d(C33317a.f81439d));
            C41536l.m120488h(k0, "fetchBankProductsUseCase…  }\n                    }");
            return C31270e.m92879h(k0, intValue);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.OpenBankAccountsViewModel$ViewModel$d */
    static final class C33318d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OpenBankAccountsViewModel$ViewModel f81440d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33318d(OpenBankAccountsViewModel$ViewModel openBankAccountsViewModel$ViewModel) {
            super(1);
            this.f81440d = openBankAccountsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo79129a(C31128a aVar) {
            C1644x pw = this.f81440d.f81435h;
            C33337f fVar = (C33337f) this.f81440d.f81435h.mo4814f();
            C33337f fVar2 = null;
            if (fVar != null) {
                fVar2 = C33337f.m98013b(fVar, (C33326b.C33329c) null, aVar, 1, (Object) null);
            }
            pw.mo4826r(fVar2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79129a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.OpenBankAccountsViewModel$ViewModel$e */
    static final class C33319e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OpenBankAccountsViewModel$ViewModel f81441d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33319e(OpenBankAccountsViewModel$ViewModel openBankAccountsViewModel$ViewModel) {
            super(1);
            this.f81441d = openBankAccountsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo79130a(C41224m mVar) {
            boolean z;
            int i;
            BankUiModel bankUiModel = (BankUiModel) mVar.mo95675a();
            C1644x pw = this.f81441d.f81435h;
            C33337f fVar = (C33337f) this.f81441d.f81435h.mo4814f();
            C33337f fVar2 = null;
            if (fVar != null) {
                String d = bankUiModel.mo79093d();
                Integer valueOf = Integer.valueOf(C32299e.m95163a(bankUiModel.mo79091a()));
                if (valueOf.intValue() != -1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    i = valueOf.intValue();
                } else {
                    i = C31203c.f77509h;
                }
                fVar2 = C33337f.m98013b(fVar, new C33326b.C33329c(d, i), (C31128a) null, 2, (Object) null);
            }
            pw.mo4826r(fVar2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79130a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.OpenBankAccountsViewModel$ViewModel$f */
    static final class C33320f extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C33320f f81442d = new C33320f();

        C33320f() {
            super(1);
        }

        /* renamed from: a */
        public final C33330c invoke(C33337f fVar) {
            C41536l.m120488h(fVar, "it");
            return C33334e.m98010b(fVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.OpenBankAccountsViewModel$ViewModel$g */
    static final class C33321g extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C33321g f81443d = new C33321g();

        C33321g() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "it");
            return (String) mVar.mo95680f();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenBankAccountsViewModel$ViewModel(C36231e eVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(eVar, "fetchBankProductsUseCase");
        this.f81431d = eVar;
        C40765a h1 = C40765a.m118198h1();
        C41536l.m120488h(h1, "create<Pair<BankUiModel, String>>()");
        this.f81434g = h1;
        this.f81435h = new C1644x(new C33337f((C33326b.C33329c) null, (C31128a) null, 3, (DefaultConstructorMarker) null));
        C40749p k0 = h1.mo95026k0(new C36796e(C33321g.f81443d));
        C41205b F0 = C40749p.m118047l0(k0.mo95026k0(new C36797f(C33314a.f81436d)), onRefresh().mo95014Y0(k0, new C36798g(C33315b.f81437d))).mo94989L0(new C36799h(new C33316c(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C36800i(new C33318d(this)));
        C41536l.m120488h(F0, "merge(\n                c…      )\n                }");
        bindToLifecycle(F0);
        C41205b F02 = h1.mo95027o0(C40992a.m118827a()).mo94981F0(new C36801j(new C33319e(this)));
        C41536l.m120488h(F02, "bankSubject.observeOn(An…          )\n            }");
        bindToLifecycle(F02);
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: jw */
    public static final String m97983jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (String) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: kw */
    public static final C41224m m97984kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C41224m) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public static final C41224m m97985lw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41224m) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final C40754t m97986mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public static final void m97987nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: g */
    public LiveData mo79121g() {
        return C1607m0.m5655c(this.f81435h, C33320f.f81442d);
    }

    /* renamed from: hj */
    public void mo79122hj(C41224m mVar) {
        C41536l.m120489i(mVar, "bank");
        this.f81434g.onNext(mVar);
    }

    /* renamed from: qw */
    public final C36794c mo79123qw() {
        return this.f81432e;
    }

    /* renamed from: rw */
    public final C36795d mo79124rw() {
        return this.f81433f;
    }
}

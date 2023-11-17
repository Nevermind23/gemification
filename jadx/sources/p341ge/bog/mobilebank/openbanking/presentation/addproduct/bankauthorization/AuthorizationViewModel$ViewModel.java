package p341ge.bog.mobilebank.openbanking.presentation.addproduct.bankauthorization;

import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40765a;
import hd1.C41204a;
import he1.C41224m;
import hv0.C36227a;
import hv0.C36242m;
import iv0.C36551c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kv0.C36995a;
import kv0.C36996b;
import kv0.C36997c;
import kv0.C36998d;
import kv0.C36999e;
import m41.C37223a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p748eu.C20292b;
import p758fu.C20557a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.bankauthorization.AuthorizationViewModel$ViewModel */
public final class AuthorizationViewModel$ViewModel extends C21481a implements C36995a, C36996b {

    /* renamed from: d */
    private final C20292b f81463d;

    /* renamed from: e */
    private final C36242m f81464e;

    /* renamed from: f */
    private final C36995a f81465f = this;

    /* renamed from: g */
    private final C36996b f81466g = this;

    /* renamed from: h */
    private final C40765a f81467h;

    /* renamed from: i */
    private final C1644x f81468i;

    /* renamed from: j */
    private final LiveData f81469j;

    /* renamed from: k */
    private final C1644x f81470k;

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.bankauthorization.AuthorizationViewModel$ViewModel$a */
    static final class C33338a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C33338a f81471d = new C33338a();

        C33338a() {
            super(1);
        }

        /* renamed from: a */
        public final C41224m invoke(String str) {
            C41536l.m120489i(str, "it");
            return new C41224m(str, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.bankauthorization.AuthorizationViewModel$ViewModel$b */
    static final class C33339b extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C33339b f81472d = new C33339b();

        C33339b() {
            super(2);
        }

        /* renamed from: a */
        public final C41224m mo79162a(int i, String str) {
            C41536l.m120489i(str, "bankId");
            return new C41224m(str, Integer.valueOf(i));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo79162a(((Number) obj).intValue(), (String) obj2);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.bankauthorization.AuthorizationViewModel$ViewModel$c */
    static final class C33340c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36227a f81473d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33340c(C36227a aVar) {
            super(1);
            this.f81473d = aVar;
        }

        /* renamed from: a */
        public final C40754t invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            String str = (String) mVar.mo95675a();
            int intValue = ((Number) mVar.mo95676b()).intValue();
            C36227a aVar = this.f81473d;
            C41536l.m120488h(str, "bankId");
            C40749p O = aVar.mo88971a(str).mo95075O();
            C41536l.m120488h(O, "createConsentUseCase(ban…          .toObservable()");
            return C31270e.m92879h(O, intValue);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.bankauthorization.AuthorizationViewModel$ViewModel$d */
    static final class C33341d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C33341d f81474d = new C33341d();

        C33341d() {
            super(1);
        }

        /* renamed from: a */
        public final C31128a invoke(C31128a aVar) {
            C31128a.C31129a aVar2;
            C41536l.m120488h(aVar, "it");
            try {
                if (aVar instanceof C31128a.C31131c) {
                    return new C31128a.C31131c(((C36551c) ((C31128a.C31131c) aVar).mo71340a()).mo89340a(), aVar.mo71341b());
                }
                if (aVar instanceof C31128a.C31129a) {
                    aVar2 = new C31128a.C31129a(((C31128a.C31129a) aVar).mo71342c(), aVar.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
                    return aVar2;
                } else if (aVar instanceof C31128a.C31130b) {
                    return new C31128a.C31130b(aVar.mo71341b(), (Object) null, 2, (DefaultConstructorMarker) null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } catch (Throwable th) {
                aVar2 = new C31128a.C31129a(th, aVar.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthorizationViewModel$ViewModel(C36227a aVar, C20292b bVar, C36242m mVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "createConsentUseCase");
        C41536l.m120489i(bVar, "appSettings");
        C41536l.m120489i(mVar, "reloadProductsAfterAuth");
        this.f81463d = bVar;
        this.f81464e = mVar;
        C40765a h1 = C40765a.m118198h1();
        C41536l.m120488h(h1, "create<String>()");
        this.f81467h = h1;
        C1644x xVar = new C1644x();
        this.f81468i = xVar;
        this.f81469j = C1607m0.m5655c(xVar, C33341d.f81474d);
        this.f81470k = new C1644x();
        C40749p L0 = C40749p.m118047l0(h1.mo95026k0(new C36997c(C33338a.f81471d)), onRefresh().mo95014Y0(h1, new C36998d(C33339b.f81472d))).mo94989L0(new C36999e(new C33340c(aVar)));
        C41536l.m120488h(L0, "merge(\n                c…equestCode)\n            }");
        bindToLifecycle(C31270e.m92876e(L0, xVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final C41224m m98020gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C41224m) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: hw */
    public static final C41224m m98021hw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41224m) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final C40754t m98022iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: jw */
    private final String m98023jw() {
        String d;
        C20557a b = this.f81463d.mo48775b("OPEN_BANKING_AUTH_REDIRECT_URL");
        if (b == null || (d = b.mo49087d()) == null) {
            return "";
        }
        return d;
    }

    /* renamed from: kw */
    private final String m98024kw() {
        C36551c cVar;
        C31128a aVar = (C31128a) this.f81468i.mo4814f();
        if (aVar == null || (cVar = (C36551c) C31132b.m92649k(aVar, (Object) null)) == null) {
            return null;
        }
        return cVar.mo89341b();
    }

    /* renamed from: S */
    public void mo79154S(String str) {
        C41536l.m120489i(str, "bankId");
        this.f81467h.onNext(str);
    }

    /* renamed from: lw */
    public final C36995a mo79156lw() {
        return this.f81465f;
    }

    /* renamed from: mw */
    public C1644x mo79155en() {
        return this.f81470k;
    }

    /* renamed from: nw */
    public final C36996b mo79158nw() {
        return this.f81466g;
    }

    /* renamed from: wf */
    public boolean mo79159wf(String str) {
        if (!C41536l.m120484d(str, m98023jw())) {
            return false;
        }
        this.f81464e.mo88982a();
        C1644x mw = mo79155en();
        String kw = m98024kw();
        if (kw != null) {
            mw.mo4823o(new C37223a(kw));
            return true;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: yi */
    public LiveData mo79160yi() {
        return this.f81469j;
    }
}

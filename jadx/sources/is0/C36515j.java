package is0;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import is0.C36493b;
import j51.C36735g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import m51.C37228a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.loans.presentation.renameloan.model.RenameLoanData;
import sr0.C38523h;
import ue1.C43075l;

/* renamed from: is0.j */
public final class C36515j extends C21481a implements C36512g, C36513h {

    /* renamed from: k */
    public static final C36516a f88020k = new C36516a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C36735g f88021d;

    /* renamed from: e */
    private final C38523h f88022e;

    /* renamed from: f */
    private final RenameLoanData f88023f;

    /* renamed from: g */
    private final C36512g f88024g = this;

    /* renamed from: h */
    private final C36513h f88025h = this;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C1644x f88026i = new C1644x();

    /* renamed from: j */
    private final C1644x f88027j = new C1644x();

    /* renamed from: is0.j$a */
    public static final class C36516a {
        private C36516a() {
        }

        public /* synthetic */ C36516a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: is0.j$b */
    public interface C36517b {
        /* renamed from: a */
        C36515j mo32832a(RenameLoanData renameLoanData);
    }

    /* renamed from: is0.j$c */
    static final class C36518c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36515j f88028d;

        /* renamed from: e */
        final /* synthetic */ String f88029e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36518c(C36515j jVar, String str) {
            super(1);
            this.f88028d = jVar;
            this.f88029e = str;
        }

        /* renamed from: a */
        public final void mo89308a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C37224b.m109965d(this.f88028d.f88026i, new C36493b.C36495b(this.f88029e));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89308a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: is0.j$d */
    static final class C36519d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36515j f88030d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36519d(C36515j jVar) {
            super(1);
            this.f88030d = jVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "error");
            C37224b.m109965d(this.f88030d.f88026i, new C36493b.C36494a(th));
        }
    }

    /* renamed from: is0.j$e */
    static final class C36520e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36515j f88031d;

        /* renamed from: e */
        final /* synthetic */ String f88032e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36520e(C36515j jVar, String str) {
            super(1);
            this.f88031d = jVar;
            this.f88032e = str;
        }

        /* renamed from: a */
        public final void mo89310a(C31128a aVar) {
            C36515j jVar = this.f88031d;
            C41536l.m120488h(aVar, "result");
            String str = this.f88032e;
            if (C40439w.m117118v(str)) {
                str = "";
            }
            jVar.m108263iw(aVar, str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89310a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36515j(C36735g gVar, C38523h hVar, RenameLoanData renameLoanData) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(gVar, "getLoginInfo");
        C41536l.m120489i(hVar, "renameLoanNameUseCase");
        C41536l.m120489i(renameLoanData, "renameLoanData");
        this.f88021d = gVar;
        this.f88022e = hVar;
        this.f88023f = renameLoanData;
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public final void m108263iw(C31128a aVar, String str) {
        this.f88027j.mo4823o(Boolean.valueOf(aVar instanceof C31128a.C31130b));
        C31132b.m92648j(aVar, (int[]) null, new C36518c(this, str), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C36519d(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: jw */
    public static final void m108264jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: e */
    public LiveData mo89304e() {
        return this.f88027j;
    }

    /* renamed from: gw */
    public final C36512g mo89306gw() {
        return this.f88024g;
    }

    /* renamed from: hw */
    public final C36513h mo89307hw() {
        return this.f88025h;
    }

    /* renamed from: mi */
    public LiveData mo89305mi() {
        return this.f88026i;
    }

    /* renamed from: ng */
    public void mo89303ng(String str) {
        String str2;
        Long l;
        C41536l.m120489i(str, "input");
        C38523h hVar = this.f88022e;
        long a = this.f88023f.mo74396a();
        if (C40439w.m117118v(str)) {
            str2 = "";
        } else {
            str2 = str;
        }
        C37228a a2 = this.f88021d.mo89562a();
        if (a2 != null) {
            l = Long.valueOf(a2.mo90305b());
        } else {
            l = null;
        }
        C41205b F0 = C31270e.m92878g(C32343x.m95459j1(hVar.mo92091a(a, str2, String.valueOf(l), this.f88023f.mo74397b().mo89679b())), -1).mo94981F0(new C36514i(new C36520e(this, str)));
        C41536l.m120488h(F0, "override fun renameLoan(…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }
}

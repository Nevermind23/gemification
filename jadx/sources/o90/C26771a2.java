package o90;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import c41.C31270e;
import cf1.C40419j;
import de1.C40640a;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import f90.C20455b;
import g90.C20786h;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n41.C37353c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.OrganizationUiModel;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import t80.C28329f;
import u80.C28610a;
import ue1.C43075l;

/* renamed from: o90.a2 */
public final class C26771a2 extends C21481a implements C26885u1, C26903v1 {

    /* renamed from: m */
    public static final C26772a f67480m = new C26772a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final OrganizationUiModel f67481d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C28329f f67482e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C20455b f67483f;

    /* renamed from: g */
    private final PreferencesApiManager f67484g;

    /* renamed from: h */
    private final C26885u1 f67485h = this;

    /* renamed from: i */
    private final C26903v1 f67486i = this;

    /* renamed from: j */
    private final C40767b f67487j;

    /* renamed from: k */
    private final C1644x f67488k;

    /* renamed from: l */
    private final C1644x f67489l;

    /* renamed from: o90.a2$a */
    public static final class C26772a {
        private C26772a() {
        }

        public /* synthetic */ C26772a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: o90.a2$b */
    public interface C26773b {
        /* renamed from: a */
        C26771a2 mo32798a(OrganizationUiModel organizationUiModel);
    }

    /* renamed from: o90.a2$c */
    static final class C26774c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C26774c f67490d = new C26774c();

        C26774c() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(String str) {
            C41536l.m120489i(str, "it");
            return Boolean.valueOf(!C40439w.m117118v(str));
        }
    }

    /* renamed from: o90.a2$d */
    static final class C26775d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C26775d f67491d = new C26775d();

        C26775d() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(String str) {
            C41536l.m120489i(str, "it");
            return Boolean.valueOf(new C40419j(".*\\p{L}.*").mo94489f(str));
        }
    }

    /* renamed from: o90.a2$e */
    static final class C26776e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26771a2 f67492d;

        /* renamed from: o90.a2$e$a */
        static final class C26777a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C28610a f67493d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C26777a(C28610a aVar) {
                super(1);
                this.f67493d = aVar;
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "organizations");
                return C41358y.m120023m0(C41339p.m119900e(this.f67493d), list);
            }
        }

        /* renamed from: o90.a2$e$b */
        static final class C26778b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C26771a2 f67494d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C26778b(C26771a2 a2Var) {
                super(1);
                this.f67494d = a2Var;
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "organizations");
                return this.f67494d.f67483f.mo48974b(list);
            }
        }

        /* renamed from: o90.a2$e$c */
        /* synthetic */ class C26779c extends C41535k implements C43075l {
            C26779c(Object obj) {
                super(1, obj, C26771a2.class, "transformOrganizations", "transformOrganizations(Ljava/util/List;)Ljava/util/List;", 0);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "p0");
                return ((C26771a2) this.receiver).m83342sw(list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26776e(C26771a2 a2Var) {
            super(1);
            this.f67492d = a2Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final List m83356e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static final List m83357f(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: d */
        public final C40754t invoke(String str) {
            C40749p pVar;
            C41536l.m120489i(str, "keyword");
            C28610a aVar = new C28610a((Long) null, (String) null, (String) null, (String) null, (String) null, str, str, (String) null, (String) null, 415, (DefaultConstructorMarker) null);
            if (str.length() >= 5) {
                pVar = this.f67492d.f67482e.mo67971a(str).mo95062A(new C26784b2(new C26777a(aVar))).mo95075O().mo95037u0(C41339p.m119900e(aVar));
            } else {
                pVar = C40749p.m118043h0(C41339p.m119900e(aVar));
            }
            C40749p k0 = pVar.mo95026k0(new C26788c2(new C26778b(this.f67492d))).mo95026k0(new C26792d2(new C26779c(this.f67492d)));
            C41536l.m120488h(k0, "private fun subscribeOrg…ndToLifecycle()\n        }");
            return C31270e.m92879h(k0, 1);
        }
    }

    /* renamed from: o90.a2$f */
    static final class C26780f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26771a2 f67495d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26780f(C26771a2 a2Var) {
            super(1);
            this.f67495d = a2Var;
        }

        /* renamed from: a */
        public final void mo66079a(C31128a aVar) {
            this.f67495d.mo66067ej().mo4823o(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66079a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26771a2(OrganizationUiModel organizationUiModel, C28329f fVar, C20455b bVar, PreferencesApiManager preferencesApiManager) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(fVar, "getOrganization");
        C41536l.m120489i(bVar, "organizationUiMapper");
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        this.f67481d = organizationUiModel;
        this.f67482e = fVar;
        this.f67483f = bVar;
        this.f67484g = preferencesApiManager;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<String>()");
        this.f67487j = h1;
        this.f67488k = new C1644x();
        this.f67489l = new C1644x();
        m83337nw();
    }

    /* renamed from: nw */
    private final void m83337nw() {
        C40749p J0 = this.f67487j.mo95032s(300, TimeUnit.MILLISECONDS).mo94990M(new C26906w1(C26774c.f67490d)).mo94990M(new C26909x1(C26775d.f67491d)).mo95043y().mo94989L0(new C26912y1(new C26776e(this))).mo94987J0(C40640a.m117458b());
        C41536l.m120488h(J0, "private fun subscribeOrg…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(J0).mo94981F0(new C26915z1(new C26780f(this)));
        C41536l.m120488h(F0, "private fun subscribeOrg…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final boolean m83338ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final boolean m83339pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public static final C40754t m83340qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public static final void m83341rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: sw */
    public final List m83342sw(List list) {
        String str;
        boolean z;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OrganizationUiModel organizationUiModel = (OrganizationUiModel) it.next();
            String d = organizationUiModel.mo56159d();
            OrganizationUiModel organizationUiModel2 = this.f67481d;
            String str2 = null;
            if (organizationUiModel2 != null) {
                str = organizationUiModel2.mo56159d();
            } else {
                str = null;
            }
            if (!C41536l.m120484d(d, str)) {
                String e = organizationUiModel.mo56161e();
                OrganizationUiModel organizationUiModel3 = this.f67481d;
                if (organizationUiModel3 != null) {
                    str2 = organizationUiModel3.mo56161e();
                }
                if (!C41536l.m120484d(e, str2)) {
                    z = false;
                    C37353c language = this.f67484g.getLanguage();
                    C41536l.m120488h(language, "preferencesApiManager.getLanguage()");
                    arrayList.add(new C20786h(organizationUiModel, z, language));
                }
            }
            z = true;
            C37353c language2 = this.f67484g.getLanguage();
            C41536l.m120488h(language2, "preferencesApiManager.getLanguage()");
            arrayList.add(new C20786h(organizationUiModel, z, language2));
        }
        return arrayList;
    }

    /* renamed from: Y2 */
    public void mo66066Y2(String str) {
        C41536l.m120489i(str, "query");
        this.f67487j.onNext(str);
    }

    /* renamed from: kw */
    public C1644x mo66068h() {
        return this.f67489l;
    }

    /* renamed from: lw */
    public C1644x mo66067ej() {
        return this.f67488k;
    }

    /* renamed from: mw */
    public final C26903v1 mo66071mw() {
        return this.f67486i;
    }

    /* renamed from: yq */
    public void mo66072yq(OrganizationUiModel organizationUiModel) {
        C41536l.m120489i(organizationUiModel, "selectedOrganization");
        mo66068h().mo4823o(C32343x.m95466m(organizationUiModel));
    }
}

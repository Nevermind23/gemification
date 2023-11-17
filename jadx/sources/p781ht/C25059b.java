package p781ht;

import ai1.C40325g;
import ba1.C10146d0;
import bi1.C40388a;
import cg1.C40446a;
import de1.C40640a;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n41.C37350a;
import of1.C41869b0;
import of1.C41880d0;
import of1.C41935w;
import of1.C41944z;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;
import zh1.C43511w;

/* renamed from: ht.b */
public final class C25059b {

    /* renamed from: a */
    public static final C25060a f64411a = new C25060a((DefaultConstructorMarker) null);

    /* renamed from: ht.b$a */
    public static final class C25060a {
        private C25060a() {
        }

        public /* synthetic */ C25060a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ht.b$b */
    public static final class C25061b implements C41935w {

        /* renamed from: a */
        final /* synthetic */ C37350a f64412a;

        public C25061b(C37350a aVar) {
            this.f64412a = aVar;
        }

        /* renamed from: a */
        public final C41880d0 mo21294a(C41935w.C41936a aVar) {
            C41536l.m120489i(aVar, "chain");
            String format = String.format("Bearer %s", Arrays.copyOf(new Object[]{C10146d0.C10159c.m37143b().getToken()}, 1));
            C41536l.m120488h(format, "format(this, *args)");
            C41869b0 w = aVar.mo97011w();
            return aVar.mo97008a(w.mo96679h().mo96691i("Authorization", format).mo96691i("Lang-Code", this.f64412a.getLanguage().mo90433b()).mo96706x(w.mo96681j()).mo96684b());
        }
    }

    /* renamed from: a */
    public final C25057a mo63495a(C43511w wVar) {
        C41536l.m120489i(wVar, "retrofit");
        Object b = wVar.mo102220b(C25057a.class);
        C41536l.m120488h(b, "retrofit.create(ElasticStatementsApi::class.java)");
        return (C25057a) b;
    }

    /* renamed from: b */
    public final C41944z mo63496b(C37350a aVar, PreferencesApiManager preferencesApiManager) {
        C41536l.m120489i(aVar, "languageStore");
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        C41944z.C41945a O = new C41944z.C41945a().mo97079O(60, TimeUnit.SECONDS);
        if (preferencesApiManager.isHttpRequestsLoggingEnabled()) {
            O.mo97091a(new C40446a((C40446a.C40448b) null, 1, (DefaultConstructorMarker) null).mo94505e(C40446a.C40447a.BODY));
        }
        return O.mo97091a(new C25061b(aVar)).mo97097d();
    }

    /* renamed from: c */
    public final C43511w mo63497c(C41944z zVar, TargetEnvironment targetEnvironment) {
        C41536l.m120489i(zVar, "okHttpClient");
        C41536l.m120489i(targetEnvironment, "environment");
        C43511w.C43513b bVar = new C43511w.C43513b();
        String elasticStatementEndpoint = targetEnvironment.getElasticStatementEndpoint();
        C43511w e = bVar.mo102232c(elasticStatementEndpoint + C11110u2.f31950c).mo102236g(zVar).mo102231b(C40388a.m116953f()).mo102230a(C40325g.m116761e(C40640a.m117458b())).mo102234e();
        C41536l.m120488h(e, "Builder()\n            .b…()))\n            .build()");
        return e;
    }
}

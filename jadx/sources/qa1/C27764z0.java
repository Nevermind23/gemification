package qa1;

import ba1.C10196h;
import ed1.C40762x;
import gb1.C32393w;
import hb1.C36175k;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p088g3.C6204a;
import p204p2.C7671c;
import p217q2.C7843j;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.sso_client.models.C35954n;
import sso.queery.CheckOperationQuery;
import sso.queery.PerformScaQuery;
import ue1.C43075l;

/* renamed from: qa1.z0 */
public final class C27764z0 implements C27752w0 {

    /* renamed from: a */
    private final C36175k f70857a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C10196h f70858b;

    /* renamed from: qa1.z0$a */
    static final class C27765a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ boolean f70859d;

        /* renamed from: e */
        final /* synthetic */ PerformScaQuery f70860e;

        /* renamed from: f */
        final /* synthetic */ C27764z0 f70861f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27765a(boolean z, PerformScaQuery performScaQuery, C27764z0 z0Var) {
            super(1);
            this.f70859d = z;
            this.f70860e = performScaQuery;
            this.f70861f = z0Var;
        }

        /* renamed from: a */
        public final C7671c invoke(C7671c cVar) {
            C41536l.m120489i(cVar, "$this$createSingleQuery");
            C6204a.C6205a a = C6204a.m24692a();
            boolean z = this.f70859d;
            PerformScaQuery performScaQuery = this.f70860e;
            C27764z0 z0Var = this.f70861f;
            if (z) {
                C41536l.m120488h(a, "");
                C32393w.m95660a(a, performScaQuery, z0Var.f70858b);
            }
            C7671c c = cVar.mo22380c(a.mo19789b());
            C41536l.m120488h(c, "this.requestHeaders(requestHeadersBuilder.build())");
            return c;
        }
    }

    public C27764z0(C36175k kVar, C10196h hVar) {
        C41536l.m120489i(kVar, "apolloRxFactory");
        C41536l.m120489i(hVar, "keyManager");
        this.f70857a = kVar;
        this.f70858b = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C35954n m85920f(String str, C7843j jVar) {
        CheckOperationQuery.ScaServices scaServices;
        CheckOperationQuery.CheckOperation checkOperation;
        C41536l.m120489i(str, "$operationId");
        C41536l.m120489i(jVar, "it");
        CheckOperationQuery.Data data = (CheckOperationQuery.Data) jVar.mo22784b();
        if (data == null || (scaServices = data.getScaServices()) == null || (checkOperation = scaServices.getCheckOperation()) == null) {
            return null;
        }
        return new C35954n(checkOperation.getOperationReference(), checkOperation.getScaAuthCode(), checkOperation.getRequireSCA(), str);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final String m85921g(C7843j jVar) {
        PerformScaQuery.ScaServices scaServices;
        C41536l.m120489i(jVar, "it");
        PerformScaQuery.Data data = (PerformScaQuery.Data) jVar.mo22784b();
        if (data == null || (scaServices = data.getScaServices()) == null) {
            return null;
        }
        return scaServices.getPerformSca();
    }

    /* renamed from: a */
    public C40762x mo67303a(String str, String str2, List list, boolean z) {
        C41536l.m120489i(str, "deviceId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(list, "authElements");
        PerformScaQuery performScaQuery = new PerformScaQuery(str2, str, list);
        C40762x A = C36175k.m107584j(this.f70857a, performScaQuery, false, new C27765a(z, performScaQuery, this), 2, (Object) null).mo95062A(new C27762y0());
        C41536l.m120488h(A, "override fun performSca(…vices?.performSca }\n    }");
        return A;
    }

    /* renamed from: b */
    public C40762x mo67304b(String str, String str2, List list) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, IRetrofitService.SERVICE_ID);
        C41536l.m120489i(list, "operationProperties");
        C40762x A = C36175k.m107584j(this.f70857a, new CheckOperationQuery(str, str2, list), false, (C43075l) null, 6, (Object) null).mo95062A(new C27760x0(str));
        C41536l.m120488h(A, "apolloRxFactory.createSi…)\n            }\n        }");
        return A;
    }
}

package dd1;

import ba1.C10146d0;
import ba1.C10199i;
import ba1.C10209n;
import com.google.gson.Gson;
import ed1.C40735b0;
import ed1.C40762x;
import he1.C41224m;
import he1.C41233s;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p217q2.C7833e;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import qa1.C27752w0;
import sso.type.InputOperationProperty;

/* renamed from: dd1.n */
public final class C40562n {

    /* renamed from: d */
    public static final C40563a f96168d = new C40563a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C27752w0 f96169a;

    /* renamed from: b */
    private final C10199i f96170b;

    /* renamed from: c */
    private final C10146d0.C10172e f96171c;

    /* renamed from: dd1.n$a */
    public static final class C40563a {
        private C40563a() {
        }

        public /* synthetic */ C40563a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C40562n(C27752w0 w0Var, C10199i iVar, C10146d0.C10172e eVar) {
        C41536l.m120489i(w0Var, "scaVerificationRepository");
        C41536l.m120489i(iVar, "localeManager");
        C41536l.m120489i(eVar, "config");
        this.f96169a = w0Var;
        this.f96170b = iVar;
        this.f96171c = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C41224m m117340d(String str, String str2) {
        C41536l.m120489i(str, "$operationId");
        C7833e.C7834a aVar = C7833e.f22754c;
        return new C41224m(str, C41339p.m119900e(new InputOperationProperty(aVar.mo22769c("operationData"), aVar.mo22769c(str2))));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C40735b0 m117341e(C40562n nVar, String str, C41224m mVar) {
        C41536l.m120489i(nVar, "this$0");
        C41536l.m120489i(str, "$serviceId");
        C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
        return nVar.f96169a.mo67304b((String) mVar.mo95675a(), str, (List) mVar.mo95676b());
    }

    /* renamed from: c */
    public final C40762x mo94590c(String str, Map map, boolean z) {
        String str2;
        C41536l.m120489i(str, IRetrofitService.SERVICE_ID);
        C41536l.m120489i(map, "data");
        String valueOf = String.valueOf(C10209n.f28259a.mo26776a());
        if (z) {
            str2 = new Gson().mo18181w(map);
        } else {
            Object obj = map.get("HEADERS_KEY");
            if (obj != null) {
                String token = C10146d0.C10159c.m37143b().getToken();
                C41536l.m120486f(token);
                str2 = new JSONObject(C41344r0.m119931m(C41233s.m119492a("headers", C41344r0.m119936r(C41344r0.m119931m(C41233s.m119492a("x-channel", this.f96171c.mo26726q().mo92939a()), C41233s.m119492a("x-lang", this.f96170b.mo26767a().mo88525e()), C41233s.m119492a("x-token", token), C41233s.m119492a("x-forwarded", "127.0.0.1"), C41233s.m119492a("x-operation-id", valueOf), C41233s.m119492a("x-service-id", str)), (Map) obj)), C41233s.m119492a("queryParams", map.get("QUERY_PARAMS_KEY")), C41233s.m119492a("payload", map.get("PAYLOAD_KEY")))).toString();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            }
        }
        C40762x r = C40762x.m118160v(new C40549l(valueOf, str2)).mo95087r(new C40555m(this, str));
        C41536l.m120488h(r, "fromCallable {\n         …tionProperties)\n        }");
        return r;
    }
}

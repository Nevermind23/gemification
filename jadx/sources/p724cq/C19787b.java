package p724cq;

import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p734dq.C20048a;

/* renamed from: cq.b */
public final class C19787b {

    /* renamed from: a */
    private final C20048a f54159a;

    public C19787b(C20048a aVar) {
        C41536l.m120489i(aVar, "bannersRepository");
        this.f54159a = aVar;
    }

    /* renamed from: a */
    public final C40762x mo48073a(String str) {
        C41536l.m120489i(str, IRetrofitService.SERVICE_ID);
        return this.f54159a.removeBanner(str);
    }
}

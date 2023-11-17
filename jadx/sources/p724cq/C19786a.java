package p724cq;

import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p734dq.C20048a;

/* renamed from: cq.a */
public final class C19786a {

    /* renamed from: a */
    private final C20048a f54158a;

    public C19786a(C20048a aVar) {
        C41536l.m120489i(aVar, "bannersRepository");
        this.f54158a = aVar;
    }

    /* renamed from: a */
    public final C40762x mo48072a(String str) {
        C41536l.m120489i(str, IRetrofitService.SERVICE_ID);
        return this.f54158a.bannerClicked(str);
    }
}

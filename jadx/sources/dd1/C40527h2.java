package dd1;

import ed1.C40749p;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.sso_client.network.ApiException;
import qa1.C27714f;

/* renamed from: dd1.h2 */
public final class C40527h2 {

    /* renamed from: a */
    private final C27714f f96117a;

    public C40527h2(C27714f fVar) {
        C41536l.m120489i(fVar, "loginRepository");
        this.f96117a = fVar;
    }

    /* renamed from: a */
    public final C40749p mo94563a() {
        return this.f96117a.mo67265d();
    }

    /* renamed from: b */
    public final void mo94564b(ApiException apiException) {
        C41536l.m120489i(apiException, "error");
        this.f96117a.mo67267f(apiException);
    }
}

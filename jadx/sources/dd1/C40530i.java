package dd1;

import ed1.C40734b;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.sso_client.models.C35952m;
import qa1.C27714f;

/* renamed from: dd1.i */
public final class C40530i {

    /* renamed from: a */
    private final C27714f f96120a;

    public C40530i(C27714f fVar) {
        C41536l.m120489i(fVar, "loginRepository");
        this.f96120a = fVar;
    }

    /* renamed from: a */
    public final C40734b mo94566a(C35952m mVar, C35952m mVar2) {
        C41536l.m120489i(mVar, "currentLocale");
        C41536l.m120489i(mVar2, "newLocale");
        C40734b A = this.f96120a.mo67271j(mVar, mVar2).mo94882A();
        C41536l.m120488h(A, "loginRepository.changeAp…       .onErrorComplete()");
        return A;
    }
}

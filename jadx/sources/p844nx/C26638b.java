package p844nx;

import ed1.C40734b;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.identityverification.data.repository.IdentityVerificationRepositoryImpl;
import p864px.C27639a;

/* renamed from: nx.b */
public final class C26638b {

    /* renamed from: a */
    private final C27639a f67262a;

    public C26638b(C27639a aVar) {
        C41536l.m120489i(aVar, "identityVerificationRepository");
        this.f67262a = aVar;
    }

    /* renamed from: a */
    public final C40734b mo65891a(IdentityVerificationRepositoryImpl.IdentityVerificationParams identityVerificationParams) {
        C41536l.m120489i(identityVerificationParams, "params");
        return this.f67262a.mo52242a(identityVerificationParams);
    }
}

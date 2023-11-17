package da1;

import ba1.C10146d0;
import he1.C41238w;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import sso.type.AuthElementType;

/* renamed from: da1.h */
public final class C12042h extends C12030b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12042h(C12038f fVar) {
        super(fVar);
        C41536l.m120489i(fVar, "context");
    }

    /* renamed from: a */
    public void mo32123a() {
        mo32124b();
        Set<AuthElementType> loginAuthTypes$sso_client_release = C10146d0.C10159c.m37143b().getLoginAuthTypes$sso_client_release();
        boolean z = false;
        if (loginAuthTypes$sso_client_release != null && loginAuthTypes$sso_client_release.contains(AuthElementType.PASSWORD)) {
            z = true;
        }
        if (z) {
            Boolean isPasswordChangeRequired$sso_client_release = C10146d0.C10159c.m37143b().isPasswordChangeRequired$sso_client_release();
            Boolean bool = Boolean.TRUE;
            if (C41536l.m120484d(isPasswordChangeRequired$sso_client_release, bool)) {
                mo32125c().mo32147f().mo4823o(C41238w.f97225a);
            } else if (C41536l.m120484d(C10146d0.C10159c.m37143b().isPasswordExpired$sso_client_release(), bool)) {
                mo32125c().mo32148g().mo4823o(C41238w.f97225a);
            } else {
                mo32127e();
            }
        } else {
            mo32127e();
        }
    }

    /* renamed from: f */
    public final void mo32167f() {
        mo32125c().mo32152k().mo4823o(C41238w.f97225a);
    }
}

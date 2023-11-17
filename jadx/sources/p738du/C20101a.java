package p738du;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p748eu.C20292b;
import p758fu.C20557a;

/* renamed from: du.a */
public final class C20101a {

    /* renamed from: a */
    public static final C20101a f54724a = new C20101a();

    private C20101a() {
    }

    /* renamed from: a */
    public final boolean mo48497a(C20292b bVar) {
        String str;
        C41536l.m120489i(bVar, "<this>");
        C20557a a = bVar.mo48774a("IS_GOOGLE_PAY_IN_APP_PROVISIONING_ENABLED");
        if (a != null) {
            str = a.mo49087d();
        } else {
            str = null;
        }
        return C41536l.m120484d(str, YesNoApiEntity.YES.getValue());
    }

    /* renamed from: b */
    public final boolean mo48498b(C20292b bVar) {
        C41536l.m120489i(bVar, "<this>");
        C20557a b = bVar.mo48775b("P2P_LINK");
        if (b != null) {
            return C41536l.m120484d(b.mo49084a(), Boolean.TRUE);
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo48499c(C20292b bVar) {
        C41536l.m120489i(bVar, "<this>");
        C20557a b = bVar.mo48775b("P2P_PAYMENT_TOPUP_I");
        if (b != null) {
            return C41536l.m120484d(b.mo49084a(), Boolean.TRUE);
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo48500d(C20292b bVar) {
        C41536l.m120489i(bVar, "<this>");
        C20557a b = bVar.mo48775b("P2P_PAYMENT_O");
        if (b != null) {
            return C41536l.m120484d(b.mo49084a(), Boolean.TRUE);
        }
        return false;
    }
}

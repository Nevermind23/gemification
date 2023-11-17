package ty0;

import ed1.C40734b;
import kotlin.jvm.internal.C41536l;
import sy0.C38606b;

/* renamed from: ty0.v0 */
public final class C38897v0 {

    /* renamed from: a */
    private final C38606b f92975a;

    public C38897v0(C38606b bVar) {
        C41536l.m120489i(bVar, "repository");
        this.f92975a = bVar;
    }

    /* renamed from: a */
    public final C40734b mo92593a(String str, String str2, long j, String str3) {
        C41536l.m120489i(str, "route");
        C41536l.m120489i(str2, "contact");
        C41536l.m120489i(str3, "confirmationCode");
        return this.f92975a.validateClientConfirmation(str, str2, j, str3);
    }
}

package ty0;

import ed1.C40734b;
import kotlin.jvm.internal.C41536l;
import sy0.C38606b;

/* renamed from: ty0.e */
public final class C38857e {

    /* renamed from: a */
    private final C38606b f92935a;

    public C38857e(C38606b bVar) {
        C41536l.m120489i(bVar, "repository");
        this.f92935a = bVar;
    }

    /* renamed from: a */
    public final C40734b mo92563a(String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "serviceKey");
        C41536l.m120489i(str2, "text");
        C41536l.m120489i(str3, "productReference");
        C41536l.m120489i(str4, "serviceStatus");
        C41536l.m120489i(str5, "clientType");
        return this.f92935a.confirmClientDocument(str, str2, str3, str4, str5);
    }
}

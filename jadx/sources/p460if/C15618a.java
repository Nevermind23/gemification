package p460if;

import com.salesforce.marketingcloud.storage.p385db.C11769i;
import kotlin.jvm.internal.C41536l;
import of1.C41944z;
import p460if.C15620c;
import p474jf.C15763a;
import p474jf.C15764b;
import p652we.C18561l;

/* renamed from: if.a */
public abstract class C15618a {
    /* renamed from: a */
    public static final C18561l.C18568b m56402a(C41944z zVar, String str) {
        C41536l.m120490j(zVar, "$this$newWebSocketFactory");
        C41536l.m120490j(str, C11769i.C11770a.f34149l);
        return m56403b(zVar, new C15764b(str));
    }

    /* renamed from: b */
    public static final C18561l.C18568b m56403b(C41944z zVar, C15763a aVar) {
        C41536l.m120490j(zVar, "$this$newWebSocketFactory");
        C41536l.m120490j(aVar, "requestFactory");
        return new C15620c.C15622b(new C15619b(zVar, aVar));
    }
}

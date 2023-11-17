package tm0;

import ed1.C40762x;
import j51.C36734f;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k51.C36874b;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.junior.domain.model.ClientPhoneSameAsChildsException;
import rm0.C28059g;

/* renamed from: tm0.c */
public final class C28469c {

    /* renamed from: a */
    private final C36734f f72273a;

    /* renamed from: b */
    private final C28059g f72274b;

    public C28469c(C36734f fVar, C28059g gVar) {
        C41536l.m120489i(fVar, "getClientPhones");
        C41536l.m120489i(gVar, "sendOtpToChild");
        this.f72273a = fVar;
        this.f72274b = gVar;
    }

    /* renamed from: b */
    private final boolean m87304b(String str, List list) {
        boolean z;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C36874b bVar = (C36874b) it.next();
            if (!bVar.mo89807b() || !C41536l.m120484d(m87305c(bVar.mo89806a()), m87305c(str))) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private static final String m87305c(String str) {
        return C40440x.m117172n0(C40440x.m117172n0(C40440x.m117146P0(str).toString(), "995"), "+995");
    }

    /* renamed from: a */
    public final C40762x mo68093a(String str) {
        C41536l.m120489i(str, "phone");
        if (!m87304b(str, this.f72273a.mo89561a())) {
            return this.f72274b.mo67601a(str);
        }
        C40762x o = C40762x.m118158o(ClientPhoneSameAsChildsException.f63513d);
        C41536l.m120488h(o, "error(\n            Clien…oneSameAsChildsException)");
        return o;
    }
}

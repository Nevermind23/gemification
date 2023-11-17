package mx0;

import com.google.gson.Gson;
import ed1.C40762x;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kx0.C37013a;
import lx0.C37178c;
import p341ge.bog.mobilebank.payments.domain.model.CommissionParameters;
import p341ge.bog.mobilebank.payments.domain.model.KeyValue;

/* renamed from: mx0.a */
public final class C37287a {

    /* renamed from: a */
    private final C37013a f89735a;

    public C37287a(C37013a aVar) {
        C41536l.m120489i(aVar, "repository");
        this.f89735a = aVar;
    }

    /* renamed from: a */
    public final C40762x mo90397a(String str, String str2, List list) {
        Object obj;
        boolean z;
        C41536l.m120489i(str, "essServiceId");
        C41536l.m120489i(str2, "randomString");
        C41536l.m120489i(list, "executeParameters");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((KeyValue) obj).mo80134a(), "amount")) {
                break;
            }
        }
        KeyValue keyValue = (KeyValue) obj;
        if (keyValue != null) {
            String b = keyValue.mo80135b();
            if (b == null || b.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return this.f89735a.mo89394W(str, str2, new Gson().mo18181w(C41339p.m119900e(new CommissionParameters(list, str))));
            }
        }
        C40762x z2 = C40762x.m118162z(C37178c.m109866a(str2));
        C41536l.m120488h(z2, "just(randomString.create…aymentCommissionObject())");
        return z2;
    }
}

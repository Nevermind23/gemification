package p615tg;

import he1.C41233s;
import java.util.Map;

/* renamed from: tg.b */
public final class C17961b {

    /* renamed from: a */
    public static final C17961b f51154a = new C17961b();

    /* renamed from: b */
    private static final Map f51155b = C41344r0.m119931m(C41233s.m119492a("GEL", "₾"), C41233s.m119492a("USD", "$"), C41233s.m119492a("EUR", "€"), C41233s.m119492a("GBP", "£"), C41233s.m119492a("TRY", "₺"), C41233s.m119492a("RUR", "₽"), C41233s.m119492a("AZN", "₼"), C41233s.m119492a("CHF", "₣"));

    private C17961b() {
    }

    /* renamed from: a */
    public final String mo45631a(String str) {
        String str2;
        Map map = f51155b;
        if (!map.containsValue(str) && (str2 = (String) map.get(str)) != null) {
            return str2;
        }
        return str;
    }
}

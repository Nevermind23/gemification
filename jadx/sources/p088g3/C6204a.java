package p088g3;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: g3.a */
public final class C6204a {

    /* renamed from: b */
    public static final C6204a f19214b = new C6204a(Collections.emptyMap());

    /* renamed from: a */
    private final Map f19215a;

    /* renamed from: g3.a$a */
    public static final class C6205a {

        /* renamed from: a */
        private final Map f19216a = new LinkedHashMap();

        /* renamed from: a */
        public C6205a mo19788a(String str, String str2) {
            this.f19216a.put(str, str2);
            return this;
        }

        /* renamed from: b */
        public C6204a mo19789b() {
            return new C6204a(this.f19216a);
        }
    }

    C6204a(Map map) {
        this.f19215a = map;
    }

    /* renamed from: a */
    public static C6205a m24692a() {
        return new C6205a();
    }

    /* renamed from: b */
    public String mo19786b(String str) {
        return (String) this.f19215a.get(str);
    }

    /* renamed from: c */
    public Set mo19787c() {
        return this.f19215a.keySet();
    }
}

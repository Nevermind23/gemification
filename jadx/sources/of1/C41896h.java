package of1;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C41536l;

/* renamed from: of1.h */
public final class C41896h {

    /* renamed from: a */
    private final String f98364a;

    /* renamed from: b */
    private final Map f98365b;

    public C41896h(String str, Map map) {
        String str2;
        C41536l.m120489i(str, "scheme");
        C41536l.m120489i(map, "authParams");
        this.f98364a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            if (str3 == null) {
                str2 = null;
            } else {
                Locale locale = Locale.US;
                C41536l.m120488h(locale, "US");
                str2 = str3.toLowerCase(locale);
                C41536l.m120488h(str2, "this as java.lang.String).toLowerCase(locale)");
            }
            linkedHashMap.put(str2, str4);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C41536l.m120488h(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f98365b = unmodifiableMap;
    }

    /* renamed from: a */
    public final Charset mo96820a() {
        String str = (String) this.f98365b.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                C41536l.m120488h(forName, "forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        C41536l.m120488h(charset, "ISO_8859_1");
        return charset;
    }

    /* renamed from: b */
    public final String mo96821b() {
        return (String) this.f98365b.get("realm");
    }

    /* renamed from: c */
    public final String mo96822c() {
        return this.f98364a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C41896h) {
            C41896h hVar = (C41896h) obj;
            if (!C41536l.m120484d(hVar.f98364a, this.f98364a) || !C41536l.m120484d(hVar.f98365b, this.f98365b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.f98364a.hashCode()) * 31) + this.f98365b.hashCode();
    }

    public String toString() {
        return this.f98364a + " authParams=" + this.f98365b;
    }
}

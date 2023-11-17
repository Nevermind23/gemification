package p081f9;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p027b9.C2184f;
import p068e9.C6063h;

/* renamed from: f9.b */
class C6172b {

    /* renamed from: a */
    private final Map f19145a = new HashMap();

    /* renamed from: b */
    private final int f19146b;

    /* renamed from: c */
    private final int f19147c;

    public C6172b(int i, int i2) {
        this.f19146b = i;
        this.f19147c = i2;
    }

    /* renamed from: b */
    private String m24595b(String str) {
        if (str != null) {
            return m24596c(str, this.f19147c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    /* renamed from: c */
    public static String m24596c(String str, int i) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        if (trim.length() > i) {
            return trim.substring(0, i);
        }
        return trim;
    }

    /* renamed from: a */
    public synchronized Map mo19741a() {
        return Collections.unmodifiableMap(new HashMap(this.f19145a));
    }

    /* renamed from: d */
    public synchronized boolean mo19742d(String str, String str2) {
        String b = m24595b(str);
        if (this.f19145a.size() >= this.f19146b) {
            if (!this.f19145a.containsKey(b)) {
                C2184f f = C2184f.m8346f();
                f.mo7097k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f19146b);
                return false;
            }
        }
        String c = m24596c(str2, this.f19147c);
        if (C6063h.m24207B((String) this.f19145a.get(b), c)) {
            return false;
        }
        Map map = this.f19145a;
        if (str2 == null) {
            c = "";
        }
        map.put(b, c);
        return true;
    }

    /* renamed from: e */
    public synchronized void mo19743e(Map map) {
        String str;
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            String b = m24595b((String) entry.getKey());
            if (this.f19145a.size() >= this.f19146b) {
                if (!this.f19145a.containsKey(b)) {
                    i++;
                }
            }
            String str2 = (String) entry.getValue();
            Map map2 = this.f19145a;
            if (str2 == null) {
                str = "";
            } else {
                str = m24596c(str2, this.f19147c);
            }
            map2.put(b, str);
        }
        if (i > 0) {
            C2184f f = C2184f.m8346f();
            f.mo7097k("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f19146b);
        }
    }
}

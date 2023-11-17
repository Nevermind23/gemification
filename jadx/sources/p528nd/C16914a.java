package p528nd;

import java.util.HashMap;
import java.util.Map;
import p472jd.C15746c;
import p472jd.C15749f;
import p472jd.C15750g;
import p472jd.C15752i;
import p472jd.C15757n;

/* renamed from: nd.a */
public class C16914a {

    /* renamed from: a */
    private static C16914a f47251a;

    /* renamed from: b */
    private static final Map f47252b;

    /* renamed from: c */
    private static final Map f47253c;

    /* renamed from: d */
    private static final Map f47254d;

    /* renamed from: e */
    private static final Map f47255e;

    static {
        HashMap hashMap = new HashMap();
        f47252b = hashMap;
        HashMap hashMap2 = new HashMap();
        f47253c = hashMap2;
        HashMap hashMap3 = new HashMap();
        f47254d = hashMap3;
        HashMap hashMap4 = new HashMap();
        f47255e = hashMap4;
        hashMap.put(C15750g.OFF, "off");
        hashMap.put(C15750g.ON, "on");
        hashMap.put(C15750g.AUTO, "auto");
        hashMap.put(C15750g.TORCH, "torch");
        hashMap3.put(C15749f.BACK, 0);
        hashMap3.put(C15749f.FRONT, 1);
        hashMap2.put(C15757n.AUTO, "auto");
        hashMap2.put(C15757n.INCANDESCENT, "incandescent");
        hashMap2.put(C15757n.FLUORESCENT, "fluorescent");
        hashMap2.put(C15757n.DAYLIGHT, "daylight");
        hashMap2.put(C15757n.CLOUDY, "cloudy-daylight");
        hashMap4.put(C15752i.OFF, "auto");
        hashMap4.put(C15752i.ON, "hdr");
    }

    private C16914a() {
    }

    /* renamed from: a */
    public static C16914a m59497a() {
        if (f47251a == null) {
            f47251a = new C16914a();
        }
        return f47251a;
    }

    /* renamed from: f */
    private C15746c m59498f(Map map, Object obj) {
        for (C15746c cVar : map.keySet()) {
            if (obj.equals(map.get(cVar))) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public int mo44075b(C15749f fVar) {
        return ((Integer) f47254d.get(fVar)).intValue();
    }

    /* renamed from: c */
    public String mo44076c(C15750g gVar) {
        return (String) f47252b.get(gVar);
    }

    /* renamed from: d */
    public String mo44077d(C15752i iVar) {
        return (String) f47255e.get(iVar);
    }

    /* renamed from: e */
    public String mo44078e(C15757n nVar) {
        return (String) f47253c.get(nVar);
    }

    /* renamed from: g */
    public C15749f mo44079g(int i) {
        return (C15749f) m59498f(f47254d, Integer.valueOf(i));
    }

    /* renamed from: h */
    public C15750g mo44080h(String str) {
        return (C15750g) m59498f(f47252b, str);
    }

    /* renamed from: i */
    public C15752i mo44081i(String str) {
        return (C15752i) m59498f(f47255e, str);
    }

    /* renamed from: j */
    public C15757n mo44082j(String str) {
        return (C15757n) m59498f(f47253c, str);
    }
}

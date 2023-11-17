package p528nd;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p472jd.C15746c;
import p472jd.C15749f;
import p472jd.C15750g;
import p472jd.C15752i;
import p472jd.C15757n;

/* renamed from: nd.b */
public class C16915b {

    /* renamed from: a */
    private static C16915b f47256a;

    /* renamed from: b */
    private static final Map f47257b;

    /* renamed from: c */
    private static final Map f47258c;

    /* renamed from: d */
    private static final Map f47259d;

    /* renamed from: nd.b$a */
    static /* synthetic */ class C16916a {

        /* renamed from: a */
        static final /* synthetic */ int[] f47260a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                jd.g[] r0 = p472jd.C15750g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f47260a = r0
                jd.g r1 = p472jd.C15750g.ON     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47260a     // Catch:{ NoSuchFieldError -> 0x001d }
                jd.g r1 = p472jd.C15750g.AUTO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47260a     // Catch:{ NoSuchFieldError -> 0x0028 }
                jd.g r1 = p472jd.C15750g.OFF     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47260a     // Catch:{ NoSuchFieldError -> 0x0033 }
                jd.g r1 = p472jd.C15750g.TORCH     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p528nd.C16915b.C16916a.<clinit>():void");
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f47257b = hashMap;
        HashMap hashMap2 = new HashMap();
        f47258c = hashMap2;
        HashMap hashMap3 = new HashMap();
        f47259d = hashMap3;
        hashMap.put(C15749f.BACK, 1);
        hashMap.put(C15749f.FRONT, 0);
        hashMap2.put(C15757n.AUTO, 1);
        hashMap2.put(C15757n.CLOUDY, 6);
        hashMap2.put(C15757n.DAYLIGHT, 5);
        hashMap2.put(C15757n.FLUORESCENT, 3);
        hashMap2.put(C15757n.INCANDESCENT, 2);
        hashMap3.put(C15752i.OFF, 0);
        hashMap3.put(C15752i.ON, 18);
    }

    private C16915b() {
    }

    /* renamed from: a */
    public static C16915b m59507a() {
        if (f47256a == null) {
            f47256a = new C16915b();
        }
        return f47256a;
    }

    /* renamed from: f */
    private C15746c m59508f(Map map, Object obj) {
        for (C15746c cVar : map.keySet()) {
            if (obj.equals(map.get(cVar))) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public int mo44083b(C15749f fVar) {
        return ((Integer) f47257b.get(fVar)).intValue();
    }

    /* renamed from: c */
    public List mo44084c(C15750g gVar) {
        ArrayList arrayList = new ArrayList();
        int i = C16916a.f47260a[gVar.ordinal()];
        if (i == 1) {
            arrayList.add(new Pair(3, 0));
        } else if (i == 2) {
            arrayList.add(new Pair(2, 0));
            arrayList.add(new Pair(4, 0));
        } else if (i == 3) {
            arrayList.add(new Pair(1, 0));
            arrayList.add(new Pair(0, 0));
        } else if (i == 4) {
            arrayList.add(new Pair(1, 2));
            arrayList.add(new Pair(0, 2));
        }
        return arrayList;
    }

    /* renamed from: d */
    public int mo44085d(C15752i iVar) {
        return ((Integer) f47259d.get(iVar)).intValue();
    }

    /* renamed from: e */
    public int mo44086e(C15757n nVar) {
        return ((Integer) f47258c.get(nVar)).intValue();
    }

    /* renamed from: g */
    public C15749f mo44087g(int i) {
        return (C15749f) m59508f(f47257b, Integer.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r3 != 4) goto L_0x002a;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set mo44088h(int r3) {
        /*
            r2 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            if (r3 == 0) goto L_0x0020
            r1 = 1
            if (r3 == r1) goto L_0x0020
            r1 = 2
            if (r3 == r1) goto L_0x001a
            r1 = 3
            if (r3 == r1) goto L_0x0014
            r1 = 4
            if (r3 == r1) goto L_0x001a
            goto L_0x002a
        L_0x0014:
            jd.g r3 = p472jd.C15750g.ON
            r0.add(r3)
            goto L_0x002a
        L_0x001a:
            jd.g r3 = p472jd.C15750g.AUTO
            r0.add(r3)
            goto L_0x002a
        L_0x0020:
            jd.g r3 = p472jd.C15750g.OFF
            r0.add(r3)
            jd.g r3 = p472jd.C15750g.TORCH
            r0.add(r3)
        L_0x002a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p528nd.C16915b.mo44088h(int):java.util.Set");
    }

    /* renamed from: i */
    public C15752i mo44089i(int i) {
        return (C15752i) m59508f(f47259d, Integer.valueOf(i));
    }

    /* renamed from: j */
    public C15757n mo44090j(int i) {
        return (C15757n) m59508f(f47258c, Integer.valueOf(i));
    }
}

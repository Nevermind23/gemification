package p035c4;

import p166m3.C7083e;
import p192o3.C7423a;

/* renamed from: c4.h */
public class C2256h extends C2247a {

    /* renamed from: D */
    private static C2256h f7029D;

    /* renamed from: E */
    private static C2256h f7030E;

    /* renamed from: A0 */
    public static C2256h m8673A0(C7423a aVar) {
        return (C2256h) new C2256h().mo7228g(aVar);
    }

    /* renamed from: B0 */
    public static C2256h m8674B0(C7083e eVar) {
        return (C2256h) new C2256h().mo7238m0(eVar);
    }

    /* renamed from: C0 */
    public static C2256h m8675C0(boolean z) {
        if (z) {
            if (f7029D == null) {
                f7029D = (C2256h) ((C2256h) new C2256h().mo7242o0(true)).mo7217b();
            }
            return f7029D;
        }
        if (f7030E == null) {
            f7030E = (C2256h) ((C2256h) new C2256h().mo7242o0(false)).mo7217b();
        }
        return f7030E;
    }

    /* renamed from: z0 */
    public static C2256h m8676z0(Class cls) {
        return (C2256h) new C2256h().mo7227f(cls);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2256h) && super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }
}

package p374ce;

import java.util.HashMap;

/* renamed from: ce.a */
public class C10395a implements Comparable {

    /* renamed from: f */
    static final HashMap f29601f = new HashMap(16);

    /* renamed from: d */
    private final int f29602d;

    /* renamed from: e */
    private final int f29603e;

    private C10395a(int i, int i2) {
        this.f29602d = i;
        this.f29603e = i2;
    }

    /* renamed from: c */
    private static int m37799c(int i, int i2) {
        while (true) {
            int i3 = i2;
            int i4 = i;
            i = i3;
            if (i == 0) {
                return i4;
            }
            i2 = i4 % i;
        }
    }

    /* renamed from: f */
    public static C10395a m37800f(int i, int i2) {
        int c = m37799c(i, i2);
        if (c > 0) {
            i /= c;
        }
        if (c > 0) {
            i2 /= c;
        }
        String str = i + ":" + i2;
        HashMap hashMap = f29601f;
        C10395a aVar = (C10395a) hashMap.get(str);
        if (aVar != null) {
            return aVar;
        }
        C10395a aVar2 = new C10395a(i, i2);
        hashMap.put(str, aVar2);
        return aVar2;
    }

    /* renamed from: g */
    public static C10395a m37801g(C10396b bVar) {
        return m37800f(bVar.mo27062e(), bVar.mo27060c());
    }

    /* renamed from: h */
    public static C10395a m37802h(String str) {
        String[] split = str.split(":");
        if (split.length == 2) {
            return m37800f(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
        }
        throw new NumberFormatException("Illegal AspectRatio string. Must be x:y");
    }

    /* renamed from: a */
    public int compareTo(C10395a aVar) {
        return Float.compare(mo27056j(), aVar.mo27056j());
    }

    /* renamed from: b */
    public C10395a mo27051b() {
        return m37800f(this.f29603e, this.f29602d);
    }

    /* renamed from: e */
    public boolean mo27053e(C10396b bVar, float f) {
        return Math.abs(mo27056j() - m37801g(bVar).mo27056j()) <= f;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10395a) || mo27056j() != ((C10395a) obj).mo27056j()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Float.floatToIntBits(mo27056j());
    }

    /* renamed from: j */
    public float mo27056j() {
        return ((float) this.f29602d) / ((float) this.f29603e);
    }

    public String toString() {
        return this.f29602d + ":" + this.f29603e;
    }
}

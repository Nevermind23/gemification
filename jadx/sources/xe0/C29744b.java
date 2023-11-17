package xe0;

import kotlin.jvm.internal.C41536l;

/* renamed from: xe0.b */
public final class C29744b {

    /* renamed from: a */
    private final double f75178a;

    /* renamed from: b */
    private final String f75179b;

    public C29744b(double d, String str) {
        C41536l.m120489i(str, "dictionaryKey");
        this.f75178a = d;
        this.f75179b = str;
    }

    /* renamed from: a */
    public final double mo69757a() {
        return this.f75178a;
    }

    /* renamed from: b */
    public final String mo69758b() {
        return this.f75179b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29744b)) {
            return false;
        }
        C29744b bVar = (C29744b) obj;
        return Double.compare(this.f75178a, bVar.f75178a) == 0 && C41536l.m120484d(this.f75179b, bVar.f75179b);
    }

    public int hashCode() {
        return (Double.doubleToLongBits(this.f75178a) * 31) + this.f75179b.hashCode();
    }

    public String toString() {
        double d = this.f75178a;
        String str = this.f75179b;
        return "BuySellDefaultAmount(amount=" + d + ", dictionaryKey=" + str + ")";
    }
}

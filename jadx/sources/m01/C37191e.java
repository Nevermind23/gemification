package m01;

import kotlin.jvm.internal.C41536l;

/* renamed from: m01.e */
public final class C37191e {

    /* renamed from: a */
    private final int f89571a;

    /* renamed from: b */
    private final String f89572b;

    /* renamed from: c */
    private final int f89573c;

    /* renamed from: d */
    private final int f89574d;

    /* renamed from: e */
    private final int f89575e;

    public C37191e(int i, String str, int i2, int i3, int i4) {
        C41536l.m120489i(str, "currency");
        this.f89571a = i;
        this.f89572b = str;
        this.f89573c = i2;
        this.f89574d = i3;
        this.f89575e = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37191e)) {
            return false;
        }
        C37191e eVar = (C37191e) obj;
        return this.f89571a == eVar.f89571a && C41536l.m120484d(this.f89572b, eVar.f89572b) && this.f89573c == eVar.f89573c && this.f89574d == eVar.f89574d && this.f89575e == eVar.f89575e;
    }

    public int hashCode() {
        return (((((((this.f89571a * 31) + this.f89572b.hashCode()) * 31) + this.f89573c) * 31) + this.f89574d) * 31) + this.f89575e;
    }

    public String toString() {
        int i = this.f89571a;
        String str = this.f89572b;
        int i2 = this.f89573c;
        int i3 = this.f89574d;
        int i4 = this.f89575e;
        return "AtmDenominations(denomination=" + i + ", currency=" + str + ", count=" + i2 + ", minCount=" + i3 + ", exponent=" + i4 + ")";
    }
}

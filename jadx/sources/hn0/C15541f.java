package hn0;

import kotlin.jvm.internal.C41536l;

/* renamed from: hn0.f */
public final class C15541f {

    /* renamed from: a */
    private final int f44112a;

    /* renamed from: b */
    private final String f44113b;

    public C15541f(int i, String str) {
        C41536l.m120489i(str, "positionName");
        this.f44112a = i;
        this.f44113b = str;
    }

    /* renamed from: a */
    public final int mo42681a() {
        return this.f44112a;
    }

    /* renamed from: b */
    public final String mo42682b() {
        return this.f44113b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15541f)) {
            return false;
        }
        C15541f fVar = (C15541f) obj;
        return this.f44112a == fVar.f44112a && C41536l.m120484d(this.f44113b, fVar.f44113b);
    }

    public int hashCode() {
        return (this.f44112a * 31) + this.f44113b.hashCode();
    }

    public String toString() {
        int i = this.f44112a;
        String str = this.f44113b;
        return "JobPosition(id=" + i + ", positionName=" + str + ")";
    }
}

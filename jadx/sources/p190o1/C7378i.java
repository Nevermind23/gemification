package p190o1;

import kotlin.jvm.internal.C41536l;

/* renamed from: o1.i */
public final class C7378i {

    /* renamed from: a */
    public final String f21601a;

    /* renamed from: b */
    private final int f21602b;

    /* renamed from: c */
    public final int f21603c;

    public C7378i(String str, int i, int i2) {
        C41536l.m120489i(str, "workSpecId");
        this.f21601a = str;
        this.f21602b = i;
        this.f21603c = i2;
    }

    /* renamed from: a */
    public final int mo21757a() {
        return this.f21602b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7378i)) {
            return false;
        }
        C7378i iVar = (C7378i) obj;
        return C41536l.m120484d(this.f21601a, iVar.f21601a) && this.f21602b == iVar.f21602b && this.f21603c == iVar.f21603c;
    }

    public int hashCode() {
        return (((this.f21601a.hashCode() * 31) + this.f21602b) * 31) + this.f21603c;
    }

    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.f21601a + ", generation=" + this.f21602b + ", systemId=" + this.f21603c + ')';
    }
}

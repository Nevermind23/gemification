package m11;

import kotlin.jvm.internal.C41536l;

/* renamed from: m11.c */
public final class C37203c {

    /* renamed from: a */
    private final C37202b f89615a;

    public C37203c(C37202b bVar) {
        this.f89615a = bVar;
    }

    /* renamed from: a */
    public final C37202b mo90266a() {
        return this.f89615a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37203c) && C41536l.m120484d(this.f89615a, ((C37203c) obj).f89615a);
    }

    public int hashCode() {
        C37202b bVar = this.f89615a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public String toString() {
        C37202b bVar = this.f89615a;
        return "PreLoginBackgroundResult(background=" + bVar + ")";
    }
}

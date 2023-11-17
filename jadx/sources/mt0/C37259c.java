package mt0;

import kotlin.jvm.internal.C41536l;

/* renamed from: mt0.c */
public final class C37259c {

    /* renamed from: a */
    private final String f89699a;

    /* renamed from: b */
    private final boolean f89700b;

    public C37259c(String str, boolean z) {
        C41536l.m120489i(str, "text");
        this.f89699a = str;
        this.f89700b = z;
    }

    /* renamed from: a */
    public final boolean mo90350a() {
        return this.f89700b;
    }

    /* renamed from: b */
    public final String mo90351b() {
        return this.f89699a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37259c)) {
            return false;
        }
        C37259c cVar = (C37259c) obj;
        return C41536l.m120484d(this.f89699a, cVar.f89699a) && this.f89700b == cVar.f89700b;
    }

    public int hashCode() {
        int hashCode = this.f89699a.hashCode() * 31;
        boolean z = this.f89700b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.f89699a;
        boolean z = this.f89700b;
        return "PiggyBankActionButtonState(text=" + str + ", enabled=" + z + ")";
    }
}

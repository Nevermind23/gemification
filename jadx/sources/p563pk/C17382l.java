package p563pk;

import kotlin.jvm.internal.C41536l;

/* renamed from: pk.l */
public final class C17382l {

    /* renamed from: a */
    private final String f48774a;

    public C17382l(String str) {
        C41536l.m120489i(str, "policyUrl");
        this.f48774a = str;
    }

    /* renamed from: a */
    public final String mo44883a() {
        return this.f48774a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17382l) && C41536l.m120484d(this.f48774a, ((C17382l) obj).f48774a);
    }

    public int hashCode() {
        return this.f48774a.hashCode();
    }

    public String toString() {
        String str = this.f48774a;
        return "PolicyUrl(policyUrl=" + str + ")";
    }
}

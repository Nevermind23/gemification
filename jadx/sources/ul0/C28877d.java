package ul0;

import kotlin.jvm.internal.C41536l;

/* renamed from: ul0.d */
public final class C28877d {

    /* renamed from: a */
    private final String f73712a;

    public C28877d(String str) {
        this.f73712a = str;
    }

    /* renamed from: a */
    public final String mo68616a() {
        return this.f73712a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28877d) && C41536l.m120484d(this.f73712a, ((C28877d) obj).f73712a);
    }

    public int hashCode() {
        String str = this.f73712a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.f73712a;
        return "PolicyUrl(policyUrl=" + str + ")";
    }
}

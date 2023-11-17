package ci0;

import kotlin.jvm.internal.C41536l;

/* renamed from: ci0.c */
public final class C19759c {

    /* renamed from: a */
    private final String f54119a;

    /* renamed from: b */
    private final String f54120b;

    public C19759c(String str, String str2) {
        this.f54119a = str;
        this.f54120b = str2;
    }

    /* renamed from: a */
    public final String mo47966a() {
        return this.f54120b;
    }

    /* renamed from: b */
    public final String mo47967b() {
        return this.f54119a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19759c)) {
            return false;
        }
        C19759c cVar = (C19759c) obj;
        return C41536l.m120484d(this.f54119a, cVar.f54119a) && C41536l.m120484d(this.f54120b, cVar.f54120b);
    }

    public int hashCode() {
        String str = this.f54119a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f54120b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f54119a;
        String str2 = this.f54120b;
        return "AmountInputInfoText(minimumLimit=" + str + ", maximumLimit=" + str2 + ")";
    }
}

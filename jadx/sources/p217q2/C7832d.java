package p217q2;

import kotlin.jvm.internal.C41536l;

/* renamed from: q2.d */
public final class C7832d {

    /* renamed from: a */
    private final String f22752a;

    /* renamed from: b */
    private final String f22753b;

    public C7832d(String str, String str2) {
        C41536l.m120490j(str, "mimetype");
        C41536l.m120490j(str2, "filePath");
        this.f22752a = str;
        this.f22753b = str2;
    }

    /* renamed from: a */
    public final String mo22761a() {
        return this.f22753b;
    }

    /* renamed from: b */
    public final String mo22762b() {
        return this.f22752a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7832d)) {
            return false;
        }
        C7832d dVar = (C7832d) obj;
        if (!(!C41536l.m120484d(this.f22752a, dVar.f22752a)) && !(!C41536l.m120484d(this.f22753b, dVar.f22753b))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f22752a.hashCode() * 31) + this.f22753b.hashCode();
    }
}

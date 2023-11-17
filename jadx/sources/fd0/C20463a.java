package fd0;

import kotlin.jvm.internal.C41536l;

/* renamed from: fd0.a */
public final class C20463a {

    /* renamed from: a */
    private final String f55463a;

    /* renamed from: b */
    private final String f55464b;

    /* renamed from: c */
    private final String f55465c;

    /* renamed from: d */
    private final int f55466d;

    public C20463a(String str, String str2, String str3, int i) {
        C41536l.m120489i(str, "lookupName");
        C41536l.m120489i(str2, "lookupValue");
        C41536l.m120489i(str3, "dictionaryKey");
        this.f55463a = str;
        this.f55464b = str2;
        this.f55465c = str3;
        this.f55466d = i;
    }

    /* renamed from: a */
    public final String mo49001a() {
        return this.f55465c;
    }

    /* renamed from: b */
    public final String mo49002b() {
        return this.f55463a;
    }

    /* renamed from: c */
    public final String mo49003c() {
        return this.f55464b;
    }

    /* renamed from: d */
    public final int mo49004d() {
        return this.f55466d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20463a)) {
            return false;
        }
        C20463a aVar = (C20463a) obj;
        return C41536l.m120484d(this.f55463a, aVar.f55463a) && C41536l.m120484d(this.f55464b, aVar.f55464b) && C41536l.m120484d(this.f55465c, aVar.f55465c) && this.f55466d == aVar.f55466d;
    }

    public int hashCode() {
        return (((((this.f55463a.hashCode() * 31) + this.f55464b.hashCode()) * 31) + this.f55465c.hashCode()) * 31) + this.f55466d;
    }

    public String toString() {
        String str = this.f55463a;
        String str2 = this.f55464b;
        String str3 = this.f55465c;
        int i = this.f55466d;
        return "Lookup(lookupName=" + str + ", lookupValue=" + str2 + ", dictionaryKey=" + str3 + ", orderNumber=" + i + ")";
    }
}

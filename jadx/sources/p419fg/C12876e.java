package p419fg;

import kotlin.jvm.internal.C41536l;

/* renamed from: fg.e */
public final class C12876e {

    /* renamed from: a */
    private final String f38032a;

    /* renamed from: b */
    private final String f38033b;

    public C12876e(String str, String str2) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(str2, "payload");
        this.f38032a = str;
        this.f38033b = str2;
    }

    /* renamed from: a */
    public final String mo33577a() {
        return this.f38033b;
    }

    /* renamed from: b */
    public final String mo33578b() {
        return this.f38032a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12876e)) {
            return false;
        }
        C12876e eVar = (C12876e) obj;
        return C41536l.m120484d(this.f38032a, eVar.f38032a) && C41536l.m120484d(this.f38033b, eVar.f38033b);
    }

    public int hashCode() {
        return (this.f38032a.hashCode() * 31) + this.f38033b.hashCode();
    }

    public String toString() {
        String str = this.f38032a;
        String str2 = this.f38033b;
        return "Choice(title=" + str + ", payload=" + str2 + ")";
    }
}

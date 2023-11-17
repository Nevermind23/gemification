package n80;

import kotlin.jvm.internal.C41536l;

/* renamed from: n80.d */
public final class C26380d {

    /* renamed from: a */
    private final String f66843a;

    /* renamed from: b */
    private final String f66844b;

    public C26380d(String str, String str2) {
        C41536l.m120489i(str, "fileName");
        C41536l.m120489i(str2, "fileContent");
        this.f66843a = str;
        this.f66844b = str2;
    }

    /* renamed from: a */
    public final String mo65600a() {
        return this.f66844b;
    }

    /* renamed from: b */
    public final String mo65601b() {
        return this.f66843a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26380d)) {
            return false;
        }
        C26380d dVar = (C26380d) obj;
        return C41536l.m120484d(this.f66843a, dVar.f66843a) && C41536l.m120484d(this.f66844b, dVar.f66844b);
    }

    public int hashCode() {
        return (this.f66843a.hashCode() * 31) + this.f66844b.hashCode();
    }

    public String toString() {
        String str = this.f66843a;
        String str2 = this.f66844b;
        return "FileModel(fileName=" + str + ", fileContent=" + str2 + ")";
    }
}

package xy0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: xy0.a */
public final class C39934a {

    /* renamed from: a */
    private final String f94732a;

    /* renamed from: b */
    private final String f94733b;

    /* renamed from: c */
    private final List f94734c;

    public C39934a(String str, String str2, List list) {
        C41536l.m120489i(str, "postDate");
        C41536l.m120489i(str2, "entryComment");
        C41536l.m120489i(list, "amounts");
        this.f94732a = str;
        this.f94733b = str2;
        this.f94734c = list;
    }

    /* renamed from: a */
    public final List mo93665a() {
        return this.f94734c;
    }

    /* renamed from: b */
    public final String mo93666b() {
        return this.f94733b;
    }

    /* renamed from: c */
    public final String mo93667c() {
        return this.f94732a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39934a)) {
            return false;
        }
        C39934a aVar = (C39934a) obj;
        return C41536l.m120484d(this.f94732a, aVar.f94732a) && C41536l.m120484d(this.f94733b, aVar.f94733b) && C41536l.m120484d(this.f94734c, aVar.f94734c);
    }

    public int hashCode() {
        return (((this.f94732a.hashCode() * 31) + this.f94733b.hashCode()) * 31) + this.f94734c.hashCode();
    }

    public String toString() {
        String str = this.f94732a;
        String str2 = this.f94733b;
        List list = this.f94734c;
        return "AccountStatement(postDate=" + str + ", entryComment=" + str2 + ", amounts=" + list + ")";
    }
}

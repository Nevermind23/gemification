package p419fg;

import com.salesforce.marketingcloud.storage.p385db.C11769i;
import kotlin.jvm.internal.C41536l;

/* renamed from: fg.b */
public final class C12873b {

    /* renamed from: a */
    private final String f38021a;

    /* renamed from: b */
    private final String f38022b;

    /* renamed from: c */
    private final String f38023c;

    /* renamed from: d */
    private final String f38024d;

    public C12873b(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(str2, C11769i.C11770a.f34149l);
        C41536l.m120489i(str3, "name");
        C41536l.m120489i(str4, "extension");
        this.f38021a = str;
        this.f38022b = str2;
        this.f38023c = str3;
        this.f38024d = str4;
    }

    /* renamed from: a */
    public final String mo33559a() {
        return this.f38024d;
    }

    /* renamed from: b */
    public final String mo33560b() {
        return this.f38023c;
    }

    /* renamed from: c */
    public final String mo33561c() {
        return this.f38021a;
    }

    /* renamed from: d */
    public final String mo33562d() {
        return this.f38022b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12873b)) {
            return false;
        }
        C12873b bVar = (C12873b) obj;
        return C41536l.m120484d(this.f38021a, bVar.f38021a) && C41536l.m120484d(this.f38022b, bVar.f38022b) && C41536l.m120484d(this.f38023c, bVar.f38023c) && C41536l.m120484d(this.f38024d, bVar.f38024d);
    }

    public int hashCode() {
        return (((((this.f38021a.hashCode() * 31) + this.f38022b.hashCode()) * 31) + this.f38023c.hashCode()) * 31) + this.f38024d.hashCode();
    }

    public String toString() {
        String str = this.f38021a;
        String str2 = this.f38022b;
        String str3 = this.f38023c;
        String str4 = this.f38024d;
        return "BotFile(title=" + str + ", url=" + str2 + ", name=" + str3 + ", extension=" + str4 + ")";
    }
}

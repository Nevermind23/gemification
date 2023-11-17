package p589ri;

import cf1.C40419j;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ri.a */
public final class C17617a {

    /* renamed from: a */
    private final String f49331a;

    /* renamed from: b */
    private final List f49332b;

    /* renamed from: c */
    private final String f49333c;

    /* renamed from: d */
    private C40419j f49334d;

    public C17617a(String str, List list, String str2, C40419j jVar) {
        C41536l.m120489i(str, "maskText");
        C41536l.m120489i(list, "placeHolders");
        this.f49331a = str;
        this.f49332b = list;
        this.f49333c = str2;
        this.f49334d = jVar;
    }

    /* renamed from: a */
    public final C17617a mo45194a(String str, List list, String str2, C40419j jVar) {
        C41536l.m120489i(str, "maskText");
        C41536l.m120489i(list, "placeHolders");
        return new C17617a(str, list, str2, jVar);
    }

    /* renamed from: b */
    public final String mo45195b() {
        return this.f49331a;
    }

    /* renamed from: c */
    public final C40419j mo45196c() {
        return this.f49334d;
    }

    /* renamed from: d */
    public final List mo45197d() {
        return this.f49332b;
    }

    /* renamed from: e */
    public final String mo45198e() {
        return this.f49333c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17617a)) {
            return false;
        }
        C17617a aVar = (C17617a) obj;
        return C41536l.m120484d(this.f49331a, aVar.f49331a) && C41536l.m120484d(this.f49332b, aVar.f49332b) && C41536l.m120484d(this.f49333c, aVar.f49333c) && C41536l.m120484d(this.f49334d, aVar.f49334d);
    }

    public int hashCode() {
        int hashCode = ((this.f49331a.hashCode() * 31) + this.f49332b.hashCode()) * 31;
        String str = this.f49333c;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C40419j jVar = this.f49334d;
        if (jVar != null) {
            i = jVar.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.f49331a;
        List list = this.f49332b;
        String str2 = this.f49333c;
        C40419j jVar = this.f49334d;
        return "TextMaskData(maskText=" + str + ", placeHolders=" + list + ", prefix=" + str2 + ", pasteFilterRegex=" + jVar + ")";
    }
}

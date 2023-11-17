package bf0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: bf0.b */
public final class C19377b {

    /* renamed from: a */
    private final List f53609a;

    /* renamed from: b */
    private final String f53610b;

    public C19377b(List list, String str) {
        C41536l.m120489i(list, "disclosureTypes");
        C41536l.m120489i(str, "commissionsDisclosureHtml");
        this.f53609a = list;
        this.f53610b = str;
    }

    /* renamed from: b */
    public static /* synthetic */ C19377b m64855b(C19377b bVar, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bVar.f53609a;
        }
        if ((i & 2) != 0) {
            str = bVar.f53610b;
        }
        return bVar.mo47594a(list, str);
    }

    /* renamed from: a */
    public final C19377b mo47594a(List list, String str) {
        C41536l.m120489i(list, "disclosureTypes");
        C41536l.m120489i(str, "commissionsDisclosureHtml");
        return new C19377b(list, str);
    }

    /* renamed from: c */
    public final String mo47595c() {
        return this.f53610b;
    }

    /* renamed from: d */
    public final List mo47596d() {
        return this.f53609a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19377b)) {
            return false;
        }
        C19377b bVar = (C19377b) obj;
        return C41536l.m120484d(this.f53609a, bVar.f53609a) && C41536l.m120484d(this.f53610b, bVar.f53610b);
    }

    public int hashCode() {
        return (this.f53609a.hashCode() * 31) + this.f53610b.hashCode();
    }

    public String toString() {
        List list = this.f53609a;
        String str = this.f53610b;
        return "DisclosureTypesModel(disclosureTypes=" + list + ", commissionsDisclosureHtml=" + str + ")";
    }
}

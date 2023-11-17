package zs0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: zs0.b */
public final class C40249b {

    /* renamed from: a */
    private final C40253f f95647a;

    /* renamed from: b */
    private final List f95648b;

    /* renamed from: c */
    private final String f95649c;

    public C40249b(C40253f fVar, List list, String str) {
        C41536l.m120489i(fVar, "casService");
        C41536l.m120489i(list, "history");
        this.f95647a = fVar;
        this.f95648b = list;
        this.f95649c = str;
    }

    /* renamed from: a */
    public final C40253f mo94213a() {
        return this.f95647a;
    }

    /* renamed from: b */
    public final List mo94214b() {
        return this.f95648b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40249b)) {
            return false;
        }
        C40249b bVar = (C40249b) obj;
        return C41536l.m120484d(this.f95647a, bVar.f95647a) && C41536l.m120484d(this.f95648b, bVar.f95648b) && C41536l.m120484d(this.f95649c, bVar.f95649c);
    }

    public int hashCode() {
        int hashCode = ((this.f95647a.hashCode() * 31) + this.f95648b.hashCode()) * 31;
        String str = this.f95649c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        C40253f fVar = this.f95647a;
        List list = this.f95648b;
        String str = this.f95649c;
        return "CasDetails(casService=" + fVar + ", history=" + list + ", depositDictionaryKey=" + str + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C40249b(C40253f fVar, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, list, (i & 4) != 0 ? null : str);
    }
}

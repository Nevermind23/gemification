package za0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: za0.b */
public final class C30271b {

    /* renamed from: a */
    private final int f76170a;

    /* renamed from: b */
    private final String f76171b;

    /* renamed from: c */
    private final List f76172c;

    public C30271b(int i, String str, List list) {
        C41536l.m120489i(str, "question");
        C41536l.m120489i(list, "selectorData");
        this.f76170a = i;
        this.f76171b = str;
        this.f76172c = list;
    }

    /* renamed from: a */
    public final int mo70592a() {
        return this.f76170a;
    }

    /* renamed from: b */
    public final String mo70593b() {
        return this.f76171b;
    }

    /* renamed from: c */
    public final List mo70594c() {
        return this.f76172c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30271b)) {
            return false;
        }
        C30271b bVar = (C30271b) obj;
        return this.f76170a == bVar.f76170a && C41536l.m120484d(this.f76171b, bVar.f76171b) && C41536l.m120484d(this.f76172c, bVar.f76172c);
    }

    public int hashCode() {
        return (((this.f76170a * 31) + this.f76171b.hashCode()) * 31) + this.f76172c.hashCode();
    }

    public String toString() {
        int i = this.f76170a;
        String str = this.f76171b;
        List list = this.f76172c;
        return "DepositAdvisorPageData(illustration=" + i + ", question=" + str + ", selectorData=" + list + ")";
    }
}

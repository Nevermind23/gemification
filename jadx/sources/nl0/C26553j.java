package nl0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: nl0.j */
public final class C26553j {

    /* renamed from: a */
    private final String f67157a;

    /* renamed from: b */
    private final String f67158b;

    /* renamed from: c */
    private final List f67159c;

    public C26553j(String str, String str2, List list) {
        C41536l.m120489i(str, "providerName");
        C41536l.m120489i(str2, "providerImageUrl");
        C41536l.m120489i(list, "policies");
        this.f67157a = str;
        this.f67158b = str2;
        this.f67159c = list;
    }

    /* renamed from: a */
    public final List mo65820a() {
        return this.f67159c;
    }

    /* renamed from: b */
    public final String mo65821b() {
        return this.f67158b;
    }

    /* renamed from: c */
    public final String mo65822c() {
        return this.f67157a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26553j)) {
            return false;
        }
        C26553j jVar = (C26553j) obj;
        return C41536l.m120484d(this.f67157a, jVar.f67157a) && C41536l.m120484d(this.f67158b, jVar.f67158b) && C41536l.m120484d(this.f67159c, jVar.f67159c);
    }

    public int hashCode() {
        return (((this.f67157a.hashCode() * 31) + this.f67158b.hashCode()) * 31) + this.f67159c.hashCode();
    }

    public String toString() {
        String str = this.f67157a;
        String str2 = this.f67158b;
        List list = this.f67159c;
        return "PolicyGroupsUIModel(providerName=" + str + ", providerImageUrl=" + str2 + ", policies=" + list + ")";
    }
}

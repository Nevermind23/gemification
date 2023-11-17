package m01;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: m01.g */
public final class C37193g {

    /* renamed from: a */
    private final String f89581a;

    /* renamed from: b */
    private final List f89582b;

    public C37193g(String str, List list) {
        C41536l.m120489i(str, "ccy");
        C41536l.m120489i(list, "availableAmounts");
        this.f89581a = str;
        this.f89582b = list;
    }

    /* renamed from: a */
    public final List mo90234a() {
        return this.f89582b;
    }

    /* renamed from: b */
    public final String mo90235b() {
        return this.f89581a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37193g)) {
            return false;
        }
        C37193g gVar = (C37193g) obj;
        return C41536l.m120484d(this.f89581a, gVar.f89581a) && C41536l.m120484d(this.f89582b, gVar.f89582b);
    }

    public int hashCode() {
        return (this.f89581a.hashCode() * 31) + this.f89582b.hashCode();
    }

    public String toString() {
        String str = this.f89581a;
        List list = this.f89582b;
        return "DenominationData(ccy=" + str + ", availableAmounts=" + list + ")";
    }
}

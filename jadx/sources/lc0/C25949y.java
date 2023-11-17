package lc0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: lc0.y */
public final class C25949y {

    /* renamed from: a */
    private final List f66022a;

    /* renamed from: b */
    private final String f66023b;

    public C25949y(List list, String str) {
        C41536l.m120489i(list, "withdrawalTypes");
        C41536l.m120489i(str, "initialWithdrawalType");
        this.f66022a = list;
        this.f66023b = str;
    }

    /* renamed from: a */
    public final String mo64859a() {
        return this.f66023b;
    }

    /* renamed from: b */
    public final List mo64860b() {
        return this.f66022a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25949y)) {
            return false;
        }
        C25949y yVar = (C25949y) obj;
        return C41536l.m120484d(this.f66022a, yVar.f66022a) && C41536l.m120484d(this.f66023b, yVar.f66023b);
    }

    public int hashCode() {
        return (this.f66022a.hashCode() * 31) + this.f66023b.hashCode();
    }

    public String toString() {
        List list = this.f66022a;
        String str = this.f66023b;
        return "WithdrawalTypesUiModel(withdrawalTypes=" + list + ", initialWithdrawalType=" + str + ")";
    }
}

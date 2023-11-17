package ka0;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;

/* renamed from: ka0.j */
public final class C25701j {

    /* renamed from: a */
    private final String f65466a;

    /* renamed from: b */
    private final String f65467b;

    /* renamed from: c */
    private final Boolean f65468c;

    /* renamed from: d */
    private final Boolean f65469d;

    public C25701j(String str, String str2, Boolean bool, Boolean bool2) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        this.f65466a = str;
        this.f65467b = str2;
        this.f65468c = bool;
        this.f65469d = bool2;
    }

    /* renamed from: a */
    public final String mo64257a() {
        return this.f65467b;
    }

    /* renamed from: b */
    public final Boolean mo64258b() {
        return this.f65469d;
    }

    /* renamed from: c */
    public final Boolean mo64259c() {
        return this.f65468c;
    }

    /* renamed from: d */
    public final String mo64260d() {
        return this.f65466a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25701j)) {
            return false;
        }
        C25701j jVar = (C25701j) obj;
        return C41536l.m120484d(this.f65466a, jVar.f65466a) && C41536l.m120484d(this.f65467b, jVar.f65467b) && C41536l.m120484d(this.f65468c, jVar.f65468c) && C41536l.m120484d(this.f65469d, jVar.f65469d);
    }

    public int hashCode() {
        int hashCode = this.f65466a.hashCode() * 31;
        String str = this.f65467b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f65468c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f65469d;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.f65466a;
        String str2 = this.f65467b;
        Boolean bool = this.f65468c;
        Boolean bool2 = this.f65469d;
        return "WithdrawalType(value=" + str + ", dictionaryKey=" + str2 + ", hasPrimaryAccount=" + bool + ", hasInterestAccount=" + bool2 + ")";
    }
}

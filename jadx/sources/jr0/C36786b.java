package jr0;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;

/* renamed from: jr0.b */
public final class C36786b {

    /* renamed from: a */
    private final String f88751a;

    /* renamed from: b */
    private final int f88752b;

    /* renamed from: c */
    private final String f88753c;

    public C36786b(String str, int i, String str2) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        C41536l.m120489i(str2, "titleKey");
        this.f88751a = str;
        this.f88752b = i;
        this.f88753c = str2;
    }

    /* renamed from: a */
    public final String mo89674a() {
        return this.f88753c;
    }

    /* renamed from: b */
    public final String mo89675b() {
        return this.f88751a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36786b)) {
            return false;
        }
        C36786b bVar = (C36786b) obj;
        return C41536l.m120484d(this.f88751a, bVar.f88751a) && this.f88752b == bVar.f88752b && C41536l.m120484d(this.f88753c, bVar.f88753c);
    }

    public int hashCode() {
        return (((this.f88751a.hashCode() * 31) + this.f88752b) * 31) + this.f88753c.hashCode();
    }

    public String toString() {
        String str = this.f88751a;
        int i = this.f88752b;
        String str2 = this.f88753c;
        return "LoanPurposeUiModel(value=" + str + ", orderNumber=" + i + ", titleKey=" + str2 + ")";
    }
}

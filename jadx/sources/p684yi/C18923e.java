package p684yi;

import kotlin.jvm.internal.C41536l;

/* renamed from: yi.e */
public final class C18923e {

    /* renamed from: a */
    private final String f52923a;

    /* renamed from: b */
    private final String f52924b;

    /* renamed from: c */
    private final String f52925c;

    public C18923e(String str, String str2, String str3) {
        C41536l.m120489i(str, "transactionText");
        C41536l.m120489i(str2, "amountText");
        this.f52923a = str;
        this.f52924b = str2;
        this.f52925c = str3;
    }

    /* renamed from: a */
    public final String mo46967a() {
        return this.f52925c;
    }

    /* renamed from: b */
    public final String mo46968b() {
        return this.f52924b;
    }

    /* renamed from: c */
    public final String mo46969c() {
        return this.f52923a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18923e)) {
            return false;
        }
        C18923e eVar = (C18923e) obj;
        return C41536l.m120484d(this.f52923a, eVar.f52923a) && C41536l.m120484d(this.f52924b, eVar.f52924b) && C41536l.m120484d(this.f52925c, eVar.f52925c);
    }

    public int hashCode() {
        int hashCode = ((this.f52923a.hashCode() * 31) + this.f52924b.hashCode()) * 31;
        String str = this.f52925c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f52923a;
        String str2 = this.f52924b;
        String str3 = this.f52925c;
        return "TransactionItemData(transactionText=" + str + ", amountText=" + str2 + ", amountDescriptionText=" + str3 + ")";
    }
}

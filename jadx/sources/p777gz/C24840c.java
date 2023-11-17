package p777gz;

import kotlin.jvm.internal.C41536l;

/* renamed from: gz.c */
public final class C24840c {

    /* renamed from: a */
    private final String f63771a;

    /* renamed from: b */
    private final String f63772b;

    /* renamed from: c */
    private final String f63773c;

    public C24840c(String str, String str2, String str3) {
        this.f63771a = str;
        this.f63772b = str2;
        this.f63773c = str3;
    }

    /* renamed from: a */
    public final String mo63262a() {
        return this.f63771a;
    }

    /* renamed from: b */
    public final String mo63263b() {
        return this.f63773c;
    }

    /* renamed from: c */
    public final String mo63264c() {
        return this.f63772b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24840c)) {
            return false;
        }
        C24840c cVar = (C24840c) obj;
        return C41536l.m120484d(this.f63771a, cVar.f63771a) && C41536l.m120484d(this.f63772b, cVar.f63772b) && C41536l.m120484d(this.f63773c, cVar.f63773c);
    }

    public int hashCode() {
        String str = this.f63771a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f63772b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f63773c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.f63771a;
        String str2 = this.f63772b;
        String str3 = this.f63773c;
        return "MoneyTransferResult(convertedAmount=" + str + ", rate=" + str2 + ", principalAmount=" + str3 + ")";
    }
}

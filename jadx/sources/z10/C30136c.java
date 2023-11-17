package z10;

import kotlin.jvm.internal.C41536l;

/* renamed from: z10.c */
public final class C30136c {

    /* renamed from: a */
    private final String f75994a;

    /* renamed from: b */
    private final String f75995b;

    public C30136c(String str, String str2) {
        C41536l.m120489i(str, "titleKey");
        C41536l.m120489i(str2, "descKey");
        this.f75994a = str;
        this.f75995b = str2;
    }

    /* renamed from: a */
    public final String mo70470a() {
        return this.f75995b;
    }

    /* renamed from: b */
    public final String mo70471b() {
        return this.f75994a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30136c)) {
            return false;
        }
        C30136c cVar = (C30136c) obj;
        return C41536l.m120484d(this.f75994a, cVar.f75994a) && C41536l.m120484d(this.f75995b, cVar.f75995b);
    }

    public int hashCode() {
        return (this.f75994a.hashCode() * 31) + this.f75995b.hashCode();
    }

    public String toString() {
        String str = this.f75994a;
        String str2 = this.f75995b;
        return "CreditCardBenefitUiModel(titleKey=" + str + ", descKey=" + str2 + ")";
    }
}

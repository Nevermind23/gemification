package o70;

import kotlin.jvm.internal.C41536l;

/* renamed from: o70.c */
public final class C26764c {

    /* renamed from: a */
    private final String f67430a;

    /* renamed from: b */
    private final String f67431b;

    public C26764c(String str, String str2) {
        C41536l.m120489i(str, "cardCVC2");
        C41536l.m120489i(str2, "cardNumber");
        this.f67430a = str;
        this.f67431b = str2;
    }

    /* renamed from: a */
    public final String mo65991a() {
        return this.f67430a;
    }

    /* renamed from: b */
    public final String mo65992b() {
        return this.f67431b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26764c)) {
            return false;
        }
        C26764c cVar = (C26764c) obj;
        return C41536l.m120484d(this.f67430a, cVar.f67430a) && C41536l.m120484d(this.f67431b, cVar.f67431b);
    }

    public int hashCode() {
        return (this.f67430a.hashCode() * 31) + this.f67431b.hashCode();
    }

    public String toString() {
        String str = this.f67430a;
        String str2 = this.f67431b;
        return "CardExtraDetailsModel(cardCVC2=" + str + ", cardNumber=" + str2 + ")";
    }
}

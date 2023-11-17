package p863pw;

import kotlin.jvm.internal.C41536l;

/* renamed from: pw.p */
public final class C27638p {

    /* renamed from: a */
    private final String f70720a;

    /* renamed from: b */
    private final int f70721b;

    /* renamed from: c */
    private final String f70722c;

    public C27638p(String str, int i, String str2) {
        C41536l.m120489i(str, "CCY");
        C41536l.m120489i(str2, "dictionaryValue");
        this.f70720a = str;
        this.f70721b = i;
        this.f70722c = str2;
    }

    /* renamed from: a */
    public final String mo67171a() {
        return this.f70720a;
    }

    /* renamed from: b */
    public final String mo67172b() {
        return this.f70722c;
    }

    /* renamed from: c */
    public final int mo67173c() {
        return this.f70721b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27638p)) {
            return false;
        }
        C27638p pVar = (C27638p) obj;
        return C41536l.m120484d(this.f70720a, pVar.f70720a) && this.f70721b == pVar.f70721b && C41536l.m120484d(this.f70722c, pVar.f70722c);
    }

    public int hashCode() {
        return (((this.f70720a.hashCode() * 31) + this.f70721b) * 31) + this.f70722c.hashCode();
    }

    public String toString() {
        String str = this.f70720a;
        int i = this.f70721b;
        String str2 = this.f70722c;
        return "ClientCurrency(CCY=" + str + ", orderNo=" + i + ", dictionaryValue=" + str2 + ")";
    }
}

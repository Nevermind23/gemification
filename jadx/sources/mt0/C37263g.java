package mt0;

import kotlin.jvm.internal.C41536l;

/* renamed from: mt0.g */
public final class C37263g {

    /* renamed from: a */
    private final String f89709a;

    /* renamed from: b */
    private final int f89710b;

    public C37263g(String str, int i) {
        C41536l.m120489i(str, "text");
        this.f89709a = str;
        this.f89710b = i;
    }

    /* renamed from: a */
    public final int mo90374a() {
        return this.f89710b;
    }

    /* renamed from: b */
    public final String mo90375b() {
        return this.f89709a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37263g)) {
            return false;
        }
        C37263g gVar = (C37263g) obj;
        return C41536l.m120484d(this.f89709a, gVar.f89709a) && this.f89710b == gVar.f89710b;
    }

    public int hashCode() {
        return (this.f89709a.hashCode() * 31) + this.f89710b;
    }

    public String toString() {
        String str = this.f89709a;
        int i = this.f89710b;
        return "PiggyBankNewsItem(text=" + str + ", iconRes=" + i + ")";
    }
}

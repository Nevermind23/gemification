package lv0;

import kotlin.jvm.internal.C41536l;

/* renamed from: lv0.j */
public final class C37167j {

    /* renamed from: a */
    private final String f89506a;

    /* renamed from: b */
    private final String f89507b;

    /* renamed from: c */
    private final int f89508c;

    /* renamed from: d */
    private final String f89509d;

    /* renamed from: e */
    private final boolean f89510e;

    public C37167j(String str, String str2, int i, String str3, boolean z) {
        C41536l.m120489i(str, "bankId");
        C41536l.m120489i(str2, "bankCode");
        C41536l.m120489i(str3, "bankName");
        this.f89506a = str;
        this.f89507b = str2;
        this.f89508c = i;
        this.f89509d = str3;
        this.f89510e = z;
    }

    /* renamed from: a */
    public final String mo90159a() {
        return this.f89507b;
    }

    /* renamed from: b */
    public final String mo90160b() {
        return this.f89506a;
    }

    /* renamed from: c */
    public final int mo90161c() {
        return this.f89508c;
    }

    /* renamed from: d */
    public final String mo90162d() {
        return this.f89509d;
    }

    /* renamed from: e */
    public final boolean mo90163e() {
        return this.f89510e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37167j)) {
            return false;
        }
        C37167j jVar = (C37167j) obj;
        return C41536l.m120484d(this.f89506a, jVar.f89506a) && C41536l.m120484d(this.f89507b, jVar.f89507b) && this.f89508c == jVar.f89508c && C41536l.m120484d(this.f89509d, jVar.f89509d) && this.f89510e == jVar.f89510e;
    }

    public int hashCode() {
        int hashCode = ((((((this.f89506a.hashCode() * 31) + this.f89507b.hashCode()) * 31) + this.f89508c) * 31) + this.f89509d.hashCode()) * 31;
        boolean z = this.f89510e;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.f89506a;
        String str2 = this.f89507b;
        int i = this.f89508c;
        String str3 = this.f89509d;
        boolean z = this.f89510e;
        return "BankListItem(bankId=" + str + ", bankCode=" + str2 + ", bankLogo=" + i + ", bankName=" + str3 + ", isActive=" + z + ")";
    }
}

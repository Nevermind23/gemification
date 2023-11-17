package t10;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: t10.a */
public final class C28296a {

    /* renamed from: a */
    private final long f71800a;

    /* renamed from: b */
    private final int f71801b;

    /* renamed from: c */
    private final String f71802c;

    /* renamed from: d */
    private final boolean f71803d;

    /* renamed from: e */
    private final String f71804e;

    public C28296a(long j, int i, String str, boolean z, String str2) {
        C41536l.m120489i(str, "accountNumber");
        this.f71800a = j;
        this.f71801b = i;
        this.f71802c = str;
        this.f71803d = z;
        this.f71804e = str2;
    }

    /* renamed from: a */
    public final String mo67926a() {
        return this.f71802c;
    }

    /* renamed from: b */
    public final String mo67927b() {
        return this.f71804e;
    }

    /* renamed from: c */
    public final int mo67928c() {
        return this.f71801b;
    }

    /* renamed from: d */
    public final boolean mo67929d() {
        return this.f71803d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28296a)) {
            return false;
        }
        C28296a aVar = (C28296a) obj;
        return this.f71800a == aVar.f71800a && this.f71801b == aVar.f71801b && C41536l.m120484d(this.f71802c, aVar.f71802c) && this.f71803d == aVar.f71803d && C41536l.m120484d(this.f71804e, aVar.f71804e);
    }

    public int hashCode() {
        int a = ((((C7397t.m28148a(this.f71800a) * 31) + this.f71801b) * 31) + this.f71802c.hashCode()) * 31;
        boolean z = this.f71803d;
        if (z) {
            z = true;
        }
        int i = (a + (z ? 1 : 0)) * 31;
        String str = this.f71804e;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        long j = this.f71800a;
        int i = this.f71801b;
        String str = this.f71802c;
        boolean z = this.f71803d;
        String str2 = this.f71804e;
        return "AccountItem(id=" + j + ", bankDrawableRes=" + i + ", accountNumber=" + str + ", isFavorite=" + z + ", acctName=" + str2 + ")";
    }
}

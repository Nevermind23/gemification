package c51;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: c51.a */
public final class C31275a {

    /* renamed from: a */
    private final String f77647a;

    /* renamed from: b */
    private final String f77648b;

    /* renamed from: c */
    private final boolean f77649c;

    /* renamed from: d */
    private final String f77650d;

    /* renamed from: e */
    private final long f77651e;

    public C31275a(String str, String str2, boolean z, String str3, long j) {
        this.f77647a = str;
        this.f77648b = str2;
        this.f77649c = z;
        this.f77650d = str3;
        this.f77651e = j;
    }

    /* renamed from: a */
    public final boolean mo71525a() {
        return this.f77649c;
    }

    /* renamed from: b */
    public final String mo71526b() {
        return this.f77650d;
    }

    /* renamed from: c */
    public final String mo71527c() {
        return this.f77648b;
    }

    /* renamed from: d */
    public final boolean mo71528d() {
        return C41536l.m120484d(this.f77647a, "U");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31275a)) {
            return false;
        }
        C31275a aVar = (C31275a) obj;
        return C41536l.m120484d(this.f77647a, aVar.f77647a) && C41536l.m120484d(this.f77648b, aVar.f77648b) && this.f77649c == aVar.f77649c && C41536l.m120484d(this.f77650d, aVar.f77650d) && this.f77651e == aVar.f77651e;
    }

    public int hashCode() {
        String str = this.f77647a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f77648b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.f77649c;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        String str3 = this.f77650d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((i2 + i) * 31) + C7397t.m28148a(this.f77651e);
    }

    public String toString() {
        String str = this.f77647a;
        String str2 = this.f77648b;
        boolean z = this.f77649c;
        String str3 = this.f77650d;
        long j = this.f77651e;
        return "ServerStatus(serverStatus=" + str + ", serverStatusDesc=" + str2 + ", mustUpdateClient=" + z + ", mustUpdateClientDesc=" + str3 + ", serverTime=" + j + ")";
    }
}

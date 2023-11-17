package ka0;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ka0.c */
public final class C25694c {

    /* renamed from: a */
    private final long f65418a;

    /* renamed from: b */
    private final String f65419b;

    /* renamed from: c */
    private final String f65420c;

    /* renamed from: d */
    private final String f65421d;

    /* renamed from: e */
    private final Long f65422e;

    /* renamed from: f */
    private final Long f65423f;

    /* renamed from: g */
    private final String f65424g;

    public C25694c(long j, String str, String str2, String str3, Long l, Long l2, String str4) {
        C41536l.m120489i(str3, "lookupValue");
        C41536l.m120489i(str4, "dictionaryKey");
        this.f65418a = j;
        this.f65419b = str;
        this.f65420c = str2;
        this.f65421d = str3;
        this.f65422e = l;
        this.f65423f = l2;
        this.f65424g = str4;
    }

    /* renamed from: a */
    public final String mo64204a() {
        return this.f65424g;
    }

    /* renamed from: b */
    public final Long mo64205b() {
        return this.f65422e;
    }

    /* renamed from: c */
    public final String mo64206c() {
        return this.f65419b;
    }

    /* renamed from: d */
    public final long mo64207d() {
        return this.f65418a;
    }

    /* renamed from: e */
    public final String mo64208e() {
        return this.f65420c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25694c)) {
            return false;
        }
        C25694c cVar = (C25694c) obj;
        return this.f65418a == cVar.f65418a && C41536l.m120484d(this.f65419b, cVar.f65419b) && C41536l.m120484d(this.f65420c, cVar.f65420c) && C41536l.m120484d(this.f65421d, cVar.f65421d) && C41536l.m120484d(this.f65422e, cVar.f65422e) && C41536l.m120484d(this.f65423f, cVar.f65423f) && C41536l.m120484d(this.f65424g, cVar.f65424g);
    }

    /* renamed from: f */
    public final String mo64210f() {
        return this.f65421d;
    }

    /* renamed from: g */
    public final Long mo64211g() {
        return this.f65423f;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f65418a) * 31;
        String str = this.f65419b;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f65420c;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f65421d.hashCode()) * 31;
        Long l = this.f65422e;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f65423f;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.f65424g.hashCode();
    }

    public String toString() {
        long j = this.f65418a;
        String str = this.f65419b;
        String str2 = this.f65420c;
        String str3 = this.f65421d;
        Long l = this.f65422e;
        Long l2 = this.f65423f;
        String str4 = this.f65424g;
        return "DepositPurpose(id=" + j + ", iconUrl=" + str + ", lookupName=" + str2 + ", lookupValue=" + str3 + ", dictionaryKeyId=" + l + ", orderNumber=" + l2 + ", dictionaryKey=" + str4 + ")";
    }
}

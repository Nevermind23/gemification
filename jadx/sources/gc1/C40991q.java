package gc1;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

/* renamed from: gc1.q */
public final class C40991q extends C40990p {

    /* renamed from: d */
    private final String f96793d;

    /* renamed from: e */
    private final long f96794e;

    /* renamed from: f */
    private final String f96795f;

    /* renamed from: g */
    private final String f96796g;

    /* renamed from: h */
    private final String f96797h;

    /* renamed from: i */
    private final String f96798i;

    /* renamed from: j */
    private final String f96799j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40991q(String str, long j, String str2, String str3, String str4, String str5, String str6) {
        super(str, (DefaultConstructorMarker) null);
        C41536l.m120489i(str, "_id");
        C41536l.m120489i(str2, "text");
        C41536l.m120489i(str3, "description");
        C41536l.m120489i(str4, "amount");
        C41536l.m120489i(str5, "ccy");
        C41536l.m120489i(str6, "icon");
        this.f96793d = str;
        this.f96794e = j;
        this.f96795f = str2;
        this.f96796g = str3;
        this.f96797h = str4;
        this.f96798i = str5;
        this.f96799j = str6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40991q)) {
            return false;
        }
        C40991q qVar = (C40991q) obj;
        return C41536l.m120484d(this.f96793d, qVar.f96793d) && this.f96794e == qVar.f96794e && C41536l.m120484d(this.f96795f, qVar.f96795f) && C41536l.m120484d(this.f96796g, qVar.f96796g) && C41536l.m120484d(this.f96797h, qVar.f96797h) && C41536l.m120484d(this.f96798i, qVar.f96798i) && C41536l.m120484d(this.f96799j, qVar.f96799j);
    }

    /* renamed from: f */
    public final String mo95384f() {
        return this.f96797h;
    }

    /* renamed from: g */
    public final String mo95385g() {
        return this.f96798i;
    }

    /* renamed from: h */
    public final long mo95386h() {
        return this.f96794e;
    }

    public int hashCode() {
        return (((((((((((this.f96793d.hashCode() * 31) + C7397t.m28148a(this.f96794e)) * 31) + this.f96795f.hashCode()) * 31) + this.f96796g.hashCode()) * 31) + this.f96797h.hashCode()) * 31) + this.f96798i.hashCode()) * 31) + this.f96799j.hashCode();
    }

    /* renamed from: i */
    public final String mo95388i() {
        return this.f96796g;
    }

    /* renamed from: j */
    public final String mo95389j() {
        return this.f96795f;
    }

    public String toString() {
        return "TransactionItem(_id=" + this.f96793d + ", date=" + this.f96794e + ", text=" + this.f96795f + ", description=" + this.f96796g + ", amount=" + this.f96797h + ", ccy=" + this.f96798i + ", icon=" + this.f96799j + ')';
    }
}

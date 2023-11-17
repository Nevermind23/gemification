package p341ge.bog.sso_client.models;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.sso_client.models.t */
public final class C35964t {

    /* renamed from: a */
    private final String f87009a;

    /* renamed from: b */
    private final String f87010b;

    /* renamed from: c */
    private final String f87011c;

    /* renamed from: d */
    private final String f87012d;

    /* renamed from: e */
    private final String f87013e;

    /* renamed from: f */
    private final String f87014f;

    /* renamed from: g */
    private final String f87015g;

    /* renamed from: h */
    private final long f87016h;

    /* renamed from: i */
    private final String f87017i;

    public C35964t(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, String str8) {
        C41536l.m120489i(str, "amount");
        C41536l.m120489i(str2, "ccy");
        C41536l.m120489i(str3, "description");
        C41536l.m120489i(str4, "entryGroup");
        C41536l.m120489i(str5, "groupNameGe");
        C41536l.m120489i(str6, "groupNameInt");
        C41536l.m120489i(str7, "idHash");
        C41536l.m120489i(str8, "title");
        this.f87009a = str;
        this.f87010b = str2;
        this.f87011c = str3;
        this.f87012d = str4;
        this.f87013e = str5;
        this.f87014f = str6;
        this.f87015g = str7;
        this.f87016h = j;
        this.f87017i = str8;
    }

    /* renamed from: a */
    public final String mo88560a() {
        return this.f87009a;
    }

    /* renamed from: b */
    public final String mo88561b() {
        return this.f87010b;
    }

    /* renamed from: c */
    public final String mo88562c() {
        return this.f87011c;
    }

    /* renamed from: d */
    public final String mo88563d() {
        return this.f87012d;
    }

    /* renamed from: e */
    public final String mo88564e() {
        return this.f87015g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35964t)) {
            return false;
        }
        C35964t tVar = (C35964t) obj;
        return C41536l.m120484d(this.f87009a, tVar.f87009a) && C41536l.m120484d(this.f87010b, tVar.f87010b) && C41536l.m120484d(this.f87011c, tVar.f87011c) && C41536l.m120484d(this.f87012d, tVar.f87012d) && C41536l.m120484d(this.f87013e, tVar.f87013e) && C41536l.m120484d(this.f87014f, tVar.f87014f) && C41536l.m120484d(this.f87015g, tVar.f87015g) && this.f87016h == tVar.f87016h && C41536l.m120484d(this.f87017i, tVar.f87017i);
    }

    /* renamed from: f */
    public final long mo88566f() {
        return this.f87016h;
    }

    /* renamed from: g */
    public final String mo88567g() {
        return this.f87017i;
    }

    public int hashCode() {
        return (((((((((((((((this.f87009a.hashCode() * 31) + this.f87010b.hashCode()) * 31) + this.f87011c.hashCode()) * 31) + this.f87012d.hashCode()) * 31) + this.f87013e.hashCode()) * 31) + this.f87014f.hashCode()) * 31) + this.f87015g.hashCode()) * 31) + C7397t.m28148a(this.f87016h)) * 31) + this.f87017i.hashCode();
    }

    public String toString() {
        return "Transaction(amount=" + this.f87009a + ", ccy=" + this.f87010b + ", description=" + this.f87011c + ", entryGroup=" + this.f87012d + ", groupNameGe=" + this.f87013e + ", groupNameInt=" + this.f87014f + ", idHash=" + this.f87015g + ", operationDate=" + this.f87016h + ", title=" + this.f87017i + ')';
    }
}

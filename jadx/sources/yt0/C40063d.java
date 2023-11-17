package yt0;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: yt0.d */
public final class C40063d {

    /* renamed from: a */
    private final long f95217a;

    /* renamed from: b */
    private final String f95218b;

    /* renamed from: c */
    private final String f95219c;

    /* renamed from: d */
    private final int f95220d;

    /* renamed from: e */
    private final long f95221e;

    /* renamed from: f */
    private final long f95222f;

    /* renamed from: g */
    private final String f95223g;

    /* renamed from: h */
    private final String f95224h;

    /* renamed from: i */
    private final String f95225i;

    /* renamed from: j */
    private final String f95226j;

    /* renamed from: k */
    private final int f95227k;

    /* renamed from: l */
    private final long f95228l;

    /* renamed from: m */
    private final long f95229m;

    /* renamed from: n */
    private final String f95230n;

    public C40063d(long j, String str, String str2, int i, long j2, long j3, String str3, String str4, String str5, String str6, int i2, long j4, long j5, String str7) {
        String str8 = str3;
        String str9 = str4;
        C41536l.m120489i(str, "currentLabelType");
        C41536l.m120489i(str2, "currentLabel");
        C41536l.m120489i(str8, "realLabelType");
        C41536l.m120489i(str9, "realLabel");
        this.f95217a = j;
        this.f95218b = str;
        this.f95219c = str2;
        this.f95220d = i;
        this.f95221e = j2;
        this.f95222f = j3;
        this.f95223g = str8;
        this.f95224h = str9;
        this.f95225i = str5;
        this.f95226j = str6;
        this.f95227k = i2;
        this.f95228l = j4;
        this.f95229m = j5;
        this.f95230n = str7;
    }

    /* renamed from: a */
    public final long mo93974a() {
        return this.f95217a;
    }

    /* renamed from: b */
    public final String mo93975b() {
        return this.f95219c;
    }

    /* renamed from: c */
    public final String mo93976c() {
        return this.f95218b;
    }

    /* renamed from: d */
    public final String mo93977d() {
        return this.f95230n;
    }

    /* renamed from: e */
    public final long mo93978e() {
        return this.f95222f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40063d)) {
            return false;
        }
        C40063d dVar = (C40063d) obj;
        return this.f95217a == dVar.f95217a && C41536l.m120484d(this.f95218b, dVar.f95218b) && C41536l.m120484d(this.f95219c, dVar.f95219c) && this.f95220d == dVar.f95220d && this.f95221e == dVar.f95221e && this.f95222f == dVar.f95222f && C41536l.m120484d(this.f95223g, dVar.f95223g) && C41536l.m120484d(this.f95224h, dVar.f95224h) && C41536l.m120484d(this.f95225i, dVar.f95225i) && C41536l.m120484d(this.f95226j, dVar.f95226j) && this.f95227k == dVar.f95227k && this.f95228l == dVar.f95228l && this.f95229m == dVar.f95229m && C41536l.m120484d(this.f95230n, dVar.f95230n);
    }

    /* renamed from: f */
    public final long mo93980f() {
        return this.f95229m;
    }

    /* renamed from: g */
    public final String mo93981g() {
        return this.f95226j;
    }

    /* renamed from: h */
    public final int mo93982h() {
        return this.f95227k;
    }

    public int hashCode() {
        int a = ((((((((((((((C7397t.m28148a(this.f95217a) * 31) + this.f95218b.hashCode()) * 31) + this.f95219c.hashCode()) * 31) + this.f95220d) * 31) + C7397t.m28148a(this.f95221e)) * 31) + C7397t.m28148a(this.f95222f)) * 31) + this.f95223g.hashCode()) * 31) + this.f95224h.hashCode()) * 31;
        String str = this.f95225i;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f95226j;
        int hashCode2 = (((((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f95227k) * 31) + C7397t.m28148a(this.f95228l)) * 31) + C7397t.m28148a(this.f95229m)) * 31;
        String str3 = this.f95230n;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    /* renamed from: i */
    public final String mo93984i() {
        return this.f95225i;
    }

    /* renamed from: j */
    public final long mo93985j() {
        return this.f95228l;
    }

    /* renamed from: k */
    public final String mo93986k() {
        return this.f95224h;
    }

    /* renamed from: l */
    public final String mo93987l() {
        return this.f95223g;
    }

    /* renamed from: m */
    public final long mo93988m() {
        return this.f95221e;
    }

    /* renamed from: n */
    public final int mo93989n() {
        return this.f95220d;
    }

    public String toString() {
        long j = this.f95217a;
        String str = this.f95218b;
        String str2 = this.f95219c;
        int i = this.f95220d;
        long j2 = this.f95221e;
        long j3 = this.f95222f;
        String str3 = this.f95223g;
        String str4 = this.f95224h;
        String str5 = this.f95225i;
        String str6 = this.f95226j;
        int i2 = this.f95227k;
        long j4 = this.f95228l;
        long j5 = this.f95229m;
        String str7 = this.f95230n;
        return "StatusDetails(clientKey=" + j + ", currentLabelType=" + str + ", currentLabel=" + str2 + ", sumStatusPoint=" + i + ", startDate=" + j2 + ", endDate=" + j3 + ", realLabelType=" + str3 + ", realLabel=" + str4 + ", nextLabelType=" + str5 + ", nextLabel=" + str6 + ", nextLabelScore=" + i2 + ", nextStartDate=" + j4 + ", nextEndDate=" + j5 + ", detailsUrl=" + str7 + ")";
    }
}

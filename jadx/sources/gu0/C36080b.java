package gu0;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: gu0.b */
public final class C36080b {

    /* renamed from: a */
    private final long f87208a;

    /* renamed from: b */
    private final C36081c f87209b;

    /* renamed from: c */
    private final String f87210c;

    /* renamed from: d */
    private final int f87211d;

    /* renamed from: e */
    private final long f87212e;

    /* renamed from: f */
    private final long f87213f;

    /* renamed from: g */
    private final C36081c f87214g;

    /* renamed from: h */
    private final String f87215h;

    /* renamed from: i */
    private final C36081c f87216i;

    /* renamed from: j */
    private final String f87217j;

    /* renamed from: k */
    private final int f87218k;

    /* renamed from: l */
    private final float f87219l;

    /* renamed from: m */
    private final long f87220m;

    /* renamed from: n */
    private final long f87221n;

    /* renamed from: o */
    private final String f87222o;

    public C36080b(long j, C36081c cVar, String str, int i, long j2, long j3, C36081c cVar2, String str2, C36081c cVar3, String str3, int i2, float f, long j4, long j5, String str4) {
        String str5 = str2;
        C41536l.m120489i(str, "currentLabel");
        C41536l.m120489i(str5, "realLabel");
        this.f87208a = j;
        this.f87209b = cVar;
        this.f87210c = str;
        this.f87211d = i;
        this.f87212e = j2;
        this.f87213f = j3;
        this.f87214g = cVar2;
        this.f87215h = str5;
        this.f87216i = cVar3;
        this.f87217j = str3;
        this.f87218k = i2;
        this.f87219l = f;
        this.f87220m = j4;
        this.f87221n = j5;
        this.f87222o = str4;
    }

    /* renamed from: a */
    public final float mo88801a() {
        return this.f87219l;
    }

    /* renamed from: b */
    public final String mo88802b() {
        return this.f87210c;
    }

    /* renamed from: c */
    public final C36081c mo88803c() {
        return this.f87209b;
    }

    /* renamed from: d */
    public final String mo88804d() {
        return this.f87222o;
    }

    /* renamed from: e */
    public final long mo88805e() {
        return this.f87213f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36080b)) {
            return false;
        }
        C36080b bVar = (C36080b) obj;
        return this.f87208a == bVar.f87208a && this.f87209b == bVar.f87209b && C41536l.m120484d(this.f87210c, bVar.f87210c) && this.f87211d == bVar.f87211d && this.f87212e == bVar.f87212e && this.f87213f == bVar.f87213f && this.f87214g == bVar.f87214g && C41536l.m120484d(this.f87215h, bVar.f87215h) && this.f87216i == bVar.f87216i && C41536l.m120484d(this.f87217j, bVar.f87217j) && this.f87218k == bVar.f87218k && Float.compare(this.f87219l, bVar.f87219l) == 0 && this.f87220m == bVar.f87220m && this.f87221n == bVar.f87221n && C41536l.m120484d(this.f87222o, bVar.f87222o);
    }

    /* renamed from: f */
    public final long mo88807f() {
        return this.f87221n;
    }

    /* renamed from: g */
    public final String mo88808g() {
        return this.f87217j;
    }

    /* renamed from: h */
    public final int mo88809h() {
        return this.f87218k;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f87208a) * 31;
        C36081c cVar = this.f87209b;
        int i = 0;
        int hashCode = (((((((((a + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f87210c.hashCode()) * 31) + this.f87211d) * 31) + C7397t.m28148a(this.f87212e)) * 31) + C7397t.m28148a(this.f87213f)) * 31;
        C36081c cVar2 = this.f87214g;
        int hashCode2 = (((hashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31) + this.f87215h.hashCode()) * 31;
        C36081c cVar3 = this.f87216i;
        int hashCode3 = (hashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        String str = this.f87217j;
        int hashCode4 = (((((((((hashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.f87218k) * 31) + Float.floatToIntBits(this.f87219l)) * 31) + C7397t.m28148a(this.f87220m)) * 31) + C7397t.m28148a(this.f87221n)) * 31;
        String str2 = this.f87222o;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode4 + i;
    }

    /* renamed from: i */
    public final C36081c mo88811i() {
        return this.f87216i;
    }

    /* renamed from: j */
    public final long mo88812j() {
        return this.f87220m;
    }

    /* renamed from: k */
    public final C36081c mo88813k() {
        return this.f87214g;
    }

    /* renamed from: l */
    public final long mo88814l() {
        return this.f87212e;
    }

    /* renamed from: m */
    public final int mo88815m() {
        return this.f87211d;
    }

    public String toString() {
        long j = this.f87208a;
        C36081c cVar = this.f87209b;
        String str = this.f87210c;
        int i = this.f87211d;
        long j2 = this.f87212e;
        long j3 = this.f87213f;
        C36081c cVar2 = this.f87214g;
        String str2 = this.f87215h;
        C36081c cVar3 = this.f87216i;
        String str3 = this.f87217j;
        int i2 = this.f87218k;
        float f = this.f87219l;
        long j4 = this.f87220m;
        long j5 = this.f87221n;
        String str4 = this.f87222o;
        return "StatusDetailsUiModel(clientKey=" + j + ", currentLabelType=" + cVar + ", currentLabel=" + str + ", sumStatusPoint=" + i + ", startDate=" + j2 + ", endDate=" + j3 + ", realLabelType=" + cVar2 + ", realLabel=" + str2 + ", nextLabelType=" + cVar3 + ", nextLabel=" + str3 + ", nextLabelScore=" + i2 + ", achievedPercent=" + f + ", nextStartDate=" + j4 + ", nextEndDate=" + j5 + ", detailsUrl=" + str4 + ")";
    }
}

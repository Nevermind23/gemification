package p906ty;

import kotlin.jvm.internal.C41536l;

/* renamed from: ty.b */
public final class C28524b {

    /* renamed from: a */
    private final Long f72345a;

    /* renamed from: b */
    private final Double f72346b;

    /* renamed from: c */
    private final Double f72347c;

    /* renamed from: d */
    private final Double f72348d;

    /* renamed from: e */
    private final Integer f72349e;

    /* renamed from: f */
    private final Double f72350f;

    public C28524b(Long l, Double d, Double d2, Double d3, Integer num, Double d4) {
        this.f72345a = l;
        this.f72346b = d;
        this.f72347c = d2;
        this.f72348d = d3;
        this.f72349e = num;
        this.f72350f = d4;
    }

    /* renamed from: a */
    public final Double mo68143a() {
        return this.f72350f;
    }

    /* renamed from: b */
    public final Double mo68144b() {
        return this.f72348d;
    }

    /* renamed from: c */
    public final Double mo68145c() {
        return this.f72346b;
    }

    /* renamed from: d */
    public final Integer mo68146d() {
        return this.f72349e;
    }

    /* renamed from: e */
    public final Long mo68147e() {
        return this.f72345a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28524b)) {
            return false;
        }
        C28524b bVar = (C28524b) obj;
        return C41536l.m120484d(this.f72345a, bVar.f72345a) && C41536l.m120484d(this.f72346b, bVar.f72346b) && C41536l.m120484d(this.f72347c, bVar.f72347c) && C41536l.m120484d(this.f72348d, bVar.f72348d) && C41536l.m120484d(this.f72349e, bVar.f72349e) && C41536l.m120484d(this.f72350f, bVar.f72350f);
    }

    /* renamed from: f */
    public final Double mo68149f() {
        return this.f72347c;
    }

    public int hashCode() {
        Long l = this.f72345a;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Double d = this.f72346b;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f72347c;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f72348d;
        int hashCode4 = (hashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num = this.f72349e;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Double d4 = this.f72350f;
        if (d4 != null) {
            i = d4.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        Long l = this.f72345a;
        Double d = this.f72346b;
        Double d2 = this.f72347c;
        Double d3 = this.f72348d;
        Integer num = this.f72349e;
        Double d4 = this.f72350f;
        return "BonusAmex(regDate=" + l + ", collected=" + d + ", spent=" + d2 + ", available=" + d3 + ", prizeCount=" + num + ", amountInGel=" + d4 + ")";
    }
}

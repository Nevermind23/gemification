package p606sl;

import kotlin.jvm.internal.C41536l;

/* renamed from: sl.o */
public final class C17849o {

    /* renamed from: a */
    private final Long f50847a;

    /* renamed from: b */
    private final Long f50848b;

    /* renamed from: c */
    private final String f50849c;

    /* renamed from: d */
    private final Double f50850d;

    /* renamed from: e */
    private final Double f50851e;

    /* renamed from: f */
    private final Double f50852f;

    /* renamed from: g */
    private final Double f50853g;

    /* renamed from: h */
    private final Double f50854h;

    public C17849o(Long l, Long l2, String str, Double d, Double d2, Double d3, Double d4, Double d5) {
        this.f50847a = l;
        this.f50848b = l2;
        this.f50849c = str;
        this.f50850d = d;
        this.f50851e = d2;
        this.f50852f = d3;
        this.f50853g = d4;
        this.f50854h = d5;
    }

    /* renamed from: a */
    public final String mo45523a() {
        return this.f50849c;
    }

    /* renamed from: b */
    public final Double mo45524b() {
        return this.f50852f;
    }

    /* renamed from: c */
    public final Double mo45525c() {
        return this.f50853g;
    }

    /* renamed from: d */
    public final Double mo45526d() {
        return this.f50851e;
    }

    /* renamed from: e */
    public final Long mo45527e() {
        return this.f50848b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17849o)) {
            return false;
        }
        C17849o oVar = (C17849o) obj;
        return C41536l.m120484d(this.f50847a, oVar.f50847a) && C41536l.m120484d(this.f50848b, oVar.f50848b) && C41536l.m120484d(this.f50849c, oVar.f50849c) && C41536l.m120484d(this.f50850d, oVar.f50850d) && C41536l.m120484d(this.f50851e, oVar.f50851e) && C41536l.m120484d(this.f50852f, oVar.f50852f) && C41536l.m120484d(this.f50853g, oVar.f50853g) && C41536l.m120484d(this.f50854h, oVar.f50854h);
    }

    /* renamed from: f */
    public final Double mo45529f() {
        return this.f50850d;
    }

    /* renamed from: g */
    public final Double mo45530g() {
        return this.f50854h;
    }

    public int hashCode() {
        Long l = this.f50847a;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f50848b;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f50849c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f50850d;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f50851e;
        int hashCode5 = (hashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f50852f;
        int hashCode6 = (hashCode5 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.f50853g;
        int hashCode7 = (hashCode6 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.f50854h;
        if (d5 != null) {
            i = d5.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        Long l = this.f50847a;
        Long l2 = this.f50848b;
        String str = this.f50849c;
        Double d = this.f50850d;
        Double d2 = this.f50851e;
        Double d3 = this.f50852f;
        Double d4 = this.f50853g;
        Double d5 = this.f50854h;
        return "BnplSchedule(loanKey=" + l + ", payDate=" + l2 + ", ccy=" + str + ", priAmt=" + d + ", intAmt=" + d2 + ", feeAmt=" + d3 + ", insAmt=" + d4 + ", totalAmt=" + d5 + ")";
    }
}

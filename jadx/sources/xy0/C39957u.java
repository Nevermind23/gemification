package xy0;

import java.util.Date;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: xy0.u */
public final class C39957u {

    /* renamed from: a */
    private final String f94899a;

    /* renamed from: b */
    private final long f94900b;

    /* renamed from: c */
    private final String f94901c;

    /* renamed from: d */
    private final Date f94902d;

    /* renamed from: e */
    private final String f94903e;

    /* renamed from: f */
    private final Double f94904f;

    /* renamed from: g */
    private final Double f94905g;

    /* renamed from: h */
    private final Double f94906h;

    /* renamed from: i */
    private final String f94907i;

    /* renamed from: j */
    private final Double f94908j;

    /* renamed from: k */
    private final Double f94909k;

    /* renamed from: l */
    private final Double f94910l;

    /* renamed from: m */
    private final Double f94911m;

    /* renamed from: n */
    private final String f94912n;

    /* renamed from: o */
    private final String f94913o;

    public C39957u(String str, long j, String str2, Date date, String str3, Double d, Double d2, Double d3, String str4, Double d4, Double d5, Double d6, Double d7, String str5, String str6) {
        C41536l.m120489i(str, "primaryKey");
        C41536l.m120489i(str2, "loanNo");
        this.f94899a = str;
        this.f94900b = j;
        this.f94901c = str2;
        this.f94902d = date;
        this.f94903e = str3;
        this.f94904f = d;
        this.f94905g = d2;
        this.f94906h = d3;
        this.f94907i = str4;
        this.f94908j = d4;
        this.f94909k = d5;
        this.f94910l = d6;
        this.f94911m = d7;
        this.f94912n = str5;
        this.f94913o = str6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39957u)) {
            return false;
        }
        C39957u uVar = (C39957u) obj;
        return C41536l.m120484d(this.f94899a, uVar.f94899a) && this.f94900b == uVar.f94900b && C41536l.m120484d(this.f94901c, uVar.f94901c) && C41536l.m120484d(this.f94902d, uVar.f94902d) && C41536l.m120484d(this.f94903e, uVar.f94903e) && C41536l.m120484d(this.f94904f, uVar.f94904f) && C41536l.m120484d(this.f94905g, uVar.f94905g) && C41536l.m120484d(this.f94906h, uVar.f94906h) && C41536l.m120484d(this.f94907i, uVar.f94907i) && C41536l.m120484d(this.f94908j, uVar.f94908j) && C41536l.m120484d(this.f94909k, uVar.f94909k) && C41536l.m120484d(this.f94910l, uVar.f94910l) && C41536l.m120484d(this.f94911m, uVar.f94911m) && C41536l.m120484d(this.f94912n, uVar.f94912n) && C41536l.m120484d(this.f94913o, uVar.f94913o);
    }

    public int hashCode() {
        int hashCode = ((((this.f94899a.hashCode() * 31) + C7397t.m28148a(this.f94900b)) * 31) + this.f94901c.hashCode()) * 31;
        Date date = this.f94902d;
        int i = 0;
        int hashCode2 = (hashCode + (date == null ? 0 : date.hashCode())) * 31;
        String str = this.f94903e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f94904f;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f94905g;
        int hashCode5 = (hashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f94906h;
        int hashCode6 = (hashCode5 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str2 = this.f94907i;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d4 = this.f94908j;
        int hashCode8 = (hashCode7 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.f94909k;
        int hashCode9 = (hashCode8 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.f94910l;
        int hashCode10 = (hashCode9 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.f94911m;
        int hashCode11 = (hashCode10 + (d7 == null ? 0 : d7.hashCode())) * 31;
        String str3 = this.f94912n;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f94913o;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode12 + i;
    }

    public String toString() {
        String str = this.f94899a;
        long j = this.f94900b;
        String str2 = this.f94901c;
        Date date = this.f94902d;
        String str3 = this.f94903e;
        Double d = this.f94904f;
        Double d2 = this.f94905g;
        Double d3 = this.f94906h;
        String str4 = this.f94907i;
        Double d4 = this.f94908j;
        Double d5 = this.f94909k;
        Double d6 = this.f94910l;
        Double d7 = this.f94911m;
        String str5 = this.f94912n;
        String str6 = this.f94913o;
        return "LoanSchedule(primaryKey=" + str + ", loanKey=" + j + ", loanNo=" + str2 + ", payDate=" + date + ", ccy=" + str3 + ", priAmt=" + d + ", intAmt=" + d2 + ", feeAmt=" + d3 + ", feeType=" + str4 + ", exAmt=" + d4 + ", totalAmt=" + d5 + ", nextPayAmt=" + d6 + ", intAmtWithoutOffset=" + d7 + ", feeTypeDictionaryKey=" + str5 + ", feeTypeDictionaryValue=" + str6 + ")";
    }
}

package ef0;

import kotlin.jvm.internal.C41536l;

/* renamed from: ef0.e */
public final class C20230e {

    /* renamed from: a */
    private final String f55104a;

    /* renamed from: b */
    private final String f55105b;

    /* renamed from: c */
    private final Integer f55106c;

    /* renamed from: d */
    private final Integer f55107d;

    /* renamed from: e */
    private final Integer f55108e;

    /* renamed from: f */
    private final String f55109f;

    /* renamed from: g */
    private final String f55110g;

    /* renamed from: h */
    private final String f55111h;

    /* renamed from: i */
    private final String f55112i;

    /* renamed from: j */
    private final String f55113j;

    /* renamed from: k */
    private final String f55114k;

    /* renamed from: l */
    private final C20231f f55115l;

    /* renamed from: m */
    private final String f55116m;

    /* renamed from: n */
    private final C20231f f55117n;

    /* renamed from: o */
    private final Integer f55118o;

    public C20230e(String str, String str2, Integer num, Integer num2, Integer num3, String str3, String str4, String str5, String str6, String str7, String str8, C20231f fVar, String str9, C20231f fVar2, Integer num4) {
        this.f55104a = str;
        this.f55105b = str2;
        this.f55106c = num;
        this.f55107d = num2;
        this.f55108e = num3;
        this.f55109f = str3;
        this.f55110g = str4;
        this.f55111h = str5;
        this.f55112i = str6;
        this.f55113j = str7;
        this.f55114k = str8;
        this.f55115l = fVar;
        this.f55116m = str9;
        this.f55117n = fVar2;
        this.f55118o = num4;
    }

    /* renamed from: a */
    public final Integer mo48678a() {
        return this.f55118o;
    }

    /* renamed from: b */
    public final Integer mo48679b() {
        return this.f55108e;
    }

    /* renamed from: c */
    public final Integer mo48680c() {
        return this.f55107d;
    }

    /* renamed from: d */
    public final Integer mo48681d() {
        return this.f55106c;
    }

    /* renamed from: e */
    public final String mo48682e() {
        return this.f55111h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20230e)) {
            return false;
        }
        C20230e eVar = (C20230e) obj;
        return C41536l.m120484d(this.f55104a, eVar.f55104a) && C41536l.m120484d(this.f55105b, eVar.f55105b) && C41536l.m120484d(this.f55106c, eVar.f55106c) && C41536l.m120484d(this.f55107d, eVar.f55107d) && C41536l.m120484d(this.f55108e, eVar.f55108e) && C41536l.m120484d(this.f55109f, eVar.f55109f) && C41536l.m120484d(this.f55110g, eVar.f55110g) && C41536l.m120484d(this.f55111h, eVar.f55111h) && C41536l.m120484d(this.f55112i, eVar.f55112i) && C41536l.m120484d(this.f55113j, eVar.f55113j) && C41536l.m120484d(this.f55114k, eVar.f55114k) && C41536l.m120484d(this.f55115l, eVar.f55115l) && C41536l.m120484d(this.f55116m, eVar.f55116m) && C41536l.m120484d(this.f55117n, eVar.f55117n) && C41536l.m120484d(this.f55118o, eVar.f55118o);
    }

    /* renamed from: f */
    public final String mo48684f() {
        return this.f55113j;
    }

    /* renamed from: g */
    public final String mo48685g() {
        return this.f55116m;
    }

    /* renamed from: h */
    public final C20231f mo48686h() {
        return this.f55115l;
    }

    public int hashCode() {
        String str = this.f55104a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f55105b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f55106c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f55107d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f55108e;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.f55109f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f55110g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f55111h;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f55112i;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f55113j;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f55114k;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        C20231f fVar = this.f55115l;
        int hashCode12 = (hashCode11 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str9 = this.f55116m;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        C20231f fVar2 = this.f55117n;
        int hashCode14 = (hashCode13 + (fVar2 == null ? 0 : fVar2.hashCode())) * 31;
        Integer num4 = this.f55118o;
        if (num4 != null) {
            i = num4.hashCode();
        }
        return hashCode14 + i;
    }

    /* renamed from: i */
    public final String mo48688i() {
        return this.f55104a;
    }

    /* renamed from: j */
    public final String mo48689j() {
        return this.f55109f;
    }

    /* renamed from: k */
    public final String mo48690k() {
        return this.f55114k;
    }

    /* renamed from: l */
    public final String mo48691l() {
        return this.f55105b;
    }

    /* renamed from: m */
    public final C20231f mo48692m() {
        return this.f55117n;
    }

    /* renamed from: n */
    public final String mo48693n() {
        return this.f55110g;
    }

    /* renamed from: o */
    public final String mo48694o() {
        return this.f55112i;
    }

    public String toString() {
        String str = this.f55104a;
        String str2 = this.f55105b;
        Integer num = this.f55106c;
        Integer num2 = this.f55107d;
        Integer num3 = this.f55108e;
        String str3 = this.f55109f;
        String str4 = this.f55110g;
        String str5 = this.f55111h;
        String str6 = this.f55112i;
        String str7 = this.f55113j;
        String str8 = this.f55114k;
        C20231f fVar = this.f55115l;
        String str9 = this.f55116m;
        C20231f fVar2 = this.f55117n;
        Integer num4 = this.f55118o;
        return "ReviewDataModel(firstLastName=" + str + ", pn=" + str2 + ", birthYear=" + num + ", birthMonth=" + num2 + ", birthDay=" + num3 + ", gender=" + str3 + ", residenceCountry=" + str4 + ", city=" + str5 + ", street=" + str6 + ", emailAddress=" + str7 + ", phone=" + str8 + ", employmentStatus=" + fVar + ", employer=" + str9 + ", position=" + fVar2 + ", annualIncome=" + num4 + ")";
    }
}

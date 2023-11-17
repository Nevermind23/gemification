package p341ge.bog.mobilebank.loans.presentation.details;

import fs0.C32000a;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import xr0.C39837a;
import xr0.C39841d;

/* renamed from: ge.bog.mobilebank.loans.presentation.details.g */
public abstract class C32608g {

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.g$a */
    public static final class C32609a extends C32608g {

        /* renamed from: a */
        private final C32000a f80268a;

        /* renamed from: b */
        private final List f80269b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32609a(C32000a aVar, List list) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "buttons");
            this.f80268a = aVar;
            this.f80269b = list;
        }

        /* renamed from: a */
        public final List mo74120a() {
            return this.f80269b;
        }

        /* renamed from: b */
        public final C32000a mo74121b() {
            return this.f80268a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32609a)) {
                return false;
            }
            C32609a aVar = (C32609a) obj;
            return C41536l.m120484d(this.f80268a, aVar.f80268a) && C41536l.m120484d(this.f80269b, aVar.f80269b);
        }

        public int hashCode() {
            C32000a aVar = this.f80268a;
            return ((aVar == null ? 0 : aVar.hashCode()) * 31) + this.f80269b.hashCode();
        }

        public String toString() {
            C32000a aVar = this.f80268a;
            List list = this.f80269b;
            return "ActionButtons(feedback=" + aVar + ", buttons=" + list + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.g$b */
    public static final class C32610b extends C32608g {

        /* renamed from: a */
        private final StringSource f80270a;

        /* renamed from: b */
        private final StringSource f80271b;

        /* renamed from: c */
        private final String f80272c;

        /* renamed from: d */
        private final String f80273d;

        /* renamed from: e */
        private final String f80274e;

        /* renamed from: f */
        private final String f80275f;

        /* renamed from: g */
        private final String f80276g;

        /* renamed from: h */
        private final String f80277h;

        /* renamed from: i */
        private final String f80278i;

        /* renamed from: j */
        private final String f80279j;

        /* renamed from: k */
        private final String f80280k;

        /* renamed from: l */
        private final String f80281l;

        /* renamed from: m */
        private final boolean f80282m;

        /* renamed from: n */
        private final String f80283n;

        /* renamed from: o */
        private final Long f80284o;

        /* renamed from: p */
        private final Float f80285p;

        /* renamed from: q */
        private final Float f80286q;

        /* renamed from: r */
        private final String f80287r;

        /* renamed from: s */
        private final String f80288s;

        /* renamed from: t */
        private final String f80289t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32610b(StringSource stringSource, StringSource stringSource2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11, Long l, Float f, Float f2, String str12, String str13, String str14) {
            super((DefaultConstructorMarker) null);
            String str15 = str8;
            C41536l.m120489i(str, "date");
            C41536l.m120489i(str3, "amount");
            C41536l.m120489i(str4, "initialPrincipal");
            C41536l.m120489i(str15, "interestRate");
            this.f80270a = stringSource;
            this.f80271b = stringSource2;
            this.f80272c = str;
            this.f80273d = str2;
            this.f80274e = str3;
            this.f80275f = str4;
            this.f80276g = str5;
            this.f80277h = str6;
            this.f80278i = str7;
            this.f80279j = str15;
            this.f80280k = str9;
            this.f80281l = str10;
            this.f80282m = z;
            this.f80283n = str11;
            this.f80284o = l;
            this.f80285p = f;
            this.f80286q = f2;
            this.f80287r = str12;
            this.f80288s = str13;
            this.f80289t = str14;
        }

        /* renamed from: a */
        public final String mo74125a() {
            return this.f80273d;
        }

        /* renamed from: b */
        public final String mo74126b() {
            return this.f80274e;
        }

        /* renamed from: c */
        public final boolean mo74127c() {
            return this.f80282m;
        }

        /* renamed from: d */
        public final String mo74128d() {
            return this.f80272c;
        }

        /* renamed from: e */
        public final String mo74129e() {
            return this.f80275f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32610b)) {
                return false;
            }
            C32610b bVar = (C32610b) obj;
            return C41536l.m120484d(this.f80270a, bVar.f80270a) && C41536l.m120484d(this.f80271b, bVar.f80271b) && C41536l.m120484d(this.f80272c, bVar.f80272c) && C41536l.m120484d(this.f80273d, bVar.f80273d) && C41536l.m120484d(this.f80274e, bVar.f80274e) && C41536l.m120484d(this.f80275f, bVar.f80275f) && C41536l.m120484d(this.f80276g, bVar.f80276g) && C41536l.m120484d(this.f80277h, bVar.f80277h) && C41536l.m120484d(this.f80278i, bVar.f80278i) && C41536l.m120484d(this.f80279j, bVar.f80279j) && C41536l.m120484d(this.f80280k, bVar.f80280k) && C41536l.m120484d(this.f80281l, bVar.f80281l) && this.f80282m == bVar.f80282m && C41536l.m120484d(this.f80283n, bVar.f80283n) && C41536l.m120484d(this.f80284o, bVar.f80284o) && C41536l.m120484d(this.f80285p, bVar.f80285p) && C41536l.m120484d(this.f80286q, bVar.f80286q) && C41536l.m120484d(this.f80287r, bVar.f80287r) && C41536l.m120484d(this.f80288s, bVar.f80288s) && C41536l.m120484d(this.f80289t, bVar.f80289t);
        }

        /* renamed from: f */
        public final String mo74131f() {
            return this.f80281l;
        }

        /* renamed from: g */
        public final String mo74132g() {
            return this.f80279j;
        }

        /* renamed from: h */
        public final StringSource mo74133h() {
            return this.f80270a;
        }

        public int hashCode() {
            StringSource stringSource = this.f80270a;
            int i = 0;
            int hashCode = (stringSource == null ? 0 : stringSource.hashCode()) * 31;
            StringSource stringSource2 = this.f80271b;
            int hashCode2 = (((hashCode + (stringSource2 == null ? 0 : stringSource2.hashCode())) * 31) + this.f80272c.hashCode()) * 31;
            String str = this.f80273d;
            int hashCode3 = (((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.f80274e.hashCode()) * 31) + this.f80275f.hashCode()) * 31;
            String str2 = this.f80276g;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f80277h;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f80278i;
            int hashCode6 = (((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f80279j.hashCode()) * 31;
            String str5 = this.f80280k;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f80281l;
            int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            boolean z = this.f80282m;
            if (z) {
                z = true;
            }
            int i2 = (hashCode8 + (z ? 1 : 0)) * 31;
            String str7 = this.f80283n;
            int hashCode9 = (i2 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Long l = this.f80284o;
            int hashCode10 = (hashCode9 + (l == null ? 0 : l.hashCode())) * 31;
            Float f = this.f80285p;
            int hashCode11 = (hashCode10 + (f == null ? 0 : f.hashCode())) * 31;
            Float f2 = this.f80286q;
            int hashCode12 = (hashCode11 + (f2 == null ? 0 : f2.hashCode())) * 31;
            String str8 = this.f80287r;
            int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.f80288s;
            int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.f80289t;
            if (str10 != null) {
                i = str10.hashCode();
            }
            return hashCode14 + i;
        }

        /* renamed from: i */
        public final String mo74135i() {
            return this.f80277h;
        }

        /* renamed from: j */
        public final String mo74136j() {
            return this.f80278i;
        }

        /* renamed from: k */
        public final String mo74137k() {
            return this.f80276g;
        }

        /* renamed from: l */
        public final String mo74138l() {
            return this.f80280k;
        }

        /* renamed from: m */
        public final StringSource mo74139m() {
            return this.f80271b;
        }

        public String toString() {
            StringSource stringSource = this.f80270a;
            StringSource stringSource2 = this.f80271b;
            String str = this.f80272c;
            String str2 = this.f80273d;
            String str3 = this.f80274e;
            String str4 = this.f80275f;
            String str5 = this.f80276g;
            String str6 = this.f80277h;
            String str7 = this.f80278i;
            String str8 = this.f80279j;
            String str9 = this.f80280k;
            String str10 = this.f80281l;
            boolean z = this.f80282m;
            String str11 = this.f80283n;
            Long l = this.f80284o;
            Float f = this.f80285p;
            Float f2 = this.f80286q;
            String str12 = this.f80287r;
            String str13 = this.f80288s;
            String str14 = this.f80289t;
            return "Details(name=" + stringSource + ", type=" + stringSource2 + ", date=" + str + ", acctNo=" + str2 + ", amount=" + str3 + ", initialPrincipal=" + str4 + ", remainingInterest=" + str5 + ", plnIntAmount=" + str6 + ", plnPenalty=" + str7 + ", interestRate=" + str8 + ", totalOffsetAmount=" + str9 + ", insAmount=" + str10 + ", contractUrl=" + z + ", nextFloatingRate=" + str11 + ", nextLoanRateChangeDate=" + l + ", nextSpreadRate=" + f + ", nextMinIntRate=" + f2 + ", nextLoanIntTypeName=" + str12 + ", nextLoanIntTypeDictionaryKey=" + str13 + ", nextLoanIntTypeDictionaryValue=" + str14 + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.g$c */
    public static final class C32611c extends C32608g {

        /* renamed from: a */
        public static final C32611c f80290a = new C32611c();

        private C32611c() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.g$d */
    public static final class C32612d extends C32608g {

        /* renamed from: a */
        private final String f80291a;

        /* renamed from: b */
        private final Long f80292b;

        /* renamed from: c */
        private final Float f80293c;

        /* renamed from: d */
        private final Float f80294d;

        /* renamed from: e */
        private final String f80295e;

        /* renamed from: f */
        private final String f80296f;

        /* renamed from: g */
        private final String f80297g;

        public C32612d(String str, Long l, Float f, Float f2, String str2, String str3, String str4) {
            super((DefaultConstructorMarker) null);
            this.f80291a = str;
            this.f80292b = l;
            this.f80293c = f;
            this.f80294d = f2;
            this.f80295e = str2;
            this.f80296f = str3;
            this.f80297g = str4;
        }

        /* renamed from: a */
        public final String mo74141a() {
            return this.f80297g;
        }

        /* renamed from: b */
        public final Long mo74142b() {
            return this.f80292b;
        }

        /* renamed from: c */
        public final Float mo74143c() {
            return this.f80294d;
        }

        /* renamed from: d */
        public final Float mo74144d() {
            return this.f80293c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32612d)) {
                return false;
            }
            C32612d dVar = (C32612d) obj;
            return C41536l.m120484d(this.f80291a, dVar.f80291a) && C41536l.m120484d(this.f80292b, dVar.f80292b) && C41536l.m120484d(this.f80293c, dVar.f80293c) && C41536l.m120484d(this.f80294d, dVar.f80294d) && C41536l.m120484d(this.f80295e, dVar.f80295e) && C41536l.m120484d(this.f80296f, dVar.f80296f) && C41536l.m120484d(this.f80297g, dVar.f80297g);
        }

        public int hashCode() {
            String str = this.f80291a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l = this.f80292b;
            int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
            Float f = this.f80293c;
            int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
            Float f2 = this.f80294d;
            int hashCode4 = (hashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
            String str2 = this.f80295e;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f80296f;
            int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f80297g;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return hashCode6 + i;
        }

        public String toString() {
            String str = this.f80291a;
            Long l = this.f80292b;
            Float f = this.f80293c;
            Float f2 = this.f80294d;
            String str2 = this.f80295e;
            String str3 = this.f80296f;
            String str4 = this.f80297g;
            return "InfoBox(nextFloatingRate=" + str + ", nextLoanRateChangeDate=" + l + ", nextSpreadRate=" + f + ", nextMinIntRate=" + f2 + ", nextLoanIntTypeName=" + str2 + ", nextLoanIntTypeDictionaryKey=" + str3 + ", nextLoanIntTypeDictionaryValue=" + str4 + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.g$e */
    public static final class C32613e extends C32608g {

        /* renamed from: a */
        private final String f80298a;

        /* renamed from: b */
        private final BigDecimal f80299b;

        /* renamed from: c */
        private final BigDecimal f80300c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32613e(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "curr");
            C41536l.m120489i(bigDecimal, "amount");
            C41536l.m120489i(bigDecimal2, "payedAmount");
            this.f80298a = str;
            this.f80299b = bigDecimal;
            this.f80300c = bigDecimal2;
        }

        /* renamed from: a */
        public final BigDecimal mo74148a() {
            return this.f80299b;
        }

        /* renamed from: b */
        public final String mo74149b() {
            return this.f80298a;
        }

        /* renamed from: c */
        public final BigDecimal mo74150c() {
            return this.f80300c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32613e)) {
                return false;
            }
            C32613e eVar = (C32613e) obj;
            return C41536l.m120484d(this.f80298a, eVar.f80298a) && C41536l.m120484d(this.f80299b, eVar.f80299b) && C41536l.m120484d(this.f80300c, eVar.f80300c);
        }

        public int hashCode() {
            return (((this.f80298a.hashCode() * 31) + this.f80299b.hashCode()) * 31) + this.f80300c.hashCode();
        }

        public String toString() {
            String str = this.f80298a;
            BigDecimal bigDecimal = this.f80299b;
            BigDecimal bigDecimal2 = this.f80300c;
            return "InstallmentProgress(curr=" + str + ", amount=" + bigDecimal + ", payedAmount=" + bigDecimal2 + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.g$f */
    public static final class C32614f extends C32608g {

        /* renamed from: a */
        public static final C32614f f80301a = new C32614f();

        private C32614f() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.g$g */
    public static final class C32615g extends C32608g {

        /* renamed from: a */
        private final BigDecimal f80302a;

        /* renamed from: b */
        private final String f80303b;

        /* renamed from: c */
        private final String f80304c;

        /* renamed from: d */
        private final String f80305d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32615g(BigDecimal bigDecimal, String str, String str2, String str3) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "currency");
            C41536l.m120489i(str2, "date");
            this.f80302a = bigDecimal;
            this.f80303b = str;
            this.f80304c = str2;
            this.f80305d = str3;
        }

        /* renamed from: a */
        public final String mo74154a() {
            return this.f80303b;
        }

        /* renamed from: b */
        public final String mo74155b() {
            return this.f80304c;
        }

        /* renamed from: c */
        public final String mo74156c() {
            return this.f80305d;
        }

        /* renamed from: d */
        public final BigDecimal mo74157d() {
            return this.f80302a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32615g)) {
                return false;
            }
            C32615g gVar = (C32615g) obj;
            return C41536l.m120484d(this.f80302a, gVar.f80302a) && C41536l.m120484d(this.f80303b, gVar.f80303b) && C41536l.m120484d(this.f80304c, gVar.f80304c) && C41536l.m120484d(this.f80305d, gVar.f80305d);
        }

        public int hashCode() {
            BigDecimal bigDecimal = this.f80302a;
            int i = 0;
            int hashCode = (((((bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31) + this.f80303b.hashCode()) * 31) + this.f80304c.hashCode()) * 31;
            String str = this.f80305d;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            BigDecimal bigDecimal = this.f80302a;
            String str = this.f80303b;
            String str2 = this.f80304c;
            String str3 = this.f80305d;
            return "PlnHistory(prevPaymentAmount=" + bigDecimal + ", currency=" + str + ", date=" + str2 + ", operationType=" + str3 + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.g$h */
    public static final class C32616h extends C32608g {

        /* renamed from: a */
        private final List f80306a;

        /* renamed from: b */
        private int f80307b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32616h(List list, int i) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "headersData");
            this.f80306a = list;
            this.f80307b = i;
        }

        /* renamed from: a */
        public final List mo74161a() {
            return this.f80306a;
        }

        /* renamed from: b */
        public final int mo74162b() {
            return this.f80307b;
        }

        /* renamed from: c */
        public final void mo74163c(int i) {
            this.f80307b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32616h)) {
                return false;
            }
            C32616h hVar = (C32616h) obj;
            return C41536l.m120484d(this.f80306a, hVar.f80306a) && this.f80307b == hVar.f80307b;
        }

        public int hashCode() {
            return (this.f80306a.hashCode() * 31) + this.f80307b;
        }

        public String toString() {
            List list = this.f80306a;
            int i = this.f80307b;
            return "ProductHeader(headersData=" + list + ", selectedPosition=" + i + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.g$i */
    public static final class C32617i extends C32608g {

        /* renamed from: a */
        private final C39841d f80308a;

        /* renamed from: b */
        private final C39837a f80309b;

        public C32617i(C39841d dVar, C39837a aVar) {
            super((DefaultConstructorMarker) null);
            this.f80308a = dVar;
            this.f80309b = aVar;
        }

        /* renamed from: a */
        public final C39837a mo74167a() {
            return this.f80309b;
        }

        /* renamed from: b */
        public final C39841d mo74168b() {
            return this.f80308a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32617i)) {
                return false;
            }
            C32617i iVar = (C32617i) obj;
            return C41536l.m120484d(this.f80308a, iVar.f80308a) && C41536l.m120484d(this.f80309b, iVar.f80309b);
        }

        public int hashCode() {
            C39841d dVar = this.f80308a;
            int i = 0;
            int hashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
            C39837a aVar = this.f80309b;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            C39841d dVar = this.f80308a;
            C39837a aVar = this.f80309b;
            return "ScheduleAndHistory(schedule=" + dVar + ", history=" + aVar + ")";
        }
    }

    private C32608g() {
    }

    public /* synthetic */ C32608g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

package p341ge.bog.mobilebank.loans.presentation.historygraphics;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.f */
public abstract class C32648f {

    /* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.f$a */
    public static final class C32649a extends C32648f {

        /* renamed from: a */
        private final String f80365a;

        /* renamed from: b */
        private final String f80366b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32649a(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "title");
            C41536l.m120489i(str2, "description");
            this.f80365a = str;
            this.f80366b = str2;
        }

        /* renamed from: b */
        public int mo74214b() {
            return 5;
        }

        /* renamed from: c */
        public final String mo74215c() {
            return this.f80366b;
        }

        /* renamed from: d */
        public final String mo74216d() {
            return this.f80365a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32649a)) {
                return false;
            }
            C32649a aVar = (C32649a) obj;
            return C41536l.m120484d(this.f80365a, aVar.f80365a) && C41536l.m120484d(this.f80366b, aVar.f80366b);
        }

        public int hashCode() {
            return (this.f80365a.hashCode() * 31) + this.f80366b.hashCode();
        }

        public String toString() {
            String str = this.f80365a;
            String str2 = this.f80366b;
            return "DataNotFoundItem(title=" + str + ", description=" + str2 + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.f$b */
    public static final class C32650b extends C32648f {

        /* renamed from: a */
        private final int f80367a;

        /* renamed from: b */
        private final String f80368b;

        /* renamed from: c */
        private final String f80369c;

        /* renamed from: d */
        private final String f80370d;

        /* renamed from: e */
        private final String f80371e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32650b(int i, String str, String str2, String str3, String str4) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "text");
            C41536l.m120489i(str2, "title");
            C41536l.m120489i(str3, "subTitle");
            C41536l.m120489i(str4, "buttonText");
            this.f80367a = i;
            this.f80368b = str;
            this.f80369c = str2;
            this.f80370d = str3;
            this.f80371e = str4;
        }

        /* renamed from: b */
        public int mo74214b() {
            return 0;
        }

        /* renamed from: c */
        public final String mo74220c() {
            return this.f80371e;
        }

        /* renamed from: d */
        public final int mo74221d() {
            return this.f80367a;
        }

        /* renamed from: e */
        public final String mo74222e() {
            return this.f80370d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32650b)) {
                return false;
            }
            C32650b bVar = (C32650b) obj;
            return this.f80367a == bVar.f80367a && C41536l.m120484d(this.f80368b, bVar.f80368b) && C41536l.m120484d(this.f80369c, bVar.f80369c) && C41536l.m120484d(this.f80370d, bVar.f80370d) && C41536l.m120484d(this.f80371e, bVar.f80371e);
        }

        /* renamed from: f */
        public final String mo74224f() {
            return this.f80368b;
        }

        /* renamed from: g */
        public final String mo74225g() {
            return this.f80369c;
        }

        public int hashCode() {
            return (((((((this.f80367a * 31) + this.f80368b.hashCode()) * 31) + this.f80369c.hashCode()) * 31) + this.f80370d.hashCode()) * 31) + this.f80371e.hashCode();
        }

        public String toString() {
            int i = this.f80367a;
            String str = this.f80368b;
            String str2 = this.f80369c;
            String str3 = this.f80370d;
            String str4 = this.f80371e;
            return "HeaderItem(image=" + i + ", text=" + str + ", title=" + str2 + ", subTitle=" + str3 + ", buttonText=" + str4 + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.f$c */
    public static final class C32651c extends C32648f {

        /* renamed from: a */
        public static final C32651c f80372a = new C32651c();

        private C32651c() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public int mo74214b() {
            return 8;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.f$d */
    public static final class C32652d extends C32648f {

        /* renamed from: a */
        public static final C32652d f80373a = new C32652d();

        private C32652d() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public int mo74214b() {
            return 4;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.f$e */
    public static final class C32653e extends C32648f {

        /* renamed from: a */
        private final int f80374a;

        /* renamed from: b */
        private final String f80375b;

        /* renamed from: c */
        private final BigDecimal f80376c;

        /* renamed from: d */
        private final Long f80377d;

        /* renamed from: e */
        private final String f80378e;

        /* renamed from: f */
        private boolean f80379f;

        /* renamed from: g */
        private final List f80380g;

        /* renamed from: h */
        private final boolean f80381h;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C32653e(int i, String str, BigDecimal bigDecimal, Long l, String str2, boolean z, List list, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, bigDecimal, l, str2, (i2 & 32) != 0 ? false : z, list, z2);
        }

        /* renamed from: a */
        public void mo74213a() {
            this.f80379f = !this.f80379f;
        }

        /* renamed from: b */
        public int mo74214b() {
            return 1;
        }

        /* renamed from: c */
        public final BigDecimal mo74228c() {
            return this.f80376c;
        }

        /* renamed from: d */
        public final String mo74229d() {
            return this.f80375b;
        }

        /* renamed from: e */
        public final int mo74230e() {
            return this.f80374a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32653e)) {
                return false;
            }
            C32653e eVar = (C32653e) obj;
            return this.f80374a == eVar.f80374a && C41536l.m120484d(this.f80375b, eVar.f80375b) && C41536l.m120484d(this.f80376c, eVar.f80376c) && C41536l.m120484d(this.f80377d, eVar.f80377d) && C41536l.m120484d(this.f80378e, eVar.f80378e) && this.f80379f == eVar.f80379f && C41536l.m120484d(this.f80380g, eVar.f80380g) && this.f80381h == eVar.f80381h;
        }

        /* renamed from: f */
        public final List mo74232f() {
            return this.f80380g;
        }

        /* renamed from: g */
        public final String mo74233g() {
            return this.f80378e;
        }

        /* renamed from: h */
        public final Long mo74234h() {
            return this.f80377d;
        }

        public int hashCode() {
            int i = this.f80374a * 31;
            String str = this.f80375b;
            int i2 = 0;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            BigDecimal bigDecimal = this.f80376c;
            int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            Long l = this.f80377d;
            if (l != null) {
                i2 = l.hashCode();
            }
            int hashCode3 = (((hashCode2 + i2) * 31) + this.f80378e.hashCode()) * 31;
            boolean z = this.f80379f;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int hashCode4 = (((hashCode3 + (z ? 1 : 0)) * 31) + this.f80380g.hashCode()) * 31;
            boolean z3 = this.f80381h;
            if (!z3) {
                z2 = z3;
            }
            return hashCode4 + (z2 ? 1 : 0);
        }

        /* renamed from: i */
        public final boolean mo74236i() {
            return this.f80379f;
        }

        /* renamed from: j */
        public final boolean mo74237j() {
            return this.f80381h;
        }

        public String toString() {
            int i = this.f80374a;
            String str = this.f80375b;
            BigDecimal bigDecimal = this.f80376c;
            Long l = this.f80377d;
            String str2 = this.f80378e;
            boolean z = this.f80379f;
            List list = this.f80380g;
            boolean z2 = this.f80381h;
            return "LoansScheduleAndGraphicsFirstItem(image=" + i + ", ccy=" + str + ", amount=" + bigDecimal + ", title=" + l + ", text=" + str2 + ", isChevronChecked=" + z + ", list=" + list + ", isDividerVisible=" + z2 + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32653e(int i, String str, BigDecimal bigDecimal, Long l, String str2, boolean z, List list, boolean z2) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str2, "text");
            C41536l.m120489i(list, "list");
            this.f80374a = i;
            this.f80375b = str;
            this.f80376c = bigDecimal;
            this.f80377d = l;
            this.f80378e = str2;
            this.f80379f = z;
            this.f80380g = list;
            this.f80381h = z2;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.f$f */
    public static final class C32654f extends C32648f {

        /* renamed from: a */
        private final String f80382a;

        /* renamed from: b */
        private final String f80383b;

        /* renamed from: c */
        private boolean f80384c;

        /* renamed from: d */
        private final List f80385d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32654f(String str, String str2, boolean z, List list) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "date");
            C41536l.m120489i(str2, "amount");
            C41536l.m120489i(list, "list");
            this.f80382a = str;
            this.f80383b = str2;
            this.f80384c = z;
            this.f80385d = list;
        }

        /* renamed from: a */
        public void mo74213a() {
            this.f80384c = !this.f80384c;
        }

        /* renamed from: b */
        public int mo74214b() {
            return 2;
        }

        /* renamed from: c */
        public final String mo74239c() {
            return this.f80383b;
        }

        /* renamed from: d */
        public final String mo74240d() {
            return this.f80382a;
        }

        /* renamed from: e */
        public final List mo74241e() {
            return this.f80385d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32654f)) {
                return false;
            }
            C32654f fVar = (C32654f) obj;
            return C41536l.m120484d(this.f80382a, fVar.f80382a) && C41536l.m120484d(this.f80383b, fVar.f80383b) && this.f80384c == fVar.f80384c && C41536l.m120484d(this.f80385d, fVar.f80385d);
        }

        /* renamed from: f */
        public final boolean mo74243f() {
            return this.f80384c;
        }

        public int hashCode() {
            int hashCode = ((this.f80382a.hashCode() * 31) + this.f80383b.hashCode()) * 31;
            boolean z = this.f80384c;
            if (z) {
                z = true;
            }
            return ((hashCode + (z ? 1 : 0)) * 31) + this.f80385d.hashCode();
        }

        public String toString() {
            String str = this.f80382a;
            String str2 = this.f80383b;
            boolean z = this.f80384c;
            List list = this.f80385d;
            return "LoansScheduleAndGraphicsItem(date=" + str + ", amount=" + str2 + ", isChevronChecked=" + z + ", list=" + list + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.f$g */
    public static final class C32655g extends C32648f {

        /* renamed from: a */
        public static final C32655g f80386a = new C32655g();

        private C32655g() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public int mo74214b() {
            return 3;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.f$h */
    public static final class C32656h extends C32648f {

        /* renamed from: a */
        private final int f80387a;

        /* renamed from: b */
        private final String f80388b;

        /* renamed from: c */
        private final long f80389c;

        /* renamed from: d */
        private final BigDecimal f80390d;

        /* renamed from: e */
        private final String f80391e;

        /* renamed from: f */
        private final String f80392f;

        /* renamed from: g */
        private final boolean f80393g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32656h(int i, String str, long j, BigDecimal bigDecimal, String str2, String str3, boolean z) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "title");
            C41536l.m120489i(bigDecimal, "amount");
            C41536l.m120489i(str2, "ccy");
            C41536l.m120489i(str3, "operTypeDictionaryKey");
            this.f80387a = i;
            this.f80388b = str;
            this.f80389c = j;
            this.f80390d = bigDecimal;
            this.f80391e = str2;
            this.f80392f = str3;
            this.f80393g = z;
        }

        /* renamed from: b */
        public int mo74214b() {
            return 6;
        }

        /* renamed from: c */
        public final BigDecimal mo74246c() {
            return this.f80390d;
        }

        /* renamed from: d */
        public final String mo74247d() {
            return this.f80391e;
        }

        /* renamed from: e */
        public final long mo74248e() {
            return this.f80389c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32656h)) {
                return false;
            }
            C32656h hVar = (C32656h) obj;
            return this.f80387a == hVar.f80387a && C41536l.m120484d(this.f80388b, hVar.f80388b) && this.f80389c == hVar.f80389c && C41536l.m120484d(this.f80390d, hVar.f80390d) && C41536l.m120484d(this.f80391e, hVar.f80391e) && C41536l.m120484d(this.f80392f, hVar.f80392f) && this.f80393g == hVar.f80393g;
        }

        /* renamed from: f */
        public final int mo74250f() {
            return this.f80387a;
        }

        /* renamed from: g */
        public final String mo74251g() {
            return this.f80392f;
        }

        /* renamed from: h */
        public final String mo74252h() {
            return this.f80388b;
        }

        public int hashCode() {
            int hashCode = ((((((((((this.f80387a * 31) + this.f80388b.hashCode()) * 31) + C7397t.m28148a(this.f80389c)) * 31) + this.f80390d.hashCode()) * 31) + this.f80391e.hashCode()) * 31) + this.f80392f.hashCode()) * 31;
            boolean z = this.f80393g;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        /* renamed from: i */
        public final boolean mo74254i() {
            return this.f80393g;
        }

        public String toString() {
            int i = this.f80387a;
            String str = this.f80388b;
            long j = this.f80389c;
            BigDecimal bigDecimal = this.f80390d;
            String str2 = this.f80391e;
            String str3 = this.f80392f;
            boolean z = this.f80393g;
            return "PlnLoanHistoryFirstItem(image=" + i + ", title=" + str + ", date=" + j + ", amount=" + bigDecimal + ", ccy=" + str2 + ", operTypeDictionaryKey=" + str3 + ", isDividerVisible=" + z + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.f$i */
    public static final class C32657i extends C32648f {

        /* renamed from: a */
        private final long f80394a;

        /* renamed from: b */
        private final BigDecimal f80395b;

        /* renamed from: c */
        private final String f80396c;

        /* renamed from: d */
        private final String f80397d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32657i(long j, BigDecimal bigDecimal, String str, String str2) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(bigDecimal, "amount");
            C41536l.m120489i(str, "ccy");
            C41536l.m120489i(str2, "operTypeDictionaryKey");
            this.f80394a = j;
            this.f80395b = bigDecimal;
            this.f80396c = str;
            this.f80397d = str2;
        }

        /* renamed from: b */
        public int mo74214b() {
            return 7;
        }

        /* renamed from: c */
        public final BigDecimal mo74256c() {
            return this.f80395b;
        }

        /* renamed from: d */
        public final String mo74257d() {
            return this.f80396c;
        }

        /* renamed from: e */
        public final long mo74258e() {
            return this.f80394a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32657i)) {
                return false;
            }
            C32657i iVar = (C32657i) obj;
            return this.f80394a == iVar.f80394a && C41536l.m120484d(this.f80395b, iVar.f80395b) && C41536l.m120484d(this.f80396c, iVar.f80396c) && C41536l.m120484d(this.f80397d, iVar.f80397d);
        }

        /* renamed from: f */
        public final String mo74260f() {
            return this.f80397d;
        }

        public int hashCode() {
            return (((((C7397t.m28148a(this.f80394a) * 31) + this.f80395b.hashCode()) * 31) + this.f80396c.hashCode()) * 31) + this.f80397d.hashCode();
        }

        public String toString() {
            long j = this.f80394a;
            BigDecimal bigDecimal = this.f80395b;
            String str = this.f80396c;
            String str2 = this.f80397d;
            return "PlnLoanHistoryItem(date=" + j + ", amount=" + bigDecimal + ", ccy=" + str + ", operTypeDictionaryKey=" + str2 + ")";
        }
    }

    private C32648f() {
    }

    public /* synthetic */ C32648f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public void mo74213a() {
    }

    /* renamed from: b */
    public abstract int mo74214b();
}

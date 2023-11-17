package n90;

import com.salesforce.marketingcloud.UrlHandler;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.pagestate.PageStateType;

/* renamed from: n90.a */
public abstract class C26381a {

    /* renamed from: n90.a$a */
    public static final class C26382a extends C26381a {

        /* renamed from: a */
        private final boolean f66845a;

        /* renamed from: b */
        private final PageStateType f66846b;

        /* renamed from: c */
        private final String f66847c;

        /* renamed from: d */
        private final String f66848d;

        /* renamed from: e */
        private final int f66849e = C26389h.HEADER.ordinal();

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26382a(boolean z, PageStateType pageStateType, String str, String str2) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(pageStateType, "state");
            C41536l.m120489i(str, "title");
            this.f66845a = z;
            this.f66846b = pageStateType;
            this.f66847c = str;
            this.f66848d = str2;
        }

        /* renamed from: a */
        public int mo65605a() {
            return this.f66849e;
        }

        /* renamed from: b */
        public final String mo65606b() {
            return this.f66848d;
        }

        /* renamed from: c */
        public final PageStateType mo65607c() {
            return this.f66846b;
        }

        /* renamed from: d */
        public final String mo65608d() {
            return this.f66847c;
        }

        /* renamed from: e */
        public final boolean mo65609e() {
            return this.f66845a;
        }
    }

    /* renamed from: n90.a$b */
    public static final class C26383b extends C26381a {

        /* renamed from: a */
        private final BigDecimal f66850a;

        /* renamed from: b */
        private final BigDecimal f66851b;

        /* renamed from: c */
        private final String f66852c;

        /* renamed from: d */
        private final int f66853d = C26389h.LOAN_AMOUNT_INFO.ordinal();

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26383b(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "ccy");
            this.f66850a = bigDecimal;
            this.f66851b = bigDecimal2;
            this.f66852c = str;
        }

        /* renamed from: a */
        public int mo65605a() {
            return this.f66853d;
        }

        /* renamed from: b */
        public final String mo65610b() {
            return this.f66852c;
        }

        /* renamed from: c */
        public final BigDecimal mo65611c() {
            return this.f66851b;
        }

        /* renamed from: d */
        public final BigDecimal mo65612d() {
            return this.f66850a;
        }
    }

    /* renamed from: n90.a$c */
    public static final class C26384c extends C26381a {

        /* renamed from: a */
        private final BigDecimal f66854a;

        /* renamed from: b */
        private final String f66855b;

        /* renamed from: c */
        private final String f66856c;

        /* renamed from: d */
        private final int f66857d = C26389h.LOAN_DETAILS.ordinal();

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26384c(BigDecimal bigDecimal, String str, String str2) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "ccy");
            C41536l.m120489i(str2, "loanTerm");
            this.f66854a = bigDecimal;
            this.f66855b = str;
            this.f66856c = str2;
        }

        /* renamed from: a */
        public int mo65605a() {
            return this.f66857d;
        }

        /* renamed from: b */
        public final String mo65613b() {
            return this.f66855b;
        }

        /* renamed from: c */
        public final String mo65614c() {
            return this.f66856c;
        }

        /* renamed from: d */
        public final BigDecimal mo65615d() {
            return this.f66854a;
        }
    }

    /* renamed from: n90.a$d */
    public static final class C26385d extends C26381a {

        /* renamed from: a */
        private final boolean f66858a;

        /* renamed from: b */
        private final List f66859b;

        /* renamed from: c */
        private final int f66860c = C26389h.OFFERS.ordinal();

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26385d(boolean z, List list) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "offers");
            this.f66858a = z;
            this.f66859b = list;
        }

        /* renamed from: a */
        public int mo65605a() {
            return this.f66860c;
        }

        /* renamed from: b */
        public final List mo65616b() {
            return this.f66859b;
        }

        /* renamed from: c */
        public final boolean mo65617c() {
            return this.f66858a;
        }
    }

    /* renamed from: n90.a$e */
    public static final class C26386e extends C26381a {

        /* renamed from: a */
        public static final C26386e f66861a = new C26386e();

        /* renamed from: b */
        private static final int f66862b = C26389h.PRIMARY_BUTTON.ordinal();

        private C26386e() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public int mo65605a() {
            return f66862b;
        }
    }

    /* renamed from: n90.a$f */
    public static final class C26387f extends C26381a {

        /* renamed from: a */
        private final boolean f66863a;

        /* renamed from: b */
        private final String f66864b;

        /* renamed from: c */
        private final String f66865c;

        /* renamed from: d */
        private final List f66866d;

        /* renamed from: e */
        private final int f66867e = C26389h.SALARY.ordinal();

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26387f(boolean z, String str, String str2, List list) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "header");
            C41536l.m120489i(str2, "buttonText");
            C41536l.m120489i(list, "salaries");
            this.f66863a = z;
            this.f66864b = str;
            this.f66865c = str2;
            this.f66866d = list;
        }

        /* renamed from: a */
        public int mo65605a() {
            return this.f66867e;
        }

        /* renamed from: b */
        public final String mo65618b() {
            return this.f66865c;
        }

        /* renamed from: c */
        public final String mo65619c() {
            return this.f66864b;
        }

        /* renamed from: d */
        public final List mo65620d() {
            return this.f66866d;
        }

        /* renamed from: e */
        public final boolean mo65621e() {
            return this.f66863a;
        }
    }

    /* renamed from: n90.a$g */
    public static final class C26388g extends C26381a {

        /* renamed from: a */
        private final C26390b f66868a;

        /* renamed from: b */
        private final String f66869b;

        /* renamed from: c */
        private final int f66870c = C26389h.SECONDARY_BUTTON.ordinal();

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26388g(C26390b bVar, String str) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(bVar, UrlHandler.ACTION);
            C41536l.m120489i(str, "buttonText");
            this.f66868a = bVar;
            this.f66869b = str;
        }

        /* renamed from: a */
        public int mo65605a() {
            return this.f66870c;
        }

        /* renamed from: b */
        public final C26390b mo65622b() {
            return this.f66868a;
        }

        /* renamed from: c */
        public final String mo65623c() {
            return this.f66869b;
        }
    }

    /* renamed from: n90.a$h */
    public enum C26389h {
        HEADER,
        LOAN_AMOUNT_INFO,
        LOAN_DETAILS,
        PRIMARY_BUTTON,
        SECONDARY_BUTTON,
        SALARY,
        OFFERS
    }

    private C26381a() {
    }

    public /* synthetic */ C26381a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract int mo65605a();
}

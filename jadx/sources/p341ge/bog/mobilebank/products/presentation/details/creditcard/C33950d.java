package p341ge.bog.mobilebank.products.presentation.details.creditcard;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.model.account.AccountOperation;

/* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.d */
public abstract class C33950d {

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.d$a */
    public static final class C33951a extends C33950d {

        /* renamed from: a */
        private final List f82573a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33951a(List list) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "cards");
            this.f82573a = list;
        }

        /* renamed from: a */
        public final List mo82140a() {
            return this.f82573a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.d$b */
    public static final class C33952b extends C33950d {

        /* renamed from: a */
        private final String f82574a;

        /* renamed from: b */
        private final String f82575b;

        /* renamed from: c */
        private final String f82576c;

        /* renamed from: d */
        private final String f82577d;

        /* renamed from: e */
        private final String f82578e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33952b(String str, String str2, String str3, String str4, String str5) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str2, "atmPercent");
            C41536l.m120489i(str3, "posPercent");
            this.f82574a = str;
            this.f82575b = str2;
            this.f82576c = str3;
            this.f82577d = str4;
            this.f82578e = str5;
        }

        /* renamed from: a */
        public final String mo82141a() {
            return this.f82575b;
        }

        /* renamed from: b */
        public final String mo82142b() {
            return this.f82574a;
        }

        /* renamed from: c */
        public final String mo82143c() {
            return this.f82578e;
        }

        /* renamed from: d */
        public final String mo82144d() {
            return this.f82577d;
        }

        /* renamed from: e */
        public final String mo82145e() {
            return this.f82576c;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.d$c */
    public static final class C33953c extends C33950d {

        /* renamed from: a */
        public static final C33953c f82579a = new C33953c();

        private C33953c() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.d$d */
    public static final class C33954d extends C33950d {

        /* renamed from: a */
        private final String f82580a;

        /* renamed from: b */
        private final String f82581b;

        /* renamed from: c */
        private final String f82582c;

        /* renamed from: d */
        private final String f82583d;

        /* renamed from: e */
        private final String f82584e;

        /* renamed from: f */
        private final String f82585f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33954d(String str, String str2, String str3, String str4, String str5, String str6) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "billingDate");
            C41536l.m120489i(str2, "usedBillAmount");
            C41536l.m120489i(str3, "minimumPayment");
            C41536l.m120489i(str4, "principalAmount");
            C41536l.m120489i(str5, "accruedInterest");
            C41536l.m120489i(str6, "commission");
            this.f82580a = str;
            this.f82581b = str2;
            this.f82582c = str3;
            this.f82583d = str4;
            this.f82584e = str5;
            this.f82585f = str6;
        }

        /* renamed from: a */
        public final String mo82146a() {
            return this.f82584e;
        }

        /* renamed from: b */
        public final String mo82147b() {
            return this.f82580a;
        }

        /* renamed from: c */
        public final String mo82148c() {
            return this.f82585f;
        }

        /* renamed from: d */
        public final String mo82149d() {
            return this.f82582c;
        }

        /* renamed from: e */
        public final String mo82150e() {
            return this.f82583d;
        }

        /* renamed from: f */
        public final String mo82151f() {
            return this.f82581b;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.d$e */
    public static final class C33955e extends C33950d {

        /* renamed from: a */
        private final List f82586a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33955e(List list) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "cards");
            this.f82586a = list;
        }

        /* renamed from: a */
        public final List mo82152a() {
            return this.f82586a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.d$f */
    public static final class C33956f extends C33950d {

        /* renamed from: a */
        public static final C33956f f82587a = new C33956f();

        private C33956f() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.d$g */
    public static final class C33957g extends C33950d {

        /* renamed from: a */
        public static final C33957g f82588a = new C33957g();

        private C33957g() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.d$h */
    public static final class C33958h extends C33950d {

        /* renamed from: a */
        private final long f82589a;

        /* renamed from: b */
        private final String f82590b;

        /* renamed from: c */
        private final String f82591c;

        /* renamed from: d */
        private final int f82592d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33958h(long j, String str, String str2, int i) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "loanType");
            C41536l.m120489i(str2, "amount");
            this.f82589a = j;
            this.f82590b = str;
            this.f82591c = str2;
            this.f82592d = i;
        }

        /* renamed from: a */
        public final String mo82153a() {
            return this.f82591c;
        }

        /* renamed from: b */
        public final int mo82154b() {
            return this.f82592d;
        }

        /* renamed from: c */
        public final String mo82155c() {
            return this.f82590b;
        }

        /* renamed from: d */
        public final long mo82156d() {
            return this.f82589a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.d$i */
    public static final class C33959i extends C33950d {

        /* renamed from: a */
        public static final C33959i f82593a = new C33959i();

        private C33959i() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.d$j */
    public static final class C33960j extends C33950d {

        /* renamed from: a */
        private final String f82594a;

        /* renamed from: b */
        private final String f82595b;

        /* renamed from: c */
        private final double f82596c;

        /* renamed from: d */
        private final boolean f82597d;

        /* renamed from: e */
        private final String f82598e;

        /* renamed from: f */
        private final String f82599f;

        /* renamed from: g */
        private final String f82600g;

        /* renamed from: h */
        private final AccountOperation f82601h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33960j(String str, String str2, double d, boolean z, String str3, String str4, String str5, AccountOperation accountOperation) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "operationTitle");
            C41536l.m120489i(str2, "secondaryText");
            C41536l.m120489i(str3, "bonusInfo");
            C41536l.m120489i(str4, "imageUrl");
            C41536l.m120489i(str5, "ccy");
            C41536l.m120489i(accountOperation, "accountOperation");
            this.f82594a = str;
            this.f82595b = str2;
            this.f82596c = d;
            this.f82597d = z;
            this.f82598e = str3;
            this.f82599f = str4;
            this.f82600g = str5;
            this.f82601h = accountOperation;
        }

        /* renamed from: a */
        public final AccountOperation mo82157a() {
            return this.f82601h;
        }

        /* renamed from: b */
        public final double mo82158b() {
            return this.f82596c;
        }

        /* renamed from: c */
        public final String mo82159c() {
            return this.f82598e;
        }

        /* renamed from: d */
        public final String mo82160d() {
            return this.f82600g;
        }

        /* renamed from: e */
        public final String mo82161e() {
            return this.f82599f;
        }

        /* renamed from: f */
        public final String mo82162f() {
            return this.f82594a;
        }

        /* renamed from: g */
        public final String mo82163g() {
            return this.f82595b;
        }

        /* renamed from: h */
        public final boolean mo82164h() {
            return this.f82597d;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.d$k */
    public static final class C33961k extends C33950d {

        /* renamed from: a */
        private final long f82602a;

        /* renamed from: b */
        private final boolean f82603b;

        /* renamed from: c */
        private final boolean f82604c;

        /* renamed from: d */
        private final boolean f82605d;

        /* renamed from: e */
        private final boolean f82606e;

        /* renamed from: f */
        private final boolean f82607f;

        /* renamed from: g */
        private final boolean f82608g;

        public C33961k(long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            super((DefaultConstructorMarker) null);
            this.f82602a = j;
            this.f82603b = z;
            this.f82604c = z2;
            this.f82605d = z3;
            this.f82606e = z4;
            this.f82607f = z5;
            this.f82608g = z6;
        }

        /* renamed from: a */
        public final long mo82165a() {
            return this.f82602a;
        }

        /* renamed from: b */
        public final boolean mo82166b() {
            return this.f82608g;
        }

        /* renamed from: c */
        public final boolean mo82167c() {
            return this.f82607f;
        }

        /* renamed from: d */
        public final boolean mo82168d() {
            return this.f82606e;
        }

        /* renamed from: e */
        public final boolean mo82169e() {
            return this.f82604c;
        }

        /* renamed from: f */
        public final boolean mo82170f() {
            return this.f82605d;
        }

        /* renamed from: g */
        public final boolean mo82171g() {
            return this.f82603b;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.d$l */
    public static final class C33962l extends C33950d {

        /* renamed from: a */
        private final String f82609a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33962l(String str) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "date");
            this.f82609a = str;
        }

        /* renamed from: a */
        public final String mo82172a() {
            return this.f82609a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.d$m */
    public static final class C33963m extends C33950d {

        /* renamed from: a */
        public static final C33963m f82610a = new C33963m();

        private C33963m() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.d$n */
    public static final class C33964n extends C33950d {

        /* renamed from: a */
        public static final C33964n f82611a = new C33964n();

        private C33964n() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.d$o */
    public static final class C33965o extends C33950d {

        /* renamed from: a */
        public static final C33965o f82612a = new C33965o();

        private C33965o() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.d$p */
    public static final class C33966p extends C33950d {

        /* renamed from: a */
        private final String f82613a;

        /* renamed from: b */
        private final String f82614b;

        /* renamed from: c */
        private final String f82615c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33966p(String str, String str2, String str3) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "minimumPayment");
            C41536l.m120489i(str3, "paymentDate");
            this.f82613a = str;
            this.f82614b = str2;
            this.f82615c = str3;
        }

        /* renamed from: a */
        public final String mo82173a() {
            return this.f82614b;
        }

        /* renamed from: b */
        public final String mo82174b() {
            return this.f82613a;
        }

        /* renamed from: c */
        public final String mo82175c() {
            return this.f82615c;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.d$q */
    public static final class C33967q extends C33950d {

        /* renamed from: a */
        private final List f82616a;

        /* renamed from: b */
        private int f82617b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33967q(List list, int i) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "headersData");
            this.f82616a = list;
            this.f82617b = i;
        }

        /* renamed from: a */
        public final List mo82176a() {
            return this.f82616a;
        }

        /* renamed from: b */
        public final int mo82177b() {
            return this.f82617b;
        }

        /* renamed from: c */
        public final void mo82178c(int i) {
            this.f82617b = i;
        }
    }

    private C33950d() {
    }

    public /* synthetic */ C33950d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

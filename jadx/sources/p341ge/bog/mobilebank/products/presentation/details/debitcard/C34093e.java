package p341ge.bog.mobilebank.products.presentation.details.debitcard;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p341ge.bog.mobilebank.model.account.AccountOperation;

/* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.e */
public abstract class C34093e {

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.e$a */
    public static final class C34094a extends C34093e {

        /* renamed from: a */
        private final List f82821a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34094a(List list) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "cards");
            this.f82821a = list;
        }

        /* renamed from: a */
        public final List mo82381a() {
            return this.f82821a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.e$b */
    public static final class C34095b extends C34093e {

        /* renamed from: a */
        private final String f82822a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34095b(String str) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "accountNumber");
            this.f82822a = str;
        }

        /* renamed from: a */
        public final String mo82382a() {
            return this.f82822a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.e$c */
    public static final class C34096c extends C34093e {

        /* renamed from: a */
        public static final C34096c f82823a = new C34096c();

        private C34096c() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.e$d */
    public static final class C34097d extends C34093e {

        /* renamed from: a */
        private final List f82824a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34097d(List list) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "cards");
            this.f82824a = list;
        }

        /* renamed from: a */
        public final List mo82383a() {
            return this.f82824a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.e$e */
    public static final class C34098e extends C34093e {

        /* renamed from: a */
        public static final C34098e f82825a = new C34098e();

        private C34098e() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.e$f */
    public static final class C34099f extends C34093e {

        /* renamed from: a */
        public static final C34099f f82826a = new C34099f();

        private C34099f() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.e$g */
    public static final class C34100g extends C34093e {

        /* renamed from: a */
        public static final C34100g f82827a = new C34100g();

        private C34100g() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.e$h */
    public static final class C34101h extends C34093e {

        /* renamed from: a */
        private final long f82828a;

        /* renamed from: b */
        private final String f82829b;

        /* renamed from: c */
        private final String f82830c;

        /* renamed from: d */
        private final int f82831d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34101h(long j, String str, String str2, int i) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "depositName");
            C41536l.m120489i(str2, "amount");
            this.f82828a = j;
            this.f82829b = str;
            this.f82830c = str2;
            this.f82831d = i;
        }

        /* renamed from: a */
        public final String mo82384a() {
            return this.f82830c;
        }

        /* renamed from: b */
        public final String mo82385b() {
            return this.f82829b;
        }

        /* renamed from: c */
        public final int mo82386c() {
            return this.f82831d;
        }

        /* renamed from: d */
        public final long mo82387d() {
            return this.f82828a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.e$i */
    public static final class C34102i extends C34093e {

        /* renamed from: a */
        public static final C34102i f82832a = new C34102i();

        private C34102i() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.e$j */
    public static final class C34103j extends C34093e {

        /* renamed from: a */
        private final long f82833a;

        /* renamed from: b */
        private final String f82834b;

        /* renamed from: c */
        private final String f82835c;

        /* renamed from: d */
        private final int f82836d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34103j(long j, String str, String str2, int i) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "loanType");
            C41536l.m120489i(str2, "amount");
            this.f82833a = j;
            this.f82834b = str;
            this.f82835c = str2;
            this.f82836d = i;
        }

        /* renamed from: a */
        public final String mo82388a() {
            return this.f82835c;
        }

        /* renamed from: b */
        public final int mo82389b() {
            return this.f82836d;
        }

        /* renamed from: c */
        public final String mo82390c() {
            return this.f82834b;
        }

        /* renamed from: d */
        public final long mo82391d() {
            return this.f82833a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.e$k */
    public static final class C34104k extends C34093e {

        /* renamed from: a */
        public static final C34104k f82837a = new C34104k();

        private C34104k() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.e$l */
    public static final class C34105l extends C34093e {

        /* renamed from: a */
        private final long f82838a;

        /* renamed from: b */
        private final String f82839b;

        /* renamed from: c */
        private final String f82840c;

        /* renamed from: d */
        private final boolean f82841d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34105l(long j, String str, String str2, boolean z) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "name");
            C41536l.m120489i(str2, "amount");
            this.f82838a = j;
            this.f82839b = str;
            this.f82840c = str2;
            this.f82841d = z;
        }

        /* renamed from: a */
        public final String mo82392a() {
            return this.f82840c;
        }

        /* renamed from: b */
        public final String mo82393b() {
            return this.f82839b;
        }

        /* renamed from: c */
        public final long mo82394c() {
            return this.f82838a;
        }

        /* renamed from: d */
        public final boolean mo82395d() {
            return this.f82841d;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.e$m */
    public static final class C34106m extends C34093e {

        /* renamed from: a */
        public static final C34106m f82842a = new C34106m();

        private C34106m() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.e$n */
    public static final class C34107n extends C34093e {

        /* renamed from: a */
        private final String f82843a;

        /* renamed from: b */
        private final String f82844b;

        /* renamed from: c */
        private final double f82845c;

        /* renamed from: d */
        private final boolean f82846d;

        /* renamed from: e */
        private final String f82847e;

        /* renamed from: f */
        private final String f82848f;

        /* renamed from: g */
        private final String f82849g;

        /* renamed from: h */
        private final AccountOperation f82850h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34107n(String str, String str2, double d, boolean z, String str3, String str4, String str5, AccountOperation accountOperation) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "operationTitle");
            C41536l.m120489i(str2, "secondaryText");
            C41536l.m120489i(str3, "bonusInfo");
            C41536l.m120489i(str4, "imageUrl");
            C41536l.m120489i(str5, "ccy");
            C41536l.m120489i(accountOperation, "accountOperation");
            this.f82843a = str;
            this.f82844b = str2;
            this.f82845c = d;
            this.f82846d = z;
            this.f82847e = str3;
            this.f82848f = str4;
            this.f82849g = str5;
            this.f82850h = accountOperation;
        }

        /* renamed from: a */
        public final AccountOperation mo82396a() {
            return this.f82850h;
        }

        /* renamed from: b */
        public final double mo82397b() {
            return this.f82845c;
        }

        /* renamed from: c */
        public final String mo82398c() {
            return this.f82847e;
        }

        /* renamed from: d */
        public final String mo82399d() {
            return this.f82849g;
        }

        /* renamed from: e */
        public final String mo82400e() {
            return this.f82848f;
        }

        /* renamed from: f */
        public final String mo82401f() {
            return this.f82843a;
        }

        /* renamed from: g */
        public final String mo82402g() {
            return this.f82844b;
        }

        /* renamed from: h */
        public final boolean mo82403h() {
            return this.f82846d;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.e$o */
    public static final class C34108o extends C34093e {

        /* renamed from: a */
        private final long f82851a;

        /* renamed from: b */
        private final int f82852b;

        /* renamed from: c */
        private final int f82853c;

        /* renamed from: d */
        private final boolean f82854d;

        /* renamed from: e */
        private final int f82855e;

        /* renamed from: f */
        private final int f82856f;

        /* renamed from: g */
        private final int f82857g;

        /* renamed from: h */
        private final int f82858h;

        /* renamed from: i */
        private final int f82859i;

        public C34108o(long j, int i, int i2, boolean z, int i3, int i4, int i5, int i6, int i7) {
            super((DefaultConstructorMarker) null);
            this.f82851a = j;
            this.f82852b = i;
            this.f82853c = i2;
            this.f82854d = z;
            this.f82855e = i3;
            this.f82856f = i4;
            this.f82857g = i5;
            this.f82858h = i6;
            this.f82859i = i7;
        }

        /* renamed from: a */
        public final long mo82404a() {
            return this.f82851a;
        }

        /* renamed from: b */
        public final int mo82405b() {
            return this.f82859i;
        }

        /* renamed from: c */
        public final int mo82406c() {
            return this.f82852b;
        }

        /* renamed from: d */
        public final int mo82407d() {
            return this.f82858h;
        }

        /* renamed from: e */
        public final int mo82408e() {
            return this.f82857g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C34108o)) {
                return false;
            }
            C34108o oVar = (C34108o) obj;
            return this.f82851a == oVar.f82851a && this.f82852b == oVar.f82852b && this.f82853c == oVar.f82853c && this.f82854d == oVar.f82854d && this.f82855e == oVar.f82855e && this.f82856f == oVar.f82856f && this.f82857g == oVar.f82857g && this.f82858h == oVar.f82858h && this.f82859i == oVar.f82859i;
        }

        /* renamed from: f */
        public final int mo82410f() {
            return this.f82856f;
        }

        /* renamed from: g */
        public final int mo82411g() {
            return this.f82855e;
        }

        /* renamed from: h */
        public final boolean mo82412h() {
            return this.f82854d;
        }

        public int hashCode() {
            int a = ((((C7397t.m28148a(this.f82851a) * 31) + this.f82852b) * 31) + this.f82853c) * 31;
            boolean z = this.f82854d;
            if (z) {
                z = true;
            }
            return ((((((((((a + (z ? 1 : 0)) * 31) + this.f82855e) * 31) + this.f82856f) * 31) + this.f82857g) * 31) + this.f82858h) * 31) + this.f82859i;
        }

        /* renamed from: i */
        public final int mo82414i() {
            return this.f82853c;
        }

        public String toString() {
            long j = this.f82851a;
            int i = this.f82852b;
            int i2 = this.f82853c;
            boolean z = this.f82854d;
            int i3 = this.f82855e;
            int i4 = this.f82856f;
            int i5 = this.f82857g;
            int i6 = this.f82858h;
            int i7 = this.f82859i;
            return "OperationsButtons(accKey=" + j + ", ownTransferVisible=" + i + ", withinBankTransferVisible=" + i2 + ", transfersEnabled=" + z + ", topUpVisible=" + i3 + ", statementsVisible=" + i4 + ", requisitesVisible=" + i5 + ", p2pTopUpVisible=" + i6 + ", closeVisible=" + i7 + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.e$p */
    public static final class C34109p extends C34093e {

        /* renamed from: a */
        private final String f82860a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34109p(String str) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "date");
            this.f82860a = str;
        }

        /* renamed from: a */
        public final String mo82416a() {
            return this.f82860a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.e$q */
    public static final class C34110q extends C34093e {

        /* renamed from: a */
        public static final C34110q f82861a = new C34110q();

        private C34110q() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.e$r */
    public static final class C34111r extends C34093e {

        /* renamed from: a */
        public static final C34111r f82862a = new C34111r();

        private C34111r() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.e$s */
    public static final class C34112s extends C34093e {

        /* renamed from: a */
        public static final C34112s f82863a = new C34112s();

        private C34112s() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.e$t */
    public static final class C34113t extends C34093e {

        /* renamed from: a */
        public static final C34113t f82864a = new C34113t();

        private C34113t() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.e$u */
    public static final class C34114u extends C34093e {

        /* renamed from: a */
        private final long f82865a;

        /* renamed from: b */
        private final String f82866b;

        /* renamed from: c */
        private final double f82867c;

        /* renamed from: d */
        private final List f82868d;

        /* renamed from: e */
        private final String f82869e;

        /* renamed from: f */
        private final String f82870f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34114u(long j, String str, double d, List list, String str2, String str3) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "overdraftLimit");
            C41536l.m120489i(list, "items");
            this.f82865a = j;
            this.f82866b = str;
            this.f82867c = d;
            this.f82868d = list;
            this.f82869e = str2;
            this.f82870f = str3;
        }

        /* renamed from: a */
        public final long mo82417a() {
            return this.f82865a;
        }

        /* renamed from: b */
        public final String mo82418b() {
            return this.f82870f;
        }

        /* renamed from: c */
        public final String mo82419c() {
            return this.f82869e;
        }

        /* renamed from: d */
        public final List mo82420d() {
            return this.f82868d;
        }

        /* renamed from: e */
        public final String mo82421e() {
            return this.f82866b;
        }

        /* renamed from: f */
        public final double mo82422f() {
            return this.f82867c;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.e$v */
    public static final class C34115v extends C34093e {

        /* renamed from: a */
        private final List f82871a;

        /* renamed from: b */
        private int f82872b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34115v(List list, int i) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "headersData");
            this.f82871a = list;
            this.f82872b = i;
        }

        /* renamed from: a */
        public final List mo82423a() {
            return this.f82871a;
        }

        /* renamed from: b */
        public final int mo82424b() {
            return this.f82872b;
        }

        /* renamed from: c */
        public final void mo82425c(int i) {
            this.f82872b = i;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.e$w */
    public static final class C34116w extends C34093e {

        /* renamed from: a */
        private final String f82873a;

        /* renamed from: b */
        private final List f82874b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34116w(String str, List list) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "title");
            C41536l.m120489i(list, "items");
            this.f82873a = str;
            this.f82874b = list;
        }

        /* renamed from: a */
        public final List mo82426a() {
            return this.f82874b;
        }

        /* renamed from: b */
        public final String mo82427b() {
            return this.f82873a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.e$x */
    public static final class C34117x extends C34093e {

        /* renamed from: a */
        public static final C34117x f82875a = new C34117x();

        private C34117x() {
            super((DefaultConstructorMarker) null);
        }
    }

    private C34093e() {
    }

    public /* synthetic */ C34093e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

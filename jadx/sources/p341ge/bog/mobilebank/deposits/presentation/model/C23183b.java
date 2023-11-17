package p341ge.bog.mobilebank.deposits.presentation.model;

import com.salesforce.marketingcloud.storage.p385db.C11769i;
import java.text.SimpleDateFormat;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ny0.C37506h;
import p190o1.C7397t;
import p341ge.bog.designsystem.components.Amount;
import p341ge.bog.mobilebank.model.account.AccountOperation;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p615tg.C17959a;
import rb0.C27983b;
import rb0.C27984c;
import rb0.C27989h;

/* renamed from: ge.bog.mobilebank.deposits.presentation.model.b */
public abstract class C23183b {

    /* renamed from: b */
    public static final C23209o f60719b = new C23209o((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final SimpleDateFormat f60720c = new SimpleDateFormat("dd MMM, yyyy");

    /* renamed from: a */
    private final boolean f60721a;

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$a */
    public static final class C23184a extends C23189c0 {

        /* renamed from: j */
        private final Amount f60722j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23184a(Amount amount) {
            super(C34646b.m101748b("deposits.interest.calc.amount.accrued", new Object[0]), C34646b.m101749c(C17959a.m61877a(amount)), C27984c.f71241q, C27983b.f71228k, (StringSource) null, 0, 48, (DefaultConstructorMarker) null);
            C41536l.m120489i(amount, "amount");
            this.f60722j = amount;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23184a) && C41536l.m120484d(this.f60722j, ((C23184a) obj).f60722j);
        }

        public int hashCode() {
            return this.f60722j.hashCode();
        }

        public String toString() {
            Amount amount = this.f60722j;
            return "AccruedInterest(amount=" + amount + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$a0 */
    public static final class C23185a0 extends C23186b {

        /* renamed from: k */
        private final boolean f60723k;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C23185a0(boolean r14) {
            /*
                r13 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.String r2 = "deposits.details.purpose"
                ge.bog.mobilebank.shared.helper.StringSource$Dictionary r4 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r2, r1)
                int r5 = rb0.C27984c.f71237l
                r6 = 0
                r7 = 0
                if (r14 == 0) goto L_0x0012
                java.lang.String r1 = "deposits.details.purpose.view"
                goto L_0x0014
            L_0x0012:
                java.lang.String r1 = "deposits.details.purpose.add"
            L_0x0014:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                ge.bog.mobilebank.shared.helper.StringSource$Dictionary r8 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r1, r0)
                if (r14 == 0) goto L_0x001f
                int r0 = rb0.C27983b.f71228k
                goto L_0x0021
            L_0x001f:
                int r0 = rb0.C27983b.f71226h
            L_0x0021:
                r9 = r0
                r10 = 0
                r11 = 76
                r12 = 0
                r3 = r13
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r13.f60723k = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.deposits.presentation.model.C23183b.C23185a0.<init>(boolean):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23185a0) && this.f60723k == ((C23185a0) obj).f60723k;
        }

        public int hashCode() {
            boolean z = this.f60723k;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            boolean z = this.f60723k;
            return "DepositSavingGoalFunctionItem(isActive=" + z + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$b */
    public static abstract class C23186b extends C23183b {

        /* renamed from: d */
        private final StringSource f60724d;

        /* renamed from: e */
        private final int f60725e;

        /* renamed from: f */
        private final int f60726f;

        /* renamed from: g */
        private final int f60727g;

        /* renamed from: h */
        private final StringSource f60728h;

        /* renamed from: i */
        private final int f60729i;

        /* renamed from: j */
        private final boolean f60730j;

        public /* synthetic */ C23186b(StringSource stringSource, int i, int i2, int i3, StringSource stringSource2, int i4, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, i, i2, i3, stringSource2, i4, z);
        }

        /* renamed from: b */
        public boolean mo57888b() {
            return this.f60730j;
        }

        /* renamed from: c */
        public final int mo57895c() {
            return this.f60727g;
        }

        /* renamed from: d */
        public final int mo57896d() {
            return this.f60725e;
        }

        /* renamed from: e */
        public final int mo57897e() {
            return this.f60726f;
        }

        /* renamed from: f */
        public final StringSource mo57898f() {
            return this.f60728h;
        }

        /* renamed from: g */
        public final int mo57899g() {
            return this.f60729i;
        }

        /* renamed from: h */
        public final StringSource mo57900h() {
            return this.f60724d;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C23186b(StringSource stringSource, int i, int i2, int i3, StringSource stringSource2, int i4, boolean z, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, i, (i5 & 4) != 0 ? C27983b.f71219a : i2, (i5 & 8) != 0 ? C27983b.f71221c : i3, (i5 & 16) != 0 ? null : stringSource2, (i5 & 32) != 0 ? C27983b.f71228k : i4, (i5 & 64) != 0 ? true : z, (DefaultConstructorMarker) null);
        }

        private C23186b(StringSource stringSource, int i, int i2, int i3, StringSource stringSource2, int i4, boolean z) {
            super(z, (DefaultConstructorMarker) null);
            this.f60724d = stringSource;
            this.f60725e = i;
            this.f60726f = i2;
            this.f60727g = i3;
            this.f60728h = stringSource2;
            this.f60729i = i4;
            this.f60730j = z;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$b0 */
    public static final class C23187b0 extends C23216v {

        /* renamed from: g */
        private final StringSource f60731g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23187b0(StringSource stringSource) {
            super(C34646b.m101748b("deposits.details.type", new Object[0]), stringSource, (Integer) null, 4, (DefaultConstructorMarker) null);
            C41536l.m120489i(stringSource, "name");
            this.f60731g = stringSource;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23187b0) && C41536l.m120484d(this.f60731g, ((C23187b0) obj).f60731g);
        }

        public int hashCode() {
            return this.f60731g.hashCode();
        }

        public String toString() {
            StringSource stringSource = this.f60731g;
            return "DepositType(name=" + stringSource + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$c */
    public static final class C23188c extends C23186b {

        /* renamed from: k */
        private final boolean f60732k;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C23188c(boolean r14) {
            /*
                r13 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.String r2 = "deposit.additional.functions.sto"
                ge.bog.mobilebank.shared.helper.StringSource$Dictionary r4 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r2, r1)
                int r5 = rb0.C27984c.f71233f
                r6 = 0
                r7 = 0
                if (r14 == 0) goto L_0x0012
                java.lang.String r1 = "deposit.additional.functions.sto.view"
                goto L_0x0014
            L_0x0012:
                java.lang.String r1 = "deposit.additional.functions.sto.add"
            L_0x0014:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                ge.bog.mobilebank.shared.helper.StringSource$Dictionary r8 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r1, r0)
                if (r14 == 0) goto L_0x001f
                int r0 = rb0.C27983b.f71228k
                goto L_0x0021
            L_0x001f:
                int r0 = rb0.C27983b.f71226h
            L_0x0021:
                r9 = r0
                r10 = 0
                r11 = 76
                r12 = 0
                r3 = r13
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r13.f60732k = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.deposits.presentation.model.C23183b.C23188c.<init>(boolean):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23188c) && this.f60732k == ((C23188c) obj).f60732k;
        }

        public int hashCode() {
            boolean z = this.f60732k;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            boolean z = this.f60732k;
            return "AutomaticTransferFunctionItem(isActive=" + z + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$c0 */
    public static abstract class C23189c0 extends C23183b {

        /* renamed from: d */
        private final StringSource f60733d;

        /* renamed from: e */
        private final StringSource f60734e;

        /* renamed from: f */
        private final int f60735f;

        /* renamed from: g */
        private final int f60736g;

        /* renamed from: h */
        private final StringSource f60737h;

        /* renamed from: i */
        private final int f60738i;

        public /* synthetic */ C23189c0(StringSource stringSource, StringSource stringSource2, int i, int i2, StringSource stringSource3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, stringSource2, i, i2, stringSource3, i3);
        }

        /* renamed from: c */
        public final int mo57907c() {
            return this.f60735f;
        }

        /* renamed from: d */
        public final StringSource mo57908d() {
            return this.f60734e;
        }

        /* renamed from: e */
        public final int mo57909e() {
            return this.f60738i;
        }

        /* renamed from: f */
        public final int mo57910f() {
            return this.f60736g;
        }

        /* renamed from: g */
        public final StringSource mo57911g() {
            return this.f60737h;
        }

        /* renamed from: h */
        public final StringSource mo57912h() {
            return this.f60733d;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C23189c0(StringSource stringSource, StringSource stringSource2, int i, int i2, StringSource stringSource3, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, stringSource2, i, (i4 & 8) != 0 ? C27983b.f71222d : i2, (i4 & 16) != 0 ? null : stringSource3, (i4 & 32) != 0 ? C27989h.f71311d : i3, (DefaultConstructorMarker) null);
        }

        private C23189c0(StringSource stringSource, StringSource stringSource2, int i, int i2, StringSource stringSource3, int i3) {
            super(false, (DefaultConstructorMarker) null);
            this.f60733d = stringSource;
            this.f60734e = stringSource2;
            this.f60735f = i;
            this.f60736g = i2;
            this.f60737h = stringSource3;
            this.f60738i = i3;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$d */
    public static final class C23190d extends C23216v {

        /* renamed from: g */
        private final String f60739g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23190d(String str) {
            super(C34646b.m101748b("deposits.bonds.certificate.number", new Object[0]), C34646b.m101749c(str), (Integer) null, 4, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "number");
            this.f60739g = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23190d) && C41536l.m120484d(this.f60739g, ((C23190d) obj).f60739g);
        }

        public int hashCode() {
            return this.f60739g.hashCode();
        }

        public String toString() {
            String str = this.f60739g;
            return "BondCertificateNumber(number=" + str + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$d0 */
    public static final class C23191d0 extends C23189c0 {

        /* renamed from: j */
        private final Number f60740j;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C23191d0(java.lang.Number r12) {
            /*
                r11 = this;
                java.lang.String r0 = "amount"
                kotlin.jvm.internal.C41536l.m120489i(r12, r0)
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "deposits.interest.calc.rate"
                ge.bog.mobilebank.shared.helper.StringSource$Dictionary r3 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r1, r0)
                double r0 = r12.doubleValue()
                java.lang.String r0 = g91.C32303f.m95204o(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = " %"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                ge.bog.mobilebank.shared.helper.StringSource$Raw r4 = p341ge.bog.mobilebank.shared.helper.C34646b.m101749c(r0)
                int r5 = rb0.C27984c.f71241q
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 56
                r10 = 0
                r2 = r11
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                r11.f60740j = r12
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.deposits.presentation.model.C23183b.C23191d0.<init>(java.lang.Number):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23191d0) && C41536l.m120484d(this.f60740j, ((C23191d0) obj).f60740j);
        }

        public int hashCode() {
            return this.f60740j.hashCode();
        }

        public String toString() {
            Number number = this.f60740j;
            return "InterestRate(amount=" + number + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$e */
    public static final class C23192e extends C23189c0 {

        /* renamed from: j */
        private final int f60741j;

        public C23192e(int i) {
            super(C34646b.m101748b("deposits.bonds.count", new Object[0]), C34646b.m101749c(String.valueOf(i)), C27984c.icons_48_deposit_certificate_outline, 0, (StringSource) null, 0, 56, (DefaultConstructorMarker) null);
            this.f60741j = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23192e) && this.f60741j == ((C23192e) obj).f60741j;
        }

        public int hashCode() {
            return this.f60741j;
        }

        public String toString() {
            int i = this.f60741j;
            return "BondCount(count=" + i + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$e0 */
    public static final class C23193e0 extends C23189c0 {

        /* renamed from: j */
        private final Number f60742j;

        /* renamed from: k */
        private final String f60743k;

        /* renamed from: l */
        private final C37506h f60744l;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C23193e0(java.lang.Number r16, java.lang.String r17, ny0.C37506h r18) {
            /*
                r15 = this;
                r9 = r15
                r10 = r16
                r11 = r17
                r12 = r18
                java.lang.String r0 = "amount"
                kotlin.jvm.internal.C41536l.m120489i(r10, r0)
                java.lang.String r0 = "ccy"
                kotlin.jvm.internal.C41536l.m120489i(r11, r0)
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.String r2 = "deposits.interest.calc.lowest.balance"
                ge.bog.mobilebank.shared.helper.StringSource$Dictionary r6 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r2, r1)
                java.lang.String r1 = "deposits.interest.calc.lowest.balance.desc"
                java.lang.Object[] r0 = new java.lang.Object[r0]
                ge.bog.mobilebank.shared.helper.StringSource$Dictionary r7 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r1, r0)
                double r0 = r16.doubleValue()
                r3 = 0
                r4 = 2
                r5 = 0
                r2 = r17
                java.lang.String r0 = g91.C32343x.m95410Q(r0, r2, r3, r4, r5)
                ge.bog.mobilebank.shared.helper.StringSource$Raw r2 = p341ge.bog.mobilebank.shared.helper.C34646b.m101749c(r0)
                ny0.h r0 = ny0.C37506h.PREMIUM
                if (r12 != r0) goto L_0x003a
                int r0 = rb0.C27984c.f71243s
                goto L_0x003c
            L_0x003a:
                int r0 = rb0.C27984c.f71240o
            L_0x003c:
                r3 = r0
                r4 = 0
                r8 = 0
                r13 = 40
                r14 = 0
                r0 = r15
                r1 = r6
                r5 = r7
                r6 = r8
                r7 = r13
                r8 = r14
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                r9.f60742j = r10
                r9.f60743k = r11
                r9.f60744l = r12
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.deposits.presentation.model.C23183b.C23193e0.<init>(java.lang.Number, java.lang.String, ny0.h):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23193e0)) {
                return false;
            }
            C23193e0 e0Var = (C23193e0) obj;
            return C41536l.m120484d(this.f60742j, e0Var.f60742j) && C41536l.m120484d(this.f60743k, e0Var.f60743k) && this.f60744l == e0Var.f60744l;
        }

        public int hashCode() {
            int hashCode = ((this.f60742j.hashCode() * 31) + this.f60743k.hashCode()) * 31;
            C37506h hVar = this.f60744l;
            return hashCode + (hVar == null ? 0 : hVar.hashCode());
        }

        public String toString() {
            Number number = this.f60742j;
            String str = this.f60743k;
            C37506h hVar = this.f60744l;
            return "LowestBalance(amount=" + number + ", ccy=" + str + ", prodType=" + hVar + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$f */
    public static final class C23194f extends C23189c0 {

        /* renamed from: j */
        private final Number f60745j;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C23194f(java.lang.Number r12) {
            /*
                r11 = this;
                java.lang.String r0 = "amount"
                kotlin.jvm.internal.C41536l.m120489i(r12, r0)
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "deposits.bonds.int.rate"
                ge.bog.mobilebank.shared.helper.StringSource$Dictionary r3 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r1, r0)
                double r0 = r12.doubleValue()
                java.lang.String r0 = g91.C32303f.m95204o(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = " %"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                ge.bog.mobilebank.shared.helper.StringSource$Raw r4 = p341ge.bog.mobilebank.shared.helper.C34646b.m101749c(r0)
                int r5 = rb0.C27984c.f71241q
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 56
                r10 = 0
                r2 = r11
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                r11.f60745j = r12
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.deposits.presentation.model.C23183b.C23194f.<init>(java.lang.Number):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23194f) && C41536l.m120484d(this.f60745j, ((C23194f) obj).f60745j);
        }

        public int hashCode() {
            return this.f60745j.hashCode();
        }

        public String toString() {
            Number number = this.f60745j;
            return "BondInterestRate(amount=" + number + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$f0 */
    public static final class C23195f0 extends C23186b {

        /* renamed from: k */
        private final Amount f60746k;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C23195f0(p341ge.bog.designsystem.components.Amount r14) {
            /*
                r13 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.String r2 = "deposit.additional.functions.piggybank"
                ge.bog.mobilebank.shared.helper.StringSource$Dictionary r4 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r2, r1)
                int r5 = rb0.C27984c.f71232e
                r6 = 0
                r7 = 0
                if (r14 == 0) goto L_0x003b
                java.lang.String r1 = p615tg.C17959a.m61877a(r14)
                if (r1 == 0) goto L_0x003b
                java.lang.String r2 = "deposit.additional.functions.piggybank.desc"
                java.lang.Object[] r3 = new java.lang.Object[r0]
                java.lang.String r2 = g91.C32343x.m95388F(r2, r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r1)
                java.lang.String r1 = " "
                r3.append(r1)
                r3.append(r2)
                java.lang.String r1 = r3.toString()
                if (r1 == 0) goto L_0x003b
                ge.bog.mobilebank.shared.helper.StringSource$Raw r1 = p341ge.bog.mobilebank.shared.helper.C34646b.m101749c(r1)
                if (r1 == 0) goto L_0x003b
                r8 = r1
                goto L_0x0044
            L_0x003b:
                java.lang.String r1 = "deposit.additional.functions.piggybank.activate"
                java.lang.Object[] r0 = new java.lang.Object[r0]
                ge.bog.mobilebank.shared.helper.StringSource$Dictionary r0 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r1, r0)
                r8 = r0
            L_0x0044:
                if (r14 == 0) goto L_0x0049
                int r0 = rb0.C27983b.f71228k
                goto L_0x004b
            L_0x0049:
                int r0 = rb0.C27983b.f71226h
            L_0x004b:
                r9 = r0
                r10 = 0
                r11 = 76
                r12 = 0
                r3 = r13
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r13.f60746k = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.deposits.presentation.model.C23183b.C23195f0.<init>(ge.bog.designsystem.components.Amount):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23195f0) && C41536l.m120484d(this.f60746k, ((C23195f0) obj).f60746k);
        }

        public int hashCode() {
            Amount amount = this.f60746k;
            if (amount == null) {
                return 0;
            }
            return amount.hashCode();
        }

        public String toString() {
            Amount amount = this.f60746k;
            return "PiggyBankFunctionItem(amount=" + amount + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$g */
    public static final class C23196g extends C23216v {

        /* renamed from: g */
        private final long f60747g;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C23196g(long r9) {
            /*
                r8 = this;
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "deposits.bonds.buy.date"
                ge.bog.mobilebank.shared.helper.StringSource$Dictionary r3 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r1, r0)
                java.text.SimpleDateFormat r0 = p341ge.bog.mobilebank.deposits.presentation.model.C23183b.f60720c
                java.lang.Long r1 = java.lang.Long.valueOf(r9)
                java.lang.String r0 = r0.format(r1)
                java.lang.String r1 = "dateFormat.format(date)"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                ge.bog.mobilebank.shared.helper.StringSource$Raw r4 = p341ge.bog.mobilebank.shared.helper.C34646b.m101749c(r0)
                r5 = 0
                r6 = 4
                r7 = 0
                r2 = r8
                r2.<init>(r3, r4, r5, r6, r7)
                r8.f60747g = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.deposits.presentation.model.C23183b.C23196g.<init>(long):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23196g) && this.f60747g == ((C23196g) obj).f60747g;
        }

        public int hashCode() {
            return C7397t.m28148a(this.f60747g);
        }

        public String toString() {
            long j = this.f60747g;
            return "BondIssueDate(date=" + j + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$g0 */
    public static final class C23197g0 extends C23219y {

        /* renamed from: j */
        private final StringSource f60748j;

        /* renamed from: k */
        private final StringSource f60749k;

        /* renamed from: l */
        private final Amount f60750l;

        /* renamed from: m */
        private final AccountOperation f60751m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23197g0(StringSource stringSource, StringSource stringSource2, Amount amount, AccountOperation accountOperation) {
            super(stringSource, stringSource2, C34646b.m101749c(C17959a.m61877a(amount)), C27983b.f71228k, accountOperation, 0, 32, (DefaultConstructorMarker) null);
            C41536l.m120489i(stringSource, "name");
            C41536l.m120489i(amount, "amount");
            C41536l.m120489i(accountOperation, "accountOperation");
            this.f60748j = stringSource;
            this.f60749k = stringSource2;
            this.f60750l = amount;
            this.f60751m = accountOperation;
        }

        /* renamed from: c */
        public AccountOperation mo57934c() {
            return this.f60751m;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23197g0)) {
                return false;
            }
            C23197g0 g0Var = (C23197g0) obj;
            return C41536l.m120484d(this.f60748j, g0Var.f60748j) && C41536l.m120484d(this.f60749k, g0Var.f60749k) && C41536l.m120484d(this.f60750l, g0Var.f60750l) && C41536l.m120484d(this.f60751m, g0Var.f60751m);
        }

        public int hashCode() {
            int hashCode = this.f60748j.hashCode() * 31;
            StringSource stringSource = this.f60749k;
            return ((((hashCode + (stringSource == null ? 0 : stringSource.hashCode())) * 31) + this.f60750l.hashCode()) * 31) + this.f60751m.hashCode();
        }

        public String toString() {
            StringSource stringSource = this.f60748j;
            StringSource stringSource2 = this.f60749k;
            Amount amount = this.f60750l;
            AccountOperation accountOperation = this.f60751m;
            return "TopUpOperation(name=" + stringSource + ", operationType=" + stringSource2 + ", amount=" + amount + ", accountOperation=" + accountOperation + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$h */
    public static final class C23198h extends C23189c0 {

        /* renamed from: j */
        private final Amount f60752j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23198h(Amount amount) {
            super(C34646b.m101748b("deposits.bonds.total.balance", new Object[0]), C34646b.m101749c(C17959a.m61877a(amount)), C27984c.f71241q, 0, (StringSource) null, 0, 56, (DefaultConstructorMarker) null);
            C41536l.m120489i(amount, "amount");
            this.f60752j = amount;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23198h) && C41536l.m120484d(this.f60752j, ((C23198h) obj).f60752j);
        }

        public int hashCode() {
            return this.f60752j.hashCode();
        }

        public String toString() {
            Amount amount = this.f60752j;
            return "BondMarketValue(amount=" + amount + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$h0 */
    public static final class C23199h0 extends C23189c0 {

        /* renamed from: j */
        private final Amount f60753j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23199h0(Amount amount) {
            super(C34646b.m101748b("deposits.interest.calc.amount.accrued.total", new Object[0]), C34646b.m101749c(C17959a.m61877a(amount)), C27984c.f71241q, 0, (StringSource) null, 0, 56, (DefaultConstructorMarker) null);
            C41536l.m120489i(amount, "amount");
            this.f60753j = amount;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23199h0) && C41536l.m120484d(this.f60753j, ((C23199h0) obj).f60753j);
        }

        public int hashCode() {
            return this.f60753j.hashCode();
        }

        public String toString() {
            Amount amount = this.f60753j;
            return "TotalAccruedInterest(amount=" + amount + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$i */
    public static final class C23200i extends C23216v {

        /* renamed from: g */
        private final long f60754g;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C23200i(long r9) {
            /*
                r8 = this;
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "deposits.bonds.maturity.date"
                ge.bog.mobilebank.shared.helper.StringSource$Dictionary r3 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r1, r0)
                java.text.SimpleDateFormat r0 = p341ge.bog.mobilebank.deposits.presentation.model.C23183b.f60720c
                java.lang.Long r1 = java.lang.Long.valueOf(r9)
                java.lang.String r0 = r0.format(r1)
                java.lang.String r1 = "dateFormat.format(date)"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                ge.bog.mobilebank.shared.helper.StringSource$Raw r4 = p341ge.bog.mobilebank.shared.helper.C34646b.m101749c(r0)
                r5 = 0
                r6 = 4
                r7 = 0
                r2 = r8
                r2.<init>(r3, r4, r5, r6, r7)
                r8.f60754g = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.deposits.presentation.model.C23183b.C23200i.<init>(long):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23200i) && this.f60754g == ((C23200i) obj).f60754g;
        }

        public int hashCode() {
            return C7397t.m28148a(this.f60754g);
        }

        public String toString() {
            long j = this.f60754g;
            return "BondMaturityDate(date=" + j + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$i0 */
    public static final class C23201i0 extends C23183b {

        /* renamed from: d */
        public static final C23201i0 f60755d = new C23201i0();

        /* renamed from: e */
        private static final StringSource f60756e = C34646b.m101748b("deposits.transactions.see.all", new Object[0]);

        private C23201i0() {
            super(true, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public final StringSource mo57947c() {
            return f60756e;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$j */
    public static final class C23202j extends C23189c0 {

        /* renamed from: j */
        private final Amount f60757j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23202j(Amount amount) {
            super(C34646b.m101748b("deposits.bonds.nominal", new Object[0]), C34646b.m101749c(C17959a.m61877a(amount)), C27984c.icons_48_deposit_certificate_outline, 0, (StringSource) null, 0, 56, (DefaultConstructorMarker) null);
            C41536l.m120489i(amount, "amount");
            this.f60757j = amount;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23202j) && C41536l.m120484d(this.f60757j, ((C23202j) obj).f60757j);
        }

        public int hashCode() {
            return this.f60757j.hashCode();
        }

        public String toString() {
            Amount amount = this.f60757j;
            return "BondNominal(amount=" + amount + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$j0 */
    public static final class C23203j0 extends C23189c0 {

        /* renamed from: j */
        private final long f60758j;

        /* renamed from: k */
        private final String f60759k;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C23203j0(long r12, java.lang.String r14) {
            /*
                r11 = this;
                java.lang.String r0 = "withdrawPeriod"
                kotlin.jvm.internal.C41536l.m120489i(r14, r0)
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "deposits.interest.calc.withdraw.date"
                ge.bog.mobilebank.shared.helper.StringSource$Dictionary r3 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r1, r0)
                java.text.SimpleDateFormat r0 = p341ge.bog.mobilebank.deposits.presentation.model.C23183b.f60720c
                java.lang.Long r1 = java.lang.Long.valueOf(r12)
                java.lang.String r0 = r0.format(r1)
                java.lang.String r1 = "dateFormat.format(date)"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                ge.bog.mobilebank.shared.helper.StringSource$Raw r4 = p341ge.bog.mobilebank.shared.helper.C34646b.m101749c(r0)
                int r5 = rb0.C27984c.icons_48_system_calendar_outline
                r6 = 0
                ge.bog.mobilebank.shared.helper.StringSource$Raw r7 = p341ge.bog.mobilebank.shared.helper.C34646b.m101749c(r14)
                int r8 = rb0.C27989h.f71310b
                r9 = 8
                r10 = 0
                r2 = r11
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                r11.f60758j = r12
                r11.f60759k = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.deposits.presentation.model.C23183b.C23203j0.<init>(long, java.lang.String):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23203j0)) {
                return false;
            }
            C23203j0 j0Var = (C23203j0) obj;
            return this.f60758j == j0Var.f60758j && C41536l.m120484d(this.f60759k, j0Var.f60759k);
        }

        public int hashCode() {
            return (C7397t.m28148a(this.f60758j) * 31) + this.f60759k.hashCode();
        }

        public String toString() {
            long j = this.f60758j;
            String str = this.f60759k;
            return "WithdrawDate(date=" + j + ", withdrawPeriod=" + str + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$k */
    public static final class C23204k extends C23189c0 {

        /* renamed from: j */
        private final Amount f60760j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23204k(Amount amount) {
            super(C34646b.m101748b("text.bonds.details.bonds.csd.principal.value.total", new Object[0]), C34646b.m101749c(C17959a.m61877a(amount)), C27984c.f71241q, 0, (StringSource) null, 0, 56, (DefaultConstructorMarker) null);
            C41536l.m120489i(amount, "amount");
            this.f60760j = amount;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23204k) && C41536l.m120484d(this.f60760j, ((C23204k) obj).f60760j);
        }

        public int hashCode() {
            return this.f60760j.hashCode();
        }

        public String toString() {
            Amount amount = this.f60760j;
            return "BondPrincipalTotalValue(amount=" + amount + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$k0 */
    public static final class C23205k0 extends C23219y {

        /* renamed from: j */
        private final StringSource f60761j;

        /* renamed from: k */
        private final StringSource f60762k;

        /* renamed from: l */
        private final Amount f60763l;

        /* renamed from: m */
        private final AccountOperation f60764m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23205k0(StringSource stringSource, StringSource stringSource2, Amount amount, AccountOperation accountOperation) {
            super(stringSource, stringSource2, C34646b.m101749c(C17959a.m61877a(amount)), C27983b.f71223e, accountOperation, 0, 32, (DefaultConstructorMarker) null);
            C41536l.m120489i(stringSource, "name");
            C41536l.m120489i(amount, "amount");
            C41536l.m120489i(accountOperation, "accountOperation");
            this.f60761j = stringSource;
            this.f60762k = stringSource2;
            this.f60763l = amount;
            this.f60764m = accountOperation;
        }

        /* renamed from: c */
        public AccountOperation mo57934c() {
            return this.f60764m;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23205k0)) {
                return false;
            }
            C23205k0 k0Var = (C23205k0) obj;
            return C41536l.m120484d(this.f60761j, k0Var.f60761j) && C41536l.m120484d(this.f60762k, k0Var.f60762k) && C41536l.m120484d(this.f60763l, k0Var.f60763l) && C41536l.m120484d(this.f60764m, k0Var.f60764m);
        }

        public int hashCode() {
            int hashCode = this.f60761j.hashCode() * 31;
            StringSource stringSource = this.f60762k;
            return ((((hashCode + (stringSource == null ? 0 : stringSource.hashCode())) * 31) + this.f60763l.hashCode()) * 31) + this.f60764m.hashCode();
        }

        public String toString() {
            StringSource stringSource = this.f60761j;
            StringSource stringSource2 = this.f60762k;
            Amount amount = this.f60763l;
            AccountOperation accountOperation = this.f60764m;
            return "WithdrawOperation(name=" + stringSource + ", operationType=" + stringSource2 + ", amount=" + amount + ", accountOperation=" + accountOperation + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$l */
    public static final class C23206l extends C23189c0 {

        /* renamed from: j */
        private final Amount f60765j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23206l(Amount amount) {
            super(C34646b.m101748b("deposits.bonds.transfer.amount", new Object[0]), C34646b.m101749c(C17959a.m61877a(amount)), C27984c.icons_48_deposit_certificate_outline, 0, (StringSource) null, 0, 56, (DefaultConstructorMarker) null);
            C41536l.m120489i(amount, "amount");
            this.f60765j = amount;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23206l) && C41536l.m120484d(this.f60765j, ((C23206l) obj).f60765j);
        }

        public int hashCode() {
            return this.f60765j.hashCode();
        }

        public String toString() {
            Amount amount = this.f60765j;
            return "BondTransferAmount(amount=" + amount + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$m */
    public static final class C23207m extends C23216v {

        /* renamed from: g */
        private final StringSource f60766g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23207m(StringSource stringSource) {
            super(C34646b.m101748b("deposits.bonds.certificate.type", new Object[0]), stringSource, (Integer) null, 4, (DefaultConstructorMarker) null);
            C41536l.m120489i(stringSource, "name");
            this.f60766g = stringSource;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23207m) && C41536l.m120484d(this.f60766g, ((C23207m) obj).f60766g);
        }

        public int hashCode() {
            return this.f60766g.hashCode();
        }

        public String toString() {
            StringSource stringSource = this.f60766g;
            return "BondType(name=" + stringSource + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$n */
    public static final class C23208n extends C23189c0 {

        /* renamed from: j */
        private final StringSource f60767j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23208n(StringSource stringSource) {
            super(C34646b.m101748b("cd.deposit.details.with.period", new Object[0]), stringSource, C27984c.icons_48_system_calendar_outline, 0, (StringSource) null, C27989h.f71310b, 24, (DefaultConstructorMarker) null);
            C41536l.m120489i(stringSource, "withdrawPeriodKey");
            this.f60767j = stringSource;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23208n) && C41536l.m120484d(this.f60767j, ((C23208n) obj).f60767j);
        }

        public int hashCode() {
            return this.f60767j.hashCode();
        }

        public String toString() {
            StringSource stringSource = this.f60767j;
            return "BondWithdrawPeriodType(withdrawPeriodKey=" + stringSource + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$o */
    public static final class C23209o {
        private C23209o() {
        }

        public /* synthetic */ C23209o(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$p */
    public static final class C23210p extends C23216v {

        /* renamed from: g */
        private final String f60768g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23210p(String str) {
            super(C34646b.m101748b("deposits.details.acctno", new Object[0]), C34646b.m101748b(str, new Object[0]), Integer.valueOf(C27984c.icons_24_system_copy_ouitline), (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "acctNo");
            this.f60768g = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23210p) && C41536l.m120484d(this.f60768g, ((C23210p) obj).f60768g);
        }

        public int hashCode() {
            return this.f60768g.hashCode();
        }

        public String toString() {
            String str = this.f60768g;
            return "DepositAccountNumber(acctNo=" + str + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$q */
    public static final class C23211q extends C23216v {

        /* renamed from: g */
        private final String f60769g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23211q(String str) {
            super(C34646b.m101748b("deposits.details.view.agreement", new Object[0]), (StringSource) null, Integer.valueOf(C27984c.f71236k), (DefaultConstructorMarker) null);
            C41536l.m120489i(str, C11769i.C11770a.f34149l);
            this.f60769g = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23211q) && C41536l.m120484d(this.f60769g, ((C23211q) obj).f60769g);
        }

        public int hashCode() {
            return this.f60769g.hashCode();
        }

        public String toString() {
            String str = this.f60769g;
            return "DepositAgreement(url=" + str + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$r */
    public static final class C23212r extends C23186b {

        /* renamed from: k */
        public static final C23212r f60770k = new C23212r();

        private C23212r() {
            super(C34646b.m101748b("deposit.additional.functions.break", new Object[0]), C27984c.f71234h, C27983b.f71223e, C27983b.f71225g, (StringSource) null, 0, false, 112, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$s */
    public static final class C23213s extends C23216v {

        /* renamed from: g */
        private final String f60771g;

        /* renamed from: h */
        private final String f60772h;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C23213s(java.lang.String r9, java.lang.String r10) {
            /*
                r8 = this;
                java.lang.String r0 = "firstName"
                kotlin.jvm.internal.C41536l.m120489i(r9, r0)
                java.lang.String r0 = "lastName"
                kotlin.jvm.internal.C41536l.m120489i(r10, r0)
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "deposits.details.child.name"
                ge.bog.mobilebank.shared.helper.StringSource$Dictionary r3 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r9)
                java.lang.String r1 = " "
                r0.append(r1)
                r0.append(r10)
                java.lang.String r0 = r0.toString()
                ge.bog.mobilebank.shared.helper.StringSource$Raw r4 = p341ge.bog.mobilebank.shared.helper.C34646b.m101749c(r0)
                r5 = 0
                r6 = 4
                r7 = 0
                r2 = r8
                r2.<init>(r3, r4, r5, r6, r7)
                r8.f60771g = r9
                r8.f60772h = r10
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.deposits.presentation.model.C23183b.C23213s.<init>(java.lang.String, java.lang.String):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23213s)) {
                return false;
            }
            C23213s sVar = (C23213s) obj;
            return C41536l.m120484d(this.f60771g, sVar.f60771g) && C41536l.m120484d(this.f60772h, sVar.f60772h);
        }

        public int hashCode() {
            return (this.f60771g.hashCode() * 31) + this.f60772h.hashCode();
        }

        public String toString() {
            String str = this.f60771g;
            String str2 = this.f60772h;
            return "DepositChildName(firstName=" + str + ", lastName=" + str2 + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$t */
    public static final class C23214t extends C23216v {

        /* renamed from: g */
        private final Long f60773g;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C23214t(java.lang.Long r10) {
            /*
                r9 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.String r2 = "deposits.details.date.close"
                ge.bog.mobilebank.shared.helper.StringSource$Dictionary r4 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r2, r1)
                if (r10 == 0) goto L_0x001d
                java.text.SimpleDateFormat r1 = p341ge.bog.mobilebank.deposits.presentation.model.C23183b.f60720c
                java.lang.String r1 = r1.format(r10)
                if (r1 == 0) goto L_0x001d
                ge.bog.mobilebank.shared.helper.StringSource$Raw r1 = p341ge.bog.mobilebank.shared.helper.C34646b.m101749c(r1)
                if (r1 == 0) goto L_0x001d
                r5 = r1
                goto L_0x0026
            L_0x001d:
                java.lang.String r1 = "text.deposits.details.end.date.termless"
                java.lang.Object[] r0 = new java.lang.Object[r0]
                ge.bog.mobilebank.shared.helper.StringSource$Dictionary r0 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r1, r0)
                r5 = r0
            L_0x0026:
                r6 = 0
                r7 = 4
                r8 = 0
                r3 = r9
                r3.<init>(r4, r5, r6, r7, r8)
                r9.f60773g = r10
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.deposits.presentation.model.C23183b.C23214t.<init>(java.lang.Long):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23214t) && C41536l.m120484d(this.f60773g, ((C23214t) obj).f60773g);
        }

        public int hashCode() {
            Long l = this.f60773g;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        public String toString() {
            Long l = this.f60773g;
            return "DepositCloseDate(date=" + l + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$u */
    public static final class C23215u extends C23186b {

        /* renamed from: k */
        public static final C23215u f60774k = new C23215u();

        private C23215u() {
            super(C34646b.m101748b("deposit.additional.functions.close", new Object[0]), C27984c.f71234h, C27983b.f71224f, C27983b.f71225g, (StringSource) null, 0, false, 112, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$v */
    public static abstract class C23216v extends C23183b {

        /* renamed from: d */
        private final StringSource f60775d;

        /* renamed from: e */
        private final StringSource f60776e;

        /* renamed from: f */
        private final Integer f60777f;

        public /* synthetic */ C23216v(StringSource stringSource, StringSource stringSource2, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, stringSource2, num);
        }

        /* renamed from: c */
        public final Integer mo57981c() {
            return this.f60777f;
        }

        /* renamed from: d */
        public final StringSource mo57982d() {
            return this.f60776e;
        }

        /* renamed from: e */
        public final StringSource mo57983e() {
            return this.f60775d;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C23216v(StringSource stringSource, StringSource stringSource2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, stringSource2, (i & 4) != 0 ? null : num, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C23216v(StringSource stringSource, StringSource stringSource2, Integer num) {
            super(num != null, (DefaultConstructorMarker) null);
            this.f60775d = stringSource;
            this.f60776e = stringSource2;
            this.f60777f = num;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$w */
    public static final class C23217w extends C23216v {

        /* renamed from: g */
        private final StringSource f60778g;

        /* renamed from: h */
        private final boolean f60779h;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C23217w(StringSource stringSource, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, (i & 2) != 0 ? true : z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23217w)) {
                return false;
            }
            C23217w wVar = (C23217w) obj;
            return C41536l.m120484d(this.f60778g, wVar.f60778g) && this.f60779h == wVar.f60779h;
        }

        public int hashCode() {
            int hashCode = this.f60778g.hashCode() * 31;
            boolean z = this.f60779h;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            StringSource stringSource = this.f60778g;
            boolean z = this.f60779h;
            return "DepositName(name=" + stringSource + ", isEditable=" + z + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23217w(StringSource stringSource, boolean z) {
            super(C34646b.m101748b("deposits.details.name", new Object[0]), stringSource, z ? Integer.valueOf(C27984c.f71235j) : null, (DefaultConstructorMarker) null);
            C41536l.m120489i(stringSource, "name");
            this.f60778g = stringSource;
            this.f60779h = z;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$x */
    public static final class C23218x extends C23216v {

        /* renamed from: g */
        private final long f60780g;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C23218x(long r9) {
            /*
                r8 = this;
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "deposits.details.date.start"
                ge.bog.mobilebank.shared.helper.StringSource$Dictionary r3 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r1, r0)
                java.text.SimpleDateFormat r0 = p341ge.bog.mobilebank.deposits.presentation.model.C23183b.f60720c
                java.lang.Long r1 = java.lang.Long.valueOf(r9)
                java.lang.String r0 = r0.format(r1)
                java.lang.String r1 = "dateFormat.format(date)"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                ge.bog.mobilebank.shared.helper.StringSource$Raw r4 = p341ge.bog.mobilebank.shared.helper.C34646b.m101749c(r0)
                r5 = 0
                r6 = 4
                r7 = 0
                r2 = r8
                r2.<init>(r3, r4, r5, r6, r7)
                r8.f60780g = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.deposits.presentation.model.C23183b.C23218x.<init>(long):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23218x) && this.f60780g == ((C23218x) obj).f60780g;
        }

        public int hashCode() {
            return C7397t.m28148a(this.f60780g);
        }

        public String toString() {
            long j = this.f60780g;
            return "DepositOpenDate(date=" + j + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$y */
    public static abstract class C23219y extends C23183b {

        /* renamed from: d */
        private final StringSource f60781d;

        /* renamed from: e */
        private final StringSource f60782e;

        /* renamed from: f */
        private final StringSource f60783f;

        /* renamed from: g */
        private final int f60784g;

        /* renamed from: h */
        private final AccountOperation f60785h;

        /* renamed from: i */
        private final int f60786i;

        public /* synthetic */ C23219y(StringSource stringSource, StringSource stringSource2, StringSource stringSource3, int i, AccountOperation accountOperation, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, stringSource2, stringSource3, i, accountOperation, i2);
        }

        /* renamed from: c */
        public abstract AccountOperation mo57934c();

        /* renamed from: d */
        public final int mo57990d() {
            return this.f60786i;
        }

        /* renamed from: e */
        public final StringSource mo57991e() {
            return this.f60783f;
        }

        /* renamed from: f */
        public final int mo57992f() {
            return this.f60784g;
        }

        /* renamed from: g */
        public final StringSource mo57993g() {
            return this.f60782e;
        }

        /* renamed from: h */
        public final StringSource mo57994h() {
            return this.f60781d;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C23219y(StringSource stringSource, StringSource stringSource2, StringSource stringSource3, int i, AccountOperation accountOperation, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, stringSource2, stringSource3, i, accountOperation, (i3 & 32) != 0 ? C27984c.f71231d : i2, (DefaultConstructorMarker) null);
        }

        private C23219y(StringSource stringSource, StringSource stringSource2, StringSource stringSource3, int i, AccountOperation accountOperation, int i2) {
            super(true, (DefaultConstructorMarker) null);
            this.f60781d = stringSource;
            this.f60782e = stringSource2;
            this.f60783f = stringSource3;
            this.f60784g = i;
            this.f60785h = accountOperation;
            this.f60786i = i2;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.b$z */
    public static final class C23220z extends C23183b {

        /* renamed from: d */
        private final String f60787d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23220z(String str) {
            super(false, 1, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "date");
            this.f60787d = str;
        }

        /* renamed from: c */
        public final String mo57995c() {
            return this.f60787d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23220z) && C41536l.m120484d(this.f60787d, ((C23220z) obj).f60787d);
        }

        public int hashCode() {
            return this.f60787d.hashCode();
        }

        public String toString() {
            String str = this.f60787d;
            return "DepositOperationDate(date=" + str + ")";
        }
    }

    public /* synthetic */ C23183b(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    /* renamed from: b */
    public boolean mo57888b() {
        return this.f60721a;
    }

    private C23183b(boolean z) {
        this.f60721a = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23183b(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (DefaultConstructorMarker) null);
    }
}

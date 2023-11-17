package p341ge.bog.mobilebank.deposits.presentation.model.depositbreak;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p642vh.C18358g;
import rb0.C27983b;

/* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakDetailItem */
public abstract class DepositBreakDetailItem implements Parcelable {

    /* renamed from: d */
    private final StringSource f60788d;

    /* renamed from: e */
    private final StringSource f60789e;

    /* renamed from: f */
    private final Color f60790f;

    /* renamed from: g */
    private final Color f60791g;

    /* renamed from: h */
    private final StringSource f60792h;

    /* renamed from: i */
    private final Color f60793i;

    /* renamed from: j */
    private final boolean f60794j;

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakDetailItem$AccruedAmountItem */
    public static final class AccruedAmountItem extends SingleLineItem {
        public static final Parcelable.Creator<AccruedAmountItem> CREATOR = new C23221a();

        /* renamed from: k */
        private final double f60795k;

        /* renamed from: l */
        private final String f60796l;

        /* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakDetailItem$AccruedAmountItem$a */
        public static final class C23221a implements Parcelable.Creator {
            /* renamed from: a */
            public final AccruedAmountItem createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new AccruedAmountItem(parcel.readDouble(), parcel.readString());
            }

            /* renamed from: b */
            public final AccruedAmountItem[] newArray(int i) {
                return new AccruedAmountItem[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AccruedAmountItem(double d, String str) {
            super("deposits.break.page.potential.interest", Double.valueOf(d), str, C18358g.m62729c(C27983b.f71228k), (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "ccy");
            this.f60795k = d;
            this.f60796l = str;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccruedAmountItem)) {
                return false;
            }
            AccruedAmountItem accruedAmountItem = (AccruedAmountItem) obj;
            return Double.compare(this.f60795k, accruedAmountItem.f60795k) == 0 && C41536l.m120484d(this.f60796l, accruedAmountItem.f60796l);
        }

        public int hashCode() {
            return (Double.doubleToLongBits(this.f60795k) * 31) + this.f60796l.hashCode();
        }

        public String toString() {
            double d = this.f60795k;
            String str = this.f60796l;
            return "AccruedAmountItem(amount=" + d + ", ccy=" + str + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeDouble(this.f60795k);
            parcel.writeString(this.f60796l);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakDetailItem$ClosedDeposit */
    public static final class ClosedDeposit extends TwoLineItem {
        public static final Parcelable.Creator<ClosedDeposit> CREATOR = new C23222a();

        /* renamed from: k */
        private final String f60797k;

        /* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakDetailItem$ClosedDeposit$a */
        public static final class C23222a implements Parcelable.Creator {
            /* renamed from: a */
            public final ClosedDeposit createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new ClosedDeposit(parcel.readString());
            }

            /* renamed from: b */
            public final ClosedDeposit[] newArray(int i) {
                return new ClosedDeposit[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ClosedDeposit(String str) {
            super(C34646b.m101749c(str), C34646b.m101748b("deposits.break.success.deposit.name", new Object[0]), (String) null, (Double) null, false, (Color) null, 60, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "name");
            this.f60797k = str;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClosedDeposit) && C41536l.m120484d(this.f60797k, ((ClosedDeposit) obj).f60797k);
        }

        public int hashCode() {
            return this.f60797k.hashCode();
        }

        public String toString() {
            String str = this.f60797k;
            return "ClosedDeposit(name=" + str + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f60797k);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakDetailItem$ClosedDepositAccount */
    public static final class ClosedDepositAccount extends TwoLineItem {
        public static final Parcelable.Creator<ClosedDepositAccount> CREATOR = new C23223a();

        /* renamed from: k */
        private final String f60798k;

        /* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakDetailItem$ClosedDepositAccount$a */
        public static final class C23223a implements Parcelable.Creator {
            /* renamed from: a */
            public final ClosedDepositAccount createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new ClosedDepositAccount(parcel.readString());
            }

            /* renamed from: b */
            public final ClosedDepositAccount[] newArray(int i) {
                return new ClosedDepositAccount[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ClosedDepositAccount(String str) {
            super(C34646b.m101749c(str), C34646b.m101748b("deposits.break.success.account", new Object[0]), (String) null, (Double) null, false, (Color) null, 60, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "name");
            this.f60798k = str;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClosedDepositAccount) && C41536l.m120484d(this.f60798k, ((ClosedDepositAccount) obj).f60798k);
        }

        public int hashCode() {
            return this.f60798k.hashCode();
        }

        public String toString() {
            String str = this.f60798k;
            return "ClosedDepositAccount(name=" + str + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f60798k);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakDetailItem$ClosedDepositAmount */
    public static final class ClosedDepositAmount extends SingleLineItem {
        public static final Parcelable.Creator<ClosedDepositAmount> CREATOR = new C23224a();

        /* renamed from: k */
        private final double f60799k;

        /* renamed from: l */
        private final String f60800l;

        /* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakDetailItem$ClosedDepositAmount$a */
        public static final class C23224a implements Parcelable.Creator {
            /* renamed from: a */
            public final ClosedDepositAmount createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new ClosedDepositAmount(parcel.readDouble(), parcel.readString());
            }

            /* renamed from: b */
            public final ClosedDepositAmount[] newArray(int i) {
                return new ClosedDepositAmount[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ClosedDepositAmount(double d, String str) {
            super("deposits.break.success.amount", Double.valueOf(d), str, (Color) null, 8, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "ccy");
            this.f60799k = d;
            this.f60800l = str;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClosedDepositAmount)) {
                return false;
            }
            ClosedDepositAmount closedDepositAmount = (ClosedDepositAmount) obj;
            return Double.compare(this.f60799k, closedDepositAmount.f60799k) == 0 && C41536l.m120484d(this.f60800l, closedDepositAmount.f60800l);
        }

        public int hashCode() {
            return (Double.doubleToLongBits(this.f60799k) * 31) + this.f60800l.hashCode();
        }

        public String toString() {
            double d = this.f60799k;
            String str = this.f60800l;
            return "ClosedDepositAmount(amount=" + d + ", ccy=" + str + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeDouble(this.f60799k);
            parcel.writeString(this.f60800l);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakDetailItem$DepositAmountItem */
    public static final class DepositAmountItem extends SingleLineItem {
        public static final Parcelable.Creator<DepositAmountItem> CREATOR = new C23225a();

        /* renamed from: k */
        private final double f60801k;

        /* renamed from: l */
        private final String f60802l;

        /* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakDetailItem$DepositAmountItem$a */
        public static final class C23225a implements Parcelable.Creator {
            /* renamed from: a */
            public final DepositAmountItem createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new DepositAmountItem(parcel.readDouble(), parcel.readString());
            }

            /* renamed from: b */
            public final DepositAmountItem[] newArray(int i) {
                return new DepositAmountItem[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DepositAmountItem(double d, String str) {
            super("deposits.break.page.dep.amt", Double.valueOf(d), str, (Color) null, 8, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "ccy");
            this.f60801k = d;
            this.f60802l = str;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DepositAmountItem)) {
                return false;
            }
            DepositAmountItem depositAmountItem = (DepositAmountItem) obj;
            return Double.compare(this.f60801k, depositAmountItem.f60801k) == 0 && C41536l.m120484d(this.f60802l, depositAmountItem.f60802l);
        }

        public int hashCode() {
            return (Double.doubleToLongBits(this.f60801k) * 31) + this.f60802l.hashCode();
        }

        public String toString() {
            double d = this.f60801k;
            String str = this.f60802l;
            return "DepositAmountItem(amount=" + d + ", ccy=" + str + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeDouble(this.f60801k);
            parcel.writeString(this.f60802l);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakDetailItem$LostInterestWithBreak */
    public static final class LostInterestWithBreak extends SingleLineItem {
        public static final Parcelable.Creator<LostInterestWithBreak> CREATOR = new C23226a();

        /* renamed from: k */
        private final double f60803k;

        /* renamed from: l */
        private final String f60804l;

        /* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakDetailItem$LostInterestWithBreak$a */
        public static final class C23226a implements Parcelable.Creator {
            /* renamed from: a */
            public final LostInterestWithBreak createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new LostInterestWithBreak(parcel.readDouble(), parcel.readString());
            }

            /* renamed from: b */
            public final LostInterestWithBreak[] newArray(int i) {
                return new LostInterestWithBreak[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LostInterestWithBreak(double d, String str) {
            super("deposits.break.page.lost.interrest", Double.valueOf(-d), str, C18358g.m62729c(C27983b.f71223e), (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "ccy");
            this.f60803k = d;
            this.f60804l = str;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LostInterestWithBreak)) {
                return false;
            }
            LostInterestWithBreak lostInterestWithBreak = (LostInterestWithBreak) obj;
            return Double.compare(this.f60803k, lostInterestWithBreak.f60803k) == 0 && C41536l.m120484d(this.f60804l, lostInterestWithBreak.f60804l);
        }

        public int hashCode() {
            return (Double.doubleToLongBits(this.f60803k) * 31) + this.f60804l.hashCode();
        }

        public String toString() {
            double d = this.f60803k;
            String str = this.f60804l;
            return "LostInterestWithBreak(amount=" + d + ", ccy=" + str + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeDouble(this.f60803k);
            parcel.writeString(this.f60804l);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakDetailItem$SingleLineItem */
    public static abstract class SingleLineItem extends DepositBreakDetailItem {
        public /* synthetic */ SingleLineItem(String str, Double d, String str2, Color color, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, d, str2, color);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SingleLineItem(String str, Double d, String str2, Color color, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, d, str2, (i & 8) != 0 ? C18358g.m62729c(C27983b.f71219a) : color, (DefaultConstructorMarker) null);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
            r1 = g91.C32343x.m95410Q(r14.doubleValue(), r15, false, 2, (java.lang.Object) null);
         */
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private SingleLineItem(java.lang.String r13, java.lang.Double r14, java.lang.String r15, p341ge.bog.designsystem.components.common.Color r16) {
            /*
                r12 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                r2 = r13
                ge.bog.mobilebank.shared.helper.StringSource$Dictionary r3 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r13, r1)
                if (r14 == 0) goto L_0x001f
                double r4 = r14.doubleValue()
                r7 = 0
                r8 = 2
                r9 = 0
                r6 = r15
                java.lang.String r1 = g91.C32343x.m95410Q(r4, r6, r7, r8, r9)
                if (r1 == 0) goto L_0x001f
                java.lang.Object[] r0 = new java.lang.Object[r0]
                ge.bog.mobilebank.shared.helper.StringSource$Dictionary r0 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r1, r0)
                goto L_0x0020
            L_0x001f:
                r0 = 0
            L_0x0020:
                r4 = r0
                r5 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 116(0x74, float:1.63E-43)
                r11 = 0
                r2 = r12
                r6 = r16
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakDetailItem.SingleLineItem.<init>(java.lang.String, java.lang.Double, java.lang.String, ge.bog.designsystem.components.common.Color):void");
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakDetailItem$TotalAmountWithBreak */
    public static final class TotalAmountWithBreak extends SingleLineItem {
        public static final Parcelable.Creator<TotalAmountWithBreak> CREATOR = new C23227a();

        /* renamed from: k */
        private final double f60805k;

        /* renamed from: l */
        private final String f60806l;

        /* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakDetailItem$TotalAmountWithBreak$a */
        public static final class C23227a implements Parcelable.Creator {
            /* renamed from: a */
            public final TotalAmountWithBreak createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new TotalAmountWithBreak(parcel.readDouble(), parcel.readString());
            }

            /* renamed from: b */
            public final TotalAmountWithBreak[] newArray(int i) {
                return new TotalAmountWithBreak[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TotalAmountWithBreak(double d, String str) {
            super("deposits.break.page.total.amt", Double.valueOf(d), str, (Color) null, 8, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "ccy");
            this.f60805k = d;
            this.f60806l = str;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TotalAmountWithBreak)) {
                return false;
            }
            TotalAmountWithBreak totalAmountWithBreak = (TotalAmountWithBreak) obj;
            return Double.compare(this.f60805k, totalAmountWithBreak.f60805k) == 0 && C41536l.m120484d(this.f60806l, totalAmountWithBreak.f60806l);
        }

        public int hashCode() {
            return (Double.doubleToLongBits(this.f60805k) * 31) + this.f60806l.hashCode();
        }

        public String toString() {
            double d = this.f60805k;
            String str = this.f60806l;
            return "TotalAmountWithBreak(amount=" + d + ", ccy=" + str + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeDouble(this.f60805k);
            parcel.writeString(this.f60806l);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakDetailItem$TotalAmountWithoutBreak */
    public static final class TotalAmountWithoutBreak extends SingleLineItem {
        public static final Parcelable.Creator<TotalAmountWithoutBreak> CREATOR = new C23228a();

        /* renamed from: k */
        private final double f60807k;

        /* renamed from: l */
        private final String f60808l;

        /* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakDetailItem$TotalAmountWithoutBreak$a */
        public static final class C23228a implements Parcelable.Creator {
            /* renamed from: a */
            public final TotalAmountWithoutBreak createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new TotalAmountWithoutBreak(parcel.readDouble(), parcel.readString());
            }

            /* renamed from: b */
            public final TotalAmountWithoutBreak[] newArray(int i) {
                return new TotalAmountWithoutBreak[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TotalAmountWithoutBreak(double d, String str) {
            super("deposits.break.page.total.amt", Double.valueOf(d), str, (Color) null, 8, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "ccy");
            this.f60807k = d;
            this.f60808l = str;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TotalAmountWithoutBreak)) {
                return false;
            }
            TotalAmountWithoutBreak totalAmountWithoutBreak = (TotalAmountWithoutBreak) obj;
            return Double.compare(this.f60807k, totalAmountWithoutBreak.f60807k) == 0 && C41536l.m120484d(this.f60808l, totalAmountWithoutBreak.f60808l);
        }

        public int hashCode() {
            return (Double.doubleToLongBits(this.f60807k) * 31) + this.f60808l.hashCode();
        }

        public String toString() {
            double d = this.f60807k;
            String str = this.f60808l;
            return "TotalAmountWithoutBreak(amount=" + d + ", ccy=" + str + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeDouble(this.f60807k);
            parcel.writeString(this.f60808l);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakDetailItem$TwoLineItem */
    public static abstract class TwoLineItem extends DepositBreakDetailItem {
        public /* synthetic */ TwoLineItem(StringSource stringSource, StringSource stringSource2, String str, Double d, boolean z, Color color, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, stringSource2, str, d, z, color);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ TwoLineItem(StringSource stringSource, StringSource stringSource2, String str, Double d, boolean z, Color color, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, stringSource2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : d, (i & 16) != 0 ? false : z, (i & 32) != 0 ? C18358g.m62729c(C27983b.f71219a) : color, (DefaultConstructorMarker) null);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private TwoLineItem(p341ge.bog.mobilebank.shared.helper.StringSource r12, p341ge.bog.mobilebank.shared.helper.StringSource r13, java.lang.String r14, java.lang.Double r15, boolean r16, p341ge.bog.designsystem.components.common.Color r17) {
            /*
                r11 = this;
                if (r15 == 0) goto L_0x001d
                double r0 = r15.doubleValue()
                if (r14 != 0) goto L_0x000b
                java.lang.String r2 = "GEL"
                goto L_0x000c
            L_0x000b:
                r2 = r14
            L_0x000c:
                r3 = 0
                r4 = 2
                r5 = 0
                java.lang.String r0 = g91.C32343x.m95410Q(r0, r2, r3, r4, r5)
                if (r0 == 0) goto L_0x001d
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]
                ge.bog.mobilebank.shared.helper.StringSource$Dictionary r0 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r0, r1)
                goto L_0x001e
            L_0x001d:
                r0 = 0
            L_0x001e:
                r3 = r0
                r4 = 0
                r7 = 0
                r9 = 36
                r10 = 0
                r1 = r11
                r2 = r12
                r5 = r17
                r6 = r13
                r8 = r16
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakDetailItem.TwoLineItem.<init>(ge.bog.mobilebank.shared.helper.StringSource, ge.bog.mobilebank.shared.helper.StringSource, java.lang.String, java.lang.Double, boolean, ge.bog.designsystem.components.common.Color):void");
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakDetailItem$WithdrawnAmountItem */
    public static final class WithdrawnAmountItem extends SingleLineItem {
        public static final Parcelable.Creator<WithdrawnAmountItem> CREATOR = new C23229a();

        /* renamed from: k */
        private final double f60809k;

        /* renamed from: l */
        private final String f60810l;

        /* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakDetailItem$WithdrawnAmountItem$a */
        public static final class C23229a implements Parcelable.Creator {
            /* renamed from: a */
            public final WithdrawnAmountItem createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new WithdrawnAmountItem(parcel.readDouble(), parcel.readString());
            }

            /* renamed from: b */
            public final WithdrawnAmountItem[] newArray(int i) {
                return new WithdrawnAmountItem[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public WithdrawnAmountItem(double d, String str) {
            super("deposits.break.page.int.withdrawn", Double.valueOf(d), str, (Color) null, 8, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "ccy");
            this.f60809k = d;
            this.f60810l = str;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WithdrawnAmountItem)) {
                return false;
            }
            WithdrawnAmountItem withdrawnAmountItem = (WithdrawnAmountItem) obj;
            return Double.compare(this.f60809k, withdrawnAmountItem.f60809k) == 0 && C41536l.m120484d(this.f60810l, withdrawnAmountItem.f60810l);
        }

        public int hashCode() {
            return (Double.doubleToLongBits(this.f60809k) * 31) + this.f60810l.hashCode();
        }

        public String toString() {
            double d = this.f60809k;
            String str = this.f60810l;
            return "WithdrawnAmountItem(amount=" + d + ", ccy=" + str + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeDouble(this.f60809k);
            parcel.writeString(this.f60810l);
        }
    }

    public /* synthetic */ DepositBreakDetailItem(StringSource stringSource, StringSource stringSource2, Color color, Color color2, StringSource stringSource3, Color color3, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringSource, stringSource2, color, color2, stringSource3, color3, z);
    }

    /* renamed from: a */
    public final StringSource mo57999a() {
        return this.f60789e;
    }

    /* renamed from: b */
    public final Color mo58000b() {
        return this.f60791g;
    }

    /* renamed from: d */
    public final StringSource mo58001d() {
        return this.f60792h;
    }

    /* renamed from: e */
    public final Color mo58002e() {
        return this.f60793i;
    }

    /* renamed from: f */
    public final StringSource mo58003f() {
        return this.f60788d;
    }

    /* renamed from: g */
    public final Color mo58004g() {
        return this.f60790f;
    }

    /* renamed from: h */
    public final boolean mo58005h() {
        return this.f60794j;
    }

    private DepositBreakDetailItem(StringSource stringSource, StringSource stringSource2, Color color, Color color2, StringSource stringSource3, Color color3, boolean z) {
        this.f60788d = stringSource;
        this.f60789e = stringSource2;
        this.f60790f = color;
        this.f60791g = color2;
        this.f60792h = stringSource3;
        this.f60793i = color3;
        this.f60794j = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DepositBreakDetailItem(StringSource stringSource, StringSource stringSource2, Color color, Color color2, StringSource stringSource3, Color color3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringSource, stringSource2, (i & 4) != 0 ? C18358g.m62729c(C27983b.f71219a) : color, (i & 8) != 0 ? C18358g.m62729c(C27983b.f71219a) : color2, (i & 16) != 0 ? null : stringSource3, (i & 32) != 0 ? C18358g.m62729c(C27983b.f71220b) : color3, (i & 64) != 0 ? false : z, (DefaultConstructorMarker) null);
    }
}

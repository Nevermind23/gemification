package p341ge.bog.mobilebank.loans.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.loans.presentation.LoansFlow */
public abstract class LoansFlow implements Parcelable {

    /* renamed from: ge.bog.mobilebank.loans.presentation.LoansFlow$Details */
    public static final class Details extends LoansFlow {
        public static final Parcelable.Creator<Details> CREATOR = new C32572a();

        /* renamed from: d */
        private final Long f80206d;

        /* renamed from: e */
        private final Integer f80207e;

        /* renamed from: ge.bog.mobilebank.loans.presentation.LoansFlow$Details$a */
        public static final class C32572a implements Parcelable.Creator {
            /* renamed from: a */
            public final Details createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                Integer num = null;
                Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                if (parcel.readInt() != 0) {
                    num = Integer.valueOf(parcel.readInt());
                }
                return new Details(valueOf, num);
            }

            /* renamed from: b */
            public final Details[] newArray(int i) {
                return new Details[i];
            }
        }

        public Details(Long l, Integer num) {
            super((DefaultConstructorMarker) null);
            this.f80206d = l;
            this.f80207e = num;
        }

        /* renamed from: a */
        public final Long mo74022a() {
            return this.f80206d;
        }

        /* renamed from: b */
        public final Integer mo74023b() {
            return this.f80207e;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Details)) {
                return false;
            }
            Details details = (Details) obj;
            return C41536l.m120484d(this.f80206d, details.f80206d) && C41536l.m120484d(this.f80207e, details.f80207e);
        }

        public int hashCode() {
            Long l = this.f80206d;
            int i = 0;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            Integer num = this.f80207e;
            if (num != null) {
                i = num.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            Long l = this.f80206d;
            Integer num = this.f80207e;
            return "Details(accKey=" + l + ", position=" + num + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            Long l = this.f80206d;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
            Integer num = this.f80207e;
            if (num == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.LoansFlow$PawnLoanPayment */
    public static final class PawnLoanPayment extends LoansFlow {
        public static final Parcelable.Creator<PawnLoanPayment> CREATOR = new C32573a();

        /* renamed from: d */
        private final BigDecimal f80208d;

        /* renamed from: e */
        private final BigDecimal f80209e;

        /* renamed from: f */
        private final BigDecimal f80210f;

        /* renamed from: g */
        private final String f80211g;

        /* renamed from: h */
        private final BigDecimal f80212h;

        /* renamed from: i */
        private final String f80213i;

        /* renamed from: j */
        private final long f80214j;

        /* renamed from: k */
        private final BigDecimal f80215k;

        /* renamed from: l */
        private final String f80216l;

        /* renamed from: ge.bog.mobilebank.loans.presentation.LoansFlow$PawnLoanPayment$a */
        public static final class C32573a implements Parcelable.Creator {
            /* renamed from: a */
            public final PawnLoanPayment createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new PawnLoanPayment((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readLong(), (BigDecimal) parcel.readSerializable(), parcel.readString());
            }

            /* renamed from: b */
            public final PawnLoanPayment[] newArray(int i) {
                return new PawnLoanPayment[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PawnLoanPayment(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str, BigDecimal bigDecimal4, String str2, long j, BigDecimal bigDecimal5, String str3) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(bigDecimal, "principal");
            C41536l.m120489i(bigDecimal2, "currentIntAmount");
            C41536l.m120489i(bigDecimal3, "penalty");
            C41536l.m120489i(str, "accountNo");
            C41536l.m120489i(bigDecimal4, "availableAmount");
            C41536l.m120489i(str2, "ccy");
            C41536l.m120489i(bigDecimal5, "amount");
            C41536l.m120489i(str3, "productDictionaryKey");
            this.f80208d = bigDecimal;
            this.f80209e = bigDecimal2;
            this.f80210f = bigDecimal3;
            this.f80211g = str;
            this.f80212h = bigDecimal4;
            this.f80213i = str2;
            this.f80214j = j;
            this.f80215k = bigDecimal5;
            this.f80216l = str3;
        }

        /* renamed from: a */
        public final String mo74033a() {
            return this.f80211g;
        }

        /* renamed from: b */
        public final BigDecimal mo74034b() {
            return this.f80215k;
        }

        /* renamed from: d */
        public final BigDecimal mo74035d() {
            return this.f80212h;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final String mo74037e() {
            return this.f80213i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PawnLoanPayment)) {
                return false;
            }
            PawnLoanPayment pawnLoanPayment = (PawnLoanPayment) obj;
            return C41536l.m120484d(this.f80208d, pawnLoanPayment.f80208d) && C41536l.m120484d(this.f80209e, pawnLoanPayment.f80209e) && C41536l.m120484d(this.f80210f, pawnLoanPayment.f80210f) && C41536l.m120484d(this.f80211g, pawnLoanPayment.f80211g) && C41536l.m120484d(this.f80212h, pawnLoanPayment.f80212h) && C41536l.m120484d(this.f80213i, pawnLoanPayment.f80213i) && this.f80214j == pawnLoanPayment.f80214j && C41536l.m120484d(this.f80215k, pawnLoanPayment.f80215k) && C41536l.m120484d(this.f80216l, pawnLoanPayment.f80216l);
        }

        /* renamed from: f */
        public final BigDecimal mo74039f() {
            return this.f80209e;
        }

        /* renamed from: g */
        public final long mo74040g() {
            return this.f80214j;
        }

        /* renamed from: h */
        public final BigDecimal mo74041h() {
            return this.f80210f;
        }

        public int hashCode() {
            return (((((((((((((((this.f80208d.hashCode() * 31) + this.f80209e.hashCode()) * 31) + this.f80210f.hashCode()) * 31) + this.f80211g.hashCode()) * 31) + this.f80212h.hashCode()) * 31) + this.f80213i.hashCode()) * 31) + C7397t.m28148a(this.f80214j)) * 31) + this.f80215k.hashCode()) * 31) + this.f80216l.hashCode();
        }

        /* renamed from: i */
        public final String mo74043i() {
            return this.f80216l;
        }

        public String toString() {
            BigDecimal bigDecimal = this.f80208d;
            BigDecimal bigDecimal2 = this.f80209e;
            BigDecimal bigDecimal3 = this.f80210f;
            String str = this.f80211g;
            BigDecimal bigDecimal4 = this.f80212h;
            String str2 = this.f80213i;
            long j = this.f80214j;
            BigDecimal bigDecimal5 = this.f80215k;
            String str3 = this.f80216l;
            return "PawnLoanPayment(principal=" + bigDecimal + ", currentIntAmount=" + bigDecimal2 + ", penalty=" + bigDecimal3 + ", accountNo=" + str + ", availableAmount=" + bigDecimal4 + ", ccy=" + str2 + ", loanKey=" + j + ", amount=" + bigDecimal5 + ", productDictionaryKey=" + str3 + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeSerializable(this.f80208d);
            parcel.writeSerializable(this.f80209e);
            parcel.writeSerializable(this.f80210f);
            parcel.writeString(this.f80211g);
            parcel.writeSerializable(this.f80212h);
            parcel.writeString(this.f80213i);
            parcel.writeLong(this.f80214j);
            parcel.writeSerializable(this.f80215k);
            parcel.writeString(this.f80216l);
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.LoansFlow$Repayment */
    public static final class Repayment extends LoansFlow {
        public static final Parcelable.Creator<Repayment> CREATOR = new C32574a();

        /* renamed from: d */
        private final String f80217d;

        /* renamed from: e */
        private final long f80218e;

        /* renamed from: f */
        private final String f80219f;

        /* renamed from: g */
        private final String f80220g;

        /* renamed from: h */
        private final String f80221h;

        /* renamed from: i */
        private final List f80222i;

        /* renamed from: j */
        private final boolean f80223j;

        /* renamed from: k */
        private final boolean f80224k;

        /* renamed from: ge.bog.mobilebank.loans.presentation.LoansFlow$Repayment$a */
        public static final class C32574a implements Parcelable.Creator {
            /* renamed from: a */
            public final Repayment createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                String readString = parcel.readString();
                long readLong = parcel.readLong();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(parcel.readParcelable(Repayment.class.getClassLoader()));
                }
                return new Repayment(readString, readLong, readString2, readString3, readString4, arrayList, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final Repayment[] newArray(int i) {
                return new Repayment[i];
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Repayment(java.lang.String r14, long r15, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.util.List r20, boolean r21, boolean r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
            /*
                r13 = this;
                r0 = r23
                r1 = r0 & 64
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r11 = r2
                goto L_0x000b
            L_0x0009:
                r11 = r21
            L_0x000b:
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x0011
                r12 = r2
                goto L_0x0013
            L_0x0011:
                r12 = r22
            L_0x0013:
                r3 = r13
                r4 = r14
                r5 = r15
                r7 = r17
                r8 = r18
                r9 = r19
                r10 = r20
                r3.<init>(r4, r5, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.loans.presentation.LoansFlow.Repayment.<init>(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* renamed from: a */
        public final boolean mo74050a() {
            return this.f80223j;
        }

        /* renamed from: b */
        public final boolean mo74051b() {
            return this.f80224k;
        }

        /* renamed from: d */
        public final String mo74052d() {
            return this.f80219f;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final long mo74054e() {
            return this.f80218e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Repayment)) {
                return false;
            }
            Repayment repayment = (Repayment) obj;
            return C41536l.m120484d(this.f80217d, repayment.f80217d) && this.f80218e == repayment.f80218e && C41536l.m120484d(this.f80219f, repayment.f80219f) && C41536l.m120484d(this.f80220g, repayment.f80220g) && C41536l.m120484d(this.f80221h, repayment.f80221h) && C41536l.m120484d(this.f80222i, repayment.f80222i) && this.f80223j == repayment.f80223j && this.f80224k == repayment.f80224k;
        }

        /* renamed from: f */
        public final String mo74056f() {
            return this.f80217d;
        }

        /* renamed from: g */
        public final String mo74057g() {
            return this.f80220g;
        }

        /* renamed from: h */
        public final List mo74058h() {
            return this.f80222i;
        }

        public int hashCode() {
            int hashCode = ((((((((((this.f80217d.hashCode() * 31) + C7397t.m28148a(this.f80218e)) * 31) + this.f80219f.hashCode()) * 31) + this.f80220g.hashCode()) * 31) + this.f80221h.hashCode()) * 31) + this.f80222i.hashCode()) * 31;
            boolean z = this.f80223j;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f80224k;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        /* renamed from: i */
        public final String mo74060i() {
            return this.f80221h;
        }

        public String toString() {
            String str = this.f80217d;
            long j = this.f80218e;
            String str2 = this.f80219f;
            String str3 = this.f80220g;
            String str4 = this.f80221h;
            List list = this.f80222i;
            boolean z = this.f80223j;
            boolean z2 = this.f80224k;
            return "Repayment(loanName=" + str + ", loanKey=" + j + ", loanCcy=" + str2 + ", loanProdType=" + str3 + ", status=" + str4 + ", repaymentAccounts=" + list + ", fromBNPL=" + z + ", fullPrepayment=" + z2 + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f80217d);
            parcel.writeLong(this.f80218e);
            parcel.writeString(this.f80219f);
            parcel.writeString(this.f80220g);
            parcel.writeString(this.f80221h);
            List<Parcelable> list = this.f80222i;
            parcel.writeInt(list.size());
            for (Parcelable writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
            parcel.writeInt(this.f80223j ? 1 : 0);
            parcel.writeInt(this.f80224k ? 1 : 0);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Repayment(String str, long j, String str2, String str3, String str4, List list, boolean z, boolean z2) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "loanName");
            C41536l.m120489i(str2, "loanCcy");
            C41536l.m120489i(str3, "loanProdType");
            C41536l.m120489i(str4, "status");
            C41536l.m120489i(list, "repaymentAccounts");
            this.f80217d = str;
            this.f80218e = j;
            this.f80219f = str2;
            this.f80220g = str3;
            this.f80221h = str4;
            this.f80222i = list;
            this.f80223j = z;
            this.f80224k = z2;
        }
    }

    private LoansFlow() {
    }

    public /* synthetic */ LoansFlow(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

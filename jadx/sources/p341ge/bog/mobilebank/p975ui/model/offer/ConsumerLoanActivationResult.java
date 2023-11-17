package p341ge.bog.mobilebank.p975ui.model.offer;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p341ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile;
import p341ge.bog.mobilebank.model.offers.LimitLoanDecisionDetails;
import p341ge.bog.mobilebank.model.offers.LoanOfferCard;

/* renamed from: ge.bog.mobilebank.ui.model.offer.ConsumerLoanActivationResult */
public final class ConsumerLoanActivationResult implements Parcelable {
    public static final Parcelable.Creator<ConsumerLoanActivationResult> CREATOR = new C35695b();

    /* renamed from: r */
    public static final C35694a f86289r = new C35694a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final BigDecimal f86290d;

    /* renamed from: e */
    private final String f86291e;

    /* renamed from: f */
    private final int f86292f;

    /* renamed from: g */
    private final long f86293g;

    /* renamed from: h */
    private final String f86294h;

    /* renamed from: i */
    private final String f86295i;

    /* renamed from: j */
    private final OfferProductCode f86296j;

    /* renamed from: k */
    private final String f86297k;

    /* renamed from: l */
    private final BigDecimal f86298l;

    /* renamed from: m */
    private final BigDecimal f86299m;

    /* renamed from: n */
    private final Boolean f86300n;

    /* renamed from: o */
    private final Boolean f86301o;

    /* renamed from: p */
    private final String f86302p;

    /* renamed from: q */
    private final CardExternalFile f86303q;

    /* renamed from: ge.bog.mobilebank.ui.model.offer.ConsumerLoanActivationResult$a */
    public static final class C35694a {
        private C35694a() {
        }

        public /* synthetic */ C35694a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ ConsumerLoanActivationResult m106002b(C35694a aVar, LimitLoanDecisionDetails limitLoanDecisionDetails, LoanOfferCard loanOfferCard, OfferProductCode offerProductCode, Boolean bool, Boolean bool2, String str, int i, Object obj) {
            return aVar.mo86846a(limitLoanDecisionDetails, loanOfferCard, (i & 4) != 0 ? null : offerProductCode, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : str);
        }

        /* renamed from: a */
        public final ConsumerLoanActivationResult mo86846a(LimitLoanDecisionDetails limitLoanDecisionDetails, LoanOfferCard loanOfferCard, OfferProductCode offerProductCode, Boolean bool, Boolean bool2, String str) {
            LimitLoanDecisionDetails limitLoanDecisionDetails2 = limitLoanDecisionDetails;
            C41536l.m120489i(limitLoanDecisionDetails2, "details");
            C41536l.m120489i(loanOfferCard, "card");
            BigDecimal bigDecimal = limitLoanDecisionDetails2.loanAmount;
            C41536l.m120488h(bigDecimal, "details.loanAmount");
            String str2 = limitLoanDecisionDetails2.loanCcy;
            C41536l.m120488h(str2, "details.loanCcy");
            int i = limitLoanDecisionDetails2.loanTerm;
            long j = limitLoanDecisionDetails2.firstPayDate;
            String acctName = loanOfferCard.getAcctName();
            if (acctName == null) {
                acctName = loanOfferCard.getAcctNo();
            }
            String subProductCode = loanOfferCard.getSubProductCode();
            C41536l.m120488h(subProductCode, "card.subProductCode");
            return new ConsumerLoanActivationResult(bigDecimal, str2, i, j, acctName, subProductCode, offerProductCode, limitLoanDecisionDetails2.insIncFlag, limitLoanDecisionDetails2.rfncAmount, limitLoanDecisionDetails2.keepAmount, bool, bool2, str, loanOfferCard.getCardExternalFile());
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.model.offer.ConsumerLoanActivationResult$b */
    public static final class C35695b implements Parcelable.Creator {
        /* renamed from: a */
        public final ConsumerLoanActivationResult createFromParcel(Parcel parcel) {
            Boolean bool;
            Boolean bool2;
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            long readLong = parcel.readLong();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            OfferProductCode offerProductCode = (OfferProductCode) parcel2.readParcelable(ConsumerLoanActivationResult.class.getClassLoader());
            String readString4 = parcel.readString();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            boolean z = true;
            CardExternalFile cardExternalFile = null;
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool2 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                bool2 = Boolean.valueOf(z);
            }
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                cardExternalFile = CardExternalFile.CREATOR.createFromParcel(parcel2);
            }
            return new ConsumerLoanActivationResult(bigDecimal, readString, readInt, readLong, readString2, readString3, offerProductCode, readString4, bigDecimal2, bigDecimal3, bool, bool2, readString5, cardExternalFile);
        }

        /* renamed from: b */
        public final ConsumerLoanActivationResult[] newArray(int i) {
            return new ConsumerLoanActivationResult[i];
        }
    }

    public ConsumerLoanActivationResult(BigDecimal bigDecimal, String str, int i, long j, String str2, String str3, OfferProductCode offerProductCode, String str4, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Boolean bool, Boolean bool2, String str5, CardExternalFile cardExternalFile) {
        C41536l.m120489i(bigDecimal, "loanAmount");
        C41536l.m120489i(str, "loanCcy");
        C41536l.m120489i(str3, "cardSubProductCode");
        this.f86290d = bigDecimal;
        this.f86291e = str;
        this.f86292f = i;
        this.f86293g = j;
        this.f86294h = str2;
        this.f86295i = str3;
        this.f86296j = offerProductCode;
        this.f86297k = str4;
        this.f86298l = bigDecimal2;
        this.f86299m = bigDecimal3;
        this.f86300n = bool;
        this.f86301o = bool2;
        this.f86302p = str5;
        this.f86303q = cardExternalFile;
    }

    /* renamed from: a */
    public final CardExternalFile mo86827a() {
        return this.f86303q;
    }

    /* renamed from: b */
    public final String mo86828b() {
        return this.f86295i;
    }

    /* renamed from: d */
    public final long mo86829d() {
        return this.f86293g;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Boolean mo86831e() {
        return this.f86301o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsumerLoanActivationResult)) {
            return false;
        }
        ConsumerLoanActivationResult consumerLoanActivationResult = (ConsumerLoanActivationResult) obj;
        return C41536l.m120484d(this.f86290d, consumerLoanActivationResult.f86290d) && C41536l.m120484d(this.f86291e, consumerLoanActivationResult.f86291e) && this.f86292f == consumerLoanActivationResult.f86292f && this.f86293g == consumerLoanActivationResult.f86293g && C41536l.m120484d(this.f86294h, consumerLoanActivationResult.f86294h) && C41536l.m120484d(this.f86295i, consumerLoanActivationResult.f86295i) && C41536l.m120484d(this.f86296j, consumerLoanActivationResult.f86296j) && C41536l.m120484d(this.f86297k, consumerLoanActivationResult.f86297k) && C41536l.m120484d(this.f86298l, consumerLoanActivationResult.f86298l) && C41536l.m120484d(this.f86299m, consumerLoanActivationResult.f86299m) && C41536l.m120484d(this.f86300n, consumerLoanActivationResult.f86300n) && C41536l.m120484d(this.f86301o, consumerLoanActivationResult.f86301o) && C41536l.m120484d(this.f86302p, consumerLoanActivationResult.f86302p) && C41536l.m120484d(this.f86303q, consumerLoanActivationResult.f86303q);
    }

    /* renamed from: f */
    public final Boolean mo86833f() {
        return this.f86300n;
    }

    /* renamed from: g */
    public final BigDecimal mo86834g() {
        return this.f86299m;
    }

    /* renamed from: h */
    public final String mo86835h() {
        return this.f86294h;
    }

    public int hashCode() {
        int hashCode = ((((((this.f86290d.hashCode() * 31) + this.f86291e.hashCode()) * 31) + this.f86292f) * 31) + C7397t.m28148a(this.f86293g)) * 31;
        String str = this.f86294h;
        int i = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f86295i.hashCode()) * 31;
        OfferProductCode offerProductCode = this.f86296j;
        int hashCode3 = (hashCode2 + (offerProductCode == null ? 0 : offerProductCode.hashCode())) * 31;
        String str2 = this.f86297k;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.f86298l;
        int hashCode5 = (hashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f86299m;
        int hashCode6 = (hashCode5 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Boolean bool = this.f86300n;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f86301o;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.f86302p;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CardExternalFile cardExternalFile = this.f86303q;
        if (cardExternalFile != null) {
            i = cardExternalFile.hashCode();
        }
        return hashCode9 + i;
    }

    /* renamed from: i */
    public final BigDecimal mo86837i() {
        return this.f86290d;
    }

    /* renamed from: j */
    public final String mo86838j() {
        return this.f86291e;
    }

    /* renamed from: k */
    public final int mo86839k() {
        return this.f86292f;
    }

    /* renamed from: l */
    public final String mo86840l() {
        return this.f86297k;
    }

    /* renamed from: m */
    public final OfferProductCode mo86841m() {
        return this.f86296j;
    }

    /* renamed from: p */
    public final String mo86842p() {
        return this.f86302p;
    }

    /* renamed from: q */
    public final BigDecimal mo86843q() {
        return this.f86298l;
    }

    public String toString() {
        BigDecimal bigDecimal = this.f86290d;
        String str = this.f86291e;
        int i = this.f86292f;
        long j = this.f86293g;
        String str2 = this.f86294h;
        String str3 = this.f86295i;
        OfferProductCode offerProductCode = this.f86296j;
        String str4 = this.f86297k;
        BigDecimal bigDecimal2 = this.f86298l;
        BigDecimal bigDecimal3 = this.f86299m;
        Boolean bool = this.f86300n;
        Boolean bool2 = this.f86301o;
        String str5 = this.f86302p;
        CardExternalFile cardExternalFile = this.f86303q;
        return "ConsumerLoanActivationResult(loanAmount=" + bigDecimal + ", loanCcy=" + str + ", loanTerm=" + i + ", firstPaymentDate=" + j + ", linkedAccount=" + str2 + ", cardSubProductCode=" + str3 + ", productCode=" + offerProductCode + ", paymentInsurance=" + str4 + ", rfncAmount=" + bigDecimal2 + ", keepAmount=" + bigDecimal3 + ", hasLifeInsurance=" + bool + ", hasIncomeInsurance=" + bool2 + ", providerName=" + str5 + ", cardExternalFile=" + cardExternalFile + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeSerializable(this.f86290d);
        parcel.writeString(this.f86291e);
        parcel.writeInt(this.f86292f);
        parcel.writeLong(this.f86293g);
        parcel.writeString(this.f86294h);
        parcel.writeString(this.f86295i);
        parcel.writeParcelable(this.f86296j, i);
        parcel.writeString(this.f86297k);
        parcel.writeSerializable(this.f86298l);
        parcel.writeSerializable(this.f86299m);
        Boolean bool = this.f86300n;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.f86301o;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.f86302p);
        CardExternalFile cardExternalFile = this.f86303q;
        if (cardExternalFile == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        cardExternalFile.writeToParcel(parcel, i);
    }
}

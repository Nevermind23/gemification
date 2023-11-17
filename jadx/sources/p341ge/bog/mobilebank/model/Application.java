package p341ge.bog.mobilebank.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.model.CreditAppLoanDetails;
import p341ge.bog.mobilebank.model.deposits.DepositAppDetails;

@Keep
/* renamed from: ge.bog.mobilebank.model.Application */
public final class Application implements AssetLiabListItemInterface, Parcelable {
    public static final Parcelable.Creator<Application> CREATOR = new Creator();
    private final long appId;
    private final String appType;
    private final CardApplicationDetails cardDetails;
    private final long clientKey;
    private final long createDate;
    private final DepositAppDetails depositDetails;
    private final String dictionaryKey;
    private final Long expDate;
    private final CreditAppLoanDetails loanDetails;
    private final String prodType;
    private final long resultCode;
    private final String status;

    /* renamed from: ge.bog.mobilebank.model.Application$Creator */
    public static final class Creator implements Parcelable.Creator<Application> {
        public final Application createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            long readLong2 = parcel.readLong();
            long readLong3 = parcel.readLong();
            CreditAppLoanDetails creditAppLoanDetails = null;
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString3 = parcel.readString();
            long readLong4 = parcel.readLong();
            String readString4 = parcel.readString();
            DepositAppDetails createFromParcel = parcel.readInt() == 0 ? null : DepositAppDetails.CREATOR.createFromParcel(parcel2);
            CardApplicationDetails createFromParcel2 = parcel.readInt() == 0 ? null : CardApplicationDetails.CREATOR.createFromParcel(parcel2);
            if (parcel.readInt() != 0) {
                creditAppLoanDetails = CreditAppLoanDetails.CREATOR.createFromParcel(parcel2);
            }
            return new Application(readLong, readString, readString2, readLong2, readLong3, valueOf, readString3, readLong4, readString4, createFromParcel, createFromParcel2, creditAppLoanDetails);
        }

        public final Application[] newArray(int i) {
            return new Application[i];
        }
    }

    public Application(long j, String str, String str2, long j2, long j3, Long l, String str3, long j4, String str4, DepositAppDetails depositAppDetails, CardApplicationDetails cardApplicationDetails, CreditAppLoanDetails creditAppLoanDetails) {
        String str5 = str3;
        String str6 = str4;
        C41536l.m120489i(str, "appType");
        C41536l.m120489i(str2, "status");
        C41536l.m120489i(str5, "prodType");
        C41536l.m120489i(str6, "dictionaryKey");
        this.appId = j;
        this.appType = str;
        this.status = str2;
        this.resultCode = j2;
        this.clientKey = j3;
        this.expDate = l;
        this.prodType = str5;
        this.createDate = j4;
        this.dictionaryKey = str6;
        this.depositDetails = depositAppDetails;
        this.cardDetails = cardApplicationDetails;
        this.loanDetails = creditAppLoanDetails;
    }

    public static /* synthetic */ Application copy$default(Application application, long j, String str, String str2, long j2, long j3, Long l, String str3, long j4, String str4, DepositAppDetails depositAppDetails, CardApplicationDetails cardApplicationDetails, CreditAppLoanDetails creditAppLoanDetails, int i, Object obj) {
        Application application2 = application;
        int i2 = i;
        return application.copy((i2 & 1) != 0 ? application2.appId : j, (i2 & 2) != 0 ? application2.appType : str, (i2 & 4) != 0 ? application2.status : str2, (i2 & 8) != 0 ? application2.resultCode : j2, (i2 & 16) != 0 ? application2.clientKey : j3, (i2 & 32) != 0 ? application2.expDate : l, (i2 & 64) != 0 ? application2.prodType : str3, (i2 & 128) != 0 ? application2.createDate : j4, (i2 & C11398b.f33139r) != 0 ? application2.dictionaryKey : str4, (i2 & C11398b.f33140s) != 0 ? application2.depositDetails : depositAppDetails, (i2 & C11398b.f33141t) != 0 ? application2.cardDetails : cardApplicationDetails, (i2 & C11398b.f33142u) != 0 ? application2.loanDetails : creditAppLoanDetails);
    }

    public final long component1() {
        return this.appId;
    }

    public final DepositAppDetails component10() {
        return this.depositDetails;
    }

    public final CardApplicationDetails component11() {
        return this.cardDetails;
    }

    public final CreditAppLoanDetails component12() {
        return this.loanDetails;
    }

    public final String component2() {
        return this.appType;
    }

    public final String component3() {
        return this.status;
    }

    public final long component4() {
        return this.resultCode;
    }

    public final long component5() {
        return this.clientKey;
    }

    public final Long component6() {
        return this.expDate;
    }

    public final String component7() {
        return this.prodType;
    }

    public final long component8() {
        return this.createDate;
    }

    public final String component9() {
        return this.dictionaryKey;
    }

    public final Application copy(long j, String str, String str2, long j2, long j3, Long l, String str3, long j4, String str4, DepositAppDetails depositAppDetails, CardApplicationDetails cardApplicationDetails, CreditAppLoanDetails creditAppLoanDetails) {
        long j5 = j;
        C41536l.m120489i(str, "appType");
        C41536l.m120489i(str2, "status");
        C41536l.m120489i(str3, "prodType");
        C41536l.m120489i(str4, "dictionaryKey");
        return new Application(j, str, str2, j2, j3, l, str3, j4, str4, depositAppDetails, cardApplicationDetails, creditAppLoanDetails);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Application)) {
            return false;
        }
        Application application = (Application) obj;
        return this.appId == application.appId && C41536l.m120484d(this.appType, application.appType) && C41536l.m120484d(this.status, application.status) && this.resultCode == application.resultCode && this.clientKey == application.clientKey && C41536l.m120484d(this.expDate, application.expDate) && C41536l.m120484d(this.prodType, application.prodType) && this.createDate == application.createDate && C41536l.m120484d(this.dictionaryKey, application.dictionaryKey) && C41536l.m120484d(this.depositDetails, application.depositDetails) && C41536l.m120484d(this.cardDetails, application.cardDetails) && C41536l.m120484d(this.loanDetails, application.loanDetails);
    }

    public final long getAppId() {
        return this.appId;
    }

    public final String getAppType() {
        return this.appType;
    }

    public final CardApplicationDetails getCardDetails() {
        return this.cardDetails;
    }

    public final long getClientKey() {
        return this.clientKey;
    }

    public final long getCreateDate() {
        return this.createDate;
    }

    public final DepositAppDetails getDepositDetails() {
        return this.depositDetails;
    }

    public String getDescription() {
        String str = this.appType;
        return str == null ? "" : str;
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final Long getExpDate() {
        return this.expDate;
    }

    public String getHeader() {
        return String.valueOf(this.createDate);
    }

    public String getLeftAmount() {
        return this.status.toString();
    }

    public final CreditAppLoanDetails getLoanDetails() {
        return this.loanDetails;
    }

    public final String getProdType() {
        return this.prodType;
    }

    public final long getResultCode() {
        return this.resultCode;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int a = ((((((((C7397t.m28148a(this.appId) * 31) + this.appType.hashCode()) * 31) + this.status.hashCode()) * 31) + C7397t.m28148a(this.resultCode)) * 31) + C7397t.m28148a(this.clientKey)) * 31;
        Long l = this.expDate;
        int i = 0;
        int hashCode = (((((((a + (l == null ? 0 : l.hashCode())) * 31) + this.prodType.hashCode()) * 31) + C7397t.m28148a(this.createDate)) * 31) + this.dictionaryKey.hashCode()) * 31;
        DepositAppDetails depositAppDetails = this.depositDetails;
        int hashCode2 = (hashCode + (depositAppDetails == null ? 0 : depositAppDetails.hashCode())) * 31;
        CardApplicationDetails cardApplicationDetails = this.cardDetails;
        int hashCode3 = (hashCode2 + (cardApplicationDetails == null ? 0 : cardApplicationDetails.hashCode())) * 31;
        CreditAppLoanDetails creditAppLoanDetails = this.loanDetails;
        if (creditAppLoanDetails != null) {
            i = creditAppLoanDetails.hashCode();
        }
        return hashCode3 + i;
    }

    public boolean isCard() {
        return false;
    }

    public String toString() {
        long j = this.appId;
        String str = this.appType;
        String str2 = this.status;
        long j2 = this.resultCode;
        long j3 = this.clientKey;
        Long l = this.expDate;
        String str3 = this.prodType;
        long j4 = this.createDate;
        String str4 = this.dictionaryKey;
        DepositAppDetails depositAppDetails = this.depositDetails;
        CardApplicationDetails cardApplicationDetails = this.cardDetails;
        CreditAppLoanDetails creditAppLoanDetails = this.loanDetails;
        return "Application(appId=" + j + ", appType=" + str + ", status=" + str2 + ", resultCode=" + j2 + ", clientKey=" + j3 + ", expDate=" + l + ", prodType=" + str3 + ", createDate=" + j4 + ", dictionaryKey=" + str4 + ", depositDetails=" + depositAppDetails + ", cardDetails=" + cardApplicationDetails + ", loanDetails=" + creditAppLoanDetails + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.appId);
        parcel.writeString(this.appType);
        parcel.writeString(this.status);
        parcel.writeLong(this.resultCode);
        parcel.writeLong(this.clientKey);
        Long l = this.expDate;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.prodType);
        parcel.writeLong(this.createDate);
        parcel.writeString(this.dictionaryKey);
        DepositAppDetails depositAppDetails = this.depositDetails;
        if (depositAppDetails == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            depositAppDetails.writeToParcel(parcel, i);
        }
        CardApplicationDetails cardApplicationDetails = this.cardDetails;
        if (cardApplicationDetails == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cardApplicationDetails.writeToParcel(parcel, i);
        }
        CreditAppLoanDetails creditAppLoanDetails = this.loanDetails;
        if (creditAppLoanDetails == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        creditAppLoanDetails.writeToParcel(parcel, i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Application(long r21, java.lang.String r23, java.lang.String r24, long r25, long r27, java.lang.Long r29, java.lang.String r30, long r31, java.lang.String r33, p341ge.bog.mobilebank.model.deposits.DepositAppDetails r34, p341ge.bog.mobilebank.model.CardApplicationDetails r35, p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.model.CreditAppLoanDetails r36, int r37, kotlin.jvm.internal.DefaultConstructorMarker r38) {
        /*
            r20 = this;
            r0 = r37
            r1 = r0 & 512(0x200, float:7.175E-43)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            r17 = r2
            goto L_0x000c
        L_0x000a:
            r17 = r34
        L_0x000c:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0013
            r19 = r2
            goto L_0x0015
        L_0x0013:
            r19 = r36
        L_0x0015:
            r3 = r20
            r4 = r21
            r6 = r23
            r7 = r24
            r8 = r25
            r10 = r27
            r12 = r29
            r13 = r30
            r14 = r31
            r16 = r33
            r18 = r35
            r3.<init>(r4, r6, r7, r8, r10, r12, r13, r14, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.model.Application.<init>(long, java.lang.String, java.lang.String, long, long, java.lang.Long, java.lang.String, long, java.lang.String, ge.bog.mobilebank.model.deposits.DepositAppDetails, ge.bog.mobilebank.model.CardApplicationDetails, ge.bog.mobilebank.cleanarch.offersandapplications.presentation.model.CreditAppLoanDetails, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

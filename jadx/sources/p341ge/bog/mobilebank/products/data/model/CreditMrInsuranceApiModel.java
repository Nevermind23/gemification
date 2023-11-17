package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.CreditMrInsuranceApiModel */
public final class CreditMrInsuranceApiModel {
    private final long acctKey;
    private final String attachmentFileBase64;
    private final String cardClass;
    private final String cardConditionsUrl;
    private final long cardId;
    private final String cardType;
    private final String cardTypeName;
    private final long clientKey;
    private final long expDate;
    private final long expDateMillis;
    private final String insuranceCode;
    private final String insuranceText;
    private final String languageCode;
    private final String lastFour;
    private final String phoneNumber;
    private final String productUrl;
    private final String subProductCode;

    public CreditMrInsuranceApiModel(long j, long j2, String str, long j3, String str2, String str3, String str4, String str5, String str6, String str7, long j4, String str8, String str9, String str10, String str11, long j5, String str12) {
        this.acctKey = j;
        this.cardId = j2;
        this.languageCode = str;
        this.clientKey = j3;
        this.cardClass = str2;
        this.cardType = str3;
        this.subProductCode = str4;
        this.lastFour = str5;
        this.cardTypeName = str6;
        this.insuranceCode = str7;
        this.expDate = j4;
        this.insuranceText = str8;
        this.productUrl = str9;
        this.cardConditionsUrl = str10;
        this.phoneNumber = str11;
        this.expDateMillis = j5;
        this.attachmentFileBase64 = str12;
    }

    public static /* synthetic */ CreditMrInsuranceApiModel copy$default(CreditMrInsuranceApiModel creditMrInsuranceApiModel, long j, long j2, String str, long j3, String str2, String str3, String str4, String str5, String str6, String str7, long j4, String str8, String str9, String str10, String str11, long j5, String str12, int i, Object obj) {
        CreditMrInsuranceApiModel creditMrInsuranceApiModel2 = creditMrInsuranceApiModel;
        int i2 = i;
        return creditMrInsuranceApiModel.copy((i2 & 1) != 0 ? creditMrInsuranceApiModel2.acctKey : j, (i2 & 2) != 0 ? creditMrInsuranceApiModel2.cardId : j2, (i2 & 4) != 0 ? creditMrInsuranceApiModel2.languageCode : str, (i2 & 8) != 0 ? creditMrInsuranceApiModel2.clientKey : j3, (i2 & 16) != 0 ? creditMrInsuranceApiModel2.cardClass : str2, (i2 & 32) != 0 ? creditMrInsuranceApiModel2.cardType : str3, (i2 & 64) != 0 ? creditMrInsuranceApiModel2.subProductCode : str4, (i2 & 128) != 0 ? creditMrInsuranceApiModel2.lastFour : str5, (i2 & C11398b.f33139r) != 0 ? creditMrInsuranceApiModel2.cardTypeName : str6, (i2 & C11398b.f33140s) != 0 ? creditMrInsuranceApiModel2.insuranceCode : str7, (i2 & C11398b.f33141t) != 0 ? creditMrInsuranceApiModel2.expDate : j4, (i2 & C11398b.f33142u) != 0 ? creditMrInsuranceApiModel2.insuranceText : str8, (i2 & C11398b.f33143v) != 0 ? creditMrInsuranceApiModel2.productUrl : str9, (i2 & 8192) != 0 ? creditMrInsuranceApiModel2.cardConditionsUrl : str10, (i2 & 16384) != 0 ? creditMrInsuranceApiModel2.phoneNumber : str11, (i2 & 32768) != 0 ? creditMrInsuranceApiModel2.expDateMillis : j5, (i2 & 65536) != 0 ? creditMrInsuranceApiModel2.attachmentFileBase64 : str12);
    }

    public final long component1() {
        return this.acctKey;
    }

    public final String component10() {
        return this.insuranceCode;
    }

    public final long component11() {
        return this.expDate;
    }

    public final String component12() {
        return this.insuranceText;
    }

    public final String component13() {
        return this.productUrl;
    }

    public final String component14() {
        return this.cardConditionsUrl;
    }

    public final String component15() {
        return this.phoneNumber;
    }

    public final long component16() {
        return this.expDateMillis;
    }

    public final String component17() {
        return this.attachmentFileBase64;
    }

    public final long component2() {
        return this.cardId;
    }

    public final String component3() {
        return this.languageCode;
    }

    public final long component4() {
        return this.clientKey;
    }

    public final String component5() {
        return this.cardClass;
    }

    public final String component6() {
        return this.cardType;
    }

    public final String component7() {
        return this.subProductCode;
    }

    public final String component8() {
        return this.lastFour;
    }

    public final String component9() {
        return this.cardTypeName;
    }

    public final CreditMrInsuranceApiModel copy(long j, long j2, String str, long j3, String str2, String str3, String str4, String str5, String str6, String str7, long j4, String str8, String str9, String str10, String str11, long j5, String str12) {
        return new CreditMrInsuranceApiModel(j, j2, str, j3, str2, str3, str4, str5, str6, str7, j4, str8, str9, str10, str11, j5, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditMrInsuranceApiModel)) {
            return false;
        }
        CreditMrInsuranceApiModel creditMrInsuranceApiModel = (CreditMrInsuranceApiModel) obj;
        return this.acctKey == creditMrInsuranceApiModel.acctKey && this.cardId == creditMrInsuranceApiModel.cardId && C41536l.m120484d(this.languageCode, creditMrInsuranceApiModel.languageCode) && this.clientKey == creditMrInsuranceApiModel.clientKey && C41536l.m120484d(this.cardClass, creditMrInsuranceApiModel.cardClass) && C41536l.m120484d(this.cardType, creditMrInsuranceApiModel.cardType) && C41536l.m120484d(this.subProductCode, creditMrInsuranceApiModel.subProductCode) && C41536l.m120484d(this.lastFour, creditMrInsuranceApiModel.lastFour) && C41536l.m120484d(this.cardTypeName, creditMrInsuranceApiModel.cardTypeName) && C41536l.m120484d(this.insuranceCode, creditMrInsuranceApiModel.insuranceCode) && this.expDate == creditMrInsuranceApiModel.expDate && C41536l.m120484d(this.insuranceText, creditMrInsuranceApiModel.insuranceText) && C41536l.m120484d(this.productUrl, creditMrInsuranceApiModel.productUrl) && C41536l.m120484d(this.cardConditionsUrl, creditMrInsuranceApiModel.cardConditionsUrl) && C41536l.m120484d(this.phoneNumber, creditMrInsuranceApiModel.phoneNumber) && this.expDateMillis == creditMrInsuranceApiModel.expDateMillis && C41536l.m120484d(this.attachmentFileBase64, creditMrInsuranceApiModel.attachmentFileBase64);
    }

    public final long getAcctKey() {
        return this.acctKey;
    }

    public final String getAttachmentFileBase64() {
        return this.attachmentFileBase64;
    }

    public final String getCardClass() {
        return this.cardClass;
    }

    public final String getCardConditionsUrl() {
        return this.cardConditionsUrl;
    }

    public final long getCardId() {
        return this.cardId;
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final String getCardTypeName() {
        return this.cardTypeName;
    }

    public final long getClientKey() {
        return this.clientKey;
    }

    public final long getExpDate() {
        return this.expDate;
    }

    public final long getExpDateMillis() {
        return this.expDateMillis;
    }

    public final String getInsuranceCode() {
        return this.insuranceCode;
    }

    public final String getInsuranceText() {
        return this.insuranceText;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final String getLastFour() {
        return this.lastFour;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getProductUrl() {
        return this.productUrl;
    }

    public final String getSubProductCode() {
        return this.subProductCode;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.acctKey) * 31) + C7397t.m28148a(this.cardId)) * 31;
        String str = this.languageCode;
        int i = 0;
        int hashCode = (((a + (str == null ? 0 : str.hashCode())) * 31) + C7397t.m28148a(this.clientKey)) * 31;
        String str2 = this.cardClass;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cardType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subProductCode;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.lastFour;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cardTypeName;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.insuranceCode;
        int hashCode7 = (((hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31) + C7397t.m28148a(this.expDate)) * 31;
        String str8 = this.insuranceText;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.productUrl;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.cardConditionsUrl;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.phoneNumber;
        int hashCode11 = (((hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31) + C7397t.m28148a(this.expDateMillis)) * 31;
        String str12 = this.attachmentFileBase64;
        if (str12 != null) {
            i = str12.hashCode();
        }
        return hashCode11 + i;
    }

    public String toString() {
        long j = this.acctKey;
        long j2 = this.cardId;
        String str = this.languageCode;
        long j3 = this.clientKey;
        String str2 = this.cardClass;
        String str3 = this.cardType;
        String str4 = this.subProductCode;
        String str5 = this.lastFour;
        String str6 = this.cardTypeName;
        String str7 = this.insuranceCode;
        long j4 = this.expDate;
        String str8 = this.insuranceText;
        String str9 = this.productUrl;
        String str10 = this.cardConditionsUrl;
        String str11 = str8;
        String str12 = this.phoneNumber;
        long j5 = this.expDateMillis;
        String str13 = this.attachmentFileBase64;
        return "CreditMrInsuranceApiModel(acctKey=" + j + ", cardId=" + j2 + ", languageCode=" + str + ", clientKey=" + j3 + ", cardClass=" + str2 + ", cardType=" + str3 + ", subProductCode=" + str4 + ", lastFour=" + str5 + ", cardTypeName=" + str6 + ", insuranceCode=" + str7 + ", expDate=" + j4 + ", insuranceText=" + str11 + ", productUrl=" + str9 + ", cardConditionsUrl=" + str10 + ", phoneNumber=" + str12 + ", expDateMillis=" + j5 + ", attachmentFileBase64=" + str13 + ")";
    }
}

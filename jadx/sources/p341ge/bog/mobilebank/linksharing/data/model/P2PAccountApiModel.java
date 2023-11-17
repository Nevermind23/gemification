package p341ge.bog.mobilebank.linksharing.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.shared.data.ExternalFileEntity;

@Keep
/* renamed from: ge.bog.mobilebank.linksharing.data.model.P2PAccountApiModel */
public final class P2PAccountApiModel {
    private final String acctDesc;
    private final long acctKey;
    private final String acctNo;
    private final double availableAmount;
    private final String cardClass;
    private final Long cardId;
    private final ExternalFileEntity cardImage;
    private final ExternalFileEntity cardSmallImage;
    private final String cardType;
    private final String ccy;
    private final Long clientKey;
    private final String defaultAcc;
    private final String productCode;
    private final String subProductCode;

    public P2PAccountApiModel(Long l, long j, String str, String str2, String str3, String str4, double d, String str5, Long l2, String str6, String str7, String str8, ExternalFileEntity externalFileEntity, ExternalFileEntity externalFileEntity2) {
        String str9 = str5;
        ExternalFileEntity externalFileEntity3 = externalFileEntity;
        ExternalFileEntity externalFileEntity4 = externalFileEntity2;
        C41536l.m120489i(str, "acctNo");
        C41536l.m120489i(str9, "ccy");
        C41536l.m120489i(externalFileEntity3, "cardImage");
        C41536l.m120489i(externalFileEntity4, "cardSmallImage");
        this.clientKey = l;
        this.acctKey = j;
        this.acctNo = str;
        this.acctDesc = str2;
        this.productCode = str3;
        this.defaultAcc = str4;
        this.availableAmount = d;
        this.ccy = str9;
        this.cardId = l2;
        this.cardClass = str6;
        this.cardType = str7;
        this.subProductCode = str8;
        this.cardImage = externalFileEntity3;
        this.cardSmallImage = externalFileEntity4;
    }

    public static /* synthetic */ P2PAccountApiModel copy$default(P2PAccountApiModel p2PAccountApiModel, Long l, long j, String str, String str2, String str3, String str4, double d, String str5, Long l2, String str6, String str7, String str8, ExternalFileEntity externalFileEntity, ExternalFileEntity externalFileEntity2, int i, Object obj) {
        P2PAccountApiModel p2PAccountApiModel2 = p2PAccountApiModel;
        int i2 = i;
        return p2PAccountApiModel.copy((i2 & 1) != 0 ? p2PAccountApiModel2.clientKey : l, (i2 & 2) != 0 ? p2PAccountApiModel2.acctKey : j, (i2 & 4) != 0 ? p2PAccountApiModel2.acctNo : str, (i2 & 8) != 0 ? p2PAccountApiModel2.acctDesc : str2, (i2 & 16) != 0 ? p2PAccountApiModel2.productCode : str3, (i2 & 32) != 0 ? p2PAccountApiModel2.defaultAcc : str4, (i2 & 64) != 0 ? p2PAccountApiModel2.availableAmount : d, (i2 & 128) != 0 ? p2PAccountApiModel2.ccy : str5, (i2 & C11398b.f33139r) != 0 ? p2PAccountApiModel2.cardId : l2, (i2 & C11398b.f33140s) != 0 ? p2PAccountApiModel2.cardClass : str6, (i2 & C11398b.f33141t) != 0 ? p2PAccountApiModel2.cardType : str7, (i2 & C11398b.f33142u) != 0 ? p2PAccountApiModel2.subProductCode : str8, (i2 & C11398b.f33143v) != 0 ? p2PAccountApiModel2.cardImage : externalFileEntity, (i2 & 8192) != 0 ? p2PAccountApiModel2.cardSmallImage : externalFileEntity2);
    }

    public final Long component1() {
        return this.clientKey;
    }

    public final String component10() {
        return this.cardClass;
    }

    public final String component11() {
        return this.cardType;
    }

    public final String component12() {
        return this.subProductCode;
    }

    public final ExternalFileEntity component13() {
        return this.cardImage;
    }

    public final ExternalFileEntity component14() {
        return this.cardSmallImage;
    }

    public final long component2() {
        return this.acctKey;
    }

    public final String component3() {
        return this.acctNo;
    }

    public final String component4() {
        return this.acctDesc;
    }

    public final String component5() {
        return this.productCode;
    }

    public final String component6() {
        return this.defaultAcc;
    }

    public final double component7() {
        return this.availableAmount;
    }

    public final String component8() {
        return this.ccy;
    }

    public final Long component9() {
        return this.cardId;
    }

    public final P2PAccountApiModel copy(Long l, long j, String str, String str2, String str3, String str4, double d, String str5, Long l2, String str6, String str7, String str8, ExternalFileEntity externalFileEntity, ExternalFileEntity externalFileEntity2) {
        Long l3 = l;
        C41536l.m120489i(str, "acctNo");
        C41536l.m120489i(str5, "ccy");
        C41536l.m120489i(externalFileEntity, "cardImage");
        C41536l.m120489i(externalFileEntity2, "cardSmallImage");
        return new P2PAccountApiModel(l, j, str, str2, str3, str4, d, str5, l2, str6, str7, str8, externalFileEntity, externalFileEntity2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P2PAccountApiModel)) {
            return false;
        }
        P2PAccountApiModel p2PAccountApiModel = (P2PAccountApiModel) obj;
        return C41536l.m120484d(this.clientKey, p2PAccountApiModel.clientKey) && this.acctKey == p2PAccountApiModel.acctKey && C41536l.m120484d(this.acctNo, p2PAccountApiModel.acctNo) && C41536l.m120484d(this.acctDesc, p2PAccountApiModel.acctDesc) && C41536l.m120484d(this.productCode, p2PAccountApiModel.productCode) && C41536l.m120484d(this.defaultAcc, p2PAccountApiModel.defaultAcc) && Double.compare(this.availableAmount, p2PAccountApiModel.availableAmount) == 0 && C41536l.m120484d(this.ccy, p2PAccountApiModel.ccy) && C41536l.m120484d(this.cardId, p2PAccountApiModel.cardId) && C41536l.m120484d(this.cardClass, p2PAccountApiModel.cardClass) && C41536l.m120484d(this.cardType, p2PAccountApiModel.cardType) && C41536l.m120484d(this.subProductCode, p2PAccountApiModel.subProductCode) && C41536l.m120484d(this.cardImage, p2PAccountApiModel.cardImage) && C41536l.m120484d(this.cardSmallImage, p2PAccountApiModel.cardSmallImage);
    }

    public final String getAcctDesc() {
        return this.acctDesc;
    }

    public final long getAcctKey() {
        return this.acctKey;
    }

    public final String getAcctNo() {
        return this.acctNo;
    }

    public final double getAvailableAmount() {
        return this.availableAmount;
    }

    public final String getCardClass() {
        return this.cardClass;
    }

    public final Long getCardId() {
        return this.cardId;
    }

    public final ExternalFileEntity getCardImage() {
        return this.cardImage;
    }

    public final ExternalFileEntity getCardSmallImage() {
        return this.cardSmallImage;
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final Long getClientKey() {
        return this.clientKey;
    }

    public final String getDefaultAcc() {
        return this.defaultAcc;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getSubProductCode() {
        return this.subProductCode;
    }

    public int hashCode() {
        Long l = this.clientKey;
        int i = 0;
        int hashCode = (((((l == null ? 0 : l.hashCode()) * 31) + C7397t.m28148a(this.acctKey)) * 31) + this.acctNo.hashCode()) * 31;
        String str = this.acctDesc;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productCode;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.defaultAcc;
        int hashCode4 = (((((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Double.doubleToLongBits(this.availableAmount)) * 31) + this.ccy.hashCode()) * 31;
        Long l2 = this.cardId;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.cardClass;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cardType;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subProductCode;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return ((((hashCode7 + i) * 31) + this.cardImage.hashCode()) * 31) + this.cardSmallImage.hashCode();
    }

    public String toString() {
        Long l = this.clientKey;
        long j = this.acctKey;
        String str = this.acctNo;
        String str2 = this.acctDesc;
        String str3 = this.productCode;
        String str4 = this.defaultAcc;
        double d = this.availableAmount;
        String str5 = this.ccy;
        Long l2 = this.cardId;
        String str6 = this.cardClass;
        String str7 = this.cardType;
        String str8 = this.subProductCode;
        ExternalFileEntity externalFileEntity = this.cardImage;
        ExternalFileEntity externalFileEntity2 = this.cardSmallImage;
        return "P2PAccountApiModel(clientKey=" + l + ", acctKey=" + j + ", acctNo=" + str + ", acctDesc=" + str2 + ", productCode=" + str3 + ", defaultAcc=" + str4 + ", availableAmount=" + d + ", ccy=" + str5 + ", cardId=" + l2 + ", cardClass=" + str6 + ", cardType=" + str7 + ", subProductCode=" + str8 + ", cardImage=" + externalFileEntity + ", cardSmallImage=" + externalFileEntity2 + ")";
    }
}

package p341ge.bog.mobilebank.cleanarch.data.creditapplication.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.creditapplication.entity.CreditOfferEntity */
public final class CreditOfferEntity {
    private final String cardCcy;
    private final String cardClass;
    private final String cardGroup;
    private final String cardLimit;
    private final String cardName;
    private final String cardType;
    private final String comisAmount;
    private final String comisCcy;
    private final String creditLimit;
    private final String limitMax;
    private final String limitMin;
    private final String periodLength;
    private final String periodUnit;
    private final String productKey;
    private final String templCode;

    public CreditOfferEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String str16 = str3;
        String str17 = str6;
        String str18 = str7;
        String str19 = str8;
        String str20 = str9;
        String str21 = str10;
        String str22 = str11;
        String str23 = str12;
        String str24 = str14;
        C41536l.m120489i(str, "cardName");
        C41536l.m120489i(str2, "cardType");
        C41536l.m120489i(str16, "cardCcy");
        C41536l.m120489i(str17, "periodUnit");
        C41536l.m120489i(str18, "comisAmount");
        C41536l.m120489i(str19, "templCode");
        C41536l.m120489i(str20, "periodLength");
        C41536l.m120489i(str21, "limitMin");
        C41536l.m120489i(str22, "limitMax");
        C41536l.m120489i(str23, "cardClass");
        C41536l.m120489i(str24, "cardLimit");
        this.cardName = str;
        this.cardType = str2;
        this.cardCcy = str16;
        this.comisCcy = str4;
        this.productKey = str5;
        this.periodUnit = str17;
        this.comisAmount = str18;
        this.templCode = str19;
        this.periodLength = str20;
        this.limitMin = str21;
        this.limitMax = str22;
        this.cardClass = str23;
        this.cardGroup = str13;
        this.cardLimit = str24;
        this.creditLimit = str15;
    }

    public static /* synthetic */ CreditOfferEntity copy$default(CreditOfferEntity creditOfferEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i, Object obj) {
        CreditOfferEntity creditOfferEntity2 = creditOfferEntity;
        int i2 = i;
        return creditOfferEntity.copy((i2 & 1) != 0 ? creditOfferEntity2.cardName : str, (i2 & 2) != 0 ? creditOfferEntity2.cardType : str2, (i2 & 4) != 0 ? creditOfferEntity2.cardCcy : str3, (i2 & 8) != 0 ? creditOfferEntity2.comisCcy : str4, (i2 & 16) != 0 ? creditOfferEntity2.productKey : str5, (i2 & 32) != 0 ? creditOfferEntity2.periodUnit : str6, (i2 & 64) != 0 ? creditOfferEntity2.comisAmount : str7, (i2 & 128) != 0 ? creditOfferEntity2.templCode : str8, (i2 & C11398b.f33139r) != 0 ? creditOfferEntity2.periodLength : str9, (i2 & C11398b.f33140s) != 0 ? creditOfferEntity2.limitMin : str10, (i2 & C11398b.f33141t) != 0 ? creditOfferEntity2.limitMax : str11, (i2 & C11398b.f33142u) != 0 ? creditOfferEntity2.cardClass : str12, (i2 & C11398b.f33143v) != 0 ? creditOfferEntity2.cardGroup : str13, (i2 & 8192) != 0 ? creditOfferEntity2.cardLimit : str14, (i2 & 16384) != 0 ? creditOfferEntity2.creditLimit : str15);
    }

    public final String component1() {
        return this.cardName;
    }

    public final String component10() {
        return this.limitMin;
    }

    public final String component11() {
        return this.limitMax;
    }

    public final String component12() {
        return this.cardClass;
    }

    public final String component13() {
        return this.cardGroup;
    }

    public final String component14() {
        return this.cardLimit;
    }

    public final String component15() {
        return this.creditLimit;
    }

    public final String component2() {
        return this.cardType;
    }

    public final String component3() {
        return this.cardCcy;
    }

    public final String component4() {
        return this.comisCcy;
    }

    public final String component5() {
        return this.productKey;
    }

    public final String component6() {
        return this.periodUnit;
    }

    public final String component7() {
        return this.comisAmount;
    }

    public final String component8() {
        return this.templCode;
    }

    public final String component9() {
        return this.periodLength;
    }

    public final CreditOfferEntity copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String str16 = str;
        C41536l.m120489i(str16, "cardName");
        String str17 = str2;
        C41536l.m120489i(str17, "cardType");
        String str18 = str3;
        C41536l.m120489i(str18, "cardCcy");
        String str19 = str6;
        C41536l.m120489i(str19, "periodUnit");
        String str20 = str7;
        C41536l.m120489i(str20, "comisAmount");
        String str21 = str8;
        C41536l.m120489i(str21, "templCode");
        String str22 = str9;
        C41536l.m120489i(str22, "periodLength");
        String str23 = str10;
        C41536l.m120489i(str23, "limitMin");
        String str24 = str11;
        C41536l.m120489i(str24, "limitMax");
        String str25 = str12;
        C41536l.m120489i(str25, "cardClass");
        String str26 = str14;
        C41536l.m120489i(str26, "cardLimit");
        return new CreditOfferEntity(str16, str17, str18, str4, str5, str19, str20, str21, str22, str23, str24, str25, str13, str26, str15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditOfferEntity)) {
            return false;
        }
        CreditOfferEntity creditOfferEntity = (CreditOfferEntity) obj;
        return C41536l.m120484d(this.cardName, creditOfferEntity.cardName) && C41536l.m120484d(this.cardType, creditOfferEntity.cardType) && C41536l.m120484d(this.cardCcy, creditOfferEntity.cardCcy) && C41536l.m120484d(this.comisCcy, creditOfferEntity.comisCcy) && C41536l.m120484d(this.productKey, creditOfferEntity.productKey) && C41536l.m120484d(this.periodUnit, creditOfferEntity.periodUnit) && C41536l.m120484d(this.comisAmount, creditOfferEntity.comisAmount) && C41536l.m120484d(this.templCode, creditOfferEntity.templCode) && C41536l.m120484d(this.periodLength, creditOfferEntity.periodLength) && C41536l.m120484d(this.limitMin, creditOfferEntity.limitMin) && C41536l.m120484d(this.limitMax, creditOfferEntity.limitMax) && C41536l.m120484d(this.cardClass, creditOfferEntity.cardClass) && C41536l.m120484d(this.cardGroup, creditOfferEntity.cardGroup) && C41536l.m120484d(this.cardLimit, creditOfferEntity.cardLimit) && C41536l.m120484d(this.creditLimit, creditOfferEntity.creditLimit);
    }

    public final String getCardCcy() {
        return this.cardCcy;
    }

    public final String getCardClass() {
        return this.cardClass;
    }

    public final String getCardGroup() {
        return this.cardGroup;
    }

    public final String getCardLimit() {
        return this.cardLimit;
    }

    public final String getCardName() {
        return this.cardName;
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final String getComisAmount() {
        return this.comisAmount;
    }

    public final String getComisCcy() {
        return this.comisCcy;
    }

    public final String getCreditLimit() {
        return this.creditLimit;
    }

    public final String getLimitMax() {
        return this.limitMax;
    }

    public final String getLimitMin() {
        return this.limitMin;
    }

    public final String getPeriodLength() {
        return this.periodLength;
    }

    public final String getPeriodUnit() {
        return this.periodUnit;
    }

    public final String getProductKey() {
        return this.productKey;
    }

    public final String getTemplCode() {
        return this.templCode;
    }

    public int hashCode() {
        int hashCode = ((((this.cardName.hashCode() * 31) + this.cardType.hashCode()) * 31) + this.cardCcy.hashCode()) * 31;
        String str = this.comisCcy;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productKey;
        int hashCode3 = (((((((((((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.periodUnit.hashCode()) * 31) + this.comisAmount.hashCode()) * 31) + this.templCode.hashCode()) * 31) + this.periodLength.hashCode()) * 31) + this.limitMin.hashCode()) * 31) + this.limitMax.hashCode()) * 31) + this.cardClass.hashCode()) * 31;
        String str3 = this.cardGroup;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.cardLimit.hashCode()) * 31;
        String str4 = this.creditLimit;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.cardName;
        String str2 = this.cardType;
        String str3 = this.cardCcy;
        String str4 = this.comisCcy;
        String str5 = this.productKey;
        String str6 = this.periodUnit;
        String str7 = this.comisAmount;
        String str8 = this.templCode;
        String str9 = this.periodLength;
        String str10 = this.limitMin;
        String str11 = this.limitMax;
        String str12 = this.cardClass;
        String str13 = this.cardGroup;
        String str14 = this.cardLimit;
        String str15 = this.creditLimit;
        return "CreditOfferEntity(cardName=" + str + ", cardType=" + str2 + ", cardCcy=" + str3 + ", comisCcy=" + str4 + ", productKey=" + str5 + ", periodUnit=" + str6 + ", comisAmount=" + str7 + ", templCode=" + str8 + ", periodLength=" + str9 + ", limitMin=" + str10 + ", limitMax=" + str11 + ", cardClass=" + str12 + ", cardGroup=" + str13 + ", cardLimit=" + str14 + ", creditLimit=" + str15 + ")";
    }
}

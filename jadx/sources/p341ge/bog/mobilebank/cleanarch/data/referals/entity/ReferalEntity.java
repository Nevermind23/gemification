package p341ge.bog.mobilebank.cleanarch.data.referals.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.referals.entity.ReferalEntity */
public final class ReferalEntity {
    private final String bannerTextForActiveClient;
    private final String bannerTextForPassiveClient;
    private final BigDecimal bonusAmountForActivation;
    private final BigDecimal bonusAmountForReferring;
    private final String bonusCCYForActivation;
    private final String bonusCCYForReferring;
    private final BigDecimal earnedPrizeAmountForReferring;
    private final String earnedPrizeCCYForReferring;
    private final Boolean isActiveClient;
    private final Boolean isReferralProgramActive;
    private final String myActivatedPromoCode;
    private final String myPromoCodeToRefer;
    private final Integer numberOfReferredClientsActivated;
    private final String promoPageTextForActivation;
    private final String promoPageTextForActivationAfterFillingCode;
    private final String promoPageTextForReferring;

    public ReferalEntity(Boolean bool, Boolean bool2, BigDecimal bigDecimal, String str, String str2, String str3, Integer num, String str4, BigDecimal bigDecimal2, String str5, String str6, BigDecimal bigDecimal3, String str7, String str8, String str9, String str10) {
        this.isReferralProgramActive = bool;
        this.isActiveClient = bool2;
        this.bonusAmountForReferring = bigDecimal;
        this.bonusCCYForReferring = str;
        this.promoPageTextForReferring = str2;
        this.earnedPrizeCCYForReferring = str3;
        this.numberOfReferredClientsActivated = num;
        this.myActivatedPromoCode = str4;
        this.bonusAmountForActivation = bigDecimal2;
        this.bonusCCYForActivation = str5;
        this.promoPageTextForActivation = str6;
        this.earnedPrizeAmountForReferring = bigDecimal3;
        this.bannerTextForActiveClient = str7;
        this.bannerTextForPassiveClient = str8;
        this.myPromoCodeToRefer = str9;
        this.promoPageTextForActivationAfterFillingCode = str10;
    }

    public static /* synthetic */ ReferalEntity copy$default(ReferalEntity referalEntity, Boolean bool, Boolean bool2, BigDecimal bigDecimal, String str, String str2, String str3, Integer num, String str4, BigDecimal bigDecimal2, String str5, String str6, BigDecimal bigDecimal3, String str7, String str8, String str9, String str10, int i, Object obj) {
        ReferalEntity referalEntity2 = referalEntity;
        int i2 = i;
        return referalEntity.copy((i2 & 1) != 0 ? referalEntity2.isReferralProgramActive : bool, (i2 & 2) != 0 ? referalEntity2.isActiveClient : bool2, (i2 & 4) != 0 ? referalEntity2.bonusAmountForReferring : bigDecimal, (i2 & 8) != 0 ? referalEntity2.bonusCCYForReferring : str, (i2 & 16) != 0 ? referalEntity2.promoPageTextForReferring : str2, (i2 & 32) != 0 ? referalEntity2.earnedPrizeCCYForReferring : str3, (i2 & 64) != 0 ? referalEntity2.numberOfReferredClientsActivated : num, (i2 & 128) != 0 ? referalEntity2.myActivatedPromoCode : str4, (i2 & C11398b.f33139r) != 0 ? referalEntity2.bonusAmountForActivation : bigDecimal2, (i2 & C11398b.f33140s) != 0 ? referalEntity2.bonusCCYForActivation : str5, (i2 & C11398b.f33141t) != 0 ? referalEntity2.promoPageTextForActivation : str6, (i2 & C11398b.f33142u) != 0 ? referalEntity2.earnedPrizeAmountForReferring : bigDecimal3, (i2 & C11398b.f33143v) != 0 ? referalEntity2.bannerTextForActiveClient : str7, (i2 & 8192) != 0 ? referalEntity2.bannerTextForPassiveClient : str8, (i2 & 16384) != 0 ? referalEntity2.myPromoCodeToRefer : str9, (i2 & 32768) != 0 ? referalEntity2.promoPageTextForActivationAfterFillingCode : str10);
    }

    public final Boolean component1() {
        return this.isReferralProgramActive;
    }

    public final String component10() {
        return this.bonusCCYForActivation;
    }

    public final String component11() {
        return this.promoPageTextForActivation;
    }

    public final BigDecimal component12() {
        return this.earnedPrizeAmountForReferring;
    }

    public final String component13() {
        return this.bannerTextForActiveClient;
    }

    public final String component14() {
        return this.bannerTextForPassiveClient;
    }

    public final String component15() {
        return this.myPromoCodeToRefer;
    }

    public final String component16() {
        return this.promoPageTextForActivationAfterFillingCode;
    }

    public final Boolean component2() {
        return this.isActiveClient;
    }

    public final BigDecimal component3() {
        return this.bonusAmountForReferring;
    }

    public final String component4() {
        return this.bonusCCYForReferring;
    }

    public final String component5() {
        return this.promoPageTextForReferring;
    }

    public final String component6() {
        return this.earnedPrizeCCYForReferring;
    }

    public final Integer component7() {
        return this.numberOfReferredClientsActivated;
    }

    public final String component8() {
        return this.myActivatedPromoCode;
    }

    public final BigDecimal component9() {
        return this.bonusAmountForActivation;
    }

    public final ReferalEntity copy(Boolean bool, Boolean bool2, BigDecimal bigDecimal, String str, String str2, String str3, Integer num, String str4, BigDecimal bigDecimal2, String str5, String str6, BigDecimal bigDecimal3, String str7, String str8, String str9, String str10) {
        return new ReferalEntity(bool, bool2, bigDecimal, str, str2, str3, num, str4, bigDecimal2, str5, str6, bigDecimal3, str7, str8, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferalEntity)) {
            return false;
        }
        ReferalEntity referalEntity = (ReferalEntity) obj;
        return C41536l.m120484d(this.isReferralProgramActive, referalEntity.isReferralProgramActive) && C41536l.m120484d(this.isActiveClient, referalEntity.isActiveClient) && C41536l.m120484d(this.bonusAmountForReferring, referalEntity.bonusAmountForReferring) && C41536l.m120484d(this.bonusCCYForReferring, referalEntity.bonusCCYForReferring) && C41536l.m120484d(this.promoPageTextForReferring, referalEntity.promoPageTextForReferring) && C41536l.m120484d(this.earnedPrizeCCYForReferring, referalEntity.earnedPrizeCCYForReferring) && C41536l.m120484d(this.numberOfReferredClientsActivated, referalEntity.numberOfReferredClientsActivated) && C41536l.m120484d(this.myActivatedPromoCode, referalEntity.myActivatedPromoCode) && C41536l.m120484d(this.bonusAmountForActivation, referalEntity.bonusAmountForActivation) && C41536l.m120484d(this.bonusCCYForActivation, referalEntity.bonusCCYForActivation) && C41536l.m120484d(this.promoPageTextForActivation, referalEntity.promoPageTextForActivation) && C41536l.m120484d(this.earnedPrizeAmountForReferring, referalEntity.earnedPrizeAmountForReferring) && C41536l.m120484d(this.bannerTextForActiveClient, referalEntity.bannerTextForActiveClient) && C41536l.m120484d(this.bannerTextForPassiveClient, referalEntity.bannerTextForPassiveClient) && C41536l.m120484d(this.myPromoCodeToRefer, referalEntity.myPromoCodeToRefer) && C41536l.m120484d(this.promoPageTextForActivationAfterFillingCode, referalEntity.promoPageTextForActivationAfterFillingCode);
    }

    public final String getBannerTextForActiveClient() {
        return this.bannerTextForActiveClient;
    }

    public final String getBannerTextForPassiveClient() {
        return this.bannerTextForPassiveClient;
    }

    public final BigDecimal getBonusAmountForActivation() {
        return this.bonusAmountForActivation;
    }

    public final BigDecimal getBonusAmountForReferring() {
        return this.bonusAmountForReferring;
    }

    public final String getBonusCCYForActivation() {
        return this.bonusCCYForActivation;
    }

    public final String getBonusCCYForReferring() {
        return this.bonusCCYForReferring;
    }

    public final BigDecimal getEarnedPrizeAmountForReferring() {
        return this.earnedPrizeAmountForReferring;
    }

    public final String getEarnedPrizeCCYForReferring() {
        return this.earnedPrizeCCYForReferring;
    }

    public final String getMyActivatedPromoCode() {
        return this.myActivatedPromoCode;
    }

    public final String getMyPromoCodeToRefer() {
        return this.myPromoCodeToRefer;
    }

    public final Integer getNumberOfReferredClientsActivated() {
        return this.numberOfReferredClientsActivated;
    }

    public final String getPromoPageTextForActivation() {
        return this.promoPageTextForActivation;
    }

    public final String getPromoPageTextForActivationAfterFillingCode() {
        return this.promoPageTextForActivationAfterFillingCode;
    }

    public final String getPromoPageTextForReferring() {
        return this.promoPageTextForReferring;
    }

    public int hashCode() {
        Boolean bool = this.isReferralProgramActive;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isActiveClient;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        BigDecimal bigDecimal = this.bonusAmountForReferring;
        int hashCode3 = (hashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.bonusCCYForReferring;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.promoPageTextForReferring;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.earnedPrizeCCYForReferring;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.numberOfReferredClientsActivated;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.myActivatedPromoCode;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.bonusAmountForActivation;
        int hashCode9 = (hashCode8 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str5 = this.bonusCCYForActivation;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.promoPageTextForActivation;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.earnedPrizeAmountForReferring;
        int hashCode12 = (hashCode11 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str7 = this.bannerTextForActiveClient;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.bannerTextForPassiveClient;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.myPromoCodeToRefer;
        int hashCode15 = (hashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.promoPageTextForActivationAfterFillingCode;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return hashCode15 + i;
    }

    public final Boolean isActiveClient() {
        return this.isActiveClient;
    }

    public final Boolean isReferralProgramActive() {
        return this.isReferralProgramActive;
    }

    public String toString() {
        Boolean bool = this.isReferralProgramActive;
        Boolean bool2 = this.isActiveClient;
        BigDecimal bigDecimal = this.bonusAmountForReferring;
        String str = this.bonusCCYForReferring;
        String str2 = this.promoPageTextForReferring;
        String str3 = this.earnedPrizeCCYForReferring;
        Integer num = this.numberOfReferredClientsActivated;
        String str4 = this.myActivatedPromoCode;
        BigDecimal bigDecimal2 = this.bonusAmountForActivation;
        String str5 = this.bonusCCYForActivation;
        String str6 = this.promoPageTextForActivation;
        BigDecimal bigDecimal3 = this.earnedPrizeAmountForReferring;
        String str7 = this.bannerTextForActiveClient;
        String str8 = this.bannerTextForPassiveClient;
        String str9 = this.myPromoCodeToRefer;
        String str10 = this.promoPageTextForActivationAfterFillingCode;
        return "ReferalEntity(isReferralProgramActive=" + bool + ", isActiveClient=" + bool2 + ", bonusAmountForReferring=" + bigDecimal + ", bonusCCYForReferring=" + str + ", promoPageTextForReferring=" + str2 + ", earnedPrizeCCYForReferring=" + str3 + ", numberOfReferredClientsActivated=" + num + ", myActivatedPromoCode=" + str4 + ", bonusAmountForActivation=" + bigDecimal2 + ", bonusCCYForActivation=" + str5 + ", promoPageTextForActivation=" + str6 + ", earnedPrizeAmountForReferring=" + bigDecimal3 + ", bannerTextForActiveClient=" + str7 + ", bannerTextForPassiveClient=" + str8 + ", myPromoCodeToRefer=" + str9 + ", promoPageTextForActivationAfterFillingCode=" + str10 + ")";
    }
}

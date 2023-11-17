package p341ge.bog.mobilebank.payments.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.payments.data.model.ExecuteResultApiModel */
public final class ExecuteResultApiModel {
    private final BigDecimal addBonusAmount;
    private final Integer bonusSchemeId;
    private final PrizeApiModel campaignPrize;
    private final Integer code;
    private final CodeStatus codeStatus;
    private final String error;
    private final String errorDictionaryKey;
    private final String errorDictionaryValue;
    private final List<KeyValueApiModel> essParameters;
    private final String essServiceId;
    private final String offloadingContractType;
    private final String offloadingKey;
    private final BigDecimal offloadingPrize;
    private final String offloadingPrizeCcy;
    private final BigDecimal paymentCommission;
    private final Long paymentDate;

    public ExecuteResultApiModel(String str, String str2, String str3, String str4, List<KeyValueApiModel> list, BigDecimal bigDecimal, PrizeApiModel prizeApiModel, BigDecimal bigDecimal2, String str5, String str6, Integer num, String str7, BigDecimal bigDecimal3, Integer num2, CodeStatus codeStatus2, Long l) {
        this.error = str;
        this.errorDictionaryKey = str2;
        this.errorDictionaryValue = str3;
        this.essServiceId = str4;
        this.essParameters = list;
        this.offloadingPrize = bigDecimal;
        this.campaignPrize = prizeApiModel;
        this.addBonusAmount = bigDecimal2;
        this.offloadingPrizeCcy = str5;
        this.offloadingContractType = str6;
        this.bonusSchemeId = num;
        this.offloadingKey = str7;
        this.paymentCommission = bigDecimal3;
        this.code = num2;
        this.codeStatus = codeStatus2;
        this.paymentDate = l;
    }

    public static /* synthetic */ ExecuteResultApiModel copy$default(ExecuteResultApiModel executeResultApiModel, String str, String str2, String str3, String str4, List list, BigDecimal bigDecimal, PrizeApiModel prizeApiModel, BigDecimal bigDecimal2, String str5, String str6, Integer num, String str7, BigDecimal bigDecimal3, Integer num2, CodeStatus codeStatus2, Long l, int i, Object obj) {
        ExecuteResultApiModel executeResultApiModel2 = executeResultApiModel;
        int i2 = i;
        return executeResultApiModel.copy((i2 & 1) != 0 ? executeResultApiModel2.error : str, (i2 & 2) != 0 ? executeResultApiModel2.errorDictionaryKey : str2, (i2 & 4) != 0 ? executeResultApiModel2.errorDictionaryValue : str3, (i2 & 8) != 0 ? executeResultApiModel2.essServiceId : str4, (i2 & 16) != 0 ? executeResultApiModel2.essParameters : list, (i2 & 32) != 0 ? executeResultApiModel2.offloadingPrize : bigDecimal, (i2 & 64) != 0 ? executeResultApiModel2.campaignPrize : prizeApiModel, (i2 & 128) != 0 ? executeResultApiModel2.addBonusAmount : bigDecimal2, (i2 & C11398b.f33139r) != 0 ? executeResultApiModel2.offloadingPrizeCcy : str5, (i2 & C11398b.f33140s) != 0 ? executeResultApiModel2.offloadingContractType : str6, (i2 & C11398b.f33141t) != 0 ? executeResultApiModel2.bonusSchemeId : num, (i2 & C11398b.f33142u) != 0 ? executeResultApiModel2.offloadingKey : str7, (i2 & C11398b.f33143v) != 0 ? executeResultApiModel2.paymentCommission : bigDecimal3, (i2 & 8192) != 0 ? executeResultApiModel2.code : num2, (i2 & 16384) != 0 ? executeResultApiModel2.codeStatus : codeStatus2, (i2 & 32768) != 0 ? executeResultApiModel2.paymentDate : l);
    }

    public final String component1() {
        return this.error;
    }

    public final String component10() {
        return this.offloadingContractType;
    }

    public final Integer component11() {
        return this.bonusSchemeId;
    }

    public final String component12() {
        return this.offloadingKey;
    }

    public final BigDecimal component13() {
        return this.paymentCommission;
    }

    public final Integer component14() {
        return this.code;
    }

    public final CodeStatus component15() {
        return this.codeStatus;
    }

    public final Long component16() {
        return this.paymentDate;
    }

    public final String component2() {
        return this.errorDictionaryKey;
    }

    public final String component3() {
        return this.errorDictionaryValue;
    }

    public final String component4() {
        return this.essServiceId;
    }

    public final List<KeyValueApiModel> component5() {
        return this.essParameters;
    }

    public final BigDecimal component6() {
        return this.offloadingPrize;
    }

    public final PrizeApiModel component7() {
        return this.campaignPrize;
    }

    public final BigDecimal component8() {
        return this.addBonusAmount;
    }

    public final String component9() {
        return this.offloadingPrizeCcy;
    }

    public final ExecuteResultApiModel copy(String str, String str2, String str3, String str4, List<KeyValueApiModel> list, BigDecimal bigDecimal, PrizeApiModel prizeApiModel, BigDecimal bigDecimal2, String str5, String str6, Integer num, String str7, BigDecimal bigDecimal3, Integer num2, CodeStatus codeStatus2, Long l) {
        return new ExecuteResultApiModel(str, str2, str3, str4, list, bigDecimal, prizeApiModel, bigDecimal2, str5, str6, num, str7, bigDecimal3, num2, codeStatus2, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExecuteResultApiModel)) {
            return false;
        }
        ExecuteResultApiModel executeResultApiModel = (ExecuteResultApiModel) obj;
        return C41536l.m120484d(this.error, executeResultApiModel.error) && C41536l.m120484d(this.errorDictionaryKey, executeResultApiModel.errorDictionaryKey) && C41536l.m120484d(this.errorDictionaryValue, executeResultApiModel.errorDictionaryValue) && C41536l.m120484d(this.essServiceId, executeResultApiModel.essServiceId) && C41536l.m120484d(this.essParameters, executeResultApiModel.essParameters) && C41536l.m120484d(this.offloadingPrize, executeResultApiModel.offloadingPrize) && C41536l.m120484d(this.campaignPrize, executeResultApiModel.campaignPrize) && C41536l.m120484d(this.addBonusAmount, executeResultApiModel.addBonusAmount) && C41536l.m120484d(this.offloadingPrizeCcy, executeResultApiModel.offloadingPrizeCcy) && C41536l.m120484d(this.offloadingContractType, executeResultApiModel.offloadingContractType) && C41536l.m120484d(this.bonusSchemeId, executeResultApiModel.bonusSchemeId) && C41536l.m120484d(this.offloadingKey, executeResultApiModel.offloadingKey) && C41536l.m120484d(this.paymentCommission, executeResultApiModel.paymentCommission) && C41536l.m120484d(this.code, executeResultApiModel.code) && this.codeStatus == executeResultApiModel.codeStatus && C41536l.m120484d(this.paymentDate, executeResultApiModel.paymentDate);
    }

    public final BigDecimal getAddBonusAmount() {
        return this.addBonusAmount;
    }

    public final Integer getBonusSchemeId() {
        return this.bonusSchemeId;
    }

    public final PrizeApiModel getCampaignPrize() {
        return this.campaignPrize;
    }

    public final Integer getCode() {
        return this.code;
    }

    public final CodeStatus getCodeStatus() {
        return this.codeStatus;
    }

    public final String getError() {
        return this.error;
    }

    public final String getErrorDictionaryKey() {
        return this.errorDictionaryKey;
    }

    public final String getErrorDictionaryValue() {
        return this.errorDictionaryValue;
    }

    public final List<KeyValueApiModel> getEssParameters() {
        return this.essParameters;
    }

    public final String getEssServiceId() {
        return this.essServiceId;
    }

    public final String getOffloadingContractType() {
        return this.offloadingContractType;
    }

    public final String getOffloadingKey() {
        return this.offloadingKey;
    }

    public final BigDecimal getOffloadingPrize() {
        return this.offloadingPrize;
    }

    public final String getOffloadingPrizeCcy() {
        return this.offloadingPrizeCcy;
    }

    public final BigDecimal getPaymentCommission() {
        return this.paymentCommission;
    }

    public final Long getPaymentDate() {
        return this.paymentDate;
    }

    public int hashCode() {
        String str = this.error;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorDictionaryKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorDictionaryValue;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.essServiceId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<KeyValueApiModel> list = this.essParameters;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        BigDecimal bigDecimal = this.offloadingPrize;
        int hashCode6 = (hashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        PrizeApiModel prizeApiModel = this.campaignPrize;
        int hashCode7 = (hashCode6 + (prizeApiModel == null ? 0 : prizeApiModel.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.addBonusAmount;
        int hashCode8 = (hashCode7 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str5 = this.offloadingPrizeCcy;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.offloadingContractType;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.bonusSchemeId;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.offloadingKey;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.paymentCommission;
        int hashCode13 = (hashCode12 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        Integer num2 = this.code;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        CodeStatus codeStatus2 = this.codeStatus;
        int hashCode15 = (hashCode14 + (codeStatus2 == null ? 0 : codeStatus2.hashCode())) * 31;
        Long l = this.paymentDate;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode15 + i;
    }

    public String toString() {
        String str = this.error;
        String str2 = this.errorDictionaryKey;
        String str3 = this.errorDictionaryValue;
        String str4 = this.essServiceId;
        List<KeyValueApiModel> list = this.essParameters;
        BigDecimal bigDecimal = this.offloadingPrize;
        PrizeApiModel prizeApiModel = this.campaignPrize;
        BigDecimal bigDecimal2 = this.addBonusAmount;
        String str5 = this.offloadingPrizeCcy;
        String str6 = this.offloadingContractType;
        Integer num = this.bonusSchemeId;
        String str7 = this.offloadingKey;
        BigDecimal bigDecimal3 = this.paymentCommission;
        Integer num2 = this.code;
        CodeStatus codeStatus2 = this.codeStatus;
        Long l = this.paymentDate;
        return "ExecuteResultApiModel(error=" + str + ", errorDictionaryKey=" + str2 + ", errorDictionaryValue=" + str3 + ", essServiceId=" + str4 + ", essParameters=" + list + ", offloadingPrize=" + bigDecimal + ", campaignPrize=" + prizeApiModel + ", addBonusAmount=" + bigDecimal2 + ", offloadingPrizeCcy=" + str5 + ", offloadingContractType=" + str6 + ", bonusSchemeId=" + num + ", offloadingKey=" + str7 + ", paymentCommission=" + bigDecimal3 + ", code=" + num2 + ", codeStatus=" + codeStatus2 + ", paymentDate=" + l + ")";
    }
}

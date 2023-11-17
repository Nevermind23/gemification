package p341ge.bog.mobilebank.payments.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.payments.data.model.PaymentResponseApiModel */
public final class PaymentResponseApiModel {
    private final Integer addBonusAmount;
    private final PrizeApiModel campaignPrize;
    private final List<ExecuteResultApiModel> executeResult;
    private final YesNoApiEntity offloadingContract;
    private final String offloadingContractType;
    private final String offloadingKey;
    private final String offloadingPrize;
    private final String offloadingPrizeCcy;

    public PaymentResponseApiModel(Integer num, String str, YesNoApiEntity yesNoApiEntity, String str2, PrizeApiModel prizeApiModel, String str3, String str4, List<ExecuteResultApiModel> list) {
        this.addBonusAmount = num;
        this.offloadingContractType = str;
        this.offloadingContract = yesNoApiEntity;
        this.offloadingKey = str2;
        this.campaignPrize = prizeApiModel;
        this.offloadingPrizeCcy = str3;
        this.offloadingPrize = str4;
        this.executeResult = list;
    }

    public static /* synthetic */ PaymentResponseApiModel copy$default(PaymentResponseApiModel paymentResponseApiModel, Integer num, String str, YesNoApiEntity yesNoApiEntity, String str2, PrizeApiModel prizeApiModel, String str3, String str4, List list, int i, Object obj) {
        PaymentResponseApiModel paymentResponseApiModel2 = paymentResponseApiModel;
        int i2 = i;
        return paymentResponseApiModel.copy((i2 & 1) != 0 ? paymentResponseApiModel2.addBonusAmount : num, (i2 & 2) != 0 ? paymentResponseApiModel2.offloadingContractType : str, (i2 & 4) != 0 ? paymentResponseApiModel2.offloadingContract : yesNoApiEntity, (i2 & 8) != 0 ? paymentResponseApiModel2.offloadingKey : str2, (i2 & 16) != 0 ? paymentResponseApiModel2.campaignPrize : prizeApiModel, (i2 & 32) != 0 ? paymentResponseApiModel2.offloadingPrizeCcy : str3, (i2 & 64) != 0 ? paymentResponseApiModel2.offloadingPrize : str4, (i2 & 128) != 0 ? paymentResponseApiModel2.executeResult : list);
    }

    public final Integer component1() {
        return this.addBonusAmount;
    }

    public final String component2() {
        return this.offloadingContractType;
    }

    public final YesNoApiEntity component3() {
        return this.offloadingContract;
    }

    public final String component4() {
        return this.offloadingKey;
    }

    public final PrizeApiModel component5() {
        return this.campaignPrize;
    }

    public final String component6() {
        return this.offloadingPrizeCcy;
    }

    public final String component7() {
        return this.offloadingPrize;
    }

    public final List<ExecuteResultApiModel> component8() {
        return this.executeResult;
    }

    public final PaymentResponseApiModel copy(Integer num, String str, YesNoApiEntity yesNoApiEntity, String str2, PrizeApiModel prizeApiModel, String str3, String str4, List<ExecuteResultApiModel> list) {
        return new PaymentResponseApiModel(num, str, yesNoApiEntity, str2, prizeApiModel, str3, str4, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentResponseApiModel)) {
            return false;
        }
        PaymentResponseApiModel paymentResponseApiModel = (PaymentResponseApiModel) obj;
        return C41536l.m120484d(this.addBonusAmount, paymentResponseApiModel.addBonusAmount) && C41536l.m120484d(this.offloadingContractType, paymentResponseApiModel.offloadingContractType) && this.offloadingContract == paymentResponseApiModel.offloadingContract && C41536l.m120484d(this.offloadingKey, paymentResponseApiModel.offloadingKey) && C41536l.m120484d(this.campaignPrize, paymentResponseApiModel.campaignPrize) && C41536l.m120484d(this.offloadingPrizeCcy, paymentResponseApiModel.offloadingPrizeCcy) && C41536l.m120484d(this.offloadingPrize, paymentResponseApiModel.offloadingPrize) && C41536l.m120484d(this.executeResult, paymentResponseApiModel.executeResult);
    }

    public final Integer getAddBonusAmount() {
        return this.addBonusAmount;
    }

    public final PrizeApiModel getCampaignPrize() {
        return this.campaignPrize;
    }

    public final List<ExecuteResultApiModel> getExecuteResult() {
        return this.executeResult;
    }

    public final YesNoApiEntity getOffloadingContract() {
        return this.offloadingContract;
    }

    public final String getOffloadingContractType() {
        return this.offloadingContractType;
    }

    public final String getOffloadingKey() {
        return this.offloadingKey;
    }

    public final String getOffloadingPrize() {
        return this.offloadingPrize;
    }

    public final String getOffloadingPrizeCcy() {
        return this.offloadingPrizeCcy;
    }

    public int hashCode() {
        Integer num = this.addBonusAmount;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.offloadingContractType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity = this.offloadingContract;
        int hashCode3 = (hashCode2 + (yesNoApiEntity == null ? 0 : yesNoApiEntity.hashCode())) * 31;
        String str2 = this.offloadingKey;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PrizeApiModel prizeApiModel = this.campaignPrize;
        int hashCode5 = (hashCode4 + (prizeApiModel == null ? 0 : prizeApiModel.hashCode())) * 31;
        String str3 = this.offloadingPrizeCcy;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.offloadingPrize;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<ExecuteResultApiModel> list = this.executeResult;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        Integer num = this.addBonusAmount;
        String str = this.offloadingContractType;
        YesNoApiEntity yesNoApiEntity = this.offloadingContract;
        String str2 = this.offloadingKey;
        PrizeApiModel prizeApiModel = this.campaignPrize;
        String str3 = this.offloadingPrizeCcy;
        String str4 = this.offloadingPrize;
        List<ExecuteResultApiModel> list = this.executeResult;
        return "PaymentResponseApiModel(addBonusAmount=" + num + ", offloadingContractType=" + str + ", offloadingContract=" + yesNoApiEntity + ", offloadingKey=" + str2 + ", campaignPrize=" + prizeApiModel + ", offloadingPrizeCcy=" + str3 + ", offloadingPrize=" + str4 + ", executeResult=" + list + ")";
    }
}

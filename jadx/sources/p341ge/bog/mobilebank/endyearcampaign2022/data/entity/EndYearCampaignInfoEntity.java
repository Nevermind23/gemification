package p341ge.bog.mobilebank.endyearcampaign2022.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.endyearcampaign2022.data.entity.EndYearCampaignInfoEntity */
public final class EndYearCampaignInfoEntity {
    private final YesNoApiEntity isSuperPrize;
    private final YesNoApiEntity isWinner;
    private final Double prizeAmount;
    private final PrizeTypeEntity prizeType;
    private final YesNoApiEntity showPopup;

    public EndYearCampaignInfoEntity(YesNoApiEntity yesNoApiEntity, Double d, PrizeTypeEntity prizeTypeEntity, YesNoApiEntity yesNoApiEntity2, YesNoApiEntity yesNoApiEntity3) {
        this.isWinner = yesNoApiEntity;
        this.prizeAmount = d;
        this.prizeType = prizeTypeEntity;
        this.showPopup = yesNoApiEntity2;
        this.isSuperPrize = yesNoApiEntity3;
    }

    public static /* synthetic */ EndYearCampaignInfoEntity copy$default(EndYearCampaignInfoEntity endYearCampaignInfoEntity, YesNoApiEntity yesNoApiEntity, Double d, PrizeTypeEntity prizeTypeEntity, YesNoApiEntity yesNoApiEntity2, YesNoApiEntity yesNoApiEntity3, int i, Object obj) {
        if ((i & 1) != 0) {
            yesNoApiEntity = endYearCampaignInfoEntity.isWinner;
        }
        if ((i & 2) != 0) {
            d = endYearCampaignInfoEntity.prizeAmount;
        }
        Double d2 = d;
        if ((i & 4) != 0) {
            prizeTypeEntity = endYearCampaignInfoEntity.prizeType;
        }
        PrizeTypeEntity prizeTypeEntity2 = prizeTypeEntity;
        if ((i & 8) != 0) {
            yesNoApiEntity2 = endYearCampaignInfoEntity.showPopup;
        }
        YesNoApiEntity yesNoApiEntity4 = yesNoApiEntity2;
        if ((i & 16) != 0) {
            yesNoApiEntity3 = endYearCampaignInfoEntity.isSuperPrize;
        }
        return endYearCampaignInfoEntity.copy(yesNoApiEntity, d2, prizeTypeEntity2, yesNoApiEntity4, yesNoApiEntity3);
    }

    public final YesNoApiEntity component1() {
        return this.isWinner;
    }

    public final Double component2() {
        return this.prizeAmount;
    }

    public final PrizeTypeEntity component3() {
        return this.prizeType;
    }

    public final YesNoApiEntity component4() {
        return this.showPopup;
    }

    public final YesNoApiEntity component5() {
        return this.isSuperPrize;
    }

    public final EndYearCampaignInfoEntity copy(YesNoApiEntity yesNoApiEntity, Double d, PrizeTypeEntity prizeTypeEntity, YesNoApiEntity yesNoApiEntity2, YesNoApiEntity yesNoApiEntity3) {
        return new EndYearCampaignInfoEntity(yesNoApiEntity, d, prizeTypeEntity, yesNoApiEntity2, yesNoApiEntity3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EndYearCampaignInfoEntity)) {
            return false;
        }
        EndYearCampaignInfoEntity endYearCampaignInfoEntity = (EndYearCampaignInfoEntity) obj;
        return this.isWinner == endYearCampaignInfoEntity.isWinner && C41536l.m120484d(this.prizeAmount, endYearCampaignInfoEntity.prizeAmount) && this.prizeType == endYearCampaignInfoEntity.prizeType && this.showPopup == endYearCampaignInfoEntity.showPopup && this.isSuperPrize == endYearCampaignInfoEntity.isSuperPrize;
    }

    public final Double getPrizeAmount() {
        return this.prizeAmount;
    }

    public final PrizeTypeEntity getPrizeType() {
        return this.prizeType;
    }

    public final YesNoApiEntity getShowPopup() {
        return this.showPopup;
    }

    public int hashCode() {
        YesNoApiEntity yesNoApiEntity = this.isWinner;
        int i = 0;
        int hashCode = (yesNoApiEntity == null ? 0 : yesNoApiEntity.hashCode()) * 31;
        Double d = this.prizeAmount;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        PrizeTypeEntity prizeTypeEntity = this.prizeType;
        int hashCode3 = (hashCode2 + (prizeTypeEntity == null ? 0 : prizeTypeEntity.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity2 = this.showPopup;
        int hashCode4 = (hashCode3 + (yesNoApiEntity2 == null ? 0 : yesNoApiEntity2.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity3 = this.isSuperPrize;
        if (yesNoApiEntity3 != null) {
            i = yesNoApiEntity3.hashCode();
        }
        return hashCode4 + i;
    }

    public final YesNoApiEntity isSuperPrize() {
        return this.isSuperPrize;
    }

    public final YesNoApiEntity isWinner() {
        return this.isWinner;
    }

    public String toString() {
        YesNoApiEntity yesNoApiEntity = this.isWinner;
        Double d = this.prizeAmount;
        PrizeTypeEntity prizeTypeEntity = this.prizeType;
        YesNoApiEntity yesNoApiEntity2 = this.showPopup;
        YesNoApiEntity yesNoApiEntity3 = this.isSuperPrize;
        return "EndYearCampaignInfoEntity(isWinner=" + yesNoApiEntity + ", prizeAmount=" + d + ", prizeType=" + prizeTypeEntity + ", showPopup=" + yesNoApiEntity2 + ", isSuperPrize=" + yesNoApiEntity3 + ")";
    }
}

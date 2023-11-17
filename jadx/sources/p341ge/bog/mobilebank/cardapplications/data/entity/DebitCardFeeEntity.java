package p341ge.bog.mobilebank.cardapplications.data.entity;

import androidx.annotation.Keep;
import hd0.C24978b;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.DebitCardFeeEntity */
public final class DebitCardFeeEntity {
    private final List<ActiveCardEntity> cardData;
    private final C24978b cardRecoveryFlag;
    private final double comAmount;
    private final String comCcy;
    private final Double packFeeAmount;
    private final String packFeeCcy;
    private final C24978b packageRegFlag;

    public DebitCardFeeEntity(C24978b bVar, List<ActiveCardEntity> list, double d, String str, C24978b bVar2, Double d2, String str2) {
        C41536l.m120489i(str, "comCcy");
        this.cardRecoveryFlag = bVar;
        this.cardData = list;
        this.comAmount = d;
        this.comCcy = str;
        this.packageRegFlag = bVar2;
        this.packFeeAmount = d2;
        this.packFeeCcy = str2;
    }

    public static /* synthetic */ DebitCardFeeEntity copy$default(DebitCardFeeEntity debitCardFeeEntity, C24978b bVar, List list, double d, String str, C24978b bVar2, Double d2, String str2, int i, Object obj) {
        DebitCardFeeEntity debitCardFeeEntity2 = debitCardFeeEntity;
        return debitCardFeeEntity.copy((i & 1) != 0 ? debitCardFeeEntity2.cardRecoveryFlag : bVar, (i & 2) != 0 ? debitCardFeeEntity2.cardData : list, (i & 4) != 0 ? debitCardFeeEntity2.comAmount : d, (i & 8) != 0 ? debitCardFeeEntity2.comCcy : str, (i & 16) != 0 ? debitCardFeeEntity2.packageRegFlag : bVar2, (i & 32) != 0 ? debitCardFeeEntity2.packFeeAmount : d2, (i & 64) != 0 ? debitCardFeeEntity2.packFeeCcy : str2);
    }

    public final C24978b component1() {
        return this.cardRecoveryFlag;
    }

    public final List<ActiveCardEntity> component2() {
        return this.cardData;
    }

    public final double component3() {
        return this.comAmount;
    }

    public final String component4() {
        return this.comCcy;
    }

    public final C24978b component5() {
        return this.packageRegFlag;
    }

    public final Double component6() {
        return this.packFeeAmount;
    }

    public final String component7() {
        return this.packFeeCcy;
    }

    public final DebitCardFeeEntity copy(C24978b bVar, List<ActiveCardEntity> list, double d, String str, C24978b bVar2, Double d2, String str2) {
        C41536l.m120489i(str, "comCcy");
        return new DebitCardFeeEntity(bVar, list, d, str, bVar2, d2, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardFeeEntity)) {
            return false;
        }
        DebitCardFeeEntity debitCardFeeEntity = (DebitCardFeeEntity) obj;
        return this.cardRecoveryFlag == debitCardFeeEntity.cardRecoveryFlag && C41536l.m120484d(this.cardData, debitCardFeeEntity.cardData) && Double.compare(this.comAmount, debitCardFeeEntity.comAmount) == 0 && C41536l.m120484d(this.comCcy, debitCardFeeEntity.comCcy) && this.packageRegFlag == debitCardFeeEntity.packageRegFlag && C41536l.m120484d(this.packFeeAmount, debitCardFeeEntity.packFeeAmount) && C41536l.m120484d(this.packFeeCcy, debitCardFeeEntity.packFeeCcy);
    }

    public final List<ActiveCardEntity> getCardData() {
        return this.cardData;
    }

    public final C24978b getCardRecoveryFlag() {
        return this.cardRecoveryFlag;
    }

    public final double getComAmount() {
        return this.comAmount;
    }

    public final String getComCcy() {
        return this.comCcy;
    }

    public final Double getPackFeeAmount() {
        return this.packFeeAmount;
    }

    public final String getPackFeeCcy() {
        return this.packFeeCcy;
    }

    public final C24978b getPackageRegFlag() {
        return this.packageRegFlag;
    }

    public int hashCode() {
        C24978b bVar = this.cardRecoveryFlag;
        int i = 0;
        int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        List<ActiveCardEntity> list = this.cardData;
        int hashCode2 = (((((hashCode + (list == null ? 0 : list.hashCode())) * 31) + Double.doubleToLongBits(this.comAmount)) * 31) + this.comCcy.hashCode()) * 31;
        C24978b bVar2 = this.packageRegFlag;
        int hashCode3 = (hashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        Double d = this.packFeeAmount;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.packFeeCcy;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        C24978b bVar = this.cardRecoveryFlag;
        List<ActiveCardEntity> list = this.cardData;
        double d = this.comAmount;
        String str = this.comCcy;
        C24978b bVar2 = this.packageRegFlag;
        Double d2 = this.packFeeAmount;
        String str2 = this.packFeeCcy;
        return "DebitCardFeeEntity(cardRecoveryFlag=" + bVar + ", cardData=" + list + ", comAmount=" + d + ", comCcy=" + str + ", packageRegFlag=" + bVar2 + ", packFeeAmount=" + d2 + ", packFeeCcy=" + str2 + ")";
    }
}

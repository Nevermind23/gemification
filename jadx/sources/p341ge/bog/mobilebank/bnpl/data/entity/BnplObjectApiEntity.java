package p341ge.bog.mobilebank.bnpl.data.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.bnpl.data.entity.BnplObjectApiEntity */
public final class BnplObjectApiEntity {
    private final List<BnplAmountSumEntity> amountSums;
    private final BnplAmountApiEntity cosignerSummary;
    private final List<BnplDetailsApiEntity> details;
    private final List<BnplItemApiEntity> loans;
    private final BnplAmountApiEntity summary;

    public BnplObjectApiEntity(BnplAmountApiEntity bnplAmountApiEntity, BnplAmountApiEntity bnplAmountApiEntity2, List<BnplAmountSumEntity> list, List<BnplItemApiEntity> list2, List<BnplDetailsApiEntity> list3) {
        C41536l.m120489i(bnplAmountApiEntity, "summary");
        C41536l.m120489i(bnplAmountApiEntity2, "cosignerSummary");
        C41536l.m120489i(list, "amountSums");
        C41536l.m120489i(list2, "loans");
        C41536l.m120489i(list3, "details");
        this.summary = bnplAmountApiEntity;
        this.cosignerSummary = bnplAmountApiEntity2;
        this.amountSums = list;
        this.loans = list2;
        this.details = list3;
    }

    public static /* synthetic */ BnplObjectApiEntity copy$default(BnplObjectApiEntity bnplObjectApiEntity, BnplAmountApiEntity bnplAmountApiEntity, BnplAmountApiEntity bnplAmountApiEntity2, List<BnplAmountSumEntity> list, List<BnplItemApiEntity> list2, List<BnplDetailsApiEntity> list3, int i, Object obj) {
        if ((i & 1) != 0) {
            bnplAmountApiEntity = bnplObjectApiEntity.summary;
        }
        if ((i & 2) != 0) {
            bnplAmountApiEntity2 = bnplObjectApiEntity.cosignerSummary;
        }
        BnplAmountApiEntity bnplAmountApiEntity3 = bnplAmountApiEntity2;
        if ((i & 4) != 0) {
            list = bnplObjectApiEntity.amountSums;
        }
        List<BnplAmountSumEntity> list4 = list;
        if ((i & 8) != 0) {
            list2 = bnplObjectApiEntity.loans;
        }
        List<BnplItemApiEntity> list5 = list2;
        if ((i & 16) != 0) {
            list3 = bnplObjectApiEntity.details;
        }
        return bnplObjectApiEntity.copy(bnplAmountApiEntity, bnplAmountApiEntity3, list4, list5, list3);
    }

    public final BnplAmountApiEntity component1() {
        return this.summary;
    }

    public final BnplAmountApiEntity component2() {
        return this.cosignerSummary;
    }

    public final List<BnplAmountSumEntity> component3() {
        return this.amountSums;
    }

    public final List<BnplItemApiEntity> component4() {
        return this.loans;
    }

    public final List<BnplDetailsApiEntity> component5() {
        return this.details;
    }

    public final BnplObjectApiEntity copy(BnplAmountApiEntity bnplAmountApiEntity, BnplAmountApiEntity bnplAmountApiEntity2, List<BnplAmountSumEntity> list, List<BnplItemApiEntity> list2, List<BnplDetailsApiEntity> list3) {
        C41536l.m120489i(bnplAmountApiEntity, "summary");
        C41536l.m120489i(bnplAmountApiEntity2, "cosignerSummary");
        C41536l.m120489i(list, "amountSums");
        C41536l.m120489i(list2, "loans");
        C41536l.m120489i(list3, "details");
        return new BnplObjectApiEntity(bnplAmountApiEntity, bnplAmountApiEntity2, list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BnplObjectApiEntity)) {
            return false;
        }
        BnplObjectApiEntity bnplObjectApiEntity = (BnplObjectApiEntity) obj;
        return C41536l.m120484d(this.summary, bnplObjectApiEntity.summary) && C41536l.m120484d(this.cosignerSummary, bnplObjectApiEntity.cosignerSummary) && C41536l.m120484d(this.amountSums, bnplObjectApiEntity.amountSums) && C41536l.m120484d(this.loans, bnplObjectApiEntity.loans) && C41536l.m120484d(this.details, bnplObjectApiEntity.details);
    }

    public final List<BnplAmountSumEntity> getAmountSums() {
        return this.amountSums;
    }

    public final BnplAmountApiEntity getCosignerSummary() {
        return this.cosignerSummary;
    }

    public final List<BnplDetailsApiEntity> getDetails() {
        return this.details;
    }

    public final List<BnplItemApiEntity> getLoans() {
        return this.loans;
    }

    public final BnplAmountApiEntity getSummary() {
        return this.summary;
    }

    public int hashCode() {
        return (((((((this.summary.hashCode() * 31) + this.cosignerSummary.hashCode()) * 31) + this.amountSums.hashCode()) * 31) + this.loans.hashCode()) * 31) + this.details.hashCode();
    }

    public String toString() {
        BnplAmountApiEntity bnplAmountApiEntity = this.summary;
        BnplAmountApiEntity bnplAmountApiEntity2 = this.cosignerSummary;
        List<BnplAmountSumEntity> list = this.amountSums;
        List<BnplItemApiEntity> list2 = this.loans;
        List<BnplDetailsApiEntity> list3 = this.details;
        return "BnplObjectApiEntity(summary=" + bnplAmountApiEntity + ", cosignerSummary=" + bnplAmountApiEntity2 + ", amountSums=" + list + ", loans=" + list2 + ", details=" + list3 + ")";
    }
}

package p341ge.bog.mobilebank.bnpl.data.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.bnpl.data.entity.BnplDetailsApiEntity */
public final class BnplDetailsApiEntity {
    private final BnplInvoiceApiEntity invoice;
    private final BnplDetailApiEntity lndDetails;
    private final long loanKey;
    private final MmmsDetailsApiEntity mmsDetails;
    private final PlnDetailsApiEntity plnDetails;
    private final List<BnplDetailsRepaymentAccountApiEntity> repaymentAccounts;
    private final BnplDetailsScheduleApiEntity schedule;

    public BnplDetailsApiEntity(long j, BnplDetailApiEntity bnplDetailApiEntity, PlnDetailsApiEntity plnDetailsApiEntity, BnplDetailsScheduleApiEntity bnplDetailsScheduleApiEntity, BnplInvoiceApiEntity bnplInvoiceApiEntity, List<BnplDetailsRepaymentAccountApiEntity> list, MmmsDetailsApiEntity mmmsDetailsApiEntity) {
        this.loanKey = j;
        this.lndDetails = bnplDetailApiEntity;
        this.plnDetails = plnDetailsApiEntity;
        this.schedule = bnplDetailsScheduleApiEntity;
        this.invoice = bnplInvoiceApiEntity;
        this.repaymentAccounts = list;
        this.mmsDetails = mmmsDetailsApiEntity;
    }

    public static /* synthetic */ BnplDetailsApiEntity copy$default(BnplDetailsApiEntity bnplDetailsApiEntity, long j, BnplDetailApiEntity bnplDetailApiEntity, PlnDetailsApiEntity plnDetailsApiEntity, BnplDetailsScheduleApiEntity bnplDetailsScheduleApiEntity, BnplInvoiceApiEntity bnplInvoiceApiEntity, List list, MmmsDetailsApiEntity mmmsDetailsApiEntity, int i, Object obj) {
        BnplDetailsApiEntity bnplDetailsApiEntity2 = bnplDetailsApiEntity;
        return bnplDetailsApiEntity.copy((i & 1) != 0 ? bnplDetailsApiEntity2.loanKey : j, (i & 2) != 0 ? bnplDetailsApiEntity2.lndDetails : bnplDetailApiEntity, (i & 4) != 0 ? bnplDetailsApiEntity2.plnDetails : plnDetailsApiEntity, (i & 8) != 0 ? bnplDetailsApiEntity2.schedule : bnplDetailsScheduleApiEntity, (i & 16) != 0 ? bnplDetailsApiEntity2.invoice : bnplInvoiceApiEntity, (i & 32) != 0 ? bnplDetailsApiEntity2.repaymentAccounts : list, (i & 64) != 0 ? bnplDetailsApiEntity2.mmsDetails : mmmsDetailsApiEntity);
    }

    public final long component1() {
        return this.loanKey;
    }

    public final BnplDetailApiEntity component2() {
        return this.lndDetails;
    }

    public final PlnDetailsApiEntity component3() {
        return this.plnDetails;
    }

    public final BnplDetailsScheduleApiEntity component4() {
        return this.schedule;
    }

    public final BnplInvoiceApiEntity component5() {
        return this.invoice;
    }

    public final List<BnplDetailsRepaymentAccountApiEntity> component6() {
        return this.repaymentAccounts;
    }

    public final MmmsDetailsApiEntity component7() {
        return this.mmsDetails;
    }

    public final BnplDetailsApiEntity copy(long j, BnplDetailApiEntity bnplDetailApiEntity, PlnDetailsApiEntity plnDetailsApiEntity, BnplDetailsScheduleApiEntity bnplDetailsScheduleApiEntity, BnplInvoiceApiEntity bnplInvoiceApiEntity, List<BnplDetailsRepaymentAccountApiEntity> list, MmmsDetailsApiEntity mmmsDetailsApiEntity) {
        return new BnplDetailsApiEntity(j, bnplDetailApiEntity, plnDetailsApiEntity, bnplDetailsScheduleApiEntity, bnplInvoiceApiEntity, list, mmmsDetailsApiEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BnplDetailsApiEntity)) {
            return false;
        }
        BnplDetailsApiEntity bnplDetailsApiEntity = (BnplDetailsApiEntity) obj;
        return this.loanKey == bnplDetailsApiEntity.loanKey && C41536l.m120484d(this.lndDetails, bnplDetailsApiEntity.lndDetails) && C41536l.m120484d(this.plnDetails, bnplDetailsApiEntity.plnDetails) && C41536l.m120484d(this.schedule, bnplDetailsApiEntity.schedule) && C41536l.m120484d(this.invoice, bnplDetailsApiEntity.invoice) && C41536l.m120484d(this.repaymentAccounts, bnplDetailsApiEntity.repaymentAccounts) && C41536l.m120484d(this.mmsDetails, bnplDetailsApiEntity.mmsDetails);
    }

    public final BnplInvoiceApiEntity getInvoice() {
        return this.invoice;
    }

    public final BnplDetailApiEntity getLndDetails() {
        return this.lndDetails;
    }

    public final long getLoanKey() {
        return this.loanKey;
    }

    public final MmmsDetailsApiEntity getMmsDetails() {
        return this.mmsDetails;
    }

    public final PlnDetailsApiEntity getPlnDetails() {
        return this.plnDetails;
    }

    public final List<BnplDetailsRepaymentAccountApiEntity> getRepaymentAccounts() {
        return this.repaymentAccounts;
    }

    public final BnplDetailsScheduleApiEntity getSchedule() {
        return this.schedule;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.loanKey) * 31;
        BnplDetailApiEntity bnplDetailApiEntity = this.lndDetails;
        int i = 0;
        int hashCode = (a + (bnplDetailApiEntity == null ? 0 : bnplDetailApiEntity.hashCode())) * 31;
        PlnDetailsApiEntity plnDetailsApiEntity = this.plnDetails;
        int hashCode2 = (hashCode + (plnDetailsApiEntity == null ? 0 : plnDetailsApiEntity.hashCode())) * 31;
        BnplDetailsScheduleApiEntity bnplDetailsScheduleApiEntity = this.schedule;
        int hashCode3 = (hashCode2 + (bnplDetailsScheduleApiEntity == null ? 0 : bnplDetailsScheduleApiEntity.hashCode())) * 31;
        BnplInvoiceApiEntity bnplInvoiceApiEntity = this.invoice;
        int hashCode4 = (hashCode3 + (bnplInvoiceApiEntity == null ? 0 : bnplInvoiceApiEntity.hashCode())) * 31;
        List<BnplDetailsRepaymentAccountApiEntity> list = this.repaymentAccounts;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        MmmsDetailsApiEntity mmmsDetailsApiEntity = this.mmsDetails;
        if (mmmsDetailsApiEntity != null) {
            i = mmmsDetailsApiEntity.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        long j = this.loanKey;
        BnplDetailApiEntity bnplDetailApiEntity = this.lndDetails;
        PlnDetailsApiEntity plnDetailsApiEntity = this.plnDetails;
        BnplDetailsScheduleApiEntity bnplDetailsScheduleApiEntity = this.schedule;
        BnplInvoiceApiEntity bnplInvoiceApiEntity = this.invoice;
        List<BnplDetailsRepaymentAccountApiEntity> list = this.repaymentAccounts;
        MmmsDetailsApiEntity mmmsDetailsApiEntity = this.mmsDetails;
        return "BnplDetailsApiEntity(loanKey=" + j + ", lndDetails=" + bnplDetailApiEntity + ", plnDetails=" + plnDetailsApiEntity + ", schedule=" + bnplDetailsScheduleApiEntity + ", invoice=" + bnplInvoiceApiEntity + ", repaymentAccounts=" + list + ", mmsDetails=" + mmmsDetailsApiEntity + ")";
    }
}

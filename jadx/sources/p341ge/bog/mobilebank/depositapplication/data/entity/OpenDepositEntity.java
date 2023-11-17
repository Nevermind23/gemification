package p341ge.bog.mobilebank.depositapplication.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.depositapplication.data.entity.OpenDepositEntity */
public final class OpenDepositEntity {
    private final CasResultEntity cas;
    private final DepositsEntity deposits;
    private final StoResultEntity sto;

    public OpenDepositEntity(CasResultEntity casResultEntity, StoResultEntity stoResultEntity, DepositsEntity depositsEntity) {
        this.cas = casResultEntity;
        this.sto = stoResultEntity;
        this.deposits = depositsEntity;
    }

    public static /* synthetic */ OpenDepositEntity copy$default(OpenDepositEntity openDepositEntity, CasResultEntity casResultEntity, StoResultEntity stoResultEntity, DepositsEntity depositsEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            casResultEntity = openDepositEntity.cas;
        }
        if ((i & 2) != 0) {
            stoResultEntity = openDepositEntity.sto;
        }
        if ((i & 4) != 0) {
            depositsEntity = openDepositEntity.deposits;
        }
        return openDepositEntity.copy(casResultEntity, stoResultEntity, depositsEntity);
    }

    public final CasResultEntity component1() {
        return this.cas;
    }

    public final StoResultEntity component2() {
        return this.sto;
    }

    public final DepositsEntity component3() {
        return this.deposits;
    }

    public final OpenDepositEntity copy(CasResultEntity casResultEntity, StoResultEntity stoResultEntity, DepositsEntity depositsEntity) {
        return new OpenDepositEntity(casResultEntity, stoResultEntity, depositsEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenDepositEntity)) {
            return false;
        }
        OpenDepositEntity openDepositEntity = (OpenDepositEntity) obj;
        return C41536l.m120484d(this.cas, openDepositEntity.cas) && C41536l.m120484d(this.sto, openDepositEntity.sto) && C41536l.m120484d(this.deposits, openDepositEntity.deposits);
    }

    public final CasResultEntity getCas() {
        return this.cas;
    }

    public final DepositsEntity getDeposits() {
        return this.deposits;
    }

    public final StoResultEntity getSto() {
        return this.sto;
    }

    public int hashCode() {
        CasResultEntity casResultEntity = this.cas;
        int i = 0;
        int hashCode = (casResultEntity == null ? 0 : casResultEntity.hashCode()) * 31;
        StoResultEntity stoResultEntity = this.sto;
        int hashCode2 = (hashCode + (stoResultEntity == null ? 0 : stoResultEntity.hashCode())) * 31;
        DepositsEntity depositsEntity = this.deposits;
        if (depositsEntity != null) {
            i = depositsEntity.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        CasResultEntity casResultEntity = this.cas;
        StoResultEntity stoResultEntity = this.sto;
        DepositsEntity depositsEntity = this.deposits;
        return "OpenDepositEntity(cas=" + casResultEntity + ", sto=" + stoResultEntity + ", deposits=" + depositsEntity + ")";
    }
}

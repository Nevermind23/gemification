package p341ge.bog.mobilebank.depositapplication.data.entity;

import androidx.annotation.Keep;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.depositapplication.data.entity.CasResultEntity */
public final class CasResultEntity {
    private final YesNoApiEntity openedCAS;

    public CasResultEntity(YesNoApiEntity yesNoApiEntity) {
        this.openedCAS = yesNoApiEntity;
    }

    public static /* synthetic */ CasResultEntity copy$default(CasResultEntity casResultEntity, YesNoApiEntity yesNoApiEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            yesNoApiEntity = casResultEntity.openedCAS;
        }
        return casResultEntity.copy(yesNoApiEntity);
    }

    public final YesNoApiEntity component1() {
        return this.openedCAS;
    }

    public final CasResultEntity copy(YesNoApiEntity yesNoApiEntity) {
        return new CasResultEntity(yesNoApiEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CasResultEntity) && this.openedCAS == ((CasResultEntity) obj).openedCAS;
    }

    public final YesNoApiEntity getOpenedCAS() {
        return this.openedCAS;
    }

    public int hashCode() {
        YesNoApiEntity yesNoApiEntity = this.openedCAS;
        if (yesNoApiEntity == null) {
            return 0;
        }
        return yesNoApiEntity.hashCode();
    }

    public String toString() {
        YesNoApiEntity yesNoApiEntity = this.openedCAS;
        return "CasResultEntity(openedCAS=" + yesNoApiEntity + ")";
    }
}

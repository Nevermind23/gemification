package p341ge.bog.mobilebank.depositapplication.data.entity;

import androidx.annotation.Keep;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.depositapplication.data.entity.StoResultEntity */
public final class StoResultEntity {
    private final YesNoApiEntity openedSTO;

    public StoResultEntity(YesNoApiEntity yesNoApiEntity) {
        this.openedSTO = yesNoApiEntity;
    }

    public static /* synthetic */ StoResultEntity copy$default(StoResultEntity stoResultEntity, YesNoApiEntity yesNoApiEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            yesNoApiEntity = stoResultEntity.openedSTO;
        }
        return stoResultEntity.copy(yesNoApiEntity);
    }

    public final YesNoApiEntity component1() {
        return this.openedSTO;
    }

    public final StoResultEntity copy(YesNoApiEntity yesNoApiEntity) {
        return new StoResultEntity(yesNoApiEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoResultEntity) && this.openedSTO == ((StoResultEntity) obj).openedSTO;
    }

    public final YesNoApiEntity getOpenedSTO() {
        return this.openedSTO;
    }

    public int hashCode() {
        YesNoApiEntity yesNoApiEntity = this.openedSTO;
        if (yesNoApiEntity == null) {
            return 0;
        }
        return yesNoApiEntity.hashCode();
    }

    public String toString() {
        YesNoApiEntity yesNoApiEntity = this.openedSTO;
        return "StoResultEntity(openedSTO=" + yesNoApiEntity + ")";
    }
}

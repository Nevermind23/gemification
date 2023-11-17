package p341ge.bog.mobilebank.lifestyleoffers.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleChooserIsAllowedApiEntity */
public final class LifestyleChooserIsAllowedApiEntity {
    private final YesNoApiEntity value;

    public LifestyleChooserIsAllowedApiEntity(YesNoApiEntity yesNoApiEntity) {
        C41536l.m120489i(yesNoApiEntity, C11755a.C11756a.f34100b);
        this.value = yesNoApiEntity;
    }

    public static /* synthetic */ LifestyleChooserIsAllowedApiEntity copy$default(LifestyleChooserIsAllowedApiEntity lifestyleChooserIsAllowedApiEntity, YesNoApiEntity yesNoApiEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            yesNoApiEntity = lifestyleChooserIsAllowedApiEntity.value;
        }
        return lifestyleChooserIsAllowedApiEntity.copy(yesNoApiEntity);
    }

    public final YesNoApiEntity component1() {
        return this.value;
    }

    public final LifestyleChooserIsAllowedApiEntity copy(YesNoApiEntity yesNoApiEntity) {
        C41536l.m120489i(yesNoApiEntity, C11755a.C11756a.f34100b);
        return new LifestyleChooserIsAllowedApiEntity(yesNoApiEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LifestyleChooserIsAllowedApiEntity) && this.value == ((LifestyleChooserIsAllowedApiEntity) obj).value;
    }

    public final YesNoApiEntity getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        YesNoApiEntity yesNoApiEntity = this.value;
        return "LifestyleChooserIsAllowedApiEntity(value=" + yesNoApiEntity + ")";
    }
}

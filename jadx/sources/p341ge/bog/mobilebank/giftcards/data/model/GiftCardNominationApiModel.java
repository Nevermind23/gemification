package p341ge.bog.mobilebank.giftcards.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.giftcards.data.model.GiftCardNominationApiModel */
public final class GiftCardNominationApiModel {
    private final YesNoApiEntity isValidNomination;

    public GiftCardNominationApiModel(YesNoApiEntity yesNoApiEntity) {
        C41536l.m120489i(yesNoApiEntity, "isValidNomination");
        this.isValidNomination = yesNoApiEntity;
    }

    public static /* synthetic */ GiftCardNominationApiModel copy$default(GiftCardNominationApiModel giftCardNominationApiModel, YesNoApiEntity yesNoApiEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            yesNoApiEntity = giftCardNominationApiModel.isValidNomination;
        }
        return giftCardNominationApiModel.copy(yesNoApiEntity);
    }

    public final YesNoApiEntity component1() {
        return this.isValidNomination;
    }

    public final GiftCardNominationApiModel copy(YesNoApiEntity yesNoApiEntity) {
        C41536l.m120489i(yesNoApiEntity, "isValidNomination");
        return new GiftCardNominationApiModel(yesNoApiEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GiftCardNominationApiModel) && this.isValidNomination == ((GiftCardNominationApiModel) obj).isValidNomination;
    }

    public int hashCode() {
        return this.isValidNomination.hashCode();
    }

    public final YesNoApiEntity isValidNomination() {
        return this.isValidNomination;
    }

    public String toString() {
        YesNoApiEntity yesNoApiEntity = this.isValidNomination;
        return "GiftCardNominationApiModel(isValidNomination=" + yesNoApiEntity + ")";
    }
}

package p341ge.bog.mobilebank.cardapplications.data.entity;

import androidx.annotation.Keep;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.DebitCardTextContainerEntity */
public final class DebitCardTextContainerEntity {
    private final DebitCardTextsEntity digitalCard;
    private final DebitCardTextsEntity plasticCard;

    public DebitCardTextContainerEntity(DebitCardTextsEntity debitCardTextsEntity, DebitCardTextsEntity debitCardTextsEntity2) {
        this.plasticCard = debitCardTextsEntity;
        this.digitalCard = debitCardTextsEntity2;
    }

    public final DebitCardTextsEntity getDigitalCard() {
        return this.digitalCard;
    }

    public final DebitCardTextsEntity getPlasticCard() {
        return this.plasticCard;
    }
}

package p341ge.bog.mobilebank.cleanarch.data.creditapplication.entity;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.creditapplication.entity.CreditOfferDecisionEntity */
public final class CreditOfferDecisionEntity {
    private final ArrayList<CreditOfferEntity> cardInfo;
    private final CreditCardOfferDetailsEntity details;
    private final ArrayList<CreditOfferRefinanceEntity> refinanceInfo;
    private final Integer responseCode;

    public CreditOfferDecisionEntity(ArrayList<CreditOfferEntity> arrayList, ArrayList<CreditOfferRefinanceEntity> arrayList2, CreditCardOfferDetailsEntity creditCardOfferDetailsEntity, Integer num) {
        this.cardInfo = arrayList;
        this.refinanceInfo = arrayList2;
        this.details = creditCardOfferDetailsEntity;
        this.responseCode = num;
    }

    public static /* synthetic */ CreditOfferDecisionEntity copy$default(CreditOfferDecisionEntity creditOfferDecisionEntity, ArrayList<CreditOfferEntity> arrayList, ArrayList<CreditOfferRefinanceEntity> arrayList2, CreditCardOfferDetailsEntity creditCardOfferDetailsEntity, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = creditOfferDecisionEntity.cardInfo;
        }
        if ((i & 2) != 0) {
            arrayList2 = creditOfferDecisionEntity.refinanceInfo;
        }
        if ((i & 4) != 0) {
            creditCardOfferDetailsEntity = creditOfferDecisionEntity.details;
        }
        if ((i & 8) != 0) {
            num = creditOfferDecisionEntity.responseCode;
        }
        return creditOfferDecisionEntity.copy(arrayList, arrayList2, creditCardOfferDetailsEntity, num);
    }

    public final ArrayList<CreditOfferEntity> component1() {
        return this.cardInfo;
    }

    public final ArrayList<CreditOfferRefinanceEntity> component2() {
        return this.refinanceInfo;
    }

    public final CreditCardOfferDetailsEntity component3() {
        return this.details;
    }

    public final Integer component4() {
        return this.responseCode;
    }

    public final CreditOfferDecisionEntity copy(ArrayList<CreditOfferEntity> arrayList, ArrayList<CreditOfferRefinanceEntity> arrayList2, CreditCardOfferDetailsEntity creditCardOfferDetailsEntity, Integer num) {
        return new CreditOfferDecisionEntity(arrayList, arrayList2, creditCardOfferDetailsEntity, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditOfferDecisionEntity)) {
            return false;
        }
        CreditOfferDecisionEntity creditOfferDecisionEntity = (CreditOfferDecisionEntity) obj;
        return C41536l.m120484d(this.cardInfo, creditOfferDecisionEntity.cardInfo) && C41536l.m120484d(this.refinanceInfo, creditOfferDecisionEntity.refinanceInfo) && C41536l.m120484d(this.details, creditOfferDecisionEntity.details) && C41536l.m120484d(this.responseCode, creditOfferDecisionEntity.responseCode);
    }

    public final ArrayList<CreditOfferEntity> getCardInfo() {
        return this.cardInfo;
    }

    public final CreditCardOfferDetailsEntity getDetails() {
        return this.details;
    }

    public final ArrayList<CreditOfferRefinanceEntity> getRefinanceInfo() {
        return this.refinanceInfo;
    }

    public final Integer getResponseCode() {
        return this.responseCode;
    }

    public int hashCode() {
        ArrayList<CreditOfferEntity> arrayList = this.cardInfo;
        int i = 0;
        int hashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        ArrayList<CreditOfferRefinanceEntity> arrayList2 = this.refinanceInfo;
        int hashCode2 = (hashCode + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        CreditCardOfferDetailsEntity creditCardOfferDetailsEntity = this.details;
        int hashCode3 = (hashCode2 + (creditCardOfferDetailsEntity == null ? 0 : creditCardOfferDetailsEntity.hashCode())) * 31;
        Integer num = this.responseCode;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        ArrayList<CreditOfferEntity> arrayList = this.cardInfo;
        ArrayList<CreditOfferRefinanceEntity> arrayList2 = this.refinanceInfo;
        CreditCardOfferDetailsEntity creditCardOfferDetailsEntity = this.details;
        Integer num = this.responseCode;
        return "CreditOfferDecisionEntity(cardInfo=" + arrayList + ", refinanceInfo=" + arrayList2 + ", details=" + creditCardOfferDetailsEntity + ", responseCode=" + num + ")";
    }
}

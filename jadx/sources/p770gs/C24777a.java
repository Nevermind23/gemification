package p770gs;

import hd0.C24978b;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.creditapplication.entity.CreditCardOfferDetailsEntity;
import p341ge.bog.mobilebank.cleanarch.data.creditapplication.entity.CreditOfferDecisionEntity;
import p341ge.bog.mobilebank.cleanarch.data.creditapplication.entity.CreditOfferEntity;
import p341ge.bog.mobilebank.cleanarch.data.creditapplication.entity.CreditOfferRefinanceEntity;
import p341ge.bog.mobilebank.cleanarch.data.creditapplication.entity.ProductSourceEntity;
import p913uu.C28935a;
import p913uu.C28936b;
import p913uu.C28937c;
import p913uu.C28939e;
import p913uu.C28940f;
import p913uu.C28941g;
import p913uu.C28944i;

/* renamed from: gs.a */
public final class C24777a {
    /* renamed from: a */
    public final C28937c mo63190a(CreditCardOfferDetailsEntity creditCardOfferDetailsEntity) {
        C41536l.m120489i(creditCardOfferDetailsEntity, "creditCardOfferDetailsEntity");
        return new C28937c(creditCardOfferDetailsEntity.getIrr2Purchase(), creditCardOfferDetailsEntity.getCardName(), creditCardOfferDetailsEntity.getRatePurchase(), creditCardOfferDetailsEntity.getPeriodUnit(), creditCardOfferDetailsEntity.getOverCancelRate(), creditCardOfferDetailsEntity.getAccessType(), creditCardOfferDetailsEntity.getOverdueSoftRate(), creditCardOfferDetailsEntity.getWithdrawalAmount(), creditCardOfferDetailsEntity.getDecisionNo(), creditCardOfferDetailsEntity.getNewCardIconBase64(), creditCardOfferDetailsEntity.getDecisionScheme(), creditCardOfferDetailsEntity.getCardClass(), creditCardOfferDetailsEntity.getCardLimit(), creditCardOfferDetailsEntity.getIrrWithdrawal(), creditCardOfferDetailsEntity.getRateWithdrawal(), creditCardOfferDetailsEntity.getCardType(), creditCardOfferDetailsEntity.getCardCcy(), creditCardOfferDetailsEntity.getOverPenaltyRate(), creditCardOfferDetailsEntity.getComisAmount(), creditCardOfferDetailsEntity.getFeeAmount(), creditCardOfferDetailsEntity.getTemplCode(), creditCardOfferDetailsEntity.getIrrPurchase(), creditCardOfferDetailsEntity.getOverdueHardRate(), creditCardOfferDetailsEntity.getIrr2Withdrawal(), creditCardOfferDetailsEntity.getOperationType(), creditCardOfferDetailsEntity.getPeriodLength(), creditCardOfferDetailsEntity.getOverdueHard(), creditCardOfferDetailsEntity.getOverdueSoft(), creditCardOfferDetailsEntity.getDisbursementAmount(), creditCardOfferDetailsEntity.getDisbursementAmount2(), creditCardOfferDetailsEntity.getCardLast4(), creditCardOfferDetailsEntity.getCardTypeDictionaryKey(), creditCardOfferDetailsEntity.getOfferDetailsText(), creditCardOfferDetailsEntity.getOfferMainText());
    }

    /* renamed from: b */
    public final C28939e mo63191b(CreditOfferEntity creditOfferEntity) {
        C41536l.m120489i(creditOfferEntity, "creditOfferEntity");
        return new C28939e(creditOfferEntity.getCardName(), creditOfferEntity.getCardType(), creditOfferEntity.getCardCcy(), creditOfferEntity.getComisCcy(), creditOfferEntity.getProductKey(), creditOfferEntity.getPeriodUnit(), creditOfferEntity.getComisAmount(), creditOfferEntity.getTemplCode(), creditOfferEntity.getPeriodLength(), creditOfferEntity.getCardClass(), creditOfferEntity.getCardGroup(), creditOfferEntity.getLimitMin(), creditOfferEntity.getLimitMax(), creditOfferEntity.getCardLimit(), creditOfferEntity.getCreditLimit());
    }

    /* renamed from: c */
    public final C28940f mo63192c(CreditOfferDecisionEntity creditOfferDecisionEntity) {
        C28939e eVar;
        ArrayList arrayList;
        C41536l.m120489i(creditOfferDecisionEntity, "creditOfferDecisionEntity");
        ArrayList<CreditOfferEntity> cardInfo = creditOfferDecisionEntity.getCardInfo();
        C28937c cVar = null;
        if (cardInfo != null) {
            CreditOfferEntity creditOfferEntity = cardInfo.get(0);
            C41536l.m120488h(creditOfferEntity, "it[0]");
            eVar = mo63191b(creditOfferEntity);
        } else {
            eVar = null;
        }
        ArrayList<CreditOfferRefinanceEntity> refinanceInfo = creditOfferDecisionEntity.getRefinanceInfo();
        if (refinanceInfo != null) {
            arrayList = new ArrayList(C41343r.m119925u(refinanceInfo, 10));
            for (CreditOfferRefinanceEntity d : refinanceInfo) {
                arrayList.add(mo63193d(d));
            }
        } else {
            arrayList = null;
        }
        CreditCardOfferDetailsEntity details = creditOfferDecisionEntity.getDetails();
        if (details != null) {
            cVar = mo63190a(details);
        }
        return new C28940f(eVar, arrayList, cVar, creditOfferDecisionEntity.getResponseCode());
    }

    /* renamed from: d */
    public final C28941g mo63193d(CreditOfferRefinanceEntity creditOfferRefinanceEntity) {
        C28944i iVar;
        String name;
        C41536l.m120489i(creditOfferRefinanceEntity, "refinanceEntity");
        ProductSourceEntity productSource = creditOfferRefinanceEntity.getProductSource();
        if (productSource == null || (name = productSource.name()) == null) {
            iVar = null;
        } else {
            iVar = C28944i.valueOf(name);
        }
        return new C28941g(iVar, creditOfferRefinanceEntity.getProductClass(), creditOfferRefinanceEntity.getProductKey(), creditOfferRefinanceEntity.getProductDictionaryKey(), creditOfferRefinanceEntity.getProductName(), creditOfferRefinanceEntity.getProductInitAmt(), creditOfferRefinanceEntity.getProductAmount(), creditOfferRefinanceEntity.getDesireRefFlag(), creditOfferRefinanceEntity.getOldCardIconBase64(), creditOfferRefinanceEntity.getProductCode(), creditOfferRefinanceEntity.getProductPmt(), C24978b.valueOf(creditOfferRefinanceEntity.getProductRefFlag().name()), creditOfferRefinanceEntity.getProductCcy(), creditOfferRefinanceEntity.getProductType(), creditOfferRefinanceEntity.getProductNo(), creditOfferRefinanceEntity.getProductCreditorName(), C24978b.valueOf(creditOfferRefinanceEntity.isCreditorIdentified().name()), creditOfferRefinanceEntity.isRefinanceMandatory());
    }

    /* renamed from: e */
    public final C28935a mo63194e(CreditOfferDecisionEntity creditOfferDecisionEntity) {
        C41536l.m120489i(creditOfferDecisionEntity, "decision");
        CreditCardOfferDetailsEntity details = creditOfferDecisionEntity.getDetails();
        C41536l.m120486f(details);
        return new C28935a(mo63195f(details));
    }

    /* renamed from: f */
    public final C28936b mo63195f(CreditCardOfferDetailsEntity creditCardOfferDetailsEntity) {
        C41536l.m120489i(creditCardOfferDetailsEntity, "details");
        BigDecimal cardLimit = creditCardOfferDetailsEntity.getCardLimit();
        C41536l.m120486f(cardLimit);
        String cardCcy = creditCardOfferDetailsEntity.getCardCcy();
        C41536l.m120486f(cardCcy);
        return new C28936b(cardLimit, cardCcy, creditCardOfferDetailsEntity.getDisbursementAmount(), creditCardOfferDetailsEntity.getDisbursementAmount2());
    }
}

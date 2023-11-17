package rh0;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.giftcards.data.model.BffExternalFileApiModel;
import p341ge.bog.mobilebank.giftcards.data.model.ClientGiftCardApiModel;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfig;
import xh0.C29780a;
import xh0.C29789f;

/* renamed from: rh0.c */
public final class C28036c {

    /* renamed from: a */
    private final C28035b f71393a;

    public C28036c(C28035b bVar) {
        C41536l.m120489i(bVar, "bffExternalFileMapper");
        this.f71393a = bVar;
    }

    /* renamed from: b */
    private final C29789f m86430b(ClientGiftCardApiModel clientGiftCardApiModel) {
        boolean z;
        boolean z2;
        C29780a aVar;
        long giftCardId = clientGiftCardApiModel.getGiftCardId();
        BigDecimal availableAmount = clientGiftCardApiModel.getAvailableAmount();
        String cardDesignStorageId = clientGiftCardApiModel.getCardDesignStorageId();
        Long cardExpirationDate = clientGiftCardApiModel.getCardExpirationDate();
        String ccy = clientGiftCardApiModel.getCcy();
        String giftCardPaymentCode = clientGiftCardApiModel.getGiftCardPaymentCode();
        Boolean giftCardSeen = clientGiftCardApiModel.getGiftCardSeen();
        if (giftCardSeen != null) {
            z = giftCardSeen.booleanValue();
        } else {
            z = true;
        }
        boolean z3 = z;
        String giftText = clientGiftCardApiModel.getGiftText();
        Boolean canGiveAwayCard = clientGiftCardApiModel.getCanGiveAwayCard();
        if (canGiveAwayCard != null) {
            z2 = canGiveAwayCard.booleanValue();
        } else {
            z2 = false;
        }
        boolean z4 = z2;
        List<String> offerBrandList = clientGiftCardApiModel.getOfferBrandList();
        if (offerBrandList == null) {
            offerBrandList = C41341q.m119907j();
        }
        List<String> list = offerBrandList;
        String offerLogoStorageId = clientGiftCardApiModel.getOfferLogoStorageId();
        String offerLogoStorageUrl = clientGiftCardApiModel.getOfferLogoStorageUrl();
        String offerName = clientGiftCardApiModel.getOfferName();
        String offerNameInt = clientGiftCardApiModel.getOfferNameInt();
        BigDecimal primaryAmount = clientGiftCardApiModel.getPrimaryAmount();
        String srcClientFirstName = clientGiftCardApiModel.getSrcClientFirstName();
        String srcClientLastname = clientGiftCardApiModel.getSrcClientLastname();
        Long clientKey = clientGiftCardApiModel.getClientKey();
        String ownerMobilePhone = clientGiftCardApiModel.getOwnerMobilePhone();
        BigDecimal usedAmount = clientGiftCardApiModel.getUsedAmount();
        BffExternalFileApiModel externalFile = clientGiftCardApiModel.getExternalFile();
        String str = offerName;
        String str2 = offerNameInt;
        if (externalFile != null) {
            aVar = this.f71393a.mo67574a(externalFile);
        } else {
            aVar = null;
        }
        return new C29789f(giftCardId, availableAmount, cardDesignStorageId, cardExpirationDate, ccy, giftCardPaymentCode, z3, giftText, z4, list, offerLogoStorageId, offerLogoStorageUrl, str, str2, primaryAmount, srcClientFirstName, srcClientLastname, clientKey, ownerMobilePhone, usedAmount, aVar);
    }

    /* renamed from: a */
    public final List mo67576a(List list) {
        C41536l.m120489i(list, PaymentServiceConfig.TYPE_GIFT_CARD);
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m86430b((ClientGiftCardApiModel) it.next()));
        }
        return arrayList;
    }
}

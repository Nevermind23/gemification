package p341ge.bog.mobilebank.products.data.mapper;

import he1.C41224m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import o70.C26762a;
import o70.C26763b;
import o70.C26764c;
import o70.C26765d;
import o70.C26766e;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.cleanarch.shareddomain.model.cards.CardInsSecCardModel;
import p341ge.bog.mobilebank.products.data.model.CardApiModel;
import p341ge.bog.mobilebank.products.data.model.CardBlockStatusApiModel;
import p341ge.bog.mobilebank.products.data.model.CardExternalFileApiModel;
import p341ge.bog.mobilebank.products.data.model.CardExtraDetailsApiModel;
import p341ge.bog.mobilebank.products.data.model.CardInsSecCardApiModel;
import p341ge.bog.mobilebank.products.data.model.CardsAndDetailsApiModel;
import p341ge.bog.mobilebank.products.data.model.YesNoApiModel;

/* renamed from: ge.bog.mobilebank.products.data.mapper.CardsAndDetailsApiModelMapper */
public final class CardsAndDetailsApiModelMapper {
    private final C26763b transform(CardExternalFileApiModel cardExternalFileApiModel, String str) {
        boolean d = C41536l.m120484d(cardExternalFileApiModel.isDark(), "Y");
        String fileUrl = cardExternalFileApiModel.getFileUrl();
        String fileType = cardExternalFileApiModel.getFileType();
        String fileSubType = cardExternalFileApiModel.getFileSubType();
        if (fileSubType != null) {
            str = fileSubType;
        }
        return new C26763b(d, fileUrl, fileType, str);
    }

    public final C26766e convert(CardsAndDetailsApiModel cardsAndDetailsApiModel) {
        C41536l.m120489i(cardsAndDetailsApiModel, "data");
        Set<Map.Entry<Long, ArrayList<CardApiModel>>> entrySet = cardsAndDetailsApiModel.getCards().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C43429k.m124585d(C41342q0.m119921f(C41343r.m119925u(entrySet, 10)), 16));
        for (Map.Entry convert : entrySet) {
            C41224m convert2 = convert((Map.Entry<Long, ? extends List<CardApiModel>>) convert, cardsAndDetailsApiModel.getInsSecCards());
            linkedHashMap.put(convert2.mo95678e(), convert2.mo95680f());
        }
        return new C26766e(linkedHashMap);
    }

    private final CardInsSecCardModel convert(CardInsSecCardApiModel cardInsSecCardApiModel) {
        long cardId = cardInsSecCardApiModel.getCardId();
        long acctKey = cardInsSecCardApiModel.getAcctKey();
        String cardName = cardInsSecCardApiModel.getCardName();
        String subProductCode = cardInsSecCardApiModel.getSubProductCode();
        String lastFour = cardInsSecCardApiModel.getLastFour();
        String dictionaryKey = cardInsSecCardApiModel.getDictionaryKey();
        String insuranceId = cardInsSecCardApiModel.getInsuranceId();
        Long insuranceNo = cardInsSecCardApiModel.getInsuranceNo();
        String insuranceType = cardInsSecCardApiModel.getInsuranceType();
        String insuranceTypeKey = cardInsSecCardApiModel.getInsuranceTypeKey();
        YesNoApiModel insAllow = cardInsSecCardApiModel.getInsAllow();
        YesNoApiModel yesNoApiModel = YesNoApiModel.YES;
        return new CardInsSecCardModel(cardId, acctKey, cardName, subProductCode, lastFour, dictionaryKey, insuranceId, insuranceNo, insuranceType, insuranceTypeKey, insAllow == yesNoApiModel, cardInsSecCardApiModel.getSec3D() == yesNoApiModel, cardInsSecCardApiModel.getMobile(), cardInsSecCardApiModel.getDgPassYN() == yesNoApiModel, cardInsSecCardApiModel.getSecAllow() == yesNoApiModel, cardInsSecCardApiModel.isScoolcard() == yesNoApiModel, cardInsSecCardApiModel.getDictionaryValue(), cardInsSecCardApiModel.getDigipassAllow() == yesNoApiModel, cardInsSecCardApiModel.getAttachmentFileBase64(), cardInsSecCardApiModel.getNextChargeDate());
    }

    private final C41224m convert(Map.Entry<Long, ? extends List<CardApiModel>> entry, List<CardInsSecCardApiModel> list) {
        Long key = entry.getKey();
        Iterable<CardApiModel> iterable = (Iterable) entry.getValue();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(iterable, 10));
        for (CardApiModel convert : iterable) {
            arrayList.add(convert(convert, list));
        }
        return new C41224m(key, arrayList);
    }

    private final C26765d convert(CardApiModel cardApiModel, List<CardInsSecCardApiModel> list) {
        String str;
        String str2;
        T t;
        boolean z;
        long id = cardApiModel.getId();
        YesNoApiModel closeCard = cardApiModel.getCloseCard();
        YesNoApiModel yesNoApiModel = YesNoApiModel.YES;
        boolean z2 = closeCard == yesNoApiModel;
        long cardId = cardApiModel.getCardId();
        long acctKey = cardApiModel.getAcctKey();
        long clientKey = cardApiModel.getClientKey();
        String cardClass = cardApiModel.getCardClass();
        String cardClassCode = cardApiModel.getCardClassCode();
        String str3 = cardClassCode == null ? "" : cardClassCode;
        String cardName = cardApiModel.getCardName();
        if (cardName == null) {
            str = "";
        } else {
            str = cardName;
        }
        String cardType = cardApiModel.getCardType();
        String productCode = cardApiModel.getProductCode();
        String subProductCode = cardApiModel.getSubProductCode();
        String subProductGroup = cardApiModel.getSubProductGroup();
        String status = cardApiModel.getStatus();
        String lastFour = cardApiModel.getLastFour();
        if (lastFour == null) {
            str2 = "";
        } else {
            str2 = lastFour;
        }
        String cardHolder = cardApiModel.getCardHolder();
        long expDate = cardApiModel.getExpDate();
        String cardPan = cardApiModel.getCardPan();
        String cardForTypeDictionaryKey = cardApiModel.getCardForTypeDictionaryKey();
        String cardForTypeDictionaryValue = cardApiModel.getCardForTypeDictionaryValue();
        String productGroup = cardApiModel.getProductGroup();
        boolean z3 = cardApiModel.isDigitalCard() == yesNoApiModel;
        long productId = cardApiModel.getProductId();
        long subProductId = cardApiModel.getSubProductId();
        boolean z4 = cardApiModel.isDefault() == yesNoApiModel;
        boolean z5 = cardApiModel.isHidden() == yesNoApiModel;
        boolean z6 = cardApiModel.isCardExpiring() == yesNoApiModel;
        boolean z7 = cardApiModel.isCardInactive() == yesNoApiModel;
        String attachmentFileBase64 = cardApiModel.getAttachmentFileBase64();
        String nameDictionaryKey = cardApiModel.getNameDictionaryKey();
        String nameDictionaryValue = cardApiModel.getNameDictionaryValue();
        Object cardInsSecEntity = cardApiModel.getCardInsSecEntity();
        boolean isPrimary = cardApiModel.isPrimary();
        String description = cardApiModel.getDescription();
        String paymentNetwork = cardApiModel.getPaymentNetwork();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((CardInsSecCardApiModel) t).getCardId() == cardApiModel.getCardId()) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        CardInsSecCardApiModel cardInsSecCardApiModel = (CardInsSecCardApiModel) t;
        CardInsSecCardModel convert = cardInsSecCardApiModel != null ? convert(cardInsSecCardApiModel) : null;
        YesNoApiModel isScoolcard = cardApiModel.isScoolcard();
        YesNoApiModel yesNoApiModel2 = YesNoApiModel.YES;
        boolean z8 = isScoolcard == yesNoApiModel2;
        CardExternalFileApiModel externalFile = cardApiModel.getExternalFile();
        C26763b transform = externalFile != null ? transform(externalFile, cardApiModel.getSubProductCode()) : null;
        CardExternalFileApiModel cardExternalFile = cardApiModel.getCardExternalFile();
        C26763b transform2 = cardExternalFile != null ? transform(cardExternalFile, cardApiModel.getSubProductCode()) : null;
        String cardPdfUrl = cardApiModel.getCardPdfUrl();
        boolean z9 = cardApiModel.getOrderRecoverCard() == yesNoApiModel2;
        YesNoApiEntity orderExpiredCard = cardApiModel.getOrderExpiredCard();
        YesNoApiEntity yesNoApiEntity = YesNoApiEntity.YES;
        return new C26765d(id, z2, cardId, acctKey, clientKey, cardClass, str3, str, cardType, productCode, subProductCode, subProductGroup, status, str2, cardHolder, expDate, cardPan, cardForTypeDictionaryKey, cardForTypeDictionaryValue, productGroup, z3, productId, subProductId, z4, z5, z6, z7, attachmentFileBase64, nameDictionaryKey, nameDictionaryValue, cardInsSecEntity, isPrimary, description, paymentNetwork, convert, z8, transform, transform2, cardPdfUrl, z9, orderExpiredCard == yesNoApiEntity, cardApiModel.getGooglePay() == yesNoApiEntity, cardApiModel.getDailyLimitType(), cardApiModel.getCardOwnerClientKey(), cardApiModel.getVcPlasticStatus());
    }

    public final C26762a convert(CardBlockStatusApiModel cardBlockStatusApiModel) {
        C41536l.m120489i(cardBlockStatusApiModel, "data");
        return new C26762a(cardBlockStatusApiModel.getCardId(), cardBlockStatusApiModel.isCardBlocked() == YesNoApiModel.YES);
    }

    public final C26764c convert(CardExtraDetailsApiModel cardExtraDetailsApiModel) {
        C41536l.m120489i(cardExtraDetailsApiModel, "data");
        return new C26764c(cardExtraDetailsApiModel.getCardCVC2(), cardExtraDetailsApiModel.getCardNumber());
    }
}

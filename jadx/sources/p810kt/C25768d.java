package p810kt;

import hd0.C24978b;
import he1.C41224m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.CardApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.CardBlockStatusApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.CardExternalFileEntity;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.CardInsSecCardApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.CardsAndDetailsApiEntity;
import p341ge.bog.mobilebank.cleanarch.domain.products.model.CardBlockStatus;
import p341ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile;
import p717bs.C19401a;
import p863pw.C27635m;
import p863pw.C27636n;
import p863pw.C27637o;

/* renamed from: kt.d */
public final class C25768d {
    /* renamed from: a */
    public final CardBlockStatus mo64359a(CardBlockStatusApiEntity cardBlockStatusApiEntity) {
        C41536l.m120489i(cardBlockStatusApiEntity, "data");
        return new CardBlockStatus(cardBlockStatusApiEntity.getCardId(), C19401a.m64892a(cardBlockStatusApiEntity.isCardBlocked()));
    }

    /* renamed from: b */
    public final C41224m mo64360b(Map.Entry entry, List list) {
        C41536l.m120489i(entry, "entity");
        C41536l.m120489i(list, "insSecCards");
        Object key = entry.getKey();
        Iterable<CardApiEntity> iterable = (Iterable) entry.getValue();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(iterable, 10));
        for (CardApiEntity c : iterable) {
            arrayList.add(mo64361c(c, list));
        }
        return new C41224m(key, arrayList);
    }

    /* renamed from: c */
    public final C27635m mo64361c(CardApiEntity cardApiEntity, List list) {
        C24978b bVar;
        String str;
        Object obj;
        C27636n nVar;
        boolean z;
        boolean z2;
        String str2;
        String str3;
        YesNoApiEntity yesNoApiEntity;
        boolean z3;
        String str4;
        String str5;
        String str6;
        YesNoApiEntity yesNoApiEntity2;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        C41536l.m120489i(cardApiEntity, "data");
        C41536l.m120489i(list, "insSecCards");
        long id = cardApiEntity.getId();
        long cardId = cardApiEntity.getCardId();
        long acctKey = cardApiEntity.getAcctKey();
        long clientKey = cardApiEntity.getClientKey();
        String cardClass = cardApiEntity.getCardClass();
        String cardName = cardApiEntity.getCardName();
        String cardType = cardApiEntity.getCardType();
        String productCode = cardApiEntity.getProductCode();
        String subProductCode = cardApiEntity.getSubProductCode();
        String subProductGroup = cardApiEntity.getSubProductGroup();
        String status = cardApiEntity.getStatus();
        String lastFour = cardApiEntity.getLastFour();
        String cardHolder = cardApiEntity.getCardHolder();
        long expDate = cardApiEntity.getExpDate();
        String cardPan = cardApiEntity.getCardPan();
        String cardForTypeDictionaryKey = cardApiEntity.getCardForTypeDictionaryKey();
        String cardForTypeDictionaryValue = cardApiEntity.getCardForTypeDictionaryValue();
        String productGroup = cardApiEntity.getProductGroup();
        YesNoApiEntity isDigitalCard = cardApiEntity.isDigitalCard();
        if (isDigitalCard == null || (bVar = C19401a.m64892a(isDigitalCard)) == null) {
            bVar = C24978b.NO;
        }
        C24978b bVar2 = bVar;
        long productId = cardApiEntity.getProductId();
        long subProductId = cardApiEntity.getSubProductId();
        C24978b a = C19401a.m64892a(cardApiEntity.isDefault());
        C24978b a2 = C19401a.m64892a(cardApiEntity.isHidden());
        C24978b a3 = C19401a.m64892a(cardApiEntity.isCardExpiring());
        C24978b a4 = C19401a.m64892a(cardApiEntity.isCardInactive());
        String attachmentFileBase64 = cardApiEntity.getAttachmentFileBase64();
        String nameDictionaryKey = cardApiEntity.getNameDictionaryKey();
        String nameDictionaryValue = cardApiEntity.getNameDictionaryValue();
        Object cardInsSecEntity = cardApiEntity.getCardInsSecEntity();
        boolean isPrimary = cardApiEntity.isPrimary();
        String dailyLimitType = cardApiEntity.getDailyLimitType();
        String description = cardApiEntity.getDescription();
        String paymentNetwork = cardApiEntity.getPaymentNetwork();
        Iterator it = list.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((CardInsSecCardApiEntity) obj).getCardId() == cardApiEntity.getCardId()) {
                z7 = true;
                continue;
            } else {
                z7 = false;
                continue;
            }
            if (z7) {
                break;
            }
        }
        CardInsSecCardApiEntity cardInsSecCardApiEntity = (CardInsSecCardApiEntity) obj;
        String str7 = subProductGroup;
        if (cardInsSecCardApiEntity != null) {
            nVar = mo64362d(cardInsSecCardApiEntity);
        } else {
            nVar = null;
        }
        YesNoApiEntity isScoolcard = cardApiEntity.isScoolcard();
        YesNoApiEntity yesNoApiEntity3 = YesNoApiEntity.YES;
        if (isScoolcard == yesNoApiEntity3) {
            z = true;
        } else {
            z = false;
        }
        if (cardApiEntity.getCloseCard() == yesNoApiEntity3) {
            z2 = true;
        } else {
            z2 = false;
        }
        String cardPdfUrl = cardApiEntity.getCardPdfUrl();
        CardExternalFileEntity externalFile = cardApiEntity.getExternalFile();
        if (externalFile == null || (str2 = externalFile.getFileSubType()) == null) {
            str2 = cardApiEntity.getSubProductCode();
        }
        String str8 = str2;
        CardExternalFileEntity externalFile2 = cardApiEntity.getExternalFile();
        if (externalFile2 != null) {
            YesNoApiEntity isDark = externalFile2.isDark();
            str3 = subProductCode;
            yesNoApiEntity = isDark;
        } else {
            str3 = subProductCode;
            yesNoApiEntity = null;
        }
        if (yesNoApiEntity == yesNoApiEntity3) {
            z3 = true;
        } else {
            z3 = false;
        }
        CardExternalFileEntity externalFile3 = cardApiEntity.getExternalFile();
        if (externalFile3 != null) {
            String fileUrl = externalFile3.getFileUrl();
            str4 = productCode;
            str5 = fileUrl;
        } else {
            str4 = productCode;
            str5 = null;
        }
        CardExternalFile cardExternalFile = new CardExternalFile(str8, z3, str5);
        CardExternalFileEntity cardExternalFile2 = cardApiEntity.getCardExternalFile();
        if (cardExternalFile2 == null || (str6 = cardExternalFile2.getFileSubType()) == null) {
            str6 = cardApiEntity.getSubProductCode();
        }
        CardExternalFileEntity cardExternalFile3 = cardApiEntity.getCardExternalFile();
        if (cardExternalFile3 != null) {
            yesNoApiEntity2 = cardExternalFile3.isDark();
        } else {
            yesNoApiEntity2 = null;
        }
        if (yesNoApiEntity2 == yesNoApiEntity3) {
            z4 = true;
        } else {
            z4 = false;
        }
        CardExternalFileEntity cardExternalFile4 = cardApiEntity.getCardExternalFile();
        if (cardExternalFile4 != null) {
            str = cardExternalFile4.getFileUrl();
        }
        CardExternalFile cardExternalFile5 = cardExternalFile;
        CardExternalFile cardExternalFile6 = new CardExternalFile(str6, z4, str);
        String cardClassCode = cardApiEntity.getCardClassCode();
        if (cardApiEntity.getOrderRecoverCard() == yesNoApiEntity3) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (cardApiEntity.getGooglePay() == yesNoApiEntity3) {
            z6 = true;
        } else {
            z6 = false;
        }
        return new C27635m(id, cardId, acctKey, clientKey, cardClass, cardName, cardType, str4, str3, str7, dailyLimitType, status, lastFour, cardHolder, expDate, cardPan, cardForTypeDictionaryKey, cardForTypeDictionaryValue, productGroup, bVar2, productId, subProductId, a, a2, a3, a4, attachmentFileBase64, nameDictionaryKey, nameDictionaryValue, cardInsSecEntity, isPrimary, description, paymentNetwork, nVar, z, z2, cardPdfUrl, cardExternalFile6, cardExternalFile5, cardClassCode, z5, z6);
    }

    /* renamed from: d */
    public final C27636n mo64362d(CardInsSecCardApiEntity cardInsSecCardApiEntity) {
        C24978b bVar;
        C41536l.m120489i(cardInsSecCardApiEntity, "data");
        long cardId = cardInsSecCardApiEntity.getCardId();
        long acctKey = cardInsSecCardApiEntity.getAcctKey();
        String cardName = cardInsSecCardApiEntity.getCardName();
        String subProductCode = cardInsSecCardApiEntity.getSubProductCode();
        String lastFour = cardInsSecCardApiEntity.getLastFour();
        String dictionaryKey = cardInsSecCardApiEntity.getDictionaryKey();
        String insuranceId = cardInsSecCardApiEntity.getInsuranceId();
        Long insuranceNo = cardInsSecCardApiEntity.getInsuranceNo();
        String insuranceType = cardInsSecCardApiEntity.getInsuranceType();
        String insuranceTypeKey = cardInsSecCardApiEntity.getInsuranceTypeKey();
        C24978b a = C19401a.m64892a(cardInsSecCardApiEntity.getInsAllow());
        C24978b a2 = C19401a.m64892a(cardInsSecCardApiEntity.getSec3D());
        String mobile = cardInsSecCardApiEntity.getMobile();
        C24978b a3 = C19401a.m64892a(cardInsSecCardApiEntity.getDgPassYN());
        YesNoApiEntity secAllow = cardInsSecCardApiEntity.getSecAllow();
        if (secAllow != null) {
            bVar = C19401a.m64892a(secAllow);
        } else {
            bVar = null;
        }
        return new C27636n(cardId, acctKey, cardName, subProductCode, lastFour, dictionaryKey, insuranceId, insuranceNo, insuranceType, insuranceTypeKey, a, a2, mobile, a3, bVar, C19401a.m64892a(cardInsSecCardApiEntity.isScoolcard()), cardInsSecCardApiEntity.getDictionaryValue(), C19401a.m64892a(cardInsSecCardApiEntity.getDigipassAllow()), cardInsSecCardApiEntity.getAttachmentFileBase64(), cardInsSecCardApiEntity.getNextChargeDate());
    }

    /* renamed from: e */
    public final C27637o mo64363e(CardsAndDetailsApiEntity cardsAndDetailsApiEntity) {
        C41536l.m120489i(cardsAndDetailsApiEntity, "data");
        Set<Map.Entry<Long, ArrayList<CardApiEntity>>> entrySet = cardsAndDetailsApiEntity.getCards().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C43429k.m124585d(C41342q0.m119921f(C41343r.m119925u(entrySet, 10)), 16));
        for (Map.Entry b : entrySet) {
            C41224m b2 = mo64360b(b, cardsAndDetailsApiEntity.getInsSecCards());
            linkedHashMap.put(b2.mo95678e(), b2.mo95680f());
        }
        return new C27637o(linkedHashMap);
    }
}

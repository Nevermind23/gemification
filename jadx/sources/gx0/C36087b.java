package gx0;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import lx0.C37176a;
import lx0.C37177b;
import lx0.C37179d;
import lx0.C37180e;
import lx0.C37181f;
import lx0.C37182g;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.payments.data.model.CardImageApiModel;
import p341ge.bog.mobilebank.payments.data.model.ExecuteResultApiModel;
import p341ge.bog.mobilebank.payments.data.model.KeyValueApiModel;
import p341ge.bog.mobilebank.payments.data.model.PaymentCardApiModel;
import p341ge.bog.mobilebank.payments.data.model.PaymentCommissionApiModel;
import p341ge.bog.mobilebank.payments.data.model.PaymentDebtApiModel;
import p341ge.bog.mobilebank.payments.data.model.PaymentPackageObjectApiModel;
import p341ge.bog.mobilebank.payments.data.model.PaymentResponseApiModel;
import p341ge.bog.mobilebank.payments.data.model.PrizeApiModel;
import p341ge.bog.mobilebank.payments.domain.model.CardImage;
import p341ge.bog.mobilebank.payments.domain.model.KeyValue;
import p341ge.bog.mobilebank.payments.domain.model.PaymentCard;
import s31.C38421a;

/* renamed from: gx0.b */
public final class C36087b {
    /* renamed from: a */
    private final CardImage m107361a(CardImageApiModel cardImageApiModel) {
        boolean z;
        Long id = cardImageApiModel.getId();
        String channelCode = cardImageApiModel.getChannelCode();
        String languageCode = cardImageApiModel.getLanguageCode();
        String fileType = cardImageApiModel.getFileType();
        String fileSubType = cardImageApiModel.getFileSubType();
        String extFileId = cardImageApiModel.getExtFileId();
        if (cardImageApiModel.isDark() == YesNoApiEntity.YES) {
            z = true;
        } else {
            z = false;
        }
        return new CardImage(id, channelCode, languageCode, fileType, fileSubType, extFileId, z, cardImageApiModel.getCustomerType(), cardImageApiModel.getDarkMode(), cardImageApiModel.getFileUrl());
    }

    /* renamed from: b */
    private final KeyValue m107362b(KeyValueApiModel keyValueApiModel) {
        return new KeyValue(keyValueApiModel.getKey(), keyValueApiModel.getValue());
    }

    /* renamed from: d */
    private final C37176a m107363d(ExecuteResultApiModel executeResultApiModel) {
        ArrayList arrayList;
        C37182g gVar;
        String error = executeResultApiModel.getError();
        String errorDictionaryKey = executeResultApiModel.getErrorDictionaryKey();
        String errorDictionaryValue = executeResultApiModel.getErrorDictionaryValue();
        String essServiceId = executeResultApiModel.getEssServiceId();
        List<KeyValueApiModel> essParameters = executeResultApiModel.getEssParameters();
        if (essParameters != null) {
            arrayList = new ArrayList(C41343r.m119925u(essParameters, 10));
            for (KeyValueApiModel b : essParameters) {
                arrayList.add(m107362b(b));
            }
        } else {
            arrayList = null;
        }
        BigDecimal offloadingPrize = executeResultApiModel.getOffloadingPrize();
        PrizeApiModel campaignPrize = executeResultApiModel.getCampaignPrize();
        if (campaignPrize != null) {
            gVar = m107364h(campaignPrize);
        } else {
            gVar = null;
        }
        return new C37176a(error, errorDictionaryKey, errorDictionaryValue, essServiceId, arrayList, offloadingPrize, gVar, executeResultApiModel.getAddBonusAmount(), executeResultApiModel.getOffloadingPrizeCcy(), executeResultApiModel.getOffloadingContractType(), executeResultApiModel.getBonusSchemeId(), executeResultApiModel.getOffloadingKey(), executeResultApiModel.getPaymentCommission(), executeResultApiModel.getCode(), executeResultApiModel.getCodeStatus(), executeResultApiModel.getPaymentDate());
    }

    /* renamed from: h */
    private final C37182g m107364h(PrizeApiModel prizeApiModel) {
        return new C37182g(prizeApiModel.getAmount(), prizeApiModel.getCcy(), prizeApiModel.getCampaignCode());
    }

    /* renamed from: c */
    public final List mo88823c(List list) {
        boolean z;
        CardImage cardImage;
        CardImage cardImage2;
        List list2 = list;
        C41536l.m120489i(list2, "cards");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PaymentCardApiModel paymentCardApiModel = (PaymentCardApiModel) it.next();
            long cardId = paymentCardApiModel.getCardId();
            String cardClass = paymentCardApiModel.getCardClass();
            String cardType = paymentCardApiModel.getCardType();
            String productCode = paymentCardApiModel.getProductCode();
            String subProductCode = paymentCardApiModel.getSubProductCode();
            Long clientKey = paymentCardApiModel.getClientKey();
            String lastFour = paymentCardApiModel.getLastFour();
            long expDate = paymentCardApiModel.getExpDate();
            String mainCur = paymentCardApiModel.getMainCur();
            Long acctKey = paymentCardApiModel.getAcctKey();
            String ccy = paymentCardApiModel.getCcy();
            String pan2 = paymentCardApiModel.getPan2();
            String cardName = paymentCardApiModel.getCardName();
            BigDecimal availableAmount = paymentCardApiModel.getAvailableAmount();
            BigDecimal availableAmountBaseCcy = paymentCardApiModel.getAvailableAmountBaseCcy();
            Iterator it2 = it;
            if (paymentCardApiModel.isDefault() == YesNoApiEntity.YES) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = z;
            String isHidden = paymentCardApiModel.isHidden();
            String groupCode = paymentCardApiModel.getGroupCode();
            String cardNameDictionaryKey = paymentCardApiModel.getCardNameDictionaryKey();
            String extMerchantId = paymentCardApiModel.getExtMerchantId();
            String isLocalCard = paymentCardApiModel.isLocalCard();
            String cardData = paymentCardApiModel.getCardData();
            String paymentCardType = paymentCardApiModel.getPaymentCardType();
            CardImageApiModel cardImage3 = paymentCardApiModel.getCardImage();
            if (cardImage3 != null) {
                cardImage = m107361a(cardImage3);
            } else {
                cardImage = null;
            }
            CardImageApiModel cardSmallImage = paymentCardApiModel.getCardSmallImage();
            if (cardSmallImage != null) {
                cardImage2 = m107361a(cardSmallImage);
            } else {
                cardImage2 = null;
            }
            arrayList.add(new PaymentCard(cardId, cardClass, cardType, productCode, subProductCode, clientKey, lastFour, expDate, mainCur, acctKey, ccy, pan2, cardName, availableAmount, availableAmountBaseCcy, z2, isHidden, groupCode, cardNameDictionaryKey, extMerchantId, isLocalCard, cardData, paymentCardType, cardImage, cardImage2));
            it = it2;
        }
        return arrayList;
    }

    /* renamed from: e */
    public final C37177b mo88824e(PaymentCommissionApiModel paymentCommissionApiModel) {
        C41536l.m120489i(paymentCommissionApiModel, "commissionApiModel");
        return new C37177b(paymentCommissionApiModel.getCommission(), paymentCommissionApiModel.getOldCommission(), paymentCommissionApiModel.getLimitType(), paymentCommissionApiModel.getInfoDictionaryKey(), paymentCommissionApiModel.getClientsAmountIsOverLimit(), paymentCommissionApiModel.getRandomString());
    }

    /* renamed from: f */
    public final C37179d mo88825f(PaymentDebtApiModel paymentDebtApiModel) {
        C38421a aVar;
        C41536l.m120489i(paymentDebtApiModel, "debt");
        List<KeyValueApiModel> parameter = paymentDebtApiModel.getParameter();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(parameter, 10));
        for (KeyValueApiModel b : parameter) {
            arrayList.add(m107362b(b));
        }
        if (paymentDebtApiModel.getProviderConfig() != null) {
            aVar = new C36086a().mo88822a(paymentDebtApiModel.getProviderConfig());
        } else {
            aVar = null;
        }
        return new C37179d(arrayList, aVar);
    }

    /* renamed from: g */
    public final C37181f mo88826g(PaymentResponseApiModel paymentResponseApiModel) {
        boolean z;
        C37182g gVar;
        ArrayList arrayList;
        C41536l.m120489i(paymentResponseApiModel, "paymentResponseApiModel");
        Integer addBonusAmount = paymentResponseApiModel.getAddBonusAmount();
        String offloadingContractType = paymentResponseApiModel.getOffloadingContractType();
        if (paymentResponseApiModel.getOffloadingContract() == YesNoApiEntity.YES) {
            z = true;
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        String offloadingKey = paymentResponseApiModel.getOffloadingKey();
        PrizeApiModel campaignPrize = paymentResponseApiModel.getCampaignPrize();
        if (campaignPrize != null) {
            gVar = m107364h(campaignPrize);
        } else {
            gVar = null;
        }
        String offloadingPrizeCcy = paymentResponseApiModel.getOffloadingPrizeCcy();
        String offloadingPrize = paymentResponseApiModel.getOffloadingPrize();
        List<ExecuteResultApiModel> executeResult = paymentResponseApiModel.getExecuteResult();
        if (executeResult != null) {
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(executeResult, 10));
            for (ExecuteResultApiModel d : executeResult) {
                arrayList2.add(m107363d(d));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new C37181f(addBonusAmount, offloadingContractType, valueOf, offloadingKey, gVar, offloadingPrizeCcy, offloadingPrize, arrayList);
    }

    /* renamed from: i */
    public final List mo88827i(List list) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i;
        List list2 = list;
        C41536l.m120489i(list2, "paymentPackagesApiModel");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PaymentPackageObjectApiModel paymentPackageObjectApiModel = (PaymentPackageObjectApiModel) it.next();
            long id = paymentPackageObjectApiModel.getServicePackage().getId();
            String masterServiceId = paymentPackageObjectApiModel.getServicePackage().getMasterServiceId();
            if (masterServiceId == null) {
                str = "";
            } else {
                str = masterServiceId;
            }
            String paymentServiceId = paymentPackageObjectApiModel.getServicePackage().getPaymentServiceId();
            if (paymentServiceId == null) {
                str2 = "";
            } else {
                str2 = paymentServiceId;
            }
            String packageName = paymentPackageObjectApiModel.getServicePackage().getPackageName();
            if (packageName == null) {
                str3 = "";
            } else {
                str3 = packageName;
            }
            String packageDesc = paymentPackageObjectApiModel.getServicePackage().getPackageDesc();
            if (packageDesc == null) {
                str4 = "";
            } else {
                str4 = packageDesc;
            }
            BigDecimal packageAmount = paymentPackageObjectApiModel.getServicePackage().getPackageAmount();
            if (packageAmount == null) {
                packageAmount = BigDecimal.ZERO;
            }
            BigDecimal bigDecimal = packageAmount;
            C41536l.m120488h(bigDecimal, "it.servicePackage.packageAmount ?: BigDecimal.ZERO");
            String channel = paymentPackageObjectApiModel.getServicePackage().getChannel();
            if (channel == null) {
                str5 = "";
            } else {
                str5 = channel;
            }
            String status = paymentPackageObjectApiModel.getServicePackage().getStatus();
            if (status == null) {
                str6 = "";
            } else {
                str6 = status;
            }
            Integer orderNo = paymentPackageObjectApiModel.getServicePackage().getOrderNo();
            if (orderNo != null) {
                i = orderNo.intValue();
            } else {
                i = 0;
            }
            int i2 = i;
            String defaultIconUrl = paymentPackageObjectApiModel.getDefaultIconUrl();
            if (defaultIconUrl == null) {
                defaultIconUrl = "";
            }
            arrayList.add(new C37180e(id, str, str2, str3, str4, bigDecimal, str5, str6, i2, defaultIconUrl));
        }
        return arrayList;
    }
}

package p869qs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.offer.entity.CreditOfferLimitEntity;
import p341ge.bog.mobilebank.cleanarch.data.offer.entity.LoanOfferLimitEntity;
import p341ge.bog.mobilebank.cleanarch.data.offer.entity.OfferInfoApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.offer.entity.OfferProductApiEntity;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductType;
import p852ov.C27086a;
import p852ov.C27087b;
import p852ov.C27088c;
import p852ov.C27091e;
import p913uu.C28942h;

/* renamed from: qs.a */
public final class C27861a {

    /* renamed from: a */
    public static final C27862a f70988a = new C27862a((DefaultConstructorMarker) null);

    /* renamed from: qs.a$a */
    public static final class C27862a {
        private C27862a() {
        }

        public /* synthetic */ C27862a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final OfferInfo.C20999b m86076a(String str) {
        if (C41536l.m120484d(str, "PL3")) {
            return OfferInfo.C20999b.BNPL;
        }
        return OfferInfo.C20999b.UNKNOWN;
    }

    /* renamed from: b */
    public final OfferInfo mo67382b(OfferInfoApiEntity offerInfoApiEntity) {
        boolean z;
        boolean z2;
        C41536l.m120489i(offerInfoApiEntity, "data");
        long id = offerInfoApiEntity.getId();
        String langCode = offerInfoApiEntity.getLangCode();
        OfferProductType a = OfferProductType.f56483e.mo52078a(offerInfoApiEntity.getProductType());
        OfferProductCode a2 = OfferProductCode.f56465e.mo52054a(offerInfoApiEntity.getProductCode());
        if (a2 == null) {
            return null;
        }
        String productName = offerInfoApiEntity.getProductName();
        String productText = offerInfoApiEntity.getProductText();
        String offerText = offerInfoApiEntity.getOfferText();
        String offerProduct = offerInfoApiEntity.getOfferProduct();
        String operType = offerInfoApiEntity.getOperType();
        String extraCode = offerInfoApiEntity.getExtraCode();
        String attachmentFileBase64 = offerInfoApiEntity.getAttachmentFileBase64();
        String offerNo = offerInfoApiEntity.getOfferNo();
        Integer orderNo = offerInfoApiEntity.getOrderNo();
        String effectiveInterestRate = offerInfoApiEntity.getEffectiveInterestRate();
        String hasPromotion = offerInfoApiEntity.getHasPromotion();
        if (hasPromotion != null) {
            z = C41536l.m120484d(hasPromotion, "PLUS_CAMPAIGNS");
        } else {
            z = false;
        }
        String offerAmount = offerInfoApiEntity.getOfferAmount();
        String offerCcy = offerInfoApiEntity.getOfferCcy();
        Boolean displayBannerOnHome = offerInfoApiEntity.getDisplayBannerOnHome();
        if (displayBannerOnHome != null) {
            z2 = displayBannerOnHome.booleanValue();
        } else {
            z2 = false;
        }
        return new OfferInfo(id, langCode, a, a2, productName, productText, offerText, offerProduct, operType, extraCode, attachmentFileBase64, offerNo, orderNo, effectiveInterestRate, z, offerAmount, offerCcy, z2, (String) null, m86076a(offerInfoApiEntity.getOfferScheme()), 262144, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public final C27086a mo67383c(CreditOfferLimitEntity creditOfferLimitEntity) {
        C41536l.m120489i(creditOfferLimitEntity, "entity");
        C28942h a = C28942h.f73876e.mo68797a(creditOfferLimitEntity.getOperationType());
        if (a == null) {
            return null;
        }
        String cardCcy = creditOfferLimitEntity.getCardCcy();
        OfferProductCode a2 = OfferProductCode.f56465e.mo52054a(creditOfferLimitEntity.getLimitCategory());
        if (a2 == null) {
            return null;
        }
        return new C27086a(a, cardCcy, a2, creditOfferLimitEntity.getCardLimit(), creditOfferLimitEntity.getTitleDictionaryKey(), creditOfferLimitEntity.getTitleDictionaryKeyValue());
    }

    /* renamed from: d */
    public final C27087b mo67384d(LoanOfferLimitEntity loanOfferLimitEntity) {
        OfferProductCode a;
        C41536l.m120489i(loanOfferLimitEntity, "entity");
        C27088c a2 = C27088c.f68041e.mo66360a(loanOfferLimitEntity.getOperationType());
        if (a2 == null || (a = OfferProductCode.f56465e.mo52054a(loanOfferLimitEntity.getLimitCategory())) == null) {
            return null;
        }
        return new C27087b(a2, a, loanOfferLimitEntity.getLoanCcy(), loanOfferLimitEntity.getLoanAmount(), loanOfferLimitEntity.getTitleDictionaryKey(), loanOfferLimitEntity.getTitleDictionaryKeyValue(), loanOfferLimitEntity.getInfoDictionaryKey(), loanOfferLimitEntity.getInfoDictionaryKeyValue());
    }

    /* renamed from: e */
    public final C27091e mo67385e(OfferProductApiEntity offerProductApiEntity) {
        C41536l.m120489i(offerProductApiEntity, "data");
        return new C27091e(offerProductApiEntity.getProductCode(), offerProductApiEntity.getOfferDtl());
    }

    /* renamed from: f */
    public final List mo67386f(List list) {
        C41536l.m120489i(list, "entities");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C27086a c = mo67383c((CreditOfferLimitEntity) it.next());
            if (c != null) {
                arrayList.add(c);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public final List mo67387g(List list) {
        C41536l.m120489i(list, "entities");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C27087b d = mo67384d((LoanOfferLimitEntity) it.next());
            if (d != null) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }
}

package p810kt;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.AmexOfferAdditionalParams;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.AmexOfferInfoApiEntity;
import p863pw.C27634l;

/* renamed from: kt.b */
public final class C25766b {
    /* renamed from: a */
    public final C27634l mo64358a(AmexOfferInfoApiEntity amexOfferInfoApiEntity) {
        Boolean bool;
        String str;
        String str2;
        C41536l.m120489i(amexOfferInfoApiEntity, "data");
        boolean isActive = amexOfferInfoApiEntity.isActive();
        String imageUrl = amexOfferInfoApiEntity.getImageUrl();
        String title = amexOfferInfoApiEntity.getTitle();
        String description = amexOfferInfoApiEntity.getDescription();
        AmexOfferAdditionalParams additionalParams = amexOfferInfoApiEntity.getAdditionalParams();
        if (additionalParams != null) {
            bool = additionalParams.isPayroll();
        } else {
            bool = null;
        }
        AmexOfferAdditionalParams additionalParams2 = amexOfferInfoApiEntity.getAdditionalParams();
        if (additionalParams2 != null) {
            str = additionalParams2.getProduct();
        } else {
            str = null;
        }
        AmexOfferAdditionalParams additionalParams3 = amexOfferInfoApiEntity.getAdditionalParams();
        if (additionalParams3 != null) {
            str2 = additionalParams3.getSubProductCode();
        } else {
            str2 = null;
        }
        return new C27634l(isActive, imageUrl, title, description, bool, str, str2);
    }
}

package m60;

import g91.C32289b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import o60.C26760a;
import o60.C26761b;
import p341ge.bog.mobilebank.cleanarch.productdescription.data.enitity.ProductDescriptionDetailsEntity;
import p341ge.bog.mobilebank.cleanarch.productdescription.data.enitity.ProductDescriptionTextEntity;

/* renamed from: m60.a */
public final class C26147a {
    /* renamed from: a */
    public final C26760a mo65077a(ProductDescriptionDetailsEntity productDescriptionDetailsEntity) {
        C41536l.m120489i(productDescriptionDetailsEntity, "productDescriptionDetailsEntity");
        return new C26760a(productDescriptionDetailsEntity.getOrderNo(), productDescriptionDetailsEntity.getHeaderDictionaryKey(), productDescriptionDetailsEntity.getHeaderDictionaryKeyValue(), productDescriptionDetailsEntity.getTextDictionaryKey(), productDescriptionDetailsEntity.getTextDictionaryKeyValue());
    }

    /* renamed from: b */
    public final C26761b mo65078b(ProductDescriptionTextEntity productDescriptionTextEntity) {
        String str;
        C41536l.m120489i(productDescriptionTextEntity, "productDescriptionTextEntity");
        String titleDictionaryKey = productDescriptionTextEntity.getTitleDictionaryKey();
        String titleDictionaryKeyValue = productDescriptionTextEntity.getTitleDictionaryKeyValue();
        String mainHeaderDictionaryKey = productDescriptionTextEntity.getMainHeaderDictionaryKey();
        String mainHeaderDictionaryKeyValue = productDescriptionTextEntity.getMainHeaderDictionaryKeyValue();
        String mainTextDictionaryKey = productDescriptionTextEntity.getMainTextDictionaryKey();
        String mainTextDictionaryKeyValue = productDescriptionTextEntity.getMainTextDictionaryKeyValue();
        String iconUrl = productDescriptionTextEntity.getIconUrl();
        if (iconUrl != null) {
            str = C32289b0.m95089a(iconUrl);
        } else {
            str = null;
        }
        String str2 = str;
        List<ProductDescriptionDetailsEntity> offerDetails = productDescriptionTextEntity.getOfferDetails();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(offerDetails, 10));
        for (ProductDescriptionDetailsEntity a : offerDetails) {
            arrayList.add(mo65077a(a));
        }
        return new C26761b(titleDictionaryKey, titleDictionaryKeyValue, mainHeaderDictionaryKey, mainHeaderDictionaryKeyValue, mainTextDictionaryKey, mainTextDictionaryKeyValue, str2, arrayList);
    }
}

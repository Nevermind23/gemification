package p522ml;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.bnpl.data.entity.BnplMerchantDetailsApiEntity;
import p606sl.C17845k;

/* renamed from: ml.b */
public final class C16721b {
    /* renamed from: a */
    public final List mo43850a(List list) {
        C41536l.m120489i(list, "bnplMerchantDetailsApiEntity");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BnplMerchantDetailsApiEntity bnplMerchantDetailsApiEntity = (BnplMerchantDetailsApiEntity) it.next();
            arrayList.add(new C17845k(bnplMerchantDetailsApiEntity.getMerchantId(), bnplMerchantDetailsApiEntity.getClientId(), bnplMerchantDetailsApiEntity.getBrandNameGE(), bnplMerchantDetailsApiEntity.getBrandNameEN(), bnplMerchantDetailsApiEntity.getActionLoanTerm(), bnplMerchantDetailsApiEntity.getInstallmentType(), bnplMerchantDetailsApiEntity.getWebPageUrl(), bnplMerchantDetailsApiEntity.getLogoFileId(), bnplMerchantDetailsApiEntity.getLogoFileUrl()));
        }
        return arrayList;
    }
}

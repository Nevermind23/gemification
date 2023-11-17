package p889ss;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.ProductTypeApiEntity;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;

/* renamed from: ss.a */
public final class C28259a {
    /* renamed from: a */
    public final String mo67842a(List list) {
        Object obj;
        String status;
        C41536l.m120489i(list, "productType");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((ProductTypeApiEntity) obj).getProduct(), "GTP_TRADING")) {
                break;
            }
        }
        ProductTypeApiEntity productTypeApiEntity = (ProductTypeApiEntity) obj;
        if (productTypeApiEntity == null || (status = productTypeApiEntity.getStatus()) == null) {
            return ProductType.PRODUCT_STATUS_REJECTED;
        }
        return status;
    }
}

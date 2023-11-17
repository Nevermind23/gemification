package p819ls;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.ProductTypeApiEntity;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;

/* renamed from: ls.b */
public final class C26063b {
    /* renamed from: a */
    public final ProductType mo64981a(ProductTypeApiEntity productTypeApiEntity) {
        C41536l.m120489i(productTypeApiEntity, "productType");
        return new ProductType(productTypeApiEntity.getClientKey(), productTypeApiEntity.getProduct(), productTypeApiEntity.getStatus());
    }

    /* renamed from: b */
    public final List mo64982b(List list) {
        C41536l.m120489i(list, "productType");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo64981a((ProductTypeApiEntity) it.next()));
        }
        return arrayList;
    }
}

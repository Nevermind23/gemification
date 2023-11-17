package p890st;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.servicecenter.entity.ServiceCenterEntity;
import p970zw.C30412a;

/* renamed from: st.a */
public final class C28260a {
    /* renamed from: a */
    public final C30412a mo67843a(ServiceCenterEntity serviceCenterEntity) {
        ArrayList arrayList;
        C41536l.m120489i(serviceCenterEntity, "serviceCenterEntity");
        long id = serviceCenterEntity.getId();
        long parentId = serviceCenterEntity.getParentId();
        String langCode = serviceCenterEntity.getLangCode();
        String pointType = serviceCenterEntity.getPointType();
        String pointValue = serviceCenterEntity.getPointValue();
        String pointDesc = serviceCenterEntity.getPointDesc();
        String hasSoloSc = serviceCenterEntity.getHasSoloSc();
        String customerType = serviceCenterEntity.getCustomerType();
        List<ServiceCenterEntity> points = serviceCenterEntity.getPoints();
        if (points != null) {
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(points, 10));
            for (ServiceCenterEntity a : points) {
                arrayList2.add(mo67843a(a));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new C30412a(id, parentId, langCode, pointType, pointValue, pointDesc, hasSoloSc, customerType, arrayList);
    }
}

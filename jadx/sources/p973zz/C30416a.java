package p973zz;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.ServiceStatusEntity;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.StatusEntity;
import p962yz.C30124a;

/* renamed from: zz.a */
public final class C30416a {
    /* renamed from: a */
    public final C30124a mo70772a(ServiceStatusEntity serviceStatusEntity) {
        boolean z;
        C41536l.m120489i(serviceStatusEntity, "serviceStatusEntity");
        if (StatusEntity.ACTIVE == serviceStatusEntity.getServiceStatus()) {
            z = true;
        } else {
            z = false;
        }
        return new C30124a(z, serviceStatusEntity.getStatusChangeAllowed());
    }
}

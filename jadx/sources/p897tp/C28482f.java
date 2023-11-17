package p897tp;

import ed1.C40762x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.cleanarch.application.data.entity.ApplicationTypeEntity;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p908up.C28924a;
import p941xp.C29822b;
import p952yp.C30105a;
import ue1.C43075l;

/* renamed from: tp.f */
public final class C28482f implements C30105a {

    /* renamed from: a */
    private final IRetrofitService f72293a;

    /* renamed from: tp.f$a */
    static final class C28483a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C28483a f72294d = new C28483a();

        C28483a() {
            super(1);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ApplicationTypeEntity applicationTypeEntity = (ApplicationTypeEntity) it.next();
                C41536l.m120488h(applicationTypeEntity, "appType");
                C29822b a = C28924a.m88560a(applicationTypeEntity);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return arrayList;
        }
    }

    public C28482f(IRetrofitService iRetrofitService) {
        C41536l.m120489i(iRetrofitService, "service");
        this.f72293a = iRetrofitService;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final List m87324c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo68100a() {
        C40762x<BankApiResponse<List<ApplicationTypeEntity>>> applicationTypes = this.f72293a.getApplicationTypes("APPLICATIONS_GET_APP_TYPES", "product_offers");
        C41536l.m120488h(applicationTypes, "service.getApplicationTy…TYPES\", \"product_offers\")");
        C40762x A = C19273c.m64722h(applicationTypes).mo95062A(new C28481e(C28483a.f72294d));
        C41536l.m120488h(A, "service.getApplicationTy…e.toApplicationType() } }");
        return A;
    }
}

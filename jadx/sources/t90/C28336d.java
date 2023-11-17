package t90;

import cx0.C31456c;
import g91.C32289b0;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C41536l;
import mx0.C37295i;
import p341ge.bog.mobilebank.ddsto.data.p767dd.DdApiModel;
import p341ge.bog.mobilebank.ddsto.data.p767dd.DdWrapperApiModel;
import x90.C29661a;

/* renamed from: t90.d */
public final class C28336d {

    /* renamed from: a */
    private final C37295i f71849a;

    public C28336d(C37295i iVar) {
        C41536l.m120489i(iVar, "searchNodes");
        this.f71849a = iVar;
    }

    /* renamed from: a */
    public final List mo67976a(DdWrapperApiModel ddWrapperApiModel) {
        long j;
        C41536l.m120489i(ddWrapperApiModel, "data");
        C37295i iVar = this.f71849a;
        List<DdApiModel> result = ddWrapperApiModel.getResult();
        ArrayList arrayList = new ArrayList();
        for (DdApiModel serviceId : result) {
            String serviceId2 = serviceId.getServiceId();
            if (serviceId2 != null) {
                arrayList.add(serviceId2);
            }
        }
        Object d = iVar.mo90404c(arrayList).mo95018d();
        C41536l.m120488h(d, "searchNodes(data.result.…viceId }).blockingFirst()");
        List<C31456c> list = (List) d;
        List<DdApiModel> result2 = ddWrapperApiModel.getResult();
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(result2, 10));
        for (DdApiModel ddApiModel : result2) {
            for (C31456c cVar : list) {
                if (C41536l.m120484d(cVar.mo71852c().mo71836s(), ddApiModel.getServiceId())) {
                    Long id = ddApiModel.getId();
                    C41536l.m120486f(id);
                    long longValue = id.longValue();
                    String orderName = ddApiModel.getOrderName();
                    Long priority = ddApiModel.getPriority();
                    if (priority != null) {
                        j = priority.longValue();
                    } else {
                        j = 0;
                    }
                    Double amount = ddApiModel.getAmount();
                    String serviceId3 = ddApiModel.getServiceId();
                    C41536l.m120486f(serviceId3);
                    Long nextPayDate = ddApiModel.getNextPayDate();
                    String t = cVar.mo71852c().mo71837t();
                    String c = C32289b0.m95091c(cVar.mo71852c().mo71828k());
                    C41536l.m120488h(c, "generateImageUrl(details.data.logo)");
                    arrayList2.add(new C29661a(longValue, orderName, j, amount, serviceId3, nextPayDate, t, c));
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return arrayList2;
    }
}

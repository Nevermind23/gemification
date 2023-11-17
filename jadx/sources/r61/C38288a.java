package r61;

import g91.C32343x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.shared.payments.data.model.PaymentConfigDetailsApiModel;
import p341ge.bog.mobilebank.templates.data.models.TemplateApiModel;
import p341ge.bog.mobilebank.templates.data.models.TemplateParametersApiModel;
import p341ge.bog.mobilebank.templates.data.models.TemplatesAndConfigApiModel;
import u61.C39033a;
import u61.C39034b;
import u61.C39035c;

/* renamed from: r61.a */
public final class C38288a {
    /* renamed from: b */
    private final C39034b m112558b(TemplateParametersApiModel templateParametersApiModel) {
        return new C39034b(templateParametersApiModel.getId(), templateParametersApiModel.getParameterKey(), templateParametersApiModel.getParameterValue(), templateParametersApiModel.getParameterType(), templateParametersApiModel.getParameterIndex(), templateParametersApiModel.getVerifyParameterData());
    }

    /* renamed from: c */
    private final List m112559c(List list, Map map) {
        ArrayList arrayList;
        String str;
        PaymentConfigDetailsApiModel paymentConfigDetailsApiModel;
        PaymentConfigDetailsApiModel paymentConfigDetailsApiModel2;
        List list2 = list;
        Map map2 = map;
        if (list2 != null) {
            int i = 10;
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(list2, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TemplateApiModel templateApiModel = (TemplateApiModel) it.next();
                String logo = templateApiModel.getLogo();
                Long id = templateApiModel.getId();
                C41536l.m120486f(id);
                long longValue = id.longValue();
                String templateName = templateApiModel.getTemplateName();
                String templateImage = templateApiModel.getTemplateImage();
                String serviceId = templateApiModel.getServiceId();
                List<TemplateParametersApiModel> templateParameters = templateApiModel.getTemplateParameters();
                String str2 = null;
                if (templateParameters != null) {
                    arrayList = new ArrayList(C41343r.m119925u(templateParameters, i));
                    for (TemplateParametersApiModel b : templateParameters) {
                        arrayList.add(m112558b(b));
                    }
                } else {
                    arrayList = null;
                }
                if (map2 == null || (paymentConfigDetailsApiModel2 = (PaymentConfigDetailsApiModel) map2.get(templateApiModel.getServiceId())) == null) {
                    str = null;
                } else {
                    str = paymentConfigDetailsApiModel2.getLogo();
                }
                if (!(map2 == null || (paymentConfigDetailsApiModel = (PaymentConfigDetailsApiModel) map2.get(templateApiModel.getServiceId())) == null)) {
                    str2 = paymentConfigDetailsApiModel.getServiceName();
                }
                C39033a aVar = r5;
                C39033a aVar2 = new C39033a(logo, longValue, templateName, templateImage, serviceId, arrayList, str, C32343x.m95386E(str2, true, new Object[0]));
                arrayList2.add(aVar);
                i = 10;
            }
            return arrayList2;
        }
        return C41341q.m119907j();
    }

    /* renamed from: a */
    public final C39035c mo91845a(TemplatesAndConfigApiModel templatesAndConfigApiModel) {
        C41536l.m120489i(templatesAndConfigApiModel, "data");
        return new C39035c(m112559c(templatesAndConfigApiModel.getTemplates(), templatesAndConfigApiModel.getConfig()));
    }
}

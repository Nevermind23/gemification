package gl0;

import ci1.C40458f;
import ed1.C40762x;
import java.util.List;
import p341ge.bog.mobilebank.insurance.data.model.InsuranceProductApiModel;
import p341ge.bog.mobilebank.insurance.data.model.PoliciesApiModel;

/* renamed from: gl0.a */
public interface C24762a {
    @C40458f(".?serviceId=INSURANCE_GET_POLICIES")
    /* renamed from: a */
    C40762x<PoliciesApiModel> mo63156a();

    @C40458f(".?serviceId=INSURANCE_GET_PRODUCT_LIST")
    /* renamed from: b */
    C40762x<List<InsuranceProductApiModel>> mo63157b();
}

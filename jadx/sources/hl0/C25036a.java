package hl0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import ml0.C26249c;
import ml0.C26250d;
import ml0.C26253f;
import p341ge.bog.mobilebank.insurance.data.model.InsuranceProductApiModel;
import p341ge.bog.mobilebank.insurance.data.model.ProductLogoApiModel;

/* renamed from: hl0.a */
public final class C25036a {
    /* renamed from: b */
    private final C26249c m79974b(InsuranceProductApiModel insuranceProductApiModel) {
        C26253f fVar;
        Long id = insuranceProductApiModel.getId();
        String lookupName = insuranceProductApiModel.getLookupName();
        C26250d a = C26250d.f66472e.mo65284a(insuranceProductApiModel.getLookupValue());
        String headerTextDKey = insuranceProductApiModel.getHeaderTextDKey();
        String detailsTextDKey = insuranceProductApiModel.getDetailsTextDKey();
        if (insuranceProductApiModel.getProductLogo() != null) {
            fVar = m79975c(insuranceProductApiModel.getProductLogo());
        } else {
            fVar = null;
        }
        return new C26249c(id, lookupName, a, headerTextDKey, detailsTextDKey, fVar);
    }

    /* renamed from: c */
    private final C26253f m79975c(ProductLogoApiModel productLogoApiModel) {
        return new C26253f(productLogoApiModel.getId(), productLogoApiModel.getChannelCode(), productLogoApiModel.getLanguageCode(), productLogoApiModel.getFileType(), productLogoApiModel.getFileSubType(), productLogoApiModel.getExtFileId(), productLogoApiModel.isDark(), productLogoApiModel.getFileUrl());
    }

    /* renamed from: a */
    public final List mo63468a(List list) {
        C41536l.m120489i(list, "data");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m79974b((InsuranceProductApiModel) it.next()));
        }
        return arrayList;
    }
}

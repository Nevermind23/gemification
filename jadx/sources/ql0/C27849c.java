package ql0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.insurance.travelinsurance.data.model.PreviouslyInsuredPersonApiModel;
import ul0.C28878e;

/* renamed from: ql0.c */
public final class C27849c {
    /* renamed from: b */
    private final C28878e m86044b(PreviouslyInsuredPersonApiModel previouslyInsuredPersonApiModel) {
        return new C28878e(previouslyInsuredPersonApiModel.getInsurerFirstName(), previouslyInsuredPersonApiModel.getInsurerLastName(), previouslyInsuredPersonApiModel.getInsuredFirstNameEn(), previouslyInsuredPersonApiModel.getInsuredLastNameEn(), previouslyInsuredPersonApiModel.getInsuredPin(), previouslyInsuredPersonApiModel.getInsuredBirthDate());
    }

    /* renamed from: a */
    public final List mo67366a(List list) {
        C28878e eVar;
        C41536l.m120489i(list, "apiModels");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PreviouslyInsuredPersonApiModel previouslyInsuredPersonApiModel = (PreviouslyInsuredPersonApiModel) it.next();
            if (previouslyInsuredPersonApiModel != null) {
                eVar = m86044b(previouslyInsuredPersonApiModel);
            } else {
                eVar = null;
            }
            if (eVar != null) {
                arrayList.add(eVar);
            }
        }
        return arrayList;
    }
}

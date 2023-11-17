package wn0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleChooserInterestSubTypeApiModel;
import p341ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleChooserInterestTypeApiModel;
import p341ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleClientInterestApiModel;
import p341ge.bog.mobilebank.lifestyleoffers.domain.model.LifestyleChooserInterestSubType;
import p341ge.bog.mobilebank.lifestyleoffers.domain.model.LifestyleChooserInterestType;
import p341ge.bog.mobilebank.lifestyleoffers.domain.model.LifestyleClientInterest;

/* renamed from: wn0.b */
public final class C18645b {
    /* renamed from: a */
    public final LifestyleChooserInterestSubType mo46476a(LifestyleChooserInterestSubTypeApiModel lifestyleChooserInterestSubTypeApiModel) {
        C41536l.m120489i(lifestyleChooserInterestSubTypeApiModel, "interest");
        String interestSubType = lifestyleChooserInterestSubTypeApiModel.getInterestSubType();
        String str = "";
        if (interestSubType == null) {
            interestSubType = str;
        }
        String subTypeDesc = lifestyleChooserInterestSubTypeApiModel.getSubTypeDesc();
        if (subTypeDesc != null) {
            str = subTypeDesc;
        }
        return new LifestyleChooserInterestSubType(interestSubType, str);
    }

    /* renamed from: b */
    public final LifestyleChooserInterestType mo46477b(LifestyleChooserInterestTypeApiModel lifestyleChooserInterestTypeApiModel) {
        String str;
        String str2;
        long j;
        String str3;
        C41536l.m120489i(lifestyleChooserInterestTypeApiModel, "interest");
        String interestType = lifestyleChooserInterestTypeApiModel.getInterestType();
        if (interestType == null) {
            str = "";
        } else {
            str = interestType;
        }
        String typeDesc = lifestyleChooserInterestTypeApiModel.getTypeDesc();
        if (typeDesc == null) {
            str2 = "";
        } else {
            str2 = typeDesc;
        }
        Long interestTypeImageId = lifestyleChooserInterestTypeApiModel.getInterestTypeImageId();
        if (interestTypeImageId != null) {
            j = interestTypeImageId.longValue();
        } else {
            j = -1;
        }
        String interestTypeImageUrl = lifestyleChooserInterestTypeApiModel.getInterestTypeImageUrl();
        if (interestTypeImageUrl == null) {
            str3 = "";
        } else {
            str3 = interestTypeImageUrl;
        }
        return new LifestyleChooserInterestType(str, str2, j, str3, mo46480e(lifestyleChooserInterestTypeApiModel.getInterestSubTypes()), true, false, C41357x0.m119985e(), "");
    }

    /* renamed from: c */
    public final LifestyleClientInterest mo46478c(LifestyleClientInterestApiModel lifestyleClientInterestApiModel) {
        long j;
        C41536l.m120489i(lifestyleClientInterestApiModel, "interest");
        Long id = lifestyleClientInterestApiModel.getId();
        if (id != null) {
            j = id.longValue();
        } else {
            j = -1;
        }
        String interestType = lifestyleClientInterestApiModel.getInterestType();
        String str = "";
        if (interestType == null) {
            interestType = str;
        }
        String interestSubType = lifestyleClientInterestApiModel.getInterestSubType();
        if (interestSubType != null) {
            str = interestSubType;
        }
        return new LifestyleClientInterest(j, interestType, str);
    }

    /* renamed from: d */
    public final List mo46479d(List list) {
        if (list == null) {
            return C41341q.m119907j();
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo46478c((LifestyleClientInterestApiModel) it.next()));
        }
        return arrayList;
    }

    /* renamed from: e */
    public final List mo46480e(List list) {
        if (list == null) {
            return C41341q.m119907j();
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo46476a((LifestyleChooserInterestSubTypeApiModel) it.next()));
        }
        return arrayList;
    }

    /* renamed from: f */
    public final List mo46481f(List list) {
        if (list == null) {
            return C41341q.m119907j();
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo46477b((LifestyleChooserInterestTypeApiModel) it.next()));
        }
        return arrayList;
    }
}

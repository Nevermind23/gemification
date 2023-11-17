package p355an;

import i31.C36344a;
import i31.C36345b;
import i31.C36346c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cardapplications.presentation.model.insurance.DebitCardInsuranceFeeUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.insurance.DebitCardInsuranceInfoUiModel;
import p341ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel;

/* renamed from: an.i */
public final class C10091i {
    /* renamed from: a */
    public final DebitCardInsuranceFeeUiModel mo26552a(C36344a aVar) {
        C41536l.m120489i(aVar, "fee");
        return new DebitCardInsuranceFeeUiModel(aVar.mo89058a(), aVar.mo89059b());
    }

    /* renamed from: b */
    public final DebitCardInsuranceInfoUiModel mo26553b(C36345b bVar) {
        Double d;
        Object obj;
        C41536l.m120489i(bVar, "info");
        List<C36344a> a = bVar.mo89064a();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(a, 10));
        for (C36344a a2 : a) {
            arrayList.add(mo26552a(a2));
        }
        List<C36346c> b = bVar.mo89065b();
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(b, 10));
        for (C36346c cVar : b) {
            Iterator it = bVar.mo89064a().iterator();
            while (true) {
                d = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C41536l.m120484d(((C36344a) obj).mo89059b(), cVar.mo89077g())) {
                    break;
                }
            }
            C36344a aVar = (C36344a) obj;
            if (aVar != null) {
                d = Double.valueOf(aVar.mo89058a());
            }
            arrayList2.add(mo26554c(cVar, d));
        }
        return new DebitCardInsuranceInfoUiModel(arrayList, arrayList2, bVar.mo89066c());
    }

    /* renamed from: c */
    public final DebitCardInsuranceTypeUiModel mo26554c(C36346c cVar, Double d) {
        C41536l.m120489i(cVar, "type");
        return new DebitCardInsuranceTypeUiModel.InsuranceType(cVar.mo89073d(), cVar.mo89070a(), d, cVar.mo89076f(), cVar.mo89074e(), cVar.mo89077g(), cVar.mo89072c(), cVar.mo89071b());
    }
}

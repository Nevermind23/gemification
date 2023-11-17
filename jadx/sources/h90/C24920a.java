package h90;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ApplicationSalaryInfoUiModel;
import x80.C29657a;

/* renamed from: h90.a */
public final class C24920a {
    /* renamed from: a */
    public final ApplicationSalaryInfoUiModel mo63331a(C29657a aVar) {
        C41536l.m120489i(aVar, "applicantSalary");
        return new ApplicationSalaryInfoUiModel(aVar.mo69585i(), aVar.mo69575a(), aVar.mo69577c(), aVar.mo69579e(), aVar.mo69582g(), aVar.mo69581f(), aVar.mo69583h(), aVar.mo69576b(), aVar.mo69586j());
    }

    /* renamed from: b */
    public final List mo63332b(List list) {
        C41536l.m120489i(list, "applicantSalaries");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo63331a((C29657a) it.next()));
        }
        return arrayList;
    }
}

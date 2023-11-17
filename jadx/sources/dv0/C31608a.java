package dv0;

import iv0.C36550b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.openbanking.data.model.BankApiModel;

/* renamed from: dv0.a */
public final class C31608a {
    /* renamed from: a */
    public final List mo72022a(List list) {
        C41536l.m120489i(list, "banks");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BankApiModel bankApiModel = (BankApiModel) it.next();
            arrayList.add(new C36550b(bankApiModel.getAdapterId(), bankApiModel.getBankCode(), bankApiModel.getBic(), bankApiModel.getId(), bankApiModel.getIdpUrl(), bankApiModel.getName(), bankApiModel.getUrl(), bankApiModel.isActive()));
        }
        return arrayList;
    }
}

package w31;

import j31.C36726b;
import j31.C36727c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.shared.presentation.common.model.UrlDataUiModel;
import p341ge.bog.mobilebank.shared.presentation.common.model.UrlParamUiModel;

/* renamed from: w31.b */
public final class C39514b {
    /* renamed from: a */
    public final UrlDataUiModel mo93148a(C36726b bVar) {
        C41536l.m120489i(bVar, "data");
        String b = bVar.mo89547b();
        List<C36727c> a = bVar.mo89546a();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(a, 10));
        for (C36727c b2 : a) {
            arrayList.add(mo93149b(b2));
        }
        return new UrlDataUiModel(b, arrayList);
    }

    /* renamed from: b */
    public final UrlParamUiModel mo93149b(C36727c cVar) {
        C41536l.m120489i(cVar, "param");
        return new UrlParamUiModel(cVar.mo89551a(), cVar.mo89552b());
    }
}

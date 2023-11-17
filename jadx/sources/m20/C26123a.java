package m20;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import l20.C25801b;
import p341ge.bog.mobilebank.cleanarch.presentation.liabilityoverdue.liabilityinfo.LiabilityOverdueInfoUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.liabilityoverdue.liabilityinfo.ManagerInfoUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.liabilityoverdue.liabilityinfo.OverdueProductInfoUiModel;
import p70.C27239a;
import p70.C27240b;
import p70.C27241c;

/* renamed from: m20.a */
public final class C26123a {
    /* renamed from: a */
    public final LiabilityOverdueInfoUiModel mo65036a(C27239a aVar) {
        ManagerInfoUiModel managerInfoUiModel;
        List list;
        C27240b bVar;
        C41536l.m120489i(aVar, "entity");
        List a = aVar.mo66515a();
        if (a == null || (bVar = (C27240b) C41358y.m120009Y(a)) == null) {
            managerInfoUiModel = null;
        } else {
            managerInfoUiModel = mo65037b(bVar);
        }
        List<C27241c> b = aVar.mo66516b();
        if (b != null) {
            list = new ArrayList();
            for (C27241c c : b) {
                OverdueProductInfoUiModel c2 = mo65038c(c);
                if (c2 != null) {
                    list.add(c2);
                }
            }
        } else {
            list = C41341q.m119907j();
        }
        return new LiabilityOverdueInfoUiModel(managerInfoUiModel, list);
    }

    /* renamed from: b */
    public final ManagerInfoUiModel mo65037b(C27240b bVar) {
        C41536l.m120489i(bVar, "entity");
        return new ManagerInfoUiModel(bVar.mo66520a(), bVar.mo66521b(), bVar.mo66522c());
    }

    /* renamed from: c */
    public final OverdueProductInfoUiModel mo65038c(C27241c cVar) {
        C41536l.m120489i(cVar, "entity");
        int b = cVar.mo66527b();
        C25801b a = C25801b.f65628f.mo64436a(cVar.mo66529d());
        if (a == null) {
            return null;
        }
        return new OverdueProductInfoUiModel(b, a, cVar.mo66526a(), cVar.mo66528c());
    }
}

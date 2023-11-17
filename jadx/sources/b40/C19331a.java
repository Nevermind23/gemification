package b40;

import a40.C19167a;
import a40.C19168b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.model.AnalysisChildModel;
import p903tv.C28517a;
import p903tv.C28518b;
import p903tv.C28519c;

/* renamed from: b40.a */
public final class C19331a {

    /* renamed from: b40.a$a */
    public static final class C19332a implements Comparator {
        C19332a() {
        }

        /* renamed from: a */
        public int compare(AnalysisChildModel analysisChildModel, AnalysisChildModel analysisChildModel2) {
            C41536l.m120489i(analysisChildModel, "o1");
            C41536l.m120489i(analysisChildModel2, "o2");
            if (analysisChildModel.mo54781f() == 0) {
                return 1;
            }
            if (analysisChildModel2.mo54781f() == 0) {
                return -1;
            }
            return analysisChildModel2.mo54783h().abs().compareTo(analysisChildModel.mo54783h().abs());
        }
    }

    /* renamed from: a */
    private final C19167a m64777a(C28519c cVar) {
        return new C19167a(m64778c(cVar.mo68129c()), cVar.mo68130d());
    }

    /* renamed from: c */
    private final List m64778c(List list) {
        List list2;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C28518b bVar = (C28518b) it.next();
            List a = bVar.mo68120a();
            if (a != null) {
                list2 = m64778c(a);
            } else {
                list2 = null;
            }
            arrayList.add(new AnalysisChildModel(list2, bVar.mo68121b(), bVar.mo68122c(), bVar.mo68123d(), bVar.mo68124e()));
        }
        return C41358y.m120030t0(arrayList, new C19332a());
    }

    /* renamed from: d */
    private final C19167a m64779d(C28519c cVar) {
        List list;
        if (!(!cVar.mo68129c().isEmpty()) || (list = ((C28518b) cVar.mo68129c().get(0)).mo68120a()) == null) {
            list = C41341q.m119907j();
        }
        return new C19167a(m64778c(list), cVar.mo68130d());
    }

    /* renamed from: b */
    public final C19168b mo47534b(C28517a aVar) {
        C41536l.m120489i(aVar, "analysis");
        return new C19168b(m64777a(aVar.mo68115c()), m64779d(aVar.mo68116d()));
    }
}

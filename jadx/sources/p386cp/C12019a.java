package p386cp;

import fd0.C20463a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.categorypackages.presentation.application.terms.SoloApplicationTermsUiModel;

/* renamed from: cp.a */
public final class C12019a {

    /* renamed from: a */
    public static final C12020a f35393a = new C12020a((DefaultConstructorMarker) null);

    /* renamed from: cp.a$a */
    public static final class C12020a {
        private C12020a() {
        }

        public /* synthetic */ C12020a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: cp.a$b */
    public static final class C12021b implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(((C20463a) obj).mo49003c(), ((C20463a) obj2).mo49003c());
        }
    }

    /* renamed from: a */
    public final List mo32114a(List list) {
        ArrayList arrayList;
        List t0;
        List<List> N;
        String str;
        String str2;
        String a;
        if (list == null || (t0 = C41358y.m120030t0(list, new C12021b())) == null || (N = C41358y.m119998N(t0, 2)) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(C41343r.m119925u(N, 10));
            for (List list2 : N) {
                C20463a aVar = (C20463a) C41358y.m120009Y(list2);
                String str3 = "";
                if (aVar == null || (str = aVar.mo49003c()) == null) {
                    str = str3;
                }
                C20463a aVar2 = (C20463a) C41358y.m120009Y(list2);
                if (aVar2 == null || (str2 = aVar2.mo49001a()) == null) {
                    str2 = str3;
                }
                C20463a aVar3 = (C20463a) C41358y.m120020j0(list2);
                if (!(aVar3 == null || (a = aVar3.mo49001a()) == null)) {
                    str3 = a;
                }
                arrayList.add(new SoloApplicationTermsUiModel(str, str2, str3));
            }
        }
        if (arrayList == null) {
            return C41341q.m119907j();
        }
        return arrayList;
    }
}

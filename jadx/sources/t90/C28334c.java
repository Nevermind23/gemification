package t90;

import ci1.C40458f;
import ci1.C40472t;
import ed1.C40762x;
import java.util.List;
import p341ge.bog.mobilebank.ddsto.data.p767dd.DdWrapperApiModel;

/* renamed from: t90.c */
public interface C28334c {

    /* renamed from: t90.c$a */
    public static final class C28335a {
        /* renamed from: a */
        public static /* synthetic */ C40762x m86973a(C28334c cVar, List list, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    list = C41339p.m119900e("ACTIVE");
                }
                return cVar.mo67975a(list);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDd");
        }
    }

    @C40458f("dd/order")
    /* renamed from: a */
    C40762x<DdWrapperApiModel> mo67975a(@C40472t("statusList") List<String> list);
}

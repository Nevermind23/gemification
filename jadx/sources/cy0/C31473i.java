package cy0;

import dy0.C31622e;
import ey0.C31877a;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33700c;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33702d;
import vx0.C39491a;

/* renamed from: cy0.i */
public interface C31473i extends C33700c {

    /* renamed from: e */
    public static final C31474a f78046e = C31474a.f78047a;

    /* renamed from: cy0.i$a */
    public static final class C31474a {

        /* renamed from: a */
        static final /* synthetic */ C31474a f78047a = new C31474a();

        private C31474a() {
        }

        /* renamed from: a */
        public final C31473i mo71890a(C31877a aVar) {
            C41536l.m120489i(aVar, "formManager");
            return new C31476j(aVar);
        }
    }

    /* renamed from: cy0.i$b */
    public static final class C31475b {
        /* renamed from: a */
        public static C39491a m93506a(C31473i iVar, C33702d.C33703a aVar) {
            C41536l.m120489i(aVar, "elementType");
            return C33700c.C33701a.m99050a(iVar, aVar);
        }

        /* renamed from: b */
        public static List m93507b(C31473i iVar) {
            return C33700c.C33701a.m99051b(iVar);
        }
    }

    /* renamed from: A */
    void mo71888A(C31622e eVar);

    /* renamed from: B */
    void mo71889B(List list);
}

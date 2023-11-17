package cy0;

import ey0.C31877a;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import lx0.C37179d;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33700c;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33702d;
import s31.C38424d;
import vx0.C39491a;

/* renamed from: cy0.g */
public interface C31469g extends C33700c {

    /* renamed from: d */
    public static final C31470a f78042d = C31470a.f78043a;

    /* renamed from: cy0.g$a */
    public static final class C31470a {

        /* renamed from: a */
        static final /* synthetic */ C31470a f78043a = new C31470a();

        private C31470a() {
        }

        /* renamed from: a */
        public final C31469g mo71884a(C31877a aVar) {
            C41536l.m120489i(aVar, "formManager");
            return new C31472h(aVar);
        }
    }

    /* renamed from: cy0.g$b */
    public static final class C31471b {
        /* renamed from: a */
        public static C39491a m93491a(C31469g gVar, C33702d.C33703a aVar) {
            C41536l.m120489i(aVar, "elementType");
            return C33700c.C33701a.m99050a(gVar, aVar);
        }

        /* renamed from: b */
        public static List m93492b(C31469g gVar) {
            return C33700c.C33701a.m99051b(gVar);
        }
    }

    /* renamed from: j */
    String mo71879j();

    /* renamed from: l */
    void mo71880l(C37179d dVar);

    /* renamed from: m */
    void mo71881m(C38424d dVar);

    /* renamed from: o */
    boolean mo71882o();

    /* renamed from: y */
    void mo71883y();
}

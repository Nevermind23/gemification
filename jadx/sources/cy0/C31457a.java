package cy0;

import dy0.C31618a;
import ey0.C31877a;
import kotlin.jvm.internal.C41536l;
import lx0.C37177b;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33700c;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33702d;
import vx0.C39491a;
import vx0.C39492b;

/* renamed from: cy0.a */
public interface C31457a extends C33700c {

    /* renamed from: a */
    public static final C31458a f78033a = C31458a.f78034a;

    /* renamed from: cy0.a$a */
    public static final class C31458a {

        /* renamed from: a */
        static final /* synthetic */ C31458a f78034a = new C31458a();

        private C31458a() {
        }

        /* renamed from: a */
        public final C31457a mo71864a(C31877a aVar) {
            C41536l.m120489i(aVar, "formManager");
            return new C31460b(aVar);
        }
    }

    /* renamed from: cy0.a$b */
    public static final class C31459b {
        /* renamed from: a */
        public static C39491a m93451a(C31457a aVar, C33702d.C33703a aVar2) {
            C41536l.m120489i(aVar2, "elementType");
            return C33700c.C33701a.m99050a(aVar, aVar2);
        }
    }

    /* renamed from: b */
    void mo71858b(boolean z);

    String getAmount();

    /* renamed from: h */
    C31618a mo71860h();

    /* renamed from: i */
    void mo71861i(C39492b bVar);

    /* renamed from: k */
    void mo71862k(C37177b bVar);

    /* renamed from: n */
    void mo71863n(C39492b bVar);
}

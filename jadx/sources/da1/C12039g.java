package da1;

import ba1.C10146d0;
import fh1.C40951a;
import gh1.C41125a;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import nh1.C41806a;
import ue1.C43064a;

/* renamed from: da1.g */
public final class C12039g extends C12030b {

    /* renamed from: da1.g$a */
    public static final class C12040a implements C41125a {

        /* renamed from: a */
        private final Object f35438a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo32165b() {
            return this.f35438a;
        }
    }

    /* renamed from: da1.g$b */
    public static final class C12041b implements C41125a {

        /* renamed from: a */
        private final Object f35439a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo32166b() {
            return this.f35439a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12039g(C12038f fVar) {
        super(fVar);
        C41536l.m120489i(fVar, "context");
    }

    /* renamed from: a */
    public void mo32123a() {
    }

    /* renamed from: f */
    public final void mo32164f() {
        boolean z;
        String a = ((C10146d0.C10172e) new C12040a().mo32165b()).mo26726q().mo92939a();
        if (C41536l.m120484d(a, "MOBILE")) {
            z = true;
        } else {
            z = C41536l.m120484d(a, "JUNIOR");
        }
        if (z) {
            mo32125c().mo32161t().mo4823o(C41238w.f97225a);
            return;
        }
        throw new IllegalArgumentException("Password recovery is not implemented yet for channel: " + ((C10146d0.C10172e) new C12041b().mo32166b()).mo26726q().mo92939a());
    }
}

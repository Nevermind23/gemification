package ba1;

import android.content.Context;
import dd1.C40530i;
import de1.C40640a;
import fh1.C40951a;
import gh1.C41125a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import nh1.C41806a;
import p341ge.bog.sso_client.models.C35952m;
import ue1.C43064a;

/* renamed from: ba1.i */
public interface C10199i {

    /* renamed from: ba1.i$a */
    public static final class C10200a {

        /* renamed from: ba1.i$a$a */
        public static final class C10201a implements C41125a {

            /* renamed from: a */
            private final Object f28254a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C40530i.class), (C41806a) null, (C43064a) null);

            /* renamed from: a */
            public C40951a mo26679a() {
                return C41125a.C41126a.m119226a(this);
            }

            /* renamed from: b */
            public final Object mo26770b() {
                return this.f28254a;
            }
        }

        /* renamed from: a */
        public static void m37276a(C10199i iVar, C35952m mVar) {
            C41536l.m120489i(mVar, "newLocale");
            m37277b(iVar, iVar.mo26767a(), mVar);
        }

        /* renamed from: b */
        private static void m37277b(C10199i iVar, C35952m mVar, C35952m mVar2) {
            ((C40530i) new C10201a().mo26770b()).mo94566a(mVar, mVar2).mo94890I(C40640a.m117458b()).mo94886E();
        }
    }

    /* renamed from: a */
    C35952m mo26767a();

    /* renamed from: b */
    Context mo26768b(Context context);

    /* renamed from: c */
    void mo26769c(C35952m mVar);
}

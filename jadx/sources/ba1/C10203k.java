package ba1;

import android.content.Context;
import ba1.C10199i;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.sso_client.models.C35952m;

/* renamed from: ba1.k */
public abstract class C10203k {

    /* renamed from: a */
    private static final C35952m f28256a = C35952m.KA;

    /* renamed from: b */
    private static final C10199i f28257b = new C10204a();

    /* renamed from: ba1.k$a */
    public static final class C10204a implements C10199i {
        C10204a() {
        }

        /* renamed from: a */
        public C35952m mo26767a() {
            return C10203k.m37283a();
        }

        /* renamed from: b */
        public Context mo26768b(Context context) {
            C41536l.m120489i(context, "context");
            return context;
        }

        /* renamed from: c */
        public void mo26769c(C35952m mVar) {
            C41536l.m120489i(mVar, "newLocale");
            C10199i.C10200a.m37276a(this, mVar);
        }
    }

    /* renamed from: a */
    public static final C35952m m37283a() {
        return f28256a;
    }

    /* renamed from: b */
    public static final C10199i m37284b() {
        return f28257b;
    }
}

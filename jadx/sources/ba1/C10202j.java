package ba1;

import android.content.Context;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.sso_client.models.C35952m;

/* renamed from: ba1.j */
public final class C10202j implements C10199i {

    /* renamed from: a */
    private final C10199i f28255a;

    public C10202j(C10199i iVar) {
        C41536l.m120489i(iVar, "localeManager");
        this.f28255a = iVar;
    }

    /* renamed from: a */
    public C35952m mo26767a() {
        try {
            return this.f28255a.mo26767a();
        } catch (Exception unused) {
            return C10203k.m37284b().mo26767a();
        }
    }

    /* renamed from: b */
    public Context mo26768b(Context context) {
        C41536l.m120489i(context, "context");
        try {
            return this.f28255a.mo26768b(context);
        } catch (Exception unused) {
            return C10203k.m37284b().mo26768b(context);
        }
    }

    /* renamed from: c */
    public void mo26769c(C35952m mVar) {
        C41536l.m120489i(mVar, "newLocale");
        try {
            this.f28255a.mo26769c(mVar);
        } catch (Exception unused) {
            C10203k.m37284b().mo26769c(mVar);
        }
    }
}

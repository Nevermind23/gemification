package p11;

import android.content.SharedPreferences;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m11.C37202b;
import n11.C37343a;
import w41.C39517c;
import w41.C39520e;

/* renamed from: p11.a */
public final class C37892a implements C37343a, C39517c.C39518a {

    /* renamed from: e */
    public static final C37893a f90962e = new C37893a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final SharedPreferences f90963d;

    /* renamed from: p11.a$a */
    public static final class C37893a {
        private C37893a() {
        }

        public /* synthetic */ C37893a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C37892a(SharedPreferences sharedPreferences) {
        C41536l.m120489i(sharedPreferences, "sharedPreferences");
        this.f90963d = sharedPreferences;
    }

    /* renamed from: a */
    public void mo90426a(C37202b bVar) {
        if (bVar != null) {
            C39520e eVar = C39520e.f93965a;
            eVar.mo93164o(this, "KEY_PRE_LOGIN_URL", bVar.mo90261b(), true);
            eVar.mo93161i(this, "KEY_PRE_LOGIN_URL_IS_DARK", bVar.mo90262c(), true);
            String a = bVar.mo90260a();
            if (a != null) {
                C39520e.m114863p(eVar, this, "KEY_PRE_LOGIN_URL_FILE_SUB_TYPE", a, false, 4, (Object) null);
                return;
            }
            return;
        }
        C39520e eVar2 = C39520e.f93965a;
        eVar2.mo93159g(this, "KEY_PRE_LOGIN_URL");
        eVar2.mo93159g(this, "KEY_PRE_LOGIN_URL_IS_DARK");
        eVar2.mo93159g(this, "KEY_PRE_LOGIN_URL_FILE_SUB_TYPE");
    }

    /* renamed from: b */
    public C37202b mo90427b() {
        C39520e eVar = C39520e.f93965a;
        String f = C39520e.m114859f(eVar, this, "KEY_PRE_LOGIN_URL", (String) null, 2, (Object) null);
        if (f == null) {
            return null;
        }
        C39520e eVar2 = eVar;
        return new C37202b(f, C39520e.m114858b(eVar2, this, "KEY_PRE_LOGIN_URL_IS_DARK", false, 2, (Object) null), C39520e.m114859f(eVar2, this, "KEY_PRE_LOGIN_URL_FILE_SUB_TYPE", (String) null, 2, (Object) null));
    }

    /* renamed from: c */
    public void mo90428c(C37202b bVar, long j) {
        if (bVar != null) {
            C39520e eVar = C39520e.f93965a;
            C39520e eVar2 = eVar;
            long j2 = j;
            C39520e.m114864r(eVar2, this, j2, "KEY_PRE_LOGIN_URL", bVar.mo90261b(), false, 8, (Object) null);
            C39520e.m114861l(eVar2, this, j2, "KEY_PRE_LOGIN_URL_IS_DARK", bVar.mo90262c(), false, 8, (Object) null);
            String a = bVar.mo90260a();
            if (a != null) {
                C39520e.m114864r(eVar, this, j, "KEY_PRE_LOGIN_URL_FILE_SUB_TYPE", a, false, 8, (Object) null);
                return;
            }
            return;
        }
        C39520e eVar3 = C39520e.f93965a;
        eVar3.mo93160h(this, j, "KEY_PRE_LOGIN_URL");
        eVar3.mo93160h(this, j, "KEY_PRE_LOGIN_URL_IS_DARK");
        eVar3.mo93160h(this, j, "KEY_PRE_LOGIN_URL_FILE_SUB_TYPE");
    }

    public SharedPreferences getSharedPreferences() {
        return this.f90963d;
    }
}

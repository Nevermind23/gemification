package n41;

import android.content.SharedPreferences;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: n41.b */
public final class C37351b implements C37350a {

    /* renamed from: b */
    public static final C37352a f89800b = new C37352a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final SharedPreferences f89801a;

    /* renamed from: n41.b$a */
    public static final class C37352a {
        private C37352a() {
        }

        public /* synthetic */ C37352a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C37351b(SharedPreferences sharedPreferences) {
        C41536l.m120489i(sharedPreferences, "prefs");
        this.f89801a = sharedPreferences;
    }

    public C37353c getLanguage() {
        String string = this.f89801a.getString("SELECTED_LOCALE", C37353c.KA.mo90434c());
        C41536l.m120486f(string);
        C37353c a = C37353c.f89802f.mo90437a(string);
        C41536l.m120486f(a);
        return a;
    }

    public void setLanguage(C37353c cVar) {
        C41536l.m120489i(cVar, "language");
        this.f89801a.edit().putString("SELECTED_LOCALE", cVar.mo90434c()).apply();
    }
}

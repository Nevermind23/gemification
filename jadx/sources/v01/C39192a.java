package v01;

import android.content.SharedPreferences;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w41.C39517c;
import w41.C39520e;
import y01.C39988a;

/* renamed from: v01.a */
public final class C39192a implements C39988a, C39517c.C39518a {

    /* renamed from: e */
    public static final C39193a f93375e = new C39193a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final SharedPreferences f93376d;

    /* renamed from: v01.a$a */
    public static final class C39193a {
        private C39193a() {
        }

        public /* synthetic */ C39193a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C39192a(SharedPreferences sharedPreferences) {
        C41536l.m120489i(sharedPreferences, "sharedPreferences");
        this.f93376d = sharedPreferences;
    }

    /* renamed from: a */
    public void mo92828a() {
        C39520e.m114863p(C39520e.f93965a, this, "SHOW_RELEASE_NOTES", "6.3.9", false, 4, (Object) null);
    }

    /* renamed from: b */
    public void mo92829b(String str) {
        C41536l.m120489i(str, "appVersion");
        C39520e.f93965a.mo93159g(this, "SHOW_RELEASE_NOTES");
    }

    /* renamed from: c */
    public boolean mo92830c() {
        return !C41536l.m120484d(C39520e.m114859f(C39520e.f93965a, this, "SHOW_RELEASE_NOTES", (String) null, 2, (Object) null), "6.3.9");
    }

    public SharedPreferences getSharedPreferences() {
        return this.f93376d;
    }
}

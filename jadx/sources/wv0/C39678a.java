package wv0;

import android.content.SharedPreferences;
import cw0.C31451a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w41.C39517c;
import w41.C39520e;

/* renamed from: wv0.a */
public final class C39678a implements C31451a, C39517c.C39518a {

    /* renamed from: e */
    public static final C39679a f94304e = new C39679a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final SharedPreferences f94305d;

    /* renamed from: wv0.a$a */
    public static final class C39679a {
        private C39679a() {
        }

        public /* synthetic */ C39679a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C39678a(SharedPreferences sharedPreferences) {
        C41536l.m120489i(sharedPreferences, "sharedPreferences");
        this.f94305d = sharedPreferences;
    }

    /* renamed from: a */
    public boolean mo71805a() {
        return C39520e.f93965a.mo93155a(this, "PREFERENCE_KEY_SHOW_CONTACTS_PERMISSION", true);
    }

    /* renamed from: b */
    public void mo71806b(boolean z) {
        C39520e.m114860j(C39520e.f93965a, this, "PREFERENCE_KEY_SHOW_CONTACTS_PERMISSION", z, false, 4, (Object) null);
    }

    public SharedPreferences getSharedPreferences() {
        return this.f94305d;
    }
}

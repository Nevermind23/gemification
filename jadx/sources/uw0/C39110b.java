package uw0;

import android.content.SharedPreferences;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: uw0.b */
public final class C39110b implements C39109a {

    /* renamed from: b */
    public static final C39111a f93258b = new C39111a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final SharedPreferences f93259a;

    /* renamed from: uw0.b$a */
    public static final class C39111a {
        private C39111a() {
        }

        public /* synthetic */ C39111a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C39110b(SharedPreferences sharedPreferences) {
        C41536l.m120489i(sharedPreferences, "sharedPreferences");
        this.f93259a = sharedPreferences;
    }

    /* renamed from: a */
    public void mo92774a(int i) {
        SharedPreferences.Editor edit = this.f93259a.edit();
        C41536l.m120488h(edit, "editor");
        edit.putInt("DEFAULT_PAYMENT_CONFIG_VERSION", i);
        edit.apply();
    }

    /* renamed from: b */
    public int mo92775b() {
        return this.f93259a.getInt("DEFAULT_PAYMENT_CONFIG_VERSION", -1);
    }
}

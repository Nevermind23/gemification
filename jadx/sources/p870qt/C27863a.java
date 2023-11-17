package p870qt;

import android.content.SharedPreferences;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: qt.a */
public final class C27863a {

    /* renamed from: b */
    public static final C27864a f70989b = new C27864a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static boolean f70990c;

    /* renamed from: a */
    private final SharedPreferences f70991a;

    /* renamed from: qt.a$a */
    public static final class C27864a {
        private C27864a() {
        }

        public /* synthetic */ C27864a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo67390a() {
            return C27863a.f70990c;
        }
    }

    public C27863a(C36546y yVar) {
        C41536l.m120489i(yVar, "app");
        this.f70991a = yVar.getSharedPreferences("sca_contacts_local_storage", 0);
    }

    /* renamed from: b */
    public final int mo67388b() {
        return this.f70991a.getInt("sca_offer_open_count", 0);
    }

    /* renamed from: c */
    public final void mo67389c() {
        this.f70991a.edit().putInt("sca_offer_open_count", mo67388b() + 1).apply();
        f70990c = true;
    }
}

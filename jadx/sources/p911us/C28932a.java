package p911us;

import android.content.SharedPreferences;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: us.a */
public final class C28932a {

    /* renamed from: b */
    public static final C28933a f73788b = new C28933a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static boolean f73789c;

    /* renamed from: a */
    private final SharedPreferences f73790a;

    /* renamed from: us.a$a */
    public static final class C28933a {
        private C28933a() {
        }

        public /* synthetic */ C28933a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo68687a() {
            return C28932a.f73789c;
        }
    }

    public C28932a(C36546y yVar) {
        C41536l.m120489i(yVar, "app");
        this.f73790a = yVar.getSharedPreferences("sca_offer_local_storage", 0);
    }

    /* renamed from: b */
    public final int mo68685b() {
        return this.f73790a.getInt("sca_offer_open_count", 0);
    }

    /* renamed from: c */
    public final void mo68686c() {
        f73789c = true;
        this.f73790a.edit().putInt("sca_offer_open_count", mo68685b() + 1).apply();
    }
}

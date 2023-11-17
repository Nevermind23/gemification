package r21;

import android.content.SharedPreferences;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m31.C37222a;
import w41.C39517c;
import w41.C39521f;

/* renamed from: r21.a */
public final class C38279a implements C37222a, C39517c.C39518a {

    /* renamed from: e */
    public static final C38280a f91787e = new C38280a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final SharedPreferences f91788d;

    /* renamed from: r21.a$a */
    public static final class C38280a {
        private C38280a() {
        }

        public /* synthetic */ C38280a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C38279a(SharedPreferences sharedPreferences) {
        C41536l.m120489i(sharedPreferences, "sharedPreferences");
        this.f91788d = sharedPreferences;
    }

    /* renamed from: a */
    public void mo90294a(long j, String str) {
        C41536l.m120489i(str, "popupType");
        C39521f fVar = C39521f.f93966a;
        SharedPreferences sharedPreferences = getSharedPreferences();
        C39521f.m114878j(fVar, sharedPreferences, j, "SHOW_COMMON_POPUP#" + str, System.currentTimeMillis(), false, 8, (Object) null);
    }

    /* renamed from: b */
    public long mo90295b(long j, String str) {
        C41536l.m120489i(str, "popupType");
        C39521f fVar = C39521f.f93966a;
        SharedPreferences sharedPreferences = getSharedPreferences();
        return fVar.mo93167c(sharedPreferences, j, "SHOW_COMMON_POPUP#" + str, 0);
    }

    public SharedPreferences getSharedPreferences() {
        return this.f91788d;
    }
}

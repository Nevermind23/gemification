package z51;

import android.content.SharedPreferences;
import h61.C36154a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w41.C39517c;
import w41.C39521f;

/* renamed from: z51.a */
public final class C40148a implements C36154a, C39517c.C39518a {

    /* renamed from: e */
    public static final C40149a f95400e = new C40149a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final SharedPreferences f95401d;

    /* renamed from: z51.a$a */
    public static final class C40149a {
        private C40149a() {
        }

        public /* synthetic */ C40149a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C40148a(SharedPreferences sharedPreferences) {
        C41536l.m120489i(sharedPreferences, "sharedPreferences");
        this.f95401d = sharedPreferences;
    }

    /* renamed from: c */
    private final String m116290c(long j) {
        return "KEY_STORY_SEEN|" + j;
    }

    /* renamed from: a */
    public void mo88911a(long j, long j2) {
        C39521f.m114877h(C39521f.f93966a, getSharedPreferences(), j2, m116290c(j), true, false, 8, (Object) null);
    }

    /* renamed from: b */
    public boolean mo88912b(long j, long j2) {
        return C39521f.m114876b(C39521f.f93966a, getSharedPreferences(), j2, m116290c(j), false, 4, (Object) null);
    }

    public SharedPreferences getSharedPreferences() {
        return this.f95401d;
    }
}

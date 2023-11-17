package p341ge.bog.sso_client.models;

import kotlin.jvm.internal.DefaultConstructorMarker;
import sso.type.Locale;

/* renamed from: ge.bog.sso_client.models.m */
public enum C35952m {
    KA(Locale.KA, "GE", (Locale) null, 4, (String) null),
    TR(Locale.TR, (int) null, (Locale) null, 6, (String) null),
    EN(Locale.EN, (int) null, (Locale) null, 6, (String) null);
    

    /* renamed from: g */
    public static final C35953a f86978g = null;

    /* renamed from: d */
    private final Locale f86983d;

    /* renamed from: e */
    private final String f86984e;

    /* renamed from: f */
    private final String f86985f;

    /* renamed from: ge.bog.sso_client.models.m$a */
    public static final class C35953a {
        private C35953a() {
        }

        public /* synthetic */ C35953a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        f86978g = new C35953a((DefaultConstructorMarker) null);
    }

    private C35952m(Locale locale, String str, String str2) {
        this.f86983d = locale;
        this.f86984e = str;
        this.f86985f = str2;
    }

    /* renamed from: b */
    public final String mo88523b() {
        return this.f86984e;
    }

    /* renamed from: c */
    public final Locale mo88524c() {
        return this.f86983d;
    }

    /* renamed from: e */
    public final String mo88525e() {
        return this.f86985f;
    }
}

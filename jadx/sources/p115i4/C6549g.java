package p115i4;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;

/* renamed from: i4.g */
public class C6549g {

    /* renamed from: a */
    private C6551h f19996a;

    /* renamed from: i4.g$a */
    public enum C6550a {
        AUTO,
        EXPLICIT_ONLY
    }

    private C6549g(Context context, String str, AccessToken accessToken) {
        this.f19996a = new C6551h(context, str, accessToken);
    }

    /* renamed from: a */
    public static void m25844a(Application application, String str) {
        C6551h.m25853a(application, str);
    }

    /* renamed from: c */
    public static String m25845c(Context context) {
        return C6551h.m25856e(context);
    }

    /* renamed from: d */
    public static C6550a m25846d() {
        return C6551h.m25857f();
    }

    /* renamed from: e */
    public static String m25847e() {
        return C6533b.m25805b();
    }

    /* renamed from: f */
    public static void m25848f(Context context, String str) {
        C6551h.m25860i(context, str);
    }

    /* renamed from: h */
    public static C6549g m25849h(Context context) {
        return new C6549g(context, (String) null, (AccessToken) null);
    }

    /* renamed from: i */
    public static void m25850i() {
        C6551h.m25864u();
    }

    /* renamed from: b */
    public void mo20529b() {
        this.f19996a.mo20531c();
    }

    /* renamed from: g */
    public void mo20530g(String str, Bundle bundle) {
        this.f19996a.mo20533m(str, bundle);
    }
}

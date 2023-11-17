package p115i4;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C2626d;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import p115i4.C6549g;

/* renamed from: i4.m */
public class C6564m {

    /* renamed from: a */
    private C6551h f20029a;

    public C6564m(Context context) {
        this(new C6551h(context, (String) null, (AccessToken) null));
    }

    /* renamed from: b */
    static Executor m25883b() {
        return C6551h.m25855d();
    }

    /* renamed from: c */
    public static C6549g.C6550a m25884c() {
        return C6551h.m25857f();
    }

    /* renamed from: d */
    static String m25885d() {
        return C6551h.m25859h();
    }

    /* renamed from: n */
    public static void m25886n(Map map) {
        C6569p.m25915i(map);
    }

    /* renamed from: a */
    public void mo20545a() {
        this.f20029a.mo20531c();
    }

    /* renamed from: e */
    public void mo20546e(Bundle bundle) {
        boolean z;
        if ((bundle.getInt("previous") & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || C2626d.m10138i()) {
            this.f20029a.mo20536p("fb_sdk_settings_changed", (Double) null, bundle);
        }
    }

    /* renamed from: f */
    public void mo20547f(String str, double d, Bundle bundle) {
        if (C2626d.m10138i()) {
            this.f20029a.mo20532l(str, d, bundle);
        }
    }

    /* renamed from: g */
    public void mo20548g(String str, Bundle bundle) {
        if (C2626d.m10138i()) {
            this.f20029a.mo20533m(str, bundle);
        }
    }

    /* renamed from: h */
    public void mo20549h(String str, String str2) {
        this.f20029a.mo20535o(str, str2);
    }

    /* renamed from: i */
    public void mo20550i(String str) {
        if (C2626d.m10138i()) {
            this.f20029a.mo20536p(str, (Double) null, (Bundle) null);
        }
    }

    /* renamed from: j */
    public void mo20551j(String str, Bundle bundle) {
        if (C2626d.m10138i()) {
            this.f20029a.mo20536p(str, (Double) null, bundle);
        }
    }

    /* renamed from: k */
    public void mo20552k(String str, Double d, Bundle bundle) {
        if (C2626d.m10138i()) {
            this.f20029a.mo20536p(str, d, bundle);
        }
    }

    /* renamed from: l */
    public void mo20553l(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (C2626d.m10138i()) {
            this.f20029a.mo20537q(str, bigDecimal, currency, bundle);
        }
    }

    /* renamed from: m */
    public void mo20554m(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (C2626d.m10138i()) {
            this.f20029a.mo20539s(bigDecimal, currency, bundle);
        }
    }

    public C6564m(Context context, String str) {
        this(new C6551h(context, str, (AccessToken) null));
    }

    public C6564m(String str, String str2, AccessToken accessToken) {
        this(new C6551h(str, str2, accessToken));
    }

    C6564m(C6551h hVar) {
        this.f20029a = hVar;
    }
}

package p380ck;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.util.C1004d;
import ba1.C10146d0;
import com.facebook.C2626d;
import com.github.mikephil.charting.utils.Utils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.C5263a;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.analytics.PiCart;
import com.salesforce.marketingcloud.analytics.PiCartItem;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdk;
import com.salesforce.marketingcloud.sfmcsdk.components.behaviors.Behavior;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import g91.C32359z0;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.Iterator;
import p115i4.C6549g;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.sso_client.models.DeviceIdentifier;
import p380ck.C10464h;
import p420fh.C12902d;
import p434gh.C15278a;

/* renamed from: ck.g */
public class C10463g {

    /* renamed from: b */
    private static C10463g f29793b;

    /* renamed from: c */
    private static FirebaseAnalytics f29794c;

    /* renamed from: d */
    private static C6549g f29795d;

    /* renamed from: a */
    private final Client f29796a;

    private C10463g(Context context, Client client) {
        f29794c = FirebaseAnalytics.getInstance(context);
        f29795d = C6549g.m25849h(context);
        C2626d.m10128F(true);
        C2626d.m10132c();
        C2626d.m10129G(true);
        C2626d.m10127E(false);
        this.f29796a = client;
        mo27151r();
        f29794c.mo17405c("deviceId", (String) null);
        DeviceIdentifier g = C10146d0.C10148b.m37109g();
        if (g != null && g.getDeviceId() != null) {
            f29794c.mo17405c("deviceId", g.getDeviceId().toString());
        }
    }

    /* renamed from: B */
    private void m37988B(String str, String str2, String str3, Bundle bundle) {
        String str4;
        if (bundle == null) {
            bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("event_name", str);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("label", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString(UrlHandler.ACTION, str2);
            }
        }
        Client client = this.f29796a;
        if (client != null) {
            if (!client.isAuthorized() || str2.equals("click_forgot_passcode") || str2.equals("click_forgot_password")) {
                str4 = "pre_login";
            } else {
                str4 = "after_login";
            }
            bundle.putString("auth_state", str4);
        }
        m38003m(str, bundle);
    }

    /* renamed from: C */
    public static void m37989C(String str) {
        try {
            C10468i.m38037a(str + " extCustomer: " + C36546y.m108285N().mo89317P().getExtCustomerId());
        } catch (Exception unused) {
            C10468i.m38037a(str + "; couldn't get keycloakSessionToken and extCustomerId");
        }
    }

    /* renamed from: D */
    private void m37990D(String str, String str2, String str3, Bundle bundle) {
        String str4;
        if (bundle == null) {
            bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("event_name", str);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("label", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString(UrlHandler.ACTION, str2);
            }
        }
        Client client = this.f29796a;
        if (client != null) {
            if (!client.isAuthorized() || str2.equals("click_forgot_passcode") || str2.equals("click_forgot_password")) {
                str4 = "pre_login";
            } else {
                str4 = "after_login";
            }
            bundle.putString("auth_state", str4);
        }
        m38004n(str, bundle);
    }

    /* renamed from: f */
    private void m37996f(String str, String str2, Bundle bundle) {
        new Handler(Looper.getMainLooper()).postDelayed(new C10459c(bundle, str, str2), 500);
    }

    /* renamed from: g */
    public static C10463g m37997g(Context context, Client client) {
        if (f29793b == null) {
            f29793b = new C10463g(context, client);
        }
        return f29793b;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m37998h(Bundle bundle, String str, String str2) {
        C35388f2 L = C36546y.m108285N().mo89314L();
        if (C36546y.m108285N().mo89316O().isAnalyticLoggingEnabled() && L != null) {
            String str3 = "";
            if (bundle != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putAll(bundle);
                if (bundle2.getString("event_name") != null && !bundle2.getString("event_name").isEmpty()) {
                    str3 = str3 + "category - " + bundle2.getString("event_name") + "; ";
                    bundle2.remove("event_name");
                }
                if (bundle2.getString("label") != null && !bundle2.getString("label").isEmpty()) {
                    str3 = str3 + "label - " + bundle2.getString("label") + "; ";
                    bundle2.remove("label");
                }
                if (bundle2.getString(UrlHandler.ACTION) != null && !bundle2.getString(UrlHandler.ACTION).isEmpty()) {
                    str3 = str3 + "action - " + bundle2.getString(UrlHandler.ACTION) + "; ";
                    bundle2.remove(UrlHandler.ACTION);
                }
                for (String next : bundle2.keySet()) {
                    str3 = str3 + next + " - " + bundle2.getString(next) + "; ";
                }
            }
            C12902d.m48759f(L, false).mo33652k(str + ": category - " + str2 + "; params:\n" + str3, C15278a.INFO, C12902d.C12905b.C12906a.f38103a);
        }
    }

    /* renamed from: m */
    private void m38003m(String str, Bundle bundle) {
        f29795d.mo20530g(str, bundle);
        m37996f("facebook", str, bundle);
    }

    /* renamed from: n */
    private void m38004n(String str, Bundle bundle) {
        f29794c.mo17403a(str, bundle);
        m37996f("firebase", str, bundle);
    }

    /* renamed from: A */
    public void mo27133A(Activity activity, String str) {
        if (!TextUtils.isEmpty(str) && str.length() > 40) {
            str = str.substring(0, 40);
        }
        mo27152s("success_message", activity.getLocalClassName(), str);
    }

    /* renamed from: E */
    public void mo27134E(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("method", str);
        m38004n("login", bundle);
        m38003m("login", bundle);
    }

    /* renamed from: F */
    public void mo27135F(String str, String str2, String str3, String str4, String str5, String str6) {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("error_code", C32359z0.m95587p0(str, 100));
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("error_key", C32359z0.m95587p0(str2, 100));
        }
        if (!TextUtils.isEmpty(str3)) {
            bundle.putString("error_text", C32359z0.m95587p0(str3, 100));
        }
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString("error_full", C32359z0.m95587p0(str4, 100));
        }
        if (!TextUtils.isEmpty(str5)) {
            bundle.putString("error_dict_text", C32359z0.m95587p0(str5, 100));
        }
        if (!TextUtils.isEmpty(str6)) {
            bundle.putString("error_activity", C32359z0.m95587p0(str6, 100));
        }
        m38004n("event_error", bundle);
    }

    /* renamed from: G */
    public void mo27136G(String str, String str2, String str3, Bundle bundle) {
        String str4;
        if (bundle == null) {
            bundle = new Bundle();
            bundle.putString("event_name", str);
            bundle.putString("label", str3);
            bundle.putString(UrlHandler.ACTION, str2);
        }
        Client client = this.f29796a;
        if (client != null) {
            if (client.isAuthorized()) {
                str4 = "after_login";
            } else {
                str4 = "pre_login";
            }
            bundle.putString("auth_state", str4);
        }
        m38004n(str2, bundle);
    }

    /* renamed from: H */
    public void mo27137H(String str, String str2, String str3, Bundle bundle, C10464h.C10465a aVar) {
        if (C10464h.C10465a.FACEBOOK.equals(aVar)) {
            m37988B(str, str2, str3, bundle);
        } else if (C10464h.C10465a.FIREBASE.equals(aVar)) {
            m37990D(str, str2, str3, bundle);
        } else {
            m37988B(str, str2, str3, bundle);
            m37990D(str, str2, str3, bundle);
        }
    }

    /* renamed from: I */
    public void mo27138I(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("Category", "screen");
        bundle.putString(Behavior.ScreenEntry.KEY_NAME, str);
        m38004n("view", bundle);
    }

    /* renamed from: J */
    public void mo27139J(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("search_item", str);
        m38004n("search", bundle);
    }

    /* renamed from: K */
    public void mo27140K(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(C11769i.C11770a.f34148k, str);
        bundle.putString("item_id", "");
        m38004n("share", bundle);
    }

    /* renamed from: L */
    public void mo27141L() {
        Bundle bundle = new Bundle();
        bundle.putString("method", "plastic_card");
        m38004n("sign_up", bundle);
        m38003m("sign_up", bundle);
    }

    /* renamed from: M */
    public void mo27142M(String str) {
        f29794c.mo17405c("clientCategory", str);
    }

    /* renamed from: N */
    public void mo27143N(String str) {
        f29794c.mo17405c("clientKey", str);
    }

    /* renamed from: O */
    public void mo27144O(String str) {
        f29794c.mo17405c("language", str);
    }

    /* renamed from: P */
    public void mo27145P(String str) {
        f29794c.mo17405c("deviceId", str);
    }

    /* renamed from: Q */
    public void mo27146Q(Long l) {
        if (l != null) {
            FirebaseAnalytics firebaseAnalytics = f29794c;
            firebaseAnalytics.mo17404b(l + "");
        }
    }

    /* renamed from: R */
    public void mo27147R(String str) {
        if (!TextUtils.isEmpty(str)) {
            C5263a.m20766a().mo17446f(str);
            f29794c.mo17404b(str);
        }
    }

    /* renamed from: o */
    public void mo27148o(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PiCartItem(str, 1, Utils.DOUBLE_EPSILON));
        SFMCSdk.requestSdk(new C10461e(new PiCart(arrayList)));
    }

    /* renamed from: p */
    public void mo27149p(String str) {
        mo27150q(str, Double.valueOf(Utils.DOUBLE_EPSILON));
    }

    /* renamed from: q */
    public void mo27150q(String str, Double d) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PiCartItem(str, 1, d.doubleValue()));
        SFMCSdk.requestSdk(new C10458b(new PiCart(arrayList)));
    }

    /* renamed from: r */
    public void mo27151r() {
        f29794c.mo17405c("clientKey", (String) null);
    }

    /* renamed from: s */
    public void mo27152s(String str, String str2, String str3) {
        mo27155v(str, str2, str3, (Long) null, (ArrayList) null);
    }

    /* renamed from: t */
    public void mo27153t(String str, String str2, String str3, Long l) {
        mo27155v(str, str2, str3, l, (ArrayList) null);
    }

    /* renamed from: u */
    public void mo27154u(String str, String str2, String str3, Long l, String str4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1004d.m3516a("event_label_2", str4));
        mo27155v(str, str2, str3, l, arrayList);
    }

    /* renamed from: v */
    public void mo27155v(String str, String str2, String str3, Long l, ArrayList arrayList) {
        String str4;
        String str5;
        Bundle bundle = new Bundle();
        Client client = this.f29796a;
        if (client != null) {
            if (client.isAuthorized()) {
                str5 = "after_login";
            } else {
                str5 = "pre_login";
            }
            bundle.putString("auth_state", str5);
        }
        if (!"otp_fill".equals(str3) || l == null || (l.longValue() <= 1000 && l.longValue() >= 0)) {
            bundle.putString("event_name", str);
            bundle.putString("label", str2);
            bundle.putString(UrlHandler.ACTION, str3);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C1004d dVar = (C1004d) it.next();
                    Object obj = dVar.f3642a;
                    String str6 = null;
                    if (obj != null) {
                        str4 = (String) obj;
                    } else {
                        str4 = null;
                    }
                    Object obj2 = dVar.f3643b;
                    if (obj2 != null) {
                        str6 = (String) obj2;
                    }
                    bundle.putString(str4, str6);
                }
            }
            if (l != null) {
                bundle.putLong("action_value", l.longValue());
            }
            m38004n(str, bundle);
        }
    }

    /* renamed from: w */
    public void mo27156w(String str, String str2, String str3, String str4) {
        mo27154u(str, str2, str3, (Long) null, str4);
    }

    /* renamed from: x */
    public void mo27157x(String str, C10464h.C10465a aVar) {
        C10464h.C10465a aVar2 = C10464h.C10465a.FACEBOOK;
        if (aVar2.equals(aVar)) {
            Bundle bundle = new Bundle();
            bundle.putString("event_name", str);
            m38003m(str, bundle);
            return;
        }
        C10464h.C10465a aVar3 = C10464h.C10465a.FIREBASE;
        if (aVar3.equals(aVar)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("event_name", str);
            m38004n(str, bundle2);
        } else if (C10464h.C10465a.FACEBOOKANDFIREBASE.equals(aVar)) {
            mo27157x(str, aVar2);
            mo27157x(str, aVar3);
        }
    }

    /* renamed from: y */
    public void mo27158y(Activity activity, String str) {
        mo27152s("error_message", activity.getLocalClassName(), str);
    }

    /* renamed from: z */
    public void mo27159z(Activity activity, String str) {
        if (!TextUtils.isEmpty(str) && str.length() > 40) {
            str = str.substring(0, 40);
        }
        mo27152s("info_message", activity.getLocalClassName(), str);
    }
}

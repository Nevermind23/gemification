package p193o4;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.C2626d;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p115i4.C6549g;
import p115i4.C6564m;
import p297w4.C8775b0;
import p297w4.C8813l;
import p297w4.C8817m;
import p297w4.C8819n;

/* renamed from: o4.d */
public abstract class C7442d {

    /* renamed from: a */
    private static final String f21712a = "o4.d";

    /* renamed from: b */
    private static final C6564m f21713b = new C6564m(C2626d.m10134e());

    /* renamed from: o4.d$a */
    private static class C7443a {

        /* renamed from: a */
        BigDecimal f21714a;

        /* renamed from: b */
        Currency f21715b;

        /* renamed from: c */
        Bundle f21716c;

        C7443a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            this.f21714a = bigDecimal;
            this.f21715b = currency;
            this.f21716c = bundle;
        }
    }

    /* renamed from: a */
    private static C7443a m28300a(String str, String str2) {
        return m28301b(str, str2, new HashMap());
    }

    /* renamed from: b */
    private static C7443a m28301b(String str, String str2, Map map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
            String optString = jSONObject2.optString("type");
            bundle.putCharSequence("fb_iap_product_type", optString);
            if (optString.equals("subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String optString2 = jSONObject2.optString("introductoryPriceCycles");
                if (!optString2.isEmpty()) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", optString2);
                }
            }
            for (String str3 : map.keySet()) {
                bundle.putCharSequence(str3, (CharSequence) map.get(str3));
            }
            return new C7443a(new BigDecimal(((double) jSONObject2.getLong("price_amount_micros")) / 1000000.0d), Currency.getInstance(jSONObject2.getString("price_currency_code")), bundle);
        } catch (JSONException e) {
            Log.e(f21712a, "Error parsing in-app subscription data.", e);
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m28302c() {
        C8817m j = C8819n.m32843j(C2626d.m10135f());
        if (j == null || !C2626d.m10138i() || !j.mo24242e()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static void m28303d() {
        Context e = C2626d.m10134e();
        String f = C2626d.m10135f();
        boolean i = C2626d.m10138i();
        C8775b0.m32716i(e, "context");
        if (!i) {
            return;
        }
        if (e instanceof Application) {
            C6549g.m25844a((Application) e, f);
        } else {
            Log.w(f21712a, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
        }
    }

    /* renamed from: e */
    public static void m28304e(String str, long j) {
        Context e = C2626d.m10134e();
        String f = C2626d.m10135f();
        C8775b0.m32716i(e, "context");
        C8817m o = C8819n.m32848o(f, false);
        if (o != null && o.mo24238a() && j > 0) {
            C6564m mVar = new C6564m(e);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_aa_time_spent_view_name", str);
            mVar.mo20547f("fb_aa_time_spent_on_view", (double) j, bundle);
        }
    }

    /* renamed from: f */
    static void m28305f(String str, String str2, boolean z) {
        C7443a a;
        String str3;
        if (m28302c() && (a = m28300a(str, str2)) != null) {
            boolean z2 = false;
            if (z && C8813l.m32808f("app_events_if_auto_log_subs", C2626d.m10135f(), false)) {
                z2 = true;
            }
            if (z2) {
                if (C7453i.m28332m(str2)) {
                    str3 = "StartTrial";
                } else {
                    str3 = "Subscribe";
                }
                f21713b.mo20553l(str3, a.f21714a, a.f21715b, a.f21716c);
                return;
            }
            f21713b.mo20554m(a.f21714a, a.f21715b, a.f21716c);
        }
    }
}

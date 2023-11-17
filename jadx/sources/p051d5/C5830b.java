package p051d5;

import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C2626d;
import com.facebook.GraphRequest;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p036c5.C2263c;
import p334z4.C9207a;

/* renamed from: d5.b */
public abstract class C5830b {

    /* renamed from: a */
    private static final Random f18338a = new Random();

    /* renamed from: b */
    private static Integer f18339b = 1000;

    /* renamed from: c */
    private static boolean f18340c;

    /* renamed from: d */
    private static final C2263c f18341d = C5832c.m23503e(C5834d.m23506c(), C5835e.m23510b());

    /* renamed from: e */
    private static final C5829a f18342e = C5829a.m23496a();

    /* renamed from: f */
    private static final Map f18343f = new HashMap();

    /* renamed from: g */
    private static final AtomicLong f18344g = new AtomicLong(0);

    /* renamed from: d5.b$a */
    static class C5831a implements Runnable {
        C5831a() {
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    JSONObject b = C5830b.m23498b();
                    if (b != null) {
                        C5830b.m23500d(b);
                    }
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: a */
    protected static void m23497a() {
        Class<C5830b> cls = C5830b.class;
        if (!C9207a.m34024c(cls)) {
            try {
                if (!f18340c) {
                    f18340c = true;
                    m23499c();
                    f18341d.mo7305a();
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: b */
    static JSONObject m23498b() {
        Class<C5830b> cls = C5830b.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", "monitoring_config");
            GraphRequest J = GraphRequest.m10012J((AccessToken) null, C2626d.m10135f(), (GraphRequest.C2612e) null);
            J.mo8182a0(true);
            J.mo8181Z(bundle);
            return J.mo8184g().mo8280h();
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    static void m23499c() {
        Class<C5830b> cls = C5830b.class;
        if (!C9207a.m34024c(cls)) {
            try {
                C2626d.m10142m().execute(new C5831a());
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: d */
    static void m23500d(JSONObject jSONObject) {
        Class<C5830b> cls = C5830b.class;
        if (!C9207a.m34024c(cls)) {
            try {
                JSONArray jSONArray = jSONObject.getJSONObject("monitoring_config").getJSONArray("sample_rates");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    String string = jSONObject2.getString("key");
                    int i2 = jSONObject2.getInt(C11755a.C11756a.f34100b);
                    if ("default".equals(string)) {
                        f18339b = Integer.valueOf(i2);
                    } else {
                        f18343f.put(string, Integer.valueOf(i2));
                    }
                }
            } catch (JSONException unused) {
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }
}

package p297w4;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.AccessToken;
import com.facebook.C2626d;
import com.facebook.GraphRequest;
import com.medallia.digital.mobilesdk.C10749b8;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p334z4.C9207a;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: w4.l */
public abstract class C8813l {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final AtomicBoolean f24736a = new AtomicBoolean(false);

    /* renamed from: b */
    private static final ConcurrentLinkedQueue f24737b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    private static final Map f24738c = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static Long f24739d;

    /* renamed from: w4.l$a */
    static class C8814a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ String f24740d;

        /* renamed from: e */
        final /* synthetic */ Context f24741e;

        /* renamed from: f */
        final /* synthetic */ String f24742f;

        C8814a(String str, Context context, String str2) {
            this.f24740d = str;
            this.f24741e = context;
            this.f24742f = str2;
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    JSONObject a = C8813l.m32807e(this.f24740d);
                    if (a != null) {
                        C8813l.m32813k(this.f24740d, a);
                        this.f24741e.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(this.f24742f, a.toString()).apply();
                        Long unused = C8813l.f24739d = Long.valueOf(System.currentTimeMillis());
                    }
                    C8813l.m32814l();
                    C8813l.f24736a.set(false);
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: w4.l$b */
    static class C8815b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C8816c f24743d;

        C8815b(C8816c cVar) {
            this.f24743d = cVar;
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    this.f24743d.mo24232a();
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: w4.l$c */
    public interface C8816c {
        /* renamed from: a */
        void mo24232a();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static JSONObject m32807e(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(C11772k.C11773a.f34170b, "android");
        bundle.putString(C11772k.C11773a.f34186r, C2626d.m10149t());
        bundle.putString("fields", "gatekeepers");
        GraphRequest J = GraphRequest.m10012J((AccessToken) null, String.format("%s/%s", new Object[]{str, "mobile_sdk_gk"}), (GraphRequest.C2612e) null);
        J.mo8182a0(true);
        J.mo8181Z(bundle);
        return J.mo8184g().mo8280h();
    }

    /* renamed from: f */
    public static boolean m32808f(String str, String str2, boolean z) {
        Boolean bool;
        Map g = m32809g(str2);
        if (g.containsKey(str) && (bool = (Boolean) g.get(str)) != null) {
            return bool.booleanValue();
        }
        return z;
    }

    /* renamed from: g */
    public static Map m32809g(String str) {
        m32811i();
        if (str != null) {
            Map map = f24738c;
            if (map.containsKey(str)) {
                HashMap hashMap = new HashMap();
                JSONObject jSONObject = (JSONObject) map.get(str);
                if (jSONObject == null) {
                    return new HashMap();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
                }
                return hashMap;
            }
        }
        return new HashMap();
    }

    /* renamed from: h */
    private static boolean m32810h(Long l) {
        return l != null && System.currentTimeMillis() - l.longValue() < C10749b8.C10751b.f30744c;
    }

    /* renamed from: i */
    static void m32811i() {
        m32812j((C8816c) null);
    }

    /* renamed from: j */
    static synchronized void m32812j(C8816c cVar) {
        synchronized (C8813l.class) {
            if (cVar != null) {
                f24737b.add(cVar);
            }
            if (m32810h(f24739d)) {
                m32814l();
                return;
            }
            Context e = C2626d.m10134e();
            String f = C2626d.m10135f();
            String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", new Object[]{f});
            if (e != null) {
                JSONObject jSONObject = null;
                String string = e.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(format, (String) null);
                if (!C8769a0.m32644Q(string)) {
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException e2) {
                        C8769a0.m32648U("FacebookSDK", e2);
                    }
                    if (jSONObject != null) {
                        m32813k(f, jSONObject);
                    }
                }
                Executor m = C2626d.m10142m();
                if (m != null) {
                    if (f24736a.compareAndSet(false, true)) {
                        m.execute(new C8814a(f, e, format));
                    }
                }
            }
        }
    }

    /* renamed from: k */
    protected static synchronized JSONObject m32813k(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        synchronized (C8813l.class) {
            Map map = f24738c;
            if (map.containsKey(str)) {
                jSONObject2 = (JSONObject) map.get(str);
            } else {
                jSONObject2 = new JSONObject();
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            if (optJSONArray != null) {
                jSONObject3 = optJSONArray.optJSONObject(0);
            } else {
                jSONObject3 = null;
            }
            if (!(jSONObject3 == null || jSONObject3.optJSONArray("gatekeepers") == null)) {
                JSONArray optJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
                for (int i = 0; i < optJSONArray2.length(); i++) {
                    try {
                        JSONObject jSONObject4 = optJSONArray2.getJSONObject(i);
                        jSONObject2.put(jSONObject4.getString("key"), jSONObject4.getBoolean(C11755a.C11756a.f34100b));
                    } catch (JSONException e) {
                        C8769a0.m32648U("FacebookSDK", e);
                    }
                }
            }
            f24738c.put(str, jSONObject2);
        }
        return jSONObject2;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static void m32814l() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = f24737b;
            if (!concurrentLinkedQueue.isEmpty()) {
                C8816c cVar = (C8816c) concurrentLinkedQueue.poll();
                if (cVar != null) {
                    handler.post(new C8815b(cVar));
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: m */
    static JSONObject m32815m(String str, boolean z) {
        if (!z) {
            Map map = f24738c;
            if (map.containsKey(str)) {
                return (JSONObject) map.get(str);
            }
        }
        JSONObject e = m32807e(str);
        if (e == null) {
            return null;
        }
        Context e2 = C2626d.m10134e();
        e2.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(String.format("com.facebook.internal.APP_GATEKEEPERS.%s", new Object[]{str}), e.toString()).apply();
        return m32813k(str, e);
    }
}

package p297w4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.C1612n;
import com.facebook.AccessToken;
import com.facebook.C2626d;
import com.facebook.GraphRequest;
import com.salesforce.marketingcloud.C11398b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p154l4.C6887e;
import p193o4.C7442d;
import p193o4.C7444e;
import p193o4.C7448h;
import p297w4.C8817m;
import p334z4.C9207a;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: w4.n */
public abstract class C8819n {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f24767a = "n";

    /* renamed from: b */
    private static final String[] f24768b = {"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting"};
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Map f24769c = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final AtomicReference f24770d = new AtomicReference(C8823d.NOT_LOADED);

    /* renamed from: e */
    private static final ConcurrentLinkedQueue f24771e = new ConcurrentLinkedQueue();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static boolean f24772f = false;

    /* renamed from: g */
    private static boolean f24773g = false;

    /* renamed from: h */
    private static JSONArray f24774h = null;

    /* renamed from: w4.n$a */
    static class C8820a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ Context f24775d;

        /* renamed from: e */
        final /* synthetic */ String f24776e;

        /* renamed from: f */
        final /* synthetic */ String f24777f;

        C8820a(Context context, String str, String str2) {
            this.f24775d = context;
            this.f24776e = str;
            this.f24777f = str2;
        }

        public void run() {
            SharedPreferences sharedPreferences;
            C8817m mVar;
            C8823d dVar;
            JSONObject jSONObject;
            if (!C9207a.m34024c(this)) {
                try {
                    sharedPreferences = this.f24775d.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                    mVar = null;
                    String string = sharedPreferences.getString(this.f24776e, (String) null);
                    if (!C8769a0.m32644Q(string)) {
                        jSONObject = new JSONObject(string);
                        if (jSONObject != null) {
                            mVar = C8819n.m32845l(this.f24777f, jSONObject);
                        }
                    }
                } catch (JSONException e) {
                    C8769a0.m32648U("FacebookSDK", e);
                    jSONObject = null;
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                    return;
                }
                JSONObject a = C8819n.m32842i(this.f24777f);
                if (a != null) {
                    C8819n.m32845l(this.f24777f, a);
                    sharedPreferences.edit().putString(this.f24776e, a.toString()).apply();
                }
                if (mVar != null) {
                    String i = mVar.mo24246i();
                    if (!C8819n.f24772f && i != null && i.length() > 0) {
                        boolean unused = C8819n.f24772f = true;
                        Log.w(C8819n.f24767a, i);
                    }
                }
                C8813l.m32815m(this.f24777f, true);
                C7442d.m28303d();
                C7448h.m28319h();
                AtomicReference f = C8819n.f24770d;
                if (C8819n.f24769c.containsKey(this.f24777f)) {
                    dVar = C8823d.SUCCESS;
                } else {
                    dVar = C8823d.ERROR;
                }
                f.set(dVar);
                C8819n.m32847n();
            }
        }
    }

    /* renamed from: w4.n$b */
    static class C8821b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C8824e f24778d;

        C8821b(C8824e eVar) {
            this.f24778d = eVar;
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    this.f24778d.mo20543a();
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: w4.n$c */
    static class C8822c implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C8824e f24779d;

        /* renamed from: e */
        final /* synthetic */ C8817m f24780e;

        C8822c(C8824e eVar, C8817m mVar) {
            this.f24779d = eVar;
            this.f24780e = mVar;
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    this.f24779d.mo20544b(this.f24780e);
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: w4.n$d */
    enum C8823d {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    /* renamed from: w4.n$e */
    public interface C8824e {
        /* renamed from: a */
        void mo20543a();

        /* renamed from: b */
        void mo20544b(C8817m mVar);
    }

    /* renamed from: h */
    public static void m32841h(C8824e eVar) {
        f24771e.add(eVar);
        m32844k();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static JSONObject m32842i(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", TextUtils.join(",", new ArrayList(Arrays.asList(f24768b))));
        GraphRequest J = GraphRequest.m10012J((AccessToken) null, str, (GraphRequest.C2612e) null);
        J.mo8182a0(true);
        J.mo8181Z(bundle);
        return J.mo8184g().mo8280h();
    }

    /* renamed from: j */
    public static C8817m m32843j(String str) {
        if (str != null) {
            return (C8817m) f24769c.get(str);
        }
        return null;
    }

    /* renamed from: k */
    public static void m32844k() {
        boolean z;
        Context e = C2626d.m10134e();
        String f = C2626d.m10135f();
        if (C8769a0.m32644Q(f)) {
            f24770d.set(C8823d.ERROR);
            m32847n();
        } else if (f24769c.containsKey(f)) {
            f24770d.set(C8823d.SUCCESS);
            m32847n();
        } else {
            AtomicReference atomicReference = f24770d;
            C8823d dVar = C8823d.NOT_LOADED;
            C8823d dVar2 = C8823d.LOADING;
            if (C1612n.m5659a(atomicReference, dVar, dVar2) || C1612n.m5659a(atomicReference, C8823d.ERROR, dVar2)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                m32847n();
                return;
            }
            C2626d.m10142m().execute(new C8820a(e, String.format("com.facebook.internal.APP_SETTINGS.%s", new Object[]{f}), f));
        }
    }

    /* renamed from: l */
    protected static C8817m m32845l(String str, JSONObject jSONObject) {
        C8801h hVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        JSONObject jSONObject2 = jSONObject;
        JSONArray optJSONArray = jSONObject2.optJSONArray("android_sdk_error_categories");
        if (optJSONArray == null) {
            hVar = C8801h.m32781c();
        } else {
            hVar = C8801h.m32780b(optJSONArray);
        }
        C8801h hVar2 = hVar;
        int optInt = jSONObject2.optInt("app_events_feature_bitmask", 0);
        if ((optInt & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((optInt & 16) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((optInt & 32) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((optInt & C11398b.f33139r) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((optInt & 16384) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("auto_event_mapping_android");
        f24774h = optJSONArray2;
        if (optJSONArray2 != null && C8828p.m32860b()) {
            C6887e.m26735b(optJSONArray2.toString());
        }
        C8817m mVar = r2;
        C8817m mVar2 = new C8817m(jSONObject2.optBoolean("supports_implicit_sdk_logging", false), jSONObject2.optString("gdpv4_nux_content", ""), jSONObject2.optBoolean("gdpv4_nux_enabled", false), jSONObject2.optInt("app_events_session_timeout", C7444e.m28306a()), C8846w.m32935b(jSONObject2.optLong("seamless_login")), m32846m(jSONObject2.optJSONObject("android_dialog_configs")), z, hVar2, jSONObject2.optString("smart_login_bookmark_icon_url"), jSONObject2.optString("smart_login_menu_icon_url"), z2, z3, optJSONArray2, jSONObject2.optString("sdk_update_message"), z4, z5, jSONObject2.optString("aam_rules"), jSONObject2.optString("suggested_events_setting"), jSONObject2.optString("restrictive_data_filter_params"));
        C8817m mVar3 = mVar;
        f24769c.put(str, mVar3);
        return mVar3;
    }

    /* renamed from: m */
    private static Map m32846m(JSONObject jSONObject) {
        JSONArray optJSONArray;
        HashMap hashMap = new HashMap();
        if (!(jSONObject == null || (optJSONArray = jSONObject.optJSONArray("data")) == null)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                C8817m.C8818a c = C8817m.C8818a.m32830c(optJSONArray.optJSONObject(i));
                if (c != null) {
                    String a = c.mo24251a();
                    Map map = (Map) hashMap.get(a);
                    if (map == null) {
                        map = new HashMap();
                        hashMap.put(a, map);
                    }
                    map.put(c.mo24252b(), c);
                }
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        return;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m32847n() {
        /*
            java.lang.Class<w4.n> r0 = p297w4.C8819n.class
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference r1 = f24770d     // Catch:{ all -> 0x006d }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x006d }
            w4.n$d r1 = (p297w4.C8819n.C8823d) r1     // Catch:{ all -> 0x006d }
            w4.n$d r2 = p297w4.C8819n.C8823d.NOT_LOADED     // Catch:{ all -> 0x006d }
            boolean r2 = r2.equals(r1)     // Catch:{ all -> 0x006d }
            if (r2 != 0) goto L_0x006b
            w4.n$d r2 = p297w4.C8819n.C8823d.LOADING     // Catch:{ all -> 0x006d }
            boolean r2 = r2.equals(r1)     // Catch:{ all -> 0x006d }
            if (r2 == 0) goto L_0x001c
            goto L_0x006b
        L_0x001c:
            java.lang.String r2 = com.facebook.C2626d.m10135f()     // Catch:{ all -> 0x006d }
            java.util.Map r3 = f24769c     // Catch:{ all -> 0x006d }
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x006d }
            w4.m r2 = (p297w4.C8817m) r2     // Catch:{ all -> 0x006d }
            android.os.Handler r3 = new android.os.Handler     // Catch:{ all -> 0x006d }
            android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x006d }
            r3.<init>(r4)     // Catch:{ all -> 0x006d }
            w4.n$d r4 = p297w4.C8819n.C8823d.ERROR     // Catch:{ all -> 0x006d }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x006d }
            if (r1 == 0) goto L_0x0052
        L_0x0039:
            java.util.concurrent.ConcurrentLinkedQueue r1 = f24771e     // Catch:{ all -> 0x006d }
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x006d }
            if (r2 != 0) goto L_0x0050
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x006d }
            w4.n$e r1 = (p297w4.C8819n.C8824e) r1     // Catch:{ all -> 0x006d }
            w4.n$b r2 = new w4.n$b     // Catch:{ all -> 0x006d }
            r2.<init>(r1)     // Catch:{ all -> 0x006d }
            r3.post(r2)     // Catch:{ all -> 0x006d }
            goto L_0x0039
        L_0x0050:
            monitor-exit(r0)
            return
        L_0x0052:
            java.util.concurrent.ConcurrentLinkedQueue r1 = f24771e     // Catch:{ all -> 0x006d }
            boolean r4 = r1.isEmpty()     // Catch:{ all -> 0x006d }
            if (r4 != 0) goto L_0x0069
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x006d }
            w4.n$e r1 = (p297w4.C8819n.C8824e) r1     // Catch:{ all -> 0x006d }
            w4.n$c r4 = new w4.n$c     // Catch:{ all -> 0x006d }
            r4.<init>(r1, r2)     // Catch:{ all -> 0x006d }
            r3.post(r4)     // Catch:{ all -> 0x006d }
            goto L_0x0052
        L_0x0069:
            monitor-exit(r0)
            return
        L_0x006b:
            monitor-exit(r0)
            return
        L_0x006d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p297w4.C8819n.m32847n():void");
    }

    /* renamed from: o */
    public static C8817m m32848o(String str, boolean z) {
        if (!z) {
            Map map = f24769c;
            if (map.containsKey(str)) {
                return (C8817m) map.get(str);
            }
        }
        JSONObject i = m32842i(str);
        if (i == null) {
            return null;
        }
        C8817m l = m32845l(str, i);
        if (str.equals(C2626d.m10135f())) {
            f24770d.set(C8823d.SUCCESS);
            m32847n();
        }
        return l;
    }
}

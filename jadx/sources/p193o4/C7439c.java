package p193o4;

import android.content.Context;
import com.facebook.C2645k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import p115i4.C6549g;
import p297w4.C8765a;
import p297w4.C8769a0;
import p297w4.C8831r;

/* renamed from: o4.c */
public abstract class C7439c {

    /* renamed from: a */
    private static final Map f21708a = new C7440a();

    /* renamed from: o4.c$a */
    static class C7440a extends HashMap {
        C7440a() {
            put(C7441b.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL");
            put(C7441b.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS");
        }
    }

    /* renamed from: o4.c$b */
    public enum C7441b {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    /* renamed from: a */
    public static JSONObject m28299a(C7441b bVar, C8765a aVar, String str, boolean z, Context context) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f21708a.get(bVar));
        String e = C6549g.m25847e();
        if (e != null) {
            jSONObject.put("app_user_id", e);
        }
        C8769a0.m32681n0(jSONObject, aVar, str, z);
        try {
            C8769a0.m32683o0(jSONObject, context);
        } catch (Exception e2) {
            C8831r.m32867h(C2645k.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e2.toString());
        }
        JSONObject w = C8769a0.m32695w();
        if (w != null) {
            Iterator<String> keys = w.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, w.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}

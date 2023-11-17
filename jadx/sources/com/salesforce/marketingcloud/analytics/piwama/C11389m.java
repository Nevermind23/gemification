package com.salesforce.marketingcloud.analytics.piwama;

import com.salesforce.marketingcloud.C11398b;
import com.salesforce.marketingcloud.internal.C11516m;
import kotlin.jvm.internal.C41536l;
import org.json.JSONObject;

/* renamed from: com.salesforce.marketingcloud.analytics.piwama.m */
public abstract /* synthetic */ class C11389m {
    /* renamed from: a */
    public static String m41651a(C11373c cVar, String str, String str2, boolean z) {
        C41536l.m120489i(str, "<this>");
        C41536l.m120489i(str2, "fieldName");
        String obj = C40440x.m117146P0(str).toString();
        int length = obj.length();
        if (length == 0) {
            throw new IllegalArgumentException("PiEvent must contain a " + str2 + '.');
        } else if (length <= 1024) {
            return obj;
        } else {
            String substring = obj.substring(0, C11398b.f33141t);
            C41536l.m120488h(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            if (substring != null) {
                return C40440x.m117146P0(substring).toString();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    /* renamed from: b */
    public static void m41652b(C11373c cVar, JSONObject jSONObject) {
        C41536l.m120489i(jSONObject, "<this>");
        jSONObject.put("analyticType", cVar.mo29815c());
        jSONObject.put("api_endpoint", cVar.mo29814b());
        if (cVar.mo29811a().length() > 0) {
            jSONObject.put("event_name", cVar.mo29811a());
        }
        jSONObject.put("timestamp", C11516m.m42082a(cVar.mo29816d()));
    }
}

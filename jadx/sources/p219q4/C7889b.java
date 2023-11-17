package p219q4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import p115i4.C6535c;
import p167m4.C7093a;
import p219q4.C7890c;
import p297w4.C8769a0;
import p297w4.C8817m;
import p297w4.C8819n;
import p334z4.C9207a;

/* renamed from: q4.b */
abstract class C7889b {

    /* renamed from: a */
    private static final String f22847a = C7890c.class.getSimpleName();

    /* renamed from: a */
    static Bundle m29854a(C7890c.C7891a aVar, String str, List list) {
        Class<C7889b> cls = C7889b.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList(list);
            Bundle bundle = new Bundle();
            bundle.putString("event", aVar.toString());
            bundle.putString("app_id", str);
            if (C7890c.C7891a.CUSTOM_APP_EVENTS == aVar) {
                JSONArray b = m29855b(arrayList, str);
                if (b.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", b.toString());
            }
            return bundle;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    private static JSONArray m29855b(List list, String str) {
        Class<C7889b> cls = C7889b.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            C7093a.m27383d(list);
            boolean c = m29856c(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C6535c cVar = (C6535c) it.next();
                if (!cVar.mo20516f()) {
                    String str2 = f22847a;
                    C8769a0.m32649V(str2, "Event with invalid checksum: " + cVar.toString());
                } else if ((!cVar.mo20513b()) || (cVar.mo20513b() && c)) {
                    jSONArray.put(cVar.mo20514c());
                }
            }
            return jSONArray;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    private static boolean m29856c(String str) {
        Class<C7889b> cls = C7889b.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            C8817m o = C8819n.m32848o(str, false);
            if (o != null) {
                return o.mo24250m();
            }
            return false;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }
}

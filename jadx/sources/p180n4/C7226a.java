package p180n4;

import com.facebook.C2626d;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONObject;
import p206p4.C7700c;
import p297w4.C8813l;
import p334z4.C9207a;

/* renamed from: n4.a */
public abstract class C7226a {

    /* renamed from: a */
    private static boolean f21403a = false;

    /* renamed from: b */
    private static boolean f21404b = false;

    /* renamed from: a */
    public static void m27804a() {
        Class<C7226a> cls = C7226a.class;
        if (!C9207a.m34024c(cls)) {
            try {
                f21403a = true;
                f21404b = C8813l.m32808f("FBSDKFeatureIntegritySample", C2626d.m10135f(), false);
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: b */
    private static String m27805b(String str) {
        Class<C7226a> cls = C7226a.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            Arrays.fill(fArr, Utils.FLOAT_EPSILON);
            String[] o = C7700c.m29257o(C7700c.C7705e.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
            if (o == null) {
                return "none";
            }
            return o[0];
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    public static void m27806c(Map map) {
        Class<C7226a> cls = C7226a.class;
        if (!C9207a.m34024c(cls)) {
            try {
                if (f21403a && map.size() != 0) {
                    try {
                        ArrayList<String> arrayList = new ArrayList<>(map.keySet());
                        JSONObject jSONObject = new JSONObject();
                        for (String str : arrayList) {
                            String str2 = (String) map.get(str);
                            if (m27807d(str) || m27807d(str2)) {
                                map.remove(str);
                                if (!f21404b) {
                                    str2 = "";
                                }
                                jSONObject.put(str, str2);
                            }
                        }
                        if (jSONObject.length() != 0) {
                            map.put("_onDeviceParams", jSONObject.toString());
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: d */
    private static boolean m27807d(String str) {
        Class<C7226a> cls = C7226a.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            return !"none".equals(m27805b(str));
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }
}

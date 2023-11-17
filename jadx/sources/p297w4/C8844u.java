package p297w4;

import org.json.JSONObject;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: w4.u */
abstract class C8844u {

    /* renamed from: a */
    private static final ConcurrentHashMap f24817a = new ConcurrentHashMap();

    /* renamed from: a */
    public static JSONObject m32929a(String str) {
        return (JSONObject) f24817a.get(str);
    }

    /* renamed from: b */
    public static void m32930b(String str, JSONObject jSONObject) {
        f24817a.put(str, jSONObject);
    }
}

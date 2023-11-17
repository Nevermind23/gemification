package p310x4;

import com.facebook.AccessToken;
import com.facebook.C2626d;
import com.facebook.C2640g;
import com.facebook.C2642h;
import com.facebook.GraphRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p297w4.C8769a0;
import p297w4.C8808k;
import p310x4.C8955b;

/* renamed from: x4.a */
public abstract class C8953a {

    /* renamed from: a */
    private static boolean f24959a = false;

    /* renamed from: x4.a$a */
    static class C8954a implements GraphRequest.C2612e {

        /* renamed from: a */
        final /* synthetic */ C8955b f24960a;

        C8954a(C8955b bVar) {
            this.f24960a = bVar;
        }

        /* renamed from: a */
        public void mo107a(C2642h hVar) {
            try {
                if (hVar.mo8279g() == null && hVar.mo8280h().getBoolean("success")) {
                    this.f24960a.mo24372a();
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m33208a() {
        f24959a = true;
        if (C2626d.m10138i()) {
            m33210c();
        }
    }

    /* renamed from: b */
    public static void m33209b(Throwable th) {
        if (f24959a) {
            HashSet hashSet = new HashSet();
            for (StackTraceElement className : th.getStackTrace()) {
                C8808k.C8812d d = C8808k.m32794d(className.getClassName());
                if (d != C8808k.C8812d.Unknown) {
                    C8808k.m32793c(d);
                    hashSet.add(d.toString());
                }
            }
            if (C2626d.m10138i() && !hashSet.isEmpty()) {
                C8955b.C8957b.m33221b(new JSONArray(hashSet)).mo24375h();
            }
        }
    }

    /* renamed from: c */
    private static void m33210c() {
        if (!C8769a0.m32642O()) {
            File[] f = C8962d.m33232f();
            ArrayList arrayList = new ArrayList();
            for (File c : f) {
                C8955b c2 = C8955b.C8957b.m33222c(c);
                if (c2.mo24374g()) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("crash_shield", c2.toString());
                        arrayList.add(GraphRequest.m10013K((AccessToken) null, String.format("%s/instruments", new Object[]{C2626d.m10135f()}), jSONObject, new C8954a(c2)));
                    } catch (JSONException unused) {
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                new C2640g((Collection) arrayList).mo8267k();
            }
        }
    }
}

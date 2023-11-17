package p051d5;

import android.os.Build;
import android.support.p013v4.media.session.C0125b;
import com.facebook.AccessToken;
import com.facebook.C2626d;
import com.facebook.C2640g;
import com.facebook.GraphRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p036c5.C2262b;
import p036c5.C2263c;
import p036c5.C2264d;
import p297w4.C8769a0;
import p334z4.C9207a;

/* renamed from: d5.c */
public class C5832c implements C2263c {

    /* renamed from: f */
    private static final Integer f18345f = 100;

    /* renamed from: g */
    private static C5832c f18346g;

    /* renamed from: h */
    private static String f18347h = Build.VERSION.RELEASE;

    /* renamed from: i */
    private static String f18348i = Build.MODEL;

    /* renamed from: a */
    private final ScheduledExecutorService f18349a = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: b */
    private C2262b f18350b;

    /* renamed from: c */
    private C2264d f18351c;

    /* renamed from: d */
    private ScheduledFuture f18352d;

    /* renamed from: e */
    private final Runnable f18353e = new C5833a();

    /* renamed from: d5.c$a */
    class C5833a implements Runnable {
        C5833a() {
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    C5832c.this.mo19057d();
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    private C5832c(C2262b bVar, C2264d dVar) {
        if (this.f18350b == null) {
            this.f18350b = bVar;
        }
        if (this.f18351c == null) {
            this.f18351c = dVar;
        }
    }

    /* renamed from: b */
    static GraphRequest m23501b(List list) {
        String packageName = C2626d.m10134e().getPackageName();
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            C0125b.m366a(it.next());
            throw null;
        } else if (jSONArray.length() == 0) {
            return null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("device_os_version", f18347h);
                jSONObject.put("device_model", f18348i);
                jSONObject.put("unique_application_identifier", packageName);
                jSONObject.put("entries", jSONArray.toString());
                return GraphRequest.m10013K((AccessToken) null, String.format("%s/monitorings", new Object[]{C2626d.m10135f()}), jSONObject, (GraphRequest.C2612e) null);
            } catch (JSONException unused) {
                return null;
            }
        }
    }

    /* renamed from: c */
    static List m23502c(C2262b bVar) {
        ArrayList arrayList = new ArrayList();
        if (C8769a0.m32644Q(C2626d.m10135f())) {
            return arrayList;
        }
        while (!bVar.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < f18345f.intValue() && !bVar.isEmpty(); i++) {
                bVar.mo7303b();
                arrayList2.add((Object) null);
            }
            GraphRequest b = m23501b(arrayList2);
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static synchronized C5832c m23503e(C2262b bVar, C2264d dVar) {
        C5832c cVar;
        synchronized (C5832c.class) {
            if (f18346g == null) {
                f18346g = new C5832c(bVar, dVar);
            }
            cVar = f18346g;
        }
        return cVar;
    }

    /* renamed from: a */
    public void mo7305a() {
        this.f18350b.mo7302a(this.f18351c.mo7306a());
        mo19057d();
    }

    /* renamed from: d */
    public void mo19057d() {
        ScheduledFuture scheduledFuture = this.f18352d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        try {
            new C2640g((Collection) m23502c(this.f18350b)).mo8267k();
        } catch (Exception unused) {
        }
    }
}

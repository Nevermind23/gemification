package p322y4;

import android.util.Log;
import com.facebook.C2626d;
import com.facebook.C2642h;
import com.facebook.GraphRequest;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.json.JSONArray;
import org.json.JSONException;
import p297w4.C8769a0;
import p310x4.C8953a;
import p310x4.C8955b;
import p310x4.C8962d;

/* renamed from: y4.a */
public class C9058a implements Thread.UncaughtExceptionHandler {

    /* renamed from: b */
    private static final String f25240b = "y4.a";

    /* renamed from: c */
    private static C9058a f25241c;

    /* renamed from: a */
    private final Thread.UncaughtExceptionHandler f25242a;

    /* renamed from: y4.a$a */
    static class C9059a implements Comparator {
        C9059a() {
        }

        /* renamed from: a */
        public int compare(C8955b bVar, C8955b bVar2) {
            return bVar.mo24373b(bVar2);
        }
    }

    /* renamed from: y4.a$b */
    static class C9060b implements GraphRequest.C2612e {

        /* renamed from: a */
        final /* synthetic */ ArrayList f25243a;

        C9060b(ArrayList arrayList) {
            this.f25243a = arrayList;
        }

        /* renamed from: a */
        public void mo107a(C2642h hVar) {
            try {
                if (hVar.mo8279g() == null && hVar.mo8280h().getBoolean("success")) {
                    for (int i = 0; this.f25243a.size() > i; i++) {
                        ((C8955b) this.f25243a.get(i)).mo24372a();
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    private C9058a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f25242a = uncaughtExceptionHandler;
    }

    /* renamed from: a */
    public static synchronized void m33542a() {
        synchronized (C9058a.class) {
            if (C2626d.m10138i()) {
                m33543b();
            }
            if (f25241c != null) {
                Log.w(f25240b, "Already enabled!");
                return;
            }
            C9058a aVar = new C9058a(Thread.getDefaultUncaughtExceptionHandler());
            f25241c = aVar;
            Thread.setDefaultUncaughtExceptionHandler(aVar);
        }
    }

    /* renamed from: b */
    private static void m33543b() {
        if (!C8769a0.m32642O()) {
            File[] g = C8962d.m33233g();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (File c : g) {
                C8955b c2 = C8955b.C8957b.m33222c(c);
                if (c2.mo24374g()) {
                    arrayList.add(c2);
                }
            }
            Collections.sort(arrayList, new C9059a());
            JSONArray jSONArray = new JSONArray();
            while (i < arrayList.size() && i < 5) {
                jSONArray.put(arrayList.get(i));
                i++;
            }
            C8962d.m33235i("crash_reports", jSONArray, new C9060b(arrayList));
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (C8962d.m33231e(th)) {
            C8953a.m33209b(th);
            C8955b.C8957b.m33220a(th, C8955b.C8958c.CrashReport).mo24375h();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f25242a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}

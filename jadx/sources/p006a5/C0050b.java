package p006a5;

import com.facebook.C2626d;
import com.facebook.C2642h;
import com.facebook.GraphRequest;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.json.JSONArray;
import org.json.JSONException;
import p297w4.C8769a0;
import p310x4.C8962d;

/* renamed from: a5.b */
public abstract class C0050b {

    /* renamed from: a5.b$a */
    static class C0051a implements Comparator {
        C0051a() {
        }

        /* renamed from: a */
        public int compare(C0049a aVar, C0049a aVar2) {
            return aVar.mo100b(aVar2);
        }
    }

    /* renamed from: a5.b$b */
    static class C0052b implements GraphRequest.C2612e {

        /* renamed from: a */
        final /* synthetic */ ArrayList f92a;

        C0052b(ArrayList arrayList) {
            this.f92a = arrayList;
        }

        /* renamed from: a */
        public void mo107a(C2642h hVar) {
            try {
                if (hVar.mo8279g() == null && hVar.mo8280h().getBoolean("success")) {
                    for (int i = 0; this.f92a.size() > i; i++) {
                        ((C0049a) this.f92a.get(i)).mo99a();
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a5.b$c */
    static class C0053c implements FilenameFilter {
        C0053c() {
        }

        public boolean accept(File file, String str) {
            return str.matches(String.format("^%s[0-9]+.json$", new Object[]{"error_log_"}));
        }
    }

    /* renamed from: a */
    public static void m188a() {
        if (C2626d.m10138i()) {
            m191d();
        }
    }

    /* renamed from: b */
    public static File[] m189b() {
        File c = C8962d.m33229c();
        if (c == null) {
            return new File[0];
        }
        return c.listFiles(new C0053c());
    }

    /* renamed from: c */
    public static void m190c(String str) {
        try {
            new C0049a(str).mo103e();
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static void m191d() {
        if (!C8769a0.m32642O()) {
            File[] b = m189b();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (File aVar : b) {
                C0049a aVar2 = new C0049a(aVar);
                if (aVar2.mo102d()) {
                    arrayList.add(aVar2);
                }
            }
            Collections.sort(arrayList, new C0051a());
            JSONArray jSONArray = new JSONArray();
            while (i < arrayList.size() && i < 1000) {
                jSONArray.put(arrayList.get(i));
                i++;
            }
            C8962d.m33235i("error_reports", jSONArray, new C0052b(arrayList));
        }
    }
}

package p310x4;

import com.facebook.AccessToken;
import com.facebook.C2626d;
import com.facebook.GraphRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p297w4.C8769a0;

/* renamed from: x4.d */
public abstract class C8962d {

    /* renamed from: x4.d$a */
    static class C8963a implements FilenameFilter {
        C8963a() {
        }

        public boolean accept(File file, String str) {
            return str.matches(String.format("^%s[0-9]+.json$", new Object[]{"analysis_log_"}));
        }
    }

    /* renamed from: x4.d$b */
    static class C8964b implements FilenameFilter {
        C8964b() {
        }

        public boolean accept(File file, String str) {
            return str.matches(String.format("^(%s|%s|%s)[0-9]+.json$", new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}));
        }
    }

    /* renamed from: a */
    public static boolean m33227a(String str) {
        File c = m33229c();
        if (c == null || str == null) {
            return false;
        }
        return new File(c, str).delete();
    }

    /* renamed from: b */
    public static String m33228b(Throwable th) {
        if (th == null) {
            return null;
        }
        if (th.getCause() == null) {
            return th.toString();
        }
        return th.getCause().toString();
    }

    /* renamed from: c */
    public static File m33229c() {
        File file = new File(C2626d.m10134e().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    /* renamed from: d */
    public static String m33230d(Throwable th) {
        Throwable th2 = null;
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th != null && th != th2) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = th;
            th = th.getCause();
        }
        return jSONArray.toString();
    }

    /* renamed from: e */
    public static boolean m33231e(Throwable th) {
        if (th == null) {
            return false;
        }
        Throwable th2 = null;
        while (th != null && th != th2) {
            for (StackTraceElement className : th.getStackTrace()) {
                if (className.getClassName().startsWith("com.facebook")) {
                    return true;
                }
            }
            th2 = th;
            th = th.getCause();
        }
        return false;
    }

    /* renamed from: f */
    public static File[] m33232f() {
        File c = m33229c();
        if (c == null) {
            return new File[0];
        }
        File[] listFiles = c.listFiles(new C8963a());
        if (listFiles != null) {
            return listFiles;
        }
        return new File[0];
    }

    /* renamed from: g */
    public static File[] m33233g() {
        File c = m33229c();
        if (c == null) {
            return new File[0];
        }
        File[] listFiles = c.listFiles(new C8964b());
        if (listFiles != null) {
            return listFiles;
        }
        return new File[0];
    }

    /* renamed from: h */
    public static JSONObject m33234h(String str, boolean z) {
        File c = m33229c();
        if (!(c == null || str == null)) {
            try {
                return new JSONObject(C8769a0.m32663e0(new FileInputStream(new File(c, str))));
            } catch (Exception unused) {
                if (z) {
                    m33227a(str);
                }
            }
        }
        return null;
    }

    /* renamed from: i */
    public static void m33235i(String str, JSONArray jSONArray, GraphRequest.C2612e eVar) {
        if (jSONArray.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(str, jSONArray.toString());
                GraphRequest.m10013K((AccessToken) null, String.format("%s/instruments", new Object[]{C2626d.m10135f()}), jSONObject, eVar).mo8185i();
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: j */
    public static void m33236j(String str, String str2) {
        File c = m33229c();
        if (c != null && str != null && str2 != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(c, str));
                fileOutputStream.write(str2.getBytes());
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        }
    }
}

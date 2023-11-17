package p081f9;

import com.salesforce.marketingcloud.storage.p385db.C11769i;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import p027b9.C2184f;
import p068e9.C6063h;
import p133j9.C6762f;

/* renamed from: f9.d */
class C6176d {

    /* renamed from: b */
    private static final Charset f19151b = Charset.forName("UTF-8");

    /* renamed from: a */
    private final C6762f f19152a;

    /* renamed from: f9.d$a */
    class C6177a extends JSONObject {

        /* renamed from: a */
        final /* synthetic */ String f19153a;

        C6177a(String str) {
            this.f19153a = str;
            put("userId", str);
        }
    }

    public C6176d(C6762f fVar) {
        this.f19152a = fVar;
    }

    /* renamed from: d */
    private static Map m24612d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m24617k(jSONObject, next));
        }
        return hashMap;
    }

    /* renamed from: e */
    private String m24613e(String str) {
        return m24617k(new JSONObject(str), "userId");
    }

    /* renamed from: f */
    private static String m24614f(Map map) {
        return new JSONObject(map).toString();
    }

    /* renamed from: i */
    private static void m24615i(File file) {
        if (file.exists() && file.delete()) {
            C2184f f = C2184f.m8346f();
            f.mo7093g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    /* renamed from: j */
    private static String m24616j(String str) {
        return new C6177a(str).toString();
    }

    /* renamed from: k */
    private static String m24617k(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, (String) null);
        }
        return null;
    }

    /* renamed from: a */
    public File mo19750a(String str) {
        return this.f19152a.mo20802o(str, "internal-keys");
    }

    /* renamed from: b */
    public File mo19751b(String str) {
        return this.f19152a.mo20802o(str, C11769i.C11770a.f34151n);
    }

    /* renamed from: c */
    public File mo19752c(String str) {
        return this.f19152a.mo20802o(str, "user-data");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Map mo19753g(String str, boolean z) {
        File file;
        Exception e;
        FileInputStream fileInputStream;
        if (z) {
            file = mo19750a(str);
        } else {
            file = mo19751b(str);
        }
        if (!file.exists() || file.length() == 0) {
            m24615i(file);
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                Map d = m24612d(C6063h.m24209D(fileInputStream));
                C6063h.m24214e(fileInputStream, "Failed to close user metadata file.");
                return d;
            } catch (Exception e2) {
                e = e2;
                try {
                    C2184f.m8346f().mo7098l("Error deserializing user metadata.", e);
                    m24615i(file);
                    C6063h.m24214e(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    C6063h.m24214e(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e3) {
            Exception exc = e3;
            fileInputStream = null;
            e = exc;
            C2184f.m8346f().mo7098l("Error deserializing user metadata.", e);
            m24615i(file);
            C6063h.m24214e(fileInputStream, "Failed to close user metadata file.");
            return Collections.emptyMap();
        } catch (Throwable th2) {
            th = th2;
            C6063h.m24214e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* renamed from: h */
    public String mo19754h(String str) {
        FileInputStream fileInputStream;
        File c = mo19752c(str);
        FileInputStream fileInputStream2 = null;
        if (!c.exists() || c.length() == 0) {
            C2184f.m8346f().mo7089b("No userId set for session " + str);
            m24615i(c);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(c);
            try {
                String e = m24613e(C6063h.m24209D(fileInputStream));
                C2184f.m8346f().mo7089b("Loaded userId " + e + " for session " + str);
                C6063h.m24214e(fileInputStream, "Failed to close user metadata file.");
                return e;
            } catch (Exception e2) {
                e = e2;
                try {
                    C2184f.m8346f().mo7098l("Error deserializing user metadata.", e);
                    m24615i(c);
                    C6063h.m24214e(fileInputStream, "Failed to close user metadata file.");
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    C6063h.m24214e(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
            C2184f.m8346f().mo7098l("Error deserializing user metadata.", e);
            m24615i(c);
            C6063h.m24214e(fileInputStream, "Failed to close user metadata file.");
            return null;
        } catch (Throwable th2) {
            th = th2;
            C6063h.m24214e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* renamed from: l */
    public void mo19755l(String str, Map map, boolean z) {
        File file;
        if (z) {
            file = mo19750a(str);
        } else {
            file = mo19751b(str);
        }
        BufferedWriter bufferedWriter = null;
        try {
            String f = m24614f(map);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), f19151b));
            try {
                bufferedWriter2.write(f);
                bufferedWriter2.flush();
                C6063h.m24214e(bufferedWriter2, "Failed to close key/value metadata file.");
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    C2184f.m8346f().mo7098l("Error serializing key/value metadata.", e);
                    m24615i(file);
                    C6063h.m24214e(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    C6063h.m24214e(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                C6063h.m24214e(bufferedWriter, "Failed to close key/value metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C2184f.m8346f().mo7098l("Error serializing key/value metadata.", e);
            m24615i(file);
            C6063h.m24214e(bufferedWriter, "Failed to close key/value metadata file.");
        }
    }

    /* renamed from: m */
    public void mo19756m(String str, String str2) {
        File c = mo19752c(str);
        BufferedWriter bufferedWriter = null;
        try {
            String j = m24616j(str2);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c), f19151b));
            try {
                bufferedWriter2.write(j);
                bufferedWriter2.flush();
                C6063h.m24214e(bufferedWriter2, "Failed to close user metadata file.");
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    C2184f.m8346f().mo7098l("Error serializing user metadata.", e);
                    C6063h.m24214e(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    C6063h.m24214e(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                C6063h.m24214e(bufferedWriter, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C2184f.m8346f().mo7098l("Error serializing user metadata.", e);
            C6063h.m24214e(bufferedWriter, "Failed to close user metadata file.");
        }
    }
}

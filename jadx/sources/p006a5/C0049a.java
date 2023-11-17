package p006a5;

import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import p310x4.C8962d;

/* renamed from: a5.a */
public final class C0049a {

    /* renamed from: a */
    private String f89a;

    /* renamed from: b */
    private String f90b;

    /* renamed from: c */
    private Long f91c;

    public C0049a(String str) {
        this.f91c = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f90b = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        stringBuffer.append(this.f91c);
        stringBuffer.append(".json");
        this.f89a = stringBuffer.toString();
    }

    /* renamed from: a */
    public void mo99a() {
        C8962d.m33227a(this.f89a);
    }

    /* renamed from: b */
    public int mo100b(C0049a aVar) {
        Long l = this.f91c;
        if (l == null) {
            return -1;
        }
        Long l2 = aVar.f91c;
        if (l2 == null) {
            return 1;
        }
        return l2.compareTo(l);
    }

    /* renamed from: c */
    public JSONObject mo101c() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l = this.f91c;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            jSONObject.put("error_message", this.f90b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public boolean mo102d() {
        return (this.f90b == null || this.f91c == null) ? false : true;
    }

    /* renamed from: e */
    public void mo103e() {
        if (mo102d()) {
            C8962d.m33236j(this.f89a, toString());
        }
    }

    public String toString() {
        JSONObject c = mo101c();
        if (c == null) {
            return null;
        }
        return c.toString();
    }

    public C0049a(File file) {
        String name = file.getName();
        this.f89a = name;
        JSONObject h = C8962d.m33234h(name, true);
        if (h != null) {
            this.f91c = Long.valueOf(h.optLong("timestamp", 0));
            this.f90b = h.optString("error_message", (String) null);
        }
    }
}

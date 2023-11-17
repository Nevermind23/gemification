package p154l4;

import org.json.JSONObject;

/* renamed from: l4.c */
public final class C6884c {

    /* renamed from: a */
    public final String f20624a;

    /* renamed from: b */
    public final int f20625b;

    /* renamed from: c */
    public final int f20626c;

    /* renamed from: d */
    public final String f20627d;

    /* renamed from: e */
    public final String f20628e;

    /* renamed from: f */
    public final String f20629f;

    /* renamed from: g */
    public final String f20630g;

    /* renamed from: h */
    public final int f20631h;

    /* renamed from: l4.c$a */
    public enum C6885a {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);
        

        /* renamed from: d */
        private final int f20638d;

        private C6885a(int i) {
            this.f20638d = i;
        }

        /* renamed from: a */
        public int mo20977a() {
            return this.f20638d;
        }
    }

    C6884c(JSONObject jSONObject) {
        this.f20624a = jSONObject.getString("class_name");
        this.f20625b = jSONObject.optInt("index", -1);
        this.f20626c = jSONObject.optInt("id");
        this.f20627d = jSONObject.optString("text");
        this.f20628e = jSONObject.optString("tag");
        this.f20629f = jSONObject.optString("description");
        this.f20630g = jSONObject.optString("hint");
        this.f20631h = jSONObject.optInt("match_bitmask");
    }
}

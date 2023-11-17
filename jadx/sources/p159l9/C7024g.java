package p159l9;

import org.json.JSONObject;
import p027b9.C2184f;
import p068e9.C6104r;

/* renamed from: l9.g */
public class C7024g {

    /* renamed from: a */
    private final C6104r f20927a;

    C7024g(C6104r rVar) {
        this.f20927a = rVar;
    }

    /* renamed from: a */
    private static C7025h m27199a(int i) {
        if (i == 3) {
            return new C7029l();
        }
        C2184f f = C2184f.m8346f();
        f.mo7091d("Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.");
        return new C7016b();
    }

    /* renamed from: b */
    public C7018d mo21242b(JSONObject jSONObject) {
        return m27199a(jSONObject.getInt("settings_version")).mo21230a(this.f20927a, jSONObject);
    }
}

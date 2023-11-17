package p159l9;

import android.text.TextUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p027b9.C2184f;
import p068e9.C6089m;
import p120i9.C6617a;
import p120i9.C6618b;
import p120i9.C6619c;

/* renamed from: l9.c */
class C7017c implements C7028k {

    /* renamed from: a */
    private final String f20897a;

    /* renamed from: b */
    private final C6618b f20898b;

    /* renamed from: c */
    private final C2184f f20899c;

    public C7017c(String str, C6618b bVar) {
        this(str, bVar, C2184f.m8346f());
    }

    /* renamed from: b */
    private C6617a m27170b(C6617a aVar, C7027j jVar) {
        m27171c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", jVar.f20928a);
        m27171c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        m27171c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", C6089m.m24350i());
        m27171c(aVar, "Accept", "application/json");
        m27171c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", jVar.f20929b);
        m27171c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", jVar.f20930c);
        m27171c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", jVar.f20931d);
        m27171c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", jVar.f20932e.mo19643a());
        return aVar;
    }

    /* renamed from: c */
    private void m27171c(C6617a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.mo20641d(str, str2);
        }
    }

    /* renamed from: e */
    private JSONObject m27172e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            C2184f fVar = this.f20899c;
            fVar.mo7098l("Failed to parse settings JSON from " + this.f20897a, e);
            C2184f fVar2 = this.f20899c;
            fVar2.mo7097k("Settings response " + str);
            return null;
        }
    }

    /* renamed from: f */
    private Map m27173f(C7027j jVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", jVar.f20935h);
        hashMap.put("display_version", jVar.f20934g);
        hashMap.put("source", Integer.toString(jVar.f20936i));
        String str = jVar.f20933f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    /* renamed from: a */
    public JSONObject mo21231a(C7027j jVar, boolean z) {
        if (z) {
            try {
                Map f = m27173f(jVar);
                C6617a b = m27170b(mo21232d(f), jVar);
                C2184f fVar = this.f20899c;
                fVar.mo7089b("Requesting settings from " + this.f20897a);
                C2184f fVar2 = this.f20899c;
                fVar2.mo7095i("Settings query params were: " + f);
                return mo21233g(b.mo20640c());
            } catch (IOException e) {
                this.f20899c.mo7092e("Settings request failed.", e);
                return null;
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C6617a mo21232d(Map map) {
        C6617a a = this.f20898b.mo20642a(this.f20897a, map);
        return a.mo20641d("User-Agent", "Crashlytics Android SDK/" + C6089m.m24350i()).mo20641d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public JSONObject mo21233g(C6619c cVar) {
        int b = cVar.mo20644b();
        C2184f fVar = this.f20899c;
        fVar.mo7095i("Settings response code was: " + b);
        if (mo21234h(b)) {
            return m27172e(cVar.mo20643a());
        }
        C2184f fVar2 = this.f20899c;
        fVar2.mo7091d("Settings request failed; (status: " + b + ") from " + this.f20897a);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo21234h(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }

    C7017c(String str, C6618b bVar, C2184f fVar) {
        if (str != null) {
            this.f20899c = fVar;
            this.f20898b = bVar;
            this.f20897a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}

package p159l9;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p027b9.C2184f;
import p068e9.C6063h;
import p068e9.C6094m0;
import p068e9.C6104r;
import p068e9.C6106s;
import p068e9.C6108t;
import p068e9.C6114w;
import p120i9.C6618b;
import p133j9.C6762f;
import p337z7.C9225f;
import p337z7.C9227g;
import p337z7.C9231i;
import p337z7.Task;

/* renamed from: l9.f */
public class C7022f implements C7026i {

    /* renamed from: a */
    private final Context f20917a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C7027j f20918b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C7024g f20919c;

    /* renamed from: d */
    private final C6104r f20920d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C7015a f20921e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C7028k f20922f;

    /* renamed from: g */
    private final C6106s f20923g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final AtomicReference f20924h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final AtomicReference f20925i = new AtomicReference(new C9227g());

    /* renamed from: l9.f$a */
    class C7023a implements C9225f {
        C7023a() {
        }

        /* renamed from: b */
        public Task mo17657a(Void voidR) {
            JSONObject a = C7022f.this.f20922f.mo21231a(C7022f.this.f20918b, true);
            if (a != null) {
                C7018d b = C7022f.this.f20919c.mo21242b(a);
                C7022f.this.f20921e.mo21229c(b.f20902c, a);
                C7022f.this.m27190q(a, "Loaded settings: ");
                C7022f fVar = C7022f.this;
                boolean unused = fVar.m27191r(fVar.f20918b.f20933f);
                C7022f.this.f20924h.set(b);
                ((C9227g) C7022f.this.f20925i.get()).mo24887e(b);
            }
            return C9231i.m34113g((Object) null);
        }
    }

    C7022f(Context context, C7027j jVar, C6104r rVar, C7024g gVar, C7015a aVar, C7028k kVar, C6106s sVar) {
        AtomicReference atomicReference = new AtomicReference();
        this.f20924h = atomicReference;
        this.f20917a = context;
        this.f20918b = jVar;
        this.f20920d = rVar;
        this.f20919c = gVar;
        this.f20921e = aVar;
        this.f20922f = kVar;
        this.f20923g = sVar;
        atomicReference.set(C7016b.m27168b(rVar));
    }

    /* renamed from: l */
    public static C7022f m27187l(Context context, String str, C6114w wVar, C6618b bVar, String str2, String str3, C6762f fVar, C6106s sVar) {
        String g = wVar.mo19645g();
        C6094m0 m0Var = new C6094m0();
        C7024g gVar = new C7024g(m0Var);
        C7015a aVar = new C7015a(fVar);
        C7017c cVar = new C7017c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", new Object[]{str}), bVar);
        String h = wVar.mo19646h();
        String i = wVar.mo19647i();
        String j = wVar.mo19648j();
        String h2 = C6063h.m24217h(C6063h.m24224o(context), str, str3, str2);
        return new C7022f(context, new C7027j(str, h, i, j, wVar, h2, str3, str2, C6108t.m24429a(g).mo19640b()), m0Var, gVar, aVar, cVar, sVar);
    }

    /* renamed from: m */
    private C7018d m27188m(C7021e eVar) {
        C7018d dVar = null;
        try {
            if (C7021e.SKIP_CACHE_LOOKUP.equals(eVar)) {
                return null;
            }
            JSONObject b = this.f20921e.mo21228b();
            if (b != null) {
                C7018d b2 = this.f20919c.mo21242b(b);
                if (b2 != null) {
                    m27190q(b, "Loaded cached settings: ");
                    long a = this.f20920d.mo19626a();
                    if (!C7021e.IGNORE_CACHE_EXPIRATION.equals(eVar)) {
                        if (b2.mo21235a(a)) {
                            C2184f.m8346f().mo7095i("Cached settings have expired.");
                            return null;
                        }
                    }
                    try {
                        C2184f.m8346f().mo7095i("Returning cached settings.");
                        return b2;
                    } catch (Exception e) {
                        e = e;
                        dVar = b2;
                        C2184f.m8346f().mo7092e("Failed to get cached settings", e);
                        return dVar;
                    }
                } else {
                    C2184f.m8346f().mo7092e("Failed to parse cached settings data.", (Throwable) null);
                    return null;
                }
            } else {
                C2184f.m8346f().mo7089b("No cached settings data found.");
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            C2184f.m8346f().mo7092e("Failed to get cached settings", e);
            return dVar;
        }
    }

    /* renamed from: n */
    private String m27189n() {
        return C6063h.m24228s(this.f20917a).getString("existing_instance_identifier", "");
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m27190q(JSONObject jSONObject, String str) {
        C2184f f = C2184f.m8346f();
        f.mo7089b(str + jSONObject.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public boolean m27191r(String str) {
        SharedPreferences.Editor edit = C6063h.m24228s(this.f20917a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    /* renamed from: a */
    public Task mo21236a() {
        return ((C9227g) this.f20925i.get()).mo24883a();
    }

    /* renamed from: b */
    public C7018d mo21237b() {
        return (C7018d) this.f20924h.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo21238k() {
        return !m27189n().equals(this.f20918b.f20933f);
    }

    /* renamed from: o */
    public Task mo21239o(Executor executor) {
        return mo21240p(C7021e.USE_CACHE, executor);
    }

    /* renamed from: p */
    public Task mo21240p(C7021e eVar, Executor executor) {
        C7018d m;
        if (mo21238k() || (m = m27188m(eVar)) == null) {
            C7018d m2 = m27188m(C7021e.IGNORE_CACHE_EXPIRATION);
            if (m2 != null) {
                this.f20924h.set(m2);
                ((C9227g) this.f20925i.get()).mo24887e(m2);
            }
            return this.f20923g.mo19639h(executor).mo24874s(executor, new C7023a());
        }
        this.f20924h.set(m);
        ((C9227g) this.f20925i.get()).mo24887e(m);
        return C9231i.m34113g((Object) null);
    }
}

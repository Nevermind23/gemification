package p010a9;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p027b9.C2184f;
import p040c9.C2280a;
import p040c9.C2282c;
import p040c9.C2283d;
import p040c9.C2284e;
import p040c9.C2285f;
import p055d9.C5854a;
import p055d9.C5855b;
import p055d9.C5856c;
import p301w8.C8878a;
import p327y9.C9140a;
import p327y9.C9142b;

/* renamed from: a9.d */
public class C0086d {

    /* renamed from: a */
    private final C9140a f895a;

    /* renamed from: b */
    private volatile C2280a f896b;

    /* renamed from: c */
    private volatile C5855b f897c;

    /* renamed from: d */
    private final List f898d;

    public C0086d(C9140a aVar) {
        this(aVar, new C5856c(), new C2285f());
    }

    /* renamed from: f */
    private void m220f() {
        this.f895a.mo24710a(new C0085c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m221g(String str, Bundle bundle) {
        this.f896b.mo122a(str, bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m222h(C5854a aVar) {
        synchronized (this) {
            if (this.f897c instanceof C5856c) {
                this.f898d.add(aVar);
            }
            this.f897c.mo121a(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m223i(C9142b bVar) {
        C2184f.m8346f().mo7089b("AnalyticsConnector now available.");
        C8878a aVar = (C8878a) bVar.get();
        C2284e eVar = new C2284e(aVar);
        C0087e eVar2 = new C0087e();
        if (m224j(aVar, eVar2) != null) {
            C2184f.m8346f().mo7089b("Registered Firebase Analytics listener.");
            C2283d dVar = new C2283d();
            C2282c cVar = new C2282c(eVar, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                for (C5854a a : this.f898d) {
                    dVar.mo121a(a);
                }
                eVar2.mo127d(dVar);
                eVar2.mo128e(cVar);
                this.f897c = dVar;
                this.f896b = cVar;
            }
            return;
        }
        C2184f.m8346f().mo7097k("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    /* renamed from: j */
    private static C8878a.C8879a m224j(C8878a aVar, C0087e eVar) {
        C8878a.C8879a g = aVar.mo24308g("clx", eVar);
        if (g == null) {
            C2184f.m8346f().mo7089b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            g = aVar.mo24308g("crash", eVar);
            if (g != null) {
                C2184f.m8346f().mo7097k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return g;
    }

    /* renamed from: d */
    public C2280a mo124d() {
        return new C0084b(this);
    }

    /* renamed from: e */
    public C5855b mo125e() {
        return new C0083a(this);
    }

    public C0086d(C9140a aVar, C5855b bVar, C2280a aVar2) {
        this.f895a = aVar;
        this.f897c = bVar;
        this.f898d = new ArrayList();
        this.f896b = aVar2;
        m220f();
    }
}

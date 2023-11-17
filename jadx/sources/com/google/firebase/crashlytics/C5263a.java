package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.C5270e;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p010a9.C0086d;
import p027b9.C2178d;
import p027b9.C2181e;
import p027b9.C2184f;
import p068e9.C6049a;
import p068e9.C6057e;
import p068e9.C6063h;
import p068e9.C6089m;
import p068e9.C6106s;
import p068e9.C6109u;
import p068e9.C6114w;
import p120i9.C6618b;
import p133j9.C6762f;
import p159l9.C7022f;
import p327y9.C9140a;
import p337z7.C9215a;
import p337z7.C9231i;
import p337z7.Task;
import p339z9.C9270e;

/* renamed from: com.google.firebase.crashlytics.a */
public class C5263a {

    /* renamed from: a */
    final C6089m f16863a;

    /* renamed from: com.google.firebase.crashlytics.a$a */
    class C5264a implements C9215a {
        C5264a() {
        }

        /* renamed from: a */
        public Object mo17447a(Task task) {
            if (task.mo24873r()) {
                return null;
            }
            C2184f.m8346f().mo7092e("Error fetching settings.", task.mo24868m());
            return null;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.a$b */
    class C5265b implements Callable {

        /* renamed from: d */
        final /* synthetic */ boolean f16864d;

        /* renamed from: e */
        final /* synthetic */ C6089m f16865e;

        /* renamed from: f */
        final /* synthetic */ C7022f f16866f;

        C5265b(boolean z, C6089m mVar, C7022f fVar) {
            this.f16864d = z;
            this.f16865e = mVar;
            this.f16866f = fVar;
        }

        /* renamed from: a */
        public Void call() {
            if (!this.f16864d) {
                return null;
            }
            this.f16865e.mo19611g(this.f16866f);
            return null;
        }
    }

    private C5263a(C6089m mVar) {
        this.f16863a = mVar;
    }

    /* renamed from: a */
    public static C5263a m20766a() {
        C5263a aVar = (C5263a) C5270e.m20805l().mo17480i(C5263a.class);
        if (aVar != null) {
            return aVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    /* renamed from: b */
    static C5263a m20767b(C5270e eVar, C9270e eVar2, C9140a aVar, C9140a aVar2) {
        Context j = eVar.mo17481j();
        String packageName = j.getPackageName();
        C2184f f = C2184f.m8346f();
        f.mo7093g("Initializing Firebase Crashlytics " + C6089m.m24350i() + " for " + packageName);
        C6762f fVar = new C6762f(j);
        C6106s sVar = new C6106s(eVar);
        C6114w wVar = new C6114w(j, packageName, eVar2, sVar);
        C2178d dVar = new C2178d(aVar);
        C0086d dVar2 = new C0086d(aVar2);
        C5270e eVar3 = eVar;
        C6114w wVar2 = wVar;
        C6106s sVar2 = sVar;
        C6089m mVar = new C6089m(eVar3, wVar2, dVar, sVar2, dVar2.mo125e(), dVar2.mo124d(), fVar, C6109u.m24433c("Crashlytics Exception Handler"));
        String c = eVar.mo17483n().mo17517c();
        String o = C6063h.m24224o(j);
        List<C6057e> l = C6063h.m24221l(j);
        C2184f f2 = C2184f.m8346f();
        f2.mo7089b("Mapping file ID is: " + o);
        for (C6057e eVar4 : l) {
            C2184f.m8346f().mo7089b(String.format("Build id for %s on %s: %s", new Object[]{eVar4.mo19550c(), eVar4.mo19548a(), eVar4.mo19549b()}));
        }
        C6089m mVar2 = mVar;
        try {
            C6049a a = C6049a.m24173a(j, wVar, c, o, l, new C2181e(j));
            C2184f f3 = C2184f.m8346f();
            f3.mo7095i("Installer package name is: " + a.f18832d);
            ExecutorService c2 = C6109u.m24433c("com.google.firebase.crashlytics.startup");
            C7022f l2 = C7022f.m27187l(j, c, wVar, new C6618b(), a.f18834f, a.f18835g, fVar, sVar);
            l2.mo21239o(c2).mo24865j(c2, new C5264a());
            C9231i.m34110d(c2, new C5265b(mVar2.mo19616o(a, l2), mVar2, l2));
            return new C5263a(mVar2);
        } catch (PackageManager.NameNotFoundException e) {
            C2184f.m8346f().mo7092e("Error retrieving app package info.", e);
            return null;
        }
    }

    /* renamed from: c */
    public void mo17443c(String str) {
        this.f16863a.mo19612k(str);
    }

    /* renamed from: d */
    public void mo17444d(Throwable th) {
        if (th == null) {
            C2184f.m8346f().mo7097k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f16863a.mo19613l(th);
        }
    }

    /* renamed from: e */
    public void mo17445e(String str, String str2) {
        this.f16863a.mo19617p(str, str2);
    }

    /* renamed from: f */
    public void mo17446f(String str) {
        this.f16863a.mo19618q(str);
    }
}

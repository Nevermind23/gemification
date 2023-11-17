package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.firebase.installations.C5288f;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.C5460p;
import com.salesforce.marketingcloud.C11398b;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p260t6.C8404f;
import p301w8.C8878a;
import p327y9.C9142b;
import p337z7.C9231i;
import p337z7.Task;
import p339z9.C9270e;

/* renamed from: com.google.firebase.remoteconfig.internal.m */
public class C5455m {

    /* renamed from: j */
    public static final long f17413j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k */
    static final int[] f17414k = {2, 4, 8, 16, 32, 64, 128, C11398b.f33139r};

    /* renamed from: a */
    private final C9270e f17415a;

    /* renamed from: b */
    private final C9142b f17416b;

    /* renamed from: c */
    private final Executor f17417c;

    /* renamed from: d */
    private final C8404f f17418d;

    /* renamed from: e */
    private final Random f17419e;

    /* renamed from: f */
    private final C5444f f17420f;

    /* renamed from: g */
    private final ConfigFetchHttpClient f17421g;

    /* renamed from: h */
    private final C5460p f17422h;

    /* renamed from: i */
    private final Map f17423i;

    /* renamed from: com.google.firebase.remoteconfig.internal.m$a */
    public static class C5456a {

        /* renamed from: a */
        private final Date f17424a;

        /* renamed from: b */
        private final int f17425b;

        /* renamed from: c */
        private final C5447g f17426c;

        /* renamed from: d */
        private final String f17427d;

        private C5456a(Date date, int i, C5447g gVar, String str) {
            this.f17424a = date;
            this.f17425b = i;
            this.f17426c = gVar;
            this.f17427d = str;
        }

        /* renamed from: a */
        public static C5456a m21711a(Date date, C5447g gVar) {
            return new C5456a(date, 1, gVar, (String) null);
        }

        /* renamed from: b */
        public static C5456a m21712b(C5447g gVar, String str) {
            return new C5456a(gVar.mo18092g(), 0, gVar, str);
        }

        /* renamed from: c */
        public static C5456a m21713c(Date date) {
            return new C5456a(date, 2, (C5447g) null, (String) null);
        }

        /* renamed from: d */
        public C5447g mo18107d() {
            return this.f17426c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public String mo18108e() {
            return this.f17427d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public int mo18109f() {
            return this.f17425b;
        }
    }

    /* renamed from: com.google.firebase.remoteconfig.internal.m$b */
    public enum C5457b {
        BASE("BASE"),
        REALTIME("REALTIME");
        

        /* renamed from: d */
        private final String f17431d;

        private C5457b(String str) {
            this.f17431d = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo18110a() {
            return this.f17431d;
        }
    }

    public C5455m(C9270e eVar, C9142b bVar, Executor executor, C8404f fVar, Random random, C5444f fVar2, ConfigFetchHttpClient configFetchHttpClient, C5460p pVar, Map map) {
        this.f17415a = eVar;
        this.f17416b = bVar;
        this.f17417c = executor;
        this.f17418d = fVar;
        this.f17419e = random;
        this.f17420f = fVar2;
        this.f17421g = configFetchHttpClient;
        this.f17422h = pVar;
        this.f17423i = map;
    }

    /* renamed from: A */
    private C5460p.C5461a m21682A(int i, Date date) {
        if (m21700t(i)) {
            m21683B(date);
        }
        return this.f17422h.mo18115a();
    }

    /* renamed from: B */
    private void m21683B(Date date) {
        int b = this.f17422h.mo18115a().mo18133b() + 1;
        this.f17422h.mo18125k(b, new Date(date.getTime() + m21698q(b)));
    }

    /* renamed from: C */
    private void m21684C(Task task, Date date) {
        if (task.mo24873r()) {
            this.f17422h.mo18130p(date);
            return;
        }
        Exception m = task.mo24868m();
        if (m != null) {
            if (m instanceof FirebaseRemoteConfigFetchThrottledException) {
                this.f17422h.mo18131q();
            } else {
                this.f17422h.mo18129o();
            }
        }
    }

    /* renamed from: f */
    private boolean m21690f(long j, Date date) {
        Date e = this.f17422h.mo18119e();
        if (e.equals(C5460p.f17442e)) {
            return false;
        }
        return date.before(new Date(e.getTime() + TimeUnit.SECONDS.toMillis(j)));
    }

    /* renamed from: g */
    private FirebaseRemoteConfigServerException m21691g(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) {
        String str;
        int a = firebaseRemoteConfigServerException.mo18057a();
        if (a == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (a == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else if (a == 429) {
            throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
        } else if (a != 500) {
            switch (a) {
                case 502:
                case 503:
                case 504:
                    str = "The server is unavailable. Please try again later.";
                    break;
                default:
                    str = "The server returned an unexpected error.";
                    break;
            }
        } else {
            str = "There was an internal server error.";
        }
        int a2 = firebaseRemoteConfigServerException.mo18057a();
        return new FirebaseRemoteConfigServerException(a2, "Fetch failed: " + str, (Throwable) firebaseRemoteConfigServerException);
    }

    /* renamed from: h */
    private String m21692h(long j) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", new Object[]{DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j))});
    }

    /* renamed from: k */
    private C5456a m21693k(String str, String str2, Date date, Map map) {
        try {
            C5456a fetch = this.f17421g.fetch(this.f17421g.mo18073d(), str, str2, m21699s(), this.f17422h.mo18118d(), map, m21697p(), date);
            if (fetch.mo18107d() != null) {
                this.f17422h.mo18127m(fetch.mo18107d().mo18095i());
            }
            if (fetch.mo18108e() != null) {
                this.f17422h.mo18126l(fetch.mo18108e());
            }
            this.f17422h.mo18123i();
            return fetch;
        } catch (FirebaseRemoteConfigServerException e) {
            C5460p.C5461a A = m21682A(e.mo18057a(), date);
            if (m21706z(A, e.mo18057a())) {
                throw new FirebaseRemoteConfigFetchThrottledException(A.mo18132a().getTime());
            }
            throw m21691g(e);
        }
    }

    /* renamed from: l */
    private Task m21694l(String str, String str2, Date date, Map map) {
        try {
            C5456a k = m21693k(str, str2, date, map);
            if (k.mo18109f() != 0) {
                return C9231i.m34113g(k);
            }
            return this.f17420f.mo18084k(k.mo18107d()).mo24874s(this.f17417c, new C5454l(k));
        } catch (FirebaseRemoteConfigException e) {
            return C9231i.m34112f(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public Task m21701u(Task task, long j, Map map) {
        Task task2;
        Date date = new Date(this.f17418d.mo23594a());
        if (task.mo24873r() && m21690f(j, date)) {
            return C9231i.m34113g(C5456a.m21713c(date));
        }
        Date o = m21696o(date);
        if (o != null) {
            task2 = C9231i.m34112f(new FirebaseRemoteConfigFetchThrottledException(m21692h(o.getTime() - date.getTime()), o.getTime()));
        } else {
            Task a = this.f17415a.mo17504a();
            Task b = this.f17415a.mo17505b(false);
            task2 = C9231i.m34117k(a, b).mo24867l(this.f17417c, new C5452j(this, a, b, date, map));
        }
        return task2.mo24867l(this.f17417c, new C5453k(this, date));
    }

    /* renamed from: o */
    private Date m21696o(Date date) {
        Date a = this.f17422h.mo18115a().mo18132a();
        if (date.before(a)) {
            return a;
        }
        return null;
    }

    /* renamed from: p */
    private Long m21697p() {
        C8878a aVar = (C8878a) this.f17416b.get();
        if (aVar == null) {
            return null;
        }
        return (Long) aVar.mo24303c(true).get("_fot");
    }

    /* renamed from: q */
    private long m21698q(int i) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f17414k;
        long millis = timeUnit.toMillis((long) iArr[Math.min(i, iArr.length) - 1]);
        return (millis / 2) + ((long) this.f17419e.nextInt((int) millis));
    }

    /* renamed from: s */
    private Map m21699s() {
        HashMap hashMap = new HashMap();
        C8878a aVar = (C8878a) this.f17416b.get();
        if (aVar == null) {
            return hashMap;
        }
        for (Map.Entry entry : aVar.mo24303c(false).entrySet()) {
            hashMap.put((String) entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }

    /* renamed from: t */
    private boolean m21700t(int i) {
        return i == 429 || i == 502 || i == 503 || i == 504;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ Task m21703w(Task task, Task task2, Date date, Map map, Task task3) {
        if (!task.mo24873r()) {
            return C9231i.m34112f(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", (Throwable) task.mo24868m()));
        }
        if (!task2.mo24873r()) {
            return C9231i.m34112f(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", (Throwable) task2.mo24868m()));
        }
        return m21694l((String) task.mo24869n(), ((C5288f) task2.mo24869n()).mo17493b(), date, map);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ Task m21704x(Date date, Task task) {
        m21684C(task, date);
        return task;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ Task m21705y(Map map, Task task) {
        return m21701u(task, 0, map);
    }

    /* renamed from: z */
    private boolean m21706z(C5460p.C5461a aVar, int i) {
        return aVar.mo18133b() > 1 || i == 429;
    }

    /* renamed from: i */
    public Task mo18103i() {
        return mo18104j(this.f17422h.mo18121g());
    }

    /* renamed from: j */
    public Task mo18104j(long j) {
        HashMap hashMap = new HashMap(this.f17423i);
        hashMap.put("X-Firebase-RC-Fetch-Type", C5457b.BASE.mo18110a() + C11110u2.f31950c + 1);
        return this.f17420f.mo18081e().mo24867l(this.f17417c, new C5450h(this, j, hashMap));
    }

    /* renamed from: n */
    public Task mo18105n(C5457b bVar, int i) {
        HashMap hashMap = new HashMap(this.f17423i);
        hashMap.put("X-Firebase-RC-Fetch-Type", bVar.mo18110a() + C11110u2.f31950c + i);
        return this.f17420f.mo18081e().mo24867l(this.f17417c, new C5451i(this, hashMap));
    }

    /* renamed from: r */
    public long mo18106r() {
        return this.f17422h.mo18120f();
    }
}

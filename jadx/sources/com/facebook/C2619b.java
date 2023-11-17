package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.C2640g;
import com.facebook.GraphRequest;
import com.medallia.digital.mobilesdk.C10749b8;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p189o0.C7357a;
import p297w4.C8769a0;
import p297w4.C8775b0;
import p334z4.C9207a;

/* renamed from: com.facebook.b */
public final class C2619b {

    /* renamed from: f */
    private static volatile C2619b f8184f;

    /* renamed from: a */
    private final C7357a f8185a;

    /* renamed from: b */
    private final C2617a f8186b;

    /* renamed from: c */
    private AccessToken f8187c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public AtomicBoolean f8188d = new AtomicBoolean(false);

    /* renamed from: e */
    private Date f8189e = new Date(0);

    /* renamed from: com.facebook.b$a */
    class C2620a implements Runnable {
        C2620a(AccessToken.C2600b bVar) {
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    C2619b.this.m10108k((AccessToken.C2600b) null);
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.b$b */
    class C2621b implements GraphRequest.C2612e {

        /* renamed from: a */
        final /* synthetic */ AtomicBoolean f8191a;

        /* renamed from: b */
        final /* synthetic */ Set f8192b;

        /* renamed from: c */
        final /* synthetic */ Set f8193c;

        /* renamed from: d */
        final /* synthetic */ Set f8194d;

        C2621b(AtomicBoolean atomicBoolean, Set set, Set set2, Set set3) {
            this.f8191a = atomicBoolean;
            this.f8192b = set;
            this.f8193c = set2;
            this.f8194d = set3;
        }

        /* renamed from: a */
        public void mo107a(C2642h hVar) {
            JSONArray optJSONArray;
            JSONObject h = hVar.mo8280h();
            if (h != null && (optJSONArray = h.optJSONArray("data")) != null) {
                this.f8191a.set(true);
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("permission");
                        String optString2 = optJSONObject.optString("status");
                        if (!C8769a0.m32644Q(optString) && !C8769a0.m32644Q(optString2)) {
                            String lowerCase = optString2.toLowerCase(Locale.US);
                            if (lowerCase.equals("granted")) {
                                this.f8192b.add(optString);
                            } else if (lowerCase.equals("declined")) {
                                this.f8193c.add(optString);
                            } else if (lowerCase.equals("expired")) {
                                this.f8194d.add(optString);
                            } else {
                                Log.w("AccessTokenManager", "Unexpected status: " + lowerCase);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.facebook.b$c */
    class C2622c implements GraphRequest.C2612e {

        /* renamed from: a */
        final /* synthetic */ C2624e f8196a;

        C2622c(C2624e eVar) {
            this.f8196a = eVar;
        }

        /* renamed from: a */
        public void mo107a(C2642h hVar) {
            JSONObject h = hVar.mo8280h();
            if (h != null) {
                this.f8196a.f8205a = h.optString("access_token");
                this.f8196a.f8206b = h.optInt("expires_at");
                this.f8196a.f8207c = Long.valueOf(h.optLong("data_access_expiration_time"));
                this.f8196a.f8208d = h.optString("graph_domain", (String) null);
            }
        }
    }

    /* renamed from: com.facebook.b$d */
    class C2623d implements C2640g.C2641a {

        /* renamed from: a */
        final /* synthetic */ AccessToken f8198a;

        /* renamed from: b */
        final /* synthetic */ AtomicBoolean f8199b;

        /* renamed from: c */
        final /* synthetic */ C2624e f8200c;

        /* renamed from: d */
        final /* synthetic */ Set f8201d;

        /* renamed from: e */
        final /* synthetic */ Set f8202e;

        /* renamed from: f */
        final /* synthetic */ Set f8203f;

        C2623d(AccessToken accessToken, AccessToken.C2600b bVar, AtomicBoolean atomicBoolean, C2624e eVar, Set set, Set set2, Set set3) {
            this.f8198a = accessToken;
            this.f8199b = atomicBoolean;
            this.f8200c = eVar;
            this.f8201d = set;
            this.f8202e = set2;
            this.f8203f = set3;
        }

        /* renamed from: a */
        public void mo8238a(C2640g gVar) {
            Set set;
            Set set2;
            Set set3;
            Date date;
            Date date2;
            try {
                if (C2619b.m10107h().mo8233g() != null) {
                    if (C2619b.m10107h().mo8233g().mo8136u() == this.f8198a.mo8136u()) {
                        if (!this.f8199b.get()) {
                            C2624e eVar = this.f8200c;
                            if (eVar.f8205a == null && eVar.f8206b == 0) {
                                C2619b.this.f8188d.set(false);
                                return;
                            }
                        }
                        String str = this.f8200c.f8205a;
                        if (str == null) {
                            str = this.f8198a.mo8134t();
                        }
                        String str2 = str;
                        String g = this.f8198a.mo8124g();
                        String u = this.f8198a.mo8136u();
                        if (this.f8199b.get()) {
                            set = this.f8201d;
                        } else {
                            set = this.f8198a.mo8132q();
                        }
                        Set set4 = set;
                        if (this.f8199b.get()) {
                            set2 = this.f8202e;
                        } else {
                            set2 = this.f8198a.mo8127j();
                        }
                        Set set5 = set2;
                        if (this.f8199b.get()) {
                            set3 = this.f8203f;
                        } else {
                            set3 = this.f8198a.mo8128k();
                        }
                        Set set6 = set3;
                        C2625c s = this.f8198a.mo8133s();
                        if (this.f8200c.f8206b != 0) {
                            date = new Date(((long) this.f8200c.f8206b) * 1000);
                        } else {
                            date = this.f8198a.mo8129l();
                        }
                        Date date3 = date;
                        Date date4 = new Date();
                        if (this.f8200c.f8207c != null) {
                            date2 = new Date(1000 * this.f8200c.f8207c.longValue());
                        } else {
                            date2 = this.f8198a.mo8126i();
                        }
                        C2619b.m10107h().mo8236m(new AccessToken(str2, g, u, set4, set5, set6, s, date3, date4, date2, this.f8200c.f8208d));
                        C2619b.this.f8188d.set(false);
                    }
                }
            } finally {
                C2619b.this.f8188d.set(false);
            }
        }
    }

    /* renamed from: com.facebook.b$e */
    private static class C2624e {

        /* renamed from: a */
        public String f8205a;

        /* renamed from: b */
        public int f8206b;

        /* renamed from: c */
        public Long f8207c;

        /* renamed from: d */
        public String f8208d;

        private C2624e() {
        }

        /* synthetic */ C2624e(C2620a aVar) {
            this();
        }
    }

    C2619b(C7357a aVar, C2617a aVar2) {
        C8775b0.m32716i(aVar, "localBroadcastManager");
        C8775b0.m32716i(aVar2, "accessTokenCache");
        this.f8185a = aVar;
        this.f8186b = aVar2;
    }

    /* renamed from: c */
    private static GraphRequest m10105c(AccessToken accessToken, GraphRequest.C2612e eVar) {
        Bundle bundle = new Bundle();
        bundle.putString("grant_type", "fb_extend_sso_token");
        bundle.putString("client_id", accessToken.mo8124g());
        return new GraphRequest(accessToken, "oauth/access_token", bundle, C2643i.GET, eVar);
    }

    /* renamed from: d */
    private static GraphRequest m10106d(AccessToken accessToken, GraphRequest.C2612e eVar) {
        return new GraphRequest(accessToken, "me/permissions", new Bundle(), C2643i.GET, eVar);
    }

    /* renamed from: h */
    static C2619b m10107h() {
        if (f8184f == null) {
            synchronized (C2619b.class) {
                if (f8184f == null) {
                    f8184f = new C2619b(C7357a.m28044b(C2626d.m10134e()), new C2617a());
                }
            }
        }
        return f8184f;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m10108k(AccessToken.C2600b bVar) {
        AccessToken.C2600b bVar2 = bVar;
        AccessToken accessToken = this.f8187c;
        if (accessToken == null) {
            if (bVar2 != null) {
                bVar2.mo8144a(new FacebookException("No current access token to refresh"));
            }
        } else if (this.f8188d.compareAndSet(false, true)) {
            this.f8189e = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            C2624e eVar = new C2624e((C2620a) null);
            C2621b bVar3 = r0;
            C2621b bVar4 = new C2621b(atomicBoolean, hashSet, hashSet2, hashSet3);
            C2640g gVar = new C2640g(m10106d(accessToken, bVar3), m10105c(accessToken, new C2622c(eVar)));
            C2623d dVar = r0;
            C2623d dVar2 = new C2623d(accessToken, bVar, atomicBoolean, eVar, hashSet, hashSet2, hashSet3);
            gVar.mo8263g(dVar);
            gVar.mo8267k();
        } else if (bVar2 != null) {
            bVar2.mo8144a(new FacebookException("Refresh already in progress"));
        }
    }

    /* renamed from: l */
    private void m10109l(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(C2626d.m10134e(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.f8185a.mo21731d(intent);
    }

    /* renamed from: n */
    private void m10110n(AccessToken accessToken, boolean z) {
        AccessToken accessToken2 = this.f8187c;
        this.f8187c = accessToken;
        this.f8188d.set(false);
        this.f8189e = new Date(0);
        if (z) {
            if (accessToken != null) {
                this.f8186b.mo8229g(accessToken);
            } else {
                this.f8186b.mo8227a();
                C8769a0.m32666g(C2626d.m10134e());
            }
        }
        if (!C8769a0.m32656b(accessToken2, accessToken)) {
            m10109l(accessToken2, accessToken);
            m10111o();
        }
    }

    /* renamed from: o */
    private void m10111o() {
        Context e = C2626d.m10134e();
        AccessToken h = AccessToken.m9965h();
        AlarmManager alarmManager = (AlarmManager) e.getSystemService("alarm");
        if (AccessToken.m9967v() && h.mo8129l() != null && alarmManager != null) {
            Intent intent = new Intent(e, CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, h.mo8129l().getTime(), PendingIntent.getBroadcast(e, 0, intent, 0));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: p */
    private boolean m10112p() {
        if (this.f8187c == null) {
            return false;
        }
        Long valueOf = Long.valueOf(new Date().getTime());
        if (!this.f8187c.mo8133s().mo8241a() || valueOf.longValue() - this.f8189e.getTime() <= C10749b8.C10751b.f30744c || valueOf.longValue() - this.f8187c.mo8131p().getTime() <= 86400000) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo8231e() {
        AccessToken accessToken = this.f8187c;
        m10109l(accessToken, accessToken);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo8232f() {
        if (m10112p()) {
            mo8235j((AccessToken.C2600b) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public AccessToken mo8233g() {
        return this.f8187c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo8234i() {
        AccessToken f = this.f8186b.mo8228f();
        if (f == null) {
            return false;
        }
        m10110n(f, false);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo8235j(AccessToken.C2600b bVar) {
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            m10108k(bVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new C2620a(bVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo8236m(AccessToken accessToken) {
        m10110n(accessToken, true);
    }
}

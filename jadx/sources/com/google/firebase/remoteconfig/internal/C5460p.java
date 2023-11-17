package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import java.util.Date;
import p251sa.C8283h;
import p251sa.C8284i;

/* renamed from: com.google.firebase.remoteconfig.internal.p */
public class C5460p {

    /* renamed from: e */
    static final Date f17442e = new Date(-1);

    /* renamed from: f */
    static final Date f17443f = new Date(-1);

    /* renamed from: a */
    private final SharedPreferences f17444a;

    /* renamed from: b */
    private final Object f17445b = new Object();

    /* renamed from: c */
    private final Object f17446c = new Object();

    /* renamed from: d */
    private final Object f17447d = new Object();

    /* renamed from: com.google.firebase.remoteconfig.internal.p$a */
    static class C5461a {

        /* renamed from: a */
        private int f17448a;

        /* renamed from: b */
        private Date f17449b;

        C5461a(int i, Date date) {
            this.f17448a = i;
            this.f17449b = date;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Date mo18132a() {
            return this.f17449b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo18133b() {
            return this.f17448a;
        }
    }

    /* renamed from: com.google.firebase.remoteconfig.internal.p$b */
    static class C5462b {

        /* renamed from: a */
        private int f17450a;

        /* renamed from: b */
        private Date f17451b;

        C5462b(int i, Date date) {
            this.f17450a = i;
            this.f17451b = date;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Date mo18134a() {
            return this.f17451b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo18135b() {
            return this.f17450a;
        }
    }

    public C5460p(SharedPreferences sharedPreferences) {
        this.f17444a = sharedPreferences;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5461a mo18115a() {
        C5461a aVar;
        synchronized (this.f17446c) {
            aVar = new C5461a(this.f17444a.getInt("num_failed_fetches", 0), new Date(this.f17444a.getLong("backoff_end_time_in_millis", -1)));
        }
        return aVar;
    }

    /* renamed from: b */
    public long mo18116b() {
        return this.f17444a.getLong("fetch_timeout_in_seconds", 60);
    }

    /* renamed from: c */
    public C8283h mo18117c() {
        C5469u a;
        synchronized (this.f17445b) {
            long j = this.f17444a.getLong("last_fetch_time_in_millis", -1);
            int i = this.f17444a.getInt("last_fetch_status", 0);
            a = C5469u.m21788b().mo18154c(i).mo18155d(j).mo18153b(new C8284i.C8286b().mo23448d(this.f17444a.getLong("fetch_timeout_in_seconds", 60)).mo23449e(this.f17444a.getLong("minimum_fetch_interval_in_seconds", C5455m.f17413j)).mo23447c()).mo18152a();
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo18118d() {
        return this.f17444a.getString("last_fetch_etag", (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Date mo18119e() {
        return new Date(this.f17444a.getLong("last_fetch_time_in_millis", -1));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public long mo18120f() {
        return this.f17444a.getLong("last_template_version", 0);
    }

    /* renamed from: g */
    public long mo18121g() {
        return this.f17444a.getLong("minimum_fetch_interval_in_seconds", C5455m.f17413j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C5462b mo18122h() {
        C5462b bVar;
        synchronized (this.f17447d) {
            bVar = new C5462b(this.f17444a.getInt("num_failed_realtime_streams", 0), new Date(this.f17444a.getLong("realtime_backoff_end_time_in_millis", -1)));
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo18123i() {
        mo18125k(0, f17443f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo18124j() {
        mo18128n(0, f17443f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo18125k(int i, Date date) {
        synchronized (this.f17446c) {
            this.f17444a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo18126l(String str) {
        synchronized (this.f17445b) {
            this.f17444a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo18127m(long j) {
        synchronized (this.f17445b) {
            this.f17444a.edit().putLong("last_template_version", j).apply();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo18128n(int i, Date date) {
        synchronized (this.f17447d) {
            this.f17444a.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo18129o() {
        synchronized (this.f17445b) {
            this.f17444a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo18130p(Date date) {
        synchronized (this.f17445b) {
            this.f17444a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo18131q() {
        synchronized (this.f17445b) {
            this.f17444a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}

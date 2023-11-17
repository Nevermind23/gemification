package com.google.android.gms.internal.measurement;

import com.medallia.digital.mobilesdk.C10749b8;

/* renamed from: com.google.android.gms.internal.measurement.hc */
public final class C4218hc implements C4201gc {

    /* renamed from: A */
    public static final C4416t6 f13280A;

    /* renamed from: B */
    public static final C4416t6 f13281B;

    /* renamed from: C */
    public static final C4416t6 f13282C;

    /* renamed from: D */
    public static final C4416t6 f13283D;

    /* renamed from: E */
    public static final C4416t6 f13284E;

    /* renamed from: F */
    public static final C4416t6 f13285F;

    /* renamed from: G */
    public static final C4416t6 f13286G;

    /* renamed from: H */
    public static final C4416t6 f13287H;

    /* renamed from: I */
    public static final C4416t6 f13288I;

    /* renamed from: J */
    public static final C4416t6 f13289J;

    /* renamed from: K */
    public static final C4416t6 f13290K;

    /* renamed from: L */
    public static final C4416t6 f13291L;

    /* renamed from: M */
    public static final C4416t6 f13292M;

    /* renamed from: N */
    public static final C4416t6 f13293N;

    /* renamed from: O */
    public static final C4416t6 f13294O;

    /* renamed from: a */
    public static final C4416t6 f13295a;

    /* renamed from: b */
    public static final C4416t6 f13296b;

    /* renamed from: c */
    public static final C4416t6 f13297c;

    /* renamed from: d */
    public static final C4416t6 f13298d;

    /* renamed from: e */
    public static final C4416t6 f13299e;

    /* renamed from: f */
    public static final C4416t6 f13300f;

    /* renamed from: g */
    public static final C4416t6 f13301g;

    /* renamed from: h */
    public static final C4416t6 f13302h;

    /* renamed from: i */
    public static final C4416t6 f13303i;

    /* renamed from: j */
    public static final C4416t6 f13304j;

    /* renamed from: k */
    public static final C4416t6 f13305k;

    /* renamed from: l */
    public static final C4416t6 f13306l;

    /* renamed from: m */
    public static final C4416t6 f13307m;

    /* renamed from: n */
    public static final C4416t6 f13308n;

    /* renamed from: o */
    public static final C4416t6 f13309o;

    /* renamed from: p */
    public static final C4416t6 f13310p;

    /* renamed from: q */
    public static final C4416t6 f13311q;

    /* renamed from: r */
    public static final C4416t6 f13312r;

    /* renamed from: s */
    public static final C4416t6 f13313s;

    /* renamed from: t */
    public static final C4416t6 f13314t;

    /* renamed from: u */
    public static final C4416t6 f13315u;

    /* renamed from: v */
    public static final C4416t6 f13316v;

    /* renamed from: w */
    public static final C4416t6 f13317w;

    /* renamed from: x */
    public static final C4416t6 f13318x;

    /* renamed from: y */
    public static final C4416t6 f13319y;

    /* renamed from: z */
    public static final C4416t6 f13320z;

    static {
        C4348p6 a = new C4348p6(C4212h6.m15980a("com.google.android.gms.measurement")).mo13451a();
        f13295a = a.mo13454d("measurement.ad_id_cache_time", 10000);
        f13296b = a.mo13454d("measurement.app_uninstalled_additional_ad_id_cache_time", C10749b8.C10751b.f30744c);
        f13297c = a.mo13454d("measurement.max_bundles_per_iteration", 100);
        f13298d = a.mo13454d("measurement.config.cache_time", 86400000);
        f13299e = a.mo13455e("measurement.log_tag", "FA");
        f13300f = a.mo13455e("measurement.config.url_authority", "app-measurement.com");
        f13301g = a.mo13455e("measurement.config.url_scheme", "https");
        f13302h = a.mo13454d("measurement.upload.debug_upload_interval", 1000);
        f13303i = a.mo13454d("measurement.lifetimevalue.max_currency_tracked", 4);
        f13304j = a.mo13454d("measurement.store.max_stored_events_per_app", 100000);
        f13305k = a.mo13454d("measurement.experiment.max_ids", 50);
        f13306l = a.mo13454d("measurement.audience.filter_result_max_count", 200);
        f13307m = a.mo13454d("measurement.upload.max_item_scoped_custom_parameters", 27);
        f13308n = a.mo13454d("measurement.alarm_manager.minimum_interval", C10749b8.C10751b.f30743b);
        f13309o = a.mo13454d("measurement.upload.minimum_delay", 500);
        f13310p = a.mo13454d("measurement.monitoring.sample_period_millis", 86400000);
        f13311q = a.mo13454d("measurement.upload.realtime_upload_interval", 10000);
        f13312r = a.mo13454d("measurement.upload.refresh_blacklisted_config_interval", 604800000);
        f13313s = a.mo13454d("measurement.config.cache_time.service", C10749b8.C10751b.f30744c);
        f13314t = a.mo13454d("measurement.service_client.idle_disconnect_millis", 5000);
        f13315u = a.mo13455e("measurement.log_tag.service", "FA-SVC");
        f13316v = a.mo13454d("measurement.upload.stale_data_deletion_interval", 86400000);
        f13317w = a.mo13454d("measurement.sdk.attribution.cache.ttl", 604800000);
        f13318x = a.mo13454d("measurement.redaction.app_instance_id.ttl", 7200000);
        f13319y = a.mo13454d("measurement.upload.backoff_period", 43200000);
        f13320z = a.mo13454d("measurement.upload.initial_upload_delay_time", 15000);
        f13280A = a.mo13454d("measurement.upload.interval", C10749b8.C10751b.f30744c);
        f13281B = a.mo13454d("measurement.upload.max_bundle_size", 65536);
        f13282C = a.mo13454d("measurement.upload.max_bundles", 100);
        f13283D = a.mo13454d("measurement.upload.max_conversions_per_day", 500);
        f13284E = a.mo13454d("measurement.upload.max_error_events_per_day", 1000);
        f13285F = a.mo13454d("measurement.upload.max_events_per_bundle", 1000);
        f13286G = a.mo13454d("measurement.upload.max_events_per_day", 100000);
        f13287H = a.mo13454d("measurement.upload.max_public_events_per_day", 50000);
        f13288I = a.mo13454d("measurement.upload.max_queue_time", 2419200000L);
        f13289J = a.mo13454d("measurement.upload.max_realtime_events_per_day", 10);
        f13290K = a.mo13454d("measurement.upload.max_batch_size", 65536);
        f13291L = a.mo13454d("measurement.upload.retry_count", 6);
        f13292M = a.mo13454d("measurement.upload.retry_time", 1800000);
        f13293N = a.mo13455e("measurement.upload.url", "https://app-measurement.com/a");
        f13294O = a.mo13454d("measurement.upload.window_interval", C10749b8.C10751b.f30744c);
    }

    /* renamed from: A */
    public final long mo13158A() {
        return ((Long) f13281B.mo13631b()).longValue();
    }

    /* renamed from: B */
    public final long mo13159B() {
        return ((Long) f13303i.mo13631b()).longValue();
    }

    /* renamed from: C */
    public final long mo13160C() {
        return ((Long) f13288I.mo13631b()).longValue();
    }

    /* renamed from: D */
    public final long mo13161D() {
        return ((Long) f13289J.mo13631b()).longValue();
    }

    /* renamed from: E */
    public final long mo13162E() {
        return ((Long) f13282C.mo13631b()).longValue();
    }

    /* renamed from: F */
    public final String mo13163F() {
        return (String) f13300f.mo13631b();
    }

    /* renamed from: G */
    public final long mo13164G() {
        return ((Long) f13310p.mo13631b()).longValue();
    }

    /* renamed from: H */
    public final String mo13165H() {
        return (String) f13301g.mo13631b();
    }

    /* renamed from: I */
    public final long mo13166I() {
        return ((Long) f13292M.mo13631b()).longValue();
    }

    /* renamed from: J */
    public final long mo13167J() {
        return ((Long) f13294O.mo13631b()).longValue();
    }

    /* renamed from: K */
    public final long mo13168K() {
        return ((Long) f13316v.mo13631b()).longValue();
    }

    /* renamed from: L */
    public final long mo13169L() {
        return ((Long) f13317w.mo13631b()).longValue();
    }

    /* renamed from: M */
    public final String mo13170M() {
        return (String) f13293N.mo13631b();
    }

    /* renamed from: N */
    public final long mo13171N() {
        return ((Long) f13312r.mo13631b()).longValue();
    }

    /* renamed from: O */
    public final long mo13172O() {
        return ((Long) f13320z.mo13631b()).longValue();
    }

    /* renamed from: P */
    public final long mo13173P() {
        return ((Long) f13280A.mo13631b()).longValue();
    }

    /* renamed from: Q */
    public final long mo13174Q() {
        return ((Long) f13287H.mo13631b()).longValue();
    }

    /* renamed from: R */
    public final long mo13175R() {
        return ((Long) f13318x.mo13631b()).longValue();
    }

    /* renamed from: S */
    public final long mo13176S() {
        return ((Long) f13285F.mo13631b()).longValue();
    }

    /* renamed from: T */
    public final long mo13177T() {
        return ((Long) f13319y.mo13631b()).longValue();
    }

    /* renamed from: a */
    public final long mo13178a() {
        return ((Long) f13295a.mo13631b()).longValue();
    }

    /* renamed from: b */
    public final long mo13179b() {
        return ((Long) f13298d.mo13631b()).longValue();
    }

    /* renamed from: c */
    public final long mo13180c() {
        return ((Long) f13306l.mo13631b()).longValue();
    }

    /* renamed from: d */
    public final long mo13181d() {
        return ((Long) f13307m.mo13631b()).longValue();
    }

    /* renamed from: e */
    public final long mo13182e() {
        return ((Long) f13308n.mo13631b()).longValue();
    }

    /* renamed from: g */
    public final long mo13183g() {
        return ((Long) f13290K.mo13631b()).longValue();
    }

    /* renamed from: l */
    public final long mo13184l() {
        return ((Long) f13314t.mo13631b()).longValue();
    }

    /* renamed from: m */
    public final long mo13185m() {
        return ((Long) f13311q.mo13631b()).longValue();
    }

    /* renamed from: q */
    public final long mo13186q() {
        return ((Long) f13296b.mo13631b()).longValue();
    }

    /* renamed from: r */
    public final long mo13187r() {
        return ((Long) f13286G.mo13631b()).longValue();
    }

    /* renamed from: s */
    public final long mo13188s() {
        return ((Long) f13297c.mo13631b()).longValue();
    }

    /* renamed from: t */
    public final long mo13189t() {
        return ((Long) f13302h.mo13631b()).longValue();
    }

    /* renamed from: u */
    public final long mo13190u() {
        return ((Long) f13305k.mo13631b()).longValue();
    }

    /* renamed from: v */
    public final long mo13191v() {
        return ((Long) f13304j.mo13631b()).longValue();
    }

    /* renamed from: w */
    public final long mo13192w() {
        return ((Long) f13309o.mo13631b()).longValue();
    }

    /* renamed from: x */
    public final long mo13193x() {
        return ((Long) f13283D.mo13631b()).longValue();
    }

    /* renamed from: y */
    public final long mo13194y() {
        return ((Long) f13284E.mo13631b()).longValue();
    }

    /* renamed from: z */
    public final long mo13195z() {
        return ((Long) f13291L.mo13631b()).longValue();
    }
}

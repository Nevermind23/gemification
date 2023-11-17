package com.google.android.gms.measurement.internal;

import com.medallia.digital.mobilesdk.C10749b8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p248s7.C8249d;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;

/* renamed from: com.google.android.gms.measurement.internal.f3 */
public abstract class C4636f3 {

    /* renamed from: A */
    public static final C4625e3 f14324A = m17662a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, C4598c0.f14234a);

    /* renamed from: A0 */
    public static final C4625e3 f14325A0;

    /* renamed from: B */
    public static final C4625e3 f14326B = m17662a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, C4610d0.f14254a);

    /* renamed from: B0 */
    public static final C4625e3 f14327B0;

    /* renamed from: C */
    public static final C4625e3 f14328C = m17662a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, C4622e0.f14296a);

    /* renamed from: C0 */
    public static final C4625e3 f14329C0;

    /* renamed from: D */
    public static final C4625e3 f14330D = m17662a("measurement.upload.retry_time", 1800000L, 1800000L, C4644g0.f14443a);

    /* renamed from: D0 */
    public static final C4625e3 f14331D0;

    /* renamed from: E */
    public static final C4625e3 f14332E = m17662a("measurement.upload.retry_count", 6, 6, C4655h0.f14466a);

    /* renamed from: E0 */
    public static final C4625e3 f14333E0;

    /* renamed from: F */
    public static final C4625e3 f14334F = m17662a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, C4666i0.f14506a);

    /* renamed from: F0 */
    public static final C4625e3 f14335F0;

    /* renamed from: G */
    public static final C4625e3 f14336G = m17662a("measurement.lifetimevalue.max_currency_tracked", 4, 4, C4688k0.f14557a);

    /* renamed from: G0 */
    public static final C4625e3 f14337G0;

    /* renamed from: H */
    public static final C4625e3 f14338H;

    /* renamed from: H0 */
    public static final C4625e3 f14339H0;

    /* renamed from: I */
    public static final C4625e3 f14340I = m17662a("measurement.upload.max_public_user_properties", 25, 25, (C4601c3) null);

    /* renamed from: I0 */
    public static final C4625e3 f14341I0;

    /* renamed from: J */
    public static final C4625e3 f14342J = m17662a("measurement.upload.max_event_name_cardinality", 500, 500, (C4601c3) null);

    /* renamed from: J0 */
    public static final C4625e3 f14343J0;

    /* renamed from: K */
    public static final C4625e3 f14344K = m17662a("measurement.upload.max_public_event_params", 25, 25, (C4601c3) null);

    /* renamed from: L */
    public static final C4625e3 f14345L = m17662a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, C4710m0.f14602a);

    /* renamed from: M */
    public static final C4625e3 f14346M;

    /* renamed from: N */
    public static final C4625e3 f14347N = m17662a("measurement.test.string_flag", "---", "---", C4732o0.f14686a);

    /* renamed from: O */
    public static final C4625e3 f14348O = m17662a("measurement.test.long_flag", -1L, -1L, C4743p0.f14710a);

    /* renamed from: P */
    public static final C4625e3 f14349P = m17662a("measurement.test.int_flag", -2, -2, C4765r0.f14809a);

    /* renamed from: Q */
    public static final C4625e3 f14350Q;

    /* renamed from: R */
    public static final C4625e3 f14351R = m17662a("measurement.experiment.max_ids", 50, 50, C4787t0.f14864a);

    /* renamed from: S */
    public static final C4625e3 f14352S = m17662a("measurement.upload.max_item_scoped_custom_parameters", 27, 27, C4798u0.f14934a);

    /* renamed from: T */
    public static final C4625e3 f14353T = m17662a("measurement.max_bundles_per_iteration", 100, 100, C4831x0.f15001a);

    /* renamed from: U */
    public static final C4625e3 f14354U = m17662a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, C4842y0.f15022a);

    /* renamed from: V */
    public static final C4625e3 f14355V = m17662a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, C4853z0.f15059a);

    /* renamed from: W */
    public static final C4625e3 f14356W;

    /* renamed from: X */
    public static final C4625e3 f14357X;

    /* renamed from: Y */
    public static final C4625e3 f14358Y;

    /* renamed from: Z */
    public static final C4625e3 f14359Z;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final List f14360a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0 */
    public static final C4625e3 f14361a0;

    /* renamed from: b */
    private static final Set f14362b = Collections.synchronizedSet(new HashSet());

    /* renamed from: b0 */
    public static final C4625e3 f14363b0;

    /* renamed from: c */
    public static final C4625e3 f14364c = m17662a("measurement.ad_id_cache_time", 10000L, 10000L, C4633f0.f14321a);

    /* renamed from: c0 */
    public static final C4625e3 f14365c0;

    /* renamed from: d */
    public static final C4625e3 f14366d;

    /* renamed from: d0 */
    public static final C4625e3 f14367d0;

    /* renamed from: e */
    public static final C4625e3 f14368e = m17662a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, C4677j0.f14531a);

    /* renamed from: e0 */
    public static final C4625e3 f14369e0;

    /* renamed from: f */
    public static final C4625e3 f14370f;

    /* renamed from: f0 */
    public static final C4625e3 f14371f0;

    /* renamed from: g */
    public static final C4625e3 f14372g = m17662a("measurement.config.url_scheme", "https", "https", C4667i1.f14507a);

    /* renamed from: g0 */
    public static final C4625e3 f14373g0;

    /* renamed from: h */
    public static final C4625e3 f14374h = m17662a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", C4799u1.f14935a);

    /* renamed from: h0 */
    public static final C4625e3 f14375h0;

    /* renamed from: i */
    public static final C4625e3 f14376i = m17662a("measurement.upload.max_bundles", 100, 100, C4657h2.f14468a);

    /* renamed from: i0 */
    public static final C4625e3 f14377i0;

    /* renamed from: j */
    public static final C4625e3 f14378j = m17662a("measurement.upload.max_batch_size", 65536, 65536, C4789t2.f14866a);

    /* renamed from: j0 */
    public static final C4625e3 f14379j0 = m17662a("measurement.service.storage_consent_support_version", 203600, 203600, C4744p1.f14711a);

    /* renamed from: k */
    public static final C4625e3 f14380k = m17662a("measurement.upload.max_bundle_size", 65536, 65536, C4833x2.f15005a);

    /* renamed from: k0 */
    public static final C4625e3 f14381k0;

    /* renamed from: l */
    public static final C4625e3 f14382l = m17662a("measurement.upload.max_events_per_bundle", 1000, 1000, C4855z2.f15061a);

    /* renamed from: l0 */
    public static final C4625e3 f14383l0;

    /* renamed from: m */
    public static final C4625e3 f14384m = m17662a("measurement.upload.max_events_per_day", 100000, 100000, C4754q0.f14781a);

    /* renamed from: m0 */
    public static final C4625e3 f14385m0;

    /* renamed from: n */
    public static final C4625e3 f14386n = m17662a("measurement.upload.max_error_events_per_day", 1000, 1000, C4599c1.f14235a);

    /* renamed from: n0 */
    public static final C4625e3 f14387n0;

    /* renamed from: o */
    public static final C4625e3 f14388o = m17662a("measurement.upload.max_public_events_per_day", 50000, 50000, C4722n1.f14656a);

    /* renamed from: o0 */
    public static final C4625e3 f14389o0;

    /* renamed from: p */
    public static final C4625e3 f14390p = m17662a("measurement.upload.max_conversions_per_day", 10000, 10000, C4854z1.f15060a);

    /* renamed from: p0 */
    public static final C4625e3 f14391p0;

    /* renamed from: q */
    public static final C4625e3 f14392q = m17662a("measurement.upload.max_realtime_events_per_day", 10, 10, C4690k2.f14559a);

    /* renamed from: q0 */
    public static final C4625e3 f14393q0;

    /* renamed from: r */
    public static final C4625e3 f14394r = m17662a("measurement.store.max_stored_events_per_app", 100000, 100000, C4811v2.f14961a);

    /* renamed from: r0 */
    public static final C4625e3 f14395r0;

    /* renamed from: s */
    public static final C4625e3 f14396s = m17662a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", C4577a3.f14185a);

    /* renamed from: s0 */
    public static final C4625e3 f14397s0;

    /* renamed from: t */
    public static final C4625e3 f14398t = m17662a("measurement.upload.backoff_period", 43200000L, 43200000L, C4589b3.f14217a);

    /* renamed from: t0 */
    public static final C4625e3 f14399t0;

    /* renamed from: u */
    public static final C4625e3 f14400u;

    /* renamed from: u0 */
    public static final C4625e3 f14401u0;

    /* renamed from: v */
    public static final C4625e3 f14402v;

    /* renamed from: v0 */
    public static final C4625e3 f14403v0;

    /* renamed from: w */
    public static final C4625e3 f14404w = m17662a("measurement.upload.realtime_upload_interval", 10000L, 10000L, C4841y.f15021a);

    /* renamed from: w0 */
    public static final C4625e3 f14405w0;

    /* renamed from: x */
    public static final C4625e3 f14406x = m17662a("measurement.upload.debug_upload_interval", 1000L, 1000L, C4852z.f15058a);

    /* renamed from: x0 */
    public static final C4625e3 f14407x0;

    /* renamed from: y */
    public static final C4625e3 f14408y = m17662a("measurement.upload.minimum_delay", 500L, 500L, C4574a0.f14182a);

    /* renamed from: y0 */
    public static final C4625e3 f14409y0;

    /* renamed from: z */
    public static final C4625e3 f14410z;

    /* renamed from: z0 */
    public static final C4625e3 f14411z0;

    static {
        Long valueOf = Long.valueOf(C10749b8.C10751b.f30744c);
        f14366d = m17662a("measurement.app_uninstalled_additional_ad_id_cache_time", valueOf, valueOf, C4830x.f15000a);
        f14370f = m17662a("measurement.config.cache_time", 86400000L, valueOf, C4809v0.f14959a);
        f14400u = m17662a("measurement.upload.window_interval", valueOf, valueOf, C4797u.f14933a);
        f14402v = m17662a("measurement.upload.interval", valueOf, valueOf, C4819w.f14981a);
        Long valueOf2 = Long.valueOf(C10749b8.C10751b.f30743b);
        f14410z = m17662a("measurement.alarm_manager.minimum_interval", valueOf2, valueOf2, C4586b0.f14214a);
        Integer valueOf3 = Integer.valueOf(BogInputLayout.INPUT_NORMAL_STATE);
        f14338H = m17662a("measurement.audience.filter_result_max_count", valueOf3, valueOf3, C4699l0.f14584a);
        Boolean bool = Boolean.FALSE;
        f14346M = m17662a("measurement.test.boolean_flag", bool, bool, C4721n0.f14655a);
        Double valueOf4 = Double.valueOf(-3.0d);
        f14350Q = m17662a("measurement.test.double_flag", valueOf4, valueOf4, C4776s0.f14840a);
        Boolean bool2 = Boolean.TRUE;
        f14356W = m17662a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, C4575a1.f14183a);
        f14357X = m17662a("measurement.quality.checksum", bool, bool, (C4601c3) null);
        f14358Y = m17662a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, C4587b1.f14215a);
        f14359Z = m17662a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, C4611d1.f14255a);
        f14361a0 = m17662a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, C4623e1.f14297a);
        f14363b0 = m17662a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, C4634f1.f14322a);
        f14365c0 = m17662a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, C4645g1.f14444a);
        f14367d0 = m17662a("measurement.lifecycle.app_in_background_parameter", bool, bool, C4656h1.f14467a);
        f14369e0 = m17662a("measurement.integration.disable_firebase_instance_id", bool, bool, C4678j1.f14532a);
        f14371f0 = m17662a("measurement.collection.service.update_with_analytics_fix", bool, bool, C4689k1.f14558a);
        f14373g0 = m17662a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, C4700l1.f14585a);
        f14375h0 = m17662a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, C4711m1.f14603a);
        f14377i0 = m17662a("measurement.collection.synthetic_data_mitigation", bool, bool, C4733o1.f14687a);
        f14381k0 = m17662a("measurement.client.click_identifier_control.dev", bool, bool, C4755q1.f14782a);
        f14383l0 = m17662a("measurement.service.click_identifier_control", bool, bool, C4766r1.f14810a);
        f14385m0 = m17662a("measurement.service.store_null_safelist", bool2, bool2, C4777s1.f14841a);
        f14387n0 = m17662a("measurement.service.store_safelist", bool2, bool2, C4788t1.f14865a);
        f14389o0 = m17662a("measurement.collection.enable_session_stitching_token.first_open_fix", bool2, bool2, C4810v1.f14960a);
        f14391p0 = m17662a("measurement.collection.enable_session_stitching_token.client.dev", bool2, bool2, C4821w1.f14984a);
        f14393q0 = m17662a("measurement.session_stitching_token_enabled", bool, bool, C4843y1.f15023a);
        f14395r0 = m17662a("measurement.sgtm.client.dev", bool, bool, C4576a2.f14184a);
        f14397s0 = m17662a("measurement.sgtm.service", bool, bool, C4588b2.f14216a);
        f14399t0 = m17662a("measurement.redaction.retain_major_os_version", bool2, bool2, C4600c2.f14236a);
        f14401u0 = m17662a("measurement.redaction.scion_payload_generator", bool2, bool2, C4612d2.f14256a);
        f14403v0 = m17662a("measurement.service.clear_global_params_on_uninstall", bool2, bool2, C4624e2.f14298a);
        f14405w0 = m17662a("measurement.sessionid.enable_client_session_id", bool2, bool2, C4635f2.f14323a);
        f14407x0 = m17662a("measurement.sfmc.client", bool2, bool2, C4646g2.f14445a);
        f14409y0 = m17662a("measurement.sfmc.service", bool2, bool2, C4668i2.f14508a);
        f14411z0 = m17662a("measurement.gmscore_feature_tracking", bool2, bool2, C4679j2.f14533a);
        f14325A0 = m17662a("measurement.fix_health_monitor_stack_trace", bool2, bool2, C4701l2.f14586a);
        f14327B0 = m17662a("measurement.item_scoped_custom_parameters.client", bool2, bool2, C4712m2.f14604a);
        f14329C0 = m17662a("measurement.item_scoped_custom_parameters.service", bool, bool, C4723n2.f14657a);
        f14331D0 = m17662a("measurement.remove_app_background.client", bool, bool, C4734o2.f14688a);
        f14333E0 = m17662a("measurement.rb.attribution.service", bool, bool, C4745p2.f14712a);
        f14335F0 = m17662a("measurement.collection.client.log_target_api_version", bool2, bool2, C4756q2.f14783a);
        f14337G0 = m17662a("measurement.collection.service.log_target_api_version", bool2, bool2, C4767r2.f14811a);
        f14339H0 = m17662a("measurement.client.deep_link_referrer_fix", bool2, bool2, C4778s2.f14842a);
        f14341I0 = m17662a("measurement.client.sessions.enable_fix_background_engagement", bool, bool, C4800u2.f14936a);
        f14343J0 = m17662a("measurement.link_sst_to_sid", bool, bool, C4822w2.f14985a);
    }

    /* renamed from: a */
    static C4625e3 m17662a(String str, Object obj, Object obj2, C4601c3 c3Var) {
        C4625e3 e3Var = new C4625e3(str, obj, obj2, c3Var, (C8249d) null);
        f14360a.add(e3Var);
        return e3Var;
    }
}

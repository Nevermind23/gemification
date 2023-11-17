package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.google.firebase.C5270e;
import com.google.firebase.C5298l;
import com.google.firebase.remoteconfig.C5434a;
import com.google.firebase.remoteconfig.C5436c;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p134ja.C6763a;
import p212pa.C7784g;
import p251sa.C8287j;
import p327y9.C9142b;
import p342j$.util.concurrent.ConcurrentHashMap;

@Keep
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final C6763a logger = C6763a.m26371e();
    private final ConcurrentHashMap<String, C8287j> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final C5404x cache;
    private final Executor executor;
    private C5434a firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private C9142b firebaseRemoteConfigProvider;

    @SuppressLint({"ThreadPoolCreation"})
    private RemoteConfigManager() {
        this(C5404x.m21397e(), new ThreadPoolExecutor(0, 1, FETCH_NEVER_HAPPENED_TIMESTAMP_MS, TimeUnit.SECONDS, new LinkedBlockingQueue()), (C5434a) null, ((long) new Random().nextInt(RANDOM_APP_START_CONFIG_FETCH_DELAY_MS)) + MIN_APP_START_CONFIG_FETCH_DELAY_MS, getInitialStartupMillis());
    }

    static long getInitialStartupMillis() {
        C5298l lVar = (C5298l) C5270e.m20805l().mo17480i(C5298l.class);
        if (lVar != null) {
            return lVar.mo17396c();
        }
        return System.currentTimeMillis();
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private C8287j getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        C8287j jVar = this.allRcConfigMap.get(str);
        if (jVar.mo18157b() != 2) {
            return null;
        }
        logger.mo20805b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", jVar.mo18156a(), str);
        return jVar;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j) {
        return j - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long j) {
        return j - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    /* access modifiers changed from: private */
    /* renamed from: lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0 */
    public /* synthetic */ void m21260xc904e813(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.mo18061h());
    }

    /* access modifiers changed from: private */
    /* renamed from: lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1 */
    public /* synthetic */ void m21261xc904e814(Exception exc) {
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        if (!hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) || !hasLastFetchBecomeStale(currentSystemTimeMillis)) {
            return false;
        }
        return true;
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.mo18060g().mo24863h(this.executor, new C5405y(this)).mo24860e(this.executor, new C5406z(this));
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.mo18061h());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public C7784g getBoolean(String str) {
        if (str == null) {
            logger.mo20804a("The key to get Remote Config boolean value is null.");
            return C7784g.m29491a();
        }
        C8287j remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return C7784g.m29493e(Boolean.valueOf(remoteConfigValue.mo18158c()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.mo18156a().isEmpty()) {
                    logger.mo20805b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.mo18156a(), str);
                }
            }
        }
        return C7784g.m29491a();
    }

    /* access modifiers changed from: protected */
    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public C7784g getDouble(String str) {
        if (str == null) {
            logger.mo20804a("The key to get Remote Config double value is null.");
            return C7784g.m29491a();
        }
        C8287j remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return C7784g.m29493e(Double.valueOf(remoteConfigValue.mo18160e()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.mo18156a().isEmpty()) {
                    logger.mo20805b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.mo18156a(), str);
                }
            }
        }
        return C7784g.m29491a();
    }

    public C7784g getLong(String str) {
        if (str == null) {
            logger.mo20804a("The key to get Remote Config long value is null.");
            return C7784g.m29491a();
        }
        C8287j remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return C7784g.m29493e(Long.valueOf(remoteConfigValue.mo18159d()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.mo18156a().isEmpty()) {
                    logger.mo20805b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.mo18156a(), str);
                }
            }
        }
        return C7784g.m29491a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T getRemoteConfigValueOrDefault(java.lang.String r8, T r9) {
        /*
            r7 = this;
            sa.j r0 = r7.getRemoteConfigValue(r8)
            if (r0 == 0) goto L_0x006d
            r1 = 1
            r2 = 0
            boolean r3 = r9 instanceof java.lang.Boolean     // Catch:{ IllegalArgumentException -> 0x0051 }
            if (r3 == 0) goto L_0x0016
            boolean r3 = r0.mo18158c()     // Catch:{ IllegalArgumentException -> 0x0051 }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0051 }
        L_0x0014:
            r9 = r8
            goto L_0x006d
        L_0x0016:
            boolean r3 = r9 instanceof java.lang.Double     // Catch:{ IllegalArgumentException -> 0x0051 }
            if (r3 == 0) goto L_0x0023
            double r3 = r0.mo18160e()     // Catch:{ IllegalArgumentException -> 0x0051 }
            java.lang.Double r8 = java.lang.Double.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0051 }
            goto L_0x0014
        L_0x0023:
            boolean r3 = r9 instanceof java.lang.Long     // Catch:{ IllegalArgumentException -> 0x0051 }
            if (r3 != 0) goto L_0x0048
            boolean r3 = r9 instanceof java.lang.Integer     // Catch:{ IllegalArgumentException -> 0x0051 }
            if (r3 == 0) goto L_0x002c
            goto L_0x0048
        L_0x002c:
            boolean r3 = r9 instanceof java.lang.String     // Catch:{ IllegalArgumentException -> 0x0051 }
            if (r3 == 0) goto L_0x0035
            java.lang.String r8 = r0.mo18156a()     // Catch:{ IllegalArgumentException -> 0x0051 }
            goto L_0x0014
        L_0x0035:
            java.lang.String r3 = r0.mo18156a()     // Catch:{ IllegalArgumentException -> 0x0051 }
            ja.a r4 = logger     // Catch:{ IllegalArgumentException -> 0x0046 }
            java.lang.String r5 = "No matching type found for the defaultValue: '%s', using String."
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ IllegalArgumentException -> 0x0046 }
            r6[r2] = r9     // Catch:{ IllegalArgumentException -> 0x0046 }
            r4.mo20805b(r5, r6)     // Catch:{ IllegalArgumentException -> 0x0046 }
            r9 = r3
            goto L_0x006d
        L_0x0046:
            r9 = r3
            goto L_0x0051
        L_0x0048:
            long r3 = r0.mo18159d()     // Catch:{ IllegalArgumentException -> 0x0051 }
            java.lang.Long r8 = java.lang.Long.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0051 }
            goto L_0x0014
        L_0x0051:
            java.lang.String r3 = r0.mo18156a()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x006d
            ja.a r3 = logger
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r0 = r0.mo18156a()
            r4[r2] = r0
            r4[r1] = r8
            java.lang.String r8 = "Could not parse value: '%s' for key: '%s'."
            r3.mo20805b(r8, r4)
        L_0x006d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.config.RemoteConfigManager.getRemoteConfigValueOrDefault(java.lang.String, java.lang.Object):java.lang.Object");
    }

    public C7784g getString(String str) {
        if (str == null) {
            logger.mo20804a("The key to get Remote Config String value is null.");
            return C7784g.m29491a();
        }
        C8287j remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            return C7784g.m29493e(remoteConfigValue.mo18156a());
        }
        return C7784g.m29491a();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        C9142b bVar;
        C5436c cVar;
        if (!(this.firebaseRemoteConfig != null || (bVar = this.firebaseRemoteConfigProvider) == null || (cVar = (C5436c) bVar.get()) == null)) {
            this.firebaseRemoteConfig = cVar.mo18068d(FIREPERF_FRC_NAMESPACE_NAME);
        }
        if (this.firebaseRemoteConfig != null) {
            return true;
        }
        return false;
    }

    public boolean isLastFetchFailed() {
        C5434a aVar = this.firebaseRemoteConfig;
        if (aVar == null || aVar.mo18062i().mo18151a() == 1) {
            return true;
        }
        return false;
    }

    public void setFirebaseRemoteConfigProvider(C9142b bVar) {
        this.firebaseRemoteConfigProvider = bVar;
    }

    /* access modifiers changed from: protected */
    public void syncConfigValues(Map<String, C8287j> map) {
        this.allRcConfigMap.putAll(map);
        for (String next : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(next)) {
                this.allRcConfigMap.remove(next);
            }
        }
        C5383d e = C5383d.m21310e();
        C8287j jVar = this.allRcConfigMap.get(e.mo17736c());
        if (jVar != null) {
            try {
                this.cache.mo17764m(e.mo17735a(), jVar.mo18158c());
            } catch (Exception unused) {
                logger.mo20804a("ExperimentTTID remote config flag has invalid value, expected boolean.");
            }
        } else {
            logger.mo20804a("ExperimentTTID remote config flag does not exist.");
        }
    }

    RemoteConfigManager(C5404x xVar, Executor executor2, C5434a aVar, long j, long j2) {
        ConcurrentHashMap<String, C8287j> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
        this.cache = xVar;
        this.executor = executor2;
        this.firebaseRemoteConfig = aVar;
        if (aVar == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(aVar.mo18061h());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = j2;
        this.appStartConfigFetchDelayInMs = j;
    }
}

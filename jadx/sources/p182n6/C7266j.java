package p182n6;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* renamed from: n6.j */
public final class C7266j {

    /* renamed from: b */
    private static C7266j f21457b;

    /* renamed from: c */
    private static final RootTelemetryConfiguration f21458c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* renamed from: a */
    private RootTelemetryConfiguration f21459a;

    private C7266j() {
    }

    /* renamed from: b */
    public static synchronized C7266j m27912b() {
        C7266j jVar;
        synchronized (C7266j.class) {
            if (f21457b == null) {
                f21457b = new C7266j();
            }
            jVar = f21457b;
        }
        return jVar;
    }

    /* renamed from: a */
    public RootTelemetryConfiguration mo21638a() {
        return this.f21459a;
    }

    /* renamed from: c */
    public final synchronized void mo21639c(RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.f21459a = f21458c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f21459a;
        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.mo12206f0() < rootTelemetryConfiguration.mo12206f0()) {
            this.f21459a = rootTelemetryConfiguration;
        }
    }
}

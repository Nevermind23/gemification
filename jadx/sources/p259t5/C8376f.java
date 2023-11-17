package p259t5;

import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p142k5.C6813d;
import p259t5.C8371c;
import p298w5.C8850a;

/* renamed from: t5.f */
public abstract class C8376f {

    /* renamed from: t5.f$a */
    public static class C8377a {

        /* renamed from: a */
        private C8850a f23791a;

        /* renamed from: b */
        private Map f23792b = new HashMap();

        /* renamed from: a */
        public C8377a mo23582a(C6813d dVar, C8378b bVar) {
            this.f23792b.put(dVar, bVar);
            return this;
        }

        /* renamed from: b */
        public C8376f mo23583b() {
            if (this.f23791a == null) {
                throw new NullPointerException("missing required property: clock");
            } else if (this.f23792b.keySet().size() >= C6813d.values().length) {
                Map map = this.f23792b;
                this.f23792b = new HashMap();
                return C8376f.m31458d(this.f23791a, map);
            } else {
                throw new IllegalStateException("Not all priorities have been configured");
            }
        }

        /* renamed from: c */
        public C8377a mo23584c(C8850a aVar) {
            this.f23791a = aVar;
            return this;
        }
    }

    /* renamed from: t5.f$b */
    public static abstract class C8378b {

        /* renamed from: t5.f$b$a */
        public static abstract class C8379a {
            /* renamed from: a */
            public abstract C8378b mo23572a();

            /* renamed from: b */
            public abstract C8379a mo23573b(long j);

            /* renamed from: c */
            public abstract C8379a mo23574c(Set set);

            /* renamed from: d */
            public abstract C8379a mo23575d(long j);
        }

        /* renamed from: a */
        public static C8379a m31469a() {
            return new C8371c.C8373b().mo23574c(Collections.emptySet());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract long mo23566b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Set mo23567c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract long mo23568d();
    }

    /* renamed from: t5.f$c */
    public enum C8380c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: a */
    private long m31456a(int i, long j) {
        long j2;
        int i2 = i - 1;
        if (j > 1) {
            j2 = j;
        } else {
            j2 = 2;
        }
        return (long) (Math.pow(3.0d, (double) i2) * ((double) j) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) (j2 * ((long) i2)))));
    }

    /* renamed from: b */
    public static C8377a m31457b() {
        return new C8377a();
    }

    /* renamed from: d */
    static C8376f m31458d(C8850a aVar, Map map) {
        return new C8370b(aVar, map);
    }

    /* renamed from: f */
    public static C8376f m31459f(C8850a aVar) {
        return m31457b().mo23582a(C6813d.DEFAULT, C8378b.m31469a().mo23573b(30000).mo23575d(86400000).mo23572a()).mo23582a(C6813d.HIGHEST, C8378b.m31469a().mo23573b(1000).mo23575d(86400000).mo23572a()).mo23582a(C6813d.VERY_LOW, C8378b.m31469a().mo23573b(86400000).mo23575d(86400000).mo23574c(m31460i(C8380c.DEVICE_IDLE)).mo23572a()).mo23584c(aVar).mo23583b();
    }

    /* renamed from: i */
    private static Set m31460i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    /* renamed from: j */
    private void m31461j(JobInfo.Builder builder, Set set) {
        if (set.contains(C8380c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(C8380c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(C8380c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    /* renamed from: c */
    public JobInfo.Builder mo23580c(JobInfo.Builder builder, C6813d dVar, long j, int i) {
        builder.setMinimumLatency(mo23581g(dVar, j, i));
        m31461j(builder, ((C8378b) mo23563h().get(dVar)).mo23567c());
        return builder;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract C8850a mo23561e();

    /* renamed from: g */
    public long mo23581g(C6813d dVar, long j, int i) {
        long a = j - mo23561e().mo24276a();
        C8378b bVar = (C8378b) mo23563h().get(dVar);
        return Math.min(Math.max(m31456a(i, bVar.mo23566b()), a), bVar.mo23568d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract Map mo23563h();
}

package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.impl.utils.futures.C2059c;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p216q1.C7819c;
import p262t8.C8421a;

/* renamed from: androidx.work.l */
public abstract class C2068l {
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    /* renamed from: androidx.work.l$a */
    public static abstract class C2069a {

        /* renamed from: androidx.work.l$a$a */
        public static final class C2070a extends C2069a {

            /* renamed from: a */
            private final C1959e f6216a;

            public C2070a() {
                this(C1959e.f5932c);
            }

            /* renamed from: e */
            public C1959e mo6948e() {
                return this.f6216a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C2070a.class != obj.getClass()) {
                    return false;
                }
                return this.f6216a.equals(((C2070a) obj).f6216a);
            }

            public int hashCode() {
                return (C2070a.class.getName().hashCode() * 31) + this.f6216a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f6216a + '}';
            }

            public C2070a(C1959e eVar) {
                this.f6216a = eVar;
            }
        }

        /* renamed from: androidx.work.l$a$b */
        public static final class C2071b extends C2069a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && C2071b.class == obj.getClass();
            }

            public int hashCode() {
                return C2071b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.l$a$c */
        public static final class C2072c extends C2069a {

            /* renamed from: a */
            private final C1959e f6217a;

            public C2072c() {
                this(C1959e.f5932c);
            }

            /* renamed from: e */
            public C1959e mo6955e() {
                return this.f6217a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C2072c.class != obj.getClass()) {
                    return false;
                }
                return this.f6217a.equals(((C2072c) obj).f6217a);
            }

            public int hashCode() {
                return (C2072c.class.getName().hashCode() * 31) + this.f6217a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f6217a + '}';
            }

            public C2072c(C1959e eVar) {
                this.f6217a = eVar;
            }
        }

        C2069a() {
        }

        /* renamed from: a */
        public static C2069a m8065a() {
            return new C2070a();
        }

        /* renamed from: b */
        public static C2069a m8066b() {
            return new C2071b();
        }

        /* renamed from: c */
        public static C2069a m8067c() {
            return new C2072c();
        }

        /* renamed from: d */
        public static C2069a m8068d(C1959e eVar) {
            return new C2072c(eVar);
        }
    }

    public C2068l(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.mAppContext = context;
            this.mWorkerParams = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.mo6681a();
    }

    public C8421a getForegroundInfoAsync() {
        C2059c t = C2059c.m8028t();
        t.mo6897q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return t;
    }

    public final UUID getId() {
        return this.mWorkerParams.mo6683c();
    }

    public final C1959e getInputData() {
        return this.mWorkerParams.mo6684d();
    }

    public final Network getNetwork() {
        return this.mWorkerParams.mo6685e();
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.mo6687g();
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.mo6688h();
    }

    public C7819c getTaskExecutor() {
        return this.mWorkerParams.mo6689i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.mo6690j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.mo6691k();
    }

    public C2099z getWorkerFactory() {
        return this.mWorkerParams.mo6692l();
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final C8421a setForegroundAsync(C1963h hVar) {
        return this.mWorkerParams.mo6682b().mo6745a(getApplicationContext(), getId(), hVar);
    }

    public C8421a setProgressAsync(C1959e eVar) {
        return this.mWorkerParams.mo6686f().mo6979a(getApplicationContext(), getId(), eVar);
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract C8421a startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}

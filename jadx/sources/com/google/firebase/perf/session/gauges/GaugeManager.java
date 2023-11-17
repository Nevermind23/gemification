package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.config.C5380a;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p134ja.C6763a;
import p199oa.C7506k;
import p225qa.C7950b;
import p225qa.C7957d;
import p225qa.C7960e;
import p225qa.C7963f;
import p225qa.C7966g;
import p326y8.C9134u;

@Keep
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private static final GaugeManager instance = new GaugeManager();
    private static final C6763a logger = C6763a.m26371e();
    private C7957d applicationProcessState;
    private final C5380a configResolver;
    private final C9134u cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final C9134u gaugeManagerExecutor;
    private C5428i gaugeMetadataManager;
    private final C9134u memoryGaugeCollector;
    private String sessionId;
    private final C7506k transportManager;

    /* renamed from: com.google.firebase.perf.session.gauges.GaugeManager$a */
    static /* synthetic */ class C5419a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17278a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                qa.d[] r0 = p225qa.C7957d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17278a = r0
                qa.d r1 = p225qa.C7957d.BACKGROUND     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17278a     // Catch:{ NoSuchFieldError -> 0x001d }
                qa.d r1 = p225qa.C7957d.FOREGROUND     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.session.gauges.GaugeManager.C5419a.<clinit>():void");
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new C9134u(new C5425f()), C7506k.m28498k(), C5380a.m21272g(), (C5428i) null, new C9134u(new C5426g()), new C9134u(new C5427h()));
    }

    private long getCpuGaugeCollectionFrequencyMs(C7957d dVar) {
        long j;
        int i = C5419a.f17278a[dVar.ordinal()];
        if (i == 1) {
            j = this.configResolver.mo17731y();
        } else if (i != 2) {
            j = -1;
        } else {
            j = this.configResolver.mo17732z();
        }
        if (C5422c.m21543f(j)) {
            return INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        return j;
    }

    private C7963f getGaugeMetadata() {
        return (C7963f) C7963f.m30171Y().mo23052z(this.gaugeMetadataManager.mo18031a()).mo23050A(this.gaugeMetadataManager.mo18032b()).mo23051B(this.gaugeMetadataManager.mo18033c()).mo18768o();
    }

    public static synchronized GaugeManager getInstance() {
        GaugeManager gaugeManager;
        synchronized (GaugeManager.class) {
            gaugeManager = instance;
        }
        return gaugeManager;
    }

    private long getMemoryGaugeCollectionFrequencyMs(C7957d dVar) {
        long j;
        int i = C5419a.f17278a[dVar.ordinal()];
        if (i == 1) {
            j = this.configResolver.mo17712B();
        } else if (i != 2) {
            j = -1;
        } else {
            j = this.configResolver.mo17713C();
        }
        if (C5431l.m21558e(j)) {
            return INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        return j;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C5422c lambda$new$0() {
        return new C5422c();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C5431l lambda$new$1() {
        return new C5431l();
    }

    private boolean startCollectingCpuMetrics(long j, Timer timer) {
        if (j == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.mo20804a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        ((C5422c) this.cpuGaugeCollector.get()).mo18027k(j, timer);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j, Timer timer) {
        if (j == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.mo20804a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        ((C5431l) this.memoryGaugeCollector.get()).mo18037j(j, timer);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: syncFlush */
    public void lambda$stopCollectingGauges$3(String str, C7957d dVar) {
        C7966g.C7968b h0 = C7966g.m30190h0();
        while (!((C5422c) this.cpuGaugeCollector.get()).f17285a.isEmpty()) {
            h0.mo23058A((C7960e) ((C5422c) this.cpuGaugeCollector.get()).f17285a.poll());
        }
        while (!((C5431l) this.memoryGaugeCollector.get()).f17308b.isEmpty()) {
            h0.mo23061z((C7950b) ((C5431l) this.memoryGaugeCollector.get()).f17308b.poll());
        }
        h0.mo23060C(str);
        this.transportManager.mo21944A((C7966g) h0.mo18768o(), dVar);
    }

    public void collectGaugeMetricOnce(Timer timer) {
        collectGaugeMetricOnce((C5422c) this.cpuGaugeCollector.get(), (C5431l) this.memoryGaugeCollector.get(), timer);
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new C5428i(context);
    }

    public boolean logGaugeMetadata(String str, C7957d dVar) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        this.transportManager.mo21944A((C7966g) C7966g.m30190h0().mo23060C(str).mo23059B(getGaugeMetadata()).mo18768o(), dVar);
        return true;
    }

    public void startCollectingGauges(PerfSession perfSession, C7957d dVar) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long startCollectingGauges = startCollectingGauges(dVar, perfSession.mo17999e());
        if (startCollectingGauges == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.mo20812j("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        String i = perfSession.mo18003i();
        this.sessionId = i;
        this.applicationProcessState = dVar;
        try {
            long j = startCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).scheduleAtFixedRate(new C5424e(this, i, dVar), j, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C6763a aVar = logger;
            aVar.mo20812j("Unable to start collecting Gauges: " + e.getMessage());
        }
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str != null) {
            C7957d dVar = this.applicationProcessState;
            ((C5422c) this.cpuGaugeCollector.get()).mo18028l();
            ((C5431l) this.memoryGaugeCollector.get()).mo18038k();
            ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).schedule(new C5423d(this, str, dVar), 20, TimeUnit.MILLISECONDS);
            this.sessionId = null;
            this.applicationProcessState = C7957d.APPLICATION_PROCESS_STATE_UNKNOWN;
        }
    }

    private static void collectGaugeMetricOnce(C5422c cVar, C5431l lVar, Timer timer) {
        cVar.mo18026c(timer);
        lVar.mo18036c(timer);
    }

    GaugeManager(C9134u uVar, C7506k kVar, C5380a aVar, C5428i iVar, C9134u uVar2, C9134u uVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = C7957d.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = uVar;
        this.transportManager = kVar;
        this.configResolver = aVar;
        this.gaugeMetadataManager = iVar;
        this.cpuGaugeCollector = uVar2;
        this.memoryGaugeCollector = uVar3;
    }

    private long startCollectingGauges(C7957d dVar, Timer timer) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(dVar);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, timer)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(dVar);
        if (!startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, timer)) {
            return cpuGaugeCollectionFrequencyMs;
        }
        if (cpuGaugeCollectionFrequencyMs == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            return memoryGaugeCollectionFrequencyMs;
        }
        return Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs);
    }
}

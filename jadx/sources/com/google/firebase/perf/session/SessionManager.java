package com.google.firebase.perf.session;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.application.C5374a;
import com.google.firebase.perf.application.C5377b;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import p186na.C7353a;
import p186na.C7354b;
import p225qa.C7957d;

@Keep
public class SessionManager extends C5377b {
    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final C5374a appStateMonitor;
    private final Set<WeakReference<C7353a>> clients;
    private final GaugeManager gaugeManager;
    private PerfSession perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), PerfSession.m21523d(), C5374a.m21231b());
    }

    public static SessionManager getInstance() {
        return instance;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setApplicationContext$0(Context context, PerfSession perfSession2) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (perfSession2.mo18001g()) {
            this.gaugeManager.logGaugeMetadata(perfSession2.mo18003i(), C7957d.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(C7957d dVar) {
        if (this.perfSession.mo18001g()) {
            this.gaugeManager.logGaugeMetadata(this.perfSession.mo18003i(), dVar);
        }
    }

    private void startOrStopCollectingGauges(C7957d dVar) {
        if (this.perfSession.mo18001g()) {
            this.gaugeManager.startCollectingGauges(this.perfSession, dVar);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        C7957d dVar = C7957d.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(dVar);
        startOrStopCollectingGauges(dVar);
    }

    public void onUpdateAppState(C7957d dVar) {
        super.onUpdateAppState(dVar);
        if (!this.appStateMonitor.mo17676f()) {
            if (dVar == C7957d.FOREGROUND) {
                updatePerfSession(dVar);
            } else if (!updatePerfSessionIfExpired()) {
                startOrStopCollectingGauges(dVar);
            }
        }
    }

    public final PerfSession perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<C7353a> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(Context context) {
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new C7354b(this, context, this.perfSession));
    }

    public void setPerfSession(PerfSession perfSession2) {
        this.perfSession = perfSession2;
    }

    public void unregisterForSessionUpdates(WeakReference<C7353a> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(C7957d dVar) {
        synchronized (this.clients) {
            this.perfSession = PerfSession.m21523d();
            Iterator<WeakReference<C7353a>> it = this.clients.iterator();
            while (it.hasNext()) {
                C7353a aVar = (C7353a) it.next().get();
                if (aVar != null) {
                    aVar.mo17789a(this.perfSession);
                } else {
                    it.remove();
                }
            }
        }
        logGaugeMetadataIfCollectionEnabled(dVar);
        startOrStopCollectingGauges(dVar);
    }

    public boolean updatePerfSessionIfExpired() {
        if (!this.perfSession.mo18000f()) {
            return false;
        }
        updatePerfSession(this.appStateMonitor.mo17673a());
        return true;
    }

    public SessionManager(GaugeManager gaugeManager2, PerfSession perfSession2, C5374a aVar) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager2;
        this.perfSession = perfSession2;
        this.appStateMonitor = aVar;
        registerForAppState();
    }
}

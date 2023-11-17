package com.google.firebase.perf.application;

import com.google.firebase.perf.application.C5374a;
import java.lang.ref.WeakReference;
import p225qa.C7957d;

/* renamed from: com.google.firebase.perf.application.b */
public abstract class C5377b implements C5374a.C5376b {
    private final WeakReference<C5374a.C5376b> appStateCallback;
    private final C5374a appStateMonitor;
    private C7957d currentAppState;
    private boolean isRegisteredForAppState;

    protected C5377b() {
        this(C5374a.m21231b());
    }

    public C7957d getAppState() {
        return this.currentAppState;
    }

    public WeakReference<C5374a.C5376b> getAppStateCallback() {
        return this.appStateCallback;
    }

    /* access modifiers changed from: protected */
    public void incrementTsnsCount(int i) {
        this.appStateMonitor.mo17675e(i);
    }

    public void onUpdateAppState(C7957d dVar) {
        C7957d dVar2 = this.currentAppState;
        C7957d dVar3 = C7957d.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (dVar2 == dVar3) {
            this.currentAppState = dVar;
        } else if (dVar2 != dVar && dVar != dVar3) {
            this.currentAppState = C7957d.FOREGROUND_BACKGROUND;
        }
    }

    /* access modifiers changed from: protected */
    public void registerForAppState() {
        if (!this.isRegisteredForAppState) {
            this.currentAppState = this.appStateMonitor.mo17673a();
            this.appStateMonitor.mo17680k(this.appStateCallback);
            this.isRegisteredForAppState = true;
        }
    }

    /* access modifiers changed from: protected */
    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            this.appStateMonitor.mo17688p(this.appStateCallback);
            this.isRegisteredForAppState = false;
        }
    }

    protected C5377b(C5374a aVar) {
        this.isRegisteredForAppState = false;
        this.currentAppState = C7957d.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = aVar;
        this.appStateCallback = new WeakReference<>(this);
    }
}

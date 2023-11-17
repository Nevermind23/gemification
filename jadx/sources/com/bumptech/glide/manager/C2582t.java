package com.bumptech.glide.manager;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import p035c4.C2250d;
import p089g4.C6224l;

/* renamed from: com.bumptech.glide.manager.t */
public class C2582t {

    /* renamed from: a */
    private final Set f8045a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private final Set f8046b = new HashSet();

    /* renamed from: c */
    private boolean f8047c;

    /* renamed from: a */
    public boolean mo8088a(C2250d dVar) {
        boolean z = true;
        if (dVar == null) {
            return true;
        }
        boolean remove = this.f8045a.remove(dVar);
        if (!this.f8046b.remove(dVar) && !remove) {
            z = false;
        }
        if (z) {
            dVar.clear();
        }
        return z;
    }

    /* renamed from: b */
    public void mo8089b() {
        for (C2250d a : C6224l.m24741j(this.f8045a)) {
            mo8088a(a);
        }
        this.f8046b.clear();
    }

    /* renamed from: c */
    public void mo8090c() {
        this.f8047c = true;
        for (C2250d dVar : C6224l.m24741j(this.f8045a)) {
            if (dVar.isRunning() || dVar.mo7268i()) {
                dVar.clear();
                this.f8046b.add(dVar);
            }
        }
    }

    /* renamed from: d */
    public void mo8091d() {
        this.f8047c = true;
        for (C2250d dVar : C6224l.m24741j(this.f8045a)) {
            if (dVar.isRunning()) {
                dVar.mo7261c();
                this.f8046b.add(dVar);
            }
        }
    }

    /* renamed from: e */
    public void mo8092e() {
        for (C2250d dVar : C6224l.m24741j(this.f8045a)) {
            if (!dVar.mo7268i() && !dVar.mo7266g()) {
                dVar.clear();
                if (!this.f8047c) {
                    dVar.mo7272l();
                } else {
                    this.f8046b.add(dVar);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo8093f() {
        this.f8047c = false;
        for (C2250d dVar : C6224l.m24741j(this.f8045a)) {
            if (!dVar.mo7268i() && !dVar.isRunning()) {
                dVar.mo7272l();
            }
        }
        this.f8046b.clear();
    }

    /* renamed from: g */
    public void mo8094g(C2250d dVar) {
        this.f8045a.add(dVar);
        if (!this.f8047c) {
            dVar.mo7272l();
            return;
        }
        dVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f8046b.add(dVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f8045a.size() + ", isPaused=" + this.f8047c + "}";
    }
}

package com.google.firebase.perf.application;

import android.app.Activity;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.core.app.C0715m;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.Map;
import p134ja.C6763a;
import p147ka.C6849g;
import p212pa.C7784g;

/* renamed from: com.google.firebase.perf.application.d */
public class C5379d {

    /* renamed from: e */
    private static final C6763a f17175e = C6763a.m26371e();

    /* renamed from: a */
    private final Activity f17176a;

    /* renamed from: b */
    private final C0715m f17177b;

    /* renamed from: c */
    private final Map f17178c;

    /* renamed from: d */
    private boolean f17179d;

    public C5379d(Activity activity) {
        this(activity, new C0715m(), new HashMap());
    }

    /* renamed from: a */
    static boolean m21252a() {
        return true;
    }

    /* renamed from: b */
    private C7784g m21253b() {
        if (!this.f17179d) {
            f17175e.mo20804a("No recording has been started.");
            return C7784g.m29491a();
        }
        SparseIntArray[] b = this.f17177b.mo3152b();
        if (b == null) {
            f17175e.mo20804a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return C7784g.m29491a();
        } else if (b[0] != null) {
            return C7784g.m29493e(C6849g.m26591a(b));
        } else {
            f17175e.mo20804a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return C7784g.m29491a();
        }
    }

    /* renamed from: c */
    public void mo17697c() {
        if (this.f17179d) {
            f17175e.mo20805b("FrameMetricsAggregator is already recording %s", this.f17176a.getClass().getSimpleName());
            return;
        }
        this.f17177b.mo3151a(this.f17176a);
        this.f17179d = true;
    }

    /* renamed from: d */
    public void mo17698d(Fragment fragment) {
        if (!this.f17179d) {
            f17175e.mo20804a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
        } else if (this.f17178c.containsKey(fragment)) {
            f17175e.mo20805b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
        } else {
            C7784g b = m21253b();
            if (!b.mo22547d()) {
                f17175e.mo20805b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
                return;
            }
            this.f17178c.put(fragment, (C6849g.C6850a) b.mo22546c());
        }
    }

    /* renamed from: e */
    public C7784g mo17699e() {
        if (!this.f17179d) {
            f17175e.mo20804a("Cannot stop because no recording was started");
            return C7784g.m29491a();
        }
        if (!this.f17178c.isEmpty()) {
            f17175e.mo20804a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.f17178c.clear();
        }
        C7784g b = m21253b();
        try {
            this.f17177b.mo3153c(this.f17176a);
        } catch (IllegalArgumentException | NullPointerException e) {
            if (!(e instanceof NullPointerException) || Build.VERSION.SDK_INT <= 28) {
                f17175e.mo20813k("View not hardware accelerated. Unable to collect FrameMetrics. %s", e.toString());
                b = C7784g.m29491a();
            } else {
                throw e;
            }
        }
        this.f17177b.mo3154d();
        this.f17179d = false;
        return b;
    }

    /* renamed from: f */
    public C7784g mo17700f(Fragment fragment) {
        if (!this.f17179d) {
            f17175e.mo20804a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return C7784g.m29491a();
        } else if (!this.f17178c.containsKey(fragment)) {
            f17175e.mo20805b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            return C7784g.m29491a();
        } else {
            C6849g.C6850a aVar = (C6849g.C6850a) this.f17178c.remove(fragment);
            C7784g b = m21253b();
            if (b.mo22547d()) {
                return C7784g.m29493e(((C6849g.C6850a) b.mo22546c()).mo20902a(aVar));
            }
            f17175e.mo20805b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
            return C7784g.m29491a();
        }
    }

    C5379d(Activity activity, C0715m mVar, Map map) {
        this.f17179d = false;
        this.f17176a = activity;
        this.f17177b = mVar;
        this.f17178c = map;
    }
}

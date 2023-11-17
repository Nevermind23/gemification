package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.perf.application.C5374a;
import com.google.firebase.perf.application.C5377b;
import com.google.firebase.perf.config.C5380a;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p134ja.C6763a;
import p160la.C7034e;
import p186na.C7353a;
import p199oa.C7506k;
import p212pa.C7777a;
import p342j$.util.concurrent.ConcurrentHashMap;

public class Trace extends C5377b implements Parcelable, C7353a {
    @Keep
    public static final Parcelable.Creator<Trace> CREATOR = new C5411a();

    /* renamed from: p */
    private static final C6763a f17246p = C6763a.m26371e();

    /* renamed from: q */
    private static final Map f17247q = new ConcurrentHashMap();

    /* renamed from: r */
    static final Parcelable.Creator f17248r = new C5412b();

    /* renamed from: d */
    private final WeakReference f17249d;

    /* renamed from: e */
    private final Trace f17250e;

    /* renamed from: f */
    private final GaugeManager f17251f;

    /* renamed from: g */
    private final String f17252g;

    /* renamed from: h */
    private final Map f17253h;

    /* renamed from: i */
    private final Map f17254i;

    /* renamed from: j */
    private final List f17255j;

    /* renamed from: k */
    private final List f17256k;

    /* renamed from: l */
    private final C7506k f17257l;

    /* renamed from: m */
    private final C7777a f17258m;

    /* renamed from: n */
    private Timer f17259n;

    /* renamed from: o */
    private Timer f17260o;

    /* renamed from: com.google.firebase.perf.metrics.Trace$a */
    class C5411a implements Parcelable.Creator {
        C5411a() {
        }

        /* renamed from: a */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, false, (C5411a) null);
        }

        /* renamed from: b */
        public Trace[] newArray(int i) {
            return new Trace[i];
        }
    }

    /* renamed from: com.google.firebase.perf.metrics.Trace$b */
    class C5412b implements Parcelable.Creator {
        C5412b() {
        }

        /* renamed from: a */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, true, (C5411a) null);
        }

        /* renamed from: b */
        public Trace[] newArray(int i) {
            return new Trace[i];
        }
    }

    /* synthetic */ Trace(Parcel parcel, boolean z, C5411a aVar) {
        this(parcel, z);
    }

    /* renamed from: b */
    private void m21436b(String str, String str2) {
        if (mo17804l()) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", new Object[]{this.f17252g}));
        } else if (this.f17254i.containsKey(str) || this.f17254i.size() < 5) {
            C7034e.m27239d(str, str2);
        } else {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", new Object[]{5}));
        }
    }

    /* renamed from: m */
    private Counter m21437m(String str) {
        Counter counter = (Counter) this.f17253h.get(str);
        if (counter != null) {
            return counter;
        }
        Counter counter2 = new Counter(str);
        this.f17253h.put(str, counter2);
        return counter2;
    }

    /* renamed from: p */
    private void m21438p(Timer timer) {
        if (!this.f17256k.isEmpty()) {
            Trace trace = (Trace) this.f17256k.get(this.f17256k.size() - 1);
            if (trace.f17260o == null) {
                trace.f17260o = timer;
            }
        }
    }

    /* renamed from: a */
    public void mo17789a(PerfSession perfSession) {
        if (perfSession == null) {
            f17246p.mo20812j("Unable to add new SessionId to the Trace. Continuing without it.");
        } else if (mo17802j() && !mo17804l()) {
            this.f17255j.add(perfSession);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Map mo17790d() {
        return this.f17253h;
    }

    @Keep
    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Timer mo17792e() {
        return this.f17260o;
    }

    /* renamed from: f */
    public String mo17793f() {
        return this.f17252g;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            if (mo17803k()) {
                f17246p.mo20813k("Trace '%s' is started but not stopped when it is destructed!", this.f17252g);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public List mo17795g() {
        List unmodifiableList;
        synchronized (this.f17255j) {
            ArrayList arrayList = new ArrayList();
            for (PerfSession perfSession : this.f17255j) {
                if (perfSession != null) {
                    arrayList.add(perfSession);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    @Keep
    public String getAttribute(String str) {
        return (String) this.f17254i.get(str);
    }

    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f17254i);
    }

    @Keep
    public long getLongMetric(String str) {
        Counter counter;
        if (str != null) {
            counter = (Counter) this.f17253h.get(str.trim());
        } else {
            counter = null;
        }
        if (counter == null) {
            return 0;
        }
        return counter.mo17779a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Timer mo17799h() {
        return this.f17259n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public List mo17800i() {
        return this.f17256k;
    }

    @Keep
    public void incrementMetric(String str, long j) {
        String e = C7034e.m27240e(str);
        if (e != null) {
            f17246p.mo20807d("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, e);
        } else if (!mo17802j()) {
            f17246p.mo20813k("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.f17252g);
        } else if (mo17804l()) {
            f17246p.mo20813k("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.f17252g);
        } else {
            Counter m = m21437m(str.trim());
            m.mo17781d(j);
            f17246p.mo20805b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(m.mo17779a()), this.f17252g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo17802j() {
        return this.f17259n != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo17803k() {
        return mo17802j() && !mo17804l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo17804l() {
        return this.f17260o != null;
    }

    @Keep
    public void putAttribute(String str, String str2) {
        boolean z = false;
        try {
            str = str.trim();
            str2 = str2.trim();
            m21436b(str, str2);
            f17246p.mo20805b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f17252g);
            z = true;
        } catch (Exception e) {
            f17246p.mo20807d("Can not set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
        }
        if (z) {
            this.f17254i.put(str, str2);
        }
    }

    @Keep
    public void putMetric(String str, long j) {
        String e = C7034e.m27240e(str);
        if (e != null) {
            f17246p.mo20807d("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, e);
        } else if (!mo17802j()) {
            f17246p.mo20813k("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.f17252g);
        } else if (mo17804l()) {
            f17246p.mo20813k("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.f17252g);
        } else {
            m21437m(str.trim()).mo17783e(j);
            f17246p.mo20805b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j), this.f17252g);
        }
    }

    @Keep
    public void removeAttribute(String str) {
        if (mo17804l()) {
            f17246p.mo20806c("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.f17254i.remove(str);
        }
    }

    @Keep
    public void start() {
        if (!C5380a.m21272g().mo17718K()) {
            f17246p.mo20804a("Trace feature is disabled.");
            return;
        }
        String f = C7034e.m27241f(this.f17252g);
        if (f != null) {
            f17246p.mo20807d("Cannot start trace '%s'. Trace name is invalid.(%s)", this.f17252g, f);
        } else if (this.f17259n != null) {
            f17246p.mo20807d("Trace '%s' has already started, should not start again!", this.f17252g);
        } else {
            this.f17259n = this.f17258m.mo22535a();
            registerForAppState();
            PerfSession perfSession = SessionManager.getInstance().perfSession();
            SessionManager.getInstance().registerForSessionUpdates(this.f17249d);
            mo17789a(perfSession);
            if (perfSession.mo18001g()) {
                this.f17251f.collectGaugeMetricOnce(perfSession.mo17999e());
            }
        }
    }

    @Keep
    public void stop() {
        if (!mo17802j()) {
            f17246p.mo20807d("Trace '%s' has not been started so unable to stop!", this.f17252g);
        } else if (mo17804l()) {
            f17246p.mo20807d("Trace '%s' has already stopped, should not stop again!", this.f17252g);
        } else {
            SessionManager.getInstance().unregisterForSessionUpdates(this.f17249d);
            unregisterForAppState();
            Timer a = this.f17258m.mo22535a();
            this.f17260o = a;
            if (this.f17250e == null) {
                m21438p(a);
                if (!this.f17252g.isEmpty()) {
                    this.f17257l.mo21946C(new C5413a(this).mo17819a(), getAppState());
                    if (SessionManager.getInstance().perfSession().mo18001g()) {
                        this.f17251f.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().mo17999e());
                        return;
                    }
                    return;
                }
                f17246p.mo20806c("Trace name is empty, no log is sent to server");
            }
        }
    }

    @Keep
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f17250e, 0);
        parcel.writeString(this.f17252g);
        parcel.writeList(this.f17256k);
        parcel.writeMap(this.f17253h);
        parcel.writeParcelable(this.f17259n, 0);
        parcel.writeParcelable(this.f17260o, 0);
        synchronized (this.f17255j) {
            parcel.writeList(this.f17255j);
        }
    }

    public Trace(String str, C7506k kVar, C7777a aVar, C5374a aVar2) {
        this(str, kVar, aVar, aVar2, GaugeManager.getInstance());
    }

    public Trace(String str, C7506k kVar, C7777a aVar, C5374a aVar2, GaugeManager gaugeManager) {
        super(aVar2);
        this.f17249d = new WeakReference(this);
        this.f17250e = null;
        this.f17252g = str.trim();
        this.f17256k = new ArrayList();
        this.f17253h = new ConcurrentHashMap();
        this.f17254i = new ConcurrentHashMap();
        this.f17258m = aVar;
        this.f17257l = kVar;
        this.f17255j = Collections.synchronizedList(new ArrayList());
        this.f17251f = gaugeManager;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private Trace(Parcel parcel, boolean z) {
        super(z ? null : C5374a.m21231b());
        this.f17249d = new WeakReference(this);
        Class<Trace> cls = Trace.class;
        this.f17250e = (Trace) parcel.readParcelable(cls.getClassLoader());
        this.f17252g = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f17256k = arrayList;
        parcel.readList(arrayList, cls.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f17253h = concurrentHashMap;
        this.f17254i = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, Counter.class.getClassLoader());
        Class<Timer> cls2 = Timer.class;
        this.f17259n = (Timer) parcel.readParcelable(cls2.getClassLoader());
        this.f17260o = (Timer) parcel.readParcelable(cls2.getClassLoader());
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        this.f17255j = synchronizedList;
        parcel.readList(synchronizedList, PerfSession.class.getClassLoader());
        if (z) {
            this.f17257l = null;
            this.f17258m = null;
            this.f17251f = null;
            return;
        }
        this.f17257l = C7506k.m28498k();
        this.f17258m = new C7777a();
        this.f17251f = GaugeManager.getInstance();
    }
}

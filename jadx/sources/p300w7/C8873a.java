package p300w7;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.support.p013v4.media.session.C0125b;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p144k7.C6828b;
import p144k7.C6829c;
import p144k7.C6834h;
import p182n6.C7264i;
import p260t6.C8404f;
import p260t6.C8407i;
import p260t6.C8415q;
import p260t6.C8417s;

/* renamed from: w7.a */
public class C8873a {

    /* renamed from: r */
    private static final long f24849r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s */
    private static volatile ScheduledExecutorService f24850s = null;

    /* renamed from: t */
    private static final Object f24851t = new Object();

    /* renamed from: u */
    private static volatile C8877e f24852u = new C8875c();

    /* renamed from: a */
    private final Object f24853a = new Object();

    /* renamed from: b */
    private final PowerManager.WakeLock f24854b;

    /* renamed from: c */
    private int f24855c = 0;

    /* renamed from: d */
    private Future f24856d;

    /* renamed from: e */
    private long f24857e;

    /* renamed from: f */
    private final Set f24858f = new HashSet();

    /* renamed from: g */
    private boolean f24859g = true;

    /* renamed from: h */
    private int f24860h;

    /* renamed from: i */
    C6828b f24861i;

    /* renamed from: j */
    private C8404f f24862j = C8407i.m31544d();

    /* renamed from: k */
    private WorkSource f24863k;

    /* renamed from: l */
    private final String f24864l;

    /* renamed from: m */
    private final String f24865m;

    /* renamed from: n */
    private final Context f24866n;

    /* renamed from: o */
    private final Map f24867o = new HashMap();

    /* renamed from: p */
    private AtomicInteger f24868p = new AtomicInteger(0);

    /* renamed from: q */
    private final ScheduledExecutorService f24869q;

    public C8873a(Context context, int i, String str) {
        String str2;
        String packageName = context.getPackageName();
        C7264i.m27903l(context, "WakeLock: context must not be null");
        C7264i.m27899h(str, "WakeLock: wakeLockName must not be empty");
        this.f24866n = context.getApplicationContext();
        this.f24865m = str;
        this.f24861i = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "*gcore*:".concat(valueOf);
            } else {
                str2 = new String("*gcore*:");
            }
            this.f24864l = str2;
        } else {
            this.f24864l = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i, str);
            this.f24854b = newWakeLock;
            if (C8417s.m31581c(context)) {
                WorkSource b = C8417s.m31580b(context, C8415q.m31576a(packageName) ? context.getPackageName() : packageName);
                this.f24863k = b;
                if (b != null) {
                    m33004i(newWakeLock, b);
                }
            }
            ScheduledExecutorService scheduledExecutorService = f24850s;
            if (scheduledExecutorService == null) {
                synchronized (f24851t) {
                    scheduledExecutorService = f24850s;
                    if (scheduledExecutorService == null) {
                        C6834h.m26559a();
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f24850s = scheduledExecutorService;
                    }
                }
            }
            this.f24869q = scheduledExecutorService;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("expected a non-null reference", 0, 29);
        throw new zzi(sb.toString());
    }

    /* renamed from: e */
    public static /* synthetic */ void m33000e(C8873a aVar) {
        synchronized (aVar.f24853a) {
            if (aVar.mo24297b()) {
                Log.e("WakeLock", String.valueOf(aVar.f24864l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                aVar.m33002g();
                if (aVar.mo24297b()) {
                    aVar.f24855c = 1;
                    aVar.m33003h(0);
                }
            }
        }
    }

    /* renamed from: f */
    private final String m33001f(String str) {
        if (this.f24859g) {
            TextUtils.isEmpty((CharSequence) null);
        }
        return null;
    }

    /* renamed from: g */
    private final void m33002g() {
        if (!this.f24858f.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f24858f);
            this.f24858f.clear();
            if (arrayList.size() > 0) {
                C0125b.m366a(arrayList.get(0));
                throw null;
            }
        }
    }

    /* renamed from: h */
    private final void m33003h(int i) {
        synchronized (this.f24853a) {
            if (mo24297b()) {
                if (this.f24859g) {
                    int i2 = this.f24855c - 1;
                    this.f24855c = i2;
                    if (i2 > 0) {
                        return;
                    }
                } else {
                    this.f24855c = 0;
                }
                m33002g();
                for (C8876d dVar : this.f24867o.values()) {
                    dVar.f24871a = 0;
                }
                this.f24867o.clear();
                Future future = this.f24856d;
                if (future != null) {
                    future.cancel(false);
                    this.f24856d = null;
                    this.f24857e = 0;
                }
                this.f24860h = 0;
                if (this.f24854b.isHeld()) {
                    try {
                        this.f24854b.release();
                        if (this.f24861i != null) {
                            this.f24861i = null;
                        }
                    } catch (RuntimeException e) {
                        if (e.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f24864l).concat(" failed to release!"), e);
                            if (this.f24861i != null) {
                                this.f24861i = null;
                            }
                            return;
                        }
                        throw e;
                    } catch (Throwable th) {
                        if (this.f24861i != null) {
                            this.f24861i = null;
                        }
                        throw th;
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f24864l).concat(" should be held!"));
                }
            }
        }
    }

    /* renamed from: i */
    private static void m33004i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    /* renamed from: a */
    public void mo24296a(long j) {
        this.f24868p.incrementAndGet();
        long j2 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f24849r), 1);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.f24853a) {
            if (!mo24297b()) {
                this.f24861i = C6828b.m26558a(false, (C6829c) null);
                this.f24854b.acquire();
                this.f24862j.mo23596c();
            }
            this.f24855c++;
            this.f24860h++;
            m33001f((String) null);
            C8876d dVar = (C8876d) this.f24867o.get((Object) null);
            if (dVar == null) {
                dVar = new C8876d((C8875c) null);
                this.f24867o.put((Object) null, dVar);
            }
            dVar.f24871a++;
            long c = this.f24862j.mo23596c();
            if (Long.MAX_VALUE - c > max) {
                j2 = c + max;
            }
            if (j2 > this.f24857e) {
                this.f24857e = j2;
                Future future = this.f24856d;
                if (future != null) {
                    future.cancel(false);
                }
                this.f24856d = this.f24869q.schedule(new C8874b(this), max, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: b */
    public boolean mo24297b() {
        boolean z;
        synchronized (this.f24853a) {
            if (this.f24855c > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: c */
    public void mo24298c() {
        if (this.f24868p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f24864l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f24853a) {
            m33001f((String) null);
            if (this.f24867o.containsKey((Object) null)) {
                C8876d dVar = (C8876d) this.f24867o.get((Object) null);
                if (dVar != null) {
                    int i = dVar.f24871a - 1;
                    dVar.f24871a = i;
                    if (i == 0) {
                        this.f24867o.remove((Object) null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.f24864l).concat(" counter does not exist"));
            }
            m33003h(0);
        }
    }

    /* renamed from: d */
    public void mo24299d(boolean z) {
        synchronized (this.f24853a) {
            this.f24859g = z;
        }
    }
}

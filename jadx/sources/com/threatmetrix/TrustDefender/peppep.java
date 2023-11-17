package com.threatmetrix.TrustDefender;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.threatmetrix.TrustDefender.C11873a;
import com.threatmetrix.TrustDefender.C11893e;
import com.threatmetrix.TrustDefender.C11899f;
import com.threatmetrix.TrustDefender.C11907h;
import com.threatmetrix.TrustDefender.C11927l1;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import p585re.C17584a;
import p585re.C17588e;
import p585re.C17589f;
import p585re.C17592i;
import p585re.C17595l;
import p585re.C17602s;
import p585re.C17603t;

public abstract class peppep {
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final String f35068w;

    /* renamed from: x */
    private static final boolean f35069x;

    /* renamed from: y */
    public static volatile C11923l f35070y = null;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C11950d f35071a;

    /* renamed from: b */
    private final C11956j f35072b;

    /* renamed from: c */
    private final C11957k f35073c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile String f35074d = null;

    /* renamed from: e */
    private volatile Thread f35075e = null;

    /* renamed from: f */
    private volatile Thread f35076f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public volatile C17595l f35077g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public volatile long f35078h = 0;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public volatile int f35079i = 0;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public volatile boolean f35080j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f35081k = 30000;

    /* renamed from: l */
    private volatile boolean f35082l = false;

    /* renamed from: m */
    private volatile int f35083m = 10000;

    /* renamed from: n */
    public C11999v f35084n = null;

    /* renamed from: o */
    public C11927l1 f35085o = null;

    /* renamed from: p */
    public final C17592i f35086p = new C17592i();

    /* renamed from: q */
    public C17603t f35087q = null;

    /* renamed from: r */
    public volatile C11893e f35088r = null;

    /* renamed from: s */
    public volatile int f35089s = 0;

    /* renamed from: t */
    public volatile boolean f35090t = true;

    /* renamed from: u */
    public final AtomicLong f35091u = new AtomicLong(0);

    /* renamed from: v */
    private final C11951e f35092v = new C11951e();

    /* renamed from: com.threatmetrix.TrustDefender.peppep$a */
    public class C11946a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C11956j f35093d;

        /* renamed from: e */
        public final /* synthetic */ C17584a f35094e;

        /* renamed from: f */
        public final /* synthetic */ C17603t f35095f;

        /* renamed from: g */
        public final /* synthetic */ long f35096g;

        public C11946a(C11956j jVar, C17584a aVar, C17603t tVar, long j) {
            this.f35093d = jVar;
            this.f35094e = aVar;
            this.f35095f = tVar;
            this.f35096g = j;
        }

        public void run() {
            try {
                C11907h.m43607b(peppep.f35068w, "Doing slow init stuff");
                C11956j jVar = this.f35093d;
                if (jVar != null) {
                    jVar.mo32013a(this.f35094e);
                }
                C11996u0.m44036s().mo32080m(this.f35095f, "TMXProfiling-6.3-81-jni", C11907h.m43613h(), C11907h.m43621p());
                String s = peppep.f35068w;
                StringBuilder sb = new StringBuilder();
                sb.append("Native libs: ");
                sb.append(C11996u0.m44036s().mo32072e() ? "available" : "unavailable");
                C11907h.m43610e(s, sb.toString());
                C11927l1 l1Var = new C11927l1(this.f35094e.mo45130o(), this.f35094e.mo45121f(), peppep.this.f35091u, this.f35096g);
                peppep peppep = peppep.this;
                peppep.f35085o = l1Var;
                C17595l h = peppep.m43874u();
                if (h != null) {
                    String s2 = peppep.f35068w;
                    C11907h.C11908a.m43624b(s2, "applying saved options (" + h.mo45159d() + " / " + h.mo45164i() + ") to " + peppep.this.f35091u.get());
                    peppep.this.m43870p(h.mo45164i(), h.mo45159d());
                    C11907h.C11908a.m43628f(peppep.f35068w, "Got quiet period from saved preferences {}", Integer.valueOf(h.mo45161f()));
                    C17595l unused = peppep.this.f35077g = h;
                    int unused2 = peppep.this.f35079i = h.mo45161f();
                }
                if ((peppep.this.f35091u.get() & 1048576) == 0) {
                    peppep.this.mo31938j(this.f35095f);
                }
                C11950d a = peppep.this.f35071a;
                if (!((peppep.this.f35091u.get() & 131072) == 0 || a == null)) {
                    boolean unused3 = peppep.this.f35080j = a.mo31922b(this.f35095f);
                }
                C11921k0.m43728k((String) null);
                if (!this.f35094e.mo45122g()) {
                    C11923l lVar = peppep.f35070y;
                    C17603t o = this.f35094e.mo45130o();
                    peppep peppep2 = peppep.this;
                    lVar.mo31970i(o, peppep2.f35086p, C11953g.INIT, 0, peppep2.f35081k, (C17588e) null);
                }
                peppep.this.f35086p.mo45150h(true);
                C11907h.m43607b(peppep.f35068w, "init completed successfully");
            } catch (Throwable th) {
                peppep.this.f35086p.mo45150h(false);
                String s3 = peppep.f35068w;
                C11907h.m43607b(s3, "Exception in init" + th.toString());
            }
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.peppep$b */
    public class C11947b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f35098d;

        /* renamed from: e */
        public final /* synthetic */ C11903g f35099e;

        /* renamed from: f */
        public final /* synthetic */ C11883c f35100f;

        /* renamed from: g */
        public final /* synthetic */ C11960n f35101g;

        public C11947b(String str, C11903g gVar, C11883c cVar, C11960n nVar) {
            this.f35098d = str;
            this.f35099e = gVar;
            this.f35100f = cVar;
            this.f35101g = nVar;
        }

        public void run() {
            peppep.this.m43861f(this.f35098d, this.f35099e, this.f35100f, this.f35101g);
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.peppep$c */
    public class C11948c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C11938n0 f35103d;

        /* renamed from: e */
        public final /* synthetic */ String f35104e;

        /* renamed from: com.threatmetrix.TrustDefender.peppep$c$a */
        public class C11949a implements C11893e.C11895b {
            public C11949a() {
            }

            /* renamed from: a */
            public boolean mo31945a(C11893e.C11896c cVar, InputStream inputStream) {
                if (cVar.mo31948c()) {
                    return true;
                }
                String s = peppep.f35068w;
                C11907h.m43607b(s, "secondary post request failed: " + cVar.toString());
                return true;
            }
        }

        public C11948c(C11938n0 n0Var, String str) {
            this.f35103d = n0Var;
            this.f35104e = str;
        }

        public void run() {
            if ((peppep.this.f35091u.get() & 1024) != 0) {
                C12016z zVar = new C12016z();
                if (!this.f35103d.f35019A.isEmpty()) {
                    for (String b : this.f35103d.f35019A) {
                        peppep.this.f35088r.mo31944d(peppep.this.f35084n.mo32095b(this.f35104e, this.f35103d.f35041u, b));
                    }
                }
                zVar.mo32108c("Started DNS request", "sdr");
            }
            if ((peppep.this.f35091u.get() & 562949953421312L) != 0 && C11921k0.m43732o(this.f35103d.f35044x)) {
                C17602s sVar = new C17602s();
                sVar.mo45183c("org_id", peppep.this.f35084n.f35325c);
                sVar.mo45183c("session_id", this.f35104e);
                sVar.mo45183c("nonce", this.f35103d.f35041u);
                sVar.mo45183c("i", "1");
                byte[] h = sVar.mo45187h();
                Map f = C11999v.m44073f(peppep.this.f35085o, (String) null, h == null ? 0 : h.length);
                C11999v vVar = peppep.this.f35084n;
                C11938n0 n0Var = this.f35103d;
                peppep.this.f35088r.mo31942a(C11893e.C11894a.POST, vVar.mo32094a(n0Var.f35044x, n0Var.f35043w, "clear.png"), f, h, new C11949a());
            }
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.peppep$d */
    public interface C11950d {
        /* renamed from: a */
        String mo31921a(int i);

        /* renamed from: b */
        boolean mo31922b(C17603t tVar);
    }

    /* renamed from: com.threatmetrix.TrustDefender.peppep$e */
    public final class C11951e implements ServiceConnection {

        /* renamed from: a */
        private C11873a f35107a = null;

        /* renamed from: b */
        private boolean f35108b = false;

        /* renamed from: c */
        private final ReentrantLock f35109c = new ReentrantLock();

        public C11951e() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m43888a(Context context) {
            this.f35109c.lock();
            try {
                if (!this.f35108b) {
                    this.f35109c.unlock();
                    return;
                }
                context.unbindService(this);
                this.f35108b = false;
                this.f35107a = null;
                this.f35109c.unlock();
            } catch (Throwable th) {
                this.f35109c.unlock();
                throw th;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public boolean m43890c(Context context) {
            if ((peppep.f35070y.mo31967d() & 4) == 0) {
                return false;
            }
            Intent intent = new Intent(context, C11878b.class);
            this.f35109c.lock();
            try {
                return context.bindService(intent, this, 1);
            } catch (SecurityException e) {
                String s = peppep.f35068w;
                C11907h.C11908a.m43624b(s, "Filed to bind the service " + e.toString());
                return false;
            } finally {
                this.f35109c.unlock();
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.f35109c.lock();
            try {
                this.f35107a = C11873a.C11874a.m43515k(iBinder);
                this.f35108b = true;
            } finally {
                this.f35109c.unlock();
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            this.f35109c.lock();
            try {
                this.f35108b = false;
                this.f35107a = null;
            } finally {
                this.f35109c.unlock();
            }
        }
    }

    public static class epeppe extends Exception {

        /* renamed from: d */
        public final C17589f f35111d;

        public epeppe(C17589f fVar) {
            this.f35111d = fVar;
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.peppep$f */
    public class C11952f extends C11958l {

        /* renamed from: d */
        public CountDownLatch f35112d;

        public C11952f(String str, CountDownLatch countDownLatch) {
            super(str);
            this.f35112d = countDownLatch;
        }

        /* renamed from: a */
        public boolean mo31945a(C11893e.C11896c cVar, InputStream inputStream) {
            if (!super.mo31945a(cVar, inputStream)) {
                C11907h.m43610e(peppep.f35068w, "profiling will be incomplete");
                this.f35112d.countDown();
                return false;
            }
            C11907h.m43607b(peppep.f35068w, "profile request complete");
            long unused = peppep.this.f35078h = System.currentTimeMillis();
            this.f35112d.countDown();
            return true;
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.peppep$g */
    public enum C11953g {
        PROFILE,
        SCAN_PACKAGES,
        INIT
    }

    /* renamed from: com.threatmetrix.TrustDefender.peppep$h */
    public private final class C11954h implements Runnable {

        /* renamed from: d */
        public final C11899f.C11900a f35118d;

        /* renamed from: e */
        public final C11883c f35119e;

        public C11954h(C11899f.C11900a aVar, C11883c cVar) {
            this.f35118d = aVar;
            this.f35119e = cVar;
        }

        public void run() {
            C11883c cVar = this.f35119e;
            if (cVar != null) {
                try {
                    cVar.mo31926a(this.f35118d);
                } catch (Throwable th) {
                    String s = peppep.f35068w;
                    C11907h.m43609d(s, "Unexpected exception occurred when calling EndNotifier " + th.toString());
                }
            }
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.peppep$i */
    public private final class C11955i extends Thread {

        /* renamed from: d */
        public final Runnable f35121d;

        public C11955i(Runnable runnable) {
            this.f35121d = runnable;
        }

        public void run() {
            this.f35121d.run();
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.peppep$j */
    public interface C11956j {
        /* renamed from: a */
        void mo32013a(C17584a aVar);

        /* renamed from: b */
        void mo32014b(C11927l1.C11928a aVar);

        /* renamed from: c */
        void mo32015c();

        /* renamed from: d */
        C11927l1.C11928a mo32016d();
    }

    /* renamed from: com.threatmetrix.TrustDefender.peppep$k */
    public interface C11957k {
        /* renamed from: a */
        void mo32017a(C17603t tVar, String str);

        /* renamed from: b */
        String mo32018b();

        /* renamed from: c */
        String mo32019c();
    }

    /* renamed from: com.threatmetrix.TrustDefender.peppep$l */
    public class C11958l implements C11893e.C11895b {

        /* renamed from: a */
        public final String f35123a;

        /* renamed from: b */
        public C11893e.C11896c f35124b = new C11893e.C11896c(-2);

        public C11958l(String str) {
            this.f35123a = str;
        }

        /* renamed from: a */
        public boolean mo31945a(C11893e.C11896c cVar, InputStream inputStream) {
            this.f35124b = cVar;
            if (cVar.mo31948c()) {
                return true;
            }
            C11907h.m43606a(peppep.f35068w, "Failed to request {} with http response {}", this.f35123a, cVar.toString());
            return false;
        }

        /* renamed from: b */
        public C17589f mo32020b() {
            int a = this.f35124b.mo31946a();
            if (a == 200) {
                return C17589f.TMX_OK;
            }
            switch (a) {
                case -15:
                    return C17589f.TMX_CRLError;
                case -14:
                    return C17589f.TMX_CertStoreError;
                case -13:
                    return C17589f.TMX_CertPathValidatorError;
                case -12:
                    return C17589f.TMX_CertPathBuilderError;
                case -11:
                    return C17589f.TMX_CertificateParsingError;
                case -10:
                    return C17589f.TMX_CertificateNotYetValid;
                case -9:
                    return C17589f.TMX_CertificateExpired;
                case -8:
                    return C17589f.TMX_CertificateEncodingError;
                case -7:
                    return C17589f.TMX_CertificateError;
                case -6:
                    return C17589f.TMX_Certificate_Mismatch;
                case -5:
                    return C17589f.TMX_HostVerification_Error;
                case -4:
                    return C17589f.TMX_NetworkTimeout_Error;
                case -3:
                    return C17589f.TMX_HostNotFound_Error;
                case -2:
                    return C17589f.TMX_NotYet;
                default:
                    return C17589f.TMX_Connection_Error;
            }
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.peppep$m */
    public class C11959m extends C11958l {

        /* renamed from: d */
        public CountDownLatch f35126d;

        /* renamed from: e */
        public C11938n0 f35127e;

        /* renamed from: f */
        public String f35128f;

        /* renamed from: g */
        public String f35129g;

        public C11959m(String str, CountDownLatch countDownLatch, C11938n0 n0Var, String str2, String str3) {
            super(str);
            this.f35126d = countDownLatch;
            this.f35127e = n0Var;
            this.f35128f = str2;
            this.f35129g = str3;
        }

        /* renamed from: a */
        public boolean mo31945a(C11893e.C11896c cVar, InputStream inputStream) {
            String s;
            String str;
            if (super.mo31945a(cVar, inputStream)) {
                if (inputStream == null) {
                    s = peppep.f35068w;
                    str = "Configure request succeeded but stream is null";
                } else {
                    try {
                        this.f35127e.mo31993l(inputStream, this.f35128f, this.f35129g);
                        this.f35126d.countDown();
                        return true;
                    } catch (InterruptedIOException unused) {
                        s = peppep.f35068w;
                        str = "Failed to read the input stream";
                    }
                }
                C11907h.m43610e(s, str);
            }
            this.f35126d.countDown();
            return false;
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.peppep$n */
    public private class C11960n implements C11899f {

        /* renamed from: a */
        private final String f35131a;

        public C11960n(String str) {
            this.f35131a = str;
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.peppep$o */
    public private final class C11961o implements Runnable {

        /* renamed from: d */
        private boolean f35133d = false;

        /* renamed from: e */
        private final boolean f35134e;

        public C11961o(boolean z) {
            this.f35134e = z;
        }

        /* renamed from: a */
        public boolean mo32021a() {
            return this.f35133d;
        }

        public void run() {
            try {
                C11934m0.m43790a(peppep.this.f35087q.f49314a);
                C11950d a = peppep.this.f35071a;
                String a2 = (a == null || !peppep.this.f35080j || (peppep.this.f35091u.get() & 131072) == 0) ? null : a.mo31921a(peppep.this.f35089s / 10);
                if (peppep.this.f35086p.mo45152j() || Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
                peppep peppep = peppep.this;
                peppep.f35085o.mo31981c(a2, peppep.f35086p, peppep.f35074d, this.f35134e);
            } catch (InterruptedException unused) {
                this.f35133d = true;
            }
        }
    }

    static {
        String j = C11907h.m43615j(peppep.class);
        f35068w = j;
        String property = System.getProperty("java.vm.version");
        boolean z = property != null && property.equals("2.0.0");
        f35069x = z;
        if (z) {
            C11907h.m43607b(j, "Broken join() detected, activating fallback routine");
        }
    }

    public peppep(C11957k kVar, C11956j jVar, C11950d dVar) {
        this.f35073c = kVar;
        this.f35072b = jVar;
        this.f35071a = dVar;
    }

    /* renamed from: A */
    private C11899f m43853A(C11899f.C11900a aVar, C11883c cVar, C11899f fVar) {
        if (cVar != null) {
            Executors.newSingleThreadExecutor().execute(new C11954h(aVar, cVar));
        }
        return fVar;
    }

    /* renamed from: B */
    private boolean m43854B() {
        return (this.f35078h == 0 || this.f35079i == 0 || this.f35078h + TimeUnit.MILLISECONDS.convert((long) this.f35079i, TimeUnit.MINUTES) <= System.currentTimeMillis()) ? false : true;
    }

    /* renamed from: b */
    private C11938n0 m43857b(String str) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C11938n0 n0Var = new C11938n0();
        byte[] h = this.f35084n.mo32096c(str).mo45187h();
        Map f = C11999v.m44073f(this.f35085o, (String) null, h == null ? 0 : h.length);
        C11959m mVar = new C11959m(this.f35084n.mo32097d(), countDownLatch, n0Var, this.f35084n.f35325c, str);
        this.f35088r.mo31942a(C11893e.C11894a.POST, this.f35084n.mo32097d(), f, h, mVar);
        if (!countDownLatch.await((long) this.f35089s, TimeUnit.MILLISECONDS)) {
            throw new epeppe(C17589f.TMX_NetworkTimeout_Error);
        } else if (mVar.mo32020b() != C17589f.TMX_OK) {
            throw new epeppe(mVar.mo32020b());
        } else if (n0Var.mo31992h()) {
            return n0Var;
        } else {
            throw new epeppe(C17589f.TMX_ConfigurationError);
        }
    }

    /* renamed from: c */
    private void m43858c(C11938n0 n0Var, String str) {
        HashMap hashMap = new HashMap(4);
        C11893e eVar = this.f35088r;
        HashMap hashMap2 = new HashMap(3);
        hashMap2.put("org_id", this.f35084n.f35325c);
        hashMap2.put("session_id", str);
        hashMap2.put("nonce", n0Var.f35041u);
        hashMap.put("connectionInstance", eVar);
        hashMap.put("requestFixedPayload", hashMap2);
        hashMap.put("requestHeader", C11999v.m44073f(this.f35085o, (String) null, 0));
        C11999v vVar = this.f35084n;
        hashMap.put("requestUrl", vVar.mo32094a(vVar.f35324b, n0Var.f35043w, "clear3.png"));
        f35070y.mo31966a(n0Var, this.f35091u.get(), hashMap);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m43861f(String str, C11903g gVar, C11883c cVar, C11960n nVar) {
        C17589f fVar;
        C11899f.C11900a aVar;
        boolean z;
        String str2 = str;
        C11883c cVar2 = cVar;
        C11960n nVar2 = nVar;
        C17589f fVar2 = C17589f.TMX_NotYet;
        try {
            String str3 = f35068w;
            StringBuilder sb = new StringBuilder();
            sb.append("continuing profile request ");
            sb.append(this.f35086p.mo45148e() ? "inited already" : " needs init");
            C11907h.m43607b(str3, sb.toString());
            if (this.f35086p.mo45152j() || Thread.currentThread().isInterrupted()) {
                throw new InterruptedException();
            } else if (!this.f35086p.mo45148e()) {
                C11907h.m43607b(str3, "Not inited");
                throw new IllegalArgumentException("Not inited");
            } else if (this.f35086p.mo45151i(this.f35089s)) {
                C11907h.C11908a.m43624b(str3, "Result of binding service " + this.f35092v.m43890c(this.f35087q.f49314a));
                C12014y0.m44140d();
                if (!this.f35086p.mo45146c() || this.f35082l) {
                    C11907h.m43609d(str3, "scanPackages(profile): aborted! not inited or disabled");
                    z = false;
                } else {
                    z = f35070y.mo31970i(this.f35087q, this.f35086p, C11953g.PROFILE, 0, this.f35083m, (C17588e) null);
                }
                C11955i iVar = new C11955i(new C11961o(false));
                this.f35076f = iVar;
                iVar.start();
                if (this.f35086p.mo45152j() || Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
                C11938n0 b = m43857b(str);
                if (this.f35086p.mo45152j() || Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
                m43858c(b, str2);
                String str4 = b.f35043w;
                m43862g(b, str2);
                C17602s o = m43869o(str2, z, gVar, b);
                if (this.f35086p.mo45152j() || Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
                fVar = m43877x(str4, o);
                this.f35092v.m43888a(this.f35087q.f49314a);
                C12016z.m44147a();
                if (this.f35086p.mo45152j()) {
                    fVar = C17589f.TMX_Interrupted_Error;
                    Thread.interrupted();
                }
                this.f35076f = null;
                aVar = new C11899f.C11900a(str2, fVar);
                m43864i(aVar, cVar2, nVar2);
                C11941o0.m43833h().mo31994a(str2, fVar);
            } else {
                throw new InterruptedException();
            }
        } catch (InterruptedException e) {
            if (!this.f35086p.mo45152j()) {
                C11907h.m43620o(f35068w, "profile request interrupted", e);
                C17589f fVar3 = C17589f.TMX_Internal_Error;
            } else {
                C11907h.m43607b(f35068w, "profile request interrupted due to cancel");
            }
            fVar = C17589f.TMX_Interrupted_Error;
            this.f35092v.m43888a(this.f35087q.f49314a);
            C12016z.m44147a();
            if (this.f35086p.mo45152j()) {
                Thread.interrupted();
            }
            this.f35076f = null;
            aVar = new C11899f.C11900a(str2, fVar);
        } catch (epeppe e2) {
            C17589f fVar4 = e2.f35111d;
            this.f35092v.m43888a(this.f35087q.f49314a);
            C12016z.m44147a();
            if (this.f35086p.mo45152j()) {
                fVar4 = C17589f.TMX_Interrupted_Error;
                Thread.interrupted();
            }
            this.f35076f = null;
            aVar = new C11899f.C11900a(str2, fVar);
        } catch (Throwable th) {
            this.f35092v.m43888a(this.f35087q.f49314a);
            C12016z.m44147a();
            if (this.f35086p.mo45152j()) {
                fVar2 = C17589f.TMX_Interrupted_Error;
                Thread.interrupted();
            }
            this.f35076f = null;
            m43864i(new C11899f.C11900a(str2, fVar2), cVar2, nVar2);
            C11941o0.m43833h().mo31994a(str2, fVar2);
            throw th;
        }
    }

    /* renamed from: g */
    private void m43862g(C11938n0 n0Var, String str) {
        new Thread(new C11948c(n0Var, str)).start();
    }

    /* renamed from: i */
    private C11899f m43864i(C11899f.C11900a aVar, C11883c cVar, C11899f fVar) {
        this.f35086p.mo45144a();
        return m43853A(aVar, cVar, fVar);
    }

    /* renamed from: l */
    public static int m43866l(int i, int i2, String str) {
        return (int) m43873t((long) i, (long) i2, str);
    }

    /* renamed from: m */
    private boolean m43867m() {
        C17603t tVar = this.f35087q;
        boolean z = tVar == null || C11914j.m43670U(tVar);
        return this.f35078h == 0 ? z : z || this.f35090t;
    }

    /* renamed from: o */
    private C17602s m43869o(String str, boolean z, C11903g gVar, C11938n0 n0Var) {
        C11938n0 n0Var2 = n0Var;
        C12016z zVar = new C12016z();
        C11957k kVar = this.f35073c;
        if (!((this.f35091u.get() & 16777216) == 0 || kVar == null)) {
            kVar.mo32017a(this.f35087q, n0Var2.f35042v);
        }
        mo32005F(n0Var2);
        this.f35086p.mo45145b(true, z ? Long.valueOf(((long) this.f35089s) - C11941o0.m43833h().mo32000g()) : null);
        zVar.mo32108c("Scan packages finished", "spf");
        C17602s sVar = new C17602s();
        if (gVar.mo31952a() != null) {
            int i = 0;
            for (String a : gVar.mo31952a()) {
                StringBuilder sb = new StringBuilder();
                sb.append("aca");
                int i2 = i + 1;
                sb.append(i);
                sVar.mo45182a(sb.toString(), a, true);
                if (i2 >= 5) {
                    break;
                }
                i = i2;
            }
        }
        String b = kVar == null ? null : this.f35073c.mo32018b();
        String c = kVar == null ? null : this.f35073c.mo32019c();
        if (C11921k0.m43732o(b) && C11921k0.m43732o(c)) {
            sVar.mo45186f("snet", b, 5000);
            sVar.mo45183c("snetn", c);
        }
        C11956j jVar = this.f35072b;
        C17602s b2 = this.f35085o.mo31980b(n0Var, this.f35084n.f35325c, str, jVar == null ? null : jVar.mo32016d(), sVar, f35070y, true);
        zVar.mo32108c("Risk Body formed", "rbf");
        return b2;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m43870p(long j, long j2) {
        this.f35091u.set(((~j) & this.f35085o.f34899c) | j2);
    }

    /* renamed from: t */
    public static long m43873t(long j, long j2, String str) {
        if (j >= 0 && (j2 == 0 || j <= j2)) {
            return j;
        }
        C11907h.m43611f(f35068w, "Invalid value for {}, {}", str, String.valueOf(j));
        throw new IllegalArgumentException("Invalid value for {" + str + "}");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0084 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0085 A[RETURN] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p585re.C17595l m43874u() {
        /*
            r9 = this;
            re.t r0 = r9.f35087q
            java.lang.String r1 = r9.f35074d
            com.threatmetrix.TrustDefender.u0 r2 = com.threatmetrix.TrustDefender.C11996u0.m44036s()
            boolean r2 = r2.mo32072e()
            r3 = 0
            if (r2 == 0) goto L_0x0060
            re.l r2 = new re.l
            r2.<init>()
            com.threatmetrix.TrustDefender.u0 r4 = com.threatmetrix.TrustDefender.C11996u0.m44036s()     // Catch:{ NumberFormatException -> 0x0058 }
            java.lang.String r5 = "enableOptions"
            long r4 = r4.mo32066G(r0, r1, r5)     // Catch:{ NumberFormatException -> 0x0058 }
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0027
            r2.mo45158c(r4)     // Catch:{ NumberFormatException -> 0x0058 }
        L_0x0027:
            com.threatmetrix.TrustDefender.u0 r4 = com.threatmetrix.TrustDefender.C11996u0.m44036s()     // Catch:{ NumberFormatException -> 0x0058 }
            java.lang.String r5 = "disableOptions"
            long r4 = r4.mo32066G(r0, r1, r5)     // Catch:{ NumberFormatException -> 0x0058 }
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0038
            r2.mo45162g(r4)     // Catch:{ NumberFormatException -> 0x0058 }
        L_0x0038:
            com.threatmetrix.TrustDefender.u0 r4 = com.threatmetrix.TrustDefender.C11996u0.m44036s()     // Catch:{ NumberFormatException -> 0x0058 }
            java.lang.String r5 = "quietPeriod"
            int r4 = r4.mo32069b(r0, r1, r5)     // Catch:{ NumberFormatException -> 0x0058 }
            r5 = -1
            if (r4 == r5) goto L_0x0048
            r2.mo45160e(r4)     // Catch:{ NumberFormatException -> 0x0058 }
        L_0x0048:
            com.threatmetrix.TrustDefender.u0 r4 = com.threatmetrix.TrustDefender.C11996u0.m44036s()     // Catch:{ NumberFormatException -> 0x0058 }
            java.lang.String r5 = "sdkVersion"
            java.lang.String r4 = r4.mo32078k(r0, r1, r5)     // Catch:{ NumberFormatException -> 0x0058 }
            if (r4 == 0) goto L_0x0060
            r2.mo45156a(r4)     // Catch:{ NumberFormatException -> 0x0058 }
            goto L_0x0061
        L_0x0058:
            r2 = move-exception
            java.lang.String r4 = f35068w
            java.lang.String r5 = "Options/QuietPeriod are not a number"
            com.threatmetrix.TrustDefender.C11907h.m43620o(r4, r5, r2)
        L_0x0060:
            r2 = r3
        L_0x0061:
            java.lang.String r4 = "6.3-81"
            if (r2 == 0) goto L_0x006f
            java.lang.String r5 = r2.mo45157b()
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x0077
        L_0x006f:
            if (r0 == 0) goto L_0x0077
            if (r1 == 0) goto L_0x0077
            re.l r2 = com.threatmetrix.TrustDefender.C11933m.m43789b(r0, r1)
        L_0x0077:
            if (r2 == 0) goto L_0x0085
            java.lang.String r0 = r2.mo45157b()
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            return r2
        L_0x0085:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.threatmetrix.TrustDefender.peppep.m43874u():re.l");
    }

    /* renamed from: x */
    private C17589f m43877x(String str, C17602s sVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C11999v vVar = this.f35084n;
        String a = vVar.mo32094a(vVar.f35324b, str, "clear.png");
        C11952f fVar = new C11952f(a, countDownLatch);
        byte[] h = sVar.mo45187h();
        this.f35088r.mo31942a(C11893e.C11894a.POST, a, C11999v.m44073f(this.f35085o, (String) null, h == null ? 0 : h.length), h, fVar);
        if (countDownLatch.await((long) this.f35089s, TimeUnit.MILLISECONDS)) {
            C17589f b = fVar.mo32020b();
            C17589f fVar2 = C17589f.TMX_OK;
            if (b == fVar2) {
                return fVar2;
            }
            throw new epeppe(C17589f.TMX_PartialProfile);
        }
        throw new epeppe(C17589f.TMX_NetworkTimeout_Error);
    }

    /* renamed from: z */
    private boolean m43879z(C11938n0 n0Var) {
        StringBuilder sb;
        C17595l lVar = this.f35077g;
        C17603t tVar = this.f35087q;
        String str = this.f35074d;
        if (lVar != null) {
            if (!lVar.mo45163h(n0Var.f35022b, n0Var.f35023c, "6.3-81", n0Var.f35024d)) {
                return false;
            }
        }
        C12016z zVar = new C12016z();
        String str2 = f35068w;
        if (lVar != null) {
            sb.append("dynamic enableOptions / disableOptions (");
            sb.append(n0Var.f35022b);
            sb.append(" / ");
            sb.append(n0Var.f35023c);
            sb.append(") != saved: m_default values enableOptions / disableOptions / sdk_version / quietPeriod (");
            sb.append(lVar.mo45159d());
            sb.append(" / ");
            sb.append(lVar.mo45164i());
            sb.append(" / ");
            sb.append(lVar.mo45157b());
            sb.append(" / ");
            sb.append(lVar.mo45161f());
            sb.append(")");
            C11907h.C11908a.m43624b(str2, sb.toString());
        } else {
            sb = new StringBuilder();
            sb.append("dynamic enableOptions / disableOptions (");
            sb.append(n0Var.f35022b);
            sb.append(" / ");
            sb.append(n0Var.f35023c);
            sb.append(") != saved: m_default is null");
            C11907h.C11908a.m43624b(str2, sb.toString());
            lVar = new C17595l();
            this.f35077g = lVar;
        }
        lVar.mo45158c(n0Var.f35022b);
        lVar.mo45162g(n0Var.f35023c);
        lVar.mo45156a("6.3-81");
        lVar.mo45160e(n0Var.f35024d);
        if (C11996u0.m44036s().mo32072e()) {
            String str3 = str;
            C11996u0.m44036s().mo32084q(this.f35087q, str3, "enableOptions", n0Var.f35022b);
            C11996u0.m44036s().mo32084q(this.f35087q, str3, "disableOptions", n0Var.f35023c);
            C11996u0.m44036s().mo32092z(this.f35087q, str, "sdkVersion", "6.3-81");
            C11996u0.m44036s().mo32067H(this.f35087q, str, "quietPeriod", n0Var.f35024d);
        } else if (!(tVar == null || str == null)) {
            C11933m.m43788a(tVar, str, lVar);
        }
        zVar.mo32108c("Processed stored options", "pso");
        return true;
    }

    /* renamed from: D */
    public void mo31934D(C17584a aVar) {
        C17603t o = aVar.mo45130o();
        if (o != null) {
            if (C11907h.m43621p() && (aVar.mo45121f() & 268435456) == 0) {
                C11907h.m43618m(true);
            }
            if (!this.f35086p.mo45147d()) {
                C11907h.m43607b(f35068w, "Already init'd");
                return;
            }
            C12014y0.m44140d();
            try {
                this.f35082l = aVar.mo45117b();
                this.f35083m = m43866l(aVar.mo45116a(), 0, "package scan timeout");
                this.f35081k = m43866l(aVar.mo45127l(), 0, "init package scan timeout");
                mo31939q(aVar);
                if (!C11999v.m44072e(aVar.mo45125j())) {
                    this.f35086p.mo45150h(false);
                    throw new IllegalArgumentException("Failed to init: Invalid format for org id");
                } else if (!C11999v.m44074g(aVar.mo45131p())) {
                    this.f35084n = new C11999v(aVar.mo45131p(), aVar.mo45125j(), aVar.mo45120e());
                    this.f35089s = m43866l(aVar.mo45132q(), Integer.MAX_VALUE, "profileTimeout");
                    if (this.f35089s == 0) {
                        this.f35089s = C17584a.f49138u;
                    }
                    this.f35088r = aVar.mo45124i();
                    if (this.f35088r == null) {
                        String str = f35068w;
                        C11907h.C11908a.m43631i(str, "No profilingConnections instance being passed in by setProfilingConnections, try initialising one if connection module is available.");
                        this.f35088r = C11923l.m43748b();
                        if (this.f35088r == null) {
                            this.f35086p.mo45150h(false);
                            C11907h.m43609d(str, "Failed to instantiate http client");
                            throw new IllegalStateException("Failed to init: failed to instantiate http client");
                        }
                    }
                    C11907h.m43607b(f35068w, "Starting init()");
                    this.f35090t = true;
                    C11956j jVar = this.f35072b;
                    if (jVar != null) {
                        jVar.mo32015c();
                    }
                    this.f35087q = o;
                    String a = o.mo45190a();
                    this.f35074d = a + "TDM" + aVar.mo45125j();
                    this.f35091u.set(aVar.mo45121f());
                    new Thread(new C11946a(jVar, aVar, o, f35070y.mo31967d())).start();
                } else {
                    this.f35086p.mo45150h(false);
                    throw new IllegalArgumentException("Failed to init: Invalid format for fingerprint server");
                }
            } catch (RuntimeException e) {
                this.f35086p.mo45150h(false);
                throw e;
            }
        } else {
            throw new IllegalArgumentException("Failed to init: Invalid Context");
        }
    }

    /* renamed from: E */
    public C11899f mo31935E(C11903g gVar, C11883c cVar) {
        C11941o0.m43833h().mo32001i();
        if (!this.f35086p.mo45148e()) {
            return m43853A(new C11899f.C11900a((String) null, C17589f.TMX_Internal_Error), cVar, new C11960n((String) null));
        }
        if (!this.f35086p.mo45153k()) {
            return m43853A(new C11899f.C11900a((String) null, C17589f.TMX_NotYet), cVar, new C11960n((String) null));
        }
        if ((this.f35091u.get() & 1048576) == 0 && !m43867m()) {
            this.f35086p.mo45144a();
            return m43853A(new C11899f.C11900a((String) null, C17589f.TMX_Blocked), cVar, new C11960n((String) null));
        } else if (m43854B()) {
            this.f35086p.mo45144a();
            return m43853A(new C11899f.C11900a((String) null, C17589f.TMX_In_Quiet_Period), cVar, new C11960n((String) null));
        } else if (cVar == null) {
            this.f35086p.mo45144a();
            return m43853A(new C11899f.C11900a((String) null, C17589f.TMX_EndNotifier_NotFound), (C11883c) null, new C11960n((String) null));
        } else {
            String d = C11921k0.m43732o(gVar.mo31953b()) ? C11921k0.m43721d(gVar.mo31953b()) : C11921k0.m43735r();
            if (C11921k0.m43739v(d)) {
                this.f35086p.mo45144a();
                C11907h.m43609d(f35068w, "Failed to start profiling: Invalid session id");
                return m43853A(new C11899f.C11900a((String) null, C17589f.TMX_Internal_Error), cVar, new C11960n((String) null));
            }
            C11907h.m43613h();
            String str = f35068w;
            C11907h.m43607b(str, "starting profile request using - 6.3-81 options " + this.f35091u.get() + " profileTimeout " + this.f35089s + "ms java.vm.version " + System.getProperty("java.vm.version"));
            C11960n nVar = new C11960n(d);
            this.f35088r.mo31943b();
            C11956j jVar = this.f35072b;
            if (jVar != null) {
                jVar.mo32014b(gVar.mo31954c());
            }
            this.f35075e = new Thread(new C11947b(d, gVar, cVar, nVar));
            this.f35075e.start();
            return nVar;
        }
    }

    /* renamed from: F */
    public void mo32005F(C11938n0 n0Var) {
        C11955i iVar = (C11955i) this.f35076f;
        if (iVar != null) {
            iVar.join((long) this.f35089s);
            if (iVar.getState() != Thread.State.TERMINATED) {
                C11907h.m43609d(f35068w, "ScanData hasn't completed before the timeout expired, aborting");
                iVar.interrupt();
                throw new epeppe(C17589f.TMX_ProfileTimeout_Error);
            } else if (((C11961o) iVar.f35121d).mo32021a()) {
                throw new InterruptedException();
            }
        }
        if (m43879z(n0Var)) {
            m43870p(n0Var.f35023c & 66995442503646718L, 66995442503646718L & n0Var.f35022b);
        }
        this.f35079i = n0Var.f35024d;
        C12016z.m44149d(n0Var.f35025e);
    }

    /* renamed from: j */
    public abstract void mo31938j(C17603t tVar);

    /* renamed from: q */
    public abstract void mo31939q(C17584a aVar);
}

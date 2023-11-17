package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C3941b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p143k6.C6818a;
import p182n6.C7256f;
import p182n6.C7264i;
import p182n6.C7266j;
import p182n6.C7278o0;

/* renamed from: com.google.android.gms.common.internal.b */
public abstract class C3958b {

    /* renamed from: D */
    public static final String[] f12646D = {"service_esmobile", "service_googleme"};

    /* renamed from: E */
    private static final Feature[] f12647E = new Feature[0];
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f12648A;

    /* renamed from: B */
    private volatile zzk f12649B;

    /* renamed from: C */
    protected AtomicInteger f12650C;

    /* renamed from: a */
    private int f12651a;

    /* renamed from: b */
    private long f12652b;

    /* renamed from: c */
    private long f12653c;

    /* renamed from: d */
    private int f12654d;

    /* renamed from: e */
    private long f12655e;

    /* renamed from: f */
    private volatile String f12656f;

    /* renamed from: g */
    C3988z f12657g;

    /* renamed from: h */
    private final Context f12658h;

    /* renamed from: i */
    private final Looper f12659i;

    /* renamed from: j */
    private final C3965d f12660j;

    /* renamed from: k */
    private final C3941b f12661k;

    /* renamed from: l */
    final Handler f12662l;

    /* renamed from: m */
    private final Object f12663m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final Object f12664n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C7256f f12665o;

    /* renamed from: p */
    protected C3961c f12666p;

    /* renamed from: q */
    private IInterface f12667q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final ArrayList f12668r;

    /* renamed from: s */
    private C3979q f12669s;

    /* renamed from: t */
    private int f12670t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final C3959a f12671u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final C3960b f12672v;

    /* renamed from: w */
    private final int f12673w;

    /* renamed from: x */
    private final String f12674x;

    /* renamed from: y */
    private volatile String f12675y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public ConnectionResult f12676z;

    /* renamed from: com.google.android.gms.common.internal.b$a */
    public interface C3959a {
        /* renamed from: k */
        void mo12256k(Bundle bundle);

        /* renamed from: x */
        void mo12257x(int i);
    }

    /* renamed from: com.google.android.gms.common.internal.b$b */
    public interface C3960b {
        /* renamed from: y */
        void mo12258y(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.b$c */
    public interface C3961c {
        /* renamed from: a */
        void mo12147a(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.b$d */
    protected class C3962d implements C3961c {
        public C3962d() {
        }

        /* renamed from: a */
        public final void mo12147a(ConnectionResult connectionResult) {
            if (connectionResult.mo11855f0()) {
                C3958b bVar = C3958b.this;
                bVar.mo12246n((C3966e) null, bVar.mo12222H());
            } else if (C3958b.this.f12672v != null) {
                C3958b.this.f12672v.mo12258y(connectionResult);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.b$e */
    public interface C3963e {
        /* renamed from: a */
        void mo12125a();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C3958b(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.C3958b.C3959a r13, com.google.android.gms.common.internal.C3958b.C3960b r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.d r3 = com.google.android.gms.common.internal.C3965d.m15083a(r10)
            com.google.android.gms.common.b r4 = com.google.android.gms.common.C3941b.m14941h()
            p182n6.C7264i.m27902k(r13)
            p182n6.C7264i.m27902k(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C3958b.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.b$a, com.google.android.gms.common.internal.b$b, java.lang.String):void");
    }

    /* renamed from: h0 */
    static /* bridge */ /* synthetic */ void m15017h0(C3958b bVar, zzk zzk) {
        RootTelemetryConfiguration rootTelemetryConfiguration;
        bVar.f12649B = zzk;
        if (bVar.mo7051X()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzk.f12739g;
            C7266j b = C7266j.m27912b();
            if (connectionTelemetryConfiguration == null) {
                rootTelemetryConfiguration = null;
            } else {
                rootTelemetryConfiguration = connectionTelemetryConfiguration.mo12197q0();
            }
            b.mo21639c(rootTelemetryConfiguration);
        }
    }

    /* renamed from: i0 */
    static /* bridge */ /* synthetic */ void m15018i0(C3958b bVar, int i) {
        int i2;
        int i3;
        synchronized (bVar.f12663m) {
            i2 = bVar.f12670t;
        }
        if (i2 == 3) {
            bVar.f12648A = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = bVar.f12662l;
        handler.sendMessage(handler.obtainMessage(i3, bVar.f12650C.get(), 16));
    }

    /* renamed from: l0 */
    static /* bridge */ /* synthetic */ boolean m15020l0(C3958b bVar, int i, int i2, IInterface iInterface) {
        synchronized (bVar.f12663m) {
            if (bVar.f12670t != i) {
                return false;
            }
            bVar.m15022n0(i2, iInterface);
            return true;
        }
    }

    /* renamed from: m0 */
    static /* bridge */ /* synthetic */ boolean m15021m0(C3958b bVar) {
        if (bVar.f12648A || TextUtils.isEmpty(bVar.mo7049J()) || TextUtils.isEmpty(bVar.mo12221G())) {
            return false;
        }
        try {
            Class.forName(bVar.mo7049J());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public final void m15022n0(int i, IInterface iInterface) {
        boolean z;
        boolean z2;
        C3988z zVar;
        C3988z zVar2;
        boolean z3 = false;
        if (i != 4) {
            z = false;
        } else {
            z = true;
        }
        if (iInterface == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z == z2) {
            z3 = true;
        }
        C7264i.m27892a(z3);
        synchronized (this.f12663m) {
            this.f12670t = i;
            this.f12667q = iInterface;
            if (i == 1) {
                C3979q qVar = this.f12669s;
                if (qVar != null) {
                    C3965d dVar = this.f12660j;
                    String b = this.f12657g.mo12309b();
                    C7264i.m27902k(b);
                    dVar.mo12262d(b, this.f12657g.mo12308a(), 4225, qVar, mo12238c0(), this.f12657g.mo12310c());
                    this.f12669s = null;
                }
            } else if (i == 2 || i == 3) {
                C3979q qVar2 = this.f12669s;
                if (!(qVar2 == null || (zVar2 = this.f12657g) == null)) {
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + zVar2.mo12309b() + " on " + zVar2.mo12308a());
                    C3965d dVar2 = this.f12660j;
                    String b2 = this.f12657g.mo12309b();
                    C7264i.m27902k(b2);
                    dVar2.mo12262d(b2, this.f12657g.mo12308a(), 4225, qVar2, mo12238c0(), this.f12657g.mo12310c());
                    this.f12650C.incrementAndGet();
                }
                C3979q qVar3 = new C3979q(this, this.f12650C.get());
                this.f12669s = qVar3;
                if (this.f12670t != 3 || mo12221G() == null) {
                    zVar = new C3988z(mo12224L(), mo7050K(), false, 4225, mo12226N());
                } else {
                    zVar = new C3988z(mo12219D().getPackageName(), mo12221G(), true, 4225, false);
                }
                this.f12657g = zVar;
                if (zVar.mo12310c()) {
                    if (mo7053q() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f12657g.mo12309b())));
                    }
                }
                C3965d dVar3 = this.f12660j;
                String b3 = this.f12657g.mo12309b();
                C7264i.m27902k(b3);
                String a = this.f12657g.mo12308a();
                if (!dVar3.mo12263e(new C7278o0(b3, a, 4225, this.f12657g.mo12310c()), qVar3, mo12238c0(), mo12217B())) {
                    Log.w("GmsClient", "unable to connect to service: " + this.f12657g.mo12309b() + " on " + this.f12657g.mo12308a());
                    mo12245j0(16, (Bundle) null, this.f12650C.get());
                }
            } else if (i == 4) {
                C7264i.m27902k(iInterface);
                mo12228P(iInterface);
            }
        }
    }

    /* renamed from: A */
    public Feature[] mo12216A() {
        return f12647E;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public Executor mo12217B() {
        return null;
    }

    /* renamed from: C */
    public Bundle mo12218C() {
        return null;
    }

    /* renamed from: D */
    public final Context mo12219D() {
        return this.f12658h;
    }

    /* renamed from: E */
    public int mo12220E() {
        return this.f12673w;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public Bundle mo7048F() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public String mo12221G() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public Set mo12222H() {
        return Collections.emptySet();
    }

    /* renamed from: I */
    public final IInterface mo12223I() {
        IInterface iInterface;
        synchronized (this.f12663m) {
            if (this.f12670t != 5) {
                mo12253w();
                iInterface = this.f12667q;
                C7264i.m27903l(iInterface, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return iInterface;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public abstract String mo7049J();

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public abstract String mo7050K();

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public String mo12224L() {
        return "com.google.android.gms";
    }

    /* renamed from: M */
    public ConnectionTelemetryConfiguration mo12225M() {
        zzk zzk = this.f12649B;
        if (zzk == null) {
            return null;
        }
        return zzk.f12739g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public boolean mo12226N() {
        return mo7053q() >= 211700000;
    }

    /* renamed from: O */
    public boolean mo12227O() {
        return this.f12649B != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public void mo12228P(IInterface iInterface) {
        this.f12653c = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo12229Q(ConnectionResult connectionResult) {
        this.f12654d = connectionResult.mo11858v();
        this.f12655e = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public void mo12230R(int i) {
        this.f12651a = i;
        this.f12652b = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo12231S(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f12662l;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C3980r(this, i, iBinder, bundle)));
    }

    /* renamed from: T */
    public boolean mo12232T() {
        return false;
    }

    /* renamed from: U */
    public void mo12233U(String str) {
        this.f12675y = str;
    }

    /* renamed from: V */
    public void mo12234V(int i) {
        Handler handler = this.f12662l;
        handler.sendMessage(handler.obtainMessage(6, this.f12650C.get(), i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public void mo12235W(C3961c cVar, int i, PendingIntent pendingIntent) {
        C7264i.m27903l(cVar, "Connection progress callbacks cannot be null.");
        this.f12666p = cVar;
        Handler handler = this.f12662l;
        handler.sendMessage(handler.obtainMessage(3, this.f12650C.get(), i, pendingIntent));
    }

    /* renamed from: X */
    public boolean mo7051X() {
        return false;
    }

    /* renamed from: b */
    public void mo12236b() {
        this.f12650C.incrementAndGet();
        synchronized (this.f12668r) {
            int size = this.f12668r.size();
            for (int i = 0; i < size; i++) {
                ((C3977o) this.f12668r.get(i)).mo12280d();
            }
            this.f12668r.clear();
        }
        synchronized (this.f12664n) {
            this.f12665o = null;
        }
        m15022n0(1, (IInterface) null);
    }

    /* renamed from: c */
    public boolean mo12237c() {
        boolean z;
        synchronized (this.f12663m) {
            if (this.f12670t == 4) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public final String mo12238c0() {
        String str = this.f12674x;
        return str == null ? this.f12658h.getClass().getName() : str;
    }

    /* renamed from: d */
    public boolean mo12239d() {
        return false;
    }

    /* renamed from: e */
    public void mo12240e(String str) {
        this.f12656f = str;
        mo12236b();
    }

    /* renamed from: f */
    public boolean mo12241f() {
        boolean z;
        synchronized (this.f12663m) {
            int i = this.f12670t;
            z = true;
            if (i != 2) {
                if (i != 3) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* renamed from: g */
    public String mo12242g() {
        C3988z zVar;
        if (mo12237c() && (zVar = this.f12657g) != null) {
            return zVar.mo12308a();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* renamed from: h */
    public void mo12243h(C3961c cVar) {
        C7264i.m27903l(cVar, "Connection progress callbacks cannot be null.");
        this.f12666p = cVar;
        m15022n0(2, (IInterface) null);
    }

    /* renamed from: i */
    public boolean mo12244i() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public final void mo12245j0(int i, Bundle bundle, int i2) {
        Handler handler = this.f12662l;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C3981s(this, i, (Bundle) null)));
    }

    /* renamed from: k */
    public boolean mo7052k() {
        return false;
    }

    /* renamed from: n */
    public void mo12246n(C3966e eVar, Set set) {
        Set set2 = set;
        Bundle F = mo7048F();
        int i = this.f12673w;
        String str = this.f12675y;
        int i2 = C3941b.f12554a;
        Scope[] scopeArr = GetServiceRequest.f12614r;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f12615s;
        GetServiceRequest getServiceRequest = r3;
        GetServiceRequest getServiceRequest2 = new GetServiceRequest(6, i, i2, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, featureArr, featureArr, true, 0, false, str);
        GetServiceRequest getServiceRequest3 = getServiceRequest;
        getServiceRequest3.f12619g = this.f12658h.getPackageName();
        getServiceRequest3.f12622j = F;
        if (set2 != null) {
            getServiceRequest3.f12621i = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (mo7052k()) {
            Account z = mo12255z();
            if (z == null) {
                z = new Account("<<default account>>", "com.google");
            }
            getServiceRequest3.f12623k = z;
            if (eVar != null) {
                getServiceRequest3.f12620h = eVar.asBinder();
            }
        } else if (mo12232T()) {
            getServiceRequest3.f12623k = mo12255z();
        }
        getServiceRequest3.f12624l = f12647E;
        getServiceRequest3.f12625m = mo12216A();
        if (mo7051X()) {
            getServiceRequest3.f12628p = true;
        }
        try {
            synchronized (this.f12664n) {
                C7256f fVar = this.f12665o;
                if (fVar != null) {
                    fVar.mo12274C0(new C3978p(this, this.f12650C.get()), getServiceRequest3);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            mo12234V(3);
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            mo12231S(8, (IBinder) null, (Bundle) null, this.f12650C.get());
        }
    }

    /* renamed from: o */
    public void mo12247o(C3963e eVar) {
        eVar.mo12125a();
    }

    /* renamed from: p */
    public void mo12248p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        C7256f fVar;
        synchronized (this.f12663m) {
            i = this.f12670t;
            iInterface = this.f12667q;
        }
        synchronized (this.f12664n) {
            fVar = this.f12665o;
        }
        printWriter.append(str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append(mo7049J()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (fVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(fVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f12653c > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.f12653c;
            String format = simpleDateFormat.format(new Date(j));
            append.println(j + " " + format);
        }
        if (this.f12652b > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i2 = this.f12651a;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 != 3) {
                printWriter.append(String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.f12652b;
            String format2 = simpleDateFormat.format(new Date(j2));
            append2.println(j2 + " " + format2);
        }
        if (this.f12655e > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(C6818a.m26551a(this.f12654d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.f12655e;
            String format3 = simpleDateFormat.format(new Date(j3));
            append3.println(j3 + " " + format3);
        }
    }

    /* renamed from: q */
    public abstract int mo7053q();

    /* renamed from: r */
    public final Feature[] mo12249r() {
        zzk zzk = this.f12649B;
        if (zzk == null) {
            return null;
        }
        return zzk.f12737e;
    }

    /* renamed from: t */
    public String mo12250t() {
        return this.f12656f;
    }

    /* renamed from: u */
    public Intent mo12251u() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* renamed from: v */
    public void mo12252v() {
        int j = this.f12661k.mo11873j(this.f12658h, mo7053q());
        if (j != 0) {
            m15022n0(1, (IInterface) null);
            mo12235W(new C3962d(), j, (PendingIntent) null);
            return;
        }
        mo12243h(new C3962d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo12253w() {
        if (!mo12237c()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract IInterface mo7054x(IBinder iBinder);

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public boolean mo12254y() {
        return false;
    }

    /* renamed from: z */
    public Account mo12255z() {
        return null;
    }

    protected C3958b(Context context, Looper looper, C3965d dVar, C3941b bVar, int i, C3959a aVar, C3960b bVar2, String str) {
        this.f12656f = null;
        this.f12663m = new Object();
        this.f12664n = new Object();
        this.f12668r = new ArrayList();
        this.f12670t = 1;
        this.f12676z = null;
        this.f12648A = false;
        this.f12649B = null;
        this.f12650C = new AtomicInteger(0);
        C7264i.m27903l(context, "Context must not be null");
        this.f12658h = context;
        C7264i.m27903l(looper, "Looper must not be null");
        this.f12659i = looper;
        C7264i.m27903l(dVar, "Supervisor must not be null");
        this.f12660j = dVar;
        C7264i.m27903l(bVar, "API availability must not be null");
        this.f12661k = bVar;
        this.f12662l = new C3976n(this, looper);
        this.f12673w = i;
        this.f12671u = aVar;
        this.f12672v = bVar2;
        this.f12674x = str;
    }
}

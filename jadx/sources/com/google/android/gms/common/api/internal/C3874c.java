package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p013v4.media.session.C0125b;
import android.util.Log;
import androidx.collection.ArraySet;
import com.google.android.gms.common.C3846a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3857b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3877d;
import com.google.android.gms.common.internal.C3965d;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p066e7.C6047k;
import p156l6.C6931b;
import p156l6.C6932b0;
import p156l6.C6934c0;
import p156l6.C6952l;
import p156l6.C6968t;
import p182n6.C7266j;
import p182n6.C7270l;
import p182n6.C7272m;
import p182n6.C7293y;
import p260t6.C8408j;
import p337z7.C9227g;
import p337z7.Task;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.common.api.internal.c */
public class C3874c implements Handler.Callback {

    /* renamed from: r */
    public static final Status f12350r = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final Status f12351s = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final Object f12352t = new Object();

    /* renamed from: u */
    private static C3874c f12353u;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public long f12354a = 5000;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f12355b = 120000;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f12356c = 10000;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f12357d = false;

    /* renamed from: e */
    private TelemetryData f12358e;

    /* renamed from: f */
    private C7272m f12359f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Context f12360g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C3846a f12361h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C7293y f12362i;

    /* renamed from: j */
    private final AtomicInteger f12363j = new AtomicInteger(1);

    /* renamed from: k */
    private final AtomicInteger f12364k = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Map f12365l = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C3911n f12366m = null;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final Set f12367n = new ArraySet();

    /* renamed from: o */
    private final Set f12368o = new ArraySet();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final Handler f12369p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public volatile boolean f12370q = true;

    private C3874c(Context context, Looper looper, C3846a aVar) {
        this.f12360g = context;
        C6047k kVar = new C6047k(looper, this);
        this.f12369p = kVar;
        this.f12361h = aVar;
        this.f12362i = new C7293y(aVar);
        if (C8408j.m31548a(context)) {
            this.f12370q = false;
        }
        kVar.sendMessage(kVar.obtainMessage(6));
    }

    /* renamed from: a */
    public static void m14644a() {
        synchronized (f12352t) {
            C3874c cVar = f12353u;
            if (cVar != null) {
                cVar.f12364k.incrementAndGet();
                Handler handler = cVar.f12369p;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static Status m14646i(C6931b bVar, ConnectionResult connectionResult) {
        String b = bVar.mo21077b();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(b);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(connectionResult, sb.toString());
    }

    /* renamed from: j */
    private final C3918p0 m14647j(C3857b bVar) {
        C6931b r = bVar.mo11942r();
        C3918p0 p0Var = (C3918p0) this.f12365l.get(r);
        if (p0Var == null) {
            p0Var = new C3918p0(this, bVar);
            this.f12365l.put(r, p0Var);
        }
        if (p0Var.mo12136L()) {
            this.f12368o.add(r);
        }
        p0Var.mo12128D();
        return p0Var;
    }

    /* renamed from: k */
    private final C7272m m14648k() {
        if (this.f12359f == null) {
            this.f12359f = C7270l.m27918a(this.f12360g);
        }
        return this.f12359f;
    }

    /* renamed from: l */
    private final void m14649l() {
        TelemetryData telemetryData = this.f12358e;
        if (telemetryData != null) {
            if (telemetryData.mo12211v() > 0 || mo12032g()) {
                m14648k().mo21643b(telemetryData);
            }
            this.f12358e = null;
        }
    }

    /* renamed from: m */
    private final void m14650m(C9227g gVar, int i, C3857b bVar) {
        C3930u0 a;
        if (i != 0 && (a = C3930u0.m14925a(this, i, bVar.mo11942r())) != null) {
            Task a2 = gVar.mo24883a();
            Handler handler = this.f12369p;
            handler.getClass();
            a2.mo24857b(new C6968t(handler), a);
        }
    }

    /* renamed from: y */
    public static C3874c m14660y(Context context) {
        C3874c cVar;
        synchronized (f12352t) {
            if (f12353u == null) {
                f12353u = new C3874c(context.getApplicationContext(), C3965d.m15084b().getLooper(), C3846a.m14468q());
            }
            cVar = f12353u;
        }
        return cVar;
    }

    /* renamed from: A */
    public final Task mo12022A(C3857b bVar, C3885f fVar, C3896i iVar, Runnable runnable) {
        C9227g gVar = new C9227g();
        m14650m(gVar, fVar.mo12060e(), bVar);
        C3881d1 d1Var = new C3881d1(new C6934c0(fVar, iVar, runnable), gVar);
        Handler handler = this.f12369p;
        handler.sendMessage(handler.obtainMessage(8, new C6932b0(d1Var, this.f12364k.get(), bVar)));
        return gVar.mo24883a();
    }

    /* renamed from: B */
    public final Task mo12023B(C3857b bVar, C3877d.C3878a aVar, int i) {
        C9227g gVar = new C9227g();
        m14650m(gVar, i, bVar);
        C3887f1 f1Var = new C3887f1(aVar, gVar);
        Handler handler = this.f12369p;
        handler.sendMessage(handler.obtainMessage(13, new C6932b0(f1Var, this.f12364k.get(), bVar)));
        return gVar.mo24883a();
    }

    /* renamed from: G */
    public final void mo12024G(C3857b bVar, int i, C3871b bVar2) {
        C3876c1 c1Var = new C3876c1(i, bVar2);
        Handler handler = this.f12369p;
        handler.sendMessage(handler.obtainMessage(4, new C6932b0(c1Var, this.f12364k.get(), bVar)));
    }

    /* renamed from: H */
    public final void mo12025H(C3857b bVar, int i, C3892h hVar, C9227g gVar, C6952l lVar) {
        m14650m(gVar, hVar.mo12075d(), bVar);
        C3884e1 e1Var = new C3884e1(i, hVar, gVar, lVar);
        Handler handler = this.f12369p;
        handler.sendMessage(handler.obtainMessage(4, new C6932b0(e1Var, this.f12364k.get(), bVar)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final void mo12026I(MethodInvocation methodInvocation, int i, long j, int i2) {
        Handler handler = this.f12369p;
        handler.sendMessage(handler.obtainMessage(18, new C3932v0(methodInvocation, i, j, i2)));
    }

    /* renamed from: J */
    public final void mo12027J(ConnectionResult connectionResult, int i) {
        if (!mo12033h(connectionResult, i)) {
            Handler handler = this.f12369p;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }

    /* renamed from: b */
    public final void mo12028b() {
        Handler handler = this.f12369p;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: c */
    public final void mo12029c(C3857b bVar) {
        Handler handler = this.f12369p;
        handler.sendMessage(handler.obtainMessage(7, bVar));
    }

    /* renamed from: d */
    public final void mo12030d(C3911n nVar) {
        synchronized (f12352t) {
            if (this.f12366m != nVar) {
                this.f12366m = nVar;
                this.f12367n.clear();
            }
            this.f12367n.addAll(nVar.mo12122t());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo12031e(C3911n nVar) {
        synchronized (f12352t) {
            if (this.f12366m == nVar) {
                this.f12366m = null;
                this.f12367n.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo12032g() {
        if (this.f12357d) {
            return false;
        }
        RootTelemetryConfiguration a = C7266j.m27912b().mo21638a();
        if (a != null && !a.mo12210x()) {
            return false;
        }
        int a2 = this.f12362i.mo21671a(this.f12360g, 203400000);
        if (a2 == -1 || a2 == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo12033h(ConnectionResult connectionResult, int i) {
        return this.f12361h.mo11868A(this.f12360g, connectionResult, i);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        long j = 300000;
        C3918p0 p0Var = null;
        switch (i) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f12356c = j;
                this.f12369p.removeMessages(12);
                for (C6931b obtainMessage : this.f12365l.keySet()) {
                    Handler handler = this.f12369p;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f12356c);
                }
                break;
            case 2:
                C0125b.m366a(message.obj);
                throw null;
            case 3:
                for (C3918p0 p0Var2 : this.f12365l.values()) {
                    p0Var2.mo12127C();
                    p0Var2.mo12128D();
                }
                break;
            case 4:
            case 8:
            case 13:
                C6932b0 b0Var = (C6932b0) message.obj;
                C3918p0 p0Var3 = (C3918p0) this.f12365l.get(b0Var.f20809c.mo11942r());
                if (p0Var3 == null) {
                    p0Var3 = m14647j(b0Var.f20809c);
                }
                if (p0Var3.mo12136L() && this.f12364k.get() != b0Var.f20808b) {
                    b0Var.f20807a.mo12037a(f12350r);
                    p0Var3.mo12134J();
                    break;
                } else {
                    p0Var3.mo12129E(b0Var.f20807a);
                    break;
                }
                break;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it = this.f12365l.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        C3918p0 p0Var4 = (C3918p0) it.next();
                        if (p0Var4.mo12138p() == i2) {
                            p0Var = p0Var4;
                        }
                    }
                }
                if (p0Var != null) {
                    if (connectionResult.mo11858v() != 13) {
                        p0Var.m14862d(m14646i(p0Var.f12499d, connectionResult));
                        break;
                    } else {
                        String g = this.f12361h.mo11871g(connectionResult.mo11858v());
                        String w = connectionResult.mo11859w();
                        StringBuilder sb = new StringBuilder(String.valueOf(g).length() + 69 + String.valueOf(w).length());
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(g);
                        sb.append(": ");
                        sb.append(w);
                        p0Var.m14862d(new Status(17, sb.toString()));
                        break;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i2);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.f12360g.getApplicationContext() instanceof Application) {
                    C3867a.m14589c((Application) this.f12360g.getApplicationContext());
                    C3867a.m14588b().mo11991a(new C3903k0(this));
                    if (!C3867a.m14588b().mo11993e(true)) {
                        this.f12356c = 300000;
                        break;
                    }
                }
                break;
            case 7:
                m14647j((C3857b) message.obj);
                break;
            case 9:
                if (this.f12365l.containsKey(message.obj)) {
                    ((C3918p0) this.f12365l.get(message.obj)).mo12133I();
                    break;
                }
                break;
            case 10:
                for (C6931b remove : this.f12368o) {
                    C3918p0 p0Var5 = (C3918p0) this.f12365l.remove(remove);
                    if (p0Var5 != null) {
                        p0Var5.mo12134J();
                    }
                }
                this.f12368o.clear();
                break;
            case 11:
                if (this.f12365l.containsKey(message.obj)) {
                    ((C3918p0) this.f12365l.get(message.obj)).mo12135K();
                    break;
                }
                break;
            case 12:
                if (this.f12365l.containsKey(message.obj)) {
                    ((C3918p0) this.f12365l.get(message.obj)).mo12137a();
                    break;
                }
                break;
            case 14:
                C0125b.m366a(message.obj);
                throw null;
            case 15:
                C3921q0 q0Var = (C3921q0) message.obj;
                if (this.f12365l.containsKey(q0Var.f12513a)) {
                    C3918p0.m14858A((C3918p0) this.f12365l.get(q0Var.f12513a), q0Var);
                    break;
                }
                break;
            case 16:
                C3921q0 q0Var2 = (C3921q0) message.obj;
                if (this.f12365l.containsKey(q0Var2.f12513a)) {
                    C3918p0.m14859B((C3918p0) this.f12365l.get(q0Var2.f12513a), q0Var2);
                    break;
                }
                break;
            case 17:
                m14649l();
                break;
            case 18:
                C3932v0 v0Var = (C3932v0) message.obj;
                if (v0Var.f12542c != 0) {
                    TelemetryData telemetryData = this.f12358e;
                    if (telemetryData != null) {
                        List w2 = telemetryData.mo12212w();
                        if (telemetryData.mo12211v() != v0Var.f12541b || (w2 != null && w2.size() >= v0Var.f12543d)) {
                            this.f12369p.removeMessages(17);
                            m14649l();
                        } else {
                            this.f12358e.mo12214x(v0Var.f12540a);
                        }
                    }
                    if (this.f12358e == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(v0Var.f12540a);
                        this.f12358e = new TelemetryData(v0Var.f12541b, arrayList);
                        Handler handler2 = this.f12369p;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), v0Var.f12542c);
                        break;
                    }
                } else {
                    m14648k().mo21643b(new TelemetryData(v0Var.f12541b, Arrays.asList(new MethodInvocation[]{v0Var.f12540a})));
                    break;
                }
                break;
            case 19:
                this.f12357d = false;
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    /* renamed from: n */
    public final int mo12035n() {
        return this.f12363j.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final C3918p0 mo12036x(C6931b bVar) {
        return (C3918p0) this.f12365l.get(bVar);
    }
}

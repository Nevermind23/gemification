package com.google.firebase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.p016os.C0937z;
import androidx.lifecycle.C1612n;
import com.google.android.gms.common.api.internal.C3867a;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p056da.C5857a;
import p182n6.C7258g;
import p182n6.C7264i;
import p260t6.C8401c;
import p260t6.C8413o;
import p260t6.C8414p;
import p264ta.C8430b;
import p264ta.C8431c;
import p289v9.C8716c;
import p302w9.C8891f;
import p326y8.C9104c;
import p326y8.C9112g;
import p326y8.C9123o;
import p326y8.C9134u;
import p327y9.C9142b;
import p338z8.C9265l;

/* renamed from: com.google.firebase.e */
public class C5270e {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Object f16878k = new Object();

    /* renamed from: l */
    static final Map f16879l = new ArrayMap();

    /* renamed from: a */
    private final Context f16880a;

    /* renamed from: b */
    private final String f16881b;

    /* renamed from: c */
    private final C5293k f16882c;

    /* renamed from: d */
    private final C9123o f16883d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AtomicBoolean f16884e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicBoolean f16885f = new AtomicBoolean();

    /* renamed from: g */
    private final C9134u f16886g;

    /* renamed from: h */
    private final C9142b f16887h;

    /* renamed from: i */
    private final List f16888i = new CopyOnWriteArrayList();

    /* renamed from: j */
    private final List f16889j = new CopyOnWriteArrayList();

    /* renamed from: com.google.firebase.e$a */
    public interface C5271a {
        /* renamed from: a */
        void mo17450a(boolean z);
    }

    /* renamed from: com.google.firebase.e$b */
    private static class C5272b implements C3867a.C3868a {

        /* renamed from: a */
        private static AtomicReference f16890a = new AtomicReference();

        private C5272b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static void m20824c(Context context) {
            if (C8413o.m31563a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f16890a.get() == null) {
                    C5272b bVar = new C5272b();
                    if (C1612n.m5659a(f16890a, (Object) null, bVar)) {
                        C3867a.m14589c(application);
                        C3867a.m14588b().mo11991a(bVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo12004a(boolean z) {
            synchronized (C5270e.f16878k) {
                Iterator it = new ArrayList(C5270e.f16879l.values()).iterator();
                while (it.hasNext()) {
                    C5270e eVar = (C5270e) it.next();
                    if (eVar.f16884e.get()) {
                        eVar.m20813y(z);
                    }
                }
            }
        }
    }

    /* renamed from: com.google.firebase.e$c */
    private static class C5273c extends BroadcastReceiver {

        /* renamed from: b */
        private static AtomicReference f16891b = new AtomicReference();

        /* renamed from: a */
        private final Context f16892a;

        public C5273c(Context context) {
            this.f16892a = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m20827b(Context context) {
            if (f16891b.get() == null) {
                C5273c cVar = new C5273c(context);
                if (C1612n.m5659a(f16891b, (Object) null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void mo17488c() {
            this.f16892a.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (C5270e.f16878k) {
                for (C5270e d : C5270e.f16879l.values()) {
                    d.m20806p();
                }
            }
            mo17488c();
        }
    }

    protected C5270e(Context context, String str, C5293k kVar) {
        this.f16880a = (Context) C7264i.m27902k(context);
        this.f16881b = C7264i.m27898g(str);
        this.f16882c = (C5293k) C7264i.m27902k(kVar);
        C5298l b = FirebaseInitProvider.m21578b();
        C8431c.m31640b("Firebase");
        C8431c.m31640b("ComponentDiscovery");
        List b2 = C9112g.m33614c(context, ComponentDiscoveryService.class).mo24677b();
        C8431c.m31639a();
        C8431c.m31640b("Runtime");
        C9123o.C9125b g = C9123o.m33628m(C9265l.INSTANCE).mo24685d(b2).mo24684c(new FirebaseCommonRegistrar()).mo24684c(new ExecutorsRegistrar()).mo24683b(C9104c.m33569s(context, Context.class, new Class[0])).mo24683b(C9104c.m33569s(this, C5270e.class, new Class[0])).mo24683b(C9104c.m33569s(kVar, C5293k.class, new Class[0])).mo24687g(new C8430b());
        if (C0937z.m3386a(context) && FirebaseInitProvider.m21579c()) {
            g.mo24683b(C9104c.m33569s(b, C5298l.class, new Class[0]));
        }
        C9123o e = g.mo24686e();
        this.f16883d = e;
        C8431c.m31639a();
        this.f16886g = new C9134u(new C5243c(this, context));
        this.f16887h = e.mo24674g(C8891f.class);
        mo17478g(new C5266d(this));
        C8431c.m31639a();
    }

    /* renamed from: h */
    private void m20803h() {
        C7264i.m27906o(!this.f16885f.get(), "FirebaseApp was deleted");
    }

    /* renamed from: k */
    public static List m20804k(Context context) {
        ArrayList arrayList;
        synchronized (f16878k) {
            arrayList = new ArrayList(f16879l.values());
        }
        return arrayList;
    }

    /* renamed from: l */
    public static C5270e m20805l() {
        C5270e eVar;
        synchronized (f16878k) {
            eVar = (C5270e) f16879l.get("[DEFAULT]");
            if (eVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C8414p.m31575a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m20806p() {
        if (!C0937z.m3386a(this.f16880a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + mo17482m());
            C5273c.m20827b(this.f16880a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + mo17482m());
        this.f16883d.mo24682p(mo17487u());
        ((C8891f) this.f16887h.get()).mo24319l();
    }

    /* renamed from: q */
    public static C5270e m20807q(Context context) {
        synchronized (f16878k) {
            if (f16879l.containsKey("[DEFAULT]")) {
                C5270e l = m20805l();
                return l;
            }
            C5293k a = C5293k.m20902a(context);
            if (a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            C5270e r = m20808r(context, a);
            return r;
        }
    }

    /* renamed from: r */
    public static C5270e m20808r(Context context, C5293k kVar) {
        return m20809s(context, kVar, "[DEFAULT]");
    }

    /* renamed from: s */
    public static C5270e m20809s(Context context, C5293k kVar, String str) {
        boolean z;
        C5270e eVar;
        C5272b.m20824c(context);
        String x = m20812x(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f16878k) {
            Map map = f16879l;
            if (!map.containsKey(x)) {
                z = true;
            } else {
                z = false;
            }
            C7264i.m27906o(z, "FirebaseApp name " + x + " already exists!");
            C7264i.m27903l(context, "Application context cannot be null.");
            eVar = new C5270e(context, x, kVar);
            map.put(x, eVar);
        }
        eVar.m20806p();
        return eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ C5857a m20810v(Context context) {
        return new C5857a(context, mo17484o(), (C8716c) this.f16883d.mo24668a(C8716c.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m20811w(boolean z) {
        if (!z) {
            ((C8891f) this.f16887h.get()).mo24319l();
        }
    }

    /* renamed from: x */
    private static String m20812x(String str) {
        return str.trim();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m20813y(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (C5271a a : this.f16888i) {
            a.mo17450a(z);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5270e)) {
            return false;
        }
        return this.f16881b.equals(((C5270e) obj).mo17482m());
    }

    /* renamed from: g */
    public void mo17478g(C5271a aVar) {
        m20803h();
        if (this.f16884e.get() && C3867a.m14588b().mo11992d()) {
            aVar.mo17450a(true);
        }
        this.f16888i.add(aVar);
    }

    public int hashCode() {
        return this.f16881b.hashCode();
    }

    /* renamed from: i */
    public Object mo17480i(Class cls) {
        m20803h();
        return this.f16883d.mo24668a(cls);
    }

    /* renamed from: j */
    public Context mo17481j() {
        m20803h();
        return this.f16880a;
    }

    /* renamed from: m */
    public String mo17482m() {
        m20803h();
        return this.f16881b;
    }

    /* renamed from: n */
    public C5293k mo17483n() {
        m20803h();
        return this.f16882c;
    }

    /* renamed from: o */
    public String mo17484o() {
        return C8401c.m31536c(mo17482m().getBytes(Charset.defaultCharset())) + "+" + C8401c.m31536c(mo17483n().mo17517c().getBytes(Charset.defaultCharset()));
    }

    /* renamed from: t */
    public boolean mo17485t() {
        m20803h();
        return ((C5857a) this.f16886g.get()).mo19070b();
    }

    public String toString() {
        return C7258g.m27882c(this).mo21632a("name", this.f16881b).mo21632a("options", this.f16882c).toString();
    }

    /* renamed from: u */
    public boolean mo17487u() {
        return "[DEFAULT]".equals(mo17482m());
    }
}

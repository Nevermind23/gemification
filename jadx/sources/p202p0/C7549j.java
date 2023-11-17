package p202p0;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C1557a;
import androidx.lifecycle.C1580f0;
import androidx.lifecycle.C1583g0;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1599j0;
import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1631s;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.savedstate.C1846a;
import he1.C41217g;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p163m0.C7052d;
import p306x0.C8931c;
import p306x0.C8933d;
import ue1.C43064a;

/* renamed from: p0.j */
public final class C7549j implements C1619q, C1638u0, C1591i, C8933d {

    /* renamed from: q */
    public static final C7550a f22017q = new C7550a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f22018d;

    /* renamed from: e */
    private C7589q f22019e;

    /* renamed from: f */
    private final Bundle f22020f;

    /* renamed from: g */
    private C1593j.C1598b f22021g;

    /* renamed from: h */
    private final C7521a0 f22022h;

    /* renamed from: i */
    private final String f22023i;

    /* renamed from: j */
    private final Bundle f22024j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C1631s f22025k;

    /* renamed from: l */
    private final C8931c f22026l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f22027m;

    /* renamed from: n */
    private final C41217g f22028n;

    /* renamed from: o */
    private final C41217g f22029o;

    /* renamed from: p */
    private C1593j.C1598b f22030p;

    /* renamed from: p0.j$a */
    public static final class C7550a {
        private C7550a() {
        }

        public /* synthetic */ C7550a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C7549j m28694b(C7550a aVar, Context context, C7589q qVar, Bundle bundle, C1593j.C1598b bVar, C7521a0 a0Var, String str, Bundle bundle2, int i, Object obj) {
            Bundle bundle3;
            C1593j.C1598b bVar2;
            C7521a0 a0Var2;
            String str2;
            Bundle bundle4;
            if ((i & 4) != 0) {
                bundle3 = null;
            } else {
                bundle3 = bundle;
            }
            if ((i & 8) != 0) {
                bVar2 = C1593j.C1598b.CREATED;
            } else {
                bVar2 = bVar;
            }
            if ((i & 16) != 0) {
                a0Var2 = null;
            } else {
                a0Var2 = a0Var;
            }
            if ((i & 32) != 0) {
                String uuid = UUID.randomUUID().toString();
                C41536l.m120488h(uuid, "randomUUID().toString()");
                str2 = uuid;
            } else {
                str2 = str;
            }
            if ((i & 64) != 0) {
                bundle4 = null;
            } else {
                bundle4 = bundle2;
            }
            return aVar.mo22106a(context, qVar, bundle3, bVar2, a0Var2, str2, bundle4);
        }

        /* renamed from: a */
        public final C7549j mo22106a(Context context, C7589q qVar, Bundle bundle, C1593j.C1598b bVar, C7521a0 a0Var, String str, Bundle bundle2) {
            C41536l.m120489i(qVar, "destination");
            C41536l.m120489i(bVar, "hostLifecycleState");
            String str2 = str;
            C41536l.m120489i(str2, "id");
            return new C7549j(context, qVar, bundle, bVar, a0Var, str2, bundle2, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: p0.j$b */
    private static final class C7551b extends C1557a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7551b(C8933d dVar) {
            super(dVar, (Bundle) null);
            C41536l.m120489i(dVar, "owner");
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public C1613n0 mo4842e(String str, Class cls, C1580f0 f0Var) {
            C41536l.m120489i(str, "key");
            C41536l.m120489i(cls, "modelClass");
            C41536l.m120489i(f0Var, "handle");
            return new C7552c(f0Var);
        }
    }

    /* renamed from: p0.j$c */
    private static final class C7552c extends C1613n0 {

        /* renamed from: d */
        private final C1580f0 f22031d;

        public C7552c(C1580f0 f0Var) {
            C41536l.m120489i(f0Var, "handle");
            this.f22031d = f0Var;
        }

        /* renamed from: dw */
        public final C1580f0 mo22107dw() {
            return this.f22031d;
        }
    }

    /* renamed from: p0.j$d */
    static final class C7553d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C7549j f22032d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7553d(C7549j jVar) {
            super(0);
            this.f22032d = jVar;
        }

        /* renamed from: b */
        public final C1599j0 invoke() {
            Context a = this.f22032d.f22018d;
            Application application = null;
            Context applicationContext = a != null ? a.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
            }
            C7549j jVar = this.f22032d;
            return new C1599j0(application, jVar, jVar.mo22095d());
        }
    }

    /* renamed from: p0.j$e */
    static final class C7554e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C7549j f22033d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7554e(C7549j jVar) {
            super(0);
            this.f22033d = jVar;
        }

        /* renamed from: b */
        public final C1580f0 invoke() {
            boolean z;
            if (this.f22033d.f22027m) {
                if (this.f22033d.f22025k.mo4907b() != C1593j.C1598b.DESTROYED) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return ((C7552c) new C1620q0((C1638u0) this.f22033d, (C1620q0.C1624b) new C7551b(this.f22033d)).mo4936a(C7552c.class)).mo22107dw();
                }
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
    }

    public /* synthetic */ C7549j(Context context, C7589q qVar, Bundle bundle, C1593j.C1598b bVar, C7521a0 a0Var, String str, Bundle bundle2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, qVar, bundle, bVar, a0Var, str, bundle2);
    }

    /* renamed from: e */
    private final C1599j0 m28684e() {
        return (C1599j0) this.f22028n.getValue();
    }

    /* renamed from: d */
    public final Bundle mo22095d() {
        return this.f22020f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L_0x0083
            boolean r1 = r7 instanceof p202p0.C7549j
            if (r1 != 0) goto L_0x0009
            goto L_0x0083
        L_0x0009:
            java.lang.String r1 = r6.f22023i
            p0.j r7 = (p202p0.C7549j) r7
            java.lang.String r2 = r7.f22023i
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r1, r2)
            if (r1 == 0) goto L_0x0083
            p0.q r1 = r6.f22019e
            p0.q r2 = r7.f22019e
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r1, r2)
            if (r1 == 0) goto L_0x0083
            androidx.lifecycle.s r1 = r6.f22025k
            androidx.lifecycle.s r2 = r7.f22025k
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r1, r2)
            if (r1 == 0) goto L_0x0083
            androidx.savedstate.a r1 = r6.getSavedStateRegistry()
            androidx.savedstate.a r2 = r7.getSavedStateRegistry()
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r1, r2)
            if (r1 == 0) goto L_0x0083
            android.os.Bundle r1 = r6.f22020f
            android.os.Bundle r2 = r7.f22020f
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r1, r2)
            r2 = 1
            if (r1 != 0) goto L_0x0082
            android.os.Bundle r1 = r6.f22020f
            if (r1 == 0) goto L_0x007f
            java.util.Set r1 = r1.keySet()
            if (r1 == 0) goto L_0x007f
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x0054
        L_0x0052:
            r7 = r2
            goto L_0x007b
        L_0x0054:
            java.util.Iterator r1 = r1.iterator()
        L_0x0058:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0052
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            android.os.Bundle r4 = r6.f22020f
            java.lang.Object r4 = r4.get(r3)
            android.os.Bundle r5 = r7.f22020f
            if (r5 == 0) goto L_0x0073
            java.lang.Object r3 = r5.get(r3)
            goto L_0x0074
        L_0x0073:
            r3 = 0
        L_0x0074:
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r4, r3)
            if (r3 != 0) goto L_0x0058
            r7 = r0
        L_0x007b:
            if (r7 != r2) goto L_0x007f
            r7 = r2
            goto L_0x0080
        L_0x007f:
            r7 = r0
        L_0x0080:
            if (r7 == 0) goto L_0x0083
        L_0x0082:
            r0 = r2
        L_0x0083:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p202p0.C7549j.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C7589q mo22097f() {
        return this.f22019e;
    }

    /* renamed from: g */
    public final String mo22098g() {
        return this.f22023i;
    }

    public C7047a getDefaultViewModelCreationExtras() {
        Context context;
        Application application = null;
        C7052d dVar = new C7052d((C7047a) null, 1, (DefaultConstructorMarker) null);
        Context context2 = this.f22018d;
        if (context2 != null) {
            context = context2.getApplicationContext();
        } else {
            context = null;
        }
        if (context instanceof Application) {
            application = (Application) context;
        }
        if (application != null) {
            dVar.mo21274c(C1620q0.C1621a.f4641g, application);
        }
        dVar.mo21274c(C1583g0.f4589a, this);
        dVar.mo21274c(C1583g0.f4590b, this);
        Bundle bundle = this.f22020f;
        if (bundle != null) {
            dVar.mo21274c(C1583g0.f4591c, bundle);
        }
        return dVar;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return m28684e();
    }

    public C1593j getLifecycle() {
        return this.f22025k;
    }

    public C1846a getSavedStateRegistry() {
        return this.f22026l.mo24348b();
    }

    public C1636t0 getViewModelStore() {
        boolean z;
        if (this.f22027m) {
            if (this.f22025k.mo4907b() != C1593j.C1598b.DESTROYED) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C7521a0 a0Var = this.f22022h;
                if (a0Var != null) {
                    return a0Var.mo22019p5(this.f22023i);
                }
                throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
    }

    /* renamed from: h */
    public final C1593j.C1598b mo22099h() {
        return this.f22030p;
    }

    public int hashCode() {
        Set<String> keySet;
        int i;
        int hashCode = (this.f22023i.hashCode() * 31) + this.f22019e.hashCode();
        Bundle bundle = this.f22020f;
        if (!(bundle == null || (keySet = bundle.keySet()) == null)) {
            for (String str : keySet) {
                int i2 = hashCode * 31;
                Object obj = this.f22020f.get(str);
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                hashCode = i2 + i;
            }
        }
        return (((hashCode * 31) + this.f22025k.hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    /* renamed from: i */
    public final void mo22101i(C1593j.C1594a aVar) {
        C41536l.m120489i(aVar, "event");
        C1593j.C1598b c = aVar.mo4910c();
        C41536l.m120488h(c, "event.targetState");
        this.f22021g = c;
        mo22105m();
    }

    /* renamed from: j */
    public final void mo22102j(Bundle bundle) {
        C41536l.m120489i(bundle, "outBundle");
        this.f22026l.mo24351e(bundle);
    }

    /* renamed from: k */
    public final void mo22103k(C7589q qVar) {
        C41536l.m120489i(qVar, "<set-?>");
        this.f22019e = qVar;
    }

    /* renamed from: l */
    public final void mo22104l(C1593j.C1598b bVar) {
        C41536l.m120489i(bVar, "maxState");
        this.f22030p = bVar;
        mo22105m();
    }

    /* renamed from: m */
    public final void mo22105m() {
        if (!this.f22027m) {
            this.f22026l.mo24349c();
            this.f22027m = true;
            if (this.f22022h != null) {
                C1583g0.m5614c(this);
            }
            this.f22026l.mo24350d(this.f22024j);
        }
        if (this.f22021g.ordinal() < this.f22030p.ordinal()) {
            this.f22025k.mo4943o(this.f22021g);
        } else {
            this.f22025k.mo4943o(this.f22030p);
        }
    }

    private C7549j(Context context, C7589q qVar, Bundle bundle, C1593j.C1598b bVar, C7521a0 a0Var, String str, Bundle bundle2) {
        this.f22018d = context;
        this.f22019e = qVar;
        this.f22020f = bundle;
        this.f22021g = bVar;
        this.f22022h = a0Var;
        this.f22023i = str;
        this.f22024j = bundle2;
        this.f22025k = new C1631s(this);
        this.f22026l = C8931c.f24933d.mo24352a(this);
        this.f22028n = C41219i.m119470b(new C7553d(this));
        this.f22029o = C41219i.m119470b(new C7554e(this));
        this.f22030p = C1593j.C1598b.INITIALIZED;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C7549j(C7549j jVar, Bundle bundle) {
        this(jVar.f22018d, jVar.f22019e, bundle, jVar.f22021g, jVar.f22022h, jVar.f22023i, jVar.f22024j);
        C41536l.m120489i(jVar, "entry");
        this.f22021g = jVar.f22021g;
        mo22104l(jVar.f22030p);
    }
}

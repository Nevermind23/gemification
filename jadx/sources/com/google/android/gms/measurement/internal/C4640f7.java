package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import com.salesforce.marketingcloud.sfmcsdk.components.behaviors.Behavior;
import java.util.List;
import java.util.Map;
import p182n6.C7264i;
import p248s7.C8270x;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.measurement.internal.f7 */
public final class C4640f7 extends C4801u3 {

    /* renamed from: c */
    private volatile C4848y6 f14422c;

    /* renamed from: d */
    private volatile C4848y6 f14423d;

    /* renamed from: e */
    protected C4848y6 f14424e;

    /* renamed from: f */
    private final Map f14425f = new ConcurrentHashMap();

    /* renamed from: g */
    private Activity f14426g;

    /* renamed from: h */
    private volatile boolean f14427h;

    /* renamed from: i */
    private volatile C4848y6 f14428i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C4848y6 f14429j;

    /* renamed from: k */
    private boolean f14430k;

    /* renamed from: l */
    private final Object f14431l = new Object();

    public C4640f7(C4791t4 t4Var) {
        super(t4Var);
    }

    /* renamed from: F */
    private final C4848y6 m17665F(Activity activity) {
        C7264i.m27902k(activity);
        C4848y6 y6Var = (C4848y6) this.f14425f.get(activity);
        if (y6Var == null) {
            C4848y6 y6Var2 = new C4848y6((String) null, mo14370t(activity.getClass(), "Activity"), this.f14613a.mo14856N().mo14831t0());
            this.f14425f.put(activity, y6Var2);
            y6Var = y6Var2;
        }
        if (this.f14428i != null) {
            return this.f14428i;
        }
        return y6Var;
    }

    /* renamed from: G */
    private final void m17666G(Activity activity, C4848y6 y6Var, boolean z) {
        C4848y6 y6Var2;
        C4848y6 y6Var3;
        String str;
        C4848y6 y6Var4 = y6Var;
        if (this.f14422c == null) {
            y6Var2 = this.f14423d;
        } else {
            y6Var2 = this.f14422c;
        }
        C4848y6 y6Var5 = y6Var2;
        if (y6Var4.f15043b == null) {
            if (activity != null) {
                str = mo14370t(activity.getClass(), "Activity");
            } else {
                str = null;
            }
            y6Var3 = new C4848y6(y6Var4.f15042a, str, y6Var4.f15044c, y6Var4.f15046e, y6Var4.f15047f);
        } else {
            y6Var3 = y6Var4;
        }
        this.f14423d = this.f14422c;
        this.f14422c = y6Var3;
        this.f14613a.mo14552f().mo14776z(new C4581a7(this, y6Var3, y6Var5, this.f14613a.mo14548a().mo23596c(), z));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m17667o(C4848y6 y6Var, C4848y6 y6Var2, long j, boolean z, Bundle bundle) {
        boolean z2;
        Bundle bundle2;
        String str;
        long j2;
        long j3;
        C4848y6 y6Var3 = y6Var;
        C4848y6 y6Var4 = y6Var2;
        long j4 = j;
        Bundle bundle3 = bundle;
        mo14554h();
        boolean z3 = false;
        if (y6Var4 == null || y6Var4.f15044c != y6Var3.f15044c || !C8270x.m31114a(y6Var4.f15043b, y6Var3.f15043b) || !C8270x.m31114a(y6Var4.f15042a, y6Var3.f15042a)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && this.f14424e != null) {
            z3 = true;
        }
        if (z2) {
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle4 = bundle2;
            C4785s9.m18233y(y6Var3, bundle4, true);
            if (y6Var4 != null) {
                String str2 = y6Var4.f15042a;
                if (str2 != null) {
                    bundle4.putString("_pn", str2);
                }
                String str3 = y6Var4.f15043b;
                if (str3 != null) {
                    bundle4.putString("_pc", str3);
                }
                bundle4.putLong("_pi", y6Var4.f15044c);
            }
            if (z3) {
                C4795t8 t8Var = this.f14613a.mo14855M().f14977e;
                long j5 = j4 - t8Var.f14926b;
                t8Var.f14926b = j4;
                if (j5 > 0) {
                    this.f14613a.mo14856N().mo14835w(bundle4, j5);
                }
            }
            if (!this.f14613a.mo14876z().mo14400D()) {
                bundle4.putLong("_mst", 1);
            }
            if (true != y6Var3.f15046e) {
                str = "auto";
            } else {
                str = "app";
            }
            String str4 = str;
            long a = this.f14613a.mo14548a().mo23594a();
            if (y6Var3.f15046e) {
                j3 = a;
                long j6 = y6Var3.f15047f;
                if (j6 != 0) {
                    j2 = j6;
                    this.f14613a.mo14851I().mo14911v(str4, "_vs", j2, bundle4);
                }
            } else {
                j3 = a;
            }
            j2 = j3;
            this.f14613a.mo14851I().mo14911v(str4, "_vs", j2, bundle4);
        }
        if (z3) {
            m17668p(this.f14424e, true, j4);
        }
        this.f14424e = y6Var3;
        if (y6Var3.f15046e) {
            this.f14429j = y6Var3;
        }
        this.f14613a.mo14854L().mo14391u(y6Var3);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m17668p(C4848y6 y6Var, boolean z, long j) {
        boolean z2;
        this.f14613a.mo14875y().mo14953n(this.f14613a.mo14548a().mo23596c());
        if (y6Var == null || !y6Var.f15045d) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.f14613a.mo14855M().f14977e.mo14920d(z2, z, j) && y6Var != null) {
            y6Var.f15045d = false;
        }
    }

    /* renamed from: w */
    static /* bridge */ /* synthetic */ void m17672w(C4640f7 f7Var, Bundle bundle, C4848y6 y6Var, C4848y6 y6Var2, long j) {
        bundle.remove(Behavior.ScreenEntry.KEY_NAME);
        bundle.remove("screen_class");
        f7Var.m17667o(y6Var, y6Var2, j, true, f7Var.f14613a.mo14856N().mo14838x0((String) null, "screen_view", bundle, (List) null, false));
    }

    /* renamed from: A */
    public final void mo14362A(Activity activity) {
        synchronized (this.f14431l) {
            this.f14430k = false;
            this.f14427h = true;
        }
        long c = this.f14613a.mo14548a().mo23596c();
        if (!this.f14613a.mo14876z().mo14400D()) {
            this.f14422c = null;
            this.f14613a.mo14552f().mo14776z(new C4605c7(this, c));
            return;
        }
        C4848y6 F = m17665F(activity);
        this.f14423d = this.f14422c;
        this.f14422c = null;
        this.f14613a.mo14552f().mo14776z(new C4617d7(this, F, c));
    }

    /* renamed from: B */
    public final void mo14363B(Activity activity) {
        synchronized (this.f14431l) {
            this.f14430k = true;
            if (activity != this.f14426g) {
                synchronized (this.f14431l) {
                    this.f14426g = activity;
                    this.f14427h = false;
                }
                if (this.f14613a.mo14876z().mo14400D()) {
                    this.f14428i = null;
                    this.f14613a.mo14552f().mo14776z(new C4629e7(this));
                }
            }
        }
        if (!this.f14613a.mo14876z().mo14400D()) {
            this.f14422c = this.f14428i;
            this.f14613a.mo14552f().mo14776z(new C4593b7(this));
            return;
        }
        m17666G(activity, m17665F(activity), false);
        C4832x1 y = this.f14613a.mo14875y();
        y.f14613a.mo14552f().mo14776z(new C4820w0(y, y.f14613a.mo14548a().mo23596c()));
    }

    /* renamed from: C */
    public final void mo14364C(Activity activity, Bundle bundle) {
        C4848y6 y6Var;
        if (this.f14613a.mo14876z().mo14400D() && bundle != null && (y6Var = (C4848y6) this.f14425f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", y6Var.f15044c);
            bundle2.putString("name", y6Var.f15042a);
            bundle2.putString("referrer_name", y6Var.f15043b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        if (r1 <= 100) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b4, code lost:
        if (r1 <= 100) goto L_0x00cf;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14365D(android.app.Activity r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.t4 r0 = r3.f14613a
            com.google.android.gms.measurement.internal.g r0 = r0.mo14876z()
            boolean r0 = r0.mo14400D()
            if (r0 != 0) goto L_0x001c
            com.google.android.gms.measurement.internal.t4 r4 = r3.f14613a
            com.google.android.gms.measurement.internal.p3 r4 = r4.mo14551d()
            com.google.android.gms.measurement.internal.n3 r4 = r4.mo14681x()
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.mo14615a(r5)
            return
        L_0x001c:
            com.google.android.gms.measurement.internal.y6 r0 = r3.f14422c
            if (r0 != 0) goto L_0x0030
            com.google.android.gms.measurement.internal.t4 r4 = r3.f14613a
            com.google.android.gms.measurement.internal.p3 r4 = r4.mo14551d()
            com.google.android.gms.measurement.internal.n3 r4 = r4.mo14681x()
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.mo14615a(r5)
            return
        L_0x0030:
            java.util.Map r1 = r3.f14425f
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L_0x0048
            com.google.android.gms.measurement.internal.t4 r4 = r3.f14613a
            com.google.android.gms.measurement.internal.p3 r4 = r4.mo14551d()
            com.google.android.gms.measurement.internal.n3 r4 = r4.mo14681x()
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.mo14615a(r5)
            return
        L_0x0048:
            if (r6 != 0) goto L_0x0054
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.mo14370t(r6, r1)
        L_0x0054:
            java.lang.String r1 = r0.f15043b
            boolean r1 = p248s7.C8270x.m31114a(r1, r6)
            java.lang.String r0 = r0.f15042a
            boolean r0 = p248s7.C8270x.m31114a(r0, r5)
            if (r1 == 0) goto L_0x0075
            if (r0 != 0) goto L_0x0065
            goto L_0x0075
        L_0x0065:
            com.google.android.gms.measurement.internal.t4 r4 = r3.f14613a
            com.google.android.gms.measurement.internal.p3 r4 = r4.mo14551d()
            com.google.android.gms.measurement.internal.n3 r4 = r4.mo14681x()
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.mo14615a(r5)
            return
        L_0x0075:
            r0 = 100
            if (r5 == 0) goto L_0x00a3
            int r1 = r5.length()
            if (r1 <= 0) goto L_0x008b
            int r1 = r5.length()
            com.google.android.gms.measurement.internal.t4 r2 = r3.f14613a
            r2.mo14876z()
            if (r1 > r0) goto L_0x008b
            goto L_0x00a3
        L_0x008b:
            com.google.android.gms.measurement.internal.t4 r4 = r3.f14613a
            com.google.android.gms.measurement.internal.p3 r4 = r4.mo14551d()
            com.google.android.gms.measurement.internal.n3 r4 = r4.mo14681x()
            int r5 = r5.length()
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.mo14616b(r6, r5)
            return
        L_0x00a3:
            if (r6 == 0) goto L_0x00cf
            int r1 = r6.length()
            if (r1 <= 0) goto L_0x00b7
            int r1 = r6.length()
            com.google.android.gms.measurement.internal.t4 r2 = r3.f14613a
            r2.mo14876z()
            if (r1 > r0) goto L_0x00b7
            goto L_0x00cf
        L_0x00b7:
            com.google.android.gms.measurement.internal.t4 r4 = r3.f14613a
            com.google.android.gms.measurement.internal.p3 r4 = r4.mo14551d()
            com.google.android.gms.measurement.internal.n3 r4 = r4.mo14681x()
            int r5 = r6.length()
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.mo14616b(r6, r5)
            return
        L_0x00cf:
            com.google.android.gms.measurement.internal.t4 r0 = r3.f14613a
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14679v()
            if (r5 != 0) goto L_0x00de
            java.lang.String r1 = "null"
            goto L_0x00df
        L_0x00de:
            r1 = r5
        L_0x00df:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.mo14617c(r2, r1, r6)
            com.google.android.gms.measurement.internal.y6 r0 = new com.google.android.gms.measurement.internal.y6
            com.google.android.gms.measurement.internal.t4 r1 = r3.f14613a
            com.google.android.gms.measurement.internal.s9 r1 = r1.mo14856N()
            long r1 = r1.mo14831t0()
            r0.<init>(r5, r6, r1)
            java.util.Map r5 = r3.f14425f
            r5.put(r4, r0)
            r5 = 1
            r3.m17666G(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4640f7.mo14365D(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r2 > 100) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r4 > 100) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c1, code lost:
        r0 = r12.f14613a.mo14551d().mo14679v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cb, code lost:
        if (r3 != null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cd, code lost:
        r1 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d0, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d1, code lost:
        if (r4 != null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d3, code lost:
        r2 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d6, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d7, code lost:
        r0.mo14617c("Logging screen view with name, class", r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00de, code lost:
        if (r12.f14422c != null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e0, code lost:
        r0 = r12.f14423d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e3, code lost:
        r0 = r12.f14422c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e5, code lost:
        r2 = new com.google.android.gms.measurement.internal.C4848y6(r3, r4, r12.f14613a.mo14856N().mo14831t0(), true, r14);
        r12.f14422c = r2;
        r12.f14423d = r0;
        r12.f14428i = r2;
        r12.f14613a.mo14552f().mo14776z(new com.google.android.gms.measurement.internal.C4859z6(r12, r13, r2, r0, r12.f14613a.mo14548a().mo23596c()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011a, code lost:
        return;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14366E(android.os.Bundle r13, long r14) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f14431l
            monitor-enter(r0)
            boolean r1 = r12.f14430k     // Catch:{ all -> 0x011b }
            if (r1 != 0) goto L_0x0018
            com.google.android.gms.measurement.internal.t4 r13 = r12.f14613a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.p3 r13 = r13.mo14551d()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.n3 r13 = r13.mo14681x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Cannot log screen view event when the app is in the background."
            r13.mo14615a(r14)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x0018:
            java.lang.String r1 = "screen_name"
            java.lang.String r3 = r13.getString(r1)     // Catch:{ all -> 0x011b }
            r1 = 100
            if (r3 == 0) goto L_0x004c
            int r2 = r3.length()     // Catch:{ all -> 0x011b }
            if (r2 <= 0) goto L_0x0033
            int r2 = r3.length()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.t4 r4 = r12.f14613a     // Catch:{ all -> 0x011b }
            r4.mo14876z()     // Catch:{ all -> 0x011b }
            if (r2 <= r1) goto L_0x004c
        L_0x0033:
            com.google.android.gms.measurement.internal.t4 r13 = r12.f14613a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.p3 r13 = r13.mo14551d()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.n3 r13 = r13.mo14681x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Invalid screen name length for screen view. Length"
            int r15 = r3.length()     // Catch:{ all -> 0x011b }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x011b }
            r13.mo14616b(r14, r15)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x004c:
            java.lang.String r2 = "screen_class"
            java.lang.String r2 = r13.getString(r2)     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x007e
            int r4 = r2.length()     // Catch:{ all -> 0x011b }
            if (r4 <= 0) goto L_0x0065
            int r4 = r2.length()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.t4 r5 = r12.f14613a     // Catch:{ all -> 0x011b }
            r5.mo14876z()     // Catch:{ all -> 0x011b }
            if (r4 <= r1) goto L_0x007e
        L_0x0065:
            com.google.android.gms.measurement.internal.t4 r13 = r12.f14613a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.p3 r13 = r13.mo14551d()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.n3 r13 = r13.mo14681x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Invalid screen class length for screen view. Length"
            int r15 = r2.length()     // Catch:{ all -> 0x011b }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x011b }
            r13.mo14616b(r14, r15)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x007e:
            if (r2 != 0) goto L_0x0093
            android.app.Activity r1 = r12.f14426g     // Catch:{ all -> 0x011b }
            if (r1 == 0) goto L_0x008f
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x011b }
            java.lang.String r2 = "Activity"
            java.lang.String r1 = r12.mo14370t(r1, r2)     // Catch:{ all -> 0x011b }
            goto L_0x0091
        L_0x008f:
            java.lang.String r1 = "Activity"
        L_0x0091:
            r4 = r1
            goto L_0x0094
        L_0x0093:
            r4 = r2
        L_0x0094:
            com.google.android.gms.measurement.internal.y6 r1 = r12.f14422c     // Catch:{ all -> 0x011b }
            boolean r2 = r12.f14427h     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x00c0
            if (r1 == 0) goto L_0x00c0
            r2 = 0
            r12.f14427h = r2     // Catch:{ all -> 0x011b }
            java.lang.String r2 = r1.f15043b     // Catch:{ all -> 0x011b }
            boolean r2 = p248s7.C8270x.m31114a(r2, r4)     // Catch:{ all -> 0x011b }
            java.lang.String r1 = r1.f15042a     // Catch:{ all -> 0x011b }
            boolean r1 = p248s7.C8270x.m31114a(r1, r3)     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x00c0
            if (r1 == 0) goto L_0x00c0
            com.google.android.gms.measurement.internal.t4 r13 = r12.f14613a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.p3 r13 = r13.mo14551d()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.n3 r13 = r13.mo14681x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Ignoring call to log screen view event with duplicate parameters."
            r13.mo14615a(r14)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x00c0:
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.t4 r0 = r12.f14613a
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14679v()
            if (r3 != 0) goto L_0x00d0
            java.lang.String r1 = "null"
            goto L_0x00d1
        L_0x00d0:
            r1 = r3
        L_0x00d1:
            if (r4 != 0) goto L_0x00d6
            java.lang.String r2 = "null"
            goto L_0x00d7
        L_0x00d6:
            r2 = r4
        L_0x00d7:
            java.lang.String r5 = "Logging screen view with name, class"
            r0.mo14617c(r5, r1, r2)
            com.google.android.gms.measurement.internal.y6 r0 = r12.f14422c
            if (r0 != 0) goto L_0x00e3
            com.google.android.gms.measurement.internal.y6 r0 = r12.f14423d
            goto L_0x00e5
        L_0x00e3:
            com.google.android.gms.measurement.internal.y6 r0 = r12.f14422c
        L_0x00e5:
            com.google.android.gms.measurement.internal.y6 r1 = new com.google.android.gms.measurement.internal.y6
            com.google.android.gms.measurement.internal.t4 r2 = r12.f14613a
            com.google.android.gms.measurement.internal.s9 r2 = r2.mo14856N()
            long r5 = r2.mo14831t0()
            r7 = 1
            r2 = r1
            r8 = r14
            r2.<init>(r3, r4, r5, r7, r8)
            r12.f14422c = r1
            r12.f14423d = r0
            r12.f14428i = r1
            com.google.android.gms.measurement.internal.t4 r14 = r12.f14613a
            t6.f r14 = r14.mo14548a()
            long r10 = r14.mo23596c()
            com.google.android.gms.measurement.internal.t4 r14 = r12.f14613a
            com.google.android.gms.measurement.internal.r4 r14 = r14.mo14552f()
            com.google.android.gms.measurement.internal.z6 r15 = new com.google.android.gms.measurement.internal.z6
            r5 = r15
            r6 = r12
            r7 = r13
            r8 = r1
            r9 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            r14.mo14776z(r15)
            return
        L_0x011b:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4640f7.mo14366E(android.os.Bundle, long):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo14367n() {
        return false;
    }

    /* renamed from: r */
    public final C4848y6 mo14368r() {
        return this.f14422c;
    }

    /* renamed from: s */
    public final C4848y6 mo14369s(boolean z) {
        mo14922i();
        mo14554h();
        if (!z) {
            return this.f14424e;
        }
        C4848y6 y6Var = this.f14424e;
        if (y6Var != null) {
            return y6Var;
        }
        return this.f14429j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final String mo14370t(Class cls, String str) {
        String str2;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        if (length > 0) {
            str2 = split[length - 1];
        } else {
            str2 = "";
        }
        int length2 = str2.length();
        this.f14613a.mo14876z();
        if (length2 <= 100) {
            return str2;
        }
        this.f14613a.mo14876z();
        return str2.substring(0, 100);
    }

    /* renamed from: y */
    public final void mo14371y(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (this.f14613a.mo14876z().mo14400D() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f14425f.put(activity, new C4848y6(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    /* renamed from: z */
    public final void mo14372z(Activity activity) {
        synchronized (this.f14431l) {
            if (activity == this.f14426g) {
                this.f14426g = null;
            }
        }
        if (this.f14613a.mo14876z().mo14400D()) {
            this.f14425f.remove(activity);
        }
    }
}

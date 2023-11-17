package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.C3943d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.C4224i1;
import com.medallia.digital.mobilesdk.C10749b8;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p182n6.C7264i;
import p247s6.C8242b;
import p248s7.C8252f;

/* renamed from: com.google.android.gms.measurement.internal.f8 */
public final class C4641f8 extends C4801u3 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4630e8 f14432c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C8252f f14433d;

    /* renamed from: e */
    private volatile Boolean f14434e;

    /* renamed from: f */
    private final C4720n f14435f;

    /* renamed from: g */
    private final C4828w8 f14436g;

    /* renamed from: h */
    private final List f14437h = new ArrayList();

    /* renamed from: i */
    private final C4720n f14438i;

    protected C4641f8(C4791t4 t4Var) {
        super(t4Var);
        this.f14436g = new C4828w8(t4Var.mo14548a());
        this.f14432c = new C4630e8(this);
        this.f14435f = new C4750p7(this, t4Var);
        this.f14438i = new C4772r7(this, t4Var);
    }

    /* renamed from: C */
    private final zzq m17685C(boolean z) {
        Pair a;
        this.f14613a.mo14549b();
        C4658h3 B = this.f14613a.mo14845B();
        String str = null;
        if (z) {
            C4746p3 d = this.f14613a.mo14551d();
            if (!(d.f14613a.mo14849F().f14260d == null || (a = d.f14613a.mo14849F().f14260d.mo14307a()) == null || a == C4614d4.f14258y)) {
                str = String.valueOf(a.second) + ":" + ((String) a.first);
            }
        }
        return B.mo14444q(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final void m17686D() {
        mo14554h();
        this.f14613a.mo14551d().mo14679v().mo14616b("Processing queued up service tasks", Integer.valueOf(this.f14437h.size()));
        for (Runnable run : this.f14437h) {
            try {
                run.run();
            } catch (RuntimeException e) {
                this.f14613a.mo14551d().mo14675r().mo14616b("Task exception while flushing queue", e);
            }
        }
        this.f14437h.clear();
        this.f14438i.mo14611b();
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final void m17687E() {
        mo14554h();
        this.f14436g.mo14948b();
        C4720n nVar = this.f14435f;
        this.f14613a.mo14876z();
        nVar.mo14613d(((Long) C4636f3.f14345L.mo14346a((Object) null)).longValue());
    }

    /* renamed from: F */
    private final void m17688F(Runnable runnable) {
        mo14554h();
        if (mo14396z()) {
            runnable.run();
            return;
        }
        this.f14613a.mo14876z();
        if (((long) this.f14437h.size()) >= 1000) {
            this.f14613a.mo14551d().mo14675r().mo14615a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f14437h.add(runnable);
        this.f14438i.mo14613d(C10749b8.C10751b.f30743b);
        mo14377P();
    }

    /* renamed from: G */
    private final boolean m17689G() {
        this.f14613a.mo14549b();
        return true;
    }

    /* renamed from: M */
    static /* bridge */ /* synthetic */ void m17694M(C4641f8 f8Var, ComponentName componentName) {
        f8Var.mo14554h();
        if (f8Var.f14433d != null) {
            f8Var.f14433d = null;
            f8Var.f14613a.mo14551d().mo14679v().mo14616b("Disconnected from device MeasurementService", componentName);
            f8Var.mo14554h();
            f8Var.mo14377P();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final boolean mo14373A() {
        mo14554h();
        mo14922i();
        if (!mo14374B() || this.f14613a.mo14856N().mo14827q0() >= ((Integer) C4636f3.f14379j0.mo14346a((Object) null)).intValue()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012b  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14374B() {
        /*
            r7 = this;
            r7.mo14554h()
            r7.mo14922i()
            java.lang.Boolean r0 = r7.f14434e
            if (r0 != 0) goto L_0x014b
            r7.mo14554h()
            r7.mo14922i()
            com.google.android.gms.measurement.internal.t4 r0 = r7.f14613a
            com.google.android.gms.measurement.internal.d4 r0 = r0.mo14849F()
            r0.mo14554h()
            android.content.SharedPreferences r1 = r0.mo14330o()
            java.lang.String r2 = "use_service"
            boolean r1 = r1.contains(r2)
            r3 = 0
            if (r1 != 0) goto L_0x0028
            r0 = 0
            goto L_0x0034
        L_0x0028:
            android.content.SharedPreferences r0 = r0.mo14330o()
            boolean r0 = r0.getBoolean(r2, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0034:
            r1 = 1
            if (r0 == 0) goto L_0x003f
            boolean r4 = r0.booleanValue()
            if (r4 == 0) goto L_0x003f
            goto L_0x0145
        L_0x003f:
            com.google.android.gms.measurement.internal.t4 r4 = r7.f14613a
            r4.mo14549b()
            com.google.android.gms.measurement.internal.t4 r4 = r7.f14613a
            com.google.android.gms.measurement.internal.h3 r4 = r4.mo14845B()
            int r4 = r4.mo14442o()
            if (r4 != r1) goto L_0x0053
        L_0x0050:
            r3 = r1
            goto L_0x010d
        L_0x0053:
            com.google.android.gms.measurement.internal.t4 r4 = r7.f14613a
            com.google.android.gms.measurement.internal.p3 r4 = r4.mo14551d()
            com.google.android.gms.measurement.internal.n3 r4 = r4.mo14679v()
            java.lang.String r5 = "Checking service availability"
            r4.mo14615a(r5)
            com.google.android.gms.measurement.internal.t4 r4 = r7.f14613a
            com.google.android.gms.measurement.internal.s9 r4 = r4.mo14856N()
            r5 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r4 = r4.mo14829r0(r5)
            if (r4 == 0) goto L_0x00fc
            if (r4 == r1) goto L_0x00ec
            r5 = 2
            if (r4 == r5) goto L_0x00c6
            r0 = 3
            if (r4 == r0) goto L_0x00b5
            r0 = 9
            if (r4 == r0) goto L_0x00a5
            r0 = 18
            if (r4 == r0) goto L_0x0095
            com.google.android.gms.measurement.internal.t4 r0 = r7.f14613a
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14680w()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "Unexpected service status"
            r0.mo14616b(r4, r1)
            goto L_0x00c4
        L_0x0095:
            com.google.android.gms.measurement.internal.t4 r0 = r7.f14613a
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14680w()
            java.lang.String r3 = "Service updating"
            r0.mo14615a(r3)
            goto L_0x0050
        L_0x00a5:
            com.google.android.gms.measurement.internal.t4 r0 = r7.f14613a
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14680w()
            java.lang.String r1 = "Service invalid"
            r0.mo14615a(r1)
            goto L_0x00c4
        L_0x00b5:
            com.google.android.gms.measurement.internal.t4 r0 = r7.f14613a
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14680w()
            java.lang.String r1 = "Service disabled"
            r0.mo14615a(r1)
        L_0x00c4:
            r1 = r3
            goto L_0x010d
        L_0x00c6:
            com.google.android.gms.measurement.internal.t4 r4 = r7.f14613a
            com.google.android.gms.measurement.internal.p3 r4 = r4.mo14551d()
            com.google.android.gms.measurement.internal.n3 r4 = r4.mo14674q()
            java.lang.String r5 = "Service container out of date"
            r4.mo14615a(r5)
            com.google.android.gms.measurement.internal.t4 r4 = r7.f14613a
            com.google.android.gms.measurement.internal.s9 r4 = r4.mo14856N()
            int r4 = r4.mo14827q0()
            r5 = 17443(0x4423, float:2.4443E-41)
            if (r4 >= r5) goto L_0x00e4
            goto L_0x010d
        L_0x00e4:
            if (r0 != 0) goto L_0x00e7
            goto L_0x00e8
        L_0x00e7:
            r1 = r3
        L_0x00e8:
            r6 = r3
            r3 = r1
            r1 = r6
            goto L_0x010d
        L_0x00ec:
            com.google.android.gms.measurement.internal.t4 r0 = r7.f14613a
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14679v()
            java.lang.String r4 = "Service missing"
            r0.mo14615a(r4)
            goto L_0x010d
        L_0x00fc:
            com.google.android.gms.measurement.internal.t4 r0 = r7.f14613a
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14679v()
            java.lang.String r3 = "Service available"
            r0.mo14615a(r3)
            goto L_0x0050
        L_0x010d:
            if (r3 != 0) goto L_0x012b
            com.google.android.gms.measurement.internal.t4 r0 = r7.f14613a
            com.google.android.gms.measurement.internal.g r0 = r0.mo14876z()
            boolean r0 = r0.mo14403G()
            if (r0 == 0) goto L_0x012b
            com.google.android.gms.measurement.internal.t4 r0 = r7.f14613a
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14675r()
            java.lang.String r1 = "No way to upload. Consider using the full version of Analytics"
            r0.mo14615a(r1)
            goto L_0x0144
        L_0x012b:
            if (r1 == 0) goto L_0x0144
            com.google.android.gms.measurement.internal.t4 r0 = r7.f14613a
            com.google.android.gms.measurement.internal.d4 r0 = r0.mo14849F()
            r0.mo14554h()
            android.content.SharedPreferences r0 = r0.mo14330o()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r2, r3)
            r0.apply()
        L_0x0144:
            r1 = r3
        L_0x0145:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r7.f14434e = r0
        L_0x014b:
            java.lang.Boolean r0 = r7.f14434e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4641f8.mo14374B():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final Boolean mo14375J() {
        return this.f14434e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final void mo14376O() {
        mo14554h();
        mo14922i();
        zzq C = m17685C(true);
        this.f14613a.mo14846C().mo14478r();
        m17688F(new C4717m7(this, C));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final void mo14377P() {
        mo14554h();
        mo14922i();
        if (!mo14396z()) {
            if (mo14374B()) {
                this.f14432c.mo14353c();
            } else if (!this.f14613a.mo14876z().mo14403G()) {
                this.f14613a.mo14549b();
                List<ResolveInfo> queryIntentServices = this.f14613a.mo14550c().getPackageManager().queryIntentServices(new Intent().setClassName(this.f14613a.mo14550c(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                    this.f14613a.mo14551d().mo14675r().mo14615a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                Context c = this.f14613a.mo14550c();
                this.f14613a.mo14549b();
                intent.setComponent(new ComponentName(c, "com.google.android.gms.measurement.AppMeasurementService"));
                this.f14432c.mo14352b(intent);
            }
        }
    }

    /* renamed from: Q */
    public final void mo14378Q() {
        mo14554h();
        mo14922i();
        this.f14432c.mo14354d();
        try {
            C8242b.m31044b().mo23426c(this.f14613a.mo14550c(), this.f14432c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f14433d = null;
    }

    /* renamed from: R */
    public final void mo14379R(C4224i1 i1Var) {
        mo14554h();
        mo14922i();
        m17688F(new C4706l7(this, m17685C(false), i1Var));
    }

    /* renamed from: S */
    public final void mo14380S(AtomicReference atomicReference) {
        mo14554h();
        mo14922i();
        m17688F(new C4695k7(this, atomicReference, m17685C(false)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public final void mo14381T(C4224i1 i1Var, String str, String str2) {
        mo14554h();
        mo14922i();
        m17688F(new C4838x7(this, str, str2, m17685C(false), i1Var));
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public final void mo14382U(AtomicReference atomicReference, String str, String str2, String str3) {
        mo14554h();
        mo14922i();
        m17688F(new C4827w7(this, atomicReference, (String) null, str2, str3, m17685C(false)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final void mo14383V(C4224i1 i1Var, String str, String str2, boolean z) {
        mo14554h();
        mo14922i();
        m17688F(new C4651g7(this, str, str2, m17685C(false), z, i1Var));
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public final void mo14384W(AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        mo14554h();
        mo14922i();
        m17688F(new C4849y7(this, atomicReference, (String) null, str2, str3, m17685C(false), z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo14367n() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo14385o(zzaw zzaw, String str) {
        C7264i.m27902k(zzaw);
        mo14554h();
        mo14922i();
        m17689G();
        m17688F(new C4805u7(this, true, m17685C(true), this.f14613a.mo14846C().mo14482v(zzaw), zzaw, str));
    }

    /* renamed from: p */
    public final void mo14386p(C4224i1 i1Var, zzaw zzaw, String str) {
        mo14554h();
        mo14922i();
        if (this.f14613a.mo14856N().mo14829r0(C3943d.f12557a) != 0) {
            this.f14613a.mo14551d().mo14680w().mo14615a("Not bundling data. Service unavailable or out of date");
            this.f14613a.mo14856N().mo14800H(i1Var, new byte[0]);
            return;
        }
        m17688F(new C4761q7(this, zzaw, str, i1Var));
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo14387q() {
        mo14554h();
        mo14922i();
        zzq C = m17685C(false);
        m17689G();
        this.f14613a.mo14846C().mo14477q();
        m17688F(new C4684j7(this, C));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo14388r(C8252f fVar, AbstractSafeParcelable abstractSafeParcelable, zzq zzq) {
        int i;
        mo14554h();
        mo14922i();
        m17689G();
        this.f14613a.mo14876z();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List p = this.f14613a.mo14846C().mo14476p(100);
            if (p != null) {
                arrayList.addAll(p);
                i = p.size();
            } else {
                i = 0;
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i4);
                if (abstractSafeParcelable2 instanceof zzaw) {
                    try {
                        fVar.mo14429o0((zzaw) abstractSafeParcelable2, zzq);
                    } catch (RemoteException e) {
                        this.f14613a.mo14551d().mo14675r().mo14616b("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzlj) {
                    try {
                        fVar.mo14423F((zzlj) abstractSafeParcelable2, zzq);
                    } catch (RemoteException e2) {
                        this.f14613a.mo14551d().mo14675r().mo14616b("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzac) {
                    try {
                        fVar.mo14432q2((zzac) abstractSafeParcelable2, zzq);
                    } catch (RemoteException e3) {
                        this.f14613a.mo14551d().mo14675r().mo14616b("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    this.f14613a.mo14551d().mo14675r().mo14615a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo14389s(zzac zzac) {
        C7264i.m27902k(zzac);
        mo14554h();
        mo14922i();
        this.f14613a.mo14549b();
        m17688F(new C4816v7(this, true, m17685C(true), this.f14613a.mo14846C().mo14481u(zzac), new zzac(zzac), zzac));
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo14390t(boolean z) {
        mo14554h();
        mo14922i();
        if (z) {
            m17689G();
            this.f14613a.mo14846C().mo14477q();
        }
        if (mo14373A()) {
            m17688F(new C4794t7(this, m17685C(false)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo14391u(C4848y6 y6Var) {
        mo14554h();
        mo14922i();
        m17688F(new C4728n7(this, y6Var));
    }

    /* renamed from: v */
    public final void mo14392v(Bundle bundle) {
        mo14554h();
        mo14922i();
        m17688F(new C4739o7(this, m17685C(false), bundle));
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo14393w() {
        mo14554h();
        mo14922i();
        m17688F(new C4783s7(this, m17685C(true)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo14394x(C8252f fVar) {
        mo14554h();
        C7264i.m27902k(fVar);
        this.f14433d = fVar;
        m17687E();
        m17686D();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo14395y(zzlj zzlj) {
        mo14554h();
        mo14922i();
        m17689G();
        m17688F(new C4673i7(this, m17685C(true), this.f14613a.mo14846C().mo14483w(zzlj), zzlj));
    }

    /* renamed from: z */
    public final boolean mo14396z() {
        mo14554h();
        mo14922i();
        if (this.f14433d != null) {
            return true;
        }
        return false;
    }
}

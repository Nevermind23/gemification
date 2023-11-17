package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.C4117bd;
import com.google.android.gms.internal.measurement.C4356pe;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p182n6.C7264i;
import p248s7.C8243a;
import p248s7.C8245b;
import p248s7.C8262p;
import p248s7.C8266t;
import p248s7.C8267u;

/* renamed from: com.google.android.gms.measurement.internal.t6 */
public final class C4793t6 extends C4801u3 {

    /* renamed from: c */
    protected C4782s6 f14909c;

    /* renamed from: d */
    private C8266t f14910d;

    /* renamed from: e */
    private final Set f14911e = new CopyOnWriteArraySet();

    /* renamed from: f */
    private boolean f14912f;

    /* renamed from: g */
    private final AtomicReference f14913g = new AtomicReference();

    /* renamed from: h */
    private final Object f14914h = new Object();

    /* renamed from: i */
    private C8245b f14915i = new C8245b((Boolean) null, (Boolean) null);

    /* renamed from: j */
    private int f14916j = 100;

    /* renamed from: k */
    private final AtomicLong f14917k = new AtomicLong(0);

    /* renamed from: l */
    private long f14918l = -1;

    /* renamed from: m */
    private int f14919m = 100;

    /* renamed from: n */
    final C4851y9 f14920n;

    /* renamed from: o */
    protected boolean f14921o = true;

    /* renamed from: p */
    private final C4774r9 f14922p = new C4661h6(this);

    protected C4793t6(C4791t4 t4Var) {
        super(t4Var);
        this.f14920n = new C4851y9(t4Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public final void m18332O(Boolean bool, boolean z) {
        mo14554h();
        mo14922i();
        this.f14613a.mo14551d().mo14674q().mo14616b("Setting app measurement enabled (FE)", bool);
        this.f14613a.mo14849F().mo14334s(bool);
        if (z) {
            C4614d4 F = this.f14613a.mo14849F();
            C4791t4 t4Var = F.f14613a;
            F.mo14554h();
            SharedPreferences.Editor edit = F.mo14330o().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.f14613a.mo14870p() || (bool != null && !bool.booleanValue())) {
            m18333P();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public final void m18333P() {
        long j;
        mo14554h();
        String a = this.f14613a.mo14849F().f14269m.mo14319a();
        if (a != null) {
            if ("unset".equals(a)) {
                mo14890M("app", "_npa", (Object) null, this.f14613a.mo14548a().mo23594a());
            } else {
                if (true != "true".equals(a)) {
                    j = 0;
                } else {
                    j = 1;
                }
                mo14890M("app", "_npa", Long.valueOf(j), this.f14613a.mo14548a().mo23594a());
            }
        }
        if (!this.f14613a.mo14869o() || !this.f14921o) {
            this.f14613a.mo14551d().mo14674q().mo14615a("Updating Scion state (FE)");
            this.f14613a.mo14854L().mo14393w();
            return;
        }
        this.f14613a.mo14551d().mo14674q().mo14615a("Recording app launch after enabling measurement for the first time (FE)");
        mo14903f0();
        C4117bd.m15605c();
        if (this.f14613a.mo14876z().mo14398B((String) null, C4636f3.f14375h0)) {
            this.f14613a.mo14855M().f14976d.mo14930a();
        }
        this.f14613a.mo14552f().mo14776z(new C4825w5(this));
    }

    /* renamed from: b0 */
    static /* bridge */ /* synthetic */ void m18334b0(C4793t6 t6Var, C8245b bVar, C8245b bVar2) {
        boolean z;
        C8243a[] aVarArr = {C8243a.ANALYTICS_STORAGE, C8243a.AD_STORAGE};
        int i = 0;
        while (true) {
            if (i >= 2) {
                z = false;
                break;
            }
            C8243a aVar = aVarArr[i];
            if (!bVar2.mo23435i(aVar) && bVar.mo23435i(aVar)) {
                z = true;
                break;
            }
            i++;
        }
        boolean l = bVar.mo23437l(bVar2, C8243a.ANALYTICS_STORAGE, C8243a.AD_STORAGE);
        if (z || l) {
            t6Var.f14613a.mo14845B().mo14449v();
        }
    }

    /* renamed from: c0 */
    static /* synthetic */ void m18335c0(C4793t6 t6Var, C8245b bVar, int i, long j, boolean z, boolean z2) {
        t6Var.mo14554h();
        t6Var.mo14922i();
        if (j > t6Var.f14918l || !C8245b.m31055j(t6Var.f14919m, i)) {
            C4614d4 F = t6Var.f14613a.mo14849F();
            C4791t4 t4Var = F.f14613a;
            F.mo14554h();
            if (F.mo14338w(i)) {
                SharedPreferences.Editor edit = F.mo14330o().edit();
                edit.putString("consent_settings", bVar.mo23433h());
                edit.putInt("consent_source", i);
                edit.apply();
                t6Var.f14918l = j;
                t6Var.f14919m = i;
                t6Var.f14613a.mo14854L().mo14390t(z);
                if (z2) {
                    t6Var.f14613a.mo14854L().mo14380S(new AtomicReference());
                    return;
                }
                return;
            }
            t6Var.f14613a.mo14551d().mo14678u().mo14616b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        t6Var.f14613a.mo14551d().mo14678u().mo14616b("Dropped out-of-date consent setting, proposed settings", bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo14878A(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String next : bundle2.keySet()) {
            Object obj = bundle2.get(next);
            if (obj instanceof Bundle) {
                bundle2.putBundle(next, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.f14613a.mo14552f().mo14776z(new C4847y5(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo14879B(String str, String str2, long j, Object obj) {
        this.f14613a.mo14552f().mo14776z(new C4858z5(this, str, str2, obj, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final void mo14880C(String str) {
        this.f14913g.set(str);
    }

    /* renamed from: D */
    public final void mo14881D(Bundle bundle) {
        mo14882E(bundle, this.f14613a.mo14548a().mo23594a());
    }

    /* renamed from: E */
    public final void mo14882E(Bundle bundle, long j) {
        C7264i.m27902k(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f14613a.mo14551d().mo14680w().mo14615a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        C7264i.m27902k(bundle2);
        Class<String> cls = String.class;
        C8262p.m31092a(bundle2, "app_id", cls, (Object) null);
        C8262p.m31092a(bundle2, "origin", cls, (Object) null);
        C8262p.m31092a(bundle2, "name", cls, (Object) null);
        C8262p.m31092a(bundle2, C11755a.C11756a.f34100b, Object.class, (Object) null);
        C8262p.m31092a(bundle2, "trigger_event_name", cls, (Object) null);
        Class<Long> cls2 = Long.class;
        C8262p.m31092a(bundle2, "trigger_timeout", cls2, 0L);
        C8262p.m31092a(bundle2, "timed_out_event_name", cls, (Object) null);
        Class<Bundle> cls3 = Bundle.class;
        C8262p.m31092a(bundle2, "timed_out_event_params", cls3, (Object) null);
        C8262p.m31092a(bundle2, "triggered_event_name", cls, (Object) null);
        C8262p.m31092a(bundle2, "triggered_event_params", cls3, (Object) null);
        C8262p.m31092a(bundle2, "time_to_live", cls2, 0L);
        C8262p.m31092a(bundle2, "expired_event_name", cls, (Object) null);
        C8262p.m31092a(bundle2, "expired_event_params", cls3, (Object) null);
        C7264i.m27898g(bundle2.getString("name"));
        C7264i.m27898g(bundle2.getString("origin"));
        C7264i.m27902k(bundle2.get(C11755a.C11756a.f34100b));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get(C11755a.C11756a.f34100b);
        if (this.f14613a.mo14856N().mo14825p0(string) != 0) {
            this.f14613a.mo14551d().mo14675r().mo14616b("Invalid conditional user property name", this.f14613a.mo14847D().mo14530f(string));
        } else if (this.f14613a.mo14856N().mo14819l0(string, obj) == 0) {
            Object p = this.f14613a.mo14856N().mo14824p(string, obj);
            if (p == null) {
                this.f14613a.mo14551d().mo14675r().mo14617c("Unable to normalize conditional user property value", this.f14613a.mo14847D().mo14530f(string), obj);
                return;
            }
            C8262p.m31093b(bundle2, p);
            long j2 = bundle2.getLong("trigger_timeout");
            if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                this.f14613a.mo14876z();
                if (j2 > 15552000000L || j2 < 1) {
                    this.f14613a.mo14551d().mo14675r().mo14617c("Invalid conditional user property timeout", this.f14613a.mo14847D().mo14530f(string), Long.valueOf(j2));
                    return;
                }
            }
            long j3 = bundle2.getLong("time_to_live");
            this.f14613a.mo14876z();
            if (j3 > 15552000000L || j3 < 1) {
                this.f14613a.mo14551d().mo14675r().mo14617c("Invalid conditional user property time to live", this.f14613a.mo14847D().mo14530f(string), Long.valueOf(j3));
            } else {
                this.f14613a.mo14552f().mo14776z(new C4592b6(this, bundle2));
            }
        } else {
            this.f14613a.mo14551d().mo14675r().mo14617c("Invalid conditional user property value", this.f14613a.mo14847D().mo14530f(string), obj);
        }
    }

    /* renamed from: F */
    public final void mo14883F(Bundle bundle, int i, long j) {
        mo14922i();
        String g = C8245b.m31054g(bundle);
        if (g != null) {
            this.f14613a.mo14551d().mo14681x().mo14616b("Ignoring invalid consent setting", g);
            this.f14613a.mo14551d().mo14681x().mo14615a("Valid consent values are 'granted', 'denied'");
        }
        mo14884G(C8245b.m31052a(bundle), i, j);
    }

    /* renamed from: G */
    public final void mo14884G(C8245b bVar, int i, long j) {
        C8245b bVar2;
        boolean z;
        boolean z2;
        boolean z3;
        C8245b bVar3 = bVar;
        int i2 = i;
        mo14922i();
        if (i2 != -10 && bVar.mo23430e() == null && bVar.mo23432f() == null) {
            this.f14613a.mo14551d().mo14681x().mo14615a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f14914h) {
            bVar2 = this.f14915i;
            z = false;
            if (C8245b.m31055j(i2, this.f14916j)) {
                z3 = bVar3.mo23436k(this.f14915i);
                C8243a aVar = C8243a.ANALYTICS_STORAGE;
                if (bVar3.mo23435i(aVar) && !this.f14915i.mo23435i(aVar)) {
                    z = true;
                }
                bVar3 = bVar3.mo23429d(this.f14915i);
                this.f14915i = bVar3;
                this.f14916j = i2;
                z2 = z;
                z = true;
            } else {
                z3 = false;
                z2 = false;
            }
        }
        if (!z) {
            this.f14613a.mo14551d().mo14678u().mo14616b("Ignoring lower-priority consent settings, proposed settings", bVar3);
            return;
        }
        long andIncrement = this.f14917k.getAndIncrement();
        if (z3) {
            this.f14913g.set((Object) null);
            this.f14613a.mo14552f().mo14770A(new C4738o6(this, bVar3, j, i, andIncrement, z2, bVar2));
            return;
        }
        C4749p6 p6Var = new C4749p6(this, bVar3, i, andIncrement, z2, bVar2);
        if (i2 == 30 || i2 == -10) {
            this.f14613a.mo14552f().mo14770A(p6Var);
        } else {
            this.f14613a.mo14552f().mo14776z(p6Var);
        }
    }

    /* renamed from: H */
    public final void mo14885H(C8266t tVar) {
        C8266t tVar2;
        boolean z;
        mo14554h();
        mo14922i();
        if (!(tVar == null || tVar == (tVar2 = this.f14910d))) {
            if (tVar2 == null) {
                z = true;
            } else {
                z = false;
            }
            C7264i.m27906o(z, "EventInterceptor already set.");
        }
        this.f14910d = tVar;
    }

    /* renamed from: I */
    public final void mo14886I(Boolean bool) {
        mo14922i();
        this.f14613a.mo14552f().mo14776z(new C4727n6(this, bool));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo14887J(C8245b bVar) {
        boolean z;
        Boolean bool;
        mo14554h();
        if ((!bVar.mo23435i(C8243a.ANALYTICS_STORAGE) || !bVar.mo23435i(C8243a.AD_STORAGE)) && !this.f14613a.mo14854L().mo14373A()) {
            z = false;
        } else {
            z = true;
        }
        if (z != this.f14613a.mo14870p()) {
            this.f14613a.mo14866l(z);
            C4614d4 F = this.f14613a.mo14849F();
            C4791t4 t4Var = F.f14613a;
            F.mo14554h();
            if (F.mo14330o().contains("measurement_enabled_from_api")) {
                bool = Boolean.valueOf(F.mo14330o().getBoolean("measurement_enabled_from_api", true));
            } else {
                bool = null;
            }
            if (!z || bool == null || bool.booleanValue()) {
                m18332O(Boolean.valueOf(z), false);
            }
        }
    }

    /* renamed from: K */
    public final void mo14888K(String str, String str2, Object obj, boolean z) {
        mo14889L("auto", "_ldl", obj, true, this.f14613a.mo14548a().mo23594a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14889L(java.lang.String r17, java.lang.String r18, java.lang.Object r19, boolean r20, long r21) {
        /*
            r16 = this;
            r6 = r16
            r2 = r18
            r0 = r19
            r1 = 0
            r3 = 24
            if (r20 == 0) goto L_0x0017
            com.google.android.gms.measurement.internal.t4 r4 = r6.f14613a
            com.google.android.gms.measurement.internal.s9 r4 = r4.mo14856N()
            int r4 = r4.mo14825p0(r2)
        L_0x0015:
            r12 = r4
            goto L_0x0041
        L_0x0017:
            com.google.android.gms.measurement.internal.t4 r4 = r6.f14613a
            com.google.android.gms.measurement.internal.s9 r4 = r4.mo14856N()
            java.lang.String r5 = "user property"
            boolean r7 = r4.mo14811S(r5, r2)
            r8 = 6
            if (r7 != 0) goto L_0x0028
        L_0x0026:
            r12 = r8
            goto L_0x0041
        L_0x0028:
            java.lang.String[] r7 = p248s7.C8265s.f23469a
            r9 = 0
            boolean r7 = r4.mo14808P(r5, r7, r9, r2)
            if (r7 != 0) goto L_0x0034
            r4 = 15
            goto L_0x0015
        L_0x0034:
            com.google.android.gms.measurement.internal.t4 r7 = r4.f14613a
            r7.mo14876z()
            boolean r4 = r4.mo14806N(r5, r3, r2)
            if (r4 != 0) goto L_0x0040
            goto L_0x0026
        L_0x0040:
            r12 = r1
        L_0x0041:
            r4 = 1
            if (r12 == 0) goto L_0x0069
            com.google.android.gms.measurement.internal.t4 r0 = r6.f14613a
            com.google.android.gms.measurement.internal.s9 r0 = r0.mo14856N()
            com.google.android.gms.measurement.internal.t4 r5 = r6.f14613a
            r5.mo14876z()
            java.lang.String r14 = r0.mo14828r(r2, r3, r4)
            if (r2 == 0) goto L_0x0059
            int r1 = r18.length()
        L_0x0059:
            r15 = r1
            com.google.android.gms.measurement.internal.t4 r0 = r6.f14613a
            com.google.android.gms.measurement.internal.s9 r9 = r0.mo14856N()
            com.google.android.gms.measurement.internal.r9 r10 = r6.f14922p
            r11 = 0
            java.lang.String r13 = "_ev"
            r9.mo14795C(r10, r11, r12, r13, r14, r15)
            return
        L_0x0069:
            if (r17 != 0) goto L_0x006e
            java.lang.String r5 = "app"
            goto L_0x0070
        L_0x006e:
            r5 = r17
        L_0x0070:
            if (r0 == 0) goto L_0x00c5
            com.google.android.gms.measurement.internal.t4 r7 = r6.f14613a
            com.google.android.gms.measurement.internal.s9 r7 = r7.mo14856N()
            int r11 = r7.mo14819l0(r2, r0)
            if (r11 == 0) goto L_0x00ad
            com.google.android.gms.measurement.internal.t4 r5 = r6.f14613a
            com.google.android.gms.measurement.internal.s9 r5 = r5.mo14856N()
            com.google.android.gms.measurement.internal.t4 r7 = r6.f14613a
            r7.mo14876z()
            java.lang.String r13 = r5.mo14828r(r2, r3, r4)
            boolean r2 = r0 instanceof java.lang.String
            if (r2 != 0) goto L_0x0095
            boolean r2 = r0 instanceof java.lang.CharSequence
            if (r2 == 0) goto L_0x009d
        L_0x0095:
            java.lang.String r0 = r19.toString()
            int r1 = r0.length()
        L_0x009d:
            r14 = r1
            com.google.android.gms.measurement.internal.t4 r0 = r6.f14613a
            com.google.android.gms.measurement.internal.s9 r8 = r0.mo14856N()
            com.google.android.gms.measurement.internal.r9 r9 = r6.f14922p
            r10 = 0
            java.lang.String r12 = "_ev"
            r8.mo14795C(r9, r10, r11, r12, r13, r14)
            return
        L_0x00ad:
            com.google.android.gms.measurement.internal.t4 r1 = r6.f14613a
            com.google.android.gms.measurement.internal.s9 r1 = r1.mo14856N()
            java.lang.Object r7 = r1.mo14824p(r2, r0)
            if (r7 == 0) goto L_0x00c4
            r0 = r16
            r1 = r5
            r2 = r18
            r3 = r21
            r5 = r7
            r0.mo14879B(r1, r2, r3, r5)
        L_0x00c4:
            return
        L_0x00c5:
            r7 = 0
            r0 = r16
            r1 = r5
            r2 = r18
            r3 = r21
            r5 = r7
            r0.mo14879B(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4793t6.mo14889L(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14890M(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            p182n6.C7264i.m27898g(r9)
            p182n6.C7264i.m27898g(r10)
            r8.mo14554h()
            r8.mo14922i()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0064
            boolean r0 = r11 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x0052
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0052
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            r11 = 1
            java.lang.String r0 = "false"
            boolean r10 = r0.equals(r10)
            r2 = 1
            if (r11 == r10) goto L_0x0037
            r10 = 0
            goto L_0x0038
        L_0x0037:
            r10 = r2
        L_0x0038:
            java.lang.Long r11 = java.lang.Long.valueOf(r10)
            com.google.android.gms.measurement.internal.t4 r10 = r8.f14613a
            com.google.android.gms.measurement.internal.d4 r10 = r10.mo14849F()
            com.google.android.gms.measurement.internal.c4 r10 = r10.f14269m
            long r4 = r11.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x004e
            java.lang.String r0 = "true"
        L_0x004e:
            r10.mo14320b(r0)
            goto L_0x0061
        L_0x0052:
            if (r11 != 0) goto L_0x0064
            com.google.android.gms.measurement.internal.t4 r10 = r8.f14613a
            com.google.android.gms.measurement.internal.d4 r10 = r10.mo14849F()
            com.google.android.gms.measurement.internal.c4 r10 = r10.f14269m
            java.lang.String r0 = "unset"
            r10.mo14320b(r0)
        L_0x0061:
            r6 = r11
            r3 = r1
            goto L_0x0066
        L_0x0064:
            r3 = r10
            r6 = r11
        L_0x0066:
            com.google.android.gms.measurement.internal.t4 r10 = r8.f14613a
            boolean r10 = r10.mo14869o()
            if (r10 != 0) goto L_0x007e
            com.google.android.gms.measurement.internal.t4 r9 = r8.f14613a
            com.google.android.gms.measurement.internal.p3 r9 = r9.mo14551d()
            com.google.android.gms.measurement.internal.n3 r9 = r9.mo14679v()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.mo14615a(r10)
            return
        L_0x007e:
            com.google.android.gms.measurement.internal.t4 r10 = r8.f14613a
            boolean r10 = r10.mo14872r()
            if (r10 != 0) goto L_0x0087
            return
        L_0x0087:
            com.google.android.gms.measurement.internal.zzlj r10 = new com.google.android.gms.measurement.internal.zzlj
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.t4 r9 = r8.f14613a
            com.google.android.gms.measurement.internal.f8 r9 = r9.mo14854L()
            r9.mo14395y(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4793t6.mo14890M(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* renamed from: N */
    public final void mo14891N(C8267u uVar) {
        mo14922i();
        C7264i.m27902k(uVar);
        if (!this.f14911e.remove(uVar)) {
            this.f14613a.mo14551d().mo14680w().mo14615a("OnEventListener had not been registered");
        }
    }

    /* renamed from: Q */
    public final int mo14892Q(String str) {
        C7264i.m27898g(str);
        this.f14613a.mo14876z();
        return 25;
    }

    /* renamed from: R */
    public final Boolean mo14893R() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f14613a.mo14552f().mo14772r(atomicReference, 15000, "boolean test flag value", new C4628e6(this, atomicReference));
    }

    /* renamed from: S */
    public final Double mo14894S() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f14613a.mo14552f().mo14772r(atomicReference, 15000, "double test flag value", new C4716m6(this, atomicReference));
    }

    /* renamed from: T */
    public final Integer mo14895T() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f14613a.mo14552f().mo14772r(atomicReference, 15000, "int test flag value", new C4705l6(this, atomicReference));
    }

    /* renamed from: U */
    public final Long mo14896U() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f14613a.mo14552f().mo14772r(atomicReference, 15000, "long test flag value", new C4694k6(this, atomicReference));
    }

    /* renamed from: V */
    public final String mo14897V() {
        return (String) this.f14913g.get();
    }

    /* renamed from: W */
    public final String mo14898W() {
        C4848y6 r = this.f14613a.mo14853K().mo14368r();
        if (r != null) {
            return r.f15043b;
        }
        return null;
    }

    /* renamed from: X */
    public final String mo14899X() {
        C4848y6 r = this.f14613a.mo14853K().mo14368r();
        if (r != null) {
            return r.f15042a;
        }
        return null;
    }

    /* renamed from: Y */
    public final String mo14900Y() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f14613a.mo14552f().mo14772r(atomicReference, 15000, "String test flag value", new C4672i6(this, atomicReference));
    }

    /* renamed from: Z */
    public final ArrayList mo14901Z(String str, String str2) {
        if (this.f14613a.mo14552f().mo14771C()) {
            this.f14613a.mo14551d().mo14675r().mo14615a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.f14613a.mo14549b();
        if (C4597c.m17607a()) {
            this.f14613a.mo14551d().mo14675r().mo14615a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f14613a.mo14552f().mo14772r(atomicReference, 5000, "get conditional user properties", new C4616d6(this, atomicReference, (String) null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return C4785s9.m18232v(list);
        }
        this.f14613a.mo14551d().mo14675r().mo14616b("Timed out waiting for get conditional user properties", (Object) null);
        return new ArrayList();
    }

    /* renamed from: a0 */
    public final Map mo14902a0(String str, String str2, boolean z) {
        if (this.f14613a.mo14552f().mo14771C()) {
            this.f14613a.mo14551d().mo14675r().mo14615a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.f14613a.mo14549b();
        if (C4597c.m17607a()) {
            this.f14613a.mo14551d().mo14675r().mo14615a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f14613a.mo14552f().mo14772r(atomicReference, 5000, "get user properties", new C4639f6(this, atomicReference, (String) null, str, str2, z));
        List<zzlj> list = (List) atomicReference.get();
        if (list == null) {
            this.f14613a.mo14551d().mo14675r().mo14616b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        ArrayMap arrayMap = new ArrayMap(list.size());
        for (zzlj zzlj : list) {
            Object v = zzlj.mo14994v();
            if (v != null) {
                arrayMap.put(zzlj.f15108e, v);
            }
        }
        return arrayMap;
    }

    /* renamed from: f0 */
    public final void mo14903f0() {
        mo14554h();
        mo14922i();
        if (this.f14613a.mo14872r()) {
            if (this.f14613a.mo14876z().mo14398B((String) null, C4636f3.f14363b0)) {
                C4643g z = this.f14613a.mo14876z();
                z.f14613a.mo14549b();
                Boolean t = z.mo14414t("google_analytics_deferred_deep_link_enabled");
                if (t != null && t.booleanValue()) {
                    this.f14613a.mo14551d().mo14674q().mo14615a("Deferred Deep Link feature enabled.");
                    this.f14613a.mo14552f().mo14776z(new C4814v5(this));
                }
            }
            this.f14613a.mo14854L().mo14376O();
            this.f14921o = false;
            C4614d4 F = this.f14613a.mo14849F();
            F.mo14554h();
            String string = F.mo14330o().getString("previous_os_version", (String) null);
            F.f14613a.mo14844A().mo14640k();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = F.mo14330o().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.f14613a.mo14844A().mo14640k();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    mo14910u("auto", "_ou", bundle);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo14367n() {
        return false;
    }

    /* renamed from: o */
    public final void mo14904o(String str, String str2, Bundle bundle) {
        long a = this.f14613a.mo14548a().mo23594a();
        C7264i.m27898g(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", a);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f14613a.mo14552f().mo14776z(new C4604c6(this, bundle2));
    }

    /* renamed from: p */
    public final void mo14905p() {
        if ((this.f14613a.mo14550c().getApplicationContext() instanceof Application) && this.f14909c != null) {
            ((Application) this.f14613a.mo14550c().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f14909c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void mo14906q(Bundle bundle) {
        if (bundle == null) {
            this.f14613a.mo14849F().f14280x.mo14975b(new Bundle());
            return;
        }
        Bundle a = this.f14613a.mo14849F().f14280x.mo14974a();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.f14613a.mo14856N().mo14814V(obj)) {
                    this.f14613a.mo14856N().mo14795C(this.f14922p, (String) null, 27, (String) null, (String) null, 0);
                }
                this.f14613a.mo14551d().mo14681x().mo14617c("Invalid default event parameter type. Name, value", next, obj);
            } else if (C4785s9.m18219Y(next)) {
                this.f14613a.mo14551d().mo14681x().mo14616b("Invalid default event parameter name. Name", next);
            } else if (obj == null) {
                a.remove(next);
            } else {
                C4785s9 N = this.f14613a.mo14856N();
                this.f14613a.mo14876z();
                if (N.mo14809Q("param", next, 100, obj)) {
                    this.f14613a.mo14856N().mo14796D(a, next, obj);
                }
            }
        }
        this.f14613a.mo14856N();
        int m = this.f14613a.mo14876z().mo14407m();
        if (a.size() > m) {
            int i = 0;
            for (String str : new TreeSet(a.keySet())) {
                i++;
                if (i > m) {
                    a.remove(str);
                }
            }
            this.f14613a.mo14856N().mo14795C(this.f14922p, (String) null, 26, (String) null, (String) null, 0);
            this.f14613a.mo14551d().mo14681x().mo14615a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.f14613a.mo14849F().f14280x.mo14975b(a);
        this.f14613a.mo14854L().mo14392v(a);
    }

    /* renamed from: r */
    public final void mo14907r(String str, String str2, Bundle bundle) {
        mo14908s(str, str2, bundle, true, true, this.f14613a.mo14548a().mo23594a());
    }

    /* renamed from: s */
    public final void mo14908s(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Bundle bundle2;
        String str3;
        String str4 = str2;
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        if (str4 == "screen_view" || (str4 != null && str2.equals("screen_view"))) {
            this.f14613a.mo14853K().mo14366E(bundle2, j);
            return;
        }
        boolean z3 = true;
        if (z2 && this.f14910d != null && !C4785s9.m18219Y(str2)) {
            z3 = false;
        }
        boolean z4 = z3;
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        mo14878A(str3, str2, j, bundle2, z2, z4, z, (String) null);
    }

    /* renamed from: t */
    public final void mo14909t(String str, String str2, Bundle bundle, String str3) {
        C4791t4.m18290t();
        mo14878A("auto", str2, this.f14613a.mo14548a().mo23594a(), bundle, false, true, true, str3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo14910u(String str, String str2, Bundle bundle) {
        mo14554h();
        mo14911v(str, str2, this.f14613a.mo14548a().mo23594a(), bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo14911v(String str, String str2, long j, Bundle bundle) {
        boolean z;
        mo14554h();
        if (this.f14910d == null || C4785s9.m18219Y(str2)) {
            z = true;
        } else {
            z = false;
        }
        mo14912w(str, str2, j, bundle, true, z, true, (String) null);
    }

    /* JADX WARNING: type inference failed for: r5v10, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r5v12, types: [java.lang.Object[]] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14912w(java.lang.String r20, java.lang.String r21, long r22, android.os.Bundle r24, boolean r25, boolean r26, boolean r27, java.lang.String r28) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r12 = r24
            p182n6.C7264i.m27898g(r20)
            p182n6.C7264i.m27902k(r24)
            r19.mo14554h()
            r19.mo14922i()
            com.google.android.gms.measurement.internal.t4 r0 = r7.f14613a
            boolean r0 = r0.mo14869o()
            if (r0 == 0) goto L_0x04f2
            com.google.android.gms.measurement.internal.t4 r0 = r7.f14613a
            com.google.android.gms.measurement.internal.h3 r0 = r0.mo14845B()
            java.util.List r0 = r0.mo14448u()
            if (r0 == 0) goto L_0x0041
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x0031
            goto L_0x0041
        L_0x0031:
            com.google.android.gms.measurement.internal.t4 r0 = r7.f14613a
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14674q()
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.mo14617c(r1, r9, r8)
            return
        L_0x0041:
            boolean r0 = r7.f14912f
            r13 = 0
            r14 = 0
            r15 = 1
            if (r0 != 0) goto L_0x00a1
            r7.f14912f = r15
            com.google.android.gms.measurement.internal.t4 r0 = r7.f14613a     // Catch:{ ClassNotFoundException -> 0x0092 }
            boolean r0 = r0.mo14873s()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r1 = "com.google.android.gms.tagmanager.TagManagerService"
            if (r0 != 0) goto L_0x0063
            com.google.android.gms.measurement.internal.t4 r0 = r7.f14613a     // Catch:{ ClassNotFoundException -> 0x0092 }
            android.content.Context r0 = r0.mo14550c()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.Class r0 = java.lang.Class.forName(r1, r15, r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x0067
        L_0x0063:
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0092 }
        L_0x0067:
            java.lang.String r1 = "initialize"
            java.lang.Class[] r2 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x0081 }
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r14] = r3     // Catch:{ Exception -> 0x0081 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{ Exception -> 0x0081 }
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0081 }
            com.google.android.gms.measurement.internal.t4 r2 = r7.f14613a     // Catch:{ Exception -> 0x0081 }
            android.content.Context r2 = r2.mo14550c()     // Catch:{ Exception -> 0x0081 }
            r1[r14] = r2     // Catch:{ Exception -> 0x0081 }
            r0.invoke(r13, r1)     // Catch:{ Exception -> 0x0081 }
            goto L_0x00a1
        L_0x0081:
            r0 = move-exception
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a     // Catch:{ ClassNotFoundException -> 0x0092 }
            com.google.android.gms.measurement.internal.p3 r1 = r1.mo14551d()     // Catch:{ ClassNotFoundException -> 0x0092 }
            com.google.android.gms.measurement.internal.n3 r1 = r1.mo14680w()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.mo14616b(r2, r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x00a1
        L_0x0092:
            com.google.android.gms.measurement.internal.t4 r0 = r7.f14613a
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14678u()
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.mo14615a(r1)
        L_0x00a1:
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00cd
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            r1.mo14549b()
            java.lang.String r4 = r12.getString(r0)
            com.google.android.gms.measurement.internal.t4 r0 = r7.f14613a
            t6.f r0 = r0.mo14548a()
            long r5 = r0.mo23594a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            r1 = r19
            r1.mo14890M(r2, r3, r4, r5)
        L_0x00cd:
            com.google.android.gms.measurement.internal.t4 r0 = r7.f14613a
            r0.mo14549b()
            if (r25 == 0) goto L_0x00ef
            boolean r0 = com.google.android.gms.measurement.internal.C4785s9.m18223c0(r21)
            if (r0 == 0) goto L_0x00ef
            com.google.android.gms.measurement.internal.t4 r0 = r7.f14613a
            com.google.android.gms.measurement.internal.s9 r0 = r0.mo14856N()
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            com.google.android.gms.measurement.internal.d4 r1 = r1.mo14849F()
            com.google.android.gms.measurement.internal.z3 r1 = r1.f14280x
            android.os.Bundle r1 = r1.mo14974a()
            r0.mo14840z(r12, r1)
        L_0x00ef:
            r0 = 40
            if (r27 != 0) goto L_0x0177
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            r1.mo14549b()
            java.lang.String r1 = "_iap"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x0177
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            com.google.android.gms.measurement.internal.s9 r1 = r1.mo14856N()
            java.lang.String r2 = "event"
            boolean r3 = r1.mo14811S(r2, r9)
            r4 = 2
            if (r3 != 0) goto L_0x0110
            goto L_0x012a
        L_0x0110:
            java.lang.String[] r3 = p248s7.C8263q.f23461a
            java.lang.String[] r5 = p248s7.C8263q.f23462b
            boolean r3 = r1.mo14808P(r2, r3, r5, r9)
            if (r3 != 0) goto L_0x011d
            r4 = 13
            goto L_0x012a
        L_0x011d:
            com.google.android.gms.measurement.internal.t4 r3 = r1.f14613a
            r3.mo14876z()
            boolean r1 = r1.mo14806N(r2, r0, r9)
            if (r1 != 0) goto L_0x0129
            goto L_0x012a
        L_0x0129:
            r4 = r14
        L_0x012a:
            if (r4 == 0) goto L_0x0177
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            com.google.android.gms.measurement.internal.p3 r1 = r1.mo14551d()
            com.google.android.gms.measurement.internal.n3 r1 = r1.mo14676s()
            com.google.android.gms.measurement.internal.t4 r2 = r7.f14613a
            com.google.android.gms.measurement.internal.k3 r2 = r2.mo14847D()
            java.lang.String r2 = r2.mo14528d(r9)
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            r1.mo14616b(r3, r2)
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            com.google.android.gms.measurement.internal.s9 r1 = r1.mo14856N()
            com.google.android.gms.measurement.internal.t4 r2 = r7.f14613a
            r2.mo14876z()
            java.lang.String r0 = r1.mo14828r(r9, r0, r15)
            if (r9 == 0) goto L_0x015a
            int r14 = r21.length()
        L_0x015a:
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            com.google.android.gms.measurement.internal.s9 r1 = r1.mo14856N()
            com.google.android.gms.measurement.internal.r9 r2 = r7.f14922p
            r3 = 0
            java.lang.String r5 = "_ev"
            r20 = r1
            r21 = r2
            r22 = r3
            r23 = r4
            r24 = r5
            r25 = r0
            r26 = r14
            r20.mo14795C(r21, r22, r23, r24, r25, r26)
            return
        L_0x0177:
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            r1.mo14549b()
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            com.google.android.gms.measurement.internal.f7 r1 = r1.mo14853K()
            com.google.android.gms.measurement.internal.y6 r1 = r1.mo14369s(r14)
            java.lang.String r2 = "_sc"
            if (r1 == 0) goto L_0x0192
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x0192
            r1.f15045d = r15
        L_0x0192:
            if (r25 == 0) goto L_0x0198
            if (r27 != 0) goto L_0x0198
            r3 = r15
            goto L_0x0199
        L_0x0198:
            r3 = r14
        L_0x0199:
            com.google.android.gms.measurement.internal.C4785s9.m18233y(r1, r12, r3)
            java.lang.String r1 = "am"
            boolean r1 = r1.equals(r8)
            boolean r3 = com.google.android.gms.measurement.internal.C4785s9.m18219Y(r21)
            if (r25 == 0) goto L_0x01e9
            s7.t r4 = r7.f14910d
            if (r4 == 0) goto L_0x01e9
            if (r3 != 0) goto L_0x01e9
            if (r1 == 0) goto L_0x01b3
            r16 = r15
            goto L_0x01eb
        L_0x01b3:
            com.google.android.gms.measurement.internal.t4 r0 = r7.f14613a
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14674q()
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            com.google.android.gms.measurement.internal.k3 r1 = r1.mo14847D()
            java.lang.String r1 = r1.mo14528d(r9)
            com.google.android.gms.measurement.internal.t4 r2 = r7.f14613a
            com.google.android.gms.measurement.internal.k3 r2 = r2.mo14847D()
            java.lang.String r2 = r2.mo14526b(r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.mo14617c(r3, r1, r2)
            s7.t r0 = r7.f14910d
            p182n6.C7264i.m27902k(r0)
            s7.t r1 = r7.f14910d
            r2 = r20
            r3 = r21
            r4 = r24
            r5 = r22
            r1.mo14941a(r2, r3, r4, r5)
            return
        L_0x01e9:
            r16 = r1
        L_0x01eb:
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            boolean r1 = r1.mo14872r()
            if (r1 == 0) goto L_0x04f1
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            com.google.android.gms.measurement.internal.s9 r1 = r1.mo14856N()
            int r1 = r1.mo14820m0(r9)
            if (r1 == 0) goto L_0x0249
            com.google.android.gms.measurement.internal.t4 r2 = r7.f14613a
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo14551d()
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14676s()
            com.google.android.gms.measurement.internal.t4 r3 = r7.f14613a
            com.google.android.gms.measurement.internal.k3 r3 = r3.mo14847D()
            java.lang.String r3 = r3.mo14528d(r9)
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            r2.mo14616b(r4, r3)
            com.google.android.gms.measurement.internal.t4 r2 = r7.f14613a
            com.google.android.gms.measurement.internal.s9 r2 = r2.mo14856N()
            com.google.android.gms.measurement.internal.t4 r3 = r7.f14613a
            r3.mo14876z()
            java.lang.String r0 = r2.mo14828r(r9, r0, r15)
            if (r9 == 0) goto L_0x022d
            int r14 = r21.length()
        L_0x022d:
            com.google.android.gms.measurement.internal.t4 r2 = r7.f14613a
            com.google.android.gms.measurement.internal.s9 r2 = r2.mo14856N()
            com.google.android.gms.measurement.internal.r9 r3 = r7.f14922p
            java.lang.String r4 = "_ev"
            r20 = r2
            r21 = r3
            r22 = r28
            r23 = r1
            r24 = r4
            r25 = r0
            r26 = r14
            r20.mo14795C(r21, r22, r23, r24, r25, r26)
            return
        L_0x0249:
            java.lang.String r0 = "_sn"
            java.lang.String r1 = "_si"
            java.lang.String r6 = "_o"
            java.lang.String[] r0 = new java.lang.String[]{r6, r0, r2, r1}
            java.util.List r5 = p260t6.C8405g.m31542b(r0)
            com.google.android.gms.measurement.internal.t4 r0 = r7.f14613a
            com.google.android.gms.measurement.internal.s9 r1 = r0.mo14856N()
            r2 = r28
            r3 = r21
            r4 = r24
            r0 = r6
            r6 = r27
            android.os.Bundle r12 = r1.mo14838x0(r2, r3, r4, r5, r6)
            p182n6.C7264i.m27902k(r12)
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            r1.mo14549b()
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            com.google.android.gms.measurement.internal.f7 r1 = r1.mo14853K()
            com.google.android.gms.measurement.internal.y6 r1 = r1.mo14369s(r14)
            java.lang.String r5 = "_ae"
            if (r1 == 0) goto L_0x02af
            boolean r1 = r5.equals(r9)
            if (r1 == 0) goto L_0x02af
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            com.google.android.gms.measurement.internal.v8 r1 = r1.mo14855M()
            com.google.android.gms.measurement.internal.t8 r1 = r1.f14977e
            com.google.android.gms.measurement.internal.v8 r2 = r1.f14928d
            com.google.android.gms.measurement.internal.t4 r2 = r2.f14613a
            t6.f r2 = r2.mo14548a()
            long r14 = r2.mo23596c()
            long r3 = r1.f14926b
            long r2 = r14 - r3
            r1.f14926b = r14
            r14 = 0
            int r1 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x02af
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            com.google.android.gms.measurement.internal.s9 r1 = r1.mo14856N()
            r1.mo14835w(r12, r2)
        L_0x02af:
            com.google.android.gms.internal.measurement.C4337oc.m16389c()
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            com.google.android.gms.measurement.internal.g r1 = r1.mo14876z()
            com.google.android.gms.measurement.internal.e3 r2 = com.google.android.gms.measurement.internal.C4636f3.f14373g0
            boolean r1 = r1.mo14398B(r13, r2)
            if (r1 == 0) goto L_0x0339
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            java.lang.String r2 = "_ffr"
            if (r1 != 0) goto L_0x0318
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0318
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            com.google.android.gms.measurement.internal.s9 r1 = r1.mo14856N()
            java.lang.String r2 = r12.getString(r2)
            boolean r3 = p260t6.C8415q.m31576a(r2)
            if (r3 == 0) goto L_0x02e4
            r2 = r13
            goto L_0x02ea
        L_0x02e4:
            if (r2 == 0) goto L_0x02ea
            java.lang.String r2 = r2.trim()
        L_0x02ea:
            com.google.android.gms.measurement.internal.t4 r3 = r1.f14613a
            com.google.android.gms.measurement.internal.d4 r3 = r3.mo14849F()
            com.google.android.gms.measurement.internal.c4 r3 = r3.f14277u
            java.lang.String r3 = r3.mo14319a()
            boolean r3 = p248s7.C8246b0.m31066a(r2, r3)
            if (r3 != 0) goto L_0x0308
            com.google.android.gms.measurement.internal.t4 r1 = r1.f14613a
            com.google.android.gms.measurement.internal.d4 r1 = r1.mo14849F()
            com.google.android.gms.measurement.internal.c4 r1 = r1.f14277u
            r1.mo14320b(r2)
            goto L_0x0339
        L_0x0308:
            com.google.android.gms.measurement.internal.t4 r0 = r1.f14613a
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14674q()
            java.lang.String r1 = "Not logging duplicate session_start_with_rollout event"
            r0.mo14615a(r1)
            return
        L_0x0318:
            boolean r1 = r5.equals(r9)
            if (r1 == 0) goto L_0x0339
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            com.google.android.gms.measurement.internal.s9 r1 = r1.mo14856N()
            com.google.android.gms.measurement.internal.t4 r1 = r1.f14613a
            com.google.android.gms.measurement.internal.d4 r1 = r1.mo14849F()
            com.google.android.gms.measurement.internal.c4 r1 = r1.f14277u
            java.lang.String r1 = r1.mo14319a()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x0339
            r12.putString(r2, r1)
        L_0x0339:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r14.add(r12)
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            com.google.android.gms.measurement.internal.d4 r1 = r1.mo14849F()
            com.google.android.gms.measurement.internal.a4 r1 = r1.f14271o
            long r1 = r1.mo14295a()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x03cb
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            com.google.android.gms.measurement.internal.d4 r1 = r1.mo14849F()
            boolean r1 = r1.mo14337v(r10)
            if (r1 == 0) goto L_0x03cb
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            com.google.android.gms.measurement.internal.d4 r1 = r1.mo14849F()
            com.google.android.gms.measurement.internal.y3 r1 = r1.f14274r
            boolean r1 = r1.mo14963b()
            if (r1 == 0) goto L_0x03cb
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            com.google.android.gms.measurement.internal.p3 r1 = r1.mo14551d()
            com.google.android.gms.measurement.internal.n3 r1 = r1.mo14679v()
            java.lang.String r2 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.mo14615a(r2)
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            t6.f r1 = r1.mo14548a()
            long r17 = r1.mo23594a()
            java.lang.String r2 = "auto"
            java.lang.String r6 = "_sid"
            r15 = 0
            r1 = r19
            r24 = r14
            r13 = r3
            r3 = r6
            r4 = r15
            r15 = r5
            r5 = r17
            r1.mo14890M(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            t6.f r1 = r1.mo14548a()
            long r5 = r1.mo23594a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r4 = 0
            r1 = r19
            r1.mo14890M(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            t6.f r1 = r1.mo14548a()
            long r5 = r1.mo23594a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_se"
            r1 = r19
            r1.mo14890M(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            com.google.android.gms.measurement.internal.d4 r1 = r1.mo14849F()
            com.google.android.gms.measurement.internal.a4 r1 = r1.f14272p
            r1.mo14296b(r13)
            goto L_0x03cf
        L_0x03cb:
            r15 = r5
            r24 = r14
            r13 = r3
        L_0x03cf:
            java.lang.String r1 = "extend_session"
            long r1 = r12.getLong(r1, r13)
            r3 = 1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x03f6
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            com.google.android.gms.measurement.internal.p3 r1 = r1.mo14551d()
            com.google.android.gms.measurement.internal.n3 r1 = r1.mo14679v()
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.mo14615a(r2)
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            com.google.android.gms.measurement.internal.v8 r1 = r1.mo14855M()
            com.google.android.gms.measurement.internal.u8 r1 = r1.f14976d
            r2 = 1
            r1.mo14931b(r10, r2)
        L_0x03f6:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r12.keySet()
            r1.<init>(r2)
            java.util.Collections.sort(r1)
            int r2 = r1.size()
            r3 = 0
        L_0x0407:
            if (r3 >= r2) goto L_0x0455
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0452
            com.google.android.gms.measurement.internal.t4 r5 = r7.f14613a
            r5.mo14856N()
            java.lang.Object r5 = r12.get(r4)
            boolean r6 = r5 instanceof android.os.Bundle
            if (r6 == 0) goto L_0x0427
            r6 = 1
            android.os.Bundle[] r13 = new android.os.Bundle[r6]
            android.os.Bundle r5 = (android.os.Bundle) r5
            r6 = 0
            r13[r6] = r5
            goto L_0x044d
        L_0x0427:
            boolean r6 = r5 instanceof android.os.Parcelable[]
            if (r6 == 0) goto L_0x0438
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r6 = r5.length
            java.lang.Class<android.os.Bundle[]> r13 = android.os.Bundle[].class
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6, r13)
            r13 = r5
            android.os.Bundle[] r13 = (android.os.Bundle[]) r13
            goto L_0x044d
        L_0x0438:
            boolean r6 = r5 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x044c
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            android.os.Bundle[] r6 = new android.os.Bundle[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            r13 = r5
            android.os.Bundle[] r13 = (android.os.Bundle[]) r13
            goto L_0x044d
        L_0x044c:
            r13 = 0
        L_0x044d:
            if (r13 == 0) goto L_0x0452
            r12.putParcelableArray(r4, r13)
        L_0x0452:
            int r3 = r3 + 1
            goto L_0x0407
        L_0x0455:
            r12 = 0
        L_0x0456:
            int r1 = r24.size()
            if (r12 >= r1) goto L_0x04c3
            r13 = r24
            java.lang.Object r1 = r13.get(r12)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r12 == 0) goto L_0x0469
            java.lang.String r2 = "_ep"
            goto L_0x046a
        L_0x0469:
            r2 = r9
        L_0x046a:
            r1.putString(r0, r8)
            if (r26 == 0) goto L_0x0479
            com.google.android.gms.measurement.internal.t4 r3 = r7.f14613a
            com.google.android.gms.measurement.internal.s9 r3 = r3.mo14856N()
            android.os.Bundle r1 = r3.mo14836w0(r1)
        L_0x0479:
            r14 = r1
            com.google.android.gms.measurement.internal.zzaw r5 = new com.google.android.gms.measurement.internal.zzaw
            com.google.android.gms.measurement.internal.zzau r3 = new com.google.android.gms.measurement.internal.zzau
            r3.<init>(r14)
            r1 = r5
            r4 = r20
            r17 = r0
            r0 = r5
            r5 = r22
            r1.<init>(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            com.google.android.gms.measurement.internal.f8 r1 = r1.mo14854L()
            r5 = r28
            r1.mo14385o(r0, r5)
            if (r16 != 0) goto L_0x04bc
            java.util.Set r0 = r7.f14911e
            java.util.Iterator r0 = r0.iterator()
        L_0x049f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x04bc
            java.lang.Object r1 = r0.next()
            s7.u r1 = (p248s7.C8267u) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r14)
            r2 = r20
            r3 = r21
            r5 = r22
            r1.mo14950a(r2, r3, r4, r5)
            r5 = r28
            goto L_0x049f
        L_0x04bc:
            int r12 = r12 + 1
            r24 = r13
            r0 = r17
            goto L_0x0456
        L_0x04c3:
            com.google.android.gms.measurement.internal.t4 r0 = r7.f14613a
            r0.mo14549b()
            com.google.android.gms.measurement.internal.t4 r0 = r7.f14613a
            com.google.android.gms.measurement.internal.f7 r0 = r0.mo14853K()
            r1 = 0
            com.google.android.gms.measurement.internal.y6 r0 = r0.mo14369s(r1)
            if (r0 == 0) goto L_0x04f1
            boolean r0 = r15.equals(r9)
            if (r0 == 0) goto L_0x04f1
            com.google.android.gms.measurement.internal.t4 r0 = r7.f14613a
            com.google.android.gms.measurement.internal.v8 r0 = r0.mo14855M()
            com.google.android.gms.measurement.internal.t4 r1 = r7.f14613a
            t6.f r1 = r1.mo14548a()
            long r1 = r1.mo23596c()
            com.google.android.gms.measurement.internal.t8 r0 = r0.f14977e
            r3 = 1
            r0.mo14920d(r3, r3, r1)
        L_0x04f1:
            return
        L_0x04f2:
            com.google.android.gms.measurement.internal.t4 r0 = r7.f14613a
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14674q()
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.mo14615a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4793t6.mo14912w(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* renamed from: x */
    public final void mo14913x(C8267u uVar) {
        mo14922i();
        C7264i.m27902k(uVar);
        if (!this.f14911e.add(uVar)) {
            this.f14613a.mo14551d().mo14680w().mo14615a("OnEventListener already registered");
        }
    }

    /* renamed from: y */
    public final void mo14914y(long j) {
        this.f14913g.set((Object) null);
        this.f14613a.mo14552f().mo14776z(new C4580a6(this, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo14915z(long j, boolean z) {
        mo14554h();
        mo14922i();
        this.f14613a.mo14551d().mo14674q().mo14615a("Resetting analytics data (FE)");
        C4817v8 M = this.f14613a.mo14855M();
        M.mo14554h();
        M.f14977e.mo14917a();
        C4356pe.m16469c();
        if (this.f14613a.mo14876z().mo14398B((String) null, C4636f3.f14391p0)) {
            this.f14613a.mo14845B().mo14449v();
        }
        boolean o = this.f14613a.mo14869o();
        C4614d4 F = this.f14613a.mo14849F();
        F.f14261e.mo14296b(j);
        if (!TextUtils.isEmpty(F.f14613a.mo14849F().f14277u.mo14319a())) {
            F.f14277u.mo14320b((String) null);
        }
        C4117bd.m15605c();
        C4643g z2 = F.f14613a.mo14876z();
        C4625e3 e3Var = C4636f3.f14375h0;
        if (z2.mo14398B((String) null, e3Var)) {
            F.f14271o.mo14296b(0);
        }
        F.f14272p.mo14296b(0);
        if (!F.f14613a.mo14876z().mo14401E()) {
            F.mo14335t(!o);
        }
        F.f14278v.mo14320b((String) null);
        F.f14279w.mo14296b(0);
        F.f14280x.mo14975b((Bundle) null);
        if (z) {
            this.f14613a.mo14854L().mo14387q();
        }
        C4117bd.m15605c();
        if (this.f14613a.mo14876z().mo14398B((String) null, e3Var)) {
            this.f14613a.mo14855M().f14976d.mo14930a();
        }
        this.f14921o = !o;
    }
}

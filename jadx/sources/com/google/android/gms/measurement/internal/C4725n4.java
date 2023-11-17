package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.collection.LruCache;
import com.google.android.gms.internal.measurement.C4122c1;
import com.google.android.gms.internal.measurement.C4228i5;
import com.google.android.gms.internal.measurement.C4262k5;
import com.google.android.gms.internal.measurement.C4379r3;
import com.google.android.gms.internal.measurement.C4396s3;
import com.google.android.gms.internal.measurement.C4430u3;
import com.google.android.gms.internal.measurement.C4447v3;
import com.google.android.gms.internal.measurement.C4507ye;
import com.google.android.gms.internal.measurement.C4512z3;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzll;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p182n6.C7264i;
import p248s7.C8258l;
import p248s7.C8263q;

/* renamed from: com.google.android.gms.measurement.internal.n4 */
public final class C4725n4 extends C4583a9 implements C4632f {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Map f14662d = new ArrayMap();

    /* renamed from: e */
    final Map f14663e = new ArrayMap();

    /* renamed from: f */
    final Map f14664f = new ArrayMap();

    /* renamed from: g */
    final Map f14665g = new ArrayMap();

    /* renamed from: h */
    private final Map f14666h = new ArrayMap();

    /* renamed from: i */
    private final Map f14667i = new ArrayMap();

    /* renamed from: j */
    final LruCache f14668j = new C4692k4(this, 20);

    /* renamed from: k */
    final C4507ye f14669k = new C4703l4(this);

    /* renamed from: l */
    private final Map f14670l = new ArrayMap();

    /* renamed from: m */
    private final Map f14671m = new ArrayMap();

    /* renamed from: n */
    private final Map f14672n = new ArrayMap();

    C4725n4(C4719m9 m9Var) {
        super(m9Var);
    }

    /* renamed from: m */
    private final C4447v3 m18001m(String str, byte[] bArr) {
        Long l;
        if (bArr == null) {
            return C4447v3.m17034G();
        }
        try {
            C4447v3 v3Var = (C4447v3) ((C4430u3) C4741o9.m18052C(C4447v3.m17032E(), bArr)).mo13361l();
            C4724n3 v = this.f14613a.mo14551d().mo14679v();
            String str2 = null;
            if (v3Var.mo13775U()) {
                l = Long.valueOf(v3Var.mo13763C());
            } else {
                l = null;
            }
            if (v3Var.mo13774T()) {
                str2 = v3Var.mo13765H();
            }
            v.mo14617c("Parsed config. version, gmp_app_id", l, str2);
            return v3Var;
        } catch (zzll e) {
            this.f14613a.mo14551d().mo14680w().mo14617c("Unable to merge remote config. appId", C4746p3.m18094z(str), e);
            return C4447v3.m17034G();
        } catch (RuntimeException e2) {
            this.f14613a.mo14551d().mo14680w().mo14617c("Unable to merge remote config. appId", C4746p3.m18094z(str), e2);
            return C4447v3.m17034G();
        }
    }

    /* renamed from: n */
    private final void m18002n(String str, C4430u3 u3Var) {
        HashSet hashSet = new HashSet();
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        for (C4379r3 B : u3Var.mo13685y()) {
            hashSet.add(B.mo13515B());
        }
        for (int i = 0; i < u3Var.mo13679p(); i++) {
            C4396s3 s3Var = (C4396s3) u3Var.mo13680q(i).mo13472j();
            if (s3Var.mo13528r().isEmpty()) {
                this.f14613a.mo14551d().mo14680w().mo14615a("EventConfig contained null event name");
            } else {
                String r = s3Var.mo13528r();
                String b = C8263q.m31095b(s3Var.mo13528r());
                if (!TextUtils.isEmpty(b)) {
                    s3Var.mo13527q(b);
                    u3Var.mo13682s(i, s3Var);
                }
                if (s3Var.mo13531u() && s3Var.mo13529s()) {
                    arrayMap.put(r, Boolean.TRUE);
                }
                if (s3Var.mo13532y() && s3Var.mo13530t()) {
                    arrayMap2.put(s3Var.mo13528r(), Boolean.TRUE);
                }
                if (s3Var.mo13533z()) {
                    if (s3Var.mo13526p() < 2 || s3Var.mo13526p() > 65535) {
                        this.f14613a.mo14551d().mo14680w().mo14617c("Invalid sampling rate. Event name, sample rate", s3Var.mo13528r(), Integer.valueOf(s3Var.mo13526p()));
                    } else {
                        arrayMap3.put(s3Var.mo13528r(), Integer.valueOf(s3Var.mo13526p()));
                    }
                }
            }
        }
        this.f14663e.put(str, hashSet);
        this.f14664f.put(str, arrayMap);
        this.f14665g.put(str, arrayMap2);
        this.f14667i.put(str, arrayMap3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0094, code lost:
        if (r2 != null) goto L_0x0096;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0118  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m18003o(java.lang.String r13) {
        /*
            r12 = this;
            r12.mo14301i()
            r12.mo14554h()
            p182n6.C7264i.m27898g(r13)
            java.util.Map r0 = r12.f14666h
            java.lang.Object r0 = r0.get(r13)
            if (r0 != 0) goto L_0x011c
            com.google.android.gms.measurement.internal.m9 r0 = r12.f15082b
            com.google.android.gms.measurement.internal.k r0 = r0.mo14577W()
            p182n6.C7264i.m27898g(r13)
            r0.mo14554h()
            r0.mo14301i()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r0.mo14495P()     // Catch:{ SQLiteException -> 0x007e, all -> 0x007b }
            java.lang.String r3 = "apps"
            java.lang.String r4 = "remote_config"
            java.lang.String r5 = "config_last_modified_time"
            java.lang.String r6 = "e_tag"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6}     // Catch:{ SQLiteException -> 0x007e, all -> 0x007b }
            java.lang.String r5 = "app_id=?"
            r10 = 1
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x007e, all -> 0x007b }
            r11 = 0
            r6[r11] = r13     // Catch:{ SQLiteException -> 0x007e, all -> 0x007b }
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x007e, all -> 0x007b }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0079 }
            if (r3 != 0) goto L_0x0047
            goto L_0x0096
        L_0x0047:
            byte[] r3 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.String r4 = r2.getString(r10)     // Catch:{ SQLiteException -> 0x0079 }
            r5 = 2
            java.lang.String r5 = r2.getString(r5)     // Catch:{ SQLiteException -> 0x0079 }
            boolean r6 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0079 }
            if (r6 == 0) goto L_0x006d
            com.google.android.gms.measurement.internal.t4 r6 = r0.f14613a     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.p3 r6 = r6.mo14551d()     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.n3 r6 = r6.mo14675r()     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.String r7 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r13)     // Catch:{ SQLiteException -> 0x0079 }
            r6.mo14616b(r7, r8)     // Catch:{ SQLiteException -> 0x0079 }
        L_0x006d:
            if (r3 != 0) goto L_0x0070
            goto L_0x0096
        L_0x0070:
            com.google.android.gms.measurement.internal.h r6 = new com.google.android.gms.measurement.internal.h     // Catch:{ SQLiteException -> 0x0079 }
            r6.<init>(r3, r4, r5)     // Catch:{ SQLiteException -> 0x0079 }
            r2.close()
            goto L_0x009a
        L_0x0079:
            r3 = move-exception
            goto L_0x0081
        L_0x007b:
            r13 = move-exception
            goto L_0x0116
        L_0x007e:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x0081:
            com.google.android.gms.measurement.internal.t4 r0 = r0.f14613a     // Catch:{ all -> 0x0114 }
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()     // Catch:{ all -> 0x0114 }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14675r()     // Catch:{ all -> 0x0114 }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r13)     // Catch:{ all -> 0x0114 }
            r0.mo14617c(r4, r5, r3)     // Catch:{ all -> 0x0114 }
            if (r2 == 0) goto L_0x0099
        L_0x0096:
            r2.close()
        L_0x0099:
            r6 = r1
        L_0x009a:
            if (r6 != 0) goto L_0x00ca
            java.util.Map r0 = r12.f14662d
            r0.put(r13, r1)
            java.util.Map r0 = r12.f14664f
            r0.put(r13, r1)
            java.util.Map r0 = r12.f14663e
            r0.put(r13, r1)
            java.util.Map r0 = r12.f14665g
            r0.put(r13, r1)
            java.util.Map r0 = r12.f14666h
            r0.put(r13, r1)
            java.util.Map r0 = r12.f14670l
            r0.put(r13, r1)
            java.util.Map r0 = r12.f14671m
            r0.put(r13, r1)
            java.util.Map r0 = r12.f14672n
            r0.put(r13, r1)
            java.util.Map r0 = r12.f14667i
            r0.put(r13, r1)
            return
        L_0x00ca:
            byte[] r0 = r6.f14463a
            com.google.android.gms.internal.measurement.v3 r0 = r12.m18001m(r13, r0)
            com.google.android.gms.internal.measurement.m9 r0 = r0.mo13472j()
            com.google.android.gms.internal.measurement.u3 r0 = (com.google.android.gms.internal.measurement.C4430u3) r0
            r12.m18002n(r13, r0)
            java.util.Map r1 = r12.f14662d
            com.google.android.gms.internal.measurement.p9 r2 = r0.mo13361l()
            com.google.android.gms.internal.measurement.v3 r2 = (com.google.android.gms.internal.measurement.C4447v3) r2
            java.util.Map r2 = m18005q(r2)
            r1.put(r13, r2)
            java.util.Map r1 = r12.f14666h
            com.google.android.gms.internal.measurement.p9 r2 = r0.mo13361l()
            com.google.android.gms.internal.measurement.v3 r2 = (com.google.android.gms.internal.measurement.C4447v3) r2
            r1.put(r13, r2)
            com.google.android.gms.internal.measurement.p9 r1 = r0.mo13361l()
            com.google.android.gms.internal.measurement.v3 r1 = (com.google.android.gms.internal.measurement.C4447v3) r1
            r12.m18004p(r13, r1)
            java.util.Map r1 = r12.f14670l
            java.lang.String r0 = r0.mo13683t()
            r1.put(r13, r0)
            java.util.Map r0 = r12.f14671m
            java.lang.String r1 = r6.f14464b
            r0.put(r13, r1)
            java.util.Map r0 = r12.f14672n
            java.lang.String r1 = r6.f14465c
            r0.put(r13, r1)
            return
        L_0x0114:
            r13 = move-exception
            r1 = r2
        L_0x0116:
            if (r1 == 0) goto L_0x011b
            r1.close()
        L_0x011b:
            throw r13
        L_0x011c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4725n4.m18003o(java.lang.String):void");
    }

    /* renamed from: p */
    private final void m18004p(String str, C4447v3 v3Var) {
        if (v3Var.mo13761A() != 0) {
            this.f14613a.mo14551d().mo14679v().mo14616b("EES programs found", Integer.valueOf(v3Var.mo13761A()));
            C4262k5 k5Var = (C4262k5) v3Var.mo13771N().get(0);
            try {
                C4122c1 c1Var = new C4122c1();
                c1Var.mo12969d("internal.remoteConfig", new C4670i4(this, str));
                c1Var.mo12969d("internal.appMetadata", new C8258l(this, str));
                c1Var.mo12969d("internal.logger", new C4681j4(this));
                c1Var.mo12968c(k5Var);
                this.f14668j.put(str, c1Var);
                this.f14613a.mo14551d().mo14679v().mo14617c("EES program loaded for appId, activities", str, Integer.valueOf(k5Var.mo13295A().mo13146A()));
                for (C4228i5 B : k5Var.mo13295A().mo13147D()) {
                    this.f14613a.mo14551d().mo14679v().mo14616b("EES program activity", B.mo13251B());
                }
            } catch (zzd unused) {
                this.f14613a.mo14551d().mo14675r().mo14616b("Failed to load EES program. appId", str);
            }
        } else {
            this.f14668j.remove(str);
        }
    }

    /* renamed from: q */
    private static final Map m18005q(C4447v3 v3Var) {
        ArrayMap arrayMap = new ArrayMap();
        if (v3Var != null) {
            for (C4512z3 z3Var : v3Var.mo13772O()) {
                arrayMap.put(z3Var.mo13859B(), z3Var.mo13860C());
            }
        }
        return arrayMap;
    }

    /* renamed from: s */
    static /* bridge */ /* synthetic */ C4122c1 m18006s(C4725n4 n4Var, String str) {
        n4Var.mo14301i();
        C7264i.m27898g(str);
        if (!n4Var.mo14621C(str)) {
            return null;
        }
        if (!n4Var.f14666h.containsKey(str) || n4Var.f14666h.get(str) == null) {
            n4Var.m18003o(str);
        } else {
            n4Var.m18004p(str, (C4447v3) n4Var.f14666h.get(str));
        }
        return (C4122c1) n4Var.f14668j.snapshot().get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo14619A(String str) {
        mo14554h();
        this.f14666h.remove(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final boolean mo14620B(String str) {
        mo14554h();
        C4447v3 t = mo14634t(str);
        if (t == null) {
            return false;
        }
        return t.mo13773S();
    }

    /* renamed from: C */
    public final boolean mo14621C(String str) {
        C4447v3 v3Var;
        if (TextUtils.isEmpty(str) || (v3Var = (C4447v3) this.f14666h.get(str)) == null || v3Var.mo13761A() == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final boolean mo14622D(String str) {
        return "1".equals(mo14345e(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final boolean mo14623E(String str, String str2) {
        Boolean bool;
        mo14554h();
        m18003o(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f14665g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final boolean mo14624F(String str, String str2) {
        Boolean bool;
        mo14554h();
        m18003o(str);
        if (mo14622D(str) && C4785s9.m18219Y(str2)) {
            return true;
        }
        if (mo14625G(str) && C4785s9.m18220Z(str2)) {
            return true;
        }
        Map map = (Map) this.f14664f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final boolean mo14625G(String str) {
        return "1".equals(mo14345e(str, "measurement.upload.blacklist_public"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final boolean mo14626H(String str, byte[] bArr, String str2, String str3) {
        mo14301i();
        mo14554h();
        C7264i.m27898g(str);
        C4430u3 u3Var = (C4430u3) m18001m(str, bArr).mo13472j();
        m18002n(str, u3Var);
        m18004p(str, (C4447v3) u3Var.mo13361l());
        this.f14666h.put(str, (C4447v3) u3Var.mo13361l());
        this.f14670l.put(str, u3Var.mo13683t());
        this.f14671m.put(str, str2);
        this.f14672n.put(str, str3);
        this.f14662d.put(str, m18005q((C4447v3) u3Var.mo13361l()));
        this.f15082b.mo14577W().mo14514n(str, new ArrayList(u3Var.mo13684u()));
        try {
            u3Var.mo13681r();
            bArr = ((C4447v3) u3Var.mo13361l()).mo13041g();
        } catch (RuntimeException e) {
            this.f14613a.mo14551d().mo14680w().mo14617c("Unable to serialize reduced-size config. Storing full config instead. appId", C4746p3.m18094z(str), e);
        }
        C4687k W = this.f15082b.mo14577W();
        C7264i.m27898g(str);
        W.mo14554h();
        W.mo14301i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (((long) W.mo14495P().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                W.f14613a.mo14551d().mo14675r().mo14616b("Failed to update remote config (got 0). appId", C4746p3.m18094z(str));
            }
        } catch (SQLiteException e2) {
            W.f14613a.mo14551d().mo14675r().mo14617c("Error storing remote config. appId", C4746p3.m18094z(str), e2);
        }
        this.f14666h.put(str, (C4447v3) u3Var.mo13361l());
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final boolean mo14627I(String str) {
        mo14554h();
        m18003o(str);
        if (this.f14663e.get(str) == null || !((Set) this.f14663e.get(str)).contains("app_instance_id")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final boolean mo14628J(String str) {
        mo14554h();
        m18003o(str);
        if (this.f14663e.get(str) == null) {
            return false;
        }
        if (((Set) this.f14663e.get(str)).contains("device_model")) {
            return true;
        }
        if (!((Set) this.f14663e.get(str)).contains("device_info")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final boolean mo14629K(String str) {
        mo14554h();
        m18003o(str);
        if (this.f14663e.get(str) == null || !((Set) this.f14663e.get(str)).contains("enhanced_user_id")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final boolean mo14630L(String str) {
        mo14554h();
        m18003o(str);
        if (this.f14663e.get(str) == null || !((Set) this.f14663e.get(str)).contains("google_signals")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean mo14631M(String str) {
        mo14554h();
        m18003o(str);
        if (this.f14663e.get(str) == null) {
            return false;
        }
        if (((Set) this.f14663e.get(str)).contains("os_version")) {
            return true;
        }
        if (!((Set) this.f14663e.get(str)).contains("device_info")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final boolean mo14632N(String str) {
        mo14554h();
        m18003o(str);
        if (this.f14663e.get(str) == null || !((Set) this.f14663e.get(str)).contains("user_id")) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final String mo14345e(String str, String str2) {
        mo14554h();
        m18003o(str);
        Map map = (Map) this.f14662d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo14304l() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final int mo14633r(String str, String str2) {
        Integer num;
        mo14554h();
        m18003o(str);
        Map map = (Map) this.f14667i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final C4447v3 mo14634t(String str) {
        mo14301i();
        mo14554h();
        C7264i.m27898g(str);
        m18003o(str);
        return (C4447v3) this.f14666h.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final String mo14635u(String str) {
        mo14554h();
        return (String) this.f14672n.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final String mo14636v(String str) {
        mo14554h();
        return (String) this.f14671m.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final String mo14637w(String str) {
        mo14554h();
        m18003o(str);
        return (String) this.f14670l.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final Set mo14638y(String str) {
        mo14554h();
        m18003o(str);
        return (Set) this.f14663e.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo14639z(String str) {
        mo14554h();
        this.f14671m.put(str, (Object) null);
    }
}

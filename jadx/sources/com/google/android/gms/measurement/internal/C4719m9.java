package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.C4126c5;
import com.google.android.gms.internal.measurement.C4143d5;
import com.google.android.gms.internal.measurement.C4227i4;
import com.google.android.gms.internal.measurement.C4244j4;
import com.google.android.gms.internal.measurement.C4286lc;
import com.google.android.gms.internal.measurement.C4295m4;
import com.google.android.gms.internal.measurement.C4312n4;
import com.google.android.gms.internal.measurement.C4356pe;
import com.google.android.gms.internal.measurement.C4414t4;
import com.google.android.gms.internal.measurement.C4423td;
import com.google.android.gms.internal.measurement.C4447v3;
import com.google.android.gms.internal.measurement.C4523ze;
import com.google.android.gms.internal.measurement.zzcl;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p182n6.C7264i;
import p248s7.C8243a;
import p248s7.C8245b;
import p260t6.C8404f;
import p286v6.C8708e;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: com.google.android.gms.measurement.internal.m9 */
public final class C4719m9 implements C4737o5 {

    /* renamed from: F */
    private static volatile C4719m9 f14619F;

    /* renamed from: A */
    private final Map f14620A;

    /* renamed from: B */
    private final Map f14621B;

    /* renamed from: C */
    private C4848y6 f14622C;

    /* renamed from: D */
    private String f14623D;

    /* renamed from: E */
    private final C4774r9 f14624E = new C4686j9(this);

    /* renamed from: a */
    private final C4725n4 f14625a;

    /* renamed from: b */
    private final C4812v3 f14626b;

    /* renamed from: c */
    private C4687k f14627c;

    /* renamed from: d */
    private C4834x3 f14628d;

    /* renamed from: e */
    private C4850y8 f14629e;

    /* renamed from: f */
    private C4585b f14630f;

    /* renamed from: g */
    private final C4741o9 f14631g;

    /* renamed from: h */
    private C4837x6 f14632h;

    /* renamed from: i */
    private C4674i8 f14633i;

    /* renamed from: j */
    private final C4607c9 f14634j;

    /* renamed from: k */
    private C4648g4 f14635k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C4791t4 f14636l;

    /* renamed from: m */
    private boolean f14637m = false;

    /* renamed from: n */
    private boolean f14638n;

    /* renamed from: o */
    long f14639o;

    /* renamed from: p */
    private List f14640p;

    /* renamed from: q */
    private int f14641q;

    /* renamed from: r */
    private int f14642r;

    /* renamed from: s */
    private boolean f14643s;

    /* renamed from: t */
    private boolean f14644t;

    /* renamed from: u */
    private boolean f14645u;

    /* renamed from: v */
    private FileLock f14646v;

    /* renamed from: w */
    private FileChannel f14647w;

    /* renamed from: x */
    private List f14648x;

    /* renamed from: y */
    private List f14649y;

    /* renamed from: z */
    private long f14650z;

    C4719m9(C4730n9 n9Var, C4791t4 t4Var) {
        C7264i.m27902k(n9Var);
        this.f14636l = C4791t4.m18288H(n9Var.f14680a, (zzcl) null, (Long) null);
        this.f14650z = -1;
        this.f14634j = new C4607c9(this);
        C4741o9 o9Var = new C4741o9(this);
        o9Var.mo14302j();
        this.f14631g = o9Var;
        C4812v3 v3Var = new C4812v3(this);
        v3Var.mo14302j();
        this.f14626b = v3Var;
        C4725n4 n4Var = new C4725n4(this);
        n4Var.mo14302j();
        this.f14625a = n4Var;
        this.f14620A = new HashMap();
        this.f14621B = new HashMap();
        mo14552f().mo14776z(new C4619d9(this, n9Var));
    }

    /* renamed from: G */
    static final void m17924G(C4227i4 i4Var, int i, String str) {
        List H = i4Var.mo13241H();
        int i2 = 0;
        while (i2 < H.size()) {
            if (!"_err".equals(((C4312n4) H.get(i2)).mo13396G())) {
                i2++;
            } else {
                return;
            }
        }
        C4295m4 E = C4312n4.m16323E();
        E.mo13342B("_err");
        E.mo13341A(Long.valueOf((long) i).longValue());
        C4295m4 E2 = C4312n4.m16323E();
        E2.mo13342B("_ev");
        E2.mo13343C(str);
        i4Var.mo13248u((C4312n4) E.mo13361l());
        i4Var.mo13248u((C4312n4) E2.mo13361l());
    }

    /* renamed from: H */
    static final void m17925H(C4227i4 i4Var, String str) {
        List H = i4Var.mo13241H();
        for (int i = 0; i < H.size(); i++) {
            if (str.equals(((C4312n4) H.get(i)).mo13396G())) {
                i4Var.mo13250z(i);
                return;
            }
        }
    }

    /* renamed from: I */
    private final zzq m17926I(String str) {
        String str2 = str;
        C4687k kVar = this.f14627c;
        m17935R(kVar);
        C4748p5 R = kVar.mo14497R(str2);
        if (R == null || TextUtils.isEmpty(R.mo14734l0())) {
            mo14551d().mo14674q().mo14616b("No app data available; dropping", str2);
            return null;
        }
        Boolean J = m17927J(R);
        if (J == null || J.booleanValue()) {
            C4748p5 p5Var = R;
            p5Var.mo14685A();
            return new zzq(str, R.mo14738n0(), R.mo14734l0(), R.mo14700P(), R.mo14732k0(), R.mo14712a0(), R.mo14708X(), (String) null, R.mo14697M(), false, R.mo14736m0(), 0, 0, 0, p5Var.mo14696L(), false, p5Var.mo14724g0(), p5Var.mo14722f0(), p5Var.mo14709Y(), p5Var.mo14717d(), (String) null, mo14576V(str).mo23433h(), "", (String) null, p5Var.mo14699O(), p5Var.mo14720e0());
        }
        mo14551d().mo14675r().mo14616b("App version does not match; dropping. appId", C4746p3.m18094z(str));
        return null;
    }

    /* renamed from: J */
    private final Boolean m17927J(C4748p5 p5Var) {
        try {
            if (p5Var.mo14700P() != -2147483648L) {
                if (p5Var.mo14700P() == ((long) C8708e.m32461a(this.f14636l.mo14550c()).mo24091e(p5Var.mo14728i0(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = C8708e.m32461a(this.f14636l.mo14550c()).mo24091e(p5Var.mo14728i0(), 0).versionName;
                String l0 = p5Var.mo14734l0();
                if (l0 != null && l0.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: K */
    private final void m17928K() {
        mo14552f().mo14554h();
        if (this.f14643s || this.f14644t || this.f14645u) {
            mo14551d().mo14679v().mo14618d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f14643s), Boolean.valueOf(this.f14644t), Boolean.valueOf(this.f14645u));
            return;
        }
        mo14551d().mo14679v().mo14615a("Stopping uploading service(s)");
        List<Runnable> list = this.f14640p;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            ((List) C7264i.m27902k(this.f14640p)).clear();
        }
    }

    /* renamed from: L */
    private final void m17929L(C4414t4 t4Var, long j, boolean z) {
        String str;
        C4763q9 q9Var;
        String str2;
        C4687k kVar = this.f14627c;
        m17935R(kVar);
        if (true != z) {
            str = "_lte";
        } else {
            str = "_se";
        }
        C4763q9 X = kVar.mo14502X(t4Var.mo13610l0(), str);
        if (X == null || X.f14806e == null) {
            q9Var = new C4763q9(t4Var.mo13610l0(), "auto", str, mo14548a().mo23594a(), Long.valueOf(j));
        } else {
            q9Var = new C4763q9(t4Var.mo13610l0(), "auto", str, mo14548a().mo23594a(), Long.valueOf(((Long) X.f14806e).longValue() + j));
        }
        C4126c5 D = C4143d5.m15667D();
        D.mo12978u(str);
        D.mo12979y(mo14548a().mo23594a());
        D.mo12977t(((Long) q9Var.f14806e).longValue());
        C4143d5 d5Var = (C4143d5) D.mo13361l();
        int w = C4741o9.m18067w(t4Var, str);
        if (w >= 0) {
            t4Var.mo13607i0(w, d5Var);
        } else {
            t4Var.mo13565D0(d5Var);
        }
        if (j > 0) {
            C4687k kVar2 = this.f14627c;
            m17935R(kVar2);
            kVar2.mo14524x(q9Var);
            if (true != z) {
                str2 = "lifetime";
            } else {
                str2 = "session-scoped";
            }
            mo14551d().mo14679v().mo14617c("Updated engagement user property. scope, value", str2, q9Var.f14806e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0238  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m17930M() {
        /*
            r20 = this;
            r0 = r20
            com.google.android.gms.measurement.internal.r4 r1 = r20.mo14552f()
            r1.mo14554h()
            r20.mo14586g()
            long r1 = r0.f14639o
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004e
            t6.f r1 = r20.mo14548a()
            long r1 = r1.mo23596c()
            long r5 = r0.f14639o
            long r1 = r1 - r5
            long r1 = java.lang.Math.abs(r1)
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004c
            com.google.android.gms.measurement.internal.p3 r1 = r20.mo14551d()
            com.google.android.gms.measurement.internal.n3 r1 = r1.mo14679v()
            java.lang.String r2 = "Upload has been suspended. Will update scheduling later in approximately ms"
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r1.mo14616b(r2, r3)
            com.google.android.gms.measurement.internal.x3 r1 = r20.mo14580Z()
            r1.mo14955c()
            com.google.android.gms.measurement.internal.y8 r1 = r0.f14629e
            m17935R(r1)
            r1.mo14967m()
            return
        L_0x004c:
            r0.f14639o = r3
        L_0x004e:
            com.google.android.gms.measurement.internal.t4 r1 = r0.f14636l
            boolean r1 = r1.mo14872r()
            if (r1 == 0) goto L_0x0255
            boolean r1 = r20.m17932O()
            if (r1 != 0) goto L_0x005e
            goto L_0x0255
        L_0x005e:
            t6.f r1 = r20.mo14548a()
            long r1 = r1.mo23594a()
            r20.mo14575U()
            com.google.android.gms.measurement.internal.e3 r5 = com.google.android.gms.measurement.internal.C4636f3.f14328C
            r6 = 0
            java.lang.Object r5 = r5.mo14346a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.k r5 = r0.f14627c
            m17935R(r5)
            boolean r5 = r5.mo14520t()
            r10 = 1
            if (r5 != 0) goto L_0x0093
            com.google.android.gms.measurement.internal.k r5 = r0.f14627c
            m17935R(r5)
            boolean r5 = r5.mo14519s()
            if (r5 == 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r10 = 0
        L_0x0093:
            if (r10 == 0) goto L_0x00d3
            com.google.android.gms.measurement.internal.g r5 = r20.mo14575U()
            java.lang.String r5 = r5.mo14415u()
            boolean r11 = android.text.TextUtils.isEmpty(r5)
            if (r11 != 0) goto L_0x00bf
            java.lang.String r11 = ".none."
            boolean r5 = r11.equals(r5)
            if (r5 != 0) goto L_0x00bf
            r20.mo14575U()
            com.google.android.gms.measurement.internal.e3 r5 = com.google.android.gms.measurement.internal.C4636f3.f14406x
            java.lang.Object r5 = r5.mo14346a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            goto L_0x00e6
        L_0x00bf:
            r20.mo14575U()
            com.google.android.gms.measurement.internal.e3 r5 = com.google.android.gms.measurement.internal.C4636f3.f14404w
            java.lang.Object r5 = r5.mo14346a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            goto L_0x00e6
        L_0x00d3:
            r20.mo14575U()
            com.google.android.gms.measurement.internal.e3 r5 = com.google.android.gms.measurement.internal.C4636f3.f14402v
            java.lang.Object r5 = r5.mo14346a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
        L_0x00e6:
            com.google.android.gms.measurement.internal.i8 r5 = r0.f14633i
            com.google.android.gms.measurement.internal.a4 r5 = r5.f14523g
            long r13 = r5.mo14295a()
            com.google.android.gms.measurement.internal.i8 r5 = r0.f14633i
            com.google.android.gms.measurement.internal.a4 r5 = r5.f14524h
            long r15 = r5.mo14295a()
            com.google.android.gms.measurement.internal.k r5 = r0.f14627c
            m17935R(r5)
            r17 = r10
            long r9 = r5.mo14492M()
            com.google.android.gms.measurement.internal.k r5 = r0.f14627c
            m17935R(r5)
            r18 = r7
            long r6 = r5.mo14493N()
            long r5 = java.lang.Math.max(r9, r6)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0117
        L_0x0114:
            r9 = r3
            goto L_0x018f
        L_0x0117:
            long r5 = r5 - r1
            long r5 = java.lang.Math.abs(r5)
            long r5 = r1 - r5
            long r13 = r13 - r1
            long r7 = java.lang.Math.abs(r13)
            long r7 = r1 - r7
            long r15 = r15 - r1
            long r9 = java.lang.Math.abs(r15)
            long r1 = r1 - r9
            long r9 = r5 + r18
            long r7 = java.lang.Math.max(r7, r1)
            if (r17 == 0) goto L_0x013c
            int r13 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r13 <= 0) goto L_0x013c
            long r9 = java.lang.Math.min(r5, r7)
            long r9 = r9 + r11
        L_0x013c:
            com.google.android.gms.measurement.internal.o9 r13 = r0.f14631g
            m17935R(r13)
            boolean r13 = r13.mo14665M(r7, r11)
            if (r13 != 0) goto L_0x0149
            long r9 = r7 + r11
        L_0x0149:
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x018f
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x018f
            r5 = 0
        L_0x0152:
            r20.mo14575U()
            com.google.android.gms.measurement.internal.e3 r6 = com.google.android.gms.measurement.internal.C4636f3.f14332E
            r7 = 0
            java.lang.Object r6 = r6.mo14346a(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r8 = 0
            int r6 = java.lang.Math.max(r8, r6)
            r11 = 20
            int r6 = java.lang.Math.min(r11, r6)
            if (r5 >= r6) goto L_0x0114
            r11 = 1
            long r11 = r11 << r5
            r20.mo14575U()
            com.google.android.gms.measurement.internal.e3 r6 = com.google.android.gms.measurement.internal.C4636f3.f14330D
            java.lang.Object r6 = r6.mo14346a(r7)
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            long r6 = java.lang.Math.max(r3, r6)
            long r6 = r6 * r11
            long r9 = r9 + r6
            int r6 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x018c
            goto L_0x018f
        L_0x018c:
            int r5 = r5 + 1
            goto L_0x0152
        L_0x018f:
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0238
            com.google.android.gms.measurement.internal.v3 r1 = r0.f14626b
            m17935R(r1)
            boolean r1 = r1.mo14935m()
            if (r1 == 0) goto L_0x021b
            com.google.android.gms.measurement.internal.i8 r1 = r0.f14633i
            com.google.android.gms.measurement.internal.a4 r1 = r1.f14522f
            long r1 = r1.mo14295a()
            r20.mo14575U()
            com.google.android.gms.measurement.internal.e3 r5 = com.google.android.gms.measurement.internal.C4636f3.f14398t
            r6 = 0
            java.lang.Object r5 = r5.mo14346a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.o9 r7 = r0.f14631g
            m17935R(r7)
            boolean r7 = r7.mo14665M(r1, r5)
            if (r7 != 0) goto L_0x01ca
            long r1 = r1 + r5
            long r9 = java.lang.Math.max(r9, r1)
        L_0x01ca:
            com.google.android.gms.measurement.internal.x3 r1 = r20.mo14580Z()
            r1.mo14955c()
            t6.f r1 = r20.mo14548a()
            long r1 = r1.mo23594a()
            long r9 = r9 - r1
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0201
            r20.mo14575U()
            com.google.android.gms.measurement.internal.e3 r1 = com.google.android.gms.measurement.internal.C4636f3.f14408y
            r2 = 0
            java.lang.Object r1 = r1.mo14346a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r9 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.i8 r1 = r0.f14633i
            com.google.android.gms.measurement.internal.a4 r1 = r1.f14523g
            t6.f r2 = r20.mo14548a()
            long r2 = r2.mo23594a()
            r1.mo14296b(r2)
        L_0x0201:
            com.google.android.gms.measurement.internal.p3 r1 = r20.mo14551d()
            com.google.android.gms.measurement.internal.n3 r1 = r1.mo14679v()
            java.lang.String r2 = "Upload scheduled in approximately ms"
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            r1.mo14616b(r2, r3)
            com.google.android.gms.measurement.internal.y8 r1 = r0.f14629e
            m17935R(r1)
            r1.mo14968n(r9)
            return
        L_0x021b:
            com.google.android.gms.measurement.internal.p3 r1 = r20.mo14551d()
            com.google.android.gms.measurement.internal.n3 r1 = r1.mo14679v()
            java.lang.String r2 = "No network"
            r1.mo14615a(r2)
            com.google.android.gms.measurement.internal.x3 r1 = r20.mo14580Z()
            r1.mo14954b()
            com.google.android.gms.measurement.internal.y8 r1 = r0.f14629e
            m17935R(r1)
            r1.mo14967m()
            return
        L_0x0238:
            com.google.android.gms.measurement.internal.p3 r1 = r20.mo14551d()
            com.google.android.gms.measurement.internal.n3 r1 = r1.mo14679v()
            java.lang.String r2 = "Next upload time is 0"
            r1.mo14615a(r2)
            com.google.android.gms.measurement.internal.x3 r1 = r20.mo14580Z()
            r1.mo14955c()
            com.google.android.gms.measurement.internal.y8 r1 = r0.f14629e
            m17935R(r1)
            r1.mo14967m()
            return
        L_0x0255:
            com.google.android.gms.measurement.internal.p3 r1 = r20.mo14551d()
            com.google.android.gms.measurement.internal.n3 r1 = r1.mo14679v()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.mo14615a(r2)
            com.google.android.gms.measurement.internal.x3 r1 = r20.mo14580Z()
            r1.mo14955c()
            com.google.android.gms.measurement.internal.y8 r1 = r0.f14629e
            m17935R(r1)
            r1.mo14967m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4719m9.m17930M():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0b33, code lost:
        if (r10 > (com.google.android.gms.measurement.internal.C4643g.m17723i() + r8)) goto L_0x0b35;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0383 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0447 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0489 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x07d7 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0820 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0843 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x08ba A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x08bc A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x08c4 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x08f0 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x0b23 A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x0baa A[Catch:{ NumberFormatException -> 0x079c, all -> 0x0ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0bc6 A[Catch:{ SQLiteException -> 0x0bde }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:55:0x01c0=Splitter:B:55:0x01c0, B:399:0x0cba=Splitter:B:399:0x0cba} */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m17931N(java.lang.String r41, long r42) {
        /*
            r40 = this;
            r1 = r40
            java.lang.String r2 = "_npa"
            java.lang.String r3 = "_ai"
            com.google.android.gms.measurement.internal.k r4 = r1.f14627c
            m17935R(r4)
            r4.mo14509e0()
            com.google.android.gms.measurement.internal.k9 r4 = new com.google.android.gms.measurement.internal.k9     // Catch:{ all -> 0x0ccc }
            r12 = 0
            r4.<init>(r1, r12)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.k r5 = r1.f14627c     // Catch:{ all -> 0x0ccc }
            m17935R(r5)     // Catch:{ all -> 0x0ccc }
            r6 = 0
            long r9 = r1.f14650z     // Catch:{ all -> 0x0ccc }
            r7 = r42
            r11 = r4
            r5.mo14489G(r6, r7, r9, r11)     // Catch:{ all -> 0x0ccc }
            java.util.List r5 = r4.f14581c     // Catch:{ all -> 0x0ccc }
            if (r5 == 0) goto L_0x0cba
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0ccc }
            if (r5 == 0) goto L_0x002e
            goto L_0x0cba
        L_0x002e:
            com.google.android.gms.internal.measurement.u4 r5 = r4.f14579a     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.m9 r5 = r5.mo13472j()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.t4 r5 = (com.google.android.gms.internal.measurement.C4414t4) r5     // Catch:{ all -> 0x0ccc }
            r5.mo13575I0()     // Catch:{ all -> 0x0ccc }
            r11 = r12
            r14 = r11
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = -1
            r15 = -1
        L_0x0040:
            java.util.List r12 = r4.f14581c     // Catch:{ all -> 0x0ccc }
            int r12 = r12.size()     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = "_fr"
            java.lang.String r7 = "_et"
            r16 = r10
            java.lang.String r10 = "_e"
            r17 = r13
            r18 = r14
            if (r8 >= r12) goto L_0x04f9
            java.util.List r12 = r4.f14581c     // Catch:{ all -> 0x0ccc }
            java.lang.Object r12 = r12.get(r8)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.j4 r12 = (com.google.android.gms.internal.measurement.C4244j4) r12     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.m9 r12 = r12.mo13472j()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.i4 r12 = (com.google.android.gms.internal.measurement.C4227i4) r12     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.n4 r14 = r1.f14625a     // Catch:{ all -> 0x0ccc }
            m17935R(r14)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.u4 r13 = r4.f14579a     // Catch:{ all -> 0x0ccc }
            java.lang.String r13 = r13.mo13724W1()     // Catch:{ all -> 0x0ccc }
            r19 = r2
            java.lang.String r2 = r12.mo13240G()     // Catch:{ all -> 0x0ccc }
            boolean r2 = r14.mo14624F(r13, r2)     // Catch:{ all -> 0x0ccc }
            java.lang.String r13 = "_err"
            if (r2 == 0) goto L_0x00f7
            com.google.android.gms.measurement.internal.p3 r2 = r40.mo14551d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14680w()     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = "Dropping blocked raw event. appId"
            com.google.android.gms.internal.measurement.u4 r7 = r4.f14579a     // Catch:{ all -> 0x0ccc }
            java.lang.String r7 = r7.mo13724W1()     // Catch:{ all -> 0x0ccc }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r7)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.t4 r10 = r1.f14636l     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.k3 r10 = r10.mo14847D()     // Catch:{ all -> 0x0ccc }
            java.lang.String r14 = r12.mo13240G()     // Catch:{ all -> 0x0ccc }
            java.lang.String r10 = r10.mo14528d(r14)     // Catch:{ all -> 0x0ccc }
            r2.mo14617c(r6, r7, r10)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.n4 r2 = r1.f14625a     // Catch:{ all -> 0x0ccc }
            m17935R(r2)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.u4 r6 = r4.f14579a     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = r6.mo13724W1()     // Catch:{ all -> 0x0ccc }
            boolean r2 = r2.mo14622D(r6)     // Catch:{ all -> 0x0ccc }
            if (r2 != 0) goto L_0x00e8
            com.google.android.gms.measurement.internal.n4 r2 = r1.f14625a     // Catch:{ all -> 0x0ccc }
            m17935R(r2)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.u4 r6 = r4.f14579a     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = r6.mo13724W1()     // Catch:{ all -> 0x0ccc }
            boolean r2 = r2.mo14625G(r6)     // Catch:{ all -> 0x0ccc }
            if (r2 == 0) goto L_0x00c3
            goto L_0x00e8
        L_0x00c3:
            java.lang.String r2 = r12.mo13240G()     // Catch:{ all -> 0x0ccc }
            boolean r2 = r13.equals(r2)     // Catch:{ all -> 0x0ccc }
            if (r2 != 0) goto L_0x00e8
            com.google.android.gms.measurement.internal.s9 r20 = r40.mo14589h0()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.r9 r2 = r1.f14624E     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.u4 r6 = r4.f14579a     // Catch:{ all -> 0x0ccc }
            java.lang.String r22 = r6.mo13724W1()     // Catch:{ all -> 0x0ccc }
            r23 = 11
            java.lang.String r24 = "_ev"
            java.lang.String r25 = r12.mo13240G()     // Catch:{ all -> 0x0ccc }
            r26 = 0
            r21 = r2
            r20.mo14795C(r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0ccc }
        L_0x00e8:
            r21 = r3
            r6 = r8
            r23 = r11
            r10 = r16
            r13 = r17
            r14 = r18
            r11 = r5
            r5 = -1
            goto L_0x04ee
        L_0x00f7:
            java.lang.String r2 = r12.mo13240G()     // Catch:{ all -> 0x0ccc }
            java.lang.String r14 = p248s7.C8263q.m31094a(r3)     // Catch:{ all -> 0x0ccc }
            boolean r2 = r2.equals(r14)     // Catch:{ all -> 0x0ccc }
            if (r2 == 0) goto L_0x016d
            r12.mo13234A(r3)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.p3 r2 = r40.mo14551d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14679v()     // Catch:{ all -> 0x0ccc }
            java.lang.String r14 = "Renaming ad_impression to _ai"
            r2.mo14615a(r14)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.p3 r2 = r40.mo14551d()     // Catch:{ all -> 0x0ccc }
            java.lang.String r2 = r2.mo14672D()     // Catch:{ all -> 0x0ccc }
            r14 = 5
            boolean r2 = android.util.Log.isLoggable(r2, r14)     // Catch:{ all -> 0x0ccc }
            if (r2 == 0) goto L_0x016d
            r2 = 0
        L_0x0125:
            int r14 = r12.mo13243p()     // Catch:{ all -> 0x0ccc }
            if (r2 >= r14) goto L_0x016d
            java.lang.String r14 = "ad_platform"
            com.google.android.gms.internal.measurement.n4 r20 = r12.mo13239F(r2)     // Catch:{ all -> 0x0ccc }
            r21 = r3
            java.lang.String r3 = r20.mo13396G()     // Catch:{ all -> 0x0ccc }
            boolean r3 = r14.equals(r3)     // Catch:{ all -> 0x0ccc }
            if (r3 == 0) goto L_0x0168
            com.google.android.gms.internal.measurement.n4 r3 = r12.mo13239F(r2)     // Catch:{ all -> 0x0ccc }
            java.lang.String r3 = r3.mo13397H()     // Catch:{ all -> 0x0ccc }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0ccc }
            if (r3 != 0) goto L_0x0168
            java.lang.String r3 = "admob"
            com.google.android.gms.internal.measurement.n4 r14 = r12.mo13239F(r2)     // Catch:{ all -> 0x0ccc }
            java.lang.String r14 = r14.mo13397H()     // Catch:{ all -> 0x0ccc }
            boolean r3 = r3.equalsIgnoreCase(r14)     // Catch:{ all -> 0x0ccc }
            if (r3 == 0) goto L_0x0168
            com.google.android.gms.measurement.internal.p3 r3 = r40.mo14551d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.n3 r3 = r3.mo14681x()     // Catch:{ all -> 0x0ccc }
            java.lang.String r14 = "AdMob ad impression logged from app. Potentially duplicative."
            r3.mo14615a(r14)     // Catch:{ all -> 0x0ccc }
        L_0x0168:
            int r2 = r2 + 1
            r3 = r21
            goto L_0x0125
        L_0x016d:
            r21 = r3
            com.google.android.gms.measurement.internal.n4 r2 = r1.f14625a     // Catch:{ all -> 0x0ccc }
            m17935R(r2)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.u4 r3 = r4.f14579a     // Catch:{ all -> 0x0ccc }
            java.lang.String r3 = r3.mo13724W1()     // Catch:{ all -> 0x0ccc }
            java.lang.String r14 = r12.mo13240G()     // Catch:{ all -> 0x0ccc }
            boolean r2 = r2.mo14623E(r3, r14)     // Catch:{ all -> 0x0ccc }
            java.lang.String r3 = "_c"
            if (r2 != 0) goto L_0x01b7
            com.google.android.gms.measurement.internal.o9 r14 = r1.f14631g     // Catch:{ all -> 0x0ccc }
            m17935R(r14)     // Catch:{ all -> 0x0ccc }
            java.lang.String r14 = r12.mo13240G()     // Catch:{ all -> 0x0ccc }
            p182n6.C7264i.m27898g(r14)     // Catch:{ all -> 0x0ccc }
            r20 = r9
            int r9 = r14.hashCode()     // Catch:{ all -> 0x0ccc }
            r22 = r8
            r8 = 95027(0x17333, float:1.33161E-40)
            if (r9 == r8) goto L_0x01a0
            goto L_0x01aa
        L_0x01a0:
            java.lang.String r8 = "_ui"
            boolean r8 = r14.equals(r8)
            if (r8 == 0) goto L_0x01aa
            r8 = 0
            goto L_0x01ab
        L_0x01aa:
            r8 = -1
        L_0x01ab:
            if (r8 == 0) goto L_0x01bb
            r25 = r6
            r24 = r7
            r23 = r11
            r2 = 0
            r11 = r5
            goto L_0x0381
        L_0x01b7:
            r22 = r8
            r20 = r9
        L_0x01bb:
            r23 = r11
            r8 = 0
            r9 = 0
            r14 = 0
        L_0x01c0:
            int r11 = r12.mo13243p()     // Catch:{ all -> 0x0ccc }
            r24 = r7
            java.lang.String r7 = "_r"
            if (r8 >= r11) goto L_0x0227
            com.google.android.gms.internal.measurement.n4 r11 = r12.mo13239F(r8)     // Catch:{ all -> 0x0ccc }
            java.lang.String r11 = r11.mo13396G()     // Catch:{ all -> 0x0ccc }
            boolean r11 = r3.equals(r11)     // Catch:{ all -> 0x0ccc }
            if (r11 == 0) goto L_0x01f5
            com.google.android.gms.internal.measurement.n4 r7 = r12.mo13239F(r8)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.m9 r7 = r7.mo13472j()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.m4 r7 = (com.google.android.gms.internal.measurement.C4295m4) r7     // Catch:{ all -> 0x0ccc }
            r11 = r5
            r25 = r6
            r5 = 1
            r7.mo13341A(r5)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.p9 r5 = r7.mo13361l()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.n4 r5 = (com.google.android.gms.internal.measurement.C4312n4) r5     // Catch:{ all -> 0x0ccc }
            r12.mo13236C(r8, r5)     // Catch:{ all -> 0x0ccc }
            r9 = 1
            goto L_0x021f
        L_0x01f5:
            r11 = r5
            r25 = r6
            com.google.android.gms.internal.measurement.n4 r5 = r12.mo13239F(r8)     // Catch:{ all -> 0x0ccc }
            java.lang.String r5 = r5.mo13396G()     // Catch:{ all -> 0x0ccc }
            boolean r5 = r7.equals(r5)     // Catch:{ all -> 0x0ccc }
            if (r5 == 0) goto L_0x021f
            com.google.android.gms.internal.measurement.n4 r5 = r12.mo13239F(r8)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.m9 r5 = r5.mo13472j()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.m4 r5 = (com.google.android.gms.internal.measurement.C4295m4) r5     // Catch:{ all -> 0x0ccc }
            r6 = 1
            r5.mo13341A(r6)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.p9 r5 = r5.mo13361l()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.n4 r5 = (com.google.android.gms.internal.measurement.C4312n4) r5     // Catch:{ all -> 0x0ccc }
            r12.mo13236C(r8, r5)     // Catch:{ all -> 0x0ccc }
            r14 = 1
        L_0x021f:
            int r8 = r8 + 1
            r5 = r11
            r7 = r24
            r6 = r25
            goto L_0x01c0
        L_0x0227:
            r11 = r5
            r25 = r6
            if (r9 != 0) goto L_0x0258
            if (r2 == 0) goto L_0x0258
            com.google.android.gms.measurement.internal.p3 r5 = r40.mo14551d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.n3 r5 = r5.mo14679v()     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.t4 r8 = r1.f14636l     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.k3 r8 = r8.mo14847D()     // Catch:{ all -> 0x0ccc }
            java.lang.String r9 = r12.mo13240G()     // Catch:{ all -> 0x0ccc }
            java.lang.String r8 = r8.mo14528d(r9)     // Catch:{ all -> 0x0ccc }
            r5.mo14616b(r6, r8)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.m4 r5 = com.google.android.gms.internal.measurement.C4312n4.m16323E()     // Catch:{ all -> 0x0ccc }
            r5.mo13342B(r3)     // Catch:{ all -> 0x0ccc }
            r8 = 1
            r5.mo13341A(r8)     // Catch:{ all -> 0x0ccc }
            r12.mo13247t(r5)     // Catch:{ all -> 0x0ccc }
        L_0x0258:
            if (r14 != 0) goto L_0x0284
            com.google.android.gms.measurement.internal.p3 r5 = r40.mo14551d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.n3 r5 = r5.mo14679v()     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.t4 r8 = r1.f14636l     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.k3 r8 = r8.mo14847D()     // Catch:{ all -> 0x0ccc }
            java.lang.String r9 = r12.mo13240G()     // Catch:{ all -> 0x0ccc }
            java.lang.String r8 = r8.mo14528d(r9)     // Catch:{ all -> 0x0ccc }
            r5.mo14616b(r6, r8)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.m4 r5 = com.google.android.gms.internal.measurement.C4312n4.m16323E()     // Catch:{ all -> 0x0ccc }
            r5.mo13342B(r7)     // Catch:{ all -> 0x0ccc }
            r8 = 1
            r5.mo13341A(r8)     // Catch:{ all -> 0x0ccc }
            r12.mo13247t(r5)     // Catch:{ all -> 0x0ccc }
        L_0x0284:
            com.google.android.gms.measurement.internal.k r5 = r1.f14627c     // Catch:{ all -> 0x0ccc }
            m17935R(r5)     // Catch:{ all -> 0x0ccc }
            long r27 = r40.mo14572F()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.u4 r6 = r4.f14579a     // Catch:{ all -> 0x0ccc }
            java.lang.String r29 = r6.mo13724W1()     // Catch:{ all -> 0x0ccc }
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 1
            r26 = r5
            com.google.android.gms.measurement.internal.i r5 = r26.mo14499T(r27, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0ccc }
            long r5 = r5.f14505e     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.g r8 = r40.mo14575U()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.u4 r9 = r4.f14579a     // Catch:{ all -> 0x0ccc }
            java.lang.String r9 = r9.mo13724W1()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.e3 r14 = com.google.android.gms.measurement.internal.C4636f3.f14392q     // Catch:{ all -> 0x0ccc }
            int r8 = r8.mo14409o(r9, r14)     // Catch:{ all -> 0x0ccc }
            long r8 = (long) r8     // Catch:{ all -> 0x0ccc }
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x02be
            m17925H(r12, r7)     // Catch:{ all -> 0x0ccc }
            goto L_0x02c0
        L_0x02be:
            r16 = 1
        L_0x02c0:
            java.lang.String r5 = r12.mo13240G()     // Catch:{ all -> 0x0ccc }
            boolean r5 = com.google.android.gms.measurement.internal.C4785s9.m18220Z(r5)     // Catch:{ all -> 0x0ccc }
            if (r5 == 0) goto L_0x0381
            if (r2 == 0) goto L_0x0381
            com.google.android.gms.measurement.internal.k r5 = r1.f14627c     // Catch:{ all -> 0x0ccc }
            m17935R(r5)     // Catch:{ all -> 0x0ccc }
            long r27 = r40.mo14572F()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.u4 r6 = r4.f14579a     // Catch:{ all -> 0x0ccc }
            java.lang.String r29 = r6.mo13724W1()     // Catch:{ all -> 0x0ccc }
            r30 = 0
            r31 = 0
            r32 = 1
            r33 = 0
            r34 = 0
            r26 = r5
            com.google.android.gms.measurement.internal.i r5 = r26.mo14499T(r27, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0ccc }
            long r5 = r5.f14503c     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.g r7 = r40.mo14575U()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.u4 r8 = r4.f14579a     // Catch:{ all -> 0x0ccc }
            java.lang.String r8 = r8.mo13724W1()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.e3 r9 = com.google.android.gms.measurement.internal.C4636f3.f14390p     // Catch:{ all -> 0x0ccc }
            int r7 = r7.mo14409o(r8, r9)     // Catch:{ all -> 0x0ccc }
            long r7 = (long) r7     // Catch:{ all -> 0x0ccc }
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0381
            com.google.android.gms.measurement.internal.p3 r5 = r40.mo14551d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.n3 r5 = r5.mo14680w()     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.u4 r7 = r4.f14579a     // Catch:{ all -> 0x0ccc }
            java.lang.String r7 = r7.mo13724W1()     // Catch:{ all -> 0x0ccc }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r7)     // Catch:{ all -> 0x0ccc }
            r5.mo14616b(r6, r7)     // Catch:{ all -> 0x0ccc }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = -1
        L_0x031d:
            int r9 = r12.mo13243p()     // Catch:{ all -> 0x0ccc }
            if (r6 >= r9) goto L_0x0347
            com.google.android.gms.internal.measurement.n4 r9 = r12.mo13239F(r6)     // Catch:{ all -> 0x0ccc }
            java.lang.String r14 = r9.mo13396G()     // Catch:{ all -> 0x0ccc }
            boolean r14 = r3.equals(r14)     // Catch:{ all -> 0x0ccc }
            if (r14 == 0) goto L_0x0339
            com.google.android.gms.internal.measurement.m9 r5 = r9.mo13472j()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.m4 r5 = (com.google.android.gms.internal.measurement.C4295m4) r5     // Catch:{ all -> 0x0ccc }
            r8 = r6
            goto L_0x0344
        L_0x0339:
            java.lang.String r9 = r9.mo13396G()     // Catch:{ all -> 0x0ccc }
            boolean r9 = r13.equals(r9)     // Catch:{ all -> 0x0ccc }
            if (r9 == 0) goto L_0x0344
            r7 = 1
        L_0x0344:
            int r6 = r6 + 1
            goto L_0x031d
        L_0x0347:
            if (r7 == 0) goto L_0x0350
            if (r5 == 0) goto L_0x034f
            r12.mo13250z(r8)     // Catch:{ all -> 0x0ccc }
            goto L_0x0381
        L_0x034f:
            r5 = 0
        L_0x0350:
            if (r5 == 0) goto L_0x036a
            com.google.android.gms.internal.measurement.m9 r5 = r5.clone()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.m4 r5 = (com.google.android.gms.internal.measurement.C4295m4) r5     // Catch:{ all -> 0x0ccc }
            r5.mo13342B(r13)     // Catch:{ all -> 0x0ccc }
            r6 = 10
            r5.mo13341A(r6)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.p9 r5 = r5.mo13361l()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.n4 r5 = (com.google.android.gms.internal.measurement.C4312n4) r5     // Catch:{ all -> 0x0ccc }
            r12.mo13236C(r8, r5)     // Catch:{ all -> 0x0ccc }
            goto L_0x0381
        L_0x036a:
            com.google.android.gms.measurement.internal.p3 r5 = r40.mo14551d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.n3 r5 = r5.mo14675r()     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.u4 r7 = r4.f14579a     // Catch:{ all -> 0x0ccc }
            java.lang.String r7 = r7.mo13724W1()     // Catch:{ all -> 0x0ccc }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r7)     // Catch:{ all -> 0x0ccc }
            r5.mo14616b(r6, r7)     // Catch:{ all -> 0x0ccc }
        L_0x0381:
            if (r2 == 0) goto L_0x043a
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0ccc }
            java.util.List r5 = r12.mo13241H()     // Catch:{ all -> 0x0ccc }
            r2.<init>(r5)     // Catch:{ all -> 0x0ccc }
            r5 = 0
            r6 = -1
            r7 = -1
        L_0x038f:
            int r8 = r2.size()     // Catch:{ all -> 0x0ccc }
            java.lang.String r9 = "currency"
            java.lang.String r13 = "value"
            if (r5 >= r8) goto L_0x03bf
            java.lang.Object r8 = r2.get(r5)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.n4 r8 = (com.google.android.gms.internal.measurement.C4312n4) r8     // Catch:{ all -> 0x0ccc }
            java.lang.String r8 = r8.mo13396G()     // Catch:{ all -> 0x0ccc }
            boolean r8 = r13.equals(r8)     // Catch:{ all -> 0x0ccc }
            if (r8 == 0) goto L_0x03ab
            r6 = r5
            goto L_0x03bc
        L_0x03ab:
            java.lang.Object r8 = r2.get(r5)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.n4 r8 = (com.google.android.gms.internal.measurement.C4312n4) r8     // Catch:{ all -> 0x0ccc }
            java.lang.String r8 = r8.mo13396G()     // Catch:{ all -> 0x0ccc }
            boolean r8 = r9.equals(r8)     // Catch:{ all -> 0x0ccc }
            if (r8 == 0) goto L_0x03bc
            r7 = r5
        L_0x03bc:
            int r5 = r5 + 1
            goto L_0x038f
        L_0x03bf:
            r5 = -1
            if (r6 != r5) goto L_0x03c4
            goto L_0x043b
        L_0x03c4:
            java.lang.Object r5 = r2.get(r6)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.n4 r5 = (com.google.android.gms.internal.measurement.C4312n4) r5     // Catch:{ all -> 0x0ccc }
            boolean r5 = r5.mo13401W()     // Catch:{ all -> 0x0ccc }
            if (r5 != 0) goto L_0x03f5
            java.lang.Object r5 = r2.get(r6)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.n4 r5 = (com.google.android.gms.internal.measurement.C4312n4) r5     // Catch:{ all -> 0x0ccc }
            boolean r5 = r5.mo13399U()     // Catch:{ all -> 0x0ccc }
            if (r5 != 0) goto L_0x03f5
            com.google.android.gms.measurement.internal.p3 r2 = r40.mo14551d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14681x()     // Catch:{ all -> 0x0ccc }
            java.lang.String r5 = "Value must be specified with a numeric type."
            r2.mo14615a(r5)     // Catch:{ all -> 0x0ccc }
            r12.mo13250z(r6)     // Catch:{ all -> 0x0ccc }
            m17925H(r12, r3)     // Catch:{ all -> 0x0ccc }
            r2 = 18
            m17924G(r12, r2, r13)     // Catch:{ all -> 0x0ccc }
            goto L_0x043a
        L_0x03f5:
            r5 = -1
            if (r7 != r5) goto L_0x03f9
            goto L_0x0421
        L_0x03f9:
            java.lang.Object r2 = r2.get(r7)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.n4 r2 = (com.google.android.gms.internal.measurement.C4312n4) r2     // Catch:{ all -> 0x0ccc }
            java.lang.String r2 = r2.mo13397H()     // Catch:{ all -> 0x0ccc }
            int r7 = r2.length()     // Catch:{ all -> 0x0ccc }
            r8 = 3
            if (r7 != r8) goto L_0x0421
            r7 = 0
        L_0x040b:
            int r8 = r2.length()     // Catch:{ all -> 0x0ccc }
            if (r7 >= r8) goto L_0x043b
            int r8 = r2.codePointAt(r7)     // Catch:{ all -> 0x0ccc }
            boolean r13 = java.lang.Character.isLetter(r8)     // Catch:{ all -> 0x0ccc }
            if (r13 == 0) goto L_0x0421
            int r8 = java.lang.Character.charCount(r8)     // Catch:{ all -> 0x0ccc }
            int r7 = r7 + r8
            goto L_0x040b
        L_0x0421:
            com.google.android.gms.measurement.internal.p3 r2 = r40.mo14551d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14681x()     // Catch:{ all -> 0x0ccc }
            java.lang.String r7 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.mo14615a(r7)     // Catch:{ all -> 0x0ccc }
            r12.mo13250z(r6)     // Catch:{ all -> 0x0ccc }
            m17925H(r12, r3)     // Catch:{ all -> 0x0ccc }
            r2 = 19
            m17924G(r12, r2, r9)     // Catch:{ all -> 0x0ccc }
            goto L_0x043b
        L_0x043a:
            r5 = -1
        L_0x043b:
            java.lang.String r2 = r12.mo13240G()     // Catch:{ all -> 0x0ccc }
            boolean r2 = r10.equals(r2)     // Catch:{ all -> 0x0ccc }
            r6 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x0489
            com.google.android.gms.measurement.internal.o9 r2 = r1.f14631g     // Catch:{ all -> 0x0ccc }
            m17935R(r2)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.p9 r2 = r12.mo13361l()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.j4 r2 = (com.google.android.gms.internal.measurement.C4244j4) r2     // Catch:{ all -> 0x0ccc }
            r3 = r25
            com.google.android.gms.internal.measurement.n4 r2 = com.google.android.gms.measurement.internal.C4741o9.m18058n(r2, r3)     // Catch:{ all -> 0x0ccc }
            if (r2 != 0) goto L_0x04d5
            if (r18 == 0) goto L_0x0482
            long r2 = r18.mo13245r()     // Catch:{ all -> 0x0ccc }
            long r8 = r12.mo13245r()     // Catch:{ all -> 0x0ccc }
            long r2 = r2 - r8
            long r2 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x0ccc }
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x0482
            com.google.android.gms.internal.measurement.m9 r2 = r18.clone()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.i4 r2 = (com.google.android.gms.internal.measurement.C4227i4) r2     // Catch:{ all -> 0x0ccc }
            boolean r3 = r1.m17933P(r12, r2)     // Catch:{ all -> 0x0ccc }
            if (r3 == 0) goto L_0x0482
            r11.mo13578K(r15, r2)     // Catch:{ all -> 0x0ccc }
            r13 = r17
        L_0x047e:
            r14 = 0
            r23 = 0
            goto L_0x04da
        L_0x0482:
            r23 = r12
            r14 = r18
            r13 = r20
            goto L_0x04da
        L_0x0489:
            java.lang.String r2 = "_vs"
            java.lang.String r3 = r12.mo13240G()     // Catch:{ all -> 0x0ccc }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0ccc }
            if (r2 == 0) goto L_0x04d5
            com.google.android.gms.measurement.internal.o9 r2 = r1.f14631g     // Catch:{ all -> 0x0ccc }
            m17935R(r2)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.p9 r2 = r12.mo13361l()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.j4 r2 = (com.google.android.gms.internal.measurement.C4244j4) r2     // Catch:{ all -> 0x0ccc }
            r8 = r24
            com.google.android.gms.internal.measurement.n4 r2 = com.google.android.gms.measurement.internal.C4741o9.m18058n(r2, r8)     // Catch:{ all -> 0x0ccc }
            if (r2 != 0) goto L_0x04d5
            if (r23 == 0) goto L_0x04ce
            long r2 = r23.mo13245r()     // Catch:{ all -> 0x0ccc }
            long r8 = r12.mo13245r()     // Catch:{ all -> 0x0ccc }
            long r2 = r2 - r8
            long r2 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x0ccc }
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x04ce
            com.google.android.gms.internal.measurement.m9 r2 = r23.clone()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.i4 r2 = (com.google.android.gms.internal.measurement.C4227i4) r2     // Catch:{ all -> 0x0ccc }
            boolean r3 = r1.m17933P(r2, r12)     // Catch:{ all -> 0x0ccc }
            if (r3 == 0) goto L_0x04ce
            r7 = r17
            r11.mo13578K(r7, r2)     // Catch:{ all -> 0x0ccc }
            r13 = r7
            goto L_0x047e
        L_0x04ce:
            r7 = r17
            r13 = r7
            r14 = r12
            r15 = r20
            goto L_0x04da
        L_0x04d5:
            r7 = r17
            r13 = r7
            r14 = r18
        L_0x04da:
            java.util.List r2 = r4.f14581c     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.p9 r3 = r12.mo13361l()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.j4 r3 = (com.google.android.gms.internal.measurement.C4244j4) r3     // Catch:{ all -> 0x0ccc }
            r6 = r22
            r2.set(r6, r3)     // Catch:{ all -> 0x0ccc }
            int r9 = r20 + 1
            r11.mo13561B0(r12)     // Catch:{ all -> 0x0ccc }
            r10 = r16
        L_0x04ee:
            int r8 = r6 + 1
            r5 = r11
            r2 = r19
            r3 = r21
            r11 = r23
            goto L_0x0040
        L_0x04f9:
            r19 = r2
            r11 = r5
            r3 = r6
            r8 = r7
            r20 = r9
            r5 = 0
            r12 = r5
            r2 = 0
        L_0x0504:
            if (r2 >= r9) goto L_0x0554
            com.google.android.gms.internal.measurement.j4 r7 = r11.mo13624v0(r2)     // Catch:{ all -> 0x0ccc }
            java.lang.String r14 = r7.mo13282H()     // Catch:{ all -> 0x0ccc }
            boolean r14 = r10.equals(r14)     // Catch:{ all -> 0x0ccc }
            if (r14 == 0) goto L_0x0527
            com.google.android.gms.measurement.internal.o9 r14 = r1.f14631g     // Catch:{ all -> 0x0ccc }
            m17935R(r14)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.n4 r14 = com.google.android.gms.measurement.internal.C4741o9.m18058n(r7, r3)     // Catch:{ all -> 0x0ccc }
            if (r14 == 0) goto L_0x0527
            r11.mo13614p(r2)     // Catch:{ all -> 0x0ccc }
            int r9 = r9 + -1
            int r2 = r2 + -1
            goto L_0x0551
        L_0x0527:
            com.google.android.gms.measurement.internal.o9 r14 = r1.f14631g     // Catch:{ all -> 0x0ccc }
            m17935R(r14)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.n4 r7 = com.google.android.gms.measurement.internal.C4741o9.m18058n(r7, r8)     // Catch:{ all -> 0x0ccc }
            if (r7 == 0) goto L_0x0551
            boolean r14 = r7.mo13401W()     // Catch:{ all -> 0x0ccc }
            if (r14 == 0) goto L_0x0541
            long r14 = r7.mo13395D()     // Catch:{ all -> 0x0ccc }
            java.lang.Long r7 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0ccc }
            goto L_0x0542
        L_0x0541:
            r7 = 0
        L_0x0542:
            if (r7 == 0) goto L_0x0551
            long r14 = r7.longValue()     // Catch:{ all -> 0x0ccc }
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 <= 0) goto L_0x0551
            long r14 = r7.longValue()     // Catch:{ all -> 0x0ccc }
            long r12 = r12 + r14
        L_0x0551:
            r7 = 1
            int r2 = r2 + r7
            goto L_0x0504
        L_0x0554:
            r2 = 0
            r1.m17929L(r11, r12, r2)     // Catch:{ all -> 0x0ccc }
            java.util.List r2 = r11.mo13613o0()     // Catch:{ all -> 0x0ccc }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0ccc }
        L_0x0560:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0ccc }
            java.lang.String r7 = "_se"
            if (r3 == 0) goto L_0x0586
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.j4 r3 = (com.google.android.gms.internal.measurement.C4244j4) r3     // Catch:{ all -> 0x0ccc }
            java.lang.String r8 = "_s"
            java.lang.String r3 = r3.mo13282H()     // Catch:{ all -> 0x0ccc }
            boolean r3 = r8.equals(r3)     // Catch:{ all -> 0x0ccc }
            if (r3 == 0) goto L_0x0560
            com.google.android.gms.measurement.internal.k r2 = r1.f14627c     // Catch:{ all -> 0x0ccc }
            m17935R(r2)     // Catch:{ all -> 0x0ccc }
            java.lang.String r3 = r11.mo13610l0()     // Catch:{ all -> 0x0ccc }
            r2.mo14513m(r3, r7)     // Catch:{ all -> 0x0ccc }
        L_0x0586:
            java.lang.String r2 = "_sid"
            int r2 = com.google.android.gms.measurement.internal.C4741o9.m18067w(r11, r2)     // Catch:{ all -> 0x0ccc }
            if (r2 < 0) goto L_0x0593
            r2 = 1
            r1.m17929L(r11, r12, r2)     // Catch:{ all -> 0x0ccc }
            goto L_0x05b3
        L_0x0593:
            int r2 = com.google.android.gms.measurement.internal.C4741o9.m18067w(r11, r7)     // Catch:{ all -> 0x0ccc }
            if (r2 < 0) goto L_0x05b3
            r11.mo13616q(r2)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.p3 r2 = r40.mo14551d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14675r()     // Catch:{ all -> 0x0ccc }
            java.lang.String r3 = "Session engagement user property is in the bundle without session ID. appId"
            com.google.android.gms.internal.measurement.u4 r7 = r4.f14579a     // Catch:{ all -> 0x0ccc }
            java.lang.String r7 = r7.mo13724W1()     // Catch:{ all -> 0x0ccc }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r7)     // Catch:{ all -> 0x0ccc }
            r2.mo14616b(r3, r7)     // Catch:{ all -> 0x0ccc }
        L_0x05b3:
            com.google.android.gms.measurement.internal.o9 r2 = r1.f14631g     // Catch:{ all -> 0x0ccc }
            m17935R(r2)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.t4 r3 = r2.f14613a     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo14551d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.n3 r3 = r3.mo14679v()     // Catch:{ all -> 0x0ccc }
            java.lang.String r7 = "Checking account type status for ad personalization signals"
            r3.mo14615a(r7)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.m9 r3 = r2.f15082b     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.n4 r3 = r3.f14625a     // Catch:{ all -> 0x0ccc }
            m17935R(r3)     // Catch:{ all -> 0x0ccc }
            java.lang.String r7 = r11.mo13610l0()     // Catch:{ all -> 0x0ccc }
            boolean r3 = r3.mo14620B(r7)     // Catch:{ all -> 0x0ccc }
            if (r3 == 0) goto L_0x064a
            com.google.android.gms.measurement.internal.m9 r3 = r2.f15082b     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.k r3 = r3.f14627c     // Catch:{ all -> 0x0ccc }
            m17935R(r3)     // Catch:{ all -> 0x0ccc }
            java.lang.String r7 = r11.mo13610l0()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.p5 r3 = r3.mo14497R(r7)     // Catch:{ all -> 0x0ccc }
            if (r3 == 0) goto L_0x064a
            boolean r3 = r3.mo14696L()     // Catch:{ all -> 0x0ccc }
            if (r3 == 0) goto L_0x064a
            com.google.android.gms.measurement.internal.t4 r3 = r2.f14613a     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.o r3 = r3.mo14844A()     // Catch:{ all -> 0x0ccc }
            boolean r3 = r3.mo14651s()     // Catch:{ all -> 0x0ccc }
            if (r3 == 0) goto L_0x064a
            com.google.android.gms.measurement.internal.t4 r3 = r2.f14613a     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo14551d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.n3 r3 = r3.mo14674q()     // Catch:{ all -> 0x0ccc }
            java.lang.String r7 = "Turning off ad personalization due to account type"
            r3.mo14615a(r7)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.c5 r3 = com.google.android.gms.internal.measurement.C4143d5.m15667D()     // Catch:{ all -> 0x0ccc }
            r7 = r19
            r3.mo12978u(r7)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.t4 r2 = r2.f14613a     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.o r2 = r2.mo14844A()     // Catch:{ all -> 0x0ccc }
            long r8 = r2.mo14647o()     // Catch:{ all -> 0x0ccc }
            r3.mo12979y(r8)     // Catch:{ all -> 0x0ccc }
            r8 = 1
            r3.mo12977t(r8)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.p9 r2 = r3.mo13361l()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.d5 r2 = (com.google.android.gms.internal.measurement.C4143d5) r2     // Catch:{ all -> 0x0ccc }
            r3 = 0
        L_0x062c:
            int r8 = r11.mo13618r0()     // Catch:{ all -> 0x0ccc }
            if (r3 >= r8) goto L_0x0647
            com.google.android.gms.internal.measurement.d5 r8 = r11.mo13609k0(r3)     // Catch:{ all -> 0x0ccc }
            java.lang.String r8 = r8.mo13033F()     // Catch:{ all -> 0x0ccc }
            boolean r8 = r7.equals(r8)     // Catch:{ all -> 0x0ccc }
            if (r8 == 0) goto L_0x0644
            r11.mo13607i0(r3, r2)     // Catch:{ all -> 0x0ccc }
            goto L_0x064a
        L_0x0644:
            int r3 = r3 + 1
            goto L_0x062c
        L_0x0647:
            r11.mo13565D0(r2)     // Catch:{ all -> 0x0ccc }
        L_0x064a:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11.mo13602c0(r2)     // Catch:{ all -> 0x0ccc }
            r2 = -9223372036854775808
            r11.mo13574I(r2)     // Catch:{ all -> 0x0ccc }
            r2 = 0
        L_0x0658:
            int r3 = r11.mo13593T()     // Catch:{ all -> 0x0ccc }
            if (r2 >= r3) goto L_0x068b
            com.google.android.gms.internal.measurement.j4 r3 = r11.mo13624v0(r2)     // Catch:{ all -> 0x0ccc }
            long r7 = r3.mo13280D()     // Catch:{ all -> 0x0ccc }
            long r9 = r11.mo13623u0()     // Catch:{ all -> 0x0ccc }
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0675
            long r7 = r3.mo13280D()     // Catch:{ all -> 0x0ccc }
            r11.mo13602c0(r7)     // Catch:{ all -> 0x0ccc }
        L_0x0675:
            long r7 = r3.mo13280D()     // Catch:{ all -> 0x0ccc }
            long r9 = r11.mo13621t0()     // Catch:{ all -> 0x0ccc }
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x0688
            long r7 = r3.mo13280D()     // Catch:{ all -> 0x0ccc }
            r11.mo13574I(r7)     // Catch:{ all -> 0x0ccc }
        L_0x0688:
            int r2 = r2 + 1
            goto L_0x0658
        L_0x068b:
            r11.mo13591Q0()     // Catch:{ all -> 0x0ccc }
            r11.mo13569F0()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.b r2 = r1.f14630f     // Catch:{ all -> 0x0ccc }
            m17935R(r2)     // Catch:{ all -> 0x0ccc }
            java.lang.String r20 = r11.mo13610l0()     // Catch:{ all -> 0x0ccc }
            java.util.List r21 = r11.mo13613o0()     // Catch:{ all -> 0x0ccc }
            java.util.List r22 = r11.mo13615p0()     // Catch:{ all -> 0x0ccc }
            long r7 = r11.mo13623u0()     // Catch:{ all -> 0x0ccc }
            java.lang.Long r23 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0ccc }
            long r7 = r11.mo13621t0()     // Catch:{ all -> 0x0ccc }
            java.lang.Long r24 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0ccc }
            r19 = r2
            java.util.List r2 = r19.mo14306m(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0ccc }
            r11.mo13625w0(r2)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.g r2 = r40.mo14575U()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.u4 r3 = r4.f14579a     // Catch:{ all -> 0x0ccc }
            java.lang.String r3 = r3.mo13724W1()     // Catch:{ all -> 0x0ccc }
            boolean r2 = r2.mo14402F(r3)     // Catch:{ all -> 0x0ccc }
            if (r2 == 0) goto L_0x0a07
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0ccc }
            r2.<init>()     // Catch:{ all -> 0x0ccc }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0ccc }
            r3.<init>()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.s9 r7 = r40.mo14589h0()     // Catch:{ all -> 0x0ccc }
            java.security.SecureRandom r7 = r7.mo14832u()     // Catch:{ all -> 0x0ccc }
            r8 = 0
        L_0x06de:
            int r9 = r11.mo13593T()     // Catch:{ all -> 0x0ccc }
            if (r8 >= r9) goto L_0x09d1
            com.google.android.gms.internal.measurement.j4 r9 = r11.mo13624v0(r8)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.m9 r9 = r9.mo13472j()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.i4 r9 = (com.google.android.gms.internal.measurement.C4227i4) r9     // Catch:{ all -> 0x0ccc }
            java.lang.String r10 = r9.mo13240G()     // Catch:{ all -> 0x0ccc }
            java.lang.String r12 = "_ep"
            boolean r10 = r10.equals(r12)     // Catch:{ all -> 0x0ccc }
            java.lang.String r12 = "_efs"
            java.lang.String r13 = "_sr"
            if (r10 == 0) goto L_0x0780
            com.google.android.gms.measurement.internal.o9 r10 = r1.f14631g     // Catch:{ all -> 0x0ccc }
            m17935R(r10)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.p9 r10 = r9.mo13361l()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.j4 r10 = (com.google.android.gms.internal.measurement.C4244j4) r10     // Catch:{ all -> 0x0ccc }
            java.lang.String r14 = "_en"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C4741o9.m18059o(r10, r14)     // Catch:{ all -> 0x0ccc }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0ccc }
            java.lang.Object r14 = r2.get(r10)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.q r14 = (com.google.android.gms.measurement.internal.C4753q) r14     // Catch:{ all -> 0x0ccc }
            if (r14 != 0) goto L_0x0735
            com.google.android.gms.measurement.internal.k r14 = r1.f14627c     // Catch:{ all -> 0x0ccc }
            m17935R(r14)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.u4 r15 = r4.f14579a     // Catch:{ all -> 0x0ccc }
            java.lang.String r15 = r15.mo13724W1()     // Catch:{ all -> 0x0ccc }
            java.lang.Object r17 = p182n6.C7264i.m27902k(r10)     // Catch:{ all -> 0x0ccc }
            r5 = r17
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.q r14 = r14.mo14501V(r15, r5)     // Catch:{ all -> 0x0ccc }
            if (r14 == 0) goto L_0x0735
            r2.put(r10, r14)     // Catch:{ all -> 0x0ccc }
        L_0x0735:
            if (r14 == 0) goto L_0x0774
            java.lang.Long r5 = r14.f14778i     // Catch:{ all -> 0x0ccc }
            if (r5 != 0) goto L_0x0774
            java.lang.Long r5 = r14.f14779j     // Catch:{ all -> 0x0ccc }
            if (r5 == 0) goto L_0x0753
            long r5 = r5.longValue()     // Catch:{ all -> 0x0ccc }
            r17 = 1
            int r5 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r5 <= 0) goto L_0x0753
            com.google.android.gms.measurement.internal.o9 r5 = r1.f14631g     // Catch:{ all -> 0x0ccc }
            m17935R(r5)     // Catch:{ all -> 0x0ccc }
            java.lang.Long r5 = r14.f14779j     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.C4741o9.m18056P(r9, r13, r5)     // Catch:{ all -> 0x0ccc }
        L_0x0753:
            java.lang.Boolean r5 = r14.f14780k     // Catch:{ all -> 0x0ccc }
            if (r5 == 0) goto L_0x076b
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0ccc }
            if (r5 == 0) goto L_0x076b
            com.google.android.gms.measurement.internal.o9 r5 = r1.f14631g     // Catch:{ all -> 0x0ccc }
            m17935R(r5)     // Catch:{ all -> 0x0ccc }
            r5 = 1
            java.lang.Long r10 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.C4741o9.m18056P(r9, r12, r10)     // Catch:{ all -> 0x0ccc }
        L_0x076b:
            com.google.android.gms.internal.measurement.p9 r5 = r9.mo13361l()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.j4 r5 = (com.google.android.gms.internal.measurement.C4244j4) r5     // Catch:{ all -> 0x0ccc }
            r3.add(r5)     // Catch:{ all -> 0x0ccc }
        L_0x0774:
            r11.mo13578K(r8, r9)     // Catch:{ all -> 0x0ccc }
        L_0x0777:
            r10 = r3
            r21 = r7
            r5 = r11
            r7 = r2
            r2 = 1
            goto L_0x09c6
        L_0x0780:
            com.google.android.gms.measurement.internal.n4 r5 = r1.f14625a     // Catch:{ all -> 0x0ccc }
            m17935R(r5)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.u4 r6 = r4.f14579a     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = r6.mo13724W1()     // Catch:{ all -> 0x0ccc }
            java.lang.String r10 = "measurement.account.time_zone_offset_minutes"
            java.lang.String r10 = r5.mo14345e(r6, r10)     // Catch:{ all -> 0x0ccc }
            boolean r14 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0ccc }
            if (r14 != 0) goto L_0x07b1
            long r5 = java.lang.Long.parseLong(r10)     // Catch:{ NumberFormatException -> 0x079c }
            goto L_0x07b3
        L_0x079c:
            r0 = move-exception
            r10 = r0
            com.google.android.gms.measurement.internal.t4 r5 = r5.f14613a     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.p3 r5 = r5.mo14551d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.n3 r5 = r5.mo14680w()     // Catch:{ all -> 0x0ccc }
            java.lang.String r14 = "Unable to parse timezone offset. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r6)     // Catch:{ all -> 0x0ccc }
            r5.mo14617c(r14, r6, r10)     // Catch:{ all -> 0x0ccc }
        L_0x07b1:
            r5 = 0
        L_0x07b3:
            com.google.android.gms.measurement.internal.s9 r10 = r40.mo14589h0()     // Catch:{ all -> 0x0ccc }
            long r14 = r9.mo13245r()     // Catch:{ all -> 0x0ccc }
            long r14 = r10.mo14833u0(r14, r5)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.p9 r10 = r9.mo13361l()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.j4 r10 = (com.google.android.gms.internal.measurement.C4244j4) r10     // Catch:{ all -> 0x0ccc }
            r43 = r12
            r17 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0ccc }
            r17 = r5
            java.lang.String r5 = "_dbg"
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0ccc }
            if (r6 != 0) goto L_0x080b
            java.util.List r6 = r10.mo13283I()     // Catch:{ all -> 0x0ccc }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0ccc }
        L_0x07df:
            boolean r10 = r6.hasNext()     // Catch:{ all -> 0x0ccc }
            if (r10 == 0) goto L_0x080b
            java.lang.Object r10 = r6.next()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.n4 r10 = (com.google.android.gms.internal.measurement.C4312n4) r10     // Catch:{ all -> 0x0ccc }
            r21 = r6
            java.lang.String r6 = r10.mo13396G()     // Catch:{ all -> 0x0ccc }
            boolean r6 = r5.equals(r6)     // Catch:{ all -> 0x0ccc }
            if (r6 == 0) goto L_0x0808
            long r5 = r10.mo13395D()     // Catch:{ all -> 0x0ccc }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0ccc }
            boolean r5 = r12.equals(r5)     // Catch:{ all -> 0x0ccc }
            if (r5 != 0) goto L_0x0806
            goto L_0x080b
        L_0x0806:
            r5 = 1
            goto L_0x081e
        L_0x0808:
            r6 = r21
            goto L_0x07df
        L_0x080b:
            com.google.android.gms.measurement.internal.n4 r5 = r1.f14625a     // Catch:{ all -> 0x0ccc }
            m17935R(r5)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.u4 r6 = r4.f14579a     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = r6.mo13724W1()     // Catch:{ all -> 0x0ccc }
            java.lang.String r10 = r9.mo13240G()     // Catch:{ all -> 0x0ccc }
            int r5 = r5.mo14633r(r6, r10)     // Catch:{ all -> 0x0ccc }
        L_0x081e:
            if (r5 > 0) goto L_0x0843
            com.google.android.gms.measurement.internal.p3 r6 = r40.mo14551d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.n3 r6 = r6.mo14680w()     // Catch:{ all -> 0x0ccc }
            java.lang.String r10 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r9.mo13240G()     // Catch:{ all -> 0x0ccc }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0ccc }
            r6.mo14617c(r10, r12, r5)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.p9 r5 = r9.mo13361l()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.j4 r5 = (com.google.android.gms.internal.measurement.C4244j4) r5     // Catch:{ all -> 0x0ccc }
            r3.add(r5)     // Catch:{ all -> 0x0ccc }
            r11.mo13578K(r8, r9)     // Catch:{ all -> 0x0ccc }
            goto L_0x0777
        L_0x0843:
            java.lang.String r6 = r9.mo13240G()     // Catch:{ all -> 0x0ccc }
            java.lang.Object r6 = r2.get(r6)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.q r6 = (com.google.android.gms.measurement.internal.C4753q) r6     // Catch:{ all -> 0x0ccc }
            if (r6 != 0) goto L_0x08a3
            com.google.android.gms.measurement.internal.k r6 = r1.f14627c     // Catch:{ all -> 0x0ccc }
            m17935R(r6)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.u4 r10 = r4.f14579a     // Catch:{ all -> 0x0ccc }
            java.lang.String r10 = r10.mo13724W1()     // Catch:{ all -> 0x0ccc }
            java.lang.String r12 = r9.mo13240G()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.q r6 = r6.mo14501V(r10, r12)     // Catch:{ all -> 0x0ccc }
            if (r6 != 0) goto L_0x08a3
            com.google.android.gms.measurement.internal.p3 r6 = r40.mo14551d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.n3 r6 = r6.mo14680w()     // Catch:{ all -> 0x0ccc }
            java.lang.String r10 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.u4 r12 = r4.f14579a     // Catch:{ all -> 0x0ccc }
            java.lang.String r12 = r12.mo13724W1()     // Catch:{ all -> 0x0ccc }
            r21 = r14
            java.lang.String r14 = r9.mo13240G()     // Catch:{ all -> 0x0ccc }
            r6.mo14617c(r10, r12, r14)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.q r6 = new com.google.android.gms.measurement.internal.q     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.u4 r10 = r4.f14579a     // Catch:{ all -> 0x0ccc }
            java.lang.String r24 = r10.mo13724W1()     // Catch:{ all -> 0x0ccc }
            java.lang.String r25 = r9.mo13240G()     // Catch:{ all -> 0x0ccc }
            r26 = 1
            r28 = 1
            r30 = 1
            long r32 = r9.mo13245r()     // Catch:{ all -> 0x0ccc }
            r34 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r23 = r6
            r23.<init>(r24, r25, r26, r28, r30, r32, r34, r36, r37, r38, r39)     // Catch:{ all -> 0x0ccc }
            goto L_0x08a5
        L_0x08a3:
            r21 = r14
        L_0x08a5:
            com.google.android.gms.measurement.internal.o9 r10 = r1.f14631g     // Catch:{ all -> 0x0ccc }
            m17935R(r10)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.p9 r10 = r9.mo13361l()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.j4 r10 = (com.google.android.gms.internal.measurement.C4244j4) r10     // Catch:{ all -> 0x0ccc }
            java.lang.String r12 = "_eid"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C4741o9.m18059o(r10, r12)     // Catch:{ all -> 0x0ccc }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x0ccc }
            if (r10 == 0) goto L_0x08bc
            r12 = 1
            goto L_0x08bd
        L_0x08bc:
            r12 = 0
        L_0x08bd:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0ccc }
            r14 = 1
            if (r5 != r14) goto L_0x08f0
            com.google.android.gms.internal.measurement.p9 r5 = r9.mo13361l()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.j4 r5 = (com.google.android.gms.internal.measurement.C4244j4) r5     // Catch:{ all -> 0x0ccc }
            r3.add(r5)     // Catch:{ all -> 0x0ccc }
            boolean r5 = r12.booleanValue()     // Catch:{ all -> 0x0ccc }
            if (r5 == 0) goto L_0x08eb
            java.lang.Long r5 = r6.f14778i     // Catch:{ all -> 0x0ccc }
            if (r5 != 0) goto L_0x08df
            java.lang.Long r5 = r6.f14779j     // Catch:{ all -> 0x0ccc }
            if (r5 != 0) goto L_0x08df
            java.lang.Boolean r5 = r6.f14780k     // Catch:{ all -> 0x0ccc }
            if (r5 == 0) goto L_0x08eb
        L_0x08df:
            r5 = 0
            com.google.android.gms.measurement.internal.q r6 = r6.mo14755a(r5, r5, r5)     // Catch:{ all -> 0x0ccc }
            java.lang.String r5 = r9.mo13240G()     // Catch:{ all -> 0x0ccc }
            r2.put(r5, r6)     // Catch:{ all -> 0x0ccc }
        L_0x08eb:
            r11.mo13578K(r8, r9)     // Catch:{ all -> 0x0ccc }
            goto L_0x0777
        L_0x08f0:
            int r14 = r7.nextInt(r5)     // Catch:{ all -> 0x0ccc }
            if (r14 != 0) goto L_0x0931
            com.google.android.gms.measurement.internal.o9 r10 = r1.f14631g     // Catch:{ all -> 0x0ccc }
            m17935R(r10)     // Catch:{ all -> 0x0ccc }
            long r14 = (long) r5     // Catch:{ all -> 0x0ccc }
            java.lang.Long r5 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.C4741o9.m18056P(r9, r13, r5)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.p9 r10 = r9.mo13361l()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.j4 r10 = (com.google.android.gms.internal.measurement.C4244j4) r10     // Catch:{ all -> 0x0ccc }
            r3.add(r10)     // Catch:{ all -> 0x0ccc }
            boolean r10 = r12.booleanValue()     // Catch:{ all -> 0x0ccc }
            if (r10 == 0) goto L_0x0917
            r10 = 0
            com.google.android.gms.measurement.internal.q r6 = r6.mo14755a(r10, r5, r10)     // Catch:{ all -> 0x0ccc }
        L_0x0917:
            java.lang.String r5 = r9.mo13240G()     // Catch:{ all -> 0x0ccc }
            long r12 = r9.mo13245r()     // Catch:{ all -> 0x0ccc }
            r14 = r21
            com.google.android.gms.measurement.internal.q r6 = r6.mo14756b(r12, r14)     // Catch:{ all -> 0x0ccc }
            r2.put(r5, r6)     // Catch:{ all -> 0x0ccc }
            r10 = r3
            r21 = r7
            r5 = r11
            r7 = r2
            r2 = 1
            goto L_0x09c3
        L_0x0931:
            r14 = r21
            r21 = r7
            java.lang.Long r7 = r6.f14777h     // Catch:{ all -> 0x0ccc }
            if (r7 == 0) goto L_0x0946
            long r17 = r7.longValue()     // Catch:{ all -> 0x0ccc }
            r24 = r2
            r25 = r3
            r23 = r10
            r22 = r11
            goto L_0x095c
        L_0x0946:
            com.google.android.gms.measurement.internal.s9 r7 = r40.mo14589h0()     // Catch:{ all -> 0x0ccc }
            r23 = r10
            r22 = r11
            long r10 = r9.mo13244q()     // Catch:{ all -> 0x0ccc }
            r24 = r2
            r25 = r3
            r2 = r17
            long r17 = r7.mo14833u0(r10, r2)     // Catch:{ all -> 0x0ccc }
        L_0x095c:
            int r2 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r2 == 0) goto L_0x09a7
            com.google.android.gms.measurement.internal.o9 r2 = r1.f14631g     // Catch:{ all -> 0x0ccc }
            m17935R(r2)     // Catch:{ all -> 0x0ccc }
            r2 = 1
            java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0ccc }
            r10 = r43
            com.google.android.gms.measurement.internal.C4741o9.m18056P(r9, r10, r7)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.o9 r7 = r1.f14631g     // Catch:{ all -> 0x0ccc }
            m17935R(r7)     // Catch:{ all -> 0x0ccc }
            long r10 = (long) r5     // Catch:{ all -> 0x0ccc }
            java.lang.Long r5 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.C4741o9.m18056P(r9, r13, r5)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.p9 r7 = r9.mo13361l()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.j4 r7 = (com.google.android.gms.internal.measurement.C4244j4) r7     // Catch:{ all -> 0x0ccc }
            r10 = r25
            r10.add(r7)     // Catch:{ all -> 0x0ccc }
            boolean r7 = r12.booleanValue()     // Catch:{ all -> 0x0ccc }
            if (r7 == 0) goto L_0x0995
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0ccc }
            r11 = 0
            com.google.android.gms.measurement.internal.q r6 = r6.mo14755a(r11, r5, r7)     // Catch:{ all -> 0x0ccc }
        L_0x0995:
            java.lang.String r5 = r9.mo13240G()     // Catch:{ all -> 0x0ccc }
            long r11 = r9.mo13245r()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.q r6 = r6.mo14756b(r11, r14)     // Catch:{ all -> 0x0ccc }
            r7 = r24
            r7.put(r5, r6)     // Catch:{ all -> 0x0ccc }
            goto L_0x09c1
        L_0x09a7:
            r7 = r24
            r10 = r25
            r2 = 1
            boolean r5 = r12.booleanValue()     // Catch:{ all -> 0x0ccc }
            if (r5 == 0) goto L_0x09c1
            java.lang.String r5 = r9.mo13240G()     // Catch:{ all -> 0x0ccc }
            r11 = r23
            r12 = 0
            com.google.android.gms.measurement.internal.q r6 = r6.mo14755a(r11, r12, r12)     // Catch:{ all -> 0x0ccc }
            r7.put(r5, r6)     // Catch:{ all -> 0x0ccc }
        L_0x09c1:
            r5 = r22
        L_0x09c3:
            r5.mo13578K(r8, r9)     // Catch:{ all -> 0x0ccc }
        L_0x09c6:
            int r8 = r8 + 1
            r11 = r5
            r2 = r7
            r3 = r10
            r7 = r21
            r5 = 0
            goto L_0x06de
        L_0x09d1:
            r7 = r2
            r10 = r3
            r5 = r11
            int r2 = r10.size()     // Catch:{ all -> 0x0ccc }
            int r3 = r5.mo13593T()     // Catch:{ all -> 0x0ccc }
            if (r2 >= r3) goto L_0x09e4
            r5.mo13575I0()     // Catch:{ all -> 0x0ccc }
            r5.mo13626x0(r10)     // Catch:{ all -> 0x0ccc }
        L_0x09e4:
            java.util.Set r2 = r7.entrySet()     // Catch:{ all -> 0x0ccc }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0ccc }
        L_0x09ec:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0ccc }
            if (r3 == 0) goto L_0x0a08
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0ccc }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.k r6 = r1.f14627c     // Catch:{ all -> 0x0ccc }
            m17935R(r6)     // Catch:{ all -> 0x0ccc }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.q r3 = (com.google.android.gms.measurement.internal.C4753q) r3     // Catch:{ all -> 0x0ccc }
            r6.mo14517q(r3)     // Catch:{ all -> 0x0ccc }
            goto L_0x09ec
        L_0x0a07:
            r5 = r11
        L_0x0a08:
            com.google.android.gms.internal.measurement.u4 r2 = r4.f14579a     // Catch:{ all -> 0x0ccc }
            java.lang.String r2 = r2.mo13724W1()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.k r3 = r1.f14627c     // Catch:{ all -> 0x0ccc }
            m17935R(r3)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.p5 r3 = r3.mo14497R(r2)     // Catch:{ all -> 0x0ccc }
            if (r3 != 0) goto L_0x0a31
            com.google.android.gms.measurement.internal.p3 r3 = r40.mo14551d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.n3 r3 = r3.mo14675r()     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.u4 r7 = r4.f14579a     // Catch:{ all -> 0x0ccc }
            java.lang.String r7 = r7.mo13724W1()     // Catch:{ all -> 0x0ccc }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r7)     // Catch:{ all -> 0x0ccc }
            r3.mo14616b(r6, r7)     // Catch:{ all -> 0x0ccc }
            goto L_0x0a8d
        L_0x0a31:
            int r6 = r5.mo13593T()     // Catch:{ all -> 0x0ccc }
            if (r6 <= 0) goto L_0x0a8d
            long r6 = r3.mo14714b0()     // Catch:{ all -> 0x0ccc }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0a45
            r5.mo13595V(r6)     // Catch:{ all -> 0x0ccc }
            goto L_0x0a48
        L_0x0a45:
            r5.mo13583M0()     // Catch:{ all -> 0x0ccc }
        L_0x0a48:
            long r8 = r3.mo14718d0()     // Catch:{ all -> 0x0ccc }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0a53
            goto L_0x0a54
        L_0x0a53:
            r6 = r8
        L_0x0a54:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0a5c
            r5.mo13596W(r6)     // Catch:{ all -> 0x0ccc }
            goto L_0x0a5f
        L_0x0a5c:
            r5.mo13585N0()     // Catch:{ all -> 0x0ccc }
        L_0x0a5f:
            r3.mo14721f()     // Catch:{ all -> 0x0ccc }
            long r6 = r3.mo14716c0()     // Catch:{ all -> 0x0ccc }
            int r6 = (int) r6     // Catch:{ all -> 0x0ccc }
            r5.mo13558A(r6)     // Catch:{ all -> 0x0ccc }
            long r6 = r5.mo13623u0()     // Catch:{ all -> 0x0ccc }
            r3.mo14688D(r6)     // Catch:{ all -> 0x0ccc }
            long r6 = r5.mo13621t0()     // Catch:{ all -> 0x0ccc }
            r3.mo14686B(r6)     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = r3.mo14726h0()     // Catch:{ all -> 0x0ccc }
            if (r6 == 0) goto L_0x0a82
            r5.mo13586O(r6)     // Catch:{ all -> 0x0ccc }
            goto L_0x0a85
        L_0x0a82:
            r5.mo13577J0()     // Catch:{ all -> 0x0ccc }
        L_0x0a85:
            com.google.android.gms.measurement.internal.k r6 = r1.f14627c     // Catch:{ all -> 0x0ccc }
            m17935R(r6)     // Catch:{ all -> 0x0ccc }
            r6.mo14516p(r3)     // Catch:{ all -> 0x0ccc }
        L_0x0a8d:
            int r3 = r5.mo13593T()     // Catch:{ all -> 0x0ccc }
            if (r3 <= 0) goto L_0x0c11
            com.google.android.gms.measurement.internal.t4 r3 = r1.f14636l     // Catch:{ all -> 0x0ccc }
            r3.mo14549b()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.n4 r3 = r1.f14625a     // Catch:{ all -> 0x0ccc }
            m17935R(r3)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.u4 r6 = r4.f14579a     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = r6.mo13724W1()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.v3 r3 = r3.mo14634t(r6)     // Catch:{ all -> 0x0ccc }
            r6 = -1
            if (r3 == 0) goto L_0x0aba
            boolean r8 = r3.mo13775U()     // Catch:{ all -> 0x0ccc }
            if (r8 != 0) goto L_0x0ab2
            goto L_0x0aba
        L_0x0ab2:
            long r8 = r3.mo13763C()     // Catch:{ all -> 0x0ccc }
            r5.mo13562C(r8)     // Catch:{ all -> 0x0ccc }
            goto L_0x0ae1
        L_0x0aba:
            com.google.android.gms.internal.measurement.u4 r3 = r4.f14579a     // Catch:{ all -> 0x0ccc }
            java.lang.String r3 = r3.mo13700G()     // Catch:{ all -> 0x0ccc }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0ccc }
            if (r3 == 0) goto L_0x0aca
            r5.mo13562C(r6)     // Catch:{ all -> 0x0ccc }
            goto L_0x0ae1
        L_0x0aca:
            com.google.android.gms.measurement.internal.p3 r3 = r40.mo14551d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.n3 r3 = r3.mo14680w()     // Catch:{ all -> 0x0ccc }
            java.lang.String r8 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.u4 r9 = r4.f14579a     // Catch:{ all -> 0x0ccc }
            java.lang.String r9 = r9.mo13724W1()     // Catch:{ all -> 0x0ccc }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r9)     // Catch:{ all -> 0x0ccc }
            r3.mo14616b(r8, r9)     // Catch:{ all -> 0x0ccc }
        L_0x0ae1:
            com.google.android.gms.measurement.internal.k r3 = r1.f14627c     // Catch:{ all -> 0x0ccc }
            m17935R(r3)     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.p9 r5 = r5.mo13361l()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.internal.measurement.u4 r5 = (com.google.android.gms.internal.measurement.C4431u4) r5     // Catch:{ all -> 0x0ccc }
            r3.mo14554h()     // Catch:{ all -> 0x0ccc }
            r3.mo14301i()     // Catch:{ all -> 0x0ccc }
            p182n6.C7264i.m27902k(r5)     // Catch:{ all -> 0x0ccc }
            java.lang.String r8 = r5.mo13724W1()     // Catch:{ all -> 0x0ccc }
            p182n6.C7264i.m27898g(r8)     // Catch:{ all -> 0x0ccc }
            boolean r8 = r5.mo13734n1()     // Catch:{ all -> 0x0ccc }
            p182n6.C7264i.m27905n(r8)     // Catch:{ all -> 0x0ccc }
            r3.mo14512h0()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.t4 r8 = r3.f14613a     // Catch:{ all -> 0x0ccc }
            t6.f r8 = r8.mo14548a()     // Catch:{ all -> 0x0ccc }
            long r8 = r8.mo23594a()     // Catch:{ all -> 0x0ccc }
            long r10 = r5.mo13707J1()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.t4 r12 = r3.f14613a     // Catch:{ all -> 0x0ccc }
            r12.mo14876z()     // Catch:{ all -> 0x0ccc }
            long r12 = com.google.android.gms.measurement.internal.C4643g.m17723i()     // Catch:{ all -> 0x0ccc }
            long r12 = r8 - r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 < 0) goto L_0x0b35
            long r10 = r5.mo13707J1()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.t4 r12 = r3.f14613a     // Catch:{ all -> 0x0ccc }
            r12.mo14876z()     // Catch:{ all -> 0x0ccc }
            long r12 = com.google.android.gms.measurement.internal.C4643g.m17723i()     // Catch:{ all -> 0x0ccc }
            long r12 = r12 + r8
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0b58
        L_0x0b35:
            com.google.android.gms.measurement.internal.t4 r10 = r3.f14613a     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.p3 r10 = r10.mo14551d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.n3 r10 = r10.mo14680w()     // Catch:{ all -> 0x0ccc }
            java.lang.String r11 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            java.lang.String r12 = r5.mo13724W1()     // Catch:{ all -> 0x0ccc }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r12)     // Catch:{ all -> 0x0ccc }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0ccc }
            long r13 = r5.mo13707J1()     // Catch:{ all -> 0x0ccc }
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0ccc }
            r10.mo14618d(r11, r12, r8, r9)     // Catch:{ all -> 0x0ccc }
        L_0x0b58:
            byte[] r8 = r5.mo13041g()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.m9 r9 = r3.f15082b     // Catch:{ IOException -> 0x0bf8 }
            com.google.android.gms.measurement.internal.o9 r9 = r9.f14631g     // Catch:{ IOException -> 0x0bf8 }
            m17935R(r9)     // Catch:{ IOException -> 0x0bf8 }
            byte[] r8 = r9.mo14666O(r8)     // Catch:{ IOException -> 0x0bf8 }
            com.google.android.gms.measurement.internal.t4 r9 = r3.f14613a     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.p3 r9 = r9.mo14551d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.n3 r9 = r9.mo14679v()     // Catch:{ all -> 0x0ccc }
            java.lang.String r10 = "Saving bundle, size"
            int r11 = r8.length     // Catch:{ all -> 0x0ccc }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0ccc }
            r9.mo14616b(r10, r11)     // Catch:{ all -> 0x0ccc }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0ccc }
            r9.<init>()     // Catch:{ all -> 0x0ccc }
            java.lang.String r10 = "app_id"
            java.lang.String r11 = r5.mo13724W1()     // Catch:{ all -> 0x0ccc }
            r9.put(r10, r11)     // Catch:{ all -> 0x0ccc }
            java.lang.String r10 = "bundle_end_timestamp"
            long r11 = r5.mo13707J1()     // Catch:{ all -> 0x0ccc }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0ccc }
            r9.put(r10, r11)     // Catch:{ all -> 0x0ccc }
            java.lang.String r10 = "data"
            r9.put(r10, r8)     // Catch:{ all -> 0x0ccc }
            java.lang.String r8 = "has_realtime"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0ccc }
            r9.put(r8, r10)     // Catch:{ all -> 0x0ccc }
            boolean r8 = r5.mo13740t1()     // Catch:{ all -> 0x0ccc }
            if (r8 == 0) goto L_0x0bb7
            java.lang.String r8 = "retry_count"
            int r10 = r5.mo13695D1()     // Catch:{ all -> 0x0ccc }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0ccc }
            r9.put(r8, r10)     // Catch:{ all -> 0x0ccc }
        L_0x0bb7:
            android.database.sqlite.SQLiteDatabase r8 = r3.mo14495P()     // Catch:{ SQLiteException -> 0x0bde }
            java.lang.String r10 = "queue"
            r11 = 0
            long r8 = r8.insert(r10, r11, r9)     // Catch:{ SQLiteException -> 0x0bde }
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0c11
            com.google.android.gms.measurement.internal.t4 r6 = r3.f14613a     // Catch:{ SQLiteException -> 0x0bde }
            com.google.android.gms.measurement.internal.p3 r6 = r6.mo14551d()     // Catch:{ SQLiteException -> 0x0bde }
            com.google.android.gms.measurement.internal.n3 r6 = r6.mo14675r()     // Catch:{ SQLiteException -> 0x0bde }
            java.lang.String r7 = "Failed to insert bundle (got -1). appId"
            java.lang.String r8 = r5.mo13724W1()     // Catch:{ SQLiteException -> 0x0bde }
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r8)     // Catch:{ SQLiteException -> 0x0bde }
            r6.mo14616b(r7, r8)     // Catch:{ SQLiteException -> 0x0bde }
            goto L_0x0c11
        L_0x0bde:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.t4 r3 = r3.f14613a     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo14551d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.n3 r3 = r3.mo14675r()     // Catch:{ all -> 0x0ccc }
            java.lang.String r7 = "Error storing bundle. appId"
            java.lang.String r5 = r5.mo13724W1()     // Catch:{ all -> 0x0ccc }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r5)     // Catch:{ all -> 0x0ccc }
            r3.mo14617c(r7, r5, r6)     // Catch:{ all -> 0x0ccc }
            goto L_0x0c11
        L_0x0bf8:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.t4 r3 = r3.f14613a     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo14551d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.n3 r3 = r3.mo14675r()     // Catch:{ all -> 0x0ccc }
            java.lang.String r7 = "Data loss. Failed to serialize bundle. appId"
            java.lang.String r5 = r5.mo13724W1()     // Catch:{ all -> 0x0ccc }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r5)     // Catch:{ all -> 0x0ccc }
            r3.mo14617c(r7, r5, r6)     // Catch:{ all -> 0x0ccc }
        L_0x0c11:
            com.google.android.gms.measurement.internal.k r3 = r1.f14627c     // Catch:{ all -> 0x0ccc }
            m17935R(r3)     // Catch:{ all -> 0x0ccc }
            java.util.List r4 = r4.f14580b     // Catch:{ all -> 0x0ccc }
            p182n6.C7264i.m27902k(r4)     // Catch:{ all -> 0x0ccc }
            r3.mo14554h()     // Catch:{ all -> 0x0ccc }
            r3.mo14301i()     // Catch:{ all -> 0x0ccc }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x0ccc }
            r6 = 0
        L_0x0c29:
            int r7 = r4.size()     // Catch:{ all -> 0x0ccc }
            if (r6 >= r7) goto L_0x0c46
            if (r6 == 0) goto L_0x0c36
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x0ccc }
        L_0x0c36:
            java.lang.Object r7 = r4.get(r6)     // Catch:{ all -> 0x0ccc }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0ccc }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0ccc }
            r5.append(r7)     // Catch:{ all -> 0x0ccc }
            int r6 = r6 + 1
            goto L_0x0c29
        L_0x0c46:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0ccc }
            android.database.sqlite.SQLiteDatabase r6 = r3.mo14495P()     // Catch:{ all -> 0x0ccc }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0ccc }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x0ccc }
            int r6 = r4.size()     // Catch:{ all -> 0x0ccc }
            if (r5 == r6) goto L_0x0c7b
            com.google.android.gms.measurement.internal.t4 r3 = r3.f14613a     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo14551d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.n3 r3 = r3.mo14675r()     // Catch:{ all -> 0x0ccc }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0ccc }
            int r4 = r4.size()     // Catch:{ all -> 0x0ccc }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0ccc }
            r3.mo14617c(r6, r5, r4)     // Catch:{ all -> 0x0ccc }
        L_0x0c7b:
            com.google.android.gms.measurement.internal.k r3 = r1.f14627c     // Catch:{ all -> 0x0ccc }
            m17935R(r3)     // Catch:{ all -> 0x0ccc }
            android.database.sqlite.SQLiteDatabase r4 = r3.mo14495P()     // Catch:{ all -> 0x0ccc }
            java.lang.String r5 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0c93 }
            r7 = 0
            r6[r7] = r2     // Catch:{ SQLiteException -> 0x0c93 }
            r7 = 1
            r6[r7] = r2     // Catch:{ SQLiteException -> 0x0c93 }
            r4.execSQL(r5, r6)     // Catch:{ SQLiteException -> 0x0c93 }
            goto L_0x0ca8
        L_0x0c93:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.measurement.internal.t4 r3 = r3.f14613a     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo14551d()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.n3 r3 = r3.mo14675r()     // Catch:{ all -> 0x0ccc }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r2)     // Catch:{ all -> 0x0ccc }
            r3.mo14617c(r5, r2, r4)     // Catch:{ all -> 0x0ccc }
        L_0x0ca8:
            com.google.android.gms.measurement.internal.k r2 = r1.f14627c     // Catch:{ all -> 0x0ccc }
            m17935R(r2)     // Catch:{ all -> 0x0ccc }
            r2.mo14515o()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.k r2 = r1.f14627c
            m17935R(r2)
            r2.mo14510f0()
            r2 = 1
            return r2
        L_0x0cba:
            com.google.android.gms.measurement.internal.k r2 = r1.f14627c     // Catch:{ all -> 0x0ccc }
            m17935R(r2)     // Catch:{ all -> 0x0ccc }
            r2.mo14515o()     // Catch:{ all -> 0x0ccc }
            com.google.android.gms.measurement.internal.k r2 = r1.f14627c
            m17935R(r2)
            r2.mo14510f0()
            r2 = 0
            return r2
        L_0x0ccc:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.k r3 = r1.f14627c
            m17935R(r3)
            r3.mo14510f0()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4719m9.m17931N(java.lang.String, long):boolean");
    }

    /* renamed from: O */
    private final boolean m17932O() {
        mo14552f().mo14554h();
        mo14586g();
        C4687k kVar = this.f14627c;
        m17935R(kVar);
        if (kVar.mo14518r()) {
            return true;
        }
        C4687k kVar2 = this.f14627c;
        m17935R(kVar2);
        if (!TextUtils.isEmpty(kVar2.mo14504Z())) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    private final boolean m17933P(C4227i4 i4Var, C4227i4 i4Var2) {
        String str;
        C7264i.m27892a("_e".equals(i4Var.mo13240G()));
        m17935R(this.f14631g);
        C4312n4 n = C4741o9.m18058n((C4244j4) i4Var.mo13361l(), "_sc");
        String str2 = null;
        if (n == null) {
            str = null;
        } else {
            str = n.mo13397H();
        }
        m17935R(this.f14631g);
        C4312n4 n2 = C4741o9.m18058n((C4244j4) i4Var2.mo13361l(), "_pc");
        if (n2 != null) {
            str2 = n2.mo13397H();
        }
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        C7264i.m27892a("_e".equals(i4Var.mo13240G()));
        m17935R(this.f14631g);
        C4312n4 n3 = C4741o9.m18058n((C4244j4) i4Var.mo13361l(), "_et");
        if (n3 == null || !n3.mo13401W() || n3.mo13395D() <= 0) {
            return true;
        }
        long D = n3.mo13395D();
        m17935R(this.f14631g);
        C4312n4 n4 = C4741o9.m18058n((C4244j4) i4Var2.mo13361l(), "_et");
        if (n4 != null && n4.mo13395D() > 0) {
            D += n4.mo13395D();
        }
        m17935R(this.f14631g);
        C4741o9.m18056P(i4Var2, "_et", Long.valueOf(D));
        m17935R(this.f14631g);
        C4741o9.m18056P(i4Var, "_fr", 1L);
        return true;
    }

    /* renamed from: Q */
    private static final boolean m17934Q(zzq zzq) {
        return !TextUtils.isEmpty(zzq.f15118e) || !TextUtils.isEmpty(zzq.f15133t);
    }

    /* renamed from: R */
    private static final C4583a9 m17935R(C4583a9 a9Var) {
        if (a9Var == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (a9Var.mo14303k()) {
            return a9Var;
        } else {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(a9Var.getClass())));
        }
    }

    /* renamed from: f0 */
    public static C4719m9 m17937f0(Context context) {
        C7264i.m27902k(context);
        C7264i.m27902k(context.getApplicationContext());
        if (f14619F == null) {
            synchronized (C4719m9.class) {
                if (f14619F == null) {
                    f14619F = new C4719m9((C4730n9) C7264i.m27902k(new C4730n9(context)), (C4791t4) null);
                }
            }
        }
        return f14619F;
    }

    /* renamed from: k0 */
    static /* bridge */ /* synthetic */ void m17938k0(C4719m9 m9Var, C4730n9 n9Var) {
        m9Var.mo14552f().mo14554h();
        m9Var.f14635k = new C4648g4(m9Var);
        C4687k kVar = new C4687k(m9Var);
        kVar.mo14302j();
        m9Var.f14627c = kVar;
        m9Var.mo14575U().mo14420z((C4632f) C7264i.m27902k(m9Var.f14625a));
        C4674i8 i8Var = new C4674i8(m9Var);
        i8Var.mo14302j();
        m9Var.f14633i = i8Var;
        C4585b bVar = new C4585b(m9Var);
        bVar.mo14302j();
        m9Var.f14630f = bVar;
        C4837x6 x6Var = new C4837x6(m9Var);
        x6Var.mo14302j();
        m9Var.f14632h = x6Var;
        C4850y8 y8Var = new C4850y8(m9Var);
        y8Var.mo14302j();
        m9Var.f14629e = y8Var;
        m9Var.f14628d = new C4834x3(m9Var);
        if (m9Var.f14641q != m9Var.f14642r) {
            m9Var.mo14551d().mo14675r().mo14617c("Not all upload components initialized", Integer.valueOf(m9Var.f14641q), Integer.valueOf(m9Var.f14642r));
        }
        m9Var.f14637m = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo14567A(String str, C8245b bVar) {
        mo14552f().mo14554h();
        mo14586g();
        this.f14620A.put(str, bVar);
        C4687k kVar = this.f14627c;
        m17935R(kVar);
        C7264i.m27902k(str);
        C7264i.m27902k(bVar);
        kVar.mo14554h();
        kVar.mo14301i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", bVar.mo23433h());
        try {
            if (kVar.mo14495P().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                kVar.f14613a.mo14551d().mo14675r().mo14616b("Failed to insert/update consent setting (got -1). appId", C4746p3.m18094z(str));
            }
        } catch (SQLiteException e) {
            kVar.f14613a.mo14551d().mo14675r().mo14617c("Error storing consent setting. appId, error", C4746p3.m18094z(str), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo14568B(zzlj zzlj, zzq zzq) {
        long j;
        int i;
        zzlj zzlj2 = zzlj;
        zzq zzq2 = zzq;
        mo14552f().mo14554h();
        mo14586g();
        if (m17934Q(zzq)) {
            if (!zzq2.f15124k) {
                mo14573S(zzq2);
                return;
            }
            int p0 = mo14589h0().mo14825p0(zzlj2.f15108e);
            int i2 = 0;
            if (p0 != 0) {
                C4785s9 h0 = mo14589h0();
                String str = zzlj2.f15108e;
                mo14575U();
                String r = h0.mo14828r(str, 24, true);
                String str2 = zzlj2.f15108e;
                if (str2 != null) {
                    i = str2.length();
                } else {
                    i = 0;
                }
                mo14589h0().mo14795C(this.f14624E, zzq2.f15117d, p0, "_ev", r, i);
                return;
            }
            int l0 = mo14589h0().mo14819l0(zzlj2.f15108e, zzlj.mo14994v());
            if (l0 != 0) {
                C4785s9 h02 = mo14589h0();
                String str3 = zzlj2.f15108e;
                mo14575U();
                String r2 = h02.mo14828r(str3, 24, true);
                Object v = zzlj.mo14994v();
                if (v != null && ((v instanceof String) || (v instanceof CharSequence))) {
                    i2 = v.toString().length();
                }
                mo14589h0().mo14795C(this.f14624E, zzq2.f15117d, l0, "_ev", r2, i2);
                return;
            }
            Object p = mo14589h0().mo14824p(zzlj2.f15108e, zzlj.mo14994v());
            if (p != null) {
                if (NotificationMessage.NOTIF_KEY_SID.equals(zzlj2.f15108e)) {
                    long j2 = zzlj2.f15109f;
                    String str4 = zzlj2.f15112i;
                    String str5 = (String) C7264i.m27902k(zzq2.f15117d);
                    C4687k kVar = this.f14627c;
                    m17935R(kVar);
                    C4763q9 X = kVar.mo14502X(str5, "_sno");
                    if (X != null) {
                        Object obj = X.f14806e;
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                            mo14568B(new zzlj("_sno", j2, Long.valueOf(j + 1), str4), zzq2);
                        }
                    }
                    if (X != null) {
                        mo14551d().mo14680w().mo14616b("Retrieved last session number from database does not contain a valid (long) value", X.f14806e);
                    }
                    C4687k kVar2 = this.f14627c;
                    m17935R(kVar2);
                    C4753q V = kVar2.mo14501V(str5, "_s");
                    if (V != null) {
                        j = V.f14772c;
                        mo14551d().mo14679v().mo14616b("Backfill the session number. Last used session number", Long.valueOf(j));
                    } else {
                        j = 0;
                    }
                    mo14568B(new zzlj("_sno", j2, Long.valueOf(j + 1), str4), zzq2);
                }
                C4763q9 q9Var = new C4763q9((String) C7264i.m27902k(zzq2.f15117d), (String) C7264i.m27902k(zzlj2.f15112i), zzlj2.f15108e, zzlj2.f15109f, p);
                mo14551d().mo14679v().mo14617c("Setting user property", this.f14636l.mo14847D().mo14530f(q9Var.f14804c), p);
                C4687k kVar3 = this.f14627c;
                m17935R(kVar3);
                kVar3.mo14509e0();
                try {
                    if ("_id".equals(q9Var.f14804c)) {
                        C4687k kVar4 = this.f14627c;
                        m17935R(kVar4);
                        C4763q9 X2 = kVar4.mo14502X(zzq2.f15117d, "_id");
                        if (X2 != null && !q9Var.f14806e.equals(X2.f14806e)) {
                            C4687k kVar5 = this.f14627c;
                            m17935R(kVar5);
                            kVar5.mo14513m(zzq2.f15117d, "_lair");
                        }
                    }
                    mo14573S(zzq2);
                    C4687k kVar6 = this.f14627c;
                    m17935R(kVar6);
                    boolean x = kVar6.mo14524x(q9Var);
                    C4687k kVar7 = this.f14627c;
                    m17935R(kVar7);
                    kVar7.mo14515o();
                    if (!x) {
                        mo14551d().mo14675r().mo14617c("Too many unique user properties are set. Ignoring user property", this.f14636l.mo14847D().mo14530f(q9Var.f14804c), q9Var.f14806e);
                        mo14589h0().mo14795C(this.f14624E, zzq2.f15117d, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    C4687k kVar8 = this.f14627c;
                    m17935R(kVar8);
                    kVar8.mo14510f0();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:217|218) */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0211, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0212, code lost:
        r8.f14613a.mo14551d().mo14675r().mo14617c("Failed to merge queued bundle. appId", com.google.android.gms.measurement.internal.C4746p3.m18094z(r6), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x026b, code lost:
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:?, code lost:
        r0 = r0.subList(0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02fb, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02fc, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:?, code lost:
        mo14551d().mo14675r().mo14617c("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.C4746p3.m18094z(r6), r0.mo14313a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x050e, code lost:
        if (r3 != null) goto L_0x04eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0538, code lost:
        r1.f14645u = r2;
        m17928K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x053d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0126, code lost:
        if (r11 != null) goto L_0x0108;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:217:0x048c */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0294 A[SYNTHETIC, Splitter:B:142:0x0294] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x029d A[Catch:{ all -> 0x03cc, all -> 0x0533 }] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x04a7 A[Catch:{ all -> 0x03cc, all -> 0x0533 }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0518 A[Catch:{ all -> 0x03cc, all -> 0x0533 }] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x052f A[SYNTHETIC, Splitter:B:257:0x052f] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0130 A[Catch:{ all -> 0x012c, all -> 0x0536 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:170:0x0302=Splitter:B:170:0x0302, B:247:0x0512=Splitter:B:247:0x0512, B:129:0x0268=Splitter:B:129:0x0268, B:139:0x027b=Splitter:B:139:0x027b, B:231:0x04eb=Splitter:B:231:0x04eb, B:217:0x048c=Splitter:B:217:0x048c} */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14569C() {
        /*
            r22 = this;
            r1 = r22
            com.google.android.gms.measurement.internal.r4 r0 = r22.mo14552f()
            r0.mo14554h()
            r22.mo14586g()
            r2 = 1
            r1.f14645u = r2
            r3 = 0
            com.google.android.gms.measurement.internal.t4 r0 = r1.f14636l     // Catch:{ all -> 0x0536 }
            r0.mo14549b()     // Catch:{ all -> 0x0536 }
            com.google.android.gms.measurement.internal.t4 r0 = r1.f14636l     // Catch:{ all -> 0x0536 }
            com.google.android.gms.measurement.internal.f8 r0 = r0.mo14854L()     // Catch:{ all -> 0x0536 }
            java.lang.Boolean r0 = r0.mo14375J()     // Catch:{ all -> 0x0536 }
            if (r0 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.p3 r0 = r22.mo14551d()     // Catch:{ all -> 0x0536 }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14680w()     // Catch:{ all -> 0x0536 }
            java.lang.String r2 = "Upload data called on the client side before use of service was decided"
            r0.mo14615a(r2)     // Catch:{ all -> 0x0536 }
            r1.f14645u = r3
        L_0x0030:
            r22.m17928K()
            return
        L_0x0034:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0536 }
            if (r0 == 0) goto L_0x004a
            com.google.android.gms.measurement.internal.p3 r0 = r22.mo14551d()     // Catch:{ all -> 0x0536 }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14675r()     // Catch:{ all -> 0x0536 }
            java.lang.String r2 = "Upload called in the client side when service should be used"
            r0.mo14615a(r2)     // Catch:{ all -> 0x0536 }
            r1.f14645u = r3
            goto L_0x0030
        L_0x004a:
            long r4 = r1.f14639o     // Catch:{ all -> 0x0536 }
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0058
            r22.m17930M()     // Catch:{ all -> 0x0536 }
            r1.f14645u = r3
            goto L_0x0030
        L_0x0058:
            com.google.android.gms.measurement.internal.r4 r0 = r22.mo14552f()     // Catch:{ all -> 0x0536 }
            r0.mo14554h()     // Catch:{ all -> 0x0536 }
            java.util.List r0 = r1.f14648x     // Catch:{ all -> 0x0536 }
            if (r0 == 0) goto L_0x0073
            com.google.android.gms.measurement.internal.p3 r0 = r22.mo14551d()     // Catch:{ all -> 0x0536 }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14679v()     // Catch:{ all -> 0x0536 }
            java.lang.String r2 = "Uploading requested multiple times"
            r0.mo14615a(r2)     // Catch:{ all -> 0x0536 }
            r1.f14645u = r3
            goto L_0x0030
        L_0x0073:
            com.google.android.gms.measurement.internal.v3 r0 = r1.f14626b     // Catch:{ all -> 0x0536 }
            m17935R(r0)     // Catch:{ all -> 0x0536 }
            boolean r0 = r0.mo14935m()     // Catch:{ all -> 0x0536 }
            if (r0 != 0) goto L_0x0091
            com.google.android.gms.measurement.internal.p3 r0 = r22.mo14551d()     // Catch:{ all -> 0x0536 }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14679v()     // Catch:{ all -> 0x0536 }
            java.lang.String r2 = "Network not connected, ignoring upload request"
            r0.mo14615a(r2)     // Catch:{ all -> 0x0536 }
            r22.m17930M()     // Catch:{ all -> 0x0536 }
            r1.f14645u = r3
            goto L_0x0030
        L_0x0091:
            t6.f r0 = r22.mo14548a()     // Catch:{ all -> 0x0536 }
            long r4 = r0.mo23594a()     // Catch:{ all -> 0x0536 }
            com.google.android.gms.measurement.internal.g r0 = r22.mo14575U()     // Catch:{ all -> 0x0536 }
            com.google.android.gms.measurement.internal.e3 r8 = com.google.android.gms.measurement.internal.C4636f3.f14353T     // Catch:{ all -> 0x0536 }
            r9 = 0
            int r0 = r0.mo14409o(r9, r8)     // Catch:{ all -> 0x0536 }
            r22.mo14575U()     // Catch:{ all -> 0x0536 }
            long r10 = com.google.android.gms.measurement.internal.C4643g.m17722I()     // Catch:{ all -> 0x0536 }
            long r10 = r4 - r10
            r8 = r3
        L_0x00ae:
            if (r8 >= r0) goto L_0x00b9
            boolean r12 = r1.m17931N(r9, r10)     // Catch:{ all -> 0x0536 }
            if (r12 == 0) goto L_0x00b9
            int r8 = r8 + 1
            goto L_0x00ae
        L_0x00b9:
            com.google.android.gms.measurement.internal.i8 r0 = r1.f14633i     // Catch:{ all -> 0x0536 }
            com.google.android.gms.measurement.internal.a4 r0 = r0.f14523g     // Catch:{ all -> 0x0536 }
            long r10 = r0.mo14295a()     // Catch:{ all -> 0x0536 }
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00dc
            com.google.android.gms.measurement.internal.p3 r0 = r22.mo14551d()     // Catch:{ all -> 0x0536 }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14674q()     // Catch:{ all -> 0x0536 }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r4 - r10
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x0536 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0536 }
            r0.mo14616b(r6, r7)     // Catch:{ all -> 0x0536 }
        L_0x00dc:
            com.google.android.gms.measurement.internal.k r0 = r1.f14627c     // Catch:{ all -> 0x0536 }
            m17935R(r0)     // Catch:{ all -> 0x0536 }
            java.lang.String r6 = r0.mo14504Z()     // Catch:{ all -> 0x0536 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0536 }
            r7 = -1
            if (r0 != 0) goto L_0x04ab
            long r10 = r1.f14650z     // Catch:{ all -> 0x0536 }
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0134
            com.google.android.gms.measurement.internal.k r10 = r1.f14627c     // Catch:{ all -> 0x0536 }
            m17935R(r10)     // Catch:{ all -> 0x0536 }
            android.database.sqlite.SQLiteDatabase r0 = r10.mo14495P()     // Catch:{ SQLiteException -> 0x0115, all -> 0x0113 }
            java.lang.String r11 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r11 = r0.rawQuery(r11, r9)     // Catch:{ SQLiteException -> 0x0115, all -> 0x0113 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0111 }
            if (r0 != 0) goto L_0x010c
        L_0x0108:
            r11.close()     // Catch:{ all -> 0x0536 }
            goto L_0x0129
        L_0x010c:
            long r7 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x0111 }
            goto L_0x0108
        L_0x0111:
            r0 = move-exception
            goto L_0x0117
        L_0x0113:
            r0 = move-exception
            goto L_0x012e
        L_0x0115:
            r0 = move-exception
            r11 = r9
        L_0x0117:
            com.google.android.gms.measurement.internal.t4 r10 = r10.f14613a     // Catch:{ all -> 0x012c }
            com.google.android.gms.measurement.internal.p3 r10 = r10.mo14551d()     // Catch:{ all -> 0x012c }
            com.google.android.gms.measurement.internal.n3 r10 = r10.mo14675r()     // Catch:{ all -> 0x012c }
            java.lang.String r12 = "Error querying raw events"
            r10.mo14616b(r12, r0)     // Catch:{ all -> 0x012c }
            if (r11 == 0) goto L_0x0129
            goto L_0x0108
        L_0x0129:
            r1.f14650z = r7     // Catch:{ all -> 0x0536 }
            goto L_0x0134
        L_0x012c:
            r0 = move-exception
            r9 = r11
        L_0x012e:
            if (r9 == 0) goto L_0x0133
            r9.close()     // Catch:{ all -> 0x0536 }
        L_0x0133:
            throw r0     // Catch:{ all -> 0x0536 }
        L_0x0134:
            com.google.android.gms.measurement.internal.g r0 = r22.mo14575U()     // Catch:{ all -> 0x0536 }
            com.google.android.gms.measurement.internal.e3 r7 = com.google.android.gms.measurement.internal.C4636f3.f14376i     // Catch:{ all -> 0x0536 }
            int r0 = r0.mo14409o(r6, r7)     // Catch:{ all -> 0x0536 }
            com.google.android.gms.measurement.internal.g r7 = r22.mo14575U()     // Catch:{ all -> 0x0536 }
            com.google.android.gms.measurement.internal.e3 r8 = com.google.android.gms.measurement.internal.C4636f3.f14378j     // Catch:{ all -> 0x0536 }
            int r7 = r7.mo14409o(r6, r8)     // Catch:{ all -> 0x0536 }
            int r7 = java.lang.Math.max(r3, r7)     // Catch:{ all -> 0x0536 }
            com.google.android.gms.measurement.internal.k r8 = r1.f14627c     // Catch:{ all -> 0x0536 }
            m17935R(r8)     // Catch:{ all -> 0x0536 }
            r8.mo14554h()     // Catch:{ all -> 0x0536 }
            r8.mo14301i()     // Catch:{ all -> 0x0536 }
            if (r0 <= 0) goto L_0x015b
            r10 = r2
            goto L_0x015c
        L_0x015b:
            r10 = r3
        L_0x015c:
            p182n6.C7264i.m27892a(r10)     // Catch:{ all -> 0x0536 }
            if (r7 <= 0) goto L_0x0163
            r10 = r2
            goto L_0x0164
        L_0x0163:
            r10 = r3
        L_0x0164:
            p182n6.C7264i.m27892a(r10)     // Catch:{ all -> 0x0536 }
            p182n6.C7264i.m27898g(r6)     // Catch:{ all -> 0x0536 }
            android.database.sqlite.SQLiteDatabase r11 = r8.mo14495P()     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            java.lang.String r12 = "queue"
            java.lang.String r13 = "rowid"
            java.lang.String r14 = "data"
            java.lang.String r15 = "retry_count"
            java.lang.String[] r13 = new java.lang.String[]{r13, r14, r15}     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            java.lang.String r14 = "app_id=?"
            java.lang.String[] r15 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            r15[r3] = r6     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x026f }
            if (r0 != 0) goto L_0x019f
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x026f }
            r11.close()     // Catch:{ all -> 0x0536 }
            r20 = r4
            goto L_0x0297
        L_0x019f:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x026f }
            r12.<init>()     // Catch:{ SQLiteException -> 0x026f }
            r13 = r3
        L_0x01a5:
            long r14 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x026f }
            byte[] r0 = r11.getBlob(r2)     // Catch:{ IOException -> 0x0242 }
            com.google.android.gms.measurement.internal.m9 r9 = r8.f15082b     // Catch:{ IOException -> 0x0242 }
            com.google.android.gms.measurement.internal.o9 r9 = r9.f14631g     // Catch:{ IOException -> 0x0242 }
            m17935R(r9)     // Catch:{ IOException -> 0x0242 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x022d }
            r2.<init>(r0)     // Catch:{ IOException -> 0x022d }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x022d }
            r0.<init>(r2)     // Catch:{ IOException -> 0x022d }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x022d }
            r3.<init>()     // Catch:{ IOException -> 0x022d }
            r10 = 1024(0x400, float:1.435E-42)
            byte[] r10 = new byte[r10]     // Catch:{ IOException -> 0x022d }
            r20 = r4
        L_0x01c9:
            int r4 = r0.read(r10)     // Catch:{ IOException -> 0x022b }
            if (r4 > 0) goto L_0x0226
            r0.close()     // Catch:{ IOException -> 0x022b }
            r2.close()     // Catch:{ IOException -> 0x022b }
            byte[] r0 = r3.toByteArray()     // Catch:{ IOException -> 0x022b }
            boolean r2 = r12.isEmpty()     // Catch:{ SQLiteException -> 0x026d }
            if (r2 != 0) goto L_0x01e5
            int r2 = r0.length     // Catch:{ SQLiteException -> 0x026d }
            int r2 = r2 + r13
            if (r2 <= r7) goto L_0x01e5
            goto L_0x0268
        L_0x01e5:
            com.google.android.gms.internal.measurement.t4 r2 = com.google.android.gms.internal.measurement.C4431u4.m16847S1()     // Catch:{ IOException -> 0x0211 }
            com.google.android.gms.internal.measurement.qa r2 = com.google.android.gms.measurement.internal.C4741o9.m18052C(r2, r0)     // Catch:{ IOException -> 0x0211 }
            com.google.android.gms.internal.measurement.t4 r2 = (com.google.android.gms.internal.measurement.C4414t4) r2     // Catch:{ IOException -> 0x0211 }
            r3 = 2
            boolean r4 = r11.isNull(r3)     // Catch:{ SQLiteException -> 0x026d }
            if (r4 != 0) goto L_0x01fd
            int r4 = r11.getInt(r3)     // Catch:{ SQLiteException -> 0x026d }
            r2.mo13599Z(r4)     // Catch:{ SQLiteException -> 0x026d }
        L_0x01fd:
            int r0 = r0.length     // Catch:{ SQLiteException -> 0x026d }
            int r13 = r13 + r0
            com.google.android.gms.internal.measurement.p9 r0 = r2.mo13361l()     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.internal.measurement.u4 r0 = (com.google.android.gms.internal.measurement.C4431u4) r0     // Catch:{ SQLiteException -> 0x026d }
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteException -> 0x026d }
            android.util.Pair r0 = android.util.Pair.create(r0, r2)     // Catch:{ SQLiteException -> 0x026d }
            r12.add(r0)     // Catch:{ SQLiteException -> 0x026d }
            goto L_0x0258
        L_0x0211:
            r0 = move-exception
            com.google.android.gms.measurement.internal.t4 r2 = r8.f14613a     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo14551d()     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14675r()     // Catch:{ SQLiteException -> 0x026d }
            java.lang.String r3 = "Failed to merge queued bundle. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r6)     // Catch:{ SQLiteException -> 0x026d }
            r2.mo14617c(r3, r4, r0)     // Catch:{ SQLiteException -> 0x026d }
            goto L_0x0258
        L_0x0226:
            r5 = 0
            r3.write(r10, r5, r4)     // Catch:{ IOException -> 0x022b }
            goto L_0x01c9
        L_0x022b:
            r0 = move-exception
            goto L_0x0230
        L_0x022d:
            r0 = move-exception
            r20 = r4
        L_0x0230:
            com.google.android.gms.measurement.internal.t4 r2 = r9.f14613a     // Catch:{ IOException -> 0x0240 }
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo14551d()     // Catch:{ IOException -> 0x0240 }
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14675r()     // Catch:{ IOException -> 0x0240 }
            java.lang.String r3 = "Failed to ungzip content"
            r2.mo14616b(r3, r0)     // Catch:{ IOException -> 0x0240 }
            throw r0     // Catch:{ IOException -> 0x0240 }
        L_0x0240:
            r0 = move-exception
            goto L_0x0245
        L_0x0242:
            r0 = move-exception
            r20 = r4
        L_0x0245:
            com.google.android.gms.measurement.internal.t4 r2 = r8.f14613a     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo14551d()     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14675r()     // Catch:{ SQLiteException -> 0x026d }
            java.lang.String r3 = "Failed to unzip queued bundle. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r6)     // Catch:{ SQLiteException -> 0x026d }
            r2.mo14617c(r3, r4, r0)     // Catch:{ SQLiteException -> 0x026d }
        L_0x0258:
            boolean r0 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x026d }
            if (r0 == 0) goto L_0x0268
            if (r13 <= r7) goto L_0x0261
            goto L_0x0268
        L_0x0261:
            r4 = r20
            r2 = 1
            r3 = 0
            r9 = 0
            goto L_0x01a5
        L_0x0268:
            r11.close()     // Catch:{ all -> 0x0533 }
            r0 = r12
            goto L_0x0297
        L_0x026d:
            r0 = move-exception
            goto L_0x027b
        L_0x026f:
            r0 = move-exception
            r20 = r4
            goto L_0x027b
        L_0x0273:
            r0 = move-exception
            r9 = 0
            goto L_0x04a5
        L_0x0277:
            r0 = move-exception
            r20 = r4
            r11 = 0
        L_0x027b:
            com.google.android.gms.measurement.internal.t4 r2 = r8.f14613a     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo14551d()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14675r()     // Catch:{ all -> 0x04a3 }
            java.lang.String r3 = "Error querying bundles. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r6)     // Catch:{ all -> 0x04a3 }
            r2.mo14617c(r3, r4, r0)     // Catch:{ all -> 0x04a3 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x04a3 }
            if (r11 == 0) goto L_0x0297
            r11.close()     // Catch:{ all -> 0x0533 }
        L_0x0297:
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x0533 }
            if (r2 != 0) goto L_0x0526
            s7.b r2 = r1.mo14576V(r6)     // Catch:{ all -> 0x0533 }
            s7.a r3 = p248s7.C8243a.AD_STORAGE     // Catch:{ all -> 0x0533 }
            boolean r2 = r2.mo23435i(r3)     // Catch:{ all -> 0x0533 }
            if (r2 == 0) goto L_0x0302
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0533 }
        L_0x02ad:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0533 }
            if (r3 == 0) goto L_0x02cc
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0533 }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x0533 }
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x0533 }
            com.google.android.gms.internal.measurement.u4 r3 = (com.google.android.gms.internal.measurement.C4431u4) r3     // Catch:{ all -> 0x0533 }
            java.lang.String r4 = r3.mo13708K()     // Catch:{ all -> 0x0533 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0533 }
            if (r4 != 0) goto L_0x02ad
            java.lang.String r2 = r3.mo13708K()     // Catch:{ all -> 0x0533 }
            goto L_0x02cd
        L_0x02cc:
            r2 = 0
        L_0x02cd:
            if (r2 == 0) goto L_0x0302
            r3 = 0
        L_0x02d0:
            int r4 = r0.size()     // Catch:{ all -> 0x0533 }
            if (r3 >= r4) goto L_0x0302
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x0533 }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x0533 }
            java.lang.Object r4 = r4.first     // Catch:{ all -> 0x0533 }
            com.google.android.gms.internal.measurement.u4 r4 = (com.google.android.gms.internal.measurement.C4431u4) r4     // Catch:{ all -> 0x0533 }
            java.lang.String r5 = r4.mo13708K()     // Catch:{ all -> 0x0533 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0533 }
            if (r5 == 0) goto L_0x02eb
            goto L_0x02ff
        L_0x02eb:
            java.lang.String r4 = r4.mo13708K()     // Catch:{ all -> 0x0533 }
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0533 }
            if (r4 != 0) goto L_0x02ff
            r4 = 0
            java.util.List r0 = r0.subList(r4, r3)     // Catch:{ all -> 0x02fb }
            goto L_0x0302
        L_0x02fb:
            r0 = move-exception
            r2 = r4
            goto L_0x0538
        L_0x02ff:
            int r3 = r3 + 1
            goto L_0x02d0
        L_0x0302:
            com.google.android.gms.internal.measurement.r4 r2 = com.google.android.gms.internal.measurement.C4397s4.m16624A()     // Catch:{ all -> 0x0533 }
            int r3 = r0.size()     // Catch:{ all -> 0x0533 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0533 }
            int r5 = r0.size()     // Catch:{ all -> 0x0533 }
            r4.<init>(r5)     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.g r5 = r22.mo14575U()     // Catch:{ all -> 0x0533 }
            boolean r5 = r5.mo14399C(r6)     // Catch:{ all -> 0x0533 }
            if (r5 == 0) goto L_0x032b
            s7.b r5 = r1.mo14576V(r6)     // Catch:{ all -> 0x0533 }
            s7.a r7 = p248s7.C8243a.AD_STORAGE     // Catch:{ all -> 0x0533 }
            boolean r5 = r5.mo23435i(r7)     // Catch:{ all -> 0x0533 }
            if (r5 == 0) goto L_0x032b
            r5 = 1
            goto L_0x032c
        L_0x032b:
            r5 = 0
        L_0x032c:
            s7.b r7 = r1.mo14576V(r6)     // Catch:{ all -> 0x0533 }
            s7.a r8 = p248s7.C8243a.AD_STORAGE     // Catch:{ all -> 0x0533 }
            boolean r7 = r7.mo23435i(r8)     // Catch:{ all -> 0x0533 }
            s7.b r8 = r1.mo14576V(r6)     // Catch:{ all -> 0x0533 }
            s7.a r9 = p248s7.C8243a.ANALYTICS_STORAGE     // Catch:{ all -> 0x0533 }
            boolean r8 = r8.mo23435i(r9)     // Catch:{ all -> 0x0533 }
            com.google.android.gms.internal.measurement.C4356pe.m16469c()     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.g r9 = r22.mo14575U()     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.e3 r10 = com.google.android.gms.measurement.internal.C4636f3.f14393q0     // Catch:{ all -> 0x0533 }
            boolean r9 = r9.mo14398B(r6, r10)     // Catch:{ all -> 0x0533 }
            r10 = 0
        L_0x034e:
            if (r10 >= r3) goto L_0x03d0
            java.lang.Object r11 = r0.get(r10)     // Catch:{ all -> 0x0533 }
            android.util.Pair r11 = (android.util.Pair) r11     // Catch:{ all -> 0x0533 }
            java.lang.Object r11 = r11.first     // Catch:{ all -> 0x0533 }
            com.google.android.gms.internal.measurement.u4 r11 = (com.google.android.gms.internal.measurement.C4431u4) r11     // Catch:{ all -> 0x0533 }
            com.google.android.gms.internal.measurement.m9 r11 = r11.mo13472j()     // Catch:{ all -> 0x0533 }
            com.google.android.gms.internal.measurement.t4 r11 = (com.google.android.gms.internal.measurement.C4414t4) r11     // Catch:{ all -> 0x0533 }
            java.lang.Object r12 = r0.get(r10)     // Catch:{ all -> 0x0533 }
            android.util.Pair r12 = (android.util.Pair) r12     // Catch:{ all -> 0x0533 }
            java.lang.Object r12 = r12.second     // Catch:{ all -> 0x0533 }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x0533 }
            r4.add(r12)     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.g r12 = r22.mo14575U()     // Catch:{ all -> 0x0533 }
            r12.mo14411q()     // Catch:{ all -> 0x0533 }
            r12 = 77000(0x12cc8, double:3.8043E-319)
            r11.mo13606h0(r12)     // Catch:{ all -> 0x0533 }
            r12 = r20
            r11.mo13605g0(r12)     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.t4 r14 = r1.f14636l     // Catch:{ all -> 0x0533 }
            r14.mo14549b()     // Catch:{ all -> 0x0533 }
            r14 = 0
            r11.mo13600a0(r14)     // Catch:{ all -> 0x03cc }
            if (r5 != 0) goto L_0x038d
            r11.mo13573H0()     // Catch:{ all -> 0x0533 }
        L_0x038d:
            if (r7 != 0) goto L_0x0395
            r11.mo13587O0()     // Catch:{ all -> 0x0533 }
            r11.mo13579K0()     // Catch:{ all -> 0x0533 }
        L_0x0395:
            if (r8 != 0) goto L_0x039a
            r11.mo13567E0()     // Catch:{ all -> 0x0533 }
        L_0x039a:
            r1.mo14588h(r6, r11)     // Catch:{ all -> 0x0533 }
            if (r9 != 0) goto L_0x03a2
            r11.mo13589P0()     // Catch:{ all -> 0x0533 }
        L_0x03a2:
            com.google.android.gms.measurement.internal.g r14 = r22.mo14575U()     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.e3 r15 = com.google.android.gms.measurement.internal.C4636f3.f14357X     // Catch:{ all -> 0x0533 }
            boolean r14 = r14.mo14398B(r6, r15)     // Catch:{ all -> 0x0533 }
            if (r14 == 0) goto L_0x03c4
            com.google.android.gms.internal.measurement.p9 r14 = r11.mo13361l()     // Catch:{ all -> 0x0533 }
            com.google.android.gms.internal.measurement.u4 r14 = (com.google.android.gms.internal.measurement.C4431u4) r14     // Catch:{ all -> 0x0533 }
            byte[] r14 = r14.mo13041g()     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.o9 r15 = r1.f14631g     // Catch:{ all -> 0x0533 }
            m17935R(r15)     // Catch:{ all -> 0x0533 }
            long r14 = r15.mo14667x(r14)     // Catch:{ all -> 0x0533 }
            r11.mo13560B(r14)     // Catch:{ all -> 0x0533 }
        L_0x03c4:
            r2.mo13516p(r11)     // Catch:{ all -> 0x0533 }
            int r10 = r10 + 1
            r20 = r12
            goto L_0x034e
        L_0x03cc:
            r0 = move-exception
            r2 = r14
            goto L_0x0538
        L_0x03d0:
            r12 = r20
            com.google.android.gms.measurement.internal.p3 r0 = r22.mo14551d()     // Catch:{ all -> 0x0533 }
            java.lang.String r0 = r0.mo14672D()     // Catch:{ all -> 0x0533 }
            r5 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r5)     // Catch:{ all -> 0x0533 }
            if (r0 == 0) goto L_0x03f1
            com.google.android.gms.measurement.internal.o9 r0 = r1.f14631g     // Catch:{ all -> 0x0533 }
            m17935R(r0)     // Catch:{ all -> 0x0533 }
            com.google.android.gms.internal.measurement.p9 r5 = r2.mo13361l()     // Catch:{ all -> 0x0533 }
            com.google.android.gms.internal.measurement.s4 r5 = (com.google.android.gms.internal.measurement.C4397s4) r5     // Catch:{ all -> 0x0533 }
            java.lang.String r9 = r0.mo14658D(r5)     // Catch:{ all -> 0x0533 }
            goto L_0x03f2
        L_0x03f1:
            r9 = 0
        L_0x03f2:
            com.google.android.gms.measurement.internal.o9 r0 = r1.f14631g     // Catch:{ all -> 0x0533 }
            m17935R(r0)     // Catch:{ all -> 0x0533 }
            com.google.android.gms.internal.measurement.p9 r0 = r2.mo13361l()     // Catch:{ all -> 0x0533 }
            com.google.android.gms.internal.measurement.s4 r0 = (com.google.android.gms.internal.measurement.C4397s4) r0     // Catch:{ all -> 0x0533 }
            byte[] r14 = r0.mo13041g()     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.c9 r0 = r1.f14634j     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.b9 r0 = r0.mo14325i(r6)     // Catch:{ all -> 0x0533 }
            boolean r5 = r4.isEmpty()     // Catch:{ MalformedURLException -> 0x048c }
            r7 = 1
            r5 = r5 ^ r7
            p182n6.C7264i.m27892a(r5)     // Catch:{ MalformedURLException -> 0x048c }
            java.util.List r5 = r1.f14648x     // Catch:{ MalformedURLException -> 0x048c }
            if (r5 == 0) goto L_0x0422
            com.google.android.gms.measurement.internal.p3 r4 = r22.mo14551d()     // Catch:{ MalformedURLException -> 0x048c }
            com.google.android.gms.measurement.internal.n3 r4 = r4.mo14675r()     // Catch:{ MalformedURLException -> 0x048c }
            java.lang.String r5 = "Set uploading progress before finishing the previous upload"
            r4.mo14615a(r5)     // Catch:{ MalformedURLException -> 0x048c }
            goto L_0x0429
        L_0x0422:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x048c }
            r5.<init>(r4)     // Catch:{ MalformedURLException -> 0x048c }
            r1.f14648x = r5     // Catch:{ MalformedURLException -> 0x048c }
        L_0x0429:
            com.google.android.gms.measurement.internal.i8 r4 = r1.f14633i     // Catch:{ MalformedURLException -> 0x048c }
            com.google.android.gms.measurement.internal.a4 r4 = r4.f14524h     // Catch:{ MalformedURLException -> 0x048c }
            r4.mo14296b(r12)     // Catch:{ MalformedURLException -> 0x048c }
            java.lang.String r4 = "?"
            if (r3 <= 0) goto L_0x043d
            r3 = 0
            com.google.android.gms.internal.measurement.u4 r2 = r2.mo13517q(r3)     // Catch:{  }
            java.lang.String r4 = r2.mo13724W1()     // Catch:{ MalformedURLException -> 0x048c }
        L_0x043d:
            com.google.android.gms.measurement.internal.p3 r2 = r22.mo14551d()     // Catch:{ MalformedURLException -> 0x048c }
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14679v()     // Catch:{ MalformedURLException -> 0x048c }
            java.lang.String r3 = "Uploading data. app, uncompressed size, data"
            int r5 = r14.length     // Catch:{ MalformedURLException -> 0x048c }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ MalformedURLException -> 0x048c }
            r2.mo14618d(r3, r4, r5, r9)     // Catch:{ MalformedURLException -> 0x048c }
            r2 = 1
            r1.f14644t = r2     // Catch:{ MalformedURLException -> 0x048c }
            com.google.android.gms.measurement.internal.v3 r11 = r1.f14626b     // Catch:{ MalformedURLException -> 0x048c }
            m17935R(r11)     // Catch:{ MalformedURLException -> 0x048c }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x048c }
            java.lang.String r2 = r0.mo14313a()     // Catch:{ MalformedURLException -> 0x048c }
            r13.<init>(r2)     // Catch:{ MalformedURLException -> 0x048c }
            java.util.Map r15 = r0.mo14314b()     // Catch:{ MalformedURLException -> 0x048c }
            com.google.android.gms.measurement.internal.e9 r2 = new com.google.android.gms.measurement.internal.e9     // Catch:{ MalformedURLException -> 0x048c }
            r2.<init>(r1, r6)     // Catch:{ MalformedURLException -> 0x048c }
            r11.mo14554h()     // Catch:{ MalformedURLException -> 0x048c }
            r11.mo14301i()     // Catch:{ MalformedURLException -> 0x048c }
            p182n6.C7264i.m27902k(r13)     // Catch:{ MalformedURLException -> 0x048c }
            p182n6.C7264i.m27902k(r14)     // Catch:{ MalformedURLException -> 0x048c }
            p182n6.C7264i.m27902k(r2)     // Catch:{ MalformedURLException -> 0x048c }
            com.google.android.gms.measurement.internal.t4 r3 = r11.f14613a     // Catch:{ MalformedURLException -> 0x048c }
            com.google.android.gms.measurement.internal.r4 r3 = r3.mo14552f()     // Catch:{ MalformedURLException -> 0x048c }
            com.google.android.gms.measurement.internal.t3 r4 = new com.google.android.gms.measurement.internal.t3     // Catch:{ MalformedURLException -> 0x048c }
            r10 = r4
            r12 = r6
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x048c }
            r3.mo14775y(r4)     // Catch:{ MalformedURLException -> 0x048c }
            goto L_0x0526
        L_0x048c:
            com.google.android.gms.measurement.internal.p3 r2 = r22.mo14551d()     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14675r()     // Catch:{ all -> 0x0533 }
            java.lang.String r3 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r6)     // Catch:{ all -> 0x0533 }
            java.lang.String r0 = r0.mo14313a()     // Catch:{ all -> 0x0533 }
            r2.mo14617c(r3, r4, r0)     // Catch:{ all -> 0x0533 }
            goto L_0x0526
        L_0x04a3:
            r0 = move-exception
            r9 = r11
        L_0x04a5:
            if (r9 == 0) goto L_0x04aa
            r9.close()     // Catch:{ all -> 0x0533 }
        L_0x04aa:
            throw r0     // Catch:{ all -> 0x0533 }
        L_0x04ab:
            r12 = r4
            r1.f14650z = r7     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.k r2 = r1.f14627c     // Catch:{ all -> 0x0533 }
            m17935R(r2)     // Catch:{ all -> 0x0533 }
            r22.mo14575U()     // Catch:{ all -> 0x0533 }
            long r3 = com.google.android.gms.measurement.internal.C4643g.m17722I()     // Catch:{ all -> 0x0533 }
            long r4 = r12 - r3
            r2.mo14554h()     // Catch:{ all -> 0x0533 }
            r2.mo14301i()     // Catch:{ all -> 0x0533 }
            android.database.sqlite.SQLiteDatabase r0 = r2.mo14495P()     // Catch:{ SQLiteException -> 0x04fd, all -> 0x04fa }
            java.lang.String r3 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x04fd, all -> 0x04fa }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ SQLiteException -> 0x04fd, all -> 0x04fa }
            r5 = 0
            r6[r5] = r4     // Catch:{ SQLiteException -> 0x04fd, all -> 0x04fa }
            android.database.Cursor r3 = r0.rawQuery(r3, r6)     // Catch:{ SQLiteException -> 0x04fd, all -> 0x04fa }
            boolean r0 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x04f8 }
            if (r0 != 0) goto L_0x04ef
            com.google.android.gms.measurement.internal.t4 r0 = r2.f14613a     // Catch:{ SQLiteException -> 0x04f8 }
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()     // Catch:{ SQLiteException -> 0x04f8 }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14679v()     // Catch:{ SQLiteException -> 0x04f8 }
            java.lang.String r4 = "No expired configs for apps with pending events"
            r0.mo14615a(r4)     // Catch:{ SQLiteException -> 0x04f8 }
        L_0x04eb:
            r3.close()     // Catch:{ all -> 0x0533 }
            goto L_0x0511
        L_0x04ef:
            r4 = 0
            java.lang.String r9 = r3.getString(r4)     // Catch:{ SQLiteException -> 0x04f8 }
            r3.close()     // Catch:{ all -> 0x0533 }
            goto L_0x0512
        L_0x04f8:
            r0 = move-exception
            goto L_0x04ff
        L_0x04fa:
            r0 = move-exception
            r9 = 0
            goto L_0x052d
        L_0x04fd:
            r0 = move-exception
            r3 = 0
        L_0x04ff:
            com.google.android.gms.measurement.internal.t4 r2 = r2.f14613a     // Catch:{ all -> 0x052b }
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo14551d()     // Catch:{ all -> 0x052b }
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14675r()     // Catch:{ all -> 0x052b }
            java.lang.String r4 = "Error selecting expired configs"
            r2.mo14616b(r4, r0)     // Catch:{ all -> 0x052b }
            if (r3 == 0) goto L_0x0511
            goto L_0x04eb
        L_0x0511:
            r9 = 0
        L_0x0512:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0533 }
            if (r0 != 0) goto L_0x0526
            com.google.android.gms.measurement.internal.k r0 = r1.f14627c     // Catch:{ all -> 0x0533 }
            m17935R(r0)     // Catch:{ all -> 0x0533 }
            com.google.android.gms.measurement.internal.p5 r0 = r0.mo14497R(r9)     // Catch:{ all -> 0x0533 }
            if (r0 == 0) goto L_0x0526
            r1.mo14590i(r0)     // Catch:{ all -> 0x0533 }
        L_0x0526:
            r2 = 0
            r1.f14645u = r2
            goto L_0x0030
        L_0x052b:
            r0 = move-exception
            r9 = r3
        L_0x052d:
            if (r9 == 0) goto L_0x0532
            r9.close()     // Catch:{ all -> 0x0533 }
        L_0x0532:
            throw r0     // Catch:{ all -> 0x0533 }
        L_0x0533:
            r0 = move-exception
            r2 = 0
            goto L_0x0538
        L_0x0536:
            r0 = move-exception
            r2 = r3
        L_0x0538:
            r1.f14645u = r2
            r22.m17928K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4719m9.mo14569C():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x07cf, code lost:
        if (r14.isEmpty() != false) goto L_0x07d1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x033f A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0382 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0385 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03e4 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0573 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x05b3 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x062c A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0677 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0684 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0691 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x06c9 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x06da A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x071b A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0742 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0747 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x074d A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x07d4 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x081a A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0869 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0876 A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x088f A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x091b A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x093b A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x09cd A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0a7c A[Catch:{ SQLiteException -> 0x0a97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0a92  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x09df A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01ce A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01e7 A[SYNTHETIC, Splitter:B:55:0x01e7] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x024b A[SYNTHETIC, Splitter:B:69:0x024b] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x025b A[Catch:{ NumberFormatException -> 0x07b9, all -> 0x0b13 }] */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14570D(com.google.android.gms.measurement.internal.zzaw r36, com.google.android.gms.measurement.internal.zzq r37) {
        /*
            r35 = this;
            r1 = r35
            r2 = r36
            r3 = r37
            java.lang.String r4 = "metadata_fingerprint"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "raw_events"
            java.lang.String r7 = "_sno"
            p182n6.C7264i.m27902k(r37)
            java.lang.String r8 = r3.f15117d
            p182n6.C7264i.m27898g(r8)
            long r8 = java.lang.System.nanoTime()
            com.google.android.gms.measurement.internal.r4 r10 = r35.mo14552f()
            r10.mo14554h()
            r35.mo14586g()
            java.lang.String r10 = r3.f15117d
            com.google.android.gms.measurement.internal.o9 r11 = r1.f14631g
            m17935R(r11)
            boolean r11 = com.google.android.gms.measurement.internal.C4741o9.m18057m(r36, r37)
            if (r11 != 0) goto L_0x0032
            return
        L_0x0032:
            boolean r11 = r3.f15124k
            if (r11 == 0) goto L_0x0b1e
            com.google.android.gms.measurement.internal.n4 r11 = r1.f14625a
            m17935R(r11)
            java.lang.String r12 = r2.f15103d
            boolean r11 = r11.mo14624F(r10, r12)
            java.lang.String r15 = "_err"
            r14 = 0
            if (r11 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.p3 r3 = r35.mo14551d()
            com.google.android.gms.measurement.internal.n3 r3 = r3.mo14680w()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r10)
            com.google.android.gms.measurement.internal.t4 r5 = r1.f14636l
            com.google.android.gms.measurement.internal.k3 r5 = r5.mo14847D()
            java.lang.String r6 = r2.f15103d
            java.lang.String r5 = r5.mo14528d(r6)
            java.lang.String r6 = "Dropping blocked event. appId"
            r3.mo14617c(r6, r4, r5)
            com.google.android.gms.measurement.internal.n4 r3 = r1.f14625a
            m17935R(r3)
            boolean r3 = r3.mo14622D(r10)
            if (r3 != 0) goto L_0x0097
            com.google.android.gms.measurement.internal.n4 r3 = r1.f14625a
            m17935R(r3)
            boolean r3 = r3.mo14625G(r10)
            if (r3 == 0) goto L_0x007a
            goto L_0x0097
        L_0x007a:
            java.lang.String r3 = r2.f15103d
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x00de
            com.google.android.gms.measurement.internal.s9 r11 = r35.mo14589h0()
            com.google.android.gms.measurement.internal.r9 r12 = r1.f14624E
            java.lang.String r2 = r2.f15103d
            r14 = 11
            java.lang.String r15 = "_ev"
            r17 = 0
            r13 = r10
            r16 = r2
            r11.mo14795C(r12, r13, r14, r15, r16, r17)
            return
        L_0x0097:
            com.google.android.gms.measurement.internal.k r2 = r1.f14627c
            m17935R(r2)
            com.google.android.gms.measurement.internal.p5 r2 = r2.mo14497R(r10)
            if (r2 == 0) goto L_0x00de
            long r3 = r2.mo14710Z()
            long r5 = r2.mo14701Q()
            long r3 = java.lang.Math.max(r3, r5)
            t6.f r5 = r35.mo14548a()
            long r5 = r5.mo23594a()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            r35.mo14575U()
            com.google.android.gms.measurement.internal.e3 r5 = com.google.android.gms.measurement.internal.C4636f3.f14326B
            java.lang.Object r5 = r5.mo14346a(r14)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00de
            com.google.android.gms.measurement.internal.p3 r3 = r35.mo14551d()
            com.google.android.gms.measurement.internal.n3 r3 = r3.mo14674q()
            java.lang.String r4 = "Fetching config for blocked app"
            r3.mo14615a(r4)
            r1.mo14590i(r2)
        L_0x00de:
            return
        L_0x00df:
            com.google.android.gms.measurement.internal.q3 r2 = com.google.android.gms.measurement.internal.C4757q3.m18181b(r36)
            com.google.android.gms.measurement.internal.s9 r11 = r35.mo14589h0()
            com.google.android.gms.measurement.internal.g r12 = r35.mo14575U()
            int r12 = r12.mo14408n(r10)
            r11.mo14794B(r2, r12)
            com.google.android.gms.internal.measurement.C4270kd.m16205c()
            com.google.android.gms.measurement.internal.g r11 = r35.mo14575U()
            com.google.android.gms.measurement.internal.e3 r12 = com.google.android.gms.measurement.internal.C4636f3.f14329C0
            boolean r11 = r11.mo14398B(r14, r12)
            if (r11 == 0) goto L_0x0110
            com.google.android.gms.measurement.internal.g r11 = r35.mo14575U()
            com.google.android.gms.measurement.internal.e3 r12 = com.google.android.gms.measurement.internal.C4636f3.f14352S
            r13 = 10
            r14 = 35
            int r11 = r11.mo14410p(r10, r12, r13, r14)
            goto L_0x0111
        L_0x0110:
            r11 = 0
        L_0x0111:
            java.util.TreeSet r12 = new java.util.TreeSet
            android.os.Bundle r13 = r2.f14787d
            java.util.Set r13 = r13.keySet()
            r12.<init>(r13)
            java.util.Iterator r12 = r12.iterator()
        L_0x0120:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x015c
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r14 = "items"
            boolean r14 = r14.equals(r13)
            if (r14 == 0) goto L_0x0120
            com.google.android.gms.measurement.internal.s9 r14 = r35.mo14589h0()
            r17 = r12
            android.os.Bundle r12 = r2.f14787d
            android.os.Parcelable[] r12 = r12.getParcelableArray(r13)
            com.google.android.gms.internal.measurement.C4270kd.m16205c()
            com.google.android.gms.measurement.internal.g r13 = r35.mo14575U()
            r18 = r15
            com.google.android.gms.measurement.internal.e3 r15 = com.google.android.gms.measurement.internal.C4636f3.f14329C0
            r28 = r8
            r8 = 0
            boolean r9 = r13.mo14398B(r8, r15)
            r14.mo14793A(r12, r11, r9)
            r12 = r17
            r15 = r18
            r8 = r28
            goto L_0x0120
        L_0x015c:
            r28 = r8
            r18 = r15
            com.google.android.gms.measurement.internal.zzaw r2 = r2.mo14758a()
            com.google.android.gms.measurement.internal.p3 r8 = r35.mo14551d()
            java.lang.String r8 = r8.mo14672D()
            r9 = 2
            boolean r8 = android.util.Log.isLoggable(r8, r9)
            if (r8 == 0) goto L_0x018a
            com.google.android.gms.measurement.internal.p3 r8 = r35.mo14551d()
            com.google.android.gms.measurement.internal.n3 r8 = r8.mo14679v()
            com.google.android.gms.measurement.internal.t4 r11 = r1.f14636l
            com.google.android.gms.measurement.internal.k3 r11 = r11.mo14847D()
            java.lang.String r11 = r11.mo14527c(r2)
            java.lang.String r12 = "Logging event"
            r8.mo14616b(r12, r11)
        L_0x018a:
            com.google.android.gms.internal.measurement.C4219hd.m16049c()
            com.google.android.gms.measurement.internal.g r8 = r35.mo14575U()
            com.google.android.gms.measurement.internal.e3 r11 = com.google.android.gms.measurement.internal.C4636f3.f14411z0
            r14 = 0
            r8.mo14398B(r14, r11)
            com.google.android.gms.measurement.internal.k r8 = r1.f14627c
            m17935R(r8)
            r8.mo14509e0()
            r1.mo14573S(r3)     // Catch:{ all -> 0x0b13 }
            java.lang.String r8 = "ecommerce_purchase"
            java.lang.String r11 = r2.f15103d     // Catch:{ all -> 0x0b13 }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0b13 }
            java.lang.String r11 = "refund"
            if (r8 != 0) goto L_0x01c3
            java.lang.String r8 = "purchase"
            java.lang.String r12 = r2.f15103d     // Catch:{ all -> 0x0b13 }
            boolean r8 = r8.equals(r12)     // Catch:{ all -> 0x0b13 }
            if (r8 != 0) goto L_0x01c3
            java.lang.String r8 = r2.f15103d     // Catch:{ all -> 0x0b13 }
            boolean r8 = r11.equals(r8)     // Catch:{ all -> 0x0b13 }
            if (r8 == 0) goto L_0x01c1
            goto L_0x01c3
        L_0x01c1:
            r8 = 0
            goto L_0x01c4
        L_0x01c3:
            r8 = 1
        L_0x01c4:
            java.lang.String r12 = "_iap"
            java.lang.String r13 = r2.f15103d     // Catch:{ all -> 0x0b13 }
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x0b13 }
            if (r12 != 0) goto L_0x01db
            if (r8 == 0) goto L_0x01d2
            r8 = 1
            goto L_0x01db
        L_0x01d2:
            r32 = r4
            r33 = r5
            r4 = r18
            r5 = 1
            goto L_0x036f
        L_0x01db:
            com.google.android.gms.measurement.internal.zzau r12 = r2.f15104e     // Catch:{ all -> 0x0b13 }
            java.lang.String r13 = "currency"
            java.lang.String r12 = r12.mo14987s0(r13)     // Catch:{ all -> 0x0b13 }
            java.lang.String r13 = "value"
            if (r8 == 0) goto L_0x024b
            com.google.android.gms.measurement.internal.zzau r8 = r2.f15104e     // Catch:{ all -> 0x0b13 }
            java.lang.Double r8 = r8.mo14983R(r13)     // Catch:{ all -> 0x0b13 }
            double r16 = r8.doubleValue()     // Catch:{ all -> 0x0b13 }
            r19 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r16 = r16 * r19
            r21 = 0
            int r8 = (r16 > r21 ? 1 : (r16 == r21 ? 0 : -1))
            if (r8 != 0) goto L_0x020b
            com.google.android.gms.measurement.internal.zzau r8 = r2.f15104e     // Catch:{ all -> 0x0b13 }
            java.lang.Long r8 = r8.mo14984f0(r13)     // Catch:{ all -> 0x0b13 }
            long r14 = r8.longValue()     // Catch:{ all -> 0x0b13 }
            double r13 = (double) r14     // Catch:{ all -> 0x0b13 }
            double r16 = r13 * r19
        L_0x020b:
            r13 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r8 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r8 > 0) goto L_0x0225
            r13 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r8 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r8 < 0) goto L_0x0225
            long r13 = java.lang.Math.round(r16)     // Catch:{ all -> 0x0b13 }
            java.lang.String r8 = r2.f15103d     // Catch:{ all -> 0x0b13 }
            boolean r8 = r11.equals(r8)     // Catch:{ all -> 0x0b13 }
            if (r8 == 0) goto L_0x0255
            long r13 = -r13
            goto L_0x0255
        L_0x0225:
            com.google.android.gms.measurement.internal.p3 r2 = r35.mo14551d()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14680w()     // Catch:{ all -> 0x0b13 }
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r10)     // Catch:{ all -> 0x0b13 }
            java.lang.Double r5 = java.lang.Double.valueOf(r16)     // Catch:{ all -> 0x0b13 }
            r2.mo14617c(r3, r4, r5)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.k r2 = r1.f14627c     // Catch:{ all -> 0x0b13 }
            m17935R(r2)     // Catch:{ all -> 0x0b13 }
            r2.mo14515o()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.k r2 = r1.f14627c
            m17935R(r2)
            r2.mo14510f0()
            return
        L_0x024b:
            com.google.android.gms.measurement.internal.zzau r8 = r2.f15104e     // Catch:{ all -> 0x0b13 }
            java.lang.Long r8 = r8.mo14984f0(r13)     // Catch:{ all -> 0x0b13 }
            long r13 = r8.longValue()     // Catch:{ all -> 0x0b13 }
        L_0x0255:
            boolean r8 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0b13 }
            if (r8 != 0) goto L_0x01d2
            java.util.Locale r8 = java.util.Locale.US     // Catch:{ all -> 0x0b13 }
            java.lang.String r8 = r12.toUpperCase(r8)     // Catch:{ all -> 0x0b13 }
            java.lang.String r11 = "[A-Z]{3}"
            boolean r11 = r8.matches(r11)     // Catch:{ all -> 0x0b13 }
            if (r11 == 0) goto L_0x01d2
            java.lang.String r11 = "_ltv_"
            java.lang.String r8 = r11.concat(r8)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.k r11 = r1.f14627c     // Catch:{ all -> 0x0b13 }
            m17935R(r11)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.q9 r11 = r11.mo14502X(r10, r8)     // Catch:{ all -> 0x0b13 }
            if (r11 == 0) goto L_0x02b3
            java.lang.Object r11 = r11.f14806e     // Catch:{ all -> 0x0b13 }
            boolean r12 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0b13 }
            if (r12 != 0) goto L_0x0281
            goto L_0x02b3
        L_0x0281:
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0b13 }
            long r11 = r11.longValue()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.q9 r19 = new com.google.android.gms.measurement.internal.q9     // Catch:{ all -> 0x0b13 }
            java.lang.String r15 = r2.f15105f     // Catch:{ all -> 0x0b13 }
            t6.f r16 = r35.mo14548a()     // Catch:{ all -> 0x0b13 }
            long r16 = r16.mo23594a()     // Catch:{ all -> 0x0b13 }
            long r11 = r11 + r13
            java.lang.Long r20 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0b13 }
            r11 = r19
            r12 = r10
            r14 = 0
            r13 = r15
            r9 = r14
            r15 = 0
            r14 = r8
            r8 = r18
            r15 = r16
            r17 = r20
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0b13 }
            r32 = r4
            r33 = r5
            r4 = r8
            r8 = r19
            r5 = 1
            goto L_0x0334
        L_0x02b3:
            r15 = r18
            r9 = 0
            com.google.android.gms.measurement.internal.k r11 = r1.f14627c     // Catch:{ all -> 0x0b13 }
            m17935R(r11)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g r12 = r35.mo14575U()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.e3 r9 = com.google.android.gms.measurement.internal.C4636f3.f14336G     // Catch:{ all -> 0x0b13 }
            int r9 = r12.mo14409o(r10, r9)     // Catch:{ all -> 0x0b13 }
            int r9 = r9 + -1
            p182n6.C7264i.m27898g(r10)     // Catch:{ all -> 0x0b13 }
            r11.mo14554h()     // Catch:{ all -> 0x0b13 }
            r11.mo14301i()     // Catch:{ all -> 0x0b13 }
            android.database.sqlite.SQLiteDatabase r12 = r11.mo14495P()     // Catch:{ SQLiteException -> 0x02fc }
            r18 = r15
            java.lang.String r15 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r32 = r4
            r4 = 3
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x02f4 }
            r16 = 0
            r4[r16] = r10     // Catch:{ SQLiteException -> 0x02f4 }
            r33 = r5
            r5 = 1
            r4[r5] = r10     // Catch:{ SQLiteException -> 0x02f2 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x02f2 }
            r16 = 2
            r4[r16] = r9     // Catch:{ SQLiteException -> 0x02f2 }
            r12.execSQL(r15, r4)     // Catch:{ SQLiteException -> 0x02f2 }
            goto L_0x0318
        L_0x02f2:
            r0 = move-exception
            goto L_0x0304
        L_0x02f4:
            r0 = move-exception
            goto L_0x02f9
        L_0x02f6:
            r0 = move-exception
            r32 = r4
        L_0x02f9:
            r33 = r5
            goto L_0x0303
        L_0x02fc:
            r0 = move-exception
            r32 = r4
            r33 = r5
            r18 = r15
        L_0x0303:
            r5 = 1
        L_0x0304:
            r4 = r0
            com.google.android.gms.measurement.internal.t4 r9 = r11.f14613a     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.p3 r9 = r9.mo14551d()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.n3 r9 = r9.mo14675r()     // Catch:{ all -> 0x0b13 }
            java.lang.String r11 = "Error pruning currencies. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r10)     // Catch:{ all -> 0x0b13 }
            r9.mo14617c(r11, r12, r4)     // Catch:{ all -> 0x0b13 }
        L_0x0318:
            com.google.android.gms.measurement.internal.q9 r19 = new com.google.android.gms.measurement.internal.q9     // Catch:{ all -> 0x0b13 }
            java.lang.String r4 = r2.f15105f     // Catch:{ all -> 0x0b13 }
            t6.f r9 = r35.mo14548a()     // Catch:{ all -> 0x0b13 }
            long r15 = r9.mo23594a()     // Catch:{ all -> 0x0b13 }
            java.lang.Long r17 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0b13 }
            r11 = r19
            r12 = r10
            r13 = r4
            r14 = r8
            r4 = r18
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0b13 }
            r8 = r19
        L_0x0334:
            com.google.android.gms.measurement.internal.k r9 = r1.f14627c     // Catch:{ all -> 0x0b13 }
            m17935R(r9)     // Catch:{ all -> 0x0b13 }
            boolean r9 = r9.mo14524x(r8)     // Catch:{ all -> 0x0b13 }
            if (r9 != 0) goto L_0x036f
            com.google.android.gms.measurement.internal.p3 r9 = r35.mo14551d()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.n3 r9 = r9.mo14675r()     // Catch:{ all -> 0x0b13 }
            java.lang.String r11 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r10)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.t4 r13 = r1.f14636l     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.k3 r13 = r13.mo14847D()     // Catch:{ all -> 0x0b13 }
            java.lang.String r14 = r8.f14804c     // Catch:{ all -> 0x0b13 }
            java.lang.String r13 = r13.mo14530f(r14)     // Catch:{ all -> 0x0b13 }
            java.lang.Object r8 = r8.f14806e     // Catch:{ all -> 0x0b13 }
            r9.mo14618d(r11, r12, r13, r8)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.s9 r11 = r35.mo14589h0()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.r9 r12 = r1.f14624E     // Catch:{ all -> 0x0b13 }
            r14 = 9
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.mo14795C(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0b13 }
        L_0x036f:
            java.lang.String r8 = r2.f15103d     // Catch:{ all -> 0x0b13 }
            boolean r8 = com.google.android.gms.measurement.internal.C4785s9.m18220Z(r8)     // Catch:{ all -> 0x0b13 }
            java.lang.String r9 = r2.f15103d     // Catch:{ all -> 0x0b13 }
            boolean r4 = r4.equals(r9)     // Catch:{ all -> 0x0b13 }
            r35.mo14589h0()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.zzau r9 = r2.f15104e     // Catch:{ all -> 0x0b13 }
            if (r9 != 0) goto L_0x0385
            r12 = 0
            goto L_0x03a4
        L_0x0385:
            com.google.android.gms.measurement.internal.r r11 = new com.google.android.gms.measurement.internal.r     // Catch:{ all -> 0x0b13 }
            r11.<init>(r9)     // Catch:{ all -> 0x0b13 }
            r12 = 0
        L_0x038c:
            boolean r16 = r11.hasNext()     // Catch:{ all -> 0x0b13 }
            if (r16 == 0) goto L_0x03a4
            java.lang.String r14 = r11.next()     // Catch:{ all -> 0x0b13 }
            java.lang.Object r14 = r9.mo14986q0(r14)     // Catch:{ all -> 0x0b13 }
            boolean r15 = r14 instanceof android.os.Parcelable[]     // Catch:{ all -> 0x0b13 }
            if (r15 == 0) goto L_0x038c
            android.os.Parcelable[] r14 = (android.os.Parcelable[]) r14     // Catch:{ all -> 0x0b13 }
            int r14 = r14.length     // Catch:{ all -> 0x0b13 }
            long r14 = (long) r14     // Catch:{ all -> 0x0b13 }
            long r12 = r12 + r14
            goto L_0x038c
        L_0x03a4:
            com.google.android.gms.measurement.internal.k r11 = r1.f14627c     // Catch:{ all -> 0x0b13 }
            m17935R(r11)     // Catch:{ all -> 0x0b13 }
            long r14 = r35.mo14572F()     // Catch:{ all -> 0x0b13 }
            r22 = 1
            long r18 = r12 + r22
            r9 = 1
            r20 = 0
            r21 = 0
            r12 = r14
            r30 = r6
            r5 = 0
            r14 = r10
            r15 = r18
            r17 = r9
            r18 = r8
            r19 = r20
            r20 = r4
            com.google.android.gms.measurement.internal.i r9 = r11.mo14500U(r12, r14, r15, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0b13 }
            long r11 = r9.f14502b     // Catch:{ all -> 0x0b13 }
            r35.mo14575U()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.e3 r13 = com.google.android.gms.measurement.internal.C4636f3.f14384m     // Catch:{ all -> 0x0b13 }
            r15 = 0
            java.lang.Object r13 = r13.mo14346a(r15)     // Catch:{ all -> 0x0b13 }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ all -> 0x0b13 }
            int r13 = r13.intValue()     // Catch:{ all -> 0x0b13 }
            long r13 = (long) r13     // Catch:{ all -> 0x0b13 }
            long r11 = r11 - r13
            int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            r16 = 1000(0x3e8, double:4.94E-321)
            if (r13 <= 0) goto L_0x0412
            long r11 = r11 % r16
            int r2 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x0401
            com.google.android.gms.measurement.internal.p3 r2 = r35.mo14551d()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14675r()     // Catch:{ all -> 0x0b13 }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r10)     // Catch:{ all -> 0x0b13 }
            long r5 = r9.f14502b     // Catch:{ all -> 0x0b13 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0b13 }
            r2.mo14617c(r3, r4, r5)     // Catch:{ all -> 0x0b13 }
        L_0x0401:
            com.google.android.gms.measurement.internal.k r2 = r1.f14627c     // Catch:{ all -> 0x0b13 }
            m17935R(r2)     // Catch:{ all -> 0x0b13 }
            r2.mo14515o()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.k r2 = r1.f14627c
            m17935R(r2)
            r2.mo14510f0()
            return
        L_0x0412:
            if (r8 == 0) goto L_0x046d
            long r11 = r9.f14501a     // Catch:{ all -> 0x0b13 }
            r35.mo14575U()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.e3 r13 = com.google.android.gms.measurement.internal.C4636f3.f14388o     // Catch:{ all -> 0x0b13 }
            java.lang.Object r13 = r13.mo14346a(r15)     // Catch:{ all -> 0x0b13 }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ all -> 0x0b13 }
            int r13 = r13.intValue()     // Catch:{ all -> 0x0b13 }
            long r13 = (long) r13     // Catch:{ all -> 0x0b13 }
            long r11 = r11 - r13
            int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r13 <= 0) goto L_0x046d
            long r11 = r11 % r16
            int r3 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r3 != 0) goto L_0x0448
            com.google.android.gms.measurement.internal.p3 r3 = r35.mo14551d()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.n3 r3 = r3.mo14675r()     // Catch:{ all -> 0x0b13 }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r10)     // Catch:{ all -> 0x0b13 }
            long r6 = r9.f14501a     // Catch:{ all -> 0x0b13 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0b13 }
            r3.mo14617c(r4, r5, r6)     // Catch:{ all -> 0x0b13 }
        L_0x0448:
            com.google.android.gms.measurement.internal.s9 r11 = r35.mo14589h0()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.r9 r12 = r1.f14624E     // Catch:{ all -> 0x0b13 }
            r14 = 16
            java.lang.String r15 = "_ev"
            java.lang.String r2 = r2.f15103d     // Catch:{ all -> 0x0b13 }
            r17 = 0
            r13 = r10
            r16 = r2
            r11.mo14795C(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.k r2 = r1.f14627c     // Catch:{ all -> 0x0b13 }
            m17935R(r2)     // Catch:{ all -> 0x0b13 }
            r2.mo14515o()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.k r2 = r1.f14627c
            m17935R(r2)
            r2.mo14510f0()
            return
        L_0x046d:
            r11 = 1000000(0xf4240, float:1.401298E-39)
            if (r4 == 0) goto L_0x04bb
            long r12 = r9.f14504d     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g r4 = r35.mo14575U()     // Catch:{ all -> 0x0b13 }
            java.lang.String r14 = r3.f15117d     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.e3 r15 = com.google.android.gms.measurement.internal.C4636f3.f14386n     // Catch:{ all -> 0x0b13 }
            int r4 = r4.mo14409o(r14, r15)     // Catch:{ all -> 0x0b13 }
            int r4 = java.lang.Math.min(r11, r4)     // Catch:{ all -> 0x0b13 }
            r14 = 0
            int r4 = java.lang.Math.max(r14, r4)     // Catch:{ all -> 0x0b13 }
            long r14 = (long) r4     // Catch:{ all -> 0x0b13 }
            long r12 = r12 - r14
            int r4 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x04bb
            int r2 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x04aa
            com.google.android.gms.measurement.internal.p3 r2 = r35.mo14551d()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14675r()     // Catch:{ all -> 0x0b13 }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r10)     // Catch:{ all -> 0x0b13 }
            long r5 = r9.f14504d     // Catch:{ all -> 0x0b13 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0b13 }
            r2.mo14617c(r3, r4, r5)     // Catch:{ all -> 0x0b13 }
        L_0x04aa:
            com.google.android.gms.measurement.internal.k r2 = r1.f14627c     // Catch:{ all -> 0x0b13 }
            m17935R(r2)     // Catch:{ all -> 0x0b13 }
            r2.mo14515o()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.k r2 = r1.f14627c
            m17935R(r2)
            r2.mo14510f0()
            return
        L_0x04bb:
            com.google.android.gms.measurement.internal.zzau r4 = r2.f15104e     // Catch:{ all -> 0x0b13 }
            android.os.Bundle r4 = r4.mo14991x()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.s9 r9 = r35.mo14589h0()     // Catch:{ all -> 0x0b13 }
            java.lang.String r12 = "_o"
            java.lang.String r13 = r2.f15105f     // Catch:{ all -> 0x0b13 }
            r9.mo14796D(r4, r12, r13)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.s9 r9 = r35.mo14589h0()     // Catch:{ all -> 0x0b13 }
            boolean r9 = r9.mo14813U(r10)     // Catch:{ all -> 0x0b13 }
            java.lang.String r15 = "_r"
            if (r9 == 0) goto L_0x04ec
            com.google.android.gms.measurement.internal.s9 r9 = r35.mo14589h0()     // Catch:{ all -> 0x0b13 }
            java.lang.String r12 = "_dbg"
            java.lang.Long r13 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x0b13 }
            r9.mo14796D(r4, r12, r13)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.s9 r9 = r35.mo14589h0()     // Catch:{ all -> 0x0b13 }
            r9.mo14796D(r4, r15, r13)     // Catch:{ all -> 0x0b13 }
        L_0x04ec:
            java.lang.String r9 = "_s"
            java.lang.String r12 = r2.f15103d     // Catch:{ all -> 0x0b13 }
            boolean r9 = r9.equals(r12)     // Catch:{ all -> 0x0b13 }
            if (r9 == 0) goto L_0x0512
            com.google.android.gms.measurement.internal.k r9 = r1.f14627c     // Catch:{ all -> 0x0b13 }
            m17935R(r9)     // Catch:{ all -> 0x0b13 }
            java.lang.String r12 = r3.f15117d     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.q9 r9 = r9.mo14502X(r12, r7)     // Catch:{ all -> 0x0b13 }
            if (r9 == 0) goto L_0x0512
            java.lang.Object r12 = r9.f14806e     // Catch:{ all -> 0x0b13 }
            boolean r12 = r12 instanceof java.lang.Long     // Catch:{ all -> 0x0b13 }
            if (r12 == 0) goto L_0x0512
            com.google.android.gms.measurement.internal.s9 r12 = r35.mo14589h0()     // Catch:{ all -> 0x0b13 }
            java.lang.Object r9 = r9.f14806e     // Catch:{ all -> 0x0b13 }
            r12.mo14796D(r4, r7, r9)     // Catch:{ all -> 0x0b13 }
        L_0x0512:
            com.google.android.gms.measurement.internal.k r7 = r1.f14627c     // Catch:{ all -> 0x0b13 }
            m17935R(r7)     // Catch:{ all -> 0x0b13 }
            p182n6.C7264i.m27898g(r10)     // Catch:{ all -> 0x0b13 }
            r7.mo14554h()     // Catch:{ all -> 0x0b13 }
            r7.mo14301i()     // Catch:{ all -> 0x0b13 }
            android.database.sqlite.SQLiteDatabase r9 = r7.mo14495P()     // Catch:{ SQLiteException -> 0x0556 }
            com.google.android.gms.measurement.internal.t4 r12 = r7.f14613a     // Catch:{ SQLiteException -> 0x0556 }
            com.google.android.gms.measurement.internal.g r12 = r12.mo14876z()     // Catch:{ SQLiteException -> 0x0556 }
            com.google.android.gms.measurement.internal.e3 r13 = com.google.android.gms.measurement.internal.C4636f3.f14394r     // Catch:{ SQLiteException -> 0x0556 }
            int r12 = r12.mo14409o(r10, r13)     // Catch:{ SQLiteException -> 0x0556 }
            int r11 = java.lang.Math.min(r11, r12)     // Catch:{ SQLiteException -> 0x0556 }
            r14 = 0
            int r11 = java.lang.Math.max(r14, r11)     // Catch:{ SQLiteException -> 0x0552 }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ SQLiteException -> 0x0552 }
            java.lang.String r12 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            r13 = 2
            java.lang.String[] r13 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0552 }
            r13[r14] = r10     // Catch:{ SQLiteException -> 0x0552 }
            r17 = 1
            r13[r17] = r11     // Catch:{ SQLiteException -> 0x0552 }
            r11 = r30
            int r7 = r9.delete(r11, r12, r13)     // Catch:{ SQLiteException -> 0x0550 }
            long r12 = (long) r7
            goto L_0x056f
        L_0x0550:
            r0 = move-exception
            goto L_0x055a
        L_0x0552:
            r0 = move-exception
            r11 = r30
            goto L_0x055a
        L_0x0556:
            r0 = move-exception
            r11 = r30
            r14 = 0
        L_0x055a:
            r9 = r0
            com.google.android.gms.measurement.internal.t4 r7 = r7.f14613a     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.p3 r7 = r7.mo14551d()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.n3 r7 = r7.mo14675r()     // Catch:{ all -> 0x0b13 }
            java.lang.String r12 = "Error deleting over the limit events. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r10)     // Catch:{ all -> 0x0b13 }
            r7.mo14617c(r12, r13, r9)     // Catch:{ all -> 0x0b13 }
            r12 = r5
        L_0x056f:
            int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0588
            com.google.android.gms.measurement.internal.p3 r7 = r35.mo14551d()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.n3 r7 = r7.mo14680w()     // Catch:{ all -> 0x0b13 }
            java.lang.String r9 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r14 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r10)     // Catch:{ all -> 0x0b13 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0b13 }
            r7.mo14617c(r9, r14, r12)     // Catch:{ all -> 0x0b13 }
        L_0x0588:
            com.google.android.gms.measurement.internal.p r7 = new com.google.android.gms.measurement.internal.p     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.t4 r12 = r1.f14636l     // Catch:{ all -> 0x0b13 }
            java.lang.String r13 = r2.f15105f     // Catch:{ all -> 0x0b13 }
            java.lang.String r9 = r2.f15103d     // Catch:{ all -> 0x0b13 }
            long r5 = r2.f15106g     // Catch:{ all -> 0x0b13 }
            r18 = 0
            r2 = r11
            r11 = r7
            r31 = 0
            r14 = r10
            r36 = r2
            r34 = r15
            r2 = 0
            r15 = r9
            r16 = r5
            r20 = r4
            r11.<init>((com.google.android.gms.measurement.internal.C4791t4) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (long) r16, (long) r18, (android.os.Bundle) r20)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.k r4 = r1.f14627c     // Catch:{ all -> 0x0b13 }
            m17935R(r4)     // Catch:{ all -> 0x0b13 }
            java.lang.String r5 = r7.f14705b     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.q r4 = r4.mo14501V(r10, r5)     // Catch:{ all -> 0x0b13 }
            if (r4 != 0) goto L_0x062c
            com.google.android.gms.measurement.internal.k r4 = r1.f14627c     // Catch:{ all -> 0x0b13 }
            m17935R(r4)     // Catch:{ all -> 0x0b13 }
            long r4 = r4.mo14494O(r10)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g r6 = r35.mo14575U()     // Catch:{ all -> 0x0b13 }
            int r6 = r6.mo14406l(r10)     // Catch:{ all -> 0x0b13 }
            long r11 = (long) r6     // Catch:{ all -> 0x0b13 }
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x060e
            if (r8 == 0) goto L_0x060e
            com.google.android.gms.measurement.internal.p3 r2 = r35.mo14551d()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14675r()     // Catch:{ all -> 0x0b13 }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r10)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.t4 r5 = r1.f14636l     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.k3 r5 = r5.mo14847D()     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = r7.f14705b     // Catch:{ all -> 0x0b13 }
            java.lang.String r5 = r5.mo14528d(r6)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g r6 = r35.mo14575U()     // Catch:{ all -> 0x0b13 }
            int r6 = r6.mo14406l(r10)     // Catch:{ all -> 0x0b13 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0b13 }
            r2.mo14618d(r3, r4, r5, r6)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.s9 r11 = r35.mo14589h0()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.r9 r12 = r1.f14624E     // Catch:{ all -> 0x0b13 }
            r14 = 8
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.mo14795C(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.k r2 = r1.f14627c
            m17935R(r2)
            r2.mo14510f0()
            return
        L_0x060e:
            com.google.android.gms.measurement.internal.q r4 = new com.google.android.gms.measurement.internal.q     // Catch:{ all -> 0x0b13 }
            java.lang.String r13 = r7.f14705b     // Catch:{ all -> 0x0b13 }
            long r5 = r7.f14707d     // Catch:{ all -> 0x0b13 }
            r14 = 0
            r16 = 0
            r18 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r11 = r4
            r12 = r10
            r20 = r5
            r11.<init>(r12, r13, r14, r16, r18, r20, r22, r24, r25, r26, r27)     // Catch:{ all -> 0x0b13 }
            goto L_0x063a
        L_0x062c:
            com.google.android.gms.measurement.internal.t4 r5 = r1.f14636l     // Catch:{ all -> 0x0b13 }
            long r8 = r4.f14775f     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.p r7 = r7.mo14670a(r5, r8)     // Catch:{ all -> 0x0b13 }
            long r5 = r7.f14707d     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.q r4 = r4.mo14757c(r5)     // Catch:{ all -> 0x0b13 }
        L_0x063a:
            com.google.android.gms.measurement.internal.k r5 = r1.f14627c     // Catch:{ all -> 0x0b13 }
            m17935R(r5)     // Catch:{ all -> 0x0b13 }
            r5.mo14517q(r4)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.r4 r4 = r35.mo14552f()     // Catch:{ all -> 0x0b13 }
            r4.mo14554h()     // Catch:{ all -> 0x0b13 }
            r35.mo14586g()     // Catch:{ all -> 0x0b13 }
            p182n6.C7264i.m27902k(r7)     // Catch:{ all -> 0x0b13 }
            p182n6.C7264i.m27902k(r37)     // Catch:{ all -> 0x0b13 }
            java.lang.String r4 = r7.f14704a     // Catch:{ all -> 0x0b13 }
            p182n6.C7264i.m27898g(r4)     // Catch:{ all -> 0x0b13 }
            java.lang.String r4 = r7.f14704a     // Catch:{ all -> 0x0b13 }
            java.lang.String r5 = r3.f15117d     // Catch:{ all -> 0x0b13 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0b13 }
            p182n6.C7264i.m27892a(r4)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.internal.measurement.t4 r4 = com.google.android.gms.internal.measurement.C4431u4.m16847S1()     // Catch:{ all -> 0x0b13 }
            r5 = 1
            r4.mo13597X(r5)     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = "android"
            r4.mo13592S(r6)     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = r3.f15117d     // Catch:{ all -> 0x0b13 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0b13 }
            if (r6 != 0) goto L_0x067c
            java.lang.String r6 = r3.f15117d     // Catch:{ all -> 0x0b13 }
            r4.mo13619s(r6)     // Catch:{ all -> 0x0b13 }
        L_0x067c:
            java.lang.String r6 = r3.f15120g     // Catch:{ all -> 0x0b13 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0b13 }
            if (r6 != 0) goto L_0x0689
            java.lang.String r6 = r3.f15120g     // Catch:{ all -> 0x0b13 }
            r4.mo13622u(r6)     // Catch:{ all -> 0x0b13 }
        L_0x0689:
            java.lang.String r6 = r3.f15119f     // Catch:{ all -> 0x0b13 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0b13 }
            if (r6 != 0) goto L_0x0696
            java.lang.String r6 = r3.f15119f     // Catch:{ all -> 0x0b13 }
            r4.mo13627y(r6)     // Catch:{ all -> 0x0b13 }
        L_0x0696:
            com.google.android.gms.internal.measurement.C4356pe.m16469c()     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = r3.f15114A     // Catch:{ all -> 0x0b13 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0b13 }
            if (r6 != 0) goto L_0x06c0
            com.google.android.gms.measurement.internal.g r6 = r35.mo14575U()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.e3 r8 = com.google.android.gms.measurement.internal.C4636f3.f14389o0     // Catch:{ all -> 0x0b13 }
            boolean r6 = r6.mo14398B(r2, r8)     // Catch:{ all -> 0x0b13 }
            if (r6 != 0) goto L_0x06bb
            com.google.android.gms.measurement.internal.g r6 = r35.mo14575U()     // Catch:{ all -> 0x0b13 }
            java.lang.String r8 = r3.f15117d     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.e3 r9 = com.google.android.gms.measurement.internal.C4636f3.f14393q0     // Catch:{ all -> 0x0b13 }
            boolean r6 = r6.mo14398B(r8, r9)     // Catch:{ all -> 0x0b13 }
            if (r6 == 0) goto L_0x06c0
        L_0x06bb:
            java.lang.String r6 = r3.f15114A     // Catch:{ all -> 0x0b13 }
            r4.mo13601b0(r6)     // Catch:{ all -> 0x0b13 }
        L_0x06c0:
            long r8 = r3.f15126m     // Catch:{ all -> 0x0b13 }
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x06cd
            int r6 = (int) r8     // Catch:{ all -> 0x0b13 }
            r4.mo13629z(r6)     // Catch:{ all -> 0x0b13 }
        L_0x06cd:
            long r8 = r3.f15121h     // Catch:{ all -> 0x0b13 }
            r4.mo13584N(r8)     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = r3.f15118e     // Catch:{ all -> 0x0b13 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0b13 }
            if (r6 != 0) goto L_0x06df
            java.lang.String r6 = r3.f15118e     // Catch:{ all -> 0x0b13 }
            r4.mo13582M(r6)     // Catch:{ all -> 0x0b13 }
        L_0x06df:
            java.lang.String r6 = r3.f15117d     // Catch:{ all -> 0x0b13 }
            java.lang.Object r6 = p182n6.C7264i.m27902k(r6)     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0b13 }
            s7.b r6 = r1.mo14576V(r6)     // Catch:{ all -> 0x0b13 }
            java.lang.String r8 = r3.f15138y     // Catch:{ all -> 0x0b13 }
            s7.b r8 = p248s7.C8245b.m31053b(r8)     // Catch:{ all -> 0x0b13 }
            s7.b r6 = r6.mo23428c(r8)     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = r6.mo23433h()     // Catch:{ all -> 0x0b13 }
            r4.mo13564D(r6)     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = r4.mo13611m0()     // Catch:{ all -> 0x0b13 }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x0b13 }
            if (r6 == 0) goto L_0x0713
            java.lang.String r6 = r3.f15133t     // Catch:{ all -> 0x0b13 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0b13 }
            if (r6 != 0) goto L_0x0713
            java.lang.String r6 = r3.f15133t     // Catch:{ all -> 0x0b13 }
            r4.mo13617r(r6)     // Catch:{ all -> 0x0b13 }
        L_0x0713:
            long r8 = r3.f15122i     // Catch:{ all -> 0x0b13 }
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x071e
            r4.mo13566E(r8)     // Catch:{ all -> 0x0b13 }
        L_0x071e:
            long r8 = r3.f15135v     // Catch:{ all -> 0x0b13 }
            r4.mo13572H(r8)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.o9 r6 = r1.f14631g     // Catch:{ all -> 0x0b13 }
            m17935R(r6)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.m9 r8 = r6.f15082b     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.t4 r8 = r8.f14636l     // Catch:{ all -> 0x0b13 }
            android.content.Context r8 = r8.mo14550c()     // Catch:{ all -> 0x0b13 }
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ all -> 0x0b13 }
            java.lang.String r9 = "com.google.android.gms.measurement"
            android.net.Uri r9 = com.google.android.gms.internal.measurement.C4212h6.m15980a(r9)     // Catch:{ all -> 0x0b13 }
            s7.c r10 = p248s7.C8247c.f23456d     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.internal.measurement.x5 r8 = com.google.android.gms.internal.measurement.C4482x5.m17137b(r8, r9, r10)     // Catch:{ all -> 0x0b13 }
            if (r8 != 0) goto L_0x0747
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0b13 }
            goto L_0x074b
        L_0x0747:
            java.util.Map r8 = r8.mo13808c()     // Catch:{ all -> 0x0b13 }
        L_0x074b:
            if (r8 == 0) goto L_0x07d1
            boolean r9 = r8.isEmpty()     // Catch:{ all -> 0x0b13 }
            if (r9 == 0) goto L_0x0755
            goto L_0x07d1
        L_0x0755:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0b13 }
            r14.<init>()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.e3 r9 = com.google.android.gms.measurement.internal.C4636f3.f14351R     // Catch:{ all -> 0x0b13 }
            java.lang.Object r9 = r9.mo14346a(r2)     // Catch:{ all -> 0x0b13 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x0b13 }
            int r9 = r9.intValue()     // Catch:{ all -> 0x0b13 }
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x0b13 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0b13 }
        L_0x076e:
            boolean r10 = r8.hasNext()     // Catch:{ all -> 0x0b13 }
            if (r10 == 0) goto L_0x07cb
            java.lang.Object r10 = r8.next()     // Catch:{ all -> 0x0b13 }
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch:{ all -> 0x0b13 }
            java.lang.Object r11 = r10.getKey()     // Catch:{ all -> 0x0b13 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0b13 }
            java.lang.String r12 = "measurement.id."
            boolean r11 = r11.startsWith(r12)     // Catch:{ all -> 0x0b13 }
            if (r11 == 0) goto L_0x076e
            java.lang.Object r10 = r10.getValue()     // Catch:{ NumberFormatException -> 0x07b9 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ NumberFormatException -> 0x07b9 }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x07b9 }
            if (r10 == 0) goto L_0x076e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x07b9 }
            r14.add(r10)     // Catch:{ NumberFormatException -> 0x07b9 }
            int r10 = r14.size()     // Catch:{ NumberFormatException -> 0x07b9 }
            if (r10 < r9) goto L_0x076e
            com.google.android.gms.measurement.internal.t4 r10 = r6.f14613a     // Catch:{ NumberFormatException -> 0x07b9 }
            com.google.android.gms.measurement.internal.p3 r10 = r10.mo14551d()     // Catch:{ NumberFormatException -> 0x07b9 }
            com.google.android.gms.measurement.internal.n3 r10 = r10.mo14680w()     // Catch:{ NumberFormatException -> 0x07b9 }
            java.lang.String r11 = "Too many experiment IDs. Number of IDs"
            int r12 = r14.size()     // Catch:{ NumberFormatException -> 0x07b9 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x07b9 }
            r10.mo14616b(r11, r12)     // Catch:{ NumberFormatException -> 0x07b9 }
            goto L_0x07cb
        L_0x07b9:
            r0 = move-exception
            r10 = r0
            com.google.android.gms.measurement.internal.t4 r11 = r6.f14613a     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.p3 r11 = r11.mo14551d()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.n3 r11 = r11.mo14680w()     // Catch:{ all -> 0x0b13 }
            java.lang.String r12 = "Experiment ID NumberFormatException"
            r11.mo14616b(r12, r10)     // Catch:{ all -> 0x0b13 }
            goto L_0x076e
        L_0x07cb:
            boolean r6 = r14.isEmpty()     // Catch:{ all -> 0x0b13 }
            if (r6 == 0) goto L_0x07d2
        L_0x07d1:
            r14 = r2
        L_0x07d2:
            if (r14 == 0) goto L_0x07d7
            r4.mo13628y0(r14)     // Catch:{ all -> 0x0b13 }
        L_0x07d7:
            java.lang.String r6 = r3.f15117d     // Catch:{ all -> 0x0b13 }
            java.lang.Object r6 = p182n6.C7264i.m27902k(r6)     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0b13 }
            s7.b r6 = r1.mo14576V(r6)     // Catch:{ all -> 0x0b13 }
            java.lang.String r8 = r3.f15138y     // Catch:{ all -> 0x0b13 }
            s7.b r8 = p248s7.C8245b.m31053b(r8)     // Catch:{ all -> 0x0b13 }
            s7.b r6 = r6.mo23428c(r8)     // Catch:{ all -> 0x0b13 }
            s7.a r8 = p248s7.C8243a.AD_STORAGE     // Catch:{ all -> 0x0b13 }
            boolean r9 = r6.mo23435i(r8)     // Catch:{ all -> 0x0b13 }
            if (r9 == 0) goto L_0x0823
            boolean r9 = r3.f15131r     // Catch:{ all -> 0x0b13 }
            if (r9 == 0) goto L_0x0823
            com.google.android.gms.measurement.internal.i8 r9 = r1.f14633i     // Catch:{ all -> 0x0b13 }
            java.lang.String r10 = r3.f15117d     // Catch:{ all -> 0x0b13 }
            android.util.Pair r9 = r9.mo14467n(r10, r6)     // Catch:{ all -> 0x0b13 }
            java.lang.Object r10 = r9.first     // Catch:{ all -> 0x0b13 }
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ all -> 0x0b13 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0b13 }
            if (r10 != 0) goto L_0x0823
            boolean r10 = r3.f15131r     // Catch:{ all -> 0x0b13 }
            if (r10 == 0) goto L_0x0823
            java.lang.Object r10 = r9.first     // Catch:{ all -> 0x0b13 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0b13 }
            r4.mo13598Y(r10)     // Catch:{ all -> 0x0b13 }
            java.lang.Object r9 = r9.second     // Catch:{ all -> 0x0b13 }
            if (r9 == 0) goto L_0x0823
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0b13 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0b13 }
            r4.mo13588P(r9)     // Catch:{ all -> 0x0b13 }
        L_0x0823:
            com.google.android.gms.measurement.internal.t4 r9 = r1.f14636l     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.o r9 = r9.mo14844A()     // Catch:{ all -> 0x0b13 }
            r9.mo14640k()     // Catch:{ all -> 0x0b13 }
            java.lang.String r9 = android.os.Build.MODEL     // Catch:{ all -> 0x0b13 }
            r4.mo13568F(r9)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.t4 r9 = r1.f14636l     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.o r9 = r9.mo14844A()     // Catch:{ all -> 0x0b13 }
            r9.mo14640k()     // Catch:{ all -> 0x0b13 }
            java.lang.String r9 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0b13 }
            r4.mo13590Q(r9)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.t4 r9 = r1.f14636l     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.o r9 = r9.mo14844A()     // Catch:{ all -> 0x0b13 }
            long r9 = r9.mo14648p()     // Catch:{ all -> 0x0b13 }
            int r9 = (int) r9     // Catch:{ all -> 0x0b13 }
            r4.mo13604e0(r9)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.t4 r9 = r1.f14636l     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.o r9 = r9.mo14844A()     // Catch:{ all -> 0x0b13 }
            java.lang.String r9 = r9.mo14649q()     // Catch:{ all -> 0x0b13 }
            r4.mo13608j0(r9)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.internal.measurement.C4423td.m16772c()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g r9 = r35.mo14575U()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.e3 r10 = com.google.android.gms.measurement.internal.C4636f3.f14337G0     // Catch:{ all -> 0x0b13 }
            boolean r9 = r9.mo14398B(r2, r10)     // Catch:{ all -> 0x0b13 }
            if (r9 == 0) goto L_0x086e
            long r9 = r3.f15116C     // Catch:{ all -> 0x0b13 }
            r4.mo13603d0(r9)     // Catch:{ all -> 0x0b13 }
        L_0x086e:
            com.google.android.gms.measurement.internal.t4 r9 = r1.f14636l     // Catch:{ all -> 0x0b13 }
            boolean r9 = r9.mo14869o()     // Catch:{ all -> 0x0b13 }
            if (r9 == 0) goto L_0x0882
            r4.mo13610l0()     // Catch:{ all -> 0x0b13 }
            boolean r9 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0b13 }
            if (r9 != 0) goto L_0x0882
            r4.mo13570G(r2)     // Catch:{ all -> 0x0b13 }
        L_0x0882:
            com.google.android.gms.measurement.internal.k r9 = r1.f14627c     // Catch:{ all -> 0x0b13 }
            m17935R(r9)     // Catch:{ all -> 0x0b13 }
            java.lang.String r10 = r3.f15117d     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.p5 r9 = r9.mo14497R(r10)     // Catch:{ all -> 0x0b13 }
            if (r9 != 0) goto L_0x08f2
            com.google.android.gms.measurement.internal.p5 r9 = new com.google.android.gms.measurement.internal.p5     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.t4 r10 = r1.f14636l     // Catch:{ all -> 0x0b13 }
            java.lang.String r11 = r3.f15117d     // Catch:{ all -> 0x0b13 }
            r9.<init>(r10, r11)     // Catch:{ all -> 0x0b13 }
            java.lang.String r10 = r1.mo14591i0(r6)     // Catch:{ all -> 0x0b13 }
            r9.mo14727i(r10)     // Catch:{ all -> 0x0b13 }
            java.lang.String r10 = r3.f15127n     // Catch:{ all -> 0x0b13 }
            r9.mo14747w(r10)     // Catch:{ all -> 0x0b13 }
            java.lang.String r10 = r3.f15118e     // Catch:{ all -> 0x0b13 }
            r9.mo14748x(r10)     // Catch:{ all -> 0x0b13 }
            boolean r8 = r6.mo23435i(r8)     // Catch:{ all -> 0x0b13 }
            if (r8 == 0) goto L_0x08bc
            com.google.android.gms.measurement.internal.i8 r8 = r1.f14633i     // Catch:{ all -> 0x0b13 }
            java.lang.String r10 = r3.f15117d     // Catch:{ all -> 0x0b13 }
            boolean r11 = r3.f15131r     // Catch:{ all -> 0x0b13 }
            java.lang.String r8 = r8.mo14468o(r10, r11)     // Catch:{ all -> 0x0b13 }
            r9.mo14691G(r8)     // Catch:{ all -> 0x0b13 }
        L_0x08bc:
            r10 = 0
            r9.mo14687C(r10)     // Catch:{ all -> 0x0b13 }
            r9.mo14688D(r10)     // Catch:{ all -> 0x0b13 }
            r9.mo14686B(r10)     // Catch:{ all -> 0x0b13 }
            java.lang.String r8 = r3.f15119f     // Catch:{ all -> 0x0b13 }
            r9.mo14731k(r8)     // Catch:{ all -> 0x0b13 }
            long r10 = r3.f15126m     // Catch:{ all -> 0x0b13 }
            r9.mo14733l(r10)     // Catch:{ all -> 0x0b13 }
            java.lang.String r8 = r3.f15120g     // Catch:{ all -> 0x0b13 }
            r9.mo14729j(r8)     // Catch:{ all -> 0x0b13 }
            long r10 = r3.f15121h     // Catch:{ all -> 0x0b13 }
            r9.mo14749y(r10)     // Catch:{ all -> 0x0b13 }
            long r10 = r3.f15122i     // Catch:{ all -> 0x0b13 }
            r9.mo14744t(r10)     // Catch:{ all -> 0x0b13 }
            boolean r8 = r3.f15124k     // Catch:{ all -> 0x0b13 }
            r9.mo14689E(r8)     // Catch:{ all -> 0x0b13 }
            long r10 = r3.f15135v     // Catch:{ all -> 0x0b13 }
            r9.mo14745u(r10)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.k r8 = r1.f14627c     // Catch:{ all -> 0x0b13 }
            m17935R(r8)     // Catch:{ all -> 0x0b13 }
            r8.mo14516p(r9)     // Catch:{ all -> 0x0b13 }
        L_0x08f2:
            s7.a r8 = p248s7.C8243a.ANALYTICS_STORAGE     // Catch:{ all -> 0x0b13 }
            boolean r6 = r6.mo23435i(r8)     // Catch:{ all -> 0x0b13 }
            if (r6 == 0) goto L_0x0911
            java.lang.String r6 = r9.mo14730j0()     // Catch:{ all -> 0x0b13 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0b13 }
            if (r6 != 0) goto L_0x0911
            java.lang.String r6 = r9.mo14730j0()     // Catch:{ all -> 0x0b13 }
            java.lang.Object r6 = p182n6.C7264i.m27902k(r6)     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0b13 }
            r4.mo13620t(r6)     // Catch:{ all -> 0x0b13 }
        L_0x0911:
            java.lang.String r6 = r9.mo14736m0()     // Catch:{ all -> 0x0b13 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0b13 }
            if (r6 != 0) goto L_0x0928
            java.lang.String r6 = r9.mo14736m0()     // Catch:{ all -> 0x0b13 }
            java.lang.Object r6 = p182n6.C7264i.m27902k(r6)     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0b13 }
            r4.mo13580L(r6)     // Catch:{ all -> 0x0b13 }
        L_0x0928:
            com.google.android.gms.measurement.internal.k r6 = r1.f14627c     // Catch:{ all -> 0x0b13 }
            m17935R(r6)     // Catch:{ all -> 0x0b13 }
            java.lang.String r3 = r3.f15117d     // Catch:{ all -> 0x0b13 }
            java.util.List r3 = r6.mo14507c0(r3)     // Catch:{ all -> 0x0b13 }
            r13 = r31
        L_0x0935:
            int r6 = r3.size()     // Catch:{ all -> 0x0b13 }
            if (r13 >= r6) goto L_0x096b
            com.google.android.gms.internal.measurement.c5 r6 = com.google.android.gms.internal.measurement.C4143d5.m15667D()     // Catch:{ all -> 0x0b13 }
            java.lang.Object r8 = r3.get(r13)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.q9 r8 = (com.google.android.gms.measurement.internal.C4763q9) r8     // Catch:{ all -> 0x0b13 }
            java.lang.String r8 = r8.f14804c     // Catch:{ all -> 0x0b13 }
            r6.mo12978u(r8)     // Catch:{ all -> 0x0b13 }
            java.lang.Object r8 = r3.get(r13)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.q9 r8 = (com.google.android.gms.measurement.internal.C4763q9) r8     // Catch:{ all -> 0x0b13 }
            long r8 = r8.f14805d     // Catch:{ all -> 0x0b13 }
            r6.mo12979y(r8)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.o9 r8 = r1.f14631g     // Catch:{ all -> 0x0b13 }
            m17935R(r8)     // Catch:{ all -> 0x0b13 }
            java.lang.Object r9 = r3.get(r13)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.q9 r9 = (com.google.android.gms.measurement.internal.C4763q9) r9     // Catch:{ all -> 0x0b13 }
            java.lang.Object r9 = r9.f14806e     // Catch:{ all -> 0x0b13 }
            r8.mo14664K(r6, r9)     // Catch:{ all -> 0x0b13 }
            r4.mo13563C0(r6)     // Catch:{ all -> 0x0b13 }
            int r13 = r13 + 1
            goto L_0x0935
        L_0x096b:
            com.google.android.gms.measurement.internal.k r3 = r1.f14627c     // Catch:{ IOException -> 0x0ac9 }
            m17935R(r3)     // Catch:{ IOException -> 0x0ac9 }
            com.google.android.gms.internal.measurement.p9 r6 = r4.mo13361l()     // Catch:{ IOException -> 0x0ac9 }
            com.google.android.gms.internal.measurement.u4 r6 = (com.google.android.gms.internal.measurement.C4431u4) r6     // Catch:{ IOException -> 0x0ac9 }
            r3.mo14554h()     // Catch:{ IOException -> 0x0ac9 }
            r3.mo14301i()     // Catch:{ IOException -> 0x0ac9 }
            p182n6.C7264i.m27902k(r6)     // Catch:{ IOException -> 0x0ac9 }
            java.lang.String r8 = r6.mo13724W1()     // Catch:{ IOException -> 0x0ac9 }
            p182n6.C7264i.m27898g(r8)     // Catch:{ IOException -> 0x0ac9 }
            byte[] r8 = r6.mo13041g()     // Catch:{ IOException -> 0x0ac9 }
            com.google.android.gms.measurement.internal.m9 r9 = r3.f15082b     // Catch:{ IOException -> 0x0ac9 }
            com.google.android.gms.measurement.internal.o9 r9 = r9.f14631g     // Catch:{ IOException -> 0x0ac9 }
            m17935R(r9)     // Catch:{ IOException -> 0x0ac9 }
            long r9 = r9.mo14667x(r8)     // Catch:{ IOException -> 0x0ac9 }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ IOException -> 0x0ac9 }
            r11.<init>()     // Catch:{ IOException -> 0x0ac9 }
            java.lang.String r12 = r6.mo13724W1()     // Catch:{ IOException -> 0x0ac9 }
            r13 = r33
            r11.put(r13, r12)     // Catch:{ IOException -> 0x0ac9 }
            java.lang.Long r12 = java.lang.Long.valueOf(r9)     // Catch:{ IOException -> 0x0ac9 }
            r14 = r32
            r11.put(r14, r12)     // Catch:{ IOException -> 0x0ac9 }
            java.lang.String r12 = "metadata"
            r11.put(r12, r8)     // Catch:{ IOException -> 0x0ac9 }
            android.database.sqlite.SQLiteDatabase r8 = r3.mo14495P()     // Catch:{ SQLiteException -> 0x0aaf }
            java.lang.String r12 = "raw_events_metadata"
            r15 = 4
            r8.insertWithOnConflict(r12, r2, r11, r15)     // Catch:{ SQLiteException -> 0x0aaf }
            com.google.android.gms.measurement.internal.k r3 = r1.f14627c     // Catch:{ all -> 0x0b13 }
            m17935R(r3)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.zzau r4 = r7.f14709f     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.r r6 = new com.google.android.gms.measurement.internal.r     // Catch:{ all -> 0x0b13 }
            r6.<init>(r4)     // Catch:{ all -> 0x0b13 }
        L_0x09c7:
            boolean r4 = r6.hasNext()     // Catch:{ all -> 0x0b13 }
            if (r4 == 0) goto L_0x09df
            java.lang.String r4 = r6.next()     // Catch:{ all -> 0x0b13 }
            r8 = r34
            boolean r4 = r8.equals(r4)     // Catch:{ all -> 0x0b13 }
            if (r4 == 0) goto L_0x09dc
            r31 = r5
            goto L_0x0a1e
        L_0x09dc:
            r34 = r8
            goto L_0x09c7
        L_0x09df:
            com.google.android.gms.measurement.internal.n4 r4 = r1.f14625a     // Catch:{ all -> 0x0b13 }
            m17935R(r4)     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = r7.f14704a     // Catch:{ all -> 0x0b13 }
            java.lang.String r8 = r7.f14705b     // Catch:{ all -> 0x0b13 }
            boolean r4 = r4.mo14623E(r6, r8)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.k r15 = r1.f14627c     // Catch:{ all -> 0x0b13 }
            m17935R(r15)     // Catch:{ all -> 0x0b13 }
            long r16 = r35.mo14572F()     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = r7.f14704a     // Catch:{ all -> 0x0b13 }
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r18 = r6
            com.google.android.gms.measurement.internal.i r6 = r15.mo14499T(r16, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0b13 }
            if (r4 == 0) goto L_0x0a1e
            long r11 = r6.f14505e     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.g r4 = r35.mo14575U()     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = r7.f14704a     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.e3 r8 = com.google.android.gms.measurement.internal.C4636f3.f14392q     // Catch:{ all -> 0x0b13 }
            int r4 = r4.mo14409o(r6, r8)     // Catch:{ all -> 0x0b13 }
            long r5 = (long) r4     // Catch:{ all -> 0x0b13 }
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0a1e
            r31 = 1
        L_0x0a1e:
            r3.mo14554h()     // Catch:{ all -> 0x0b13 }
            r3.mo14301i()     // Catch:{ all -> 0x0b13 }
            p182n6.C7264i.m27902k(r7)     // Catch:{ all -> 0x0b13 }
            java.lang.String r4 = r7.f14704a     // Catch:{ all -> 0x0b13 }
            p182n6.C7264i.m27898g(r4)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.m9 r4 = r3.f15082b     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.o9 r4 = r4.f14631g     // Catch:{ all -> 0x0b13 }
            m17935R(r4)     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.internal.measurement.j4 r4 = r4.mo14657B(r7)     // Catch:{ all -> 0x0b13 }
            byte[] r4 = r4.mo13041g()     // Catch:{ all -> 0x0b13 }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0b13 }
            r5.<init>()     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = r7.f14704a     // Catch:{ all -> 0x0b13 }
            r5.put(r13, r6)     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = "name"
            java.lang.String r8 = r7.f14705b     // Catch:{ all -> 0x0b13 }
            r5.put(r6, r8)     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = "timestamp"
            long r11 = r7.f14707d     // Catch:{ all -> 0x0b13 }
            java.lang.Long r8 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0b13 }
            r5.put(r6, r8)     // Catch:{ all -> 0x0b13 }
            java.lang.Long r6 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0b13 }
            r5.put(r14, r6)     // Catch:{ all -> 0x0b13 }
            java.lang.String r6 = "data"
            r5.put(r6, r4)     // Catch:{ all -> 0x0b13 }
            java.lang.String r4 = "realtime"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r31)     // Catch:{ all -> 0x0b13 }
            r5.put(r4, r6)     // Catch:{ all -> 0x0b13 }
            android.database.sqlite.SQLiteDatabase r4 = r3.mo14495P()     // Catch:{ SQLiteException -> 0x0a97 }
            r6 = r36
            long r4 = r4.insert(r6, r2, r5)     // Catch:{ SQLiteException -> 0x0a97 }
            r8 = -1
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0a92
            com.google.android.gms.measurement.internal.t4 r2 = r3.f14613a     // Catch:{ SQLiteException -> 0x0a97 }
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo14551d()     // Catch:{ SQLiteException -> 0x0a97 }
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14675r()     // Catch:{ SQLiteException -> 0x0a97 }
            java.lang.String r4 = "Failed to insert raw event (got -1). appId"
            java.lang.String r5 = r7.f14704a     // Catch:{ SQLiteException -> 0x0a97 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r5)     // Catch:{ SQLiteException -> 0x0a97 }
            r2.mo14616b(r4, r5)     // Catch:{ SQLiteException -> 0x0a97 }
            goto L_0x0ae0
        L_0x0a92:
            r4 = 0
            r1.f14639o = r4     // Catch:{ all -> 0x0b13 }
            goto L_0x0ae0
        L_0x0a97:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.t4 r3 = r3.f14613a     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo14551d()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.n3 r3 = r3.mo14675r()     // Catch:{ all -> 0x0b13 }
            java.lang.String r4 = "Error storing raw event. appId"
            java.lang.String r5 = r7.f14704a     // Catch:{ all -> 0x0b13 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r5)     // Catch:{ all -> 0x0b13 }
            r3.mo14617c(r4, r5, r2)     // Catch:{ all -> 0x0b13 }
            goto L_0x0ae0
        L_0x0aaf:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.t4 r3 = r3.f14613a     // Catch:{ IOException -> 0x0ac9 }
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo14551d()     // Catch:{ IOException -> 0x0ac9 }
            com.google.android.gms.measurement.internal.n3 r3 = r3.mo14675r()     // Catch:{ IOException -> 0x0ac9 }
            java.lang.String r5 = "Error storing raw event metadata. appId"
            java.lang.String r6 = r6.mo13724W1()     // Catch:{ IOException -> 0x0ac9 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r6)     // Catch:{ IOException -> 0x0ac9 }
            r3.mo14617c(r5, r6, r2)     // Catch:{ IOException -> 0x0ac9 }
            throw r2     // Catch:{ IOException -> 0x0ac9 }
        L_0x0ac9:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.p3 r3 = r35.mo14551d()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.n3 r3 = r3.mo14675r()     // Catch:{ all -> 0x0b13 }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r4 = r4.mo13610l0()     // Catch:{ all -> 0x0b13 }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r4)     // Catch:{ all -> 0x0b13 }
            r3.mo14617c(r5, r4, r2)     // Catch:{ all -> 0x0b13 }
        L_0x0ae0:
            com.google.android.gms.measurement.internal.k r2 = r1.f14627c     // Catch:{ all -> 0x0b13 }
            m17935R(r2)     // Catch:{ all -> 0x0b13 }
            r2.mo14515o()     // Catch:{ all -> 0x0b13 }
            com.google.android.gms.measurement.internal.k r2 = r1.f14627c
            m17935R(r2)
            r2.mo14510f0()
            r35.m17930M()
            com.google.android.gms.measurement.internal.p3 r2 = r35.mo14551d()
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14679v()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r28
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.mo14616b(r4, r3)
            return
        L_0x0b13:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.k r3 = r1.f14627c
            m17935R(r3)
            r3.mo14510f0()
            throw r2
        L_0x0b1e:
            r1.mo14573S(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4719m9.mo14570D(com.google.android.gms.measurement.internal.zzaw, com.google.android.gms.measurement.internal.zzq):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final boolean mo14571E() {
        mo14552f().mo14554h();
        FileLock fileLock = this.f14646v;
        if (fileLock == null || !fileLock.isValid()) {
            this.f14627c.f14613a.mo14876z();
            try {
                FileChannel channel = new RandomAccessFile(new File(this.f14636l.mo14550c().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.f14647w = channel;
                FileLock tryLock = channel.tryLock();
                this.f14646v = tryLock;
                if (tryLock != null) {
                    mo14551d().mo14679v().mo14615a("Storage concurrent access okay");
                    return true;
                }
                mo14551d().mo14675r().mo14615a("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e) {
                mo14551d().mo14675r().mo14616b("Failed to acquire storage lock", e);
                return false;
            } catch (IOException e2) {
                mo14551d().mo14675r().mo14616b("Failed to access storage lock file", e2);
                return false;
            } catch (OverlappingFileLockException e3) {
                mo14551d().mo14680w().mo14616b("Storage lock already acquired", e3);
                return false;
            }
        } else {
            mo14551d().mo14679v().mo14615a("Storage concurrent access okay");
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final long mo14572F() {
        long a = mo14548a().mo23594a();
        C4674i8 i8Var = this.f14633i;
        i8Var.mo14301i();
        i8Var.mo14554h();
        long a2 = i8Var.f14525i.mo14295a();
        if (a2 == 0) {
            a2 = ((long) i8Var.f14613a.mo14856N().mo14832u().nextInt(86400000)) + 1;
            i8Var.f14525i.mo14296b(a2);
        }
        return ((((a + a2) / 1000) / 60) / 60) / 24;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public final C4748p5 mo14573S(zzq zzq) {
        String str;
        mo14552f().mo14554h();
        mo14586g();
        C7264i.m27902k(zzq);
        C7264i.m27898g(zzq.f15117d);
        if (!zzq.f15139z.isEmpty()) {
            this.f14621B.put(zzq.f15117d, new C4708l9(this, zzq.f15139z));
        }
        C4687k kVar = this.f14627c;
        m17935R(kVar);
        C4748p5 R = kVar.mo14497R(zzq.f15117d);
        C8245b c = mo14576V(zzq.f15117d).mo23428c(C8245b.m31053b(zzq.f15138y));
        C8243a aVar = C8243a.AD_STORAGE;
        if (c.mo23435i(aVar)) {
            str = this.f14633i.mo14468o(zzq.f15117d, zzq.f15131r);
        } else {
            str = "";
        }
        if (R == null) {
            R = new C4748p5(this.f14636l, zzq.f15117d);
            if (c.mo23435i(C8243a.ANALYTICS_STORAGE)) {
                R.mo14727i(mo14591i0(c));
            }
            if (c.mo23435i(aVar)) {
                R.mo14691G(str);
            }
        } else if (c.mo23435i(aVar) && str != null && !str.equals(R.mo14713b())) {
            R.mo14691G(str);
            if (zzq.f15131r && !"00000000-0000-0000-0000-000000000000".equals(this.f14633i.mo14467n(zzq.f15117d, c).first)) {
                R.mo14727i(mo14591i0(c));
                C4687k kVar2 = this.f14627c;
                m17935R(kVar2);
                if (kVar2.mo14502X(zzq.f15117d, "_id") != null) {
                    C4687k kVar3 = this.f14627c;
                    m17935R(kVar3);
                    if (kVar3.mo14502X(zzq.f15117d, "_lair") == null) {
                        C4763q9 q9Var = new C4763q9(zzq.f15117d, "auto", "_lair", mo14548a().mo23594a(), 1L);
                        C4687k kVar4 = this.f14627c;
                        m17935R(kVar4);
                        kVar4.mo14524x(q9Var);
                    }
                }
            }
        } else if (TextUtils.isEmpty(R.mo14730j0()) && c.mo23435i(C8243a.ANALYTICS_STORAGE)) {
            R.mo14727i(mo14591i0(c));
        }
        R.mo14748x(zzq.f15118e);
        R.mo14723g(zzq.f15133t);
        if (!TextUtils.isEmpty(zzq.f15127n)) {
            R.mo14747w(zzq.f15127n);
        }
        long j = zzq.f15121h;
        if (j != 0) {
            R.mo14749y(j);
        }
        if (!TextUtils.isEmpty(zzq.f15119f)) {
            R.mo14731k(zzq.f15119f);
        }
        R.mo14733l(zzq.f15126m);
        String str2 = zzq.f15120g;
        if (str2 != null) {
            R.mo14729j(str2);
        }
        R.mo14744t(zzq.f15122i);
        R.mo14689E(zzq.f15124k);
        if (!TextUtils.isEmpty(zzq.f15123j)) {
            R.mo14750z(zzq.f15123j);
        }
        R.mo14725h(zzq.f15131r);
        R.mo14690F(zzq.f15134u);
        R.mo14745u(zzq.f15135v);
        C4356pe.m16469c();
        if (mo14575U().mo14398B((String) null, C4636f3.f14389o0) || mo14575U().mo14398B(zzq.f15117d, C4636f3.f14393q0)) {
            R.mo14693I(zzq.f15114A);
        }
        C4286lc.m16235c();
        if (mo14575U().mo14398B((String) null, C4636f3.f14387n0)) {
            R.mo14692H(zzq.f15136w);
        } else {
            C4286lc.m16235c();
            if (mo14575U().mo14398B((String) null, C4636f3.f14385m0)) {
                R.mo14692H((List) null);
            }
        }
        C4523ze.m17322c();
        if (mo14575U().mo14398B((String) null, C4636f3.f14397s0)) {
            R.mo14694J(zzq.f15115B);
        }
        C4423td.m16772c();
        if (mo14575U().mo14398B((String) null, C4636f3.f14337G0)) {
            R.mo14695K(zzq.f15116C);
        }
        if (R.mo14698N()) {
            C4687k kVar5 = this.f14627c;
            m17935R(kVar5);
            kVar5.mo14516p(R);
        }
        return R;
    }

    /* renamed from: T */
    public final C4585b mo14574T() {
        C4585b bVar = this.f14630f;
        m17935R(bVar);
        return bVar;
    }

    /* renamed from: U */
    public final C4643g mo14575U() {
        return ((C4791t4) C7264i.m27902k(this.f14636l)).mo14876z();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public final C8245b mo14576V(String str) {
        String str2;
        C8245b bVar = C8245b.f23454b;
        mo14552f().mo14554h();
        mo14586g();
        C8245b bVar2 = (C8245b) this.f14620A.get(str);
        if (bVar2 != null) {
            return bVar2;
        }
        C4687k kVar = this.f14627c;
        m17935R(kVar);
        C7264i.m27902k(str);
        kVar.mo14554h();
        kVar.mo14301i();
        Cursor cursor = null;
        try {
            Cursor rawQuery = kVar.mo14495P().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
            if (rawQuery.moveToFirst()) {
                str2 = rawQuery.getString(0);
                rawQuery.close();
            } else {
                rawQuery.close();
                str2 = "G1";
            }
            C8245b b = C8245b.m31053b(str2);
            mo14567A(str, b);
            return b;
        } catch (SQLiteException e) {
            kVar.f14613a.mo14551d().mo14675r().mo14617c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: W */
    public final C4687k mo14577W() {
        C4687k kVar = this.f14627c;
        m17935R(kVar);
        return kVar;
    }

    /* renamed from: X */
    public final C4691k3 mo14578X() {
        return this.f14636l.mo14847D();
    }

    /* renamed from: Y */
    public final C4812v3 mo14579Y() {
        C4812v3 v3Var = this.f14626b;
        m17935R(v3Var);
        return v3Var;
    }

    /* renamed from: Z */
    public final C4834x3 mo14580Z() {
        C4834x3 x3Var = this.f14628d;
        if (x3Var != null) {
            return x3Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: a */
    public final C8404f mo14548a() {
        return ((C4791t4) C7264i.m27902k(this.f14636l)).mo14548a();
    }

    /* renamed from: a0 */
    public final C4725n4 mo14581a0() {
        C4725n4 n4Var = this.f14625a;
        m17935R(n4Var);
        return n4Var;
    }

    /* renamed from: b */
    public final C4597c mo14549b() {
        throw null;
    }

    /* renamed from: c */
    public final Context mo14550c() {
        return this.f14636l.mo14550c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final C4791t4 mo14582c0() {
        return this.f14636l;
    }

    /* renamed from: d */
    public final C4746p3 mo14551d() {
        return ((C4791t4) C7264i.m27902k(this.f14636l)).mo14551d();
    }

    /* renamed from: d0 */
    public final C4837x6 mo14583d0() {
        C4837x6 x6Var = this.f14632h;
        m17935R(x6Var);
        return x6Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo14584e() {
        mo14552f().mo14554h();
        mo14586g();
        if (!this.f14638n) {
            this.f14638n = true;
            if (mo14571E()) {
                FileChannel fileChannel = this.f14647w;
                mo14552f().mo14554h();
                int i = 0;
                if (fileChannel == null || !fileChannel.isOpen()) {
                    mo14551d().mo14675r().mo14615a("Bad channel to read from");
                } else {
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    try {
                        fileChannel.position(0);
                        int read = fileChannel.read(allocate);
                        if (read == 4) {
                            allocate.flip();
                            i = allocate.getInt();
                        } else if (read != -1) {
                            mo14551d().mo14680w().mo14616b("Unexpected data length. Bytes read", Integer.valueOf(read));
                        }
                    } catch (IOException e) {
                        mo14551d().mo14675r().mo14616b("Failed to read from channel", e);
                    }
                }
                int p = this.f14636l.mo14845B().mo14443p();
                mo14552f().mo14554h();
                if (i > p) {
                    mo14551d().mo14675r().mo14617c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(p));
                } else if (i < p) {
                    FileChannel fileChannel2 = this.f14647w;
                    mo14552f().mo14554h();
                    if (fileChannel2 == null || !fileChannel2.isOpen()) {
                        mo14551d().mo14675r().mo14615a("Bad channel to read from");
                    } else {
                        ByteBuffer allocate2 = ByteBuffer.allocate(4);
                        allocate2.putInt(p);
                        allocate2.flip();
                        try {
                            fileChannel2.truncate(0);
                            fileChannel2.write(allocate2);
                            fileChannel2.force(true);
                            if (fileChannel2.size() != 4) {
                                mo14551d().mo14675r().mo14616b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                            }
                            mo14551d().mo14679v().mo14617c("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(p));
                            return;
                        } catch (IOException e2) {
                            mo14551d().mo14675r().mo14616b("Failed to write to channel", e2);
                        }
                    }
                    mo14551d().mo14675r().mo14617c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(p));
                }
            }
        }
    }

    /* renamed from: e0 */
    public final C4674i8 mo14585e0() {
        return this.f14633i;
    }

    /* renamed from: f */
    public final C4769r4 mo14552f() {
        return ((C4791t4) C7264i.m27902k(this.f14636l)).mo14552f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo14586g() {
        if (!this.f14637m) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* renamed from: g0 */
    public final C4741o9 mo14587g0() {
        C4741o9 o9Var = this.f14631g;
        m17935R(o9Var);
        return o9Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo14588h(String str, C4414t4 t4Var) {
        int w;
        int indexOf;
        C4725n4 n4Var = this.f14625a;
        m17935R(n4Var);
        Set y = n4Var.mo14638y(str);
        if (y != null) {
            t4Var.mo13630z0(y);
        }
        C4725n4 n4Var2 = this.f14625a;
        m17935R(n4Var2);
        if (n4Var2.mo14628J(str)) {
            t4Var.mo13571G0();
        }
        C4725n4 n4Var3 = this.f14625a;
        m17935R(n4Var3);
        if (n4Var3.mo14631M(str)) {
            if (mo14575U().mo14398B(str, C4636f3.f14399t0)) {
                String n0 = t4Var.mo13612n0();
                if (!TextUtils.isEmpty(n0) && (indexOf = n0.indexOf(".")) != -1) {
                    t4Var.mo13590Q(n0.substring(0, indexOf));
                }
            } else {
                t4Var.mo13581L0();
            }
        }
        C4725n4 n4Var4 = this.f14625a;
        m17935R(n4Var4);
        if (n4Var4.mo14632N(str) && (w = C4741o9.m18067w(t4Var, "_id")) != -1) {
            t4Var.mo13616q(w);
        }
        C4725n4 n4Var5 = this.f14625a;
        m17935R(n4Var5);
        if (n4Var5.mo14630L(str)) {
            t4Var.mo13573H0();
        }
        C4725n4 n4Var6 = this.f14625a;
        m17935R(n4Var6);
        if (n4Var6.mo14627I(str)) {
            t4Var.mo13567E0();
            C4708l9 l9Var = (C4708l9) this.f14621B.get(str);
            if (l9Var == null || l9Var.f14599b + mo14575U().mo14412r(str, C4636f3.f14355V) < mo14548a().mo23596c()) {
                l9Var = new C4708l9(this);
                this.f14621B.put(str, l9Var);
            }
            t4Var.mo13576J(l9Var.f14598a);
        }
        C4725n4 n4Var7 = this.f14625a;
        m17935R(n4Var7);
        if (n4Var7.mo14629K(str)) {
            t4Var.mo13589P0();
        }
    }

    /* renamed from: h0 */
    public final C4785s9 mo14589h0() {
        return ((C4791t4) C7264i.m27902k(this.f14636l)).mo14856N();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo14590i(C4748p5 p5Var) {
        mo14552f().mo14554h();
        if (!TextUtils.isEmpty(p5Var.mo14738n0()) || !TextUtils.isEmpty(p5Var.mo14724g0())) {
            C4607c9 c9Var = this.f14634j;
            Uri.Builder builder = new Uri.Builder();
            String n0 = p5Var.mo14738n0();
            if (TextUtils.isEmpty(n0)) {
                n0 = p5Var.mo14724g0();
            }
            ArrayMap arrayMap = null;
            Uri.Builder appendQueryParameter = builder.scheme((String) C4636f3.f14372g.mo14346a((Object) null)).encodedAuthority((String) C4636f3.f14374h.mo14346a((Object) null)).path("config/app/".concat(String.valueOf(n0))).appendQueryParameter(C11772k.C11773a.f34170b, "android");
            c9Var.f14613a.mo14876z().mo14411q();
            appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(77000)).appendQueryParameter("runtime_version", BankApiResponse.SUCCESSFUL_RESPONSE_CODE);
            String uri = builder.build().toString();
            try {
                String str = (String) C7264i.m27902k(p5Var.mo14728i0());
                URL url = new URL(uri);
                mo14551d().mo14679v().mo14616b("Fetching remote configuration", str);
                C4725n4 n4Var = this.f14625a;
                m17935R(n4Var);
                C4447v3 t = n4Var.mo14634t(str);
                C4725n4 n4Var2 = this.f14625a;
                m17935R(n4Var2);
                String v = n4Var2.mo14636v(str);
                if (t != null) {
                    if (!TextUtils.isEmpty(v)) {
                        ArrayMap arrayMap2 = new ArrayMap();
                        arrayMap2.put("If-Modified-Since", v);
                        arrayMap = arrayMap2;
                    }
                    C4725n4 n4Var3 = this.f14625a;
                    m17935R(n4Var3);
                    String u = n4Var3.mo14635u(str);
                    if (!TextUtils.isEmpty(u)) {
                        if (arrayMap == null) {
                            arrayMap = new ArrayMap();
                        }
                        arrayMap.put("If-None-Match", u);
                    }
                }
                this.f14643s = true;
                C4812v3 v3Var = this.f14626b;
                m17935R(v3Var);
                C4642f9 f9Var = new C4642f9(this);
                v3Var.mo14554h();
                v3Var.mo14301i();
                C7264i.m27902k(url);
                C7264i.m27902k(f9Var);
                v3Var.f14613a.mo14552f().mo14775y(new C4790t3(v3Var, str, url, (byte[]) null, arrayMap, f9Var));
            } catch (MalformedURLException unused) {
                mo14551d().mo14675r().mo14617c("Failed to parse config URL. Not fetching. appId", C4746p3.m18094z(p5Var.mo14728i0()), uri);
            }
        } else {
            mo14598n((String) C7264i.m27902k(p5Var.mo14728i0()), 204, (Throwable) null, (byte[]) null, (Map) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public final String mo14591i0(C8245b bVar) {
        if (!bVar.mo23435i(C8243a.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        mo14589h0().mo14832u().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo14592j(zzaw zzaw, zzq zzq) {
        zzaw zzaw2;
        List<zzac> list;
        List<zzac> list2;
        List<zzac> list3;
        String str;
        zzq zzq2 = zzq;
        C7264i.m27902k(zzq);
        C7264i.m27898g(zzq2.f15117d);
        mo14552f().mo14554h();
        mo14586g();
        String str2 = zzq2.f15117d;
        long j = zzaw.f15106g;
        C4757q3 b = C4757q3.m18181b(zzaw);
        mo14552f().mo14554h();
        C4848y6 y6Var = null;
        if (!(this.f14622C == null || (str = this.f14623D) == null || !str.equals(str2))) {
            y6Var = this.f14622C;
        }
        C4785s9.m18233y(y6Var, b.f14787d, false);
        zzaw a = b.mo14758a();
        m17935R(this.f14631g);
        if (C4741o9.m18057m(a, zzq2)) {
            if (!zzq2.f15124k) {
                mo14573S(zzq2);
                return;
            }
            List list4 = zzq2.f15136w;
            if (list4 == null) {
                zzaw2 = a;
            } else if (list4.contains(a.f15103d)) {
                Bundle x = a.f15104e.mo14991x();
                x.putLong("ga_safelisted", 1);
                zzaw2 = new zzaw(a.f15103d, new zzau(x), a.f15105f, a.f15106g);
            } else {
                mo14551d().mo14674q().mo14618d("Dropping non-safelisted event. appId, event name, origin", str2, a.f15103d, a.f15105f);
                return;
            }
            C4687k kVar = this.f14627c;
            m17935R(kVar);
            kVar.mo14509e0();
            try {
                C4687k kVar2 = this.f14627c;
                m17935R(kVar2);
                C7264i.m27898g(str2);
                kVar2.mo14554h();
                kVar2.mo14301i();
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i < 0) {
                    kVar2.f14613a.mo14551d().mo14680w().mo14617c("Invalid time querying timed out conditional properties", C4746p3.m18094z(str2), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = kVar2.mo14506b0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (zzac zzac : list) {
                    if (zzac != null) {
                        mo14551d().mo14679v().mo14618d("User property timed out", zzac.f15091d, this.f14636l.mo14847D().mo14530f(zzac.f15093f.f15108e), zzac.f15093f.mo14994v());
                        zzaw zzaw3 = zzac.f15097j;
                        if (zzaw3 != null) {
                            mo14570D(new zzaw(zzaw3, j), zzq2);
                        }
                        C4687k kVar3 = this.f14627c;
                        m17935R(kVar3);
                        kVar3.mo14490J(str2, zzac.f15093f.f15108e);
                    }
                }
                C4687k kVar4 = this.f14627c;
                m17935R(kVar4);
                C7264i.m27898g(str2);
                kVar4.mo14554h();
                kVar4.mo14301i();
                if (i < 0) {
                    kVar4.f14613a.mo14551d().mo14680w().mo14617c("Invalid time querying expired conditional properties", C4746p3.m18094z(str2), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = kVar4.mo14506b0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList<zzaw> arrayList = new ArrayList<>(list2.size());
                for (zzac zzac2 : list2) {
                    if (zzac2 != null) {
                        mo14551d().mo14679v().mo14618d("User property expired", zzac2.f15091d, this.f14636l.mo14847D().mo14530f(zzac2.f15093f.f15108e), zzac2.f15093f.mo14994v());
                        C4687k kVar5 = this.f14627c;
                        m17935R(kVar5);
                        kVar5.mo14513m(str2, zzac2.f15093f.f15108e);
                        zzaw zzaw4 = zzac2.f15101n;
                        if (zzaw4 != null) {
                            arrayList.add(zzaw4);
                        }
                        C4687k kVar6 = this.f14627c;
                        m17935R(kVar6);
                        kVar6.mo14490J(str2, zzac2.f15093f.f15108e);
                    }
                }
                for (zzaw zzaw5 : arrayList) {
                    mo14570D(new zzaw(zzaw5, j), zzq2);
                }
                C4687k kVar7 = this.f14627c;
                m17935R(kVar7);
                String str3 = zzaw2.f15103d;
                C7264i.m27898g(str2);
                C7264i.m27898g(str3);
                kVar7.mo14554h();
                kVar7.mo14301i();
                if (i < 0) {
                    kVar7.f14613a.mo14551d().mo14680w().mo14618d("Invalid time querying triggered conditional properties", C4746p3.m18094z(str2), kVar7.f14613a.mo14847D().mo14528d(str3), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = kVar7.mo14506b0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
                }
                ArrayList<zzaw> arrayList2 = new ArrayList<>(list3.size());
                for (zzac zzac3 : list3) {
                    if (zzac3 != null) {
                        zzlj zzlj = zzac3.f15093f;
                        C4763q9 q9Var = new C4763q9((String) C7264i.m27902k(zzac3.f15091d), zzac3.f15092e, zzlj.f15108e, j, C7264i.m27902k(zzlj.mo14994v()));
                        C4687k kVar8 = this.f14627c;
                        m17935R(kVar8);
                        if (kVar8.mo14524x(q9Var)) {
                            mo14551d().mo14679v().mo14618d("User property triggered", zzac3.f15091d, this.f14636l.mo14847D().mo14530f(q9Var.f14804c), q9Var.f14806e);
                        } else {
                            mo14551d().mo14675r().mo14618d("Too many active user properties, ignoring", C4746p3.m18094z(zzac3.f15091d), this.f14636l.mo14847D().mo14530f(q9Var.f14804c), q9Var.f14806e);
                        }
                        zzaw zzaw6 = zzac3.f15099l;
                        if (zzaw6 != null) {
                            arrayList2.add(zzaw6);
                        }
                        zzac3.f15093f = new zzlj(q9Var);
                        zzac3.f15095h = true;
                        C4687k kVar9 = this.f14627c;
                        m17935R(kVar9);
                        kVar9.mo14523w(zzac3);
                    }
                }
                mo14570D(zzaw2, zzq2);
                for (zzaw zzaw7 : arrayList2) {
                    mo14570D(new zzaw(zzaw7, j), zzq2);
                }
                C4687k kVar10 = this.f14627c;
                m17935R(kVar10);
                kVar10.mo14515o();
            } finally {
                C4687k kVar11 = this.f14627c;
                m17935R(kVar11);
                kVar11.mo14510f0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final String mo14593j0(zzq zzq) {
        try {
            return (String) mo14552f().mo14773s(new C4653g9(this, zzq)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            mo14551d().mo14675r().mo14617c("Failed to get app instance id. appId", C4746p3.m18094z(zzq.f15117d), e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo14594k(zzaw zzaw, String str) {
        zzaw zzaw2 = zzaw;
        String str2 = str;
        C4687k kVar = this.f14627c;
        m17935R(kVar);
        C4748p5 R = kVar.mo14497R(str2);
        if (R == null || TextUtils.isEmpty(R.mo14734l0())) {
            mo14551d().mo14674q().mo14616b("No app data available; dropping event", str2);
            return;
        }
        Boolean J = m17927J(R);
        if (J == null) {
            if (!"_ui".equals(zzaw2.f15103d)) {
                mo14551d().mo14680w().mo14616b("Could not find package. appId", C4746p3.m18094z(str));
            }
        } else if (!J.booleanValue()) {
            mo14551d().mo14675r().mo14616b("App version does not match; dropping event. appId", C4746p3.m18094z(str));
            return;
        }
        String n0 = R.mo14738n0();
        String l0 = R.mo14734l0();
        long P = R.mo14700P();
        String k0 = R.mo14732k0();
        long a0 = R.mo14712a0();
        long X = R.mo14708X();
        zzq zzq = r2;
        boolean M = R.mo14697M();
        C4748p5 p5Var = R;
        String m0 = p5Var.mo14736m0();
        p5Var.mo14685A();
        zzq zzq2 = new zzq(str, n0, l0, P, k0, a0, X, (String) null, M, false, m0, 0, 0, 0, p5Var.mo14696L(), false, p5Var.mo14724g0(), p5Var.mo14722f0(), p5Var.mo14709Y(), p5Var.mo14717d(), (String) null, mo14576V(str2).mo23433h(), "", (String) null, p5Var.mo14699O(), p5Var.mo14720e0());
        mo14595l(zzaw2, zzq);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo14595l(zzaw zzaw, zzq zzq) {
        C7264i.m27898g(zzq.f15117d);
        C4757q3 b = C4757q3.m18181b(zzaw);
        C4785s9 h0 = mo14589h0();
        Bundle bundle = b.f14787d;
        C4687k kVar = this.f14627c;
        m17935R(kVar);
        h0.mo14840z(bundle, kVar.mo14496Q(zzq.f15117d));
        mo14589h0().mo14794B(b, mo14575U().mo14408n(zzq.f15117d));
        zzaw a = b.mo14758a();
        if ("_cmp".equals(a.f15103d) && "referrer API v2".equals(a.f15104e.mo14987s0("_cis"))) {
            String s0 = a.f15104e.mo14987s0("gclid");
            if (!TextUtils.isEmpty(s0)) {
                mo14568B(new zzlj("_lgclid", a.f15106g, s0, "auto"), zzq);
            }
        }
        mo14592j(a, zzq);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public final void mo14596l0(Runnable runnable) {
        mo14552f().mo14554h();
        if (this.f14640p == null) {
            this.f14640p = new ArrayList();
        }
        this.f14640p.add(runnable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo14597m() {
        this.f14642r++;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049 A[Catch:{ all -> 0x0176, all -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c A[Catch:{ all -> 0x0176, all -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0129 A[Catch:{ all -> 0x0176, all -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0137 A[Catch:{ all -> 0x0176, all -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0159 A[Catch:{ all -> 0x0176, all -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x015d A[Catch:{ all -> 0x0176, all -> 0x0180 }] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14598n(java.lang.String r8, int r9, java.lang.Throwable r10, byte[] r11, java.util.Map r12) {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.r4 r0 = r7.mo14552f()
            r0.mo14554h()
            r7.mo14586g()
            p182n6.C7264i.m27898g(r8)
            r0 = 0
            if (r11 != 0) goto L_0x0012
            byte[] r11 = new byte[r0]     // Catch:{ all -> 0x0180 }
        L_0x0012:
            com.google.android.gms.measurement.internal.p3 r1 = r7.mo14551d()     // Catch:{ all -> 0x0180 }
            com.google.android.gms.measurement.internal.n3 r1 = r1.mo14679v()     // Catch:{ all -> 0x0180 }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r11.length     // Catch:{ all -> 0x0180 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0180 }
            r1.mo14616b(r2, r3)     // Catch:{ all -> 0x0180 }
            com.google.android.gms.measurement.internal.k r1 = r7.f14627c     // Catch:{ all -> 0x0180 }
            m17935R(r1)     // Catch:{ all -> 0x0180 }
            r1.mo14509e0()     // Catch:{ all -> 0x0180 }
            com.google.android.gms.measurement.internal.k r1 = r7.f14627c     // Catch:{ all -> 0x0176 }
            m17935R(r1)     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.p5 r1 = r1.mo14497R(r8)     // Catch:{ all -> 0x0176 }
            r2 = 200(0xc8, float:2.8E-43)
            r4 = 304(0x130, float:4.26E-43)
            if (r9 == r2) goto L_0x0042
            r2 = 204(0xcc, float:2.86E-43)
            if (r9 == r2) goto L_0x0042
            if (r9 != r4) goto L_0x0046
            r9 = r4
        L_0x0042:
            if (r10 != 0) goto L_0x0046
            r2 = 1
            goto L_0x0047
        L_0x0046:
            r2 = r0
        L_0x0047:
            if (r1 != 0) goto L_0x005c
            com.google.android.gms.measurement.internal.p3 r9 = r7.mo14551d()     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.n3 r9 = r9.mo14680w()     // Catch:{ all -> 0x0176 }
            java.lang.String r10 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r8)     // Catch:{ all -> 0x0176 }
            r9.mo14616b(r10, r8)     // Catch:{ all -> 0x0176 }
            goto L_0x0160
        L_0x005c:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00ba
            if (r9 != r5) goto L_0x0063
            goto L_0x00ba
        L_0x0063:
            t6.f r11 = r7.mo14548a()     // Catch:{ all -> 0x0176 }
            long r11 = r11.mo23594a()     // Catch:{ all -> 0x0176 }
            r1.mo14746v(r11)     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.k r11 = r7.f14627c     // Catch:{ all -> 0x0176 }
            m17935R(r11)     // Catch:{ all -> 0x0176 }
            r11.mo14516p(r1)     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.p3 r11 = r7.mo14551d()     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.n3 r11 = r11.mo14679v()     // Catch:{ all -> 0x0176 }
            java.lang.String r12 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0176 }
            r11.mo14617c(r12, r1, r10)     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.n4 r10 = r7.f14625a     // Catch:{ all -> 0x0176 }
            m17935R(r10)     // Catch:{ all -> 0x0176 }
            r10.mo14639z(r8)     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.i8 r8 = r7.f14633i     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.a4 r8 = r8.f14524h     // Catch:{ all -> 0x0176 }
            t6.f r10 = r7.mo14548a()     // Catch:{ all -> 0x0176 }
            long r10 = r10.mo23594a()     // Catch:{ all -> 0x0176 }
            r8.mo14296b(r10)     // Catch:{ all -> 0x0176 }
            r8 = 503(0x1f7, float:7.05E-43)
            if (r9 == r8) goto L_0x00a6
            r8 = 429(0x1ad, float:6.01E-43)
            if (r9 != r8) goto L_0x00b5
        L_0x00a6:
            com.google.android.gms.measurement.internal.i8 r8 = r7.f14633i     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.a4 r8 = r8.f14522f     // Catch:{ all -> 0x0176 }
            t6.f r9 = r7.mo14548a()     // Catch:{ all -> 0x0176 }
            long r9 = r9.mo23594a()     // Catch:{ all -> 0x0176 }
            r8.mo14296b(r9)     // Catch:{ all -> 0x0176 }
        L_0x00b5:
            r7.m17930M()     // Catch:{ all -> 0x0176 }
            goto L_0x0160
        L_0x00ba:
            r10 = 0
            if (r12 == 0) goto L_0x00c6
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r2 = r12.get(r2)     // Catch:{ all -> 0x0176 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x0176 }
            goto L_0x00c7
        L_0x00c6:
            r2 = r10
        L_0x00c7:
            if (r2 == 0) goto L_0x00d6
            boolean r6 = r2.isEmpty()     // Catch:{ all -> 0x0176 }
            if (r6 != 0) goto L_0x00d6
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x0176 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0176 }
            goto L_0x00d7
        L_0x00d6:
            r2 = r10
        L_0x00d7:
            if (r12 == 0) goto L_0x00e2
            java.lang.String r6 = "ETag"
            java.lang.Object r12 = r12.get(r6)     // Catch:{ all -> 0x0176 }
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x0176 }
            goto L_0x00e3
        L_0x00e2:
            r12 = r10
        L_0x00e3:
            if (r12 == 0) goto L_0x00f2
            boolean r6 = r12.isEmpty()     // Catch:{ all -> 0x0176 }
            if (r6 != 0) goto L_0x00f2
            java.lang.Object r12 = r12.get(r0)     // Catch:{ all -> 0x0176 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0176 }
            goto L_0x00f3
        L_0x00f2:
            r12 = r10
        L_0x00f3:
            if (r9 == r5) goto L_0x0101
            if (r9 != r4) goto L_0x00f8
            goto L_0x0101
        L_0x00f8:
            com.google.android.gms.measurement.internal.n4 r10 = r7.f14625a     // Catch:{ all -> 0x0176 }
            m17935R(r10)     // Catch:{ all -> 0x0176 }
            r10.mo14626H(r8, r11, r2, r12)     // Catch:{ all -> 0x0176 }
            goto L_0x0114
        L_0x0101:
            com.google.android.gms.measurement.internal.n4 r11 = r7.f14625a     // Catch:{ all -> 0x0176 }
            m17935R(r11)     // Catch:{ all -> 0x0176 }
            com.google.android.gms.internal.measurement.v3 r11 = r11.mo14634t(r8)     // Catch:{ all -> 0x0176 }
            if (r11 != 0) goto L_0x0114
            com.google.android.gms.measurement.internal.n4 r11 = r7.f14625a     // Catch:{ all -> 0x0176 }
            m17935R(r11)     // Catch:{ all -> 0x0176 }
            r11.mo14626H(r8, r10, r10, r10)     // Catch:{ all -> 0x0176 }
        L_0x0114:
            t6.f r10 = r7.mo14548a()     // Catch:{ all -> 0x0176 }
            long r10 = r10.mo23594a()     // Catch:{ all -> 0x0176 }
            r1.mo14735m(r10)     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.k r10 = r7.f14627c     // Catch:{ all -> 0x0176 }
            m17935R(r10)     // Catch:{ all -> 0x0176 }
            r10.mo14516p(r1)     // Catch:{ all -> 0x0176 }
            if (r9 != r5) goto L_0x0137
            com.google.android.gms.measurement.internal.p3 r9 = r7.mo14551d()     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.n3 r9 = r9.mo14681x()     // Catch:{ all -> 0x0176 }
            java.lang.String r10 = "Config not found. Using empty config. appId"
            r9.mo14616b(r10, r8)     // Catch:{ all -> 0x0176 }
            goto L_0x0148
        L_0x0137:
            com.google.android.gms.measurement.internal.p3 r8 = r7.mo14551d()     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.n3 r8 = r8.mo14679v()     // Catch:{ all -> 0x0176 }
            java.lang.String r10 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0176 }
            r8.mo14617c(r10, r9, r3)     // Catch:{ all -> 0x0176 }
        L_0x0148:
            com.google.android.gms.measurement.internal.v3 r8 = r7.f14626b     // Catch:{ all -> 0x0176 }
            m17935R(r8)     // Catch:{ all -> 0x0176 }
            boolean r8 = r8.mo14935m()     // Catch:{ all -> 0x0176 }
            if (r8 == 0) goto L_0x015d
            boolean r8 = r7.m17932O()     // Catch:{ all -> 0x0176 }
            if (r8 == 0) goto L_0x015d
            r7.mo14569C()     // Catch:{ all -> 0x0176 }
            goto L_0x0160
        L_0x015d:
            r7.m17930M()     // Catch:{ all -> 0x0176 }
        L_0x0160:
            com.google.android.gms.measurement.internal.k r8 = r7.f14627c     // Catch:{ all -> 0x0176 }
            m17935R(r8)     // Catch:{ all -> 0x0176 }
            r8.mo14515o()     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.k r8 = r7.f14627c     // Catch:{ all -> 0x0180 }
            m17935R(r8)     // Catch:{ all -> 0x0180 }
            r8.mo14510f0()     // Catch:{ all -> 0x0180 }
            r7.f14643s = r0
            r7.m17928K()
            return
        L_0x0176:
            r8 = move-exception
            com.google.android.gms.measurement.internal.k r9 = r7.f14627c     // Catch:{ all -> 0x0180 }
            m17935R(r9)     // Catch:{ all -> 0x0180 }
            r9.mo14510f0()     // Catch:{ all -> 0x0180 }
            throw r8     // Catch:{ all -> 0x0180 }
        L_0x0180:
            r8 = move-exception
            r7.f14643s = r0
            r7.m17928K()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4719m9.mo14598n(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo14599o(boolean z) {
        m17930M();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo14600p(int i, Throwable th, byte[] bArr, String str) {
        C4687k kVar;
        mo14552f().mo14554h();
        mo14586g();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f14644t = false;
                m17928K();
                throw th2;
            }
        }
        List<Long> list = (List) C7264i.m27902k(this.f14648x);
        this.f14648x = null;
        if (i != 200) {
            if (i == 204) {
                i = 204;
            }
            mo14551d().mo14679v().mo14617c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.f14633i.f14524h.mo14296b(mo14548a().mo23594a());
            if (i == 503 || i == 429) {
                this.f14633i.f14522f.mo14296b(mo14548a().mo23594a());
            }
            C4687k kVar2 = this.f14627c;
            m17935R(kVar2);
            kVar2.mo14511g0(list);
            m17930M();
            this.f14644t = false;
            m17928K();
        }
        if (th == null) {
            try {
                this.f14633i.f14523g.mo14296b(mo14548a().mo23594a());
                this.f14633i.f14524h.mo14296b(0);
                m17930M();
                mo14551d().mo14679v().mo14617c("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                C4687k kVar3 = this.f14627c;
                m17935R(kVar3);
                kVar3.mo14509e0();
                try {
                    for (Long l : list) {
                        try {
                            kVar = this.f14627c;
                            m17935R(kVar);
                            long longValue = l.longValue();
                            kVar.mo14554h();
                            kVar.mo14301i();
                            if (kVar.mo14495P().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            kVar.f14613a.mo14551d().mo14675r().mo14616b("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            List list2 = this.f14649y;
                            if (list2 == null || !list2.contains(l)) {
                                throw e2;
                            }
                        }
                    }
                    C4687k kVar4 = this.f14627c;
                    m17935R(kVar4);
                    kVar4.mo14515o();
                    C4687k kVar5 = this.f14627c;
                    m17935R(kVar5);
                    kVar5.mo14510f0();
                    this.f14649y = null;
                    C4812v3 v3Var = this.f14626b;
                    m17935R(v3Var);
                    if (!v3Var.mo14935m() || !m17932O()) {
                        this.f14650z = -1;
                        m17930M();
                    } else {
                        mo14569C();
                    }
                    this.f14639o = 0;
                } catch (Throwable th3) {
                    C4687k kVar6 = this.f14627c;
                    m17935R(kVar6);
                    kVar6.mo14510f0();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                mo14551d().mo14675r().mo14616b("Database error while trying to delete uploaded bundles", e3);
                this.f14639o = mo14548a().mo23596c();
                mo14551d().mo14679v().mo14616b("Disable upload, time", Long.valueOf(this.f14639o));
            }
            this.f14644t = false;
            m17928K();
        }
        mo14551d().mo14679v().mo14617c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
        this.f14633i.f14524h.mo14296b(mo14548a().mo23594a());
        this.f14633i.f14522f.mo14296b(mo14548a().mo23594a());
        C4687k kVar22 = this.f14627c;
        m17935R(kVar22);
        kVar22.mo14511g0(list);
        m17930M();
        this.f14644t = false;
        m17928K();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x03d7 A[Catch:{ RuntimeException -> 0x035f, all -> 0x056f }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0403 A[Catch:{ RuntimeException -> 0x035f, all -> 0x056f }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0418 A[SYNTHETIC, Splitter:B:137:0x0418] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x04ba A[Catch:{ RuntimeException -> 0x035f, all -> 0x056f }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x04da A[Catch:{ RuntimeException -> 0x035f, all -> 0x056f }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x053f A[Catch:{ RuntimeException -> 0x035f, all -> 0x056f }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0126 A[Catch:{ RuntimeException -> 0x035f, all -> 0x056f }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ef A[Catch:{ RuntimeException -> 0x035f, all -> 0x056f }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f5 A[Catch:{ RuntimeException -> 0x035f, all -> 0x056f }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x024e A[Catch:{ RuntimeException -> 0x035f, all -> 0x056f }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x025d A[Catch:{ RuntimeException -> 0x035f, all -> 0x056f }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x026d A[Catch:{ RuntimeException -> 0x035f, all -> 0x056f }] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14601q(com.google.android.gms.measurement.internal.zzq r24) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "com.android.vending"
            java.lang.String r6 = "_pfo"
            java.lang.String r0 = "_npa"
            java.lang.String r7 = "_uwa"
            java.lang.String r8 = "app_id=?"
            com.google.android.gms.measurement.internal.r4 r9 = r23.mo14552f()
            r9.mo14554h()
            r23.mo14586g()
            p182n6.C7264i.m27902k(r24)
            java.lang.String r9 = r2.f15117d
            p182n6.C7264i.m27898g(r9)
            boolean r9 = m17934Q(r24)
            if (r9 == 0) goto L_0x0579
            com.google.android.gms.measurement.internal.k r9 = r1.f14627c
            m17935R(r9)
            java.lang.String r10 = r2.f15117d
            com.google.android.gms.measurement.internal.p5 r9 = r9.mo14497R(r10)
            r10 = 0
            if (r9 == 0) goto L_0x0060
            java.lang.String r12 = r9.mo14738n0()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x0060
            java.lang.String r12 = r2.f15118e
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x0060
            r9.mo14735m(r10)
            com.google.android.gms.measurement.internal.k r12 = r1.f14627c
            m17935R(r12)
            r12.mo14516p(r9)
            com.google.android.gms.measurement.internal.n4 r9 = r1.f14625a
            m17935R(r9)
            java.lang.String r12 = r2.f15117d
            r9.mo14619A(r12)
        L_0x0060:
            boolean r9 = r2.f15124k
            if (r9 != 0) goto L_0x0068
            r23.mo14573S(r24)
            return
        L_0x0068:
            long r12 = r2.f15129p
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x0076
            t6.f r9 = r23.mo14548a()
            long r12 = r9.mo23594a()
        L_0x0076:
            com.google.android.gms.measurement.internal.t4 r9 = r1.f14636l
            com.google.android.gms.measurement.internal.o r9 = r9.mo14844A()
            r9.mo14650r()
            int r9 = r2.f15130q
            r15 = 1
            if (r9 == 0) goto L_0x009e
            if (r9 == r15) goto L_0x009e
            com.google.android.gms.measurement.internal.p3 r16 = r23.mo14551d()
            com.google.android.gms.measurement.internal.n3 r14 = r16.mo14680w()
            java.lang.String r10 = r2.f15117d
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r11 = "Incorrect app type, assuming installed app. appId, appType"
            r14.mo14617c(r11, r10, r9)
            r9 = 0
        L_0x009e:
            com.google.android.gms.measurement.internal.k r10 = r1.f14627c
            m17935R(r10)
            r10.mo14509e0()
            com.google.android.gms.measurement.internal.k r10 = r1.f14627c     // Catch:{ all -> 0x056f }
            m17935R(r10)     // Catch:{ all -> 0x056f }
            java.lang.String r11 = r2.f15117d     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.q9 r10 = r10.mo14502X(r11, r0)     // Catch:{ all -> 0x056f }
            r11 = r3
            r20 = r4
            if (r10 == 0) goto L_0x00c3
            java.lang.String r14 = "auto"
            java.lang.String r3 = r10.f14803b     // Catch:{ all -> 0x056f }
            boolean r3 = r14.equals(r3)     // Catch:{ all -> 0x056f }
            if (r3 == 0) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            r4 = r15
            goto L_0x00fd
        L_0x00c3:
            java.lang.Boolean r3 = r2.f15134u     // Catch:{ all -> 0x056f }
            if (r3 == 0) goto L_0x00f7
            com.google.android.gms.measurement.internal.zzlj r0 = new com.google.android.gms.measurement.internal.zzlj     // Catch:{ all -> 0x056f }
            java.lang.String r3 = "_npa"
            java.lang.Boolean r4 = r2.f15134u     // Catch:{ all -> 0x056f }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x056f }
            if (r15 == r4) goto L_0x00d6
            r18 = 0
            goto L_0x00d8
        L_0x00d6:
            r18 = 1
        L_0x00d8:
            java.lang.Long r18 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x056f }
            java.lang.String r19 = "auto"
            r4 = 0
            r14 = r0
            r4 = r15
            r15 = r3
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x056f }
            if (r10 == 0) goto L_0x00f3
            java.lang.Object r3 = r10.f14806e     // Catch:{ all -> 0x056f }
            java.lang.Long r10 = r0.f15110g     // Catch:{ all -> 0x056f }
            boolean r3 = r3.equals(r10)     // Catch:{ all -> 0x056f }
            if (r3 != 0) goto L_0x00fd
        L_0x00f3:
            r1.mo14568B(r0, r2)     // Catch:{ all -> 0x056f }
            goto L_0x00fd
        L_0x00f7:
            r4 = r15
            if (r10 == 0) goto L_0x00fd
            r1.mo14605u(r0, r2)     // Catch:{ all -> 0x056f }
        L_0x00fd:
            com.google.android.gms.measurement.internal.k r0 = r1.f14627c     // Catch:{ all -> 0x056f }
            m17935R(r0)     // Catch:{ all -> 0x056f }
            java.lang.String r3 = r2.f15117d     // Catch:{ all -> 0x056f }
            java.lang.Object r3 = p182n6.C7264i.m27902k(r3)     // Catch:{ all -> 0x056f }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.p5 r0 = r0.mo14497R(r3)     // Catch:{ all -> 0x056f }
            if (r0 == 0) goto L_0x01ef
            com.google.android.gms.measurement.internal.s9 r10 = r23.mo14589h0()     // Catch:{ all -> 0x056f }
            java.lang.String r14 = r2.f15118e     // Catch:{ all -> 0x056f }
            java.lang.String r15 = r0.mo14738n0()     // Catch:{ all -> 0x056f }
            java.lang.String r3 = r2.f15133t     // Catch:{ all -> 0x056f }
            java.lang.String r4 = r0.mo14724g0()     // Catch:{ all -> 0x056f }
            boolean r3 = r10.mo14817d0(r14, r15, r3, r4)     // Catch:{ all -> 0x056f }
            if (r3 == 0) goto L_0x01ef
            com.google.android.gms.measurement.internal.p3 r3 = r23.mo14551d()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.n3 r3 = r3.mo14680w()     // Catch:{ all -> 0x056f }
            java.lang.String r4 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r10 = r0.mo14728i0()     // Catch:{ all -> 0x056f }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r10)     // Catch:{ all -> 0x056f }
            r3.mo14616b(r4, r10)     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.k r3 = r1.f14627c     // Catch:{ all -> 0x056f }
            m17935R(r3)     // Catch:{ all -> 0x056f }
            java.lang.String r4 = r0.mo14728i0()     // Catch:{ all -> 0x056f }
            r3.mo14301i()     // Catch:{ all -> 0x056f }
            r3.mo14554h()     // Catch:{ all -> 0x056f }
            p182n6.C7264i.m27898g(r4)     // Catch:{ all -> 0x056f }
            android.database.sqlite.SQLiteDatabase r0 = r3.mo14495P()     // Catch:{ SQLiteException -> 0x01d5 }
            r10 = 1
            java.lang.String[] r14 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x01d5 }
            r10 = 0
            r14[r10] = r4     // Catch:{ SQLiteException -> 0x01d5 }
            java.lang.String r10 = "events"
            int r10 = r0.delete(r10, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            java.lang.String r15 = "user_attributes"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            int r10 = r10 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            int r10 = r10 + r15
            java.lang.String r15 = "apps"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            int r10 = r10 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            int r10 = r10 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            int r10 = r10 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            int r10 = r10 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            int r10 = r10 + r15
            java.lang.String r15 = "audience_filter_values"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            int r10 = r10 + r15
            java.lang.String r15 = "consent_settings"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            int r10 = r10 + r15
            com.google.android.gms.internal.measurement.C4168ed.m15770c()     // Catch:{ SQLiteException -> 0x01d5 }
            com.google.android.gms.measurement.internal.t4 r15 = r3.f14613a     // Catch:{ SQLiteException -> 0x01d5 }
            com.google.android.gms.measurement.internal.g r15 = r15.mo14876z()     // Catch:{ SQLiteException -> 0x01d5 }
            r21 = r11
            com.google.android.gms.measurement.internal.e3 r11 = com.google.android.gms.measurement.internal.C4636f3.f14403v0     // Catch:{ SQLiteException -> 0x01d1 }
            r22 = r6
            r6 = 0
            boolean r11 = r15.mo14398B(r6, r11)     // Catch:{ SQLiteException -> 0x01cf }
            if (r11 == 0) goto L_0x01b9
            java.lang.String r6 = "default_event_params"
            int r0 = r0.delete(r6, r8, r14)     // Catch:{ SQLiteException -> 0x01cf }
            int r10 = r10 + r0
        L_0x01b9:
            if (r10 <= 0) goto L_0x01ed
            com.google.android.gms.measurement.internal.t4 r0 = r3.f14613a     // Catch:{ SQLiteException -> 0x01cf }
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()     // Catch:{ SQLiteException -> 0x01cf }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14679v()     // Catch:{ SQLiteException -> 0x01cf }
            java.lang.String r6 = "Deleted application data. app, records"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)     // Catch:{ SQLiteException -> 0x01cf }
            r0.mo14617c(r6, r4, r8)     // Catch:{ SQLiteException -> 0x01cf }
            goto L_0x01ed
        L_0x01cf:
            r0 = move-exception
            goto L_0x01da
        L_0x01d1:
            r0 = move-exception
            r22 = r6
            goto L_0x01da
        L_0x01d5:
            r0 = move-exception
            r22 = r6
            r21 = r11
        L_0x01da:
            com.google.android.gms.measurement.internal.t4 r3 = r3.f14613a     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo14551d()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.n3 r3 = r3.mo14675r()     // Catch:{ all -> 0x056f }
            java.lang.String r6 = "Error deleting application data. appId, error"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r4)     // Catch:{ all -> 0x056f }
            r3.mo14617c(r6, r4, r0)     // Catch:{ all -> 0x056f }
        L_0x01ed:
            r0 = 0
            goto L_0x01f3
        L_0x01ef:
            r22 = r6
            r21 = r11
        L_0x01f3:
            if (r0 == 0) goto L_0x0249
            long r3 = r0.mo14700P()     // Catch:{ all -> 0x056f }
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x020c
            long r3 = r0.mo14700P()     // Catch:{ all -> 0x056f }
            long r14 = r2.f15126m     // Catch:{ all -> 0x056f }
            int r3 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r3 == 0) goto L_0x020c
            r15 = 1
            goto L_0x020d
        L_0x020c:
            r15 = 0
        L_0x020d:
            java.lang.String r3 = r0.mo14734l0()     // Catch:{ all -> 0x056f }
            long r16 = r0.mo14700P()     // Catch:{ all -> 0x056f }
            int r0 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0225
            if (r3 == 0) goto L_0x0225
            java.lang.String r0 = r2.f15119f     // Catch:{ all -> 0x056f }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x056f }
            if (r0 != 0) goto L_0x0225
            r0 = 1
            goto L_0x0226
        L_0x0225:
            r0 = 0
        L_0x0226:
            r0 = r0 | r15
            if (r0 == 0) goto L_0x0249
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x056f }
            r0.<init>()     // Catch:{ all -> 0x056f }
            java.lang.String r4 = "_pv"
            r0.putString(r4, r3)     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.zzaw r3 = new com.google.android.gms.measurement.internal.zzaw     // Catch:{ all -> 0x056f }
            java.lang.String r15 = "_au"
            com.google.android.gms.measurement.internal.zzau r4 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x056f }
            r4.<init>(r0)     // Catch:{ all -> 0x056f }
            java.lang.String r17 = "auto"
            r14 = r3
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x056f }
            r1.mo14592j(r3, r2)     // Catch:{ all -> 0x056f }
        L_0x0249:
            r23.mo14573S(r24)     // Catch:{ all -> 0x056f }
            if (r9 != 0) goto L_0x025d
            com.google.android.gms.measurement.internal.k r0 = r1.f14627c     // Catch:{ all -> 0x056f }
            m17935R(r0)     // Catch:{ all -> 0x056f }
            java.lang.String r3 = r2.f15117d     // Catch:{ all -> 0x056f }
            java.lang.String r4 = "_f"
            com.google.android.gms.measurement.internal.q r0 = r0.mo14501V(r3, r4)     // Catch:{ all -> 0x056f }
            r15 = 0
            goto L_0x026b
        L_0x025d:
            com.google.android.gms.measurement.internal.k r0 = r1.f14627c     // Catch:{ all -> 0x056f }
            m17935R(r0)     // Catch:{ all -> 0x056f }
            java.lang.String r3 = r2.f15117d     // Catch:{ all -> 0x056f }
            java.lang.String r4 = "_v"
            com.google.android.gms.measurement.internal.q r0 = r0.mo14501V(r3, r4)     // Catch:{ all -> 0x056f }
            r15 = 1
        L_0x026b:
            if (r0 != 0) goto L_0x053f
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            long r8 = r12 / r3
            r10 = 1
            long r8 = r8 + r10
            long r8 = r8 * r3
            java.lang.String r3 = "_dac"
            java.lang.String r4 = "_et"
            java.lang.String r6 = "_r"
            java.lang.String r10 = "_c"
            if (r15 != 0) goto L_0x04f4
            com.google.android.gms.measurement.internal.zzlj r0 = new com.google.android.gms.measurement.internal.zzlj     // Catch:{ all -> 0x056f }
            java.lang.String r15 = "_fot"
            java.lang.Long r18 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x056f }
            java.lang.String r19 = "auto"
            r14 = r0
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x056f }
            r1.mo14568B(r0, r2)     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.r4 r0 = r23.mo14552f()     // Catch:{ all -> 0x056f }
            r0.mo14554h()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.g4 r0 = r1.f14635k     // Catch:{ all -> 0x056f }
            java.lang.Object r0 = p182n6.C7264i.m27902k(r0)     // Catch:{ all -> 0x056f }
            r8 = r0
            com.google.android.gms.measurement.internal.g4 r8 = (com.google.android.gms.measurement.internal.C4648g4) r8     // Catch:{ all -> 0x056f }
            java.lang.String r0 = r2.f15117d     // Catch:{ all -> 0x056f }
            if (r0 == 0) goto L_0x0394
            boolean r9 = r0.isEmpty()     // Catch:{ all -> 0x056f }
            if (r9 == 0) goto L_0x02af
            goto L_0x0394
        L_0x02af:
            com.google.android.gms.measurement.internal.t4 r9 = r8.f14446a     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.r4 r9 = r9.mo14552f()     // Catch:{ all -> 0x056f }
            r9.mo14554h()     // Catch:{ all -> 0x056f }
            boolean r9 = r8.mo14436a()     // Catch:{ all -> 0x056f }
            if (r9 != 0) goto L_0x02cf
            com.google.android.gms.measurement.internal.t4 r0 = r8.f14446a     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14678u()     // Catch:{ all -> 0x056f }
            java.lang.String r5 = "Install Referrer Reporter is not available"
            r0.mo14615a(r5)     // Catch:{ all -> 0x056f }
            goto L_0x03a3
        L_0x02cf:
            com.google.android.gms.measurement.internal.f4 r9 = new com.google.android.gms.measurement.internal.f4     // Catch:{ all -> 0x056f }
            r9.<init>(r8, r0)     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.t4 r0 = r8.f14446a     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.r4 r0 = r0.mo14552f()     // Catch:{ all -> 0x056f }
            r0.mo14554h()     // Catch:{ all -> 0x056f }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x056f }
            java.lang.String r11 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r11)     // Catch:{ all -> 0x056f }
            android.content.ComponentName r11 = new android.content.ComponentName     // Catch:{ all -> 0x056f }
            java.lang.String r14 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r11.<init>(r5, r14)     // Catch:{ all -> 0x056f }
            r0.setComponent(r11)     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.t4 r11 = r8.f14446a     // Catch:{ all -> 0x056f }
            android.content.Context r11 = r11.mo14550c()     // Catch:{ all -> 0x056f }
            android.content.pm.PackageManager r11 = r11.getPackageManager()     // Catch:{ all -> 0x056f }
            if (r11 != 0) goto L_0x030b
            com.google.android.gms.measurement.internal.t4 r0 = r8.f14446a     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14682y()     // Catch:{ all -> 0x056f }
            java.lang.String r5 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            r0.mo14615a(r5)     // Catch:{ all -> 0x056f }
            goto L_0x03a3
        L_0x030b:
            r14 = 0
            java.util.List r11 = r11.queryIntentServices(r0, r14)     // Catch:{ all -> 0x056f }
            if (r11 == 0) goto L_0x0384
            boolean r15 = r11.isEmpty()     // Catch:{ all -> 0x056f }
            if (r15 != 0) goto L_0x0384
            java.lang.Object r11 = r11.get(r14)     // Catch:{ all -> 0x056f }
            android.content.pm.ResolveInfo r11 = (android.content.pm.ResolveInfo) r11     // Catch:{ all -> 0x056f }
            android.content.pm.ServiceInfo r11 = r11.serviceInfo     // Catch:{ all -> 0x056f }
            if (r11 == 0) goto L_0x03a3
            java.lang.String r14 = r11.packageName     // Catch:{ all -> 0x056f }
            java.lang.String r11 = r11.name     // Catch:{ all -> 0x056f }
            if (r11 == 0) goto L_0x0374
            boolean r5 = r5.equals(r14)     // Catch:{ all -> 0x056f }
            if (r5 == 0) goto L_0x0374
            boolean r5 = r8.mo14436a()     // Catch:{ all -> 0x056f }
            if (r5 == 0) goto L_0x0374
            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x056f }
            r5.<init>(r0)     // Catch:{ all -> 0x056f }
            s6.b r0 = p247s6.C8242b.m31044b()     // Catch:{ RuntimeException -> 0x035f }
            com.google.android.gms.measurement.internal.t4 r11 = r8.f14446a     // Catch:{ RuntimeException -> 0x035f }
            android.content.Context r11 = r11.mo14550c()     // Catch:{ RuntimeException -> 0x035f }
            r14 = 1
            boolean r0 = r0.mo23425a(r11, r5, r9, r14)     // Catch:{ RuntimeException -> 0x035f }
            com.google.android.gms.measurement.internal.t4 r5 = r8.f14446a     // Catch:{ RuntimeException -> 0x035f }
            com.google.android.gms.measurement.internal.p3 r5 = r5.mo14551d()     // Catch:{ RuntimeException -> 0x035f }
            com.google.android.gms.measurement.internal.n3 r5 = r5.mo14679v()     // Catch:{ RuntimeException -> 0x035f }
            java.lang.String r9 = "Install Referrer Service is"
            if (r0 == 0) goto L_0x0359
            java.lang.String r0 = "available"
            goto L_0x035b
        L_0x0359:
            java.lang.String r0 = "not available"
        L_0x035b:
            r5.mo14616b(r9, r0)     // Catch:{ RuntimeException -> 0x035f }
            goto L_0x03a3
        L_0x035f:
            r0 = move-exception
            com.google.android.gms.measurement.internal.t4 r5 = r8.f14446a     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.p3 r5 = r5.mo14551d()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.n3 r5 = r5.mo14675r()     // Catch:{ all -> 0x056f }
            java.lang.String r8 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x056f }
            r5.mo14616b(r8, r0)     // Catch:{ all -> 0x056f }
            goto L_0x03a3
        L_0x0374:
            com.google.android.gms.measurement.internal.t4 r0 = r8.f14446a     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14680w()     // Catch:{ all -> 0x056f }
            java.lang.String r5 = "Play Store version 8.3.73 or higher required for Install Referrer"
            r0.mo14615a(r5)     // Catch:{ all -> 0x056f }
            goto L_0x03a3
        L_0x0384:
            com.google.android.gms.measurement.internal.t4 r0 = r8.f14446a     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14678u()     // Catch:{ all -> 0x056f }
            java.lang.String r5 = "Play Service for fetching Install Referrer is unavailable on device"
            r0.mo14615a(r5)     // Catch:{ all -> 0x056f }
            goto L_0x03a3
        L_0x0394:
            com.google.android.gms.measurement.internal.t4 r0 = r8.f14446a     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14682y()     // Catch:{ all -> 0x056f }
            java.lang.String r5 = "Install Referrer Reporter was called with invalid app package name"
            r0.mo14615a(r5)     // Catch:{ all -> 0x056f }
        L_0x03a3:
            com.google.android.gms.measurement.internal.r4 r0 = r23.mo14552f()     // Catch:{ all -> 0x056f }
            r0.mo14554h()     // Catch:{ all -> 0x056f }
            r23.mo14586g()     // Catch:{ all -> 0x056f }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x056f }
            r5.<init>()     // Catch:{ all -> 0x056f }
            r8 = 1
            r5.putLong(r10, r8)     // Catch:{ all -> 0x056f }
            r5.putLong(r6, r8)     // Catch:{ all -> 0x056f }
            r8 = 0
            r5.putLong(r7, r8)     // Catch:{ all -> 0x056f }
            r6 = r22
            r5.putLong(r6, r8)     // Catch:{ all -> 0x056f }
            r10 = r20
            r5.putLong(r10, r8)     // Catch:{ all -> 0x056f }
            r11 = r21
            r5.putLong(r11, r8)     // Catch:{ all -> 0x056f }
            r8 = 1
            r5.putLong(r4, r8)     // Catch:{ all -> 0x056f }
            boolean r0 = r2.f15132s     // Catch:{ all -> 0x056f }
            if (r0 == 0) goto L_0x03da
            r5.putLong(r3, r8)     // Catch:{ all -> 0x056f }
        L_0x03da:
            java.lang.String r0 = r2.f15117d     // Catch:{ all -> 0x056f }
            java.lang.Object r0 = p182n6.C7264i.m27902k(r0)     // Catch:{ all -> 0x056f }
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.k r0 = r1.f14627c     // Catch:{ all -> 0x056f }
            m17935R(r0)     // Catch:{ all -> 0x056f }
            p182n6.C7264i.m27898g(r3)     // Catch:{ all -> 0x056f }
            r0.mo14554h()     // Catch:{ all -> 0x056f }
            r0.mo14301i()     // Catch:{ all -> 0x056f }
            java.lang.String r4 = "first_open_count"
            long r8 = r0.mo14491L(r3, r4)     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.t4 r0 = r1.f14636l     // Catch:{ all -> 0x056f }
            android.content.Context r0 = r0.mo14550c()     // Catch:{ all -> 0x056f }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x056f }
            if (r0 != 0) goto L_0x0418
            com.google.android.gms.measurement.internal.p3 r0 = r23.mo14551d()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14675r()     // Catch:{ all -> 0x056f }
            java.lang.String r4 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r3)     // Catch:{ all -> 0x056f }
            r0.mo14616b(r4, r3)     // Catch:{ all -> 0x056f }
        L_0x0414:
            r3 = 0
            goto L_0x04d6
        L_0x0418:
            com.google.android.gms.measurement.internal.t4 r0 = r1.f14636l     // Catch:{ NameNotFoundException -> 0x0428 }
            android.content.Context r0 = r0.mo14550c()     // Catch:{ NameNotFoundException -> 0x0428 }
            v6.d r0 = p286v6.C8708e.m32461a(r0)     // Catch:{ NameNotFoundException -> 0x0428 }
            r4 = 0
            android.content.pm.PackageInfo r0 = r0.mo24091e(r3, r4)     // Catch:{ NameNotFoundException -> 0x0428 }
            goto L_0x043b
        L_0x0428:
            r0 = move-exception
            com.google.android.gms.measurement.internal.p3 r4 = r23.mo14551d()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.n3 r4 = r4.mo14675r()     // Catch:{ all -> 0x056f }
            java.lang.String r14 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.Object r15 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r3)     // Catch:{ all -> 0x056f }
            r4.mo14617c(r14, r15, r0)     // Catch:{ all -> 0x056f }
            r0 = 0
        L_0x043b:
            if (r0 == 0) goto L_0x0490
            long r14 = r0.firstInstallTime     // Catch:{ all -> 0x056f }
            r16 = 0
            int r4 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x0490
            r20 = r10
            r21 = r11
            long r10 = r0.lastUpdateTime     // Catch:{ all -> 0x056f }
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0471
            com.google.android.gms.measurement.internal.g r0 = r23.mo14575U()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.e3 r4 = com.google.android.gms.measurement.internal.C4636f3.f14371f0     // Catch:{ all -> 0x056f }
            r10 = 0
            boolean r0 = r0.mo14398B(r10, r4)     // Catch:{ all -> 0x056f }
            if (r0 == 0) goto L_0x046b
            r14 = 0
            int r0 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x0469
            r14 = 1
            r5.putLong(r7, r14)     // Catch:{ all -> 0x056f }
            r8 = 0
        L_0x0469:
            r15 = 0
            goto L_0x0473
        L_0x046b:
            r14 = 1
            r5.putLong(r7, r14)     // Catch:{ all -> 0x056f }
            goto L_0x0469
        L_0x0471:
            r10 = 0
            r15 = 1
        L_0x0473:
            com.google.android.gms.measurement.internal.zzlj r0 = new com.google.android.gms.measurement.internal.zzlj     // Catch:{ all -> 0x056f }
            java.lang.String r4 = "_fi"
            r7 = 1
            if (r7 == r15) goto L_0x047d
            r14 = 0
            goto L_0x047f
        L_0x047d:
            r14 = 1
        L_0x047f:
            java.lang.Long r18 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x056f }
            java.lang.String r19 = "auto"
            r14 = r0
            r15 = r4
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x056f }
            r1.mo14568B(r0, r2)     // Catch:{ all -> 0x056f }
            goto L_0x0495
        L_0x0490:
            r20 = r10
            r21 = r11
            r10 = 0
        L_0x0495:
            com.google.android.gms.measurement.internal.t4 r0 = r1.f14636l     // Catch:{ NameNotFoundException -> 0x04a5 }
            android.content.Context r0 = r0.mo14550c()     // Catch:{ NameNotFoundException -> 0x04a5 }
            v6.d r0 = p286v6.C8708e.m32461a(r0)     // Catch:{ NameNotFoundException -> 0x04a5 }
            r4 = 0
            android.content.pm.ApplicationInfo r3 = r0.mo24089c(r3, r4)     // Catch:{ NameNotFoundException -> 0x04a5 }
            goto L_0x04b8
        L_0x04a5:
            r0 = move-exception
            com.google.android.gms.measurement.internal.p3 r4 = r23.mo14551d()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.n3 r4 = r4.mo14675r()     // Catch:{ all -> 0x056f }
            java.lang.String r7 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r3)     // Catch:{ all -> 0x056f }
            r4.mo14617c(r7, r3, r0)     // Catch:{ all -> 0x056f }
            r3 = r10
        L_0x04b8:
            if (r3 == 0) goto L_0x0414
            int r0 = r3.flags     // Catch:{ all -> 0x056f }
            r4 = 1
            r0 = r0 & r4
            if (r0 == 0) goto L_0x04c7
            r4 = r20
            r10 = 1
            r5.putLong(r4, r10)     // Catch:{ all -> 0x056f }
        L_0x04c7:
            int r0 = r3.flags     // Catch:{ all -> 0x056f }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0414
            r3 = r21
            r10 = 1
            r5.putLong(r3, r10)     // Catch:{ all -> 0x056f }
            goto L_0x0414
        L_0x04d6:
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x04dd
            r5.putLong(r6, r8)     // Catch:{ all -> 0x056f }
        L_0x04dd:
            com.google.android.gms.measurement.internal.zzaw r0 = new com.google.android.gms.measurement.internal.zzaw     // Catch:{ all -> 0x056f }
            java.lang.String r15 = "_f"
            com.google.android.gms.measurement.internal.zzau r3 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x056f }
            r3.<init>(r5)     // Catch:{ all -> 0x056f }
            java.lang.String r17 = "auto"
            r14 = r0
            r16 = r3
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x056f }
            r1.mo14595l(r0, r2)     // Catch:{ all -> 0x056f }
            goto L_0x055e
        L_0x04f4:
            com.google.android.gms.measurement.internal.zzlj r0 = new com.google.android.gms.measurement.internal.zzlj     // Catch:{ all -> 0x056f }
            java.lang.String r15 = "_fvt"
            java.lang.Long r18 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x056f }
            java.lang.String r19 = "auto"
            r14 = r0
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x056f }
            r1.mo14568B(r0, r2)     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.r4 r0 = r23.mo14552f()     // Catch:{ all -> 0x056f }
            r0.mo14554h()     // Catch:{ all -> 0x056f }
            r23.mo14586g()     // Catch:{ all -> 0x056f }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x056f }
            r0.<init>()     // Catch:{ all -> 0x056f }
            r7 = 1
            r0.putLong(r10, r7)     // Catch:{ all -> 0x056f }
            r0.putLong(r6, r7)     // Catch:{ all -> 0x056f }
            r0.putLong(r4, r7)     // Catch:{ all -> 0x056f }
            boolean r4 = r2.f15132s     // Catch:{ all -> 0x056f }
            if (r4 == 0) goto L_0x0528
            r0.putLong(r3, r7)     // Catch:{ all -> 0x056f }
        L_0x0528:
            com.google.android.gms.measurement.internal.zzaw r3 = new com.google.android.gms.measurement.internal.zzaw     // Catch:{ all -> 0x056f }
            java.lang.String r15 = "_v"
            com.google.android.gms.measurement.internal.zzau r4 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x056f }
            r4.<init>(r0)     // Catch:{ all -> 0x056f }
            java.lang.String r17 = "auto"
            r14 = r3
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x056f }
            r1.mo14595l(r3, r2)     // Catch:{ all -> 0x056f }
            goto L_0x055e
        L_0x053f:
            boolean r0 = r2.f15125l     // Catch:{ all -> 0x056f }
            if (r0 == 0) goto L_0x055e
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x056f }
            r0.<init>()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.zzaw r3 = new com.google.android.gms.measurement.internal.zzaw     // Catch:{ all -> 0x056f }
            java.lang.String r15 = "_cd"
            com.google.android.gms.measurement.internal.zzau r4 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x056f }
            r4.<init>(r0)     // Catch:{ all -> 0x056f }
            java.lang.String r17 = "auto"
            r14 = r3
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x056f }
            r1.mo14595l(r3, r2)     // Catch:{ all -> 0x056f }
        L_0x055e:
            com.google.android.gms.measurement.internal.k r0 = r1.f14627c     // Catch:{ all -> 0x056f }
            m17935R(r0)     // Catch:{ all -> 0x056f }
            r0.mo14515o()     // Catch:{ all -> 0x056f }
            com.google.android.gms.measurement.internal.k r0 = r1.f14627c
            m17935R(r0)
            r0.mo14510f0()
            return
        L_0x056f:
            r0 = move-exception
            com.google.android.gms.measurement.internal.k r2 = r1.f14627c
            m17935R(r2)
            r2.mo14510f0()
            throw r0
        L_0x0579:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4719m9.mo14601q(com.google.android.gms.measurement.internal.zzq):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo14602r() {
        this.f14641q++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo14603s(zzac zzac) {
        zzq I = m17926I((String) C7264i.m27902k(zzac.f15091d));
        if (I != null) {
            mo14604t(zzac, I);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo14604t(zzac zzac, zzq zzq) {
        Bundle bundle;
        C7264i.m27902k(zzac);
        C7264i.m27898g(zzac.f15091d);
        C7264i.m27902k(zzac.f15093f);
        C7264i.m27898g(zzac.f15093f.f15108e);
        mo14552f().mo14554h();
        mo14586g();
        if (m17934Q(zzq)) {
            if (zzq.f15124k) {
                C4687k kVar = this.f14627c;
                m17935R(kVar);
                kVar.mo14509e0();
                try {
                    mo14573S(zzq);
                    String str = (String) C7264i.m27902k(zzac.f15091d);
                    C4687k kVar2 = this.f14627c;
                    m17935R(kVar2);
                    zzac S = kVar2.mo14498S(str, zzac.f15093f.f15108e);
                    if (S != null) {
                        mo14551d().mo14674q().mo14617c("Removing conditional user property", zzac.f15091d, this.f14636l.mo14847D().mo14530f(zzac.f15093f.f15108e));
                        C4687k kVar3 = this.f14627c;
                        m17935R(kVar3);
                        kVar3.mo14490J(str, zzac.f15093f.f15108e);
                        if (S.f15095h) {
                            C4687k kVar4 = this.f14627c;
                            m17935R(kVar4);
                            kVar4.mo14513m(str, zzac.f15093f.f15108e);
                        }
                        zzaw zzaw = zzac.f15101n;
                        if (zzaw != null) {
                            zzau zzau = zzaw.f15104e;
                            if (zzau != null) {
                                bundle = zzau.mo14991x();
                            } else {
                                bundle = null;
                            }
                            mo14570D((zzaw) C7264i.m27902k(mo14589h0().mo14839y0(str, ((zzaw) C7264i.m27902k(zzac.f15101n)).f15103d, bundle, S.f15092e, zzac.f15101n.f15106g, true, true)), zzq);
                        }
                    } else {
                        mo14551d().mo14680w().mo14617c("Conditional user property doesn't exist", C4746p3.m18094z(zzac.f15091d), this.f14636l.mo14847D().mo14530f(zzac.f15093f.f15108e));
                    }
                    C4687k kVar5 = this.f14627c;
                    m17935R(kVar5);
                    kVar5.mo14515o();
                } finally {
                    C4687k kVar6 = this.f14627c;
                    m17935R(kVar6);
                    kVar6.mo14510f0();
                }
            } else {
                mo14573S(zzq);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo14605u(String str, zzq zzq) {
        long j;
        mo14552f().mo14554h();
        mo14586g();
        if (m17934Q(zzq)) {
            if (!zzq.f15124k) {
                mo14573S(zzq);
            } else if (!"_npa".equals(str) || zzq.f15134u == null) {
                mo14551d().mo14674q().mo14616b("Removing user property", this.f14636l.mo14847D().mo14530f(str));
                C4687k kVar = this.f14627c;
                m17935R(kVar);
                kVar.mo14509e0();
                try {
                    mo14573S(zzq);
                    if ("_id".equals(str)) {
                        C4687k kVar2 = this.f14627c;
                        m17935R(kVar2);
                        kVar2.mo14513m((String) C7264i.m27902k(zzq.f15117d), "_lair");
                    }
                    C4687k kVar3 = this.f14627c;
                    m17935R(kVar3);
                    kVar3.mo14513m((String) C7264i.m27902k(zzq.f15117d), str);
                    C4687k kVar4 = this.f14627c;
                    m17935R(kVar4);
                    kVar4.mo14515o();
                    mo14551d().mo14674q().mo14616b("User property removed", this.f14636l.mo14847D().mo14530f(str));
                } finally {
                    C4687k kVar5 = this.f14627c;
                    m17935R(kVar5);
                    kVar5.mo14510f0();
                }
            } else {
                mo14551d().mo14674q().mo14615a("Falling back to manifest metadata value for ad personalization");
                long a = mo14548a().mo23594a();
                if (true != zzq.f15134u.booleanValue()) {
                    j = 0;
                } else {
                    j = 1;
                }
                mo14568B(new zzlj("_npa", a, Long.valueOf(j), "auto"), zzq);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo14606v(zzq zzq) {
        if (this.f14648x != null) {
            ArrayList arrayList = new ArrayList();
            this.f14649y = arrayList;
            arrayList.addAll(this.f14648x);
        }
        C4687k kVar = this.f14627c;
        m17935R(kVar);
        String str = (String) C7264i.m27902k(zzq.f15117d);
        C7264i.m27898g(str);
        kVar.mo14554h();
        kVar.mo14301i();
        try {
            SQLiteDatabase P = kVar.mo14495P();
            String[] strArr = {str};
            int delete = P.delete("apps", "app_id=?", strArr) + P.delete("events", "app_id=?", strArr) + P.delete("user_attributes", "app_id=?", strArr) + P.delete("conditional_properties", "app_id=?", strArr) + P.delete("raw_events", "app_id=?", strArr) + P.delete("raw_events_metadata", "app_id=?", strArr) + P.delete("queue", "app_id=?", strArr) + P.delete("audience_filter_values", "app_id=?", strArr) + P.delete("main_event_params", "app_id=?", strArr) + P.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                kVar.f14613a.mo14551d().mo14679v().mo14617c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            kVar.f14613a.mo14551d().mo14675r().mo14617c("Error resetting analytics data. appId, error", C4746p3.m18094z(str), e);
        }
        if (zzq.f15124k) {
            mo14601q(zzq);
        }
    }

    /* renamed from: w */
    public final void mo14607w(String str, C4848y6 y6Var) {
        mo14552f().mo14554h();
        String str2 = this.f14623D;
        if (str2 == null || str2.equals(str) || y6Var != null) {
            this.f14623D = str;
            this.f14622C = y6Var;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo14608x() {
        mo14552f().mo14554h();
        C4687k kVar = this.f14627c;
        m17935R(kVar);
        kVar.mo14512h0();
        if (this.f14633i.f14523g.mo14295a() == 0) {
            this.f14633i.f14523g.mo14296b(mo14548a().mo23594a());
        }
        m17930M();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo14609y(zzac zzac) {
        zzq I = m17926I((String) C7264i.m27902k(zzac.f15091d));
        if (I != null) {
            mo14610z(zzac, I);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo14610z(zzac zzac, zzq zzq) {
        C7264i.m27902k(zzac);
        C7264i.m27898g(zzac.f15091d);
        C7264i.m27902k(zzac.f15092e);
        C7264i.m27902k(zzac.f15093f);
        C7264i.m27898g(zzac.f15093f.f15108e);
        mo14552f().mo14554h();
        mo14586g();
        if (m17934Q(zzq)) {
            if (!zzq.f15124k) {
                mo14573S(zzq);
                return;
            }
            zzac zzac2 = new zzac(zzac);
            boolean z = false;
            zzac2.f15095h = false;
            C4687k kVar = this.f14627c;
            m17935R(kVar);
            kVar.mo14509e0();
            try {
                C4687k kVar2 = this.f14627c;
                m17935R(kVar2);
                zzac S = kVar2.mo14498S((String) C7264i.m27902k(zzac2.f15091d), zzac2.f15093f.f15108e);
                if (S != null && !S.f15092e.equals(zzac2.f15092e)) {
                    mo14551d().mo14680w().mo14618d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f14636l.mo14847D().mo14530f(zzac2.f15093f.f15108e), zzac2.f15092e, S.f15092e);
                }
                if (S != null && S.f15095h) {
                    zzac2.f15092e = S.f15092e;
                    zzac2.f15094g = S.f15094g;
                    zzac2.f15098k = S.f15098k;
                    zzac2.f15096i = S.f15096i;
                    zzac2.f15099l = S.f15099l;
                    zzac2.f15095h = true;
                    zzlj zzlj = zzac2.f15093f;
                    zzac2.f15093f = new zzlj(zzlj.f15108e, S.f15093f.f15109f, zzlj.mo14994v(), S.f15093f.f15112i);
                } else if (TextUtils.isEmpty(zzac2.f15096i)) {
                    zzlj zzlj2 = zzac2.f15093f;
                    zzac2.f15093f = new zzlj(zzlj2.f15108e, zzac2.f15094g, zzlj2.mo14994v(), zzac2.f15093f.f15112i);
                    zzac2.f15095h = true;
                    z = true;
                }
                if (zzac2.f15095h) {
                    zzlj zzlj3 = zzac2.f15093f;
                    C4763q9 q9Var = new C4763q9((String) C7264i.m27902k(zzac2.f15091d), zzac2.f15092e, zzlj3.f15108e, zzlj3.f15109f, C7264i.m27902k(zzlj3.mo14994v()));
                    C4687k kVar3 = this.f14627c;
                    m17935R(kVar3);
                    if (kVar3.mo14524x(q9Var)) {
                        mo14551d().mo14674q().mo14618d("User property updated immediately", zzac2.f15091d, this.f14636l.mo14847D().mo14530f(q9Var.f14804c), q9Var.f14806e);
                    } else {
                        mo14551d().mo14675r().mo14618d("(2)Too many active user properties, ignoring", C4746p3.m18094z(zzac2.f15091d), this.f14636l.mo14847D().mo14530f(q9Var.f14804c), q9Var.f14806e);
                    }
                    if (z && zzac2.f15099l != null) {
                        mo14570D(new zzaw(zzac2.f15099l, zzac2.f15094g), zzq);
                    }
                }
                C4687k kVar4 = this.f14627c;
                m17935R(kVar4);
                if (kVar4.mo14523w(zzac2)) {
                    mo14551d().mo14674q().mo14618d("Conditional property added", zzac2.f15091d, this.f14636l.mo14847D().mo14530f(zzac2.f15093f.f15108e), zzac2.f15093f.mo14994v());
                } else {
                    mo14551d().mo14675r().mo14618d("Too many conditional properties, ignoring", C4746p3.m18094z(zzac2.f15091d), this.f14636l.mo14847D().mo14530f(zzac2.f15093f.f15108e), zzac2.f15093f.mo14994v());
                }
                C4687k kVar5 = this.f14627c;
                m17935R(kVar5);
                kVar5.mo14515o();
            } finally {
                C4687k kVar6 = this.f14627c;
                m17935R(kVar6);
                kVar6.mo14510f0();
            }
        }
    }
}

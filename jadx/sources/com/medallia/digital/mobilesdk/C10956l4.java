package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.medallia.digital.mobilesdk.AnalyticsBridge;
import com.medallia.digital.mobilesdk.C10785e0;
import com.medallia.digital.mobilesdk.C10862h6;
import com.medallia.digital.mobilesdk.C10880i3;
import com.medallia.digital.mobilesdk.C10901j2;
import com.medallia.digital.mobilesdk.C11026o0;
import com.medallia.digital.mobilesdk.C11089s6;
import com.medallia.digital.mobilesdk.C11138v2;
import com.medallia.digital.mobilesdk.C11164w3;
import com.medallia.digital.mobilesdk.C11247z7;
import com.medallia.digital.mobilesdk.MDExternalError;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.l4 */
class C10956l4 implements C11164w3.C11171g, C10769c8, C10893i8 {

    /* renamed from: s */
    private static final long f31472s = 2000;

    /* renamed from: t */
    private static final long f31473t = 6000;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f31474a = false;

    /* renamed from: b */
    private boolean f31475b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f31476c = f31473t;

    /* renamed from: d */
    private MDSdkFrameworkType f31477d = MDSdkFrameworkType.Native;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f31478e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f31479f = false;

    /* renamed from: g */
    private boolean f31480g = false;

    /* renamed from: h */
    private final C11026o0 f31481h = new C11026o0();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C10945l0 f31482i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C10990m0 f31483j;

    /* renamed from: k */
    private C11019n6 f31484k = new C11019n6();

    /* renamed from: l */
    private final C10901j2 f31485l = new C10901j2();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C11066q3 f31486m = new C11066q3();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final MedalliaExceptionHandler f31487n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f31488o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f31489p;

    /* renamed from: q */
    private Boolean f31490q;

    /* renamed from: r */
    private boolean f31491r;

    /* renamed from: com.medallia.digital.mobilesdk.l4$a */
    class C10957a extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ MDCallback f31492a;

        /* renamed from: b */
        final /* synthetic */ String f31493b;

        C10957a(MDCallback mDCallback, String str) {
            this.f31492a = mDCallback;
            this.f31493b = str;
        }

        /* renamed from: a */
        public void mo27617a() {
            this.f31492a.onSuccess(this.f31493b);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l4$b */
    class C10958b extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ MDResultCallback f31495a;

        C10958b(MDResultCallback mDResultCallback) {
            this.f31495a = mDResultCallback;
        }

        /* renamed from: a */
        public void mo27617a() {
            this.f31495a.onSuccess();
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l4$c */
    class C10959c implements C10796e6<C11235z0> {

        /* renamed from: a */
        final /* synthetic */ MDResultCallback f31497a;

        C10959c(MDResultCallback mDResultCallback) {
            this.f31497a = mDResultCallback;
        }

        /* renamed from: a */
        public void mo27796a(C10859h4 h4Var) {
            C10956l4.this.m40098a((C10790e3) h4Var, this.f31497a);
            C10956l4.this.clearAndDisconnect();
            boolean unused = C10956l4.this.f31479f = false;
            C10956l4.this.f31482i.mo28650a(C10956l4.this.f31474a, C10956l4.this.f31479f);
        }

        /* renamed from: a */
        public void mo27797a(C11235z0 z0Var) {
            if (z0Var == null || z0Var.mo29240a() == null) {
                C10956l4.this.m40096a(new MDExternalError(MDExternalError.ExternalError.UNSPECIFIED_CONFIGURATION_ERROR_16), this.f31497a);
                return;
            }
            ConfigurationContract a = z0Var.mo29240a();
            C10735b4.m39113e("SDK init finished successfully");
            boolean unused = C10956l4.this.f31479f = false;
            boolean unused2 = C10956l4.this.f31474a = true;
            C10956l4.this.f31482i.mo28650a(C10956l4.this.f31474a, C10956l4.this.f31479f);
            if (C10956l4.this.mo28676a(a)) {
                C10956l4.this.m40119c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED), this.f31497a);
                return;
            }
            C10956l4.this.m40120c(this.f31497a);
            C10956l4.this.mo28668a(z0Var);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l4$d */
    class C10960d implements MDResultCallback {

        /* renamed from: a */
        final /* synthetic */ ConfigurationContract f31499a;

        /* renamed from: com.medallia.digital.mobilesdk.l4$d$a */
        class C10961a extends C11033o4 {

            /* renamed from: com.medallia.digital.mobilesdk.l4$d$a$a */
            class C10962a extends C11033o4 {
                C10962a() {
                }

                /* renamed from: a */
                public void mo27617a() {
                    C11246z6.m41212b().mo29265b(C10960d.this.f31499a);
                }
            }

            C10961a() {
            }

            /* renamed from: a */
            public void mo27617a() {
                C11004m7.m40304b().mo28763a().execute(new C10962a());
            }
        }

        C10960d(ConfigurationContract configurationContract) {
            this.f31499a = configurationContract;
        }

        public void onError(MDExternalError mDExternalError) {
        }

        public void onSuccess() {
            new Handler(Looper.getMainLooper()).postDelayed(new C10961a(), C10956l4.f31472s);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l4$e */
    class C10963e implements C10796e6<C10989m> {
        C10963e() {
        }

        /* renamed from: a */
        public void mo27796a(C10859h4 h4Var) {
        }

        /* renamed from: a */
        public void mo27797a(C10989m mVar) {
            C10870h8.m39667g().mo28437a(true, Long.valueOf(mVar.mo28719d()), mVar.mo28711a());
            if (mVar.mo28720e()) {
                boolean unused = C10956l4.this.f31488o = true;
                C10956l4.this.m40135g();
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l4$f */
    class C10964f implements C10901j2.C10903b {
        C10964f() {
        }

        /* renamed from: a */
        public void mo28149a() {
        }

        public void onSuccess() {
            boolean unused = C10956l4.this.f31489p = true;
            C10956l4.this.m40135g();
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l4$g */
    class C10965g implements C11138v2.C11145g {

        /* renamed from: a */
        final /* synthetic */ ConfigurationContract f31505a;

        C10965g(ConfigurationContract configurationContract) {
            this.f31505a = configurationContract;
        }

        /* renamed from: a */
        public void mo28688a() {
            C10956l4.this.f31482i.mo28647a(this.f31505a);
            C10956l4.this.f31482i.mo28649a(C11138v2.m40821f().mo29078g());
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l4$i */
    class C10967i implements C10796e6<C11235z0> {

        /* renamed from: a */
        final /* synthetic */ long f31510a;

        /* renamed from: b */
        final /* synthetic */ long f31511b;

        C10967i(long j, long j2) {
            this.f31510a = j;
            this.f31511b = j2;
        }

        /* renamed from: a */
        public void mo27796a(C10859h4 h4Var) {
            C10735b4.m39111c("Refresh session failed " + h4Var.getMessage());
            C10956l4.this.m40092a(AnalyticsBridge.C10665c.failure, this.f31510a, this.f31511b);
            C10956l4.this.m40138i();
        }

        /* renamed from: a */
        public void mo27797a(C11235z0 z0Var) {
            ConfigurationContract a = z0Var.mo29240a();
            C10735b4.m39113e("Refresh session success");
            if (C10956l4.this.mo28676a(a)) {
                CollectorsInfrastructure.getInstance().stopCollectors();
                C11246z6.m41212b().mo29264a(false, true);
                C10735b4.m39111c("SDK functionality has been turned off");
                return;
            }
            C10956l4.this.m40104a(z0Var, this.f31510a, this.f31511b);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l4$j */
    class C10968j implements C10796e6<C10989m> {
        C10968j() {
        }

        /* renamed from: a */
        public void mo27796a(C10859h4 h4Var) {
        }

        /* renamed from: a */
        public void mo27797a(C10989m mVar) {
            C10870h8.m39667g().mo28443b(true, Long.valueOf(mVar.mo28719d()), mVar.mo28711a());
            if (mVar.mo28720e()) {
                boolean unused = C10956l4.this.f31488o = true;
                C10956l4.this.m40135g();
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l4$k */
    class C10969k extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ MDResultCallback f31514a;

        /* renamed from: b */
        final /* synthetic */ String f31515b;

        C10969k(MDResultCallback mDResultCallback, String str) {
            this.f31514a = mDResultCallback;
            this.f31515b = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x00ab  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00d9  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo27617a() {
            /*
                r10 = this;
                com.medallia.digital.mobilesdk.l4 r0 = com.medallia.digital.mobilesdk.C10956l4.this
                long r1 = java.lang.System.currentTimeMillis()
                long unused = r0.f31478e = r1
                com.medallia.digital.mobilesdk.l4 r0 = com.medallia.digital.mobilesdk.C10956l4.this
                boolean r0 = r0.f31479f
                if (r0 == 0) goto L_0x0020
                com.medallia.digital.mobilesdk.l4 r0 = com.medallia.digital.mobilesdk.C10956l4.this
                com.medallia.digital.mobilesdk.MDExternalError r1 = new com.medallia.digital.mobilesdk.MDExternalError
                com.medallia.digital.mobilesdk.MDExternalError$ExternalError r2 = com.medallia.digital.mobilesdk.MDExternalError.ExternalError.SDK_INITIALIZATION_IN_PROGRESS
                r1.<init>(r2)
                com.medallia.digital.mobilesdk.MDResultCallback r2 = r10.f31514a
                r0.m40119c((com.medallia.digital.mobilesdk.MDExternalError) r1, (com.medallia.digital.mobilesdk.MDResultCallback) r2)
                return
            L_0x0020:
                com.medallia.digital.mobilesdk.l4 r0 = com.medallia.digital.mobilesdk.C10956l4.this
                com.medallia.digital.mobilesdk.q3 r0 = r0.f31486m
                boolean r0 = r0.mo28940b()
                if (r0 == 0) goto L_0x004e
                com.medallia.digital.mobilesdk.l4 r0 = com.medallia.digital.mobilesdk.C10956l4.this
                com.medallia.digital.mobilesdk.q3 r0 = r0.f31486m
                boolean r0 = r0.mo28937a()
                if (r0 != 0) goto L_0x004e
                com.medallia.digital.mobilesdk.l4 r0 = com.medallia.digital.mobilesdk.C10956l4.this
                com.medallia.digital.mobilesdk.MDExternalError r1 = new com.medallia.digital.mobilesdk.MDExternalError
                com.medallia.digital.mobilesdk.MDExternalError$ExternalError r2 = com.medallia.digital.mobilesdk.MDExternalError.ExternalError.SDK_IS_KILLED
                r1.<init>(r2)
                com.medallia.digital.mobilesdk.MDResultCallback r2 = r10.f31514a
                r0.m40112b((com.medallia.digital.mobilesdk.MDExternalError) r1, (com.medallia.digital.mobilesdk.MDResultCallback) r2)
                com.medallia.digital.mobilesdk.w3 r0 = com.medallia.digital.mobilesdk.C11164w3.m40939b()
                r0.clearAndDisconnect()
                return
            L_0x004e:
                com.medallia.digital.mobilesdk.l4 r0 = com.medallia.digital.mobilesdk.C10956l4.this
                com.medallia.digital.mobilesdk.MedalliaExceptionHandler r0 = r0.f31487n
                com.medallia.digital.mobilesdk.i4 r1 = com.medallia.digital.mobilesdk.C10884i4.m39721c()
                android.app.Application r1 = r1.mo28481a()
                r0.updateFilePath(r1)
                com.medallia.digital.mobilesdk.l4 r0 = com.medallia.digital.mobilesdk.C10956l4.this
                r1 = 1
                boolean unused = r0.f31479f = r1
                com.medallia.digital.mobilesdk.l4 r0 = com.medallia.digital.mobilesdk.C10956l4.this
                com.medallia.digital.mobilesdk.l0 r0 = r0.f31482i
                com.medallia.digital.mobilesdk.l4 r1 = com.medallia.digital.mobilesdk.C10956l4.this
                boolean r1 = r1.f31474a
                com.medallia.digital.mobilesdk.l4 r2 = com.medallia.digital.mobilesdk.C10956l4.this
                boolean r2 = r2.f31479f
                r0.mo28650a((boolean) r1, (boolean) r2)
                boolean r0 = com.medallia.digital.mobilesdk.C10918j6.m39861b()
                if (r0 == 0) goto L_0x008b
                java.lang.String r0 = "SDK Upgrade - delete UUID and local configuration storage"
            L_0x0082:
                com.medallia.digital.mobilesdk.C10735b4.m39113e(r0)
                com.medallia.digital.mobilesdk.l4 r0 = com.medallia.digital.mobilesdk.C10956l4.this
                r0.m40109b()
                goto L_0x0094
            L_0x008b:
                boolean r0 = com.medallia.digital.mobilesdk.C10918j6.m39860a()
                if (r0 == 0) goto L_0x0094
                java.lang.String r0 = "OS Upgrade - delete UUID and local configuration storage"
                goto L_0x0082
            L_0x0094:
                com.medallia.digital.mobilesdk.C10918j6.m39862c()
                com.medallia.digital.mobilesdk.l4 r0 = com.medallia.digital.mobilesdk.C10956l4.this
                com.medallia.digital.mobilesdk.MDResultCallback r1 = r10.f31514a
                r0.m40126d((com.medallia.digital.mobilesdk.MDResultCallback) r1)
                com.medallia.digital.mobilesdk.ModelFactory r0 = com.medallia.digital.mobilesdk.ModelFactory.getInstance()
                java.lang.String r1 = r10.f31515b
                com.medallia.digital.mobilesdk.n r0 = r0.createApiToken(r1)
                r1 = 0
                if (r0 != 0) goto L_0x00d9
                com.medallia.digital.mobilesdk.l4 r0 = com.medallia.digital.mobilesdk.C10956l4.this
                boolean unused = r0.f31479f = r1
                com.medallia.digital.mobilesdk.l4 r0 = com.medallia.digital.mobilesdk.C10956l4.this
                com.medallia.digital.mobilesdk.l0 r0 = r0.f31482i
                com.medallia.digital.mobilesdk.l4 r1 = com.medallia.digital.mobilesdk.C10956l4.this
                boolean r1 = r1.f31474a
                com.medallia.digital.mobilesdk.l4 r2 = com.medallia.digital.mobilesdk.C10956l4.this
                boolean r2 = r2.f31479f
                r0.mo28650a((boolean) r1, (boolean) r2)
                com.medallia.digital.mobilesdk.l4 r0 = com.medallia.digital.mobilesdk.C10956l4.this
                com.medallia.digital.mobilesdk.w1 r1 = new com.medallia.digital.mobilesdk.w1
                com.medallia.digital.mobilesdk.h4$a r2 = com.medallia.digital.mobilesdk.C10859h4.C10860a.API_TOKEN_PARSE_ERROR
                r1.<init>(r2)
                com.medallia.digital.mobilesdk.MDResultCallback r2 = r10.f31514a
                r0.m40098a((com.medallia.digital.mobilesdk.C10790e3) r1, (com.medallia.digital.mobilesdk.MDResultCallback) r2)
                com.medallia.digital.mobilesdk.l4 r0 = com.medallia.digital.mobilesdk.C10956l4.this
                r0.clearAndDisconnect()
                return
            L_0x00d9:
                com.medallia.digital.mobilesdk.l4 r2 = com.medallia.digital.mobilesdk.C10956l4.this
                boolean r2 = r2.f31474a
                if (r2 == 0) goto L_0x012a
                com.medallia.digital.mobilesdk.a3 r2 = com.medallia.digital.mobilesdk.C10718a3.m39038c()
                com.medallia.digital.mobilesdk.n r2 = r2.mo28073b()
                if (r2 == 0) goto L_0x012a
                com.medallia.digital.mobilesdk.a3 r2 = com.medallia.digital.mobilesdk.C10718a3.m39038c()
                com.medallia.digital.mobilesdk.n r2 = r2.mo28073b()
                java.lang.String r2 = r2.mo28827a()
                java.lang.String r3 = r0.mo28827a()
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x012a
                com.medallia.digital.mobilesdk.l4 r0 = com.medallia.digital.mobilesdk.C10956l4.this
                boolean unused = r0.f31479f = r1
                com.medallia.digital.mobilesdk.l4 r0 = com.medallia.digital.mobilesdk.C10956l4.this
                com.medallia.digital.mobilesdk.l0 r0 = r0.f31482i
                com.medallia.digital.mobilesdk.l4 r1 = com.medallia.digital.mobilesdk.C10956l4.this
                boolean r1 = r1.f31474a
                com.medallia.digital.mobilesdk.l4 r2 = com.medallia.digital.mobilesdk.C10956l4.this
                boolean r2 = r2.f31479f
                r0.mo28650a((boolean) r1, (boolean) r2)
                com.medallia.digital.mobilesdk.MDExternalError r0 = new com.medallia.digital.mobilesdk.MDExternalError
                com.medallia.digital.mobilesdk.MDExternalError$ExternalError r1 = com.medallia.digital.mobilesdk.MDExternalError.ExternalError.SDK_IS_ALREADY_INITIALIZED
                r0.<init>(r1)
                com.medallia.digital.mobilesdk.l4 r1 = com.medallia.digital.mobilesdk.C10956l4.this
                com.medallia.digital.mobilesdk.MDResultCallback r2 = r10.f31514a
                r1.m40112b((com.medallia.digital.mobilesdk.MDExternalError) r0, (com.medallia.digital.mobilesdk.MDResultCallback) r2)
                return
            L_0x012a:
                com.medallia.digital.mobilesdk.a3 r1 = com.medallia.digital.mobilesdk.C10718a3.m39038c()
                r1.mo28072a((com.medallia.digital.mobilesdk.C11009n) r0)
                com.medallia.digital.mobilesdk.a3 r0 = com.medallia.digital.mobilesdk.C10718a3.m39038c()
                com.medallia.digital.mobilesdk.n r0 = r0.mo28073b()
                java.lang.String r0 = r0.mo28827a()
                com.medallia.digital.mobilesdk.n4 r1 = com.medallia.digital.mobilesdk.C11016n4.m40375f()
                com.medallia.digital.mobilesdk.s6$a r2 = com.medallia.digital.mobilesdk.C11089s6.C11090a.API_TOKEN
                java.lang.String r1 = r1.mo28829a((com.medallia.digital.mobilesdk.C11089s6.C11090a) r2)
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x016a
                com.medallia.digital.mobilesdk.n4 r0 = com.medallia.digital.mobilesdk.C11016n4.m40375f()
                com.medallia.digital.mobilesdk.a3 r1 = com.medallia.digital.mobilesdk.C10718a3.m39038c()
                com.medallia.digital.mobilesdk.n r1 = r1.mo28073b()
                java.lang.String r1 = r1.mo28827a()
                r0.mo28831a(r2, r1)
                com.medallia.digital.mobilesdk.n4 r0 = com.medallia.digital.mobilesdk.C11016n4.m40375f()
                com.medallia.digital.mobilesdk.s6$a r1 = com.medallia.digital.mobilesdk.C11089s6.C11090a.ACCESS_TOKEN
                r2 = 0
                r0.mo28831a(r1, r2)
            L_0x016a:
                java.lang.String r0 = "SDK init started"
                com.medallia.digital.mobilesdk.C10735b4.m39113e(r0)
                com.medallia.digital.mobilesdk.AnalyticsBridge r0 = com.medallia.digital.mobilesdk.AnalyticsBridge.getInstance()
                boolean r1 = com.medallia.digital.mobilesdk.C10988l8.m40233c()
                boolean r2 = com.medallia.digital.mobilesdk.C10988l8.m40234d()
                r0.reportInitEvent(r1, r2)
                com.medallia.digital.mobilesdk.s6 r0 = com.medallia.digital.mobilesdk.C11089s6.m40668b()
                r0.mo28988e()
                com.medallia.digital.mobilesdk.h1 r0 = com.medallia.digital.mobilesdk.C10846h1.m39583b()
                r0.mo28389a()
                com.medallia.digital.mobilesdk.m4 r1 = com.medallia.digital.mobilesdk.C10998m4.m40266h()
                r2 = 60000(0xea60, float:8.4078E-41)
                r3 = 3
                r4 = 60000(0xea60, double:2.9644E-319)
                r6 = 0
                r8 = 512(0x200, float:7.175E-43)
                r9 = 3
                r1.mo28733a(r2, r3, r4, r6, r8, r9)
                com.medallia.digital.mobilesdk.l4 r0 = com.medallia.digital.mobilesdk.C10956l4.this
                com.medallia.digital.mobilesdk.MDResultCallback r1 = r10.f31514a
                r0.m40113b((com.medallia.digital.mobilesdk.MDResultCallback) r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C10956l4.C10969k.mo27617a():void");
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l4$l */
    class C10970l implements C10901j2.C10903b {
        C10970l() {
        }

        /* renamed from: a */
        public void mo28149a() {
        }

        public void onSuccess() {
            boolean unused = C10956l4.this.f31489p = true;
            C10956l4.this.m40135g();
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l4$m */
    class C10971m implements C11138v2.C11145g {
        C10971m() {
        }

        /* renamed from: a */
        public void mo28688a() {
            C10956l4.this.f31482i.mo28649a(C11138v2.m40821f().mo29078g());
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l4$o */
    class C10973o implements C10796e6<C10989m> {
        C10973o() {
        }

        /* renamed from: a */
        public void mo27796a(C10859h4 h4Var) {
        }

        /* renamed from: a */
        public void mo27797a(C10989m mVar) {
            C10870h8.m39667g().mo28439a(Long.valueOf(mVar.mo28719d()), mVar.mo28711a());
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l4$p */
    class C10974p extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ String f31523a;

        C10974p(String str) {
            this.f31523a = str;
        }

        /* renamed from: a */
        public void mo27617a() {
            C10842g8 b = C10842g8.m39567b();
            String str = this.f31523a;
            boolean z = false;
            b.mo28380a(str, str == null || str.isEmpty(), C10956l4.this.f31474a);
            AnalyticsBridge instance = AnalyticsBridge.getInstance();
            String str2 = this.f31523a;
            if (str2 == null || str2.isEmpty()) {
                z = true;
            }
            instance.reportSetUserIdEvent(Boolean.valueOf(z));
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l4$q */
    class C10975q extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ String f31525a;

        /* renamed from: b */
        final /* synthetic */ Object f31526b;

        C10975q(String str, Object obj) {
            this.f31525a = str;
            this.f31526b = obj;
        }

        /* renamed from: a */
        public void mo27617a() {
            C10846h1.m39583b().mo28390a(this.f31525a, this.f31526b, C10956l4.this.f31474a);
            AnalyticsBridge.getInstance().reportSetCustomParameterEvent(this.f31525a);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l4$r */
    class C10976r extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ HashMap f31528a;

        C10976r(HashMap hashMap) {
            this.f31528a = hashMap;
        }

        /* renamed from: a */
        public void mo27617a() {
            C10846h1.m39583b().mo28391a((HashMap<String, Object>) this.f31528a, C10956l4.this.f31474a);
            AnalyticsBridge.getInstance().reportSetCustomParametersEvent(this.f31528a);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l4$s */
    class C10977s extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ boolean f31530a;

        /* renamed from: com.medallia.digital.mobilesdk.l4$s$a */
        class C10978a implements C10796e6<C10989m> {
            C10978a() {
            }

            /* renamed from: a */
            public void mo27796a(C10859h4 h4Var) {
                C10977s sVar = C10977s.this;
                C10956l4.this.m40129e(sVar.f31530a);
            }

            /* renamed from: a */
            public void mo27797a(C10989m mVar) {
                C10870h8.m39667g().mo28439a(Long.valueOf(mVar.mo28719d()), mVar.mo28711a());
                if (mVar.mo28718c() >= C10998m4.m40266h().mo28751i() || mVar.mo28715b() < C10998m4.m40266h().mo28749e()) {
                    C10977s sVar = C10977s.this;
                    C10956l4.this.m40129e(sVar.f31530a);
                }
            }
        }

        C10977s(boolean z) {
            this.f31530a = z;
        }

        /* renamed from: a */
        public void mo27617a() {
            if (C11089s6.m40668b().mo28980a(C11089s6.C11090a.SDK_STOPPED, false)) {
                C10735b4.m39113e("SDK is already stopped");
                return;
            }
            AnalyticsBridge.getInstance().reportStopSDKEventImmediated(this.f31530a);
            new C10941l(C10956l4.this.f31476c, System.currentTimeMillis(), new C10978a()).mo28642c();
            C10870h8.m39667g().mo28444b(Lifetime.Session);
            if (C10998m4.m40266h().mo28748d() == null || !C10998m4.m40266h().mo28748d().mo28503e()) {
                C10956l4.this.m40129e(this.f31530a);
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l4$t */
    class C10979t extends C11033o4 {
        C10979t() {
        }

        /* renamed from: a */
        public void mo27617a() {
            C11089s6 b = C11089s6.m40668b();
            C11089s6.C11090a aVar = C11089s6.C11090a.SDK_STOPPED;
            if (!b.mo28980a(aVar, false)) {
                C10735b4.m39113e("SDK is not stopped");
                return;
            }
            if (C10956l4.this.f31487n != null) {
                C10956l4.this.f31487n.register();
            }
            C10735b4.m39113e("SDK stop is reverting");
            C11089s6.m40668b().mo28985b(aVar, false);
            C10870h8.m39667g().mo28447d(false);
            C11246z6.m41212b().mo29263a(false);
            AnalyticsBridge.getInstance().reportRevertStopSdkEvent();
            C11089s6.m40668b().mo28984b(C11089s6.C11090a.MISSING_EVENTS, AnalyticsBridge.getInstance().exportPendingEventsToJson());
            C11089s6.m40668b().mo28984b(C11089s6.C11090a.MISSING_EVENTS_V2, AnalyticsBridge.getInstance().exportPendingV2EventsToJson());
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l4$u */
    class C10980u extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ MDResultCallback f31534a;

        /* renamed from: b */
        final /* synthetic */ MDExternalError f31535b;

        C10980u(MDResultCallback mDResultCallback, MDExternalError mDExternalError) {
            this.f31534a = mDResultCallback;
            this.f31535b = mDExternalError;
        }

        /* renamed from: a */
        public void mo27617a() {
            this.f31534a.onError(this.f31535b);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l4$v */
    class C10981v extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ MDCallback f31537a;

        /* renamed from: b */
        final /* synthetic */ MDExternalError f31538b;

        C10981v(MDCallback mDCallback, MDExternalError mDExternalError) {
            this.f31537a = mDCallback;
            this.f31538b = mDExternalError;
        }

        /* renamed from: a */
        public void mo27617a() {
            this.f31537a.onError(this.f31538b);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l4$w */
    class C10982w extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ MDFailureCallback f31540a;

        /* renamed from: b */
        final /* synthetic */ MDExternalError f31541b;

        C10982w(MDFailureCallback mDFailureCallback, MDExternalError mDExternalError) {
            this.f31540a = mDFailureCallback;
            this.f31541b = mDExternalError;
        }

        /* renamed from: a */
        public void mo27617a() {
            this.f31540a.onError(this.f31541b);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l4$x */
    private enum C10983x {
        V1,
        V2
    }

    protected C10956l4() {
        C10945l0 l0Var = new C10945l0();
        this.f31482i = l0Var;
        this.f31483j = new C10990m0(l0Var);
        MedalliaExceptionHandler medalliaExceptionHandler = new MedalliaExceptionHandler(C10884i4.m39721c().mo28481a());
        this.f31487n = medalliaExceptionHandler;
        m40097a(medalliaExceptionHandler);
    }

    /* renamed from: j */
    private void m40139j() {
        long d = C10718a3.m39038c().mo28069a().mo28095d();
        CollectorsInfrastructure.getInstance().setPropertyId(Long.valueOf(d));
        C11089s6.m40668b().mo28983b(C11089s6.C11090a.PROPERTY_ID, d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C10901j2 mo28678c() {
        return this.f31485l;
    }

    public void clearAndDisconnect() {
        if (this.f31474a || this.f31480g) {
            C10735b4.m39107a("Medallia SDK");
            this.f31474a = false;
            this.f31484k = null;
            this.f31479f = false;
            this.f31482i.mo28650a(false, false);
            if (!this.f31480g) {
                C11164w3.m40939b().clearAndDisconnect();
            }
            CollectorsInfrastructure.getInstance().clearAndDisconnect();
            C10930k2.m39976a();
            C11138v2.m40821f().clearAndDisconnect();
            C10846h1.m39583b().clearAndDisconnect();
            C10870h8.m39667g().clearAndDisconnect();
            C10998m4.m40266h().clearAndDisconnect();
            C10876i1.m39698a().clearAndDisconnect();
            C11089s6.m40668b().clearAndDisconnect();
            C11016n4.m40375f().clearAndDisconnect();
            AnalyticsBridge.getInstance().clearAndDisconnect();
            C10718a3.m39038c().clearAndDisconnect();
            C10842g8.m39567b().clearAndDisconnect();
            C10735b4.m39113e("Disconnected from Medallia SDK");
            C10735b4.m39105a().clearAndDisconnect();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo28685h() {
        C11004m7.m40304b().mo28763a().execute(new C10979t());
    }

    /* renamed from: com.medallia.digital.mobilesdk.l4$h */
    class C10966h implements C11138v2.C11144f<Void> {

        /* renamed from: a */
        final /* synthetic */ String f31507a;

        /* renamed from: b */
        final /* synthetic */ ConfigurationContract f31508b;

        C10966h(String str, ConfigurationContract configurationContract) {
            this.f31507a = str;
            this.f31508b = configurationContract;
        }

        /* renamed from: a */
        public void mo28689a() {
            C11138v2.m40821f().mo29068b(this.f31508b.getPropertyConfiguration());
        }

        /* renamed from: a */
        public void mo28690a(Void voidR) {
            C10956l4.this.f31483j.mo28721a(this.f31507a);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l4$n */
    class C10972n implements C11138v2.C11144f<Void> {

        /* renamed from: a */
        final /* synthetic */ String f31519a;

        /* renamed from: b */
        final /* synthetic */ ConfigurationContract f31520b;

        C10972n(String str, ConfigurationContract configurationContract) {
            this.f31519a = str;
            this.f31520b = configurationContract;
        }

        /* renamed from: a */
        public void mo28689a() {
            C11138v2.m40821f().mo29068b(this.f31520b.getPropertyConfiguration());
        }

        /* renamed from: a */
        public void mo28690a(Void voidR) {
            C10956l4.this.f31483j.mo28721a(this.f31519a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m40109b() {
        C11247z7.m41221a(C11247z7.C11249b.CONFIGURATION_UUID);
        List<Pair<String, Boolean>> a = C10714a1.m39019a();
        if (a != null) {
            for (Pair next : a) {
                if (next != null) {
                    AnalyticsBridge.getInstance().reportDeleteStorageEvent((String) next.first, ((Boolean) next.second).booleanValue());
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m40126d(MDResultCallback mDResultCallback) {
        if (mDResultCallback == null) {
            C10735b4.m39114f("Missing listener, however, method will run regardless");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m40129e(boolean z) {
        C11089s6.m40668b().mo28985b(C11089s6.C11090a.SDK_STOPPED, true);
        C10735b4.m39113e("SDK is stopped");
        C11246z6.m41212b().mo29263a(true);
        MedalliaExceptionHandler medalliaExceptionHandler = this.f31487n;
        if (medalliaExceptionHandler != null) {
            medalliaExceptionHandler.unregister();
        }
        if (z) {
            C10870h8.m39667g().mo28447d(true);
            C10870h8.m39667g().mo28444b(Lifetime.Forever);
            C10846h1.m39583b().mo28389a();
            C10876i1.m39698a().mo28464a(C10785e0.C10786a.Feedback, Long.valueOf(System.currentTimeMillis()));
            m40105a(new File(C10930k2.m39991f(".crashes/crash.txt")));
        }
        C10827g3.m39512d().mo28342a(C10880i3.C10882b.stopApi);
        C10887i7.m39741e().mo28493h();
    }

    /* renamed from: f */
    private void m40132f(boolean z) {
        this.f31484k.mo28840c();
        m40139j();
        CollectorsInfrastructure.getInstance().setSDKAnalyticsVersion(C10862h6.C10863a.valueOf(z ? "V2" : "V1"));
        CollectorsInfrastructure.getInstance().setSDKFramework(this.f31477d);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m40135g() {
        if (this.f31488o && this.f31489p) {
            this.f31489p = false;
            this.f31488o = false;
            mo28498a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m40138i() {
        this.f31475b = true;
        CollectorsInfrastructure.getInstance().stopCollectors();
        C11138v2.m40821f().mo29066b();
    }

    /* renamed from: a */
    public void mo28498a() {
        new C10941l(this.f31476c, System.currentTimeMillis(), new C10973o()).mo28642c();
        C10870h8.m39667g().mo28438a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo28679c(long j) {
        try {
            if (!m40133f()) {
                if (this.f31484k.mo28838a(j)) {
                    m40110b(j);
                } else if (this.f31483j.mo28723a()) {
                    this.f31483j.mo28722a(Locale.getDefault(), mo28684e());
                }
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* renamed from: b */
    private void m40110b(long j) {
        C10735b4.m39113e("Refresh session started");
        C10827g3.m39512d().mo28342a(C10880i3.C10882b.refreshSession);
        C10887i7.m39741e().mo28493h();
        C10998m4.m40266h().mo28741a("2.0.0", (C10796e6<C11235z0>) new C10967i(System.currentTimeMillis(), j));
    }

    /* renamed from: c */
    private void m40118c(ConfigurationContract configurationContract) {
        CollectorsConfigurationContract collectorsConfigurationContract;
        C11208y0.m41106c().mo29205a(configurationContract);
        boolean z = false;
        if (configurationContract == null || configurationContract.getSdkConfiguration() == null) {
            collectorsConfigurationContract = null;
        } else {
            collectorsConfigurationContract = configurationContract.getSdkConfiguration().getCollectorsConfigurations();
            if (configurationContract.getSdkConfiguration().getMedalliaDigitalBrain() != null) {
                z = configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().isSessionPercentageSupportDouble();
            }
        }
        this.f31484k.mo28837a(configurationContract);
        C10870h8.m39667g().mo28435a(configurationContract);
        CollectorsInfrastructure.getInstance().updateConfiguration(collectorsConfigurationContract, z);
        CollectorsInfrastructure.getInstance().pollAll();
        C10809f5.m39420a().mo28302b(new C10960d(configurationContract));
    }

    /* renamed from: f */
    private boolean m40133f() {
        return C11089s6.m40668b().mo28980a(C11089s6.C11090a.SDK_STOPPED, false);
    }

    /* renamed from: a */
    public void mo28658a(long j) {
        mo28679c(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo28682d(boolean z) {
        C11004m7.m40304b().mo28763a().execute(new C10977s(z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo28684e() {
        return this.f31474a;
    }

    /* renamed from: b */
    private void m40111b(ConfigurationContract configurationContract) {
        if (configurationContract != null && configurationContract.getSdkConfiguration() != null && configurationContract.getSdkConfiguration().getMedalliaDigitalBrain() != null) {
            this.f31476c = configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().getMaxUserJourneyEventsSize();
            C11089s6.m40668b().mo28985b(C11089s6.C11090a.IS_BLACKBOX_ENABLED, configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().isBlackBoxEnabled());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m40119c(MDExternalError mDExternalError, MDResultCallback mDResultCallback) {
        C10735b4.m39113e("Failure");
        C10735b4.m39114f("End - " + mDExternalError.getMessage());
        m40096a(mDExternalError, mDResultCallback);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28659a(Activity activity) {
        if (!mo28683d() && activity != null) {
            try {
                Activity activity2 = (Activity) C10884i4.m39721c().mo28484d().getBaseContext();
            } catch (Exception unused) {
                C10884i4.m39719a(activity.getApplication());
                C10884i4.m39721c().mo28482a((Context) activity);
                C11164w3.m40939b().mo29110a(activity);
                AnalyticsBridge.getInstance().reportSetActivityEvent(activity);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo28683d() {
        return this.f31475b;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m40092a(AnalyticsBridge.C10665c cVar, long j, long j2) {
        try {
            AnalyticsBridge instance = AnalyticsBridge.getInstance();
            long currentTimeMillis = System.currentTimeMillis();
            try {
                instance.reportRefreshSessionEvent(j, currentTimeMillis, j2, this.f31484k.mo28836a(), C11089s6.m40668b().mo28975a(C11089s6.C11090a.PREVIOUS_SESSION_ID, (String) null), cVar);
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m40112b(MDExternalError mDExternalError, MDResultCallback mDResultCallback) {
        C10735b4.m39113e("Failure");
        C10735b4.m39111c("End - " + mDExternalError.getMessage());
        m40096a(mDExternalError, mDResultCallback);
        AnalyticsBridge.getInstance().reportInitCallbackEvent(AnalyticsBridge.C10665c.failure, Integer.valueOf(mDExternalError.getErrorCode()), mDExternalError.getMessage(), System.currentTimeMillis() - this.f31478e, C10988l8.m40233c(), C10988l8.m40234d());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m40120c(MDResultCallback mDResultCallback) {
        if (mDResultCallback != null) {
            C11004m7.m40304b().mo28764c().execute(new C10958b(mDResultCallback));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m40113b(MDResultCallback mDResultCallback) {
        C10998m4.m40266h().mo28741a("2.0.0", (C10796e6<C11235z0>) new C10959c(mDResultCallback));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28660a(MDAppearanceMode mDAppearanceMode) {
        if (!mo28683d()) {
            if (mo28684e() && !C10986l7.m40219c().mo28705a(mDAppearanceMode)) {
                C10735b4.m39113e("updateCustomAppearance = " + mDAppearanceMode.toString() + ", isSuccess = " + true);
            }
            AnalyticsBridge.getInstance().reportSetCustomAppearanceEvent(mDAppearanceMode);
            C10986l7.m40219c().mo28708b(mDAppearanceMode);
        }
    }

    /* renamed from: a */
    private void m40093a(MDCallback mDCallback, String str) {
        if (mDCallback != null) {
            C11004m7.m40304b().mo28764c().execute(new C10957a(mDCallback, str));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28661a(MDCustomInterceptListener mDCustomInterceptListener) {
        try {
            if (!mo28683d()) {
                this.f31481h.mo28849a(C11026o0.C11027a.CustomIntercept, mDCustomInterceptListener);
                C10735b4.m39113e("CustomInterceptListener was successfully set");
                AnalyticsBridge.getInstance().reportSetCustomInterceptListenerEvent();
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* renamed from: a */
    private void m40094a(MDExternalError mDExternalError, MDCallback mDCallback) {
        if (mDCallback != null) {
            C11004m7.m40304b().mo28764c().execute(new C10981v(mDCallback, mDExternalError));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo28680c(String str, MDResultCallback mDResultCallback) {
        if (mo28683d()) {
            m40096a(new MDExternalError(MDExternalError.ExternalError.SDK_NOT_INITIALIZED), mDResultCallback);
        } else {
            this.f31482i.mo28648a(FormDisplayType.CODE, str, mDResultCallback);
        }
    }

    /* renamed from: a */
    private void m40095a(MDExternalError mDExternalError, MDFailureCallback mDFailureCallback) {
        if (mDFailureCallback != null) {
            C11004m7.m40304b().mo28764c().execute(new C10982w(mDFailureCallback, mDExternalError));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo28677b(String str, MDResultCallback mDResultCallback) {
        if (C10752c.m39175a(str)) {
            this.f31480g = true;
            C10752c.m39173a(str, mDResultCallback);
            return;
        }
        C11004m7.m40304b().mo28763a().execute(new C10969k(mDResultCallback, str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo28681c(boolean z) {
        if (!mo28683d()) {
            if (!mo28684e()) {
                this.f31490q = Boolean.valueOf(z);
                return;
            }
            this.f31491r = true;
            C11089s6 b = C11089s6.m40668b();
            C11089s6.C11090a aVar = C11089s6.C11090a.IS_DEBUG_FORM;
            if (b.mo28980a(aVar, false) != z) {
                C11089s6.m40668b().mo28985b(aVar, z);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m40096a(MDExternalError mDExternalError, MDResultCallback mDResultCallback) {
        if (mDResultCallback != null) {
            C11004m7.m40304b().mo28764c().execute(new C10980u(mDResultCallback, mDExternalError));
        }
    }

    /* renamed from: b */
    private void m40117b(boolean z) {
        try {
            File file = new File(C10930k2.m39991f(".crashes/crash.txt"));
            String e = C10930k2.m39989e(file);
            if (e != null) {
                if (e.indexOf(BuildConfig.LIBRARY_PACKAGE_NAME) != -1) {
                    JSONObject jSONObject = new JSONObject(e);
                    long j = jSONObject.getLong("timestamp");
                    String string = jSONObject.getString("stacktrace");
                    Long valueOf = Long.valueOf(C11089s6.m40668b().mo28974a(C11089s6.C11090a.PROPERTY_ID, -1));
                    C11089s6 b = C11089s6.m40668b();
                    C11089s6.C11090a aVar = C11089s6.C11090a.SESSION_ID;
                    String a = b.mo28975a(aVar, (String) null);
                    boolean reportMedalliaCrashEventImmediate = AnalyticsBridge.getInstance().reportMedalliaCrashEventImmediate(string, j, C11089s6.m40668b().mo28975a(aVar, UUID.randomUUID().toString()), valueOf);
                    if ((!z && (!C10988l8.m40232b() || a == null)) || !reportMedalliaCrashEventImmediate) {
                        return;
                    }
                }
                m40105a(file);
            }
        } catch (Exception e2) {
            C10735b4.m39111c(e2.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28662a(MDFeedbackListener mDFeedbackListener) {
        try {
            if (!mo28683d()) {
                this.f31481h.mo28849a(C11026o0.C11027a.Feedback, mDFeedbackListener);
                C10735b4.m39113e("FeedbackListener was successfully set");
                AnalyticsBridge.getInstance().reportSetFeedbackListenerEvent();
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28663a(MDFormListener mDFormListener) {
        try {
            if (!mo28683d()) {
                this.f31481h.mo28849a(C11026o0.C11027a.Form, mDFormListener);
                C10735b4.m39113e("FormListener was set successfully");
                AnalyticsBridge.getInstance().reportSetFormListenerEvent();
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28664a(MDInterceptListener mDInterceptListener) {
        try {
            if (!mo28683d()) {
                this.f31481h.mo28849a(C11026o0.C11027a.Intercept, mDInterceptListener);
                C10735b4.m39113e("InterceptListener was successfully set");
                AnalyticsBridge.getInstance().reportSetInterceptListenerEvent();
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28665a(MDLogLevel mDLogLevel) {
        try {
            if (!mo28683d()) {
                if (mDLogLevel != null) {
                    if (!mDLogLevel.equals(MDLogLevel.OFF)) {
                        Log.w("com.medallia.digital", "setLogLevel method is to be used in integration stages only. Remove in app production rollout!");
                    }
                    C10735b4.m39105a().mo28119a(mDLogLevel);
                    C10735b4.m39113e("Log level was set to " + mDLogLevel);
                }
                AnalyticsBridge.getInstance().reportLoggerEvent(mDLogLevel);
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28666a(MDResultCallback mDResultCallback) {
        if (this.f31479f) {
            mDResultCallback.onError(new MDExternalError(MDExternalError.ExternalError.SDK_INITIALIZATION_IN_PROGRESS));
        } else if (C11164w3.m40939b().mo29121f()) {
            mDResultCallback.onError(new MDExternalError(MDExternalError.ExternalError.APP_IS_IN_BG));
        } else if (C10827g3.m39512d().mo28346c()) {
            mDResultCallback.onSuccess();
            C10735b4.m39113e("Close Engagement Api completed");
        } else if (C11138v2.m40821f().mo29071c()) {
            mDResultCallback.onSuccess();
            C10735b4.m39113e("Close Engagement Api completed");
        } else {
            boolean d = C10887i7.m39741e().mo28490d();
            mDResultCallback.onSuccess();
            if (d) {
                C10735b4.m39113e("Close Engagement Api completed");
            } else {
                C10735b4.m39113e("Close Engagement Api completed - no engagement was open");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28667a(MDSdkFrameworkType mDSdkFrameworkType) {
        if (!mo28683d() && this.f31477d != null) {
            this.f31477d = mDSdkFrameworkType;
            C10735b4.m39113e("SDK Framework was successfully set to " + this.f31477d.toString());
        }
    }

    /* renamed from: a */
    private void m40097a(MedalliaExceptionHandler medalliaExceptionHandler) {
        if (C11089s6.m40668b().mo28980a(C11089s6.C11090a.IS_BLACKBOX_ENABLED, false) && medalliaExceptionHandler != null) {
            medalliaExceptionHandler.register();
            C10735b4.m39113e("Register to Blackbox");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m40098a(C10790e3 e3Var, MDResultCallback mDResultCallback) {
        MDExternalError a = e3Var.mo28260a();
        C10735b4.m39113e("Failure");
        if (a != null && mDResultCallback != null) {
            C11164w3.m40939b().mo29122l();
            C10735b4.m39111c(a.getMessage());
            m40096a(a, mDResultCallback);
            AnalyticsBridge.getInstance().reportInitCallbackEvent(AnalyticsBridge.C10665c.failure, Integer.valueOf(a.getErrorCode()), a.getMessage(), System.currentTimeMillis() - this.f31478e, C10988l8.m40233c(), C10988l8.m40234d());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28668a(C11235z0 z0Var) {
        boolean z;
        C11138v2 f;
        String str;
        try {
            ConfigurationContract a = z0Var.mo29240a();
            m40111b(a);
            if (!this.f31487n.isRegistered()) {
                m40097a(this.f31487n);
            }
            SharedPreferences c = C11089s6.m40668b().mo28986c();
            C11089s6.C11090a aVar = C11089s6.C11090a.PREVIOUS_ANALYTICS_V2;
            Boolean valueOf = c.contains(aVar.toString()) ? Boolean.valueOf(C11089s6.m40668b().mo28980a(aVar, false)) : null;
            SharedPreferences c2 = C11089s6.m40668b().mo28986c();
            C11089s6.C11090a aVar2 = C11089s6.C11090a.PREVIOUS_SEND_USER_JOURNEY;
            Boolean valueOf2 = c2.contains(aVar2.toString()) ? Boolean.valueOf(C11089s6.m40668b().mo28980a(aVar2, false)) : null;
            C10998m4.m40266h().mo28735a(a);
            AnalyticsBridge.getInstance().reportInitCallbackEvent(AnalyticsBridge.C10665c.success, (Integer) null, (String) null, System.currentTimeMillis() - this.f31478e, C10988l8.m40233c(), C10988l8.m40234d());
            boolean booleanValue = a.getSdkConfiguration().getMedalliaDigitalClientConfig().isAnalyticsEnabled().booleanValue();
            if (a.getSdkConfiguration() == null || a.getSdkConfiguration().getMedalliaDigitalClientConfig() == null) {
                z = false;
            } else {
                z = a.getSdkConfiguration().getMedalliaDigitalClientConfig().getAnalyticsV2ConfigurationContract() != null ? a.getSdkConfiguration().getMedalliaDigitalClientConfig().getAnalyticsV2ConfigurationContract().mo28503e() : false;
                AnalyticsBridge.getInstance().initAnalytics(booleanValue, a.getSdkConfiguration().getMedalliaDigitalClientConfig().getAnalyticsV2ConfigurationContract(), a.getSdkConfiguration().getEventsConfigurations(), C10870h8.m39667g().mo28446d());
            }
            m40117b(z);
            long currentTimeMillis = System.currentTimeMillis();
            new C10941l(this.f31476c, valueOf, valueOf2, currentTimeMillis, new C10963e()).mo28642c();
            C11089s6.m40668b().mo28984b(C11089s6.C11090a.MISSING_EVENTS, (String) null);
            C11089s6.m40668b().mo28984b(C11089s6.C11090a.MISSING_EVENTS_V2, (String) null);
            this.f31484k.mo28839b();
            this.f31485l.mo28521a((C10901j2.C10903b) new C10964f());
            this.f31485l.mo28519a();
            Boolean bool = this.f31490q;
            if (bool != null) {
                mo28681c(bool.booleanValue());
            } else if (!this.f31491r && C11089s6.m40668b().mo28980a(C11089s6.C11090a.IS_DEBUG_FORM, false)) {
                mo28681c(false);
            }
            C11138v2.m40821f().mo29056a(a, z0Var.mo29241b(), C11089s6.m40668b().mo28980a(C11089s6.C11090a.IS_DEBUG_FORM, false), new C10965g(a));
            boolean i = C11221y3.m41127d().mo29223i();
            boolean k = C11138v2.m40821f().mo29082k();
            boolean a2 = this.f31483j.mo28723a();
            if (z0Var.mo29241b() && k && (i || a2)) {
                if (i) {
                    C11221y3.m41127d().mo29218d(C11221y3.m41127d().mo29220f());
                }
                if (a2) {
                    C11221y3.m41127d().mo29212a(Locale.getDefault());
                }
                f = C11138v2.m40821f();
            } else if (!k || (!i && !a2)) {
                f = C11138v2.m40821f();
            } else {
                if (i) {
                    str = C11221y3.m41127d().mo29220f();
                    C11221y3.m41127d().mo29218d(str);
                } else {
                    str = null;
                }
                if (a2) {
                    if (!i) {
                        str = Locale.getDefault().toString();
                    }
                    C11221y3.m41127d().mo29212a(Locale.getDefault());
                }
                C11138v2.m40821f().mo29057a((C11138v2.C11144f<Void>) new C10966h(str, a));
                AnalyticsBridge.getInstance().reportPreInitEvents();
                CollectorsInfrastructure.getInstance().setInitialized(true);
                C11246z6.m41212b().mo29261a(a);
                C11221y3.m41127d().mo29213a(true);
                C10870h8.m39667g().mo28437a(false, (Long) null, currentTimeMillis);
                C10846h1.m39583b().mo28392a(this.f31474a);
                C10842g8.m39567b().mo28381a(this.f31474a, true);
                C11164w3.m40939b().mo29112a((C11164w3.C11171g) this);
                m40118c(a);
                m40132f(z);
                AnalyticsBridge.getInstance().regeneratePreInitV2Events();
                this.f31481h.mo28849a(C11026o0.C11027a.UserJourneyAction, this);
                this.f31481h.mo28848a();
            }
            f.mo29068b(a.getPropertyConfiguration());
            AnalyticsBridge.getInstance().reportPreInitEvents();
            CollectorsInfrastructure.getInstance().setInitialized(true);
            C11246z6.m41212b().mo29261a(a);
            C11221y3.m41127d().mo29213a(true);
            C10870h8.m39667g().mo28437a(false, (Long) null, currentTimeMillis);
            C10846h1.m39583b().mo28392a(this.f31474a);
            C10842g8.m39567b().mo28381a(this.f31474a, true);
            C11164w3.m40939b().mo29112a((C11164w3.C11171g) this);
            m40118c(a);
            m40132f(z);
            AnalyticsBridge.getInstance().regeneratePreInitV2Events();
            this.f31481h.mo28849a(C11026o0.C11027a.UserJourneyAction, this);
            this.f31481h.mo28848a();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m40104a(C11235z0 z0Var, long j, long j2) {
        C11138v2 f;
        try {
            ConfigurationContract a = z0Var.mo29240a();
            m40111b(a);
            SharedPreferences c = C11089s6.m40668b().mo28986c();
            C11089s6.C11090a aVar = C11089s6.C11090a.PREVIOUS_ANALYTICS_V2;
            Boolean valueOf = c.contains(aVar.toString()) ? Boolean.valueOf(C11089s6.m40668b().mo28980a(aVar, false)) : null;
            SharedPreferences c2 = C11089s6.m40668b().mo28986c();
            C11089s6.C11090a aVar2 = C11089s6.C11090a.PREVIOUS_SEND_USER_JOURNEY;
            Boolean valueOf2 = c2.contains(aVar2.toString()) ? Boolean.valueOf(C11089s6.m40668b().mo28980a(aVar2, false)) : null;
            long currentTimeMillis = System.currentTimeMillis();
            new C10941l(this.f31476c, valueOf, valueOf2, currentTimeMillis, new C10968j()).mo28642c();
            C10998m4.m40266h().mo28735a(a);
            if (!(a.getSdkConfiguration() == null || a.getSdkConfiguration().getMedalliaDigitalClientConfig() == null)) {
                AnalyticsBridge.getInstance().initAnalytics(a.getSdkConfiguration().getMedalliaDigitalClientConfig().isAnalyticsEnabled().booleanValue(), a.getSdkConfiguration().getMedalliaDigitalClientConfig().getAnalyticsV2ConfigurationContract(), a.getSdkConfiguration().getEventsConfigurations(), C10870h8.m39667g().mo28446d());
            }
            C11089s6.m40668b().mo28984b(C11089s6.C11090a.MISSING_EVENTS, (String) null);
            C11089s6.m40668b().mo28984b(C11089s6.C11090a.MISSING_EVENTS_V2, (String) null);
            this.f31484k.mo28839b();
            this.f31485l.mo28521a((C10901j2.C10903b) new C10970l());
            this.f31485l.mo28519a();
            C11138v2.m40821f().mo29056a(a, z0Var.mo29241b(), C11089s6.m40668b().mo28980a(C11089s6.C11090a.IS_DEBUG_FORM, false), new C10971m());
            boolean k = C11138v2.m40821f().mo29082k();
            boolean a2 = this.f31483j.mo28723a();
            if (z0Var.mo29241b() && k && a2) {
                C11221y3.m41127d().mo29212a(Locale.getDefault());
                f = C11138v2.m40821f();
            } else if (!k || !a2) {
                f = C11138v2.m40821f();
            } else {
                String locale = Locale.getDefault().toString();
                C11221y3.m41127d().mo29212a(Locale.getDefault());
                C11138v2.m40821f().mo29057a((C11138v2.C11144f<Void>) new C10972n(locale, a));
                C10870h8.m39667g().mo28443b(false, (Long) null, currentTimeMillis);
                m40118c(a);
                this.f31484k.mo28840c();
                m40092a(AnalyticsBridge.C10665c.success, j, j2);
                C10735b4.m39113e("SDK refresh session finished successfully");
            }
            f.mo29068b(a.getPropertyConfiguration());
            C10870h8.m39667g().mo28443b(false, (Long) null, currentTimeMillis);
            m40118c(a);
            this.f31484k.mo28840c();
            m40092a(AnalyticsBridge.C10665c.success, j, j2);
            C10735b4.m39113e("SDK refresh session finished successfully");
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* renamed from: a */
    private void m40105a(File file) {
        Boolean a = C10930k2.m39973a(file);
        if (a != null) {
            AnalyticsBridge.getInstance().reportDeleteStorageEvent(C10930k2.m39991f(".crashes/crash.txt"), a.booleanValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28669a(String str) {
        if (!mo28683d()) {
            C11004m7.m40304b().mo28763a().execute(new C10974p(str));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28670a(String str, MDCallback mDCallback) {
        if (!mo28683d()) {
            if (!mo28684e() || C11221y3.m41127d().mo29214a(str)) {
                this.f31481h.mo28849a(C11026o0.C11027a.Localization, mDCallback);
                MDExternalError d = C11221y3.m41127d().mo29218d(str);
                if (d == null) {
                    if (mo28684e()) {
                        this.f31483j.mo28721a(str);
                    }
                    AnalyticsBridge.getInstance().updateCustomLocaleEvent(str, true);
                    return;
                }
                AnalyticsBridge.getInstance().updateCustomLocaleEvent(str, false);
                C10735b4.m39113e("updateCustomLocale = " + str + ", isSuccess = " + false);
                m40094a(d, mDCallback);
                return;
            }
            AnalyticsBridge.getInstance().updateCustomLocaleEvent(str, true);
            C10735b4.m39113e("updateCustomLocale = " + str + ", isSuccess = " + true);
            m40093a(mDCallback, (String) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28671a(String str, MDInterceptActionType mDInterceptActionType, MDFailureCallback mDFailureCallback) {
        if (mo28683d()) {
            m40095a(new MDExternalError(MDExternalError.ExternalError.SDK_NOT_INITIALIZED), mDFailureCallback);
        } else {
            C10827g3.m39512d().mo28343a(str, mDInterceptActionType, mDFailureCallback);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28672a(String str, MDResultCallback mDResultCallback) {
        if (mo28683d()) {
            m40096a(new MDExternalError(MDExternalError.ExternalError.SDK_NOT_INITIALIZED), mDResultCallback);
        } else {
            this.f31482i.mo28648a(FormDisplayType.NOTIFICATION, str, mDResultCallback);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28673a(String str, Object obj) {
        if (!mo28683d()) {
            C11004m7.m40304b().mo28763a().execute(new C10975q(str, obj));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28674a(HashMap<String, Object> hashMap) {
        if (!mo28683d()) {
            C11004m7.m40304b().mo28763a().execute(new C10976r(hashMap));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28675a(boolean z) {
        try {
            if (!mo28683d()) {
                if (this.f31474a) {
                    if (z) {
                        C10735b4.m39113e("Intercept was enabled");
                        CollectorsInfrastructure.getInstance().interceptEnabledCollector.mo28117a(Boolean.TRUE);
                        AnalyticsBridge.getInstance().reportEnableInterceptEvent();
                    } else {
                        C10735b4.m39113e("Intercept was disabled");
                        CollectorsInfrastructure.getInstance().interceptDisabledCollector.mo28117a(Boolean.TRUE);
                        AnalyticsBridge.getInstance().reportDisableInterceptEvent();
                    }
                }
                C11246z6.m41212b().mo29264a(z, this.f31474a);
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28676a(ConfigurationContract configurationContract) {
        if (!(configurationContract == null || configurationContract.getKillStatus() == null)) {
            if (this.f31486m.mo28938a(configurationContract.getKillStatus())) {
                this.f31486m.mo28939b(configurationContract.getKillStatus());
                List<Pair<String, Boolean>> a = C10714a1.m39019a();
                if (a == null) {
                    return true;
                }
                for (Pair next : a) {
                    if (next != null) {
                        AnalyticsBridge.getInstance().reportDeleteStorageEvent((String) next.first, ((Boolean) next.second).booleanValue());
                    }
                }
                return true;
            } else if (this.f31486m.mo28942c(configurationContract.getKillStatus())) {
                AnalyticsBridge.getInstance().reportRestoreFromKillSDKEvent(System.currentTimeMillis());
            }
        }
        this.f31486m.clear();
        return false;
    }
}

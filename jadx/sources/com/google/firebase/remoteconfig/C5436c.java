package com.google.firebase.remoteconfig;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C1612n;
import com.google.android.gms.common.api.internal.C3867a;
import com.google.firebase.C5270e;
import com.google.firebase.remoteconfig.internal.C5444f;
import com.google.firebase.remoteconfig.internal.C5455m;
import com.google.firebase.remoteconfig.internal.C5459o;
import com.google.firebase.remoteconfig.internal.C5460p;
import com.google.firebase.remoteconfig.internal.C5463q;
import com.google.firebase.remoteconfig.internal.C5468t;
import com.google.firebase.remoteconfig.internal.C5473w;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import p251sa.C8288k;
import p251sa.C8289l;
import p260t6.C8404f;
import p260t6.C8407i;
import p275u8.C8648b;
import p301w8.C8878a;
import p327y9.C9142b;
import p337z7.C9231i;
import p339z9.C9270e;

/* renamed from: com.google.firebase.remoteconfig.c */
public class C5436c {

    /* renamed from: j */
    private static final C8404f f17340j = C8407i.m31544d();

    /* renamed from: k */
    private static final Random f17341k = new Random();

    /* renamed from: l */
    private static final Map f17342l = new HashMap();

    /* renamed from: a */
    private final Map f17343a;

    /* renamed from: b */
    private final Context f17344b;

    /* renamed from: c */
    private final ScheduledExecutorService f17345c;

    /* renamed from: d */
    private final C5270e f17346d;

    /* renamed from: e */
    private final C9270e f17347e;

    /* renamed from: f */
    private final C8648b f17348f;

    /* renamed from: g */
    private final C9142b f17349g;

    /* renamed from: h */
    private final String f17350h;

    /* renamed from: i */
    private Map f17351i;

    /* renamed from: com.google.firebase.remoteconfig.c$a */
    private static class C5437a implements C3867a.C3868a {

        /* renamed from: a */
        private static final AtomicReference f17352a = new AtomicReference();

        private C5437a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static void m21617c(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference = f17352a;
            if (atomicReference.get() == null) {
                C5437a aVar = new C5437a();
                if (C1612n.m5659a(atomicReference, (Object) null, aVar)) {
                    C3867a.m14589c(application);
                    C3867a.m14588b().mo11991a(aVar);
                }
            }
        }

        /* renamed from: a */
        public void mo12004a(boolean z) {
            C5436c.m21609p(z);
        }
    }

    C5436c(Context context, ScheduledExecutorService scheduledExecutorService, C5270e eVar, C9270e eVar2, C8648b bVar, C9142b bVar2) {
        this(context, scheduledExecutorService, eVar, eVar2, bVar, bVar2, true);
    }

    /* renamed from: e */
    private C5444f m21602e(String str, String str2) {
        return C5444f.m21648h(this.f17345c, C5468t.m21783c(this.f17344b, String.format("%s_%s_%s_%s.json", new Object[]{"frc", this.f17350h, str, str2})));
    }

    /* renamed from: i */
    private C5459o m21603i(C5444f fVar, C5444f fVar2) {
        return new C5459o(this.f17345c, fVar, fVar2);
    }

    /* renamed from: j */
    static C5460p m21604j(Context context, String str, String str2) {
        return new C5460p(context.getSharedPreferences(String.format("%s_%s_%s_%s", new Object[]{"frc", str, str2, "settings"}), 0));
    }

    /* renamed from: k */
    private static C5473w m21605k(C5270e eVar, String str, C9142b bVar) {
        if (!m21607n(eVar) || !str.equals("firebase")) {
            return null;
        }
        return new C5473w(bVar);
    }

    /* renamed from: m */
    private static boolean m21606m(C5270e eVar, String str) {
        if (!str.equals("firebase") || !m21607n(eVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private static boolean m21607n(C5270e eVar) {
        return eVar.mo17482m().equals("[DEFAULT]");
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ C8878a m21608o() {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static synchronized void m21609p(boolean z) {
        synchronized (C5436c.class) {
            for (C5434a o : f17342l.values()) {
                o.mo18063o(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized C5434a mo18067c(C5270e eVar, String str, C9270e eVar2, C8648b bVar, Executor executor, C5444f fVar, C5444f fVar2, C5444f fVar3, C5455m mVar, C5459o oVar, C5460p pVar) {
        C5434a aVar;
        C8648b bVar2;
        String str2 = str;
        synchronized (this) {
            if (!this.f17343a.containsKey(str2)) {
                Context context = this.f17344b;
                if (m21606m(eVar, str)) {
                    bVar2 = bVar;
                } else {
                    bVar2 = null;
                }
                C5434a aVar2 = r10;
                C5434a aVar3 = new C5434a(context, eVar, eVar2, bVar2, executor, fVar, fVar2, fVar3, mVar, oVar, pVar, mo18072l(eVar, eVar2, mVar, fVar2, this.f17344b, str, pVar));
                aVar2.mo18064p();
                this.f17343a.put(str2, aVar2);
                f17342l.put(str2, aVar2);
            }
            aVar = (C5434a) this.f17343a.get(str2);
        }
        return aVar;
    }

    /* renamed from: d */
    public synchronized C5434a mo18068d(String str) {
        C5444f e;
        C5444f e2;
        C5444f e3;
        C5460p j;
        C5459o i;
        e = m21602e(str, "fetch");
        e2 = m21602e(str, "activate");
        e3 = m21602e(str, "defaults");
        j = m21604j(this.f17344b, this.f17350h, str);
        i = m21603i(e2, e3);
        C5473w k = m21605k(this.f17346d, str, this.f17349g);
        if (k != null) {
            i.mo18112b(new C8288k(k));
        }
        return mo18067c(this.f17346d, str, this.f17347e, this.f17348f, this.f17345c, e, e2, e3, mo18070g(str, e, j), i, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C5434a mo18069f() {
        return mo18068d("firebase");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized C5455m mo18070g(String str, C5444f fVar, C5460p pVar) {
        C9270e eVar;
        C9142b bVar;
        eVar = this.f17347e;
        if (m21607n(this.f17346d)) {
            bVar = this.f17349g;
        } else {
            new C8289l
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0012: CONSTRUCTOR  (r0v7 ? I:sa.l) =  call: sa.l.<init>():void type: CONSTRUCTOR in method: com.google.firebase.remoteconfig.c.g(java.lang.String, com.google.firebase.remoteconfig.internal.f, com.google.firebase.remoteconfig.internal.p):com.google.firebase.remoteconfig.internal.m, dex: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v7 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 38 more
                */
            /*
                this = this;
                monitor-enter(r11)
                com.google.firebase.remoteconfig.internal.m r10 = new com.google.firebase.remoteconfig.internal.m     // Catch:{ all -> 0x0034 }
                z9.e r1 = r11.f17347e     // Catch:{ all -> 0x0034 }
                com.google.firebase.e r0 = r11.f17346d     // Catch:{ all -> 0x0034 }
                boolean r0 = m21607n(r0)     // Catch:{ all -> 0x0034 }
                if (r0 == 0) goto L_0x0010
                y9.b r0 = r11.f17349g     // Catch:{ all -> 0x0034 }
                goto L_0x0015
            L_0x0010:
                sa.l r0 = new sa.l     // Catch:{ all -> 0x0034 }
                r0.<init>()     // Catch:{ all -> 0x0034 }
            L_0x0015:
                r2 = r0
                java.util.concurrent.ScheduledExecutorService r3 = r11.f17345c     // Catch:{ all -> 0x0034 }
                t6.f r4 = f17340j     // Catch:{ all -> 0x0034 }
                java.util.Random r5 = f17341k     // Catch:{ all -> 0x0034 }
                com.google.firebase.e r0 = r11.f17346d     // Catch:{ all -> 0x0034 }
                com.google.firebase.k r0 = r0.mo17483n()     // Catch:{ all -> 0x0034 }
                java.lang.String r0 = r0.mo17516b()     // Catch:{ all -> 0x0034 }
                com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient r7 = r11.mo18071h(r0, r12, r14)     // Catch:{ all -> 0x0034 }
                java.util.Map r9 = r11.f17351i     // Catch:{ all -> 0x0034 }
                r0 = r10
                r6 = r13
                r8 = r14
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0034 }
                monitor-exit(r11)
                return r10
            L_0x0034:
                r12 = move-exception
                monitor-exit(r11)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.C5436c.mo18070g(java.lang.String, com.google.firebase.remoteconfig.internal.f, com.google.firebase.remoteconfig.internal.p):com.google.firebase.remoteconfig.internal.m");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public ConfigFetchHttpClient mo18071h(String str, String str2, C5460p pVar) {
            return new ConfigFetchHttpClient(this.f17344b, this.f17346d.mo17483n().mo17517c(), str, str2, pVar.mo18116b(), pVar.mo18116b());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public synchronized C5463q mo18072l(C5270e eVar, C9270e eVar2, C5455m mVar, C5444f fVar, Context context, String str, C5460p pVar) {
            C5463q qVar;
            synchronized (this) {
                qVar = new C5463q(eVar, eVar2, mVar, fVar, context, str, pVar, this.f17345c);
            }
            return qVar;
        }

        protected C5436c(Context context, ScheduledExecutorService scheduledExecutorService, C5270e eVar, C9270e eVar2, C8648b bVar, C9142b bVar2, boolean z) {
            this.f17343a = new HashMap();
            this.f17351i = new HashMap();
            this.f17344b = context;
            this.f17345c = scheduledExecutorService;
            this.f17346d = eVar;
            this.f17347e = eVar2;
            this.f17348f = bVar;
            this.f17349g = bVar2;
            this.f17350h = eVar.mo17483n().mo17517c();
            C5437a.m21617c(context);
            if (z) {
                C9231i.m34110d(scheduledExecutorService, new C5435b(this));
            }
        }
    }

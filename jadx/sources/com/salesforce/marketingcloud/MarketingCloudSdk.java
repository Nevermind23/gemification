package com.salesforce.marketingcloud;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.salesforce.marketingcloud.C11398b;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MCLogListener;
import com.salesforce.marketingcloud.alarms.C11327b;
import com.salesforce.marketingcloud.analytics.AnalyticsManager;
import com.salesforce.marketingcloud.analytics.C11360h;
import com.salesforce.marketingcloud.analytics.C11364j;
import com.salesforce.marketingcloud.behaviors.C11404c;
import com.salesforce.marketingcloud.behaviors.LifecycleManager;
import com.salesforce.marketingcloud.events.C11424c;
import com.salesforce.marketingcloud.events.EventManager;
import com.salesforce.marketingcloud.http.C11481c;
import com.salesforce.marketingcloud.internal.C11497c;
import com.salesforce.marketingcloud.internal.C11499d;
import com.salesforce.marketingcloud.internal.C11501e;
import com.salesforce.marketingcloud.internal.C11513l;
import com.salesforce.marketingcloud.location.C11548f;
import com.salesforce.marketingcloud.media.C11580o;
import com.salesforce.marketingcloud.messages.C11608d;
import com.salesforce.marketingcloud.messages.RegionMessageManager;
import com.salesforce.marketingcloud.messages.iam.InAppMessageComponent;
import com.salesforce.marketingcloud.messages.iam.InAppMessageManager;
import com.salesforce.marketingcloud.messages.inbox.C11666a;
import com.salesforce.marketingcloud.messages.inbox.InboxMessageManager;
import com.salesforce.marketingcloud.messages.push.C11689a;
import com.salesforce.marketingcloud.messages.push.PushMessageManager;
import com.salesforce.marketingcloud.notifications.C11695a;
import com.salesforce.marketingcloud.notifications.NotificationManager;
import com.salesforce.marketingcloud.proximity.C11712e;
import com.salesforce.marketingcloud.registration.C11717d;
import com.salesforce.marketingcloud.registration.C11730f;
import com.salesforce.marketingcloud.registration.RegistrationManager;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents;
import com.salesforce.marketingcloud.sfmcsdk.components.identity.ModuleIdentity;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface;
import com.salesforce.marketingcloud.storage.C11800j;
import com.salesforce.marketingcloud.util.C11806a;
import com.salesforce.marketingcloud.util.C11807b;
import com.salesforce.marketingcloud.util.C11810e;
import com.salesforce.marketingcloud.util.C11819h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import org.json.JSONObject;

public final class MarketingCloudSdk extends PushModuleInterface implements C11398b.C11400b {

    /* renamed from: A */
    private static volatile boolean f32852A = false;

    /* renamed from: B */
    private static volatile boolean f32853B = true;

    /* renamed from: s */
    static final String f32854s = "MarketingCloudPrefs";

    /* renamed from: t */
    static final String f32855t = "InitConfig";

    /* renamed from: u */
    static final String f32856u = C11461g.m41875a("MarketingCloudSdk");

    /* renamed from: v */
    private static final Object f32857v = new Object();

    /* renamed from: w */
    private static final List<C11300c> f32858w = new ArrayList();

    /* renamed from: x */
    static MarketingCloudSdk f32859x;

    /* renamed from: y */
    private static Context f32860y;

    /* renamed from: z */
    private static volatile boolean f32861z;

    /* renamed from: a */
    private final MarketingCloudConfig f32862a;

    /* renamed from: b */
    private final List<C11418d> f32863b = new ArrayList();

    /* renamed from: c */
    private final SFMCSdkComponents f32864c;

    /* renamed from: d */
    C11548f f32865d;

    /* renamed from: e */
    C11404c f32866e;

    /* renamed from: f */
    private C11398b f32867f;

    /* renamed from: g */
    private C11800j f32868g;

    /* renamed from: h */
    private C11481c f32869h;

    /* renamed from: i */
    private C11666a f32870i;

    /* renamed from: j */
    private C11717d f32871j;

    /* renamed from: k */
    private C11695a f32872k;

    /* renamed from: l */
    private C11689a f32873l;

    /* renamed from: m */
    private C11608d f32874m;

    /* renamed from: n */
    private C11424c f32875n;

    /* renamed from: o */
    private AnalyticsManager f32876o;

    /* renamed from: p */
    private InitializationStatus f32877p;

    /* renamed from: q */
    private InAppMessageComponent f32878q;

    /* renamed from: r */
    private C11513l f32879r;

    @MCKeep
    public interface InitializationListener {
        void complete(InitializationStatus initializationStatus);
    }

    @MCKeep
    public interface WhenReadyListener {
        void ready(MarketingCloudSdk marketingCloudSdk);
    }

    /* renamed from: com.salesforce.marketingcloud.MarketingCloudSdk$a */
    class C11298a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f32880a;

        /* renamed from: b */
        final /* synthetic */ MarketingCloudConfig f32881b;

        /* renamed from: c */
        final /* synthetic */ SFMCSdkComponents f32882c;

        /* renamed from: d */
        final /* synthetic */ InitializationListener f32883d;

        C11298a(Context context, MarketingCloudConfig marketingCloudConfig, SFMCSdkComponents sFMCSdkComponents, InitializationListener initializationListener) {
            this.f32880a = context;
            this.f32881b = marketingCloudConfig;
            this.f32882c = sFMCSdkComponents;
            this.f32883d = initializationListener;
        }

        public void run() {
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("SFMC_init");
            try {
                String str = MarketingCloudSdk.f32856u;
                C11461g.m41891d(str, "Starting init thread", new Object[0]);
                MarketingCloudSdk.m41398a(this.f32880a, this.f32881b, this.f32882c, this.f32883d);
                Thread.currentThread().setName(name);
                C11461g.m41891d(str, "~~ MarketingCloudSdk v%s init complete ~~", MarketingCloudSdk.getSdkVersionName());
            } catch (Throwable th) {
                Thread.currentThread().setName(name);
                C11461g.m41891d(MarketingCloudSdk.f32856u, "~~ MarketingCloudSdk v%s init complete ~~", MarketingCloudSdk.getSdkVersionName());
                throw th;
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.MarketingCloudSdk$b */
    class C11299b extends C11300c {
        C11299b(Looper looper, WhenReadyListener whenReadyListener) {
            super(looper, whenReadyListener);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29653a(WhenReadyListener whenReadyListener) {
            if (whenReadyListener != null) {
                whenReadyListener.ready(MarketingCloudSdk.f32859x);
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.MarketingCloudSdk$c */
    static abstract class C11300c {

        /* renamed from: a */
        private final Handler f32884a;

        /* renamed from: b */
        WhenReadyListener f32885b;

        /* renamed from: c */
        volatile boolean f32886c;

        /* renamed from: d */
        private final Runnable f32887d = new C11301a();

        /* renamed from: e */
        private volatile boolean f32888e;

        /* renamed from: com.salesforce.marketingcloud.MarketingCloudSdk$c$a */
        class C11301a implements Runnable {
            C11301a() {
            }

            public void run() {
                synchronized (C11300c.this) {
                    if (!C11300c.this.f32886c) {
                        C11300c cVar = C11300c.this;
                        cVar.mo29653a(cVar.f32885b);
                        C11300c.this.f32886c = true;
                    }
                }
            }
        }

        C11300c(Looper looper, WhenReadyListener whenReadyListener) {
            looper = looper == null ? Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper() : looper;
            this.f32885b = whenReadyListener;
            this.f32884a = new Handler(looper);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo29654a() {
            /*
                r2 = this;
                monitor-enter(r2)
                boolean r0 = r2.f32886c     // Catch:{ all -> 0x0018 }
                if (r0 != 0) goto L_0x0016
                boolean r0 = r2.f32888e     // Catch:{ all -> 0x0018 }
                if (r0 == 0) goto L_0x000a
                goto L_0x0016
            L_0x000a:
                r0 = 1
                r2.f32888e = r0     // Catch:{ all -> 0x0018 }
                android.os.Handler r0 = r2.f32884a     // Catch:{ all -> 0x0018 }
                java.lang.Runnable r1 = r2.f32887d     // Catch:{ all -> 0x0018 }
                r0.post(r1)     // Catch:{ all -> 0x0018 }
                monitor-exit(r2)     // Catch:{ all -> 0x0018 }
                return
            L_0x0016:
                monitor-exit(r2)     // Catch:{ all -> 0x0018 }
                return
            L_0x0018:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0018 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.MarketingCloudSdk.C11300c.mo29654a():void");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo29653a(WhenReadyListener whenReadyListener);
    }

    private MarketingCloudSdk(MarketingCloudConfig marketingCloudConfig, SFMCSdkComponents sFMCSdkComponents) {
        this.f32862a = marketingCloudConfig;
        this.f32864c = sFMCSdkComponents;
    }

    /* renamed from: a */
    private InitializationStatus m41397a(String str) {
        InitializationStatus.C11293a aVar;
        String str2 = str;
        if (C11807b.m43205a()) {
            return C11497c.m42020a();
        }
        InitializationStatus.C11293a b = C11497c.m42021b();
        try {
            String a = C11810e.m43212a(f32860y, str2);
            try {
                this.f32879r = new C11513l();
                C11800j jVar = new C11800j(f32860y, new C11806a(f32860y, this.f32862a.applicationId(), this.f32862a.accessToken(), a), this.f32862a.applicationId(), this.f32862a.accessToken(), this.f32879r);
                this.f32868g = jVar;
                jVar.mo31614a(b);
            } catch (Throwable th) {
                C11461g.m41881a(f32856u, th, "Unable to initialize SDK storage.", new Object[0]);
                b.mo29531a(th);
            }
            if (!b.mo29534b()) {
                C11717d.m42746a(this.f32862a, f32860y, a, str2);
                return b.mo29527a();
            }
            this.f32866e = new C11404c(f32860y, Executors.newSingleThreadExecutor());
            this.f32869h = new C11481c(f32860y, this.f32868g.mo31608f(), this.f32879r);
            C11327b bVar = new C11327b(f32860y, this.f32868g, this.f32866e);
            C11360h hVar = new C11360h(this.f32862a, this.f32868g, a, bVar, this.f32866e, this.f32869h, this.f32879r);
            this.f32876o = hVar;
            C11530k kVar = new C11530k(a, this.f32862a, this.f32868g, this.f32869h, this.f32866e, bVar, hVar, this.f32879r);
            this.f32867f = new C11398b(kVar, this.f32868g.mo31618o());
            this.f32865d = C11548f.m42170a(f32860y, this.f32862a);
            C11712e a2 = C11712e.m42725a(f32860y, this.f32862a);
            this.f32872k = C11695a.m42661a(f32860y, this.f32868g, this.f32862a.notificationCustomizationOptions(), (C11364j) hVar);
            C11666a aVar2 = r5;
            C11712e eVar = a2;
            C11666a aVar3 = new C11666a(this.f32862a, this.f32868g, a, this.f32866e, bVar, this.f32869h, this.f32879r, hVar);
            this.f32870i = aVar2;
            Context context = f32860y;
            MarketingCloudConfig marketingCloudConfig = this.f32862a;
            C11800j jVar2 = this.f32868g;
            C11548f fVar = this.f32865d;
            C11404c cVar = this.f32866e;
            C11481c cVar2 = this.f32869h;
            C11530k kVar2 = kVar;
            InitializationStatus.C11293a aVar4 = b;
            String str3 = a;
            try {
                C11608d dVar = new C11608d(context, marketingCloudConfig, jVar2, a, fVar, eVar, cVar, bVar, cVar2, this.f32872k, this.f32879r, hVar);
                this.f32874m = dVar;
                this.f32873l = new C11689a(f32860y, this.f32868g, this.f32872k, bVar, this.f32862a.senderId());
                C11730f fVar2 = new C11730f(str3, this.f32862a.applicationId(), C11819h.m43265a(f32860y));
                this.f32871j = new C11717d(f32860y, this.f32862a, this.f32868g, fVar2, this.f32866e, bVar, this.f32869h, (PushMessageManager) this.f32873l, this.f32879r, this.f32864c);
                Context context2 = f32860y;
                C11800j jVar3 = this.f32868g;
                this.f32878q = new InAppMessageComponent(context2, jVar3, bVar, kVar2, this.f32866e, C11580o.m42266a(context2, jVar3), this.f32862a.urlHandler(), this.f32879r, hVar, this.f32864c);
                this.f32875n = new C11424c(f32860y, fVar2, this.f32868g, kVar2, this.f32866e, hVar, this.f32879r, this.f32864c, this.f32878q);
                this.f32863b.add(this.f32866e);
                this.f32863b.add(LifecycleManager.m41716a((Application) f32860y.getApplicationContext()));
                this.f32863b.add(this.f32869h);
                this.f32863b.add(bVar);
                this.f32863b.add(kVar2);
                this.f32863b.add(this.f32867f);
                this.f32863b.add(this.f32865d);
                this.f32863b.add(eVar);
                this.f32863b.add(hVar);
                this.f32863b.add(this.f32870i);
                this.f32863b.add(this.f32872k);
                this.f32863b.add(this.f32874m);
                this.f32863b.add(this.f32873l);
                this.f32863b.add(this.f32871j);
                this.f32863b.add(this.f32878q);
                this.f32863b.add(this.f32875n);
                int a3 = this.f32867f.mo29844a();
                C11461g.m41891d(f32856u, "Initializing all components with control channel flag [%d]", Integer.valueOf(a3));
                for (C11418d next : this.f32863b) {
                    C11461g.m41891d(f32856u, "init called for %s", next.componentName());
                    if (next instanceof C11419e) {
                        aVar = aVar4;
                        try {
                            ((C11419e) next).init(aVar, a3);
                        } catch (Exception e) {
                            e = e;
                            aVar.mo29531a((Throwable) e);
                            C11461g.m41885b(f32856u, e, "Something wrong with internal init", new Object[0]);
                            return aVar.mo29527a();
                        }
                    } else {
                        aVar = aVar4;
                        if (next instanceof C11460f) {
                            ((C11460f) next).mo29669a(aVar);
                        }
                    }
                    aVar.mo29529a(next);
                    aVar4 = aVar;
                }
                aVar = aVar4;
            } catch (Exception e2) {
                e = e2;
                aVar = aVar4;
                aVar.mo29531a((Throwable) e);
                C11461g.m41885b(f32856u, e, "Something wrong with internal init", new Object[0]);
                return aVar.mo29527a();
            }
            return aVar.mo29527a();
        } catch (Exception e3) {
            e = e3;
            aVar = b;
            aVar.mo29531a((Throwable) e);
            C11461g.m41885b(f32856u, e, "Something wrong with internal init", new Object[0]);
            return aVar.mo29527a();
        }
    }

    /* renamed from: c */
    static void m41403c() {
        MarketingCloudSdk marketingCloudSdk = f32859x;
        if (marketingCloudSdk != null) {
            marketingCloudSdk.m41400a(false);
        }
        f32859x = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003b, code lost:
        return r2;
     */
    @com.salesforce.marketingcloud.MCKeep
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.salesforce.marketingcloud.MarketingCloudSdk getInstance() {
        /*
            boolean r0 = f32861z
            if (r0 != 0) goto L_0x0011
            boolean r0 = f32852A
            if (r0 == 0) goto L_0x0009
            goto L_0x0011
        L_0x0009:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "MarketingCloudSdk#init must be called before calling MarketingCloudSdk#getInstance."
            r0.<init>(r1)
            throw r0
        L_0x0011:
            java.lang.Object r0 = f32857v
            monitor-enter(r0)
            boolean r1 = f32852A     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x001c
            com.salesforce.marketingcloud.MarketingCloudSdk r1 = f32859x     // Catch:{ all -> 0x0047 }
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            return r1
        L_0x001c:
            r1 = 0
        L_0x001d:
            boolean r2 = f32852A     // Catch:{ all -> 0x003c }
            if (r2 != 0) goto L_0x002f
            boolean r2 = f32861z     // Catch:{ all -> 0x003c }
            if (r2 == 0) goto L_0x002f
            java.lang.Object r2 = f32857v     // Catch:{ InterruptedException -> 0x002d }
            r3 = 0
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x002d }
            goto L_0x001d
        L_0x002d:
            r1 = 1
            goto L_0x001d
        L_0x002f:
            com.salesforce.marketingcloud.MarketingCloudSdk r2 = f32859x     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x003a
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0047 }
            r1.interrupt()     // Catch:{ all -> 0x0047 }
        L_0x003a:
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            return r2
        L_0x003c:
            r2 = move-exception
            if (r1 == 0) goto L_0x0046
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0047 }
            r1.interrupt()     // Catch:{ all -> 0x0047 }
        L_0x0046:
            throw r2     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.MarketingCloudSdk.getInstance():com.salesforce.marketingcloud.MarketingCloudSdk");
    }

    @MCLogListener.LogLevel
    @MCKeep
    public static int getLogLevel() {
        return C11499d.m42024a();
    }

    @MCKeep
    public static int getSdkVersionCode() {
        return C11306a.f32916d;
    }

    @MCKeep
    public static String getSdkVersionName() {
        return C11306a.f32917e;
    }

    @MCKeep
    public static void init(Context context, MarketingCloudConfig marketingCloudConfig, InitializationListener initializationListener) {
        m41401b(context, marketingCloudConfig, (SFMCSdkComponents) null, initializationListener);
    }

    @MCKeep
    public static boolean isInitializing() {
        return f32861z;
    }

    @MCKeep
    public static boolean isReady() {
        return f32852A && f32859x != null;
    }

    @MCKeep
    public static void requestSdk(Looper looper, WhenReadyListener whenReadyListener) {
        C11299b bVar = new C11299b(looper, whenReadyListener);
        List<C11300c> list = f32858w;
        synchronized (list) {
            if (f32853B) {
                list.add(bVar);
            } else {
                bVar.mo29654a();
            }
        }
    }

    @MCKeep
    public static void setLogLevel(@MCLogListener.LogLevel int i) {
        C11499d.m42025a(i);
    }

    @MCKeep
    public static void setLogListener(MCLogListener mCLogListener) {
        C11499d.m42026a(mCLogListener);
    }

    @MCKeep
    public static void unregisterWhenReadyListener(WhenReadyListener whenReadyListener) {
        if (whenReadyListener != null) {
            List<C11300c> list = f32858w;
            synchronized (list) {
                Iterator<C11300c> it = list.iterator();
                while (it.hasNext()) {
                    if (whenReadyListener == it.next().f32885b) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public C11800j mo29636b() {
        return this.f32868g;
    }

    @MCKeep
    public AnalyticsManager getAnalyticsManager() {
        return this.f32876o;
    }

    @MCKeep
    public EventManager getEventManager() {
        return this.f32875n;
    }

    @MCKeep
    public InAppMessageManager getInAppMessageManager() {
        return this.f32878q;
    }

    @MCKeep
    public InboxMessageManager getInboxMessageManager() {
        return this.f32870i;
    }

    @MCKeep
    public InitializationStatus getInitializationStatus() {
        return this.f32877p;
    }

    @MCKeep
    public MarketingCloudConfig getMarketingCloudConfig() {
        return this.f32862a;
    }

    public ModuleIdentity getModuleIdentity() {
        return C11491i.m41999a(this.f32862a.applicationId(), getRegistrationManager());
    }

    @MCKeep
    public NotificationManager getNotificationManager() {
        return this.f32872k;
    }

    @MCKeep
    public PushMessageManager getPushMessageManager() {
        return this.f32873l;
    }

    @MCKeep
    public RegionMessageManager getRegionMessageManager() {
        return this.f32874m;
    }

    @MCKeep
    public RegistrationManager getRegistrationManager() {
        return this.f32871j;
    }

    @MCKeep
    public JSONObject getSdkState() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("initConfig", this.f32862a.toString());
            jSONObject.put("initStatus", this.f32877p.toString());
            for (C11418d next : this.f32863b) {
                if (next != null) {
                    try {
                        jSONObject.put(next.componentName(), next.componentState());
                    } catch (Exception e) {
                        C11461g.m41885b(f32856u, e, "Failed to create component state for %s", next);
                    }
                }
            }
        } catch (Exception e2) {
            C11461g.m41885b(f32856u, e2, "Unable to create Sdk state json", new Object[0]);
        }
        return jSONObject;
    }

    public JSONObject getState() {
        return getSdkState();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m41401b(android.content.Context r6, com.salesforce.marketingcloud.MarketingCloudConfig r7, com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents r8, com.salesforce.marketingcloud.MarketingCloudSdk.InitializationListener r9) {
        /*
            java.lang.String r0 = f32856u
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = getSdkVersionName()
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "~~ MarketingCloudSdk v%s init() ~~"
            com.salesforce.marketingcloud.C11461g.m41891d((java.lang.String) r0, (java.lang.String) r3, (java.lang.Object[]) r2)
            java.lang.String r2 = "Context cannot be null."
            com.salesforce.marketingcloud.util.C11821j.m43272a(r6, (java.lang.String) r2)
            java.lang.String r2 = "Config cannot be null."
            com.salesforce.marketingcloud.util.C11821j.m43272a(r7, (java.lang.String) r2)
            java.lang.String r2 = r7.applicationId()
            java.lang.String r3 = r7.accessToken()
            java.lang.String r5 = r7.senderId()
            com.salesforce.marketingcloud.internal.C11499d.m42027a(r2, r3, r5)
            java.lang.Object r2 = f32857v
            monitor-enter(r2)
            boolean r3 = f32852A     // Catch:{ all -> 0x0086 }
            if (r3 != 0) goto L_0x0035
            boolean r3 = f32861z     // Catch:{ all -> 0x0086 }
            if (r3 == 0) goto L_0x0064
        L_0x0035:
            com.salesforce.marketingcloud.MarketingCloudSdk r3 = f32859x     // Catch:{ all -> 0x0086 }
            if (r3 == 0) goto L_0x0064
            com.salesforce.marketingcloud.MarketingCloudConfig r3 = r3.f32862a     // Catch:{ all -> 0x0086 }
            boolean r3 = r7.equals(r3)     // Catch:{ all -> 0x0086 }
            if (r3 == 0) goto L_0x0064
            java.lang.String r6 = "MarketingCloudSdk is already %s"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ all -> 0x0086 }
            boolean r8 = f32852A     // Catch:{ all -> 0x0086 }
            if (r8 == 0) goto L_0x004c
            java.lang.String r8 = "initialized"
            goto L_0x004e
        L_0x004c:
            java.lang.String r8 = "initializing"
        L_0x004e:
            r7[r4] = r8     // Catch:{ all -> 0x0086 }
            com.salesforce.marketingcloud.C11461g.m41891d((java.lang.String) r0, (java.lang.String) r6, (java.lang.Object[]) r7)     // Catch:{ all -> 0x0086 }
            boolean r6 = isReady()     // Catch:{ all -> 0x0086 }
            if (r6 == 0) goto L_0x0062
            if (r9 == 0) goto L_0x0062
            com.salesforce.marketingcloud.MarketingCloudSdk r6 = f32859x     // Catch:{ all -> 0x0086 }
            com.salesforce.marketingcloud.InitializationStatus r6 = r6.f32877p     // Catch:{ all -> 0x0086 }
            r9.complete(r6)     // Catch:{ all -> 0x0086 }
        L_0x0062:
            monitor-exit(r2)     // Catch:{ all -> 0x0086 }
            return
        L_0x0064:
            java.lang.String r3 = "Starting initialization"
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0086 }
            com.salesforce.marketingcloud.C11461g.m41891d((java.lang.String) r0, (java.lang.String) r3, (java.lang.Object[]) r5)     // Catch:{ all -> 0x0086 }
            f32852A = r4     // Catch:{ all -> 0x0086 }
            f32861z = r1     // Catch:{ all -> 0x0086 }
            f32853B = r1     // Catch:{ all -> 0x0086 }
            android.content.Context r0 = r6.getApplicationContext()     // Catch:{ all -> 0x0086 }
            f32860y = r0     // Catch:{ all -> 0x0086 }
            java.lang.Thread r0 = new java.lang.Thread     // Catch:{ all -> 0x0086 }
            com.salesforce.marketingcloud.MarketingCloudSdk$a r1 = new com.salesforce.marketingcloud.MarketingCloudSdk$a     // Catch:{ all -> 0x0086 }
            r1.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x0086 }
            r0.<init>(r1)     // Catch:{ all -> 0x0086 }
            r0.start()     // Catch:{ all -> 0x0086 }
            monitor-exit(r2)     // Catch:{ all -> 0x0086 }
            return
        L_0x0086:
            r6 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0086 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.MarketingCloudSdk.m41401b(android.content.Context, com.salesforce.marketingcloud.MarketingCloudConfig, com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents, com.salesforce.marketingcloud.MarketingCloudSdk$InitializationListener):void");
    }

    @MCKeep
    public static void requestSdk(WhenReadyListener whenReadyListener) {
        requestSdk((Looper) null, whenReadyListener);
    }

    /* renamed from: a */
    public C11481c mo29634a() {
        return this.f32869h;
    }

    /* renamed from: b */
    private void m41402b(boolean z) {
        for (int size = this.f32863b.size() - 1; size >= 0; size--) {
            try {
                this.f32863b.get(size).tearDown(z);
            } catch (Exception e) {
                C11461g.m41885b(f32856u, e, "Error encountered tearing down component.", new Object[0]);
            }
        }
        this.f32863b.clear();
        C11513l lVar = this.f32879r;
        if (lVar != null) {
            lVar.mo30090c();
        }
        C11800j jVar = this.f32868g;
        if (jVar != null) {
            try {
                jVar.mo31626x();
            } catch (Exception e2) {
                C11461g.m41885b(f32856u, e2, "Error encountered tearing down storage.", new Object[0]);
            }
            this.f32868g = null;
        }
        List<C11300c> list = f32858w;
        synchronized (list) {
            list.clear();
        }
        f32852A = false;
        f32853B = true;
    }

    /* renamed from: a */
    public void mo29635a(int i) {
        for (int size = this.f32863b.size() - 1; size >= 0; size--) {
            try {
                C11418d dVar = this.f32863b.get(size);
                if (dVar instanceof C11419e) {
                    ((C11419e) dVar).controlChannelInit(i);
                }
            } catch (Exception e) {
                C11461g.m41885b(f32856u, e, "Error encountered during control channel init.", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    static void m41398a(Context context, MarketingCloudConfig marketingCloudConfig, SFMCSdkComponents sFMCSdkComponents, InitializationListener initializationListener) {
        String str = f32856u;
        C11461g.m41891d(str, "executeInit %s", marketingCloudConfig);
        synchronized (f32857v) {
            MarketingCloudSdk marketingCloudSdk = f32859x;
            if (marketingCloudSdk != null) {
                marketingCloudSdk.m41402b(C11501e.m42032a(marketingCloudConfig, marketingCloudSdk.f32862a));
            }
            f32859x = new MarketingCloudSdk(marketingCloudConfig, sFMCSdkComponents);
            InitializationStatus a = f32859x.m41397a(sFMCSdkComponents != null ? sFMCSdkComponents.getRegistrationId() : null);
            C11461g.m41880a(str, "MarketingCloudSdk init finished with status: %s", a);
            f32852A = a.isUsable();
            f32861z = false;
            if (f32852A) {
                f32859x.m41399a(a);
                MarketingCloudSdk marketingCloudSdk2 = f32859x;
                marketingCloudSdk2.f32867f.mo29845a((C11398b.C11400b) marketingCloudSdk2);
                List<C11300c> list = f32858w;
                synchronized (list) {
                    f32853B = false;
                    C11461g.m41891d(str, "Delivering queued SDK requests to %s listeners", Integer.valueOf(list.size()));
                    if (!list.isEmpty()) {
                        for (C11300c a2 : list) {
                            a2.mo29654a();
                        }
                        f32858w.clear();
                    }
                }
            } else {
                f32859x.m41400a(false);
                f32859x = null;
                List<C11300c> list2 = f32858w;
                synchronized (list2) {
                    list2.clear();
                }
            }
            f32857v.notifyAll();
            if (initializationListener != null) {
                initializationListener.complete(a);
            }
        }
    }

    /* renamed from: a */
    private void m41399a(InitializationStatus initializationStatus) {
        this.f32877p = initializationStatus;
    }

    /* renamed from: a */
    private void m41400a(boolean z) {
        m41402b(z);
        f32861z = false;
    }
}

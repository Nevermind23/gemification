package com.salesforce.marketingcloud.sfmcsdk;

import android.annotation.SuppressLint;
import android.content.Context;
import com.salesforce.marketingcloud.sfmcsdk.components.behaviors.BehaviorManagerImpl;
import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import com.salesforce.marketingcloud.sfmcsdk.components.events.EventManager;
import com.salesforce.marketingcloud.sfmcsdk.components.identity.Identity;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.LogLevel;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.LogListener;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import com.salesforce.marketingcloud.sfmcsdk.components.utils.SdkExecutors;
import com.salesforce.marketingcloud.sfmcsdk.modules.Config;
import com.salesforce.marketingcloud.sfmcsdk.modules.Module;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleIdentifier;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.cdp.CdpModule;
import com.salesforce.marketingcloud.sfmcsdk.modules.cdp.CdpModuleConfig;
import com.salesforce.marketingcloud.sfmcsdk.modules.cdp.CdpModuleReadyListener;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModule;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleConfig;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleReadyListener;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import ue1.C43075l;

public final class SFMCSdk {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Object SDK_LOCK = new Object();
    public static final String SDK_VERSION_NAME = "1.0.2";
    private static final String TAG = "~$SFMCSdk";
    /* access modifiers changed from: private */
    public static final List<WhenReadyHandler> UNIFIED_SDK_INSTANCE_REQUESTS = new ArrayList();
    /* access modifiers changed from: private */
    @SuppressLint({"StaticFieldLeak"})
    public static final BehaviorManagerImpl behaviorManager;
    /* access modifiers changed from: private */
    public static CdpModule cdpModule = new CdpModule();
    /* access modifiers changed from: private */
    public static volatile InitializationState initializationState = InitializationState.NONE;
    /* access modifiers changed from: private */
    @SuppressLint({"StaticFieldLeak"})
    public static SFMCSdk instance;
    /* access modifiers changed from: private */
    public static PushModule pushModule = new PushModule();
    private final SFMCSdkModuleConfig config;
    private final SdkExecutors executors;
    public Identity identity;
    /* access modifiers changed from: private */
    public final List<Module> modules;

    public static final class Companion {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InitializationState.values().length];
                iArr[InitializationState.READY.ordinal()] = 1;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void configure$default(Companion companion, Context context, SFMCSdkModuleConfig sFMCSdkModuleConfig, C43075l lVar, int i, Object obj) {
            if ((i & 4) != 0) {
                lVar = null;
            }
            companion.configure(context, sFMCSdkModuleConfig, lVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: configure$lambda-14$lambda-13  reason: not valid java name */
        public static final void m125019configure$lambda14$lambda13(SFMCSdkModuleConfig sFMCSdkModuleConfig, C43075l lVar, Context context) {
            C41536l.m120489i(sFMCSdkModuleConfig, "$config");
            C41536l.m120489i(context, "$context");
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("SFMCSdk_Init");
            try {
                if (SFMCSdk.instance != null) {
                    SFMCSdk.Companion.staticTearDown();
                }
                SFMCSdk.instance = new SFMCSdk(sFMCSdkModuleConfig, (DefaultConstructorMarker) null);
                CountDownLatch countDownLatch = new CountDownLatch(sFMCSdkModuleConfig.getConfigs$sfmcsdk_release().size());
                SFMCSdkLogger.INSTANCE.mo31452d(SFMCSdk.TAG, new SFMCSdk$Companion$configure$1$3$moduleInitLatch$1$1(sFMCSdkModuleConfig));
                for (Config config : sFMCSdkModuleConfig.getConfigs$sfmcsdk_release()) {
                    SFMCSdkLogger.INSTANCE.mo31452d(SFMCSdk.TAG, new SFMCSdk$Companion$configure$1$3$2$1(config));
                    String name2 = config.getModuleIdentifier().name();
                    String moduleApplicationId = config.getModuleApplicationId();
                    Companion companion = SFMCSdk.Companion;
                    SFMCSdkComponents sFMCSdkComponents = new SFMCSdkComponents(context, name2, moduleApplicationId, companion.getBehaviorManager$sfmcsdk_release().initIfNecessary$sfmcsdk_release(context), new EventManager(config.getModuleIdentifier().name()));
                    SFMCSdk access$getInstance$cp = SFMCSdk.instance;
                    if (access$getInstance$cp != null) {
                        if (access$getInstance$cp.identity == null) {
                            access$getInstance$cp.setIdentity(Identity.Companion.getInstance());
                        }
                    }
                    if (config instanceof PushModuleConfig) {
                        companion.getPushModule$sfmcsdk_release().initModule(context, config, sFMCSdkComponents, new C11739c(countDownLatch, config));
                    } else if (config instanceof CdpModuleConfig) {
                        companion.getCdpModule$sfmcsdk_release().initModule(context, config, sFMCSdkComponents, new C11742d(countDownLatch, config));
                    }
                }
                SFMCSdkLogger.INSTANCE.mo31452d(SFMCSdk.TAG, new SFMCSdk$Companion$configure$1$3$3$1(countDownLatch.await(5, TimeUnit.SECONDS)));
                Companion companion2 = SFMCSdk.Companion;
                SFMCSdk.initializationState = InitializationState.READY;
                synchronized (SFMCSdk.UNIFIED_SDK_INSTANCE_REQUESTS) {
                    for (WhenReadyHandler whenReadyHandler : SFMCSdk.UNIFIED_SDK_INSTANCE_REQUESTS) {
                        try {
                            SFMCSdk access$getInstance$cp2 = SFMCSdk.instance;
                            if (access$getInstance$cp2 != null) {
                                whenReadyHandler.deliverSdk(access$getInstance$cp2);
                            }
                        } catch (Exception e) {
                            SFMCSdkLogger.INSTANCE.mo31453e(SFMCSdk.TAG, e, new SFMCSdk$Companion$configure$1$3$4$1$2(whenReadyHandler));
                        }
                    }
                    SFMCSdk.UNIFIED_SDK_INSTANCE_REQUESTS.clear();
                    SFMCSdk.Companion.notifyInitializationStatusListener(lVar, true);
                    C41238w wVar = C41238w.f97225a;
                }
                Thread.currentThread().setName(name);
                SFMCSdkLogger.INSTANCE.mo31452d(SFMCSdk.TAG, SFMCSdk$Companion$configure$1$3$6.INSTANCE);
            } catch (Exception e2) {
                try {
                    Companion companion3 = SFMCSdk.Companion;
                    companion3.staticTearDown();
                    SFMCSdk.UNIFIED_SDK_INSTANCE_REQUESTS.clear();
                    companion3.notifyInitializationStatusListener(lVar, false);
                    SFMCSdkLogger sFMCSdkLogger = SFMCSdkLogger.INSTANCE;
                    sFMCSdkLogger.mo31453e(SFMCSdk.TAG, e2, SFMCSdk$Companion$configure$1$3$5.INSTANCE);
                    Thread.currentThread().setName(name);
                    sFMCSdkLogger.mo31452d(SFMCSdk.TAG, SFMCSdk$Companion$configure$1$3$6.INSTANCE);
                } catch (Throwable th) {
                    Thread.currentThread().setName(name);
                    SFMCSdkLogger.INSTANCE.mo31452d(SFMCSdk.TAG, SFMCSdk$Companion$configure$1$3$6.INSTANCE);
                    throw th;
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: configure$lambda-14$lambda-13$lambda-8$lambda-5  reason: not valid java name */
        public static final void m125020configure$lambda14$lambda13$lambda8$lambda5(CountDownLatch countDownLatch, Config config, ModuleInterface moduleInterface) {
            C41536l.m120489i(countDownLatch, "$moduleInitLatch");
            C41536l.m120489i(config, "$config");
            C41536l.m120489i(moduleInterface, "module");
            countDownLatch.countDown();
            C41238w wVar = C41238w.f97225a;
            Identity.Companion.getInstance().setModuleIdentity$sfmcsdk_release(moduleInterface.getModuleIdentity());
            SFMCSdkLogger.INSTANCE.mo31452d(SFMCSdk.TAG, new SFMCSdk$Companion$configure$1$3$2$3$1$1(config));
        }

        /* access modifiers changed from: private */
        /* renamed from: configure$lambda-14$lambda-13$lambda-8$lambda-7  reason: not valid java name */
        public static final void m125021configure$lambda14$lambda13$lambda8$lambda7(CountDownLatch countDownLatch, Config config, ModuleInterface moduleInterface) {
            C41536l.m120489i(countDownLatch, "$moduleInitLatch");
            C41536l.m120489i(config, "$config");
            C41536l.m120489i(moduleInterface, "module");
            countDownLatch.countDown();
            C41238w wVar = C41238w.f97225a;
            Identity.Companion.getInstance().setModuleIdentity$sfmcsdk_release(moduleInterface.getModuleIdentity());
            SFMCSdkLogger.INSTANCE.mo31452d(SFMCSdk.TAG, new SFMCSdk$Companion$configure$1$3$2$4$1$1(config));
        }

        private final void notifyInitializationStatusListener(C43075l lVar, boolean z) {
            if (lVar != null) {
                try {
                    lVar.invoke(new SFMCSdkInitializationStatus(z));
                } catch (Exception e) {
                    SFMCSdkLogger.INSTANCE.mo31453e(SFMCSdk.TAG, e, new SFMCSdk$Companion$notifyInitializationStatusListener$1(lVar));
                }
            }
        }

        private final void staticTearDown() {
            SFMCSdk access$getInstance$cp = SFMCSdk.instance;
            if (access$getInstance$cp != null) {
                for (Module tearDown : access$getInstance$cp.modules) {
                    tearDown.tearDown();
                }
            }
            EventManager.Companion.staticTearDown$sfmcsdk_release();
            SFMCSdk.UNIFIED_SDK_INSTANCE_REQUESTS.clear();
            SFMCSdk.instance = null;
            SFMCSdk.initializationState = InitializationState.NONE;
        }

        /* access modifiers changed from: private */
        /* renamed from: track$lambda-20  reason: not valid java name */
        public static final void m125022track$lambda20(Event[] eventArr, SFMCSdk sFMCSdk) {
            C41536l.m120489i(eventArr, "$events");
            C41536l.m120489i(sFMCSdk, "sdk");
            sFMCSdk.internalTrack((Event[]) Arrays.copyOf(eventArr, eventArr.length));
        }

        public final void configure(Context context, SFMCSdkModuleConfig sFMCSdkModuleConfig) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(sFMCSdkModuleConfig, "config");
            configure$default(this, context, sFMCSdkModuleConfig, (C43075l) null, 4, (Object) null);
        }

        public final BehaviorManagerImpl getBehaviorManager$sfmcsdk_release() {
            return SFMCSdk.behaviorManager;
        }

        public final CdpModule getCdpModule$sfmcsdk_release() {
            return SFMCSdk.cdpModule;
        }

        public final PushModule getPushModule$sfmcsdk_release() {
            return SFMCSdk.pushModule;
        }

        public final void requestSdk(SFMCSdkReadyListener sFMCSdkReadyListener) {
            C41536l.m120489i(sFMCSdkReadyListener, "listener");
            WhenReadyHandler whenReadyHandler = new WhenReadyHandler(sFMCSdkReadyListener);
            synchronized (SFMCSdk.UNIFIED_SDK_INSTANCE_REQUESTS) {
                if (WhenMappings.$EnumSwitchMapping$0[SFMCSdk.initializationState.ordinal()] == 1) {
                    try {
                        SFMCSdk access$getInstance$cp = SFMCSdk.instance;
                        if (access$getInstance$cp != null) {
                            whenReadyHandler.deliverSdk(access$getInstance$cp);
                            C41238w wVar = C41238w.f97225a;
                        }
                    } catch (Exception e) {
                        SFMCSdkLogger.INSTANCE.mo31453e(SFMCSdk.TAG, e, new SFMCSdk$Companion$requestSdk$1$2(whenReadyHandler));
                        C41238w wVar2 = C41238w.f97225a;
                    }
                } else {
                    SFMCSdk.UNIFIED_SDK_INSTANCE_REQUESTS.add(whenReadyHandler);
                }
            }
        }

        public final void setCdpModule$sfmcsdk_release(CdpModule cdpModule) {
            C41536l.m120489i(cdpModule, "<set-?>");
            SFMCSdk.cdpModule = cdpModule;
        }

        public final void setLogging(LogLevel logLevel, LogListener logListener) {
            C41536l.m120489i(logLevel, "level");
            SFMCSdkLogger sFMCSdkLogger = SFMCSdkLogger.INSTANCE;
            sFMCSdkLogger.setLogLevel(logLevel);
            sFMCSdkLogger.setListener(logListener);
        }

        public final void setPushModule$sfmcsdk_release(PushModule pushModule) {
            C41536l.m120489i(pushModule, "<set-?>");
            SFMCSdk.pushModule = pushModule;
        }

        public final void track(Event... eventArr) {
            C41536l.m120489i(eventArr, "events");
            requestSdk(new C11738b(eventArr));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void configure(android.content.Context r6, com.salesforce.marketingcloud.sfmcsdk.SFMCSdkModuleConfig r7, ue1.C43075l r8) {
            /*
                r5 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.C41536l.m120489i(r6, r0)
                java.lang.String r0 = "config"
                kotlin.jvm.internal.C41536l.m120489i(r7, r0)
                java.lang.Object r0 = com.salesforce.marketingcloud.sfmcsdk.SFMCSdk.SDK_LOCK
                monitor-enter(r0)
                com.salesforce.marketingcloud.sfmcsdk.SFMCSdk r1 = com.salesforce.marketingcloud.sfmcsdk.SFMCSdk.instance     // Catch:{ all -> 0x0076 }
                if (r1 != 0) goto L_0x0016
                goto L_0x0050
            L_0x0016:
                com.salesforce.marketingcloud.sfmcsdk.InitializationState r2 = com.salesforce.marketingcloud.sfmcsdk.SFMCSdk.initializationState     // Catch:{ all -> 0x0076 }
                com.salesforce.marketingcloud.sfmcsdk.InitializationState r3 = com.salesforce.marketingcloud.sfmcsdk.InitializationState.READY     // Catch:{ all -> 0x0076 }
                if (r2 == r3) goto L_0x0026
                com.salesforce.marketingcloud.sfmcsdk.InitializationState r2 = com.salesforce.marketingcloud.sfmcsdk.SFMCSdk.initializationState     // Catch:{ all -> 0x0076 }
                com.salesforce.marketingcloud.sfmcsdk.InitializationState r4 = com.salesforce.marketingcloud.sfmcsdk.InitializationState.INITIALIZING     // Catch:{ all -> 0x0076 }
                if (r2 != r4) goto L_0x0050
            L_0x0026:
                com.salesforce.marketingcloud.sfmcsdk.SFMCSdkModuleConfig r1 = r1.getConfig()     // Catch:{ all -> 0x0076 }
                boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r7, r1)     // Catch:{ all -> 0x0076 }
                if (r1 == 0) goto L_0x0050
                com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger r6 = com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger.INSTANCE     // Catch:{ all -> 0x0076 }
                java.lang.String r1 = "~$SFMCSdk"
                com.salesforce.marketingcloud.sfmcsdk.SFMCSdk$Companion$configure$1$1$1 r2 = new com.salesforce.marketingcloud.sfmcsdk.SFMCSdk$Companion$configure$1$1$1     // Catch:{ all -> 0x0076 }
                r2.<init>(r7)     // Catch:{ all -> 0x0076 }
                r6.mo31452d(r1, r2)     // Catch:{ all -> 0x0076 }
                com.salesforce.marketingcloud.sfmcsdk.InitializationState r6 = com.salesforce.marketingcloud.sfmcsdk.SFMCSdk.initializationState     // Catch:{ all -> 0x0076 }
                if (r6 != r3) goto L_0x004e
                if (r8 != 0) goto L_0x0045
                goto L_0x004e
            L_0x0045:
                com.salesforce.marketingcloud.sfmcsdk.SFMCSdkInitializationStatus r6 = new com.salesforce.marketingcloud.sfmcsdk.SFMCSdkInitializationStatus     // Catch:{ all -> 0x0076 }
                r7 = 1
                r6.<init>(r7)     // Catch:{ all -> 0x0076 }
                r8.invoke(r6)     // Catch:{ all -> 0x0076 }
            L_0x004e:
                monitor-exit(r0)
                return
            L_0x0050:
                com.salesforce.marketingcloud.sfmcsdk.InitializationState r1 = com.salesforce.marketingcloud.sfmcsdk.InitializationState.INITIALIZING     // Catch:{ all -> 0x0076 }
                com.salesforce.marketingcloud.sfmcsdk.SFMCSdk.initializationState = r1     // Catch:{ all -> 0x0076 }
                com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger r1 = com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger.INSTANCE     // Catch:{ all -> 0x0076 }
                java.lang.String r2 = "~$SFMCSdk"
                com.salesforce.marketingcloud.sfmcsdk.SFMCSdk$Companion$configure$1$2 r3 = com.salesforce.marketingcloud.sfmcsdk.SFMCSdk$Companion$configure$1$2.INSTANCE     // Catch:{ all -> 0x0076 }
                r1.mo31452d(r2, r3)     // Catch:{ all -> 0x0076 }
                java.lang.Thread r1 = new java.lang.Thread     // Catch:{ all -> 0x0076 }
                com.salesforce.marketingcloud.sfmcsdk.a r2 = new com.salesforce.marketingcloud.sfmcsdk.a     // Catch:{ all -> 0x0076 }
                r2.<init>(r7, r8, r6)     // Catch:{ all -> 0x0076 }
                r1.<init>(r2)     // Catch:{ all -> 0x0076 }
                r1.start()     // Catch:{ all -> 0x0076 }
                java.lang.Object r6 = com.salesforce.marketingcloud.sfmcsdk.SFMCSdk.SDK_LOCK     // Catch:{ all -> 0x0076 }
                r6.notifyAll()     // Catch:{ all -> 0x0076 }
                he1.w r6 = he1.C41238w.f97225a     // Catch:{ all -> 0x0076 }
                monitor-exit(r0)
                return
            L_0x0076:
                r6 = move-exception
                monitor-exit(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.sfmcsdk.SFMCSdk.Companion.configure(android.content.Context, com.salesforce.marketingcloud.sfmcsdk.SFMCSdkModuleConfig, ue1.l):void");
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ModuleIdentifier.values().length];
            iArr[ModuleIdentifier.PUSH.ordinal()] = 1;
            iArr[ModuleIdentifier.CDP.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C41536l.m120488h(newSingleThreadExecutor, "newSingleThreadExecutor()");
        behaviorManager = new BehaviorManagerImpl(newSingleThreadExecutor);
    }

    public /* synthetic */ SFMCSdk(SFMCSdkModuleConfig sFMCSdkModuleConfig, DefaultConstructorMarker defaultConstructorMarker) {
        this(sFMCSdkModuleConfig);
    }

    public static final void configure(Context context, SFMCSdkModuleConfig sFMCSdkModuleConfig) {
        Companion.configure(context, sFMCSdkModuleConfig);
    }

    /* access modifiers changed from: private */
    public final void internalTrack(Event... eventArr) {
        if (eventArr != null) {
            try {
                SFMCSdkLogger.INSTANCE.mo31452d(TAG, new SFMCSdk$internalTrack$1$1(eventArr));
            } catch (Exception unused) {
            }
            EventManager.Companion.publish$sfmcsdk_release(this.executors, (Event[]) Arrays.copyOf(eventArr, eventArr.length));
        }
    }

    public static final void requestSdk(SFMCSdkReadyListener sFMCSdkReadyListener) {
        Companion.requestSdk(sFMCSdkReadyListener);
    }

    public static final void track(Event... eventArr) {
        Companion.track(eventArr);
    }

    public final void cdp(CdpModuleReadyListener cdpModuleReadyListener) {
        C41536l.m120489i(cdpModuleReadyListener, "listener");
        cdpModule.requestModule(cdpModuleReadyListener);
    }

    public final SFMCSdkModuleConfig getConfig() {
        return this.config;
    }

    public final Identity getIdentity() {
        Identity identity2 = this.identity;
        if (identity2 != null) {
            return identity2;
        }
        C41536l.m120506z("identity");
        return null;
    }

    public final JSONObject getSdkState() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sfmcSDKVersion", "1.0.2");
        for (Module module : this.modules) {
            jSONObject.put(module.getName(), module.getState());
        }
        return jSONObject;
    }

    /* renamed from: mp */
    public final void mo31149mp(PushModuleReadyListener pushModuleReadyListener) {
        C41536l.m120489i(pushModuleReadyListener, "listener");
        pushModule.requestModule(pushModuleReadyListener);
    }

    public final void setIdentity(Identity identity2) {
        C41536l.m120489i(identity2, "<set-?>");
        this.identity = identity2;
    }

    private SFMCSdk(SFMCSdkModuleConfig sFMCSdkModuleConfig) {
        this.config = sFMCSdkModuleConfig;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        C41536l.m120488h(newCachedThreadPool, "newCachedThreadPool()");
        this.executors = new SdkExecutors(newCachedThreadPool, (ExecutorService) null, 2, (DefaultConstructorMarker) null);
        this.modules = new ArrayList();
        for (Config moduleIdentifier : sFMCSdkModuleConfig.getConfigs$sfmcsdk_release()) {
            int i = WhenMappings.$EnumSwitchMapping$0[moduleIdentifier.getModuleIdentifier().ordinal()];
            if (i != 1) {
                if (i == 2 && getConfig().getCdpModuleConfig() != null) {
                    this.modules.add(cdpModule);
                }
            } else if (getConfig().getPushModuleConfig() != null) {
                this.modules.add(pushModule);
            }
        }
    }

    public static final void configure(Context context, SFMCSdkModuleConfig sFMCSdkModuleConfig, C43075l lVar) {
        Companion.configure(context, sFMCSdkModuleConfig, lVar);
    }
}

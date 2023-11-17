package com.salesforce.marketingcloud.sfmcsdk.components.events;

import com.salesforce.marketingcloud.sfmcsdk.SFMCSdk;
import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import com.salesforce.marketingcloud.sfmcsdk.components.identity.Identity;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleIdentifier;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class EventManager {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "~$EventManager";
    /* access modifiers changed from: private */
    public static final List<EventSubscriber> subscribers = new ArrayList();
    private final String moduleName;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Event customEvent$default(Companion companion, String str, Map map, Event.Producer producer, Event.Category category, int i, Object obj) {
            if ((i & 2) != 0) {
                map = C41344r0.m119928j();
            }
            if ((i & 4) != 0) {
                producer = Event.Producer.SFMC_SDK;
            }
            if ((i & 8) != 0) {
                category = Event.Category.ENGAGEMENT;
            }
            return companion.customEvent(str, map, producer, category);
        }

        private final String getValidatedAttributeKey(String str, String str2) {
            if (!C40440x.m117139M(str, ".", false, 2, (Object) null)) {
                return getValidatedName(str, str2);
            }
            SFMCSdkLogger.INSTANCE.mo31463w(EventManager.TAG, new EventManager$Companion$getValidatedAttributeKey$1(str2, str));
            return null;
        }

        static /* synthetic */ String getValidatedAttributeKey$default(Companion companion, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = "Attribute Key";
            }
            return companion.getValidatedAttributeKey(str, str2);
        }

        private final String getValidatedName(String str, String str2) {
            if (str != null) {
                String obj = C40440x.m117146P0(str).toString();
                if (!C40439w.m117118v(obj) && !C40439w.m117109H(obj, "$", false, 2, (Object) null) && !C40440x.m117139M(obj, "\n", false, 2, (Object) null) && !C40440x.m117139M(obj, "\r", false, 2, (Object) null)) {
                    return obj;
                }
                SFMCSdkLogger.INSTANCE.mo31463w(EventManager.TAG, new EventManager$Companion$getValidatedName$1$1(str2, str));
                return null;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        }

        static /* synthetic */ String getValidatedName$default(Companion companion, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = "Event Name";
            }
            return companion.getValidatedName(str, str2);
        }

        public final Event customEvent(String str) {
            C41536l.m120489i(str, "name");
            return customEvent$default(this, str, (Map) null, (Event.Producer) null, (Event.Category) null, 14, (Object) null);
        }

        public final Event identityEvent$sfmcsdk_release() {
            return customEvent$default(this, "IdentityUpdate", Identity.Companion.toEvent$sfmcsdk_release(), (Event.Producer) null, Event.Category.IDENTITY, 4, (Object) null);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(10:9|10|11|12|13|14|15|25|22|7) */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0022, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x003a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0054 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void publish$sfmcsdk_release(com.salesforce.marketingcloud.sfmcsdk.components.utils.SdkExecutors r7, com.salesforce.marketingcloud.sfmcsdk.components.events.Event... r8) {
            /*
                r6 = this;
                java.lang.String r0 = "executors"
                kotlin.jvm.internal.C41536l.m120489i(r7, r0)
                java.lang.String r0 = "events"
                kotlin.jvm.internal.C41536l.m120489i(r8, r0)
                java.util.List r0 = ie1.C41333m.m119795t(r8)
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0015
                return
            L_0x0015:
                java.util.List r0 = com.salesforce.marketingcloud.sfmcsdk.components.events.EventManager.subscribers
                monitor-enter(r0)
                java.util.List r1 = com.salesforce.marketingcloud.sfmcsdk.components.events.EventManager.subscribers     // Catch:{ all -> 0x0065 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0065 }
            L_0x0022:
                boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0065 }
                if (r2 == 0) goto L_0x0061
                java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0065 }
                com.salesforce.marketingcloud.sfmcsdk.components.events.EventSubscriber r2 = (com.salesforce.marketingcloud.sfmcsdk.components.events.EventSubscriber) r2     // Catch:{ all -> 0x0065 }
                com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger r3 = com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger.INSTANCE     // Catch:{ Exception -> 0x003a }
                java.lang.String r4 = "~$EventManager"
                com.salesforce.marketingcloud.sfmcsdk.components.events.EventManager$Companion$publish$1$1$1 r5 = new com.salesforce.marketingcloud.sfmcsdk.components.events.EventManager$Companion$publish$1$1$1     // Catch:{ Exception -> 0x003a }
                r5.<init>(r8, r2)     // Catch:{ Exception -> 0x003a }
                r3.mo31452d(r4, r5)     // Catch:{ Exception -> 0x003a }
            L_0x003a:
                java.util.concurrent.ExecutorService r3 = r7.getDiskIO()     // Catch:{ Exception -> 0x0054 }
                java.lang.Class r4 = r2.getClass()     // Catch:{ Exception -> 0x0054 }
                java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x0054 }
                java.lang.String r5 = "subscriber::class.java.name"
                kotlin.jvm.internal.C41536l.m120488h(r4, r5)     // Catch:{ Exception -> 0x0054 }
                com.salesforce.marketingcloud.sfmcsdk.components.events.EventManager$Companion$publish$1$1$2 r5 = new com.salesforce.marketingcloud.sfmcsdk.components.events.EventManager$Companion$publish$1$1$2     // Catch:{ Exception -> 0x0054 }
                r5.<init>(r2, r8)     // Catch:{ Exception -> 0x0054 }
                com.salesforce.marketingcloud.sfmcsdk.components.utils.SdkExecutorsKt.namedRunnable(r3, r4, r5)     // Catch:{ Exception -> 0x0054 }
                goto L_0x0022
            L_0x0054:
                com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger r3 = com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger.INSTANCE     // Catch:{ all -> 0x0065 }
                java.lang.String r4 = "~$EventManager"
                com.salesforce.marketingcloud.sfmcsdk.components.events.EventManager$Companion$publish$1$1$3 r5 = new com.salesforce.marketingcloud.sfmcsdk.components.events.EventManager$Companion$publish$1$1$3     // Catch:{ all -> 0x0065 }
                r5.<init>(r8, r2)     // Catch:{ all -> 0x0065 }
                r3.mo31454e(r4, r5)     // Catch:{ all -> 0x0065 }
                goto L_0x0022
            L_0x0061:
                he1.w r7 = he1.C41238w.f97225a     // Catch:{ all -> 0x0065 }
                monitor-exit(r0)
                return
            L_0x0065:
                r7 = move-exception
                monitor-exit(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.sfmcsdk.components.events.EventManager.Companion.publish$sfmcsdk_release(com.salesforce.marketingcloud.sfmcsdk.components.utils.SdkExecutors, com.salesforce.marketingcloud.sfmcsdk.components.events.Event[]):void");
        }

        public final void staticTearDown$sfmcsdk_release() {
            synchronized (EventManager.subscribers) {
                EventManager.subscribers.clear();
                C41238w wVar = C41238w.f97225a;
            }
        }

        public final Event customEvent(String str, Map<String, ? extends Object> map) {
            C41536l.m120489i(str, "name");
            C41536l.m120489i(map, C11772k.C11773a.f34176h);
            return customEvent$default(this, str, map, (Event.Producer) null, (Event.Category) null, 12, (Object) null);
        }

        public final Event customEvent(String str, Map<String, ? extends Object> map, Event.Producer producer) {
            C41536l.m120489i(str, "name");
            C41536l.m120489i(map, C11772k.C11773a.f34176h);
            C41536l.m120489i(producer, "producer");
            return customEvent$default(this, str, map, producer, (Event.Category) null, 8, (Object) null);
        }

        public final Event customEvent(String str, Map<String, ? extends Object> map, Event.Producer producer, Event.Category category) {
            C41536l.m120489i(str, "name");
            C41536l.m120489i(map, C11772k.C11773a.f34176h);
            C41536l.m120489i(producer, "producer");
            C41536l.m120489i(category, "category");
            String validatedName$default = getValidatedName$default(this, str, (String) null, 2, (Object) null);
            if (validatedName$default == null) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : map.entrySet()) {
                String validatedAttributeKey$default = getValidatedAttributeKey$default(EventManager.Companion, (String) next.getKey(), (String) null, 2, (Object) null);
                if (validatedAttributeKey$default != null) {
                    linkedHashMap.put(validatedAttributeKey$default, next.getValue());
                }
            }
            return new CustomEvent(validatedName$default, linkedHashMap, producer, category);
        }
    }

    public EventManager(String str) {
        C41536l.m120489i(str, "moduleName");
        this.moduleName = str;
    }

    public static final Event customEvent(String str) {
        return Companion.customEvent(str);
    }

    public final void subscribe(EventSubscriber eventSubscriber) {
        C41536l.m120489i(eventSubscriber, "subscriber");
        List<EventSubscriber> list = subscribers;
        synchronized (list) {
            list.add(eventSubscriber);
        }
    }

    public final void track(Event... eventArr) {
        Event.Producer producer;
        C41536l.m120489i(eventArr, "events");
        String str = this.moduleName;
        if (C41536l.m120484d(str, ModuleIdentifier.PUSH.name())) {
            producer = Event.Producer.PUSH;
        } else if (C41536l.m120484d(str, ModuleIdentifier.CDP.name())) {
            producer = Event.Producer.CDP;
        } else {
            producer = Event.Producer.SFMC_SDK;
        }
        ArrayList arrayList = new ArrayList();
        for (Event event : eventArr) {
            Event customEvent$default = Companion.customEvent$default(Companion, event.name(), event.attributes(), producer, (Event.Category) null, 8, (Object) null);
            if (customEvent$default != null) {
                arrayList.add(customEvent$default);
            }
        }
        SFMCSdk.Companion companion = SFMCSdk.Companion;
        Object[] array = arrayList.toArray(new Event[0]);
        if (array != null) {
            Event[] eventArr2 = (Event[]) array;
            companion.track((Event[]) Arrays.copyOf(eventArr2, eventArr2.length));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final void unsubscribe(EventSubscriber eventSubscriber) {
        C41536l.m120489i(eventSubscriber, "subscriber");
        List<EventSubscriber> list = subscribers;
        synchronized (list) {
            list.remove(eventSubscriber);
        }
    }

    public static final Event customEvent(String str, Map<String, ? extends Object> map) {
        return Companion.customEvent(str, map);
    }

    public static final Event customEvent(String str, Map<String, ? extends Object> map, Event.Producer producer) {
        return Companion.customEvent(str, map, producer);
    }

    public static final Event customEvent(String str, Map<String, ? extends Object> map, Event.Producer producer, Event.Category category) {
        return Companion.customEvent(str, map, producer, category);
    }
}

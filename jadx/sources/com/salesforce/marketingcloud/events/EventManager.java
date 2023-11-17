package com.salesforce.marketingcloud.events;

import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43064a;

@MCKeep
public abstract class EventManager {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String TAG = C11461g.m41875a("EventManager");

    @MCKeep
    public enum AuthEventType {
        LOGIN
    }

    public static final class Companion {

        /* renamed from: com.salesforce.marketingcloud.events.EventManager$Companion$a */
        static final class C11420a extends C41537m implements C43064a {

            /* renamed from: a */
            final /* synthetic */ String f33219a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C11420a(String str) {
                super(0);
                this.f33219a = str;
            }

            /* renamed from: a */
            public final String invoke() {
                return C41536l.m120497q(this.f33219a, " contains a \".\" and will be dropped.");
            }
        }

        /* renamed from: com.salesforce.marketingcloud.events.EventManager$Companion$b */
        static final class C11421b extends C41537m implements C43064a {

            /* renamed from: a */
            final /* synthetic */ String f33220a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C11421b(String str) {
                super(0);
                this.f33220a = str;
            }

            /* renamed from: a */
            public final String invoke() {
                return C41536l.m120497q(this.f33220a, " is null, blank, starts with a \"$\", or contains a line break and will be dropped.");
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ Event m41757a(Companion companion, String str, Map map, Event.Producer producer, int i, Object obj) {
            if ((i & 2) != 0) {
                map = C41344r0.m119928j();
            }
            if ((i & 4) != 0) {
                producer = Event.Producer.PUSH;
            }
            return companion.customEvent(str, map, producer);
        }

        /* renamed from: b */
        public final String mo29882b(String str) {
            C41536l.m120489i(str, "input");
            String obj = C40440x.m117146P0(str).toString();
            if (!C40439w.m117118v(obj) && !C40439w.m117109H(obj, "$", false, 2, (Object) null) && !C40440x.m117139M(obj, "\n", false, 2, (Object) null) && !C40440x.m117139M(obj, "\r", false, 2, (Object) null)) {
                return obj;
            }
            C11461g.m41893e(C11461g.f33306a, EventManager.TAG, (Throwable) null, new C11421b(str), 2, (Object) null);
            return null;
        }

        @MCKeep
        public final Event customEvent(String str) {
            C41536l.m120489i(str, "name");
            return customEvent(str, C41344r0.m119928j(), Event.Producer.PUSH);
        }

        /* renamed from: a */
        public final String mo29881a(String str) {
            C41536l.m120489i(str, "input");
            if (!C40440x.m117139M(str, ".", false, 2, (Object) null)) {
                return mo29882b(str);
            }
            C11461g.m41893e(C11461g.f33306a, EventManager.TAG, (Throwable) null, new C11420a(str), 2, (Object) null);
            return null;
        }

        @MCKeep
        public final Event customEvent(String str, Map<String, ? extends Object> map) {
            C41536l.m120489i(str, "name");
            C41536l.m120489i(map, C11772k.C11773a.f34176h);
            return customEvent(str, map, Event.Producer.PUSH);
        }

        @MCKeep
        public final Event customEvent(String str, Map<String, ? extends Object> map, Event.Producer producer) {
            C41536l.m120489i(str, "name");
            C41536l.m120489i(map, C11772k.C11773a.f34176h);
            C41536l.m120489i(producer, "producer");
            String b = mo29882b(str);
            if (b == null) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : map.entrySet()) {
                String a = EventManager.Companion.mo29881a((String) next.getKey());
                if (a != null) {
                    linkedHashMap.put(a, next.getValue());
                }
            }
            return new C11423b(b, linkedHashMap, producer);
        }
    }

    @MCKeep
    public static final Event customEvent(String str) {
        return Companion.customEvent(str);
    }

    public abstract void track(Event... eventArr);

    @MCKeep
    public static final Event customEvent(String str, Map<String, ? extends Object> map) {
        return Companion.customEvent(str, map);
    }

    @MCKeep
    public static final Event customEvent(String str, Map<String, ? extends Object> map, Event.Producer producer) {
        return Companion.customEvent(str, map, producer);
    }
}

package com.salesforce.marketingcloud.events;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.salesforce.marketingcloud.C11398b;
import com.salesforce.marketingcloud.C11419e;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.C11530k;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.analytics.C11360h;
import com.salesforce.marketingcloud.analytics.C11366l;
import com.salesforce.marketingcloud.analytics.C11368m;
import com.salesforce.marketingcloud.analytics.C11369n;
import com.salesforce.marketingcloud.behaviors.C11402a;
import com.salesforce.marketingcloud.behaviors.C11403b;
import com.salesforce.marketingcloud.behaviors.C11404c;
import com.salesforce.marketingcloud.events.predicates.C11443a;
import com.salesforce.marketingcloud.events.predicates.C11444b;
import com.salesforce.marketingcloud.events.predicates.C11446c;
import com.salesforce.marketingcloud.events.predicates.C11448d;
import com.salesforce.marketingcloud.events.predicates.C11450e;
import com.salesforce.marketingcloud.events.predicates.C11451f;
import com.salesforce.marketingcloud.events.predicates.C11454g;
import com.salesforce.marketingcloud.internal.C11505g;
import com.salesforce.marketingcloud.internal.C11513l;
import com.salesforce.marketingcloud.registration.C11730f;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents;
import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import com.salesforce.marketingcloud.sfmcsdk.components.events.EventSubscriber;
import com.salesforce.marketingcloud.storage.C11800j;
import com.salesforce.marketingcloud.storage.C11804n;
import com.salesforce.marketingcloud.storage.p385db.C11775m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.events.c */
public class C11424c extends EventManager implements C11419e, C11530k.C11535e, C11403b, EventSubscriber {

    /* renamed from: A */
    static final String f33224A = C11461g.m41875a("EventManager");

    /* renamed from: B */
    private static final int f33225B = 1;

    /* renamed from: C */
    static final EnumSet<C11530k.C11534d> f33226C = EnumSet.of(C11530k.C11534d.triggers, C11530k.C11534d.appConfig);

    /* renamed from: q */
    private static final String f33227q = "$opencount";

    /* renamed from: r */
    private static final String f33228r = "gateEventProcessingMs";

    /* renamed from: s */
    private static final String f33229s = "maxDisplay";

    /* renamed from: t */
    private static final String f33230t = "timeBetweenDisplaySec";

    /* renamed from: u */
    private static final String f33231u = "invalidConfigurationKey";

    /* renamed from: v */
    private static final String f33232v = "invalidConfigurationValue";

    /* renamed from: w */
    public static final String f33233w = "event_gate_time_mills";

    /* renamed from: x */
    public static final String f33234x = "event_max_display_in_session";

    /* renamed from: y */
    public static final String f33235y = "event_min_time_sec_in_session";

    /* renamed from: z */
    public static final int f33236z = 0;

    /* renamed from: d */
    final SFMCSdkComponents f33237d;

    /* renamed from: e */
    final C11800j f33238e;

    /* renamed from: f */
    private final C11530k f33239f;

    /* renamed from: g */
    private final C11404c f33240g;

    /* renamed from: h */
    private final C11436f f33241h;

    /* renamed from: i */
    private final C11366l f33242i;

    /* renamed from: j */
    protected final C11368m f33243j;

    /* renamed from: k */
    private final C11369n f33244k;

    /* renamed from: l */
    private final C11513l f33245l;

    /* renamed from: m */
    private final AtomicBoolean f33246m = new AtomicBoolean(false);

    /* renamed from: n */
    protected CountDownLatch f33247n = new CountDownLatch(1);

    /* renamed from: o */
    private final Context f33248o;

    /* renamed from: p */
    private C11730f f33249p;

    /* renamed from: com.salesforce.marketingcloud.events.c$a */
    class C11425a extends C11505g {

        /* renamed from: b */
        final /* synthetic */ Event[] f33250b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11425a(String str, Object[] objArr, Event... eventArr) {
            super(str, objArr);
            this.f33250b = eventArr;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            int i = C11424c.this.f33238e.mo31608f().getInt(C11424c.f33233w, 0);
            if (i > 0) {
                try {
                    if (!C11424c.this.f33247n.await((long) i, TimeUnit.MILLISECONDS)) {
                        C11461g.m41894e(C11424c.f33224A, "Track await time of %s milliseconds exceeded!", Integer.valueOf(i));
                        C11424c.this.f33247n.countDown();
                        C11424c.this.f33243j.mo29803a(new JSONObject().put(C11424c.f33228r, i));
                    }
                } catch (InterruptedException e) {
                    C11461g.m41885b(C11424c.f33224A, e, "Encountered exception while awaiting at track.", new Object[0]);
                } catch (JSONException e2) {
                    C11461g.m41885b(C11424c.f33224A, e2, "Failed to log analytics for onSyncGateTimedOut", new Object[0]);
                }
            }
            Event[] eventArr = this.f33250b;
            ArrayList arrayList = null;
            if (eventArr != null && eventArr.length > 0) {
                for (Event event : eventArr) {
                    if (event != null) {
                        C11461g.m41880a(C11424c.f33224A, "(%s) event logged with attributes %s", event.name(), event.attributes());
                        C11424c cVar = C11424c.this;
                        List<C11435e> a = cVar.mo29890a(event, cVar.mo29889a(event));
                        if (a != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.addAll(a);
                        }
                    }
                }
            }
            if (arrayList != null) {
                C11424c.this.mo29891a((List<C11435e>) arrayList);
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.events.c$b */
    class C11426b extends C11505g {

        /* renamed from: b */
        final /* synthetic */ Event[] f33252b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11426b(String str, Object[] objArr, Event... eventArr) {
            super(str, objArr);
            this.f33252b = eventArr;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            Event[] eventArr = this.f33252b;
            if (eventArr != null && eventArr.length > 0) {
                C11424c cVar = C11424c.this;
                SFMCSdkComponents sFMCSdkComponents = cVar.f33237d;
                if (sFMCSdkComponents != null) {
                    sFMCSdkComponents.getEventManager().track(C11430d.m41793b(this.f33252b, EnumSet.of(Event.Producer.PUSH)));
                } else {
                    cVar.mo29893a(eventArr);
                }
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.events.c$c */
    class C11427c extends ArrayList<Object> {

        /* renamed from: a */
        final /* synthetic */ C11440h f33254a;

        C11427c(C11440h hVar) {
            this.f33254a = hVar;
            add(Integer.valueOf(C11424c.this.f33238e.mo31625v().mo31593b(hVar)));
        }
    }

    /* renamed from: com.salesforce.marketingcloud.events.c$d */
    class C11428d extends C11505g {
        C11428d(String str, Object... objArr) {
            super(str, objArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            C11424c.this.f33238e.mo31625v().mo31597k();
            C11424c.this.mo29893a(new C11422a());
        }
    }

    /* renamed from: com.salesforce.marketingcloud.events.c$e */
    static /* synthetic */ class C11429e {

        /* renamed from: a */
        static final /* synthetic */ int[] f33257a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.salesforce.marketingcloud.events.g$b[] r0 = com.salesforce.marketingcloud.events.C11437g.C11439b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33257a = r0
                com.salesforce.marketingcloud.events.g$b r1 = com.salesforce.marketingcloud.events.C11437g.C11439b.INT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33257a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.salesforce.marketingcloud.events.g$b r1 = com.salesforce.marketingcloud.events.C11437g.C11439b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33257a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.salesforce.marketingcloud.events.g$b r1 = com.salesforce.marketingcloud.events.C11437g.C11439b.BOOL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f33257a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.salesforce.marketingcloud.events.g$b r1 = com.salesforce.marketingcloud.events.C11437g.C11439b.STRING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.events.C11424c.C11429e.<clinit>():void");
        }
    }

    public C11424c(Context context, C11730f fVar, C11800j jVar, C11530k kVar, C11404c cVar, C11360h hVar, C11513l lVar, SFMCSdkComponents sFMCSdkComponents, C11436f fVar2) {
        this.f33248o = context;
        this.f33249p = fVar;
        this.f33238e = jVar;
        this.f33239f = kVar;
        this.f33240g = cVar;
        this.f33243j = hVar;
        this.f33244k = hVar;
        this.f33241h = fVar2;
        this.f33245l = lVar;
        this.f33237d = sFMCSdkComponents;
        this.f33242i = hVar;
    }

    /* renamed from: a */
    private C11451f m41763a(C11440h hVar, Event event, List<C11437g> list) {
        ArrayList arrayList;
        if (list == null || list.size() == 0) {
            return C11451f.f33296b;
        }
        Map<String, List<Object>> a = C11430d.m41780a(event);
        Map<String, List<Object>> a2 = m41766a(hVar);
        a2.putAll(a);
        String g = hVar.mo29935g();
        if (g != null) {
            HashMap hashMap = new HashMap(list.size());
            for (C11437g next : list) {
                hashMap.put(Integer.valueOf(next.mo29918f()), next);
            }
            arrayList = new ArrayList(hashMap.size());
            for (String parseInt : g.split(g.contains("||") ? "\\|\\|" : "&&")) {
                arrayList.add(m41765a(a2, (C11437g) hashMap.get(Integer.valueOf(Integer.parseInt(parseInt)))));
            }
        } else {
            ArrayList arrayList2 = new ArrayList(list.size());
            for (C11437g a3 : list) {
                arrayList2.add(m41765a(a2, a3));
            }
            arrayList = arrayList2;
        }
        return (g == null || !g.contains("||")) ? new C11443a((C11451f[]) arrayList.toArray(new C11451f[0])) : new C11450e((C11451f[]) arrayList.toArray(new C11451f[0]));
    }

    /* renamed from: b */
    private void m41769b() {
        SFMCSdkComponents sFMCSdkComponents = this.f33237d;
        if (sFMCSdkComponents != null) {
            sFMCSdkComponents.getEventManager().unsubscribe(this);
        }
    }

    public String componentName() {
        return "Event";
    }

    public JSONObject componentState() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C11775m.f34194g, this.f33238e.mo31625v().mo31598m());
        } catch (Exception e) {
            C11461g.m41885b(f33224A, e, "Unable to compile componentState for EventComponent", new Object[0]);
        }
        return jSONObject;
    }

    public void controlChannelInit(int i) {
        if (C11398b.m41709a(i, C11398b.f33143v)) {
            this.f33246m.set(true);
            this.f33239f.mo30105a(f33226C, (C11530k.C11535e) null);
            this.f33240g.mo29850a((C11403b) this);
            if (C11398b.m41711c(i, C11398b.f33143v)) {
                this.f33238e.mo31625v().mo31594b((Collection<String>) Collections.emptyList());
            }
            m41769b();
            return;
        }
        this.f33239f.mo30105a(f33226C, (C11530k.C11535e) this);
        this.f33240g.mo29851a(this, EnumSet.of(C11402a.BEHAVIOR_APP_FOREGROUNDED));
        m41767a();
        this.f33246m.set(false);
    }

    public void init(InitializationStatus.C11293a aVar, int i) {
        if (C11398b.m41710b(i, C11398b.f33143v)) {
            this.f33239f.mo30105a(f33226C, (C11530k.C11535e) this);
            this.f33240g.mo29851a(this, EnumSet.of(C11402a.BEHAVIOR_APP_FOREGROUNDED));
            m41767a();
            return;
        }
        m41769b();
        this.f33246m.set(true);
    }

    public void onBehavior(C11402a aVar, Bundle bundle) {
        if (!this.f33246m.get() && aVar == C11402a.BEHAVIOR_APP_FOREGROUNDED) {
            if (this.f33247n.getCount() <= 0) {
                this.f33247n = new CountDownLatch(1);
            }
            try {
                this.f33245l.mo30089b().execute(new C11428d("app_foreground_trigger", new Object[0]));
            } catch (Exception e) {
                C11461g.m41895e(f33224A, e, "An error occurred while triggering app foreground", new Object[0]);
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0015 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onEventPublished(com.salesforce.marketingcloud.sfmcsdk.components.events.Event... r7) {
        /*
            r6 = this;
            com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents r0 = r6.f33237d     // Catch:{ Exception -> 0x002f }
            r1 = 0
            if (r0 == 0) goto L_0x000a
            com.salesforce.marketingcloud.sfmcsdk.components.identity.Identity r0 = r0.getIdentity()     // Catch:{ Exception -> 0x002f }
            goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            com.salesforce.marketingcloud.MarketingCloudSdk r2 = com.salesforce.marketingcloud.MarketingCloudSdk.getInstance()     // Catch:{ Exception -> 0x0015 }
            if (r2 == 0) goto L_0x0015
            com.salesforce.marketingcloud.messages.push.PushMessageManager r1 = r2.getPushMessageManager()     // Catch:{ Exception -> 0x0015 }
        L_0x0015:
            com.salesforce.marketingcloud.analytics.n r2 = r6.f33244k     // Catch:{ Exception -> 0x002f }
            com.salesforce.marketingcloud.analytics.e r3 = new com.salesforce.marketingcloud.analytics.e     // Catch:{ Exception -> 0x002f }
            com.salesforce.marketingcloud.registration.f r4 = r6.f33249p     // Catch:{ Exception -> 0x002f }
            android.content.Context r5 = r6.f33248o     // Catch:{ Exception -> 0x002f }
            boolean r5 = com.salesforce.marketingcloud.util.C11819h.m43268b(r5)     // Catch:{ Exception -> 0x002f }
            r3.<init>(r4, r1, r5, r0)     // Catch:{ Exception -> 0x002f }
            r2.mo29800a(r3, r7)     // Catch:{ Exception -> 0x002f }
            com.salesforce.marketingcloud.events.Event[] r7 = com.salesforce.marketingcloud.events.C11430d.m41786a((java.lang.Object[]) r7)     // Catch:{ Exception -> 0x002f }
            r6.mo29893a((com.salesforce.marketingcloud.events.Event[]) r7)     // Catch:{ Exception -> 0x002f }
            goto L_0x003a
        L_0x002f:
            r7 = move-exception
            java.lang.String r0 = f33224A
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Could not process events from onEventPublished()"
            com.salesforce.marketingcloud.C11461g.m41885b(r0, r7, r2, r1)
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.events.C11424c.onEventPublished(com.salesforce.marketingcloud.sfmcsdk.components.events.Event[]):void");
    }

    public void onSyncReceived(C11530k.C11534d dVar, JSONObject jSONObject) {
        if (!this.f33246m.get() && f33226C.contains(dVar)) {
            if (jSONObject.optInt("version") != 1) {
                C11461g.m41884b(f33224A, "Unable to handle sync payload due to version mismatch", new Object[0]);
            } else if (dVar == C11530k.C11534d.triggers) {
                m41770b(jSONObject);
            } else if (dVar == C11530k.C11534d.appConfig) {
                mo29892a(jSONObject);
            }
        }
    }

    public void tearDown(boolean z) {
        this.f33239f.mo30105a(f33226C, (C11530k.C11535e) null);
        this.f33240g.mo29850a((C11403b) this);
        m41769b();
    }

    public void track(Event... eventArr) {
        if (!this.f33246m.get()) {
            try {
                this.f33245l.mo30089b().execute(new C11426b("trigger_event", new Object[0], eventArr));
            } catch (Exception e) {
                C11461g.m41895e(f33224A, e, "An error occurred while triggering track event", new Object[0]);
            }
        }
    }

    protected C11424c(Context context, C11730f fVar, C11800j jVar, C11530k kVar, C11404c cVar, C11368m mVar, C11369n nVar, C11513l lVar, SFMCSdkComponents sFMCSdkComponents, C11436f fVar2, C11366l lVar2) {
        this.f33248o = context;
        this.f33249p = fVar;
        this.f33238e = jVar;
        this.f33239f = kVar;
        this.f33240g = cVar;
        this.f33243j = mVar;
        this.f33244k = nVar;
        this.f33241h = fVar2;
        this.f33245l = lVar;
        this.f33237d = sFMCSdkComponents;
        this.f33242i = lVar2;
    }

    /* renamed from: a */
    private C11451f m41764a(Object obj, C11437g gVar) {
        int i = C11429e.f33257a[gVar.mo29923j().ordinal()];
        if (i == 1) {
            return new C11448d(obj, gVar.mo29920h(), gVar.mo29922i());
        }
        if (i == 2) {
            return new C11446c(obj, gVar.mo29920h(), gVar.mo29922i());
        }
        if (i != 3) {
            return i != 4 ? C11451f.f33297c : new C11454g(obj, gVar.mo29920h(), gVar.mo29922i());
        }
        return new C11444b(obj, gVar.mo29920h(), gVar.mo29922i());
    }

    /* renamed from: b */
    private void m41770b(JSONObject jSONObject) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("items");
            int length = jSONArray.length();
            C11461g.m41880a(f33224A, "%d triggers received from sync.", Integer.valueOf(length));
            TreeSet treeSet = new TreeSet();
            C11804n v = this.f33238e.mo31625v();
            for (int i = 0; i < length; i++) {
                try {
                    C11440h hVar = new C11440h(jSONArray.getJSONObject(i));
                    v.mo31592a(hVar);
                    treeSet.add(hVar.mo29936h());
                } catch (Exception e) {
                    C11461g.m41885b(f33224A, e, "Unable to parse trigger from payload", new Object[0]);
                }
            }
            v.mo31594b((Collection<String>) treeSet);
            JSONObject jSONObject2 = new JSONObject();
            C11366l.C11367a aVar = C11366l.C11367a.TRIGGER_PROCESS;
            jSONObject2.put(aVar.mo29808a(), System.currentTimeMillis() - currentTimeMillis);
            this.f33242i.mo29801a(aVar, jSONObject2);
        } catch (JSONException e2) {
            C11461g.m41885b(f33224A, e2, "Unable to parse trigger sync payload", new Object[0]);
        }
        this.f33247n.countDown();
    }

    /* renamed from: a */
    private C11451f m41765a(Map<String, List<Object>> map, C11437g gVar) {
        int i;
        if (gVar == null) {
            return C11451f.f33297c;
        }
        ArrayList arrayList = new ArrayList();
        List list = map.get(gVar.mo29919g().toLowerCase(Locale.getDefault()));
        if (list != null) {
            i = 0;
            for (Object next : list) {
                if (next instanceof List) {
                    try {
                        for (Object a : (List) next) {
                            arrayList.add(m41764a(a, gVar));
                            i++;
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    arrayList.add(m41764a(next, gVar));
                    i++;
                }
            }
        } else {
            i = 0;
        }
        if (i > 1) {
            return new C11450e((C11451f[]) arrayList.toArray(new C11451f[0]));
        }
        return i == 1 ? new C11443a((C11451f[]) arrayList.toArray(new C11451f[0])) : C11451f.f33297c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C11440h> mo29889a(Event event) {
        return this.f33238e.mo31625v().mo31596g(event.name());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C11435e> mo29890a(Event event, List<C11440h> list) {
        ArrayList arrayList = null;
        if (!(list == null || list.size() == 0)) {
            try {
                for (C11440h next : list) {
                    if (m41763a(next, event, next.mo29940k()).mo29954b()) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        for (C11435e next2 : next.mo29939j()) {
                            arrayList.add(next2);
                            try {
                                this.f33243j.mo29802a(next.mo29936h(), next2.mo29904e(), next2.mo29906f(), next2.mo29903d());
                            } catch (Exception e) {
                                C11461g.m41885b(f33224A, e, "Failed to log analytics for trigger [%s]", next.mo29936h());
                            }
                        }
                    }
                }
            } catch (IllegalArgumentException e2) {
                C11461g.m41885b(f33224A, e2, "An outcome could not be reached with the given trigger(s) for the event.", new Object[0]);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private Map<String, List<Object>> m41766a(C11440h hVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(f33227q, new C11427c(hVar));
        return hashMap;
    }

    /* renamed from: a */
    private void m41767a() {
        SFMCSdkComponents sFMCSdkComponents = this.f33237d;
        if (sFMCSdkComponents != null) {
            sFMCSdkComponents.getEventManager().subscribe(this);
        }
    }

    /* renamed from: a */
    private void m41768a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f33231u, str);
            jSONObject.put(f33232v, str2);
            this.f33243j.mo29804b(jSONObject);
        } catch (JSONException e) {
            C11461g.m41885b(f33224A, e, "Failed to log analytics for InvalidConfig [%s]", str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29891a(List<C11435e> list) {
        C11436f fVar;
        TreeSet treeSet = null;
        for (C11435e next : list) {
            if ("iam".equals(next.mo29906f())) {
                if (treeSet == null) {
                    treeSet = new TreeSet();
                }
                treeSet.add(next.mo29904e());
            }
        }
        if (treeSet != null && (fVar = this.f33241h) != null) {
            fVar.handleOutcomes(treeSet);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29892a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("items").getJSONObject("inApp");
            int optInt = jSONObject2.optInt(f33228r, 0);
            int optInt2 = jSONObject2.optInt(f33229s, Integer.MAX_VALUE);
            int optInt3 = jSONObject2.optInt(f33230t, 0);
            SharedPreferences.Editor edit = this.f33238e.mo31608f().edit();
            if (optInt >= 0) {
                edit.putInt(f33233w, optInt);
            }
            if (optInt2 >= 0) {
                edit.putInt(f33234x, optInt2);
            }
            if (optInt3 >= 0) {
                edit.putInt(f33235y, optInt3);
            }
            edit.apply();
            if (optInt < 0) {
                m41768a(f33228r, String.valueOf(optInt));
            }
            if (optInt2 < 0) {
                m41768a(f33229s, String.valueOf(optInt2));
            }
            if (optInt3 < 0) {
                m41768a(f33230t, String.valueOf(optInt3));
            }
        } catch (JSONException e) {
            C11461g.m41885b(f33224A, e, "Failed to parse [InApp Config] sync data", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29893a(Event... eventArr) {
        if (!this.f33246m.get()) {
            try {
                this.f33245l.mo30089b().execute(new C11425a("trigger_event", new Object[0], eventArr));
            } catch (Exception e) {
                C11461g.m41895e(f33224A, e, "An error occurred while processing the event", new Object[0]);
            }
        }
    }
}

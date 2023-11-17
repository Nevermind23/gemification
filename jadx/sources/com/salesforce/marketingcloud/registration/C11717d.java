package com.salesforce.marketingcloud.registration;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.salesforce.marketingcloud.C11398b;
import com.salesforce.marketingcloud.C11419e;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.alarms.C11307a;
import com.salesforce.marketingcloud.alarms.C11327b;
import com.salesforce.marketingcloud.behaviors.C11402a;
import com.salesforce.marketingcloud.behaviors.C11403b;
import com.salesforce.marketingcloud.behaviors.C11404c;
import com.salesforce.marketingcloud.events.C11430d;
import com.salesforce.marketingcloud.http.C11474a;
import com.salesforce.marketingcloud.http.C11476b;
import com.salesforce.marketingcloud.http.C11481c;
import com.salesforce.marketingcloud.http.C11486d;
import com.salesforce.marketingcloud.internal.C11511k;
import com.salesforce.marketingcloud.internal.C11513l;
import com.salesforce.marketingcloud.messages.push.PushMessageManager;
import com.salesforce.marketingcloud.registration.C11721e;
import com.salesforce.marketingcloud.registration.RegistrationManager;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents;
import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import com.salesforce.marketingcloud.sfmcsdk.components.events.EventSubscriber;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleIdentifier;
import com.salesforce.marketingcloud.storage.C11751c;
import com.salesforce.marketingcloud.storage.C11800j;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import com.salesforce.marketingcloud.util.C11819h;
import com.salesforce.marketingcloud.util.C11824l;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import org.json.JSONObject;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.registration.d */
public class C11717d implements C11419e, RegistrationManager, C11403b, C11327b.C11329b, C11481c.C11484c, C11721e.C11729f, EventSubscriber {

    /* renamed from: o */
    private static final EnumSet<C11402a> f33971o;

    /* renamed from: d */
    private final Context f33972d;

    /* renamed from: e */
    private final MarketingCloudConfig f33973e;

    /* renamed from: f */
    private final C11800j f33974f;

    /* renamed from: g */
    private final C11404c f33975g;

    /* renamed from: h */
    private final C11327b f33976h;

    /* renamed from: i */
    private final C11481c f33977i;

    /* renamed from: j */
    private final PushMessageManager f33978j;

    /* renamed from: k */
    private final C11513l f33979k;

    /* renamed from: l */
    private final SFMCSdkComponents f33980l;

    /* renamed from: m */
    private final C11730f f33981m;

    /* renamed from: n */
    private C11721e f33982n;

    /* renamed from: com.salesforce.marketingcloud.registration.d$a */
    class C11718a implements C11751c {
        C11718a() {
        }

        /* renamed from: a */
        public void mo31109a() {
        }

        /* renamed from: b */
        public String mo31112b(String str, String str2) {
            return str2;
        }

        /* renamed from: a */
        public void mo31110a(String str) {
        }

        /* renamed from: a */
        public void mo31111a(String str, String str2) {
        }
    }

    /* renamed from: com.salesforce.marketingcloud.registration.d$b */
    static /* synthetic */ class C11719b {

        /* renamed from: a */
        static final /* synthetic */ int[] f33983a;

        /* renamed from: b */
        static final /* synthetic */ int[] f33984b;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002e */
        static {
            /*
                com.salesforce.marketingcloud.alarms.a$b[] r0 = com.salesforce.marketingcloud.alarms.C11307a.C11309b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33984b = r0
                r1 = 1
                com.salesforce.marketingcloud.alarms.a$b r2 = com.salesforce.marketingcloud.alarms.C11307a.C11309b.REGISTRATION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                com.salesforce.marketingcloud.behaviors.a[] r0 = com.salesforce.marketingcloud.behaviors.C11402a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33983a = r0
                com.salesforce.marketingcloud.behaviors.a r2 = com.salesforce.marketingcloud.behaviors.C11402a.BEHAVIOR_APP_PACKAGE_REPLACED     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r0 = f33983a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.salesforce.marketingcloud.behaviors.a r1 = com.salesforce.marketingcloud.behaviors.C11402a.BEHAVIOR_DEVICE_TIME_ZONE_CHANGED     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r0 = f33983a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.salesforce.marketingcloud.behaviors.a r1 = com.salesforce.marketingcloud.behaviors.C11402a.BEHAVIOR_CUSTOMER_PUSH_MESSAGING_TOGGLED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r0 = f33983a     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.salesforce.marketingcloud.behaviors.a r1 = com.salesforce.marketingcloud.behaviors.C11402a.BEHAVIOR_CUSTOMER_FENCE_MESSAGING_TOGGLED     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r0 = f33983a     // Catch:{ NoSuchFieldError -> 0x004f }
                com.salesforce.marketingcloud.behaviors.a r1 = com.salesforce.marketingcloud.behaviors.C11402a.BEHAVIOR_CUSTOMER_PROXIMITY_MESSAGING_TOGGLED     // Catch:{ NoSuchFieldError -> 0x004f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r0 = f33983a     // Catch:{ NoSuchFieldError -> 0x005a }
                com.salesforce.marketingcloud.behaviors.a r1 = com.salesforce.marketingcloud.behaviors.C11402a.BEHAVIOR_APP_FOREGROUNDED     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r0 = f33983a     // Catch:{ NoSuchFieldError -> 0x0065 }
                com.salesforce.marketingcloud.behaviors.a r1 = com.salesforce.marketingcloud.behaviors.C11402a.BEHAVIOR_SDK_TOKEN_REFRESHED     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.registration.C11717d.C11719b.<clinit>():void");
        }
    }

    /* renamed from: com.salesforce.marketingcloud.registration.d$c */
    static class C11720c implements RegistrationManager.Editor {
        C11720c() {
        }

        public RegistrationManager.Editor addTag(String str) {
            return this;
        }

        public RegistrationManager.Editor addTags(Iterable<String> iterable) {
            return this;
        }

        public RegistrationManager.Editor clearAttribute(String str) {
            return this;
        }

        public RegistrationManager.Editor clearAttributes(Iterable<String> iterable) {
            return this;
        }

        public RegistrationManager.Editor clearTags() {
            return this;
        }

        public boolean commit() {
            return false;
        }

        public RegistrationManager.Editor removeTag(String str) {
            return this;
        }

        public RegistrationManager.Editor removeTags(Iterable<String> iterable) {
            return this;
        }

        public RegistrationManager.Editor setAttribute(String str, String str2) {
            return this;
        }

        public RegistrationManager.Editor setContactKey(String str) {
            return this;
        }

        public RegistrationManager.Editor setSignedString(String str) {
            return this;
        }

        public RegistrationManager.Editor addTags(String... strArr) {
            return this;
        }

        public RegistrationManager.Editor clearAttributes(String... strArr) {
            return this;
        }

        public RegistrationManager.Editor removeTags(String... strArr) {
            return this;
        }
    }

    static {
        C11402a aVar = C11402a.BEHAVIOR_APP_PACKAGE_REPLACED;
        C11402a aVar2 = C11402a.BEHAVIOR_APP_FOREGROUNDED;
        f33971o = EnumSet.of(aVar, new C11402a[]{C11402a.BEHAVIOR_DEVICE_TIME_ZONE_CHANGED, aVar2, C11402a.BEHAVIOR_CUSTOMER_FENCE_MESSAGING_TOGGLED, C11402a.BEHAVIOR_CUSTOMER_PROXIMITY_MESSAGING_TOGGLED, C11402a.BEHAVIOR_CUSTOMER_PUSH_MESSAGING_TOGGLED, C11402a.BEHAVIOR_SDK_TOKEN_REFRESHED, aVar2});
    }

    public C11717d(Context context, MarketingCloudConfig marketingCloudConfig, C11800j jVar, C11730f fVar, C11404c cVar, C11327b bVar, C11481c cVar2, PushMessageManager pushMessageManager, C11513l lVar) {
        this(context, marketingCloudConfig, jVar, fVar, cVar, bVar, cVar2, pushMessageManager, lVar, (SFMCSdkComponents) null);
    }

    /* renamed from: a */
    public static C11486d m42746a(MarketingCloudConfig marketingCloudConfig, Context context, String str, String str2) {
        Registration registration = r0;
        String str3 = "Android";
        Registration registration2 = new Registration(0, (String) null, str, (String) null, MarketingCloudSdk.getSdkVersionName(), C11819h.m43265a(context), TimeZone.getDefault().inDaylightTime(new Date()), false, false, Build.VERSION.RELEASE, false, C11824l.m43290b(), (String) null, str3, String.format(Locale.ENGLISH, "%s %s", new Object[]{Build.MANUFACTURER, Build.MODEL}), marketingCloudConfig.applicationId(), Locale.getDefault().toString(), Collections.emptySet(), Collections.emptyMap());
        return C11474a.REGISTRATION.mo29978a(marketingCloudConfig, (C11751c) new C11718a(), m42747a(registration, str2)).mo29996j();
    }

    public final String componentName() {
        return "RegistrationManager";
    }

    public final JSONObject componentState() {
        C11721e eVar = this.f33982n;
        return eVar != null ? eVar.mo31124c() : new JSONObject();
    }

    public void controlChannelInit(int i) {
        if (C11398b.m41709a(i, 2)) {
            this.f33982n = null;
            C11721e.m42761a(this.f33974f, this.f33976h, C11398b.m41711c(i, 2));
            this.f33975g.mo29850a((C11403b) this);
            m42749a();
            this.f33976h.mo29681e(C11307a.C11309b.REGISTRATION);
            this.f33977i.mo30020a(C11474a.REGISTRATION);
        } else if (this.f33982n == null) {
            m42750a((InitializationStatus.C11293a) null);
            this.f33982n.mo31126e();
        }
    }

    public RegistrationManager.Editor edit() {
        C11721e eVar = this.f33982n;
        return eVar != null ? eVar.mo31113a((C11721e.C11729f) this) : new C11720c();
    }

    public Map<String, String> getAttributes() {
        C11721e eVar = this.f33982n;
        return eVar != null ? eVar.getAttributes() : Collections.emptyMap();
    }

    public String getContactKey() {
        C11721e eVar = this.f33982n;
        if (eVar != null) {
            return eVar.getContactKey();
        }
        return null;
    }

    public String getDeviceId() {
        C11721e eVar = this.f33982n;
        return eVar != null ? eVar.getDeviceId() : "";
    }

    public String getSignedString() {
        C11721e eVar = this.f33982n;
        if (eVar != null) {
            return eVar.getSignedString();
        }
        return null;
    }

    public String getSystemToken() {
        C11721e eVar = this.f33982n;
        if (eVar != null) {
            return eVar.getSystemToken();
        }
        return null;
    }

    public Set<String> getTags() {
        C11721e eVar = this.f33982n;
        return eVar != null ? eVar.getTags() : Collections.emptySet();
    }

    public void init(InitializationStatus.C11293a aVar, int i) {
        if (C11398b.m41710b(i, 2)) {
            m42750a(aVar);
        }
    }

    public final void onBehavior(C11402a aVar, Bundle bundle) {
        if (this.f33982n != null) {
            switch (C11719b.f33983a[aVar.ordinal()]) {
                case 1:
                    this.f33982n.mo31122b();
                    return;
                case 2:
                    this.f33982n.mo31127f();
                    return;
                case 3:
                    this.f33982n.mo31120a(bundle.getBoolean(PushMessageManager.f33880h));
                    return;
                case 4:
                case 5:
                case 6:
                    this.f33982n.mo31114a();
                    return;
                case 7:
                    this.f33982n.mo31117a(bundle.getString(PushMessageManager.f33881i, ""));
                    return;
                default:
                    C11461g.m41880a(RegistrationManager.f33962a, "Unhandled behavior: %s", aVar);
                    return;
            }
        }
    }

    public void onEventPublished(Event... eventArr) {
        for (com.salesforce.marketingcloud.events.Event attributes : C11430d.m41788a((Object[]) eventArr, (EnumSet<Event.Producer>) EnumSet.of(Event.Producer.SFMC_SDK), (EnumSet<Event.Category>) EnumSet.of(Event.Category.IDENTITY))) {
            try {
                Object obj = attributes.attributes().get("moduleIdentities");
                Objects.requireNonNull(obj);
                JSONObject jSONObject = (JSONObject) ((JSONObject) obj).get(ModuleIdentifier.PUSH.name().toLowerCase());
                JSONObject jSONObject2 = jSONObject.getJSONObject("customProperties").getJSONObject(C11772k.C11773a.f34176h);
                Iterator<String> keys = jSONObject2.keys();
                HashMap hashMap = new HashMap();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, (String) jSONObject2.get(next));
                }
                String optString = jSONObject.optString("profileId", (String) null);
                (optString != null ? this.f33982n.mo31121b((C11721e.C11729f) this).mo31104a(optString, (Map<String, String>) hashMap, false) : this.f33982n.mo31121b((C11721e.C11729f) this).mo31106a((Map<String, String>) hashMap, false)).commit();
            } catch (Exception e) {
                C11461g.m41895e(RegistrationManager.f33962a, e, "Failed to parse event for identity update.", new Object[0]);
            }
        }
    }

    public void registerForRegistrationEvents(RegistrationManager.RegistrationEventListener registrationEventListener) {
        C11721e eVar = this.f33982n;
        if (eVar != null) {
            eVar.registerForRegistrationEvents(registrationEventListener);
        }
    }

    public void tearDown(boolean z) {
        C11327b bVar = this.f33976h;
        C11307a.C11309b bVar2 = C11307a.C11309b.REGISTRATION;
        bVar.mo29680d(bVar2);
        this.f33976h.mo29681e(bVar2);
        this.f33975g.mo29850a((C11403b) this);
        m42749a();
    }

    public void unregisterForRegistrationEvents(RegistrationManager.RegistrationEventListener registrationEventListener) {
        C11721e eVar = this.f33982n;
        if (eVar != null) {
            eVar.unregisterForRegistrationEvents(registrationEventListener);
        }
    }

    public C11717d(Context context, MarketingCloudConfig marketingCloudConfig, C11800j jVar, C11730f fVar, C11404c cVar, C11327b bVar, C11481c cVar2, PushMessageManager pushMessageManager, C11513l lVar, SFMCSdkComponents sFMCSdkComponents) {
        this.f33972d = context;
        this.f33973e = marketingCloudConfig;
        this.f33974f = jVar;
        this.f33981m = fVar;
        this.f33975g = cVar;
        this.f33976h = bVar;
        this.f33977i = cVar2;
        this.f33978j = pushMessageManager;
        this.f33979k = lVar;
        this.f33980l = sFMCSdkComponents;
    }

    /* renamed from: a */
    static String m42747a(Registration registration, String str) {
        try {
            return C11511k.m42072b(registration).put("registrationDateUtc", C11824l.m43282a(new Date())).put("quietPushEnabled", false).putOpt("registrationId", str).toString();
        } catch (Exception e) {
            C11461g.m41885b(RegistrationManager.f33962a, e, "Unable to create registration request payload", new Object[0]);
            return null;
        }
    }

    C11717d(C11721e eVar, Context context, MarketingCloudConfig marketingCloudConfig, C11800j jVar, C11730f fVar, C11404c cVar, C11327b bVar, C11481c cVar2, PushMessageManager pushMessageManager, C11513l lVar) {
        this.f33982n = eVar;
        this.f33972d = context;
        this.f33973e = marketingCloudConfig;
        this.f33974f = jVar;
        this.f33981m = fVar;
        this.f33975g = cVar;
        this.f33976h = bVar;
        this.f33977i = cVar2;
        this.f33978j = pushMessageManager;
        this.f33979k = lVar;
        this.f33980l = null;
    }

    /* renamed from: a */
    public static String m42748a(C11800j jVar) {
        return jVar.mo31606c().mo31112b(C11751c.f34084d, (String) null);
    }

    /* renamed from: a */
    private void m42749a() {
        SFMCSdkComponents sFMCSdkComponents = this.f33980l;
        if (sFMCSdkComponents != null) {
            sFMCSdkComponents.getEventManager().unsubscribe(this);
        }
    }

    /* renamed from: a */
    private void m42750a(InitializationStatus.C11293a aVar) {
        this.f33975g.mo29851a(this, f33971o);
        this.f33976h.mo29671a((C11327b.C11329b) this, C11307a.C11309b.REGISTRATION);
        this.f33977i.mo30021a(C11474a.REGISTRATION, (C11481c.C11484c) this);
        SFMCSdkComponents sFMCSdkComponents = this.f33980l;
        if (sFMCSdkComponents != null) {
            sFMCSdkComponents.getEventManager().subscribe(this);
        }
        try {
            this.f33982n = new C11721e(this.f33972d, this.f33973e, this.f33974f, this.f33981m, this.f33976h, this.f33977i, this.f33978j, this.f33979k, this.f33980l);
        } catch (Exception e) {
            if (aVar != null) {
                aVar.mo29531a((Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public final void mo29684a(C11307a.C11309b bVar) {
        C11721e eVar;
        if (C11719b.f33984b[bVar.ordinal()] == 1 && (eVar = this.f33982n) != null) {
            eVar.mo31125d();
        }
    }

    /* renamed from: a */
    public void mo29793a(C11476b bVar, C11486d dVar) {
        if (this.f33982n == null) {
            return;
        }
        if (dVar.mo30033g()) {
            try {
                this.f33982n.mo31116a(C11511k.m42070a(new JSONObject(bVar.mo30001o())), dVar.mo30029d());
            } catch (Exception unused) {
                this.f33982n.mo31115a(-1, "Failed to convert our Response Body into a Registration.");
            }
        } else {
            this.f33982n.mo31115a(dVar.mo30027b(), dVar.mo30031e());
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo31107a(String str, String str2, Map map, Collection collection) {
        C11731g.m42806a(this, str, str2, map, collection);
    }

    /* renamed from: a */
    public void mo31108a(String str, String str2, Map<String, String> map, Collection<String> collection, boolean z) {
        C11721e eVar = this.f33982n;
        if (eVar != null) {
            try {
                eVar.mo31119a(str, str2, map, collection, z);
            } catch (Exception e) {
                C11461g.m41885b(RegistrationManager.f33962a, e, "Error encountered while saving registration", new Object[0]);
            }
        }
    }
}

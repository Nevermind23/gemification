package com.salesforce.marketingcloud.registration;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import androidx.collection.ArraySet;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.alarms.C11307a;
import com.salesforce.marketingcloud.alarms.C11327b;
import com.salesforce.marketingcloud.http.C11474a;
import com.salesforce.marketingcloud.http.C11481c;
import com.salesforce.marketingcloud.internal.C11505g;
import com.salesforce.marketingcloud.internal.C11511k;
import com.salesforce.marketingcloud.internal.C11513l;
import com.salesforce.marketingcloud.messages.push.PushMessageManager;
import com.salesforce.marketingcloud.registration.RegistrationManager;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleIdentifier;
import com.salesforce.marketingcloud.storage.C11751c;
import com.salesforce.marketingcloud.storage.C11800j;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import com.salesforce.marketingcloud.util.C11819h;
import com.salesforce.marketingcloud.util.C11824l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import org.json.JSONException;
import org.json.JSONObject;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.salesforce.marketingcloud.registration.e */
class C11721e implements RegistrationManager {

    /* renamed from: u */
    public static final String f33985u = "Android";

    /* renamed from: v */
    static final String f33986v = "previousRegistrationHash";

    /* renamed from: w */
    static final String f33987w = "lastRegistrationSendTimestamp";

    /* renamed from: d */
    final Set<String> f33988d;

    /* renamed from: e */
    private final Context f33989e;

    /* renamed from: f */
    final MarketingCloudConfig f33990f;

    /* renamed from: g */
    final C11800j f33991g;

    /* renamed from: h */
    final C11327b f33992h;

    /* renamed from: i */
    final C11481c f33993i;

    /* renamed from: j */
    final C11513l f33994j;

    /* renamed from: k */
    final SFMCSdkComponents f33995k;

    /* renamed from: l */
    private final Set<RegistrationManager.RegistrationEventListener> f33996l;

    /* renamed from: m */
    private final C11730f f33997m;

    /* renamed from: n */
    private ConcurrentHashMap<String, String> f33998n;

    /* renamed from: o */
    private ConcurrentSkipListSet<String> f33999o;

    /* renamed from: p */
    private boolean f34000p;

    /* renamed from: q */
    private boolean f34001q;

    /* renamed from: r */
    private String f34002r;

    /* renamed from: s */
    private String f34003s;

    /* renamed from: t */
    private String f34004t;

    /* renamed from: com.salesforce.marketingcloud.registration.e$a */
    class C11722a implements MarketingCloudSdk.WhenReadyListener {

        /* renamed from: com.salesforce.marketingcloud.registration.e$a$a */
        class C11723a extends C11728e {

            /* renamed from: com.salesforce.marketingcloud.registration.e$a$a$a */
            class C11724a extends C11505g {
                C11724a(String str, Object... objArr) {
                    super(str, objArr);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo29760a() {
                    try {
                        SFMCSdkComponents sFMCSdkComponents = C11721e.this.f33995k;
                        String registrationId = sFMCSdkComponents != null ? sFMCSdkComponents.getRegistrationId() : null;
                        Registration g = C11721e.this.f33991g.mo31624u().mo31583g(C11721e.this.f33991g.mo31604b());
                        C11721e eVar = C11721e.this;
                        if (C11721e.m42763a(g, eVar.f33991g, eVar.f33990f.delayRegistrationUntilContactKeyIsSet())) {
                            C11721e eVar2 = C11721e.this;
                            eVar2.f33993i.mo30022a(C11474a.REGISTRATION.mo29978a(eVar2.f33990f, eVar2.f33991g.mo31606c(), C11717d.m42747a(g, registrationId)));
                        }
                    } catch (Exception e) {
                        C11461g.m41885b(RegistrationManager.f33962a, e, "Failed to get our Registration from local storage.", new Object[0]);
                    }
                }
            }

            C11723a() {
            }

            public void onFinish() {
                C11721e.this.f33994j.mo30089b().execute(new C11724a("registration_request", new Object[0]));
            }
        }

        C11722a() {
        }

        public void ready(MarketingCloudSdk marketingCloudSdk) {
            new C11723a().start();
        }
    }

    /* renamed from: com.salesforce.marketingcloud.registration.e$b */
    class C11725b extends C11505g {
        C11725b(String str, Object... objArr) {
            super(str, objArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            C11721e.this.f33991g.mo31624u().mo31582e();
        }
    }

    /* renamed from: com.salesforce.marketingcloud.registration.e$c */
    class C11726c extends C11505g {
        C11726c(String str, Object... objArr) {
            super(str, objArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            C11721e eVar = C11721e.this;
            if (C11721e.m42764a(eVar.f33991g, eVar.f33990f.delayRegistrationUntilContactKeyIsSet())) {
                C11721e.this.f33992h.mo29675b(C11307a.C11309b.REGISTRATION);
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.registration.e$d */
    static class C11727d implements RegistrationManager.Editor, C11716c {

        /* renamed from: j */
        private static final List<String> f34010j;

        /* renamed from: a */
        private final Object f34011a = new Object();

        /* renamed from: b */
        private final Map<String, String> f34012b;

        /* renamed from: c */
        private final Set<String> f34013c;

        /* renamed from: d */
        private String f34014d;

        /* renamed from: e */
        private C11729f f34015e;

        /* renamed from: f */
        private String f34016f;

        /* renamed from: g */
        private Map<String, String> f34017g;

        /* renamed from: h */
        private boolean f34018h;

        /* renamed from: i */
        private boolean f34019i;

        static {
            String[] strArr = {"addressId", "alias", "apId", "backgroundRefreshEnabled", "badge", "channel", "contactId", "contactKey", "createdBy", "createdDate", "customObjectKey", "device", "deviceId", "deviceType", "gcmSenderId", "hardwareId", "isHonorDst", "lastAppOpen", "lastMessageOpen", "lastSend", "locationEnabled", "messageOpenCount", "modifiedBy", "modifiedDate", "optInDate", "optInMethodId", "optInStatusId", "optOutDate", "optOutMethodId", "optOutStatusId", C11772k.C11773a.f34170b, "platformVersion", "providerToken", "proximityEnabled", "pushAddressExtensionId", "pushApplicationId", "sdkVersion", "sendCount", "source", "sourceObjectId", "status", "systemToken", C11772k.C11773a.f34173e, "utcOffset", "signedString", "quietPushEnabled"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 46; i++) {
                arrayList.add(strArr[i].toLowerCase(Locale.ENGLISH));
            }
            f34010j = Collections.unmodifiableList(arrayList);
        }

        C11727d(C11729f fVar, String str, String str2, ConcurrentHashMap<String, String> concurrentHashMap, ConcurrentSkipListSet<String> concurrentSkipListSet, Set<String> set) {
            Comparator comparator = String.CASE_INSENSITIVE_ORDER;
            this.f34012b = new TreeMap(comparator);
            this.f34013c = new TreeSet(comparator);
            this.f34015e = fVar;
            this.f34014d = str;
            this.f34016f = str2;
            this.f34017g = new C11715b(concurrentHashMap);
            Iterator<String> it = concurrentSkipListSet.iterator();
            while (it.hasNext()) {
                String next = it.next();
                this.f34012b.put(next, next);
            }
            this.f34013c.addAll(set);
        }

        /* renamed from: b */
        private boolean m42784b(String str) {
            if (str != null) {
                return true;
            }
            C11461g.m41884b(RegistrationManager.f33962a, "Attribute value was null and will not be saved.", new Object[0]);
            return false;
        }

        /* renamed from: c */
        private boolean m42785c(String str) {
            return str == null || TextUtils.getTrimmedLength(str) > 0;
        }

        /* renamed from: d */
        private String m42786d(String str) {
            if (!TextUtils.isEmpty(str) && TextUtils.getTrimmedLength(str) != 0) {
                return str.trim();
            }
            C11461g.m41894e(RegistrationManager.f33962a, "An empty or NULL ContactKey will not be transmitted to the Marketing Cloud and was NOT updated with the provided value.", new Object[0]);
            return null;
        }

        /* renamed from: e */
        private String m42787e(String str) {
            return str != null ? str.trim() : str;
        }

        /* renamed from: a */
        public RegistrationManager.Editor mo31103a(String str, String str2, boolean z) {
            synchronized (this.f34011a) {
                if (m42783a(str) && m42784b(str2)) {
                    this.f34017g.put(str, str2);
                    this.f34018h = true;
                    this.f34019i = z;
                }
            }
            return this;
        }

        public RegistrationManager.Editor addTag(String str) {
            String e = m42787e(str);
            synchronized (this.f34011a) {
                if (!TextUtils.isEmpty(e) && !e.equals(this.f34012b.put(e, e))) {
                    this.f34018h = true;
                }
            }
            return this;
        }

        public RegistrationManager.Editor addTags(Iterable<String> iterable) {
            if (iterable == null) {
                return this;
            }
            for (String addTag : iterable) {
                addTag(addTag);
            }
            return this;
        }

        public RegistrationManager.Editor clearAttribute(String str) {
            return !m42783a(str) ? this : setAttribute(str, "");
        }

        public RegistrationManager.Editor clearAttributes(Iterable<String> iterable) {
            for (String clearAttribute : iterable) {
                clearAttribute(clearAttribute);
            }
            return this;
        }

        public RegistrationManager.Editor clearTags() {
            synchronized (this.f34011a) {
                if (this.f34012b.keySet().retainAll(this.f34013c)) {
                    this.f34018h = true;
                }
            }
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
            return false;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean commit() {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f34011a
                monitor-enter(r0)
                boolean r1 = r8.f34018h     // Catch:{ all -> 0x0022 }
                if (r1 == 0) goto L_0x001f
                com.salesforce.marketingcloud.registration.e$f r2 = r8.f34015e     // Catch:{ all -> 0x0022 }
                if (r2 == 0) goto L_0x001f
                java.lang.String r3 = r8.f34014d     // Catch:{ all -> 0x0022 }
                java.lang.String r4 = r8.f34016f     // Catch:{ all -> 0x0022 }
                java.util.Map<java.lang.String, java.lang.String> r5 = r8.f34017g     // Catch:{ all -> 0x0022 }
                java.util.Map<java.lang.String, java.lang.String> r1 = r8.f34012b     // Catch:{ all -> 0x0022 }
                java.util.Collection r6 = r1.values()     // Catch:{ all -> 0x0022 }
                boolean r7 = r8.f34019i     // Catch:{ all -> 0x0022 }
                r2.mo31108a(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0022 }
                monitor-exit(r0)     // Catch:{ all -> 0x0022 }
                r0 = 1
                return r0
            L_0x001f:
                monitor-exit(r0)     // Catch:{ all -> 0x0022 }
                r0 = 0
                return r0
            L_0x0022:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0022 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.registration.C11721e.C11727d.commit():boolean");
        }

        public RegistrationManager.Editor removeTag(String str) {
            if (str == null) {
                return this;
            }
            synchronized (this.f34011a) {
                if (!this.f34013c.contains(str) && this.f34012b.remove(str) != null) {
                    this.f34018h = true;
                }
            }
            return this;
        }

        public RegistrationManager.Editor removeTags(Iterable<String> iterable) {
            if (iterable == null) {
                return this;
            }
            for (String removeTag : iterable) {
                removeTag(removeTag);
            }
            return this;
        }

        @Deprecated
        public RegistrationManager.Editor setAttribute(String str, String str2) {
            return mo31103a(str, str2, true);
        }

        @Deprecated
        public RegistrationManager.Editor setContactKey(String str) {
            return mo31105a(str, true);
        }

        public RegistrationManager.Editor setSignedString(String str) {
            synchronized (this.f34011a) {
                if (m42785c(str)) {
                    this.f34014d = str;
                    this.f34018h = true;
                }
            }
            return this;
        }

        /* renamed from: a */
        public RegistrationManager.Editor mo31104a(String str, Map<String, String> map, boolean z) {
            mo31105a(str, z);
            for (Map.Entry next : map.entrySet()) {
                mo31103a((String) next.getKey(), (String) next.getValue(), z);
            }
            return this;
        }

        public RegistrationManager.Editor addTags(String... strArr) {
            if (!(strArr == null || strArr.length == 0)) {
                for (String addTag : strArr) {
                    addTag(addTag);
                }
            }
            return this;
        }

        public RegistrationManager.Editor clearAttributes(String... strArr) {
            if (!(strArr == null || strArr.length == 0)) {
                for (String clearAttribute : strArr) {
                    clearAttribute(clearAttribute);
                }
            }
            return this;
        }

        public RegistrationManager.Editor removeTags(String... strArr) {
            if (!(strArr == null || strArr.length == 0)) {
                for (String removeTag : strArr) {
                    removeTag(removeTag);
                }
            }
            return this;
        }

        /* renamed from: a */
        public RegistrationManager.Editor mo31105a(String str, boolean z) {
            String d = m42786d(str);
            if (d != null) {
                synchronized (this.f34011a) {
                    this.f34018h = true;
                    this.f34019i = z;
                    this.f34016f = d;
                }
            }
            return this;
        }

        /* renamed from: a */
        public RegistrationManager.Editor mo31106a(Map<String, String> map, boolean z) {
            for (Map.Entry next : map.entrySet()) {
                mo31103a((String) next.getKey(), (String) next.getValue(), z);
            }
            return this;
        }

        /* renamed from: a */
        private boolean m42783a(String str) {
            if (TextUtils.isEmpty(str)) {
                C11461g.m41894e(RegistrationManager.f33962a, "The attribute you provided was null or empty.", new Object[0]);
                return false;
            }
            String trim = str.trim();
            if (TextUtils.isEmpty(trim)) {
                C11461g.m41894e(RegistrationManager.f33962a, "The attribute you provided was blank.", new Object[0]);
                return false;
            } else if (f34010j.contains(trim.toLowerCase(Locale.ENGLISH))) {
                C11461g.m41894e(RegistrationManager.f33962a, "Attribute key '%s' is invalid and can not be added.  Please see documentation regarding Attributes and Reserved Words.", trim);
                return false;
            } else if (trim.length() <= 128) {
                return true;
            } else {
                C11461g.m41894e(RegistrationManager.f33962a, "Your attribute key was %s characters long.  Attribute keys are restricted to %s characters.  Your attribute key will be truncated.", Integer.valueOf(trim.length()), 128);
                return false;
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.registration.e$e */
    static abstract class C11728e extends CountDownTimer {
        public C11728e() {
            this(1000, 1000);
        }

        public void onTick(long j) {
        }

        private C11728e(long j, long j2) {
            super(j, j2);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.registration.e$f */
    interface C11729f {
        /* renamed from: a */
        void mo31107a(String str, String str2, Map<String, String> map, Collection<String> collection);

        /* renamed from: a */
        void mo31108a(String str, String str2, Map<String, String> map, Collection<String> collection, boolean z);
    }

    C11721e(Context context, MarketingCloudConfig marketingCloudConfig, C11800j jVar, C11730f fVar, C11327b bVar, C11481c cVar, PushMessageManager pushMessageManager, C11513l lVar) {
        this(context, marketingCloudConfig, jVar, fVar, bVar, cVar, pushMessageManager, lVar, (SFMCSdkComponents) null);
    }

    /* renamed from: a */
    private Registration m42759a(int i) {
        String str = this.f34004t;
        String f = this.f33997m.mo31137f();
        String str2 = this.f34003s;
        String j = this.f33997m.mo31142j();
        String e = this.f33997m.mo31135e();
        boolean inDaylightTime = TimeZone.getDefault().inDaylightTime(new Date());
        boolean z = this.f34000p;
        return new Registration(i, str, f, str2, j, e, inDaylightTime, z, z, this.f33997m.mo31141i(), this.f34001q, C11824l.m43290b(), this.f34002r, this.f33997m.mo31139h(), this.f33997m.mo31138g(), this.f33990f.applicationId(), Locale.getDefault().toString(), this.f33999o, this.f33998n);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C11716c mo31121b(C11729f fVar) {
        return new C11727d(fVar, this.f34004t, this.f34002r, this.f33998n, this.f33999o, this.f33988d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public JSONObject mo31124c() {
        String b;
        Registration a = m42759a(0);
        if (a == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("current_registration", C11511k.m42072b(a));
            if (m42763a(a, this.f33991g, this.f33990f.delayRegistrationUntilContactKeyIsSet()) && (b = this.f33991g.mo31606c().mo31112b(C11751c.f34088h, (String) null)) != null) {
                jSONObject.put("last_registration_sent", new JSONObject(b));
            }
            long j = this.f33991g.mo31608f().getLong(f33987w, 0);
            if (j > 0) {
                jSONObject.put("last_sent_timestamp", C11824l.m43282a(new Date(j)));
            }
        } catch (JSONException e) {
            C11461g.m41885b(RegistrationManager.f33962a, e, "Failed to build our component state JSONObject.", new Object[0]);
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo31125d() {
        MarketingCloudSdk.requestSdk(new C11722a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo31126e() {
        mo31123b(false);
    }

    public RegistrationManager.Editor edit() {
        C11461g.m41880a(RegistrationManager.f33962a, "Changes with this editor will not be saved.", new Object[0]);
        return new C11727d((C11729f) null, this.f34004t, this.f34002r, this.f33998n, this.f33999o, this.f33988d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo31127f() {
        mo31126e();
    }

    public Map<String, String> getAttributes() {
        return new HashMap(this.f33998n);
    }

    public String getContactKey() {
        return this.f34002r;
    }

    public String getDeviceId() {
        return this.f33997m.mo31137f();
    }

    public String getSignedString() {
        return this.f34004t;
    }

    public String getSystemToken() {
        return this.f34003s;
    }

    public Set<String> getTags() {
        return new TreeSet(this.f33999o);
    }

    public void registerForRegistrationEvents(RegistrationManager.RegistrationEventListener registrationEventListener) {
        if (registrationEventListener != null) {
            synchronized (this.f33996l) {
                this.f33996l.add(registrationEventListener);
            }
        }
    }

    public void unregisterForRegistrationEvents(RegistrationManager.RegistrationEventListener registrationEventListener) {
        synchronized (this.f33996l) {
            this.f33996l.remove(registrationEventListener);
        }
    }

    C11721e(Context context, MarketingCloudConfig marketingCloudConfig, C11800j jVar, C11730f fVar, C11327b bVar, C11481c cVar, PushMessageManager pushMessageManager, C11513l lVar, SFMCSdkComponents sFMCSdkComponents) {
        Registration registration;
        boolean z;
        this.f33996l = new ArraySet();
        this.f33989e = context;
        this.f33990f = marketingCloudConfig;
        this.f33991g = jVar;
        this.f33997m = fVar;
        this.f33992h = bVar;
        this.f33993i = cVar;
        this.f33994j = lVar;
        this.f33995k = sFMCSdkComponents;
        TreeSet treeSet = new TreeSet();
        treeSet.add("ALL");
        treeSet.add("Android");
        if (C11824l.m43289a(context)) {
            treeSet.add("DEBUG");
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        this.f33988d = unmodifiableSet;
        this.f34001q = pushMessageManager.isPushEnabled();
        this.f34000p = C11819h.m43268b(context);
        this.f34003s = pushMessageManager.getPushToken();
        C11751c c = jVar.mo31606c();
        boolean z2 = false;
        try {
            Registration g = jVar.mo31624u().mo31583g(jVar.mo31604b());
            if (g == null) {
                this.f34004t = null;
                this.f34002r = c.mo31112b(C11751c.f34084d, (String) null);
                this.f33998n = new ConcurrentHashMap<>(C11824l.m43294c(c.mo31112b(C11751c.f34082b, "")));
                ConcurrentSkipListSet concurrentSkipListSet = new ConcurrentSkipListSet(C11824l.m43297d(c.mo31112b(C11751c.f34083c, "")));
                this.f33999o = concurrentSkipListSet.isEmpty() ? new ConcurrentSkipListSet<>(unmodifiableSet) : m42760a((ConcurrentSkipListSet<String>) concurrentSkipListSet, unmodifiableSet);
                registration = m42759a(0);
                z = false;
            } else {
                this.f34004t = g.signedString();
                this.f34002r = g.contactKey();
                this.f33998n = new ConcurrentHashMap<>(g.attributes());
                this.f33999o = m42760a((ConcurrentSkipListSet<String>) new ConcurrentSkipListSet(g.tags()), unmodifiableSet);
                registration = m42759a(C11511k.m42069a(g));
                z = true;
            }
            m42762a(jVar, this.f34002r);
            z2 = z;
        } catch (Exception e) {
            C11461g.m41885b(RegistrationManager.f33962a, e, "Error trying to get, update or add a registration to local storage.", new Object[0]);
            this.f33999o = new ConcurrentSkipListSet<>(this.f33988d);
            this.f33998n = new ConcurrentHashMap<>();
            this.f34002r = null;
            this.f34004t = null;
            registration = m42759a(0);
        }
        lVar.mo30089b().execute(new C11714a(jVar.mo31624u(), jVar.mo31604b(), registration, z2));
        if (m42763a(registration, jVar, marketingCloudConfig.delayRegistrationUntilContactKeyIsSet())) {
            mo31125d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public RegistrationManager.Editor mo31113a(C11729f fVar) {
        return new C11727d(fVar, this.f34004t, this.f34002r, this.f33998n, this.f33999o, this.f33988d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo31122b() {
        this.f33992h.mo29680d(C11307a.C11309b.REGISTRATION);
        mo31126e();
    }

    /* renamed from: a */
    private static ConcurrentSkipListSet<String> m42760a(ConcurrentSkipListSet<String> concurrentSkipListSet, Set<String> set) {
        if (!concurrentSkipListSet.containsAll(set)) {
            concurrentSkipListSet.addAll(set);
        }
        return concurrentSkipListSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo31123b(boolean z) {
        try {
            Registration a = m42759a(0);
            this.f33994j.mo30089b().execute(new C11714a(this.f33991g.mo31624u(), this.f33991g.mo31604b(), a, false));
            m42762a(this.f33991g, a.contactKey());
            if (m42763a(a, this.f33991g, this.f33990f.delayRegistrationUntilContactKeyIsSet())) {
                this.f33992h.mo29680d(C11307a.C11309b.REGISTRATION);
                SFMCSdkComponents sFMCSdkComponents = this.f33995k;
                if (sFMCSdkComponents != null && z) {
                    if (this.f34002r != null) {
                        sFMCSdkComponents.getIdentity().setProfile(this.f34002r, this.f33998n, ModuleIdentifier.PUSH, new ModuleIdentifier[0]);
                    } else {
                        sFMCSdkComponents.getIdentity().setProfileAttributes(this.f33998n, ModuleIdentifier.PUSH);
                    }
                }
                mo31125d();
            }
        } catch (Exception e) {
            C11461g.m41885b(RegistrationManager.f33962a, e, "An error occurred trying to save our Registration.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31114a() {
        boolean b = C11819h.m43268b(this.f33989e);
        if (b != this.f34000p) {
            this.f34000p = b;
            mo31126e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31115a(int i, String str) {
        C11461g.m41880a(RegistrationManager.f33962a, "%s: %s", Integer.valueOf(i), str);
        this.f33994j.mo30089b().execute(new C11726c("schedule_registration_retry", new Object[0]));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31116a(Registration registration, Map<String, List<String>> map) {
        C11474a.m41919a(map, this.f33991g.mo31606c());
        this.f33992h.mo29676c(C11307a.C11309b.REGISTRATION);
        synchronized (this.f33996l) {
            for (RegistrationManager.RegistrationEventListener next : this.f33996l) {
                if (next != null) {
                    try {
                        next.onRegistrationReceived(registration);
                    } catch (Exception e) {
                        C11461g.m41885b(RegistrationManager.f33962a, e, "%s threw an exception while processing the registration response", next.getClass().getName());
                    }
                }
            }
        }
        String jSONObject = C11511k.m42072b(registration).toString();
        this.f33991g.mo31606c().mo31111a(C11751c.f34088h, jSONObject);
        this.f33991g.mo31608f().edit().putLong(f33987w, System.currentTimeMillis()).putString(f33986v, C11824l.m43292b(jSONObject)).apply();
        this.f33994j.mo30089b().execute(new C11725b("delete_old_registrations", new Object[0]));
    }

    /* renamed from: a */
    static void m42761a(C11800j jVar, C11327b bVar, boolean z) {
        if (z) {
            jVar.mo31624u().mo31584o();
            jVar.mo31606c().mo31110a(C11751c.f34084d);
        }
        bVar.mo29680d(C11307a.C11309b.REGISTRATION);
    }

    /* renamed from: a */
    private void m42762a(C11800j jVar, String str) {
        jVar.mo31606c().mo31111a(C11751c.f34084d, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31117a(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f34003s)) {
            this.f34003s = str;
            mo31126e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31118a(String str, String str2, Map<String, String> map, Collection<String> collection) {
        mo31119a(str, str2, map, collection, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31119a(String str, String str2, Map<String, String> map, Collection<String> collection, boolean z) {
        this.f34004t = str;
        this.f34002r = str2;
        this.f33998n.clear();
        this.f33998n.putAll(map);
        this.f33999o.clear();
        this.f33999o.addAll(collection);
        this.f33992h.mo29676c(C11307a.C11309b.REGISTRATION);
        mo31123b(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31120a(boolean z) {
        this.f34001q = z;
        mo31126e();
    }

    /* renamed from: a */
    static boolean m42763a(Registration registration, C11800j jVar, boolean z) {
        if (registration == null) {
            return false;
        }
        if (registration.contactKey() != null || !z) {
            String string = jVar.mo31608f().getString(f33986v, (String) null);
            return string == null || !C11824l.m43292b(C11511k.m42072b(registration).toString()).equals(string);
        }
        C11461g.m41894e(RegistrationManager.f33962a, "You have delayRegistrationUntilContactKeyIsSet set to `true.`  The SDK will not send a registration to the Marketing Cloud until a contact key has been set.", new Object[0]);
        return false;
    }

    /* renamed from: a */
    static boolean m42764a(C11800j jVar, boolean z) {
        try {
            return m42763a(jVar.mo31624u().mo31583g(jVar.mo31604b()), jVar, z);
        } catch (Exception e) {
            C11461g.m41885b(RegistrationManager.f33962a, e, "Failed to get Registration from local storage or we can not determine if this Registration contains any changes.", new Object[0]);
            return false;
        }
    }
}

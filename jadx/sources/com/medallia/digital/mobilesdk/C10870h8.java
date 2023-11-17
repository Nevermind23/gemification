package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C10785e0;
import com.medallia.digital.mobilesdk.C10920j8;
import com.medallia.digital.mobilesdk.C11089s6;
import com.medallia.digital.mobilesdk.C11209y1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.h8 */
class C10870h8 implements Observer, C10769c8 {

    /* renamed from: c */
    private static C10870h8 f31178c;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f31179a = C11089s6.m40668b().mo28980a(C11089s6.C11090a.SDK_STOPPED, false);

    /* renamed from: b */
    private boolean f31180b;

    /* renamed from: com.medallia.digital.mobilesdk.h8$a */
    class C10871a extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ Object f31181a;

        C10871a(Object obj) {
            this.f31181a = obj;
        }

        /* renamed from: a */
        public void mo27617a() {
            if (!C10870h8.this.f31179a) {
                Object obj = this.f31181a;
                if (obj instanceof C10802f0) {
                    C10802f0 f0Var = (C10802f0) obj;
                    boolean c = f0Var.mo28280f() == Lifetime.Forever ? C10876i1.m39698a().mo28472c((C10785e0) f0Var) : (f0Var.mo28280f() == Lifetime.Application || f0Var.mo28280f() == Lifetime.Session) ? C10876i1.m39698a().mo28468b((C10785e0) f0Var) : false;
                    try {
                        if (f0Var.getName().equals("LastSubmitTimestamp") || f0Var.getName().equals("LastDeclineTimestamp")) {
                            AnalyticsBridge instance = AnalyticsBridge.getInstance();
                            instance.reportExtraDataEvent("event: " + f0Var.getName() + " inserted to DB, value: " + f0Var.mo28284i() + ", is successful: " + c, (String) null, (String) null, (String) null);
                        }
                    } catch (Exception e) {
                        C10735b4.m39111c(e.getMessage());
                    }
                    C10735b4.m39109b("update event " + f0Var.getName() + " in DB, was successful: " + c);
                    if (C11083s0.CustomParameters.getName().equals(f0Var.getName())) {
                        C11246z6.m41212b().mo29262a(C11209y1.C11211b.customParameters);
                    }
                } else if ((obj instanceof C10874i) && C10998m4.m40266h().mo28748d().mo28503e()) {
                    C10874i iVar = (C10874i) this.f31181a;
                    if (iVar.mo28456c() == Lifetime.Forever) {
                        C10876i1.m39698a().mo28472c((C10785e0) iVar);
                    } else if (iVar.mo28456c() == Lifetime.Application || iVar.mo28456c() == Lifetime.Session) {
                        C10876i1.m39698a().mo28468b((C10785e0) iVar);
                    }
                }
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.h8$b */
    static /* synthetic */ class C10872b {

        /* renamed from: a */
        static final /* synthetic */ int[] f31183a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.medallia.digital.mobilesdk.h8$c[] r0 = com.medallia.digital.mobilesdk.C10870h8.C10873c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31183a = r0
                com.medallia.digital.mobilesdk.h8$c r1 = com.medallia.digital.mobilesdk.C10870h8.C10873c.OsName     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31183a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.medallia.digital.mobilesdk.h8$c r1 = com.medallia.digital.mobilesdk.C10870h8.C10873c.DeviceId     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31183a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.medallia.digital.mobilesdk.h8$c r1 = com.medallia.digital.mobilesdk.C10870h8.C10873c.SessionId     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31183a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.medallia.digital.mobilesdk.h8$c r1 = com.medallia.digital.mobilesdk.C10870h8.C10873c.PropertyId     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C10870h8.C10872b.<clinit>():void");
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.h8$c */
    private enum C10873c {
        PropertyId,
        OsName,
        SessionId,
        DeviceId;

        /* renamed from: a */
        static C10873c m39690a(String str) {
            if (str == null) {
                return null;
            }
            C10873c cVar = PropertyId;
            if (str.equals(cVar.toString())) {
                return cVar;
            }
            C10873c cVar2 = OsName;
            if (str.equals(cVar2.toString())) {
                return cVar2;
            }
            C10873c cVar3 = SessionId;
            if (str.equals(cVar3.toString())) {
                return cVar3;
            }
            C10873c cVar4 = DeviceId;
            if (str.equals(cVar4.toString())) {
                return cVar4;
            }
            return null;
        }
    }

    public C10870h8() {
        C10735b4.m39113e("UserJourney was initiated");
        CollectorsInfrastructure.getInstance().addObserverToCollectors(this);
        AnalyticsBridge.getInstance().addObserverToAnalyticsItems(this);
    }

    /* renamed from: c */
    private ArrayList<C10802f0> m39666c(boolean z) {
        ArrayList<? extends C10785e0> arrayList;
        String str;
        String name;
        AnalyticsBridge instance;
        String sb;
        ArrayList<C10802f0> arrayList2 = new ArrayList<>();
        C10876i1 a = C10876i1.m39698a();
        C10785e0.C10786a aVar = C10785e0.C10786a.UserJourneyData;
        Object[] objArr = new Object[1];
        if (z) {
            objArr[0] = C10920j8.C10924d.ALL_DESC;
            arrayList = a.mo28471c(aVar, objArr);
        } else {
            objArr[0] = C10920j8.C10924d.ALL;
            arrayList = a.mo28471c(aVar, objArr);
            if (arrayList != null) {
                try {
                    if (!arrayList.isEmpty()) {
                        instance = AnalyticsBridge.getInstance();
                        sb = "Events array fetch from DB size: " + arrayList.size();
                        instance.reportExtraDataEvent((String) null, sb, (String) null, (String) null);
                    }
                } catch (Exception e) {
                    C10735b4.m39111c(e.getMessage());
                }
            }
            instance = AnalyticsBridge.getInstance();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Events array fetch from DB is ");
            sb2.append(arrayList == null ? "null" : "empty");
            sb = sb2.toString();
            instance.reportExtraDataEvent((String) null, sb, (String) null, (String) null);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("fetchUJForTargetingV2 full events array ");
        if (arrayList == null) {
            str = " is null";
        } else {
            str = " size is " + arrayList.size();
        }
        sb3.append(str);
        C10735b4.m39109b(sb3.toString());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (arrayList != null) {
            Iterator<? extends C10785e0> it = arrayList.iterator();
            while (it.hasNext()) {
                C10802f0 f0Var = (C10802f0) it.next();
                if (f0Var.mo28279e() != GroupType.collector) {
                    linkedHashMap2.put(f0Var.getName(), f0Var);
                } else {
                    boolean equals = f0Var.getName().equals("CustomParameters");
                    if (z) {
                        if (equals) {
                            name = f0Var.getName() + UUID.randomUUID().toString();
                        }
                    } else if (!equals) {
                        if (f0Var.getName().equals("LastSubmitTimestamp") || f0Var.getName().equals("LastDeclineTimestamp")) {
                            AnalyticsBridge.getInstance().reportExtraDataEvent((String) null, (String) null, "distinctCollectors add event: " + f0Var.getName() + " , value: " + f0Var.mo28284i(), (String) null);
                        }
                        name = f0Var.getName();
                    }
                    linkedHashMap.put(name, f0Var);
                }
            }
            for (Map.Entry value : linkedHashMap.entrySet()) {
                arrayList2.add(value.getValue());
            }
            for (Map.Entry value2 : linkedHashMap2.entrySet()) {
                arrayList2.add(value2.getValue());
            }
        }
        return arrayList2;
    }

    /* renamed from: g */
    protected static C10870h8 m39667g() {
        if (f31178c == null) {
            f31178c = new C10870h8();
        }
        return f31178c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ArrayList<C10874i> mo28431a(long j, Long l, int i) {
        C10735b4.m39113e("getAllAnalyticsV2RecordsForSession was called");
        return C10876i1.m39698a().mo28471c(C10785e0.C10786a.AnalyticsData, Long.valueOf(j), l, Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo28440b() {
        try {
            return mo28451i().toString();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    public void clearAndDisconnect() {
        C10735b4.m39107a(getClass().getSimpleName());
        f31178c = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public HashMap<String, Object> mo28446d() {
        ArrayList<? extends C10785e0> c = C10876i1.m39698a().mo28471c(C10785e0.C10786a.UserJourneyData, C10920j8.C10924d.ALL);
        HashMap<String, Object> hashMap = new HashMap<>();
        Iterator<? extends C10785e0> it = c.iterator();
        while (it.hasNext()) {
            C10802f0 f0Var = (C10802f0) it.next();
            if (f0Var.mo28279e() == GroupType.collector && f0Var.getName() != null) {
                hashMap.put(f0Var.getName().toLowerCase(), f0Var.mo28284i());
            }
        }
        C10735b4.m39109b("Base events was exported");
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public ArrayList<C10802f0> mo28448e() {
        return m39666c(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public ArrayList<C10802f0> mo28449f() {
        return m39666c(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public long mo28450h() {
        return C10876i1.m39698a().mo28470c(C10785e0.C10786a.UserJourneyData);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public JSONArray mo28451i() {
        String str;
        JSONArray jSONArray = new JSONArray();
        C10735b4.m39109b("getUserJourneyArray was called");
        ArrayList<? extends C10785e0> c = C10876i1.m39698a().mo28471c(C10785e0.C10786a.UserJourneyData, C10920j8.C10924d.ALL);
        if (this.f31180b) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            Iterator<? extends C10785e0> it = c.iterator();
            while (it.hasNext()) {
                C10802f0 f0Var = (C10802f0) it.next();
                if (f0Var.mo28279e() != GroupType.collector) {
                    hashMap2.put(f0Var.getName(), f0Var.mo28278d());
                } else {
                    if (f0Var.getName().equals("CustomParameters")) {
                        str = f0Var.getName() + UUID.randomUUID().toString();
                    } else {
                        str = f0Var.getName();
                    }
                    hashMap.put(str, f0Var.mo28278d());
                }
            }
            for (Map.Entry value : hashMap.entrySet()) {
                jSONArray.put(value.getValue());
            }
            for (Map.Entry value2 : hashMap2.entrySet()) {
                jSONArray.put(value2.getValue());
            }
        } else {
            Iterator<? extends C10785e0> it2 = c.iterator();
            while (it2.hasNext()) {
                jSONArray.put(((C10802f0) it2.next()).mo28278d());
            }
        }
        return jSONArray;
    }

    public void update(Observable observable, Object obj) {
        C11004m7.m40304b().mo28763a().execute(new C10871a(obj));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ArrayList<C10802f0> mo28432a(String str) {
        C10735b4.m39113e("getAllRecordsForSession was called");
        return C10876i1.m39698a().mo28471c(C10785e0.C10786a.UserJourneyData, C10920j8.C10924d.SESSION, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public JSONArray mo28441b(boolean z) {
        try {
            String a = C11089s6.m40668b().mo28975a(C11089s6.C11090a.SESSION_ID, (String) null);
            ArrayList<C10802f0> a2 = mo28432a(a);
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray();
            Iterator<C10802f0> it = a2.iterator();
            while (it.hasNext()) {
                C10802f0 next = it.next();
                if (next.mo28278d() != null) {
                    if (!z || next.mo28279e() == null || next.mo28279e() != GroupType.collector || (next.getName() != null && next.getName().equals(C11083s0.CustomParameters.getName()))) {
                        jSONArray.put(next.mo28278d());
                    } else {
                        hashMap.put(next.getName(), next);
                    }
                }
                C10873c a3 = C10873c.m39690a(next.getName());
                if (a3 != null) {
                    arrayList.add(a3);
                }
            }
            if (z) {
                for (Map.Entry value : hashMap.entrySet()) {
                    C10802f0 f0Var = (C10802f0) value.getValue();
                    if (f0Var != null) {
                        jSONArray.put(f0Var.mo28278d());
                    }
                }
            }
            return m39663a((ArrayList<C10873c>) arrayList, jSONArray, a);
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return new JSONArray();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String[] mo28445c() {
        String a = C11089s6.m40668b().mo28975a(C11089s6.C11090a.SESSION_ID, (String) null);
        C10735b4.m39109b("getAllRecordsForSession was called");
        ArrayList<C10802f0> a2 = mo28432a(a);
        String[] strArr = {"", ""};
        if (a2 == null || a2.isEmpty()) {
            C10735b4.m39114f("User Journey failed to export : no data");
            return strArr;
        }
        Iterator<C10802f0> it = a2.iterator();
        while (it.hasNext()) {
            C10802f0 next = it.next();
            if (next.mo28279e() == GroupType.collector) {
                strArr[0] = strArr[0] + next.mo28276b();
            } else {
                strArr[1] = strArr[1] + next.mo28276b();
            }
        }
        C10735b4.m39113e("User Journey was exported");
        return strArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo28447d(boolean z) {
        this.f31179a = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public JSONArray mo28433a(ArrayList<C10874i> arrayList) {
        try {
            JSONArray jSONArray = new JSONArray();
            if (arrayList != null) {
                Iterator<C10874i> it = arrayList.iterator();
                while (it.hasNext()) {
                    C10874i next = it.next();
                    if (next.mo28457d() != null) {
                        jSONArray.put(next.mo28457d());
                    }
                }
            }
            return jSONArray;
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return new JSONArray();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public JSONObject mo28442b(ArrayList<C10874i> arrayList) {
        C10735b4.m39109b("exportAnalyticsToJsonObject was called");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("events", mo28433a(arrayList));
            C10735b4.m39109b("Analytics Records was exported");
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
        return jSONObject;
    }

    /* renamed from: a */
    private JSONArray m39663a(ArrayList<C10873c> arrayList, JSONArray jSONArray, String str) {
        String a;
        JSONArray jSONArray2 = jSONArray;
        if (str == null) {
            return jSONArray2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            long a2 = C11089s6.m40668b().mo28974a(C11089s6.C11090a.PROPERTY_ID, 0);
            if (a2 != 0) {
                jSONArray2.put(new C10802f0(Long.valueOf(a2), GroupType.collector, Lifetime.Application, ValueType.TypeLong, "PropertyId", System.currentTimeMillis(), str).mo28278d());
            }
            String a3 = C11089s6.m40668b().mo28975a(C11089s6.C11090a.DEVICE_ID, (String) null);
            if (a3 != null) {
                jSONArray2.put(new C10802f0(a3, GroupType.collector, Lifetime.Session, ValueType.TypeString, "DeviceId", System.currentTimeMillis(), str).mo28278d());
            }
            GroupType groupType = GroupType.collector;
            Lifetime lifetime = Lifetime.Session;
            GroupType groupType2 = groupType;
            ValueType valueType = ValueType.TypeString;
            String str2 = str;
            jSONArray2.put(new C10802f0("Android", groupType2, lifetime, valueType, "OsName", System.currentTimeMillis(), str2).mo28278d());
            jSONArray2.put(new C10802f0(str, groupType2, Lifetime.Application, valueType, "SessionId", System.currentTimeMillis(), str2).mo28278d());
            return jSONArray2;
        }
        Iterator<C10873c> it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (it.hasNext()) {
            int i = C10872b.f31183a[it.next().ordinal()];
            if (i == 1) {
                z4 = true;
            } else if (i != 2) {
                if (i == 3) {
                    z3 = true;
                } else if (i != 4) {
                }
                z = true;
            } else {
                z2 = true;
            }
        }
        if (!z) {
            long a4 = C11089s6.m40668b().mo28974a(C11089s6.C11090a.PROPERTY_ID, 0);
            if (a4 != 0) {
                jSONArray2.put(new C10802f0(Long.valueOf(a4), GroupType.collector, Lifetime.Application, ValueType.TypeLong, "PropertyId").mo28278d());
            }
        }
        if (!z2 && (a = C11089s6.m40668b().mo28975a(C11089s6.C11090a.DEVICE_ID, (String) null)) != null) {
            jSONArray2.put(new C10802f0(a, GroupType.collector, Lifetime.Session, ValueType.TypeString, "DeviceId").mo28278d());
        }
        if (!z4) {
            jSONArray2.put(new C10802f0("Android", GroupType.collector, Lifetime.Session, ValueType.TypeString, "OsName").mo28278d());
        }
        if (!z3) {
            jSONArray2.put(new C10802f0(str, GroupType.collector, Lifetime.Application, ValueType.TypeString, "SessionId").mo28278d());
        }
        return jSONArray2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo28443b(boolean z, Long l, long j) {
        String str;
        String str2;
        if (z) {
            if (mo28439a(l, j)) {
                str2 = String.format(Locale.US, "Analytics v2: events from %d to %d was cleared", new Object[]{l, Long.valueOf(j)});
            } else {
                str = String.format(Locale.US, "Analytics v2: failed to clear events from %d to %d was cleared", new Object[]{l, Long.valueOf(j)});
                C10735b4.m39114f(str);
                return;
            }
        } else if (mo28444b(Lifetime.Session)) {
            str2 = "User Journey: lifetime type session was cleared";
        } else {
            str = "User Journey: failed to clear lifetime type session";
            C10735b4.m39114f(str);
            return;
        }
        C10735b4.m39109b(str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public JSONObject mo28434a(boolean z) {
        C10735b4.m39109b("exportCurrentUJSessionToJson was called");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userJourney", mo28441b(z));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo28444b(Lifetime lifetime) {
        m39664a(lifetime);
        return C10876i1.m39698a().mo28464a(C10785e0.C10786a.UserJourneyData, lifetime);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28435a(ConfigurationContract configurationContract) {
        if (configurationContract != null && configurationContract.getSdkConfiguration() != null && configurationContract.getSdkConfiguration().getMedalliaDigitalBrain() != null) {
            this.f31180b = configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().isDistinct();
        }
    }

    /* renamed from: a */
    private void m39664a(Lifetime lifetime) {
        C10735b4.m39109b("clearSharedPreferencesUj called with lifetime: " + lifetime);
        C11089s6 b = C11089s6.m40668b();
        C11089s6.C11090a aVar = C11089s6.C11090a.INVITATION_DISPLAYED;
        if (b.mo28975a(aVar, (String) null) != null) {
            C11089s6.m40668b().mo28984b(aVar, (String) null);
            C10735b4.m39109b("SharedPreferences InvitationDisplayed cleared");
        }
        C11089s6 b2 = C11089s6.m40668b();
        C11089s6.C11090a aVar2 = C11089s6.C11090a.SESSION_CALCULATED_PERCENTAGE;
        if (b2.mo28975a(aVar2, (String) null) != null) {
            C11089s6.m40668b().mo28984b(aVar2, (String) null);
            C10735b4.m39109b("SharedPreferences SessionCalculatedPercentage cleared");
        }
        if (lifetime == Lifetime.Forever) {
            C11089s6 b3 = C11089s6.m40668b();
            C11089s6.C11090a aVar3 = C11089s6.C11090a.LAST_DECLINE_TIMESTAMP;
            if (b3.mo28975a(aVar3, (String) null) != null) {
                C11089s6.m40668b().mo28984b(aVar3, (String) null);
                C10735b4.m39109b("SharedPreferences LastDeclineTimestamp cleared to 0");
            }
            C11089s6 b4 = C11089s6.m40668b();
            C11089s6.C11090a aVar4 = C11089s6.C11090a.LAST_SUBMIT_TIMESTAMP;
            if (b4.mo28975a(aVar4, (String) null) != null) {
                C11089s6.m40668b().mo28984b(aVar4, (String) null);
                C10735b4.m39109b("SharedPreferences LastSubmitTimestamp cleared");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28436a(C10802f0 f0Var) {
        C10876i1.m39698a().mo28472c((C10785e0) f0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28437a(boolean z, Long l, long j) {
        String str;
        String str2;
        if (z) {
            if (mo28439a(l, j)) {
                str2 = String.format(Locale.US, "Analytics v2: events from %d to %d was cleared", new Object[]{l, Long.valueOf(j)});
            } else {
                str = String.format(Locale.US, "Analytics v2: failed to clear events from %d to %d was cleared", new Object[]{l, Long.valueOf(j)});
                C10735b4.m39114f(str);
                return;
            }
        } else if (mo28444b(Lifetime.Application)) {
            str2 = "User Journey: lifetime type application was cleared";
        } else {
            str = "User Journey: failed to clear lifetime type application";
            C10735b4.m39114f(str);
            return;
        }
        C10735b4.m39109b(str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28438a() {
        return C10876i1.m39698a().mo28464a(C10785e0.C10786a.UserJourneyData, Lifetime.Session, GroupType.collector);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28439a(Long l, long j) {
        return C10876i1.m39698a().mo28464a(C10785e0.C10786a.AnalyticsData, Long.valueOf(j), l);
    }
}

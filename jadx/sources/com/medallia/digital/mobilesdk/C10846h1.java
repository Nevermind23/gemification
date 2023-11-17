package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C11089s6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.medallia.digital.mobilesdk.h1 */
class C10846h1 implements C10769c8 {

    /* renamed from: b */
    private static C10846h1 f31061b;

    /* renamed from: a */
    private final ArrayList<CustomParameter> f31062a = new ArrayList<>();

    C10846h1() {
    }

    /* renamed from: b */
    protected static C10846h1 m39583b() {
        if (f31061b == null) {
            f31061b = new C10846h1();
        }
        return f31061b;
    }

    /* renamed from: c */
    private void m39584c() {
        StringBuilder sb = new StringBuilder("Set " + this.f31062a.size() + " custom parameters successfully\n");
        for (int i = 0; i < this.f31062a.size(); i++) {
            sb.append(this.f31062a.get(i).mo27778e());
            sb.append("\n");
        }
        C10735b4.m39113e(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28389a() {
        if (C11089s6.m40668b().mo28978a(C11089s6.C11090a.CUSTOM_PARAMETERS)) {
            C10735b4.m39113e("Cleared custom parameters");
        } else {
            C10735b4.m39111c("Failed to clear custom parameters - storage is not initiated");
        }
    }

    public void clearAndDisconnect() {
        C10735b4.m39107a("CustomParameters");
        mo28389a();
        f31061b = null;
    }

    /* renamed from: a */
    private void m39582a(String str, Object obj) {
        CustomParameter customParameter = new CustomParameter();
        if (!customParameter.mo27773a(str)) {
            C10735b4.m39111c("name can't be empty");
        } else if (!customParameter.mo27772a(obj)) {
            C10735b4.m39111c("Object is not a valid type(String, int, long, double, float, bool");
        } else {
            Iterator<CustomParameter> it = this.f31062a.iterator();
            while (it.hasNext()) {
                CustomParameter next = it.next();
                if (next.mo27774b().equals(customParameter.mo27774b())) {
                    next.mo27772a(customParameter.mo27775c());
                    return;
                }
            }
            this.f31062a.add(customParameter);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28390a(String str, Object obj, boolean z) {
        m39582a(str, obj);
        mo28392a(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28391a(HashMap<String, Object> hashMap, boolean z) {
        if (hashMap == null || hashMap.isEmpty()) {
            C10735b4.m39111c("Hashmap is not valid");
            return;
        }
        for (Map.Entry next : hashMap.entrySet()) {
            m39582a((String) next.getKey(), next.getValue());
        }
        mo28392a(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28392a(boolean z) {
        if (!this.f31062a.isEmpty() && CollectorsInfrastructure.getInstance() != null && CollectorsInfrastructure.getInstance().isInitialized() && C11089s6.m40668b().mo28987d() && z) {
            if (C11089s6.m40668b().mo28979a(C11089s6.C11090a.CUSTOM_PARAMETERS, ModelFactory.getInstance().customParametersToJsonArray(this.f31062a))) {
                m39584c();
            }
            Iterator<CustomParameter> it = this.f31062a.iterator();
            while (it.hasNext()) {
                CollectorsInfrastructure.getInstance().customParametersCollector.mo28117a(it.next());
            }
            this.f31062a.clear();
        }
    }
}

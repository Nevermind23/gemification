package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C10785e0;
import com.medallia.digital.mobilesdk.C10812f6;
import com.medallia.digital.mobilesdk.C11089s6;
import com.medallia.digital.mobilesdk.C11247z7;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.f5 */
public class C10809f5 {

    /* renamed from: b */
    private static C10809f5 f30952b;

    /* renamed from: a */
    private ArrayList<String> f30953a;

    /* renamed from: com.medallia.digital.mobilesdk.f5$a */
    class C10810a implements C10796e6<C11174w5> {

        /* renamed from: a */
        final /* synthetic */ MDResultCallback f30954a;

        C10810a(MDResultCallback mDResultCallback) {
            this.f30954a = mDResultCallback;
        }

        /* renamed from: a */
        public void mo27796a(C10859h4 h4Var) {
            if (h4Var != null) {
                C10735b4.m39111c(h4Var.getMessage());
            }
            MDResultCallback mDResultCallback = this.f30954a;
            if (mDResultCallback != null) {
                mDResultCallback.onSuccess();
            }
        }

        /* renamed from: a */
        public void mo27797a(C11174w5 w5Var) {
            C10809f5.this.m39422a(w5Var);
            MDResultCallback mDResultCallback = this.f30954a;
            if (mDResultCallback != null) {
                mDResultCallback.onSuccess();
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.f5$b */
    class C10811b implements C10812f6.C10813a {
        C10811b() {
        }

        /* renamed from: a */
        public void mo28086a(C10739b6 b6Var) {
            if (b6Var == null || b6Var.mo28125b() == null) {
                C10735b4.m39109b("Response is null - can't fetch OCQ UUID");
                return;
            }
            ConfigurationUUID createUUID = ModelFactory.getInstance().createUUID(b6Var.mo28125b());
            C11208y0.m41106c().mo29206a(createUUID);
            C11247z7.m41224b(C11247z7.C11249b.OCQ_UUID, createUUID.getOcqUuid());
            C10735b4.m39113e("OCQ UUID saved in storage");
        }

        /* renamed from: a */
        public void mo28087a(C11244z5 z5Var) {
            C10735b4.m39111c((z5Var == null || z5Var.mo29258a() == null) ? "Can't fetch Configuration UUID (needed for OCQ UUID)" : z5Var.mo29258a().name());
        }
    }

    /* renamed from: a */
    public static C10809f5 m39420a() {
        if (f30952b == null) {
            f30952b = new C10809f5();
        }
        return f30952b;
    }

    /* renamed from: b */
    private void m39423b() {
        C10998m4.m40266h().mo28737a((C10812f6.C10813a) new C10811b());
    }

    /* renamed from: d */
    private boolean m39424d() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean b = C10988l8.m40232b();
        boolean z4 = C11016n4.m40375f().mo28829a(C11089s6.C11090a.OCQ_USER_ID) != null;
        if (C11208y0.m41106c().mo29204a() != null) {
            if (C11208y0.m41106c().mo29204a().propertyConfiguration != null) {
                z3 = C11208y0.m41106c().mo29204a().propertyConfiguration.isOCQEnabled();
                if (z3) {
                    if (C11208y0.m41106c().mo29204a().propertyConfiguration.getOmniChannelRulesIds() == null || C11208y0.m41106c().mo29204a().propertyConfiguration.getOmniChannelRulesIds().isEmpty()) {
                        C10876i1.m39698a().mo28463a(C10785e0.C10786a.QuarantineRule);
                    } else {
                        this.f30953a = C11208y0.m41106c().mo29204a().propertyConfiguration.getOmniChannelRulesIds();
                        z2 = true;
                    }
                }
                z2 = false;
            } else {
                z3 = false;
                z2 = false;
            }
            z = (C11208y0.m41106c().mo29204a().sdkConfiguration == null || C11208y0.m41106c().mo29204a().sdkConfiguration.getMedalliaDigitalBrain() == null) ? false : C11208y0.m41106c().mo29204a().sdkConfiguration.getMedalliaDigitalBrain().isTREV2Enabled();
        } else {
            z3 = false;
            z2 = false;
            z = false;
        }
        C10735b4.m39109b("isOCQEnabled - isOCQEnabled: " + z3);
        C10735b4.m39109b("isOCQEnabled - isTREV2: " + z);
        C10735b4.m39109b("isOCQEnabled - isUserIDSet: " + z4);
        C10735b4.m39109b("isOCQEnabled - isOCQRulesExists: " + z2);
        C10735b4.m39109b("isOCQEnabled - isNetWorkAvailable: " + b);
        return z3 && z && z4 && z2 && b;
    }

    /* renamed from: c */
    public JSONObject mo28303c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rulesIds", new JSONArray(ModelFactory.getInstance().getStringArrayAsJsonString(this.f30953a)));
            jSONObject.put("cuid", C11016n4.m40375f().mo28829a(C11089s6.C11090a.OCQ_USER_ID));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28301a(MDResultCallback mDResultCallback) {
        C10998m4.m40266h().mo28743a(mo28303c(), (C10796e6<C11174w5>) new C10810a(mDResultCallback));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo28302b(MDResultCallback mDResultCallback) {
        if (m39424d()) {
            C10735b4.m39109b("OCQ enabled");
            mo28301a(mDResultCallback);
            return;
        }
        C10735b4.m39109b("OCQ not enabled - can't validate rules");
        mDResultCallback.onSuccess();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m39422a(C11174w5 w5Var) {
        if (w5Var != null && w5Var.mo29153d()) {
            ArrayList<C11204x5> c = w5Var.mo29152c();
            C10876i1 a = C10876i1.m39698a();
            C10785e0.C10786a aVar = C10785e0.C10786a.QuarantineRule;
            if (a.mo28470c(aVar) > 0) {
                C10876i1.m39698a().mo28463a(aVar);
            }
            Iterator<C11204x5> it = c.iterator();
            while (it.hasNext()) {
                C10876i1.m39698a().mo28468b((C10785e0) it.next());
            }
            if (w5Var.mo29151b() != null) {
                C11247z7.m41226c(C11247z7.C11249b.C_UUID, w5Var.mo29151b());
            }
            if (w5Var.mo29148a() != null) {
                C11247z7.m41224b(C11247z7.C11249b.C_UUID, w5Var.mo29148a());
            }
        }
        if (C11208y0.m41106c() != null && C11208y0.m41106c().mo29208b() != null) {
            C11247z7.m41224b(C11247z7.C11249b.OCQ_UUID, C11208y0.m41106c().mo29208b().getOcqUuid());
        } else if (C11247z7.m41223b(C11247z7.C11249b.OCQ_UUID) == null && C11208y0.m41106c() != null && C11208y0.m41106c().mo29208b() == null) {
            m39423b();
        }
        CollectorsInfrastructure.getInstance().isOCQRulesValidCollector.mo28117a(Boolean.TRUE);
    }
}

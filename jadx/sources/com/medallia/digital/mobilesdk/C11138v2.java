package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.medallia.digital.mobilesdk.AnalyticsBridge;
import com.medallia.digital.mobilesdk.Broadcasts;
import com.medallia.digital.mobilesdk.C10778d6;
import com.medallia.digital.mobilesdk.C10785e0;
import com.medallia.digital.mobilesdk.C11013n2;
import com.medallia.digital.mobilesdk.InviteData;
import com.medallia.digital.mobilesdk.MDExternalError;
import com.medallia.digital.mobilesdk.MedalliaWebView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.v2 */
final class C11138v2 implements C10769c8 {

    /* renamed from: w */
    private static C11138v2 f32015w;

    /* renamed from: a */
    protected C11162w2 f32016a = new C11162w2();

    /* renamed from: b */
    protected String f32017b;

    /* renamed from: c */
    private String f32018c;

    /* renamed from: d */
    private String f32019d;

    /* renamed from: e */
    private String f32020e;

    /* renamed from: f */
    private String f32021f;

    /* renamed from: g */
    private Long f32022g;

    /* renamed from: h */
    private boolean f32023h;

    /* renamed from: i */
    private boolean f32024i = false;

    /* renamed from: j */
    private boolean f32025j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C11238z3 f32026k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f32027l;

    /* renamed from: m */
    protected LinkedHashMap<String, C11013n2> f32028m = new LinkedHashMap<>();

    /* renamed from: n */
    protected List<ResourceContract> f32029n = new ArrayList();

    /* renamed from: o */
    protected List<ResourceContract> f32030o = new ArrayList();

    /* renamed from: p */
    private HashMap<String, Boolean> f32031p = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public HashMap<String, C10954l2> f32032q = new HashMap<>();

    /* renamed from: r */
    private C11145g f32033r;

    /* renamed from: s */
    protected LinkedHashMap<String, C11062q> f32034s = new LinkedHashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f32035t;

    /* renamed from: u */
    private boolean f32036u;

    /* renamed from: v */
    private String f32037v;

    /* renamed from: com.medallia.digital.mobilesdk.v2$a */
    class C11139a implements C10778d6.C10780b {

        /* renamed from: a */
        final /* synthetic */ C11144f f32038a;

        C11139a(C11144f fVar) {
            this.f32038a = fVar;
        }

        /* renamed from: a */
        public void mo28247a(ResourceContract resourceContract) {
            C11144f fVar;
            C11138v2.this.f32030o.remove(resourceContract);
            if (C11138v2.this.f32030o.isEmpty() && (fVar = this.f32038a) != null) {
                fVar.mo28690a(null);
            }
            C10735b4.m39109b("finished downloading localization resource");
        }

        /* renamed from: b */
        public void mo28248b(ResourceContract resourceContract) {
            C11144f fVar;
            C11138v2.this.f32030o.remove(resourceContract);
            if (C11138v2.this.f32030o.isEmpty() && (fVar = this.f32038a) != null) {
                fVar.mo28690a(null);
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.v2$b */
    class C11140b extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ C11144f f32040a;

        /* renamed from: b */
        final /* synthetic */ String f32041b;

        C11140b(C11144f fVar, String str) {
            this.f32040a = fVar;
            this.f32041b = str;
        }

        /* renamed from: a */
        public void mo27617a() {
            boolean z;
            String str;
            if (!C11138v2.this.f32035t) {
                C11144f fVar = this.f32040a;
                if (fVar != null) {
                    fVar.mo28689a();
                }
                Broadcasts.C10693f.m38950a(new MDExternalError(MDExternalError.ExternalError.TRANSLATION_FEATURE_IS_DISABLED));
                str = "UpdateCustomLocale = feature disabled, isSuccess = false";
            } else {
                C10930k2.m39993h(C11138v2.this.f32027l);
                if (C11138v2.this.f32026k == null) {
                    C11144f fVar2 = this.f32040a;
                    if (fVar2 != null) {
                        fVar2.mo28689a();
                    }
                    str = "UpdateCustomLocale = Missing localizationContract, isSuccess = false";
                } else {
                    String a = C11221y3.m41127d().mo29211a(this.f32041b, C11138v2.this.f32026k.mo29246a());
                    if (a == null) {
                        a = C11138v2.this.f32026k.mo29247b();
                        z = false;
                    } else {
                        z = true;
                    }
                    C11138v2 v2Var = C11138v2.this;
                    String a2 = v2Var.mo29054a(a, v2Var.f32026k);
                    String str2 = "";
                    if (a2 == null) {
                        C10735b4.m39111c(str2);
                        C11144f fVar3 = this.f32040a;
                        if (fVar3 != null) {
                            fVar3.mo28689a();
                        }
                        str = "UpdateCustomLocale = Failed unzip translation isSuccess = false";
                    } else {
                        String g = C10930k2.m39992g(a2);
                        if (TextUtils.isEmpty(g)) {
                            C11144f fVar4 = this.f32040a;
                            if (fVar4 != null) {
                                fVar4.mo28689a();
                                return;
                            }
                            return;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject(g);
                            C11138v2.this.mo29068b(new PropertyConfigurationContract(jSONObject));
                            C11144f fVar5 = this.f32040a;
                            if (fVar5 != null) {
                                fVar5.mo28690a(jSONObject);
                            }
                            C10735b4.m39113e("updateCustomLocale = " + C11221y3.m41127d().mo29215b() + ", isSuccess = " + true);
                            if (!z) {
                                str2 = "Language not available. Language fallback logic applied";
                            }
                            Broadcasts.C10693f.m38951a(str2);
                            return;
                        } catch (Exception e) {
                            C11144f fVar6 = this.f32040a;
                            if (fVar6 != null) {
                                fVar6.mo28689a();
                            }
                            C10735b4.m39113e("UpdateCustomLocale = Cant parse property configuration from localization:" + e.getMessage() + ", isSuccess = " + false);
                            Broadcasts.C10693f.m38950a(new MDExternalError(MDExternalError.ExternalError.TRANSLATION_INVALID_FORMAT));
                            return;
                        }
                    }
                }
            }
            C10735b4.m39113e(str);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.v2$c */
    class C11141c implements C10778d6.C10780b {
        C11141c() {
        }

        /* renamed from: a */
        public void mo28247a(ResourceContract resourceContract) {
            C11138v2.this.f32029n.remove(resourceContract);
            if (C11138v2.this.mo29080i()) {
                C11138v2.this.m40826l();
            }
            C10735b4.m39109b("finished downloading global resources");
        }

        /* renamed from: b */
        public void mo28248b(ResourceContract resourceContract) {
            if (C11138v2.this.f32032q != null) {
                for (Map.Entry entry : C11138v2.this.f32032q.entrySet()) {
                    if (entry.getValue() != null) {
                        ((C10954l2) entry.getValue()).mo28347a();
                        C11138v2.this.f32032q.put(entry.getKey(), (Object) null);
                    }
                }
                HashMap unused = C11138v2.this.f32032q = null;
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.v2$d */
    class C11142d implements C11074r2 {
        C11142d() {
        }

        /* renamed from: a */
        public void mo28955a(C11013n2 n2Var) {
            C10954l2 l2Var;
            if (n2Var != null) {
                C11138v2.this.f32028m.put(n2Var.getFormId(), n2Var);
                if (C11138v2.this.f32032q != null && (l2Var = (C10954l2) C11138v2.this.f32032q.get(n2Var.getFormId())) != null) {
                    l2Var.onSuccess();
                    C11138v2.this.f32032q.put(n2Var.getFormId(), (Object) null);
                }
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.v2$f */
    interface C11144f<T> {
        /* renamed from: a */
        void mo28689a();

        /* renamed from: a */
        void mo28690a(T t);
    }

    /* renamed from: com.medallia.digital.mobilesdk.v2$g */
    interface C11145g {
        /* renamed from: a */
        void mo28688a();
    }

    private C11138v2() {
    }

    /* renamed from: a */
    private C11013n2 m40806a(SDKConfigurationFormContract sDKConfigurationFormContract) {
        C11013n2 e = mo29075e(sDKConfigurationFormContract.getFormId());
        if (e == null) {
            e = new C11013n2(sDKConfigurationFormContract);
        } else {
            boolean a = mo29062a(e, sDKConfigurationFormContract);
            m40825i(e, sDKConfigurationFormContract);
            boolean z = true;
            boolean z2 = e.getUrlVersion().equals("V2") && e.mo28825n() != this.f32036u;
            if (!e.getUrlVersion().equals("V2") || !this.f32036u) {
                z = false;
            }
            e.mo28798c(z);
            boolean a2 = mo29063a(e.mo28804f(), sDKConfigurationFormContract.getResources());
            if (!mo29069b(sDKConfigurationFormContract) || !a2 || !a || z2) {
                e.mo28788a(C11013n2.C11014a.IN_PROGRESS);
                if (!a2) {
                    e.mo28791a(sDKConfigurationFormContract.getResources());
                }
                e.mo28800d(sDKConfigurationFormContract.getTemplateRemoteUrl());
                e.mo28797c(sDKConfigurationFormContract.getTemplateLocalUrl());
            } else {
                e.mo28788a(C11013n2.C11014a.AVAILABLE);
            }
        }
        ConfigurationContract a3 = C11208y0.m41106c().mo29204a();
        if (!(a3 == null || a3.sdkConfiguration.getFormConfigurations().getRedirectLinks() == null)) {
            e.mo28790a(a3.sdkConfiguration.getFormConfigurations().getRedirectLinks());
        }
        if (!(a3 == null || a3.sdkConfiguration.getMedalliaDigitalClientConfig().getBlockNetworkInForm() == null)) {
            e.mo28792a(a3.sdkConfiguration.getMedalliaDigitalClientConfig().getBlockNetworkInForm().booleanValue());
        }
        return e;
    }

    /* renamed from: f */
    protected static C11138v2 m40821f() {
        if (f32015w == null) {
            f32015w = new C11138v2();
        }
        return f32015w;
    }

    /* renamed from: i */
    private void m40825i(C11013n2 n2Var, SDKConfigurationFormContract sDKConfigurationFormContract) {
        if (n2Var != null && sDKConfigurationFormContract != null) {
            n2Var.mo28786a(sDKConfigurationFormContract);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m40826l() {
        this.f32016a.mo29108a(this.f32028m, (C11074r2) new C11142d());
        C11145g gVar = this.f32033r;
        if (gVar != null) {
            gVar.mo28688a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C11062q mo29064b(String str) {
        LinkedHashMap<String, C11062q> linkedHashMap = this.f32034s;
        if (linkedHashMap == null || str == null) {
            return null;
        }
        return linkedHashMap.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C11013n2 mo29070c(String str) {
        LinkedHashMap<String, C11013n2> linkedHashMap = this.f32028m;
        if (linkedHashMap == null || str == null) {
            return null;
        }
        return linkedHashMap.get(str);
    }

    public void clearAndDisconnect() {
        C10735b4.m39107a("Forms");
        f32015w = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo29073d(String str) {
        C10797e7 e7Var = (C10797e7) C10876i1.m39698a().mo28467b(C10785e0.C10786a.Template, str);
        if (e7Var == null) {
            return null;
        }
        return e7Var.mo28265b() + " : " + e7Var.mo28263a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C11013n2 mo29075e(String str) {
        if (str == null) {
            return null;
        }
        return (C11013n2) C10876i1.m39698a().mo28467b(C10785e0.C10786a.FormData, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public ArrayList<C11013n2> mo29078g() {
        if (this.f32028m == null) {
            return null;
        }
        ArrayList<C11013n2> arrayList = new ArrayList<>();
        for (Map.Entry<String, C11013n2> value : this.f32028m.entrySet()) {
            arrayList.add(value.getValue());
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public HashMap<String, Boolean> mo29079h() {
        return this.f32031p;
    }

    /* renamed from: j */
    public boolean mo29081j() {
        return this.f32024i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo29082k() {
        return this.f32035t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo29083m() {
        mo29074d();
        List<ResourceContract> list = this.f32029n;
        if (list == null || list.isEmpty()) {
            m40826l();
        } else {
            new C10778d6(this.f32029n, true, new C11141c());
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.v2$e */
    class C11143e implements C11144f<Void> {
        C11143e() {
        }

        /* renamed from: a */
        public void mo28689a() {
            C11138v2.this.mo29083m();
        }

        /* renamed from: a */
        public void mo28690a(Void voidR) {
            C11138v2.this.mo29083m();
        }
    }

    /* renamed from: f */
    private boolean m40822f(C11013n2 n2Var, SDKConfigurationFormContract sDKConfigurationFormContract) {
        return n2Var.isPoweredByVisible() == sDKConfigurationFormContract.isPoweredByVisible();
    }

    /* renamed from: g */
    private boolean m40823g(C11013n2 n2Var, SDKConfigurationFormContract sDKConfigurationFormContract) {
        return n2Var.mo28824l() == sDKConfigurationFormContract.isPreloaded();
    }

    /* renamed from: h */
    private boolean m40824h(C11013n2 n2Var, SDKConfigurationFormContract sDKConfigurationFormContract) {
        return (n2Var.mo28805g() == null && sDKConfigurationFormContract.getTemplateLocalUrl() == null) || (n2Var.mo28805g() != null && !TextUtils.isEmpty(sDKConfigurationFormContract.getTemplateLocalUrl()) && n2Var.mo28805g().contains(sDKConfigurationFormContract.getTemplateLocalUrl()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo29054a(String str, C11238z3 z3Var) {
        if (str == null || z3Var == null) {
            return null;
        }
        return z3Var.mo29248c().replace(z3Var.mo29249d(), str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public File mo29065b(C11013n2 n2Var) {
        if (n2Var == null) {
            return null;
        }
        String str = "var formJson = " + n2Var.mo28783a() + "; var kpl_formJson = formJson;";
        C10930k2.m39971a(this.f32019d, "kplConfig.submitUrlPrefix = \"" + this.f32020e + "\";kplConfig.submitUrlSuffix = \"" + this.f32021f + "\";");
        C10735b4.m39109b("Form data prepared");
        return C10930k2.m39971a(n2Var.mo28824l() ? this.f32018c : this.f32017b, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo29074d() {
        List<ResourceContract> list = this.f32029n;
        if (list == null || list.isEmpty()) {
            if (C10876i1.m39698a().mo28464a(C10785e0.C10786a.Resource, Boolean.TRUE)) {
                C10930k2.m39970a("resources");
                return;
            }
            return;
        }
        HashMap hashMap = new HashMap();
        for (ResourceContract next : this.f32029n) {
            hashMap.put(next.getRemoteUrl(), next);
        }
        ArrayList<? extends C10785e0> c = C10876i1.m39698a().mo28471c(C10785e0.C10786a.Resource, Boolean.TRUE);
        if (c != null) {
            Iterator<? extends C10785e0> it = c.iterator();
            while (it.hasNext()) {
                ResourceContract resourceContract = (ResourceContract) it.next();
                if (hashMap.get(resourceContract.getRemoteUrl()) == null && C10876i1.m39698a().mo28465a((C10785e0) resourceContract)) {
                    m40809a(resourceContract.getLocalUrl());
                    C10735b4.m39109b("Cleaned global resource: " + resourceContract.getLocalUrl());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public ArrayList<ResourceContract> mo29076e() {
        ArrayList<? extends C10785e0> c = C10876i1.m39698a().mo28471c(C10785e0.C10786a.Resource, new Object[0]);
        ArrayList<ResourceContract> arrayList = new ArrayList<>();
        Iterator<? extends C10785e0> it = c.iterator();
        while (it.hasNext()) {
            ResourceContract resourceContract = (ResourceContract) it.next();
            if (TextUtils.isEmpty(resourceContract.getFormId())) {
                arrayList.add(resourceContract);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo29080i() {
        List<ResourceContract> list = this.f32029n;
        return list == null || list.isEmpty();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo29071c() {
        Activity activity;
        if (!C11164w3.m40939b().mo29120e() || (activity = (Activity) C10884i4.m39721c().mo28484d().getBaseContext()) == null) {
            return false;
        }
        if (!activity.getClass().getName().equals("com.medallia.digital.mobilesdk.MedalliaModalFormActivity") && !activity.getClass().getName().equals("com.medallia.digital.mobilesdk.MedalliaFullFormActivity")) {
            return false;
        }
        activity.finish();
        AnalyticsBridge.getInstance().reportCloseEngagementEvent(MDEngagementType.form.toString(), C10774d3.FORM.toString(), this.f32037v);
        C10735b4.m39113e("Form Closed successfully");
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo29077f(String str) {
        C11013n2 n2Var = this.f32028m.get(str);
        if (n2Var != null && n2Var.mo28796c() == C11013n2.C11014a.AVAILABLE) {
            return false;
        }
        C11013n2 c = mo29070c(str);
        C11162w2 w2Var = this.f32016a;
        if (w2Var == null || c == null) {
            return false;
        }
        return w2Var.mo29109b(c);
    }

    /* renamed from: a */
    private void m40808a() {
        ArrayList<? extends C10785e0> c = C10876i1.m39698a().mo28471c(C10785e0.C10786a.Template, new Object[0]);
        if (c != null) {
            Iterator<? extends C10785e0> it = c.iterator();
            while (it.hasNext()) {
                C10797e7 e7Var = (C10797e7) it.next();
                C10876i1.m39698a().mo28465a((C10785e0) e7Var);
                m40809a(e7Var.mo28263a());
            }
        }
        ArrayList<? extends C10785e0> c2 = C10876i1.m39698a().mo28471c(C10785e0.C10786a.Resource, new Object[0]);
        if (c2 != null) {
            Iterator<? extends C10785e0> it2 = c2.iterator();
            while (it2.hasNext()) {
                ResourceContract resourceContract = (ResourceContract) it2.next();
                if (C10876i1.m39698a().mo28465a((C10785e0) resourceContract)) {
                    m40809a(resourceContract.getLocalUrl());
                }
            }
        }
        ArrayList<? extends C10785e0> c3 = C10876i1.m39698a().mo28471c(C10785e0.C10786a.FormData, new Object[0]);
        if (c3 != null) {
            Iterator<? extends C10785e0> it3 = c3.iterator();
            while (it3.hasNext()) {
                C10876i1.m39698a().mo28465a((C10785e0) (C11013n2) it3.next());
            }
        }
        C10930k2.m39979b("localization.zip");
    }

    /* renamed from: d */
    private boolean m40818d(C11013n2 n2Var, SDKConfigurationFormContract sDKConfigurationFormContract) {
        return (n2Var.getFormType() == null && sDKConfigurationFormContract.getFormType() == null) || (n2Var.getFormType() != null && n2Var.getFormType().equals(sDKConfigurationFormContract.getFormType()));
    }

    /* renamed from: e */
    private boolean m40820e(C11013n2 n2Var, SDKConfigurationFormContract sDKConfigurationFormContract) {
        return ((n2Var.getFormViewType() == null || n2Var.getFormViewType() == FormViewType.none) && sDKConfigurationFormContract.getFormViewType() == null) || (n2Var.getFormViewType() != null && n2Var.getFormViewType().equals(sDKConfigurationFormContract.getFormViewType()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29066b() {
        LinkedHashMap<String, C11013n2> linkedHashMap = this.f32028m;
        if (linkedHashMap != null) {
            linkedHashMap.clear();
        }
        LinkedHashMap<String, C11062q> linkedHashMap2 = this.f32034s;
        if (linkedHashMap2 != null) {
            linkedHashMap2.clear();
        }
        List<ResourceContract> list = this.f32029n;
        if (list != null) {
            list.clear();
        }
        List<ResourceContract> list2 = this.f32030o;
        if (list2 != null) {
            list2.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo29072c(PropertyConfigurationContract propertyConfigurationContract) {
        String str;
        LinkedHashMap<String, C11013n2> linkedHashMap = this.f32028m;
        if (linkedHashMap != null) {
            linkedHashMap.clear();
        }
        LinkedHashMap<String, C11062q> linkedHashMap2 = this.f32034s;
        if (linkedHashMap2 != null) {
            linkedHashMap2.clear();
        }
        this.f32019d = propertyConfigurationContract.getGlobalConfigurationFileLocalUrl();
        this.f32017b = propertyConfigurationContract.getFormJsonFileLocalUrl();
        this.f32018c = propertyConfigurationContract.getPreloadFormJsonFileLocalUrl();
        this.f32031p = propertyConfigurationContract.getProvisions();
        this.f32029n = propertyConfigurationContract.getGlobalResources();
        if (C11221y3.m41127d().mo29223i()) {
            if (propertyConfigurationContract.isLocalizationEnable()) {
                Broadcasts.C10693f.m38951a(C11221y3.m41127d().mo29211a(C11221y3.m41127d().mo29217c(), this.f32026k.mo29246a()) == null ? "Language not available. Language fallback logic applied" : "");
                str = "pre init updateCustomLocale = " + C11221y3.m41127d().mo29215b() + ", isSuccess = " + true;
            } else {
                Broadcasts.C10693f.m38950a(new MDExternalError(MDExternalError.ExternalError.TRANSLATION_FEATURE_IS_DISABLED));
                str = "pre init updateCustomLocale = feature disabled, isSuccess = false";
            }
            C10735b4.m39113e(str);
        }
        List<SDKConfigurationFormContract> forms = propertyConfigurationContract.getForms();
        if (forms == null || forms.size() <= 0) {
            m40808a();
            this.f32024i = true;
            return false;
        }
        for (SDKConfigurationFormContract a : forms) {
            C11013n2 a2 = m40806a(a);
            this.f32028m.put(a2.getFormId(), a2);
        }
        this.f32024i = true;
        return true;
    }

    /* renamed from: c */
    private boolean m40816c(C11013n2 n2Var, SDKConfigurationFormContract sDKConfigurationFormContract) {
        return (n2Var.mo28783a() == null && sDKConfigurationFormContract.getFormJson() == null) || (TextUtils.isEmpty(n2Var.mo28783a()) && sDKConfigurationFormContract.getFormJson() != null && sDKConfigurationFormContract.getFormJson().length() == 0) || !(n2Var.mo28783a() == null || sDKConfigurationFormContract.getFormJson() == null || n2Var.mo28783a().compareTo(sDKConfigurationFormContract.getFormJson().toString()) != 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29055a(ConfigurationContract configurationContract) {
        mo29056a(configurationContract, true, false, (C11145g) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo29067b(ConfigurationContract configurationContract) {
        PropertyConfigurationContract propertyConfiguration;
        C10735b4.m39109b("LoadForms - start updating forms");
        if (configurationContract != null && (propertyConfiguration = configurationContract.getPropertyConfiguration()) != null) {
            C11007m8.m40311b().mo28767a(configurationContract);
            if (configurationContract.getSdkConfiguration() != null) {
                SDKConfigurationContract sdkConfiguration = configurationContract.getSdkConfiguration();
                if (sdkConfiguration.getFormConfigurations() != null) {
                    this.f32022g = sdkConfiguration.getFormConfigurations().getLoadFormIndicatorDelay();
                    this.f32023h = sdkConfiguration.getFormConfigurations().isVulnEnabled();
                    this.f32025j = sdkConfiguration.getFormConfigurations().isInheritOrientation();
                }
                if (sdkConfiguration.getMedalliaDigitalClientConfig() != null) {
                    MedalliaDigitalClientConfigurationContract medalliaDigitalClientConfig = sdkConfiguration.getMedalliaDigitalClientConfig();
                    this.f32021f = medalliaDigitalClientConfig.getSubmitUrlSuffix();
                    this.f32020e = medalliaDigitalClientConfig.getSubmitUrlPrefix();
                }
            }
            this.f32026k = configurationContract.getLocalization();
            this.f32035t = propertyConfiguration.isLocalizationEnable();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29056a(ConfigurationContract configurationContract, boolean z, boolean z2, C11145g gVar) {
        this.f32033r = gVar;
        this.f32036u = z2;
        mo29067b(configurationContract);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29068b(PropertyConfigurationContract propertyConfigurationContract) {
        boolean c = mo29072c(propertyConfigurationContract);
        boolean a = m40810a(propertyConfigurationContract);
        if (c || a) {
            mo29057a((C11144f<Void>) new C11143e());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29057a(C11144f<Void> fVar) {
        C11238z3 z3Var = this.f32026k;
        if (z3Var != null && z3Var.mo29250e() != null && this.f32026k.mo29250e().getRemoteUrl() != null) {
            this.f32030o = new ArrayList();
            if (this.f32026k.mo29250e() != null) {
                this.f32030o.add(this.f32026k.mo29250e());
                this.f32027l = this.f32026k.mo29250e().getLocalUrl();
            }
            if (this.f32026k.mo29251f() != null) {
                this.f32030o.add(this.f32026k.mo29251f());
            }
            if (!this.f32030o.isEmpty()) {
                new C10778d6(this.f32030o, new C11139a(fVar));
            } else if (fVar != null) {
                fVar.mo28689a();
            }
        } else if (fVar != null) {
            fVar.mo28689a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo29069b(SDKConfigurationFormContract sDKConfigurationFormContract) {
        if (TextUtils.isEmpty(sDKConfigurationFormContract.getTemplateRemoteUrl()) || TextUtils.isEmpty(sDKConfigurationFormContract.getTemplateLocalUrl())) {
            return true;
        }
        C10797e7 e7Var = (C10797e7) C10876i1.m39698a().mo28467b(C10785e0.C10786a.Template, sDKConfigurationFormContract.getTemplateRemoteUrl());
        return e7Var != null && e7Var.mo28265b().equals(sDKConfigurationFormContract.getTemplateRemoteUrl());
    }

    /* renamed from: a */
    private void m40809a(String str) {
        Boolean b = C10930k2.m39979b(str);
        if (b != null) {
            AnalyticsBridge.getInstance().reportDeleteStorageEvent(str, b.booleanValue());
        }
    }

    /* renamed from: b */
    private boolean m40814b(C11013n2 n2Var, SDKConfigurationFormContract sDKConfigurationFormContract) {
        return (n2Var.getInviteData() == null && sDKConfigurationFormContract.getInviteData() == null) || !(n2Var.getInviteData() == null || sDKConfigurationFormContract.getInviteData() == null || !n2Var.getInviteData().equals(sDKConfigurationFormContract.getInviteData()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29058a(String str, MDResultCallback mDResultCallback) {
        MDExternalError mDExternalError;
        LinkedHashMap<String, C11013n2> linkedHashMap = this.f32028m;
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            mDExternalError = new MDExternalError(MDExternalError.ExternalError.FORM_NOT_EXISTS_OR_NOT_PUBLISH);
        } else {
            C11013n2 n2Var = this.f32028m.get(str);
            this.f32037v = str;
            if (n2Var == null || n2Var.mo28796c() == C11013n2.C11014a.NOT_EXISTS) {
                mDExternalError = new MDExternalError(MDExternalError.ExternalError.FORM_NOT_EXISTS_OR_NOT_PUBLISH);
            } else if (n2Var.mo28796c() == C11013n2.C11014a.NOT_STARTED) {
                mo29077f(str);
                mDExternalError = new MDExternalError(MDExternalError.ExternalError.FORM_IS_NOT_AVAILABLE);
            } else if (n2Var.mo28796c() == C11013n2.C11014a.IN_PROGRESS || n2Var.mo28796c() == C11013n2.C11014a.FAILED) {
                mDExternalError = new MDExternalError(MDExternalError.ExternalError.FORM_IS_NOT_AVAILABLE);
            } else {
                if (n2Var.mo28796c() == C11013n2.C11014a.AVAILABLE) {
                    if (mo29061a(n2Var) || !C11164w3.m40939b().mo29120e()) {
                        mo29065b(n2Var);
                        if (n2Var.mo28824l() && C11007m8.m40311b().mo28774c(MedalliaWebView.C10705f.preload) == null) {
                            C10735b4.m39111c("Preload form wasn't loaded yet");
                        }
                        C11007m8.m40311b().mo28772a(n2Var, (MedalliaWebView.C10704e) null, n2Var.mo28824l() ? MedalliaWebView.C10705f.preload : MedalliaWebView.C10705f.showForm);
                        Intent intent = new Intent(C10884i4.m39721c().mo28483b(), n2Var.getFormViewType() == FormViewType.modal ? MedalliaModalFormActivity.class : MedalliaFullFormActivity.class);
                        intent.addFlags(268435456);
                        intent.putExtra("com.medallia.digital.mobilesdk.form_data", n2Var);
                        intent.putExtra("com.medallia.digital.mobilesdk.is_show_form", true);
                        intent.putExtra("com.medallia.digital.mobilesdk.spinner_delay", this.f32022g);
                        intent.putExtra("com.medallia.digital.mobilesdk.vuln_enabled", this.f32023h);
                        intent.putExtra("com.medallia.digital.mobilesdk.inherit_orientation", this.f32025j);
                        C10884i4.m39721c().mo28483b().startActivity(intent);
                        C10735b4.m39113e("Form shown successfully");
                        if (mDResultCallback != null) {
                            mDResultCallback.onSuccess();
                        }
                        AnalyticsBridge.getInstance().reportShowFormCallbackEvent(AnalyticsBridge.C10665c.success, (Integer) null, (String) null);
                    } else {
                        mDExternalError = new MDExternalError(MDExternalError.ExternalError.FORM_IS_ALREADY_DISPLAYED);
                    }
                }
                mDExternalError = null;
            }
        }
        if (mDExternalError != null) {
            C10735b4.m39111c(mDExternalError.getMessage());
            if (mDResultCallback != null) {
                mDResultCallback.onError(mDExternalError);
            }
            AnalyticsBridge.getInstance().reportShowFormCallbackEvent(AnalyticsBridge.C10665c.failure, Integer.valueOf(mDExternalError.getErrorCode()), mDExternalError.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29059a(String str, C10954l2 l2Var) {
        if (mo29077f(str)) {
            this.f32032q.put(str, l2Var);
            C10735b4.m39113e("Promoting form: " + str);
            return;
        }
        l2Var.onSuccess();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29060a(String str, C11144f<JSONObject> fVar) {
        if (this.f32027l == null) {
            if (fVar != null) {
                fVar.mo28689a();
            }
            C10735b4.m39113e("UpdateCustomLocale = localizationFilePath is missing, isSuccess = false");
            return;
        }
        C11004m7.m40304b().mo28763a().execute(new C11140b(fVar, str));
    }

    /* renamed from: a */
    private boolean m40810a(PropertyConfigurationContract propertyConfigurationContract) {
        if (propertyConfigurationContract == null) {
            return false;
        }
        List<AppRatingContract> appRatings = propertyConfigurationContract.getAppRatings();
        LinkedHashMap<String, C11062q> linkedHashMap = this.f32034s;
        if (linkedHashMap != null) {
            linkedHashMap.clear();
        } else {
            this.f32034s = new LinkedHashMap<>();
        }
        if (appRatings == null || appRatings.size() <= 0) {
            return false;
        }
        for (AppRatingContract qVar : appRatings) {
            C11062q qVar2 = new C11062q(qVar);
            this.f32034s.put(qVar2.mo28920a(), qVar2);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo29061a(C11013n2 n2Var) {
        return n2Var.getFormType() == FormTriggerType.mobileInvitation && n2Var.getInviteData() != null && n2Var.getInviteData().getType() == InviteData.C10698a.PUSH_NOTIFICATION;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo29062a(C11013n2 n2Var, SDKConfigurationFormContract sDKConfigurationFormContract) {
        if (n2Var == null || sDKConfigurationFormContract == null) {
            return false;
        }
        return m40824h(n2Var, sDKConfigurationFormContract) && m40812a(n2Var.getTitle(), sDKConfigurationFormContract.getTitle()) && m40812a(n2Var.getTitleBackgroundColor(), sDKConfigurationFormContract.getTitleBackgroundColor()) && m40812a(n2Var.getTitleTextColor(), sDKConfigurationFormContract.getTitleTextColor()) && m40816c(n2Var, sDKConfigurationFormContract) && m40818d(n2Var, sDKConfigurationFormContract) && m40820e(n2Var, sDKConfigurationFormContract) && m40814b(n2Var, sDKConfigurationFormContract) && m40823g(n2Var, sDKConfigurationFormContract) && m40822f(n2Var, sDKConfigurationFormContract);
    }

    /* renamed from: a */
    private boolean m40812a(String str, String str2) {
        return (str == null && str2 == null) || (str != null && str.equals(str2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo29063a(List<ResourceContract> list, List<ResourceContract> list2) {
        if (list == null || list.isEmpty()) {
            return list2 == null || list2.isEmpty();
        }
        if (list2 == null) {
            for (ResourceContract next : list) {
                C10876i1.m39698a().mo28465a((C10785e0) next);
                m40809a(next.getLocalUrl());
            }
            return true;
        } else if (list2.size() > list.size()) {
            return false;
        } else {
            HashMap hashMap = new HashMap();
            for (ResourceContract next2 : list2) {
                hashMap.put(next2.getRemoteUrl(), next2);
            }
            for (ResourceContract next3 : list) {
                ResourceContract resourceContract = (ResourceContract) hashMap.get(next3.getRemoteUrl());
                if (resourceContract == null) {
                    C10876i1.m39698a().mo28465a((C10785e0) next3);
                    m40809a(next3.getLocalUrl());
                } else if (resourceContract.getChecksum().equals(next3.getChecksum())) {
                    hashMap.remove(next3.getRemoteUrl());
                }
            }
            return hashMap.isEmpty();
        }
    }
}

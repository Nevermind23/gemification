package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C10785e0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.medallia.digital.mobilesdk.n2 */
public class C11013n2 extends C10785e0 implements Serializable {

    /* renamed from: A */
    private static final int f31622A = 31;

    /* renamed from: a */
    private final String f31623a;

    /* renamed from: b */
    private final String f31624b;

    /* renamed from: c */
    private String f31625c;

    /* renamed from: d */
    private String f31626d;

    /* renamed from: e */
    private String f31627e;

    /* renamed from: f */
    private List<ResourceContract> f31628f;

    /* renamed from: g */
    private String f31629g;

    /* renamed from: h */
    private String f31630h;

    /* renamed from: i */
    private String f31631i;

    /* renamed from: j */
    private FormTriggerType f31632j;

    /* renamed from: k */
    private C11014a f31633k;

    /* renamed from: l */
    private C11080r7 f31634l;

    /* renamed from: m */
    private InviteData f31635m;

    /* renamed from: n */
    private FormViewType f31636n;

    /* renamed from: o */
    private boolean f31637o;

    /* renamed from: p */
    private String f31638p;

    /* renamed from: q */
    private C10841g7 f31639q;

    /* renamed from: r */
    private boolean f31640r;

    /* renamed from: s */
    private boolean f31641s;

    /* renamed from: t */
    private ArrayList<String> f31642t = new ArrayList<>();

    /* renamed from: u */
    private String f31643u;

    /* renamed from: v */
    private String f31644v;

    /* renamed from: w */
    private boolean f31645w;

    /* renamed from: x */
    private String f31646x;

    /* renamed from: y */
    private boolean f31647y;

    /* renamed from: z */
    private MDAppearanceMode f31648z;

    /* renamed from: com.medallia.digital.mobilesdk.n2$a */
    protected enum C11014a {
        NOT_EXISTS(0),
        NOT_STARTED(1),
        IN_PROGRESS(2),
        AVAILABLE(3),
        FAILED(4);
        

        /* renamed from: a */
        private final int f31655a;

        private C11014a(int i) {
            this.f31655a = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo28826a() {
            return this.f31655a;
        }

        /* renamed from: a */
        protected static C11014a m40364a(int i) {
            for (C11014a aVar : values()) {
                if (aVar.mo28826a() == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public C11013n2(SDKConfigurationFormContract sDKConfigurationFormContract) {
        this.f31623a = sDKConfigurationFormContract.getFormId();
        this.f31624b = sDKConfigurationFormContract.getName();
        this.f31625c = sDKConfigurationFormContract.getFormJson().toString();
        this.f31626d = sDKConfigurationFormContract.getTemplateLocalUrl();
        this.f31627e = sDKConfigurationFormContract.getTemplateRemoteUrl();
        this.f31629g = sDKConfigurationFormContract.getTitle();
        this.f31630h = sDKConfigurationFormContract.getTitleTextColor();
        this.f31631i = sDKConfigurationFormContract.getTitleBackgroundColor();
        this.f31632j = sDKConfigurationFormContract.getFormType();
        this.f31633k = C11014a.NOT_STARTED;
        this.f31634l = ModelFactory.getInstance().createTransitionType(this.f31625c);
        this.f31635m = sDKConfigurationFormContract.getInviteData();
        this.f31636n = sDKConfigurationFormContract.getFormViewType() != null ? sDKConfigurationFormContract.getFormViewType() : FormViewType.none;
        this.f31637o = sDKConfigurationFormContract.isPreloaded();
        this.f31638p = sDKConfigurationFormContract.getFormLanguage();
        mo28791a(sDKConfigurationFormContract.getResources());
        this.f31640r = sDKConfigurationFormContract.isPoweredByVisible();
        this.f31639q = ModelFactory.getInstance().createThankYouDataObject(this.f31625c);
        m40335m();
        this.f31643u = sDKConfigurationFormContract.getTemplateDebugRemoteUrl();
        this.f31644v = sDKConfigurationFormContract.getUrlVersion();
        this.f31646x = sDKConfigurationFormContract.getHeaderThemeName();
        this.f31647y = sDKConfigurationFormContract.isDarkModeEnabled();
    }

    /* renamed from: m */
    private void m40335m() {
        if (this.f31633k != null) {
            C10735b4.m39109b("FormId: " + this.f31623a + ", FormStatus : " + this.f31633k.name());
        }
    }

    /* renamed from: a */
    public String mo28783a() {
        return this.f31625c;
    }

    /* renamed from: b */
    public String mo28793b() {
        return this.f31624b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C11014a mo28796c() {
        if (this.f31633k == null) {
            this.f31633k = C11014a.NOT_STARTED;
        }
        return this.f31633k;
    }

    /* renamed from: d */
    public MDAppearanceMode mo28799d() {
        return this.f31648z;
    }

    /* renamed from: e */
    public ArrayList<String> mo28801e() {
        return this.f31642t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11013n2 n2Var = (C11013n2) obj;
        String str = this.f31623a;
        if (str == null ? n2Var.f31623a != null : !str.equals(n2Var.f31623a)) {
            return false;
        }
        String str2 = this.f31624b;
        if (str2 == null ? n2Var.f31624b != null : !str2.equals(n2Var.f31624b)) {
            return false;
        }
        String str3 = this.f31625c;
        if (str3 == null ? n2Var.f31625c != null : !str3.equals(n2Var.f31625c)) {
            return false;
        }
        String str4 = this.f31626d;
        if (str4 == null ? n2Var.f31626d != null : !str4.equals(n2Var.f31626d)) {
            return false;
        }
        String str5 = this.f31627e;
        if (str5 == null ? n2Var.f31627e != null : !str5.equals(n2Var.f31627e)) {
            return false;
        }
        List<ResourceContract> list = this.f31628f;
        if (list == null ? n2Var.f31628f != null : !list.equals(n2Var.f31628f)) {
            return false;
        }
        String str6 = this.f31629g;
        if (str6 == null ? n2Var.f31629g != null : !str6.equals(n2Var.f31629g)) {
            return false;
        }
        String str7 = this.f31630h;
        if (str7 == null ? n2Var.f31630h != null : !str7.equals(n2Var.f31630h)) {
            return false;
        }
        String str8 = this.f31631i;
        if (str8 == null ? n2Var.f31631i != null : !str8.equals(n2Var.f31631i)) {
            return false;
        }
        FormTriggerType formTriggerType = this.f31632j;
        if (formTriggerType == null ? n2Var.f31632j != null : !formTriggerType.equals(n2Var.f31632j)) {
            return false;
        }
        if (this.f31637o != n2Var.f31637o || this.f31640r != n2Var.f31640r) {
            return false;
        }
        C10841g7 g7Var = this.f31639q;
        if (g7Var == null ? n2Var.f31639q != null : !g7Var.equals(n2Var.f31639q)) {
            return false;
        }
        String str9 = this.f31643u;
        if (str9 == null ? n2Var.f31643u != null : !str9.equals(n2Var.f31643u)) {
            return false;
        }
        String str10 = this.f31644v;
        if (str10 == null ? n2Var.f31644v != null : !str10.equals(n2Var.f31644v)) {
            return false;
        }
        String str11 = this.f31646x;
        if (str11 == null ? n2Var.f31646x != null : !str11.equals(n2Var.f31646x)) {
            return false;
        }
        if (this.f31647y != n2Var.f31647y) {
            return false;
        }
        return this.f31634l == n2Var.f31634l && this.f31633k == n2Var.f31633k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public List<ResourceContract> mo28804f() {
        return this.f31628f;
    }

    /* renamed from: g */
    public String mo28805g() {
        if (this.f31626d == null) {
            this.f31626d = "";
        }
        return this.f31626d;
    }

    /* access modifiers changed from: protected */
    public C10785e0.C10786a getDataTableObjectType() {
        return C10785e0.C10786a.FormData;
    }

    /* access modifiers changed from: protected */
    public String getFormId() {
        return this.f31623a;
    }

    /* access modifiers changed from: protected */
    public String getFormLanguage() {
        return this.f31638p;
    }

    /* access modifiers changed from: protected */
    public FormTriggerType getFormType() {
        return this.f31632j;
    }

    /* access modifiers changed from: protected */
    public FormViewType getFormViewType() {
        return this.f31636n;
    }

    public String getHeaderThemeName() {
        return this.f31646x;
    }

    public InviteData getInviteData() {
        return this.f31635m;
    }

    /* access modifiers changed from: protected */
    public String getTemplateDebugRemoteUrl() {
        if (this.f31643u == null) {
            this.f31643u = "";
        }
        return this.f31643u;
    }

    /* access modifiers changed from: protected */
    public String getTitle() {
        return this.f31629g;
    }

    /* access modifiers changed from: protected */
    public String getTitleBackgroundColor() {
        return this.f31631i;
    }

    /* access modifiers changed from: protected */
    public String getTitleTextColor() {
        return this.f31630h;
    }

    /* access modifiers changed from: protected */
    public String getUrlVersion() {
        return this.f31644v;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String mo28817h() {
        if (this.f31627e == null) {
            this.f31627e = "";
        }
        return this.f31627e;
    }

    public int hashCode() {
        String str = this.f31623a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f31624b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f31625c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f31626d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f31627e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<ResourceContract> list = this.f31628f;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        String str6 = this.f31629g;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f31630h;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f31631i;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        FormTriggerType formTriggerType = this.f31632j;
        int hashCode10 = (hashCode9 + (formTriggerType != null ? formTriggerType.hashCode() : 0)) * 31;
        C11014a aVar = this.f31633k;
        int hashCode11 = (hashCode10 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C11080r7 r7Var = this.f31634l;
        int hashCode12 = (hashCode11 + (r7Var != null ? r7Var.hashCode() : 0)) * 31;
        FormViewType formViewType = this.f31636n;
        int hashCode13 = (((((hashCode12 + (formViewType != null ? formViewType.hashCode() : 0)) * 31) + Boolean.valueOf(this.f31637o).hashCode()) * 31) + Boolean.valueOf(this.f31640r).hashCode()) * 31;
        C10841g7 g7Var = this.f31639q;
        int hashCode14 = (hashCode13 + (g7Var != null ? g7Var.hashCode() : 0)) * 31;
        String str9 = this.f31646x;
        int hashCode15 = (((hashCode14 + (str9 != null ? str9.hashCode() : 0)) * 31) + Boolean.valueOf(this.f31647y).hashCode()) * 31;
        String str10 = this.f31643u;
        int hashCode16 = (hashCode15 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f31644v;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return hashCode16 + i;
    }

    /* renamed from: i */
    public C10841g7 mo28819i() {
        return this.f31639q;
    }

    public boolean isDarkModeEnabled() {
        return this.f31647y;
    }

    /* access modifiers changed from: protected */
    public boolean isPoweredByVisible() {
        return this.f31640r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C11080r7 mo28822j() {
        C11080r7 r7Var = this.f31634l;
        return r7Var == null ? C11080r7.Fade : r7Var;
    }

    /* renamed from: k */
    public boolean mo28823k() {
        return this.f31641s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo28824l() {
        return this.f31637o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo28825n() {
        return this.f31645w;
    }

    protected C11013n2(String str, String str2, String str3, String str4, String str5, List<ResourceContract> list, String str6, String str7, String str8, FormTriggerType formTriggerType, C11014a aVar, C11080r7 r7Var, InviteData inviteData, FormViewType formViewType, boolean z, String str9, boolean z2, C10841g7 g7Var, boolean z3, ArrayList<String> arrayList, String str10, String str11, boolean z4, String str12, boolean z5) {
        this.f31623a = str;
        this.f31624b = str2;
        this.f31625c = str3;
        this.f31626d = str4;
        this.f31627e = str5;
        this.f31629g = str6;
        this.f31630h = str7;
        this.f31631i = str8;
        this.f31632j = formTriggerType;
        this.f31633k = aVar;
        this.f31634l = r7Var;
        this.f31635m = inviteData;
        this.f31636n = formViewType != null ? formViewType : FormViewType.none;
        this.f31637o = z;
        this.f31638p = str9;
        this.f31639q = g7Var;
        this.f31640r = z2;
        this.f31642t = arrayList;
        this.f31641s = z3;
        this.f31643u = str10;
        this.f31644v = str11;
        this.f31645w = z4;
        this.f31646x = str12;
        this.f31647y = z5;
        List<ResourceContract> list2 = list;
        mo28791a(list);
        m40335m();
    }

    /* renamed from: a */
    public void mo28784a(InviteData inviteData) {
        this.f31635m = inviteData;
    }

    /* renamed from: b */
    public void mo28794b(String str) {
        this.f31638p = str;
    }

    /* renamed from: c */
    public void mo28797c(String str) {
        this.f31626d = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo28800d(String str) {
        this.f31627e = str;
    }

    /* renamed from: e */
    public void mo28802e(String str) {
        this.f31629g = str;
    }

    /* renamed from: a */
    public void mo28785a(MDAppearanceMode mDAppearanceMode) {
        this.f31648z = mDAppearanceMode;
    }

    /* renamed from: b */
    public void mo28795b(boolean z) {
        this.f31640r = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo28798c(boolean z) {
        this.f31645w = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28786a(SDKConfigurationFormContract sDKConfigurationFormContract) {
        if (sDKConfigurationFormContract != null) {
            this.f31629g = sDKConfigurationFormContract.getTitle();
            this.f31631i = sDKConfigurationFormContract.getTitleBackgroundColor();
            this.f31630h = sDKConfigurationFormContract.getTitleTextColor();
            this.f31625c = sDKConfigurationFormContract.getFormJson().toString();
            this.f31632j = sDKConfigurationFormContract.getFormType();
            this.f31636n = sDKConfigurationFormContract.getFormViewType() != null ? sDKConfigurationFormContract.getFormViewType() : FormViewType.none;
            this.f31634l = ModelFactory.getInstance().createTransitionType(this.f31625c);
            this.f31635m = sDKConfigurationFormContract.getInviteData();
            this.f31637o = sDKConfigurationFormContract.isPreloaded();
            this.f31638p = sDKConfigurationFormContract.getFormLanguage();
            this.f31639q = ModelFactory.getInstance().createThankYouDataObject(this.f31625c);
            this.f31640r = sDKConfigurationFormContract.isPoweredByVisible();
            this.f31643u = sDKConfigurationFormContract.getTemplateDebugRemoteUrl();
            this.f31644v = sDKConfigurationFormContract.getUrlVersion();
            this.f31647y = sDKConfigurationFormContract.isDarkModeEnabled();
            this.f31646x = sDKConfigurationFormContract.getHeaderThemeName();
        }
    }

    /* renamed from: a */
    public void mo28787a(C10841g7 g7Var) {
        this.f31639q = g7Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28788a(C11014a aVar) {
        this.f31633k = aVar;
        m40335m();
    }

    /* renamed from: a */
    public void mo28789a(String str) {
        this.f31625c = str;
    }

    /* renamed from: a */
    public void mo28790a(ArrayList<String> arrayList) {
        this.f31642t = arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28791a(List<ResourceContract> list) {
        this.f31628f = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (ResourceContract next : list) {
                next.setFormId(this.f31623a);
                this.f31628f.add(next);
            }
        }
    }

    /* renamed from: a */
    public void mo28792a(boolean z) {
        this.f31641s = z;
    }
}

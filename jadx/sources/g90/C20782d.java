package g90;

import com.salesforce.marketingcloud.C11398b;
import f90.C20454a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.IncomeType;
import x80.C29657a;

/* renamed from: g90.d */
public final class C20782d {

    /* renamed from: a */
    private final String f55997a;

    /* renamed from: b */
    private final String f55998b;

    /* renamed from: c */
    private final C20781c f55999c;

    /* renamed from: d */
    private final boolean f56000d;

    /* renamed from: e */
    private final IncomeType f56001e;

    /* renamed from: f */
    private final LookupUiModel f56002f;

    /* renamed from: g */
    private String f56003g;

    /* renamed from: h */
    private String f56004h;

    /* renamed from: i */
    private String f56005i;

    /* renamed from: j */
    private String f56006j;

    /* renamed from: k */
    private String f56007k;

    /* renamed from: l */
    private LookupUiModel f56008l;

    /* renamed from: m */
    private String f56009m;

    public C20782d(String str, String str2, C20781c cVar, boolean z, IncomeType incomeType, LookupUiModel lookupUiModel, String str3, String str4, String str5, String str6, String str7, LookupUiModel lookupUiModel2, String str8) {
        C41536l.m120489i(str2, "localId");
        C41536l.m120489i(cVar, "editMode");
        C41536l.m120489i(incomeType, "incomeType");
        this.f55997a = str;
        this.f55998b = str2;
        this.f55999c = cVar;
        this.f56000d = z;
        this.f56001e = incomeType;
        this.f56002f = lookupUiModel;
        this.f56003g = str3;
        this.f56004h = str4;
        this.f56005i = str5;
        this.f56006j = str6;
        this.f56007k = str7;
        this.f56008l = lookupUiModel2;
        this.f56009m = str8;
    }

    /* renamed from: a */
    public final String mo49335a() {
        return this.f56009m;
    }

    /* renamed from: b */
    public final String mo49336b() {
        return this.f55997a;
    }

    /* renamed from: c */
    public final String mo49337c() {
        return this.f56004h;
    }

    /* renamed from: d */
    public final C20781c mo49338d() {
        return this.f55999c;
    }

    /* renamed from: e */
    public final String mo49339e() {
        return this.f56003g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20782d)) {
            return false;
        }
        C20782d dVar = (C20782d) obj;
        return C41536l.m120484d(this.f55997a, dVar.f55997a) && C41536l.m120484d(this.f55998b, dVar.f55998b) && this.f55999c == dVar.f55999c && this.f56000d == dVar.f56000d && C41536l.m120484d(this.f56001e, dVar.f56001e) && C41536l.m120484d(this.f56002f, dVar.f56002f) && C41536l.m120484d(this.f56003g, dVar.f56003g) && C41536l.m120484d(this.f56004h, dVar.f56004h) && C41536l.m120484d(this.f56005i, dVar.f56005i) && C41536l.m120484d(this.f56006j, dVar.f56006j) && C41536l.m120484d(this.f56007k, dVar.f56007k) && C41536l.m120484d(this.f56008l, dVar.f56008l) && C41536l.m120484d(this.f56009m, dVar.f56009m);
    }

    /* renamed from: f */
    public final IncomeType mo49341f() {
        return this.f56001e;
    }

    /* renamed from: g */
    public final LookupUiModel mo49342g() {
        return this.f56002f;
    }

    /* renamed from: h */
    public final LookupUiModel mo49343h() {
        return this.f56008l;
    }

    public int hashCode() {
        String str = this.f55997a;
        int i = 0;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.f55998b.hashCode()) * 31) + this.f55999c.hashCode()) * 31;
        boolean z = this.f56000d;
        if (z) {
            z = true;
        }
        int hashCode2 = (((hashCode + (z ? 1 : 0)) * 31) + this.f56001e.hashCode()) * 31;
        LookupUiModel lookupUiModel = this.f56002f;
        int hashCode3 = (hashCode2 + (lookupUiModel == null ? 0 : lookupUiModel.hashCode())) * 31;
        String str2 = this.f56003g;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f56004h;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f56005i;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f56006j;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f56007k;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        LookupUiModel lookupUiModel2 = this.f56008l;
        int hashCode9 = (hashCode8 + (lookupUiModel2 == null ? 0 : lookupUiModel2.hashCode())) * 31;
        String str7 = this.f56009m;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode9 + i;
    }

    /* renamed from: i */
    public final String mo49345i() {
        return this.f55998b;
    }

    /* renamed from: j */
    public final String mo49346j() {
        return this.f56007k;
    }

    /* renamed from: k */
    public final String mo49347k() {
        return this.f56006j;
    }

    /* renamed from: l */
    public final String mo49348l() {
        return this.f56005i;
    }

    /* renamed from: m */
    public final boolean mo49349m() {
        return C20454a.f55451a.mo48971a(this);
    }

    /* renamed from: n */
    public final boolean mo49350n() {
        return this.f56000d;
    }

    /* renamed from: o */
    public final C29657a mo49351o() {
        String str;
        String str2;
        String str3 = this.f55997a;
        LookupUiModel lookupUiModel = this.f56002f;
        if (lookupUiModel != null) {
            str = lookupUiModel.mo52393d();
        } else {
            str = null;
        }
        String str4 = this.f56003g;
        String str5 = this.f56004h;
        String str6 = this.f56005i;
        String str7 = this.f56006j;
        String str8 = this.f56007k;
        LookupUiModel lookupUiModel2 = this.f56008l;
        if (lookupUiModel2 != null) {
            str2 = lookupUiModel2.mo52393d();
        } else {
            str2 = null;
        }
        return new C29657a(str3, str, str4, str5, str6, str7, str8, str2, this.f56009m, (String) null, C11398b.f33140s, (DefaultConstructorMarker) null);
    }

    public String toString() {
        String str = this.f55997a;
        String str2 = this.f55998b;
        C20781c cVar = this.f55999c;
        boolean z = this.f56000d;
        IncomeType incomeType = this.f56001e;
        LookupUiModel lookupUiModel = this.f56002f;
        String str3 = this.f56003g;
        String str4 = this.f56004h;
        String str5 = this.f56005i;
        String str6 = this.f56006j;
        String str7 = this.f56007k;
        LookupUiModel lookupUiModel2 = this.f56008l;
        String str8 = this.f56009m;
        return "Income(criId=" + str + ", localId=" + str2 + ", editMode=" + cVar + ", isRemovable=" + z + ", incomeType=" + incomeType + ", incomeTypeLookup=" + lookupUiModel + ", incomeAmount=" + str3 + ", currency=" + str4 + ", organizationName=" + str5 + ", organizationIdentificationCode=" + str6 + ", organizationAddress=" + str7 + ", jobPosition=" + lookupUiModel2 + ", country=" + str8 + ")";
    }
}

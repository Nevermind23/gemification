package pe0;

import ef0.C20227b;
import ef0.C20229d;
import ef0.C20231f;
import ef0.C20232g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.FundingSourcesApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.InvestorInfoApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.OnboardingListOfValuesApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.SubTypeApiModel;

/* renamed from: pe0.a */
public final class C27519a {
    /* renamed from: f */
    private final C20231f m85315f(SubTypeApiModel subTypeApiModel) {
        return new C20231f(subTypeApiModel.getId(), subTypeApiModel.getName(), subTypeApiModel.isDefault());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: ef0.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: ef0.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: ef0.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: ef0.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ef0.C20226a mo66834a(p341ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.EmploymentInfoApiModel r13) {
        /*
            r12 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.C41536l.m120489i(r13, r0)
            java.util.List r0 = r13.getOccupationStatusLOV()
            java.util.ArrayList r3 = new java.util.ArrayList
            r1 = 10
            int r2 = ie1.C41343r.m119925u(r0, r1)
            r3.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002c
            java.lang.Object r2 = r0.next()
            ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.SubTypeApiModel r2 = (p341ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.SubTypeApiModel) r2
            ef0.f r2 = r12.m85315f(r2)
            r3.add(r2)
            goto L_0x0018
        L_0x002c:
            java.util.List r0 = r13.getSectorLOV()
            java.util.ArrayList r6 = new java.util.ArrayList
            int r2 = ie1.C41343r.m119925u(r0, r1)
            r6.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x003d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0051
            java.lang.Object r2 = r0.next()
            ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.SubTypeApiModel r2 = (p341ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.SubTypeApiModel) r2
            ef0.f r2 = r12.m85315f(r2)
            r6.add(r2)
            goto L_0x003d
        L_0x0051:
            java.util.List r0 = r13.getPositionLOV()
            java.util.ArrayList r8 = new java.util.ArrayList
            int r1 = ie1.C41343r.m119925u(r0, r1)
            r8.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0062:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0076
            java.lang.Object r1 = r0.next()
            ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.SubTypeApiModel r1 = (p341ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.SubTypeApiModel) r1
            ef0.f r1 = r12.m85315f(r1)
            r8.add(r1)
            goto L_0x0062
        L_0x0076:
            java.util.Iterator r0 = r3.iterator()
        L_0x007a:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0097
            java.lang.Object r1 = r0.next()
            r4 = r1
            ef0.f r4 = (ef0.C20231f) r4
            java.lang.String r4 = r4.mo48696a()
            java.lang.String r5 = r13.getOccupationStatusValue()
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r4 == 0) goto L_0x007a
            goto L_0x0098
        L_0x0097:
            r1 = r2
        L_0x0098:
            r0 = r1
            ef0.f r0 = (ef0.C20231f) r0
            java.lang.String r4 = r13.getEmployerNameValue()
            java.util.Iterator r1 = r6.iterator()
        L_0x00a3:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x00bf
            java.lang.Object r5 = r1.next()
            r7 = r5
            ef0.f r7 = (ef0.C20231f) r7
            java.lang.String r7 = r7.mo48696a()
            java.lang.String r9 = r13.getSectorValue()
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)
            if (r7 == 0) goto L_0x00a3
            goto L_0x00c0
        L_0x00bf:
            r5 = r2
        L_0x00c0:
            ef0.f r5 = (ef0.C20231f) r5
            java.util.Iterator r1 = r8.iterator()
        L_0x00c6:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00e2
            java.lang.Object r7 = r1.next()
            r9 = r7
            ef0.f r9 = (ef0.C20231f) r9
            java.lang.String r9 = r9.mo48696a()
            java.lang.String r10 = r13.getPositionValue()
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r9, r10)
            if (r9 == 0) goto L_0x00c6
            r2 = r7
        L_0x00e2:
            r7 = r2
            ef0.f r7 = (ef0.C20231f) r7
            boolean r9 = r13.getBrokerValue()
            java.lang.String r10 = r13.getDirectorOfNameValue()
            java.lang.String r11 = r13.getDirectorOfSymbolValue()
            ef0.a r13 = new ef0.a
            r1 = r13
            r2 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: pe0.C27519a.mo66834a(ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.EmploymentInfoApiModel):ef0.a");
    }

    /* renamed from: b */
    public final C20227b mo66835b(FundingSourcesApiModel fundingSourcesApiModel) {
        Object obj;
        C41536l.m120489i(fundingSourcesApiModel, "data");
        List<SubTypeApiModel> fundingSourcesLOV = fundingSourcesApiModel.getFundingSourcesLOV();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(fundingSourcesLOV, 10));
        for (SubTypeApiModel f : fundingSourcesLOV) {
            arrayList.add(m85315f(f));
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((C20231f) obj).mo48696a(), fundingSourcesApiModel.getFundingSourcesValue())) {
                break;
            }
        }
        return new C20227b((C20231f) obj, arrayList);
    }

    /* renamed from: c */
    public final C20229d mo66836c(InvestorInfoApiModel investorInfoApiModel) {
        C41536l.m120489i(investorInfoApiModel, "data");
        return new C20229d(investorInfoApiModel.getAnnualIncomeValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: ef0.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: ef0.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: ef0.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: ef0.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ef0.C20230e mo66837d(p341ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.ReviewDataApiModel r23, ef0.C20232g r24) {
        /*
            r22 = this;
            java.lang.String r0 = "data"
            r1 = r23
            kotlin.jvm.internal.C41536l.m120489i(r1, r0)
            java.lang.String r0 = "userInfo"
            r2 = r24
            kotlin.jvm.internal.C41536l.m120489i(r2, r0)
            ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.BasicInfoApiModel r0 = r23.getBasicInfo()
            r3 = 0
            if (r0 == 0) goto L_0x001a
            java.lang.String r0 = r0.getFirstName()
            goto L_0x001b
        L_0x001a:
            r0 = r3
        L_0x001b:
            ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.BasicInfoApiModel r4 = r23.getBasicInfo()
            if (r4 == 0) goto L_0x0026
            java.lang.String r4 = r4.getLastName()
            goto L_0x0027
        L_0x0026:
            r4 = r3
        L_0x0027:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = " "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r7 = r5.toString()
            ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.IdentificationInfoApiModel r0 = r23.getIdentificationInfo()
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = r0.getValue()
            r8 = r0
            goto L_0x0048
        L_0x0047:
            r8 = r3
        L_0x0048:
            ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.PersonalInfoApiModel r0 = r23.getPersonalInfo()
            if (r0 == 0) goto L_0x0054
            java.lang.Integer r0 = r0.getBirthYear()
            r9 = r0
            goto L_0x0055
        L_0x0054:
            r9 = r3
        L_0x0055:
            ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.PersonalInfoApiModel r0 = r23.getPersonalInfo()
            if (r0 == 0) goto L_0x0061
            java.lang.Integer r0 = r0.getBirthMonth()
            r10 = r0
            goto L_0x0062
        L_0x0061:
            r10 = r3
        L_0x0062:
            ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.PersonalInfoApiModel r0 = r23.getPersonalInfo()
            if (r0 == 0) goto L_0x006e
            java.lang.Integer r0 = r0.getBirthDay()
            r11 = r0
            goto L_0x006f
        L_0x006e:
            r11 = r3
        L_0x006f:
            ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.PersonalInfoApiModel r0 = r23.getPersonalInfo()
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = r0.getGender()
            r12 = r0
            goto L_0x007c
        L_0x007b:
            r12 = r3
        L_0x007c:
            ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.IdentificationInfoApiModel r0 = r23.getIdentificationInfo()
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = r0.getCitizenship()
            r13 = r0
            goto L_0x0089
        L_0x0088:
            r13 = r3
        L_0x0089:
            ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.AddressApiModel r0 = r23.getJuridicalAddress()
            if (r0 == 0) goto L_0x0095
            java.lang.String r0 = r0.getCity()
            r14 = r0
            goto L_0x0096
        L_0x0095:
            r14 = r3
        L_0x0096:
            ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.AddressApiModel r0 = r23.getJuridicalAddress()
            if (r0 == 0) goto L_0x00a2
            java.lang.String r0 = r0.getStreet1()
            r15 = r0
            goto L_0x00a3
        L_0x00a2:
            r15 = r3
        L_0x00a3:
            ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.BasicInfoApiModel r0 = r23.getBasicInfo()
            if (r0 == 0) goto L_0x00b0
            java.lang.String r0 = r0.getEmailAddress()
            r16 = r0
            goto L_0x00b2
        L_0x00b0:
            r16 = r3
        L_0x00b2:
            ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.BasicInfoApiModel r0 = r23.getBasicInfo()
            if (r0 == 0) goto L_0x00bf
            java.lang.String r0 = r0.getPhone()
            r17 = r0
            goto L_0x00c1
        L_0x00bf:
            r17 = r3
        L_0x00c1:
            ef0.a r0 = r24.mo48702a()
            java.util.List r0 = r0.mo48663j()
            java.util.Iterator r0 = r0.iterator()
        L_0x00cd:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00f1
            java.lang.Object r4 = r0.next()
            r5 = r4
            ef0.f r5 = (ef0.C20231f) r5
            java.lang.String r5 = r5.mo48696a()
            ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.EmplInfoApiModel r6 = r23.getEmploymentInfo()
            if (r6 == 0) goto L_0x00e9
            java.lang.String r6 = r6.getStatus()
            goto L_0x00ea
        L_0x00e9:
            r6 = r3
        L_0x00ea:
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)
            if (r5 == 0) goto L_0x00cd
            goto L_0x00f2
        L_0x00f1:
            r4 = r3
        L_0x00f2:
            r18 = r4
            ef0.f r18 = (ef0.C20231f) r18
            ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.EmplInfoApiModel r0 = r23.getEmploymentInfo()
            if (r0 == 0) goto L_0x0103
            java.lang.String r0 = r0.getCompany()
            r19 = r0
            goto L_0x0105
        L_0x0103:
            r19 = r3
        L_0x0105:
            ef0.a r0 = r24.mo48702a()
            java.util.List r0 = r0.mo48665l()
            java.util.Iterator r0 = r0.iterator()
        L_0x0111:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0135
            java.lang.Object r2 = r0.next()
            r4 = r2
            ef0.f r4 = (ef0.C20231f) r4
            java.lang.String r4 = r4.mo48696a()
            ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.EmplInfoApiModel r5 = r23.getEmploymentInfo()
            if (r5 == 0) goto L_0x012d
            java.lang.String r5 = r5.getPosition()
            goto L_0x012e
        L_0x012d:
            r5 = r3
        L_0x012e:
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r4 == 0) goto L_0x0111
            r3 = r2
        L_0x0135:
            r20 = r3
            ef0.f r20 = (ef0.C20231f) r20
            ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.InvestmentProfileInfoApiModel r0 = r23.getInvestorProfileInfo()
            if (r0 == 0) goto L_0x014a
            java.lang.Integer r0 = r0.getAnnualIncome()
            if (r0 == 0) goto L_0x014a
            int r0 = r0.intValue()
            goto L_0x014b
        L_0x014a:
            r0 = 0
        L_0x014b:
            java.lang.Integer r21 = java.lang.Integer.valueOf(r0)
            ef0.e r0 = new ef0.e
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pe0.C27519a.mo66837d(ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.ReviewDataApiModel, ef0.g):ef0.e");
    }

    /* renamed from: e */
    public final C20232g mo66838e(OnboardingListOfValuesApiModel onboardingListOfValuesApiModel) {
        C41536l.m120489i(onboardingListOfValuesApiModel, "data");
        return new C20232g(mo66834a(onboardingListOfValuesApiModel.getEmploymentInfo()), mo66835b(onboardingListOfValuesApiModel.getAdditionalInfo()), mo66836c(onboardingListOfValuesApiModel.getInvestorInfo()));
    }
}

package qa1;

import ba1.C10146d0;
import ba1.C10214s;
import ed1.C40734b;
import ed1.C40735b0;
import ed1.C40762x;
import gb1.C32393w;
import hb1.C36175k;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lb1.C37121c;
import lb1.C37123e;
import p217q2.C7833e;
import p217q2.C7843j;
import p341ge.bog.sso_client.models.C35937e;
import p341ge.bog.sso_client.models.C35938f;
import p341ge.bog.sso_client.models.C35965u;
import p341ge.bog.sso_client.models.CountryCode;
import p341ge.bog.sso_client.models.Level;
import p341ge.bog.sso_client.models.PasswordRules;
import p341ge.bog.sso_client.models.Rule;
import p341ge.bog.sso_client.models.UserNameRules;
import p341ge.bog.sso_client.models.ValidateOnboardingDataResponse;
import p341ge.bog.sso_client.onboarding.domain.model.ValidateDataException;
import ra1.C27981p;
import sso.queery.ApproveFinancialContactQuery;
import sso.queery.AuthQuery;
import sso.queery.ChangeUserNameAndPasswordQuery;
import sso.queery.ConfirmationOnTermsQuery;
import sso.queery.GetCountryCodesQuery;
import sso.queery.GetPasswordPolicyRulesQuery;
import sso.queery.GetTurnoverTypesQuery;
import sso.queery.GetUserDataQuery;
import sso.queery.GetUsernamePolicyRulesQuery;
import sso.queery.IdentifyProccesFlowQuery;
import sso.queery.RequestFinancialContactApproveQuery;
import sso.queery.UpdateClientTurnoverInfoQuery;
import sso.queery.ValidateOnboardingDocumentDataQuery;
import ue1.C43075l;
import va1.C39311i;

/* renamed from: qa1.p0 */
public final class C27736p0 implements C27761y {

    /* renamed from: c */
    private static final C27737a f70827c = new C27737a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private static final List f70828d = C41341q.m119910m(new C37121c(C37123e.m109723a("text.do.slider.1.title"), C37123e.m109723a("text.do.slider.1.message"), C10214s.img_onboarding_infocard_id, 1), new C37121c(C37123e.m109723a("text.do.slider.2.title"), C37123e.m109723a("text.do.slider.2.message"), C10214s.img_onboarding_infocard_time, 2), new C37121c(C37123e.m109723a("text.do.slider.3.title"), C37123e.m109723a("text.do.slider.3.message"), C10214s.img_onboarding_infocard_intnernet, 3), new C37121c(C37123e.m109723a("text.do.slider.4.title"), C37123e.m109723a("text.do.slider.4.message"), C10214s.img_onboarding_infocard_lighting, 4));

    /* renamed from: a */
    private final C36175k f70829a;

    /* renamed from: b */
    private final C39311i f70830b;

    /* renamed from: qa1.p0$a */
    private static final class C27737a {
        private C27737a() {
        }

        public /* synthetic */ C27737a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C27736p0(C36175k kVar, C39311i iVar) {
        C41536l.m120489i(kVar, "apolloRxFactory");
        C41536l.m120489i(iVar, "serverEndpointConfig");
        this.f70829a = kVar;
        this.f70830b = iVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public static final Boolean m85776C(C7843j jVar) {
        boolean z;
        ApproveFinancialContactQuery.RegistrationServices registrationServices;
        ApproveFinancialContactQuery.ApproveFinancialContactV1 approveFinancialContactV1;
        C41536l.m120489i(jVar, "it");
        ApproveFinancialContactQuery.Data data = (ApproveFinancialContactQuery.Data) jVar.mo22784b();
        if (data == null || (registrationServices = data.getRegistrationServices()) == null || (approveFinancialContactV1 = registrationServices.getApproveFinancialContactV1()) == null) {
            z = false;
        } else {
            z = C41536l.m120484d(approveFinancialContactV1.getNeedToSetMail(), Boolean.TRUE);
        }
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public static final C41238w m85777D(C7843j jVar) {
        C41536l.m120489i(jVar, "it");
        return C41238w.f97225a;
    }

    /* renamed from: E */
    private final C40762x m85778E() {
        C40762x m = C36175k.m107584j(this.f70829a, new AuthQuery(this.f70830b.mo92939a(), this.f70830b.mo92940b()), false, (C43075l) null, 6, (Object) null).mo95062A(new C27713e0()).mo95084m(new C27716f0());
        C41536l.m120488h(m, "apolloRxFactory\n        …urrent.ssoToken = token }");
        return m;
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static final String m85779F(C7843j jVar) {
        String str;
        AuthQuery.Auth auth;
        C41536l.m120489i(jVar, "it");
        AuthQuery.Data data = (AuthQuery.Data) jVar.mo22784b();
        if (data == null || (auth = data.getAuth()) == null) {
            str = null;
        } else {
            str = auth.getToken();
        }
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Invalid token".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public static final void m85780G(String str) {
        C10146d0.C10159c.m37143b().setSsoToken$sso_client_release(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public static final C40735b0 m85781H(C27736p0 p0Var, String str) {
        C41536l.m120489i(p0Var, "this$0");
        C41536l.m120489i(str, "it");
        return C36175k.m107584j(p0Var.f70829a, new GetCountryCodesQuery(), false, (C43075l) null, 6, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public static final List m85782I(C7843j jVar) {
        GetCountryCodesQuery.CommonServices commonServices;
        List<GetCountryCodesQuery.GetCountryCode> getCountryCodes;
        String str;
        String str2;
        String str3;
        String str4;
        Boolean bool;
        String str5;
        int i;
        String order;
        Integer j;
        C41536l.m120489i(jVar, "it");
        GetCountryCodesQuery.Data data = (GetCountryCodesQuery.Data) jVar.mo22784b();
        if (data == null || (commonServices = data.getCommonServices()) == null || (getCountryCodes = commonServices.getGetCountryCodes()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(getCountryCodes, 10));
        for (GetCountryCodesQuery.GetCountryCode getCountryCode : getCountryCodes) {
            if (getCountryCode != null) {
                str = getCountryCode.getCallingCode();
            } else {
                str = null;
            }
            if (getCountryCode != null) {
                str2 = getCountryCode.getCcy();
            } else {
                str2 = null;
            }
            if (getCountryCode != null) {
                str3 = getCountryCode.getCode();
            } else {
                str3 = null;
            }
            if (getCountryCode != null) {
                str4 = getCountryCode.getCode2();
            } else {
                str4 = null;
            }
            if (getCountryCode != null) {
                bool = getCountryCode.getCurrentCountry();
            } else {
                bool = null;
            }
            if (getCountryCode != null) {
                str5 = getCountryCode.getName();
            } else {
                str5 = null;
            }
            if (getCountryCode == null || (order = getCountryCode.getOrder()) == null || (j = C40438v.m117098j(order)) == null) {
                i = 999;
            } else {
                i = j.intValue();
            }
            arrayList.add(new CountryCode(str, str2, str3, str4, bool, str5, Integer.valueOf(i)));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static final PasswordRules m85783J(C7843j jVar) {
        GetPasswordPolicyRulesQuery.LoginServices loginServices;
        GetPasswordPolicyRulesQuery.GetPasswordPolicyRules getPasswordPolicyRules;
        List list;
        List list2;
        String str;
        Boolean bool;
        String str2;
        String str3;
        Boolean bool2;
        String str4;
        String str5;
        Integer num;
        List<List<String>> list3;
        C41536l.m120489i(jVar, "resp");
        GetPasswordPolicyRulesQuery.Data data = (GetPasswordPolicyRulesQuery.Data) jVar.mo22784b();
        if (data == null || (loginServices = data.getLoginServices()) == null || (getPasswordPolicyRules = loginServices.getGetPasswordPolicyRules()) == null) {
            return null;
        }
        List<GetPasswordPolicyRulesQuery.Level> levels = getPasswordPolicyRules.getLevels();
        if (levels != null) {
            list = new ArrayList(C41343r.m119925u(levels, 10));
            for (GetPasswordPolicyRulesQuery.Level level : levels) {
                if (level != null) {
                    str4 = level.getDescription();
                } else {
                    str4 = null;
                }
                if (level != null) {
                    str5 = level.getLevelKey();
                } else {
                    str5 = null;
                }
                if (level != null) {
                    num = level.getPriority();
                } else {
                    num = null;
                }
                if (level != null) {
                    list3 = level.getSupportedRules();
                } else {
                    list3 = null;
                }
                list.add(new Level(str4, str5, num, list3));
            }
        } else {
            list = C41341q.m119907j();
        }
        List<GetPasswordPolicyRulesQuery.Rule> rules = getPasswordPolicyRules.getRules();
        if (rules != null) {
            list2 = new ArrayList(C41343r.m119925u(rules, 10));
            for (GetPasswordPolicyRulesQuery.Rule rule : rules) {
                if (rule != null) {
                    str = rule.getDescription();
                } else {
                    str = null;
                }
                if (rule != null) {
                    bool = rule.isInversiveRegEx();
                } else {
                    bool = null;
                }
                if (rule != null) {
                    str2 = rule.getRegEx();
                } else {
                    str2 = null;
                }
                if (rule != null) {
                    str3 = rule.getRuleKey();
                } else {
                    str3 = null;
                }
                if (rule != null) {
                    bool2 = rule.getShowCondition();
                } else {
                    bool2 = null;
                }
                list2.add(new Rule(str, bool, str2, str3, bool2));
            }
        } else {
            list2 = C41341q.m119907j();
        }
        return new PasswordRules(list, list2);
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public static final List m85784K(C7843j jVar) {
        GetTurnoverTypesQuery.RegistrationServices registrationServices;
        List<GetTurnoverTypesQuery.GetTurnoverType> getTurnoverTypes;
        Long l;
        String str;
        String str2;
        String str3;
        BigDecimal id;
        C41536l.m120489i(jVar, "it");
        GetTurnoverTypesQuery.Data data = (GetTurnoverTypesQuery.Data) jVar.mo22784b();
        if (data == null || (registrationServices = data.getRegistrationServices()) == null || (getTurnoverTypes = registrationServices.getGetTurnoverTypes()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(getTurnoverTypes, 10));
        for (GetTurnoverTypesQuery.GetTurnoverType getTurnoverType : getTurnoverTypes) {
            if (getTurnoverType == null || (id = getTurnoverType.getId()) == null) {
                l = null;
            } else {
                l = Long.valueOf(id.longValue());
            }
            if (getTurnoverType != null) {
                str = getTurnoverType.getCode();
            } else {
                str = null;
            }
            if (getTurnoverType != null) {
                str2 = getTurnoverType.getDescription();
            } else {
                str2 = null;
            }
            if (getTurnoverType != null) {
                str3 = getTurnoverType.getType();
            } else {
                str3 = null;
            }
            arrayList.add(new C35965u(l, str, str2, str3));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public static final String m85785L(C7843j jVar) {
        String str;
        GetUserDataQuery.CommonServices commonServices;
        C41536l.m120489i(jVar, "resp");
        GetUserDataQuery.Data data = (GetUserDataQuery.Data) jVar.mo22784b();
        if (data == null || (commonServices = data.getCommonServices()) == null) {
            str = null;
        } else {
            str = commonServices.getGetUserData();
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public static final UserNameRules m85786M(C7843j jVar) {
        GetUsernamePolicyRulesQuery.LoginServices loginServices;
        GetUsernamePolicyRulesQuery.GetUsernamePolicyRules getUsernamePolicyRules;
        List list;
        String str;
        Boolean bool;
        String str2;
        String str3;
        Boolean bool2;
        C41536l.m120489i(jVar, "resp");
        GetUsernamePolicyRulesQuery.Data data = (GetUsernamePolicyRulesQuery.Data) jVar.mo22784b();
        if (data == null || (loginServices = data.getLoginServices()) == null || (getUsernamePolicyRules = loginServices.getGetUsernamePolicyRules()) == null) {
            return null;
        }
        List<GetUsernamePolicyRulesQuery.Rule> rules = getUsernamePolicyRules.getRules();
        if (rules != null) {
            list = new ArrayList(C41343r.m119925u(rules, 10));
            for (GetUsernamePolicyRulesQuery.Rule rule : rules) {
                if (rule != null) {
                    str = rule.getDescription();
                } else {
                    str = null;
                }
                if (rule != null) {
                    bool = rule.isInversiveRegEx();
                } else {
                    bool = null;
                }
                if (rule != null) {
                    str2 = rule.getRegEx();
                } else {
                    str2 = null;
                }
                if (rule != null) {
                    str3 = rule.getRuleKey();
                } else {
                    str3 = null;
                }
                if (rule != null) {
                    bool2 = rule.getShowCondition();
                } else {
                    bool2 = null;
                }
                list.add(new Rule(str, bool, str2, str3, bool2));
            }
        } else {
            list = C41341q.m119907j();
        }
        return new UserNameRules(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public static final C40735b0 m85787N(C27736p0 p0Var, String str, String str2) {
        C41536l.m120489i(p0Var, "this$0");
        C41536l.m120489i(str, "$pin");
        C41536l.m120489i(str2, "it");
        return C36175k.m107584j(p0Var.f70829a, new IdentifyProccesFlowQuery(str, C7833e.f22754c.mo22769c((Object) null)), false, (C43075l) null, 6, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public static final void m85788O(String str, C7843j jVar) {
        C41536l.m120489i(str, "$pin");
        C10146d0.C10176g.m37230k(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public static final C35938f m85789P(C7843j jVar) {
        IdentifyProccesFlowQuery.RegistrationServices registrationServices;
        IdentifyProccesFlowQuery.IdentifyProcessFlow identifyProcessFlow;
        C41536l.m120489i(jVar, "it");
        IdentifyProccesFlowQuery.Data data = (IdentifyProccesFlowQuery.Data) jVar.mo22784b();
        if (data == null || (registrationServices = data.getRegistrationServices()) == null || (identifyProcessFlow = registrationServices.getIdentifyProcessFlow()) == null) {
            return null;
        }
        String processReference = identifyProcessFlow.getProcessReference();
        if (processReference == null) {
            processReference = "";
        }
        C10146d0.C10176g.m37227h(processReference);
        return new C35938f(identifyProcessFlow.getProcessFlow(), identifyProcessFlow.getProcessReference());
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public static final C35937e m85790Q(C7843j jVar) {
        RequestFinancialContactApproveQuery.RegistrationServices registrationServices;
        RequestFinancialContactApproveQuery.RequestFinancialContactApproveV1 requestFinancialContactApproveV1;
        C41536l.m120489i(jVar, "resp");
        RequestFinancialContactApproveQuery.Data data = (RequestFinancialContactApproveQuery.Data) jVar.mo22784b();
        if (data == null || (registrationServices = data.getRegistrationServices()) == null || (requestFinancialContactApproveV1 = registrationServices.getRequestFinancialContactApproveV1()) == null) {
            return null;
        }
        return new C35937e(requestFinancialContactApproveV1.getContactId(), requestFinancialContactApproveV1.isNewUser(), requestFinancialContactApproveV1.getNeedApproveContact(), requestFinancialContactApproveV1.getRetryCount(), requestFinancialContactApproveV1.getOperationReference(), requestFinancialContactApproveV1.getNeedToSetMail(), requestFinancialContactApproveV1.getCountry());
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public static final Boolean m85791R(C7843j jVar) {
        boolean z;
        UpdateClientTurnoverInfoQuery.RegistrationServices registrationServices;
        UpdateClientTurnoverInfoQuery.UpdateClientTurnoverInfo updateClientTurnoverInfo;
        Boolean needToSetFinancialMail;
        C41536l.m120489i(jVar, "it");
        UpdateClientTurnoverInfoQuery.Data data = (UpdateClientTurnoverInfoQuery.Data) jVar.mo22784b();
        if (data == null || (registrationServices = data.getRegistrationServices()) == null || (updateClientTurnoverInfo = registrationServices.getUpdateClientTurnoverInfo()) == null || (needToSetFinancialMail = updateClientTurnoverInfo.getNeedToSetFinancialMail()) == null) {
            z = false;
        } else {
            z = needToSetFinancialMail.booleanValue();
        }
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public static final ValidateOnboardingDataResponse m85792S(C7843j jVar) {
        ValidateOnboardingDocumentDataQuery.ValidateOnboardingDocumentData validateOnboardingDocumentData;
        Integer num;
        Integer errorCode;
        ValidateOnboardingDocumentDataQuery.RegistrationServices registrationServices;
        C41536l.m120489i(jVar, "it");
        ValidateOnboardingDocumentDataQuery.Data data = (ValidateOnboardingDocumentDataQuery.Data) jVar.mo22784b();
        String str = null;
        if (data == null || (registrationServices = data.getRegistrationServices()) == null) {
            validateOnboardingDocumentData = null;
        } else {
            validateOnboardingDocumentData = registrationServices.getValidateOnboardingDocumentData();
        }
        if (validateOnboardingDocumentData != null) {
            num = validateOnboardingDocumentData.getErrorCode();
        } else {
            num = null;
        }
        if (num == null || ((errorCode = validateOnboardingDocumentData.getErrorCode()) != null && errorCode.intValue() == 0)) {
            if (validateOnboardingDocumentData != null) {
                str = validateOnboardingDocumentData.getErrorKey();
            }
            if (str == null) {
                C41536l.m120486f(validateOnboardingDocumentData);
                return new ValidateOnboardingDataResponse(validateOnboardingDocumentData.getCustomerId(), validateOnboardingDocumentData.getCustomerType(), validateOnboardingDocumentData.getErrorCode(), validateOnboardingDocumentData.getErrorKey(), C32393w.m95664e(validateOnboardingDocumentData.getClientHasActualAddress()), (String) null);
            }
        }
        throw new ValidateDataException(validateOnboardingDocumentData.getErrorCode(), validateOnboardingDocumentData.getErrorKey(), (String) null, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public C40762x mo67288a(String str) {
        C41536l.m120489i(str, "flowProcessReference");
        C40762x A = C36175k.m107584j(this.f70829a, new GetUsernamePolicyRulesQuery(C7833e.f22754c.mo22769c(str)), false, (C43075l) null, 6, (Object) null).mo95062A(new C27763z());
        C41536l.m120488h(A, "apolloRxFactory.createSi…)\n            }\n        }");
        return A;
    }

    /* renamed from: b */
    public C40762x mo67289b(String str, String str2) {
        C41536l.m120489i(str, "xUserAgent");
        C41536l.m120489i(str2, "sessionToken");
        C36175k kVar = this.f70829a;
        String str3 = C27981p.f71213b;
        C7833e.C7834a aVar = C7833e.f22754c;
        C40762x A = C36175k.m107584j(kVar, new ValidateOnboardingDocumentDataQuery(str3, str, str2, aVar.mo22769c(C10146d0.C10176g.m37221b()), aVar.mo22769c(C10146d0.C10176g.m37223d())), false, (C43075l) null, 6, (Object) null).mo95062A(new C27722i0());
        C41536l.m120488h(A, "apolloRxFactory.createSi…)\n            }\n        }");
        return A;
    }

    /* renamed from: c */
    public C40762x mo67290c(String str, String str2, String str3) {
        C41536l.m120489i(str2, "contactType");
        C36175k kVar = this.f70829a;
        C7833e.C7834a aVar = C7833e.f22754c;
        C40762x A = C36175k.m107584j(kVar, new RequestFinancialContactApproveQuery(aVar.mo22769c(C10146d0.C10176g.m37221b()), aVar.mo22769c(str), str2, aVar.mo22769c(str3), aVar.mo22769c(C10146d0.C10176g.m37224e()), aVar.mo22769c(C10146d0.C10176g.m37223d())), false, (C43075l) null, 6, (Object) null).mo95062A(new C27699a0());
        C41536l.m120488h(A, "apolloRxFactory.createSi…\n            }\n\n        }");
        return A;
    }

    /* renamed from: d */
    public List mo67291d() {
        return f70828d;
    }

    /* renamed from: e */
    public C40762x mo67292e(String str, String str2) {
        C41536l.m120489i(str, "turnoverFrequency");
        C41536l.m120489i(str2, "turnoverVolume");
        C40762x A = C36175k.m107584j(this.f70829a, new UpdateClientTurnoverInfoQuery(C10146d0.C10176g.m37223d(), C10146d0.C10176g.m37221b(), str, str2), false, (C43075l) null, 6, (Object) null).mo95062A(new C27728l0());
        C41536l.m120488h(A, "apolloRxFactory.createSi…   ?: false\n            }");
        return A;
    }

    /* renamed from: f */
    public C40762x mo67293f() {
        C40762x A = m85778E().mo95087r(new C27730m0(this)).mo95062A(new C27732n0());
        C41536l.m120488h(A, "getAuthToken()\n         …          }\n            }");
        return A;
    }

    /* renamed from: g */
    public C40762x mo67294g(String str) {
        C41536l.m120489i(str, "flowProcessReference");
        C40762x A = C36175k.m107584j(this.f70829a, new GetUserDataQuery(str), false, (C43075l) null, 6, (Object) null).mo95062A(new C27718g0());
        C41536l.m120488h(A, "apolloRxFactory.createSi…\"\n            }\n        }");
        return A;
    }

    public C40762x getPasswordRules(String str) {
        C41536l.m120489i(str, "flowProcessReference");
        C40762x A = C36175k.m107584j(this.f70829a, new GetPasswordPolicyRulesQuery(C7833e.f22754c.mo22769c(str)), false, (C43075l) null, 6, (Object) null).mo95062A(new C27724j0());
        C41536l.m120488h(A, "apolloRxFactory.createSi…)\n            }\n        }");
        return A;
    }

    /* renamed from: h */
    public C40762x mo67296h(String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str2, "contactType");
        C41536l.m120489i(str4, "oneTimePassword");
        C41536l.m120489i(str5, "operationReference");
        C36175k kVar = this.f70829a;
        C7833e.C7834a aVar = C7833e.f22754c;
        C40762x A = C36175k.m107584j(kVar, new ApproveFinancialContactQuery(aVar.mo22769c(str), str2, aVar.mo22769c(str3), str4, aVar.mo22769c(str5), aVar.mo22769c(C10146d0.C10176g.m37221b()), aVar.mo22769c(C10146d0.C10176g.m37223d())), false, (C43075l) null, 6, (Object) null).mo95062A(new C27720h0());
        C41536l.m120488h(A, "apolloRxFactory.createSi…?.needToSetMail == true }");
        return A;
    }

    /* renamed from: i */
    public C40762x mo67297i(String str) {
        C41536l.m120489i(str, "pin");
        C40762x A = m85778E().mo95087r(new C27705b0(this, str)).mo95084m(new C27708c0(str)).mo95062A(new C27711d0());
        C41536l.m120488h(A, "getAuthToken()\n         …          }\n            }");
        return A;
    }

    /* renamed from: j */
    public C40734b mo67298j(String str, String str2, String str3) {
        C41536l.m120489i(str, "processReference");
        C41536l.m120489i(str2, "serviceKey");
        C41536l.m120489i(str3, "documentContent");
        C36175k kVar = this.f70829a;
        C7833e.C7834a aVar = C7833e.f22754c;
        return C36175k.m107582f(kVar, new ConfirmationOnTermsQuery(aVar.mo22769c(C10146d0.C10176g.m37224e()), aVar.mo22769c(str), aVar.mo22769c(str2), aVar.mo22769c(str3)), false, (C43075l) null, 6, (Object) null);
    }

    /* renamed from: k */
    public C40762x mo67299k(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "username");
        C41536l.m120489i(str2, "password");
        C41536l.m120489i(str3, "processReference");
        C41536l.m120489i(str4, "tmxSessionId");
        C40762x A = C36175k.m107584j(this.f70829a, new ChangeUserNameAndPasswordQuery(str, str2, str3, str4), false, (C43075l) null, 6, (Object) null).mo95062A(new C27726k0());
        C41536l.m120488h(A, "apolloRxFactory.createSi… )\n        ).map { Unit }");
        return A;
    }

    /* renamed from: l */
    public C40762x mo67300l() {
        C40762x A = C36175k.m107584j(this.f70829a, new GetTurnoverTypesQuery(), false, (C43075l) null, 6, (Object) null).mo95062A(new C27734o0());
        C41536l.m120488h(A, "apolloRxFactory.createSi…          }\n            }");
        return A;
    }
}

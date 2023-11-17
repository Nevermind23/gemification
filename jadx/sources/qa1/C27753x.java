package qa1;

import ba1.C10145d;
import ba1.C10146d0;
import ba1.C10196h;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40762x;
import ee1.C40767b;
import ei1.C40894a;
import gb1.C32393w;
import hb1.C36175k;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p088g3.C6204a;
import p204p2.C7671c;
import p217q2.C7833e;
import p217q2.C7843j;
import p341ge.bog.sso_client.models.C35933a;
import p341ge.bog.sso_client.models.C35936d;
import p341ge.bog.sso_client.models.C35939g;
import p341ge.bog.sso_client.models.C35942i;
import p341ge.bog.sso_client.models.C35944j;
import p341ge.bog.sso_client.models.C35946k;
import p341ge.bog.sso_client.models.C35952m;
import p341ge.bog.sso_client.models.C35960p;
import p341ge.bog.sso_client.models.C35961q;
import p341ge.bog.sso_client.models.C35963s;
import p341ge.bog.sso_client.models.RelatedCompany;
import p341ge.bog.sso_client.models.UserContact;
import p341ge.bog.sso_client.network.ApiException;
import sso.fragment.LoginInfo;
import sso.fragment.Token;
import sso.queery.ActivateChannelQuery;
import sso.queery.AuthQuery;
import sso.queery.BiometricLoginQuery;
import sso.queery.ChangeAppLanguageQuery;
import sso.queery.CheckResetFlowValidParametersQuery;
import sso.queery.ChooseRelatedCompanyQuery;
import sso.queery.GenerateAuthTokenQuery;
import sso.queery.GetCustomerDevicesQuery;
import sso.queery.GetFlowQuery;
import sso.queery.GetRelatedCompaniesQuery;
import sso.queery.GetResetFlowContactsQuery;
import sso.queery.GetResetFlowTransactionsQuery;
import sso.queery.GetTokenQuery;
import sso.queery.GetUserContactsQuery;
import sso.queery.LogInQuery;
import sso.queery.LogoutQuery;
import sso.queery.PasscodeLoginQuery;
import sso.queery.ProlongPasswordQuery;
import sso.queery.RefreshTokenQuery;
import sso.queery.RequestOTPQuery;
import sso.queery.SaveUserOnDeviceQuery;
import sso.queery.SetPassCodeQuery;
import sso.queery.SetupSecurityParametersQuery;
import sso.queery.TrustDeviceQuery;
import sso.queery.UntrustDeviceQuery;
import sso.queery.UpdatePasswordQuery;
import sso.queery.VerifyOTPQuery;
import sso.type.AuthTokenType;
import sso.type.RecoveryProcessFlow;
import sso.type.StrongAuthMethod;
import sso.type.UserContactType;
import ue1.C43075l;
import va1.C39311i;

/* renamed from: qa1.x */
public final class C27753x implements C27714f {

    /* renamed from: a */
    private final C36175k f70838a;

    /* renamed from: b */
    private final C39311i f70839b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C10196h f70840c;

    /* renamed from: d */
    private final C10146d0.C10172e f70841d;

    /* renamed from: e */
    private final C40767b f70842e;

    /* renamed from: qa1.x$a */
    static final class C27754a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C35952m f70843d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27754a(C35952m mVar) {
            super(1);
            this.f70843d = mVar;
        }

        /* renamed from: a */
        public final C7671c invoke(C7671c cVar) {
            C41536l.m120489i(cVar, "$this$createCompletableQuery");
            C7671c c = cVar.mo22380c(C6204a.m24692a().mo19788a("Accept-Language", this.f70843d.mo88523b()).mo19789b());
            C41536l.m120488h(c, "this.requestHeaders(\n   …build()\n                )");
            return c;
        }
    }

    /* renamed from: qa1.x$b */
    static final class C27755b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ boolean f70844d;

        /* renamed from: e */
        final /* synthetic */ LogInQuery f70845e;

        /* renamed from: f */
        final /* synthetic */ C27753x f70846f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27755b(boolean z, LogInQuery logInQuery, C27753x xVar) {
            super(1);
            this.f70844d = z;
            this.f70845e = logInQuery;
            this.f70846f = xVar;
        }

        /* renamed from: a */
        public final C7671c invoke(C7671c cVar) {
            C41536l.m120489i(cVar, "$this$createSingleQuery");
            C6204a.C6205a a = C6204a.m24692a();
            boolean z = this.f70844d;
            LogInQuery logInQuery = this.f70845e;
            C27753x xVar = this.f70846f;
            if (z) {
                C41536l.m120488h(a, "");
                C32393w.m95660a(a, logInQuery, xVar.f70840c);
            }
            C7671c c = cVar.mo22380c(a.mo19789b());
            C41536l.m120488h(c, "this.requestHeaders(requestHeadersBuilder.build())");
            return c;
        }
    }

    /* renamed from: qa1.x$c */
    static final class C27756c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ boolean f70847d;

        /* renamed from: e */
        final /* synthetic */ BiometricLoginQuery f70848e;

        /* renamed from: f */
        final /* synthetic */ C27753x f70849f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27756c(boolean z, BiometricLoginQuery biometricLoginQuery, C27753x xVar) {
            super(1);
            this.f70847d = z;
            this.f70848e = biometricLoginQuery;
            this.f70849f = xVar;
        }

        /* renamed from: a */
        public final C7671c invoke(C7671c cVar) {
            C41536l.m120489i(cVar, "$this$createSingleQuery");
            C6204a.C6205a a = C6204a.m24692a();
            boolean z = this.f70847d;
            BiometricLoginQuery biometricLoginQuery = this.f70848e;
            C27753x xVar = this.f70849f;
            if (z) {
                C41536l.m120488h(a, "");
                C32393w.m95660a(a, biometricLoginQuery, xVar.f70840c);
            }
            C7671c c = cVar.mo22380c(a.mo19789b());
            C41536l.m120488h(c, "this.requestHeaders(requestHeadersBuilder.build())");
            return c;
        }
    }

    /* renamed from: qa1.x$d */
    static final class C27757d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ boolean f70850d;

        /* renamed from: e */
        final /* synthetic */ PasscodeLoginQuery f70851e;

        /* renamed from: f */
        final /* synthetic */ C27753x f70852f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27757d(boolean z, PasscodeLoginQuery passcodeLoginQuery, C27753x xVar) {
            super(1);
            this.f70850d = z;
            this.f70851e = passcodeLoginQuery;
            this.f70852f = xVar;
        }

        /* renamed from: a */
        public final C7671c invoke(C7671c cVar) {
            C41536l.m120489i(cVar, "$this$createSingleQuery");
            C6204a.C6205a a = C6204a.m24692a();
            boolean z = this.f70850d;
            PasscodeLoginQuery passcodeLoginQuery = this.f70851e;
            C27753x xVar = this.f70852f;
            if (z) {
                C41536l.m120488h(a, "");
                C32393w.m95660a(a, passcodeLoginQuery, xVar.f70840c);
            }
            C7671c c = cVar.mo22380c(a.mo19789b());
            C41536l.m120488h(c, "this.requestHeaders(requestHeadersBuilder.build())");
            return c;
        }
    }

    /* renamed from: qa1.x$e */
    static final class C27758e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f70853d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27758e(String str) {
            super(1);
            this.f70853d = str;
        }

        /* renamed from: a */
        public final C7671c invoke(C7671c cVar) {
            C41536l.m120489i(cVar, "$this$createCompletableQuery");
            C7671c c = cVar.mo22380c(C6204a.m24692a().mo19788a("X_Auth_Token", this.f70853d).mo19789b());
            C41536l.m120488h(c, "this.requestHeaders(\n   …en).build()\n            )");
            return c;
        }
    }

    /* renamed from: qa1.x$f */
    static final class C27759f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SetupSecurityParametersQuery f70854d;

        /* renamed from: e */
        final /* synthetic */ C27753x f70855e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27759f(SetupSecurityParametersQuery setupSecurityParametersQuery, C27753x xVar) {
            super(1);
            this.f70854d = setupSecurityParametersQuery;
            this.f70855e = xVar;
        }

        /* renamed from: a */
        public final C7671c invoke(C7671c cVar) {
            C41536l.m120489i(cVar, "$this$createSingleQuery");
            C6204a.C6205a a = C6204a.m24692a();
            SetupSecurityParametersQuery setupSecurityParametersQuery = this.f70854d;
            C27753x xVar = this.f70855e;
            C41536l.m120488h(a, "");
            C32393w.m95660a(a, setupSecurityParametersQuery, xVar.f70840c);
            C7671c c = cVar.mo22380c(a.mo19789b());
            C41536l.m120488h(c, "this.requestHeaders(requestHeadersBuilder.build())");
            return c;
        }
    }

    public C27753x(C36175k kVar, C39311i iVar, C10196h hVar, C10146d0.C10172e eVar) {
        C41536l.m120489i(kVar, "apolloRxFactory");
        C41536l.m120489i(iVar, "serverEndpointConfig");
        C41536l.m120489i(hVar, "keyManager");
        C41536l.m120489i(eVar, "config");
        this.f70838a = kVar;
        this.f70839b = iVar;
        this.f70840c = hVar;
        this.f70841d = eVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<ApiException>()");
        this.f70842e = h1;
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public static final Boolean m85852W(C7843j jVar) {
        int i;
        boolean z;
        CheckResetFlowValidParametersQuery.RegistrationServices registrationServices;
        Integer validatePasswordRecoveryParameters;
        C41536l.m120489i(jVar, "it");
        CheckResetFlowValidParametersQuery.Data data = (CheckResetFlowValidParametersQuery.Data) jVar.mo22784b();
        if (data == null || (registrationServices = data.getRegistrationServices()) == null || (validatePasswordRecoveryParameters = registrationServices.getValidatePasswordRecoveryParameters()) == null) {
            i = -1;
        } else {
            i = validatePasswordRecoveryParameters.intValue();
        }
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public static final String m85853X(C7843j jVar) {
        GenerateAuthTokenQuery.LoginServices loginServices;
        C41536l.m120489i(jVar, "it");
        GenerateAuthTokenQuery.Data data = (GenerateAuthTokenQuery.Data) jVar.mo22784b();
        if (data == null || (loginServices = data.getLoginServices()) == null) {
            return null;
        }
        return loginServices.getGenerateAuthToken();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public static final String m85854Y(C7843j jVar) {
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
    /* renamed from: Z */
    public static final List m85855Z(C7843j jVar) {
        List<GetCustomerDevicesQuery.GetCustomerDevice> list;
        String str;
        String str2;
        Boolean bool;
        String str3;
        String str4;
        String str5;
        BigDecimal bigDecimal;
        String str6;
        String str7;
        BigDecimal bigDecimal2;
        String str8;
        String str9;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        GetCustomerDevicesQuery.DeviceManagementServices deviceManagementServices;
        C41536l.m120489i(jVar, "it");
        GetCustomerDevicesQuery.Data data = (GetCustomerDevicesQuery.Data) jVar.mo22784b();
        if (data == null || (deviceManagementServices = data.getDeviceManagementServices()) == null) {
            list = null;
        } else {
            list = deviceManagementServices.getGetCustomerDevices();
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            for (GetCustomerDevicesQuery.GetCustomerDevice getCustomerDevice : list) {
                if (getCustomerDevice != null) {
                    str = getCustomerDevice.getAppVersion();
                } else {
                    str = null;
                }
                if (getCustomerDevice != null) {
                    str2 = getCustomerDevice.getChannelId();
                } else {
                    str2 = null;
                }
                if (getCustomerDevice != null) {
                    bool = getCustomerDevice.getCurrentDevice();
                } else {
                    bool = null;
                }
                if (getCustomerDevice != null) {
                    str3 = getCustomerDevice.getDeviceInfo();
                } else {
                    str3 = null;
                }
                if (getCustomerDevice != null) {
                    str4 = getCustomerDevice.getDeviceModel();
                } else {
                    str4 = null;
                }
                if (getCustomerDevice != null) {
                    str5 = getCustomerDevice.getDeviceType();
                } else {
                    str5 = null;
                }
                if (getCustomerDevice != null) {
                    bigDecimal = getCustomerDevice.getId();
                } else {
                    bigDecimal = null;
                }
                if (getCustomerDevice != null) {
                    str6 = getCustomerDevice.isTrusted();
                } else {
                    str6 = null;
                }
                if (getCustomerDevice != null) {
                    str7 = getCustomerDevice.getLanguageCode();
                } else {
                    str7 = null;
                }
                if (getCustomerDevice != null) {
                    bigDecimal2 = getCustomerDevice.getLastLoginDate();
                } else {
                    bigDecimal2 = null;
                }
                if (getCustomerDevice != null) {
                    str8 = getCustomerDevice.getRegistrationDate();
                } else {
                    str8 = null;
                }
                if (getCustomerDevice != null) {
                    str9 = getCustomerDevice.getStatus();
                } else {
                    str9 = null;
                }
                if (getCustomerDevice != null) {
                    bigDecimal3 = getCustomerDevice.getTrustDate();
                } else {
                    bigDecimal3 = null;
                }
                if (getCustomerDevice != null) {
                    bigDecimal4 = getCustomerDevice.getUnTrustDate();
                } else {
                    bigDecimal4 = null;
                }
                C35936d dVar = r4;
                C35936d dVar2 = new C35936d(str, str2, bool, str3, str4, str5, bigDecimal, str6, str7, bigDecimal2, str8, str9, bigDecimal3, bigDecimal4);
                arrayList.add(dVar);
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public static final C35942i m85856a0(C7843j jVar) {
        RecoveryProcessFlow recoveryProcessFlow;
        GetFlowQuery.RegistrationServices registrationServices;
        GetFlowQuery.GetPasswordRecoveryFlow getPasswordRecoveryFlow;
        C41536l.m120489i(jVar, "it");
        GetFlowQuery.Data data = (GetFlowQuery.Data) jVar.mo22784b();
        if (data == null || (registrationServices = data.getRegistrationServices()) == null || (getPasswordRecoveryFlow = registrationServices.getGetPasswordRecoveryFlow()) == null) {
            recoveryProcessFlow = null;
        } else {
            recoveryProcessFlow = getPasswordRecoveryFlow.getProcessFlow();
        }
        if (recoveryProcessFlow != null) {
            return C35944j.m106976a(recoveryProcessFlow);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public static final C35960p m85857b0(C7843j jVar) {
        GetResetFlowContactsQuery.GetPasswordRecoveryContacts getPasswordRecoveryContacts;
        GetResetFlowContactsQuery.RegistrationServices registrationServices;
        C41536l.m120489i(jVar, "it");
        GetResetFlowContactsQuery.Data data = (GetResetFlowContactsQuery.Data) jVar.mo22784b();
        if (data == null || (registrationServices = data.getRegistrationServices()) == null) {
            getPasswordRecoveryContacts = null;
        } else {
            getPasswordRecoveryContacts = registrationServices.getGetPasswordRecoveryContacts();
        }
        if (getPasswordRecoveryContacts != null) {
            return C35946k.m106977a(getPasswordRecoveryContacts);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public static final C35961q m85858c0(C7843j jVar) {
        GetResetFlowTransactionsQuery.GetPasswordRecoveryTransactions getPasswordRecoveryTransactions;
        GetResetFlowTransactionsQuery.RegistrationServices registrationServices;
        C41536l.m120489i(jVar, "it");
        GetResetFlowTransactionsQuery.Data data = (GetResetFlowTransactionsQuery.Data) jVar.mo22784b();
        if (data == null || (registrationServices = data.getRegistrationServices()) == null) {
            getPasswordRecoveryTransactions = null;
        } else {
            getPasswordRecoveryTransactions = registrationServices.getGetPasswordRecoveryTransactions();
        }
        if (getPasswordRecoveryTransactions != null) {
            return C35946k.m106978b(getPasswordRecoveryTransactions);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public static final List m85859d0(C7843j jVar) {
        GetRelatedCompaniesQuery.LoginServices loginServices;
        List<GetRelatedCompaniesQuery.GetRelatedCompany> getRelatedCompanies;
        BigDecimal bigDecimal;
        String str;
        String str2;
        Boolean bool;
        StrongAuthMethod strongAuthMethod;
        C41536l.m120489i(jVar, "it");
        GetRelatedCompaniesQuery.Data data = (GetRelatedCompaniesQuery.Data) jVar.mo22784b();
        if (data == null || (loginServices = data.getLoginServices()) == null || (getRelatedCompanies = loginServices.getGetRelatedCompanies()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(getRelatedCompanies, 10));
        for (GetRelatedCompaniesQuery.GetRelatedCompany getRelatedCompany : getRelatedCompanies) {
            if (getRelatedCompany != null) {
                bigDecimal = getRelatedCompany.getClientKey();
            } else {
                bigDecimal = null;
            }
            String valueOf = String.valueOf(bigDecimal);
            if (getRelatedCompany != null) {
                str = getRelatedCompany.getClientName();
            } else {
                str = null;
            }
            if (getRelatedCompany != null) {
                str2 = getRelatedCompany.getIcon();
            } else {
                str2 = null;
            }
            if (getRelatedCompany != null) {
                bool = getRelatedCompany.isStrongAuthRequired();
            } else {
                bool = null;
            }
            if (getRelatedCompany != null) {
                strongAuthMethod = getRelatedCompany.getStrongAuthMethod();
            } else {
                strongAuthMethod = null;
            }
            arrayList.add(new RelatedCompany(valueOf, str, str2, bool, strongAuthMethod));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public static final void m85860e0(Throwable th) {
        C10146d0.C10159c.m37143b().setProcessReference$sso_client_release((String) null);
        C40894a.m118635a(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public static final C35933a m85861f0(C7843j jVar) {
        GetTokenQuery.LoginServices loginServices;
        GetTokenQuery.GetToken getToken;
        GetTokenQuery.GetToken.Fragments fragments;
        Token token;
        C41536l.m120489i(jVar, "it");
        GetTokenQuery.Data data = (GetTokenQuery.Data) jVar.mo22784b();
        if (data == null || (loginServices = data.getLoginServices()) == null || (getToken = loginServices.getGetToken()) == null || (fragments = getToken.getFragments()) == null || (token = fragments.getToken()) == null) {
            return null;
        }
        String keycloakRefreshToken = token.getKeycloakRefreshToken();
        String keycloakToken = token.getKeycloakToken();
        if (keycloakToken != null) {
            return new C35933a(keycloakRefreshToken, keycloakToken);
        }
        throw new IllegalArgumentException("Invalid token".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public static final List m85862g0(C7843j jVar) {
        List<GetUserContactsQuery.GetUserContact> list;
        String str;
        UserContactType userContactType;
        String str2;
        Boolean bool;
        Boolean bool2;
        GetUserContactsQuery.CommonServices commonServices;
        C41536l.m120489i(jVar, "it");
        GetUserContactsQuery.Data data = (GetUserContactsQuery.Data) jVar.mo22784b();
        if (data == null || (commonServices = data.getCommonServices()) == null) {
            list = null;
        } else {
            list = commonServices.getGetUserContacts();
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            for (GetUserContactsQuery.GetUserContact getUserContact : list) {
                if (getUserContact != null) {
                    str = getUserContact.getId();
                } else {
                    str = null;
                }
                if (getUserContact != null) {
                    userContactType = getUserContact.getType();
                } else {
                    userContactType = null;
                }
                if (getUserContact != null) {
                    str2 = getUserContact.getContact();
                } else {
                    str2 = null;
                }
                if (getUserContact != null) {
                    bool = getUserContact.getFinancial();
                } else {
                    bool = null;
                }
                if (getUserContact != null) {
                    bool2 = getUserContact.getPreSelected();
                } else {
                    bool2 = null;
                }
                arrayList.add(new UserContact(str, userContactType, str2, bool, bool2));
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public static final C35939g m85863h0(C7843j jVar) {
        LogInQuery.LoginServices loginServices;
        LogInQuery.Login login;
        LogInQuery.Login.Fragments fragments;
        LoginInfo loginInfo;
        C41536l.m120489i(jVar, "it");
        LogInQuery.Data data = (LogInQuery.Data) jVar.mo22784b();
        if (data == null || (loginServices = data.getLoginServices()) == null || (login = loginServices.getLogin()) == null || (fragments = login.getFragments()) == null || (loginInfo = fragments.getLoginInfo()) == null) {
            return null;
        }
        Boolean isChannelActive = loginInfo.isChannelActive();
        Boolean isPasswordExpired = loginInfo.isPasswordExpired();
        Boolean isUsernameChangeRequired = loginInfo.isUsernameChangeRequired();
        Boolean passwordChangeRequired = loginInfo.getPasswordChangeRequired();
        String processReference = loginInfo.getProcessReference();
        if (processReference != null) {
            return new C35939g(isChannelActive, isPasswordExpired, isUsernameChangeRequired, passwordChangeRequired, processReference);
        }
        throw new IllegalArgumentException("Invalid processReference".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public static final C35939g m85864i0(C7843j jVar) {
        BiometricLoginQuery.LoginServices loginServices;
        BiometricLoginQuery.Login login;
        BiometricLoginQuery.Login.Fragments fragments;
        LoginInfo loginInfo;
        C41536l.m120489i(jVar, "it");
        BiometricLoginQuery.Data data = (BiometricLoginQuery.Data) jVar.mo22784b();
        if (data == null || (loginServices = data.getLoginServices()) == null || (login = loginServices.getLogin()) == null || (fragments = login.getFragments()) == null || (loginInfo = fragments.getLoginInfo()) == null) {
            return null;
        }
        Boolean isChannelActive = loginInfo.isChannelActive();
        Boolean isPasswordExpired = loginInfo.isPasswordExpired();
        Boolean isUsernameChangeRequired = loginInfo.isUsernameChangeRequired();
        Boolean passwordChangeRequired = loginInfo.getPasswordChangeRequired();
        String processReference = loginInfo.getProcessReference();
        if (processReference != null) {
            return new C35939g(isChannelActive, isPasswordExpired, isUsernameChangeRequired, passwordChangeRequired, processReference);
        }
        throw new IllegalArgumentException("Invalid processReference".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public static final C35939g m85865j0(C7843j jVar) {
        PasscodeLoginQuery.LoginServices loginServices;
        PasscodeLoginQuery.Login login;
        PasscodeLoginQuery.Login.Fragments fragments;
        LoginInfo loginInfo;
        C41536l.m120489i(jVar, "it");
        PasscodeLoginQuery.Data data = (PasscodeLoginQuery.Data) jVar.mo22784b();
        if (data == null || (loginServices = data.getLoginServices()) == null || (login = loginServices.getLogin()) == null || (fragments = login.getFragments()) == null || (loginInfo = fragments.getLoginInfo()) == null) {
            return null;
        }
        Boolean isChannelActive = loginInfo.isChannelActive();
        Boolean isPasswordExpired = loginInfo.isPasswordExpired();
        Boolean isUsernameChangeRequired = loginInfo.isUsernameChangeRequired();
        Boolean passwordChangeRequired = loginInfo.getPasswordChangeRequired();
        String processReference = loginInfo.getProcessReference();
        if (processReference != null) {
            return new C35939g(isChannelActive, isPasswordExpired, isUsernameChangeRequired, passwordChangeRequired, processReference);
        }
        throw new IllegalArgumentException("Invalid processReference".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public static final C35933a m85866k0(C7843j jVar) {
        RefreshTokenQuery.LoginServices loginServices;
        RefreshTokenQuery.RefreshToken refreshToken;
        RefreshTokenQuery.RefreshToken.Fragments fragments;
        Token token;
        C41536l.m120489i(jVar, "it");
        RefreshTokenQuery.Data data = (RefreshTokenQuery.Data) jVar.mo22784b();
        if (data == null || (loginServices = data.getLoginServices()) == null || (refreshToken = loginServices.getRefreshToken()) == null || (fragments = refreshToken.getFragments()) == null || (token = fragments.getToken()) == null) {
            return null;
        }
        String keycloakRefreshToken = token.getKeycloakRefreshToken();
        String keycloakToken = token.getKeycloakToken();
        if (keycloakToken != null) {
            return new C35933a(keycloakRefreshToken, keycloakToken);
        }
        throw new IllegalArgumentException("Invalid token".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public static final C41238w m85867l0(C7843j jVar) {
        C41536l.m120489i(jVar, "it");
        return C41238w.f97225a;
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public static final C35963s m85868m0(C7843j jVar) {
        SetupSecurityParametersQuery.SetupSecurityParameters setupSecurityParameters;
        SetupSecurityParametersQuery.LoginServices loginServices;
        C41536l.m120489i(jVar, "it");
        SetupSecurityParametersQuery.Data data = (SetupSecurityParametersQuery.Data) jVar.mo22784b();
        if (data == null || (loginServices = data.getLoginServices()) == null) {
            setupSecurityParameters = null;
        } else {
            setupSecurityParameters = loginServices.getSetupSecurityParameters();
        }
        if (setupSecurityParameters != null) {
            return new C35963s(setupSecurityParameters.getFragments().getSecurityParametersInfo().getBiometricAuthToken(), setupSecurityParameters.getFragments().getSecurityParametersInfo().getPasscodeAuthToken());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: A */
    public C40734b mo67258A(String str) {
        C41536l.m120489i(str, "processReference");
        return C36175k.m107582f(this.f70838a, new ActivateChannelQuery(C10145d.m37088b(this.f70841d.mo26726q().mo92939a()), str, C10145d.m37088b(C10146d0.C10177h.m37232a())), false, (C43075l) null, 6, (Object) null);
    }

    /* renamed from: B */
    public C40762x mo67259B(String str, String str2) {
        C41536l.m120489i(str2, "processReference");
        C40762x A = C36175k.m107584j(this.f70838a, new GetUserContactsQuery(str2, C7833e.f22754c.mo22769c(str)), false, (C43075l) null, 6, (Object) null).mo95062A(new C27727l());
        C41536l.m120488h(A, "apolloRxFactory.createSi…)\n            }\n        }");
        return A;
    }

    /* renamed from: C */
    public C40734b mo67260C(String str, BigDecimal bigDecimal, boolean z, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "deviceId");
        C41536l.m120489i(str2, "operationId");
        C41536l.m120489i(str3, "operationReference");
        String str6 = str4;
        C41536l.m120489i(str6, "processReference");
        C41536l.m120489i(str5, "scaAuthCode");
        return C36175k.m107582f(this.f70838a, new TrustDeviceQuery(str, C10145d.m37088b((Object) null), z, C10145d.m37088b(str2), C10145d.m37088b(str3), str6, C10145d.m37088b(str5)), false, (C43075l) null, 6, (Object) null);
    }

    /* renamed from: D */
    public C40734b mo67261D(String str, String str2) {
        C41536l.m120489i(str, "relatedCompanyKey");
        C41536l.m120489i(str2, "processReference");
        return C36175k.m107582f(this.f70838a, new ChooseRelatedCompanyQuery(str, str2), false, (C43075l) null, 6, (Object) null);
    }

    /* renamed from: a */
    public C40734b mo67262a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        String str12 = str6;
        String str13 = str7;
        C41536l.m120489i(str8, "appVersion");
        C41536l.m120489i(str9, "deviceInfo");
        C41536l.m120489i(str10, "deviceModel");
        C41536l.m120489i(str11, "extCustomerId");
        C41536l.m120489i(str12, "softVersion");
        C41536l.m120489i(str13, "accessToken");
        C36175k kVar = this.f70838a;
        C7833e.C7834a aVar = C7833e.f22754c;
        return C36175k.m107582f(kVar, new SaveUserOnDeviceQuery(aVar.mo22769c(str8), aVar.mo22769c(str9), aVar.mo22769c(str10), aVar.mo22769c(str11), aVar.mo22768b(str5), aVar.mo22768b((Object) null), aVar.mo22769c(str12)), false, new C27758e(str13), 2, (Object) null);
    }

    /* renamed from: b */
    public C40762x mo67263b(String str) {
        C41536l.m120489i(str, "processReference");
        C40762x A = C36175k.m107584j(this.f70838a, new GetTokenQuery(str), false, (C43075l) null, 6, (Object) null).mo95082k(new C27746u()).mo95062A(new C27748v());
        C41536l.m120488h(A, "apolloRxFactory.createSi…)\n            }\n        }");
        return A;
    }

    /* renamed from: c */
    public C40762x mo67264c(String str) {
        C41536l.m120489i(str, "processReference");
        C40762x A = C36175k.m107584j(this.f70838a, new GetFlowQuery(C7833e.f22754c.mo22769c(str)), false, (C43075l) null, 6, (Object) null).mo95062A(new C27729m());
        C41536l.m120488h(A, "apolloRxFactory.createSi…)\n            }\n        }");
        return A;
    }

    /* renamed from: d */
    public C40749p mo67265d() {
        return this.f70842e;
    }

    /* renamed from: e */
    public C40762x mo67266e(String str, C35942i iVar, List list) {
        C41536l.m120489i(str, "processReference");
        C41536l.m120489i(iVar, "flowType");
        C41536l.m120489i(list, "idHashes");
        C36175k kVar = this.f70838a;
        C7833e.C7834a aVar = C7833e.f22754c;
        C40762x A = C36175k.m107584j(kVar, new CheckResetFlowValidParametersQuery(aVar.mo22769c(str), aVar.mo22769c(iVar.mo88515h().toString()), aVar.mo22769c(list)), false, (C43075l) null, 6, (Object) null).mo95062A(new C27751w());
        C41536l.m120488h(A, "apolloRxFactory.createSi…ers ?: -1 == 0)\n        }");
        return A;
    }

    /* renamed from: f */
    public void mo67267f(ApiException apiException) {
        C41536l.m120489i(apiException, "error");
        this.f70842e.onNext(apiException);
    }

    /* renamed from: g */
    public C40762x mo67268g(String str, String str2, String str3, String str4, boolean z, String str5) {
        C41536l.m120489i(str, "deviceId");
        C41536l.m120489i(str2, "passCode");
        C41536l.m120489i(str3, "userName");
        C41536l.m120489i(str4, "token");
        C41536l.m120489i(str5, "tmxSessionId");
        String processReference$sso_client_release = C10146d0.C10159c.m37143b().getProcessReference$sso_client_release();
        if (processReference$sso_client_release == null) {
            processReference$sso_client_release = "";
        }
        PasscodeLoginQuery passcodeLoginQuery = new PasscodeLoginQuery(str3, str2, str4, str, processReference$sso_client_release, str5);
        C40762x A = C36175k.m107584j(this.f70838a, passcodeLoginQuery, false, new C27757d(z, passcodeLoginQuery, this), 2, (Object) null).mo95062A(new C27723j());
        C41536l.m120488h(A, "override fun loginWithPa…        }\n        }\n    }");
        return A;
    }

    /* renamed from: h */
    public C40762x mo67269h(String str, String str2, boolean z, String str3) {
        C41536l.m120489i(str, "userName");
        C41536l.m120489i(str2, "password");
        C41536l.m120489i(str3, "tmxSessionId");
        String processReference$sso_client_release = C10146d0.C10159c.m37143b().getProcessReference$sso_client_release();
        if (processReference$sso_client_release == null) {
            processReference$sso_client_release = "";
        }
        LogInQuery logInQuery = new LogInQuery(str, str2, processReference$sso_client_release, str3);
        C40762x A = C36175k.m107584j(this.f70838a, logInQuery, false, new C27755b(z, logInQuery, this), 2, (Object) null).mo95062A(new C27725k());
        C41536l.m120488h(A, "override fun logIn(\n    …        }\n        }\n    }");
        return A;
    }

    /* renamed from: i */
    public C40762x mo67270i(String str, C35942i iVar) {
        C41536l.m120489i(str, "processReference");
        C41536l.m120489i(iVar, "flowType");
        C36175k kVar = this.f70838a;
        C7833e.C7834a aVar = C7833e.f22754c;
        C40762x A = C36175k.m107584j(kVar, new GetResetFlowContactsQuery(aVar.mo22769c(str), aVar.mo22769c(iVar.mo88515h().toString())), false, (C43075l) null, 6, (Object) null).mo95062A(new C27744t());
        C41536l.m120488h(A, "apolloRxFactory.createSi…)\n            }\n        }");
        return A;
    }

    /* renamed from: j */
    public C40734b mo67271j(C35952m mVar, C35952m mVar2) {
        C41536l.m120489i(mVar, "currentLocale");
        C41536l.m120489i(mVar2, "newLocale");
        return C36175k.m107582f(this.f70838a, new ChangeAppLanguageQuery(mVar2.mo88524c()), false, new C27754a(mVar), 2, (Object) null);
    }

    /* renamed from: k */
    public C40762x mo67272k() {
        C40762x A = C36175k.m107584j(this.f70838a, new GetCustomerDevicesQuery(), false, (C43075l) null, 6, (Object) null).mo95062A(new C27740r());
        C41536l.m120488h(A, "apolloRxFactory.createSi…)\n            }\n        }");
        return A;
    }

    /* renamed from: l */
    public C40734b mo67273l(String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "password");
        C41536l.m120489i(str4, "processReference");
        C41536l.m120489i(str5, "scaAuthCode");
        return C36175k.m107582f(this.f70838a, new UpdatePasswordQuery(C10145d.m37088b(str), C10145d.m37088b(str2), str3, str4, C10145d.m37088b(str5)), false, (C43075l) null, 6, (Object) null);
    }

    /* renamed from: m */
    public C40762x mo67274m(String str) {
        C41536l.m120489i(str, "processReference");
        C40762x A = C36175k.m107584j(this.f70838a, new GetRelatedCompaniesQuery(str), false, (C43075l) null, 6, (Object) null).mo95062A(new C27735p());
        C41536l.m120488h(A, "apolloRxFactory.createSi…)\n            }\n        }");
        return A;
    }

    /* renamed from: n */
    public C40762x mo67275n(String str) {
        C41536l.m120489i(str, "processReference");
        return mo67259B((String) null, str);
    }

    /* renamed from: o */
    public C40762x mo67276o(boolean z, String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str4, "processReference");
        C41536l.m120489i(str5, "scaAuthCode");
        SetupSecurityParametersQuery setupSecurityParametersQuery = new SetupSecurityParametersQuery(z, C10145d.m37088b(str), C10145d.m37088b(str2), C10145d.m37088b(str3), str4, C10145d.m37088b(str5));
        C40762x A = C36175k.m107584j(this.f70838a, setupSecurityParametersQuery, false, new C27759f(setupSecurityParametersQuery, this), 2, (Object) null).mo95062A(new C27733o());
        C41536l.m120488h(A, "override fun setupSecuri…        }\n        }\n    }");
        return A;
    }

    /* renamed from: p */
    public C40762x mo67277p(String str, String str2, String str3, boolean z, String str4) {
        C41536l.m120489i(str, "deviceId");
        C41536l.m120489i(str2, "userName");
        C41536l.m120489i(str3, "token");
        C41536l.m120489i(str4, "tmxSessionId");
        String processReference$sso_client_release = C10146d0.C10159c.m37143b().getProcessReference$sso_client_release();
        if (processReference$sso_client_release == null) {
            processReference$sso_client_release = "";
        }
        BiometricLoginQuery biometricLoginQuery = new BiometricLoginQuery(str2, str3, str, processReference$sso_client_release, str4);
        C40762x A = C36175k.m107584j(this.f70838a, biometricLoginQuery, false, new C27756c(z, biometricLoginQuery, this), 2, (Object) null).mo95062A(new C27731n());
        C41536l.m120488h(A, "override fun loginWithBi…        }\n        }\n    }");
        return A;
    }

    /* renamed from: q */
    public C40734b mo67278q(String str, String str2, String str3) {
        C41536l.m120489i(str, "passCode");
        C41536l.m120489i(str2, "userName");
        C41536l.m120489i(str3, "processReference");
        return C36175k.m107582f(this.f70838a, new SetPassCodeQuery(str, str3, str2), false, (C43075l) null, 6, (Object) null);
    }

    /* renamed from: r */
    public C40762x mo67279r(String str, C35942i iVar) {
        C41536l.m120489i(str, "processReference");
        C41536l.m120489i(iVar, "flowType");
        C40762x A = C36175k.m107584j(this.f70838a, new GetResetFlowTransactionsQuery(C7833e.f22754c.mo22769c(str)), false, (C43075l) null, 6, (Object) null).mo95062A(new C27742s());
        C41536l.m120488h(A, "apolloRxFactory.createSi…)\n            }\n        }");
        return A;
    }

    /* renamed from: s */
    public C40762x mo67280s() {
        C40762x A = C36175k.m107584j(this.f70838a, new AuthQuery(this.f70839b.mo92939a(), this.f70839b.mo92940b()), false, (C43075l) null, 4, (Object) null).mo95062A(new C27719h());
        C41536l.m120488h(A, "apolloRxFactory.createSi…en) { \"Invalid token\" } }");
        return A;
    }

    /* renamed from: t */
    public C40734b mo67281t(String str, String str2, String str3) {
        C41536l.m120489i(str, "oneTimePassword");
        C41536l.m120489i(str2, "processReference");
        return C36175k.m107582f(this.f70838a, new VerifyOTPQuery(str, str2, C7833e.f22754c.mo22769c(str3)), false, (C43075l) null, 6, (Object) null);
    }

    /* renamed from: u */
    public C40734b mo67282u(String str) {
        C41536l.m120489i(str, "processReference");
        return C36175k.m107582f(this.f70838a, new ProlongPasswordQuery(str), false, (C43075l) null, 6, (Object) null);
    }

    /* renamed from: v */
    public C40762x mo67283v(String str, String str2) {
        C41536l.m120489i(str, "processReference");
        C41536l.m120489i(str2, "refreshToken");
        C40762x A = C36175k.m107584j(this.f70838a, new RefreshTokenQuery(str, str2), false, (C43075l) null, 6, (Object) null).mo95062A(new C27721i());
        C41536l.m120488h(A, "apolloRxFactory.createSi…          }\n            }");
        return A;
    }

    /* renamed from: w */
    public C40762x mo67284w(String str, String str2, String str3, AuthTokenType authTokenType) {
        C41536l.m120489i(str, "extCustomerId");
        C41536l.m120489i(str2, "processReference");
        C41536l.m120489i(str3, "userName");
        C41536l.m120489i(authTokenType, "type");
        C40762x A = C36175k.m107584j(this.f70838a, new GenerateAuthTokenQuery(str, str2, str3, authTokenType), false, (C43075l) null, 6, (Object) null).mo95062A(new C27738q());
        C41536l.m120488h(A, "apolloRxFactory.createSi…nerateAuthToken\n        }");
        return A;
    }

    /* renamed from: x */
    public C40734b mo67285x(String str) {
        C41536l.m120489i(str, "processReference");
        return C36175k.m107582f(this.f70838a, new LogoutQuery(str), false, (C43075l) null, 6, (Object) null);
    }

    /* renamed from: y */
    public C40734b mo67286y(String str, String str2) {
        C41536l.m120489i(str, "deviceId");
        C41536l.m120489i(str2, "processReference");
        return C36175k.m107582f(this.f70838a, new UntrustDeviceQuery(str, str2), false, (C43075l) null, 6, (Object) null);
    }

    /* renamed from: z */
    public C40762x mo67287z(UserContact userContact, String str, String str2, UserContactType userContactType, String str3) {
        C41536l.m120489i(userContact, "userContact");
        C36175k kVar = this.f70838a;
        C7833e.C7834a aVar = C7833e.f22754c;
        C40762x A = C36175k.m107584j(kVar, new RequestOTPQuery(aVar.mo22769c(userContact.mo88418a()), aVar.mo22769c(userContact.mo88420d()), aVar.mo22769c(userContact.mo88424f()), aVar.mo22769c(str), aVar.mo22769c(str2), aVar.mo22769c(userContactType), aVar.mo22769c(str3)), false, (C43075l) null, 6, (Object) null).mo95062A(new C27717g());
        C41536l.m120488h(A, "apolloRxFactory.createSi…      )\n        ).map { }");
        return A;
    }
}

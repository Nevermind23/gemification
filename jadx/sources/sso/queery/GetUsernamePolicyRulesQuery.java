package sso.queery;

import dg1.C40672b;
import dg1.C40679d;
import dg1.C40681e;
import he1.C41233s;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p217q2.C7833e;
import p217q2.C7836g;
import p217q2.C7841h;
import p217q2.C7842i;
import p217q2.C7843j;
import p217q2.C7846k;
import p217q2.C7851m;
import p243s2.C8114h;
import p243s2.C8118k;
import p243s2.C8120m;
import p243s2.C8122n;
import p243s2.C8124o;
import p243s2.C8137q;

public final class GetUsernamePolicyRulesQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "93834980915ac68a90194ed435271a17e56a428c36b39491f68f394cbc713ef2";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new GetUsernamePolicyRulesQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query GetUsernamePolicyRules($processReference: String) {\n  loginServices {\n    __typename\n    getUsernamePolicyRules(processReference: $processReference) {\n      __typename\n      rules {\n        __typename\n        description\n        isInversiveRegEx\n        regEx\n        ruleKey\n        showCondition\n      }\n    }\n  }\n}");
    private final C7833e processReference;
    private final transient C7836g.C7839c variables;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return GetUsernamePolicyRulesQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return GetUsernamePolicyRulesQuery.QUERY_DOCUMENT;
        }
    }

    public static final class Data implements C7836g.C7838b {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS = {C7846k.f22772g.mo22816g("loginServices", "loginServices", (Map) null, true, (List) null)};
        private final LoginServices loginServices;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42776xa8f0949c();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((LoginServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], C42784x2ecdf372.INSTANCE));
            }
        }

        public Data(LoginServices loginServices2) {
            this.loginServices = loginServices2;
        }

        public static /* synthetic */ Data copy$default(Data data, LoginServices loginServices2, int i, Object obj) {
            if ((i & 1) != 0) {
                loginServices2 = data.loginServices;
            }
            return data.copy(loginServices2);
        }

        public final LoginServices component1() {
            return this.loginServices;
        }

        public final Data copy(LoginServices loginServices2) {
            return new Data(loginServices2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && C41536l.m120484d(this.loginServices, ((Data) obj).loginServices);
        }

        public final LoginServices getLoginServices() {
            return this.loginServices;
        }

        public int hashCode() {
            LoginServices loginServices2 = this.loginServices;
            if (loginServices2 == null) {
                return 0;
            }
            return loginServices2.hashCode();
        }

        public C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new GetUsernamePolicyRulesQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(loginServices=" + this.loginServices + ')';
        }
    }

    public GetUsernamePolicyRulesQuery() {
        this((C7833e) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ GetUsernamePolicyRulesQuery copy$default(GetUsernamePolicyRulesQuery getUsernamePolicyRulesQuery, C7833e eVar, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = getUsernamePolicyRulesQuery.processReference;
        }
        return getUsernamePolicyRulesQuery.copy(eVar);
    }

    public final C7833e component1() {
        return this.processReference;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final GetUsernamePolicyRulesQuery copy(C7833e eVar) {
        C41536l.m120489i(eVar, "processReference");
        return new GetUsernamePolicyRulesQuery(eVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetUsernamePolicyRulesQuery) && C41536l.m120484d(this.processReference, ((GetUsernamePolicyRulesQuery) obj).processReference);
    }

    public final C7833e getProcessReference() {
        return this.processReference;
    }

    public int hashCode() {
        return this.processReference.hashCode();
    }

    public C7841h name() {
        return OPERATION_NAME;
    }

    public String operationId() {
        return OPERATION_ID;
    }

    public C7843j parse(C40679d dVar, C7851m mVar) {
        C41536l.m120489i(dVar, "source");
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8137q.m30730a(dVar, this, mVar);
    }

    public String queryDocument() {
        return QUERY_DOCUMENT;
    }

    public C8120m responseFieldMapper() {
        C8120m.C8121a aVar = C8120m.f23272a;
        return new C42782x1f5a5bc3();
    }

    public String toString() {
        return "GetUsernamePolicyRulesQuery(processReference=" + this.processReference + ')';
    }

    public C7836g.C7839c variables() {
        return this.variables;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public GetUsernamePolicyRulesQuery(C7833e eVar) {
        C41536l.m120489i(eVar, "processReference");
        this.processReference = eVar;
        this.variables = new GetUsernamePolicyRulesQuery$variables$1(this);
    }

    public C40681e composeRequestBody() {
        return C8114h.m30667a(this, false, true, C7851m.f22792c);
    }

    public C7843j parse(C40681e eVar, C7851m mVar) {
        C41536l.m120489i(eVar, "byteString");
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return parse((C40679d) new C40672b().mo94717T(eVar), mVar);
    }

    public static final class GetUsernamePolicyRules {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final List<Rule> rules;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42777x5a85882d();
            }

            public final GetUsernamePolicyRules invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(GetUsernamePolicyRules.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new GetUsernamePolicyRules(h, oVar.mo19026i(GetUsernamePolicyRules.RESPONSE_FIELDS[1], C42785xfe0ec013.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22815f("rules", "rules", (Map) null, true, (List) null)};
        }

        public GetUsernamePolicyRules(String str, List<Rule> list) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.rules = list;
        }

        public static /* synthetic */ GetUsernamePolicyRules copy$default(GetUsernamePolicyRules getUsernamePolicyRules, String str, List<Rule> list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getUsernamePolicyRules.__typename;
            }
            if ((i & 2) != 0) {
                list = getUsernamePolicyRules.rules;
            }
            return getUsernamePolicyRules.copy(str, list);
        }

        public final String component1() {
            return this.__typename;
        }

        public final List<Rule> component2() {
            return this.rules;
        }

        public final GetUsernamePolicyRules copy(String str, List<Rule> list) {
            C41536l.m120489i(str, "__typename");
            return new GetUsernamePolicyRules(str, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetUsernamePolicyRules)) {
                return false;
            }
            GetUsernamePolicyRules getUsernamePolicyRules = (GetUsernamePolicyRules) obj;
            return C41536l.m120484d(this.__typename, getUsernamePolicyRules.__typename) && C41536l.m120484d(this.rules, getUsernamePolicyRules.rules);
        }

        public final List<Rule> getRules() {
            return this.rules;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            List<Rule> list = this.rules;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42778x44449ecf(this);
        }

        public String toString() {
            return "GetUsernamePolicyRules(__typename=" + this.__typename + ", rules=" + this.rules + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GetUsernamePolicyRules(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "PolicyRules" : str, list);
        }
    }

    public static final class LoginServices {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final GetUsernamePolicyRules getUsernamePolicyRules;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42779x2e9249c9();
            }

            public final LoginServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(LoginServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new LoginServices(h, (GetUsernamePolicyRules) oVar.mo19023f(LoginServices.RESPONSE_FIELDS[1], C42788xfa8ac8bb.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22816g("getUsernamePolicyRules", "getUsernamePolicyRules", C41342q0.m119922g(C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference")))), true, (List) null)};
        }

        public LoginServices(String str, GetUsernamePolicyRules getUsernamePolicyRules2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.getUsernamePolicyRules = getUsernamePolicyRules2;
        }

        public static /* synthetic */ LoginServices copy$default(LoginServices loginServices, String str, GetUsernamePolicyRules getUsernamePolicyRules2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loginServices.__typename;
            }
            if ((i & 2) != 0) {
                getUsernamePolicyRules2 = loginServices.getUsernamePolicyRules;
            }
            return loginServices.copy(str, getUsernamePolicyRules2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final GetUsernamePolicyRules component2() {
            return this.getUsernamePolicyRules;
        }

        public final LoginServices copy(String str, GetUsernamePolicyRules getUsernamePolicyRules2) {
            C41536l.m120489i(str, "__typename");
            return new LoginServices(str, getUsernamePolicyRules2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoginServices)) {
                return false;
            }
            LoginServices loginServices = (LoginServices) obj;
            return C41536l.m120484d(this.__typename, loginServices.__typename) && C41536l.m120484d(this.getUsernamePolicyRules, loginServices.getUsernamePolicyRules);
        }

        public final GetUsernamePolicyRules getGetUsernamePolicyRules() {
            return this.getUsernamePolicyRules;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            GetUsernamePolicyRules getUsernamePolicyRules2 = this.getUsernamePolicyRules;
            return hashCode + (getUsernamePolicyRules2 == null ? 0 : getUsernamePolicyRules2.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42780x4af9c56b(this);
        }

        public String toString() {
            return "LoginServices(__typename=" + this.__typename + ", getUsernamePolicyRules=" + this.getUsernamePolicyRules + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ LoginServices(String str, GetUsernamePolicyRules getUsernamePolicyRules2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "LoginServices" : str, getUsernamePolicyRules2);
        }
    }

    public C7843j parse(C40679d dVar) {
        C41536l.m120489i(dVar, "source");
        return parse(dVar, C7851m.f22792c);
    }

    public C40681e composeRequestBody(boolean z, boolean z2, C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, z, z2, mVar);
    }

    public C7843j parse(C40681e eVar) {
        C41536l.m120489i(eVar, "byteString");
        return parse(eVar, C7851m.f22792c);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetUsernamePolicyRulesQuery(C7833e eVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C7833e.f22754c.mo22767a() : eVar);
    }

    public static final class Rule {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final String description;
        private final Boolean isInversiveRegEx;
        private final String regEx;
        private final String ruleKey;
        private final Boolean showCondition;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42781x75309c0a();
            }

            public final Rule invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(Rule.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new Rule(h, oVar.mo19025h(Rule.RESPONSE_FIELDS[1]), oVar.mo19027j(Rule.RESPONSE_FIELDS[2]), oVar.mo19025h(Rule.RESPONSE_FIELDS[3]), oVar.mo19025h(Rule.RESPONSE_FIELDS[4]), oVar.mo19027j(Rule.RESPONSE_FIELDS[5]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("description", "description", (Map) null, true, (List) null), aVar.mo22810a("isInversiveRegEx", "isInversiveRegEx", (Map) null, true, (List) null), aVar.mo22817h("regEx", "regEx", (Map) null, true, (List) null), aVar.mo22817h("ruleKey", "ruleKey", (Map) null, true, (List) null), aVar.mo22810a("showCondition", "showCondition", (Map) null, true, (List) null)};
        }

        public Rule(String str, String str2, Boolean bool, String str3, String str4, Boolean bool2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.description = str2;
            this.isInversiveRegEx = bool;
            this.regEx = str3;
            this.ruleKey = str4;
            this.showCondition = bool2;
        }

        public static /* synthetic */ Rule copy$default(Rule rule, String str, String str2, Boolean bool, String str3, String str4, Boolean bool2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = rule.__typename;
            }
            if ((i & 2) != 0) {
                str2 = rule.description;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                bool = rule.isInversiveRegEx;
            }
            Boolean bool3 = bool;
            if ((i & 8) != 0) {
                str3 = rule.regEx;
            }
            String str6 = str3;
            if ((i & 16) != 0) {
                str4 = rule.ruleKey;
            }
            String str7 = str4;
            if ((i & 32) != 0) {
                bool2 = rule.showCondition;
            }
            return rule.copy(str, str5, bool3, str6, str7, bool2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.description;
        }

        public final Boolean component3() {
            return this.isInversiveRegEx;
        }

        public final String component4() {
            return this.regEx;
        }

        public final String component5() {
            return this.ruleKey;
        }

        public final Boolean component6() {
            return this.showCondition;
        }

        public final Rule copy(String str, String str2, Boolean bool, String str3, String str4, Boolean bool2) {
            C41536l.m120489i(str, "__typename");
            return new Rule(str, str2, bool, str3, str4, bool2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Rule)) {
                return false;
            }
            Rule rule = (Rule) obj;
            return C41536l.m120484d(this.__typename, rule.__typename) && C41536l.m120484d(this.description, rule.description) && C41536l.m120484d(this.isInversiveRegEx, rule.isInversiveRegEx) && C41536l.m120484d(this.regEx, rule.regEx) && C41536l.m120484d(this.ruleKey, rule.ruleKey) && C41536l.m120484d(this.showCondition, rule.showCondition);
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getRegEx() {
            return this.regEx;
        }

        public final String getRuleKey() {
            return this.ruleKey;
        }

        public final Boolean getShowCondition() {
            return this.showCondition;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.description;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.isInversiveRegEx;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.regEx;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.ruleKey;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool2 = this.showCondition;
            if (bool2 != null) {
                i = bool2.hashCode();
            }
            return hashCode5 + i;
        }

        public final Boolean isInversiveRegEx() {
            return this.isInversiveRegEx;
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new GetUsernamePolicyRulesQuery$Rule$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Rule(__typename=" + this.__typename + ", description=" + this.description + ", isInversiveRegEx=" + this.isInversiveRegEx + ", regEx=" + this.regEx + ", ruleKey=" + this.ruleKey + ", showCondition=" + this.showCondition + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Rule(String str, String str2, Boolean bool, String str3, String str4, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Rule" : str, str2, bool, str3, str4, bool2);
        }
    }
}

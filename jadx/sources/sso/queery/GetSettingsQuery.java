package sso.queery;

import dg1.C40672b;
import dg1.C40679d;
import dg1.C40681e;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
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

public final class GetSettingsQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "4ddd26f43921e8f4e235d3ce8d0049245cf099bd5fc8a2daa1c8bc091c0ee96b";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new GetSettingsQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query getSettingsQuery {\n  commonServices {\n    __typename\n    getSettings {\n      __typename\n      propertyKey\n      propertyValue\n    }\n  }\n}");

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return GetSettingsQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return GetSettingsQuery.QUERY_DOCUMENT;
        }
    }

    public static final class Data implements C7836g.C7838b {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS = {C7846k.f22772g.mo22816g("commonServices", "commonServices", (Map) null, true, (List) null)};
        private final CommonServices commonServices;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new GetSettingsQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((CommonServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], GetSettingsQuery$Data$Companion$invoke$1$commonServices$1.INSTANCE));
            }
        }

        public Data(CommonServices commonServices2) {
            this.commonServices = commonServices2;
        }

        public static /* synthetic */ Data copy$default(Data data, CommonServices commonServices2, int i, Object obj) {
            if ((i & 1) != 0) {
                commonServices2 = data.commonServices;
            }
            return data.copy(commonServices2);
        }

        public final CommonServices component1() {
            return this.commonServices;
        }

        public final Data copy(CommonServices commonServices2) {
            return new Data(commonServices2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && C41536l.m120484d(this.commonServices, ((Data) obj).commonServices);
        }

        public final CommonServices getCommonServices() {
            return this.commonServices;
        }

        public int hashCode() {
            CommonServices commonServices2 = this.commonServices;
            if (commonServices2 == null) {
                return 0;
            }
            return commonServices2.hashCode();
        }

        public C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new GetSettingsQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(commonServices=" + this.commonServices + ')';
        }
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
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
        return new GetSettingsQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public C7836g.C7839c variables() {
        return C7836g.f22757a;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public C40681e composeRequestBody() {
        return C8114h.m30667a(this, false, true, C7851m.f22792c);
    }

    public C7843j parse(C40681e eVar, C7851m mVar) {
        C41536l.m120489i(eVar, "byteString");
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return parse((C40679d) new C40672b().mo94717T(eVar), mVar);
    }

    public static final class CommonServices {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final List<GetSetting> getSettings;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42753x1ca0a25d();
            }

            public final CommonServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(CommonServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new CommonServices(h, oVar.mo19026i(CommonServices.RESPONSE_FIELDS[1], GetSettingsQuery$CommonServices$Companion$invoke$1$getSettings$1.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22815f("getSettings", "getSettings", (Map) null, true, (List) null)};
        }

        public CommonServices(String str, List<GetSetting> list) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.getSettings = list;
        }

        public static /* synthetic */ CommonServices copy$default(CommonServices commonServices, String str, List<GetSetting> list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = commonServices.__typename;
            }
            if ((i & 2) != 0) {
                list = commonServices.getSettings;
            }
            return commonServices.copy(str, list);
        }

        public final String component1() {
            return this.__typename;
        }

        public final List<GetSetting> component2() {
            return this.getSettings;
        }

        public final CommonServices copy(String str, List<GetSetting> list) {
            C41536l.m120489i(str, "__typename");
            return new CommonServices(str, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommonServices)) {
                return false;
            }
            CommonServices commonServices = (CommonServices) obj;
            return C41536l.m120484d(this.__typename, commonServices.__typename) && C41536l.m120484d(this.getSettings, commonServices.getSettings);
        }

        public final List<GetSetting> getGetSettings() {
            return this.getSettings;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            List<GetSetting> list = this.getSettings;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new GetSettingsQuery$CommonServices$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "CommonServices(__typename=" + this.__typename + ", getSettings=" + this.getSettings + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ CommonServices(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "CommonServices" : str, list);
        }
    }

    public C7843j parse(C40679d dVar) {
        C41536l.m120489i(dVar, "source");
        return parse(dVar, C7851m.f22792c);
    }

    public static final class GetSetting {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final String propertyKey;
        private final String propertyValue;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new GetSettingsQuery$GetSetting$Companion$Mapper$$inlined$invoke$1();
            }

            public final GetSetting invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(GetSetting.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new GetSetting(h, oVar.mo19025h(GetSetting.RESPONSE_FIELDS[1]), oVar.mo19025h(GetSetting.RESPONSE_FIELDS[2]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("propertyKey", "propertyKey", (Map) null, true, (List) null), aVar.mo22817h("propertyValue", "propertyValue", (Map) null, true, (List) null)};
        }

        public GetSetting(String str, String str2, String str3) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.propertyKey = str2;
            this.propertyValue = str3;
        }

        public static /* synthetic */ GetSetting copy$default(GetSetting getSetting, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getSetting.__typename;
            }
            if ((i & 2) != 0) {
                str2 = getSetting.propertyKey;
            }
            if ((i & 4) != 0) {
                str3 = getSetting.propertyValue;
            }
            return getSetting.copy(str, str2, str3);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.propertyKey;
        }

        public final String component3() {
            return this.propertyValue;
        }

        public final GetSetting copy(String str, String str2, String str3) {
            C41536l.m120489i(str, "__typename");
            return new GetSetting(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetSetting)) {
                return false;
            }
            GetSetting getSetting = (GetSetting) obj;
            return C41536l.m120484d(this.__typename, getSetting.__typename) && C41536l.m120484d(this.propertyKey, getSetting.propertyKey) && C41536l.m120484d(this.propertyValue, getSetting.propertyValue);
        }

        public final String getPropertyKey() {
            return this.propertyKey;
        }

        public final String getPropertyValue() {
            return this.propertyValue;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.propertyKey;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.propertyValue;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new GetSettingsQuery$GetSetting$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "GetSetting(__typename=" + this.__typename + ", propertyKey=" + this.propertyKey + ", propertyValue=" + this.propertyValue + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GetSetting(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "SecurityClientSetting" : str, str2, str3);
        }
    }

    public C40681e composeRequestBody(boolean z, boolean z2, C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, z, z2, mVar);
    }

    public C7843j parse(C40681e eVar) {
        C41536l.m120489i(eVar, "byteString");
        return parse(eVar, C7851m.f22792c);
    }
}

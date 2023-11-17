package sso.queery;

import com.salesforce.marketingcloud.C11398b;
import dg1.C40672b;
import dg1.C40679d;
import dg1.C40681e;
import java.math.BigDecimal;
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
import sso.type.CustomType;

public final class GetCustomerDevicesQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "015262c0ad4a6f94bf86156b8669601440f820183b5b5cae478a0556516ac1cd";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new GetCustomerDevicesQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query getCustomerDevicesQuery {\n  deviceManagementServices {\n    __typename\n    getCustomerDevices {\n      __typename\n      appVersion\n      channelId\n      currentDevice\n      deviceInfo\n      deviceModel\n      deviceType\n      id\n      isTrusted\n      languageCode\n      lastLoginDate\n      registrationDate\n      status\n      trustDate\n      unTrustDate\n    }\n  }\n}");

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return GetCustomerDevicesQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return GetCustomerDevicesQuery.QUERY_DOCUMENT;
        }
    }

    public static final class Data implements C7836g.C7838b {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS = {C7846k.f22772g.mo22816g("deviceManagementServices", "deviceManagementServices", (Map) null, true, (List) null)};
        private final DeviceManagementServices deviceManagementServices;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new GetCustomerDevicesQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((DeviceManagementServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], C42656xe90b1cf6.INSTANCE));
            }
        }

        public Data(DeviceManagementServices deviceManagementServices2) {
            this.deviceManagementServices = deviceManagementServices2;
        }

        public static /* synthetic */ Data copy$default(Data data, DeviceManagementServices deviceManagementServices2, int i, Object obj) {
            if ((i & 1) != 0) {
                deviceManagementServices2 = data.deviceManagementServices;
            }
            return data.copy(deviceManagementServices2);
        }

        public final DeviceManagementServices component1() {
            return this.deviceManagementServices;
        }

        public final Data copy(DeviceManagementServices deviceManagementServices2) {
            return new Data(deviceManagementServices2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && C41536l.m120484d(this.deviceManagementServices, ((Data) obj).deviceManagementServices);
        }

        public final DeviceManagementServices getDeviceManagementServices() {
            return this.deviceManagementServices;
        }

        public int hashCode() {
            DeviceManagementServices deviceManagementServices2 = this.deviceManagementServices;
            if (deviceManagementServices2 == null) {
                return 0;
            }
            return deviceManagementServices2.hashCode();
        }

        public C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new GetCustomerDevicesQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(deviceManagementServices=" + this.deviceManagementServices + ')';
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
        return new GetCustomerDevicesQuery$responseFieldMapper$$inlined$invoke$1();
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

    public static final class DeviceManagementServices {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final List<GetCustomerDevice> getCustomerDevices;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42652x66b21cff();
            }

            public final DeviceManagementServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(DeviceManagementServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new DeviceManagementServices(h, oVar.mo19026i(DeviceManagementServices.RESPONSE_FIELDS[1], C42657x71e891b5.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22815f("getCustomerDevices", "getCustomerDevices", (Map) null, true, (List) null)};
        }

        public DeviceManagementServices(String str, List<GetCustomerDevice> list) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.getCustomerDevices = list;
        }

        public static /* synthetic */ DeviceManagementServices copy$default(DeviceManagementServices deviceManagementServices, String str, List<GetCustomerDevice> list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deviceManagementServices.__typename;
            }
            if ((i & 2) != 0) {
                list = deviceManagementServices.getCustomerDevices;
            }
            return deviceManagementServices.copy(str, list);
        }

        public final String component1() {
            return this.__typename;
        }

        public final List<GetCustomerDevice> component2() {
            return this.getCustomerDevices;
        }

        public final DeviceManagementServices copy(String str, List<GetCustomerDevice> list) {
            C41536l.m120489i(str, "__typename");
            return new DeviceManagementServices(str, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeviceManagementServices)) {
                return false;
            }
            DeviceManagementServices deviceManagementServices = (DeviceManagementServices) obj;
            return C41536l.m120484d(this.__typename, deviceManagementServices.__typename) && C41536l.m120484d(this.getCustomerDevices, deviceManagementServices.getCustomerDevices);
        }

        public final List<GetCustomerDevice> getGetCustomerDevices() {
            return this.getCustomerDevices;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            List<GetCustomerDevice> list = this.getCustomerDevices;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42653xbf6db921(this);
        }

        public String toString() {
            return "DeviceManagementServices(__typename=" + this.__typename + ", getCustomerDevices=" + this.getCustomerDevices + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DeviceManagementServices(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "DeviceManagementServices" : str, list);
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

    public static final class GetCustomerDevice {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final String appVersion;
        private final String channelId;
        private final Boolean currentDevice;
        private final String deviceInfo;
        private final String deviceModel;
        private final String deviceType;

        /* renamed from: id */
        private final BigDecimal f100187id;
        private final String isTrusted;
        private final String languageCode;
        private final BigDecimal lastLoginDate;
        private final String registrationDate;
        private final String status;
        private final BigDecimal trustDate;
        private final BigDecimal unTrustDate;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42654x6fe89e76();
            }

            public final GetCustomerDevice invoke(C8124o oVar) {
                C8124o oVar2 = oVar;
                C41536l.m120489i(oVar2, "reader");
                String h = oVar2.mo19025h(GetCustomerDevice.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new GetCustomerDevice(h, oVar2.mo19025h(GetCustomerDevice.RESPONSE_FIELDS[1]), oVar2.mo19025h(GetCustomerDevice.RESPONSE_FIELDS[2]), oVar2.mo19027j(GetCustomerDevice.RESPONSE_FIELDS[3]), oVar2.mo19025h(GetCustomerDevice.RESPONSE_FIELDS[4]), oVar2.mo19025h(GetCustomerDevice.RESPONSE_FIELDS[5]), oVar2.mo19025h(GetCustomerDevice.RESPONSE_FIELDS[6]), (BigDecimal) oVar2.mo19019b((C7846k.C7848b) GetCustomerDevice.RESPONSE_FIELDS[7]), oVar2.mo19025h(GetCustomerDevice.RESPONSE_FIELDS[8]), oVar2.mo19025h(GetCustomerDevice.RESPONSE_FIELDS[9]), (BigDecimal) oVar2.mo19019b((C7846k.C7848b) GetCustomerDevice.RESPONSE_FIELDS[10]), oVar2.mo19025h(GetCustomerDevice.RESPONSE_FIELDS[11]), oVar2.mo19025h(GetCustomerDevice.RESPONSE_FIELDS[12]), (BigDecimal) oVar2.mo19019b((C7846k.C7848b) GetCustomerDevice.RESPONSE_FIELDS[13]), (BigDecimal) oVar2.mo19019b((C7846k.C7848b) GetCustomerDevice.RESPONSE_FIELDS[14]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            CustomType customType = CustomType.LONG;
            CustomType customType2 = customType;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("appVersion", "appVersion", (Map) null, true, (List) null), aVar.mo22817h("channelId", "channelId", (Map) null, true, (List) null), aVar.mo22810a("currentDevice", "currentDevice", (Map) null, true, (List) null), aVar.mo22817h("deviceInfo", "deviceInfo", (Map) null, true, (List) null), aVar.mo22817h("deviceModel", "deviceModel", (Map) null, true, (List) null), aVar.mo22817h("deviceType", "deviceType", (Map) null, true, (List) null), aVar.mo22811b("id", "id", (Map) null, true, customType, (List) null), aVar.mo22817h("isTrusted", "isTrusted", (Map) null, true, (List) null), aVar.mo22817h("languageCode", "languageCode", (Map) null, true, (List) null), aVar.mo22811b("lastLoginDate", "lastLoginDate", (Map) null, true, customType, (List) null), aVar.mo22817h("registrationDate", "registrationDate", (Map) null, true, (List) null), aVar.mo22817h("status", "status", (Map) null, true, (List) null), aVar.mo22811b("trustDate", "trustDate", (Map) null, true, customType2, (List) null), aVar.mo22811b("unTrustDate", "unTrustDate", (Map) null, true, customType2, (List) null)};
        }

        public GetCustomerDevice(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, BigDecimal bigDecimal, String str7, String str8, BigDecimal bigDecimal2, String str9, String str10, BigDecimal bigDecimal3, BigDecimal bigDecimal4) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.appVersion = str2;
            this.channelId = str3;
            this.currentDevice = bool;
            this.deviceInfo = str4;
            this.deviceModel = str5;
            this.deviceType = str6;
            this.f100187id = bigDecimal;
            this.isTrusted = str7;
            this.languageCode = str8;
            this.lastLoginDate = bigDecimal2;
            this.registrationDate = str9;
            this.status = str10;
            this.trustDate = bigDecimal3;
            this.unTrustDate = bigDecimal4;
        }

        public static /* synthetic */ GetCustomerDevice copy$default(GetCustomerDevice getCustomerDevice, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, BigDecimal bigDecimal, String str7, String str8, BigDecimal bigDecimal2, String str9, String str10, BigDecimal bigDecimal3, BigDecimal bigDecimal4, int i, Object obj) {
            GetCustomerDevice getCustomerDevice2 = getCustomerDevice;
            int i2 = i;
            return getCustomerDevice.copy((i2 & 1) != 0 ? getCustomerDevice2.__typename : str, (i2 & 2) != 0 ? getCustomerDevice2.appVersion : str2, (i2 & 4) != 0 ? getCustomerDevice2.channelId : str3, (i2 & 8) != 0 ? getCustomerDevice2.currentDevice : bool, (i2 & 16) != 0 ? getCustomerDevice2.deviceInfo : str4, (i2 & 32) != 0 ? getCustomerDevice2.deviceModel : str5, (i2 & 64) != 0 ? getCustomerDevice2.deviceType : str6, (i2 & 128) != 0 ? getCustomerDevice2.f100187id : bigDecimal, (i2 & C11398b.f33139r) != 0 ? getCustomerDevice2.isTrusted : str7, (i2 & C11398b.f33140s) != 0 ? getCustomerDevice2.languageCode : str8, (i2 & C11398b.f33141t) != 0 ? getCustomerDevice2.lastLoginDate : bigDecimal2, (i2 & C11398b.f33142u) != 0 ? getCustomerDevice2.registrationDate : str9, (i2 & C11398b.f33143v) != 0 ? getCustomerDevice2.status : str10, (i2 & 8192) != 0 ? getCustomerDevice2.trustDate : bigDecimal3, (i2 & 16384) != 0 ? getCustomerDevice2.unTrustDate : bigDecimal4);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component10() {
            return this.languageCode;
        }

        public final BigDecimal component11() {
            return this.lastLoginDate;
        }

        public final String component12() {
            return this.registrationDate;
        }

        public final String component13() {
            return this.status;
        }

        public final BigDecimal component14() {
            return this.trustDate;
        }

        public final BigDecimal component15() {
            return this.unTrustDate;
        }

        public final String component2() {
            return this.appVersion;
        }

        public final String component3() {
            return this.channelId;
        }

        public final Boolean component4() {
            return this.currentDevice;
        }

        public final String component5() {
            return this.deviceInfo;
        }

        public final String component6() {
            return this.deviceModel;
        }

        public final String component7() {
            return this.deviceType;
        }

        public final BigDecimal component8() {
            return this.f100187id;
        }

        public final String component9() {
            return this.isTrusted;
        }

        public final GetCustomerDevice copy(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, BigDecimal bigDecimal, String str7, String str8, BigDecimal bigDecimal2, String str9, String str10, BigDecimal bigDecimal3, BigDecimal bigDecimal4) {
            String str11 = str;
            C41536l.m120489i(str11, "__typename");
            return new GetCustomerDevice(str11, str2, str3, bool, str4, str5, str6, bigDecimal, str7, str8, bigDecimal2, str9, str10, bigDecimal3, bigDecimal4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetCustomerDevice)) {
                return false;
            }
            GetCustomerDevice getCustomerDevice = (GetCustomerDevice) obj;
            return C41536l.m120484d(this.__typename, getCustomerDevice.__typename) && C41536l.m120484d(this.appVersion, getCustomerDevice.appVersion) && C41536l.m120484d(this.channelId, getCustomerDevice.channelId) && C41536l.m120484d(this.currentDevice, getCustomerDevice.currentDevice) && C41536l.m120484d(this.deviceInfo, getCustomerDevice.deviceInfo) && C41536l.m120484d(this.deviceModel, getCustomerDevice.deviceModel) && C41536l.m120484d(this.deviceType, getCustomerDevice.deviceType) && C41536l.m120484d(this.f100187id, getCustomerDevice.f100187id) && C41536l.m120484d(this.isTrusted, getCustomerDevice.isTrusted) && C41536l.m120484d(this.languageCode, getCustomerDevice.languageCode) && C41536l.m120484d(this.lastLoginDate, getCustomerDevice.lastLoginDate) && C41536l.m120484d(this.registrationDate, getCustomerDevice.registrationDate) && C41536l.m120484d(this.status, getCustomerDevice.status) && C41536l.m120484d(this.trustDate, getCustomerDevice.trustDate) && C41536l.m120484d(this.unTrustDate, getCustomerDevice.unTrustDate);
        }

        public final String getAppVersion() {
            return this.appVersion;
        }

        public final String getChannelId() {
            return this.channelId;
        }

        public final Boolean getCurrentDevice() {
            return this.currentDevice;
        }

        public final String getDeviceInfo() {
            return this.deviceInfo;
        }

        public final String getDeviceModel() {
            return this.deviceModel;
        }

        public final String getDeviceType() {
            return this.deviceType;
        }

        public final BigDecimal getId() {
            return this.f100187id;
        }

        public final String getLanguageCode() {
            return this.languageCode;
        }

        public final BigDecimal getLastLoginDate() {
            return this.lastLoginDate;
        }

        public final String getRegistrationDate() {
            return this.registrationDate;
        }

        public final String getStatus() {
            return this.status;
        }

        public final BigDecimal getTrustDate() {
            return this.trustDate;
        }

        public final BigDecimal getUnTrustDate() {
            return this.unTrustDate;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.appVersion;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.channelId;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.currentDevice;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str3 = this.deviceInfo;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.deviceModel;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.deviceType;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            BigDecimal bigDecimal = this.f100187id;
            int hashCode8 = (hashCode7 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            String str6 = this.isTrusted;
            int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.languageCode;
            int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.lastLoginDate;
            int hashCode11 = (hashCode10 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
            String str8 = this.registrationDate;
            int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.status;
            int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
            BigDecimal bigDecimal3 = this.trustDate;
            int hashCode14 = (hashCode13 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
            BigDecimal bigDecimal4 = this.unTrustDate;
            if (bigDecimal4 != null) {
                i = bigDecimal4.hashCode();
            }
            return hashCode14 + i;
        }

        public final String isTrusted() {
            return this.isTrusted;
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42655xe245fd8(this);
        }

        public String toString() {
            return "GetCustomerDevice(__typename=" + this.__typename + ", appVersion=" + this.appVersion + ", channelId=" + this.channelId + ", currentDevice=" + this.currentDevice + ", deviceInfo=" + this.deviceInfo + ", deviceModel=" + this.deviceModel + ", deviceType=" + this.deviceType + ", id=" + this.f100187id + ", isTrusted=" + this.isTrusted + ", languageCode=" + this.languageCode + ", lastLoginDate=" + this.lastLoginDate + ", registrationDate=" + this.registrationDate + ", status=" + this.status + ", trustDate=" + this.trustDate + ", unTrustDate=" + this.unTrustDate + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GetCustomerDevice(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, BigDecimal bigDecimal, String str7, String str8, BigDecimal bigDecimal2, String str9, String str10, BigDecimal bigDecimal3, BigDecimal bigDecimal4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "CustomerDevice" : str, str2, str3, bool, str4, str5, str6, bigDecimal, str7, str8, bigDecimal2, str9, str10, bigDecimal3, bigDecimal4);
        }
    }
}

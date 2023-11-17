package p341ge.bog.mobilebank.rest.model;

import android.text.TextUtils;
import p341ge.bog.mobilebank.rest.BankApi;

/* renamed from: ge.bog.mobilebank.rest.model.BogUrlHelper */
public class BogUrlHelper {
    public static final String CHANNEL_MOBILE = "MOBILE";
    public static final String CHANNEL_MOBILE_EXT = "MOBILE-EXT";
    public static final String USER_ID = "MOBILE";
    public static final String USER_ID_EXT = "extmobile";
    public static final String[] essServicesAlwaysCalledWithExtCustId = {"mep-bog-payment3desint-authorize", "mep-bog-payment3desext-authorize", "mep-bog-payment3des-status", "mep-bog-payment3des-get-data", "mep-bog-payment3desint-create"};
    public static final String[] externalServices = {BankApi.SERVICE_PAYMENTS_EXECUTE, BankApi.TEMPLATES_DELETE_TEMPLATE, BankApi.TEMPLATES_MODIFY_TEMPLATE, BankApi.COLLECTOR_MODIFY_TEMPLATE_GROUP, BankApi.SERVICE_PAYMENTS_LAST_OPERATIONS, BankApi.SERVICE_COLLECTOR_GET_TEMPLATES_AND_CONFIG, BankApi.TEMPLATES_UPDATE_TEMPLATE_GROUP_LINK, BankApi.SERVICE_GET_SELECTED_PAYMENTS, BankApi.SERVICE_SEARCH_DATA, "PAYMENTS_GET_CAR_FINES", BankApi.COMMON_GET_CLIENT_CARDS, BankApi.PAYMENTS_GET_PAYMENT_HISTORY_PDF, BankApi.COLLECTOR_GET_MY_OPERATION_PDF, BankApi.DEBITS_GET_PROVIDERS_AND_SERVICES, "COMMON_GET_SETTINGS", BankApi.COMMON_GET_SC_OBJECTS, BankApi.COMMON_GET_COMMERCIAL_RATE_AMOUNT, BankApi.COMMON_CHANGE_DEVICE_LANGUAGE, BankApi.COMMON_GET_SC_ROUTES};
    private static int requestIndex = 0;
    public static final String[] servicesAlwaysCalledWithExtCustId = {BankApi.COMMON_GET_CLIENT_CARDS, BankApi.COMMON_DELETE_CLIENT_CARD, BankApi.COMMON_SET_CLIENT_CARD, BankApi.COMMON_LOAD_MOBILE_DATA, BankApi.COMMON_CHANGE_DEVICE_LANGUAGE, "CLIENTS_GET_CLIENT_INFO_V3", BankApi.IDENTITY_TRUST_DEVICE, BankApi.SMSNOTIFS_GET_NOTIFICATION_HIERARCHY, BankApi.SMSNOTIFS_GET_NOTIFICATION_SETS, BankApi.SERVICE_COMMON_TRIGGER_LOGIN_CHANGES};
    public static final String[] strictlyExternalServices = {BankApi.COMMON_DELETE_CLIENT_CARD, BankApi.COMMON_SET_CLIENT_CARD, BankApi.COMMON_LOAD_MOBILE_DATA, BankApi.IDENTITY_GET_PASS_POLICY_RULES};
    private final String essServiceId;
    private final boolean isUserLoggedIn;
    private String mChannel = "MOBILE";
    private String mUserID = "MOBILE";
    private final String serviceID;

    public BogUrlHelper(String str, String str2, boolean z) {
        this.essServiceId = str2;
        this.isUserLoggedIn = z;
        this.serviceID = str;
        if ((!z && isExternalService(str)) || isStrictlyExternalService(str, str2)) {
            this.mChannel = CHANNEL_MOBILE_EXT;
            this.mUserID = USER_ID_EXT;
        }
    }

    public static String getChannel(boolean z) {
        return z ? "MOBILE" : CHANNEL_MOBILE_EXT;
    }

    public static synchronized int getNextRequestIndex() {
        int i;
        synchronized (BogUrlHelper.class) {
            i = requestIndex;
            requestIndex = i + 1;
        }
        return i;
    }

    public boolean essServiceIdRequiresEXT() {
        if (TextUtils.isEmpty(this.essServiceId)) {
            return false;
        }
        for (String equals : essServicesAlwaysCalledWithExtCustId) {
            if (equals.equals(this.essServiceId)) {
                return true;
            }
        }
        return false;
    }

    public String getUserID() {
        return this.mUserID;
    }

    public boolean isExternalService(String str) {
        boolean z = false;
        for (String equals : externalServices) {
            if (equals.equals(str)) {
                z = true;
            }
        }
        return z;
    }

    public boolean isStrictlyExternalService(String str, String str2) {
        boolean z;
        String[] strArr = strictlyExternalServices;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (strArr[i].equals(str)) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (!z && !TextUtils.isEmpty(str2)) {
            for (String equals : essServicesAlwaysCalledWithExtCustId) {
                if (equals.equals(str2)) {
                    return true;
                }
            }
        }
        return z;
    }

    public boolean shouldAttachExtCustomerId() {
        boolean z;
        String[] strArr = servicesAlwaysCalledWithExtCustId;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (strArr[i].equals(this.serviceID)) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (!z && !TextUtils.isEmpty(this.essServiceId)) {
            String[] strArr2 = essServicesAlwaysCalledWithExtCustId;
            int length2 = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    break;
                } else if (strArr2[i2].equals(this.essServiceId)) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (!this.isUserLoggedIn || z) {
            return true;
        }
        return false;
    }

    public String getChannel() {
        return this.mChannel;
    }
}

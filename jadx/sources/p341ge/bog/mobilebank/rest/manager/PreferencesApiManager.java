package p341ge.bog.mobilebank.rest.manager;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.location.Location;
import android.text.TextUtils;
import ba1.C10146d0;
import com.google.gson.C5490d;
import com.google.gson.Gson;
import g91.C32312j;
import he1.C41224m;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jg1.C41438c;
import k30.C25628b;
import n41.C37350a;
import n41.C37353c;
import p316xa.C8982a;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p341ge.bog.mobilebank.cleanarch.utm.data.entity.UtmParamsEntity;
import p341ge.bog.mobilebank.eventbus.event.CcyRatesSyncSuccessEvent;
import p341ge.bog.mobilebank.model.CcyRatesWrapper;
import p341ge.bog.mobilebank.model.map.MapObject;
import p341ge.bog.mobilebank.model.map.MapObjectWrapper;
import p341ge.bog.mobilebank.model.search.SearchPreferenceObject;
import p341ge.bog.mobilebank.model.search.SearchResultHeader;
import p341ge.bog.mobilebank.model.search.SearchResultObject;
import p341ge.bog.mobilebank.model.search.SearchResultType;
import p341ge.bog.mobilebank.model.search.result.CcySearchResult;
import p341ge.bog.mobilebank.model.search.result.ContactSearchResult;
import p341ge.bog.mobilebank.model.search.result.CustomerProdSearchResult;
import p341ge.bog.mobilebank.model.search.result.MapObjectSearchResult;
import p341ge.bog.mobilebank.model.search.result.ProviderSearchResultObject;
import p341ge.bog.mobilebank.model.search.result.StatementSearchResult;
import p341ge.bog.mobilebank.model.search.result.TemplateGroupSearchResult;
import p341ge.bog.mobilebank.model.search.result.TemplateSearchResult;
import p341ge.bog.mobilebank.rest.model.DarkModeType;
import p341ge.bog.mobilebank.rest.model.GooglePayState;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;

/* renamed from: ge.bog.mobilebank.rest.manager.PreferencesApiManager */
public class PreferencesApiManager implements C37350a {
    private static final String AMEX_OFFER_CLOSE_DATE = "AMEX_OFFER_CLOSE_DATE";
    public static final String AMOUNT_COLLAPSED = "AMOUNT_COLLAPSED";
    public static final String AMOUNT_HIDDEN = "AMOUNT_HIDDEN";
    private static final String APP_VERSION_CODE = "APP_VERSION_CODE";
    private static final String BECOME_SOLO_BANNER_SHOWN = "BECOME_SOLO_BANNER_SHOWN";
    private static final String BIRTHDAY_POPUP_CLOSE_DATE = "BIRTHDAY_POPUP_CLOSE_DATE";
    private static final String BNPL_WELCOME_PAGE = "BNPL_WELCOME_PAGE";
    public static final String CALCULATE_LIMITS_POPUP_DATE = "CALCULATE_LIMITS_POPUP_DATE";
    public static final String CAN_SUPPORT_GOOGLE_PAY = "CAN_SUPPORT_GOOGLE_PAY";
    private static final String CCY_WRAPPER = "CCY_WRAPPER";
    private static final String CLIENT_KEY = "CLIENT_KEY";
    private static final String CONTACTS_LAST_SYNC_DATE = "CONTACTS_LAST_SYNC_DATE";
    private static final String CREDIT_APPLICATION_NOTIFICATION_CLOSE_DATE = "CREDIT_APPLICATION_NOTIFICATION_CLOSE_DATE";
    private static final String CREDIT_INFO_BANNER_SHOWN = "CREDIT_INFO_BANNER_SHOWN";
    private static final String CREDIT_INFO_REGISTER_BANNER_IN_OFFERS_SHOWN = "CREDIT_INFO_REGISTER_BANNER_IN_OFFERS_SHOWN";
    private static final String CURRENT_DB_VERSION = "CURRENT_DB_VERSION";
    public static final String DARK_MODE_POPUP = "DARK_MODE_POPUP";
    public static final String DARK_MODE_TYPE = "DARK_MODE_TYPE";
    private static final String DATA_LAST_REPORT_TIME = "DATA_LAST_REPORT_TIME";
    private static final String DATA_REPORT_PERIOD = "DATA_REPORT_PERIOD";
    private static final String DEBUG_THEME = "DEBUG_THEME";
    private static final Long DEFAULT_TIMEOUT_LOCATION_PERMISSION = 2592000000L;
    private static final Long DEFAULT_TIMEOUT_NOTIFICATION_PERMISSION = 2592000000L;
    private static final String DENIED_PERMISSION = "DENIED_PERMISSION";
    private static final String DICTIONARY_HASH_CODE = "DICTIONARY_HASH_CODE";
    private static final String DID_CLOSE_CONTACT_US_HINT = "DID_CLOSE_CONTACT_US_HINT";
    private static final String DIGITAL_CARD_BANNER_SHOWN = "DIGITAL_CARD_BANNER_SHOWN";
    public static final String EXPIRING_CARD_POPUP = "EXPIRING_CARD_POPUP";
    private static final String EXTERNAL_USER_ALIAS = "EXTERNAL_USER_ALIAS";
    private static final String FCM_SAVE_VERSION = "FCM_SAVE_VERSION";
    private static final String FCM_TOKEN = "FCM_TOKEN";
    public static final String FILTER_KEY_WORDS = "FILTER_KEY_WORDS";
    private static final String GEOFENCE_ENABLED = "GEOFENCE_ENABLED";
    private static final String GOOGLE_PAY_BANNER = "GOOGLE_PAY_BANNER";
    public static final String GOOGLE_PAY_POPUP_DATE = "GOOGLE_PAY_POPUP_DATE";
    private static final String HIDE_OFFER_BANNER = "HIDE_OFFER_BANNER";
    private static final String IS_ACCOUNT_SWIPED = "IS_ACCOUNT_SWIPED";
    private static final String IS_BUDGETING_TIP_SHOWN = "IS_BUDGETING_TIP_SHOWN";
    private static final String IS_CONTACT_SWIPED = "IS_CONTACT_SWIPED";
    private static final String IS_FAVORITE_HINT_SHOWN = "IS_FAVORITE_HINT_SHOWN";
    private static final String IS_FINGERPRINT_ENABLED = "IS_FINGERPRINT_ENABLED";
    public static final String IS_NEW_YEAR_CAMPAIGN_SHOWN = "IS_NEW_YEAR_CAMPAIGN_SHOWN";
    private static final String IS_PASS_CODE_ENABLED = "IS_PASS_CODE_ENABLED";
    private static final String IS_SOLO_CLUB = "IS_SOLO_CLUB";
    private static final String IS_SOLO_X = "IS_SOLO_X";
    private static final String JUNIOR_POPUP_CLOSE_DATE = "JUNIOR_POPUP_CLOSE_DATE";
    public static final String KEY_MOBILE_PAYMENT_PERRMISSION = "KEY_MOBILE_PAYMENT_PERRMISSION";
    private static final String LAST_EASY_LOGIN_OFFER_DATE = "LAST_EASY_LOGIN_OFFER_DATE";
    private static final String LAST_KNOWN_LOCATION = "LAST_KNOWN_LOCATION";
    public static final String LAST_SHOWN_IBAN_INFO = "LAST_SHOWN_IBAN_INFO";
    private static final String LAST_SYNC_DATE = "LAST_SYNC_DATE";
    private static final String LAST_USED_EXT_ID = "LAST_USED_EXT_ID";
    public static final String LIABILITY_OVERDUE_POP_UP_DATE = "LAST_SHOWN_LIABILITY_OVERDUE_POP_UP";
    private static final String LOCATION_PERMISSION_TIMEOUT = "LOCATION_PERMISSION_TIMEOUT";
    private static final String LOG_ANALYTICS = "LOG_ANALYTICS";
    private static final String LOG_HTTP_REQUESTS = "LOG_HTTP_REQUESTS";
    private static final String MAPS_LAST_SYNC_DATE = "MAPS_LAST_SYNC_DATE";
    private static final String MAP_OBJECTS = "MAP_OBJECTS";
    public static final String MEDALLIA_LAST_INTERCEPT_TIME = "MEDALLIA_LAST_INTERCEPT_TIME";
    private static final String NOTIFICATION_PERMISSION_TIME = "NOTIFICATION_PERMISSION_TIME";
    private static final String RECENT_SEARCHES = "RECENT_SEARCHES";
    private static final String REFERRALS_POPUP_CLOSE_DATE = "REFERRALS_POPUP_CLOSE_DATE";
    private static final String REFERRALS_POPUP_SHOW_COUNT = "REFERRALS_POPUP_SHOW_COUNT";
    private static final String SAVED_CLIENT_SEGMENT = "SAVED_CLIENT_SEGMENT";
    private static final String SAVED_USER_THEME = "SAVED_USER_THEME";
    public static final String SHOW_P2P_HELP_REFERENCE = "SHOW_P2P_INFO_REFERENCE";
    public static final String SHOW_P2P_TOOLTIP_COUNTER = "SHOW_P2P_TOOLTIP_COUNTER";
    private static final String SHOW_PLUS_OFFER_DIALOG = "SHOW_PLUS_OFFER_DIALOG";
    private static final String SHOW_USERNAME = "SHOW_USERNAME";
    private static final String SMS_TO_PUSH = "SMS_TO_PUSH";
    private static final String STATUSES_FIRST_VISITED = "STATUSES_FIRST_VISITED";
    private static final String STUDENT_CARD_BANNER_SHOWN = "STUDENT_CARD_BANNER_SHOWN";
    private static final String SWIPE_MONEY_REQUEST_RECEIVER_ITEM = "SWIPE_MONEY_REQUEST_RECEIVER_ITEM";
    private static final String TEMP_USERNAME = "TEMP_USERNAME";
    private static final String TERMS_ACCEPTED = "TERMS_ACCEPTED";
    private static final String THEME_TYPE = "THEME_TYPE";
    private static final String TRANSFER_SHOW_FAVORITE_ACCOUNT_TOOLTIP = "TRANSFER_SHOW_FAVORITE_ACCOUNT_TOOLTIP";
    private static final String UPDATE_LANGUAGE = "UPDATE_LANGUAGE";
    private static final String USERNAME = "USERNAME";
    private static final String USER_FIRST_NAME_EN = "USER_FIRST_NAME_EN";
    private static final String USER_FIRST_NAME_GE = "USER_FIRST_NAME_GE";
    private static final String USER_FULL_NAME_EN = "USER_FULL_NAME_EN";
    private static final String USER_FULL_NAME_GE = "USER_FULL_NAME_GE";
    private static final String USER_ID = "USER_ID";
    private static final String USER_VOCATIVE_NAME_EN = "USER_VOCATIVE_NAME_EN";
    private static final String USER_VOCATIVE_NAME_KA = "USER_VOCATIVE_NAME_KA";
    private static final String UTM_PARAMS = "UTM_PARAMS";
    private static PreferencesApiManager instance;
    private final TargetEnvironment environment;
    private final C37350a languageStore;
    private final SharedPreferences.Editor mEditor;
    private final C41438c mEventBus;
    private final SharedPreferences mSharedPreferences;

    /* renamed from: ge.bog.mobilebank.rest.manager.PreferencesApiManager$3 */
    static /* synthetic */ class C345403 {
        static final /* synthetic */ int[] $SwitchMap$ge$bog$mobilebank$model$search$SearchResultType;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|(3:25|26|28)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                ge.bog.mobilebank.model.search.SearchResultType[] r0 = p341ge.bog.mobilebank.model.search.SearchResultType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$ge$bog$mobilebank$model$search$SearchResultType = r0
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_TEMPLATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$ge$bog$mobilebank$model$search$SearchResultType     // Catch:{ NoSuchFieldError -> 0x001d }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_TEMPLATE_GROUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$ge$bog$mobilebank$model$search$SearchResultType     // Catch:{ NoSuchFieldError -> 0x0028 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_PAYMENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$ge$bog$mobilebank$model$search$SearchResultType     // Catch:{ NoSuchFieldError -> 0x0033 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_CURRENCY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$ge$bog$mobilebank$model$search$SearchResultType     // Catch:{ NoSuchFieldError -> 0x003e }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_CONTACT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$ge$bog$mobilebank$model$search$SearchResultType     // Catch:{ NoSuchFieldError -> 0x0049 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_DEPOSIT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$ge$bog$mobilebank$model$search$SearchResultType     // Catch:{ NoSuchFieldError -> 0x0054 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_BOND     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$ge$bog$mobilebank$model$search$SearchResultType     // Catch:{ NoSuchFieldError -> 0x0060 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_ACCOUNT_AND_CARDS     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$ge$bog$mobilebank$model$search$SearchResultType     // Catch:{ NoSuchFieldError -> 0x006c }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_CREDIT_CARD     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$ge$bog$mobilebank$model$search$SearchResultType     // Catch:{ NoSuchFieldError -> 0x0078 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_LOANS     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$ge$bog$mobilebank$model$search$SearchResultType     // Catch:{ NoSuchFieldError -> 0x0084 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_DEBITS     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = $SwitchMap$ge$bog$mobilebank$model$search$SearchResultType     // Catch:{ NoSuchFieldError -> 0x0090 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_MY_OPERATIONS     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = $SwitchMap$ge$bog$mobilebank$model$search$SearchResultType     // Catch:{ NoSuchFieldError -> 0x009c }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_LOCATION     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.rest.manager.PreferencesApiManager.C345403.<clinit>():void");
        }
    }

    @SuppressLint({"CommitPrefEdits"})
    public PreferencesApiManager(SharedPreferences sharedPreferences, C41438c cVar, C37350a aVar, TargetEnvironment targetEnvironment) {
        this.mSharedPreferences = sharedPreferences;
        this.mEditor = sharedPreferences.edit();
        this.mEventBus = cVar;
        this.languageStore = aVar;
        this.environment = targetEnvironment;
        instance = this;
    }

    public static PreferencesApiManager getInstance() {
        return instance;
    }

    public void clearAllData() {
        this.mSharedPreferences.edit().clear().commit();
    }

    public void clearHiddenOffers() {
        for (String next : this.mSharedPreferences.getAll().keySet()) {
            if (next.startsWith(HIDE_OFFER_BANNER)) {
                this.mEditor.remove(next);
            }
        }
        this.mEditor.commit();
    }

    public void clearHttpLogging() {
        this.mEditor.remove("release#LOG_HTTP_REQUESTS");
        this.mEditor.commit();
    }

    public void clearRecentSearches(String str) {
        if (str != null) {
            this.mEditor.putString(RECENT_SEARCHES.concat(str), "");
            this.mEditor.commit();
        }
    }

    public void collapseAmount(String str, boolean z) {
        SharedPreferences.Editor editor = this.mEditor;
        editor.putBoolean("AMOUNT_COLLAPSED#" + str, z);
        this.mEditor.apply();
    }

    public boolean deviceCanSupportGooglePay() {
        return getGooglePayState() != GooglePayState.NOT_AVAILABLE;
    }

    public Set<String> getAllDismissedOffers(String str) {
        return this.mSharedPreferences.getStringSet(str, (Set) null);
    }

    public Long getAmexOfferPopupCloseDate() {
        return Long.valueOf(this.mSharedPreferences.getLong(AMEX_OFFER_CLOSE_DATE, -1));
    }

    public int getAppVersionCode() {
        return this.mSharedPreferences.getInt(APP_VERSION_CODE, -1);
    }

    public String getAuthToken(String str) {
        return this.mSharedPreferences.getString(str, "");
    }

    public int getBirthdayPopupCloseYear(long j) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        return sharedPreferences.getInt("BIRTHDAY_POPUP_CLOSE_DATE#" + j, -1);
    }

    public CcyRatesWrapper getCcyRates() {
        Gson gson = new Gson();
        String string = this.mSharedPreferences.getString(CCY_WRAPPER, (String) null);
        if (string != null) {
            return (CcyRatesWrapper) gson.mo18170l(string, CcyRatesWrapper.class);
        }
        return null;
    }

    public String getClientKey() {
        return this.mSharedPreferences.getString(CLIENT_KEY, "");
    }

    public String getClientSegment() {
        return this.mSharedPreferences.getString(SAVED_CLIENT_SEGMENT, "");
    }

    public long getCommonDataLastSyncDate() {
        return this.mSharedPreferences.getLong(LAST_SYNC_DATE, 0);
    }

    public long getContactsLastSyncDate() {
        return this.mSharedPreferences.getLong(CONTACTS_LAST_SYNC_DATE, 0);
    }

    public long getCreditApplicationNotificationCloseDay(long j) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        return sharedPreferences.getLong("CREDIT_APPLICATION_NOTIFICATION_CLOSE_DATE#" + j, -1);
    }

    public int getCurrentDBVersion() {
        return this.mSharedPreferences.getInt(CURRENT_DB_VERSION, 0);
    }

    public DarkModeType getDarkModeType() {
        return DarkModeType.valueOf(this.mSharedPreferences.getString(DARK_MODE_TYPE, DarkModeType.AUTO.name()));
    }

    public int getDataReportInterval(String str) {
        return this.mSharedPreferences.getInt("DATA_REPORT_PERIOD#" + str, -1);
    }

    public int getDebugTheme() {
        return this.mSharedPreferences.getInt(DEBUG_THEME, 0);
    }

    public long getDictionaryHashCode() {
        return this.mSharedPreferences.getLong(DICTIONARY_HASH_CODE, 0);
    }

    public boolean getDidCloseContactUsHint() {
        return this.mSharedPreferences.getBoolean(DID_CLOSE_CONTACT_US_HINT, false);
    }

    public long getEasyLoginOfferDate() {
        return this.mSharedPreferences.getLong(LAST_EASY_LOGIN_OFFER_DATE, -1);
    }

    public String getExtCustomer() {
        return getExtCustomer(false);
    }

    public String getFcmToken() {
        return this.mSharedPreferences.getString(FCM_TOKEN, "");
    }

    public String getFirstName() {
        String str;
        if (!TextUtils.isEmpty(getVocative())) {
            return getVocative();
        }
        if (getUsername().equals("")) {
            return "";
        }
        if (getLanguage() == C37353c.KA) {
            str = USER_FIRST_NAME_GE;
        } else {
            str = USER_FIRST_NAME_EN;
        }
        return this.mSharedPreferences.getString(str, (String) null);
    }

    public String getFullName() {
        String str;
        if (getUsername().equals("")) {
            return "";
        }
        if (getLanguage() == C37353c.KA) {
            str = USER_FULL_NAME_GE;
        } else {
            str = USER_FULL_NAME_EN;
        }
        return this.mSharedPreferences.getString(str, (String) null);
    }

    public Long getGooglePayPopupCloseDate(String str) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        return Long.valueOf(sharedPreferences.getLong("GOOGLE_PAY_POPUP_DATE#" + str, -1));
    }

    public GooglePayState getGooglePayState() {
        return GooglePayState.fromName(this.mSharedPreferences.getString(CAN_SUPPORT_GOOGLE_PAY, GooglePayState.NOT_AVAILABLE.name()));
    }

    public boolean getIsBudgetingTipShown() {
        return this.mSharedPreferences.getBoolean(IS_BUDGETING_TIP_SHOWN, false);
    }

    public boolean getIsSoloClub() {
        return this.mSharedPreferences.getBoolean(IS_SOLO_CLUB, false);
    }

    public boolean getIsSoloX() {
        return this.mSharedPreferences.getBoolean(IS_SOLO_X, false);
    }

    public Long getJuniorPopUpCloseDate(String str) {
        return Long.valueOf(this.mSharedPreferences.getLong(JUNIOR_POPUP_CLOSE_DATE, -1));
    }

    public C37353c getLanguage() {
        return this.languageStore.getLanguage();
    }

    public long getLastDataReportTime(String str) {
        return this.mSharedPreferences.getLong("DATA_LAST_REPORT_TIME#" + str, -1);
    }

    public Location getLastKnowLocation() {
        String string = this.mSharedPreferences.getString(LAST_KNOWN_LOCATION, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String[] split = string.split("#");
        Location location = new Location(split[0]);
        location.setLatitude(Double.parseDouble(split[1]));
        location.setLongitude(Double.parseDouble(split[2]));
        location.setAltitude(Double.parseDouble(split[3]));
        return location;
    }

    public long getLastShowCalculateLimitsPopupDate(long j) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        return sharedPreferences.getLong("CALCULATE_LIMITS_POPUP_DATE#" + j, -1);
    }

    public long getLastShowLiabilityOverduePopupDate() {
        return this.mSharedPreferences.getLong(LIABILITY_OVERDUE_POP_UP_DATE, -1);
    }

    public String getLastShownIbanInfo() {
        return this.mSharedPreferences.getString(LAST_SHOWN_IBAN_INFO, "");
    }

    public long getLastTimeExpiringCardPopupWasShown(long j) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        return sharedPreferences.getLong("EXPIRING_CARD_POPUP#" + j, 0);
    }

    public String getLastUsedExtCustId() {
        return this.mSharedPreferences.getString(LAST_USED_EXT_ID, "");
    }

    public C41224m getLifestyleChooserPopupHiddenData(String str) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        int i = sharedPreferences.getInt("LIFESTYLE_CHOOSER_HIDE_POPUP_COUNT#" + str, 0);
        SharedPreferences sharedPreferences2 = this.mSharedPreferences;
        return new C41224m(Integer.valueOf(i), Long.valueOf(sharedPreferences2.getLong("LIFESTYLE_CHOOSER_POPUP#" + str, 0)));
    }

    public MapObjectWrapper getMapObjects() {
        Gson gson = new Gson();
        MapObjectWrapper mapObjectWrapper = null;
        String string = this.mSharedPreferences.getString(MAP_OBJECTS, (String) null);
        if (string != null) {
            mapObjectWrapper = new MapObjectWrapper();
            mapObjectWrapper.setMapObjects((List) gson.mo18171m(string, new C8982a<ArrayList<MapObject>>() {
            }.getType()));
            for (String str : C32312j.f79731a) {
                ArrayList arrayList = new ArrayList();
                for (MapObject next : mapObjectWrapper.getMapObjects()) {
                    if (next.getObjectType() != null && next.getObjectType().startsWith(str)) {
                        arrayList.add(next);
                    }
                }
                mapObjectWrapper.addMapObjectsByType(str, arrayList);
            }
        }
        return mapObjectWrapper;
    }

    public long getMapsLastSyncDate() {
        return this.mSharedPreferences.getLong(MAPS_LAST_SYNC_DATE, 0);
    }

    public long getMedalliaLastInterceptTime() {
        return this.mSharedPreferences.getLong(MEDALLIA_LAST_INTERCEPT_TIME, 0);
    }

    public int getP2pToolTipCounter() {
        return this.mSharedPreferences.getInt(SHOW_P2P_TOOLTIP_COUNTER, 1);
    }

    public ArrayList<SearchResultObject> getRecentSearches(String str) {
        SearchResultObject searchResultObject;
        ArrayList<SearchResultObject> arrayList = new ArrayList<>();
        if (str != null) {
            Gson gson = new Gson();
            String string = this.mSharedPreferences.getString(RECENT_SEARCHES.concat(str), "");
            if (!string.equals("")) {
                ArrayList arrayList2 = (ArrayList) gson.mo18171m(string, new C8982a<ArrayList<SearchPreferenceObject>>() {
                }.getType());
                if (arrayList2.size() != 0) {
                    arrayList.add(new SearchResultHeader(SearchResultType.TYPE_SEARCH_RESULTS_HEADER, SearchResultType.TYPE_RECENT_SEARCH));
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    SearchPreferenceObject searchPreferenceObject = (SearchPreferenceObject) it.next();
                    switch (C345403.$SwitchMap$ge$bog$mobilebank$model$search$SearchResultType[searchPreferenceObject.getSearchObjectType().ordinal()]) {
                        case 1:
                            searchResultObject = (SearchResultObject) gson.mo18170l(searchPreferenceObject.getSearchResultObjectJson(), TemplateSearchResult.class);
                            break;
                        case 2:
                            searchResultObject = (SearchResultObject) gson.mo18170l(searchPreferenceObject.getSearchResultObjectJson(), TemplateGroupSearchResult.class);
                            break;
                        case 3:
                            searchResultObject = (SearchResultObject) gson.mo18170l(searchPreferenceObject.getSearchResultObjectJson(), ProviderSearchResultObject.class);
                            break;
                        case 4:
                            searchResultObject = (SearchResultObject) gson.mo18170l(searchPreferenceObject.getSearchResultObjectJson(), CcySearchResult.class);
                            break;
                        case 5:
                            searchResultObject = (SearchResultObject) gson.mo18170l(searchPreferenceObject.getSearchResultObjectJson(), ContactSearchResult.class);
                            break;
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                            searchResultObject = (SearchResultObject) gson.mo18170l(searchPreferenceObject.getSearchResultObjectJson(), CustomerProdSearchResult.class);
                            break;
                        case 12:
                            searchResultObject = (SearchResultObject) gson.mo18170l(searchPreferenceObject.getSearchResultObjectJson(), StatementSearchResult.class);
                            break;
                        case 13:
                            searchResultObject = (SearchResultObject) gson.mo18170l(searchPreferenceObject.getSearchResultObjectJson(), MapObjectSearchResult.class);
                            break;
                        default:
                            searchResultObject = null;
                            break;
                    }
                    arrayList.add(searchResultObject);
                }
            }
        }
        return arrayList;
    }

    public Long getReferralsPopupCloseDate() {
        return Long.valueOf(this.mSharedPreferences.getLong(REFERRALS_POPUP_CLOSE_DATE, -1));
    }

    public int getReferralsPopupShowCount() {
        return this.mSharedPreferences.getInt(REFERRALS_POPUP_SHOW_COUNT, 0);
    }

    public String getSavedFcmByDeviceId(String str) {
        return this.mSharedPreferences.getString(str, (String) null);
    }

    @Deprecated
    public String getServerUrl() {
        return this.environment.getRbMiddleware();
    }

    public boolean getShouldUpdateLanguage() {
        return this.mSharedPreferences.getBoolean(UPDATE_LANGUAGE, false);
    }

    public boolean getShowFavoriteAccountTooltip() {
        return this.mSharedPreferences.getBoolean(TRANSFER_SHOW_FAVORITE_ACCOUNT_TOOLTIP, true);
    }

    public Boolean getShowP2pHelpTooltip() {
        return Boolean.valueOf(this.mSharedPreferences.getBoolean(SHOW_P2P_HELP_REFERENCE, true));
    }

    public Boolean getStatusesFirstVisitedUser(String str) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        return Boolean.valueOf(sharedPreferences.getBoolean("STATUSES_FIRST_VISITED#" + str, false));
    }

    public int getSwipeTipCounts(String str) {
        return this.mSharedPreferences.getInt(str, -1);
    }

    public String getTempUsername() {
        return this.mSharedPreferences.getString(TEMP_USERNAME, "");
    }

    public boolean getTermsAccepted() {
        return this.mSharedPreferences.getBoolean(TERMS_ACCEPTED, false);
    }

    public int getThemeType() {
        if (isDebugThemeSet()) {
            return this.mSharedPreferences.getInt(DEBUG_THEME, 0);
        }
        return this.mSharedPreferences.getInt(THEME_TYPE, 0);
    }

    public String getUserID() {
        return this.mSharedPreferences.getString(USER_ID, (String) null);
    }

    public int getUserTheme() {
        return this.mSharedPreferences.getInt(SAVED_USER_THEME, -1);
    }

    public String getUsername() {
        return this.mSharedPreferences.getString(USERNAME, "");
    }

    public UtmParamsEntity getUtmParams() {
        try {
            return (UtmParamsEntity) new Gson().mo18170l(this.mSharedPreferences.getString(UTM_PARAMS, (String) null), UtmParamsEntity.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public String getVocative() {
        if (getLanguage() == C37353c.KA) {
            return this.mSharedPreferences.getString(USER_VOCATIVE_NAME_KA, (String) null);
        }
        return this.mSharedPreferences.getString(USER_VOCATIVE_NAME_EN, (String) null);
    }

    public boolean hasGeofenceEnabled() {
        return this.mSharedPreferences.getBoolean(GEOFENCE_ENABLED, false);
    }

    public void hideAmount(String str, boolean z) {
        SharedPreferences.Editor editor = this.mEditor;
        editor.putBoolean("AMOUNT_HIDDEN#" + str, z);
        this.mEditor.apply();
    }

    public void hideLifestyleChooserPopup(String str) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        int i = sharedPreferences.getInt("LIFESTYLE_CHOOSER_HIDE_POPUP_COUNT#" + str, 0);
        SharedPreferences.Editor editor = this.mEditor;
        editor.putInt("LIFESTYLE_CHOOSER_HIDE_POPUP_COUNT#" + str, i + 1);
        SharedPreferences.Editor editor2 = this.mEditor;
        editor2.putLong("LIFESTYLE_CHOOSER_POPUP#" + str, new Date().getTime());
        this.mEditor.commit();
    }

    public void hideOffer(OfferInfo offerInfo, String str) {
        SharedPreferences.Editor editor = this.mEditor;
        editor.putBoolean("HIDE_OFFER_BANNER#" + str + "#" + offerInfo.getUID(), true);
        this.mEditor.commit();
    }

    public void increaseReferralsPopupShowCount() {
        this.mEditor.putInt(REFERRALS_POPUP_SHOW_COUNT, this.mSharedPreferences.getInt(REFERRALS_POPUP_SHOW_COUNT, 0) + 1);
        this.mEditor.putLong(REFERRALS_POPUP_CLOSE_DATE, System.currentTimeMillis());
        this.mEditor.apply();
    }

    public boolean isAccountSwiped() {
        return this.mSharedPreferences.getBoolean(IS_ACCOUNT_SWIPED, false);
    }

    public boolean isAnalyticLoggingEnabled() {
        return this.mSharedPreferences.getBoolean("release#LOG_ANALYTICS", false);
    }

    public boolean isBnplWelcomePageSeen(String str) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        return sharedPreferences.getBoolean("BNPL_WELCOME_PAGE#" + str, false);
    }

    public boolean isCollapsedAmount(String str) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        return sharedPreferences.getBoolean("AMOUNT_COLLAPSED#" + str, true);
    }

    public boolean isContactSwiped() {
        return this.mSharedPreferences.getBoolean(IS_CONTACT_SWIPED, false);
    }

    public boolean isDebugThemeSet() {
        return this.mSharedPreferences.contains(DEBUG_THEME);
    }

    public boolean isFavoriteHintShown() {
        return this.mSharedPreferences.getBoolean(IS_FAVORITE_HINT_SHOWN, false);
    }

    public Boolean isFingerPrintEnabled() {
        return Boolean.valueOf(this.mSharedPreferences.getBoolean(IS_FINGERPRINT_ENABLED, false));
    }

    public boolean isGooglePayBannerHidden(String str) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        return sharedPreferences.getBoolean("GOOGLE_PAY_BANNER#" + str, false);
    }

    public boolean isGooglePayBannerHiddenForAccount(Long l) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        return sharedPreferences.getBoolean("GOOGLE_PAY_BANNER#" + l, false);
    }

    public boolean isHiddenAmount(String str) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        return sharedPreferences.getBoolean("AMOUNT_HIDDEN#" + str, false);
    }

    public boolean isHttpRequestsLoggingEnabled() {
        return this.mSharedPreferences.getBoolean("release#LOG_HTTP_REQUESTS", false);
    }

    public boolean isLocationPermissionTimeout() {
        if (System.currentTimeMillis() - this.mSharedPreferences.getLong(LOCATION_PERMISSION_TIMEOUT, 0) > DEFAULT_TIMEOUT_LOCATION_PERMISSION.longValue()) {
            return true;
        }
        return false;
    }

    public boolean isMoneyRequestReceiverItemSwiped() {
        return this.mSharedPreferences.getBoolean(SWIPE_MONEY_REQUEST_RECEIVER_ITEM, false);
    }

    public boolean isNotificationPermissionTimeout() {
        if (System.currentTimeMillis() - this.mSharedPreferences.getLong(NOTIFICATION_PERMISSION_TIME, 0) > DEFAULT_TIMEOUT_NOTIFICATION_PERMISSION.longValue()) {
            return true;
        }
        return false;
    }

    public boolean isOfferHidden(OfferInfo offerInfo, String str) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        return sharedPreferences.getBoolean("HIDE_OFFER_BANNER#" + str + "#" + offerInfo.getUID(), false);
    }

    public Boolean isPasscodeEnabled() {
        return Boolean.valueOf(this.mSharedPreferences.getBoolean(IS_PASS_CODE_ENABLED, false));
    }

    public boolean isPaymentMobilePermissionOffered() {
        return this.mSharedPreferences.getBoolean(KEY_MOBILE_PAYMENT_PERRMISSION, true);
    }

    public boolean isPermissionForeverDenied(String str) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        return sharedPreferences.getBoolean("DENIED_PERMISSION#" + str, false);
    }

    public void removeDebugThemeMode() {
        this.mEditor.remove(DEBUG_THEME);
        this.mEditor.commit();
    }

    public void resetUserRelatedData() {
        this.mEditor.putBoolean(SHOW_USERNAME, false);
        this.mEditor.putBoolean(IS_PASS_CODE_ENABLED, false);
        this.mEditor.putBoolean(IS_FINGERPRINT_ENABLED, false);
        this.mEditor.putString(USERNAME, (String) null);
        this.mEditor.putString(RECENT_SEARCHES, (String) null);
        this.mEditor.putString(USER_FIRST_NAME_GE, (String) null);
        this.mEditor.putString(USER_FIRST_NAME_EN, (String) null);
        this.mEditor.putString(USER_FULL_NAME_GE, (String) null);
        this.mEditor.putString(USER_FULL_NAME_EN, (String) null);
        this.mEditor.putString(EXTERNAL_USER_ALIAS, (String) null);
        this.mEditor.putString(TERMS_ACCEPTED, (String) null);
        this.mEditor.commit();
    }

    public void saveCheckSmsToPush(boolean z) {
        this.mEditor.putBoolean(SMS_TO_PUSH, z);
        this.mEditor.commit();
    }

    public void saveClientKey(String str) {
        this.mEditor.putString(CLIENT_KEY, str);
        this.mEditor.commit();
    }

    public void saveClientSegment(String str) {
        this.mEditor.putString(SAVED_CLIENT_SEGMENT, str);
        this.mEditor.commit();
    }

    public void saveEasyLoginOfferDate(long j) {
        this.mEditor.putLong(LAST_EASY_LOGIN_OFFER_DATE, j);
        this.mEditor.commit();
    }

    public void saveFcmByDeviceID(String str, String str2) {
        this.mEditor.putString(str, str2);
        this.mEditor.commit();
    }

    public void saveFcmToken(String str) {
        this.mEditor.putString(FCM_TOKEN, str);
        this.mEditor.commit();
    }

    public void saveStatusesFirstVisitedUser(String str) {
        SharedPreferences.Editor editor = this.mEditor;
        editor.putBoolean("STATUSES_FIRST_VISITED#" + str, true);
        this.mEditor.commit();
    }

    public void saveTempUsername(String str) {
        this.mEditor.putString(TEMP_USERNAME, str);
        this.mEditor.commit();
    }

    public void saveThemeType(int i) {
        this.mEditor.putInt(THEME_TYPE, i);
        this.mEditor.commit();
    }

    public void saveUserID(String str) {
        this.mEditor.putString(USER_ID, str);
        this.mEditor.commit();
    }

    public void saveUserName(String str) {
        this.mEditor.putString(USERNAME, str);
        this.mEditor.commit();
    }

    public void saveUserNames(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (getUsername().equals(str)) {
            this.mEditor.putString(USER_FIRST_NAME_GE, str2);
            this.mEditor.putString(USER_FULL_NAME_GE, str3);
            this.mEditor.putString(USER_FIRST_NAME_EN, str4);
            this.mEditor.putString(USER_FULL_NAME_EN, str5);
            this.mEditor.putString(USER_VOCATIVE_NAME_EN, str7);
            this.mEditor.putString(USER_VOCATIVE_NAME_KA, str6);
            this.mEditor.commit();
        }
    }

    public void saveUserTheme(int i) {
        this.mEditor.putInt(SAVED_USER_THEME, i);
        this.mEditor.commit();
    }

    public void saveUtmParams(UtmParamsEntity utmParamsEntity) {
        this.mEditor.putString(UTM_PARAMS, new Gson().mo18181w(utmParamsEntity));
        this.mEditor.commit();
    }

    public void setAllDismissedOffers(String str, Set<String> set) {
        this.mEditor.putStringSet(str, set);
        this.mEditor.commit();
    }

    public void setAmexOfferPopupCloseDate() {
        this.mEditor.putLong(AMEX_OFFER_CLOSE_DATE, System.currentTimeMillis());
        this.mEditor.commit();
    }

    public void setAnalyticLoggingEnabled(boolean z) {
        this.mEditor.putBoolean("release#LOG_ANALYTICS", z);
        this.mEditor.commit();
    }

    public void setAppVersionCode(int i) {
        this.mEditor.putInt(APP_VERSION_CODE, i);
        this.mEditor.commit();
    }

    public void setAuthToken(String str, String str2) {
        this.mEditor.putString(str, str2);
        this.mEditor.commit();
    }

    public void setBecomeSoloBannerShow(String str) {
        this.mEditor.putBoolean("BECOME_SOLO_BANNER_SHOWN#" + str, true);
        this.mEditor.commit();
    }

    public void setBirthDayPopUpCloseYear(int i, long j) {
        SharedPreferences.Editor editor = this.mEditor;
        editor.putInt("BIRTHDAY_POPUP_CLOSE_DATE#" + j, i);
        this.mEditor.commit();
    }

    public void setBnplWelcomePageSeen(String str) {
        SharedPreferences.Editor editor = this.mEditor;
        editor.putBoolean("BNPL_WELCOME_PAGE#" + str, true);
        this.mEditor.commit();
    }

    public void setCreditApplicationNotificationCloseDay(long j) {
        SharedPreferences.Editor editor = this.mEditor;
        editor.putLong("CREDIT_APPLICATION_NOTIFICATION_CLOSE_DATE#" + j, System.currentTimeMillis());
        this.mEditor.commit();
    }

    public void setCreditInfoBannerShown(String str) {
        this.mEditor.putBoolean("CREDIT_INFO_BANNER_SHOWN#" + str, true);
        this.mEditor.commit();
    }

    public void setCreditInfoRegisterBannerInOffersShown(String str) {
        this.mEditor.putBoolean("CREDIT_INFO_REGISTER_BANNER_IN_OFFERS_SHOWN#" + str, true);
        this.mEditor.commit();
    }

    public void setCurrentDBVersion(int i) {
        SharedPreferences.Editor edit = this.mSharedPreferences.edit();
        edit.putInt(CURRENT_DB_VERSION, i);
        edit.commit();
    }

    public void setDarkModePopupShown(long j) {
        SharedPreferences.Editor editor = this.mEditor;
        editor.putBoolean("DARK_MODE_POPUP#" + j, true);
        this.mEditor.commit();
    }

    public void setDarkModeType(DarkModeType darkModeType) {
        this.mEditor.putString(DARK_MODE_TYPE, darkModeType.name());
        this.mEditor.commit();
    }

    public void setDataReportInterval(String str, int i) {
        this.mEditor.putInt("DATA_REPORT_PERIOD#" + str, i);
        this.mEditor.commit();
    }

    public void setDataReportTime(String str, long j) {
        this.mEditor.putLong("DATA_LAST_REPORT_TIME#" + str, j);
        this.mEditor.commit();
    }

    public void setDebugTheme(int i) {
        this.mEditor.putInt(DEBUG_THEME, i);
        this.mEditor.commit();
    }

    public void setDictionaryHashCode(long j) {
        SharedPreferences.Editor edit = this.mSharedPreferences.edit();
        edit.putLong(DICTIONARY_HASH_CODE, j);
        edit.commit();
    }

    public void setDidCloseContactUsHint(boolean z) {
        this.mEditor.putBoolean(DID_CLOSE_CONTACT_US_HINT, z);
        this.mEditor.commit();
    }

    public void setDigitalCardBannerShown(String str) {
        this.mEditor.putBoolean("DIGITAL_CARD_BANNER_SHOWN#" + str, true);
        this.mEditor.commit();
    }

    public void setExtCustomer(String str) {
        this.mEditor.putString(EXTERNAL_USER_ALIAS, str);
        this.mEditor.commit();
    }

    public void setFavoriteAccountTooltipWasShown() {
        this.mEditor.putBoolean(TRANSFER_SHOW_FAVORITE_ACCOUNT_TOOLTIP, false);
        this.mEditor.commit();
    }

    public void setForeverDeniedPermission(String str) {
        SharedPreferences.Editor editor = this.mEditor;
        editor.putBoolean("DENIED_PERMISSION#" + str, true);
        this.mEditor.commit();
    }

    public void setGeofenceEnabled(boolean z) {
        this.mEditor.putBoolean(GEOFENCE_ENABLED, z);
        this.mEditor.commit();
    }

    public void setGooglePayPopupCloseDate(String str) {
        SharedPreferences.Editor editor = this.mEditor;
        editor.putLong("GOOGLE_PAY_POPUP_DATE#" + str, System.currentTimeMillis());
        this.mEditor.commit();
    }

    public void setGooglePayState(GooglePayState googlePayState) {
        this.mEditor.putString(CAN_SUPPORT_GOOGLE_PAY, googlePayState.name());
        this.mEditor.commit();
    }

    public void setHideGooglePayBanner(String str) {
        SharedPreferences.Editor editor = this.mEditor;
        editor.putBoolean("GOOGLE_PAY_BANNER#" + str, true);
        this.mEditor.commit();
    }

    public void setHideGooglePayBannerForAccount(Long l) {
        SharedPreferences.Editor editor = this.mEditor;
        editor.putBoolean("GOOGLE_PAY_BANNER#" + l, true);
        this.mEditor.commit();
    }

    public void setHttpRequestLoggingEnabled(boolean z) {
        this.mEditor.putBoolean("release#LOG_HTTP_REQUESTS", z);
        this.mEditor.commit();
    }

    public void setIsAccountSwiped() {
        this.mEditor.putBoolean(IS_ACCOUNT_SWIPED, true);
        this.mEditor.commit();
    }

    public void setIsBudgetingTipShown() {
        this.mEditor.putBoolean(IS_BUDGETING_TIP_SHOWN, true);
        this.mEditor.commit();
    }

    public void setIsContactSwiped() {
        this.mEditor.putBoolean(IS_CONTACT_SWIPED, true);
        this.mEditor.commit();
    }

    public void setIsFavoriteHintShown() {
        this.mEditor.putBoolean(IS_FAVORITE_HINT_SHOWN, true);
        this.mEditor.commit();
    }

    public void setIsSoloClub(boolean z) {
        this.mEditor.putBoolean(IS_SOLO_CLUB, z);
        this.mEditor.commit();
    }

    public void setIsSoloX(boolean z) {
        this.mEditor.putBoolean(IS_SOLO_X, z);
        this.mEditor.commit();
    }

    public void setJuniorPopupCloseDate(String str) {
        this.mEditor.putLong(JUNIOR_POPUP_CLOSE_DATE, System.currentTimeMillis());
        this.mEditor.commit();
    }

    public void setLanguage(C37353c cVar) {
        this.languageStore.setLanguage(cVar);
    }

    public void setLastKnownLocation(Location location) {
        if (location != null) {
            SharedPreferences.Editor editor = this.mEditor;
            editor.putString(LAST_KNOWN_LOCATION, location.getProvider() + "#" + location.getLatitude() + "#" + location.getLongitude() + "#" + location.getAltitude());
        } else {
            this.mEditor.remove(LAST_KNOWN_LOCATION);
        }
        this.mEditor.commit();
    }

    public void setLastShowCalculateLimitsPopupDate(long j) {
        SharedPreferences.Editor editor = this.mEditor;
        editor.putLong("CALCULATE_LIMITS_POPUP_DATE#" + j, System.currentTimeMillis());
        this.mEditor.commit();
    }

    public void setLastShowLiabilityOverduePopupDate() {
        this.mEditor.putLong(LIABILITY_OVERDUE_POP_UP_DATE, System.currentTimeMillis());
        this.mEditor.commit();
    }

    public void setLastShownIbanInfo(String str) {
        this.mEditor.putString(LAST_SHOWN_IBAN_INFO, str);
        this.mEditor.commit();
    }

    public void setLastTimeExpiringCardPopupWasShown(long j) {
        SharedPreferences.Editor editor = this.mEditor;
        editor.putLong("EXPIRING_CARD_POPUP#" + j, System.currentTimeMillis());
        this.mEditor.commit();
    }

    public void setLastUsedExtCustId(String str) {
        this.mEditor.putString(LAST_USED_EXT_ID, str);
        this.mEditor.commit();
    }

    public void setLocationPermissionTime(long j) {
        this.mEditor.putLong(LOCATION_PERMISSION_TIMEOUT, j);
        this.mEditor.apply();
    }

    public void setMedalliaLastInterceptTime(long j) {
        this.mEditor.putLong(MEDALLIA_LAST_INTERCEPT_TIME, j);
        this.mEditor.apply();
    }

    public void setMoneyRequestReceiverItemSwiped() {
        this.mEditor.putBoolean(SWIPE_MONEY_REQUEST_RECEIVER_ITEM, true);
        this.mEditor.commit();
    }

    public void setNotificationPermissionTime(long j) {
        this.mEditor.putLong(NOTIFICATION_PERMISSION_TIME, j);
        this.mEditor.apply();
    }

    public void setP2pHelpTooltipWasShown() {
        this.mEditor.putBoolean(SHOW_P2P_HELP_REFERENCE, false).commit();
    }

    public void setP2pToolTipCounter(int i) {
        this.mEditor.putInt(SHOW_P2P_TOOLTIP_COUNTER, i);
        this.mEditor.commit();
    }

    public void setPaymentMobilePermissionOffered() {
        this.mEditor.putBoolean(KEY_MOBILE_PAYMENT_PERRMISSION, false);
        this.mEditor.commit();
    }

    public void setPlusActivationDialogShown(String str) {
        SharedPreferences.Editor editor = this.mEditor;
        editor.putBoolean("SHOW_PLUS_OFFER_DIALOG#" + str, true);
        this.mEditor.commit();
    }

    public void setRecentSearch(ArrayList<SearchResultObject> arrayList, String str) {
        if (str != null) {
            Gson gson = new Gson();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 1; i < arrayList.size(); i++) {
                SearchResultObject searchResultObject = arrayList.get(i);
                if (searchResultObject != null) {
                    arrayList2.add(new SearchPreferenceObject(searchResultObject.getType(), gson.mo18181w(searchResultObject)));
                }
            }
            this.mEditor.putString(RECENT_SEARCHES.concat(str), gson.mo18181w(arrayList2));
            this.mEditor.commit();
        }
    }

    public void setSaveFcmVersionInstalled() {
        this.mEditor.putBoolean(FCM_SAVE_VERSION, true);
        this.mEditor.commit();
    }

    public void setShouldUpdateLanguage(boolean z) {
        this.mEditor.putBoolean(UPDATE_LANGUAGE, z);
        this.mEditor.commit();
    }

    public void setStudentCardBannerShown(String str) {
        this.mEditor.putBoolean("STUDENT_CARD_BANNER_SHOWN#" + str, true);
        this.mEditor.commit();
    }

    public void setSwipeTipCount(String str) {
        this.mEditor.putInt(str, 1);
        this.mEditor.commit();
    }

    public void setTermsAccepted(boolean z) {
        this.mEditor.putBoolean(TERMS_ACCEPTED, z);
        this.mEditor.commit();
    }

    public boolean shouldCheckSmsToPush() {
        return this.mSharedPreferences.getBoolean(SMS_TO_PUSH, true);
    }

    public void syncCcyRates(CcyRatesWrapper ccyRatesWrapper) {
        SharedPreferences.Editor edit = this.mSharedPreferences.edit();
        edit.putString(CCY_WRAPPER, new Gson().mo18181w(ccyRatesWrapper));
        edit.commit();
        this.mEventBus.mo96184m(new CcyRatesSyncSuccessEvent());
    }

    public void syncMapObject(MapObjectWrapper mapObjectWrapper) {
        if (mapObjectWrapper != null && mapObjectWrapper.getMapObjects() != null) {
            SharedPreferences.Editor edit = this.mSharedPreferences.edit();
            edit.putString(MAP_OBJECTS, new C5490d().mo18204c().mo18203b().mo18181w(mapObjectWrapper.getMapObjects()));
            updateMapsLastSyncDate();
            edit.commit();
        }
    }

    public void updateCommonDataLastSyncDate() {
        this.mEditor.putLong(LAST_SYNC_DATE, System.currentTimeMillis());
        this.mEditor.commit();
    }

    public void updateContactsLastSyncDate() {
        this.mEditor.putLong(CONTACTS_LAST_SYNC_DATE, System.currentTimeMillis());
        this.mEditor.commit();
    }

    public void updateMapsLastSyncDate() {
        this.mEditor.putLong(MAPS_LAST_SYNC_DATE, System.currentTimeMillis());
        this.mEditor.commit();
    }

    public boolean wasBecomeSoloBannerShown(String str) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        return sharedPreferences.getBoolean("BECOME_SOLO_BANNER_SHOWN#" + str, false);
    }

    public boolean wasCreditInfoBannerShown(String str) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        return sharedPreferences.getBoolean("CREDIT_INFO_BANNER_SHOWN#" + str, false);
    }

    public boolean wasCreditInfoRegisterBannerInOffersShown(String str) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        return sharedPreferences.getBoolean("CREDIT_INFO_REGISTER_BANNER_IN_OFFERS_SHOWN#" + str, false);
    }

    public Boolean wasDarModePopupShown(long j) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        return Boolean.valueOf(sharedPreferences.getBoolean("DARK_MODE_POPUP#" + j, false));
    }

    public boolean wasDigitalCardBannerShown(String str) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        return sharedPreferences.getBoolean("DIGITAL_CARD_BANNER_SHOWN#" + str, false);
    }

    public boolean wasPlusActivationDialogShown(String str) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        return sharedPreferences.getBoolean("SHOW_PLUS_OFFER_DIALOG#" + str, false);
    }

    public boolean wasSaveFcmVersionInstalled() {
        return this.mSharedPreferences.getBoolean(FCM_SAVE_VERSION, false);
    }

    public boolean wasStudentCardBannerShown(String str) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        return sharedPreferences.getBoolean("STUDENT_CARD_BANNER_SHOWN#" + str, false);
    }

    public String getExtCustomer(boolean z) {
        String string = this.mSharedPreferences.getString(EXTERNAL_USER_ALIAS, (String) null);
        return ((string == null || string.length() == 0) && !z && C10146d0.C10148b.m37109g() != null) ? C10146d0.C10148b.m37109g().getExtCustomerId() : string;
    }

    public boolean isOfferHidden(C25628b bVar, String str) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        return sharedPreferences.getBoolean("HIDE_OFFER_BANNER#" + str + "#" + bVar.mo64164a(), false);
    }

    public void hideOffer(C25628b bVar, String str) {
        SharedPreferences.Editor editor = this.mEditor;
        editor.putBoolean("HIDE_OFFER_BANNER#" + str + "#" + bVar.mo64164a(), true);
        this.mEditor.commit();
    }

    public boolean isOfferHidden(String str, String str2) {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        return sharedPreferences.getBoolean("HIDE_OFFER_BANNER#" + str2 + "#" + str, false);
    }

    public void hideOffer(String str, String str2) {
        SharedPreferences.Editor editor = this.mEditor;
        editor.putBoolean("HIDE_OFFER_BANNER#" + str2 + "#" + str, true);
        this.mEditor.commit();
    }
}

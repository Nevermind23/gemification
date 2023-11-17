package he0;

import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.notifications.NotificationCustomizationOptions;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p366bk.C10320i;

/* renamed from: he0.c */
public final class C24981c {

    /* renamed from: a */
    public static final C24981c f64306a = new C24981c();

    /* renamed from: b */
    private static final int f64307b = C10320i.ic_notification;

    private C24981c() {
    }

    /* renamed from: a */
    public static final MarketingCloudConfig.Builder m79849a(PreferencesApiManager preferencesApiManager) {
        C41536l.m120489i(preferencesApiManager, "sharedPreferencesApiManager");
        MarketingCloudConfig.Builder delayRegistrationUntilContactKeyIsSet = MarketingCloudConfig.Companion.builder().setApplicationId("3327e38b-dae2-45bb-84a9-0aa7bcc2b26e").setAccessToken("VzdhnRjB0VU6YQ6ed2DtSXz8").setMarketingCloudServerUrl("https://mc2ddgrltl0b6ryckvt2b21t8zt1.device.marketingcloudapis.com/").setMid("510002435").setAnalyticsEnabled(true).setPiAnalyticsEnabled(true).setDelayRegistrationUntilContactKeyIsSet(true);
        NotificationCustomizationOptions create = NotificationCustomizationOptions.create(f64307b);
        C41536l.m120488h(create, "create(notificationIcon)");
        return delayRegistrationUntilContactKeyIsSet.setNotificationCustomizationOptions(create).setGeofencingEnabled(true);
    }
}

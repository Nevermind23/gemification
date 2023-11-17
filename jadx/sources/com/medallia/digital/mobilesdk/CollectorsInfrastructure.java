package com.medallia.digital.mobilesdk;

import com.github.mikephil.charting.utils.Utils;
import com.medallia.digital.mobilesdk.C10837g5;
import com.medallia.digital.mobilesdk.C10862h6;
import com.medallia.digital.mobilesdk.C11037o6;
import com.medallia.digital.mobilesdk.C11164w3;
import com.medallia.digital.mobilesdk.C11195x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observer;

final class CollectorsInfrastructure implements C11108u0, C10769c8, C11164w3.C11172h {
    private static CollectorsInfrastructure instance;
    protected C11025o appIdCollector = new C11025o(getPollType(C11195x0.C11196a.f32212t.getFrequency()), C11083s0.AppId);
    protected C11043p appNameCollector = new C11043p(getPollType(C11195x0.C11196a.f32211s.getFrequency()), C11083s0.AppName);
    protected C11081s appRatingLastAcceptedTimestampCollector;
    protected C11093t appRatingLastDeclineTimestampCollector;
    protected C11106u appRatingLastTriggerTimestampCollector;
    protected C11135v appVersionCollector = new C11135v(getPollType(C11195x0.C11196a.f32213u.getFrequency()), C11083s0.AppVersion);
    protected C10927k0 batteryPercentageCollector = new C10927k0(C11083s0.BatteryPercentage);
    protected C10787e1 csatCollector;
    protected C10825g1 customParametersCollector = new C10825g1(C11083s0.CustomParameters);
    protected C11012n1 deviceFreeDiskSpaceCollector = new C11012n1(getPollType(C11195x0.C11196a.f32192a.getFrequency()), C11083s0.DeviceFreeDiskSpace);
    protected C11028o1 deviceFreeMemoryCollector = new C11028o1(getPollType(C11195x0.C11196a.f32194b.getFrequency()), C11083s0.DeviceFreeMemoryCollector);
    protected C11046p1 deviceIdCollector = new C11046p1(getPollType(C11195x0.C11196a.f32210r.getFrequency()), C11083s0.DeviceId);
    protected C11073r1 deviceModelCollector = new C11073r1(getPollType(C11195x0.C11196a.f32195c.getFrequency()), C11083s0.DeviceModel);
    protected C11084s1 deviceResolutionCollector = new C11084s1(getPollType(C11195x0.C11196a.f32196d.getFrequency()), C11083s0.DeviceResolution);
    protected C11096t1 deviceUsedDiskSpaceCollector = new C11096t1(getPollType(C11195x0.C11196a.f32197e.getFrequency()), C11083s0.DeviceUsedDiskSpace);
    protected C11109u1 deviceUsedMemoryCollector = new C11109u1(getPollType(C11195x0.C11196a.f32198f.getFrequency()), C11083s0.DeviceUsedMemory);
    protected C11137v1 deviceVendorCollector = new C11137v1(getPollType(C11195x0.C11196a.f32199g.getFrequency()), C11083s0.DeviceVendor);
    private final ArrayList<C10717a2> eventCollectors = new ArrayList<>();
    private final ArrayList<C10773d2> feedCollectors = new ArrayList<>();
    private boolean initialized;
    protected C10734b3 interceptDisabledCollector = new C10734b3(C11083s0.InterceptDisabled);
    protected C10758c3 interceptEnabledCollector = new C10758c3(C11083s0.InterceptEnabled);
    protected C10805f3 invitationDisplayedCollector = new C10805f3(C11083s0.InvitationDisplayed);
    protected C11237z2 ipCollector = new C11237z2(getPollType(C11195x0.C11196a.f32208p.getFrequency()), C11083s0.IP);
    protected C10932k3 isOCQRulesValidCollector;
    protected C10955l3 isOCQUserSetCollector;
    protected C10997m3 isSessionSampledEventsCollector;
    protected C11098t3 languageCollector = new C11098t3(getPollType(C11195x0.C11196a.f32206n.getFrequency()), C11083s0.Language);
    protected C11111u3 lastDeclineTimestampCollector = new C11111u3(C11083s0.LastDeclineTimestamp);
    protected C11146v3 lastSubmitTimestampCollector = new C11146v3(C11083s0.LastSubmitTimestamp);
    protected C10738b5 networkCarrierCollector = new C10738b5(getPollType(C11195x0.C11196a.f32205m.getFrequency()), C11083s0.NetworkCarrier);
    protected C10777d5 networkProviderCollector = new C10777d5(getPollType(C11195x0.C11196a.f32204l.getFrequency()), C11083s0.NetworkProvider);
    protected C10794e5 npsCollector;
    protected C10837g5 orientationCollector = new C10837g5(C11083s0.Orientation);
    protected C10861h5 osNameCollector = new C10861h5(getPollType(C11195x0.C11196a.f32202j.getFrequency()), C11083s0.OsName);
    protected C10885i5 osVersionCollector = new C10885i5(getPollType(C11195x0.C11196a.f32203k.getFrequency()), C11083s0.OsVersion);
    private final ArrayList<C11034o5> pollingCollectors = new ArrayList<>();
    protected C11055p5 powerTypeCollector = new C11055p5(C11083s0.PowerType);
    protected C11088s5 promptDisplayedCollector;
    protected C11100t5 propertyIdCollector = new C11100t5(C11083s0.PropertyId);
    protected C10862h6 sdkAnalyticsVersionCollector;
    protected C10938k6 sdkFrameworkCollector;
    protected C11003m6 sdkVersionCollector = new C11003m6(getPollType(C11195x0.C11196a.f32214v.getFrequency()), C11083s0.SdkVersion);
    protected C11037o6 sessionCalculatedPercentageCollector = new C11037o6(getPollType(C11195x0.C11196a.f32215w.getFrequency()), C11083s0.SessionCalculatedPercentage);
    protected C11058p6 sessionIdCollector = new C11058p6(C11083s0.SessionId);
    protected C11069q6 sessionNumberCollector = new C11069q6(C11083s0.SessionNumber);
    protected C11079r6 sessionPercentageSampledEventsCollector;
    protected C11039o7 timeInBackgroundCollector = new C11039o7(C11083s0.TimeInBackground);
    protected C11060p7 timeInForegroundCollector = new C11060p7(C11083s0.TimeInForeground);
    protected C11071q7 timezoneCollector = new C11071q7(getPollType(C11195x0.C11196a.f32207o.getFrequency()), C11083s0.Timezone);
    protected C10798e8 userEmailCollector = new C10798e8(C11083s0.UserEmail);
    protected C10818f8 userIdCollector = new C10818f8(C11083s0.UserId);
    protected C10940k8 userNameCollector = new C10940k8(C11083s0.UserName);

    private CollectorsInfrastructure() {
        this.timeInBackgroundCollector.mo28064a(true);
        this.timeInForegroundCollector.mo28064a(true);
        this.npsCollector = new C10794e5(C11083s0.NPS);
        this.csatCollector = new C10787e1(C11083s0.CSAT);
        this.appRatingLastDeclineTimestampCollector = new C11093t(C11083s0.AppRatingLastDeclineTimestamp);
        this.promptDisplayedCollector = new C11088s5(C11083s0.PromptDisplayed);
        this.appRatingLastAcceptedTimestampCollector = new C11081s(C11083s0.AppRatingLastAcceptedTimestamp);
        this.sdkAnalyticsVersionCollector = new C10862h6(C11083s0.SDKAnalyticsVersion);
        this.sdkFrameworkCollector = new C10938k6(C11083s0.SDKFramework);
        this.appRatingLastTriggerTimestampCollector = new C11106u(C11083s0.AppRatingLastTriggerTimestamp);
        this.isOCQUserSetCollector = new C10955l3(C11083s0.IsOCQUserSet);
        this.isOCQRulesValidCollector = new C10932k3(C11083s0.IsOCQRulesValid);
        this.sessionPercentageSampledEventsCollector = new C11079r6(C11083s0.SessionPercentageSampledEvents);
        this.isSessionSampledEventsCollector = new C10997m3(C11083s0.IsSessionSampledEvents);
        initCollectorsCollections();
        C11164w3.m40939b().mo29113a((C11164w3.C11172h) this);
    }

    private boolean addObserver(C11072r0 r0Var, Observer observer, C11083s0 s0Var) {
        if (r0Var.mo28948a() != s0Var) {
            return false;
        }
        r0Var.addObserver(observer);
        return true;
    }

    protected static CollectorsInfrastructure getInstance() {
        if (instance == null && C10884i4.m39721c().mo28481a() != null) {
            instance = new CollectorsInfrastructure();
        }
        return instance;
    }

    private C11017n5 getPollType(Integer num) {
        return new C11017n5((long) num.intValue());
    }

    private void initCollectorsCollections() {
        this.feedCollectors.add(this.userIdCollector);
        this.feedCollectors.add(this.userEmailCollector);
        this.feedCollectors.add(this.userNameCollector);
        this.feedCollectors.add(this.customParametersCollector);
        this.feedCollectors.add(this.interceptEnabledCollector);
        this.feedCollectors.add(this.interceptDisabledCollector);
        this.feedCollectors.add(this.sdkAnalyticsVersionCollector);
        this.feedCollectors.add(this.sessionPercentageSampledEventsCollector);
        this.feedCollectors.add(this.isSessionSampledEventsCollector);
        this.feedCollectors.add(this.sdkFrameworkCollector);
        this.eventCollectors.add(this.powerTypeCollector);
        this.eventCollectors.add(this.batteryPercentageCollector);
        this.eventCollectors.add(this.orientationCollector);
        this.eventCollectors.add(this.lastDeclineTimestampCollector);
        this.eventCollectors.add(this.lastSubmitTimestampCollector);
        this.eventCollectors.add(this.sessionNumberCollector);
        this.eventCollectors.add(this.sessionIdCollector);
        this.eventCollectors.add(this.invitationDisplayedCollector);
        this.eventCollectors.add(this.propertyIdCollector);
        this.eventCollectors.add(this.npsCollector);
        this.eventCollectors.add(this.csatCollector);
        this.eventCollectors.add(this.appRatingLastDeclineTimestampCollector);
        this.eventCollectors.add(this.promptDisplayedCollector);
        this.eventCollectors.add(this.appRatingLastAcceptedTimestampCollector);
        this.eventCollectors.add(this.appRatingLastTriggerTimestampCollector);
        this.eventCollectors.add(this.isOCQUserSetCollector);
        this.eventCollectors.add(this.isOCQRulesValidCollector);
        this.pollingCollectors.add(this.deviceModelCollector);
        this.pollingCollectors.add(this.deviceResolutionCollector);
        this.pollingCollectors.add(this.deviceUsedMemoryCollector);
        this.pollingCollectors.add(this.deviceFreeMemoryCollector);
        this.pollingCollectors.add(this.deviceUsedDiskSpaceCollector);
        this.pollingCollectors.add(this.deviceFreeDiskSpaceCollector);
        this.pollingCollectors.add(this.osNameCollector);
        this.pollingCollectors.add(this.osVersionCollector);
        this.pollingCollectors.add(this.networkProviderCollector);
        this.pollingCollectors.add(this.networkCarrierCollector);
        this.pollingCollectors.add(this.languageCollector);
        this.pollingCollectors.add(this.timezoneCollector);
        this.pollingCollectors.add(this.ipCollector);
        this.pollingCollectors.add(this.deviceIdCollector);
        this.pollingCollectors.add(this.appNameCollector);
        this.pollingCollectors.add(this.appIdCollector);
        this.pollingCollectors.add(this.appVersionCollector);
        this.pollingCollectors.add(this.sdkVersionCollector);
        this.pollingCollectors.add(this.sessionCalculatedPercentageCollector);
        this.pollingCollectors.add(this.deviceVendorCollector);
    }

    private void removeAllObservers() {
        Iterator<C10773d2> it = this.feedCollectors.iterator();
        while (it.hasNext()) {
            it.next().deleteObservers();
        }
        Iterator<C11034o5> it2 = this.pollingCollectors.iterator();
        while (it2.hasNext()) {
            it2.next().deleteObservers();
        }
        Iterator<C10717a2> it3 = this.eventCollectors.iterator();
        while (it3.hasNext()) {
            it3.next().deleteObservers();
        }
        this.timeInBackgroundCollector.deleteObservers();
        this.timeInForegroundCollector.deleteObservers();
    }

    private void setEventOrFeedCollectorConfiguration(CollectorContract collectorContract, C11072r0 r0Var) {
        if (collectorContract == null) {
            collectorContract = r0Var.mo28118c();
        }
        if (collectorContract.getLifetime() != null) {
            r0Var.mo28949a(collectorContract.getLifetime());
        }
        if (collectorContract.isEnabled() != null) {
            r0Var.mo28064a(collectorContract.isEnabled().booleanValue());
        }
    }

    private void setPollingCollectorConfiguration(CollectorContract collectorContract, C11034o5 o5Var) {
        if (collectorContract == null) {
            collectorContract = o5Var.mo28118c();
        }
        if (collectorContract.getFrequency() != null) {
            o5Var.mo28856a(getPollType(collectorContract.getFrequency()));
        }
        if (collectorContract.getLifetime() != null) {
            o5Var.mo28949a(collectorContract.getLifetime());
        }
        if (collectorContract.isEnabled() != null) {
            o5Var.mo28064a(collectorContract.isEnabled().booleanValue());
        }
    }

    private void updateEventCollectors(CollectorsConfigurationContract collectorsConfigurationContract) {
        if (collectorsConfigurationContract != null) {
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getPowerTypeCollector(), this.powerTypeCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getBatteryPercentageCollector(), this.batteryPercentageCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getOrientationCollector(), this.orientationCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getLastDeclineTimestampCollector(), this.lastDeclineTimestampCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getLastSubmitTimestampCollector(), this.lastSubmitTimestampCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getInvitationDisplayedCollector(), this.invitationDisplayedCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getSessionNumberCollector(), this.sessionNumberCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getSessionIdCollector(), this.sessionIdCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getPropertyIdCollector(), this.propertyIdCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getNpsCollector(), this.npsCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getCsatCollector(), this.csatCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getAppRatingLastDeclineTimestampCollector(), this.appRatingLastDeclineTimestampCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getPromptDisplayedCollector(), this.promptDisplayedCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getAppRatingLastAcceptedTimestampCollector(), this.appRatingLastAcceptedTimestampCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getAppRatingLastTriggerTimestampCollector(), this.appRatingLastTriggerTimestampCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getIsOCQUserSetCollector(), this.isOCQUserSetCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getIsOCQRulesValidCollector(), this.isOCQRulesValidCollector);
        }
    }

    private void updatedFeedCollectors(CollectorsConfigurationContract collectorsConfigurationContract) {
        if (collectorsConfigurationContract != null) {
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getUserIdCollector(), this.userIdCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getUserEmailCollector(), this.userEmailCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getUserNameCollector(), this.userNameCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getCustomParametersCollector(), this.customParametersCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getInterceptEnabledCollector(), this.interceptEnabledCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getInterceptDisabledCollector(), this.interceptDisabledCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getSessionPercentageSampledEventsCollector(), this.sessionPercentageSampledEventsCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getIsSessionSampledEventsCollector(), this.isSessionSampledEventsCollector);
        }
    }

    private void updatedPollingCollectors(CollectorsConfigurationContract collectorsConfigurationContract) {
        if (collectorsConfigurationContract != null) {
            setPollingCollectorConfiguration(collectorsConfigurationContract.getDeviceModelCollector(), this.deviceModelCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getDeviceResolutionCollector(), this.deviceResolutionCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getDeviceUsedMemoryCollector(), this.deviceUsedMemoryCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getDeviceFreeMemoryCollector(), this.deviceFreeMemoryCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getDeviceUsedDiskSpaceCollector(), this.deviceUsedDiskSpaceCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getDeviceFreeDiskSpaceCollector(), this.deviceFreeDiskSpaceCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getOsNameCollector(), this.osNameCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getOsVersionCollector(), this.osVersionCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getNetworkProviderCollector(), this.networkProviderCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getNetworkCarrierCollector(), this.networkCarrierCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getLanguageCollector(), this.languageCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getTimezoneCollector(), this.timezoneCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getIpCollector().setEnabled(false), this.ipCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getDeviceIdCollector(), this.deviceIdCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getAppNameCollector(), this.appNameCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getAppIdCollector(), this.appIdCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getAppVersionCollector(), this.appVersionCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getSdkVersionCollector(), this.sdkVersionCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getSessionCalculatedPercentageCollector(), this.sessionCalculatedPercentageCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getDeviceVendorCollector(), this.deviceVendorCollector);
        }
    }

    public void addObserverToCollector(Observer observer, C11083s0 s0Var) {
        Iterator<C10773d2> it = this.feedCollectors.iterator();
        while (it.hasNext()) {
            if (addObserver(it.next(), observer, s0Var)) {
                return;
            }
        }
        Iterator<C11034o5> it2 = this.pollingCollectors.iterator();
        while (it2.hasNext()) {
            if (addObserver(it2.next(), observer, s0Var)) {
                return;
            }
        }
        Iterator<C10717a2> it3 = this.eventCollectors.iterator();
        while (it3.hasNext()) {
            if (addObserver(it3.next(), observer, s0Var)) {
                return;
            }
        }
        if (!addObserver(this.timeInBackgroundCollector, observer, s0Var)) {
            addObserver(this.timeInForegroundCollector, observer, s0Var);
        }
    }

    public void addObserverToCollectors(Observer observer) {
        Iterator<C10773d2> it = this.feedCollectors.iterator();
        while (it.hasNext()) {
            it.next().addObserver(observer);
        }
        Iterator<C11034o5> it2 = this.pollingCollectors.iterator();
        while (it2.hasNext()) {
            it2.next().addObserver(observer);
        }
        Iterator<C10717a2> it3 = this.eventCollectors.iterator();
        while (it3.hasNext()) {
            it3.next().addObserver(observer);
        }
        this.timeInBackgroundCollector.addObserver(observer);
        this.timeInForegroundCollector.addObserver(observer);
    }

    public void clearAndDisconnect() {
        C10735b4.m39107a("Collectors");
        removeAllObservers();
        unregister();
        instance = null;
    }

    public String getAppId() {
        return (String) this.appIdCollector.mo28863f();
    }

    public String getAppName() {
        return (String) this.appNameCollector.mo28863f();
    }

    public Long getAppRatingLastAcceptedTimestamp() {
        return (Long) this.appRatingLastAcceptedTimestampCollector.mo28863f();
    }

    public Long getAppRatingLastDeclineTimestamp() {
        return (Long) this.appRatingLastDeclineTimestampCollector.mo28863f();
    }

    public Long getAppRatingLastTriggerTimestamp() {
        return (Long) this.appRatingLastTriggerTimestampCollector.mo28863f();
    }

    public String getAppVersion() {
        return (String) this.appVersionCollector.mo28863f();
    }

    public Integer getBatteryPercentage() {
        return (Integer) this.batteryPercentageCollector.mo28863f();
    }

    /* access modifiers changed from: package-private */
    public Object getByName(String str) {
        try {
            String replaceFirst = str.replaceFirst(String.valueOf(str.charAt(0)), String.valueOf(str.toLowerCase().charAt(0)));
            C11072r0 r0Var = (C11072r0) CollectorsInfrastructure.class.getDeclaredField(replaceFirst + "Collector").get(this);
            if (r0Var == null) {
                return null;
            }
            return r0Var.mo28863f();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return null;
        }
    }

    public Integer getCSAT() {
        return (Integer) this.csatCollector.mo28863f();
    }

    public ArrayList<CustomParameter> getCustomParameters() {
        return this.customParametersCollector.mo28330j();
    }

    public String getDeviceFreeDiskSpace() {
        return (String) this.deviceFreeDiskSpaceCollector.mo28863f();
    }

    public String getDeviceFreeMemory() {
        return (String) this.deviceFreeMemoryCollector.mo28863f();
    }

    public String getDeviceId() {
        return (String) this.deviceIdCollector.mo28863f();
    }

    public String getDeviceModel() {
        return (String) this.deviceModelCollector.mo28863f();
    }

    public String getDeviceResolution() {
        return (String) this.deviceResolutionCollector.mo28863f();
    }

    public Long getDeviceUsedDiskSpace() {
        return (Long) this.deviceUsedDiskSpaceCollector.mo28863f();
    }

    public Long getDeviceUsedMemory() {
        return (Long) this.deviceUsedMemoryCollector.mo28863f();
    }

    public String getDeviceVendor() {
        return (String) this.deviceVendorCollector.mo28863f();
    }

    public String getIp() {
        return (String) this.ipCollector.mo28863f();
    }

    public String getLanguage() {
        return (String) this.languageCollector.mo28863f();
    }

    public Long getLastDeclineTimestamp() {
        return (Long) this.lastDeclineTimestampCollector.mo28863f();
    }

    public Long getLastSubmitTimestamp() {
        return (Long) this.lastSubmitTimestampCollector.mo28863f();
    }

    public Integer getNPS() {
        return (Integer) this.npsCollector.mo28863f();
    }

    public String getNetworkCarrier() {
        return (String) this.networkCarrierCollector.mo28863f();
    }

    public String getNetworkProvider() {
        return (String) this.networkProviderCollector.mo28863f();
    }

    public Double getNetworkSpeed() {
        return Double.valueOf(Utils.DOUBLE_EPSILON);
    }

    public String getOSName() {
        return (String) this.osNameCollector.mo28863f();
    }

    public String getOSVersion() {
        return (String) this.osVersionCollector.mo28863f();
    }

    public C10837g5.C10839b getOrientation() {
        return (C10837g5.C10839b) this.orientationCollector.mo28863f();
    }

    public String getPowerType() {
        return (String) this.powerTypeCollector.mo28863f();
    }

    public Long getPropertyId() {
        return (Long) this.propertyIdCollector.mo28863f();
    }

    public C10862h6.C10863a getSDKAnalyticsVersion() {
        return (C10862h6.C10863a) this.sdkAnalyticsVersionCollector.mo28863f();
    }

    public MDSdkFrameworkType getSDKFramework() {
        return (MDSdkFrameworkType) this.sdkFrameworkCollector.mo28863f();
    }

    public String getSDKVersion() {
        return (String) this.sdkVersionCollector.mo28863f();
    }

    public Object getSessionCalculatedPercentage() {
        return this.sessionCalculatedPercentageCollector.mo28863f();
    }

    public String getSessionId() {
        return (String) this.sessionIdCollector.mo28863f();
    }

    public Integer getSessionNumber() {
        return (Integer) this.sessionNumberCollector.mo28863f();
    }

    public Integer getSessionPercentageSampledEvents() {
        return (Integer) this.sessionPercentageSampledEventsCollector.mo28863f();
    }

    public Long getTimeInBackground() {
        return this.timeInBackgroundCollector.mo28863f();
    }

    public Long getTimeInForeground() {
        return this.timeInForegroundCollector.mo28863f();
    }

    public String getTimezone() {
        return (String) this.timezoneCollector.mo28863f();
    }

    public String getUserEmail() {
        return (String) this.userEmailCollector.mo28863f();
    }

    public String getUserID() {
        return (String) this.userIdCollector.mo28863f();
    }

    public String getUserName() {
        return (String) this.userNameCollector.mo28863f();
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    public String isInvitationDisplayed() {
        return String.valueOf(this.invitationDisplayedCollector.mo28863f());
    }

    public String isOCQRulesValid() {
        return String.valueOf(this.isOCQRulesValidCollector.mo28863f());
    }

    public String isOCQUserSet() {
        return String.valueOf(this.isOCQUserSetCollector.mo28863f());
    }

    public String isPromptDisplayed() {
        return String.valueOf(this.promptDisplayedCollector.mo28863f());
    }

    public String isSessionSampledEventsCollector() {
        return String.valueOf(this.isSessionSampledEventsCollector.mo28863f());
    }

    public void onBackground() {
        unregister();
    }

    public void onForeground() {
        register();
    }

    public void pollAll() {
        Iterator<C11034o5> it = this.pollingCollectors.iterator();
        while (it.hasNext()) {
            it.next().mo28859m();
        }
        Iterator<C10717a2> it2 = this.eventCollectors.iterator();
        while (it2.hasNext()) {
            it2.next().mo28066k();
        }
    }

    public void register() {
        Iterator<C10717a2> it = this.eventCollectors.iterator();
        while (it.hasNext()) {
            it.next().mo28067l();
        }
        Iterator<C11034o5> it2 = this.pollingCollectors.iterator();
        while (it2.hasNext()) {
            it2.next().mo28860n();
        }
    }

    public void setInitialized(boolean z) {
        this.initialized = z;
    }

    public void setIsSessionSampledEventsCollector(boolean z) {
        this.isSessionSampledEventsCollector.mo28117a(Boolean.valueOf(z));
    }

    public void setPropertyId(Long l) {
        this.propertyIdCollector.mo28117a(l);
    }

    public void setSDKAnalyticsVersion(C10862h6.C10863a aVar) {
        this.sdkAnalyticsVersionCollector.mo28117a(aVar);
    }

    public void setSDKFramework(MDSdkFrameworkType mDSdkFrameworkType) {
        this.sdkFrameworkCollector.mo28117a(mDSdkFrameworkType);
    }

    public void setSessionId(String str) {
        this.sessionIdCollector.mo28117a(str);
    }

    public void setSessionNumber(Integer num) {
        this.sessionNumberCollector.mo28117a(num);
    }

    public void setSessionPercentageSampledEventsCollector(int i) {
        this.sessionPercentageSampledEventsCollector.mo28117a(Integer.valueOf(i));
    }

    public void setUserEmail(String str) {
        this.userEmailCollector.mo28117a(str);
    }

    public void setUserID(String str) {
        this.userIdCollector.mo28117a(str);
    }

    public void setUserName(String str) {
        this.userNameCollector.mo28117a(str);
    }

    public void stopCollectors() {
        Iterator<C10717a2> it = this.eventCollectors.iterator();
        while (it.hasNext()) {
            it.next().mo28064a(false);
        }
        Iterator<C11034o5> it2 = this.pollingCollectors.iterator();
        while (it2.hasNext()) {
            it2.next().mo28064a(false);
        }
        Iterator<C10773d2> it3 = this.feedCollectors.iterator();
        while (it3.hasNext()) {
            it3.next().mo28064a(false);
        }
    }

    public void unregister() {
        Iterator<C10717a2> it = this.eventCollectors.iterator();
        while (it.hasNext()) {
            it.next().mo28068m();
        }
        Iterator<C11034o5> it2 = this.pollingCollectors.iterator();
        while (it2.hasNext()) {
            it2.next().mo28861q();
        }
    }

    public void updateConfiguration(CollectorsConfigurationContract collectorsConfigurationContract, boolean z) {
        if (collectorsConfigurationContract == null) {
            collectorsConfigurationContract = new CollectorsConfigurationContract();
        }
        C11060p7 p7Var = this.timeInForegroundCollector;
        if (p7Var != null) {
            p7Var.mo28919r();
        }
        C11039o7 o7Var = this.timeInBackgroundCollector;
        if (o7Var != null) {
            o7Var.mo28866p();
        }
        updateEventCollectors(collectorsConfigurationContract);
        updatedPollingCollectors(collectorsConfigurationContract);
        updatedFeedCollectors(collectorsConfigurationContract);
        this.sessionCalculatedPercentageCollector.mo28862a(z ? C11037o6.C11038a.DOUBLE : C11037o6.C11038a.INTEGER);
    }
}

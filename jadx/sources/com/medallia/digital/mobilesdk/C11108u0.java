package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C10837g5;
import com.medallia.digital.mobilesdk.C10862h6;
import java.util.ArrayList;
import java.util.Observer;

/* renamed from: com.medallia.digital.mobilesdk.u0 */
interface C11108u0 {
    void addObserverToCollector(Observer observer, C11083s0 s0Var);

    void addObserverToCollectors(Observer observer);

    String getAppId();

    String getAppName();

    Long getAppRatingLastAcceptedTimestamp();

    Long getAppRatingLastDeclineTimestamp();

    Long getAppRatingLastTriggerTimestamp();

    String getAppVersion();

    Integer getBatteryPercentage();

    Integer getCSAT();

    ArrayList<CustomParameter> getCustomParameters();

    String getDeviceFreeDiskSpace();

    String getDeviceFreeMemory();

    String getDeviceId();

    String getDeviceModel();

    String getDeviceResolution();

    Long getDeviceUsedDiskSpace();

    Long getDeviceUsedMemory();

    String getDeviceVendor();

    String getIp();

    String getLanguage();

    Long getLastDeclineTimestamp();

    Long getLastSubmitTimestamp();

    Integer getNPS();

    String getNetworkCarrier();

    String getNetworkProvider();

    Double getNetworkSpeed();

    String getOSName();

    String getOSVersion();

    C10837g5.C10839b getOrientation();

    String getPowerType();

    Long getPropertyId();

    C10862h6.C10863a getSDKAnalyticsVersion();

    MDSdkFrameworkType getSDKFramework();

    String getSDKVersion();

    Object getSessionCalculatedPercentage();

    String getSessionId();

    Integer getSessionNumber();

    Integer getSessionPercentageSampledEvents();

    Long getTimeInBackground();

    Long getTimeInForeground();

    String getTimezone();

    String getUserEmail();

    String getUserID();

    String getUserName();

    String isInvitationDisplayed();

    String isOCQRulesValid();

    String isOCQUserSet();

    String isPromptDisplayed();

    String isSessionSampledEventsCollector();

    void pollAll();

    void register();

    void setIsSessionSampledEventsCollector(boolean z);

    void setPropertyId(Long l);

    void setSDKAnalyticsVersion(C10862h6.C10863a aVar);

    void setSDKFramework(MDSdkFrameworkType mDSdkFrameworkType);

    void setSessionId(String str);

    void setSessionNumber(Integer num);

    void setSessionPercentageSampledEventsCollector(int i);

    void setUserEmail(String str);

    void setUserID(String str);

    void setUserName(String str);

    void stopCollectors();

    void unregister();

    void updateConfiguration(CollectorsConfigurationContract collectorsConfigurationContract, boolean z);
}

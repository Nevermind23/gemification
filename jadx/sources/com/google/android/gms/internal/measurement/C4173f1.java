package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
import p299w6.C8859b;

/* renamed from: com.google.android.gms.internal.measurement.f1 */
public interface C4173f1 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(C4224i1 i1Var);

    void getAppInstanceId(C4224i1 i1Var);

    void getCachedAppInstanceId(C4224i1 i1Var);

    void getConditionalUserProperties(String str, String str2, C4224i1 i1Var);

    void getCurrentScreenClass(C4224i1 i1Var);

    void getCurrentScreenName(C4224i1 i1Var);

    void getGmpAppId(C4224i1 i1Var);

    void getMaxUserProperties(String str, C4224i1 i1Var);

    void getSessionId(C4224i1 i1Var);

    void getTestFlag(C4224i1 i1Var, int i);

    void getUserProperties(String str, String str2, boolean z, C4224i1 i1Var);

    void initForTests(Map map);

    void initialize(C8859b bVar, zzcl zzcl, long j);

    void isDataCollectionEnabled(C4224i1 i1Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, C4224i1 i1Var, long j);

    void logHealthData(int i, String str, C8859b bVar, C8859b bVar2, C8859b bVar3);

    void onActivityCreated(C8859b bVar, Bundle bundle, long j);

    void onActivityDestroyed(C8859b bVar, long j);

    void onActivityPaused(C8859b bVar, long j);

    void onActivityResumed(C8859b bVar, long j);

    void onActivitySaveInstanceState(C8859b bVar, C4224i1 i1Var, long j);

    void onActivityStarted(C8859b bVar, long j);

    void onActivityStopped(C8859b bVar, long j);

    void performAction(Bundle bundle, C4224i1 i1Var, long j);

    void registerOnMeasurementEventListener(C4275l1 l1Var);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(C8859b bVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(C4275l1 l1Var);

    void setInstanceIdProvider(C4309n1 n1Var);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, C8859b bVar, boolean z, long j);

    void unregisterOnMeasurementEventListener(C4275l1 l1Var);
}

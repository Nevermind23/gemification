package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.measurement.internal.C4791t4;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p182n6.C7264i;
import p248s7.C8262p;
import p248s7.C8268v;

@Deprecated
public class AppMeasurement {

    /* renamed from: b */
    private static volatile AppMeasurement f14169b;

    /* renamed from: a */
    private final C4572d f14170a;

    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        ConditionalUserProperty(Bundle bundle) {
            C7264i.m27902k(bundle);
            Class<String> cls = String.class;
            this.mAppId = (String) C8262p.m31092a(bundle, "app_id", cls, (Object) null);
            this.mOrigin = (String) C8262p.m31092a(bundle, "origin", cls, (Object) null);
            this.mName = (String) C8262p.m31092a(bundle, "name", cls, (Object) null);
            this.mValue = C8262p.m31092a(bundle, C11755a.C11756a.f34100b, Object.class, (Object) null);
            this.mTriggerEventName = (String) C8262p.m31092a(bundle, "trigger_event_name", cls, (Object) null);
            Class<Long> cls2 = Long.class;
            this.mTriggerTimeout = ((Long) C8262p.m31092a(bundle, "trigger_timeout", cls2, 0L)).longValue();
            this.mTimedOutEventName = (String) C8262p.m31092a(bundle, "timed_out_event_name", cls, (Object) null);
            Class<Bundle> cls3 = Bundle.class;
            this.mTimedOutEventParams = (Bundle) C8262p.m31092a(bundle, "timed_out_event_params", cls3, (Object) null);
            this.mTriggeredEventName = (String) C8262p.m31092a(bundle, "triggered_event_name", cls, (Object) null);
            this.mTriggeredEventParams = (Bundle) C8262p.m31092a(bundle, "triggered_event_params", cls3, (Object) null);
            this.mTimeToLive = ((Long) C8262p.m31092a(bundle, "time_to_live", cls2, 0L)).longValue();
            this.mExpiredEventName = (String) C8262p.m31092a(bundle, "expired_event_name", cls, (Object) null);
            this.mExpiredEventParams = (Bundle) C8262p.m31092a(bundle, "expired_event_params", cls3, (Object) null);
            this.mActive = ((Boolean) C8262p.m31092a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) C8262p.m31092a(bundle, "creation_timestamp", cls2, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) C8262p.m31092a(bundle, "triggered_timestamp", cls2, 0L)).longValue();
        }
    }

    public AppMeasurement(C4791t4 t4Var) {
        this.f14170a = new C4569a(t4Var);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @java.lang.Deprecated
    @androidx.annotation.Keep
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.measurement.AppMeasurement getInstance(android.content.Context r14) {
        /*
            com.google.android.gms.measurement.AppMeasurement r0 = f14169b
            if (r0 != 0) goto L_0x0059
            java.lang.Class<com.google.android.gms.measurement.AppMeasurement> r0 = com.google.android.gms.measurement.AppMeasurement.class
            monitor-enter(r0)
            com.google.android.gms.measurement.AppMeasurement r1 = f14169b     // Catch:{ all -> 0x0056 }
            if (r1 != 0) goto L_0x0054
            r1 = 0
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r2 = com.google.firebase.analytics.FirebaseAnalytics.class
            java.lang.String r3 = "getScionFrontendApiImplementation"
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{  }
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r7 = 0
            r5[r7] = r6     // Catch:{  }
            java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
            r8 = 1
            r5[r8] = r6     // Catch:{  }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r5)     // Catch:{  }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{  }
            r3[r7] = r14     // Catch:{  }
            r3[r8] = r1     // Catch:{  }
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch:{  }
            s7.v r2 = (p248s7.C8268v) r2     // Catch:{  }
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            if (r2 == 0) goto L_0x0039
            com.google.android.gms.measurement.AppMeasurement r14 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0056 }
            r14.<init>((p248s7.C8268v) r2)     // Catch:{ all -> 0x0056 }
            f14169b = r14     // Catch:{ all -> 0x0056 }
            goto L_0x0054
        L_0x0039:
            com.google.android.gms.internal.measurement.zzcl r13 = new com.google.android.gms.internal.measurement.zzcl     // Catch:{ all -> 0x0056 }
            r3 = 0
            r5 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r13
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0056 }
            com.google.android.gms.measurement.internal.t4 r14 = com.google.android.gms.measurement.internal.C4791t4.m18288H(r14, r13, r1)     // Catch:{ all -> 0x0056 }
            com.google.android.gms.measurement.AppMeasurement r1 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0056 }
            r1.<init>((com.google.android.gms.measurement.internal.C4791t4) r14)     // Catch:{ all -> 0x0056 }
            f14169b = r1     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            goto L_0x0059
        L_0x0056:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            throw r14
        L_0x0059:
            com.google.android.gms.measurement.AppMeasurement r14 = f14169b
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.getInstance(android.content.Context):com.google.android.gms.measurement.AppMeasurement");
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f14170a.mo14285f(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f14170a.mo14290k(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f14170a.mo14286g(str);
    }

    @Keep
    public long generateEventId() {
        return this.f14170a.mo14291q();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f14170a.mo14292u();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        int i;
        List<Bundle> h = this.f14170a.mo14287h(str, str2);
        if (h == null) {
            i = 0;
        } else {
            i = h.size();
        }
        ArrayList arrayList = new ArrayList(i);
        for (Bundle conditionalUserProperty : h) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f14170a.mo14282c();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f14170a.mo14283d();
    }

    @Keep
    public String getGmpAppId() {
        return this.f14170a.mo14284e();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f14170a.mo14280a(str);
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.f14170a.mo14288i(str, str2, z);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f14170a.mo14281b(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        C7264i.m27902k(conditionalUserProperty);
        C4572d dVar = this.f14170a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            C8262p.m31093b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        dVar.mo14289j(bundle);
    }

    public AppMeasurement(C8268v vVar) {
        this.f14170a = new C4570b(vVar);
    }
}

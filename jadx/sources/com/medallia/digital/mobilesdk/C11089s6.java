package com.medallia.digital.mobilesdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.s6 */
class C11089s6<T> implements C10769c8 {

    /* renamed from: b */
    private static final String f31872b = "com.medallia.digital.sharedpreference.SHARED_PREFS_KEY";

    /* renamed from: c */
    public static final String f31873c = "customParameterType";

    /* renamed from: d */
    public static final String f31874d = "TypeNull";

    /* renamed from: e */
    private static C11089s6 f31875e;

    /* renamed from: f */
    private static SharedPreferences f31876f;

    /* renamed from: a */
    private final HashMap<C11090a, Object> f31877a = new HashMap<>();

    /* renamed from: com.medallia.digital.mobilesdk.s6$a */
    protected enum C11090a {
        API_TOKEN,
        ACCESS_TOKEN,
        SESSION_ID,
        PROPERTY_ID,
        SESSION_COUNTER,
        PREVIOUS_SESSION_ID,
        DEVICE_ID,
        CUSTOM_PARAMETERS,
        TARGET_ENGINE,
        UUID,
        LOCAL_CONFIGURATION_TIMESTAMP,
        UUID_URL,
        LENNY,
        NALA,
        LAST_SDK_VERSION,
        LAST_OS_VERSION,
        SDK_KILL_TIMESTAMP,
        SDK_RECOVER_TIMESTAMP,
        IS_SDK_KILLED,
        SHOULD_CHECK_OS,
        SDK_STOPPED,
        MISSING_EVENTS,
        MISSING_EVENTS_V2,
        PREVIOUS_ANALYTICS_V2,
        PREVIOUS_SEND_USER_JOURNEY,
        INIT_CALLBACK_EVENT,
        IS_BLACKBOX_ENABLED,
        CUSTOM_LOCALE,
        OS_LOCALE,
        CUSTOM_APPEARANCE,
        OS_APPEARANCE,
        IS_DEBUG_FORM,
        OCQ_USER_ID,
        OCQ_PREVIOUS_USER_ID,
        OCQ_UUID,
        OCQ_UUID_URL,
        C_UUID,
        SESSION_CALCULATED_PERCENTAGE,
        INVITATION_DISPLAYED,
        LAST_SUBMIT_TIMESTAMP,
        LAST_DECLINE_TIMESTAMP
    }

    private C11089s6() {
        if (C10884i4.m39721c().mo28483b() != null) {
            f31876f = C10884i4.m39721c().mo28483b().getSharedPreferences(f31872b, 0);
        }
    }

    /* renamed from: b */
    protected static C11089s6 m40668b() {
        if (f31875e == null || f31876f == null) {
            f31875e = new C11089s6();
        }
        return f31875e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo28973a(C11090a aVar, int i) {
        return mo28987d() ? f31876f.getInt(aVar.toString(), i) : i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public SharedPreferences mo28986c() {
        return f31876f;
    }

    public void clearAndDisconnect() {
        C10735b4.m39107a(getClass().getSimpleName());
        mo28976a();
        f31876f = null;
        f31875e = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo28987d() {
        return f31876f != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo28988e() {
        C11090a aVar;
        long intValue;
        if (mo28987d()) {
            for (Map.Entry next : this.f31877a.entrySet()) {
                Object value = next.getValue();
                if (value instanceof String) {
                    mo28984b((C11090a) next.getKey(), (String) value);
                } else if (value instanceof Boolean) {
                    mo28985b((C11090a) next.getKey(), ((Boolean) value).booleanValue());
                } else {
                    if (value instanceof Long) {
                        aVar = (C11090a) next.getKey();
                        intValue = ((Long) value).longValue();
                    } else if (value instanceof Integer) {
                        aVar = (C11090a) next.getKey();
                        intValue = (long) ((Integer) value).intValue();
                    }
                    mo28983b(aVar, intValue);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo28974a(C11090a aVar, long j) {
        return mo28987d() ? f31876f.getLong(aVar.toString(), j) : j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public JSONArray mo28981b(C11090a aVar) {
        if (mo28987d() && !TextUtils.isEmpty(f31876f.getString(aVar.toString(), (String) null))) {
            try {
                return new JSONArray(f31876f.getString(aVar.toString(), (String) null));
            } catch (JSONException e) {
                C10735b4.m39111c(e.getMessage());
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo28975a(C11090a aVar, String str) {
        return mo28987d() ? f31876f.getString(aVar.toString(), str) : str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo28982b(C11090a aVar, int i) {
        if (mo28987d()) {
            f31876f.edit().putInt(aVar.toString(), i).commit();
        } else {
            this.f31877a.put(aVar, Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28976a() {
        if (mo28987d()) {
            f31876f.edit().clear().commit();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo28983b(C11090a aVar, long j) {
        if (mo28987d()) {
            f31876f.edit().putLong(aVar.toString(), j).commit();
        } else {
            this.f31877a.put(aVar, Long.valueOf(j));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28977a(Context context) {
        if (context != null) {
            f31876f = context.getSharedPreferences(f31872b, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo28984b(C11090a aVar, String str) {
        if (mo28987d()) {
            f31876f.edit().putString(aVar.toString(), str).commit();
        } else {
            this.f31877a.put(aVar, str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28978a(C11090a aVar) {
        if (!mo28987d()) {
            return false;
        }
        f31876f.edit().remove(aVar.toString()).commit();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo28985b(C11090a aVar, boolean z) {
        if (mo28987d()) {
            f31876f.edit().putBoolean(aVar.toString(), z).commit();
        } else {
            this.f31877a.put(aVar, Boolean.valueOf(z));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28979a(C11090a aVar, JSONArray jSONArray) {
        SharedPreferences.Editor putString;
        boolean z;
        if (!mo28987d() || jSONArray == null || jSONArray.length() == 0) {
            return false;
        }
        if (TextUtils.isEmpty(f31876f.getString(aVar.toString(), (String) null))) {
            putString = f31876f.edit().putString(aVar.toString(), jSONArray.toString());
        } else {
            JSONArray b = mo28981b(aVar);
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= b.length()) {
                                z = true;
                                break;
                            }
                            JSONObject jSONObject2 = b.getJSONObject(i2);
                            if (m40667a(jSONObject, jSONObject2, "name") && m40667a(jSONObject, jSONObject2, f31873c)) {
                                b.put(i2, jSONObject);
                                z = false;
                                break;
                            }
                            i2++;
                        }
                        if (z) {
                            b.put(jSONObject);
                        }
                    }
                    i++;
                } catch (Exception e) {
                    C10735b4.m39111c(e.getMessage());
                }
            }
            putString = f31876f.edit().putString(aVar.toString(), b.toString());
        }
        putString.commit();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28980a(C11090a aVar, boolean z) {
        return mo28987d() ? f31876f.getBoolean(aVar.toString(), z) : z;
    }

    /* renamed from: a */
    private boolean m40667a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        if (jSONObject2 != null) {
            try {
                if (jSONObject.isNull(str)) {
                    return false;
                }
                if (!str.equals(f31873c) || (!jSONObject.getString(f31873c).equals(f31874d) && !jSONObject2.getString(f31873c).equals(f31874d))) {
                    return jSONObject.getString(str).equals(jSONObject2.getString(str));
                }
                return true;
            } catch (JSONException e) {
                C10735b4.m39111c(e.getMessage());
            }
        }
        return false;
    }
}

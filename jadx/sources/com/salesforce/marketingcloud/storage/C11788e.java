package com.salesforce.marketingcloud.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteOpenHelper;
import android.preference.PreferenceManager;
import android.provider.Settings;
import androidx.collection.ArrayMap;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.util.C11808c;
import com.salesforce.marketingcloud.util.C11820i;
import com.salesforce.marketingcloud.util.C11821j;
import com.salesforce.marketingcloud.util.C11824l;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.salesforce.marketingcloud.storage.e */
abstract class C11788e {

    /* renamed from: c */
    protected static final String f34211c = C11461g.m41875a("Storage");

    /* renamed from: d */
    protected static final int f34212d = -1;

    /* renamed from: e */
    private static final String f34213e = "DEFAULT_SHARED_PREFERENCES";

    /* renamed from: f */
    private static final String f34214f = "et_207_preference_migration_complete";

    /* renamed from: g */
    private static AtomicBoolean f34215g = new AtomicBoolean(false);

    /* renamed from: a */
    private final String f34216a;

    /* renamed from: b */
    private final String f34217b;

    C11788e(String str, String str2) {
        this.f34216a = (String) C11821j.m43271a((String) C11821j.m43272a(str, "Application ID is null."), "Application ID is empty.");
        this.f34217b = (String) C11821j.m43271a((String) C11821j.m43272a(str2, "Access Token is null."), "Access Token is empty.");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0033 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object m43094a(com.salesforce.marketingcloud.util.C11808c r7, java.lang.String r8, java.lang.reflect.Type r9) {
        /*
            r6 = this;
            android.content.Context r0 = r6.mo31601a()
            java.lang.String r1 = "ETPush"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            r1 = 0
            java.lang.String r3 = "%s_enc"
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x003f }
            r5[r2] = r8     // Catch:{ Exception -> 0x003f }
            java.lang.String r3 = java.lang.String.format(r3, r5)     // Catch:{ Exception -> 0x003f }
            java.lang.String r3 = r0.getString(r3, r1)     // Catch:{ Exception -> 0x003f }
            if (r3 != 0) goto L_0x0021
            java.lang.String r3 = r0.getString(r8, r1)     // Catch:{ Exception -> 0x003f }
        L_0x0021:
            if (r3 == 0) goto L_0x003e
            java.lang.String r3 = r7.mo31644a(r3)     // Catch:{ UnsupportedEncodingException | GeneralSecurityException -> 0x0033 }
            java.lang.String r7 = f34211c     // Catch:{ UnsupportedEncodingException | GeneralSecurityException -> 0x0033 }
            java.lang.String r0 = "Found encrypted value for %s"
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ UnsupportedEncodingException | GeneralSecurityException -> 0x0033 }
            r5[r2] = r8     // Catch:{ UnsupportedEncodingException | GeneralSecurityException -> 0x0033 }
            com.salesforce.marketingcloud.C11461g.m41888c((java.lang.String) r7, (java.lang.String) r0, (java.lang.Object[]) r5)     // Catch:{ UnsupportedEncodingException | GeneralSecurityException -> 0x0033 }
            goto L_0x003e
        L_0x0033:
            java.lang.String r7 = f34211c     // Catch:{ Exception -> 0x003f }
            java.lang.String r0 = "Found unencrypted value for %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x003f }
            r4[r2] = r8     // Catch:{ Exception -> 0x003f }
            com.salesforce.marketingcloud.C11461g.m41888c((java.lang.String) r7, (java.lang.String) r0, (java.lang.Object[]) r4)     // Catch:{ Exception -> 0x003f }
        L_0x003e:
            r1 = r3
        L_0x003f:
            if (r1 == 0) goto L_0x0042
            goto L_0x0046
        L_0x0042:
            java.lang.Object r1 = r6.m43095a(r8, r9)
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.storage.C11788e.m43094a(com.salesforce.marketingcloud.util.c, java.lang.String, java.lang.reflect.Type):java.lang.Object");
    }

    /* renamed from: c */
    private void m43098c(C11808c cVar) {
        Map<String, String> c;
        String[] strArr = {C11751c.f34083c, C11751c.f34082b, C11751c.f34084d};
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            try {
                String str2 = f34211c;
                C11461g.m41888c(str2, "Migrating %s ...", str);
                Object a = m43094a(cVar, str, (Type) String.class);
                if (C11751c.f34082b.equals(str) && (c = C11824l.m43294c((String) a)) != null) {
                    c.remove("_ETSDKVersion");
                    a = C11824l.m43283a(c);
                }
                if (a == null || "null".equals(a)) {
                    C11461g.m41888c(str2, "Value was \"null\" and will not be migrated.", new Object[0]);
                } else {
                    C11461g.m41888c(str2, "Writing %s to encrypted preferences ...", str);
                    mo31606c().mo31111a(str, String.valueOf(a));
                }
                C11461g.m41888c(str2, "Done with %s.", str);
            } catch (Exception e) {
                C11461g.m41885b(f34211c, e, "Unable to migrate %s", str);
            }
        }
    }

    /* renamed from: d */
    private String m43099d() {
        return C11824l.m43298e(Settings.Secure.getString(mo31601a().getContentResolver(), "android_id") + "-" + mo31601a().getPackageName());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Context mo31601a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo31602a(Context context, int i, int i2);

    /* renamed from: b */
    public abstract C11808c mo31604b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo31605b(Context context, int i, int i2) {
        String[] databaseList;
        if (i == -1 && (databaseList = context.databaseList()) != null) {
            for (String equals : databaseList) {
                if ("etdb.db".equals(equals)) {
                    m43096a(context, this.f34216a, this.f34217b);
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public abstract C11751c mo31606c();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract SQLiteOpenHelper mo31607e();

    /* renamed from: f */
    public abstract SharedPreferences mo31608f();

    /* renamed from: a */
    private Object m43095a(String str, Type type) {
        String[] strArr = {"ETPush", "et_registration_cache", "~!Registration", "~!ETPush", "~!ETLocationManager", "etpushSDK@ETPush", "etpushsdk@ETLocationManager", f34213e};
        for (int i = 0; i < 8; i++) {
            String str2 = strArr[i];
            SharedPreferences defaultSharedPreferences = f34213e.equals(str2) ? PreferenceManager.getDefaultSharedPreferences(mo31601a()) : mo31601a().getSharedPreferences(str2, 0);
            if (defaultSharedPreferences.contains(str)) {
                if (type == Boolean.class) {
                    try {
                        return Boolean.valueOf(defaultSharedPreferences.getBoolean(str, false));
                    } catch (ClassCastException unused) {
                    }
                } else if (type == String.class) {
                    return defaultSharedPreferences.getString(str, (String) null);
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    private void m43097b(C11808c cVar) {
        boolean z;
        SharedPreferences.Editor edit = mo31608f().edit();
        ArrayMap arrayMap = new ArrayMap();
        Class<Boolean> cls = Boolean.class;
        arrayMap.put("et_geo_enabled_key", cls);
        arrayMap.put("et_proximity_enabled_key", cls);
        arrayMap.put("et_push_enabled", cls);
        for (Map.Entry entry : arrayMap.entrySet()) {
            String str = (String) entry.getKey();
            Type type = (Type) entry.getValue();
            String str2 = f34211c;
            C11461g.m41888c(str2, "Migrating %s ...", str);
            try {
                Object a = m43094a(cVar, str, type);
                if (a != null) {
                    if (type == cls) {
                        if (a instanceof Boolean) {
                            z = ((Boolean) a).booleanValue();
                        } else if (a instanceof String) {
                            z = Boolean.valueOf((String) a).booleanValue();
                        } else {
                            C11461g.m41888c(str2, "Unknown Type for %s. Preference will not be migrated.", str);
                        }
                        edit.putBoolean(str, z);
                    } else {
                        C11461g.m41888c(str2, "Key '%s' with value of '%s' was not written to preferences.", str, a);
                    }
                }
                C11461g.m41888c(str2, "Done with %s.", str);
            } catch (Exception e) {
                C11461g.m41885b(f34211c, e, "Unable to migrate %s", str);
            }
        }
        edit.apply();
    }

    /* renamed from: a */
    private void m43096a(Context context, String str, String str2) {
        boolean z;
        try {
            boolean andSet = f34215g.getAndSet(true);
            boolean z2 = mo31608f().getBoolean(f34214f, false);
            if (!andSet) {
                if (!z2) {
                    C11820i iVar = new C11820i(context, str, str2, m43099d());
                    try {
                        iVar.mo31644a(context.getSharedPreferences("ETPush", 0).getString("et_device_id_cache_enc", (String) null));
                        z = true;
                    } catch (Exception unused) {
                        z = false;
                    }
                    if (z) {
                        mo31603a(iVar);
                        C11461g.m41888c(f34211c, "Old data migrations completed without exception.", new Object[0]);
                    } else {
                        C11461g.m41880a(f34211c, "Unable to verify old encryption.  Moving on without migrating data.", new Object[0]);
                    }
                    mo31608f().edit().putBoolean(f34214f, true).apply();
                    f34215g.set(false);
                    return;
                }
            }
            mo31608f().edit().putBoolean(f34214f, true).apply();
            f34215g.set(false);
        } catch (Exception e) {
            C11461g.m41885b(f34211c, e, "Data migration failed", new Object[0]);
        } catch (Throwable th) {
            mo31608f().edit().putBoolean(f34214f, true).apply();
            f34215g.set(false);
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31603a(C11808c cVar) {
        String str = f34211c;
        C11461g.m41888c(str, "Migrating SharedPreferences ...", new Object[0]);
        m43098c(cVar);
        m43097b(cVar);
        C11461g.m41888c(str, "Finished migrating SharedPreferences.", new Object[0]);
    }
}

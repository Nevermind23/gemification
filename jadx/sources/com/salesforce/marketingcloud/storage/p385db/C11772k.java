package com.salesforce.marketingcloud.storage.p385db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.salesforce.marketingcloud.internal.C11511k;
import com.salesforce.marketingcloud.registration.Registration;
import com.salesforce.marketingcloud.storage.C11803m;
import com.salesforce.marketingcloud.util.C11808c;
import com.salesforce.marketingcloud.util.C11824l;
import java.util.Locale;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.storage.db.k */
public final class C11772k extends C11757b implements C11803m {

    /* renamed from: e */
    public static final String f34166e = "registration";

    /* renamed from: f */
    private static final String[] f34167f = {"id", C11773a.f34170b, C11773a.f34171c, C11773a.f34172d, C11773a.f34173e, C11773a.f34174f, C11773a.f34175g, C11773a.f34176h, C11773a.f34177i, C11773a.f34178j, C11773a.f34179k, C11773a.f34180l, C11773a.f34181m, C11773a.f34183o, C11773a.f34184p, C11773a.f34185q, C11773a.f34186r, C11773a.f34187s, C11773a.f34182n};

    /* renamed from: g */
    private static final String f34168g = "CREATE TABLE registration (id INTEGER PRIMARY KEY AUTOINCREMENT, platform VARCHAR, subscriber_key VARCHAR, et_app_id VARCHAR, timezone INTEGER, dst SMALLINT, tags VARCHAR, attributes VARCHAR, platform_version VARCHAR, push_enabled SMALLINT, location_enabled SMALLINT, proximity_enabled SMALLINT, hwid VARCHAR, system_token VARCHAR, device_id VARCHAR, app_version VARCHAR, sdk_version VARCHAR, signed_string VARCHAR, locale VARCHAR );";

    /* renamed from: com.salesforce.marketingcloud.storage.db.k$a */
    public static class C11773a {

        /* renamed from: a */
        public static final String f34169a = "id";

        /* renamed from: b */
        public static final String f34170b = "platform";

        /* renamed from: c */
        public static final String f34171c = "subscriber_key";

        /* renamed from: d */
        public static final String f34172d = "et_app_id";

        /* renamed from: e */
        public static final String f34173e = "timezone";

        /* renamed from: f */
        public static final String f34174f = "dst";

        /* renamed from: g */
        public static final String f34175g = "tags";

        /* renamed from: h */
        public static final String f34176h = "attributes";

        /* renamed from: i */
        public static final String f34177i = "platform_version";

        /* renamed from: j */
        public static final String f34178j = "push_enabled";

        /* renamed from: k */
        public static final String f34179k = "location_enabled";

        /* renamed from: l */
        public static final String f34180l = "proximity_enabled";

        /* renamed from: m */
        public static final String f34181m = "hwid";

        /* renamed from: n */
        public static final String f34182n = "locale";

        /* renamed from: o */
        public static final String f34183o = "system_token";

        /* renamed from: p */
        public static final String f34184p = "device_id";

        /* renamed from: q */
        public static final String f34185q = "app_version";

        /* renamed from: r */
        public static final String f34186r = "sdk_version";

        /* renamed from: s */
        public static final String f34187s = "signed_string";
    }

    public C11772k(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    /* renamed from: b */
    static void m43033b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f34168g);
    }

    /* renamed from: c */
    private static ContentValues m43034c(Registration registration, C11808c cVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C11773a.f34171c, cVar.mo31645b(registration.contactKey()));
        contentValues.put(C11773a.f34187s, cVar.mo31645b(registration.signedString()));
        contentValues.put(C11773a.f34172d, cVar.mo31645b(registration.appId()));
        contentValues.put(C11773a.f34183o, cVar.mo31645b(registration.systemToken()));
        contentValues.put(C11773a.f34175g, cVar.mo31645b(C11824l.m43284a(registration.tags())));
        contentValues.put(C11773a.f34176h, cVar.mo31645b(C11824l.m43283a(registration.attributes())));
        contentValues.put(C11773a.f34184p, registration.deviceId());
        contentValues.put(C11773a.f34170b, registration.platform());
        contentValues.put(C11773a.f34173e, Integer.valueOf(registration.timeZone()));
        contentValues.put(C11773a.f34174f, Integer.valueOf(registration.dst() ? 1 : 0));
        contentValues.put(C11773a.f34177i, registration.platformVersion());
        contentValues.put(C11773a.f34178j, Integer.valueOf(registration.pushEnabled() ? 1 : 0));
        contentValues.put(C11773a.f34179k, Integer.valueOf(registration.locationEnabled() ? 1 : 0));
        contentValues.put(C11773a.f34180l, Integer.valueOf(registration.proximityEnabled() ? 1 : 0));
        contentValues.put(C11773a.f34181m, registration.hwid());
        contentValues.put(C11773a.f34182n, registration.locale());
        contentValues.put(C11773a.f34185q, registration.appVersion());
        contentValues.put(C11773a.f34186r, registration.sdkVersion());
        return contentValues;
    }

    /* renamed from: a */
    public int mo31580a(Registration registration, C11808c cVar) {
        return mo31521a(m43034c(registration, cVar), m43031a("%s = ?", "id"), new String[]{String.valueOf(C11511k.m42069a(registration))});
    }

    /* renamed from: e */
    public int mo31582e() {
        return mo31534i(m43031a("%1$s NOT IN ( SELECT %1$s FROM ( SELECT %1$s FROM %2$s ORDER BY %1$s DESC LIMIT 1))", "id", mo31520p()));
    }

    /* renamed from: g */
    public Registration mo31583g(C11808c cVar) {
        Cursor a = mo31529a(f34167f, (String) null, (String[]) null, (String) null, (String) null, m43031a("%s DESC", "id"), "1");
        Registration registration = null;
        if (a != null) {
            if (a.moveToFirst()) {
                registration = C11759d.m42923d(a, cVar);
            }
            a.close();
        }
        return registration;
    }

    /* renamed from: o */
    public int mo31584o() {
        return mo31534i((String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public String mo31520p() {
        return f34166e;
    }

    /* renamed from: a */
    private static String m43031a(String str, Object... objArr) {
        return String.format(Locale.ENGLISH, str, objArr);
    }

    /* renamed from: c */
    static boolean m43035c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.compileStatement(m43031a("SELECT %s FROM %s", TextUtils.join(",", f34167f), f34166e));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public void mo31581b(Registration registration, C11808c cVar) {
        C11511k.m42071a(registration, (int) mo31524a(m43034c(registration, cVar)));
    }

    /* renamed from: a */
    static void m43032a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS registration");
    }
}

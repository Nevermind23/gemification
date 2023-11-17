package com.salesforce.marketingcloud.storage.p385db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.location.LatLon;
import com.salesforce.marketingcloud.storage.C11799i;
import com.salesforce.marketingcloud.util.C11808c;
import java.util.Locale;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

@SuppressLint({"UnknownNullness", "Range"})
/* renamed from: com.salesforce.marketingcloud.storage.db.h */
public final class C11767h extends C11757b implements C11799i {

    /* renamed from: e */
    public static final String f34127e = "location_table";

    /* renamed from: f */
    private static final String f34128f = "CREATE TABLE location_table (id INTEGER PRIMARY KEY CHECK (id = 0), latitude VARCHAR, longitude VARCHAR );";

    /* renamed from: g */
    private static final String[] f34129g = {"id", C11768a.f34132b, C11768a.f34133c};

    /* renamed from: h */
    private static final String f34130h = C11461g.m41875a("LocationDbStorage");

    /* renamed from: com.salesforce.marketingcloud.storage.db.h$a */
    public static class C11768a {

        /* renamed from: a */
        public static final String f34131a = "id";

        /* renamed from: b */
        public static final String f34132b = "latitude";

        /* renamed from: c */
        public static final String f34133c = "longitude";
    }

    public C11767h(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    /* renamed from: a */
    static void m42989a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS location_table");
    }

    /* renamed from: b */
    static void m42990b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f34128f);
    }

    /* renamed from: d */
    static boolean m42992d(SQLiteDatabase sQLiteDatabase) {
        boolean c = m42991c(sQLiteDatabase);
        if (c) {
            return c;
        }
        try {
            m42989a(sQLiteDatabase);
            m42990b(sQLiteDatabase);
            return m42991c(sQLiteDatabase);
        } catch (Exception e) {
            C11461g.m41885b(f34130h, e, "Unable to recover %s", f34127e);
            return c;
        }
    }

    /* renamed from: c */
    public int mo31562c() {
        return mo31534i((String) null);
    }

    /* renamed from: e */
    public LatLon mo31563e(C11808c cVar) {
        Cursor a = mo31527a(f34129g, String.format(Locale.ENGLISH, "%s = ?", new Object[]{"id"}), new String[]{BankApiResponse.SUCCESSFUL_RESPONSE_CODE});
        LatLon latLon = null;
        if (a != null) {
            if (a.moveToFirst()) {
                try {
                    latLon = new LatLon(Double.valueOf(cVar.mo31644a(a.getString(a.getColumnIndex(C11768a.f34132b)))).doubleValue(), Double.valueOf(cVar.mo31644a(a.getString(a.getColumnIndex(C11768a.f34133c)))).doubleValue());
                } catch (Exception e) {
                    C11461g.m41885b(f34130h, e, "Unable to read location from database.", new Object[0]);
                }
            }
            a.close();
        }
        return latLon;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public String mo31520p() {
        return f34127e;
    }

    /* renamed from: c */
    private static boolean m42991c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.compileStatement(C11758c.m42915a("SELECT %s FROM %s", TextUtils.join(",", f34129g), f34127e));
            return true;
        } catch (Exception e) {
            C11461g.m41895e(f34130h, e, "%s is invalid", f34127e);
            return false;
        }
    }

    /* renamed from: a */
    public void mo31561a(LatLon latLon, C11808c cVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", 0);
        contentValues.put(C11768a.f34132b, cVar.mo31645b(Double.toString(latLon.latitude())));
        contentValues.put(C11768a.f34133c, cVar.mo31645b(Double.toString(latLon.longitude())));
        if (mo31521a(contentValues, String.format(Locale.ENGLISH, "%s = ?", new Object[]{"id"}), new String[]{BankApiResponse.SUCCESSFUL_RESPONSE_CODE}) == 0) {
            mo31524a(contentValues);
        }
    }
}

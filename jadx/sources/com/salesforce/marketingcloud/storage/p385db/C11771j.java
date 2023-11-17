package com.salesforce.marketingcloud.storage.p385db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.internal.C11509j;
import com.salesforce.marketingcloud.location.LatLon;
import com.salesforce.marketingcloud.messages.Message;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.storage.C11802l;
import com.salesforce.marketingcloud.storage.p385db.C11767h;
import com.salesforce.marketingcloud.util.C11808c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressLint({"UnknownNullness", "Range"})
/* renamed from: com.salesforce.marketingcloud.storage.db.j */
public final class C11771j extends C11757b implements C11802l {

    /* renamed from: e */
    public static final String f34163e = "regions";

    /* renamed from: f */
    public static final String f34164f = "region_messages";

    /* renamed from: g */
    static final String f34165g = C11461g.m41875a("RegionDbStorage");

    public C11771j(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    /* renamed from: a */
    private static ContentValues m43012a(Region region, Message message) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("region_id", region.mo30395id());
        contentValues.put("message_id", message.mo30330id());
        return contentValues;
    }

    /* renamed from: b */
    private static void m43014b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE regions(id TEXT PRIMARY KEY, latitude TEXT, longitude TEXT, radius INTEGER, beacon_guid TEXT, beacon_major INTEGER, beacon_minor INTEGER, description TEXT, name TEXT, location_type INTEGER, is_inside SMALLINT);");
    }

    /* renamed from: c */
    private static ContentValues m43015c(Region region, C11808c cVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", region.mo30395id());
        contentValues.put(C11767h.C11768a.f34132b, cVar.mo31645b(String.valueOf(region.center().latitude())));
        contentValues.put(C11767h.C11768a.f34133c, cVar.mo31645b(String.valueOf(region.center().longitude())));
        contentValues.put("radius", Integer.valueOf(region.radius()));
        contentValues.put("beacon_guid", cVar.mo31645b(region.proximityUuid()));
        contentValues.put("beacon_major", Integer.valueOf(region.major()));
        contentValues.put("beacon_minor", Integer.valueOf(region.minor()));
        contentValues.put("description", cVar.mo31645b(region.description()));
        contentValues.put("name", cVar.mo31645b(region.name()));
        contentValues.put("location_type", Integer.valueOf(region.regionType()));
        contentValues.put("is_inside", Integer.valueOf(C11509j.m42065a(region) ? 1 : 0));
        return contentValues;
    }

    /* renamed from: f */
    private static boolean m43019f(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.compileStatement("SELECT id,latitude,longitude,radius,beacon_guid,beacon_major,beacon_minor,description,name,location_type,is_inside FROM regions");
            return true;
        } catch (Exception e) {
            C11461g.m41895e(f34165g, e, "%s is invalid", f34163e);
            return false;
        }
    }

    /* renamed from: g */
    static boolean m43020g(SQLiteDatabase sQLiteDatabase) {
        boolean f = m43019f(sQLiteDatabase);
        if (!f) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS regions");
                m43014b(sQLiteDatabase);
                f = m43019f(sQLiteDatabase);
            } catch (Exception e) {
                C11461g.m41885b(f34165g, e, "Unable to recover %s", f34163e);
            }
        }
        boolean e2 = m43018e(sQLiteDatabase);
        if (f && !e2) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS region_messages");
                m43013a(sQLiteDatabase);
                e2 = m43018e(sQLiteDatabase);
            } catch (Exception e3) {
                C11461g.m41885b(f34165g, e3, "Unable to recover %s", f34164f);
            }
        }
        return f && e2;
    }

    /* renamed from: d */
    public int mo31576d(int i) {
        return this.f34110c.delete(f34163e, "location_type=?", new String[]{String.valueOf(i)});
    }

    /* renamed from: e */
    public List<String> mo31577e(int i) {
        List<String> emptyList = Collections.emptyList();
        Cursor rawQuery = this.f34110c.rawQuery("SELECT id FROM regions WHERE location_type=?", new String[]{String.valueOf(i)});
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                ArrayList arrayList = new ArrayList();
                int columnIndex = rawQuery.getColumnIndex("id");
                do {
                    arrayList.add(rawQuery.getString(columnIndex));
                } while (rawQuery.moveToNext());
                emptyList = arrayList;
            }
            rawQuery.close();
        }
        return emptyList;
    }

    /* renamed from: h */
    public Region mo31578h(C11808c cVar) {
        Cursor rawQuery = this.f34110c.rawQuery("SELECT * FROM regions WHERE id=?", new String[]{Region.MAGIC_REGION_ID});
        Region region = null;
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                try {
                    region = C11509j.m42063a(new LatLon(Double.valueOf(cVar.mo31644a(rawQuery.getString(rawQuery.getColumnIndex(C11767h.C11768a.f34132b)))).doubleValue(), Double.valueOf(cVar.mo31644a(rawQuery.getString(rawQuery.getColumnIndex(C11767h.C11768a.f34133c)))).doubleValue()), rawQuery.getInt(rawQuery.getColumnIndex("radius")));
                } catch (Exception e) {
                    C11461g.m41885b(f34165g, e, "Unable to read magic region from DB.", new Object[0]);
                }
            }
            rawQuery.close();
        }
        return region;
    }

    /* renamed from: l */
    public void mo31579l() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_inside", 0);
        this.f34110c.update(f34163e, contentValues, (String) null, (String[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public String mo31520p() {
        return f34163e;
    }

    /* renamed from: c */
    static void m43016c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS regions");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS region_messages");
    }

    /* renamed from: d */
    static void m43017d(SQLiteDatabase sQLiteDatabase) {
        m43014b(sQLiteDatabase);
        m43013a(sQLiteDatabase);
    }

    /* renamed from: e */
    private static boolean m43018e(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.compileStatement("SELECT region_id,message_id FROM region_messages");
            return true;
        } catch (Exception e) {
            C11461g.m41895e(f34165g, e, "%s is invalid", f34164f);
            return false;
        }
    }

    /* renamed from: a */
    public Region mo31571a(String str, C11808c cVar) {
        Cursor rawQuery = this.f34110c.rawQuery("SELECT * FROM regions WHERE id=?", new String[]{str});
        Region region = null;
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                region = C11759d.m42922c(rawQuery, cVar);
            }
            rawQuery.close();
        }
        return region;
    }

    /* renamed from: a */
    public List<Region> mo31572a(int i, C11808c cVar) {
        List<Region> emptyList = Collections.emptyList();
        Cursor rawQuery = this.f34110c.rawQuery("SELECT * FROM regions WHERE location_type=?", new String[]{String.valueOf(i)});
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                ArrayList arrayList = new ArrayList(rawQuery.getCount());
                do {
                    Region c = C11759d.m42922c(rawQuery, cVar);
                    if (c != null) {
                        arrayList.add(c);
                    }
                } while (rawQuery.moveToNext());
                emptyList = arrayList;
            }
            rawQuery.close();
        }
        return emptyList;
    }

    /* renamed from: a */
    public List<String> mo31573a(String str, int i) {
        ArrayList arrayList;
        Cursor rawQuery = this.f34110c.rawQuery("SELECT message_id FROM region_messages INNER JOIN messages on region_messages.message_id = messages.id WHERE region_id = ? AND messages.message_type = ?", new String[]{str, String.valueOf(i)});
        if (rawQuery.moveToFirst()) {
            arrayList = new ArrayList(rawQuery.getCount());
            int columnIndex = rawQuery.getColumnIndex("message_id");
            do {
                arrayList.add(rawQuery.getString(columnIndex));
            } while (rawQuery.moveToNext());
        } else {
            arrayList = null;
        }
        rawQuery.close();
        return arrayList != null ? arrayList : Collections.emptyList();
    }

    /* renamed from: a */
    private static void m43013a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE region_messages (region_id TEXT,  message_id TEXT, FOREIGN KEY (region_id) REFERENCES regions(id) ON DELETE CASCADE, PRIMARY KEY (region_id, message_id));");
    }

    /* renamed from: a */
    public void mo31574a(Region region, C11808c cVar) {
        this.f34110c.insertWithOnConflict(f34163e, (String) null, m43015c(region, cVar), 5);
        if (!region.messages().isEmpty()) {
            for (Message a : region.messages()) {
                this.f34110c.insertWithOnConflict(f34164f, (String) null, m43012a(region, a), 5);
            }
        }
    }

    /* renamed from: a */
    public void mo31575a(String str, boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_inside", Integer.valueOf(z ? 1 : 0));
        this.f34110c.update(f34163e, contentValues, "id=?", new String[]{str});
    }
}

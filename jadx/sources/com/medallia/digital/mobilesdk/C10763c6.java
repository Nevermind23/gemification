package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.medallia.digital.mobilesdk.c6 */
public class C10763c6 extends C10929k1<ResourceContract> {

    /* renamed from: d */
    private static final String f30828d = "ResourceData";

    /* renamed from: com.medallia.digital.mobilesdk.c6$a */
    class C10764a extends HashMap<String, String> {
        C10764a() {
            put("formId", "TEXT");
            put("remoteUrl", "TEXT");
            put("localUrl", "TEXT");
            put("checksum", "TEXT");
            put("isGlobal", "INTEGER");
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.c6$b */
    private static class C10765b {

        /* renamed from: a */
        private static final String f30830a = "formId";

        /* renamed from: b */
        private static final String f30831b = "remoteUrl";

        /* renamed from: c */
        private static final String f30832c = "localUrl";

        /* renamed from: d */
        private static final String f30833d = "checksum";

        /* renamed from: e */
        private static final String f30834e = "isGlobal";

        private C10765b() {
        }
    }

    /* renamed from: a */
    private ResourceContract m39260a(Cursor cursor, boolean z) {
        return new ResourceContract(cursor.getString(cursor.getColumnIndex("formId")), C11051p3.m40516a(cursor.getString(cursor.getColumnIndex("remoteUrl")), z), C11051p3.m40516a(cursor.getString(cursor.getColumnIndex("localUrl")), z), cursor.getString(cursor.getColumnIndex("checksum")), cursor.getInt(cursor.getColumnIndex("isGlobal")) == 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ContentValues mo28223b(ResourceContract resourceContract) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("formId", resourceContract.getFormId());
        contentValues.put("remoteUrl", C11051p3.m40516a(resourceContract.getRemoteUrl(), true));
        contentValues.put("localUrl", C11051p3.m40516a(resourceContract.getLocalUrl(), true));
        contentValues.put("checksum", resourceContract.getChecksum());
        contentValues.put("isGlobal", Integer.valueOf(resourceContract.isGlobal().booleanValue() ? 1 : 0));
        return contentValues;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public long mo28225c() {
        try {
            return DatabaseUtils.queryNumEntries(C10876i1.m39698a().getWritableDatabase(), f30828d);
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public ResourceContract mo28224b(Object... objArr) {
        String str;
        Cursor cursor;
        ResourceContract resourceContract = null;
        if (objArr != null && objArr.length > 0 && (str = objArr[0]) != null && (str instanceof String)) {
            String str2 = str;
            if (objArr.length == 1) {
                cursor = C10876i1.m39698a().getReadableDatabase().query(mo28233e(), (String[]) null, "remoteUrl=?", new String[]{C11051p3.m40516a(str2, true)}, (String) null, (String) null, (String) null);
            } else if (objArr.length == 2) {
                String str3 = objArr[1];
                if (str3 == null || !(str3 instanceof String)) {
                    return null;
                }
                cursor = C10876i1.m39698a().getReadableDatabase().query(mo28233e(), (String[]) null, "formId=? AND remoteUrl=?", new String[]{str3, C11051p3.m40516a(str2, true)}, (String) null, (String) null, (String) null);
            } else {
                cursor = null;
            }
            if (cursor != null) {
                if (cursor.moveToFirst()) {
                    resourceContract = m39260a(cursor, false);
                }
                cursor.close();
            }
        }
        return resourceContract;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo28233e() {
        return f30828d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ArrayList<ResourceContract> mo28218a(String str) {
        Cursor query;
        ArrayList<ResourceContract> arrayList = new ArrayList<>();
        if (!(str == null || (query = C10876i1.m39698a().getReadableDatabase().query(mo28233e(), (String[]) null, "formId=?", new String[]{str}, (String) null, (String) null, (String) null)) == null)) {
            if (query.moveToFirst()) {
                do {
                    arrayList.add(m39260a(query, false));
                } while (query.moveToNext());
            }
            query.close();
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public ArrayList<ResourceContract> mo28226c(Object... objArr) {
        Cursor cursor;
        if (objArr == null || objArr.length <= 0) {
            cursor = C10876i1.m39698a().getReadableDatabase().query(mo28233e(), (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        } else {
            Boolean bool = objArr[0];
            if (bool == null || !(bool instanceof Boolean)) {
                return null;
            }
            boolean booleanValue = bool.booleanValue();
            SQLiteDatabase readableDatabase = C10876i1.m39698a().getReadableDatabase();
            cursor = readableDatabase.rawQuery("select * from '" + mo28233e() + "' where " + "isGlobal" + "=?", new String[]{String.valueOf(booleanValue ? 1 : 0)});
        }
        ArrayList<ResourceContract> arrayList = new ArrayList<>();
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                do {
                    arrayList.add(m39260a(cursor, false));
                } while (cursor.moveToNext());
            }
            cursor.close();
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public HashMap<String, String> mo28230d() {
        return new C10764a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28220a(ResourceContract resourceContract) {
        String str;
        String[] strArr;
        String str2;
        boolean z = false;
        boolean z2 = true;
        if (resourceContract == null) {
            str2 = "delete (invalid data) - record is null";
        } else {
            if (resourceContract.isGlobal().booleanValue()) {
                strArr = new String[]{C11051p3.m40516a(resourceContract.getRemoteUrl(), true)};
                str = "isGlobal=1 AND remoteUrl=?";
            } else if (TextUtils.isEmpty(resourceContract.getFormId())) {
                str2 = "delete (invalid data) formId is not valid";
            } else {
                strArr = new String[]{resourceContract.getFormId(), C11051p3.m40516a(resourceContract.getRemoteUrl(), true)};
                str = "formId=? AND remoteUrl=?";
            }
            if (C10876i1.m39698a().getWritableDatabase().delete(mo28233e(), str, strArr) > 0) {
                z = true;
            }
            z2 = !z;
            str2 = "delete - " + resourceContract;
        }
        mo28623a(z2, str2);
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo28228c(ResourceContract resourceContract) {
        if (!TextUtils.isEmpty(resourceContract.getFormId()) && !TextUtils.isEmpty(resourceContract.getRemoteUrl()) && !TextUtils.isEmpty(resourceContract.getLocalUrl())) {
            return super.mo28228c(resourceContract);
        }
        mo28623a(true, "insert (invalid data from collector) - " + resourceContract);
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo28232d(ResourceContract resourceContract) {
        SQLiteDatabase writableDatabase = C10876i1.m39698a().getWritableDatabase();
        String e = mo28233e();
        ContentValues b = mo28223b(resourceContract);
        StringBuilder sb = new StringBuilder();
        sb.append("remoteUrl=? AND localUrl=?");
        sb.append(TextUtils.isEmpty(resourceContract.getFormId()) ? "" : " AND formId=?");
        return writableDatabase.update(e, b, sb.toString(), TextUtils.isEmpty(resourceContract.getFormId()) ? new String[]{C11051p3.m40516a(resourceContract.getRemoteUrl(), true), C11051p3.m40516a(resourceContract.getLocalUrl(), true)} : new String[]{C11051p3.m40516a(resourceContract.getRemoteUrl(), true), C11051p3.m40516a(resourceContract.getLocalUrl(), true), resourceContract.getFormId()}) > 0 || super.mo28228c(resourceContract);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28221a(Object... objArr) {
        Boolean bool;
        if (objArr == null || objArr.length <= 0 || (bool = objArr[0]) == null || !(bool instanceof Boolean)) {
            return false;
        }
        return C10876i1.m39698a().getWritableDatabase().delete(mo28233e(), "isGlobal=?", new String[]{String.valueOf(bool.booleanValue() ? 1 : 0)}) > 0;
    }
}

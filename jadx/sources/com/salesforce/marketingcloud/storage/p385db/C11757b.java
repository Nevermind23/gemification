package com.salesforce.marketingcloud.storage.p385db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.Collection;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.storage.db.b */
public abstract class C11757b {

    /* renamed from: d */
    protected static final String f34109d = "%s = ?";

    /* renamed from: c */
    protected final SQLiteDatabase f34110c;

    public C11757b(SQLiteDatabase sQLiteDatabase) {
        this.f34110c = sQLiteDatabase;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo31521a(ContentValues contentValues, String str, String[] strArr) {
        return this.f34110c.update(mo31520p(), contentValues, str, strArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo31531b(String str, Collection<String> collection) {
        this.f34110c.execSQL(C11758c.m42915a("DROP TABLE IF EXISTS tmp_%s;", str));
        this.f34110c.execSQL(C11758c.m42915a("CREATE TEMPORARY TABLE tmp_%s(id VARCHAR);", str));
        ContentValues contentValues = new ContentValues();
        for (String put : collection) {
            contentValues.put("id", put);
            this.f34110c.insert(C11758c.m42915a("tmp_%s", str), (String) null, contentValues);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo31532c(Collection<String> collection) {
        return m42899a(mo31520p(), collection, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo31533h(String str) {
        this.f34110c.execSQL(C11758c.m42915a("DROP TABLE IF EXISTS tmp_%s;", str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final int mo31534i(String str) {
        return mo31523a(str, (String[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public abstract String mo31520p();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo31522a(String str, Collection<String> collection) {
        return m42899a(str, collection, true);
    }

    /* renamed from: a */
    private int m42899a(String str, Collection<String> collection, boolean z) {
        try {
            this.f34110c.beginTransaction();
            mo31531b(str, collection);
            SQLiteDatabase sQLiteDatabase = this.f34110c;
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[1] = z ? "IS NULL" : "IS NOT NULL";
            int delete = sQLiteDatabase.delete(str, C11758c.m42915a("id IN(SELECT %1$s.id FROM %1$s LEFT JOIN tmp_%1$s ON %1$s.id = tmp_%1$s.id WHERE tmp_%1$s.id %2$s)", objArr), (String[]) null);
            mo31533h(str);
            this.f34110c.setTransactionSuccessful();
            this.f34110c.endTransaction();
            return delete;
        } catch (SQLException e) {
            this.f34110c.endTransaction();
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo31523a(String str, String[] strArr) {
        return this.f34110c.delete(mo31520p(), str, strArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo31524a(ContentValues contentValues) {
        return this.f34110c.insert(mo31520p(), (String) null, contentValues);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Cursor mo31525a(String str, String[] strArr, String str2, String[] strArr2) {
        return this.f34110c.query(str, strArr, str2, strArr2, (String) null, (String) null, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Cursor mo31526a(String[] strArr, String str) {
        return mo31529a(strArr, str, (String[]) null, (String) null, (String) null, (String) null, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Cursor mo31527a(String[] strArr, String str, String[] strArr2) {
        return mo31529a(strArr, str, strArr2, (String) null, (String) null, (String) null, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Cursor mo31528a(String[] strArr, String str, String[] strArr2, String str2, String str3, String str4) {
        return this.f34110c.query(false, mo31520p(), strArr, str, strArr2, str2, str3, str4, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Cursor mo31529a(String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5) {
        return this.f34110c.query(false, mo31520p(), strArr, str, strArr2, str2, str3, str4, str5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31530a(ContentValues contentValues, Collection<String> collection) {
        try {
            this.f34110c.beginTransactionNonExclusive();
            mo31531b(mo31520p(), collection);
            mo31521a(contentValues, C11758c.m42915a("id IN(SELECT %1$s.id FROM %1$s LEFT JOIN tmp_%1$s ON %1$s.id = tmp_%1$s.id WHERE tmp_%1$s.id IS NOT NULL)", mo31520p()), (String[]) null);
            mo31533h(mo31520p());
            this.f34110c.setTransactionSuccessful();
            this.f34110c.endTransaction();
        } catch (SQLException e) {
            this.f34110c.endTransaction();
            throw e;
        }
    }
}

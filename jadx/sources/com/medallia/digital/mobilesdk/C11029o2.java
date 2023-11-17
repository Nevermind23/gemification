package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.text.TextUtils;
import com.medallia.digital.mobilesdk.C11013n2;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.o2 */
class C11029o2 extends C10929k1<C11013n2> {

    /* renamed from: d */
    private static final String f31695d = "formData";

    /* renamed from: com.medallia.digital.mobilesdk.o2$a */
    class C11030a extends HashMap<String, String> {
        C11030a() {
            put("formId", "TEXT");
            put("name", "TEXT");
            put("fromJson", "TEXT");
            put("templatePath", "TEXT");
            put("templateId", "TEXT");
            put("title", "TEXT");
            put("titleTextColor", "TEXT");
            put("titleBackgroundColor", "TEXT");
            put("formType", "TEXT");
            put("formStatus", "INTEGER");
            put("transitionType", "TEXT");
            put("inviteData", "TEXT");
            put("viewType", "TEXT");
            put("isPreloaded", "INTEGER");
            put("formLanguage", "TEXT");
            put("poweredBy", "INTEGER");
            put("thankYouData", "TEXT");
            put("isBlockNetworkInForm", "INTEGER");
            put("redirectLinks", "TEXT");
            put("templateDebugRemoteUrl", "TEXT");
            put("urlVersion", "TEXT");
            put("shouldDownloadDebugForm", "INTEGER");
            put("headerThemeName", "TEXT");
            put("isDarkModeEnabled", "INTEGER");
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.o2$b */
    private static class C11031b {

        /* renamed from: a */
        private static final String f31697a = "formId";

        /* renamed from: b */
        private static final String f31698b = "name";

        /* renamed from: c */
        private static final String f31699c = "fromJson";

        /* renamed from: d */
        private static final String f31700d = "templatePath";

        /* renamed from: e */
        private static final String f31701e = "templateId";

        /* renamed from: f */
        private static final String f31702f = "title";

        /* renamed from: g */
        private static final String f31703g = "titleTextColor";

        /* renamed from: h */
        private static final String f31704h = "titleBackgroundColor";

        /* renamed from: i */
        private static final String f31705i = "formType";

        /* renamed from: j */
        private static final String f31706j = "formStatus";

        /* renamed from: k */
        private static final String f31707k = "transitionType";

        /* renamed from: l */
        private static final String f31708l = "inviteData";

        /* renamed from: m */
        private static final String f31709m = "viewType";

        /* renamed from: n */
        private static final String f31710n = "isPreloaded";

        /* renamed from: o */
        private static final String f31711o = "formLanguage";

        /* renamed from: p */
        private static final String f31712p = "poweredBy";

        /* renamed from: q */
        private static final String f31713q = "thankYouData";

        /* renamed from: r */
        private static final String f31714r = "redirectLinks";

        /* renamed from: s */
        private static final String f31715s = "isBlockNetworkInForm";

        /* renamed from: t */
        private static final String f31716t = "templateDebugRemoteUrl";

        /* renamed from: u */
        private static final String f31717u = "urlVersion";

        /* renamed from: v */
        private static final String f31718v = "shouldDownloadDebugForm";

        /* renamed from: w */
        private static final String f31719w = "headerThemeName";

        /* renamed from: x */
        private static final String f31720x = "isDarkModeEnabled";

        private C11031b() {
        }
    }

    C11029o2() {
    }

    /* renamed from: a */
    private InviteData m40413a(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex("inviteData"));
        try {
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return new InviteData(new JSONObject(string));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ContentValues mo28223b(C11013n2 n2Var) {
        ContentValues contentValues = new ContentValues();
        if (n2Var != null) {
            contentValues.put("formId", n2Var.getFormId());
            contentValues.put("name", n2Var.mo28793b());
            contentValues.put("fromJson", n2Var.mo28783a());
            contentValues.put("templatePath", n2Var.mo28805g());
            contentValues.put("templateId", n2Var.mo28817h());
            contentValues.put("title", n2Var.getTitle());
            contentValues.put("titleTextColor", n2Var.getTitleTextColor());
            contentValues.put("titleBackgroundColor", n2Var.getTitleBackgroundColor());
            String str = null;
            contentValues.put("formType", n2Var.getFormType() != null ? n2Var.getFormType().toString() : null);
            contentValues.put("formStatus", n2Var.mo28796c() != null ? Integer.valueOf(n2Var.mo28796c().mo28826a()) : null);
            contentValues.put("transitionType", n2Var.mo28822j() != null ? n2Var.mo28822j().mo28957a() : null);
            contentValues.put("inviteData", n2Var.getInviteData() != null ? n2Var.getInviteData().toJsonString() : null);
            contentValues.put("viewType", n2Var.getFormViewType() != null ? n2Var.getFormViewType().toString() : null);
            contentValues.put("isPreloaded", Integer.valueOf(n2Var.mo28824l() ? 1 : 0));
            contentValues.put("formLanguage", n2Var.getFormLanguage());
            contentValues.put("poweredBy", Integer.valueOf(n2Var.isPoweredByVisible() ? 1 : 0));
            contentValues.put("thankYouData", n2Var.mo28819i() != null ? n2Var.mo28819i().mo28379t() : null);
            contentValues.put("isBlockNetworkInForm", Integer.valueOf(n2Var.mo28823k() ? 1 : 0));
            if (n2Var.mo28801e() != null) {
                str = ModelFactory.getInstance().getStringArrayAsJsonString(n2Var.mo28801e());
            }
            contentValues.put("redirectLinks", str);
            contentValues.put("templateDebugRemoteUrl", n2Var.getTemplateDebugRemoteUrl());
            contentValues.put("urlVersion", n2Var.getUrlVersion());
            contentValues.put("shouldDownloadDebugForm", Integer.valueOf(n2Var.mo28825n() ? 1 : 0));
            contentValues.put("headerThemeName", n2Var.getHeaderThemeName());
            contentValues.put("isDarkModeEnabled", Integer.valueOf(n2Var.isDarkModeEnabled() ? 1 : 0));
        }
        return contentValues;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public long mo28225c() {
        try {
            return DatabaseUtils.queryNumEntries(C10876i1.m39698a().getWritableDatabase(), f31695d);
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C11013n2 mo28224b(Object... objArr) {
        Object obj;
        Cursor query;
        Object[] objArr2 = objArr;
        C11013n2 n2Var = null;
        if (!(objArr2 == null || objArr2.length <= 0 || (obj = objArr2[0]) == null || !(obj instanceof String) || (query = C10876i1.m39698a().getReadableDatabase().query(mo28233e(), (String[]) null, "formId=?", new String[]{(String) obj}, (String) null, (String) null, (String) null)) == null)) {
            if (query.moveToFirst()) {
                n2Var = new C11013n2(query.getString(query.getColumnIndex("formId")), query.getString(query.getColumnIndex("name")), query.getString(query.getColumnIndex("fromJson")), query.getString(query.getColumnIndex("templatePath")), query.getString(query.getColumnIndex("templateId")), new C10763c6().mo28218a(query.getString(query.getColumnIndex("formId"))), query.getString(query.getColumnIndex("title")), query.getString(query.getColumnIndex("titleTextColor")), query.getString(query.getColumnIndex("titleBackgroundColor")), FormTriggerType.fromString(query.getString(query.getColumnIndex("formType"))), C11013n2.C11014a.m40364a(query.getInt(query.getColumnIndex("formStatus"))), C11080r7.m40646a(query.getString(query.getColumnIndex("transitionType"))), m40413a(query), FormViewType.fromString(query.getString(query.getColumnIndex("viewType"))), query.getInt(query.getColumnIndex("isPreloaded")) == 1, query.getString(query.getColumnIndex("formLanguage")), query.getInt(query.getColumnIndex("poweredBy")) == 1, m40415c(query), query.getInt(query.getColumnIndex("isBlockNetworkInForm")) == 1, m40414b(query), query.getString(query.getColumnIndex("templateDebugRemoteUrl")), query.getString(query.getColumnIndex("urlVersion")), query.getInt(query.getColumnIndex("shouldDownloadDebugForm")) == 1, query.getString(query.getColumnIndex("headerThemeName")), query.getInt(query.getColumnIndex("isDarkModeEnabled")) == 1);
            }
            query.close();
        }
        return n2Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo28233e() {
        return f31695d;
    }

    /* renamed from: c */
    private C10841g7 m40415c(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex("thankYouData"));
        try {
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return new C10841g7(new JSONObject(string));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28220a(C11013n2 n2Var) {
        StringBuilder sb;
        boolean z = false;
        boolean z2 = true;
        if (n2Var == null || TextUtils.isEmpty(n2Var.getFormId())) {
            sb = new StringBuilder();
            sb.append("delete (invalid data) - ");
            sb.append(n2Var == null ? "record is null" : "formId is not valid");
        } else {
            if (C10876i1.m39698a().getWritableDatabase().delete(mo28233e(), "formId=?", new String[]{n2Var.getFormId()}) > 0) {
                z = true;
            }
            z2 = !z;
            sb = new StringBuilder();
            sb.append("delete - ");
            sb.append(n2Var);
        }
        mo28623a(z2, sb.toString());
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public HashMap<String, String> mo28230d() {
        return new C11030a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public ArrayList<C11013n2> mo28226c(Object... objArr) {
        ArrayList<C11013n2> arrayList = new ArrayList<>();
        Cursor query = C10876i1.m39698a().getReadableDatabase().query(mo28233e(), (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        if (query != null) {
            if (query.moveToFirst()) {
                do {
                    arrayList.add(new C11013n2(query.getString(query.getColumnIndex("formId")), query.getString(query.getColumnIndex("name")), query.getString(query.getColumnIndex("fromJson")), query.getString(query.getColumnIndex("templatePath")), query.getString(query.getColumnIndex("templateId")), new C10763c6().mo28218a(query.getString(query.getColumnIndex("formId"))), query.getString(query.getColumnIndex("title")), query.getString(query.getColumnIndex("titleTextColor")), query.getString(query.getColumnIndex("titleBackgroundColor")), FormTriggerType.fromString(query.getString(query.getColumnIndex("formType"))), C11013n2.C11014a.m40364a(query.getInt(query.getColumnIndex("formStatus"))), C11080r7.m40646a(query.getString(query.getColumnIndex("transitionType"))), m40413a(query), FormViewType.fromString(query.getString(query.getColumnIndex("viewType"))), query.getInt(query.getColumnIndex("isPreloaded")) == 1, query.getString(query.getColumnIndex("formLanguage")), query.getInt(query.getColumnIndex("poweredBy")) == 1, m40415c(query), query.getInt(query.getColumnIndex("isBlockNetworkInForm")) == 1, m40414b(query), query.getString(query.getColumnIndex("templateDebugRemoteUrl")), query.getString(query.getColumnIndex("urlVersion")), query.getInt(query.getColumnIndex("shouldDownloadDebugForm")) == 1, query.getString(query.getColumnIndex("headerThemeName")), query.getInt(query.getColumnIndex("isDarkModeEnabled")) == 1));
                } while (query.moveToNext());
            }
            query.close();
        }
        return arrayList;
    }

    /* renamed from: b */
    private ArrayList<String> m40414b(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex("redirectLinks"));
        try {
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return ModelFactory.getInstance().getStringArray(new JSONArray(string));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28221a(Object... objArr) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo28232d(C11013n2 n2Var) {
        return C10876i1.m39698a().getWritableDatabase().update(mo28233e(), mo28223b(n2Var), "formId=?", new String[]{n2Var.getFormId()}) > 0 || super.mo28228c(n2Var);
    }
}

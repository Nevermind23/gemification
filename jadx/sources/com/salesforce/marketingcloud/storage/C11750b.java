package com.salesforce.marketingcloud.storage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.storage.C11751c;
import com.salesforce.marketingcloud.storage.p385db.C11774l;
import com.salesforce.marketingcloud.util.C11808c;
import java.io.File;
import java.util.Locale;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.storage.b */
public abstract class C11750b extends C11788e {

    /* renamed from: k */
    protected static final String f34074k = "create_date";

    /* renamed from: l */
    private static final String f34075l = "storagedb.db";

    /* renamed from: m */
    private static final String f34076m = "ETSharedPrefs";

    /* renamed from: n */
    private static final String f34077n = "mcsdk_%s";

    /* renamed from: h */
    protected final String f34078h;

    /* renamed from: i */
    protected final Context f34079i;

    /* renamed from: j */
    protected final C11808c f34080j;

    C11750b(Context context, C11808c cVar, String str, String str2) {
        super(str, str2);
        this.f34079i = context;
        this.f34080j = cVar;
        this.f34078h = str;
        if (!m42849g() && m42851i() && m42852j()) {
            try {
                m42850h();
            } catch (Exception e) {
                C11461g.m41885b(C11788e.f34211c, e, "Unable to migrate data to BU specific storage", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    static String m42848a(String str) {
        return String.format(Locale.ENGLISH, f34077n, new Object[]{str});
    }

    /* renamed from: g */
    private boolean m42849g() {
        File databasePath = this.f34079i.getDatabasePath(C11774l.m43042a(this.f34078h));
        return databasePath != null && databasePath.exists();
    }

    /* renamed from: h */
    private void m42850h() {
        File databasePath = this.f34079i.getDatabasePath(f34075l);
        if (databasePath != null && databasePath.exists()) {
            try {
                if (!databasePath.renameTo(new File(databasePath.getParent(), C11774l.m43042a(this.f34078h)))) {
                    C11461g.m41884b(C11788e.f34211c, "Unable to rename storagedb.db to BU specific naming scheme", new Object[0]);
                }
            } catch (Exception e) {
                C11461g.m41885b(C11788e.f34211c, e, "Unable to rename storagedb.db to BU specific naming scheme", new Object[0]);
            }
        }
        File file = new File(this.f34079i.getApplicationInfo().dataDir, "shared_prefs/");
        if (file.exists()) {
            File file2 = new File(file, "ETCustomerPrefs.xml");
            if (file2.exists()) {
                try {
                    if (!file2.renameTo(new File(file, C11751c.C11752a.m42858b(this.f34078h) + ".xml"))) {
                        C11461g.m41884b(C11788e.f34211c, "Unable to rename ETCustomerPrefs.xml to BU specific naming scheme", new Object[0]);
                    }
                } catch (Exception e2) {
                    C11461g.m41885b(C11788e.f34211c, e2, "Unable to rename ETCustomerPrefs.xml to BU specific naming scheme", new Object[0]);
                }
            }
            File file3 = new File(file, "ETSharedPrefs.xml");
            if (file3.exists()) {
                try {
                    if (!file3.renameTo(new File(file, m42848a(this.f34078h) + ".xml"))) {
                        C11461g.m41884b(C11788e.f34211c, "Unable to rename ETSharedPrefs.xml to BU specific naming scheme", new Object[0]);
                    }
                } catch (Exception e3) {
                    C11461g.m41885b(C11788e.f34211c, e3, "Unable to rename ETSharedPrefs.xml to BU specific naming scheme", new Object[0]);
                }
            }
        }
    }

    /* renamed from: i */
    private boolean m42851i() {
        File databasePath = this.f34079i.getDatabasePath(f34075l);
        return databasePath != null && databasePath.exists();
    }

    /* renamed from: j */
    private boolean m42852j() {
        return mo31512a(this.f34079i.getSharedPreferences(f34076m, 0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo31512a(SharedPreferences sharedPreferences);
}

package com.salesforce.marketingcloud.storage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteOpenHelper;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.internal.C11513l;
import com.salesforce.marketingcloud.storage.C11751c;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import com.salesforce.marketingcloud.storage.p385db.C11763e;
import com.salesforce.marketingcloud.storage.p385db.C11764f;
import com.salesforce.marketingcloud.storage.p385db.C11765g;
import com.salesforce.marketingcloud.storage.p385db.C11767h;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import com.salesforce.marketingcloud.storage.p385db.C11771j;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import com.salesforce.marketingcloud.storage.p385db.C11774l;
import com.salesforce.marketingcloud.storage.p385db.C11775m;
import com.salesforce.marketingcloud.util.C11808c;
import com.salesforce.marketingcloud.util.C11818g;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Locale;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.storage.j */
public class C11800j extends C11750b {

    /* renamed from: B */
    private static final String f34243B = "mcsdk_cache_%s";

    /* renamed from: C */
    private static final String f34244C = "ETStorage.version";

    /* renamed from: D */
    private static final int f34245D = 1;

    /* renamed from: A */
    private C11754d f34246A;

    /* renamed from: o */
    private final C11751c f34247o;

    /* renamed from: p */
    private final SharedPreferences f34248p;

    /* renamed from: q */
    private final C11774l f34249q;

    /* renamed from: r */
    private final C11791f f34250r;

    /* renamed from: s */
    private C11755a f34251s;

    /* renamed from: t */
    private C11769i f34252t;

    /* renamed from: u */
    private C11771j f34253u;

    /* renamed from: v */
    private C11772k f34254v;

    /* renamed from: w */
    private C11767h f34255w;

    /* renamed from: x */
    private C11765g f34256x;

    /* renamed from: y */
    private C11764f f34257y;

    /* renamed from: z */
    private C11775m f34258z;

    public C11800j(Context context, C11808c cVar, String str, String str2, C11513l lVar) {
        super(context, cVar, str, str2);
        C11774l lVar2 = new C11774l(context, cVar, this.f34078h);
        this.f34249q = lVar2;
        lVar2.getWritableDatabase();
        C11751c.C11752a aVar = new C11751c.C11752a(context, cVar, this.f34078h);
        this.f34247o = aVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences(C11750b.m42848a(this.f34078h), 0);
        this.f34248p = sharedPreferences;
        this.f34250r = new C11791f(context, sharedPreferences, str, lVar);
        if (lVar2.mo31585a()) {
            aVar.mo31109a();
            sharedPreferences.edit().clear().apply();
        }
    }

    /* renamed from: d */
    private void m43142d(C11808c cVar) {
        this.f34248p.edit().putString("create_date", cVar.mo31645b(String.valueOf(System.currentTimeMillis()))).apply();
    }

    /* renamed from: l */
    private void m43143l() {
        File k = mo31615k();
        if (k.exists() && k.isDirectory()) {
            C11818g.m43259a(k);
        }
        m43144w();
        this.f34249q.mo31586b();
    }

    /* renamed from: w */
    private void m43144w() {
        mo31606c().mo31109a();
        mo31608f().edit().clear().apply();
        m43142d(this.f34080j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Context mo31601a() {
        return this.f34079i;
    }

    /* renamed from: b */
    public C11808c mo31604b() {
        return this.f34080j;
    }

    /* renamed from: c */
    public C11751c mo31606c() {
        return this.f34247o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public SQLiteOpenHelper mo31607e() {
        return this.f34249q;
    }

    /* renamed from: f */
    public SharedPreferences mo31608f() {
        return this.f34248p;
    }

    /* renamed from: k */
    public File mo31615k() {
        return new File(this.f34079i.getCacheDir(), String.format(Locale.ENGLISH, f34243B, new Object[]{this.f34078h}));
    }

    /* renamed from: m */
    public C11749a mo31616m() {
        if (this.f34251s == null) {
            this.f34251s = new C11755a(this.f34249q.getWritableDatabase());
        }
        return this.f34251s;
    }

    /* renamed from: n */
    public C11754d mo31617n() {
        if (this.f34246A == null) {
            this.f34246A = new C11763e(this.f34249q.getWritableDatabase());
        }
        return this.f34246A;
    }

    /* renamed from: o */
    public C11791f mo31618o() {
        return this.f34250r;
    }

    /* renamed from: p */
    public C11794g mo31619p() {
        if (this.f34257y == null) {
            this.f34257y = new C11764f(this.f34249q.getWritableDatabase());
        }
        return this.f34257y;
    }

    /* renamed from: q */
    public C11796h mo31620q() {
        if (this.f34256x == null) {
            this.f34256x = new C11765g(this.f34249q.getWritableDatabase());
        }
        return this.f34256x;
    }

    /* renamed from: r */
    public C11799i mo31621r() {
        if (this.f34255w == null) {
            this.f34255w = new C11767h(this.f34249q.getWritableDatabase());
        }
        return this.f34255w;
    }

    /* renamed from: s */
    public C11801k mo31622s() {
        if (this.f34252t == null) {
            this.f34252t = new C11769i(this.f34249q.getWritableDatabase());
        }
        return this.f34252t;
    }

    /* renamed from: t */
    public C11802l mo31623t() {
        if (this.f34253u == null) {
            this.f34253u = new C11771j(this.f34249q.getWritableDatabase());
        }
        return this.f34253u;
    }

    /* renamed from: u */
    public C11803m mo31624u() {
        if (this.f34254v == null) {
            this.f34254v = new C11772k(this.f34249q.getWritableDatabase());
        }
        return this.f34254v;
    }

    /* renamed from: v */
    public C11804n mo31625v() {
        if (this.f34258z == null) {
            this.f34258z = new C11775m(this.f34249q.getWritableDatabase());
        }
        return this.f34258z;
    }

    /* renamed from: x */
    public final void mo31626x() {
        this.f34249q.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo31602a(Context context, int i, int i2) {
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0043 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31614a(com.salesforce.marketingcloud.InitializationStatus.C11293a r5) {
        /*
            r4 = this;
            android.content.SharedPreferences r0 = r4.f34248p
            boolean r0 = r4.mo31512a((android.content.SharedPreferences) r0)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x002c
            android.content.SharedPreferences r0 = r4.f34248p
            java.lang.String r3 = "create_date"
            boolean r0 = r0.contains(r3)
            r5.mo29532a((boolean) r0)
            if (r0 == 0) goto L_0x002c
            r4.m43143l()     // Catch:{ Exception -> 0x001b }
            goto L_0x002c
        L_0x001b:
            r0 = move-exception
            r5.mo29531a((java.lang.Throwable) r0)
            r5.mo29538f(r2)
            java.lang.String r5 = com.salesforce.marketingcloud.storage.C11788e.f34211c
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Failed to recover from encryption change."
            com.salesforce.marketingcloud.C11461g.m41885b(r5, r0, r2, r1)
            return
        L_0x002c:
            com.salesforce.marketingcloud.storage.db.l r0 = r4.f34249q     // Catch:{ a -> 0x0043, IllegalStateException -> 0x0032 }
            r0.mo31587c()     // Catch:{ a -> 0x0043, IllegalStateException -> 0x0032 }
            goto L_0x0046
        L_0x0032:
            r0 = move-exception
            r5.mo29531a((java.lang.Throwable) r0)
            r5.mo29538f(r2)
            java.lang.String r5 = com.salesforce.marketingcloud.storage.C11788e.f34211c
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Could not create the necessary database table(s)."
            com.salesforce.marketingcloud.C11461g.m41885b(r5, r0, r2, r1)
            return
        L_0x0043:
            r4.m43144w()     // Catch:{ Exception -> 0x006c }
        L_0x0046:
            android.content.SharedPreferences r5 = r4.f34248p
            r0 = -1
            java.lang.String r1 = "ETStorage.version"
            int r5 = r5.getInt(r1, r0)
            if (r5 == 0) goto L_0x006b
            if (r5 == r2) goto L_0x006b
            android.content.Context r0 = r4.f34079i
            if (r2 >= r5) goto L_0x005b
            r4.mo31602a(r0, r5, r2)
            goto L_0x005e
        L_0x005b:
            r4.mo31605b(r0, r5, r2)
        L_0x005e:
            android.content.SharedPreferences r5 = r4.f34248p
            android.content.SharedPreferences$Editor r5 = r5.edit()
            android.content.SharedPreferences$Editor r5 = r5.putInt(r1, r2)
            r5.apply()
        L_0x006b:
            return
        L_0x006c:
            r0 = move-exception
            r5.mo29531a((java.lang.Throwable) r0)
            r5.mo29538f(r2)
            java.lang.String r5 = com.salesforce.marketingcloud.storage.C11788e.f34211c
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Failed to recover from data reset."
            com.salesforce.marketingcloud.C11461g.m41885b(r5, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.storage.C11800j.mo31614a(com.salesforce.marketingcloud.InitializationStatus$a):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo31512a(SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString("create_date", (String) null);
        if (string == null) {
            return false;
        }
        try {
            this.f34080j.mo31644a(string);
            return true;
        } catch (UnsupportedEncodingException | GeneralSecurityException e) {
            C11461g.m41885b(C11788e.f34211c, e, "Failed to verify existing encryption key", new Object[0]);
            return false;
        }
    }
}

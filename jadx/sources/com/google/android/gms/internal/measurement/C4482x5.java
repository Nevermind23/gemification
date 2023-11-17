package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.os.StrictMode;
import android.support.p013v4.media.session.C0125b;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.x5 */
public final class C4482x5 implements C4110b6 {

    /* renamed from: h */
    private static final Map f13794h = new ArrayMap();

    /* renamed from: i */
    public static final String[] f13795i = {"key", C11755a.C11756a.f34100b};

    /* renamed from: a */
    private final ContentResolver f13796a;

    /* renamed from: b */
    private final Uri f13797b;

    /* renamed from: c */
    private final Runnable f13798c;

    /* renamed from: d */
    private final ContentObserver f13799d;

    /* renamed from: e */
    private final Object f13800e = new Object();

    /* renamed from: f */
    private volatile Map f13801f;

    /* renamed from: g */
    private final List f13802g = new ArrayList();

    private C4482x5(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C4466w5 w5Var = new C4466w5(this, (Handler) null);
        this.f13799d = w5Var;
        contentResolver.getClass();
        uri.getClass();
        this.f13796a = contentResolver;
        this.f13797b = uri;
        this.f13798c = runnable;
        contentResolver.registerContentObserver(uri, false, w5Var);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0016 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.C4482x5 m17137b(android.content.ContentResolver r4, android.net.Uri r5, java.lang.Runnable r6) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.x5> r0 = com.google.android.gms.internal.measurement.C4482x5.class
            monitor-enter(r0)
            java.util.Map r1 = f13794h     // Catch:{ all -> 0x0018 }
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0018 }
            com.google.android.gms.internal.measurement.x5 r2 = (com.google.android.gms.internal.measurement.C4482x5) r2     // Catch:{ all -> 0x0018 }
            if (r2 != 0) goto L_0x0016
            com.google.android.gms.internal.measurement.x5 r3 = new com.google.android.gms.internal.measurement.x5     // Catch:{ SecurityException -> 0x0016 }
            r3.<init>(r4, r5, r6)     // Catch:{ SecurityException -> 0x0016 }
            r1.put(r5, r3)     // Catch:{ SecurityException -> 0x0015 }
        L_0x0015:
            r2 = r3
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return r2
        L_0x0018:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4482x5.m17137b(android.content.ContentResolver, android.net.Uri, java.lang.Runnable):com.google.android.gms.internal.measurement.x5");
    }

    /* renamed from: e */
    static synchronized void m17138e() {
        synchronized (C4482x5.class) {
            for (C4482x5 x5Var : f13794h.values()) {
                x5Var.f13796a.unregisterContentObserver(x5Var.f13799d);
            }
            f13794h.clear();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12910a(String str) {
        return (String) mo13808c().get(str);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final Map mo13808c() {
        Map map;
        Map map2 = this.f13801f;
        if (map2 == null) {
            synchronized (this.f13800e) {
                map2 = this.f13801f;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) C4514z5.m17303a(new C4449v5(this));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        try {
                            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                    this.f13801f = map;
                    map2 = map;
                }
            }
        }
        if (map2 != null) {
            return map2;
        }
        return Collections.emptyMap();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ Map mo13809d() {
        Map map;
        Cursor query = this.f13796a.query(this.f13797b, f13795i, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                map = new ArrayMap(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } finally {
            query.close();
        }
    }

    /* renamed from: f */
    public final void mo13810f() {
        synchronized (this.f13800e) {
            this.f13801f = null;
            this.f13798c.run();
        }
        synchronized (this) {
            Iterator it = this.f13802g.iterator();
            if (it.hasNext()) {
                C0125b.m366a(it.next());
                throw null;
            }
        }
    }
}

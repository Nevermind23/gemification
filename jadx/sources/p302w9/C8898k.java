package p302w9;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p342j$.time.ZoneOffset;
import p342j$.time.format.DateTimeFormatter;
import p342j$.util.DateRetargetClass;

/* renamed from: w9.k */
class C8898k {

    /* renamed from: a */
    private final SharedPreferences f24912a;

    public C8898k(Context context, String str) {
        this.f24912a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    /* renamed from: a */
    private synchronized void m33047a() {
        long j = this.f24912a.getLong("fire-count", 0);
        String str = "";
        String str2 = null;
        for (Map.Entry next : this.f24912a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String str3 : (Set) next.getValue()) {
                    if (str2 == null || str2.compareTo(str3) > 0) {
                        str = (String) next.getKey();
                        str2 = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f24912a.getStringSet(str, new HashSet()));
        hashSet.remove(str2);
        this.f24912a.edit().putStringSet(str, hashSet).putLong("fire-count", j - 1).commit();
    }

    /* renamed from: d */
    private synchronized String m33048d(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    /* renamed from: e */
    private synchronized String m33049e(String str) {
        for (Map.Entry next : this.f24912a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String equals : (Set) next.getValue()) {
                    if (str.equals(equals)) {
                        return (String) next.getKey();
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m33050h(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = r4.m33049e(r5)     // Catch:{ all -> 0x003f }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r4)
            return
        L_0x0009:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences r2 = r4.f24912a     // Catch:{ all -> 0x003f }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x003f }
            r3.<init>()     // Catch:{ all -> 0x003f }
            java.util.Set r2 = r2.getStringSet(r0, r3)     // Catch:{ all -> 0x003f }
            r1.<init>(r2)     // Catch:{ all -> 0x003f }
            r1.remove(r5)     // Catch:{ all -> 0x003f }
            boolean r5 = r1.isEmpty()     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x0030
            android.content.SharedPreferences r5 = r4.f24912a     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r5.remove(r0)     // Catch:{ all -> 0x003f }
            r5.commit()     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x0030:
            android.content.SharedPreferences r5 = r4.f24912a     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r5.putStringSet(r0, r1)     // Catch:{ all -> 0x003f }
            r5.commit()     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r4)
            return
        L_0x003f:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p302w9.C8898k.m33050h(java.lang.String):void");
    }

    /* renamed from: m */
    private synchronized void m33051m(String str, String str2) {
        m33050h(str2);
        HashSet hashSet = new HashSet(this.f24912a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f24912a.edit().putStringSet(str, hashSet).commit();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo24321b() {
        SharedPreferences.Editor edit = this.f24912a.edit();
        for (Map.Entry next : this.f24912a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                edit.remove((String) next.getKey());
            }
        }
        edit.remove("fire-count");
        edit.commit();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized List mo24322c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry next : this.f24912a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                arrayList.add(C8899l.m33060a((String) next.getKey(), new ArrayList((Set) next.getValue())));
            }
        }
        mo24328l(System.currentTimeMillis());
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized boolean mo24323f(long j, long j2) {
        return m33048d(j).equals(m33048d(j2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized void mo24324g() {
        String d = m33048d(System.currentTimeMillis());
        this.f24912a.edit().putString("last-used-date", d).commit();
        m33050h(d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public synchronized boolean mo24325i(long j) {
        return mo24326j("fire-global", j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public synchronized boolean mo24326j(String str, long j) {
        if (!this.f24912a.contains(str)) {
            this.f24912a.edit().putLong(str, j).commit();
            return true;
        } else if (mo24323f(this.f24912a.getLong(str, -1), j)) {
            return false;
        } else {
            this.f24912a.edit().putLong(str, j).commit();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized void mo24327k(long j, String str) {
        String d = m33048d(j);
        if (this.f24912a.getString("last-used-date", "").equals(d)) {
            String e = m33049e(d);
            if (e != null) {
                if (!e.equals(str)) {
                    m33051m(str, d);
                    return;
                }
                return;
            }
            return;
        }
        long j2 = this.f24912a.getLong("fire-count", 0);
        if (j2 + 1 == 30) {
            m33047a();
            j2 = this.f24912a.getLong("fire-count", 0);
        }
        HashSet hashSet = new HashSet(this.f24912a.getStringSet(str, new HashSet()));
        hashSet.add(d);
        this.f24912a.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", d).commit();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public synchronized void mo24328l(long j) {
        this.f24912a.edit().putLong("fire-global", j).commit();
    }
}

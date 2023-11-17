package com.google.firebase.messaging;

import android.content.SharedPreferences;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.s0 */
final class C5356s0 {

    /* renamed from: a */
    private final SharedPreferences f17091a;

    /* renamed from: b */
    private final String f17092b;

    /* renamed from: c */
    private final String f17093c;

    /* renamed from: d */
    final ArrayDeque f17094d = new ArrayDeque();

    /* renamed from: e */
    private final Executor f17095e;

    /* renamed from: f */
    private boolean f17096f = false;

    private C5356s0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f17091a = sharedPreferences;
        this.f17092b = str;
        this.f17093c = str2;
        this.f17095e = executor;
    }

    /* renamed from: b */
    private boolean m21165b(boolean z) {
        if (z && !this.f17096f) {
            m21169i();
        }
        return z;
    }

    /* renamed from: c */
    static C5356s0 m21166c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        C5356s0 s0Var = new C5356s0(sharedPreferences, str, str2, executor);
        s0Var.m21167d();
        return s0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m21167d() {
        /*
            r6 = this;
            java.util.ArrayDeque r0 = r6.f17094d
            monitor-enter(r0)
            java.util.ArrayDeque r1 = r6.f17094d     // Catch:{ all -> 0x004a }
            r1.clear()     // Catch:{ all -> 0x004a }
            android.content.SharedPreferences r1 = r6.f17091a     // Catch:{ all -> 0x004a }
            java.lang.String r2 = r6.f17092b     // Catch:{ all -> 0x004a }
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)     // Catch:{ all -> 0x004a }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x0048
            java.lang.String r2 = r6.f17093c     // Catch:{ all -> 0x004a }
            boolean r2 = r1.contains(r2)     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x0021
            goto L_0x0048
        L_0x0021:
            java.lang.String r2 = r6.f17093c     // Catch:{ all -> 0x004a }
            r3 = -1
            java.lang.String[] r1 = r1.split(r2, r3)     // Catch:{ all -> 0x004a }
            int r2 = r1.length     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x0032
            java.lang.String r2 = "FirebaseMessaging"
            java.lang.String r3 = "Corrupted queue. Please check the queue contents and item separator provided"
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x004a }
        L_0x0032:
            int r2 = r1.length     // Catch:{ all -> 0x004a }
            r3 = 0
        L_0x0034:
            if (r3 >= r2) goto L_0x0046
            r4 = r1[r3]     // Catch:{ all -> 0x004a }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x004a }
            if (r5 != 0) goto L_0x0043
            java.util.ArrayDeque r5 = r6.f17094d     // Catch:{ all -> 0x004a }
            r5.add(r4)     // Catch:{ all -> 0x004a }
        L_0x0043:
            int r3 = r3 + 1
            goto L_0x0034
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x004a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C5356s0.m21167d():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m21168h() {
        synchronized (this.f17094d) {
            this.f17091a.edit().putString(this.f17092b, mo17638g()).commit();
        }
    }

    /* renamed from: i */
    private void m21169i() {
        this.f17095e.execute(new C5354r0(this));
    }

    /* renamed from: e */
    public String mo17636e() {
        String str;
        synchronized (this.f17094d) {
            str = (String) this.f17094d.peek();
        }
        return str;
    }

    /* renamed from: f */
    public boolean mo17637f(Object obj) {
        boolean b;
        synchronized (this.f17094d) {
            b = m21165b(this.f17094d.remove(obj));
        }
        return b;
    }

    /* renamed from: g */
    public String mo17638g() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f17094d.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(this.f17093c);
        }
        return sb.toString();
    }
}

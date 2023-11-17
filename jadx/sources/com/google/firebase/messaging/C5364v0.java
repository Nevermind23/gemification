package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;
import p182n6.C7258g;

/* renamed from: com.google.firebase.messaging.v0 */
final class C5364v0 {

    /* renamed from: d */
    private static final Pattern f17113d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    private final String f17114a;

    /* renamed from: b */
    private final String f17115b;

    /* renamed from: c */
    private final String f17116c;

    private C5364v0(String str, String str2) {
        this.f17114a = m21189d(str2, str);
        this.f17115b = str;
        this.f17116c = str + "!" + str2;
    }

    /* renamed from: a */
    static C5364v0 m21188a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new C5364v0(split[0], split[1]);
    }

    /* renamed from: d */
    private static String m21189d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[]{str2}));
            str = str.substring(8);
        }
        if (str != null && f17113d.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str, "[a-zA-Z0-9-_.~%]{1,900}"}));
    }

    /* renamed from: b */
    public String mo17652b() {
        return this.f17115b;
    }

    /* renamed from: c */
    public String mo17653c() {
        return this.f17114a;
    }

    /* renamed from: e */
    public String mo17654e() {
        return this.f17116c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5364v0)) {
            return false;
        }
        C5364v0 v0Var = (C5364v0) obj;
        if (!this.f17114a.equals(v0Var.f17114a) || !this.f17115b.equals(v0Var.f17115b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f17115b, this.f17114a);
    }
}

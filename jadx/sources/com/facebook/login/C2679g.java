package com.facebook.login;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.login.g */
public abstract class C2679g {

    /* renamed from: a */
    private static final Set f8398a = m10412a();

    /* renamed from: com.facebook.login.g$a */
    static class C2680a extends HashSet {
        C2680a() {
            add("ads_management");
            add("create_event");
            add("rsvp_event");
        }
    }

    /* renamed from: a */
    private static Set m10412a() {
        return Collections.unmodifiableSet(new C2680a());
    }

    /* renamed from: b */
    static boolean m10413b(String str) {
        if (str == null || (!str.startsWith("publish") && !str.startsWith("manage") && !f8398a.contains(str))) {
            return false;
        }
        return true;
    }
}

package com.threatmetrix.TrustDefender;

import android.content.Context;
import android.content.SharedPreferences;
import com.threatmetrix.TrustDefender.C11907h;
import com.threatmetrix.TrustDefender.C11969r1;
import java.util.List;

/* renamed from: com.threatmetrix.TrustDefender.j0 */
public class C11918j0 {

    /* renamed from: a */
    private static final String f34866a = C11907h.m43615j(C11918j0.class);

    /* renamed from: b */
    public static String m43704b(String str) {
        return "TMJRS_" + str;
    }

    /* renamed from: e */
    public static String m43705e(String str) {
        return "TMCNG_" + str;
    }

    /* renamed from: f */
    private static boolean m43706f() {
        return !C11969r1.C11980k.m43988c() || !C11969r1.C11980k.m43994i();
    }

    /* renamed from: a */
    public String mo31957a(Context context, String str, List list) {
        if (context == null || C11921k0.m43739v(str) || m43706f()) {
            C11907h.C11908a.m43624b(f34866a, "Invalid SharedPreferences state");
            return "";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("trsp", 0);
        mo31959d(sharedPreferences, str, list);
        String c = mo31958c(sharedPreferences, str);
        return c == null ? "" : c;
    }

    /* renamed from: c */
    public String mo31958c(SharedPreferences sharedPreferences, String str) {
        SharedPreferences.Editor j;
        String b = m43704b(str);
        String f = C11969r1.C11980k.m43991f(sharedPreferences, b, (String) null);
        if (f == null || (j = C11969r1.C11980k.m43995j(sharedPreferences)) == null) {
            return null;
        }
        C11969r1.C11980k.m43986a(b, (String) null, j);
        j.apply();
        return f;
    }

    /* renamed from: d */
    public boolean mo31959d(SharedPreferences sharedPreferences, String str, List list) {
        String str2;
        String str3;
        if (list == null || list.isEmpty()) {
            str2 = f34866a;
            str3 = "Invalid input";
        } else {
            String f = C12003w.m44102f(C11921k0.m43743z(list, ";", true), str);
            if (C11921k0.m43739v(f)) {
                str2 = f34866a;
                str3 = "Failed to encode paths";
            } else {
                SharedPreferences.Editor j = C11969r1.C11980k.m43995j(sharedPreferences);
                if (j == null) {
                    return false;
                }
                C11969r1.C11980k.m43986a(m43705e(str), f, j);
                return j.commit();
            }
        }
        C11907h.C11908a.m43623a(str2, str3);
        return false;
    }
}

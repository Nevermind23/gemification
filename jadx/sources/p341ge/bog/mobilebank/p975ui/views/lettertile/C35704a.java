package p341ge.bog.mobilebank.p975ui.views.lettertile;

import android.text.TextUtils;

/* renamed from: ge.bog.mobilebank.ui.views.lettertile.a */
public class C35704a {

    /* renamed from: a */
    private static C35704a f86323a;

    /* renamed from: ge.bog.mobilebank.ui.views.lettertile.a$a */
    public class C35705a {

        /* renamed from: a */
        String[] f86324a;

        /* renamed from: b */
        String f86325b;

        public C35705a(String[] strArr, String str) {
            this.f86324a = strArr;
            this.f86325b = str;
        }
    }

    /* renamed from: b */
    public static C35704a m106028b() {
        if (f86323a == null) {
            f86323a = new C35704a();
        }
        return f86323a;
    }

    /* renamed from: a */
    public C35705a mo86931a(String str) {
        String str2;
        String[] split = str.split(" ");
        String[] strArr = new String[2];
        String str3 = null;
        try {
            strArr[0] = split[0].substring(0, 1);
            if (split.length <= 1 || TextUtils.isEmpty(split[1])) {
                if (split[0].length() > 1) {
                    String str4 = split[0];
                    str2 = str4.substring(str4.length() - 1);
                } else {
                    str2 = strArr[0];
                }
                strArr[1] = str2;
                return new C35705a(strArr, str3);
            }
            String substring = split[1].substring(0, 1);
            strArr[1] = substring;
            str3 = substring;
            return new C35705a(strArr, str3);
        } catch (Exception unused) {
            strArr[0] = "*";
            strArr[1] = "a";
        }
    }
}

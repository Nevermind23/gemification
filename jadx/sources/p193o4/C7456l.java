package p193o4;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.C2626d;

/* renamed from: o4.l */
class C7456l {

    /* renamed from: a */
    private String f21743a;

    /* renamed from: b */
    private boolean f21744b;

    private C7456l(String str, boolean z) {
        this.f21743a = str;
        this.f21744b = z;
    }

    /* renamed from: a */
    public static void m28353a() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C2626d.m10134e()).edit();
        edit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
        edit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
        edit.apply();
    }

    /* renamed from: b */
    public static C7456l m28354b() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C2626d.m10134e());
        if (!defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
            return null;
        }
        return new C7456l(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", (String) null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
    }

    /* renamed from: c */
    public void mo21869c() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C2626d.m10134e()).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.f21743a);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.f21744b);
        edit.apply();
    }

    public String toString() {
        String str;
        if (this.f21744b) {
            str = "Applink";
        } else {
            str = "Unclassified";
        }
        if (this.f21743a == null) {
            return str;
        }
        return str + "(" + this.f21743a + ")";
    }
}

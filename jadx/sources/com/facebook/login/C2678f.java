package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.login.LoginClient;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;
import p115i4.C6564m;
import p334z4.C9207a;

/* renamed from: com.facebook.login.f */
class C2678f {

    /* renamed from: d */
    private static final ScheduledExecutorService f8394d = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: a */
    private final C6564m f8395a;

    /* renamed from: b */
    private String f8396b;

    /* renamed from: c */
    private String f8397c;

    C2678f(Context context, String str) {
        PackageInfo packageInfo;
        this.f8396b = str;
        this.f8395a = new C6564m(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) != null) {
                this.f8397c = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: f */
    static Bundle m10406f(String str) {
        Class<C2678f> cls = C2678f.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", str);
            bundle.putString("3_method", "");
            bundle.putString("2_result", "");
            bundle.putString("5_error_message", "");
            bundle.putString("4_error_code", "");
            bundle.putString("6_extras", "");
            return bundle;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: a */
    public String mo8447a() {
        if (C9207a.m34024c(this)) {
            return null;
        }
        try {
            return this.f8396b;
        } catch (Throwable th) {
            C9207a.m34023b(th, this);
            return null;
        }
    }

    /* renamed from: b */
    public void mo8448b(String str, String str2, String str3, String str4, String str5, Map map) {
        if (!C9207a.m34024c(this)) {
            try {
                Bundle f = m10406f(str);
                if (str3 != null) {
                    f.putString("2_result", str3);
                }
                if (str4 != null) {
                    f.putString("5_error_message", str4);
                }
                if (str5 != null) {
                    f.putString("4_error_code", str5);
                }
                if (map != null && !map.isEmpty()) {
                    f.putString("6_extras", new JSONObject(map).toString());
                }
                f.putString("3_method", str2);
                this.f8395a.mo20551j("fb_mobile_login_method_complete", f);
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* renamed from: c */
    public void mo8449c(String str, String str2) {
        if (!C9207a.m34024c(this)) {
            try {
                Bundle f = m10406f(str);
                f.putString("3_method", str2);
                this.f8395a.mo20551j("fb_mobile_login_method_not_tried", f);
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* renamed from: d */
    public void mo8450d(String str, String str2) {
        if (!C9207a.m34024c(this)) {
            try {
                Bundle f = m10406f(str);
                f.putString("3_method", str2);
                this.f8395a.mo20551j("fb_mobile_login_method_start", f);
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* renamed from: e */
    public void mo8451e(String str, String str2, String str3) {
        if (!C9207a.m34024c(this)) {
            try {
                Bundle f = m10406f("");
                f.putString("2_result", LoginClient.Result.C2664b.ERROR.mo8407a());
                f.putString("5_error_message", str2);
                f.putString("3_method", str3);
                this.f8395a.mo20551j(str, f);
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }
}

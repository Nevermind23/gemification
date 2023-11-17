package p182n6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import androidx.core.p016os.C0912g;
import com.google.android.gms.common.C3942c;
import java.util.Locale;
import p104h6.C6441b;
import p130j6.C6733i;
import p260t6.C8408j;
import p286v6.C8708e;

/* renamed from: n6.s */
public abstract class C7285s {

    /* renamed from: a */
    private static final SimpleArrayMap f21475a = new SimpleArrayMap();

    /* renamed from: b */
    private static Locale f21476b;

    /* renamed from: a */
    public static String m27928a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C8708e.m32461a(context).mo24090d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    /* renamed from: b */
    public static String m27929b(Context context) {
        return context.getResources().getString(C6441b.f19717g);
    }

    /* renamed from: c */
    public static String m27930c(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(C6441b.f19714d);
        }
        if (i == 2) {
            return resources.getString(C6441b.f19720j);
        }
        if (i != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(C6441b.f19711a);
    }

    /* renamed from: d */
    public static String m27931d(Context context, int i) {
        Resources resources = context.getResources();
        String a = m27928a(context);
        if (i == 1) {
            return resources.getString(C6441b.f19715e, new Object[]{a});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(C6441b.f19712b, new Object[]{a});
            } else if (i == 5) {
                return m27935h(context, "common_google_play_services_invalid_account_text", a);
            } else {
                if (i == 7) {
                    return m27935h(context, "common_google_play_services_network_error_text", a);
                }
                if (i == 9) {
                    return resources.getString(C6441b.f19719i, new Object[]{a});
                } else if (i == 20) {
                    return m27935h(context, "common_google_play_services_restricted_profile_text", a);
                } else {
                    switch (i) {
                        case 16:
                            return m27935h(context, "common_google_play_services_api_unavailable_text", a);
                        case 17:
                            return m27935h(context, "common_google_play_services_sign_in_failed_text", a);
                        case 18:
                            return resources.getString(C6441b.f19723m, new Object[]{a});
                        default:
                            return resources.getString(C6733i.f20302a, new Object[]{a});
                    }
                }
            }
        } else if (C8408j.m31551d(context)) {
            return resources.getString(C6441b.f19724n);
        } else {
            return resources.getString(C6441b.f19721k, new Object[]{a});
        }
    }

    /* renamed from: e */
    public static String m27932e(Context context, int i) {
        if (i == 6 || i == 19) {
            return m27935h(context, "common_google_play_services_resolution_required_text", m27928a(context));
        }
        return m27931d(context, i);
    }

    /* renamed from: f */
    public static String m27933f(Context context, int i) {
        String str;
        if (i == 6) {
            str = m27936i(context, "common_google_play_services_resolution_required_title");
        } else {
            str = m27934g(context, i);
        }
        if (str == null) {
            return context.getResources().getString(C6441b.f19718h);
        }
        return str;
    }

    /* renamed from: g */
    public static String m27934g(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C6441b.f19716f);
            case 2:
                return resources.getString(C6441b.f19722l);
            case 3:
                return resources.getString(C6441b.f19713c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m27936i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m27936i(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m27936i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m27936i(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
        }
    }

    /* renamed from: h */
    private static String m27935h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i = m27936i(context, str);
        if (i == null) {
            i = resources.getString(C6733i.f20302a);
        }
        return String.format(resources.getConfiguration().locale, i, new Object[]{str2});
    }

    /* renamed from: i */
    private static String m27936i(Context context, String str) {
        String str2;
        String str3;
        SimpleArrayMap simpleArrayMap = f21475a;
        synchronized (simpleArrayMap) {
            Locale d = C0912g.m3344a(context.getResources().getConfiguration()).mo3364d(0);
            if (!d.equals(f21476b)) {
                simpleArrayMap.clear();
                f21476b = d;
            }
            String str4 = (String) simpleArrayMap.get(str);
            if (str4 != null) {
                return str4;
            }
            Resources f = C3942c.m14956f(context);
            if (f == null) {
                return null;
            }
            int identifier = f.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                if (str.length() != 0) {
                    str3 = "Missing resource: ".concat(str);
                } else {
                    str3 = new String("Missing resource: ");
                }
                Log.w("GoogleApiAvailability", str3);
                return null;
            }
            String string = f.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                if (str.length() != 0) {
                    str2 = "Got empty resource: ".concat(str);
                } else {
                    str2 = new String("Got empty resource: ");
                }
                Log.w("GoogleApiAvailability", str2);
                return null;
            }
            simpleArrayMap.put(str, string);
            return string;
        }
    }
}

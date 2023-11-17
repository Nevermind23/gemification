package k41;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.content.p015pm.C0793f;
import com.salesforce.marketingcloud.messages.iam.C11651j;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: k41.a */
public final class C36869a {

    /* renamed from: e */
    public static final C36870a f88959e = new C36870a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final String f88960a;

    /* renamed from: b */
    private final String f88961b;

    /* renamed from: c */
    private final String f88962c;

    /* renamed from: d */
    private final String f88963d;

    /* renamed from: k41.a$a */
    public static final class C36870a {
        private C36870a() {
        }

        public /* synthetic */ C36870a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final String m109231a(String str) {
            boolean z;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return "";
            }
            char charAt = str.charAt(0);
            if (Character.isUpperCase(charAt)) {
                return str;
            }
            char upperCase = Character.toUpperCase(charAt);
            String substring = str.substring(1);
            C41536l.m120488h(substring, "this as java.lang.String).substring(startIndex)");
            return upperCase + substring;
        }

        /* renamed from: b */
        private final String m109232b() {
            String str = Build.MANUFACTURER;
            String str2 = Build.MODEL;
            C41536l.m120488h(str2, "model");
            C41536l.m120488h(str, "manufacturer");
            if (C40439w.m117109H(str2, str, false, 2, (Object) null)) {
                return m109231a(str2);
            }
            String a = m109231a(str);
            return a + " " + str2;
        }

        /* renamed from: c */
        public final C36869a mo89797c(Context context) {
            String str;
            C41536l.m120489i(context, "context");
            try {
                PackageManager packageManager = context.getPackageManager();
                C41536l.m120488h(packageManager, "context.packageManager");
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                C41536l.m120488h(packageInfo, "pm.getPackageInfo(context.packageName, 0)");
                str = String.valueOf(C0793f.m2949a(packageInfo));
            } catch (Exception unused) {
                str = C11651j.f33767h;
            }
            return new C36869a("ANDROID", String.valueOf(Build.VERSION.SDK_INT), str, m109232b(), (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C36869a(String str, String str2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4);
    }

    /* renamed from: a */
    public final String mo89793a() {
        return this.f88962c;
    }

    /* renamed from: b */
    public final String mo89794b() {
        return this.f88963d;
    }

    /* renamed from: c */
    public final String mo89795c() {
        return this.f88960a;
    }

    /* renamed from: d */
    public final String mo89796d() {
        return this.f88961b;
    }

    private C36869a(String str, String str2, String str3, String str4) {
        this.f88960a = str;
        this.f88961b = str2;
        this.f88962c = str3;
        this.f88963d = str4;
    }
}

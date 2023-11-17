package ba1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.content.p015pm.C0793f;
import com.salesforce.marketingcloud.messages.iam.C11651j;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ba1.b */
public final class C10140b {

    /* renamed from: l */
    public static final C10141a f28121l = new C10141a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final String f28122a;

    /* renamed from: b */
    private final String f28123b;

    /* renamed from: c */
    private final long f28124c;

    /* renamed from: d */
    private final String f28125d;

    /* renamed from: e */
    private final String f28126e;

    /* renamed from: f */
    private final String f28127f;

    /* renamed from: g */
    private final String f28128g;

    /* renamed from: h */
    private final int f28129h;

    /* renamed from: i */
    private final String f28130i;

    /* renamed from: j */
    private final String f28131j;

    /* renamed from: k */
    private final String f28132k;

    /* renamed from: ba1.b$a */
    public static final class C10141a {
        private C10141a() {
        }

        public /* synthetic */ C10141a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C10140b mo26668a(Context context) {
            String str;
            String str2;
            String str3;
            long j;
            C41536l.m120489i(context, "context");
            try {
                PackageManager packageManager = context.getPackageManager();
                C41536l.m120488h(packageManager, "context.packageManager");
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                C41536l.m120488h(packageInfo, "pm.getPackageInfo(context.packageName, 0)");
                String obj = context.getApplicationInfo().loadLabel(packageManager).toString();
                String valueOf = String.valueOf(C0793f.m2949a(packageInfo));
                String str4 = packageInfo.versionName;
                C41536l.m120488h(str4, "pInfo.versionName");
                if (Build.VERSION.SDK_INT >= 28) {
                    j = packageInfo.getLongVersionCode();
                } else {
                    j = (long) packageInfo.versionCode;
                }
                str3 = obj;
                str = valueOf;
                str2 = str4;
            } catch (Exception unused) {
                j = -1;
                str3 = C11651j.f33767h;
                str2 = str3;
                str = str2;
            }
            String packageName = context.getPackageName();
            String str5 = Build.VERSION.RELEASE;
            int i = Build.VERSION.SDK_INT;
            String str6 = Build.MODEL;
            String str7 = Build.BRAND;
            String str8 = Build.MANUFACTURER;
            C41536l.m120488h(packageName, "bundleId");
            C41536l.m120488h(str5, "RELEASE");
            C41536l.m120488h(str6, "MODEL");
            C41536l.m120488h(str7, "BRAND");
            C41536l.m120488h(str8, "MANUFACTURER");
            return new C10140b(str3, str2, j, str, packageName, "Android", str5, i, str6, str7, str8, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C10140b(String str, String str2, long j, String str3, String str4, String str5, String str6, int i, String str7, String str8, String str9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, str4, str5, str6, i, str7, str8, str9);
    }

    /* renamed from: a */
    public final String mo26661a() {
        return this.f28123b;
    }

    /* renamed from: b */
    public final long mo26662b() {
        return this.f28124c;
    }

    /* renamed from: c */
    public final String mo26663c() {
        return this.f28131j;
    }

    /* renamed from: d */
    public final String mo26664d() {
        return this.f28132k;
    }

    /* renamed from: e */
    public final String mo26665e() {
        return this.f28130i;
    }

    /* renamed from: f */
    public final int mo26666f() {
        return this.f28129h;
    }

    /* renamed from: g */
    public final String mo26667g() {
        return this.f28128g;
    }

    private C10140b(String str, String str2, long j, String str3, String str4, String str5, String str6, int i, String str7, String str8, String str9) {
        this.f28122a = str;
        this.f28123b = str2;
        this.f28124c = j;
        this.f28125d = str3;
        this.f28126e = str4;
        this.f28127f = str5;
        this.f28128g = str6;
        this.f28129h = i;
        this.f28130i = str7;
        this.f28131j = str8;
        this.f28132k = str9;
    }
}

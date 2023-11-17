package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import p030c.C2211b;

/* renamed from: androidx.appcompat.view.a */
public class C0263a {

    /* renamed from: a */
    private Context f1393a;

    private C0263a(Context context) {
        this.f1393a = context;
    }

    /* renamed from: b */
    public static C0263a m881b(Context context) {
        return new C0263a(context);
    }

    /* renamed from: a */
    public boolean mo733a() {
        return this.f1393a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: c */
    public int mo734c() {
        return this.f1393a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int mo735d() {
        Configuration configuration = this.f1393a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i > 480 && i2 > 640) {
            return 4;
        }
        if (i >= 360) {
            return 3;
        }
        return 2;
    }

    /* renamed from: e */
    public boolean mo736e() {
        return this.f1393a.getResources().getBoolean(C2211b.f6471a);
    }

    /* renamed from: f */
    public boolean mo737f() {
        return true;
    }
}

package p112i1;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import p125j1.C6661g;

/* renamed from: i1.c */
public abstract class C6508c {

    /* renamed from: a */
    private static final Uri f19842a = Uri.parse("*");

    /* renamed from: b */
    private static final Uri f19843b = Uri.parse("");

    /* renamed from: a */
    public static PackageInfo m25693a() {
        if (Build.VERSION.SDK_INT >= 26) {
            return C6661g.m26082a();
        }
        try {
            return m25694b();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static PackageInfo m25694b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke((Object) null, new Object[0]);
    }
}

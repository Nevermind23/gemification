package p068e9;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.List;
import p027b9.C2181e;

/* renamed from: e9.a */
public class C6049a {

    /* renamed from: a */
    public final String f18829a;

    /* renamed from: b */
    public final String f18830b;

    /* renamed from: c */
    public final List f18831c;

    /* renamed from: d */
    public final String f18832d;

    /* renamed from: e */
    public final String f18833e;

    /* renamed from: f */
    public final String f18834f;

    /* renamed from: g */
    public final String f18835g;

    /* renamed from: h */
    public final C2181e f18836h;

    public C6049a(String str, String str2, List list, String str3, String str4, String str5, String str6, C2181e eVar) {
        this.f18829a = str;
        this.f18830b = str2;
        this.f18831c = list;
        this.f18832d = str3;
        this.f18833e = str4;
        this.f18834f = str5;
        this.f18835g = str6;
        this.f18836h = eVar;
    }

    /* renamed from: a */
    public static C6049a m24173a(Context context, C6114w wVar, String str, String str2, List list, C2181e eVar) {
        String packageName = context.getPackageName();
        String g = wVar.mo19645g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C6049a(str, str2, list, g, packageName, num, str3, eVar);
    }
}

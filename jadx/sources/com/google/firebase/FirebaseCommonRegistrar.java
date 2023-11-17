package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import p238ra.C8080c;
import p238ra.C8082e;
import p238ra.C8085h;
import p302w9.C8891f;

public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ String m20669e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.targetSdkVersion);
        }
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ String m20670f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null || Build.VERSION.SDK_INT < 24) {
            return "";
        }
        return String.valueOf(applicationInfo.minSdkVersion);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ String m20671g(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        if (i < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
            return "";
        }
        return "embedded";
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ String m20672h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName != null) {
            return m20673i(installerPackageName);
        }
        return "";
    }

    /* renamed from: i */
    private static String m20673i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public List getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C8080c.m30604c());
        arrayList.add(C8891f.m33035g());
        arrayList.add(C8085h.m30616b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(C8085h.m30616b("fire-core", "20.3.2"));
        arrayList.add(C8085h.m30616b("device-name", m20673i(Build.PRODUCT)));
        arrayList.add(C8085h.m30616b("device-model", m20673i(Build.DEVICE)));
        arrayList.add(C8085h.m30616b("device-brand", m20673i(Build.BRAND)));
        arrayList.add(C8085h.m30617c("android-target-sdk", new C5275g()));
        arrayList.add(C8085h.m30617c("android-min-sdk", new C5276h()));
        arrayList.add(C8085h.m30617c("android-platform", new C5277i()));
        arrayList.add(C8085h.m30617c("android-installer", new C5292j()));
        String a = C8082e.m30610a();
        if (a != null) {
            arrayList.add(C8085h.m30616b("kotlin", a));
        }
        return arrayList;
    }
}

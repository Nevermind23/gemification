package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.C0767a;
import androidx.core.p016os.C0904b;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class ActivityCompat extends C0767a {

    /* renamed from: c */
    private static PermissionCompatDelegate f3240c;

    public interface PermissionCompatDelegate {
        /* renamed from: a */
        boolean mo3092a(Activity activity, String[] strArr, int i);
    }

    /* renamed from: androidx.core.app.ActivityCompat$a */
    static class C0652a {
        /* renamed from: a */
        static void m2596a(Activity activity) {
            activity.finishAffinity();
        }

        /* renamed from: b */
        static void m2597b(Activity activity, Intent intent, int i, Bundle bundle) {
            activity.startActivityForResult(intent, i, bundle);
        }

        /* renamed from: c */
        static void m2598c(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    /* renamed from: androidx.core.app.ActivityCompat$b */
    static class C0653b {
        /* renamed from: a */
        static void m2599a(Activity activity) {
            activity.finishAfterTransition();
        }

        /* renamed from: b */
        static void m2600b(Activity activity) {
            activity.postponeEnterTransition();
        }

        /* renamed from: c */
        static void m2601c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        /* renamed from: d */
        static void m2602d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        /* renamed from: e */
        static void m2603e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.core.app.ActivityCompat$c */
    static class C0654c {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public static void m2604a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        /* renamed from: b */
        static void m2605b(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        /* renamed from: c */
        static boolean m2606c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: androidx.core.app.ActivityCompat$d */
    static class C0655d {
        /* renamed from: a */
        static boolean m2607a(Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        @SuppressLint({"BanUncheckedReflection"})
        /* renamed from: b */
        static boolean m2608b(Activity activity, String str) {
            try {
                PackageManager packageManager = activity.getApplication().getPackageManager();
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", new Class[]{String.class}).invoke(packageManager, new Object[]{str})).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* renamed from: androidx.core.app.ActivityCompat$e */
    static class C0656e {
        /* renamed from: a */
        static boolean m2609a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: androidx.core.app.ActivityCompat$f */
    public interface C0657f {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* renamed from: androidx.core.app.ActivityCompat$g */
    static class C0658g extends SharedElementCallback {

        /* renamed from: a */
        private final SharedElementCallback f3241a;

        C0658g(SharedElementCallback sharedElementCallback) {
            this.f3241a = sharedElementCallback;
        }

        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f3241a.mo3106b(view, matrix, rectF);
        }

        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f3241a.mo3107c(context, parcelable);
        }

        public void onMapSharedElements(List list, Map map) {
            this.f3241a.mo3108d(list, map);
        }

        public void onRejectSharedElements(List list) {
            this.f3241a.mo3109e(list);
        }

        public void onSharedElementEnd(List list, List list2, List list3) {
            this.f3241a.mo3110f(list, list2, list3);
        }

        public void onSharedElementStart(List list, List list2, List list3) {
            this.f3241a.mo3111g(list, list2, list3);
        }

        public void onSharedElementsArrived(List list, List list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f3241a.mo3112h(list, list2, new C0678c(onSharedElementsReadyListener));
        }
    }

    protected ActivityCompat() {
    }

    /* renamed from: A */
    public static void m2582A(Activity activity) {
        C0653b.m2603e(activity);
    }

    /* renamed from: p */
    public static void m2584p(Activity activity) {
        C0652a.m2596a(activity);
    }

    /* renamed from: q */
    public static void m2585q(Activity activity) {
        C0653b.m2599a(activity);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static /* synthetic */ void m2586r(Activity activity) {
        if (!activity.isFinishing() && !C0684e.m2693i(activity)) {
            activity.recreate();
        }
    }

    /* renamed from: s */
    public static void m2587s(Activity activity) {
        C0653b.m2600b(activity);
    }

    /* renamed from: t */
    public static void m2588t(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new C0660a(activity));
        }
    }

    /* renamed from: u */
    public static void m2589u(Activity activity, String[] strArr, int i) {
        String[] strArr2;
        PermissionCompatDelegate permissionCompatDelegate = f3240c;
        if (permissionCompatDelegate == null || !permissionCompatDelegate.mo3092a(activity, strArr, i)) {
            HashSet hashSet = new HashSet();
            int i2 = 0;
            while (i2 < strArr.length) {
                if (!TextUtils.isEmpty(strArr[i2])) {
                    if (!C0904b.m3331c() && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                        hashSet.add(Integer.valueOf(i2));
                    }
                    i2++;
                } else {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            int size = hashSet.size();
            if (size > 0) {
                strArr2 = new String[(strArr.length - size)];
            } else {
                strArr2 = strArr;
            }
            if (size > 0) {
                if (size != strArr.length) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < strArr.length; i4++) {
                        if (!hashSet.contains(Integer.valueOf(i4))) {
                            strArr2[i3] = strArr[i4];
                            i3++;
                        }
                    }
                } else {
                    return;
                }
            }
            if (activity instanceof C0657f) {
                ((C0657f) activity).validateRequestPermissionsRequestCode(i);
            }
            C0654c.m2605b(activity, strArr, i);
        }
    }

    /* renamed from: v */
    public static void m2590v(Activity activity, SharedElementCallback sharedElementCallback) {
        C0658g gVar;
        if (sharedElementCallback != null) {
            gVar = new C0658g(sharedElementCallback);
        } else {
            gVar = null;
        }
        C0653b.m2601c(activity, gVar);
    }

    /* renamed from: w */
    public static void m2591w(Activity activity, SharedElementCallback sharedElementCallback) {
        C0658g gVar;
        if (sharedElementCallback != null) {
            gVar = new C0658g(sharedElementCallback);
        } else {
            gVar = null;
        }
        C0653b.m2602d(activity, gVar);
    }

    /* renamed from: x */
    public static boolean m2592x(Activity activity, String str) {
        if (!C0904b.m3331c() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 32) {
            return C0656e.m2609a(activity, str);
        }
        if (i == 31) {
            return C0655d.m2608b(activity, str);
        }
        return C0654c.m2606c(activity, str);
    }

    /* renamed from: y */
    public static void m2593y(Activity activity, Intent intent, int i, Bundle bundle) {
        C0652a.m2597b(activity, intent, i, bundle);
    }

    /* renamed from: z */
    public static void m2594z(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        C0652a.m2598c(activity, intentSender, i, intent, i2, i3, i4, bundle);
    }
}

package com.facetec.sdk;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.view.C1055a;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import java.security.SecureRandom;
import java.util.List;

/* renamed from: com.facetec.sdk.ax */
class C2810ax {

    /* renamed from: c */
    private static byte[] f9022c;

    /* renamed from: d */
    private static /* synthetic */ boolean f9023d = true;

    /* renamed from: e */
    public static final int f9024e = 0;

    /* renamed from: com.facetec.sdk.ax$a */
    static class C2812a {

        /* renamed from: b */
        private int f9025b;

        /* renamed from: d */
        private int f9026d;

        C2812a(int i, int i2) {
            this.f9026d = i;
            this.f9025b = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final int mo8868b() {
            return this.f9025b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final int mo8869d() {
            return this.f9026d;
        }
    }

    static {
        m10992b();
    }

    C2810ax() {
    }

    /* renamed from: a */
    static void m10986a(View view) {
        ViewCompat.m3619r0(view, new C1055a() {
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.mo3586Q(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3746i);
                accessibilityNodeInfoCompat.mo3593Z(false);
            }
        });
    }

    /* renamed from: b */
    static String m10991b(String str) {
        return str == null ? "Unknown Error" : str;
    }

    /* renamed from: c */
    static float m10994c(int i) {
        return ((float) i) / (((float) Resources.getSystem().getDisplayMetrics().densityDpi) / 160.0f);
    }

    /* renamed from: d */
    static String m10996d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ApplicationInfo applicationInfo = null;
        try {
            byte b = (byte) f9022c[41];
            byte b2 = (byte) b;
            Object[] objArr = new Object[1];
            m11001f(b, b2, (byte) b2, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b3 = (byte) (f9022c[8] - 1);
            byte b4 = (byte) b3;
            Object[] objArr2 = new Object[1];
            m11001f(b3, b4, (byte) b4, objArr2);
            applicationInfo = packageManager.getApplicationInfo(((ApplicationInfo) cls.getMethod((String) objArr2[0], (Class[]) null).invoke(context, (Object[]) null)).packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        return (String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : "Unknown");
    }

    /* renamed from: e */
    static float m10998e(int i) {
        return TypedValue.applyDimension(2, (float) i, Resources.getSystem().getDisplayMetrics());
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11001f(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 5
            int r6 = 23 - r6
            int r8 = r8 * 6
            int r8 = r8 + 97
            byte[] r0 = f9022c
            int r7 = r7 * 22
            int r7 = r7 + 4
            byte[] r1 = new byte[r6]
            int r6 = r6 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001a
            r3 = r8
            r4 = r2
            r8 = r7
            r7 = r6
            goto L_0x0030
        L_0x001a:
            r3 = r2
        L_0x001b:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L_0x002a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L_0x002a:
            byte r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L_0x0030:
            int r8 = r8 + 1
            int r6 = r6 + r3
            int r6 = r6 + -8
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2810ax.m11001f(byte, int, byte, java.lang.Object[]):void");
    }

    /* renamed from: a */
    static C2812a m10984a(String str, int i, Typeface typeface) {
        return m10985a(str, i, typeface, new Paint());
    }

    /* renamed from: b */
    static void m10992b() {
        f9022c = new byte[]{7, 18, 54, 24, 21, -2, 22, 5, 2, 3, -46, 61, 20, 7, 14, -7, 17, 14, -62, 29, 52, 7, 14, -7, 27, 4, 6, 23, -43, 55, 8, 4, 5, 2, 6, 27, -3, 14, 7, -29, 45, 0, 17};
        f9024e = 158;
    }

    /* renamed from: c */
    static Fragment m10995c(Activity activity) {
        FragmentManager fragmentManager;
        if (!(activity == null || (fragmentManager = activity.getFragmentManager()) == null)) {
            List<Fragment> a = Build.VERSION.SDK_INT >= 26 ? fragmentManager.getFragments() : null;
            if (a != null) {
                for (Fragment fragment : a) {
                    if (fragment != null && fragment.isVisible()) {
                        return fragment;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    static float m10988b(int i) {
        return TypedValue.applyDimension(1, (float) i, Resources.getSystem().getDisplayMetrics());
    }

    /* renamed from: e */
    static String m11000e(int i, int i2) {
        return C2844bi.m11421e(m10993b(i, i2));
    }

    /* renamed from: a */
    private static C2812a m10985a(String str, int i, Typeface typeface, Paint paint) {
        paint.setTextSize((float) i);
        paint.setTypeface(typeface);
        paint.setFlags(1);
        paint.setTextAlign(Paint.Align.LEFT);
        paint.setAntiAlias(true);
        int round = Math.round(paint.measureText(str));
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return new C2812a(round, Math.round(fontMetrics.descent - fontMetrics.ascent));
    }

    /* renamed from: d */
    static void m10997d(Activity activity) {
        View findViewById = activity.findViewById(C2747R.C2749id.backgroundColor);
        if (findViewById != null) {
            findViewById.setVisibility(4);
        }
    }

    /* renamed from: b */
    static byte[] m10993b(int i, int i2) {
        SecureRandom secureRandom = new SecureRandom();
        if (i2 != 0) {
            i += secureRandom.nextInt(i2 + 1);
        }
        return secureRandom.generateSeed(i);
    }

    /* renamed from: e */
    static WindowManager m10999e(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getWindowManager();
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (f9023d || windowManager != null) {
            return windowManager;
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    static int m10989b(Context context) {
        int rotation = m10999e(context).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 0;
        }
        if (rotation != 2) {
            return rotation != 3 ? 1 : 8;
        }
        String str = Build.MODEL;
        if (str.contains("Mi MIX 2") || str.contains("RCT6773W22BM")) {
            return 1;
        }
        return 9;
    }

    /* renamed from: b */
    static AnimatedVectorDrawableCompat m10990b(Activity activity, int i) {
        AnimatedVectorDrawableCompat b = AnimatedVectorDrawableCompat.m7299b(activity, i);
        if (f9023d || b != null) {
            return (AnimatedVectorDrawableCompat) b.mutate();
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    static int m10983a(TextView textView, C2812a aVar, int i, int i2) {
        int ceil;
        Typeface typeface = textView.getTypeface();
        String charSequence = textView.getText().toString();
        if (charSequence.contains("\n")) {
            charSequence = charSequence.substring(0, charSequence.indexOf("\n"));
        }
        int i3 = i2 - i;
        Paint paint = new Paint();
        do {
            i3--;
            ceil = (int) Math.ceil(((double) (i2 + i)) / 2.0d);
            C2812a a = m10985a(charSequence, ceil, typeface, paint);
            if (a.mo8869d() > aVar.mo8869d() || a.mo8868b() > aVar.mo8868b()) {
                i2 = ceil - 1;
            } else {
                i = ceil;
            }
            if (i == i2) {
                break;
            }
        } while (i3 > 0);
        return ceil - 1;
    }

    /* renamed from: a */
    static boolean m10987a(Activity activity) {
        return activity != null && !activity.isFinishing();
    }
}

package g91;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import p366bk.C10324m;

/* renamed from: g91.c1 */
public abstract class C32296c1 {
    /* renamed from: a */
    public static int m95141a(Context context, int i) {
        return Math.round(((float) i) * (context.getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    /* renamed from: b */
    public static int m95142b(int i) {
        if (i == 1) {
            return C10324m.widget_currency_rate_item_small;
        }
        if (i == 2) {
            return C10324m.widget_currency_rate_item_medium;
        }
        if (i != 3) {
            return C10324m.widget_currency_rate_item;
        }
        return C10324m.widget_currency_rate_item;
    }

    /* renamed from: c */
    public static int m95143c(int i) {
        if (i == 1) {
            return C10324m.widget_currency_rates_small;
        }
        if (i == 2) {
            return C10324m.widget_currency_rates_medium;
        }
        if (i != 3) {
            return C10324m.widget_currency_rates;
        }
        return C10324m.widget_currency_rates;
    }

    /* renamed from: d */
    public static int m95144d(int i) {
        int i2 = 2;
        while ((i2 * 70) - 30 < i) {
            i2++;
        }
        return i2 - 1;
    }

    /* renamed from: e */
    public static Bitmap m95145e(Context context, int i, int i2, int i3, int i4) {
        return m95146f(context, context.getString(i), i2, i3, i4);
    }

    /* renamed from: f */
    public static Bitmap m95146f(Context context, String str, int i, int i2, int i3) {
        return m95147g(context, str, i, i2, i3, -1);
    }

    /* JADX WARNING: type inference failed for: r8v5, types: [java.lang.CharSequence] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m95147g(android.content.Context r7, java.lang.String r8, int r9, int r10, int r11, int r12) {
        /*
            int r10 = androidx.core.content.C0767a.m2893c(r7, r10)
            android.content.res.Resources r0 = r7.getResources()
            int r9 = r0.getDimensionPixelSize(r9)
            android.graphics.Typeface r7 = androidx.core.content.res.C0808h.m3033h(r7, r11)
            int r11 = r9 / 9
            android.text.TextPaint r6 = new android.text.TextPaint
            r6.<init>()
            r0 = 1
            r6.setAntiAlias(r0)
            r6.setTypeface(r7)
            r6.setColor(r10)
            float r5 = (float) r9
            r6.setTextSize(r5)
            float r7 = r6.measureText(r8)
            int r10 = r11 * 2
            float r0 = (float) r10
            float r7 = r7 + r0
            int r7 = (int) r7
            r0 = -1
            if (r12 == r0) goto L_0x003c
            if (r7 <= r12) goto L_0x003c
            int r7 = r12 - r10
            float r10 = (float) r7
            android.text.TextUtils$TruncateAt r12 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r8 = android.text.TextUtils.ellipsize(r8, r6, r10, r12)
        L_0x003c:
            r1 = r8
            double r8 = (double) r9
            r2 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            double r8 = r8 / r2
            int r8 = (int) r8
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r7, r8, r9)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r7)
            r2 = 0
            int r3 = r1.length()
            float r4 = (float) r11
            r0.drawText(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g91.C32296c1.m95147g(android.content.Context, java.lang.String, int, int, int, int):android.graphics.Bitmap");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m95148h(android.content.Context r6, java.lang.String r7, int r8, int r9, int r10, int r11, int r12) {
        /*
            r0 = 2
            if (r11 == r0) goto L_0x0013
            r0 = 3
            if (r11 == r0) goto L_0x0008
            r11 = 0
            goto L_0x001e
        L_0x0008:
            android.content.res.Resources r11 = r6.getResources()
            int r0 = p366bk.C10319h.widget_ccy_big_occupied_width
            float r11 = r11.getDimension(r0)
            goto L_0x001d
        L_0x0013:
            android.content.res.Resources r11 = r6.getResources()
            int r0 = p366bk.C10319h.widget_ccy_medium_occupied_width
            float r11 = r11.getDimension(r0)
        L_0x001d:
            int r11 = (int) r11
        L_0x001e:
            int r12 = m95141a(r6, r12)
            if (r11 == 0) goto L_0x0026
            int r12 = r12 - r11
            goto L_0x0027
        L_0x0026:
            r12 = -1
        L_0x0027:
            r5 = r12
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            android.graphics.Bitmap r6 = m95147g(r0, r1, r2, r3, r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g91.C32296c1.m95148h(android.content.Context, java.lang.String, int, int, int, int, int):android.graphics.Bitmap");
    }

    /* renamed from: i */
    public static int m95149i(int i) {
        if (i == 1) {
            return C10324m.widget_service_point_item_small;
        }
        if (i != 2) {
            return C10324m.widget_service_point_item;
        }
        return C10324m.widget_service_point_item_medium;
    }

    /* renamed from: j */
    public static int m95150j(int i) {
        if (i == 1) {
            return C10324m.widget_service_points_small;
        }
        if (i != 2) {
            return C10324m.widget_service_points;
        }
        return C10324m.widget_service_points_medium;
    }

    /* renamed from: k */
    public static int m95151k(Bundle bundle) {
        int d = m95144d(bundle.getInt("appWidgetMinWidth"));
        Log.d("WidgetUtils", ">> widget cells : " + d);
        if (d > 4) {
            return 3;
        }
        if (d <= 2) {
            return 1;
        }
        return 2;
    }

    /* renamed from: l */
    public static void m95152l(Intent intent, Bundle bundle) {
        int i = bundle.getInt("appWidgetMinWidth");
        int i2 = bundle.getInt("appWidgetMaxHeight");
        intent.putExtra("WIDGET_WIDTH", i);
        intent.putExtra("WIDGET_HEIGHT", i2);
    }
}

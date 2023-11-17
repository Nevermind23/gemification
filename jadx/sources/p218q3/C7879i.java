package p218q3;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.C11398b;

/* renamed from: q3.i */
public final class C7879i {

    /* renamed from: a */
    private final int f22822a;

    /* renamed from: b */
    private final int f22823b;

    /* renamed from: c */
    private final Context f22824c;

    /* renamed from: d */
    private final int f22825d;

    /* renamed from: q3.i$a */
    public static final class C7880a {

        /* renamed from: i */
        static final int f22826i = (Build.VERSION.SDK_INT < 26 ? 4 : 1);

        /* renamed from: a */
        final Context f22827a;

        /* renamed from: b */
        ActivityManager f22828b;

        /* renamed from: c */
        C7882c f22829c;

        /* renamed from: d */
        float f22830d = 2.0f;

        /* renamed from: e */
        float f22831e = ((float) f22826i);

        /* renamed from: f */
        float f22832f = 0.4f;

        /* renamed from: g */
        float f22833g = 0.33f;

        /* renamed from: h */
        int f22834h = 4194304;

        public C7880a(Context context) {
            this.f22827a = context;
            this.f22828b = (ActivityManager) context.getSystemService("activity");
            this.f22829c = new C7881b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && C7879i.m29836e(this.f22828b)) {
                this.f22831e = Utils.FLOAT_EPSILON;
            }
        }

        /* renamed from: a */
        public C7879i mo22851a() {
            return new C7879i(this);
        }
    }

    /* renamed from: q3.i$b */
    private static final class C7881b implements C7882c {

        /* renamed from: a */
        private final DisplayMetrics f22835a;

        C7881b(DisplayMetrics displayMetrics) {
            this.f22835a = displayMetrics;
        }

        /* renamed from: a */
        public int mo22852a() {
            return this.f22835a.heightPixels;
        }

        /* renamed from: b */
        public int mo22853b() {
            return this.f22835a.widthPixels;
        }
    }

    /* renamed from: q3.i$c */
    interface C7882c {
        /* renamed from: a */
        int mo22852a();

        /* renamed from: b */
        int mo22853b();
    }

    C7879i(C7880a aVar) {
        int i;
        boolean z;
        this.f22824c = aVar.f22827a;
        if (m29836e(aVar.f22828b)) {
            i = aVar.f22834h / 2;
        } else {
            i = aVar.f22834h;
        }
        this.f22825d = i;
        int c = m29835c(aVar.f22828b, aVar.f22832f, aVar.f22833g);
        float b = (float) (aVar.f22829c.mo22853b() * aVar.f22829c.mo22852a() * 4);
        int round = Math.round(aVar.f22831e * b);
        int round2 = Math.round(b * aVar.f22830d);
        int i2 = c - i;
        int i3 = round2 + round;
        if (i3 <= i2) {
            this.f22823b = round2;
            this.f22822a = round;
        } else {
            float f = (float) i2;
            float f2 = aVar.f22831e;
            float f3 = aVar.f22830d;
            float f4 = f / (f2 + f3);
            this.f22823b = Math.round(f3 * f4);
            this.f22822a = Math.round(f4 * aVar.f22831e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(m29837f(this.f22823b));
            sb.append(", pool size: ");
            sb.append(m29837f(this.f22822a));
            sb.append(", byte array size: ");
            sb.append(m29837f(i));
            sb.append(", memory class limited? ");
            if (i3 > c) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append(", max size: ");
            sb.append(m29837f(c));
            sb.append(", memoryClass: ");
            sb.append(aVar.f22828b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m29836e(aVar.f22828b));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    /* renamed from: c */
    private static int m29835c(ActivityManager activityManager, float f, float f2) {
        float memoryClass = (float) (activityManager.getMemoryClass() * C11398b.f33141t * C11398b.f33141t);
        if (m29836e(activityManager)) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    /* renamed from: e */
    static boolean m29836e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    /* renamed from: f */
    private String m29837f(int i) {
        return Formatter.formatFileSize(this.f22824c, (long) i);
    }

    /* renamed from: a */
    public int mo22848a() {
        return this.f22825d;
    }

    /* renamed from: b */
    public int mo22849b() {
        return this.f22822a;
    }

    /* renamed from: d */
    public int mo22850d() {
        return this.f22823b;
    }
}

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p089g4.C6223k;
import p205p3.C7676d;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView;

/* renamed from: com.bumptech.glide.load.resource.bitmap.j0 */
public abstract class C2512j0 {

    /* renamed from: a */
    private static final Paint f7953a = new Paint(6);

    /* renamed from: b */
    private static final Paint f7954b = new Paint(7);

    /* renamed from: c */
    private static final Paint f7955c;

    /* renamed from: d */
    private static final Set f7956d;

    /* renamed from: e */
    private static final Lock f7957e;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.j0$a */
    class C2513a implements C2515c {

        /* renamed from: a */
        final /* synthetic */ int f7958a;

        C2513a(int i) {
            this.f7958a = i;
        }

        /* renamed from: a */
        public void mo8012a(Canvas canvas, Paint paint, RectF rectF) {
            int i = this.f7958a;
            canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.j0$b */
    class C2514b implements C2515c {

        /* renamed from: a */
        final /* synthetic */ float f7959a;

        /* renamed from: b */
        final /* synthetic */ float f7960b;

        /* renamed from: c */
        final /* synthetic */ float f7961c;

        /* renamed from: d */
        final /* synthetic */ float f7962d;

        C2514b(float f, float f2, float f3, float f4) {
            this.f7959a = f;
            this.f7960b = f2;
            this.f7961c = f3;
            this.f7962d = f4;
        }

        /* renamed from: a */
        public void mo8012a(Canvas canvas, Paint paint, RectF rectF) {
            Path path = new Path();
            float f = this.f7959a;
            float f2 = this.f7960b;
            float f3 = this.f7961c;
            float f4 = this.f7962d;
            path.addRoundRect(rectF, new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.j0$c */
    private interface C2515c {
        /* renamed from: a */
        void mo8012a(Canvas canvas, Paint paint, RectF rectF);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.j0$d */
    private static final class C2516d implements Lock {
        C2516d() {
        }

        public void lock() {
        }

        public void lockInterruptibly() {
        }

        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        public boolean tryLock() {
            return true;
        }

        public void unlock() {
        }

        public boolean tryLock(long j, TimeUnit timeUnit) {
            return true;
        }
    }

    static {
        Lock lock;
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"}));
        f7956d = hashSet;
        if (hashSet.contains(Build.MODEL)) {
            lock = new ReentrantLock();
        } else {
            lock = new C2516d();
        }
        f7957e = lock;
        Paint paint = new Paint(7);
        f7955c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    private static void m9713a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f7957e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f7953a);
            m9717e(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f7957e.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public static Bitmap m9714b(C7676d dVar, Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        int width = bitmap.getWidth() * i2;
        int height = bitmap.getHeight() * i;
        float f3 = Utils.FLOAT_EPSILON;
        if (width > height) {
            f2 = ((float) i2) / ((float) bitmap.getHeight());
            f3 = (((float) i) - (((float) bitmap.getWidth()) * f2)) * 0.5f;
            f = 0.0f;
        } else {
            f2 = ((float) i) / ((float) bitmap.getWidth());
            f = (((float) i2) - (((float) bitmap.getHeight()) * f2)) * 0.5f;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((float) ((int) (f3 + 0.5f)), (float) ((int) (f + 0.5f)));
        Bitmap d = dVar.mo22395d(i, i2, m9723k(bitmap));
        m9730r(bitmap, d);
        m9713a(bitmap, d, matrix);
        return d;
    }

    /* renamed from: c */
    public static Bitmap m9715c(C7676d dVar, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return m9718f(dVar, bitmap, i, i2);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    /* renamed from: d */
    public static Bitmap m9716d(C7676d dVar, Bitmap bitmap, int i, int i2) {
        int min = Math.min(i, i2);
        float f = (float) min;
        float f2 = f / 2.0f;
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        float max = Math.max(f / width, f / height);
        float f3 = width * max;
        float f4 = max * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap g = m9719g(dVar, bitmap);
        Bitmap d = dVar.mo22395d(min, min, m9720h(bitmap));
        d.setHasAlpha(true);
        Lock lock = f7957e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(d);
            canvas.drawCircle(f2, f2, f2, f7954b);
            canvas.drawBitmap(g, (Rect) null, rectF, f7955c);
            m9717e(canvas);
            lock.unlock();
            if (!g.equals(bitmap)) {
                dVar.mo8047c(g);
            }
            return d;
        } catch (Throwable th) {
            f7957e.unlock();
            throw th;
        }
    }

    /* renamed from: e */
    private static void m9717e(Canvas canvas) {
        canvas.setBitmap((Bitmap) null);
    }

    /* renamed from: f */
    public static Bitmap m9718f(C7676d dVar, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap d = dVar.mo22395d((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), m9723k(bitmap));
        m9730r(bitmap, d);
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i + "x" + i2);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + d.getWidth() + "x" + d.getHeight());
            StringBuilder sb = new StringBuilder();
            sb.append("minPct:   ");
            sb.append(min);
            Log.v("TransformationUtils", sb.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        m9713a(bitmap, d, matrix);
        return d;
    }

    /* renamed from: g */
    private static Bitmap m9719g(C7676d dVar, Bitmap bitmap) {
        Bitmap.Config h = m9720h(bitmap);
        if (h.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap d = dVar.mo22395d(bitmap.getWidth(), bitmap.getHeight(), h);
        new Canvas(d).drawBitmap(bitmap, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (Paint) null);
        return d;
    }

    /* renamed from: h */
    private static Bitmap.Config m9720h(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) {
            return Bitmap.Config.ARGB_8888;
        }
        return Bitmap.Config.RGBA_F16;
    }

    /* renamed from: i */
    public static Lock m9721i() {
        return f7957e;
    }

    /* renamed from: j */
    public static int m9722j(int i) {
        switch (i) {
            case 3:
            case 4:
                return SubsamplingScaleImageView.ORIENTATION_180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return SubsamplingScaleImageView.ORIENTATION_270;
            default:
                return 0;
        }
    }

    /* renamed from: k */
    private static Bitmap.Config m9723k(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    /* renamed from: l */
    static void m9724l(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }

    /* renamed from: m */
    public static boolean m9725m(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: n */
    public static Bitmap m9726n(C7676d dVar, Bitmap bitmap, int i) {
        if (!m9725m(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m9724l(i, matrix);
        RectF rectF = new RectF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap d = dVar.mo22395d(Math.round(rectF.width()), Math.round(rectF.height()), m9723k(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        d.setHasAlpha(bitmap.hasAlpha());
        m9713a(bitmap, d, matrix);
        return d;
    }

    /* renamed from: o */
    public static Bitmap m9727o(C7676d dVar, Bitmap bitmap, float f, float f2, float f3, float f4) {
        return m9729q(dVar, bitmap, new C2514b(f, f2, f3, f4));
    }

    /* renamed from: p */
    public static Bitmap m9728p(C7676d dVar, Bitmap bitmap, int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C6223k.m24727a(z, "roundingRadius must be greater than 0.");
        return m9729q(dVar, bitmap, new C2513a(i));
    }

    /* renamed from: q */
    private static Bitmap m9729q(C7676d dVar, Bitmap bitmap, C2515c cVar) {
        Bitmap.Config h = m9720h(bitmap);
        Bitmap g = m9719g(dVar, bitmap);
        Bitmap d = dVar.mo22395d(g.getWidth(), g.getHeight(), h);
        d.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(g, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) d.getWidth(), (float) d.getHeight());
        Lock lock = f7957e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(d);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            cVar.mo8012a(canvas, paint, rectF);
            m9717e(canvas);
            lock.unlock();
            if (!g.equals(bitmap)) {
                dVar.mo8047c(g);
            }
            return d;
        } catch (Throwable th) {
            f7957e.unlock();
            throw th;
        }
    }

    /* renamed from: r */
    public static void m9730r(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}

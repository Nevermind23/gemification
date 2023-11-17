package p048d2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import com.airbnb.lottie.C2311c;
import com.github.mikephil.charting.utils.Utils;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
import p255t1.C8331u;
import p268u1.C8535d;

/* renamed from: d2.j */
public abstract class C5808j {

    /* renamed from: a */
    private static final ThreadLocal f18293a = new C5809a();

    /* renamed from: b */
    private static final ThreadLocal f18294b = new C5810b();

    /* renamed from: c */
    private static final ThreadLocal f18295c = new C5811c();

    /* renamed from: d */
    private static final ThreadLocal f18296d = new C5812d();

    /* renamed from: e */
    private static final float f18297e = ((float) (Math.sqrt(2.0d) / 2.0d));

    /* renamed from: d2.j$a */
    class C5809a extends ThreadLocal {
        C5809a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* renamed from: d2.j$b */
    class C5810b extends ThreadLocal {
        C5810b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Path initialValue() {
            return new Path();
        }
    }

    /* renamed from: d2.j$c */
    class C5811c extends ThreadLocal {
        C5811c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Path initialValue() {
            return new Path();
        }
    }

    /* renamed from: d2.j$d */
    class C5812d extends ThreadLocal {
        C5812d() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float[] initialValue() {
            return new float[4];
        }
    }

    /* renamed from: a */
    public static void m23373a(Path path, float f, float f2, float f3) {
        C2311c.m8884a("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = (PathMeasure) f18293a.get();
        Path path2 = (Path) f18294b.get();
        Path path3 = (Path) f18295c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == Utils.FLOAT_EPSILON) {
            C2311c.m8885b("applyTrimPathIfNeeded");
        } else if (length < 1.0f || ((double) Math.abs((f2 - f) - 1.0f)) < 0.01d) {
            C2311c.m8885b("applyTrimPathIfNeeded");
        } else {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = (float) C5807i.m23367f(min, length);
                max = (float) C5807i.m23367f(max, length);
            }
            if (min < Utils.FLOAT_EPSILON) {
                min = (float) C5807i.m23367f(min, length);
            }
            if (max < Utils.FLOAT_EPSILON) {
                max = (float) C5807i.m23367f(max, length);
            }
            int i = (min > max ? 1 : (min == max ? 0 : -1));
            if (i == 0) {
                path.reset();
                C2311c.m8885b("applyTrimPathIfNeeded");
                return;
            }
            if (i >= 0) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(Utils.FLOAT_EPSILON, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < Utils.FLOAT_EPSILON) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            C2311c.m8885b("applyTrimPathIfNeeded");
        }
    }

    /* renamed from: b */
    public static void m23374b(Path path, C8331u uVar) {
        if (uVar != null && !uVar.mo23489k()) {
            m23373a(path, ((C8535d) uVar.mo23487i()).mo23879p() / 100.0f, ((C8535d) uVar.mo23485f()).mo23879p() / 100.0f, ((C8535d) uVar.mo23486g()).mo23879p() / 360.0f);
        }
    }

    /* renamed from: c */
    public static void m23375c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static Path m23376d(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == Utils.FLOAT_EPSILON && pointF4.length() == Utils.FLOAT_EPSILON)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF.x;
            float f2 = pointF2.x;
            float f3 = pointF2.y;
            path.cubicTo(pointF3.x + f, pointF.y + pointF3.y, f2 + pointF4.x, f3 + pointF4.y, f2, f3);
        }
        return path;
    }

    /* renamed from: e */
    public static float m23377e() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    /* renamed from: f */
    public static float m23378f(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    /* renamed from: g */
    public static float m23379g(Matrix matrix) {
        float[] fArr = (float[]) f18296d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f18297e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot((double) (fArr[2] - fArr[0]), (double) (fArr[3] - fArr[1]));
    }

    /* renamed from: h */
    public static boolean m23380h(Matrix matrix) {
        float[] fArr = (float[]) f18296d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] == fArr[2] || fArr[1] == fArr[3]) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static int m23381i(float f, float f2, float f3, float f4) {
        int i = f != Utils.FLOAT_EPSILON ? (int) (((float) 527) * f) : 17;
        if (f2 != Utils.FLOAT_EPSILON) {
            i = (int) (((float) (i * 31)) * f2);
        }
        if (f3 != Utils.FLOAT_EPSILON) {
            i = (int) (((float) (i * 31)) * f3);
        }
        return f4 != Utils.FLOAT_EPSILON ? (int) (((float) (i * 31)) * f4) : i;
    }

    /* renamed from: j */
    public static boolean m23382j(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        if (i2 > i5) {
            return true;
        }
        return i3 >= i6;
    }

    /* renamed from: k */
    public static boolean m23383k(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    /* renamed from: l */
    public static Bitmap m23384l(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    /* renamed from: m */
    public static void m23385m(Canvas canvas, RectF rectF, Paint paint) {
        m23386n(canvas, rectF, paint, 31);
    }

    /* renamed from: n */
    public static void m23386n(Canvas canvas, RectF rectF, Paint paint, int i) {
        C2311c.m8884a("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        C2311c.m8885b("Utils#saveLayer");
    }
}

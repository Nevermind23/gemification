package p191o2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.androidnetworking.error.ANError;
import dg1.C40691m;
import java.io.IOException;
import java.net.URLConnection;
import of1.C41880d0;
import p113i2.C6511a;
import p113i2.C6521b;
import p126j2.C6684b;
import p152l2.C6867a;

/* renamed from: o2.c */
public abstract class C7421c {

    /* renamed from: o2.c$a */
    static class C7422a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ long f21682d;

        /* renamed from: e */
        final /* synthetic */ long f21683e;

        /* renamed from: f */
        final /* synthetic */ long f21684f;

        /* renamed from: g */
        final /* synthetic */ boolean f21685g;

        C7422a(C6867a aVar, long j, long j2, long j3, boolean z) {
            this.f21682d = j;
            this.f21683e = j2;
            this.f21684f = j3;
            this.f21685g = z;
        }

        public void run() {
        }
    }

    /* renamed from: a */
    public static C6521b m28230a(C41880d0 d0Var, int i, int i2, Bitmap.Config config, BitmapFactory.Options options, ImageView.ScaleType scaleType) {
        Bitmap bitmap;
        byte[] bArr = new byte[0];
        try {
            bArr = C40691m.m117770b(d0Var.mo96739a().mo21304t()).mo94712P0();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (i == 0 && i2 == 0) {
            options.inPreferredConfig = config;
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i3 = options.outWidth;
            int i4 = options.outHeight;
            int h = m28237h(i, i2, i3, i4, scaleType);
            int h2 = m28237h(i2, i, i4, i3, scaleType);
            options.inJustDecodeBounds = false;
            options.inSampleSize = m28232c(i3, i4, h, h2);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray == null || (decodeByteArray.getWidth() <= h && decodeByteArray.getHeight() <= h2)) {
                bitmap = decodeByteArray;
            } else {
                bitmap = Bitmap.createScaledBitmap(decodeByteArray, h, h2, true);
                decodeByteArray.recycle();
            }
        }
        if (bitmap == null) {
            return C6521b.m25786a(m28234e(new ANError(d0Var)));
        }
        return C6521b.m25787f(bitmap);
    }

    /* renamed from: b */
    public static C6521b m28231b(C41880d0 d0Var, int i, int i2, Bitmap.Config config, ImageView.ScaleType scaleType) {
        return m28230a(d0Var, i, i2, config, new BitmapFactory.Options(), scaleType);
    }

    /* renamed from: c */
    public static int m28232c(int i, int i2, int i3, int i4) {
        double min = Math.min(((double) i) / ((double) i3), ((double) i2) / ((double) i4));
        float f = 1.0f;
        while (true) {
            float f2 = 2.0f * f;
            if (((double) f2) > min) {
                return (int) f;
            }
            f = f2;
        }
    }

    /* renamed from: d */
    public static ANError m28233d(ANError aNError) {
        aNError.mo7646f("connectionError");
        aNError.mo7645e(0);
        return aNError;
    }

    /* renamed from: e */
    public static ANError m28234e(ANError aNError) {
        aNError.mo7645e(0);
        aNError.mo7646f("parseError");
        return aNError;
    }

    /* renamed from: f */
    public static ANError m28235f(ANError aNError, C6511a aVar, int i) {
        ANError I = aVar.mo20451I(aNError);
        I.mo7645e(i);
        I.mo7646f("responseFromServerError");
        return I;
    }

    /* renamed from: g */
    public static String m28236g(String str) {
        String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(str);
        if (contentTypeFor == null) {
            return "application/octet-stream";
        }
        return contentTypeFor;
    }

    /* renamed from: h */
    private static int m28237h(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            if (i == 0) {
                return i3;
            }
            return i;
        } else if (i == 0) {
            return (int) (((double) i3) * (((double) i2) / ((double) i4)));
        } else if (i2 == 0) {
            return i;
        } else {
            double d = ((double) i4) / ((double) i3);
            if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                double d2 = (double) i2;
                if (((double) i) * d < d2) {
                    return (int) (d2 / d);
                }
                return i;
            }
            double d3 = (double) i2;
            if (((double) i) * d > d3) {
                return (int) (d3 / d);
            }
            return i;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x004f A[SYNTHETIC, Splitter:B:28:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0059 A[SYNTHETIC, Splitter:B:33:0x0059] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m28238i(of1.C41880d0 r3, java.lang.String r4, java.lang.String r5) {
        /*
            r0 = 2048(0x800, float:2.87E-42)
            byte[] r0 = new byte[r0]
            r1 = 0
            of1.e0 r3 = r3.mo96739a()     // Catch:{ all -> 0x004b }
            java.io.InputStream r3 = r3.mo96792a()     // Catch:{ all -> 0x004b }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0047 }
            r2.<init>(r4)     // Catch:{ all -> 0x0047 }
            boolean r4 = r2.exists()     // Catch:{ all -> 0x0047 }
            if (r4 != 0) goto L_0x001b
            r2.mkdirs()     // Catch:{ all -> 0x0047 }
        L_0x001b:
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0047 }
            r4.<init>(r2, r5)     // Catch:{ all -> 0x0047 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ all -> 0x0047 }
            r5.<init>(r4)     // Catch:{ all -> 0x0047 }
        L_0x0025:
            int r4 = r3.read(r0)     // Catch:{ all -> 0x0045 }
            r1 = -1
            if (r4 == r1) goto L_0x0031
            r1 = 0
            r5.write(r0, r1, r4)     // Catch:{ all -> 0x0045 }
            goto L_0x0025
        L_0x0031:
            r5.flush()     // Catch:{ all -> 0x0045 }
            r3.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x003c
        L_0x0038:
            r3 = move-exception
            r3.printStackTrace()
        L_0x003c:
            r5.close()     // Catch:{ IOException -> 0x0040 }
            goto L_0x0044
        L_0x0040:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0044:
            return
        L_0x0045:
            r4 = move-exception
            goto L_0x0049
        L_0x0047:
            r4 = move-exception
            r5 = r1
        L_0x0049:
            r1 = r3
            goto L_0x004d
        L_0x004b:
            r4 = move-exception
            r5 = r1
        L_0x004d:
            if (r1 == 0) goto L_0x0057
            r1.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0057
        L_0x0053:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0057:
            if (r5 == 0) goto L_0x0061
            r5.close()     // Catch:{ IOException -> 0x005d }
            goto L_0x0061
        L_0x005d:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0061:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p191o2.C7421c.m28238i(of1.d0, java.lang.String, java.lang.String):void");
    }

    /* renamed from: j */
    public static void m28239j(C6867a aVar, long j, long j2, long j3, boolean z) {
        C6684b.m26121b().mo20675a().mo20676a().execute(new C7422a(aVar, j, j2, j3, z));
    }
}

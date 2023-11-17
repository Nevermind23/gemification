package com.theartofdev.edmodo.cropper;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import androidx.exifinterface.media.C1415a;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.C11398b;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView;

/* renamed from: com.theartofdev.edmodo.cropper.c */
abstract class C11865c {

    /* renamed from: a */
    static final Rect f34626a = new Rect();

    /* renamed from: b */
    static final RectF f34627b = new RectF();

    /* renamed from: c */
    static final RectF f34628c = new RectF();

    /* renamed from: d */
    static final float[] f34629d = new float[6];

    /* renamed from: e */
    static final float[] f34630e = new float[6];

    /* renamed from: f */
    private static int f34631f;

    /* renamed from: g */
    static Pair f34632g;

    /* renamed from: com.theartofdev.edmodo.cropper.c$a */
    static final class C11866a {

        /* renamed from: a */
        public final Bitmap f34633a;

        /* renamed from: b */
        final int f34634b;

        C11866a(Bitmap bitmap, int i) {
            this.f34633a = bitmap;
            this.f34634b = i;
        }
    }

    /* renamed from: com.theartofdev.edmodo.cropper.c$b */
    static final class C11867b {

        /* renamed from: a */
        public final Bitmap f34635a;

        /* renamed from: b */
        final int f34636b;

        C11867b(Bitmap bitmap, int i) {
            this.f34635a = bitmap;
            this.f34636b = i;
        }
    }

    /* renamed from: A */
    static C11867b m43447A(Bitmap bitmap, Context context, Uri uri) {
        C1415a aVar = null;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                C1415a aVar2 = new C1415a(openInputStream);
                try {
                    openInputStream.close();
                } catch (Exception unused) {
                }
                aVar = aVar2;
            }
        } catch (Exception unused2) {
        }
        if (aVar != null) {
            return m43448B(bitmap, aVar);
        }
        return new C11867b(bitmap, 0);
    }

    /* renamed from: B */
    static C11867b m43448B(Bitmap bitmap, C1415a aVar) {
        int i;
        int c = aVar.mo4096c("Orientation", 1);
        if (c == 3) {
            i = SubsamplingScaleImageView.ORIENTATION_180;
        } else if (c == 6) {
            i = 90;
        } else if (c != 8) {
            i = 0;
        } else {
            i = SubsamplingScaleImageView.ORIENTATION_270;
        }
        return new C11867b(bitmap, i);
    }

    /* renamed from: C */
    static void m43449C(Context context, Bitmap bitmap, Uri uri, Bitmap.CompressFormat compressFormat, int i) {
        OutputStream outputStream = null;
        try {
            outputStream = context.getContentResolver().openOutputStream(uri);
            bitmap.compress(compressFormat, i, outputStream);
        } finally {
            m43453c(outputStream);
        }
    }

    /* renamed from: D */
    static Uri m43450D(Context context, Bitmap bitmap, Uri uri) {
        boolean z = true;
        if (uri == null) {
            try {
                uri = Uri.fromFile(File.createTempFile("aic_state_store_temp", ".jpg", context.getCacheDir()));
            } catch (Exception e) {
                Log.w("AIC", "Failed to write bitmap to temp file for image-cropper save instance state", e);
                return null;
            }
        } else if (new File(uri.getPath()).exists()) {
            z = false;
        }
        if (z) {
            m43449C(context, bitmap, uri, Bitmap.CompressFormat.JPEG, 95);
        }
        return uri;
    }

    /* renamed from: a */
    private static int m43451a(int i, int i2) {
        if (f34631f == 0) {
            f34631f = m43465o();
        }
        int i3 = 1;
        if (f34631f > 0) {
            while (true) {
                int i4 = i2 / i3;
                int i5 = f34631f;
                if (i4 <= i5 && i / i3 <= i5) {
                    break;
                }
                i3 *= 2;
            }
        }
        return i3;
    }

    /* renamed from: b */
    private static int m43452b(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 > i4 || i > i3) {
            while ((i2 / 2) / i5 > i4 && (i / 2) / i5 > i3) {
                i5 *= 2;
            }
        }
        return i5;
    }

    /* renamed from: c */
    private static void m43453c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: d */
    static C11866a m43454d(Context context, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3) {
        OutOfMemoryError outOfMemoryError;
        int i8 = 1;
        do {
            try {
                return m43455e(context, uri, fArr, i, i2, i3, z, i4, i5, i6, i7, z2, z3, i8);
            } catch (OutOfMemoryError e) {
                outOfMemoryError = e;
                i8 *= 2;
                if (i8 > 16) {
                    throw new RuntimeException("Failed to handle OOM by sampling (" + i8 + "): " + uri + "\r\n" + outOfMemoryError.getMessage(), outOfMemoryError);
                }
            }
        } while (i8 > 16);
        throw new RuntimeException("Failed to handle OOM by sampling (" + i8 + "): " + uri + "\r\n" + outOfMemoryError.getMessage(), outOfMemoryError);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.theartofdev.edmodo.cropper.C11865c.C11866a m43455e(android.content.Context r14, android.net.Uri r15, float[] r16, int r17, int r18, int r19, boolean r20, int r21, int r22, int r23, int r24, boolean r25, boolean r26, int r27) {
        /*
            r0 = r17
            r1 = r16
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            android.graphics.Rect r9 = m43469s(r1, r2, r3, r4, r5, r6)
            if (r23 <= 0) goto L_0x0017
            r10 = r23
            goto L_0x001c
        L_0x0017:
            int r1 = r9.width()
            r10 = r1
        L_0x001c:
            if (r24 <= 0) goto L_0x0021
            r11 = r24
            goto L_0x0026
        L_0x0021:
            int r1 = r9.height()
            r11 = r1
        L_0x0026:
            r1 = 0
            r2 = r14
            r3 = r15
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r27
            com.theartofdev.edmodo.cropper.c$a r2 = m43463m(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0037 }
            android.graphics.Bitmap r1 = r2.f34633a     // Catch:{ Exception -> 0x0037 }
            int r2 = r2.f34634b     // Catch:{ Exception -> 0x0037 }
            goto L_0x0038
        L_0x0037:
            r2 = 1
        L_0x0038:
            r8 = r2
            if (r1 == 0) goto L_0x0067
            r12 = r25
            r13 = r26
            android.graphics.Bitmap r10 = m43476z(r1, r0, r12, r13)     // Catch:{ OutOfMemoryError -> 0x0060 }
            int r1 = r0 % 90
            if (r1 == 0) goto L_0x0057
            r1 = r10
            r2 = r16
            r3 = r9
            r4 = r17
            r5 = r20
            r6 = r21
            r7 = r22
            android.graphics.Bitmap r10 = m43459i(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ OutOfMemoryError -> 0x005d }
        L_0x0057:
            com.theartofdev.edmodo.cropper.c$a r0 = new com.theartofdev.edmodo.cropper.c$a
            r0.<init>(r10, r8)
            return r0
        L_0x005d:
            r0 = move-exception
            r1 = r10
            goto L_0x0061
        L_0x0060:
            r0 = move-exception
        L_0x0061:
            if (r1 == 0) goto L_0x0066
            r1.recycle()
        L_0x0066:
            throw r0
        L_0x0067:
            r12 = r25
            r13 = r26
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r27
            com.theartofdev.edmodo.cropper.c$a r0 = m43456f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.C11865c.m43455e(android.content.Context, android.net.Uri, float[], int, int, int, boolean, int, int, int, int, boolean, boolean, int):com.theartofdev.edmodo.cropper.c$a");
    }

    /* renamed from: f */
    private static C11866a m43456f(Context context, Uri uri, float[] fArr, int i, boolean z, int i2, int i3, int i4, Rect rect, int i5, int i6, boolean z2, boolean z3) {
        Bitmap j;
        Uri uri2 = uri;
        float[] fArr2 = fArr;
        Bitmap bitmap = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int b = m43452b(rect.width(), rect.height(), i5, i6) * i4;
            options.inSampleSize = b;
            j = m43460j(context.getContentResolver(), uri2, options);
            if (j != null) {
                int length = fArr2.length;
                float[] fArr3 = new float[length];
                System.arraycopy(fArr2, 0, fArr3, 0, fArr2.length);
                for (int i7 = 0; i7 < length; i7++) {
                    fArr3[i7] = fArr3[i7] / ((float) options.inSampleSize);
                }
                bitmap = m43458h(j, fArr3, i, z, i2, i3, 1.0f, z2, z3);
                if (bitmap != j) {
                    j.recycle();
                }
            }
            return new C11866a(bitmap, b);
        } catch (OutOfMemoryError e) {
            if (bitmap != null) {
                bitmap.recycle();
            }
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException("Failed to load sampled bitmap: " + uri2 + "\r\n" + e2.getMessage(), e2);
        } catch (Throwable th) {
            j.recycle();
            throw th;
        }
    }

    /* renamed from: g */
    static C11866a m43457g(Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, boolean z2, boolean z3) {
        int i4 = 1;
        do {
            try {
                return new C11866a(m43458h(bitmap, fArr, i, z, i2, i3, 1.0f / ((float) i4), z2, z3), i4);
            } catch (OutOfMemoryError e) {
                i4 *= 2;
                if (i4 > 8) {
                    throw e;
                }
            }
        } while (i4 > 8);
        throw e;
    }

    /* renamed from: h */
    private static Bitmap m43458h(Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, float f, boolean z2, boolean z3) {
        float f2;
        Bitmap bitmap2 = bitmap;
        int i4 = i;
        float f3 = f;
        Rect s = m43469s(fArr, bitmap.getWidth(), bitmap.getHeight(), z, i2, i3);
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i4, (float) (bitmap.getWidth() / 2), (float) (bitmap.getHeight() / 2));
        if (z2) {
            f2 = -f3;
        } else {
            f2 = f3;
        }
        if (z3) {
            f3 = -f3;
        }
        matrix.postScale(f2, f3);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, s.left, s.top, s.width(), s.height(), matrix, true);
        if (createBitmap == bitmap2) {
            createBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        if (i4 % 90 != 0) {
            return m43459i(createBitmap, fArr, s, i, z, i2, i3);
        }
        return createBitmap;
    }

    /* renamed from: i */
    private static Bitmap m43459i(Bitmap bitmap, float[] fArr, Rect rect, int i, boolean z, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        if (i % 90 == 0) {
            return bitmap;
        }
        double radians = Math.toRadians((double) i);
        if (i < 90 || (i > 180 && i < 270)) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= fArr.length) {
                i5 = 0;
                i6 = 0;
                i7 = 0;
                break;
            }
            float f = fArr[i9];
            if (f >= ((float) (i4 - 1)) && f <= ((float) (i4 + 1))) {
                int i12 = i9 + 1;
                i8 = (int) Math.abs(Math.sin(radians) * ((double) (((float) rect.bottom) - fArr[i12])));
                i6 = (int) Math.abs(Math.cos(radians) * ((double) (fArr[i12] - ((float) rect.top))));
                i7 = (int) Math.abs(((double) (fArr[i12] - ((float) rect.top))) / Math.sin(radians));
                i5 = (int) Math.abs(((double) (((float) rect.bottom) - fArr[i12])) / Math.cos(radians));
                break;
            }
            i9 += 2;
        }
        rect.set(i8, i6, i7 + i8, i5 + i6);
        if (z) {
            m43464n(rect, i2, i3);
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        if (bitmap != createBitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        m43453c((java.io.Closeable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r4.inSampleSize *= 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        m43453c((java.io.Closeable) null);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0011 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m43460j(android.content.ContentResolver r2, android.net.Uri r3, android.graphics.BitmapFactory.Options r4) {
        /*
        L_0x0000:
            r0 = 0
            java.io.InputStream r0 = r2.openInputStream(r3)     // Catch:{ OutOfMemoryError -> 0x0011 }
            android.graphics.Rect r1 = f34626a     // Catch:{ OutOfMemoryError -> 0x0011 }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r0, r1, r4)     // Catch:{ OutOfMemoryError -> 0x0011 }
            m43453c(r0)
            return r2
        L_0x000f:
            r2 = move-exception
            goto L_0x0038
        L_0x0011:
            int r1 = r4.inSampleSize     // Catch:{ all -> 0x000f }
            int r1 = r1 * 2
            r4.inSampleSize = r1     // Catch:{ all -> 0x000f }
            m43453c(r0)
            int r0 = r4.inSampleSize
            r1 = 512(0x200, float:7.175E-43)
            if (r0 > r1) goto L_0x0021
            goto L_0x0000
        L_0x0021:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Failed to decode image: "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
        L_0x0038:
            m43453c(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.C11865c.m43460j(android.content.ContentResolver, android.net.Uri, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* renamed from: k */
    private static BitmapFactory.Options m43461k(ContentResolver contentResolver, Uri uri) {
        InputStream inputStream;
        try {
            inputStream = contentResolver.openInputStream(uri);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStream, f34626a, options);
                options.inJustDecodeBounds = false;
                m43453c(inputStream);
                return options;
            } catch (Throwable th) {
                th = th;
                m43453c(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            m43453c(inputStream);
            throw th;
        }
    }

    /* renamed from: l */
    static C11866a m43462l(Context context, Uri uri, int i, int i2) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            BitmapFactory.Options k = m43461k(contentResolver, uri);
            int i3 = k.outWidth;
            if (i3 == -1) {
                if (k.outHeight == -1) {
                    throw new RuntimeException("File is not a picture");
                }
            }
            k.inSampleSize = Math.max(m43452b(i3, k.outHeight, i, i2), m43451a(k.outWidth, k.outHeight));
            return new C11866a(m43460j(contentResolver, uri, k), k.inSampleSize);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load sampled bitmap: " + uri + "\r\n" + e.getMessage(), e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        m43453c(r4);
        r7.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        return r8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0038 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0087  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.theartofdev.edmodo.cropper.C11865c.C11866a m43463m(android.content.Context r4, android.net.Uri r5, android.graphics.Rect r6, int r7, int r8, int r9) {
        /*
            r0 = 0
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
            r1.<init>()     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
            int r2 = r6.width()     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
            int r3 = r6.height()     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
            int r7 = m43452b(r2, r3, r7, r8)     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
            int r9 = r9 * r7
            r1.inSampleSize = r9     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
            java.io.InputStream r4 = r4.openInputStream(r5)     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
            r7 = 0
            android.graphics.BitmapRegionDecoder r7 = android.graphics.BitmapRegionDecoder.newInstance(r4, r7)     // Catch:{ Exception -> 0x0055, all -> 0x0051 }
        L_0x0022:
            com.theartofdev.edmodo.cropper.c$a r8 = new com.theartofdev.edmodo.cropper.c$a     // Catch:{ OutOfMemoryError -> 0x0038 }
            android.graphics.Bitmap r9 = r7.decodeRegion(r6, r1)     // Catch:{ OutOfMemoryError -> 0x0038 }
            int r2 = r1.inSampleSize     // Catch:{ OutOfMemoryError -> 0x0038 }
            r8.<init>(r9, r2)     // Catch:{ OutOfMemoryError -> 0x0038 }
            m43453c(r4)
            r7.recycle()
            return r8
        L_0x0034:
            r5 = move-exception
            goto L_0x0053
        L_0x0036:
            r6 = move-exception
            goto L_0x0057
        L_0x0038:
            int r8 = r1.inSampleSize     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            int r8 = r8 * 2
            r1.inSampleSize = r8     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            r9 = 512(0x200, float:7.175E-43)
            if (r8 <= r9) goto L_0x0022
            m43453c(r4)
            if (r7 == 0) goto L_0x004a
            r7.recycle()
        L_0x004a:
            com.theartofdev.edmodo.cropper.c$a r4 = new com.theartofdev.edmodo.cropper.c$a
            r5 = 1
            r4.<init>(r0, r5)
            return r4
        L_0x0051:
            r5 = move-exception
            r7 = r0
        L_0x0053:
            r0 = r4
            goto L_0x0082
        L_0x0055:
            r6 = move-exception
            r7 = r0
        L_0x0057:
            r0 = r4
            goto L_0x005e
        L_0x0059:
            r5 = move-exception
            r7 = r0
            goto L_0x0082
        L_0x005c:
            r6 = move-exception
            r7 = r0
        L_0x005e:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x0081 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r8.<init>()     // Catch:{ all -> 0x0081 }
            java.lang.String r9 = "Failed to load sampled bitmap: "
            r8.append(r9)     // Catch:{ all -> 0x0081 }
            r8.append(r5)     // Catch:{ all -> 0x0081 }
            java.lang.String r5 = "\r\n"
            r8.append(r5)     // Catch:{ all -> 0x0081 }
            java.lang.String r5 = r6.getMessage()     // Catch:{ all -> 0x0081 }
            r8.append(r5)     // Catch:{ all -> 0x0081 }
            java.lang.String r5 = r8.toString()     // Catch:{ all -> 0x0081 }
            r4.<init>(r5, r6)     // Catch:{ all -> 0x0081 }
            throw r4     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r5 = move-exception
        L_0x0082:
            m43453c(r0)
            if (r7 == 0) goto L_0x008a
            r7.recycle()
        L_0x008a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.C11865c.m43463m(android.content.Context, android.net.Uri, android.graphics.Rect, int, int, int):com.theartofdev.edmodo.cropper.c$a");
    }

    /* renamed from: n */
    private static void m43464n(Rect rect, int i, int i2) {
        if (i == i2 && rect.width() != rect.height()) {
            if (rect.height() > rect.width()) {
                rect.bottom -= rect.height() - rect.width();
            } else {
                rect.right -= rect.width() - rect.height();
            }
        }
    }

    /* renamed from: o */
    private static int m43465o() {
        try {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            egl10.eglInitialize(eglGetDisplay, new int[2]);
            int[] iArr = new int[1];
            egl10.eglGetConfigs(eglGetDisplay, (EGLConfig[]) null, 0, iArr);
            int i = iArr[0];
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            egl10.eglGetConfigs(eglGetDisplay, eGLConfigArr, i, iArr);
            int[] iArr2 = new int[1];
            int i2 = 0;
            for (int i3 = 0; i3 < iArr[0]; i3++) {
                egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i3], 12332, iArr2);
                int i4 = iArr2[0];
                if (i2 < i4) {
                    i2 = i4;
                }
            }
            egl10.eglTerminate(eglGetDisplay);
            return Math.max(i2, C11398b.f33142u);
        } catch (Exception unused) {
            return C11398b.f33142u;
        }
    }

    /* renamed from: p */
    static float m43466p(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    /* renamed from: q */
    static float m43467q(float[] fArr) {
        return (m43472v(fArr) + m43471u(fArr)) / 2.0f;
    }

    /* renamed from: r */
    static float m43468r(float[] fArr) {
        return (m43466p(fArr) + m43473w(fArr)) / 2.0f;
    }

    /* renamed from: s */
    static Rect m43469s(float[] fArr, int i, int i2, boolean z, int i3, int i4) {
        Rect rect = new Rect(Math.round(Math.max(Utils.FLOAT_EPSILON, m43471u(fArr))), Math.round(Math.max(Utils.FLOAT_EPSILON, m43473w(fArr))), Math.round(Math.min((float) i, m43472v(fArr))), Math.round(Math.min((float) i2, m43466p(fArr))));
        if (z) {
            m43464n(rect, i3, i4);
        }
        return rect;
    }

    /* renamed from: t */
    static float m43470t(float[] fArr) {
        return m43466p(fArr) - m43473w(fArr);
    }

    /* renamed from: u */
    static float m43471u(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    /* renamed from: v */
    static float m43472v(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    /* renamed from: w */
    static float m43473w(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    /* renamed from: x */
    static float m43474x(float[] fArr) {
        return m43472v(fArr) - m43471u(fArr);
    }

    /* renamed from: y */
    static Bitmap m43475y(Bitmap bitmap, int i, int i2, CropImageView.C11856j jVar) {
        Bitmap bitmap2;
        if (i > 0 && i2 > 0) {
            try {
                CropImageView.C11856j jVar2 = CropImageView.C11856j.RESIZE_FIT;
                if (jVar == jVar2 || jVar == CropImageView.C11856j.RESIZE_INSIDE || jVar == CropImageView.C11856j.RESIZE_EXACT) {
                    if (jVar == CropImageView.C11856j.RESIZE_EXACT) {
                        bitmap2 = Bitmap.createScaledBitmap(bitmap, i, i2, false);
                    } else {
                        float width = (float) bitmap.getWidth();
                        float height = (float) bitmap.getHeight();
                        float max = Math.max(width / ((float) i), height / ((float) i2));
                        if (max <= 1.0f) {
                            if (jVar != jVar2) {
                                bitmap2 = null;
                            }
                        }
                        bitmap2 = Bitmap.createScaledBitmap(bitmap, (int) (width / max), (int) (height / max), false);
                    }
                    if (bitmap2 != null) {
                        if (bitmap2 != bitmap) {
                            bitmap.recycle();
                        }
                        return bitmap2;
                    }
                }
            } catch (Exception e) {
                Log.w("AIC", "Failed to resize cropped image, return bitmap before resize", e);
            }
        }
        return bitmap;
    }

    /* renamed from: z */
    private static Bitmap m43476z(Bitmap bitmap, int i, boolean z, boolean z2) {
        float f;
        if (i <= 0 && !z && !z2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i);
        float f2 = -1.0f;
        if (z) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        if (!z2) {
            f2 = 1.0f;
        }
        matrix.postScale(f, f2);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        if (createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }
}

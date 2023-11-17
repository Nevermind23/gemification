package g91;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.core.content.C0781h;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView;

/* renamed from: g91.c0 */
public abstract class C32295c0 {
    /* renamed from: a */
    private static Bitmap m95129a(String str, Bitmap bitmap, int i) {
        ExifInterface exifInterface = new ExifInterface(str);
        if (i < 0) {
            int attributeInt = exifInterface.getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                i = SubsamplingScaleImageView.ORIENTATION_180;
            } else if (attributeInt == 6) {
                i = 90;
            } else if (attributeInt != 8) {
                i = 0;
            } else {
                i = SubsamplingScaleImageView.ORIENTATION_270;
            }
        }
        if (i <= 1) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate((float) i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* renamed from: b */
    private static File m95130b(File file, Bitmap bitmap, int i, Activity activity) {
        Bitmap bitmap2;
        if (bitmap == null) {
            bitmap2 = m95129a(file.getAbsolutePath(), m95131c((Uri) null, file, activity), -1);
        } else {
            C32285a0.m95084c(file, bitmap, 100);
            bitmap2 = m95129a(file.getAbsolutePath(), bitmap, i);
        }
        File b = C32285a0.m95083b(file, bitmap2);
        if (bitmap != null) {
            bitmap.recycle();
        }
        bitmap2.recycle();
        return b;
    }

    /* renamed from: c */
    public static Bitmap m95131c(Uri uri, File file, Activity activity) {
        InputStream inputStream;
        int i;
        double d;
        InputStream inputStream2;
        if (uri != null) {
            inputStream = activity.getContentResolver().openInputStream(uri);
        } else {
            inputStream = new FileInputStream(file);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        BitmapFactory.decodeStream(inputStream, (Rect) null, options);
        if (inputStream != null) {
            inputStream.close();
        }
        int i2 = options.outWidth;
        if (i2 == -1 || (i = options.outHeight) == -1) {
            return null;
        }
        if (i > i2) {
            i2 = i;
        }
        if (i2 > C32355x0.m95521l(activity)) {
            d = (double) (i2 / C32355x0.m95521l(activity));
        } else {
            d = 1.0d;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = m95133e(d);
        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
        if (uri != null) {
            inputStream2 = activity.getContentResolver().openInputStream(uri);
        } else {
            inputStream2 = new FileInputStream(file);
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream2, (Rect) null, options2);
        if (inputStream2 != null) {
            inputStream2.close();
        }
        return decodeStream;
    }

    /* renamed from: d */
    private static Cursor m95132d(Uri uri, Activity activity) {
        Cursor query = activity.getContentResolver().query(uri, new String[]{"orientation"}, (String) null, (String[]) null, (String) null);
        if (query != null && query.getCount() != 1) {
            return null;
        }
        query.moveToFirst();
        return query;
    }

    /* renamed from: e */
    private static int m95133e(double d) {
        int highestOneBit = Integer.highestOneBit((int) Math.floor(d));
        if (highestOneBit == 0) {
            return 1;
        }
        return highestOneBit;
    }

    /* renamed from: f */
    public static File m95134f(Activity activity) {
        return new File(activity.getExternalCacheDir() + "/photo.jpg");
    }

    /* renamed from: g */
    public static String m95135g(Activity activity) {
        File f = m95134f(activity);
        try {
            f = m95130b(f, (Bitmap) null, -1, activity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f.getAbsolutePath();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m95136h(android.content.Intent r4, android.app.Activity r5) {
        /*
            r0 = 0
            android.net.Uri r1 = r4.getData()     // Catch:{ Exception -> 0x0024 }
            android.graphics.Bitmap r1 = m95131c(r1, r0, r5)     // Catch:{ Exception -> 0x0024 }
            android.net.Uri r4 = r4.getData()     // Catch:{ Exception -> 0x0024 }
            android.database.Cursor r4 = m95132d(r4, r5)     // Catch:{ Exception -> 0x0024 }
            if (r4 == 0) goto L_0x0028
            r2 = 0
            int r2 = r4.getInt(r2)     // Catch:{ Exception -> 0x0024 }
            java.io.File r3 = m95134f(r5)     // Catch:{ Exception -> 0x0024 }
            r4.close()     // Catch:{ Exception -> 0x0024 }
            java.io.File r4 = m95130b(r3, r1, r2, r5)     // Catch:{ Exception -> 0x0024 }
            goto L_0x0029
        L_0x0024:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0028:
            r4 = r0
        L_0x0029:
            if (r4 != 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            java.lang.String r0 = r4.getAbsolutePath()
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g91.C32295c0.m95136h(android.content.Intent, android.app.Activity):java.lang.String");
    }

    /* renamed from: i */
    public static void m95137i(Activity activity, String str) {
        if (!C32359z0.m95565e0(activity, "android.permission.CAMERA")) {
            new C32330r0(activity).mo72836w(1040, str);
        } else {
            m95139k(activity);
        }
    }

    /* renamed from: j */
    public static void m95138j(Activity activity) {
        m95140l(activity);
    }

    /* renamed from: k */
    public static void m95139k(Activity activity) {
        File f = m95134f(activity);
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        List<ResolveInfo> queryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 65536);
        Uri f2 = C0781h.m2933f(activity, "ge.bog.mobilebank.fileprovider", f);
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            activity.grantUriPermission(resolveInfo.activityInfo.packageName, f2, 3);
        }
        intent.putExtra("output", f2);
        intent.putExtra("path", f.getAbsolutePath());
        activity.startActivityForResult(intent, 139);
    }

    /* renamed from: l */
    public static void m95140l(Activity activity) {
        activity.startActivityForResult(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), 140);
    }
}

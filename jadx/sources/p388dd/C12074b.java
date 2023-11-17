package p388dd;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.C41536l;

/* renamed from: dd.b */
public final class C12074b {

    /* renamed from: a */
    public static final C12074b f35484a = new C12074b();

    private C12074b() {
    }

    /* renamed from: a */
    public final String mo32219a(Bitmap bitmap, int i) {
        C41536l.m120489i(bitmap, "bitmap");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C41536l.m120488h(byteArray, "byteArrayOutputStream.toByteArray()");
        BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        String encodeToString = Base64.encodeToString(byteArray, 0);
        C41536l.m120488h(encodeToString, "encodeToString(byteArray, Base64.DEFAULT)");
        return encodeToString;
    }

    /* renamed from: b */
    public final File mo32220b(Context context, Bitmap bitmap, int i) {
        C41536l.m120489i(context, "context");
        if (bitmap == null) {
            return null;
        }
        File file = new File(context.getCacheDir(), "allow_it.jpg");
        file.createNewFile();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(byteArray);
        fileOutputStream.flush();
        fileOutputStream.close();
        return file;
    }

    /* renamed from: c */
    public final Bitmap mo32221c(Bitmap bitmap, float f) {
        if (bitmap == null) {
            return bitmap;
        }
        try {
            float width = ((float) bitmap.getWidth()) / f;
            return Bitmap.createBitmap(bitmap, 0, (int) ((((float) bitmap.getHeight()) - width) / ((float) 2)), bitmap.getWidth(), (int) width);
        } catch (Exception unused) {
            return bitmap;
        }
    }

    /* renamed from: d */
    public final Bitmap mo32222d(Bitmap bitmap, float f) {
        if (bitmap != null) {
            try {
                float height = ((float) bitmap.getHeight()) / f;
                float width = ((float) bitmap.getWidth()) * f;
                if (f < 1.0f) {
                    return Bitmap.createBitmap(bitmap, 0, (int) ((((float) bitmap.getHeight()) - width) / ((float) 2)), bitmap.getWidth(), (int) width);
                }
                return Bitmap.createBitmap(bitmap, (int) ((((float) bitmap.getWidth()) - height) / ((float) 2)), 0, (int) height, bitmap.getHeight());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return bitmap;
    }

    /* renamed from: e */
    public final Bitmap mo32223e(Bitmap bitmap, int i) {
        if (i <= 0 || bitmap == null) {
            return bitmap;
        }
        return Bitmap.createScaledBitmap(bitmap, i, (int) (((float) i) / (((float) bitmap.getWidth()) / ((float) bitmap.getHeight()))), true);
    }

    /* renamed from: f */
    public final Bitmap mo32224f(Bitmap bitmap, float f) {
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* renamed from: g */
    public final Bitmap mo32225g(Image image) {
        C41536l.m120489i(image, "image");
        try {
            Image.Plane[] planes = image.getPlanes();
            ByteBuffer buffer = planes[0].getBuffer();
            ByteBuffer buffer2 = planes[1].getBuffer();
            ByteBuffer buffer3 = planes[2].getBuffer();
            int remaining = buffer.remaining();
            int remaining2 = buffer2.remaining();
            int remaining3 = buffer3.remaining();
            byte[] bArr = new byte[(remaining + remaining2 + remaining3)];
            buffer.get(bArr, 0, remaining);
            buffer3.get(bArr, remaining, remaining3);
            buffer2.get(bArr, remaining + remaining3, remaining2);
            YuvImage yuvImage = new YuvImage(bArr, 17, image.getWidth(), image.getHeight(), (int[]) null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            yuvImage.compressToJpeg(new Rect(0, 0, yuvImage.getWidth(), yuvImage.getHeight()), 75, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C41536l.m120488h(byteArray, "out.toByteArray()");
            return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        } catch (Exception unused) {
            return null;
        }
    }
}

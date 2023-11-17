package p416fd;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import com.google.zxing.C5762k;
import com.google.zxing.C5766o;
import java.io.ByteArrayOutputStream;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView;

/* renamed from: fd.q */
public class C12862q {

    /* renamed from: a */
    private C12857m f38004a;

    /* renamed from: b */
    private int f38005b;

    /* renamed from: c */
    private int f38006c;

    /* renamed from: d */
    private Rect f38007d;

    /* renamed from: e */
    private int f38008e = 1;

    /* renamed from: f */
    private boolean f38009f;

    public C12862q(byte[] bArr, int i, int i2, int i3, int i4) {
        this.f38004a = new C12857m(bArr, i, i2);
        this.f38006c = i4;
        this.f38005b = i3;
        if (i * i2 > bArr.length) {
            throw new IllegalArgumentException("Image data does not match the resolution. " + i + "x" + i2 + " > " + bArr.length);
        }
    }

    /* renamed from: a */
    public C5762k mo33537a() {
        C12857m a = this.f38004a.mo33525h(this.f38006c).mo33521a(this.f38007d, this.f38008e);
        return new C5762k(a.mo33522b(), a.mo33524d(), a.mo33523c(), 0, 0, a.mo33524d(), a.mo33523c(), false);
    }

    /* renamed from: b */
    public Bitmap mo33538b(Rect rect, int i) {
        if (rect == null) {
            rect = new Rect(0, 0, this.f38004a.mo33524d(), this.f38004a.mo33523c());
        } else if (mo33539c()) {
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        }
        YuvImage yuvImage = new YuvImage(this.f38004a.mo33522b(), this.f38005b, this.f38004a.mo33524d(), this.f38004a.mo33523c(), (int[]) null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        if (this.f38006c == 0) {
            return decodeByteArray;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate((float) this.f38006c);
        return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
    }

    /* renamed from: c */
    public boolean mo33539c() {
        return this.f38006c % SubsamplingScaleImageView.ORIENTATION_180 != 0;
    }

    /* renamed from: d */
    public void mo33540d(Rect rect) {
        this.f38007d = rect;
    }

    /* renamed from: e */
    public void mo33541e(boolean z) {
        this.f38009f = z;
    }

    /* renamed from: f */
    public C5766o mo33542f(C5766o oVar) {
        float c = (oVar.mo18901c() * ((float) this.f38008e)) + ((float) this.f38007d.left);
        float d = (oVar.mo18902d() * ((float) this.f38008e)) + ((float) this.f38007d.top);
        if (this.f38009f) {
            c = ((float) this.f38004a.mo33524d()) - c;
        }
        return new C5766o(c, d);
    }
}

package p333z3;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import p166m3.C7088h;
import p192o3.C7430c;
import p283v3.C8699b;

/* renamed from: z3.a */
public class C9199a implements C9203e {

    /* renamed from: a */
    private final Bitmap.CompressFormat f25615a;

    /* renamed from: b */
    private final int f25616b;

    public C9199a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    /* renamed from: a */
    public C7430c mo24838a(C7430c cVar, C7088h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) cVar.get()).compress(this.f25615a, this.f25616b, byteArrayOutputStream);
        cVar.recycle();
        return new C8699b(byteArrayOutputStream.toByteArray());
    }

    public C9199a(Bitmap.CompressFormat compressFormat, int i) {
        this.f25615a = compressFormat;
        this.f25616b = i;
    }
}

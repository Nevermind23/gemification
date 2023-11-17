package gb1;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import kotlin.jvm.internal.C41536l;

/* renamed from: gb1.a */
public final class C32363a implements C32364b {

    /* renamed from: a */
    public static final C32363a f79810a = new C32363a();

    private C32363a() {
    }

    /* renamed from: a */
    public void mo72864a(ImageView imageView, Object obj, int i) {
        C41536l.m120489i(imageView, "imageView");
        if (obj instanceof Bitmap) {
            ((C2394j) ((C2394j) ((C2394j) C2379b.m9211u(imageView).mo7750s((Bitmap) obj).mo7220c0(i)).mo7232j(i)).mo7235l()).mo7718L0(imageView);
        }
    }
}

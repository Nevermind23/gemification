package gb1;

import android.widget.ImageView;

/* renamed from: gb1.b */
public interface C32364b {

    /* renamed from: gb1.b$a */
    public static final class C32365a {
        /* renamed from: a */
        public static /* synthetic */ void m95602a(C32364b bVar, ImageView imageView, Object obj, int i, int i2, Object obj2) {
            if (obj2 == null) {
                if ((i2 & 4) != 0) {
                    i = 0;
                }
                bVar.mo72864a(imageView, obj, i);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadImage");
        }
    }

    /* renamed from: a */
    void mo72864a(ImageView imageView, Object obj, int i);
}

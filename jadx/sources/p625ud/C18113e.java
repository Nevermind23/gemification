package p625ud;

import android.media.Image;

/* renamed from: ud.e */
public class C18113e extends C18111c {
    public C18113e(int i) {
        super(i, Image.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Image mo45784g(Image image) {
        throw new RuntimeException("Cannot freeze() an Image Frame. Please consider using the frame synchronously in your process() method, which also gives better performance.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo45785h(Image image, boolean z) {
        try {
            image.close();
        } catch (Exception unused) {
        }
    }
}

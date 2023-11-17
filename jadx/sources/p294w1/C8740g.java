package p294w1;

import androidx.collection.LruCache;
import com.airbnb.lottie.C2325h;

/* renamed from: w1.g */
public class C8740g {

    /* renamed from: b */
    private static final C8740g f24596b = new C8740g();

    /* renamed from: a */
    private final LruCache f24597a = new LruCache(20);

    C8740g() {
    }

    /* renamed from: b */
    public static C8740g m32531b() {
        return f24596b;
    }

    /* renamed from: a */
    public C2325h mo24145a(String str) {
        if (str == null) {
            return null;
        }
        return (C2325h) this.f24597a.get(str);
    }

    /* renamed from: c */
    public void mo24146c(String str, C2325h hVar) {
        if (str != null) {
            this.f24597a.put(str, hVar);
        }
    }
}

package th0;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import p086g1.C6201a;

/* renamed from: th0.y0 */
public final class C28437y0 implements C6201a {

    /* renamed from: d */
    private final ShimmerFrameLayout f72236d;

    private C28437y0(ShimmerFrameLayout shimmerFrameLayout) {
        this.f72236d = shimmerFrameLayout;
    }

    /* renamed from: a */
    public static C28437y0 m87271a(View view) {
        if (view != null) {
            return new C28437y0((ShimmerFrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public ShimmerFrameLayout mo3946b() {
        return this.f72236d;
    }
}

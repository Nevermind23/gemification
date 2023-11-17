package lj0;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bumptech.glide.C2394j;
import com.bumptech.glide.load.resource.bitmap.C2507h0;
import com.bumptech.glide.load.resource.bitmap.C2520l;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p035c4.C2256h;
import p341ge.bog.designsystem.components.common.Image;
import p642vh.C18368l;
import ue1.C43075l;

/* renamed from: lj0.d */
public abstract class C26041d {

    /* renamed from: lj0.d$a */
    static final class C26042a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ int f66136d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26042a(int i) {
            super(1);
            this.f66136d = i;
        }

        /* renamed from: a */
        public final C2394j invoke(C2394j jVar) {
            C41536l.m120489i(jVar, "$this$setImage");
            C2394j A0 = jVar.mo7215a(new C2256h().mo7254w0(new C2520l(), new C2507h0(C18368l.m62762k(this.f66136d))));
            C41536l.m120488h(A0, "apply(\n            Reque…)\n            )\n        )");
            return A0;
        }
    }

    /* renamed from: a */
    public static final void m81680a(ImageView imageView, Image image, int i) {
        C41536l.m120489i(imageView, "<this>");
        C41536l.m120489i(image, "image");
        C18368l.m62777z(imageView, image, new C26042a(i));
    }

    /* renamed from: b */
    public static final void m81681b(FrameLayout frameLayout, float f) {
        C41536l.m120489i(frameLayout, "<this>");
        frameLayout.setOutlineProvider(new C26040c(0, 0, f, 3, (DefaultConstructorMarker) null));
        frameLayout.setClipToOutline(true);
    }

    /* renamed from: c */
    public static /* synthetic */ void m81682c(FrameLayout frameLayout, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 50.0f;
        }
        m81681b(frameLayout, f);
    }
}

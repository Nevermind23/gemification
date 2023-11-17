package p341ge.bog.designsystem.components.thumbnailiconbadge;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.C0767a;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import com.bumptech.glide.load.resource.bitmap.C2507h0;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p035c4.C2247a;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C9930h6;
import p601sg.C17779d;
import p601sg.C17780e;
import p601sg.C17786k;
import p601sg.C17787l;
import p604sj.C17812a;
import p604sj.C17813b;
import p604sj.C17815c;
import p642vh.C18368l;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.thumbnailiconbadge.ThumbnailIconBadgeView */
public final class ThumbnailIconBadgeView extends LayerView {

    /* renamed from: d */
    private final C9930h6 f40501d;

    /* renamed from: e */
    private C17815c f40502e;

    /* renamed from: ge.bog.designsystem.components.thumbnailiconbadge.ThumbnailIconBadgeView$a */
    static final class C13553a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ int f40503d;

        /* renamed from: e */
        final /* synthetic */ C2394j f40504e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13553a(int i, C2394j jVar) {
            super(1);
            this.f40503d = i;
            this.f40504e = jVar;
        }

        /* renamed from: a */
        public final C2394j invoke(C2394j jVar) {
            C41536l.m120489i(jVar, "$this$setImage");
            C2394j b1 = ((C2394j) jVar.mo7252u0(new C2507h0(this.f40503d))).mo7730b1(this.f40504e);
            C41536l.m120488h(b1, "this.transform(RoundedCo…(thumbnailTransformation)");
            return b1;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ThumbnailIconBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: a */
    private final void m50802a(Image image) {
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C17779d.layer_radius_2);
        C2247a u0 = C2379b.m9210t(getContext()).mo7755w(Integer.valueOf(C17780e.f49662k1)).mo7252u0(new C2507h0(dimensionPixelSize));
        C41536l.m120488h(u0, "with(context)\n          …dedCorners(cornerRadius))");
        AppCompatImageView appCompatImageView = this.f40501d.f27083e;
        C41536l.m120488h(appCompatImageView, "binding.badgeImage");
        C18368l.m62777z(appCompatImageView, image, new C13553a(dimensionPixelSize, (C2394j) u0));
    }

    public final Drawable getBadgeBackground() {
        return getBackground();
    }

    public final Image getBadgeImage() {
        Drawable drawable = this.f40501d.f27083e.getDrawable();
        C41536l.m120488h(drawable, "binding.badgeImage.drawable");
        return new Image.Drawable(drawable, (Boolean) null, 2, (DefaultConstructorMarker) null);
    }

    public final C17813b getBadgeSize() {
        return this.f40502e.mo45403b();
    }

    public final C17815c getBadgeType() {
        return this.f40502e;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C17812a a = this.f40502e.mo45402a();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getContext().getResources().getDimensionPixelSize(a.mo45397b()), 1073741824);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(a.mo45396a());
        AppCompatImageView appCompatImageView = this.f40501d.f27083e;
        C41536l.m120488h(appCompatImageView, "binding.badgeImage");
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = dimensionPixelSize;
            layoutParams.width = dimensionPixelSize;
            appCompatImageView.setLayoutParams(layoutParams);
            super.onMeasure(makeMeasureSpec, makeMeasureSpec);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void setBadgeBackground(Drawable drawable) {
        setBackground(drawable);
    }

    public final void setBadgeImage(Image image) {
        m50802a(image);
    }

    public final void setBadgeSize(C17813b bVar) {
        C41536l.m120489i(bVar, C11755a.C11756a.f34100b);
        this.f40502e.mo45404c(bVar);
        requestLayout();
    }

    public final void setBadgeType(C17815c cVar) {
        C41536l.m120489i(cVar, C11755a.C11756a.f34100b);
        C17813b badgeSize = getBadgeSize();
        this.f40502e = cVar;
        cVar.mo45404c(badgeSize);
        requestLayout();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThumbnailIconBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThumbnailIconBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C9930h6 c = C9930h6.m36425c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(\n        LayoutI…text),\n        this\n    )");
        this.f40501d = c;
        C17815c cVar = C17815c.C17819c.f50704b;
        this.f40502e = cVar;
        setLayerStyle(C17786k.LayerRadiusCircleShadow0);
        setBackground(C0767a.m2895e(context, C17780e.shape_action_badge_thumbnail_badge));
        setBadgeImage(new Image.Resource(C17780e.f49662k1, (Boolean) null, 2, (DefaultConstructorMarker) null));
        int[] iArr = C17787l.f49886D0;
        C41536l.m120488h(iArr, "BadgeView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        C17815c a = C17815c.f50700a.mo45405a(obtainStyledAttributes.getInt(C17787l.f49916F0, 0));
        setBadgeType(a != null ? a : cVar);
        C17813b a2 = C17813b.f50695d.mo45401a(obtainStyledAttributes.getInt(C17787l.f49901E0, 0));
        setBadgeSize(a2 == null ? C17813b.SMALL : a2);
        obtainStyledAttributes.recycle();
    }
}

package p341ge.bog.designsystem.components.storythumbnail;

import af1.C40303i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p045d.C5769a;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.storythumbnail.model.StoryThumbnailData;
import p352ak.C9929h5;
import p601sg.C17780e;
import p601sg.C17787l;
import p642vh.C18368l;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.storythumbnail.StoryThumbnail */
public final class StoryThumbnail extends FrameLayout {

    /* renamed from: f */
    static final /* synthetic */ C40303i[] f40366f = {C41520a0.m120439e(new C41539o(StoryThumbnail.class, "coverData", "getCoverData()Lge/bog/designsystem/components/storythumbnail/model/StoryThumbnailData;", 0))};

    /* renamed from: d */
    private final C9929h5 f40367d;

    /* renamed from: e */
    private final C41555e f40368e;

    /* renamed from: ge.bog.designsystem.components.storythumbnail.StoryThumbnail$a */
    public static final class C13521a extends C41553c {

        /* renamed from: a */
        final /* synthetic */ StoryThumbnail f40369a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13521a(Object obj, StoryThumbnail storyThumbnail) {
            super(obj);
            this.f40369a = storyThumbnail;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            StoryThumbnailData storyThumbnailData = (StoryThumbnailData) obj;
            this.f40369a.m50718b((StoryThumbnailData) obj2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StoryThumbnail(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m50718b(StoryThumbnailData storyThumbnailData) {
        int i;
        boolean z;
        ColorStateList colorStateList;
        LottieAnimationView lottieAnimationView = this.f40367d.f27081i;
        C41536l.m120488h(lottieAnimationView, "binding.thumbnail");
        Image f = storyThumbnailData.mo36806f();
        if (f == null) {
            f = new Image.Resource(C17780e.gradient_base_solid_second, (Boolean) null, 2, (DefaultConstructorMarker) null);
        }
        C18368l.m62746A(lottieAnimationView, f, (C43075l) null, 2, (Object) null);
        Context context = getContext();
        if (storyThumbnailData.mo36807g()) {
            i = C17780e.rounded_stroke_radius_16_invert_component_50_2dp;
        } else {
            i = C17780e.rounded_stroke_radius_16_primary_500_2dp;
        }
        setForeground(C5769a.m23210b(context, i));
        this.f40367d.f27080h.setText(storyThumbnailData.mo36808h());
        AppCompatImageView appCompatImageView = this.f40367d.f27079g;
        C41536l.m120488h(appCompatImageView, "binding.gradient");
        String h = storyThumbnailData.mo36808h();
        boolean z2 = true;
        if (h == null || C40439w.m117118v(h)) {
            z = true;
        } else {
            z = false;
        }
        C18368l.m62751F(appCompatImageView, !z, false, 2, (Object) null);
        AppCompatImageView appCompatImageView2 = this.f40367d.f27078f;
        C41536l.m120488h(appCompatImageView2, "binding.badgeIcon");
        C18368l.m62746A(appCompatImageView2, storyThumbnailData.mo36802d(), (C43075l) null, 2, (Object) null);
        AppCompatImageView appCompatImageView3 = this.f40367d.f27078f;
        Color e = storyThumbnailData.mo36804e();
        if (e != null) {
            Context context2 = getContext();
            C41536l.m120488h(context2, "context");
            colorStateList = ColorStateList.valueOf(e.mo35260a(context2));
        } else {
            colorStateList = null;
        }
        appCompatImageView3.setImageTintList(colorStateList);
        LayerView layerView = this.f40367d.f27077e;
        C41536l.m120488h(layerView, "binding.badgeContainer");
        if (storyThumbnailData.mo36802d() == null) {
            z2 = false;
        }
        C18368l.m62751F(layerView, z2, false, 2, (Object) null);
    }

    private final StoryThumbnailData getCoverData() {
        return (StoryThumbnailData) this.f40368e.getValue(this, f40366f[0]);
    }

    private final void setCoverData(StoryThumbnailData storyThumbnailData) {
        this.f40368e.setValue(this, f40366f[0], storyThumbnailData);
    }

    public final void setBadgeIcon(Image image) {
        setCoverData(StoryThumbnailData.m50719b(getCoverData(), (String) null, (Image) null, false, image, (Color) null, 23, (Object) null));
    }

    public final void setBadgeTint(Color color) {
        setCoverData(StoryThumbnailData.m50719b(getCoverData(), (String) null, (Image) null, false, (Image) null, color, 15, (Object) null));
    }

    public final void setData(StoryThumbnailData storyThumbnailData) {
        C41536l.m120489i(storyThumbnailData, "data");
        setCoverData(storyThumbnailData);
    }

    public final void setImage(Image image) {
        setCoverData(StoryThumbnailData.m50719b(getCoverData(), (String) null, image, false, (Image) null, (Color) null, 29, (Object) null));
    }

    public final void setIsSeen(boolean z) {
        setCoverData(StoryThumbnailData.m50719b(getCoverData(), (String) null, (Image) null, z, (Image) null, (Color) null, 27, (Object) null));
    }

    public final void setText(String str) {
        setCoverData(StoryThumbnailData.m50719b(getCoverData(), str, (Image) null, false, (Image) null, (Color) null, 30, (Object) null));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoryThumbnail(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryThumbnail(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Image.Drawable drawable;
        C41536l.m120489i(context, "context");
        C9929h5 d = C9929h5.m36421d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f40367d = d;
        C41551a aVar = C41551a.f97718a;
        Image.Drawable drawable2 = null;
        this.f40368e = new C13521a(new StoryThumbnailData((String) null, (Image) null, false, (Image) null, (Color) null, 31, (DefaultConstructorMarker) null), this);
        int[] iArr = C17787l.f49972Ib;
        C41536l.m120488h(iArr, "StoryThumbnail");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        Drawable drawable3 = obtainStyledAttributes.getDrawable(C17787l.f50032Mb);
        if (drawable3 != null) {
            C41536l.m120488h(drawable3, "getDrawable(R.styleable.…oryThumbnail_story_image)");
            drawable = new Image.Drawable(drawable3, (Boolean) null, 2, (DefaultConstructorMarker) null);
        } else {
            drawable = null;
        }
        setImage(drawable);
        setText(obtainStyledAttributes.getString(C17787l.f50047Nb));
        int i2 = C17787l.f50017Lb;
        if (obtainStyledAttributes.hasValue(i2)) {
            setIsSeen(obtainStyledAttributes.getBoolean(i2, false));
        }
        Integer f = C18368l.m62757f(obtainStyledAttributes, C17787l.f50002Kb, 0, 2, (Object) null);
        setBadgeTint(f != null ? new Color.Raw(f.intValue()) : null);
        Drawable drawable4 = obtainStyledAttributes.getDrawable(C17787l.f49987Jb);
        if (drawable4 != null) {
            C41536l.m120488h(drawable4, "getDrawable(R.styleable.…umbnail_cover_badge_icon)");
            drawable2 = new Image.Drawable(drawable4, (Boolean) null, 2, (DefaultConstructorMarker) null);
        }
        setBadgeIcon(drawable2);
        obtainStyledAttributes.recycle();
    }
}

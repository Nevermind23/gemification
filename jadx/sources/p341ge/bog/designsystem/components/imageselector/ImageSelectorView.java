package p341ge.bog.designsystem.components.imageselector;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p045d.C5769a;
import p341ge.bog.designsystem.components.common.Image;
import p352ak.C9959l3;
import p352ak.C9967m3;
import p491ki.C16425b;
import p491ki.C16433d;
import p601sg.C17780e;
import p601sg.C17787l;

/* renamed from: ge.bog.designsystem.components.imageselector.ImageSelectorView */
public final class ImageSelectorView extends FrameLayout {

    /* renamed from: d */
    private C16425b f39571d;

    /* renamed from: e */
    private String f39572e;

    /* renamed from: f */
    private Drawable f39573f;

    /* renamed from: ge.bog.designsystem.components.imageselector.ImageSelectorView$a */
    public interface C13344a {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ImageSelectorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m50229b(ImageSelectorView imageSelectorView, boolean z) {
        C41536l.m120489i(imageSelectorView, "this$0");
        imageSelectorView.getClass();
    }

    public static /* synthetic */ void getImageDrawable$annotations() {
    }

    public static /* synthetic */ void getImageUrl$annotations() {
    }

    public final boolean getChecked() {
        return this.f39571d.mo43548c();
    }

    public final Drawable getImageDrawable() {
        return this.f39573f;
    }

    public final String getImageUrl() {
        return this.f39572e;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f39571d.mo43552g(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f39571d.mo43550e(), 1073741824));
    }

    public final void setChecked(boolean z) {
        this.f39571d.mo43553h(z);
    }

    public final void setImage(Image image) {
        this.f39571d.mo43554i(image);
    }

    public final void setImageDrawable(Drawable drawable) {
        this.f39573f = drawable;
        Image.Drawable drawable2 = null;
        if (drawable != null) {
            drawable2 = new Image.Drawable(drawable, (Boolean) null, 2, (DefaultConstructorMarker) null);
        }
        setImage(drawable2);
    }

    public final void setImageUrl(String str) {
        Image.Url url;
        this.f39572e = str;
        if (str != null) {
            url = new Image.Url(str, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null);
        } else {
            url = null;
        }
        setImage(url);
    }

    public final void setOnSelectionChangeListener(C13344a aVar) {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImageSelectorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageSelectorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C16425b bVar;
        C41536l.m120489i(context, "context");
        C16433d dVar = new C16433d(this);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C17787l.f49951H5, 0, 0);
        try {
            LayoutInflater from = LayoutInflater.from(context);
            int i2 = obtainStyledAttributes.getInt(C17787l.f49966I5, 0);
            if (i2 == 0) {
                C9967m3 d = C9967m3.m36558d(from, this, true);
                C41536l.m120488h(d, "inflate(\n               …                        )");
                bVar = new C16425b.C16430e(d, dVar);
            } else if (i2 == 1) {
                C9959l3 d2 = C9959l3.m36527d(from, this, true);
                C41536l.m120488h(d2, "inflate(\n               …                        )");
                bVar = new C16425b.C16426a(d2, dVar);
            } else {
                throw new IllegalStateException("Unknown Selector type");
            }
            this.f39571d = bVar;
            int resourceId = obtainStyledAttributes.getResourceId(C17787l.f49981J5, C17780e.f49662k1);
            if (resourceId != 0 && !(this.f39571d instanceof C16425b.C16426a)) {
                setImageDrawable(C5769a.m23210b(context, resourceId));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}

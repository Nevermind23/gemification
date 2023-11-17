package p341ge.bog.designsystem.components.thumbnailpicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p045d.C5769a;
import p352ak.C9938i6;
import p352ak.C9946j6;
import p601sg.C17777b;
import p601sg.C17787l;
import p618tj.C17968a;
import p642vh.C18368l;

/* renamed from: ge.bog.designsystem.components.thumbnailpicker.ThumbnailPickerView */
public final class ThumbnailPickerView extends LinearLayout {

    /* renamed from: d */
    private C17968a f40505d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ThumbnailPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    public final int getBadgeCount() {
        return this.f40505d.mo45644a();
    }

    public final boolean getChevronVisible() {
        return this.f40505d.mo45646c();
    }

    public final Drawable getIconDrawable() {
        return this.f40505d.mo45649f();
    }

    public final ColorStateList getIconTint() {
        return this.f40505d.mo45650g();
    }

    public final List<String> getIconUrls() {
        return this.f40505d.mo45651h();
    }

    public final int getStrokeColor() {
        return this.f40505d.mo45652i();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f40505d.mo45653j() != -1) {
            i = View.MeasureSpec.makeMeasureSpec(this.f40505d.mo45653j(), 1073741824);
        }
        if (this.f40505d.mo45653j() != -1) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.f40505d.mo45648e(), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public final void setBadgeCount(int i) {
        this.f40505d.mo45654k(i);
    }

    public final void setChevronVisible(boolean z) {
        this.f40505d.mo45656m(z);
    }

    public final void setIconDrawable(Drawable drawable) {
        this.f40505d.mo45657n(drawable);
    }

    public final void setIconTint(ColorStateList colorStateList) {
        this.f40505d.mo45658o(colorStateList);
    }

    public final void setIconUrls(List<String> list) {
        this.f40505d.mo45659p(list);
    }

    public final void setStrokeColor(int i) {
        this.f40505d.mo45661r(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThumbnailPickerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThumbnailPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C17968a aVar;
        C41536l.m120489i(context, "context");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C17787l.f50404kd, 0, 0);
        try {
            LayoutInflater from = LayoutInflater.from(context);
            int i2 = obtainStyledAttributes.getInt(C17787l.f50468od, 0);
            if (i2 == 0) {
                C9938i6 c = C9938i6.m36452c(from, this);
                C41536l.m120488h(c, "inflate(\n               …                        )");
                aVar = new C17968a.C17973b(c);
            } else if (i2 == 1) {
                C9946j6 c2 = C9946j6.m36480c(from, this);
                C41536l.m120488h(c2, "inflate(\n               …                        )");
                aVar = new C17968a.C17969a(c2);
            } else {
                throw new IllegalStateException("Unknown Picker type");
            }
            this.f40505d = aVar;
            setChevronVisible(obtainStyledAttributes.getBoolean(C17787l.f50420ld, false));
            setStrokeColor(obtainStyledAttributes.getColor(C17787l.f50484pd, C18368l.m62755d(context, C17777b.f49596k)));
            int resourceId = obtainStyledAttributes.getResourceId(C17787l.f50452nd, 0);
            if (resourceId != 0) {
                setIconTint(C5769a.m23209a(context, resourceId));
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(C17787l.f50436md, 0);
            if (resourceId2 != 0) {
                setIconDrawable(C5769a.m23210b(context, resourceId2));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}

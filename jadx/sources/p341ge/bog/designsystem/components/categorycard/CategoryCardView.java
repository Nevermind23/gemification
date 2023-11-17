package p341ge.bog.designsystem.components.categorycard;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.core.content.C0767a;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C9886c2;
import p352ak.C9894d2;
import p601sg.C17778c;
import p601sg.C17780e;
import p601sg.C17786k;
import p601sg.C17787l;
import p602sh.C17789a;

/* renamed from: ge.bog.designsystem.components.categorycard.CategoryCardView */
public final class CategoryCardView extends LayerView {

    /* renamed from: d */
    private C17789a f39009d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CategoryCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    public final Color getBackgroundColor() {
        return this.f39009d.mo45360c();
    }

    public final C17789a.C17790a getDrawableType() {
        return this.f39009d.mo45363f();
    }

    public final boolean getExpanded() {
        return this.f39009d.mo45364g();
    }

    public final Image getImage() {
        return this.f39009d.mo45365h();
    }

    public final Color getImageBackgroundColor() {
        return this.f39009d.mo45366i();
    }

    public final Color getImageTint() {
        return this.f39009d.mo45368k();
    }

    public final CharSequence getText() {
        return this.f39009d.mo45369l();
    }

    public final ColorStateList getTextColorStateList() {
        return this.f39009d.mo45370m();
    }

    public final void setBackgroundColor(Color color) {
        this.f39009d.mo45372o(color);
    }

    public final void setDrawableType(C17789a.C17790a aVar) {
        this.f39009d.mo45373p(aVar);
    }

    public final void setExpanded(boolean z) {
        this.f39009d.mo45374q(z);
    }

    public final void setImage(Image image) {
        this.f39009d.mo45375t(image);
    }

    public final void setImageBackgroundColor(Color color) {
        this.f39009d.mo45376u(color);
    }

    public final void setImageTint(Color color) {
        this.f39009d.mo45377v(color);
    }

    public final void setText(CharSequence charSequence) {
        this.f39009d.mo45379x(charSequence);
    }

    public final void setTextColorStateList(ColorStateList colorStateList) {
        C41536l.m120489i(colorStateList, C11755a.C11756a.f34100b);
        this.f39009d.mo45380y(colorStateList);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CategoryCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CategoryCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C17789a aVar;
        C41536l.m120489i(context, "context");
        setLayerStyle(C17786k.f49833r);
        setBackgroundResource(C17780e.selector_category_card);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C17787l.f50425m2, 0, 0);
        try {
            LayoutInflater from = LayoutInflater.from(context);
            int i2 = obtainStyledAttributes.getInt(C17787l.f50521s2, 0);
            if (i2 == 0) {
                C9886c2 d = C9886c2.m36262d(from, this, true);
                C41536l.m120488h(d, "inflate(\n               …                        )");
                aVar = new C17789a.C17792b(d);
            } else if (i2 == 1) {
                C9894d2 d2 = C9894d2.m36290d(from, this, true);
                C41536l.m120488h(d2, "inflate(\n               …                        )");
                aVar = new C17789a.C17793c(d2);
            } else {
                throw new IllegalStateException("Unknown Category Card type");
            }
            this.f39009d = aVar;
            setDrawableType(C17789a.C17790a.f50644e.mo45382a(obtainStyledAttributes.getInt(C17787l.f50489q2, 0)));
            setBackgroundColor(new Color.Resource(obtainStyledAttributes.getResourceId(C17787l.f50441n2, C17778c.f49633r)));
            String string = obtainStyledAttributes.getString(C17787l.f50505r2);
            setText(string == null ? "" : string);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(C17787l.f50568v2);
            if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(C0767a.m2893c(context, C17778c.f49637v));
                C41536l.m120488h(colorStateList, "valueOf(\n               …                        )");
            }
            setTextColorStateList(colorStateList);
            setExpanded(obtainStyledAttributes.getBoolean(C17787l.f50457o2, false));
            int resourceId = obtainStyledAttributes.getResourceId(C17787l.f50473p2, -1);
            Color.Resource resource = null;
            setImage(resourceId != -1 ? new Image.Resource(resourceId, (Boolean) null, 2, (DefaultConstructorMarker) null) : null);
            int resourceId2 = obtainStyledAttributes.getResourceId(C17787l.f50553u2, -1);
            setImageTint(resourceId2 != -1 ? new Color.Resource(resourceId2) : null);
            int resourceId3 = obtainStyledAttributes.getResourceId(C17787l.f50537t2, -1);
            if (resourceId3 != -1) {
                resource = new Color.Resource(resourceId3);
            } else if (getDrawableType() == C17789a.C17790a.ICON) {
                resource = new Color.Resource(C17778c.f49638w);
            }
            setImageBackgroundColor(resource);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}

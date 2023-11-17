package p341ge.bog.designsystem.components.fixedbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p601sg.C17777b;
import p601sg.C17779d;
import p601sg.C17786k;
import p642vh.C18368l;

/* renamed from: ge.bog.designsystem.components.fixedbutton.FixedButtonDescriptionView */
public final class FixedButtonDescriptionView extends LayerView {

    /* renamed from: d */
    private FixedButtonView f39512d;

    /* renamed from: e */
    private PageDescriptionView f39513e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FixedButtonDescriptionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    public final FixedButtonView getFixedButton() {
        return this.f39512d;
    }

    public final PageDescriptionView getPageDescription() {
        return this.f39513e;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FixedButtonDescriptionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FixedButtonDescriptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        setLayerStyle(C17786k.f49831n);
        setBackgroundColor(C18368l.m62755d(context, C17777b.f49596k));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.f39512d = new FixedButtonView(context, attributeSet, i);
        this.f39513e = new PageDescriptionView(context, attributeSet, i);
        linearLayout.setPadding(linearLayout.getPaddingLeft(), context.getResources().getDimensionPixelSize(C17779d.spacing_12), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        linearLayout.addView(this.f39513e);
        linearLayout.addView(this.f39512d);
        addView(linearLayout);
    }
}

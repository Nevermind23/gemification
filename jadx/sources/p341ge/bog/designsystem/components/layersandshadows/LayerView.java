package p341ge.bog.designsystem.components.layersandshadows;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p601sg.C17787l;
import p630ui.C18168a;

/* renamed from: ge.bog.designsystem.components.layersandshadows.LayerView */
public class LayerView extends FrameLayout {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    public final void setLayerStyle(int i) {
        if (i != 0) {
            Context context = getContext();
            C41536l.m120488h(context, "context");
            new C18168a(context, i).mo45824a(this);
            return;
        }
        C18168a.f51475c.mo45833a(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LayerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        int[] iArr = C17787l.f50286d7;
        C41536l.m120488h(iArr, "LayerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setLayerStyle(obtainStyledAttributes.getResourceId(C17787l.f50302e7, 0));
        obtainStyledAttributes.recycle();
    }
}

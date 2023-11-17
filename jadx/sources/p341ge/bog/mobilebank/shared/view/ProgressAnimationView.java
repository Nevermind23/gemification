package p341ge.bog.mobilebank.shared.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.core.content.C0767a;
import b31.C31127p;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import x11.C39768a;
import x11.C39773f;
import x11.C39774g;

/* renamed from: ge.bog.mobilebank.shared.view.ProgressAnimationView */
public final class ProgressAnimationView extends LayerView {

    /* renamed from: d */
    private final C31127p f83815d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProgressAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: a */
    public final void mo84643a(boolean z, boolean z2) {
        int i;
        if (z2) {
            i = C39773f.anim_retail_eng;
        } else if (z) {
            i = C39773f.anim_retail;
        } else {
            i = C39773f.anim_solo;
        }
        this.f83815d.f77360e.setAnimation(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProgressAnimationView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C31127p c = C31127p.m92628c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f83815d = c;
        setLayerStyle(C39774g.LayerRadius50Shadow30);
        setBackgroundColor(C0767a.m2893c(context, C39768a.f94463a));
    }
}

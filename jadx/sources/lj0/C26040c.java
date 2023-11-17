package lj0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: lj0.c */
public final class C26040c extends ViewOutlineProvider {

    /* renamed from: a */
    private final int f66133a;

    /* renamed from: b */
    private final int f66134b;

    /* renamed from: c */
    private final float f66135c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26040c(int i, int i2, float f, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, f);
    }

    public void getOutline(View view, Outline outline) {
        if (view != null && outline != null) {
            outline.setRoundRect(this.f66133a, this.f66134b, view.getWidth(), view.getHeight(), this.f66135c);
        }
    }

    public C26040c(int i, int i2, float f) {
        this.f66133a = i;
        this.f66134b = i2;
        this.f66135c = f;
    }
}

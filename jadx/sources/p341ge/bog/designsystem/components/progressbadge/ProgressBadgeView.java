package p341ge.bog.designsystem.components.progressbadge;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C10048x4;
import p408ej.C12476a;
import p601sg.C17778c;
import p601sg.C17786k;
import p601sg.C17787l;
import p642vh.C18365j0;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.progressbadge.ProgressBadgeView */
public final class ProgressBadgeView extends LayerView {

    /* renamed from: g */
    static final /* synthetic */ C40303i[] f40255g = {C41520a0.m120439e(new C41539o(ProgressBadgeView.class, "isProgressBarVisible", "isProgressBarVisible()Z", 0))};

    /* renamed from: d */
    private final C10048x4 f40256d;

    /* renamed from: e */
    private final C18365j0 f40257e;

    /* renamed from: f */
    private C12476a f40258f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProgressBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    private final void setProgressBarVisible(boolean z) {
        this.f40257e.mo46151c(this, f40255g[0], z);
    }

    public final C12476a getType() {
        return this.f40258f;
    }

    public final void setType(C12476a aVar) {
        C41536l.m120489i(aVar, C11755a.C11756a.f34100b);
        setProgressBarVisible(true);
        setBackgroundColor(C0767a.m2893c(getContext(), aVar.mo33091c()));
        this.f40258f = aVar;
    }

    public final void setWidth(int i) {
        View view = this.f40256d.f27753e;
        C41536l.m120488h(view, "binding.progressBadge");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProgressBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C12476a aVar;
        C41536l.m120489i(context, "context");
        C10048x4 c = C10048x4.m36856c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f40256d = c;
        View view = c.f27753e;
        C41536l.m120488h(view, "binding.progressBadge");
        this.f40257e = new C18365j0(view, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        this.f40258f = C12476a.NEUTRAL;
        setLayerStyle(C17786k.LayerRadius24Shadow0);
        setBackground(new ColorDrawable(C0767a.m2893c(context, C17778c.f49638w)));
        int[] iArr = C17787l.f50289da;
        C41536l.m120488h(iArr, "ProgressBadgeView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        int i2 = obtainStyledAttributes.getInt(C17787l.f50305ea, 1);
        C12476a[] values = C12476a.values();
        int length = values.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                aVar = null;
                break;
            }
            aVar = values[i3];
            if (aVar.mo33090b() == i2) {
                break;
            }
            i3++;
        }
        if (aVar != null) {
            setType(aVar);
        }
        obtainStyledAttributes.recycle();
    }
}

package p341ge.bog.designsystem.components.progressbadge;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p292w.C8720a;
import p408ej.C12476a;
import p601sg.C17787l;
import p642vh.C18368l;
import ue1.C43064a;

/* renamed from: ge.bog.designsystem.components.progressbadge.DynamicProgressBadge */
public final class DynamicProgressBadge extends LinearLayout {

    /* renamed from: d */
    private C43064a f40252d;

    /* renamed from: e */
    private int f40253e;

    /* renamed from: f */
    private int f40254f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DynamicProgressBadge(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: a */
    private final void m50628a() {
        C12476a aVar;
        removeAllViews();
        int i = this.f40253e;
        for (int i2 = 0; i2 < i; i2++) {
            Context context = getContext();
            C41536l.m120488h(context, "context");
            ProgressBadgeView progressBadgeView = new ProgressBadgeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
            if (i2 > 0) {
                layoutParams.setMarginStart(C18368l.m62762k(4));
            }
            progressBadgeView.setLayoutParams(layoutParams);
            if (i2 < this.f40254f) {
                aVar = C12476a.POSITIVE;
            } else {
                aVar = C12476a.NEUTRAL;
            }
            progressBadgeView.setType(aVar);
            progressBadgeView.setDuplicateParentStateEnabled(true);
            addView(progressBadgeView);
        }
        C43064a aVar2 = this.f40252d;
        if (aVar2 != null) {
            aVar2.invoke();
        }
    }

    public final int getPerformedStepsCount() {
        return this.f40254f;
    }

    public final C43064a getProgressListener() {
        return this.f40252d;
    }

    public final int getProgressStepsCount() {
        return this.f40253e;
    }

    public final void setPerformedStepsCount(int i) {
        this.f40254f = C8720a.m32478b(i, 0, 7);
        m50628a();
    }

    public final void setProgressListener(C43064a aVar) {
        this.f40252d = aVar;
    }

    public final void setProgressStepsCount(int i) {
        this.f40253e = C8720a.m32478b(i, 1, 7);
        m50628a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DynamicProgressBadge(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DynamicProgressBadge(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        this.f40253e = 1;
        setOrientation(0);
        int[] iArr = C17787l.f50570v4;
        C41536l.m120488h(iArr, "DynamicProgressBadge");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setProgressStepsCount(obtainStyledAttributes.getInt(C17787l.f50600x4, 1));
        setPerformedStepsCount(obtainStyledAttributes.getInt(C17787l.f50585w4, 0));
        m50628a();
        obtainStyledAttributes.recycle();
    }
}

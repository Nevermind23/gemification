package p341ge.bog.designsystem.components.infobubble;

import android.content.Context;
import android.support.p013v4.media.session.C0125b;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p505li.C16576a;
import p505li.C16577b;
import p601sg.C17779d;

/* renamed from: ge.bog.designsystem.components.infobubble.InfoBubbleView */
public final class InfoBubbleView extends LinearLayout {

    /* renamed from: d */
    private List f39614d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InfoBubbleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: a */
    private final C16576a m50248a(Context context, C16577b bVar) {
        C16576a aVar = new C16576a(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        aVar.setInfoBubble(bVar);
        return aVar;
    }

    /* renamed from: b */
    private final LinearLayout.LayoutParams m50249b(int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (i != 0) {
            layoutParams.setMargins(getResources().getDimensionPixelSize(C17779d.spacing_12), layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
        }
        return layoutParams;
    }

    public final void setInfoBubbleList(List<C16577b> list) {
        C41536l.m120489i(list, "list");
        removeAllViews();
        this.f39614d.clear();
        if (list.size() <= 3) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                List list2 = this.f39614d;
                Context context = getContext();
                C41536l.m120488h(context, "context");
                C0125b.m366a(list.get(i));
                list2.add(m50248a(context, (C16577b) null));
                addView((View) this.f39614d.get(i), i, m50249b(i));
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InfoBubbleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfoBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        this.f39614d = new ArrayList();
        setOrientation(0);
    }
}

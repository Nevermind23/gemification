package p341ge.bog.designsystem.components.dynamicthumbnailcard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.designsystem.components.dynamicthumbnailcard.NoUIScrollRecyclerView */
public final class NoUIScrollRecyclerView extends RecyclerView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoUIScrollRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C41536l.m120489i(context, "context");
        C41536l.m120489i(attributeSet, "attrs");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C41536l.m120489i(motionEvent, "e");
        RecyclerView.C1747p layoutManager = getLayoutManager();
        boolean z = false;
        if (layoutManager != null && layoutManager.mo5634I0()) {
            z = true;
        }
        if (z || getScrollState() == 2) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C41536l.m120489i(motionEvent, "e");
        RecyclerView.C1747p layoutManager = getLayoutManager();
        boolean z = false;
        if (layoutManager != null && layoutManager.mo5634I0()) {
            z = true;
        }
        if (z || getScrollState() == 2) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}

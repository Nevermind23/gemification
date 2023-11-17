package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import kotlin.jvm.internal.C41536l;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.ObservableWebView */
public final class ObservableWebView extends WebView {
    private int minDistance;
    private C43064a onBottomReachedListener;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ObservableWebView(Context context) {
        this(context, (AttributeSet) null);
        C41536l.m120489i(context, "context");
    }

    public final boolean hasReachedBottom() {
        return computeVerticalScrollRange() - (getTop() + getHeight()) <= this.minDistance;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        C43064a aVar = this.onBottomReachedListener;
        if (aVar != null && computeVerticalScrollRange() - (getHeight() + i2) <= this.minDistance) {
            aVar.invoke();
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    public final void setOnBottomReachedListener(int i, C43064a aVar) {
        C41536l.m120489i(aVar, "bottomReachedListener");
        this.onBottomReachedListener = aVar;
        this.minDistance = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ObservableWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C41536l.m120489i(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ObservableWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
    }
}

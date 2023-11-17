package p341ge.bog.chat.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import kotlin.jvm.internal.C41536l;
import p517mg.C16682a;

/* renamed from: ge.bog.chat.presentation.view.ScrollListenerWebView */
public final class ScrollListenerWebView extends WebView {

    /* renamed from: d */
    private C16682a f38535d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollListenerWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        C16682a aVar;
        super.onScrollChanged(i, i2, i3, i4);
        if (!canScrollVertically(1) && (aVar = this.f38535d) != null) {
            aVar.mo43545a();
        }
    }

    public final void setScrollEndedListener(C16682a aVar) {
        C41536l.m120489i(aVar, "scrollEndedListener");
        this.f38535d = aVar;
    }
}

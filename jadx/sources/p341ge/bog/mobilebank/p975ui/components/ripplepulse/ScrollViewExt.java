package p341ge.bog.mobilebank.p975ui.components.ripplepulse;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/* renamed from: ge.bog.mobilebank.ui.components.ripplepulse.ScrollViewExt */
public class ScrollViewExt extends ScrollView {

    /* renamed from: d */
    private C35561a f85941d = null;

    /* renamed from: ge.bog.mobilebank.ui.components.ripplepulse.ScrollViewExt$a */
    public interface C35561a {
        /* renamed from: a */
        void mo65491a(ScrollViewExt scrollViewExt, int i, int i2, int i3, int i4);
    }

    public ScrollViewExt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C35561a aVar = this.f85941d;
        if (aVar != null) {
            aVar.mo65491a(this, i, i2, i3, i4);
        }
    }

    public void setScrollViewListener(C35561a aVar) {
        this.f85941d = aVar;
    }
}

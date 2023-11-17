package m10;

import android.os.Handler;
import android.widget.ImageView;
import android.widget.PopupWindow;

/* renamed from: m10.d */
public final /* synthetic */ class C26120d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ PopupWindow f66239d;

    /* renamed from: e */
    public final /* synthetic */ Handler f66240e;

    /* renamed from: f */
    public final /* synthetic */ ImageView f66241f;

    public /* synthetic */ C26120d(PopupWindow popupWindow, Handler handler, ImageView imageView) {
        this.f66239d = popupWindow;
        this.f66240e = handler;
        this.f66241f = imageView;
    }

    public final void run() {
        C26122f.m81823l(this.f66239d, this.f66240e, this.f66241f);
    }
}

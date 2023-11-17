package m10;

import android.os.Handler;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.alexandrius.accordionswipelayout.library.SwipeLayout;

/* renamed from: m10.c */
public final /* synthetic */ class C26119c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SwipeLayout f66235d;

    /* renamed from: e */
    public final /* synthetic */ Handler f66236e;

    /* renamed from: f */
    public final /* synthetic */ PopupWindow f66237f;

    /* renamed from: g */
    public final /* synthetic */ ImageView f66238g;

    public /* synthetic */ C26119c(SwipeLayout swipeLayout, Handler handler, PopupWindow popupWindow, ImageView imageView) {
        this.f66235d = swipeLayout;
        this.f66236e = handler;
        this.f66237f = popupWindow;
        this.f66238g = imageView;
    }

    public final void run() {
        C26122f.m81822k(this.f66235d, this.f66236e, this.f66237f, this.f66238g);
    }
}

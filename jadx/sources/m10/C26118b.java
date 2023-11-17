package m10;

import android.os.Handler;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.alexandrius.accordionswipelayout.library.SwipeLayout;

/* renamed from: m10.b */
public final /* synthetic */ class C26118b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SwipeLayout f66231d;

    /* renamed from: e */
    public final /* synthetic */ Handler f66232e;

    /* renamed from: f */
    public final /* synthetic */ PopupWindow f66233f;

    /* renamed from: g */
    public final /* synthetic */ ImageView f66234g;

    public /* synthetic */ C26118b(SwipeLayout swipeLayout, Handler handler, PopupWindow popupWindow, ImageView imageView) {
        this.f66231d = swipeLayout;
        this.f66232e = handler;
        this.f66233f = popupWindow;
        this.f66234g = imageView;
    }

    public final void run() {
        C26122f.m81821j(this.f66231d, this.f66232e, this.f66233f, this.f66234g);
    }
}

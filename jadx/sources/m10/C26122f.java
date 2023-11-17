package m10;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.core.content.C0767a;
import com.alexandrius.accordionswipelayout.library.SwipeLayout;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10320i;
import p366bk.C10328q;

/* renamed from: m10.f */
public final class C26122f {

    /* renamed from: a */
    public static final C26122f f66243a = new C26122f();

    private C26122f() {
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final boolean m81820h(PopupWindow popupWindow, View view, MotionEvent motionEvent) {
        C41536l.m120489i(popupWindow, "$popup");
        popupWindow.dismiss();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m81821j(SwipeLayout swipeLayout, Handler handler, PopupWindow popupWindow, ImageView imageView) {
        C41536l.m120489i(swipeLayout, "$swipeLayout");
        C41536l.m120489i(handler, "$handler");
        C41536l.m120489i(popupWindow, "$popup");
        C41536l.m120489i(imageView, "$starImage");
        swipeLayout.mo7586B(1, true);
        handler.postDelayed(new C26119c(swipeLayout, handler, popupWindow, imageView), 500);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m81822k(SwipeLayout swipeLayout, Handler handler, PopupWindow popupWindow, ImageView imageView) {
        C41536l.m120489i(swipeLayout, "$swipeLayout");
        C41536l.m120489i(handler, "$handler");
        C41536l.m120489i(popupWindow, "$popup");
        C41536l.m120489i(imageView, "$starImage");
        swipeLayout.mo7588f(true);
        handler.postDelayed(new C26120d(popupWindow, handler, imageView), 300);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m81823l(PopupWindow popupWindow, Handler handler, ImageView imageView) {
        C41536l.m120489i(popupWindow, "$popup");
        C41536l.m120489i(handler, "$handler");
        C41536l.m120489i(imageView, "$starImage");
        f66243a.m81824m(popupWindow, handler, imageView);
    }

    /* renamed from: m */
    private final void m81824m(PopupWindow popupWindow, Handler handler, ImageView imageView) {
        if (!PreferencesApiManager.getInstance().isFavoriteHintShown()) {
            PreferencesApiManager.getInstance().setIsFavoriteHintShown();
            popupWindow.showAsDropDown(imageView, 0, 0, 8388613);
            handler.postDelayed(new C26121e(popupWindow), 7000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m81825n(PopupWindow popupWindow) {
        C41536l.m120489i(popupWindow, "$popup");
        popupWindow.dismiss();
    }

    /* renamed from: f */
    public final void mo65033f(SwipeLayout swipeLayout) {
        SwipeLayout swipeLayout2 = swipeLayout;
        C41536l.m120489i(swipeLayout2, "swipeLayout");
        ArrayList arrayList = new ArrayList();
        Context context = swipeLayout.getContext();
        arrayList.add(new SwipeLayout.C2363g("SHARE_ID", context.getString(C10328q.share), Integer.valueOf(C10320i.ic_contact_share), Integer.valueOf(C0767a.m2893c(context, C10318g.contact_share_swipe_background)), Integer.valueOf(C0767a.m2893c(context, C10318g.contact_share_swipe_text)), (Integer) null, (Float) null));
        arrayList.add(new SwipeLayout.C2363g("DELETE_ID", context.getString(C10328q.contact_delete_popup), Integer.valueOf(C10320i.ic_swipe_delete), Integer.valueOf(C0767a.m2893c(context, C10318g.contact_delete_swipe_item)), Integer.valueOf(C0767a.m2893c(context, C10318g.contact_delete_swipe_text)), (Integer) null, (Float) null));
        swipeLayout2.setRightSwipeItems(arrayList);
    }

    /* renamed from: g */
    public final PopupWindow mo65034g(View view) {
        C41536l.m120489i(view, "content");
        Context context = view.getContext();
        PopupWindow popupWindow = new PopupWindow(view, context.getResources().getDimensionPixelSize(C10319h.contact_favorite_hint_width), context.getResources().getDimensionPixelSize(C10319h.contact_favorite_hint_height));
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchInterceptor(new C26117a(popupWindow));
        return popupWindow;
    }

    /* renamed from: i */
    public final void mo65035i(Handler handler, SwipeLayout swipeLayout, PopupWindow popupWindow, ImageView imageView) {
        C41536l.m120489i(handler, "handler");
        C41536l.m120489i(swipeLayout, "swipeLayout");
        C41536l.m120489i(popupWindow, "popup");
        C41536l.m120489i(imageView, "starImage");
        if (!PreferencesApiManager.getInstance().isAccountSwiped()) {
            PreferencesApiManager.getInstance().setIsAccountSwiped();
            handler.postDelayed(new C26118b(swipeLayout, handler, popupWindow, imageView), 500);
        }
    }
}

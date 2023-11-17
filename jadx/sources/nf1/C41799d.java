package nf1;

import android.app.Activity;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: nf1.d */
public class C41799d implements C41800e {

    /* renamed from: a */
    private WeakReference f98125a;

    /* renamed from: b */
    private WeakReference f98126b;

    C41799d(Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f98125a = new WeakReference(activity);
        this.f98126b = new WeakReference(onGlobalLayoutListener);
    }

    public void unregister() {
        Activity activity = (Activity) this.f98125a.get();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.f98126b.get();
        if (!(activity == null || onGlobalLayoutListener == null)) {
            C41795b.m121159a(activity).getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        this.f98125a.clear();
        this.f98126b.clear();
    }
}

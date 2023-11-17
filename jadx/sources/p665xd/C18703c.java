package p665xd;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;

/* renamed from: xd.c */
public class C18703c extends FrameLayout {

    /* renamed from: d */
    private final HashMap f52353d = new HashMap();

    public C18703c(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo46511a(int i, PointF[] pointFArr) {
        View view = (View) this.f52353d.get(Integer.valueOf(i));
        if (view != null) {
            view.clearAnimation();
            if (i == 1) {
                PointF pointF = pointFArr[0];
                view.setTranslationX((float) ((int) (pointF.x - ((float) (view.getWidth() / 2)))));
                view.setTranslationY((float) ((int) (pointF.y - ((float) (view.getHeight() / 2)))));
            }
        }
    }

    /* renamed from: b */
    public void mo46512b(int i, C18702b bVar) {
        View a;
        View view = (View) this.f52353d.get(Integer.valueOf(i));
        if (view != null) {
            removeView(view);
        }
        if (bVar != null && (a = bVar.mo46510a(getContext(), this)) != null) {
            this.f52353d.put(Integer.valueOf(i), a);
            addView(a);
        }
    }
}

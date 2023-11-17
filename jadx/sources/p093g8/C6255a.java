package p093g8;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: g8.a */
public class C6255a implements View.OnTouchListener {

    /* renamed from: d */
    private final Dialog f19277d;

    /* renamed from: e */
    private final int f19278e;

    /* renamed from: f */
    private final int f19279f;

    /* renamed from: g */
    private final int f19280g;

    public C6255a(Dialog dialog, Rect rect) {
        this.f19277d = dialog;
        this.f19278e = rect.left;
        this.f19279f = rect.top;
        this.f19280g = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f19278e + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f19279f + findViewById.getTop();
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f19280g;
            obtain.setLocation((float) ((-i) - 1), (float) ((-i) - 1));
        }
        view.performClick();
        return this.f19277d.onTouchEvent(obtain);
    }
}

package g91;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.core.content.C0767a;
import androidx.core.graphics.drawable.C0836a;
import iu0.C36546y;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p366bk.C10313b;

/* renamed from: g91.b1 */
public abstract class C32290b1 {

    /* renamed from: a */
    private static C32293c f79698a;

    /* renamed from: g91.b1$a */
    class C32291a extends Animation {

        /* renamed from: d */
        final /* synthetic */ View f79699d;

        /* renamed from: e */
        final /* synthetic */ int f79700e;

        C32291a(View view, int i) {
            this.f79699d = view;
            this.f79700e = i;
        }

        /* access modifiers changed from: protected */
        public void applyTransformation(float f, Transformation transformation) {
            int i;
            ViewGroup.LayoutParams layoutParams = this.f79699d.getLayoutParams();
            if (f == 1.0f) {
                i = -2;
            } else {
                i = (int) (((float) this.f79700e) * f);
            }
            layoutParams.height = i;
            this.f79699d.requestLayout();
        }

        public boolean willChangeBounds() {
            return true;
        }
    }

    /* renamed from: g91.b1$b */
    class C32292b extends Animation {

        /* renamed from: d */
        final /* synthetic */ View f79701d;

        /* renamed from: e */
        final /* synthetic */ int f79702e;

        C32292b(View view, int i) {
            this.f79701d = view;
            this.f79702e = i;
        }

        /* access modifiers changed from: protected */
        public void applyTransformation(float f, Transformation transformation) {
            if (f == 1.0f) {
                this.f79701d.setVisibility(8);
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.f79701d.getLayoutParams();
            int i = this.f79702e;
            layoutParams.height = i - ((int) (((float) i) * f));
            this.f79701d.requestLayout();
        }

        public boolean willChangeBounds() {
            return true;
        }
    }

    /* renamed from: g91.b1$c */
    static class C32293c implements Runnable {

        /* renamed from: d */
        private EditText f79703d;

        public C32293c(EditText editText) {
            this.f79703d = editText;
        }

        public void run() {
            this.f79703d.requestFocus();
            ((InputMethodManager) this.f79703d.getContext().getSystemService("input_method")).showSoftInput(this.f79703d, 1);
        }
    }

    /* renamed from: a */
    public static void m95111a(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    /* renamed from: b */
    public static void m95112b(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* renamed from: c */
    public static Animation m95113c(View view) {
        C32292b bVar = new C32292b(view, view.getMeasuredHeight());
        bVar.setDuration((long) m95118h(view));
        view.startAnimation(bVar);
        return bVar;
    }

    /* renamed from: d */
    public static Animation m95114d(View view) {
        view.measure(-1, -2);
        int measuredHeight = view.getMeasuredHeight();
        view.getLayoutParams().height = 1;
        view.setVisibility(0);
        C32291a aVar = new C32291a(view, measuredHeight);
        aVar.setDuration((long) m95118h(view));
        view.startAnimation(aVar);
        return aVar;
    }

    /* renamed from: e */
    public static void m95115e(EditText editText) {
        editText.removeCallbacks(f79698a);
        C32293c cVar = new C32293c(editText);
        f79698a = cVar;
        editText.postDelayed(cVar, 100);
    }

    /* renamed from: f */
    public static void m95116f(Context context, EditText editText) {
        editText.requestFocus();
        ((InputMethodManager) context.getSystemService("input_method")).showSoftInput(editText, 2);
    }

    /* renamed from: g */
    public static Drawable m95117g(int i) {
        return C0767a.m2895e(C36546y.m108285N(), i);
    }

    /* renamed from: h */
    private static int m95118h(View view) {
        int measuredHeight = (int) (((float) view.getMeasuredHeight()) / view.getContext().getResources().getDisplayMetrics().density);
        if (measuredHeight > 400) {
            return TextTypeView.SEPARATOR_FULL;
        }
        return measuredHeight;
    }

    /* renamed from: i */
    public static Rect m95119i(View view) {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        if (view == null) {
            return rect;
        }
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        rect.left = i;
        rect.top = iArr[1];
        rect.right = i + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        return rect;
    }

    /* renamed from: j */
    public static int m95120j(View view, View view2) {
        if (view.getParent() == view2) {
            return view.getLeft();
        }
        return view.getLeft() + m95120j((View) view.getParent(), view2);
    }

    /* renamed from: k */
    public static Drawable m95121k(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{16843534});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    /* renamed from: l */
    public static Drawable m95122l(Context context, Drawable drawable, int i) {
        if (context == null) {
            context = C36546y.m108285N();
        }
        return m95123m(drawable, C0767a.m2893c(context, i));
    }

    /* renamed from: m */
    public static Drawable m95123m(Drawable drawable, int i) {
        Drawable r = C0836a.m3156r(drawable.mutate());
        C0836a.m3152n(r, i);
        return r;
    }

    /* renamed from: n */
    public static void m95124n(View view, int i) {
        try {
            view.getLayoutParams().height = i;
            view.requestLayout();
        } catch (Exception unused) {
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
        }
    }

    /* renamed from: o */
    public static void m95125o(View view, float f) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.weight = f;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: p */
    public static void m95126p(View view, int i) {
        view.getLayoutParams().width = i;
        view.requestLayout();
    }

    /* renamed from: q */
    public static void m95127q(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), C10313b.wiggle_anim));
    }

    /* renamed from: r */
    public static void m95128r(Context context) {
        ((InputMethodManager) context.getSystemService("input_method")).toggleSoftInput(1, 0);
    }
}

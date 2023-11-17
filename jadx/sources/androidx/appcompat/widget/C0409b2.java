package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.facetec.sdk.FaceTecSDK;
import p030c.C2213d;
import p030c.C2215f;
import p030c.C2216g;
import p030c.C2218i;

/* renamed from: androidx.appcompat.widget.b2 */
class C0409b2 {

    /* renamed from: a */
    private final Context f2052a;

    /* renamed from: b */
    private final View f2053b;

    /* renamed from: c */
    private final TextView f2054c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f2055d;

    /* renamed from: e */
    private final Rect f2056e = new Rect();

    /* renamed from: f */
    private final int[] f2057f = new int[2];

    /* renamed from: g */
    private final int[] f2058g = new int[2];

    C0409b2(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f2055d = layoutParams;
        this.f2052a = context;
        View inflate = LayoutInflater.from(context).inflate(C2216g.f6598s, (ViewGroup) null);
        this.f2053b = inflate;
        this.f2054c = (TextView) inflate.findViewById(C2215f.f6572s);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = FaceTecSDK.REQUEST_CODE_SESSION;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C2218i.f6614a;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private void m1663a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int i3;
        int i4;
        int i5;
        int i6;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f2052a.getResources().getDimensionPixelOffset(C2213d.f6490k);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f2052a.getResources().getDimensionPixelOffset(C2213d.f6489j);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = this.f2052a.getResources();
        if (z) {
            i5 = C2213d.f6492m;
        } else {
            i5 = C2213d.f6491l;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i5);
        View b = m1664b(view);
        if (b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b.getWindowVisibleDisplayFrame(this.f2056e);
        Rect rect = this.f2056e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources2 = this.f2052a.getResources();
            int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier != 0) {
                i6 = resources2.getDimensionPixelSize(identifier);
            } else {
                i6 = 0;
            }
            DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
            this.f2056e.set(0, i6, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b.getLocationOnScreen(this.f2058g);
        view.getLocationOnScreen(this.f2057f);
        int[] iArr = this.f2057f;
        int i7 = iArr[0];
        int[] iArr2 = this.f2058g;
        int i8 = i7 - iArr2[0];
        iArr[0] = i8;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i8 + i) - (b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f2053b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f2053b.getMeasuredHeight();
        int i9 = this.f2057f[1];
        int i12 = ((i3 + i9) - dimensionPixelOffset3) - measuredHeight;
        int i13 = i9 + i4 + dimensionPixelOffset3;
        if (z) {
            if (i12 >= 0) {
                layoutParams.y = i12;
            } else {
                layoutParams.y = i13;
            }
        } else if (measuredHeight + i13 <= this.f2056e.height()) {
            layoutParams.y = i13;
        } else {
            layoutParams.y = i12;
        }
    }

    /* renamed from: b */
    private static View m1664b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1954c() {
        if (mo1955d()) {
            ((WindowManager) this.f2052a.getSystemService("window")).removeView(this.f2053b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo1955d() {
        return this.f2053b.getParent() != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1956e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (mo1955d()) {
            mo1954c();
        }
        this.f2054c.setText(charSequence);
        m1663a(view, i, i2, z, this.f2055d);
        ((WindowManager) this.f2052a.getSystemService("window")).addView(this.f2053b, this.f2055d);
    }
}

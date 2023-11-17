package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.p016os.C0909f;
import androidx.core.view.C1136d1;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.fragment.app.h0 */
public abstract class C1507h0 {

    /* renamed from: androidx.fragment.app.h0$a */
    class C1508a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ int f4409d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f4410e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f4411f;

        /* renamed from: g */
        final /* synthetic */ ArrayList f4412g;

        /* renamed from: h */
        final /* synthetic */ ArrayList f4413h;

        C1508a(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f4409d = i;
            this.f4410e = arrayList;
            this.f4411f = arrayList2;
            this.f4412g = arrayList3;
            this.f4413h = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f4409d; i++) {
                ViewCompat.m3562L0((View) this.f4410e.get(i), (String) this.f4411f.get(i));
                ViewCompat.m3562L0((View) this.f4412g.get(i), (String) this.f4413h.get(i));
            }
        }
    }

    /* renamed from: d */
    protected static void m5338d(List list, View view) {
        int size = list.size();
        if (!m5339g(list, view, size)) {
            if (ViewCompat.m3557J(view) != null) {
                list.add(view);
            }
            for (int i = size; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m5339g(list, childAt, size) && ViewCompat.m3557J(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: g */
    private static boolean m5339g(List list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    protected static boolean m5340i(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    public abstract void mo4644a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo4645b(Object obj, ArrayList arrayList);

    /* renamed from: c */
    public abstract void mo4646c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo4647e(Object obj);

    /* renamed from: f */
    public abstract Object mo4648f(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo4703h(View view, Rect rect) {
        if (ViewCompat.m3578U(view)) {
            RectF rectF = new RectF();
            rectF.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: j */
    public abstract Object mo4649j(Object obj, Object obj2, Object obj3);

    /* renamed from: k */
    public abstract Object mo4650k(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public ArrayList mo4704l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            arrayList2.add(ViewCompat.m3557J(view));
            ViewCompat.m3562L0(view, (String) null);
        }
        return arrayList2;
    }

    /* renamed from: m */
    public abstract void mo4651m(Object obj, View view, ArrayList arrayList);

    /* renamed from: n */
    public abstract void mo4652n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    /* renamed from: o */
    public abstract void mo4653o(Object obj, Rect rect);

    /* renamed from: p */
    public abstract void mo4654p(Object obj, View view);

    /* renamed from: q */
    public abstract void mo4655q(Fragment fragment, Object obj, C0909f fVar, Runnable runnable);

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo4705r(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayList.get(i);
            String J = ViewCompat.m3557J(view2);
            arrayList4.add(J);
            if (J != null) {
                ViewCompat.m3562L0(view2, (String) null);
                String str = (String) map.get(J);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        ViewCompat.m3562L0((View) arrayList2.get(i2), J);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        C1136d1.m4184a(view, new C1508a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: s */
    public abstract void mo4656s(Object obj, View view, ArrayList arrayList);

    /* renamed from: t */
    public abstract void mo4657t(Object obj, ArrayList arrayList, ArrayList arrayList2);

    /* renamed from: u */
    public abstract Object mo4658u(Object obj);
}

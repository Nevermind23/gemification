package p060e1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* renamed from: e1.r */
class C5991r extends FrameLayout {

    /* renamed from: d */
    private ViewGroup f18722d;

    /* renamed from: e */
    private boolean f18723e = true;

    C5991r(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f18722d = viewGroup;
        viewGroup.setTag(C5894c0.f18489b, this);
        C6008x0.m24107b(this.f18722d).mo19451c(this);
    }

    /* renamed from: b */
    static C5991r m24065b(ViewGroup viewGroup) {
        return (C5991r) viewGroup.getTag(C5894c0.f18489b);
    }

    /* renamed from: c */
    private int m24066c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i = 0;
        while (i <= childCount) {
            int i2 = (i + childCount) / 2;
            m24067d(((C5997t) getChildAt(i2)).f18746f, arrayList2);
            if (m24069f(arrayList, arrayList2)) {
                i = i2 + 1;
            } else {
                childCount = i2 - 1;
            }
            arrayList2.clear();
        }
        return i;
    }

    /* renamed from: d */
    private static void m24067d(View view, ArrayList arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            m24067d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    /* renamed from: e */
    private static boolean m24068e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (view.getZ() == view2.getZ()) {
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(C6008x0.m24106a(viewGroup, i));
                if (childAt == view) {
                    return false;
                }
                if (childAt == view2) {
                    break;
                }
            }
            return true;
        } else if (view.getZ() > view2.getZ()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: f */
    private static boolean m24069f(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        for (int i = 1; i < min; i++) {
            View view = (View) arrayList.get(i);
            View view2 = (View) arrayList2.get(i);
            if (view != view2) {
                return m24068e(view, view2);
            }
        }
        if (arrayList2.size() == min) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo19436a(C5997t tVar) {
        ArrayList arrayList = new ArrayList();
        m24067d(tVar.f18746f, arrayList);
        int c = m24066c(arrayList);
        if (c < 0 || c >= getChildCount()) {
            addView(tVar);
        } else {
            addView(tVar, c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo19437g() {
        if (this.f18723e) {
            C6008x0.m24107b(this.f18722d).mo19452d(this);
            C6008x0.m24107b(this.f18722d).mo19451c(this);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    public void onViewAdded(View view) {
        if (this.f18723e) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f18722d.setTag(C5894c0.f18489b, (Object) null);
            C6008x0.m24107b(this.f18722d).mo19452d(this);
            this.f18723e = false;
        }
    }
}

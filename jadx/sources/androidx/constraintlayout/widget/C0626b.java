package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;
import java.util.HashMap;
import p214q.C7806e;
import p214q.C7812h;

/* renamed from: androidx.constraintlayout.widget.b */
public abstract class C0626b extends View {

    /* renamed from: d */
    protected int[] f2596d = new int[32];

    /* renamed from: e */
    protected int f2597e;

    /* renamed from: f */
    protected Context f2598f;

    /* renamed from: g */
    protected C7812h f2599g;

    /* renamed from: h */
    protected boolean f2600h = false;

    /* renamed from: i */
    protected String f2601i;

    /* renamed from: j */
    protected String f2602j;

    /* renamed from: k */
    private View[] f2603k = null;

    /* renamed from: l */
    protected HashMap f2604l = new HashMap();

    public C0626b(Context context) {
        super(context);
        this.f2598f = context;
        mo2849i((AttributeSet) null);
    }

    /* renamed from: a */
    private void m2406a(String str) {
        if (str != null && str.length() != 0 && this.f2598f != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int h = m2410h(trim);
            if (h != 0) {
                this.f2604l.put(Integer.valueOf(h), trim);
                m2407b(h);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    /* renamed from: b */
    private void m2407b(int i) {
        if (i != getId()) {
            int i2 = this.f2597e + 1;
            int[] iArr = this.f2596d;
            if (i2 > iArr.length) {
                this.f2596d = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f2596d;
            int i3 = this.f2597e;
            iArr2[i3] = i;
            this.f2597e = i3 + 1;
        }
    }

    /* renamed from: c */
    private void m2408c(String str) {
        ConstraintLayout constraintLayout;
        if (str != null && str.length() != 0 && this.f2598f != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            } else {
                constraintLayout = null;
            }
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ConstraintLayout.C0620b) && trim.equals(((ConstraintLayout.C0620b) layoutParams).f2521c0)) {
                    if (childAt.getId() == -1) {
                        Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                    } else {
                        m2407b(childAt.getId());
                    }
                }
            }
        }
    }

    /* renamed from: g */
    private int m2409g(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f2598f.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: h */
    private int m2410h(String str) {
        ConstraintLayout constraintLayout;
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                i = ((Integer) designInformation).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = m2409g(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = C0638f.class.getField(str).getInt((Object) null);
            } catch (Exception unused) {
            }
        }
        if (i == 0) {
            return this.f2598f.getResources().getIdentifier(str, "id", this.f2598f.getPackageName());
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo2919d() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            mo2920e((ConstraintLayout) parent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo2920e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f2597e; i++) {
            View viewById = constraintLayout.getViewById(this.f2596d[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > Utils.FLOAT_EPSILON) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo2899f(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2596d, this.f2597e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo2849i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0639g.f3081n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0639g.f3163x1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2601i = string;
                    setIds(string);
                } else if (index == C0639g.f3171y1) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f2602j = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: j */
    public void mo2850j(C7806e eVar, boolean z) {
    }

    /* renamed from: k */
    public void mo2900k(ConstraintLayout constraintLayout) {
    }

    /* renamed from: l */
    public void mo2922l(ConstraintLayout constraintLayout) {
    }

    /* renamed from: m */
    public void mo2923m(ConstraintLayout constraintLayout) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r1 = (java.lang.String) r5.f2604l.get(java.lang.Integer.valueOf(r1));
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2924n(androidx.constraintlayout.widget.ConstraintLayout r6) {
        /*
            r5 = this;
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.f2601i
            r5.setIds(r0)
        L_0x000b:
            q.h r0 = r5.f2599g
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            r0.mo22729b()
            r0 = 0
        L_0x0014:
            int r1 = r5.f2597e
            if (r0 >= r1) goto L_0x0053
            int[] r1 = r5.f2596d
            r1 = r1[r0]
            android.view.View r2 = r6.getViewById(r1)
            if (r2 != 0) goto L_0x0045
            java.util.HashMap r3 = r5.f2604l
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r5.m2409g(r6, r1)
            if (r3 == 0) goto L_0x0045
            int[] r2 = r5.f2596d
            r2[r0] = r3
            java.util.HashMap r2 = r5.f2604l
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r1)
            android.view.View r2 = r6.getViewById(r3)
        L_0x0045:
            if (r2 == 0) goto L_0x0050
            q.h r1 = r5.f2599g
            q.e r2 = r6.getViewWidget(r2)
            r1.mo22728a(r2)
        L_0x0050:
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0053:
            q.h r0 = r5.f2599g
            q.f r6 = r6.mLayoutWidget
            r0.mo22730c(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0626b.mo2924n(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    /* renamed from: o */
    public void mo2925o() {
        if (this.f2599g != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.C0620b) {
                ((ConstraintLayout.C0620b) layoutParams).f2559v0 = (C7806e) this.f2599g;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2601i;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f2602j;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f2600h) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* access modifiers changed from: protected */
    public void setIds(String str) {
        this.f2601i = str;
        if (str != null) {
            int i = 0;
            this.f2597e = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m2406a(str.substring(i));
                    return;
                } else {
                    m2406a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setReferenceTags(String str) {
        this.f2602j = str;
        if (str != null) {
            int i = 0;
            this.f2597e = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m2408c(str.substring(i));
                    return;
                } else {
                    m2408c(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2601i = null;
        this.f2597e = 0;
        for (int b : iArr) {
            m2407b(b);
        }
    }

    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f2601i == null) {
            m2407b(i);
        }
    }

    public C0626b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2598f = context;
        mo2849i(attributeSet);
    }
}

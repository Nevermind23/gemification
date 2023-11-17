package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.C1055a;
import androidx.core.view.C1058a0;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C5089m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import p009a8.C0072b;
import p009a8.C0081k;
import p223q8.C7916a;
import p223q8.C7918c;
import p223q8.C7929k;

public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: n */
    private static final String f15713n = "MaterialButtonToggleGroup";

    /* renamed from: o */
    private static final int f15714o = C0081k.f377y;

    /* renamed from: d */
    private final List f15715d;

    /* renamed from: e */
    private final C4972e f15716e;

    /* renamed from: f */
    private final LinkedHashSet f15717f;

    /* renamed from: g */
    private final Comparator f15718g;

    /* renamed from: h */
    private Integer[] f15719h;

    /* renamed from: i */
    private boolean f15720i;

    /* renamed from: j */
    private boolean f15721j;

    /* renamed from: k */
    private boolean f15722k;

    /* renamed from: l */
    private final int f15723l;

    /* renamed from: m */
    private Set f15724m;

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    class C4968a implements Comparator {
        C4968a() {
        }

        /* renamed from: a */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            return Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    class C4969b extends C1055a {
        C4969b() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.mo3597b0(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.m4049a(0, 1, MaterialButtonToggleGroup.this.m19046i(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$c */
    private static class C4970c {

        /* renamed from: e */
        private static final C7918c f15727e = new C7916a(Utils.FLOAT_EPSILON);

        /* renamed from: a */
        C7918c f15728a;

        /* renamed from: b */
        C7918c f15729b;

        /* renamed from: c */
        C7918c f15730c;

        /* renamed from: d */
        C7918c f15731d;

        C4970c(C7918c cVar, C7918c cVar2, C7918c cVar3, C7918c cVar4) {
            this.f15728a = cVar;
            this.f15729b = cVar3;
            this.f15730c = cVar4;
            this.f15731d = cVar2;
        }

        /* renamed from: a */
        public static C4970c m19060a(C4970c cVar) {
            C7918c cVar2 = f15727e;
            return new C4970c(cVar2, cVar.f15731d, cVar2, cVar.f15730c);
        }

        /* renamed from: b */
        public static C4970c m19061b(C4970c cVar, View view) {
            return C5089m.m19905f(view) ? m19062c(cVar) : m19063d(cVar);
        }

        /* renamed from: c */
        public static C4970c m19062c(C4970c cVar) {
            C7918c cVar2 = cVar.f15728a;
            C7918c cVar3 = cVar.f15731d;
            C7918c cVar4 = f15727e;
            return new C4970c(cVar2, cVar3, cVar4, cVar4);
        }

        /* renamed from: d */
        public static C4970c m19063d(C4970c cVar) {
            C7918c cVar2 = f15727e;
            return new C4970c(cVar2, cVar2, cVar.f15729b, cVar.f15730c);
        }

        /* renamed from: e */
        public static C4970c m19064e(C4970c cVar, View view) {
            return C5089m.m19905f(view) ? m19063d(cVar) : m19062c(cVar);
        }

        /* renamed from: f */
        public static C4970c m19065f(C4970c cVar) {
            C7918c cVar2 = cVar.f15728a;
            C7918c cVar3 = f15727e;
            return new C4970c(cVar2, cVar3, cVar.f15729b, cVar3);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$d */
    public interface C4971d {
        /* renamed from: a */
        void mo15707a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$e */
    private class C4972e implements MaterialButton.C4967a {
        private C4972e() {
        }

        /* renamed from: a */
        public void mo15687a(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ C4972e(MaterialButtonToggleGroup materialButtonToggleGroup, C4968a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0072b.f123C);
    }

    /* renamed from: c */
    private void m19041c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
                MaterialButton h = m19045h(i);
                int min = Math.min(h.getStrokeWidth(), m19045h(i - 1).getStrokeWidth());
                LinearLayout.LayoutParams d = m19042d(h);
                if (getOrientation() == 0) {
                    C1058a0.m3952c(d, 0);
                    C1058a0.m3953d(d, -min);
                    d.topMargin = 0;
                } else {
                    d.bottomMargin = 0;
                    d.topMargin = -min;
                    C1058a0.m3953d(d, 0);
                }
                h.setLayoutParams(d);
            }
            m19049n(firstVisibleChildIndex);
        }
    }

    /* renamed from: d */
    private LinearLayout.LayoutParams m19042d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    /* renamed from: e */
    private void m19043e(int i, boolean z) {
        if (i == -1) {
            String str = f15713n;
            Log.e(str, "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f15724m);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f15721j && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else if (!z && hashSet.contains(Integer.valueOf(i))) {
            if (!this.f15722k || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        } else {
            return;
        }
        m19052q(hashSet);
    }

    /* renamed from: g */
    private void m19044g(int i, boolean z) {
        Iterator it = this.f15717f.iterator();
        while (it.hasNext()) {
            ((C4971d) it.next()).mo15707a(this, i, z);
        }
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m19048k(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m19048k(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m19048k(i2)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: h */
    private MaterialButton m19045h(int i) {
        return (MaterialButton) getChildAt(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public int m19046i(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) == view) {
                return i;
            }
            if ((getChildAt(i2) instanceof MaterialButton) && m19048k(i2)) {
                i++;
            }
        }
        return -1;
    }

    /* renamed from: j */
    private C4970c m19047j(int i, int i2, int i3) {
        boolean z;
        C4970c cVar = (C4970c) this.f15715d.get(i);
        if (i2 == i3) {
            return cVar;
        }
        if (getOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == i2) {
            if (z) {
                return C4970c.m19064e(cVar, this);
            }
            return C4970c.m19065f(cVar);
        } else if (i != i3) {
            return null;
        } else {
            if (z) {
                return C4970c.m19061b(cVar, this);
            }
            return C4970c.m19060a(cVar);
        }
    }

    /* renamed from: k */
    private boolean m19048k(int i) {
        if (getChildAt(i).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private void m19049n(int i) {
        if (getChildCount() != 0 && i != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m19045h(i).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                return;
            }
            C1058a0.m3952c(layoutParams, 0);
            C1058a0.m3953d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    /* renamed from: o */
    private void m19050o(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.f15720i = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.f15720i = false;
        }
    }

    /* renamed from: p */
    private static void m19051p(C7929k.C7931b bVar, C4970c cVar) {
        if (cVar == null) {
            bVar.mo22999o(Utils.FLOAT_EPSILON);
        } else {
            bVar.mo22993B(cVar.f15728a).mo23004t(cVar.f15731d).mo22997F(cVar.f15729b).mo23008x(cVar.f15730c);
        }
    }

    /* renamed from: q */
    private void m19052q(Set set) {
        Set set2 = this.f15724m;
        this.f15724m = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = m19045h(i).getId();
            m19050o(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                m19044g(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    /* renamed from: r */
    private void m19053r() {
        TreeMap treeMap = new TreeMap(this.f15718g);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(m19045h(i), Integer.valueOf(i));
        }
        this.f15719h = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(ViewCompat.m3604k());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f15716e);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f15713n, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        m19043e(materialButton.getId(), materialButton.isChecked());
        C7929k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f15715d.add(new C4970c(shapeAppearanceModel.mo22984r(), shapeAppearanceModel.mo22977j(), shapeAppearanceModel.mo22986t(), shapeAppearanceModel.mo22979l()));
        ViewCompat.m3619r0(materialButton, new C4969b());
    }

    /* renamed from: b */
    public void mo15689b(C4971d dVar) {
        this.f15717f.add(dVar);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m19053r();
        super.dispatchDraw(canvas);
    }

    /* renamed from: f */
    public void mo15691f() {
        m19052q(new HashSet());
    }

    public int getCheckedButtonId() {
        if (!this.f15721j || this.f15724m.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f15724m.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = m19045h(i).getId();
            if (this.f15724m.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f15719h;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w(f15713n, "Child order wasn't updated");
        return i2;
    }

    /* renamed from: l */
    public boolean mo15695l() {
        return this.f15721j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo15696m(MaterialButton materialButton, boolean z) {
        if (!this.f15720i) {
            m19043e(materialButton.getId(), z);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f15723l;
        if (i != -1) {
            m19052q(Collections.singleton(Integer.valueOf(i)));
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat A0 = AccessibilityNodeInfoCompat.m3965A0(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (mo15695l()) {
            i = 1;
        } else {
            i = 2;
        }
        A0.mo3595a0(AccessibilityNodeInfoCompat.CollectionInfoCompat.m4048a(1, visibleButtonCount, false, i));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        mo15701s();
        m19041c();
        super.onMeasure(i, i2);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal((MaterialButton.C4967a) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f15715d.remove(indexOfChild);
        }
        mo15701s();
        m19041c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo15701s() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton h = m19045h(i);
            if (h.getVisibility() != 8) {
                C7929k.C7931b v = h.getShapeAppearanceModel().mo22988v();
                m19051p(v, m19047j(i, firstVisibleChildIndex, lastVisibleChildIndex));
                h.setShapeAppearanceModel(v.mo22998m());
            }
        }
    }

    public void setSelectionRequired(boolean z) {
        this.f15722k = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f15721j != z) {
            this.f15721j = z;
            mo15691f();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f15714o
            android.content.Context r7 = p249s8.C8273a.m31120c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f15715d = r7
            com.google.android.material.button.MaterialButtonToggleGroup$e r7 = new com.google.android.material.button.MaterialButtonToggleGroup$e
            r0 = 0
            r7.<init>(r6, r0)
            r6.f15716e = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f15717f = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f15718g = r7
            r7 = 0
            r6.f15720i = r7
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.f15724m = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = p009a8.C0082l.f483K3
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.C5088l.m19898i(r0, r1, r2, r3, r4, r5)
            int r9 = p009a8.C0082l.f513N3
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection((boolean) r9)
            int r9 = p009a8.C0082l.f493L3
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f15723l = r9
            int r9 = p009a8.C0082l.f503M3
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f15722k = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            r8.recycle()
            androidx.core.view.ViewCompat.m3544C0(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}

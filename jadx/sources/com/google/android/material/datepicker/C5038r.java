package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* renamed from: com.google.android.material.datepicker.r */
abstract class C5038r extends Fragment {

    /* renamed from: d */
    protected final LinkedHashSet f16076d = new LinkedHashSet();

    C5038r() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h1 */
    public boolean mo16256h1(C5037q qVar) {
        return this.f16076d.add(qVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i1 */
    public void mo16303i1() {
        this.f16076d.clear();
    }
}

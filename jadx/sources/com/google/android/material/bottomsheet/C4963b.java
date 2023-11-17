package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.C0254v;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: com.google.android.material.bottomsheet.b */
public class C4963b extends C0254v {

    /* renamed from: t */
    private boolean f15694t;

    /* renamed from: com.google.android.material.bottomsheet.b$b */
    private class C4965b extends BottomSheetBehavior.C4953f {
        private C4965b() {
        }

        /* renamed from: b */
        public void mo15609b(View view, float f) {
        }

        /* renamed from: c */
        public void mo15610c(View view, int i) {
            if (i == 5) {
                C4963b.this.m19016C1();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public void m19016C1() {
        if (this.f15694t) {
            super.mo4578l1();
        } else {
            super.mo4577k1();
        }
    }

    /* renamed from: D1 */
    private void m19017D1(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.f15694t = z;
        if (bottomSheetBehavior.mo15590j0() == 5) {
            m19016C1();
            return;
        }
        if (mo4579n1() instanceof C4956a) {
            ((C4956a) mo4579n1()).mo15618p();
        }
        bottomSheetBehavior.mo15585W(new C4965b());
        bottomSheetBehavior.mo15579I0(5);
    }

    /* renamed from: E1 */
    private boolean m19018E1(boolean z) {
        Dialog n1 = mo4579n1();
        if (!(n1 instanceof C4956a)) {
            return false;
        }
        C4956a aVar = (C4956a) n1;
        BottomSheetBehavior n = aVar.mo15614n();
        if (!n.mo15593o0() || !aVar.mo15615o()) {
            return false;
        }
        m19017D1(n, z);
        return true;
    }

    /* renamed from: k1 */
    public void mo4577k1() {
        if (!m19018E1(false)) {
            super.mo4577k1();
        }
    }

    /* renamed from: l1 */
    public void mo4578l1() {
        if (!m19018E1(true)) {
            super.mo4578l1();
        }
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        return new C4956a(getContext(), mo4580o1());
    }
}

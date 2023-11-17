package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.core.view.z0 */
public class C1279z0 {

    /* renamed from: a */
    private int f3838a;

    /* renamed from: b */
    private int f3839b;

    public C1279z0(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int mo3748a() {
        return this.f3838a | this.f3839b;
    }

    /* renamed from: b */
    public void mo3749b(View view, View view2, int i) {
        mo3750c(view, view2, i, 0);
    }

    /* renamed from: c */
    public void mo3750c(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f3839b = i;
        } else {
            this.f3838a = i;
        }
    }

    /* renamed from: d */
    public void mo3751d(View view) {
        mo3752e(view, 0);
    }

    /* renamed from: e */
    public void mo3752e(View view, int i) {
        if (i == 1) {
            this.f3839b = 0;
        } else {
            this.f3838a = 0;
        }
    }
}

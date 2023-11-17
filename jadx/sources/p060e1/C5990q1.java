package p060e1;

import android.view.View;
import android.view.WindowId;

/* renamed from: e1.q1 */
class C5990q1 implements C5993r1 {

    /* renamed from: a */
    private final WindowId f18721a;

    C5990q1(View view) {
        this.f18721a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5990q1) && ((C5990q1) obj).f18721a.equals(this.f18721a);
    }

    public int hashCode() {
        return this.f18721a.hashCode();
    }
}

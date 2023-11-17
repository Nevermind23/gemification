package p060e1;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: e1.q0 */
public class C5989q0 {

    /* renamed from: a */
    public final Map f18718a = new HashMap();

    /* renamed from: b */
    public View f18719b;

    /* renamed from: c */
    final ArrayList f18720c = new ArrayList();

    public C5989q0(View view) {
        this.f18719b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5989q0)) {
            return false;
        }
        C5989q0 q0Var = (C5989q0) obj;
        if (this.f18719b != q0Var.f18719b || !this.f18718a.equals(q0Var.f18718a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f18719b.hashCode() * 31) + this.f18718a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f18719b + "\n") + "    values:";
        for (String str2 : this.f18718a.keySet()) {
            str = str + "    " + str2 + ": " + this.f18718a.get(str2) + "\n";
        }
        return str;
    }
}

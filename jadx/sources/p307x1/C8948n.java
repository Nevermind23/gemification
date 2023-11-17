package p307x1;

import java.util.Arrays;
import java.util.List;
import p061e2.C6013a;

/* renamed from: x1.n */
abstract class C8948n implements C8947m {

    /* renamed from: a */
    final List f24953a;

    C8948n(List list) {
        this.f24953a = list;
    }

    /* renamed from: b */
    public List mo24354b() {
        return this.f24953a;
    }

    /* renamed from: c */
    public boolean mo24355c() {
        if (!this.f24953a.isEmpty()) {
            return this.f24953a.size() == 1 && ((C6013a) this.f24953a.get(0)).mo19493i();
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f24953a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f24953a.toArray()));
        }
        return sb.toString();
    }
}

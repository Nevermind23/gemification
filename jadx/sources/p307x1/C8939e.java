package p307x1;

import java.util.List;
import p061e2.C6013a;
import p268u1.C8525a;
import p268u1.C8541j;
import p268u1.C8542k;

/* renamed from: x1.e */
public class C8939e implements C8947m {

    /* renamed from: a */
    private final List f24937a;

    public C8939e(List list) {
        this.f24937a = list;
    }

    /* renamed from: a */
    public C8525a mo24353a() {
        if (((C6013a) this.f24937a.get(0)).mo19493i()) {
            return new C8542k(this.f24937a);
        }
        return new C8541j(this.f24937a);
    }

    /* renamed from: b */
    public List mo24354b() {
        return this.f24937a;
    }

    /* renamed from: c */
    public boolean mo24355c() {
        return this.f24937a.size() == 1 && ((C6013a) this.f24937a.get(0)).mo19493i();
    }
}

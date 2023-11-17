package p268u1;

import java.util.ArrayList;
import java.util.List;
import p319y1.C9016h;

/* renamed from: u1.h */
public class C8539h {

    /* renamed from: a */
    private final List f24251a;

    /* renamed from: b */
    private final List f24252b;

    /* renamed from: c */
    private final List f24253c;

    public C8539h(List list) {
        this.f24253c = list;
        this.f24251a = new ArrayList(list.size());
        this.f24252b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f24251a.add(((C9016h) list.get(i)).mo24448b().mo24353a());
            this.f24252b.add(((C9016h) list.get(i)).mo24449c().mo24353a());
        }
    }

    /* renamed from: a */
    public List mo23886a() {
        return this.f24251a;
    }

    /* renamed from: b */
    public List mo23887b() {
        return this.f24253c;
    }

    /* renamed from: c */
    public List mo23888c() {
        return this.f24252b;
    }
}

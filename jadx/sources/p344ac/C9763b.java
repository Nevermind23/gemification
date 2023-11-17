package p344ac;

import p200ob.C7507a;

/* renamed from: ac.b */
final class C9763b extends C9767f {
    C9763b(C7507a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo26216h(StringBuilder sb, int i) {
        if (i < 10000) {
            sb.append("(3202)");
        } else {
            sb.append("(3203)");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo26217i(int i) {
        return i < 10000 ? i : i - 10000;
    }
}

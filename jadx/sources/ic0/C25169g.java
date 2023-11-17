package ic0;

/* renamed from: ic0.g */
public abstract class C25169g {
    /* renamed from: a */
    public static final C25168f m80234a(int i) {
        boolean z;
        for (C25168f fVar : C25168f.values()) {
            if (fVar.ordinal() == i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return fVar;
            }
        }
        return null;
    }
}

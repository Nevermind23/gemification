package ef1;

/* renamed from: ef1.q1 */
public class C40856q1 extends C40871v1 implements C40875w {

    /* renamed from: e */
    private final boolean f96567e = m118429K0();

    public C40856q1(C40845o1 o1Var) {
        super(true);
        mo95237g0(o1Var);
    }

    /* renamed from: K0 */
    private final boolean m118429K0() {
        C40866u uVar;
        C40871v1 y;
        C40866u uVar2;
        C40863t c0 = mo95235c0();
        if (c0 instanceof C40866u) {
            uVar = (C40866u) c0;
        } else {
            uVar = null;
        }
        if (!(uVar == null || (y = uVar.mo95227y()) == null)) {
            while (!y.mo95220Y()) {
                C40863t c02 = y.mo95235c0();
                if (c02 instanceof C40866u) {
                    uVar2 = (C40866u) c02;
                } else {
                    uVar2 = null;
                }
                if (uVar2 != null) {
                    y = uVar2.mo95227y();
                    if (y == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    public boolean mo95220Y() {
        return this.f96567e;
    }

    /* renamed from: Z */
    public boolean mo95221Z() {
        return true;
    }
}

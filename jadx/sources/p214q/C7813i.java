package p214q;

import java.util.ArrayList;
import java.util.Arrays;
import p227r.C8016i;
import p227r.C8024o;

/* renamed from: q.i */
public abstract class C7813i extends C7806e implements C7812h {

    /* renamed from: L0 */
    public C7806e[] f22710L0 = new C7806e[4];

    /* renamed from: M0 */
    public int f22711M0 = 0;

    /* renamed from: a */
    public void mo22728a(C7806e eVar) {
        if (eVar != this && eVar != null) {
            int i = this.f22711M0 + 1;
            C7806e[] eVarArr = this.f22710L0;
            if (i > eVarArr.length) {
                this.f22710L0 = (C7806e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
            }
            C7806e[] eVarArr2 = this.f22710L0;
            int i2 = this.f22711M0;
            eVarArr2[i2] = eVar;
            this.f22711M0 = i2 + 1;
        }
    }

    /* renamed from: b */
    public void mo22729b() {
        this.f22711M0 = 0;
        Arrays.fill(this.f22710L0, (Object) null);
    }

    /* renamed from: c */
    public void mo22730c(C7809f fVar) {
    }

    /* renamed from: n1 */
    public void mo22731n1(ArrayList arrayList, int i, C8024o oVar) {
        for (int i2 = 0; i2 < this.f22711M0; i2++) {
            oVar.mo23185a(this.f22710L0[i2]);
        }
        for (int i3 = 0; i3 < this.f22711M0; i3++) {
            C8016i.m30448a(this.f22710L0[i3], i, arrayList, oVar);
        }
    }

    /* renamed from: o1 */
    public int mo22732o1(int i) {
        int i2;
        int i3;
        for (int i4 = 0; i4 < this.f22711M0; i4++) {
            C7806e eVar = this.f22710L0[i4];
            if (i == 0 && (i3 = eVar.f22593I0) != -1) {
                return i3;
            }
            if (i == 1 && (i2 = eVar.f22595J0) != -1) {
                return i2;
            }
        }
        return -1;
    }
}

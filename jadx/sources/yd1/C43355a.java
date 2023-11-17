package yd1;

import ed1.C40756v;
import jd1.C41407n;
import uh1.C43107b;

/* renamed from: yd1.a */
public class C43355a {

    /* renamed from: a */
    final int f101196a;

    /* renamed from: b */
    final Object[] f101197b;

    /* renamed from: c */
    Object[] f101198c;

    /* renamed from: d */
    int f101199d;

    /* renamed from: yd1.a$a */
    public interface C43356a extends C41407n {
        boolean test(Object obj);
    }

    public C43355a(int i) {
        this.f101196a = i;
        Object[] objArr = new Object[(i + 1)];
        this.f101197b = objArr;
        this.f101198c = objArr;
    }

    /* renamed from: a */
    public boolean mo102029a(C40756v vVar) {
        Object[] objArr = this.f101197b;
        int i = this.f101196a;
        while (true) {
            int i2 = 0;
            if (objArr == null) {
                return false;
            }
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (C43367k.m124420b(objArr2, vVar)) {
                    return true;
                } else {
                    i2++;
                }
            }
            objArr = objArr[i];
        }
    }

    /* renamed from: b */
    public boolean mo102030b(C43107b bVar) {
        Object[] objArr = this.f101197b;
        int i = this.f101196a;
        while (true) {
            int i2 = 0;
            if (objArr == null) {
                return false;
            }
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (C43367k.m124421c(objArr2, bVar)) {
                    return true;
                } else {
                    i2++;
                }
            }
            objArr = objArr[i];
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo102031c(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f101196a
            int r1 = r3.f101199d
            if (r1 != r0) goto L_0x0011
            int r1 = r0 + 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object[] r2 = r3.f101198c
            r2[r0] = r1
            r3.f101198c = r1
            r1 = 0
        L_0x0011:
            java.lang.Object[] r0 = r3.f101198c
            r0[r1] = r4
            int r1 = r1 + 1
            r3.f101199d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yd1.C43355a.mo102031c(java.lang.Object):void");
    }

    /* renamed from: d */
    public void mo102032d(C43356a aVar) {
        int i = this.f101196a;
        for (Object[] objArr = this.f101197b; objArr != null; objArr = objArr[i]) {
            int i2 = 0;
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (!aVar.test(objArr2)) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    public void mo102033e(Object obj) {
        this.f101197b[0] = obj;
    }
}

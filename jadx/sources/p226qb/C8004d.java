package p226qb;

import java.util.ArrayList;
import java.util.List;

/* renamed from: qb.d */
public final class C8004d {

    /* renamed from: a */
    private final C8001a f23069a;

    /* renamed from: b */
    private final List f23070b;

    public C8004d(C8001a aVar) {
        this.f23069a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f23070b = arrayList;
        arrayList.add(new C8002b(aVar, new int[]{1}));
    }

    /* renamed from: a */
    private C8002b m30401a(int i) {
        if (i >= this.f23070b.size()) {
            List list = this.f23070b;
            C8002b bVar = (C8002b) list.get(list.size() - 1);
            for (int size = this.f23070b.size(); size <= i; size++) {
                C8001a aVar = this.f23069a;
                bVar = bVar.mo23152i(new C8002b(aVar, new int[]{1, aVar.mo23135c((size - 1) + aVar.mo23136d())}));
                this.f23070b.add(bVar);
            }
        }
        return (C8002b) this.f23070b.get(i);
    }

    /* renamed from: b */
    public void mo23156b(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                C8002b a = m30401a(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] e = new C8002b(this.f23069a, iArr2).mo23153j(i, 1).mo23145b(a)[1].mo23148e();
                int length2 = i - e.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr[length + i2] = 0;
                }
                System.arraycopy(e, 0, iArr, length + length2, e.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}

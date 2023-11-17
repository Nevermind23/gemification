package p255t1;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import p319y1.C9018i;

/* renamed from: t1.l */
public class C8320l implements C8322m, C8318j {

    /* renamed from: a */
    private final Path f23636a = new Path();

    /* renamed from: b */
    private final Path f23637b = new Path();

    /* renamed from: c */
    private final Path f23638c = new Path();

    /* renamed from: d */
    private final String f23639d;

    /* renamed from: e */
    private final List f23640e = new ArrayList();

    /* renamed from: f */
    private final C9018i f23641f;

    /* renamed from: t1.l$a */
    static /* synthetic */ class C8321a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23642a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                y1.i$a[] r0 = p319y1.C9018i.C9019a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23642a = r0
                y1.i$a r1 = p319y1.C9018i.C9019a.MERGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23642a     // Catch:{ NoSuchFieldError -> 0x001d }
                y1.i$a r1 = p319y1.C9018i.C9019a.ADD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23642a     // Catch:{ NoSuchFieldError -> 0x0028 }
                y1.i$a r1 = p319y1.C9018i.C9019a.SUBTRACT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f23642a     // Catch:{ NoSuchFieldError -> 0x0033 }
                y1.i$a r1 = p319y1.C9018i.C9019a.INTERSECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f23642a     // Catch:{ NoSuchFieldError -> 0x003e }
                y1.i$a r1 = p319y1.C9018i.C9019a.EXCLUDE_INTERSECTIONS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p255t1.C8320l.C8321a.<clinit>():void");
        }
    }

    public C8320l(C9018i iVar) {
        this.f23639d = iVar.mo24452c();
        this.f23641f = iVar;
    }

    /* renamed from: a */
    private void m31238a() {
        for (int i = 0; i < this.f23640e.size(); i++) {
            this.f23638c.addPath(((C8322m) this.f23640e.get(i)).mo23480z());
        }
    }

    /* renamed from: c */
    private void m31239c(Path.Op op) {
        this.f23637b.reset();
        this.f23636a.reset();
        for (int size = this.f23640e.size() - 1; size >= 1; size--) {
            C8322m mVar = (C8322m) this.f23640e.get(size);
            if (mVar instanceof C8312d) {
                C8312d dVar = (C8312d) mVar;
                List k = dVar.mo23478k();
                for (int size2 = k.size() - 1; size2 >= 0; size2--) {
                    Path z = ((C8322m) k.get(size2)).mo23480z();
                    z.transform(dVar.mo23479l());
                    this.f23637b.addPath(z);
                }
            } else {
                this.f23637b.addPath(mVar.mo23480z());
            }
        }
        C8322m mVar2 = (C8322m) this.f23640e.get(0);
        if (mVar2 instanceof C8312d) {
            C8312d dVar2 = (C8312d) mVar2;
            List k2 = dVar2.mo23478k();
            for (int i = 0; i < k2.size(); i++) {
                Path z2 = ((C8322m) k2.get(i)).mo23480z();
                z2.transform(dVar2.mo23479l());
                this.f23636a.addPath(z2);
            }
        } else {
            this.f23636a.set(mVar2.mo23480z());
        }
        this.f23638c.op(this.f23636a, this.f23637b, op);
    }

    /* renamed from: b */
    public void mo23469b(List list, List list2) {
        for (int i = 0; i < this.f23640e.size(); i++) {
            ((C8322m) this.f23640e.get(i)).mo23469b(list, list2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23481g(java.util.ListIterator r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r3.previous()
            if (r0 == r2) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r3.previous()
            t1.c r0 = (p255t1.C8311c) r0
            boolean r1 = r0 instanceof p255t1.C8322m
            if (r1 == 0) goto L_0x000d
            java.util.List r1 = r2.f23640e
            t1.m r0 = (p255t1.C8322m) r0
            r1.add(r0)
            r3.remove()
            goto L_0x000d
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p255t1.C8320l.mo23481g(java.util.ListIterator):void");
    }

    /* renamed from: z */
    public Path mo23480z() {
        this.f23638c.reset();
        if (this.f23641f.mo24453d()) {
            return this.f23638c;
        }
        int i = C8321a.f23642a[this.f23641f.mo24451b().ordinal()];
        if (i == 1) {
            m31238a();
        } else if (i == 2) {
            m31239c(Path.Op.UNION);
        } else if (i == 3) {
            m31239c(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            m31239c(Path.Op.INTERSECT);
        } else if (i == 5) {
            m31239c(Path.Op.XOR);
        }
        return this.f23638c;
    }
}

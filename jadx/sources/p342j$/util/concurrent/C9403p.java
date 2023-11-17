package p342j$.util.concurrent;

/* renamed from: j$.util.concurrent.p */
class C9403p {

    /* renamed from: a */
    C9399l[] f26019a;

    /* renamed from: b */
    C9399l f26020b = null;

    /* renamed from: c */
    C9402o f26021c;

    /* renamed from: d */
    C9402o f26022d;

    /* renamed from: e */
    int f26023e;

    /* renamed from: f */
    int f26024f;

    /* renamed from: g */
    int f26025g;

    /* renamed from: h */
    final int f26026h;

    C9403p(C9399l[] lVarArr, int i, int i2, int i3) {
        this.f26019a = lVarArr;
        this.f26026h = i;
        this.f26023e = i2;
        this.f26024f = i2;
        this.f26025g = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C9399l mo25406b() {
        C9399l lVar;
        C9399l[] lVarArr;
        int length;
        int i;
        C9402o oVar;
        C9399l lVar2 = this.f26020b;
        if (lVar2 != null) {
            lVar2 = lVar2.f26014d;
        }
        while (lVar == null) {
            if (this.f26024f >= this.f26025g || (lVarArr = this.f26019a) == null || (length = lVarArr.length) <= (i = this.f26023e) || i < 0) {
                this.f26020b = null;
                return null;
            }
            C9399l m = ConcurrentHashMap.m34689m(lVarArr, i);
            if (m == null || m.f26011a >= 0) {
                lVar = m;
            } else if (m instanceof C9394g) {
                this.f26019a = ((C9394g) m).f26004e;
                C9402o oVar2 = this.f26022d;
                if (oVar2 != null) {
                    this.f26022d = oVar2.f26018d;
                } else {
                    oVar2 = new C9402o();
                }
                oVar2.f26017c = lVarArr;
                oVar2.f26015a = length;
                oVar2.f26016b = i;
                oVar2.f26018d = this.f26021c;
                this.f26021c = oVar2;
                lVar = null;
            } else {
                lVar = m instanceof C9404q ? ((C9404q) m).f26030f : null;
            }
            if (this.f26021c != null) {
                while (true) {
                    oVar = this.f26021c;
                    if (oVar == null) {
                        break;
                    }
                    int i2 = this.f26023e;
                    int i3 = oVar.f26015a;
                    int i4 = i2 + i3;
                    this.f26023e = i4;
                    if (i4 < length) {
                        break;
                    }
                    this.f26023e = oVar.f26016b;
                    this.f26019a = oVar.f26017c;
                    oVar.f26017c = null;
                    C9402o oVar3 = oVar.f26018d;
                    oVar.f26018d = this.f26022d;
                    this.f26021c = oVar3;
                    this.f26022d = oVar;
                    length = i3;
                }
                if (oVar == null) {
                    int i5 = this.f26023e + this.f26026h;
                    this.f26023e = i5;
                    if (i5 >= length) {
                        int i6 = this.f26024f + 1;
                        this.f26024f = i6;
                        this.f26023e = i6;
                    }
                }
            } else {
                int i7 = i + this.f26026h;
                this.f26023e = i7;
                if (i7 >= length) {
                    int i8 = this.f26024f + 1;
                    this.f26024f = i8;
                    this.f26023e = i8;
                }
            }
        }
        this.f26020b = lVar;
        return lVar;
    }
}

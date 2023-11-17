package p213pb;

import com.google.zxing.C5766o;
import com.google.zxing.NotFoundException;
import p200ob.C7508b;

/* renamed from: pb.b */
public final class C7799b {

    /* renamed from: a */
    private final C7508b f22522a;

    /* renamed from: b */
    private final int f22523b;

    /* renamed from: c */
    private final int f22524c;

    /* renamed from: d */
    private final int f22525d;

    /* renamed from: e */
    private final int f22526e;

    /* renamed from: f */
    private final int f22527f;

    /* renamed from: g */
    private final int f22528g;

    public C7799b(C7508b bVar) {
        this(bVar, 10, bVar.mo21982l() / 2, bVar.mo21978h() / 2);
    }

    /* renamed from: a */
    private C5766o[] m29511a(C5766o oVar, C5766o oVar2, C5766o oVar3, C5766o oVar4) {
        float c = oVar.mo18901c();
        float d = oVar.mo18902d();
        float c2 = oVar2.mo18901c();
        float d2 = oVar2.mo18902d();
        float c3 = oVar3.mo18901c();
        float d3 = oVar3.mo18902d();
        float c4 = oVar4.mo18901c();
        float d4 = oVar4.mo18902d();
        if (c < ((float) this.f22524c) / 2.0f) {
            return new C5766o[]{new C5766o(c4 - 1.0f, d4 + 1.0f), new C5766o(c2 + 1.0f, d2 + 1.0f), new C5766o(c3 - 1.0f, d3 - 1.0f), new C5766o(c + 1.0f, d - 1.0f)};
        }
        return new C5766o[]{new C5766o(c4 + 1.0f, d4 + 1.0f), new C5766o(c2 + 1.0f, d2 - 1.0f), new C5766o(c3 - 1.0f, d3 + 1.0f), new C5766o(c - 1.0f, d - 1.0f)};
    }

    /* renamed from: b */
    private boolean m29512b(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.f22522a.mo21974e(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.f22522a.mo21974e(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: d */
    private C5766o m29513d(float f, float f2, float f3, float f4) {
        int c = C7798a.m29509c(C7798a.m29507a(f, f2, f3, f4));
        float f5 = (float) c;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < c; i++) {
            float f8 = (float) i;
            int c2 = C7798a.m29509c((f8 * f6) + f);
            int c3 = C7798a.m29509c((f8 * f7) + f2);
            if (this.f22522a.mo21974e(c2, c3)) {
                return new C5766o((float) c2, (float) c3);
            }
        }
        return null;
    }

    /* renamed from: c */
    public C5766o[] mo22553c() {
        int i = this.f22525d;
        int i2 = this.f22526e;
        int i3 = this.f22528g;
        int i4 = this.f22527f;
        boolean z = false;
        int i5 = 1;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = true;
        while (true) {
            if (!z6) {
                break;
            }
            boolean z7 = false;
            boolean z8 = true;
            while (true) {
                if ((z8 || !z2) && i2 < this.f22524c) {
                    z8 = m29512b(i3, i4, i2, false);
                    if (z8) {
                        i2++;
                        z2 = true;
                        z7 = true;
                    } else if (!z2) {
                        i2++;
                    }
                }
            }
            if (i2 < this.f22524c) {
                boolean z9 = true;
                while (true) {
                    if ((z9 || !z3) && i4 < this.f22523b) {
                        z9 = m29512b(i, i2, i4, true);
                        if (z9) {
                            i4++;
                            z3 = true;
                            z7 = true;
                        } else if (!z3) {
                            i4++;
                        }
                    }
                }
                if (i4 < this.f22523b) {
                    boolean z12 = true;
                    while (true) {
                        if ((z12 || !z4) && i >= 0) {
                            z12 = m29512b(i3, i4, i, false);
                            if (z12) {
                                i--;
                                z4 = true;
                                z7 = true;
                            } else if (!z4) {
                                i--;
                            }
                        }
                    }
                    if (i >= 0) {
                        z6 = z7;
                        boolean z13 = true;
                        while (true) {
                            if ((z13 || !z5) && i3 >= 0) {
                                z13 = m29512b(i, i2, i3, true);
                                if (z13) {
                                    i3--;
                                    z6 = true;
                                    z5 = true;
                                } else if (!z5) {
                                    i3--;
                                }
                            }
                        }
                        if (i3 < 0) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        z = true;
        if (!z) {
            int i6 = i2 - i;
            C5766o oVar = null;
            int i7 = 1;
            C5766o oVar2 = null;
            while (oVar2 == null && i7 < i6) {
                oVar2 = m29513d((float) i, (float) (i4 - i7), (float) (i + i7), (float) i4);
                i7++;
            }
            if (oVar2 != null) {
                int i8 = 1;
                C5766o oVar3 = null;
                while (oVar3 == null && i8 < i6) {
                    oVar3 = m29513d((float) i, (float) (i3 + i8), (float) (i + i8), (float) i3);
                    i8++;
                }
                if (oVar3 != null) {
                    int i9 = 1;
                    C5766o oVar4 = null;
                    while (oVar4 == null && i9 < i6) {
                        oVar4 = m29513d((float) i2, (float) (i3 + i9), (float) (i2 - i9), (float) i3);
                        i9++;
                    }
                    if (oVar4 != null) {
                        while (oVar == null && i5 < i6) {
                            oVar = m29513d((float) i2, (float) (i4 - i5), (float) (i2 - i5), (float) i4);
                            i5++;
                        }
                        if (oVar != null) {
                            return m29511a(oVar, oVar2, oVar4, oVar3);
                        }
                        throw NotFoundException.m23155a();
                    }
                    throw NotFoundException.m23155a();
                }
                throw NotFoundException.m23155a();
            }
            throw NotFoundException.m23155a();
        }
        throw NotFoundException.m23155a();
    }

    public C7799b(C7508b bVar, int i, int i2, int i3) {
        this.f22522a = bVar;
        int h = bVar.mo21978h();
        this.f22523b = h;
        int l = bVar.mo21982l();
        this.f22524c = l;
        int i4 = i / 2;
        int i5 = i2 - i4;
        this.f22525d = i5;
        int i6 = i2 + i4;
        this.f22526e = i6;
        int i7 = i3 - i4;
        this.f22528g = i7;
        int i8 = i3 + i4;
        this.f22527f = i8;
        if (i7 < 0 || i5 < 0 || i8 >= h || i6 >= l) {
            throw NotFoundException.m23155a();
        }
    }
}

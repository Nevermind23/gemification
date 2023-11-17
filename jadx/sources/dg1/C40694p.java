package dg1;

import ie1.C41308c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: dg1.p */
public final class C40694p extends C41308c implements RandomAccess {

    /* renamed from: g */
    public static final C40695a f96352g = new C40695a((DefaultConstructorMarker) null);

    /* renamed from: e */
    private final C40681e[] f96353e;

    /* renamed from: f */
    private final int[] f96354f;

    /* renamed from: dg1.p$a */
    public static final class C40695a {
        private C40695a() {
        }

        public /* synthetic */ C40695a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final void m117792a(long j, C40672b bVar, int i, List list, int i2, int i3, List list2) {
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            C40672b bVar2;
            C40672b bVar3 = bVar;
            int i9 = i;
            List list3 = list;
            int i12 = i2;
            int i13 = i3;
            List list4 = list2;
            if (i12 < i13) {
                if (i12 < i13) {
                    int i14 = i12;
                    while (true) {
                        int i15 = i14 + 1;
                        if (!(((C40681e) list3.get(i14)).mo94793B() >= i9)) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        } else if (i15 >= i13) {
                            break;
                        } else {
                            i14 = i15;
                        }
                    }
                }
                C40681e eVar = (C40681e) list.get(i2);
                C40681e eVar2 = (C40681e) list3.get(i13 - 1);
                int i16 = -1;
                if (i9 == eVar.mo94793B()) {
                    int intValue = ((Number) list4.get(i12)).intValue();
                    int i17 = i12 + 1;
                    i4 = i17;
                    i5 = intValue;
                    eVar = (C40681e) list3.get(i17);
                } else {
                    i4 = i12;
                    i5 = -1;
                }
                if (eVar.mo94804f(i9) != eVar2.mo94804f(i9)) {
                    int i18 = i4 + 1;
                    int i19 = 1;
                    if (i18 < i13) {
                        while (true) {
                            int i22 = i18 + 1;
                            if (((C40681e) list3.get(i18 - 1)).mo94804f(i9) != ((C40681e) list3.get(i18)).mo94804f(i9)) {
                                i19++;
                            }
                            if (i22 >= i13) {
                                break;
                            }
                            i18 = i22;
                        }
                    }
                    long c = j + m117794c(bVar3) + ((long) 2) + ((long) (i19 * 2));
                    bVar3.mo94711P(i19);
                    bVar3.mo94711P(i5);
                    if (i4 < i13) {
                        int i23 = i4;
                        while (true) {
                            int i24 = i23 + 1;
                            byte f = ((C40681e) list3.get(i23)).mo94804f(i9);
                            if (i23 == i4 || f != ((C40681e) list3.get(i23 - 1)).mo94804f(i9)) {
                                bVar3.mo94711P(f & 255);
                            }
                            if (i24 >= i13) {
                                break;
                            }
                            i23 = i24;
                        }
                    }
                    C40672b bVar4 = new C40672b();
                    while (i4 < i13) {
                        byte f2 = ((C40681e) list3.get(i4)).mo94804f(i9);
                        int i25 = i4 + 1;
                        if (i25 < i13) {
                            int i26 = i25;
                            while (true) {
                                int i27 = i26 + 1;
                                if (f2 != ((C40681e) list3.get(i26)).mo94804f(i9)) {
                                    i7 = i26;
                                    break;
                                } else if (i27 >= i13) {
                                    break;
                                } else {
                                    i26 = i27;
                                }
                            }
                        }
                        i7 = i13;
                        if (i25 == i7 && i9 + 1 == ((C40681e) list3.get(i4)).mo94793B()) {
                            bVar3.mo94711P(((Number) list4.get(i4)).intValue());
                            i8 = i7;
                            bVar2 = bVar4;
                        } else {
                            bVar3.mo94711P(((int) (c + m117794c(bVar4))) * i16);
                            i8 = i7;
                            bVar2 = bVar4;
                            m117792a(c, bVar4, i9 + 1, list, i4, i7, list2);
                        }
                        bVar4 = bVar2;
                        i4 = i8;
                        i16 = -1;
                    }
                    bVar3.mo94741l1(bVar4);
                    return;
                }
                int min = Math.min(eVar.mo94793B(), eVar2.mo94793B());
                if (i9 < min) {
                    int i28 = i9;
                    i6 = 0;
                    while (true) {
                        int i29 = i28 + 1;
                        if (eVar.mo94804f(i28) != eVar2.mo94804f(i28)) {
                            break;
                        }
                        i6++;
                        if (i29 >= min) {
                            break;
                        }
                        i28 = i29;
                    }
                } else {
                    i6 = 0;
                }
                long c2 = j + m117794c(bVar3) + ((long) 2) + ((long) i6) + 1;
                bVar3.mo94711P(-i6);
                bVar3.mo94711P(i5);
                int i32 = i9 + i6;
                if (i9 < i32) {
                    while (true) {
                        int i33 = i9 + 1;
                        bVar3.mo94711P(eVar.mo94804f(i9) & 255);
                        if (i33 >= i32) {
                            break;
                        }
                        i9 = i33;
                    }
                }
                if (i4 + 1 == i13) {
                    if (i32 == ((C40681e) list3.get(i4)).mo94793B()) {
                        bVar3.mo94711P(((Number) list4.get(i4)).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                C40672b bVar5 = new C40672b();
                bVar3.mo94711P(((int) (m117794c(bVar5) + c2)) * -1);
                m117792a(c2, bVar5, i32, list, i4, i3, list2);
                bVar3.mo94741l1(bVar5);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: b */
        static /* synthetic */ void m117793b(C40695a aVar, long j, C40672b bVar, int i, List list, int i2, int i3, List list2, int i4, Object obj) {
            aVar.m117792a((i4 & 1) != 0 ? 0 : j, bVar, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        /* renamed from: c */
        private final long m117794c(C40672b bVar) {
            return bVar.mo94709M0() / ((long) 4);
        }

        /* renamed from: d */
        public final C40694p mo94841d(C40681e... eVarArr) {
            boolean z;
            boolean z2;
            boolean z3;
            C40681e[] eVarArr2 = eVarArr;
            C41536l.m120489i(eVarArr2, "byteStrings");
            int i = 0;
            if (eVarArr2.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new C40694p(new C40681e[0], new int[]{0, -1}, (DefaultConstructorMarker) null);
            }
            List Q = C41333m.m119790Q(eVarArr);
            C41349u.m119945x(Q);
            ArrayList arrayList = new ArrayList(eVarArr2.length);
            for (C40681e eVar : eVarArr2) {
                arrayList.add(-1);
            }
            Object[] array = arrayList.toArray(new Integer[0]);
            if (array != null) {
                Integer[] numArr = (Integer[]) array;
                List p = C41341q.m119913p(Arrays.copyOf(numArr, numArr.length));
                int length = eVarArr2.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    p.set(C41341q.m119906i(Q, eVarArr2[i2], 0, 0, 6, (Object) null), Integer.valueOf(i3));
                    i2++;
                    i3++;
                }
                if (((C40681e) Q.get(0)).mo94793B() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    int i4 = 0;
                    while (i4 < Q.size()) {
                        C40681e eVar2 = (C40681e) Q.get(i4);
                        int i5 = i4 + 1;
                        int i6 = i5;
                        while (i6 < Q.size()) {
                            C40681e eVar3 = (C40681e) Q.get(i6);
                            if (!eVar3.mo94794C(eVar2)) {
                                continue;
                                break;
                            }
                            if (eVar3.mo94793B() != eVar2.mo94793B()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                throw new IllegalArgumentException(C41536l.m120497q("duplicate option: ", eVar3).toString());
                            } else if (((Number) p.get(i6)).intValue() > ((Number) p.get(i4)).intValue()) {
                                Q.remove(i6);
                                p.remove(i6);
                            } else {
                                i6++;
                            }
                        }
                        i4 = i5;
                    }
                    C40672b bVar = new C40672b();
                    m117793b(this, 0, bVar, 0, Q, 0, 0, p, 53, (Object) null);
                    int[] iArr = new int[((int) m117794c(bVar))];
                    while (!bVar.mo94714Q0()) {
                        iArr[i] = bVar.readInt();
                        i++;
                    }
                    Object[] copyOf = Arrays.copyOf(eVarArr2, eVarArr2.length);
                    C41536l.m120488h(copyOf, "java.util.Arrays.copyOf(this, size)");
                    return new C40694p((C40681e[]) copyOf, iArr, (DefaultConstructorMarker) null);
                }
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public /* synthetic */ C40694p(C40681e[] eVarArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVarArr, iArr);
    }

    /* renamed from: r */
    public static final C40694p m117784r(C40681e... eVarArr) {
        return f96352g.mo94841d(eVarArr);
    }

    /* renamed from: b */
    public int mo94472b() {
        return this.f96353e.length;
    }

    /* renamed from: c */
    public /* bridge */ boolean mo94835c(C40681e eVar) {
        return super.contains(eVar);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C40681e)) {
            return false;
        }
        return mo94835c((C40681e) obj);
    }

    /* renamed from: i */
    public C40681e get(int i) {
        return this.f96353e[i];
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C40681e)) {
            return -1;
        }
        return mo94839n((C40681e) obj);
    }

    /* renamed from: j */
    public final C40681e[] mo94837j() {
        return this.f96353e;
    }

    /* renamed from: l */
    public final int[] mo94838l() {
        return this.f96354f;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof C40681e)) {
            return -1;
        }
        return mo94840o((C40681e) obj);
    }

    /* renamed from: n */
    public /* bridge */ int mo94839n(C40681e eVar) {
        return super.indexOf(eVar);
    }

    /* renamed from: o */
    public /* bridge */ int mo94840o(C40681e eVar) {
        return super.lastIndexOf(eVar);
    }

    private C40694p(C40681e[] eVarArr, int[] iArr) {
        this.f96353e = eVarArr;
        this.f96354f = iArr;
    }
}

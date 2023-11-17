package com.facetec.sdk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facetec.sdk.x */
final class C3669x {

    /* renamed from: a */
    C3534r f11696a = new C3534r();

    /* renamed from: b */
    List<C3534r> f11697b = new ArrayList();

    /* renamed from: c */
    List<List<List<Integer>>> f11698c = new ArrayList();

    /* renamed from: d */
    List<List<Integer>> f11699d = new ArrayList();

    /* renamed from: e */
    List<C3534r> f11700e = new ArrayList();

    /* renamed from: f */
    int f11701f = 0;

    /* renamed from: g */
    boolean f11702g = false;

    /* renamed from: i */
    boolean f11703i = false;

    /* renamed from: j */
    boolean f11704j = false;

    C3669x() {
    }

    /* renamed from: c */
    private C2769ac m13944c(int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < this.f11697b.size(); i4++) {
            C3534r rVar = this.f11697b.get(i4);
            int i5 = 0;
            for (int i6 = 0; i6 < rVar.f11432d.size(); i6++) {
                List list = rVar.f11432d.get(i6);
                int i7 = i2 + i5;
                if (i3 == i && i7 < rVar.f11430b.size()) {
                    return rVar.f11430b.get(i7);
                }
                i3++;
                i5 += list.size();
            }
        }
        return new C2769ac();
    }

    /* renamed from: e */
    static List<List<Integer>> m13945e(List<C3534r> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.addAll(list.get(i).f11432d);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo10129b(List<List<Integer>> list, int i, C3690y yVar) {
        int i2;
        int i3;
        ArrayList arrayList;
        int i4;
        int i5;
        List list2;
        List list3;
        List list4;
        int i6;
        boolean z;
        int i7;
        int i8;
        int i9;
        ArrayList arrayList2;
        C2769ac acVar;
        int intValue;
        List<List<Integer>> list5 = list;
        int i12 = i;
        C3690y yVar2 = yVar;
        int i13 = 0;
        if (list.size() <= i12) {
            return false;
        }
        List asList = Arrays.asList(C3711z.m13952d(C3711z.m13955f(list5.subList(0, i12))));
        int i14 = i12;
        int i15 = 0;
        while (true) {
            int i16 = 1;
            if (i14 >= list.size()) {
                return i15 > 0;
            }
            List list6 = list5.get(i14);
            int i17 = i13;
            while (true) {
                if (i17 >= list6.size()) {
                    i2 = i13;
                    i3 = i2;
                    break;
                } else if (asList.contains(list6.get(i17))) {
                    i2 = Math.max(i13, (i17 - 3) - 1);
                    i3 = 1;
                    break;
                } else {
                    i17 += 3;
                }
            }
            if (yVar2 == C3690y.INTRA_SESSION || i3 != 0) {
                while (i2 < list6.size()) {
                    ArrayList arrayList3 = new ArrayList();
                    int i18 = i13;
                    while (true) {
                        int i19 = i2 + i18;
                        if (i19 >= list6.size()) {
                            break;
                        }
                        int intValue2 = ((Integer) list6.get(i19)).intValue();
                        arrayList3.add(Integer.valueOf(intValue2));
                        if (m13943b(arrayList3)) {
                            break;
                        }
                        if (intValue2 == ((Integer) arrayList3.get(arrayList3.size() - i16)).intValue()) {
                            while (true) {
                                i19++;
                                if (i19 >= list6.size() || intValue2 != (intValue = ((Integer) list6.get(i19)).intValue())) {
                                    break;
                                }
                                arrayList3.add(Integer.valueOf(intValue));
                                i18++;
                            }
                        }
                        i18 += i16;
                    }
                    if (m13943b(arrayList3)) {
                        int i22 = i13;
                        while (i22 < list.size() && (yVar2 == C3690y.INTRA_SESSION || i22 < i12)) {
                            List list7 = list5.get(i22);
                            int i23 = i13;
                            while (i23 < list7.size() - arrayList3.size()) {
                                ArrayList arrayList4 = new ArrayList();
                                int i24 = i13;
                                while (i24 < arrayList3.size()) {
                                    int intValue3 = ((Integer) list7.get(i23 + i24)).intValue();
                                    boolean z2 = intValue3 == ((Integer) arrayList3.get(i24)).intValue();
                                    boolean z3 = i23 == i2 && i22 == i14;
                                    if (!z2 || z3) {
                                        break;
                                    }
                                    arrayList4.add(Integer.valueOf(intValue3));
                                    if (arrayList4.size() == arrayList3.size()) {
                                        int i25 = i15 + 1;
                                        ArrayList arrayList5 = new ArrayList();
                                        ArrayList arrayList6 = new ArrayList();
                                        list4 = asList;
                                        if (yVar2 == C3690y.INTER_FACETEC_SESSION) {
                                            int i26 = 0;
                                            while (i26 < arrayList3.size()) {
                                                int i27 = i2 + i26;
                                                List list8 = list6;
                                                List list9 = list7;
                                                int i28 = 0;
                                                int i29 = 0;
                                                while (true) {
                                                    if (i28 >= this.f11700e.size()) {
                                                        i7 = i25;
                                                        i8 = i24;
                                                        i9 = i2;
                                                        arrayList2 = arrayList3;
                                                        acVar = new C2769ac();
                                                        break;
                                                    }
                                                    C3534r rVar = this.f11700e.get(i28);
                                                    i7 = i25;
                                                    i8 = i24;
                                                    i9 = i2;
                                                    int i32 = i29;
                                                    int i33 = 0;
                                                    int i34 = 0;
                                                    while (i33 < rVar.f11432d.size()) {
                                                        List list10 = rVar.f11432d.get(i33);
                                                        arrayList2 = arrayList3;
                                                        int i35 = i27 + i34;
                                                        int i36 = i27;
                                                        if (i32 == i14 && i35 < rVar.f11430b.size()) {
                                                            acVar = rVar.f11430b.get(i35);
                                                            break;
                                                        }
                                                        i32++;
                                                        i34 += list10.size();
                                                        i33++;
                                                        arrayList3 = arrayList2;
                                                        i27 = i36;
                                                    }
                                                    int i37 = i27;
                                                    ArrayList arrayList7 = arrayList3;
                                                    i28++;
                                                    i29 = i32;
                                                    i24 = i8;
                                                    i25 = i7;
                                                    i2 = i9;
                                                }
                                                arrayList5.add(acVar);
                                                i26++;
                                                list6 = list8;
                                                list7 = list9;
                                                i24 = i8;
                                                i25 = i7;
                                                i2 = i9;
                                                arrayList3 = arrayList2;
                                            }
                                            i6 = i25;
                                            list3 = list6;
                                            i5 = i24;
                                            i4 = i2;
                                            arrayList = arrayList3;
                                            list2 = list7;
                                            for (int i38 = 0; i38 < arrayList4.size(); i38++) {
                                                arrayList6.add(m13944c(i22, i23 + i38));
                                            }
                                            this.f11696a.f11437i.add(new ArrayList(Arrays.asList(new List[]{arrayList5, arrayList6})));
                                            z = true;
                                        } else {
                                            i6 = i25;
                                            list3 = list6;
                                            i5 = i24;
                                            i4 = i2;
                                            arrayList = arrayList3;
                                            list2 = list7;
                                            int i39 = yVar2 != C3690y.INTRA_SESSION ? 0 : this.f11701f;
                                            for (int i42 = 0; i42 < arrayList.size(); i42++) {
                                                arrayList5.add(m13944c(i39 + i14, i4 + i42));
                                            }
                                            for (int i43 = 0; i43 < arrayList4.size(); i43++) {
                                                arrayList6.add(m13944c(i39 + i22, i23 + i43));
                                            }
                                            if (yVar2 == C3690y.INTRA_SESSION) {
                                                z = true;
                                                this.f11696a.f11433e.add(new ArrayList(Arrays.asList(new List[]{arrayList5, arrayList6})));
                                            } else {
                                                z = true;
                                                this.f11696a.f11429a.add(new ArrayList(Arrays.asList(new List[]{arrayList5, arrayList6})));
                                            }
                                        }
                                        i15 = i6;
                                        if (i15 == 5) {
                                            return z;
                                        }
                                    } else {
                                        list4 = asList;
                                        list3 = list6;
                                        i5 = i24;
                                        i4 = i2;
                                        arrayList = arrayList3;
                                        list2 = list7;
                                    }
                                    i24 = i5 + 1;
                                    List<List<Integer>> list11 = list;
                                    int i44 = i;
                                    asList = list4;
                                    list6 = list3;
                                    list7 = list2;
                                    i2 = i4;
                                    arrayList3 = arrayList;
                                }
                                i23++;
                                List<List<Integer>> list12 = list;
                                int i45 = i;
                                asList = asList;
                                list6 = list6;
                                list7 = list7;
                                i2 = i2;
                                arrayList3 = arrayList3;
                                i13 = 0;
                            }
                            List list13 = asList;
                            List list14 = list6;
                            int i46 = i2;
                            ArrayList arrayList8 = arrayList3;
                            i22++;
                            list5 = list;
                            i12 = i;
                            i13 = 0;
                        }
                    }
                    i2++;
                    list5 = list;
                    i12 = i;
                    asList = asList;
                    list6 = list6;
                    i13 = 0;
                    i16 = 1;
                }
            }
            i14++;
            list5 = list;
            i12 = i;
            asList = asList;
            i13 = 0;
        }
    }

    /* renamed from: b */
    private static boolean m13943b(List<Integer> list) {
        return list.size() >= 3 && C3711z.m13949b(list);
    }
}

package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.plo.BonusPrloUiModel;

/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusWrapperUiModel */
public final class BonusWrapperUiModel implements Parcelable {
    public static final Parcelable.Creator<BonusWrapperUiModel> CREATOR = new C21142a();

    /* renamed from: d */
    private final BonusAmexUiModel f56787d;

    /* renamed from: e */
    private final BonusPlusUiModel f56788e;

    /* renamed from: f */
    private final List f56789f;

    /* renamed from: g */
    private final List f56790g;

    /* renamed from: h */
    private final List f56791h;

    /* renamed from: i */
    private final List f56792i;

    /* renamed from: j */
    private final int f56793j;

    /* renamed from: k */
    private BonusPrloUiModel f56794k;

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusWrapperUiModel$a */
    public static final class C21142a implements Parcelable.Creator {
        /* renamed from: a */
        public final BonusWrapperUiModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            C41536l.m120489i(parcel, "parcel");
            BonusPrloUiModel bonusPrloUiModel = null;
            BonusAmexUiModel createFromParcel = parcel.readInt() == 0 ? null : BonusAmexUiModel.CREATOR.createFromParcel(parcel);
            BonusPlusUiModel createFromParcel2 = parcel.readInt() == 0 ? null : BonusPlusUiModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(BonusCashBackUiModel.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList2.add(BonusCasServiceUiModel.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                for (int i3 = 0; i3 != readInt3; i3++) {
                    arrayList3.add(CasTotalUiModel.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                for (int i4 = 0; i4 != readInt4; i4++) {
                    arrayList4.add(BonusScoolUiModel.CREATOR.createFromParcel(parcel));
                }
            }
            int readInt5 = parcel.readInt();
            if (parcel.readInt() != 0) {
                bonusPrloUiModel = BonusPrloUiModel.CREATOR.createFromParcel(parcel);
            }
            return new BonusWrapperUiModel(createFromParcel, createFromParcel2, arrayList, arrayList2, arrayList3, arrayList4, readInt5, bonusPrloUiModel);
        }

        /* renamed from: b */
        public final BonusWrapperUiModel[] newArray(int i) {
            return new BonusWrapperUiModel[i];
        }
    }

    public BonusWrapperUiModel(BonusAmexUiModel bonusAmexUiModel, BonusPlusUiModel bonusPlusUiModel, List list, List list2, List list3, List list4, int i, BonusPrloUiModel bonusPrloUiModel) {
        this.f56787d = bonusAmexUiModel;
        this.f56788e = bonusPlusUiModel;
        this.f56789f = list;
        this.f56790g = list2;
        this.f56791h = list3;
        this.f56792i = list4;
        this.f56793j = i;
        this.f56794k = bonusPrloUiModel;
    }

    /* renamed from: a */
    public final BonusAmexUiModel mo52790a() {
        return this.f56787d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel mo52791b(long r6) {
        /*
            r5 = this;
            java.util.List r0 = r5.f56790g
            r1 = 0
            if (r0 == 0) goto L_0x002d
            java.util.Iterator r0 = r0.iterator()
        L_0x0009:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r0.next()
            r3 = r2
            ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel r3 = (p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel) r3
            java.lang.Long r3 = r3.mo52714e()
            if (r3 != 0) goto L_0x001d
            goto L_0x0027
        L_0x001d:
            long r3 = r3.longValue()
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0027
            r3 = 1
            goto L_0x0028
        L_0x0027:
            r3 = 0
        L_0x0028:
            if (r3 == 0) goto L_0x0009
            r1 = r2
        L_0x002b:
            ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel r1 = (p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel) r1
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusWrapperUiModel.mo52791b(long):ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel mo52792d(long r6) {
        /*
            r5 = this;
            java.util.List r0 = r5.f56790g
            r1 = 0
            if (r0 == 0) goto L_0x002d
            java.util.Iterator r0 = r0.iterator()
        L_0x0009:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r0.next()
            r3 = r2
            ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel r3 = (p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel) r3
            java.lang.Long r3 = r3.mo52711b()
            if (r3 != 0) goto L_0x001d
            goto L_0x0027
        L_0x001d:
            long r3 = r3.longValue()
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0027
            r3 = 1
            goto L_0x0028
        L_0x0027:
            r3 = 0
        L_0x0028:
            if (r3 == 0) goto L_0x0009
            r1 = r2
        L_0x002b:
            ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel r1 = (p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel) r1
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusWrapperUiModel.mo52792d(long):ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel");
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final List mo52794e() {
        return this.f56790g;
    }

    /* renamed from: f */
    public final List mo52795f() {
        return this.f56789f;
    }

    /* renamed from: g */
    public final BonusPlusUiModel mo52796g() {
        return this.f56788e;
    }

    /* renamed from: h */
    public final List mo52797h() {
        return this.f56792i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusScoolUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusScoolUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusScoolUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusScoolUiModel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusScoolUiModel mo52798i(long r6) {
        /*
            r5 = this;
            java.util.List r0 = r5.f56792i
            r1 = 0
            if (r0 == 0) goto L_0x002d
            java.util.Iterator r0 = r0.iterator()
        L_0x0009:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r0.next()
            r3 = r2
            ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusScoolUiModel r3 = (p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusScoolUiModel) r3
            java.lang.Long r3 = r3.mo52778b()
            if (r3 != 0) goto L_0x001d
            goto L_0x0027
        L_0x001d:
            long r3 = r3.longValue()
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0027
            r3 = 1
            goto L_0x0028
        L_0x0027:
            r3 = 0
        L_0x0028:
            if (r3 == 0) goto L_0x0009
            r1 = r2
        L_0x002b:
            ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusScoolUiModel r1 = (p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusScoolUiModel) r1
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusWrapperUiModel.mo52798i(long):ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusScoolUiModel");
    }

    /* renamed from: j */
    public final int mo52799j() {
        return this.f56793j;
    }

    /* renamed from: k */
    public final void mo52800k(BonusPrloUiModel bonusPrloUiModel) {
        this.f56794k = bonusPrloUiModel;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        BonusAmexUiModel bonusAmexUiModel = this.f56787d;
        if (bonusAmexUiModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bonusAmexUiModel.writeToParcel(parcel, i);
        }
        BonusPlusUiModel bonusPlusUiModel = this.f56788e;
        if (bonusPlusUiModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bonusPlusUiModel.writeToParcel(parcel, i);
        }
        List<BonusCashBackUiModel> list = this.f56789f;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (BonusCashBackUiModel writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        List<BonusCasServiceUiModel> list2 = this.f56790g;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (BonusCasServiceUiModel writeToParcel2 : list2) {
                writeToParcel2.writeToParcel(parcel, i);
            }
        }
        List<CasTotalUiModel> list3 = this.f56791h;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            for (CasTotalUiModel writeToParcel3 : list3) {
                writeToParcel3.writeToParcel(parcel, i);
            }
        }
        List<BonusScoolUiModel> list4 = this.f56792i;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            for (BonusScoolUiModel writeToParcel4 : list4) {
                writeToParcel4.writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.f56793j);
        BonusPrloUiModel bonusPrloUiModel = this.f56794k;
        if (bonusPrloUiModel == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        bonusPrloUiModel.writeToParcel(parcel, i);
    }
}

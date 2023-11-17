package g91;

import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusAmexUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCashBackUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusPlusUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusScoolUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusWrapperUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.plo.BonusPrloUiModel;
import p950xy.C29875b;

/* renamed from: g91.g */
public class C32305g {

    /* renamed from: a */
    private List f79717a = new ArrayList();

    /* renamed from: b */
    private SparseIntArray f79718b;

    public C32305g(BonusWrapperUiModel bonusWrapperUiModel, C29875b bVar) {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        this.f79718b = sparseIntArray;
        int i = 0;
        sparseIntArray.put(16, 0);
        if (bonusWrapperUiModel.mo52796g() != null && bVar.mo70144c()) {
            this.f79717a.add(bonusWrapperUiModel.mo52796g());
            i = 1;
        }
        this.f79718b.put(8, i);
        if (bonusWrapperUiModel.mo52790a() != null && bVar.mo70142a()) {
            this.f79717a.add(bonusWrapperUiModel.mo52790a());
            i++;
        }
        this.f79718b.put(10, i);
        if (bonusWrapperUiModel.mo52795f() != null && bVar.mo70143b()) {
            this.f79717a.addAll(bonusWrapperUiModel.mo52795f());
            i++;
        }
        this.f79718b.put(15, i);
        if (bonusWrapperUiModel.mo52797h() != null && bVar.mo70145d()) {
            this.f79717a.addAll(bonusWrapperUiModel.mo52797h());
        }
    }

    /* renamed from: a */
    public Object mo72827a(int i) {
        return this.f79717a.get(i);
    }

    /* renamed from: b */
    public int mo72828b() {
        return this.f79717a.size();
    }

    /* renamed from: c */
    public int mo72829c(int i, int i2) {
        return this.f79718b.get(i) + i2;
    }

    /* renamed from: d */
    public int mo72830d(int i) {
        Object a = mo72827a(i);
        if (a instanceof BonusAmexUiModel) {
            return 8;
        }
        if (a instanceof BonusCashBackUiModel) {
            return 10;
        }
        if (a instanceof BonusPlusUiModel) {
            return 16;
        }
        if (a instanceof BonusScoolUiModel) {
            return 15;
        }
        if (a instanceof BonusCasServiceUiModel) {
            return 9;
        }
        if (a instanceof BonusPrloUiModel) {
            return 17;
        }
        return -1;
    }
}

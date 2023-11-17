package o01;

import java.util.List;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.QrWithdrawalActivity;

/* renamed from: o01.a */
public final /* synthetic */ class C37565a implements ChipGroup.C13230a {

    /* renamed from: a */
    public final /* synthetic */ QrWithdrawalActivity f90303a;

    /* renamed from: b */
    public final /* synthetic */ List f90304b;

    public /* synthetic */ C37565a(QrWithdrawalActivity qrWithdrawalActivity, List list) {
        this.f90303a = qrWithdrawalActivity;
        this.f90304b = list;
    }

    /* renamed from: a */
    public final void mo26511a(Chip chip, int i) {
        QrWithdrawalActivity.m101079j3(this.f90303a, this.f90304b, chip, i);
    }
}

package z80;

import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClaFirstStageActivity;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ClaDetailsUiModel;

/* renamed from: z80.p */
public final /* synthetic */ class C30255p implements ChipGroup.C13230a {

    /* renamed from: a */
    public final /* synthetic */ ClaDetailsUiModel f76154a;

    /* renamed from: b */
    public final /* synthetic */ ClaFirstStageActivity f76155b;

    public /* synthetic */ C30255p(ClaDetailsUiModel claDetailsUiModel, ClaFirstStageActivity claFirstStageActivity) {
        this.f76154a = claDetailsUiModel;
        this.f76155b = claFirstStageActivity;
    }

    /* renamed from: a */
    public final void mo26511a(Chip chip, int i) {
        ClaFirstStageActivity.m73198d3(this.f76154a, this.f76155b, chip, i);
    }
}

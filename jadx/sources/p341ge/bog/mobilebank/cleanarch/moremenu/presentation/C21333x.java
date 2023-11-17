package p341ge.bog.mobilebank.cleanarch.moremenu.presentation;

import android.view.View;

/* renamed from: ge.bog.mobilebank.cleanarch.moremenu.presentation.x */
public final /* synthetic */ class C21333x implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MoreFragment f57156d;

    /* renamed from: e */
    public final /* synthetic */ PackageType f57157e;

    /* renamed from: f */
    public final /* synthetic */ String f57158f;

    public /* synthetic */ C21333x(MoreFragment moreFragment, PackageType packageType, String str) {
        this.f57156d = moreFragment;
        this.f57157e = packageType;
        this.f57158f = str;
    }

    public final void onClick(View view) {
        MoreFragment.setUpProfileHeader$lambda$8$lambda$7(this.f57156d, this.f57157e, this.f57158f, view);
    }
}

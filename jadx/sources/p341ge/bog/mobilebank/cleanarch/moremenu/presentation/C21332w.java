package p341ge.bog.mobilebank.cleanarch.moremenu.presentation;

import android.view.View;

/* renamed from: ge.bog.mobilebank.cleanarch.moremenu.presentation.w */
public final /* synthetic */ class C21332w implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MoreFragment f57153d;

    /* renamed from: e */
    public final /* synthetic */ PackageType f57154e;

    /* renamed from: f */
    public final /* synthetic */ String f57155f;

    public /* synthetic */ C21332w(MoreFragment moreFragment, PackageType packageType, String str) {
        this.f57153d = moreFragment;
        this.f57154e = packageType;
        this.f57155f = str;
    }

    public final void onClick(View view) {
        MoreFragment.setUpProfileHeader$lambda$8$lambda$6(this.f57153d, this.f57154e, this.f57155f, view);
    }
}

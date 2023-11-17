package ma0;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import p341ge.bog.mobilebank.depositapplication.presentation.application.activity.DepositApplicationActivity;

/* renamed from: ma0.i */
public final /* synthetic */ class C26170i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f66372d;

    /* renamed from: e */
    public final /* synthetic */ ViewPager2 f66373e;

    public /* synthetic */ C26170i(View view, ViewPager2 viewPager2) {
        this.f66372d = view;
        this.f66373e = viewPager2;
    }

    public final void run() {
        DepositApplicationActivity.C22795b.m73984b(this.f66372d, this.f66373e);
    }
}

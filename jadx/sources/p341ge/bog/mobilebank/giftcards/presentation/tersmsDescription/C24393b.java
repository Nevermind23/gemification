package p341ge.bog.mobilebank.giftcards.presentation.tersmsDescription;

import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.tersmsDescription.b */
public final class C24393b extends ViewPager2.C1928i {

    /* renamed from: a */
    private final C24394a f62978a;

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.tersmsDescription.b$a */
    public interface C24394a {
        /* renamed from: Q */
        void mo62091Q(int i);
    }

    public C24393b(C24394a aVar) {
        C41536l.m120489i(aVar, "onPageSelectedCallBack");
        this.f62978a = aVar;
    }

    public void onPageSelected(int i) {
        super.onPageSelected(i);
        this.f62978a.mo62091Q(i);
    }
}

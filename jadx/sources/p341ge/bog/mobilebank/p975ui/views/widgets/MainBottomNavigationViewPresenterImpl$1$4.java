package p341ge.bog.mobilebank.p975ui.views.widgets;

import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.ref.WeakReference;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenterImpl$1$4 */
public final class MainBottomNavigationViewPresenterImpl$1$4 extends ViewPager2.C1928i {
    final /* synthetic */ WeakReference<BottomNavigationView> $bottomNavigationViewRef;

    MainBottomNavigationViewPresenterImpl$1$4(WeakReference<BottomNavigationView> weakReference) {
        this.$bottomNavigationViewRef = weakReference;
    }

    public void onPageSelected(int i) {
        BottomNavigationView bottomNavigationView = this.$bottomNavigationViewRef.get();
        if (bottomNavigationView != null) {
            bottomNavigationView.getMenu().getItem(i).setChecked(true);
        }
    }
}

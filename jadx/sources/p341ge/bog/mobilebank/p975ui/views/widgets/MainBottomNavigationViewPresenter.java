package p341ge.bog.mobilebank.p975ui.views.widgets;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenter */
public interface MainBottomNavigationViewPresenter {

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenter$NavigationItem */
    public enum NavigationItem {
        HOME,
        CARDS,
        PRODUCTS,
        PAYMENTS,
        TRANSFERS,
        STATEMENTS,
        DISCOVER,
        HUB
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenter$OnNavigationItemSelectedListener */
    public interface OnNavigationItemSelectedListener {
        void onNavigationItemSelected(NavigationItem navigationItem);
    }

    int getBadgeCount(NavigationItem navigationItem);

    boolean isHubGamificationEnabled();

    void onHubMenuUpdated(boolean z);

    void removeBadge(NavigationItem navigationItem);

    void selectItem(NavigationItem navigationItem);

    void setBadgeCount(NavigationItem navigationItem, Integer num);

    void setHubGamificationEnabled(boolean z);

    void updateStateFor(NavigationItem navigationItem);
}

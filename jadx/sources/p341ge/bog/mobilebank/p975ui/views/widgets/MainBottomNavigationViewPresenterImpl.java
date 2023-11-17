package p341ge.bog.mobilebank.p975ui.views.widgets;

import af1.C40303i;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.core.content.C0767a;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.C2315d0;
import com.airbnb.lottie.C2325h;
import com.airbnb.lottie.C2344p;
import com.google.android.material.badge.C4933a;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import g91.C32343x;
import g91.C32355x0;
import he1.C41233s;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.C41550z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41555e;
import p045d.C5769a;
import p341ge.bog.mobilebank.p975ui.views.widgets.MainBottomNavigationViewPresenter;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10325n;
import p366bk.C10327p;
import p366bk.C10328q;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenterImpl */
public final class MainBottomNavigationViewPresenterImpl implements MainBottomNavigationViewPresenter {
    static final /* synthetic */ C40303i[] $$delegatedProperties;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final View.OnLongClickListener LONG_CLICK_CONSUMER = new C35817p();
    private final BottomNavigationView bottomNavigationView;
    private final HashMap<Integer, MainBottomNavigationViewPresenter.NavigationItem> currentItems;
    private final C41555e hubIconState$delegate;
    private final C41555e isHubGamificationEnabled$delegate;
    private boolean isHubVisible;
    private final MainBottomNavigationViewPresenter.OnNavigationItemSelectedListener onNavigationItemSelectedListener;
    private final ViewPager2 viewPager;

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenterImpl$CenteredDrawable */
    public static final class CenteredDrawable extends InsetDrawable {
        private final Rect tmpRect = new Rect();

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CenteredDrawable(Drawable drawable) {
            super(drawable, 0);
            C41536l.m120489i(drawable, "drawable");
        }

        /* access modifiers changed from: protected */
        @SuppressLint({"NewApi"})
        public void onBoundsChange(Rect rect) {
            C41536l.m120489i(rect, "bounds");
            Drawable drawable = getDrawable();
            if (drawable != null) {
                C41536l.m120488h(drawable, "requireNotNull(drawable)");
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    super.onBoundsChange(rect);
                    return;
                }
                Rect rect2 = this.tmpRect;
                rect2.set(rect);
                rect2.inset((rect.width() - intrinsicWidth) / 2, (rect.height() - intrinsicHeight) / 2);
                super.onBoundsChange(rect2);
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenterImpl$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void consumeLongClick(View view) {
            C41536l.m120489i(view, "view");
            view.setOnLongClickListener(MainBottomNavigationViewPresenterImpl.LONG_CLICK_CONSUMER);
            view.setHapticFeedbackEnabled(false);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenterImpl$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x002b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0056 */
        static {
            /*
                ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenter$NavigationItem[] r0 = p341ge.bog.mobilebank.p975ui.views.widgets.MainBottomNavigationViewPresenter.NavigationItem.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenter$NavigationItem r2 = p341ge.bog.mobilebank.p975ui.views.widgets.MainBottomNavigationViewPresenter.NavigationItem.CARDS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenter$NavigationItem r3 = p341ge.bog.mobilebank.p975ui.views.widgets.MainBottomNavigationViewPresenter.NavigationItem.PRODUCTS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenter$NavigationItem r4 = p341ge.bog.mobilebank.p975ui.views.widgets.MainBottomNavigationViewPresenter.NavigationItem.PAYMENTS     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenter$NavigationItem r4 = p341ge.bog.mobilebank.p975ui.views.widgets.MainBottomNavigationViewPresenter.NavigationItem.TRANSFERS     // Catch:{ NoSuchFieldError -> 0x002b }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r5 = 4
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenter$NavigationItem r4 = p341ge.bog.mobilebank.p975ui.views.widgets.MainBottomNavigationViewPresenter.NavigationItem.STATEMENTS     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r5 = 5
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenter$NavigationItem r4 = p341ge.bog.mobilebank.p975ui.views.widgets.MainBottomNavigationViewPresenter.NavigationItem.DISCOVER     // Catch:{ NoSuchFieldError -> 0x003d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r5 = 6
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                $EnumSwitchMapping$0 = r0
                ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenterImpl$a[] r0 = p341ge.bog.mobilebank.p975ui.views.widgets.MainBottomNavigationViewPresenterImpl.C35742a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenterImpl$a r4 = p341ge.bog.mobilebank.p975ui.views.widgets.MainBottomNavigationViewPresenterImpl.C35742a.HUB     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenterImpl$a r1 = p341ge.bog.mobilebank.p975ui.views.widgets.MainBottomNavigationViewPresenterImpl.C35742a.GAMIFICATION     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenterImpl$a r1 = p341ge.bog.mobilebank.p975ui.views.widgets.MainBottomNavigationViewPresenterImpl.C35742a.MORE     // Catch:{ NoSuchFieldError -> 0x005e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                $EnumSwitchMapping$1 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.views.widgets.MainBottomNavigationViewPresenterImpl.WhenMappings.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenterImpl$a */
    private enum C35742a {
        HUB,
        GAMIFICATION,
        MORE
    }

    static {
        Class<MainBottomNavigationViewPresenterImpl> cls = MainBottomNavigationViewPresenterImpl.class;
        $$delegatedProperties = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "isHubGamificationEnabled", "isHubGamificationEnabled()Z", 0)), C41520a0.m120439e(new C41539o(cls, "hubIconState", "getHubIconState()Lge/bog/mobilebank/ui/views/widgets/MainBottomNavigationViewPresenterImpl$HubIconState;", 0))};
    }

    public MainBottomNavigationViewPresenterImpl(BottomNavigationView bottomNavigationView2, ViewPager2 viewPager2, MainBottomNavigationViewPresenter.OnNavigationItemSelectedListener onNavigationItemSelectedListener2) {
        Drawable.ConstantState constantState;
        C41536l.m120489i(bottomNavigationView2, "bottomNavigationView");
        C41536l.m120489i(viewPager2, "viewPager");
        this.bottomNavigationView = bottomNavigationView2;
        this.viewPager = viewPager2;
        this.onNavigationItemSelectedListener = onNavigationItemSelectedListener2;
        this.currentItems = C41344r0.m119930l(C41233s.m119492a(Integer.valueOf(C10322k.navigation_home), MainBottomNavigationViewPresenter.NavigationItem.HOME), C41233s.m119492a(Integer.valueOf(C10322k.navigation_cards_or_products), MainBottomNavigationViewPresenter.NavigationItem.CARDS), C41233s.m119492a(Integer.valueOf(C10322k.navigation_payments_or_transfers), MainBottomNavigationViewPresenter.NavigationItem.PAYMENTS), C41233s.m119492a(Integer.valueOf(C10322k.navigation_payment_transfers_or_offers), MainBottomNavigationViewPresenter.NavigationItem.STATEMENTS), C41233s.m119492a(Integer.valueOf(C10322k.navigation_hub), MainBottomNavigationViewPresenter.NavigationItem.HUB));
        C41551a aVar = C41551a.f97718a;
        this.isHubGamificationEnabled$delegate = new C35743x87cea449(Boolean.FALSE, this);
        this.hubIconState$delegate = new C35744x87cea44a(C35742a.MORE, this);
        bottomNavigationView2.mo16547g(C10325n.main_bottom_nav_bar_menu);
        Menu menu = bottomNavigationView2.getMenu();
        C41536l.m120488h(menu, "menu");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menu.getItem(i);
            C41536l.m120488h(item, "getItem(index)");
            Companion companion = Companion;
            View findViewById = bottomNavigationView2.findViewById(item.getItemId());
            C41536l.m120488h(findViewById, "findViewById(item.itemId)");
            companion.consumeLongClick(findViewById);
        }
        bottomNavigationView2.setItemIconTintList((ColorStateList) null);
        bottomNavigationView2.setSelectedItemId(0);
        View findViewById2 = bottomNavigationView2.findViewById(C10322k.navigation_payments_or_transfers);
        Drawable b = C5769a.m23210b(findViewById2.getContext(), C10320i.bottom_nav_bar_payments_or_transfers);
        if (b != null) {
            C41536l.m120488h(b, "requireNotNull(\n        …  )\n                    )");
            Drawable centeredDrawable = new CenteredDrawable(b);
            Drawable background = findViewById2.getBackground();
            if (!(background == null || (constantState = background.getConstantState()) == null)) {
                centeredDrawable = new LayerDrawable(new Drawable[]{constantState.newDrawable().mutate(), centeredDrawable});
            }
            findViewById2.setBackground(centeredDrawable);
            bottomNavigationView2.setOnNavigationItemSelectedListener(new C35816o(this, bottomNavigationView2));
            this.viewPager.mo6603h(new MainBottomNavigationViewPresenterImpl$1$4(new WeakReference(this.bottomNavigationView)));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* access modifiers changed from: private */
    public static final boolean LONG_CLICK_CONSUMER$lambda$16(View view) {
        return true;
    }

    private final void adjustHubGamification(Boolean bool) {
        boolean z;
        C35742a aVar;
        MenuItem menuItem = getMenuItem(C10322k.navigation_hub);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = menuItem.isChecked();
        }
        if (!this.isHubVisible) {
            aVar = C35742a.MORE;
        } else if (!isHubGamificationEnabled() || z) {
            aVar = C35742a.HUB;
        } else {
            aVar = C35742a.GAMIFICATION;
        }
        setHubIconState(aVar);
    }

    static /* synthetic */ void adjustHubGamification$default(MainBottomNavigationViewPresenterImpl mainBottomNavigationViewPresenterImpl, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        mainBottomNavigationViewPresenterImpl.adjustHubGamification(bool);
    }

    /* access modifiers changed from: private */
    public final void applyHubIconState(C35742a aVar) {
        MenuItem menuItem = getMenuItem(C10322k.navigation_hub);
        int i = WhenMappings.$EnumSwitchMapping$1[aVar.ordinal()];
        if (i == 1) {
            menuItem.setTitle(C32343x.m95388F("text.hub.item.name", new Object[0]));
            menuItem.setIcon(C10320i.bottom_nav_bar_hub);
        } else if (i == 2) {
            menuItem.setTitle(C32343x.m95388F("text.hub.item.name", new Object[0]));
            setAnimationRes(C10327p.anim_gamification_hub, menuItem);
        } else if (i == 3) {
            menuItem.setTitle(C10328q.navigation_title_more);
            menuItem.setIcon(C10320i.bottom_nav_bar_more);
        }
    }

    private final C35742a getHubIconState() {
        return (C35742a) this.hubIconState$delegate.getValue(this, $$delegatedProperties[1]);
    }

    private final Integer getItemId(MainBottomNavigationViewPresenter.NavigationItem navigationItem) {
        return (Integer) C32343x.m95434b0(this.currentItems, navigationItem);
    }

    private final MenuItem getMenuItem(int i) {
        return this.bottomNavigationView.getMenu().findItem(i);
    }

    /* access modifiers changed from: private */
    public static final boolean lambda$7$lambda$6(MainBottomNavigationViewPresenterImpl mainBottomNavigationViewPresenterImpl, BottomNavigationView bottomNavigationView2, MenuItem menuItem) {
        boolean z;
        C41536l.m120489i(mainBottomNavigationViewPresenterImpl, "this$0");
        C41536l.m120489i(bottomNavigationView2, "$this_with");
        C41536l.m120489i(menuItem, "selectedItem");
        if (menuItem.getItemId() == C10322k.navigation_hub) {
            z = true;
        } else {
            z = false;
        }
        mainBottomNavigationViewPresenterImpl.adjustHubGamification(Boolean.valueOf(z));
        MainBottomNavigationViewPresenter.OnNavigationItemSelectedListener onNavigationItemSelectedListener2 = mainBottomNavigationViewPresenterImpl.onNavigationItemSelectedListener;
        if (onNavigationItemSelectedListener2 != null) {
            MainBottomNavigationViewPresenter.NavigationItem navigationItem = mainBottomNavigationViewPresenterImpl.currentItems.get(Integer.valueOf(menuItem.getItemId()));
            if (navigationItem != null) {
                C41536l.m120488h(navigationItem, "requireNotNull(currentItems[selectedItem.itemId])");
                onNavigationItemSelectedListener2.onNavigationItemSelected(navigationItem);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        Menu menu = bottomNavigationView2.getMenu();
        C41536l.m120488h(menu, "menu");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menu.getItem(i);
            C41536l.m120488h(item, "getItem(index)");
            if (menuItem.getItemId() == item.getItemId()) {
                mainBottomNavigationViewPresenterImpl.viewPager.mo6606l(i, false);
                return true;
            }
        }
        return false;
    }

    private final void setAnimationRes(int i, MenuItem menuItem) {
        C2344p.m9083s(this.bottomNavigationView.getContext(), i).mo7574d(new C35818q(menuItem));
    }

    /* access modifiers changed from: private */
    public static final void setAnimationRes$lambda$15(MenuItem menuItem, C2325h hVar) {
        if (menuItem != null) {
            C2315d0 d0Var = new C2315d0();
            d0Var.mo7529z0(hVar);
            d0Var.mo7487U0(-1);
            d0Var.mo7512q0();
            menuItem.setIcon(d0Var);
        }
    }

    private final void setHubIconState(C35742a aVar) {
        this.hubIconState$delegate.setValue(this, $$delegatedProperties[1], aVar);
    }

    public int getBadgeCount(MainBottomNavigationViewPresenter.NavigationItem navigationItem) {
        Integer num;
        C41536l.m120489i(navigationItem, "item");
        Integer itemId = getItemId(navigationItem);
        if (itemId != null) {
            C4933a e = this.bottomNavigationView.mo16545e(itemId.intValue());
            if (e != null) {
                num = Integer.valueOf(e.mo15527l());
            } else {
                num = null;
            }
            if (num != null) {
                return num.intValue();
            }
        }
        return 0;
    }

    public boolean isHubGamificationEnabled() {
        return ((Boolean) this.isHubGamificationEnabled$delegate.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public void onHubMenuUpdated(boolean z) {
        this.isHubVisible = z;
        MenuItem menuItem = getMenuItem(C10322k.navigation_hub);
        if (z) {
            menuItem.setTitle(C32343x.m95388F("text.hub.item.name", new Object[0]));
            adjustHubGamification(Boolean.valueOf(menuItem.isChecked()));
            return;
        }
        menuItem.setTitle(C10328q.navigation_title_more);
        menuItem.setIcon(C10320i.bottom_nav_bar_more);
    }

    public void removeBadge(MainBottomNavigationViewPresenter.NavigationItem navigationItem) {
        C41536l.m120489i(navigationItem, "item");
        Integer itemId = getItemId(navigationItem);
        if (itemId != null) {
            this.bottomNavigationView.mo16568h(itemId.intValue());
        }
    }

    public void selectItem(MainBottomNavigationViewPresenter.NavigationItem navigationItem) {
        boolean z;
        C41536l.m120489i(navigationItem, "item");
        getMenuItem(C10322k.navigation_hub);
        if (navigationItem == MainBottomNavigationViewPresenter.NavigationItem.HUB) {
            z = true;
        } else {
            z = false;
        }
        adjustHubGamification(Boolean.valueOf(z));
        Integer itemId = getItemId(navigationItem);
        if (itemId != null) {
            this.bottomNavigationView.setSelectedItemId(itemId.intValue());
        }
    }

    public void setBadgeCount(MainBottomNavigationViewPresenter.NavigationItem navigationItem, Integer num) {
        String str;
        C41536l.m120489i(navigationItem, "item");
        Integer itemId = getItemId(navigationItem);
        if (itemId != null) {
            int intValue = itemId.intValue();
            C41550z zVar = new C41550z();
            BottomNavigationView bottomNavigationView2 = this.bottomNavigationView;
            C4933a e = bottomNavigationView2.mo16545e(intValue);
            if (e == null) {
                e = bottomNavigationView2.mo16546f(intValue);
                e.mo15533y(C0767a.m2893c(bottomNavigationView2.getContext(), C10318g.main_nav_bar_badge_color));
                e.mo15534z(C0767a.m2893c(bottomNavigationView2.getContext(), 17170443));
                e.mo15510E(C32355x0.m95512c(bottomNavigationView2.getContext(), 3.0f));
                e.mo15508A(3);
                e.mo15513H(true);
                str = "getOrCreateBadge(itemId)…ible = true\n            }";
            } else {
                str = "getBadge(itemId) ?: getO…ible = true\n            }";
            }
            C41536l.m120488h(e, str);
            zVar.f97717d = e;
            if (num == null) {
                e.mo15516c();
            } else {
                e.mo15509B(num.intValue());
            }
        }
    }

    public void setHubGamificationEnabled(boolean z) {
        this.isHubGamificationEnabled$delegate.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public void updateStateFor(MainBottomNavigationViewPresenter.NavigationItem navigationItem) {
        C41536l.m120489i(navigationItem, "item");
        switch (WhenMappings.$EnumSwitchMapping$0[navigationItem.ordinal()]) {
            case 1:
                Menu menu = this.bottomNavigationView.getMenu();
                int i = C10322k.navigation_cards_or_products;
                menu.findItem(i).setTitle(C10328q.navigation_title_cards);
                this.currentItems.put(Integer.valueOf(i), navigationItem);
                return;
            case 2:
                Menu menu2 = this.bottomNavigationView.getMenu();
                int i2 = C10322k.navigation_cards_or_products;
                menu2.findItem(i2).setTitle(C10328q.navigation_title_products);
                this.currentItems.put(Integer.valueOf(i2), navigationItem);
                return;
            case 3:
                this.currentItems.put(Integer.valueOf(C10322k.navigation_payments_or_transfers), navigationItem);
                return;
            case 4:
                this.currentItems.put(Integer.valueOf(C10322k.navigation_payments_or_transfers), navigationItem);
                return;
            case 5:
                Menu menu3 = this.bottomNavigationView.getMenu();
                int i3 = C10322k.navigation_payment_transfers_or_offers;
                MenuItem findItem = menu3.findItem(i3);
                findItem.setTitle(C10328q.navigation_title_statements);
                findItem.setIcon(C10320i.bottom_nav_bar_statements);
                this.currentItems.put(Integer.valueOf(i3), navigationItem);
                return;
            case 6:
                Menu menu4 = this.bottomNavigationView.getMenu();
                int i4 = C10322k.navigation_payment_transfers_or_offers;
                MenuItem findItem2 = menu4.findItem(i4);
                findItem2.setTitle(C10328q.navigation_title_offers);
                findItem2.setIcon(C10320i.bottom_nav_bar_offers);
                this.currentItems.put(Integer.valueOf(i4), navigationItem);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MainBottomNavigationViewPresenterImpl(BottomNavigationView bottomNavigationView2, ViewPager2 viewPager2, MainBottomNavigationViewPresenter.OnNavigationItemSelectedListener onNavigationItemSelectedListener2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bottomNavigationView2, viewPager2, (i & 4) != 0 ? null : onNavigationItemSelectedListener2);
    }
}

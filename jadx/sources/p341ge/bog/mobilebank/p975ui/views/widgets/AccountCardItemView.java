package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.C0767a;
import g91.C32307h;
import g91.C32343x;
import g91.C32355x0;
import hd0.C24978b;
import iu0.C36546y;
import j81.C36767i;
import l50.C25838r;
import p341ge.bog.mobilebank.eventbus.events.SwipeItemClickEvent;
import p341ge.bog.mobilebank.p975ui.views.controllers.C35700a;
import p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p380ck.C10463g;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.AccountCardItemView */
public class AccountCardItemView extends C35700a {
    private final String ACTIVATE_BUTTON_NAME_KEY = "card.activation.text.details.button.activate";
    private GradientDrawable blockBackground;
    private C25838r card;
    private BogButton cardActivateBtn;
    private View cardActivationIndicator;
    private View cardBlockBackground;
    private BogTextView cardBottomDesc;
    private View cardContentContainer;
    private ImageView cardImage;
    private BogTextView cardMiddleDesc;
    private View cardRenewalIndicator;
    private BogTextView cardTitle;
    private View clickable;
    private View digitalCardDetailsClickCatcher;
    private View digitalCardDetailsDivider;
    private ImageView digitalCardDetailsIcon;
    private BogTextView digitalCardDetailsLabel;
    private BogTextView digitalCardIndicatorLabel;
    private GradientDrawable itemBackground;
    private C36767i onCardActivateButtonClickedListener;
    View.OnClickListener onSwipeItemClick = new C35767b(this);
    int position = -1;
    private OurSwipeLayout swipeLayout;
    private LinearLayout swipeLeftContainer;
    private SwipeMenuHelper swipeMenuHelper;
    private LinearLayout swipeRightContainer;
    private LinearLayout titleContainer;

    public AccountCardItemView(Context context) {
        super(context);
        setUpViews();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(View view) {
        SwipeItemClickEvent swipeItemClickEvent = new SwipeItemClickEvent(this.position);
        swipeItemClickEvent.setIndex(((Integer) view.getTag()).intValue());
        swipeItemClickEvent.setAdditionalData(6);
        if (swipeItemClickEvent.getIndex() == 0) {
            C36546y.m108282F().mo27152s("cards", "favorite", "swipe_menu_click");
            swipeItemClickEvent.setType(11);
        } else if (swipeItemClickEvent.getIndex() == 1) {
            C36546y.m108282F().mo27152s("cards", "edit_name", "swipe_menu_click");
            swipeItemClickEvent.setType(1);
        } else if (swipeItemClickEvent.getIndex() == 2) {
            C36546y.m108282F().mo27152s("cards", "card_3d_security", "swipe_menu_click");
            swipeItemClickEvent.setType(13);
        } else if (swipeItemClickEvent.getIndex() == 3) {
            C36546y.m108282F().mo27152s("cards", "card_insurance", "swipe_menu_click");
            swipeItemClickEvent.setType(14);
        }
        swipeItemClickEvent.setPosition(this.position);
        this.mEventBus.mo96184m(swipeItemClickEvent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setCard$0(C25838r rVar, View view) {
        C36767i iVar = this.onCardActivateButtonClickedListener;
        if (iVar != null) {
            iVar.mo72604a(rVar);
        }
    }

    private void setUpViews() {
        View.inflate(getContext(), C10324m.account_card_item_view_layout, this);
        OurSwipeLayout ourSwipeLayout = (OurSwipeLayout) findViewById(C10322k.swipe_layout);
        this.swipeLayout = ourSwipeLayout;
        ourSwipeLayout.setShowMode(OurSwipeLayout.ShowMode.LayDown);
        this.clickable = findViewById(C10322k.item_to_click);
        OurSwipeLayout ourSwipeLayout2 = this.swipeLayout;
        OurSwipeLayout.DragEdge dragEdge = OurSwipeLayout.DragEdge.Left;
        int i = C10322k.left_view;
        ourSwipeLayout2.addDrag(dragEdge, findViewById(i));
        OurSwipeLayout ourSwipeLayout3 = this.swipeLayout;
        OurSwipeLayout.DragEdge dragEdge2 = OurSwipeLayout.DragEdge.Right;
        int i2 = C10322k.right_view;
        ourSwipeLayout3.addDrag(dragEdge2, findViewById(i2));
        int i3 = C10318g.f28616A;
        this.swipeMenuHelper = new SwipeMenuHelper(i3, C10318g.f28626L0);
        this.swipeLeftContainer = (LinearLayout) findViewById(i);
        this.swipeRightContainer = (LinearLayout) findViewById(i2);
        this.cardContentContainer = findViewById(C10322k.card_content_container);
        this.cardImage = (ImageView) findViewById(C10322k.f28806Y5);
        this.titleContainer = (LinearLayout) findViewById(C10322k.card_view_top_container);
        this.cardTitle = (BogTextView) findViewById(C10322k.f28723E6);
        this.cardMiddleDesc = (BogTextView) findViewById(C10322k.card_middle_desc);
        this.cardBottomDesc = (BogTextView) findViewById(C10322k.card_bottom_desc);
        this.cardRenewalIndicator = findViewById(C10322k.card_indicator);
        this.cardActivateBtn = (BogButton) findViewById(C10322k.card_activate_btn);
        this.cardActivationIndicator = findViewById(C10322k.activation_indicator);
        this.cardBlockBackground = findViewById(C10322k.card_block_background);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.itemBackground = gradientDrawable;
        gradientDrawable.setShape(0);
        GradientDrawable gradientDrawable2 = this.itemBackground;
        int i4 = C10319h.default_corner_radius_redesign;
        gradientDrawable2.setCornerRadius((float) C32355x0.m95516g(i4));
        this.itemBackground.setColor(C32355x0.m95514e(C10318g.bog_activity_background_color, getContext()));
        this.cardContentContainer.setBackground(this.itemBackground);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        this.blockBackground = gradientDrawable3;
        gradientDrawable3.setShape(0);
        this.blockBackground.setCornerRadius((float) C32355x0.m95516g(i4));
        this.blockBackground.setColor(C32355x0.m95514e(i3, getContext()));
        this.cardBlockBackground.setBackground(this.blockBackground);
        this.digitalCardDetailsDivider = findView(C10322k.card_block_divider);
        this.digitalCardDetailsIcon = (ImageView) findViewById(C10322k.digital_card_details_icon);
        this.digitalCardIndicatorLabel = (BogTextView) findView(C10322k.digital_card_indicator_label);
        this.digitalCardDetailsLabel = (BogTextView) findViewById(C10322k.card_info_label);
        this.digitalCardDetailsClickCatcher = findView(C10322k.digital_card_details_click_catcher);
    }

    private void showIf(boolean z, View... viewArr) {
        for (View p1 : viewArr) {
            C32343x.m95477p1(p1, z);
        }
    }

    public void addSwipeMenu(boolean z, String str, int i, int i2, boolean z2, int i3, boolean z3) {
        SwipeMenuButton swipeMenuButton = new SwipeMenuButton(getContext());
        swipeMenuButton.setTitle(str);
        swipeMenuButton.setShouldTint(z3);
        swipeMenuButton.setImageId(i);
        swipeMenuButton.setBlockedImageId(i2);
        swipeMenuButton.setTextColorId(this.swipeMenuHelper.getTextColorId());
        swipeMenuButton.setBackgroundColorId(this.swipeMenuHelper.getBackgroundColorId());
        swipeMenuButton.setBlocked(z2);
        swipeMenuButton.setSize(C10319h.swipe_menu_button_size);
        swipeMenuButton.setTag(Integer.valueOf(i3));
        if (z) {
            if (this.swipeRightContainer.getChildCount() == 0) {
                this.swipeRightContainer.setPadding(0, 0, C32355x0.m95517h(C10319h.item_default_margin, getContext()), 0);
            }
            this.swipeRightContainer.addView(swipeMenuButton);
        } else {
            if (this.swipeLeftContainer.getChildCount() == 0) {
                this.swipeLeftContainer.setPadding(C32355x0.m95517h(C10319h.item_default_margin, getContext()), 0, 0, 0);
            }
            this.swipeLeftContainer.addView(swipeMenuButton);
        }
        swipeMenuButton.setOnClickListener(this.onSwipeItemClick);
    }

    public void resetFavorite() {
        SwipeMenuButton swipeMenuButton = (SwipeMenuButton) this.swipeLeftContainer.getChildAt(0);
        if (this.card.mo64600x().mo63390c()) {
            swipeMenuButton.setShouldTint(true);
            swipeMenuButton.setImageId(C10320i.ic_account_swipe_favoriti);
            return;
        }
        swipeMenuButton.setShouldTint(false);
        swipeMenuButton.setImageId(C10320i.ic_account_swipe_favoriti_blocked);
    }

    public void setCard(C25838r rVar, int i) {
        this.position = i;
        this.card = rVar;
        if (rVar.mo64599w().mo63390c()) {
            this.cardActivateBtn.setText(C27950a.m86284a("card.activation.text.details.button.activate"));
            this.cardTitle.setText(rVar.mo64587l());
            this.cardActivateBtn.setVisibility(0);
            this.cardActivationIndicator.setVisibility(0);
            this.cardMiddleDesc.setVisibility(8);
            this.cardBottomDesc.setVisibility(8);
        } else {
            this.cardActivateBtn.setVisibility(8);
            this.cardActivationIndicator.setVisibility(8);
            this.cardMiddleDesc.setVisibility(0);
            this.cardBottomDesc.setVisibility(0);
            setCardTitles(rVar.mo64587l(), C32307h.m95232i(rVar.mo64593r()), rVar.mo64597u());
            showExpIndicator(rVar.mo64598v().mo63390c());
        }
        this.swipeLeftContainer.removeAllViews();
        this.swipeRightContainer.removeAllViews();
        if (rVar.mo64600x().mo63390c()) {
            addSwipeMenu(false, getContext().getString(C10328q.product_item_view_swipe_favorite_card), C10320i.ic_account_swipe_favoriti, C10320i.ic_account_swipe_favoriti_blocked, false, 0);
        } else {
            String string = getContext().getString(C10328q.product_item_view_swipe_favorite_card);
            int i2 = C10320i.ic_account_swipe_favoriti_blocked;
            addSwipeMenu(false, string, i2, i2, false, 0, false);
        }
        addSwipeMenu(false, getResources().getString(C10328q.product_item_view_swipe_edit), C10320i.ic_account_swipe_redaktireba, C10320i.ic_account_swipe_redaktireba_blocked, false, 1);
        if (rVar.mo64592q() != null && rVar.mo64592q().mo64624i() == C24978b.YES) {
            C10463g.m37989C("card had no insecCard");
            addSwipeMenu(true, getContext().getString(C10328q.product_item_view_swipe_3d_security), C10320i.ic_account_swipe_3d_secure, C10320i.ic_account_swipe_3d_secure_blocked, false, 2);
        } else if (rVar.mo64592q() == null) {
            C10463g.m37989C("card had no insecCard");
        }
        if (rVar.mo64592q() != null && rVar.mo64592q().mo64617d() == C24978b.YES) {
            addSwipeMenu(true, getContext().getString(C10328q.product_item_view_swipe_card_insurence), C10320i.ic_account_swipe_dazgveva, C10320i.ic_account_swipe_dazgveva_blocked, false, 3);
        }
        showIf(rVar.mo64601y(), this.digitalCardIndicatorLabel);
        showIf(rVar.mo64575b(), this.digitalCardDetailsLabel, this.digitalCardDetailsDivider, this.digitalCardDetailsIcon);
        this.cardImage.setImageResource(C32307h.m95225b(rVar));
        this.cardActivateBtn.setOnClickListener(new C35766a(this, rVar));
    }

    public void setCardTitles(String str, String str2, String str3) {
        this.cardTitle.setText(str);
        this.cardMiddleDesc.setText(str2);
        this.cardBottomDesc.setText(str3);
    }

    public void setOnCardActivateButtonClickedListener(C36767i iVar) {
        this.onCardActivateButtonClickedListener = iVar;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.clickable.setOnClickListener(onClickListener);
    }

    public void showExpIndicator(boolean z) {
        int i;
        Context context;
        int i2;
        View view = this.cardRenewalIndicator;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        BogTextView bogTextView = this.cardBottomDesc;
        if (z) {
            context = getContext();
            i2 = C10318g.card_renewal_color;
        } else {
            context = getContext();
            i2 = C10318g.operation_fragment_grey_text_color;
        }
        bogTextView.setTextColor(C0767a.m2893c(context, i2));
    }

    public AccountCardItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setUpViews();
    }

    public void addSwipeMenu(boolean z, String str, int i, int i2, boolean z2, int i3) {
        addSwipeMenu(z, str, i, i2, z2, i3, false);
    }
}

package g81;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.widget.C0430g1;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alexandrius.accordionswipelayout.library.SwipeLayout;
import com.github.mikephil.charting.utils.Utils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import g91.C32289b0;
import g91.C32290b1;
import g91.C32315k0;
import g91.C32319m;
import g91.C32335t0;
import g91.C32355x0;
import g91.C32359z0;
import iu0.C36546y;
import j81.C36772n;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p316xa.C8982a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.PaymentDataObject;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p341ge.bog.mobilebank.model.ProviderListUIConfiguration;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfig;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.model.template.TemplateBasketItemWrapperForSelection;
import p341ge.bog.mobilebank.model.template.TemplateBasketItemsWithPaymentConfig;
import p341ge.bog.mobilebank.model.template.TemplateGroup;
import p341ge.bog.mobilebank.p975ui.activities.AddTemplateActivity;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.activities.CarTemplateGroupActivity;
import p341ge.bog.mobilebank.p975ui.activities.HouseTemplateGroupActivity;
import p341ge.bog.mobilebank.p975ui.activities.PaymentsTemplateListActivity;
import p341ge.bog.mobilebank.p975ui.activities.ProviderListActivity;
import p341ge.bog.mobilebank.p975ui.views.controllers.PaymentHeaderView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogEditText;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.DecimalInputTextWatcher;
import p341ge.bog.mobilebank.p975ui.views.widgets.FlipImageViewContainer;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10325n;
import p366bk.C10328q;
import p748eu.C20292b;
import p758fu.C20557a;
import r90.C27950a;

/* renamed from: g81.k0 */
public class C32205k0 extends RecyclerView.C1736h {

    /* renamed from: d */
    private int f79408d;

    /* renamed from: e */
    private int f79409e;

    /* renamed from: f */
    private int f79410f;

    /* renamed from: g */
    private int f79411g;

    /* renamed from: h */
    private int f79412h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Context f79413i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C36772n f79414j;

    /* renamed from: k */
    private View f79415k;

    /* renamed from: l */
    private TemplateBasketItemsWithPaymentConfig f79416l;

    /* renamed from: m */
    private PaymentProviderConfiguration f79417m;

    /* renamed from: n */
    private C20292b f79418n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public BogEditText f79419o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public DecimalInputTextWatcher f79420p = new DecimalInputTextWatcher(2, " ₾");
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f79421q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public TemplateGroup f79422r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public RecyclerView f79423s;

    /* renamed from: t */
    private boolean f79424t;

    /* renamed from: u */
    private int f79425u;

    /* renamed from: v */
    private Calendar f79426v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public ArrayList f79427w;

    /* renamed from: x */
    private Client f79428x;

    /* renamed from: y */
    private ArrayMap f79429y = new ArrayMap();

    /* renamed from: z */
    private View.OnFocusChangeListener f79430z = new C32207b();

    /* renamed from: g81.k0$a */
    class C32206a implements View.OnClickListener {
        C32206a() {
        }

        public void onClick(View view) {
            C32205k0.this.m94914O();
        }
    }

    /* renamed from: g81.k0$b */
    class C32207b implements View.OnFocusChangeListener {
        C32207b() {
        }

        public void onFocusChange(View view, boolean z) {
            try {
                BogEditText bogEditText = (BogEditText) view;
                int intValue = ((Integer) bogEditText.getTag()).intValue();
                C32205k0.this.f79419o = bogEditText;
                TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection = (TemplateBasketItemWrapperForSelection) C32205k0.this.f79427w.get(C32205k0.this.m94908B(intValue));
                C32233m mVar = (C32233m) C32205k0.this.f79423s.mo5320e0(intValue);
                mVar.f79489h.setNonSelectableString(" ₾");
                int i = 0;
                if (z) {
                    mVar.f79489h.setText(" ₾");
                    mVar.f79489h.setNonSelectableString(" ₾");
                    templateBasketItemWrapperForSelection.setNewValue(BankApiResponse.SUCCESSFUL_RESPONSE_CODE);
                    if (!templateBasketItemWrapperForSelection.isSelected()) {
                        C32205k0.this.mo72739K(intValue, mVar);
                    }
                    mVar.f79490i.setVisibility(0);
                    C32205k0.this.f79420p.setEditText(mVar.f79489h);
                    C32205k0.this.f79420p.setTemplateBasketWatcher(C32205k0.this.f79414j);
                    C32205k0.this.f79420p.setTemplateItem(templateBasketItemWrapperForSelection);
                    mVar.f79489h.addTextChangedListener(C32205k0.this.f79420p);
                    return;
                }
                if (templateBasketItemWrapperForSelection.isSelected()) {
                    BogTextView bogTextView = mVar.f79490i;
                    if (templateBasketItemWrapperForSelection.getNewValue().equals(templateBasketItemWrapperForSelection.getOriginalValue())) {
                        i = 8;
                    }
                    bogTextView.setVisibility(i);
                    BogEditText bogEditText2 = mVar.f79489h;
                    bogEditText2.setText(C32359z0.m95593u(mVar.f79489h.getText().toString()) + " ₾");
                } else {
                    BogEditText bogEditText3 = mVar.f79489h;
                    bogEditText3.setText(C32359z0.m95541L(templateBasketItemWrapperForSelection.getOriginalValue()) + " ₾");
                }
                C32205k0.this.f79420p.setEditText((BogEditText) null);
                C32205k0.this.f79420p.setTemplateBasketWatcher((C36772n) null);
                C32205k0.this.f79420p.setTemplateItem((TemplateBasketItemWrapperForSelection) null);
                mVar.f79489h.removeTextChangedListener(C32205k0.this.f79420p);
                C32205k0.this.mo72748y();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: g81.k0$c */
    class C32208c extends C8982a<Map<String, String>> {
        C32208c() {
        }
    }

    /* renamed from: g81.k0$d */
    private class C32209d extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private View f79434d;

        /* renamed from: e */
        private BogTextView f79435e;

        /* renamed from: g81.k0$d$a */
        class C32210a implements View.OnClickListener {

            /* renamed from: d */
            final /* synthetic */ C32205k0 f79437d;

            C32210a(C32205k0 k0Var) {
                this.f79437d = k0Var;
            }

            public void onClick(View view) {
                C32205k0.this.m94914O();
            }
        }

        public C32209d(View view) {
            super(view);
            this.f79434d = view.findViewById(C10322k.add_template_create_button);
            BogTextView bogTextView = (BogTextView) view.findViewById(C10322k.f28915yx);
            this.f79435e = bogTextView;
            bogTextView.setText(C32205k0.this.f79413i.getString(C10328q.templates_button_buy_car_pass));
            this.f79434d.setOnClickListener(new C32210a(C32205k0.this));
        }
    }

    /* renamed from: g81.k0$e */
    private class C32211e extends RecyclerView.C1734f0 {

        /* renamed from: d */
        FlipImageViewContainer f79439d;

        /* renamed from: e */
        BogTextView f79440e;

        /* renamed from: f */
        BogTextView f79441f;

        /* renamed from: g */
        BogTextView f79442g;

        /* renamed from: h */
        BogTextView f79443h;

        /* renamed from: i */
        View f79444i;

        public C32211e(View view) {
            super(view);
            this.f79444i = view.findViewById(C10322k.template_basket_container);
            this.f79439d = (FlipImageViewContainer) view.findViewById(C10322k.flipper);
            this.f79440e = (BogTextView) view.findViewById(C10322k.template_item_title);
            this.f79441f = (BogTextView) view.findViewById(C10322k.template_item_mid_desc);
            this.f79442g = (BogTextView) view.findViewById(C10322k.template_item_bottom_desc);
            this.f79443h = (BogTextView) view.findViewById(C10322k.info_text_view);
        }
    }

    /* renamed from: g81.k0$f */
    private class C32212f extends RecyclerView.C1734f0 {

        /* renamed from: d */
        PaymentHeaderView f79446d;

        /* renamed from: g81.k0$f$a */
        class C32213a implements View.OnClickListener {

            /* renamed from: d */
            final /* synthetic */ C32205k0 f79448d;

            /* renamed from: e */
            final /* synthetic */ ImageButton f79449e;

            /* renamed from: g81.k0$f$a$a */
            class C32214a implements C0430g1.C0433c {
                C32214a() {
                }

                public boolean onMenuItemClick(MenuItem menuItem) {
                    int itemId = menuItem.getItemId();
                    if (itemId == C10322k.f28896uc) {
                        Intent intent = new Intent(C32205k0.this.f79413i, CarTemplateGroupActivity.class);
                        intent.putExtra("TEMPLATE_GROUP_ITEM_ID", C32205k0.this.f79422r.getId());
                        ((C35388f2) C32205k0.this.f79413i).startActivityForResult(intent, 100);
                    } else if (itemId == C10322k.delete) {
                        C32205k0.this.m94919Z();
                    } else if (itemId == C10322k.clear_all) {
                        C32205k0.this.mo72745U(false);
                        return true;
                    }
                    return false;
                }
            }

            /* renamed from: g81.k0$f$a$b */
            class C32215b implements C0430g1.C0433c {
                C32215b() {
                }

                public boolean onMenuItemClick(MenuItem menuItem) {
                    int itemId = menuItem.getItemId();
                    if (itemId == C10322k.f28896uc) {
                        Intent intent = new Intent(C32205k0.this.f79413i, CarTemplateGroupActivity.class);
                        intent.putExtra("TEMPLATE_GROUP_ITEM_ID", C32205k0.this.f79422r.getId());
                        ((C35388f2) C32205k0.this.f79413i).startActivityForResult(intent, 100);
                    } else if (itemId == C10322k.delete) {
                        C32205k0.this.m94919Z();
                    } else if (itemId == C10322k.clear_all) {
                        C32205k0.this.mo72745U(false);
                        return true;
                    }
                    return false;
                }
            }

            /* renamed from: g81.k0$f$a$c */
            class C32216c implements C0430g1.C0433c {
                C32216c() {
                }

                public boolean onMenuItemClick(MenuItem menuItem) {
                    int itemId = menuItem.getItemId();
                    if (itemId == C10322k.f28896uc) {
                        Intent intent = new Intent(C32205k0.this.f79413i, CarTemplateGroupActivity.class);
                        intent.putExtra("TEMPLATE_GROUP_ITEM_ID", C32205k0.this.f79422r.getId());
                        ((C35388f2) C32205k0.this.f79413i).startActivityForResult(intent, 100);
                        return false;
                    } else if (itemId == C10322k.delete) {
                        C32205k0.this.m94919Z();
                        return false;
                    } else if (itemId != C10322k.select_all) {
                        return false;
                    } else {
                        C32205k0.this.mo72745U(true);
                        return true;
                    }
                }
            }

            C32213a(C32205k0 k0Var, ImageButton imageButton) {
                this.f79448d = k0Var;
                this.f79449e = imageButton;
            }

            public void onClick(View view) {
                if (!C32205k0.this.m94909F()) {
                    C32212f.this.f79446d.mo86907h(this.f79449e, C10325n.car_header_no_items, new C32214a());
                } else if (C32205k0.this.m94910H()) {
                    C32212f.this.f79446d.mo86907h(this.f79449e, C10325n.car_header_clear_all_menu, new C32215b());
                } else {
                    C32212f.this.f79446d.mo86907h(this.f79449e, C10325n.car_header_select_all_menu, new C32216c());
                }
            }
        }

        public C32212f(View view) {
            super(view);
            PaymentHeaderView paymentHeaderView = (PaymentHeaderView) view.findViewById(C10322k.f28770Mf);
            this.f79446d = paymentHeaderView;
            paymentHeaderView.mo86902g(false);
            ImageButton settingsButton = this.f79446d.getSettingsButton();
            settingsButton.setOnClickListener(new C32213a(C32205k0.this, settingsButton));
        }
    }

    /* renamed from: g81.k0$g */
    private class C32217g extends RecyclerView.C1734f0 {

        /* renamed from: d */
        View f79454d;

        public C32217g(View view) {
            super(view);
            this.f79454d = view.findViewById(C10322k.divider_container);
        }
    }

    /* renamed from: g81.k0$h */
    private class C32218h extends RecyclerView.C1734f0 {
        public C32218h(View view) {
            super(view);
        }
    }

    /* renamed from: g81.k0$i */
    private class C32219i extends RecyclerView.C1734f0 {

        /* renamed from: d */
        PaymentHeaderView f79457d;

        /* renamed from: g81.k0$i$a */
        class C32220a implements View.OnClickListener {

            /* renamed from: d */
            final /* synthetic */ C32205k0 f79459d;

            /* renamed from: e */
            final /* synthetic */ ImageButton f79460e;

            /* renamed from: g81.k0$i$a$a */
            class C32221a implements C0430g1.C0433c {
                C32221a() {
                }

                public boolean onMenuItemClick(MenuItem menuItem) {
                    int itemId = menuItem.getItemId();
                    if (itemId == C10322k.f28896uc) {
                        Intent intent = new Intent(C32205k0.this.f79413i, HouseTemplateGroupActivity.class);
                        intent.putExtra("TEMPLATE_GROUP_ITEM_ID", C32205k0.this.f79422r.getId());
                        ((C35388f2) C32205k0.this.f79413i).startActivityForResult(intent, 100);
                    } else if (itemId == C10322k.delete) {
                        C32205k0.this.m94919Z();
                    } else if (itemId == C10322k.clear_all) {
                        C32205k0.this.mo72745U(false);
                        return true;
                    } else if (itemId == C10322k.add_template) {
                        C32205k0.this.m94920a0();
                    }
                    return false;
                }
            }

            /* renamed from: g81.k0$i$a$b */
            class C32222b implements C0430g1.C0433c {
                C32222b() {
                }

                public boolean onMenuItemClick(MenuItem menuItem) {
                    int itemId = menuItem.getItemId();
                    if (itemId == C10322k.f28896uc) {
                        Intent intent = new Intent(C32205k0.this.f79413i, HouseTemplateGroupActivity.class);
                        intent.putExtra("TEMPLATE_GROUP_ITEM_ID", C32205k0.this.f79422r.getId());
                        ((C35388f2) C32205k0.this.f79413i).startActivityForResult(intent, 100);
                    } else if (itemId == C10322k.delete) {
                        C32205k0.this.m94919Z();
                    } else if (itemId == C10322k.clear_all) {
                        C32205k0.this.mo72745U(false);
                        return true;
                    } else if (itemId == C10322k.add_template) {
                        C32205k0.this.m94920a0();
                    }
                    return false;
                }
            }

            /* renamed from: g81.k0$i$a$c */
            class C32223c implements C0430g1.C0433c {
                C32223c() {
                }

                public boolean onMenuItemClick(MenuItem menuItem) {
                    int itemId = menuItem.getItemId();
                    if (itemId == C10322k.f28896uc) {
                        Intent intent = new Intent(C32205k0.this.f79413i, HouseTemplateGroupActivity.class);
                        intent.putExtra("TEMPLATE_GROUP_ITEM_ID", C32205k0.this.f79422r.getId());
                        ((C35388f2) C32205k0.this.f79413i).startActivityForResult(intent, 100);
                        return false;
                    } else if (itemId == C10322k.delete) {
                        C32205k0.this.m94919Z();
                        return false;
                    } else if (itemId == C10322k.select_all) {
                        C32205k0.this.mo72745U(true);
                        return true;
                    } else if (itemId != C10322k.add_template) {
                        return false;
                    } else {
                        C32205k0.this.m94920a0();
                        return false;
                    }
                }
            }

            C32220a(C32205k0 k0Var, ImageButton imageButton) {
                this.f79459d = k0Var;
                this.f79460e = imageButton;
            }

            public void onClick(View view) {
                if (!C32205k0.this.m94909F()) {
                    C32219i.this.f79457d.mo86907h(this.f79460e, C10325n.house_header_no_items, new C32221a());
                } else if (C32205k0.this.m94910H()) {
                    C32219i.this.f79457d.mo86907h(this.f79460e, C10325n.house_header_clear_all_menu, new C32222b());
                } else {
                    C32219i.this.f79457d.mo86907h(this.f79460e, C10325n.house_header_select_all_menu, new C32223c());
                }
            }
        }

        public C32219i(View view) {
            super(view);
            PaymentHeaderView paymentHeaderView = (PaymentHeaderView) view.findViewById(C10322k.f28770Mf);
            this.f79457d = paymentHeaderView;
            ImageButton settingsButton = paymentHeaderView.getSettingsButton();
            settingsButton.setOnClickListener(new C32220a(C32205k0.this, settingsButton));
        }
    }

    /* renamed from: g81.k0$j */
    private class C32224j extends RecyclerView.C1734f0 {

        /* renamed from: d */
        BogTextView f79465d;

        /* renamed from: e */
        BogTextView f79466e;

        /* renamed from: f */
        ImageView f79467f;

        /* renamed from: g */
        View f79468g;

        /* renamed from: h */
        View f79469h;

        /* renamed from: i */
        View f79470i;

        /* renamed from: g81.k0$j$a */
        class C32225a implements View.OnClickListener {

            /* renamed from: d */
            final /* synthetic */ C32205k0 f79472d;

            /* renamed from: g81.k0$j$a$a */
            class C32226a implements C0430g1.C0433c {
                C32226a() {
                }

                public boolean onMenuItemClick(MenuItem menuItem) {
                    if (menuItem.getItemId() != C10322k.clear_all) {
                        return false;
                    }
                    C32205k0.this.mo72745U(false);
                    return true;
                }
            }

            /* renamed from: g81.k0$j$a$b */
            class C32227b implements C0430g1.C0433c {
                C32227b() {
                }

                public boolean onMenuItemClick(MenuItem menuItem) {
                    if (menuItem.getItemId() != C10322k.select_all) {
                        return false;
                    }
                    C32205k0.this.mo72745U(true);
                    return true;
                }
            }

            C32225a(C32205k0 k0Var) {
                this.f79472d = k0Var;
            }

            public void onClick(View view) {
                if (C32205k0.this.m94910H()) {
                    C0430g1 g1Var = new C0430g1(C32205k0.this.f79413i, view);
                    g1Var.mo2097b().inflate(C10325n.clear_all_menu, g1Var.mo2096a());
                    g1Var.mo2099d(new C32226a());
                    g1Var.mo2100e();
                    return;
                }
                C0430g1 g1Var2 = new C0430g1(C32205k0.this.f79413i, view);
                g1Var2.mo2097b().inflate(C10325n.select_all_menu, g1Var2.mo2096a());
                g1Var2.mo2099d(new C32227b());
                g1Var2.mo2100e();
            }
        }

        public C32224j(View view) {
            super(view);
            this.f79465d = (BogTextView) view.findViewById(C10322k.f28741Hf);
            this.f79466e = (BogTextView) view.findViewById(C10322k.header_right_text);
            this.f79467f = (ImageView) view.findViewById(C10322k.header_right_icon);
            this.f79468g = view.findViewById(C10322k.settings_btn);
            this.f79469h = view.findViewById(C10322k.f28875o9);
            this.f79470i = view.findViewById(C10322k.header_arrow_container);
            this.f79468g.setOnClickListener(new C32225a(C32205k0.this));
        }
    }

    /* renamed from: g81.k0$k */
    private class C32228k extends RecyclerView.C1734f0 {

        /* renamed from: d */
        BogTextView f79476d;

        public C32228k(View view) {
            super(view);
            this.f79476d = (BogTextView) view.findViewById(C10322k.f28863lh);
        }
    }

    /* renamed from: g81.k0$l */
    private class C32229l extends RecyclerView.C1734f0 {

        /* renamed from: d */
        PaymentHeaderView f79478d;

        /* renamed from: g81.k0$l$a */
        class C32230a implements View.OnClickListener {

            /* renamed from: d */
            final /* synthetic */ C32205k0 f79480d;

            /* renamed from: e */
            final /* synthetic */ ImageButton f79481e;

            /* renamed from: g81.k0$l$a$a */
            class C32231a implements C0430g1.C0433c {
                C32231a() {
                }

                public boolean onMenuItemClick(MenuItem menuItem) {
                    if (menuItem.getItemId() != C10322k.clear_all) {
                        return false;
                    }
                    C32205k0.this.mo72745U(false);
                    return true;
                }
            }

            /* renamed from: g81.k0$l$a$b */
            class C32232b implements C0430g1.C0433c {
                C32232b() {
                }

                public boolean onMenuItemClick(MenuItem menuItem) {
                    if (menuItem.getItemId() != C10322k.select_all) {
                        return false;
                    }
                    C32205k0.this.mo72745U(true);
                    return true;
                }
            }

            C32230a(C32205k0 k0Var, ImageButton imageButton) {
                this.f79480d = k0Var;
                this.f79481e = imageButton;
            }

            public void onClick(View view) {
                if (C32205k0.this.m94910H()) {
                    C32229l.this.f79478d.mo86907h(this.f79481e, C10325n.clear_all_menu, new C32231a());
                } else {
                    C32229l.this.f79478d.mo86907h(this.f79481e, C10325n.select_all_menu, new C32232b());
                }
            }
        }

        public C32229l(View view) {
            super(view);
            int i;
            PaymentHeaderView paymentHeaderView = (PaymentHeaderView) view.findViewById(C10322k.f28770Mf);
            this.f79478d = paymentHeaderView;
            ImageButton settingsButton = paymentHeaderView.getSettingsButton();
            if (C32205k0.this.f79427w == null || C32205k0.this.f79427w.size() == 0) {
                i = 8;
            } else {
                i = 0;
            }
            settingsButton.setVisibility(i);
            settingsButton.setOnClickListener(new C32230a(C32205k0.this, settingsButton));
        }
    }

    /* renamed from: g81.k0$m */
    private class C32233m extends RecyclerView.C1734f0 {

        /* renamed from: d */
        ViewGroup f79485d;

        /* renamed from: e */
        View f79486e;

        /* renamed from: f */
        FlipImageViewContainer f79487f;

        /* renamed from: g */
        View f79488g;

        /* renamed from: h */
        BogEditText f79489h;

        /* renamed from: i */
        BogTextView f79490i;

        /* renamed from: j */
        BogTextView f79491j;

        /* renamed from: k */
        BogTextView f79492k;

        /* renamed from: l */
        BogTextView f79493l;

        /* renamed from: m */
        BogTextView f79494m;

        /* renamed from: n */
        View f79495n;

        /* renamed from: o */
        View f79496o;

        /* renamed from: p */
        View f79497p;

        /* renamed from: q */
        SwipeLayout f79498q;

        /* renamed from: r */
        View.OnClickListener f79499r = new C32234a();

        /* renamed from: s */
        View.OnClickListener f79500s = new C32235b();

        /* renamed from: t */
        View.OnClickListener f79501t = new C32236c();

        /* renamed from: u */
        View.OnClickListener f79502u = new C32237d();

        /* renamed from: g81.k0$m$a */
        class C32234a implements View.OnClickListener {
            C32234a() {
            }

            public void onClick(View view) {
                C32233m mVar = C32233m.this;
                C32205k0.this.mo72739K(mVar.getAdapterPosition(), C32233m.this);
            }
        }

        /* renamed from: g81.k0$m$b */
        class C32235b implements View.OnClickListener {
            C32235b() {
            }

            public void onClick(View view) {
                C32233m mVar = C32233m.this;
                C32205k0.this.m94915P(mVar.getAdapterPosition());
            }
        }

        /* renamed from: g81.k0$m$c */
        class C32236c implements View.OnClickListener {
            C32236c() {
            }

            public void onClick(View view) {
                BogEditText bogEditText = C32233m.this.f79489h;
                if (bogEditText != null && bogEditText.isEnabled()) {
                    C32233m.this.f79489h.requestFocus();
                }
            }
        }

        /* renamed from: g81.k0$m$d */
        class C32237d implements View.OnClickListener {
            C32237d() {
            }

            public void onClick(View view) {
                C32233m mVar = C32233m.this;
                int p = C32205k0.this.m94908B(mVar.getAdapterPosition());
                if (!(C32205k0.this.f79414j == null || C32205k0.this.f79427w.get(p) == null || ((TemplateBasketItemWrapperForSelection) C32205k0.this.f79427w.get(p)).getTemplateBasketItem() == null)) {
                    C32205k0.this.f79414j.mo86323T(((TemplateBasketItemWrapperForSelection) C32205k0.this.f79427w.get(p)).getTemplateBasketItem());
                }
                SwipeLayout swipeLayout = C32233m.this.f79498q;
                if (swipeLayout != null) {
                    swipeLayout.mo7586B(2, true);
                }
            }
        }

        /* renamed from: g81.k0$m$e */
        class C32238e implements SwipeLayout.C2362f {

            /* renamed from: a */
            final /* synthetic */ C32205k0 f79508a;

            C32238e(C32205k0 k0Var) {
                this.f79508a = k0Var;
            }

            /* renamed from: a */
            public void mo7627a(SwipeLayout swipeLayout, boolean z) {
                C36546y.m108282F().mo27153t("payments_templates", z ? "right" : "left", "swipe_template", Long.valueOf(z ? 1 : -1));
            }
        }

        /* renamed from: g81.k0$m$f */
        class C32239f implements SwipeLayout.C2361e {

            /* renamed from: a */
            final /* synthetic */ C32205k0 f79510a;

            C32239f(C32205k0 k0Var) {
                this.f79510a = k0Var;
            }

            /* renamed from: a */
            public void mo7626a(boolean z, String str) {
                C32233m.this.f79498q.mo7586B(2, true);
                ArrayList l = C32205k0.this.f79427w;
                C32233m mVar = C32233m.this;
                TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection = (TemplateBasketItemWrapperForSelection) l.get(C32205k0.this.m94908B(mVar.getAdapterPosition()));
                C32233m mVar2 = (C32233m) C32205k0.this.f79423s.mo5320e0(C32233m.this.getAdapterPosition());
                if (templateBasketItemWrapperForSelection.isSelected()) {
                    C32233m mVar3 = C32233m.this;
                    C32205k0.this.mo72739K(mVar3.getAdapterPosition(), mVar2);
                }
                int h = C32205k0.this.f79421q;
                if (h != 10) {
                    if (h != 20) {
                        if (h == 40) {
                            if (z) {
                                str.hashCode();
                                if (str.equals("AUTOMATIC_SERVICES_ID") && C32205k0.this.f79414j != null) {
                                    C32205k0.this.f79414j.mo86324a(templateBasketItemWrapperForSelection.getTemplateBasketItem(), 4);
                                    return;
                                }
                                return;
                            }
                            str.hashCode();
                            if (!str.equals("DELETE_ID")) {
                                if (str.equals("EDIT_ID") && C32205k0.this.f79414j != null) {
                                    C32205k0.this.f79414j.mo86324a(templateBasketItemWrapperForSelection.getTemplateBasketItem(), 2);
                                }
                            } else if (C32205k0.this.f79414j != null) {
                                C32205k0.this.f79414j.mo86324a(templateBasketItemWrapperForSelection.getTemplateBasketItem(), 3);
                            }
                        }
                    } else if (z) {
                        str.hashCode();
                        if (str.equals("AUTOMATIC_SERVICES_ID") && C32205k0.this.f79414j != null) {
                            C32205k0.this.f79414j.mo86324a(templateBasketItemWrapperForSelection.getTemplateBasketItem(), 4);
                        }
                    } else {
                        str.hashCode();
                        if (!str.equals("DELETE_ID")) {
                            if (str.equals("EDIT_ID") && C32205k0.this.f79414j != null) {
                                C32205k0.this.f79414j.mo86324a(templateBasketItemWrapperForSelection.getTemplateBasketItem(), 2);
                            }
                        } else if (C32205k0.this.f79414j != null) {
                            C32205k0.this.f79414j.mo86324a(templateBasketItemWrapperForSelection.getTemplateBasketItem(), 3);
                        }
                    }
                } else if (z) {
                    str.hashCode();
                    if (str.equals("AUTOMATIC_SERVICES_ID") && C32205k0.this.f79414j != null) {
                        C32205k0.this.f79414j.mo86324a(templateBasketItemWrapperForSelection.getTemplateBasketItem(), 4);
                    }
                } else {
                    str.hashCode();
                    if (!str.equals("DELETE_ID")) {
                        if (str.equals("EDIT_ID") && C32205k0.this.f79414j != null) {
                            C32205k0.this.f79414j.mo86324a(templateBasketItemWrapperForSelection.getTemplateBasketItem(), 2);
                        }
                    } else if (C32205k0.this.f79414j != null) {
                        C32205k0.this.f79414j.mo86324a(templateBasketItemWrapperForSelection.getTemplateBasketItem(), 3);
                    }
                }
            }
        }

        public C32233m(View view) {
            super(view);
            this.f79486e = view.findViewById(C10322k.template_basket_container);
            this.f79487f = (FlipImageViewContainer) view.findViewById(C10322k.flipper);
            this.f79489h = (BogEditText) view.findViewById(C10322k.template_amount_et);
            this.f79490i = (BogTextView) view.findViewById(C10322k.template_amount_text_view);
            this.f79491j = (BogTextView) view.findViewById(C10322k.template_item_title);
            this.f79492k = (BogTextView) view.findViewById(C10322k.template_item_mid_desc);
            this.f79493l = (BogTextView) view.findViewById(C10322k.template_item_bottom_desc);
            this.f79494m = (BogTextView) view.findViewById(C10322k.non_editable_tv);
            this.f79488g = view.findViewById(C10322k.error_tv);
            this.f79495n = view.findViewById(C10322k.retry_get_debt);
            this.f79496o = view.findViewById(C10322k.blur_view);
            this.f79498q = (SwipeLayout) view.findViewById(C10322k.swipe_layout);
            this.f79497p = view.findViewById(C10322k.item_to_click);
            this.f79485d = (ViewGroup) view.findViewById(C10322k.amount_wrapper);
            this.f79495n.setOnClickListener(this.f79500s);
            this.f79487f.setOnClickListener(this.f79499r);
            SwipeLayout swipeLayout = this.f79498q;
            if (swipeLayout == null) {
                this.f79486e.setOnClickListener(this.f79502u);
                return;
            }
            swipeLayout.setOnSwipedListener(new C32238e(C32205k0.this));
            this.f79498q.setOnClickListener(this.f79502u);
            this.f79498q.setOnSwipeItemClickListener(new C32239f(C32205k0.this));
        }
    }

    public C32205k0(int i, Context context, Client client, C36772n nVar, View view, C20292b bVar) {
        this.f79421q = i;
        this.f79413i = context;
        this.f79415k = view;
        this.f79414j = nVar;
        this.f79426v = Calendar.getInstance();
        this.f79428x = client;
        this.f79418n = bVar;
        Context context2 = this.f79413i;
        int i2 = C10318g.f28624I0;
        this.f79408d = C0767a.m2893c(context2, i2);
        this.f79409e = C0767a.m2893c(this.f79413i, C10318g.f28625J0);
        this.f79410f = C0767a.m2893c(this.f79413i, i2);
        this.f79411g = C0767a.m2893c(this.f79413i, C10318g.f28630R0);
        this.f79412h = C0767a.m2893c(this.f79413i, C10318g.bog_error_red);
        this.f79427w = new ArrayList();
        this.f79425u = C32355x0.m95516g(C10319h.divider_height);
    }

    /* renamed from: A */
    private int m94907A(int i) {
        int i2 = i * 2;
        return this.f79424t ? i2 + 1 : i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public int m94908B(int i) {
        if (this.f79424t) {
            i--;
        }
        return i / 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public boolean m94909F() {
        Iterator it = this.f79427w.iterator();
        while (it.hasNext()) {
            TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection = (TemplateBasketItemWrapperForSelection) it.next();
            if (!templateBasketItemWrapperForSelection.isHeader() && templateBasketItemWrapperForSelection.getTemplateBasketItem() != null && !templateBasketItemWrapperForSelection.getTemplateBasketItem().isCTPark1Week()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public boolean m94910H() {
        Iterator it = this.f79427w.iterator();
        while (it.hasNext()) {
            TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection = (TemplateBasketItemWrapperForSelection) it.next();
            if (!templateBasketItemWrapperForSelection.isHeader() && !templateBasketItemWrapperForSelection.isSelected() && templateBasketItemWrapperForSelection.getTemplateBasketItem() != null && !templateBasketItemWrapperForSelection.getTemplateBasketItem().isCTPark1Week()) {
                if (!templateBasketItemWrapperForSelection.getTemplateBasketItem().canGetDebt() || !(templateBasketItemWrapperForSelection.getTemplateBasketItem().getTemplateDebtEvent().getState() == 40 || templateBasketItemWrapperForSelection.getTemplateBasketItem().getTemplateDebtEvent().getState() == 30)) {
                    int i = this.f79421q;
                    if (!(i == 10 || i == 20)) {
                        if (i != 30) {
                            if (!(i == 40 || i == 50)) {
                            }
                        } else if (templateBasketItemWrapperForSelection.getTemplateBasketItem().isUserPaying()) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: I */
    private boolean m94911I(TemplateBasketItem templateBasketItem) {
        Date p = C32319m.m95309p(templateBasketItem.getValueByKey("expirationDate"), "dd.MM.yyyy");
        if (p == null || !p.before(new Date())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void m94912M(C13310d dVar, Button button) {
        this.f79428x.deleteTemplateGroup(true, this.f79422r.getId());
        ((PaymentsTemplateListActivity) this.f79413i).mo86322R2(true);
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m94914O() {
        String str;
        String str2;
        ProviderListUIConfiguration providerListUIConfiguration = new ProviderListUIConfiguration();
        C20292b bVar = this.f79418n;
        if (bVar != null) {
            C20557a b = bVar.mo48775b("CAR_TEMPLATE_HIDE_CATEGORY_ID");
            if (!(b == null || b.mo49087d() == null)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(b.mo49087d());
                providerListUIConfiguration.setIgnoredProviderServiceIds(arrayList);
            }
            C20557a b2 = this.f79418n.mo48775b("CAR_TEMPLATE_CATEGORY_MAPPINGS");
            if (!(b2 == null || b2.mo49085b() == null)) {
                try {
                    providerListUIConfiguration.setRedirectProviderServiceIds((Map) new Gson().mo18166h(b2.mo49085b(), new C32208c().getType()));
                } catch (JsonSyntaxException unused) {
                }
            }
        }
        TemplateGroup templateGroup = this.f79422r;
        if (templateGroup == null || !"C".equals(templateGroup.getGroupType())) {
            str2 = null;
            str = null;
        } else {
            str2 = this.f79422r.getCommentGroupByType(PensionStatusResult.STATUS_ACTIVE).getComment();
            str = this.f79422r.getCommentGroupByType("C").getComment();
        }
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put("carNumber", str2);
        }
        if (str != null) {
            hashMap.put("personalNumber", str);
        }
        providerListUIConfiguration.setExtraData(hashMap);
        this.f79413i.startActivity(new Intent(this.f79413i, ProviderListActivity.class).putExtra("CATEGORY_PROVIDER_SERVICE_ID", "category.tbprk.key").putExtra("PROVIDER_UI_CONFIGURATION", providerListUIConfiguration));
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m94915P(int i) {
        C36772n nVar;
        TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection = (TemplateBasketItemWrapperForSelection) this.f79427w.get(m94908B(i));
        if (templateBasketItemWrapperForSelection.getTemplateBasketItem() != null && templateBasketItemWrapperForSelection.getTemplateBasketItem().canGetDebt() && (nVar = this.f79414j) != null) {
            nVar.mo86321G(templateBasketItemWrapperForSelection.getTemplateBasketItem());
        }
    }

    /* renamed from: W */
    private void m94916W(BogEditText bogEditText, String str) {
        if (str == null || str.equals("") || bogEditText.hasFocus()) {
            bogEditText.setText(" ₾");
        } else {
            bogEditText.setText(C32359z0.m95541L(str) + " ₾");
        }
        bogEditText.setNonSelectableString(" ₾");
    }

    /* renamed from: X */
    private void m94917X(BogTextView bogTextView, String str) {
        if (str == null || str.equals("")) {
            bogTextView.setText(" ₾");
            return;
        }
        bogTextView.setText(C32359z0.m95541L(str) + " ₾");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01a4, code lost:
        if (r13 != 50) goto L_0x0293;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0297  */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m94918Y(androidx.recyclerview.widget.RecyclerView.C1734f0 r12, int r13, boolean r14) {
        /*
            r11 = this;
            java.util.ArrayList r0 = r11.f79427w
            int r1 = r11.m94908B(r13)
            java.lang.Object r0 = r0.get(r1)
            ge.bog.mobilebank.model.template.TemplateBasketItemWrapperForSelection r0 = (p341ge.bog.mobilebank.model.template.TemplateBasketItemWrapperForSelection) r0
            ge.bog.mobilebank.model.template.TemplateBasketItem r1 = r0.getTemplateBasketItem()
            java.lang.String r2 = r1.getServiceId()
            ge.bog.mobilebank.model.payment.PaymentProviderConfiguration r2 = r90.C27954d.m86302h(r2)
            int r3 = r12.getItemViewType()
            r4 = 4444(0x115c, float:6.227E-42)
            r5 = 1
            r6 = 0
            if (r3 == r4) goto L_0x0023
            goto L_0x0038
        L_0x0023:
            r3 = r12
            g81.k0$m r3 = (g81.C32205k0.C32233m) r3
            com.alexandrius.accordionswipelayout.library.SwipeLayout r3 = r3.f79498q
            if (r2 == 0) goto L_0x0033
            boolean r2 = r2.isDDAllowed()
            if (r2 == 0) goto L_0x0033
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0035
        L_0x0033:
            r2 = 1056964608(0x3f000000, float:0.5)
        L_0x0035:
            r3.mo7585A(r5, r6, r2)
        L_0x0038:
            g81.k0$m r12 = (g81.C32205k0.C32233m) r12
            ge.bog.mobilebank.ui.views.widgets.BogEditText r2 = r12.f79489h
            ge.bog.mobilebank.ui.views.widgets.BogTextView r3 = r12.f79490i
            ge.bog.mobilebank.ui.views.widgets.BogTextView r4 = r12.f79494m
            if (r14 == 0) goto L_0x0067
            ge.bog.mobilebank.ui.views.widgets.FlipImageViewContainer r14 = r12.f79487f
            java.lang.String r7 = r1.getTemplateImage()
            if (r7 == 0) goto L_0x004f
            java.lang.String r7 = r1.getTemplateImage()
            goto L_0x0053
        L_0x004f:
            java.lang.String r7 = r1.getLogo()
        L_0x0053:
            java.lang.String r7 = g91.C32289b0.m95093e(r7)
            int r8 = p366bk.C10320i.f28688dc
            int r9 = p366bk.C10320i.ic_payment_template_default
            r14.setFrontImageUrl(r7, r8, r9)
            ge.bog.mobilebank.ui.views.widgets.FlipImageViewContainer r14 = r12.f79487f
            boolean r7 = r0.isSelected()
            r14.setFlipped(r7)
        L_0x0067:
            boolean r14 = r1.isEditable()
            r7 = 8
            if (r14 == 0) goto L_0x00c2
            android.view.ViewGroup r14 = r12.f79485d
            r14.setVisibility(r6)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r14 = r12.f79494m
            r14.setVisibility(r7)
            java.lang.String r14 = r0.getNewValue()
            r11.m94916W(r2, r14)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r2.setTag(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = r0.getOriginalValue()
            java.lang.String r14 = g91.C32359z0.m95541L(r14)
            r13.append(r14)
            java.lang.String r14 = " ₾"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r3.setText(r13)
            boolean r13 = r0.isSelected()
            if (r13 == 0) goto L_0x00be
            java.lang.String r13 = r0.getNewValue()
            java.lang.String r14 = r0.getOriginalValue()
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x00b9
            r13 = r7
            goto L_0x00ba
        L_0x00b9:
            r13 = r6
        L_0x00ba:
            r3.setVisibility(r13)
            goto L_0x00d3
        L_0x00be:
            r3.setVisibility(r7)
            goto L_0x00d3
        L_0x00c2:
            android.view.ViewGroup r13 = r12.f79485d
            r13.setVisibility(r7)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r13 = r12.f79494m
            r13.setVisibility(r6)
            java.lang.String r13 = r0.getNewValue()
            r11.m94917X(r4, r13)
        L_0x00d3:
            boolean r13 = r1.canGetDebt()
            r14 = 20
            r2 = 10
            r3 = 40
            r4 = 30
            if (r13 == 0) goto L_0x016f
            boolean r13 = r1.isCTParkItem()
            if (r13 != 0) goto L_0x016f
            ge.bog.mobilebank.eventbus.events.TemplateDebtEvent r13 = r1.getTemplateDebtEvent()
            int r13 = r13.getState()
            if (r13 != r2) goto L_0x010c
            android.view.View r13 = r12.f79488g
            r13.setVisibility(r7)
            android.view.View r13 = r12.f79495n
            r13.setVisibility(r7)
            android.view.View r13 = r12.f79496o
            r13.setVisibility(r6)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r13 = r12.f79492k
            r13.setVisibility(r7)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r13 = r12.f79493l
            r13.setVisibility(r6)
            goto L_0x0188
        L_0x010c:
            ge.bog.mobilebank.eventbus.events.TemplateDebtEvent r13 = r1.getTemplateDebtEvent()
            int r13 = r13.getState()
            if (r13 != r14) goto L_0x0130
            android.view.View r13 = r12.f79488g
            r13.setVisibility(r7)
            android.view.View r13 = r12.f79495n
            r13.setVisibility(r7)
            android.view.View r13 = r12.f79496o
            r13.setVisibility(r7)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r13 = r12.f79492k
            r13.setVisibility(r6)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r13 = r12.f79493l
            r13.setVisibility(r6)
            goto L_0x0188
        L_0x0130:
            ge.bog.mobilebank.eventbus.events.TemplateDebtEvent r13 = r1.getTemplateDebtEvent()
            int r13 = r13.getState()
            if (r13 == r4) goto L_0x0144
            ge.bog.mobilebank.eventbus.events.TemplateDebtEvent r13 = r1.getTemplateDebtEvent()
            int r13 = r13.getState()
            if (r13 != r3) goto L_0x0188
        L_0x0144:
            android.view.ViewGroup r13 = r12.f79485d
            r13.setVisibility(r7)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r13 = r12.f79494m
            r13.setVisibility(r7)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r13 = r12.f79492k
            r13.setVisibility(r7)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r13 = r12.f79493l
            r13.setVisibility(r7)
            android.view.View r13 = r12.f79496o
            r13.setVisibility(r7)
            android.view.View r13 = r12.f79495n
            r13.setVisibility(r6)
            android.view.View r13 = r12.f79488g
            r13.setVisibility(r6)
            android.view.View r13 = r12.f79486e
            int r8 = r11.f79410f
            r13.setBackgroundColor(r8)
            goto L_0x0188
        L_0x016f:
            android.view.View r13 = r12.f79496o
            r13.setVisibility(r7)
            android.view.View r13 = r12.f79488g
            r13.setVisibility(r7)
            android.view.View r13 = r12.f79495n
            r13.setVisibility(r7)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r13 = r12.f79492k
            r13.setVisibility(r6)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r13 = r12.f79493l
            r13.setVisibility(r6)
        L_0x0188:
            ge.bog.mobilebank.ui.views.widgets.BogTextView r13 = r12.f79491j
            ge.bog.mobilebank.model.Client r8 = r11.f79428x
            java.lang.String r8 = r1.getTemplateNameOrServiceName(r8)
            r13.setText(r8)
            int r13 = r11.f79421q
            r8 = 2
            java.lang.String r9 = "N"
            java.lang.String r10 = ""
            if (r13 == r2) goto L_0x0236
            if (r13 == r14) goto L_0x0236
            if (r13 == r4) goto L_0x01a8
            if (r13 == r3) goto L_0x0236
            r14 = 50
            if (r13 == r14) goto L_0x01a8
            goto L_0x0293
        L_0x01a8:
            ge.bog.mobilebank.model.template.TemplateBasketItemsWithPaymentConfig r13 = r11.f79416l
            if (r13 == 0) goto L_0x01b1
            ge.bog.mobilebank.model.payment.PaymentServiceConfig r13 = r13.getPaymentServiceConfigOfItem(r1)
            goto L_0x01b7
        L_0x01b1:
            ge.bog.mobilebank.model.payment.PaymentProviderConfiguration r13 = r11.f79417m
            ge.bog.mobilebank.model.payment.PaymentServiceConfig r13 = r13.getServiceConfigJson()
        L_0x01b7:
            ge.bog.mobilebank.ui.views.widgets.BogTextView r14 = r12.f79491j
            java.lang.CharSequence r14 = r14.getText()
            java.lang.String r14 = r14.toString()
            if (r13 == 0) goto L_0x0225
            boolean r2 = r13.shouldShowByList()
            if (r2 == 0) goto L_0x0207
            java.lang.String r2 = "debtList"
            ge.bog.mobilebank.model.payment.PaymentServiceConfigParameter r13 = r13.getParameterByID(r2)
            r3 = r6
            r2 = r10
        L_0x01d1:
            ge.bog.mobilebank.model.payment.PaymentServiceConfigInput[] r4 = r13.getInput()
            int r4 = r4.length
            if (r3 >= r4) goto L_0x0226
            ge.bog.mobilebank.model.payment.PaymentServiceConfigInput[] r4 = r13.getInput()
            r4 = r4[r3]
            java.lang.String r4 = r4.getId()
            boolean r7 = r1.canGetDebt()
            if (r7 == 0) goto L_0x01f5
            ge.bog.mobilebank.eventbus.events.TemplateDebtEvent r7 = r1.getTemplateDebtEvent()
            ge.bog.mobilebank.model.payment.PaymentDebtResponse r7 = r7.getPaymentDebt()
            java.lang.String r4 = r7.getValueByKey(r4)
            goto L_0x01f9
        L_0x01f5:
            java.lang.String r4 = r1.getParameterValue(r4, r6)
        L_0x01f9:
            if (r3 != 0) goto L_0x01fd
            r14 = r4
            goto L_0x0204
        L_0x01fd:
            if (r3 != r5) goto L_0x0201
            r10 = r4
            goto L_0x0204
        L_0x0201:
            if (r3 != r8) goto L_0x0204
            r2 = r4
        L_0x0204:
            int r3 = r3 + 1
            goto L_0x01d1
        L_0x0207:
            java.lang.String r13 = r13.getParameterIdByParamType(r9)
            boolean r2 = r1.canGetDebt()
            if (r2 == 0) goto L_0x021e
            ge.bog.mobilebank.eventbus.events.TemplateDebtEvent r1 = r1.getTemplateDebtEvent()
            ge.bog.mobilebank.model.payment.PaymentDebtResponse r1 = r1.getPaymentDebt()
            java.lang.String r13 = r1.getValueByKey(r13)
            goto L_0x0222
        L_0x021e:
            java.lang.String r13 = r1.getParameterValue(r13, r6)
        L_0x0222:
            r2 = r10
            r10 = r13
            goto L_0x0226
        L_0x0225:
            r2 = r10
        L_0x0226:
            ge.bog.mobilebank.ui.views.widgets.BogTextView r13 = r12.f79491j
            r13.setText(r14)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r13 = r12.f79492k
            r13.setText(r10)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r13 = r12.f79493l
            r13.setText(r2)
            goto L_0x0293
        L_0x0236:
            ge.bog.mobilebank.model.template.TemplateBasketItemsWithPaymentConfig r13 = r11.f79416l
            java.lang.String r13 = g91.C32315k0.m95275x(r13, r1, r6)
            ge.bog.mobilebank.model.template.TemplateBasketItemsWithPaymentConfig r14 = r11.f79416l
            ge.bog.mobilebank.model.payment.PaymentServiceConfig r14 = r14.getPaymentServiceConfigOfItem(r1)
            ge.bog.mobilebank.model.template.TemplateBasketItemsWithPaymentConfig r2 = r11.f79416l
            if (r2 == 0) goto L_0x0264
            if (r14 == 0) goto L_0x0264
            java.lang.String r14 = r14.getParameterIdByParamType(r9)
            boolean r2 = r1.canGetDebt()
            if (r2 == 0) goto L_0x025f
            ge.bog.mobilebank.eventbus.events.TemplateDebtEvent r2 = r1.getTemplateDebtEvent()
            ge.bog.mobilebank.model.payment.PaymentDebtResponse r2 = r2.getPaymentDebt()
            java.lang.String r14 = r2.getValueByKey(r14)
            goto L_0x0263
        L_0x025f:
            java.lang.String r14 = r1.getParameterValue(r14, r6)
        L_0x0263:
            r10 = r14
        L_0x0264:
            ge.bog.mobilebank.ui.views.widgets.BogTextView r14 = r12.f79492k
            r14.setText(r13)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r13 = r12.f79493l
            r13.setText(r10)
            boolean r13 = r1.canGetDebt()
            if (r13 == 0) goto L_0x028e
            ge.bog.mobilebank.eventbus.events.TemplateDebtEvent r13 = r1.getTemplateDebtEvent()
            int r13 = r13.getState()
            if (r13 == r3) goto L_0x0288
            ge.bog.mobilebank.eventbus.events.TemplateDebtEvent r13 = r1.getTemplateDebtEvent()
            int r13 = r13.getState()
            if (r13 != r4) goto L_0x028e
        L_0x0288:
            ge.bog.mobilebank.ui.views.widgets.BogTextView r13 = r12.f79493l
            r13.setVisibility(r7)
            goto L_0x0293
        L_0x028e:
            ge.bog.mobilebank.ui.views.widgets.BogTextView r13 = r12.f79493l
            r13.setVisibility(r6)
        L_0x0293:
            com.alexandrius.accordionswipelayout.library.SwipeLayout r13 = r12.f79498q
            if (r13 == 0) goto L_0x02b4
            boolean r13 = r0.isLeftSwiped()
            if (r13 == 0) goto L_0x02a3
            com.alexandrius.accordionswipelayout.library.SwipeLayout r12 = r12.f79498q
            r12.mo7586B(r6, r6)
            goto L_0x02b4
        L_0x02a3:
            boolean r13 = r0.isRightSwiped()
            if (r13 == 0) goto L_0x02af
            com.alexandrius.accordionswipelayout.library.SwipeLayout r12 = r12.f79498q
            r12.mo7586B(r5, r6)
            goto L_0x02b4
        L_0x02af:
            com.alexandrius.accordionswipelayout.library.SwipeLayout r12 = r12.f79498q
            r12.mo7586B(r8, r6)
        L_0x02b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g81.C32205k0.m94918Y(androidx.recyclerview.widget.RecyclerView$f0, int, boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m94919Z() {
        C13310d dVar = new C13310d();
        dVar.mo35648c2(this.f79413i.getResources().getString(C10328q.f28931K0));
        dVar.mo35647a2(C13310d.C13312b.TITLE_TWO_BUTTON);
        dVar.mo35639Q1(this.f79413i.getResources().getString(C10328q.f28923E1));
        dVar.mo35646Z1(this.f79413i.getResources().getString(C10328q.f28924F0));
        dVar.mo35645Y1(new C32194i0(this, dVar));
        dVar.mo35642U1(this.f79413i.getResources().getString(C10328q.f28932M0));
        dVar.mo35641T1(new C32197j0(dVar));
        dVar.mo4576A1(((C35388f2) this.f79413i).getSupportFragmentManager(), "Alert");
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m94920a0() {
        if (this.f79422r != null) {
            Intent intent = new Intent(this.f79413i, AddTemplateActivity.class);
            intent.putExtra("TEMPLATE_GROUP_ID", this.f79422r.getId());
            this.f79413i.startActivity(intent);
        }
    }

    /* renamed from: w */
    private void m94938w(RecyclerView.C1734f0 f0Var, TemplateBasketItem templateBasketItem) {
        String str;
        int itemViewType = f0Var.getItemViewType();
        int i = 0;
        if (itemViewType == 9) {
            C32224j jVar = (C32224j) f0Var;
            jVar.f79465d.setText(C10328q.templates_list_header_passes);
            if (templateBasketItem == null) {
                jVar.f79470i.setVisibility(8);
                return;
            }
            jVar.f79470i.setVisibility(0);
            jVar.f79467f.setVisibility(8);
            jVar.f79466e.setTextColor(C32335t0.m95357b());
            jVar.f79466e.setText(this.f79413i.getString(C10328q.templates_button_buy_car_pass));
            jVar.f79470i.setOnClickListener(new C32206a());
        } else if (itemViewType == 80) {
            C32211e eVar = (C32211e) f0Var;
            FlipImageViewContainer flipImageViewContainer = eVar.f79439d;
            if (templateBasketItem.getTemplateImage() != null) {
                str = templateBasketItem.getTemplateImage();
            } else {
                str = templateBasketItem.getLogo();
            }
            flipImageViewContainer.setFrontImageUrl(C32289b0.m95093e(str), C10320i.f28688dc, C10320i.ic_payment_template_default);
            eVar.f79440e.setText(C27950a.m86284a("rbc.car.template.tbilisi"));
            eVar.f79441f.setText(C27950a.m86286c("category.tbprk.name", true));
            eVar.f79442g.setText(C27950a.m86284a("rbc.car.template.terms") + " " + templateBasketItem.getValueByKey("expirationDate") + C27950a.m86284a("rbc.car.template.terms.till"));
            BogTextView bogTextView = eVar.f79443h;
            if (!m94911I(templateBasketItem)) {
                i = 8;
            }
            bogTextView.setVisibility(i);
        }
    }

    /* renamed from: z */
    private void m94939z(Context context, SwipeLayout swipeLayout) {
        Context context2 = context;
        SwipeLayout swipeLayout2 = swipeLayout;
        String string = context2.getString(C10328q.template_swipe_menu_automatic_services);
        Integer valueOf = Integer.valueOf(C10320i.ic_swipe_automatic);
        int i = C10318g.swipe_menu_item_1;
        Integer valueOf2 = Integer.valueOf(C0767a.m2893c(context2, i));
        int i2 = C10318g.swipe_menu_item_text_color;
        Integer valueOf3 = Integer.valueOf(C0767a.m2893c(context2, i2));
        int i3 = C10318g.swipe_menu_item_icon_tint_color;
        SwipeLayout.C2363g gVar = new SwipeLayout.C2363g("AUTOMATIC_SERVICES_ID", string, valueOf, valueOf2, valueOf3, Integer.valueOf(C0767a.m2893c(context2, i3)), (Float) null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SwipeLayout.C2363g("EDIT_ID", context2.getString(C10328q.template_swipe_menu_edit), Integer.valueOf(C10320i.ic_swipe_edit), Integer.valueOf(C0767a.m2893c(context2, i)), Integer.valueOf(C0767a.m2893c(context2, i2)), Integer.valueOf(C0767a.m2893c(context2, i3)), (Float) null));
        arrayList.add(new SwipeLayout.C2363g("DELETE_ID", context2.getString(C10328q.template_swipe_menu_delete), Integer.valueOf(C10320i.ic_swipe_delete), Integer.valueOf(C0767a.m2893c(context2, C10318g.swipe_menu_delete_item_color)), Integer.valueOf(C0767a.m2893c(context2, C10318g.swipe_menu_item_text_white_color)), Integer.valueOf(C0767a.m2893c(context2, C10318g.swipe_menu_item_icon_white_tint_color)), (Float) null));
        swipeLayout2.setLeftSwipeItem(gVar);
        swipeLayout2.setRightSwipeItems(arrayList);
    }

    /* renamed from: C */
    public ArrayList mo72734C() {
        PaymentProviderConfiguration paymentProviderConfiguration;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f79427w;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection = (TemplateBasketItemWrapperForSelection) it.next();
                if (templateBasketItemWrapperForSelection.getTemplateBasketItem() != null && templateBasketItemWrapperForSelection.isSelected() && ((double) Integer.parseInt(templateBasketItemWrapperForSelection.getNewValue())) / 100.0d > Utils.DOUBLE_EPSILON && templateBasketItemWrapperForSelection.getTemplateBasketItem().getTemplateParameters() != null) {
                    TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig = this.f79416l;
                    if (templateBasketItemsWithPaymentConfig != null) {
                        paymentProviderConfiguration = templateBasketItemsWithPaymentConfig.getPaymentProviderConfiguration(templateBasketItemWrapperForSelection.getTemplateBasketItem());
                    } else {
                        paymentProviderConfiguration = this.f79417m;
                    }
                    PaymentDataObject paymentDataObject = new PaymentDataObject();
                    ArrayList q = C32315k0.m95268q(templateBasketItemWrapperForSelection, paymentProviderConfiguration, true);
                    PaymentProviderConfiguration paymentProviderConfiguration2 = this.f79417m;
                    if (paymentProviderConfiguration2 == null || paymentProviderConfiguration2.getServiceId() == null || !this.f79417m.getServiceId().equals("bog-comp-leasing")) {
                        q.add(C32315k0.m95256e(templateBasketItemWrapperForSelection.getTemplateBasketItem().getTemplateNameOrServiceName(this.f79428x)));
                    }
                    q.add(C32315k0.m95255d(String.valueOf(templateBasketItemWrapperForSelection.getTemplateBasketItem().getId())));
                    paymentDataObject.setParameters(q);
                    paymentDataObject.setTemplateName(templateBasketItemWrapperForSelection.getTemplateBasketItem().getTemplateNameOrServiceName(this.f79428x));
                    paymentDataObject.setTemplateId(String.valueOf(templateBasketItemWrapperForSelection.getTemplateBasketItem().getId()));
                    if (paymentProviderConfiguration != null) {
                        paymentDataObject.setServiceId(paymentProviderConfiguration.getPaymentServiceId());
                    }
                    arrayList.add(paymentDataObject);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: D */
    public int mo72735D() {
        PaymentProviderConfiguration paymentProviderConfiguration;
        ArrayList arrayList = this.f79427w;
        int i = 0;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection = (TemplateBasketItemWrapperForSelection) it.next();
                if (templateBasketItemWrapperForSelection.isSelected()) {
                    try {
                        BigDecimal bigDecimal = new BigDecimal(((double) Integer.parseInt(templateBasketItemWrapperForSelection.getNewValue())) / 100.0d);
                        if (bigDecimal.compareTo(BigDecimal.ZERO) > 0) {
                            TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig = this.f79416l;
                            if (templateBasketItemsWithPaymentConfig != null) {
                                paymentProviderConfiguration = templateBasketItemsWithPaymentConfig.getConfig().get(templateBasketItemWrapperForSelection.getTemplateBasketItem().getServiceId());
                            } else {
                                paymentProviderConfiguration = this.f79417m;
                            }
                            i += C32359z0.m95592t(bigDecimal, paymentProviderConfiguration.getCommission()).multiply(new BigDecimal(100)).intValue();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: E */
    public int mo72736E() {
        ArrayList arrayList = this.f79427w;
        int i = 0;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection = (TemplateBasketItemWrapperForSelection) it.next();
                if (templateBasketItemWrapperForSelection.isSelected()) {
                    try {
                        if (Integer.parseInt(templateBasketItemWrapperForSelection.getNewValue()) > 0) {
                            i += Integer.parseInt(templateBasketItemWrapperForSelection.getNewValue());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: G */
    public boolean mo72737G() {
        Iterator it = this.f79427w.iterator();
        while (it.hasNext()) {
            TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection = (TemplateBasketItemWrapperForSelection) it.next();
            if (templateBasketItemWrapperForSelection.getTemplateBasketItem() != null && templateBasketItemWrapperForSelection.getTemplateBasketItem().canGetDebt() && templateBasketItemWrapperForSelection.getTemplateBasketItem().getTemplateDebtEvent().getState() == 10) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: J */
    public void mo72738J(TemplateBasketItem templateBasketItem) {
        PaymentProviderConfiguration paymentProviderConfiguration;
        int i = this.f79421q;
        int i2 = 0;
        if (i == 10 || i == 20) {
            while (true) {
                if (i2 >= this.f79427w.size()) {
                    break;
                }
                TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection = (TemplateBasketItemWrapperForSelection) this.f79427w.get(i2);
                if (templateBasketItemWrapperForSelection.getTemplateBasketItem() != null && templateBasketItemWrapperForSelection.getTemplateBasketItem().getId() == templateBasketItem.getId()) {
                    templateBasketItemWrapperForSelection.setTemplateBasketItem(templateBasketItem);
                    templateBasketItemWrapperForSelection.setNewValue(templateBasketItemWrapperForSelection.getOriginalValue());
                    break;
                }
                i2++;
            }
        } else if (i == 40) {
            if (templateBasketItem.canGetDebt() && templateBasketItem.getTemplateDebtEvent().getState() == 20 && templateBasketItem.getDebtAmount() > 0 && (paymentProviderConfiguration = this.f79416l.getPaymentProviderConfiguration(templateBasketItem)) != null && paymentProviderConfiguration.isHasDebt()) {
                while (i2 < this.f79427w.size()) {
                    if (((TemplateBasketItemWrapperForSelection) this.f79427w.get(i2)).getTemplateBasketItem().getId() == templateBasketItem.getId()) {
                        notifyDataSetChanged();
                        return;
                    }
                    i2++;
                }
                String x = C32315k0.m95275x(this.f79416l, templateBasketItem, true);
                if (this.f79429y.get(templateBasketItem.getServiceId()) == null || !((ArraySet) this.f79429y.get(templateBasketItem.getServiceId())).contains(x)) {
                    ArraySet arraySet = new ArraySet();
                    if (this.f79429y.get(templateBasketItem.getServiceId()) != null) {
                        arraySet.addAll((ArraySet) this.f79429y.get(templateBasketItem.getServiceId()));
                    }
                    arraySet.add(x);
                    this.f79429y.put(templateBasketItem.getServiceId(), arraySet);
                    TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection2 = new TemplateBasketItemWrapperForSelection();
                    templateBasketItemWrapperForSelection2.setTemplateBasketItem(templateBasketItem);
                    templateBasketItemWrapperForSelection2.setSelected(true);
                    templateBasketItemWrapperForSelection2.setNewValue(templateBasketItemWrapperForSelection2.getOriginalValue());
                    this.f79427w.add(templateBasketItemWrapperForSelection2);
                }
            }
            C36772n nVar = this.f79414j;
            if (nVar != null) {
                nVar.mo86325n();
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: K */
    public void mo72739K(int i, C32233m mVar) {
        TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection = (TemplateBasketItemWrapperForSelection) this.f79427w.get(m94908B(i));
        if (!templateBasketItemWrapperForSelection.isHeader() && templateBasketItemWrapperForSelection.getTemplateBasketItem() != null) {
            if (templateBasketItemWrapperForSelection.getTemplateBasketItem().canGetDebt() && templateBasketItemWrapperForSelection.getTemplateBasketItem().getTemplateDebtEvent().getState() != 20) {
                return;
            }
            if (this.f79421q != 30 || templateBasketItemWrapperForSelection.getTemplateBasketItem().isUserPaying()) {
                templateBasketItemWrapperForSelection.setSelected(!templateBasketItemWrapperForSelection.isSelected());
                if (templateBasketItemWrapperForSelection.isSelected() && templateBasketItemWrapperForSelection.getNewValue() != null && Integer.parseInt(templateBasketItemWrapperForSelection.getNewValue()) <= 0) {
                    templateBasketItemWrapperForSelection.setNewValue(C32359z0.m95550U(BankApiResponse.SUCCESSFUL_RESPONSE_CODE));
                    if (mVar != null) {
                        m94918Y(mVar, i, false);
                    } else {
                        notifyItemChanged(i);
                    }
                }
                if (!templateBasketItemWrapperForSelection.isSelected() && mVar != null) {
                    m94916W(mVar.f79489h, templateBasketItemWrapperForSelection.getOriginalValue());
                    ((TemplateBasketItemWrapperForSelection) this.f79427w.get(m94908B(i))).setNewValue(C32359z0.m95550U(mVar.f79489h.getText().toString()));
                    mVar.f79490i.setVisibility(8);
                    mVar.f79489h.clearFocus();
                }
                C36772n nVar = this.f79414j;
                if (nVar != null) {
                    nVar.mo86325n();
                }
                if (mVar != null) {
                    mVar.f79487f.flipImage();
                } else {
                    notifyItemChanged(i);
                }
                notifyItemChanged(i + 1);
            }
        }
    }

    /* renamed from: L */
    public void mo72740L(long j) {
        if (this.f79423s != null) {
            int i = this.f79421q;
            if (i == 30 || i == 50) {
                for (int i2 = 0; i2 < this.f79427w.size(); i2++) {
                    if (((TemplateBasketItemWrapperForSelection) this.f79427w.get(i2)).getTemplateBasketItem() != null && ((TemplateBasketItemWrapperForSelection) this.f79427w.get(i2)).getTemplateBasketItem().getId() == j) {
                        mo72739K(m94907A(i2), (C32233m) this.f79423s.mo5320e0(m94907A(i2)));
                    }
                }
            }
        }
    }

    /* renamed from: Q */
    public void mo72741Q(RecyclerView.C1734f0 f0Var) {
        int B;
        TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection;
        RecyclerView recyclerView = this.f79423s;
        if (recyclerView != null && f0Var == null) {
            int q2 = ((LinearLayoutManager) this.f79423s.getLayoutManager()).mo5223q2();
            for (int n2 = ((LinearLayoutManager) recyclerView.getLayoutManager()).mo5219n2(); n2 <= q2; n2++) {
                RecyclerView.C1734f0 e0 = this.f79423s.mo5320e0(n2);
                if (e0 != null) {
                    mo72741Q(e0);
                }
            }
        } else if (f0Var != null) {
            int itemViewType = f0Var.getItemViewType();
            if ((itemViewType == 4444 || itemViewType == 5555) && (B = m94908B(f0Var.getAdapterPosition())) < this.f79427w.size() && B >= 0 && (templateBasketItemWrapperForSelection = (TemplateBasketItemWrapperForSelection) this.f79427w.get(B)) != null) {
                C32233m mVar = (C32233m) f0Var;
                templateBasketItemWrapperForSelection.setLeftSwiped(mVar.f79498q.mo7615u());
                templateBasketItemWrapperForSelection.setRightSwiped(mVar.f79498q.mo7617w());
            }
        }
    }

    /* renamed from: R */
    public void mo72742R(TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig) {
        C36772n nVar;
        PaymentProviderConfiguration paymentProviderConfiguration;
        this.f79416l = templateBasketItemsWithPaymentConfig;
        this.f79427w = new ArrayList();
        int i = this.f79421q;
        boolean z = false;
        if (i == 10) {
            TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection = new TemplateBasketItemWrapperForSelection();
            templateBasketItemWrapperForSelection.setSelected(false);
            templateBasketItemWrapperForSelection.setHeader(true, 1);
            this.f79427w.add(templateBasketItemWrapperForSelection);
            for (int i2 = 0; i2 < this.f79416l.getTemplates().size(); i2++) {
                TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection2 = new TemplateBasketItemWrapperForSelection();
                templateBasketItemWrapperForSelection2.setTemplateBasketItem(this.f79416l.getTemplates().get(i2));
                templateBasketItemWrapperForSelection2.setSelected(false);
                templateBasketItemWrapperForSelection2.setNewValue(templateBasketItemWrapperForSelection2.getOriginalValue());
                this.f79427w.add(templateBasketItemWrapperForSelection2);
            }
        } else if (i == 20) {
            TemplateGroup templateGroup = this.f79422r;
            if (templateGroup != null && templateGroup.getTemplates() != null) {
                for (TemplateBasketItem next : this.f79422r.getTemplates()) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= this.f79416l.getTemplates().size()) {
                            break;
                        } else if (next.getId() == this.f79416l.getTemplates().get(i3).getId()) {
                            TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection3 = new TemplateBasketItemWrapperForSelection();
                            templateBasketItemWrapperForSelection3.setTemplateBasketItem(this.f79416l.getTemplates().get(i3));
                            templateBasketItemWrapperForSelection3.setNewValue(templateBasketItemWrapperForSelection3.getOriginalValue());
                            this.f79427w.add(templateBasketItemWrapperForSelection3);
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        } else if (i != 30) {
            if (i == 40) {
                this.f79429y.clear();
                for (int i4 = 0; i4 < this.f79416l.getTemplates().size(); i4++) {
                    TemplateBasketItem templateBasketItem = this.f79416l.getTemplates().get(i4);
                    if (templateBasketItem.canGetDebt() && templateBasketItem.getTemplateDebtEvent().getState() == 20 && templateBasketItem.getDebtAmount() > 0 && (paymentProviderConfiguration = this.f79416l.getPaymentProviderConfiguration(templateBasketItem)) != null && paymentProviderConfiguration.isHasDebt()) {
                        String x = C32315k0.m95275x(this.f79416l, templateBasketItem, true);
                        if (this.f79429y.get(templateBasketItem.getServiceId()) == null || !((ArraySet) this.f79429y.get(templateBasketItem.getServiceId())).contains(x)) {
                            ArraySet arraySet = new ArraySet();
                            if (this.f79429y.get(templateBasketItem.getServiceId()) != null) {
                                arraySet.addAll((ArraySet) this.f79429y.get(templateBasketItem.getServiceId()));
                            }
                            arraySet.add(x);
                            this.f79429y.put(templateBasketItem.getServiceId(), arraySet);
                            TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection4 = new TemplateBasketItemWrapperForSelection();
                            templateBasketItemWrapperForSelection4.setTemplateBasketItem(templateBasketItem);
                            templateBasketItemWrapperForSelection4.setSelected(true);
                            templateBasketItemWrapperForSelection4.setNewValue(templateBasketItemWrapperForSelection4.getOriginalValue());
                            this.f79427w.add(templateBasketItemWrapperForSelection4);
                        }
                    }
                }
                Iterator<TemplateGroup> it = this.f79416l.getTemplateGroups().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    TemplateGroup next2 = it.next();
                    if (next2.getCtParkPenaltiesEvent() != null) {
                        if (next2.getCtParkPenaltiesEvent().getState() == 20) {
                            Iterator<TemplateBasketItem> it2 = next2.getCtParkPenaltiesEvent().getCTParkPenalties().iterator();
                            while (it2.hasNext()) {
                                TemplateBasketItem next3 = it2.next();
                                if (next3.isUserPaying()) {
                                    TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection5 = new TemplateBasketItemWrapperForSelection();
                                    templateBasketItemWrapperForSelection5.setTemplateBasketItem(next3);
                                    templateBasketItemWrapperForSelection5.setNewValue(templateBasketItemWrapperForSelection5.getOriginalValue());
                                    templateBasketItemWrapperForSelection5.setSelected(true);
                                    this.f79427w.add(templateBasketItemWrapperForSelection5);
                                    if (!z) {
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                }
                C36772n nVar2 = this.f79414j;
                if (nVar2 != null) {
                    nVar2.mo86325n();
                }
            }
        } else if (this.f79422r != null) {
            Iterator<TemplateGroup> it3 = this.f79416l.getTemplateGroups().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                TemplateGroup next4 = it3.next();
                if (next4.getId() == this.f79422r.getId()) {
                    this.f79422r = next4;
                    TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection6 = new TemplateBasketItemWrapperForSelection();
                    templateBasketItemWrapperForSelection6.setHeader(true, 4);
                    this.f79427w.add(templateBasketItemWrapperForSelection6);
                    if (this.f79422r.getCtPark6MonthsEvent().getState() == 20) {
                        Iterator<TemplateBasketItem> it4 = this.f79422r.getCtPark6MonthsEvent().getCTPark6Months().iterator();
                        boolean z2 = false;
                        while (it4.hasNext()) {
                            TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection7 = new TemplateBasketItemWrapperForSelection();
                            templateBasketItemWrapperForSelection7.setTemplateBasketItem(it4.next());
                            templateBasketItemWrapperForSelection7.setNewValue(templateBasketItemWrapperForSelection7.getOriginalValue());
                            this.f79427w.add(templateBasketItemWrapperForSelection7);
                            z2 = true;
                        }
                        if (!z2) {
                            TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection8 = new TemplateBasketItemWrapperForSelection();
                            templateBasketItemWrapperForSelection8.setEmptyType(1);
                            this.f79427w.add(templateBasketItemWrapperForSelection8);
                        }
                    }
                    TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection9 = new TemplateBasketItemWrapperForSelection();
                    templateBasketItemWrapperForSelection9.setHeader(true, 2);
                    this.f79427w.add(templateBasketItemWrapperForSelection9);
                    if (this.f79422r.getCtParkPenaltiesEvent().getState() == 20) {
                        Iterator<TemplateBasketItem> it5 = this.f79422r.getCtParkPenaltiesEvent().getCTParkPenalties().iterator();
                        boolean z3 = false;
                        while (it5.hasNext()) {
                            TemplateBasketItem next5 = it5.next();
                            if (next5.isUserPaying()) {
                                TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection10 = new TemplateBasketItemWrapperForSelection();
                                templateBasketItemWrapperForSelection10.setTemplateBasketItem(next5);
                                templateBasketItemWrapperForSelection10.setNewValue(templateBasketItemWrapperForSelection10.getOriginalValue());
                                templateBasketItemWrapperForSelection10.setSelected(true);
                                this.f79427w.add(templateBasketItemWrapperForSelection10);
                                if (!z3) {
                                    z3 = true;
                                    z = true;
                                } else {
                                    z = true;
                                }
                            }
                        }
                        if (!z) {
                            TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection11 = new TemplateBasketItemWrapperForSelection();
                            templateBasketItemWrapperForSelection11.setEmptyType(2);
                            this.f79427w.add(templateBasketItemWrapperForSelection11);
                        }
                        z = z3;
                    }
                }
            }
        }
        notifyDataSetChanged();
        if (z && (nVar = this.f79414j) != null) {
            nVar.mo86325n();
        }
        RecyclerView recyclerView = this.f79423s;
        if (recyclerView != null) {
            recyclerView.mo5253C1(-1, -1);
        }
    }

    /* renamed from: S */
    public void mo72743S(boolean z) {
        this.f79424t = z;
        notifyDataSetChanged();
    }

    /* renamed from: T */
    public void mo72744T(ArrayList arrayList, PaymentProviderConfiguration paymentProviderConfiguration) {
        C36772n nVar;
        this.f79427w = new ArrayList();
        this.f79417m = paymentProviderConfiguration;
        boolean z = false;
        if (this.f79421q == 50) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection = new TemplateBasketItemWrapperForSelection();
                templateBasketItemWrapperForSelection.setTemplateBasketItem((TemplateBasketItem) it.next());
                templateBasketItemWrapperForSelection.setNewValue(templateBasketItemWrapperForSelection.getOriginalValue());
                this.f79427w.add(templateBasketItemWrapperForSelection);
                if (!(paymentProviderConfiguration == null || paymentProviderConfiguration.getServiceConfigJson() == null)) {
                    if (PaymentServiceConfig.TYPE_BY_LIST.equals(paymentProviderConfiguration.getServiceConfigJson().getType()) || PaymentServiceConfig.TYPE_DEBT_LIST.equals(paymentProviderConfiguration.getServiceConfigJson().getType())) {
                        templateBasketItemWrapperForSelection.setSelected(true);
                        if (!z) {
                            z = true;
                        }
                    }
                }
            }
        }
        if (z && (nVar = this.f79414j) != null) {
            nVar.mo86325n();
        }
        notifyDataSetChanged();
    }

    /* renamed from: U */
    public void mo72745U(boolean z) {
        if (this.f79423s != null) {
            for (int i = 0; i < this.f79427w.size(); i++) {
                TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection = (TemplateBasketItemWrapperForSelection) this.f79427w.get(i);
                if (!templateBasketItemWrapperForSelection.isHeader() && templateBasketItemWrapperForSelection.getTemplateBasketItem() != null && !templateBasketItemWrapperForSelection.getTemplateBasketItem().isCTPark1Week() && ((!templateBasketItemWrapperForSelection.getTemplateBasketItem().canGetDebt() || !(templateBasketItemWrapperForSelection.getTemplateBasketItem().getTemplateDebtEvent().getState() == 40 || templateBasketItemWrapperForSelection.getTemplateBasketItem().getTemplateDebtEvent().getState() == 30)) && z != templateBasketItemWrapperForSelection.isSelected())) {
                    int A = m94907A(i);
                    C32233m mVar = (C32233m) this.f79423s.mo5320e0(A);
                    if (!z && templateBasketItemWrapperForSelection.isSelected()) {
                        templateBasketItemWrapperForSelection.setNewValue(templateBasketItemWrapperForSelection.getOriginalValue());
                    }
                    if (!z || !templateBasketItemWrapperForSelection.getTemplateBasketItem().canGetDebt() || templateBasketItemWrapperForSelection.getTemplateBasketItem().getTemplateDebtEvent().getState() != 10) {
                        mo72739K(A, mVar);
                    }
                }
            }
        }
    }

    /* renamed from: V */
    public void mo72746V(TemplateGroup templateGroup) {
        this.f79422r = templateGroup;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        int size = (this.f79427w.size() + 0) * 2;
        if (this.f79424t) {
            return size + 1;
        }
        return size;
    }

    public int getItemViewType(int i) {
        boolean z = this.f79424t;
        if (z && i == 0) {
            int i2 = this.f79421q;
            if (i2 == 20) {
                return 4;
            }
            if (i2 == 30) {
                return 7;
            }
            if (i2 == 40) {
                return 5;
            }
        }
        if (i % 2 == z) {
            TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection = (TemplateBasketItemWrapperForSelection) this.f79427w.get(m94908B(i));
            if (templateBasketItemWrapperForSelection.isHeader()) {
                return 8;
            }
            if (this.f79421q == 40 && templateBasketItemWrapperForSelection.getTemplateBasketItem().isCTParkItem()) {
                return 60;
            }
            if (this.f79421q == 30) {
                if (templateBasketItemWrapperForSelection.getEmptyType() == 1) {
                    return 70;
                }
                if (templateBasketItemWrapperForSelection.getEmptyType() == 2) {
                    return 100;
                }
                if (templateBasketItemWrapperForSelection.getTemplateBasketItem().isCTPark1Week()) {
                    return 80;
                }
                if (templateBasketItemWrapperForSelection.getTemplateBasketItem().isUserPaying()) {
                    return 5555;
                }
            }
            if (this.f79421q == 50) {
                return 60;
            }
            return 4444;
        } else if (((TemplateBasketItemWrapperForSelection) this.f79427w.get(m94908B(i))).isHeader()) {
            return 9;
        } else {
            return 10;
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f79423s = recyclerView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        r0 = java.lang.Integer.parseInt(r10.getComment().substring(0, r10.getComment().length() - 1)) + "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02cd, code lost:
        r7 = r0;
        r0 = r10.getComment().substring(r10.getComment().length() - 1, r10.getComment().length());
        r10 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02d1, code lost:
        r10 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02d3, code lost:
        r10 = "";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0290 */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C1734f0 r9, int r10) {
        /*
            r8 = this;
            int r0 = r9.getItemViewType()
            r1 = 4
            java.lang.String r2 = "A"
            java.lang.String r3 = ""
            r4 = 1
            r5 = 0
            if (r0 == r1) goto L_0x022e
            r6 = 5
            if (r0 == r6) goto L_0x01d1
            r6 = 7
            if (r0 == r6) goto L_0x016a
            r2 = 60
            if (r0 == r2) goto L_0x0165
            r2 = 80
            if (r0 == r2) goto L_0x0150
            r2 = 100
            if (r0 == r2) goto L_0x0141
            r2 = 4444(0x115c, float:6.227E-42)
            if (r0 == r2) goto L_0x0165
            r2 = 5555(0x15b3, float:7.784E-42)
            if (r0 == r2) goto L_0x0165
            r2 = 9
            r3 = 30
            r6 = 10
            if (r0 == r2) goto L_0x00ce
            if (r0 == r6) goto L_0x0033
            goto L_0x0306
        L_0x0033:
            java.util.ArrayList r0 = r8.f79427w
            int r1 = r8.m94908B(r10)
            java.lang.Object r0 = r0.get(r1)
            ge.bog.mobilebank.model.template.TemplateBasketItemWrapperForSelection r0 = (p341ge.bog.mobilebank.model.template.TemplateBasketItemWrapperForSelection) r0
            boolean r1 = r0.isSelected()
            if (r1 == 0) goto L_0x0050
            r0 = r9
            g81.k0$g r0 = (g81.C32205k0.C32217g) r0
            android.view.View r0 = r0.f79454d
            int r1 = r8.f79408d
            r0.setBackgroundColor(r1)
            goto L_0x0093
        L_0x0050:
            ge.bog.mobilebank.model.template.TemplateBasketItem r1 = r0.getTemplateBasketItem()
            if (r1 == 0) goto L_0x0089
            ge.bog.mobilebank.model.template.TemplateBasketItem r1 = r0.getTemplateBasketItem()
            boolean r1 = r1.canGetDebt()
            if (r1 == 0) goto L_0x0089
            ge.bog.mobilebank.model.template.TemplateBasketItem r1 = r0.getTemplateBasketItem()
            ge.bog.mobilebank.eventbus.events.TemplateDebtEvent r1 = r1.getTemplateDebtEvent()
            int r1 = r1.getState()
            r2 = 40
            if (r1 == r2) goto L_0x007e
            ge.bog.mobilebank.model.template.TemplateBasketItem r0 = r0.getTemplateBasketItem()
            ge.bog.mobilebank.eventbus.events.TemplateDebtEvent r0 = r0.getTemplateDebtEvent()
            int r0 = r0.getState()
            if (r0 != r3) goto L_0x0089
        L_0x007e:
            r0 = r9
            g81.k0$g r0 = (g81.C32205k0.C32217g) r0
            android.view.View r0 = r0.f79454d
            int r1 = r8.f79410f
            r0.setBackgroundColor(r1)
            goto L_0x0093
        L_0x0089:
            r0 = r9
            g81.k0$g r0 = (g81.C32205k0.C32217g) r0
            android.view.View r0 = r0.f79454d
            int r1 = r8.f79409e
            r0.setBackgroundColor(r1)
        L_0x0093:
            g81.k0$g r9 = (g81.C32205k0.C32217g) r9
            android.view.View r0 = r9.f79454d
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            int r2 = r8.f79425u
            r3 = -1
            r1.<init>(r3, r2)
            r0.setLayoutParams(r1)
            java.util.ArrayList r0 = r8.f79427w
            int r0 = r0.size()
            int r1 = r8.m94908B(r10)
            int r1 = r1 + r4
            if (r0 <= r1) goto L_0x0306
            java.util.ArrayList r0 = r8.f79427w
            int r10 = r8.m94908B(r10)
            int r10 = r10 + r4
            java.lang.Object r10 = r0.get(r10)
            ge.bog.mobilebank.model.template.TemplateBasketItemWrapperForSelection r10 = (p341ge.bog.mobilebank.model.template.TemplateBasketItemWrapperForSelection) r10
            boolean r10 = r10.isHeader()
            if (r10 == 0) goto L_0x0306
            android.view.View r9 = r9.f79454d
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r3, r5)
            r9.setLayoutParams(r10)
            goto L_0x0306
        L_0x00ce:
            int r0 = r8.f79421q
            r2 = 8
            if (r0 == r6) goto L_0x00e5
            if (r0 == r3) goto L_0x00d7
            goto L_0x00f2
        L_0x00d7:
            r0 = r9
            g81.k0$j r0 = (g81.C32205k0.C32224j) r0
            android.view.View r3 = r0.f79468g
            r3.setVisibility(r2)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r0.f79465d
            r0.setVisibility(r5)
            goto L_0x00f2
        L_0x00e5:
            r0 = r9
            g81.k0$j r0 = (g81.C32205k0.C32224j) r0
            android.view.View r3 = r0.f79468g
            r3.setVisibility(r5)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r0.f79465d
            r0.setVisibility(r5)
        L_0x00f2:
            java.util.ArrayList r0 = r8.f79427w
            int r3 = r8.m94908B(r10)
            java.lang.Object r0 = r0.get(r3)
            ge.bog.mobilebank.model.template.TemplateBasketItemWrapperForSelection r0 = (p341ge.bog.mobilebank.model.template.TemplateBasketItemWrapperForSelection) r0
            boolean r3 = r0.isHeader()
            if (r3 == 0) goto L_0x0306
            r3 = r9
            g81.k0$j r3 = (g81.C32205k0.C32224j) r3
            android.view.View r5 = r3.f79470i
            r5.setVisibility(r2)
            int r0 = r0.getHeaderType()
            if (r0 == r4) goto L_0x0138
            r2 = 2
            if (r0 == r2) goto L_0x012f
            if (r0 == r1) goto L_0x0119
            goto L_0x0306
        L_0x0119:
            java.util.ArrayList r0 = r8.f79427w
            int r10 = r10 + r4
            int r10 = r8.m94908B(r10)
            java.lang.Object r10 = r0.get(r10)
            ge.bog.mobilebank.model.template.TemplateBasketItemWrapperForSelection r10 = (p341ge.bog.mobilebank.model.template.TemplateBasketItemWrapperForSelection) r10
            ge.bog.mobilebank.model.template.TemplateBasketItem r10 = r10.getTemplateBasketItem()
            r8.m94938w(r9, r10)
            goto L_0x0306
        L_0x012f:
            ge.bog.mobilebank.ui.views.widgets.BogTextView r9 = r3.f79465d
            int r10 = p366bk.C10328q.templates_list_header_tickets
            r9.setText(r10)
            goto L_0x0306
        L_0x0138:
            ge.bog.mobilebank.ui.views.widgets.BogTextView r9 = r3.f79465d
            int r10 = p366bk.C10328q.templates_list_header_my_templates
            r9.setText(r10)
            goto L_0x0306
        L_0x0141:
            g81.k0$k r9 = (g81.C32205k0.C32228k) r9
            ge.bog.mobilebank.ui.views.widgets.BogTextView r9 = r9.f79476d
            java.lang.String r10 = "rbc.car.template.fine.not.found"
            java.lang.String r10 = r90.C27950a.m86284a(r10)
            r9.setText(r10)
            goto L_0x0306
        L_0x0150:
            java.util.ArrayList r0 = r8.f79427w
            int r10 = r8.m94908B(r10)
            java.lang.Object r10 = r0.get(r10)
            ge.bog.mobilebank.model.template.TemplateBasketItemWrapperForSelection r10 = (p341ge.bog.mobilebank.model.template.TemplateBasketItemWrapperForSelection) r10
            ge.bog.mobilebank.model.template.TemplateBasketItem r10 = r10.getTemplateBasketItem()
            r8.m94938w(r9, r10)
            goto L_0x0306
        L_0x0165:
            r8.m94918Y(r9, r10, r4)
            goto L_0x0306
        L_0x016a:
            ge.bog.mobilebank.model.template.TemplateGroup r10 = r8.f79422r
            if (r10 == 0) goto L_0x0306
            g81.k0$f r9 = (g81.C32205k0.C32212f) r9
            ge.bog.mobilebank.ui.views.controllers.PaymentHeaderView r0 = r9.f79446d
            java.lang.String r10 = r10.getGroupName()
            r0.setMainText(r10)
            ge.bog.mobilebank.model.template.TemplateGroup r10 = r8.f79422r
            ge.bog.mobilebank.model.template.TemplateGroupComment r10 = r10.getCommentGroupByType(r2)
            if (r10 == 0) goto L_0x01a0
            ge.bog.mobilebank.ui.views.controllers.PaymentHeaderView r10 = r9.f79446d
            ge.bog.mobilebank.model.template.TemplateGroup r0 = r8.f79422r
            ge.bog.mobilebank.model.template.TemplateGroupComment r0 = r0.getCommentGroupByType(r2)
            java.lang.String r0 = r0.getComment()
            r10.setSubText(r0)
            ge.bog.mobilebank.ui.views.controllers.PaymentHeaderView r10 = r9.f79446d
            ge.bog.mobilebank.model.template.TemplateGroup r0 = r8.f79422r
            ge.bog.mobilebank.model.template.TemplateGroupComment r0 = r0.getCommentGroupByType(r2)
            java.lang.String r0 = r0.getComment()
            r10.setCarNumber(r0)
            goto L_0x01aa
        L_0x01a0:
            ge.bog.mobilebank.ui.views.controllers.PaymentHeaderView r10 = r9.f79446d
            r10.setSubText(r3)
            ge.bog.mobilebank.ui.views.controllers.PaymentHeaderView r10 = r9.f79446d
            r10.setCarNumber(r3)
        L_0x01aa:
            ge.bog.mobilebank.ui.views.controllers.PaymentHeaderView r10 = r9.f79446d
            r10.setNotificationVisible(r5)
            ge.bog.mobilebank.ui.views.controllers.PaymentHeaderView r10 = r9.f79446d
            int r0 = p366bk.C10318g.f28646j1
            r10.setImageColor(r0)
            ge.bog.mobilebank.model.template.TemplateGroup r10 = r8.f79422r
            java.lang.String r10 = r10.getGroupImage()
            if (r10 == 0) goto L_0x0306
            ge.bog.mobilebank.ui.views.controllers.PaymentHeaderView r9 = r9.f79446d
            ge.bog.mobilebank.model.template.TemplateGroup r10 = r8.f79422r
            java.lang.String r10 = r10.getGroupImage()
            java.lang.String r10 = g91.C32289b0.m95093e(r10)
            int r1 = p366bk.C10320i.f28688dc
            r9.mo86898b(r10, r1, r0)
            goto L_0x0306
        L_0x01d1:
            java.util.ArrayList r10 = r8.f79427w
            java.util.Iterator r10 = r10.iterator()
            r0 = r5
        L_0x01d8:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x01ee
            java.lang.Object r1 = r10.next()
            ge.bog.mobilebank.model.template.TemplateBasketItemWrapperForSelection r1 = (p341ge.bog.mobilebank.model.template.TemplateBasketItemWrapperForSelection) r1
            java.lang.String r1 = r1.getOriginalValue()     // Catch:{ Exception -> 0x01d8 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x01d8 }
            int r0 = r0 + r1
            goto L_0x01d8
        L_0x01ee:
            g81.k0$l r9 = (g81.C32205k0.C32229l) r9
            ge.bog.mobilebank.ui.views.controllers.PaymentHeaderView r10 = r9.f79478d
            android.content.Context r1 = r8.f79413i
            int r2 = p366bk.C10328q.templates_bills_due
            java.lang.String r1 = r1.getString(r2)
            r10.setMainText(r1)
            ge.bog.mobilebank.ui.views.controllers.PaymentHeaderView r10 = r9.f79478d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = g91.C32359z0.m95544O(r0)
            r10.setImageText(r0)
            ge.bog.mobilebank.ui.views.controllers.PaymentHeaderView r10 = r9.f79478d
            r10.setNotificationVisible(r5)
            ge.bog.mobilebank.ui.views.controllers.PaymentHeaderView r10 = r9.f79478d
            int r0 = p366bk.C10318g.f28646j1
            r10.setImageTextColor(r0)
            ge.bog.mobilebank.ui.views.controllers.PaymentHeaderView r9 = r9.f79478d
            android.content.Context r10 = r8.f79413i
            int r10 = g91.C32335t0.m95367l(r10, r4)
            r9.setImageColor(r10)
            goto L_0x0306
        L_0x022e:
            ge.bog.mobilebank.model.template.TemplateGroup r10 = r8.f79422r
            if (r10 == 0) goto L_0x0306
            g81.k0$i r9 = (g81.C32205k0.C32219i) r9
            ge.bog.mobilebank.ui.views.controllers.PaymentHeaderView r0 = r9.f79457d
            java.lang.String r10 = r10.getGroupName()
            r0.setMainText(r10)
            ge.bog.mobilebank.model.template.TemplateGroup r10 = r8.f79422r
            ge.bog.mobilebank.model.template.TemplateGroupComment r10 = r10.getCommentGroupByType(r2)
            if (r10 == 0) goto L_0x0255
            ge.bog.mobilebank.ui.views.controllers.PaymentHeaderView r10 = r9.f79457d
            ge.bog.mobilebank.model.template.TemplateGroup r0 = r8.f79422r
            ge.bog.mobilebank.model.template.TemplateGroupComment r0 = r0.getCommentGroupByType(r2)
            java.lang.String r0 = r0.getComment()
            r10.setSubText(r0)
            goto L_0x025a
        L_0x0255:
            ge.bog.mobilebank.ui.views.controllers.PaymentHeaderView r10 = r9.f79457d
            r10.setSubText(r3)
        L_0x025a:
            ge.bog.mobilebank.ui.views.controllers.PaymentHeaderView r10 = r9.f79457d
            r10.setNotificationVisible(r5)
            ge.bog.mobilebank.ui.views.controllers.PaymentHeaderView r10 = r9.f79457d
            int r0 = p366bk.C10318g.f28646j1
            r10.setImageTextColor(r0)
            ge.bog.mobilebank.model.template.TemplateGroup r10 = r8.f79422r
            java.util.List r10 = r10.getComments()
            if (r10 == 0) goto L_0x02e8
            ge.bog.mobilebank.model.template.TemplateGroup r10 = r8.f79422r
            java.lang.String r0 = "B"
            ge.bog.mobilebank.model.template.TemplateGroupComment r10 = r10.getCommentGroupByType(r0)
            if (r10 == 0) goto L_0x02e8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0290 }
            r0.<init>()     // Catch:{ Exception -> 0x0290 }
            java.lang.String r1 = r10.getComment()     // Catch:{ Exception -> 0x0290 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x0290 }
            r0.append(r1)     // Catch:{ Exception -> 0x0290 }
            r0.append(r3)     // Catch:{ Exception -> 0x0290 }
            java.lang.String r10 = r0.toString()     // Catch:{ Exception -> 0x0290 }
            goto L_0x02d4
        L_0x0290:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02d3 }
            r0.<init>()     // Catch:{ Exception -> 0x02d3 }
            java.lang.String r1 = r10.getComment()     // Catch:{ Exception -> 0x02d3 }
            java.lang.String r2 = r10.getComment()     // Catch:{ Exception -> 0x02d3 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x02d3 }
            int r2 = r2 - r4
            java.lang.String r1 = r1.substring(r5, r2)     // Catch:{ Exception -> 0x02d3 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x02d3 }
            r0.append(r1)     // Catch:{ Exception -> 0x02d3 }
            r0.append(r3)     // Catch:{ Exception -> 0x02d3 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02d3 }
            java.lang.String r1 = r10.getComment()     // Catch:{ Exception -> 0x02d1 }
            java.lang.String r2 = r10.getComment()     // Catch:{ Exception -> 0x02d1 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x02d1 }
            int r2 = r2 - r4
            java.lang.String r10 = r10.getComment()     // Catch:{ Exception -> 0x02d1 }
            int r10 = r10.length()     // Catch:{ Exception -> 0x02d1 }
            java.lang.String r10 = r1.substring(r2, r10)     // Catch:{ Exception -> 0x02d1 }
            r7 = r0
            r0 = r10
            r10 = r7
            goto L_0x02d5
        L_0x02d1:
            r10 = r0
            goto L_0x02d4
        L_0x02d3:
            r10 = r3
        L_0x02d4:
            r0 = r3
        L_0x02d5:
            boolean r1 = r10.equals(r3)
            if (r1 != 0) goto L_0x02e8
            ge.bog.mobilebank.ui.views.controllers.PaymentHeaderView r1 = r9.f79457d
            r1.mo86900d(r10, r0)
            ge.bog.mobilebank.ui.views.controllers.PaymentHeaderView r10 = r9.f79457d
            int r0 = p366bk.C10318g.template_house_background_color
            r10.setImageColor(r0)
            goto L_0x02e9
        L_0x02e8:
            r4 = r5
        L_0x02e9:
            if (r4 == 0) goto L_0x02f3
            ge.bog.mobilebank.model.template.TemplateGroup r10 = r8.f79422r
            java.lang.String r10 = r10.getGroupImage()
            if (r10 == 0) goto L_0x0306
        L_0x02f3:
            ge.bog.mobilebank.ui.views.controllers.PaymentHeaderView r9 = r9.f79457d
            ge.bog.mobilebank.model.template.TemplateGroup r10 = r8.f79422r
            java.lang.String r10 = r10.getGroupImage()
            java.lang.String r10 = g91.C32289b0.m95093e(r10)
            int r0 = p366bk.C10320i.ic_house_default
            int r1 = p366bk.C10318g.template_house_background_color
            r9.mo86898b(r10, r0, r1)
        L_0x0306:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g81.C32205k0.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$f0, int):void");
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 4) {
            return new C32219i(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.template_basket_item_sum_header, viewGroup, false));
        }
        if (i == 5) {
            return new C32229l(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.template_basket_item_sum_header, viewGroup, false));
        }
        if (i == 60) {
            return new C32233m(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.template_basket_item, viewGroup, false));
        }
        if (i == 70) {
            return new C32209d(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.templates_add_layout, viewGroup, false));
        }
        if (i == 80) {
            return new C32211e(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.template_basket_item_car_park_pass, viewGroup, false));
        }
        if (i == 100) {
            return new C32228k(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.templates_no_data_layout, viewGroup, false));
        }
        if (i == 4444) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.template_basket_item_swipable, viewGroup, false);
            m94939z(viewGroup.getContext(), (SwipeLayout) inflate);
            return new C32233m(inflate);
        } else if (i != 5555) {
            switch (i) {
                case 7:
                    return new C32212f(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.template_basket_item_sum_header, viewGroup, false));
                case 8:
                    return new C32218h(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.payments_last_operations_list_divider, viewGroup, false));
                case 9:
                    return new C32224j(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.template_basket_header_item, viewGroup, false));
                case 10:
                    return new C32217g(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.template_basket_item_divider, viewGroup, false));
                default:
                    return null;
            }
        } else {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.template_basket_item_car_swipable, viewGroup, false);
            ((SwipeLayout) inflate2).setSwipeEnabled(false);
            return new C32233m(inflate2);
        }
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f79423s = null;
    }

    public void onViewAttachedToWindow(RecyclerView.C1734f0 f0Var) {
        super.onViewAttachedToWindow(f0Var);
        int itemViewType = f0Var.getItemViewType();
        if (itemViewType == 60 || itemViewType == 4444 || itemViewType == 5555) {
            ((C32233m) f0Var).f79489h.setOnFocusChangeListener(this.f79430z);
        }
    }

    public void onViewDetachedFromWindow(RecyclerView.C1734f0 f0Var) {
        super.onViewDetachedFromWindow(f0Var);
        mo72741Q(f0Var);
    }

    /* renamed from: x */
    public void mo72747x() {
        this.f79427w = new ArrayList();
        notifyDataSetChanged();
    }

    /* renamed from: y */
    public void mo72748y() {
        BogEditText bogEditText = this.f79419o;
        if (bogEditText != null) {
            bogEditText.clearFocus();
            C32290b1.m95112b(this.f79419o);
        }
    }
}

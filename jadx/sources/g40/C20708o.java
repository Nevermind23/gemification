package g40;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import cf1.C40419j;
import com.alexandrius.accordionswipelayout.library.SwipeLayout;
import com.salesforce.marketingcloud.C11398b;
import g91.C32303f;
import g91.C32343x;
import g91.C32359z0;
import he1.C41238w;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.model.AddBudgetModel;
import p341ge.bog.mobilebank.p975ui.views.widgets.FlipImageViewContainer;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import q40.C27680a;
import ue1.C43075l;
import ue1.C43079p;
import x00.C29615f;

/* renamed from: g40.o */
public final class C20708o extends C29615f {

    /* renamed from: o */
    public static final C20714c f55856o = new C20714c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final C40419j f55857p = new C40419j("^(\\d+(\\.\\d{0,2})?)$");
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C20716e f55858f;

    /* renamed from: g */
    private final boolean f55859g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public ArrayList f55860h = new ArrayList();

    /* renamed from: i */
    private String f55861i = "";

    /* renamed from: j */
    private BigDecimal f55862j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public HashMap f55863k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public SwipeLayout f55864l;

    /* renamed from: m */
    private RecyclerView f55865m;

    /* renamed from: n */
    private boolean f55866n;

    /* renamed from: g40.o$a */
    public final class C20709a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private TextView f55867d;

        /* renamed from: e */
        final /* synthetic */ C20708o f55868e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20709a(C20708o oVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f55868e = oVar;
            View findViewById = view.findViewById(C10322k.tvTotalBudget);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.tvTotalBudget)");
            this.f55867d = (TextView) findViewById;
        }

        /* renamed from: h */
        public final void mo49238h(BigDecimal bigDecimal) {
            C41536l.m120489i(bigDecimal, "sum");
            TextView textView = this.f55867d;
            BigDecimal multiply = bigDecimal.multiply(new BigDecimal(100));
            C41536l.m120488h(multiply, "this.multiply(other)");
            String N = C32359z0.m95543N(multiply.toString());
            String h = C32303f.m95197h("GEL");
            textView.setText(N + " " + h);
        }
    }

    /* renamed from: g40.o$b */
    public final class C20710b extends RecyclerView.C1734f0 {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public AddBudgetModel f55869d;

        /* renamed from: e */
        private ExpandableItemView f55870e;

        /* renamed from: f */
        final /* synthetic */ C20708o f55871f;

        /* renamed from: g40.o$b$a */
        static final class C20711a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C20710b f55872d;

            /* renamed from: e */
            final /* synthetic */ C20708o f55873e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20711a(C20710b bVar, C20708o oVar) {
                super(1);
                this.f55872d = bVar;
                this.f55873e = oVar;
            }

            /* renamed from: a */
            public final void mo49240a(View view) {
                AddBudgetModel addBudgetModel;
                View view2 = view;
                C41536l.m120489i(view2, "view");
                SwipeLayout swipeLayout = (SwipeLayout) view2;
                this.f55872d.m67103u(swipeLayout, -1);
                this.f55872d.m67087H(swipeLayout);
                View findViewById = view2.findViewById(C10322k.et_budget_for_category);
                C41536l.m120488h(findViewById, "view.findViewById(R.id.et_budget_for_category)");
                EditText editText = (EditText) findViewById;
                View findViewById2 = view2.findViewById(C10322k.tvCategoryName);
                C41536l.m120488h(findViewById2, "view.findViewById(R.id.tvCategoryName)");
                TextView textView = (TextView) findViewById2;
                View findViewById3 = view2.findViewById(C10322k.imgCategoryLogo);
                C41536l.m120488h(findViewById3, "view.findViewById(R.id.imgCategoryLogo)");
                FlipImageViewContainer flipImageViewContainer = (FlipImageViewContainer) findViewById3;
                View findViewById4 = view2.findViewById(C10322k.txtError);
                C41536l.m120488h(findViewById4, "view.findViewById(R.id.txtError)");
                TextView textView2 = (TextView) findViewById4;
                View findViewById5 = view2.findViewById(C10322k.layoutStroke);
                C41536l.m120488h(findViewById5, "view.findViewById(R.id.layoutStroke)");
                ConstraintLayout constraintLayout = (ConstraintLayout) findViewById5;
                View findViewById6 = view2.findViewById(C10322k.txt_ccy_sym);
                C41536l.m120488h(findViewById6, "view.findViewById(R.id.txt_ccy_sym)");
                TextView textView3 = (TextView) findViewById6;
                View findViewById7 = view2.findViewById(C10322k.connectorLineView);
                C41536l.m120488h(findViewById7, "view.findViewById(R.id.connectorLineView)");
                HashMap F = this.f55873e.f55863k;
                AddBudgetModel p = this.f55872d.f55869d;
                if (p == null) {
                    C41536l.m120506z("data");
                    p = null;
                }
                F.put(Long.valueOf(p.mo54887e()), editText);
                this.f55872d.m67082C(flipImageViewContainer);
                C20710b bVar = this.f55872d;
                AddBudgetModel p2 = bVar.f55869d;
                if (p2 == null) {
                    C41536l.m120506z("data");
                    p2 = null;
                }
                C20710b.m67107z(bVar, p2, textView, flipImageViewContainer, textView2, constraintLayout, editText, textView3, findViewById7, true, 0, C11398b.f33140s, (Object) null);
                C20710b bVar2 = this.f55872d;
                AddBudgetModel p3 = bVar2.f55869d;
                if (p3 == null) {
                    C41536l.m120506z("data");
                    addBudgetModel = null;
                } else {
                    addBudgetModel = p3;
                }
                bVar2.m67083D(editText, addBudgetModel, true, flipImageViewContainer, (SwipeLayout) view2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo49240a((View) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: g40.o$b$b */
        static final class C20712b extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C20710b f55874d;

            /* renamed from: e */
            final /* synthetic */ C20708o f55875e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20712b(C20710b bVar, C20708o oVar) {
                super(2);
                this.f55874d = bVar;
                this.f55875e = oVar;
            }

            /* renamed from: a */
            public final void mo49241a(View view, int i) {
                View view2 = view;
                int i2 = i;
                C41536l.m120489i(view2, "view");
                this.f55874d.m67103u((SwipeLayout) view2, i2);
                View findViewById = view2.findViewById(C10322k.et_budget_for_category);
                C41536l.m120488h(findViewById, "view.findViewById(R.id.et_budget_for_category)");
                EditText editText = (EditText) findViewById;
                View findViewById2 = view2.findViewById(C10322k.tvCategoryName);
                C41536l.m120488h(findViewById2, "view.findViewById(R.id.tvCategoryName)");
                TextView textView = (TextView) findViewById2;
                View findViewById3 = view2.findViewById(C10322k.imgCategoryLogo);
                C41536l.m120488h(findViewById3, "view.findViewById(R.id.imgCategoryLogo)");
                FlipImageViewContainer flipImageViewContainer = (FlipImageViewContainer) findViewById3;
                View findViewById4 = view2.findViewById(C10322k.txtError);
                C41536l.m120488h(findViewById4, "view.findViewById(R.id.txtError)");
                TextView textView2 = (TextView) findViewById4;
                View findViewById5 = view2.findViewById(C10322k.layoutStroke);
                C41536l.m120488h(findViewById5, "view.findViewById(R.id.layoutStroke)");
                ConstraintLayout constraintLayout = (ConstraintLayout) findViewById5;
                View findViewById6 = view2.findViewById(C10322k.txt_ccy_sym);
                C41536l.m120488h(findViewById6, "view.findViewById(R.id.txt_ccy_sym)");
                TextView textView3 = (TextView) findViewById6;
                View findViewById7 = view2.findViewById(C10322k.connectorLineBottomView);
                C41536l.m120488h(findViewById7, "view.findViewById(R.id.connectorLineBottomView)");
                AddBudgetModel p = this.f55874d.f55869d;
                if (p == null) {
                    C41536l.m120506z("data");
                    p = null;
                }
                AddBudgetModel addBudgetModel = (AddBudgetModel) p.mo54885d().get(i2);
                this.f55875e.f55863k.put(Long.valueOf(addBudgetModel.mo54887e()), editText);
                this.f55874d.m67082C(flipImageViewContainer);
                this.f55874d.m67106y(addBudgetModel, textView, flipImageViewContainer, textView2, constraintLayout, editText, textView3, findViewById7, false, i);
                this.f55874d.m67083D(editText, addBudgetModel, false, flipImageViewContainer, (SwipeLayout) view2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo49241a((View) obj, ((Number) obj2).intValue());
                return C41238w.f97225a;
            }
        }

        /* renamed from: g40.o$b$c */
        public static final class C20713c implements TextWatcher {

            /* renamed from: d */
            final /* synthetic */ AddBudgetModel f55876d;

            /* renamed from: e */
            final /* synthetic */ EditText f55877e;

            /* renamed from: f */
            final /* synthetic */ boolean f55878f;

            /* renamed from: g */
            final /* synthetic */ C20708o f55879g;

            /* renamed from: h */
            final /* synthetic */ C20710b f55880h;

            C20713c(AddBudgetModel addBudgetModel, EditText editText, boolean z, C20708o oVar, C20710b bVar) {
                this.f55876d = addBudgetModel;
                this.f55877e = editText;
                this.f55878f = z;
                this.f55879g = oVar;
                this.f55880h = bVar;
            }

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                boolean z;
                BigDecimal bigDecimal;
                if (charSequence != null) {
                    this.f55880h.m67089J(charSequence, this.f55877e);
                }
                AddBudgetModel addBudgetModel = this.f55876d;
                Editable text = this.f55877e.getText();
                C41536l.m120488h(text, "etBudget.text");
                if (text.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    bigDecimal = new BigDecimal(this.f55877e.getText().toString());
                } else {
                    bigDecimal = BigDecimal.ZERO;
                    C41536l.m120488h(bigDecimal, "{\n                      …ERO\n                    }");
                }
                addBudgetModel.mo54901s(bigDecimal);
                if (!this.f55878f) {
                    Object obj = this.f55879g.f55860h.get(this.f55879g.mo69515m(this.f55880h.getAdapterPosition()));
                    C41536l.m120488h(obj, "this@EditBudgetRecyclerA…Section(adapterPosition)]");
                    AddBudgetModel addBudgetModel2 = (AddBudgetModel) obj;
                    BigDecimal k = addBudgetModel2.mo54895k();
                    List d = addBudgetModel2.mo54885d();
                    BigDecimal bigDecimal2 = BigDecimal.ZERO;
                    for (Object next : d) {
                        C41536l.m120488h(bigDecimal2, "sum");
                        bigDecimal2 = bigDecimal2.add(((AddBudgetModel) next).mo54895k());
                        C41536l.m120488h(bigDecimal2, "this.add(other)");
                    }
                    C41536l.m120488h(bigDecimal2, "sum");
                    if (k.compareTo(bigDecimal2) < 0) {
                        List d2 = addBudgetModel2.mo54885d();
                        BigDecimal bigDecimal3 = BigDecimal.ZERO;
                        for (Object next2 : d2) {
                            C41536l.m120488h(bigDecimal3, "sum");
                            bigDecimal3 = bigDecimal3.add(((AddBudgetModel) next2).mo54895k());
                            C41536l.m120488h(bigDecimal3, "this.add(other)");
                        }
                        C41536l.m120488h(bigDecimal3, "sum");
                        addBudgetModel2.mo54901s(bigDecimal3);
                        EditText editText = (EditText) this.f55879g.f55863k.get(Long.valueOf(addBudgetModel2.mo54887e()));
                        if (editText != null) {
                            List d3 = addBudgetModel2.mo54885d();
                            BigDecimal bigDecimal4 = BigDecimal.ZERO;
                            for (Object next3 : d3) {
                                C41536l.m120488h(bigDecimal4, "sum");
                                bigDecimal4 = bigDecimal4.add(((AddBudgetModel) next3).mo54895k());
                                C41536l.m120488h(bigDecimal4, "this.add(other)");
                            }
                            C41536l.m120488h(bigDecimal4, "sum");
                            editText.setText(bigDecimal4.toString());
                        }
                    }
                }
                this.f55879g.f55858f.mo49247b(this.f55879g.f55860h);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20710b(C20708o oVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f55871f = oVar;
            View findViewById = view.findViewById(C10322k.expandableItem);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.expandableItem)");
            ExpandableItemView expandableItemView = (ExpandableItemView) findViewById;
            this.f55870e = expandableItemView;
            expandableItemView.setExpandable(false);
            this.f55870e.setOnBindHeader(new C20711a(this, oVar));
            this.f55870e.setOnBindItem(new C20712b(this, oVar));
        }

        /* renamed from: A */
        private final void m67080A(TextView textView, EditText editText, TextView textView2, String str) {
            textView.setVisibility(0);
            textView.setText(str);
            Context context = this.itemView.getContext();
            int i = C10318g.bog_error_red;
            editText.setTextColor(C0767a.m2893c(context, i));
            textView2.setTextColor(C0767a.m2893c(this.itemView.getContext(), i));
        }

        /* renamed from: B */
        private final void m67081B(EditText editText, TextView textView, TextView textView2) {
            textView2.setVisibility(8);
            Context context = this.itemView.getContext();
            int i = C10318g.f28630R0;
            editText.setTextColor(C0767a.m2893c(context, i));
            textView.setTextColor(C0767a.m2893c(this.itemView.getContext(), i));
        }

        /* access modifiers changed from: private */
        /* renamed from: C */
        public final void m67082C(FlipImageViewContainer flipImageViewContainer) {
            flipImageViewContainer.setFlipListener((FlipImageViewContainer.FlipListener) null);
        }

        /* access modifiers changed from: private */
        /* renamed from: D */
        public final void m67083D(EditText editText, AddBudgetModel addBudgetModel, boolean z, FlipImageViewContainer flipImageViewContainer, SwipeLayout swipeLayout) {
            editText.setOnFocusChangeListener(new C20720s(editText));
            editText.addTextChangedListener(new C20713c(addBudgetModel, editText, z, this.f55871f, this));
            flipImageViewContainer.setFlipListener(new C20721t(this.f55871f, addBudgetModel));
            swipeLayout.setOnClickListener(new C20722u(this.f55871f, flipImageViewContainer));
        }

        /* access modifiers changed from: private */
        /* renamed from: E */
        public static final void m67084E(EditText editText, View view, boolean z) {
            boolean z2;
            C41536l.m120489i(editText, "$etBudget");
            if (z) {
                Editable text = editText.getText();
                C41536l.m120488h(text, "etBudget.text");
                if (text.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && new BigDecimal(editText.getText().toString()).compareTo(BigDecimal.ZERO) == 0) {
                    editText.setText("");
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: F */
        public static final void m67085F(C20708o oVar, AddBudgetModel addBudgetModel, boolean z) {
            C41536l.m120489i(oVar, "this$0");
            C41536l.m120489i(addBudgetModel, "$budget");
            if (oVar.mo49236S()) {
                addBudgetModel.mo54900r(z);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: G */
        public static final void m67086G(C20708o oVar, FlipImageViewContainer flipImageViewContainer, View view) {
            C41536l.m120489i(oVar, "this$0");
            C41536l.m120489i(flipImageViewContainer, "$flippingIcon");
            if (oVar.mo49236S()) {
                flipImageViewContainer.flipImage();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: H */
        public final void m67087H(SwipeLayout swipeLayout) {
            if (!C36546y.m108285N().mo89316O().getIsBudgetingTipShown()) {
                C36546y.m108285N().mo89316O().setIsBudgetingTipShown();
                swipeLayout.mo7586B(1, true);
                swipeLayout.postDelayed(new C20719r(swipeLayout), 1000);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: I */
        public static final void m67088I(SwipeLayout swipeLayout) {
            C41536l.m120489i(swipeLayout, "$view");
            swipeLayout.mo7586B(2, true);
        }

        /* access modifiers changed from: private */
        /* renamed from: J */
        public final void m67089J(CharSequence charSequence, EditText editText) {
            boolean z;
            if (!C20708o.f55857p.mo94489f(charSequence)) {
                if (charSequence.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    editText.setText(charSequence.subSequence(0, charSequence.length() - 1).toString());
                    editText.setSelection(editText.getText().length());
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public final void m67103u(SwipeLayout swipeLayout, int i) {
            swipeLayout.setRightSwipeItem(new SwipeLayout.C2363g("DELETE_ID", this.itemView.getContext().getString(C10328q.template_swipe_menu_delete), Integer.valueOf(C10320i.ic_swipe_delete), Integer.valueOf(C0767a.m2893c(this.itemView.getContext(), C10318g.bog_error_red)), Integer.valueOf(C0767a.m2893c(this.itemView.getContext(), C10318g.f28616A)), (Integer) null, (Float) null));
            swipeLayout.setOnSwipeItemClickListener(new C20717p(swipeLayout, this.f55871f, this, i));
            swipeLayout.setOnSwipedListener(new C20718q(this.f55871f, swipeLayout));
        }

        /* access modifiers changed from: private */
        /* renamed from: v */
        public static final void m67104v(SwipeLayout swipeLayout, C20708o oVar, C20710b bVar, int i, boolean z, String str) {
            C41536l.m120489i(swipeLayout, "$swipeView");
            C41536l.m120489i(oVar, "this$0");
            C41536l.m120489i(bVar, "this$1");
            swipeLayout.mo7586B(2, true);
            if (C41536l.m120484d(str, "DELETE_ID")) {
                oVar.f55858f.mo49248c(oVar.mo69515m(bVar.getAdapterPosition()), i);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: w */
        public static final void m67105w(C20708o oVar, SwipeLayout swipeLayout, SwipeLayout swipeLayout2, boolean z) {
            C41536l.m120489i(oVar, "this$0");
            C41536l.m120489i(swipeLayout, "$swipeView");
            C41536l.m120489i(swipeLayout2, "<anonymous parameter 0>");
            SwipeLayout H = oVar.f55864l;
            if (H != null) {
                H.mo7586B(2, true);
            }
            oVar.f55864l = swipeLayout;
        }

        /* access modifiers changed from: private */
        /* renamed from: y */
        public final void m67106y(AddBudgetModel addBudgetModel, TextView textView, FlipImageViewContainer flipImageViewContainer, TextView textView2, ConstraintLayout constraintLayout, EditText editText, TextView textView3, View view, boolean z, int i) {
            FlipImageViewContainer flipImageViewContainer2 = flipImageViewContainer;
            TextView textView4 = textView2;
            EditText editText2 = editText;
            TextView textView5 = textView3;
            View view2 = view;
            textView.setText(addBudgetModel.mo54890g());
            boolean z2 = false;
            if (this.f55871f.mo49236S()) {
                flipImageViewContainer2.setFrontImageColouredResource(C10320i.ic_template_basket_unselected, 0);
            } else {
                flipImageViewContainer2.setFrontImageColouredResource(C27680a.f70771a.mo67216a(addBudgetModel.mo54887e()), addBudgetModel.mo54889f());
            }
            Drawable background = constraintLayout.getBackground();
            C41536l.m120487g(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            GradientDrawable gradientDrawable = (GradientDrawable) background;
            AddBudgetModel addBudgetModel2 = null;
            if (z) {
                gradientDrawable.setStroke(0, C0767a.m2893c(this.itemView.getContext(), C10318g.f28616A));
                AddBudgetModel addBudgetModel3 = this.f55869d;
                if (addBudgetModel3 == null) {
                    C41536l.m120506z("data");
                } else {
                    addBudgetModel2 = addBudgetModel3;
                }
                if (addBudgetModel2.mo54885d().isEmpty()) {
                    view2.setVisibility(8);
                } else {
                    view2.setVisibility(0);
                }
            } else {
                if (addBudgetModel.mo54896l()) {
                    gradientDrawable.setStroke(C32343x.m95394I(1), C0767a.m2893c(this.itemView.getContext(), C10318g.swipe_menu_item_3));
                } else {
                    gradientDrawable.setStroke(C32343x.m95394I(1), addBudgetModel.mo54889f());
                }
                AddBudgetModel addBudgetModel4 = this.f55869d;
                if (addBudgetModel4 == null) {
                    C41536l.m120506z("data");
                } else {
                    addBudgetModel2 = addBudgetModel4;
                }
                if (i == addBudgetModel2.mo54885d().size() - 1) {
                    view2.setVisibility(8);
                } else {
                    view2.setVisibility(0);
                }
            }
            editText2.setText(C32359z0.m95548S(addBudgetModel.mo54895k()));
            if (addBudgetModel.mo54891h() != null) {
                String h = addBudgetModel.mo54891h();
                C41536l.m120486f(h);
                m67080A(textView4, editText2, textView5, h);
            } else {
                m67081B(editText2, textView5, textView4);
            }
            if (addBudgetModel.mo54898p() && this.f55871f.mo49236S()) {
                z2 = true;
            }
            flipImageViewContainer2.setFlipped(z2);
        }

        /* renamed from: z */
        static /* synthetic */ void m67107z(C20710b bVar, AddBudgetModel addBudgetModel, TextView textView, FlipImageViewContainer flipImageViewContainer, TextView textView2, ConstraintLayout constraintLayout, EditText editText, TextView textView3, View view, boolean z, int i, int i2, Object obj) {
            bVar.m67106y(addBudgetModel, textView, flipImageViewContainer, textView2, constraintLayout, editText, textView3, view, z, (i2 & C11398b.f33140s) != 0 ? 0 : i);
        }

        /* renamed from: x */
        public final void mo49239x(AddBudgetModel addBudgetModel) {
            C41536l.m120489i(addBudgetModel, "data");
            this.f55869d = addBudgetModel;
            ExpandableItemView.m69446y(this.f55870e, addBudgetModel.mo54885d().size(), false, 2, (Object) null);
        }
    }

    /* renamed from: g40.o$c */
    public static final class C20714c {
        private C20714c() {
        }

        public /* synthetic */ C20714c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g40.o$d */
    public final class C20715d extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private TextView f55881d;

        /* renamed from: e */
        private ImageView f55882e;

        /* renamed from: f */
        final /* synthetic */ C20708o f55883f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20715d(C20708o oVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f55883f = oVar;
            View findViewById = view.findViewById(C10322k.tvInfo);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.tvInfo)");
            this.f55881d = (TextView) findViewById;
            View findViewById2 = view.findViewById(C10322k.deleteAllBudgetsIV);
            C41536l.m120488h(findViewById2, "itemView.findViewById(R.id.deleteAllBudgetsIV)");
            this.f55882e = (ImageView) findViewById2;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m67112j(C20708o oVar, View view) {
            C41536l.m120489i(oVar, "this$0");
            if (!oVar.mo49236S()) {
                oVar.mo49237T(true);
                for (AddBudgetModel addBudgetModel : oVar.f55860h) {
                    addBudgetModel.mo54900r(false);
                    for (AddBudgetModel r : addBudgetModel.mo54885d()) {
                        r.mo54900r(false);
                    }
                }
                oVar.f55858f.mo49246a();
                oVar.mo69516r(1);
                oVar.mo69516r(0);
            }
        }

        /* renamed from: i */
        public final void mo49245i(String str) {
            int i;
            C41536l.m120489i(str, "info");
            this.f55881d.setText(str);
            ImageView imageView = this.f55882e;
            if (this.f55883f.mo49236S()) {
                i = 4;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
            this.f55882e.setOnClickListener(new C20723v(this.f55883f));
        }
    }

    /* renamed from: g40.o$e */
    public interface C20716e {
        /* renamed from: a */
        void mo49246a();

        /* renamed from: b */
        void mo49247b(ArrayList arrayList);

        /* renamed from: c */
        void mo49248c(int i, int i2);
    }

    public C20708o(C20716e eVar, boolean z) {
        C41536l.m120489i(eVar, "onItemActionListener");
        this.f55858f = eVar;
        this.f55859g = z;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        C41536l.m120488h(bigDecimal, "ZERO");
        this.f55862j = bigDecimal;
        this.f55863k = new HashMap();
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public static final void m67068O(C20708o oVar) {
        C41536l.m120489i(oVar, "this$0");
        oVar.mo69516r(2);
    }

    /* renamed from: Q */
    private final void m67069Q() {
        for (AddBudgetModel addBudgetModel : this.f55860h) {
            addBudgetModel.mo54900r(false);
            for (AddBudgetModel r : addBudgetModel.mo54885d()) {
                r.mo54900r(false);
            }
        }
    }

    /* renamed from: L */
    public final void mo49231L(ArrayList arrayList) {
        C41536l.m120489i(arrayList, "data");
        this.f55860h.clear();
        this.f55860h.addAll(arrayList);
        C29615f.m89897A(this, 1, arrayList.size(), false, 4, (Object) null);
    }

    /* renamed from: M */
    public final void mo49232M(ArrayList arrayList, String str) {
        C41536l.m120489i(arrayList, "data");
        C41536l.m120489i(str, "header");
        this.f55861i = str;
        C29615f.m89897A(this, 0, 1, false, 4, (Object) null);
        mo49231L(arrayList);
    }

    /* renamed from: N */
    public final void mo49233N(BigDecimal bigDecimal) {
        C41536l.m120489i(bigDecimal, "sum");
        this.f55862j = bigDecimal;
        RecyclerView recyclerView = this.f55865m;
        if (recyclerView != null) {
            recyclerView.post(new C20707n(this));
        }
    }

    /* renamed from: P */
    public final void mo49234P() {
        this.f55866n = false;
        m67069Q();
        mo69516r(0);
        mo69516r(1);
    }

    /* renamed from: R */
    public final ArrayList mo49235R() {
        return this.f55860h;
    }

    /* renamed from: S */
    public final boolean mo49236S() {
        return this.f55866n;
    }

    /* renamed from: T */
    public final void mo49237T(boolean z) {
        this.f55866n = z;
    }

    /* renamed from: l */
    public List mo48134l() {
        return C41341q.m119910m(new C29615f.C29617b(0, 1), new C29615f.C29617b(2, this.f55859g ^ true ? 1 : 0), new C29615f.C29617b(1, 0, 2, (DefaultConstructorMarker) null));
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C41536l.m120489i(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f55865m = recyclerView;
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.budgeting_info_recycler_item, viewGroup, false);
            C41536l.m120488h(inflate, "from(parent.context)\n   …cler_item, parent, false)");
            return new C20715d(this, inflate);
        } else if (i != 2) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.budgeting_edit_expandable_item, viewGroup, false);
            C41536l.m120488h(inflate2, "from(parent.context)\n   …able_item, parent, false)");
            return new C20710b(this, inflate2);
        } else {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.budget_sum_recycler_item, viewGroup, false);
            C41536l.m120488h(inflate3, "from(parent.context)\n   …cler_item, parent, false)");
            return new C20709a(this, inflate3);
        }
    }

    /* renamed from: p */
    public void mo48135p(RecyclerView.C1734f0 f0Var, int i, int i2) {
        C41536l.m120489i(f0Var, "holder");
        if (f0Var instanceof C20715d) {
            ((C20715d) f0Var).mo49245i(this.f55861i);
        } else if (f0Var instanceof C20710b) {
            Object obj = this.f55860h.get(i2);
            C41536l.m120488h(obj, "data[positionInSection]");
            ((C20710b) f0Var).mo49239x((AddBudgetModel) obj);
        } else if (f0Var instanceof C20709a) {
            ((C20709a) f0Var).mo49238h(this.f55862j);
        }
    }
}

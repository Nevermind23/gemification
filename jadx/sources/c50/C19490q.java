package c50;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import com.alexandrius.accordionswipelayout.library.SwipeLayout;
import com.github.mikephil.charting.utils.Utils;
import g91.C32343x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import l81.C37106c;
import l81.C37107d;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.viewmodel.TransactionCategoriesViewModel;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;
import p366bk.C10316e;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p642vh.C18368l;
import q40.C27680a;

/* renamed from: c50.q */
public final class C19490q extends C37106c {

    /* renamed from: d */
    private final boolean f53765d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Boolean f53766e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final TransactionCategoriesViewModel f53767f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final ArrayList f53768g = new ArrayList();

    /* renamed from: h */
    private final ArrayList f53769h = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f53770i = -1;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public RecyclerView f53771j;

    /* renamed from: k */
    public View f53772k;

    /* renamed from: l */
    private int f53773l = -1;

    /* renamed from: m */
    private final HashSet f53774m = new HashSet();

    /* renamed from: c50.q$a */
    public final class C19491a extends C37107d {

        /* renamed from: f */
        private final ViewGroup f53775f;

        /* renamed from: g */
        private final BogImageView f53776g;

        /* renamed from: h */
        private final View f53777h;

        /* renamed from: i */
        private final TwoLineReverseTextItem f53778i;

        /* renamed from: j */
        private final ViewGroup f53779j;

        /* renamed from: k */
        private final View f53780k;

        /* renamed from: l */
        private final CheckboxView f53781l;

        /* renamed from: m */
        private final View f53782m;

        /* renamed from: n */
        private final View.OnClickListener f53783n;

        /* renamed from: o */
        final /* synthetic */ C19490q f53784o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19491a(C19490q qVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f53784o = qVar;
            View findViewById = view.findViewById(C10322k.item_wrapper);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.item_wrapper)");
            ViewGroup viewGroup = (ViewGroup) findViewById;
            this.f53775f = viewGroup;
            View findViewById2 = view.findViewById(C10322k.category_logo);
            C41536l.m120488h(findViewById2, "itemView.findViewById(R.id.category_logo)");
            this.f53776g = (BogImageView) findViewById2;
            View findViewById3 = view.findViewById(C10322k.f28755J1);
            C41536l.m120488h(findViewById3, "itemView.findViewById(R.id.arrow_image)");
            this.f53777h = findViewById3;
            View findViewById4 = view.findViewById(C10322k.name_two_line);
            C41536l.m120488h(findViewById4, "itemView.findViewById(R.id.name_two_line)");
            this.f53778i = (TwoLineReverseTextItem) findViewById4;
            View findViewById5 = view.findViewById(C10322k.collapsing_layout);
            C41536l.m120488h(findViewById5, "itemView.findViewById(R.id.collapsing_layout)");
            this.f53779j = (ViewGroup) findViewById5;
            View findViewById6 = view.findViewById(C10322k.f28711Bp);
            C41536l.m120488h(findViewById6, "itemView.findViewById(R.id.place_holder)");
            this.f53780k = findViewById6;
            View findViewById7 = view.findViewById(C10322k.category_check_box);
            C41536l.m120488h(findViewById7, "itemView.findViewById(R.id.category_check_box)");
            this.f53781l = (CheckboxView) findViewById7;
            View findViewById8 = view.findViewById(C10322k.edit_icon);
            C41536l.m120488h(findViewById8, "itemView.findViewById(R.id.edit_icon)");
            this.f53782m = findViewById8;
            C19483j jVar = new C19483j(qVar, this);
            this.f53783n = jVar;
            viewGroup.setOnClickListener(jVar);
        }

        /* renamed from: A */
        private final void m65040A(View view, TransactionCategoryModel transactionCategoryModel) {
            ((CheckboxView) view.findViewById(C10322k.category_check_box)).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            view.findViewById(C10322k.f28711Bp).setVisibility(0);
            BogImageView bogImageView = (BogImageView) view.findViewById(C10322k.category_logo);
            bogImageView.setImageResource(C27680a.f70771a.mo67216a(transactionCategoryModel.mo55075a()));
            Drawable mutate = bogImageView.getBackground().mutate();
            C41536l.m120487g(mutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            bogImageView.setColorFilter(-1);
            ((GradientDrawable) mutate).setColor(transactionCategoryModel.mo55081f());
            view.findViewById(C10322k.f28755J1).setVisibility(8);
            ((TwoLineReverseTextItem) view.findViewById(C10322k.name_two_line)).setText(transactionCategoryModel.mo55082g());
        }

        /* renamed from: B */
        private final void m65041B(View view, TransactionCategoryModel transactionCategoryModel) {
            SwipeLayout swipeLayout = (SwipeLayout) view.findViewById(C10322k.swipe_layout);
            Context context = this.f89287d.getContext();
            C41536l.m120488h(context, "itemView.context");
            swipeLayout.setRightSwipeItems(m65059u(context));
            swipeLayout.setOnItemClickListener(new C19486m(swipeLayout, this.f53784o, transactionCategoryModel));
        }

        /* access modifiers changed from: private */
        /* renamed from: C */
        public static final void m65042C(SwipeLayout swipeLayout, C19490q qVar, TransactionCategoryModel transactionCategoryModel, SwipeLayout swipeLayout2, boolean z, String str) {
            C41536l.m120489i(qVar, "this$0");
            C41536l.m120489i(transactionCategoryModel, "$subCategory");
            C41536l.m120489i(swipeLayout2, "<anonymous parameter 0>");
            C41536l.m120489i(str, "index");
            if (C41536l.m120484d(str, "EDIT_ID")) {
                swipeLayout.mo7586B(2, true);
                C41536l.m120488h(swipeLayout, "swipeLayout");
                qVar.mo47723D(swipeLayout);
                TransactionCategoriesViewModel q = qVar.f53767f;
                if (q != null) {
                    q.mo55092Bw(transactionCategoryModel);
                }
            } else if (C41536l.m120484d(str, "DELETE_ID")) {
                swipeLayout.mo7586B(2, true);
                TransactionCategoriesViewModel q2 = qVar.f53767f;
                if (q2 != null) {
                    q2.mo55107Yw(transactionCategoryModel);
                }
            }
        }

        /* renamed from: D */
        private final void m65043D(TransactionCategoryModel transactionCategoryModel) {
            C32343x.m95447f1(this.f53781l);
            this.f53778i.setTitle(m65058t(transactionCategoryModel));
            m65062x(transactionCategoryModel);
            this.f53781l.setOnCheckedChangeListener(new C19485l(this.f53784o, this));
        }

        /* access modifiers changed from: private */
        /* renamed from: E */
        public static final void m65044E(C19490q qVar, C19491a aVar, CompoundButton compoundButton, boolean z) {
            C41536l.m120489i(qVar, "this$0");
            C41536l.m120489i(aVar, "this$1");
            long a = ((TransactionCategoryModel) qVar.f53768g.get(aVar.getBindingAdapterPosition())).mo55075a();
            List<TransactionCategoryModel> e = ((TransactionCategoryModel) qVar.f53768g.get(aVar.getBindingAdapterPosition())).mo55079e();
            if (z) {
                qVar.mo47727u().add(Long.valueOf(a));
                if (e != null) {
                    HashSet u = qVar.mo47727u();
                    ArrayList arrayList = new ArrayList(C41343r.m119925u(e, 10));
                    for (TransactionCategoryModel a2 : e) {
                        arrayList.add(Long.valueOf(a2.mo55075a()));
                    }
                    u.addAll(arrayList);
                }
            } else {
                qVar.mo47727u().remove(Long.valueOf(a));
                if (e != null) {
                    HashSet u2 = qVar.mo47727u();
                    ArrayList arrayList2 = new ArrayList(C41343r.m119925u(e, 10));
                    for (TransactionCategoryModel a3 : e) {
                        arrayList2.add(Long.valueOf(a3.mo55075a()));
                    }
                    u2.removeAll(arrayList2);
                }
            }
            RecyclerView n = qVar.f53771j;
            if (n != null) {
                n.post(new C19489p(qVar));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: F */
        public static final void m65045F(C19490q qVar) {
            C41536l.m120489i(qVar, "this$0");
            qVar.notifyDataSetChanged();
        }

        /* renamed from: G */
        private final void m65046G(TransactionCategoryModel transactionCategoryModel) {
            TransactionCategoryModel o = this.f53784o.m65027v(transactionCategoryModel);
            C32343x.m95455i0(this.f53781l);
            if (o != null) {
                TwoLineReverseTextItem twoLineReverseTextItem = this.f53778i;
                String g = o.mo55082g();
                g.length();
                twoLineReverseTextItem.setTitle(g);
            }
        }

        /* renamed from: H */
        private final void m65047H() {
            if (getBindingAdapterPosition() == this.f53784o.f53770i) {
                this.f53784o.f53770i = -1;
                this.f53777h.animate().rotation(Utils.FLOAT_EPSILON);
                return;
            }
            Object obj = this.f53784o.f53768g.get(getBindingAdapterPosition());
            C41536l.m120488h(obj, "categories[bindingAdapterPosition]");
            m65057r((TransactionCategoryModel) obj);
            this.f53784o.f53770i = getBindingAdapterPosition();
            this.f53777h.animate().rotation(180.0f);
        }

        /* renamed from: p */
        private final void m65055p(TransactionCategoryModel transactionCategoryModel) {
            if (transactionCategoryModel.mo55079e() != null) {
                C19490q qVar = this.f53784o;
                View inflate = LayoutInflater.from(this.f89287d.getContext()).inflate(C10324m.transaction_category_add_item, (ViewGroup) null);
                this.f53779j.addView(inflate);
                inflate.setOnClickListener(new C19487n(qVar, inflate, transactionCategoryModel));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public static final void m65056q(C19490q qVar, View view, TransactionCategoryModel transactionCategoryModel, View view2) {
            C41536l.m120489i(qVar, "this$0");
            C41536l.m120489i(transactionCategoryModel, "$category");
            C41536l.m120488h(view, "addItemView");
            qVar.mo47723D(view);
            TransactionCategoriesViewModel q = qVar.f53767f;
            if (q != null) {
                q.mo55111vw(transactionCategoryModel);
            }
        }

        /* renamed from: r */
        private final void m65057r(TransactionCategoryModel transactionCategoryModel) {
            this.f53779j.removeAllViews();
            List<TransactionCategoryModel> e = transactionCategoryModel.mo55079e();
            if (e != null) {
                C19490q qVar = this.f53784o;
                for (TransactionCategoryModel transactionCategoryModel2 : e) {
                    View inflate = LayoutInflater.from(this.f89287d.getContext()).inflate(C10324m.transaction_category_swipable_item, (ViewGroup) null);
                    C41536l.m120488h(inflate, "childView");
                    m65040A(inflate, transactionCategoryModel2);
                    BogImageView bogImageView = (BogImageView) inflate.findViewById(C10322k.edit_icon);
                    C41536l.m120488h(bogImageView, "addChildCategories$lambda$3$lambda$2");
                    Boolean p = qVar.f53766e;
                    Boolean bool = Boolean.TRUE;
                    C32343x.m95483r1(bogImageView, C41536l.m120484d(p, bool), false, 2, (Object) null);
                    if (C41536l.m120484d(qVar.f53766e, bool)) {
                        m65041B(inflate, transactionCategoryModel2);
                    }
                    m65063y(inflate, transactionCategoryModel2);
                    this.f53779j.addView(inflate);
                }
            }
            if (C41536l.m120484d(this.f53784o.f53766e, Boolean.TRUE)) {
                m65055p(transactionCategoryModel);
            }
        }

        /* renamed from: t */
        private final String m65058t(TransactionCategoryModel transactionCategoryModel) {
            boolean z;
            StringBuilder sb = new StringBuilder();
            List<TransactionCategoryModel> e = transactionCategoryModel.mo55079e();
            if (e != null) {
                C19490q qVar = this.f53784o;
                for (TransactionCategoryModel transactionCategoryModel2 : e) {
                    if (qVar.mo47727u().contains(Long.valueOf(transactionCategoryModel2.mo55075a()))) {
                        sb.append(transactionCategoryModel2.mo55082g());
                        sb.append(", ");
                    }
                }
            }
            String sb2 = sb.toString();
            C41536l.m120488h(sb2, "selectedChildCategories.toString()");
            if (sb2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                sb.delete(sb.length() - 2, sb.length());
            }
            String sb3 = sb.toString();
            C41536l.m120488h(sb3, "selectedChildCategories.toString()");
            return sb3;
        }

        /* renamed from: u */
        private final ArrayList m65059u(Context context) {
            Context context2 = context;
            ArrayList arrayList = new ArrayList();
            SwipeLayout.C2363g gVar = new SwipeLayout.C2363g("EDIT_ID", context2.getString(C10328q.dd_sto_swipe_edit), Integer.valueOf(C10320i.ic_swipe_edit), Integer.valueOf(C0767a.m2893c(context2, C10318g.templates_item_swipe_dark_grey_background)), Integer.valueOf(C0767a.m2893c(context2, C10318g.templates_item_swipe_grey_text_color)), (Integer) null, (Float) null);
            SwipeLayout.C2363g gVar2 = new SwipeLayout.C2363g("DELETE_ID", context2.getString(C10328q.dd_sto_swipe_delete), Integer.valueOf(C10320i.ic_swipe_delete), Integer.valueOf(C0767a.m2893c(context2, C10318g.templates_item_swipe_red_background)), Integer.valueOf(C0767a.m2893c(context2, C10318g.templates_item_swipe_white_text_color)), (Integer) null, (Float) null);
            arrayList.add(gVar);
            arrayList.add(gVar2);
            return arrayList;
        }

        /* access modifiers changed from: private */
        /* renamed from: v */
        public static final void m65060v(C19490q qVar, C19491a aVar, View view) {
            boolean z;
            RecyclerView n;
            C41536l.m120489i(qVar, "this$0");
            C41536l.m120489i(aVar, "this$1");
            List e = ((TransactionCategoryModel) qVar.f53768g.get(aVar.getBindingAdapterPosition())).mo55079e();
            if (e == null || e.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                aVar.m65047H();
                qVar.notifyItemChanged(aVar.getBindingAdapterPosition());
                int m = qVar.f53770i;
                if (m != -1) {
                    qVar.notifyItemChanged(m);
                }
            }
            if (qVar.f53770i != -1 && (n = qVar.f53771j) != null) {
                n.postDelayed(new C19488o(qVar, aVar), 10);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: w */
        public static final void m65061w(C19490q qVar, C19491a aVar) {
            C41536l.m120489i(qVar, "this$0");
            C41536l.m120489i(aVar, "this$1");
            RecyclerView n = qVar.f53771j;
            if (n != null) {
                n.mo5425x1(aVar.getBindingAdapterPosition());
            }
        }

        /* renamed from: x */
        private final void m65062x(TransactionCategoryModel transactionCategoryModel) {
            boolean z;
            boolean z2;
            boolean z3;
            List<TransactionCategoryModel> e = transactionCategoryModel.mo55079e();
            if (e == null || e.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C19490q qVar = this.f53784o;
                z3 = false;
                z2 = false;
                for (TransactionCategoryModel a : e) {
                    if (qVar.mo47727u().contains(Long.valueOf(a.mo55075a()))) {
                        z3 = true;
                    } else {
                        z2 = true;
                    }
                }
            } else if (this.f53784o.mo47727u().contains(Long.valueOf(transactionCategoryModel.mo55075a()))) {
                z3 = true;
                z2 = false;
            } else {
                z3 = false;
                z2 = false;
            }
            if (z3 && !z2) {
                this.f53781l.setHalfChecked(false);
                this.f53781l.setChecked(true);
            } else if (!z3 || !z2) {
                this.f53781l.setChecked(false);
                this.f53781l.setHalfChecked(false);
            } else {
                this.f53781l.setChecked(false);
                this.f53781l.setHalfChecked(true);
            }
        }

        /* renamed from: y */
        private final void m65063y(View view, TransactionCategoryModel transactionCategoryModel) {
            View findViewById = view.findViewById(C10322k.category_check_box);
            C19490q qVar = this.f53784o;
            CheckboxView checkboxView = (CheckboxView) findViewById;
            checkboxView.setChecked(qVar.mo47727u().contains(Long.valueOf(transactionCategoryModel.mo55075a())));
            checkboxView.setOnCheckedChangeListener(new C19484k(transactionCategoryModel, qVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: z */
        public static final void m65064z(TransactionCategoryModel transactionCategoryModel, C19490q qVar, CompoundButton compoundButton, boolean z) {
            C41536l.m120489i(transactionCategoryModel, "$subCategory");
            C41536l.m120489i(qVar, "this$0");
            long a = transactionCategoryModel.mo55075a();
            if (z) {
                if (C41536l.m120484d(qVar.f53766e, Boolean.TRUE)) {
                    qVar.mo47727u().clear();
                }
                qVar.mo47727u().add(Long.valueOf(a));
                TransactionCategoriesViewModel q = qVar.f53767f;
                if (q != null) {
                    q.mo55109gx(transactionCategoryModel.mo55075a());
                }
            } else {
                qVar.mo47727u().remove(Long.valueOf(a));
                TransactionCategoriesViewModel q2 = qVar.f53767f;
                if (q2 != null) {
                    q2.mo55109gx(-1);
                }
            }
            qVar.notifyDataSetChanged();
        }

        /* renamed from: s */
        public final void mo47730s(TransactionCategoryModel transactionCategoryModel, int i) {
            int i2;
            boolean z;
            C41536l.m120489i(transactionCategoryModel, "category");
            this.f53781l.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            C32343x.m95455i0(this.f53782m);
            this.f53776g.setImageResource(C27680a.f70771a.mo67216a(transactionCategoryModel.mo55075a()));
            this.f53780k.setVisibility(8);
            this.f53778i.setText(transactionCategoryModel.mo55082g());
            this.f53778i.setTitle((CharSequence) null);
            TwoLineReverseTextItem twoLineReverseTextItem = this.f53778i;
            Boolean p = this.f53784o.f53766e;
            Boolean bool = Boolean.TRUE;
            if (C41536l.m120484d(p, bool)) {
                Context context = this.f89287d.getContext();
                C41536l.m120488h(context, "itemView.context");
                i2 = C18368l.m62755d(context, C10316e.f28613r);
            } else {
                i2 = C0767a.m2893c(this.f89287d.getContext(), C10318g.f28628O0);
            }
            twoLineReverseTextItem.setTitleColorInt(i2);
            if (C41536l.m120484d(this.f53784o.f53766e, bool)) {
                m65046G(transactionCategoryModel);
            } else {
                m65043D(transactionCategoryModel);
            }
            List e = transactionCategoryModel.mo55079e();
            if (e == null || e.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f53777h.setVisibility(0);
            } else {
                this.f53777h.setVisibility(8);
            }
            Drawable mutate = this.f53776g.getBackground().mutate();
            C41536l.m120487g(mutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            this.f53776g.setColorFilter(-1);
            ((GradientDrawable) mutate).setColor(transactionCategoryModel.mo55081f());
            if (this.f53784o.f53770i == i) {
                this.f53779j.setVisibility(0);
                this.f53777h.setRotation(180.0f);
                m65057r(transactionCategoryModel);
                return;
            }
            this.f53779j.setVisibility(8);
            this.f53777h.setRotation(Utils.FLOAT_EPSILON);
        }
    }

    public C19490q(boolean z, Boolean bool, TransactionCategoriesViewModel transactionCategoriesViewModel) {
        this.f53765d = z;
        this.f53766e = bool;
        this.f53767f = transactionCategoriesViewModel;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel m65027v(p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel r8) {
        /*
            r7 = this;
            java.util.List r8 = r8.mo55079e()
            r0 = 0
            if (r8 == 0) goto L_0x002f
            java.util.Iterator r8 = r8.iterator()
        L_0x000b:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x002d
            java.lang.Object r1 = r8.next()
            r2 = r1
            ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel r2 = (p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel) r2
            ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.viewmodel.TransactionCategoriesViewModel r3 = r7.f53767f
            r4 = 0
            if (r3 == 0) goto L_0x002a
            long r5 = r2.mo55075a()
            long r2 = r3.mo55097Kw()
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x002a
            r4 = 1
        L_0x002a:
            if (r4 == 0) goto L_0x000b
            r0 = r1
        L_0x002d:
            ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel r0 = (p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel) r0
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c50.C19490q.m65027v(ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel):ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel");
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static final void m65028x(C19490q qVar, Handler handler) {
        RecyclerView.C1747p layoutManager;
        C41536l.m120489i(qVar, "this$0");
        C41536l.m120489i(handler, "$handler");
        RecyclerView recyclerView = qVar.f53771j;
        if (!(recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null)) {
            layoutManager.mo5197J1(qVar.f53773l);
        }
        handler.postDelayed(new C19482i(qVar), 10);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static final void m65029y(C19490q qVar) {
        RecyclerView.C1747p layoutManager;
        View O;
        View findViewById;
        C41536l.m120489i(qVar, "this$0");
        RecyclerView recyclerView = qVar.f53771j;
        if (!(recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (O = layoutManager.mo5199O(qVar.f53773l)) == null || (findViewById = O.findViewById(C10322k.item_wrapper)) == null)) {
            findViewById.performClick();
        }
        qVar.f53773l = -1;
    }

    /* renamed from: A */
    public C19491a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.transaction_category_swipable_item, viewGroup, false);
        C41536l.m120488h(inflate, "v");
        return new C19491a(this, inflate);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0032 A[EDGE_INSN: B:31:0x0032->B:13:0x0032 ?: BREAK  , SYNTHETIC] */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47721B(p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel r10) {
        /*
            r9 = this;
            java.util.ArrayList r0 = r9.f53768g
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0031
            java.lang.Object r1 = r0.next()
            r5 = r1
            ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel r5 = (p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel) r5
            if (r10 == 0) goto L_0x002d
            long r5 = r5.mo55075a()
            java.lang.Long r7 = r10.mo55083h()
            if (r7 != 0) goto L_0x0023
            goto L_0x002d
        L_0x0023:
            long r7 = r7.longValue()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x002d
            r5 = r3
            goto L_0x002e
        L_0x002d:
            r5 = r4
        L_0x002e:
            if (r5 == 0) goto L_0x0006
            goto L_0x0032
        L_0x0031:
            r1 = r2
        L_0x0032:
            ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel r1 = (p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel) r1
            if (r1 == 0) goto L_0x0072
            java.util.List r0 = r1.mo55079e()
            if (r0 == 0) goto L_0x0042
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0043
        L_0x0042:
            r4 = r3
        L_0x0043:
            if (r4 != 0) goto L_0x0072
            java.util.List r0 = r1.mo55079e()
            if (r0 == 0) goto L_0x006c
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0054:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x006c
            java.lang.Object r4 = r0.next()
            r5 = r4
            ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel r5 = (p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel) r5
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r5, r10)
            r5 = r5 ^ r3
            if (r5 == 0) goto L_0x0054
            r2.add(r4)
            goto L_0x0054
        L_0x006c:
            r1.mo55085i(r2)
            r9.notifyDataSetChanged()
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c50.C19490q.mo47721B(ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b A[LOOP:1: B:12:0x0047->B:33:0x009b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009f A[EDGE_INSN: B:53:0x009f->B:35:0x009f ?: BREAK  , SYNTHETIC] */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47722C(java.util.List r13) {
        /*
            r12 = this;
            if (r13 == 0) goto L_0x00ce
            java.util.ArrayList r0 = r12.f53768g
            r0.clear()
            java.util.ArrayList r0 = r12.f53768g
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r13.iterator()
        L_0x0012:
            boolean r3 = r2.hasNext()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0031
            java.lang.Object r3 = r2.next()
            r6 = r3
            ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel r6 = (p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel) r6
            boolean r6 = r6.mo55077d()
            boolean r7 = r12.f53765d
            if (r6 != r7) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r4 = r5
        L_0x002b:
            if (r4 == 0) goto L_0x0012
            r1.add(r3)
            goto L_0x0012
        L_0x0031:
            r0.addAll(r1)
            java.util.ArrayList r0 = r12.f53769h
            java.util.ArrayList r1 = r12.f53768g
            r0.addAll(r1)
            r12.notifyDataSetChanged()
            ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.viewmodel.TransactionCategoriesViewModel r0 = r12.f53767f
            if (r0 == 0) goto L_0x00ce
            java.util.Iterator r0 = r13.iterator()
            r1 = r5
        L_0x0047:
            boolean r2 = r0.hasNext()
            r3 = -1
            if (r2 == 0) goto L_0x009e
            java.lang.Object r2 = r0.next()
            ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel r2 = (p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel) r2
            java.util.List r2 = r2.mo55079e()
            if (r2 == 0) goto L_0x0096
            java.util.Iterator r2 = r2.iterator()
            r6 = r5
        L_0x005f:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0091
            java.lang.Object r7 = r2.next()
            ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel r7 = (p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel) r7
            long r8 = r7.mo55075a()
            ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.viewmodel.TransactionCategoriesViewModel r10 = r12.f53767f
            long r10 = r10.mo55100Nw()
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x007b
            r8 = r4
            goto L_0x007c
        L_0x007b:
            r8 = r5
        L_0x007c:
            if (r8 == 0) goto L_0x008b
            java.util.HashSet r9 = r12.f53774m
            long r10 = r7.mo55075a()
            java.lang.Long r7 = java.lang.Long.valueOf(r10)
            r9.add(r7)
        L_0x008b:
            if (r8 == 0) goto L_0x008e
            goto L_0x0092
        L_0x008e:
            int r6 = r6 + 1
            goto L_0x005f
        L_0x0091:
            r6 = r3
        L_0x0092:
            if (r6 != r3) goto L_0x0096
            r2 = r4
            goto L_0x0097
        L_0x0096:
            r2 = r5
        L_0x0097:
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x009b
            goto L_0x009f
        L_0x009b:
            int r1 = r1 + 1
            goto L_0x0047
        L_0x009e:
            r1 = r3
        L_0x009f:
            r12.f53773l = r1
            if (r1 != r3) goto L_0x00ce
            java.util.Iterator r13 = r13.iterator()
            r0 = r5
        L_0x00a8:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x00cc
            java.lang.Object r1 = r13.next()
            ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel r1 = (p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel) r1
            long r1 = r1.mo55075a()
            ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.viewmodel.TransactionCategoriesViewModel r6 = r12.f53767f
            long r6 = r6.mo55100Nw()
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x00c4
            r1 = r4
            goto L_0x00c5
        L_0x00c4:
            r1 = r5
        L_0x00c5:
            if (r1 == 0) goto L_0x00c9
            r3 = r0
            goto L_0x00cc
        L_0x00c9:
            int r0 = r0 + 1
            goto L_0x00a8
        L_0x00cc:
            r12.f53773l = r3
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c50.C19490q.mo47722C(java.util.List):void");
    }

    /* renamed from: D */
    public final void mo47723D(View view) {
        C41536l.m120489i(view, "<set-?>");
        this.f53772k = view;
    }

    /* renamed from: E */
    public final void mo47724E(TransactionCategoryModel transactionCategoryModel) {
        C41536l.m120489i(transactionCategoryModel, "updatedCategory");
        int size = this.f53768g.size();
        for (int i = 0; i < size; i++) {
            long a = ((TransactionCategoryModel) this.f53768g.get(i)).mo55075a();
            Long h = transactionCategoryModel.mo55083h();
            if (h != null && a == h.longValue()) {
                List e = ((TransactionCategoryModel) this.f53768g.get(i)).mo55079e();
                C41536l.m120486f(e);
                int size2 = e.size();
                if (size2 >= 0) {
                    int i2 = 0;
                    while (true) {
                        List e2 = ((TransactionCategoryModel) this.f53768g.get(i)).mo55079e();
                        C41536l.m120486f(e2);
                        if (((TransactionCategoryModel) e2.get(i2)).mo55075a() != transactionCategoryModel.mo55075a()) {
                            if (i2 == size2) {
                                break;
                            }
                            i2++;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            List e3 = ((TransactionCategoryModel) this.f53768g.get(i)).mo55079e();
                            C41536l.m120486f(e3);
                            arrayList.addAll(e3);
                            arrayList.set(i2, transactionCategoryModel);
                            ((TransactionCategoryModel) this.f53768g.get(i)).mo55085i(C41358y.m120036z0(arrayList));
                            break;
                        }
                    }
                }
            }
        }
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f53768g.size();
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C41536l.m120489i(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f53771j = recyclerView;
        if (this.f53773l != -1) {
            Handler handler = new Handler();
            handler.post(new C19481h(this, handler));
        }
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C41536l.m120489i(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f53771j = null;
    }

    /* renamed from: s */
    public final void mo47725s(TransactionCategoryModel transactionCategoryModel) {
        boolean z;
        Object obj;
        boolean z2;
        C41536l.m120489i(transactionCategoryModel, "category");
        Iterator it = this.f53768g.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            long a = ((TransactionCategoryModel) obj).mo55075a();
            Long h = transactionCategoryModel.mo55083h();
            if (h != null && a == h.longValue()) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        TransactionCategoryModel transactionCategoryModel2 = (TransactionCategoryModel) obj;
        if (transactionCategoryModel2 != null) {
            List e = transactionCategoryModel2.mo55079e();
            if (e != null && !e.isEmpty()) {
                z = false;
            }
            if (!z) {
                List e2 = transactionCategoryModel2.mo55079e();
                C41536l.m120486f(e2);
                transactionCategoryModel2.mo55085i(C41358y.m120024n0(e2, transactionCategoryModel));
                notifyDataSetChanged();
            }
        }
    }

    /* renamed from: t */
    public final void mo47726t(String str) {
        C41536l.m120489i(str, "text");
        this.f53768g.clear();
        ArrayList arrayList = this.f53768g;
        ArrayList arrayList2 = this.f53769h;
        ArrayList arrayList3 = new ArrayList();
        for (Object next : arrayList2) {
            if (C40440x.m117139M(((TransactionCategoryModel) next).mo55082g(), str, false, 2, (Object) null)) {
                arrayList3.add(next);
            }
        }
        arrayList.addAll(arrayList3);
        notifyDataSetChanged();
    }

    /* renamed from: u */
    public final HashSet mo47727u() {
        return this.f53774m;
    }

    /* renamed from: w */
    public final View mo47728w() {
        View view = this.f53772k;
        if (view != null) {
            return view;
        }
        C41536l.m120506z("viewForWizard");
        return null;
    }

    /* renamed from: z */
    public void onBindViewHolder(C19491a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        super.mo65512i(aVar, i);
        Object obj = this.f53768g.get(i);
        C41536l.m120488h(obj, "categories[position]");
        aVar.mo47730s((TransactionCategoryModel) obj, i);
    }
}

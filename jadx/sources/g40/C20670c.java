package g40;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.res.C0808h;
import androidx.recyclerview.widget.RecyclerView;
import he1.C41238w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.model.AddBudgetModel;
import p366bk.C10318g;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import q40.C27680a;
import r90.C27950a;
import ue1.C43075l;
import ue1.C43079p;
import x00.C29615f;

/* renamed from: g40.c */
public final class C20670c extends C29615f {

    /* renamed from: k */
    public static final C20675b f55773k = new C20675b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C20677d f55774f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public HashSet f55775g = new HashSet();

    /* renamed from: h */
    private List f55776h = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public RecyclerView f55777i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public HashSet f55778j = new HashSet();

    /* renamed from: g40.c$a */
    public final class C20671a extends RecyclerView.C1734f0 {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public ExpandableItemView f55779d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public ImageView f55780e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public AddBudgetModel f55781f;

        /* renamed from: g */
        final /* synthetic */ C20670c f55782g;

        /* renamed from: g40.c$a$a */
        static final class C20672a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C20671a f55783d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20672a(C20671a aVar) {
                super(1);
                this.f55783d = aVar;
            }

            /* renamed from: a */
            public final void mo49191a(View view) {
                C41536l.m120489i(view, "view");
                this.f55783d.f55780e = (ImageView) view.findViewById(C10322k.category_icon);
                CheckBox checkBox = (CheckBox) view.findViewById(C10322k.f28735G7);
                C20671a aVar = this.f55783d;
                AddBudgetModel k = aVar.f55781f;
                AddBudgetModel addBudgetModel = null;
                if (k == null) {
                    C41536l.m120506z("budget");
                    k = null;
                }
                ImageView m = this.f55783d.f55780e;
                C41536l.m120488h(checkBox, "cbSelector");
                aVar.m66975q(view, k, m, checkBox);
                C20671a aVar2 = this.f55783d;
                AddBudgetModel k2 = aVar2.f55781f;
                if (k2 == null) {
                    C41536l.m120506z("budget");
                } else {
                    addBudgetModel = k2;
                }
                aVar2.m66977s(addBudgetModel, checkBox, view, false);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo49191a((View) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: g40.c$a$b */
        static final class C20673b extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C20671a f55784d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20673b(C20671a aVar) {
                super(2);
                this.f55784d = aVar;
            }

            /* renamed from: a */
            public final void mo49192a(View view, int i) {
                C41536l.m120489i(view, "view");
                View findViewById = view.findViewById(C10322k.category_icon);
                C41536l.m120488h(findViewById, "view.findViewById(R.id.category_icon)");
                ImageView imageView = (ImageView) findViewById;
                View findViewById2 = view.findViewById(C10322k.f28735G7);
                C41536l.m120488h(findViewById2, "view.findViewById(R.id.checkbox)");
                CheckBox checkBox = (CheckBox) findViewById2;
                AddBudgetModel k = this.f55784d.f55781f;
                if (k == null) {
                    C41536l.m120506z("budget");
                    k = null;
                }
                AddBudgetModel addBudgetModel = (AddBudgetModel) k.mo54885d().get(i);
                this.f55784d.m66975q(view, addBudgetModel, imageView, checkBox);
                this.f55784d.m66977s(addBudgetModel, checkBox, view, true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo49192a((View) obj, ((Number) obj2).intValue());
                return C41238w.f97225a;
            }
        }

        /* renamed from: g40.c$a$c */
        static final class C20674c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C20671a f55785d;

            /* renamed from: e */
            final /* synthetic */ C20670c f55786e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20674c(C20671a aVar, C20670c cVar) {
                super(1);
                this.f55785d = aVar;
                this.f55786e = cVar;
            }

            /* renamed from: a */
            public final void mo49193a(boolean z) {
                CheckBox checkBox = (CheckBox) this.f55785d.f55779d.findViewById(C10322k.f28735G7);
                TextView textView = (TextView) this.f55785d.f55779d.findViewById(C10322k.generalCategoryTV);
                if (z) {
                    checkBox.setVisibility(0);
                    textView.setVisibility(0);
                    this.f55786e.f55775g.add(Integer.valueOf(this.f55786e.mo69515m(this.f55785d.getAdapterPosition())));
                    return;
                }
                checkBox.setVisibility(8);
                textView.setVisibility(8);
                this.f55786e.f55775g.remove(Integer.valueOf(this.f55786e.mo69515m(this.f55785d.getAdapterPosition())));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo49193a(((Boolean) obj).booleanValue());
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20671a(C20670c cVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f55782g = cVar;
            View findViewById = view.findViewById(C10322k.expandableItem);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.expandableItem)");
            ExpandableItemView expandableItemView = (ExpandableItemView) findViewById;
            this.f55779d = expandableItemView;
            expandableItemView.setScrollToTopWhenExpanded(true);
            this.f55779d.setScrollableParent(cVar.f55777i);
            this.f55779d.setOnBindHeader(new C20672a(this));
            this.f55779d.setOnBindItem(new C20673b(this));
            this.f55779d.setOnStateChanged(new C20674c(this, cVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public final void m66975q(View view, AddBudgetModel addBudgetModel, ImageView imageView, CheckBox checkBox) {
            Drawable drawable;
            Drawable background;
            View findViewById = view.findViewById(C10322k.category_name);
            C41536l.m120488h(findViewById, "view.findViewById(R.id.category_name)");
            View findViewById2 = view.findViewById(C10322k.category_color);
            C41536l.m120488h(findViewById2, "view.findViewById(R.id.category_color)");
            ((TextView) findViewById).setText(C27950a.m86287d(addBudgetModel.mo54890g(), false, 2, (Object) null));
            if (imageView != null) {
                imageView.setImageResource(C27680a.f70771a.mo67216a(addBudgetModel.mo54887e()));
            }
            if (imageView != null) {
                imageView.setColorFilter(addBudgetModel.mo54889f());
            }
            if (imageView == null || (background = imageView.getBackground()) == null) {
                drawable = null;
            } else {
                drawable = background.mutate();
            }
            C41536l.m120487g(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) drawable).setColor(C0808h.m3029d(this.itemView.getResources(), C10318g.f28625J0, (Resources.Theme) null));
            findViewById2.setBackgroundColor(addBudgetModel.mo54889f());
            C20670c cVar = this.f55782g;
            checkBox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            if (addBudgetModel.mo54896l()) {
                checkBox.setChecked(true);
                checkBox.setEnabled(false);
            } else if (cVar.f55778j.contains(Long.valueOf(addBudgetModel.mo54887e()))) {
                checkBox.setChecked(true);
                cVar.f55778j.add(Long.valueOf(addBudgetModel.mo54887e()));
            } else {
                checkBox.setChecked(false);
                checkBox.setEnabled(true);
            }
        }

        /* renamed from: r */
        private final void m66976r(boolean z, AddBudgetModel addBudgetModel) {
            boolean z2 = true;
            if (!z || addBudgetModel.mo54896l()) {
                addBudgetModel.mo54899q(false);
                this.f55782g.f55778j.remove(Long.valueOf(addBudgetModel.mo54887e()));
            } else {
                this.f55782g.f55778j.add(Long.valueOf(addBudgetModel.mo54887e()));
                addBudgetModel.mo54899q(true);
            }
            C20677d F = this.f55782g.f55774f;
            if (this.f55782g.f55778j.size() <= 0) {
                z2 = false;
            }
            F.mo49194a(z2);
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public final void m66977s(AddBudgetModel addBudgetModel, CheckBox checkBox, View view, boolean z) {
            if (z) {
                view.setOnClickListener(new C20668a(addBudgetModel, checkBox));
            }
            checkBox.setOnCheckedChangeListener(new C20669b(this, addBudgetModel));
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public static final void m66978t(AddBudgetModel addBudgetModel, CheckBox checkBox, View view) {
            C41536l.m120489i(addBudgetModel, "$budget");
            C41536l.m120489i(checkBox, "$cbSelector");
            if (!addBudgetModel.mo54896l()) {
                checkBox.setChecked(!checkBox.isChecked());
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public static final void m66979u(C20671a aVar, AddBudgetModel addBudgetModel, CompoundButton compoundButton, boolean z) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(addBudgetModel, "$budget");
            aVar.m66976r(z, addBudgetModel);
        }

        /* renamed from: p */
        public final void mo49190p(AddBudgetModel addBudgetModel) {
            C41536l.m120489i(addBudgetModel, "budget");
            this.f55781f = addBudgetModel;
            ExpandableItemView.m69446y(this.f55779d, addBudgetModel.mo54885d().size(), false, 2, (Object) null);
            CheckBox checkBox = (CheckBox) this.f55779d.findViewById(C10322k.f28735G7);
            TextView textView = (TextView) this.f55779d.findViewById(C10322k.generalCategoryTV);
            if (this.f55782g.f55775g.contains(Integer.valueOf(this.f55782g.mo69515m(getAdapterPosition())))) {
                checkBox.setVisibility(0);
                textView.setVisibility(0);
                this.f55779d.mo53635i(false);
                return;
            }
            checkBox.setVisibility(8);
            textView.setVisibility(8);
            this.f55779d.mo53625f(false);
        }
    }

    /* renamed from: g40.c$b */
    public static final class C20675b {
        private C20675b() {
        }

        public /* synthetic */ C20675b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g40.c$c */
    public final class C20676c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private TextView f55787d;

        /* renamed from: e */
        final /* synthetic */ C20670c f55788e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20676c(C20670c cVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f55788e = cVar;
            View findViewById = view.findViewById(C10322k.tvInfo);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.tvInfo)");
            TextView textView = (TextView) findViewById;
            this.f55787d = textView;
            textView.setText(textView.getContext().getString(C10328q.add_budget_header));
        }
    }

    /* renamed from: g40.c$d */
    public interface C20677d {
        /* renamed from: a */
        void mo49194a(boolean z);
    }

    public C20670c(C20677d dVar) {
        C41536l.m120489i(dVar, "itemSelectionListener");
        this.f55774f = dVar;
    }

    /* renamed from: I */
    public final void mo49188I(ArrayList arrayList) {
        C41536l.m120489i(arrayList, "data");
        C29615f.m89897A(this, 0, 1, false, 4, (Object) null);
        this.f55776h.clear();
        this.f55776h.addAll(arrayList);
        C29615f.m89897A(this, 1, arrayList.size(), false, 4, (Object) null);
        HashSet hashSet = this.f55778j;
        List<AddBudgetModel> list = this.f55776h;
        ArrayList arrayList2 = new ArrayList();
        for (AddBudgetModel d : list) {
            boolean unused = C41352v.m119965z(arrayList2, d.mo54885d());
        }
        ArrayList<AddBudgetModel> arrayList3 = new ArrayList<>();
        for (Object next : arrayList2) {
            if (((AddBudgetModel) next).mo54897m()) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList(C41343r.m119925u(arrayList3, 10));
        for (AddBudgetModel e : arrayList3) {
            arrayList4.add(Long.valueOf(e.mo54887e()));
        }
        hashSet.addAll(arrayList4);
    }

    /* renamed from: J */
    public final HashSet mo49189J() {
        return this.f55778j;
    }

    /* renamed from: l */
    public List mo48134l() {
        return C41341q.m119910m(new C29615f.C29617b(0, 0, 2, (DefaultConstructorMarker) null), new C29615f.C29617b(1, 0, 2, (DefaultConstructorMarker) null));
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C41536l.m120489i(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f55777i = recyclerView;
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.budget_addition_info_recycler_item, viewGroup, false);
            C41536l.m120488h(inflate, "from(parent.context).inf…cler_item, parent, false)");
            return new C20676c(this, inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.budgeting_add_reycler_item, viewGroup, false);
        C41536l.m120488h(inflate2, "from(parent.context).inf…cler_item, parent, false)");
        return new C20671a(this, inflate2);
    }

    /* renamed from: p */
    public void mo48135p(RecyclerView.C1734f0 f0Var, int i, int i2) {
        C41536l.m120489i(f0Var, "holder");
        if (!(f0Var instanceof C20676c) && (f0Var instanceof C20671a)) {
            ((C20671a) f0Var).mo49190p((AddBudgetModel) this.f55776h.get(i2));
        }
    }
}

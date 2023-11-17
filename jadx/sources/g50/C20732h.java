package g50;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import he1.C41238w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel;
import p366bk.C10322k;
import p366bk.C10324m;
import q40.C27680a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: g50.h */
public final class C20732h extends RecyclerView.C1736h {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public RecyclerView f55913d;

    /* renamed from: e */
    private C43075l f55914e;

    /* renamed from: f */
    private List f55915f = C41341q.m119907j();

    /* renamed from: g */
    private HashSet f55916g = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public HashSet f55917h = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ExpandableItemView f55918i;

    /* renamed from: g50.h$a */
    public final class C20733a extends RecyclerView.C1734f0 {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final ExpandableItemView f55919d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public TransactionCategoryModel f55920e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public List f55921f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public ImageView f55922g;

        /* renamed from: h */
        final /* synthetic */ C20732h f55923h;

        /* renamed from: g50.h$a$a */
        static final class C20734a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C20733a f55924d;

            /* renamed from: e */
            final /* synthetic */ C20732h f55925e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20734a(C20733a aVar, C20732h hVar) {
                super(1);
                this.f55924d = aVar;
                this.f55925e = hVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: d */
            public static final void m67148d(CheckBox checkBox, View view) {
                C41536l.m120489i(checkBox, "$checkBox");
                checkBox.setChecked(!checkBox.isChecked());
            }

            /* access modifiers changed from: private */
            /* renamed from: e */
            public static final void m67149e(C20732h hVar, C20733a aVar, CompoundButton compoundButton, boolean z) {
                C41536l.m120489i(hVar, "this$0");
                C41536l.m120489i(aVar, "this$1");
                List list = null;
                if (z) {
                    HashSet k = hVar.mo49268k();
                    List i = aVar.f55921f;
                    if (i == null) {
                        C41536l.m120506z("childrenOrCurrentCategoryIds");
                    } else {
                        list = i;
                    }
                    k.addAll(list);
                } else {
                    HashSet k2 = hVar.mo49268k();
                    List i2 = aVar.f55921f;
                    if (i2 == null) {
                        C41536l.m120506z("childrenOrCurrentCategoryIds");
                    } else {
                        list = i2;
                    }
                    k2.removeAll(list);
                }
                C43075l j = hVar.mo49267j();
                if (j != null) {
                    j.invoke(Integer.valueOf(hVar.mo49268k().size()));
                }
                aVar.f55919d.mo53637o();
                aVar.f55919d.mo48121n();
            }

            /* JADX WARNING: Removed duplicated region for block: B:37:0x013c  */
            /* JADX WARNING: Removed duplicated region for block: B:64:0x01ee  */
            /* renamed from: c */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo49275c(android.view.View r14) {
                /*
                    r13 = this;
                    java.lang.String r0 = "view"
                    kotlin.jvm.internal.C41536l.m120489i(r14, r0)
                    int r0 = p366bk.C10322k.category_name
                    android.view.View r0 = r14.findViewById(r0)
                    java.lang.String r1 = "view.findViewById(R.id.category_name)"
                    kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                    android.widget.TextView r0 = (android.widget.TextView) r0
                    int r1 = p366bk.C10322k.selected_child_categories
                    android.view.View r1 = r14.findViewById(r1)
                    java.lang.String r2 = "view.findViewById(R.id.selected_child_categories)"
                    kotlin.jvm.internal.C41536l.m120488h(r1, r2)
                    android.widget.TextView r1 = (android.widget.TextView) r1
                    int r2 = p366bk.C10322k.category_color
                    android.view.View r2 = r14.findViewById(r2)
                    java.lang.String r3 = "view.findViewById(R.id.category_color)"
                    kotlin.jvm.internal.C41536l.m120488h(r2, r3)
                    g50.h$a r3 = r13.f55924d
                    int r4 = p366bk.C10322k.category_icon
                    android.view.View r4 = r14.findViewById(r4)
                    android.widget.ImageView r4 = (android.widget.ImageView) r4
                    r3.f55922g = r4
                    int r3 = p366bk.C10322k.f28735G7
                    android.view.View r3 = r14.findViewById(r3)
                    java.lang.String r4 = "view.findViewById(R.id.checkbox)"
                    kotlin.jvm.internal.C41536l.m120488h(r3, r4)
                    android.widget.CheckBox r3 = (android.widget.CheckBox) r3
                    int r4 = p366bk.C10322k.arrowIV
                    android.view.View r4 = r14.findViewById(r4)
                    java.lang.String r5 = "view.findViewById(R.id.arrowIV)"
                    kotlin.jvm.internal.C41536l.m120488h(r4, r5)
                    android.widget.ImageView r4 = (android.widget.ImageView) r4
                    r5 = 0
                    r3.setOnCheckedChangeListener(r5)
                    g50.h$a r6 = r13.f55924d
                    ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel r6 = r6.f55920e
                    java.lang.String r7 = "category"
                    if (r6 != 0) goto L_0x0063
                    kotlin.jvm.internal.C41536l.m120506z(r7)
                    r6 = r5
                L_0x0063:
                    java.lang.String r6 = r6.mo55082g()
                    r0.setText(r6)
                    g50.h$a r0 = r13.f55924d
                    ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel r0 = r0.f55920e
                    if (r0 != 0) goto L_0x0076
                    kotlin.jvm.internal.C41536l.m120506z(r7)
                    r0 = r5
                L_0x0076:
                    int r0 = r0.mo55081f()
                    r2.setBackgroundColor(r0)
                    g50.h$a r0 = r13.f55924d
                    android.widget.ImageView r0 = r0.f55922g
                    kotlin.jvm.internal.C41536l.m120486f(r0)
                    q40.a r2 = q40.C27680a.f70771a
                    g50.h$a r6 = r13.f55924d
                    ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel r6 = r6.f55920e
                    if (r6 != 0) goto L_0x0094
                    kotlin.jvm.internal.C41536l.m120506z(r7)
                    r6 = r5
                L_0x0094:
                    long r8 = r6.mo55075a()
                    int r2 = r2.mo67216a(r8)
                    r0.setImageResource(r2)
                    g50.h$a r0 = r13.f55924d
                    android.widget.ImageView r2 = r0.f55922g
                    kotlin.jvm.internal.C41536l.m120486f(r2)
                    g50.h$a r6 = r13.f55924d
                    ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView r6 = r6.f55919d
                    boolean r6 = r6.mo53636m()
                    r0.m67144o(r2, r6)
                    g50.h$a r0 = r13.f55924d
                    java.util.List r0 = r0.f55921f
                    java.lang.String r2 = "childrenOrCurrentCategoryIds"
                    if (r0 != 0) goto L_0x00c3
                    kotlin.jvm.internal.C41536l.m120506z(r2)
                    r0 = r5
                L_0x00c3:
                    g50.h r6 = r13.f55925e
                    boolean r8 = r0 instanceof java.util.Collection
                    r9 = 1
                    r10 = 0
                    if (r8 == 0) goto L_0x00d3
                    boolean r8 = r0.isEmpty()
                    if (r8 == 0) goto L_0x00d3
                L_0x00d1:
                    r0 = r10
                    goto L_0x00f6
                L_0x00d3:
                    java.util.Iterator r0 = r0.iterator()
                L_0x00d7:
                    boolean r8 = r0.hasNext()
                    if (r8 == 0) goto L_0x00d1
                    java.lang.Object r8 = r0.next()
                    java.lang.Number r8 = (java.lang.Number) r8
                    long r11 = r8.longValue()
                    java.util.HashSet r8 = r6.mo49268k()
                    java.lang.Long r11 = java.lang.Long.valueOf(r11)
                    boolean r8 = r8.contains(r11)
                    if (r8 == 0) goto L_0x00d7
                    r0 = r9
                L_0x00f6:
                    r3.setChecked(r0)
                    g50.h$a r0 = r13.f55924d
                    ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel r0 = r0.f55920e
                    if (r0 != 0) goto L_0x0105
                    kotlin.jvm.internal.C41536l.m120506z(r7)
                    r0 = r5
                L_0x0105:
                    java.util.List r0 = r0.mo55079e()
                    r6 = 8
                    if (r0 == 0) goto L_0x012b
                    g50.h$a r0 = r13.f55924d
                    ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel r0 = r0.f55920e
                    if (r0 != 0) goto L_0x0119
                    kotlin.jvm.internal.C41536l.m120506z(r7)
                    r0 = r5
                L_0x0119:
                    java.util.List r0 = r0.mo55079e()
                    kotlin.jvm.internal.C41536l.m120486f(r0)
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L_0x0127
                    goto L_0x012b
                L_0x0127:
                    r4.setVisibility(r10)
                    goto L_0x0136
                L_0x012b:
                    r4.setVisibility(r6)
                    g50.f r0 = new g50.f
                    r0.<init>(r3)
                    r14.setOnClickListener(r0)
                L_0x0136:
                    boolean r0 = r3.isChecked()
                    if (r0 == 0) goto L_0x01ee
                    r1.setVisibility(r10)
                    g50.h r0 = r13.f55925e
                    java.util.HashSet r0 = r0.mo49268k()
                    g50.h$a r4 = r13.f55924d
                    ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel r4 = r4.f55920e
                    if (r4 != 0) goto L_0x0151
                    kotlin.jvm.internal.C41536l.m120506z(r7)
                    r4 = r5
                L_0x0151:
                    long r10 = r4.mo55075a()
                    java.lang.Long r4 = java.lang.Long.valueOf(r10)
                    boolean r0 = r0.contains(r4)
                    if (r0 != 0) goto L_0x01e0
                    g50.h r0 = r13.f55925e
                    java.util.HashSet r0 = r0.mo49268k()
                    g50.h$a r4 = r13.f55924d
                    java.util.List r4 = r4.f55921f
                    if (r4 != 0) goto L_0x0171
                    kotlin.jvm.internal.C41536l.m120506z(r2)
                    r4 = r5
                L_0x0171:
                    boolean r0 = r0.containsAll(r4)
                    if (r0 == 0) goto L_0x0178
                    goto L_0x01e0
                L_0x0178:
                    java.lang.StringBuilder r14 = new java.lang.StringBuilder
                    r14.<init>()
                    g50.h$a r0 = r13.f55924d
                    ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel r0 = r0.f55920e
                    if (r0 != 0) goto L_0x0189
                    kotlin.jvm.internal.C41536l.m120506z(r7)
                    goto L_0x018a
                L_0x0189:
                    r5 = r0
                L_0x018a:
                    java.util.List r0 = r5.mo55079e()
                    if (r0 == 0) goto L_0x01c1
                    g50.h r2 = r13.f55925e
                    java.util.Iterator r0 = r0.iterator()
                L_0x0196:
                    boolean r4 = r0.hasNext()
                    if (r4 == 0) goto L_0x01c1
                    java.lang.Object r4 = r0.next()
                    ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel r4 = (p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel) r4
                    java.util.HashSet r5 = r2.mo49268k()
                    long r6 = r4.mo55075a()
                    java.lang.Long r6 = java.lang.Long.valueOf(r6)
                    boolean r5 = r5.contains(r6)
                    if (r5 == 0) goto L_0x0196
                    java.lang.String r4 = r4.mo55082g()
                    r14.append(r4)
                    java.lang.String r4 = ", "
                    r14.append(r4)
                    goto L_0x0196
                L_0x01c1:
                    int r0 = r14.length()
                    r2 = 2
                    if (r0 <= r2) goto L_0x01d8
                    int r0 = r14.length()
                    int r0 = r0 - r9
                    r14.deleteCharAt(r0)
                    int r0 = r14.length()
                    int r0 = r0 - r9
                    r14.deleteCharAt(r0)
                L_0x01d8:
                    java.lang.String r14 = r14.toString()
                    r1.setText(r14)
                    goto L_0x01f1
                L_0x01e0:
                    android.content.Context r14 = r14.getContext()
                    int r0 = p366bk.C10328q.common_text_all
                    java.lang.CharSequence r14 = r14.getText(r0)
                    r1.setText(r14)
                    goto L_0x01f1
                L_0x01ee:
                    r1.setVisibility(r6)
                L_0x01f1:
                    g50.h r14 = r13.f55925e
                    g50.h$a r0 = r13.f55924d
                    g50.g r1 = new g50.g
                    r1.<init>(r14, r0)
                    r3.setOnCheckedChangeListener(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: g50.C20732h.C20733a.C20734a.mo49275c(android.view.View):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo49275c((View) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: g50.h$a$b */
        static final class C20735b extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C20733a f55926d;

            /* renamed from: e */
            final /* synthetic */ C20732h f55927e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20735b(C20733a aVar, C20732h hVar) {
                super(2);
                this.f55926d = aVar;
                this.f55927e = hVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: d */
            public static final void m67153d(CheckBox checkBox, View view) {
                C41536l.m120489i(checkBox, "$checkBox");
                checkBox.setChecked(!checkBox.isChecked());
            }

            /* access modifiers changed from: private */
            /* renamed from: e */
            public static final void m67154e(C20732h hVar, TransactionCategoryModel transactionCategoryModel, C20733a aVar, CompoundButton compoundButton, boolean z) {
                C41536l.m120489i(hVar, "this$0");
                C41536l.m120489i(transactionCategoryModel, "$it");
                C41536l.m120489i(aVar, "this$1");
                if (z) {
                    hVar.mo49268k().add(Long.valueOf(transactionCategoryModel.mo55075a()));
                } else {
                    hVar.mo49268k().remove(Long.valueOf(transactionCategoryModel.mo55075a()));
                }
                C43075l j = hVar.mo49267j();
                if (j != null) {
                    j.invoke(Integer.valueOf(hVar.mo49268k().size()));
                }
                aVar.f55919d.mo48121n();
            }

            /* renamed from: c */
            public final void mo49276c(View view, int i) {
                TransactionCategoryModel transactionCategoryModel;
                C41536l.m120489i(view, "view");
                TransactionCategoryModel h = this.f55926d.f55920e;
                if (h == null) {
                    C41536l.m120506z("category");
                    h = null;
                }
                List e = h.mo55079e();
                if (e != null) {
                    transactionCategoryModel = (TransactionCategoryModel) e.get(i);
                } else {
                    transactionCategoryModel = null;
                }
                if (transactionCategoryModel != null) {
                    C20732h hVar = this.f55927e;
                    C20733a aVar = this.f55926d;
                    View findViewById = view.findViewById(C10322k.category_name);
                    C41536l.m120488h(findViewById, "view.findViewById(R.id.category_name)");
                    View findViewById2 = view.findViewById(C10322k.category_color);
                    C41536l.m120488h(findViewById2, "view.findViewById(R.id.category_color)");
                    View findViewById3 = view.findViewById(C10322k.category_icon);
                    C41536l.m120488h(findViewById3, "view.findViewById(R.id.category_icon)");
                    ImageView imageView = (ImageView) findViewById3;
                    View findViewById4 = view.findViewById(C10322k.f28735G7);
                    C41536l.m120488h(findViewById4, "view.findViewById(R.id.checkbox)");
                    CheckBox checkBox = (CheckBox) findViewById4;
                    checkBox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                    ((TextView) findViewById).setText(transactionCategoryModel.mo55082g());
                    findViewById2.setBackgroundColor(transactionCategoryModel.mo55081f());
                    imageView.setImageResource(C27680a.f70771a.mo67216a(transactionCategoryModel.mo55075a()));
                    imageView.setColorFilter(transactionCategoryModel.mo55081f());
                    checkBox.setChecked(hVar.mo49268k().contains(Long.valueOf(transactionCategoryModel.mo55075a())));
                    view.setOnClickListener(new C20737i(checkBox));
                    checkBox.setOnCheckedChangeListener(new C20738j(hVar, transactionCategoryModel, aVar));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo49276c((View) obj, ((Number) obj2).intValue());
                return C41238w.f97225a;
            }
        }

        /* renamed from: g50.h$a$c */
        static final class C20736c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C20733a f55928d;

            /* renamed from: e */
            final /* synthetic */ C20732h f55929e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20736c(C20733a aVar, C20732h hVar) {
                super(1);
                this.f55928d = aVar;
                this.f55929e = hVar;
            }

            /* renamed from: a */
            public final void mo49277a(boolean z) {
                if (this.f55928d.f55922g != null) {
                    C20733a aVar = this.f55928d;
                    ImageView k = aVar.f55922g;
                    C41536l.m120486f(k);
                    aVar.m67144o(k, z);
                }
                if (z) {
                    ExpandableItemView g = this.f55929e.f55918i;
                    if (g != null) {
                        g.mo53625f(true);
                    }
                    this.f55929e.f55918i = this.f55928d.f55919d;
                    return;
                }
                this.f55929e.f55918i = null;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo49277a(((Boolean) obj).booleanValue());
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20733a(C20732h hVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f55923h = hVar;
            View findViewById = view.findViewById(C10322k.expandableItem);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.expandableItem)");
            ExpandableItemView expandableItemView = (ExpandableItemView) findViewById;
            this.f55919d = expandableItemView;
            expandableItemView.setScrollToTopWhenExpanded(true);
            expandableItemView.setScrollableParent(hVar.f55913d);
            expandableItemView.setOnBindHeader(new C20734a(this, hVar));
            expandableItemView.setOnBindItem(new C20735b(this, hVar));
            expandableItemView.setOnStateChanged(new C20736c(this, hVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public final void m67144o(ImageView imageView, boolean z) {
            Drawable mutate = imageView.getBackground().mutate();
            C41536l.m120487g(mutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            GradientDrawable gradientDrawable = (GradientDrawable) mutate;
            TransactionCategoryModel transactionCategoryModel = null;
            if (z) {
                imageView.setColorFilter(-1);
                TransactionCategoryModel transactionCategoryModel2 = this.f55920e;
                if (transactionCategoryModel2 == null) {
                    C41536l.m120506z("category");
                } else {
                    transactionCategoryModel = transactionCategoryModel2;
                }
                gradientDrawable.setColor(transactionCategoryModel.mo55081f());
                return;
            }
            TransactionCategoryModel transactionCategoryModel3 = this.f55920e;
            if (transactionCategoryModel3 == null) {
                C41536l.m120506z("category");
            } else {
                transactionCategoryModel = transactionCategoryModel3;
            }
            imageView.setColorFilter(transactionCategoryModel.mo55081f());
            gradientDrawable.setColor(-1);
        }

        /* renamed from: n */
        public final void mo49274n(TransactionCategoryModel transactionCategoryModel, int i) {
            boolean z;
            List list;
            C41536l.m120489i(transactionCategoryModel, "category");
            this.f55920e = transactionCategoryModel;
            List e = transactionCategoryModel.mo55079e();
            int i2 = 0;
            if (e == null || e.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                List<TransactionCategoryModel> e2 = transactionCategoryModel.mo55079e();
                C41536l.m120486f(e2);
                list = new ArrayList(C41343r.m119925u(e2, 10));
                for (TransactionCategoryModel a : e2) {
                    list.add(Long.valueOf(a.mo55075a()));
                }
            } else {
                list = C41339p.m119900e(Long.valueOf(transactionCategoryModel.mo55075a()));
            }
            this.f55921f = list;
            ExpandableItemView expandableItemView = this.f55919d;
            List e3 = transactionCategoryModel.mo55079e();
            if (e3 != null) {
                i2 = e3.size();
            }
            expandableItemView.mo53649x(i2, !this.f55923h.f55917h.contains(Integer.valueOf(i)));
        }
    }

    public int getItemCount() {
        return this.f55915f.size();
    }

    /* renamed from: j */
    public final C43075l mo49267j() {
        return this.f55914e;
    }

    /* renamed from: k */
    public final HashSet mo49268k() {
        return this.f55916g;
    }

    /* renamed from: l */
    public void onBindViewHolder(C20733a aVar, int i) {
        C41536l.m120489i(aVar, "viewHolder");
        aVar.mo49274n((TransactionCategoryModel) this.f55915f.get(i), i);
    }

    /* renamed from: m */
    public C20733a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.layout_category_filter_expandable_item, viewGroup, false);
        C41536l.m120488h(inflate, "from(parent.context).inf…able_item, parent, false)");
        return new C20733a(this, inflate);
    }

    /* renamed from: n */
    public final void mo49271n(List list) {
        C41536l.m120489i(list, C11755a.C11756a.f34100b);
        this.f55915f = list;
        notifyDataSetChanged();
    }

    /* renamed from: o */
    public final void mo49272o(C43075l lVar) {
        this.f55914e = lVar;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C41536l.m120489i(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f55913d = recyclerView;
    }

    /* renamed from: p */
    public final void mo49273p(HashSet hashSet) {
        C41536l.m120489i(hashSet, C11755a.C11756a.f34100b);
        this.f55916g = hashSet;
        C43075l lVar = this.f55914e;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(hashSet.size()));
        }
        notifyDataSetChanged();
    }
}

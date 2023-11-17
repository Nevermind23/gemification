package q81;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.C0214c;
import androidx.fragment.app.C1483c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32290b1;
import g91.C32343x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import l81.C37104a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: q81.c0 */
public final class C38166c0 extends C1483c {

    /* renamed from: A */
    private View.OnClickListener f91591A;

    /* renamed from: B */
    private View.OnClickListener f91592B;

    /* renamed from: C */
    private View.OnClickListener f91593C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C37104a f91594D;

    /* renamed from: t */
    private String f91595t;

    /* renamed from: u */
    private Spanned f91596u;

    /* renamed from: v */
    private String f91597v;

    /* renamed from: w */
    private String f91598w;

    /* renamed from: x */
    private String f91599x;

    /* renamed from: y */
    private List f91600y;

    /* renamed from: z */
    private C38167a f91601z;

    /* renamed from: q81.c0$a */
    private final class C38167a extends RecyclerView.C1736h {

        /* renamed from: d */
        private final List f91602d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f91603e;

        /* renamed from: f */
        private boolean f91604f;

        /* renamed from: q81.c0$a$a */
        public final class C38168a extends RecyclerView.C1734f0 {

            /* renamed from: d */
            private TextView f91606d;

            /* renamed from: e */
            private ImageView f91607e;

            /* renamed from: f */
            private final View f91608f;

            /* renamed from: g */
            final /* synthetic */ C38167a f91609g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C38168a(C38167a aVar, View view) {
                super(view);
                C41536l.m120489i(view, "view");
                this.f91609g = aVar;
                View findViewById = view.findViewById(C10322k.f28860kx);
                C41536l.m120488h(findViewById, "view.findViewById(R.id.text_item)");
                this.f91606d = (TextView) findViewById;
                View findViewById2 = view.findViewById(C10322k.f28731F7);
                C41536l.m120488h(findViewById2, "view.findViewById(R.id.check_image)");
                this.f91607e = (ImageView) findViewById2;
                View findViewById3 = view.findViewById(C10322k.list_item_container);
                View findViewById4 = view.findViewById(C10322k.bog_dialog_fragment_list_divider);
                C41536l.m120488h(findViewById4, "view.findViewById(R.id.b…og_fragment_list_divider)");
                this.f91608f = findViewById4;
                findViewById3.setOnClickListener(new C38164b0(C38166c0.this, this, aVar));
            }

            /* access modifiers changed from: private */
            /* renamed from: i */
            public static final void m112319i(C38166c0 c0Var, C38168a aVar, C38167a aVar2, View view) {
                C41536l.m120489i(c0Var, "this$0");
                C41536l.m120489i(aVar, "this$1");
                C41536l.m120489i(aVar2, "this$2");
                if (c0Var.f91594D != null) {
                    C37104a B1 = c0Var.f91594D;
                    C41536l.m120486f(B1);
                    B1.mo48298Z0(aVar.getBindingAdapterPosition());
                }
                aVar2.f91603e = aVar.getBindingAdapterPosition();
                aVar2.notifyDataSetChanged();
            }

            /* renamed from: j */
            public final ImageView mo91704j() {
                return this.f91607e;
            }

            /* renamed from: k */
            public final View mo91705k() {
                return this.f91608f;
            }

            /* renamed from: l */
            public final TextView mo91706l() {
                return this.f91606d;
            }
        }

        public C38167a(List list) {
            this.f91602d = list;
        }

        /* renamed from: g */
        public void onBindViewHolder(C38168a aVar, int i) {
            int i2;
            C41536l.m120489i(aVar, "holder");
            TextView l = aVar.mo91706l();
            List list = this.f91602d;
            C41536l.m120486f(list);
            l.setText((CharSequence) list.get(i));
            if (this.f91604f) {
                aVar.mo91704j().setVisibility(8);
            } else {
                ImageView j = aVar.mo91704j();
                if (this.f91603e == i) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                j.setVisibility(i2);
            }
            if (i == getItemCount() - 1) {
                aVar.mo91705k().setVisibility(8);
            } else {
                aVar.mo91705k().setVisibility(0);
            }
        }

        public int getItemCount() {
            List list = this.f91602d;
            C41536l.m120486f(list);
            return list.size();
        }

        /* renamed from: h */
        public C38168a onCreateViewHolder(ViewGroup viewGroup, int i) {
            C41536l.m120489i(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.bog_dialog_text_list_item, viewGroup, false);
            C41536l.m120488h(inflate, "from(parent.context)\n   …list_item, parent, false)");
            return new C38168a(this, inflate);
        }

        /* renamed from: i */
        public final void mo91703i(boolean z) {
            this.f91604f = z;
        }
    }

    /* renamed from: G1 */
    private final void m112305G1(TextView textView) {
        Spanned spanned = this.f91596u;
        if (spanned != null) {
            textView.setText(spanned);
        } else {
            textView.setText(this.f91595t);
        }
    }

    /* renamed from: H1 */
    private final void m112306H1(View view) {
        int i;
        boolean z;
        View findViewById;
        if ((this.f91597v == null || this.f91599x == null) && (findViewById = view.findViewById(C10322k.dialog_spring)) != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            C41536l.m120487g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams).weight = 3.5f;
            findViewById.requestLayout();
        }
        int i2 = C10322k.dialog_main_action_button;
        BogButton bogButton = (BogButton) view.findViewById(i2);
        int i3 = 8;
        if (this.f91597v == null) {
            i = 8;
        } else {
            i = 0;
        }
        bogButton.setVisibility(i);
        bogButton.setOnClickListener(this.f91591A);
        View findViewById2 = view.findViewById(i2);
        C41536l.m120487g(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById2).setText(this.f91597v);
        BogButton bogButton2 = (BogButton) view.findViewById(C10322k.dialog_second_btn);
        if (bogButton2 != null) {
            if (this.f91598w != null) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(bogButton2, z, false, 2, (Object) null);
            bogButton2.setOnClickListener(this.f91592B);
            bogButton2.setText(this.f91598w);
        }
        int i4 = C10322k.dialog_secondary_action_button;
        BogButton bogButton3 = (BogButton) view.findViewById(i4);
        if (bogButton3 != null) {
            bogButton3.setOrange(false);
            if (this.f91599x != null) {
                i3 = 0;
            }
            bogButton3.setVisibility(i3);
            bogButton3.setOnClickListener(this.f91593C);
            View findViewById3 = view.findViewById(i4);
            C41536l.m120487g(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) findViewById3).setText(this.f91599x);
        }
    }

    /* renamed from: I1 */
    private final void m112307I1(View view) {
        View findViewById = view.findViewById(C10322k.f28915yx);
        C41536l.m120488h(findViewById, "v.findViewById(R.id.title)");
        m112305G1((TextView) findViewById);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C10322k.dialog_recycler_view);
        this.f91601z = new C38167a(this.f91600y);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(this.f91601z);
    }

    /* renamed from: J1 */
    private final void m112308J1(View view) {
        m112307I1(view);
        C38167a aVar = this.f91601z;
        C41536l.m120486f(aVar);
        aVar.mo91703i(true);
        C38167a aVar2 = this.f91601z;
        C41536l.m120486f(aVar2);
        aVar2.notifyDataSetChanged();
    }

    /* renamed from: C1 */
    public final void mo91697C1(C37104a aVar) {
        this.f91594D = aVar;
    }

    /* renamed from: D1 */
    public final void mo91698D1(String str, View.OnClickListener onClickListener) {
        this.f91593C = onClickListener;
        this.f91599x = str;
    }

    /* renamed from: E1 */
    public final void mo91699E1(ArrayList arrayList) {
        this.f91600y = arrayList;
    }

    /* renamed from: F1 */
    public final void mo91700F1(String str) {
        this.f91595t = str;
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        C0214c.C0215a aVar = new C0214c.C0215a(requireActivity());
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        C41536l.m120488h(layoutInflater, "requireActivity().layoutInflater");
        View inflate = layoutInflater.inflate(C10324m.bog_dialog_text_list_layout, (ViewGroup) null);
        C41536l.m120488h(inflate, "inflater.inflate(R.layou…g_text_list_layout, null)");
        m112308J1(inflate);
        m112306H1(inflate);
        aVar.setView(inflate);
        C32290b1.m95112b(inflate.findViewById(C10322k.bog_dialog_focusable));
        C0214c create = aVar.create();
        C41536l.m120488h(create, "b.create()");
        return create;
    }
}

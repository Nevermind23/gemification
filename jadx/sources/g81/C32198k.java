package g81;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.collection.ArraySet;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import g91.C32290b1;
import g91.C32303f;
import g91.C32319m;
import g91.C32355x0;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.Set;
import l81.C37106c;
import l81.C37107d;
import m81.C37246a;
import p341ge.bog.mobilebank.model.loans.ILoanHistoryScheduleSummary;
import p341ge.bog.mobilebank.model.loans.history.LoanHistoryItem;
import p341ge.bog.mobilebank.model.loans.schedule.LoanScheduleItem;
import p341ge.bog.mobilebank.p975ui.views.widgets.BigDividerView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10319h;
import p366bk.C10322k;
import p366bk.C10323l;
import p366bk.C10324m;
import p366bk.C10328q;
import p380ck.C10463g;
import r90.C27950a;

/* renamed from: g81.k */
public class C32198k extends C37106c {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Set f79366d = new ArraySet();

    /* renamed from: e */
    private int f79367e;

    /* renamed from: f */
    private int f79368f;

    /* renamed from: g */
    private int f79369g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f79370h;

    /* renamed from: i */
    private Context f79371i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public RecyclerView f79372j;

    /* renamed from: k */
    private ArrayList f79373k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public ArrayList f79374l;

    /* renamed from: m */
    private ILoanHistoryScheduleSummary f79375m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public View.OnClickListener f79376n;

    /* renamed from: o */
    private int f79377o = BogInputLayout.INPUT_TYPE_TEXT_PASSWORD;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public View.OnClickListener f79378p;

    /* renamed from: g81.k$a */
    private class C32199a extends C37107d {
        C32199a(View view) {
            super(view);
        }
    }

    /* renamed from: g81.k$b */
    private class C32200b extends C37107d {

        /* renamed from: f */
        private View f79380f = mo90036h(C10322k.horizontal_error_retry_button);

        public C32200b(View view) {
            super(view);
            if (C32198k.this.f79378p != null) {
                this.f79380f.setOnClickListener(C32198k.this.f79378p);
            }
        }
    }

    /* renamed from: g81.k$c */
    private class C32201c extends C37107d implements View.OnClickListener {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public View f79382f = mo90036h(C10322k.loan_history_item_arrow);
        /* access modifiers changed from: private */

        /* renamed from: g */
        public View f79383g = mo90036h(C10322k.loan_history_item_orange_arrow);
        /* access modifiers changed from: private */

        /* renamed from: h */
        public View f79384h = mo90036h(C10322k.loan_history_item_details);
        /* access modifiers changed from: private */

        /* renamed from: i */
        public BogTextView f79385i = ((BogTextView) mo90036h(C10322k.history_item_first_tv));
        /* access modifiers changed from: private */

        /* renamed from: j */
        public BogTextView f79386j = ((BogTextView) mo90036h(C10322k.history_item_second_tv));
        /* access modifiers changed from: private */

        /* renamed from: k */
        public BogTextView f79387k = ((BogTextView) mo90036h(C10322k.history_item_third_tv));
        /* access modifiers changed from: private */

        /* renamed from: l */
        public BogTextView f79388l = ((BogTextView) mo90036h(C10322k.history_item_fourth_tv));
        /* access modifiers changed from: private */

        /* renamed from: m */
        public BogTextView f79389m = ((BogTextView) mo90036h(C10322k.history_item_fifth_tv));
        /* access modifiers changed from: private */

        /* renamed from: n */
        public BogTextView f79390n = ((BogTextView) mo90036h(C10322k.history_item_date));
        /* access modifiers changed from: private */

        /* renamed from: o */
        public BogTextView f79391o = ((BogTextView) mo90036h(C10322k.history_item_total_amount));
        /* access modifiers changed from: private */

        /* renamed from: p */
        public BogTextView f79392p = ((BogTextView) mo90036h(C10322k.loan_history_item_first_label_tv));
        /* access modifiers changed from: private */

        /* renamed from: q */
        public BogTextView f79393q = ((BogTextView) mo90036h(C10322k.history_item_fifth_title));
        /* access modifiers changed from: private */

        /* renamed from: r */
        public BogTextView f79394r = ((BogTextView) mo90036h(C10322k.loanFeeTV));
        /* access modifiers changed from: private */

        /* renamed from: s */
        public View f79395s = mo90036h(C10322k.history_item_fifth_container);
        /* access modifiers changed from: private */

        /* renamed from: t */
        public View f79396t = mo90036h(C10322k.history_item_second_container);
        /* access modifiers changed from: private */

        /* renamed from: u */
        public View f79397u = mo90036h(C10322k.history_item_third_container);
        /* access modifiers changed from: private */

        /* renamed from: v */
        public View f79398v = mo90036h(C10322k.history_item_fourth_container);
        /* access modifiers changed from: private */

        /* renamed from: w */
        public View f79399w = mo90036h(C10322k.history_item_whitespace);

        /* renamed from: g81.k$c$a */
        class C32202a implements Animation.AnimationListener {

            /* renamed from: d */
            final /* synthetic */ int f79401d;

            C32202a(int i) {
                this.f79401d = i;
            }

            public void onAnimationEnd(Animation animation) {
                C32198k.this.f79372j.mo5425x1(this.f79401d);
                C32198k.this.f79372j.getLayoutManager().mo5197J1(this.f79401d);
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        }

        C32201c(View view) {
            super(view);
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            boolean z;
            String str;
            int adapterPosition = getAdapterPosition();
            int i = 0;
            if (C32198k.this.f79366d.contains(Integer.valueOf(adapterPosition))) {
                C32198k.this.f79366d.remove(Integer.valueOf(getAdapterPosition()));
                z = true;
            } else {
                C10463g F = C36546y.m108282F();
                if (C32198k.this.f79374l == null) {
                    str = "schedule";
                } else {
                    str = "history";
                }
                F.mo27152s("loans", str, "expand");
                C32198k.this.f79366d.add(Integer.valueOf(getAdapterPosition()));
                z = false;
            }
            if (!z) {
                i = C32198k.this.m94876q(getAdapterPosition() - 2);
                this.f79383g.animate().alpha(1.0f).setDuration((long) C32198k.this.f79370h);
                this.f79382f.animate().rotation(180.0f);
            } else {
                this.f79383g.animate().alpha(Utils.FLOAT_EPSILON).setDuration((long) C32198k.this.f79370h);
                this.f79382f.animate().rotation(Utils.FLOAT_EPSILON);
            }
            C37246a aVar = new C37246a(this.f79384h, i);
            aVar.setDuration((long) C32198k.this.f79370h);
            aVar.setAnimationListener(new C32202a(adapterPosition));
            this.f79384h.startAnimation(aVar);
        }
    }

    /* renamed from: g81.k$d */
    private class C32203d extends C37107d {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public BogTextView f79403f = ((BogTextView) mo90036h(C10322k.history_summery_left_amount_tv));
        /* access modifiers changed from: private */

        /* renamed from: g */
        public BogTextView f79404g = ((BogTextView) mo90036h(C10322k.history_summery_left_amount_label_tv));

        /* renamed from: h */
        private View f79405h;

        C32203d(View view) {
            super(view);
            View h = mo90036h(C10322k.pdf_button);
            this.f79405h = h;
            h.setOnClickListener(C32198k.this.f79376n);
        }
    }

    /* renamed from: g81.k$e */
    private class C32204e extends C37107d {
        C32204e(View view) {
            super(view);
        }
    }

    public C32198k(Context context) {
        this.f79371i = context;
        this.f79367e = C32355x0.m95516g(C10319h.loan_history_item_details_top_bottom_padding) * 2;
        this.f79368f = C32355x0.m95516g(C10319h.loan_history_item_details_item_bottom_margin);
        this.f79369g = C32355x0.m95516g(C10319h.loan_history_item_details_item_height);
        this.f79370h = context.getResources().getInteger(C10323l.transition_anim_duration);
    }

    /* renamed from: A */
    private void m94867A(C32201c cVar, int i) {
        String str;
        if (((LoanHistoryItem) this.f79374l.get(i)).getFeeTypeDictionaryKey() != null) {
            str = C27950a.m86284a(((LoanHistoryItem) this.f79374l.get(i)).getFeeTypeDictionaryKey()) + ":";
        } else {
            str = this.f79371i.getString(C10328q.f28943U1);
        }
        cVar.f79394r.setText(str);
        cVar.f79385i.setText(((LoanHistoryItem) this.f79374l.get(i)).getFirstValue());
        if (!((LoanHistoryItem) this.f79374l.get(i)).isPln()) {
            cVar.f79386j.setText(((LoanHistoryItem) this.f79374l.get(i)).getSecondValue());
            cVar.f79387k.setText(((LoanHistoryItem) this.f79374l.get(i)).getThirdValue());
            if (((LoanHistoryItem) this.f79374l.get(i)).getInsAmt().doubleValue() > Utils.DOUBLE_EPSILON) {
                cVar.f79398v.setVisibility(0);
                cVar.f79399w.setVisibility(0);
                cVar.f79388l.setText(((LoanHistoryItem) this.f79374l.get(i)).getFourthValue());
            } else {
                cVar.f79399w.setVisibility(8);
                cVar.f79398v.setVisibility(8);
            }
            cVar.f79389m.setText(((LoanHistoryItem) this.f79374l.get(i)).getFifthValue());
            cVar.f79390n.setText(C32319m.m95314u(((LoanHistoryItem) this.f79374l.get(i)).getPaymentDate()));
            cVar.f79391o.setText(C32303f.m95204o(((LoanHistoryItem) this.f79374l.get(i)).getAmountPaid().doubleValue()) + " " + C32303f.m95197h(((LoanHistoryItem) this.f79374l.get(i)).getCcy()));
            return;
        }
        cVar.f79396t.setVisibility(8);
        cVar.f79397u.setVisibility(8);
        cVar.f79398v.setVisibility(8);
        cVar.f79395s.setVisibility(8);
        cVar.f79399w.setVisibility(0);
        cVar.f79392p.setText(cVar.f79392p.getContext().getString(C10328q.common_text_operation_type));
        cVar.f79390n.setText(C32319m.m95314u(((LoanHistoryItem) this.f79374l.get(i)).getOperDate()));
        cVar.f79391o.setText(C32303f.m95204o(((LoanHistoryItem) this.f79374l.get(i)).getAmount().doubleValue()) + " " + C32303f.m95197h(((LoanHistoryItem) this.f79374l.get(i)).getCcy()));
    }

    /* renamed from: B */
    private void m94868B(C32201c cVar, int i) {
        String str;
        if (((LoanScheduleItem) this.f79373k.get(i)).getFeeTypeDictionaryKey() != null) {
            str = C27950a.m86284a(((LoanScheduleItem) this.f79373k.get(i)).getFeeTypeDictionaryKey()) + ":";
        } else {
            str = this.f79371i.getString(C10328q.f28943U1);
        }
        cVar.f79394r.setText(str);
        cVar.f79385i.setText(((LoanScheduleItem) this.f79373k.get(i)).getFirstValue());
        cVar.f79386j.setText(((LoanScheduleItem) this.f79373k.get(i)).getSecondValue());
        cVar.f79387k.setText(((LoanScheduleItem) this.f79373k.get(i)).getThirdValue());
        if (((LoanScheduleItem) this.f79373k.get(i)).getInsAmt().doubleValue() > Utils.DOUBLE_EPSILON) {
            cVar.f79398v.setVisibility(0);
            cVar.f79399w.setVisibility(0);
            cVar.f79388l.setText(((LoanScheduleItem) this.f79373k.get(i)).getFourthValue());
        } else {
            cVar.f79399w.setVisibility(8);
            cVar.f79398v.setVisibility(8);
        }
        cVar.f79393q.setText(this.f79371i.getString(C10328q.property_insurance));
        cVar.f79389m.setText(C32303f.m95204o(((LoanScheduleItem) this.f79373k.get(i)).rliAmt.doubleValue()) + " " + C32303f.m95197h(((LoanScheduleItem) this.f79373k.get(i)).getCcy()));
        cVar.f79390n.setText(C32319m.m95314u(((LoanScheduleItem) this.f79373k.get(i)).getPayDate()));
        cVar.f79391o.setText(C32303f.m95204o(((LoanScheduleItem) this.f79373k.get(i)).getTotalAmt().doubleValue()) + " " + C32303f.m95197h(((LoanScheduleItem) this.f79373k.get(i)).getCcy()));
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public int m94876q(int i) {
        int i2;
        ArrayList arrayList = this.f79374l;
        if (arrayList == null) {
            i2 = ((LoanScheduleItem) this.f79373k.get(i)).getCount();
        } else {
            i2 = ((LoanHistoryItem) arrayList.get(i)).getCount();
        }
        return this.f79367e + (this.f79369g * i2) + ((i2 - 1) * this.f79368f);
    }

    public int getItemCount() {
        int size;
        int i = this.f79377o;
        if (300 == i) {
            ArrayList arrayList = this.f79374l;
            if (arrayList != null) {
                size = arrayList.size();
            } else {
                size = this.f79373k.size();
            }
            return size + 2;
        } else if (i == 100) {
            return 1;
        } else {
            return 10;
        }
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        return i == 1 ? 1 : 2;
    }

    /* renamed from: i */
    public void onBindViewHolder(C37107d dVar, int i) {
        super.mo65512i(dVar, i);
        int i2 = this.f79377o;
        if (i2 == 300) {
            if (getItemViewType(i) == 2) {
                C32201c cVar = (C32201c) dVar;
                if (this.f79366d.contains(Integer.valueOf(i))) {
                    C32290b1.m95124n(cVar.f79384h, m94876q(i - 2));
                    cVar.f79382f.setRotation(180.0f);
                    cVar.f79383g.setAlpha(1.0f);
                } else {
                    C32290b1.m95124n(cVar.f79384h, 0);
                    cVar.f79382f.setRotation(Utils.FLOAT_EPSILON);
                    cVar.f79383g.setAlpha(Utils.FLOAT_EPSILON);
                }
                int i3 = i - 2;
                if (this.f79374l != null) {
                    m94867A(cVar, i3);
                } else {
                    m94868B(cVar, i3);
                }
            } else if (getItemViewType(i) == 1) {
                C32203d dVar2 = (C32203d) dVar;
                Context context = dVar2.f79404g.getContext();
                if (this.f79374l != null) {
                    dVar2.f79404g.setText(context.getString(C10328q.product_details_title_loan_amount_paid));
                } else {
                    dVar2.f79404g.setText(context.getString(C10328q.product_details_title_loan_amount_to_pay));
                }
                dVar2.f79403f.setText(this.f79375m.getAmount());
            }
        } else if (i2 == 100) {
            C32290b1.m95124n(dVar.f89287d, C32355x0.m95511b(200.0f, this.f79371i));
        }
    }

    /* renamed from: r */
    public C37107d onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = this.f79377o;
        if (i2 == 300) {
            if (i == 0) {
                return new C32199a(new BigDividerView(this.f79371i));
            }
            if (i == 1) {
                return new C32203d(mo90035h(C10324m.layout_loans_full_amount, viewGroup));
            }
            return new C32201c(mo90035h(C10324m.loan_history_item, viewGroup));
        } else if (i2 == 200) {
            return new C32204e(mo90035h(C10324m.loan_history_loading_item, viewGroup));
        } else {
            return new C32200b(mo90035h(C10324m.layout_horizontal_error, viewGroup));
        }
    }

    /* renamed from: s */
    public void mo72722s() {
        View.OnClickListener onClickListener = this.f79376n;
        if (onClickListener != null) {
            onClickListener.onClick((View) null);
        }
    }

    /* renamed from: t */
    public void mo72723t(ArrayList arrayList) {
        this.f79374l = arrayList;
    }

    /* renamed from: u */
    public void mo72724u(ArrayList arrayList) {
        this.f79373k = arrayList;
    }

    /* renamed from: v */
    public void mo72725v(View.OnClickListener onClickListener) {
        this.f79378p = onClickListener;
    }

    /* renamed from: w */
    public void mo72726w(View.OnClickListener onClickListener) {
        this.f79376n = onClickListener;
    }

    /* renamed from: x */
    public void mo72727x(RecyclerView recyclerView) {
        this.f79372j = recyclerView;
    }

    /* renamed from: y */
    public void mo72728y(ILoanHistoryScheduleSummary iLoanHistoryScheduleSummary) {
        this.f79375m = iLoanHistoryScheduleSummary;
    }

    /* renamed from: z */
    public void mo72729z(int i) {
        this.f79377o = i;
    }
}

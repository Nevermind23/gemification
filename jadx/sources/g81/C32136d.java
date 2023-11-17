package g81;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.github.mikephil.charting.utils.Utils;
import g91.C32303f;
import g91.C32319m;
import l81.C37107d;
import o81.C37693a;
import o81.C37694b;
import p341ge.bog.mobilebank.model.CashBackStatement;
import p341ge.bog.mobilebank.model.bonus.BonusStatementDetail;
import p341ge.bog.mobilebank.model.bonus.ScoolCardStatementItem;
import p341ge.bog.mobilebank.model.statement.AccountStatement;
import p341ge.bog.mobilebank.model.statement.CasStatement;
import p366bk.C10313b;
import p366bk.C10322k;
import p366bk.C10324m;
import r90.C27950a;

/* renamed from: g81.d */
public class C32136d extends C37694b {

    /* renamed from: l */
    private Context f79122l;

    /* renamed from: m */
    private Animation f79123m;

    /* renamed from: n */
    private int f79124n;

    /* renamed from: g81.d$a */
    public class C32137a extends C37107d {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public TextView f79125f = ((TextView) mo90036h(C10322k.time_text));
        /* access modifiers changed from: private */

        /* renamed from: g */
        public TextView f79126g = ((TextView) mo90036h(C10322k.entry_comment_tv));
        /* access modifiers changed from: private */

        /* renamed from: h */
        public TextView f79127h = ((TextView) mo90036h(C10322k.f28916zn));

        public C32137a(View view) {
            super(view);
        }
    }

    /* renamed from: g81.d$b */
    public class C32138b extends C37107d {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public TextView f79129f = ((TextView) mo90036h(C10322k.f28878p1));
        /* access modifiers changed from: private */

        /* renamed from: g */
        public TextView f79130g = ((TextView) mo90036h(C10322k.date_tv));

        public C32138b(View view) {
            super(view);
        }
    }

    public C32136d(C37693a aVar) {
        super(aVar);
    }

    /* renamed from: F */
    public static C32136d m94665F(Context context, int i) {
        C37693a aVar = new C37693a();
        aVar.mo90874e(C10324m.operation_error_item);
        aVar.mo90875f(C10324m.account_statement_loading_item);
        C32136d dVar = new C32136d(aVar);
        dVar.mo72624G(context);
        dVar.mo72625H(i);
        return dVar;
    }

    /* renamed from: G */
    public void mo72624G(Context context) {
        this.f79122l = context;
        this.f79123m = AnimationUtils.loadAnimation(context, C10313b.infinite_alpha);
    }

    /* renamed from: H */
    public void mo72625H(int i) {
        this.f79124n = i;
    }

    public int getItemViewType(int i) {
        int itemViewType = super.getItemViewType(i);
        if (itemViewType != -1) {
            return itemViewType;
        }
        if (this.f79124n == 9) {
            return 20;
        }
        return 10;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo72619v(C37107d dVar, int i) {
        super.mo72619v(dVar, i);
        if (dVar.getItemViewType() == -2) {
            dVar.f89287d.findViewById(C10322k.animation_container).startAnimation(this.f79123m);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo72620w(C37107d dVar, int i) {
        String str;
        int itemViewType = dVar.getItemViewType();
        if (itemViewType == 10) {
            int i2 = this.f79124n;
            String str2 = "+ ";
            if (i2 == 8 || i2 == 16) {
                C32137a aVar = (C32137a) dVar;
                aVar.f79125f.setText(C32319m.m95296c(((BonusStatementDetail) mo90883o(i)).getAddDate(), this.f79122l));
                if (this.f79124n == 16) {
                    aVar.f79126g.setText(((BonusStatementDetail) mo90883o(i)).getEntryComment());
                } else {
                    aVar.f79126g.setText(((BonusStatementDetail) mo90883o(i)).getGeneratedComment());
                }
                TextView i3 = aVar.f79127h;
                StringBuilder sb = new StringBuilder();
                if (((BonusStatementDetail) mo90883o(i)).getBonus().doubleValue() < Utils.DOUBLE_EPSILON) {
                    str2 = "";
                }
                sb.append(str2);
                sb.append(C32303f.m95204o(((BonusStatementDetail) mo90883o(i)).getBonus().doubleValue()));
                i3.setText(sb.toString());
            } else if (i2 == 10) {
                C32137a aVar2 = (C32137a) dVar;
                aVar2.f79125f.setText(C32319m.m95296c(((CashBackStatement) mo90883o(i)).getPostDate(), this.f79122l));
                TextView j = aVar2.f79126g;
                if (((CashBackStatement) mo90883o(i)).getEntryComment() != null) {
                    str = ((CashBackStatement) mo90883o(i)).getEntryComment();
                } else {
                    str = C27950a.m86284a("text.cashBack.noEntryComment");
                }
                j.setText(str);
                TextView i4 = aVar2.f79127h;
                StringBuilder sb2 = new StringBuilder();
                if (((CashBackStatement) mo90883o(i)).getCashbackAmount().doubleValue() < Utils.DOUBLE_EPSILON) {
                    str2 = "";
                }
                sb2.append(str2);
                sb2.append(C32303f.m95204o(((CashBackStatement) mo90883o(i)).getCashbackAmount().doubleValue()));
                sb2.append(C32303f.m95198i("GEL", true));
                i4.setText(sb2.toString());
            } else if (i2 == 15) {
                C32137a aVar3 = (C32137a) dVar;
                aVar3.f79125f.setText(C32319m.m95296c(((ScoolCardStatementItem) mo90883o(i)).getAddDate(), this.f79122l));
                aVar3.f79126g.setText(((ScoolCardStatementItem) mo90883o(i)).getComment());
                TextView i5 = aVar3.f79127h;
                StringBuilder sb3 = new StringBuilder();
                if (((ScoolCardStatementItem) mo90883o(i)).getAddBonus() < 0) {
                    str2 = "";
                }
                sb3.append(str2);
                sb3.append(((ScoolCardStatementItem) mo90883o(i)).getAddBonus());
                i5.setText(sb3.toString());
            } else {
                C32137a aVar4 = (C32137a) dVar;
                aVar4.f79125f.setText(((AccountStatement) mo90883o(i)).getPostDate());
                aVar4.f79126g.setText(((AccountStatement) mo90883o(i)).getEntryComment());
                TextView i6 = aVar4.f79127h;
                i6.setText(C32303f.m95204o(((AccountStatement) mo90883o(i)).getAmounts().get(0).getAmount().doubleValue()) + C32303f.m95198i(((AccountStatement) mo90883o(i)).getAmounts().get(0).getCcy(), true));
            }
        } else if (itemViewType == 20) {
            C32138b bVar = (C32138b) dVar;
            bVar.f79130g.setText(C32319m.m95314u(((CasStatement) mo90883o(i)).getRunDate()));
            TextView i7 = bVar.f79129f;
            i7.setText(C32303f.m95204o(((CasStatement) mo90883o(i)).getAmount().doubleValue()) + C32303f.m95198i(((CasStatement) mo90883o(i)).getCcy(), true));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public C37107d mo72621y(ViewGroup viewGroup, int i) {
        if (i == 20) {
            return new C32138b(mo90035h(C10324m.cas_history_item, viewGroup));
        }
        return new C32137a(mo90035h(C10324m.account_statement_item, viewGroup));
    }
}

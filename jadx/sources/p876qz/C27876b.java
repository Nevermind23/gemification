package p876qz;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32290b1;
import g91.C32303f;
import g91.C32335t0;
import g91.C32343x;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferCurrenciesUiModel;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.TransferCurrencyUiItem;
import p366bk.C10320i;
import p866pz.C27655d;
import p90.C27342j8;

/* renamed from: qz.b */
public final class C27876b extends RecyclerView.C1736h {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final MoneyTransferCurrenciesUiModel f71010d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final String f71011e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f71012f = -1;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Drawable f71013g;

    /* renamed from: h */
    private C27655d f71014h;

    /* renamed from: qz.b$a */
    public final class C27877a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C27342j8 f71015d;

        /* renamed from: e */
        final /* synthetic */ C27876b f71016e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27877a(C27876b bVar, C27342j8 j8Var) {
            super(j8Var.mo3946b());
            C41536l.m120489i(j8Var, "binding");
            this.f71016e = bVar;
            this.f71015d = j8Var;
            TextView textView = j8Var.f69094f;
            textView.setPaintFlags(textView.getPaintFlags() | 16);
            if (!bVar.f71010d.mo53133d()) {
                j8Var.f69094f.setVisibility(8);
                j8Var.f69096h.setBackground((Drawable) null);
                j8Var.f69095g.setTextColor(Color.parseColor("#636363"));
            }
            j8Var.mo3946b().setOnClickListener(new C27875a(bVar, this));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m86123i(C27876b bVar, C27877a aVar, View view) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(aVar, "this$1");
            C27655d k = bVar.mo67406k();
            if (k != null) {
                k.mo53120Y((TransferCurrencyUiItem) bVar.f71010d.mo53132b().get(aVar.getAdapterPosition()));
            }
            int h = bVar.f71012f;
            bVar.f71012f = aVar.getAdapterPosition();
            bVar.notifyItemChanged(h);
            bVar.notifyItemChanged(bVar.f71012f);
        }

        /* renamed from: j */
        public final void mo67410j(TransferCurrencyUiItem transferCurrencyUiItem, boolean z) {
            C41536l.m120489i(transferCurrencyUiItem, "currencyItem");
            this.f71015d.f69093e.setText(C32343x.m95388F(transferCurrencyUiItem.mo53202b(), new Object[0]));
            if (z) {
                this.f71015d.f69093e.setCompoundDrawablesWithIntrinsicBounds(this.f71016e.f71013g, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                this.f71015d.f69093e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f71015d.f69097i.setText(C32343x.m95408P(transferCurrencyUiItem.mo53209h(), transferCurrencyUiItem.mo53201a()));
            if (transferCurrencyUiItem.mo53208g() != null) {
                this.f71015d.f69096h.setVisibility(0);
                TextView textView = this.f71015d.f69095g;
                String h = C32303f.m95197h(this.f71016e.f71011e);
                BigDecimal scale = transferCurrencyUiItem.mo53208g().setScale(4, RoundingMode.UP);
                String i = C32303f.m95198i(transferCurrencyUiItem.mo53201a(), true);
                textView.setText("1 " + h + " = " + scale + i);
            } else {
                this.f71015d.f69096h.setVisibility(8);
            }
            if (transferCurrencyUiItem.mo53205e() != null) {
                this.f71015d.f69094f.setVisibility(0);
                TextView textView2 = this.f71015d.f69094f;
                String h2 = C32303f.m95197h(this.f71016e.f71011e);
                BigDecimal scale2 = transferCurrencyUiItem.mo53205e().setScale(4, RoundingMode.UP);
                String i2 = C32303f.m95198i(transferCurrencyUiItem.mo53201a(), true);
                textView2.setText("1 " + h2 + " = " + scale2 + i2);
                return;
            }
            this.f71015d.f69094f.setVisibility(8);
        }
    }

    public C27876b(MoneyTransferCurrenciesUiModel moneyTransferCurrenciesUiModel, String str, String str2) {
        Object obj;
        C41536l.m120489i(moneyTransferCurrenciesUiModel, "currenciesUiModel");
        C41536l.m120489i(str, "currency");
        this.f71010d = moneyTransferCurrenciesUiModel;
        this.f71011e = str;
        List b = moneyTransferCurrenciesUiModel.mo53132b();
        Iterator it = moneyTransferCurrenciesUiModel.mo53132b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((TransferCurrencyUiItem) obj).mo53201a(), str2)) {
                break;
            }
        }
        this.f71012f = C41358y.m120012b0(b, obj);
    }

    public int getItemCount() {
        return this.f71010d.mo53132b().size();
    }

    /* renamed from: k */
    public final C27655d mo67406k() {
        return this.f71014h;
    }

    /* renamed from: l */
    public void onBindViewHolder(C27877a aVar, int i) {
        boolean z;
        C41536l.m120489i(aVar, "holder");
        TransferCurrencyUiItem transferCurrencyUiItem = (TransferCurrencyUiItem) this.f71010d.mo53132b().get(i);
        if (this.f71012f == i) {
            z = true;
        } else {
            z = false;
        }
        aVar.mo67410j(transferCurrencyUiItem, z);
    }

    /* renamed from: m */
    public C27877a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (this.f71013g == null) {
            this.f71013g = C0767a.m2895e(viewGroup.getContext(), C10320i.ic_tick);
            if (C32335t0.m95361f() != 0) {
                this.f71013g = C32290b1.m95122l(viewGroup.getContext(), this.f71013g, C32335t0.m95359d(viewGroup.getContext(), true));
            }
        }
        C27342j8 d = C27342j8.m84677d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…          false\n        )");
        return new C27877a(this, d);
    }

    /* renamed from: n */
    public final void mo67409n(C27655d dVar) {
        this.f71014h = dVar;
    }
}

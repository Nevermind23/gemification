package p341ge.bog.mobilebank.p975ui.activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import g91.C32289b0;
import g91.C32355x0;
import iu0.C36546y;
import java.util.ArrayList;
import l81.C37106c;
import l81.C37107d;
import p341ge.bog.mobilebank.p975ui.views.widgets.BigDividerView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p380ck.C10478k;
import z90.C30268c;

/* renamed from: ge.bog.mobilebank.ui.activities.STOTypeListActivity */
public class STOTypeListActivity extends C35429k0 {

    /* renamed from: G */
    protected C30268c f85448G;

    /* renamed from: H */
    private RecyclerView f85449H;

    /* renamed from: I */
    private C35320b f85450I;

    /* renamed from: ge.bog.mobilebank.ui.activities.STOTypeListActivity$a */
    class C35319a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f85451a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f85452b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f85453c;

        public C35319a(String str, int i, String str2) {
            this.f85451a = i;
            this.f85452b = str;
            this.f85453c = str2;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.STOTypeListActivity$b */
    class C35320b extends C37106c {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public ArrayList f85455d;

        /* renamed from: e */
        private int f85456e;

        /* renamed from: f */
        private int f85457f;

        /* renamed from: ge.bog.mobilebank.ui.activities.STOTypeListActivity$b$a */
        private class C35321a extends C37107d {
            public C35321a(View view) {
                super(view);
            }
        }

        /* renamed from: ge.bog.mobilebank.ui.activities.STOTypeListActivity$b$b */
        private class C35322b extends C37107d {

            /* renamed from: f */
            BogTextView f85460f = ((BogTextView) mo90036h(C10322k.f28741Hf));

            /* renamed from: g */
            View f85461g = mo90036h(C10322k.settings_btn);

            /* renamed from: h */
            View f85462h = mo90036h(C10322k.f28875o9);

            /* renamed from: i */
            View f85463i = mo90036h(C10322k.header_arrow_container);

            public C35322b(View view) {
                super(view);
                this.f85460f.setText(STOTypeListActivity.this.getString(C10328q.sto_type_list_header));
                this.f85461g.setVisibility(8);
                this.f85463i.setVisibility(8);
            }
        }

        /* renamed from: ge.bog.mobilebank.ui.activities.STOTypeListActivity$b$c */
        private class C35323c extends C37107d {
            /* access modifiers changed from: private */

            /* renamed from: f */
            public ImageView f85465f = ((ImageView) mo90036h(C10322k.rounded_image));

            /* renamed from: g */
            private View f85466g = mo90036h(C10322k.rounded_container);
            /* access modifiers changed from: private */

            /* renamed from: h */
            public BogTextView f85467h = ((BogTextView) mo90036h(C10322k.provider_title));

            /* renamed from: i */
            private View f85468i = mo90036h(C10322k.provider_wrapper);

            /* renamed from: ge.bog.mobilebank.ui.activities.STOTypeListActivity$b$c$a */
            class C35324a implements View.OnClickListener {

                /* renamed from: d */
                final /* synthetic */ C35320b f85470d;

                C35324a(C35320b bVar) {
                    this.f85470d = bVar;
                }

                public void onClick(View view) {
                    if (C35320b.this.f85455d != null && C35320b.this.f85455d.size() > C35323c.this.getAdapterPosition() - 2 && C35323c.this.getAdapterPosition() > 1) {
                        C35319a aVar = (C35319a) C35320b.this.f85455d.get(C35323c.this.getAdapterPosition() - 2);
                        STOTypeListActivity.this.m104748F2(aVar.f85453c, aVar.f85452b);
                    }
                }
            }

            public C35323c(View view) {
                super(view);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setStroke(C32355x0.m95516g(C10319h.loan_stroke_width), C32355x0.m95514e(C10318g.bog_circular_image_container_grey_color, STOTypeListActivity.this));
                gradientDrawable.setColor(0);
                this.f85466g.setBackground(gradientDrawable);
                this.f85468i.setOnClickListener(new C35324a(C35320b.this));
            }
        }

        public C35320b() {
            this.f85456e = C32355x0.m95514e(C10318g.bog_circular_image_container_grey_color, STOTypeListActivity.this);
            this.f85457f = C32355x0.m95517h(C10319h.payments_circular_view_border_thickness, STOTypeListActivity.this);
        }

        public int getItemCount() {
            ArrayList arrayList = this.f85455d;
            return (arrayList == null ? 0 : arrayList.size()) + 3;
        }

        public int getItemViewType(int i) {
            if (i == 0) {
                return 30;
            }
            if (i == 1) {
                return 10;
            }
            return i == getItemCount() - 1 ? 40 : 20;
        }

        /* renamed from: k */
        public void mo86366k(ArrayList arrayList) {
            this.f85455d = arrayList;
            notifyDataSetChanged();
        }

        public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
            if (f0Var.getItemViewType() == 20) {
                C35323c cVar = (C35323c) f0Var;
                int i2 = i - 2;
                cVar.f85467h.setText(((C35319a) this.f85455d.get(i2)).f85452b);
                ImageView i3 = cVar.f85465f;
                Integer valueOf = Integer.valueOf(((C35319a) this.f85455d.get(i2)).f85451a);
                int i4 = C10320i.f28688dc;
                C32289b0.m95109u(i3, valueOf, Integer.valueOf(i4), Integer.valueOf(i4), true, true);
            }
        }

        public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 10) {
                return new C35322b(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.sto_type_list_header, viewGroup, false));
            }
            if (i == 20) {
                return new C35323c(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.payment_provider_list_item, viewGroup, false));
            }
            if (i == 30) {
                new C37107d(new BigDividerView(STOTypeListActivity.this));
            } else if (i != 40) {
                return null;
            }
            return new C35321a(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.payments_horizontal_recycler_view_shadow, viewGroup, false));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public void m104748F2(String str, String str2) {
        boolean z;
        if (str2 != null) {
            new C10478k.C10479a(str2).mo27184b(C36546y.m108282F());
        }
        if (str != null) {
            TransferForm.C34932I requestCode = TransferForm.startWith((Activity) this, "STO", "CREATE").setTransferForm(TransferForm.getTransferFormByDocType(str)).setRequestCode(10019);
            if ("B".equals(str) || "G".equals(str)) {
                z = true;
            } else {
                z = false;
            }
            requestCode.setWithinBank(z).start();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_sto_type_list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        this.f85449H = (RecyclerView) findViewById(C10322k.f28712Br);
        this.f85450I = new C35320b();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C35319a(getString(C10328q.transfer_title_type_between_accs), C10320i.ic_transfer_between_accs, "PAYMENT_OWN_ACCOUNTS"));
        arrayList.add(new C35319a(getString(C10328q.transfer_title_type_within_georgia), C10320i.ic_transfer_domestic, "PAYMENT_WITHIN_GEORGIA"));
        arrayList.add(new C35319a(getString(C10328q.transfer_title_type_budget), C10320i.ic_transfer_rs, "PAYMENT_WITHIN_BUDGET"));
        this.f85450I.mo86366k(arrayList);
        this.f85449H.setLayoutManager(linearLayoutManager);
        this.f85449H.setAdapter(this.f85450I);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            setResult(-1, new Intent());
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        MedalliaDigital.enableIntercept();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        MedalliaDigital.disableIntercept();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return getString(C10328q.header_text_automatics);
    }
}

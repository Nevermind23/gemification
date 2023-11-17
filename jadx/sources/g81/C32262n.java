package g81;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.collection.ArraySet;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import j81.C36762d;
import l81.C37107d;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;

/* renamed from: g81.n */
public class C32262n extends RecyclerView.C1736h {

    /* renamed from: d */
    private String[] f79580d;

    /* renamed from: e */
    private String[] f79581e = new String[2];
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ArraySet f79582f;

    /* renamed from: g */
    private Context f79583g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C36762d f79584h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f79585i;

    /* renamed from: g81.n$a */
    public final class C32263a extends C37107d implements View.OnClickListener {

        /* renamed from: f */
        ImageView f79586f = ((ImageView) mo90036h(C10322k.filtration_option_iv));

        /* renamed from: g */
        TextView f79587g = ((TextView) mo90036h(C10322k.filtration_option_tv));

        /* renamed from: h */
        View f79588h = mo90036h(C10322k.filtration_option_divider);

        public C32263a(View view) {
            super(view);
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            if (!C32262n.this.f79582f.contains(Integer.valueOf(getAdapterPosition()))) {
                C32262n.this.f79582f.add(Integer.valueOf(getAdapterPosition()));
            } else {
                C32262n.this.f79582f.remove(Integer.valueOf(getAdapterPosition()));
            }
            int adapterPosition = getAdapterPosition();
            if (C32262n.this.f79585i == 123) {
                adapterPosition += 3;
            }
            C32262n.this.f79584h.mo86282a(adapterPosition, C32262n.this.f79582f.contains(Integer.valueOf(getAdapterPosition())));
            C32262n.this.notifyItemChanged(getAdapterPosition());
        }
    }

    public C32262n(Context context, ArraySet arraySet, C36762d dVar) {
        String[] strArr = new String[5];
        this.f79580d = strArr;
        this.f79583g = context;
        this.f79584h = dVar;
        strArr[0] = context.getResources().getString(C10328q.map_filtration_single_service_center);
        this.f79580d[1] = context.getResources().getString(C10328q.map_filtration_express_service_centers);
        this.f79580d[2] = context.getResources().getString(C10328q.map_filtration_solo_service_center);
        this.f79580d[3] = context.getResources().getString(C10328q.map_filtration_hour_24);
        this.f79580d[4] = context.getResources().getString(C10328q.map_filtration_adapted);
        String[] strArr2 = this.f79581e;
        String[] strArr3 = this.f79580d;
        strArr2[0] = strArr3[3];
        strArr2[1] = strArr3[4];
        this.f79582f = arraySet;
    }

    public int getItemCount() {
        if (this.f79585i == 125) {
            return this.f79580d.length;
        }
        return 0;
    }

    /* renamed from: i */
    public void mo72773i() {
        this.f79582f.clear();
        notifyDataSetChanged();
    }

    /* renamed from: j */
    public void onBindViewHolder(C32263a aVar, int i) {
        String[] strArr;
        if (this.f79585i == 125) {
            strArr = this.f79580d;
        } else {
            strArr = this.f79581e;
        }
        if (this.f79582f.contains(Integer.valueOf(i))) {
            aVar.f79586f.setBackgroundResource(C10320i.ic_template_basket_selected);
        } else {
            aVar.f79586f.setBackgroundResource(C10320i.circle_image_background);
        }
        if (i == getItemCount() - 1 || i == 2) {
            aVar.f79588h.setVisibility(8);
        } else {
            aVar.f79588h.setVisibility(0);
        }
        if (i > 2) {
            aVar.f89287d.setBackgroundColor(C0767a.m2893c(this.f79583g, C10318g.f28623H0));
        } else {
            aVar.f89287d.setBackgroundColor(C0767a.m2893c(this.f79583g, C10318g.f28623H0));
        }
        aVar.f79587g.setText(strArr[i]);
    }

    /* renamed from: k */
    public C32263a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C32263a(LayoutInflater.from(this.f79583g).inflate(C10324m.filtration_option_item, viewGroup, false));
    }

    /* renamed from: l */
    public void mo72776l(int i) {
        this.f79585i = i;
        notifyDataSetChanged();
    }
}

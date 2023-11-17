package a91;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import l81.C37104a;
import l81.C37107d;
import p341ge.bog.mobilebank.model.DispatchType;
import p341ge.bog.mobilebank.model.TransferNomination;
import p341ge.bog.mobilebank.model.account.OtherAccountDetails;
import p341ge.bog.mobilebank.model.ddsto.STOPeriodType;
import p366bk.C10322k;
import p366bk.C10324m;
import r90.C27950a;

/* renamed from: a91.n */
public class C30905n extends RecyclerView.C1736h {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C37104a f77012d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f77013e;

    /* renamed from: f */
    private ArrayList f77014f;

    /* renamed from: g */
    private ArrayList f77015g;

    /* renamed from: h */
    private ArrayList f77016h;

    /* renamed from: i */
    private ArrayList f77017i;

    /* renamed from: j */
    private ArrayList f77018j;

    /* renamed from: a91.n$a */
    class C30906a extends C37107d implements View.OnClickListener {

        /* renamed from: f */
        TextView f77019f = ((TextView) mo90036h(C10322k.transfer_wizard_selector_textview));

        /* renamed from: g */
        TextView f77020g = ((TextView) mo90036h(C10322k.transfer_wizard_selector_description_textview));

        /* renamed from: h */
        View f77021h = mo90036h(C10322k.transfer_wizard_selector_divider);

        /* renamed from: i */
        ImageView f77022i = ((ImageView) mo90036h(C10322k.transfer_wizard_selector_tick_iv));

        public C30906a(View view) {
            super(view);
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            C30905n.this.f77013e = getAdapterPosition();
            if (C30905n.this.f77012d != null) {
                C30905n.this.f77012d.mo48298Z0(getAdapterPosition());
            }
            C30905n.this.notifyDataSetChanged();
        }
    }

    public C30905n(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.f77013e = i;
        this.f77014f = arrayList;
        this.f77015g = arrayList2;
        this.f77016h = arrayList3;
        this.f77017i = arrayList4;
        this.f77018j = arrayList5;
    }

    public int getItemCount() {
        ArrayList arrayList = this.f77014f;
        if (arrayList != null) {
            return arrayList.size();
        }
        ArrayList arrayList2 = this.f77015g;
        if (arrayList2 != null) {
            return arrayList2.size();
        }
        ArrayList arrayList3 = this.f77016h;
        if (arrayList3 != null) {
            return arrayList3.size();
        }
        ArrayList arrayList4 = this.f77017i;
        if (arrayList4 != null) {
            return arrayList4.size();
        }
        ArrayList arrayList5 = this.f77018j;
        if (arrayList5 != null) {
            return arrayList5.size();
        }
        return 0;
    }

    /* renamed from: h */
    public void onBindViewHolder(C30906a aVar, int i) {
        String str;
        aVar.f77020g.setVisibility(8);
        ArrayList arrayList = this.f77016h;
        if (arrayList == null || i >= arrayList.size()) {
            ArrayList arrayList2 = this.f77014f;
            if (arrayList2 == null || i >= arrayList2.size()) {
                ArrayList arrayList3 = this.f77015g;
                if (arrayList3 == null || i >= arrayList3.size()) {
                    ArrayList arrayList4 = this.f77017i;
                    if (arrayList4 == null || i >= arrayList4.size()) {
                        ArrayList arrayList5 = this.f77018j;
                        if (arrayList5 == null || i >= arrayList5.size()) {
                            str = "";
                        } else {
                            str = ((OtherAccountDetails) this.f77018j.get(i)).getTitle();
                        }
                    } else {
                        str = ((TransferNomination) this.f77017i.get(i)).nomination;
                    }
                } else {
                    str = C27950a.m86284a(((STOPeriodType) this.f77015g.get(i)).dictionaryKey);
                }
            } else {
                str = C27950a.m86284a(((DispatchType) this.f77014f.get(i)).getDictionaryKey());
                aVar.f77020g.setText(Html.fromHtml(C27950a.m86284a(((DispatchType) this.f77014f.get(i)).getTooltipDictionaryKey())));
                aVar.f77020g.setVisibility(0);
            }
        } else {
            str = (String) this.f77016h.get(i);
        }
        aVar.f77019f.setText(str);
        if (i == this.f77013e) {
            aVar.f77022i.setVisibility(0);
        } else {
            aVar.f77022i.setVisibility(8);
        }
        if (i == getItemCount() - 1) {
            aVar.f77021h.setVisibility(4);
        } else {
            aVar.f77021h.setVisibility(0);
        }
    }

    /* renamed from: i */
    public C30906a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C30906a(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.item_transfer_wizard_selector, viewGroup, false));
    }

    /* renamed from: j */
    public void mo71125j(C37104a aVar) {
        this.f77012d = aVar;
    }
}
